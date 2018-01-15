/**
 */
package championsProject;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Team</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link championsProject.Team#getName <em>Name</em>}</li>
 *   <li>{@link championsProject.Team#getTrophy <em>Trophy</em>}</li>
 *   <li>{@link championsProject.Team#getType <em>Type</em>}</li>
 *   <li>{@link championsProject.Team#getPresident <em>President</em>}</li>
 *   <li>{@link championsProject.Team#getCoach <em>Coach</em>}</li>
 *   <li>{@link championsProject.Team#getPlayer <em>Player</em>}</li>
 *   <li>{@link championsProject.Team#getStadium <em>Stadium</em>}</li>
 * </ul>
 *
 * @see championsProject.ChampionsProjectPackage#getTeam()
 * @model
 * @generated
 */
public interface Team extends EObject {
	/**
	 * Returns the value of the '<em><b>Player</b></em>' containment reference list.
	 * The list contents are of type {@link championsProject.Player}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Player</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Player</em>' containment reference list.
	 * @see championsProject.ChampionsProjectPackage#getTeam_Player()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Player> getPlayer();

	/**
	 * Returns the value of the '<em><b>President</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>President</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>President</em>' containment reference.
	 * @see #setPresident(President)
	 * @see championsProject.ChampionsProjectPackage#getTeam_President()
	 * @model containment="true" required="true"
	 * @generated
	 */
	President getPresident();

	/**
	 * Sets the value of the '{@link championsProject.Team#getPresident <em>President</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>President</em>' containment reference.
	 * @see #getPresident()
	 * @generated
	 */
	void setPresident(President value);

	/**
	 * Returns the value of the '<em><b>Coach</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Coach</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Coach</em>' containment reference.
	 * @see #setCoach(Coach)
	 * @see championsProject.ChampionsProjectPackage#getTeam_Coach()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Coach getCoach();

	/**
	 * Sets the value of the '{@link championsProject.Team#getCoach <em>Coach</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Coach</em>' containment reference.
	 * @see #getCoach()
	 * @generated
	 */
	void setCoach(Coach value);

	/**
	 * Returns the value of the '<em><b>Stadium</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Stadium</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Stadium</em>' containment reference.
	 * @see #setStadium(Stadium)
	 * @see championsProject.ChampionsProjectPackage#getTeam_Stadium()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Stadium getStadium();

	/**
	 * Sets the value of the '{@link championsProject.Team#getStadium <em>Stadium</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Stadium</em>' containment reference.
	 * @see #getStadium()
	 * @generated
	 */
	void setStadium(Stadium value);

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
	 * @see championsProject.ChampionsProjectPackage#getTeam_Name()
	 * @model default=""
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link championsProject.Team#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Trophy</b></em>' reference list.
	 * The list contents are of type {@link championsProject.Trophy}.
	 * It is bidirectional and its opposite is '{@link championsProject.Trophy#getTeam <em>Team</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Trophy</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Trophy</em>' reference list.
	 * @see championsProject.ChampionsProjectPackage#getTeam_Trophy()
	 * @see championsProject.Trophy#getTeam
	 * @model opposite="team"
	 * @generated
	 */
	EList<Trophy> getTrophy();

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link championsProject.TeamType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see championsProject.TeamType
	 * @see #setType(TeamType)
	 * @see championsProject.ChampionsProjectPackage#getTeam_Type()
	 * @model
	 * @generated
	 */
	TeamType getType();

	/**
	 * Sets the value of the '{@link championsProject.Team#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see championsProject.TeamType
	 * @see #getType()
	 * @generated
	 */
	void setType(TeamType value);

} // Team
