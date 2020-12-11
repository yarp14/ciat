package figures;

import org.eclipse.draw2d.ImageFigure;

import activator.PluginActivator;

public class AssociationFigure extends ImageFigure {
	public AssociationFigure() {
		super(PluginActivator.imageDescriptorFromPlugin(PluginActivator.ID,
			"images/Association.gif").createImage(), 0);
	}
}
