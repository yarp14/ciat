package figures;

import org.eclipse.draw2d.ImageFigure;

import activator.PluginActivator;

public class CooperativeInteractionTaskFigure extends ImageFigure {
	public CooperativeInteractionTaskFigure() {
		super(PluginActivator.imageDescriptorFromPlugin(PluginActivator.ID,
				"images/CooperativeInteractionTask.gif").createImage(), 0);
	}
}
