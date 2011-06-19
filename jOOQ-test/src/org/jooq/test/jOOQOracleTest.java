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

package org.jooq.test;

import static junit.framework.Assert.assertEquals;
import static org.jooq.test.oracle.generatedclasses.tables.VAuthor.V_AUTHOR;
import static org.jooq.test.oracle.generatedclasses.tables.VBook.V_BOOK;

import java.sql.Date;
import java.util.Arrays;

import org.jooq.ArrayRecord;
import org.jooq.DataType;
import org.jooq.Field;
import org.jooq.Record;
import org.jooq.Result;
import org.jooq.SchemaMapping;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UDTRecord;
import org.jooq.UpdatableTable;
import org.jooq.test.oracle.generatedclasses.Functions;
import org.jooq.test.oracle.generatedclasses.Procedures;
import org.jooq.test.oracle.generatedclasses.Sequences;
import org.jooq.test.oracle.generatedclasses.TestFactory;
import org.jooq.test.oracle.generatedclasses.functions.F377;
import org.jooq.test.oracle.generatedclasses.packages.Library;
import org.jooq.test.oracle.generatedclasses.tables.TArrays;
import org.jooq.test.oracle.generatedclasses.tables.TAuthor;
import org.jooq.test.oracle.generatedclasses.tables.TBook;
import org.jooq.test.oracle.generatedclasses.tables.TBookStore;
import org.jooq.test.oracle.generatedclasses.tables.VIncomplete;
import org.jooq.test.oracle.generatedclasses.tables.VLibrary;
import org.jooq.test.oracle.generatedclasses.tables.records.TArraysRecord;
import org.jooq.test.oracle.generatedclasses.tables.records.TAuthorRecord;
import org.jooq.test.oracle.generatedclasses.tables.records.TBookRecord;
import org.jooq.test.oracle.generatedclasses.tables.records.TBookStoreRecord;
import org.jooq.test.oracle.generatedclasses.tables.records.VIncompleteRecord;
import org.jooq.test.oracle.generatedclasses.tables.records.VLibraryRecord;
import org.jooq.test.oracle.generatedclasses.udt.UAddressType;
import org.jooq.test.oracle.generatedclasses.udt.UStreetType;
import org.jooq.util.oracle.OracleDataType;
import org.jooq.util.oracle.OracleFactory;
import org.junit.Test;


/**
 * @author Lukas Eder
 */
public class jOOQOracleTest extends jOOQAbstractTest<
        TAuthorRecord,
        TBookRecord,
        TBookStoreRecord,
        VLibraryRecord,
        TArraysRecord> {

    static {
        // [#624] Incomplete or erroneous artefacts must be generated too. This
        // won't compile, if there is anything wrong with code generation of
        // incomplete or erroneous artefacts

        try {
            Class.forName(VIncomplete.class.getName());
            Class.forName(VIncompleteRecord.class.getName());
            Class.forName(F377.class.getName());
        }
        catch (Exception e) {
            throw new Error(e);
        }
    }

    @Override
    protected TestFactory create(SchemaMapping mapping) {
        return new TestFactory(getConnection(), mapping);
    }

    @Override
    protected UpdatableTable<TAuthorRecord> TAuthor() {
        return TAuthor.T_AUTHOR;
    }

    @Override
    protected TableField<TAuthorRecord, String> TAuthor_LAST_NAME() {
        return TAuthor.LAST_NAME;
    }

    @Override
    protected TableField<TAuthorRecord, String> TAuthor_FIRST_NAME() {
        return TAuthor.FIRST_NAME;
    }

    @Override
    protected TableField<TAuthorRecord, Date> TAuthor_DATE_OF_BIRTH() {
        return TAuthor.DATE_OF_BIRTH;
    }

    @Override
    protected TableField<TAuthorRecord, Integer> TAuthor_YEAR_OF_BIRTH() {
        return TAuthor.YEAR_OF_BIRTH;
    }

    @Override
    protected TableField<TAuthorRecord, Integer> TAuthor_ID() {
        return TAuthor.ID;
    }

    @Override
    protected TableField<TAuthorRecord, ? extends UDTRecord<?>> TAuthor_ADDRESS() {
        return TAuthor.ADDRESS;
    }

    @Override
    protected UpdatableTable<TBookRecord> TBook() {
        return TBook.T_BOOK;
    }

    @Override
    protected TableField<TBookRecord, Integer> TBook_ID() {
        return TBook.ID;
    }

    @Override
    protected TableField<TBookRecord, Integer> TBook_AUTHOR_ID() {
        return TBook.AUTHOR_ID;
    }

    @Override
    protected TableField<TBookRecord, String> TBook_TITLE() {
        return TBook.TITLE;
    }

    @Override
    protected UpdatableTable<TBookStoreRecord> TBookStore() {
        return TBookStore.T_BOOK_STORE;
    }

    @Override
    protected TableField<TBookStoreRecord, String> TBookStore_NAME() {
        return TBookStore.NAME;
    }

    @Override
    protected Table<TArraysRecord> TArrays() {
        return TArrays.T_ARRAYS;
    }

    @Override
    protected TableField<TArraysRecord, Integer> TArrays_ID() {
        return TArrays.ID;
    }

    @Override
    protected TableField<TArraysRecord, String[]> TArrays_STRING() {
        return null;
    }

    @Override
    protected TableField<TArraysRecord, Integer[]> TArrays_NUMBER() {
        return null;
    }

    @Override
    protected TableField<TArraysRecord, Date[]> TArrays_DATE() {
        return null;
    }

    @Override
    protected TableField<TArraysRecord, ? extends UDTRecord<?>[]> TArrays_UDT() {
        return null;
    }

    @Override
    protected TableField<TArraysRecord, ? extends ArrayRecord<String>> TArrays_STRING_R() {
        return TArrays.STRING_ARRAY;
    }

    @Override
    protected TableField<TArraysRecord, ? extends ArrayRecord<Integer>> TArrays_NUMBER_R() {
        return TArrays.NUMBER_ARRAY;
    }

    @Override
    protected TableField<TArraysRecord, ? extends ArrayRecord<Date>> TArrays_DATE_R() {
        return TArrays.DATE_ARRAY;
    }

    @Override
    protected TableField<TArraysRecord, ? extends ArrayRecord<Long>> TArrays_NUMBER_LONG_R() {
        return TArrays.NUMBER_LONG_ARRAY;
    }

    @Override
    protected TableField<TBookRecord, ? extends Enum<?>> TBook_LANGUAGE_ID() {
        return TBook.LANGUAGE_ID;
    }

    @Override
    protected TableField<TBookRecord, Integer> TBook_PUBLISHED_IN() {
        return TBook.PUBLISHED_IN;
    }

    @Override
    protected TableField<TBookRecord, String> TBook_CONTENT_TEXT() {
        return TBook.CONTENT_TEXT;
    }

    @Override
    protected TableField<TBookRecord, byte[]> TBook_CONTENT_PDF() {
        return TBook.CONTENT_PDF;
    }

    @Override
    protected TableField<TBookRecord, ? extends Enum<?>> TBook_STATUS() {
        return null;
    }

    @Override
    protected Table<VLibraryRecord> VLibrary() {
        return VLibrary.V_LIBRARY;
    }

    @Override
    protected TableField<VLibraryRecord, String> VLibrary_TITLE() {
        return VLibrary.TITLE;
    }

    @Override
    protected TableField<VLibraryRecord, String> VLibrary_AUTHOR() {
        return VLibrary.AUTHOR;
    }

    @Override
    protected Table<?> VAuthor() {
        return V_AUTHOR;
    }

    @Override
    protected Table<?> VBook() {
        return V_BOOK;
    }

    @Override
    protected Field<? extends Number> FAuthorExistsField(String authorName) {
        return Functions.fAuthorExists(authorName);
    }

    @Override
    protected Field<? extends Number> FOneField() {
        return Functions.fOne();
    }

    @Override
    protected Field<? extends Number> FNumberField(Number n) {
        return Functions.fNumber(n);
    }

    @Override
    protected Field<? extends Number> FNumberField(Field<? extends Number> n) {
        return Functions.fNumber(n);
    }

    @Override
    protected Field<? extends Number> F317Field(Number n1, Number n2, Number n3, Number n4) {
        return Functions.f317(n1, n2, n3, n4);
    }

    @Override
    protected Field<? extends Number> F317Field(Field<? extends Number> n1, Field<? extends Number> n2,
        Field<? extends Number> n3, Field<? extends Number> n4) {
        return Functions.f317(n1, n2, n3, n4);
    }

    @Override
    protected Class<? extends UDTRecord<?>> cUAddressType() {
        return UAddressType.U_ADDRESS_TYPE.getRecordType();
    }

    @Override
    protected Class<? extends UDTRecord<?>> cUStreetType() {
        return UStreetType.U_STREET_TYPE.getRecordType();
    }

    @Override
    protected Class<?> cProcedures() {
        return Procedures.class;
    }

    @Override
    protected boolean supportsOUTParameters() {
        return true;
    }

    @Override
    protected boolean supportsReferences() {
        return true;
    }

    @Override
    protected Class<?> cFunctions() {
        return Functions.class;
    }

    @Override
    protected Class<?> cLibrary() {
        return Library.class;
    }

    @Override
    protected Class<?> cSequences() {
        return Sequences.class;
    }

    @Override
    protected DataType<?>[] getCastableDataTypes() {
        return new DataType<?>[] {
            OracleDataType.CHAR,
            OracleDataType.DATE,
            OracleDataType.DEC,
            OracleDataType.DECIMAL,
            OracleDataType.FLOAT,
            OracleDataType.INT,
            OracleDataType.INTEGER,
            OracleDataType.NCHAR,
            OracleDataType.NUMBER,
            OracleDataType.NUMERIC,
            OracleDataType.NVARCHAR,
            OracleDataType.NVARCHAR2,
            OracleDataType.REAL,
            OracleDataType.SMALLINT,
            OracleDataType.TIMESTAMP,
            OracleDataType.VARCHAR,
            OracleDataType.VARCHAR2,
        };
    }


    // -------------------------------------------------------------------------
    // Oracle-specific tests
    // -------------------------------------------------------------------------

    @Test
    public void testOracleConnectBy() throws Exception {
        OracleFactory ora = new OracleFactory(create().getConnection(), create().getSchemaMapping());

        assertEquals(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9),
            ora.select(ora.rownum())
               .connectBy(ora.level().lessThan(10))
               .fetch(ora.rownum()));
        assertEquals(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9),
            ora.select(ora.rownum())
               .connectByNoCycle(ora.level().lessThan(10))
               .fetch(ora.rownum()));

        assertEquals(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9),
            ora.select(ora.rownum())
               .connectBy(ora.level().lessThan(10))
               .and("1 = ?", 1)
               .startWith("? = ?", 1, 1)
               .fetch(ora.rownum()));
        assertEquals(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9),
            ora.select(ora.rownum())
               .connectByNoCycle(ora.level().lessThan(10))
               .and("1 = ?", 1)
               .startWith("? = ?", 1, 1)
               .fetch(ora.rownum()));

        Result<Record> result =
        ora.select(ora.rownum(), ora.connectByIsCycle(), ora.connectByIsLeaf())
           .connectByNoCycle(ora.level().lessThan(4))
           .fetch();

        assertEquals(Integer.valueOf(1), result.getValue(0, ora.rownum()));
        assertEquals(Integer.valueOf(2), result.getValue(1, ora.rownum()));
        assertEquals(Integer.valueOf(3), result.getValue(2, ora.rownum()));

        assertEquals(Boolean.FALSE, result.getValue(0, ora.connectByIsLeaf()));
        assertEquals(Boolean.FALSE, result.getValue(1, ora.connectByIsLeaf()));
        assertEquals(Boolean.TRUE, result.getValue(2, ora.connectByIsLeaf()));

        assertEquals(Boolean.FALSE, result.getValue(0, ora.connectByIsCycle()));
        assertEquals(Boolean.FALSE, result.getValue(1, ora.connectByIsCycle()));
        assertEquals(Boolean.FALSE, result.getValue(2, ora.connectByIsCycle()));
    }
}
