/**
 */
package ciat.provider;


import ciat.AbstractTask;
import ciat.CiatFactory;
import ciat.CiatPackage;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link ciat.AbstractTask} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class AbstractTaskItemProvider extends SimpleTaskItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractTaskItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

		}
		return itemPropertyDescriptors;
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(CiatPackage.Literals.ABSTRACT_TASK__PROCESS_NODES);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns AbstractTask.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/AbstractTask"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((AbstractTask)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_AbstractTask_type") :
			getString("_UI_AbstractTask_type") + " " + label;
	}


	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(AbstractTask.class)) {
			case CiatPackage.ABSTRACT_TASK__PROCESS_NODES:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
				return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);

		newChildDescriptors.add
			(createChildParameter
				(CiatPackage.Literals.ABSTRACT_TASK__PROCESS_NODES,
				 CiatFactory.eINSTANCE.createProcessNode()));

		newChildDescriptors.add
			(createChildParameter
				(CiatPackage.Literals.ABSTRACT_TASK__PROCESS_NODES,
				 CiatFactory.eINSTANCE.createInit()));

		newChildDescriptors.add
			(createChildParameter
				(CiatPackage.Literals.ABSTRACT_TASK__PROCESS_NODES,
				 CiatFactory.eINSTANCE.createEnd()));

		newChildDescriptors.add
			(createChildParameter
				(CiatPackage.Literals.ABSTRACT_TASK__PROCESS_NODES,
				 CiatFactory.eINSTANCE.createSimpleTask()));

		newChildDescriptors.add
			(createChildParameter
				(CiatPackage.Literals.ABSTRACT_TASK__PROCESS_NODES,
				 CiatFactory.eINSTANCE.createIndividualTask()));

		newChildDescriptors.add
			(createChildParameter
				(CiatPackage.Literals.ABSTRACT_TASK__PROCESS_NODES,
				 CiatFactory.eINSTANCE.createCooperativeTask()));

		newChildDescriptors.add
			(createChildParameter
				(CiatPackage.Literals.ABSTRACT_TASK__PROCESS_NODES,
				 CiatFactory.eINSTANCE.createCollaborativeTask()));

		newChildDescriptors.add
			(createChildParameter
				(CiatPackage.Literals.ABSTRACT_TASK__PROCESS_NODES,
				 CiatFactory.eINSTANCE.createAbstractTask()));

		newChildDescriptors.add
			(createChildParameter
				(CiatPackage.Literals.ABSTRACT_TASK__PROCESS_NODES,
				 CiatFactory.eINSTANCE.createTemporalCondition()));

		newChildDescriptors.add
			(createChildParameter
				(CiatPackage.Literals.ABSTRACT_TASK__PROCESS_NODES,
				 CiatFactory.eINSTANCE.createNotification()));

		newChildDescriptors.add
			(createChildParameter
				(CiatPackage.Literals.ABSTRACT_TASK__PROCESS_NODES,
				 CiatFactory.eINSTANCE.createCondition()));
	}

}
