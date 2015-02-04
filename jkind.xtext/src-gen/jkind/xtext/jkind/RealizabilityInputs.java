/**
 */
package jkind.xtext.jkind;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Realizability Inputs</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link jkind.xtext.jkind.RealizabilityInputs#getIds <em>Ids</em>}</li>
 * </ul>
 * </p>
 *
 * @see jkind.xtext.jkind.JkindPackage#getRealizabilityInputs()
 * @model
 * @generated
 */
public interface RealizabilityInputs extends EObject
{
  /**
   * Returns the value of the '<em><b>Ids</b></em>' reference list.
   * The list contents are of type {@link jkind.xtext.jkind.Variable}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Ids</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Ids</em>' reference list.
   * @see jkind.xtext.jkind.JkindPackage#getRealizabilityInputs_Ids()
   * @model
   * @generated
   */
  EList<Variable> getIds();

} // RealizabilityInputs
