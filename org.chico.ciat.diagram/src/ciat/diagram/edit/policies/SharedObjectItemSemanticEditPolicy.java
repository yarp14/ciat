/*
* 
*/
package ciat.diagram.edit.policies;

import java.util.Iterator;

import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.common.core.command.ICompositeCommand;
import org.eclipse.gmf.runtime.diagram.core.commands.DeleteCommand;
import org.eclipse.gmf.runtime.emf.commands.core.command.CompositeTransactionalCommand;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateRelationshipRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyElementRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientRelationshipRequest;
import org.eclipse.gmf.runtime.notation.Edge;
import org.eclipse.gmf.runtime.notation.Node;
import org.eclipse.gmf.runtime.notation.View;

import ciat.diagram.edit.commands.CollaborativeAreaCreateCommand;
import ciat.diagram.edit.commands.ExclusiveEditionAreaCreateCommand;
import ciat.diagram.edit.commands.IndividualAreaCreateCommand;
import ciat.diagram.edit.commands.ShAggregationLinkCreateCommand;
import ciat.diagram.edit.commands.ShAggregationLinkReorientCommand;
import ciat.diagram.edit.commands.ShAssociationLinkCreateCommand;
import ciat.diagram.edit.commands.ShAssociationLinkReorientCommand;
import ciat.diagram.edit.commands.ShGeneralizationLinkCreateCommand;
import ciat.diagram.edit.commands.ShGeneralizationLinkReorientCommand;
import ciat.diagram.edit.parts.AttributeEditPart;
import ciat.diagram.edit.parts.CollaborativeAreaEditPart;
import ciat.diagram.edit.parts.ExclusiveEditionAreaEditPart;
import ciat.diagram.edit.parts.IndividualAreaEditPart;
import ciat.diagram.edit.parts.OperationEditPart;
import ciat.diagram.edit.parts.ShAggregationLinkEditPart;
import ciat.diagram.edit.parts.ShAssociationLinkEditPart;
import ciat.diagram.edit.parts.ShGeneralizationLinkEditPart;
import ciat.diagram.edit.parts.SharedObjectSharedObjectAttributesCompartmentEditPart;
import ciat.diagram.edit.parts.SharedObjectSharedObjectOperationsCompartmentEditPart;
import ciat.diagram.part.CiatVisualIDRegistry;
import ciat.diagram.providers.CiatElementTypes;

/**
 * @generated
 */
public class SharedObjectItemSemanticEditPolicy extends CiatBaseItemSemanticEditPolicy {

	/**
	* @generated
	*/
	public SharedObjectItemSemanticEditPolicy() {
		super(CiatElementTypes.SharedObject_3043);
	}

	/**
	* @generated
	*/
	protected Command getCreateCommand(CreateElementRequest req) {
		if (CiatElementTypes.ExclusiveEditionArea_3044 == req.getElementType()) {
			return getGEFWrapper(new ExclusiveEditionAreaCreateCommand(req));
		}
		if (CiatElementTypes.CollaborativeArea_3045 == req.getElementType()) {
			return getGEFWrapper(new CollaborativeAreaCreateCommand(req));
		}
		if (CiatElementTypes.IndividualArea_3046 == req.getElementType()) {
			return getGEFWrapper(new IndividualAreaCreateCommand(req));
		}
		return super.getCreateCommand(req);
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
			if (CiatVisualIDRegistry.getVisualID(incomingLink) == ShAssociationLinkEditPart.VISUAL_ID) {
				DestroyElementRequest r = new DestroyElementRequest(incomingLink.getElement(), false);
				cmd.add(new DestroyElementCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), incomingLink));
				continue;
			}
			if (CiatVisualIDRegistry.getVisualID(incomingLink) == ShGeneralizationLinkEditPart.VISUAL_ID) {
				DestroyElementRequest r = new DestroyElementRequest(incomingLink.getElement(), false);
				cmd.add(new DestroyElementCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), incomingLink));
				continue;
			}
			if (CiatVisualIDRegistry.getVisualID(incomingLink) == ShAggregationLinkEditPart.VISUAL_ID) {
				DestroyElementRequest r = new DestroyElementRequest(incomingLink.getElement(), false);
				cmd.add(new DestroyElementCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), incomingLink));
				continue;
			}
		}
		for (Iterator<?> it = view.getSourceEdges().iterator(); it.hasNext();) {
			Edge outgoingLink = (Edge) it.next();
			if (CiatVisualIDRegistry.getVisualID(outgoingLink) == ShAssociationLinkEditPart.VISUAL_ID) {
				DestroyElementRequest r = new DestroyElementRequest(outgoingLink.getElement(), false);
				cmd.add(new DestroyElementCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), outgoingLink));
				continue;
			}
			if (CiatVisualIDRegistry.getVisualID(outgoingLink) == ShGeneralizationLinkEditPart.VISUAL_ID) {
				DestroyElementRequest r = new DestroyElementRequest(outgoingLink.getElement(), false);
				cmd.add(new DestroyElementCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), outgoingLink));
				continue;
			}
			if (CiatVisualIDRegistry.getVisualID(outgoingLink) == ShAggregationLinkEditPart.VISUAL_ID) {
				DestroyElementRequest r = new DestroyElementRequest(outgoingLink.getElement(), false);
				cmd.add(new DestroyElementCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), outgoingLink));
				continue;
			}
		}
		EAnnotation annotation = view.getEAnnotation("Shortcut"); //$NON-NLS-1$
		if (annotation == null) {
			// there are indirectly referenced children, need extra commands: false
			addDestroyChildNodesCommand(cmd);
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
	private void addDestroyChildNodesCommand(ICompositeCommand cmd) {
		View view = (View) getHost().getModel();
		for (Iterator<?> nit = view.getChildren().iterator(); nit.hasNext();) {
			Node node = (Node) nit.next();
			switch (CiatVisualIDRegistry.getVisualID(node)) {
			case ExclusiveEditionAreaEditPart.VISUAL_ID:
				cmd.add(new DestroyElementCommand(
						new DestroyElementRequest(getEditingDomain(), node.getElement(), false))); // directlyOwned: true
				// don't need explicit deletion of node as parent's view deletion would clean child views as well 
				// cmd.add(new org.eclipse.gmf.runtime.diagram.core.commands.DeleteCommand(getEditingDomain(), node));
				break;
			case CollaborativeAreaEditPart.VISUAL_ID:
				cmd.add(new DestroyElementCommand(
						new DestroyElementRequest(getEditingDomain(), node.getElement(), false))); // directlyOwned: true
				// don't need explicit deletion of node as parent's view deletion would clean child views as well 
				// cmd.add(new org.eclipse.gmf.runtime.diagram.core.commands.DeleteCommand(getEditingDomain(), node));
				break;
			case IndividualAreaEditPart.VISUAL_ID:
				cmd.add(new DestroyElementCommand(
						new DestroyElementRequest(getEditingDomain(), node.getElement(), false))); // directlyOwned: true
				// don't need explicit deletion of node as parent's view deletion would clean child views as well 
				// cmd.add(new org.eclipse.gmf.runtime.diagram.core.commands.DeleteCommand(getEditingDomain(), node));
				break;
			case SharedObjectSharedObjectAttributesCompartmentEditPart.VISUAL_ID:
				for (Iterator<?> cit = node.getChildren().iterator(); cit.hasNext();) {
					Node cnode = (Node) cit.next();
					switch (CiatVisualIDRegistry.getVisualID(cnode)) {
					case AttributeEditPart.VISUAL_ID:
						cmd.add(new DestroyElementCommand(
								new DestroyElementRequest(getEditingDomain(), cnode.getElement(), false))); // directlyOwned: true
						// don't need explicit deletion of cnode as parent's view deletion would clean child views as well 
						// cmd.add(new org.eclipse.gmf.runtime.diagram.core.commands.DeleteCommand(getEditingDomain(), cnode));
						break;
					}
				}
				break;
			case SharedObjectSharedObjectOperationsCompartmentEditPart.VISUAL_ID:
				for (Iterator<?> cit = node.getChildren().iterator(); cit.hasNext();) {
					Node cnode = (Node) cit.next();
					switch (CiatVisualIDRegistry.getVisualID(cnode)) {
					case OperationEditPart.VISUAL_ID:
						cmd.add(new DestroyElementCommand(
								new DestroyElementRequest(getEditingDomain(), cnode.getElement(), false))); // directlyOwned: true
						// don't need explicit deletion of cnode as parent's view deletion would clean child views as well 
						// cmd.add(new org.eclipse.gmf.runtime.diagram.core.commands.DeleteCommand(getEditingDomain(), cnode));
						break;
					}
				}
				break;
			}
		}
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
		if (CiatElementTypes.ShAssociationLink_4004 == req.getElementType()) {
			return getGEFWrapper(new ShAssociationLinkCreateCommand(req, req.getSource(), req.getTarget()));
		}
		if (CiatElementTypes.ShGeneralizationLink_4005 == req.getElementType()) {
			return getGEFWrapper(new ShGeneralizationLinkCreateCommand(req, req.getSource(), req.getTarget()));
		}
		if (CiatElementTypes.ShAggregationLink_4006 == req.getElementType()) {
			return getGEFWrapper(new ShAggregationLinkCreateCommand(req, req.getSource(), req.getTarget()));
		}
		return null;
	}

	/**
	 * @generated
	 */
	protected Command getCompleteCreateRelationshipCommand(CreateRelationshipRequest req) {
		if (CiatElementTypes.ShAssociationLink_4004 == req.getElementType()) {
			return getGEFWrapper(new ShAssociationLinkCreateCommand(req, req.getSource(), req.getTarget()));
		}
		if (CiatElementTypes.ShGeneralizationLink_4005 == req.getElementType()) {
			return getGEFWrapper(new ShGeneralizationLinkCreateCommand(req, req.getSource(), req.getTarget()));
		}
		if (CiatElementTypes.ShAggregationLink_4006 == req.getElementType()) {
			return getGEFWrapper(new ShAggregationLinkCreateCommand(req, req.getSource(), req.getTarget()));
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
		case ShAssociationLinkEditPart.VISUAL_ID:
			return getGEFWrapper(new ShAssociationLinkReorientCommand(req));
		case ShGeneralizationLinkEditPart.VISUAL_ID:
			return getGEFWrapper(new ShGeneralizationLinkReorientCommand(req));
		case ShAggregationLinkEditPart.VISUAL_ID:
			return getGEFWrapper(new ShAggregationLinkReorientCommand(req));
		}
		return super.getReorientRelationshipCommand(req);
	}

}
