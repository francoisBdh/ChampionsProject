/**
 */
package championsProject;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Stadium</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link championsProject.Stadium#getTeam <em>Team</em>}</li>
 *   <li>{@link championsProject.Stadium#getCapacity <em>Capacity</em>}</li>
 *   <li>{@link championsProject.Stadium#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see championsProject.ChampionsProjectPackage#getStadium()
 * @model
 * @generated
 */
public interface Stadium extends EObject {
	/**
	 * Returns the value of the '<em><b>Team</b></em>' reference list.
	 * The list contents are of type {@link championsProject.Team}.
	 * It is bidirectional and its opposite is '{@link championsProject.Team#getStadium <em>Stadium</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Team</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Team</em>' reference list.
	 * @see championsProject.ChampionsProjectPackage#getStadium_Team()
	 * @see championsProject.Team#getStadium
	 * @model opposite="stadium"
	 * @generated
	 */
	EList<Team> getTeam();

	/**
	 * Returns the value of the '<em><b>Capacity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Capacity</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Capacity</em>' attribute.
	 * @see #setCapacity(int)
	 * @see championsProject.ChampionsProjectPackage#getStadium_Capacity()
	 * @model
	 * @generated
	 */
	int getCapacity();

	/**
	 * Sets the value of the '{@link championsProject.Stadium#getCapacity <em>Capacity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Capacity</em>' attribute.
	 * @see #getCapacity()
	 * @generated
	 */
	void setCapacity(int value);

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
	 * @see championsProject.ChampionsProjectPackage#getStadium_Name()
	 * @model default=""
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link championsProject.Stadium#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // Stadium
