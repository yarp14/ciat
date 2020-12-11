package figures;

import org.eclipse.draw2d.ImageFigure;

import activator.PluginActivator;

public class IndividualVisualizationFigure extends ImageFigure {

	public IndividualVisualizationFigure() {
		super(PluginActivator.imageDescriptorFromPlugin(PluginActivator.ID,
				"images/IndividualVisualization.gif").createImage(), 0);
	}
}
