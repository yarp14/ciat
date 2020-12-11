package figures;

import org.eclipse.draw2d.ImageFigure;

import activator.PluginActivator;

public class ConcurrencyWithInformationFigure extends ImageFigure {
	
	public ConcurrencyWithInformationFigure() {
		super(PluginActivator.imageDescriptorFromPlugin(PluginActivator.ID,
				"images/ConcurrencyWithInformationPassingTransition.gif").createImage(), 0);
	}
}
