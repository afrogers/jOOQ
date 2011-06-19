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
import org.jooq.util.ansi.information_schema.tables.records.SequencesRecord;


/**
 * This class is generated by jOOQ.
 */
@Generated(value    = "http://jooq.sourceforge.net",
           comments = "This class is generated by jOOQ")
public class Sequences extends TableImpl<SequencesRecord> {

	private static final long serialVersionUID = -1618191104;

	/**
	 * The singleton instance of SEQUENCES
	 */
	public static final Sequences SEQUENCES = new Sequences();

	/**
	 * The class holding records for this type
	 */
	private static final Class<SequencesRecord> __RECORD_TYPE = SequencesRecord.class;

	/**
	 * The class holding records for this type
	 */
	@Override
	public Class<SequencesRecord> getRecordType() {
		return __RECORD_TYPE;
	}

	/**
	 * An uncommented item
	 */
	public static final TableField<SequencesRecord, String> SEQUENCE_CATALOG = new TableFieldImpl<SequencesRecord, String>("SEQUENCE_CATALOG", SQLDataType.VARCHAR, SEQUENCES);

	/**
	 * An uncommented item
	 */
	public static final TableField<SequencesRecord, String> SEQUENCE_SCHEMA = new TableFieldImpl<SequencesRecord, String>("SEQUENCE_SCHEMA", SQLDataType.VARCHAR, SEQUENCES);

	/**
	 * An uncommented item
	 */
	public static final TableField<SequencesRecord, String> SEQUENCE_NAME = new TableFieldImpl<SequencesRecord, String>("SEQUENCE_NAME", SQLDataType.VARCHAR, SEQUENCES);

	/**
	 * An uncommented item
	 */
	public static final TableField<SequencesRecord, String> DATA_TYPE = new TableFieldImpl<SequencesRecord, String>("DATA_TYPE", SQLDataType.VARCHAR, SEQUENCES);

	/**
	 * An uncommented item
	 */
	public static final TableField<SequencesRecord, Long> NUMERIC_PRECISION = new TableFieldImpl<SequencesRecord, Long>("NUMERIC_PRECISION", SQLDataType.BIGINT, SEQUENCES);

	/**
	 * An uncommented item
	 */
	public static final TableField<SequencesRecord, Long> NUMERIC_PRECISION_RADIX = new TableFieldImpl<SequencesRecord, Long>("NUMERIC_PRECISION_RADIX", SQLDataType.BIGINT, SEQUENCES);

	/**
	 * An uncommented item
	 */
	public static final TableField<SequencesRecord, Long> NUMERIC_SCALE = new TableFieldImpl<SequencesRecord, Long>("NUMERIC_SCALE", SQLDataType.BIGINT, SEQUENCES);

	/**
	 * An uncommented item
	 */
	public static final TableField<SequencesRecord, String> MAXIMUM_VALUE = new TableFieldImpl<SequencesRecord, String>("MAXIMUM_VALUE", SQLDataType.VARCHAR, SEQUENCES);

	/**
	 * An uncommented item
	 */
	public static final TableField<SequencesRecord, String> MINIMUM_VALUE = new TableFieldImpl<SequencesRecord, String>("MINIMUM_VALUE", SQLDataType.VARCHAR, SEQUENCES);

	/**
	 * An uncommented item
	 */
	public static final TableField<SequencesRecord, String> INCREMENT = new TableFieldImpl<SequencesRecord, String>("INCREMENT", SQLDataType.VARCHAR, SEQUENCES);

	/**
	 * An uncommented item
	 */
	public static final TableField<SequencesRecord, String> CYCLE_OPTION = new TableFieldImpl<SequencesRecord, String>("CYCLE_OPTION", SQLDataType.VARCHAR, SEQUENCES);

	/**
	 * An uncommented item
	 */
	public static final TableField<SequencesRecord, String> DECLARED_DATA_TYPE = new TableFieldImpl<SequencesRecord, String>("DECLARED_DATA_TYPE", SQLDataType.VARCHAR, SEQUENCES);

	/**
	 * An uncommented item
	 */
	public static final TableField<SequencesRecord, Long> DECLARED_NUMERIC_PRECISION = new TableFieldImpl<SequencesRecord, Long>("DECLARED_NUMERIC_PRECISION", SQLDataType.BIGINT, SEQUENCES);

	/**
	 * An uncommented item
	 */
	public static final TableField<SequencesRecord, Long> DECLARED_NUMERIC_SCALE = new TableFieldImpl<SequencesRecord, Long>("DECLARED_NUMERIC_SCALE", SQLDataType.BIGINT, SEQUENCES);

	/**
	 * An uncommented item
	 */
	public static final TableField<SequencesRecord, String> START_WITH = new TableFieldImpl<SequencesRecord, String>("START_WITH", SQLDataType.VARCHAR, SEQUENCES);

	/**
	 * An uncommented item
	 */
	public static final TableField<SequencesRecord, String> NEXT_VALUE = new TableFieldImpl<SequencesRecord, String>("NEXT_VALUE", SQLDataType.VARCHAR, SEQUENCES);

	/**
	 * No further instances allowed
	 */
	private Sequences() {
		super("SEQUENCES", InformationSchema.INFORMATION_SCHEMA);
	}
}
