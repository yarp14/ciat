/**
 */
package ciat.tests;

import ciat.CiatFactory;
import ciat.CollaborativeTask;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Collaborative Task</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class CollaborativeTaskTest extends SimpleTaskTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(CollaborativeTaskTest.class);
	}

	/**
	 * Constructs a new Collaborative Task test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CollaborativeTaskTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Collaborative Task test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected CollaborativeTask getFixture() {
		return (CollaborativeTask)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(CiatFactory.eINSTANCE.createCollaborativeTask());
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

} //CollaborativeTaskTest
