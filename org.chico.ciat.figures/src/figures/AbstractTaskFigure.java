package figures;

import org.eclipse.draw2d.ImageFigure;

import activator.PluginActivator;

public class AbstractTaskFigure extends ImageFigure {

	public AbstractTaskFigure() {
		super(PluginActivator.imageDescriptorFromPlugin(PluginActivator.ID,
				"images/AbstractTask.gif").createImage(), 0);	
	}
}
