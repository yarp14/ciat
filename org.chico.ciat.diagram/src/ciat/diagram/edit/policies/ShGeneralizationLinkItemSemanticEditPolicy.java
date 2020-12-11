/*
* 
*/
package ciat.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyElementRequest;

import ciat.diagram.providers.CiatElementTypes;

/**
 * @generated
 */
public class ShGeneralizationLinkItemSemanticEditPolicy extends CiatBaseItemSemanticEditPolicy {

	/**
	* @generated
	*/
	public ShGeneralizationLinkItemSemanticEditPolicy() {
		super(CiatElementTypes.ShGeneralizationLink_4005);
	}

	/**
	* @generated
	*/
	protected Command getDestroyElementCommand(DestroyElementRequest req) {
		return getGEFWrapper(new DestroyElementCommand(req));
	}

}
