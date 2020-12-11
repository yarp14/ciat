/*
 * 
 */
package ciat.diagram.providers;

import ciat.diagram.part.CiatDiagramEditorPlugin;

/**
 * @generated
 */
public class ElementInitializers {

	protected ElementInitializers() {
		// use #getInstance to access cached instance
	}

	/**
	* @generated
	*/
	public static ElementInitializers getInstance() {
		ElementInitializers cached = CiatDiagramEditorPlugin.getInstance().getElementInitializers();
		if (cached == null) {
			CiatDiagramEditorPlugin.getInstance().setElementInitializers(cached = new ElementInitializers());
		}
		return cached;
	}
}
