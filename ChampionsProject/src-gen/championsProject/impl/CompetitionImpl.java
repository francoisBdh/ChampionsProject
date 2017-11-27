/**
 */
package championsProject.impl;

import championsProject.ChampionsProjectPackage;
import championsProject.Competition;
import championsProject.CompetitionType;
import championsProject.Country;
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
 * An implementation of the model object '<em><b>Competition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link championsProject.impl.CompetitionImpl#getCountry <em>Country</em>}</li>
 *   <li>{@link championsProject.impl.CompetitionImpl#getTrophy <em>Trophy</em>}</li>
 *   <li>{@link championsProject.impl.CompetitionImpl#getType <em>Type</em>}</li>
 *   <li>{@link championsProject.impl.CompetitionImpl#getName <em>Name</em>}</li>
 *   <li>{@link championsProject.impl.CompetitionImpl#getTeam <em>Team</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CompetitionImpl extends MinimalEObjectImpl.Container implements Competition {
	/**
	 * The cached value of the '{@link #getCountry() <em>Country</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCountry()
	 * @generated
	 * @ordered
	 */
	protected Country country;

	/**
	 * The cached value of the '{@link #getTrophy() <em>Trophy</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTrophy()
	 * @generated
	 * @ordered
	 */
	protected Trophy trophy;

	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final CompetitionType TYPE_EDEFAULT = CompetitionType.CHAMPIONSHIP;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected CompetitionType type = TYPE_EDEFAULT;

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
	protected CompetitionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ChampionsProjectPackage.Literals.COMPETITION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Country getCountry() {
		if (country != null && country.eIsProxy()) {
			InternalEObject oldCountry = (InternalEObject) country;
			country = (Country) eResolveProxy(oldCountry);
			if (country != oldCountry) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							ChampionsProjectPackage.COMPETITION__COUNTRY, oldCountry, country));
			}
		}
		return country;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Country basicGetCountry() {
		return country;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCountry(Country newCountry, NotificationChain msgs) {
		Country oldCountry = country;
		country = newCountry;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					ChampionsProjectPackage.COMPETITION__COUNTRY, oldCountry, newCountry);
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
	public void setCountry(Country newCountry) {
		if (newCountry != country) {
			NotificationChain msgs = null;
			if (country != null)
				msgs = ((InternalEObject) country).eInverseRemove(this, ChampionsProjectPackage.COUNTRY__COMPETITION,
						Country.class, msgs);
			if (newCountry != null)
				msgs = ((InternalEObject) newCountry).eInverseAdd(this, ChampionsProjectPackage.COUNTRY__COMPETITION,
						Country.class, msgs);
			msgs = basicSetCountry(newCountry, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ChampionsProjectPackage.COMPETITION__COUNTRY,
					newCountry, newCountry));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Trophy getTrophy() {
		if (trophy != null && trophy.eIsProxy()) {
			InternalEObject oldTrophy = (InternalEObject) trophy;
			trophy = (Trophy) eResolveProxy(oldTrophy);
			if (trophy != oldTrophy) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							ChampionsProjectPackage.COMPETITION__TROPHY, oldTrophy, trophy));
			}
		}
		return trophy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Trophy basicGetTrophy() {
		return trophy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTrophy(Trophy newTrophy, NotificationChain msgs) {
		Trophy oldTrophy = trophy;
		trophy = newTrophy;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					ChampionsProjectPackage.COMPETITION__TROPHY, oldTrophy, newTrophy);
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
	public void setTrophy(Trophy newTrophy) {
		if (newTrophy != trophy) {
			NotificationChain msgs = null;
			if (trophy != null)
				msgs = ((InternalEObject) trophy).eInverseRemove(this, ChampionsProjectPackage.TROPHY__COMPETITION,
						Trophy.class, msgs);
			if (newTrophy != null)
				msgs = ((InternalEObject) newTrophy).eInverseAdd(this, ChampionsProjectPackage.TROPHY__COMPETITION,
						Trophy.class, msgs);
			msgs = basicSetTrophy(newTrophy, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ChampionsProjectPackage.COMPETITION__TROPHY,
					newTrophy, newTrophy));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompetitionType getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(CompetitionType newType) {
		CompetitionType oldType = type;
		type = newType == null ? TYPE_EDEFAULT : newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ChampionsProjectPackage.COMPETITION__TYPE, oldType,
					type));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ChampionsProjectPackage.COMPETITION__NAME, oldName,
					name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Team> getTeam() {
		if (team == null) {
			team = new EObjectWithInverseResolvingEList.ManyInverse<Team>(Team.class, this,
					ChampionsProjectPackage.COMPETITION__TEAM, ChampionsProjectPackage.TEAM__COMPETITION);
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
		case ChampionsProjectPackage.COMPETITION__COUNTRY:
			if (country != null)
				msgs = ((InternalEObject) country).eInverseRemove(this, ChampionsProjectPackage.COUNTRY__COMPETITION,
						Country.class, msgs);
			return basicSetCountry((Country) otherEnd, msgs);
		case ChampionsProjectPackage.COMPETITION__TROPHY:
			if (trophy != null)
				msgs = ((InternalEObject) trophy).eInverseRemove(this, ChampionsProjectPackage.TROPHY__COMPETITION,
						Trophy.class, msgs);
			return basicSetTrophy((Trophy) otherEnd, msgs);
		case ChampionsProjectPackage.COMPETITION__TEAM:
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
		case ChampionsProjectPackage.COMPETITION__COUNTRY:
			return basicSetCountry(null, msgs);
		case ChampionsProjectPackage.COMPETITION__TROPHY:
			return basicSetTrophy(null, msgs);
		case ChampionsProjectPackage.COMPETITION__TEAM:
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
		case ChampionsProjectPackage.COMPETITION__COUNTRY:
			if (resolve)
				return getCountry();
			return basicGetCountry();
		case ChampionsProjectPackage.COMPETITION__TROPHY:
			if (resolve)
				return getTrophy();
			return basicGetTrophy();
		case ChampionsProjectPackage.COMPETITION__TYPE:
			return getType();
		case ChampionsProjectPackage.COMPETITION__NAME:
			return getName();
		case ChampionsProjectPackage.COMPETITION__TEAM:
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
		case ChampionsProjectPackage.COMPETITION__COUNTRY:
			setCountry((Country) newValue);
			return;
		case ChampionsProjectPackage.COMPETITION__TROPHY:
			setTrophy((Trophy) newValue);
			return;
		case ChampionsProjectPackage.COMPETITION__TYPE:
			setType((CompetitionType) newValue);
			return;
		case ChampionsProjectPackage.COMPETITION__NAME:
			setName((String) newValue);
			return;
		case ChampionsProjectPackage.COMPETITION__TEAM:
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
		case ChampionsProjectPackage.COMPETITION__COUNTRY:
			setCountry((Country) null);
			return;
		case ChampionsProjectPackage.COMPETITION__TROPHY:
			setTrophy((Trophy) null);
			return;
		case ChampionsProjectPackage.COMPETITION__TYPE:
			setType(TYPE_EDEFAULT);
			return;
		case ChampionsProjectPackage.COMPETITION__NAME:
			setName(NAME_EDEFAULT);
			return;
		case ChampionsProjectPackage.COMPETITION__TEAM:
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
		case ChampionsProjectPackage.COMPETITION__COUNTRY:
			return country != null;
		case ChampionsProjectPackage.COMPETITION__TROPHY:
			return trophy != null;
		case ChampionsProjectPackage.COMPETITION__TYPE:
			return type != TYPE_EDEFAULT;
		case ChampionsProjectPackage.COMPETITION__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case ChampionsProjectPackage.COMPETITION__TEAM:
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
		result.append(" (type: ");
		result.append(type);
		result.append(", name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //CompetitionImpl
