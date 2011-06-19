/**
 * This class is generated by jOOQ
 */
package org.jooq.test.sybase.generatedclasses.tables.records;


import java.sql.SQLException;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Configuration;
import org.jooq.impl.UpdatableRecordImpl;
import org.jooq.test.sybase.generatedclasses.tables.XTestCase_64_69;
import org.jooq.test.sybase.generatedclasses.tables.XTestCase_71;
import org.jooq.test.sybase.generatedclasses.tables.XUnused;


/**
 * This class is generated by jOOQ.
 */
@Generated(value    = "http://jooq.sourceforge.net",
           comments = "This class is generated by jOOQ")
public class XTestCase_64_69Record extends UpdatableRecordImpl<XTestCase_64_69Record> {

	private static final long serialVersionUID = -222046922;

	/**
	 * An uncommented item
	 * 
	 * PRIMARY KEY
	 */
	public void setId(Integer value) {
		setValue(XTestCase_64_69.ID, value);
	}

	/**
	 * An uncommented item
	 * 
	 * PRIMARY KEY
	 */
	public Integer getId() {
		return getValue(XTestCase_64_69.ID);
	}

	/**
	 * An uncommented item
	 * 
	 * PRIMARY KEY
	 */
	public List<XTestCase_71Record> fetchXTestCase_71List() throws SQLException {
		return create()
			.selectFrom(XTestCase_71.X_TEST_CASE_71)
			.where(XTestCase_71.TEST_CASE_64_69_ID.equal(getValue(XTestCase_64_69.ID)))
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
	public List<XTestCase_71Record> getXTestCase_71List() throws SQLException {
		return create()
			.selectFrom(XTestCase_71.X_TEST_CASE_71)
			.where(XTestCase_71.TEST_CASE_64_69_ID.equal(getValue(XTestCase_64_69.ID)))
			.fetch()
			.getRecords();
	}

	/**
	 * An uncommented item
	 * <p>
	 * <code><pre>
	 * FOREIGN KEY [dba.x_test_case_64_69.UNUSED_ID]
	 * REFERENCES x_unused [dba.x_unused.ID]
	 * </pre></code>
	 */
	public void setUnusedId(Integer value) {
		setValue(XTestCase_64_69.UNUSED_ID, value);
	}

	/**
	 * An uncommented item
	 * <p>
	 * <code><pre>
	 * FOREIGN KEY [dba.x_test_case_64_69.UNUSED_ID]
	 * REFERENCES x_unused [dba.x_unused.ID]
	 * </pre></code>
	 */
	public Integer getUnusedId() {
		return getValue(XTestCase_64_69.UNUSED_ID);
	}

	/**
	 * An uncommented item
	 * <p>
	 * <code><pre>
	 * FOREIGN KEY [dba.x_test_case_64_69.UNUSED_ID]
	 * REFERENCES x_unused [dba.x_unused.ID]
	 * </pre></code>
	 */
	public XUnusedRecord fetchXUnused() throws SQLException {
		return create()
			.selectFrom(XUnused.X_UNUSED)
			.where(XUnused.ID.equal(getValue(XTestCase_64_69.UNUSED_ID)))
			.fetchOne();
	}

	/**
	 * An uncommented item
	 * <p>
	 * <code><pre>
	 * FOREIGN KEY [dba.x_test_case_64_69.UNUSED_ID]
	 * REFERENCES x_unused [dba.x_unused.ID]
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
			.where(XUnused.ID.equal(getValue(XTestCase_64_69.UNUSED_ID)))
			.fetchOne();
	}
	/**
	 * Create a detached XTestCase_64_69Record
	 */
	public XTestCase_64_69Record() {
		super(XTestCase_64_69.X_TEST_CASE_64_69);
	}

	/**
	 * Create an attached XTestCase_64_69Record
	 */
	public XTestCase_64_69Record(Configuration configuration) {
		super(XTestCase_64_69.X_TEST_CASE_64_69, configuration);
	}
}
