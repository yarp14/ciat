package figures;

import org.eclipse.draw2d.ImageFigure;

import activator.PluginActivator;

public class SociogramFigure extends ImageFigure {
	public SociogramFigure() {
		super(PluginActivator.imageDescriptorFromPlugin(PluginActivator.ID,
			"images/Sociogram.gif").createImage(), 0);
	}
}
