/**
 */
package ciat;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>CTT Diagram</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ciat.CTTDiagram#getName <em>Name</em>}</li>
 *   <li>{@link ciat.CTTDiagram#getCttTasks <em>Ctt Tasks</em>}</li>
 * </ul>
 *
 * @see ciat.CiatPackage#getCTTDiagram()
 * @model annotation="gmf.node label='name' tool.small.bundle='org.chico.ciat.figures' tool.small.path='images/CTTDiagram.gif'"
 * @generated
 */
public interface CTTDiagram extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see ciat.CiatPackage#getCTTDiagram_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link ciat.CTTDiagram#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Ctt Tasks</b></em>' containment reference list.
	 * The list contents are of type {@link ciat.CTTTask}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ctt Tasks</em>' containment reference list.
	 * @see ciat.CiatPackage#getCTTDiagram_CttTasks()
	 * @model containment="true"
	 *        annotation="gmf.compartment layout='free' collapsible='true'"
	 * @generated
	 */
	EList<CTTTask> getCttTasks();

} // CTTDiagram
