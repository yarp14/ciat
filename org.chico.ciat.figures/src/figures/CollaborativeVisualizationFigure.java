package figures;

import org.eclipse.draw2d.ImageFigure;

import activator.PluginActivator;

public class CollaborativeVisualizationFigure extends ImageFigure {

	public CollaborativeVisualizationFigure() {
		super(PluginActivator.imageDescriptorFromPlugin(PluginActivator.ID,
				"images/CollaborativeVisualization.gif").createImage(), 0);
	}
}
