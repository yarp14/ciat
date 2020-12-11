package figures;

import org.eclipse.draw2d.ImageFigure;

import activator.PluginActivator;

public class OnlineFigure extends ImageFigure {

	public OnlineFigure() {
		super(PluginActivator.imageDescriptorFromPlugin(PluginActivator.ID,
				"images/Online.gif").createImage(), 0);
	}
}
