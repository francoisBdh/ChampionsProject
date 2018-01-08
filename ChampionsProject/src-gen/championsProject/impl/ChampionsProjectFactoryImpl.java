/**
 */
package championsProject.impl;

import championsProject.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ChampionsProjectFactoryImpl extends EFactoryImpl implements ChampionsProjectFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ChampionsProjectFactory init() {
		try {
			ChampionsProjectFactory theChampionsProjectFactory = (ChampionsProjectFactory) EPackage.Registry.INSTANCE
					.getEFactory(ChampionsProjectPackage.eNS_URI);
			if (theChampionsProjectFactory != null) {
				return theChampionsProjectFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ChampionsProjectFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChampionsProjectFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
		case ChampionsProjectPackage.TEAM:
			return createTeam();
		case ChampionsProjectPackage.COUNTRY:
			return createCountry();
		case ChampionsProjectPackage.PLAYER:
			return createPlayer();
		case ChampionsProjectPackage.COMPETITION:
			return createCompetition();
		case ChampionsProjectPackage.PRESIDENT:
			return createPresident();
		case ChampionsProjectPackage.COACH:
			return createCoach();
		case ChampionsProjectPackage.STADIUM:
			return createStadium();
		case ChampionsProjectPackage.TROPHY:
			return createTrophy();
		case ChampionsProjectPackage.AGENT:
			return createAgent();
		case ChampionsProjectPackage.FIFA:
			return createFifa();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
		case ChampionsProjectPackage.PLAYER_STATUS:
			return createPlayerStatusFromString(eDataType, initialValue);
		case ChampionsProjectPackage.PLAYER_POSITION:
			return createPlayerPositionFromString(eDataType, initialValue);
		case ChampionsProjectPackage.COMPETITION_TYPE:
			return createCompetitionTypeFromString(eDataType, initialValue);
		case ChampionsProjectPackage.TEAM_TYPE:
			return createTeamTypeFromString(eDataType, initialValue);
		default:
			throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
		case ChampionsProjectPackage.PLAYER_STATUS:
			return convertPlayerStatusToString(eDataType, instanceValue);
		case ChampionsProjectPackage.PLAYER_POSITION:
			return convertPlayerPositionToString(eDataType, instanceValue);
		case ChampionsProjectPackage.COMPETITION_TYPE:
			return convertCompetitionTypeToString(eDataType, instanceValue);
		case ChampionsProjectPackage.TEAM_TYPE:
			return convertTeamTypeToString(eDataType, instanceValue);
		default:
			throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Team createTeam() {
		TeamImpl team = new TeamImpl();
		return team;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Country createCountry() {
		CountryImpl country = new CountryImpl();
		return country;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Player createPlayer() {
		PlayerImpl player = new PlayerImpl();
		return player;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Competition createCompetition() {
		CompetitionImpl competition = new CompetitionImpl();
		return competition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public President createPresident() {
		PresidentImpl president = new PresidentImpl();
		return president;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Coach createCoach() {
		CoachImpl coach = new CoachImpl();
		return coach;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Stadium createStadium() {
		StadiumImpl stadium = new StadiumImpl();
		return stadium;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Trophy createTrophy() {
		TrophyImpl trophy = new TrophyImpl();
		return trophy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Agent createAgent() {
		AgentImpl agent = new AgentImpl();
		return agent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Fifa createFifa() {
		FifaImpl fifa = new FifaImpl();
		return fifa;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PlayerStatus createPlayerStatusFromString(EDataType eDataType, String initialValue) {
		PlayerStatus result = PlayerStatus.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPlayerStatusToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PlayerPosition createPlayerPositionFromString(EDataType eDataType, String initialValue) {
		PlayerPosition result = PlayerPosition.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPlayerPositionToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompetitionType createCompetitionTypeFromString(EDataType eDataType, String initialValue) {
		CompetitionType result = CompetitionType.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCompetitionTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TeamType createTeamTypeFromString(EDataType eDataType, String initialValue) {
		TeamType result = TeamType.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTeamTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChampionsProjectPackage getChampionsProjectPackage() {
		return (ChampionsProjectPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ChampionsProjectPackage getPackage() {
		return ChampionsProjectPackage.eINSTANCE;
	}

} //ChampionsProjectFactoryImpl
