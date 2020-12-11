/*
* 
*/
package ciat.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import ciat.diagram.edit.commands.ObjectCreateCommand;
import ciat.diagram.providers.CiatElementTypes;

/**
 * @generated
 */
public class IndividualTaskIndividualTaskTaskObjectsCompartmentItemSemanticEditPolicy
		extends CiatBaseItemSemanticEditPolicy {

	/**
	* @generated
	*/
	public IndividualTaskIndividualTaskTaskObjectsCompartmentItemSemanticEditPolicy() {
		super(CiatElementTypes.IndividualTask_3006);
	}

	/**
	* @generated
	*/
	protected Command getCreateCommand(CreateElementRequest req) {
		if (CiatElementTypes.Object_3013 == req.getElementType()) {
			return getGEFWrapper(new ObjectCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
