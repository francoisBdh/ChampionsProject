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
 *   <li>{@link championsProject.Team#getPlayer <em>Player</em>}</li>
 *   <li>{@link championsProject.Team#getPresident <em>President</em>}</li>
 *   <li>{@link championsProject.Team#getCoach <em>Coach</em>}</li>
 *   <li>{@link championsProject.Team#getStadium <em>Stadium</em>}</li>
 *   <li>{@link championsProject.Team#getName <em>Name</em>}</li>
 *   <li>{@link championsProject.Team#getCompetition <em>Competition</em>}</li>
 *   <li>{@link championsProject.Team#getTrophy <em>Trophy</em>}</li>
 *   <li>{@link championsProject.Team#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see championsProject.ChampionsProjectPackage#getTeam()
 * @model
 * @generated
 */
public interface Team extends EObject {
	/**
	 * Returns the value of the '<em><b>Player</b></em>' reference list.
	 * The list contents are of type {@link championsProject.Player}.
	 * It is bidirectional and its opposite is '{@link championsProject.Player#getTeam <em>Team</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Player</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Player</em>' reference list.
	 * @see championsProject.ChampionsProjectPackage#getTeam_Player()
	 * @see championsProject.Player#getTeam
	 * @model opposite="team" required="true"
	 * @generated
	 */
	EList<Player> getPlayer();

	/**
	 * Returns the value of the '<em><b>President</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link championsProject.President#getTeam <em>Team</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>President</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>President</em>' reference.
	 * @see #setPresident(President)
	 * @see championsProject.ChampionsProjectPackage#getTeam_President()
	 * @see championsProject.President#getTeam
	 * @model opposite="team" required="true"
	 * @generated
	 */
	President getPresident();

	/**
	 * Sets the value of the '{@link championsProject.Team#getPresident <em>President</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>President</em>' reference.
	 * @see #getPresident()
	 * @generated
	 */
	void setPresident(President value);

	/**
	 * Returns the value of the '<em><b>Coach</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link championsProject.Coach#getTeam <em>Team</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Coach</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Coach</em>' reference.
	 * @see #setCoach(Coach)
	 * @see championsProject.ChampionsProjectPackage#getTeam_Coach()
	 * @see championsProject.Coach#getTeam
	 * @model opposite="team" required="true"
	 * @generated
	 */
	Coach getCoach();

	/**
	 * Sets the value of the '{@link championsProject.Team#getCoach <em>Coach</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Coach</em>' reference.
	 * @see #getCoach()
	 * @generated
	 */
	void setCoach(Coach value);

	/**
	 * Returns the value of the '<em><b>Stadium</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link championsProject.Stadium#getTeam <em>Team</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Stadium</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Stadium</em>' reference.
	 * @see #setStadium(Stadium)
	 * @see championsProject.ChampionsProjectPackage#getTeam_Stadium()
	 * @see championsProject.Stadium#getTeam
	 * @model opposite="team" required="true"
	 * @generated
	 */
	Stadium getStadium();

	/**
	 * Sets the value of the '{@link championsProject.Team#getStadium <em>Stadium</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Stadium</em>' reference.
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
	 * @model default="" dataType="org.eclipse.emf.ecore.xml.type.String"
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
	 * Returns the value of the '<em><b>Competition</b></em>' reference list.
	 * The list contents are of type {@link championsProject.Competition}.
	 * It is bidirectional and its opposite is '{@link championsProject.Competition#getTeam <em>Team</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Competition</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Competition</em>' reference list.
	 * @see championsProject.ChampionsProjectPackage#getTeam_Competition()
	 * @see championsProject.Competition#getTeam
	 * @model opposite="team" required="true"
	 * @generated
	 */
	EList<Competition> getCompetition();

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
