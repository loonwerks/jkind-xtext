/**
 */
package jkind.xtext.jkind.impl;

import java.util.Collection;

import jkind.xtext.jkind.Constant;
import jkind.xtext.jkind.File;
import jkind.xtext.jkind.JkindPackage;
import jkind.xtext.jkind.Node;
import jkind.xtext.jkind.Typedef;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>File</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link jkind.xtext.jkind.impl.FileImpl#getTypedefs <em>Typedefs</em>}</li>
 *   <li>{@link jkind.xtext.jkind.impl.FileImpl#getConstants <em>Constants</em>}</li>
 *   <li>{@link jkind.xtext.jkind.impl.FileImpl#getNodes <em>Nodes</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FileImpl extends MinimalEObjectImpl.Container implements File
{
  /**
   * The cached value of the '{@link #getTypedefs() <em>Typedefs</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTypedefs()
   * @generated
   * @ordered
   */
  protected EList<Typedef> typedefs;

  /**
   * The cached value of the '{@link #getConstants() <em>Constants</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getConstants()
   * @generated
   * @ordered
   */
  protected EList<Constant> constants;

  /**
   * The cached value of the '{@link #getNodes() <em>Nodes</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNodes()
   * @generated
   * @ordered
   */
  protected EList<Node> nodes;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected FileImpl()
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
    return JkindPackage.Literals.FILE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Typedef> getTypedefs()
  {
    if (typedefs == null)
    {
      typedefs = new EObjectContainmentEList<Typedef>(Typedef.class, this, JkindPackage.FILE__TYPEDEFS);
    }
    return typedefs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Constant> getConstants()
  {
    if (constants == null)
    {
      constants = new EObjectContainmentEList<Constant>(Constant.class, this, JkindPackage.FILE__CONSTANTS);
    }
    return constants;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Node> getNodes()
  {
    if (nodes == null)
    {
      nodes = new EObjectContainmentEList<Node>(Node.class, this, JkindPackage.FILE__NODES);
    }
    return nodes;
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
      case JkindPackage.FILE__TYPEDEFS:
        return ((InternalEList<?>)getTypedefs()).basicRemove(otherEnd, msgs);
      case JkindPackage.FILE__CONSTANTS:
        return ((InternalEList<?>)getConstants()).basicRemove(otherEnd, msgs);
      case JkindPackage.FILE__NODES:
        return ((InternalEList<?>)getNodes()).basicRemove(otherEnd, msgs);
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
      case JkindPackage.FILE__TYPEDEFS:
        return getTypedefs();
      case JkindPackage.FILE__CONSTANTS:
        return getConstants();
      case JkindPackage.FILE__NODES:
        return getNodes();
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
      case JkindPackage.FILE__TYPEDEFS:
        getTypedefs().clear();
        getTypedefs().addAll((Collection<? extends Typedef>)newValue);
        return;
      case JkindPackage.FILE__CONSTANTS:
        getConstants().clear();
        getConstants().addAll((Collection<? extends Constant>)newValue);
        return;
      case JkindPackage.FILE__NODES:
        getNodes().clear();
        getNodes().addAll((Collection<? extends Node>)newValue);
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
      case JkindPackage.FILE__TYPEDEFS:
        getTypedefs().clear();
        return;
      case JkindPackage.FILE__CONSTANTS:
        getConstants().clear();
        return;
      case JkindPackage.FILE__NODES:
        getNodes().clear();
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
      case JkindPackage.FILE__TYPEDEFS:
        return typedefs != null && !typedefs.isEmpty();
      case JkindPackage.FILE__CONSTANTS:
        return constants != null && !constants.isEmpty();
      case JkindPackage.FILE__NODES:
        return nodes != null && !nodes.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //FileImpl
