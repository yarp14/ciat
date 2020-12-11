/*
* 
*/
package ciat.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import ciat.diagram.edit.commands.Object3CreateCommand;
import ciat.diagram.providers.CiatElementTypes;

/**
 * @generated
 */
public class CollaborativeTaskCollaborativeTaskTaskObjectsCompartment2ItemSemanticEditPolicy
		extends CiatBaseItemSemanticEditPolicy {

	/**
	* @generated
	*/
	public CollaborativeTaskCollaborativeTaskTaskObjectsCompartment2ItemSemanticEditPolicy() {
		super(CiatElementTypes.CollaborativeTask_3031);
	}

	/**
	* @generated
	*/
	protected Command getCreateCommand(CreateElementRequest req) {
		if (CiatElementTypes.Object_3027 == req.getElementType()) {
			return getGEFWrapper(new Object3CreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
