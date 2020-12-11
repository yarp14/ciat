package figures;

import org.eclipse.draw2d.ImageFigure;

import activator.PluginActivator;

public class ApplicationTaskFigure extends ImageFigure {

	public ApplicationTaskFigure() {
		super(PluginActivator.imageDescriptorFromPlugin(PluginActivator.ID,
				"images/ApplicationTask.gif").createImage(), 0);	
	}
}
