/*
* 
*/
package ciat.diagram.part;

import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.structure.DiagramStructure;

import ciat.CIATDiagram;
import ciat.CiatPackage;
import ciat.diagram.edit.parts.*;

/**
 * This registry is used to determine which type of visual object should be
 * created for the corresponding Diagram, Node, ChildNode or Link represented
 * by a domain model object.
 * 
 * @generated
 */
public class CiatVisualIDRegistry {

	/**
	* @generated
	*/
	private static final String DEBUG_KEY = "org.chico.ciat.diagram/debug/visualID"; //$NON-NLS-1$

	/**
	* @generated
	*/
	public static int getVisualID(View view) {
		if (view instanceof Diagram) {
			if (CIATDiagramEditPart.MODEL_ID.equals(view.getType())) {
				return CIATDiagramEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		return ciat.diagram.part.CiatVisualIDRegistry.getVisualID(view.getType());
	}

	/**
	* @generated
	*/
	public static String getModelID(View view) {
		View diagram = view.getDiagram();
		while (view != diagram) {
			EAnnotation annotation = view.getEAnnotation("Shortcut"); //$NON-NLS-1$
			if (annotation != null) {
				return (String) annotation.getDetails().get("modelID"); //$NON-NLS-1$
			}
			view = (View) view.eContainer();
		}
		return diagram != null ? diagram.getType() : null;
	}

	/**
	* @generated
	*/
	public static int getVisualID(String type) {
		try {
			return Integer.parseInt(type);
		} catch (NumberFormatException e) {
			if (Boolean.TRUE.toString().equalsIgnoreCase(Platform.getDebugOption(DEBUG_KEY))) {
				CiatDiagramEditorPlugin.getInstance()
						.logError("Unable to parse view type as a visualID number: " + type);
			}
		}
		return -1;
	}

	/**
	* @generated
	*/
	public static String getType(int visualID) {
		return Integer.toString(visualID);
	}

	/**
	* @generated
	*/
	public static int getDiagramVisualID(EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		if (CiatPackage.eINSTANCE.getCIATDiagram().isSuperTypeOf(domainElement.eClass())
				&& isDiagram((CIATDiagram) domainElement)) {
			return CIATDiagramEditPart.VISUAL_ID;
		}
		return -1;
	}

	/**
	* @generated
	*/
	public static int getNodeVisualID(View containerView, EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		String containerModelID = ciat.diagram.part.CiatVisualIDRegistry.getModelID(containerView);
		if (!CIATDiagramEditPart.MODEL_ID.equals(containerModelID) && !"ciat".equals(containerModelID)) { //$NON-NLS-1$
			return -1;
		}
		int containerVisualID;
		if (CIATDiagramEditPart.MODEL_ID.equals(containerModelID)) {
			containerVisualID = ciat.diagram.part.CiatVisualIDRegistry.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = CIATDiagramEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		switch (containerVisualID) {
		case CIATDiagramEditPart.VISUAL_ID:
			if (CiatPackage.eINSTANCE.getSociogram().isSuperTypeOf(domainElement.eClass())) {
				return SociogramEditPart.VISUAL_ID;
			}
			if (CiatPackage.eINSTANCE.getProcessDiagram().isSuperTypeOf(domainElement.eClass())) {
				return ProcessDiagramEditPart.VISUAL_ID;
			}
			if (CiatPackage.eINSTANCE.getDomainDiagram().isSuperTypeOf(domainElement.eClass())) {
				return DomainDiagramEditPart.VISUAL_ID;
			}
			if (CiatPackage.eINSTANCE.getCTTDiagram().isSuperTypeOf(domainElement.eClass())) {
				return CTTDiagramEditPart.VISUAL_ID;
			}
			break;
		case IndividualTaskEditPart.VISUAL_ID:
			if (CiatPackage.eINSTANCE.getTool().isSuperTypeOf(domainElement.eClass())) {
				return ToolEditPart.VISUAL_ID;
			}
			break;
		case CooperativeTaskEditPart.VISUAL_ID:
			if (CiatPackage.eINSTANCE.getTool().isSuperTypeOf(domainElement.eClass())) {
				return ToolEditPart.VISUAL_ID;
			}
			break;
		case CollaborativeTaskEditPart.VISUAL_ID:
			if (CiatPackage.eINSTANCE.getTool().isSuperTypeOf(domainElement.eClass())) {
				return ToolEditPart.VISUAL_ID;
			}
			break;
		case AbstractTaskEditPart.VISUAL_ID:
			if (CiatPackage.eINSTANCE.getTool().isSuperTypeOf(domainElement.eClass())) {
				return ToolEditPart.VISUAL_ID;
			}
			break;
		case IndividualTask2EditPart.VISUAL_ID:
			if (CiatPackage.eINSTANCE.getTool().isSuperTypeOf(domainElement.eClass())) {
				return ToolEditPart.VISUAL_ID;
			}
			break;
		case CooperativeTask2EditPart.VISUAL_ID:
			if (CiatPackage.eINSTANCE.getTool().isSuperTypeOf(domainElement.eClass())) {
				return ToolEditPart.VISUAL_ID;
			}
			break;
		case CollaborativeTask2EditPart.VISUAL_ID:
			if (CiatPackage.eINSTANCE.getTool().isSuperTypeOf(domainElement.eClass())) {
				return ToolEditPart.VISUAL_ID;
			}
			break;
		case AbstractTask2EditPart.VISUAL_ID:
			if (CiatPackage.eINSTANCE.getTool().isSuperTypeOf(domainElement.eClass())) {
				return ToolEditPart.VISUAL_ID;
			}
			break;
		case SharedObjectEditPart.VISUAL_ID:
			if (CiatPackage.eINSTANCE.getExclusiveEditionArea().isSuperTypeOf(domainElement.eClass())) {
				return ExclusiveEditionAreaEditPart.VISUAL_ID;
			}
			if (CiatPackage.eINSTANCE.getCollaborativeArea().isSuperTypeOf(domainElement.eClass())) {
				return CollaborativeAreaEditPart.VISUAL_ID;
			}
			if (CiatPackage.eINSTANCE.getIndividualArea().isSuperTypeOf(domainElement.eClass())) {
				return IndividualAreaEditPart.VISUAL_ID;
			}
			break;
		case SociogramSociogramItsSociogramNodesCompartmentEditPart.VISUAL_ID:
			if (CiatPackage.eINSTANCE.getRol().isSuperTypeOf(domainElement.eClass())) {
				return RolEditPart.VISUAL_ID;
			}
			if (CiatPackage.eINSTANCE.getActor().isSuperTypeOf(domainElement.eClass())) {
				return ActorEditPart.VISUAL_ID;
			}
			if (CiatPackage.eINSTANCE.getSoftwareAgent().isSuperTypeOf(domainElement.eClass())) {
				return SoftwareAgentEditPart.VISUAL_ID;
			}
			if (CiatPackage.eINSTANCE.getTeam().isSuperTypeOf(domainElement.eClass())) {
				return TeamEditPart.VISUAL_ID;
			}
			if (CiatPackage.eINSTANCE.getGroup().isSuperTypeOf(domainElement.eClass())) {
				return GroupEditPart.VISUAL_ID;
			}
			break;
		case ProcessDiagramProcessDiagramProcessNodesCompartmentEditPart.VISUAL_ID:
			if (CiatPackage.eINSTANCE.getIndividualTask().isSuperTypeOf(domainElement.eClass())) {
				return IndividualTaskEditPart.VISUAL_ID;
			}
			if (CiatPackage.eINSTANCE.getCooperativeTask().isSuperTypeOf(domainElement.eClass())) {
				return CooperativeTaskEditPart.VISUAL_ID;
			}
			if (CiatPackage.eINSTANCE.getCollaborativeTask().isSuperTypeOf(domainElement.eClass())) {
				return CollaborativeTaskEditPart.VISUAL_ID;
			}
			if (CiatPackage.eINSTANCE.getAbstractTask().isSuperTypeOf(domainElement.eClass())) {
				return AbstractTaskEditPart.VISUAL_ID;
			}
			if (CiatPackage.eINSTANCE.getInit().isSuperTypeOf(domainElement.eClass())) {
				return Init2EditPart.VISUAL_ID;
			}
			if (CiatPackage.eINSTANCE.getEnd().isSuperTypeOf(domainElement.eClass())) {
				return End2EditPart.VISUAL_ID;
			}
			if (CiatPackage.eINSTANCE.getTemporalCondition().isSuperTypeOf(domainElement.eClass())) {
				return TemporalCondition2EditPart.VISUAL_ID;
			}
			if (CiatPackage.eINSTANCE.getNotification().isSuperTypeOf(domainElement.eClass())) {
				return Notification2EditPart.VISUAL_ID;
			}
			if (CiatPackage.eINSTANCE.getCondition().isSuperTypeOf(domainElement.eClass())) {
				return Condition2EditPart.VISUAL_ID;
			}
			break;
		case IndividualTaskIndividualTaskTaskRolesCompartmentEditPart.VISUAL_ID:
			if (CiatPackage.eINSTANCE.getRol().isSuperTypeOf(domainElement.eClass())) {
				return Rol2EditPart.VISUAL_ID;
			}
			if (CiatPackage.eINSTANCE.getActor().isSuperTypeOf(domainElement.eClass())) {
				return Actor2EditPart.VISUAL_ID;
			}
			if (CiatPackage.eINSTANCE.getSoftwareAgent().isSuperTypeOf(domainElement.eClass())) {
				return SoftwareAgent2EditPart.VISUAL_ID;
			}
			if (CiatPackage.eINSTANCE.getTeam().isSuperTypeOf(domainElement.eClass())) {
				return Team2EditPart.VISUAL_ID;
			}
			if (CiatPackage.eINSTANCE.getGroup().isSuperTypeOf(domainElement.eClass())) {
				return Group2EditPart.VISUAL_ID;
			}
			break;
		case IndividualTaskIndividualTaskTaskObjectsCompartmentEditPart.VISUAL_ID:
			if (CiatPackage.eINSTANCE.getObject().isSuperTypeOf(domainElement.eClass())) {
				return ObjectEditPart.VISUAL_ID;
			}
			break;
		case CooperativeTaskCooperativeTaskTaskRolesCompartmentEditPart.VISUAL_ID:
			if (CiatPackage.eINSTANCE.getRol().isSuperTypeOf(domainElement.eClass())) {
				return Rol3EditPart.VISUAL_ID;
			}
			if (CiatPackage.eINSTANCE.getActor().isSuperTypeOf(domainElement.eClass())) {
				return Actor3EditPart.VISUAL_ID;
			}
			if (CiatPackage.eINSTANCE.getSoftwareAgent().isSuperTypeOf(domainElement.eClass())) {
				return SoftwareAgent3EditPart.VISUAL_ID;
			}
			if (CiatPackage.eINSTANCE.getTeam().isSuperTypeOf(domainElement.eClass())) {
				return Team3EditPart.VISUAL_ID;
			}
			if (CiatPackage.eINSTANCE.getGroup().isSuperTypeOf(domainElement.eClass())) {
				return Group3EditPart.VISUAL_ID;
			}
			break;
		case CooperativeTaskCooperativeTaskTaskObjectsCompartmentEditPart.VISUAL_ID:
			if (CiatPackage.eINSTANCE.getObject().isSuperTypeOf(domainElement.eClass())) {
				return Object2EditPart.VISUAL_ID;
			}
			break;
		case CollaborativeTaskCollaborativeTaskTaskRolesCompartmentEditPart.VISUAL_ID:
			if (CiatPackage.eINSTANCE.getRol().isSuperTypeOf(domainElement.eClass())) {
				return Rol4EditPart.VISUAL_ID;
			}
			if (CiatPackage.eINSTANCE.getActor().isSuperTypeOf(domainElement.eClass())) {
				return Actor4EditPart.VISUAL_ID;
			}
			if (CiatPackage.eINSTANCE.getSoftwareAgent().isSuperTypeOf(domainElement.eClass())) {
				return SoftwareAgent4EditPart.VISUAL_ID;
			}
			if (CiatPackage.eINSTANCE.getTeam().isSuperTypeOf(domainElement.eClass())) {
				return Team4EditPart.VISUAL_ID;
			}
			if (CiatPackage.eINSTANCE.getGroup().isSuperTypeOf(domainElement.eClass())) {
				return Group4EditPart.VISUAL_ID;
			}
			break;
		case CollaborativeTaskCollaborativeTaskTaskObjectsCompartmentEditPart.VISUAL_ID:
			if (CiatPackage.eINSTANCE.getObject().isSuperTypeOf(domainElement.eClass())) {
				return Object3EditPart.VISUAL_ID;
			}
			break;
		case AbstractTaskAbstractTaskProcessNodesCompartmentEditPart.VISUAL_ID:
			if (CiatPackage.eINSTANCE.getIndividualTask().isSuperTypeOf(domainElement.eClass())) {
				return IndividualTask2EditPart.VISUAL_ID;
			}
			if (CiatPackage.eINSTANCE.getCooperativeTask().isSuperTypeOf(domainElement.eClass())) {
				return CooperativeTask2EditPart.VISUAL_ID;
			}
			if (CiatPackage.eINSTANCE.getCollaborativeTask().isSuperTypeOf(domainElement.eClass())) {
				return CollaborativeTask2EditPart.VISUAL_ID;
			}
			if (CiatPackage.eINSTANCE.getAbstractTask().isSuperTypeOf(domainElement.eClass())) {
				return AbstractTask2EditPart.VISUAL_ID;
			}
			if (CiatPackage.eINSTANCE.getInit().isSuperTypeOf(domainElement.eClass())) {
				return InitEditPart.VISUAL_ID;
			}
			if (CiatPackage.eINSTANCE.getEnd().isSuperTypeOf(domainElement.eClass())) {
				return EndEditPart.VISUAL_ID;
			}
			if (CiatPackage.eINSTANCE.getTemporalCondition().isSuperTypeOf(domainElement.eClass())) {
				return TemporalConditionEditPart.VISUAL_ID;
			}
			if (CiatPackage.eINSTANCE.getNotification().isSuperTypeOf(domainElement.eClass())) {
				return NotificationEditPart.VISUAL_ID;
			}
			if (CiatPackage.eINSTANCE.getCondition().isSuperTypeOf(domainElement.eClass())) {
				return ConditionEditPart.VISUAL_ID;
			}
			break;
		case IndividualTaskIndividualTaskTaskRolesCompartment2EditPart.VISUAL_ID:
			if (CiatPackage.eINSTANCE.getRol().isSuperTypeOf(domainElement.eClass())) {
				return Rol2EditPart.VISUAL_ID;
			}
			if (CiatPackage.eINSTANCE.getActor().isSuperTypeOf(domainElement.eClass())) {
				return Actor2EditPart.VISUAL_ID;
			}
			if (CiatPackage.eINSTANCE.getSoftwareAgent().isSuperTypeOf(domainElement.eClass())) {
				return SoftwareAgent2EditPart.VISUAL_ID;
			}
			if (CiatPackage.eINSTANCE.getTeam().isSuperTypeOf(domainElement.eClass())) {
				return Team2EditPart.VISUAL_ID;
			}
			if (CiatPackage.eINSTANCE.getGroup().isSuperTypeOf(domainElement.eClass())) {
				return Group2EditPart.VISUAL_ID;
			}
			break;
		case IndividualTaskIndividualTaskTaskObjectsCompartment2EditPart.VISUAL_ID:
			if (CiatPackage.eINSTANCE.getObject().isSuperTypeOf(domainElement.eClass())) {
				return ObjectEditPart.VISUAL_ID;
			}
			break;
		case CooperativeTaskCooperativeTaskTaskRolesCompartment2EditPart.VISUAL_ID:
			if (CiatPackage.eINSTANCE.getRol().isSuperTypeOf(domainElement.eClass())) {
				return Rol3EditPart.VISUAL_ID;
			}
			if (CiatPackage.eINSTANCE.getActor().isSuperTypeOf(domainElement.eClass())) {
				return Actor3EditPart.VISUAL_ID;
			}
			if (CiatPackage.eINSTANCE.getSoftwareAgent().isSuperTypeOf(domainElement.eClass())) {
				return SoftwareAgent3EditPart.VISUAL_ID;
			}
			if (CiatPackage.eINSTANCE.getTeam().isSuperTypeOf(domainElement.eClass())) {
				return Team3EditPart.VISUAL_ID;
			}
			if (CiatPackage.eINSTANCE.getGroup().isSuperTypeOf(domainElement.eClass())) {
				return Group3EditPart.VISUAL_ID;
			}
			break;
		case CooperativeTaskCooperativeTaskTaskObjectsCompartment2EditPart.VISUAL_ID:
			if (CiatPackage.eINSTANCE.getObject().isSuperTypeOf(domainElement.eClass())) {
				return Object2EditPart.VISUAL_ID;
			}
			break;
		case CollaborativeTaskCollaborativeTaskTaskRolesCompartment2EditPart.VISUAL_ID:
			if (CiatPackage.eINSTANCE.getRol().isSuperTypeOf(domainElement.eClass())) {
				return Rol4EditPart.VISUAL_ID;
			}
			if (CiatPackage.eINSTANCE.getActor().isSuperTypeOf(domainElement.eClass())) {
				return Actor4EditPart.VISUAL_ID;
			}
			if (CiatPackage.eINSTANCE.getSoftwareAgent().isSuperTypeOf(domainElement.eClass())) {
				return SoftwareAgent4EditPart.VISUAL_ID;
			}
			if (CiatPackage.eINSTANCE.getTeam().isSuperTypeOf(domainElement.eClass())) {
				return Team4EditPart.VISUAL_ID;
			}
			if (CiatPackage.eINSTANCE.getGroup().isSuperTypeOf(domainElement.eClass())) {
				return Group4EditPart.VISUAL_ID;
			}
			break;
		case CollaborativeTaskCollaborativeTaskTaskObjectsCompartment2EditPart.VISUAL_ID:
			if (CiatPackage.eINSTANCE.getObject().isSuperTypeOf(domainElement.eClass())) {
				return Object3EditPart.VISUAL_ID;
			}
			break;
		case AbstractTaskAbstractTaskProcessNodesCompartment2EditPart.VISUAL_ID:
			if (CiatPackage.eINSTANCE.getIndividualTask().isSuperTypeOf(domainElement.eClass())) {
				return IndividualTask2EditPart.VISUAL_ID;
			}
			if (CiatPackage.eINSTANCE.getCooperativeTask().isSuperTypeOf(domainElement.eClass())) {
				return CooperativeTask2EditPart.VISUAL_ID;
			}
			if (CiatPackage.eINSTANCE.getCollaborativeTask().isSuperTypeOf(domainElement.eClass())) {
				return CollaborativeTask2EditPart.VISUAL_ID;
			}
			if (CiatPackage.eINSTANCE.getAbstractTask().isSuperTypeOf(domainElement.eClass())) {
				return AbstractTask2EditPart.VISUAL_ID;
			}
			if (CiatPackage.eINSTANCE.getInit().isSuperTypeOf(domainElement.eClass())) {
				return InitEditPart.VISUAL_ID;
			}
			if (CiatPackage.eINSTANCE.getEnd().isSuperTypeOf(domainElement.eClass())) {
				return EndEditPart.VISUAL_ID;
			}
			if (CiatPackage.eINSTANCE.getTemporalCondition().isSuperTypeOf(domainElement.eClass())) {
				return TemporalConditionEditPart.VISUAL_ID;
			}
			if (CiatPackage.eINSTANCE.getNotification().isSuperTypeOf(domainElement.eClass())) {
				return NotificationEditPart.VISUAL_ID;
			}
			if (CiatPackage.eINSTANCE.getCondition().isSuperTypeOf(domainElement.eClass())) {
				return ConditionEditPart.VISUAL_ID;
			}
			break;
		case DomainDiagramDomainDiagramSharedContextCompartmentEditPart.VISUAL_ID:
			if (CiatPackage.eINSTANCE.getSharedObject().isSuperTypeOf(domainElement.eClass())) {
				return SharedObjectEditPart.VISUAL_ID;
			}
			break;
		case SharedObjectSharedObjectAttributesCompartmentEditPart.VISUAL_ID:
			if (CiatPackage.eINSTANCE.getAttribute().isSuperTypeOf(domainElement.eClass())) {
				return AttributeEditPart.VISUAL_ID;
			}
			break;
		case SharedObjectSharedObjectOperationsCompartmentEditPart.VISUAL_ID:
			if (CiatPackage.eINSTANCE.getOperation().isSuperTypeOf(domainElement.eClass())) {
				return OperationEditPart.VISUAL_ID;
			}
			break;
		case CTTDiagramCTTDiagramCttTasksCompartmentEditPart.VISUAL_ID:
			if (CiatPackage.eINSTANCE.getExclusiveEdition().isSuperTypeOf(domainElement.eClass())) {
				return ExclusiveEditionEditPart.VISUAL_ID;
			}
			if (CiatPackage.eINSTANCE.getCollaborativeVisualization().isSuperTypeOf(domainElement.eClass())) {
				return CollaborativeVisualizationEditPart.VISUAL_ID;
			}
			if (CiatPackage.eINSTANCE.getIndividualVisualization().isSuperTypeOf(domainElement.eClass())) {
				return IndividualVisualizationEditPart.VISUAL_ID;
			}
			if (CiatPackage.eINSTANCE.getUserTask().isSuperTypeOf(domainElement.eClass())) {
				return UserTaskEditPart.VISUAL_ID;
			}
			if (CiatPackage.eINSTANCE.getCTTAbstractTask().isSuperTypeOf(domainElement.eClass())) {
				return CTTAbstractTaskEditPart.VISUAL_ID;
			}
			if (CiatPackage.eINSTANCE.getInteractiveTask().isSuperTypeOf(domainElement.eClass())) {
				return InteractiveTaskEditPart.VISUAL_ID;
			}
			if (CiatPackage.eINSTANCE.getCTTCollaborativeTask().isSuperTypeOf(domainElement.eClass())) {
				return CTTCollaborativeTaskEditPart.VISUAL_ID;
			}
			if (CiatPackage.eINSTANCE.getApplicationTask().isSuperTypeOf(domainElement.eClass())) {
				return ApplicationTaskEditPart.VISUAL_ID;
			}
			break;
		}
		return -1;
	}

	/**
	* @generated
	*/
	public static boolean canCreateNode(View containerView, int nodeVisualID) {
		String containerModelID = ciat.diagram.part.CiatVisualIDRegistry.getModelID(containerView);
		if (!CIATDiagramEditPart.MODEL_ID.equals(containerModelID) && !"ciat".equals(containerModelID)) { //$NON-NLS-1$
			return false;
		}
		int containerVisualID;
		if (CIATDiagramEditPart.MODEL_ID.equals(containerModelID)) {
			containerVisualID = ciat.diagram.part.CiatVisualIDRegistry.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = CIATDiagramEditPart.VISUAL_ID;
			} else {
				return false;
			}
		}
		switch (containerVisualID) {
		case CIATDiagramEditPart.VISUAL_ID:
			if (SociogramEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ProcessDiagramEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (DomainDiagramEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (CTTDiagramEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case SociogramEditPart.VISUAL_ID:
			if (SociogramNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (SociogramSociogramItsSociogramNodesCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ProcessDiagramEditPart.VISUAL_ID:
			if (ProcessDiagramNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ProcessDiagramProcessDiagramProcessNodesCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case DomainDiagramEditPart.VISUAL_ID:
			if (DomainDiagramNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (DomainDiagramDomainDiagramSharedContextCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case CTTDiagramEditPart.VISUAL_ID:
			if (CTTDiagramNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (CTTDiagramCTTDiagramCttTasksCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case RolEditPart.VISUAL_ID:
			if (RolNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ActorEditPart.VISUAL_ID:
			if (ActorNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case SoftwareAgentEditPart.VISUAL_ID:
			if (SoftwareAgentNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case TeamEditPart.VISUAL_ID:
			if (TeamNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case GroupEditPart.VISUAL_ID:
			if (GroupNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case IndividualTaskEditPart.VISUAL_ID:
			if (IndividualTaskNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (IndividualTaskIndividualTaskTaskRolesCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (IndividualTaskIndividualTaskTaskObjectsCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ToolEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Rol2EditPart.VISUAL_ID:
			if (RolName2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Actor2EditPart.VISUAL_ID:
			if (ActorName2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case SoftwareAgent2EditPart.VISUAL_ID:
			if (SoftwareAgentName2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Team2EditPart.VISUAL_ID:
			if (TeamName2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Group2EditPart.VISUAL_ID:
			if (GroupName2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ToolEditPart.VISUAL_ID:
			if (ToolNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ObjectEditPart.VISUAL_ID:
			if (ObjectNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case CooperativeTaskEditPart.VISUAL_ID:
			if (CooperativeTaskNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (CooperativeTaskCooperativeTaskTaskRolesCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (CooperativeTaskCooperativeTaskTaskObjectsCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ToolEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Rol3EditPart.VISUAL_ID:
			if (RolName3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Actor3EditPart.VISUAL_ID:
			if (ActorName3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case SoftwareAgent3EditPart.VISUAL_ID:
			if (SoftwareAgentName3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Team3EditPart.VISUAL_ID:
			if (TeamName3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Group3EditPart.VISUAL_ID:
			if (GroupName3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Object2EditPart.VISUAL_ID:
			if (ObjectName2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case CollaborativeTaskEditPart.VISUAL_ID:
			if (CollaborativeTaskNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (CollaborativeTaskCollaborativeTaskTaskRolesCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (CollaborativeTaskCollaborativeTaskTaskObjectsCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ToolEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Rol4EditPart.VISUAL_ID:
			if (RolName4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Actor4EditPart.VISUAL_ID:
			if (ActorName4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case SoftwareAgent4EditPart.VISUAL_ID:
			if (SoftwareAgentName4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Team4EditPart.VISUAL_ID:
			if (TeamName4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Group4EditPart.VISUAL_ID:
			if (GroupName4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Object3EditPart.VISUAL_ID:
			if (ObjectName3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case AbstractTaskEditPart.VISUAL_ID:
			if (AbstractTaskNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AbstractTaskAbstractTaskProcessNodesCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ToolEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case IndividualTask2EditPart.VISUAL_ID:
			if (IndividualTaskName2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (IndividualTaskIndividualTaskTaskRolesCompartment2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (IndividualTaskIndividualTaskTaskObjectsCompartment2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ToolEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case CooperativeTask2EditPart.VISUAL_ID:
			if (CooperativeTaskName2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (CooperativeTaskCooperativeTaskTaskRolesCompartment2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (CooperativeTaskCooperativeTaskTaskObjectsCompartment2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ToolEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case CollaborativeTask2EditPart.VISUAL_ID:
			if (CollaborativeTaskName2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (CollaborativeTaskCollaborativeTaskTaskRolesCompartment2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (CollaborativeTaskCollaborativeTaskTaskObjectsCompartment2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ToolEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case AbstractTask2EditPart.VISUAL_ID:
			if (AbstractTaskName2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AbstractTaskAbstractTaskProcessNodesCompartment2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ToolEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case InitEditPart.VISUAL_ID:
			if (InitNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case EndEditPart.VISUAL_ID:
			if (EndNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case TemporalConditionEditPart.VISUAL_ID:
			if (TemporalConditionNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case NotificationEditPart.VISUAL_ID:
			if (NotificationNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ConditionEditPart.VISUAL_ID:
			if (ConditionNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Init2EditPart.VISUAL_ID:
			if (InitName2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case End2EditPart.VISUAL_ID:
			if (EndName2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case TemporalCondition2EditPart.VISUAL_ID:
			if (TemporalConditionName2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Notification2EditPart.VISUAL_ID:
			if (NotificationName2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Condition2EditPart.VISUAL_ID:
			if (ConditionName2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case SharedObjectEditPart.VISUAL_ID:
			if (SharedObjectNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (SharedObjectSharedObjectAttributesCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (SharedObjectSharedObjectOperationsCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ExclusiveEditionAreaEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (CollaborativeAreaEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (IndividualAreaEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ExclusiveEditionAreaEditPart.VISUAL_ID:
			if (ExclusiveEditionAreaNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case CollaborativeAreaEditPart.VISUAL_ID:
			if (CollaborativeAreaNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case IndividualAreaEditPart.VISUAL_ID:
			if (IndividualAreaNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case AttributeEditPart.VISUAL_ID:
			if (AttributeNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case OperationEditPart.VISUAL_ID:
			if (OperationNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ExclusiveEditionEditPart.VISUAL_ID:
			if (ExclusiveEditionNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case CollaborativeVisualizationEditPart.VISUAL_ID:
			if (CollaborativeVisualizationNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case IndividualVisualizationEditPart.VISUAL_ID:
			if (IndividualVisualizationNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case UserTaskEditPart.VISUAL_ID:
			if (UserTaskNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case CTTAbstractTaskEditPart.VISUAL_ID:
			if (CTTAbstractTaskNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case InteractiveTaskEditPart.VISUAL_ID:
			if (InteractiveTaskNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case CTTCollaborativeTaskEditPart.VISUAL_ID:
			if (CTTCollaborativeTaskNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ApplicationTaskEditPart.VISUAL_ID:
			if (ApplicationTaskNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case SociogramSociogramItsSociogramNodesCompartmentEditPart.VISUAL_ID:
			if (RolEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ActorEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (SoftwareAgentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (TeamEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (GroupEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ProcessDiagramProcessDiagramProcessNodesCompartmentEditPart.VISUAL_ID:
			if (IndividualTaskEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (CooperativeTaskEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (CollaborativeTaskEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AbstractTaskEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Init2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (End2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (TemporalCondition2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Notification2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Condition2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case IndividualTaskIndividualTaskTaskRolesCompartmentEditPart.VISUAL_ID:
			if (Rol2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Actor2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (SoftwareAgent2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Team2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Group2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case IndividualTaskIndividualTaskTaskObjectsCompartmentEditPart.VISUAL_ID:
			if (ObjectEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case CooperativeTaskCooperativeTaskTaskRolesCompartmentEditPart.VISUAL_ID:
			if (Rol3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Actor3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (SoftwareAgent3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Team3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Group3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case CooperativeTaskCooperativeTaskTaskObjectsCompartmentEditPart.VISUAL_ID:
			if (Object2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case CollaborativeTaskCollaborativeTaskTaskRolesCompartmentEditPart.VISUAL_ID:
			if (Rol4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Actor4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (SoftwareAgent4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Team4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Group4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case CollaborativeTaskCollaborativeTaskTaskObjectsCompartmentEditPart.VISUAL_ID:
			if (Object3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case AbstractTaskAbstractTaskProcessNodesCompartmentEditPart.VISUAL_ID:
			if (IndividualTask2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (CooperativeTask2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (CollaborativeTask2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AbstractTask2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (InitEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (EndEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (TemporalConditionEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (NotificationEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ConditionEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case IndividualTaskIndividualTaskTaskRolesCompartment2EditPart.VISUAL_ID:
			if (Rol2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Actor2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (SoftwareAgent2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Team2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Group2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case IndividualTaskIndividualTaskTaskObjectsCompartment2EditPart.VISUAL_ID:
			if (ObjectEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case CooperativeTaskCooperativeTaskTaskRolesCompartment2EditPart.VISUAL_ID:
			if (Rol3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Actor3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (SoftwareAgent3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Team3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Group3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case CooperativeTaskCooperativeTaskTaskObjectsCompartment2EditPart.VISUAL_ID:
			if (Object2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case CollaborativeTaskCollaborativeTaskTaskRolesCompartment2EditPart.VISUAL_ID:
			if (Rol4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Actor4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (SoftwareAgent4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Team4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Group4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case CollaborativeTaskCollaborativeTaskTaskObjectsCompartment2EditPart.VISUAL_ID:
			if (Object3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case AbstractTaskAbstractTaskProcessNodesCompartment2EditPart.VISUAL_ID:
			if (IndividualTask2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (CooperativeTask2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (CollaborativeTask2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AbstractTask2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (InitEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (EndEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (TemporalConditionEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (NotificationEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ConditionEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case DomainDiagramDomainDiagramSharedContextCompartmentEditPart.VISUAL_ID:
			if (SharedObjectEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case SharedObjectSharedObjectAttributesCompartmentEditPart.VISUAL_ID:
			if (AttributeEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case SharedObjectSharedObjectOperationsCompartmentEditPart.VISUAL_ID:
			if (OperationEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case CTTDiagramCTTDiagramCttTasksCompartmentEditPart.VISUAL_ID:
			if (ExclusiveEditionEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (CollaborativeVisualizationEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (IndividualVisualizationEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (UserTaskEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (CTTAbstractTaskEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (InteractiveTaskEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (CTTCollaborativeTaskEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ApplicationTaskEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case InheritanceEditPart.VISUAL_ID:
			if (InheritanceConditionEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ActingEditPart.VISUAL_ID:
			if (ActingNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case AssociationEditPart.VISUAL_ID:
			if (AssociationNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case EnablingEditPart.VISUAL_ID:
			if (EnablingELabelEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case DisablingEditPart.VISUAL_ID:
			if (DisablingDLabelEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case EnablingWithInformationPassingEditPart.VISUAL_ID:
			if (EnablingWithInformationPassingEwLabelEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case DisablingWithInformationPassingEditPart.VISUAL_ID:
			if (DisablingWithInformationPassingDwLabelEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case IndependentConcurrencyEditPart.VISUAL_ID:
			if (IndependentConcurrencyIcLabelEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case OrderIndependenceEditPart.VISUAL_ID:
			if (OrderIndependenceOiLabelEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case SuspendResumeEditPart.VISUAL_ID:
			if (SuspendResumeSrLabelEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ConcurrencyWithInformationPassingEditPart.VISUAL_ID:
			if (ConcurrencyWithInformationPassingCLabelEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case DeterministicChoiceEditPart.VISUAL_ID:
			if (DeterministicChoiceDtLabelEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case UndeterministicChoiceEditPart.VISUAL_ID:
			if (UndeterministicChoiceUcLabelEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		}
		return false;
	}

	/**
	* @generated
	*/
	public static int getLinkWithClassVisualID(EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		if (CiatPackage.eINSTANCE.getInheritance().isSuperTypeOf(domainElement.eClass())) {
			return InheritanceEditPart.VISUAL_ID;
		}
		if (CiatPackage.eINSTANCE.getActing().isSuperTypeOf(domainElement.eClass())) {
			return ActingEditPart.VISUAL_ID;
		}
		if (CiatPackage.eINSTANCE.getAssociation().isSuperTypeOf(domainElement.eClass())) {
			return AssociationEditPart.VISUAL_ID;
		}
		if (CiatPackage.eINSTANCE.getShAssociationLink().isSuperTypeOf(domainElement.eClass())) {
			return ShAssociationLinkEditPart.VISUAL_ID;
		}
		if (CiatPackage.eINSTANCE.getShGeneralizationLink().isSuperTypeOf(domainElement.eClass())) {
			return ShGeneralizationLinkEditPart.VISUAL_ID;
		}
		if (CiatPackage.eINSTANCE.getShAggregationLink().isSuperTypeOf(domainElement.eClass())) {
			return ShAggregationLinkEditPart.VISUAL_ID;
		}
		if (CiatPackage.eINSTANCE.getAggregation().isSuperTypeOf(domainElement.eClass())) {
			return AggregationEditPart.VISUAL_ID;
		}
		if (CiatPackage.eINSTANCE.getEnabling().isSuperTypeOf(domainElement.eClass())) {
			return EnablingEditPart.VISUAL_ID;
		}
		if (CiatPackage.eINSTANCE.getDisabling().isSuperTypeOf(domainElement.eClass())) {
			return DisablingEditPart.VISUAL_ID;
		}
		if (CiatPackage.eINSTANCE.getEnablingWithInformationPassing().isSuperTypeOf(domainElement.eClass())) {
			return EnablingWithInformationPassingEditPart.VISUAL_ID;
		}
		if (CiatPackage.eINSTANCE.getDisablingWithInformationPassing().isSuperTypeOf(domainElement.eClass())) {
			return DisablingWithInformationPassingEditPart.VISUAL_ID;
		}
		if (CiatPackage.eINSTANCE.getIndependentConcurrency().isSuperTypeOf(domainElement.eClass())) {
			return IndependentConcurrencyEditPart.VISUAL_ID;
		}
		if (CiatPackage.eINSTANCE.getOrderIndependence().isSuperTypeOf(domainElement.eClass())) {
			return OrderIndependenceEditPart.VISUAL_ID;
		}
		if (CiatPackage.eINSTANCE.getSuspendResume().isSuperTypeOf(domainElement.eClass())) {
			return SuspendResumeEditPart.VISUAL_ID;
		}
		if (CiatPackage.eINSTANCE.getConcurrencyWithInformationPassing().isSuperTypeOf(domainElement.eClass())) {
			return ConcurrencyWithInformationPassingEditPart.VISUAL_ID;
		}
		if (CiatPackage.eINSTANCE.getDeterministicChoice().isSuperTypeOf(domainElement.eClass())) {
			return DeterministicChoiceEditPart.VISUAL_ID;
		}
		if (CiatPackage.eINSTANCE.getUndeterministicChoice().isSuperTypeOf(domainElement.eClass())) {
			return UndeterministicChoiceEditPart.VISUAL_ID;
		}
		return -1;
	}

	/**
	* User can change implementation of this method to handle some specific
	* situations not covered by default logic.
	* 
	* @generated
	*/
	private static boolean isDiagram(CIATDiagram element) {
		return true;
	}

	/**
	* @generated
	*/
	public static boolean checkNodeVisualID(View containerView, EObject domainElement, int candidate) {
		if (candidate == -1) {
			//unrecognized id is always bad
			return false;
		}
		int basic = getNodeVisualID(containerView, domainElement);
		return basic == candidate;
	}

	/**
	* @generated
	*/
	public static boolean isCompartmentVisualID(int visualID) {
		switch (visualID) {
		case SociogramSociogramItsSociogramNodesCompartmentEditPart.VISUAL_ID:
		case ProcessDiagramProcessDiagramProcessNodesCompartmentEditPart.VISUAL_ID:
		case IndividualTaskIndividualTaskTaskRolesCompartmentEditPart.VISUAL_ID:
		case IndividualTaskIndividualTaskTaskObjectsCompartmentEditPart.VISUAL_ID:
		case CooperativeTaskCooperativeTaskTaskRolesCompartmentEditPart.VISUAL_ID:
		case CooperativeTaskCooperativeTaskTaskObjectsCompartmentEditPart.VISUAL_ID:
		case CollaborativeTaskCollaborativeTaskTaskRolesCompartmentEditPart.VISUAL_ID:
		case CollaborativeTaskCollaborativeTaskTaskObjectsCompartmentEditPart.VISUAL_ID:
		case AbstractTaskAbstractTaskProcessNodesCompartmentEditPart.VISUAL_ID:
		case IndividualTaskIndividualTaskTaskRolesCompartment2EditPart.VISUAL_ID:
		case IndividualTaskIndividualTaskTaskObjectsCompartment2EditPart.VISUAL_ID:
		case CooperativeTaskCooperativeTaskTaskRolesCompartment2EditPart.VISUAL_ID:
		case CooperativeTaskCooperativeTaskTaskObjectsCompartment2EditPart.VISUAL_ID:
		case CollaborativeTaskCollaborativeTaskTaskRolesCompartment2EditPart.VISUAL_ID:
		case CollaborativeTaskCollaborativeTaskTaskObjectsCompartment2EditPart.VISUAL_ID:
		case AbstractTaskAbstractTaskProcessNodesCompartment2EditPart.VISUAL_ID:
		case DomainDiagramDomainDiagramSharedContextCompartmentEditPart.VISUAL_ID:
		case SharedObjectSharedObjectAttributesCompartmentEditPart.VISUAL_ID:
		case SharedObjectSharedObjectOperationsCompartmentEditPart.VISUAL_ID:
		case CTTDiagramCTTDiagramCttTasksCompartmentEditPart.VISUAL_ID:
			return true;
		default:
			break;
		}
		return false;
	}

	/**
	* @generated
	*/
	public static boolean isSemanticLeafVisualID(int visualID) {
		switch (visualID) {
		case CIATDiagramEditPart.VISUAL_ID:
			return false;
		case RolEditPart.VISUAL_ID:
		case ActorEditPart.VISUAL_ID:
		case SoftwareAgentEditPart.VISUAL_ID:
		case TeamEditPart.VISUAL_ID:
		case GroupEditPart.VISUAL_ID:
		case Rol2EditPart.VISUAL_ID:
		case Actor2EditPart.VISUAL_ID:
		case SoftwareAgent2EditPart.VISUAL_ID:
		case Team2EditPart.VISUAL_ID:
		case Group2EditPart.VISUAL_ID:
		case ToolEditPart.VISUAL_ID:
		case ObjectEditPart.VISUAL_ID:
		case Rol3EditPart.VISUAL_ID:
		case Actor3EditPart.VISUAL_ID:
		case SoftwareAgent3EditPart.VISUAL_ID:
		case Team3EditPart.VISUAL_ID:
		case Group3EditPart.VISUAL_ID:
		case Object2EditPart.VISUAL_ID:
		case Rol4EditPart.VISUAL_ID:
		case Actor4EditPart.VISUAL_ID:
		case SoftwareAgent4EditPart.VISUAL_ID:
		case Team4EditPart.VISUAL_ID:
		case Group4EditPart.VISUAL_ID:
		case Object3EditPart.VISUAL_ID:
		case InitEditPart.VISUAL_ID:
		case EndEditPart.VISUAL_ID:
		case TemporalConditionEditPart.VISUAL_ID:
		case NotificationEditPart.VISUAL_ID:
		case ConditionEditPart.VISUAL_ID:
		case Init2EditPart.VISUAL_ID:
		case End2EditPart.VISUAL_ID:
		case TemporalCondition2EditPart.VISUAL_ID:
		case Notification2EditPart.VISUAL_ID:
		case Condition2EditPart.VISUAL_ID:
		case ExclusiveEditionAreaEditPart.VISUAL_ID:
		case CollaborativeAreaEditPart.VISUAL_ID:
		case IndividualAreaEditPart.VISUAL_ID:
		case AttributeEditPart.VISUAL_ID:
		case OperationEditPart.VISUAL_ID:
		case ExclusiveEditionEditPart.VISUAL_ID:
		case CollaborativeVisualizationEditPart.VISUAL_ID:
		case IndividualVisualizationEditPart.VISUAL_ID:
		case UserTaskEditPart.VISUAL_ID:
		case CTTAbstractTaskEditPart.VISUAL_ID:
		case InteractiveTaskEditPart.VISUAL_ID:
		case CTTCollaborativeTaskEditPart.VISUAL_ID:
		case ApplicationTaskEditPart.VISUAL_ID:
			return true;
		default:
			break;
		}
		return false;
	}

	/**
	* @generated
	*/
	public static final DiagramStructure TYPED_INSTANCE = new DiagramStructure() {
		/**
		* @generated
		*/
		@Override

		public int getVisualID(View view) {
			return ciat.diagram.part.CiatVisualIDRegistry.getVisualID(view);
		}

		/**
		* @generated
		*/
		@Override

		public String getModelID(View view) {
			return ciat.diagram.part.CiatVisualIDRegistry.getModelID(view);
		}

		/**
		* @generated
		*/
		@Override

		public int getNodeVisualID(View containerView, EObject domainElement) {
			return ciat.diagram.part.CiatVisualIDRegistry.getNodeVisualID(containerView, domainElement);
		}

		/**
		* @generated
		*/
		@Override

		public boolean checkNodeVisualID(View containerView, EObject domainElement, int candidate) {
			return ciat.diagram.part.CiatVisualIDRegistry.checkNodeVisualID(containerView, domainElement, candidate);
		}

		/**
		* @generated
		*/
		@Override

		public boolean isCompartmentVisualID(int visualID) {
			return ciat.diagram.part.CiatVisualIDRegistry.isCompartmentVisualID(visualID);
		}

		/**
		* @generated
		*/
		@Override

		public boolean isSemanticLeafVisualID(int visualID) {
			return ciat.diagram.part.CiatVisualIDRegistry.isSemanticLeafVisualID(visualID);
		}
	};

}
