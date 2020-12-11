/*
 * 
 */
package ciat.diagram.providers;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.common.core.service.AbstractProvider;
import org.eclipse.gmf.runtime.common.core.service.IOperation;
import org.eclipse.gmf.runtime.common.ui.services.parser.GetParserOperation;
import org.eclipse.gmf.runtime.common.ui.services.parser.IParser;
import org.eclipse.gmf.runtime.common.ui.services.parser.IParserProvider;
import org.eclipse.gmf.runtime.common.ui.services.parser.ParserService;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.emf.ui.services.parser.ParserHintAdapter;
import org.eclipse.gmf.runtime.notation.View;

import ciat.CiatPackage;
import ciat.diagram.edit.parts.AbstractTaskName2EditPart;
import ciat.diagram.edit.parts.AbstractTaskNameEditPart;
import ciat.diagram.edit.parts.ActingNameEditPart;
import ciat.diagram.edit.parts.ActorName2EditPart;
import ciat.diagram.edit.parts.ActorName3EditPart;
import ciat.diagram.edit.parts.ActorName4EditPart;
import ciat.diagram.edit.parts.ActorNameEditPart;
import ciat.diagram.edit.parts.ApplicationTaskNameEditPart;
import ciat.diagram.edit.parts.AssociationNameEditPart;
import ciat.diagram.edit.parts.AttributeNameEditPart;
import ciat.diagram.edit.parts.CTTAbstractTaskNameEditPart;
import ciat.diagram.edit.parts.CTTCollaborativeTaskNameEditPart;
import ciat.diagram.edit.parts.CTTDiagramNameEditPart;
import ciat.diagram.edit.parts.CollaborativeAreaNameEditPart;
import ciat.diagram.edit.parts.CollaborativeTaskName2EditPart;
import ciat.diagram.edit.parts.CollaborativeTaskNameEditPart;
import ciat.diagram.edit.parts.CollaborativeVisualizationNameEditPart;
import ciat.diagram.edit.parts.ConcurrencyWithInformationPassingCLabelEditPart;
import ciat.diagram.edit.parts.ConditionName2EditPart;
import ciat.diagram.edit.parts.ConditionNameEditPart;
import ciat.diagram.edit.parts.CooperativeTaskName2EditPart;
import ciat.diagram.edit.parts.CooperativeTaskNameEditPart;
import ciat.diagram.edit.parts.DeterministicChoiceDtLabelEditPart;
import ciat.diagram.edit.parts.DisablingDLabelEditPart;
import ciat.diagram.edit.parts.DisablingWithInformationPassingDwLabelEditPart;
import ciat.diagram.edit.parts.DomainDiagramNameEditPart;
import ciat.diagram.edit.parts.EnablingELabelEditPart;
import ciat.diagram.edit.parts.EnablingWithInformationPassingEwLabelEditPart;
import ciat.diagram.edit.parts.EndName2EditPart;
import ciat.diagram.edit.parts.EndNameEditPart;
import ciat.diagram.edit.parts.ExclusiveEditionAreaNameEditPart;
import ciat.diagram.edit.parts.ExclusiveEditionNameEditPart;
import ciat.diagram.edit.parts.GroupName2EditPart;
import ciat.diagram.edit.parts.GroupName3EditPart;
import ciat.diagram.edit.parts.GroupName4EditPart;
import ciat.diagram.edit.parts.GroupNameEditPart;
import ciat.diagram.edit.parts.IndependentConcurrencyIcLabelEditPart;
import ciat.diagram.edit.parts.IndividualAreaNameEditPart;
import ciat.diagram.edit.parts.IndividualTaskName2EditPart;
import ciat.diagram.edit.parts.IndividualTaskNameEditPart;
import ciat.diagram.edit.parts.IndividualVisualizationNameEditPart;
import ciat.diagram.edit.parts.InheritanceConditionEditPart;
import ciat.diagram.edit.parts.InitName2EditPart;
import ciat.diagram.edit.parts.InitNameEditPart;
import ciat.diagram.edit.parts.InteractiveTaskNameEditPart;
import ciat.diagram.edit.parts.NotificationName2EditPart;
import ciat.diagram.edit.parts.NotificationNameEditPart;
import ciat.diagram.edit.parts.ObjectName2EditPart;
import ciat.diagram.edit.parts.ObjectName3EditPart;
import ciat.diagram.edit.parts.ObjectNameEditPart;
import ciat.diagram.edit.parts.OperationNameEditPart;
import ciat.diagram.edit.parts.OrderIndependenceOiLabelEditPart;
import ciat.diagram.edit.parts.ProcessDiagramNameEditPart;
import ciat.diagram.edit.parts.RolName2EditPart;
import ciat.diagram.edit.parts.RolName3EditPart;
import ciat.diagram.edit.parts.RolName4EditPart;
import ciat.diagram.edit.parts.RolNameEditPart;
import ciat.diagram.edit.parts.SharedObjectNameEditPart;
import ciat.diagram.edit.parts.SociogramNameEditPart;
import ciat.diagram.edit.parts.SoftwareAgentName2EditPart;
import ciat.diagram.edit.parts.SoftwareAgentName3EditPart;
import ciat.diagram.edit.parts.SoftwareAgentName4EditPart;
import ciat.diagram.edit.parts.SoftwareAgentNameEditPart;
import ciat.diagram.edit.parts.SuspendResumeSrLabelEditPart;
import ciat.diagram.edit.parts.TeamName2EditPart;
import ciat.diagram.edit.parts.TeamName3EditPart;
import ciat.diagram.edit.parts.TeamName4EditPart;
import ciat.diagram.edit.parts.TeamNameEditPart;
import ciat.diagram.edit.parts.TemporalConditionName2EditPart;
import ciat.diagram.edit.parts.TemporalConditionNameEditPart;
import ciat.diagram.edit.parts.ToolNameEditPart;
import ciat.diagram.edit.parts.UndeterministicChoiceUcLabelEditPart;
import ciat.diagram.edit.parts.UserTaskNameEditPart;
import ciat.diagram.parsers.MessageFormatParser;
import ciat.diagram.part.CiatVisualIDRegistry;

/**
 * @generated
 */
public class CiatParserProvider extends AbstractProvider implements IParserProvider {

	/**
	* @generated
	*/
	private IParser sociogramName_5006Parser;

	/**
	* @generated
	*/
	private IParser getSociogramName_5006Parser() {
		if (sociogramName_5006Parser == null) {
			EAttribute[] features = new EAttribute[] { CiatPackage.eINSTANCE.getSociogram_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			sociogramName_5006Parser = parser;
		}
		return sociogramName_5006Parser;
	}

	/**
	* @generated
	*/
	private IParser processDiagramName_5044Parser;

	/**
	* @generated
	*/
	private IParser getProcessDiagramName_5044Parser() {
		if (processDiagramName_5044Parser == null) {
			EAttribute[] features = new EAttribute[] { CiatPackage.eINSTANCE.getProcessDiagram_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			processDiagramName_5044Parser = parser;
		}
		return processDiagramName_5044Parser;
	}

	/**
	* @generated
	*/
	private IParser domainDiagramName_5051Parser;

	/**
	* @generated
	*/
	private IParser getDomainDiagramName_5051Parser() {
		if (domainDiagramName_5051Parser == null) {
			EAttribute[] features = new EAttribute[] { CiatPackage.eINSTANCE.getDomainDiagram_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			domainDiagramName_5051Parser = parser;
		}
		return domainDiagramName_5051Parser;
	}

	/**
	* @generated
	*/
	private IParser cTTDiagramName_5060Parser;

	/**
	* @generated
	*/
	private IParser getCTTDiagramName_5060Parser() {
		if (cTTDiagramName_5060Parser == null) {
			EAttribute[] features = new EAttribute[] { CiatPackage.eINSTANCE.getCTTDiagram_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			cTTDiagramName_5060Parser = parser;
		}
		return cTTDiagramName_5060Parser;
	}

	/**
	* @generated
	*/
	private IParser rolName_5001Parser;

	/**
	* @generated
	*/
	private IParser getRolName_5001Parser() {
		if (rolName_5001Parser == null) {
			EAttribute[] features = new EAttribute[] { CiatPackage.eINSTANCE.getSociogramNode_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			rolName_5001Parser = parser;
		}
		return rolName_5001Parser;
	}

	/**
	* @generated
	*/
	private IParser actorName_5002Parser;

	/**
	* @generated
	*/
	private IParser getActorName_5002Parser() {
		if (actorName_5002Parser == null) {
			EAttribute[] features = new EAttribute[] { CiatPackage.eINSTANCE.getSociogramNode_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			actorName_5002Parser = parser;
		}
		return actorName_5002Parser;
	}

	/**
	* @generated
	*/
	private IParser softwareAgentName_5003Parser;

	/**
	* @generated
	*/
	private IParser getSoftwareAgentName_5003Parser() {
		if (softwareAgentName_5003Parser == null) {
			EAttribute[] features = new EAttribute[] { CiatPackage.eINSTANCE.getSociogramNode_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			softwareAgentName_5003Parser = parser;
		}
		return softwareAgentName_5003Parser;
	}

	/**
	* @generated
	*/
	private IParser teamName_5004Parser;

	/**
	* @generated
	*/
	private IParser getTeamName_5004Parser() {
		if (teamName_5004Parser == null) {
			EAttribute[] features = new EAttribute[] { CiatPackage.eINSTANCE.getSociogramNode_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			teamName_5004Parser = parser;
		}
		return teamName_5004Parser;
	}

	/**
	* @generated
	*/
	private IParser groupName_5005Parser;

	/**
	* @generated
	*/
	private IParser getGroupName_5005Parser() {
		if (groupName_5005Parser == null) {
			EAttribute[] features = new EAttribute[] { CiatPackage.eINSTANCE.getSociogramNode_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			groupName_5005Parser = parser;
		}
		return groupName_5005Parser;
	}

	/**
	* @generated
	*/
	private IParser individualTaskName_5014Parser;

	/**
	* @generated
	*/
	private IParser getIndividualTaskName_5014Parser() {
		if (individualTaskName_5014Parser == null) {
			EAttribute[] features = new EAttribute[] { CiatPackage.eINSTANCE.getSimpleTask_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			individualTaskName_5014Parser = parser;
		}
		return individualTaskName_5014Parser;
	}

	/**
	* @generated
	*/
	private IParser rolName_5007Parser;

	/**
	* @generated
	*/
	private IParser getRolName_5007Parser() {
		if (rolName_5007Parser == null) {
			EAttribute[] features = new EAttribute[] { CiatPackage.eINSTANCE.getSociogramNode_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			rolName_5007Parser = parser;
		}
		return rolName_5007Parser;
	}

	/**
	* @generated
	*/
	private IParser actorName_5008Parser;

	/**
	* @generated
	*/
	private IParser getActorName_5008Parser() {
		if (actorName_5008Parser == null) {
			EAttribute[] features = new EAttribute[] { CiatPackage.eINSTANCE.getSociogramNode_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			actorName_5008Parser = parser;
		}
		return actorName_5008Parser;
	}

	/**
	* @generated
	*/
	private IParser softwareAgentName_5009Parser;

	/**
	* @generated
	*/
	private IParser getSoftwareAgentName_5009Parser() {
		if (softwareAgentName_5009Parser == null) {
			EAttribute[] features = new EAttribute[] { CiatPackage.eINSTANCE.getSociogramNode_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			softwareAgentName_5009Parser = parser;
		}
		return softwareAgentName_5009Parser;
	}

	/**
	* @generated
	*/
	private IParser teamName_5010Parser;

	/**
	* @generated
	*/
	private IParser getTeamName_5010Parser() {
		if (teamName_5010Parser == null) {
			EAttribute[] features = new EAttribute[] { CiatPackage.eINSTANCE.getSociogramNode_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			teamName_5010Parser = parser;
		}
		return teamName_5010Parser;
	}

	/**
	* @generated
	*/
	private IParser groupName_5011Parser;

	/**
	* @generated
	*/
	private IParser getGroupName_5011Parser() {
		if (groupName_5011Parser == null) {
			EAttribute[] features = new EAttribute[] { CiatPackage.eINSTANCE.getSociogramNode_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			groupName_5011Parser = parser;
		}
		return groupName_5011Parser;
	}

	/**
	* @generated
	*/
	private IParser toolName_5012Parser;

	/**
	* @generated
	*/
	private IParser getToolName_5012Parser() {
		if (toolName_5012Parser == null) {
			EAttribute[] features = new EAttribute[] { CiatPackage.eINSTANCE.getTool_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			toolName_5012Parser = parser;
		}
		return toolName_5012Parser;
	}

	/**
	* @generated
	*/
	private IParser objectName_5013Parser;

	/**
	* @generated
	*/
	private IParser getObjectName_5013Parser() {
		if (objectName_5013Parser == null) {
			EAttribute[] features = new EAttribute[] { CiatPackage.eINSTANCE.getObject_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			objectName_5013Parser = parser;
		}
		return objectName_5013Parser;
	}

	/**
	* @generated
	*/
	private IParser cooperativeTaskName_5021Parser;

	/**
	* @generated
	*/
	private IParser getCooperativeTaskName_5021Parser() {
		if (cooperativeTaskName_5021Parser == null) {
			EAttribute[] features = new EAttribute[] { CiatPackage.eINSTANCE.getSimpleTask_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			cooperativeTaskName_5021Parser = parser;
		}
		return cooperativeTaskName_5021Parser;
	}

	/**
	* @generated
	*/
	private IParser rolName_5015Parser;

	/**
	* @generated
	*/
	private IParser getRolName_5015Parser() {
		if (rolName_5015Parser == null) {
			EAttribute[] features = new EAttribute[] { CiatPackage.eINSTANCE.getSociogramNode_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			rolName_5015Parser = parser;
		}
		return rolName_5015Parser;
	}

	/**
	* @generated
	*/
	private IParser actorName_5016Parser;

	/**
	* @generated
	*/
	private IParser getActorName_5016Parser() {
		if (actorName_5016Parser == null) {
			EAttribute[] features = new EAttribute[] { CiatPackage.eINSTANCE.getSociogramNode_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			actorName_5016Parser = parser;
		}
		return actorName_5016Parser;
	}

	/**
	* @generated
	*/
	private IParser softwareAgentName_5017Parser;

	/**
	* @generated
	*/
	private IParser getSoftwareAgentName_5017Parser() {
		if (softwareAgentName_5017Parser == null) {
			EAttribute[] features = new EAttribute[] { CiatPackage.eINSTANCE.getSociogramNode_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			softwareAgentName_5017Parser = parser;
		}
		return softwareAgentName_5017Parser;
	}

	/**
	* @generated
	*/
	private IParser teamName_5018Parser;

	/**
	* @generated
	*/
	private IParser getTeamName_5018Parser() {
		if (teamName_5018Parser == null) {
			EAttribute[] features = new EAttribute[] { CiatPackage.eINSTANCE.getSociogramNode_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			teamName_5018Parser = parser;
		}
		return teamName_5018Parser;
	}

	/**
	* @generated
	*/
	private IParser groupName_5019Parser;

	/**
	* @generated
	*/
	private IParser getGroupName_5019Parser() {
		if (groupName_5019Parser == null) {
			EAttribute[] features = new EAttribute[] { CiatPackage.eINSTANCE.getSociogramNode_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			groupName_5019Parser = parser;
		}
		return groupName_5019Parser;
	}

	/**
	* @generated
	*/
	private IParser objectName_5020Parser;

	/**
	* @generated
	*/
	private IParser getObjectName_5020Parser() {
		if (objectName_5020Parser == null) {
			EAttribute[] features = new EAttribute[] { CiatPackage.eINSTANCE.getObject_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			objectName_5020Parser = parser;
		}
		return objectName_5020Parser;
	}

	/**
	* @generated
	*/
	private IParser collaborativeTaskName_5028Parser;

	/**
	* @generated
	*/
	private IParser getCollaborativeTaskName_5028Parser() {
		if (collaborativeTaskName_5028Parser == null) {
			EAttribute[] features = new EAttribute[] { CiatPackage.eINSTANCE.getSimpleTask_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			collaborativeTaskName_5028Parser = parser;
		}
		return collaborativeTaskName_5028Parser;
	}

	/**
	* @generated
	*/
	private IParser rolName_5022Parser;

	/**
	* @generated
	*/
	private IParser getRolName_5022Parser() {
		if (rolName_5022Parser == null) {
			EAttribute[] features = new EAttribute[] { CiatPackage.eINSTANCE.getSociogramNode_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			rolName_5022Parser = parser;
		}
		return rolName_5022Parser;
	}

	/**
	* @generated
	*/
	private IParser actorName_5023Parser;

	/**
	* @generated
	*/
	private IParser getActorName_5023Parser() {
		if (actorName_5023Parser == null) {
			EAttribute[] features = new EAttribute[] { CiatPackage.eINSTANCE.getSociogramNode_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			actorName_5023Parser = parser;
		}
		return actorName_5023Parser;
	}

	/**
	* @generated
	*/
	private IParser softwareAgentName_5024Parser;

	/**
	* @generated
	*/
	private IParser getSoftwareAgentName_5024Parser() {
		if (softwareAgentName_5024Parser == null) {
			EAttribute[] features = new EAttribute[] { CiatPackage.eINSTANCE.getSociogramNode_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			softwareAgentName_5024Parser = parser;
		}
		return softwareAgentName_5024Parser;
	}

	/**
	* @generated
	*/
	private IParser teamName_5025Parser;

	/**
	* @generated
	*/
	private IParser getTeamName_5025Parser() {
		if (teamName_5025Parser == null) {
			EAttribute[] features = new EAttribute[] { CiatPackage.eINSTANCE.getSociogramNode_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			teamName_5025Parser = parser;
		}
		return teamName_5025Parser;
	}

	/**
	* @generated
	*/
	private IParser groupName_5026Parser;

	/**
	* @generated
	*/
	private IParser getGroupName_5026Parser() {
		if (groupName_5026Parser == null) {
			EAttribute[] features = new EAttribute[] { CiatPackage.eINSTANCE.getSociogramNode_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			groupName_5026Parser = parser;
		}
		return groupName_5026Parser;
	}

	/**
	* @generated
	*/
	private IParser objectName_5027Parser;

	/**
	* @generated
	*/
	private IParser getObjectName_5027Parser() {
		if (objectName_5027Parser == null) {
			EAttribute[] features = new EAttribute[] { CiatPackage.eINSTANCE.getObject_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			objectName_5027Parser = parser;
		}
		return objectName_5027Parser;
	}

	/**
	* @generated
	*/
	private IParser abstractTaskName_5038Parser;

	/**
	* @generated
	*/
	private IParser getAbstractTaskName_5038Parser() {
		if (abstractTaskName_5038Parser == null) {
			EAttribute[] features = new EAttribute[] { CiatPackage.eINSTANCE.getSimpleTask_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			abstractTaskName_5038Parser = parser;
		}
		return abstractTaskName_5038Parser;
	}

	/**
	* @generated
	*/
	private IParser individualTaskName_5029Parser;

	/**
	* @generated
	*/
	private IParser getIndividualTaskName_5029Parser() {
		if (individualTaskName_5029Parser == null) {
			EAttribute[] features = new EAttribute[] { CiatPackage.eINSTANCE.getSimpleTask_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			individualTaskName_5029Parser = parser;
		}
		return individualTaskName_5029Parser;
	}

	/**
	* @generated
	*/
	private IParser cooperativeTaskName_5030Parser;

	/**
	* @generated
	*/
	private IParser getCooperativeTaskName_5030Parser() {
		if (cooperativeTaskName_5030Parser == null) {
			EAttribute[] features = new EAttribute[] { CiatPackage.eINSTANCE.getSimpleTask_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			cooperativeTaskName_5030Parser = parser;
		}
		return cooperativeTaskName_5030Parser;
	}

	/**
	* @generated
	*/
	private IParser collaborativeTaskName_5031Parser;

	/**
	* @generated
	*/
	private IParser getCollaborativeTaskName_5031Parser() {
		if (collaborativeTaskName_5031Parser == null) {
			EAttribute[] features = new EAttribute[] { CiatPackage.eINSTANCE.getSimpleTask_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			collaborativeTaskName_5031Parser = parser;
		}
		return collaborativeTaskName_5031Parser;
	}

	/**
	* @generated
	*/
	private IParser abstractTaskName_5037Parser;

	/**
	* @generated
	*/
	private IParser getAbstractTaskName_5037Parser() {
		if (abstractTaskName_5037Parser == null) {
			EAttribute[] features = new EAttribute[] { CiatPackage.eINSTANCE.getSimpleTask_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			abstractTaskName_5037Parser = parser;
		}
		return abstractTaskName_5037Parser;
	}

	/**
	* @generated
	*/
	private IParser initName_5032Parser;

	/**
	* @generated
	*/
	private IParser getInitName_5032Parser() {
		if (initName_5032Parser == null) {
			EAttribute[] features = new EAttribute[] { CiatPackage.eINSTANCE.getInit_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			initName_5032Parser = parser;
		}
		return initName_5032Parser;
	}

	/**
	* @generated
	*/
	private IParser endName_5033Parser;

	/**
	* @generated
	*/
	private IParser getEndName_5033Parser() {
		if (endName_5033Parser == null) {
			EAttribute[] features = new EAttribute[] { CiatPackage.eINSTANCE.getEnd_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			endName_5033Parser = parser;
		}
		return endName_5033Parser;
	}

	/**
	* @generated
	*/
	private IParser temporalConditionName_5034Parser;

	/**
	* @generated
	*/
	private IParser getTemporalConditionName_5034Parser() {
		if (temporalConditionName_5034Parser == null) {
			EAttribute[] features = new EAttribute[] { CiatPackage.eINSTANCE.getTemporalCondition_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			temporalConditionName_5034Parser = parser;
		}
		return temporalConditionName_5034Parser;
	}

	/**
	* @generated
	*/
	private IParser notificationName_5035Parser;

	/**
	* @generated
	*/
	private IParser getNotificationName_5035Parser() {
		if (notificationName_5035Parser == null) {
			EAttribute[] features = new EAttribute[] { CiatPackage.eINSTANCE.getNotification_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			notificationName_5035Parser = parser;
		}
		return notificationName_5035Parser;
	}

	/**
	* @generated
	*/
	private IParser conditionName_5036Parser;

	/**
	* @generated
	*/
	private IParser getConditionName_5036Parser() {
		if (conditionName_5036Parser == null) {
			EAttribute[] features = new EAttribute[] { CiatPackage.eINSTANCE.getCondition_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			conditionName_5036Parser = parser;
		}
		return conditionName_5036Parser;
	}

	/**
	* @generated
	*/
	private IParser initName_5039Parser;

	/**
	* @generated
	*/
	private IParser getInitName_5039Parser() {
		if (initName_5039Parser == null) {
			EAttribute[] features = new EAttribute[] { CiatPackage.eINSTANCE.getInit_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			initName_5039Parser = parser;
		}
		return initName_5039Parser;
	}

	/**
	* @generated
	*/
	private IParser endName_5040Parser;

	/**
	* @generated
	*/
	private IParser getEndName_5040Parser() {
		if (endName_5040Parser == null) {
			EAttribute[] features = new EAttribute[] { CiatPackage.eINSTANCE.getEnd_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			endName_5040Parser = parser;
		}
		return endName_5040Parser;
	}

	/**
	* @generated
	*/
	private IParser temporalConditionName_5041Parser;

	/**
	* @generated
	*/
	private IParser getTemporalConditionName_5041Parser() {
		if (temporalConditionName_5041Parser == null) {
			EAttribute[] features = new EAttribute[] { CiatPackage.eINSTANCE.getTemporalCondition_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			temporalConditionName_5041Parser = parser;
		}
		return temporalConditionName_5041Parser;
	}

	/**
	* @generated
	*/
	private IParser notificationName_5042Parser;

	/**
	* @generated
	*/
	private IParser getNotificationName_5042Parser() {
		if (notificationName_5042Parser == null) {
			EAttribute[] features = new EAttribute[] { CiatPackage.eINSTANCE.getNotification_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			notificationName_5042Parser = parser;
		}
		return notificationName_5042Parser;
	}

	/**
	* @generated
	*/
	private IParser conditionName_5043Parser;

	/**
	* @generated
	*/
	private IParser getConditionName_5043Parser() {
		if (conditionName_5043Parser == null) {
			EAttribute[] features = new EAttribute[] { CiatPackage.eINSTANCE.getCondition_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			conditionName_5043Parser = parser;
		}
		return conditionName_5043Parser;
	}

	/**
	* @generated
	*/
	private IParser sharedObjectName_5050Parser;

	/**
	* @generated
	*/
	private IParser getSharedObjectName_5050Parser() {
		if (sharedObjectName_5050Parser == null) {
			EAttribute[] features = new EAttribute[] { CiatPackage.eINSTANCE.getSharedObject_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			sharedObjectName_5050Parser = parser;
		}
		return sharedObjectName_5050Parser;
	}

	/**
	* @generated
	*/
	private IParser exclusiveEditionAreaName_5045Parser;

	/**
	* @generated
	*/
	private IParser getExclusiveEditionAreaName_5045Parser() {
		if (exclusiveEditionAreaName_5045Parser == null) {
			EAttribute[] features = new EAttribute[] { CiatPackage.eINSTANCE.getVisualizationArea_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			exclusiveEditionAreaName_5045Parser = parser;
		}
		return exclusiveEditionAreaName_5045Parser;
	}

	/**
	* @generated
	*/
	private IParser collaborativeAreaName_5046Parser;

	/**
	* @generated
	*/
	private IParser getCollaborativeAreaName_5046Parser() {
		if (collaborativeAreaName_5046Parser == null) {
			EAttribute[] features = new EAttribute[] { CiatPackage.eINSTANCE.getVisualizationArea_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			collaborativeAreaName_5046Parser = parser;
		}
		return collaborativeAreaName_5046Parser;
	}

	/**
	* @generated
	*/
	private IParser individualAreaName_5047Parser;

	/**
	* @generated
	*/
	private IParser getIndividualAreaName_5047Parser() {
		if (individualAreaName_5047Parser == null) {
			EAttribute[] features = new EAttribute[] { CiatPackage.eINSTANCE.getVisualizationArea_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			individualAreaName_5047Parser = parser;
		}
		return individualAreaName_5047Parser;
	}

	/**
	* @generated
	*/
	private IParser attributeName_5048Parser;

	/**
	* @generated
	*/
	private IParser getAttributeName_5048Parser() {
		if (attributeName_5048Parser == null) {
			EAttribute[] features = new EAttribute[] { CiatPackage.eINSTANCE.getAttribute_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			attributeName_5048Parser = parser;
		}
		return attributeName_5048Parser;
	}

	/**
	* @generated
	*/
	private IParser operationName_5049Parser;

	/**
	* @generated
	*/
	private IParser getOperationName_5049Parser() {
		if (operationName_5049Parser == null) {
			EAttribute[] features = new EAttribute[] { CiatPackage.eINSTANCE.getOperation_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			operationName_5049Parser = parser;
		}
		return operationName_5049Parser;
	}

	/**
	* @generated
	*/
	private IParser exclusiveEditionName_5052Parser;

	/**
	* @generated
	*/
	private IParser getExclusiveEditionName_5052Parser() {
		if (exclusiveEditionName_5052Parser == null) {
			EAttribute[] features = new EAttribute[] { CiatPackage.eINSTANCE.getCTTTask_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			exclusiveEditionName_5052Parser = parser;
		}
		return exclusiveEditionName_5052Parser;
	}

	/**
	* @generated
	*/
	private IParser collaborativeVisualizationName_5053Parser;

	/**
	* @generated
	*/
	private IParser getCollaborativeVisualizationName_5053Parser() {
		if (collaborativeVisualizationName_5053Parser == null) {
			EAttribute[] features = new EAttribute[] { CiatPackage.eINSTANCE.getCTTTask_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			collaborativeVisualizationName_5053Parser = parser;
		}
		return collaborativeVisualizationName_5053Parser;
	}

	/**
	* @generated
	*/
	private IParser individualVisualizationName_5054Parser;

	/**
	* @generated
	*/
	private IParser getIndividualVisualizationName_5054Parser() {
		if (individualVisualizationName_5054Parser == null) {
			EAttribute[] features = new EAttribute[] { CiatPackage.eINSTANCE.getCTTTask_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			individualVisualizationName_5054Parser = parser;
		}
		return individualVisualizationName_5054Parser;
	}

	/**
	* @generated
	*/
	private IParser userTaskName_5055Parser;

	/**
	* @generated
	*/
	private IParser getUserTaskName_5055Parser() {
		if (userTaskName_5055Parser == null) {
			EAttribute[] features = new EAttribute[] { CiatPackage.eINSTANCE.getCTTTask_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			userTaskName_5055Parser = parser;
		}
		return userTaskName_5055Parser;
	}

	/**
	* @generated
	*/
	private IParser cTTAbstractTaskName_5056Parser;

	/**
	* @generated
	*/
	private IParser getCTTAbstractTaskName_5056Parser() {
		if (cTTAbstractTaskName_5056Parser == null) {
			EAttribute[] features = new EAttribute[] { CiatPackage.eINSTANCE.getCTTTask_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			cTTAbstractTaskName_5056Parser = parser;
		}
		return cTTAbstractTaskName_5056Parser;
	}

	/**
	* @generated
	*/
	private IParser interactiveTaskName_5057Parser;

	/**
	* @generated
	*/
	private IParser getInteractiveTaskName_5057Parser() {
		if (interactiveTaskName_5057Parser == null) {
			EAttribute[] features = new EAttribute[] { CiatPackage.eINSTANCE.getCTTTask_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			interactiveTaskName_5057Parser = parser;
		}
		return interactiveTaskName_5057Parser;
	}

	/**
	* @generated
	*/
	private IParser cTTCollaborativeTaskName_5058Parser;

	/**
	* @generated
	*/
	private IParser getCTTCollaborativeTaskName_5058Parser() {
		if (cTTCollaborativeTaskName_5058Parser == null) {
			EAttribute[] features = new EAttribute[] { CiatPackage.eINSTANCE.getCTTTask_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			cTTCollaborativeTaskName_5058Parser = parser;
		}
		return cTTCollaborativeTaskName_5058Parser;
	}

	/**
	* @generated
	*/
	private IParser applicationTaskName_5059Parser;

	/**
	* @generated
	*/
	private IParser getApplicationTaskName_5059Parser() {
		if (applicationTaskName_5059Parser == null) {
			EAttribute[] features = new EAttribute[] { CiatPackage.eINSTANCE.getCTTTask_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			applicationTaskName_5059Parser = parser;
		}
		return applicationTaskName_5059Parser;
	}

	/**
	* @generated
	*/
	private IParser inheritanceCondition_6001Parser;

	/**
	* @generated
	*/
	private IParser getInheritanceCondition_6001Parser() {
		if (inheritanceCondition_6001Parser == null) {
			EAttribute[] features = new EAttribute[] { CiatPackage.eINSTANCE.getInheritance_Condition() };
			MessageFormatParser parser = new MessageFormatParser(features);
			inheritanceCondition_6001Parser = parser;
		}
		return inheritanceCondition_6001Parser;
	}

	/**
	* @generated
	*/
	private IParser actingName_6002Parser;

	/**
	* @generated
	*/
	private IParser getActingName_6002Parser() {
		if (actingName_6002Parser == null) {
			EAttribute[] features = new EAttribute[] { CiatPackage.eINSTANCE.getActing_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			actingName_6002Parser = parser;
		}
		return actingName_6002Parser;
	}

	/**
	* @generated
	*/
	private IParser associationName_6003Parser;

	/**
	* @generated
	*/
	private IParser getAssociationName_6003Parser() {
		if (associationName_6003Parser == null) {
			EAttribute[] features = new EAttribute[] { CiatPackage.eINSTANCE.getAssociation_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			associationName_6003Parser = parser;
		}
		return associationName_6003Parser;
	}

	/**
	* @generated
	*/
	private IParser enablingELabel_6004Parser;

	/**
	* @generated
	*/
	private IParser getEnablingELabel_6004Parser() {
		if (enablingELabel_6004Parser == null) {
			EAttribute[] features = new EAttribute[] { CiatPackage.eINSTANCE.getEnabling_ELabel() };
			MessageFormatParser parser = new MessageFormatParser(features);
			enablingELabel_6004Parser = parser;
		}
		return enablingELabel_6004Parser;
	}

	/**
	* @generated
	*/
	private IParser disablingDLabel_6005Parser;

	/**
	* @generated
	*/
	private IParser getDisablingDLabel_6005Parser() {
		if (disablingDLabel_6005Parser == null) {
			EAttribute[] features = new EAttribute[] { CiatPackage.eINSTANCE.getDisabling_DLabel() };
			MessageFormatParser parser = new MessageFormatParser(features);
			disablingDLabel_6005Parser = parser;
		}
		return disablingDLabel_6005Parser;
	}

	/**
	* @generated
	*/
	private IParser enablingWithInformationPassingEwLabel_6006Parser;

	/**
	* @generated
	*/
	private IParser getEnablingWithInformationPassingEwLabel_6006Parser() {
		if (enablingWithInformationPassingEwLabel_6006Parser == null) {
			EAttribute[] features = new EAttribute[] {
					CiatPackage.eINSTANCE.getEnablingWithInformationPassing_EwLabel() };
			MessageFormatParser parser = new MessageFormatParser(features);
			enablingWithInformationPassingEwLabel_6006Parser = parser;
		}
		return enablingWithInformationPassingEwLabel_6006Parser;
	}

	/**
	* @generated
	*/
	private IParser disablingWithInformationPassingDwLabel_6007Parser;

	/**
	* @generated
	*/
	private IParser getDisablingWithInformationPassingDwLabel_6007Parser() {
		if (disablingWithInformationPassingDwLabel_6007Parser == null) {
			EAttribute[] features = new EAttribute[] {
					CiatPackage.eINSTANCE.getDisablingWithInformationPassing_DwLabel() };
			MessageFormatParser parser = new MessageFormatParser(features);
			disablingWithInformationPassingDwLabel_6007Parser = parser;
		}
		return disablingWithInformationPassingDwLabel_6007Parser;
	}

	/**
	* @generated
	*/
	private IParser independentConcurrencyIcLabel_6008Parser;

	/**
	* @generated
	*/
	private IParser getIndependentConcurrencyIcLabel_6008Parser() {
		if (independentConcurrencyIcLabel_6008Parser == null) {
			EAttribute[] features = new EAttribute[] { CiatPackage.eINSTANCE.getIndependentConcurrency_IcLabel() };
			MessageFormatParser parser = new MessageFormatParser(features);
			independentConcurrencyIcLabel_6008Parser = parser;
		}
		return independentConcurrencyIcLabel_6008Parser;
	}

	/**
	* @generated
	*/
	private IParser orderIndependenceOiLabel_6009Parser;

	/**
	* @generated
	*/
	private IParser getOrderIndependenceOiLabel_6009Parser() {
		if (orderIndependenceOiLabel_6009Parser == null) {
			EAttribute[] features = new EAttribute[] { CiatPackage.eINSTANCE.getOrderIndependence_OiLabel() };
			MessageFormatParser parser = new MessageFormatParser(features);
			orderIndependenceOiLabel_6009Parser = parser;
		}
		return orderIndependenceOiLabel_6009Parser;
	}

	/**
	* @generated
	*/
	private IParser suspendResumeSrLabel_6010Parser;

	/**
	* @generated
	*/
	private IParser getSuspendResumeSrLabel_6010Parser() {
		if (suspendResumeSrLabel_6010Parser == null) {
			EAttribute[] features = new EAttribute[] { CiatPackage.eINSTANCE.getSuspendResume_SrLabel() };
			MessageFormatParser parser = new MessageFormatParser(features);
			suspendResumeSrLabel_6010Parser = parser;
		}
		return suspendResumeSrLabel_6010Parser;
	}

	/**
	* @generated
	*/
	private IParser concurrencyWithInformationPassingCLabel_6011Parser;

	/**
	* @generated
	*/
	private IParser getConcurrencyWithInformationPassingCLabel_6011Parser() {
		if (concurrencyWithInformationPassingCLabel_6011Parser == null) {
			EAttribute[] features = new EAttribute[] {
					CiatPackage.eINSTANCE.getConcurrencyWithInformationPassing_CLabel() };
			MessageFormatParser parser = new MessageFormatParser(features);
			concurrencyWithInformationPassingCLabel_6011Parser = parser;
		}
		return concurrencyWithInformationPassingCLabel_6011Parser;
	}

	/**
	* @generated
	*/
	private IParser deterministicChoiceDtLabel_6012Parser;

	/**
	* @generated
	*/
	private IParser getDeterministicChoiceDtLabel_6012Parser() {
		if (deterministicChoiceDtLabel_6012Parser == null) {
			EAttribute[] features = new EAttribute[] { CiatPackage.eINSTANCE.getDeterministicChoice_DtLabel() };
			MessageFormatParser parser = new MessageFormatParser(features);
			deterministicChoiceDtLabel_6012Parser = parser;
		}
		return deterministicChoiceDtLabel_6012Parser;
	}

	/**
	* @generated
	*/
	private IParser undeterministicChoiceUcLabel_6013Parser;

	/**
	* @generated
	*/
	private IParser getUndeterministicChoiceUcLabel_6013Parser() {
		if (undeterministicChoiceUcLabel_6013Parser == null) {
			EAttribute[] features = new EAttribute[] { CiatPackage.eINSTANCE.getUndeterministicChoice_UcLabel() };
			MessageFormatParser parser = new MessageFormatParser(features);
			undeterministicChoiceUcLabel_6013Parser = parser;
		}
		return undeterministicChoiceUcLabel_6013Parser;
	}

	/**
	* @generated
	*/
	protected IParser getParser(int visualID) {
		switch (visualID) {
		case SociogramNameEditPart.VISUAL_ID:
			return getSociogramName_5006Parser();
		case ProcessDiagramNameEditPart.VISUAL_ID:
			return getProcessDiagramName_5044Parser();
		case DomainDiagramNameEditPart.VISUAL_ID:
			return getDomainDiagramName_5051Parser();
		case CTTDiagramNameEditPart.VISUAL_ID:
			return getCTTDiagramName_5060Parser();
		case RolNameEditPart.VISUAL_ID:
			return getRolName_5001Parser();
		case ActorNameEditPart.VISUAL_ID:
			return getActorName_5002Parser();
		case SoftwareAgentNameEditPart.VISUAL_ID:
			return getSoftwareAgentName_5003Parser();
		case TeamNameEditPart.VISUAL_ID:
			return getTeamName_5004Parser();
		case GroupNameEditPart.VISUAL_ID:
			return getGroupName_5005Parser();
		case IndividualTaskNameEditPart.VISUAL_ID:
			return getIndividualTaskName_5014Parser();
		case RolName2EditPart.VISUAL_ID:
			return getRolName_5007Parser();
		case ActorName2EditPart.VISUAL_ID:
			return getActorName_5008Parser();
		case SoftwareAgentName2EditPart.VISUAL_ID:
			return getSoftwareAgentName_5009Parser();
		case TeamName2EditPart.VISUAL_ID:
			return getTeamName_5010Parser();
		case GroupName2EditPart.VISUAL_ID:
			return getGroupName_5011Parser();
		case ToolNameEditPart.VISUAL_ID:
			return getToolName_5012Parser();
		case ObjectNameEditPart.VISUAL_ID:
			return getObjectName_5013Parser();
		case CooperativeTaskNameEditPart.VISUAL_ID:
			return getCooperativeTaskName_5021Parser();
		case RolName3EditPart.VISUAL_ID:
			return getRolName_5015Parser();
		case ActorName3EditPart.VISUAL_ID:
			return getActorName_5016Parser();
		case SoftwareAgentName3EditPart.VISUAL_ID:
			return getSoftwareAgentName_5017Parser();
		case TeamName3EditPart.VISUAL_ID:
			return getTeamName_5018Parser();
		case GroupName3EditPart.VISUAL_ID:
			return getGroupName_5019Parser();
		case ObjectName2EditPart.VISUAL_ID:
			return getObjectName_5020Parser();
		case CollaborativeTaskNameEditPart.VISUAL_ID:
			return getCollaborativeTaskName_5028Parser();
		case RolName4EditPart.VISUAL_ID:
			return getRolName_5022Parser();
		case ActorName4EditPart.VISUAL_ID:
			return getActorName_5023Parser();
		case SoftwareAgentName4EditPart.VISUAL_ID:
			return getSoftwareAgentName_5024Parser();
		case TeamName4EditPart.VISUAL_ID:
			return getTeamName_5025Parser();
		case GroupName4EditPart.VISUAL_ID:
			return getGroupName_5026Parser();
		case ObjectName3EditPart.VISUAL_ID:
			return getObjectName_5027Parser();
		case AbstractTaskNameEditPart.VISUAL_ID:
			return getAbstractTaskName_5038Parser();
		case IndividualTaskName2EditPart.VISUAL_ID:
			return getIndividualTaskName_5029Parser();
		case CooperativeTaskName2EditPart.VISUAL_ID:
			return getCooperativeTaskName_5030Parser();
		case CollaborativeTaskName2EditPart.VISUAL_ID:
			return getCollaborativeTaskName_5031Parser();
		case AbstractTaskName2EditPart.VISUAL_ID:
			return getAbstractTaskName_5037Parser();
		case InitNameEditPart.VISUAL_ID:
			return getInitName_5032Parser();
		case EndNameEditPart.VISUAL_ID:
			return getEndName_5033Parser();
		case TemporalConditionNameEditPart.VISUAL_ID:
			return getTemporalConditionName_5034Parser();
		case NotificationNameEditPart.VISUAL_ID:
			return getNotificationName_5035Parser();
		case ConditionNameEditPart.VISUAL_ID:
			return getConditionName_5036Parser();
		case InitName2EditPart.VISUAL_ID:
			return getInitName_5039Parser();
		case EndName2EditPart.VISUAL_ID:
			return getEndName_5040Parser();
		case TemporalConditionName2EditPart.VISUAL_ID:
			return getTemporalConditionName_5041Parser();
		case NotificationName2EditPart.VISUAL_ID:
			return getNotificationName_5042Parser();
		case ConditionName2EditPart.VISUAL_ID:
			return getConditionName_5043Parser();
		case SharedObjectNameEditPart.VISUAL_ID:
			return getSharedObjectName_5050Parser();
		case ExclusiveEditionAreaNameEditPart.VISUAL_ID:
			return getExclusiveEditionAreaName_5045Parser();
		case CollaborativeAreaNameEditPart.VISUAL_ID:
			return getCollaborativeAreaName_5046Parser();
		case IndividualAreaNameEditPart.VISUAL_ID:
			return getIndividualAreaName_5047Parser();
		case AttributeNameEditPart.VISUAL_ID:
			return getAttributeName_5048Parser();
		case OperationNameEditPart.VISUAL_ID:
			return getOperationName_5049Parser();
		case ExclusiveEditionNameEditPart.VISUAL_ID:
			return getExclusiveEditionName_5052Parser();
		case CollaborativeVisualizationNameEditPart.VISUAL_ID:
			return getCollaborativeVisualizationName_5053Parser();
		case IndividualVisualizationNameEditPart.VISUAL_ID:
			return getIndividualVisualizationName_5054Parser();
		case UserTaskNameEditPart.VISUAL_ID:
			return getUserTaskName_5055Parser();
		case CTTAbstractTaskNameEditPart.VISUAL_ID:
			return getCTTAbstractTaskName_5056Parser();
		case InteractiveTaskNameEditPart.VISUAL_ID:
			return getInteractiveTaskName_5057Parser();
		case CTTCollaborativeTaskNameEditPart.VISUAL_ID:
			return getCTTCollaborativeTaskName_5058Parser();
		case ApplicationTaskNameEditPart.VISUAL_ID:
			return getApplicationTaskName_5059Parser();
		case InheritanceConditionEditPart.VISUAL_ID:
			return getInheritanceCondition_6001Parser();
		case ActingNameEditPart.VISUAL_ID:
			return getActingName_6002Parser();
		case AssociationNameEditPart.VISUAL_ID:
			return getAssociationName_6003Parser();
		case EnablingELabelEditPart.VISUAL_ID:
			return getEnablingELabel_6004Parser();
		case DisablingDLabelEditPart.VISUAL_ID:
			return getDisablingDLabel_6005Parser();
		case EnablingWithInformationPassingEwLabelEditPart.VISUAL_ID:
			return getEnablingWithInformationPassingEwLabel_6006Parser();
		case DisablingWithInformationPassingDwLabelEditPart.VISUAL_ID:
			return getDisablingWithInformationPassingDwLabel_6007Parser();
		case IndependentConcurrencyIcLabelEditPart.VISUAL_ID:
			return getIndependentConcurrencyIcLabel_6008Parser();
		case OrderIndependenceOiLabelEditPart.VISUAL_ID:
			return getOrderIndependenceOiLabel_6009Parser();
		case SuspendResumeSrLabelEditPart.VISUAL_ID:
			return getSuspendResumeSrLabel_6010Parser();
		case ConcurrencyWithInformationPassingCLabelEditPart.VISUAL_ID:
			return getConcurrencyWithInformationPassingCLabel_6011Parser();
		case DeterministicChoiceDtLabelEditPart.VISUAL_ID:
			return getDeterministicChoiceDtLabel_6012Parser();
		case UndeterministicChoiceUcLabelEditPart.VISUAL_ID:
			return getUndeterministicChoiceUcLabel_6013Parser();
		}
		return null;
	}

	/**
	* Utility method that consults ParserService
	* @generated
	*/
	public static IParser getParser(IElementType type, EObject object, String parserHint) {
		return ParserService.getInstance().getParser(new HintAdapter(type, object, parserHint));
	}

	/**
	* @generated
	*/
	public IParser getParser(IAdaptable hint) {
		String vid = (String) hint.getAdapter(String.class);
		if (vid != null) {
			return getParser(CiatVisualIDRegistry.getVisualID(vid));
		}
		View view = (View) hint.getAdapter(View.class);
		if (view != null) {
			return getParser(CiatVisualIDRegistry.getVisualID(view));
		}
		return null;
	}

	/**
	* @generated
	*/
	public boolean provides(IOperation operation) {
		if (operation instanceof GetParserOperation) {
			IAdaptable hint = ((GetParserOperation) operation).getHint();
			if (CiatElementTypes.getElement(hint) == null) {
				return false;
			}
			return getParser(hint) != null;
		}
		return false;
	}

	/**
	* @generated
	*/
	private static class HintAdapter extends ParserHintAdapter {

		/**
		* @generated
		*/
		private final IElementType elementType;

		/**
		* @generated
		*/
		public HintAdapter(IElementType type, EObject object, String parserHint) {
			super(object, parserHint);
			assert type != null;
			elementType = type;
		}

		/**
		* @generated
		*/
		public Object getAdapter(Class adapter) {
			if (IElementType.class.equals(adapter)) {
				return elementType;
			}
			return super.getAdapter(adapter);
		}
	}

}
