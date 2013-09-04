/**
 */
package jkind.xtext.jkind;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Record Expr</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link jkind.xtext.jkind.RecordExpr#getDef <em>Def</em>}</li>
 *   <li>{@link jkind.xtext.jkind.RecordExpr#getFields <em>Fields</em>}</li>
 *   <li>{@link jkind.xtext.jkind.RecordExpr#getExprs <em>Exprs</em>}</li>
 * </ul>
 * </p>
 *
 * @see jkind.xtext.jkind.JkindPackage#getRecordExpr()
 * @model
 * @generated
 */
public interface RecordExpr extends Expr
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
   * @see jkind.xtext.jkind.JkindPackage#getRecordExpr_Def()
   * @model
   * @generated
   */
  Typedef getDef();

  /**
   * Sets the value of the '{@link jkind.xtext.jkind.RecordExpr#getDef <em>Def</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Def</em>' reference.
   * @see #getDef()
   * @generated
   */
  void setDef(Typedef value);

  /**
   * Returns the value of the '<em><b>Fields</b></em>' reference list.
   * The list contents are of type {@link jkind.xtext.jkind.Field}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Fields</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Fields</em>' reference list.
   * @see jkind.xtext.jkind.JkindPackage#getRecordExpr_Fields()
   * @model
   * @generated
   */
  EList<Field> getFields();

  /**
   * Returns the value of the '<em><b>Exprs</b></em>' containment reference list.
   * The list contents are of type {@link jkind.xtext.jkind.Expr}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Exprs</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Exprs</em>' containment reference list.
   * @see jkind.xtext.jkind.JkindPackage#getRecordExpr_Exprs()
   * @model containment="true"
   * @generated
   */
  EList<Expr> getExprs();

} // RecordExpr
