package figures;

import org.eclipse.draw2d.ImageFigure;

import activator.PluginActivator;

public class InitialFigure extends ImageFigure {

	public InitialFigure() {
		super(PluginActivator.imageDescriptorFromPlugin(PluginActivator.ID,
				"images/Initial.gif").createImage(), 0);	
	}
}
