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
import org.jooq.util.ingres.ingres.tables.records.IitablesRecord;


/**
 * This class is generated by jOOQ.
 */
@Generated(value    = "http://jooq.sourceforge.net",
           comments = "This class is generated by jOOQ")
public class Iitables extends TableImpl<IitablesRecord> {

	private static final long serialVersionUID = 425882051;

	/**
	 * The singleton instance of iitables
	 */
	public static final Iitables IITABLES = new Iitables();

	/**
	 * The class holding records for this type
	 */
	private static final Class<IitablesRecord> __RECORD_TYPE = IitablesRecord.class;

	/**
	 * The class holding records for this type
	 */
	@Override
	public Class<IitablesRecord> getRecordType() {
		return __RECORD_TYPE;
	}

	/**
	 * An uncommented item
	 */
	public static final TableField<IitablesRecord, String> TABLE_NAME = new TableFieldImpl<IitablesRecord, String>("table_name", SQLDataType.CHAR, IITABLES);

	/**
	 * An uncommented item
	 */
	public static final TableField<IitablesRecord, String> TABLE_OWNER = new TableFieldImpl<IitablesRecord, String>("table_owner", SQLDataType.CHAR, IITABLES);

	/**
	 * An uncommented item
	 */
	public static final TableField<IitablesRecord, String> CREATE_DATE = new TableFieldImpl<IitablesRecord, String>("create_date", SQLDataType.CHAR, IITABLES);

	/**
	 * An uncommented item
	 */
	public static final TableField<IitablesRecord, String> ALTER_DATE = new TableFieldImpl<IitablesRecord, String>("alter_date", SQLDataType.CHAR, IITABLES);

	/**
	 * An uncommented item
	 */
	public static final TableField<IitablesRecord, String> TABLE_TYPE = new TableFieldImpl<IitablesRecord, String>("table_type", SQLDataType.CHAR, IITABLES);

	/**
	 * An uncommented item
	 */
	public static final TableField<IitablesRecord, String> TABLE_SUBTYPE = new TableFieldImpl<IitablesRecord, String>("table_subtype", SQLDataType.CHAR, IITABLES);

	/**
	 * An uncommented item
	 */
	public static final TableField<IitablesRecord, String> TABLE_VERSION = new TableFieldImpl<IitablesRecord, String>("table_version", SQLDataType.VARCHAR, IITABLES);

	/**
	 * An uncommented item
	 */
	public static final TableField<IitablesRecord, String> SYSTEM_USE = new TableFieldImpl<IitablesRecord, String>("system_use", SQLDataType.CHAR, IITABLES);

	/**
	 * An uncommented item
	 */
	public static final TableField<IitablesRecord, String> TABLE_STATS = new TableFieldImpl<IitablesRecord, String>("table_stats", SQLDataType.CHAR, IITABLES);

	/**
	 * An uncommented item
	 */
	public static final TableField<IitablesRecord, String> TABLE_INDEXES = new TableFieldImpl<IitablesRecord, String>("table_indexes", SQLDataType.CHAR, IITABLES);

	/**
	 * An uncommented item
	 */
	public static final TableField<IitablesRecord, String> IS_READONLY = new TableFieldImpl<IitablesRecord, String>("is_readonly", SQLDataType.CHAR, IITABLES);

	/**
	 * An uncommented item
	 */
	public static final TableField<IitablesRecord, String> CONCURRENT_ACCESS = new TableFieldImpl<IitablesRecord, String>("concurrent_access", SQLDataType.CHAR, IITABLES);

	/**
	 * An uncommented item
	 */
	public static final TableField<IitablesRecord, Integer> NUM_ROWS = new TableFieldImpl<IitablesRecord, Integer>("num_rows", SQLDataType.INTEGER, IITABLES);

	/**
	 * An uncommented item
	 */
	public static final TableField<IitablesRecord, String> STORAGE_STRUCTURE = new TableFieldImpl<IitablesRecord, String>("storage_structure", SQLDataType.CHAR, IITABLES);

	/**
	 * An uncommented item
	 */
	public static final TableField<IitablesRecord, String> IS_COMPRESSED = new TableFieldImpl<IitablesRecord, String>("is_compressed", SQLDataType.CHAR, IITABLES);

	/**
	 * An uncommented item
	 */
	public static final TableField<IitablesRecord, String> KEY_IS_COMPRESSED = new TableFieldImpl<IitablesRecord, String>("key_is_compressed", SQLDataType.CHAR, IITABLES);

	/**
	 * An uncommented item
	 */
	public static final TableField<IitablesRecord, String> DUPLICATE_ROWS = new TableFieldImpl<IitablesRecord, String>("duplicate_rows", SQLDataType.CHAR, IITABLES);

	/**
	 * An uncommented item
	 */
	public static final TableField<IitablesRecord, String> UNIQUE_RULE = new TableFieldImpl<IitablesRecord, String>("unique_rule", SQLDataType.CHAR, IITABLES);

	/**
	 * An uncommented item
	 */
	public static final TableField<IitablesRecord, Integer> NUMBER_PAGES = new TableFieldImpl<IitablesRecord, Integer>("number_pages", SQLDataType.INTEGER, IITABLES);

	/**
	 * An uncommented item
	 */
	public static final TableField<IitablesRecord, Integer> OVERFLOW_PAGES = new TableFieldImpl<IitablesRecord, Integer>("overflow_pages", SQLDataType.INTEGER, IITABLES);

	/**
	 * An uncommented item
	 */
	public static final TableField<IitablesRecord, Integer> ROW_WIDTH = new TableFieldImpl<IitablesRecord, Integer>("row_width", SQLDataType.INTEGER, IITABLES);

	/**
	 * An uncommented item
	 */
	public static final TableField<IitablesRecord, Integer> EXPIRE_DATE = new TableFieldImpl<IitablesRecord, Integer>("expire_date", SQLDataType.INTEGER, IITABLES);

	/**
	 * An uncommented item
	 */
	public static final TableField<IitablesRecord, String> MODIFY_DATE = new TableFieldImpl<IitablesRecord, String>("modify_date", SQLDataType.CHAR, IITABLES);

	/**
	 * An uncommented item
	 */
	public static final TableField<IitablesRecord, String> LOCATION_NAME = new TableFieldImpl<IitablesRecord, String>("location_name", SQLDataType.CHAR, IITABLES);

	/**
	 * An uncommented item
	 */
	public static final TableField<IitablesRecord, String> TABLE_INTEGRITIES = new TableFieldImpl<IitablesRecord, String>("table_integrities", SQLDataType.CHAR, IITABLES);

	/**
	 * An uncommented item
	 */
	public static final TableField<IitablesRecord, String> TABLE_PERMITS = new TableFieldImpl<IitablesRecord, String>("table_permits", SQLDataType.CHAR, IITABLES);

	/**
	 * An uncommented item
	 */
	public static final TableField<IitablesRecord, String> ALL_TO_ALL = new TableFieldImpl<IitablesRecord, String>("all_to_all", SQLDataType.CHAR, IITABLES);

	/**
	 * An uncommented item
	 */
	public static final TableField<IitablesRecord, String> RET_TO_ALL = new TableFieldImpl<IitablesRecord, String>("ret_to_all", SQLDataType.CHAR, IITABLES);

	/**
	 * An uncommented item
	 */
	public static final TableField<IitablesRecord, String> IS_JOURNALLED = new TableFieldImpl<IitablesRecord, String>("is_journalled", SQLDataType.CHAR, IITABLES);

	/**
	 * An uncommented item
	 */
	public static final TableField<IitablesRecord, String> VIEW_BASE = new TableFieldImpl<IitablesRecord, String>("view_base", SQLDataType.CHAR, IITABLES);

	/**
	 * An uncommented item
	 */
	public static final TableField<IitablesRecord, String> MULTI_LOCATIONS = new TableFieldImpl<IitablesRecord, String>("multi_locations", SQLDataType.CHAR, IITABLES);

	/**
	 * An uncommented item
	 */
	public static final TableField<IitablesRecord, Integer> TABLE_IFILLPCT = new TableFieldImpl<IitablesRecord, Integer>("table_ifillpct", SQLDataType.INTEGER, IITABLES);

	/**
	 * An uncommented item
	 */
	public static final TableField<IitablesRecord, Integer> TABLE_DFILLPCT = new TableFieldImpl<IitablesRecord, Integer>("table_dfillpct", SQLDataType.INTEGER, IITABLES);

	/**
	 * An uncommented item
	 */
	public static final TableField<IitablesRecord, Integer> TABLE_LFILLPCT = new TableFieldImpl<IitablesRecord, Integer>("table_lfillpct", SQLDataType.INTEGER, IITABLES);

	/**
	 * An uncommented item
	 */
	public static final TableField<IitablesRecord, Integer> TABLE_MINPAGES = new TableFieldImpl<IitablesRecord, Integer>("table_minpages", SQLDataType.INTEGER, IITABLES);

	/**
	 * An uncommented item
	 */
	public static final TableField<IitablesRecord, Integer> TABLE_MAXPAGES = new TableFieldImpl<IitablesRecord, Integer>("table_maxpages", SQLDataType.INTEGER, IITABLES);

	/**
	 * An uncommented item
	 */
	public static final TableField<IitablesRecord, Integer> TABLE_RELSTAMP1 = new TableFieldImpl<IitablesRecord, Integer>("table_relstamp1", SQLDataType.INTEGER, IITABLES);

	/**
	 * An uncommented item
	 */
	public static final TableField<IitablesRecord, Integer> TABLE_RELSTAMP2 = new TableFieldImpl<IitablesRecord, Integer>("table_relstamp2", SQLDataType.INTEGER, IITABLES);

	/**
	 * An uncommented item
	 */
	public static final TableField<IitablesRecord, Integer> TABLE_RELTID = new TableFieldImpl<IitablesRecord, Integer>("table_reltid", SQLDataType.INTEGER, IITABLES);

	/**
	 * An uncommented item
	 */
	public static final TableField<IitablesRecord, Integer> TABLE_RELTIDX = new TableFieldImpl<IitablesRecord, Integer>("table_reltidx", SQLDataType.INTEGER, IITABLES);

	/**
	 * An uncommented item
	 */
	public static final TableField<IitablesRecord, String> UNIQUE_SCOPE = new TableFieldImpl<IitablesRecord, String>("unique_scope", SQLDataType.CHAR, IITABLES);

	/**
	 * An uncommented item
	 */
	public static final TableField<IitablesRecord, Integer> ALLOCATION_SIZE = new TableFieldImpl<IitablesRecord, Integer>("allocation_size", SQLDataType.INTEGER, IITABLES);

	/**
	 * An uncommented item
	 */
	public static final TableField<IitablesRecord, Integer> EXTEND_SIZE = new TableFieldImpl<IitablesRecord, Integer>("extend_size", SQLDataType.INTEGER, IITABLES);

	/**
	 * An uncommented item
	 */
	public static final TableField<IitablesRecord, Integer> ALLOCATED_PAGES = new TableFieldImpl<IitablesRecord, Integer>("allocated_pages", SQLDataType.INTEGER, IITABLES);

	/**
	 * An uncommented item
	 */
	public static final TableField<IitablesRecord, String> LABEL_GRANULARITY = new TableFieldImpl<IitablesRecord, String>("label_granularity", SQLDataType.CHAR, IITABLES);

	/**
	 * An uncommented item
	 */
	public static final TableField<IitablesRecord, String> ROW_SECURITY_AUDIT = new TableFieldImpl<IitablesRecord, String>("row_security_audit", SQLDataType.CHAR, IITABLES);

	/**
	 * An uncommented item
	 */
	public static final TableField<IitablesRecord, String> SECURITY_LABEL = new TableFieldImpl<IitablesRecord, String>("security_label", SQLDataType.CHAR, IITABLES);

	/**
	 * An uncommented item
	 */
	public static final TableField<IitablesRecord, Integer> TABLE_PAGESIZE = new TableFieldImpl<IitablesRecord, Integer>("table_pagesize", SQLDataType.INTEGER, IITABLES);

	/**
	 * An uncommented item
	 */
	public static final TableField<IitablesRecord, Integer> TABLE_RELVERSION = new TableFieldImpl<IitablesRecord, Integer>("table_relversion", SQLDataType.INTEGER, IITABLES);

	/**
	 * An uncommented item
	 */
	public static final TableField<IitablesRecord, Integer> TABLE_RELTOTWID = new TableFieldImpl<IitablesRecord, Integer>("table_reltotwid", SQLDataType.INTEGER, IITABLES);

	/**
	 * An uncommented item
	 */
	public static final TableField<IitablesRecord, Integer> TABLE_RELTCPRI = new TableFieldImpl<IitablesRecord, Integer>("table_reltcpri", SQLDataType.INTEGER, IITABLES);

	/**
	 * An uncommented item
	 */
	public static final TableField<IitablesRecord, Integer> TUPS_PER_PAGE = new TableFieldImpl<IitablesRecord, Integer>("tups_per_page", SQLDataType.INTEGER, IITABLES);

	/**
	 * An uncommented item
	 */
	public static final TableField<IitablesRecord, Integer> KEYS_PER_PAGE = new TableFieldImpl<IitablesRecord, Integer>("keys_per_page", SQLDataType.INTEGER, IITABLES);

	/**
	 * An uncommented item
	 */
	public static final TableField<IitablesRecord, Integer> KEYS_PER_LEAF = new TableFieldImpl<IitablesRecord, Integer>("keys_per_leaf", SQLDataType.INTEGER, IITABLES);

	/**
	 * An uncommented item
	 */
	public static final TableField<IitablesRecord, Integer> PHYS_PARTITIONS = new TableFieldImpl<IitablesRecord, Integer>("phys_partitions", SQLDataType.INTEGER, IITABLES);

	/**
	 * An uncommented item
	 */
	public static final TableField<IitablesRecord, Integer> PARTITION_DIMENSIONS = new TableFieldImpl<IitablesRecord, Integer>("partition_dimensions", SQLDataType.INTEGER, IITABLES);

	/**
	 * An uncommented item
	 */
	public static final TableField<IitablesRecord, Integer> TABLE_RELDATAWID = new TableFieldImpl<IitablesRecord, Integer>("table_reldatawid", SQLDataType.INTEGER, IITABLES);

	/**
	 * An uncommented item
	 */
	public static final TableField<IitablesRecord, Integer> TABLE_RELTOTDATAWID = new TableFieldImpl<IitablesRecord, Integer>("table_reltotdatawid", SQLDataType.INTEGER, IITABLES);

	/**
	 * An uncommented item
	 */
	public static final TableField<IitablesRecord, String> ENCRYPTED_COLUMNS = new TableFieldImpl<IitablesRecord, String>("encrypted_columns", SQLDataType.CHAR, IITABLES);

	/**
	 * An uncommented item
	 */
	public static final TableField<IitablesRecord, Integer> ENCRYPTION_VERSION = new TableFieldImpl<IitablesRecord, Integer>("encryption_version", SQLDataType.INTEGER, IITABLES);

	/**
	 * An uncommented item
	 */
	public static final TableField<IitablesRecord, String> ENCRYPTION_TYPE = new TableFieldImpl<IitablesRecord, String>("encryption_type", SQLDataType.VARCHAR, IITABLES);

	/**
	 * No further instances allowed
	 */
	private Iitables() {
		super("iitables", $ingres.$INGRES);
	}
}
