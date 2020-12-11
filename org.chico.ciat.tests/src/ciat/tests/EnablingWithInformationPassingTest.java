/**
 */
package ciat.tests;

import ciat.CiatFactory;
import ciat.EnablingWithInformationPassing;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Enabling With Information Passing</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class EnablingWithInformationPassingTest extends DependencyTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(EnablingWithInformationPassingTest.class);
	}

	/**
	 * Constructs a new Enabling With Information Passing test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnablingWithInformationPassingTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Enabling With Information Passing test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EnablingWithInformationPassing getFixture() {
		return (EnablingWithInformationPassing)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(CiatFactory.eINSTANCE.createEnablingWithInformationPassing());
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

} //EnablingWithInformationPassingTest
