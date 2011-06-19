/**
 * This class is generated by jOOQ
 */
package org.jooq.test.ingres.generatedclasses.tables;


import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.ForeignKey;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.SQLDataType;
import org.jooq.impl.TableFieldImpl;
import org.jooq.impl.UpdatableTableImpl;
import org.jooq.test.ingres.generatedclasses.Keys;
import org.jooq.test.ingres.generatedclasses.Test;
import org.jooq.test.ingres.generatedclasses.tables.records.XTestCase_64_69Record;


/**
 * This class is generated by jOOQ.
 */
@Generated(value    = "http://jooq.sourceforge.net",
           comments = "This class is generated by jOOQ")
public class XTestCase_64_69 extends UpdatableTableImpl<XTestCase_64_69Record> {

	private static final long serialVersionUID = 828317057;

	/**
	 * The singleton instance of x_test_case_64_69
	 */
	public static final XTestCase_64_69 X_TEST_CASE_64_69 = new XTestCase_64_69();

	/**
	 * The class holding records for this type
	 */
	private static final Class<XTestCase_64_69Record> __RECORD_TYPE = XTestCase_64_69Record.class;

	/**
	 * The class holding records for this type
	 */
	@Override
	public Class<XTestCase_64_69Record> getRecordType() {
		return __RECORD_TYPE;
	}

	/**
	 * An uncommented item
	 * 
	 * PRIMARY KEY
	 */
	public static final TableField<XTestCase_64_69Record, Integer> ID = new TableFieldImpl<XTestCase_64_69Record, Integer>("id", SQLDataType.INTEGER, X_TEST_CASE_64_69);

	/**
	 * An uncommented item
	 * <p>
	 * <code><pre>
	 * FOREIGN KEY [test.x_test_case_64_69.unused_id]
	 * REFERENCES x_unused [test.x_unused.id]
	 * </pre></code>
	 */
	public static final TableField<XTestCase_64_69Record, Integer> UNUSED_ID = new TableFieldImpl<XTestCase_64_69Record, Integer>("unused_id", SQLDataType.INTEGER, X_TEST_CASE_64_69);

	/**
	 * No further instances allowed
	 */
	private XTestCase_64_69() {
		super("x_test_case_64_69", Test.TEST);
	}

	@Override
	public UniqueKey<XTestCase_64_69Record> getMainKey() {
		return Keys.pk_x_test_case_64_69;
	}

	@Override
	@SuppressWarnings("unchecked")
	public List<UniqueKey<XTestCase_64_69Record>> getKeys() {
		return Arrays.<UniqueKey<XTestCase_64_69Record>>asList(Keys.pk_x_test_case_64_69);
	}

	@Override
	@SuppressWarnings("unchecked")
	public List<ForeignKey<XTestCase_64_69Record, ?>> getReferences() {
		return Arrays.<ForeignKey<XTestCase_64_69Record, ?>>asList(Keys.fk_x_test_case_64_69);
	}
}
