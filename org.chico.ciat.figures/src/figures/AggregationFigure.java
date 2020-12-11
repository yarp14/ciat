package figures;

import org.eclipse.draw2d.ImageFigure;

import activator.PluginActivator;

public class AggregationFigure extends ImageFigure {

	public AggregationFigure() {
		super(PluginActivator.imageDescriptorFromPlugin(PluginActivator.ID,
				"images/AggregationTransition.gif").createImage(), 0);	
	}
}
