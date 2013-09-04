/**
 */
package jkind.xtext.jkind;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Record Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link jkind.xtext.jkind.RecordType#getFields <em>Fields</em>}</li>
 *   <li>{@link jkind.xtext.jkind.RecordType#getTypes <em>Types</em>}</li>
 * </ul>
 * </p>
 *
 * @see jkind.xtext.jkind.JkindPackage#getRecordType()
 * @model
 * @generated
 */
public interface RecordType extends TopLevelType
{
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
   * @see jkind.xtext.jkind.JkindPackage#getRecordType_Fields()
   * @model unique="false"
   * @generated
   */
  EList<String> getFields();

  /**
   * Returns the value of the '<em><b>Types</b></em>' containment reference list.
   * The list contents are of type {@link jkind.xtext.jkind.Type}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Types</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Types</em>' containment reference list.
   * @see jkind.xtext.jkind.JkindPackage#getRecordType_Types()
   * @model containment="true"
   * @generated
   */
  EList<Type> getTypes();

} // RecordType
