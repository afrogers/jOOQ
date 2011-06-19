/**
 * This class is generated by jOOQ
 */
package org.jooq.test.oracle.generatedclasses.functions;


import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Parameter;
import org.jooq.SQLDialect;
import org.jooq.Select;
import org.jooq.impl.ParameterImpl;
import org.jooq.impl.SQLDataType;
import org.jooq.impl.StoredFunctionImpl;
import org.jooq.test.oracle.generatedclasses.Test;
import org.jooq.test.oracle.generatedclasses.udt.records.UNumberArrayRecord;


/**
 * This class is generated by jOOQ.
 */
@Generated(value    = "http://jooq.sourceforge.net",
           comments = "This class is generated by jOOQ")
public class FArrays1 extends StoredFunctionImpl<UNumberArrayRecord> {

	private static final long serialVersionUID = -626172370;


	/**
	 * An uncommented item
	 */
	public static final Parameter<UNumberArrayRecord> IN_ARRAY = new ParameterImpl<UNumberArrayRecord>("IN_ARRAY", SQLDataType.INTEGER.asArrayDataType(UNumberArrayRecord.class));

	/**
	 * Create a new function call instance
	 */
	public FArrays1() {
		super(SQLDialect.ORACLE, "F_ARRAYS1", Test.TEST, SQLDataType.INTEGER.asArrayDataType(UNumberArrayRecord.class));

		addInParameter(IN_ARRAY);
	}

	/**
	 * Set the <code>IN_ARRAY</code> parameter to the function
	 */
	public void setInArray(UNumberArrayRecord value) {
		setValue(IN_ARRAY, value);
	}

	/**
	 * Set the <code>IN_ARRAY</code> parameter to the function
	 * <p>
	 * Use this method only, if the function is called as a {@link Field} in a {@link Select} statement!
	 */
	public void setInArray(Field<UNumberArrayRecord> field) {
		setField(IN_ARRAY, field);
	}
}
