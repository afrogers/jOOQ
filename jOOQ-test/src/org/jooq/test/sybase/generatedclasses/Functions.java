/**
 * This class is generated by jOOQ
 */
package org.jooq.test.sybase.generatedclasses;


import java.sql.Connection;
import java.sql.SQLException;

import javax.annotation.Generated;

import org.jooq.Configuration;
import org.jooq.Field;
import org.jooq.test.sybase.generatedclasses.functions.F317;
import org.jooq.test.sybase.generatedclasses.functions.FAuthorExists;
import org.jooq.test.sybase.generatedclasses.functions.FNumber;
import org.jooq.test.sybase.generatedclasses.functions.FOne;


/**
 * This class is generated by jOOQ.
 *
 * Convenience access to all stored functions in dba
 */
@Generated(value    = "http://jooq.sourceforge.net",
           comments = "This class is generated by jOOQ")
public final class Functions {

	/**
	 * Invoke F_AUTHOR_EXISTS
	 *
	 * @param authorName
	 */
	public static Integer fAuthorExists(Configuration configuration, String authorName) throws SQLException {
		FAuthorExists f = new FAuthorExists();
		f.setAuthorName(authorName);

		f.execute(configuration);
		return f.getReturnValue();
	}

	/**
	 * Invoke F_AUTHOR_EXISTS
	 *
	 * @param authorName
	 *
	 * @deprecated 1.6.1 [#453] This method of calling stored functions is not supported anymore<br/>
	 *             See {@link org.jooq.StoredObject#execute(java.sql.Connection)} for details.<br/><br/>
	 *             If you wish to remove this method, adapt your configuration:<br/>
	 *             <code>generator.generate.deprecated=false</code>
	 */
	@Deprecated
	public static Integer fAuthorExists(Connection connection, String authorName) throws SQLException {
		FAuthorExists f = new FAuthorExists();
		f.setAuthorName(authorName);

		f.execute(connection);
		return f.getReturnValue();
	}

	/**
	 * Get F_AUTHOR_EXISTS as a field
	 *
	 * @param authorName
	 */
	public static Field<Integer> fAuthorExists(String authorName) {
		FAuthorExists f = new FAuthorExists();
		f.setAuthorName(authorName);

		return f.asField();
	}

	/**
	 * Get F_AUTHOR_EXISTS as a field
	 *
	 * @param authorName
	 */
	public static Field<Integer> fAuthorExists(Field<String> authorName) {
		FAuthorExists f = new FAuthorExists();
		f.setAuthorName(authorName);

		return f.asField();
	}

	/**
	 * Invoke F_NUMBER
	 *
	 * @param n
	 */
	public static Integer fNumber(Configuration configuration, Integer n) throws SQLException {
		FNumber f = new FNumber();
		f.setN(n);

		f.execute(configuration);
		return f.getReturnValue();
	}

	/**
	 * Invoke F_NUMBER
	 *
	 * @param n
	 *
	 * @deprecated 1.6.1 [#453] This method of calling stored functions is not supported anymore<br/>
	 *             See {@link org.jooq.StoredObject#execute(java.sql.Connection)} for details.<br/><br/>
	 *             If you wish to remove this method, adapt your configuration:<br/>
	 *             <code>generator.generate.deprecated=false</code>
	 */
	@Deprecated
	public static Integer fNumber(Connection connection, Integer n) throws SQLException {
		FNumber f = new FNumber();
		f.setN(n);

		f.execute(connection);
		return f.getReturnValue();
	}

	/**
	 * Get F_NUMBER as a field
	 *
	 * @param n
	 */
	public static Field<Integer> fNumber(Integer n) {
		FNumber f = new FNumber();
		f.setN(n);

		return f.asField();
	}

	/**
	 * Get F_NUMBER as a field
	 *
	 * @param n
	 */
	public static Field<Integer> fNumber(Field<Integer> n) {
		FNumber f = new FNumber();
		f.setN(n);

		return f.asField();
	}

	/**
	 * Invoke F_ONE
	 *
	 */
	public static Integer fOne(Configuration configuration) throws SQLException {
		FOne f = new FOne();

		f.execute(configuration);
		return f.getReturnValue();
	}

	/**
	 * Invoke F_ONE
	 *
	 *
	 * @deprecated 1.6.1 [#453] This method of calling stored functions is not supported anymore<br/>
	 *             See {@link org.jooq.StoredObject#execute(java.sql.Connection)} for details.<br/><br/>
	 *             If you wish to remove this method, adapt your configuration:<br/>
	 *             <code>generator.generate.deprecated=false</code>
	 */
	@Deprecated
	public static Integer fOne(Connection connection) throws SQLException {
		FOne f = new FOne();

		f.execute(connection);
		return f.getReturnValue();
	}

	/**
	 * Get F_ONE as a field
	 *
	 */
	public static Field<Integer> fOne() {
		FOne f = new FOne();

		return f.asField();
	}

	/**
	 * Invoke F317
	 *
	 * @param p1
	 * @param p2
	 * @param p3
	 * @param p4
	 */
	public static Integer f317(Configuration configuration, Integer p1, Integer p2, Integer p3, Integer p4) throws SQLException {
		F317 f = new F317();
		f.setP1(p1);
		f.setP2(p2);
		f.setP3(p3);
		f.setP4(p4);

		f.execute(configuration);
		return f.getReturnValue();
	}

	/**
	 * Invoke F317
	 *
	 * @param p1
	 * @param p2
	 * @param p3
	 * @param p4
	 *
	 * @deprecated 1.6.1 [#453] This method of calling stored functions is not supported anymore<br/>
	 *             See {@link org.jooq.StoredObject#execute(java.sql.Connection)} for details.<br/><br/>
	 *             If you wish to remove this method, adapt your configuration:<br/>
	 *             <code>generator.generate.deprecated=false</code>
	 */
	@Deprecated
	public static Integer f317(Connection connection, Integer p1, Integer p2, Integer p3, Integer p4) throws SQLException {
		F317 f = new F317();
		f.setP1(p1);
		f.setP2(p2);
		f.setP3(p3);
		f.setP4(p4);

		f.execute(connection);
		return f.getReturnValue();
	}

	/**
	 * Get F317 as a field
	 *
	 * @param p1
	 * @param p2
	 * @param p3
	 * @param p4
	 */
	public static Field<Integer> f317(Integer p1, Integer p2, Integer p3, Integer p4) {
		F317 f = new F317();
		f.setP1(p1);
		f.setP2(p2);
		f.setP3(p3);
		f.setP4(p4);

		return f.asField();
	}

	/**
	 * Get F317 as a field
	 *
	 * @param p1
	 * @param p2
	 * @param p3
	 * @param p4
	 */
	public static Field<Integer> f317(Field<Integer> p1, Field<Integer> p2, Field<Integer> p3, Field<Integer> p4) {
		F317 f = new F317();
		f.setP1(p1);
		f.setP2(p2);
		f.setP3(p3);
		f.setP4(p4);

		return f.asField();
	}

	/**
	 * No instances
	 */
	private Functions() {}
}
