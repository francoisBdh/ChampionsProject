/**
 */
package championsProject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Player</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link championsProject.Player#getTeam <em>Team</em>}</li>
 *   <li>{@link championsProject.Player#getPosition <em>Position</em>}</li>
 *   <li>{@link championsProject.Player#getStatus <em>Status</em>}</li>
 *   <li>{@link championsProject.Player#getContrat <em>Contrat</em>}</li>
 *   <li>{@link championsProject.Player#getAgent <em>Agent</em>}</li>
 * </ul>
 *
 * @see championsProject.ChampionsProjectPackage#getPlayer()
 * @model
 * @generated
 */
public interface Player extends Person {
	/**
	 * Returns the value of the '<em><b>Team</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link championsProject.Team#getPlayer <em>Player</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Team</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Team</em>' reference.
	 * @see #setTeam(Team)
	 * @see championsProject.ChampionsProjectPackage#getPlayer_Team()
	 * @see championsProject.Team#getPlayer
	 * @model opposite="player"
	 * @generated
	 */
	Team getTeam();

	/**
	 * Sets the value of the '{@link championsProject.Player#getTeam <em>Team</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Team</em>' reference.
	 * @see #getTeam()
	 * @generated
	 */
	void setTeam(Team value);

	/**
	 * Returns the value of the '<em><b>Position</b></em>' attribute.
	 * The literals are from the enumeration {@link championsProject.PlayerPosition}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Position</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Position</em>' attribute.
	 * @see championsProject.PlayerPosition
	 * @see #setPosition(PlayerPosition)
	 * @see championsProject.ChampionsProjectPackage#getPlayer_Position()
	 * @model
	 * @generated
	 */
	PlayerPosition getPosition();

	/**
	 * Sets the value of the '{@link championsProject.Player#getPosition <em>Position</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Position</em>' attribute.
	 * @see championsProject.PlayerPosition
	 * @see #getPosition()
	 * @generated
	 */
	void setPosition(PlayerPosition value);

	/**
	 * Returns the value of the '<em><b>Status</b></em>' attribute.
	 * The literals are from the enumeration {@link championsProject.PlayerStatus}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Status</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Status</em>' attribute.
	 * @see championsProject.PlayerStatus
	 * @see #setStatus(PlayerStatus)
	 * @see championsProject.ChampionsProjectPackage#getPlayer_Status()
	 * @model
	 * @generated
	 */
	PlayerStatus getStatus();

	/**
	 * Sets the value of the '{@link championsProject.Player#getStatus <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status</em>' attribute.
	 * @see championsProject.PlayerStatus
	 * @see #getStatus()
	 * @generated
	 */
	void setStatus(PlayerStatus value);

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
	 * @see championsProject.ChampionsProjectPackage#getPlayer_Contrat()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Int"
	 * @generated
	 */
	int getContrat();

	/**
	 * Sets the value of the '{@link championsProject.Player#getContrat <em>Contrat</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Contrat</em>' attribute.
	 * @see #getContrat()
	 * @generated
	 */
	void setContrat(int value);

	/**
	 * Returns the value of the '<em><b>Agent</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link championsProject.Agent#getPlayer <em>Player</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Agent</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Agent</em>' reference.
	 * @see #setAgent(Agent)
	 * @see championsProject.ChampionsProjectPackage#getPlayer_Agent()
	 * @see championsProject.Agent#getPlayer
	 * @model opposite="player"
	 * @generated
	 */
	Agent getAgent();

	/**
	 * Sets the value of the '{@link championsProject.Player#getAgent <em>Agent</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Agent</em>' reference.
	 * @see #getAgent()
	 * @generated
	 */
	void setAgent(Agent value);

} // Player
