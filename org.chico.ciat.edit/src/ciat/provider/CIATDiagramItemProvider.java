/**
 */
package ciat.provider;


import ciat.CIATDiagram;
import ciat.CiatFactory;
import ciat.CiatPackage;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link ciat.CIATDiagram} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class CIATDiagramItemProvider 
	extends ItemProviderAdapter
	implements
		IEditingDomainItemProvider,
		IStructuredItemContentProvider,
		ITreeItemContentProvider,
		IItemLabelProvider,
		IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CIATDiagramItemProvider(AdapterFactory adapterFactory) {
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
			childrenFeatures.add(CiatPackage.Literals.CIAT_DIAGRAM__ITS_SOCIOGRAMS);
			childrenFeatures.add(CiatPackage.Literals.CIAT_DIAGRAM__ITS_PROCESS_DIAGRAMS);
			childrenFeatures.add(CiatPackage.Literals.CIAT_DIAGRAM__ITS_DOMAIN_DIAGRAMS);
			childrenFeatures.add(CiatPackage.Literals.CIAT_DIAGRAM__ITS_CTT_DIAGRAMS);
			childrenFeatures.add(CiatPackage.Literals.CIAT_DIAGRAM__ITS_LINKS);
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
	 * This returns CIATDiagram.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/CIATDiagram"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		return getString("_UI_CIATDiagram_type");
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

		switch (notification.getFeatureID(CIATDiagram.class)) {
			case CiatPackage.CIAT_DIAGRAM__ITS_SOCIOGRAMS:
			case CiatPackage.CIAT_DIAGRAM__ITS_PROCESS_DIAGRAMS:
			case CiatPackage.CIAT_DIAGRAM__ITS_DOMAIN_DIAGRAMS:
			case CiatPackage.CIAT_DIAGRAM__ITS_CTT_DIAGRAMS:
			case CiatPackage.CIAT_DIAGRAM__ITS_LINKS:
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
				(CiatPackage.Literals.CIAT_DIAGRAM__ITS_SOCIOGRAMS,
				 CiatFactory.eINSTANCE.createSociogram()));

		newChildDescriptors.add
			(createChildParameter
				(CiatPackage.Literals.CIAT_DIAGRAM__ITS_PROCESS_DIAGRAMS,
				 CiatFactory.eINSTANCE.createProcessDiagram()));

		newChildDescriptors.add
			(createChildParameter
				(CiatPackage.Literals.CIAT_DIAGRAM__ITS_DOMAIN_DIAGRAMS,
				 CiatFactory.eINSTANCE.createDomainDiagram()));

		newChildDescriptors.add
			(createChildParameter
				(CiatPackage.Literals.CIAT_DIAGRAM__ITS_CTT_DIAGRAMS,
				 CiatFactory.eINSTANCE.createCTTDiagram()));

		newChildDescriptors.add
			(createChildParameter
				(CiatPackage.Literals.CIAT_DIAGRAM__ITS_LINKS,
				 CiatFactory.eINSTANCE.createSociogramLink()));

		newChildDescriptors.add
			(createChildParameter
				(CiatPackage.Literals.CIAT_DIAGRAM__ITS_LINKS,
				 CiatFactory.eINSTANCE.createInheritance()));

		newChildDescriptors.add
			(createChildParameter
				(CiatPackage.Literals.CIAT_DIAGRAM__ITS_LINKS,
				 CiatFactory.eINSTANCE.createActing()));

		newChildDescriptors.add
			(createChildParameter
				(CiatPackage.Literals.CIAT_DIAGRAM__ITS_LINKS,
				 CiatFactory.eINSTANCE.createAssociation()));

		newChildDescriptors.add
			(createChildParameter
				(CiatPackage.Literals.CIAT_DIAGRAM__ITS_LINKS,
				 CiatFactory.eINSTANCE.createSharedLink()));

		newChildDescriptors.add
			(createChildParameter
				(CiatPackage.Literals.CIAT_DIAGRAM__ITS_LINKS,
				 CiatFactory.eINSTANCE.createShAssociationLink()));

		newChildDescriptors.add
			(createChildParameter
				(CiatPackage.Literals.CIAT_DIAGRAM__ITS_LINKS,
				 CiatFactory.eINSTANCE.createShGeneralizationLink()));

		newChildDescriptors.add
			(createChildParameter
				(CiatPackage.Literals.CIAT_DIAGRAM__ITS_LINKS,
				 CiatFactory.eINSTANCE.createShAggregationLink()));

		newChildDescriptors.add
			(createChildParameter
				(CiatPackage.Literals.CIAT_DIAGRAM__ITS_LINKS,
				 CiatFactory.eINSTANCE.createDependency()));

		newChildDescriptors.add
			(createChildParameter
				(CiatPackage.Literals.CIAT_DIAGRAM__ITS_LINKS,
				 CiatFactory.eINSTANCE.createAggregation()));

		newChildDescriptors.add
			(createChildParameter
				(CiatPackage.Literals.CIAT_DIAGRAM__ITS_LINKS,
				 CiatFactory.eINSTANCE.createEnabling()));

		newChildDescriptors.add
			(createChildParameter
				(CiatPackage.Literals.CIAT_DIAGRAM__ITS_LINKS,
				 CiatFactory.eINSTANCE.createDisabling()));

		newChildDescriptors.add
			(createChildParameter
				(CiatPackage.Literals.CIAT_DIAGRAM__ITS_LINKS,
				 CiatFactory.eINSTANCE.createEnablingWithInformationPassing()));

		newChildDescriptors.add
			(createChildParameter
				(CiatPackage.Literals.CIAT_DIAGRAM__ITS_LINKS,
				 CiatFactory.eINSTANCE.createDisablingWithInformationPassing()));

		newChildDescriptors.add
			(createChildParameter
				(CiatPackage.Literals.CIAT_DIAGRAM__ITS_LINKS,
				 CiatFactory.eINSTANCE.createIndependentConcurrency()));

		newChildDescriptors.add
			(createChildParameter
				(CiatPackage.Literals.CIAT_DIAGRAM__ITS_LINKS,
				 CiatFactory.eINSTANCE.createOrderIndependence()));

		newChildDescriptors.add
			(createChildParameter
				(CiatPackage.Literals.CIAT_DIAGRAM__ITS_LINKS,
				 CiatFactory.eINSTANCE.createSuspendResume()));

		newChildDescriptors.add
			(createChildParameter
				(CiatPackage.Literals.CIAT_DIAGRAM__ITS_LINKS,
				 CiatFactory.eINSTANCE.createConcurrencyWithInformationPassing()));

		newChildDescriptors.add
			(createChildParameter
				(CiatPackage.Literals.CIAT_DIAGRAM__ITS_LINKS,
				 CiatFactory.eINSTANCE.createDeterministicChoice()));

		newChildDescriptors.add
			(createChildParameter
				(CiatPackage.Literals.CIAT_DIAGRAM__ITS_LINKS,
				 CiatFactory.eINSTANCE.createUndeterministicChoice()));
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return CiatEditPlugin.INSTANCE;
	}

}
