/**
 * This class is generated by jOOQ
 */
package org.jooq.util.derby.sys;


import java.sql.Connection;

import javax.annotation.Generated;

import org.jooq.SchemaMapping;
import org.jooq.util.derby.DerbyFactory;


/**
 * This class is generated by jOOQ.
 */
@Generated(value    = "http://jooq.sourceforge.net",
           comments = "This class is generated by jOOQ")
public class SysFactory extends DerbyFactory {

	private static final long serialVersionUID = 216841497;

	/**
	 * Create a factory with a connection
	 *
	 * @param connection The connection to use with objects created from this factory
	 */
	public SysFactory(Connection connection) {
		super(connection);
	}

	/**
	 * Create a factory with a connection and a schema mapping
	 *
	 * @param connection The connection to use with objects created from this factory
	 * @param mapping The schema mapping to use with objects created from this factory
	 */
	public SysFactory(Connection connection, SchemaMapping mapping) {
		super(connection, mapping);
	}
}
