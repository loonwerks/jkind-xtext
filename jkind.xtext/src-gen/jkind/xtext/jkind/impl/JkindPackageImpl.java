/**
 */
package jkind.xtext.jkind.impl;

import jkind.xtext.jkind.AbbreviationType;
import jkind.xtext.jkind.ArrayAccessExpr;
import jkind.xtext.jkind.ArrayExpr;
import jkind.xtext.jkind.ArrayType;
import jkind.xtext.jkind.ArrayUpdateExpr;
import jkind.xtext.jkind.Assertion;
import jkind.xtext.jkind.BinaryExpr;
import jkind.xtext.jkind.BoolExpr;
import jkind.xtext.jkind.BoolType;
import jkind.xtext.jkind.CastExpr;
import jkind.xtext.jkind.CondactExpr;
import jkind.xtext.jkind.Constant;
import jkind.xtext.jkind.EnumType;
import jkind.xtext.jkind.EnumValue;
import jkind.xtext.jkind.Equation;
import jkind.xtext.jkind.Expr;
import jkind.xtext.jkind.Field;
import jkind.xtext.jkind.File;
import jkind.xtext.jkind.IdExpr;
import jkind.xtext.jkind.IdRef;
import jkind.xtext.jkind.IfThenElseExpr;
import jkind.xtext.jkind.IntExpr;
import jkind.xtext.jkind.IntType;
import jkind.xtext.jkind.JkindFactory;
import jkind.xtext.jkind.JkindPackage;
import jkind.xtext.jkind.Node;
import jkind.xtext.jkind.NodeCallExpr;
import jkind.xtext.jkind.Property;
import jkind.xtext.jkind.RealExpr;
import jkind.xtext.jkind.RealType;
import jkind.xtext.jkind.RealizabilityInputs;
import jkind.xtext.jkind.RecordAccessExpr;
import jkind.xtext.jkind.RecordExpr;
import jkind.xtext.jkind.RecordType;
import jkind.xtext.jkind.RecordUpdateExpr;
import jkind.xtext.jkind.SubrangeType;
import jkind.xtext.jkind.Support;
import jkind.xtext.jkind.TupleExpr;
import jkind.xtext.jkind.Type;
import jkind.xtext.jkind.TypeDef;
import jkind.xtext.jkind.UnaryExpr;
import jkind.xtext.jkind.UserType;
import jkind.xtext.jkind.Variable;
import jkind.xtext.jkind.VariableGroup;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class JkindPackageImpl extends EPackageImpl implements JkindPackage
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass fileEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass typeDefEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass enumValueEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass typeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass fieldEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass constantEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass nodeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass variableGroupEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass variableEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass equationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass propertyEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass supportEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass realizabilityInputsEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass assertionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass exprEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass nodeCallExprEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass idRefEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass abbreviationTypeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass recordTypeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass enumTypeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass arrayTypeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass intTypeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass boolTypeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass realTypeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass subrangeTypeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass userTypeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass binaryExprEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass unaryExprEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass recordAccessExprEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass recordUpdateExprEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass arrayAccessExprEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass arrayUpdateExprEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass idExprEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass intExprEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass realExprEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass boolExprEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass ifThenElseExprEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass castExprEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass condactExprEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass arrayExprEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass recordExprEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass tupleExprEClass = null;

  /**
   * Creates an instance of the model <b>Package</b>, registered with
   * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
   * package URI value.
   * <p>Note: the correct way to create the package is via the static
   * factory method {@link #init init()}, which also performs
   * initialization of the package, or returns the registered package,
   * if one already exists.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.emf.ecore.EPackage.Registry
   * @see jkind.xtext.jkind.JkindPackage#eNS_URI
   * @see #init()
   * @generated
   */
  private JkindPackageImpl()
  {
    super(eNS_URI, JkindFactory.eINSTANCE);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static boolean isInited = false;

  /**
   * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
   * 
   * <p>This method is used to initialize {@link JkindPackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static JkindPackage init()
  {
    if (isInited) return (JkindPackage)EPackage.Registry.INSTANCE.getEPackage(JkindPackage.eNS_URI);

    // Obtain or create and register package
    JkindPackageImpl theJkindPackage = (JkindPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof JkindPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new JkindPackageImpl());

    isInited = true;

    // Create package meta-data objects
    theJkindPackage.createPackageContents();

    // Initialize created meta-data
    theJkindPackage.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    theJkindPackage.freeze();

  
    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(JkindPackage.eNS_URI, theJkindPackage);
    return theJkindPackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getFile()
  {
    return fileEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getFile_Typedefs()
  {
    return (EReference)fileEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getFile_Constants()
  {
    return (EReference)fileEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getFile_Nodes()
  {
    return (EReference)fileEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getTypeDef()
  {
    return typeDefEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getTypeDef_Name()
  {
    return (EAttribute)typeDefEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getEnumValue()
  {
    return enumValueEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getType()
  {
    return typeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getField()
  {
    return fieldEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getField_Name()
  {
    return (EAttribute)fieldEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getConstant()
  {
    return constantEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getConstant_Type()
  {
    return (EReference)constantEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getConstant_Expr()
  {
    return (EReference)constantEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getNode()
  {
    return nodeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getNode_Name()
  {
    return (EAttribute)nodeEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getNode_Inputs()
  {
    return (EReference)nodeEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getNode_Outputs()
  {
    return (EReference)nodeEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getNode_Locals()
  {
    return (EReference)nodeEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getNode_Equations()
  {
    return (EReference)nodeEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getNode_Assertions()
  {
    return (EReference)nodeEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getNode_Properties()
  {
    return (EReference)nodeEClass.getEStructuralFeatures().get(6);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getNode_Main()
  {
    return (EAttribute)nodeEClass.getEStructuralFeatures().get(7);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getNode_Support()
  {
    return (EReference)nodeEClass.getEStructuralFeatures().get(8);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getNode_RealizabilityInputs()
  {
    return (EReference)nodeEClass.getEStructuralFeatures().get(9);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getVariableGroup()
  {
    return variableGroupEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getVariableGroup_Variables()
  {
    return (EReference)variableGroupEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getVariableGroup_Type()
  {
    return (EReference)variableGroupEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getVariable()
  {
    return variableEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getEquation()
  {
    return equationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getEquation_Lhs()
  {
    return (EReference)equationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getEquation_Rhs()
  {
    return (EReference)equationEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getProperty()
  {
    return propertyEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getProperty_Ref()
  {
    return (EReference)propertyEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSupport()
  {
    return supportEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSupport_Ids()
  {
    return (EReference)supportEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getRealizabilityInputs()
  {
    return realizabilityInputsEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getRealizabilityInputs_Ids()
  {
    return (EReference)realizabilityInputsEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAssertion()
  {
    return assertionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAssertion_Expr()
  {
    return (EReference)assertionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getExpr()
  {
    return exprEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getNodeCallExpr()
  {
    return nodeCallExprEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getNodeCallExpr_Node()
  {
    return (EReference)nodeCallExprEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getNodeCallExpr_Args()
  {
    return (EReference)nodeCallExprEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getIdRef()
  {
    return idRefEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getIdRef_Name()
  {
    return (EAttribute)idRefEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAbbreviationType()
  {
    return abbreviationTypeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAbbreviationType_Type()
  {
    return (EReference)abbreviationTypeEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getRecordType()
  {
    return recordTypeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getRecordType_Fields()
  {
    return (EReference)recordTypeEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getRecordType_Types()
  {
    return (EReference)recordTypeEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getEnumType()
  {
    return enumTypeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getEnumType_Values()
  {
    return (EReference)enumTypeEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getArrayType()
  {
    return arrayTypeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getArrayType_Base()
  {
    return (EReference)arrayTypeEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getArrayType_Size()
  {
    return (EAttribute)arrayTypeEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getIntType()
  {
    return intTypeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getBoolType()
  {
    return boolTypeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getRealType()
  {
    return realTypeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSubrangeType()
  {
    return subrangeTypeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSubrangeType_Low()
  {
    return (EAttribute)subrangeTypeEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSubrangeType_High()
  {
    return (EAttribute)subrangeTypeEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getUserType()
  {
    return userTypeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getUserType_Def()
  {
    return (EReference)userTypeEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getBinaryExpr()
  {
    return binaryExprEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBinaryExpr_Left()
  {
    return (EReference)binaryExprEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getBinaryExpr_Op()
  {
    return (EAttribute)binaryExprEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBinaryExpr_Right()
  {
    return (EReference)binaryExprEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getUnaryExpr()
  {
    return unaryExprEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getUnaryExpr_Op()
  {
    return (EAttribute)unaryExprEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getUnaryExpr_Expr()
  {
    return (EReference)unaryExprEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getRecordAccessExpr()
  {
    return recordAccessExprEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getRecordAccessExpr_Record()
  {
    return (EReference)recordAccessExprEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getRecordAccessExpr_Field()
  {
    return (EReference)recordAccessExprEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getRecordUpdateExpr()
  {
    return recordUpdateExprEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getRecordUpdateExpr_Record()
  {
    return (EReference)recordUpdateExprEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getRecordUpdateExpr_Field()
  {
    return (EReference)recordUpdateExprEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getRecordUpdateExpr_Value()
  {
    return (EReference)recordUpdateExprEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getArrayAccessExpr()
  {
    return arrayAccessExprEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getArrayAccessExpr_Array()
  {
    return (EReference)arrayAccessExprEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getArrayAccessExpr_Index()
  {
    return (EReference)arrayAccessExprEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getArrayUpdateExpr()
  {
    return arrayUpdateExprEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getArrayUpdateExpr_Access()
  {
    return (EReference)arrayUpdateExprEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getArrayUpdateExpr_Value()
  {
    return (EReference)arrayUpdateExprEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getIdExpr()
  {
    return idExprEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getIdExpr_Id()
  {
    return (EReference)idExprEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getIntExpr()
  {
    return intExprEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getIntExpr_Val()
  {
    return (EAttribute)intExprEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getRealExpr()
  {
    return realExprEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getRealExpr_Val()
  {
    return (EAttribute)realExprEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getBoolExpr()
  {
    return boolExprEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getBoolExpr_Val()
  {
    return (EAttribute)boolExprEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getIfThenElseExpr()
  {
    return ifThenElseExprEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getIfThenElseExpr_Cond()
  {
    return (EReference)ifThenElseExprEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getIfThenElseExpr_Then()
  {
    return (EReference)ifThenElseExprEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getIfThenElseExpr_Else()
  {
    return (EReference)ifThenElseExprEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getCastExpr()
  {
    return castExprEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getCastExpr_Op()
  {
    return (EAttribute)castExprEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getCastExpr_Expr()
  {
    return (EReference)castExprEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getCondactExpr()
  {
    return condactExprEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getCondactExpr_Clock()
  {
    return (EReference)condactExprEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getCondactExpr_Call()
  {
    return (EReference)condactExprEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getCondactExpr_Args()
  {
    return (EReference)condactExprEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getArrayExpr()
  {
    return arrayExprEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getArrayExpr_Exprs()
  {
    return (EReference)arrayExprEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getRecordExpr()
  {
    return recordExprEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getRecordExpr_Type()
  {
    return (EReference)recordExprEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getRecordExpr_Fields()
  {
    return (EReference)recordExprEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getRecordExpr_Exprs()
  {
    return (EReference)recordExprEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getTupleExpr()
  {
    return tupleExprEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTupleExpr_Exprs()
  {
    return (EReference)tupleExprEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public JkindFactory getJkindFactory()
  {
    return (JkindFactory)getEFactoryInstance();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isCreated = false;

  /**
   * Creates the meta-model objects for the package.  This method is
   * guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void createPackageContents()
  {
    if (isCreated) return;
    isCreated = true;

    // Create classes and their features
    fileEClass = createEClass(FILE);
    createEReference(fileEClass, FILE__TYPEDEFS);
    createEReference(fileEClass, FILE__CONSTANTS);
    createEReference(fileEClass, FILE__NODES);

    typeDefEClass = createEClass(TYPE_DEF);
    createEAttribute(typeDefEClass, TYPE_DEF__NAME);

    enumValueEClass = createEClass(ENUM_VALUE);

    typeEClass = createEClass(TYPE);

    fieldEClass = createEClass(FIELD);
    createEAttribute(fieldEClass, FIELD__NAME);

    constantEClass = createEClass(CONSTANT);
    createEReference(constantEClass, CONSTANT__TYPE);
    createEReference(constantEClass, CONSTANT__EXPR);

    nodeEClass = createEClass(NODE);
    createEAttribute(nodeEClass, NODE__NAME);
    createEReference(nodeEClass, NODE__INPUTS);
    createEReference(nodeEClass, NODE__OUTPUTS);
    createEReference(nodeEClass, NODE__LOCALS);
    createEReference(nodeEClass, NODE__EQUATIONS);
    createEReference(nodeEClass, NODE__ASSERTIONS);
    createEReference(nodeEClass, NODE__PROPERTIES);
    createEAttribute(nodeEClass, NODE__MAIN);
    createEReference(nodeEClass, NODE__SUPPORT);
    createEReference(nodeEClass, NODE__REALIZABILITY_INPUTS);

    variableGroupEClass = createEClass(VARIABLE_GROUP);
    createEReference(variableGroupEClass, VARIABLE_GROUP__VARIABLES);
    createEReference(variableGroupEClass, VARIABLE_GROUP__TYPE);

    variableEClass = createEClass(VARIABLE);

    equationEClass = createEClass(EQUATION);
    createEReference(equationEClass, EQUATION__LHS);
    createEReference(equationEClass, EQUATION__RHS);

    propertyEClass = createEClass(PROPERTY);
    createEReference(propertyEClass, PROPERTY__REF);

    supportEClass = createEClass(SUPPORT);
    createEReference(supportEClass, SUPPORT__IDS);

    realizabilityInputsEClass = createEClass(REALIZABILITY_INPUTS);
    createEReference(realizabilityInputsEClass, REALIZABILITY_INPUTS__IDS);

    assertionEClass = createEClass(ASSERTION);
    createEReference(assertionEClass, ASSERTION__EXPR);

    exprEClass = createEClass(EXPR);

    nodeCallExprEClass = createEClass(NODE_CALL_EXPR);
    createEReference(nodeCallExprEClass, NODE_CALL_EXPR__NODE);
    createEReference(nodeCallExprEClass, NODE_CALL_EXPR__ARGS);

    idRefEClass = createEClass(ID_REF);
    createEAttribute(idRefEClass, ID_REF__NAME);

    abbreviationTypeEClass = createEClass(ABBREVIATION_TYPE);
    createEReference(abbreviationTypeEClass, ABBREVIATION_TYPE__TYPE);

    recordTypeEClass = createEClass(RECORD_TYPE);
    createEReference(recordTypeEClass, RECORD_TYPE__FIELDS);
    createEReference(recordTypeEClass, RECORD_TYPE__TYPES);

    enumTypeEClass = createEClass(ENUM_TYPE);
    createEReference(enumTypeEClass, ENUM_TYPE__VALUES);

    arrayTypeEClass = createEClass(ARRAY_TYPE);
    createEReference(arrayTypeEClass, ARRAY_TYPE__BASE);
    createEAttribute(arrayTypeEClass, ARRAY_TYPE__SIZE);

    intTypeEClass = createEClass(INT_TYPE);

    boolTypeEClass = createEClass(BOOL_TYPE);

    realTypeEClass = createEClass(REAL_TYPE);

    subrangeTypeEClass = createEClass(SUBRANGE_TYPE);
    createEAttribute(subrangeTypeEClass, SUBRANGE_TYPE__LOW);
    createEAttribute(subrangeTypeEClass, SUBRANGE_TYPE__HIGH);

    userTypeEClass = createEClass(USER_TYPE);
    createEReference(userTypeEClass, USER_TYPE__DEF);

    binaryExprEClass = createEClass(BINARY_EXPR);
    createEReference(binaryExprEClass, BINARY_EXPR__LEFT);
    createEAttribute(binaryExprEClass, BINARY_EXPR__OP);
    createEReference(binaryExprEClass, BINARY_EXPR__RIGHT);

    unaryExprEClass = createEClass(UNARY_EXPR);
    createEAttribute(unaryExprEClass, UNARY_EXPR__OP);
    createEReference(unaryExprEClass, UNARY_EXPR__EXPR);

    recordAccessExprEClass = createEClass(RECORD_ACCESS_EXPR);
    createEReference(recordAccessExprEClass, RECORD_ACCESS_EXPR__RECORD);
    createEReference(recordAccessExprEClass, RECORD_ACCESS_EXPR__FIELD);

    recordUpdateExprEClass = createEClass(RECORD_UPDATE_EXPR);
    createEReference(recordUpdateExprEClass, RECORD_UPDATE_EXPR__RECORD);
    createEReference(recordUpdateExprEClass, RECORD_UPDATE_EXPR__FIELD);
    createEReference(recordUpdateExprEClass, RECORD_UPDATE_EXPR__VALUE);

    arrayAccessExprEClass = createEClass(ARRAY_ACCESS_EXPR);
    createEReference(arrayAccessExprEClass, ARRAY_ACCESS_EXPR__ARRAY);
    createEReference(arrayAccessExprEClass, ARRAY_ACCESS_EXPR__INDEX);

    arrayUpdateExprEClass = createEClass(ARRAY_UPDATE_EXPR);
    createEReference(arrayUpdateExprEClass, ARRAY_UPDATE_EXPR__ACCESS);
    createEReference(arrayUpdateExprEClass, ARRAY_UPDATE_EXPR__VALUE);

    idExprEClass = createEClass(ID_EXPR);
    createEReference(idExprEClass, ID_EXPR__ID);

    intExprEClass = createEClass(INT_EXPR);
    createEAttribute(intExprEClass, INT_EXPR__VAL);

    realExprEClass = createEClass(REAL_EXPR);
    createEAttribute(realExprEClass, REAL_EXPR__VAL);

    boolExprEClass = createEClass(BOOL_EXPR);
    createEAttribute(boolExprEClass, BOOL_EXPR__VAL);

    ifThenElseExprEClass = createEClass(IF_THEN_ELSE_EXPR);
    createEReference(ifThenElseExprEClass, IF_THEN_ELSE_EXPR__COND);
    createEReference(ifThenElseExprEClass, IF_THEN_ELSE_EXPR__THEN);
    createEReference(ifThenElseExprEClass, IF_THEN_ELSE_EXPR__ELSE);

    castExprEClass = createEClass(CAST_EXPR);
    createEAttribute(castExprEClass, CAST_EXPR__OP);
    createEReference(castExprEClass, CAST_EXPR__EXPR);

    condactExprEClass = createEClass(CONDACT_EXPR);
    createEReference(condactExprEClass, CONDACT_EXPR__CLOCK);
    createEReference(condactExprEClass, CONDACT_EXPR__CALL);
    createEReference(condactExprEClass, CONDACT_EXPR__ARGS);

    arrayExprEClass = createEClass(ARRAY_EXPR);
    createEReference(arrayExprEClass, ARRAY_EXPR__EXPRS);

    recordExprEClass = createEClass(RECORD_EXPR);
    createEReference(recordExprEClass, RECORD_EXPR__TYPE);
    createEReference(recordExprEClass, RECORD_EXPR__FIELDS);
    createEReference(recordExprEClass, RECORD_EXPR__EXPRS);

    tupleExprEClass = createEClass(TUPLE_EXPR);
    createEReference(tupleExprEClass, TUPLE_EXPR__EXPRS);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isInitialized = false;

  /**
   * Complete the initialization of the package and its meta-model.  This
   * method is guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void initializePackageContents()
  {
    if (isInitialized) return;
    isInitialized = true;

    // Initialize package
    setName(eNAME);
    setNsPrefix(eNS_PREFIX);
    setNsURI(eNS_URI);

    // Create type parameters

    // Set bounds for type parameters

    // Add supertypes to classes
    enumValueEClass.getESuperTypes().add(this.getIdRef());
    constantEClass.getESuperTypes().add(this.getIdRef());
    variableEClass.getESuperTypes().add(this.getIdRef());
    nodeCallExprEClass.getESuperTypes().add(this.getExpr());
    abbreviationTypeEClass.getESuperTypes().add(this.getTypeDef());
    recordTypeEClass.getESuperTypes().add(this.getTypeDef());
    enumTypeEClass.getESuperTypes().add(this.getTypeDef());
    arrayTypeEClass.getESuperTypes().add(this.getType());
    intTypeEClass.getESuperTypes().add(this.getType());
    boolTypeEClass.getESuperTypes().add(this.getType());
    realTypeEClass.getESuperTypes().add(this.getType());
    subrangeTypeEClass.getESuperTypes().add(this.getType());
    userTypeEClass.getESuperTypes().add(this.getType());
    binaryExprEClass.getESuperTypes().add(this.getExpr());
    unaryExprEClass.getESuperTypes().add(this.getExpr());
    recordAccessExprEClass.getESuperTypes().add(this.getExpr());
    recordUpdateExprEClass.getESuperTypes().add(this.getExpr());
    arrayAccessExprEClass.getESuperTypes().add(this.getExpr());
    arrayUpdateExprEClass.getESuperTypes().add(this.getExpr());
    idExprEClass.getESuperTypes().add(this.getExpr());
    intExprEClass.getESuperTypes().add(this.getExpr());
    realExprEClass.getESuperTypes().add(this.getExpr());
    boolExprEClass.getESuperTypes().add(this.getExpr());
    ifThenElseExprEClass.getESuperTypes().add(this.getExpr());
    castExprEClass.getESuperTypes().add(this.getExpr());
    condactExprEClass.getESuperTypes().add(this.getExpr());
    arrayExprEClass.getESuperTypes().add(this.getExpr());
    recordExprEClass.getESuperTypes().add(this.getExpr());
    tupleExprEClass.getESuperTypes().add(this.getExpr());

    // Initialize classes and features; add operations and parameters
    initEClass(fileEClass, File.class, "File", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getFile_Typedefs(), this.getTypeDef(), null, "typedefs", null, 0, -1, File.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getFile_Constants(), this.getConstant(), null, "constants", null, 0, -1, File.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getFile_Nodes(), this.getNode(), null, "nodes", null, 0, -1, File.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(typeDefEClass, TypeDef.class, "TypeDef", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getTypeDef_Name(), ecorePackage.getEString(), "name", null, 0, 1, TypeDef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(enumValueEClass, EnumValue.class, "EnumValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(typeEClass, Type.class, "Type", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(fieldEClass, Field.class, "Field", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getField_Name(), ecorePackage.getEString(), "name", null, 0, 1, Field.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(constantEClass, Constant.class, "Constant", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getConstant_Type(), this.getType(), null, "type", null, 0, 1, Constant.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getConstant_Expr(), this.getExpr(), null, "expr", null, 0, 1, Constant.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(nodeEClass, Node.class, "Node", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getNode_Name(), ecorePackage.getEString(), "name", null, 0, 1, Node.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getNode_Inputs(), this.getVariableGroup(), null, "inputs", null, 0, -1, Node.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getNode_Outputs(), this.getVariableGroup(), null, "outputs", null, 0, -1, Node.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getNode_Locals(), this.getVariableGroup(), null, "locals", null, 0, -1, Node.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getNode_Equations(), this.getEquation(), null, "equations", null, 0, -1, Node.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getNode_Assertions(), this.getAssertion(), null, "assertions", null, 0, -1, Node.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getNode_Properties(), this.getProperty(), null, "properties", null, 0, -1, Node.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getNode_Main(), ecorePackage.getEString(), "main", null, 0, -1, Node.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getNode_Support(), this.getSupport(), null, "support", null, 0, -1, Node.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getNode_RealizabilityInputs(), this.getRealizabilityInputs(), null, "realizabilityInputs", null, 0, -1, Node.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(variableGroupEClass, VariableGroup.class, "VariableGroup", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getVariableGroup_Variables(), this.getVariable(), null, "variables", null, 0, -1, VariableGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getVariableGroup_Type(), this.getType(), null, "type", null, 0, 1, VariableGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(variableEClass, Variable.class, "Variable", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(equationEClass, Equation.class, "Equation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getEquation_Lhs(), this.getVariable(), null, "lhs", null, 0, -1, Equation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getEquation_Rhs(), this.getExpr(), null, "rhs", null, 0, 1, Equation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(propertyEClass, Property.class, "Property", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getProperty_Ref(), this.getVariable(), null, "ref", null, 0, 1, Property.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(supportEClass, Support.class, "Support", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getSupport_Ids(), this.getVariable(), null, "ids", null, 0, -1, Support.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(realizabilityInputsEClass, RealizabilityInputs.class, "RealizabilityInputs", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getRealizabilityInputs_Ids(), this.getVariable(), null, "ids", null, 0, -1, RealizabilityInputs.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(assertionEClass, Assertion.class, "Assertion", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getAssertion_Expr(), this.getExpr(), null, "expr", null, 0, 1, Assertion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(exprEClass, Expr.class, "Expr", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(nodeCallExprEClass, NodeCallExpr.class, "NodeCallExpr", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getNodeCallExpr_Node(), this.getNode(), null, "node", null, 0, 1, NodeCallExpr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getNodeCallExpr_Args(), this.getExpr(), null, "args", null, 0, -1, NodeCallExpr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(idRefEClass, IdRef.class, "IdRef", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getIdRef_Name(), ecorePackage.getEString(), "name", null, 0, 1, IdRef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(abbreviationTypeEClass, AbbreviationType.class, "AbbreviationType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getAbbreviationType_Type(), this.getType(), null, "type", null, 0, 1, AbbreviationType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(recordTypeEClass, RecordType.class, "RecordType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getRecordType_Fields(), this.getField(), null, "fields", null, 0, -1, RecordType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getRecordType_Types(), this.getType(), null, "types", null, 0, -1, RecordType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(enumTypeEClass, EnumType.class, "EnumType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getEnumType_Values(), this.getEnumValue(), null, "values", null, 0, -1, EnumType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(arrayTypeEClass, ArrayType.class, "ArrayType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getArrayType_Base(), this.getType(), null, "base", null, 0, 1, ArrayType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getArrayType_Size(), ecorePackage.getEBigInteger(), "size", null, 0, 1, ArrayType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(intTypeEClass, IntType.class, "IntType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(boolTypeEClass, BoolType.class, "BoolType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(realTypeEClass, RealType.class, "RealType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(subrangeTypeEClass, SubrangeType.class, "SubrangeType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getSubrangeType_Low(), ecorePackage.getEBigInteger(), "low", null, 0, 1, SubrangeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getSubrangeType_High(), ecorePackage.getEBigInteger(), "high", null, 0, 1, SubrangeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(userTypeEClass, UserType.class, "UserType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getUserType_Def(), this.getTypeDef(), null, "def", null, 0, 1, UserType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(binaryExprEClass, BinaryExpr.class, "BinaryExpr", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getBinaryExpr_Left(), this.getExpr(), null, "left", null, 0, 1, BinaryExpr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getBinaryExpr_Op(), ecorePackage.getEString(), "op", null, 0, 1, BinaryExpr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getBinaryExpr_Right(), this.getExpr(), null, "right", null, 0, 1, BinaryExpr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(unaryExprEClass, UnaryExpr.class, "UnaryExpr", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getUnaryExpr_Op(), ecorePackage.getEString(), "op", null, 0, 1, UnaryExpr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getUnaryExpr_Expr(), this.getExpr(), null, "expr", null, 0, 1, UnaryExpr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(recordAccessExprEClass, RecordAccessExpr.class, "RecordAccessExpr", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getRecordAccessExpr_Record(), this.getExpr(), null, "record", null, 0, 1, RecordAccessExpr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getRecordAccessExpr_Field(), this.getField(), null, "field", null, 0, 1, RecordAccessExpr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(recordUpdateExprEClass, RecordUpdateExpr.class, "RecordUpdateExpr", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getRecordUpdateExpr_Record(), this.getExpr(), null, "record", null, 0, 1, RecordUpdateExpr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getRecordUpdateExpr_Field(), this.getField(), null, "field", null, 0, 1, RecordUpdateExpr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getRecordUpdateExpr_Value(), this.getExpr(), null, "value", null, 0, 1, RecordUpdateExpr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(arrayAccessExprEClass, ArrayAccessExpr.class, "ArrayAccessExpr", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getArrayAccessExpr_Array(), this.getExpr(), null, "array", null, 0, 1, ArrayAccessExpr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getArrayAccessExpr_Index(), this.getExpr(), null, "index", null, 0, 1, ArrayAccessExpr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(arrayUpdateExprEClass, ArrayUpdateExpr.class, "ArrayUpdateExpr", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getArrayUpdateExpr_Access(), this.getArrayAccessExpr(), null, "access", null, 0, 1, ArrayUpdateExpr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getArrayUpdateExpr_Value(), this.getExpr(), null, "value", null, 0, 1, ArrayUpdateExpr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(idExprEClass, IdExpr.class, "IdExpr", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getIdExpr_Id(), this.getIdRef(), null, "id", null, 0, 1, IdExpr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(intExprEClass, IntExpr.class, "IntExpr", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getIntExpr_Val(), ecorePackage.getEBigInteger(), "val", null, 0, 1, IntExpr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(realExprEClass, RealExpr.class, "RealExpr", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getRealExpr_Val(), ecorePackage.getEString(), "val", null, 0, 1, RealExpr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(boolExprEClass, BoolExpr.class, "BoolExpr", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getBoolExpr_Val(), ecorePackage.getEString(), "val", null, 0, 1, BoolExpr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(ifThenElseExprEClass, IfThenElseExpr.class, "IfThenElseExpr", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getIfThenElseExpr_Cond(), this.getExpr(), null, "cond", null, 0, 1, IfThenElseExpr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getIfThenElseExpr_Then(), this.getExpr(), null, "then", null, 0, 1, IfThenElseExpr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getIfThenElseExpr_Else(), this.getExpr(), null, "else", null, 0, 1, IfThenElseExpr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(castExprEClass, CastExpr.class, "CastExpr", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getCastExpr_Op(), ecorePackage.getEString(), "op", null, 0, 1, CastExpr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getCastExpr_Expr(), this.getExpr(), null, "expr", null, 0, 1, CastExpr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(condactExprEClass, CondactExpr.class, "CondactExpr", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getCondactExpr_Clock(), this.getExpr(), null, "clock", null, 0, 1, CondactExpr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getCondactExpr_Call(), this.getNodeCallExpr(), null, "call", null, 0, 1, CondactExpr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getCondactExpr_Args(), this.getExpr(), null, "args", null, 0, -1, CondactExpr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(arrayExprEClass, ArrayExpr.class, "ArrayExpr", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getArrayExpr_Exprs(), this.getExpr(), null, "exprs", null, 0, -1, ArrayExpr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(recordExprEClass, RecordExpr.class, "RecordExpr", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getRecordExpr_Type(), this.getRecordType(), null, "type", null, 0, 1, RecordExpr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getRecordExpr_Fields(), this.getField(), null, "fields", null, 0, -1, RecordExpr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getRecordExpr_Exprs(), this.getExpr(), null, "exprs", null, 0, -1, RecordExpr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(tupleExprEClass, TupleExpr.class, "TupleExpr", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getTupleExpr_Exprs(), this.getExpr(), null, "exprs", null, 0, -1, TupleExpr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    // Create resource
    createResource(eNS_URI);
  }

} //JkindPackageImpl
