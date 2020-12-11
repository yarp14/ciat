/*
* 
*/
package ciat.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import ciat.diagram.edit.commands.Actor4CreateCommand;
import ciat.diagram.edit.commands.Group4CreateCommand;
import ciat.diagram.edit.commands.Rol4CreateCommand;
import ciat.diagram.edit.commands.SoftwareAgent4CreateCommand;
import ciat.diagram.edit.commands.Team4CreateCommand;
import ciat.diagram.providers.CiatElementTypes;

/**
 * @generated
 */
public class CollaborativeTaskCollaborativeTaskTaskRolesCompartment2ItemSemanticEditPolicy
		extends CiatBaseItemSemanticEditPolicy {

	/**
	* @generated
	*/
	public CollaborativeTaskCollaborativeTaskTaskRolesCompartment2ItemSemanticEditPolicy() {
		super(CiatElementTypes.CollaborativeTask_3031);
	}

	/**
	* @generated
	*/
	protected Command getCreateCommand(CreateElementRequest req) {
		if (CiatElementTypes.Rol_3022 == req.getElementType()) {
			return getGEFWrapper(new Rol4CreateCommand(req));
		}
		if (CiatElementTypes.Actor_3023 == req.getElementType()) {
			return getGEFWrapper(new Actor4CreateCommand(req));
		}
		if (CiatElementTypes.SoftwareAgent_3024 == req.getElementType()) {
			return getGEFWrapper(new SoftwareAgent4CreateCommand(req));
		}
		if (CiatElementTypes.Team_3025 == req.getElementType()) {
			return getGEFWrapper(new Team4CreateCommand(req));
		}
		if (CiatElementTypes.Group_3026 == req.getElementType()) {
			return getGEFWrapper(new Group4CreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
