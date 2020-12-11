/**
 */
package ciat;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Collaborative Task</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ciat.CollaborativeTask#getTaskRoles <em>Task Roles</em>}</li>
 *   <li>{@link ciat.CollaborativeTask#getTaskObjects <em>Task Objects</em>}</li>
 * </ul>
 *
 * @see ciat.CiatPackage#getCollaborativeTask()
 * @model annotation="gmf.node label='name' tool.name='Collaborative' tool.small.bundle='org.chico.ciat.figures' tool.small.path='images/CollaborativeInteractionTask.gif'"
 * @generated
 */
public interface CollaborativeTask extends SimpleTask {
	/**
	 * Returns the value of the '<em><b>Task Roles</b></em>' containment reference list.
	 * The list contents are of type {@link ciat.SociogramNode}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Task Roles</em>' containment reference list.
	 * @see ciat.CiatPackage#getCollaborativeTask_TaskRoles()
	 * @model containment="true"
	 *        annotation="gmf.compartment layout='list' collapsible='true'"
	 * @generated
	 */
	EList<SociogramNode> getTaskRoles();

	/**
	 * Returns the value of the '<em><b>Task Objects</b></em>' containment reference list.
	 * The list contents are of type {@link ciat.Object}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Task Objects</em>' containment reference list.
	 * @see ciat.CiatPackage#getCollaborativeTask_TaskObjects()
	 * @model containment="true"
	 *        annotation="gmf.compartment layout='list' collapsible='true'"
	 * @generated
	 */
	EList<ciat.Object> getTaskObjects();

} // CollaborativeTask
