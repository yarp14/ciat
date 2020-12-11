package figures;

import org.eclipse.draw2d.ImageFigure;

import activator.PluginActivator;

public class OperationFigure extends ImageFigure {

	public OperationFigure() {
		super(PluginActivator.imageDescriptorFromPlugin(PluginActivator.ID,
				"images/Operations.gif").createImage(), 0);	
	}
}
