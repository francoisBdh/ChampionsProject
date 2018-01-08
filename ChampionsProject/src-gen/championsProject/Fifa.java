/**
 */
package championsProject;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Fifa</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link championsProject.Fifa#getCountry <em>Country</em>}</li>
 * </ul>
 *
 * @see championsProject.ChampionsProjectPackage#getFifa()
 * @model
 * @generated
 */
public interface Fifa extends EObject {
	/**
	 * Returns the value of the '<em><b>Country</b></em>' containment reference list.
	 * The list contents are of type {@link championsProject.Country}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Country</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Country</em>' containment reference list.
	 * @see championsProject.ChampionsProjectPackage#getFifa_Country()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Country> getCountry();

} // Fifa
