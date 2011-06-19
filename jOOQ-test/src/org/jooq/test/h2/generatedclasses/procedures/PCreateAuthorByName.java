/**
 * This class is generated by jOOQ
 */
package org.jooq.test.h2.generatedclasses.procedures;


import javax.annotation.Generated;

import org.jooq.Parameter;
import org.jooq.SQLDialect;
import org.jooq.impl.ParameterImpl;
import org.jooq.impl.SQLDataType;
import org.jooq.impl.StoredProcedureImpl;
import org.jooq.test.h2.generatedclasses.Public;


/**
 * This class is generated by jOOQ.
 */
@Generated(value    = "http://jooq.sourceforge.net",
           comments = "This class is generated by jOOQ")
public class PCreateAuthorByName extends StoredProcedureImpl {

	private static final long serialVersionUID = 875191370;


	/**
	 * An uncommented item
	 */
	public static final Parameter<String> P2 = new ParameterImpl<String>("P2", SQLDataType.VARCHAR);

	/**
	 * An uncommented item
	 */
	public static final Parameter<String> P3 = new ParameterImpl<String>("P3", SQLDataType.VARCHAR);

	/**
	 * Create a new procedure call instance
	 */
	public PCreateAuthorByName() {
		super(SQLDialect.H2, "P_CREATE_AUTHOR_BY_NAME", Public.PUBLIC);

		addInParameter(P2);
		addInParameter(P3);
	}

	public void setP2(String value) {
		setValue(P2, value);
	}

	public void setP3(String value) {
		setValue(P3, value);
	}
}
