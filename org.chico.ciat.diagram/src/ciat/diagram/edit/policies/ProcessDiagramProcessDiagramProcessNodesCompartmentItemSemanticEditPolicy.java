/*
* 
*/
package ciat.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import ciat.diagram.edit.commands.AbstractTaskCreateCommand;
import ciat.diagram.edit.commands.CollaborativeTaskCreateCommand;
import ciat.diagram.edit.commands.Condition2CreateCommand;
import ciat.diagram.edit.commands.CooperativeTaskCreateCommand;
import ciat.diagram.edit.commands.End2CreateCommand;
import ciat.diagram.edit.commands.IndividualTaskCreateCommand;
import ciat.diagram.edit.commands.Init2CreateCommand;
import ciat.diagram.edit.commands.Notification2CreateCommand;
import ciat.diagram.edit.commands.TemporalCondition2CreateCommand;
import ciat.diagram.providers.CiatElementTypes;

/**
 * @generated
 */
public class ProcessDiagramProcessDiagramProcessNodesCompartmentItemSemanticEditPolicy
		extends CiatBaseItemSemanticEditPolicy {

	/**
	* @generated
	*/
	public ProcessDiagramProcessDiagramProcessNodesCompartmentItemSemanticEditPolicy() {
		super(CiatElementTypes.ProcessDiagram_2002);
	}

	/**
	* @generated
	*/
	protected Command getCreateCommand(CreateElementRequest req) {
		if (CiatElementTypes.IndividualTask_3006 == req.getElementType()) {
			return getGEFWrapper(new IndividualTaskCreateCommand(req));
		}
		if (CiatElementTypes.CooperativeTask_3014 == req.getElementType()) {
			return getGEFWrapper(new CooperativeTaskCreateCommand(req));
		}
		if (CiatElementTypes.CollaborativeTask_3021 == req.getElementType()) {
			return getGEFWrapper(new CollaborativeTaskCreateCommand(req));
		}
		if (CiatElementTypes.AbstractTask_3028 == req.getElementType()) {
			return getGEFWrapper(new AbstractTaskCreateCommand(req));
		}
		if (CiatElementTypes.Init_3038 == req.getElementType()) {
			return getGEFWrapper(new Init2CreateCommand(req));
		}
		if (CiatElementTypes.End_3039 == req.getElementType()) {
			return getGEFWrapper(new End2CreateCommand(req));
		}
		if (CiatElementTypes.TemporalCondition_3040 == req.getElementType()) {
			return getGEFWrapper(new TemporalCondition2CreateCommand(req));
		}
		if (CiatElementTypes.Notification_3041 == req.getElementType()) {
			return getGEFWrapper(new Notification2CreateCommand(req));
		}
		if (CiatElementTypes.Condition_3042 == req.getElementType()) {
			return getGEFWrapper(new Condition2CreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
