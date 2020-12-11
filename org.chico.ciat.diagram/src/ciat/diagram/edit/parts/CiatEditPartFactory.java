/*
 * 
 */
package ciat.diagram.edit.parts;

import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPartFactory;
import org.eclipse.gef.tools.CellEditorLocator;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ITextAwareEditPart;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.directedit.locator.CellEditorLocatorAccess;

import ciat.diagram.part.CiatVisualIDRegistry;

/**
 * @generated
 */
public class CiatEditPartFactory implements EditPartFactory {

	/**
	* @generated
	*/
	public EditPart createEditPart(EditPart context, Object model) {
		if (model instanceof View) {
			View view = (View) model;
			switch (CiatVisualIDRegistry.getVisualID(view)) {

			case CIATDiagramEditPart.VISUAL_ID:
				return new CIATDiagramEditPart(view);

			case SociogramEditPart.VISUAL_ID:
				return new SociogramEditPart(view);

			case SociogramNameEditPart.VISUAL_ID:
				return new SociogramNameEditPart(view);

			case ProcessDiagramEditPart.VISUAL_ID:
				return new ProcessDiagramEditPart(view);

			case ProcessDiagramNameEditPart.VISUAL_ID:
				return new ProcessDiagramNameEditPart(view);

			case DomainDiagramEditPart.VISUAL_ID:
				return new DomainDiagramEditPart(view);

			case DomainDiagramNameEditPart.VISUAL_ID:
				return new DomainDiagramNameEditPart(view);

			case CTTDiagramEditPart.VISUAL_ID:
				return new CTTDiagramEditPart(view);

			case CTTDiagramNameEditPart.VISUAL_ID:
				return new CTTDiagramNameEditPart(view);

			case RolEditPart.VISUAL_ID:
				return new RolEditPart(view);

			case RolNameEditPart.VISUAL_ID:
				return new RolNameEditPart(view);

			case ActorEditPart.VISUAL_ID:
				return new ActorEditPart(view);

			case ActorNameEditPart.VISUAL_ID:
				return new ActorNameEditPart(view);

			case SoftwareAgentEditPart.VISUAL_ID:
				return new SoftwareAgentEditPart(view);

			case SoftwareAgentNameEditPart.VISUAL_ID:
				return new SoftwareAgentNameEditPart(view);

			case TeamEditPart.VISUAL_ID:
				return new TeamEditPart(view);

			case TeamNameEditPart.VISUAL_ID:
				return new TeamNameEditPart(view);

			case GroupEditPart.VISUAL_ID:
				return new GroupEditPart(view);

			case GroupNameEditPart.VISUAL_ID:
				return new GroupNameEditPart(view);

			case IndividualTaskEditPart.VISUAL_ID:
				return new IndividualTaskEditPart(view);

			case IndividualTaskNameEditPart.VISUAL_ID:
				return new IndividualTaskNameEditPart(view);

			case Rol2EditPart.VISUAL_ID:
				return new Rol2EditPart(view);

			case RolName2EditPart.VISUAL_ID:
				return new RolName2EditPart(view);

			case Actor2EditPart.VISUAL_ID:
				return new Actor2EditPart(view);

			case ActorName2EditPart.VISUAL_ID:
				return new ActorName2EditPart(view);

			case SoftwareAgent2EditPart.VISUAL_ID:
				return new SoftwareAgent2EditPart(view);

			case SoftwareAgentName2EditPart.VISUAL_ID:
				return new SoftwareAgentName2EditPart(view);

			case Team2EditPart.VISUAL_ID:
				return new Team2EditPart(view);

			case TeamName2EditPart.VISUAL_ID:
				return new TeamName2EditPart(view);

			case Group2EditPart.VISUAL_ID:
				return new Group2EditPart(view);

			case GroupName2EditPart.VISUAL_ID:
				return new GroupName2EditPart(view);

			case ToolEditPart.VISUAL_ID:
				return new ToolEditPart(view);

			case ToolNameEditPart.VISUAL_ID:
				return new ToolNameEditPart(view);

			case ObjectEditPart.VISUAL_ID:
				return new ObjectEditPart(view);

			case ObjectNameEditPart.VISUAL_ID:
				return new ObjectNameEditPart(view);

			case CooperativeTaskEditPart.VISUAL_ID:
				return new CooperativeTaskEditPart(view);

			case CooperativeTaskNameEditPart.VISUAL_ID:
				return new CooperativeTaskNameEditPart(view);

			case Rol3EditPart.VISUAL_ID:
				return new Rol3EditPart(view);

			case RolName3EditPart.VISUAL_ID:
				return new RolName3EditPart(view);

			case Actor3EditPart.VISUAL_ID:
				return new Actor3EditPart(view);

			case ActorName3EditPart.VISUAL_ID:
				return new ActorName3EditPart(view);

			case SoftwareAgent3EditPart.VISUAL_ID:
				return new SoftwareAgent3EditPart(view);

			case SoftwareAgentName3EditPart.VISUAL_ID:
				return new SoftwareAgentName3EditPart(view);

			case Team3EditPart.VISUAL_ID:
				return new Team3EditPart(view);

			case TeamName3EditPart.VISUAL_ID:
				return new TeamName3EditPart(view);

			case Group3EditPart.VISUAL_ID:
				return new Group3EditPart(view);

			case GroupName3EditPart.VISUAL_ID:
				return new GroupName3EditPart(view);

			case Object2EditPart.VISUAL_ID:
				return new Object2EditPart(view);

			case ObjectName2EditPart.VISUAL_ID:
				return new ObjectName2EditPart(view);

			case CollaborativeTaskEditPart.VISUAL_ID:
				return new CollaborativeTaskEditPart(view);

			case CollaborativeTaskNameEditPart.VISUAL_ID:
				return new CollaborativeTaskNameEditPart(view);

			case Rol4EditPart.VISUAL_ID:
				return new Rol4EditPart(view);

			case RolName4EditPart.VISUAL_ID:
				return new RolName4EditPart(view);

			case Actor4EditPart.VISUAL_ID:
				return new Actor4EditPart(view);

			case ActorName4EditPart.VISUAL_ID:
				return new ActorName4EditPart(view);

			case SoftwareAgent4EditPart.VISUAL_ID:
				return new SoftwareAgent4EditPart(view);

			case SoftwareAgentName4EditPart.VISUAL_ID:
				return new SoftwareAgentName4EditPart(view);

			case Team4EditPart.VISUAL_ID:
				return new Team4EditPart(view);

			case TeamName4EditPart.VISUAL_ID:
				return new TeamName4EditPart(view);

			case Group4EditPart.VISUAL_ID:
				return new Group4EditPart(view);

			case GroupName4EditPart.VISUAL_ID:
				return new GroupName4EditPart(view);

			case Object3EditPart.VISUAL_ID:
				return new Object3EditPart(view);

			case ObjectName3EditPart.VISUAL_ID:
				return new ObjectName3EditPart(view);

			case AbstractTaskEditPart.VISUAL_ID:
				return new AbstractTaskEditPart(view);

			case AbstractTaskNameEditPart.VISUAL_ID:
				return new AbstractTaskNameEditPart(view);

			case IndividualTask2EditPart.VISUAL_ID:
				return new IndividualTask2EditPart(view);

			case IndividualTaskName2EditPart.VISUAL_ID:
				return new IndividualTaskName2EditPart(view);

			case CooperativeTask2EditPart.VISUAL_ID:
				return new CooperativeTask2EditPart(view);

			case CooperativeTaskName2EditPart.VISUAL_ID:
				return new CooperativeTaskName2EditPart(view);

			case CollaborativeTask2EditPart.VISUAL_ID:
				return new CollaborativeTask2EditPart(view);

			case CollaborativeTaskName2EditPart.VISUAL_ID:
				return new CollaborativeTaskName2EditPart(view);

			case AbstractTask2EditPart.VISUAL_ID:
				return new AbstractTask2EditPart(view);

			case AbstractTaskName2EditPart.VISUAL_ID:
				return new AbstractTaskName2EditPart(view);

			case InitEditPart.VISUAL_ID:
				return new InitEditPart(view);

			case InitNameEditPart.VISUAL_ID:
				return new InitNameEditPart(view);

			case EndEditPart.VISUAL_ID:
				return new EndEditPart(view);

			case EndNameEditPart.VISUAL_ID:
				return new EndNameEditPart(view);

			case TemporalConditionEditPart.VISUAL_ID:
				return new TemporalConditionEditPart(view);

			case TemporalConditionNameEditPart.VISUAL_ID:
				return new TemporalConditionNameEditPart(view);

			case NotificationEditPart.VISUAL_ID:
				return new NotificationEditPart(view);

			case NotificationNameEditPart.VISUAL_ID:
				return new NotificationNameEditPart(view);

			case ConditionEditPart.VISUAL_ID:
				return new ConditionEditPart(view);

			case ConditionNameEditPart.VISUAL_ID:
				return new ConditionNameEditPart(view);

			case Init2EditPart.VISUAL_ID:
				return new Init2EditPart(view);

			case InitName2EditPart.VISUAL_ID:
				return new InitName2EditPart(view);

			case End2EditPart.VISUAL_ID:
				return new End2EditPart(view);

			case EndName2EditPart.VISUAL_ID:
				return new EndName2EditPart(view);

			case TemporalCondition2EditPart.VISUAL_ID:
				return new TemporalCondition2EditPart(view);

			case TemporalConditionName2EditPart.VISUAL_ID:
				return new TemporalConditionName2EditPart(view);

			case Notification2EditPart.VISUAL_ID:
				return new Notification2EditPart(view);

			case NotificationName2EditPart.VISUAL_ID:
				return new NotificationName2EditPart(view);

			case Condition2EditPart.VISUAL_ID:
				return new Condition2EditPart(view);

			case ConditionName2EditPart.VISUAL_ID:
				return new ConditionName2EditPart(view);

			case SharedObjectEditPart.VISUAL_ID:
				return new SharedObjectEditPart(view);

			case SharedObjectNameEditPart.VISUAL_ID:
				return new SharedObjectNameEditPart(view);

			case ExclusiveEditionAreaEditPart.VISUAL_ID:
				return new ExclusiveEditionAreaEditPart(view);

			case ExclusiveEditionAreaNameEditPart.VISUAL_ID:
				return new ExclusiveEditionAreaNameEditPart(view);

			case CollaborativeAreaEditPart.VISUAL_ID:
				return new CollaborativeAreaEditPart(view);

			case CollaborativeAreaNameEditPart.VISUAL_ID:
				return new CollaborativeAreaNameEditPart(view);

			case IndividualAreaEditPart.VISUAL_ID:
				return new IndividualAreaEditPart(view);

			case IndividualAreaNameEditPart.VISUAL_ID:
				return new IndividualAreaNameEditPart(view);

			case AttributeEditPart.VISUAL_ID:
				return new AttributeEditPart(view);

			case AttributeNameEditPart.VISUAL_ID:
				return new AttributeNameEditPart(view);

			case OperationEditPart.VISUAL_ID:
				return new OperationEditPart(view);

			case OperationNameEditPart.VISUAL_ID:
				return new OperationNameEditPart(view);

			case ExclusiveEditionEditPart.VISUAL_ID:
				return new ExclusiveEditionEditPart(view);

			case ExclusiveEditionNameEditPart.VISUAL_ID:
				return new ExclusiveEditionNameEditPart(view);

			case CollaborativeVisualizationEditPart.VISUAL_ID:
				return new CollaborativeVisualizationEditPart(view);

			case CollaborativeVisualizationNameEditPart.VISUAL_ID:
				return new CollaborativeVisualizationNameEditPart(view);

			case IndividualVisualizationEditPart.VISUAL_ID:
				return new IndividualVisualizationEditPart(view);

			case IndividualVisualizationNameEditPart.VISUAL_ID:
				return new IndividualVisualizationNameEditPart(view);

			case UserTaskEditPart.VISUAL_ID:
				return new UserTaskEditPart(view);

			case UserTaskNameEditPart.VISUAL_ID:
				return new UserTaskNameEditPart(view);

			case CTTAbstractTaskEditPart.VISUAL_ID:
				return new CTTAbstractTaskEditPart(view);

			case CTTAbstractTaskNameEditPart.VISUAL_ID:
				return new CTTAbstractTaskNameEditPart(view);

			case InteractiveTaskEditPart.VISUAL_ID:
				return new InteractiveTaskEditPart(view);

			case InteractiveTaskNameEditPart.VISUAL_ID:
				return new InteractiveTaskNameEditPart(view);

			case CTTCollaborativeTaskEditPart.VISUAL_ID:
				return new CTTCollaborativeTaskEditPart(view);

			case CTTCollaborativeTaskNameEditPart.VISUAL_ID:
				return new CTTCollaborativeTaskNameEditPart(view);

			case ApplicationTaskEditPart.VISUAL_ID:
				return new ApplicationTaskEditPart(view);

			case ApplicationTaskNameEditPart.VISUAL_ID:
				return new ApplicationTaskNameEditPart(view);

			case SociogramSociogramItsSociogramNodesCompartmentEditPart.VISUAL_ID:
				return new SociogramSociogramItsSociogramNodesCompartmentEditPart(view);

			case ProcessDiagramProcessDiagramProcessNodesCompartmentEditPart.VISUAL_ID:
				return new ProcessDiagramProcessDiagramProcessNodesCompartmentEditPart(view);

			case IndividualTaskIndividualTaskTaskRolesCompartmentEditPart.VISUAL_ID:
				return new IndividualTaskIndividualTaskTaskRolesCompartmentEditPart(view);

			case IndividualTaskIndividualTaskTaskObjectsCompartmentEditPart.VISUAL_ID:
				return new IndividualTaskIndividualTaskTaskObjectsCompartmentEditPart(view);

			case CooperativeTaskCooperativeTaskTaskRolesCompartmentEditPart.VISUAL_ID:
				return new CooperativeTaskCooperativeTaskTaskRolesCompartmentEditPart(view);

			case CooperativeTaskCooperativeTaskTaskObjectsCompartmentEditPart.VISUAL_ID:
				return new CooperativeTaskCooperativeTaskTaskObjectsCompartmentEditPart(view);

			case CollaborativeTaskCollaborativeTaskTaskRolesCompartmentEditPart.VISUAL_ID:
				return new CollaborativeTaskCollaborativeTaskTaskRolesCompartmentEditPart(view);

			case CollaborativeTaskCollaborativeTaskTaskObjectsCompartmentEditPart.VISUAL_ID:
				return new CollaborativeTaskCollaborativeTaskTaskObjectsCompartmentEditPart(view);

			case AbstractTaskAbstractTaskProcessNodesCompartmentEditPart.VISUAL_ID:
				return new AbstractTaskAbstractTaskProcessNodesCompartmentEditPart(view);

			case IndividualTaskIndividualTaskTaskRolesCompartment2EditPart.VISUAL_ID:
				return new IndividualTaskIndividualTaskTaskRolesCompartment2EditPart(view);

			case IndividualTaskIndividualTaskTaskObjectsCompartment2EditPart.VISUAL_ID:
				return new IndividualTaskIndividualTaskTaskObjectsCompartment2EditPart(view);

			case CooperativeTaskCooperativeTaskTaskRolesCompartment2EditPart.VISUAL_ID:
				return new CooperativeTaskCooperativeTaskTaskRolesCompartment2EditPart(view);

			case CooperativeTaskCooperativeTaskTaskObjectsCompartment2EditPart.VISUAL_ID:
				return new CooperativeTaskCooperativeTaskTaskObjectsCompartment2EditPart(view);

			case CollaborativeTaskCollaborativeTaskTaskRolesCompartment2EditPart.VISUAL_ID:
				return new CollaborativeTaskCollaborativeTaskTaskRolesCompartment2EditPart(view);

			case CollaborativeTaskCollaborativeTaskTaskObjectsCompartment2EditPart.VISUAL_ID:
				return new CollaborativeTaskCollaborativeTaskTaskObjectsCompartment2EditPart(view);

			case AbstractTaskAbstractTaskProcessNodesCompartment2EditPart.VISUAL_ID:
				return new AbstractTaskAbstractTaskProcessNodesCompartment2EditPart(view);

			case DomainDiagramDomainDiagramSharedContextCompartmentEditPart.VISUAL_ID:
				return new DomainDiagramDomainDiagramSharedContextCompartmentEditPart(view);

			case SharedObjectSharedObjectAttributesCompartmentEditPart.VISUAL_ID:
				return new SharedObjectSharedObjectAttributesCompartmentEditPart(view);

			case SharedObjectSharedObjectOperationsCompartmentEditPart.VISUAL_ID:
				return new SharedObjectSharedObjectOperationsCompartmentEditPart(view);

			case CTTDiagramCTTDiagramCttTasksCompartmentEditPart.VISUAL_ID:
				return new CTTDiagramCTTDiagramCttTasksCompartmentEditPart(view);

			case InheritanceEditPart.VISUAL_ID:
				return new InheritanceEditPart(view);

			case InheritanceConditionEditPart.VISUAL_ID:
				return new InheritanceConditionEditPart(view);

			case ActingEditPart.VISUAL_ID:
				return new ActingEditPart(view);

			case ActingNameEditPart.VISUAL_ID:
				return new ActingNameEditPart(view);

			case AssociationEditPart.VISUAL_ID:
				return new AssociationEditPart(view);

			case AssociationNameEditPart.VISUAL_ID:
				return new AssociationNameEditPart(view);

			case ShAssociationLinkEditPart.VISUAL_ID:
				return new ShAssociationLinkEditPart(view);

			case ShGeneralizationLinkEditPart.VISUAL_ID:
				return new ShGeneralizationLinkEditPart(view);

			case ShAggregationLinkEditPart.VISUAL_ID:
				return new ShAggregationLinkEditPart(view);

			case AggregationEditPart.VISUAL_ID:
				return new AggregationEditPart(view);

			case EnablingEditPart.VISUAL_ID:
				return new EnablingEditPart(view);

			case EnablingELabelEditPart.VISUAL_ID:
				return new EnablingELabelEditPart(view);

			case DisablingEditPart.VISUAL_ID:
				return new DisablingEditPart(view);

			case DisablingDLabelEditPart.VISUAL_ID:
				return new DisablingDLabelEditPart(view);

			case EnablingWithInformationPassingEditPart.VISUAL_ID:
				return new EnablingWithInformationPassingEditPart(view);

			case EnablingWithInformationPassingEwLabelEditPart.VISUAL_ID:
				return new EnablingWithInformationPassingEwLabelEditPart(view);

			case DisablingWithInformationPassingEditPart.VISUAL_ID:
				return new DisablingWithInformationPassingEditPart(view);

			case DisablingWithInformationPassingDwLabelEditPart.VISUAL_ID:
				return new DisablingWithInformationPassingDwLabelEditPart(view);

			case IndependentConcurrencyEditPart.VISUAL_ID:
				return new IndependentConcurrencyEditPart(view);

			case IndependentConcurrencyIcLabelEditPart.VISUAL_ID:
				return new IndependentConcurrencyIcLabelEditPart(view);

			case OrderIndependenceEditPart.VISUAL_ID:
				return new OrderIndependenceEditPart(view);

			case OrderIndependenceOiLabelEditPart.VISUAL_ID:
				return new OrderIndependenceOiLabelEditPart(view);

			case SuspendResumeEditPart.VISUAL_ID:
				return new SuspendResumeEditPart(view);

			case SuspendResumeSrLabelEditPart.VISUAL_ID:
				return new SuspendResumeSrLabelEditPart(view);

			case ConcurrencyWithInformationPassingEditPart.VISUAL_ID:
				return new ConcurrencyWithInformationPassingEditPart(view);

			case ConcurrencyWithInformationPassingCLabelEditPart.VISUAL_ID:
				return new ConcurrencyWithInformationPassingCLabelEditPart(view);

			case DeterministicChoiceEditPart.VISUAL_ID:
				return new DeterministicChoiceEditPart(view);

			case DeterministicChoiceDtLabelEditPart.VISUAL_ID:
				return new DeterministicChoiceDtLabelEditPart(view);

			case UndeterministicChoiceEditPart.VISUAL_ID:
				return new UndeterministicChoiceEditPart(view);

			case UndeterministicChoiceUcLabelEditPart.VISUAL_ID:
				return new UndeterministicChoiceUcLabelEditPart(view);

			}
		}
		return createUnrecognizedEditPart(context, model);
	}

	/**
	* @generated
	*/
	private EditPart createUnrecognizedEditPart(EditPart context, Object model) {
		// Handle creation of unrecognized child node EditParts here
		return null;
	}

	/**
	* @generated
	*/
	public static CellEditorLocator getTextCellEditorLocator(ITextAwareEditPart source) {
		return CellEditorLocatorAccess.INSTANCE.getTextCellEditorLocator(source);
	}

}
