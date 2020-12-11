/**
 */
package ciat.tests;

import ciat.CiatFactory;
import ciat.SociogramNode;

import junit.framework.TestCase;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Sociogram Node</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class SociogramNodeTest extends TestCase {

	/**
	 * The fixture for this Sociogram Node test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SociogramNode fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(SociogramNodeTest.class);
	}

	/**
	 * Constructs a new Sociogram Node test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SociogramNodeTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Sociogram Node test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(SociogramNode fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Sociogram Node test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SociogramNode getFixture() {
		return fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(CiatFactory.eINSTANCE.createSociogramNode());
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

} //SociogramNodeTest
