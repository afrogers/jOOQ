/**
 * This class is generated by jOOQ
 */
package org.jooq.test.mysql.generatedclasses.tables;


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
import org.jooq.test.mysql.generatedclasses.enums.TBookStatus;
import org.jooq.test.mysql.generatedclasses.enums.TLanguage;
import org.jooq.test.mysql.generatedclasses.tables.records.TBookRecord;
import org.jooq.util.mysql.MySQLDataType;


/**
 * This class is generated by jOOQ.
 *
 * An entity holding books
 */
@Generated(value    = "http://jooq.sourceforge.net",
           comments = "This class is generated by jOOQ")
public class TBook extends UpdatableTableImpl<TBookRecord> {

	private static final long serialVersionUID = 208836775;

	/**
	 * The singleton instance of t_book
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
	 * The book ID
	 * 
	 * PRIMARY KEY
	 */
	public static final TableField<TBookRecord, Integer> ID = new TableFieldImpl<TBookRecord, Integer>("ID", SQLDataType.INTEGER, T_BOOK);

	/**
	 * The author ID in entity 'author'
	 * <p>
	 * <code><pre>
	 * FOREIGN KEY [test.t_book.AUTHOR_ID]
	 * REFERENCES t_author [test.t_author.ID]
	 * </pre></code>
	 */
	public static final TableField<TBookRecord, Integer> AUTHOR_ID = new TableFieldImpl<TBookRecord, Integer>("AUTHOR_ID", SQLDataType.INTEGER, T_BOOK);

	/**
	 * An uncommented item
	 * <p>
	 * <code><pre>
	 * FOREIGN KEY [test.t_book.co_author_id]
	 * REFERENCES t_author [test.t_author.ID]
	 * </pre></code>
	 */
	public static final TableField<TBookRecord, Integer> CO_AUTHOR_ID = new TableFieldImpl<TBookRecord, Integer>("co_author_id", SQLDataType.INTEGER, T_BOOK);

	/**
	 * Some more details about the book
	 */
	public static final TableField<TBookRecord, Integer> DETAILS_ID = new TableFieldImpl<TBookRecord, Integer>("DETAILS_ID", SQLDataType.INTEGER, T_BOOK);

	/**
	 * The book's title
	 */
	public static final TableField<TBookRecord, String> TITLE = new TableFieldImpl<TBookRecord, String>("TITLE", SQLDataType.CLOB, T_BOOK);

	/**
	 * The year the book was published in
	 */
	public static final TableField<TBookRecord, Integer> PUBLISHED_IN = new TableFieldImpl<TBookRecord, Integer>("PUBLISHED_IN", SQLDataType.INTEGER, T_BOOK);

	/**
	 * The language of the book
	 * <p>
	 * <code><pre>
	 * FOREIGN KEY [test.t_book.LANGUAGE_ID]
	 * REFERENCES t_language [test.t_language.ID]
	 * </pre></code>
	 */
	public static final TableField<TBookRecord, TLanguage> LANGUAGE_ID = new TableFieldImpl<TBookRecord, TLanguage>("LANGUAGE_ID", SQLDataType.INTEGER.asMasterDataType(TLanguage.class), T_BOOK);

	/**
	 * Some textual content of the book
	 */
	public static final TableField<TBookRecord, String> CONTENT_TEXT = new TableFieldImpl<TBookRecord, String>("CONTENT_TEXT", SQLDataType.CLOB, T_BOOK);

	/**
	 * Some binary content of the book
	 */
	public static final TableField<TBookRecord, byte[]> CONTENT_PDF = new TableFieldImpl<TBookRecord, byte[]>("CONTENT_PDF", SQLDataType.BLOB, T_BOOK);

	/**
	 * The book's stock status
	 */
	public static final TableField<TBookRecord, TBookStatus> STATUS = new TableFieldImpl<TBookRecord, TBookStatus>("STATUS", MySQLDataType.VARCHAR.asEnumDataType(TBookStatus.class), T_BOOK);

	/**
	 * No further instances allowed
	 */
	private TBook() {
		super("t_book", Test.TEST);
	}

	@Override
	public UniqueKey<TBookRecord> getMainKey() {
		return Keys.KEY_t_book_PRIMARY;
	}

	@Override
	@SuppressWarnings("unchecked")
	public List<UniqueKey<TBookRecord>> getKeys() {
		return Arrays.<UniqueKey<TBookRecord>>asList(Keys.KEY_t_book_PRIMARY);
	}

	@Override
	@SuppressWarnings("unchecked")
	public List<ForeignKey<TBookRecord, ?>> getReferences() {
		return Arrays.<ForeignKey<TBookRecord, ?>>asList(Keys.fk_t_book_author_id, Keys.fk_t_book_co_author_id);
	}
}
