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
 * echo n
 */
@Generated(value    = "http://jooq.sourceforge.net",
           comments = "This class is generated by jOOQ")
public class FNumber extends StoredFunctionImpl<Integer> {

	private static final long serialVersionUID = -582981515;


	/**
	 * An uncommented item
	 */
	public static final Parameter<Integer> N = new ParameterImpl<Integer>("n", SQLDataType.INTEGER);

	/**
	 * Create a new function call instance
	 */
	public FNumber() {
		super(SQLDialect.MYSQL, "f_number", Test.TEST, SQLDataType.INTEGER);

		addInParameter(N);
	}

	/**
	 * Set the <code>n</code> parameter to the function
	 */
	public void setN(Integer value) {
		setValue(N, value);
	}

	/**
	 * Set the <code>n</code> parameter to the function
	 * <p>
	 * Use this method only, if the function is called as a {@link Field} in a {@link Select} statement!
	 */
	public void setN(Field<Integer> field) {
		setField(N, field);
	}
}
