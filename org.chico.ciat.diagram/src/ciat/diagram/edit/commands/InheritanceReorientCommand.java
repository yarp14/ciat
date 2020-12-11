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
import ciat.Inheritance;
import ciat.SociogramNode;
import ciat.diagram.edit.policies.CiatBaseItemSemanticEditPolicy;

/**
 * @generated
 */
public class InheritanceReorientCommand extends EditElementCommand {

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
	public InheritanceReorientCommand(ReorientRelationshipRequest request) {
		super(request.getLabel(), request.getRelationship(), request);
		reorientDirection = request.getDirection();
		oldEnd = request.getOldRelationshipEnd();
		newEnd = request.getNewRelationshipEnd();
	}

	/**
	* @generated
	*/
	public boolean canExecute() {
		if (false == getElementToEdit() instanceof Inheritance) {
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
		if (!(oldEnd instanceof SociogramNode && newEnd instanceof SociogramNode)) {
			return false;
		}
		SociogramNode target = getLink().getTarget();
		if (!(getLink().eContainer() instanceof CIATDiagram)) {
			return false;
		}
		CIATDiagram container = (CIATDiagram) getLink().eContainer();
		return CiatBaseItemSemanticEditPolicy.getLinkConstraints().canExistInheritance_4001(container, getLink(),
				getNewSource(), target);
	}

	/**
	* @generated
	*/
	protected boolean canReorientTarget() {
		if (!(oldEnd instanceof SociogramNode && newEnd instanceof SociogramNode)) {
			return false;
		}
		SociogramNode source = getLink().getSource();
		if (!(getLink().eContainer() instanceof CIATDiagram)) {
			return false;
		}
		CIATDiagram container = (CIATDiagram) getLink().eContainer();
		return CiatBaseItemSemanticEditPolicy.getLinkConstraints().canExistInheritance_4001(container, getLink(),
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
	protected Inheritance getLink() {
		return (Inheritance) getElementToEdit();
	}

	/**
	* @generated
	*/
	protected SociogramNode getOldSource() {
		return (SociogramNode) oldEnd;
	}

	/**
	* @generated
	*/
	protected SociogramNode getNewSource() {
		return (SociogramNode) newEnd;
	}

	/**
	* @generated
	*/
	protected SociogramNode getOldTarget() {
		return (SociogramNode) oldEnd;
	}

	/**
	* @generated
	*/
	protected SociogramNode getNewTarget() {
		return (SociogramNode) newEnd;
	}
}
