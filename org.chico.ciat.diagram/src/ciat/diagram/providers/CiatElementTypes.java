/*
 * 
 */
package ciat.diagram.providers;

import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Map;
import java.util.Set;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.ENamedElement;
import org.eclipse.gmf.runtime.emf.type.core.ElementTypeRegistry;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.tooling.runtime.providers.DiagramElementTypeImages;
import org.eclipse.gmf.tooling.runtime.providers.DiagramElementTypes;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.swt.graphics.Image;

import ciat.CiatPackage;
import ciat.diagram.edit.parts.AbstractTask2EditPart;
import ciat.diagram.edit.parts.AbstractTaskEditPart;
import ciat.diagram.edit.parts.ActingEditPart;
import ciat.diagram.edit.parts.Actor2EditPart;
import ciat.diagram.edit.parts.Actor3EditPart;
import ciat.diagram.edit.parts.Actor4EditPart;
import ciat.diagram.edit.parts.ActorEditPart;
import ciat.diagram.edit.parts.AggregationEditPart;
import ciat.diagram.edit.parts.ApplicationTaskEditPart;
import ciat.diagram.edit.parts.AssociationEditPart;
import ciat.diagram.edit.parts.AttributeEditPart;
import ciat.diagram.edit.parts.CIATDiagramEditPart;
import ciat.diagram.edit.parts.CTTAbstractTaskEditPart;
import ciat.diagram.edit.parts.CTTCollaborativeTaskEditPart;
import ciat.diagram.edit.parts.CTTDiagramEditPart;
import ciat.diagram.edit.parts.CollaborativeAreaEditPart;
import ciat.diagram.edit.parts.CollaborativeTask2EditPart;
import ciat.diagram.edit.parts.CollaborativeTaskEditPart;
import ciat.diagram.edit.parts.CollaborativeVisualizationEditPart;
import ciat.diagram.edit.parts.ConcurrencyWithInformationPassingEditPart;
import ciat.diagram.edit.parts.Condition2EditPart;
import ciat.diagram.edit.parts.ConditionEditPart;
import ciat.diagram.edit.parts.CooperativeTask2EditPart;
import ciat.diagram.edit.parts.CooperativeTaskEditPart;
import ciat.diagram.edit.parts.DeterministicChoiceEditPart;
import ciat.diagram.edit.parts.DisablingEditPart;
import ciat.diagram.edit.parts.DisablingWithInformationPassingEditPart;
import ciat.diagram.edit.parts.DomainDiagramEditPart;
import ciat.diagram.edit.parts.EnablingEditPart;
import ciat.diagram.edit.parts.EnablingWithInformationPassingEditPart;
import ciat.diagram.edit.parts.End2EditPart;
import ciat.diagram.edit.parts.EndEditPart;
import ciat.diagram.edit.parts.ExclusiveEditionAreaEditPart;
import ciat.diagram.edit.parts.ExclusiveEditionEditPart;
import ciat.diagram.edit.parts.Group2EditPart;
import ciat.diagram.edit.parts.Group3EditPart;
import ciat.diagram.edit.parts.Group4EditPart;
import ciat.diagram.edit.parts.GroupEditPart;
import ciat.diagram.edit.parts.IndependentConcurrencyEditPart;
import ciat.diagram.edit.parts.IndividualAreaEditPart;
import ciat.diagram.edit.parts.IndividualTask2EditPart;
import ciat.diagram.edit.parts.IndividualTaskEditPart;
import ciat.diagram.edit.parts.IndividualVisualizationEditPart;
import ciat.diagram.edit.parts.InheritanceEditPart;
import ciat.diagram.edit.parts.Init2EditPart;
import ciat.diagram.edit.parts.InitEditPart;
import ciat.diagram.edit.parts.InteractiveTaskEditPart;
import ciat.diagram.edit.parts.Notification2EditPart;
import ciat.diagram.edit.parts.NotificationEditPart;
import ciat.diagram.edit.parts.Object2EditPart;
import ciat.diagram.edit.parts.Object3EditPart;
import ciat.diagram.edit.parts.ObjectEditPart;
import ciat.diagram.edit.parts.OperationEditPart;
import ciat.diagram.edit.parts.OrderIndependenceEditPart;
import ciat.diagram.edit.parts.ProcessDiagramEditPart;
import ciat.diagram.edit.parts.Rol2EditPart;
import ciat.diagram.edit.parts.Rol3EditPart;
import ciat.diagram.edit.parts.Rol4EditPart;
import ciat.diagram.edit.parts.RolEditPart;
import ciat.diagram.edit.parts.ShAggregationLinkEditPart;
import ciat.diagram.edit.parts.ShAssociationLinkEditPart;
import ciat.diagram.edit.parts.ShGeneralizationLinkEditPart;
import ciat.diagram.edit.parts.SharedObjectEditPart;
import ciat.diagram.edit.parts.SociogramEditPart;
import ciat.diagram.edit.parts.SoftwareAgent2EditPart;
import ciat.diagram.edit.parts.SoftwareAgent3EditPart;
import ciat.diagram.edit.parts.SoftwareAgent4EditPart;
import ciat.diagram.edit.parts.SoftwareAgentEditPart;
import ciat.diagram.edit.parts.SuspendResumeEditPart;
import ciat.diagram.edit.parts.Team2EditPart;
import ciat.diagram.edit.parts.Team3EditPart;
import ciat.diagram.edit.parts.Team4EditPart;
import ciat.diagram.edit.parts.TeamEditPart;
import ciat.diagram.edit.parts.TemporalCondition2EditPart;
import ciat.diagram.edit.parts.TemporalConditionEditPart;
import ciat.diagram.edit.parts.ToolEditPart;
import ciat.diagram.edit.parts.UndeterministicChoiceEditPart;
import ciat.diagram.edit.parts.UserTaskEditPart;
import ciat.diagram.part.CiatDiagramEditorPlugin;

/**
 * @generated
 */
public class CiatElementTypes {

	/**
	* @generated
	*/
	private CiatElementTypes() {
	}

	/**
	* @generated
	*/
	private static Map<IElementType, ENamedElement> elements;

	/**
	* @generated
	*/
	private static DiagramElementTypeImages elementTypeImages = new DiagramElementTypeImages(
			CiatDiagramEditorPlugin.getInstance().getItemProvidersAdapterFactory());

	/**
	* @generated
	*/
	private static Set<IElementType> KNOWN_ELEMENT_TYPES;

	/**
	* @generated
	*/
	public static final IElementType CIATDiagram_1000 = getElementType("org.chico.ciat.diagram.CIATDiagram_1000"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Sociogram_2001 = getElementType("org.chico.ciat.diagram.Sociogram_2001"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType ProcessDiagram_2002 = getElementType("org.chico.ciat.diagram.ProcessDiagram_2002"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType DomainDiagram_2003 = getElementType("org.chico.ciat.diagram.DomainDiagram_2003"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType CTTDiagram_2004 = getElementType("org.chico.ciat.diagram.CTTDiagram_2004"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Rol_3001 = getElementType("org.chico.ciat.diagram.Rol_3001"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Actor_3002 = getElementType("org.chico.ciat.diagram.Actor_3002"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType SoftwareAgent_3003 = getElementType("org.chico.ciat.diagram.SoftwareAgent_3003"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Team_3004 = getElementType("org.chico.ciat.diagram.Team_3004"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Group_3005 = getElementType("org.chico.ciat.diagram.Group_3005"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType IndividualTask_3006 = getElementType("org.chico.ciat.diagram.IndividualTask_3006"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Rol_3007 = getElementType("org.chico.ciat.diagram.Rol_3007"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Actor_3008 = getElementType("org.chico.ciat.diagram.Actor_3008"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType SoftwareAgent_3009 = getElementType("org.chico.ciat.diagram.SoftwareAgent_3009"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Team_3010 = getElementType("org.chico.ciat.diagram.Team_3010"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Group_3011 = getElementType("org.chico.ciat.diagram.Group_3011"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Tool_3012 = getElementType("org.chico.ciat.diagram.Tool_3012"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Object_3013 = getElementType("org.chico.ciat.diagram.Object_3013"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType CooperativeTask_3014 = getElementType(
			"org.chico.ciat.diagram.CooperativeTask_3014"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Rol_3015 = getElementType("org.chico.ciat.diagram.Rol_3015"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Actor_3016 = getElementType("org.chico.ciat.diagram.Actor_3016"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType SoftwareAgent_3017 = getElementType("org.chico.ciat.diagram.SoftwareAgent_3017"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Team_3018 = getElementType("org.chico.ciat.diagram.Team_3018"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Group_3019 = getElementType("org.chico.ciat.diagram.Group_3019"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Object_3020 = getElementType("org.chico.ciat.diagram.Object_3020"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType CollaborativeTask_3021 = getElementType(
			"org.chico.ciat.diagram.CollaborativeTask_3021"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Rol_3022 = getElementType("org.chico.ciat.diagram.Rol_3022"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Actor_3023 = getElementType("org.chico.ciat.diagram.Actor_3023"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType SoftwareAgent_3024 = getElementType("org.chico.ciat.diagram.SoftwareAgent_3024"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Team_3025 = getElementType("org.chico.ciat.diagram.Team_3025"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Group_3026 = getElementType("org.chico.ciat.diagram.Group_3026"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Object_3027 = getElementType("org.chico.ciat.diagram.Object_3027"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType AbstractTask_3028 = getElementType("org.chico.ciat.diagram.AbstractTask_3028"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType IndividualTask_3029 = getElementType("org.chico.ciat.diagram.IndividualTask_3029"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType CooperativeTask_3030 = getElementType(
			"org.chico.ciat.diagram.CooperativeTask_3030"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType CollaborativeTask_3031 = getElementType(
			"org.chico.ciat.diagram.CollaborativeTask_3031"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType AbstractTask_3032 = getElementType("org.chico.ciat.diagram.AbstractTask_3032"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Init_3033 = getElementType("org.chico.ciat.diagram.Init_3033"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType End_3034 = getElementType("org.chico.ciat.diagram.End_3034"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType TemporalCondition_3035 = getElementType(
			"org.chico.ciat.diagram.TemporalCondition_3035"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Notification_3036 = getElementType("org.chico.ciat.diagram.Notification_3036"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Condition_3037 = getElementType("org.chico.ciat.diagram.Condition_3037"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Init_3038 = getElementType("org.chico.ciat.diagram.Init_3038"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType End_3039 = getElementType("org.chico.ciat.diagram.End_3039"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType TemporalCondition_3040 = getElementType(
			"org.chico.ciat.diagram.TemporalCondition_3040"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Notification_3041 = getElementType("org.chico.ciat.diagram.Notification_3041"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Condition_3042 = getElementType("org.chico.ciat.diagram.Condition_3042"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType SharedObject_3043 = getElementType("org.chico.ciat.diagram.SharedObject_3043"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType ExclusiveEditionArea_3044 = getElementType(
			"org.chico.ciat.diagram.ExclusiveEditionArea_3044"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType CollaborativeArea_3045 = getElementType(
			"org.chico.ciat.diagram.CollaborativeArea_3045"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType IndividualArea_3046 = getElementType("org.chico.ciat.diagram.IndividualArea_3046"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Attribute_3047 = getElementType("org.chico.ciat.diagram.Attribute_3047"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Operation_3048 = getElementType("org.chico.ciat.diagram.Operation_3048"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType ExclusiveEdition_3049 = getElementType(
			"org.chico.ciat.diagram.ExclusiveEdition_3049"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType CollaborativeVisualization_3050 = getElementType(
			"org.chico.ciat.diagram.CollaborativeVisualization_3050"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType IndividualVisualization_3051 = getElementType(
			"org.chico.ciat.diagram.IndividualVisualization_3051"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType UserTask_3052 = getElementType("org.chico.ciat.diagram.UserTask_3052"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType CTTAbstractTask_3053 = getElementType(
			"org.chico.ciat.diagram.CTTAbstractTask_3053"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType InteractiveTask_3054 = getElementType(
			"org.chico.ciat.diagram.InteractiveTask_3054"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType CTTCollaborativeTask_3055 = getElementType(
			"org.chico.ciat.diagram.CTTCollaborativeTask_3055"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType ApplicationTask_3056 = getElementType(
			"org.chico.ciat.diagram.ApplicationTask_3056"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Inheritance_4001 = getElementType("org.chico.ciat.diagram.Inheritance_4001"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Acting_4002 = getElementType("org.chico.ciat.diagram.Acting_4002"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Association_4003 = getElementType("org.chico.ciat.diagram.Association_4003"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType ShAssociationLink_4004 = getElementType(
			"org.chico.ciat.diagram.ShAssociationLink_4004"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType ShGeneralizationLink_4005 = getElementType(
			"org.chico.ciat.diagram.ShGeneralizationLink_4005"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType ShAggregationLink_4006 = getElementType(
			"org.chico.ciat.diagram.ShAggregationLink_4006"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Aggregation_4007 = getElementType("org.chico.ciat.diagram.Aggregation_4007"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Enabling_4008 = getElementType("org.chico.ciat.diagram.Enabling_4008"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Disabling_4009 = getElementType("org.chico.ciat.diagram.Disabling_4009"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType EnablingWithInformationPassing_4010 = getElementType(
			"org.chico.ciat.diagram.EnablingWithInformationPassing_4010"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType DisablingWithInformationPassing_4011 = getElementType(
			"org.chico.ciat.diagram.DisablingWithInformationPassing_4011"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType IndependentConcurrency_4012 = getElementType(
			"org.chico.ciat.diagram.IndependentConcurrency_4012"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType OrderIndependence_4013 = getElementType(
			"org.chico.ciat.diagram.OrderIndependence_4013"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType SuspendResume_4014 = getElementType("org.chico.ciat.diagram.SuspendResume_4014"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType ConcurrencyWithInformationPassing_4015 = getElementType(
			"org.chico.ciat.diagram.ConcurrencyWithInformationPassing_4015"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType DeterministicChoice_4016 = getElementType(
			"org.chico.ciat.diagram.DeterministicChoice_4016"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType UndeterministicChoice_4017 = getElementType(
			"org.chico.ciat.diagram.UndeterministicChoice_4017"); //$NON-NLS-1$

	/**
	* @generated
	*/
	public static ImageDescriptor getImageDescriptor(ENamedElement element) {
		return elementTypeImages.getImageDescriptor(element);
	}

	/**
	* @generated
	*/
	public static Image getImage(ENamedElement element) {
		return elementTypeImages.getImage(element);
	}

	/**
	* @generated
	*/
	public static ImageDescriptor getImageDescriptor(IAdaptable hint) {
		return getImageDescriptor(getElement(hint));
	}

	/**
	* @generated
	*/
	public static Image getImage(IAdaptable hint) {
		return getImage(getElement(hint));
	}

	/**
	* Returns 'type' of the ecore object associated with the hint.
	* 
	* @generated
	*/
	public static ENamedElement getElement(IAdaptable hint) {
		Object type = hint.getAdapter(IElementType.class);
		if (elements == null) {
			elements = new IdentityHashMap<IElementType, ENamedElement>();

			elements.put(CIATDiagram_1000, CiatPackage.eINSTANCE.getCIATDiagram());

			elements.put(Sociogram_2001, CiatPackage.eINSTANCE.getSociogram());

			elements.put(ProcessDiagram_2002, CiatPackage.eINSTANCE.getProcessDiagram());

			elements.put(DomainDiagram_2003, CiatPackage.eINSTANCE.getDomainDiagram());

			elements.put(CTTDiagram_2004, CiatPackage.eINSTANCE.getCTTDiagram());

			elements.put(Rol_3001, CiatPackage.eINSTANCE.getRol());

			elements.put(Actor_3002, CiatPackage.eINSTANCE.getActor());

			elements.put(SoftwareAgent_3003, CiatPackage.eINSTANCE.getSoftwareAgent());

			elements.put(Team_3004, CiatPackage.eINSTANCE.getTeam());

			elements.put(Group_3005, CiatPackage.eINSTANCE.getGroup());

			elements.put(IndividualTask_3006, CiatPackage.eINSTANCE.getIndividualTask());

			elements.put(Rol_3007, CiatPackage.eINSTANCE.getRol());

			elements.put(Actor_3008, CiatPackage.eINSTANCE.getActor());

			elements.put(SoftwareAgent_3009, CiatPackage.eINSTANCE.getSoftwareAgent());

			elements.put(Team_3010, CiatPackage.eINSTANCE.getTeam());

			elements.put(Group_3011, CiatPackage.eINSTANCE.getGroup());

			elements.put(Tool_3012, CiatPackage.eINSTANCE.getTool());

			elements.put(Object_3013, CiatPackage.eINSTANCE.getObject());

			elements.put(CooperativeTask_3014, CiatPackage.eINSTANCE.getCooperativeTask());

			elements.put(Rol_3015, CiatPackage.eINSTANCE.getRol());

			elements.put(Actor_3016, CiatPackage.eINSTANCE.getActor());

			elements.put(SoftwareAgent_3017, CiatPackage.eINSTANCE.getSoftwareAgent());

			elements.put(Team_3018, CiatPackage.eINSTANCE.getTeam());

			elements.put(Group_3019, CiatPackage.eINSTANCE.getGroup());

			elements.put(Object_3020, CiatPackage.eINSTANCE.getObject());

			elements.put(CollaborativeTask_3021, CiatPackage.eINSTANCE.getCollaborativeTask());

			elements.put(Rol_3022, CiatPackage.eINSTANCE.getRol());

			elements.put(Actor_3023, CiatPackage.eINSTANCE.getActor());

			elements.put(SoftwareAgent_3024, CiatPackage.eINSTANCE.getSoftwareAgent());

			elements.put(Team_3025, CiatPackage.eINSTANCE.getTeam());

			elements.put(Group_3026, CiatPackage.eINSTANCE.getGroup());

			elements.put(Object_3027, CiatPackage.eINSTANCE.getObject());

			elements.put(AbstractTask_3028, CiatPackage.eINSTANCE.getAbstractTask());

			elements.put(IndividualTask_3029, CiatPackage.eINSTANCE.getIndividualTask());

			elements.put(CooperativeTask_3030, CiatPackage.eINSTANCE.getCooperativeTask());

			elements.put(CollaborativeTask_3031, CiatPackage.eINSTANCE.getCollaborativeTask());

			elements.put(AbstractTask_3032, CiatPackage.eINSTANCE.getAbstractTask());

			elements.put(Init_3033, CiatPackage.eINSTANCE.getInit());

			elements.put(End_3034, CiatPackage.eINSTANCE.getEnd());

			elements.put(TemporalCondition_3035, CiatPackage.eINSTANCE.getTemporalCondition());

			elements.put(Notification_3036, CiatPackage.eINSTANCE.getNotification());

			elements.put(Condition_3037, CiatPackage.eINSTANCE.getCondition());

			elements.put(Init_3038, CiatPackage.eINSTANCE.getInit());

			elements.put(End_3039, CiatPackage.eINSTANCE.getEnd());

			elements.put(TemporalCondition_3040, CiatPackage.eINSTANCE.getTemporalCondition());

			elements.put(Notification_3041, CiatPackage.eINSTANCE.getNotification());

			elements.put(Condition_3042, CiatPackage.eINSTANCE.getCondition());

			elements.put(SharedObject_3043, CiatPackage.eINSTANCE.getSharedObject());

			elements.put(ExclusiveEditionArea_3044, CiatPackage.eINSTANCE.getExclusiveEditionArea());

			elements.put(CollaborativeArea_3045, CiatPackage.eINSTANCE.getCollaborativeArea());

			elements.put(IndividualArea_3046, CiatPackage.eINSTANCE.getIndividualArea());

			elements.put(Attribute_3047, CiatPackage.eINSTANCE.getAttribute());

			elements.put(Operation_3048, CiatPackage.eINSTANCE.getOperation());

			elements.put(ExclusiveEdition_3049, CiatPackage.eINSTANCE.getExclusiveEdition());

			elements.put(CollaborativeVisualization_3050, CiatPackage.eINSTANCE.getCollaborativeVisualization());

			elements.put(IndividualVisualization_3051, CiatPackage.eINSTANCE.getIndividualVisualization());

			elements.put(UserTask_3052, CiatPackage.eINSTANCE.getUserTask());

			elements.put(CTTAbstractTask_3053, CiatPackage.eINSTANCE.getCTTAbstractTask());

			elements.put(InteractiveTask_3054, CiatPackage.eINSTANCE.getInteractiveTask());

			elements.put(CTTCollaborativeTask_3055, CiatPackage.eINSTANCE.getCTTCollaborativeTask());

			elements.put(ApplicationTask_3056, CiatPackage.eINSTANCE.getApplicationTask());

			elements.put(Inheritance_4001, CiatPackage.eINSTANCE.getInheritance());

			elements.put(Acting_4002, CiatPackage.eINSTANCE.getActing());

			elements.put(Association_4003, CiatPackage.eINSTANCE.getAssociation());

			elements.put(ShAssociationLink_4004, CiatPackage.eINSTANCE.getShAssociationLink());

			elements.put(ShGeneralizationLink_4005, CiatPackage.eINSTANCE.getShGeneralizationLink());

			elements.put(ShAggregationLink_4006, CiatPackage.eINSTANCE.getShAggregationLink());

			elements.put(Aggregation_4007, CiatPackage.eINSTANCE.getAggregation());

			elements.put(Enabling_4008, CiatPackage.eINSTANCE.getEnabling());

			elements.put(Disabling_4009, CiatPackage.eINSTANCE.getDisabling());

			elements.put(EnablingWithInformationPassing_4010,
					CiatPackage.eINSTANCE.getEnablingWithInformationPassing());

			elements.put(DisablingWithInformationPassing_4011,
					CiatPackage.eINSTANCE.getDisablingWithInformationPassing());

			elements.put(IndependentConcurrency_4012, CiatPackage.eINSTANCE.getIndependentConcurrency());

			elements.put(OrderIndependence_4013, CiatPackage.eINSTANCE.getOrderIndependence());

			elements.put(SuspendResume_4014, CiatPackage.eINSTANCE.getSuspendResume());

			elements.put(ConcurrencyWithInformationPassing_4015,
					CiatPackage.eINSTANCE.getConcurrencyWithInformationPassing());

			elements.put(DeterministicChoice_4016, CiatPackage.eINSTANCE.getDeterministicChoice());

			elements.put(UndeterministicChoice_4017, CiatPackage.eINSTANCE.getUndeterministicChoice());
		}
		return (ENamedElement) elements.get(type);
	}

	/**
	* @generated
	*/
	private static IElementType getElementType(String id) {
		return ElementTypeRegistry.getInstance().getType(id);
	}

	/**
	* @generated
	*/
	public static boolean isKnownElementType(IElementType elementType) {
		if (KNOWN_ELEMENT_TYPES == null) {
			KNOWN_ELEMENT_TYPES = new HashSet<IElementType>();
			KNOWN_ELEMENT_TYPES.add(CIATDiagram_1000);
			KNOWN_ELEMENT_TYPES.add(Sociogram_2001);
			KNOWN_ELEMENT_TYPES.add(ProcessDiagram_2002);
			KNOWN_ELEMENT_TYPES.add(DomainDiagram_2003);
			KNOWN_ELEMENT_TYPES.add(CTTDiagram_2004);
			KNOWN_ELEMENT_TYPES.add(Rol_3001);
			KNOWN_ELEMENT_TYPES.add(Actor_3002);
			KNOWN_ELEMENT_TYPES.add(SoftwareAgent_3003);
			KNOWN_ELEMENT_TYPES.add(Team_3004);
			KNOWN_ELEMENT_TYPES.add(Group_3005);
			KNOWN_ELEMENT_TYPES.add(IndividualTask_3006);
			KNOWN_ELEMENT_TYPES.add(Rol_3007);
			KNOWN_ELEMENT_TYPES.add(Actor_3008);
			KNOWN_ELEMENT_TYPES.add(SoftwareAgent_3009);
			KNOWN_ELEMENT_TYPES.add(Team_3010);
			KNOWN_ELEMENT_TYPES.add(Group_3011);
			KNOWN_ELEMENT_TYPES.add(Tool_3012);
			KNOWN_ELEMENT_TYPES.add(Object_3013);
			KNOWN_ELEMENT_TYPES.add(CooperativeTask_3014);
			KNOWN_ELEMENT_TYPES.add(Rol_3015);
			KNOWN_ELEMENT_TYPES.add(Actor_3016);
			KNOWN_ELEMENT_TYPES.add(SoftwareAgent_3017);
			KNOWN_ELEMENT_TYPES.add(Team_3018);
			KNOWN_ELEMENT_TYPES.add(Group_3019);
			KNOWN_ELEMENT_TYPES.add(Object_3020);
			KNOWN_ELEMENT_TYPES.add(CollaborativeTask_3021);
			KNOWN_ELEMENT_TYPES.add(Rol_3022);
			KNOWN_ELEMENT_TYPES.add(Actor_3023);
			KNOWN_ELEMENT_TYPES.add(SoftwareAgent_3024);
			KNOWN_ELEMENT_TYPES.add(Team_3025);
			KNOWN_ELEMENT_TYPES.add(Group_3026);
			KNOWN_ELEMENT_TYPES.add(Object_3027);
			KNOWN_ELEMENT_TYPES.add(AbstractTask_3028);
			KNOWN_ELEMENT_TYPES.add(IndividualTask_3029);
			KNOWN_ELEMENT_TYPES.add(CooperativeTask_3030);
			KNOWN_ELEMENT_TYPES.add(CollaborativeTask_3031);
			KNOWN_ELEMENT_TYPES.add(AbstractTask_3032);
			KNOWN_ELEMENT_TYPES.add(Init_3033);
			KNOWN_ELEMENT_TYPES.add(End_3034);
			KNOWN_ELEMENT_TYPES.add(TemporalCondition_3035);
			KNOWN_ELEMENT_TYPES.add(Notification_3036);
			KNOWN_ELEMENT_TYPES.add(Condition_3037);
			KNOWN_ELEMENT_TYPES.add(Init_3038);
			KNOWN_ELEMENT_TYPES.add(End_3039);
			KNOWN_ELEMENT_TYPES.add(TemporalCondition_3040);
			KNOWN_ELEMENT_TYPES.add(Notification_3041);
			KNOWN_ELEMENT_TYPES.add(Condition_3042);
			KNOWN_ELEMENT_TYPES.add(SharedObject_3043);
			KNOWN_ELEMENT_TYPES.add(ExclusiveEditionArea_3044);
			KNOWN_ELEMENT_TYPES.add(CollaborativeArea_3045);
			KNOWN_ELEMENT_TYPES.add(IndividualArea_3046);
			KNOWN_ELEMENT_TYPES.add(Attribute_3047);
			KNOWN_ELEMENT_TYPES.add(Operation_3048);
			KNOWN_ELEMENT_TYPES.add(ExclusiveEdition_3049);
			KNOWN_ELEMENT_TYPES.add(CollaborativeVisualization_3050);
			KNOWN_ELEMENT_TYPES.add(IndividualVisualization_3051);
			KNOWN_ELEMENT_TYPES.add(UserTask_3052);
			KNOWN_ELEMENT_TYPES.add(CTTAbstractTask_3053);
			KNOWN_ELEMENT_TYPES.add(InteractiveTask_3054);
			KNOWN_ELEMENT_TYPES.add(CTTCollaborativeTask_3055);
			KNOWN_ELEMENT_TYPES.add(ApplicationTask_3056);
			KNOWN_ELEMENT_TYPES.add(Inheritance_4001);
			KNOWN_ELEMENT_TYPES.add(Acting_4002);
			KNOWN_ELEMENT_TYPES.add(Association_4003);
			KNOWN_ELEMENT_TYPES.add(ShAssociationLink_4004);
			KNOWN_ELEMENT_TYPES.add(ShGeneralizationLink_4005);
			KNOWN_ELEMENT_TYPES.add(ShAggregationLink_4006);
			KNOWN_ELEMENT_TYPES.add(Aggregation_4007);
			KNOWN_ELEMENT_TYPES.add(Enabling_4008);
			KNOWN_ELEMENT_TYPES.add(Disabling_4009);
			KNOWN_ELEMENT_TYPES.add(EnablingWithInformationPassing_4010);
			KNOWN_ELEMENT_TYPES.add(DisablingWithInformationPassing_4011);
			KNOWN_ELEMENT_TYPES.add(IndependentConcurrency_4012);
			KNOWN_ELEMENT_TYPES.add(OrderIndependence_4013);
			KNOWN_ELEMENT_TYPES.add(SuspendResume_4014);
			KNOWN_ELEMENT_TYPES.add(ConcurrencyWithInformationPassing_4015);
			KNOWN_ELEMENT_TYPES.add(DeterministicChoice_4016);
			KNOWN_ELEMENT_TYPES.add(UndeterministicChoice_4017);
		}
		return KNOWN_ELEMENT_TYPES.contains(elementType);
	}

	/**
	* @generated
	*/
	public static IElementType getElementType(int visualID) {
		switch (visualID) {
		case CIATDiagramEditPart.VISUAL_ID:
			return CIATDiagram_1000;
		case SociogramEditPart.VISUAL_ID:
			return Sociogram_2001;
		case ProcessDiagramEditPart.VISUAL_ID:
			return ProcessDiagram_2002;
		case DomainDiagramEditPart.VISUAL_ID:
			return DomainDiagram_2003;
		case CTTDiagramEditPart.VISUAL_ID:
			return CTTDiagram_2004;
		case RolEditPart.VISUAL_ID:
			return Rol_3001;
		case ActorEditPart.VISUAL_ID:
			return Actor_3002;
		case SoftwareAgentEditPart.VISUAL_ID:
			return SoftwareAgent_3003;
		case TeamEditPart.VISUAL_ID:
			return Team_3004;
		case GroupEditPart.VISUAL_ID:
			return Group_3005;
		case IndividualTaskEditPart.VISUAL_ID:
			return IndividualTask_3006;
		case Rol2EditPart.VISUAL_ID:
			return Rol_3007;
		case Actor2EditPart.VISUAL_ID:
			return Actor_3008;
		case SoftwareAgent2EditPart.VISUAL_ID:
			return SoftwareAgent_3009;
		case Team2EditPart.VISUAL_ID:
			return Team_3010;
		case Group2EditPart.VISUAL_ID:
			return Group_3011;
		case ToolEditPart.VISUAL_ID:
			return Tool_3012;
		case ObjectEditPart.VISUAL_ID:
			return Object_3013;
		case CooperativeTaskEditPart.VISUAL_ID:
			return CooperativeTask_3014;
		case Rol3EditPart.VISUAL_ID:
			return Rol_3015;
		case Actor3EditPart.VISUAL_ID:
			return Actor_3016;
		case SoftwareAgent3EditPart.VISUAL_ID:
			return SoftwareAgent_3017;
		case Team3EditPart.VISUAL_ID:
			return Team_3018;
		case Group3EditPart.VISUAL_ID:
			return Group_3019;
		case Object2EditPart.VISUAL_ID:
			return Object_3020;
		case CollaborativeTaskEditPart.VISUAL_ID:
			return CollaborativeTask_3021;
		case Rol4EditPart.VISUAL_ID:
			return Rol_3022;
		case Actor4EditPart.VISUAL_ID:
			return Actor_3023;
		case SoftwareAgent4EditPart.VISUAL_ID:
			return SoftwareAgent_3024;
		case Team4EditPart.VISUAL_ID:
			return Team_3025;
		case Group4EditPart.VISUAL_ID:
			return Group_3026;
		case Object3EditPart.VISUAL_ID:
			return Object_3027;
		case AbstractTaskEditPart.VISUAL_ID:
			return AbstractTask_3028;
		case IndividualTask2EditPart.VISUAL_ID:
			return IndividualTask_3029;
		case CooperativeTask2EditPart.VISUAL_ID:
			return CooperativeTask_3030;
		case CollaborativeTask2EditPart.VISUAL_ID:
			return CollaborativeTask_3031;
		case AbstractTask2EditPart.VISUAL_ID:
			return AbstractTask_3032;
		case InitEditPart.VISUAL_ID:
			return Init_3033;
		case EndEditPart.VISUAL_ID:
			return End_3034;
		case TemporalConditionEditPart.VISUAL_ID:
			return TemporalCondition_3035;
		case NotificationEditPart.VISUAL_ID:
			return Notification_3036;
		case ConditionEditPart.VISUAL_ID:
			return Condition_3037;
		case Init2EditPart.VISUAL_ID:
			return Init_3038;
		case End2EditPart.VISUAL_ID:
			return End_3039;
		case TemporalCondition2EditPart.VISUAL_ID:
			return TemporalCondition_3040;
		case Notification2EditPart.VISUAL_ID:
			return Notification_3041;
		case Condition2EditPart.VISUAL_ID:
			return Condition_3042;
		case SharedObjectEditPart.VISUAL_ID:
			return SharedObject_3043;
		case ExclusiveEditionAreaEditPart.VISUAL_ID:
			return ExclusiveEditionArea_3044;
		case CollaborativeAreaEditPart.VISUAL_ID:
			return CollaborativeArea_3045;
		case IndividualAreaEditPart.VISUAL_ID:
			return IndividualArea_3046;
		case AttributeEditPart.VISUAL_ID:
			return Attribute_3047;
		case OperationEditPart.VISUAL_ID:
			return Operation_3048;
		case ExclusiveEditionEditPart.VISUAL_ID:
			return ExclusiveEdition_3049;
		case CollaborativeVisualizationEditPart.VISUAL_ID:
			return CollaborativeVisualization_3050;
		case IndividualVisualizationEditPart.VISUAL_ID:
			return IndividualVisualization_3051;
		case UserTaskEditPart.VISUAL_ID:
			return UserTask_3052;
		case CTTAbstractTaskEditPart.VISUAL_ID:
			return CTTAbstractTask_3053;
		case InteractiveTaskEditPart.VISUAL_ID:
			return InteractiveTask_3054;
		case CTTCollaborativeTaskEditPart.VISUAL_ID:
			return CTTCollaborativeTask_3055;
		case ApplicationTaskEditPart.VISUAL_ID:
			return ApplicationTask_3056;
		case InheritanceEditPart.VISUAL_ID:
			return Inheritance_4001;
		case ActingEditPart.VISUAL_ID:
			return Acting_4002;
		case AssociationEditPart.VISUAL_ID:
			return Association_4003;
		case ShAssociationLinkEditPart.VISUAL_ID:
			return ShAssociationLink_4004;
		case ShGeneralizationLinkEditPart.VISUAL_ID:
			return ShGeneralizationLink_4005;
		case ShAggregationLinkEditPart.VISUAL_ID:
			return ShAggregationLink_4006;
		case AggregationEditPart.VISUAL_ID:
			return Aggregation_4007;
		case EnablingEditPart.VISUAL_ID:
			return Enabling_4008;
		case DisablingEditPart.VISUAL_ID:
			return Disabling_4009;
		case EnablingWithInformationPassingEditPart.VISUAL_ID:
			return EnablingWithInformationPassing_4010;
		case DisablingWithInformationPassingEditPart.VISUAL_ID:
			return DisablingWithInformationPassing_4011;
		case IndependentConcurrencyEditPart.VISUAL_ID:
			return IndependentConcurrency_4012;
		case OrderIndependenceEditPart.VISUAL_ID:
			return OrderIndependence_4013;
		case SuspendResumeEditPart.VISUAL_ID:
			return SuspendResume_4014;
		case ConcurrencyWithInformationPassingEditPart.VISUAL_ID:
			return ConcurrencyWithInformationPassing_4015;
		case DeterministicChoiceEditPart.VISUAL_ID:
			return DeterministicChoice_4016;
		case UndeterministicChoiceEditPart.VISUAL_ID:
			return UndeterministicChoice_4017;
		}
		return null;
	}

	/**
	* @generated
	*/
	public static final DiagramElementTypes TYPED_INSTANCE = new DiagramElementTypes(elementTypeImages) {

		/**
		* @generated
		*/
		@Override

		public boolean isKnownElementType(IElementType elementType) {
			return ciat.diagram.providers.CiatElementTypes.isKnownElementType(elementType);
		}

		/**
		* @generated
		*/
		@Override

		public IElementType getElementTypeForVisualId(int visualID) {
			return ciat.diagram.providers.CiatElementTypes.getElementType(visualID);
		}

		/**
		* @generated
		*/
		@Override

		public ENamedElement getDefiningNamedElement(IAdaptable elementTypeAdapter) {
			return ciat.diagram.providers.CiatElementTypes.getElement(elementTypeAdapter);
		}
	};

}
