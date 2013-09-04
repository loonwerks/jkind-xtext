/**
 */
package jkind.xtext.jkind;

import java.math.BigInteger;

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
   * @see #setLow(BigInteger)
   * @see jkind.xtext.jkind.JkindPackage#getSubrangeType_Low()
   * @model
   * @generated
   */
  BigInteger getLow();

  /**
   * Sets the value of the '{@link jkind.xtext.jkind.SubrangeType#getLow <em>Low</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Low</em>' attribute.
   * @see #getLow()
   * @generated
   */
  void setLow(BigInteger value);

  /**
   * Returns the value of the '<em><b>High</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>High</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>High</em>' attribute.
   * @see #setHigh(BigInteger)
   * @see jkind.xtext.jkind.JkindPackage#getSubrangeType_High()
   * @model
   * @generated
   */
  BigInteger getHigh();

  /**
   * Sets the value of the '{@link jkind.xtext.jkind.SubrangeType#getHigh <em>High</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>High</em>' attribute.
   * @see #getHigh()
   * @generated
   */
  void setHigh(BigInteger value);

} // SubrangeType
