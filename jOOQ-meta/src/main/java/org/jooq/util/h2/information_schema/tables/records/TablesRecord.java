/**
 * This class is generated by jOOQ
 */
package org.jooq.util.h2.information_schema.tables.records;


import javax.annotation.Generated;

import org.jooq.impl.TableRecordImpl;
import org.jooq.util.h2.information_schema.tables.Tables;


/**
 * This class is generated by jOOQ.
 */
@Generated(value    = "http://jooq.sourceforge.net",
           comments = "This class is generated by jOOQ")
public class TablesRecord extends TableRecordImpl<TablesRecord> {

	private static final long serialVersionUID = -1217846792;

	/**
	 * An uncommented item
	 */
	public void setTableCatalog(String value) {
		setValue(Tables.TABLE_CATALOG, value);
	}

	/**
	 * An uncommented item
	 */
	public String getTableCatalog() {
		return getValue(Tables.TABLE_CATALOG);
	}

	/**
	 * An uncommented item
	 */
	public void setTableSchema(String value) {
		setValue(Tables.TABLE_SCHEMA, value);
	}

	/**
	 * An uncommented item
	 */
	public String getTableSchema() {
		return getValue(Tables.TABLE_SCHEMA);
	}

	/**
	 * An uncommented item
	 */
	public void setTableName(String value) {
		setValue(Tables.TABLE_NAME, value);
	}

	/**
	 * An uncommented item
	 */
	public String getTableName() {
		return getValue(Tables.TABLE_NAME);
	}

	/**
	 * An uncommented item
	 */
	public void setTableType(String value) {
		setValue(Tables.TABLE_TYPE, value);
	}

	/**
	 * An uncommented item
	 */
	public String getTableType() {
		return getValue(Tables.TABLE_TYPE);
	}

	/**
	 * An uncommented item
	 */
	public void setStorageType(String value) {
		setValue(Tables.STORAGE_TYPE, value);
	}

	/**
	 * An uncommented item
	 */
	public String getStorageType() {
		return getValue(Tables.STORAGE_TYPE);
	}

	/**
	 * An uncommented item
	 */
	public void setSql(String value) {
		setValue(Tables.SQL, value);
	}

	/**
	 * An uncommented item
	 */
	public String getSql() {
		return getValue(Tables.SQL);
	}

	/**
	 * An uncommented item
	 */
	public void setRemarks(String value) {
		setValue(Tables.REMARKS, value);
	}

	/**
	 * An uncommented item
	 */
	public String getRemarks() {
		return getValue(Tables.REMARKS);
	}

	/**
	 * An uncommented item
	 */
	public void setLastModification(Long value) {
		setValue(Tables.LAST_MODIFICATION, value);
	}

	/**
	 * An uncommented item
	 */
	public Long getLastModification() {
		return getValue(Tables.LAST_MODIFICATION);
	}

	/**
	 * An uncommented item
	 */
	public void setId(Integer value) {
		setValue(Tables.ID, value);
	}

	/**
	 * An uncommented item
	 */
	public Integer getId() {
		return getValue(Tables.ID);
	}

	/**
	 * An uncommented item
	 */
	public void setTypeName(String value) {
		setValue(Tables.TYPE_NAME, value);
	}

	/**
	 * An uncommented item
	 */
	public String getTypeName() {
		return getValue(Tables.TYPE_NAME);
	}

	/**
	 * An uncommented item
	 */
	public void setTableClass(String value) {
		setValue(Tables.TABLE_CLASS, value);
	}

	/**
	 * An uncommented item
	 */
	public String getTableClass() {
		return getValue(Tables.TABLE_CLASS);
	}
	/**
	 * Create a detached TablesRecord
	 */
	public TablesRecord() {
		super(Tables.TABLES);
	}
}
