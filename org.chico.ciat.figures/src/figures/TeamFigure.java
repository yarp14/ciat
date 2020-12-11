package figures;

import org.eclipse.draw2d.ImageFigure;

import activator.PluginActivator;

public class TeamFigure extends ImageFigure {
	public TeamFigure() {
		super(PluginActivator.imageDescriptorFromPlugin(PluginActivator.ID,
			"images/Team.gif").createImage(), 0);
	}
}
