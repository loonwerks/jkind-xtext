/**
 */
package jkind.xtext.jkind;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Node Call Expr</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link jkind.xtext.jkind.NodeCallExpr#getNode <em>Node</em>}</li>
 *   <li>{@link jkind.xtext.jkind.NodeCallExpr#getArgs <em>Args</em>}</li>
 * </ul>
 * </p>
 *
 * @see jkind.xtext.jkind.JkindPackage#getNodeCallExpr()
 * @model
 * @generated
 */
public interface NodeCallExpr extends Expr
{
  /**
   * Returns the value of the '<em><b>Node</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Node</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Node</em>' reference.
   * @see #setNode(Node)
   * @see jkind.xtext.jkind.JkindPackage#getNodeCallExpr_Node()
   * @model
   * @generated
   */
  Node getNode();

  /**
   * Sets the value of the '{@link jkind.xtext.jkind.NodeCallExpr#getNode <em>Node</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Node</em>' reference.
   * @see #getNode()
   * @generated
   */
  void setNode(Node value);

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
   * @see jkind.xtext.jkind.JkindPackage#getNodeCallExpr_Args()
   * @model containment="true"
   * @generated
   */
  EList<Expr> getArgs();

} // NodeCallExpr
