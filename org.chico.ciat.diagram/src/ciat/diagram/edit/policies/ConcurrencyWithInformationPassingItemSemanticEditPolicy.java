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
public class ConcurrencyWithInformationPassingItemSemanticEditPolicy extends CiatBaseItemSemanticEditPolicy {

	/**
	* @generated
	*/
	public ConcurrencyWithInformationPassingItemSemanticEditPolicy() {
		super(CiatElementTypes.ConcurrencyWithInformationPassing_4015);
	}

	/**
	* @generated
	*/
	protected Command getDestroyElementCommand(DestroyElementRequest req) {
		return getGEFWrapper(new DestroyElementCommand(req));
	}

}
