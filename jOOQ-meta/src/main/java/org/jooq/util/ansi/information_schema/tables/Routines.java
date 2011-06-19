/**
 * This class is generated by jOOQ
 */
package org.jooq.util.ansi.information_schema.tables;


import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.TableField;
import org.jooq.impl.SQLDataType;
import org.jooq.impl.TableFieldImpl;
import org.jooq.impl.TableImpl;
import org.jooq.util.ansi.information_schema.InformationSchema;
import org.jooq.util.ansi.information_schema.tables.records.RoutinesRecord;


/**
 * This class is generated by jOOQ.
 */
@Generated(value    = "http://jooq.sourceforge.net",
           comments = "This class is generated by jOOQ")
public class Routines extends TableImpl<RoutinesRecord> {

	private static final long serialVersionUID = -1497596984;

	/**
	 * The singleton instance of ROUTINES
	 */
	public static final Routines ROUTINES = new Routines();

	/**
	 * The class holding records for this type
	 */
	private static final Class<RoutinesRecord> __RECORD_TYPE = RoutinesRecord.class;

	/**
	 * The class holding records for this type
	 */
	@Override
	public Class<RoutinesRecord> getRecordType() {
		return __RECORD_TYPE;
	}

	/**
	 * An uncommented item
	 */
	public static final TableField<RoutinesRecord, String> SPECIFIC_CATALOG = new TableFieldImpl<RoutinesRecord, String>("SPECIFIC_CATALOG", SQLDataType.VARCHAR, ROUTINES);

	/**
	 * An uncommented item
	 */
	public static final TableField<RoutinesRecord, String> SPECIFIC_SCHEMA = new TableFieldImpl<RoutinesRecord, String>("SPECIFIC_SCHEMA", SQLDataType.VARCHAR, ROUTINES);

	/**
	 * An uncommented item
	 */
	public static final TableField<RoutinesRecord, String> SPECIFIC_NAME = new TableFieldImpl<RoutinesRecord, String>("SPECIFIC_NAME", SQLDataType.VARCHAR, ROUTINES);

	/**
	 * An uncommented item
	 */
	public static final TableField<RoutinesRecord, String> ROUTINE_CATALOG = new TableFieldImpl<RoutinesRecord, String>("ROUTINE_CATALOG", SQLDataType.VARCHAR, ROUTINES);

	/**
	 * An uncommented item
	 */
	public static final TableField<RoutinesRecord, String> ROUTINE_SCHEMA = new TableFieldImpl<RoutinesRecord, String>("ROUTINE_SCHEMA", SQLDataType.VARCHAR, ROUTINES);

	/**
	 * An uncommented item
	 */
	public static final TableField<RoutinesRecord, String> ROUTINE_NAME = new TableFieldImpl<RoutinesRecord, String>("ROUTINE_NAME", SQLDataType.VARCHAR, ROUTINES);

	/**
	 * An uncommented item
	 */
	public static final TableField<RoutinesRecord, String> ROUTINE_TYPE = new TableFieldImpl<RoutinesRecord, String>("ROUTINE_TYPE", SQLDataType.VARCHAR, ROUTINES);

	/**
	 * An uncommented item
	 */
	public static final TableField<RoutinesRecord, String> MODULE_CATALOG = new TableFieldImpl<RoutinesRecord, String>("MODULE_CATALOG", SQLDataType.VARCHAR, ROUTINES);

	/**
	 * An uncommented item
	 */
	public static final TableField<RoutinesRecord, String> MODULE_SCHEMA = new TableFieldImpl<RoutinesRecord, String>("MODULE_SCHEMA", SQLDataType.VARCHAR, ROUTINES);

	/**
	 * An uncommented item
	 */
	public static final TableField<RoutinesRecord, String> MODULE_NAME = new TableFieldImpl<RoutinesRecord, String>("MODULE_NAME", SQLDataType.VARCHAR, ROUTINES);

	/**
	 * An uncommented item
	 */
	public static final TableField<RoutinesRecord, String> UDT_CATALOG = new TableFieldImpl<RoutinesRecord, String>("UDT_CATALOG", SQLDataType.VARCHAR, ROUTINES);

	/**
	 * An uncommented item
	 */
	public static final TableField<RoutinesRecord, String> UDT_SCHEMA = new TableFieldImpl<RoutinesRecord, String>("UDT_SCHEMA", SQLDataType.VARCHAR, ROUTINES);

	/**
	 * An uncommented item
	 */
	public static final TableField<RoutinesRecord, String> UDT_NAME = new TableFieldImpl<RoutinesRecord, String>("UDT_NAME", SQLDataType.VARCHAR, ROUTINES);

	/**
	 * An uncommented item
	 */
	public static final TableField<RoutinesRecord, String> DATA_TYPE = new TableFieldImpl<RoutinesRecord, String>("DATA_TYPE", SQLDataType.VARCHAR, ROUTINES);

	/**
	 * An uncommented item
	 */
	public static final TableField<RoutinesRecord, Long> CHARACTER_MAXIMUM_LENGTH = new TableFieldImpl<RoutinesRecord, Long>("CHARACTER_MAXIMUM_LENGTH", SQLDataType.BIGINT, ROUTINES);

	/**
	 * An uncommented item
	 */
	public static final TableField<RoutinesRecord, Long> CHARACTER_OCTET_LENGTH = new TableFieldImpl<RoutinesRecord, Long>("CHARACTER_OCTET_LENGTH", SQLDataType.BIGINT, ROUTINES);

	/**
	 * An uncommented item
	 */
	public static final TableField<RoutinesRecord, String> CHARACTER_SET_CATALOG = new TableFieldImpl<RoutinesRecord, String>("CHARACTER_SET_CATALOG", SQLDataType.VARCHAR, ROUTINES);

	/**
	 * An uncommented item
	 */
	public static final TableField<RoutinesRecord, String> CHARACTER_SET_SCHEMA = new TableFieldImpl<RoutinesRecord, String>("CHARACTER_SET_SCHEMA", SQLDataType.VARCHAR, ROUTINES);

	/**
	 * An uncommented item
	 */
	public static final TableField<RoutinesRecord, String> CHARACTER_SET_NAME = new TableFieldImpl<RoutinesRecord, String>("CHARACTER_SET_NAME", SQLDataType.VARCHAR, ROUTINES);

	/**
	 * An uncommented item
	 */
	public static final TableField<RoutinesRecord, String> COLLATION_CATALOG = new TableFieldImpl<RoutinesRecord, String>("COLLATION_CATALOG", SQLDataType.VARCHAR, ROUTINES);

	/**
	 * An uncommented item
	 */
	public static final TableField<RoutinesRecord, String> COLLATION_SCHEMA = new TableFieldImpl<RoutinesRecord, String>("COLLATION_SCHEMA", SQLDataType.VARCHAR, ROUTINES);

	/**
	 * An uncommented item
	 */
	public static final TableField<RoutinesRecord, String> COLLATION_NAME = new TableFieldImpl<RoutinesRecord, String>("COLLATION_NAME", SQLDataType.VARCHAR, ROUTINES);

	/**
	 * An uncommented item
	 */
	public static final TableField<RoutinesRecord, Long> NUMERIC_PRECISION = new TableFieldImpl<RoutinesRecord, Long>("NUMERIC_PRECISION", SQLDataType.BIGINT, ROUTINES);

	/**
	 * An uncommented item
	 */
	public static final TableField<RoutinesRecord, Long> NUMERIC_PRECISION_RADIX = new TableFieldImpl<RoutinesRecord, Long>("NUMERIC_PRECISION_RADIX", SQLDataType.BIGINT, ROUTINES);

	/**
	 * An uncommented item
	 */
	public static final TableField<RoutinesRecord, Long> NUMERIC_SCALE = new TableFieldImpl<RoutinesRecord, Long>("NUMERIC_SCALE", SQLDataType.BIGINT, ROUTINES);

	/**
	 * An uncommented item
	 */
	public static final TableField<RoutinesRecord, Long> DATETIME_PRECISION = new TableFieldImpl<RoutinesRecord, Long>("DATETIME_PRECISION", SQLDataType.BIGINT, ROUTINES);

	/**
	 * An uncommented item
	 */
	public static final TableField<RoutinesRecord, String> INTERVAL_TYPE = new TableFieldImpl<RoutinesRecord, String>("INTERVAL_TYPE", SQLDataType.VARCHAR, ROUTINES);

	/**
	 * An uncommented item
	 */
	public static final TableField<RoutinesRecord, Long> INTERVAL_PRECISION = new TableFieldImpl<RoutinesRecord, Long>("INTERVAL_PRECISION", SQLDataType.BIGINT, ROUTINES);

	/**
	 * An uncommented item
	 */
	public static final TableField<RoutinesRecord, String> TYPE_UDT_CATALOG = new TableFieldImpl<RoutinesRecord, String>("TYPE_UDT_CATALOG", SQLDataType.VARCHAR, ROUTINES);

	/**
	 * An uncommented item
	 */
	public static final TableField<RoutinesRecord, String> TYPE_UDT_SCHEMA = new TableFieldImpl<RoutinesRecord, String>("TYPE_UDT_SCHEMA", SQLDataType.VARCHAR, ROUTINES);

	/**
	 * An uncommented item
	 */
	public static final TableField<RoutinesRecord, String> TYPE_UDT_NAME = new TableFieldImpl<RoutinesRecord, String>("TYPE_UDT_NAME", SQLDataType.VARCHAR, ROUTINES);

	/**
	 * An uncommented item
	 */
	public static final TableField<RoutinesRecord, String> SCOPE_CATALOG = new TableFieldImpl<RoutinesRecord, String>("SCOPE_CATALOG", SQLDataType.VARCHAR, ROUTINES);

	/**
	 * An uncommented item
	 */
	public static final TableField<RoutinesRecord, String> SCOPE_SCHEMA = new TableFieldImpl<RoutinesRecord, String>("SCOPE_SCHEMA", SQLDataType.VARCHAR, ROUTINES);

	/**
	 * An uncommented item
	 */
	public static final TableField<RoutinesRecord, String> SCOPE_NAME = new TableFieldImpl<RoutinesRecord, String>("SCOPE_NAME", SQLDataType.VARCHAR, ROUTINES);

	/**
	 * An uncommented item
	 */
	public static final TableField<RoutinesRecord, Long> MAXIMUM_CARDINALITY = new TableFieldImpl<RoutinesRecord, Long>("MAXIMUM_CARDINALITY", SQLDataType.BIGINT, ROUTINES);

	/**
	 * An uncommented item
	 */
	public static final TableField<RoutinesRecord, String> DTD_IDENTIFIER = new TableFieldImpl<RoutinesRecord, String>("DTD_IDENTIFIER", SQLDataType.VARCHAR, ROUTINES);

	/**
	 * An uncommented item
	 */
	public static final TableField<RoutinesRecord, String> ROUTINE_BODY = new TableFieldImpl<RoutinesRecord, String>("ROUTINE_BODY", SQLDataType.VARCHAR, ROUTINES);

	/**
	 * An uncommented item
	 */
	public static final TableField<RoutinesRecord, String> ROUTINE_DEFINITION = new TableFieldImpl<RoutinesRecord, String>("ROUTINE_DEFINITION", SQLDataType.VARCHAR, ROUTINES);

	/**
	 * An uncommented item
	 */
	public static final TableField<RoutinesRecord, String> EXTERNAL_NAME = new TableFieldImpl<RoutinesRecord, String>("EXTERNAL_NAME", SQLDataType.VARCHAR, ROUTINES);

	/**
	 * An uncommented item
	 */
	public static final TableField<RoutinesRecord, String> EXTERNAL_LANGUAGE = new TableFieldImpl<RoutinesRecord, String>("EXTERNAL_LANGUAGE", SQLDataType.VARCHAR, ROUTINES);

	/**
	 * An uncommented item
	 */
	public static final TableField<RoutinesRecord, String> PARAMETER_STYLE = new TableFieldImpl<RoutinesRecord, String>("PARAMETER_STYLE", SQLDataType.VARCHAR, ROUTINES);

	/**
	 * An uncommented item
	 */
	public static final TableField<RoutinesRecord, String> IS_DETERMINISTIC = new TableFieldImpl<RoutinesRecord, String>("IS_DETERMINISTIC", SQLDataType.VARCHAR, ROUTINES);

	/**
	 * An uncommented item
	 */
	public static final TableField<RoutinesRecord, String> SQL_DATA_ACCESS = new TableFieldImpl<RoutinesRecord, String>("SQL_DATA_ACCESS", SQLDataType.VARCHAR, ROUTINES);

	/**
	 * An uncommented item
	 */
	public static final TableField<RoutinesRecord, String> IS_NULL_CALL = new TableFieldImpl<RoutinesRecord, String>("IS_NULL_CALL", SQLDataType.VARCHAR, ROUTINES);

	/**
	 * An uncommented item
	 */
	public static final TableField<RoutinesRecord, String> SQL_PATH = new TableFieldImpl<RoutinesRecord, String>("SQL_PATH", SQLDataType.VARCHAR, ROUTINES);

	/**
	 * An uncommented item
	 */
	public static final TableField<RoutinesRecord, String> SCHEMA_LEVEL_ROUTINE = new TableFieldImpl<RoutinesRecord, String>("SCHEMA_LEVEL_ROUTINE", SQLDataType.VARCHAR, ROUTINES);

	/**
	 * An uncommented item
	 */
	public static final TableField<RoutinesRecord, Long> MAX_DYNAMIC_RESULT_SETS = new TableFieldImpl<RoutinesRecord, Long>("MAX_DYNAMIC_RESULT_SETS", SQLDataType.BIGINT, ROUTINES);

	/**
	 * An uncommented item
	 */
	public static final TableField<RoutinesRecord, String> IS_USER_DEFINED_CAST = new TableFieldImpl<RoutinesRecord, String>("IS_USER_DEFINED_CAST", SQLDataType.VARCHAR, ROUTINES);

	/**
	 * An uncommented item
	 */
	public static final TableField<RoutinesRecord, String> IS_IMPLICITLY_INVOCABLE = new TableFieldImpl<RoutinesRecord, String>("IS_IMPLICITLY_INVOCABLE", SQLDataType.VARCHAR, ROUTINES);

	/**
	 * An uncommented item
	 */
	public static final TableField<RoutinesRecord, String> SECURITY_TYPE = new TableFieldImpl<RoutinesRecord, String>("SECURITY_TYPE", SQLDataType.VARCHAR, ROUTINES);

	/**
	 * An uncommented item
	 */
	public static final TableField<RoutinesRecord, String> TO_SQL_SPECIFIC_CATALOG = new TableFieldImpl<RoutinesRecord, String>("TO_SQL_SPECIFIC_CATALOG", SQLDataType.VARCHAR, ROUTINES);

	/**
	 * An uncommented item
	 */
	public static final TableField<RoutinesRecord, String> TO_SQL_SPECIFIC_SCHEMA = new TableFieldImpl<RoutinesRecord, String>("TO_SQL_SPECIFIC_SCHEMA", SQLDataType.VARCHAR, ROUTINES);

	/**
	 * An uncommented item
	 */
	public static final TableField<RoutinesRecord, String> TO_SQL_SPECIFIC_NAME = new TableFieldImpl<RoutinesRecord, String>("TO_SQL_SPECIFIC_NAME", SQLDataType.VARCHAR, ROUTINES);

	/**
	 * An uncommented item
	 */
	public static final TableField<RoutinesRecord, String> AS_LOCATOR = new TableFieldImpl<RoutinesRecord, String>("AS_LOCATOR", SQLDataType.VARCHAR, ROUTINES);

	/**
	 * An uncommented item
	 */
	public static final TableField<RoutinesRecord, Timestamp> CREATED = new TableFieldImpl<RoutinesRecord, Timestamp>("CREATED", SQLDataType.TIMESTAMP, ROUTINES);

	/**
	 * An uncommented item
	 */
	public static final TableField<RoutinesRecord, Timestamp> LAST_ALTERED = new TableFieldImpl<RoutinesRecord, Timestamp>("LAST_ALTERED", SQLDataType.TIMESTAMP, ROUTINES);

	/**
	 * An uncommented item
	 */
	public static final TableField<RoutinesRecord, String> NEW_SAVEPOINT_LEVEL = new TableFieldImpl<RoutinesRecord, String>("NEW_SAVEPOINT_LEVEL", SQLDataType.VARCHAR, ROUTINES);

	/**
	 * An uncommented item
	 */
	public static final TableField<RoutinesRecord, String> IS_UDT_DEPENDENT = new TableFieldImpl<RoutinesRecord, String>("IS_UDT_DEPENDENT", SQLDataType.VARCHAR, ROUTINES);

	/**
	 * An uncommented item
	 */
	public static final TableField<RoutinesRecord, String> RESULT_CAST_FROM_DATA_TYPE = new TableFieldImpl<RoutinesRecord, String>("RESULT_CAST_FROM_DATA_TYPE", SQLDataType.VARCHAR, ROUTINES);

	/**
	 * An uncommented item
	 */
	public static final TableField<RoutinesRecord, String> RESULT_CAST_AS_LOCATOR = new TableFieldImpl<RoutinesRecord, String>("RESULT_CAST_AS_LOCATOR", SQLDataType.VARCHAR, ROUTINES);

	/**
	 * An uncommented item
	 */
	public static final TableField<RoutinesRecord, Long> RESULT_CAST_CHAR_MAX_LENGTH = new TableFieldImpl<RoutinesRecord, Long>("RESULT_CAST_CHAR_MAX_LENGTH", SQLDataType.BIGINT, ROUTINES);

	/**
	 * An uncommented item
	 */
	public static final TableField<RoutinesRecord, Long> RESULT_CAST_CHAR_OCTET_LENGTH = new TableFieldImpl<RoutinesRecord, Long>("RESULT_CAST_CHAR_OCTET_LENGTH", SQLDataType.BIGINT, ROUTINES);

	/**
	 * An uncommented item
	 */
	public static final TableField<RoutinesRecord, String> RESULT_CAST_CHAR_SET_CATALOG = new TableFieldImpl<RoutinesRecord, String>("RESULT_CAST_CHAR_SET_CATALOG", SQLDataType.VARCHAR, ROUTINES);

	/**
	 * An uncommented item
	 */
	public static final TableField<RoutinesRecord, String> RESULT_CAST_CHAR_SET_SCHEMA = new TableFieldImpl<RoutinesRecord, String>("RESULT_CAST_CHAR_SET_SCHEMA", SQLDataType.VARCHAR, ROUTINES);

	/**
	 * An uncommented item
	 */
	public static final TableField<RoutinesRecord, String> RESULT_CAST_CHARACTER_SET_NAME = new TableFieldImpl<RoutinesRecord, String>("RESULT_CAST_CHARACTER_SET_NAME", SQLDataType.VARCHAR, ROUTINES);

	/**
	 * An uncommented item
	 */
	public static final TableField<RoutinesRecord, String> RESULT_CAST_COLLATION_CATALOG = new TableFieldImpl<RoutinesRecord, String>("RESULT_CAST_COLLATION_CATALOG", SQLDataType.VARCHAR, ROUTINES);

	/**
	 * An uncommented item
	 */
	public static final TableField<RoutinesRecord, String> RESULT_CAST_COLLATION_SCHEMA = new TableFieldImpl<RoutinesRecord, String>("RESULT_CAST_COLLATION_SCHEMA", SQLDataType.VARCHAR, ROUTINES);

	/**
	 * An uncommented item
	 */
	public static final TableField<RoutinesRecord, String> RESULT_CAST_COLLATION_NAME = new TableFieldImpl<RoutinesRecord, String>("RESULT_CAST_COLLATION_NAME", SQLDataType.VARCHAR, ROUTINES);

	/**
	 * An uncommented item
	 */
	public static final TableField<RoutinesRecord, Long> RESULT_CAST_NUMERIC_PRECISION = new TableFieldImpl<RoutinesRecord, Long>("RESULT_CAST_NUMERIC_PRECISION", SQLDataType.BIGINT, ROUTINES);

	/**
	 * An uncommented item
	 */
	public static final TableField<RoutinesRecord, Long> RESULT_CAST_NUMERIC_RADIX = new TableFieldImpl<RoutinesRecord, Long>("RESULT_CAST_NUMERIC_RADIX", SQLDataType.BIGINT, ROUTINES);

	/**
	 * An uncommented item
	 */
	public static final TableField<RoutinesRecord, Long> RESULT_CAST_NUMERIC_SCALE = new TableFieldImpl<RoutinesRecord, Long>("RESULT_CAST_NUMERIC_SCALE", SQLDataType.BIGINT, ROUTINES);

	/**
	 * An uncommented item
	 */
	public static final TableField<RoutinesRecord, Long> RESULT_CAST_DATETIME_PRECISION = new TableFieldImpl<RoutinesRecord, Long>("RESULT_CAST_DATETIME_PRECISION", SQLDataType.BIGINT, ROUTINES);

	/**
	 * An uncommented item
	 */
	public static final TableField<RoutinesRecord, String> RESULT_CAST_INTERVAL_TYPE = new TableFieldImpl<RoutinesRecord, String>("RESULT_CAST_INTERVAL_TYPE", SQLDataType.VARCHAR, ROUTINES);

	/**
	 * An uncommented item
	 */
	public static final TableField<RoutinesRecord, Long> RESULT_CAST_INTERVAL_PRECISION = new TableFieldImpl<RoutinesRecord, Long>("RESULT_CAST_INTERVAL_PRECISION", SQLDataType.BIGINT, ROUTINES);

	/**
	 * An uncommented item
	 */
	public static final TableField<RoutinesRecord, String> RESULT_CAST_TYPE_UDT_CATALOG = new TableFieldImpl<RoutinesRecord, String>("RESULT_CAST_TYPE_UDT_CATALOG", SQLDataType.VARCHAR, ROUTINES);

	/**
	 * An uncommented item
	 */
	public static final TableField<RoutinesRecord, String> RESULT_CAST_TYPE_UDT_SCHEMA = new TableFieldImpl<RoutinesRecord, String>("RESULT_CAST_TYPE_UDT_SCHEMA", SQLDataType.VARCHAR, ROUTINES);

	/**
	 * An uncommented item
	 */
	public static final TableField<RoutinesRecord, String> RESULT_CAST_TYPE_UDT_NAME = new TableFieldImpl<RoutinesRecord, String>("RESULT_CAST_TYPE_UDT_NAME", SQLDataType.VARCHAR, ROUTINES);

	/**
	 * An uncommented item
	 */
	public static final TableField<RoutinesRecord, String> RESULT_CAST_SCOPE_CATALOG = new TableFieldImpl<RoutinesRecord, String>("RESULT_CAST_SCOPE_CATALOG", SQLDataType.VARCHAR, ROUTINES);

	/**
	 * An uncommented item
	 */
	public static final TableField<RoutinesRecord, String> RESULT_CAST_SCOPE_SCHEMA = new TableFieldImpl<RoutinesRecord, String>("RESULT_CAST_SCOPE_SCHEMA", SQLDataType.VARCHAR, ROUTINES);

	/**
	 * An uncommented item
	 */
	public static final TableField<RoutinesRecord, String> RESULT_CAST_SCOPE_NAME = new TableFieldImpl<RoutinesRecord, String>("RESULT_CAST_SCOPE_NAME", SQLDataType.VARCHAR, ROUTINES);

	/**
	 * An uncommented item
	 */
	public static final TableField<RoutinesRecord, Long> RESULT_CAST_MAX_CARDINALITY = new TableFieldImpl<RoutinesRecord, Long>("RESULT_CAST_MAX_CARDINALITY", SQLDataType.BIGINT, ROUTINES);

	/**
	 * An uncommented item
	 */
	public static final TableField<RoutinesRecord, String> RESULT_CAST_DTD_IDENTIFIER = new TableFieldImpl<RoutinesRecord, String>("RESULT_CAST_DTD_IDENTIFIER", SQLDataType.VARCHAR, ROUTINES);

	/**
	 * An uncommented item
	 */
	public static final TableField<RoutinesRecord, String> DECLARED_DATA_TYPE = new TableFieldImpl<RoutinesRecord, String>("DECLARED_DATA_TYPE", SQLDataType.VARCHAR, ROUTINES);

	/**
	 * An uncommented item
	 */
	public static final TableField<RoutinesRecord, Long> DECLARED_NUMERIC_PRECISION = new TableFieldImpl<RoutinesRecord, Long>("DECLARED_NUMERIC_PRECISION", SQLDataType.BIGINT, ROUTINES);

	/**
	 * An uncommented item
	 */
	public static final TableField<RoutinesRecord, Long> DECLARED_NUMERIC_SCALE = new TableFieldImpl<RoutinesRecord, Long>("DECLARED_NUMERIC_SCALE", SQLDataType.BIGINT, ROUTINES);

	/**
	 * An uncommented item
	 */
	public static final TableField<RoutinesRecord, String> RESULT_CAST_FROM_DECLARED_DATA_TYPE = new TableFieldImpl<RoutinesRecord, String>("RESULT_CAST_FROM_DECLARED_DATA_TYPE", SQLDataType.VARCHAR, ROUTINES);

	/**
	 * An uncommented item
	 */
	public static final TableField<RoutinesRecord, Long> RESULT_CAST_DECLARED_NUMERIC_PRECISION = new TableFieldImpl<RoutinesRecord, Long>("RESULT_CAST_DECLARED_NUMERIC_PRECISION", SQLDataType.BIGINT, ROUTINES);

	/**
	 * An uncommented item
	 */
	public static final TableField<RoutinesRecord, Long> RESULT_CAST_DECLARED_NUMERIC_SCALE = new TableFieldImpl<RoutinesRecord, Long>("RESULT_CAST_DECLARED_NUMERIC_SCALE", SQLDataType.BIGINT, ROUTINES);

	/**
	 * No further instances allowed
	 */
	private Routines() {
		super("ROUTINES", InformationSchema.INFORMATION_SCHEMA);
	}
}
