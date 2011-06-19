/**
 * This class is generated by jOOQ
 */
package org.jooq.test.db2.generatedclasses.functions;


import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Parameter;
import org.jooq.SQLDialect;
import org.jooq.Select;
import org.jooq.impl.ParameterImpl;
import org.jooq.impl.SQLDataType;
import org.jooq.impl.StoredFunctionImpl;
import org.jooq.test.db2.generatedclasses.Lukas;


/**
 * This class is generated by jOOQ.
 */
@Generated(value    = "http://jooq.sourceforge.net",
           comments = "This class is generated by jOOQ")
public class F317 extends StoredFunctionImpl<Integer> {

	private static final long serialVersionUID = -1089937326;


	/**
	 * An uncommented item
	 */
	public static final Parameter<Integer> P1 = new ParameterImpl<Integer>("P1", SQLDataType.INTEGER);

	/**
	 * An uncommented item
	 */
	public static final Parameter<Integer> P2 = new ParameterImpl<Integer>("P2", SQLDataType.INTEGER);

	/**
	 * An uncommented item
	 */
	public static final Parameter<Integer> P3 = new ParameterImpl<Integer>("P3", SQLDataType.INTEGER);

	/**
	 * An uncommented item
	 */
	public static final Parameter<Integer> P4 = new ParameterImpl<Integer>("P4", SQLDataType.INTEGER);

	/**
	 * Create a new function call instance
	 */
	public F317() {
		super(SQLDialect.DB2, "F317", Lukas.LUKAS, SQLDataType.INTEGER);

		addInParameter(P1);
		addInParameter(P2);
		addInParameter(P3);
		addInParameter(P4);
	}

	/**
	 * Set the <code>P1</code> parameter to the function
	 */
	public void setP1(Integer value) {
		setValue(P1, value);
	}

	/**
	 * Set the <code>P1</code> parameter to the function
	 * <p>
	 * Use this method only, if the function is called as a {@link Field} in a {@link Select} statement!
	 */
	public void setP1(Field<Integer> field) {
		setField(P1, field);
	}

	/**
	 * Set the <code>P2</code> parameter to the function
	 */
	public void setP2(Integer value) {
		setValue(P2, value);
	}

	/**
	 * Set the <code>P2</code> parameter to the function
	 * <p>
	 * Use this method only, if the function is called as a {@link Field} in a {@link Select} statement!
	 */
	public void setP2(Field<Integer> field) {
		setField(P2, field);
	}

	/**
	 * Set the <code>P3</code> parameter to the function
	 */
	public void setP3(Integer value) {
		setValue(P3, value);
	}

	/**
	 * Set the <code>P3</code> parameter to the function
	 * <p>
	 * Use this method only, if the function is called as a {@link Field} in a {@link Select} statement!
	 */
	public void setP3(Field<Integer> field) {
		setField(P3, field);
	}

	/**
	 * Set the <code>P4</code> parameter to the function
	 */
	public void setP4(Integer value) {
		setValue(P4, value);
	}

	/**
	 * Set the <code>P4</code> parameter to the function
	 * <p>
	 * Use this method only, if the function is called as a {@link Field} in a {@link Select} statement!
	 */
	public void setP4(Field<Integer> field) {
		setField(P4, field);
	}
}
