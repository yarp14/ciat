package figures;

import org.eclipse.draw2d.ImageFigure;

import activator.PluginActivator;

public class SoftwareAgentFigure extends ImageFigure {
	public SoftwareAgentFigure() {
		super(PluginActivator.imageDescriptorFromPlugin(PluginActivator.ID,
			"images/SoftwareAgent.gif").createImage(), 0);
	}
}
