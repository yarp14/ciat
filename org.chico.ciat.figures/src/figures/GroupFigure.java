package figures;

import org.eclipse.draw2d.ImageFigure;

import activator.PluginActivator;

public class GroupFigure extends ImageFigure {
	public GroupFigure() {
		super(PluginActivator.imageDescriptorFromPlugin(PluginActivator.ID,
			"images/Group.gif").createImage(), 0);
	}
}
