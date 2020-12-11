/**
 */
package ciat.tests;

import ciat.CTTCollaborativeTask;
import ciat.CiatFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>CTT Collaborative Task</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class CTTCollaborativeTaskTest extends CTTTaskTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(CTTCollaborativeTaskTest.class);
	}

	/**
	 * Constructs a new CTT Collaborative Task test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CTTCollaborativeTaskTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this CTT Collaborative Task test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected CTTCollaborativeTask getFixture() {
		return (CTTCollaborativeTask)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(CiatFactory.eINSTANCE.createCTTCollaborativeTask());
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

} //CTTCollaborativeTaskTest
