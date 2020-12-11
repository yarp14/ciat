package figures;

import org.eclipse.draw2d.ImageFigure;

import activator.PluginActivator;

public class DeterministicChoiceFigure extends ImageFigure {

	public DeterministicChoiceFigure() {
		super(PluginActivator.imageDescriptorFromPlugin(PluginActivator.ID,
				"images/DeterministicChoiceTransition.gif").createImage(), 0);
	}
}
