/**
 */
package jkind.xtext.jkind;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Condact Expr</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link jkind.xtext.jkind.CondactExpr#getClock <em>Clock</em>}</li>
 *   <li>{@link jkind.xtext.jkind.CondactExpr#getCall <em>Call</em>}</li>
 *   <li>{@link jkind.xtext.jkind.CondactExpr#getArgs <em>Args</em>}</li>
 * </ul>
 * </p>
 *
 * @see jkind.xtext.jkind.JkindPackage#getCondactExpr()
 * @model
 * @generated
 */
public interface CondactExpr extends Expr
{
  /**
   * Returns the value of the '<em><b>Clock</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Clock</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Clock</em>' containment reference.
   * @see #setClock(Expr)
   * @see jkind.xtext.jkind.JkindPackage#getCondactExpr_Clock()
   * @model containment="true"
   * @generated
   */
  Expr getClock();

  /**
   * Sets the value of the '{@link jkind.xtext.jkind.CondactExpr#getClock <em>Clock</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Clock</em>' containment reference.
   * @see #getClock()
   * @generated
   */
  void setClock(Expr value);

  /**
   * Returns the value of the '<em><b>Call</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Call</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Call</em>' containment reference.
   * @see #setCall(CallExpr)
   * @see jkind.xtext.jkind.JkindPackage#getCondactExpr_Call()
   * @model containment="true"
   * @generated
   */
  CallExpr getCall();

  /**
   * Sets the value of the '{@link jkind.xtext.jkind.CondactExpr#getCall <em>Call</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Call</em>' containment reference.
   * @see #getCall()
   * @generated
   */
  void setCall(CallExpr value);

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
   * @see jkind.xtext.jkind.JkindPackage#getCondactExpr_Args()
   * @model containment="true"
   * @generated
   */
  EList<Expr> getArgs();

} // CondactExpr
