/**
 * This class is generated by jOOQ
 */
package org.jooq.util.oracle.sys.tables;


import java.math.BigDecimal;

import javax.annotation.Generated;

import org.jooq.TableField;
import org.jooq.impl.SQLDataType;
import org.jooq.impl.TableFieldImpl;
import org.jooq.impl.TableImpl;
import org.jooq.util.oracle.sys.Sys;
import org.jooq.util.oracle.sys.tables.records.AllCollTypesRecord;


/**
 * This class is generated by jOOQ.
 *
 * Description of named collection types accessible to the user
 */
@Generated(value    = "http://jooq.sourceforge.net",
           comments = "This class is generated by jOOQ")
public class AllCollTypes extends TableImpl<AllCollTypesRecord> {

	private static final long serialVersionUID = -1835834397;

	/**
	 * The singleton instance of ALL_COLL_TYPES
	 */
	public static final AllCollTypes ALL_COLL_TYPES = new AllCollTypes();

	/**
	 * The class holding records for this type
	 */
	private static final Class<AllCollTypesRecord> __RECORD_TYPE = AllCollTypesRecord.class;

	/**
	 * The class holding records for this type
	 */
	@Override
	public Class<AllCollTypesRecord> getRecordType() {
		return __RECORD_TYPE;
	}

	/**
	 * Owner of the type
	 */
	public static final TableField<AllCollTypesRecord, String> OWNER = new TableFieldImpl<AllCollTypesRecord, String>("OWNER", SQLDataType.VARCHAR, ALL_COLL_TYPES);

	/**
	 * Name of the type
	 */
	public static final TableField<AllCollTypesRecord, String> TYPE_NAME = new TableFieldImpl<AllCollTypesRecord, String>("TYPE_NAME", SQLDataType.VARCHAR, ALL_COLL_TYPES);

	/**
	 * Collection type
	 */
	public static final TableField<AllCollTypesRecord, String> COLL_TYPE = new TableFieldImpl<AllCollTypesRecord, String>("COLL_TYPE", SQLDataType.VARCHAR, ALL_COLL_TYPES);

	/**
	 * Size of the FIXED ARRAY type or maximum size of the VARYING ARRAY type
	 */
	public static final TableField<AllCollTypesRecord, BigDecimal> UPPER_BOUND = new TableFieldImpl<AllCollTypesRecord, BigDecimal>("UPPER_BOUND", SQLDataType.NUMERIC, ALL_COLL_TYPES);

	/**
	 * Type modifier of the element
	 */
	public static final TableField<AllCollTypesRecord, String> ELEM_TYPE_MOD = new TableFieldImpl<AllCollTypesRecord, String>("ELEM_TYPE_MOD", SQLDataType.VARCHAR, ALL_COLL_TYPES);

	/**
	 * Owner of the type of the element
	 */
	public static final TableField<AllCollTypesRecord, String> ELEM_TYPE_OWNER = new TableFieldImpl<AllCollTypesRecord, String>("ELEM_TYPE_OWNER", SQLDataType.VARCHAR, ALL_COLL_TYPES);

	/**
	 * Name of the type of the element
	 */
	public static final TableField<AllCollTypesRecord, String> ELEM_TYPE_NAME = new TableFieldImpl<AllCollTypesRecord, String>("ELEM_TYPE_NAME", SQLDataType.VARCHAR, ALL_COLL_TYPES);

	/**
	 * Length of the CHAR element or maximum length of the VARCHAR
or VARCHAR2 element
	 */
	public static final TableField<AllCollTypesRecord, BigDecimal> LENGTH = new TableFieldImpl<AllCollTypesRecord, BigDecimal>("LENGTH", SQLDataType.NUMERIC, ALL_COLL_TYPES);

	/**
	 * Decimal precision of the NUMBER or DECIMAL element or
binary precision of the FLOAT element
	 */
	public static final TableField<AllCollTypesRecord, BigDecimal> PRECISION = new TableFieldImpl<AllCollTypesRecord, BigDecimal>("PRECISION", SQLDataType.NUMERIC, ALL_COLL_TYPES);

	/**
	 * Scale of the NUMBER or DECIMAL element
	 */
	public static final TableField<AllCollTypesRecord, BigDecimal> SCALE = new TableFieldImpl<AllCollTypesRecord, BigDecimal>("SCALE", SQLDataType.NUMERIC, ALL_COLL_TYPES);

	/**
	 * Character set name of the element
	 */
	public static final TableField<AllCollTypesRecord, String> CHARACTER_SET_NAME = new TableFieldImpl<AllCollTypesRecord, String>("CHARACTER_SET_NAME", SQLDataType.VARCHAR, ALL_COLL_TYPES);

	/**
	 * Storage optimization specification for VARRAY of numeric elements
	 */
	public static final TableField<AllCollTypesRecord, String> ELEM_STORAGE = new TableFieldImpl<AllCollTypesRecord, String>("ELEM_STORAGE", SQLDataType.VARCHAR, ALL_COLL_TYPES);

	/**
	 * Is null information stored with each VARRAY element?
	 */
	public static final TableField<AllCollTypesRecord, String> NULLS_STORED = new TableFieldImpl<AllCollTypesRecord, String>("NULLS_STORED", SQLDataType.VARCHAR, ALL_COLL_TYPES);

	/**
	 * No further instances allowed
	 */
	private AllCollTypes() {
		super("ALL_COLL_TYPES", Sys.SYS);
	}
}
