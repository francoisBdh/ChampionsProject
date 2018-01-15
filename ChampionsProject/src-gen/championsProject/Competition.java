/**
 */
package championsProject;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Competition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link championsProject.Competition#getType <em>Type</em>}</li>
 *   <li>{@link championsProject.Competition#getName <em>Name</em>}</li>
 *   <li>{@link championsProject.Competition#getTeam <em>Team</em>}</li>
 *   <li>{@link championsProject.Competition#getTrophy <em>Trophy</em>}</li>
 * </ul>
 *
 * @see championsProject.ChampionsProjectPackage#getCompetition()
 * @model
 * @generated
 */
public interface Competition extends EObject {
	/**
	 * Returns the value of the '<em><b>Trophy</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Trophy</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Trophy</em>' containment reference.
	 * @see #setTrophy(Trophy)
	 * @see championsProject.ChampionsProjectPackage#getCompetition_Trophy()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Trophy getTrophy();

	/**
	 * Sets the value of the '{@link championsProject.Competition#getTrophy <em>Trophy</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Trophy</em>' containment reference.
	 * @see #getTrophy()
	 * @generated
	 */
	void setTrophy(Trophy value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link championsProject.CompetitionType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see championsProject.CompetitionType
	 * @see #setType(CompetitionType)
	 * @see championsProject.ChampionsProjectPackage#getCompetition_Type()
	 * @model
	 * @generated
	 */
	CompetitionType getType();

	/**
	 * Sets the value of the '{@link championsProject.Competition#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see championsProject.CompetitionType
	 * @see #getType()
	 * @generated
	 */
	void setType(CompetitionType value);

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
	 * @see championsProject.ChampionsProjectPackage#getCompetition_Name()
	 * @model default=""
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link championsProject.Competition#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Team</b></em>' containment reference list.
	 * The list contents are of type {@link championsProject.Team}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Team</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Team</em>' containment reference list.
	 * @see championsProject.ChampionsProjectPackage#getCompetition_Team()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Team> getTeam();

} // Competition
