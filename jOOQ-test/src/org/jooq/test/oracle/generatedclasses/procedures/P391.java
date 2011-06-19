/**
 * This class is generated by jOOQ
 */
package org.jooq.test.oracle.generatedclasses.procedures;


import java.math.BigDecimal;

import javax.annotation.Generated;

import org.jooq.Parameter;
import org.jooq.SQLDialect;
import org.jooq.impl.ParameterImpl;
import org.jooq.impl.SQLDataType;
import org.jooq.impl.StoredProcedureImpl;
import org.jooq.test.oracle.generatedclasses.Test;


/**
 * This class is generated by jOOQ.
 */
@Generated(value    = "http://jooq.sourceforge.net",
           comments = "This class is generated by jOOQ")
public class P391 extends StoredProcedureImpl {

	private static final long serialVersionUID = 1586652734;


	/**
	 * An uncommented item
	 */
	public static final Parameter<BigDecimal> I1 = new ParameterImpl<BigDecimal>("I1", SQLDataType.NUMERIC);

	/**
	 * An uncommented item
	 */
	public static final Parameter<BigDecimal> IO1 = new ParameterImpl<BigDecimal>("IO1", SQLDataType.NUMERIC);

	/**
	 * An uncommented item
	 */
	public static final Parameter<BigDecimal> O1 = new ParameterImpl<BigDecimal>("O1", SQLDataType.NUMERIC);

	/**
	 * An uncommented item
	 */
	public static final Parameter<BigDecimal> O2 = new ParameterImpl<BigDecimal>("O2", SQLDataType.NUMERIC);

	/**
	 * An uncommented item
	 */
	public static final Parameter<BigDecimal> IO2 = new ParameterImpl<BigDecimal>("IO2", SQLDataType.NUMERIC);

	/**
	 * An uncommented item
	 */
	public static final Parameter<BigDecimal> I2 = new ParameterImpl<BigDecimal>("I2", SQLDataType.NUMERIC);

	/**
	 * Create a new procedure call instance
	 */
	public P391() {
		super(SQLDialect.ORACLE, "P391", Test.TEST);

		addInParameter(I1);
		addInOutParameter(IO1);
		addOutParameter(O1);
		addOutParameter(O2);
		addInOutParameter(IO2);
		addInParameter(I2);
	}

	public void setI1(Number value) {
		setNumber(I1, value);
	}

	public void setIo1(Number value) {
		setNumber(IO1, value);
	}

	public void setIo2(Number value) {
		setNumber(IO2, value);
	}

	public void setI2(Number value) {
		setNumber(I2, value);
	}

	public BigDecimal getIo1() {
		return getValue(IO1);
	}

	public BigDecimal getO1() {
		return getValue(O1);
	}

	public BigDecimal getO2() {
		return getValue(O2);
	}

	public BigDecimal getIo2() {
		return getValue(IO2);
	}
}
