package figures;

import org.eclipse.draw2d.ImageFigure;

import activator.PluginActivator;

public class ActorFigure extends ImageFigure {
	public ActorFigure() {
		super(PluginActivator.imageDescriptorFromPlugin(PluginActivator.ID,
			"images/Actor.gif").createImage(), 0);
	}
}
