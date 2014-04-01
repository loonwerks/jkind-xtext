/**
 */
package jkind.xtext.jkind.impl;

import jkind.xtext.jkind.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class JkindFactoryImpl extends EFactoryImpl implements JkindFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static JkindFactory init()
  {
    try
    {
      JkindFactory theJkindFactory = (JkindFactory)EPackage.Registry.INSTANCE.getEFactory(JkindPackage.eNS_URI);
      if (theJkindFactory != null)
      {
        return theJkindFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new JkindFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public JkindFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case JkindPackage.FILE: return createFile();
      case JkindPackage.TYPEDEF: return createTypedef();
      case JkindPackage.TYPE: return createType();
      case JkindPackage.FIELD: return createField();
      case JkindPackage.CONSTANT: return createConstant();
      case JkindPackage.NODE: return createNode();
      case JkindPackage.VARIABLE_GROUP: return createVariableGroup();
      case JkindPackage.VARIABLE: return createVariable();
      case JkindPackage.EQUATION: return createEquation();
      case JkindPackage.PROPERTY: return createProperty();
      case JkindPackage.ASSERTION: return createAssertion();
      case JkindPackage.EXPR: return createExpr();
      case JkindPackage.NODE_CALL_EXPR: return createNodeCallExpr();
      case JkindPackage.ID_REF: return createIdRef();
      case JkindPackage.ABBREVIATION_TYPE: return createAbbreviationType();
      case JkindPackage.RECORD_TYPE: return createRecordType();
      case JkindPackage.ARRAY_TYPE: return createArrayType();
      case JkindPackage.INT_TYPE: return createIntType();
      case JkindPackage.BOOL_TYPE: return createBoolType();
      case JkindPackage.REAL_TYPE: return createRealType();
      case JkindPackage.SUBRANGE_TYPE: return createSubrangeType();
      case JkindPackage.USER_TYPE: return createUserType();
      case JkindPackage.BINARY_EXPR: return createBinaryExpr();
      case JkindPackage.UNARY_EXPR: return createUnaryExpr();
      case JkindPackage.RECORD_ACCESS_EXPR: return createRecordAccessExpr();
      case JkindPackage.ARRAY_ACCESS_EXPR: return createArrayAccessExpr();
      case JkindPackage.ARRAY_UPDATE_EXPR: return createArrayUpdateExpr();
      case JkindPackage.ID_EXPR: return createIdExpr();
      case JkindPackage.INT_EXPR: return createIntExpr();
      case JkindPackage.REAL_EXPR: return createRealExpr();
      case JkindPackage.BOOL_EXPR: return createBoolExpr();
      case JkindPackage.IF_THEN_ELSE_EXPR: return createIfThenElseExpr();
      case JkindPackage.CAST_EXPR: return createCastExpr();
      case JkindPackage.CONDACT_EXPR: return createCondactExpr();
      case JkindPackage.ARRAY_EXPR: return createArrayExpr();
      case JkindPackage.RECORD_EXPR: return createRecordExpr();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public File createFile()
  {
    FileImpl file = new FileImpl();
    return file;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Typedef createTypedef()
  {
    TypedefImpl typedef = new TypedefImpl();
    return typedef;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Type createType()
  {
    TypeImpl type = new TypeImpl();
    return type;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Field createField()
  {
    FieldImpl field = new FieldImpl();
    return field;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Constant createConstant()
  {
    ConstantImpl constant = new ConstantImpl();
    return constant;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Node createNode()
  {
    NodeImpl node = new NodeImpl();
    return node;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public VariableGroup createVariableGroup()
  {
    VariableGroupImpl variableGroup = new VariableGroupImpl();
    return variableGroup;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Variable createVariable()
  {
    VariableImpl variable = new VariableImpl();
    return variable;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Equation createEquation()
  {
    EquationImpl equation = new EquationImpl();
    return equation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Property createProperty()
  {
    PropertyImpl property = new PropertyImpl();
    return property;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Assertion createAssertion()
  {
    AssertionImpl assertion = new AssertionImpl();
    return assertion;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Expr createExpr()
  {
    ExprImpl expr = new ExprImpl();
    return expr;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NodeCallExpr createNodeCallExpr()
  {
    NodeCallExprImpl nodeCallExpr = new NodeCallExprImpl();
    return nodeCallExpr;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public IdRef createIdRef()
  {
    IdRefImpl idRef = new IdRefImpl();
    return idRef;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AbbreviationType createAbbreviationType()
  {
    AbbreviationTypeImpl abbreviationType = new AbbreviationTypeImpl();
    return abbreviationType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RecordType createRecordType()
  {
    RecordTypeImpl recordType = new RecordTypeImpl();
    return recordType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ArrayType createArrayType()
  {
    ArrayTypeImpl arrayType = new ArrayTypeImpl();
    return arrayType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public IntType createIntType()
  {
    IntTypeImpl intType = new IntTypeImpl();
    return intType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BoolType createBoolType()
  {
    BoolTypeImpl boolType = new BoolTypeImpl();
    return boolType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RealType createRealType()
  {
    RealTypeImpl realType = new RealTypeImpl();
    return realType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SubrangeType createSubrangeType()
  {
    SubrangeTypeImpl subrangeType = new SubrangeTypeImpl();
    return subrangeType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public UserType createUserType()
  {
    UserTypeImpl userType = new UserTypeImpl();
    return userType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BinaryExpr createBinaryExpr()
  {
    BinaryExprImpl binaryExpr = new BinaryExprImpl();
    return binaryExpr;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public UnaryExpr createUnaryExpr()
  {
    UnaryExprImpl unaryExpr = new UnaryExprImpl();
    return unaryExpr;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RecordAccessExpr createRecordAccessExpr()
  {
    RecordAccessExprImpl recordAccessExpr = new RecordAccessExprImpl();
    return recordAccessExpr;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ArrayAccessExpr createArrayAccessExpr()
  {
    ArrayAccessExprImpl arrayAccessExpr = new ArrayAccessExprImpl();
    return arrayAccessExpr;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ArrayUpdateExpr createArrayUpdateExpr()
  {
    ArrayUpdateExprImpl arrayUpdateExpr = new ArrayUpdateExprImpl();
    return arrayUpdateExpr;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public IdExpr createIdExpr()
  {
    IdExprImpl idExpr = new IdExprImpl();
    return idExpr;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public IntExpr createIntExpr()
  {
    IntExprImpl intExpr = new IntExprImpl();
    return intExpr;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RealExpr createRealExpr()
  {
    RealExprImpl realExpr = new RealExprImpl();
    return realExpr;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BoolExpr createBoolExpr()
  {
    BoolExprImpl boolExpr = new BoolExprImpl();
    return boolExpr;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public IfThenElseExpr createIfThenElseExpr()
  {
    IfThenElseExprImpl ifThenElseExpr = new IfThenElseExprImpl();
    return ifThenElseExpr;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CastExpr createCastExpr()
  {
    CastExprImpl castExpr = new CastExprImpl();
    return castExpr;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CondactExpr createCondactExpr()
  {
    CondactExprImpl condactExpr = new CondactExprImpl();
    return condactExpr;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ArrayExpr createArrayExpr()
  {
    ArrayExprImpl arrayExpr = new ArrayExprImpl();
    return arrayExpr;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RecordExpr createRecordExpr()
  {
    RecordExprImpl recordExpr = new RecordExprImpl();
    return recordExpr;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public JkindPackage getJkindPackage()
  {
    return (JkindPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static JkindPackage getPackage()
  {
    return JkindPackage.eINSTANCE;
  }

} //JkindFactoryImpl
