/**
 * This class is generated by jOOQ
 */
package org.jooq.test.db2.generatedclasses.tables;


import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.ForeignKey;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.SQLDataType;
import org.jooq.impl.TableFieldImpl;
import org.jooq.impl.UpdatableTableImpl;
import org.jooq.test.db2.generatedclasses.Keys;
import org.jooq.test.db2.generatedclasses.Lukas;
import org.jooq.test.db2.generatedclasses.tables.records.XTestCase_85Record;


/**
 * This class is generated by jOOQ.
 */
@Generated(value    = "http://jooq.sourceforge.net",
           comments = "This class is generated by jOOQ")
public class XTestCase_85 extends UpdatableTableImpl<XTestCase_85Record> {

	private static final long serialVersionUID = 1951696483;

	/**
	 * The singleton instance of X_TEST_CASE_85
	 */
	public static final XTestCase_85 X_TEST_CASE_85 = new XTestCase_85();

	/**
	 * The class holding records for this type
	 */
	private static final Class<XTestCase_85Record> __RECORD_TYPE = XTestCase_85Record.class;

	/**
	 * The class holding records for this type
	 */
	@Override
	public Class<XTestCase_85Record> getRecordType() {
		return __RECORD_TYPE;
	}

	/**
	 * An uncommented item
	 * 
	 * PRIMARY KEY
	 */
	public static final TableField<XTestCase_85Record, Integer> ID = new TableFieldImpl<XTestCase_85Record, Integer>("ID", SQLDataType.INTEGER, X_TEST_CASE_85);

	/**
	 * An uncommented item
	 * <p>
	 * <code><pre>
	 * FOREIGN KEY [LUKAS.X_TEST_CASE_85.X_UNUSED_ID, LUKAS.X_TEST_CASE_85.X_UNUSED_NAME]
	 * REFERENCES X_UNUSED [LUKAS.X_UNUSED.ID, LUKAS.X_UNUSED.NAME]
	 * </pre></code>
	 */
	public static final TableField<XTestCase_85Record, Integer> X_UNUSED_ID = new TableFieldImpl<XTestCase_85Record, Integer>("X_UNUSED_ID", SQLDataType.INTEGER, X_TEST_CASE_85);

	/**
	 * An uncommented item
	 * <p>
	 * <code><pre>
	 * FOREIGN KEY [LUKAS.X_TEST_CASE_85.X_UNUSED_ID, LUKAS.X_TEST_CASE_85.X_UNUSED_NAME]
	 * REFERENCES X_UNUSED [LUKAS.X_UNUSED.ID, LUKAS.X_UNUSED.NAME]
	 * </pre></code>
	 */
	public static final TableField<XTestCase_85Record, String> X_UNUSED_NAME = new TableFieldImpl<XTestCase_85Record, String>("X_UNUSED_NAME", SQLDataType.VARCHAR, X_TEST_CASE_85);

	/**
	 * No further instances allowed
	 */
	private XTestCase_85() {
		super("X_TEST_CASE_85", Lukas.LUKAS);
	}

	@Override
	public UniqueKey<XTestCase_85Record> getMainKey() {
		return Keys.PK_X_TEST_CASE_85;
	}

	@Override
	@SuppressWarnings("unchecked")
	public List<UniqueKey<XTestCase_85Record>> getKeys() {
		return Arrays.<UniqueKey<XTestCase_85Record>>asList(Keys.PK_X_TEST_CASE_85);
	}

	@Override
	@SuppressWarnings("unchecked")
	public List<ForeignKey<XTestCase_85Record, ?>> getReferences() {
		return Arrays.<ForeignKey<XTestCase_85Record, ?>>asList(Keys.FK_X_TEST_CASE_85);
	}
}
