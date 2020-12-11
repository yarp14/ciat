/*
* 
*/
package ciat.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import ciat.diagram.edit.commands.OperationCreateCommand;
import ciat.diagram.providers.CiatElementTypes;

/**
 * @generated
 */
public class SharedObjectSharedObjectOperationsCompartmentItemSemanticEditPolicy
		extends CiatBaseItemSemanticEditPolicy {

	/**
	* @generated
	*/
	public SharedObjectSharedObjectOperationsCompartmentItemSemanticEditPolicy() {
		super(CiatElementTypes.SharedObject_3043);
	}

	/**
	* @generated
	*/
	protected Command getCreateCommand(CreateElementRequest req) {
		if (CiatElementTypes.Operation_3048 == req.getElementType()) {
			return getGEFWrapper(new OperationCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
