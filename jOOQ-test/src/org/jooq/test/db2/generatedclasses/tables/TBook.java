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
import org.jooq.test.db2.generatedclasses.enums.TLanguage;
import org.jooq.test.db2.generatedclasses.tables.records.TBookRecord;


/**
 * This class is generated by jOOQ.
 */
@Generated(value    = "http://jooq.sourceforge.net",
           comments = "This class is generated by jOOQ")
public class TBook extends UpdatableTableImpl<TBookRecord> {

	private static final long serialVersionUID = 2042431817;

	/**
	 * The singleton instance of T_BOOK
	 */
	public static final TBook T_BOOK = new TBook();

	/**
	 * The class holding records for this type
	 */
	private static final Class<TBookRecord> __RECORD_TYPE = TBookRecord.class;

	/**
	 * The class holding records for this type
	 */
	@Override
	public Class<TBookRecord> getRecordType() {
		return __RECORD_TYPE;
	}

	/**
	 * An uncommented item
	 * 
	 * PRIMARY KEY
	 */
	public static final TableField<TBookRecord, Integer> ID = new TableFieldImpl<TBookRecord, Integer>("ID", SQLDataType.INTEGER, T_BOOK);

	/**
	 * An uncommented item
	 * <p>
	 * <code><pre>
	 * FOREIGN KEY [LUKAS.T_BOOK.AUTHOR_ID]
	 * REFERENCES T_AUTHOR [LUKAS.T_AUTHOR.ID]
	 * </pre></code>
	 */
	public static final TableField<TBookRecord, Integer> AUTHOR_ID = new TableFieldImpl<TBookRecord, Integer>("AUTHOR_ID", SQLDataType.INTEGER, T_BOOK);

	/**
	 * An uncommented item
	 * <p>
	 * <code><pre>
	 * FOREIGN KEY [LUKAS.T_BOOK.CO_AUTHOR_ID]
	 * REFERENCES T_AUTHOR [LUKAS.T_AUTHOR.ID]
	 * </pre></code>
	 */
	public static final TableField<TBookRecord, Integer> CO_AUTHOR_ID = new TableFieldImpl<TBookRecord, Integer>("CO_AUTHOR_ID", SQLDataType.INTEGER, T_BOOK);

	/**
	 * An uncommented item
	 */
	public static final TableField<TBookRecord, Integer> DETAILS_ID = new TableFieldImpl<TBookRecord, Integer>("DETAILS_ID", SQLDataType.INTEGER, T_BOOK);

	/**
	 * An uncommented item
	 */
	public static final TableField<TBookRecord, String> TITLE = new TableFieldImpl<TBookRecord, String>("TITLE", SQLDataType.VARCHAR, T_BOOK);

	/**
	 * An uncommented item
	 */
	public static final TableField<TBookRecord, Integer> PUBLISHED_IN = new TableFieldImpl<TBookRecord, Integer>("PUBLISHED_IN", SQLDataType.INTEGER, T_BOOK);

	/**
	 * An uncommented item
	 * <p>
	 * <code><pre>
	 * FOREIGN KEY [LUKAS.T_BOOK.LANGUAGE_ID]
	 * REFERENCES T_LANGUAGE [LUKAS.T_LANGUAGE.ID]
	 * </pre></code>
	 */
	public static final TableField<TBookRecord, TLanguage> LANGUAGE_ID = new TableFieldImpl<TBookRecord, TLanguage>("LANGUAGE_ID", SQLDataType.INTEGER.asMasterDataType(TLanguage.class), T_BOOK);

	/**
	 * An uncommented item
	 */
	public static final TableField<TBookRecord, String> CONTENT_TEXT = new TableFieldImpl<TBookRecord, String>("CONTENT_TEXT", SQLDataType.LONGVARCHAR, T_BOOK);

	/**
	 * An uncommented item
	 */
	public static final TableField<TBookRecord, byte[]> CONTENT_PDF = new TableFieldImpl<TBookRecord, byte[]>("CONTENT_PDF", SQLDataType.BLOB, T_BOOK);

	/**
	 * No further instances allowed
	 */
	private TBook() {
		super("T_BOOK", Lukas.LUKAS);
	}

	@Override
	public UniqueKey<TBookRecord> getMainKey() {
		return Keys.PK_T_BOOK;
	}

	@Override
	@SuppressWarnings("unchecked")
	public List<UniqueKey<TBookRecord>> getKeys() {
		return Arrays.<UniqueKey<TBookRecord>>asList(Keys.PK_T_BOOK);
	}

	@Override
	@SuppressWarnings("unchecked")
	public List<ForeignKey<TBookRecord, ?>> getReferences() {
		return Arrays.<ForeignKey<TBookRecord, ?>>asList(Keys.FK_T_BOOK_AUTHOR_ID, Keys.FK_T_BOOK_CO_AUTHOR_ID);
	}
}
