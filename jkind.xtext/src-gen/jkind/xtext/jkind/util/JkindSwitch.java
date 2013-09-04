/**
 */
package jkind.xtext.jkind.util;

import jkind.xtext.jkind.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see jkind.xtext.jkind.JkindPackage
 * @generated
 */
public class JkindSwitch<T> extends Switch<T>
{
  /**
   * The cached model package
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static JkindPackage modelPackage;

  /**
   * Creates an instance of the switch.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public JkindSwitch()
  {
    if (modelPackage == null)
    {
      modelPackage = JkindPackage.eINSTANCE;
    }
  }

  /**
   * Checks whether this is a switch for the given package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @parameter ePackage the package in question.
   * @return whether this is a switch for the given package.
   * @generated
   */
  @Override
  protected boolean isSwitchFor(EPackage ePackage)
  {
    return ePackage == modelPackage;
  }

  /**
   * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the first non-null result returned by a <code>caseXXX</code> call.
   * @generated
   */
  @Override
  protected T doSwitch(int classifierID, EObject theEObject)
  {
    switch (classifierID)
    {
      case JkindPackage.FILE:
      {
        File file = (File)theEObject;
        T result = caseFile(file);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case JkindPackage.TYPEDEF:
      {
        Typedef typedef = (Typedef)theEObject;
        T result = caseTypedef(typedef);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case JkindPackage.TOP_LEVEL_TYPE:
      {
        TopLevelType topLevelType = (TopLevelType)theEObject;
        T result = caseTopLevelType(topLevelType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case JkindPackage.TYPE:
      {
        Type type = (Type)theEObject;
        T result = caseType(type);
        if (result == null) result = caseTopLevelType(type);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case JkindPackage.CONSTANT:
      {
        Constant constant = (Constant)theEObject;
        T result = caseConstant(constant);
        if (result == null) result = caseIdRef(constant);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case JkindPackage.NODE:
      {
        Node node = (Node)theEObject;
        T result = caseNode(node);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case JkindPackage.VARIABLE_GROUP:
      {
        VariableGroup variableGroup = (VariableGroup)theEObject;
        T result = caseVariableGroup(variableGroup);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case JkindPackage.VARIABLE:
      {
        Variable variable = (Variable)theEObject;
        T result = caseVariable(variable);
        if (result == null) result = caseIdRef(variable);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case JkindPackage.EQUATION:
      {
        Equation equation = (Equation)theEObject;
        T result = caseEquation(equation);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case JkindPackage.PROPERTY:
      {
        Property property = (Property)theEObject;
        T result = caseProperty(property);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case JkindPackage.ASSERTION:
      {
        Assertion assertion = (Assertion)theEObject;
        T result = caseAssertion(assertion);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case JkindPackage.EXPR:
      {
        Expr expr = (Expr)theEObject;
        T result = caseExpr(expr);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case JkindPackage.ID_REF:
      {
        IdRef idRef = (IdRef)theEObject;
        T result = caseIdRef(idRef);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case JkindPackage.RECORD_TYPE:
      {
        RecordType recordType = (RecordType)theEObject;
        T result = caseRecordType(recordType);
        if (result == null) result = caseTopLevelType(recordType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case JkindPackage.INT_TYPE:
      {
        IntType intType = (IntType)theEObject;
        T result = caseIntType(intType);
        if (result == null) result = caseType(intType);
        if (result == null) result = caseTopLevelType(intType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case JkindPackage.BOOL_TYPE:
      {
        BoolType boolType = (BoolType)theEObject;
        T result = caseBoolType(boolType);
        if (result == null) result = caseType(boolType);
        if (result == null) result = caseTopLevelType(boolType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case JkindPackage.REAL_TYPE:
      {
        RealType realType = (RealType)theEObject;
        T result = caseRealType(realType);
        if (result == null) result = caseType(realType);
        if (result == null) result = caseTopLevelType(realType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case JkindPackage.SUBRANGE_TYPE:
      {
        SubrangeType subrangeType = (SubrangeType)theEObject;
        T result = caseSubrangeType(subrangeType);
        if (result == null) result = caseType(subrangeType);
        if (result == null) result = caseTopLevelType(subrangeType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case JkindPackage.USER_TYPE:
      {
        UserType userType = (UserType)theEObject;
        T result = caseUserType(userType);
        if (result == null) result = caseType(userType);
        if (result == null) result = caseTopLevelType(userType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case JkindPackage.BINARY_EXPR:
      {
        BinaryExpr binaryExpr = (BinaryExpr)theEObject;
        T result = caseBinaryExpr(binaryExpr);
        if (result == null) result = caseExpr(binaryExpr);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case JkindPackage.UNARY_EXPR:
      {
        UnaryExpr unaryExpr = (UnaryExpr)theEObject;
        T result = caseUnaryExpr(unaryExpr);
        if (result == null) result = caseExpr(unaryExpr);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case JkindPackage.PROJECT_EXPR:
      {
        ProjectExpr projectExpr = (ProjectExpr)theEObject;
        T result = caseProjectExpr(projectExpr);
        if (result == null) result = caseExpr(projectExpr);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case JkindPackage.ID_EXPR:
      {
        IdExpr idExpr = (IdExpr)theEObject;
        T result = caseIdExpr(idExpr);
        if (result == null) result = caseExpr(idExpr);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case JkindPackage.INT_EXPR:
      {
        IntExpr intExpr = (IntExpr)theEObject;
        T result = caseIntExpr(intExpr);
        if (result == null) result = caseExpr(intExpr);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case JkindPackage.REAL_EXPR:
      {
        RealExpr realExpr = (RealExpr)theEObject;
        T result = caseRealExpr(realExpr);
        if (result == null) result = caseExpr(realExpr);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case JkindPackage.BOOL_EXPR:
      {
        BoolExpr boolExpr = (BoolExpr)theEObject;
        T result = caseBoolExpr(boolExpr);
        if (result == null) result = caseExpr(boolExpr);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case JkindPackage.IF_THEN_ELSE_EXPR:
      {
        IfThenElseExpr ifThenElseExpr = (IfThenElseExpr)theEObject;
        T result = caseIfThenElseExpr(ifThenElseExpr);
        if (result == null) result = caseExpr(ifThenElseExpr);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case JkindPackage.NODE_CALL_EXPR:
      {
        NodeCallExpr nodeCallExpr = (NodeCallExpr)theEObject;
        T result = caseNodeCallExpr(nodeCallExpr);
        if (result == null) result = caseExpr(nodeCallExpr);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case JkindPackage.RECORD_EXPR:
      {
        RecordExpr recordExpr = (RecordExpr)theEObject;
        T result = caseRecordExpr(recordExpr);
        if (result == null) result = caseExpr(recordExpr);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      default: return defaultCase(theEObject);
    }
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>File</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>File</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseFile(File object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Typedef</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Typedef</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTypedef(Typedef object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Top Level Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Top Level Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTopLevelType(TopLevelType object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseType(Type object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Constant</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Constant</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseConstant(Constant object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Node</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Node</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseNode(Node object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Variable Group</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Variable Group</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseVariableGroup(VariableGroup object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Variable</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Variable</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseVariable(Variable object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Equation</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Equation</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseEquation(Equation object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Property</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Property</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseProperty(Property object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Assertion</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Assertion</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAssertion(Assertion object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Expr</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Expr</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseExpr(Expr object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Id Ref</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Id Ref</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseIdRef(IdRef object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Record Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Record Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseRecordType(RecordType object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Int Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Int Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseIntType(IntType object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Bool Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Bool Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseBoolType(BoolType object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Real Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Real Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseRealType(RealType object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Subrange Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Subrange Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSubrangeType(SubrangeType object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>User Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>User Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseUserType(UserType object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Binary Expr</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Binary Expr</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseBinaryExpr(BinaryExpr object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Unary Expr</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Unary Expr</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseUnaryExpr(UnaryExpr object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Project Expr</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Project Expr</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseProjectExpr(ProjectExpr object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Id Expr</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Id Expr</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseIdExpr(IdExpr object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Int Expr</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Int Expr</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseIntExpr(IntExpr object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Real Expr</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Real Expr</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseRealExpr(RealExpr object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Bool Expr</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Bool Expr</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseBoolExpr(BoolExpr object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>If Then Else Expr</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>If Then Else Expr</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseIfThenElseExpr(IfThenElseExpr object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Node Call Expr</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Node Call Expr</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseNodeCallExpr(NodeCallExpr object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Record Expr</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Record Expr</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseRecordExpr(RecordExpr object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch, but this is the last case anyway.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject)
   * @generated
   */
  @Override
  public T defaultCase(EObject object)
  {
    return null;
  }

} //JkindSwitch
