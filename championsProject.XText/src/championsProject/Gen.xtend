package championsProject

import java.io.FileOutputStream
import java.io.PrintStream
import org.eclipse.emf.common.util.URI
import org.eclipse.emf.ecore.EPackage
import org.eclipse.xtext.resource.IResourceServiceProvider
import org.eclipse.xtext.resource.XtextResourceSet
import org.eclipse.xtext.validation.CheckMode

class Gen {
	def static void main (String[] args) {
		
		// init EMF and xText
		EPackage.Registry.INSTANCE.put(ChampionsProjectPackage.eNS_URI, ChampionsProjectPackage.eINSTANCE);
		val injector = new XTextStandaloneSetup().createInjectorAndDoEMFRegistration()
		val resourceSet = injector.getInstance(XtextResourceSet)
		
		// load our file (written in our textual synthaxe)
		val xtexResource = resourceSet.getResource(URI.createFileURI("test.cpl"), true)
		
		// display errors in console
		val validator = IResourceServiceProvider.Registry.INSTANCE.getResourceServiceProvider(xtexResource.URI).resourceValidator
		validator.validate(xtexResource, CheckMode.ALL, null).forEach[e | println(e)]
		
		val out = new PrintStream(new FileOutputStream("test.html"))
		xtexResource.contents.forEach[e  | out.println((e as Fifa).toHTML)]
		out.close
		
	}
	
	static def toHTML(Fifa fifa) '''
			<html>
			<head>
			<link rel="stylesheet" type="text/css" href="style.css">
			</head>
				<body>
				<h1>Projet IDM ChampionsProject 2017 - 2018 </h1>
				«FOR c : fifa.country»
				<h2> «c.name» </h2>
				«FOR comp : c.competition»
					«comp.toHTML»
				«ENDFOR»
				«ENDFOR»
				</body>
			</html>
		'''
	
	static def toHTML(Competition comp) '''
		 <table border="1">
		 <h3> «comp.name»</h3>
		</br>
		<tr>
		«FOR t : comp.team»
		</tr>
		<th>
		«t.name»
		</th>
		<tr>
		
		
		</tr>
			<th>
			«t.toHTML»
			</th>
		</tr>
		«ENDFOR»
		</table>
	'''
	
	static def toHTML(Team t)'''
	     <table border="1">
	     	<tr>
	     	EFFECTIF
	     	</tr>
	     	<tr>
	     	<th>
	     	NOM
	     	</th>
	     	<th>
	     	AGE
	     	</th>
	     	<th>
	     	POSITION
	     	</th>
	     	<th>
	     	STATUS
	     	</th>
	     	<th>
	     	CONTRAT
	     	</th>
	     	</tr>
	    	<tr>
	    	«FOR p : t.player»
	    	</tr>
	    	
	    	<td>
	    	«p.name»
	    	</td>
	    	<td>
	    	«p.age» ans
	    	</td>
	    	<td>
	    	«p.position.getName»
	    	</td>
	    	<td>
	    	«p.status.getName»
	    	</td>
	    	<td>
	    	«p.contrat» ans
	    	</td>
	    	«ENDFOR»
	    </table>
	'''
	
}