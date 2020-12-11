/**
 */
package ciat.tests;

import ciat.CiatFactory;
import ciat.ConcurrencyWithInformationPassing;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Concurrency With Information Passing</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ConcurrencyWithInformationPassingTest extends DependencyTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ConcurrencyWithInformationPassingTest.class);
	}

	/**
	 * Constructs a new Concurrency With Information Passing test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConcurrencyWithInformationPassingTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Concurrency With Information Passing test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected ConcurrencyWithInformationPassing getFixture() {
		return (ConcurrencyWithInformationPassing)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(CiatFactory.eINSTANCE.createConcurrencyWithInformationPassing());
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

} //ConcurrencyWithInformationPassingTest
