package figures;

import org.eclipse.draw2d.ImageFigure;

import activator.PluginActivator;

public class AttributeFigure extends ImageFigure {

	public AttributeFigure() {
		super(PluginActivator.imageDescriptorFromPlugin(PluginActivator.ID,
				"images/Attribute.gif").createImage(), 0);	
	}
}