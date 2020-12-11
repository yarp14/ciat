/*
* 
*/
package ciat.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import ciat.diagram.edit.commands.AttributeCreateCommand;
import ciat.diagram.providers.CiatElementTypes;

/**
 * @generated
 */
public class SharedObjectSharedObjectAttributesCompartmentItemSemanticEditPolicy
		extends CiatBaseItemSemanticEditPolicy {

	/**
	* @generated
	*/
	public SharedObjectSharedObjectAttributesCompartmentItemSemanticEditPolicy() {
		super(CiatElementTypes.SharedObject_3043);
	}

	/**
	* @generated
	*/
	protected Command getCreateCommand(CreateElementRequest req) {
		if (CiatElementTypes.Attribute_3047 == req.getElementType()) {
			return getGEFWrapper(new AttributeCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
