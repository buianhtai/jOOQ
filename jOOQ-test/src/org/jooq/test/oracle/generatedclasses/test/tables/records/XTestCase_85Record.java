/**
 * This class is generated by jOOQ
 */
package org.jooq.test.oracle.generatedclasses.test.tables.records;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings("all")
@javax.persistence.Entity
@javax.persistence.Table(name = "X_TEST_CASE_85", schema = "TEST")
public class XTestCase_85Record extends org.jooq.impl.UpdatableRecordImpl<org.jooq.test.oracle.generatedclasses.test.tables.records.XTestCase_85Record> implements org.jooq.Record3<java.lang.Integer, java.lang.Integer, java.lang.String> {

	private static final long serialVersionUID = 709732513;

	/**
	 * Setter for <code>TEST.X_TEST_CASE_85.ID</code>. 
	 */
	public void setId(java.lang.Integer value) {
		setValue(org.jooq.test.oracle.generatedclasses.test.tables.XTestCase_85.X_TEST_CASE_85.ID, value);
	}

	/**
	 * Getter for <code>TEST.X_TEST_CASE_85.ID</code>. 
	 */
	@javax.persistence.Id
	@javax.persistence.Column(name = "ID", unique = true, nullable = false, precision = 7)
	public java.lang.Integer getId() {
		return getValue(org.jooq.test.oracle.generatedclasses.test.tables.XTestCase_85.X_TEST_CASE_85.ID);
	}

	/**
	 * Setter for <code>TEST.X_TEST_CASE_85.X_UNUSED_ID</code>. 
	 */
	public void setXUnusedId(java.lang.Integer value) {
		setValue(org.jooq.test.oracle.generatedclasses.test.tables.XTestCase_85.X_TEST_CASE_85.X_UNUSED_ID, value);
	}

	/**
	 * Getter for <code>TEST.X_TEST_CASE_85.X_UNUSED_ID</code>. 
	 */
	@javax.persistence.Column(name = "X_UNUSED_ID", precision = 7)
	public java.lang.Integer getXUnusedId() {
		return getValue(org.jooq.test.oracle.generatedclasses.test.tables.XTestCase_85.X_TEST_CASE_85.X_UNUSED_ID);
	}

	/**
	 * Setter for <code>TEST.X_TEST_CASE_85.X_UNUSED_NAME</code>. 
	 */
	public void setXUnusedName(java.lang.String value) {
		setValue(org.jooq.test.oracle.generatedclasses.test.tables.XTestCase_85.X_TEST_CASE_85.X_UNUSED_NAME, value);
	}

	/**
	 * Getter for <code>TEST.X_TEST_CASE_85.X_UNUSED_NAME</code>. 
	 */
	@javax.persistence.Column(name = "X_UNUSED_NAME", length = 10)
	public java.lang.String getXUnusedName() {
		return getValue(org.jooq.test.oracle.generatedclasses.test.tables.XTestCase_85.X_TEST_CASE_85.X_UNUSED_NAME);
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
	// Record3 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row3<java.lang.Integer, java.lang.Integer, java.lang.String> fieldsRow() {
		return org.jooq.impl.Factory.row(field1(), field2(), field3());
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row3<java.lang.Integer, java.lang.Integer, java.lang.String> valuesRow() {
		return org.jooq.impl.Factory.row(value1(), value2(), value3());
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field1() {
		return org.jooq.test.oracle.generatedclasses.test.tables.XTestCase_85.X_TEST_CASE_85.ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field2() {
		return org.jooq.test.oracle.generatedclasses.test.tables.XTestCase_85.X_TEST_CASE_85.X_UNUSED_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field3() {
		return org.jooq.test.oracle.generatedclasses.test.tables.XTestCase_85.X_TEST_CASE_85.X_UNUSED_NAME;
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
	public java.lang.Integer value2() {
		return getXUnusedId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value3() {
		return getXUnusedName();
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached XTestCase_85Record
	 */
	public XTestCase_85Record() {
		super(org.jooq.test.oracle.generatedclasses.test.tables.XTestCase_85.X_TEST_CASE_85);
	}
}
