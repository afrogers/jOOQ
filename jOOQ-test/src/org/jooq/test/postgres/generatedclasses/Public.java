/**
 * This class is generated by jOOQ
 */
package org.jooq.test.postgres.generatedclasses;


import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Sequence;
import org.jooq.Table;
import org.jooq.UDT;
import org.jooq.impl.SchemaImpl;
import org.jooq.test.postgres.generatedclasses.tables.TArrays;
import org.jooq.test.postgres.generatedclasses.tables.TAuthor;
import org.jooq.test.postgres.generatedclasses.tables.TBook;
import org.jooq.test.postgres.generatedclasses.tables.TBookStore;
import org.jooq.test.postgres.generatedclasses.tables.TBookToBookStore;
import org.jooq.test.postgres.generatedclasses.tables.VAuthor;
import org.jooq.test.postgres.generatedclasses.tables.VBook;
import org.jooq.test.postgres.generatedclasses.tables.VLibrary;
import org.jooq.test.postgres.generatedclasses.tables.XTestCase_64_69;
import org.jooq.test.postgres.generatedclasses.tables.XTestCase_71;
import org.jooq.test.postgres.generatedclasses.tables.XTestCase_85;
import org.jooq.test.postgres.generatedclasses.tables.XUnused;
import org.jooq.test.postgres.generatedclasses.udt.UAddressType;
import org.jooq.test.postgres.generatedclasses.udt.UStreetType;
import org.jooq.test.postgres.generatedclasses.udt.records.UAddressTypeRecord;
import org.jooq.test.postgres.generatedclasses.udt.records.UStreetTypeRecord;


/**
 * This class is generated by jOOQ.
 */
@Generated(value    = "http://jooq.sourceforge.net",
           comments = "This class is generated by jOOQ")
public class Public extends SchemaImpl {

	private static final long serialVersionUID = 540984490;

	/**
	 * The singleton instance of public
	 */
	public static final Public PUBLIC = new Public();

	/**
	 * No further instances allowed
	 */
	private Public() {
		super("public");
	}

	/*
	 * instance initialiser
	 */
	{
		addMapping("public.u_address_type", UAddressTypeRecord.class);
		addMapping("public.u_street_type", UStreetTypeRecord.class);
	}

	@Override
	public final List<Sequence> getSequences() {
		return Arrays.<Sequence>asList(Sequences.S_AUTHOR_ID);
	}

	@Override
	public final List<Table<?>> getTables() {
		return Arrays.<Table<?>>asList(
			TArrays.T_ARRAYS,
			TAuthor.T_AUTHOR,
			TBook.T_BOOK,
			TBookStore.T_BOOK_STORE,
			TBookToBookStore.T_BOOK_TO_BOOK_STORE,
			VAuthor.V_AUTHOR,
			VBook.V_BOOK,
			VLibrary.V_LIBRARY,
			XTestCase_64_69.X_TEST_CASE_64_69,
			XTestCase_71.X_TEST_CASE_71,
			XTestCase_85.X_TEST_CASE_85,
			XUnused.X_UNUSED);
	}

	@Override
	public final List<UDT<?>> getUDTs() {
		return Arrays.<UDT<?>>asList(
			UAddressType.U_ADDRESS_TYPE,
			UStreetType.U_STREET_TYPE);
	}
}
