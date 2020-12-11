/**
 */
package ciat.tests;

import ciat.CiatFactory;
import ciat.ShGeneralizationLink;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Sh Generalization Link</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ShGeneralizationLinkTest extends SharedLinkTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ShGeneralizationLinkTest.class);
	}

	/**
	 * Constructs a new Sh Generalization Link test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ShGeneralizationLinkTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Sh Generalization Link test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected ShGeneralizationLink getFixture() {
		return (ShGeneralizationLink)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(CiatFactory.eINSTANCE.createShGeneralizationLink());
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

} //ShGeneralizationLinkTest
