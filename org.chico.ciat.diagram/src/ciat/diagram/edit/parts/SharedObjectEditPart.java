/*
 * 
 */
package ciat.diagram.edit.parts;

import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.MarginBorder;
import org.eclipse.draw2d.PositionConstants;
import org.eclipse.draw2d.RectangleFigure;
import org.eclipse.draw2d.Shape;
import org.eclipse.draw2d.StackLayout;
import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPolicy;
import org.eclipse.gef.Request;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.editpolicies.LayoutEditPolicy;
import org.eclipse.gef.editpolicies.NonResizableEditPolicy;
import org.eclipse.gef.requests.CreateRequest;
import org.eclipse.gmf.runtime.diagram.core.edithelpers.CreateElementRequestAdapter;
import org.eclipse.gmf.runtime.diagram.ui.editparts.AbstractBorderedShapeEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IBorderItemEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.BorderItemSelectionEditPolicy;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.DragDropEditPolicy;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.diagram.ui.figures.BorderItemLocator;
import org.eclipse.gmf.runtime.diagram.ui.requests.CreateViewAndElementRequest;
import org.eclipse.gmf.runtime.draw2d.ui.figures.ConstrainedToolbarLayout;
import org.eclipse.gmf.runtime.draw2d.ui.figures.WrappingLabel;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.gef.ui.figures.DefaultSizeNodeFigure;
import org.eclipse.gmf.runtime.gef.ui.figures.NodeFigure;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.edit.policies.reparent.CreationEditPolicyWithCustomReparent;
import org.eclipse.swt.graphics.Color;

import ciat.diagram.edit.policies.OpenDiagramEditPolicy;
import ciat.diagram.edit.policies.SharedObjectCanonicalEditPolicy;
import ciat.diagram.edit.policies.SharedObjectItemSemanticEditPolicy;
import ciat.diagram.part.CiatVisualIDRegistry;
import ciat.diagram.providers.CiatElementTypes;

/**
 * @generated
 */
public class SharedObjectEditPart extends AbstractBorderedShapeEditPart {

	/**
	* @generated
	*/
	public static final int VISUAL_ID = 3043;

	/**
	* @generated
	*/
	protected IFigure contentPane;

	/**
	* @generated
	*/
	protected IFigure primaryShape;

	/**
	* @generated
	*/
	public SharedObjectEditPart(View view) {
		super(view);
	}

	/**
	* @generated
	*/
	protected void createDefaultEditPolicies() {
		installEditPolicy(EditPolicyRoles.CREATION_ROLE,
				new CreationEditPolicyWithCustomReparent(CiatVisualIDRegistry.TYPED_INSTANCE));
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE, new SharedObjectItemSemanticEditPolicy());
		installEditPolicy(EditPolicyRoles.DRAG_DROP_ROLE, new DragDropEditPolicy());
		installEditPolicy(EditPolicyRoles.CANONICAL_ROLE, new SharedObjectCanonicalEditPolicy());
		installEditPolicy(EditPolicy.LAYOUT_ROLE, createLayoutEditPolicy());
		installEditPolicy(EditPolicyRoles.OPEN_ROLE, new OpenDiagramEditPolicy()); // XXX need an SCR to runtime to have another abstract superclass that would let children add reasonable editpolicies
		// removeEditPolicy(org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles.CONNECTION_HANDLES_ROLE);
	}

	/**
	* @generated
	*/
	protected LayoutEditPolicy createLayoutEditPolicy() {
		org.eclipse.gmf.runtime.diagram.ui.editpolicies.LayoutEditPolicy lep = new org.eclipse.gmf.runtime.diagram.ui.editpolicies.LayoutEditPolicy() {

			protected EditPolicy createChildEditPolicy(EditPart child) {
				View childView = (View) child.getModel();
				switch (CiatVisualIDRegistry.getVisualID(childView)) {
				case ExclusiveEditionAreaEditPart.VISUAL_ID:
				case CollaborativeAreaEditPart.VISUAL_ID:
				case IndividualAreaEditPart.VISUAL_ID:
					return new BorderItemSelectionEditPolicy();
				}
				EditPolicy result = child.getEditPolicy(EditPolicy.PRIMARY_DRAG_ROLE);
				if (result == null) {
					result = new NonResizableEditPolicy();
				}
				return result;
			}

			protected Command getMoveChildrenCommand(Request request) {
				return null;
			}

			protected Command getCreateCommand(CreateRequest request) {
				return null;
			}
		};
		return lep;
	}

	/**
	* @generated
	*/
	protected IFigure createNodeShape() {
		return primaryShape = new SharedObjectFigure();
	}

	/**
	* @generated
	*/
	public SharedObjectFigure getPrimaryShape() {
		return (SharedObjectFigure) primaryShape;
	}

	/**
	* @generated
	*/
	protected boolean addFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof SharedObjectNameEditPart) {
			((SharedObjectNameEditPart) childEditPart).setLabel(getPrimaryShape().getFigureSharedObjectLabelFigure());
			return true;
		}
		if (childEditPart instanceof SharedObjectSharedObjectAttributesCompartmentEditPart) {
			IFigure pane = getPrimaryShape().getSharedObjectAttributesCompartmentFigure();
			setupContentPane(pane); // FIXME each comparment should handle his content pane in his own way 
			pane.add(((SharedObjectSharedObjectAttributesCompartmentEditPart) childEditPart).getFigure());
			return true;
		}
		if (childEditPart instanceof SharedObjectSharedObjectOperationsCompartmentEditPart) {
			IFigure pane = getPrimaryShape().getSharedObjectOperationsCompartmentFigure();
			setupContentPane(pane); // FIXME each comparment should handle his content pane in his own way 
			pane.add(((SharedObjectSharedObjectOperationsCompartmentEditPart) childEditPart).getFigure());
			return true;
		}
		if (childEditPart instanceof ExclusiveEditionAreaEditPart) {
			BorderItemLocator locator = new BorderItemLocator(getMainFigure(), PositionConstants.NORTH);
			getBorderedFigure().getBorderItemContainer().add(((ExclusiveEditionAreaEditPart) childEditPart).getFigure(),
					locator);
			return true;
		}
		if (childEditPart instanceof CollaborativeAreaEditPart) {
			BorderItemLocator locator = new BorderItemLocator(getMainFigure(), PositionConstants.NORTH);
			getBorderedFigure().getBorderItemContainer().add(((CollaborativeAreaEditPart) childEditPart).getFigure(),
					locator);
			return true;
		}
		if (childEditPart instanceof IndividualAreaEditPart) {
			BorderItemLocator locator = new BorderItemLocator(getMainFigure(), PositionConstants.NORTH);
			getBorderedFigure().getBorderItemContainer().add(((IndividualAreaEditPart) childEditPart).getFigure(),
					locator);
			return true;
		}
		return false;
	}

	/**
	* @generated
	*/
	protected boolean removeFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof SharedObjectNameEditPart) {
			return true;
		}
		if (childEditPart instanceof SharedObjectSharedObjectAttributesCompartmentEditPart) {
			IFigure pane = getPrimaryShape().getSharedObjectAttributesCompartmentFigure();
			pane.remove(((SharedObjectSharedObjectAttributesCompartmentEditPart) childEditPart).getFigure());
			return true;
		}
		if (childEditPart instanceof SharedObjectSharedObjectOperationsCompartmentEditPart) {
			IFigure pane = getPrimaryShape().getSharedObjectOperationsCompartmentFigure();
			pane.remove(((SharedObjectSharedObjectOperationsCompartmentEditPart) childEditPart).getFigure());
			return true;
		}
		if (childEditPart instanceof ExclusiveEditionAreaEditPart) {
			getBorderedFigure().getBorderItemContainer()
					.remove(((ExclusiveEditionAreaEditPart) childEditPart).getFigure());
			return true;
		}
		if (childEditPart instanceof CollaborativeAreaEditPart) {
			getBorderedFigure().getBorderItemContainer()
					.remove(((CollaborativeAreaEditPart) childEditPart).getFigure());
			return true;
		}
		if (childEditPart instanceof IndividualAreaEditPart) {
			getBorderedFigure().getBorderItemContainer().remove(((IndividualAreaEditPart) childEditPart).getFigure());
			return true;
		}
		return false;
	}

	/**
	* @generated
	*/
	protected void addChildVisual(EditPart childEditPart, int index) {
		if (addFixedChild(childEditPart)) {
			return;
		}
		super.addChildVisual(childEditPart, -1);
	}

	/**
	* @generated
	*/
	protected void removeChildVisual(EditPart childEditPart) {
		if (removeFixedChild(childEditPart)) {
			return;
		}
		super.removeChildVisual(childEditPart);
	}

	/**
	* @generated
	*/
	protected IFigure getContentPaneFor(IGraphicalEditPart editPart) {
		if (editPart instanceof SharedObjectSharedObjectAttributesCompartmentEditPart) {
			return getPrimaryShape().getSharedObjectAttributesCompartmentFigure();
		}
		if (editPart instanceof SharedObjectSharedObjectOperationsCompartmentEditPart) {
			return getPrimaryShape().getSharedObjectOperationsCompartmentFigure();
		}
		if (editPart instanceof IBorderItemEditPart) {
			return getBorderedFigure().getBorderItemContainer();
		}
		return getContentPane();
	}

	/**
	* @generated
	*/
	protected NodeFigure createNodePlate() {
		DefaultSizeNodeFigure result = new DefaultSizeNodeFigure(40, 40);
		return result;
	}

	/**
	* Creates figure for this edit part.
	* 
	* Body of this method does not depend on settings in generation model
	* so you may safely remove <i>generated</i> tag and modify it.
	* 
	* @generated
	*/
	protected NodeFigure createMainFigure() {
		NodeFigure figure = createNodePlate();
		figure.setLayoutManager(new StackLayout());
		IFigure shape = createNodeShape();
		figure.add(shape);
		contentPane = setupContentPane(shape);
		return figure;
	}

	/**
	* Default implementation treats passed figure as content pane.
	* Respects layout one may have set for generated figure.
	* @param nodeShape instance of generated figure class
	* @generated
	*/
	protected IFigure setupContentPane(IFigure nodeShape) {
		if (nodeShape.getLayoutManager() == null) {
			ConstrainedToolbarLayout layout = new ConstrainedToolbarLayout();
			layout.setSpacing(5);
			nodeShape.setLayoutManager(layout);
		}
		return nodeShape; // use nodeShape itself as contentPane
	}

	/**
	* @generated
	*/
	public IFigure getContentPane() {
		if (contentPane != null) {
			return contentPane;
		}
		return super.getContentPane();
	}

	/**
	* @generated
	*/
	protected void setForegroundColor(Color color) {
		if (primaryShape != null) {
			primaryShape.setForegroundColor(color);
		}
	}

	/**
	* @generated
	*/
	protected void setBackgroundColor(Color color) {
		if (primaryShape != null) {
			primaryShape.setBackgroundColor(color);
		}
	}

	/**
	* @generated
	*/
	protected void setLineWidth(int width) {
		if (primaryShape instanceof Shape) {
			((Shape) primaryShape).setLineWidth(width);
		}
	}

	/**
	* @generated
	*/
	protected void setLineType(int style) {
		if (primaryShape instanceof Shape) {
			((Shape) primaryShape).setLineStyle(style);
		}
	}

	/**
	* @generated
	*/
	public EditPart getPrimaryChildEditPart() {
		return getChildBySemanticHint(CiatVisualIDRegistry.getType(SharedObjectNameEditPart.VISUAL_ID));
	}

	/**
	* @generated
	*/
	public EditPart getTargetEditPart(Request request) {
		if (request instanceof CreateViewAndElementRequest) {
			CreateElementRequestAdapter adapter = ((CreateViewAndElementRequest) request).getViewAndElementDescriptor()
					.getCreateElementRequestAdapter();
			IElementType type = (IElementType) adapter.getAdapter(IElementType.class);
			if (type == CiatElementTypes.Attribute_3047) {
				return getChildBySemanticHint(
						CiatVisualIDRegistry.getType(SharedObjectSharedObjectAttributesCompartmentEditPart.VISUAL_ID));
			}
			if (type == CiatElementTypes.Operation_3048) {
				return getChildBySemanticHint(
						CiatVisualIDRegistry.getType(SharedObjectSharedObjectOperationsCompartmentEditPart.VISUAL_ID));
			}
		}
		return super.getTargetEditPart(request);
	}

	/**
	 * @generated
	 */
	public class SharedObjectFigure extends RectangleFigure {

		/**
		 * @generated
		 */
		private WrappingLabel fFigureSharedObjectLabelFigure;
		/**
		 * @generated
		 */
		private RectangleFigure fSharedObjectAttributesCompartmentFigure;
		/**
		 * @generated
		 */
		private RectangleFigure fSharedObjectOperationsCompartmentFigure;

		/**
		 * @generated
		 */
		public SharedObjectFigure() {
			this.setBorder(new MarginBorder(getMapMode().DPtoLP(5), getMapMode().DPtoLP(5), getMapMode().DPtoLP(5),
					getMapMode().DPtoLP(5)));
			createContents();
		}

		/**
		 * @generated
		 */
		private void createContents() {

			fFigureSharedObjectLabelFigure = new WrappingLabel();

			fFigureSharedObjectLabelFigure.setText("SharedObject");
			fFigureSharedObjectLabelFigure
					.setMaximumSize(new Dimension(getMapMode().DPtoLP(10000), getMapMode().DPtoLP(50)));

			this.add(fFigureSharedObjectLabelFigure);

			fSharedObjectAttributesCompartmentFigure = new RectangleFigure();

			fSharedObjectAttributesCompartmentFigure.setOutline(false);

			this.add(fSharedObjectAttributesCompartmentFigure);

			fSharedObjectOperationsCompartmentFigure = new RectangleFigure();

			fSharedObjectOperationsCompartmentFigure.setOutline(false);

			this.add(fSharedObjectOperationsCompartmentFigure);

		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureSharedObjectLabelFigure() {
			return fFigureSharedObjectLabelFigure;
		}

		/**
		 * @generated
		 */
		public RectangleFigure getSharedObjectAttributesCompartmentFigure() {
			return fSharedObjectAttributesCompartmentFigure;
		}

		/**
		 * @generated
		 */
		public RectangleFigure getSharedObjectOperationsCompartmentFigure() {
			return fSharedObjectOperationsCompartmentFigure;
		}

	}

}
