/**
 */
package ciat.impl;

import ciat.AbstractTask;
import ciat.CiatPackage;
import ciat.ProcessNode;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Abstract Task</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ciat.impl.AbstractTaskImpl#getProcessNodes <em>Process Nodes</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AbstractTaskImpl extends SimpleTaskImpl implements AbstractTask {
	/**
	 * The cached value of the '{@link #getProcessNodes() <em>Process Nodes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProcessNodes()
	 * @generated
	 * @ordered
	 */
	protected EList<ProcessNode> processNodes;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AbstractTaskImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CiatPackage.Literals.ABSTRACT_TASK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ProcessNode> getProcessNodes() {
		if (processNodes == null) {
			processNodes = new EObjectContainmentEList<ProcessNode>(ProcessNode.class, this, CiatPackage.ABSTRACT_TASK__PROCESS_NODES);
		}
		return processNodes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CiatPackage.ABSTRACT_TASK__PROCESS_NODES:
				return ((InternalEList<?>)getProcessNodes()).basicRemove(otherEnd, msgs);
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
			case CiatPackage.ABSTRACT_TASK__PROCESS_NODES:
				return getProcessNodes();
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
			case CiatPackage.ABSTRACT_TASK__PROCESS_NODES:
				getProcessNodes().clear();
				getProcessNodes().addAll((Collection<? extends ProcessNode>)newValue);
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
			case CiatPackage.ABSTRACT_TASK__PROCESS_NODES:
				getProcessNodes().clear();
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
			case CiatPackage.ABSTRACT_TASK__PROCESS_NODES:
				return processNodes != null && !processNodes.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //AbstractTaskImpl
