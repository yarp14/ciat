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
public class EnablingItemSemanticEditPolicy extends CiatBaseItemSemanticEditPolicy {

	/**
	* @generated
	*/
	public EnablingItemSemanticEditPolicy() {
		super(CiatElementTypes.Enabling_4008);
	}

	/**
	* @generated
	*/
	protected Command getDestroyElementCommand(DestroyElementRequest req) {
		return getGEFWrapper(new DestroyElementCommand(req));
	}

}
