/**
 * This class is generated by jOOQ
 */
package org.jooq.util.db2.syscat.tables.records;


import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.impl.TableRecordImpl;
import org.jooq.util.db2.syscat.tables.References;


/**
 * This class is generated by jOOQ.
 */
@Generated(value    = "http://jooq.sourceforge.net",
           comments = "This class is generated by jOOQ")
public class ReferencesRecord extends TableRecordImpl<ReferencesRecord> {

	private static final long serialVersionUID = -1227952969;

	/**
	 * An uncommented item
	 */
	public void setConstname(String value) {
		setValue(References.CONSTNAME, value);
	}

	/**
	 * An uncommented item
	 */
	public String getConstname() {
		return getValue(References.CONSTNAME);
	}

	/**
	 * An uncommented item
	 */
	public void setTabschema(String value) {
		setValue(References.TABSCHEMA, value);
	}

	/**
	 * An uncommented item
	 */
	public String getTabschema() {
		return getValue(References.TABSCHEMA);
	}

	/**
	 * An uncommented item
	 */
	public void setTabname(String value) {
		setValue(References.TABNAME, value);
	}

	/**
	 * An uncommented item
	 */
	public String getTabname() {
		return getValue(References.TABNAME);
	}

	/**
	 * An uncommented item
	 */
	public void setOwner(String value) {
		setValue(References.OWNER, value);
	}

	/**
	 * An uncommented item
	 */
	public String getOwner() {
		return getValue(References.OWNER);
	}

	/**
	 * An uncommented item
	 */
	public void setOwnertype(String value) {
		setValue(References.OWNERTYPE, value);
	}

	/**
	 * An uncommented item
	 */
	public String getOwnertype() {
		return getValue(References.OWNERTYPE);
	}

	/**
	 * An uncommented item
	 */
	public void setRefkeyname(String value) {
		setValue(References.REFKEYNAME, value);
	}

	/**
	 * An uncommented item
	 */
	public String getRefkeyname() {
		return getValue(References.REFKEYNAME);
	}

	/**
	 * An uncommented item
	 */
	public void setReftabschema(String value) {
		setValue(References.REFTABSCHEMA, value);
	}

	/**
	 * An uncommented item
	 */
	public String getReftabschema() {
		return getValue(References.REFTABSCHEMA);
	}

	/**
	 * An uncommented item
	 */
	public void setReftabname(String value) {
		setValue(References.REFTABNAME, value);
	}

	/**
	 * An uncommented item
	 */
	public String getReftabname() {
		return getValue(References.REFTABNAME);
	}

	/**
	 * An uncommented item
	 */
	public void setColcount(Short value) {
		setValue(References.COLCOUNT, value);
	}

	/**
	 * An uncommented item
	 */
	public Short getColcount() {
		return getValue(References.COLCOUNT);
	}

	/**
	 * An uncommented item
	 */
	public void setDeleterule(String value) {
		setValue(References.DELETERULE, value);
	}

	/**
	 * An uncommented item
	 */
	public String getDeleterule() {
		return getValue(References.DELETERULE);
	}

	/**
	 * An uncommented item
	 */
	public void setUpdaterule(String value) {
		setValue(References.UPDATERULE, value);
	}

	/**
	 * An uncommented item
	 */
	public String getUpdaterule() {
		return getValue(References.UPDATERULE);
	}

	/**
	 * An uncommented item
	 */
	public void setCreateTime(Timestamp value) {
		setValue(References.CREATE_TIME, value);
	}

	/**
	 * An uncommented item
	 */
	public Timestamp getCreateTime() {
		return getValue(References.CREATE_TIME);
	}

	/**
	 * An uncommented item
	 */
	public void setFkColnames(String value) {
		setValue(References.FK_COLNAMES, value);
	}

	/**
	 * An uncommented item
	 */
	public String getFkColnames() {
		return getValue(References.FK_COLNAMES);
	}

	/**
	 * An uncommented item
	 */
	public void setPkColnames(String value) {
		setValue(References.PK_COLNAMES, value);
	}

	/**
	 * An uncommented item
	 */
	public String getPkColnames() {
		return getValue(References.PK_COLNAMES);
	}

	/**
	 * An uncommented item
	 */
	public void setDefiner(String value) {
		setValue(References.DEFINER, value);
	}

	/**
	 * An uncommented item
	 */
	public String getDefiner() {
		return getValue(References.DEFINER);
	}
	/**
	 * Create a detached ReferencesRecord
	 */
	public ReferencesRecord() {
		super(References.REFERENCES);
	}
}
