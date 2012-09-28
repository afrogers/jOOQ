/**
 * This class is generated by jOOQ
 */
package org.jooq.util.oracle.sys.tables;

/**
 * This class is generated by jOOQ.
 *
 * All synonyms for base objects accessible to the user and session
 */
@javax.annotation.Generated(value    = {"http://www.jooq.org", "2.6.0"},
                            comments = "This class is generated by jOOQ")
@java.lang.SuppressWarnings("all")
public class AllSynonyms extends org.jooq.impl.TableImpl<org.jooq.Record> {

	private static final long serialVersionUID = -1259455295;

	/**
	 * The singleton instance of SYS.ALL_SYNONYMS
	 */
	public static final org.jooq.util.oracle.sys.tables.AllSynonyms ALL_SYNONYMS = new org.jooq.util.oracle.sys.tables.AllSynonyms();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.jooq.Record> getRecordType() {
		return org.jooq.Record.class;
	}

	/**
	 * Owner of the synonym
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.String> OWNER = createField("OWNER", org.jooq.impl.SQLDataType.VARCHAR, this);

	/**
	 * Name of the synonym
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.String> SYNONYM_NAME = createField("SYNONYM_NAME", org.jooq.impl.SQLDataType.VARCHAR, this);

	/**
	 * Owner of the object referenced by the synonym
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.String> TABLE_OWNER = createField("TABLE_OWNER", org.jooq.impl.SQLDataType.VARCHAR, this);

	/**
	 * Name of the object referenced by the synonym
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.String> TABLE_NAME = createField("TABLE_NAME", org.jooq.impl.SQLDataType.VARCHAR, this);

	/**
	 * Name of the database link referenced in a remote synonym
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.String> DB_LINK = createField("DB_LINK", org.jooq.impl.SQLDataType.VARCHAR, this);

	public AllSynonyms() {
		super("ALL_SYNONYMS", org.jooq.util.oracle.sys.Sys.SYS);
	}

	public AllSynonyms(java.lang.String alias) {
		super(alias, org.jooq.util.oracle.sys.Sys.SYS, org.jooq.util.oracle.sys.tables.AllSynonyms.ALL_SYNONYMS);
	}

	@Override
	public org.jooq.util.oracle.sys.tables.AllSynonyms as(java.lang.String alias) {
		return new org.jooq.util.oracle.sys.tables.AllSynonyms(alias);
	}
}