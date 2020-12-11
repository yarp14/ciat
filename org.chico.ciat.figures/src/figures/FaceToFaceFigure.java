package figures;

import org.eclipse.draw2d.ImageFigure;

import activator.PluginActivator;

public class FaceToFaceFigure extends ImageFigure {

	public FaceToFaceFigure() {
		super(PluginActivator.imageDescriptorFromPlugin(PluginActivator.ID,
				"images/FaceToFace.gif").createImage(), 0);
	}
}
