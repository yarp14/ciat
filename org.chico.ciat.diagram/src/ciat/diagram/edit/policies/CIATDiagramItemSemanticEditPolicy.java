/*
* 
*/
package ciat.diagram.edit.policies;

import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.emf.commands.core.commands.DuplicateEObjectsCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DuplicateElementsRequest;

import ciat.diagram.edit.commands.CTTDiagramCreateCommand;
import ciat.diagram.edit.commands.DomainDiagramCreateCommand;
import ciat.diagram.edit.commands.ProcessDiagramCreateCommand;
import ciat.diagram.edit.commands.SociogramCreateCommand;
import ciat.diagram.providers.CiatElementTypes;

/**
 * @generated
 */
public class CIATDiagramItemSemanticEditPolicy extends CiatBaseItemSemanticEditPolicy {

	/**
	* @generated
	*/
	public CIATDiagramItemSemanticEditPolicy() {
		super(CiatElementTypes.CIATDiagram_1000);
	}

	/**
	* @generated
	*/
	protected Command getCreateCommand(CreateElementRequest req) {
		if (CiatElementTypes.Sociogram_2001 == req.getElementType()) {
			return getGEFWrapper(new SociogramCreateCommand(req));
		}
		if (CiatElementTypes.ProcessDiagram_2002 == req.getElementType()) {
			return getGEFWrapper(new ProcessDiagramCreateCommand(req));
		}
		if (CiatElementTypes.DomainDiagram_2003 == req.getElementType()) {
			return getGEFWrapper(new DomainDiagramCreateCommand(req));
		}
		if (CiatElementTypes.CTTDiagram_2004 == req.getElementType()) {
			return getGEFWrapper(new CTTDiagramCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

	/**
	* @generated
	*/
	protected Command getDuplicateCommand(DuplicateElementsRequest req) {
		TransactionalEditingDomain editingDomain = ((IGraphicalEditPart) getHost()).getEditingDomain();
		return getGEFWrapper(new DuplicateAnythingCommand(editingDomain, req));
	}

	/**
	* @generated
	*/
	private static class DuplicateAnythingCommand extends DuplicateEObjectsCommand {

		/**
		* @generated
		*/
		public DuplicateAnythingCommand(TransactionalEditingDomain editingDomain, DuplicateElementsRequest req) {
			super(editingDomain, req.getLabel(), req.getElementsToBeDuplicated(), req.getAllDuplicatedElementsMap());
		}

	}

}
