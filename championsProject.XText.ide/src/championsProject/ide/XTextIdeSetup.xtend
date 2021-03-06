/*
 * generated by Xtext 2.12.0
 */
package championsProject.ide

import championsProject.XTextRuntimeModule
import championsProject.XTextStandaloneSetup
import com.google.inject.Guice
import org.eclipse.xtext.util.Modules2

/**
 * Initialization support for running Xtext languages as language servers.
 */
class XTextIdeSetup extends XTextStandaloneSetup {

	override createInjector() {
		Guice.createInjector(Modules2.mixin(new XTextRuntimeModule, new XTextIdeModule))
	}
	
}
