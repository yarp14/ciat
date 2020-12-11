/*
 * 
 */
package ciat.diagram.edit.parts;

import org.eclipse.draw2d.BorderLayout;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.MarginBorder;
import org.eclipse.draw2d.PositionConstants;
import org.eclipse.draw2d.RectangleFigure;
import org.eclipse.draw2d.RoundedRectangle;
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

import ciat.diagram.edit.policies.IndividualTask2CanonicalEditPolicy;
import ciat.diagram.edit.policies.IndividualTask2ItemSemanticEditPolicy;
import ciat.diagram.edit.policies.OpenDiagramEditPolicy;
import ciat.diagram.part.CiatVisualIDRegistry;
import ciat.diagram.providers.CiatElementTypes;

/**
 * @generated
 */
public class IndividualTask2EditPart extends AbstractBorderedShapeEditPart {

	/**
	* @generated
	*/
	public static final int VISUAL_ID = 3029;

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
	public IndividualTask2EditPart(View view) {
		super(view);
	}

	/**
	* @generated
	*/
	protected void createDefaultEditPolicies() {
		installEditPolicy(EditPolicyRoles.CREATION_ROLE,
				new CreationEditPolicyWithCustomReparent(CiatVisualIDRegistry.TYPED_INSTANCE));
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE, new IndividualTask2ItemSemanticEditPolicy());
		installEditPolicy(EditPolicyRoles.DRAG_DROP_ROLE, new DragDropEditPolicy());
		installEditPolicy(EditPolicyRoles.CANONICAL_ROLE, new IndividualTask2CanonicalEditPolicy());
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
				case ToolEditPart.VISUAL_ID:
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
		return primaryShape = new IndividualTaskFigure();
	}

	/**
	* @generated
	*/
	public IndividualTaskFigure getPrimaryShape() {
		return (IndividualTaskFigure) primaryShape;
	}

	/**
	* @generated
	*/
	protected boolean addFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof IndividualTaskName2EditPart) {
			((IndividualTaskName2EditPart) childEditPart)
					.setLabel(getPrimaryShape().getFigureIndividualTaskLabelFigure());
			return true;
		}
		if (childEditPart instanceof IndividualTaskIndividualTaskTaskRolesCompartment2EditPart) {
			IFigure pane = getPrimaryShape().getIndividualTaskTaskRolesCompartmentFigure();
			setupContentPane(pane); // FIXME each comparment should handle his content pane in his own way 
			pane.add(((IndividualTaskIndividualTaskTaskRolesCompartment2EditPart) childEditPart).getFigure());
			return true;
		}
		if (childEditPart instanceof IndividualTaskIndividualTaskTaskObjectsCompartment2EditPart) {
			IFigure pane = getPrimaryShape().getIndividualTaskTaskObjectsCompartmentFigure();
			setupContentPane(pane); // FIXME each comparment should handle his content pane in his own way 
			pane.add(((IndividualTaskIndividualTaskTaskObjectsCompartment2EditPart) childEditPart).getFigure());
			return true;
		}
		if (childEditPart instanceof ToolEditPart) {
			BorderItemLocator locator = new BorderItemLocator(getMainFigure(), PositionConstants.NORTH);
			getBorderedFigure().getBorderItemContainer().add(((ToolEditPart) childEditPart).getFigure(), locator);
			return true;
		}
		return false;
	}

	/**
	* @generated
	*/
	protected boolean removeFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof IndividualTaskName2EditPart) {
			return true;
		}
		if (childEditPart instanceof IndividualTaskIndividualTaskTaskRolesCompartment2EditPart) {
			IFigure pane = getPrimaryShape().getIndividualTaskTaskRolesCompartmentFigure();
			pane.remove(((IndividualTaskIndividualTaskTaskRolesCompartment2EditPart) childEditPart).getFigure());
			return true;
		}
		if (childEditPart instanceof IndividualTaskIndividualTaskTaskObjectsCompartment2EditPart) {
			IFigure pane = getPrimaryShape().getIndividualTaskTaskObjectsCompartmentFigure();
			pane.remove(((IndividualTaskIndividualTaskTaskObjectsCompartment2EditPart) childEditPart).getFigure());
			return true;
		}
		if (childEditPart instanceof ToolEditPart) {
			getBorderedFigure().getBorderItemContainer().remove(((ToolEditPart) childEditPart).getFigure());
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
		if (editPart instanceof IndividualTaskIndividualTaskTaskRolesCompartment2EditPart) {
			return getPrimaryShape().getIndividualTaskTaskRolesCompartmentFigure();
		}
		if (editPart instanceof IndividualTaskIndividualTaskTaskObjectsCompartment2EditPart) {
			return getPrimaryShape().getIndividualTaskTaskObjectsCompartmentFigure();
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
		return getChildBySemanticHint(CiatVisualIDRegistry.getType(IndividualTaskName2EditPart.VISUAL_ID));
	}

	/**
	* @generated
	*/
	public EditPart getTargetEditPart(Request request) {
		if (request instanceof CreateViewAndElementRequest) {
			CreateElementRequestAdapter adapter = ((CreateViewAndElementRequest) request).getViewAndElementDescriptor()
					.getCreateElementRequestAdapter();
			IElementType type = (IElementType) adapter.getAdapter(IElementType.class);
			if (type == CiatElementTypes.Rol_3007) {
				return getChildBySemanticHint(CiatVisualIDRegistry
						.getType(IndividualTaskIndividualTaskTaskRolesCompartment2EditPart.VISUAL_ID));
			}
			if (type == CiatElementTypes.Actor_3008) {
				return getChildBySemanticHint(CiatVisualIDRegistry
						.getType(IndividualTaskIndividualTaskTaskRolesCompartment2EditPart.VISUAL_ID));
			}
			if (type == CiatElementTypes.SoftwareAgent_3009) {
				return getChildBySemanticHint(CiatVisualIDRegistry
						.getType(IndividualTaskIndividualTaskTaskRolesCompartment2EditPart.VISUAL_ID));
			}
			if (type == CiatElementTypes.Team_3010) {
				return getChildBySemanticHint(CiatVisualIDRegistry
						.getType(IndividualTaskIndividualTaskTaskRolesCompartment2EditPart.VISUAL_ID));
			}
			if (type == CiatElementTypes.Group_3011) {
				return getChildBySemanticHint(CiatVisualIDRegistry
						.getType(IndividualTaskIndividualTaskTaskRolesCompartment2EditPart.VISUAL_ID));
			}
			if (type == CiatElementTypes.Object_3013) {
				return getChildBySemanticHint(CiatVisualIDRegistry
						.getType(IndividualTaskIndividualTaskTaskObjectsCompartment2EditPart.VISUAL_ID));
			}
		}
		return super.getTargetEditPart(request);
	}

	/**
	 * @generated
	 */
	public class IndividualTaskFigure extends RoundedRectangle {

		/**
		 * @generated
		 */
		private WrappingLabel fFigureIndividualTaskLabelFigure;
		/**
		 * @generated
		 */
		private RectangleFigure fIndividualTaskTaskRolesCompartmentFigure;
		/**
		 * @generated
		 */
		private RectangleFigure fIndividualTaskTaskObjectsCompartmentFigure;

		/**
		 * @generated
		 */
		public IndividualTaskFigure() {
			this.setCornerDimensions(new Dimension(getMapMode().DPtoLP(8), getMapMode().DPtoLP(8)));
			createContents();
		}

		/**
		 * @generated
		 */
		private void createContents() {

			RectangleFigure individualTaskFigure_Title0 = new RectangleFigure();

			individualTaskFigure_Title0.setFill(false);
			individualTaskFigure_Title0.setOutline(false);
			individualTaskFigure_Title0
					.setMaximumSize(new Dimension(getMapMode().DPtoLP(1000), getMapMode().DPtoLP(28)));

			individualTaskFigure_Title0.setBorder(new MarginBorder(getMapMode().DPtoLP(5), getMapMode().DPtoLP(5),
					getMapMode().DPtoLP(0), getMapMode().DPtoLP(5)));

			this.add(individualTaskFigure_Title0);

			BorderLayout layoutIndividualTaskFigure_Title0 = new BorderLayout();
			individualTaskFigure_Title0.setLayoutManager(layoutIndividualTaskFigure_Title0);

			fFigureIndividualTaskLabelFigure = new WrappingLabel();

			fFigureIndividualTaskLabelFigure.setText("IndividualTask");

			individualTaskFigure_Title0.add(fFigureIndividualTaskLabelFigure, BorderLayout.LEFT);

			RectangleFigure individualTaskFigure_Body0 = new RectangleFigure();

			individualTaskFigure_Body0.setOutline(false);

			this.add(individualTaskFigure_Body0);

			BorderLayout layoutIndividualTaskFigure_Body0 = new BorderLayout();
			individualTaskFigure_Body0.setLayoutManager(layoutIndividualTaskFigure_Body0);

			fIndividualTaskTaskRolesCompartmentFigure = new RectangleFigure();

			individualTaskFigure_Body0.add(fIndividualTaskTaskRolesCompartmentFigure, BorderLayout.LEFT);

			fIndividualTaskTaskObjectsCompartmentFigure = new RectangleFigure();

			individualTaskFigure_Body0.add(fIndividualTaskTaskObjectsCompartmentFigure, BorderLayout.CENTER);

		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureIndividualTaskLabelFigure() {
			return fFigureIndividualTaskLabelFigure;
		}

		/**
		 * @generated
		 */
		public RectangleFigure getIndividualTaskTaskRolesCompartmentFigure() {
			return fIndividualTaskTaskRolesCompartmentFigure;
		}

		/**
		 * @generated
		 */
		public RectangleFigure getIndividualTaskTaskObjectsCompartmentFigure() {
			return fIndividualTaskTaskObjectsCompartmentFigure;
		}

	}

}
