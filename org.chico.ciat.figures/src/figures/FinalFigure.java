package figures;

import org.eclipse.draw2d.ImageFigure;

import activator.PluginActivator;

public class FinalFigure extends ImageFigure {

	public FinalFigure() {
		super(PluginActivator.imageDescriptorFromPlugin(PluginActivator.ID,
				"images/Final.gif").createImage(), 0);	
	}
}
