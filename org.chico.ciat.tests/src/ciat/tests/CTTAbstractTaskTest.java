/**
 */
package ciat.tests;

import ciat.CTTAbstractTask;
import ciat.CiatFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>CTT Abstract Task</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class CTTAbstractTaskTest extends CTTTaskTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(CTTAbstractTaskTest.class);
	}

	/**
	 * Constructs a new CTT Abstract Task test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CTTAbstractTaskTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this CTT Abstract Task test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected CTTAbstractTask getFixture() {
		return (CTTAbstractTask)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(CiatFactory.eINSTANCE.createCTTAbstractTask());
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

} //CTTAbstractTaskTest
