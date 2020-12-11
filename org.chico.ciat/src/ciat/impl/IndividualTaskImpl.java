/**
 */
package ciat.impl;

import ciat.CiatPackage;
import ciat.IndividualTask;
import ciat.SociogramNode;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Individual Task</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ciat.impl.IndividualTaskImpl#getTaskRoles <em>Task Roles</em>}</li>
 *   <li>{@link ciat.impl.IndividualTaskImpl#getTaskObjects <em>Task Objects</em>}</li>
 * </ul>
 *
 * @generated
 */
public class IndividualTaskImpl extends SimpleTaskImpl implements IndividualTask {
	/**
	 * The cached value of the '{@link #getTaskRoles() <em>Task Roles</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTaskRoles()
	 * @generated
	 * @ordered
	 */
	protected SociogramNode taskRoles;

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
	protected IndividualTaskImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CiatPackage.Literals.INDIVIDUAL_TASK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SociogramNode getTaskRoles() {
		return taskRoles;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTaskRoles(SociogramNode newTaskRoles, NotificationChain msgs) {
		SociogramNode oldTaskRoles = taskRoles;
		taskRoles = newTaskRoles;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CiatPackage.INDIVIDUAL_TASK__TASK_ROLES, oldTaskRoles, newTaskRoles);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTaskRoles(SociogramNode newTaskRoles) {
		if (newTaskRoles != taskRoles) {
			NotificationChain msgs = null;
			if (taskRoles != null)
				msgs = ((InternalEObject)taskRoles).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CiatPackage.INDIVIDUAL_TASK__TASK_ROLES, null, msgs);
			if (newTaskRoles != null)
				msgs = ((InternalEObject)newTaskRoles).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CiatPackage.INDIVIDUAL_TASK__TASK_ROLES, null, msgs);
			msgs = basicSetTaskRoles(newTaskRoles, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CiatPackage.INDIVIDUAL_TASK__TASK_ROLES, newTaskRoles, newTaskRoles));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ciat.Object> getTaskObjects() {
		if (taskObjects == null) {
			taskObjects = new EObjectContainmentEList<ciat.Object>(ciat.Object.class, this, CiatPackage.INDIVIDUAL_TASK__TASK_OBJECTS);
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
			case CiatPackage.INDIVIDUAL_TASK__TASK_ROLES:
				return basicSetTaskRoles(null, msgs);
			case CiatPackage.INDIVIDUAL_TASK__TASK_OBJECTS:
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
			case CiatPackage.INDIVIDUAL_TASK__TASK_ROLES:
				return getTaskRoles();
			case CiatPackage.INDIVIDUAL_TASK__TASK_OBJECTS:
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
			case CiatPackage.INDIVIDUAL_TASK__TASK_ROLES:
				setTaskRoles((SociogramNode)newValue);
				return;
			case CiatPackage.INDIVIDUAL_TASK__TASK_OBJECTS:
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
			case CiatPackage.INDIVIDUAL_TASK__TASK_ROLES:
				setTaskRoles((SociogramNode)null);
				return;
			case CiatPackage.INDIVIDUAL_TASK__TASK_OBJECTS:
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
			case CiatPackage.INDIVIDUAL_TASK__TASK_ROLES:
				return taskRoles != null;
			case CiatPackage.INDIVIDUAL_TASK__TASK_OBJECTS:
				return taskObjects != null && !taskObjects.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //IndividualTaskImpl
