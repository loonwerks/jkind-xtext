/**
 */
package jkind.xtext.jkind;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link jkind.xtext.jkind.Node#getLocals <em>Locals</em>}</li>
 *   <li>{@link jkind.xtext.jkind.Node#getEquations <em>Equations</em>}</li>
 *   <li>{@link jkind.xtext.jkind.Node#getAssertions <em>Assertions</em>}</li>
 *   <li>{@link jkind.xtext.jkind.Node#getProperties <em>Properties</em>}</li>
 *   <li>{@link jkind.xtext.jkind.Node#getMain <em>Main</em>}</li>
 *   <li>{@link jkind.xtext.jkind.Node#getIvc <em>Ivc</em>}</li>
 *   <li>{@link jkind.xtext.jkind.Node#getRealizabilityInputs <em>Realizability Inputs</em>}</li>
 * </ul>
 * </p>
 *
 * @see jkind.xtext.jkind.JkindPackage#getNode()
 * @model
 * @generated
 */
public interface Node extends Callable
{
  /**
   * Returns the value of the '<em><b>Locals</b></em>' containment reference list.
   * The list contents are of type {@link jkind.xtext.jkind.VariableGroup}.
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
  EList<VariableGroup> getLocals();

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

  /**
   * Returns the value of the '<em><b>Ivc</b></em>' containment reference list.
   * The list contents are of type {@link jkind.xtext.jkind.Ivc}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Ivc</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Ivc</em>' containment reference list.
   * @see jkind.xtext.jkind.JkindPackage#getNode_Ivc()
   * @model containment="true"
   * @generated
   */
  EList<Ivc> getIvc();

  /**
   * Returns the value of the '<em><b>Realizability Inputs</b></em>' containment reference list.
   * The list contents are of type {@link jkind.xtext.jkind.RealizabilityInputs}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Realizability Inputs</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Realizability Inputs</em>' containment reference list.
   * @see jkind.xtext.jkind.JkindPackage#getNode_RealizabilityInputs()
   * @model containment="true"
   * @generated
   */
  EList<RealizabilityInputs> getRealizabilityInputs();

} // Node
