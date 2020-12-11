package figures;

import org.eclipse.draw2d.ImageFigure;

import activator.PluginActivator;

public class TraceabilityFigure extends ImageFigure {

	public TraceabilityFigure() {
		super(PluginActivator.imageDescriptorFromPlugin(PluginActivator.ID,
				"images/Traceability.gif").createImage(), 0);
	}
}
