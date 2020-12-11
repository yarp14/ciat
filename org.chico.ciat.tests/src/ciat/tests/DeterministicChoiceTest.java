/**
 */
package ciat.tests;

import ciat.CiatFactory;
import ciat.DeterministicChoice;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Deterministic Choice</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class DeterministicChoiceTest extends DependencyTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(DeterministicChoiceTest.class);
	}

	/**
	 * Constructs a new Deterministic Choice test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeterministicChoiceTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Deterministic Choice test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected DeterministicChoice getFixture() {
		return (DeterministicChoice)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(CiatFactory.eINSTANCE.createDeterministicChoice());
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

} //DeterministicChoiceTest
