/**
 */
package championsProject;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Agent</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link championsProject.Agent#getPlayer <em>Player</em>}</li>
 *   <li>{@link championsProject.Agent#getCoach <em>Coach</em>}</li>
 * </ul>
 *
 * @see championsProject.ChampionsProjectPackage#getAgent()
 * @model
 * @generated
 */
public interface Agent extends Person {
	/**
	 * Returns the value of the '<em><b>Player</b></em>' reference list.
	 * The list contents are of type {@link championsProject.Player}.
	 * It is bidirectional and its opposite is '{@link championsProject.Player#getAgent <em>Agent</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Player</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Player</em>' reference list.
	 * @see championsProject.ChampionsProjectPackage#getAgent_Player()
	 * @see championsProject.Player#getAgent
	 * @model opposite="agent"
	 * @generated
	 */
	EList<Player> getPlayer();

	/**
	 * Returns the value of the '<em><b>Coach</b></em>' reference list.
	 * The list contents are of type {@link championsProject.Coach}.
	 * It is bidirectional and its opposite is '{@link championsProject.Coach#getAgent <em>Agent</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Coach</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Coach</em>' reference list.
	 * @see championsProject.ChampionsProjectPackage#getAgent_Coach()
	 * @see championsProject.Coach#getAgent
	 * @model opposite="agent"
	 * @generated
	 */
	EList<Coach> getCoach();

} // Agent
