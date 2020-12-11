/**
 */
package ciat.impl;

import ciat.Actor;
import ciat.CiatPackage;
import ciat.Group;
import ciat.Rol;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Actor</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ciat.impl.ActorImpl#getItsGroup <em>Its Group</em>}</li>
 *   <li>{@link ciat.impl.ActorImpl#getActs <em>Acts</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ActorImpl extends SociogramNodeImpl implements Actor {
	/**
	 * The cached value of the '{@link #getItsGroup() <em>Its Group</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getItsGroup()
	 * @generated
	 * @ordered
	 */
	protected EList<Group> itsGroup;

	/**
	 * The cached value of the '{@link #getActs() <em>Acts</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActs()
	 * @generated
	 * @ordered
	 */
	protected EList<Rol> acts;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ActorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CiatPackage.Literals.ACTOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Group> getItsGroup() {
		if (itsGroup == null) {
			itsGroup = new EObjectResolvingEList<Group>(Group.class, this, CiatPackage.ACTOR__ITS_GROUP);
		}
		return itsGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Rol> getActs() {
		if (acts == null) {
			acts = new EObjectResolvingEList<Rol>(Rol.class, this, CiatPackage.ACTOR__ACTS);
		}
		return acts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CiatPackage.ACTOR__ITS_GROUP:
				return getItsGroup();
			case CiatPackage.ACTOR__ACTS:
				return getActs();
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
			case CiatPackage.ACTOR__ITS_GROUP:
				getItsGroup().clear();
				getItsGroup().addAll((Collection<? extends Group>)newValue);
				return;
			case CiatPackage.ACTOR__ACTS:
				getActs().clear();
				getActs().addAll((Collection<? extends Rol>)newValue);
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
			case CiatPackage.ACTOR__ITS_GROUP:
				getItsGroup().clear();
				return;
			case CiatPackage.ACTOR__ACTS:
				getActs().clear();
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
			case CiatPackage.ACTOR__ITS_GROUP:
				return itsGroup != null && !itsGroup.isEmpty();
			case CiatPackage.ACTOR__ACTS:
				return acts != null && !acts.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ActorImpl
