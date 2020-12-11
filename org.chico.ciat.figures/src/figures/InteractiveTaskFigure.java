package figures;

import org.eclipse.draw2d.ImageFigure;

import activator.PluginActivator;

public class InteractiveTaskFigure extends ImageFigure {

	public InteractiveTaskFigure() {
		super(PluginActivator.imageDescriptorFromPlugin(PluginActivator.ID,
				"images/InteractionTask.gif").createImage(), 0);
	}
}
