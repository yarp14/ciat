package figures;

import org.eclipse.draw2d.ImageFigure;

import activator.PluginActivator;

public class CollaborativeTaskFigure extends ImageFigure {

	public CollaborativeTaskFigure() {
		super(PluginActivator.imageDescriptorFromPlugin(PluginActivator.ID,
				"images/CollaborativeTask.gif").createImage(), 0);
	}
}
