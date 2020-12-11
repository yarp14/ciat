package figures;

import org.eclipse.draw2d.ImageFigure;

import activator.PluginActivator;

public class AggregationSharedObjectFigure extends ImageFigure {

	public AggregationSharedObjectFigure() {
		super(PluginActivator.imageDescriptorFromPlugin(PluginActivator.ID,
				"images/Aggregation.gif").createImage(), 0);	
	}
}
