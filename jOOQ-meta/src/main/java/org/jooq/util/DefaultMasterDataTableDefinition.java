/**
 * Copyright (c) 2009-2011, Lukas Eder, lukas.eder@gmail.com
 * All rights reserved.
 *
 * This software is licensed to you under the Apache License, Version 2.0
 * (the "License"); You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are met:
 *
 * . Redistributions of source code must retain the above copyright notice, this
 *   list of conditions and the following disclaimer.
 *
 * . Redistributions in binary form must reproduce the above copyright notice,
 *   this list of conditions and the following disclaimer in the documentation
 *   and/or other materials provided with the distribution.
 *
 * . Neither the name "jOOQ" nor the names of its contributors may be
 *   used to endorse or promote products derived from this software without
 *   specific prior written permission.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS"
 * AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE
 * IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE
 * ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT OWNER OR CONTRIBUTORS BE
 * LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR
 * CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF
 * SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS
 * INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN
 * CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE)
 * ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE
 * POSSIBILITY OF SUCH DAMAGE.
 */
package org.jooq.util;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.jooq.Record;
import org.jooq.Table;
import org.jooq.impl.JooqLogger;

public class DefaultMasterDataTableDefinition extends AbstractDefinition implements MasterDataTableDefinition {

    private static final JooqLogger log = JooqLogger.getLogger(DefaultMasterDataTableDefinition.class);

    private final TableDefinition   delegate;
    private List<Record>            data;

    public DefaultMasterDataTableDefinition(TableDefinition delegate) {
        super(delegate.getDatabase(), delegate.getName(), delegate.getComment());

        this.delegate = delegate;
    }

    @Override
    public ColumnDefinition getPrimaryKeyColumn() {
        for (ColumnDefinition column : getColumns()) {
            if (getDatabase().getRelations().getPrimaryKey(column) != null) {
                return column;
            }
        }

        return null;
    }

    @Override
    public ColumnDefinition getLiteralColumn() {
        String columnName = getDatabase().getProperty("generator.generate.master-data-table-literal." + getName());
        return getColumn(columnName);
    }

    @Override
    public ColumnDefinition getDescriptionColumn() {
        String columnName = getDatabase().getProperty("generator.generate.master-data-table-description." + getName());
        return getColumn(columnName);
    }

    @Override
    public List<Record> getData() {
        if (data == null) {
            data = new ArrayList<Record>();

            try {
                String description = getDescriptionColumn() != null
                    ? getDescriptionColumn().getName()
                    : "1";

                data = create().select(
                        create().plainSQLField(getPrimaryKeyColumn().getName(), Integer.class),
                        create().plainSQLField(getLiteralColumn().getName(), String.class),
                        create().plainSQLField(description, String.class))
                    .from(delegate.getTable())
                    .orderBy(create().plainSQLField(getPrimaryKeyColumn().getName()))
                    .fetch()
                    .getRecords();
            }
            catch (SQLException e) {
                log.error("Error while initialising master data", e);
            }
        }

        return data;
    }

    @Override
    public UniqueKeyDefinition getMainUniqueKey() {
        return delegate.getMainUniqueKey();
    }

    @Override
    public List<UniqueKeyDefinition> getUniqueKeys() {
        return delegate.getUniqueKeys();
    }

    @Override
    public List<ForeignKeyDefinition> getForeignKeys() {
        return delegate.getForeignKeys();
    }

    @Override
    public ColumnDefinition getIdentity() {
        return delegate.getIdentity();
    }

    @Override
    public List<ColumnDefinition> getColumns() {
        return delegate.getColumns();
    }

    @Override
    public ColumnDefinition getColumn(String columnName) {
        return delegate.getColumn(columnName);
    }

    @Override
    public ColumnDefinition getColumn(int columnIndex) {
        return delegate.getColumn(columnIndex);
    }

    @Override
    public Table<Record> getTable() {
        return delegate.getTable();
    }
}
