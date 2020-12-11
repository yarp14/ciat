/**
 */
package ciat.tests;

import ciat.CiatFactory;
import ciat.DisablingWithInformationPassing;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Disabling With Information Passing</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class DisablingWithInformationPassingTest extends DependencyTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(DisablingWithInformationPassingTest.class);
	}

	/**
	 * Constructs a new Disabling With Information Passing test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DisablingWithInformationPassingTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Disabling With Information Passing test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected DisablingWithInformationPassing getFixture() {
		return (DisablingWithInformationPassing)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(CiatFactory.eINSTANCE.createDisablingWithInformationPassing());
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

} //DisablingWithInformationPassingTest
