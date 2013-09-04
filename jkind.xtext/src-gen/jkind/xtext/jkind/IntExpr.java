/**
 */
package jkind.xtext.jkind;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Int Expr</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link jkind.xtext.jkind.IntExpr#getVal <em>Val</em>}</li>
 * </ul>
 * </p>
 *
 * @see jkind.xtext.jkind.JkindPackage#getIntExpr()
 * @model
 * @generated
 */
public interface IntExpr extends Expr
{
  /**
   * Returns the value of the '<em><b>Val</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Val</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Val</em>' attribute.
   * @see #setVal(int)
   * @see jkind.xtext.jkind.JkindPackage#getIntExpr_Val()
   * @model
   * @generated
   */
  int getVal();

  /**
   * Sets the value of the '{@link jkind.xtext.jkind.IntExpr#getVal <em>Val</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Val</em>' attribute.
   * @see #getVal()
   * @generated
   */
  void setVal(int value);

} // IntExpr
