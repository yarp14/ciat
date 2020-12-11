package figures;

import org.eclipse.draw2d.ImageFigure;

import activator.PluginActivator;

public class OrderIndependenceFigure extends ImageFigure {

	public OrderIndependenceFigure() {
		super(PluginActivator.imageDescriptorFromPlugin(PluginActivator.ID,
				"images/OrderIndependenceTransition.gif").createImage(), 0);
	}
}
