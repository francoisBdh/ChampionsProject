/**
 */
package championsProject.impl;

import championsProject.ChampionsProjectPackage;
import championsProject.Coach;
import championsProject.Player;
import championsProject.President;
import championsProject.Stadium;
import championsProject.Team;
import championsProject.TeamType;
import championsProject.Trophy;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Team</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link championsProject.impl.TeamImpl#getStadium <em>Stadium</em>}</li>
 *   <li>{@link championsProject.impl.TeamImpl#getName <em>Name</em>}</li>
 *   <li>{@link championsProject.impl.TeamImpl#getTrophy <em>Trophy</em>}</li>
 *   <li>{@link championsProject.impl.TeamImpl#getType <em>Type</em>}</li>
 *   <li>{@link championsProject.impl.TeamImpl#getPresident <em>President</em>}</li>
 *   <li>{@link championsProject.impl.TeamImpl#getCoach <em>Coach</em>}</li>
 *   <li>{@link championsProject.impl.TeamImpl#getPlayer <em>Player</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TeamImpl extends MinimalEObjectImpl.Container implements Team {
	/**
	 * The cached value of the '{@link #getStadium() <em>Stadium</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStadium()
	 * @generated
	 * @ordered
	 */
	protected Stadium stadium;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = "";

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getTrophy() <em>Trophy</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTrophy()
	 * @generated
	 * @ordered
	 */
	protected EList<Trophy> trophy;

	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final TeamType TYPE_EDEFAULT = TeamType.TOWN;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected TeamType type = TYPE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getPresident() <em>President</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPresident()
	 * @generated
	 * @ordered
	 */
	protected President president;

	/**
	 * The cached value of the '{@link #getCoach() <em>Coach</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCoach()
	 * @generated
	 * @ordered
	 */
	protected Coach coach;

	/**
	 * The cached value of the '{@link #getPlayer() <em>Player</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlayer()
	 * @generated
	 * @ordered
	 */
	protected EList<Player> player;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TeamImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ChampionsProjectPackage.Literals.TEAM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Player> getPlayer() {
		if (player == null) {
			player = new EObjectContainmentEList<Player>(Player.class, this, ChampionsProjectPackage.TEAM__PLAYER);
		}
		return player;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public President getPresident() {
		return president;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPresident(President newPresident, NotificationChain msgs) {
		President oldPresident = president;
		president = newPresident;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					ChampionsProjectPackage.TEAM__PRESIDENT, oldPresident, newPresident);
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
	public void setPresident(President newPresident) {
		if (newPresident != president) {
			NotificationChain msgs = null;
			if (president != null)
				msgs = ((InternalEObject) president).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - ChampionsProjectPackage.TEAM__PRESIDENT, null, msgs);
			if (newPresident != null)
				msgs = ((InternalEObject) newPresident).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - ChampionsProjectPackage.TEAM__PRESIDENT, null, msgs);
			msgs = basicSetPresident(newPresident, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ChampionsProjectPackage.TEAM__PRESIDENT, newPresident,
					newPresident));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Coach getCoach() {
		return coach;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCoach(Coach newCoach, NotificationChain msgs) {
		Coach oldCoach = coach;
		coach = newCoach;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					ChampionsProjectPackage.TEAM__COACH, oldCoach, newCoach);
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
	public void setCoach(Coach newCoach) {
		if (newCoach != coach) {
			NotificationChain msgs = null;
			if (coach != null)
				msgs = ((InternalEObject) coach).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - ChampionsProjectPackage.TEAM__COACH, null, msgs);
			if (newCoach != null)
				msgs = ((InternalEObject) newCoach).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - ChampionsProjectPackage.TEAM__COACH, null, msgs);
			msgs = basicSetCoach(newCoach, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ChampionsProjectPackage.TEAM__COACH, newCoach,
					newCoach));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Stadium getStadium() {
		if (stadium != null && stadium.eIsProxy()) {
			InternalEObject oldStadium = (InternalEObject) stadium;
			stadium = (Stadium) eResolveProxy(oldStadium);
			if (stadium != oldStadium) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ChampionsProjectPackage.TEAM__STADIUM,
							oldStadium, stadium));
			}
		}
		return stadium;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Stadium basicGetStadium() {
		return stadium;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStadium(Stadium newStadium, NotificationChain msgs) {
		Stadium oldStadium = stadium;
		stadium = newStadium;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					ChampionsProjectPackage.TEAM__STADIUM, oldStadium, newStadium);
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
	public void setStadium(Stadium newStadium) {
		if (newStadium != stadium) {
			NotificationChain msgs = null;
			if (stadium != null)
				msgs = ((InternalEObject) stadium).eInverseRemove(this, ChampionsProjectPackage.STADIUM__TEAM,
						Stadium.class, msgs);
			if (newStadium != null)
				msgs = ((InternalEObject) newStadium).eInverseAdd(this, ChampionsProjectPackage.STADIUM__TEAM,
						Stadium.class, msgs);
			msgs = basicSetStadium(newStadium, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ChampionsProjectPackage.TEAM__STADIUM, newStadium,
					newStadium));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ChampionsProjectPackage.TEAM__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Trophy> getTrophy() {
		if (trophy == null) {
			trophy = new EObjectWithInverseResolvingEList.ManyInverse<Trophy>(Trophy.class, this,
					ChampionsProjectPackage.TEAM__TROPHY, ChampionsProjectPackage.TROPHY__TEAM);
		}
		return trophy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TeamType getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(TeamType newType) {
		TeamType oldType = type;
		type = newType == null ? TYPE_EDEFAULT : newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ChampionsProjectPackage.TEAM__TYPE, oldType, type));
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
		case ChampionsProjectPackage.TEAM__STADIUM:
			if (stadium != null)
				msgs = ((InternalEObject) stadium).eInverseRemove(this, ChampionsProjectPackage.STADIUM__TEAM,
						Stadium.class, msgs);
			return basicSetStadium((Stadium) otherEnd, msgs);
		case ChampionsProjectPackage.TEAM__TROPHY:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getTrophy()).basicAdd(otherEnd, msgs);
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
		case ChampionsProjectPackage.TEAM__STADIUM:
			return basicSetStadium(null, msgs);
		case ChampionsProjectPackage.TEAM__TROPHY:
			return ((InternalEList<?>) getTrophy()).basicRemove(otherEnd, msgs);
		case ChampionsProjectPackage.TEAM__PRESIDENT:
			return basicSetPresident(null, msgs);
		case ChampionsProjectPackage.TEAM__COACH:
			return basicSetCoach(null, msgs);
		case ChampionsProjectPackage.TEAM__PLAYER:
			return ((InternalEList<?>) getPlayer()).basicRemove(otherEnd, msgs);
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
		case ChampionsProjectPackage.TEAM__STADIUM:
			if (resolve)
				return getStadium();
			return basicGetStadium();
		case ChampionsProjectPackage.TEAM__NAME:
			return getName();
		case ChampionsProjectPackage.TEAM__TROPHY:
			return getTrophy();
		case ChampionsProjectPackage.TEAM__TYPE:
			return getType();
		case ChampionsProjectPackage.TEAM__PRESIDENT:
			return getPresident();
		case ChampionsProjectPackage.TEAM__COACH:
			return getCoach();
		case ChampionsProjectPackage.TEAM__PLAYER:
			return getPlayer();
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
		case ChampionsProjectPackage.TEAM__STADIUM:
			setStadium((Stadium) newValue);
			return;
		case ChampionsProjectPackage.TEAM__NAME:
			setName((String) newValue);
			return;
		case ChampionsProjectPackage.TEAM__TROPHY:
			getTrophy().clear();
			getTrophy().addAll((Collection<? extends Trophy>) newValue);
			return;
		case ChampionsProjectPackage.TEAM__TYPE:
			setType((TeamType) newValue);
			return;
		case ChampionsProjectPackage.TEAM__PRESIDENT:
			setPresident((President) newValue);
			return;
		case ChampionsProjectPackage.TEAM__COACH:
			setCoach((Coach) newValue);
			return;
		case ChampionsProjectPackage.TEAM__PLAYER:
			getPlayer().clear();
			getPlayer().addAll((Collection<? extends Player>) newValue);
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
		case ChampionsProjectPackage.TEAM__STADIUM:
			setStadium((Stadium) null);
			return;
		case ChampionsProjectPackage.TEAM__NAME:
			setName(NAME_EDEFAULT);
			return;
		case ChampionsProjectPackage.TEAM__TROPHY:
			getTrophy().clear();
			return;
		case ChampionsProjectPackage.TEAM__TYPE:
			setType(TYPE_EDEFAULT);
			return;
		case ChampionsProjectPackage.TEAM__PRESIDENT:
			setPresident((President) null);
			return;
		case ChampionsProjectPackage.TEAM__COACH:
			setCoach((Coach) null);
			return;
		case ChampionsProjectPackage.TEAM__PLAYER:
			getPlayer().clear();
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
		case ChampionsProjectPackage.TEAM__STADIUM:
			return stadium != null;
		case ChampionsProjectPackage.TEAM__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case ChampionsProjectPackage.TEAM__TROPHY:
			return trophy != null && !trophy.isEmpty();
		case ChampionsProjectPackage.TEAM__TYPE:
			return type != TYPE_EDEFAULT;
		case ChampionsProjectPackage.TEAM__PRESIDENT:
			return president != null;
		case ChampionsProjectPackage.TEAM__COACH:
			return coach != null;
		case ChampionsProjectPackage.TEAM__PLAYER:
			return player != null && !player.isEmpty();
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
		result.append(" (name: ");
		result.append(name);
		result.append(", type: ");
		result.append(type);
		result.append(')');
		return result.toString();
	}

} //TeamImpl
