/**
 */
package championsProject;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see championsProject.ChampionsProjectFactory
 * @model kind="package"
 * @generated
 */
public interface ChampionsProjectPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "championsProject";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/championsProject";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "championsProject";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ChampionsProjectPackage eINSTANCE = championsProject.impl.ChampionsProjectPackageImpl.init();

	/**
	 * The meta object id for the '{@link championsProject.impl.TeamImpl <em>Team</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see championsProject.impl.TeamImpl
	 * @see championsProject.impl.ChampionsProjectPackageImpl#getTeam()
	 * @generated
	 */
	int TEAM = 0;

	/**
	 * The feature id for the '<em><b>Player</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEAM__PLAYER = 0;

	/**
	 * The feature id for the '<em><b>President</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEAM__PRESIDENT = 1;

	/**
	 * The feature id for the '<em><b>Coach</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEAM__COACH = 2;

	/**
	 * The feature id for the '<em><b>Stadium</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEAM__STADIUM = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEAM__NAME = 4;

	/**
	 * The feature id for the '<em><b>Competition</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEAM__COMPETITION = 5;

	/**
	 * The feature id for the '<em><b>Trophy</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEAM__TROPHY = 6;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEAM__TYPE = 7;

	/**
	 * The number of structural features of the '<em>Team</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEAM_FEATURE_COUNT = 8;

	/**
	 * The number of operations of the '<em>Team</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEAM_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link championsProject.impl.CountryImpl <em>Country</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see championsProject.impl.CountryImpl
	 * @see championsProject.impl.ChampionsProjectPackageImpl#getCountry()
	 * @generated
	 */
	int COUNTRY = 1;

	/**
	 * The feature id for the '<em><b>Competition</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNTRY__COMPETITION = 0;

	/**
	 * The feature id for the '<em><b>Person</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNTRY__PERSON = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNTRY__NAME = 2;

	/**
	 * The number of structural features of the '<em>Country</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNTRY_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Country</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNTRY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link championsProject.impl.PersonImpl <em>Person</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see championsProject.impl.PersonImpl
	 * @see championsProject.impl.ChampionsProjectPackageImpl#getPerson()
	 * @generated
	 */
	int PERSON = 2;

	/**
	 * The feature id for the '<em><b>Age</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__AGE = 0;

	/**
	 * The feature id for the '<em><b>Country</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__COUNTRY = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__NAME = 2;

	/**
	 * The number of structural features of the '<em>Person</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Person</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link championsProject.impl.PlayerImpl <em>Player</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see championsProject.impl.PlayerImpl
	 * @see championsProject.impl.ChampionsProjectPackageImpl#getPlayer()
	 * @generated
	 */
	int PLAYER = 3;

	/**
	 * The feature id for the '<em><b>Age</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAYER__AGE = PERSON__AGE;

	/**
	 * The feature id for the '<em><b>Country</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAYER__COUNTRY = PERSON__COUNTRY;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAYER__NAME = PERSON__NAME;

	/**
	 * The feature id for the '<em><b>Team</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAYER__TEAM = PERSON_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Position</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAYER__POSITION = PERSON_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAYER__STATUS = PERSON_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Contrat</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAYER__CONTRAT = PERSON_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Agent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAYER__AGENT = PERSON_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Player</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAYER_FEATURE_COUNT = PERSON_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Player</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAYER_OPERATION_COUNT = PERSON_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link championsProject.impl.CompetitionImpl <em>Competition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see championsProject.impl.CompetitionImpl
	 * @see championsProject.impl.ChampionsProjectPackageImpl#getCompetition()
	 * @generated
	 */
	int COMPETITION = 4;

	/**
	 * The feature id for the '<em><b>Country</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPETITION__COUNTRY = 0;

	/**
	 * The feature id for the '<em><b>Trophy</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPETITION__TROPHY = 1;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPETITION__TYPE = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPETITION__NAME = 3;

	/**
	 * The feature id for the '<em><b>Team</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPETITION__TEAM = 4;

	/**
	 * The number of structural features of the '<em>Competition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPETITION_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Competition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPETITION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link championsProject.impl.PresidentImpl <em>President</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see championsProject.impl.PresidentImpl
	 * @see championsProject.impl.ChampionsProjectPackageImpl#getPresident()
	 * @generated
	 */
	int PRESIDENT = 5;

	/**
	 * The feature id for the '<em><b>Age</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRESIDENT__AGE = PERSON__AGE;

	/**
	 * The feature id for the '<em><b>Country</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRESIDENT__COUNTRY = PERSON__COUNTRY;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRESIDENT__NAME = PERSON__NAME;

	/**
	 * The feature id for the '<em><b>Team</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRESIDENT__TEAM = PERSON_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>President</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRESIDENT_FEATURE_COUNT = PERSON_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>President</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRESIDENT_OPERATION_COUNT = PERSON_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link championsProject.impl.CoachImpl <em>Coach</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see championsProject.impl.CoachImpl
	 * @see championsProject.impl.ChampionsProjectPackageImpl#getCoach()
	 * @generated
	 */
	int COACH = 6;

	/**
	 * The feature id for the '<em><b>Age</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COACH__AGE = PERSON__AGE;

	/**
	 * The feature id for the '<em><b>Country</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COACH__COUNTRY = PERSON__COUNTRY;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COACH__NAME = PERSON__NAME;

	/**
	 * The feature id for the '<em><b>Team</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COACH__TEAM = PERSON_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Contrat</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COACH__CONTRAT = PERSON_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Agent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COACH__AGENT = PERSON_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Coach</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COACH_FEATURE_COUNT = PERSON_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Coach</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COACH_OPERATION_COUNT = PERSON_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link championsProject.impl.StadiumImpl <em>Stadium</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see championsProject.impl.StadiumImpl
	 * @see championsProject.impl.ChampionsProjectPackageImpl#getStadium()
	 * @generated
	 */
	int STADIUM = 7;

	/**
	 * The feature id for the '<em><b>Team</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STADIUM__TEAM = 0;

	/**
	 * The feature id for the '<em><b>Capacity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STADIUM__CAPACITY = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STADIUM__NAME = 2;

	/**
	 * The number of structural features of the '<em>Stadium</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STADIUM_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Stadium</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STADIUM_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link championsProject.impl.TrophyImpl <em>Trophy</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see championsProject.impl.TrophyImpl
	 * @see championsProject.impl.ChampionsProjectPackageImpl#getTrophy()
	 * @generated
	 */
	int TROPHY = 8;

	/**
	 * The feature id for the '<em><b>Competition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TROPHY__COMPETITION = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TROPHY__NAME = 1;

	/**
	 * The feature id for the '<em><b>Team</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TROPHY__TEAM = 2;

	/**
	 * The number of structural features of the '<em>Trophy</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TROPHY_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Trophy</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TROPHY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link championsProject.impl.AgentImpl <em>Agent</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see championsProject.impl.AgentImpl
	 * @see championsProject.impl.ChampionsProjectPackageImpl#getAgent()
	 * @generated
	 */
	int AGENT = 9;

	/**
	 * The feature id for the '<em><b>Age</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENT__AGE = PERSON__AGE;

	/**
	 * The feature id for the '<em><b>Country</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENT__COUNTRY = PERSON__COUNTRY;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENT__NAME = PERSON__NAME;

	/**
	 * The feature id for the '<em><b>Player</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENT__PLAYER = PERSON_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Coach</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENT__COACH = PERSON_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Agent</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENT_FEATURE_COUNT = PERSON_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Agent</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENT_OPERATION_COUNT = PERSON_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link championsProject.PlayerStatus <em>Player Status</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see championsProject.PlayerStatus
	 * @see championsProject.impl.ChampionsProjectPackageImpl#getPlayerStatus()
	 * @generated
	 */
	int PLAYER_STATUS = 10;

	/**
	 * The meta object id for the '{@link championsProject.PlayerPosition <em>Player Position</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see championsProject.PlayerPosition
	 * @see championsProject.impl.ChampionsProjectPackageImpl#getPlayerPosition()
	 * @generated
	 */
	int PLAYER_POSITION = 11;

	/**
	 * The meta object id for the '{@link championsProject.CompetitionType <em>Competition Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see championsProject.CompetitionType
	 * @see championsProject.impl.ChampionsProjectPackageImpl#getCompetitionType()
	 * @generated
	 */
	int COMPETITION_TYPE = 12;

	/**
	 * The meta object id for the '{@link championsProject.TeamType <em>Team Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see championsProject.TeamType
	 * @see championsProject.impl.ChampionsProjectPackageImpl#getTeamType()
	 * @generated
	 */
	int TEAM_TYPE = 13;

	/**
	 * Returns the meta object for class '{@link championsProject.Team <em>Team</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Team</em>'.
	 * @see championsProject.Team
	 * @generated
	 */
	EClass getTeam();

	/**
	 * Returns the meta object for the reference list '{@link championsProject.Team#getPlayer <em>Player</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Player</em>'.
	 * @see championsProject.Team#getPlayer()
	 * @see #getTeam()
	 * @generated
	 */
	EReference getTeam_Player();

	/**
	 * Returns the meta object for the reference '{@link championsProject.Team#getPresident <em>President</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>President</em>'.
	 * @see championsProject.Team#getPresident()
	 * @see #getTeam()
	 * @generated
	 */
	EReference getTeam_President();

	/**
	 * Returns the meta object for the reference '{@link championsProject.Team#getCoach <em>Coach</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Coach</em>'.
	 * @see championsProject.Team#getCoach()
	 * @see #getTeam()
	 * @generated
	 */
	EReference getTeam_Coach();

	/**
	 * Returns the meta object for the reference '{@link championsProject.Team#getStadium <em>Stadium</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Stadium</em>'.
	 * @see championsProject.Team#getStadium()
	 * @see #getTeam()
	 * @generated
	 */
	EReference getTeam_Stadium();

	/**
	 * Returns the meta object for the attribute '{@link championsProject.Team#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see championsProject.Team#getName()
	 * @see #getTeam()
	 * @generated
	 */
	EAttribute getTeam_Name();

	/**
	 * Returns the meta object for the reference list '{@link championsProject.Team#getCompetition <em>Competition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Competition</em>'.
	 * @see championsProject.Team#getCompetition()
	 * @see #getTeam()
	 * @generated
	 */
	EReference getTeam_Competition();

	/**
	 * Returns the meta object for the reference list '{@link championsProject.Team#getTrophy <em>Trophy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Trophy</em>'.
	 * @see championsProject.Team#getTrophy()
	 * @see #getTeam()
	 * @generated
	 */
	EReference getTeam_Trophy();

	/**
	 * Returns the meta object for the attribute '{@link championsProject.Team#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see championsProject.Team#getType()
	 * @see #getTeam()
	 * @generated
	 */
	EAttribute getTeam_Type();

	/**
	 * Returns the meta object for class '{@link championsProject.Country <em>Country</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Country</em>'.
	 * @see championsProject.Country
	 * @generated
	 */
	EClass getCountry();

	/**
	 * Returns the meta object for the reference list '{@link championsProject.Country#getCompetition <em>Competition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Competition</em>'.
	 * @see championsProject.Country#getCompetition()
	 * @see #getCountry()
	 * @generated
	 */
	EReference getCountry_Competition();

	/**
	 * Returns the meta object for the reference list '{@link championsProject.Country#getPerson <em>Person</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Person</em>'.
	 * @see championsProject.Country#getPerson()
	 * @see #getCountry()
	 * @generated
	 */
	EReference getCountry_Person();

	/**
	 * Returns the meta object for the attribute '{@link championsProject.Country#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see championsProject.Country#getName()
	 * @see #getCountry()
	 * @generated
	 */
	EAttribute getCountry_Name();

	/**
	 * Returns the meta object for class '{@link championsProject.Person <em>Person</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Person</em>'.
	 * @see championsProject.Person
	 * @generated
	 */
	EClass getPerson();

	/**
	 * Returns the meta object for the attribute '{@link championsProject.Person#getAge <em>Age</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Age</em>'.
	 * @see championsProject.Person#getAge()
	 * @see #getPerson()
	 * @generated
	 */
	EAttribute getPerson_Age();

	/**
	 * Returns the meta object for the reference '{@link championsProject.Person#getCountry <em>Country</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Country</em>'.
	 * @see championsProject.Person#getCountry()
	 * @see #getPerson()
	 * @generated
	 */
	EReference getPerson_Country();

	/**
	 * Returns the meta object for the attribute '{@link championsProject.Person#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see championsProject.Person#getName()
	 * @see #getPerson()
	 * @generated
	 */
	EAttribute getPerson_Name();

	/**
	 * Returns the meta object for class '{@link championsProject.Player <em>Player</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Player</em>'.
	 * @see championsProject.Player
	 * @generated
	 */
	EClass getPlayer();

	/**
	 * Returns the meta object for the reference '{@link championsProject.Player#getTeam <em>Team</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Team</em>'.
	 * @see championsProject.Player#getTeam()
	 * @see #getPlayer()
	 * @generated
	 */
	EReference getPlayer_Team();

	/**
	 * Returns the meta object for the attribute '{@link championsProject.Player#getPosition <em>Position</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Position</em>'.
	 * @see championsProject.Player#getPosition()
	 * @see #getPlayer()
	 * @generated
	 */
	EAttribute getPlayer_Position();

	/**
	 * Returns the meta object for the attribute '{@link championsProject.Player#getStatus <em>Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Status</em>'.
	 * @see championsProject.Player#getStatus()
	 * @see #getPlayer()
	 * @generated
	 */
	EAttribute getPlayer_Status();

	/**
	 * Returns the meta object for the attribute '{@link championsProject.Player#getContrat <em>Contrat</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Contrat</em>'.
	 * @see championsProject.Player#getContrat()
	 * @see #getPlayer()
	 * @generated
	 */
	EAttribute getPlayer_Contrat();

	/**
	 * Returns the meta object for the reference '{@link championsProject.Player#getAgent <em>Agent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Agent</em>'.
	 * @see championsProject.Player#getAgent()
	 * @see #getPlayer()
	 * @generated
	 */
	EReference getPlayer_Agent();

	/**
	 * Returns the meta object for class '{@link championsProject.Competition <em>Competition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Competition</em>'.
	 * @see championsProject.Competition
	 * @generated
	 */
	EClass getCompetition();

	/**
	 * Returns the meta object for the reference '{@link championsProject.Competition#getCountry <em>Country</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Country</em>'.
	 * @see championsProject.Competition#getCountry()
	 * @see #getCompetition()
	 * @generated
	 */
	EReference getCompetition_Country();

	/**
	 * Returns the meta object for the reference '{@link championsProject.Competition#getTrophy <em>Trophy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Trophy</em>'.
	 * @see championsProject.Competition#getTrophy()
	 * @see #getCompetition()
	 * @generated
	 */
	EReference getCompetition_Trophy();

	/**
	 * Returns the meta object for the attribute '{@link championsProject.Competition#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see championsProject.Competition#getType()
	 * @see #getCompetition()
	 * @generated
	 */
	EAttribute getCompetition_Type();

	/**
	 * Returns the meta object for the attribute '{@link championsProject.Competition#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see championsProject.Competition#getName()
	 * @see #getCompetition()
	 * @generated
	 */
	EAttribute getCompetition_Name();

	/**
	 * Returns the meta object for the reference list '{@link championsProject.Competition#getTeam <em>Team</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Team</em>'.
	 * @see championsProject.Competition#getTeam()
	 * @see #getCompetition()
	 * @generated
	 */
	EReference getCompetition_Team();

	/**
	 * Returns the meta object for class '{@link championsProject.President <em>President</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>President</em>'.
	 * @see championsProject.President
	 * @generated
	 */
	EClass getPresident();

	/**
	 * Returns the meta object for the reference '{@link championsProject.President#getTeam <em>Team</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Team</em>'.
	 * @see championsProject.President#getTeam()
	 * @see #getPresident()
	 * @generated
	 */
	EReference getPresident_Team();

	/**
	 * Returns the meta object for class '{@link championsProject.Coach <em>Coach</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Coach</em>'.
	 * @see championsProject.Coach
	 * @generated
	 */
	EClass getCoach();

	/**
	 * Returns the meta object for the reference '{@link championsProject.Coach#getTeam <em>Team</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Team</em>'.
	 * @see championsProject.Coach#getTeam()
	 * @see #getCoach()
	 * @generated
	 */
	EReference getCoach_Team();

	/**
	 * Returns the meta object for the attribute '{@link championsProject.Coach#getContrat <em>Contrat</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Contrat</em>'.
	 * @see championsProject.Coach#getContrat()
	 * @see #getCoach()
	 * @generated
	 */
	EAttribute getCoach_Contrat();

	/**
	 * Returns the meta object for the reference '{@link championsProject.Coach#getAgent <em>Agent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Agent</em>'.
	 * @see championsProject.Coach#getAgent()
	 * @see #getCoach()
	 * @generated
	 */
	EReference getCoach_Agent();

	/**
	 * Returns the meta object for class '{@link championsProject.Stadium <em>Stadium</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Stadium</em>'.
	 * @see championsProject.Stadium
	 * @generated
	 */
	EClass getStadium();

	/**
	 * Returns the meta object for the reference list '{@link championsProject.Stadium#getTeam <em>Team</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Team</em>'.
	 * @see championsProject.Stadium#getTeam()
	 * @see #getStadium()
	 * @generated
	 */
	EReference getStadium_Team();

	/**
	 * Returns the meta object for the attribute '{@link championsProject.Stadium#getCapacity <em>Capacity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Capacity</em>'.
	 * @see championsProject.Stadium#getCapacity()
	 * @see #getStadium()
	 * @generated
	 */
	EAttribute getStadium_Capacity();

	/**
	 * Returns the meta object for the attribute '{@link championsProject.Stadium#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see championsProject.Stadium#getName()
	 * @see #getStadium()
	 * @generated
	 */
	EAttribute getStadium_Name();

	/**
	 * Returns the meta object for class '{@link championsProject.Trophy <em>Trophy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Trophy</em>'.
	 * @see championsProject.Trophy
	 * @generated
	 */
	EClass getTrophy();

	/**
	 * Returns the meta object for the reference '{@link championsProject.Trophy#getCompetition <em>Competition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Competition</em>'.
	 * @see championsProject.Trophy#getCompetition()
	 * @see #getTrophy()
	 * @generated
	 */
	EReference getTrophy_Competition();

	/**
	 * Returns the meta object for the attribute '{@link championsProject.Trophy#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see championsProject.Trophy#getName()
	 * @see #getTrophy()
	 * @generated
	 */
	EAttribute getTrophy_Name();

	/**
	 * Returns the meta object for the reference list '{@link championsProject.Trophy#getTeam <em>Team</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Team</em>'.
	 * @see championsProject.Trophy#getTeam()
	 * @see #getTrophy()
	 * @generated
	 */
	EReference getTrophy_Team();

	/**
	 * Returns the meta object for class '{@link championsProject.Agent <em>Agent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Agent</em>'.
	 * @see championsProject.Agent
	 * @generated
	 */
	EClass getAgent();

	/**
	 * Returns the meta object for the reference list '{@link championsProject.Agent#getPlayer <em>Player</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Player</em>'.
	 * @see championsProject.Agent#getPlayer()
	 * @see #getAgent()
	 * @generated
	 */
	EReference getAgent_Player();

	/**
	 * Returns the meta object for the reference list '{@link championsProject.Agent#getCoach <em>Coach</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Coach</em>'.
	 * @see championsProject.Agent#getCoach()
	 * @see #getAgent()
	 * @generated
	 */
	EReference getAgent_Coach();

	/**
	 * Returns the meta object for enum '{@link championsProject.PlayerStatus <em>Player Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Player Status</em>'.
	 * @see championsProject.PlayerStatus
	 * @generated
	 */
	EEnum getPlayerStatus();

	/**
	 * Returns the meta object for enum '{@link championsProject.PlayerPosition <em>Player Position</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Player Position</em>'.
	 * @see championsProject.PlayerPosition
	 * @generated
	 */
	EEnum getPlayerPosition();

	/**
	 * Returns the meta object for enum '{@link championsProject.CompetitionType <em>Competition Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Competition Type</em>'.
	 * @see championsProject.CompetitionType
	 * @generated
	 */
	EEnum getCompetitionType();

	/**
	 * Returns the meta object for enum '{@link championsProject.TeamType <em>Team Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Team Type</em>'.
	 * @see championsProject.TeamType
	 * @generated
	 */
	EEnum getTeamType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ChampionsProjectFactory getChampionsProjectFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link championsProject.impl.TeamImpl <em>Team</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see championsProject.impl.TeamImpl
		 * @see championsProject.impl.ChampionsProjectPackageImpl#getTeam()
		 * @generated
		 */
		EClass TEAM = eINSTANCE.getTeam();

		/**
		 * The meta object literal for the '<em><b>Player</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEAM__PLAYER = eINSTANCE.getTeam_Player();

		/**
		 * The meta object literal for the '<em><b>President</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEAM__PRESIDENT = eINSTANCE.getTeam_President();

		/**
		 * The meta object literal for the '<em><b>Coach</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEAM__COACH = eINSTANCE.getTeam_Coach();

		/**
		 * The meta object literal for the '<em><b>Stadium</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEAM__STADIUM = eINSTANCE.getTeam_Stadium();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEAM__NAME = eINSTANCE.getTeam_Name();

		/**
		 * The meta object literal for the '<em><b>Competition</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEAM__COMPETITION = eINSTANCE.getTeam_Competition();

		/**
		 * The meta object literal for the '<em><b>Trophy</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEAM__TROPHY = eINSTANCE.getTeam_Trophy();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEAM__TYPE = eINSTANCE.getTeam_Type();

		/**
		 * The meta object literal for the '{@link championsProject.impl.CountryImpl <em>Country</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see championsProject.impl.CountryImpl
		 * @see championsProject.impl.ChampionsProjectPackageImpl#getCountry()
		 * @generated
		 */
		EClass COUNTRY = eINSTANCE.getCountry();

		/**
		 * The meta object literal for the '<em><b>Competition</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COUNTRY__COMPETITION = eINSTANCE.getCountry_Competition();

		/**
		 * The meta object literal for the '<em><b>Person</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COUNTRY__PERSON = eINSTANCE.getCountry_Person();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COUNTRY__NAME = eINSTANCE.getCountry_Name();

		/**
		 * The meta object literal for the '{@link championsProject.impl.PersonImpl <em>Person</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see championsProject.impl.PersonImpl
		 * @see championsProject.impl.ChampionsProjectPackageImpl#getPerson()
		 * @generated
		 */
		EClass PERSON = eINSTANCE.getPerson();

		/**
		 * The meta object literal for the '<em><b>Age</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSON__AGE = eINSTANCE.getPerson_Age();

		/**
		 * The meta object literal for the '<em><b>Country</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PERSON__COUNTRY = eINSTANCE.getPerson_Country();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSON__NAME = eINSTANCE.getPerson_Name();

		/**
		 * The meta object literal for the '{@link championsProject.impl.PlayerImpl <em>Player</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see championsProject.impl.PlayerImpl
		 * @see championsProject.impl.ChampionsProjectPackageImpl#getPlayer()
		 * @generated
		 */
		EClass PLAYER = eINSTANCE.getPlayer();

		/**
		 * The meta object literal for the '<em><b>Team</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PLAYER__TEAM = eINSTANCE.getPlayer_Team();

		/**
		 * The meta object literal for the '<em><b>Position</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PLAYER__POSITION = eINSTANCE.getPlayer_Position();

		/**
		 * The meta object literal for the '<em><b>Status</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PLAYER__STATUS = eINSTANCE.getPlayer_Status();

		/**
		 * The meta object literal for the '<em><b>Contrat</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PLAYER__CONTRAT = eINSTANCE.getPlayer_Contrat();

		/**
		 * The meta object literal for the '<em><b>Agent</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PLAYER__AGENT = eINSTANCE.getPlayer_Agent();

		/**
		 * The meta object literal for the '{@link championsProject.impl.CompetitionImpl <em>Competition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see championsProject.impl.CompetitionImpl
		 * @see championsProject.impl.ChampionsProjectPackageImpl#getCompetition()
		 * @generated
		 */
		EClass COMPETITION = eINSTANCE.getCompetition();

		/**
		 * The meta object literal for the '<em><b>Country</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPETITION__COUNTRY = eINSTANCE.getCompetition_Country();

		/**
		 * The meta object literal for the '<em><b>Trophy</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPETITION__TROPHY = eINSTANCE.getCompetition_Trophy();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPETITION__TYPE = eINSTANCE.getCompetition_Type();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPETITION__NAME = eINSTANCE.getCompetition_Name();

		/**
		 * The meta object literal for the '<em><b>Team</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPETITION__TEAM = eINSTANCE.getCompetition_Team();

		/**
		 * The meta object literal for the '{@link championsProject.impl.PresidentImpl <em>President</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see championsProject.impl.PresidentImpl
		 * @see championsProject.impl.ChampionsProjectPackageImpl#getPresident()
		 * @generated
		 */
		EClass PRESIDENT = eINSTANCE.getPresident();

		/**
		 * The meta object literal for the '<em><b>Team</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRESIDENT__TEAM = eINSTANCE.getPresident_Team();

		/**
		 * The meta object literal for the '{@link championsProject.impl.CoachImpl <em>Coach</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see championsProject.impl.CoachImpl
		 * @see championsProject.impl.ChampionsProjectPackageImpl#getCoach()
		 * @generated
		 */
		EClass COACH = eINSTANCE.getCoach();

		/**
		 * The meta object literal for the '<em><b>Team</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COACH__TEAM = eINSTANCE.getCoach_Team();

		/**
		 * The meta object literal for the '<em><b>Contrat</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COACH__CONTRAT = eINSTANCE.getCoach_Contrat();

		/**
		 * The meta object literal for the '<em><b>Agent</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COACH__AGENT = eINSTANCE.getCoach_Agent();

		/**
		 * The meta object literal for the '{@link championsProject.impl.StadiumImpl <em>Stadium</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see championsProject.impl.StadiumImpl
		 * @see championsProject.impl.ChampionsProjectPackageImpl#getStadium()
		 * @generated
		 */
		EClass STADIUM = eINSTANCE.getStadium();

		/**
		 * The meta object literal for the '<em><b>Team</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STADIUM__TEAM = eINSTANCE.getStadium_Team();

		/**
		 * The meta object literal for the '<em><b>Capacity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STADIUM__CAPACITY = eINSTANCE.getStadium_Capacity();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STADIUM__NAME = eINSTANCE.getStadium_Name();

		/**
		 * The meta object literal for the '{@link championsProject.impl.TrophyImpl <em>Trophy</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see championsProject.impl.TrophyImpl
		 * @see championsProject.impl.ChampionsProjectPackageImpl#getTrophy()
		 * @generated
		 */
		EClass TROPHY = eINSTANCE.getTrophy();

		/**
		 * The meta object literal for the '<em><b>Competition</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TROPHY__COMPETITION = eINSTANCE.getTrophy_Competition();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TROPHY__NAME = eINSTANCE.getTrophy_Name();

		/**
		 * The meta object literal for the '<em><b>Team</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TROPHY__TEAM = eINSTANCE.getTrophy_Team();

		/**
		 * The meta object literal for the '{@link championsProject.impl.AgentImpl <em>Agent</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see championsProject.impl.AgentImpl
		 * @see championsProject.impl.ChampionsProjectPackageImpl#getAgent()
		 * @generated
		 */
		EClass AGENT = eINSTANCE.getAgent();

		/**
		 * The meta object literal for the '<em><b>Player</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AGENT__PLAYER = eINSTANCE.getAgent_Player();

		/**
		 * The meta object literal for the '<em><b>Coach</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AGENT__COACH = eINSTANCE.getAgent_Coach();

		/**
		 * The meta object literal for the '{@link championsProject.PlayerStatus <em>Player Status</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see championsProject.PlayerStatus
		 * @see championsProject.impl.ChampionsProjectPackageImpl#getPlayerStatus()
		 * @generated
		 */
		EEnum PLAYER_STATUS = eINSTANCE.getPlayerStatus();

		/**
		 * The meta object literal for the '{@link championsProject.PlayerPosition <em>Player Position</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see championsProject.PlayerPosition
		 * @see championsProject.impl.ChampionsProjectPackageImpl#getPlayerPosition()
		 * @generated
		 */
		EEnum PLAYER_POSITION = eINSTANCE.getPlayerPosition();

		/**
		 * The meta object literal for the '{@link championsProject.CompetitionType <em>Competition Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see championsProject.CompetitionType
		 * @see championsProject.impl.ChampionsProjectPackageImpl#getCompetitionType()
		 * @generated
		 */
		EEnum COMPETITION_TYPE = eINSTANCE.getCompetitionType();

		/**
		 * The meta object literal for the '{@link championsProject.TeamType <em>Team Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see championsProject.TeamType
		 * @see championsProject.impl.ChampionsProjectPackageImpl#getTeamType()
		 * @generated
		 */
		EEnum TEAM_TYPE = eINSTANCE.getTeamType();

	}

} //ChampionsProjectPackage
