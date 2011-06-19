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
import org.jooq.util.db2.syscat.tables.records.DatatypesRecord;


/**
 * This class is generated by jOOQ.
 */
@Generated(value    = "http://jooq.sourceforge.net",
           comments = "This class is generated by jOOQ")
public class Datatypes extends TableImpl<DatatypesRecord> {

	private static final long serialVersionUID = -2012725233;

	/**
	 * The singleton instance of DATATYPES
	 */
	public static final Datatypes DATATYPES = new Datatypes();

	/**
	 * The class holding records for this type
	 */
	private static final Class<DatatypesRecord> __RECORD_TYPE = DatatypesRecord.class;

	/**
	 * The class holding records for this type
	 */
	@Override
	public Class<DatatypesRecord> getRecordType() {
		return __RECORD_TYPE;
	}

	/**
	 * An uncommented item
	 */
	public static final TableField<DatatypesRecord, String> TYPESCHEMA = new TableFieldImpl<DatatypesRecord, String>("TYPESCHEMA", SQLDataType.VARCHAR, DATATYPES);

	/**
	 * An uncommented item
	 */
	public static final TableField<DatatypesRecord, String> TYPEMODULENAME = new TableFieldImpl<DatatypesRecord, String>("TYPEMODULENAME", SQLDataType.VARCHAR, DATATYPES);

	/**
	 * An uncommented item
	 */
	public static final TableField<DatatypesRecord, String> TYPENAME = new TableFieldImpl<DatatypesRecord, String>("TYPENAME", SQLDataType.VARCHAR, DATATYPES);

	/**
	 * An uncommented item
	 */
	public static final TableField<DatatypesRecord, String> OWNER = new TableFieldImpl<DatatypesRecord, String>("OWNER", SQLDataType.VARCHAR, DATATYPES);

	/**
	 * An uncommented item
	 */
	public static final TableField<DatatypesRecord, String> OWNERTYPE = new TableFieldImpl<DatatypesRecord, String>("OWNERTYPE", SQLDataType.CHAR, DATATYPES);

	/**
	 * An uncommented item
	 */
	public static final TableField<DatatypesRecord, String> SOURCESCHEMA = new TableFieldImpl<DatatypesRecord, String>("SOURCESCHEMA", SQLDataType.VARCHAR, DATATYPES);

	/**
	 * An uncommented item
	 */
	public static final TableField<DatatypesRecord, String> SOURCEMODULENAME = new TableFieldImpl<DatatypesRecord, String>("SOURCEMODULENAME", SQLDataType.VARCHAR, DATATYPES);

	/**
	 * An uncommented item
	 */
	public static final TableField<DatatypesRecord, String> SOURCENAME = new TableFieldImpl<DatatypesRecord, String>("SOURCENAME", SQLDataType.VARCHAR, DATATYPES);

	/**
	 * An uncommented item
	 */
	public static final TableField<DatatypesRecord, String> METATYPE = new TableFieldImpl<DatatypesRecord, String>("METATYPE", SQLDataType.CHAR, DATATYPES);

	/**
	 * An uncommented item
	 */
	public static final TableField<DatatypesRecord, Short> TYPEID = new TableFieldImpl<DatatypesRecord, Short>("TYPEID", SQLDataType.SMALLINT, DATATYPES);

	/**
	 * An uncommented item
	 */
	public static final TableField<DatatypesRecord, Integer> TYPEMODULEID = new TableFieldImpl<DatatypesRecord, Integer>("TYPEMODULEID", SQLDataType.INTEGER, DATATYPES);

	/**
	 * An uncommented item
	 */
	public static final TableField<DatatypesRecord, Short> SOURCETYPEID = new TableFieldImpl<DatatypesRecord, Short>("SOURCETYPEID", SQLDataType.SMALLINT, DATATYPES);

	/**
	 * An uncommented item
	 */
	public static final TableField<DatatypesRecord, Integer> SOURCEMODULEID = new TableFieldImpl<DatatypesRecord, Integer>("SOURCEMODULEID", SQLDataType.INTEGER, DATATYPES);

	/**
	 * An uncommented item
	 */
	public static final TableField<DatatypesRecord, String> PUBLISHED = new TableFieldImpl<DatatypesRecord, String>("PUBLISHED", SQLDataType.CHAR, DATATYPES);

	/**
	 * An uncommented item
	 */
	public static final TableField<DatatypesRecord, Integer> LENGTH = new TableFieldImpl<DatatypesRecord, Integer>("LENGTH", SQLDataType.INTEGER, DATATYPES);

	/**
	 * An uncommented item
	 */
	public static final TableField<DatatypesRecord, Short> SCALE = new TableFieldImpl<DatatypesRecord, Short>("SCALE", SQLDataType.SMALLINT, DATATYPES);

	/**
	 * An uncommented item
	 */
	public static final TableField<DatatypesRecord, Short> CODEPAGE = new TableFieldImpl<DatatypesRecord, Short>("CODEPAGE", SQLDataType.SMALLINT, DATATYPES);

	/**
	 * An uncommented item
	 */
	public static final TableField<DatatypesRecord, String> COLLATIONSCHEMA = new TableFieldImpl<DatatypesRecord, String>("COLLATIONSCHEMA", SQLDataType.VARCHAR, DATATYPES);

	/**
	 * An uncommented item
	 */
	public static final TableField<DatatypesRecord, String> COLLATIONNAME = new TableFieldImpl<DatatypesRecord, String>("COLLATIONNAME", SQLDataType.VARCHAR, DATATYPES);

	/**
	 * An uncommented item
	 */
	public static final TableField<DatatypesRecord, Integer> ARRAY_LENGTH = new TableFieldImpl<DatatypesRecord, Integer>("ARRAY_LENGTH", SQLDataType.INTEGER, DATATYPES);

	/**
	 * An uncommented item
	 */
	public static final TableField<DatatypesRecord, String> ARRAYINDEXTYPESCHEMA = new TableFieldImpl<DatatypesRecord, String>("ARRAYINDEXTYPESCHEMA", SQLDataType.VARCHAR, DATATYPES);

	/**
	 * An uncommented item
	 */
	public static final TableField<DatatypesRecord, String> ARRAYINDEXTYPENAME = new TableFieldImpl<DatatypesRecord, String>("ARRAYINDEXTYPENAME", SQLDataType.VARCHAR, DATATYPES);

	/**
	 * An uncommented item
	 */
	public static final TableField<DatatypesRecord, Short> ARRAYINDEXTYPEID = new TableFieldImpl<DatatypesRecord, Short>("ARRAYINDEXTYPEID", SQLDataType.SMALLINT, DATATYPES);

	/**
	 * An uncommented item
	 */
	public static final TableField<DatatypesRecord, Integer> ARRAYINDEXTYPELENGTH = new TableFieldImpl<DatatypesRecord, Integer>("ARRAYINDEXTYPELENGTH", SQLDataType.INTEGER, DATATYPES);

	/**
	 * An uncommented item
	 */
	public static final TableField<DatatypesRecord, Timestamp> CREATE_TIME = new TableFieldImpl<DatatypesRecord, Timestamp>("CREATE_TIME", SQLDataType.TIMESTAMP, DATATYPES);

	/**
	 * An uncommented item
	 */
	public static final TableField<DatatypesRecord, String> VALID = new TableFieldImpl<DatatypesRecord, String>("VALID", SQLDataType.CHAR, DATATYPES);

	/**
	 * An uncommented item
	 */
	public static final TableField<DatatypesRecord, Short> ATTRCOUNT = new TableFieldImpl<DatatypesRecord, Short>("ATTRCOUNT", SQLDataType.SMALLINT, DATATYPES);

	/**
	 * An uncommented item
	 */
	public static final TableField<DatatypesRecord, String> INSTANTIABLE = new TableFieldImpl<DatatypesRecord, String>("INSTANTIABLE", SQLDataType.CHAR, DATATYPES);

	/**
	 * An uncommented item
	 */
	public static final TableField<DatatypesRecord, String> WITH_FUNC_ACCESS = new TableFieldImpl<DatatypesRecord, String>("WITH_FUNC_ACCESS", SQLDataType.CHAR, DATATYPES);

	/**
	 * An uncommented item
	 */
	public static final TableField<DatatypesRecord, String> FINAL = new TableFieldImpl<DatatypesRecord, String>("FINAL", SQLDataType.CHAR, DATATYPES);

	/**
	 * An uncommented item
	 */
	public static final TableField<DatatypesRecord, Integer> INLINE_LENGTH = new TableFieldImpl<DatatypesRecord, Integer>("INLINE_LENGTH", SQLDataType.INTEGER, DATATYPES);

	/**
	 * An uncommented item
	 */
	public static final TableField<DatatypesRecord, Integer> NATURAL_INLINE_LENGTH = new TableFieldImpl<DatatypesRecord, Integer>("NATURAL_INLINE_LENGTH", SQLDataType.INTEGER, DATATYPES);

	/**
	 * An uncommented item
	 */
	public static final TableField<DatatypesRecord, String> JARSCHEMA = new TableFieldImpl<DatatypesRecord, String>("JARSCHEMA", SQLDataType.VARCHAR, DATATYPES);

	/**
	 * An uncommented item
	 */
	public static final TableField<DatatypesRecord, String> JAR_ID = new TableFieldImpl<DatatypesRecord, String>("JAR_ID", SQLDataType.VARCHAR, DATATYPES);

	/**
	 * An uncommented item
	 */
	public static final TableField<DatatypesRecord, String> CLASS = new TableFieldImpl<DatatypesRecord, String>("CLASS", SQLDataType.VARCHAR, DATATYPES);

	/**
	 * An uncommented item
	 */
	public static final TableField<DatatypesRecord, String> SQLJ_REPRESENTATION = new TableFieldImpl<DatatypesRecord, String>("SQLJ_REPRESENTATION", SQLDataType.CHAR, DATATYPES);

	/**
	 * An uncommented item
	 */
	public static final TableField<DatatypesRecord, Timestamp> ALTER_TIME = new TableFieldImpl<DatatypesRecord, Timestamp>("ALTER_TIME", SQLDataType.TIMESTAMP, DATATYPES);

	/**
	 * An uncommented item
	 */
	public static final TableField<DatatypesRecord, String> DEFINER = new TableFieldImpl<DatatypesRecord, String>("DEFINER", SQLDataType.VARCHAR, DATATYPES);

	/**
	 * An uncommented item
	 */
	public static final TableField<DatatypesRecord, String> REMARKS = new TableFieldImpl<DatatypesRecord, String>("REMARKS", SQLDataType.VARCHAR, DATATYPES);

	/**
	 * No further instances allowed
	 */
	private Datatypes() {
		super("DATATYPES", Syscat.SYSCAT);
	}
}
