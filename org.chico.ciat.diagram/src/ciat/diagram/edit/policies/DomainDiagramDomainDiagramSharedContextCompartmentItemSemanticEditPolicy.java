/*
* 
*/
package ciat.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import ciat.diagram.edit.commands.SharedObjectCreateCommand;
import ciat.diagram.providers.CiatElementTypes;

/**
 * @generated
 */
public class DomainDiagramDomainDiagramSharedContextCompartmentItemSemanticEditPolicy
		extends CiatBaseItemSemanticEditPolicy {

	/**
	* @generated
	*/
	public DomainDiagramDomainDiagramSharedContextCompartmentItemSemanticEditPolicy() {
		super(CiatElementTypes.DomainDiagram_2003);
	}

	/**
	* @generated
	*/
	protected Command getCreateCommand(CreateElementRequest req) {
		if (CiatElementTypes.SharedObject_3043 == req.getElementType()) {
			return getGEFWrapper(new SharedObjectCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
