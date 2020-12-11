package figures;

import org.eclipse.draw2d.ImageFigure;

import activator.PluginActivator;

public class ActingFigure extends ImageFigure {
	public ActingFigure() {
		super(PluginActivator.imageDescriptorFromPlugin(PluginActivator.ID,
			"images/Acting.gif").createImage(), 0);
	}
}
