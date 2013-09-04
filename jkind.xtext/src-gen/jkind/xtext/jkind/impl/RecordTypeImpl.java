/**
 */
package jkind.xtext.jkind.impl;

import java.util.Collection;

import jkind.xtext.jkind.JkindPackage;
import jkind.xtext.jkind.RecordType;
import jkind.xtext.jkind.Type;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EDataTypeEList;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Record Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link jkind.xtext.jkind.impl.RecordTypeImpl#getFields <em>Fields</em>}</li>
 *   <li>{@link jkind.xtext.jkind.impl.RecordTypeImpl#getTypes <em>Types</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RecordTypeImpl extends TopLevelTypeImpl implements RecordType
{
  /**
   * The cached value of the '{@link #getFields() <em>Fields</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFields()
   * @generated
   * @ordered
   */
  protected EList<String> fields;

  /**
   * The cached value of the '{@link #getTypes() <em>Types</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTypes()
   * @generated
   * @ordered
   */
  protected EList<Type> types;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected RecordTypeImpl()
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
    return JkindPackage.Literals.RECORD_TYPE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<String> getFields()
  {
    if (fields == null)
    {
      fields = new EDataTypeEList<String>(String.class, this, JkindPackage.RECORD_TYPE__FIELDS);
    }
    return fields;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Type> getTypes()
  {
    if (types == null)
    {
      types = new EObjectContainmentEList<Type>(Type.class, this, JkindPackage.RECORD_TYPE__TYPES);
    }
    return types;
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
      case JkindPackage.RECORD_TYPE__TYPES:
        return ((InternalEList<?>)getTypes()).basicRemove(otherEnd, msgs);
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
      case JkindPackage.RECORD_TYPE__FIELDS:
        return getFields();
      case JkindPackage.RECORD_TYPE__TYPES:
        return getTypes();
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
      case JkindPackage.RECORD_TYPE__FIELDS:
        getFields().clear();
        getFields().addAll((Collection<? extends String>)newValue);
        return;
      case JkindPackage.RECORD_TYPE__TYPES:
        getTypes().clear();
        getTypes().addAll((Collection<? extends Type>)newValue);
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
      case JkindPackage.RECORD_TYPE__FIELDS:
        getFields().clear();
        return;
      case JkindPackage.RECORD_TYPE__TYPES:
        getTypes().clear();
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
      case JkindPackage.RECORD_TYPE__FIELDS:
        return fields != null && !fields.isEmpty();
      case JkindPackage.RECORD_TYPE__TYPES:
        return types != null && !types.isEmpty();
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
    result.append(" (fields: ");
    result.append(fields);
    result.append(')');
    return result.toString();
  }

} //RecordTypeImpl
