/*
* 
*/
package ciat.diagram.navigator;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.gmf.runtime.common.ui.services.parser.IParser;
import org.eclipse.gmf.runtime.common.ui.services.parser.ParserOptions;
import org.eclipse.gmf.runtime.emf.core.util.EObjectAdapter;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.resource.ImageRegistry;
import org.eclipse.jface.viewers.ITreePathLabelProvider;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.TreePath;
import org.eclipse.jface.viewers.ViewerLabel;
import org.eclipse.swt.graphics.Image;
import org.eclipse.ui.IMemento;
import org.eclipse.ui.navigator.ICommonContentExtensionSite;
import org.eclipse.ui.navigator.ICommonLabelProvider;

import ciat.diagram.edit.parts.*;
import ciat.diagram.part.CiatDiagramEditorPlugin;
import ciat.diagram.part.CiatVisualIDRegistry;
import ciat.diagram.providers.CiatElementTypes;
import ciat.diagram.providers.CiatParserProvider;

/**
 * @generated
 */
public class CiatNavigatorLabelProvider extends LabelProvider implements ICommonLabelProvider, ITreePathLabelProvider {

	/**
	* @generated
	*/
	static {
		CiatDiagramEditorPlugin.getInstance().getImageRegistry().put("Navigator?UnknownElement", //$NON-NLS-1$
				ImageDescriptor.getMissingImageDescriptor());
		CiatDiagramEditorPlugin.getInstance().getImageRegistry().put("Navigator?ImageNotFound", //$NON-NLS-1$
				ImageDescriptor.getMissingImageDescriptor());
	}

	/**
	* @generated
	*/
	public void updateLabel(ViewerLabel label, TreePath elementPath) {
		Object element = elementPath.getLastSegment();
		if (element instanceof CiatNavigatorItem && !isOwnView(((CiatNavigatorItem) element).getView())) {
			return;
		}
		label.setText(getText(element));
		label.setImage(getImage(element));
	}

	/**
	* @generated
	*/
	public Image getImage(Object element) {
		if (element instanceof CiatNavigatorGroup) {
			CiatNavigatorGroup group = (CiatNavigatorGroup) element;
			return CiatDiagramEditorPlugin.getInstance().getBundledImage(group.getIcon());
		}

		if (element instanceof CiatNavigatorItem) {
			CiatNavigatorItem navigatorItem = (CiatNavigatorItem) element;
			if (!isOwnView(navigatorItem.getView())) {
				return super.getImage(element);
			}
			return getImage(navigatorItem.getView());
		}

		// Due to plugin.xml content will be called only for "own" views
		if (element instanceof IAdaptable) {
			View view = (View) ((IAdaptable) element).getAdapter(View.class);
			if (view != null && isOwnView(view)) {
				return getImage(view);
			}
		}

		return super.getImage(element);
	}

	/**
	* @generated
	*/
	public Image getImage(View view) {
		switch (CiatVisualIDRegistry.getVisualID(view)) {
		case CIATDiagramEditPart.VISUAL_ID:
			return getImage("Navigator?Diagram?ciat?CIATDiagram", CiatElementTypes.CIATDiagram_1000); //$NON-NLS-1$
		case SociogramEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?ciat?Sociogram", CiatElementTypes.Sociogram_2001); //$NON-NLS-1$
		case ProcessDiagramEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?ciat?ProcessDiagram", CiatElementTypes.ProcessDiagram_2002); //$NON-NLS-1$
		case DomainDiagramEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?ciat?DomainDiagram", CiatElementTypes.DomainDiagram_2003); //$NON-NLS-1$
		case CTTDiagramEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?ciat?CTTDiagram", CiatElementTypes.CTTDiagram_2004); //$NON-NLS-1$
		case RolEditPart.VISUAL_ID:
			return getImage("Navigator?Node?ciat?Rol", CiatElementTypes.Rol_3001); //$NON-NLS-1$
		case ActorEditPart.VISUAL_ID:
			return getImage("Navigator?Node?ciat?Actor", CiatElementTypes.Actor_3002); //$NON-NLS-1$
		case SoftwareAgentEditPart.VISUAL_ID:
			return getImage("Navigator?Node?ciat?SoftwareAgent", CiatElementTypes.SoftwareAgent_3003); //$NON-NLS-1$
		case TeamEditPart.VISUAL_ID:
			return getImage("Navigator?Node?ciat?Team", CiatElementTypes.Team_3004); //$NON-NLS-1$
		case GroupEditPart.VISUAL_ID:
			return getImage("Navigator?Node?ciat?Group", CiatElementTypes.Group_3005); //$NON-NLS-1$
		case IndividualTaskEditPart.VISUAL_ID:
			return getImage("Navigator?Node?ciat?IndividualTask", CiatElementTypes.IndividualTask_3006); //$NON-NLS-1$
		case Rol2EditPart.VISUAL_ID:
			return getImage("Navigator?Node?ciat?Rol", CiatElementTypes.Rol_3007); //$NON-NLS-1$
		case Actor2EditPart.VISUAL_ID:
			return getImage("Navigator?Node?ciat?Actor", CiatElementTypes.Actor_3008); //$NON-NLS-1$
		case SoftwareAgent2EditPart.VISUAL_ID:
			return getImage("Navigator?Node?ciat?SoftwareAgent", CiatElementTypes.SoftwareAgent_3009); //$NON-NLS-1$
		case Team2EditPart.VISUAL_ID:
			return getImage("Navigator?Node?ciat?Team", CiatElementTypes.Team_3010); //$NON-NLS-1$
		case Group2EditPart.VISUAL_ID:
			return getImage("Navigator?Node?ciat?Group", CiatElementTypes.Group_3011); //$NON-NLS-1$
		case ToolEditPart.VISUAL_ID:
			return getImage("Navigator?Node?ciat?Tool", CiatElementTypes.Tool_3012); //$NON-NLS-1$
		case ObjectEditPart.VISUAL_ID:
			return getImage("Navigator?Node?ciat?Object", CiatElementTypes.Object_3013); //$NON-NLS-1$
		case CooperativeTaskEditPart.VISUAL_ID:
			return getImage("Navigator?Node?ciat?CooperativeTask", CiatElementTypes.CooperativeTask_3014); //$NON-NLS-1$
		case Rol3EditPart.VISUAL_ID:
			return getImage("Navigator?Node?ciat?Rol", CiatElementTypes.Rol_3015); //$NON-NLS-1$
		case Actor3EditPart.VISUAL_ID:
			return getImage("Navigator?Node?ciat?Actor", CiatElementTypes.Actor_3016); //$NON-NLS-1$
		case SoftwareAgent3EditPart.VISUAL_ID:
			return getImage("Navigator?Node?ciat?SoftwareAgent", CiatElementTypes.SoftwareAgent_3017); //$NON-NLS-1$
		case Team3EditPart.VISUAL_ID:
			return getImage("Navigator?Node?ciat?Team", CiatElementTypes.Team_3018); //$NON-NLS-1$
		case Group3EditPart.VISUAL_ID:
			return getImage("Navigator?Node?ciat?Group", CiatElementTypes.Group_3019); //$NON-NLS-1$
		case Object2EditPart.VISUAL_ID:
			return getImage("Navigator?Node?ciat?Object", CiatElementTypes.Object_3020); //$NON-NLS-1$
		case CollaborativeTaskEditPart.VISUAL_ID:
			return getImage("Navigator?Node?ciat?CollaborativeTask", CiatElementTypes.CollaborativeTask_3021); //$NON-NLS-1$
		case Rol4EditPart.VISUAL_ID:
			return getImage("Navigator?Node?ciat?Rol", CiatElementTypes.Rol_3022); //$NON-NLS-1$
		case Actor4EditPart.VISUAL_ID:
			return getImage("Navigator?Node?ciat?Actor", CiatElementTypes.Actor_3023); //$NON-NLS-1$
		case SoftwareAgent4EditPart.VISUAL_ID:
			return getImage("Navigator?Node?ciat?SoftwareAgent", CiatElementTypes.SoftwareAgent_3024); //$NON-NLS-1$
		case Team4EditPart.VISUAL_ID:
			return getImage("Navigator?Node?ciat?Team", CiatElementTypes.Team_3025); //$NON-NLS-1$
		case Group4EditPart.VISUAL_ID:
			return getImage("Navigator?Node?ciat?Group", CiatElementTypes.Group_3026); //$NON-NLS-1$
		case Object3EditPart.VISUAL_ID:
			return getImage("Navigator?Node?ciat?Object", CiatElementTypes.Object_3027); //$NON-NLS-1$
		case AbstractTaskEditPart.VISUAL_ID:
			return getImage("Navigator?Node?ciat?AbstractTask", CiatElementTypes.AbstractTask_3028); //$NON-NLS-1$
		case IndividualTask2EditPart.VISUAL_ID:
			return getImage("Navigator?Node?ciat?IndividualTask", CiatElementTypes.IndividualTask_3029); //$NON-NLS-1$
		case CooperativeTask2EditPart.VISUAL_ID:
			return getImage("Navigator?Node?ciat?CooperativeTask", CiatElementTypes.CooperativeTask_3030); //$NON-NLS-1$
		case CollaborativeTask2EditPart.VISUAL_ID:
			return getImage("Navigator?Node?ciat?CollaborativeTask", CiatElementTypes.CollaborativeTask_3031); //$NON-NLS-1$
		case AbstractTask2EditPart.VISUAL_ID:
			return getImage("Navigator?Node?ciat?AbstractTask", CiatElementTypes.AbstractTask_3032); //$NON-NLS-1$
		case InitEditPart.VISUAL_ID:
			return getImage("Navigator?Node?ciat?Init", CiatElementTypes.Init_3033); //$NON-NLS-1$
		case EndEditPart.VISUAL_ID:
			return getImage("Navigator?Node?ciat?End", CiatElementTypes.End_3034); //$NON-NLS-1$
		case TemporalConditionEditPart.VISUAL_ID:
			return getImage("Navigator?Node?ciat?TemporalCondition", CiatElementTypes.TemporalCondition_3035); //$NON-NLS-1$
		case NotificationEditPart.VISUAL_ID:
			return getImage("Navigator?Node?ciat?Notification", CiatElementTypes.Notification_3036); //$NON-NLS-1$
		case ConditionEditPart.VISUAL_ID:
			return getImage("Navigator?Node?ciat?Condition", CiatElementTypes.Condition_3037); //$NON-NLS-1$
		case Init2EditPart.VISUAL_ID:
			return getImage("Navigator?Node?ciat?Init", CiatElementTypes.Init_3038); //$NON-NLS-1$
		case End2EditPart.VISUAL_ID:
			return getImage("Navigator?Node?ciat?End", CiatElementTypes.End_3039); //$NON-NLS-1$
		case TemporalCondition2EditPart.VISUAL_ID:
			return getImage("Navigator?Node?ciat?TemporalCondition", CiatElementTypes.TemporalCondition_3040); //$NON-NLS-1$
		case Notification2EditPart.VISUAL_ID:
			return getImage("Navigator?Node?ciat?Notification", CiatElementTypes.Notification_3041); //$NON-NLS-1$
		case Condition2EditPart.VISUAL_ID:
			return getImage("Navigator?Node?ciat?Condition", CiatElementTypes.Condition_3042); //$NON-NLS-1$
		case SharedObjectEditPart.VISUAL_ID:
			return getImage("Navigator?Node?ciat?SharedObject", CiatElementTypes.SharedObject_3043); //$NON-NLS-1$
		case ExclusiveEditionAreaEditPart.VISUAL_ID:
			return getImage("Navigator?Node?ciat?ExclusiveEditionArea", CiatElementTypes.ExclusiveEditionArea_3044); //$NON-NLS-1$
		case CollaborativeAreaEditPart.VISUAL_ID:
			return getImage("Navigator?Node?ciat?CollaborativeArea", CiatElementTypes.CollaborativeArea_3045); //$NON-NLS-1$
		case IndividualAreaEditPart.VISUAL_ID:
			return getImage("Navigator?Node?ciat?IndividualArea", CiatElementTypes.IndividualArea_3046); //$NON-NLS-1$
		case AttributeEditPart.VISUAL_ID:
			return getImage("Navigator?Node?ciat?Attribute", CiatElementTypes.Attribute_3047); //$NON-NLS-1$
		case OperationEditPart.VISUAL_ID:
			return getImage("Navigator?Node?ciat?Operation", CiatElementTypes.Operation_3048); //$NON-NLS-1$
		case ExclusiveEditionEditPart.VISUAL_ID:
			return getImage("Navigator?Node?ciat?ExclusiveEdition", CiatElementTypes.ExclusiveEdition_3049); //$NON-NLS-1$
		case CollaborativeVisualizationEditPart.VISUAL_ID:
			return getImage("Navigator?Node?ciat?CollaborativeVisualization", //$NON-NLS-1$
					CiatElementTypes.CollaborativeVisualization_3050);
		case IndividualVisualizationEditPart.VISUAL_ID:
			return getImage("Navigator?Node?ciat?IndividualVisualization", //$NON-NLS-1$
					CiatElementTypes.IndividualVisualization_3051);
		case UserTaskEditPart.VISUAL_ID:
			return getImage("Navigator?Node?ciat?UserTask", CiatElementTypes.UserTask_3052); //$NON-NLS-1$
		case CTTAbstractTaskEditPart.VISUAL_ID:
			return getImage("Navigator?Node?ciat?CTTAbstractTask", CiatElementTypes.CTTAbstractTask_3053); //$NON-NLS-1$
		case InteractiveTaskEditPart.VISUAL_ID:
			return getImage("Navigator?Node?ciat?InteractiveTask", CiatElementTypes.InteractiveTask_3054); //$NON-NLS-1$
		case CTTCollaborativeTaskEditPart.VISUAL_ID:
			return getImage("Navigator?Node?ciat?CTTCollaborativeTask", CiatElementTypes.CTTCollaborativeTask_3055); //$NON-NLS-1$
		case ApplicationTaskEditPart.VISUAL_ID:
			return getImage("Navigator?Node?ciat?ApplicationTask", CiatElementTypes.ApplicationTask_3056); //$NON-NLS-1$
		case InheritanceEditPart.VISUAL_ID:
			return getImage("Navigator?Link?ciat?Inheritance", CiatElementTypes.Inheritance_4001); //$NON-NLS-1$
		case ActingEditPart.VISUAL_ID:
			return getImage("Navigator?Link?ciat?Acting", CiatElementTypes.Acting_4002); //$NON-NLS-1$
		case AssociationEditPart.VISUAL_ID:
			return getImage("Navigator?Link?ciat?Association", CiatElementTypes.Association_4003); //$NON-NLS-1$
		case ShAssociationLinkEditPart.VISUAL_ID:
			return getImage("Navigator?Link?ciat?ShAssociationLink", CiatElementTypes.ShAssociationLink_4004); //$NON-NLS-1$
		case ShGeneralizationLinkEditPart.VISUAL_ID:
			return getImage("Navigator?Link?ciat?ShGeneralizationLink", CiatElementTypes.ShGeneralizationLink_4005); //$NON-NLS-1$
		case ShAggregationLinkEditPart.VISUAL_ID:
			return getImage("Navigator?Link?ciat?ShAggregationLink", CiatElementTypes.ShAggregationLink_4006); //$NON-NLS-1$
		case AggregationEditPart.VISUAL_ID:
			return getImage("Navigator?Link?ciat?Aggregation", CiatElementTypes.Aggregation_4007); //$NON-NLS-1$
		case EnablingEditPart.VISUAL_ID:
			return getImage("Navigator?Link?ciat?Enabling", CiatElementTypes.Enabling_4008); //$NON-NLS-1$
		case DisablingEditPart.VISUAL_ID:
			return getImage("Navigator?Link?ciat?Disabling", CiatElementTypes.Disabling_4009); //$NON-NLS-1$
		case EnablingWithInformationPassingEditPart.VISUAL_ID:
			return getImage("Navigator?Link?ciat?EnablingWithInformationPassing", //$NON-NLS-1$
					CiatElementTypes.EnablingWithInformationPassing_4010);
		case DisablingWithInformationPassingEditPart.VISUAL_ID:
			return getImage("Navigator?Link?ciat?DisablingWithInformationPassing", //$NON-NLS-1$
					CiatElementTypes.DisablingWithInformationPassing_4011);
		case IndependentConcurrencyEditPart.VISUAL_ID:
			return getImage("Navigator?Link?ciat?IndependentConcurrency", CiatElementTypes.IndependentConcurrency_4012); //$NON-NLS-1$
		case OrderIndependenceEditPart.VISUAL_ID:
			return getImage("Navigator?Link?ciat?OrderIndependence", CiatElementTypes.OrderIndependence_4013); //$NON-NLS-1$
		case SuspendResumeEditPart.VISUAL_ID:
			return getImage("Navigator?Link?ciat?SuspendResume", CiatElementTypes.SuspendResume_4014); //$NON-NLS-1$
		case ConcurrencyWithInformationPassingEditPart.VISUAL_ID:
			return getImage("Navigator?Link?ciat?ConcurrencyWithInformationPassing", //$NON-NLS-1$
					CiatElementTypes.ConcurrencyWithInformationPassing_4015);
		case DeterministicChoiceEditPart.VISUAL_ID:
			return getImage("Navigator?Link?ciat?DeterministicChoice", CiatElementTypes.DeterministicChoice_4016); //$NON-NLS-1$
		case UndeterministicChoiceEditPart.VISUAL_ID:
			return getImage("Navigator?Link?ciat?UndeterministicChoice", CiatElementTypes.UndeterministicChoice_4017); //$NON-NLS-1$
		}
		return getImage("Navigator?UnknownElement", null); //$NON-NLS-1$
	}

	/**
	* @generated
	*/
	private Image getImage(String key, IElementType elementType) {
		ImageRegistry imageRegistry = CiatDiagramEditorPlugin.getInstance().getImageRegistry();
		Image image = imageRegistry.get(key);
		if (image == null && elementType != null && CiatElementTypes.isKnownElementType(elementType)) {
			image = CiatElementTypes.getImage(elementType);
			imageRegistry.put(key, image);
		}

		if (image == null) {
			image = imageRegistry.get("Navigator?ImageNotFound"); //$NON-NLS-1$
			imageRegistry.put(key, image);
		}
		return image;
	}

	/**
	* @generated
	*/
	public String getText(Object element) {
		if (element instanceof CiatNavigatorGroup) {
			CiatNavigatorGroup group = (CiatNavigatorGroup) element;
			return group.getGroupName();
		}

		if (element instanceof CiatNavigatorItem) {
			CiatNavigatorItem navigatorItem = (CiatNavigatorItem) element;
			if (!isOwnView(navigatorItem.getView())) {
				return null;
			}
			return getText(navigatorItem.getView());
		}

		// Due to plugin.xml content will be called only for "own" views
		if (element instanceof IAdaptable) {
			View view = (View) ((IAdaptable) element).getAdapter(View.class);
			if (view != null && isOwnView(view)) {
				return getText(view);
			}
		}

		return super.getText(element);
	}

	/**
	* @generated
	*/
	public String getText(View view) {
		if (view.getElement() != null && view.getElement().eIsProxy()) {
			return getUnresolvedDomainElementProxyText(view);
		}
		switch (CiatVisualIDRegistry.getVisualID(view)) {
		case CIATDiagramEditPart.VISUAL_ID:
			return getCIATDiagram_1000Text(view);
		case SociogramEditPart.VISUAL_ID:
			return getSociogram_2001Text(view);
		case ProcessDiagramEditPart.VISUAL_ID:
			return getProcessDiagram_2002Text(view);
		case DomainDiagramEditPart.VISUAL_ID:
			return getDomainDiagram_2003Text(view);
		case CTTDiagramEditPart.VISUAL_ID:
			return getCTTDiagram_2004Text(view);
		case RolEditPart.VISUAL_ID:
			return getRol_3001Text(view);
		case ActorEditPart.VISUAL_ID:
			return getActor_3002Text(view);
		case SoftwareAgentEditPart.VISUAL_ID:
			return getSoftwareAgent_3003Text(view);
		case TeamEditPart.VISUAL_ID:
			return getTeam_3004Text(view);
		case GroupEditPart.VISUAL_ID:
			return getGroup_3005Text(view);
		case IndividualTaskEditPart.VISUAL_ID:
			return getIndividualTask_3006Text(view);
		case Rol2EditPart.VISUAL_ID:
			return getRol_3007Text(view);
		case Actor2EditPart.VISUAL_ID:
			return getActor_3008Text(view);
		case SoftwareAgent2EditPart.VISUAL_ID:
			return getSoftwareAgent_3009Text(view);
		case Team2EditPart.VISUAL_ID:
			return getTeam_3010Text(view);
		case Group2EditPart.VISUAL_ID:
			return getGroup_3011Text(view);
		case ToolEditPart.VISUAL_ID:
			return getTool_3012Text(view);
		case ObjectEditPart.VISUAL_ID:
			return getObject_3013Text(view);
		case CooperativeTaskEditPart.VISUAL_ID:
			return getCooperativeTask_3014Text(view);
		case Rol3EditPart.VISUAL_ID:
			return getRol_3015Text(view);
		case Actor3EditPart.VISUAL_ID:
			return getActor_3016Text(view);
		case SoftwareAgent3EditPart.VISUAL_ID:
			return getSoftwareAgent_3017Text(view);
		case Team3EditPart.VISUAL_ID:
			return getTeam_3018Text(view);
		case Group3EditPart.VISUAL_ID:
			return getGroup_3019Text(view);
		case Object2EditPart.VISUAL_ID:
			return getObject_3020Text(view);
		case CollaborativeTaskEditPart.VISUAL_ID:
			return getCollaborativeTask_3021Text(view);
		case Rol4EditPart.VISUAL_ID:
			return getRol_3022Text(view);
		case Actor4EditPart.VISUAL_ID:
			return getActor_3023Text(view);
		case SoftwareAgent4EditPart.VISUAL_ID:
			return getSoftwareAgent_3024Text(view);
		case Team4EditPart.VISUAL_ID:
			return getTeam_3025Text(view);
		case Group4EditPart.VISUAL_ID:
			return getGroup_3026Text(view);
		case Object3EditPart.VISUAL_ID:
			return getObject_3027Text(view);
		case AbstractTaskEditPart.VISUAL_ID:
			return getAbstractTask_3028Text(view);
		case IndividualTask2EditPart.VISUAL_ID:
			return getIndividualTask_3029Text(view);
		case CooperativeTask2EditPart.VISUAL_ID:
			return getCooperativeTask_3030Text(view);
		case CollaborativeTask2EditPart.VISUAL_ID:
			return getCollaborativeTask_3031Text(view);
		case AbstractTask2EditPart.VISUAL_ID:
			return getAbstractTask_3032Text(view);
		case InitEditPart.VISUAL_ID:
			return getInit_3033Text(view);
		case EndEditPart.VISUAL_ID:
			return getEnd_3034Text(view);
		case TemporalConditionEditPart.VISUAL_ID:
			return getTemporalCondition_3035Text(view);
		case NotificationEditPart.VISUAL_ID:
			return getNotification_3036Text(view);
		case ConditionEditPart.VISUAL_ID:
			return getCondition_3037Text(view);
		case Init2EditPart.VISUAL_ID:
			return getInit_3038Text(view);
		case End2EditPart.VISUAL_ID:
			return getEnd_3039Text(view);
		case TemporalCondition2EditPart.VISUAL_ID:
			return getTemporalCondition_3040Text(view);
		case Notification2EditPart.VISUAL_ID:
			return getNotification_3041Text(view);
		case Condition2EditPart.VISUAL_ID:
			return getCondition_3042Text(view);
		case SharedObjectEditPart.VISUAL_ID:
			return getSharedObject_3043Text(view);
		case ExclusiveEditionAreaEditPart.VISUAL_ID:
			return getExclusiveEditionArea_3044Text(view);
		case CollaborativeAreaEditPart.VISUAL_ID:
			return getCollaborativeArea_3045Text(view);
		case IndividualAreaEditPart.VISUAL_ID:
			return getIndividualArea_3046Text(view);
		case AttributeEditPart.VISUAL_ID:
			return getAttribute_3047Text(view);
		case OperationEditPart.VISUAL_ID:
			return getOperation_3048Text(view);
		case ExclusiveEditionEditPart.VISUAL_ID:
			return getExclusiveEdition_3049Text(view);
		case CollaborativeVisualizationEditPart.VISUAL_ID:
			return getCollaborativeVisualization_3050Text(view);
		case IndividualVisualizationEditPart.VISUAL_ID:
			return getIndividualVisualization_3051Text(view);
		case UserTaskEditPart.VISUAL_ID:
			return getUserTask_3052Text(view);
		case CTTAbstractTaskEditPart.VISUAL_ID:
			return getCTTAbstractTask_3053Text(view);
		case InteractiveTaskEditPart.VISUAL_ID:
			return getInteractiveTask_3054Text(view);
		case CTTCollaborativeTaskEditPart.VISUAL_ID:
			return getCTTCollaborativeTask_3055Text(view);
		case ApplicationTaskEditPart.VISUAL_ID:
			return getApplicationTask_3056Text(view);
		case InheritanceEditPart.VISUAL_ID:
			return getInheritance_4001Text(view);
		case ActingEditPart.VISUAL_ID:
			return getActing_4002Text(view);
		case AssociationEditPart.VISUAL_ID:
			return getAssociation_4003Text(view);
		case ShAssociationLinkEditPart.VISUAL_ID:
			return getShAssociationLink_4004Text(view);
		case ShGeneralizationLinkEditPart.VISUAL_ID:
			return getShGeneralizationLink_4005Text(view);
		case ShAggregationLinkEditPart.VISUAL_ID:
			return getShAggregationLink_4006Text(view);
		case AggregationEditPart.VISUAL_ID:
			return getAggregation_4007Text(view);
		case EnablingEditPart.VISUAL_ID:
			return getEnabling_4008Text(view);
		case DisablingEditPart.VISUAL_ID:
			return getDisabling_4009Text(view);
		case EnablingWithInformationPassingEditPart.VISUAL_ID:
			return getEnablingWithInformationPassing_4010Text(view);
		case DisablingWithInformationPassingEditPart.VISUAL_ID:
			return getDisablingWithInformationPassing_4011Text(view);
		case IndependentConcurrencyEditPart.VISUAL_ID:
			return getIndependentConcurrency_4012Text(view);
		case OrderIndependenceEditPart.VISUAL_ID:
			return getOrderIndependence_4013Text(view);
		case SuspendResumeEditPart.VISUAL_ID:
			return getSuspendResume_4014Text(view);
		case ConcurrencyWithInformationPassingEditPart.VISUAL_ID:
			return getConcurrencyWithInformationPassing_4015Text(view);
		case DeterministicChoiceEditPart.VISUAL_ID:
			return getDeterministicChoice_4016Text(view);
		case UndeterministicChoiceEditPart.VISUAL_ID:
			return getUndeterministicChoice_4017Text(view);
		}
		return getUnknownElementText(view);
	}

	/**
	* @generated
	*/
	private String getCIATDiagram_1000Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	* @generated
	*/
	private String getSociogram_2001Text(View view) {
		IParser parser = CiatParserProvider.getParser(CiatElementTypes.Sociogram_2001,
				view.getElement() != null ? view.getElement() : view,
				CiatVisualIDRegistry.getType(SociogramNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			CiatDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5006); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getProcessDiagram_2002Text(View view) {
		IParser parser = CiatParserProvider.getParser(CiatElementTypes.ProcessDiagram_2002,
				view.getElement() != null ? view.getElement() : view,
				CiatVisualIDRegistry.getType(ProcessDiagramNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			CiatDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5044); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getDomainDiagram_2003Text(View view) {
		IParser parser = CiatParserProvider.getParser(CiatElementTypes.DomainDiagram_2003,
				view.getElement() != null ? view.getElement() : view,
				CiatVisualIDRegistry.getType(DomainDiagramNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			CiatDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5051); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getCTTDiagram_2004Text(View view) {
		IParser parser = CiatParserProvider.getParser(CiatElementTypes.CTTDiagram_2004,
				view.getElement() != null ? view.getElement() : view,
				CiatVisualIDRegistry.getType(CTTDiagramNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			CiatDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5060); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getRol_3001Text(View view) {
		IParser parser = CiatParserProvider.getParser(CiatElementTypes.Rol_3001,
				view.getElement() != null ? view.getElement() : view,
				CiatVisualIDRegistry.getType(RolNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			CiatDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5001); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getActor_3002Text(View view) {
		IParser parser = CiatParserProvider.getParser(CiatElementTypes.Actor_3002,
				view.getElement() != null ? view.getElement() : view,
				CiatVisualIDRegistry.getType(ActorNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			CiatDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5002); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getSoftwareAgent_3003Text(View view) {
		IParser parser = CiatParserProvider.getParser(CiatElementTypes.SoftwareAgent_3003,
				view.getElement() != null ? view.getElement() : view,
				CiatVisualIDRegistry.getType(SoftwareAgentNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			CiatDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5003); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getTeam_3004Text(View view) {
		IParser parser = CiatParserProvider.getParser(CiatElementTypes.Team_3004,
				view.getElement() != null ? view.getElement() : view,
				CiatVisualIDRegistry.getType(TeamNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			CiatDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5004); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getGroup_3005Text(View view) {
		IParser parser = CiatParserProvider.getParser(CiatElementTypes.Group_3005,
				view.getElement() != null ? view.getElement() : view,
				CiatVisualIDRegistry.getType(GroupNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			CiatDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5005); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getIndividualTask_3006Text(View view) {
		IParser parser = CiatParserProvider.getParser(CiatElementTypes.IndividualTask_3006,
				view.getElement() != null ? view.getElement() : view,
				CiatVisualIDRegistry.getType(IndividualTaskNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			CiatDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5014); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getRol_3007Text(View view) {
		IParser parser = CiatParserProvider.getParser(CiatElementTypes.Rol_3007,
				view.getElement() != null ? view.getElement() : view,
				CiatVisualIDRegistry.getType(RolName2EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			CiatDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5007); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getActor_3008Text(View view) {
		IParser parser = CiatParserProvider.getParser(CiatElementTypes.Actor_3008,
				view.getElement() != null ? view.getElement() : view,
				CiatVisualIDRegistry.getType(ActorName2EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			CiatDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5008); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getSoftwareAgent_3009Text(View view) {
		IParser parser = CiatParserProvider.getParser(CiatElementTypes.SoftwareAgent_3009,
				view.getElement() != null ? view.getElement() : view,
				CiatVisualIDRegistry.getType(SoftwareAgentName2EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			CiatDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5009); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getTeam_3010Text(View view) {
		IParser parser = CiatParserProvider.getParser(CiatElementTypes.Team_3010,
				view.getElement() != null ? view.getElement() : view,
				CiatVisualIDRegistry.getType(TeamName2EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			CiatDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5010); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getGroup_3011Text(View view) {
		IParser parser = CiatParserProvider.getParser(CiatElementTypes.Group_3011,
				view.getElement() != null ? view.getElement() : view,
				CiatVisualIDRegistry.getType(GroupName2EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			CiatDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5011); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getTool_3012Text(View view) {
		IParser parser = CiatParserProvider.getParser(CiatElementTypes.Tool_3012,
				view.getElement() != null ? view.getElement() : view,
				CiatVisualIDRegistry.getType(ToolNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			CiatDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5012); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getObject_3013Text(View view) {
		IParser parser = CiatParserProvider.getParser(CiatElementTypes.Object_3013,
				view.getElement() != null ? view.getElement() : view,
				CiatVisualIDRegistry.getType(ObjectNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			CiatDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5013); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getCooperativeTask_3014Text(View view) {
		IParser parser = CiatParserProvider.getParser(CiatElementTypes.CooperativeTask_3014,
				view.getElement() != null ? view.getElement() : view,
				CiatVisualIDRegistry.getType(CooperativeTaskNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			CiatDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5021); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getRol_3015Text(View view) {
		IParser parser = CiatParserProvider.getParser(CiatElementTypes.Rol_3015,
				view.getElement() != null ? view.getElement() : view,
				CiatVisualIDRegistry.getType(RolName3EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			CiatDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5015); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getActor_3016Text(View view) {
		IParser parser = CiatParserProvider.getParser(CiatElementTypes.Actor_3016,
				view.getElement() != null ? view.getElement() : view,
				CiatVisualIDRegistry.getType(ActorName3EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			CiatDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5016); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getSoftwareAgent_3017Text(View view) {
		IParser parser = CiatParserProvider.getParser(CiatElementTypes.SoftwareAgent_3017,
				view.getElement() != null ? view.getElement() : view,
				CiatVisualIDRegistry.getType(SoftwareAgentName3EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			CiatDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5017); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getTeam_3018Text(View view) {
		IParser parser = CiatParserProvider.getParser(CiatElementTypes.Team_3018,
				view.getElement() != null ? view.getElement() : view,
				CiatVisualIDRegistry.getType(TeamName3EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			CiatDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5018); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getGroup_3019Text(View view) {
		IParser parser = CiatParserProvider.getParser(CiatElementTypes.Group_3019,
				view.getElement() != null ? view.getElement() : view,
				CiatVisualIDRegistry.getType(GroupName3EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			CiatDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5019); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getObject_3020Text(View view) {
		IParser parser = CiatParserProvider.getParser(CiatElementTypes.Object_3020,
				view.getElement() != null ? view.getElement() : view,
				CiatVisualIDRegistry.getType(ObjectName2EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			CiatDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5020); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getCollaborativeTask_3021Text(View view) {
		IParser parser = CiatParserProvider.getParser(CiatElementTypes.CollaborativeTask_3021,
				view.getElement() != null ? view.getElement() : view,
				CiatVisualIDRegistry.getType(CollaborativeTaskNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			CiatDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5028); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getRol_3022Text(View view) {
		IParser parser = CiatParserProvider.getParser(CiatElementTypes.Rol_3022,
				view.getElement() != null ? view.getElement() : view,
				CiatVisualIDRegistry.getType(RolName4EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			CiatDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5022); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getActor_3023Text(View view) {
		IParser parser = CiatParserProvider.getParser(CiatElementTypes.Actor_3023,
				view.getElement() != null ? view.getElement() : view,
				CiatVisualIDRegistry.getType(ActorName4EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			CiatDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5023); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getSoftwareAgent_3024Text(View view) {
		IParser parser = CiatParserProvider.getParser(CiatElementTypes.SoftwareAgent_3024,
				view.getElement() != null ? view.getElement() : view,
				CiatVisualIDRegistry.getType(SoftwareAgentName4EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			CiatDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5024); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getTeam_3025Text(View view) {
		IParser parser = CiatParserProvider.getParser(CiatElementTypes.Team_3025,
				view.getElement() != null ? view.getElement() : view,
				CiatVisualIDRegistry.getType(TeamName4EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			CiatDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5025); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getGroup_3026Text(View view) {
		IParser parser = CiatParserProvider.getParser(CiatElementTypes.Group_3026,
				view.getElement() != null ? view.getElement() : view,
				CiatVisualIDRegistry.getType(GroupName4EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			CiatDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5026); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getObject_3027Text(View view) {
		IParser parser = CiatParserProvider.getParser(CiatElementTypes.Object_3027,
				view.getElement() != null ? view.getElement() : view,
				CiatVisualIDRegistry.getType(ObjectName3EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			CiatDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5027); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getAbstractTask_3028Text(View view) {
		IParser parser = CiatParserProvider.getParser(CiatElementTypes.AbstractTask_3028,
				view.getElement() != null ? view.getElement() : view,
				CiatVisualIDRegistry.getType(AbstractTaskNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			CiatDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5038); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getIndividualTask_3029Text(View view) {
		IParser parser = CiatParserProvider.getParser(CiatElementTypes.IndividualTask_3029,
				view.getElement() != null ? view.getElement() : view,
				CiatVisualIDRegistry.getType(IndividualTaskName2EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			CiatDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5029); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getCooperativeTask_3030Text(View view) {
		IParser parser = CiatParserProvider.getParser(CiatElementTypes.CooperativeTask_3030,
				view.getElement() != null ? view.getElement() : view,
				CiatVisualIDRegistry.getType(CooperativeTaskName2EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			CiatDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5030); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getCollaborativeTask_3031Text(View view) {
		IParser parser = CiatParserProvider.getParser(CiatElementTypes.CollaborativeTask_3031,
				view.getElement() != null ? view.getElement() : view,
				CiatVisualIDRegistry.getType(CollaborativeTaskName2EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			CiatDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5031); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getAbstractTask_3032Text(View view) {
		IParser parser = CiatParserProvider.getParser(CiatElementTypes.AbstractTask_3032,
				view.getElement() != null ? view.getElement() : view,
				CiatVisualIDRegistry.getType(AbstractTaskName2EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			CiatDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5037); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getInit_3033Text(View view) {
		IParser parser = CiatParserProvider.getParser(CiatElementTypes.Init_3033,
				view.getElement() != null ? view.getElement() : view,
				CiatVisualIDRegistry.getType(InitNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			CiatDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5032); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getEnd_3034Text(View view) {
		IParser parser = CiatParserProvider.getParser(CiatElementTypes.End_3034,
				view.getElement() != null ? view.getElement() : view,
				CiatVisualIDRegistry.getType(EndNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			CiatDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5033); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getTemporalCondition_3035Text(View view) {
		IParser parser = CiatParserProvider.getParser(CiatElementTypes.TemporalCondition_3035,
				view.getElement() != null ? view.getElement() : view,
				CiatVisualIDRegistry.getType(TemporalConditionNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			CiatDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5034); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getNotification_3036Text(View view) {
		IParser parser = CiatParserProvider.getParser(CiatElementTypes.Notification_3036,
				view.getElement() != null ? view.getElement() : view,
				CiatVisualIDRegistry.getType(NotificationNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			CiatDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5035); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getCondition_3037Text(View view) {
		IParser parser = CiatParserProvider.getParser(CiatElementTypes.Condition_3037,
				view.getElement() != null ? view.getElement() : view,
				CiatVisualIDRegistry.getType(ConditionNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			CiatDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5036); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getInit_3038Text(View view) {
		IParser parser = CiatParserProvider.getParser(CiatElementTypes.Init_3038,
				view.getElement() != null ? view.getElement() : view,
				CiatVisualIDRegistry.getType(InitName2EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			CiatDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5039); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getEnd_3039Text(View view) {
		IParser parser = CiatParserProvider.getParser(CiatElementTypes.End_3039,
				view.getElement() != null ? view.getElement() : view,
				CiatVisualIDRegistry.getType(EndName2EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			CiatDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5040); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getTemporalCondition_3040Text(View view) {
		IParser parser = CiatParserProvider.getParser(CiatElementTypes.TemporalCondition_3040,
				view.getElement() != null ? view.getElement() : view,
				CiatVisualIDRegistry.getType(TemporalConditionName2EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			CiatDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5041); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getNotification_3041Text(View view) {
		IParser parser = CiatParserProvider.getParser(CiatElementTypes.Notification_3041,
				view.getElement() != null ? view.getElement() : view,
				CiatVisualIDRegistry.getType(NotificationName2EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			CiatDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5042); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getCondition_3042Text(View view) {
		IParser parser = CiatParserProvider.getParser(CiatElementTypes.Condition_3042,
				view.getElement() != null ? view.getElement() : view,
				CiatVisualIDRegistry.getType(ConditionName2EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			CiatDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5043); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getSharedObject_3043Text(View view) {
		IParser parser = CiatParserProvider.getParser(CiatElementTypes.SharedObject_3043,
				view.getElement() != null ? view.getElement() : view,
				CiatVisualIDRegistry.getType(SharedObjectNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			CiatDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5050); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getExclusiveEditionArea_3044Text(View view) {
		IParser parser = CiatParserProvider.getParser(CiatElementTypes.ExclusiveEditionArea_3044,
				view.getElement() != null ? view.getElement() : view,
				CiatVisualIDRegistry.getType(ExclusiveEditionAreaNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			CiatDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5045); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getCollaborativeArea_3045Text(View view) {
		IParser parser = CiatParserProvider.getParser(CiatElementTypes.CollaborativeArea_3045,
				view.getElement() != null ? view.getElement() : view,
				CiatVisualIDRegistry.getType(CollaborativeAreaNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			CiatDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5046); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getIndividualArea_3046Text(View view) {
		IParser parser = CiatParserProvider.getParser(CiatElementTypes.IndividualArea_3046,
				view.getElement() != null ? view.getElement() : view,
				CiatVisualIDRegistry.getType(IndividualAreaNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			CiatDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5047); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getAttribute_3047Text(View view) {
		IParser parser = CiatParserProvider.getParser(CiatElementTypes.Attribute_3047,
				view.getElement() != null ? view.getElement() : view,
				CiatVisualIDRegistry.getType(AttributeNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			CiatDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5048); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getOperation_3048Text(View view) {
		IParser parser = CiatParserProvider.getParser(CiatElementTypes.Operation_3048,
				view.getElement() != null ? view.getElement() : view,
				CiatVisualIDRegistry.getType(OperationNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			CiatDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5049); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getExclusiveEdition_3049Text(View view) {
		IParser parser = CiatParserProvider.getParser(CiatElementTypes.ExclusiveEdition_3049,
				view.getElement() != null ? view.getElement() : view,
				CiatVisualIDRegistry.getType(ExclusiveEditionNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			CiatDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5052); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getCollaborativeVisualization_3050Text(View view) {
		IParser parser = CiatParserProvider.getParser(CiatElementTypes.CollaborativeVisualization_3050,
				view.getElement() != null ? view.getElement() : view,
				CiatVisualIDRegistry.getType(CollaborativeVisualizationNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			CiatDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5053); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getIndividualVisualization_3051Text(View view) {
		IParser parser = CiatParserProvider.getParser(CiatElementTypes.IndividualVisualization_3051,
				view.getElement() != null ? view.getElement() : view,
				CiatVisualIDRegistry.getType(IndividualVisualizationNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			CiatDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5054); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getUserTask_3052Text(View view) {
		IParser parser = CiatParserProvider.getParser(CiatElementTypes.UserTask_3052,
				view.getElement() != null ? view.getElement() : view,
				CiatVisualIDRegistry.getType(UserTaskNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			CiatDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5055); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getCTTAbstractTask_3053Text(View view) {
		IParser parser = CiatParserProvider.getParser(CiatElementTypes.CTTAbstractTask_3053,
				view.getElement() != null ? view.getElement() : view,
				CiatVisualIDRegistry.getType(CTTAbstractTaskNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			CiatDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5056); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getInteractiveTask_3054Text(View view) {
		IParser parser = CiatParserProvider.getParser(CiatElementTypes.InteractiveTask_3054,
				view.getElement() != null ? view.getElement() : view,
				CiatVisualIDRegistry.getType(InteractiveTaskNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			CiatDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5057); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getCTTCollaborativeTask_3055Text(View view) {
		IParser parser = CiatParserProvider.getParser(CiatElementTypes.CTTCollaborativeTask_3055,
				view.getElement() != null ? view.getElement() : view,
				CiatVisualIDRegistry.getType(CTTCollaborativeTaskNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			CiatDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5058); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getApplicationTask_3056Text(View view) {
		IParser parser = CiatParserProvider.getParser(CiatElementTypes.ApplicationTask_3056,
				view.getElement() != null ? view.getElement() : view,
				CiatVisualIDRegistry.getType(ApplicationTaskNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			CiatDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5059); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getInheritance_4001Text(View view) {
		IParser parser = CiatParserProvider.getParser(CiatElementTypes.Inheritance_4001,
				view.getElement() != null ? view.getElement() : view,
				CiatVisualIDRegistry.getType(InheritanceConditionEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			CiatDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 6001); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getActing_4002Text(View view) {
		IParser parser = CiatParserProvider.getParser(CiatElementTypes.Acting_4002,
				view.getElement() != null ? view.getElement() : view,
				CiatVisualIDRegistry.getType(ActingNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			CiatDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 6002); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getAssociation_4003Text(View view) {
		IParser parser = CiatParserProvider.getParser(CiatElementTypes.Association_4003,
				view.getElement() != null ? view.getElement() : view,
				CiatVisualIDRegistry.getType(AssociationNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			CiatDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 6003); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getShAssociationLink_4004Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	* @generated
	*/
	private String getShGeneralizationLink_4005Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	* @generated
	*/
	private String getShAggregationLink_4006Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	* @generated
	*/
	private String getAggregation_4007Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	* @generated
	*/
	private String getEnabling_4008Text(View view) {
		IParser parser = CiatParserProvider.getParser(CiatElementTypes.Enabling_4008,
				view.getElement() != null ? view.getElement() : view,
				CiatVisualIDRegistry.getType(EnablingELabelEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			CiatDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 6004); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getDisabling_4009Text(View view) {
		IParser parser = CiatParserProvider.getParser(CiatElementTypes.Disabling_4009,
				view.getElement() != null ? view.getElement() : view,
				CiatVisualIDRegistry.getType(DisablingDLabelEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			CiatDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 6005); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getEnablingWithInformationPassing_4010Text(View view) {
		IParser parser = CiatParserProvider.getParser(CiatElementTypes.EnablingWithInformationPassing_4010,
				view.getElement() != null ? view.getElement() : view,
				CiatVisualIDRegistry.getType(EnablingWithInformationPassingEwLabelEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			CiatDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 6006); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getDisablingWithInformationPassing_4011Text(View view) {
		IParser parser = CiatParserProvider.getParser(CiatElementTypes.DisablingWithInformationPassing_4011,
				view.getElement() != null ? view.getElement() : view,
				CiatVisualIDRegistry.getType(DisablingWithInformationPassingDwLabelEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			CiatDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 6007); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getIndependentConcurrency_4012Text(View view) {
		IParser parser = CiatParserProvider.getParser(CiatElementTypes.IndependentConcurrency_4012,
				view.getElement() != null ? view.getElement() : view,
				CiatVisualIDRegistry.getType(IndependentConcurrencyIcLabelEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			CiatDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 6008); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getOrderIndependence_4013Text(View view) {
		IParser parser = CiatParserProvider.getParser(CiatElementTypes.OrderIndependence_4013,
				view.getElement() != null ? view.getElement() : view,
				CiatVisualIDRegistry.getType(OrderIndependenceOiLabelEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			CiatDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 6009); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getSuspendResume_4014Text(View view) {
		IParser parser = CiatParserProvider.getParser(CiatElementTypes.SuspendResume_4014,
				view.getElement() != null ? view.getElement() : view,
				CiatVisualIDRegistry.getType(SuspendResumeSrLabelEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			CiatDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 6010); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getConcurrencyWithInformationPassing_4015Text(View view) {
		IParser parser = CiatParserProvider.getParser(CiatElementTypes.ConcurrencyWithInformationPassing_4015,
				view.getElement() != null ? view.getElement() : view,
				CiatVisualIDRegistry.getType(ConcurrencyWithInformationPassingCLabelEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			CiatDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 6011); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getDeterministicChoice_4016Text(View view) {
		IParser parser = CiatParserProvider.getParser(CiatElementTypes.DeterministicChoice_4016,
				view.getElement() != null ? view.getElement() : view,
				CiatVisualIDRegistry.getType(DeterministicChoiceDtLabelEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			CiatDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 6012); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getUndeterministicChoice_4017Text(View view) {
		IParser parser = CiatParserProvider.getParser(CiatElementTypes.UndeterministicChoice_4017,
				view.getElement() != null ? view.getElement() : view,
				CiatVisualIDRegistry.getType(UndeterministicChoiceUcLabelEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			CiatDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 6013); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getUnknownElementText(View view) {
		return "<UnknownElement Visual_ID = " + view.getType() + ">"; //$NON-NLS-1$  //$NON-NLS-2$
	}

	/**
	* @generated
	*/
	private String getUnresolvedDomainElementProxyText(View view) {
		return "<Unresolved domain element Visual_ID = " + view.getType() + ">"; //$NON-NLS-1$  //$NON-NLS-2$
	}

	/**
	* @generated
	*/
	public void init(ICommonContentExtensionSite aConfig) {
	}

	/**
	* @generated
	*/
	public void restoreState(IMemento aMemento) {
	}

	/**
	* @generated
	*/
	public void saveState(IMemento aMemento) {
	}

	/**
	* @generated
	*/
	public String getDescription(Object anElement) {
		return null;
	}

	/**
	* @generated
	*/
	private boolean isOwnView(View view) {
		return CIATDiagramEditPart.MODEL_ID.equals(CiatVisualIDRegistry.getModelID(view));
	}

}
