/*
 * 
 */
package ciat.diagram.edit.parts;

import org.eclipse.draw2d.IFigure;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPolicy;
import org.eclipse.gef.Request;
import org.eclipse.gmf.runtime.diagram.core.edithelpers.CreateElementRequestAdapter;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ShapeCompartmentEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.DragDropEditPolicy;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.ResizableCompartmentEditPolicy;
import org.eclipse.gmf.runtime.diagram.ui.figures.ResizableCompartmentFigure;
import org.eclipse.gmf.runtime.diagram.ui.requests.CreateUnspecifiedTypeConnectionRequest;
import org.eclipse.gmf.runtime.diagram.ui.requests.CreateViewAndElementRequest;
import org.eclipse.gmf.runtime.diagram.ui.requests.RequestConstants;
import org.eclipse.gmf.runtime.draw2d.ui.figures.ConstrainedToolbarLayout;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.edit.policies.reparent.CreationEditPolicyWithCustomReparent;

import ciat.diagram.edit.policies.AbstractTaskAbstractTaskProcessNodesCompartmentCanonicalEditPolicy;
import ciat.diagram.edit.policies.AbstractTaskAbstractTaskProcessNodesCompartmentItemSemanticEditPolicy;
import ciat.diagram.part.CiatVisualIDRegistry;
import ciat.diagram.part.Messages;
import ciat.diagram.providers.CiatElementTypes;

/**
 * @generated
 */
public class AbstractTaskAbstractTaskProcessNodesCompartmentEditPart extends ShapeCompartmentEditPart {

	/**
	* @generated
	*/
	public static final int VISUAL_ID = 7009;

	/**
	* @generated
	*/
	public AbstractTaskAbstractTaskProcessNodesCompartmentEditPart(View view) {
		super(view);
	}

	/**
	* @generated
	*/
	public String getCompartmentName() {
		return Messages.AbstractTaskAbstractTaskProcessNodesCompartmentEditPart_title;
	}

	/**
	* @generated
	*/
	public IFigure createFigure() {
		ResizableCompartmentFigure result = (ResizableCompartmentFigure) super.createFigure();
		result.setTitleVisibility(false);
		return result;
	}

	/**
	* @generated
	*/
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicy.PRIMARY_DRAG_ROLE, new ResizableCompartmentEditPolicy());
		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE,
				new AbstractTaskAbstractTaskProcessNodesCompartmentItemSemanticEditPolicy());
		installEditPolicy(EditPolicyRoles.CREATION_ROLE,
				new CreationEditPolicyWithCustomReparent(CiatVisualIDRegistry.TYPED_INSTANCE));
		installEditPolicy(EditPolicyRoles.DRAG_DROP_ROLE, new DragDropEditPolicy());
		installEditPolicy(EditPolicyRoles.CANONICAL_ROLE,
				new AbstractTaskAbstractTaskProcessNodesCompartmentCanonicalEditPolicy());
	}

	/**
	* @generated
	*/
	protected void setRatio(Double ratio) {
		if (getFigure().getParent().getLayoutManager() instanceof ConstrainedToolbarLayout) {
			super.setRatio(ratio);
		}
	}

	/**
	* @generated
	*/
	public EditPart getTargetEditPart(Request request) {
		if (request instanceof CreateViewAndElementRequest) {
			CreateElementRequestAdapter adapter = ((CreateViewAndElementRequest) request).getViewAndElementDescriptor()
					.getCreateElementRequestAdapter();
			IElementType type = (IElementType) adapter.getAdapter(IElementType.class);
			if (type == CiatElementTypes.IndividualTask_3029) {
				return this;
			}
			if (type == CiatElementTypes.CooperativeTask_3030) {
				return this;
			}
			if (type == CiatElementTypes.CollaborativeTask_3031) {
				return this;
			}
			if (type == CiatElementTypes.AbstractTask_3032) {
				return this;
			}
			if (type == CiatElementTypes.Init_3033) {
				return this;
			}
			if (type == CiatElementTypes.End_3034) {
				return this;
			}
			if (type == CiatElementTypes.TemporalCondition_3035) {
				return this;
			}
			if (type == CiatElementTypes.Notification_3036) {
				return this;
			}
			if (type == CiatElementTypes.Condition_3037) {
				return this;
			}
			return getParent().getTargetEditPart(request);
		}
		if (request instanceof CreateUnspecifiedTypeConnectionRequest) {
			if (RequestConstants.REQ_CONNECTION_END.equals(request.getType())) {
				for (Object type : ((CreateUnspecifiedTypeConnectionRequest) request).getElementTypes()) {
					if (type instanceof IElementType) {
						IElementType elementType = (IElementType) type;
						if (elementType.equals(CiatElementTypes.Aggregation_4007)
								|| elementType.equals(CiatElementTypes.Enabling_4008)
								|| elementType.equals(CiatElementTypes.Disabling_4009)
								|| elementType.equals(CiatElementTypes.EnablingWithInformationPassing_4010)
								|| elementType.equals(CiatElementTypes.DisablingWithInformationPassing_4011)
								|| elementType.equals(CiatElementTypes.IndependentConcurrency_4012)
								|| elementType.equals(CiatElementTypes.OrderIndependence_4013)
								|| elementType.equals(CiatElementTypes.SuspendResume_4014)
								|| elementType.equals(CiatElementTypes.ConcurrencyWithInformationPassing_4015)
								|| elementType.equals(CiatElementTypes.DeterministicChoice_4016)
								|| elementType.equals(CiatElementTypes.UndeterministicChoice_4017))
							return super.getTargetEditPart(request);
					}
				}
			}
			return getParent().getTargetEditPart(request);
		}
		return super.getTargetEditPart(request);
	}

}
