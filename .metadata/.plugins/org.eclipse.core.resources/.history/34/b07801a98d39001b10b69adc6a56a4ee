/**
 */
package ciat.util;

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
import ciat.CollaborativeArea;
import ciat.CollaborativeTask;
import ciat.CollaborativeVisualization;
import ciat.ConcurrencyWithInformationPassing;
import ciat.Condition;
import ciat.CooperativeTask;
import ciat.Dependency;
import ciat.DependencyElement;
import ciat.DeterministicChoice;
import ciat.Disabling;
import ciat.DisablingWithInformationPassing;
import ciat.DomainDiagram;
import ciat.Enabling;
import ciat.EnablingWithInformationPassing;
import ciat.End;
import ciat.ExclusiveEdition;
import ciat.ExclusiveEditionArea;
import ciat.Group;
import ciat.IndependentConcurrency;
import ciat.IndividualArea;
import ciat.IndividualTask;
import ciat.IndividualVisualization;
import ciat.Inheritance;
import ciat.Init;
import ciat.InteractiveTask;
import ciat.Link;
import ciat.Notification;
import ciat.Operation;
import ciat.OrderIndependence;
import ciat.ProcessDiagram;
import ciat.ProcessNode;
import ciat.Rol;
import ciat.ShAggregationLink;
import ciat.ShAssociationLink;
import ciat.ShGeneralizationLink;
import ciat.SharedLink;
import ciat.SharedObject;
import ciat.SimpleTask;
import ciat.Sociogram;
import ciat.SociogramLink;
import ciat.SociogramNode;
import ciat.SoftwareAgent;
import ciat.SuspendResume;
import ciat.Team;
import ciat.TemporalCondition;
import ciat.Tool;
import ciat.UndeterministicChoice;
import ciat.UserTask;
import ciat.VisualizationArea;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see ciat.CiatPackage
 * @generated
 */
public class CiatSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static CiatPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CiatSwitch() {
		if (modelPackage == null) {
			modelPackage = CiatPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case CiatPackage.CIAT_DIAGRAM: {
				CIATDiagram ciatDiagram = (CIATDiagram)theEObject;
				T result = caseCIATDiagram(ciatDiagram);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CiatPackage.LINK: {
				Link link = (Link)theEObject;
				T result = caseLink(link);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CiatPackage.SOCIOGRAM: {
				Sociogram sociogram = (Sociogram)theEObject;
				T result = caseSociogram(sociogram);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CiatPackage.SOCIOGRAM_NODE: {
				SociogramNode sociogramNode = (SociogramNode)theEObject;
				T result = caseSociogramNode(sociogramNode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CiatPackage.ROL: {
				Rol rol = (Rol)theEObject;
				T result = caseRol(rol);
				if (result == null) result = caseSociogramNode(rol);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CiatPackage.ACTOR: {
				Actor actor = (Actor)theEObject;
				T result = caseActor(actor);
				if (result == null) result = caseSociogramNode(actor);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CiatPackage.SOFTWARE_AGENT: {
				SoftwareAgent softwareAgent = (SoftwareAgent)theEObject;
				T result = caseSoftwareAgent(softwareAgent);
				if (result == null) result = caseSociogramNode(softwareAgent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CiatPackage.TEAM: {
				Team team = (Team)theEObject;
				T result = caseTeam(team);
				if (result == null) result = caseSociogramNode(team);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CiatPackage.GROUP: {
				Group group = (Group)theEObject;
				T result = caseGroup(group);
				if (result == null) result = caseSociogramNode(group);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CiatPackage.SOCIOGRAM_LINK: {
				SociogramLink sociogramLink = (SociogramLink)theEObject;
				T result = caseSociogramLink(sociogramLink);
				if (result == null) result = caseLink(sociogramLink);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CiatPackage.INHERITANCE: {
				Inheritance inheritance = (Inheritance)theEObject;
				T result = caseInheritance(inheritance);
				if (result == null) result = caseSociogramLink(inheritance);
				if (result == null) result = caseLink(inheritance);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CiatPackage.ACTING: {
				Acting acting = (Acting)theEObject;
				T result = caseActing(acting);
				if (result == null) result = caseSociogramLink(acting);
				if (result == null) result = caseLink(acting);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CiatPackage.ASSOCIATION: {
				Association association = (Association)theEObject;
				T result = caseAssociation(association);
				if (result == null) result = caseSociogramLink(association);
				if (result == null) result = caseLink(association);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CiatPackage.PROCESS_DIAGRAM: {
				ProcessDiagram processDiagram = (ProcessDiagram)theEObject;
				T result = caseProcessDiagram(processDiagram);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CiatPackage.PROCESS_NODE: {
				ProcessNode processNode = (ProcessNode)theEObject;
				T result = caseProcessNode(processNode);
				if (result == null) result = caseDependencyElement(processNode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CiatPackage.INIT: {
				Init init = (Init)theEObject;
				T result = caseInit(init);
				if (result == null) result = caseProcessNode(init);
				if (result == null) result = caseDependencyElement(init);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CiatPackage.END: {
				End end = (End)theEObject;
				T result = caseEnd(end);
				if (result == null) result = caseProcessNode(end);
				if (result == null) result = caseDependencyElement(end);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CiatPackage.SIMPLE_TASK: {
				SimpleTask simpleTask = (SimpleTask)theEObject;
				T result = caseSimpleTask(simpleTask);
				if (result == null) result = caseProcessNode(simpleTask);
				if (result == null) result = caseDependencyElement(simpleTask);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CiatPackage.INDIVIDUAL_TASK: {
				IndividualTask individualTask = (IndividualTask)theEObject;
				T result = caseIndividualTask(individualTask);
				if (result == null) result = caseSimpleTask(individualTask);
				if (result == null) result = caseProcessNode(individualTask);
				if (result == null) result = caseDependencyElement(individualTask);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CiatPackage.COOPERATIVE_TASK: {
				CooperativeTask cooperativeTask = (CooperativeTask)theEObject;
				T result = caseCooperativeTask(cooperativeTask);
				if (result == null) result = caseSimpleTask(cooperativeTask);
				if (result == null) result = caseProcessNode(cooperativeTask);
				if (result == null) result = caseDependencyElement(cooperativeTask);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CiatPackage.COLLABORATIVE_TASK: {
				CollaborativeTask collaborativeTask = (CollaborativeTask)theEObject;
				T result = caseCollaborativeTask(collaborativeTask);
				if (result == null) result = caseSimpleTask(collaborativeTask);
				if (result == null) result = caseProcessNode(collaborativeTask);
				if (result == null) result = caseDependencyElement(collaborativeTask);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CiatPackage.ABSTRACT_TASK: {
				AbstractTask abstractTask = (AbstractTask)theEObject;
				T result = caseAbstractTask(abstractTask);
				if (result == null) result = caseSimpleTask(abstractTask);
				if (result == null) result = caseProcessNode(abstractTask);
				if (result == null) result = caseDependencyElement(abstractTask);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CiatPackage.TOOL: {
				Tool tool = (Tool)theEObject;
				T result = caseTool(tool);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CiatPackage.OBJECT: {
				ciat.Object object = (ciat.Object)theEObject;
				T result = caseObject(object);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CiatPackage.TEMPORAL_CONDITION: {
				TemporalCondition temporalCondition = (TemporalCondition)theEObject;
				T result = caseTemporalCondition(temporalCondition);
				if (result == null) result = caseProcessNode(temporalCondition);
				if (result == null) result = caseDependencyElement(temporalCondition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CiatPackage.NOTIFICATION: {
				Notification notification = (Notification)theEObject;
				T result = caseNotification(notification);
				if (result == null) result = caseProcessNode(notification);
				if (result == null) result = caseDependencyElement(notification);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CiatPackage.CONDITION: {
				Condition condition = (Condition)theEObject;
				T result = caseCondition(condition);
				if (result == null) result = caseProcessNode(condition);
				if (result == null) result = caseDependencyElement(condition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CiatPackage.DOMAIN_DIAGRAM: {
				DomainDiagram domainDiagram = (DomainDiagram)theEObject;
				T result = caseDomainDiagram(domainDiagram);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CiatPackage.SHARED_OBJECT: {
				SharedObject sharedObject = (SharedObject)theEObject;
				T result = caseSharedObject(sharedObject);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CiatPackage.VISUALIZATION_AREA: {
				VisualizationArea visualizationArea = (VisualizationArea)theEObject;
				T result = caseVisualizationArea(visualizationArea);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CiatPackage.EXCLUSIVE_EDITION_AREA: {
				ExclusiveEditionArea exclusiveEditionArea = (ExclusiveEditionArea)theEObject;
				T result = caseExclusiveEditionArea(exclusiveEditionArea);
				if (result == null) result = caseVisualizationArea(exclusiveEditionArea);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CiatPackage.COLLABORATIVE_AREA: {
				CollaborativeArea collaborativeArea = (CollaborativeArea)theEObject;
				T result = caseCollaborativeArea(collaborativeArea);
				if (result == null) result = caseVisualizationArea(collaborativeArea);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CiatPackage.INDIVIDUAL_AREA: {
				IndividualArea individualArea = (IndividualArea)theEObject;
				T result = caseIndividualArea(individualArea);
				if (result == null) result = caseVisualizationArea(individualArea);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CiatPackage.ATTRIBUTE: {
				Attribute attribute = (Attribute)theEObject;
				T result = caseAttribute(attribute);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CiatPackage.OPERATION: {
				Operation operation = (Operation)theEObject;
				T result = caseOperation(operation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CiatPackage.SHARED_LINK: {
				SharedLink sharedLink = (SharedLink)theEObject;
				T result = caseSharedLink(sharedLink);
				if (result == null) result = caseLink(sharedLink);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CiatPackage.SH_ASSOCIATION_LINK: {
				ShAssociationLink shAssociationLink = (ShAssociationLink)theEObject;
				T result = caseShAssociationLink(shAssociationLink);
				if (result == null) result = caseSharedLink(shAssociationLink);
				if (result == null) result = caseLink(shAssociationLink);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CiatPackage.SH_GENERALIZATION_LINK: {
				ShGeneralizationLink shGeneralizationLink = (ShGeneralizationLink)theEObject;
				T result = caseShGeneralizationLink(shGeneralizationLink);
				if (result == null) result = caseSharedLink(shGeneralizationLink);
				if (result == null) result = caseLink(shGeneralizationLink);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CiatPackage.SH_AGGREGATION_LINK: {
				ShAggregationLink shAggregationLink = (ShAggregationLink)theEObject;
				T result = caseShAggregationLink(shAggregationLink);
				if (result == null) result = caseSharedLink(shAggregationLink);
				if (result == null) result = caseLink(shAggregationLink);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CiatPackage.CTT_DIAGRAM: {
				CTTDiagram cttDiagram = (CTTDiagram)theEObject;
				T result = caseCTTDiagram(cttDiagram);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CiatPackage.CTT_TASK: {
				CTTTask cttTask = (CTTTask)theEObject;
				T result = caseCTTTask(cttTask);
				if (result == null) result = caseDependencyElement(cttTask);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CiatPackage.EXCLUSIVE_EDITION: {
				ExclusiveEdition exclusiveEdition = (ExclusiveEdition)theEObject;
				T result = caseExclusiveEdition(exclusiveEdition);
				if (result == null) result = caseCTTTask(exclusiveEdition);
				if (result == null) result = caseDependencyElement(exclusiveEdition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CiatPackage.COLLABORATIVE_VISUALIZATION: {
				CollaborativeVisualization collaborativeVisualization = (CollaborativeVisualization)theEObject;
				T result = caseCollaborativeVisualization(collaborativeVisualization);
				if (result == null) result = caseCTTTask(collaborativeVisualization);
				if (result == null) result = caseDependencyElement(collaborativeVisualization);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CiatPackage.INDIVIDUAL_VISUALIZATION: {
				IndividualVisualization individualVisualization = (IndividualVisualization)theEObject;
				T result = caseIndividualVisualization(individualVisualization);
				if (result == null) result = caseCTTTask(individualVisualization);
				if (result == null) result = caseDependencyElement(individualVisualization);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CiatPackage.USER_TASK: {
				UserTask userTask = (UserTask)theEObject;
				T result = caseUserTask(userTask);
				if (result == null) result = caseCTTTask(userTask);
				if (result == null) result = caseDependencyElement(userTask);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CiatPackage.CTT_ABSTRACT_TASK: {
				CTTAbstractTask cttAbstractTask = (CTTAbstractTask)theEObject;
				T result = caseCTTAbstractTask(cttAbstractTask);
				if (result == null) result = caseCTTTask(cttAbstractTask);
				if (result == null) result = caseDependencyElement(cttAbstractTask);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CiatPackage.INTERACTIVE_TASK: {
				InteractiveTask interactiveTask = (InteractiveTask)theEObject;
				T result = caseInteractiveTask(interactiveTask);
				if (result == null) result = caseCTTTask(interactiveTask);
				if (result == null) result = caseDependencyElement(interactiveTask);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CiatPackage.CTT_COLLABORATIVE_TASK: {
				CTTCollaborativeTask cttCollaborativeTask = (CTTCollaborativeTask)theEObject;
				T result = caseCTTCollaborativeTask(cttCollaborativeTask);
				if (result == null) result = caseCTTTask(cttCollaborativeTask);
				if (result == null) result = caseDependencyElement(cttCollaborativeTask);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CiatPackage.APPLICATION_TASK: {
				ApplicationTask applicationTask = (ApplicationTask)theEObject;
				T result = caseApplicationTask(applicationTask);
				if (result == null) result = caseCTTTask(applicationTask);
				if (result == null) result = caseDependencyElement(applicationTask);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CiatPackage.DEPENDENCY_ELEMENT: {
				DependencyElement dependencyElement = (DependencyElement)theEObject;
				T result = caseDependencyElement(dependencyElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CiatPackage.DEPENDENCY: {
				Dependency dependency = (Dependency)theEObject;
				T result = caseDependency(dependency);
				if (result == null) result = caseLink(dependency);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CiatPackage.AGGREGATION: {
				Aggregation aggregation = (Aggregation)theEObject;
				T result = caseAggregation(aggregation);
				if (result == null) result = caseDependency(aggregation);
				if (result == null) result = caseLink(aggregation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CiatPackage.ENABLING: {
				Enabling enabling = (Enabling)theEObject;
				T result = caseEnabling(enabling);
				if (result == null) result = caseDependency(enabling);
				if (result == null) result = caseLink(enabling);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CiatPackage.DISABLING: {
				Disabling disabling = (Disabling)theEObject;
				T result = caseDisabling(disabling);
				if (result == null) result = caseDependency(disabling);
				if (result == null) result = caseLink(disabling);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CiatPackage.ENABLING_WITH_INFORMATION_PASSING: {
				EnablingWithInformationPassing enablingWithInformationPassing = (EnablingWithInformationPassing)theEObject;
				T result = caseEnablingWithInformationPassing(enablingWithInformationPassing);
				if (result == null) result = caseDependency(enablingWithInformationPassing);
				if (result == null) result = caseLink(enablingWithInformationPassing);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CiatPackage.DISABLING_WITH_INFORMATION_PASSING: {
				DisablingWithInformationPassing disablingWithInformationPassing = (DisablingWithInformationPassing)theEObject;
				T result = caseDisablingWithInformationPassing(disablingWithInformationPassing);
				if (result == null) result = caseDependency(disablingWithInformationPassing);
				if (result == null) result = caseLink(disablingWithInformationPassing);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CiatPackage.INDEPENDENT_CONCURRENCY: {
				IndependentConcurrency independentConcurrency = (IndependentConcurrency)theEObject;
				T result = caseIndependentConcurrency(independentConcurrency);
				if (result == null) result = caseDependency(independentConcurrency);
				if (result == null) result = caseLink(independentConcurrency);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CiatPackage.ORDER_INDEPENDENCE: {
				OrderIndependence orderIndependence = (OrderIndependence)theEObject;
				T result = caseOrderIndependence(orderIndependence);
				if (result == null) result = caseDependency(orderIndependence);
				if (result == null) result = caseLink(orderIndependence);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CiatPackage.SUSPEND_RESUME: {
				SuspendResume suspendResume = (SuspendResume)theEObject;
				T result = caseSuspendResume(suspendResume);
				if (result == null) result = caseDependency(suspendResume);
				if (result == null) result = caseLink(suspendResume);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CiatPackage.CONCURRENCY_WITH_INFORMATION_PASSING: {
				ConcurrencyWithInformationPassing concurrencyWithInformationPassing = (ConcurrencyWithInformationPassing)theEObject;
				T result = caseConcurrencyWithInformationPassing(concurrencyWithInformationPassing);
				if (result == null) result = caseDependency(concurrencyWithInformationPassing);
				if (result == null) result = caseLink(concurrencyWithInformationPassing);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CiatPackage.DETERMINISTIC_CHOICE: {
				DeterministicChoice deterministicChoice = (DeterministicChoice)theEObject;
				T result = caseDeterministicChoice(deterministicChoice);
				if (result == null) result = caseDependency(deterministicChoice);
				if (result == null) result = caseLink(deterministicChoice);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CiatPackage.UNDETERMINISTIC_CHOICE: {
				UndeterministicChoice undeterministicChoice = (UndeterministicChoice)theEObject;
				T result = caseUndeterministicChoice(undeterministicChoice);
				if (result == null) result = caseDependency(undeterministicChoice);
				if (result == null) result = caseLink(undeterministicChoice);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>CIAT Diagram</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>CIAT Diagram</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCIATDiagram(CIATDiagram object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Link</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Link</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLink(Link object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sociogram</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sociogram</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSociogram(Sociogram object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sociogram Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sociogram Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSociogramNode(SociogramNode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Rol</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Rol</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRol(Rol object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Actor</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Actor</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseActor(Actor object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Software Agent</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Software Agent</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSoftwareAgent(SoftwareAgent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Team</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Team</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTeam(Team object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Group</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Group</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGroup(Group object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sociogram Link</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sociogram Link</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSociogramLink(SociogramLink object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Inheritance</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Inheritance</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInheritance(Inheritance object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Acting</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Acting</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseActing(Acting object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Association</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Association</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAssociation(Association object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Process Diagram</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Process Diagram</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProcessDiagram(ProcessDiagram object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Process Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Process Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProcessNode(ProcessNode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Init</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Init</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInit(Init object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>End</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>End</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEnd(End object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Simple Task</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Simple Task</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSimpleTask(SimpleTask object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Individual Task</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Individual Task</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIndividualTask(IndividualTask object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Cooperative Task</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Cooperative Task</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCooperativeTask(CooperativeTask object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Collaborative Task</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Collaborative Task</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCollaborativeTask(CollaborativeTask object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Task</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Task</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractTask(AbstractTask object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Tool</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Tool</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTool(Tool object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Object</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Object</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseObject(ciat.Object object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Temporal Condition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Temporal Condition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTemporalCondition(TemporalCondition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Notification</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Notification</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNotification(Notification object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Condition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Condition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCondition(Condition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Domain Diagram</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Domain Diagram</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDomainDiagram(DomainDiagram object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Shared Object</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Shared Object</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSharedObject(SharedObject object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Visualization Area</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Visualization Area</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVisualizationArea(VisualizationArea object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Exclusive Edition Area</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Exclusive Edition Area</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExclusiveEditionArea(ExclusiveEditionArea object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Collaborative Area</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Collaborative Area</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCollaborativeArea(CollaborativeArea object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Individual Area</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Individual Area</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIndividualArea(IndividualArea object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Attribute</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Attribute</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAttribute(Attribute object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Operation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Operation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOperation(Operation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Shared Link</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Shared Link</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSharedLink(SharedLink object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sh Association Link</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sh Association Link</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseShAssociationLink(ShAssociationLink object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sh Generalization Link</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sh Generalization Link</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseShGeneralizationLink(ShGeneralizationLink object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sh Aggregation Link</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sh Aggregation Link</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseShAggregationLink(ShAggregationLink object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>CTT Diagram</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>CTT Diagram</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCTTDiagram(CTTDiagram object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>CTT Task</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>CTT Task</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCTTTask(CTTTask object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Exclusive Edition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Exclusive Edition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExclusiveEdition(ExclusiveEdition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Collaborative Visualization</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Collaborative Visualization</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCollaborativeVisualization(CollaborativeVisualization object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Individual Visualization</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Individual Visualization</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIndividualVisualization(IndividualVisualization object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>User Task</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>User Task</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUserTask(UserTask object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>CTT Abstract Task</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>CTT Abstract Task</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCTTAbstractTask(CTTAbstractTask object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Interactive Task</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Interactive Task</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInteractiveTask(InteractiveTask object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>CTT Collaborative Task</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>CTT Collaborative Task</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCTTCollaborativeTask(CTTCollaborativeTask object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Application Task</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Application Task</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseApplicationTask(ApplicationTask object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Dependency Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Dependency Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDependencyElement(DependencyElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Dependency</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Dependency</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDependency(Dependency object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Aggregation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Aggregation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAggregation(Aggregation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Enabling</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Enabling</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEnabling(Enabling object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Disabling</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Disabling</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDisabling(Disabling object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Enabling With Information Passing</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Enabling With Information Passing</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEnablingWithInformationPassing(EnablingWithInformationPassing object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Disabling With Information Passing</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Disabling With Information Passing</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDisablingWithInformationPassing(DisablingWithInformationPassing object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Independent Concurrency</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Independent Concurrency</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIndependentConcurrency(IndependentConcurrency object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Order Independence</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Order Independence</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOrderIndependence(OrderIndependence object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Suspend Resume</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Suspend Resume</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSuspendResume(SuspendResume object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Concurrency With Information Passing</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Concurrency With Information Passing</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConcurrencyWithInformationPassing(ConcurrencyWithInformationPassing object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Deterministic Choice</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Deterministic Choice</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDeterministicChoice(DeterministicChoice object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Undeterministic Choice</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Undeterministic Choice</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUndeterministicChoice(UndeterministicChoice object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //CiatSwitch
