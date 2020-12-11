package figures;

import org.eclipse.draw2d.ImageFigure;

import activator.PluginActivator;

public class CompositionFigure extends ImageFigure {

	public CompositionFigure() {
		super(PluginActivator.imageDescriptorFromPlugin(PluginActivator.ID,
				"images/Composition.gif").createImage(), 0);	
	}
}