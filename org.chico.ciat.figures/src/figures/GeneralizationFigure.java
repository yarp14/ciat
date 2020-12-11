package figures;

import org.eclipse.draw2d.ImageFigure;

import activator.PluginActivator;

public class GeneralizationFigure extends ImageFigure {

	public GeneralizationFigure() {
		super(PluginActivator.imageDescriptorFromPlugin(PluginActivator.ID,
				"images/Generalization.gif").createImage(), 0);	
	}
}