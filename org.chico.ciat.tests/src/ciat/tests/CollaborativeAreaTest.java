/**
 */
package ciat.tests;

import ciat.CiatFactory;
import ciat.CollaborativeArea;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Collaborative Area</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class CollaborativeAreaTest extends VisualizationAreaTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(CollaborativeAreaTest.class);
	}

	/**
	 * Constructs a new Collaborative Area test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CollaborativeAreaTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Collaborative Area test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected CollaborativeArea getFixture() {
		return (CollaborativeArea)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(CiatFactory.eINSTANCE.createCollaborativeArea());
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

} //CollaborativeAreaTest
