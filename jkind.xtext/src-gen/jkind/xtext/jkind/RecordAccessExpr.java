/**
 */
package jkind.xtext.jkind;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Record Access Expr</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link jkind.xtext.jkind.RecordAccessExpr#getRecord <em>Record</em>}</li>
 *   <li>{@link jkind.xtext.jkind.RecordAccessExpr#getField <em>Field</em>}</li>
 * </ul>
 * </p>
 *
 * @see jkind.xtext.jkind.JkindPackage#getRecordAccessExpr()
 * @model
 * @generated
 */
public interface RecordAccessExpr extends Expr
{
  /**
   * Returns the value of the '<em><b>Record</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Record</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Record</em>' containment reference.
   * @see #setRecord(Expr)
   * @see jkind.xtext.jkind.JkindPackage#getRecordAccessExpr_Record()
   * @model containment="true"
   * @generated
   */
  Expr getRecord();

  /**
   * Sets the value of the '{@link jkind.xtext.jkind.RecordAccessExpr#getRecord <em>Record</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Record</em>' containment reference.
   * @see #getRecord()
   * @generated
   */
  void setRecord(Expr value);

  /**
   * Returns the value of the '<em><b>Field</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Field</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Field</em>' reference.
   * @see #setField(Field)
   * @see jkind.xtext.jkind.JkindPackage#getRecordAccessExpr_Field()
   * @model
   * @generated
   */
  Field getField();

  /**
   * Sets the value of the '{@link jkind.xtext.jkind.RecordAccessExpr#getField <em>Field</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Field</em>' reference.
   * @see #getField()
   * @generated
   */
  void setField(Field value);

} // RecordAccessExpr
