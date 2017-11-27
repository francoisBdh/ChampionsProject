/**
 */
package championsProject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Coach</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link championsProject.Coach#getTeam <em>Team</em>}</li>
 *   <li>{@link championsProject.Coach#getContrat <em>Contrat</em>}</li>
 *   <li>{@link championsProject.Coach#getAgent <em>Agent</em>}</li>
 * </ul>
 *
 * @see championsProject.ChampionsProjectPackage#getCoach()
 * @model
 * @generated
 */
public interface Coach extends Person {
	/**
	 * Returns the value of the '<em><b>Team</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link championsProject.Team#getCoach <em>Coach</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Team</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Team</em>' reference.
	 * @see #setTeam(Team)
	 * @see championsProject.ChampionsProjectPackage#getCoach_Team()
	 * @see championsProject.Team#getCoach
	 * @model opposite="coach"
	 * @generated
	 */
	Team getTeam();

	/**
	 * Sets the value of the '{@link championsProject.Coach#getTeam <em>Team</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Team</em>' reference.
	 * @see #getTeam()
	 * @generated
	 */
	void setTeam(Team value);

	/**
	 * Returns the value of the '<em><b>Contrat</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Contrat</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contrat</em>' attribute.
	 * @see #setContrat(int)
	 * @see championsProject.ChampionsProjectPackage#getCoach_Contrat()
	 * @model
	 * @generated
	 */
	int getContrat();

	/**
	 * Sets the value of the '{@link championsProject.Coach#getContrat <em>Contrat</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Contrat</em>' attribute.
	 * @see #getContrat()
	 * @generated
	 */
	void setContrat(int value);

	/**
	 * Returns the value of the '<em><b>Agent</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link championsProject.Agent#getCoach <em>Coach</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Agent</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Agent</em>' reference.
	 * @see #setAgent(Agent)
	 * @see championsProject.ChampionsProjectPackage#getCoach_Agent()
	 * @see championsProject.Agent#getCoach
	 * @model opposite="coach"
	 * @generated
	 */
	Agent getAgent();

	/**
	 * Sets the value of the '{@link championsProject.Coach#getAgent <em>Agent</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Agent</em>' reference.
	 * @see #getAgent()
	 * @generated
	 */
	void setAgent(Agent value);

} // Coach
