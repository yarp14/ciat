/*
* 
*/
package ciat.diagram.edit.policies;

import java.util.Iterator;

import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.diagram.core.commands.DeleteCommand;
import org.eclipse.gmf.runtime.emf.commands.core.command.CompositeTransactionalCommand;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateRelationshipRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyElementRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientRelationshipRequest;
import org.eclipse.gmf.runtime.notation.Edge;
import org.eclipse.gmf.runtime.notation.View;

import ciat.diagram.edit.commands.AggregationCreateCommand;
import ciat.diagram.edit.commands.AggregationReorientCommand;
import ciat.diagram.edit.commands.ConcurrencyWithInformationPassingCreateCommand;
import ciat.diagram.edit.commands.ConcurrencyWithInformationPassingReorientCommand;
import ciat.diagram.edit.commands.DeterministicChoiceCreateCommand;
import ciat.diagram.edit.commands.DeterministicChoiceReorientCommand;
import ciat.diagram.edit.commands.DisablingCreateCommand;
import ciat.diagram.edit.commands.DisablingReorientCommand;
import ciat.diagram.edit.commands.DisablingWithInformationPassingCreateCommand;
import ciat.diagram.edit.commands.DisablingWithInformationPassingReorientCommand;
import ciat.diagram.edit.commands.EnablingCreateCommand;
import ciat.diagram.edit.commands.EnablingReorientCommand;
import ciat.diagram.edit.commands.EnablingWithInformationPassingCreateCommand;
import ciat.diagram.edit.commands.EnablingWithInformationPassingReorientCommand;
import ciat.diagram.edit.commands.IndependentConcurrencyCreateCommand;
import ciat.diagram.edit.commands.IndependentConcurrencyReorientCommand;
import ciat.diagram.edit.commands.OrderIndependenceCreateCommand;
import ciat.diagram.edit.commands.OrderIndependenceReorientCommand;
import ciat.diagram.edit.commands.SuspendResumeCreateCommand;
import ciat.diagram.edit.commands.SuspendResumeReorientCommand;
import ciat.diagram.edit.commands.UndeterministicChoiceCreateCommand;
import ciat.diagram.edit.commands.UndeterministicChoiceReorientCommand;
import ciat.diagram.edit.parts.AggregationEditPart;
import ciat.diagram.edit.parts.ConcurrencyWithInformationPassingEditPart;
import ciat.diagram.edit.parts.DeterministicChoiceEditPart;
import ciat.diagram.edit.parts.DisablingEditPart;
import ciat.diagram.edit.parts.DisablingWithInformationPassingEditPart;
import ciat.diagram.edit.parts.EnablingEditPart;
import ciat.diagram.edit.parts.EnablingWithInformationPassingEditPart;
import ciat.diagram.edit.parts.IndependentConcurrencyEditPart;
import ciat.diagram.edit.parts.OrderIndependenceEditPart;
import ciat.diagram.edit.parts.SuspendResumeEditPart;
import ciat.diagram.edit.parts.UndeterministicChoiceEditPart;
import ciat.diagram.part.CiatVisualIDRegistry;
import ciat.diagram.providers.CiatElementTypes;

/**
 * @generated
 */
public class TemporalCondition2ItemSemanticEditPolicy extends CiatBaseItemSemanticEditPolicy {

	/**
	* @generated
	*/
	public TemporalCondition2ItemSemanticEditPolicy() {
		super(CiatElementTypes.TemporalCondition_3040);
	}

	/**
	* @generated
	*/
	protected Command getDestroyElementCommand(DestroyElementRequest req) {
		View view = (View) getHost().getModel();
		CompositeTransactionalCommand cmd = new CompositeTransactionalCommand(getEditingDomain(), null);
		cmd.setTransactionNestingEnabled(false);
		for (Iterator<?> it = view.getTargetEdges().iterator(); it.hasNext();) {
			Edge incomingLink = (Edge) it.next();
			if (CiatVisualIDRegistry.getVisualID(incomingLink) == AggregationEditPart.VISUAL_ID) {
				DestroyElementRequest r = new DestroyElementRequest(incomingLink.getElement(), false);
				cmd.add(new DestroyElementCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), incomingLink));
				continue;
			}
			if (CiatVisualIDRegistry.getVisualID(incomingLink) == EnablingEditPart.VISUAL_ID) {
				DestroyElementRequest r = new DestroyElementRequest(incomingLink.getElement(), false);
				cmd.add(new DestroyElementCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), incomingLink));
				continue;
			}
			if (CiatVisualIDRegistry.getVisualID(incomingLink) == DisablingEditPart.VISUAL_ID) {
				DestroyElementRequest r = new DestroyElementRequest(incomingLink.getElement(), false);
				cmd.add(new DestroyElementCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), incomingLink));
				continue;
			}
			if (CiatVisualIDRegistry.getVisualID(incomingLink) == EnablingWithInformationPassingEditPart.VISUAL_ID) {
				DestroyElementRequest r = new DestroyElementRequest(incomingLink.getElement(), false);
				cmd.add(new DestroyElementCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), incomingLink));
				continue;
			}
			if (CiatVisualIDRegistry.getVisualID(incomingLink) == DisablingWithInformationPassingEditPart.VISUAL_ID) {
				DestroyElementRequest r = new DestroyElementRequest(incomingLink.getElement(), false);
				cmd.add(new DestroyElementCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), incomingLink));
				continue;
			}
			if (CiatVisualIDRegistry.getVisualID(incomingLink) == IndependentConcurrencyEditPart.VISUAL_ID) {
				DestroyElementRequest r = new DestroyElementRequest(incomingLink.getElement(), false);
				cmd.add(new DestroyElementCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), incomingLink));
				continue;
			}
			if (CiatVisualIDRegistry.getVisualID(incomingLink) == OrderIndependenceEditPart.VISUAL_ID) {
				DestroyElementRequest r = new DestroyElementRequest(incomingLink.getElement(), false);
				cmd.add(new DestroyElementCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), incomingLink));
				continue;
			}
			if (CiatVisualIDRegistry.getVisualID(incomingLink) == SuspendResumeEditPart.VISUAL_ID) {
				DestroyElementRequest r = new DestroyElementRequest(incomingLink.getElement(), false);
				cmd.add(new DestroyElementCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), incomingLink));
				continue;
			}
			if (CiatVisualIDRegistry.getVisualID(incomingLink) == ConcurrencyWithInformationPassingEditPart.VISUAL_ID) {
				DestroyElementRequest r = new DestroyElementRequest(incomingLink.getElement(), false);
				cmd.add(new DestroyElementCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), incomingLink));
				continue;
			}
			if (CiatVisualIDRegistry.getVisualID(incomingLink) == DeterministicChoiceEditPart.VISUAL_ID) {
				DestroyElementRequest r = new DestroyElementRequest(incomingLink.getElement(), false);
				cmd.add(new DestroyElementCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), incomingLink));
				continue;
			}
			if (CiatVisualIDRegistry.getVisualID(incomingLink) == UndeterministicChoiceEditPart.VISUAL_ID) {
				DestroyElementRequest r = new DestroyElementRequest(incomingLink.getElement(), false);
				cmd.add(new DestroyElementCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), incomingLink));
				continue;
			}
		}
		for (Iterator<?> it = view.getSourceEdges().iterator(); it.hasNext();) {
			Edge outgoingLink = (Edge) it.next();
			if (CiatVisualIDRegistry.getVisualID(outgoingLink) == AggregationEditPart.VISUAL_ID) {
				DestroyElementRequest r = new DestroyElementRequest(outgoingLink.getElement(), false);
				cmd.add(new DestroyElementCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), outgoingLink));
				continue;
			}
			if (CiatVisualIDRegistry.getVisualID(outgoingLink) == EnablingEditPart.VISUAL_ID) {
				DestroyElementRequest r = new DestroyElementRequest(outgoingLink.getElement(), false);
				cmd.add(new DestroyElementCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), outgoingLink));
				continue;
			}
			if (CiatVisualIDRegistry.getVisualID(outgoingLink) == DisablingEditPart.VISUAL_ID) {
				DestroyElementRequest r = new DestroyElementRequest(outgoingLink.getElement(), false);
				cmd.add(new DestroyElementCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), outgoingLink));
				continue;
			}
			if (CiatVisualIDRegistry.getVisualID(outgoingLink) == EnablingWithInformationPassingEditPart.VISUAL_ID) {
				DestroyElementRequest r = new DestroyElementRequest(outgoingLink.getElement(), false);
				cmd.add(new DestroyElementCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), outgoingLink));
				continue;
			}
			if (CiatVisualIDRegistry.getVisualID(outgoingLink) == DisablingWithInformationPassingEditPart.VISUAL_ID) {
				DestroyElementRequest r = new DestroyElementRequest(outgoingLink.getElement(), false);
				cmd.add(new DestroyElementCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), outgoingLink));
				continue;
			}
			if (CiatVisualIDRegistry.getVisualID(outgoingLink) == IndependentConcurrencyEditPart.VISUAL_ID) {
				DestroyElementRequest r = new DestroyElementRequest(outgoingLink.getElement(), false);
				cmd.add(new DestroyElementCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), outgoingLink));
				continue;
			}
			if (CiatVisualIDRegistry.getVisualID(outgoingLink) == OrderIndependenceEditPart.VISUAL_ID) {
				DestroyElementRequest r = new DestroyElementRequest(outgoingLink.getElement(), false);
				cmd.add(new DestroyElementCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), outgoingLink));
				continue;
			}
			if (CiatVisualIDRegistry.getVisualID(outgoingLink) == SuspendResumeEditPart.VISUAL_ID) {
				DestroyElementRequest r = new DestroyElementRequest(outgoingLink.getElement(), false);
				cmd.add(new DestroyElementCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), outgoingLink));
				continue;
			}
			if (CiatVisualIDRegistry.getVisualID(outgoingLink) == ConcurrencyWithInformationPassingEditPart.VISUAL_ID) {
				DestroyElementRequest r = new DestroyElementRequest(outgoingLink.getElement(), false);
				cmd.add(new DestroyElementCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), outgoingLink));
				continue;
			}
			if (CiatVisualIDRegistry.getVisualID(outgoingLink) == DeterministicChoiceEditPart.VISUAL_ID) {
				DestroyElementRequest r = new DestroyElementRequest(outgoingLink.getElement(), false);
				cmd.add(new DestroyElementCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), outgoingLink));
				continue;
			}
			if (CiatVisualIDRegistry.getVisualID(outgoingLink) == UndeterministicChoiceEditPart.VISUAL_ID) {
				DestroyElementRequest r = new DestroyElementRequest(outgoingLink.getElement(), false);
				cmd.add(new DestroyElementCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), outgoingLink));
				continue;
			}
		}
		EAnnotation annotation = view.getEAnnotation("Shortcut"); //$NON-NLS-1$
		if (annotation == null) {
			// there are indirectly referenced children, need extra commands: false
			addDestroyShortcutsCommand(cmd, view);
			// delete host element
			cmd.add(new DestroyElementCommand(req));
		} else {
			cmd.add(new DeleteCommand(getEditingDomain(), view));
		}
		return getGEFWrapper(cmd.reduce());
	}

	/**
	 * @generated
	 */
	protected Command getCreateRelationshipCommand(CreateRelationshipRequest req) {
		Command command = req.getTarget() == null ? getStartCreateRelationshipCommand(req)
				: getCompleteCreateRelationshipCommand(req);
		return command != null ? command : super.getCreateRelationshipCommand(req);
	}

	/**
	 * @generated
	 */
	protected Command getStartCreateRelationshipCommand(CreateRelationshipRequest req) {
		if (CiatElementTypes.Aggregation_4007 == req.getElementType()) {
			return getGEFWrapper(new AggregationCreateCommand(req, req.getSource(), req.getTarget()));
		}
		if (CiatElementTypes.Enabling_4008 == req.getElementType()) {
			return getGEFWrapper(new EnablingCreateCommand(req, req.getSource(), req.getTarget()));
		}
		if (CiatElementTypes.Disabling_4009 == req.getElementType()) {
			return getGEFWrapper(new DisablingCreateCommand(req, req.getSource(), req.getTarget()));
		}
		if (CiatElementTypes.EnablingWithInformationPassing_4010 == req.getElementType()) {
			return getGEFWrapper(
					new EnablingWithInformationPassingCreateCommand(req, req.getSource(), req.getTarget()));
		}
		if (CiatElementTypes.DisablingWithInformationPassing_4011 == req.getElementType()) {
			return getGEFWrapper(
					new DisablingWithInformationPassingCreateCommand(req, req.getSource(), req.getTarget()));
		}
		if (CiatElementTypes.IndependentConcurrency_4012 == req.getElementType()) {
			return getGEFWrapper(new IndependentConcurrencyCreateCommand(req, req.getSource(), req.getTarget()));
		}
		if (CiatElementTypes.OrderIndependence_4013 == req.getElementType()) {
			return getGEFWrapper(new OrderIndependenceCreateCommand(req, req.getSource(), req.getTarget()));
		}
		if (CiatElementTypes.SuspendResume_4014 == req.getElementType()) {
			return getGEFWrapper(new SuspendResumeCreateCommand(req, req.getSource(), req.getTarget()));
		}
		if (CiatElementTypes.ConcurrencyWithInformationPassing_4015 == req.getElementType()) {
			return getGEFWrapper(
					new ConcurrencyWithInformationPassingCreateCommand(req, req.getSource(), req.getTarget()));
		}
		if (CiatElementTypes.DeterministicChoice_4016 == req.getElementType()) {
			return getGEFWrapper(new DeterministicChoiceCreateCommand(req, req.getSource(), req.getTarget()));
		}
		if (CiatElementTypes.UndeterministicChoice_4017 == req.getElementType()) {
			return getGEFWrapper(new UndeterministicChoiceCreateCommand(req, req.getSource(), req.getTarget()));
		}
		return null;
	}

	/**
	 * @generated
	 */
	protected Command getCompleteCreateRelationshipCommand(CreateRelationshipRequest req) {
		if (CiatElementTypes.Aggregation_4007 == req.getElementType()) {
			return getGEFWrapper(new AggregationCreateCommand(req, req.getSource(), req.getTarget()));
		}
		if (CiatElementTypes.Enabling_4008 == req.getElementType()) {
			return getGEFWrapper(new EnablingCreateCommand(req, req.getSource(), req.getTarget()));
		}
		if (CiatElementTypes.Disabling_4009 == req.getElementType()) {
			return getGEFWrapper(new DisablingCreateCommand(req, req.getSource(), req.getTarget()));
		}
		if (CiatElementTypes.EnablingWithInformationPassing_4010 == req.getElementType()) {
			return getGEFWrapper(
					new EnablingWithInformationPassingCreateCommand(req, req.getSource(), req.getTarget()));
		}
		if (CiatElementTypes.DisablingWithInformationPassing_4011 == req.getElementType()) {
			return getGEFWrapper(
					new DisablingWithInformationPassingCreateCommand(req, req.getSource(), req.getTarget()));
		}
		if (CiatElementTypes.IndependentConcurrency_4012 == req.getElementType()) {
			return getGEFWrapper(new IndependentConcurrencyCreateCommand(req, req.getSource(), req.getTarget()));
		}
		if (CiatElementTypes.OrderIndependence_4013 == req.getElementType()) {
			return getGEFWrapper(new OrderIndependenceCreateCommand(req, req.getSource(), req.getTarget()));
		}
		if (CiatElementTypes.SuspendResume_4014 == req.getElementType()) {
			return getGEFWrapper(new SuspendResumeCreateCommand(req, req.getSource(), req.getTarget()));
		}
		if (CiatElementTypes.ConcurrencyWithInformationPassing_4015 == req.getElementType()) {
			return getGEFWrapper(
					new ConcurrencyWithInformationPassingCreateCommand(req, req.getSource(), req.getTarget()));
		}
		if (CiatElementTypes.DeterministicChoice_4016 == req.getElementType()) {
			return getGEFWrapper(new DeterministicChoiceCreateCommand(req, req.getSource(), req.getTarget()));
		}
		if (CiatElementTypes.UndeterministicChoice_4017 == req.getElementType()) {
			return getGEFWrapper(new UndeterministicChoiceCreateCommand(req, req.getSource(), req.getTarget()));
		}
		return null;
	}

	/**
	 * Returns command to reorient EClass based link. New link target or source
	 * should be the domain model element associated with this node.
	 * 
	 * @generated
	 */
	protected Command getReorientRelationshipCommand(ReorientRelationshipRequest req) {
		switch (getVisualID(req)) {
		case AggregationEditPart.VISUAL_ID:
			return getGEFWrapper(new AggregationReorientCommand(req));
		case EnablingEditPart.VISUAL_ID:
			return getGEFWrapper(new EnablingReorientCommand(req));
		case DisablingEditPart.VISUAL_ID:
			return getGEFWrapper(new DisablingReorientCommand(req));
		case EnablingWithInformationPassingEditPart.VISUAL_ID:
			return getGEFWrapper(new EnablingWithInformationPassingReorientCommand(req));
		case DisablingWithInformationPassingEditPart.VISUAL_ID:
			return getGEFWrapper(new DisablingWithInformationPassingReorientCommand(req));
		case IndependentConcurrencyEditPart.VISUAL_ID:
			return getGEFWrapper(new IndependentConcurrencyReorientCommand(req));
		case OrderIndependenceEditPart.VISUAL_ID:
			return getGEFWrapper(new OrderIndependenceReorientCommand(req));
		case SuspendResumeEditPart.VISUAL_ID:
			return getGEFWrapper(new SuspendResumeReorientCommand(req));
		case ConcurrencyWithInformationPassingEditPart.VISUAL_ID:
			return getGEFWrapper(new ConcurrencyWithInformationPassingReorientCommand(req));
		case DeterministicChoiceEditPart.VISUAL_ID:
			return getGEFWrapper(new DeterministicChoiceReorientCommand(req));
		case UndeterministicChoiceEditPart.VISUAL_ID:
			return getGEFWrapper(new UndeterministicChoiceReorientCommand(req));
		}
		return super.getReorientRelationshipCommand(req);
	}

}
