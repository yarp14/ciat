/*
 * 
 */
package ciat.diagram.providers;

import org.eclipse.gmf.tooling.runtime.providers.DefaultEditPartProvider;

import ciat.diagram.edit.parts.CIATDiagramEditPart;
import ciat.diagram.edit.parts.CiatEditPartFactory;
import ciat.diagram.part.CiatVisualIDRegistry;

/**
 * @generated
 */
public class CiatEditPartProvider extends DefaultEditPartProvider {

	/**
	* @generated
	*/
	public CiatEditPartProvider() {
		super(new CiatEditPartFactory(), CiatVisualIDRegistry.TYPED_INSTANCE, CIATDiagramEditPart.MODEL_ID);
	}

}
