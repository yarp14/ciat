/*
* 
*/
package ciat.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import ciat.diagram.edit.commands.Object2CreateCommand;
import ciat.diagram.providers.CiatElementTypes;

/**
 * @generated
 */
public class CooperativeTaskCooperativeTaskTaskObjectsCompartment2ItemSemanticEditPolicy
		extends CiatBaseItemSemanticEditPolicy {

	/**
	* @generated
	*/
	public CooperativeTaskCooperativeTaskTaskObjectsCompartment2ItemSemanticEditPolicy() {
		super(CiatElementTypes.CooperativeTask_3030);
	}

	/**
	* @generated
	*/
	protected Command getCreateCommand(CreateElementRequest req) {
		if (CiatElementTypes.Object_3020 == req.getElementType()) {
			return getGEFWrapper(new Object2CreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
