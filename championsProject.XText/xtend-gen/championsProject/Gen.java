package championsProject;

import championsProject.ChampionsProjectPackage;
import championsProject.Competition;
import championsProject.Country;
import championsProject.Fifa;
import championsProject.Player;
import championsProject.Team;
import championsProject.XTextStandaloneSetup;
import com.google.inject.Injector;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.function.Consumer;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.resource.IResourceServiceProvider;
import org.eclipse.xtext.resource.XtextResourceSet;
import org.eclipse.xtext.validation.CheckMode;
import org.eclipse.xtext.validation.IResourceValidator;
import org.eclipse.xtext.validation.Issue;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.InputOutput;

@SuppressWarnings("all")
public class Gen {
  public static void main(final String[] args) {
    try {
      EPackage.Registry.INSTANCE.put(ChampionsProjectPackage.eNS_URI, ChampionsProjectPackage.eINSTANCE);
      final Injector injector = new XTextStandaloneSetup().createInjectorAndDoEMFRegistration();
      final XtextResourceSet resourceSet = injector.<XtextResourceSet>getInstance(XtextResourceSet.class);
      final Resource xtexResource = resourceSet.getResource(URI.createFileURI("test.cpl"), true);
      final IResourceValidator validator = IResourceServiceProvider.Registry.INSTANCE.getResourceServiceProvider(xtexResource.getURI()).getResourceValidator();
      final Consumer<Issue> _function = (Issue e) -> {
        InputOutput.<Issue>println(e);
      };
      validator.validate(xtexResource, CheckMode.ALL, null).forEach(_function);
      FileOutputStream _fileOutputStream = new FileOutputStream("test.html");
      final PrintStream out = new PrintStream(_fileOutputStream);
      final Consumer<EObject> _function_1 = (EObject e) -> {
        out.println(Gen.toHTML(((Fifa) e)));
      };
      xtexResource.getContents().forEach(_function_1);
      out.close();
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  public static CharSequence toHTML(final Fifa fifa) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<html>");
    _builder.newLine();
    _builder.append("<head>");
    _builder.newLine();
    _builder.append("<link rel=\"stylesheet\" type=\"text/css\" href=\"style.css\">");
    _builder.newLine();
    _builder.append("</head>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("<body>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("<h1>Projet IDM ChampionsProject 2017 - 2018 </h1>");
    _builder.newLine();
    {
      EList<Country> _country = fifa.getCountry();
      for(final Country c : _country) {
        _builder.append("\t");
        _builder.append("<h2> ");
        String _name = c.getName();
        _builder.append(_name, "\t");
        _builder.append(" </h2>");
        _builder.newLineIfNotEmpty();
        {
          EList<Competition> _competition = c.getCompetition();
          for(final Competition comp : _competition) {
            _builder.append("\t");
            CharSequence _hTML = Gen.toHTML(comp);
            _builder.append(_hTML, "\t");
            _builder.newLineIfNotEmpty();
          }
        }
      }
    }
    _builder.append("\t");
    _builder.append("</body>");
    _builder.newLine();
    _builder.append("</html>");
    _builder.newLine();
    return _builder;
  }
  
  public static CharSequence toHTML(final Competition comp) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append(" ");
    _builder.append("<table border=\"1\">");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("<h3> ");
    String _name = comp.getName();
    _builder.append(_name, " ");
    _builder.append("</h3>");
    _builder.newLineIfNotEmpty();
    _builder.append("</br>");
    _builder.newLine();
    _builder.append("<tr>");
    _builder.newLine();
    {
      EList<Team> _team = comp.getTeam();
      for(final Team t : _team) {
        _builder.append("</tr>");
        _builder.newLine();
        _builder.append("<th>");
        _builder.newLine();
        String _name_1 = t.getName();
        _builder.append(_name_1);
        _builder.newLineIfNotEmpty();
        _builder.append("</th>");
        _builder.newLine();
        _builder.append("<tr>");
        _builder.newLine();
        _builder.newLine();
        _builder.newLine();
        _builder.append("</tr>");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("<th>");
        _builder.newLine();
        _builder.append("\t");
        CharSequence _hTML = Gen.toHTML(t);
        _builder.append(_hTML, "\t");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.append("</th>");
        _builder.newLine();
        _builder.append("</tr>");
        _builder.newLine();
      }
    }
    _builder.append("</table>");
    _builder.newLine();
    return _builder;
  }
  
  public static CharSequence toHTML(final Team t) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append(" ");
    _builder.append("<table border=\"1\">");
    _builder.newLine();
    _builder.append(" \t");
    _builder.append("<tr>");
    _builder.newLine();
    _builder.append(" \t");
    _builder.append("EFFECTIF");
    _builder.newLine();
    _builder.append(" \t");
    _builder.append("</tr>");
    _builder.newLine();
    _builder.append(" \t");
    _builder.append("<tr>");
    _builder.newLine();
    _builder.append(" \t");
    _builder.append("<th>");
    _builder.newLine();
    _builder.append(" \t");
    _builder.append("NOM");
    _builder.newLine();
    _builder.append(" \t");
    _builder.append("</th>");
    _builder.newLine();
    _builder.append(" \t");
    _builder.append("<th>");
    _builder.newLine();
    _builder.append(" \t");
    _builder.append("AGE");
    _builder.newLine();
    _builder.append(" \t");
    _builder.append("</th>");
    _builder.newLine();
    _builder.append(" \t");
    _builder.append("<th>");
    _builder.newLine();
    _builder.append(" \t");
    _builder.append("POSITION");
    _builder.newLine();
    _builder.append(" \t");
    _builder.append("</th>");
    _builder.newLine();
    _builder.append(" \t");
    _builder.append("<th>");
    _builder.newLine();
    _builder.append(" \t");
    _builder.append("STATUS");
    _builder.newLine();
    _builder.append(" \t");
    _builder.append("</th>");
    _builder.newLine();
    _builder.append(" \t");
    _builder.append("<th>");
    _builder.newLine();
    _builder.append(" \t");
    _builder.append("CONTRAT");
    _builder.newLine();
    _builder.append(" \t");
    _builder.append("</th>");
    _builder.newLine();
    _builder.append(" \t");
    _builder.append("</tr>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("<tr>");
    _builder.newLine();
    {
      EList<Player> _player = t.getPlayer();
      for(final Player p : _player) {
        _builder.append("\t");
        _builder.append("</tr>");
        _builder.newLine();
        _builder.append("\t");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("<td>");
        _builder.newLine();
        _builder.append("\t");
        String _name = p.getName();
        _builder.append(_name, "\t");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.append("</td>");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("<td>");
        _builder.newLine();
        _builder.append("\t");
        int _age = p.getAge();
        _builder.append(_age, "\t");
        _builder.append(" ans");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.append("</td>");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("<td>");
        _builder.newLine();
        _builder.append("\t");
        String _name_1 = p.getPosition().getName();
        _builder.append(_name_1, "\t");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.append("</td>");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("<td>");
        _builder.newLine();
        _builder.append("\t");
        String _name_2 = p.getStatus().getName();
        _builder.append(_name_2, "\t");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.append("</td>");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("<td>");
        _builder.newLine();
        _builder.append("\t");
        int _contrat = p.getContrat();
        _builder.append(_contrat, "\t");
        _builder.append(" ans");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.append("</td>");
        _builder.newLine();
      }
    }
    _builder.append("</table>");
    _builder.newLine();
    return _builder;
  }
}
