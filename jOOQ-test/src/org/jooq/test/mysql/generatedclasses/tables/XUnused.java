/**
 * This class is generated by jOOQ
 */
package org.jooq.test.mysql.generatedclasses.tables;


import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.ForeignKey;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.SQLDataType;
import org.jooq.impl.TableFieldImpl;
import org.jooq.impl.UpdatableTableImpl;
import org.jooq.test.mysql.generatedclasses.Keys;
import org.jooq.test.mysql.generatedclasses.Test;
import org.jooq.test.mysql.generatedclasses.tables.records.XUnusedRecord;


/**
 * This class is generated by jOOQ.
 *
 * An unused table in the same schema.
 */
@Generated(value    = "http://jooq.sourceforge.net",
           comments = "This class is generated by jOOQ")
public class XUnused extends UpdatableTableImpl<XUnusedRecord> {

	private static final long serialVersionUID = -1770123773;

	/**
	 * The singleton instance of x_unused
	 */
	public static final XUnused X_UNUSED = new XUnused();

	/**
	 * The class holding records for this type
	 */
	private static final Class<XUnusedRecord> __RECORD_TYPE = XUnusedRecord.class;

	/**
	 * The class holding records for this type
	 */
	@Override
	public Class<XUnusedRecord> getRecordType() {
		return __RECORD_TYPE;
	}

	/**
	 * An uncommented item
	 * 
	 * PRIMARY KEY
	 */
	public static final TableField<XUnusedRecord, Integer> ID = new TableFieldImpl<XUnusedRecord, Integer>("ID", SQLDataType.INTEGER, X_UNUSED);

	/**
	 * An uncommented item
	 * 
	 * PRIMARY KEY
	 */
	public static final TableField<XUnusedRecord, String> NAME = new TableFieldImpl<XUnusedRecord, String>("NAME", SQLDataType.VARCHAR, X_UNUSED);

	/**
	 * An uncommented item
	 */
	public static final TableField<XUnusedRecord, BigDecimal> BIG_INTEGER = new TableFieldImpl<XUnusedRecord, BigDecimal>("BIG_INTEGER", SQLDataType.DECIMAL, X_UNUSED);

	/**
	 * An uncommented item
	 * <p>
	 * <code><pre>
	 * FOREIGN KEY [test.x_unused.ID_REF, test.x_unused.NAME_REF]
	 * REFERENCES x_unused [test.x_unused.ID, test.x_unused.NAME]
	 * </pre></code>
	 */
	public static final TableField<XUnusedRecord, Integer> ID_REF = new TableFieldImpl<XUnusedRecord, Integer>("ID_REF", SQLDataType.INTEGER, X_UNUSED);

	/**
	 * An uncommented item
	 * <p>
	 * <code><pre>
	 * FOREIGN KEY [test.x_unused.ID_REF, test.x_unused.NAME_REF]
	 * REFERENCES x_unused [test.x_unused.ID, test.x_unused.NAME]
	 * </pre></code>
	 */
	public static final TableField<XUnusedRecord, String> NAME_REF = new TableFieldImpl<XUnusedRecord, String>("NAME_REF", SQLDataType.VARCHAR, X_UNUSED);

	/**
	 * An uncommented item
	 */
	public static final TableField<XUnusedRecord, Integer> CLASS = new TableFieldImpl<XUnusedRecord, Integer>("CLASS", SQLDataType.INTEGER, X_UNUSED);

	/**
	 * An uncommented item
	 */
	public static final TableField<XUnusedRecord, Integer> FIELDS = new TableFieldImpl<XUnusedRecord, Integer>("FIELDS", SQLDataType.INTEGER, X_UNUSED);

	/**
	 * An uncommented item
	 */
	public static final TableField<XUnusedRecord, Integer> CONFIGURATION = new TableFieldImpl<XUnusedRecord, Integer>("CONFIGURATION", SQLDataType.INTEGER, X_UNUSED);

	/**
	 * An uncommented item
	 */
	public static final TableField<XUnusedRecord, Integer> U_D_T = new TableFieldImpl<XUnusedRecord, Integer>("U_D_T", SQLDataType.INTEGER, X_UNUSED);

	/**
	 * An uncommented item
	 */
	public static final TableField<XUnusedRecord, Integer> META_DATA = new TableFieldImpl<XUnusedRecord, Integer>("META_DATA", SQLDataType.INTEGER, X_UNUSED);

	/**
	 * An uncommented item
	 */
	public static final TableField<XUnusedRecord, Integer> TYPE0 = new TableFieldImpl<XUnusedRecord, Integer>("TYPE0", SQLDataType.INTEGER, X_UNUSED);

	/**
	 * An uncommented item
	 */
	public static final TableField<XUnusedRecord, Integer> PRIMARY_KEY = new TableFieldImpl<XUnusedRecord, Integer>("PRIMARY_KEY", SQLDataType.INTEGER, X_UNUSED);

	/**
	 * An uncommented item
	 */
	public static final TableField<XUnusedRecord, Integer> PRIMARYKEY = new TableFieldImpl<XUnusedRecord, Integer>("PRIMARYKEY", SQLDataType.INTEGER, X_UNUSED);

	/**
	 * No further instances allowed
	 */
	private XUnused() {
		super("x_unused", Test.TEST);
	}

	@Override
	public UniqueKey<XUnusedRecord> getMainKey() {
		return Keys.KEY_x_unused_PRIMARY;
	}

	@Override
	@SuppressWarnings("unchecked")
	public List<UniqueKey<XUnusedRecord>> getKeys() {
		return Arrays.<UniqueKey<XUnusedRecord>>asList(Keys.KEY_x_unused_PRIMARY, Keys.KEY_x_unused_uk_x_unused_id);
	}

	@Override
	@SuppressWarnings("unchecked")
	public List<ForeignKey<XUnusedRecord, ?>> getReferences() {
		return Arrays.<ForeignKey<XUnusedRecord, ?>>asList(Keys.fk_x_unused_self);
	}
}
