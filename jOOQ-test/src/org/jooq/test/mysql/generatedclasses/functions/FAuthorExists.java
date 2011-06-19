/**
 * This class is generated by jOOQ
 */
package org.jooq.test.mysql.generatedclasses.functions;


import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Parameter;
import org.jooq.SQLDialect;
import org.jooq.Select;
import org.jooq.impl.ParameterImpl;
import org.jooq.impl.SQLDataType;
import org.jooq.impl.StoredFunctionImpl;
import org.jooq.test.mysql.generatedclasses.Test;


/**
 * This class is generated by jOOQ.
 *
 * Check existence of an author
 */
@Generated(value    = "http://jooq.sourceforge.net",
           comments = "This class is generated by jOOQ")
public class FAuthorExists extends StoredFunctionImpl<Integer> {

	private static final long serialVersionUID = -426393470;


	/**
	 * An uncommented item
	 */
	public static final Parameter<String> AUTHOR_NAME = new ParameterImpl<String>("author_name", SQLDataType.VARCHAR);

	/**
	 * Create a new function call instance
	 */
	public FAuthorExists() {
		super(SQLDialect.MYSQL, "f_author_exists", Test.TEST, SQLDataType.INTEGER);

		addInParameter(AUTHOR_NAME);
	}

	/**
	 * Set the <code>author_name</code> parameter to the function
	 */
	public void setAuthorName(String value) {
		setValue(AUTHOR_NAME, value);
	}

	/**
	 * Set the <code>author_name</code> parameter to the function
	 * <p>
	 * Use this method only, if the function is called as a {@link Field} in a {@link Select} statement!
	 */
	public void setAuthorName(Field<String> field) {
		setField(AUTHOR_NAME, field);
	}
}
