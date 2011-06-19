/**
 * This class is generated by jOOQ
 */
package org.jooq.util.db2.syscat.tables;


import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.TableField;
import org.jooq.impl.SQLDataType;
import org.jooq.impl.TableFieldImpl;
import org.jooq.impl.TableImpl;
import org.jooq.util.db2.syscat.Syscat;
import org.jooq.util.db2.syscat.tables.records.ProceduresRecord;


/**
 * This class is generated by jOOQ.
 */
@Generated(value    = "http://jooq.sourceforge.net",
           comments = "This class is generated by jOOQ")
public class Procedures extends TableImpl<ProceduresRecord> {

	private static final long serialVersionUID = 1763967645;

	/**
	 * The singleton instance of PROCEDURES
	 */
	public static final Procedures PROCEDURES = new Procedures();

	/**
	 * The class holding records for this type
	 */
	private static final Class<ProceduresRecord> __RECORD_TYPE = ProceduresRecord.class;

	/**
	 * The class holding records for this type
	 */
	@Override
	public Class<ProceduresRecord> getRecordType() {
		return __RECORD_TYPE;
	}

	/**
	 * An uncommented item
	 */
	public static final TableField<ProceduresRecord, String> PROCSCHEMA = new TableFieldImpl<ProceduresRecord, String>("PROCSCHEMA", SQLDataType.VARCHAR, PROCEDURES);

	/**
	 * An uncommented item
	 */
	public static final TableField<ProceduresRecord, String> PROCNAME = new TableFieldImpl<ProceduresRecord, String>("PROCNAME", SQLDataType.VARCHAR, PROCEDURES);

	/**
	 * An uncommented item
	 */
	public static final TableField<ProceduresRecord, String> SPECIFICNAME = new TableFieldImpl<ProceduresRecord, String>("SPECIFICNAME", SQLDataType.VARCHAR, PROCEDURES);

	/**
	 * An uncommented item
	 */
	public static final TableField<ProceduresRecord, Integer> PROCEDURE_ID = new TableFieldImpl<ProceduresRecord, Integer>("PROCEDURE_ID", SQLDataType.INTEGER, PROCEDURES);

	/**
	 * An uncommented item
	 */
	public static final TableField<ProceduresRecord, String> DEFINER = new TableFieldImpl<ProceduresRecord, String>("DEFINER", SQLDataType.VARCHAR, PROCEDURES);

	/**
	 * An uncommented item
	 */
	public static final TableField<ProceduresRecord, Short> PARM_COUNT = new TableFieldImpl<ProceduresRecord, Short>("PARM_COUNT", SQLDataType.SMALLINT, PROCEDURES);

	/**
	 * An uncommented item
	 */
	public static final TableField<ProceduresRecord, String> PARM_SIGNATURE = new TableFieldImpl<ProceduresRecord, String>("PARM_SIGNATURE", SQLDataType.VARCHAR, PROCEDURES);

	/**
	 * An uncommented item
	 */
	public static final TableField<ProceduresRecord, String> ORIGIN = new TableFieldImpl<ProceduresRecord, String>("ORIGIN", SQLDataType.CHAR, PROCEDURES);

	/**
	 * An uncommented item
	 */
	public static final TableField<ProceduresRecord, Timestamp> CREATE_TIME = new TableFieldImpl<ProceduresRecord, Timestamp>("CREATE_TIME", SQLDataType.TIMESTAMP, PROCEDURES);

	/**
	 * An uncommented item
	 */
	public static final TableField<ProceduresRecord, String> DETERMINISTIC = new TableFieldImpl<ProceduresRecord, String>("DETERMINISTIC", SQLDataType.CHAR, PROCEDURES);

	/**
	 * An uncommented item
	 */
	public static final TableField<ProceduresRecord, String> FENCED = new TableFieldImpl<ProceduresRecord, String>("FENCED", SQLDataType.CHAR, PROCEDURES);

	/**
	 * An uncommented item
	 */
	public static final TableField<ProceduresRecord, String> NULLCALL = new TableFieldImpl<ProceduresRecord, String>("NULLCALL", SQLDataType.CHAR, PROCEDURES);

	/**
	 * An uncommented item
	 */
	public static final TableField<ProceduresRecord, String> LANGUAGE = new TableFieldImpl<ProceduresRecord, String>("LANGUAGE", SQLDataType.CHAR, PROCEDURES);

	/**
	 * An uncommented item
	 */
	public static final TableField<ProceduresRecord, String> IMPLEMENTATION = new TableFieldImpl<ProceduresRecord, String>("IMPLEMENTATION", SQLDataType.VARCHAR, PROCEDURES);

	/**
	 * An uncommented item
	 */
	public static final TableField<ProceduresRecord, String> CLASS = new TableFieldImpl<ProceduresRecord, String>("CLASS", SQLDataType.VARCHAR, PROCEDURES);

	/**
	 * An uncommented item
	 */
	public static final TableField<ProceduresRecord, String> JAR_ID = new TableFieldImpl<ProceduresRecord, String>("JAR_ID", SQLDataType.VARCHAR, PROCEDURES);

	/**
	 * An uncommented item
	 */
	public static final TableField<ProceduresRecord, String> PARM_STYLE = new TableFieldImpl<ProceduresRecord, String>("PARM_STYLE", SQLDataType.CHAR, PROCEDURES);

	/**
	 * An uncommented item
	 */
	public static final TableField<ProceduresRecord, String> CONTAINS_SQL = new TableFieldImpl<ProceduresRecord, String>("CONTAINS_SQL", SQLDataType.CHAR, PROCEDURES);

	/**
	 * An uncommented item
	 */
	public static final TableField<ProceduresRecord, String> DBINFO = new TableFieldImpl<ProceduresRecord, String>("DBINFO", SQLDataType.CHAR, PROCEDURES);

	/**
	 * An uncommented item
	 */
	public static final TableField<ProceduresRecord, String> PROGRAM_TYPE = new TableFieldImpl<ProceduresRecord, String>("PROGRAM_TYPE", SQLDataType.CHAR, PROCEDURES);

	/**
	 * An uncommented item
	 */
	public static final TableField<ProceduresRecord, Short> RESULT_SETS = new TableFieldImpl<ProceduresRecord, Short>("RESULT_SETS", SQLDataType.SMALLINT, PROCEDURES);

	/**
	 * An uncommented item
	 */
	public static final TableField<ProceduresRecord, String> VALID = new TableFieldImpl<ProceduresRecord, String>("VALID", SQLDataType.CHAR, PROCEDURES);

	/**
	 * An uncommented item
	 */
	public static final TableField<ProceduresRecord, Integer> TEXT_BODY_OFFSET = new TableFieldImpl<ProceduresRecord, Integer>("TEXT_BODY_OFFSET", SQLDataType.INTEGER, PROCEDURES);

	/**
	 * An uncommented item
	 */
	public static final TableField<ProceduresRecord, String> TEXT = new TableFieldImpl<ProceduresRecord, String>("TEXT", SQLDataType.CLOB, PROCEDURES);

	/**
	 * An uncommented item
	 */
	public static final TableField<ProceduresRecord, String> REMARKS = new TableFieldImpl<ProceduresRecord, String>("REMARKS", SQLDataType.VARCHAR, PROCEDURES);

	/**
	 * No further instances allowed
	 */
	private Procedures() {
		super("PROCEDURES", Syscat.SYSCAT);
	}
}
