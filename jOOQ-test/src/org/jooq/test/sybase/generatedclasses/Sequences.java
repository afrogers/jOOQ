/**
 * This class is generated by jOOQ
 */
package org.jooq.test.sybase.generatedclasses;


import javax.annotation.Generated;

import org.jooq.Sequence;
import org.jooq.impl.SequenceImpl;
import org.jooq.test.sybase.generatedclasses.Dba;


/**
 * This class is generated by jOOQ.
 *
 * Convenience access to all sequences in dba
 */
@Generated(value    = "http://jooq.sourceforge.net",
           comments = "This class is generated by jOOQ")
public final class Sequences {

	/**
	 * The sequence S_AUTHOR_ID
	 */
	public static final Sequence S_AUTHOR_ID = new SequenceImpl("s_author_id", Dba.DBA);

	/**
	 * No instances
	 */
	private Sequences() {}
}
