/*
 * 
 */
package ciat.diagram.edit.policies;

import java.util.Collections;
import java.util.Iterator;
import java.util.Map;

import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gef.Request;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.commands.UnexecutableCommand;
import org.eclipse.gef.requests.ReconnectRequest;
import org.eclipse.gmf.runtime.common.core.command.ICommand;
import org.eclipse.gmf.runtime.common.core.command.ICompositeCommand;
import org.eclipse.gmf.runtime.diagram.core.commands.DeleteCommand;
import org.eclipse.gmf.runtime.diagram.ui.commands.CommandProxy;
import org.eclipse.gmf.runtime.diagram.ui.commands.ICommandProxy;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.SemanticEditPolicy;
import org.eclipse.gmf.runtime.emf.commands.core.command.CompositeTransactionalCommand;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.emf.type.core.requests.ConfigureRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateRelationshipRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyElementRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyReferenceRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DuplicateElementsRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.GetEditContextRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.IEditCommandRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.MoveRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientReferenceRelationshipRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientRelationshipRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.SetRequest;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.edit.helpers.GeneratedEditHelperBase;

import ciat.Acting;
import ciat.Aggregation;
import ciat.Association;
import ciat.CIATDiagram;
import ciat.CiatPackage;
import ciat.ConcurrencyWithInformationPassing;
import ciat.DependencyElement;
import ciat.DeterministicChoice;
import ciat.Disabling;
import ciat.DisablingWithInformationPassing;
import ciat.Enabling;
import ciat.EnablingWithInformationPassing;
import ciat.IndependentConcurrency;
import ciat.Inheritance;
import ciat.OrderIndependence;
import ciat.ShAggregationLink;
import ciat.ShAssociationLink;
import ciat.ShGeneralizationLink;
import ciat.SharedObject;
import ciat.SociogramNode;
import ciat.SuspendResume;
import ciat.UndeterministicChoice;
import ciat.diagram.expressions.CiatOCLFactory;
import ciat.diagram.part.CiatDiagramEditorPlugin;
import ciat.diagram.part.CiatVisualIDRegistry;
import ciat.diagram.providers.CiatElementTypes;

/**
 * @generated
 */
public class CiatBaseItemSemanticEditPolicy extends SemanticEditPolicy {

	/**
	* Extended request data key to hold editpart visual id.
	* @generated
	*/
	public static final String VISUAL_ID_KEY = "visual_id"; //$NON-NLS-1$

	/**
	* @generated
	*/
	private final IElementType myElementType;

	/**
	* @generated
	*/
	protected CiatBaseItemSemanticEditPolicy(IElementType elementType) {
		myElementType = elementType;
	}

	/**
	* Extended request data key to hold editpart visual id.
	* Add visual id of edited editpart to extended data of the request
	* so command switch can decide what kind of diagram element is being edited.
	* It is done in those cases when it's not possible to deduce diagram
	* element kind from domain element.
	* 
	* @generated
	*/
	public Command getCommand(Request request) {
		if (request instanceof ReconnectRequest) {
			Object view = ((ReconnectRequest) request).getConnectionEditPart().getModel();
			if (view instanceof View) {
				Integer id = new Integer(CiatVisualIDRegistry.getVisualID((View) view));
				request.getExtendedData().put(VISUAL_ID_KEY, id);
			}
		}
		return super.getCommand(request);
	}

	/**
	* Returns visual id from request parameters.
	* @generated
	*/
	protected int getVisualID(IEditCommandRequest request) {
		Object id = request.getParameter(VISUAL_ID_KEY);
		return id instanceof Integer ? ((Integer) id).intValue() : -1;
	}

	/**
	* @generated
	*/
	protected Command getSemanticCommand(IEditCommandRequest request) {
		IEditCommandRequest completedRequest = completeRequest(request);
		Command semanticCommand = getSemanticCommandSwitch(completedRequest);
		semanticCommand = getEditHelperCommand(completedRequest, semanticCommand);
		if (completedRequest instanceof DestroyRequest) {
			DestroyRequest destroyRequest = (DestroyRequest) completedRequest;
			return shouldProceed(destroyRequest) ? addDeleteViewCommand(semanticCommand, destroyRequest) : null;
		}
		return semanticCommand;
	}

	/**
	* @generated
	*/
	protected Command addDeleteViewCommand(Command mainCommand, DestroyRequest completedRequest) {
		Command deleteViewCommand = getGEFWrapper(new DeleteCommand(getEditingDomain(), (View) getHost().getModel()));
		return mainCommand == null ? deleteViewCommand : mainCommand.chain(deleteViewCommand);
	}

	/**
	* @generated
	*/
	private Command getEditHelperCommand(IEditCommandRequest request, Command editPolicyCommand) {
		if (editPolicyCommand != null) {
			ICommand command = editPolicyCommand instanceof ICommandProxy
					? ((ICommandProxy) editPolicyCommand).getICommand()
					: new CommandProxy(editPolicyCommand);
			request.setParameter(GeneratedEditHelperBase.EDIT_POLICY_COMMAND, command);
		}
		IElementType requestContextElementType = getContextElementType(request);
		request.setParameter(GeneratedEditHelperBase.CONTEXT_ELEMENT_TYPE, requestContextElementType);
		ICommand command = requestContextElementType.getEditCommand(request);
		request.setParameter(GeneratedEditHelperBase.EDIT_POLICY_COMMAND, null);
		request.setParameter(GeneratedEditHelperBase.CONTEXT_ELEMENT_TYPE, null);
		if (command != null) {
			if (!(command instanceof CompositeTransactionalCommand)) {
				command = new CompositeTransactionalCommand(getEditingDomain(), command.getLabel()).compose(command);
			}
			return new ICommandProxy(command);
		}
		return editPolicyCommand;
	}

	/**
	* @generated
	*/
	private IElementType getContextElementType(IEditCommandRequest request) {
		IElementType requestContextElementType = CiatElementTypes.getElementType(getVisualID(request));
		return requestContextElementType != null ? requestContextElementType : myElementType;
	}

	/**
	* @generated
	*/
	protected Command getSemanticCommandSwitch(IEditCommandRequest req) {
		if (req instanceof CreateRelationshipRequest) {
			return getCreateRelationshipCommand((CreateRelationshipRequest) req);
		} else if (req instanceof CreateElementRequest) {
			return getCreateCommand((CreateElementRequest) req);
		} else if (req instanceof ConfigureRequest) {
			return getConfigureCommand((ConfigureRequest) req);
		} else if (req instanceof DestroyElementRequest) {
			return getDestroyElementCommand((DestroyElementRequest) req);
		} else if (req instanceof DestroyReferenceRequest) {
			return getDestroyReferenceCommand((DestroyReferenceRequest) req);
		} else if (req instanceof DuplicateElementsRequest) {
			return getDuplicateCommand((DuplicateElementsRequest) req);
		} else if (req instanceof GetEditContextRequest) {
			return getEditContextCommand((GetEditContextRequest) req);
		} else if (req instanceof MoveRequest) {
			return getMoveCommand((MoveRequest) req);
		} else if (req instanceof ReorientReferenceRelationshipRequest) {
			return getReorientReferenceRelationshipCommand((ReorientReferenceRelationshipRequest) req);
		} else if (req instanceof ReorientRelationshipRequest) {
			return getReorientRelationshipCommand((ReorientRelationshipRequest) req);
		} else if (req instanceof SetRequest) {
			return getSetCommand((SetRequest) req);
		}
		return null;
	}

	/**
	* @generated
	*/
	protected Command getConfigureCommand(ConfigureRequest req) {
		return null;
	}

	/**
	* @generated
	*/
	protected Command getCreateRelationshipCommand(CreateRelationshipRequest req) {
		return null;
	}

	/**
	* @generated
	*/
	protected Command getCreateCommand(CreateElementRequest req) {
		return null;
	}

	/**
	* @generated
	*/
	protected Command getSetCommand(SetRequest req) {
		return null;
	}

	/**
	* @generated
	*/
	protected Command getEditContextCommand(GetEditContextRequest req) {
		return null;
	}

	/**
	* @generated
	*/
	protected Command getDestroyElementCommand(DestroyElementRequest req) {
		return null;
	}

	/**
	* @generated
	*/
	protected Command getDestroyReferenceCommand(DestroyReferenceRequest req) {
		return null;
	}

	/**
	* @generated
	*/
	protected Command getDuplicateCommand(DuplicateElementsRequest req) {
		return null;
	}

	/**
	* @generated
	*/
	protected Command getMoveCommand(MoveRequest req) {
		return null;
	}

	/**
	* @generated
	*/
	protected Command getReorientReferenceRelationshipCommand(ReorientReferenceRelationshipRequest req) {
		return UnexecutableCommand.INSTANCE;
	}

	/**
	* @generated
	*/
	protected Command getReorientRelationshipCommand(ReorientRelationshipRequest req) {
		return UnexecutableCommand.INSTANCE;
	}

	/**
	* @generated
	*/
	protected final Command getGEFWrapper(ICommand cmd) {
		return new ICommandProxy(cmd);
	}

	/**
	* Returns editing domain from the host edit part.
	* @generated
	*/
	protected TransactionalEditingDomain getEditingDomain() {
		return ((IGraphicalEditPart) getHost()).getEditingDomain();
	}

	/**
	* Clean all shortcuts to the host element from the same diagram
	* @generated
	*/
	protected void addDestroyShortcutsCommand(ICompositeCommand cmd, View view) {
		assert view.getEAnnotation("Shortcut") == null; //$NON-NLS-1$
		for (Iterator it = view.getDiagram().getChildren().iterator(); it.hasNext();) {
			View nextView = (View) it.next();
			if (nextView.getEAnnotation("Shortcut") == null || !nextView.isSetElement() //$NON-NLS-1$
					|| nextView.getElement() != view.getElement()) {
				continue;
			}
			cmd.add(new DeleteCommand(getEditingDomain(), nextView));
		}
	}

	/**
	* @generated
	*/
	public static LinkConstraints getLinkConstraints() {
		LinkConstraints cached = CiatDiagramEditorPlugin.getInstance().getLinkConstraints();
		if (cached == null) {
			CiatDiagramEditorPlugin.getInstance().setLinkConstraints(cached = new LinkConstraints());
		}
		return cached;
	}

	/**
	 * @generated
	 */
	public static class LinkConstraints {

		/**
		* @generated
		*/
		LinkConstraints() {
			// use static method #getLinkConstraints() to access instance
		}

		/**
		 * @generated
		 */
		public boolean canCreateInheritance_4001(CIATDiagram container, SociogramNode source, SociogramNode target) {
			return canExistInheritance_4001(container, null, source, target);
		}

		/**
		 * @generated
		 */
		public boolean canCreateActing_4002(CIATDiagram container, SociogramNode source, SociogramNode target) {
			return canExistActing_4002(container, null, source, target);
		}

		/**
		 * @generated
		 */
		public boolean canCreateAssociation_4003(CIATDiagram container, SociogramNode source, SociogramNode target) {
			return canExistAssociation_4003(container, null, source, target);
		}

		/**
		 * @generated
		 */
		public boolean canCreateShAssociationLink_4004(CIATDiagram container, SharedObject source,
				SharedObject target) {
			return canExistShAssociationLink_4004(container, null, source, target);
		}

		/**
		 * @generated
		 */
		public boolean canCreateShGeneralizationLink_4005(CIATDiagram container, SharedObject source,
				SharedObject target) {
			return canExistShGeneralizationLink_4005(container, null, source, target);
		}

		/**
		 * @generated
		 */
		public boolean canCreateShAggregationLink_4006(CIATDiagram container, SharedObject source,
				SharedObject target) {
			return canExistShAggregationLink_4006(container, null, source, target);
		}

		/**
		 * @generated
		 */
		public boolean canCreateAggregation_4007(CIATDiagram container, DependencyElement source,
				DependencyElement target) {
			return canExistAggregation_4007(container, null, source, target);
		}

		/**
		 * @generated
		 */
		public boolean canCreateEnabling_4008(CIATDiagram container, DependencyElement source,
				DependencyElement target) {
			return canExistEnabling_4008(container, null, source, target);
		}

		/**
		 * @generated
		 */
		public boolean canCreateDisabling_4009(CIATDiagram container, DependencyElement source,
				DependencyElement target) {
			return canExistDisabling_4009(container, null, source, target);
		}

		/**
		 * @generated
		 */
		public boolean canCreateEnablingWithInformationPassing_4010(CIATDiagram container, DependencyElement source,
				DependencyElement target) {
			return canExistEnablingWithInformationPassing_4010(container, null, source, target);
		}

		/**
		 * @generated
		 */
		public boolean canCreateDisablingWithInformationPassing_4011(CIATDiagram container, DependencyElement source,
				DependencyElement target) {
			return canExistDisablingWithInformationPassing_4011(container, null, source, target);
		}

		/**
		 * @generated
		 */
		public boolean canCreateIndependentConcurrency_4012(CIATDiagram container, DependencyElement source,
				DependencyElement target) {
			return canExistIndependentConcurrency_4012(container, null, source, target);
		}

		/**
		 * @generated
		 */
		public boolean canCreateOrderIndependence_4013(CIATDiagram container, DependencyElement source,
				DependencyElement target) {
			return canExistOrderIndependence_4013(container, null, source, target);
		}

		/**
		 * @generated
		 */
		public boolean canCreateSuspendResume_4014(CIATDiagram container, DependencyElement source,
				DependencyElement target) {
			return canExistSuspendResume_4014(container, null, source, target);
		}

		/**
		 * @generated
		 */
		public boolean canCreateConcurrencyWithInformationPassing_4015(CIATDiagram container, DependencyElement source,
				DependencyElement target) {
			return canExistConcurrencyWithInformationPassing_4015(container, null, source, target);
		}

		/**
		 * @generated
		 */
		public boolean canCreateDeterministicChoice_4016(CIATDiagram container, DependencyElement source,
				DependencyElement target) {
			return canExistDeterministicChoice_4016(container, null, source, target);
		}

		/**
		 * @generated
		 */
		public boolean canCreateUndeterministicChoice_4017(CIATDiagram container, DependencyElement source,
				DependencyElement target) {
			return canExistUndeterministicChoice_4017(container, null, source, target);
		}

		/**
		* @generated
		*/
		public boolean canExistInheritance_4001(CIATDiagram container, Inheritance linkInstance, SociogramNode source,
				SociogramNode target) {
			try {
				if (source == null) {
					return true;
				} else {
					Map<String, EClassifier> env = Collections.<String, EClassifier>singletonMap("oppositeEnd", //$NON-NLS-1$
							CiatPackage.eINSTANCE.getSociogramNode());
					Object sourceVal = CiatOCLFactory.getExpression(0, CiatPackage.eINSTANCE.getSociogramNode(), env)
							.evaluate(source, Collections.singletonMap("oppositeEnd", target)); //$NON-NLS-1$
					if (false == sourceVal instanceof Boolean || !((Boolean) sourceVal).booleanValue()) {
						return false;
					} // else fall-through
				}
				if (target == null) {
					return true;
				} else {
					Map<String, EClassifier> env = Collections.<String, EClassifier>singletonMap("oppositeEnd", //$NON-NLS-1$
							CiatPackage.eINSTANCE.getSociogramNode());
					Object targetVal = CiatOCLFactory.getExpression(1, CiatPackage.eINSTANCE.getSociogramNode(), env)
							.evaluate(target, Collections.singletonMap("oppositeEnd", source)); //$NON-NLS-1$
					if (false == targetVal instanceof Boolean || !((Boolean) targetVal).booleanValue()) {
						return false;
					} // else fall-through
				}
				return true;
			} catch (Exception e) {
				CiatDiagramEditorPlugin.getInstance().logError("Link constraint evaluation error", e); //$NON-NLS-1$
				return false;
			}
		}

		/**
		* @generated
		*/
		public boolean canExistActing_4002(CIATDiagram container, Acting linkInstance, SociogramNode source,
				SociogramNode target) {
			try {
				if (source == null) {
					return true;
				} else {
					Map<String, EClassifier> env = Collections.<String, EClassifier>singletonMap("oppositeEnd", //$NON-NLS-1$
							CiatPackage.eINSTANCE.getSociogramNode());
					Object sourceVal = CiatOCLFactory.getExpression(2, CiatPackage.eINSTANCE.getSociogramNode(), env)
							.evaluate(source, Collections.singletonMap("oppositeEnd", target)); //$NON-NLS-1$
					if (false == sourceVal instanceof Boolean || !((Boolean) sourceVal).booleanValue()) {
						return false;
					} // else fall-through
				}
				if (target == null) {
					return true;
				} else {
					Map<String, EClassifier> env = Collections.<String, EClassifier>singletonMap("oppositeEnd", //$NON-NLS-1$
							CiatPackage.eINSTANCE.getSociogramNode());
					Object targetVal = CiatOCLFactory.getExpression(3, CiatPackage.eINSTANCE.getSociogramNode(), env)
							.evaluate(target, Collections.singletonMap("oppositeEnd", source)); //$NON-NLS-1$
					if (false == targetVal instanceof Boolean || !((Boolean) targetVal).booleanValue()) {
						return false;
					} // else fall-through
				}
				return true;
			} catch (Exception e) {
				CiatDiagramEditorPlugin.getInstance().logError("Link constraint evaluation error", e); //$NON-NLS-1$
				return false;
			}
		}

		/**
		* @generated
		*/
		public boolean canExistAssociation_4003(CIATDiagram container, Association linkInstance, SociogramNode source,
				SociogramNode target) {
			try {
				if (source == null) {
					return true;
				} else {
					Map<String, EClassifier> env = Collections.<String, EClassifier>singletonMap("oppositeEnd", //$NON-NLS-1$
							CiatPackage.eINSTANCE.getSociogramNode());
					Object sourceVal = CiatOCLFactory.getExpression(4, CiatPackage.eINSTANCE.getSociogramNode(), env)
							.evaluate(source, Collections.singletonMap("oppositeEnd", target)); //$NON-NLS-1$
					if (false == sourceVal instanceof Boolean || !((Boolean) sourceVal).booleanValue()) {
						return false;
					} // else fall-through
				}
				if (target == null) {
					return true;
				} else {
					Map<String, EClassifier> env = Collections.<String, EClassifier>singletonMap("oppositeEnd", //$NON-NLS-1$
							CiatPackage.eINSTANCE.getSociogramNode());
					Object targetVal = CiatOCLFactory.getExpression(5, CiatPackage.eINSTANCE.getSociogramNode(), env)
							.evaluate(target, Collections.singletonMap("oppositeEnd", source)); //$NON-NLS-1$
					if (false == targetVal instanceof Boolean || !((Boolean) targetVal).booleanValue()) {
						return false;
					} // else fall-through
				}
				return true;
			} catch (Exception e) {
				CiatDiagramEditorPlugin.getInstance().logError("Link constraint evaluation error", e); //$NON-NLS-1$
				return false;
			}
		}

		/**
		* @generated
		*/
		public boolean canExistShAssociationLink_4004(CIATDiagram container, ShAssociationLink linkInstance,
				SharedObject source, SharedObject target) {
			try {
				if (source == null) {
					return true;
				} else {
					Map<String, EClassifier> env = Collections.<String, EClassifier>singletonMap("oppositeEnd", //$NON-NLS-1$
							CiatPackage.eINSTANCE.getSharedObject());
					Object sourceVal = CiatOCLFactory.getExpression(6, CiatPackage.eINSTANCE.getSharedObject(), env)
							.evaluate(source, Collections.singletonMap("oppositeEnd", target)); //$NON-NLS-1$
					if (false == sourceVal instanceof Boolean || !((Boolean) sourceVal).booleanValue()) {
						return false;
					} // else fall-through
				}
				if (target == null) {
					return true;
				} else {
					Map<String, EClassifier> env = Collections.<String, EClassifier>singletonMap("oppositeEnd", //$NON-NLS-1$
							CiatPackage.eINSTANCE.getSharedObject());
					Object targetVal = CiatOCLFactory.getExpression(7, CiatPackage.eINSTANCE.getSharedObject(), env)
							.evaluate(target, Collections.singletonMap("oppositeEnd", source)); //$NON-NLS-1$
					if (false == targetVal instanceof Boolean || !((Boolean) targetVal).booleanValue()) {
						return false;
					} // else fall-through
				}
				return true;
			} catch (Exception e) {
				CiatDiagramEditorPlugin.getInstance().logError("Link constraint evaluation error", e); //$NON-NLS-1$
				return false;
			}
		}

		/**
		* @generated
		*/
		public boolean canExistShGeneralizationLink_4005(CIATDiagram container, ShGeneralizationLink linkInstance,
				SharedObject source, SharedObject target) {
			try {
				if (source == null) {
					return true;
				} else {
					Map<String, EClassifier> env = Collections.<String, EClassifier>singletonMap("oppositeEnd", //$NON-NLS-1$
							CiatPackage.eINSTANCE.getSharedObject());
					Object sourceVal = CiatOCLFactory.getExpression(8, CiatPackage.eINSTANCE.getSharedObject(), env)
							.evaluate(source, Collections.singletonMap("oppositeEnd", target)); //$NON-NLS-1$
					if (false == sourceVal instanceof Boolean || !((Boolean) sourceVal).booleanValue()) {
						return false;
					} // else fall-through
				}
				if (target == null) {
					return true;
				} else {
					Map<String, EClassifier> env = Collections.<String, EClassifier>singletonMap("oppositeEnd", //$NON-NLS-1$
							CiatPackage.eINSTANCE.getSharedObject());
					Object targetVal = CiatOCLFactory.getExpression(9, CiatPackage.eINSTANCE.getSharedObject(), env)
							.evaluate(target, Collections.singletonMap("oppositeEnd", source)); //$NON-NLS-1$
					if (false == targetVal instanceof Boolean || !((Boolean) targetVal).booleanValue()) {
						return false;
					} // else fall-through
				}
				return true;
			} catch (Exception e) {
				CiatDiagramEditorPlugin.getInstance().logError("Link constraint evaluation error", e); //$NON-NLS-1$
				return false;
			}
		}

		/**
		* @generated
		*/
		public boolean canExistShAggregationLink_4006(CIATDiagram container, ShAggregationLink linkInstance,
				SharedObject source, SharedObject target) {
			try {
				if (source == null) {
					return true;
				} else {
					Map<String, EClassifier> env = Collections.<String, EClassifier>singletonMap("oppositeEnd", //$NON-NLS-1$
							CiatPackage.eINSTANCE.getSharedObject());
					Object sourceVal = CiatOCLFactory.getExpression(10, CiatPackage.eINSTANCE.getSharedObject(), env)
							.evaluate(source, Collections.singletonMap("oppositeEnd", target)); //$NON-NLS-1$
					if (false == sourceVal instanceof Boolean || !((Boolean) sourceVal).booleanValue()) {
						return false;
					} // else fall-through
				}
				if (target == null) {
					return true;
				} else {
					Map<String, EClassifier> env = Collections.<String, EClassifier>singletonMap("oppositeEnd", //$NON-NLS-1$
							CiatPackage.eINSTANCE.getSharedObject());
					Object targetVal = CiatOCLFactory.getExpression(11, CiatPackage.eINSTANCE.getSharedObject(), env)
							.evaluate(target, Collections.singletonMap("oppositeEnd", source)); //$NON-NLS-1$
					if (false == targetVal instanceof Boolean || !((Boolean) targetVal).booleanValue()) {
						return false;
					} // else fall-through
				}
				return true;
			} catch (Exception e) {
				CiatDiagramEditorPlugin.getInstance().logError("Link constraint evaluation error", e); //$NON-NLS-1$
				return false;
			}
		}

		/**
		* @generated
		*/
		public boolean canExistAggregation_4007(CIATDiagram container, Aggregation linkInstance,
				DependencyElement source, DependencyElement target) {
			try {
				if (source == null) {
					return true;
				} else {
					Map<String, EClassifier> env = Collections.<String, EClassifier>singletonMap("oppositeEnd", //$NON-NLS-1$
							CiatPackage.eINSTANCE.getDependencyElement());
					Object sourceVal = CiatOCLFactory
							.getExpression(12, CiatPackage.eINSTANCE.getDependencyElement(), env)
							.evaluate(source, Collections.singletonMap("oppositeEnd", target)); //$NON-NLS-1$
					if (false == sourceVal instanceof Boolean || !((Boolean) sourceVal).booleanValue()) {
						return false;
					} // else fall-through
				}
				if (target == null) {
					return true;
				} else {
					Map<String, EClassifier> env = Collections.<String, EClassifier>singletonMap("oppositeEnd", //$NON-NLS-1$
							CiatPackage.eINSTANCE.getDependencyElement());
					Object targetVal = CiatOCLFactory
							.getExpression(13, CiatPackage.eINSTANCE.getDependencyElement(), env)
							.evaluate(target, Collections.singletonMap("oppositeEnd", source)); //$NON-NLS-1$
					if (false == targetVal instanceof Boolean || !((Boolean) targetVal).booleanValue()) {
						return false;
					} // else fall-through
				}
				return true;
			} catch (Exception e) {
				CiatDiagramEditorPlugin.getInstance().logError("Link constraint evaluation error", e); //$NON-NLS-1$
				return false;
			}
		}

		/**
		* @generated
		*/
		public boolean canExistEnabling_4008(CIATDiagram container, Enabling linkInstance, DependencyElement source,
				DependencyElement target) {
			try {
				if (source == null) {
					return true;
				} else {
					Map<String, EClassifier> env = Collections.<String, EClassifier>singletonMap("oppositeEnd", //$NON-NLS-1$
							CiatPackage.eINSTANCE.getDependencyElement());
					Object sourceVal = CiatOCLFactory
							.getExpression(14, CiatPackage.eINSTANCE.getDependencyElement(), env)
							.evaluate(source, Collections.singletonMap("oppositeEnd", target)); //$NON-NLS-1$
					if (false == sourceVal instanceof Boolean || !((Boolean) sourceVal).booleanValue()) {
						return false;
					} // else fall-through
				}
				if (target == null) {
					return true;
				} else {
					Map<String, EClassifier> env = Collections.<String, EClassifier>singletonMap("oppositeEnd", //$NON-NLS-1$
							CiatPackage.eINSTANCE.getDependencyElement());
					Object targetVal = CiatOCLFactory
							.getExpression(15, CiatPackage.eINSTANCE.getDependencyElement(), env)
							.evaluate(target, Collections.singletonMap("oppositeEnd", source)); //$NON-NLS-1$
					if (false == targetVal instanceof Boolean || !((Boolean) targetVal).booleanValue()) {
						return false;
					} // else fall-through
				}
				return true;
			} catch (Exception e) {
				CiatDiagramEditorPlugin.getInstance().logError("Link constraint evaluation error", e); //$NON-NLS-1$
				return false;
			}
		}

		/**
		* @generated
		*/
		public boolean canExistDisabling_4009(CIATDiagram container, Disabling linkInstance, DependencyElement source,
				DependencyElement target) {
			try {
				if (source == null) {
					return true;
				} else {
					Map<String, EClassifier> env = Collections.<String, EClassifier>singletonMap("oppositeEnd", //$NON-NLS-1$
							CiatPackage.eINSTANCE.getDependencyElement());
					Object sourceVal = CiatOCLFactory
							.getExpression(16, CiatPackage.eINSTANCE.getDependencyElement(), env)
							.evaluate(source, Collections.singletonMap("oppositeEnd", target)); //$NON-NLS-1$
					if (false == sourceVal instanceof Boolean || !((Boolean) sourceVal).booleanValue()) {
						return false;
					} // else fall-through
				}
				if (target == null) {
					return true;
				} else {
					Map<String, EClassifier> env = Collections.<String, EClassifier>singletonMap("oppositeEnd", //$NON-NLS-1$
							CiatPackage.eINSTANCE.getDependencyElement());
					Object targetVal = CiatOCLFactory
							.getExpression(17, CiatPackage.eINSTANCE.getDependencyElement(), env)
							.evaluate(target, Collections.singletonMap("oppositeEnd", source)); //$NON-NLS-1$
					if (false == targetVal instanceof Boolean || !((Boolean) targetVal).booleanValue()) {
						return false;
					} // else fall-through
				}
				return true;
			} catch (Exception e) {
				CiatDiagramEditorPlugin.getInstance().logError("Link constraint evaluation error", e); //$NON-NLS-1$
				return false;
			}
		}

		/**
		* @generated
		*/
		public boolean canExistEnablingWithInformationPassing_4010(CIATDiagram container,
				EnablingWithInformationPassing linkInstance, DependencyElement source, DependencyElement target) {
			try {
				if (source == null) {
					return true;
				} else {
					Map<String, EClassifier> env = Collections.<String, EClassifier>singletonMap("oppositeEnd", //$NON-NLS-1$
							CiatPackage.eINSTANCE.getDependencyElement());
					Object sourceVal = CiatOCLFactory
							.getExpression(18, CiatPackage.eINSTANCE.getDependencyElement(), env)
							.evaluate(source, Collections.singletonMap("oppositeEnd", target)); //$NON-NLS-1$
					if (false == sourceVal instanceof Boolean || !((Boolean) sourceVal).booleanValue()) {
						return false;
					} // else fall-through
				}
				if (target == null) {
					return true;
				} else {
					Map<String, EClassifier> env = Collections.<String, EClassifier>singletonMap("oppositeEnd", //$NON-NLS-1$
							CiatPackage.eINSTANCE.getDependencyElement());
					Object targetVal = CiatOCLFactory
							.getExpression(19, CiatPackage.eINSTANCE.getDependencyElement(), env)
							.evaluate(target, Collections.singletonMap("oppositeEnd", source)); //$NON-NLS-1$
					if (false == targetVal instanceof Boolean || !((Boolean) targetVal).booleanValue()) {
						return false;
					} // else fall-through
				}
				return true;
			} catch (Exception e) {
				CiatDiagramEditorPlugin.getInstance().logError("Link constraint evaluation error", e); //$NON-NLS-1$
				return false;
			}
		}

		/**
		* @generated
		*/
		public boolean canExistDisablingWithInformationPassing_4011(CIATDiagram container,
				DisablingWithInformationPassing linkInstance, DependencyElement source, DependencyElement target) {
			try {
				if (source == null) {
					return true;
				} else {
					Map<String, EClassifier> env = Collections.<String, EClassifier>singletonMap("oppositeEnd", //$NON-NLS-1$
							CiatPackage.eINSTANCE.getDependencyElement());
					Object sourceVal = CiatOCLFactory
							.getExpression(20, CiatPackage.eINSTANCE.getDependencyElement(), env)
							.evaluate(source, Collections.singletonMap("oppositeEnd", target)); //$NON-NLS-1$
					if (false == sourceVal instanceof Boolean || !((Boolean) sourceVal).booleanValue()) {
						return false;
					} // else fall-through
				}
				if (target == null) {
					return true;
				} else {
					Map<String, EClassifier> env = Collections.<String, EClassifier>singletonMap("oppositeEnd", //$NON-NLS-1$
							CiatPackage.eINSTANCE.getDependencyElement());
					Object targetVal = CiatOCLFactory
							.getExpression(21, CiatPackage.eINSTANCE.getDependencyElement(), env)
							.evaluate(target, Collections.singletonMap("oppositeEnd", source)); //$NON-NLS-1$
					if (false == targetVal instanceof Boolean || !((Boolean) targetVal).booleanValue()) {
						return false;
					} // else fall-through
				}
				return true;
			} catch (Exception e) {
				CiatDiagramEditorPlugin.getInstance().logError("Link constraint evaluation error", e); //$NON-NLS-1$
				return false;
			}
		}

		/**
		* @generated
		*/
		public boolean canExistIndependentConcurrency_4012(CIATDiagram container, IndependentConcurrency linkInstance,
				DependencyElement source, DependencyElement target) {
			try {
				if (source == null) {
					return true;
				} else {
					Map<String, EClassifier> env = Collections.<String, EClassifier>singletonMap("oppositeEnd", //$NON-NLS-1$
							CiatPackage.eINSTANCE.getDependencyElement());
					Object sourceVal = CiatOCLFactory
							.getExpression(22, CiatPackage.eINSTANCE.getDependencyElement(), env)
							.evaluate(source, Collections.singletonMap("oppositeEnd", target)); //$NON-NLS-1$
					if (false == sourceVal instanceof Boolean || !((Boolean) sourceVal).booleanValue()) {
						return false;
					} // else fall-through
				}
				if (target == null) {
					return true;
				} else {
					Map<String, EClassifier> env = Collections.<String, EClassifier>singletonMap("oppositeEnd", //$NON-NLS-1$
							CiatPackage.eINSTANCE.getDependencyElement());
					Object targetVal = CiatOCLFactory
							.getExpression(23, CiatPackage.eINSTANCE.getDependencyElement(), env)
							.evaluate(target, Collections.singletonMap("oppositeEnd", source)); //$NON-NLS-1$
					if (false == targetVal instanceof Boolean || !((Boolean) targetVal).booleanValue()) {
						return false;
					} // else fall-through
				}
				return true;
			} catch (Exception e) {
				CiatDiagramEditorPlugin.getInstance().logError("Link constraint evaluation error", e); //$NON-NLS-1$
				return false;
			}
		}

		/**
		* @generated
		*/
		public boolean canExistOrderIndependence_4013(CIATDiagram container, OrderIndependence linkInstance,
				DependencyElement source, DependencyElement target) {
			try {
				if (source == null) {
					return true;
				} else {
					Map<String, EClassifier> env = Collections.<String, EClassifier>singletonMap("oppositeEnd", //$NON-NLS-1$
							CiatPackage.eINSTANCE.getDependencyElement());
					Object sourceVal = CiatOCLFactory
							.getExpression(24, CiatPackage.eINSTANCE.getDependencyElement(), env)
							.evaluate(source, Collections.singletonMap("oppositeEnd", target)); //$NON-NLS-1$
					if (false == sourceVal instanceof Boolean || !((Boolean) sourceVal).booleanValue()) {
						return false;
					} // else fall-through
				}
				if (target == null) {
					return true;
				} else {
					Map<String, EClassifier> env = Collections.<String, EClassifier>singletonMap("oppositeEnd", //$NON-NLS-1$
							CiatPackage.eINSTANCE.getDependencyElement());
					Object targetVal = CiatOCLFactory
							.getExpression(25, CiatPackage.eINSTANCE.getDependencyElement(), env)
							.evaluate(target, Collections.singletonMap("oppositeEnd", source)); //$NON-NLS-1$
					if (false == targetVal instanceof Boolean || !((Boolean) targetVal).booleanValue()) {
						return false;
					} // else fall-through
				}
				return true;
			} catch (Exception e) {
				CiatDiagramEditorPlugin.getInstance().logError("Link constraint evaluation error", e); //$NON-NLS-1$
				return false;
			}
		}

		/**
		* @generated
		*/
		public boolean canExistSuspendResume_4014(CIATDiagram container, SuspendResume linkInstance,
				DependencyElement source, DependencyElement target) {
			try {
				if (source == null) {
					return true;
				} else {
					Map<String, EClassifier> env = Collections.<String, EClassifier>singletonMap("oppositeEnd", //$NON-NLS-1$
							CiatPackage.eINSTANCE.getDependencyElement());
					Object sourceVal = CiatOCLFactory
							.getExpression(26, CiatPackage.eINSTANCE.getDependencyElement(), env)
							.evaluate(source, Collections.singletonMap("oppositeEnd", target)); //$NON-NLS-1$
					if (false == sourceVal instanceof Boolean || !((Boolean) sourceVal).booleanValue()) {
						return false;
					} // else fall-through
				}
				if (target == null) {
					return true;
				} else {
					Map<String, EClassifier> env = Collections.<String, EClassifier>singletonMap("oppositeEnd", //$NON-NLS-1$
							CiatPackage.eINSTANCE.getDependencyElement());
					Object targetVal = CiatOCLFactory
							.getExpression(27, CiatPackage.eINSTANCE.getDependencyElement(), env)
							.evaluate(target, Collections.singletonMap("oppositeEnd", source)); //$NON-NLS-1$
					if (false == targetVal instanceof Boolean || !((Boolean) targetVal).booleanValue()) {
						return false;
					} // else fall-through
				}
				return true;
			} catch (Exception e) {
				CiatDiagramEditorPlugin.getInstance().logError("Link constraint evaluation error", e); //$NON-NLS-1$
				return false;
			}
		}

		/**
		* @generated
		*/
		public boolean canExistConcurrencyWithInformationPassing_4015(CIATDiagram container,
				ConcurrencyWithInformationPassing linkInstance, DependencyElement source, DependencyElement target) {
			try {
				if (source == null) {
					return true;
				} else {
					Map<String, EClassifier> env = Collections.<String, EClassifier>singletonMap("oppositeEnd", //$NON-NLS-1$
							CiatPackage.eINSTANCE.getDependencyElement());
					Object sourceVal = CiatOCLFactory
							.getExpression(28, CiatPackage.eINSTANCE.getDependencyElement(), env)
							.evaluate(source, Collections.singletonMap("oppositeEnd", target)); //$NON-NLS-1$
					if (false == sourceVal instanceof Boolean || !((Boolean) sourceVal).booleanValue()) {
						return false;
					} // else fall-through
				}
				if (target == null) {
					return true;
				} else {
					Map<String, EClassifier> env = Collections.<String, EClassifier>singletonMap("oppositeEnd", //$NON-NLS-1$
							CiatPackage.eINSTANCE.getDependencyElement());
					Object targetVal = CiatOCLFactory
							.getExpression(29, CiatPackage.eINSTANCE.getDependencyElement(), env)
							.evaluate(target, Collections.singletonMap("oppositeEnd", source)); //$NON-NLS-1$
					if (false == targetVal instanceof Boolean || !((Boolean) targetVal).booleanValue()) {
						return false;
					} // else fall-through
				}
				return true;
			} catch (Exception e) {
				CiatDiagramEditorPlugin.getInstance().logError("Link constraint evaluation error", e); //$NON-NLS-1$
				return false;
			}
		}

		/**
		* @generated
		*/
		public boolean canExistDeterministicChoice_4016(CIATDiagram container, DeterministicChoice linkInstance,
				DependencyElement source, DependencyElement target) {
			try {
				if (source == null) {
					return true;
				} else {
					Map<String, EClassifier> env = Collections.<String, EClassifier>singletonMap("oppositeEnd", //$NON-NLS-1$
							CiatPackage.eINSTANCE.getDependencyElement());
					Object sourceVal = CiatOCLFactory
							.getExpression(30, CiatPackage.eINSTANCE.getDependencyElement(), env)
							.evaluate(source, Collections.singletonMap("oppositeEnd", target)); //$NON-NLS-1$
					if (false == sourceVal instanceof Boolean || !((Boolean) sourceVal).booleanValue()) {
						return false;
					} // else fall-through
				}
				if (target == null) {
					return true;
				} else {
					Map<String, EClassifier> env = Collections.<String, EClassifier>singletonMap("oppositeEnd", //$NON-NLS-1$
							CiatPackage.eINSTANCE.getDependencyElement());
					Object targetVal = CiatOCLFactory
							.getExpression(31, CiatPackage.eINSTANCE.getDependencyElement(), env)
							.evaluate(target, Collections.singletonMap("oppositeEnd", source)); //$NON-NLS-1$
					if (false == targetVal instanceof Boolean || !((Boolean) targetVal).booleanValue()) {
						return false;
					} // else fall-through
				}
				return true;
			} catch (Exception e) {
				CiatDiagramEditorPlugin.getInstance().logError("Link constraint evaluation error", e); //$NON-NLS-1$
				return false;
			}
		}

		/**
		* @generated
		*/
		public boolean canExistUndeterministicChoice_4017(CIATDiagram container, UndeterministicChoice linkInstance,
				DependencyElement source, DependencyElement target) {
			try {
				if (source == null) {
					return true;
				} else {
					Map<String, EClassifier> env = Collections.<String, EClassifier>singletonMap("oppositeEnd", //$NON-NLS-1$
							CiatPackage.eINSTANCE.getDependencyElement());
					Object sourceVal = CiatOCLFactory
							.getExpression(32, CiatPackage.eINSTANCE.getDependencyElement(), env)
							.evaluate(source, Collections.singletonMap("oppositeEnd", target)); //$NON-NLS-1$
					if (false == sourceVal instanceof Boolean || !((Boolean) sourceVal).booleanValue()) {
						return false;
					} // else fall-through
				}
				if (target == null) {
					return true;
				} else {
					Map<String, EClassifier> env = Collections.<String, EClassifier>singletonMap("oppositeEnd", //$NON-NLS-1$
							CiatPackage.eINSTANCE.getDependencyElement());
					Object targetVal = CiatOCLFactory
							.getExpression(33, CiatPackage.eINSTANCE.getDependencyElement(), env)
							.evaluate(target, Collections.singletonMap("oppositeEnd", source)); //$NON-NLS-1$
					if (false == targetVal instanceof Boolean || !((Boolean) targetVal).booleanValue()) {
						return false;
					} // else fall-through
				}
				return true;
			} catch (Exception e) {
				CiatDiagramEditorPlugin.getInstance().logError("Link constraint evaluation error", e); //$NON-NLS-1$
				return false;
			}
		}
	}

}
