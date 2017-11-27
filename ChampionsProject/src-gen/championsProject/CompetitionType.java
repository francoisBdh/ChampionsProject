/**
 */
package championsProject;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Competition Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see championsProject.ChampionsProjectPackage#getCompetitionType()
 * @model
 * @generated
 */
public enum CompetitionType implements Enumerator {
	/**
	 * The '<em><b>Championship</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CHAMPIONSHIP_VALUE
	 * @generated
	 * @ordered
	 */
	CHAMPIONSHIP(0, "championship", "CHP"),

	/**
	 * The '<em><b>Cup</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CUP_VALUE
	 * @generated
	 * @ordered
	 */
	CUP(1, "cup", "CUP"),

	/**
	 * The '<em><b>World Cup</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WORLD_CUP_VALUE
	 * @generated
	 * @ordered
	 */
	WORLD_CUP(2, "worldCup", "worldCup");

	/**
	 * The '<em><b>Championship</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Championship</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CHAMPIONSHIP
	 * @model name="championship" literal="CHP"
	 * @generated
	 * @ordered
	 */
	public static final int CHAMPIONSHIP_VALUE = 0;

	/**
	 * The '<em><b>Cup</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Cup</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CUP
	 * @model name="cup" literal="CUP"
	 * @generated
	 * @ordered
	 */
	public static final int CUP_VALUE = 1;

	/**
	 * The '<em><b>World Cup</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>World Cup</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #WORLD_CUP
	 * @model name="worldCup"
	 * @generated
	 * @ordered
	 */
	public static final int WORLD_CUP_VALUE = 2;

	/**
	 * An array of all the '<em><b>Competition Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final CompetitionType[] VALUES_ARRAY = new CompetitionType[] { CHAMPIONSHIP, CUP, WORLD_CUP, };

	/**
	 * A public read-only list of all the '<em><b>Competition Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<CompetitionType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Competition Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static CompetitionType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			CompetitionType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Competition Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static CompetitionType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			CompetitionType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Competition Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static CompetitionType get(int value) {
		switch (value) {
		case CHAMPIONSHIP_VALUE:
			return CHAMPIONSHIP;
		case CUP_VALUE:
			return CUP;
		case WORLD_CUP_VALUE:
			return WORLD_CUP;
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
	private CompetitionType(int value, String name, String literal) {
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

} //CompetitionType
