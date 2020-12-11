package figures;

import org.eclipse.draw2d.ImageFigure;

import activator.PluginActivator;

public class ExclusiveEditionFigure extends ImageFigure {

	public ExclusiveEditionFigure() {
		super(PluginActivator.imageDescriptorFromPlugin(PluginActivator.ID,
				"images/ExclusiveEdition.gif").createImage(), 0);
	}
}
