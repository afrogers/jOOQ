/**
 * This class is generated by jOOQ
 */
package org.jooq.test.sybase.generatedclasses.tables.records;


import java.math.BigDecimal;
import java.sql.SQLException;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Configuration;
import org.jooq.impl.UpdatableRecordImpl;
import org.jooq.test.sybase.generatedclasses.tables.XTestCase_64_69;
import org.jooq.test.sybase.generatedclasses.tables.XTestCase_85;
import org.jooq.test.sybase.generatedclasses.tables.XUnused;


/**
 * This class is generated by jOOQ.
 */
@Generated(value    = "http://jooq.sourceforge.net",
           comments = "This class is generated by jOOQ")
public class XUnusedRecord extends UpdatableRecordImpl<XUnusedRecord> {

	private static final long serialVersionUID = 2095292298;

	/**
	 * An uncommented item
	 * 
	 * PRIMARY KEY
	 */
	public void setId(Integer value) {
		setValue(XUnused.ID, value);
	}

	/**
	 * An uncommented item
	 * 
	 * PRIMARY KEY
	 */
	public Integer getId() {
		return getValue(XUnused.ID);
	}

	/**
	 * An uncommented item
	 * 
	 * PRIMARY KEY
	 */
	public List<XTestCase_85Record> fetchXTestCase_85List() throws SQLException {
		return create()
			.selectFrom(XTestCase_85.X_TEST_CASE_85)
			.where(XTestCase_85.X_UNUSED_ID.equal(getValue(XUnused.ID)))
			.and(XTestCase_85.X_UNUSED_NAME.equal(getValue(XUnused.NAME)))
			.fetch()
			.getRecords();
	}

	/**
	 * An uncommented item
	 * 
	 * PRIMARY KEY
	 *
	 * @deprecated Because of risk of ambiguity (#187), code generation for this<br/>
	 *             method will not be supported anymore, soon.<br/><br/>
	 *             If you wish to remove this method, adapt your configuration:<br/>
	 *             <code>generator.generate.deprecated=false</code>
	 */
	@Deprecated
	public List<XTestCase_85Record> getXTestCase_85List() throws SQLException {
		return create()
			.selectFrom(XTestCase_85.X_TEST_CASE_85)
			.where(XTestCase_85.X_UNUSED_ID.equal(getValue(XUnused.ID)))
			.and(XTestCase_85.X_UNUSED_NAME.equal(getValue(XUnused.NAME)))
			.fetch()
			.getRecords();
	}

	/**
	 * An uncommented item
	 * 
	 * PRIMARY KEY
	 */
	public List<XUnusedRecord> fetchXUnusedList() throws SQLException {
		return create()
			.selectFrom(XUnused.X_UNUSED)
			.where(XUnused.ID_REF.equal(getValue(XUnused.ID)))
			.and(XUnused.NAME_REF.equal(getValue(XUnused.NAME)))
			.fetch()
			.getRecords();
	}

	/**
	 * An uncommented item
	 * 
	 * PRIMARY KEY
	 *
	 * @deprecated Because of risk of ambiguity (#187), code generation for this<br/>
	 *             method will not be supported anymore, soon.<br/><br/>
	 *             If you wish to remove this method, adapt your configuration:<br/>
	 *             <code>generator.generate.deprecated=false</code>
	 */
	@Deprecated
	public List<XUnusedRecord> getXUnusedList() throws SQLException {
		return create()
			.selectFrom(XUnused.X_UNUSED)
			.where(XUnused.ID_REF.equal(getValue(XUnused.ID)))
			.and(XUnused.NAME_REF.equal(getValue(XUnused.NAME)))
			.fetch()
			.getRecords();
	}

	/**
	 * An uncommented item
	 * 
	 * PRIMARY KEY
	 */
	public List<XTestCase_64_69Record> fetchXTestCase_64_69List() throws SQLException {
		return create()
			.selectFrom(XTestCase_64_69.X_TEST_CASE_64_69)
			.where(XTestCase_64_69.UNUSED_ID.equal(getValue(XUnused.ID)))
			.fetch()
			.getRecords();
	}

	/**
	 * An uncommented item
	 * 
	 * PRIMARY KEY
	 *
	 * @deprecated Because of risk of ambiguity (#187), code generation for this<br/>
	 *             method will not be supported anymore, soon.<br/><br/>
	 *             If you wish to remove this method, adapt your configuration:<br/>
	 *             <code>generator.generate.deprecated=false</code>
	 */
	@Deprecated
	public List<XTestCase_64_69Record> getXTestCase_64_69List() throws SQLException {
		return create()
			.selectFrom(XTestCase_64_69.X_TEST_CASE_64_69)
			.where(XTestCase_64_69.UNUSED_ID.equal(getValue(XUnused.ID)))
			.fetch()
			.getRecords();
	}

	/**
	 * An uncommented item
	 * 
	 * PRIMARY KEY
	 */
	public void setName(String value) {
		setValue(XUnused.NAME, value);
	}

	/**
	 * An uncommented item
	 * 
	 * PRIMARY KEY
	 */
	public String getName() {
		return getValue(XUnused.NAME);
	}

	/**
	 * An uncommented item
	 */
	public void setBigInteger_(BigDecimal value) {
		setValue(XUnused.BIG_INTEGER, value);
	}

	/**
	 * An uncommented item
	 */
	public BigDecimal getBigInteger_() {
		return getValue(XUnused.BIG_INTEGER);
	}

	/**
	 * An uncommented item
	 * <p>
	 * <code><pre>
	 * FOREIGN KEY [dba.x_unused.ID_REF, dba.x_unused.NAME_REF]
	 * REFERENCES x_unused [dba.x_unused.ID, dba.x_unused.NAME]
	 * </pre></code>
	 */
	public void setIdRef(Integer value) {
		setValue(XUnused.ID_REF, value);
	}

	/**
	 * An uncommented item
	 * <p>
	 * <code><pre>
	 * FOREIGN KEY [dba.x_unused.ID_REF, dba.x_unused.NAME_REF]
	 * REFERENCES x_unused [dba.x_unused.ID, dba.x_unused.NAME]
	 * </pre></code>
	 */
	public Integer getIdRef() {
		return getValue(XUnused.ID_REF);
	}

	/**
	 * An uncommented item
	 * <p>
	 * <code><pre>
	 * FOREIGN KEY [dba.x_unused.ID_REF, dba.x_unused.NAME_REF]
	 * REFERENCES x_unused [dba.x_unused.ID, dba.x_unused.NAME]
	 * </pre></code>
	 */
	public XUnusedRecord fetchXUnused() throws SQLException {
		return create()
			.selectFrom(XUnused.X_UNUSED)
			.where(XUnused.ID.equal(getValue(XUnused.ID_REF)))
			.and(XUnused.NAME.equal(getValue(XUnused.NAME_REF)))
			.fetchOne();
	}

	/**
	 * An uncommented item
	 * <p>
	 * <code><pre>
	 * FOREIGN KEY [dba.x_unused.ID_REF, dba.x_unused.NAME_REF]
	 * REFERENCES x_unused [dba.x_unused.ID, dba.x_unused.NAME]
	 * </pre></code>
	 *
	 * @deprecated Because of risk of ambiguity (#187), code generation for this<br/>
	 *             method will not be supported anymore, soon.<br/><br/>
	 *             If you wish to remove this method, adapt your configuration:<br/>
	 *             <code>generator.generate.deprecated=false</code>
	 */
	@Deprecated
	public XUnusedRecord getXUnused() throws SQLException {
		return create()
			.selectFrom(XUnused.X_UNUSED)
			.where(XUnused.ID.equal(getValue(XUnused.ID_REF)))
			.and(XUnused.NAME.equal(getValue(XUnused.NAME_REF)))
			.fetchOne();
	}

	/**
	 * An uncommented item
	 * <p>
	 * <code><pre>
	 * FOREIGN KEY [dba.x_unused.ID_REF, dba.x_unused.NAME_REF]
	 * REFERENCES x_unused [dba.x_unused.ID, dba.x_unused.NAME]
	 * </pre></code>
	 */
	public void setNameRef(String value) {
		setValue(XUnused.NAME_REF, value);
	}

	/**
	 * An uncommented item
	 * <p>
	 * <code><pre>
	 * FOREIGN KEY [dba.x_unused.ID_REF, dba.x_unused.NAME_REF]
	 * REFERENCES x_unused [dba.x_unused.ID, dba.x_unused.NAME]
	 * </pre></code>
	 */
	public String getNameRef() {
		return getValue(XUnused.NAME_REF);
	}

	/**
	 * An uncommented item
	 */
	public void setClass_(Integer value) {
		setValue(XUnused.CLASS, value);
	}

	/**
	 * An uncommented item
	 */
	public Integer getClass_() {
		return getValue(XUnused.CLASS);
	}

	/**
	 * An uncommented item
	 * 
	 * This item causes a name clash. That is why an underline character was appended to the Java field name
	 */
	public void setFields_(Integer value) {
		setValue(XUnused.FIELDS, value);
	}

	/**
	 * An uncommented item
	 * 
	 * This item causes a name clash. That is why an underline character was appended to the Java field name
	 */
	public Integer getFields_() {
		return getValue(XUnused.FIELDS);
	}

	/**
	 * An uncommented item
	 * 
	 * This item causes a name clash. That is why an underline character was appended to the Java field name
	 */
	public void setConfiguration_(Integer value) {
		setValue(XUnused.CONFIGURATION, value);
	}

	/**
	 * An uncommented item
	 * 
	 * This item causes a name clash. That is why an underline character was appended to the Java field name
	 */
	public Integer getConfiguration_() {
		return getValue(XUnused.CONFIGURATION);
	}

	/**
	 * An uncommented item
	 */
	public void setUDT(Integer value) {
		setValue(XUnused.U_D_T, value);
	}

	/**
	 * An uncommented item
	 */
	public Integer getUDT() {
		return getValue(XUnused.U_D_T);
	}

	/**
	 * An uncommented item
	 * 
	 * This item causes a name clash. That is why an underline character was appended to the Java field name
	 */
	public void setMetaData_(Integer value) {
		setValue(XUnused.META_DATA, value);
	}

	/**
	 * An uncommented item
	 * 
	 * This item causes a name clash. That is why an underline character was appended to the Java field name
	 */
	public Integer getMetaData_() {
		return getValue(XUnused.META_DATA);
	}

	/**
	 * An uncommented item
	 * 
	 * This item causes a name clash. That is why an underline character was appended to the Java field name
	 */
	public void setType0_(Integer value) {
		setValue(XUnused.TYPE0, value);
	}

	/**
	 * An uncommented item
	 * 
	 * This item causes a name clash. That is why an underline character was appended to the Java field name
	 */
	public Integer getType0_() {
		return getValue(XUnused.TYPE0);
	}

	/**
	 * An uncommented item
	 * 
	 * This item causes a name clash. That is why an underline character was appended to the Java field name
	 */
	public void setPrimaryKey_(Integer value) {
		setValue(XUnused.PRIMARY_KEY, value);
	}

	/**
	 * An uncommented item
	 * 
	 * This item causes a name clash. That is why an underline character was appended to the Java field name
	 */
	public Integer getPrimaryKey_() {
		return getValue(XUnused.PRIMARY_KEY);
	}

	/**
	 * An uncommented item
	 */
	public void setPrimarykey(Integer value) {
		setValue(XUnused.PRIMARYKEY, value);
	}

	/**
	 * An uncommented item
	 */
	public Integer getPrimarykey() {
		return getValue(XUnused.PRIMARYKEY);
	}
	/**
	 * Create a detached XUnusedRecord
	 */
	public XUnusedRecord() {
		super(XUnused.X_UNUSED);
	}

	/**
	 * Create an attached XUnusedRecord
	 */
	public XUnusedRecord(Configuration configuration) {
		super(XUnused.X_UNUSED, configuration);
	}
}
