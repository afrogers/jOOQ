/**
 * This class is generated by jOOQ
 */
package org.jooq.util.sybase.sys.tables;


import javax.annotation.Generated;

import org.jooq.TableField;
import org.jooq.impl.SQLDataType;
import org.jooq.impl.TableFieldImpl;
import org.jooq.impl.TableImpl;
import org.jooq.util.sybase.sys.Sys;
import org.jooq.util.sybase.sys.tables.records.SyssequenceRecord;


/**
 * This class is generated by jOOQ.
 */
@Generated(value    = "http://jooq.sourceforge.net",
           comments = "This class is generated by jOOQ")
public class Syssequence extends TableImpl<SyssequenceRecord> {

	private static final long serialVersionUID = -1117993541;

	/**
	 * The singleton instance of SYSSEQUENCE
	 */
	public static final Syssequence SYSSEQUENCE = new Syssequence();

	/**
	 * The class holding records for this type
	 */
	private static final Class<SyssequenceRecord> __RECORD_TYPE = SyssequenceRecord.class;

	/**
	 * The class holding records for this type
	 */
	@Override
	public Class<SyssequenceRecord> getRecordType() {
		return __RECORD_TYPE;
	}

	/**
	 * An uncommented item
	 */
	public static final TableField<SyssequenceRecord, Long> OBJECT_ID = new TableFieldImpl<SyssequenceRecord, Long>("object_id", SQLDataType.BIGINT, SYSSEQUENCE);

	/**
	 * An uncommented item
	 */
	public static final TableField<SyssequenceRecord, Integer> OWNER = new TableFieldImpl<SyssequenceRecord, Integer>("owner", SQLDataType.INTEGER, SYSSEQUENCE);

	/**
	 * An uncommented item
	 */
	public static final TableField<SyssequenceRecord, Long> MIN_VALUE = new TableFieldImpl<SyssequenceRecord, Long>("min_value", SQLDataType.BIGINT, SYSSEQUENCE);

	/**
	 * An uncommented item
	 */
	public static final TableField<SyssequenceRecord, Long> MAX_VALUE = new TableFieldImpl<SyssequenceRecord, Long>("max_value", SQLDataType.BIGINT, SYSSEQUENCE);

	/**
	 * An uncommented item
	 */
	public static final TableField<SyssequenceRecord, Long> INCREMENT_BY = new TableFieldImpl<SyssequenceRecord, Long>("increment_by", SQLDataType.BIGINT, SYSSEQUENCE);

	/**
	 * An uncommented item
	 */
	public static final TableField<SyssequenceRecord, Long> START_WITH = new TableFieldImpl<SyssequenceRecord, Long>("start_with", SQLDataType.BIGINT, SYSSEQUENCE);

	/**
	 * An uncommented item
	 */
	public static final TableField<SyssequenceRecord, Integer> CACHE = new TableFieldImpl<SyssequenceRecord, Integer>("cache", SQLDataType.INTEGER, SYSSEQUENCE);

	/**
	 * An uncommented item
	 */
	public static final TableField<SyssequenceRecord, Byte> CYCLE = new TableFieldImpl<SyssequenceRecord, Byte>("cycle", SQLDataType.TINYINT, SYSSEQUENCE);

	/**
	 * An uncommented item
	 */
	public static final TableField<SyssequenceRecord, Long> RESUME_AT = new TableFieldImpl<SyssequenceRecord, Long>("resume_at", SQLDataType.BIGINT, SYSSEQUENCE);

	/**
	 * An uncommented item
	 */
	public static final TableField<SyssequenceRecord, String> SEQUENCE_NAME = new TableFieldImpl<SyssequenceRecord, String>("sequence_name", SQLDataType.CHAR, SYSSEQUENCE);

	/**
	 * No further instances allowed
	 */
	private Syssequence() {
		super("SYSSEQUENCE", Sys.SYS);
	}
}
