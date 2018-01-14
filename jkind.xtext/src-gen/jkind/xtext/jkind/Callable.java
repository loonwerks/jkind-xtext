/**
 */
package jkind.xtext.jkind;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Callable</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link jkind.xtext.jkind.Callable#getName <em>Name</em>}</li>
 *   <li>{@link jkind.xtext.jkind.Callable#getInputs <em>Inputs</em>}</li>
 *   <li>{@link jkind.xtext.jkind.Callable#getOutputs <em>Outputs</em>}</li>
 * </ul>
 * </p>
 *
 * @see jkind.xtext.jkind.JkindPackage#getCallable()
 * @model
 * @generated
 */
public interface Callable extends EObject
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
   * @see jkind.xtext.jkind.JkindPackage#getCallable_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link jkind.xtext.jkind.Callable#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Inputs</b></em>' containment reference list.
   * The list contents are of type {@link jkind.xtext.jkind.VariableGroup}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Inputs</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Inputs</em>' containment reference list.
   * @see jkind.xtext.jkind.JkindPackage#getCallable_Inputs()
   * @model containment="true"
   * @generated
   */
  EList<VariableGroup> getInputs();

  /**
   * Returns the value of the '<em><b>Outputs</b></em>' containment reference list.
   * The list contents are of type {@link jkind.xtext.jkind.VariableGroup}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Outputs</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Outputs</em>' containment reference list.
   * @see jkind.xtext.jkind.JkindPackage#getCallable_Outputs()
   * @model containment="true"
   * @generated
   */
  EList<VariableGroup> getOutputs();

} // Callable
