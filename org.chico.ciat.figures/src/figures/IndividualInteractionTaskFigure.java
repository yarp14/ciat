package figures;

import org.eclipse.draw2d.ImageFigure;

import activator.PluginActivator;

public class IndividualInteractionTaskFigure extends ImageFigure {

	public IndividualInteractionTaskFigure() {
		super(PluginActivator.imageDescriptorFromPlugin(PluginActivator.ID,
				"images/IndividualInteractionTask.gif").createImage(), 0);
	}
}
