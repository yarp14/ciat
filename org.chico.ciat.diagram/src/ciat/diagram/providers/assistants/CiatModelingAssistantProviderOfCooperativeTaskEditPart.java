/*
 * 
 */
package ciat.diagram.providers.assistants;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;

import ciat.diagram.edit.parts.AbstractTask2EditPart;
import ciat.diagram.edit.parts.AbstractTaskEditPart;
import ciat.diagram.edit.parts.ApplicationTaskEditPart;
import ciat.diagram.edit.parts.CTTAbstractTaskEditPart;
import ciat.diagram.edit.parts.CTTCollaborativeTaskEditPart;
import ciat.diagram.edit.parts.CollaborativeTask2EditPart;
import ciat.diagram.edit.parts.CollaborativeTaskEditPart;
import ciat.diagram.edit.parts.CollaborativeVisualizationEditPart;
import ciat.diagram.edit.parts.Condition2EditPart;
import ciat.diagram.edit.parts.ConditionEditPart;
import ciat.diagram.edit.parts.CooperativeTask2EditPart;
import ciat.diagram.edit.parts.CooperativeTaskEditPart;
import ciat.diagram.edit.parts.End2EditPart;
import ciat.diagram.edit.parts.EndEditPart;
import ciat.diagram.edit.parts.ExclusiveEditionEditPart;
import ciat.diagram.edit.parts.IndividualTask2EditPart;
import ciat.diagram.edit.parts.IndividualTaskEditPart;
import ciat.diagram.edit.parts.IndividualVisualizationEditPart;
import ciat.diagram.edit.parts.Init2EditPart;
import ciat.diagram.edit.parts.InitEditPart;
import ciat.diagram.edit.parts.InteractiveTaskEditPart;
import ciat.diagram.edit.parts.Notification2EditPart;
import ciat.diagram.edit.parts.NotificationEditPart;
import ciat.diagram.edit.parts.TemporalCondition2EditPart;
import ciat.diagram.edit.parts.TemporalConditionEditPart;
import ciat.diagram.edit.parts.UserTaskEditPart;
import ciat.diagram.providers.CiatElementTypes;
import ciat.diagram.providers.CiatModelingAssistantProvider;

/**
 * @generated
 */
public class CiatModelingAssistantProviderOfCooperativeTaskEditPart extends CiatModelingAssistantProvider {

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getTypesForPopupBar(IAdaptable host) {
		List<IElementType> types = new ArrayList<IElementType>(7);
		types.add(CiatElementTypes.Tool_3012);
		types.add(CiatElementTypes.Rol_3015);
		types.add(CiatElementTypes.Actor_3016);
		types.add(CiatElementTypes.SoftwareAgent_3017);
		types.add(CiatElementTypes.Team_3018);
		types.add(CiatElementTypes.Group_3019);
		types.add(CiatElementTypes.Object_3020);
		return types;
	}

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getRelTypesOnSource(IAdaptable source) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnSource((CooperativeTaskEditPart) sourceEditPart);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetRelTypesOnSource(CooperativeTaskEditPart source) {
		List<IElementType> types = new ArrayList<IElementType>(11);
		types.add(CiatElementTypes.Aggregation_4007);
		types.add(CiatElementTypes.Enabling_4008);
		types.add(CiatElementTypes.Disabling_4009);
		types.add(CiatElementTypes.EnablingWithInformationPassing_4010);
		types.add(CiatElementTypes.DisablingWithInformationPassing_4011);
		types.add(CiatElementTypes.IndependentConcurrency_4012);
		types.add(CiatElementTypes.OrderIndependence_4013);
		types.add(CiatElementTypes.SuspendResume_4014);
		types.add(CiatElementTypes.ConcurrencyWithInformationPassing_4015);
		types.add(CiatElementTypes.DeterministicChoice_4016);
		types.add(CiatElementTypes.UndeterministicChoice_4017);
		return types;
	}

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getRelTypesOnSourceAndTarget(IAdaptable source, IAdaptable target) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source.getAdapter(IGraphicalEditPart.class);
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnSourceAndTarget((CooperativeTaskEditPart) sourceEditPart, targetEditPart);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetRelTypesOnSourceAndTarget(CooperativeTaskEditPart source,
			IGraphicalEditPart targetEditPart) {
		List<IElementType> types = new LinkedList<IElementType>();
		if (targetEditPart instanceof IndividualTaskEditPart) {
			types.add(CiatElementTypes.Aggregation_4007);
		}
		if (targetEditPart instanceof CooperativeTaskEditPart) {
			types.add(CiatElementTypes.Aggregation_4007);
		}
		if (targetEditPart instanceof CollaborativeTaskEditPart) {
			types.add(CiatElementTypes.Aggregation_4007);
		}
		if (targetEditPart instanceof AbstractTaskEditPart) {
			types.add(CiatElementTypes.Aggregation_4007);
		}
		if (targetEditPart instanceof IndividualTask2EditPart) {
			types.add(CiatElementTypes.Aggregation_4007);
		}
		if (targetEditPart instanceof CooperativeTask2EditPart) {
			types.add(CiatElementTypes.Aggregation_4007);
		}
		if (targetEditPart instanceof CollaborativeTask2EditPart) {
			types.add(CiatElementTypes.Aggregation_4007);
		}
		if (targetEditPart instanceof AbstractTask2EditPart) {
			types.add(CiatElementTypes.Aggregation_4007);
		}
		if (targetEditPart instanceof InitEditPart) {
			types.add(CiatElementTypes.Aggregation_4007);
		}
		if (targetEditPart instanceof EndEditPart) {
			types.add(CiatElementTypes.Aggregation_4007);
		}
		if (targetEditPart instanceof TemporalConditionEditPart) {
			types.add(CiatElementTypes.Aggregation_4007);
		}
		if (targetEditPart instanceof NotificationEditPart) {
			types.add(CiatElementTypes.Aggregation_4007);
		}
		if (targetEditPart instanceof ConditionEditPart) {
			types.add(CiatElementTypes.Aggregation_4007);
		}
		if (targetEditPart instanceof Init2EditPart) {
			types.add(CiatElementTypes.Aggregation_4007);
		}
		if (targetEditPart instanceof End2EditPart) {
			types.add(CiatElementTypes.Aggregation_4007);
		}
		if (targetEditPart instanceof TemporalCondition2EditPart) {
			types.add(CiatElementTypes.Aggregation_4007);
		}
		if (targetEditPart instanceof Notification2EditPart) {
			types.add(CiatElementTypes.Aggregation_4007);
		}
		if (targetEditPart instanceof Condition2EditPart) {
			types.add(CiatElementTypes.Aggregation_4007);
		}
		if (targetEditPart instanceof ExclusiveEditionEditPart) {
			types.add(CiatElementTypes.Aggregation_4007);
		}
		if (targetEditPart instanceof CollaborativeVisualizationEditPart) {
			types.add(CiatElementTypes.Aggregation_4007);
		}
		if (targetEditPart instanceof IndividualVisualizationEditPart) {
			types.add(CiatElementTypes.Aggregation_4007);
		}
		if (targetEditPart instanceof UserTaskEditPart) {
			types.add(CiatElementTypes.Aggregation_4007);
		}
		if (targetEditPart instanceof CTTAbstractTaskEditPart) {
			types.add(CiatElementTypes.Aggregation_4007);
		}
		if (targetEditPart instanceof InteractiveTaskEditPart) {
			types.add(CiatElementTypes.Aggregation_4007);
		}
		if (targetEditPart instanceof CTTCollaborativeTaskEditPart) {
			types.add(CiatElementTypes.Aggregation_4007);
		}
		if (targetEditPart instanceof ApplicationTaskEditPart) {
			types.add(CiatElementTypes.Aggregation_4007);
		}
		if (targetEditPart instanceof IndividualTaskEditPart) {
			types.add(CiatElementTypes.Enabling_4008);
		}
		if (targetEditPart instanceof CooperativeTaskEditPart) {
			types.add(CiatElementTypes.Enabling_4008);
		}
		if (targetEditPart instanceof CollaborativeTaskEditPart) {
			types.add(CiatElementTypes.Enabling_4008);
		}
		if (targetEditPart instanceof AbstractTaskEditPart) {
			types.add(CiatElementTypes.Enabling_4008);
		}
		if (targetEditPart instanceof IndividualTask2EditPart) {
			types.add(CiatElementTypes.Enabling_4008);
		}
		if (targetEditPart instanceof CooperativeTask2EditPart) {
			types.add(CiatElementTypes.Enabling_4008);
		}
		if (targetEditPart instanceof CollaborativeTask2EditPart) {
			types.add(CiatElementTypes.Enabling_4008);
		}
		if (targetEditPart instanceof AbstractTask2EditPart) {
			types.add(CiatElementTypes.Enabling_4008);
		}
		if (targetEditPart instanceof InitEditPart) {
			types.add(CiatElementTypes.Enabling_4008);
		}
		if (targetEditPart instanceof EndEditPart) {
			types.add(CiatElementTypes.Enabling_4008);
		}
		if (targetEditPart instanceof TemporalConditionEditPart) {
			types.add(CiatElementTypes.Enabling_4008);
		}
		if (targetEditPart instanceof NotificationEditPart) {
			types.add(CiatElementTypes.Enabling_4008);
		}
		if (targetEditPart instanceof ConditionEditPart) {
			types.add(CiatElementTypes.Enabling_4008);
		}
		if (targetEditPart instanceof Init2EditPart) {
			types.add(CiatElementTypes.Enabling_4008);
		}
		if (targetEditPart instanceof End2EditPart) {
			types.add(CiatElementTypes.Enabling_4008);
		}
		if (targetEditPart instanceof TemporalCondition2EditPart) {
			types.add(CiatElementTypes.Enabling_4008);
		}
		if (targetEditPart instanceof Notification2EditPart) {
			types.add(CiatElementTypes.Enabling_4008);
		}
		if (targetEditPart instanceof Condition2EditPart) {
			types.add(CiatElementTypes.Enabling_4008);
		}
		if (targetEditPart instanceof ExclusiveEditionEditPart) {
			types.add(CiatElementTypes.Enabling_4008);
		}
		if (targetEditPart instanceof CollaborativeVisualizationEditPart) {
			types.add(CiatElementTypes.Enabling_4008);
		}
		if (targetEditPart instanceof IndividualVisualizationEditPart) {
			types.add(CiatElementTypes.Enabling_4008);
		}
		if (targetEditPart instanceof UserTaskEditPart) {
			types.add(CiatElementTypes.Enabling_4008);
		}
		if (targetEditPart instanceof CTTAbstractTaskEditPart) {
			types.add(CiatElementTypes.Enabling_4008);
		}
		if (targetEditPart instanceof InteractiveTaskEditPart) {
			types.add(CiatElementTypes.Enabling_4008);
		}
		if (targetEditPart instanceof CTTCollaborativeTaskEditPart) {
			types.add(CiatElementTypes.Enabling_4008);
		}
		if (targetEditPart instanceof ApplicationTaskEditPart) {
			types.add(CiatElementTypes.Enabling_4008);
		}
		if (targetEditPart instanceof IndividualTaskEditPart) {
			types.add(CiatElementTypes.Disabling_4009);
		}
		if (targetEditPart instanceof CooperativeTaskEditPart) {
			types.add(CiatElementTypes.Disabling_4009);
		}
		if (targetEditPart instanceof CollaborativeTaskEditPart) {
			types.add(CiatElementTypes.Disabling_4009);
		}
		if (targetEditPart instanceof AbstractTaskEditPart) {
			types.add(CiatElementTypes.Disabling_4009);
		}
		if (targetEditPart instanceof IndividualTask2EditPart) {
			types.add(CiatElementTypes.Disabling_4009);
		}
		if (targetEditPart instanceof CooperativeTask2EditPart) {
			types.add(CiatElementTypes.Disabling_4009);
		}
		if (targetEditPart instanceof CollaborativeTask2EditPart) {
			types.add(CiatElementTypes.Disabling_4009);
		}
		if (targetEditPart instanceof AbstractTask2EditPart) {
			types.add(CiatElementTypes.Disabling_4009);
		}
		if (targetEditPart instanceof InitEditPart) {
			types.add(CiatElementTypes.Disabling_4009);
		}
		if (targetEditPart instanceof EndEditPart) {
			types.add(CiatElementTypes.Disabling_4009);
		}
		if (targetEditPart instanceof TemporalConditionEditPart) {
			types.add(CiatElementTypes.Disabling_4009);
		}
		if (targetEditPart instanceof NotificationEditPart) {
			types.add(CiatElementTypes.Disabling_4009);
		}
		if (targetEditPart instanceof ConditionEditPart) {
			types.add(CiatElementTypes.Disabling_4009);
		}
		if (targetEditPart instanceof Init2EditPart) {
			types.add(CiatElementTypes.Disabling_4009);
		}
		if (targetEditPart instanceof End2EditPart) {
			types.add(CiatElementTypes.Disabling_4009);
		}
		if (targetEditPart instanceof TemporalCondition2EditPart) {
			types.add(CiatElementTypes.Disabling_4009);
		}
		if (targetEditPart instanceof Notification2EditPart) {
			types.add(CiatElementTypes.Disabling_4009);
		}
		if (targetEditPart instanceof Condition2EditPart) {
			types.add(CiatElementTypes.Disabling_4009);
		}
		if (targetEditPart instanceof ExclusiveEditionEditPart) {
			types.add(CiatElementTypes.Disabling_4009);
		}
		if (targetEditPart instanceof CollaborativeVisualizationEditPart) {
			types.add(CiatElementTypes.Disabling_4009);
		}
		if (targetEditPart instanceof IndividualVisualizationEditPart) {
			types.add(CiatElementTypes.Disabling_4009);
		}
		if (targetEditPart instanceof UserTaskEditPart) {
			types.add(CiatElementTypes.Disabling_4009);
		}
		if (targetEditPart instanceof CTTAbstractTaskEditPart) {
			types.add(CiatElementTypes.Disabling_4009);
		}
		if (targetEditPart instanceof InteractiveTaskEditPart) {
			types.add(CiatElementTypes.Disabling_4009);
		}
		if (targetEditPart instanceof CTTCollaborativeTaskEditPart) {
			types.add(CiatElementTypes.Disabling_4009);
		}
		if (targetEditPart instanceof ApplicationTaskEditPart) {
			types.add(CiatElementTypes.Disabling_4009);
		}
		if (targetEditPart instanceof IndividualTaskEditPart) {
			types.add(CiatElementTypes.EnablingWithInformationPassing_4010);
		}
		if (targetEditPart instanceof CooperativeTaskEditPart) {
			types.add(CiatElementTypes.EnablingWithInformationPassing_4010);
		}
		if (targetEditPart instanceof CollaborativeTaskEditPart) {
			types.add(CiatElementTypes.EnablingWithInformationPassing_4010);
		}
		if (targetEditPart instanceof AbstractTaskEditPart) {
			types.add(CiatElementTypes.EnablingWithInformationPassing_4010);
		}
		if (targetEditPart instanceof IndividualTask2EditPart) {
			types.add(CiatElementTypes.EnablingWithInformationPassing_4010);
		}
		if (targetEditPart instanceof CooperativeTask2EditPart) {
			types.add(CiatElementTypes.EnablingWithInformationPassing_4010);
		}
		if (targetEditPart instanceof CollaborativeTask2EditPart) {
			types.add(CiatElementTypes.EnablingWithInformationPassing_4010);
		}
		if (targetEditPart instanceof AbstractTask2EditPart) {
			types.add(CiatElementTypes.EnablingWithInformationPassing_4010);
		}
		if (targetEditPart instanceof InitEditPart) {
			types.add(CiatElementTypes.EnablingWithInformationPassing_4010);
		}
		if (targetEditPart instanceof EndEditPart) {
			types.add(CiatElementTypes.EnablingWithInformationPassing_4010);
		}
		if (targetEditPart instanceof TemporalConditionEditPart) {
			types.add(CiatElementTypes.EnablingWithInformationPassing_4010);
		}
		if (targetEditPart instanceof NotificationEditPart) {
			types.add(CiatElementTypes.EnablingWithInformationPassing_4010);
		}
		if (targetEditPart instanceof ConditionEditPart) {
			types.add(CiatElementTypes.EnablingWithInformationPassing_4010);
		}
		if (targetEditPart instanceof Init2EditPart) {
			types.add(CiatElementTypes.EnablingWithInformationPassing_4010);
		}
		if (targetEditPart instanceof End2EditPart) {
			types.add(CiatElementTypes.EnablingWithInformationPassing_4010);
		}
		if (targetEditPart instanceof TemporalCondition2EditPart) {
			types.add(CiatElementTypes.EnablingWithInformationPassing_4010);
		}
		if (targetEditPart instanceof Notification2EditPart) {
			types.add(CiatElementTypes.EnablingWithInformationPassing_4010);
		}
		if (targetEditPart instanceof Condition2EditPart) {
			types.add(CiatElementTypes.EnablingWithInformationPassing_4010);
		}
		if (targetEditPart instanceof ExclusiveEditionEditPart) {
			types.add(CiatElementTypes.EnablingWithInformationPassing_4010);
		}
		if (targetEditPart instanceof CollaborativeVisualizationEditPart) {
			types.add(CiatElementTypes.EnablingWithInformationPassing_4010);
		}
		if (targetEditPart instanceof IndividualVisualizationEditPart) {
			types.add(CiatElementTypes.EnablingWithInformationPassing_4010);
		}
		if (targetEditPart instanceof UserTaskEditPart) {
			types.add(CiatElementTypes.EnablingWithInformationPassing_4010);
		}
		if (targetEditPart instanceof CTTAbstractTaskEditPart) {
			types.add(CiatElementTypes.EnablingWithInformationPassing_4010);
		}
		if (targetEditPart instanceof InteractiveTaskEditPart) {
			types.add(CiatElementTypes.EnablingWithInformationPassing_4010);
		}
		if (targetEditPart instanceof CTTCollaborativeTaskEditPart) {
			types.add(CiatElementTypes.EnablingWithInformationPassing_4010);
		}
		if (targetEditPart instanceof ApplicationTaskEditPart) {
			types.add(CiatElementTypes.EnablingWithInformationPassing_4010);
		}
		if (targetEditPart instanceof IndividualTaskEditPart) {
			types.add(CiatElementTypes.DisablingWithInformationPassing_4011);
		}
		if (targetEditPart instanceof CooperativeTaskEditPart) {
			types.add(CiatElementTypes.DisablingWithInformationPassing_4011);
		}
		if (targetEditPart instanceof CollaborativeTaskEditPart) {
			types.add(CiatElementTypes.DisablingWithInformationPassing_4011);
		}
		if (targetEditPart instanceof AbstractTaskEditPart) {
			types.add(CiatElementTypes.DisablingWithInformationPassing_4011);
		}
		if (targetEditPart instanceof IndividualTask2EditPart) {
			types.add(CiatElementTypes.DisablingWithInformationPassing_4011);
		}
		if (targetEditPart instanceof CooperativeTask2EditPart) {
			types.add(CiatElementTypes.DisablingWithInformationPassing_4011);
		}
		if (targetEditPart instanceof CollaborativeTask2EditPart) {
			types.add(CiatElementTypes.DisablingWithInformationPassing_4011);
		}
		if (targetEditPart instanceof AbstractTask2EditPart) {
			types.add(CiatElementTypes.DisablingWithInformationPassing_4011);
		}
		if (targetEditPart instanceof InitEditPart) {
			types.add(CiatElementTypes.DisablingWithInformationPassing_4011);
		}
		if (targetEditPart instanceof EndEditPart) {
			types.add(CiatElementTypes.DisablingWithInformationPassing_4011);
		}
		if (targetEditPart instanceof TemporalConditionEditPart) {
			types.add(CiatElementTypes.DisablingWithInformationPassing_4011);
		}
		if (targetEditPart instanceof NotificationEditPart) {
			types.add(CiatElementTypes.DisablingWithInformationPassing_4011);
		}
		if (targetEditPart instanceof ConditionEditPart) {
			types.add(CiatElementTypes.DisablingWithInformationPassing_4011);
		}
		if (targetEditPart instanceof Init2EditPart) {
			types.add(CiatElementTypes.DisablingWithInformationPassing_4011);
		}
		if (targetEditPart instanceof End2EditPart) {
			types.add(CiatElementTypes.DisablingWithInformationPassing_4011);
		}
		if (targetEditPart instanceof TemporalCondition2EditPart) {
			types.add(CiatElementTypes.DisablingWithInformationPassing_4011);
		}
		if (targetEditPart instanceof Notification2EditPart) {
			types.add(CiatElementTypes.DisablingWithInformationPassing_4011);
		}
		if (targetEditPart instanceof Condition2EditPart) {
			types.add(CiatElementTypes.DisablingWithInformationPassing_4011);
		}
		if (targetEditPart instanceof ExclusiveEditionEditPart) {
			types.add(CiatElementTypes.DisablingWithInformationPassing_4011);
		}
		if (targetEditPart instanceof CollaborativeVisualizationEditPart) {
			types.add(CiatElementTypes.DisablingWithInformationPassing_4011);
		}
		if (targetEditPart instanceof IndividualVisualizationEditPart) {
			types.add(CiatElementTypes.DisablingWithInformationPassing_4011);
		}
		if (targetEditPart instanceof UserTaskEditPart) {
			types.add(CiatElementTypes.DisablingWithInformationPassing_4011);
		}
		if (targetEditPart instanceof CTTAbstractTaskEditPart) {
			types.add(CiatElementTypes.DisablingWithInformationPassing_4011);
		}
		if (targetEditPart instanceof InteractiveTaskEditPart) {
			types.add(CiatElementTypes.DisablingWithInformationPassing_4011);
		}
		if (targetEditPart instanceof CTTCollaborativeTaskEditPart) {
			types.add(CiatElementTypes.DisablingWithInformationPassing_4011);
		}
		if (targetEditPart instanceof ApplicationTaskEditPart) {
			types.add(CiatElementTypes.DisablingWithInformationPassing_4011);
		}
		if (targetEditPart instanceof IndividualTaskEditPart) {
			types.add(CiatElementTypes.IndependentConcurrency_4012);
		}
		if (targetEditPart instanceof CooperativeTaskEditPart) {
			types.add(CiatElementTypes.IndependentConcurrency_4012);
		}
		if (targetEditPart instanceof CollaborativeTaskEditPart) {
			types.add(CiatElementTypes.IndependentConcurrency_4012);
		}
		if (targetEditPart instanceof AbstractTaskEditPart) {
			types.add(CiatElementTypes.IndependentConcurrency_4012);
		}
		if (targetEditPart instanceof IndividualTask2EditPart) {
			types.add(CiatElementTypes.IndependentConcurrency_4012);
		}
		if (targetEditPart instanceof CooperativeTask2EditPart) {
			types.add(CiatElementTypes.IndependentConcurrency_4012);
		}
		if (targetEditPart instanceof CollaborativeTask2EditPart) {
			types.add(CiatElementTypes.IndependentConcurrency_4012);
		}
		if (targetEditPart instanceof AbstractTask2EditPart) {
			types.add(CiatElementTypes.IndependentConcurrency_4012);
		}
		if (targetEditPart instanceof InitEditPart) {
			types.add(CiatElementTypes.IndependentConcurrency_4012);
		}
		if (targetEditPart instanceof EndEditPart) {
			types.add(CiatElementTypes.IndependentConcurrency_4012);
		}
		if (targetEditPart instanceof TemporalConditionEditPart) {
			types.add(CiatElementTypes.IndependentConcurrency_4012);
		}
		if (targetEditPart instanceof NotificationEditPart) {
			types.add(CiatElementTypes.IndependentConcurrency_4012);
		}
		if (targetEditPart instanceof ConditionEditPart) {
			types.add(CiatElementTypes.IndependentConcurrency_4012);
		}
		if (targetEditPart instanceof Init2EditPart) {
			types.add(CiatElementTypes.IndependentConcurrency_4012);
		}
		if (targetEditPart instanceof End2EditPart) {
			types.add(CiatElementTypes.IndependentConcurrency_4012);
		}
		if (targetEditPart instanceof TemporalCondition2EditPart) {
			types.add(CiatElementTypes.IndependentConcurrency_4012);
		}
		if (targetEditPart instanceof Notification2EditPart) {
			types.add(CiatElementTypes.IndependentConcurrency_4012);
		}
		if (targetEditPart instanceof Condition2EditPart) {
			types.add(CiatElementTypes.IndependentConcurrency_4012);
		}
		if (targetEditPart instanceof ExclusiveEditionEditPart) {
			types.add(CiatElementTypes.IndependentConcurrency_4012);
		}
		if (targetEditPart instanceof CollaborativeVisualizationEditPart) {
			types.add(CiatElementTypes.IndependentConcurrency_4012);
		}
		if (targetEditPart instanceof IndividualVisualizationEditPart) {
			types.add(CiatElementTypes.IndependentConcurrency_4012);
		}
		if (targetEditPart instanceof UserTaskEditPart) {
			types.add(CiatElementTypes.IndependentConcurrency_4012);
		}
		if (targetEditPart instanceof CTTAbstractTaskEditPart) {
			types.add(CiatElementTypes.IndependentConcurrency_4012);
		}
		if (targetEditPart instanceof InteractiveTaskEditPart) {
			types.add(CiatElementTypes.IndependentConcurrency_4012);
		}
		if (targetEditPart instanceof CTTCollaborativeTaskEditPart) {
			types.add(CiatElementTypes.IndependentConcurrency_4012);
		}
		if (targetEditPart instanceof ApplicationTaskEditPart) {
			types.add(CiatElementTypes.IndependentConcurrency_4012);
		}
		if (targetEditPart instanceof IndividualTaskEditPart) {
			types.add(CiatElementTypes.OrderIndependence_4013);
		}
		if (targetEditPart instanceof CooperativeTaskEditPart) {
			types.add(CiatElementTypes.OrderIndependence_4013);
		}
		if (targetEditPart instanceof CollaborativeTaskEditPart) {
			types.add(CiatElementTypes.OrderIndependence_4013);
		}
		if (targetEditPart instanceof AbstractTaskEditPart) {
			types.add(CiatElementTypes.OrderIndependence_4013);
		}
		if (targetEditPart instanceof IndividualTask2EditPart) {
			types.add(CiatElementTypes.OrderIndependence_4013);
		}
		if (targetEditPart instanceof CooperativeTask2EditPart) {
			types.add(CiatElementTypes.OrderIndependence_4013);
		}
		if (targetEditPart instanceof CollaborativeTask2EditPart) {
			types.add(CiatElementTypes.OrderIndependence_4013);
		}
		if (targetEditPart instanceof AbstractTask2EditPart) {
			types.add(CiatElementTypes.OrderIndependence_4013);
		}
		if (targetEditPart instanceof InitEditPart) {
			types.add(CiatElementTypes.OrderIndependence_4013);
		}
		if (targetEditPart instanceof EndEditPart) {
			types.add(CiatElementTypes.OrderIndependence_4013);
		}
		if (targetEditPart instanceof TemporalConditionEditPart) {
			types.add(CiatElementTypes.OrderIndependence_4013);
		}
		if (targetEditPart instanceof NotificationEditPart) {
			types.add(CiatElementTypes.OrderIndependence_4013);
		}
		if (targetEditPart instanceof ConditionEditPart) {
			types.add(CiatElementTypes.OrderIndependence_4013);
		}
		if (targetEditPart instanceof Init2EditPart) {
			types.add(CiatElementTypes.OrderIndependence_4013);
		}
		if (targetEditPart instanceof End2EditPart) {
			types.add(CiatElementTypes.OrderIndependence_4013);
		}
		if (targetEditPart instanceof TemporalCondition2EditPart) {
			types.add(CiatElementTypes.OrderIndependence_4013);
		}
		if (targetEditPart instanceof Notification2EditPart) {
			types.add(CiatElementTypes.OrderIndependence_4013);
		}
		if (targetEditPart instanceof Condition2EditPart) {
			types.add(CiatElementTypes.OrderIndependence_4013);
		}
		if (targetEditPart instanceof ExclusiveEditionEditPart) {
			types.add(CiatElementTypes.OrderIndependence_4013);
		}
		if (targetEditPart instanceof CollaborativeVisualizationEditPart) {
			types.add(CiatElementTypes.OrderIndependence_4013);
		}
		if (targetEditPart instanceof IndividualVisualizationEditPart) {
			types.add(CiatElementTypes.OrderIndependence_4013);
		}
		if (targetEditPart instanceof UserTaskEditPart) {
			types.add(CiatElementTypes.OrderIndependence_4013);
		}
		if (targetEditPart instanceof CTTAbstractTaskEditPart) {
			types.add(CiatElementTypes.OrderIndependence_4013);
		}
		if (targetEditPart instanceof InteractiveTaskEditPart) {
			types.add(CiatElementTypes.OrderIndependence_4013);
		}
		if (targetEditPart instanceof CTTCollaborativeTaskEditPart) {
			types.add(CiatElementTypes.OrderIndependence_4013);
		}
		if (targetEditPart instanceof ApplicationTaskEditPart) {
			types.add(CiatElementTypes.OrderIndependence_4013);
		}
		if (targetEditPart instanceof IndividualTaskEditPart) {
			types.add(CiatElementTypes.SuspendResume_4014);
		}
		if (targetEditPart instanceof CooperativeTaskEditPart) {
			types.add(CiatElementTypes.SuspendResume_4014);
		}
		if (targetEditPart instanceof CollaborativeTaskEditPart) {
			types.add(CiatElementTypes.SuspendResume_4014);
		}
		if (targetEditPart instanceof AbstractTaskEditPart) {
			types.add(CiatElementTypes.SuspendResume_4014);
		}
		if (targetEditPart instanceof IndividualTask2EditPart) {
			types.add(CiatElementTypes.SuspendResume_4014);
		}
		if (targetEditPart instanceof CooperativeTask2EditPart) {
			types.add(CiatElementTypes.SuspendResume_4014);
		}
		if (targetEditPart instanceof CollaborativeTask2EditPart) {
			types.add(CiatElementTypes.SuspendResume_4014);
		}
		if (targetEditPart instanceof AbstractTask2EditPart) {
			types.add(CiatElementTypes.SuspendResume_4014);
		}
		if (targetEditPart instanceof InitEditPart) {
			types.add(CiatElementTypes.SuspendResume_4014);
		}
		if (targetEditPart instanceof EndEditPart) {
			types.add(CiatElementTypes.SuspendResume_4014);
		}
		if (targetEditPart instanceof TemporalConditionEditPart) {
			types.add(CiatElementTypes.SuspendResume_4014);
		}
		if (targetEditPart instanceof NotificationEditPart) {
			types.add(CiatElementTypes.SuspendResume_4014);
		}
		if (targetEditPart instanceof ConditionEditPart) {
			types.add(CiatElementTypes.SuspendResume_4014);
		}
		if (targetEditPart instanceof Init2EditPart) {
			types.add(CiatElementTypes.SuspendResume_4014);
		}
		if (targetEditPart instanceof End2EditPart) {
			types.add(CiatElementTypes.SuspendResume_4014);
		}
		if (targetEditPart instanceof TemporalCondition2EditPart) {
			types.add(CiatElementTypes.SuspendResume_4014);
		}
		if (targetEditPart instanceof Notification2EditPart) {
			types.add(CiatElementTypes.SuspendResume_4014);
		}
		if (targetEditPart instanceof Condition2EditPart) {
			types.add(CiatElementTypes.SuspendResume_4014);
		}
		if (targetEditPart instanceof ExclusiveEditionEditPart) {
			types.add(CiatElementTypes.SuspendResume_4014);
		}
		if (targetEditPart instanceof CollaborativeVisualizationEditPart) {
			types.add(CiatElementTypes.SuspendResume_4014);
		}
		if (targetEditPart instanceof IndividualVisualizationEditPart) {
			types.add(CiatElementTypes.SuspendResume_4014);
		}
		if (targetEditPart instanceof UserTaskEditPart) {
			types.add(CiatElementTypes.SuspendResume_4014);
		}
		if (targetEditPart instanceof CTTAbstractTaskEditPart) {
			types.add(CiatElementTypes.SuspendResume_4014);
		}
		if (targetEditPart instanceof InteractiveTaskEditPart) {
			types.add(CiatElementTypes.SuspendResume_4014);
		}
		if (targetEditPart instanceof CTTCollaborativeTaskEditPart) {
			types.add(CiatElementTypes.SuspendResume_4014);
		}
		if (targetEditPart instanceof ApplicationTaskEditPart) {
			types.add(CiatElementTypes.SuspendResume_4014);
		}
		if (targetEditPart instanceof IndividualTaskEditPart) {
			types.add(CiatElementTypes.ConcurrencyWithInformationPassing_4015);
		}
		if (targetEditPart instanceof CooperativeTaskEditPart) {
			types.add(CiatElementTypes.ConcurrencyWithInformationPassing_4015);
		}
		if (targetEditPart instanceof CollaborativeTaskEditPart) {
			types.add(CiatElementTypes.ConcurrencyWithInformationPassing_4015);
		}
		if (targetEditPart instanceof AbstractTaskEditPart) {
			types.add(CiatElementTypes.ConcurrencyWithInformationPassing_4015);
		}
		if (targetEditPart instanceof IndividualTask2EditPart) {
			types.add(CiatElementTypes.ConcurrencyWithInformationPassing_4015);
		}
		if (targetEditPart instanceof CooperativeTask2EditPart) {
			types.add(CiatElementTypes.ConcurrencyWithInformationPassing_4015);
		}
		if (targetEditPart instanceof CollaborativeTask2EditPart) {
			types.add(CiatElementTypes.ConcurrencyWithInformationPassing_4015);
		}
		if (targetEditPart instanceof AbstractTask2EditPart) {
			types.add(CiatElementTypes.ConcurrencyWithInformationPassing_4015);
		}
		if (targetEditPart instanceof InitEditPart) {
			types.add(CiatElementTypes.ConcurrencyWithInformationPassing_4015);
		}
		if (targetEditPart instanceof EndEditPart) {
			types.add(CiatElementTypes.ConcurrencyWithInformationPassing_4015);
		}
		if (targetEditPart instanceof TemporalConditionEditPart) {
			types.add(CiatElementTypes.ConcurrencyWithInformationPassing_4015);
		}
		if (targetEditPart instanceof NotificationEditPart) {
			types.add(CiatElementTypes.ConcurrencyWithInformationPassing_4015);
		}
		if (targetEditPart instanceof ConditionEditPart) {
			types.add(CiatElementTypes.ConcurrencyWithInformationPassing_4015);
		}
		if (targetEditPart instanceof Init2EditPart) {
			types.add(CiatElementTypes.ConcurrencyWithInformationPassing_4015);
		}
		if (targetEditPart instanceof End2EditPart) {
			types.add(CiatElementTypes.ConcurrencyWithInformationPassing_4015);
		}
		if (targetEditPart instanceof TemporalCondition2EditPart) {
			types.add(CiatElementTypes.ConcurrencyWithInformationPassing_4015);
		}
		if (targetEditPart instanceof Notification2EditPart) {
			types.add(CiatElementTypes.ConcurrencyWithInformationPassing_4015);
		}
		if (targetEditPart instanceof Condition2EditPart) {
			types.add(CiatElementTypes.ConcurrencyWithInformationPassing_4015);
		}
		if (targetEditPart instanceof ExclusiveEditionEditPart) {
			types.add(CiatElementTypes.ConcurrencyWithInformationPassing_4015);
		}
		if (targetEditPart instanceof CollaborativeVisualizationEditPart) {
			types.add(CiatElementTypes.ConcurrencyWithInformationPassing_4015);
		}
		if (targetEditPart instanceof IndividualVisualizationEditPart) {
			types.add(CiatElementTypes.ConcurrencyWithInformationPassing_4015);
		}
		if (targetEditPart instanceof UserTaskEditPart) {
			types.add(CiatElementTypes.ConcurrencyWithInformationPassing_4015);
		}
		if (targetEditPart instanceof CTTAbstractTaskEditPart) {
			types.add(CiatElementTypes.ConcurrencyWithInformationPassing_4015);
		}
		if (targetEditPart instanceof InteractiveTaskEditPart) {
			types.add(CiatElementTypes.ConcurrencyWithInformationPassing_4015);
		}
		if (targetEditPart instanceof CTTCollaborativeTaskEditPart) {
			types.add(CiatElementTypes.ConcurrencyWithInformationPassing_4015);
		}
		if (targetEditPart instanceof ApplicationTaskEditPart) {
			types.add(CiatElementTypes.ConcurrencyWithInformationPassing_4015);
		}
		if (targetEditPart instanceof IndividualTaskEditPart) {
			types.add(CiatElementTypes.DeterministicChoice_4016);
		}
		if (targetEditPart instanceof CooperativeTaskEditPart) {
			types.add(CiatElementTypes.DeterministicChoice_4016);
		}
		if (targetEditPart instanceof CollaborativeTaskEditPart) {
			types.add(CiatElementTypes.DeterministicChoice_4016);
		}
		if (targetEditPart instanceof AbstractTaskEditPart) {
			types.add(CiatElementTypes.DeterministicChoice_4016);
		}
		if (targetEditPart instanceof IndividualTask2EditPart) {
			types.add(CiatElementTypes.DeterministicChoice_4016);
		}
		if (targetEditPart instanceof CooperativeTask2EditPart) {
			types.add(CiatElementTypes.DeterministicChoice_4016);
		}
		if (targetEditPart instanceof CollaborativeTask2EditPart) {
			types.add(CiatElementTypes.DeterministicChoice_4016);
		}
		if (targetEditPart instanceof AbstractTask2EditPart) {
			types.add(CiatElementTypes.DeterministicChoice_4016);
		}
		if (targetEditPart instanceof InitEditPart) {
			types.add(CiatElementTypes.DeterministicChoice_4016);
		}
		if (targetEditPart instanceof EndEditPart) {
			types.add(CiatElementTypes.DeterministicChoice_4016);
		}
		if (targetEditPart instanceof TemporalConditionEditPart) {
			types.add(CiatElementTypes.DeterministicChoice_4016);
		}
		if (targetEditPart instanceof NotificationEditPart) {
			types.add(CiatElementTypes.DeterministicChoice_4016);
		}
		if (targetEditPart instanceof ConditionEditPart) {
			types.add(CiatElementTypes.DeterministicChoice_4016);
		}
		if (targetEditPart instanceof Init2EditPart) {
			types.add(CiatElementTypes.DeterministicChoice_4016);
		}
		if (targetEditPart instanceof End2EditPart) {
			types.add(CiatElementTypes.DeterministicChoice_4016);
		}
		if (targetEditPart instanceof TemporalCondition2EditPart) {
			types.add(CiatElementTypes.DeterministicChoice_4016);
		}
		if (targetEditPart instanceof Notification2EditPart) {
			types.add(CiatElementTypes.DeterministicChoice_4016);
		}
		if (targetEditPart instanceof Condition2EditPart) {
			types.add(CiatElementTypes.DeterministicChoice_4016);
		}
		if (targetEditPart instanceof ExclusiveEditionEditPart) {
			types.add(CiatElementTypes.DeterministicChoice_4016);
		}
		if (targetEditPart instanceof CollaborativeVisualizationEditPart) {
			types.add(CiatElementTypes.DeterministicChoice_4016);
		}
		if (targetEditPart instanceof IndividualVisualizationEditPart) {
			types.add(CiatElementTypes.DeterministicChoice_4016);
		}
		if (targetEditPart instanceof UserTaskEditPart) {
			types.add(CiatElementTypes.DeterministicChoice_4016);
		}
		if (targetEditPart instanceof CTTAbstractTaskEditPart) {
			types.add(CiatElementTypes.DeterministicChoice_4016);
		}
		if (targetEditPart instanceof InteractiveTaskEditPart) {
			types.add(CiatElementTypes.DeterministicChoice_4016);
		}
		if (targetEditPart instanceof CTTCollaborativeTaskEditPart) {
			types.add(CiatElementTypes.DeterministicChoice_4016);
		}
		if (targetEditPart instanceof ApplicationTaskEditPart) {
			types.add(CiatElementTypes.DeterministicChoice_4016);
		}
		if (targetEditPart instanceof IndividualTaskEditPart) {
			types.add(CiatElementTypes.UndeterministicChoice_4017);
		}
		if (targetEditPart instanceof CooperativeTaskEditPart) {
			types.add(CiatElementTypes.UndeterministicChoice_4017);
		}
		if (targetEditPart instanceof CollaborativeTaskEditPart) {
			types.add(CiatElementTypes.UndeterministicChoice_4017);
		}
		if (targetEditPart instanceof AbstractTaskEditPart) {
			types.add(CiatElementTypes.UndeterministicChoice_4017);
		}
		if (targetEditPart instanceof IndividualTask2EditPart) {
			types.add(CiatElementTypes.UndeterministicChoice_4017);
		}
		if (targetEditPart instanceof CooperativeTask2EditPart) {
			types.add(CiatElementTypes.UndeterministicChoice_4017);
		}
		if (targetEditPart instanceof CollaborativeTask2EditPart) {
			types.add(CiatElementTypes.UndeterministicChoice_4017);
		}
		if (targetEditPart instanceof AbstractTask2EditPart) {
			types.add(CiatElementTypes.UndeterministicChoice_4017);
		}
		if (targetEditPart instanceof InitEditPart) {
			types.add(CiatElementTypes.UndeterministicChoice_4017);
		}
		if (targetEditPart instanceof EndEditPart) {
			types.add(CiatElementTypes.UndeterministicChoice_4017);
		}
		if (targetEditPart instanceof TemporalConditionEditPart) {
			types.add(CiatElementTypes.UndeterministicChoice_4017);
		}
		if (targetEditPart instanceof NotificationEditPart) {
			types.add(CiatElementTypes.UndeterministicChoice_4017);
		}
		if (targetEditPart instanceof ConditionEditPart) {
			types.add(CiatElementTypes.UndeterministicChoice_4017);
		}
		if (targetEditPart instanceof Init2EditPart) {
			types.add(CiatElementTypes.UndeterministicChoice_4017);
		}
		if (targetEditPart instanceof End2EditPart) {
			types.add(CiatElementTypes.UndeterministicChoice_4017);
		}
		if (targetEditPart instanceof TemporalCondition2EditPart) {
			types.add(CiatElementTypes.UndeterministicChoice_4017);
		}
		if (targetEditPart instanceof Notification2EditPart) {
			types.add(CiatElementTypes.UndeterministicChoice_4017);
		}
		if (targetEditPart instanceof Condition2EditPart) {
			types.add(CiatElementTypes.UndeterministicChoice_4017);
		}
		if (targetEditPart instanceof ExclusiveEditionEditPart) {
			types.add(CiatElementTypes.UndeterministicChoice_4017);
		}
		if (targetEditPart instanceof CollaborativeVisualizationEditPart) {
			types.add(CiatElementTypes.UndeterministicChoice_4017);
		}
		if (targetEditPart instanceof IndividualVisualizationEditPart) {
			types.add(CiatElementTypes.UndeterministicChoice_4017);
		}
		if (targetEditPart instanceof UserTaskEditPart) {
			types.add(CiatElementTypes.UndeterministicChoice_4017);
		}
		if (targetEditPart instanceof CTTAbstractTaskEditPart) {
			types.add(CiatElementTypes.UndeterministicChoice_4017);
		}
		if (targetEditPart instanceof InteractiveTaskEditPart) {
			types.add(CiatElementTypes.UndeterministicChoice_4017);
		}
		if (targetEditPart instanceof CTTCollaborativeTaskEditPart) {
			types.add(CiatElementTypes.UndeterministicChoice_4017);
		}
		if (targetEditPart instanceof ApplicationTaskEditPart) {
			types.add(CiatElementTypes.UndeterministicChoice_4017);
		}
		return types;
	}

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getTypesForTarget(IAdaptable source, IElementType relationshipType) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source.getAdapter(IGraphicalEditPart.class);
		return doGetTypesForTarget((CooperativeTaskEditPart) sourceEditPart, relationshipType);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetTypesForTarget(CooperativeTaskEditPart source, IElementType relationshipType) {
		List<IElementType> types = new ArrayList<IElementType>();
		if (relationshipType == CiatElementTypes.Aggregation_4007) {
			types.add(CiatElementTypes.IndividualTask_3006);
			types.add(CiatElementTypes.CooperativeTask_3014);
			types.add(CiatElementTypes.CollaborativeTask_3021);
			types.add(CiatElementTypes.AbstractTask_3028);
			types.add(CiatElementTypes.IndividualTask_3029);
			types.add(CiatElementTypes.CooperativeTask_3030);
			types.add(CiatElementTypes.CollaborativeTask_3031);
			types.add(CiatElementTypes.AbstractTask_3032);
			types.add(CiatElementTypes.Init_3033);
			types.add(CiatElementTypes.End_3034);
			types.add(CiatElementTypes.TemporalCondition_3035);
			types.add(CiatElementTypes.Notification_3036);
			types.add(CiatElementTypes.Condition_3037);
			types.add(CiatElementTypes.Init_3038);
			types.add(CiatElementTypes.End_3039);
			types.add(CiatElementTypes.TemporalCondition_3040);
			types.add(CiatElementTypes.Notification_3041);
			types.add(CiatElementTypes.Condition_3042);
			types.add(CiatElementTypes.ExclusiveEdition_3049);
			types.add(CiatElementTypes.CollaborativeVisualization_3050);
			types.add(CiatElementTypes.IndividualVisualization_3051);
			types.add(CiatElementTypes.UserTask_3052);
			types.add(CiatElementTypes.CTTAbstractTask_3053);
			types.add(CiatElementTypes.InteractiveTask_3054);
			types.add(CiatElementTypes.CTTCollaborativeTask_3055);
			types.add(CiatElementTypes.ApplicationTask_3056);
		} else if (relationshipType == CiatElementTypes.Enabling_4008) {
			types.add(CiatElementTypes.IndividualTask_3006);
			types.add(CiatElementTypes.CooperativeTask_3014);
			types.add(CiatElementTypes.CollaborativeTask_3021);
			types.add(CiatElementTypes.AbstractTask_3028);
			types.add(CiatElementTypes.IndividualTask_3029);
			types.add(CiatElementTypes.CooperativeTask_3030);
			types.add(CiatElementTypes.CollaborativeTask_3031);
			types.add(CiatElementTypes.AbstractTask_3032);
			types.add(CiatElementTypes.Init_3033);
			types.add(CiatElementTypes.End_3034);
			types.add(CiatElementTypes.TemporalCondition_3035);
			types.add(CiatElementTypes.Notification_3036);
			types.add(CiatElementTypes.Condition_3037);
			types.add(CiatElementTypes.Init_3038);
			types.add(CiatElementTypes.End_3039);
			types.add(CiatElementTypes.TemporalCondition_3040);
			types.add(CiatElementTypes.Notification_3041);
			types.add(CiatElementTypes.Condition_3042);
			types.add(CiatElementTypes.ExclusiveEdition_3049);
			types.add(CiatElementTypes.CollaborativeVisualization_3050);
			types.add(CiatElementTypes.IndividualVisualization_3051);
			types.add(CiatElementTypes.UserTask_3052);
			types.add(CiatElementTypes.CTTAbstractTask_3053);
			types.add(CiatElementTypes.InteractiveTask_3054);
			types.add(CiatElementTypes.CTTCollaborativeTask_3055);
			types.add(CiatElementTypes.ApplicationTask_3056);
		} else if (relationshipType == CiatElementTypes.Disabling_4009) {
			types.add(CiatElementTypes.IndividualTask_3006);
			types.add(CiatElementTypes.CooperativeTask_3014);
			types.add(CiatElementTypes.CollaborativeTask_3021);
			types.add(CiatElementTypes.AbstractTask_3028);
			types.add(CiatElementTypes.IndividualTask_3029);
			types.add(CiatElementTypes.CooperativeTask_3030);
			types.add(CiatElementTypes.CollaborativeTask_3031);
			types.add(CiatElementTypes.AbstractTask_3032);
			types.add(CiatElementTypes.Init_3033);
			types.add(CiatElementTypes.End_3034);
			types.add(CiatElementTypes.TemporalCondition_3035);
			types.add(CiatElementTypes.Notification_3036);
			types.add(CiatElementTypes.Condition_3037);
			types.add(CiatElementTypes.Init_3038);
			types.add(CiatElementTypes.End_3039);
			types.add(CiatElementTypes.TemporalCondition_3040);
			types.add(CiatElementTypes.Notification_3041);
			types.add(CiatElementTypes.Condition_3042);
			types.add(CiatElementTypes.ExclusiveEdition_3049);
			types.add(CiatElementTypes.CollaborativeVisualization_3050);
			types.add(CiatElementTypes.IndividualVisualization_3051);
			types.add(CiatElementTypes.UserTask_3052);
			types.add(CiatElementTypes.CTTAbstractTask_3053);
			types.add(CiatElementTypes.InteractiveTask_3054);
			types.add(CiatElementTypes.CTTCollaborativeTask_3055);
			types.add(CiatElementTypes.ApplicationTask_3056);
		} else if (relationshipType == CiatElementTypes.EnablingWithInformationPassing_4010) {
			types.add(CiatElementTypes.IndividualTask_3006);
			types.add(CiatElementTypes.CooperativeTask_3014);
			types.add(CiatElementTypes.CollaborativeTask_3021);
			types.add(CiatElementTypes.AbstractTask_3028);
			types.add(CiatElementTypes.IndividualTask_3029);
			types.add(CiatElementTypes.CooperativeTask_3030);
			types.add(CiatElementTypes.CollaborativeTask_3031);
			types.add(CiatElementTypes.AbstractTask_3032);
			types.add(CiatElementTypes.Init_3033);
			types.add(CiatElementTypes.End_3034);
			types.add(CiatElementTypes.TemporalCondition_3035);
			types.add(CiatElementTypes.Notification_3036);
			types.add(CiatElementTypes.Condition_3037);
			types.add(CiatElementTypes.Init_3038);
			types.add(CiatElementTypes.End_3039);
			types.add(CiatElementTypes.TemporalCondition_3040);
			types.add(CiatElementTypes.Notification_3041);
			types.add(CiatElementTypes.Condition_3042);
			types.add(CiatElementTypes.ExclusiveEdition_3049);
			types.add(CiatElementTypes.CollaborativeVisualization_3050);
			types.add(CiatElementTypes.IndividualVisualization_3051);
			types.add(CiatElementTypes.UserTask_3052);
			types.add(CiatElementTypes.CTTAbstractTask_3053);
			types.add(CiatElementTypes.InteractiveTask_3054);
			types.add(CiatElementTypes.CTTCollaborativeTask_3055);
			types.add(CiatElementTypes.ApplicationTask_3056);
		} else if (relationshipType == CiatElementTypes.DisablingWithInformationPassing_4011) {
			types.add(CiatElementTypes.IndividualTask_3006);
			types.add(CiatElementTypes.CooperativeTask_3014);
			types.add(CiatElementTypes.CollaborativeTask_3021);
			types.add(CiatElementTypes.AbstractTask_3028);
			types.add(CiatElementTypes.IndividualTask_3029);
			types.add(CiatElementTypes.CooperativeTask_3030);
			types.add(CiatElementTypes.CollaborativeTask_3031);
			types.add(CiatElementTypes.AbstractTask_3032);
			types.add(CiatElementTypes.Init_3033);
			types.add(CiatElementTypes.End_3034);
			types.add(CiatElementTypes.TemporalCondition_3035);
			types.add(CiatElementTypes.Notification_3036);
			types.add(CiatElementTypes.Condition_3037);
			types.add(CiatElementTypes.Init_3038);
			types.add(CiatElementTypes.End_3039);
			types.add(CiatElementTypes.TemporalCondition_3040);
			types.add(CiatElementTypes.Notification_3041);
			types.add(CiatElementTypes.Condition_3042);
			types.add(CiatElementTypes.ExclusiveEdition_3049);
			types.add(CiatElementTypes.CollaborativeVisualization_3050);
			types.add(CiatElementTypes.IndividualVisualization_3051);
			types.add(CiatElementTypes.UserTask_3052);
			types.add(CiatElementTypes.CTTAbstractTask_3053);
			types.add(CiatElementTypes.InteractiveTask_3054);
			types.add(CiatElementTypes.CTTCollaborativeTask_3055);
			types.add(CiatElementTypes.ApplicationTask_3056);
		} else if (relationshipType == CiatElementTypes.IndependentConcurrency_4012) {
			types.add(CiatElementTypes.IndividualTask_3006);
			types.add(CiatElementTypes.CooperativeTask_3014);
			types.add(CiatElementTypes.CollaborativeTask_3021);
			types.add(CiatElementTypes.AbstractTask_3028);
			types.add(CiatElementTypes.IndividualTask_3029);
			types.add(CiatElementTypes.CooperativeTask_3030);
			types.add(CiatElementTypes.CollaborativeTask_3031);
			types.add(CiatElementTypes.AbstractTask_3032);
			types.add(CiatElementTypes.Init_3033);
			types.add(CiatElementTypes.End_3034);
			types.add(CiatElementTypes.TemporalCondition_3035);
			types.add(CiatElementTypes.Notification_3036);
			types.add(CiatElementTypes.Condition_3037);
			types.add(CiatElementTypes.Init_3038);
			types.add(CiatElementTypes.End_3039);
			types.add(CiatElementTypes.TemporalCondition_3040);
			types.add(CiatElementTypes.Notification_3041);
			types.add(CiatElementTypes.Condition_3042);
			types.add(CiatElementTypes.ExclusiveEdition_3049);
			types.add(CiatElementTypes.CollaborativeVisualization_3050);
			types.add(CiatElementTypes.IndividualVisualization_3051);
			types.add(CiatElementTypes.UserTask_3052);
			types.add(CiatElementTypes.CTTAbstractTask_3053);
			types.add(CiatElementTypes.InteractiveTask_3054);
			types.add(CiatElementTypes.CTTCollaborativeTask_3055);
			types.add(CiatElementTypes.ApplicationTask_3056);
		} else if (relationshipType == CiatElementTypes.OrderIndependence_4013) {
			types.add(CiatElementTypes.IndividualTask_3006);
			types.add(CiatElementTypes.CooperativeTask_3014);
			types.add(CiatElementTypes.CollaborativeTask_3021);
			types.add(CiatElementTypes.AbstractTask_3028);
			types.add(CiatElementTypes.IndividualTask_3029);
			types.add(CiatElementTypes.CooperativeTask_3030);
			types.add(CiatElementTypes.CollaborativeTask_3031);
			types.add(CiatElementTypes.AbstractTask_3032);
			types.add(CiatElementTypes.Init_3033);
			types.add(CiatElementTypes.End_3034);
			types.add(CiatElementTypes.TemporalCondition_3035);
			types.add(CiatElementTypes.Notification_3036);
			types.add(CiatElementTypes.Condition_3037);
			types.add(CiatElementTypes.Init_3038);
			types.add(CiatElementTypes.End_3039);
			types.add(CiatElementTypes.TemporalCondition_3040);
			types.add(CiatElementTypes.Notification_3041);
			types.add(CiatElementTypes.Condition_3042);
			types.add(CiatElementTypes.ExclusiveEdition_3049);
			types.add(CiatElementTypes.CollaborativeVisualization_3050);
			types.add(CiatElementTypes.IndividualVisualization_3051);
			types.add(CiatElementTypes.UserTask_3052);
			types.add(CiatElementTypes.CTTAbstractTask_3053);
			types.add(CiatElementTypes.InteractiveTask_3054);
			types.add(CiatElementTypes.CTTCollaborativeTask_3055);
			types.add(CiatElementTypes.ApplicationTask_3056);
		} else if (relationshipType == CiatElementTypes.SuspendResume_4014) {
			types.add(CiatElementTypes.IndividualTask_3006);
			types.add(CiatElementTypes.CooperativeTask_3014);
			types.add(CiatElementTypes.CollaborativeTask_3021);
			types.add(CiatElementTypes.AbstractTask_3028);
			types.add(CiatElementTypes.IndividualTask_3029);
			types.add(CiatElementTypes.CooperativeTask_3030);
			types.add(CiatElementTypes.CollaborativeTask_3031);
			types.add(CiatElementTypes.AbstractTask_3032);
			types.add(CiatElementTypes.Init_3033);
			types.add(CiatElementTypes.End_3034);
			types.add(CiatElementTypes.TemporalCondition_3035);
			types.add(CiatElementTypes.Notification_3036);
			types.add(CiatElementTypes.Condition_3037);
			types.add(CiatElementTypes.Init_3038);
			types.add(CiatElementTypes.End_3039);
			types.add(CiatElementTypes.TemporalCondition_3040);
			types.add(CiatElementTypes.Notification_3041);
			types.add(CiatElementTypes.Condition_3042);
			types.add(CiatElementTypes.ExclusiveEdition_3049);
			types.add(CiatElementTypes.CollaborativeVisualization_3050);
			types.add(CiatElementTypes.IndividualVisualization_3051);
			types.add(CiatElementTypes.UserTask_3052);
			types.add(CiatElementTypes.CTTAbstractTask_3053);
			types.add(CiatElementTypes.InteractiveTask_3054);
			types.add(CiatElementTypes.CTTCollaborativeTask_3055);
			types.add(CiatElementTypes.ApplicationTask_3056);
		} else if (relationshipType == CiatElementTypes.ConcurrencyWithInformationPassing_4015) {
			types.add(CiatElementTypes.IndividualTask_3006);
			types.add(CiatElementTypes.CooperativeTask_3014);
			types.add(CiatElementTypes.CollaborativeTask_3021);
			types.add(CiatElementTypes.AbstractTask_3028);
			types.add(CiatElementTypes.IndividualTask_3029);
			types.add(CiatElementTypes.CooperativeTask_3030);
			types.add(CiatElementTypes.CollaborativeTask_3031);
			types.add(CiatElementTypes.AbstractTask_3032);
			types.add(CiatElementTypes.Init_3033);
			types.add(CiatElementTypes.End_3034);
			types.add(CiatElementTypes.TemporalCondition_3035);
			types.add(CiatElementTypes.Notification_3036);
			types.add(CiatElementTypes.Condition_3037);
			types.add(CiatElementTypes.Init_3038);
			types.add(CiatElementTypes.End_3039);
			types.add(CiatElementTypes.TemporalCondition_3040);
			types.add(CiatElementTypes.Notification_3041);
			types.add(CiatElementTypes.Condition_3042);
			types.add(CiatElementTypes.ExclusiveEdition_3049);
			types.add(CiatElementTypes.CollaborativeVisualization_3050);
			types.add(CiatElementTypes.IndividualVisualization_3051);
			types.add(CiatElementTypes.UserTask_3052);
			types.add(CiatElementTypes.CTTAbstractTask_3053);
			types.add(CiatElementTypes.InteractiveTask_3054);
			types.add(CiatElementTypes.CTTCollaborativeTask_3055);
			types.add(CiatElementTypes.ApplicationTask_3056);
		} else if (relationshipType == CiatElementTypes.DeterministicChoice_4016) {
			types.add(CiatElementTypes.IndividualTask_3006);
			types.add(CiatElementTypes.CooperativeTask_3014);
			types.add(CiatElementTypes.CollaborativeTask_3021);
			types.add(CiatElementTypes.AbstractTask_3028);
			types.add(CiatElementTypes.IndividualTask_3029);
			types.add(CiatElementTypes.CooperativeTask_3030);
			types.add(CiatElementTypes.CollaborativeTask_3031);
			types.add(CiatElementTypes.AbstractTask_3032);
			types.add(CiatElementTypes.Init_3033);
			types.add(CiatElementTypes.End_3034);
			types.add(CiatElementTypes.TemporalCondition_3035);
			types.add(CiatElementTypes.Notification_3036);
			types.add(CiatElementTypes.Condition_3037);
			types.add(CiatElementTypes.Init_3038);
			types.add(CiatElementTypes.End_3039);
			types.add(CiatElementTypes.TemporalCondition_3040);
			types.add(CiatElementTypes.Notification_3041);
			types.add(CiatElementTypes.Condition_3042);
			types.add(CiatElementTypes.ExclusiveEdition_3049);
			types.add(CiatElementTypes.CollaborativeVisualization_3050);
			types.add(CiatElementTypes.IndividualVisualization_3051);
			types.add(CiatElementTypes.UserTask_3052);
			types.add(CiatElementTypes.CTTAbstractTask_3053);
			types.add(CiatElementTypes.InteractiveTask_3054);
			types.add(CiatElementTypes.CTTCollaborativeTask_3055);
			types.add(CiatElementTypes.ApplicationTask_3056);
		} else if (relationshipType == CiatElementTypes.UndeterministicChoice_4017) {
			types.add(CiatElementTypes.IndividualTask_3006);
			types.add(CiatElementTypes.CooperativeTask_3014);
			types.add(CiatElementTypes.CollaborativeTask_3021);
			types.add(CiatElementTypes.AbstractTask_3028);
			types.add(CiatElementTypes.IndividualTask_3029);
			types.add(CiatElementTypes.CooperativeTask_3030);
			types.add(CiatElementTypes.CollaborativeTask_3031);
			types.add(CiatElementTypes.AbstractTask_3032);
			types.add(CiatElementTypes.Init_3033);
			types.add(CiatElementTypes.End_3034);
			types.add(CiatElementTypes.TemporalCondition_3035);
			types.add(CiatElementTypes.Notification_3036);
			types.add(CiatElementTypes.Condition_3037);
			types.add(CiatElementTypes.Init_3038);
			types.add(CiatElementTypes.End_3039);
			types.add(CiatElementTypes.TemporalCondition_3040);
			types.add(CiatElementTypes.Notification_3041);
			types.add(CiatElementTypes.Condition_3042);
			types.add(CiatElementTypes.ExclusiveEdition_3049);
			types.add(CiatElementTypes.CollaborativeVisualization_3050);
			types.add(CiatElementTypes.IndividualVisualization_3051);
			types.add(CiatElementTypes.UserTask_3052);
			types.add(CiatElementTypes.CTTAbstractTask_3053);
			types.add(CiatElementTypes.InteractiveTask_3054);
			types.add(CiatElementTypes.CTTCollaborativeTask_3055);
			types.add(CiatElementTypes.ApplicationTask_3056);
		}
		return types;
	}

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getRelTypesOnTarget(IAdaptable target) {
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnTarget((CooperativeTaskEditPart) targetEditPart);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetRelTypesOnTarget(CooperativeTaskEditPart target) {
		List<IElementType> types = new ArrayList<IElementType>(11);
		types.add(CiatElementTypes.Aggregation_4007);
		types.add(CiatElementTypes.Enabling_4008);
		types.add(CiatElementTypes.Disabling_4009);
		types.add(CiatElementTypes.EnablingWithInformationPassing_4010);
		types.add(CiatElementTypes.DisablingWithInformationPassing_4011);
		types.add(CiatElementTypes.IndependentConcurrency_4012);
		types.add(CiatElementTypes.OrderIndependence_4013);
		types.add(CiatElementTypes.SuspendResume_4014);
		types.add(CiatElementTypes.ConcurrencyWithInformationPassing_4015);
		types.add(CiatElementTypes.DeterministicChoice_4016);
		types.add(CiatElementTypes.UndeterministicChoice_4017);
		return types;
	}

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getTypesForSource(IAdaptable target, IElementType relationshipType) {
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target.getAdapter(IGraphicalEditPart.class);
		return doGetTypesForSource((CooperativeTaskEditPart) targetEditPart, relationshipType);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetTypesForSource(CooperativeTaskEditPart target, IElementType relationshipType) {
		List<IElementType> types = new ArrayList<IElementType>();
		if (relationshipType == CiatElementTypes.Aggregation_4007) {
			types.add(CiatElementTypes.IndividualTask_3006);
			types.add(CiatElementTypes.CooperativeTask_3014);
			types.add(CiatElementTypes.CollaborativeTask_3021);
			types.add(CiatElementTypes.AbstractTask_3028);
			types.add(CiatElementTypes.IndividualTask_3029);
			types.add(CiatElementTypes.CooperativeTask_3030);
			types.add(CiatElementTypes.CollaborativeTask_3031);
			types.add(CiatElementTypes.AbstractTask_3032);
			types.add(CiatElementTypes.Init_3033);
			types.add(CiatElementTypes.End_3034);
			types.add(CiatElementTypes.TemporalCondition_3035);
			types.add(CiatElementTypes.Notification_3036);
			types.add(CiatElementTypes.Condition_3037);
			types.add(CiatElementTypes.Init_3038);
			types.add(CiatElementTypes.End_3039);
			types.add(CiatElementTypes.TemporalCondition_3040);
			types.add(CiatElementTypes.Notification_3041);
			types.add(CiatElementTypes.Condition_3042);
			types.add(CiatElementTypes.ExclusiveEdition_3049);
			types.add(CiatElementTypes.CollaborativeVisualization_3050);
			types.add(CiatElementTypes.IndividualVisualization_3051);
			types.add(CiatElementTypes.UserTask_3052);
			types.add(CiatElementTypes.CTTAbstractTask_3053);
			types.add(CiatElementTypes.InteractiveTask_3054);
			types.add(CiatElementTypes.CTTCollaborativeTask_3055);
			types.add(CiatElementTypes.ApplicationTask_3056);
		} else if (relationshipType == CiatElementTypes.Enabling_4008) {
			types.add(CiatElementTypes.IndividualTask_3006);
			types.add(CiatElementTypes.CooperativeTask_3014);
			types.add(CiatElementTypes.CollaborativeTask_3021);
			types.add(CiatElementTypes.AbstractTask_3028);
			types.add(CiatElementTypes.IndividualTask_3029);
			types.add(CiatElementTypes.CooperativeTask_3030);
			types.add(CiatElementTypes.CollaborativeTask_3031);
			types.add(CiatElementTypes.AbstractTask_3032);
			types.add(CiatElementTypes.Init_3033);
			types.add(CiatElementTypes.End_3034);
			types.add(CiatElementTypes.TemporalCondition_3035);
			types.add(CiatElementTypes.Notification_3036);
			types.add(CiatElementTypes.Condition_3037);
			types.add(CiatElementTypes.Init_3038);
			types.add(CiatElementTypes.End_3039);
			types.add(CiatElementTypes.TemporalCondition_3040);
			types.add(CiatElementTypes.Notification_3041);
			types.add(CiatElementTypes.Condition_3042);
			types.add(CiatElementTypes.ExclusiveEdition_3049);
			types.add(CiatElementTypes.CollaborativeVisualization_3050);
			types.add(CiatElementTypes.IndividualVisualization_3051);
			types.add(CiatElementTypes.UserTask_3052);
			types.add(CiatElementTypes.CTTAbstractTask_3053);
			types.add(CiatElementTypes.InteractiveTask_3054);
			types.add(CiatElementTypes.CTTCollaborativeTask_3055);
			types.add(CiatElementTypes.ApplicationTask_3056);
		} else if (relationshipType == CiatElementTypes.Disabling_4009) {
			types.add(CiatElementTypes.IndividualTask_3006);
			types.add(CiatElementTypes.CooperativeTask_3014);
			types.add(CiatElementTypes.CollaborativeTask_3021);
			types.add(CiatElementTypes.AbstractTask_3028);
			types.add(CiatElementTypes.IndividualTask_3029);
			types.add(CiatElementTypes.CooperativeTask_3030);
			types.add(CiatElementTypes.CollaborativeTask_3031);
			types.add(CiatElementTypes.AbstractTask_3032);
			types.add(CiatElementTypes.Init_3033);
			types.add(CiatElementTypes.End_3034);
			types.add(CiatElementTypes.TemporalCondition_3035);
			types.add(CiatElementTypes.Notification_3036);
			types.add(CiatElementTypes.Condition_3037);
			types.add(CiatElementTypes.Init_3038);
			types.add(CiatElementTypes.End_3039);
			types.add(CiatElementTypes.TemporalCondition_3040);
			types.add(CiatElementTypes.Notification_3041);
			types.add(CiatElementTypes.Condition_3042);
			types.add(CiatElementTypes.ExclusiveEdition_3049);
			types.add(CiatElementTypes.CollaborativeVisualization_3050);
			types.add(CiatElementTypes.IndividualVisualization_3051);
			types.add(CiatElementTypes.UserTask_3052);
			types.add(CiatElementTypes.CTTAbstractTask_3053);
			types.add(CiatElementTypes.InteractiveTask_3054);
			types.add(CiatElementTypes.CTTCollaborativeTask_3055);
			types.add(CiatElementTypes.ApplicationTask_3056);
		} else if (relationshipType == CiatElementTypes.EnablingWithInformationPassing_4010) {
			types.add(CiatElementTypes.IndividualTask_3006);
			types.add(CiatElementTypes.CooperativeTask_3014);
			types.add(CiatElementTypes.CollaborativeTask_3021);
			types.add(CiatElementTypes.AbstractTask_3028);
			types.add(CiatElementTypes.IndividualTask_3029);
			types.add(CiatElementTypes.CooperativeTask_3030);
			types.add(CiatElementTypes.CollaborativeTask_3031);
			types.add(CiatElementTypes.AbstractTask_3032);
			types.add(CiatElementTypes.Init_3033);
			types.add(CiatElementTypes.End_3034);
			types.add(CiatElementTypes.TemporalCondition_3035);
			types.add(CiatElementTypes.Notification_3036);
			types.add(CiatElementTypes.Condition_3037);
			types.add(CiatElementTypes.Init_3038);
			types.add(CiatElementTypes.End_3039);
			types.add(CiatElementTypes.TemporalCondition_3040);
			types.add(CiatElementTypes.Notification_3041);
			types.add(CiatElementTypes.Condition_3042);
			types.add(CiatElementTypes.ExclusiveEdition_3049);
			types.add(CiatElementTypes.CollaborativeVisualization_3050);
			types.add(CiatElementTypes.IndividualVisualization_3051);
			types.add(CiatElementTypes.UserTask_3052);
			types.add(CiatElementTypes.CTTAbstractTask_3053);
			types.add(CiatElementTypes.InteractiveTask_3054);
			types.add(CiatElementTypes.CTTCollaborativeTask_3055);
			types.add(CiatElementTypes.ApplicationTask_3056);
		} else if (relationshipType == CiatElementTypes.DisablingWithInformationPassing_4011) {
			types.add(CiatElementTypes.IndividualTask_3006);
			types.add(CiatElementTypes.CooperativeTask_3014);
			types.add(CiatElementTypes.CollaborativeTask_3021);
			types.add(CiatElementTypes.AbstractTask_3028);
			types.add(CiatElementTypes.IndividualTask_3029);
			types.add(CiatElementTypes.CooperativeTask_3030);
			types.add(CiatElementTypes.CollaborativeTask_3031);
			types.add(CiatElementTypes.AbstractTask_3032);
			types.add(CiatElementTypes.Init_3033);
			types.add(CiatElementTypes.End_3034);
			types.add(CiatElementTypes.TemporalCondition_3035);
			types.add(CiatElementTypes.Notification_3036);
			types.add(CiatElementTypes.Condition_3037);
			types.add(CiatElementTypes.Init_3038);
			types.add(CiatElementTypes.End_3039);
			types.add(CiatElementTypes.TemporalCondition_3040);
			types.add(CiatElementTypes.Notification_3041);
			types.add(CiatElementTypes.Condition_3042);
			types.add(CiatElementTypes.ExclusiveEdition_3049);
			types.add(CiatElementTypes.CollaborativeVisualization_3050);
			types.add(CiatElementTypes.IndividualVisualization_3051);
			types.add(CiatElementTypes.UserTask_3052);
			types.add(CiatElementTypes.CTTAbstractTask_3053);
			types.add(CiatElementTypes.InteractiveTask_3054);
			types.add(CiatElementTypes.CTTCollaborativeTask_3055);
			types.add(CiatElementTypes.ApplicationTask_3056);
		} else if (relationshipType == CiatElementTypes.IndependentConcurrency_4012) {
			types.add(CiatElementTypes.IndividualTask_3006);
			types.add(CiatElementTypes.CooperativeTask_3014);
			types.add(CiatElementTypes.CollaborativeTask_3021);
			types.add(CiatElementTypes.AbstractTask_3028);
			types.add(CiatElementTypes.IndividualTask_3029);
			types.add(CiatElementTypes.CooperativeTask_3030);
			types.add(CiatElementTypes.CollaborativeTask_3031);
			types.add(CiatElementTypes.AbstractTask_3032);
			types.add(CiatElementTypes.Init_3033);
			types.add(CiatElementTypes.End_3034);
			types.add(CiatElementTypes.TemporalCondition_3035);
			types.add(CiatElementTypes.Notification_3036);
			types.add(CiatElementTypes.Condition_3037);
			types.add(CiatElementTypes.Init_3038);
			types.add(CiatElementTypes.End_3039);
			types.add(CiatElementTypes.TemporalCondition_3040);
			types.add(CiatElementTypes.Notification_3041);
			types.add(CiatElementTypes.Condition_3042);
			types.add(CiatElementTypes.ExclusiveEdition_3049);
			types.add(CiatElementTypes.CollaborativeVisualization_3050);
			types.add(CiatElementTypes.IndividualVisualization_3051);
			types.add(CiatElementTypes.UserTask_3052);
			types.add(CiatElementTypes.CTTAbstractTask_3053);
			types.add(CiatElementTypes.InteractiveTask_3054);
			types.add(CiatElementTypes.CTTCollaborativeTask_3055);
			types.add(CiatElementTypes.ApplicationTask_3056);
		} else if (relationshipType == CiatElementTypes.OrderIndependence_4013) {
			types.add(CiatElementTypes.IndividualTask_3006);
			types.add(CiatElementTypes.CooperativeTask_3014);
			types.add(CiatElementTypes.CollaborativeTask_3021);
			types.add(CiatElementTypes.AbstractTask_3028);
			types.add(CiatElementTypes.IndividualTask_3029);
			types.add(CiatElementTypes.CooperativeTask_3030);
			types.add(CiatElementTypes.CollaborativeTask_3031);
			types.add(CiatElementTypes.AbstractTask_3032);
			types.add(CiatElementTypes.Init_3033);
			types.add(CiatElementTypes.End_3034);
			types.add(CiatElementTypes.TemporalCondition_3035);
			types.add(CiatElementTypes.Notification_3036);
			types.add(CiatElementTypes.Condition_3037);
			types.add(CiatElementTypes.Init_3038);
			types.add(CiatElementTypes.End_3039);
			types.add(CiatElementTypes.TemporalCondition_3040);
			types.add(CiatElementTypes.Notification_3041);
			types.add(CiatElementTypes.Condition_3042);
			types.add(CiatElementTypes.ExclusiveEdition_3049);
			types.add(CiatElementTypes.CollaborativeVisualization_3050);
			types.add(CiatElementTypes.IndividualVisualization_3051);
			types.add(CiatElementTypes.UserTask_3052);
			types.add(CiatElementTypes.CTTAbstractTask_3053);
			types.add(CiatElementTypes.InteractiveTask_3054);
			types.add(CiatElementTypes.CTTCollaborativeTask_3055);
			types.add(CiatElementTypes.ApplicationTask_3056);
		} else if (relationshipType == CiatElementTypes.SuspendResume_4014) {
			types.add(CiatElementTypes.IndividualTask_3006);
			types.add(CiatElementTypes.CooperativeTask_3014);
			types.add(CiatElementTypes.CollaborativeTask_3021);
			types.add(CiatElementTypes.AbstractTask_3028);
			types.add(CiatElementTypes.IndividualTask_3029);
			types.add(CiatElementTypes.CooperativeTask_3030);
			types.add(CiatElementTypes.CollaborativeTask_3031);
			types.add(CiatElementTypes.AbstractTask_3032);
			types.add(CiatElementTypes.Init_3033);
			types.add(CiatElementTypes.End_3034);
			types.add(CiatElementTypes.TemporalCondition_3035);
			types.add(CiatElementTypes.Notification_3036);
			types.add(CiatElementTypes.Condition_3037);
			types.add(CiatElementTypes.Init_3038);
			types.add(CiatElementTypes.End_3039);
			types.add(CiatElementTypes.TemporalCondition_3040);
			types.add(CiatElementTypes.Notification_3041);
			types.add(CiatElementTypes.Condition_3042);
			types.add(CiatElementTypes.ExclusiveEdition_3049);
			types.add(CiatElementTypes.CollaborativeVisualization_3050);
			types.add(CiatElementTypes.IndividualVisualization_3051);
			types.add(CiatElementTypes.UserTask_3052);
			types.add(CiatElementTypes.CTTAbstractTask_3053);
			types.add(CiatElementTypes.InteractiveTask_3054);
			types.add(CiatElementTypes.CTTCollaborativeTask_3055);
			types.add(CiatElementTypes.ApplicationTask_3056);
		} else if (relationshipType == CiatElementTypes.ConcurrencyWithInformationPassing_4015) {
			types.add(CiatElementTypes.IndividualTask_3006);
			types.add(CiatElementTypes.CooperativeTask_3014);
			types.add(CiatElementTypes.CollaborativeTask_3021);
			types.add(CiatElementTypes.AbstractTask_3028);
			types.add(CiatElementTypes.IndividualTask_3029);
			types.add(CiatElementTypes.CooperativeTask_3030);
			types.add(CiatElementTypes.CollaborativeTask_3031);
			types.add(CiatElementTypes.AbstractTask_3032);
			types.add(CiatElementTypes.Init_3033);
			types.add(CiatElementTypes.End_3034);
			types.add(CiatElementTypes.TemporalCondition_3035);
			types.add(CiatElementTypes.Notification_3036);
			types.add(CiatElementTypes.Condition_3037);
			types.add(CiatElementTypes.Init_3038);
			types.add(CiatElementTypes.End_3039);
			types.add(CiatElementTypes.TemporalCondition_3040);
			types.add(CiatElementTypes.Notification_3041);
			types.add(CiatElementTypes.Condition_3042);
			types.add(CiatElementTypes.ExclusiveEdition_3049);
			types.add(CiatElementTypes.CollaborativeVisualization_3050);
			types.add(CiatElementTypes.IndividualVisualization_3051);
			types.add(CiatElementTypes.UserTask_3052);
			types.add(CiatElementTypes.CTTAbstractTask_3053);
			types.add(CiatElementTypes.InteractiveTask_3054);
			types.add(CiatElementTypes.CTTCollaborativeTask_3055);
			types.add(CiatElementTypes.ApplicationTask_3056);
		} else if (relationshipType == CiatElementTypes.DeterministicChoice_4016) {
			types.add(CiatElementTypes.IndividualTask_3006);
			types.add(CiatElementTypes.CooperativeTask_3014);
			types.add(CiatElementTypes.CollaborativeTask_3021);
			types.add(CiatElementTypes.AbstractTask_3028);
			types.add(CiatElementTypes.IndividualTask_3029);
			types.add(CiatElementTypes.CooperativeTask_3030);
			types.add(CiatElementTypes.CollaborativeTask_3031);
			types.add(CiatElementTypes.AbstractTask_3032);
			types.add(CiatElementTypes.Init_3033);
			types.add(CiatElementTypes.End_3034);
			types.add(CiatElementTypes.TemporalCondition_3035);
			types.add(CiatElementTypes.Notification_3036);
			types.add(CiatElementTypes.Condition_3037);
			types.add(CiatElementTypes.Init_3038);
			types.add(CiatElementTypes.End_3039);
			types.add(CiatElementTypes.TemporalCondition_3040);
			types.add(CiatElementTypes.Notification_3041);
			types.add(CiatElementTypes.Condition_3042);
			types.add(CiatElementTypes.ExclusiveEdition_3049);
			types.add(CiatElementTypes.CollaborativeVisualization_3050);
			types.add(CiatElementTypes.IndividualVisualization_3051);
			types.add(CiatElementTypes.UserTask_3052);
			types.add(CiatElementTypes.CTTAbstractTask_3053);
			types.add(CiatElementTypes.InteractiveTask_3054);
			types.add(CiatElementTypes.CTTCollaborativeTask_3055);
			types.add(CiatElementTypes.ApplicationTask_3056);
		} else if (relationshipType == CiatElementTypes.UndeterministicChoice_4017) {
			types.add(CiatElementTypes.IndividualTask_3006);
			types.add(CiatElementTypes.CooperativeTask_3014);
			types.add(CiatElementTypes.CollaborativeTask_3021);
			types.add(CiatElementTypes.AbstractTask_3028);
			types.add(CiatElementTypes.IndividualTask_3029);
			types.add(CiatElementTypes.CooperativeTask_3030);
			types.add(CiatElementTypes.CollaborativeTask_3031);
			types.add(CiatElementTypes.AbstractTask_3032);
			types.add(CiatElementTypes.Init_3033);
			types.add(CiatElementTypes.End_3034);
			types.add(CiatElementTypes.TemporalCondition_3035);
			types.add(CiatElementTypes.Notification_3036);
			types.add(CiatElementTypes.Condition_3037);
			types.add(CiatElementTypes.Init_3038);
			types.add(CiatElementTypes.End_3039);
			types.add(CiatElementTypes.TemporalCondition_3040);
			types.add(CiatElementTypes.Notification_3041);
			types.add(CiatElementTypes.Condition_3042);
			types.add(CiatElementTypes.ExclusiveEdition_3049);
			types.add(CiatElementTypes.CollaborativeVisualization_3050);
			types.add(CiatElementTypes.IndividualVisualization_3051);
			types.add(CiatElementTypes.UserTask_3052);
			types.add(CiatElementTypes.CTTAbstractTask_3053);
			types.add(CiatElementTypes.InteractiveTask_3054);
			types.add(CiatElementTypes.CTTCollaborativeTask_3055);
			types.add(CiatElementTypes.ApplicationTask_3056);
		}
		return types;
	}

}
