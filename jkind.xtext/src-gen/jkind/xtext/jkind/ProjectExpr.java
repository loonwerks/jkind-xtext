/**
 */
package jkind.xtext.jkind;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Project Expr</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link jkind.xtext.jkind.ProjectExpr#getExpr <em>Expr</em>}</li>
 *   <li>{@link jkind.xtext.jkind.ProjectExpr#getField <em>Field</em>}</li>
 * </ul>
 * </p>
 *
 * @see jkind.xtext.jkind.JkindPackage#getProjectExpr()
 * @model
 * @generated
 */
public interface ProjectExpr extends Expr
{
  /**
   * Returns the value of the '<em><b>Expr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Expr</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Expr</em>' containment reference.
   * @see #setExpr(Expr)
   * @see jkind.xtext.jkind.JkindPackage#getProjectExpr_Expr()
   * @model containment="true"
   * @generated
   */
  Expr getExpr();

  /**
   * Sets the value of the '{@link jkind.xtext.jkind.ProjectExpr#getExpr <em>Expr</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Expr</em>' containment reference.
   * @see #getExpr()
   * @generated
   */
  void setExpr(Expr value);

  /**
   * Returns the value of the '<em><b>Field</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Field</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Field</em>' attribute.
   * @see #setField(String)
   * @see jkind.xtext.jkind.JkindPackage#getProjectExpr_Field()
   * @model
   * @generated
   */
  String getField();

  /**
   * Sets the value of the '{@link jkind.xtext.jkind.ProjectExpr#getField <em>Field</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Field</em>' attribute.
   * @see #getField()
   * @generated
   */
  void setField(String value);

} // ProjectExpr
