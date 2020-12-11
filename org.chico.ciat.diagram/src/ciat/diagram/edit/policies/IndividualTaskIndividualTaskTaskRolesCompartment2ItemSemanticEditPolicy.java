/*
* 
*/
package ciat.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import ciat.diagram.edit.commands.Actor2CreateCommand;
import ciat.diagram.edit.commands.Group2CreateCommand;
import ciat.diagram.edit.commands.Rol2CreateCommand;
import ciat.diagram.edit.commands.SoftwareAgent2CreateCommand;
import ciat.diagram.edit.commands.Team2CreateCommand;
import ciat.diagram.providers.CiatElementTypes;

/**
 * @generated
 */
public class IndividualTaskIndividualTaskTaskRolesCompartment2ItemSemanticEditPolicy
		extends CiatBaseItemSemanticEditPolicy {

	/**
	* @generated
	*/
	public IndividualTaskIndividualTaskTaskRolesCompartment2ItemSemanticEditPolicy() {
		super(CiatElementTypes.IndividualTask_3029);
	}

	/**
	* @generated
	*/
	protected Command getCreateCommand(CreateElementRequest req) {
		if (CiatElementTypes.Rol_3007 == req.getElementType()) {
			return getGEFWrapper(new Rol2CreateCommand(req));
		}
		if (CiatElementTypes.Actor_3008 == req.getElementType()) {
			return getGEFWrapper(new Actor2CreateCommand(req));
		}
		if (CiatElementTypes.SoftwareAgent_3009 == req.getElementType()) {
			return getGEFWrapper(new SoftwareAgent2CreateCommand(req));
		}
		if (CiatElementTypes.Team_3010 == req.getElementType()) {
			return getGEFWrapper(new Team2CreateCommand(req));
		}
		if (CiatElementTypes.Group_3011 == req.getElementType()) {
			return getGEFWrapper(new Group2CreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
