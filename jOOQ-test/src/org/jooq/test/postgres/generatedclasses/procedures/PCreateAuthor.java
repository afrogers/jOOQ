/**
 * This class is generated by jOOQ
 */
package org.jooq.test.postgres.generatedclasses.procedures;


import javax.annotation.Generated;

import org.jooq.SQLDialect;
import org.jooq.impl.StoredProcedureImpl;
import org.jooq.test.postgres.generatedclasses.Public;


/**
 * This class is generated by jOOQ.
 */
@Generated(value    = "http://jooq.sourceforge.net",
           comments = "This class is generated by jOOQ")
public class PCreateAuthor extends StoredProcedureImpl {

	private static final long serialVersionUID = 1360091559;


	/**
	 * Create a new procedure call instance
	 */
	public PCreateAuthor() {
		super(SQLDialect.POSTGRES, "p_create_author", Public.PUBLIC);
	}
}
