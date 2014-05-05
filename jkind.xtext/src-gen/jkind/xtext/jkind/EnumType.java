/**
 */
package jkind.xtext.jkind;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Enum Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link jkind.xtext.jkind.EnumType#getValues <em>Values</em>}</li>
 * </ul>
 * </p>
 *
 * @see jkind.xtext.jkind.JkindPackage#getEnumType()
 * @model
 * @generated
 */
public interface EnumType extends TypeDef
{
  /**
   * Returns the value of the '<em><b>Values</b></em>' containment reference list.
   * The list contents are of type {@link jkind.xtext.jkind.EnumValue}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Values</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Values</em>' containment reference list.
   * @see jkind.xtext.jkind.JkindPackage#getEnumType_Values()
   * @model containment="true"
   * @generated
   */
  EList<EnumValue> getValues();

} // EnumType
