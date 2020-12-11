package figures;

import org.eclipse.draw2d.ImageFigure;

import activator.PluginActivator;

public class DisablingFigure extends ImageFigure {

	public DisablingFigure() {
		super(PluginActivator.imageDescriptorFromPlugin(PluginActivator.ID,
				"images/DisablingTransition.gif").createImage(), 0);
	}
}
