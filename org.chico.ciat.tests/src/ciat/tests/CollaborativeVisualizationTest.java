/**
 */
package ciat.tests;

import ciat.CiatFactory;
import ciat.CollaborativeVisualization;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Collaborative Visualization</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class CollaborativeVisualizationTest extends CTTTaskTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(CollaborativeVisualizationTest.class);
	}

	/**
	 * Constructs a new Collaborative Visualization test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CollaborativeVisualizationTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Collaborative Visualization test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected CollaborativeVisualization getFixture() {
		return (CollaborativeVisualization)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(CiatFactory.eINSTANCE.createCollaborativeVisualization());
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

} //CollaborativeVisualizationTest
