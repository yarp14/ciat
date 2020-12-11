package figures;

import org.eclipse.draw2d.ImageFigure;

import activator.PluginActivator;

public class CollaborativeInteractionTaskFigure extends ImageFigure {

	public CollaborativeInteractionTaskFigure() {
		super(PluginActivator.imageDescriptorFromPlugin(PluginActivator.ID,
				"images/CollaborativeInteractionTask.gif").createImage(), 0);
	}
}
