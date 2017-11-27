/**
 */
package championsProject.impl;

import championsProject.Agent;
import championsProject.ChampionsProjectPackage;
import championsProject.Coach;
import championsProject.Team;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Coach</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link championsProject.impl.CoachImpl#getTeam <em>Team</em>}</li>
 *   <li>{@link championsProject.impl.CoachImpl#getContrat <em>Contrat</em>}</li>
 *   <li>{@link championsProject.impl.CoachImpl#getAgent <em>Agent</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CoachImpl extends PersonImpl implements Coach {
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
	protected CoachImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ChampionsProjectPackage.Literals.COACH;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ChampionsProjectPackage.COACH__TEAM,
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
					ChampionsProjectPackage.COACH__TEAM, oldTeam, newTeam);
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
				msgs = ((InternalEObject) team).eInverseRemove(this, ChampionsProjectPackage.TEAM__COACH, Team.class,
						msgs);
			if (newTeam != null)
				msgs = ((InternalEObject) newTeam).eInverseAdd(this, ChampionsProjectPackage.TEAM__COACH, Team.class,
						msgs);
			msgs = basicSetTeam(newTeam, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ChampionsProjectPackage.COACH__TEAM, newTeam,
					newTeam));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ChampionsProjectPackage.COACH__CONTRAT, oldContrat,
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ChampionsProjectPackage.COACH__AGENT,
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
					ChampionsProjectPackage.COACH__AGENT, oldAgent, newAgent);
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
				msgs = ((InternalEObject) agent).eInverseRemove(this, ChampionsProjectPackage.AGENT__COACH, Agent.class,
						msgs);
			if (newAgent != null)
				msgs = ((InternalEObject) newAgent).eInverseAdd(this, ChampionsProjectPackage.AGENT__COACH, Agent.class,
						msgs);
			msgs = basicSetAgent(newAgent, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ChampionsProjectPackage.COACH__AGENT, newAgent,
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
		case ChampionsProjectPackage.COACH__TEAM:
			if (team != null)
				msgs = ((InternalEObject) team).eInverseRemove(this, ChampionsProjectPackage.TEAM__COACH, Team.class,
						msgs);
			return basicSetTeam((Team) otherEnd, msgs);
		case ChampionsProjectPackage.COACH__AGENT:
			if (agent != null)
				msgs = ((InternalEObject) agent).eInverseRemove(this, ChampionsProjectPackage.AGENT__COACH, Agent.class,
						msgs);
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
		case ChampionsProjectPackage.COACH__TEAM:
			return basicSetTeam(null, msgs);
		case ChampionsProjectPackage.COACH__AGENT:
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
		case ChampionsProjectPackage.COACH__TEAM:
			if (resolve)
				return getTeam();
			return basicGetTeam();
		case ChampionsProjectPackage.COACH__CONTRAT:
			return getContrat();
		case ChampionsProjectPackage.COACH__AGENT:
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
		case ChampionsProjectPackage.COACH__TEAM:
			setTeam((Team) newValue);
			return;
		case ChampionsProjectPackage.COACH__CONTRAT:
			setContrat((Integer) newValue);
			return;
		case ChampionsProjectPackage.COACH__AGENT:
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
		case ChampionsProjectPackage.COACH__TEAM:
			setTeam((Team) null);
			return;
		case ChampionsProjectPackage.COACH__CONTRAT:
			setContrat(CONTRAT_EDEFAULT);
			return;
		case ChampionsProjectPackage.COACH__AGENT:
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
		case ChampionsProjectPackage.COACH__TEAM:
			return team != null;
		case ChampionsProjectPackage.COACH__CONTRAT:
			return contrat != CONTRAT_EDEFAULT;
		case ChampionsProjectPackage.COACH__AGENT:
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
		result.append(" (contrat: ");
		result.append(contrat);
		result.append(')');
		return result.toString();
	}

} //CoachImpl
