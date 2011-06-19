/**
 * This class is generated by jOOQ
 */
package org.jooq.test.sqlserver.generatedclasses.procedures;


import javax.annotation.Generated;

import org.jooq.Parameter;
import org.jooq.SQLDialect;
import org.jooq.impl.ParameterImpl;
import org.jooq.impl.SQLDataType;
import org.jooq.impl.StoredProcedureImpl;
import org.jooq.test.sqlserver.generatedclasses.Dbo;


/**
 * This class is generated by jOOQ.
 */
@Generated(value    = "http://jooq.sourceforge.net",
           comments = "This class is generated by jOOQ")
public class P391 extends StoredProcedureImpl {

	private static final long serialVersionUID = -549177213;


	/**
	 * An uncommented item
	 */
	public static final Parameter<Integer> I1 = new ParameterImpl<Integer>("i1", SQLDataType.INTEGER);

	/**
	 * An uncommented item
	 */
	public static final Parameter<Integer> IO1 = new ParameterImpl<Integer>("io1", SQLDataType.INTEGER);

	/**
	 * An uncommented item
	 */
	public static final Parameter<Integer> O1 = new ParameterImpl<Integer>("o1", SQLDataType.INTEGER);

	/**
	 * An uncommented item
	 */
	public static final Parameter<Integer> O2 = new ParameterImpl<Integer>("o2", SQLDataType.INTEGER);

	/**
	 * An uncommented item
	 */
	public static final Parameter<Integer> IO2 = new ParameterImpl<Integer>("io2", SQLDataType.INTEGER);

	/**
	 * An uncommented item
	 */
	public static final Parameter<Integer> I2 = new ParameterImpl<Integer>("i2", SQLDataType.INTEGER);

	/**
	 * Create a new procedure call instance
	 */
	public P391() {
		super(SQLDialect.SQLSERVER, "p391", Dbo.DBO);

		addInParameter(I1);
		addInOutParameter(IO1);
		addInOutParameter(O1);
		addInOutParameter(O2);
		addInOutParameter(IO2);
		addInParameter(I2);
	}

	public void setI1(Integer value) {
		setValue(I1, value);
	}

	public void setIo1(Integer value) {
		setValue(IO1, value);
	}

	public void setO1(Integer value) {
		setValue(O1, value);
	}

	public void setO2(Integer value) {
		setValue(O2, value);
	}

	public void setIo2(Integer value) {
		setValue(IO2, value);
	}

	public void setI2(Integer value) {
		setValue(I2, value);
	}

	public Integer getIo1() {
		return getValue(IO1);
	}

	public Integer getO1() {
		return getValue(O1);
	}

	public Integer getO2() {
		return getValue(O2);
	}

	public Integer getIo2() {
		return getValue(IO2);
	}
}
