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

import java.math.BigDecimal;
import java.math.BigInteger;
import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;
import java.util.UUID;

import org.jooq.DataType;
import org.jooq.Record;
import org.jooq.Result;
import org.jooq.SQLDialect;
import org.jooq.impl.DefaultDataType;
import org.jooq.impl.SQLDataType;
import org.jooq.types.UByte;
import org.jooq.types.UInteger;
import org.jooq.types.ULong;
import org.jooq.types.UShort;

/**
 * Supported data types for the {@link SQLDialect#VOLTDB} dialect
 *
 * @see <a href="https://voltdb.com/docs/UsingVoltDB/ddlref_createtable.php#TabDatatypes">https://voltdb.com/docs/UsingVoltDB/ddlref_createtable.php#TabDatatypes</a>
 */
public class VoltDBDataType {
    // -------------------------------------------------------------------------
    // Default SQL data types and synonyms thereof
    // -------------------------------------------------------------------------
    public static final DataType<Byte>        TINYINT = new DefaultDataType<Byte>(SQLDialect.VOLTDB, SQLDataType.TINYINT, "tinyint");
    public static final DataType<Short>       SMALLINT              = new DefaultDataType<Short>(SQLDialect.VOLTDB, SQLDataType.SMALLINT, "smallint");
    public static final DataType<Integer>     INT                   = new DefaultDataType<Integer>(SQLDialect.VOLTDB, SQLDataType.INTEGER, "int");
    public static final DataType<Integer>     INTEGER               = new DefaultDataType<Integer>(SQLDialect.VOLTDB, SQLDataType.INTEGER, "integer");
    public static final DataType<Long>        BIGINT                = new DefaultDataType<Long>(SQLDialect.VOLTDB, SQLDataType.BIGINT, "bigint");
    public static final DataType<Double>      FLOAT                 = new DefaultDataType<Double>(SQLDialect.VOLTDB, SQLDataType.FLOAT, "float");
    public static final DataType<BigDecimal>  DECIMAL               = new DefaultDataType<BigDecimal>(SQLDialect.VOLTDB, SQLDataType.DECIMAL, "decimal");
    public static final DataType<BigDecimal>  NUMERIC               = new DefaultDataType<BigDecimal>(SQLDialect.VOLTDB, SQLDataType.NUMERIC, "numeric");
    public static final DataType<String>      VARCHAR               = new DefaultDataType<String>(SQLDialect.VOLTDB, SQLDataType.VARCHAR, "varchar", "varchar(32672)");
    public static final DataType<byte[]>      VARBINARY             = new DefaultDataType<byte[]>(SQLDialect.VOLTDB, SQLDataType.VARBINARY, "varbinary", "varbinary(32672)");
    public static final DataType<Timestamp>   TIMESTAMP             = new DefaultDataType<Timestamp>(SQLDialect.VOLTDB, SQLDataType.TIMESTAMP, "timestamp");

    // -------------------------------------------------------------------------
    // Compatibility types for supported SQLDialect.HSQLDB, SQLDataTypes
    // -------------------------------------------------------------------------

    public static final DataType<String>      __CHAR                  = new DefaultDataType<String>(SQLDialect.VOLTDB, SQLDataType.CHAR, "varchar", "varchar(32672)");
    public static final DataType<String>      __CHARACTER             = new DefaultDataType<String>(SQLDialect.VOLTDB, SQLDataType.CHAR, "varchar", "varchar(32672)");
    public static final DataType<String>      __CHARACTERVARYING      = new DefaultDataType<String>(SQLDialect.VOLTDB, SQLDataType.VARCHAR, "varchar", "varchar(32672)");
    protected static final DataType<String>   __NCHAR                 = new DefaultDataType<String>(SQLDialect.VOLTDB, SQLDataType.NCHAR, "varchar", "varchar(32672)");
    protected static final DataType<String>   __NVARCHAR              = new DefaultDataType<String>(SQLDialect.VOLTDB, SQLDataType.NVARCHAR, "varchar", "varchar(32672)");
    protected static final DataType<UByte>    __TINYINTUNSIGNED       = new DefaultDataType<UByte>(SQLDialect.VOLTDB, SQLDataType.TINYINTUNSIGNED, "smallint");
    protected static final DataType<UShort>   __SMALLINTUNSIGNED      = new DefaultDataType<UShort>(SQLDialect.VOLTDB, SQLDataType.SMALLINTUNSIGNED, "int");
    protected static final DataType<UInteger> __INTEGERUNSIGNED       = new DefaultDataType<UInteger>(SQLDialect.VOLTDB, SQLDataType.INTEGERUNSIGNED, "bigint");
    protected static final DataType<ULong>    __BIGINTUNSIGNED        = new DefaultDataType<ULong>(SQLDialect.VOLTDB, SQLDataType.BIGINTUNSIGNED, "decimal");
    public static final DataType<Double>      __DOUBLE                = new DefaultDataType<Double>(SQLDialect.VOLTDB, SQLDataType.DOUBLE, "decimal");
    public static final DataType<Double>      __DOUBLEPRECISION       = new DefaultDataType<Double>(SQLDialect.VOLTDB, SQLDataType.DOUBLE, "decimal");
    public static final DataType<Boolean>     __BOOLEAN               = new DefaultDataType<Boolean>(SQLDialect.VOLTDB, SQLDataType.BOOLEAN, "tinyint");
    public static final DataType<Boolean>     __BIT                   = new DefaultDataType<Boolean>(SQLDialect.VOLTDB, SQLDataType.BIT, "tinyint");
    public static final DataType<Date>        __DATE                  = new DefaultDataType<Date>(SQLDialect.VOLTDB, SQLDataType.DATE, "timestamp");
    public static final DataType<Time>        __TIME                  = new DefaultDataType<Time>(SQLDialect.VOLTDB, SQLDataType.TIME, "timestamp");
    public static final DataType<Timestamp>   __DATETIME              = new DefaultDataType<Timestamp>(SQLDialect.VOLTDB, SQLDataType.TIMESTAMP, "timestamp");
    public static final DataType<byte[]>      __BINARY                = new DefaultDataType<byte[]>(SQLDialect.VOLTDB, SQLDataType.BINARY, "varbinary", "varbinary(32672)");

    // -------------------------------------------------------------------------
    // Compatibility types for supported Java types
    // -------------------------------------------------------------------------

    protected static final DataType<BigInteger> __BIGINTEGER       = new DefaultDataType<BigInteger>(SQLDialect.VOLTDB, SQLDataType.DECIMAL_INTEGER, "decimal");
    protected static final DataType<UUID>       __UUID             = new DefaultDataType<UUID>(SQLDialect.VOLTDB, SQLDataType.UUID, "varchar", "varchar(36)");

 // -------------------------------------------------------------------------
    // Dialect-specific data types and synonyms thereof
    // -------------------------------------------------------------------------

    public static final DataType<Result<Record>> ROW               = new DefaultDataType<Result<Record>>(SQLDialect.VOLTDB, SQLDataType.RESULT, "row");
}
