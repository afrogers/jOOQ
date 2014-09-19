/**
 * Copyright (c) 2009-2014, Data Geekery GmbH (http://www.datageekery.com)
 * All rights reserved.
 *
 * This work is dual-licensed
 * - under the Apache Software License 2.0 (the "ASL")
 * - under the jOOQ License and Maintenance Agreement (the "jOOQ License")
 * =============================================================================
 * You may choose which license applies to you:
 *
 * - If you're using this work with Open Source databases, you may choose
 *   either ASL or jOOQ License.
 * - If you're using this work with at least one commercial database, you must
 *   choose jOOQ License
 *
 * For more information, please visit http://www.jooq.org/licenses
 *
 * Apache Software License 2.0:
 * -----------------------------------------------------------------------------
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *  http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 * jOOQ License and Maintenance Agreement:
 * -----------------------------------------------------------------------------
 * Data Geekery grants the Customer the non-exclusive, timely limited and
 * non-transferable license to install and use the Software under the terms of
 * the jOOQ License and Maintenance Agreement.
 *
 * This library is distributed with a LIMITED WARRANTY. See the jOOQ License
 * and Maintenance Agreement for more details: http://www.jooq.org/licensing
 */
package org.jooq.util.voltdb;

import java.sql.DatabaseMetaData;
import java.sql.SQLException;

import org.jooq.Record;
import org.jooq.Result;
import org.jooq.impl.SQLDataType;
import org.jooq.util.AbstractRoutineDefinition;
import org.jooq.util.DataTypeDefinition;
import org.jooq.util.DefaultDataTypeDefinition;
import org.jooq.util.DefaultParameterDefinition;
import org.jooq.util.InOutDefinition;
import org.jooq.util.ParameterDefinition;
import org.jooq.util.SchemaDefinition;

public class VoltDBRoutineDefinition extends AbstractRoutineDefinition {

    public VoltDBRoutineDefinition(SchemaDefinition schema, String name, String comment) {
        super(schema, null, name, comment, null);
    }

    @Override
    protected void init0() throws SQLException {
        DatabaseMetaData dbmd = getConnection().getMetaData();

        Result<Record> parameters = create().fetch(
            dbmd.getProcedureColumns(null,null,getName(),null),
            SQLDataType.VARCHAR,
            SQLDataType.VARCHAR,
            SQLDataType.VARCHAR,
            SQLDataType.VARCHAR,
            SQLDataType.SMALLINT,
            SQLDataType.INTEGER,
            SQLDataType.VARCHAR,
            SQLDataType.INTEGER,
            SQLDataType.INTEGER,
            SQLDataType.SMALLINT,
            SQLDataType.SMALLINT,
            SQLDataType.SMALLINT,
            SQLDataType.VARCHAR,
            SQLDataType.VARCHAR,
            SQLDataType.INTEGER,
            SQLDataType.INTEGER,
            SQLDataType.INTEGER,
            SQLDataType.INTEGER,
            SQLDataType.VARCHAR,
            SQLDataType.VARCHAR
            );

        for (Record parameter: parameters) {

            DataTypeDefinition type = new DefaultDataTypeDefinition(
                getDatabase(),
                getSchema(),
                parameter.getValue(6, String.class),
                parameter.getValue(8, int.class),
                parameter.getValue(7, int.class),
                parameter.getValue(9, Integer.class),
                null,
                null
            );

            ParameterDefinition p = new DefaultParameterDefinition(
                this,
                parameter.getValue(3, String.class),
                parameter.getValue(17, int.class),
                type
            );

            addParameter(InOutDefinition.IN,p);
        }

//        addParameter(InOutDefinition.RETURN,
//            new DefaultParameterDefinition(this, "RETURN_VALUE", -1, SQLDataType.RESULT));
    }
}
