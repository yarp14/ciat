/**
 */
package ciat.tests;

import ciat.CiatFactory;
import ciat.ExclusiveEditionArea;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Exclusive Edition Area</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ExclusiveEditionAreaTest extends VisualizationAreaTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ExclusiveEditionAreaTest.class);
	}

	/**
	 * Constructs a new Exclusive Edition Area test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExclusiveEditionAreaTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Exclusive Edition Area test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected ExclusiveEditionArea getFixture() {
		return (ExclusiveEditionArea)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(CiatFactory.eINSTANCE.createExclusiveEditionArea());
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

} //ExclusiveEditionAreaTest
