/*
* 
*/
package ciat.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import ciat.diagram.edit.commands.AbstractTask2CreateCommand;
import ciat.diagram.edit.commands.CollaborativeTask2CreateCommand;
import ciat.diagram.edit.commands.ConditionCreateCommand;
import ciat.diagram.edit.commands.CooperativeTask2CreateCommand;
import ciat.diagram.edit.commands.EndCreateCommand;
import ciat.diagram.edit.commands.IndividualTask2CreateCommand;
import ciat.diagram.edit.commands.InitCreateCommand;
import ciat.diagram.edit.commands.NotificationCreateCommand;
import ciat.diagram.edit.commands.TemporalConditionCreateCommand;
import ciat.diagram.providers.CiatElementTypes;

/**
 * @generated
 */
public class AbstractTaskAbstractTaskProcessNodesCompartmentItemSemanticEditPolicy
		extends CiatBaseItemSemanticEditPolicy {

	/**
	* @generated
	*/
	public AbstractTaskAbstractTaskProcessNodesCompartmentItemSemanticEditPolicy() {
		super(CiatElementTypes.AbstractTask_3028);
	}

	/**
	* @generated
	*/
	protected Command getCreateCommand(CreateElementRequest req) {
		if (CiatElementTypes.IndividualTask_3029 == req.getElementType()) {
			return getGEFWrapper(new IndividualTask2CreateCommand(req));
		}
		if (CiatElementTypes.CooperativeTask_3030 == req.getElementType()) {
			return getGEFWrapper(new CooperativeTask2CreateCommand(req));
		}
		if (CiatElementTypes.CollaborativeTask_3031 == req.getElementType()) {
			return getGEFWrapper(new CollaborativeTask2CreateCommand(req));
		}
		if (CiatElementTypes.AbstractTask_3032 == req.getElementType()) {
			return getGEFWrapper(new AbstractTask2CreateCommand(req));
		}
		if (CiatElementTypes.Init_3033 == req.getElementType()) {
			return getGEFWrapper(new InitCreateCommand(req));
		}
		if (CiatElementTypes.End_3034 == req.getElementType()) {
			return getGEFWrapper(new EndCreateCommand(req));
		}
		if (CiatElementTypes.TemporalCondition_3035 == req.getElementType()) {
			return getGEFWrapper(new TemporalConditionCreateCommand(req));
		}
		if (CiatElementTypes.Notification_3036 == req.getElementType()) {
			return getGEFWrapper(new NotificationCreateCommand(req));
		}
		if (CiatElementTypes.Condition_3037 == req.getElementType()) {
			return getGEFWrapper(new ConditionCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
