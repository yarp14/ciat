/*
* 
*/
package ciat.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import ciat.diagram.edit.commands.ActorCreateCommand;
import ciat.diagram.edit.commands.GroupCreateCommand;
import ciat.diagram.edit.commands.RolCreateCommand;
import ciat.diagram.edit.commands.SoftwareAgentCreateCommand;
import ciat.diagram.edit.commands.TeamCreateCommand;
import ciat.diagram.providers.CiatElementTypes;

/**
 * @generated
 */
public class SociogramSociogramItsSociogramNodesCompartmentItemSemanticEditPolicy
		extends CiatBaseItemSemanticEditPolicy {

	/**
	* @generated
	*/
	public SociogramSociogramItsSociogramNodesCompartmentItemSemanticEditPolicy() {
		super(CiatElementTypes.Sociogram_2001);
	}

	/**
	* @generated
	*/
	protected Command getCreateCommand(CreateElementRequest req) {
		if (CiatElementTypes.Rol_3001 == req.getElementType()) {
			return getGEFWrapper(new RolCreateCommand(req));
		}
		if (CiatElementTypes.Actor_3002 == req.getElementType()) {
			return getGEFWrapper(new ActorCreateCommand(req));
		}
		if (CiatElementTypes.SoftwareAgent_3003 == req.getElementType()) {
			return getGEFWrapper(new SoftwareAgentCreateCommand(req));
		}
		if (CiatElementTypes.Team_3004 == req.getElementType()) {
			return getGEFWrapper(new TeamCreateCommand(req));
		}
		if (CiatElementTypes.Group_3005 == req.getElementType()) {
			return getGEFWrapper(new GroupCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
