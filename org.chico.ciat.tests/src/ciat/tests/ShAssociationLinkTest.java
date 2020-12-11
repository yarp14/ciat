/**
 */
package ciat.tests;

import ciat.CiatFactory;
import ciat.ShAssociationLink;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Sh Association Link</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ShAssociationLinkTest extends SharedLinkTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ShAssociationLinkTest.class);
	}

	/**
	 * Constructs a new Sh Association Link test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ShAssociationLinkTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Sh Association Link test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected ShAssociationLink getFixture() {
		return (ShAssociationLink)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(CiatFactory.eINSTANCE.createShAssociationLink());
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

} //ShAssociationLinkTest
