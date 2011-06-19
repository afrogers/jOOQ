/**
 * This class is generated by jOOQ
 */
package org.jooq.test.sqlserver.generatedclasses.tables;


import javax.annotation.Generated;

import org.jooq.TableField;
import org.jooq.impl.SQLDataType;
import org.jooq.impl.TableFieldImpl;
import org.jooq.impl.TableImpl;
import org.jooq.test.sqlserver.generatedclasses.Dbo;
import org.jooq.test.sqlserver.generatedclasses.tables.records.VLibraryRecord;


/**
 * This class is generated by jOOQ.
 */
@Generated(value    = "http://jooq.sourceforge.net",
           comments = "This class is generated by jOOQ")
public class VLibrary extends TableImpl<VLibraryRecord> {

	private static final long serialVersionUID = -256242677;

	/**
	 * The singleton instance of v_library
	 */
	public static final VLibrary V_LIBRARY = new VLibrary();

	/**
	 * The class holding records for this type
	 */
	private static final Class<VLibraryRecord> __RECORD_TYPE = VLibraryRecord.class;

	/**
	 * The class holding records for this type
	 */
	@Override
	public Class<VLibraryRecord> getRecordType() {
		return __RECORD_TYPE;
	}

	/**
	 * An uncommented item
	 */
	public static final TableField<VLibraryRecord, String> AUTHOR = new TableFieldImpl<VLibraryRecord, String>("author", SQLDataType.VARCHAR, V_LIBRARY);

	/**
	 * An uncommented item
	 */
	public static final TableField<VLibraryRecord, String> TITLE = new TableFieldImpl<VLibraryRecord, String>("title", SQLDataType.VARCHAR, V_LIBRARY);

	/**
	 * No further instances allowed
	 */
	private VLibrary() {
		super("v_library", Dbo.DBO);
	}
}
