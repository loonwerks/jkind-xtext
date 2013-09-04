/**
 */
package jkind.xtext.jkind.impl;

import jkind.xtext.jkind.JkindPackage;
import jkind.xtext.jkind.SubrangeType;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Subrange Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link jkind.xtext.jkind.impl.SubrangeTypeImpl#getLow <em>Low</em>}</li>
 *   <li>{@link jkind.xtext.jkind.impl.SubrangeTypeImpl#getHigh <em>High</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SubrangeTypeImpl extends TypeImpl implements SubrangeType
{
  /**
   * The default value of the '{@link #getLow() <em>Low</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLow()
   * @generated
   * @ordered
   */
  protected static final int LOW_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getLow() <em>Low</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLow()
   * @generated
   * @ordered
   */
  protected int low = LOW_EDEFAULT;

  /**
   * The default value of the '{@link #getHigh() <em>High</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getHigh()
   * @generated
   * @ordered
   */
  protected static final int HIGH_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getHigh() <em>High</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getHigh()
   * @generated
   * @ordered
   */
  protected int high = HIGH_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected SubrangeTypeImpl()
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
    return JkindPackage.Literals.SUBRANGE_TYPE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getLow()
  {
    return low;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setLow(int newLow)
  {
    int oldLow = low;
    low = newLow;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, JkindPackage.SUBRANGE_TYPE__LOW, oldLow, low));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getHigh()
  {
    return high;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setHigh(int newHigh)
  {
    int oldHigh = high;
    high = newHigh;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, JkindPackage.SUBRANGE_TYPE__HIGH, oldHigh, high));
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
      case JkindPackage.SUBRANGE_TYPE__LOW:
        return getLow();
      case JkindPackage.SUBRANGE_TYPE__HIGH:
        return getHigh();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case JkindPackage.SUBRANGE_TYPE__LOW:
        setLow((Integer)newValue);
        return;
      case JkindPackage.SUBRANGE_TYPE__HIGH:
        setHigh((Integer)newValue);
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
      case JkindPackage.SUBRANGE_TYPE__LOW:
        setLow(LOW_EDEFAULT);
        return;
      case JkindPackage.SUBRANGE_TYPE__HIGH:
        setHigh(HIGH_EDEFAULT);
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
      case JkindPackage.SUBRANGE_TYPE__LOW:
        return low != LOW_EDEFAULT;
      case JkindPackage.SUBRANGE_TYPE__HIGH:
        return high != HIGH_EDEFAULT;
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
    result.append(" (low: ");
    result.append(low);
    result.append(", high: ");
    result.append(high);
    result.append(')');
    return result.toString();
  }

} //SubrangeTypeImpl
