/**
 * This class is generated by jOOQ
 */
package org.jooq.test.postgres.generatedclasses.functions;


import javax.annotation.Generated;

import org.jooq.SQLDialect;
import org.jooq.impl.SQLDataType;
import org.jooq.impl.StoredFunctionImpl;
import org.jooq.test.postgres.generatedclasses.Public;


/**
 * This class is generated by jOOQ.
 */
@Generated(value    = "http://jooq.sourceforge.net",
           comments = "This class is generated by jOOQ")
public class FOne extends StoredFunctionImpl<Integer> {

	private static final long serialVersionUID = 313117330;


	/**
	 * Create a new function call instance
	 */
	public FOne() {
		super(SQLDialect.POSTGRES, "f_one", Public.PUBLIC, SQLDataType.INTEGER);
	}
}
