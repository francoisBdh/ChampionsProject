/**
 */
package championsProject.impl;

import championsProject.Agent;
import championsProject.ChampionsProjectPackage;
import championsProject.Coach;
import championsProject.Player;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Agent</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link championsProject.impl.AgentImpl#getPlayer <em>Player</em>}</li>
 *   <li>{@link championsProject.impl.AgentImpl#getCoach <em>Coach</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AgentImpl extends PersonImpl implements Agent {
	/**
	 * The cached value of the '{@link #getPlayer() <em>Player</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlayer()
	 * @generated
	 * @ordered
	 */
	protected EList<Player> player;

	/**
	 * The cached value of the '{@link #getCoach() <em>Coach</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCoach()
	 * @generated
	 * @ordered
	 */
	protected EList<Coach> coach;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AgentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ChampionsProjectPackage.Literals.AGENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Player> getPlayer() {
		if (player == null) {
			player = new EObjectWithInverseResolvingEList<Player>(Player.class, this,
					ChampionsProjectPackage.AGENT__PLAYER, ChampionsProjectPackage.PLAYER__AGENT);
		}
		return player;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Coach> getCoach() {
		if (coach == null) {
			coach = new EObjectWithInverseResolvingEList<Coach>(Coach.class, this, ChampionsProjectPackage.AGENT__COACH,
					ChampionsProjectPackage.COACH__AGENT);
		}
		return coach;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case ChampionsProjectPackage.AGENT__PLAYER:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getPlayer()).basicAdd(otherEnd, msgs);
		case ChampionsProjectPackage.AGENT__COACH:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getCoach()).basicAdd(otherEnd, msgs);
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
		case ChampionsProjectPackage.AGENT__PLAYER:
			return ((InternalEList<?>) getPlayer()).basicRemove(otherEnd, msgs);
		case ChampionsProjectPackage.AGENT__COACH:
			return ((InternalEList<?>) getCoach()).basicRemove(otherEnd, msgs);
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
		case ChampionsProjectPackage.AGENT__PLAYER:
			return getPlayer();
		case ChampionsProjectPackage.AGENT__COACH:
			return getCoach();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case ChampionsProjectPackage.AGENT__PLAYER:
			getPlayer().clear();
			getPlayer().addAll((Collection<? extends Player>) newValue);
			return;
		case ChampionsProjectPackage.AGENT__COACH:
			getCoach().clear();
			getCoach().addAll((Collection<? extends Coach>) newValue);
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
		case ChampionsProjectPackage.AGENT__PLAYER:
			getPlayer().clear();
			return;
		case ChampionsProjectPackage.AGENT__COACH:
			getCoach().clear();
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
		case ChampionsProjectPackage.AGENT__PLAYER:
			return player != null && !player.isEmpty();
		case ChampionsProjectPackage.AGENT__COACH:
			return coach != null && !coach.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //AgentImpl
