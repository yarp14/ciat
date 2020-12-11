package figures;

import org.eclipse.draw2d.ImageFigure;

import activator.PluginActivator;

public class ObjectFigure extends ImageFigure {

	public ObjectFigure() {
		super(PluginActivator.imageDescriptorFromPlugin(PluginActivator.ID,
				"images/Object.gif").createImage(), 0);	
	}
}
