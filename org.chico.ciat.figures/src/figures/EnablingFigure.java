package figures;

import org.eclipse.draw2d.ImageFigure;

import activator.PluginActivator;

public class EnablingFigure extends ImageFigure {

	public EnablingFigure() {
		super(PluginActivator.imageDescriptorFromPlugin(PluginActivator.ID,
				"images/EnablingTransition.gif").createImage(), 0);
	}
}
