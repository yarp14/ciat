package figures;

import org.eclipse.draw2d.ImageFigure;

import activator.PluginActivator;

public class ComputerSupportedFigure extends ImageFigure {

	public ComputerSupportedFigure() {
		super(PluginActivator.imageDescriptorFromPlugin(PluginActivator.ID,
				"images/ComputerSupported.gif").createImage(), 0);
	}
}
