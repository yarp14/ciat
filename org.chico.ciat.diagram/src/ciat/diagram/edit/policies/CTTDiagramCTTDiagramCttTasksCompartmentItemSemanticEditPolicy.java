/*
* 
*/
package ciat.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import ciat.diagram.edit.commands.ApplicationTaskCreateCommand;
import ciat.diagram.edit.commands.CTTAbstractTaskCreateCommand;
import ciat.diagram.edit.commands.CTTCollaborativeTaskCreateCommand;
import ciat.diagram.edit.commands.CollaborativeVisualizationCreateCommand;
import ciat.diagram.edit.commands.ExclusiveEditionCreateCommand;
import ciat.diagram.edit.commands.IndividualVisualizationCreateCommand;
import ciat.diagram.edit.commands.InteractiveTaskCreateCommand;
import ciat.diagram.edit.commands.UserTaskCreateCommand;
import ciat.diagram.providers.CiatElementTypes;

/**
 * @generated
 */
public class CTTDiagramCTTDiagramCttTasksCompartmentItemSemanticEditPolicy extends CiatBaseItemSemanticEditPolicy {

	/**
	* @generated
	*/
	public CTTDiagramCTTDiagramCttTasksCompartmentItemSemanticEditPolicy() {
		super(CiatElementTypes.CTTDiagram_2004);
	}

	/**
	* @generated
	*/
	protected Command getCreateCommand(CreateElementRequest req) {
		if (CiatElementTypes.ExclusiveEdition_3049 == req.getElementType()) {
			return getGEFWrapper(new ExclusiveEditionCreateCommand(req));
		}
		if (CiatElementTypes.CollaborativeVisualization_3050 == req.getElementType()) {
			return getGEFWrapper(new CollaborativeVisualizationCreateCommand(req));
		}
		if (CiatElementTypes.IndividualVisualization_3051 == req.getElementType()) {
			return getGEFWrapper(new IndividualVisualizationCreateCommand(req));
		}
		if (CiatElementTypes.UserTask_3052 == req.getElementType()) {
			return getGEFWrapper(new UserTaskCreateCommand(req));
		}
		if (CiatElementTypes.CTTAbstractTask_3053 == req.getElementType()) {
			return getGEFWrapper(new CTTAbstractTaskCreateCommand(req));
		}
		if (CiatElementTypes.InteractiveTask_3054 == req.getElementType()) {
			return getGEFWrapper(new InteractiveTaskCreateCommand(req));
		}
		if (CiatElementTypes.CTTCollaborativeTask_3055 == req.getElementType()) {
			return getGEFWrapper(new CTTCollaborativeTaskCreateCommand(req));
		}
		if (CiatElementTypes.ApplicationTask_3056 == req.getElementType()) {
			return getGEFWrapper(new ApplicationTaskCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
