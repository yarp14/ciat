/*
* 
*/
package ciat.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import ciat.diagram.edit.commands.Actor3CreateCommand;
import ciat.diagram.edit.commands.Group3CreateCommand;
import ciat.diagram.edit.commands.Rol3CreateCommand;
import ciat.diagram.edit.commands.SoftwareAgent3CreateCommand;
import ciat.diagram.edit.commands.Team3CreateCommand;
import ciat.diagram.providers.CiatElementTypes;

/**
 * @generated
 */
public class CooperativeTaskCooperativeTaskTaskRolesCompartment2ItemSemanticEditPolicy
		extends CiatBaseItemSemanticEditPolicy {

	/**
	* @generated
	*/
	public CooperativeTaskCooperativeTaskTaskRolesCompartment2ItemSemanticEditPolicy() {
		super(CiatElementTypes.CooperativeTask_3030);
	}

	/**
	* @generated
	*/
	protected Command getCreateCommand(CreateElementRequest req) {
		if (CiatElementTypes.Rol_3015 == req.getElementType()) {
			return getGEFWrapper(new Rol3CreateCommand(req));
		}
		if (CiatElementTypes.Actor_3016 == req.getElementType()) {
			return getGEFWrapper(new Actor3CreateCommand(req));
		}
		if (CiatElementTypes.SoftwareAgent_3017 == req.getElementType()) {
			return getGEFWrapper(new SoftwareAgent3CreateCommand(req));
		}
		if (CiatElementTypes.Team_3018 == req.getElementType()) {
			return getGEFWrapper(new Team3CreateCommand(req));
		}
		if (CiatElementTypes.Group_3019 == req.getElementType()) {
			return getGEFWrapper(new Group3CreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
