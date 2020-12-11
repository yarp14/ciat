package figures;

import org.eclipse.draw2d.ImageFigure;

import activator.PluginActivator;

public class UndeterministicChoiceFigure extends ImageFigure {

	public UndeterministicChoiceFigure() {
		super(PluginActivator.imageDescriptorFromPlugin(PluginActivator.ID,
				"images/UndeterministicChoiceTransition.gif").createImage(), 0);
	}
}
