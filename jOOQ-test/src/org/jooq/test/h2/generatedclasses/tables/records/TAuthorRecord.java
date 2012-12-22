/**
 * This class is generated by jOOQ
 */
package org.jooq.test.h2.generatedclasses.tables.records;

/**
 * This class is generated by jOOQ.
 *
 * An entity holding authors of books
 */
@java.lang.SuppressWarnings("all")
public class TAuthorRecord extends org.jooq.impl.UpdatableRecordImpl<org.jooq.test.h2.generatedclasses.tables.records.TAuthorRecord> implements org.jooq.Record6<java.lang.Integer, java.lang.String, java.lang.String, java.sql.Date, java.lang.Integer, java.lang.String>, org.jooq.test.h2.generatedclasses.tables.interfaces.ITAuthor {

	private static final long serialVersionUID = 1916840459;

	/**
	 * Setter for <code>PUBLIC.T_AUTHOR.ID</code>. The author ID
	 */
	@Override
	public void setId(java.lang.Integer value) {
		setValue(org.jooq.test.h2.generatedclasses.tables.TAuthor.ID, value);
	}

	/**
	 * Getter for <code>PUBLIC.T_AUTHOR.ID</code>. The author ID
	 */
	@Override
	public java.lang.Integer getId() {
		return getValue(org.jooq.test.h2.generatedclasses.tables.TAuthor.ID);
	}

	/**
	 * Setter for <code>PUBLIC.T_AUTHOR.FIRST_NAME</code>. The author's first name
	 */
	@Override
	public void setFirstName(java.lang.String value) {
		setValue(org.jooq.test.h2.generatedclasses.tables.TAuthor.FIRST_NAME, value);
	}

	/**
	 * Getter for <code>PUBLIC.T_AUTHOR.FIRST_NAME</code>. The author's first name
	 */
	@Override
	public java.lang.String getFirstName() {
		return getValue(org.jooq.test.h2.generatedclasses.tables.TAuthor.FIRST_NAME);
	}

	/**
	 * Setter for <code>PUBLIC.T_AUTHOR.LAST_NAME</code>. The author's last name
	 */
	@Override
	public void setLastName(java.lang.String value) {
		setValue(org.jooq.test.h2.generatedclasses.tables.TAuthor.LAST_NAME, value);
	}

	/**
	 * Getter for <code>PUBLIC.T_AUTHOR.LAST_NAME</code>. The author's last name
	 */
	@Override
	public java.lang.String getLastName() {
		return getValue(org.jooq.test.h2.generatedclasses.tables.TAuthor.LAST_NAME);
	}

	/**
	 * Setter for <code>PUBLIC.T_AUTHOR.DATE_OF_BIRTH</code>. The author's date of birth
	 */
	@Override
	public void setDateOfBirth(java.sql.Date value) {
		setValue(org.jooq.test.h2.generatedclasses.tables.TAuthor.DATE_OF_BIRTH, value);
	}

	/**
	 * Getter for <code>PUBLIC.T_AUTHOR.DATE_OF_BIRTH</code>. The author's date of birth
	 */
	@Override
	public java.sql.Date getDateOfBirth() {
		return getValue(org.jooq.test.h2.generatedclasses.tables.TAuthor.DATE_OF_BIRTH);
	}

	/**
	 * Setter for <code>PUBLIC.T_AUTHOR.YEAR_OF_BIRTH</code>. The author's year of birth
	 */
	@Override
	public void setYearOfBirth(java.lang.Integer value) {
		setValue(org.jooq.test.h2.generatedclasses.tables.TAuthor.YEAR_OF_BIRTH, value);
	}

	/**
	 * Getter for <code>PUBLIC.T_AUTHOR.YEAR_OF_BIRTH</code>. The author's year of birth
	 */
	@Override
	public java.lang.Integer getYearOfBirth() {
		return getValue(org.jooq.test.h2.generatedclasses.tables.TAuthor.YEAR_OF_BIRTH);
	}

	/**
	 * Setter for <code>PUBLIC.T_AUTHOR.ADDRESS</code>. The author's address
	 */
	@Override
	public void setAddress(java.lang.String value) {
		setValue(org.jooq.test.h2.generatedclasses.tables.TAuthor.ADDRESS, value);
	}

	/**
	 * Getter for <code>PUBLIC.T_AUTHOR.ADDRESS</code>. The author's address
	 */
	@Override
	public java.lang.String getAddress() {
		return getValue(org.jooq.test.h2.generatedclasses.tables.TAuthor.ADDRESS);
	}

	// -------------------------------------------------------------------------
	// Primary key information
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Record1<java.lang.Integer> key() {
		return (org.jooq.Record1) super.key();
	}

	// -------------------------------------------------------------------------
	// Record6 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row6<java.lang.Integer, java.lang.String, java.lang.String, java.sql.Date, java.lang.Integer, java.lang.String> fieldsRow() {
		return org.jooq.impl.Factory.row(field1(), field2(), field3(), field4(), field5(), field6());
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row6<java.lang.Integer, java.lang.String, java.lang.String, java.sql.Date, java.lang.Integer, java.lang.String> valuesRow() {
		return org.jooq.impl.Factory.row(value1(), value2(), value3(), value4(), value5(), value6());
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field1() {
		return org.jooq.test.h2.generatedclasses.tables.TAuthor.ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field2() {
		return org.jooq.test.h2.generatedclasses.tables.TAuthor.FIRST_NAME;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field3() {
		return org.jooq.test.h2.generatedclasses.tables.TAuthor.LAST_NAME;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.sql.Date> field4() {
		return org.jooq.test.h2.generatedclasses.tables.TAuthor.DATE_OF_BIRTH;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field5() {
		return org.jooq.test.h2.generatedclasses.tables.TAuthor.YEAR_OF_BIRTH;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field6() {
		return org.jooq.test.h2.generatedclasses.tables.TAuthor.ADDRESS;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Integer value1() {
		return getId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value2() {
		return getFirstName();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value3() {
		return getLastName();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.sql.Date value4() {
		return getDateOfBirth();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Integer value5() {
		return getYearOfBirth();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value6() {
		return getAddress();
	}

	// -------------------------------------------------------------------------
	// FROM and INTO
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void from(org.jooq.test.h2.generatedclasses.tables.interfaces.ITAuthor from) {
		setId(from.getId());
		setFirstName(from.getFirstName());
		setLastName(from.getLastName());
		setDateOfBirth(from.getDateOfBirth());
		setYearOfBirth(from.getYearOfBirth());
		setAddress(from.getAddress());
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public <E extends org.jooq.test.h2.generatedclasses.tables.interfaces.ITAuthor> E into(E into) {
		into.from(this);
		return into;
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached TAuthorRecord
	 */
	public TAuthorRecord() {
		super(org.jooq.test.h2.generatedclasses.tables.TAuthor.T_AUTHOR);
	}
}
