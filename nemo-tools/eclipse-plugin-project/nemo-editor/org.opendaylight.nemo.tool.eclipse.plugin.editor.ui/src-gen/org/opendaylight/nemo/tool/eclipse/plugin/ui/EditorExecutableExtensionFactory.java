/*
 * generated by Xtext
 */
package org.opendaylight.nemo.tool.eclipse.plugin.ui;

import org.eclipse.xtext.ui.guice.AbstractGuiceAwareExecutableExtensionFactory;
import org.osgi.framework.Bundle;

import com.google.inject.Injector;

import org.opendaylight.nemo.tool.eclipse.plugin.ui.internal.EditorActivator;

/**
 * This class was generated. Customizations should only happen in a newly
 * introduced subclass. 
 */
public class EditorExecutableExtensionFactory extends AbstractGuiceAwareExecutableExtensionFactory {

	@Override
	protected Bundle getBundle() {
		return EditorActivator.getInstance().getBundle();
	}
	
	@Override
	protected Injector getInjector() {
		return EditorActivator.getInstance().getInjector(EditorActivator.ORG_OPENDAYLIGHT_NEMO_TOOL_ECLIPSE_PLUGIN_EDITOR);
	}
	
}
