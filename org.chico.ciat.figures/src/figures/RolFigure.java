package figures;

import org.eclipse.draw2d.ImageFigure;

import activator.PluginActivator;

public class RolFigure extends ImageFigure {
	public RolFigure() {
		super(PluginActivator.imageDescriptorFromPlugin(PluginActivator.ID,
			"images/Rol.gif").createImage(), 0);
	}

}
