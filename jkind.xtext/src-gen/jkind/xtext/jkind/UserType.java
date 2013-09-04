/**
 */
package jkind.xtext.jkind;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>User Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link jkind.xtext.jkind.UserType#getDef <em>Def</em>}</li>
 * </ul>
 * </p>
 *
 * @see jkind.xtext.jkind.JkindPackage#getUserType()
 * @model
 * @generated
 */
public interface UserType extends Type
{
  /**
   * Returns the value of the '<em><b>Def</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Def</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Def</em>' reference.
   * @see #setDef(Typedef)
   * @see jkind.xtext.jkind.JkindPackage#getUserType_Def()
   * @model
   * @generated
   */
  Typedef getDef();

  /**
   * Sets the value of the '{@link jkind.xtext.jkind.UserType#getDef <em>Def</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Def</em>' reference.
   * @see #getDef()
   * @generated
   */
  void setDef(Typedef value);

} // UserType
