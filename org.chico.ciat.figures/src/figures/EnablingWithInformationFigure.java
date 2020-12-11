package figures;

import org.eclipse.draw2d.ImageFigure;

import activator.PluginActivator;

public class EnablingWithInformationFigure extends ImageFigure {

	public EnablingWithInformationFigure() {
		super(PluginActivator.imageDescriptorFromPlugin(PluginActivator.ID,
				"images/EnablingWithInformationPassingTransition.gif").createImage(), 0);
	}
}
