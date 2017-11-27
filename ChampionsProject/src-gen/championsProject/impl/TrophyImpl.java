/**
 */
package championsProject.impl;

import championsProject.ChampionsProjectPackage;
import championsProject.Competition;
import championsProject.Team;
import championsProject.Trophy;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Trophy</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link championsProject.impl.TrophyImpl#getCompetition <em>Competition</em>}</li>
 *   <li>{@link championsProject.impl.TrophyImpl#getName <em>Name</em>}</li>
 *   <li>{@link championsProject.impl.TrophyImpl#getTeam <em>Team</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TrophyImpl extends MinimalEObjectImpl.Container implements Trophy {
	/**
	 * The cached value of the '{@link #getCompetition() <em>Competition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCompetition()
	 * @generated
	 * @ordered
	 */
	protected Competition competition;

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
	 * The cached value of the '{@link #getTeam() <em>Team</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTeam()
	 * @generated
	 * @ordered
	 */
	protected EList<Team> team;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TrophyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ChampionsProjectPackage.Literals.TROPHY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Competition getCompetition() {
		if (competition != null && competition.eIsProxy()) {
			InternalEObject oldCompetition = (InternalEObject) competition;
			competition = (Competition) eResolveProxy(oldCompetition);
			if (competition != oldCompetition) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							ChampionsProjectPackage.TROPHY__COMPETITION, oldCompetition, competition));
			}
		}
		return competition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Competition basicGetCompetition() {
		return competition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCompetition(Competition newCompetition, NotificationChain msgs) {
		Competition oldCompetition = competition;
		competition = newCompetition;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					ChampionsProjectPackage.TROPHY__COMPETITION, oldCompetition, newCompetition);
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
	public void setCompetition(Competition newCompetition) {
		if (newCompetition != competition) {
			NotificationChain msgs = null;
			if (competition != null)
				msgs = ((InternalEObject) competition).eInverseRemove(this, ChampionsProjectPackage.COMPETITION__TROPHY,
						Competition.class, msgs);
			if (newCompetition != null)
				msgs = ((InternalEObject) newCompetition).eInverseAdd(this, ChampionsProjectPackage.COMPETITION__TROPHY,
						Competition.class, msgs);
			msgs = basicSetCompetition(newCompetition, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ChampionsProjectPackage.TROPHY__COMPETITION,
					newCompetition, newCompetition));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ChampionsProjectPackage.TROPHY__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Team> getTeam() {
		if (team == null) {
			team = new EObjectWithInverseResolvingEList.ManyInverse<Team>(Team.class, this,
					ChampionsProjectPackage.TROPHY__TEAM, ChampionsProjectPackage.TEAM__TROPHY);
		}
		return team;
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
		case ChampionsProjectPackage.TROPHY__COMPETITION:
			if (competition != null)
				msgs = ((InternalEObject) competition).eInverseRemove(this, ChampionsProjectPackage.COMPETITION__TROPHY,
						Competition.class, msgs);
			return basicSetCompetition((Competition) otherEnd, msgs);
		case ChampionsProjectPackage.TROPHY__TEAM:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getTeam()).basicAdd(otherEnd, msgs);
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
		case ChampionsProjectPackage.TROPHY__COMPETITION:
			return basicSetCompetition(null, msgs);
		case ChampionsProjectPackage.TROPHY__TEAM:
			return ((InternalEList<?>) getTeam()).basicRemove(otherEnd, msgs);
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
		case ChampionsProjectPackage.TROPHY__COMPETITION:
			if (resolve)
				return getCompetition();
			return basicGetCompetition();
		case ChampionsProjectPackage.TROPHY__NAME:
			return getName();
		case ChampionsProjectPackage.TROPHY__TEAM:
			return getTeam();
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
		case ChampionsProjectPackage.TROPHY__COMPETITION:
			setCompetition((Competition) newValue);
			return;
		case ChampionsProjectPackage.TROPHY__NAME:
			setName((String) newValue);
			return;
		case ChampionsProjectPackage.TROPHY__TEAM:
			getTeam().clear();
			getTeam().addAll((Collection<? extends Team>) newValue);
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
		case ChampionsProjectPackage.TROPHY__COMPETITION:
			setCompetition((Competition) null);
			return;
		case ChampionsProjectPackage.TROPHY__NAME:
			setName(NAME_EDEFAULT);
			return;
		case ChampionsProjectPackage.TROPHY__TEAM:
			getTeam().clear();
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
		case ChampionsProjectPackage.TROPHY__COMPETITION:
			return competition != null;
		case ChampionsProjectPackage.TROPHY__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case ChampionsProjectPackage.TROPHY__TEAM:
			return team != null && !team.isEmpty();
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
		result.append(')');
		return result.toString();
	}

} //TrophyImpl
