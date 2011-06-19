/**
 * This class is generated by jOOQ
 */
package org.jooq.test.postgres.generatedclasses.tables;


import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.ForeignKey;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.SQLDataType;
import org.jooq.impl.TableFieldImpl;
import org.jooq.impl.UpdatableTableImpl;
import org.jooq.test.postgres.generatedclasses.Keys;
import org.jooq.test.postgres.generatedclasses.Public;
import org.jooq.test.postgres.generatedclasses.enums.TLanguage;
import org.jooq.test.postgres.generatedclasses.enums.UBookStatus;
import org.jooq.test.postgres.generatedclasses.tables.records.TBookRecord;
import org.jooq.util.postgres.PostgresDataType;


/**
 * This class is generated by jOOQ.
 */
@Generated(value    = "http://jooq.sourceforge.net",
           comments = "This class is generated by jOOQ")
public class TBook extends UpdatableTableImpl<TBookRecord> {

	private static final long serialVersionUID = 2067288451;

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
	 * An uncommented item
	 * 
	 * PRIMARY KEY
	 */
	public static final TableField<TBookRecord, Integer> ID = new TableFieldImpl<TBookRecord, Integer>("id", SQLDataType.INTEGER, T_BOOK);

	/**
	 * An uncommented item
	 * <p>
	 * <code><pre>
	 * FOREIGN KEY [public.t_book.author_id]
	 * REFERENCES t_author [public.t_author.id]
	 * </pre></code>
	 */
	public static final TableField<TBookRecord, Integer> AUTHOR_ID = new TableFieldImpl<TBookRecord, Integer>("author_id", SQLDataType.INTEGER, T_BOOK);

	/**
	 * An uncommented item
	 * <p>
	 * <code><pre>
	 * FOREIGN KEY [public.t_book.co_author_id]
	 * REFERENCES t_author [public.t_author.id]
	 * </pre></code>
	 */
	public static final TableField<TBookRecord, Integer> CO_AUTHOR_ID = new TableFieldImpl<TBookRecord, Integer>("co_author_id", SQLDataType.INTEGER, T_BOOK);

	/**
	 * An uncommented item
	 */
	public static final TableField<TBookRecord, Integer> DETAILS_ID = new TableFieldImpl<TBookRecord, Integer>("details_id", SQLDataType.INTEGER, T_BOOK);

	/**
	 * An uncommented item
	 */
	public static final TableField<TBookRecord, String> TITLE = new TableFieldImpl<TBookRecord, String>("title", SQLDataType.VARCHAR, T_BOOK);

	/**
	 * An uncommented item
	 */
	public static final TableField<TBookRecord, Integer> PUBLISHED_IN = new TableFieldImpl<TBookRecord, Integer>("published_in", SQLDataType.INTEGER, T_BOOK);

	/**
	 * An uncommented item
	 * <p>
	 * <code><pre>
	 * FOREIGN KEY [public.t_book.language_id]
	 * REFERENCES t_language [public.t_language.id]
	 * </pre></code>
	 */
	public static final TableField<TBookRecord, TLanguage> LANGUAGE_ID = new TableFieldImpl<TBookRecord, TLanguage>("language_id", SQLDataType.INTEGER.asMasterDataType(TLanguage.class), T_BOOK);

	/**
	 * An uncommented item
	 */
	public static final TableField<TBookRecord, String> CONTENT_TEXT = new TableFieldImpl<TBookRecord, String>("content_text", SQLDataType.CLOB, T_BOOK);

	/**
	 * An uncommented item
	 */
	public static final TableField<TBookRecord, byte[]> CONTENT_PDF = new TableFieldImpl<TBookRecord, byte[]>("content_pdf", SQLDataType.BLOB, T_BOOK);

	/**
	 * An uncommented item
	 */
	public static final TableField<TBookRecord, UBookStatus> STATUS = new TableFieldImpl<TBookRecord, UBookStatus>("status", PostgresDataType.VARCHAR.asEnumDataType(UBookStatus.class), T_BOOK);

	/**
	 * No further instances allowed
	 */
	private TBook() {
		super("t_book", Public.PUBLIC);
	}

	@Override
	public UniqueKey<TBookRecord> getMainKey() {
		return Keys.pk_t_book;
	}

	@Override
	@SuppressWarnings("unchecked")
	public List<UniqueKey<TBookRecord>> getKeys() {
		return Arrays.<UniqueKey<TBookRecord>>asList(Keys.pk_t_book);
	}

	@Override
	@SuppressWarnings("unchecked")
	public List<ForeignKey<TBookRecord, ?>> getReferences() {
		return Arrays.<ForeignKey<TBookRecord, ?>>asList(Keys.fk_t_book_author_id, Keys.fk_t_book_co_author_id);
	}
}
