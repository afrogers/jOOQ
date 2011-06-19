/**
 * This class is generated by jOOQ
 */
package org.jooq.test.hsqldb.generatedclasses.tables.records;


import javax.annotation.Generated;

import org.jooq.Configuration;
import org.jooq.impl.TableRecordImpl;
import org.jooq.test.hsqldb.generatedclasses.tables.VBook;


/**
 * This class is generated by jOOQ.
 */
@Generated(value    = "http://jooq.sourceforge.net",
           comments = "This class is generated by jOOQ")
public class VBookRecord extends TableRecordImpl<VBookRecord> {

	private static final long serialVersionUID = -1912973623;

	/**
	 * An uncommented item
	 */
	public void setId(Integer value) {
		setValue(VBook.ID, value);
	}

	/**
	 * An uncommented item
	 */
	public Integer getId() {
		return getValue(VBook.ID);
	}

	/**
	 * An uncommented item
	 */
	public void setAuthorId(Integer value) {
		setValue(VBook.AUTHOR_ID, value);
	}

	/**
	 * An uncommented item
	 */
	public Integer getAuthorId() {
		return getValue(VBook.AUTHOR_ID);
	}

	/**
	 * An uncommented item
	 */
	public void setCoAuthorId(Integer value) {
		setValue(VBook.CO_AUTHOR_ID, value);
	}

	/**
	 * An uncommented item
	 */
	public Integer getCoAuthorId() {
		return getValue(VBook.CO_AUTHOR_ID);
	}

	/**
	 * An uncommented item
	 */
	public void setDetailsId(Integer value) {
		setValue(VBook.DETAILS_ID, value);
	}

	/**
	 * An uncommented item
	 */
	public Integer getDetailsId() {
		return getValue(VBook.DETAILS_ID);
	}

	/**
	 * An uncommented item
	 */
	public void setTitle(String value) {
		setValue(VBook.TITLE, value);
	}

	/**
	 * An uncommented item
	 */
	public String getTitle() {
		return getValue(VBook.TITLE);
	}

	/**
	 * An uncommented item
	 */
	public void setPublishedIn(Integer value) {
		setValue(VBook.PUBLISHED_IN, value);
	}

	/**
	 * An uncommented item
	 */
	public Integer getPublishedIn() {
		return getValue(VBook.PUBLISHED_IN);
	}

	/**
	 * An uncommented item
	 */
	public void setLanguageId(Integer value) {
		setValue(VBook.LANGUAGE_ID, value);
	}

	/**
	 * An uncommented item
	 */
	public Integer getLanguageId() {
		return getValue(VBook.LANGUAGE_ID);
	}

	/**
	 * An uncommented item
	 */
	public void setContentText(String value) {
		setValue(VBook.CONTENT_TEXT, value);
	}

	/**
	 * An uncommented item
	 */
	public String getContentText() {
		return getValue(VBook.CONTENT_TEXT);
	}

	/**
	 * An uncommented item
	 */
	public void setContentPdf(byte[] value) {
		setValue(VBook.CONTENT_PDF, value);
	}

	/**
	 * An uncommented item
	 */
	public byte[] getContentPdf() {
		return getValue(VBook.CONTENT_PDF);
	}
	/**
	 * Create a detached VBookRecord
	 */
	public VBookRecord() {
		super(VBook.V_BOOK);
	}

	/**
	 * Create an attached VBookRecord
	 * @deprecated - (#363) use the other constructor instead
	 */
	@Deprecated
	public VBookRecord(Configuration configuration) {
		super(VBook.V_BOOK, configuration);
	}
}
