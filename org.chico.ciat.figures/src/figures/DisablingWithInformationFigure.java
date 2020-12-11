package figures;

import org.eclipse.draw2d.ImageFigure;

import activator.PluginActivator;

public class DisablingWithInformationFigure extends ImageFigure {

	public DisablingWithInformationFigure() {
		super(PluginActivator.imageDescriptorFromPlugin(PluginActivator.ID,
				"images/DisablingWithInformationPassingTransition.gif").createImage(), 0);
	}
}
