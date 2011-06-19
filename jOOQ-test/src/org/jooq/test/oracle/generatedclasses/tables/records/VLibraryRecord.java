/**
 * This class is generated by jOOQ
 */
package org.jooq.test.oracle.generatedclasses.tables.records;


import javax.annotation.Generated;

import org.jooq.Configuration;
import org.jooq.impl.TableRecordImpl;
import org.jooq.test.oracle.generatedclasses.tables.VLibrary;


/**
 * This class is generated by jOOQ.
 */
@Generated(value    = "http://jooq.sourceforge.net",
           comments = "This class is generated by jOOQ")
public class VLibraryRecord extends TableRecordImpl<VLibraryRecord> {

	private static final long serialVersionUID = -1230058655;

	/**
	 * An uncommented item
	 */
	public void setAuthor(String value) {
		setValue(VLibrary.AUTHOR, value);
	}

	/**
	 * An uncommented item
	 */
	public String getAuthor() {
		return getValue(VLibrary.AUTHOR);
	}

	/**
	 * An uncommented item
	 */
	public void setTitle(String value) {
		setValue(VLibrary.TITLE, value);
	}

	/**
	 * An uncommented item
	 */
	public String getTitle() {
		return getValue(VLibrary.TITLE);
	}
	/**
	 * Create a detached VLibraryRecord
	 */
	public VLibraryRecord() {
		super(VLibrary.V_LIBRARY);
	}

	/**
	 * Create an attached VLibraryRecord
	 * @deprecated - (#363) use the other constructor instead
	 */
	@Deprecated
	public VLibraryRecord(Configuration configuration) {
		super(VLibrary.V_LIBRARY, configuration);
	}
}
