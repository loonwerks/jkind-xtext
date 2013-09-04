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
 *   <li>{@link jkind.xtext.jkind.RecordExpr#getId <em>Id</em>}</li>
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
   * Returns the value of the '<em><b>Id</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Id</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Id</em>' reference.
   * @see #setId(Typedef)
   * @see jkind.xtext.jkind.JkindPackage#getRecordExpr_Id()
   * @model
   * @generated
   */
  Typedef getId();

  /**
   * Sets the value of the '{@link jkind.xtext.jkind.RecordExpr#getId <em>Id</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Id</em>' reference.
   * @see #getId()
   * @generated
   */
  void setId(Typedef value);

  /**
   * Returns the value of the '<em><b>Fields</b></em>' attribute list.
   * The list contents are of type {@link java.lang.String}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Fields</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Fields</em>' attribute list.
   * @see jkind.xtext.jkind.JkindPackage#getRecordExpr_Fields()
   * @model unique="false"
   * @generated
   */
  EList<String> getFields();

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
