/**
 * This class is generated by jOOQ
 */
package org.jooq.util.ansi.information_schema.tables;


import javax.annotation.Generated;

import org.jooq.TableField;
import org.jooq.impl.SQLDataType;
import org.jooq.impl.TableFieldImpl;
import org.jooq.impl.TableImpl;
import org.jooq.util.ansi.information_schema.InformationSchema;
import org.jooq.util.ansi.information_schema.tables.records.ConstraintColumnUsageRecord;


/**
 * This class is generated by jOOQ.
 */
@Generated(value    = "http://jooq.sourceforge.net",
           comments = "This class is generated by jOOQ")
public class ConstraintColumnUsage extends TableImpl<ConstraintColumnUsageRecord> {

	private static final long serialVersionUID = 1610163234;

	/**
	 * The singleton instance of CONSTRAINT_COLUMN_USAGE
	 */
	public static final ConstraintColumnUsage CONSTRAINT_COLUMN_USAGE = new ConstraintColumnUsage();

	/**
	 * The class holding records for this type
	 */
	private static final Class<ConstraintColumnUsageRecord> __RECORD_TYPE = ConstraintColumnUsageRecord.class;

	/**
	 * The class holding records for this type
	 */
	@Override
	public Class<ConstraintColumnUsageRecord> getRecordType() {
		return __RECORD_TYPE;
	}

	/**
	 * An uncommented item
	 */
	public static final TableField<ConstraintColumnUsageRecord, String> TABLE_CATALOG = new TableFieldImpl<ConstraintColumnUsageRecord, String>("TABLE_CATALOG", SQLDataType.VARCHAR, CONSTRAINT_COLUMN_USAGE);

	/**
	 * An uncommented item
	 */
	public static final TableField<ConstraintColumnUsageRecord, String> TABLE_SCHEMA = new TableFieldImpl<ConstraintColumnUsageRecord, String>("TABLE_SCHEMA", SQLDataType.VARCHAR, CONSTRAINT_COLUMN_USAGE);

	/**
	 * An uncommented item
	 */
	public static final TableField<ConstraintColumnUsageRecord, String> TABLE_NAME = new TableFieldImpl<ConstraintColumnUsageRecord, String>("TABLE_NAME", SQLDataType.VARCHAR, CONSTRAINT_COLUMN_USAGE);

	/**
	 * An uncommented item
	 */
	public static final TableField<ConstraintColumnUsageRecord, String> COLUMN_NAME = new TableFieldImpl<ConstraintColumnUsageRecord, String>("COLUMN_NAME", SQLDataType.VARCHAR, CONSTRAINT_COLUMN_USAGE);

	/**
	 * An uncommented item
	 */
	public static final TableField<ConstraintColumnUsageRecord, String> CONSTRAINT_CATALOG = new TableFieldImpl<ConstraintColumnUsageRecord, String>("CONSTRAINT_CATALOG", SQLDataType.VARCHAR, CONSTRAINT_COLUMN_USAGE);

	/**
	 * An uncommented item
	 */
	public static final TableField<ConstraintColumnUsageRecord, String> CONSTRAINT_SCHEMA = new TableFieldImpl<ConstraintColumnUsageRecord, String>("CONSTRAINT_SCHEMA", SQLDataType.VARCHAR, CONSTRAINT_COLUMN_USAGE);

	/**
	 * An uncommented item
	 */
	public static final TableField<ConstraintColumnUsageRecord, String> CONSTRAINT_NAME = new TableFieldImpl<ConstraintColumnUsageRecord, String>("CONSTRAINT_NAME", SQLDataType.VARCHAR, CONSTRAINT_COLUMN_USAGE);

	/**
	 * No further instances allowed
	 */
	private ConstraintColumnUsage() {
		super("CONSTRAINT_COLUMN_USAGE", InformationSchema.INFORMATION_SCHEMA);
	}
}
