/**
 * This class is generated by jOOQ
 */
package org.jooq.test.postgres.generatedclasses.procedures;


import javax.annotation.Generated;

import org.jooq.Parameter;
import org.jooq.SQLDialect;
import org.jooq.impl.ParameterImpl;
import org.jooq.impl.SQLDataType;
import org.jooq.impl.StoredProcedureImpl;
import org.jooq.test.postgres.generatedclasses.Public;


/**
 * This class is generated by jOOQ.
 */
@Generated(value    = "http://jooq.sourceforge.net",
           comments = "This class is generated by jOOQ")
public class PArrays1 extends StoredProcedureImpl {

	private static final long serialVersionUID = -63993487;


	/**
	 * An uncommented item
	 */
	public static final Parameter<Integer[]> IN_ARRAY = new ParameterImpl<Integer[]>("in_array", SQLDataType.INTEGER.getArrayDataType());

	/**
	 * An uncommented item
	 */
	public static final Parameter<Integer[]> OUT_ARRAY = new ParameterImpl<Integer[]>("out_array", SQLDataType.INTEGER.getArrayDataType());

	/**
	 * Create a new procedure call instance
	 */
	public PArrays1() {
		super(SQLDialect.POSTGRES, "p_arrays", Public.PUBLIC);

		addInParameter(IN_ARRAY);
		addOutParameter(OUT_ARRAY);
		setOverloaded(true);
	}

	public void setInArray(Integer[] value) {
		setValue(IN_ARRAY, value);
	}

	public Integer[] getOutArray() {
		return getValue(OUT_ARRAY);
	}
}
