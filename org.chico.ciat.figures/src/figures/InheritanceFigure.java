package figures;

import org.eclipse.draw2d.ImageFigure;

import activator.PluginActivator;

public class InheritanceFigure extends ImageFigure {
	public InheritanceFigure() {
		super(PluginActivator.imageDescriptorFromPlugin(PluginActivator.ID,
			"images/Inheritance.gif").createImage(), 0);
	}
}
