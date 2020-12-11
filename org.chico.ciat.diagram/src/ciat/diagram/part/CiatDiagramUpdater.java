/*
* 
*/
package ciat.diagram.part;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.update.DiagramUpdater;

import ciat.AbstractTask;
import ciat.Acting;
import ciat.Actor;
import ciat.Aggregation;
import ciat.ApplicationTask;
import ciat.Association;
import ciat.Attribute;
import ciat.CIATDiagram;
import ciat.CTTAbstractTask;
import ciat.CTTCollaborativeTask;
import ciat.CTTDiagram;
import ciat.CTTTask;
import ciat.CiatPackage;
import ciat.CollaborativeTask;
import ciat.CollaborativeVisualization;
import ciat.ConcurrencyWithInformationPassing;
import ciat.Condition;
import ciat.CooperativeTask;
import ciat.DependencyElement;
import ciat.DeterministicChoice;
import ciat.Disabling;
import ciat.DisablingWithInformationPassing;
import ciat.DomainDiagram;
import ciat.Enabling;
import ciat.EnablingWithInformationPassing;
import ciat.End;
import ciat.ExclusiveEdition;
import ciat.Group;
import ciat.IndependentConcurrency;
import ciat.IndividualTask;
import ciat.IndividualVisualization;
import ciat.Inheritance;
import ciat.Init;
import ciat.InteractiveTask;
import ciat.Notification;
import ciat.Object;
import ciat.Operation;
import ciat.OrderIndependence;
import ciat.ProcessDiagram;
import ciat.ProcessNode;
import ciat.Rol;
import ciat.ShAggregationLink;
import ciat.ShAssociationLink;
import ciat.ShGeneralizationLink;
import ciat.SharedObject;
import ciat.Sociogram;
import ciat.SociogramNode;
import ciat.SoftwareAgent;
import ciat.SuspendResume;
import ciat.Team;
import ciat.TemporalCondition;
import ciat.Tool;
import ciat.UndeterministicChoice;
import ciat.UserTask;
import ciat.VisualizationArea;
import ciat.diagram.edit.parts.AbstractTask2EditPart;
import ciat.diagram.edit.parts.AbstractTaskAbstractTaskProcessNodesCompartment2EditPart;
import ciat.diagram.edit.parts.AbstractTaskAbstractTaskProcessNodesCompartmentEditPart;
import ciat.diagram.edit.parts.AbstractTaskEditPart;
import ciat.diagram.edit.parts.ActingEditPart;
import ciat.diagram.edit.parts.Actor2EditPart;
import ciat.diagram.edit.parts.Actor3EditPart;
import ciat.diagram.edit.parts.Actor4EditPart;
import ciat.diagram.edit.parts.ActorEditPart;
import ciat.diagram.edit.parts.AggregationEditPart;
import ciat.diagram.edit.parts.ApplicationTaskEditPart;
import ciat.diagram.edit.parts.AssociationEditPart;
import ciat.diagram.edit.parts.AttributeEditPart;
import ciat.diagram.edit.parts.CIATDiagramEditPart;
import ciat.diagram.edit.parts.CTTAbstractTaskEditPart;
import ciat.diagram.edit.parts.CTTCollaborativeTaskEditPart;
import ciat.diagram.edit.parts.CTTDiagramCTTDiagramCttTasksCompartmentEditPart;
import ciat.diagram.edit.parts.CTTDiagramEditPart;
import ciat.diagram.edit.parts.CollaborativeAreaEditPart;
import ciat.diagram.edit.parts.CollaborativeTask2EditPart;
import ciat.diagram.edit.parts.CollaborativeTaskCollaborativeTaskTaskObjectsCompartment2EditPart;
import ciat.diagram.edit.parts.CollaborativeTaskCollaborativeTaskTaskObjectsCompartmentEditPart;
import ciat.diagram.edit.parts.CollaborativeTaskCollaborativeTaskTaskRolesCompartment2EditPart;
import ciat.diagram.edit.parts.CollaborativeTaskCollaborativeTaskTaskRolesCompartmentEditPart;
import ciat.diagram.edit.parts.CollaborativeTaskEditPart;
import ciat.diagram.edit.parts.CollaborativeVisualizationEditPart;
import ciat.diagram.edit.parts.ConcurrencyWithInformationPassingEditPart;
import ciat.diagram.edit.parts.Condition2EditPart;
import ciat.diagram.edit.parts.ConditionEditPart;
import ciat.diagram.edit.parts.CooperativeTask2EditPart;
import ciat.diagram.edit.parts.CooperativeTaskCooperativeTaskTaskObjectsCompartment2EditPart;
import ciat.diagram.edit.parts.CooperativeTaskCooperativeTaskTaskObjectsCompartmentEditPart;
import ciat.diagram.edit.parts.CooperativeTaskCooperativeTaskTaskRolesCompartment2EditPart;
import ciat.diagram.edit.parts.CooperativeTaskCooperativeTaskTaskRolesCompartmentEditPart;
import ciat.diagram.edit.parts.CooperativeTaskEditPart;
import ciat.diagram.edit.parts.DeterministicChoiceEditPart;
import ciat.diagram.edit.parts.DisablingEditPart;
import ciat.diagram.edit.parts.DisablingWithInformationPassingEditPart;
import ciat.diagram.edit.parts.DomainDiagramDomainDiagramSharedContextCompartmentEditPart;
import ciat.diagram.edit.parts.DomainDiagramEditPart;
import ciat.diagram.edit.parts.EnablingEditPart;
import ciat.diagram.edit.parts.EnablingWithInformationPassingEditPart;
import ciat.diagram.edit.parts.End2EditPart;
import ciat.diagram.edit.parts.EndEditPart;
import ciat.diagram.edit.parts.ExclusiveEditionAreaEditPart;
import ciat.diagram.edit.parts.ExclusiveEditionEditPart;
import ciat.diagram.edit.parts.Group2EditPart;
import ciat.diagram.edit.parts.Group3EditPart;
import ciat.diagram.edit.parts.Group4EditPart;
import ciat.diagram.edit.parts.GroupEditPart;
import ciat.diagram.edit.parts.IndependentConcurrencyEditPart;
import ciat.diagram.edit.parts.IndividualAreaEditPart;
import ciat.diagram.edit.parts.IndividualTask2EditPart;
import ciat.diagram.edit.parts.IndividualTaskEditPart;
import ciat.diagram.edit.parts.IndividualTaskIndividualTaskTaskObjectsCompartment2EditPart;
import ciat.diagram.edit.parts.IndividualTaskIndividualTaskTaskObjectsCompartmentEditPart;
import ciat.diagram.edit.parts.IndividualTaskIndividualTaskTaskRolesCompartment2EditPart;
import ciat.diagram.edit.parts.IndividualTaskIndividualTaskTaskRolesCompartmentEditPart;
import ciat.diagram.edit.parts.IndividualVisualizationEditPart;
import ciat.diagram.edit.parts.InheritanceEditPart;
import ciat.diagram.edit.parts.Init2EditPart;
import ciat.diagram.edit.parts.InitEditPart;
import ciat.diagram.edit.parts.InteractiveTaskEditPart;
import ciat.diagram.edit.parts.Notification2EditPart;
import ciat.diagram.edit.parts.NotificationEditPart;
import ciat.diagram.edit.parts.Object2EditPart;
import ciat.diagram.edit.parts.Object3EditPart;
import ciat.diagram.edit.parts.ObjectEditPart;
import ciat.diagram.edit.parts.OperationEditPart;
import ciat.diagram.edit.parts.OrderIndependenceEditPart;
import ciat.diagram.edit.parts.ProcessDiagramEditPart;
import ciat.diagram.edit.parts.ProcessDiagramProcessDiagramProcessNodesCompartmentEditPart;
import ciat.diagram.edit.parts.Rol2EditPart;
import ciat.diagram.edit.parts.Rol3EditPart;
import ciat.diagram.edit.parts.Rol4EditPart;
import ciat.diagram.edit.parts.RolEditPart;
import ciat.diagram.edit.parts.ShAggregationLinkEditPart;
import ciat.diagram.edit.parts.ShAssociationLinkEditPart;
import ciat.diagram.edit.parts.ShGeneralizationLinkEditPart;
import ciat.diagram.edit.parts.SharedObjectEditPart;
import ciat.diagram.edit.parts.SharedObjectSharedObjectAttributesCompartmentEditPart;
import ciat.diagram.edit.parts.SharedObjectSharedObjectOperationsCompartmentEditPart;
import ciat.diagram.edit.parts.SociogramEditPart;
import ciat.diagram.edit.parts.SociogramSociogramItsSociogramNodesCompartmentEditPart;
import ciat.diagram.edit.parts.SoftwareAgent2EditPart;
import ciat.diagram.edit.parts.SoftwareAgent3EditPart;
import ciat.diagram.edit.parts.SoftwareAgent4EditPart;
import ciat.diagram.edit.parts.SoftwareAgentEditPart;
import ciat.diagram.edit.parts.SuspendResumeEditPart;
import ciat.diagram.edit.parts.Team2EditPart;
import ciat.diagram.edit.parts.Team3EditPart;
import ciat.diagram.edit.parts.Team4EditPart;
import ciat.diagram.edit.parts.TeamEditPart;
import ciat.diagram.edit.parts.TemporalCondition2EditPart;
import ciat.diagram.edit.parts.TemporalConditionEditPart;
import ciat.diagram.edit.parts.ToolEditPart;
import ciat.diagram.edit.parts.UndeterministicChoiceEditPart;
import ciat.diagram.edit.parts.UserTaskEditPart;
import ciat.diagram.providers.CiatElementTypes;

/**
 * @generated
 */
public class CiatDiagramUpdater {

	/**
	* @generated
	*/
	public static boolean isShortcutOrphaned(View view) {
		return !view.isSetElement() || view.getElement() == null || view.getElement().eIsProxy();
	}

	/**
	* @generated
	*/
	public static List<CiatNodeDescriptor> getSemanticChildren(View view) {
		switch (CiatVisualIDRegistry.getVisualID(view)) {
		case CIATDiagramEditPart.VISUAL_ID:
			return getCIATDiagram_1000SemanticChildren(view);
		case IndividualTaskEditPart.VISUAL_ID:
			return getIndividualTask_3006SemanticChildren(view);
		case CooperativeTaskEditPart.VISUAL_ID:
			return getCooperativeTask_3014SemanticChildren(view);
		case CollaborativeTaskEditPart.VISUAL_ID:
			return getCollaborativeTask_3021SemanticChildren(view);
		case AbstractTaskEditPart.VISUAL_ID:
			return getAbstractTask_3028SemanticChildren(view);
		case IndividualTask2EditPart.VISUAL_ID:
			return getIndividualTask_3029SemanticChildren(view);
		case CooperativeTask2EditPart.VISUAL_ID:
			return getCooperativeTask_3030SemanticChildren(view);
		case CollaborativeTask2EditPart.VISUAL_ID:
			return getCollaborativeTask_3031SemanticChildren(view);
		case AbstractTask2EditPart.VISUAL_ID:
			return getAbstractTask_3032SemanticChildren(view);
		case SharedObjectEditPart.VISUAL_ID:
			return getSharedObject_3043SemanticChildren(view);
		case SociogramSociogramItsSociogramNodesCompartmentEditPart.VISUAL_ID:
			return getSociogramSociogramItsSociogramNodesCompartment_7001SemanticChildren(view);
		case ProcessDiagramProcessDiagramProcessNodesCompartmentEditPart.VISUAL_ID:
			return getProcessDiagramProcessDiagramProcessNodesCompartment_7002SemanticChildren(view);
		case IndividualTaskIndividualTaskTaskRolesCompartmentEditPart.VISUAL_ID:
			return getIndividualTaskIndividualTaskTaskRolesCompartment_7003SemanticChildren(view);
		case IndividualTaskIndividualTaskTaskObjectsCompartmentEditPart.VISUAL_ID:
			return getIndividualTaskIndividualTaskTaskObjectsCompartment_7004SemanticChildren(view);
		case CooperativeTaskCooperativeTaskTaskRolesCompartmentEditPart.VISUAL_ID:
			return getCooperativeTaskCooperativeTaskTaskRolesCompartment_7005SemanticChildren(view);
		case CooperativeTaskCooperativeTaskTaskObjectsCompartmentEditPart.VISUAL_ID:
			return getCooperativeTaskCooperativeTaskTaskObjectsCompartment_7006SemanticChildren(view);
		case CollaborativeTaskCollaborativeTaskTaskRolesCompartmentEditPart.VISUAL_ID:
			return getCollaborativeTaskCollaborativeTaskTaskRolesCompartment_7007SemanticChildren(view);
		case CollaborativeTaskCollaborativeTaskTaskObjectsCompartmentEditPart.VISUAL_ID:
			return getCollaborativeTaskCollaborativeTaskTaskObjectsCompartment_7008SemanticChildren(view);
		case AbstractTaskAbstractTaskProcessNodesCompartmentEditPart.VISUAL_ID:
			return getAbstractTaskAbstractTaskProcessNodesCompartment_7009SemanticChildren(view);
		case IndividualTaskIndividualTaskTaskRolesCompartment2EditPart.VISUAL_ID:
			return getIndividualTaskIndividualTaskTaskRolesCompartment_7010SemanticChildren(view);
		case IndividualTaskIndividualTaskTaskObjectsCompartment2EditPart.VISUAL_ID:
			return getIndividualTaskIndividualTaskTaskObjectsCompartment_7011SemanticChildren(view);
		case CooperativeTaskCooperativeTaskTaskRolesCompartment2EditPart.VISUAL_ID:
			return getCooperativeTaskCooperativeTaskTaskRolesCompartment_7012SemanticChildren(view);
		case CooperativeTaskCooperativeTaskTaskObjectsCompartment2EditPart.VISUAL_ID:
			return getCooperativeTaskCooperativeTaskTaskObjectsCompartment_7013SemanticChildren(view);
		case CollaborativeTaskCollaborativeTaskTaskRolesCompartment2EditPart.VISUAL_ID:
			return getCollaborativeTaskCollaborativeTaskTaskRolesCompartment_7014SemanticChildren(view);
		case CollaborativeTaskCollaborativeTaskTaskObjectsCompartment2EditPart.VISUAL_ID:
			return getCollaborativeTaskCollaborativeTaskTaskObjectsCompartment_7015SemanticChildren(view);
		case AbstractTaskAbstractTaskProcessNodesCompartment2EditPart.VISUAL_ID:
			return getAbstractTaskAbstractTaskProcessNodesCompartment_7016SemanticChildren(view);
		case DomainDiagramDomainDiagramSharedContextCompartmentEditPart.VISUAL_ID:
			return getDomainDiagramDomainDiagramSharedContextCompartment_7017SemanticChildren(view);
		case SharedObjectSharedObjectAttributesCompartmentEditPart.VISUAL_ID:
			return getSharedObjectSharedObjectAttributesCompartment_7018SemanticChildren(view);
		case SharedObjectSharedObjectOperationsCompartmentEditPart.VISUAL_ID:
			return getSharedObjectSharedObjectOperationsCompartment_7019SemanticChildren(view);
		case CTTDiagramCTTDiagramCttTasksCompartmentEditPart.VISUAL_ID:
			return getCTTDiagramCTTDiagramCttTasksCompartment_7020SemanticChildren(view);
		}
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<CiatNodeDescriptor> getCIATDiagram_1000SemanticChildren(View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		CIATDiagram modelElement = (CIATDiagram) view.getElement();
		LinkedList<CiatNodeDescriptor> result = new LinkedList<CiatNodeDescriptor>();
		for (Iterator<?> it = modelElement.getItsSociograms().iterator(); it.hasNext();) {
			Sociogram childElement = (Sociogram) it.next();
			int visualID = CiatVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == SociogramEditPart.VISUAL_ID) {
				result.add(new CiatNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getItsProcessDiagrams().iterator(); it.hasNext();) {
			ProcessDiagram childElement = (ProcessDiagram) it.next();
			int visualID = CiatVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == ProcessDiagramEditPart.VISUAL_ID) {
				result.add(new CiatNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getItsDomainDiagrams().iterator(); it.hasNext();) {
			DomainDiagram childElement = (DomainDiagram) it.next();
			int visualID = CiatVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == DomainDiagramEditPart.VISUAL_ID) {
				result.add(new CiatNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getItsCttDiagrams().iterator(); it.hasNext();) {
			CTTDiagram childElement = (CTTDiagram) it.next();
			int visualID = CiatVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == CTTDiagramEditPart.VISUAL_ID) {
				result.add(new CiatNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<CiatNodeDescriptor> getIndividualTask_3006SemanticChildren(View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		IndividualTask modelElement = (IndividualTask) view.getElement();
		LinkedList<CiatNodeDescriptor> result = new LinkedList<CiatNodeDescriptor>();
		for (Iterator<?> it = modelElement.getTools().iterator(); it.hasNext();) {
			Tool childElement = (Tool) it.next();
			int visualID = CiatVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == ToolEditPart.VISUAL_ID) {
				result.add(new CiatNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<CiatNodeDescriptor> getCooperativeTask_3014SemanticChildren(View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		CooperativeTask modelElement = (CooperativeTask) view.getElement();
		LinkedList<CiatNodeDescriptor> result = new LinkedList<CiatNodeDescriptor>();
		for (Iterator<?> it = modelElement.getTools().iterator(); it.hasNext();) {
			Tool childElement = (Tool) it.next();
			int visualID = CiatVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == ToolEditPart.VISUAL_ID) {
				result.add(new CiatNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<CiatNodeDescriptor> getCollaborativeTask_3021SemanticChildren(View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		CollaborativeTask modelElement = (CollaborativeTask) view.getElement();
		LinkedList<CiatNodeDescriptor> result = new LinkedList<CiatNodeDescriptor>();
		for (Iterator<?> it = modelElement.getTools().iterator(); it.hasNext();) {
			Tool childElement = (Tool) it.next();
			int visualID = CiatVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == ToolEditPart.VISUAL_ID) {
				result.add(new CiatNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<CiatNodeDescriptor> getAbstractTask_3028SemanticChildren(View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		AbstractTask modelElement = (AbstractTask) view.getElement();
		LinkedList<CiatNodeDescriptor> result = new LinkedList<CiatNodeDescriptor>();
		for (Iterator<?> it = modelElement.getTools().iterator(); it.hasNext();) {
			Tool childElement = (Tool) it.next();
			int visualID = CiatVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == ToolEditPart.VISUAL_ID) {
				result.add(new CiatNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<CiatNodeDescriptor> getIndividualTask_3029SemanticChildren(View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		IndividualTask modelElement = (IndividualTask) view.getElement();
		LinkedList<CiatNodeDescriptor> result = new LinkedList<CiatNodeDescriptor>();
		for (Iterator<?> it = modelElement.getTools().iterator(); it.hasNext();) {
			Tool childElement = (Tool) it.next();
			int visualID = CiatVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == ToolEditPart.VISUAL_ID) {
				result.add(new CiatNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<CiatNodeDescriptor> getCooperativeTask_3030SemanticChildren(View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		CooperativeTask modelElement = (CooperativeTask) view.getElement();
		LinkedList<CiatNodeDescriptor> result = new LinkedList<CiatNodeDescriptor>();
		for (Iterator<?> it = modelElement.getTools().iterator(); it.hasNext();) {
			Tool childElement = (Tool) it.next();
			int visualID = CiatVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == ToolEditPart.VISUAL_ID) {
				result.add(new CiatNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<CiatNodeDescriptor> getCollaborativeTask_3031SemanticChildren(View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		CollaborativeTask modelElement = (CollaborativeTask) view.getElement();
		LinkedList<CiatNodeDescriptor> result = new LinkedList<CiatNodeDescriptor>();
		for (Iterator<?> it = modelElement.getTools().iterator(); it.hasNext();) {
			Tool childElement = (Tool) it.next();
			int visualID = CiatVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == ToolEditPart.VISUAL_ID) {
				result.add(new CiatNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<CiatNodeDescriptor> getAbstractTask_3032SemanticChildren(View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		AbstractTask modelElement = (AbstractTask) view.getElement();
		LinkedList<CiatNodeDescriptor> result = new LinkedList<CiatNodeDescriptor>();
		for (Iterator<?> it = modelElement.getTools().iterator(); it.hasNext();) {
			Tool childElement = (Tool) it.next();
			int visualID = CiatVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == ToolEditPart.VISUAL_ID) {
				result.add(new CiatNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<CiatNodeDescriptor> getSharedObject_3043SemanticChildren(View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		SharedObject modelElement = (SharedObject) view.getElement();
		LinkedList<CiatNodeDescriptor> result = new LinkedList<CiatNodeDescriptor>();
		{
			VisualizationArea childElement = modelElement.getVAreas();
			int visualID = CiatVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == ExclusiveEditionAreaEditPart.VISUAL_ID) {
				result.add(new CiatNodeDescriptor(childElement, visualID));
			}
			if (visualID == CollaborativeAreaEditPart.VISUAL_ID) {
				result.add(new CiatNodeDescriptor(childElement, visualID));
			}
			if (visualID == IndividualAreaEditPart.VISUAL_ID) {
				result.add(new CiatNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<CiatNodeDescriptor> getSociogramSociogramItsSociogramNodesCompartment_7001SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		Sociogram modelElement = (Sociogram) containerView.getElement();
		LinkedList<CiatNodeDescriptor> result = new LinkedList<CiatNodeDescriptor>();
		for (Iterator<?> it = modelElement.getItsSociogramNodes().iterator(); it.hasNext();) {
			SociogramNode childElement = (SociogramNode) it.next();
			int visualID = CiatVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == RolEditPart.VISUAL_ID) {
				result.add(new CiatNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == ActorEditPart.VISUAL_ID) {
				result.add(new CiatNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == SoftwareAgentEditPart.VISUAL_ID) {
				result.add(new CiatNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == TeamEditPart.VISUAL_ID) {
				result.add(new CiatNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == GroupEditPart.VISUAL_ID) {
				result.add(new CiatNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<CiatNodeDescriptor> getProcessDiagramProcessDiagramProcessNodesCompartment_7002SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		ProcessDiagram modelElement = (ProcessDiagram) containerView.getElement();
		LinkedList<CiatNodeDescriptor> result = new LinkedList<CiatNodeDescriptor>();
		for (Iterator<?> it = modelElement.getProcessNodes().iterator(); it.hasNext();) {
			ProcessNode childElement = (ProcessNode) it.next();
			int visualID = CiatVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == IndividualTaskEditPart.VISUAL_ID) {
				result.add(new CiatNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == CooperativeTaskEditPart.VISUAL_ID) {
				result.add(new CiatNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == CollaborativeTaskEditPart.VISUAL_ID) {
				result.add(new CiatNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == AbstractTaskEditPart.VISUAL_ID) {
				result.add(new CiatNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Init2EditPart.VISUAL_ID) {
				result.add(new CiatNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == End2EditPart.VISUAL_ID) {
				result.add(new CiatNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == TemporalCondition2EditPart.VISUAL_ID) {
				result.add(new CiatNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Notification2EditPart.VISUAL_ID) {
				result.add(new CiatNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Condition2EditPart.VISUAL_ID) {
				result.add(new CiatNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<CiatNodeDescriptor> getIndividualTaskIndividualTaskTaskRolesCompartment_7003SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		IndividualTask modelElement = (IndividualTask) containerView.getElement();
		LinkedList<CiatNodeDescriptor> result = new LinkedList<CiatNodeDescriptor>();
		{
			SociogramNode childElement = modelElement.getTaskRoles();
			int visualID = CiatVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == Rol2EditPart.VISUAL_ID) {
				result.add(new CiatNodeDescriptor(childElement, visualID));
			}
			if (visualID == Actor2EditPart.VISUAL_ID) {
				result.add(new CiatNodeDescriptor(childElement, visualID));
			}
			if (visualID == SoftwareAgent2EditPart.VISUAL_ID) {
				result.add(new CiatNodeDescriptor(childElement, visualID));
			}
			if (visualID == Team2EditPart.VISUAL_ID) {
				result.add(new CiatNodeDescriptor(childElement, visualID));
			}
			if (visualID == Group2EditPart.VISUAL_ID) {
				result.add(new CiatNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<CiatNodeDescriptor> getIndividualTaskIndividualTaskTaskObjectsCompartment_7004SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		IndividualTask modelElement = (IndividualTask) containerView.getElement();
		LinkedList<CiatNodeDescriptor> result = new LinkedList<CiatNodeDescriptor>();
		for (Iterator<?> it = modelElement.getTaskObjects().iterator(); it.hasNext();) {
			Object childElement = (Object) it.next();
			int visualID = CiatVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == ObjectEditPart.VISUAL_ID) {
				result.add(new CiatNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<CiatNodeDescriptor> getCooperativeTaskCooperativeTaskTaskRolesCompartment_7005SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		CooperativeTask modelElement = (CooperativeTask) containerView.getElement();
		LinkedList<CiatNodeDescriptor> result = new LinkedList<CiatNodeDescriptor>();
		for (Iterator<?> it = modelElement.getTaskRoles().iterator(); it.hasNext();) {
			SociogramNode childElement = (SociogramNode) it.next();
			int visualID = CiatVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == Rol3EditPart.VISUAL_ID) {
				result.add(new CiatNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Actor3EditPart.VISUAL_ID) {
				result.add(new CiatNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == SoftwareAgent3EditPart.VISUAL_ID) {
				result.add(new CiatNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Team3EditPart.VISUAL_ID) {
				result.add(new CiatNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Group3EditPart.VISUAL_ID) {
				result.add(new CiatNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<CiatNodeDescriptor> getCooperativeTaskCooperativeTaskTaskObjectsCompartment_7006SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		CooperativeTask modelElement = (CooperativeTask) containerView.getElement();
		LinkedList<CiatNodeDescriptor> result = new LinkedList<CiatNodeDescriptor>();
		for (Iterator<?> it = modelElement.getTaskObjects().iterator(); it.hasNext();) {
			Object childElement = (Object) it.next();
			int visualID = CiatVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == Object2EditPart.VISUAL_ID) {
				result.add(new CiatNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<CiatNodeDescriptor> getCollaborativeTaskCollaborativeTaskTaskRolesCompartment_7007SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		CollaborativeTask modelElement = (CollaborativeTask) containerView.getElement();
		LinkedList<CiatNodeDescriptor> result = new LinkedList<CiatNodeDescriptor>();
		for (Iterator<?> it = modelElement.getTaskRoles().iterator(); it.hasNext();) {
			SociogramNode childElement = (SociogramNode) it.next();
			int visualID = CiatVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == Rol4EditPart.VISUAL_ID) {
				result.add(new CiatNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Actor4EditPart.VISUAL_ID) {
				result.add(new CiatNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == SoftwareAgent4EditPart.VISUAL_ID) {
				result.add(new CiatNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Team4EditPart.VISUAL_ID) {
				result.add(new CiatNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Group4EditPart.VISUAL_ID) {
				result.add(new CiatNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<CiatNodeDescriptor> getCollaborativeTaskCollaborativeTaskTaskObjectsCompartment_7008SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		CollaborativeTask modelElement = (CollaborativeTask) containerView.getElement();
		LinkedList<CiatNodeDescriptor> result = new LinkedList<CiatNodeDescriptor>();
		for (Iterator<?> it = modelElement.getTaskObjects().iterator(); it.hasNext();) {
			Object childElement = (Object) it.next();
			int visualID = CiatVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == Object3EditPart.VISUAL_ID) {
				result.add(new CiatNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<CiatNodeDescriptor> getAbstractTaskAbstractTaskProcessNodesCompartment_7009SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		AbstractTask modelElement = (AbstractTask) containerView.getElement();
		LinkedList<CiatNodeDescriptor> result = new LinkedList<CiatNodeDescriptor>();
		for (Iterator<?> it = modelElement.getProcessNodes().iterator(); it.hasNext();) {
			ProcessNode childElement = (ProcessNode) it.next();
			int visualID = CiatVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == IndividualTask2EditPart.VISUAL_ID) {
				result.add(new CiatNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == CooperativeTask2EditPart.VISUAL_ID) {
				result.add(new CiatNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == CollaborativeTask2EditPart.VISUAL_ID) {
				result.add(new CiatNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == AbstractTask2EditPart.VISUAL_ID) {
				result.add(new CiatNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == InitEditPart.VISUAL_ID) {
				result.add(new CiatNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == EndEditPart.VISUAL_ID) {
				result.add(new CiatNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == TemporalConditionEditPart.VISUAL_ID) {
				result.add(new CiatNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == NotificationEditPart.VISUAL_ID) {
				result.add(new CiatNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == ConditionEditPart.VISUAL_ID) {
				result.add(new CiatNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<CiatNodeDescriptor> getIndividualTaskIndividualTaskTaskRolesCompartment_7010SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		IndividualTask modelElement = (IndividualTask) containerView.getElement();
		LinkedList<CiatNodeDescriptor> result = new LinkedList<CiatNodeDescriptor>();
		{
			SociogramNode childElement = modelElement.getTaskRoles();
			int visualID = CiatVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == Rol2EditPart.VISUAL_ID) {
				result.add(new CiatNodeDescriptor(childElement, visualID));
			}
			if (visualID == Actor2EditPart.VISUAL_ID) {
				result.add(new CiatNodeDescriptor(childElement, visualID));
			}
			if (visualID == SoftwareAgent2EditPart.VISUAL_ID) {
				result.add(new CiatNodeDescriptor(childElement, visualID));
			}
			if (visualID == Team2EditPart.VISUAL_ID) {
				result.add(new CiatNodeDescriptor(childElement, visualID));
			}
			if (visualID == Group2EditPart.VISUAL_ID) {
				result.add(new CiatNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<CiatNodeDescriptor> getIndividualTaskIndividualTaskTaskObjectsCompartment_7011SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		IndividualTask modelElement = (IndividualTask) containerView.getElement();
		LinkedList<CiatNodeDescriptor> result = new LinkedList<CiatNodeDescriptor>();
		for (Iterator<?> it = modelElement.getTaskObjects().iterator(); it.hasNext();) {
			Object childElement = (Object) it.next();
			int visualID = CiatVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == ObjectEditPart.VISUAL_ID) {
				result.add(new CiatNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<CiatNodeDescriptor> getCooperativeTaskCooperativeTaskTaskRolesCompartment_7012SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		CooperativeTask modelElement = (CooperativeTask) containerView.getElement();
		LinkedList<CiatNodeDescriptor> result = new LinkedList<CiatNodeDescriptor>();
		for (Iterator<?> it = modelElement.getTaskRoles().iterator(); it.hasNext();) {
			SociogramNode childElement = (SociogramNode) it.next();
			int visualID = CiatVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == Rol3EditPart.VISUAL_ID) {
				result.add(new CiatNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Actor3EditPart.VISUAL_ID) {
				result.add(new CiatNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == SoftwareAgent3EditPart.VISUAL_ID) {
				result.add(new CiatNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Team3EditPart.VISUAL_ID) {
				result.add(new CiatNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Group3EditPart.VISUAL_ID) {
				result.add(new CiatNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<CiatNodeDescriptor> getCooperativeTaskCooperativeTaskTaskObjectsCompartment_7013SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		CooperativeTask modelElement = (CooperativeTask) containerView.getElement();
		LinkedList<CiatNodeDescriptor> result = new LinkedList<CiatNodeDescriptor>();
		for (Iterator<?> it = modelElement.getTaskObjects().iterator(); it.hasNext();) {
			Object childElement = (Object) it.next();
			int visualID = CiatVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == Object2EditPart.VISUAL_ID) {
				result.add(new CiatNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<CiatNodeDescriptor> getCollaborativeTaskCollaborativeTaskTaskRolesCompartment_7014SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		CollaborativeTask modelElement = (CollaborativeTask) containerView.getElement();
		LinkedList<CiatNodeDescriptor> result = new LinkedList<CiatNodeDescriptor>();
		for (Iterator<?> it = modelElement.getTaskRoles().iterator(); it.hasNext();) {
			SociogramNode childElement = (SociogramNode) it.next();
			int visualID = CiatVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == Rol4EditPart.VISUAL_ID) {
				result.add(new CiatNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Actor4EditPart.VISUAL_ID) {
				result.add(new CiatNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == SoftwareAgent4EditPart.VISUAL_ID) {
				result.add(new CiatNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Team4EditPart.VISUAL_ID) {
				result.add(new CiatNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Group4EditPart.VISUAL_ID) {
				result.add(new CiatNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<CiatNodeDescriptor> getCollaborativeTaskCollaborativeTaskTaskObjectsCompartment_7015SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		CollaborativeTask modelElement = (CollaborativeTask) containerView.getElement();
		LinkedList<CiatNodeDescriptor> result = new LinkedList<CiatNodeDescriptor>();
		for (Iterator<?> it = modelElement.getTaskObjects().iterator(); it.hasNext();) {
			Object childElement = (Object) it.next();
			int visualID = CiatVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == Object3EditPart.VISUAL_ID) {
				result.add(new CiatNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<CiatNodeDescriptor> getAbstractTaskAbstractTaskProcessNodesCompartment_7016SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		AbstractTask modelElement = (AbstractTask) containerView.getElement();
		LinkedList<CiatNodeDescriptor> result = new LinkedList<CiatNodeDescriptor>();
		for (Iterator<?> it = modelElement.getProcessNodes().iterator(); it.hasNext();) {
			ProcessNode childElement = (ProcessNode) it.next();
			int visualID = CiatVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == IndividualTask2EditPart.VISUAL_ID) {
				result.add(new CiatNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == CooperativeTask2EditPart.VISUAL_ID) {
				result.add(new CiatNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == CollaborativeTask2EditPart.VISUAL_ID) {
				result.add(new CiatNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == AbstractTask2EditPart.VISUAL_ID) {
				result.add(new CiatNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == InitEditPart.VISUAL_ID) {
				result.add(new CiatNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == EndEditPart.VISUAL_ID) {
				result.add(new CiatNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == TemporalConditionEditPart.VISUAL_ID) {
				result.add(new CiatNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == NotificationEditPart.VISUAL_ID) {
				result.add(new CiatNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == ConditionEditPart.VISUAL_ID) {
				result.add(new CiatNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<CiatNodeDescriptor> getDomainDiagramDomainDiagramSharedContextCompartment_7017SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		DomainDiagram modelElement = (DomainDiagram) containerView.getElement();
		LinkedList<CiatNodeDescriptor> result = new LinkedList<CiatNodeDescriptor>();
		for (Iterator<?> it = modelElement.getSharedContext().iterator(); it.hasNext();) {
			SharedObject childElement = (SharedObject) it.next();
			int visualID = CiatVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == SharedObjectEditPart.VISUAL_ID) {
				result.add(new CiatNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<CiatNodeDescriptor> getSharedObjectSharedObjectAttributesCompartment_7018SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		SharedObject modelElement = (SharedObject) containerView.getElement();
		LinkedList<CiatNodeDescriptor> result = new LinkedList<CiatNodeDescriptor>();
		for (Iterator<?> it = modelElement.getAttributes().iterator(); it.hasNext();) {
			Attribute childElement = (Attribute) it.next();
			int visualID = CiatVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == AttributeEditPart.VISUAL_ID) {
				result.add(new CiatNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<CiatNodeDescriptor> getSharedObjectSharedObjectOperationsCompartment_7019SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		SharedObject modelElement = (SharedObject) containerView.getElement();
		LinkedList<CiatNodeDescriptor> result = new LinkedList<CiatNodeDescriptor>();
		for (Iterator<?> it = modelElement.getOperations().iterator(); it.hasNext();) {
			Operation childElement = (Operation) it.next();
			int visualID = CiatVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == OperationEditPart.VISUAL_ID) {
				result.add(new CiatNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<CiatNodeDescriptor> getCTTDiagramCTTDiagramCttTasksCompartment_7020SemanticChildren(View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		CTTDiagram modelElement = (CTTDiagram) containerView.getElement();
		LinkedList<CiatNodeDescriptor> result = new LinkedList<CiatNodeDescriptor>();
		for (Iterator<?> it = modelElement.getCttTasks().iterator(); it.hasNext();) {
			CTTTask childElement = (CTTTask) it.next();
			int visualID = CiatVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == ExclusiveEditionEditPart.VISUAL_ID) {
				result.add(new CiatNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == CollaborativeVisualizationEditPart.VISUAL_ID) {
				result.add(new CiatNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == IndividualVisualizationEditPart.VISUAL_ID) {
				result.add(new CiatNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == UserTaskEditPart.VISUAL_ID) {
				result.add(new CiatNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == CTTAbstractTaskEditPart.VISUAL_ID) {
				result.add(new CiatNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == InteractiveTaskEditPart.VISUAL_ID) {
				result.add(new CiatNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == CTTCollaborativeTaskEditPart.VISUAL_ID) {
				result.add(new CiatNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == ApplicationTaskEditPart.VISUAL_ID) {
				result.add(new CiatNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<CiatLinkDescriptor> getContainedLinks(View view) {
		switch (CiatVisualIDRegistry.getVisualID(view)) {
		case CIATDiagramEditPart.VISUAL_ID:
			return getCIATDiagram_1000ContainedLinks(view);
		case SociogramEditPart.VISUAL_ID:
			return getSociogram_2001ContainedLinks(view);
		case ProcessDiagramEditPart.VISUAL_ID:
			return getProcessDiagram_2002ContainedLinks(view);
		case DomainDiagramEditPart.VISUAL_ID:
			return getDomainDiagram_2003ContainedLinks(view);
		case CTTDiagramEditPart.VISUAL_ID:
			return getCTTDiagram_2004ContainedLinks(view);
		case RolEditPart.VISUAL_ID:
			return getRol_3001ContainedLinks(view);
		case ActorEditPart.VISUAL_ID:
			return getActor_3002ContainedLinks(view);
		case SoftwareAgentEditPart.VISUAL_ID:
			return getSoftwareAgent_3003ContainedLinks(view);
		case TeamEditPart.VISUAL_ID:
			return getTeam_3004ContainedLinks(view);
		case GroupEditPart.VISUAL_ID:
			return getGroup_3005ContainedLinks(view);
		case IndividualTaskEditPart.VISUAL_ID:
			return getIndividualTask_3006ContainedLinks(view);
		case Rol2EditPart.VISUAL_ID:
			return getRol_3007ContainedLinks(view);
		case Actor2EditPart.VISUAL_ID:
			return getActor_3008ContainedLinks(view);
		case SoftwareAgent2EditPart.VISUAL_ID:
			return getSoftwareAgent_3009ContainedLinks(view);
		case Team2EditPart.VISUAL_ID:
			return getTeam_3010ContainedLinks(view);
		case Group2EditPart.VISUAL_ID:
			return getGroup_3011ContainedLinks(view);
		case ToolEditPart.VISUAL_ID:
			return getTool_3012ContainedLinks(view);
		case ObjectEditPart.VISUAL_ID:
			return getObject_3013ContainedLinks(view);
		case CooperativeTaskEditPart.VISUAL_ID:
			return getCooperativeTask_3014ContainedLinks(view);
		case Rol3EditPart.VISUAL_ID:
			return getRol_3015ContainedLinks(view);
		case Actor3EditPart.VISUAL_ID:
			return getActor_3016ContainedLinks(view);
		case SoftwareAgent3EditPart.VISUAL_ID:
			return getSoftwareAgent_3017ContainedLinks(view);
		case Team3EditPart.VISUAL_ID:
			return getTeam_3018ContainedLinks(view);
		case Group3EditPart.VISUAL_ID:
			return getGroup_3019ContainedLinks(view);
		case Object2EditPart.VISUAL_ID:
			return getObject_3020ContainedLinks(view);
		case CollaborativeTaskEditPart.VISUAL_ID:
			return getCollaborativeTask_3021ContainedLinks(view);
		case Rol4EditPart.VISUAL_ID:
			return getRol_3022ContainedLinks(view);
		case Actor4EditPart.VISUAL_ID:
			return getActor_3023ContainedLinks(view);
		case SoftwareAgent4EditPart.VISUAL_ID:
			return getSoftwareAgent_3024ContainedLinks(view);
		case Team4EditPart.VISUAL_ID:
			return getTeam_3025ContainedLinks(view);
		case Group4EditPart.VISUAL_ID:
			return getGroup_3026ContainedLinks(view);
		case Object3EditPart.VISUAL_ID:
			return getObject_3027ContainedLinks(view);
		case AbstractTaskEditPart.VISUAL_ID:
			return getAbstractTask_3028ContainedLinks(view);
		case IndividualTask2EditPart.VISUAL_ID:
			return getIndividualTask_3029ContainedLinks(view);
		case CooperativeTask2EditPart.VISUAL_ID:
			return getCooperativeTask_3030ContainedLinks(view);
		case CollaborativeTask2EditPart.VISUAL_ID:
			return getCollaborativeTask_3031ContainedLinks(view);
		case AbstractTask2EditPart.VISUAL_ID:
			return getAbstractTask_3032ContainedLinks(view);
		case InitEditPart.VISUAL_ID:
			return getInit_3033ContainedLinks(view);
		case EndEditPart.VISUAL_ID:
			return getEnd_3034ContainedLinks(view);
		case TemporalConditionEditPart.VISUAL_ID:
			return getTemporalCondition_3035ContainedLinks(view);
		case NotificationEditPart.VISUAL_ID:
			return getNotification_3036ContainedLinks(view);
		case ConditionEditPart.VISUAL_ID:
			return getCondition_3037ContainedLinks(view);
		case Init2EditPart.VISUAL_ID:
			return getInit_3038ContainedLinks(view);
		case End2EditPart.VISUAL_ID:
			return getEnd_3039ContainedLinks(view);
		case TemporalCondition2EditPart.VISUAL_ID:
			return getTemporalCondition_3040ContainedLinks(view);
		case Notification2EditPart.VISUAL_ID:
			return getNotification_3041ContainedLinks(view);
		case Condition2EditPart.VISUAL_ID:
			return getCondition_3042ContainedLinks(view);
		case SharedObjectEditPart.VISUAL_ID:
			return getSharedObject_3043ContainedLinks(view);
		case ExclusiveEditionAreaEditPart.VISUAL_ID:
			return getExclusiveEditionArea_3044ContainedLinks(view);
		case CollaborativeAreaEditPart.VISUAL_ID:
			return getCollaborativeArea_3045ContainedLinks(view);
		case IndividualAreaEditPart.VISUAL_ID:
			return getIndividualArea_3046ContainedLinks(view);
		case AttributeEditPart.VISUAL_ID:
			return getAttribute_3047ContainedLinks(view);
		case OperationEditPart.VISUAL_ID:
			return getOperation_3048ContainedLinks(view);
		case ExclusiveEditionEditPart.VISUAL_ID:
			return getExclusiveEdition_3049ContainedLinks(view);
		case CollaborativeVisualizationEditPart.VISUAL_ID:
			return getCollaborativeVisualization_3050ContainedLinks(view);
		case IndividualVisualizationEditPart.VISUAL_ID:
			return getIndividualVisualization_3051ContainedLinks(view);
		case UserTaskEditPart.VISUAL_ID:
			return getUserTask_3052ContainedLinks(view);
		case CTTAbstractTaskEditPart.VISUAL_ID:
			return getCTTAbstractTask_3053ContainedLinks(view);
		case InteractiveTaskEditPart.VISUAL_ID:
			return getInteractiveTask_3054ContainedLinks(view);
		case CTTCollaborativeTaskEditPart.VISUAL_ID:
			return getCTTCollaborativeTask_3055ContainedLinks(view);
		case ApplicationTaskEditPart.VISUAL_ID:
			return getApplicationTask_3056ContainedLinks(view);
		case InheritanceEditPart.VISUAL_ID:
			return getInheritance_4001ContainedLinks(view);
		case ActingEditPart.VISUAL_ID:
			return getActing_4002ContainedLinks(view);
		case AssociationEditPart.VISUAL_ID:
			return getAssociation_4003ContainedLinks(view);
		case ShAssociationLinkEditPart.VISUAL_ID:
			return getShAssociationLink_4004ContainedLinks(view);
		case ShGeneralizationLinkEditPart.VISUAL_ID:
			return getShGeneralizationLink_4005ContainedLinks(view);
		case ShAggregationLinkEditPart.VISUAL_ID:
			return getShAggregationLink_4006ContainedLinks(view);
		case AggregationEditPart.VISUAL_ID:
			return getAggregation_4007ContainedLinks(view);
		case EnablingEditPart.VISUAL_ID:
			return getEnabling_4008ContainedLinks(view);
		case DisablingEditPart.VISUAL_ID:
			return getDisabling_4009ContainedLinks(view);
		case EnablingWithInformationPassingEditPart.VISUAL_ID:
			return getEnablingWithInformationPassing_4010ContainedLinks(view);
		case DisablingWithInformationPassingEditPart.VISUAL_ID:
			return getDisablingWithInformationPassing_4011ContainedLinks(view);
		case IndependentConcurrencyEditPart.VISUAL_ID:
			return getIndependentConcurrency_4012ContainedLinks(view);
		case OrderIndependenceEditPart.VISUAL_ID:
			return getOrderIndependence_4013ContainedLinks(view);
		case SuspendResumeEditPart.VISUAL_ID:
			return getSuspendResume_4014ContainedLinks(view);
		case ConcurrencyWithInformationPassingEditPart.VISUAL_ID:
			return getConcurrencyWithInformationPassing_4015ContainedLinks(view);
		case DeterministicChoiceEditPart.VISUAL_ID:
			return getDeterministicChoice_4016ContainedLinks(view);
		case UndeterministicChoiceEditPart.VISUAL_ID:
			return getUndeterministicChoice_4017ContainedLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<CiatLinkDescriptor> getIncomingLinks(View view) {
		switch (CiatVisualIDRegistry.getVisualID(view)) {
		case SociogramEditPart.VISUAL_ID:
			return getSociogram_2001IncomingLinks(view);
		case ProcessDiagramEditPart.VISUAL_ID:
			return getProcessDiagram_2002IncomingLinks(view);
		case DomainDiagramEditPart.VISUAL_ID:
			return getDomainDiagram_2003IncomingLinks(view);
		case CTTDiagramEditPart.VISUAL_ID:
			return getCTTDiagram_2004IncomingLinks(view);
		case RolEditPart.VISUAL_ID:
			return getRol_3001IncomingLinks(view);
		case ActorEditPart.VISUAL_ID:
			return getActor_3002IncomingLinks(view);
		case SoftwareAgentEditPart.VISUAL_ID:
			return getSoftwareAgent_3003IncomingLinks(view);
		case TeamEditPart.VISUAL_ID:
			return getTeam_3004IncomingLinks(view);
		case GroupEditPart.VISUAL_ID:
			return getGroup_3005IncomingLinks(view);
		case IndividualTaskEditPart.VISUAL_ID:
			return getIndividualTask_3006IncomingLinks(view);
		case Rol2EditPart.VISUAL_ID:
			return getRol_3007IncomingLinks(view);
		case Actor2EditPart.VISUAL_ID:
			return getActor_3008IncomingLinks(view);
		case SoftwareAgent2EditPart.VISUAL_ID:
			return getSoftwareAgent_3009IncomingLinks(view);
		case Team2EditPart.VISUAL_ID:
			return getTeam_3010IncomingLinks(view);
		case Group2EditPart.VISUAL_ID:
			return getGroup_3011IncomingLinks(view);
		case ToolEditPart.VISUAL_ID:
			return getTool_3012IncomingLinks(view);
		case ObjectEditPart.VISUAL_ID:
			return getObject_3013IncomingLinks(view);
		case CooperativeTaskEditPart.VISUAL_ID:
			return getCooperativeTask_3014IncomingLinks(view);
		case Rol3EditPart.VISUAL_ID:
			return getRol_3015IncomingLinks(view);
		case Actor3EditPart.VISUAL_ID:
			return getActor_3016IncomingLinks(view);
		case SoftwareAgent3EditPart.VISUAL_ID:
			return getSoftwareAgent_3017IncomingLinks(view);
		case Team3EditPart.VISUAL_ID:
			return getTeam_3018IncomingLinks(view);
		case Group3EditPart.VISUAL_ID:
			return getGroup_3019IncomingLinks(view);
		case Object2EditPart.VISUAL_ID:
			return getObject_3020IncomingLinks(view);
		case CollaborativeTaskEditPart.VISUAL_ID:
			return getCollaborativeTask_3021IncomingLinks(view);
		case Rol4EditPart.VISUAL_ID:
			return getRol_3022IncomingLinks(view);
		case Actor4EditPart.VISUAL_ID:
			return getActor_3023IncomingLinks(view);
		case SoftwareAgent4EditPart.VISUAL_ID:
			return getSoftwareAgent_3024IncomingLinks(view);
		case Team4EditPart.VISUAL_ID:
			return getTeam_3025IncomingLinks(view);
		case Group4EditPart.VISUAL_ID:
			return getGroup_3026IncomingLinks(view);
		case Object3EditPart.VISUAL_ID:
			return getObject_3027IncomingLinks(view);
		case AbstractTaskEditPart.VISUAL_ID:
			return getAbstractTask_3028IncomingLinks(view);
		case IndividualTask2EditPart.VISUAL_ID:
			return getIndividualTask_3029IncomingLinks(view);
		case CooperativeTask2EditPart.VISUAL_ID:
			return getCooperativeTask_3030IncomingLinks(view);
		case CollaborativeTask2EditPart.VISUAL_ID:
			return getCollaborativeTask_3031IncomingLinks(view);
		case AbstractTask2EditPart.VISUAL_ID:
			return getAbstractTask_3032IncomingLinks(view);
		case InitEditPart.VISUAL_ID:
			return getInit_3033IncomingLinks(view);
		case EndEditPart.VISUAL_ID:
			return getEnd_3034IncomingLinks(view);
		case TemporalConditionEditPart.VISUAL_ID:
			return getTemporalCondition_3035IncomingLinks(view);
		case NotificationEditPart.VISUAL_ID:
			return getNotification_3036IncomingLinks(view);
		case ConditionEditPart.VISUAL_ID:
			return getCondition_3037IncomingLinks(view);
		case Init2EditPart.VISUAL_ID:
			return getInit_3038IncomingLinks(view);
		case End2EditPart.VISUAL_ID:
			return getEnd_3039IncomingLinks(view);
		case TemporalCondition2EditPart.VISUAL_ID:
			return getTemporalCondition_3040IncomingLinks(view);
		case Notification2EditPart.VISUAL_ID:
			return getNotification_3041IncomingLinks(view);
		case Condition2EditPart.VISUAL_ID:
			return getCondition_3042IncomingLinks(view);
		case SharedObjectEditPart.VISUAL_ID:
			return getSharedObject_3043IncomingLinks(view);
		case ExclusiveEditionAreaEditPart.VISUAL_ID:
			return getExclusiveEditionArea_3044IncomingLinks(view);
		case CollaborativeAreaEditPart.VISUAL_ID:
			return getCollaborativeArea_3045IncomingLinks(view);
		case IndividualAreaEditPart.VISUAL_ID:
			return getIndividualArea_3046IncomingLinks(view);
		case AttributeEditPart.VISUAL_ID:
			return getAttribute_3047IncomingLinks(view);
		case OperationEditPart.VISUAL_ID:
			return getOperation_3048IncomingLinks(view);
		case ExclusiveEditionEditPart.VISUAL_ID:
			return getExclusiveEdition_3049IncomingLinks(view);
		case CollaborativeVisualizationEditPart.VISUAL_ID:
			return getCollaborativeVisualization_3050IncomingLinks(view);
		case IndividualVisualizationEditPart.VISUAL_ID:
			return getIndividualVisualization_3051IncomingLinks(view);
		case UserTaskEditPart.VISUAL_ID:
			return getUserTask_3052IncomingLinks(view);
		case CTTAbstractTaskEditPart.VISUAL_ID:
			return getCTTAbstractTask_3053IncomingLinks(view);
		case InteractiveTaskEditPart.VISUAL_ID:
			return getInteractiveTask_3054IncomingLinks(view);
		case CTTCollaborativeTaskEditPart.VISUAL_ID:
			return getCTTCollaborativeTask_3055IncomingLinks(view);
		case ApplicationTaskEditPart.VISUAL_ID:
			return getApplicationTask_3056IncomingLinks(view);
		case InheritanceEditPart.VISUAL_ID:
			return getInheritance_4001IncomingLinks(view);
		case ActingEditPart.VISUAL_ID:
			return getActing_4002IncomingLinks(view);
		case AssociationEditPart.VISUAL_ID:
			return getAssociation_4003IncomingLinks(view);
		case ShAssociationLinkEditPart.VISUAL_ID:
			return getShAssociationLink_4004IncomingLinks(view);
		case ShGeneralizationLinkEditPart.VISUAL_ID:
			return getShGeneralizationLink_4005IncomingLinks(view);
		case ShAggregationLinkEditPart.VISUAL_ID:
			return getShAggregationLink_4006IncomingLinks(view);
		case AggregationEditPart.VISUAL_ID:
			return getAggregation_4007IncomingLinks(view);
		case EnablingEditPart.VISUAL_ID:
			return getEnabling_4008IncomingLinks(view);
		case DisablingEditPart.VISUAL_ID:
			return getDisabling_4009IncomingLinks(view);
		case EnablingWithInformationPassingEditPart.VISUAL_ID:
			return getEnablingWithInformationPassing_4010IncomingLinks(view);
		case DisablingWithInformationPassingEditPart.VISUAL_ID:
			return getDisablingWithInformationPassing_4011IncomingLinks(view);
		case IndependentConcurrencyEditPart.VISUAL_ID:
			return getIndependentConcurrency_4012IncomingLinks(view);
		case OrderIndependenceEditPart.VISUAL_ID:
			return getOrderIndependence_4013IncomingLinks(view);
		case SuspendResumeEditPart.VISUAL_ID:
			return getSuspendResume_4014IncomingLinks(view);
		case ConcurrencyWithInformationPassingEditPart.VISUAL_ID:
			return getConcurrencyWithInformationPassing_4015IncomingLinks(view);
		case DeterministicChoiceEditPart.VISUAL_ID:
			return getDeterministicChoice_4016IncomingLinks(view);
		case UndeterministicChoiceEditPart.VISUAL_ID:
			return getUndeterministicChoice_4017IncomingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<CiatLinkDescriptor> getOutgoingLinks(View view) {
		switch (CiatVisualIDRegistry.getVisualID(view)) {
		case SociogramEditPart.VISUAL_ID:
			return getSociogram_2001OutgoingLinks(view);
		case ProcessDiagramEditPart.VISUAL_ID:
			return getProcessDiagram_2002OutgoingLinks(view);
		case DomainDiagramEditPart.VISUAL_ID:
			return getDomainDiagram_2003OutgoingLinks(view);
		case CTTDiagramEditPart.VISUAL_ID:
			return getCTTDiagram_2004OutgoingLinks(view);
		case RolEditPart.VISUAL_ID:
			return getRol_3001OutgoingLinks(view);
		case ActorEditPart.VISUAL_ID:
			return getActor_3002OutgoingLinks(view);
		case SoftwareAgentEditPart.VISUAL_ID:
			return getSoftwareAgent_3003OutgoingLinks(view);
		case TeamEditPart.VISUAL_ID:
			return getTeam_3004OutgoingLinks(view);
		case GroupEditPart.VISUAL_ID:
			return getGroup_3005OutgoingLinks(view);
		case IndividualTaskEditPart.VISUAL_ID:
			return getIndividualTask_3006OutgoingLinks(view);
		case Rol2EditPart.VISUAL_ID:
			return getRol_3007OutgoingLinks(view);
		case Actor2EditPart.VISUAL_ID:
			return getActor_3008OutgoingLinks(view);
		case SoftwareAgent2EditPart.VISUAL_ID:
			return getSoftwareAgent_3009OutgoingLinks(view);
		case Team2EditPart.VISUAL_ID:
			return getTeam_3010OutgoingLinks(view);
		case Group2EditPart.VISUAL_ID:
			return getGroup_3011OutgoingLinks(view);
		case ToolEditPart.VISUAL_ID:
			return getTool_3012OutgoingLinks(view);
		case ObjectEditPart.VISUAL_ID:
			return getObject_3013OutgoingLinks(view);
		case CooperativeTaskEditPart.VISUAL_ID:
			return getCooperativeTask_3014OutgoingLinks(view);
		case Rol3EditPart.VISUAL_ID:
			return getRol_3015OutgoingLinks(view);
		case Actor3EditPart.VISUAL_ID:
			return getActor_3016OutgoingLinks(view);
		case SoftwareAgent3EditPart.VISUAL_ID:
			return getSoftwareAgent_3017OutgoingLinks(view);
		case Team3EditPart.VISUAL_ID:
			return getTeam_3018OutgoingLinks(view);
		case Group3EditPart.VISUAL_ID:
			return getGroup_3019OutgoingLinks(view);
		case Object2EditPart.VISUAL_ID:
			return getObject_3020OutgoingLinks(view);
		case CollaborativeTaskEditPart.VISUAL_ID:
			return getCollaborativeTask_3021OutgoingLinks(view);
		case Rol4EditPart.VISUAL_ID:
			return getRol_3022OutgoingLinks(view);
		case Actor4EditPart.VISUAL_ID:
			return getActor_3023OutgoingLinks(view);
		case SoftwareAgent4EditPart.VISUAL_ID:
			return getSoftwareAgent_3024OutgoingLinks(view);
		case Team4EditPart.VISUAL_ID:
			return getTeam_3025OutgoingLinks(view);
		case Group4EditPart.VISUAL_ID:
			return getGroup_3026OutgoingLinks(view);
		case Object3EditPart.VISUAL_ID:
			return getObject_3027OutgoingLinks(view);
		case AbstractTaskEditPart.VISUAL_ID:
			return getAbstractTask_3028OutgoingLinks(view);
		case IndividualTask2EditPart.VISUAL_ID:
			return getIndividualTask_3029OutgoingLinks(view);
		case CooperativeTask2EditPart.VISUAL_ID:
			return getCooperativeTask_3030OutgoingLinks(view);
		case CollaborativeTask2EditPart.VISUAL_ID:
			return getCollaborativeTask_3031OutgoingLinks(view);
		case AbstractTask2EditPart.VISUAL_ID:
			return getAbstractTask_3032OutgoingLinks(view);
		case InitEditPart.VISUAL_ID:
			return getInit_3033OutgoingLinks(view);
		case EndEditPart.VISUAL_ID:
			return getEnd_3034OutgoingLinks(view);
		case TemporalConditionEditPart.VISUAL_ID:
			return getTemporalCondition_3035OutgoingLinks(view);
		case NotificationEditPart.VISUAL_ID:
			return getNotification_3036OutgoingLinks(view);
		case ConditionEditPart.VISUAL_ID:
			return getCondition_3037OutgoingLinks(view);
		case Init2EditPart.VISUAL_ID:
			return getInit_3038OutgoingLinks(view);
		case End2EditPart.VISUAL_ID:
			return getEnd_3039OutgoingLinks(view);
		case TemporalCondition2EditPart.VISUAL_ID:
			return getTemporalCondition_3040OutgoingLinks(view);
		case Notification2EditPart.VISUAL_ID:
			return getNotification_3041OutgoingLinks(view);
		case Condition2EditPart.VISUAL_ID:
			return getCondition_3042OutgoingLinks(view);
		case SharedObjectEditPart.VISUAL_ID:
			return getSharedObject_3043OutgoingLinks(view);
		case ExclusiveEditionAreaEditPart.VISUAL_ID:
			return getExclusiveEditionArea_3044OutgoingLinks(view);
		case CollaborativeAreaEditPart.VISUAL_ID:
			return getCollaborativeArea_3045OutgoingLinks(view);
		case IndividualAreaEditPart.VISUAL_ID:
			return getIndividualArea_3046OutgoingLinks(view);
		case AttributeEditPart.VISUAL_ID:
			return getAttribute_3047OutgoingLinks(view);
		case OperationEditPart.VISUAL_ID:
			return getOperation_3048OutgoingLinks(view);
		case ExclusiveEditionEditPart.VISUAL_ID:
			return getExclusiveEdition_3049OutgoingLinks(view);
		case CollaborativeVisualizationEditPart.VISUAL_ID:
			return getCollaborativeVisualization_3050OutgoingLinks(view);
		case IndividualVisualizationEditPart.VISUAL_ID:
			return getIndividualVisualization_3051OutgoingLinks(view);
		case UserTaskEditPart.VISUAL_ID:
			return getUserTask_3052OutgoingLinks(view);
		case CTTAbstractTaskEditPart.VISUAL_ID:
			return getCTTAbstractTask_3053OutgoingLinks(view);
		case InteractiveTaskEditPart.VISUAL_ID:
			return getInteractiveTask_3054OutgoingLinks(view);
		case CTTCollaborativeTaskEditPart.VISUAL_ID:
			return getCTTCollaborativeTask_3055OutgoingLinks(view);
		case ApplicationTaskEditPart.VISUAL_ID:
			return getApplicationTask_3056OutgoingLinks(view);
		case InheritanceEditPart.VISUAL_ID:
			return getInheritance_4001OutgoingLinks(view);
		case ActingEditPart.VISUAL_ID:
			return getActing_4002OutgoingLinks(view);
		case AssociationEditPart.VISUAL_ID:
			return getAssociation_4003OutgoingLinks(view);
		case ShAssociationLinkEditPart.VISUAL_ID:
			return getShAssociationLink_4004OutgoingLinks(view);
		case ShGeneralizationLinkEditPart.VISUAL_ID:
			return getShGeneralizationLink_4005OutgoingLinks(view);
		case ShAggregationLinkEditPart.VISUAL_ID:
			return getShAggregationLink_4006OutgoingLinks(view);
		case AggregationEditPart.VISUAL_ID:
			return getAggregation_4007OutgoingLinks(view);
		case EnablingEditPart.VISUAL_ID:
			return getEnabling_4008OutgoingLinks(view);
		case DisablingEditPart.VISUAL_ID:
			return getDisabling_4009OutgoingLinks(view);
		case EnablingWithInformationPassingEditPart.VISUAL_ID:
			return getEnablingWithInformationPassing_4010OutgoingLinks(view);
		case DisablingWithInformationPassingEditPart.VISUAL_ID:
			return getDisablingWithInformationPassing_4011OutgoingLinks(view);
		case IndependentConcurrencyEditPart.VISUAL_ID:
			return getIndependentConcurrency_4012OutgoingLinks(view);
		case OrderIndependenceEditPart.VISUAL_ID:
			return getOrderIndependence_4013OutgoingLinks(view);
		case SuspendResumeEditPart.VISUAL_ID:
			return getSuspendResume_4014OutgoingLinks(view);
		case ConcurrencyWithInformationPassingEditPart.VISUAL_ID:
			return getConcurrencyWithInformationPassing_4015OutgoingLinks(view);
		case DeterministicChoiceEditPart.VISUAL_ID:
			return getDeterministicChoice_4016OutgoingLinks(view);
		case UndeterministicChoiceEditPart.VISUAL_ID:
			return getUndeterministicChoice_4017OutgoingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CiatLinkDescriptor> getCIATDiagram_1000ContainedLinks(View view) {
		CIATDiagram modelElement = (CIATDiagram) view.getElement();
		LinkedList<CiatLinkDescriptor> result = new LinkedList<CiatLinkDescriptor>();
		result.addAll(getContainedTypeModelFacetLinks_Inheritance_4001(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_Acting_4002(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_Association_4003(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_ShAssociationLink_4004(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_ShGeneralizationLink_4005(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_ShAggregationLink_4006(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_Aggregation_4007(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_Enabling_4008(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_Disabling_4009(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_EnablingWithInformationPassing_4010(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_DisablingWithInformationPassing_4011(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_IndependentConcurrency_4012(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_OrderIndependence_4013(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_SuspendResume_4014(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_ConcurrencyWithInformationPassing_4015(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_DeterministicChoice_4016(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_UndeterministicChoice_4017(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<CiatLinkDescriptor> getSociogram_2001ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CiatLinkDescriptor> getProcessDiagram_2002ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CiatLinkDescriptor> getDomainDiagram_2003ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CiatLinkDescriptor> getCTTDiagram_2004ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CiatLinkDescriptor> getRol_3001ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CiatLinkDescriptor> getActor_3002ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CiatLinkDescriptor> getSoftwareAgent_3003ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CiatLinkDescriptor> getTeam_3004ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CiatLinkDescriptor> getGroup_3005ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CiatLinkDescriptor> getIndividualTask_3006ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CiatLinkDescriptor> getRol_3007ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CiatLinkDescriptor> getActor_3008ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CiatLinkDescriptor> getSoftwareAgent_3009ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CiatLinkDescriptor> getTeam_3010ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CiatLinkDescriptor> getGroup_3011ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CiatLinkDescriptor> getTool_3012ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CiatLinkDescriptor> getObject_3013ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CiatLinkDescriptor> getCooperativeTask_3014ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CiatLinkDescriptor> getRol_3015ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CiatLinkDescriptor> getActor_3016ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CiatLinkDescriptor> getSoftwareAgent_3017ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CiatLinkDescriptor> getTeam_3018ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CiatLinkDescriptor> getGroup_3019ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CiatLinkDescriptor> getObject_3020ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CiatLinkDescriptor> getCollaborativeTask_3021ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CiatLinkDescriptor> getRol_3022ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CiatLinkDescriptor> getActor_3023ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CiatLinkDescriptor> getSoftwareAgent_3024ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CiatLinkDescriptor> getTeam_3025ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CiatLinkDescriptor> getGroup_3026ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CiatLinkDescriptor> getObject_3027ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CiatLinkDescriptor> getAbstractTask_3028ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CiatLinkDescriptor> getIndividualTask_3029ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CiatLinkDescriptor> getCooperativeTask_3030ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CiatLinkDescriptor> getCollaborativeTask_3031ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CiatLinkDescriptor> getAbstractTask_3032ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CiatLinkDescriptor> getInit_3033ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CiatLinkDescriptor> getEnd_3034ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CiatLinkDescriptor> getTemporalCondition_3035ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CiatLinkDescriptor> getNotification_3036ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CiatLinkDescriptor> getCondition_3037ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CiatLinkDescriptor> getInit_3038ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CiatLinkDescriptor> getEnd_3039ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CiatLinkDescriptor> getTemporalCondition_3040ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CiatLinkDescriptor> getNotification_3041ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CiatLinkDescriptor> getCondition_3042ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CiatLinkDescriptor> getSharedObject_3043ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CiatLinkDescriptor> getExclusiveEditionArea_3044ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CiatLinkDescriptor> getCollaborativeArea_3045ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CiatLinkDescriptor> getIndividualArea_3046ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CiatLinkDescriptor> getAttribute_3047ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CiatLinkDescriptor> getOperation_3048ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CiatLinkDescriptor> getExclusiveEdition_3049ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CiatLinkDescriptor> getCollaborativeVisualization_3050ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CiatLinkDescriptor> getIndividualVisualization_3051ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CiatLinkDescriptor> getUserTask_3052ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CiatLinkDescriptor> getCTTAbstractTask_3053ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CiatLinkDescriptor> getInteractiveTask_3054ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CiatLinkDescriptor> getCTTCollaborativeTask_3055ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CiatLinkDescriptor> getApplicationTask_3056ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CiatLinkDescriptor> getInheritance_4001ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CiatLinkDescriptor> getActing_4002ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CiatLinkDescriptor> getAssociation_4003ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CiatLinkDescriptor> getShAssociationLink_4004ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CiatLinkDescriptor> getShGeneralizationLink_4005ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CiatLinkDescriptor> getShAggregationLink_4006ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CiatLinkDescriptor> getAggregation_4007ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CiatLinkDescriptor> getEnabling_4008ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CiatLinkDescriptor> getDisabling_4009ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CiatLinkDescriptor> getEnablingWithInformationPassing_4010ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CiatLinkDescriptor> getDisablingWithInformationPassing_4011ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CiatLinkDescriptor> getIndependentConcurrency_4012ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CiatLinkDescriptor> getOrderIndependence_4013ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CiatLinkDescriptor> getSuspendResume_4014ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CiatLinkDescriptor> getConcurrencyWithInformationPassing_4015ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CiatLinkDescriptor> getDeterministicChoice_4016ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CiatLinkDescriptor> getUndeterministicChoice_4017ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CiatLinkDescriptor> getSociogram_2001IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CiatLinkDescriptor> getProcessDiagram_2002IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CiatLinkDescriptor> getDomainDiagram_2003IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CiatLinkDescriptor> getCTTDiagram_2004IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CiatLinkDescriptor> getRol_3001IncomingLinks(View view) {
		Rol modelElement = (Rol) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<CiatLinkDescriptor> result = new LinkedList<CiatLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Inheritance_4001(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Acting_4002(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Association_4003(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<CiatLinkDescriptor> getActor_3002IncomingLinks(View view) {
		Actor modelElement = (Actor) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<CiatLinkDescriptor> result = new LinkedList<CiatLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Inheritance_4001(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Acting_4002(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Association_4003(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<CiatLinkDescriptor> getSoftwareAgent_3003IncomingLinks(View view) {
		SoftwareAgent modelElement = (SoftwareAgent) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<CiatLinkDescriptor> result = new LinkedList<CiatLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Inheritance_4001(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Acting_4002(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Association_4003(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<CiatLinkDescriptor> getTeam_3004IncomingLinks(View view) {
		Team modelElement = (Team) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<CiatLinkDescriptor> result = new LinkedList<CiatLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Inheritance_4001(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Acting_4002(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Association_4003(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<CiatLinkDescriptor> getGroup_3005IncomingLinks(View view) {
		Group modelElement = (Group) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<CiatLinkDescriptor> result = new LinkedList<CiatLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Inheritance_4001(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Acting_4002(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Association_4003(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<CiatLinkDescriptor> getIndividualTask_3006IncomingLinks(View view) {
		IndividualTask modelElement = (IndividualTask) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<CiatLinkDescriptor> result = new LinkedList<CiatLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Aggregation_4007(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Enabling_4008(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Disabling_4009(modelElement, crossReferences));
		result.addAll(
				getIncomingTypeModelFacetLinks_EnablingWithInformationPassing_4010(modelElement, crossReferences));
		result.addAll(
				getIncomingTypeModelFacetLinks_DisablingWithInformationPassing_4011(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_IndependentConcurrency_4012(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_OrderIndependence_4013(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_SuspendResume_4014(modelElement, crossReferences));
		result.addAll(
				getIncomingTypeModelFacetLinks_ConcurrencyWithInformationPassing_4015(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_DeterministicChoice_4016(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_UndeterministicChoice_4017(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<CiatLinkDescriptor> getRol_3007IncomingLinks(View view) {
		Rol modelElement = (Rol) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<CiatLinkDescriptor> result = new LinkedList<CiatLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Inheritance_4001(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Acting_4002(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Association_4003(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<CiatLinkDescriptor> getActor_3008IncomingLinks(View view) {
		Actor modelElement = (Actor) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<CiatLinkDescriptor> result = new LinkedList<CiatLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Inheritance_4001(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Acting_4002(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Association_4003(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<CiatLinkDescriptor> getSoftwareAgent_3009IncomingLinks(View view) {
		SoftwareAgent modelElement = (SoftwareAgent) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<CiatLinkDescriptor> result = new LinkedList<CiatLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Inheritance_4001(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Acting_4002(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Association_4003(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<CiatLinkDescriptor> getTeam_3010IncomingLinks(View view) {
		Team modelElement = (Team) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<CiatLinkDescriptor> result = new LinkedList<CiatLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Inheritance_4001(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Acting_4002(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Association_4003(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<CiatLinkDescriptor> getGroup_3011IncomingLinks(View view) {
		Group modelElement = (Group) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<CiatLinkDescriptor> result = new LinkedList<CiatLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Inheritance_4001(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Acting_4002(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Association_4003(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<CiatLinkDescriptor> getTool_3012IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CiatLinkDescriptor> getObject_3013IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CiatLinkDescriptor> getCooperativeTask_3014IncomingLinks(View view) {
		CooperativeTask modelElement = (CooperativeTask) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<CiatLinkDescriptor> result = new LinkedList<CiatLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Aggregation_4007(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Enabling_4008(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Disabling_4009(modelElement, crossReferences));
		result.addAll(
				getIncomingTypeModelFacetLinks_EnablingWithInformationPassing_4010(modelElement, crossReferences));
		result.addAll(
				getIncomingTypeModelFacetLinks_DisablingWithInformationPassing_4011(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_IndependentConcurrency_4012(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_OrderIndependence_4013(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_SuspendResume_4014(modelElement, crossReferences));
		result.addAll(
				getIncomingTypeModelFacetLinks_ConcurrencyWithInformationPassing_4015(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_DeterministicChoice_4016(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_UndeterministicChoice_4017(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<CiatLinkDescriptor> getRol_3015IncomingLinks(View view) {
		Rol modelElement = (Rol) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<CiatLinkDescriptor> result = new LinkedList<CiatLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Inheritance_4001(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Acting_4002(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Association_4003(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<CiatLinkDescriptor> getActor_3016IncomingLinks(View view) {
		Actor modelElement = (Actor) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<CiatLinkDescriptor> result = new LinkedList<CiatLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Inheritance_4001(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Acting_4002(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Association_4003(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<CiatLinkDescriptor> getSoftwareAgent_3017IncomingLinks(View view) {
		SoftwareAgent modelElement = (SoftwareAgent) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<CiatLinkDescriptor> result = new LinkedList<CiatLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Inheritance_4001(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Acting_4002(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Association_4003(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<CiatLinkDescriptor> getTeam_3018IncomingLinks(View view) {
		Team modelElement = (Team) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<CiatLinkDescriptor> result = new LinkedList<CiatLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Inheritance_4001(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Acting_4002(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Association_4003(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<CiatLinkDescriptor> getGroup_3019IncomingLinks(View view) {
		Group modelElement = (Group) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<CiatLinkDescriptor> result = new LinkedList<CiatLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Inheritance_4001(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Acting_4002(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Association_4003(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<CiatLinkDescriptor> getObject_3020IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CiatLinkDescriptor> getCollaborativeTask_3021IncomingLinks(View view) {
		CollaborativeTask modelElement = (CollaborativeTask) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<CiatLinkDescriptor> result = new LinkedList<CiatLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Aggregation_4007(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Enabling_4008(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Disabling_4009(modelElement, crossReferences));
		result.addAll(
				getIncomingTypeModelFacetLinks_EnablingWithInformationPassing_4010(modelElement, crossReferences));
		result.addAll(
				getIncomingTypeModelFacetLinks_DisablingWithInformationPassing_4011(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_IndependentConcurrency_4012(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_OrderIndependence_4013(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_SuspendResume_4014(modelElement, crossReferences));
		result.addAll(
				getIncomingTypeModelFacetLinks_ConcurrencyWithInformationPassing_4015(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_DeterministicChoice_4016(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_UndeterministicChoice_4017(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<CiatLinkDescriptor> getRol_3022IncomingLinks(View view) {
		Rol modelElement = (Rol) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<CiatLinkDescriptor> result = new LinkedList<CiatLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Inheritance_4001(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Acting_4002(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Association_4003(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<CiatLinkDescriptor> getActor_3023IncomingLinks(View view) {
		Actor modelElement = (Actor) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<CiatLinkDescriptor> result = new LinkedList<CiatLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Inheritance_4001(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Acting_4002(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Association_4003(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<CiatLinkDescriptor> getSoftwareAgent_3024IncomingLinks(View view) {
		SoftwareAgent modelElement = (SoftwareAgent) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<CiatLinkDescriptor> result = new LinkedList<CiatLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Inheritance_4001(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Acting_4002(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Association_4003(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<CiatLinkDescriptor> getTeam_3025IncomingLinks(View view) {
		Team modelElement = (Team) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<CiatLinkDescriptor> result = new LinkedList<CiatLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Inheritance_4001(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Acting_4002(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Association_4003(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<CiatLinkDescriptor> getGroup_3026IncomingLinks(View view) {
		Group modelElement = (Group) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<CiatLinkDescriptor> result = new LinkedList<CiatLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Inheritance_4001(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Acting_4002(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Association_4003(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<CiatLinkDescriptor> getObject_3027IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CiatLinkDescriptor> getAbstractTask_3028IncomingLinks(View view) {
		AbstractTask modelElement = (AbstractTask) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<CiatLinkDescriptor> result = new LinkedList<CiatLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Aggregation_4007(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Enabling_4008(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Disabling_4009(modelElement, crossReferences));
		result.addAll(
				getIncomingTypeModelFacetLinks_EnablingWithInformationPassing_4010(modelElement, crossReferences));
		result.addAll(
				getIncomingTypeModelFacetLinks_DisablingWithInformationPassing_4011(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_IndependentConcurrency_4012(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_OrderIndependence_4013(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_SuspendResume_4014(modelElement, crossReferences));
		result.addAll(
				getIncomingTypeModelFacetLinks_ConcurrencyWithInformationPassing_4015(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_DeterministicChoice_4016(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_UndeterministicChoice_4017(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<CiatLinkDescriptor> getIndividualTask_3029IncomingLinks(View view) {
		IndividualTask modelElement = (IndividualTask) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<CiatLinkDescriptor> result = new LinkedList<CiatLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Aggregation_4007(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Enabling_4008(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Disabling_4009(modelElement, crossReferences));
		result.addAll(
				getIncomingTypeModelFacetLinks_EnablingWithInformationPassing_4010(modelElement, crossReferences));
		result.addAll(
				getIncomingTypeModelFacetLinks_DisablingWithInformationPassing_4011(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_IndependentConcurrency_4012(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_OrderIndependence_4013(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_SuspendResume_4014(modelElement, crossReferences));
		result.addAll(
				getIncomingTypeModelFacetLinks_ConcurrencyWithInformationPassing_4015(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_DeterministicChoice_4016(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_UndeterministicChoice_4017(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<CiatLinkDescriptor> getCooperativeTask_3030IncomingLinks(View view) {
		CooperativeTask modelElement = (CooperativeTask) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<CiatLinkDescriptor> result = new LinkedList<CiatLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Aggregation_4007(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Enabling_4008(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Disabling_4009(modelElement, crossReferences));
		result.addAll(
				getIncomingTypeModelFacetLinks_EnablingWithInformationPassing_4010(modelElement, crossReferences));
		result.addAll(
				getIncomingTypeModelFacetLinks_DisablingWithInformationPassing_4011(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_IndependentConcurrency_4012(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_OrderIndependence_4013(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_SuspendResume_4014(modelElement, crossReferences));
		result.addAll(
				getIncomingTypeModelFacetLinks_ConcurrencyWithInformationPassing_4015(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_DeterministicChoice_4016(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_UndeterministicChoice_4017(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<CiatLinkDescriptor> getCollaborativeTask_3031IncomingLinks(View view) {
		CollaborativeTask modelElement = (CollaborativeTask) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<CiatLinkDescriptor> result = new LinkedList<CiatLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Aggregation_4007(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Enabling_4008(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Disabling_4009(modelElement, crossReferences));
		result.addAll(
				getIncomingTypeModelFacetLinks_EnablingWithInformationPassing_4010(modelElement, crossReferences));
		result.addAll(
				getIncomingTypeModelFacetLinks_DisablingWithInformationPassing_4011(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_IndependentConcurrency_4012(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_OrderIndependence_4013(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_SuspendResume_4014(modelElement, crossReferences));
		result.addAll(
				getIncomingTypeModelFacetLinks_ConcurrencyWithInformationPassing_4015(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_DeterministicChoice_4016(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_UndeterministicChoice_4017(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<CiatLinkDescriptor> getAbstractTask_3032IncomingLinks(View view) {
		AbstractTask modelElement = (AbstractTask) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<CiatLinkDescriptor> result = new LinkedList<CiatLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Aggregation_4007(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Enabling_4008(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Disabling_4009(modelElement, crossReferences));
		result.addAll(
				getIncomingTypeModelFacetLinks_EnablingWithInformationPassing_4010(modelElement, crossReferences));
		result.addAll(
				getIncomingTypeModelFacetLinks_DisablingWithInformationPassing_4011(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_IndependentConcurrency_4012(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_OrderIndependence_4013(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_SuspendResume_4014(modelElement, crossReferences));
		result.addAll(
				getIncomingTypeModelFacetLinks_ConcurrencyWithInformationPassing_4015(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_DeterministicChoice_4016(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_UndeterministicChoice_4017(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<CiatLinkDescriptor> getInit_3033IncomingLinks(View view) {
		Init modelElement = (Init) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<CiatLinkDescriptor> result = new LinkedList<CiatLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Aggregation_4007(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Enabling_4008(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Disabling_4009(modelElement, crossReferences));
		result.addAll(
				getIncomingTypeModelFacetLinks_EnablingWithInformationPassing_4010(modelElement, crossReferences));
		result.addAll(
				getIncomingTypeModelFacetLinks_DisablingWithInformationPassing_4011(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_IndependentConcurrency_4012(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_OrderIndependence_4013(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_SuspendResume_4014(modelElement, crossReferences));
		result.addAll(
				getIncomingTypeModelFacetLinks_ConcurrencyWithInformationPassing_4015(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_DeterministicChoice_4016(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_UndeterministicChoice_4017(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<CiatLinkDescriptor> getEnd_3034IncomingLinks(View view) {
		End modelElement = (End) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<CiatLinkDescriptor> result = new LinkedList<CiatLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Aggregation_4007(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Enabling_4008(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Disabling_4009(modelElement, crossReferences));
		result.addAll(
				getIncomingTypeModelFacetLinks_EnablingWithInformationPassing_4010(modelElement, crossReferences));
		result.addAll(
				getIncomingTypeModelFacetLinks_DisablingWithInformationPassing_4011(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_IndependentConcurrency_4012(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_OrderIndependence_4013(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_SuspendResume_4014(modelElement, crossReferences));
		result.addAll(
				getIncomingTypeModelFacetLinks_ConcurrencyWithInformationPassing_4015(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_DeterministicChoice_4016(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_UndeterministicChoice_4017(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<CiatLinkDescriptor> getTemporalCondition_3035IncomingLinks(View view) {
		TemporalCondition modelElement = (TemporalCondition) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<CiatLinkDescriptor> result = new LinkedList<CiatLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Aggregation_4007(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Enabling_4008(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Disabling_4009(modelElement, crossReferences));
		result.addAll(
				getIncomingTypeModelFacetLinks_EnablingWithInformationPassing_4010(modelElement, crossReferences));
		result.addAll(
				getIncomingTypeModelFacetLinks_DisablingWithInformationPassing_4011(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_IndependentConcurrency_4012(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_OrderIndependence_4013(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_SuspendResume_4014(modelElement, crossReferences));
		result.addAll(
				getIncomingTypeModelFacetLinks_ConcurrencyWithInformationPassing_4015(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_DeterministicChoice_4016(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_UndeterministicChoice_4017(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<CiatLinkDescriptor> getNotification_3036IncomingLinks(View view) {
		Notification modelElement = (Notification) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<CiatLinkDescriptor> result = new LinkedList<CiatLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Aggregation_4007(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Enabling_4008(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Disabling_4009(modelElement, crossReferences));
		result.addAll(
				getIncomingTypeModelFacetLinks_EnablingWithInformationPassing_4010(modelElement, crossReferences));
		result.addAll(
				getIncomingTypeModelFacetLinks_DisablingWithInformationPassing_4011(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_IndependentConcurrency_4012(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_OrderIndependence_4013(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_SuspendResume_4014(modelElement, crossReferences));
		result.addAll(
				getIncomingTypeModelFacetLinks_ConcurrencyWithInformationPassing_4015(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_DeterministicChoice_4016(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_UndeterministicChoice_4017(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<CiatLinkDescriptor> getCondition_3037IncomingLinks(View view) {
		Condition modelElement = (Condition) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<CiatLinkDescriptor> result = new LinkedList<CiatLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Aggregation_4007(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Enabling_4008(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Disabling_4009(modelElement, crossReferences));
		result.addAll(
				getIncomingTypeModelFacetLinks_EnablingWithInformationPassing_4010(modelElement, crossReferences));
		result.addAll(
				getIncomingTypeModelFacetLinks_DisablingWithInformationPassing_4011(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_IndependentConcurrency_4012(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_OrderIndependence_4013(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_SuspendResume_4014(modelElement, crossReferences));
		result.addAll(
				getIncomingTypeModelFacetLinks_ConcurrencyWithInformationPassing_4015(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_DeterministicChoice_4016(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_UndeterministicChoice_4017(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<CiatLinkDescriptor> getInit_3038IncomingLinks(View view) {
		Init modelElement = (Init) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<CiatLinkDescriptor> result = new LinkedList<CiatLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Aggregation_4007(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Enabling_4008(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Disabling_4009(modelElement, crossReferences));
		result.addAll(
				getIncomingTypeModelFacetLinks_EnablingWithInformationPassing_4010(modelElement, crossReferences));
		result.addAll(
				getIncomingTypeModelFacetLinks_DisablingWithInformationPassing_4011(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_IndependentConcurrency_4012(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_OrderIndependence_4013(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_SuspendResume_4014(modelElement, crossReferences));
		result.addAll(
				getIncomingTypeModelFacetLinks_ConcurrencyWithInformationPassing_4015(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_DeterministicChoice_4016(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_UndeterministicChoice_4017(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<CiatLinkDescriptor> getEnd_3039IncomingLinks(View view) {
		End modelElement = (End) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<CiatLinkDescriptor> result = new LinkedList<CiatLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Aggregation_4007(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Enabling_4008(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Disabling_4009(modelElement, crossReferences));
		result.addAll(
				getIncomingTypeModelFacetLinks_EnablingWithInformationPassing_4010(modelElement, crossReferences));
		result.addAll(
				getIncomingTypeModelFacetLinks_DisablingWithInformationPassing_4011(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_IndependentConcurrency_4012(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_OrderIndependence_4013(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_SuspendResume_4014(modelElement, crossReferences));
		result.addAll(
				getIncomingTypeModelFacetLinks_ConcurrencyWithInformationPassing_4015(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_DeterministicChoice_4016(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_UndeterministicChoice_4017(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<CiatLinkDescriptor> getTemporalCondition_3040IncomingLinks(View view) {
		TemporalCondition modelElement = (TemporalCondition) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<CiatLinkDescriptor> result = new LinkedList<CiatLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Aggregation_4007(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Enabling_4008(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Disabling_4009(modelElement, crossReferences));
		result.addAll(
				getIncomingTypeModelFacetLinks_EnablingWithInformationPassing_4010(modelElement, crossReferences));
		result.addAll(
				getIncomingTypeModelFacetLinks_DisablingWithInformationPassing_4011(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_IndependentConcurrency_4012(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_OrderIndependence_4013(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_SuspendResume_4014(modelElement, crossReferences));
		result.addAll(
				getIncomingTypeModelFacetLinks_ConcurrencyWithInformationPassing_4015(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_DeterministicChoice_4016(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_UndeterministicChoice_4017(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<CiatLinkDescriptor> getNotification_3041IncomingLinks(View view) {
		Notification modelElement = (Notification) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<CiatLinkDescriptor> result = new LinkedList<CiatLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Aggregation_4007(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Enabling_4008(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Disabling_4009(modelElement, crossReferences));
		result.addAll(
				getIncomingTypeModelFacetLinks_EnablingWithInformationPassing_4010(modelElement, crossReferences));
		result.addAll(
				getIncomingTypeModelFacetLinks_DisablingWithInformationPassing_4011(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_IndependentConcurrency_4012(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_OrderIndependence_4013(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_SuspendResume_4014(modelElement, crossReferences));
		result.addAll(
				getIncomingTypeModelFacetLinks_ConcurrencyWithInformationPassing_4015(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_DeterministicChoice_4016(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_UndeterministicChoice_4017(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<CiatLinkDescriptor> getCondition_3042IncomingLinks(View view) {
		Condition modelElement = (Condition) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<CiatLinkDescriptor> result = new LinkedList<CiatLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Aggregation_4007(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Enabling_4008(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Disabling_4009(modelElement, crossReferences));
		result.addAll(
				getIncomingTypeModelFacetLinks_EnablingWithInformationPassing_4010(modelElement, crossReferences));
		result.addAll(
				getIncomingTypeModelFacetLinks_DisablingWithInformationPassing_4011(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_IndependentConcurrency_4012(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_OrderIndependence_4013(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_SuspendResume_4014(modelElement, crossReferences));
		result.addAll(
				getIncomingTypeModelFacetLinks_ConcurrencyWithInformationPassing_4015(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_DeterministicChoice_4016(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_UndeterministicChoice_4017(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<CiatLinkDescriptor> getSharedObject_3043IncomingLinks(View view) {
		SharedObject modelElement = (SharedObject) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<CiatLinkDescriptor> result = new LinkedList<CiatLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_ShAssociationLink_4004(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_ShGeneralizationLink_4005(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_ShAggregationLink_4006(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<CiatLinkDescriptor> getExclusiveEditionArea_3044IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CiatLinkDescriptor> getCollaborativeArea_3045IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CiatLinkDescriptor> getIndividualArea_3046IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CiatLinkDescriptor> getAttribute_3047IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CiatLinkDescriptor> getOperation_3048IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CiatLinkDescriptor> getExclusiveEdition_3049IncomingLinks(View view) {
		ExclusiveEdition modelElement = (ExclusiveEdition) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<CiatLinkDescriptor> result = new LinkedList<CiatLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Aggregation_4007(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Enabling_4008(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Disabling_4009(modelElement, crossReferences));
		result.addAll(
				getIncomingTypeModelFacetLinks_EnablingWithInformationPassing_4010(modelElement, crossReferences));
		result.addAll(
				getIncomingTypeModelFacetLinks_DisablingWithInformationPassing_4011(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_IndependentConcurrency_4012(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_OrderIndependence_4013(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_SuspendResume_4014(modelElement, crossReferences));
		result.addAll(
				getIncomingTypeModelFacetLinks_ConcurrencyWithInformationPassing_4015(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_DeterministicChoice_4016(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_UndeterministicChoice_4017(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<CiatLinkDescriptor> getCollaborativeVisualization_3050IncomingLinks(View view) {
		CollaborativeVisualization modelElement = (CollaborativeVisualization) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<CiatLinkDescriptor> result = new LinkedList<CiatLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Aggregation_4007(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Enabling_4008(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Disabling_4009(modelElement, crossReferences));
		result.addAll(
				getIncomingTypeModelFacetLinks_EnablingWithInformationPassing_4010(modelElement, crossReferences));
		result.addAll(
				getIncomingTypeModelFacetLinks_DisablingWithInformationPassing_4011(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_IndependentConcurrency_4012(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_OrderIndependence_4013(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_SuspendResume_4014(modelElement, crossReferences));
		result.addAll(
				getIncomingTypeModelFacetLinks_ConcurrencyWithInformationPassing_4015(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_DeterministicChoice_4016(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_UndeterministicChoice_4017(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<CiatLinkDescriptor> getIndividualVisualization_3051IncomingLinks(View view) {
		IndividualVisualization modelElement = (IndividualVisualization) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<CiatLinkDescriptor> result = new LinkedList<CiatLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Aggregation_4007(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Enabling_4008(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Disabling_4009(modelElement, crossReferences));
		result.addAll(
				getIncomingTypeModelFacetLinks_EnablingWithInformationPassing_4010(modelElement, crossReferences));
		result.addAll(
				getIncomingTypeModelFacetLinks_DisablingWithInformationPassing_4011(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_IndependentConcurrency_4012(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_OrderIndependence_4013(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_SuspendResume_4014(modelElement, crossReferences));
		result.addAll(
				getIncomingTypeModelFacetLinks_ConcurrencyWithInformationPassing_4015(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_DeterministicChoice_4016(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_UndeterministicChoice_4017(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<CiatLinkDescriptor> getUserTask_3052IncomingLinks(View view) {
		UserTask modelElement = (UserTask) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<CiatLinkDescriptor> result = new LinkedList<CiatLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Aggregation_4007(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Enabling_4008(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Disabling_4009(modelElement, crossReferences));
		result.addAll(
				getIncomingTypeModelFacetLinks_EnablingWithInformationPassing_4010(modelElement, crossReferences));
		result.addAll(
				getIncomingTypeModelFacetLinks_DisablingWithInformationPassing_4011(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_IndependentConcurrency_4012(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_OrderIndependence_4013(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_SuspendResume_4014(modelElement, crossReferences));
		result.addAll(
				getIncomingTypeModelFacetLinks_ConcurrencyWithInformationPassing_4015(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_DeterministicChoice_4016(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_UndeterministicChoice_4017(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<CiatLinkDescriptor> getCTTAbstractTask_3053IncomingLinks(View view) {
		CTTAbstractTask modelElement = (CTTAbstractTask) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<CiatLinkDescriptor> result = new LinkedList<CiatLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Aggregation_4007(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Enabling_4008(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Disabling_4009(modelElement, crossReferences));
		result.addAll(
				getIncomingTypeModelFacetLinks_EnablingWithInformationPassing_4010(modelElement, crossReferences));
		result.addAll(
				getIncomingTypeModelFacetLinks_DisablingWithInformationPassing_4011(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_IndependentConcurrency_4012(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_OrderIndependence_4013(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_SuspendResume_4014(modelElement, crossReferences));
		result.addAll(
				getIncomingTypeModelFacetLinks_ConcurrencyWithInformationPassing_4015(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_DeterministicChoice_4016(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_UndeterministicChoice_4017(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<CiatLinkDescriptor> getInteractiveTask_3054IncomingLinks(View view) {
		InteractiveTask modelElement = (InteractiveTask) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<CiatLinkDescriptor> result = new LinkedList<CiatLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Aggregation_4007(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Enabling_4008(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Disabling_4009(modelElement, crossReferences));
		result.addAll(
				getIncomingTypeModelFacetLinks_EnablingWithInformationPassing_4010(modelElement, crossReferences));
		result.addAll(
				getIncomingTypeModelFacetLinks_DisablingWithInformationPassing_4011(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_IndependentConcurrency_4012(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_OrderIndependence_4013(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_SuspendResume_4014(modelElement, crossReferences));
		result.addAll(
				getIncomingTypeModelFacetLinks_ConcurrencyWithInformationPassing_4015(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_DeterministicChoice_4016(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_UndeterministicChoice_4017(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<CiatLinkDescriptor> getCTTCollaborativeTask_3055IncomingLinks(View view) {
		CTTCollaborativeTask modelElement = (CTTCollaborativeTask) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<CiatLinkDescriptor> result = new LinkedList<CiatLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Aggregation_4007(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Enabling_4008(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Disabling_4009(modelElement, crossReferences));
		result.addAll(
				getIncomingTypeModelFacetLinks_EnablingWithInformationPassing_4010(modelElement, crossReferences));
		result.addAll(
				getIncomingTypeModelFacetLinks_DisablingWithInformationPassing_4011(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_IndependentConcurrency_4012(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_OrderIndependence_4013(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_SuspendResume_4014(modelElement, crossReferences));
		result.addAll(
				getIncomingTypeModelFacetLinks_ConcurrencyWithInformationPassing_4015(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_DeterministicChoice_4016(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_UndeterministicChoice_4017(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<CiatLinkDescriptor> getApplicationTask_3056IncomingLinks(View view) {
		ApplicationTask modelElement = (ApplicationTask) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<CiatLinkDescriptor> result = new LinkedList<CiatLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Aggregation_4007(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Enabling_4008(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Disabling_4009(modelElement, crossReferences));
		result.addAll(
				getIncomingTypeModelFacetLinks_EnablingWithInformationPassing_4010(modelElement, crossReferences));
		result.addAll(
				getIncomingTypeModelFacetLinks_DisablingWithInformationPassing_4011(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_IndependentConcurrency_4012(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_OrderIndependence_4013(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_SuspendResume_4014(modelElement, crossReferences));
		result.addAll(
				getIncomingTypeModelFacetLinks_ConcurrencyWithInformationPassing_4015(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_DeterministicChoice_4016(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_UndeterministicChoice_4017(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<CiatLinkDescriptor> getInheritance_4001IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CiatLinkDescriptor> getActing_4002IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CiatLinkDescriptor> getAssociation_4003IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CiatLinkDescriptor> getShAssociationLink_4004IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CiatLinkDescriptor> getShGeneralizationLink_4005IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CiatLinkDescriptor> getShAggregationLink_4006IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CiatLinkDescriptor> getAggregation_4007IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CiatLinkDescriptor> getEnabling_4008IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CiatLinkDescriptor> getDisabling_4009IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CiatLinkDescriptor> getEnablingWithInformationPassing_4010IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CiatLinkDescriptor> getDisablingWithInformationPassing_4011IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CiatLinkDescriptor> getIndependentConcurrency_4012IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CiatLinkDescriptor> getOrderIndependence_4013IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CiatLinkDescriptor> getSuspendResume_4014IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CiatLinkDescriptor> getConcurrencyWithInformationPassing_4015IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CiatLinkDescriptor> getDeterministicChoice_4016IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CiatLinkDescriptor> getUndeterministicChoice_4017IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CiatLinkDescriptor> getSociogram_2001OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CiatLinkDescriptor> getProcessDiagram_2002OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CiatLinkDescriptor> getDomainDiagram_2003OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CiatLinkDescriptor> getCTTDiagram_2004OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CiatLinkDescriptor> getRol_3001OutgoingLinks(View view) {
		Rol modelElement = (Rol) view.getElement();
		LinkedList<CiatLinkDescriptor> result = new LinkedList<CiatLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Inheritance_4001(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Acting_4002(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Association_4003(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<CiatLinkDescriptor> getActor_3002OutgoingLinks(View view) {
		Actor modelElement = (Actor) view.getElement();
		LinkedList<CiatLinkDescriptor> result = new LinkedList<CiatLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Inheritance_4001(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Acting_4002(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Association_4003(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<CiatLinkDescriptor> getSoftwareAgent_3003OutgoingLinks(View view) {
		SoftwareAgent modelElement = (SoftwareAgent) view.getElement();
		LinkedList<CiatLinkDescriptor> result = new LinkedList<CiatLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Inheritance_4001(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Acting_4002(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Association_4003(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<CiatLinkDescriptor> getTeam_3004OutgoingLinks(View view) {
		Team modelElement = (Team) view.getElement();
		LinkedList<CiatLinkDescriptor> result = new LinkedList<CiatLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Inheritance_4001(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Acting_4002(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Association_4003(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<CiatLinkDescriptor> getGroup_3005OutgoingLinks(View view) {
		Group modelElement = (Group) view.getElement();
		LinkedList<CiatLinkDescriptor> result = new LinkedList<CiatLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Inheritance_4001(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Acting_4002(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Association_4003(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<CiatLinkDescriptor> getIndividualTask_3006OutgoingLinks(View view) {
		IndividualTask modelElement = (IndividualTask) view.getElement();
		LinkedList<CiatLinkDescriptor> result = new LinkedList<CiatLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Aggregation_4007(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Enabling_4008(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Disabling_4009(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_EnablingWithInformationPassing_4010(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_DisablingWithInformationPassing_4011(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_IndependentConcurrency_4012(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_OrderIndependence_4013(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_SuspendResume_4014(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_ConcurrencyWithInformationPassing_4015(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_DeterministicChoice_4016(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_UndeterministicChoice_4017(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<CiatLinkDescriptor> getRol_3007OutgoingLinks(View view) {
		Rol modelElement = (Rol) view.getElement();
		LinkedList<CiatLinkDescriptor> result = new LinkedList<CiatLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Inheritance_4001(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Acting_4002(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Association_4003(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<CiatLinkDescriptor> getActor_3008OutgoingLinks(View view) {
		Actor modelElement = (Actor) view.getElement();
		LinkedList<CiatLinkDescriptor> result = new LinkedList<CiatLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Inheritance_4001(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Acting_4002(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Association_4003(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<CiatLinkDescriptor> getSoftwareAgent_3009OutgoingLinks(View view) {
		SoftwareAgent modelElement = (SoftwareAgent) view.getElement();
		LinkedList<CiatLinkDescriptor> result = new LinkedList<CiatLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Inheritance_4001(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Acting_4002(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Association_4003(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<CiatLinkDescriptor> getTeam_3010OutgoingLinks(View view) {
		Team modelElement = (Team) view.getElement();
		LinkedList<CiatLinkDescriptor> result = new LinkedList<CiatLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Inheritance_4001(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Acting_4002(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Association_4003(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<CiatLinkDescriptor> getGroup_3011OutgoingLinks(View view) {
		Group modelElement = (Group) view.getElement();
		LinkedList<CiatLinkDescriptor> result = new LinkedList<CiatLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Inheritance_4001(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Acting_4002(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Association_4003(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<CiatLinkDescriptor> getTool_3012OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CiatLinkDescriptor> getObject_3013OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CiatLinkDescriptor> getCooperativeTask_3014OutgoingLinks(View view) {
		CooperativeTask modelElement = (CooperativeTask) view.getElement();
		LinkedList<CiatLinkDescriptor> result = new LinkedList<CiatLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Aggregation_4007(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Enabling_4008(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Disabling_4009(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_EnablingWithInformationPassing_4010(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_DisablingWithInformationPassing_4011(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_IndependentConcurrency_4012(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_OrderIndependence_4013(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_SuspendResume_4014(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_ConcurrencyWithInformationPassing_4015(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_DeterministicChoice_4016(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_UndeterministicChoice_4017(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<CiatLinkDescriptor> getRol_3015OutgoingLinks(View view) {
		Rol modelElement = (Rol) view.getElement();
		LinkedList<CiatLinkDescriptor> result = new LinkedList<CiatLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Inheritance_4001(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Acting_4002(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Association_4003(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<CiatLinkDescriptor> getActor_3016OutgoingLinks(View view) {
		Actor modelElement = (Actor) view.getElement();
		LinkedList<CiatLinkDescriptor> result = new LinkedList<CiatLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Inheritance_4001(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Acting_4002(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Association_4003(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<CiatLinkDescriptor> getSoftwareAgent_3017OutgoingLinks(View view) {
		SoftwareAgent modelElement = (SoftwareAgent) view.getElement();
		LinkedList<CiatLinkDescriptor> result = new LinkedList<CiatLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Inheritance_4001(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Acting_4002(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Association_4003(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<CiatLinkDescriptor> getTeam_3018OutgoingLinks(View view) {
		Team modelElement = (Team) view.getElement();
		LinkedList<CiatLinkDescriptor> result = new LinkedList<CiatLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Inheritance_4001(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Acting_4002(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Association_4003(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<CiatLinkDescriptor> getGroup_3019OutgoingLinks(View view) {
		Group modelElement = (Group) view.getElement();
		LinkedList<CiatLinkDescriptor> result = new LinkedList<CiatLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Inheritance_4001(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Acting_4002(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Association_4003(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<CiatLinkDescriptor> getObject_3020OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CiatLinkDescriptor> getCollaborativeTask_3021OutgoingLinks(View view) {
		CollaborativeTask modelElement = (CollaborativeTask) view.getElement();
		LinkedList<CiatLinkDescriptor> result = new LinkedList<CiatLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Aggregation_4007(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Enabling_4008(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Disabling_4009(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_EnablingWithInformationPassing_4010(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_DisablingWithInformationPassing_4011(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_IndependentConcurrency_4012(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_OrderIndependence_4013(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_SuspendResume_4014(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_ConcurrencyWithInformationPassing_4015(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_DeterministicChoice_4016(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_UndeterministicChoice_4017(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<CiatLinkDescriptor> getRol_3022OutgoingLinks(View view) {
		Rol modelElement = (Rol) view.getElement();
		LinkedList<CiatLinkDescriptor> result = new LinkedList<CiatLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Inheritance_4001(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Acting_4002(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Association_4003(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<CiatLinkDescriptor> getActor_3023OutgoingLinks(View view) {
		Actor modelElement = (Actor) view.getElement();
		LinkedList<CiatLinkDescriptor> result = new LinkedList<CiatLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Inheritance_4001(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Acting_4002(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Association_4003(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<CiatLinkDescriptor> getSoftwareAgent_3024OutgoingLinks(View view) {
		SoftwareAgent modelElement = (SoftwareAgent) view.getElement();
		LinkedList<CiatLinkDescriptor> result = new LinkedList<CiatLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Inheritance_4001(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Acting_4002(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Association_4003(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<CiatLinkDescriptor> getTeam_3025OutgoingLinks(View view) {
		Team modelElement = (Team) view.getElement();
		LinkedList<CiatLinkDescriptor> result = new LinkedList<CiatLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Inheritance_4001(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Acting_4002(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Association_4003(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<CiatLinkDescriptor> getGroup_3026OutgoingLinks(View view) {
		Group modelElement = (Group) view.getElement();
		LinkedList<CiatLinkDescriptor> result = new LinkedList<CiatLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Inheritance_4001(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Acting_4002(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Association_4003(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<CiatLinkDescriptor> getObject_3027OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CiatLinkDescriptor> getAbstractTask_3028OutgoingLinks(View view) {
		AbstractTask modelElement = (AbstractTask) view.getElement();
		LinkedList<CiatLinkDescriptor> result = new LinkedList<CiatLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Aggregation_4007(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Enabling_4008(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Disabling_4009(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_EnablingWithInformationPassing_4010(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_DisablingWithInformationPassing_4011(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_IndependentConcurrency_4012(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_OrderIndependence_4013(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_SuspendResume_4014(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_ConcurrencyWithInformationPassing_4015(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_DeterministicChoice_4016(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_UndeterministicChoice_4017(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<CiatLinkDescriptor> getIndividualTask_3029OutgoingLinks(View view) {
		IndividualTask modelElement = (IndividualTask) view.getElement();
		LinkedList<CiatLinkDescriptor> result = new LinkedList<CiatLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Aggregation_4007(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Enabling_4008(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Disabling_4009(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_EnablingWithInformationPassing_4010(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_DisablingWithInformationPassing_4011(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_IndependentConcurrency_4012(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_OrderIndependence_4013(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_SuspendResume_4014(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_ConcurrencyWithInformationPassing_4015(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_DeterministicChoice_4016(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_UndeterministicChoice_4017(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<CiatLinkDescriptor> getCooperativeTask_3030OutgoingLinks(View view) {
		CooperativeTask modelElement = (CooperativeTask) view.getElement();
		LinkedList<CiatLinkDescriptor> result = new LinkedList<CiatLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Aggregation_4007(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Enabling_4008(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Disabling_4009(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_EnablingWithInformationPassing_4010(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_DisablingWithInformationPassing_4011(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_IndependentConcurrency_4012(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_OrderIndependence_4013(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_SuspendResume_4014(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_ConcurrencyWithInformationPassing_4015(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_DeterministicChoice_4016(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_UndeterministicChoice_4017(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<CiatLinkDescriptor> getCollaborativeTask_3031OutgoingLinks(View view) {
		CollaborativeTask modelElement = (CollaborativeTask) view.getElement();
		LinkedList<CiatLinkDescriptor> result = new LinkedList<CiatLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Aggregation_4007(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Enabling_4008(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Disabling_4009(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_EnablingWithInformationPassing_4010(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_DisablingWithInformationPassing_4011(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_IndependentConcurrency_4012(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_OrderIndependence_4013(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_SuspendResume_4014(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_ConcurrencyWithInformationPassing_4015(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_DeterministicChoice_4016(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_UndeterministicChoice_4017(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<CiatLinkDescriptor> getAbstractTask_3032OutgoingLinks(View view) {
		AbstractTask modelElement = (AbstractTask) view.getElement();
		LinkedList<CiatLinkDescriptor> result = new LinkedList<CiatLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Aggregation_4007(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Enabling_4008(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Disabling_4009(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_EnablingWithInformationPassing_4010(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_DisablingWithInformationPassing_4011(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_IndependentConcurrency_4012(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_OrderIndependence_4013(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_SuspendResume_4014(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_ConcurrencyWithInformationPassing_4015(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_DeterministicChoice_4016(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_UndeterministicChoice_4017(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<CiatLinkDescriptor> getInit_3033OutgoingLinks(View view) {
		Init modelElement = (Init) view.getElement();
		LinkedList<CiatLinkDescriptor> result = new LinkedList<CiatLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Aggregation_4007(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Enabling_4008(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Disabling_4009(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_EnablingWithInformationPassing_4010(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_DisablingWithInformationPassing_4011(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_IndependentConcurrency_4012(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_OrderIndependence_4013(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_SuspendResume_4014(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_ConcurrencyWithInformationPassing_4015(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_DeterministicChoice_4016(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_UndeterministicChoice_4017(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<CiatLinkDescriptor> getEnd_3034OutgoingLinks(View view) {
		End modelElement = (End) view.getElement();
		LinkedList<CiatLinkDescriptor> result = new LinkedList<CiatLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Aggregation_4007(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Enabling_4008(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Disabling_4009(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_EnablingWithInformationPassing_4010(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_DisablingWithInformationPassing_4011(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_IndependentConcurrency_4012(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_OrderIndependence_4013(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_SuspendResume_4014(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_ConcurrencyWithInformationPassing_4015(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_DeterministicChoice_4016(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_UndeterministicChoice_4017(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<CiatLinkDescriptor> getTemporalCondition_3035OutgoingLinks(View view) {
		TemporalCondition modelElement = (TemporalCondition) view.getElement();
		LinkedList<CiatLinkDescriptor> result = new LinkedList<CiatLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Aggregation_4007(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Enabling_4008(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Disabling_4009(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_EnablingWithInformationPassing_4010(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_DisablingWithInformationPassing_4011(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_IndependentConcurrency_4012(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_OrderIndependence_4013(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_SuspendResume_4014(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_ConcurrencyWithInformationPassing_4015(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_DeterministicChoice_4016(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_UndeterministicChoice_4017(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<CiatLinkDescriptor> getNotification_3036OutgoingLinks(View view) {
		Notification modelElement = (Notification) view.getElement();
		LinkedList<CiatLinkDescriptor> result = new LinkedList<CiatLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Aggregation_4007(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Enabling_4008(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Disabling_4009(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_EnablingWithInformationPassing_4010(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_DisablingWithInformationPassing_4011(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_IndependentConcurrency_4012(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_OrderIndependence_4013(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_SuspendResume_4014(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_ConcurrencyWithInformationPassing_4015(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_DeterministicChoice_4016(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_UndeterministicChoice_4017(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<CiatLinkDescriptor> getCondition_3037OutgoingLinks(View view) {
		Condition modelElement = (Condition) view.getElement();
		LinkedList<CiatLinkDescriptor> result = new LinkedList<CiatLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Aggregation_4007(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Enabling_4008(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Disabling_4009(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_EnablingWithInformationPassing_4010(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_DisablingWithInformationPassing_4011(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_IndependentConcurrency_4012(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_OrderIndependence_4013(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_SuspendResume_4014(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_ConcurrencyWithInformationPassing_4015(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_DeterministicChoice_4016(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_UndeterministicChoice_4017(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<CiatLinkDescriptor> getInit_3038OutgoingLinks(View view) {
		Init modelElement = (Init) view.getElement();
		LinkedList<CiatLinkDescriptor> result = new LinkedList<CiatLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Aggregation_4007(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Enabling_4008(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Disabling_4009(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_EnablingWithInformationPassing_4010(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_DisablingWithInformationPassing_4011(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_IndependentConcurrency_4012(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_OrderIndependence_4013(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_SuspendResume_4014(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_ConcurrencyWithInformationPassing_4015(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_DeterministicChoice_4016(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_UndeterministicChoice_4017(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<CiatLinkDescriptor> getEnd_3039OutgoingLinks(View view) {
		End modelElement = (End) view.getElement();
		LinkedList<CiatLinkDescriptor> result = new LinkedList<CiatLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Aggregation_4007(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Enabling_4008(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Disabling_4009(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_EnablingWithInformationPassing_4010(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_DisablingWithInformationPassing_4011(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_IndependentConcurrency_4012(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_OrderIndependence_4013(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_SuspendResume_4014(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_ConcurrencyWithInformationPassing_4015(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_DeterministicChoice_4016(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_UndeterministicChoice_4017(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<CiatLinkDescriptor> getTemporalCondition_3040OutgoingLinks(View view) {
		TemporalCondition modelElement = (TemporalCondition) view.getElement();
		LinkedList<CiatLinkDescriptor> result = new LinkedList<CiatLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Aggregation_4007(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Enabling_4008(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Disabling_4009(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_EnablingWithInformationPassing_4010(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_DisablingWithInformationPassing_4011(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_IndependentConcurrency_4012(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_OrderIndependence_4013(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_SuspendResume_4014(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_ConcurrencyWithInformationPassing_4015(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_DeterministicChoice_4016(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_UndeterministicChoice_4017(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<CiatLinkDescriptor> getNotification_3041OutgoingLinks(View view) {
		Notification modelElement = (Notification) view.getElement();
		LinkedList<CiatLinkDescriptor> result = new LinkedList<CiatLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Aggregation_4007(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Enabling_4008(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Disabling_4009(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_EnablingWithInformationPassing_4010(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_DisablingWithInformationPassing_4011(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_IndependentConcurrency_4012(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_OrderIndependence_4013(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_SuspendResume_4014(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_ConcurrencyWithInformationPassing_4015(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_DeterministicChoice_4016(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_UndeterministicChoice_4017(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<CiatLinkDescriptor> getCondition_3042OutgoingLinks(View view) {
		Condition modelElement = (Condition) view.getElement();
		LinkedList<CiatLinkDescriptor> result = new LinkedList<CiatLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Aggregation_4007(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Enabling_4008(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Disabling_4009(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_EnablingWithInformationPassing_4010(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_DisablingWithInformationPassing_4011(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_IndependentConcurrency_4012(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_OrderIndependence_4013(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_SuspendResume_4014(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_ConcurrencyWithInformationPassing_4015(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_DeterministicChoice_4016(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_UndeterministicChoice_4017(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<CiatLinkDescriptor> getSharedObject_3043OutgoingLinks(View view) {
		SharedObject modelElement = (SharedObject) view.getElement();
		LinkedList<CiatLinkDescriptor> result = new LinkedList<CiatLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_ShAssociationLink_4004(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_ShGeneralizationLink_4005(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_ShAggregationLink_4006(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<CiatLinkDescriptor> getExclusiveEditionArea_3044OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CiatLinkDescriptor> getCollaborativeArea_3045OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CiatLinkDescriptor> getIndividualArea_3046OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CiatLinkDescriptor> getAttribute_3047OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CiatLinkDescriptor> getOperation_3048OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CiatLinkDescriptor> getExclusiveEdition_3049OutgoingLinks(View view) {
		ExclusiveEdition modelElement = (ExclusiveEdition) view.getElement();
		LinkedList<CiatLinkDescriptor> result = new LinkedList<CiatLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Aggregation_4007(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Enabling_4008(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Disabling_4009(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_EnablingWithInformationPassing_4010(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_DisablingWithInformationPassing_4011(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_IndependentConcurrency_4012(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_OrderIndependence_4013(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_SuspendResume_4014(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_ConcurrencyWithInformationPassing_4015(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_DeterministicChoice_4016(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_UndeterministicChoice_4017(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<CiatLinkDescriptor> getCollaborativeVisualization_3050OutgoingLinks(View view) {
		CollaborativeVisualization modelElement = (CollaborativeVisualization) view.getElement();
		LinkedList<CiatLinkDescriptor> result = new LinkedList<CiatLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Aggregation_4007(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Enabling_4008(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Disabling_4009(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_EnablingWithInformationPassing_4010(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_DisablingWithInformationPassing_4011(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_IndependentConcurrency_4012(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_OrderIndependence_4013(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_SuspendResume_4014(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_ConcurrencyWithInformationPassing_4015(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_DeterministicChoice_4016(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_UndeterministicChoice_4017(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<CiatLinkDescriptor> getIndividualVisualization_3051OutgoingLinks(View view) {
		IndividualVisualization modelElement = (IndividualVisualization) view.getElement();
		LinkedList<CiatLinkDescriptor> result = new LinkedList<CiatLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Aggregation_4007(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Enabling_4008(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Disabling_4009(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_EnablingWithInformationPassing_4010(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_DisablingWithInformationPassing_4011(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_IndependentConcurrency_4012(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_OrderIndependence_4013(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_SuspendResume_4014(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_ConcurrencyWithInformationPassing_4015(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_DeterministicChoice_4016(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_UndeterministicChoice_4017(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<CiatLinkDescriptor> getUserTask_3052OutgoingLinks(View view) {
		UserTask modelElement = (UserTask) view.getElement();
		LinkedList<CiatLinkDescriptor> result = new LinkedList<CiatLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Aggregation_4007(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Enabling_4008(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Disabling_4009(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_EnablingWithInformationPassing_4010(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_DisablingWithInformationPassing_4011(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_IndependentConcurrency_4012(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_OrderIndependence_4013(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_SuspendResume_4014(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_ConcurrencyWithInformationPassing_4015(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_DeterministicChoice_4016(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_UndeterministicChoice_4017(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<CiatLinkDescriptor> getCTTAbstractTask_3053OutgoingLinks(View view) {
		CTTAbstractTask modelElement = (CTTAbstractTask) view.getElement();
		LinkedList<CiatLinkDescriptor> result = new LinkedList<CiatLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Aggregation_4007(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Enabling_4008(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Disabling_4009(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_EnablingWithInformationPassing_4010(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_DisablingWithInformationPassing_4011(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_IndependentConcurrency_4012(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_OrderIndependence_4013(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_SuspendResume_4014(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_ConcurrencyWithInformationPassing_4015(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_DeterministicChoice_4016(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_UndeterministicChoice_4017(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<CiatLinkDescriptor> getInteractiveTask_3054OutgoingLinks(View view) {
		InteractiveTask modelElement = (InteractiveTask) view.getElement();
		LinkedList<CiatLinkDescriptor> result = new LinkedList<CiatLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Aggregation_4007(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Enabling_4008(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Disabling_4009(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_EnablingWithInformationPassing_4010(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_DisablingWithInformationPassing_4011(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_IndependentConcurrency_4012(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_OrderIndependence_4013(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_SuspendResume_4014(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_ConcurrencyWithInformationPassing_4015(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_DeterministicChoice_4016(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_UndeterministicChoice_4017(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<CiatLinkDescriptor> getCTTCollaborativeTask_3055OutgoingLinks(View view) {
		CTTCollaborativeTask modelElement = (CTTCollaborativeTask) view.getElement();
		LinkedList<CiatLinkDescriptor> result = new LinkedList<CiatLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Aggregation_4007(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Enabling_4008(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Disabling_4009(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_EnablingWithInformationPassing_4010(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_DisablingWithInformationPassing_4011(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_IndependentConcurrency_4012(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_OrderIndependence_4013(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_SuspendResume_4014(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_ConcurrencyWithInformationPassing_4015(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_DeterministicChoice_4016(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_UndeterministicChoice_4017(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<CiatLinkDescriptor> getApplicationTask_3056OutgoingLinks(View view) {
		ApplicationTask modelElement = (ApplicationTask) view.getElement();
		LinkedList<CiatLinkDescriptor> result = new LinkedList<CiatLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Aggregation_4007(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Enabling_4008(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Disabling_4009(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_EnablingWithInformationPassing_4010(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_DisablingWithInformationPassing_4011(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_IndependentConcurrency_4012(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_OrderIndependence_4013(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_SuspendResume_4014(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_ConcurrencyWithInformationPassing_4015(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_DeterministicChoice_4016(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_UndeterministicChoice_4017(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<CiatLinkDescriptor> getInheritance_4001OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CiatLinkDescriptor> getActing_4002OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CiatLinkDescriptor> getAssociation_4003OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CiatLinkDescriptor> getShAssociationLink_4004OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CiatLinkDescriptor> getShGeneralizationLink_4005OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CiatLinkDescriptor> getShAggregationLink_4006OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CiatLinkDescriptor> getAggregation_4007OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CiatLinkDescriptor> getEnabling_4008OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CiatLinkDescriptor> getDisabling_4009OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CiatLinkDescriptor> getEnablingWithInformationPassing_4010OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CiatLinkDescriptor> getDisablingWithInformationPassing_4011OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CiatLinkDescriptor> getIndependentConcurrency_4012OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CiatLinkDescriptor> getOrderIndependence_4013OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CiatLinkDescriptor> getSuspendResume_4014OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CiatLinkDescriptor> getConcurrencyWithInformationPassing_4015OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CiatLinkDescriptor> getDeterministicChoice_4016OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CiatLinkDescriptor> getUndeterministicChoice_4017OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	private static Collection<CiatLinkDescriptor> getContainedTypeModelFacetLinks_Inheritance_4001(
			CIATDiagram container) {
		LinkedList<CiatLinkDescriptor> result = new LinkedList<CiatLinkDescriptor>();
		for (Iterator<?> links = container.getItsLinks().iterator(); links.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof Inheritance) {
				continue;
			}
			Inheritance link = (Inheritance) linkObject;
			if (InheritanceEditPart.VISUAL_ID != CiatVisualIDRegistry.getLinkWithClassVisualID(link)) {
				continue;
			}
			SociogramNode dst = link.getTarget();
			SociogramNode src = link.getSource();
			result.add(new CiatLinkDescriptor(src, dst, link, CiatElementTypes.Inheritance_4001,
					InheritanceEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<CiatLinkDescriptor> getContainedTypeModelFacetLinks_Acting_4002(CIATDiagram container) {
		LinkedList<CiatLinkDescriptor> result = new LinkedList<CiatLinkDescriptor>();
		for (Iterator<?> links = container.getItsLinks().iterator(); links.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof Acting) {
				continue;
			}
			Acting link = (Acting) linkObject;
			if (ActingEditPart.VISUAL_ID != CiatVisualIDRegistry.getLinkWithClassVisualID(link)) {
				continue;
			}
			SociogramNode dst = link.getTarget();
			SociogramNode src = link.getSource();
			result.add(new CiatLinkDescriptor(src, dst, link, CiatElementTypes.Acting_4002, ActingEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<CiatLinkDescriptor> getContainedTypeModelFacetLinks_Association_4003(
			CIATDiagram container) {
		LinkedList<CiatLinkDescriptor> result = new LinkedList<CiatLinkDescriptor>();
		for (Iterator<?> links = container.getItsLinks().iterator(); links.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof Association) {
				continue;
			}
			Association link = (Association) linkObject;
			if (AssociationEditPart.VISUAL_ID != CiatVisualIDRegistry.getLinkWithClassVisualID(link)) {
				continue;
			}
			SociogramNode dst = link.getTarget();
			SociogramNode src = link.getSource();
			result.add(new CiatLinkDescriptor(src, dst, link, CiatElementTypes.Association_4003,
					AssociationEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<CiatLinkDescriptor> getContainedTypeModelFacetLinks_ShAssociationLink_4004(
			CIATDiagram container) {
		LinkedList<CiatLinkDescriptor> result = new LinkedList<CiatLinkDescriptor>();
		for (Iterator<?> links = container.getItsLinks().iterator(); links.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof ShAssociationLink) {
				continue;
			}
			ShAssociationLink link = (ShAssociationLink) linkObject;
			if (ShAssociationLinkEditPart.VISUAL_ID != CiatVisualIDRegistry.getLinkWithClassVisualID(link)) {
				continue;
			}
			SharedObject dst = link.getTarget();
			SharedObject src = link.getSource();
			result.add(new CiatLinkDescriptor(src, dst, link, CiatElementTypes.ShAssociationLink_4004,
					ShAssociationLinkEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<CiatLinkDescriptor> getContainedTypeModelFacetLinks_ShGeneralizationLink_4005(
			CIATDiagram container) {
		LinkedList<CiatLinkDescriptor> result = new LinkedList<CiatLinkDescriptor>();
		for (Iterator<?> links = container.getItsLinks().iterator(); links.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof ShGeneralizationLink) {
				continue;
			}
			ShGeneralizationLink link = (ShGeneralizationLink) linkObject;
			if (ShGeneralizationLinkEditPart.VISUAL_ID != CiatVisualIDRegistry.getLinkWithClassVisualID(link)) {
				continue;
			}
			SharedObject dst = link.getTarget();
			SharedObject src = link.getSource();
			result.add(new CiatLinkDescriptor(src, dst, link, CiatElementTypes.ShGeneralizationLink_4005,
					ShGeneralizationLinkEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<CiatLinkDescriptor> getContainedTypeModelFacetLinks_ShAggregationLink_4006(
			CIATDiagram container) {
		LinkedList<CiatLinkDescriptor> result = new LinkedList<CiatLinkDescriptor>();
		for (Iterator<?> links = container.getItsLinks().iterator(); links.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof ShAggregationLink) {
				continue;
			}
			ShAggregationLink link = (ShAggregationLink) linkObject;
			if (ShAggregationLinkEditPart.VISUAL_ID != CiatVisualIDRegistry.getLinkWithClassVisualID(link)) {
				continue;
			}
			SharedObject dst = link.getTarget();
			SharedObject src = link.getSource();
			result.add(new CiatLinkDescriptor(src, dst, link, CiatElementTypes.ShAggregationLink_4006,
					ShAggregationLinkEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<CiatLinkDescriptor> getContainedTypeModelFacetLinks_Aggregation_4007(
			CIATDiagram container) {
		LinkedList<CiatLinkDescriptor> result = new LinkedList<CiatLinkDescriptor>();
		for (Iterator<?> links = container.getItsLinks().iterator(); links.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof Aggregation) {
				continue;
			}
			Aggregation link = (Aggregation) linkObject;
			if (AggregationEditPart.VISUAL_ID != CiatVisualIDRegistry.getLinkWithClassVisualID(link)) {
				continue;
			}
			DependencyElement dst = link.getTarget();
			DependencyElement src = link.getSource();
			result.add(new CiatLinkDescriptor(src, dst, link, CiatElementTypes.Aggregation_4007,
					AggregationEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<CiatLinkDescriptor> getContainedTypeModelFacetLinks_Enabling_4008(CIATDiagram container) {
		LinkedList<CiatLinkDescriptor> result = new LinkedList<CiatLinkDescriptor>();
		for (Iterator<?> links = container.getItsLinks().iterator(); links.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof Enabling) {
				continue;
			}
			Enabling link = (Enabling) linkObject;
			if (EnablingEditPart.VISUAL_ID != CiatVisualIDRegistry.getLinkWithClassVisualID(link)) {
				continue;
			}
			DependencyElement dst = link.getTarget();
			DependencyElement src = link.getSource();
			result.add(
					new CiatLinkDescriptor(src, dst, link, CiatElementTypes.Enabling_4008, EnablingEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<CiatLinkDescriptor> getContainedTypeModelFacetLinks_Disabling_4009(
			CIATDiagram container) {
		LinkedList<CiatLinkDescriptor> result = new LinkedList<CiatLinkDescriptor>();
		for (Iterator<?> links = container.getItsLinks().iterator(); links.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof Disabling) {
				continue;
			}
			Disabling link = (Disabling) linkObject;
			if (DisablingEditPart.VISUAL_ID != CiatVisualIDRegistry.getLinkWithClassVisualID(link)) {
				continue;
			}
			DependencyElement dst = link.getTarget();
			DependencyElement src = link.getSource();
			result.add(new CiatLinkDescriptor(src, dst, link, CiatElementTypes.Disabling_4009,
					DisablingEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<CiatLinkDescriptor> getContainedTypeModelFacetLinks_EnablingWithInformationPassing_4010(
			CIATDiagram container) {
		LinkedList<CiatLinkDescriptor> result = new LinkedList<CiatLinkDescriptor>();
		for (Iterator<?> links = container.getItsLinks().iterator(); links.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof EnablingWithInformationPassing) {
				continue;
			}
			EnablingWithInformationPassing link = (EnablingWithInformationPassing) linkObject;
			if (EnablingWithInformationPassingEditPart.VISUAL_ID != CiatVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			DependencyElement dst = link.getTarget();
			DependencyElement src = link.getSource();
			result.add(new CiatLinkDescriptor(src, dst, link, CiatElementTypes.EnablingWithInformationPassing_4010,
					EnablingWithInformationPassingEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<CiatLinkDescriptor> getContainedTypeModelFacetLinks_DisablingWithInformationPassing_4011(
			CIATDiagram container) {
		LinkedList<CiatLinkDescriptor> result = new LinkedList<CiatLinkDescriptor>();
		for (Iterator<?> links = container.getItsLinks().iterator(); links.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof DisablingWithInformationPassing) {
				continue;
			}
			DisablingWithInformationPassing link = (DisablingWithInformationPassing) linkObject;
			if (DisablingWithInformationPassingEditPart.VISUAL_ID != CiatVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			DependencyElement dst = link.getTarget();
			DependencyElement src = link.getSource();
			result.add(new CiatLinkDescriptor(src, dst, link, CiatElementTypes.DisablingWithInformationPassing_4011,
					DisablingWithInformationPassingEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<CiatLinkDescriptor> getContainedTypeModelFacetLinks_IndependentConcurrency_4012(
			CIATDiagram container) {
		LinkedList<CiatLinkDescriptor> result = new LinkedList<CiatLinkDescriptor>();
		for (Iterator<?> links = container.getItsLinks().iterator(); links.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof IndependentConcurrency) {
				continue;
			}
			IndependentConcurrency link = (IndependentConcurrency) linkObject;
			if (IndependentConcurrencyEditPart.VISUAL_ID != CiatVisualIDRegistry.getLinkWithClassVisualID(link)) {
				continue;
			}
			DependencyElement dst = link.getTarget();
			DependencyElement src = link.getSource();
			result.add(new CiatLinkDescriptor(src, dst, link, CiatElementTypes.IndependentConcurrency_4012,
					IndependentConcurrencyEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<CiatLinkDescriptor> getContainedTypeModelFacetLinks_OrderIndependence_4013(
			CIATDiagram container) {
		LinkedList<CiatLinkDescriptor> result = new LinkedList<CiatLinkDescriptor>();
		for (Iterator<?> links = container.getItsLinks().iterator(); links.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof OrderIndependence) {
				continue;
			}
			OrderIndependence link = (OrderIndependence) linkObject;
			if (OrderIndependenceEditPart.VISUAL_ID != CiatVisualIDRegistry.getLinkWithClassVisualID(link)) {
				continue;
			}
			DependencyElement dst = link.getTarget();
			DependencyElement src = link.getSource();
			result.add(new CiatLinkDescriptor(src, dst, link, CiatElementTypes.OrderIndependence_4013,
					OrderIndependenceEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<CiatLinkDescriptor> getContainedTypeModelFacetLinks_SuspendResume_4014(
			CIATDiagram container) {
		LinkedList<CiatLinkDescriptor> result = new LinkedList<CiatLinkDescriptor>();
		for (Iterator<?> links = container.getItsLinks().iterator(); links.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof SuspendResume) {
				continue;
			}
			SuspendResume link = (SuspendResume) linkObject;
			if (SuspendResumeEditPart.VISUAL_ID != CiatVisualIDRegistry.getLinkWithClassVisualID(link)) {
				continue;
			}
			DependencyElement dst = link.getTarget();
			DependencyElement src = link.getSource();
			result.add(new CiatLinkDescriptor(src, dst, link, CiatElementTypes.SuspendResume_4014,
					SuspendResumeEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<CiatLinkDescriptor> getContainedTypeModelFacetLinks_ConcurrencyWithInformationPassing_4015(
			CIATDiagram container) {
		LinkedList<CiatLinkDescriptor> result = new LinkedList<CiatLinkDescriptor>();
		for (Iterator<?> links = container.getItsLinks().iterator(); links.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof ConcurrencyWithInformationPassing) {
				continue;
			}
			ConcurrencyWithInformationPassing link = (ConcurrencyWithInformationPassing) linkObject;
			if (ConcurrencyWithInformationPassingEditPart.VISUAL_ID != CiatVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			DependencyElement dst = link.getTarget();
			DependencyElement src = link.getSource();
			result.add(new CiatLinkDescriptor(src, dst, link, CiatElementTypes.ConcurrencyWithInformationPassing_4015,
					ConcurrencyWithInformationPassingEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<CiatLinkDescriptor> getContainedTypeModelFacetLinks_DeterministicChoice_4016(
			CIATDiagram container) {
		LinkedList<CiatLinkDescriptor> result = new LinkedList<CiatLinkDescriptor>();
		for (Iterator<?> links = container.getItsLinks().iterator(); links.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof DeterministicChoice) {
				continue;
			}
			DeterministicChoice link = (DeterministicChoice) linkObject;
			if (DeterministicChoiceEditPart.VISUAL_ID != CiatVisualIDRegistry.getLinkWithClassVisualID(link)) {
				continue;
			}
			DependencyElement dst = link.getTarget();
			DependencyElement src = link.getSource();
			result.add(new CiatLinkDescriptor(src, dst, link, CiatElementTypes.DeterministicChoice_4016,
					DeterministicChoiceEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<CiatLinkDescriptor> getContainedTypeModelFacetLinks_UndeterministicChoice_4017(
			CIATDiagram container) {
		LinkedList<CiatLinkDescriptor> result = new LinkedList<CiatLinkDescriptor>();
		for (Iterator<?> links = container.getItsLinks().iterator(); links.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof UndeterministicChoice) {
				continue;
			}
			UndeterministicChoice link = (UndeterministicChoice) linkObject;
			if (UndeterministicChoiceEditPart.VISUAL_ID != CiatVisualIDRegistry.getLinkWithClassVisualID(link)) {
				continue;
			}
			DependencyElement dst = link.getTarget();
			DependencyElement src = link.getSource();
			result.add(new CiatLinkDescriptor(src, dst, link, CiatElementTypes.UndeterministicChoice_4017,
					UndeterministicChoiceEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<CiatLinkDescriptor> getIncomingTypeModelFacetLinks_Inheritance_4001(SociogramNode target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<CiatLinkDescriptor> result = new LinkedList<CiatLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() != CiatPackage.eINSTANCE.getSociogramLink_Target()
					|| false == setting.getEObject() instanceof Inheritance) {
				continue;
			}
			Inheritance link = (Inheritance) setting.getEObject();
			if (InheritanceEditPart.VISUAL_ID != CiatVisualIDRegistry.getLinkWithClassVisualID(link)) {
				continue;
			}
			SociogramNode src = link.getSource();
			result.add(new CiatLinkDescriptor(src, target, link, CiatElementTypes.Inheritance_4001,
					InheritanceEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<CiatLinkDescriptor> getIncomingTypeModelFacetLinks_Acting_4002(SociogramNode target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<CiatLinkDescriptor> result = new LinkedList<CiatLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() != CiatPackage.eINSTANCE.getSociogramLink_Target()
					|| false == setting.getEObject() instanceof Acting) {
				continue;
			}
			Acting link = (Acting) setting.getEObject();
			if (ActingEditPart.VISUAL_ID != CiatVisualIDRegistry.getLinkWithClassVisualID(link)) {
				continue;
			}
			SociogramNode src = link.getSource();
			result.add(
					new CiatLinkDescriptor(src, target, link, CiatElementTypes.Acting_4002, ActingEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<CiatLinkDescriptor> getIncomingTypeModelFacetLinks_Association_4003(SociogramNode target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<CiatLinkDescriptor> result = new LinkedList<CiatLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() != CiatPackage.eINSTANCE.getSociogramLink_Target()
					|| false == setting.getEObject() instanceof Association) {
				continue;
			}
			Association link = (Association) setting.getEObject();
			if (AssociationEditPart.VISUAL_ID != CiatVisualIDRegistry.getLinkWithClassVisualID(link)) {
				continue;
			}
			SociogramNode src = link.getSource();
			result.add(new CiatLinkDescriptor(src, target, link, CiatElementTypes.Association_4003,
					AssociationEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<CiatLinkDescriptor> getIncomingTypeModelFacetLinks_ShAssociationLink_4004(
			SharedObject target, Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<CiatLinkDescriptor> result = new LinkedList<CiatLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() != CiatPackage.eINSTANCE.getSharedLink_Target()
					|| false == setting.getEObject() instanceof ShAssociationLink) {
				continue;
			}
			ShAssociationLink link = (ShAssociationLink) setting.getEObject();
			if (ShAssociationLinkEditPart.VISUAL_ID != CiatVisualIDRegistry.getLinkWithClassVisualID(link)) {
				continue;
			}
			SharedObject src = link.getSource();
			result.add(new CiatLinkDescriptor(src, target, link, CiatElementTypes.ShAssociationLink_4004,
					ShAssociationLinkEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<CiatLinkDescriptor> getIncomingTypeModelFacetLinks_ShGeneralizationLink_4005(
			SharedObject target, Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<CiatLinkDescriptor> result = new LinkedList<CiatLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() != CiatPackage.eINSTANCE.getSharedLink_Target()
					|| false == setting.getEObject() instanceof ShGeneralizationLink) {
				continue;
			}
			ShGeneralizationLink link = (ShGeneralizationLink) setting.getEObject();
			if (ShGeneralizationLinkEditPart.VISUAL_ID != CiatVisualIDRegistry.getLinkWithClassVisualID(link)) {
				continue;
			}
			SharedObject src = link.getSource();
			result.add(new CiatLinkDescriptor(src, target, link, CiatElementTypes.ShGeneralizationLink_4005,
					ShGeneralizationLinkEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<CiatLinkDescriptor> getIncomingTypeModelFacetLinks_ShAggregationLink_4006(
			SharedObject target, Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<CiatLinkDescriptor> result = new LinkedList<CiatLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() != CiatPackage.eINSTANCE.getSharedLink_Target()
					|| false == setting.getEObject() instanceof ShAggregationLink) {
				continue;
			}
			ShAggregationLink link = (ShAggregationLink) setting.getEObject();
			if (ShAggregationLinkEditPart.VISUAL_ID != CiatVisualIDRegistry.getLinkWithClassVisualID(link)) {
				continue;
			}
			SharedObject src = link.getSource();
			result.add(new CiatLinkDescriptor(src, target, link, CiatElementTypes.ShAggregationLink_4006,
					ShAggregationLinkEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<CiatLinkDescriptor> getIncomingTypeModelFacetLinks_Aggregation_4007(
			DependencyElement target, Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<CiatLinkDescriptor> result = new LinkedList<CiatLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() != CiatPackage.eINSTANCE.getDependency_Target()
					|| false == setting.getEObject() instanceof Aggregation) {
				continue;
			}
			Aggregation link = (Aggregation) setting.getEObject();
			if (AggregationEditPart.VISUAL_ID != CiatVisualIDRegistry.getLinkWithClassVisualID(link)) {
				continue;
			}
			DependencyElement src = link.getSource();
			result.add(new CiatLinkDescriptor(src, target, link, CiatElementTypes.Aggregation_4007,
					AggregationEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<CiatLinkDescriptor> getIncomingTypeModelFacetLinks_Enabling_4008(DependencyElement target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<CiatLinkDescriptor> result = new LinkedList<CiatLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() != CiatPackage.eINSTANCE.getDependency_Target()
					|| false == setting.getEObject() instanceof Enabling) {
				continue;
			}
			Enabling link = (Enabling) setting.getEObject();
			if (EnablingEditPart.VISUAL_ID != CiatVisualIDRegistry.getLinkWithClassVisualID(link)) {
				continue;
			}
			DependencyElement src = link.getSource();
			result.add(new CiatLinkDescriptor(src, target, link, CiatElementTypes.Enabling_4008,
					EnablingEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<CiatLinkDescriptor> getIncomingTypeModelFacetLinks_Disabling_4009(
			DependencyElement target, Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<CiatLinkDescriptor> result = new LinkedList<CiatLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() != CiatPackage.eINSTANCE.getDependency_Target()
					|| false == setting.getEObject() instanceof Disabling) {
				continue;
			}
			Disabling link = (Disabling) setting.getEObject();
			if (DisablingEditPart.VISUAL_ID != CiatVisualIDRegistry.getLinkWithClassVisualID(link)) {
				continue;
			}
			DependencyElement src = link.getSource();
			result.add(new CiatLinkDescriptor(src, target, link, CiatElementTypes.Disabling_4009,
					DisablingEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<CiatLinkDescriptor> getIncomingTypeModelFacetLinks_EnablingWithInformationPassing_4010(
			DependencyElement target, Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<CiatLinkDescriptor> result = new LinkedList<CiatLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() != CiatPackage.eINSTANCE.getDependency_Target()
					|| false == setting.getEObject() instanceof EnablingWithInformationPassing) {
				continue;
			}
			EnablingWithInformationPassing link = (EnablingWithInformationPassing) setting.getEObject();
			if (EnablingWithInformationPassingEditPart.VISUAL_ID != CiatVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			DependencyElement src = link.getSource();
			result.add(new CiatLinkDescriptor(src, target, link, CiatElementTypes.EnablingWithInformationPassing_4010,
					EnablingWithInformationPassingEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<CiatLinkDescriptor> getIncomingTypeModelFacetLinks_DisablingWithInformationPassing_4011(
			DependencyElement target, Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<CiatLinkDescriptor> result = new LinkedList<CiatLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() != CiatPackage.eINSTANCE.getDependency_Target()
					|| false == setting.getEObject() instanceof DisablingWithInformationPassing) {
				continue;
			}
			DisablingWithInformationPassing link = (DisablingWithInformationPassing) setting.getEObject();
			if (DisablingWithInformationPassingEditPart.VISUAL_ID != CiatVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			DependencyElement src = link.getSource();
			result.add(new CiatLinkDescriptor(src, target, link, CiatElementTypes.DisablingWithInformationPassing_4011,
					DisablingWithInformationPassingEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<CiatLinkDescriptor> getIncomingTypeModelFacetLinks_IndependentConcurrency_4012(
			DependencyElement target, Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<CiatLinkDescriptor> result = new LinkedList<CiatLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() != CiatPackage.eINSTANCE.getDependency_Target()
					|| false == setting.getEObject() instanceof IndependentConcurrency) {
				continue;
			}
			IndependentConcurrency link = (IndependentConcurrency) setting.getEObject();
			if (IndependentConcurrencyEditPart.VISUAL_ID != CiatVisualIDRegistry.getLinkWithClassVisualID(link)) {
				continue;
			}
			DependencyElement src = link.getSource();
			result.add(new CiatLinkDescriptor(src, target, link, CiatElementTypes.IndependentConcurrency_4012,
					IndependentConcurrencyEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<CiatLinkDescriptor> getIncomingTypeModelFacetLinks_OrderIndependence_4013(
			DependencyElement target, Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<CiatLinkDescriptor> result = new LinkedList<CiatLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() != CiatPackage.eINSTANCE.getDependency_Target()
					|| false == setting.getEObject() instanceof OrderIndependence) {
				continue;
			}
			OrderIndependence link = (OrderIndependence) setting.getEObject();
			if (OrderIndependenceEditPart.VISUAL_ID != CiatVisualIDRegistry.getLinkWithClassVisualID(link)) {
				continue;
			}
			DependencyElement src = link.getSource();
			result.add(new CiatLinkDescriptor(src, target, link, CiatElementTypes.OrderIndependence_4013,
					OrderIndependenceEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<CiatLinkDescriptor> getIncomingTypeModelFacetLinks_SuspendResume_4014(
			DependencyElement target, Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<CiatLinkDescriptor> result = new LinkedList<CiatLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() != CiatPackage.eINSTANCE.getDependency_Target()
					|| false == setting.getEObject() instanceof SuspendResume) {
				continue;
			}
			SuspendResume link = (SuspendResume) setting.getEObject();
			if (SuspendResumeEditPart.VISUAL_ID != CiatVisualIDRegistry.getLinkWithClassVisualID(link)) {
				continue;
			}
			DependencyElement src = link.getSource();
			result.add(new CiatLinkDescriptor(src, target, link, CiatElementTypes.SuspendResume_4014,
					SuspendResumeEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<CiatLinkDescriptor> getIncomingTypeModelFacetLinks_ConcurrencyWithInformationPassing_4015(
			DependencyElement target, Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<CiatLinkDescriptor> result = new LinkedList<CiatLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() != CiatPackage.eINSTANCE.getDependency_Target()
					|| false == setting.getEObject() instanceof ConcurrencyWithInformationPassing) {
				continue;
			}
			ConcurrencyWithInformationPassing link = (ConcurrencyWithInformationPassing) setting.getEObject();
			if (ConcurrencyWithInformationPassingEditPart.VISUAL_ID != CiatVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			DependencyElement src = link.getSource();
			result.add(
					new CiatLinkDescriptor(src, target, link, CiatElementTypes.ConcurrencyWithInformationPassing_4015,
							ConcurrencyWithInformationPassingEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<CiatLinkDescriptor> getIncomingTypeModelFacetLinks_DeterministicChoice_4016(
			DependencyElement target, Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<CiatLinkDescriptor> result = new LinkedList<CiatLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() != CiatPackage.eINSTANCE.getDependency_Target()
					|| false == setting.getEObject() instanceof DeterministicChoice) {
				continue;
			}
			DeterministicChoice link = (DeterministicChoice) setting.getEObject();
			if (DeterministicChoiceEditPart.VISUAL_ID != CiatVisualIDRegistry.getLinkWithClassVisualID(link)) {
				continue;
			}
			DependencyElement src = link.getSource();
			result.add(new CiatLinkDescriptor(src, target, link, CiatElementTypes.DeterministicChoice_4016,
					DeterministicChoiceEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<CiatLinkDescriptor> getIncomingTypeModelFacetLinks_UndeterministicChoice_4017(
			DependencyElement target, Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<CiatLinkDescriptor> result = new LinkedList<CiatLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() != CiatPackage.eINSTANCE.getDependency_Target()
					|| false == setting.getEObject() instanceof UndeterministicChoice) {
				continue;
			}
			UndeterministicChoice link = (UndeterministicChoice) setting.getEObject();
			if (UndeterministicChoiceEditPart.VISUAL_ID != CiatVisualIDRegistry.getLinkWithClassVisualID(link)) {
				continue;
			}
			DependencyElement src = link.getSource();
			result.add(new CiatLinkDescriptor(src, target, link, CiatElementTypes.UndeterministicChoice_4017,
					UndeterministicChoiceEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<CiatLinkDescriptor> getOutgoingTypeModelFacetLinks_Inheritance_4001(
			SociogramNode source) {
		CIATDiagram container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null && container == null; element = element.eContainer()) {
			if (element instanceof CIATDiagram) {
				container = (CIATDiagram) element;
			}
		}
		if (container == null) {
			return Collections.emptyList();
		}
		LinkedList<CiatLinkDescriptor> result = new LinkedList<CiatLinkDescriptor>();
		for (Iterator<?> links = container.getItsLinks().iterator(); links.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof Inheritance) {
				continue;
			}
			Inheritance link = (Inheritance) linkObject;
			if (InheritanceEditPart.VISUAL_ID != CiatVisualIDRegistry.getLinkWithClassVisualID(link)) {
				continue;
			}
			SociogramNode dst = link.getTarget();
			SociogramNode src = link.getSource();
			if (src != source) {
				continue;
			}
			result.add(new CiatLinkDescriptor(src, dst, link, CiatElementTypes.Inheritance_4001,
					InheritanceEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<CiatLinkDescriptor> getOutgoingTypeModelFacetLinks_Acting_4002(SociogramNode source) {
		CIATDiagram container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null && container == null; element = element.eContainer()) {
			if (element instanceof CIATDiagram) {
				container = (CIATDiagram) element;
			}
		}
		if (container == null) {
			return Collections.emptyList();
		}
		LinkedList<CiatLinkDescriptor> result = new LinkedList<CiatLinkDescriptor>();
		for (Iterator<?> links = container.getItsLinks().iterator(); links.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof Acting) {
				continue;
			}
			Acting link = (Acting) linkObject;
			if (ActingEditPart.VISUAL_ID != CiatVisualIDRegistry.getLinkWithClassVisualID(link)) {
				continue;
			}
			SociogramNode dst = link.getTarget();
			SociogramNode src = link.getSource();
			if (src != source) {
				continue;
			}
			result.add(new CiatLinkDescriptor(src, dst, link, CiatElementTypes.Acting_4002, ActingEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<CiatLinkDescriptor> getOutgoingTypeModelFacetLinks_Association_4003(
			SociogramNode source) {
		CIATDiagram container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null && container == null; element = element.eContainer()) {
			if (element instanceof CIATDiagram) {
				container = (CIATDiagram) element;
			}
		}
		if (container == null) {
			return Collections.emptyList();
		}
		LinkedList<CiatLinkDescriptor> result = new LinkedList<CiatLinkDescriptor>();
		for (Iterator<?> links = container.getItsLinks().iterator(); links.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof Association) {
				continue;
			}
			Association link = (Association) linkObject;
			if (AssociationEditPart.VISUAL_ID != CiatVisualIDRegistry.getLinkWithClassVisualID(link)) {
				continue;
			}
			SociogramNode dst = link.getTarget();
			SociogramNode src = link.getSource();
			if (src != source) {
				continue;
			}
			result.add(new CiatLinkDescriptor(src, dst, link, CiatElementTypes.Association_4003,
					AssociationEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<CiatLinkDescriptor> getOutgoingTypeModelFacetLinks_ShAssociationLink_4004(
			SharedObject source) {
		CIATDiagram container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null && container == null; element = element.eContainer()) {
			if (element instanceof CIATDiagram) {
				container = (CIATDiagram) element;
			}
		}
		if (container == null) {
			return Collections.emptyList();
		}
		LinkedList<CiatLinkDescriptor> result = new LinkedList<CiatLinkDescriptor>();
		for (Iterator<?> links = container.getItsLinks().iterator(); links.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof ShAssociationLink) {
				continue;
			}
			ShAssociationLink link = (ShAssociationLink) linkObject;
			if (ShAssociationLinkEditPart.VISUAL_ID != CiatVisualIDRegistry.getLinkWithClassVisualID(link)) {
				continue;
			}
			SharedObject dst = link.getTarget();
			SharedObject src = link.getSource();
			if (src != source) {
				continue;
			}
			result.add(new CiatLinkDescriptor(src, dst, link, CiatElementTypes.ShAssociationLink_4004,
					ShAssociationLinkEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<CiatLinkDescriptor> getOutgoingTypeModelFacetLinks_ShGeneralizationLink_4005(
			SharedObject source) {
		CIATDiagram container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null && container == null; element = element.eContainer()) {
			if (element instanceof CIATDiagram) {
				container = (CIATDiagram) element;
			}
		}
		if (container == null) {
			return Collections.emptyList();
		}
		LinkedList<CiatLinkDescriptor> result = new LinkedList<CiatLinkDescriptor>();
		for (Iterator<?> links = container.getItsLinks().iterator(); links.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof ShGeneralizationLink) {
				continue;
			}
			ShGeneralizationLink link = (ShGeneralizationLink) linkObject;
			if (ShGeneralizationLinkEditPart.VISUAL_ID != CiatVisualIDRegistry.getLinkWithClassVisualID(link)) {
				continue;
			}
			SharedObject dst = link.getTarget();
			SharedObject src = link.getSource();
			if (src != source) {
				continue;
			}
			result.add(new CiatLinkDescriptor(src, dst, link, CiatElementTypes.ShGeneralizationLink_4005,
					ShGeneralizationLinkEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<CiatLinkDescriptor> getOutgoingTypeModelFacetLinks_ShAggregationLink_4006(
			SharedObject source) {
		CIATDiagram container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null && container == null; element = element.eContainer()) {
			if (element instanceof CIATDiagram) {
				container = (CIATDiagram) element;
			}
		}
		if (container == null) {
			return Collections.emptyList();
		}
		LinkedList<CiatLinkDescriptor> result = new LinkedList<CiatLinkDescriptor>();
		for (Iterator<?> links = container.getItsLinks().iterator(); links.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof ShAggregationLink) {
				continue;
			}
			ShAggregationLink link = (ShAggregationLink) linkObject;
			if (ShAggregationLinkEditPart.VISUAL_ID != CiatVisualIDRegistry.getLinkWithClassVisualID(link)) {
				continue;
			}
			SharedObject dst = link.getTarget();
			SharedObject src = link.getSource();
			if (src != source) {
				continue;
			}
			result.add(new CiatLinkDescriptor(src, dst, link, CiatElementTypes.ShAggregationLink_4006,
					ShAggregationLinkEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<CiatLinkDescriptor> getOutgoingTypeModelFacetLinks_Aggregation_4007(
			DependencyElement source) {
		CIATDiagram container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null && container == null; element = element.eContainer()) {
			if (element instanceof CIATDiagram) {
				container = (CIATDiagram) element;
			}
		}
		if (container == null) {
			return Collections.emptyList();
		}
		LinkedList<CiatLinkDescriptor> result = new LinkedList<CiatLinkDescriptor>();
		for (Iterator<?> links = container.getItsLinks().iterator(); links.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof Aggregation) {
				continue;
			}
			Aggregation link = (Aggregation) linkObject;
			if (AggregationEditPart.VISUAL_ID != CiatVisualIDRegistry.getLinkWithClassVisualID(link)) {
				continue;
			}
			DependencyElement dst = link.getTarget();
			DependencyElement src = link.getSource();
			if (src != source) {
				continue;
			}
			result.add(new CiatLinkDescriptor(src, dst, link, CiatElementTypes.Aggregation_4007,
					AggregationEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<CiatLinkDescriptor> getOutgoingTypeModelFacetLinks_Enabling_4008(
			DependencyElement source) {
		CIATDiagram container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null && container == null; element = element.eContainer()) {
			if (element instanceof CIATDiagram) {
				container = (CIATDiagram) element;
			}
		}
		if (container == null) {
			return Collections.emptyList();
		}
		LinkedList<CiatLinkDescriptor> result = new LinkedList<CiatLinkDescriptor>();
		for (Iterator<?> links = container.getItsLinks().iterator(); links.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof Enabling) {
				continue;
			}
			Enabling link = (Enabling) linkObject;
			if (EnablingEditPart.VISUAL_ID != CiatVisualIDRegistry.getLinkWithClassVisualID(link)) {
				continue;
			}
			DependencyElement dst = link.getTarget();
			DependencyElement src = link.getSource();
			if (src != source) {
				continue;
			}
			result.add(
					new CiatLinkDescriptor(src, dst, link, CiatElementTypes.Enabling_4008, EnablingEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<CiatLinkDescriptor> getOutgoingTypeModelFacetLinks_Disabling_4009(
			DependencyElement source) {
		CIATDiagram container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null && container == null; element = element.eContainer()) {
			if (element instanceof CIATDiagram) {
				container = (CIATDiagram) element;
			}
		}
		if (container == null) {
			return Collections.emptyList();
		}
		LinkedList<CiatLinkDescriptor> result = new LinkedList<CiatLinkDescriptor>();
		for (Iterator<?> links = container.getItsLinks().iterator(); links.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof Disabling) {
				continue;
			}
			Disabling link = (Disabling) linkObject;
			if (DisablingEditPart.VISUAL_ID != CiatVisualIDRegistry.getLinkWithClassVisualID(link)) {
				continue;
			}
			DependencyElement dst = link.getTarget();
			DependencyElement src = link.getSource();
			if (src != source) {
				continue;
			}
			result.add(new CiatLinkDescriptor(src, dst, link, CiatElementTypes.Disabling_4009,
					DisablingEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<CiatLinkDescriptor> getOutgoingTypeModelFacetLinks_EnablingWithInformationPassing_4010(
			DependencyElement source) {
		CIATDiagram container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null && container == null; element = element.eContainer()) {
			if (element instanceof CIATDiagram) {
				container = (CIATDiagram) element;
			}
		}
		if (container == null) {
			return Collections.emptyList();
		}
		LinkedList<CiatLinkDescriptor> result = new LinkedList<CiatLinkDescriptor>();
		for (Iterator<?> links = container.getItsLinks().iterator(); links.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof EnablingWithInformationPassing) {
				continue;
			}
			EnablingWithInformationPassing link = (EnablingWithInformationPassing) linkObject;
			if (EnablingWithInformationPassingEditPart.VISUAL_ID != CiatVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			DependencyElement dst = link.getTarget();
			DependencyElement src = link.getSource();
			if (src != source) {
				continue;
			}
			result.add(new CiatLinkDescriptor(src, dst, link, CiatElementTypes.EnablingWithInformationPassing_4010,
					EnablingWithInformationPassingEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<CiatLinkDescriptor> getOutgoingTypeModelFacetLinks_DisablingWithInformationPassing_4011(
			DependencyElement source) {
		CIATDiagram container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null && container == null; element = element.eContainer()) {
			if (element instanceof CIATDiagram) {
				container = (CIATDiagram) element;
			}
		}
		if (container == null) {
			return Collections.emptyList();
		}
		LinkedList<CiatLinkDescriptor> result = new LinkedList<CiatLinkDescriptor>();
		for (Iterator<?> links = container.getItsLinks().iterator(); links.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof DisablingWithInformationPassing) {
				continue;
			}
			DisablingWithInformationPassing link = (DisablingWithInformationPassing) linkObject;
			if (DisablingWithInformationPassingEditPart.VISUAL_ID != CiatVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			DependencyElement dst = link.getTarget();
			DependencyElement src = link.getSource();
			if (src != source) {
				continue;
			}
			result.add(new CiatLinkDescriptor(src, dst, link, CiatElementTypes.DisablingWithInformationPassing_4011,
					DisablingWithInformationPassingEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<CiatLinkDescriptor> getOutgoingTypeModelFacetLinks_IndependentConcurrency_4012(
			DependencyElement source) {
		CIATDiagram container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null && container == null; element = element.eContainer()) {
			if (element instanceof CIATDiagram) {
				container = (CIATDiagram) element;
			}
		}
		if (container == null) {
			return Collections.emptyList();
		}
		LinkedList<CiatLinkDescriptor> result = new LinkedList<CiatLinkDescriptor>();
		for (Iterator<?> links = container.getItsLinks().iterator(); links.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof IndependentConcurrency) {
				continue;
			}
			IndependentConcurrency link = (IndependentConcurrency) linkObject;
			if (IndependentConcurrencyEditPart.VISUAL_ID != CiatVisualIDRegistry.getLinkWithClassVisualID(link)) {
				continue;
			}
			DependencyElement dst = link.getTarget();
			DependencyElement src = link.getSource();
			if (src != source) {
				continue;
			}
			result.add(new CiatLinkDescriptor(src, dst, link, CiatElementTypes.IndependentConcurrency_4012,
					IndependentConcurrencyEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<CiatLinkDescriptor> getOutgoingTypeModelFacetLinks_OrderIndependence_4013(
			DependencyElement source) {
		CIATDiagram container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null && container == null; element = element.eContainer()) {
			if (element instanceof CIATDiagram) {
				container = (CIATDiagram) element;
			}
		}
		if (container == null) {
			return Collections.emptyList();
		}
		LinkedList<CiatLinkDescriptor> result = new LinkedList<CiatLinkDescriptor>();
		for (Iterator<?> links = container.getItsLinks().iterator(); links.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof OrderIndependence) {
				continue;
			}
			OrderIndependence link = (OrderIndependence) linkObject;
			if (OrderIndependenceEditPart.VISUAL_ID != CiatVisualIDRegistry.getLinkWithClassVisualID(link)) {
				continue;
			}
			DependencyElement dst = link.getTarget();
			DependencyElement src = link.getSource();
			if (src != source) {
				continue;
			}
			result.add(new CiatLinkDescriptor(src, dst, link, CiatElementTypes.OrderIndependence_4013,
					OrderIndependenceEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<CiatLinkDescriptor> getOutgoingTypeModelFacetLinks_SuspendResume_4014(
			DependencyElement source) {
		CIATDiagram container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null && container == null; element = element.eContainer()) {
			if (element instanceof CIATDiagram) {
				container = (CIATDiagram) element;
			}
		}
		if (container == null) {
			return Collections.emptyList();
		}
		LinkedList<CiatLinkDescriptor> result = new LinkedList<CiatLinkDescriptor>();
		for (Iterator<?> links = container.getItsLinks().iterator(); links.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof SuspendResume) {
				continue;
			}
			SuspendResume link = (SuspendResume) linkObject;
			if (SuspendResumeEditPart.VISUAL_ID != CiatVisualIDRegistry.getLinkWithClassVisualID(link)) {
				continue;
			}
			DependencyElement dst = link.getTarget();
			DependencyElement src = link.getSource();
			if (src != source) {
				continue;
			}
			result.add(new CiatLinkDescriptor(src, dst, link, CiatElementTypes.SuspendResume_4014,
					SuspendResumeEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<CiatLinkDescriptor> getOutgoingTypeModelFacetLinks_ConcurrencyWithInformationPassing_4015(
			DependencyElement source) {
		CIATDiagram container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null && container == null; element = element.eContainer()) {
			if (element instanceof CIATDiagram) {
				container = (CIATDiagram) element;
			}
		}
		if (container == null) {
			return Collections.emptyList();
		}
		LinkedList<CiatLinkDescriptor> result = new LinkedList<CiatLinkDescriptor>();
		for (Iterator<?> links = container.getItsLinks().iterator(); links.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof ConcurrencyWithInformationPassing) {
				continue;
			}
			ConcurrencyWithInformationPassing link = (ConcurrencyWithInformationPassing) linkObject;
			if (ConcurrencyWithInformationPassingEditPart.VISUAL_ID != CiatVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			DependencyElement dst = link.getTarget();
			DependencyElement src = link.getSource();
			if (src != source) {
				continue;
			}
			result.add(new CiatLinkDescriptor(src, dst, link, CiatElementTypes.ConcurrencyWithInformationPassing_4015,
					ConcurrencyWithInformationPassingEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<CiatLinkDescriptor> getOutgoingTypeModelFacetLinks_DeterministicChoice_4016(
			DependencyElement source) {
		CIATDiagram container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null && container == null; element = element.eContainer()) {
			if (element instanceof CIATDiagram) {
				container = (CIATDiagram) element;
			}
		}
		if (container == null) {
			return Collections.emptyList();
		}
		LinkedList<CiatLinkDescriptor> result = new LinkedList<CiatLinkDescriptor>();
		for (Iterator<?> links = container.getItsLinks().iterator(); links.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof DeterministicChoice) {
				continue;
			}
			DeterministicChoice link = (DeterministicChoice) linkObject;
			if (DeterministicChoiceEditPart.VISUAL_ID != CiatVisualIDRegistry.getLinkWithClassVisualID(link)) {
				continue;
			}
			DependencyElement dst = link.getTarget();
			DependencyElement src = link.getSource();
			if (src != source) {
				continue;
			}
			result.add(new CiatLinkDescriptor(src, dst, link, CiatElementTypes.DeterministicChoice_4016,
					DeterministicChoiceEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<CiatLinkDescriptor> getOutgoingTypeModelFacetLinks_UndeterministicChoice_4017(
			DependencyElement source) {
		CIATDiagram container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null && container == null; element = element.eContainer()) {
			if (element instanceof CIATDiagram) {
				container = (CIATDiagram) element;
			}
		}
		if (container == null) {
			return Collections.emptyList();
		}
		LinkedList<CiatLinkDescriptor> result = new LinkedList<CiatLinkDescriptor>();
		for (Iterator<?> links = container.getItsLinks().iterator(); links.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof UndeterministicChoice) {
				continue;
			}
			UndeterministicChoice link = (UndeterministicChoice) linkObject;
			if (UndeterministicChoiceEditPart.VISUAL_ID != CiatVisualIDRegistry.getLinkWithClassVisualID(link)) {
				continue;
			}
			DependencyElement dst = link.getTarget();
			DependencyElement src = link.getSource();
			if (src != source) {
				continue;
			}
			result.add(new CiatLinkDescriptor(src, dst, link, CiatElementTypes.UndeterministicChoice_4017,
					UndeterministicChoiceEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	* @generated
	*/
	public static final DiagramUpdater TYPED_INSTANCE = new DiagramUpdater() {
		/**
		* @generated
		*/
		@Override

		public List<CiatNodeDescriptor> getSemanticChildren(View view) {
			return CiatDiagramUpdater.getSemanticChildren(view);
		}

		/**
		* @generated
		*/
		@Override

		public List<CiatLinkDescriptor> getContainedLinks(View view) {
			return CiatDiagramUpdater.getContainedLinks(view);
		}

		/**
		* @generated
		*/
		@Override

		public List<CiatLinkDescriptor> getIncomingLinks(View view) {
			return CiatDiagramUpdater.getIncomingLinks(view);
		}

		/**
		* @generated
		*/
		@Override

		public List<CiatLinkDescriptor> getOutgoingLinks(View view) {
			return CiatDiagramUpdater.getOutgoingLinks(view);
		}
	};

}
