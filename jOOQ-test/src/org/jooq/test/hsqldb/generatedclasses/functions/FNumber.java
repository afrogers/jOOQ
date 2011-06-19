/**
 * This class is generated by jOOQ
 */
package org.jooq.test.hsqldb.generatedclasses.functions;


import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Parameter;
import org.jooq.SQLDialect;
import org.jooq.Select;
import org.jooq.impl.ParameterImpl;
import org.jooq.impl.SQLDataType;
import org.jooq.impl.StoredFunctionImpl;
import org.jooq.test.hsqldb.generatedclasses.Public;


/**
 * This class is generated by jOOQ.
 */
@Generated(value    = "http://jooq.sourceforge.net",
           comments = "This class is generated by jOOQ")
public class FNumber extends StoredFunctionImpl<Integer> {

	private static final long serialVersionUID = -1067474135;


	/**
	 * An uncommented item
	 */
	public static final Parameter<Integer> N = new ParameterImpl<Integer>("N", SQLDataType.INTEGER);

	/**
	 * Create a new function call instance
	 */
	public FNumber() {
		super(SQLDialect.HSQLDB, "F_NUMBER", Public.PUBLIC, SQLDataType.INTEGER);

		addInParameter(N);
	}

	/**
	 * Set the <code>N</code> parameter to the function
	 */
	public void setN(Integer value) {
		setValue(N, value);
	}

	/**
	 * Set the <code>N</code> parameter to the function
	 * <p>
	 * Use this method only, if the function is called as a {@link Field} in a {@link Select} statement!
	 */
	public void setN(Field<Integer> field) {
		setField(N, field);
	}
}
