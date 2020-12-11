/*
 * 
 */
package ciat.diagram.providers.assistants;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;

import ciat.diagram.providers.CiatElementTypes;
import ciat.diagram.providers.CiatModelingAssistantProvider;

/**
 * @generated
 */
public class CiatModelingAssistantProviderOfCIATDiagramEditPart extends CiatModelingAssistantProvider {

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getTypesForPopupBar(IAdaptable host) {
		List<IElementType> types = new ArrayList<IElementType>(4);
		types.add(CiatElementTypes.Sociogram_2001);
		types.add(CiatElementTypes.ProcessDiagram_2002);
		types.add(CiatElementTypes.DomainDiagram_2003);
		types.add(CiatElementTypes.CTTDiagram_2004);
		return types;
	}

}
