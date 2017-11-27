/**
 */
package championsProject;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Country</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link championsProject.Country#getCompetition <em>Competition</em>}</li>
 *   <li>{@link championsProject.Country#getPerson <em>Person</em>}</li>
 *   <li>{@link championsProject.Country#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see championsProject.ChampionsProjectPackage#getCountry()
 * @model
 * @generated
 */
public interface Country extends EObject {
	/**
	 * Returns the value of the '<em><b>Competition</b></em>' reference list.
	 * The list contents are of type {@link championsProject.Competition}.
	 * It is bidirectional and its opposite is '{@link championsProject.Competition#getCountry <em>Country</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Competition</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Competition</em>' reference list.
	 * @see championsProject.ChampionsProjectPackage#getCountry_Competition()
	 * @see championsProject.Competition#getCountry
	 * @model opposite="country"
	 * @generated
	 */
	EList<Competition> getCompetition();

	/**
	 * Returns the value of the '<em><b>Person</b></em>' reference list.
	 * The list contents are of type {@link championsProject.Person}.
	 * It is bidirectional and its opposite is '{@link championsProject.Person#getCountry <em>Country</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Person</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Person</em>' reference list.
	 * @see championsProject.ChampionsProjectPackage#getCountry_Person()
	 * @see championsProject.Person#getCountry
	 * @model opposite="country"
	 * @generated
	 */
	EList<Person> getPerson();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see championsProject.ChampionsProjectPackage#getCountry_Name()
	 * @model default=""
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link championsProject.Country#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // Country
