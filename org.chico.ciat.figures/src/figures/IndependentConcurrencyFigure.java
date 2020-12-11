package figures;

import org.eclipse.draw2d.ImageFigure;

import activator.PluginActivator;

public class IndependentConcurrencyFigure extends ImageFigure {

	public IndependentConcurrencyFigure() {
		super(PluginActivator.imageDescriptorFromPlugin(PluginActivator.ID,
				"images/IndependentConcurrencyTransition.gif").createImage(), 0);
	}
}
