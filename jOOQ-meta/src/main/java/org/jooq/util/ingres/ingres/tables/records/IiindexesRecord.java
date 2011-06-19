/**
 * This class is generated by jOOQ
 */
package org.jooq.util.ingres.ingres.tables.records;


import javax.annotation.Generated;

import org.jooq.impl.TableRecordImpl;
import org.jooq.util.ingres.ingres.tables.Iiindexes;


/**
 * This class is generated by jOOQ.
 */
@Generated(value    = "http://jooq.sourceforge.net",
           comments = "This class is generated by jOOQ")
public class IiindexesRecord extends TableRecordImpl<IiindexesRecord> {

	private static final long serialVersionUID = 1038373593;

	/**
	 * An uncommented item
	 */
	public void setIndexName(String value) {
		setValue(Iiindexes.INDEX_NAME, value);
	}

	/**
	 * An uncommented item
	 */
	public String getIndexName() {
		return getValue(Iiindexes.INDEX_NAME);
	}

	/**
	 * An uncommented item
	 */
	public void setIndexOwner(String value) {
		setValue(Iiindexes.INDEX_OWNER, value);
	}

	/**
	 * An uncommented item
	 */
	public String getIndexOwner() {
		return getValue(Iiindexes.INDEX_OWNER);
	}

	/**
	 * An uncommented item
	 */
	public void setCreateDate(String value) {
		setValue(Iiindexes.CREATE_DATE, value);
	}

	/**
	 * An uncommented item
	 */
	public String getCreateDate() {
		return getValue(Iiindexes.CREATE_DATE);
	}

	/**
	 * An uncommented item
	 */
	public void setBaseName(String value) {
		setValue(Iiindexes.BASE_NAME, value);
	}

	/**
	 * An uncommented item
	 */
	public String getBaseName() {
		return getValue(Iiindexes.BASE_NAME);
	}

	/**
	 * An uncommented item
	 */
	public void setBaseOwner(String value) {
		setValue(Iiindexes.BASE_OWNER, value);
	}

	/**
	 * An uncommented item
	 */
	public String getBaseOwner() {
		return getValue(Iiindexes.BASE_OWNER);
	}

	/**
	 * An uncommented item
	 */
	public void setStorageStructure(String value) {
		setValue(Iiindexes.STORAGE_STRUCTURE, value);
	}

	/**
	 * An uncommented item
	 */
	public String getStorageStructure() {
		return getValue(Iiindexes.STORAGE_STRUCTURE);
	}

	/**
	 * An uncommented item
	 */
	public void setIsCompressed(String value) {
		setValue(Iiindexes.IS_COMPRESSED, value);
	}

	/**
	 * An uncommented item
	 */
	public String getIsCompressed() {
		return getValue(Iiindexes.IS_COMPRESSED);
	}

	/**
	 * An uncommented item
	 */
	public void setKeyIsCompressed(String value) {
		setValue(Iiindexes.KEY_IS_COMPRESSED, value);
	}

	/**
	 * An uncommented item
	 */
	public String getKeyIsCompressed() {
		return getValue(Iiindexes.KEY_IS_COMPRESSED);
	}

	/**
	 * An uncommented item
	 */
	public void setUniqueRule(String value) {
		setValue(Iiindexes.UNIQUE_RULE, value);
	}

	/**
	 * An uncommented item
	 */
	public String getUniqueRule() {
		return getValue(Iiindexes.UNIQUE_RULE);
	}

	/**
	 * An uncommented item
	 */
	public void setUniqueScope(String value) {
		setValue(Iiindexes.UNIQUE_SCOPE, value);
	}

	/**
	 * An uncommented item
	 */
	public String getUniqueScope() {
		return getValue(Iiindexes.UNIQUE_SCOPE);
	}

	/**
	 * An uncommented item
	 */
	public void setSystemUse(String value) {
		setValue(Iiindexes.SYSTEM_USE, value);
	}

	/**
	 * An uncommented item
	 */
	public String getSystemUse() {
		return getValue(Iiindexes.SYSTEM_USE);
	}

	/**
	 * An uncommented item
	 */
	public void setPersistent(String value) {
		setValue(Iiindexes.PERSISTENT, value);
	}

	/**
	 * An uncommented item
	 */
	public String getPersistent() {
		return getValue(Iiindexes.PERSISTENT);
	}

	/**
	 * An uncommented item
	 */
	public void setIndexPagesize(Integer value) {
		setValue(Iiindexes.INDEX_PAGESIZE, value);
	}

	/**
	 * An uncommented item
	 */
	public Integer getIndexPagesize() {
		return getValue(Iiindexes.INDEX_PAGESIZE);
	}
	/**
	 * Create a detached IiindexesRecord
	 */
	public IiindexesRecord() {
		super(Iiindexes.IIINDEXES);
	}
}
