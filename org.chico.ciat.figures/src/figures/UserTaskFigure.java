package figures;

import org.eclipse.draw2d.ImageFigure;

import activator.PluginActivator;

public class UserTaskFigure extends ImageFigure {

	public UserTaskFigure() {
		super(PluginActivator.imageDescriptorFromPlugin(PluginActivator.ID,
				"images/UserTask.gif").createImage(), 0);
	}
}
