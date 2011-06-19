/**
 * This class is generated by jOOQ
 */
package org.jooq.util.ingres.ingres.tables;


import javax.annotation.Generated;

import org.jooq.TableField;
import org.jooq.impl.SQLDataType;
import org.jooq.impl.TableFieldImpl;
import org.jooq.impl.TableImpl;
import org.jooq.util.ingres.ingres.$ingres;
import org.jooq.util.ingres.ingres.tables.records.IicolumnsRecord;


/**
 * This class is generated by jOOQ.
 */
@Generated(value    = "http://jooq.sourceforge.net",
           comments = "This class is generated by jOOQ")
public class Iicolumns extends TableImpl<IicolumnsRecord> {

	private static final long serialVersionUID = 684314624;

	/**
	 * The singleton instance of iicolumns
	 */
	public static final Iicolumns IICOLUMNS = new Iicolumns();

	/**
	 * The class holding records for this type
	 */
	private static final Class<IicolumnsRecord> __RECORD_TYPE = IicolumnsRecord.class;

	/**
	 * The class holding records for this type
	 */
	@Override
	public Class<IicolumnsRecord> getRecordType() {
		return __RECORD_TYPE;
	}

	/**
	 * An uncommented item
	 */
	public static final TableField<IicolumnsRecord, String> TABLE_NAME = new TableFieldImpl<IicolumnsRecord, String>("table_name", SQLDataType.CHAR, IICOLUMNS);

	/**
	 * An uncommented item
	 */
	public static final TableField<IicolumnsRecord, String> TABLE_OWNER = new TableFieldImpl<IicolumnsRecord, String>("table_owner", SQLDataType.CHAR, IICOLUMNS);

	/**
	 * An uncommented item
	 */
	public static final TableField<IicolumnsRecord, String> COLUMN_NAME = new TableFieldImpl<IicolumnsRecord, String>("column_name", SQLDataType.CHAR, IICOLUMNS);

	/**
	 * An uncommented item
	 */
	public static final TableField<IicolumnsRecord, String> COLUMN_DATATYPE = new TableFieldImpl<IicolumnsRecord, String>("column_datatype", SQLDataType.CHAR, IICOLUMNS);

	/**
	 * An uncommented item
	 */
	public static final TableField<IicolumnsRecord, Integer> COLUMN_LENGTH = new TableFieldImpl<IicolumnsRecord, Integer>("column_length", SQLDataType.INTEGER, IICOLUMNS);

	/**
	 * An uncommented item
	 */
	public static final TableField<IicolumnsRecord, Integer> COLUMN_SCALE = new TableFieldImpl<IicolumnsRecord, Integer>("column_scale", SQLDataType.INTEGER, IICOLUMNS);

	/**
	 * An uncommented item
	 */
	public static final TableField<IicolumnsRecord, Integer> COLUMN_COLLID = new TableFieldImpl<IicolumnsRecord, Integer>("column_collid", SQLDataType.INTEGER, IICOLUMNS);

	/**
	 * An uncommented item
	 */
	public static final TableField<IicolumnsRecord, String> COLUMN_NULLS = new TableFieldImpl<IicolumnsRecord, String>("column_nulls", SQLDataType.CHAR, IICOLUMNS);

	/**
	 * An uncommented item
	 */
	public static final TableField<IicolumnsRecord, String> COLUMN_DEFAULTS = new TableFieldImpl<IicolumnsRecord, String>("column_defaults", SQLDataType.CHAR, IICOLUMNS);

	/**
	 * An uncommented item
	 */
	public static final TableField<IicolumnsRecord, Integer> COLUMN_SEQUENCE = new TableFieldImpl<IicolumnsRecord, Integer>("column_sequence", SQLDataType.INTEGER, IICOLUMNS);

	/**
	 * An uncommented item
	 */
	public static final TableField<IicolumnsRecord, Integer> KEY_SEQUENCE = new TableFieldImpl<IicolumnsRecord, Integer>("key_sequence", SQLDataType.INTEGER, IICOLUMNS);

	/**
	 * An uncommented item
	 */
	public static final TableField<IicolumnsRecord, String> SORT_DIRECTION = new TableFieldImpl<IicolumnsRecord, String>("sort_direction", SQLDataType.CHAR, IICOLUMNS);

	/**
	 * An uncommented item
	 */
	public static final TableField<IicolumnsRecord, Integer> COLUMN_INGDATATYPE = new TableFieldImpl<IicolumnsRecord, Integer>("column_ingdatatype", SQLDataType.INTEGER, IICOLUMNS);

	/**
	 * An uncommented item
	 */
	public static final TableField<IicolumnsRecord, String> COLUMN_INTERNAL_DATATYPE = new TableFieldImpl<IicolumnsRecord, String>("column_internal_datatype", SQLDataType.CHAR, IICOLUMNS);

	/**
	 * An uncommented item
	 */
	public static final TableField<IicolumnsRecord, Integer> COLUMN_INTERNAL_LENGTH = new TableFieldImpl<IicolumnsRecord, Integer>("column_internal_length", SQLDataType.INTEGER, IICOLUMNS);

	/**
	 * An uncommented item
	 */
	public static final TableField<IicolumnsRecord, Integer> COLUMN_INTERNAL_INGTYPE = new TableFieldImpl<IicolumnsRecord, Integer>("column_internal_ingtype", SQLDataType.INTEGER, IICOLUMNS);

	/**
	 * An uncommented item
	 */
	public static final TableField<IicolumnsRecord, String> COLUMN_SYSTEM_MAINTAINED = new TableFieldImpl<IicolumnsRecord, String>("column_system_maintained", SQLDataType.CHAR, IICOLUMNS);

	/**
	 * An uncommented item
	 */
	public static final TableField<IicolumnsRecord, String> COLUMN_UPDATEABLE = new TableFieldImpl<IicolumnsRecord, String>("column_updateable", SQLDataType.CHAR, IICOLUMNS);

	/**
	 * An uncommented item
	 */
	public static final TableField<IicolumnsRecord, String> COLUMN_HAS_DEFAULT = new TableFieldImpl<IicolumnsRecord, String>("column_has_default", SQLDataType.CHAR, IICOLUMNS);

	/**
	 * An uncommented item
	 */
	public static final TableField<IicolumnsRecord, String> COLUMN_DEFAULT_VAL = new TableFieldImpl<IicolumnsRecord, String>("column_default_val", SQLDataType.VARCHAR, IICOLUMNS);

	/**
	 * An uncommented item
	 */
	public static final TableField<IicolumnsRecord, String> SECURITY_AUDIT_KEY = new TableFieldImpl<IicolumnsRecord, String>("security_audit_key", SQLDataType.CHAR, IICOLUMNS);

	/**
	 * An uncommented item
	 */
	public static final TableField<IicolumnsRecord, String> COLUMN_ALWAYS_IDENT = new TableFieldImpl<IicolumnsRecord, String>("column_always_ident", SQLDataType.CHAR, IICOLUMNS);

	/**
	 * An uncommented item
	 */
	public static final TableField<IicolumnsRecord, String> COLUMN_BYDEFAULT_IDENT = new TableFieldImpl<IicolumnsRecord, String>("column_bydefault_ident", SQLDataType.CHAR, IICOLUMNS);

	/**
	 * An uncommented item
	 */
	public static final TableField<IicolumnsRecord, String> COLUMN_ENCRYPTED = new TableFieldImpl<IicolumnsRecord, String>("column_encrypted", SQLDataType.CHAR, IICOLUMNS);

	/**
	 * An uncommented item
	 */
	public static final TableField<IicolumnsRecord, Integer> COLUMN_ENCRYPT_WIDTH = new TableFieldImpl<IicolumnsRecord, Integer>("column_encrypt_width", SQLDataType.INTEGER, IICOLUMNS);

	/**
	 * An uncommented item
	 */
	public static final TableField<IicolumnsRecord, String> COLUMN_ENCRYPT_SALT = new TableFieldImpl<IicolumnsRecord, String>("column_encrypt_salt", SQLDataType.CHAR, IICOLUMNS);

	/**
	 * An uncommented item
	 */
	public static final TableField<IicolumnsRecord, String> COLUMN_ENCRYPT_CRC = new TableFieldImpl<IicolumnsRecord, String>("column_encrypt_crc", SQLDataType.CHAR, IICOLUMNS);

	/**
	 * No further instances allowed
	 */
	private Iicolumns() {
		super("iicolumns", $ingres.$INGRES);
	}
}
