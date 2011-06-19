/**
 * This class is generated by jOOQ
 */
package org.jooq.test.ingres.generatedclasses.tables;


import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Identity;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.SQLDataType;
import org.jooq.impl.TableFieldImpl;
import org.jooq.impl.UpdatableTableImpl;
import org.jooq.test.ingres.generatedclasses.Keys;
import org.jooq.test.ingres.generatedclasses.Test;
import org.jooq.test.ingres.generatedclasses.tables.records.TBookStoreRecord;


/**
 * This class is generated by jOOQ.
 */
@Generated(value    = "http://jooq.sourceforge.net",
           comments = "This class is generated by jOOQ")
public class TBookStore extends UpdatableTableImpl<TBookStoreRecord> {

	private static final long serialVersionUID = -1167589962;

	/**
	 * The singleton instance of t_book_store
	 */
	public static final TBookStore T_BOOK_STORE = new TBookStore();

	/**
	 * The class holding records for this type
	 */
	private static final Class<TBookStoreRecord> __RECORD_TYPE = TBookStoreRecord.class;

	/**
	 * The class holding records for this type
	 */
	@Override
	public Class<TBookStoreRecord> getRecordType() {
		return __RECORD_TYPE;
	}

	/**
	 * An uncommented item
	 */
	public static final TableField<TBookStoreRecord, Integer> ID = new TableFieldImpl<TBookStoreRecord, Integer>("id", SQLDataType.INTEGER, T_BOOK_STORE);

	/**
	 * An uncommented item
	 * 
	 * PRIMARY KEY
	 */
	public static final TableField<TBookStoreRecord, String> NAME = new TableFieldImpl<TBookStoreRecord, String>("name", SQLDataType.VARCHAR, T_BOOK_STORE);

	/**
	 * No further instances allowed
	 */
	private TBookStore() {
		super("t_book_store", Test.TEST);
	}

	@Override
	public Identity<TBookStoreRecord, Integer> getIdentity() {
		return Keys.IDENTITY_t_book_store;
	}

	@Override
	public UniqueKey<TBookStoreRecord> getMainKey() {
		return Keys.uk_t_book_store_name;
	}

	@Override
	@SuppressWarnings("unchecked")
	public List<UniqueKey<TBookStoreRecord>> getKeys() {
		return Arrays.<UniqueKey<TBookStoreRecord>>asList(Keys.uk_t_book_store_name);
	}
}
