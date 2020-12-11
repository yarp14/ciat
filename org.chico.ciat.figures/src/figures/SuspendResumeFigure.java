package figures;

import org.eclipse.draw2d.ImageFigure;

import activator.PluginActivator;

public class SuspendResumeFigure extends ImageFigure {

	public SuspendResumeFigure() {
		super(PluginActivator.imageDescriptorFromPlugin(PluginActivator.ID,
				"images/SuspendResumeTransition.gif").createImage(), 0);
	}
}
