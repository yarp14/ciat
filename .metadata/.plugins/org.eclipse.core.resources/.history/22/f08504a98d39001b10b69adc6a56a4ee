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

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see ciat.CiatPackage
 * @generated
 */
public class CiatAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static CiatPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CiatAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = CiatPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CiatSwitch<Adapter> modelSwitch =
		new CiatSwitch<Adapter>() {
			@Override
			public Adapter caseCIATDiagram(CIATDiagram object) {
				return createCIATDiagramAdapter();
			}
			@Override
			public Adapter caseLink(Link object) {
				return createLinkAdapter();
			}
			@Override
			public Adapter caseSociogram(Sociogram object) {
				return createSociogramAdapter();
			}
			@Override
			public Adapter caseSociogramNode(SociogramNode object) {
				return createSociogramNodeAdapter();
			}
			@Override
			public Adapter caseRol(Rol object) {
				return createRolAdapter();
			}
			@Override
			public Adapter caseActor(Actor object) {
				return createActorAdapter();
			}
			@Override
			public Adapter caseSoftwareAgent(SoftwareAgent object) {
				return createSoftwareAgentAdapter();
			}
			@Override
			public Adapter caseTeam(Team object) {
				return createTeamAdapter();
			}
			@Override
			public Adapter caseGroup(Group object) {
				return createGroupAdapter();
			}
			@Override
			public Adapter caseSociogramLink(SociogramLink object) {
				return createSociogramLinkAdapter();
			}
			@Override
			public Adapter caseInheritance(Inheritance object) {
				return createInheritanceAdapter();
			}
			@Override
			public Adapter caseActing(Acting object) {
				return createActingAdapter();
			}
			@Override
			public Adapter caseAssociation(Association object) {
				return createAssociationAdapter();
			}
			@Override
			public Adapter caseProcessDiagram(ProcessDiagram object) {
				return createProcessDiagramAdapter();
			}
			@Override
			public Adapter caseProcessNode(ProcessNode object) {
				return createProcessNodeAdapter();
			}
			@Override
			public Adapter caseInit(Init object) {
				return createInitAdapter();
			}
			@Override
			public Adapter caseEnd(End object) {
				return createEndAdapter();
			}
			@Override
			public Adapter caseSimpleTask(SimpleTask object) {
				return createSimpleTaskAdapter();
			}
			@Override
			public Adapter caseIndividualTask(IndividualTask object) {
				return createIndividualTaskAdapter();
			}
			@Override
			public Adapter caseCooperativeTask(CooperativeTask object) {
				return createCooperativeTaskAdapter();
			}
			@Override
			public Adapter caseCollaborativeTask(CollaborativeTask object) {
				return createCollaborativeTaskAdapter();
			}
			@Override
			public Adapter caseAbstractTask(AbstractTask object) {
				return createAbstractTaskAdapter();
			}
			@Override
			public Adapter caseTool(Tool object) {
				return createToolAdapter();
			}
			@Override
			public Adapter caseObject(ciat.Object object) {
				return createObjectAdapter();
			}
			@Override
			public Adapter caseTemporalCondition(TemporalCondition object) {
				return createTemporalConditionAdapter();
			}
			@Override
			public Adapter caseNotification(Notification object) {
				return createNotificationAdapter();
			}
			@Override
			public Adapter caseCondition(Condition object) {
				return createConditionAdapter();
			}
			@Override
			public Adapter caseDomainDiagram(DomainDiagram object) {
				return createDomainDiagramAdapter();
			}
			@Override
			public Adapter caseSharedObject(SharedObject object) {
				return createSharedObjectAdapter();
			}
			@Override
			public Adapter caseVisualizationArea(VisualizationArea object) {
				return createVisualizationAreaAdapter();
			}
			@Override
			public Adapter caseExclusiveEditionArea(ExclusiveEditionArea object) {
				return createExclusiveEditionAreaAdapter();
			}
			@Override
			public Adapter caseCollaborativeArea(CollaborativeArea object) {
				return createCollaborativeAreaAdapter();
			}
			@Override
			public Adapter caseIndividualArea(IndividualArea object) {
				return createIndividualAreaAdapter();
			}
			@Override
			public Adapter caseAttribute(Attribute object) {
				return createAttributeAdapter();
			}
			@Override
			public Adapter caseOperation(Operation object) {
				return createOperationAdapter();
			}
			@Override
			public Adapter caseSharedLink(SharedLink object) {
				return createSharedLinkAdapter();
			}
			@Override
			public Adapter caseShAssociationLink(ShAssociationLink object) {
				return createShAssociationLinkAdapter();
			}
			@Override
			public Adapter caseShGeneralizationLink(ShGeneralizationLink object) {
				return createShGeneralizationLinkAdapter();
			}
			@Override
			public Adapter caseShAggregationLink(ShAggregationLink object) {
				return createShAggregationLinkAdapter();
			}
			@Override
			public Adapter caseCTTDiagram(CTTDiagram object) {
				return createCTTDiagramAdapter();
			}
			@Override
			public Adapter caseCTTTask(CTTTask object) {
				return createCTTTaskAdapter();
			}
			@Override
			public Adapter caseExclusiveEdition(ExclusiveEdition object) {
				return createExclusiveEditionAdapter();
			}
			@Override
			public Adapter caseCollaborativeVisualization(CollaborativeVisualization object) {
				return createCollaborativeVisualizationAdapter();
			}
			@Override
			public Adapter caseIndividualVisualization(IndividualVisualization object) {
				return createIndividualVisualizationAdapter();
			}
			@Override
			public Adapter caseUserTask(UserTask object) {
				return createUserTaskAdapter();
			}
			@Override
			public Adapter caseCTTAbstractTask(CTTAbstractTask object) {
				return createCTTAbstractTaskAdapter();
			}
			@Override
			public Adapter caseInteractiveTask(InteractiveTask object) {
				return createInteractiveTaskAdapter();
			}
			@Override
			public Adapter caseCTTCollaborativeTask(CTTCollaborativeTask object) {
				return createCTTCollaborativeTaskAdapter();
			}
			@Override
			public Adapter caseApplicationTask(ApplicationTask object) {
				return createApplicationTaskAdapter();
			}
			@Override
			public Adapter caseDependencyElement(DependencyElement object) {
				return createDependencyElementAdapter();
			}
			@Override
			public Adapter caseDependency(Dependency object) {
				return createDependencyAdapter();
			}
			@Override
			public Adapter caseAggregation(Aggregation object) {
				return createAggregationAdapter();
			}
			@Override
			public Adapter caseEnabling(Enabling object) {
				return createEnablingAdapter();
			}
			@Override
			public Adapter caseDisabling(Disabling object) {
				return createDisablingAdapter();
			}
			@Override
			public Adapter caseEnablingWithInformationPassing(EnablingWithInformationPassing object) {
				return createEnablingWithInformationPassingAdapter();
			}
			@Override
			public Adapter caseDisablingWithInformationPassing(DisablingWithInformationPassing object) {
				return createDisablingWithInformationPassingAdapter();
			}
			@Override
			public Adapter caseIndependentConcurrency(IndependentConcurrency object) {
				return createIndependentConcurrencyAdapter();
			}
			@Override
			public Adapter caseOrderIndependence(OrderIndependence object) {
				return createOrderIndependenceAdapter();
			}
			@Override
			public Adapter caseSuspendResume(SuspendResume object) {
				return createSuspendResumeAdapter();
			}
			@Override
			public Adapter caseConcurrencyWithInformationPassing(ConcurrencyWithInformationPassing object) {
				return createConcurrencyWithInformationPassingAdapter();
			}
			@Override
			public Adapter caseDeterministicChoice(DeterministicChoice object) {
				return createDeterministicChoiceAdapter();
			}
			@Override
			public Adapter caseUndeterministicChoice(UndeterministicChoice object) {
				return createUndeterministicChoiceAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link ciat.CIATDiagram <em>CIAT Diagram</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ciat.CIATDiagram
	 * @generated
	 */
	public Adapter createCIATDiagramAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ciat.Link <em>Link</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ciat.Link
	 * @generated
	 */
	public Adapter createLinkAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ciat.Sociogram <em>Sociogram</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ciat.Sociogram
	 * @generated
	 */
	public Adapter createSociogramAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ciat.SociogramNode <em>Sociogram Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ciat.SociogramNode
	 * @generated
	 */
	public Adapter createSociogramNodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ciat.Rol <em>Rol</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ciat.Rol
	 * @generated
	 */
	public Adapter createRolAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ciat.Actor <em>Actor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ciat.Actor
	 * @generated
	 */
	public Adapter createActorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ciat.SoftwareAgent <em>Software Agent</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ciat.SoftwareAgent
	 * @generated
	 */
	public Adapter createSoftwareAgentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ciat.Team <em>Team</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ciat.Team
	 * @generated
	 */
	public Adapter createTeamAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ciat.Group <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ciat.Group
	 * @generated
	 */
	public Adapter createGroupAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ciat.SociogramLink <em>Sociogram Link</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ciat.SociogramLink
	 * @generated
	 */
	public Adapter createSociogramLinkAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ciat.Inheritance <em>Inheritance</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ciat.Inheritance
	 * @generated
	 */
	public Adapter createInheritanceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ciat.Acting <em>Acting</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ciat.Acting
	 * @generated
	 */
	public Adapter createActingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ciat.Association <em>Association</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ciat.Association
	 * @generated
	 */
	public Adapter createAssociationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ciat.ProcessDiagram <em>Process Diagram</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ciat.ProcessDiagram
	 * @generated
	 */
	public Adapter createProcessDiagramAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ciat.ProcessNode <em>Process Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ciat.ProcessNode
	 * @generated
	 */
	public Adapter createProcessNodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ciat.Init <em>Init</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ciat.Init
	 * @generated
	 */
	public Adapter createInitAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ciat.End <em>End</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ciat.End
	 * @generated
	 */
	public Adapter createEndAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ciat.SimpleTask <em>Simple Task</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ciat.SimpleTask
	 * @generated
	 */
	public Adapter createSimpleTaskAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ciat.IndividualTask <em>Individual Task</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ciat.IndividualTask
	 * @generated
	 */
	public Adapter createIndividualTaskAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ciat.CooperativeTask <em>Cooperative Task</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ciat.CooperativeTask
	 * @generated
	 */
	public Adapter createCooperativeTaskAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ciat.CollaborativeTask <em>Collaborative Task</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ciat.CollaborativeTask
	 * @generated
	 */
	public Adapter createCollaborativeTaskAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ciat.AbstractTask <em>Abstract Task</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ciat.AbstractTask
	 * @generated
	 */
	public Adapter createAbstractTaskAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ciat.Tool <em>Tool</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ciat.Tool
	 * @generated
	 */
	public Adapter createToolAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ciat.Object <em>Object</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ciat.Object
	 * @generated
	 */
	public Adapter createObjectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ciat.TemporalCondition <em>Temporal Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ciat.TemporalCondition
	 * @generated
	 */
	public Adapter createTemporalConditionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ciat.Notification <em>Notification</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ciat.Notification
	 * @generated
	 */
	public Adapter createNotificationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ciat.Condition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ciat.Condition
	 * @generated
	 */
	public Adapter createConditionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ciat.DomainDiagram <em>Domain Diagram</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ciat.DomainDiagram
	 * @generated
	 */
	public Adapter createDomainDiagramAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ciat.SharedObject <em>Shared Object</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ciat.SharedObject
	 * @generated
	 */
	public Adapter createSharedObjectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ciat.VisualizationArea <em>Visualization Area</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ciat.VisualizationArea
	 * @generated
	 */
	public Adapter createVisualizationAreaAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ciat.ExclusiveEditionArea <em>Exclusive Edition Area</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ciat.ExclusiveEditionArea
	 * @generated
	 */
	public Adapter createExclusiveEditionAreaAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ciat.CollaborativeArea <em>Collaborative Area</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ciat.CollaborativeArea
	 * @generated
	 */
	public Adapter createCollaborativeAreaAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ciat.IndividualArea <em>Individual Area</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ciat.IndividualArea
	 * @generated
	 */
	public Adapter createIndividualAreaAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ciat.Attribute <em>Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ciat.Attribute
	 * @generated
	 */
	public Adapter createAttributeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ciat.Operation <em>Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ciat.Operation
	 * @generated
	 */
	public Adapter createOperationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ciat.SharedLink <em>Shared Link</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ciat.SharedLink
	 * @generated
	 */
	public Adapter createSharedLinkAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ciat.ShAssociationLink <em>Sh Association Link</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ciat.ShAssociationLink
	 * @generated
	 */
	public Adapter createShAssociationLinkAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ciat.ShGeneralizationLink <em>Sh Generalization Link</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ciat.ShGeneralizationLink
	 * @generated
	 */
	public Adapter createShGeneralizationLinkAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ciat.ShAggregationLink <em>Sh Aggregation Link</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ciat.ShAggregationLink
	 * @generated
	 */
	public Adapter createShAggregationLinkAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ciat.CTTDiagram <em>CTT Diagram</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ciat.CTTDiagram
	 * @generated
	 */
	public Adapter createCTTDiagramAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ciat.CTTTask <em>CTT Task</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ciat.CTTTask
	 * @generated
	 */
	public Adapter createCTTTaskAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ciat.ExclusiveEdition <em>Exclusive Edition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ciat.ExclusiveEdition
	 * @generated
	 */
	public Adapter createExclusiveEditionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ciat.CollaborativeVisualization <em>Collaborative Visualization</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ciat.CollaborativeVisualization
	 * @generated
	 */
	public Adapter createCollaborativeVisualizationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ciat.IndividualVisualization <em>Individual Visualization</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ciat.IndividualVisualization
	 * @generated
	 */
	public Adapter createIndividualVisualizationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ciat.UserTask <em>User Task</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ciat.UserTask
	 * @generated
	 */
	public Adapter createUserTaskAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ciat.CTTAbstractTask <em>CTT Abstract Task</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ciat.CTTAbstractTask
	 * @generated
	 */
	public Adapter createCTTAbstractTaskAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ciat.InteractiveTask <em>Interactive Task</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ciat.InteractiveTask
	 * @generated
	 */
	public Adapter createInteractiveTaskAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ciat.CTTCollaborativeTask <em>CTT Collaborative Task</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ciat.CTTCollaborativeTask
	 * @generated
	 */
	public Adapter createCTTCollaborativeTaskAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ciat.ApplicationTask <em>Application Task</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ciat.ApplicationTask
	 * @generated
	 */
	public Adapter createApplicationTaskAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ciat.DependencyElement <em>Dependency Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ciat.DependencyElement
	 * @generated
	 */
	public Adapter createDependencyElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ciat.Dependency <em>Dependency</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ciat.Dependency
	 * @generated
	 */
	public Adapter createDependencyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ciat.Aggregation <em>Aggregation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ciat.Aggregation
	 * @generated
	 */
	public Adapter createAggregationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ciat.Enabling <em>Enabling</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ciat.Enabling
	 * @generated
	 */
	public Adapter createEnablingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ciat.Disabling <em>Disabling</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ciat.Disabling
	 * @generated
	 */
	public Adapter createDisablingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ciat.EnablingWithInformationPassing <em>Enabling With Information Passing</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ciat.EnablingWithInformationPassing
	 * @generated
	 */
	public Adapter createEnablingWithInformationPassingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ciat.DisablingWithInformationPassing <em>Disabling With Information Passing</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ciat.DisablingWithInformationPassing
	 * @generated
	 */
	public Adapter createDisablingWithInformationPassingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ciat.IndependentConcurrency <em>Independent Concurrency</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ciat.IndependentConcurrency
	 * @generated
	 */
	public Adapter createIndependentConcurrencyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ciat.OrderIndependence <em>Order Independence</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ciat.OrderIndependence
	 * @generated
	 */
	public Adapter createOrderIndependenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ciat.SuspendResume <em>Suspend Resume</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ciat.SuspendResume
	 * @generated
	 */
	public Adapter createSuspendResumeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ciat.ConcurrencyWithInformationPassing <em>Concurrency With Information Passing</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ciat.ConcurrencyWithInformationPassing
	 * @generated
	 */
	public Adapter createConcurrencyWithInformationPassingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ciat.DeterministicChoice <em>Deterministic Choice</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ciat.DeterministicChoice
	 * @generated
	 */
	public Adapter createDeterministicChoiceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ciat.UndeterministicChoice <em>Undeterministic Choice</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ciat.UndeterministicChoice
	 * @generated
	 */
	public Adapter createUndeterministicChoiceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //CiatAdapterFactory
