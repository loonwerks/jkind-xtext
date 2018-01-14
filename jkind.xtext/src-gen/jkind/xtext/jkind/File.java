/**
 */
package jkind.xtext.jkind;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>File</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link jkind.xtext.jkind.File#getTypedefs <em>Typedefs</em>}</li>
 *   <li>{@link jkind.xtext.jkind.File#getConstants <em>Constants</em>}</li>
 *   <li>{@link jkind.xtext.jkind.File#getFunctions <em>Functions</em>}</li>
 *   <li>{@link jkind.xtext.jkind.File#getNodes <em>Nodes</em>}</li>
 * </ul>
 * </p>
 *
 * @see jkind.xtext.jkind.JkindPackage#getFile()
 * @model
 * @generated
 */
public interface File extends EObject
{
  /**
   * Returns the value of the '<em><b>Typedefs</b></em>' containment reference list.
   * The list contents are of type {@link jkind.xtext.jkind.TypeDef}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Typedefs</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Typedefs</em>' containment reference list.
   * @see jkind.xtext.jkind.JkindPackage#getFile_Typedefs()
   * @model containment="true"
   * @generated
   */
  EList<TypeDef> getTypedefs();

  /**
   * Returns the value of the '<em><b>Constants</b></em>' containment reference list.
   * The list contents are of type {@link jkind.xtext.jkind.Constant}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Constants</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Constants</em>' containment reference list.
   * @see jkind.xtext.jkind.JkindPackage#getFile_Constants()
   * @model containment="true"
   * @generated
   */
  EList<Constant> getConstants();

  /**
   * Returns the value of the '<em><b>Functions</b></em>' containment reference list.
   * The list contents are of type {@link jkind.xtext.jkind.Function}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Functions</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Functions</em>' containment reference list.
   * @see jkind.xtext.jkind.JkindPackage#getFile_Functions()
   * @model containment="true"
   * @generated
   */
  EList<Function> getFunctions();

  /**
   * Returns the value of the '<em><b>Nodes</b></em>' containment reference list.
   * The list contents are of type {@link jkind.xtext.jkind.Node}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Nodes</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Nodes</em>' containment reference list.
   * @see jkind.xtext.jkind.JkindPackage#getFile_Nodes()
   * @model containment="true"
   * @generated
   */
  EList<Node> getNodes();

} // File
