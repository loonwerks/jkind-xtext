/**
 */
package jkind.xtext.jkind;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link jkind.xtext.jkind.Node#getName <em>Name</em>}</li>
 *   <li>{@link jkind.xtext.jkind.Node#getInputs <em>Inputs</em>}</li>
 *   <li>{@link jkind.xtext.jkind.Node#getOutputs <em>Outputs</em>}</li>
 *   <li>{@link jkind.xtext.jkind.Node#getLocals <em>Locals</em>}</li>
 *   <li>{@link jkind.xtext.jkind.Node#getEquations <em>Equations</em>}</li>
 *   <li>{@link jkind.xtext.jkind.Node#getProperties <em>Properties</em>}</li>
 *   <li>{@link jkind.xtext.jkind.Node#getAssertions <em>Assertions</em>}</li>
 *   <li>{@link jkind.xtext.jkind.Node#getMain <em>Main</em>}</li>
 * </ul>
 * </p>
 *
 * @see jkind.xtext.jkind.JkindPackage#getNode()
 * @model
 * @generated
 */
public interface Node extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see jkind.xtext.jkind.JkindPackage#getNode_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link jkind.xtext.jkind.Node#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Inputs</b></em>' containment reference list.
   * The list contents are of type {@link jkind.xtext.jkind.VarGroup}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Inputs</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Inputs</em>' containment reference list.
   * @see jkind.xtext.jkind.JkindPackage#getNode_Inputs()
   * @model containment="true"
   * @generated
   */
  EList<VarGroup> getInputs();

  /**
   * Returns the value of the '<em><b>Outputs</b></em>' containment reference list.
   * The list contents are of type {@link jkind.xtext.jkind.VarGroup}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Outputs</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Outputs</em>' containment reference list.
   * @see jkind.xtext.jkind.JkindPackage#getNode_Outputs()
   * @model containment="true"
   * @generated
   */
  EList<VarGroup> getOutputs();

  /**
   * Returns the value of the '<em><b>Locals</b></em>' containment reference list.
   * The list contents are of type {@link jkind.xtext.jkind.VarGroup}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Locals</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Locals</em>' containment reference list.
   * @see jkind.xtext.jkind.JkindPackage#getNode_Locals()
   * @model containment="true"
   * @generated
   */
  EList<VarGroup> getLocals();

  /**
   * Returns the value of the '<em><b>Equations</b></em>' containment reference list.
   * The list contents are of type {@link jkind.xtext.jkind.Equation}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Equations</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Equations</em>' containment reference list.
   * @see jkind.xtext.jkind.JkindPackage#getNode_Equations()
   * @model containment="true"
   * @generated
   */
  EList<Equation> getEquations();

  /**
   * Returns the value of the '<em><b>Properties</b></em>' containment reference list.
   * The list contents are of type {@link jkind.xtext.jkind.Property}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Properties</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Properties</em>' containment reference list.
   * @see jkind.xtext.jkind.JkindPackage#getNode_Properties()
   * @model containment="true"
   * @generated
   */
  EList<Property> getProperties();

  /**
   * Returns the value of the '<em><b>Assertions</b></em>' containment reference list.
   * The list contents are of type {@link jkind.xtext.jkind.Assertion}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Assertions</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Assertions</em>' containment reference list.
   * @see jkind.xtext.jkind.JkindPackage#getNode_Assertions()
   * @model containment="true"
   * @generated
   */
  EList<Assertion> getAssertions();

  /**
   * Returns the value of the '<em><b>Main</b></em>' attribute list.
   * The list contents are of type {@link java.lang.String}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Main</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Main</em>' attribute list.
   * @see jkind.xtext.jkind.JkindPackage#getNode_Main()
   * @model unique="false"
   * @generated
   */
  EList<String> getMain();

} // Node
