/**
 */
package championsProject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>President</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link championsProject.President#getTeam <em>Team</em>}</li>
 * </ul>
 *
 * @see championsProject.ChampionsProjectPackage#getPresident()
 * @model
 * @generated
 */
public interface President extends Person {
	/**
	 * Returns the value of the '<em><b>Team</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link championsProject.Team#getPresident <em>President</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Team</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Team</em>' reference.
	 * @see #setTeam(Team)
	 * @see championsProject.ChampionsProjectPackage#getPresident_Team()
	 * @see championsProject.Team#getPresident
	 * @model opposite="president"
	 * @generated
	 */
	Team getTeam();

	/**
	 * Sets the value of the '{@link championsProject.President#getTeam <em>Team</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Team</em>' reference.
	 * @see #getTeam()
	 * @generated
	 */
	void setTeam(Team value);

} // President
