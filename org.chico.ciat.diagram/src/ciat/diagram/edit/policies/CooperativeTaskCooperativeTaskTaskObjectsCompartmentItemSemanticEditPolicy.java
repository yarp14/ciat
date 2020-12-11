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
public class CooperativeTaskCooperativeTaskTaskObjectsCompartmentItemSemanticEditPolicy
		extends CiatBaseItemSemanticEditPolicy {

	/**
	* @generated
	*/
	public CooperativeTaskCooperativeTaskTaskObjectsCompartmentItemSemanticEditPolicy() {
		super(CiatElementTypes.CooperativeTask_3014);
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
