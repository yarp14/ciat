/**
 */
package ciat.tests;

import ciat.CiatFactory;
import ciat.IndependentConcurrency;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Independent Concurrency</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class IndependentConcurrencyTest extends DependencyTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(IndependentConcurrencyTest.class);
	}

	/**
	 * Constructs a new Independent Concurrency test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IndependentConcurrencyTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Independent Concurrency test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected IndependentConcurrency getFixture() {
		return (IndependentConcurrency)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(CiatFactory.eINSTANCE.createIndependentConcurrency());
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

} //IndependentConcurrencyTest
