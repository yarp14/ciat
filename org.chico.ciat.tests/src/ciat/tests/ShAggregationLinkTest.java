/**
 */
package ciat.tests;

import ciat.CiatFactory;
import ciat.ShAggregationLink;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Sh Aggregation Link</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ShAggregationLinkTest extends SharedLinkTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ShAggregationLinkTest.class);
	}

	/**
	 * Constructs a new Sh Aggregation Link test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ShAggregationLinkTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Sh Aggregation Link test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected ShAggregationLink getFixture() {
		return (ShAggregationLink)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(CiatFactory.eINSTANCE.createShAggregationLink());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
	}

} //ShAggregationLinkTest
