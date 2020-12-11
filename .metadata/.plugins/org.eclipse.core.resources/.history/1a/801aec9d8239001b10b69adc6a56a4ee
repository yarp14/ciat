/**
 */
package ciat.impl;

import ciat.CiatPackage;
import ciat.CollaborativeTask;
import ciat.SociogramNode;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Collaborative Task</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ciat.impl.CollaborativeTaskImpl#getTaskRoles <em>Task Roles</em>}</li>
 *   <li>{@link ciat.impl.CollaborativeTaskImpl#getTaskObjects <em>Task Objects</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CollaborativeTaskImpl extends SimpleTaskImpl implements CollaborativeTask {
	/**
	 * The cached value of the '{@link #getTaskRoles() <em>Task Roles</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTaskRoles()
	 * @generated
	 * @ordered
	 */
	protected EList<SociogramNode> taskRoles;

	/**
	 * The cached value of the '{@link #getTaskObjects() <em>Task Objects</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTaskObjects()
	 * @generated
	 * @ordered
	 */
	protected EList<ciat.Object> taskObjects;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CollaborativeTaskImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CiatPackage.Literals.COLLABORATIVE_TASK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SociogramNode> getTaskRoles() {
		if (taskRoles == null) {
			taskRoles = new EObjectContainmentEList<SociogramNode>(SociogramNode.class, this, CiatPackage.COLLABORATIVE_TASK__TASK_ROLES);
		}
		return taskRoles;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ciat.Object> getTaskObjects() {
		if (taskObjects == null) {
			taskObjects = new EObjectContainmentEList<ciat.Object>(ciat.Object.class, this, CiatPackage.COLLABORATIVE_TASK__TASK_OBJECTS);
		}
		return taskObjects;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CiatPackage.COLLABORATIVE_TASK__TASK_ROLES:
				return ((InternalEList<?>)getTaskRoles()).basicRemove(otherEnd, msgs);
			case CiatPackage.COLLABORATIVE_TASK__TASK_OBJECTS:
				return ((InternalEList<?>)getTaskObjects()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CiatPackage.COLLABORATIVE_TASK__TASK_ROLES:
				return getTaskRoles();
			case CiatPackage.COLLABORATIVE_TASK__TASK_OBJECTS:
				return getTaskObjects();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case CiatPackage.COLLABORATIVE_TASK__TASK_ROLES:
				getTaskRoles().clear();
				getTaskRoles().addAll((Collection<? extends SociogramNode>)newValue);
				return;
			case CiatPackage.COLLABORATIVE_TASK__TASK_OBJECTS:
				getTaskObjects().clear();
				getTaskObjects().addAll((Collection<? extends ciat.Object>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case CiatPackage.COLLABORATIVE_TASK__TASK_ROLES:
				getTaskRoles().clear();
				return;
			case CiatPackage.COLLABORATIVE_TASK__TASK_OBJECTS:
				getTaskObjects().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case CiatPackage.COLLABORATIVE_TASK__TASK_ROLES:
				return taskRoles != null && !taskRoles.isEmpty();
			case CiatPackage.COLLABORATIVE_TASK__TASK_OBJECTS:
				return taskObjects != null && !taskObjects.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //CollaborativeTaskImpl
