/*
 * 
 */
package ciat.diagram.edit.commands;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.common.core.command.CommandResult;
import org.eclipse.gmf.runtime.emf.type.core.commands.EditElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientRelationshipRequest;

import ciat.CIATDiagram;
import ciat.ShAggregationLink;
import ciat.SharedObject;
import ciat.diagram.edit.policies.CiatBaseItemSemanticEditPolicy;

/**
 * @generated
 */
public class ShAggregationLinkReorientCommand extends EditElementCommand {

	/**
	* @generated
	*/
	private final int reorientDirection;

	/**
	* @generated
	*/
	private final EObject oldEnd;

	/**
	* @generated
	*/
	private final EObject newEnd;

	/**
	* @generated
	*/
	public ShAggregationLinkReorientCommand(ReorientRelationshipRequest request) {
		super(request.getLabel(), request.getRelationship(), request);
		reorientDirection = request.getDirection();
		oldEnd = request.getOldRelationshipEnd();
		newEnd = request.getNewRelationshipEnd();
	}

	/**
	* @generated
	*/
	public boolean canExecute() {
		if (false == getElementToEdit() instanceof ShAggregationLink) {
			return false;
		}
		if (reorientDirection == ReorientRelationshipRequest.REORIENT_SOURCE) {
			return canReorientSource();
		}
		if (reorientDirection == ReorientRelationshipRequest.REORIENT_TARGET) {
			return canReorientTarget();
		}
		return false;
	}

	/**
	* @generated
	*/
	protected boolean canReorientSource() {
		if (!(oldEnd instanceof SharedObject && newEnd instanceof SharedObject)) {
			return false;
		}
		SharedObject target = getLink().getTarget();
		if (!(getLink().eContainer() instanceof CIATDiagram)) {
			return false;
		}
		CIATDiagram container = (CIATDiagram) getLink().eContainer();
		return CiatBaseItemSemanticEditPolicy.getLinkConstraints().canExistShAggregationLink_4006(container, getLink(),
				getNewSource(), target);
	}

	/**
	* @generated
	*/
	protected boolean canReorientTarget() {
		if (!(oldEnd instanceof SharedObject && newEnd instanceof SharedObject)) {
			return false;
		}
		SharedObject source = getLink().getSource();
		if (!(getLink().eContainer() instanceof CIATDiagram)) {
			return false;
		}
		CIATDiagram container = (CIATDiagram) getLink().eContainer();
		return CiatBaseItemSemanticEditPolicy.getLinkConstraints().canExistShAggregationLink_4006(container, getLink(),
				source, getNewTarget());
	}

	/**
	* @generated
	*/
	protected CommandResult doExecuteWithResult(IProgressMonitor monitor, IAdaptable info) throws ExecutionException {
		if (!canExecute()) {
			throw new ExecutionException("Invalid arguments in reorient link command"); //$NON-NLS-1$
		}
		if (reorientDirection == ReorientRelationshipRequest.REORIENT_SOURCE) {
			return reorientSource();
		}
		if (reorientDirection == ReorientRelationshipRequest.REORIENT_TARGET) {
			return reorientTarget();
		}
		throw new IllegalStateException();
	}

	/**
	* @generated
	*/
	protected CommandResult reorientSource() throws ExecutionException {
		getLink().setSource(getNewSource());
		return CommandResult.newOKCommandResult(getLink());
	}

	/**
	* @generated
	*/
	protected CommandResult reorientTarget() throws ExecutionException {
		getLink().setTarget(getNewTarget());
		return CommandResult.newOKCommandResult(getLink());
	}

	/**
	* @generated
	*/
	protected ShAggregationLink getLink() {
		return (ShAggregationLink) getElementToEdit();
	}

	/**
	* @generated
	*/
	protected SharedObject getOldSource() {
		return (SharedObject) oldEnd;
	}

	/**
	* @generated
	*/
	protected SharedObject getNewSource() {
		return (SharedObject) newEnd;
	}

	/**
	* @generated
	*/
	protected SharedObject getOldTarget() {
		return (SharedObject) oldEnd;
	}

	/**
	* @generated
	*/
	protected SharedObject getNewTarget() {
		return (SharedObject) newEnd;
	}
}
