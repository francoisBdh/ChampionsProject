/**
 */
package championsProject.impl;

import championsProject.Agent;
import championsProject.ChampionsProjectPackage;
import championsProject.Player;
import championsProject.PlayerPosition;
import championsProject.PlayerStatus;
import championsProject.Team;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Player</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link championsProject.impl.PlayerImpl#getTeam <em>Team</em>}</li>
 *   <li>{@link championsProject.impl.PlayerImpl#getPosition <em>Position</em>}</li>
 *   <li>{@link championsProject.impl.PlayerImpl#getStatus <em>Status</em>}</li>
 *   <li>{@link championsProject.impl.PlayerImpl#getContrat <em>Contrat</em>}</li>
 *   <li>{@link championsProject.impl.PlayerImpl#getAgent <em>Agent</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PlayerImpl extends PersonImpl implements Player {
	/**
	 * The cached value of the '{@link #getTeam() <em>Team</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTeam()
	 * @generated
	 * @ordered
	 */
	protected Team team;

	/**
	 * The default value of the '{@link #getPosition() <em>Position</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPosition()
	 * @generated
	 * @ordered
	 */
	protected static final PlayerPosition POSITION_EDEFAULT = PlayerPosition.CENTRAL_MIDFIELDER;

	/**
	 * The cached value of the '{@link #getPosition() <em>Position</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPosition()
	 * @generated
	 * @ordered
	 */
	protected PlayerPosition position = POSITION_EDEFAULT;

	/**
	 * The default value of the '{@link #getStatus() <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatus()
	 * @generated
	 * @ordered
	 */
	protected static final PlayerStatus STATUS_EDEFAULT = PlayerStatus.STARTER;

	/**
	 * The cached value of the '{@link #getStatus() <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatus()
	 * @generated
	 * @ordered
	 */
	protected PlayerStatus status = STATUS_EDEFAULT;

	/**
	 * The default value of the '{@link #getContrat() <em>Contrat</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContrat()
	 * @generated
	 * @ordered
	 */
	protected static final int CONTRAT_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getContrat() <em>Contrat</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContrat()
	 * @generated
	 * @ordered
	 */
	protected int contrat = CONTRAT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getAgent() <em>Agent</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAgent()
	 * @generated
	 * @ordered
	 */
	protected Agent agent;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PlayerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ChampionsProjectPackage.Literals.PLAYER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Team getTeam() {
		if (team != null && team.eIsProxy()) {
			InternalEObject oldTeam = (InternalEObject) team;
			team = (Team) eResolveProxy(oldTeam);
			if (team != oldTeam) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ChampionsProjectPackage.PLAYER__TEAM,
							oldTeam, team));
			}
		}
		return team;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Team basicGetTeam() {
		return team;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTeam(Team newTeam, NotificationChain msgs) {
		Team oldTeam = team;
		team = newTeam;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					ChampionsProjectPackage.PLAYER__TEAM, oldTeam, newTeam);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTeam(Team newTeam) {
		if (newTeam != team) {
			NotificationChain msgs = null;
			if (team != null)
				msgs = ((InternalEObject) team).eInverseRemove(this, ChampionsProjectPackage.TEAM__PLAYER, Team.class,
						msgs);
			if (newTeam != null)
				msgs = ((InternalEObject) newTeam).eInverseAdd(this, ChampionsProjectPackage.TEAM__PLAYER, Team.class,
						msgs);
			msgs = basicSetTeam(newTeam, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ChampionsProjectPackage.PLAYER__TEAM, newTeam,
					newTeam));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PlayerPosition getPosition() {
		return position;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPosition(PlayerPosition newPosition) {
		PlayerPosition oldPosition = position;
		position = newPosition == null ? POSITION_EDEFAULT : newPosition;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ChampionsProjectPackage.PLAYER__POSITION, oldPosition,
					position));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PlayerStatus getStatus() {
		return status;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStatus(PlayerStatus newStatus) {
		PlayerStatus oldStatus = status;
		status = newStatus == null ? STATUS_EDEFAULT : newStatus;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ChampionsProjectPackage.PLAYER__STATUS, oldStatus,
					status));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getContrat() {
		return contrat;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContrat(int newContrat) {
		int oldContrat = contrat;
		contrat = newContrat;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ChampionsProjectPackage.PLAYER__CONTRAT, oldContrat,
					contrat));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Agent getAgent() {
		if (agent != null && agent.eIsProxy()) {
			InternalEObject oldAgent = (InternalEObject) agent;
			agent = (Agent) eResolveProxy(oldAgent);
			if (agent != oldAgent) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ChampionsProjectPackage.PLAYER__AGENT,
							oldAgent, agent));
			}
		}
		return agent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Agent basicGetAgent() {
		return agent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAgent(Agent newAgent, NotificationChain msgs) {
		Agent oldAgent = agent;
		agent = newAgent;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					ChampionsProjectPackage.PLAYER__AGENT, oldAgent, newAgent);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAgent(Agent newAgent) {
		if (newAgent != agent) {
			NotificationChain msgs = null;
			if (agent != null)
				msgs = ((InternalEObject) agent).eInverseRemove(this, ChampionsProjectPackage.AGENT__PLAYER,
						Agent.class, msgs);
			if (newAgent != null)
				msgs = ((InternalEObject) newAgent).eInverseAdd(this, ChampionsProjectPackage.AGENT__PLAYER,
						Agent.class, msgs);
			msgs = basicSetAgent(newAgent, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ChampionsProjectPackage.PLAYER__AGENT, newAgent,
					newAgent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case ChampionsProjectPackage.PLAYER__TEAM:
			if (team != null)
				msgs = ((InternalEObject) team).eInverseRemove(this, ChampionsProjectPackage.TEAM__PLAYER, Team.class,
						msgs);
			return basicSetTeam((Team) otherEnd, msgs);
		case ChampionsProjectPackage.PLAYER__AGENT:
			if (agent != null)
				msgs = ((InternalEObject) agent).eInverseRemove(this, ChampionsProjectPackage.AGENT__PLAYER,
						Agent.class, msgs);
			return basicSetAgent((Agent) otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case ChampionsProjectPackage.PLAYER__TEAM:
			return basicSetTeam(null, msgs);
		case ChampionsProjectPackage.PLAYER__AGENT:
			return basicSetAgent(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case ChampionsProjectPackage.PLAYER__TEAM:
			if (resolve)
				return getTeam();
			return basicGetTeam();
		case ChampionsProjectPackage.PLAYER__POSITION:
			return getPosition();
		case ChampionsProjectPackage.PLAYER__STATUS:
			return getStatus();
		case ChampionsProjectPackage.PLAYER__CONTRAT:
			return getContrat();
		case ChampionsProjectPackage.PLAYER__AGENT:
			if (resolve)
				return getAgent();
			return basicGetAgent();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case ChampionsProjectPackage.PLAYER__TEAM:
			setTeam((Team) newValue);
			return;
		case ChampionsProjectPackage.PLAYER__POSITION:
			setPosition((PlayerPosition) newValue);
			return;
		case ChampionsProjectPackage.PLAYER__STATUS:
			setStatus((PlayerStatus) newValue);
			return;
		case ChampionsProjectPackage.PLAYER__CONTRAT:
			setContrat((Integer) newValue);
			return;
		case ChampionsProjectPackage.PLAYER__AGENT:
			setAgent((Agent) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case ChampionsProjectPackage.PLAYER__TEAM:
			setTeam((Team) null);
			return;
		case ChampionsProjectPackage.PLAYER__POSITION:
			setPosition(POSITION_EDEFAULT);
			return;
		case ChampionsProjectPackage.PLAYER__STATUS:
			setStatus(STATUS_EDEFAULT);
			return;
		case ChampionsProjectPackage.PLAYER__CONTRAT:
			setContrat(CONTRAT_EDEFAULT);
			return;
		case ChampionsProjectPackage.PLAYER__AGENT:
			setAgent((Agent) null);
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case ChampionsProjectPackage.PLAYER__TEAM:
			return team != null;
		case ChampionsProjectPackage.PLAYER__POSITION:
			return position != POSITION_EDEFAULT;
		case ChampionsProjectPackage.PLAYER__STATUS:
			return status != STATUS_EDEFAULT;
		case ChampionsProjectPackage.PLAYER__CONTRAT:
			return contrat != CONTRAT_EDEFAULT;
		case ChampionsProjectPackage.PLAYER__AGENT:
			return agent != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (position: ");
		result.append(position);
		result.append(", status: ");
		result.append(status);
		result.append(", contrat: ");
		result.append(contrat);
		result.append(')');
		return result.toString();
	}

} //PlayerImpl
