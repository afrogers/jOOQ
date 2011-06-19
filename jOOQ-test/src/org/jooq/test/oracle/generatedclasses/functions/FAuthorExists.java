/**
 * This class is generated by jOOQ
 */
package org.jooq.test.oracle.generatedclasses.functions;


import java.math.BigDecimal;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Parameter;
import org.jooq.SQLDialect;
import org.jooq.Select;
import org.jooq.impl.ParameterImpl;
import org.jooq.impl.SQLDataType;
import org.jooq.impl.StoredFunctionImpl;
import org.jooq.test.oracle.generatedclasses.Test;


/**
 * This class is generated by jOOQ.
 */
@Generated(value    = "http://jooq.sourceforge.net",
           comments = "This class is generated by jOOQ")
public class FAuthorExists extends StoredFunctionImpl<BigDecimal> {

	private static final long serialVersionUID = -1188095056;


	/**
	 * An uncommented item
	 */
	public static final Parameter<String> AUTHOR_NAME = new ParameterImpl<String>("AUTHOR_NAME", SQLDataType.VARCHAR);

	/**
	 * Create a new function call instance
	 */
	public FAuthorExists() {
		super(SQLDialect.ORACLE, "F_AUTHOR_EXISTS", Test.TEST, SQLDataType.NUMERIC);

		addInParameter(AUTHOR_NAME);
	}

	/**
	 * Set the <code>AUTHOR_NAME</code> parameter to the function
	 */
	public void setAuthorName(String value) {
		setValue(AUTHOR_NAME, value);
	}

	/**
	 * Set the <code>AUTHOR_NAME</code> parameter to the function
	 * <p>
	 * Use this method only, if the function is called as a {@link Field} in a {@link Select} statement!
	 */
	public void setAuthorName(Field<String> field) {
		setField(AUTHOR_NAME, field);
	}
}
