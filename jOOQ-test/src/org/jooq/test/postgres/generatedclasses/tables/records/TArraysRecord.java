/**
 * This class is generated by jOOQ
 */
package org.jooq.test.postgres.generatedclasses.tables.records;


import java.sql.Date;

import javax.annotation.Generated;

import org.jooq.Configuration;
import org.jooq.impl.UpdatableRecordImpl;
import org.jooq.test.postgres.generatedclasses.enums.UCountry;
import org.jooq.test.postgres.generatedclasses.tables.TArrays;
import org.jooq.test.postgres.generatedclasses.udt.records.UStreetTypeRecord;


/**
 * This class is generated by jOOQ.
 */
@Generated(value    = "http://jooq.sourceforge.net",
           comments = "This class is generated by jOOQ")
public class TArraysRecord extends UpdatableRecordImpl<TArraysRecord> {

	private static final long serialVersionUID = -1943367090;

	/**
	 * An uncommented item
	 * 
	 * PRIMARY KEY
	 */
	public void setId(Integer value) {
		setValue(TArrays.ID, value);
	}

	/**
	 * An uncommented item
	 * 
	 * PRIMARY KEY
	 */
	public Integer getId() {
		return getValue(TArrays.ID);
	}

	/**
	 * An uncommented item
	 */
	public void setStringArray(String[] value) {
		setValue(TArrays.STRING_ARRAY, value);
	}

	/**
	 * An uncommented item
	 */
	public String[] getStringArray() {
		return getValue(TArrays.STRING_ARRAY);
	}

	/**
	 * An uncommented item
	 */
	public void setNumberArray(Integer[] value) {
		setValue(TArrays.NUMBER_ARRAY, value);
	}

	/**
	 * An uncommented item
	 */
	public Integer[] getNumberArray() {
		return getValue(TArrays.NUMBER_ARRAY);
	}

	/**
	 * An uncommented item
	 */
	public void setDateArray(Date[] value) {
		setValue(TArrays.DATE_ARRAY, value);
	}

	/**
	 * An uncommented item
	 */
	public Date[] getDateArray() {
		return getValue(TArrays.DATE_ARRAY);
	}

	/**
	 * An uncommented item
	 */
	public void setUdtArray(UStreetTypeRecord[] value) {
		setValue(TArrays.UDT_ARRAY, value);
	}

	/**
	 * An uncommented item
	 */
	public UStreetTypeRecord[] getUdtArray() {
		return getValue(TArrays.UDT_ARRAY);
	}

	/**
	 * An uncommented item
	 */
	public void setEnumArray(UCountry[] value) {
		setValue(TArrays.ENUM_ARRAY, value);
	}

	/**
	 * An uncommented item
	 */
	public UCountry[] getEnumArray() {
		return getValue(TArrays.ENUM_ARRAY);
	}

	/**
	 * An uncommented item
	 */
	public void setArrayArray(Integer[] value) {
		setValue(TArrays.ARRAY_ARRAY, value);
	}

	/**
	 * An uncommented item
	 */
	public Integer[] getArrayArray() {
		return getValue(TArrays.ARRAY_ARRAY);
	}
	/**
	 * Create a detached TArraysRecord
	 */
	public TArraysRecord() {
		super(TArrays.T_ARRAYS);
	}

	/**
	 * Create an attached TArraysRecord
	 */
	public TArraysRecord(Configuration configuration) {
		super(TArrays.T_ARRAYS, configuration);
	}
}
