/**
 */
package ciat;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>CTT Task</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ciat.CTTTask#getName <em>Name</em>}</li>
 *   <li>{@link ciat.CTTTask#getDependencies <em>Dependencies</em>}</li>
 * </ul>
 *
 * @see ciat.CiatPackage#getCTTTask()
 * @model
 * @generated
 */
public interface CTTTask extends DependencyElement {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * The default value is <code>"<...>"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see ciat.CiatPackage#getCTTTask_Name()
	 * @model default="&lt;...&gt;"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link ciat.CTTTask#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Dependencies</b></em>' reference list.
	 * The list contents are of type {@link ciat.Dependency}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dependencies</em>' reference list.
	 * @see ciat.CiatPackage#getCTTTask_Dependencies()
	 * @model
	 * @generated
	 */
	EList<Dependency> getDependencies();

} // CTTTask
