/**
 */
package jkind.xtext.jkind.impl;

import java.util.Collection;

import jkind.xtext.jkind.Assertion;
import jkind.xtext.jkind.Equation;
import jkind.xtext.jkind.Ivc;
import jkind.xtext.jkind.JkindPackage;
import jkind.xtext.jkind.Node;
import jkind.xtext.jkind.Property;
import jkind.xtext.jkind.RealizabilityInputs;
import jkind.xtext.jkind.VariableGroup;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EDataTypeEList;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Node</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link jkind.xtext.jkind.impl.NodeImpl#getLocals <em>Locals</em>}</li>
 *   <li>{@link jkind.xtext.jkind.impl.NodeImpl#getEquations <em>Equations</em>}</li>
 *   <li>{@link jkind.xtext.jkind.impl.NodeImpl#getAssertions <em>Assertions</em>}</li>
 *   <li>{@link jkind.xtext.jkind.impl.NodeImpl#getProperties <em>Properties</em>}</li>
 *   <li>{@link jkind.xtext.jkind.impl.NodeImpl#getMain <em>Main</em>}</li>
 *   <li>{@link jkind.xtext.jkind.impl.NodeImpl#getIvc <em>Ivc</em>}</li>
 *   <li>{@link jkind.xtext.jkind.impl.NodeImpl#getRealizabilityInputs <em>Realizability Inputs</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class NodeImpl extends CallableImpl implements Node
{
  /**
   * The cached value of the '{@link #getLocals() <em>Locals</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLocals()
   * @generated
   * @ordered
   */
  protected EList<VariableGroup> locals;

  /**
   * The cached value of the '{@link #getEquations() <em>Equations</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEquations()
   * @generated
   * @ordered
   */
  protected EList<Equation> equations;

  /**
   * The cached value of the '{@link #getAssertions() <em>Assertions</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAssertions()
   * @generated
   * @ordered
   */
  protected EList<Assertion> assertions;

  /**
   * The cached value of the '{@link #getProperties() <em>Properties</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getProperties()
   * @generated
   * @ordered
   */
  protected EList<Property> properties;

  /**
   * The cached value of the '{@link #getMain() <em>Main</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMain()
   * @generated
   * @ordered
   */
  protected EList<String> main;

  /**
   * The cached value of the '{@link #getIvc() <em>Ivc</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIvc()
   * @generated
   * @ordered
   */
  protected EList<Ivc> ivc;

  /**
   * The cached value of the '{@link #getRealizabilityInputs() <em>Realizability Inputs</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRealizabilityInputs()
   * @generated
   * @ordered
   */
  protected EList<RealizabilityInputs> realizabilityInputs;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected NodeImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return JkindPackage.Literals.NODE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<VariableGroup> getLocals()
  {
    if (locals == null)
    {
      locals = new EObjectContainmentEList<VariableGroup>(VariableGroup.class, this, JkindPackage.NODE__LOCALS);
    }
    return locals;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Equation> getEquations()
  {
    if (equations == null)
    {
      equations = new EObjectContainmentEList<Equation>(Equation.class, this, JkindPackage.NODE__EQUATIONS);
    }
    return equations;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Assertion> getAssertions()
  {
    if (assertions == null)
    {
      assertions = new EObjectContainmentEList<Assertion>(Assertion.class, this, JkindPackage.NODE__ASSERTIONS);
    }
    return assertions;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Property> getProperties()
  {
    if (properties == null)
    {
      properties = new EObjectContainmentEList<Property>(Property.class, this, JkindPackage.NODE__PROPERTIES);
    }
    return properties;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<String> getMain()
  {
    if (main == null)
    {
      main = new EDataTypeEList<String>(String.class, this, JkindPackage.NODE__MAIN);
    }
    return main;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Ivc> getIvc()
  {
    if (ivc == null)
    {
      ivc = new EObjectContainmentEList<Ivc>(Ivc.class, this, JkindPackage.NODE__IVC);
    }
    return ivc;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<RealizabilityInputs> getRealizabilityInputs()
  {
    if (realizabilityInputs == null)
    {
      realizabilityInputs = new EObjectContainmentEList<RealizabilityInputs>(RealizabilityInputs.class, this, JkindPackage.NODE__REALIZABILITY_INPUTS);
    }
    return realizabilityInputs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case JkindPackage.NODE__LOCALS:
        return ((InternalEList<?>)getLocals()).basicRemove(otherEnd, msgs);
      case JkindPackage.NODE__EQUATIONS:
        return ((InternalEList<?>)getEquations()).basicRemove(otherEnd, msgs);
      case JkindPackage.NODE__ASSERTIONS:
        return ((InternalEList<?>)getAssertions()).basicRemove(otherEnd, msgs);
      case JkindPackage.NODE__PROPERTIES:
        return ((InternalEList<?>)getProperties()).basicRemove(otherEnd, msgs);
      case JkindPackage.NODE__IVC:
        return ((InternalEList<?>)getIvc()).basicRemove(otherEnd, msgs);
      case JkindPackage.NODE__REALIZABILITY_INPUTS:
        return ((InternalEList<?>)getRealizabilityInputs()).basicRemove(otherEnd, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case JkindPackage.NODE__LOCALS:
        return getLocals();
      case JkindPackage.NODE__EQUATIONS:
        return getEquations();
      case JkindPackage.NODE__ASSERTIONS:
        return getAssertions();
      case JkindPackage.NODE__PROPERTIES:
        return getProperties();
      case JkindPackage.NODE__MAIN:
        return getMain();
      case JkindPackage.NODE__IVC:
        return getIvc();
      case JkindPackage.NODE__REALIZABILITY_INPUTS:
        return getRealizabilityInputs();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case JkindPackage.NODE__LOCALS:
        getLocals().clear();
        getLocals().addAll((Collection<? extends VariableGroup>)newValue);
        return;
      case JkindPackage.NODE__EQUATIONS:
        getEquations().clear();
        getEquations().addAll((Collection<? extends Equation>)newValue);
        return;
      case JkindPackage.NODE__ASSERTIONS:
        getAssertions().clear();
        getAssertions().addAll((Collection<? extends Assertion>)newValue);
        return;
      case JkindPackage.NODE__PROPERTIES:
        getProperties().clear();
        getProperties().addAll((Collection<? extends Property>)newValue);
        return;
      case JkindPackage.NODE__MAIN:
        getMain().clear();
        getMain().addAll((Collection<? extends String>)newValue);
        return;
      case JkindPackage.NODE__IVC:
        getIvc().clear();
        getIvc().addAll((Collection<? extends Ivc>)newValue);
        return;
      case JkindPackage.NODE__REALIZABILITY_INPUTS:
        getRealizabilityInputs().clear();
        getRealizabilityInputs().addAll((Collection<? extends RealizabilityInputs>)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case JkindPackage.NODE__LOCALS:
        getLocals().clear();
        return;
      case JkindPackage.NODE__EQUATIONS:
        getEquations().clear();
        return;
      case JkindPackage.NODE__ASSERTIONS:
        getAssertions().clear();
        return;
      case JkindPackage.NODE__PROPERTIES:
        getProperties().clear();
        return;
      case JkindPackage.NODE__MAIN:
        getMain().clear();
        return;
      case JkindPackage.NODE__IVC:
        getIvc().clear();
        return;
      case JkindPackage.NODE__REALIZABILITY_INPUTS:
        getRealizabilityInputs().clear();
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case JkindPackage.NODE__LOCALS:
        return locals != null && !locals.isEmpty();
      case JkindPackage.NODE__EQUATIONS:
        return equations != null && !equations.isEmpty();
      case JkindPackage.NODE__ASSERTIONS:
        return assertions != null && !assertions.isEmpty();
      case JkindPackage.NODE__PROPERTIES:
        return properties != null && !properties.isEmpty();
      case JkindPackage.NODE__MAIN:
        return main != null && !main.isEmpty();
      case JkindPackage.NODE__IVC:
        return ivc != null && !ivc.isEmpty();
      case JkindPackage.NODE__REALIZABILITY_INPUTS:
        return realizabilityInputs != null && !realizabilityInputs.isEmpty();
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (main: ");
    result.append(main);
    result.append(')');
    return result.toString();
  }

} //NodeImpl
