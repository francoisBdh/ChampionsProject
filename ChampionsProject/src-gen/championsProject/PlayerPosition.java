/**
 */
package championsProject;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Player Position</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see championsProject.ChampionsProjectPackage#getPlayerPosition()
 * @model
 * @generated
 */
public enum PlayerPosition implements Enumerator {
	/**
	 * The '<em><b>Central Midfielder</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CENTRAL_MIDFIELDER_VALUE
	 * @generated
	 * @ordered
	 */
	CENTRAL_MIDFIELDER(0, "centralMidfielder", "CM"),

	/**
	 * The '<em><b>Central Back</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CENTRAL_BACK_VALUE
	 * @generated
	 * @ordered
	 */
	CENTRAL_BACK(1, "centralBack", "CB"),

	/**
	 * The '<em><b>Goal Keeper</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GOAL_KEEPER_VALUE
	 * @generated
	 * @ordered
	 */
	GOAL_KEEPER(2, "goalKeeper", "GK"),

	/**
	 * The '<em><b>Left Midfielder</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LEFT_MIDFIELDER_VALUE
	 * @generated
	 * @ordered
	 */
	LEFT_MIDFIELDER(3, "leftMidfielder", "LM"),

	/**
	 * The '<em><b>Right Midfielder</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RIGHT_MIDFIELDER_VALUE
	 * @generated
	 * @ordered
	 */
	RIGHT_MIDFIELDER(4, "rightMidfielder", "RM"),

	/**
	 * The '<em><b>Right Back</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RIGHT_BACK_VALUE
	 * @generated
	 * @ordered
	 */
	RIGHT_BACK(5, "rightBack", "RB"),

	/**
	 * The '<em><b>Left Back</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LEFT_BACK_VALUE
	 * @generated
	 * @ordered
	 */
	LEFT_BACK(6, "leftBack", "LB"),

	/**
	 * The '<em><b>Striker</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #STRIKER_VALUE
	 * @generated
	 * @ordered
	 */
	STRIKER(7, "striker", "ST");

	/**
	 * The '<em><b>Central Midfielder</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Central Midfielder</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CENTRAL_MIDFIELDER
	 * @model name="centralMidfielder" literal="CM"
	 * @generated
	 * @ordered
	 */
	public static final int CENTRAL_MIDFIELDER_VALUE = 0;

	/**
	 * The '<em><b>Central Back</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Central Back</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CENTRAL_BACK
	 * @model name="centralBack" literal="CB"
	 * @generated
	 * @ordered
	 */
	public static final int CENTRAL_BACK_VALUE = 1;

	/**
	 * The '<em><b>Goal Keeper</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Goal Keeper</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #GOAL_KEEPER
	 * @model name="goalKeeper" literal="GK"
	 * @generated
	 * @ordered
	 */
	public static final int GOAL_KEEPER_VALUE = 2;

	/**
	 * The '<em><b>Left Midfielder</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Left Midfielder</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #LEFT_MIDFIELDER
	 * @model name="leftMidfielder" literal="LM"
	 * @generated
	 * @ordered
	 */
	public static final int LEFT_MIDFIELDER_VALUE = 3;

	/**
	 * The '<em><b>Right Midfielder</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Right Midfielder</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #RIGHT_MIDFIELDER
	 * @model name="rightMidfielder" literal="RM"
	 * @generated
	 * @ordered
	 */
	public static final int RIGHT_MIDFIELDER_VALUE = 4;

	/**
	 * The '<em><b>Right Back</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Right Back</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #RIGHT_BACK
	 * @model name="rightBack" literal="RB"
	 * @generated
	 * @ordered
	 */
	public static final int RIGHT_BACK_VALUE = 5;

	/**
	 * The '<em><b>Left Back</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Left Back</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #LEFT_BACK
	 * @model name="leftBack" literal="LB"
	 * @generated
	 * @ordered
	 */
	public static final int LEFT_BACK_VALUE = 6;

	/**
	 * The '<em><b>Striker</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Striker</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #STRIKER
	 * @model name="striker" literal="ST"
	 * @generated
	 * @ordered
	 */
	public static final int STRIKER_VALUE = 7;

	/**
	 * An array of all the '<em><b>Player Position</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final PlayerPosition[] VALUES_ARRAY = new PlayerPosition[] { CENTRAL_MIDFIELDER, CENTRAL_BACK,
			GOAL_KEEPER, LEFT_MIDFIELDER, RIGHT_MIDFIELDER, RIGHT_BACK, LEFT_BACK, STRIKER, };

	/**
	 * A public read-only list of all the '<em><b>Player Position</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<PlayerPosition> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Player Position</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static PlayerPosition get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			PlayerPosition result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Player Position</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static PlayerPosition getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			PlayerPosition result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Player Position</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static PlayerPosition get(int value) {
		switch (value) {
		case CENTRAL_MIDFIELDER_VALUE:
			return CENTRAL_MIDFIELDER;
		case CENTRAL_BACK_VALUE:
			return CENTRAL_BACK;
		case GOAL_KEEPER_VALUE:
			return GOAL_KEEPER;
		case LEFT_MIDFIELDER_VALUE:
			return LEFT_MIDFIELDER;
		case RIGHT_MIDFIELDER_VALUE:
			return RIGHT_MIDFIELDER;
		case RIGHT_BACK_VALUE:
			return RIGHT_BACK;
		case LEFT_BACK_VALUE:
			return LEFT_BACK;
		case STRIKER_VALUE:
			return STRIKER;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private PlayerPosition(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
		return value;
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
	public String getLiteral() {
		return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}

} //PlayerPosition
