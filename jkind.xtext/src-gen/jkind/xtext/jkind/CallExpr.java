/**
 */
package jkind.xtext.jkind;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Call Expr</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link jkind.xtext.jkind.CallExpr#getCallable <em>Callable</em>}</li>
 *   <li>{@link jkind.xtext.jkind.CallExpr#getArgs <em>Args</em>}</li>
 * </ul>
 * </p>
 *
 * @see jkind.xtext.jkind.JkindPackage#getCallExpr()
 * @model
 * @generated
 */
public interface CallExpr extends Expr
{
  /**
   * Returns the value of the '<em><b>Callable</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Callable</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Callable</em>' reference.
   * @see #setCallable(Callable)
   * @see jkind.xtext.jkind.JkindPackage#getCallExpr_Callable()
   * @model
   * @generated
   */
  Callable getCallable();

  /**
   * Sets the value of the '{@link jkind.xtext.jkind.CallExpr#getCallable <em>Callable</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Callable</em>' reference.
   * @see #getCallable()
   * @generated
   */
  void setCallable(Callable value);

  /**
   * Returns the value of the '<em><b>Args</b></em>' containment reference list.
   * The list contents are of type {@link jkind.xtext.jkind.Expr}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Args</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Args</em>' containment reference list.
   * @see jkind.xtext.jkind.JkindPackage#getCallExpr_Args()
   * @model containment="true"
   * @generated
   */
  EList<Expr> getArgs();

} // CallExpr
