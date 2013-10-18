/**
 */
package jkind.xtext.jkind.impl;

import java.util.Collection;

import jkind.xtext.jkind.CondactExpr;
import jkind.xtext.jkind.Expr;
import jkind.xtext.jkind.JkindPackage;
import jkind.xtext.jkind.NodeCallExpr;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Condact Expr</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link jkind.xtext.jkind.impl.CondactExprImpl#getClock <em>Clock</em>}</li>
 *   <li>{@link jkind.xtext.jkind.impl.CondactExprImpl#getCall <em>Call</em>}</li>
 *   <li>{@link jkind.xtext.jkind.impl.CondactExprImpl#getArgs <em>Args</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CondactExprImpl extends ExprImpl implements CondactExpr
{
  /**
   * The cached value of the '{@link #getClock() <em>Clock</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getClock()
   * @generated
   * @ordered
   */
  protected Expr clock;

  /**
   * The cached value of the '{@link #getCall() <em>Call</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCall()
   * @generated
   * @ordered
   */
  protected NodeCallExpr call;

  /**
   * The cached value of the '{@link #getArgs() <em>Args</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getArgs()
   * @generated
   * @ordered
   */
  protected EList<Expr> args;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected CondactExprImpl()
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
    return JkindPackage.Literals.CONDACT_EXPR;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Expr getClock()
  {
    return clock;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetClock(Expr newClock, NotificationChain msgs)
  {
    Expr oldClock = clock;
    clock = newClock;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, JkindPackage.CONDACT_EXPR__CLOCK, oldClock, newClock);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setClock(Expr newClock)
  {
    if (newClock != clock)
    {
      NotificationChain msgs = null;
      if (clock != null)
        msgs = ((InternalEObject)clock).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - JkindPackage.CONDACT_EXPR__CLOCK, null, msgs);
      if (newClock != null)
        msgs = ((InternalEObject)newClock).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - JkindPackage.CONDACT_EXPR__CLOCK, null, msgs);
      msgs = basicSetClock(newClock, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, JkindPackage.CONDACT_EXPR__CLOCK, newClock, newClock));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NodeCallExpr getCall()
  {
    return call;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetCall(NodeCallExpr newCall, NotificationChain msgs)
  {
    NodeCallExpr oldCall = call;
    call = newCall;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, JkindPackage.CONDACT_EXPR__CALL, oldCall, newCall);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setCall(NodeCallExpr newCall)
  {
    if (newCall != call)
    {
      NotificationChain msgs = null;
      if (call != null)
        msgs = ((InternalEObject)call).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - JkindPackage.CONDACT_EXPR__CALL, null, msgs);
      if (newCall != null)
        msgs = ((InternalEObject)newCall).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - JkindPackage.CONDACT_EXPR__CALL, null, msgs);
      msgs = basicSetCall(newCall, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, JkindPackage.CONDACT_EXPR__CALL, newCall, newCall));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Expr> getArgs()
  {
    if (args == null)
    {
      args = new EObjectContainmentEList<Expr>(Expr.class, this, JkindPackage.CONDACT_EXPR__ARGS);
    }
    return args;
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
      case JkindPackage.CONDACT_EXPR__CLOCK:
        return basicSetClock(null, msgs);
      case JkindPackage.CONDACT_EXPR__CALL:
        return basicSetCall(null, msgs);
      case JkindPackage.CONDACT_EXPR__ARGS:
        return ((InternalEList<?>)getArgs()).basicRemove(otherEnd, msgs);
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
      case JkindPackage.CONDACT_EXPR__CLOCK:
        return getClock();
      case JkindPackage.CONDACT_EXPR__CALL:
        return getCall();
      case JkindPackage.CONDACT_EXPR__ARGS:
        return getArgs();
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
      case JkindPackage.CONDACT_EXPR__CLOCK:
        setClock((Expr)newValue);
        return;
      case JkindPackage.CONDACT_EXPR__CALL:
        setCall((NodeCallExpr)newValue);
        return;
      case JkindPackage.CONDACT_EXPR__ARGS:
        getArgs().clear();
        getArgs().addAll((Collection<? extends Expr>)newValue);
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
      case JkindPackage.CONDACT_EXPR__CLOCK:
        setClock((Expr)null);
        return;
      case JkindPackage.CONDACT_EXPR__CALL:
        setCall((NodeCallExpr)null);
        return;
      case JkindPackage.CONDACT_EXPR__ARGS:
        getArgs().clear();
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
      case JkindPackage.CONDACT_EXPR__CLOCK:
        return clock != null;
      case JkindPackage.CONDACT_EXPR__CALL:
        return call != null;
      case JkindPackage.CONDACT_EXPR__ARGS:
        return args != null && !args.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //CondactExprImpl
