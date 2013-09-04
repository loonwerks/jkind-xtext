/**
 */
package jkind.xtext.jkind;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Subrange Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link jkind.xtext.jkind.SubrangeType#getLow <em>Low</em>}</li>
 *   <li>{@link jkind.xtext.jkind.SubrangeType#getHigh <em>High</em>}</li>
 * </ul>
 * </p>
 *
 * @see jkind.xtext.jkind.JkindPackage#getSubrangeType()
 * @model
 * @generated
 */
public interface SubrangeType extends Type
{
  /**
   * Returns the value of the '<em><b>Low</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Low</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Low</em>' attribute.
   * @see #setLow(int)
   * @see jkind.xtext.jkind.JkindPackage#getSubrangeType_Low()
   * @model
   * @generated
   */
  int getLow();

  /**
   * Sets the value of the '{@link jkind.xtext.jkind.SubrangeType#getLow <em>Low</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Low</em>' attribute.
   * @see #getLow()
   * @generated
   */
  void setLow(int value);

  /**
   * Returns the value of the '<em><b>High</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>High</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>High</em>' attribute.
   * @see #setHigh(int)
   * @see jkind.xtext.jkind.JkindPackage#getSubrangeType_High()
   * @model
   * @generated
   */
  int getHigh();

  /**
   * Sets the value of the '{@link jkind.xtext.jkind.SubrangeType#getHigh <em>High</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>High</em>' attribute.
   * @see #getHigh()
   * @generated
   */
  void setHigh(int value);

} // SubrangeType
