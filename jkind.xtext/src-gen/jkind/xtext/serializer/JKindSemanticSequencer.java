package jkind.xtext.serializer;

import com.google.inject.Inject;
import com.google.inject.Provider;
import jkind.xtext.jkind.Assertion;
import jkind.xtext.jkind.BinaryExpr;
import jkind.xtext.jkind.BoolExpr;
import jkind.xtext.jkind.BoolType;
import jkind.xtext.jkind.Constant;
import jkind.xtext.jkind.Equation;
import jkind.xtext.jkind.File;
import jkind.xtext.jkind.IdExpr;
import jkind.xtext.jkind.IfThenElseExpr;
import jkind.xtext.jkind.IntExpr;
import jkind.xtext.jkind.IntType;
import jkind.xtext.jkind.JkindPackage;
import jkind.xtext.jkind.Node;
import jkind.xtext.jkind.NodeCallExpr;
import jkind.xtext.jkind.Property;
import jkind.xtext.jkind.RealExpr;
import jkind.xtext.jkind.RealType;
import jkind.xtext.jkind.RecordExpr;
import jkind.xtext.jkind.RecordType;
import jkind.xtext.jkind.SubrangeType;
import jkind.xtext.jkind.Typedef;
import jkind.xtext.jkind.UnaryExpr;
import jkind.xtext.jkind.UserType;
import jkind.xtext.jkind.Var;
import jkind.xtext.jkind.VarGroup;
import jkind.xtext.services.JKindGrammarAccess;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.serializer.acceptor.ISemanticSequenceAcceptor;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.diagnostic.ISemanticSequencerDiagnosticProvider;
import org.eclipse.xtext.serializer.diagnostic.ISerializationDiagnostic.Acceptor;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.GenericSequencer;
import org.eclipse.xtext.serializer.sequencer.ISemanticNodeProvider.INodesForEObjectProvider;
import org.eclipse.xtext.serializer.sequencer.ISemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;

@SuppressWarnings("all")
public class JKindSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private JKindGrammarAccess grammarAccess;
	
	public void createSequence(EObject context, EObject semanticObject) {
		if(semanticObject.eClass().getEPackage() == JkindPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case JkindPackage.ASSERTION:
				if(context == grammarAccess.getAssertionRule()) {
					sequence_Assertion(context, (Assertion) semanticObject); 
					return; 
				}
				else break;
			case JkindPackage.BINARY_EXPR:
				if(context == grammarAccess.getAndExprRule() ||
				   context == grammarAccess.getAndExprAccess().getBinaryExprLeftAction_1_0_0() ||
				   context == grammarAccess.getArrowExprRule() ||
				   context == grammarAccess.getArrowExprAccess().getBinaryExprLeftAction_1_0_0() ||
				   context == grammarAccess.getAtomicExprRule() ||
				   context == grammarAccess.getExprRule() ||
				   context == grammarAccess.getImpliesExprRule() ||
				   context == grammarAccess.getImpliesExprAccess().getBinaryExprLeftAction_1_0_0() ||
				   context == grammarAccess.getOrExprRule() ||
				   context == grammarAccess.getOrExprAccess().getBinaryExprLeftAction_1_0_0() ||
				   context == grammarAccess.getPlusExprRule() ||
				   context == grammarAccess.getPlusExprAccess().getBinaryExprLeftAction_1_0_0() ||
				   context == grammarAccess.getPrefixExprRule() ||
				   context == grammarAccess.getRelationalExprRule() ||
				   context == grammarAccess.getRelationalExprAccess().getBinaryExprLeftAction_1_0_0() ||
				   context == grammarAccess.getTimesExprRule() ||
				   context == grammarAccess.getTimesExprAccess().getBinaryExprLeftAction_1_0_0()) {
					sequence_AndExpr_ArrowExpr_ImpliesExpr_OrExpr_PlusExpr_RelationalExpr_TimesExpr(context, (BinaryExpr) semanticObject); 
					return; 
				}
				else break;
			case JkindPackage.BOOL_EXPR:
				if(context == grammarAccess.getAndExprRule() ||
				   context == grammarAccess.getAndExprAccess().getBinaryExprLeftAction_1_0_0() ||
				   context == grammarAccess.getArrowExprRule() ||
				   context == grammarAccess.getArrowExprAccess().getBinaryExprLeftAction_1_0_0() ||
				   context == grammarAccess.getAtomicExprRule() ||
				   context == grammarAccess.getExprRule() ||
				   context == grammarAccess.getImpliesExprRule() ||
				   context == grammarAccess.getImpliesExprAccess().getBinaryExprLeftAction_1_0_0() ||
				   context == grammarAccess.getOrExprRule() ||
				   context == grammarAccess.getOrExprAccess().getBinaryExprLeftAction_1_0_0() ||
				   context == grammarAccess.getPlusExprRule() ||
				   context == grammarAccess.getPlusExprAccess().getBinaryExprLeftAction_1_0_0() ||
				   context == grammarAccess.getPrefixExprRule() ||
				   context == grammarAccess.getRelationalExprRule() ||
				   context == grammarAccess.getRelationalExprAccess().getBinaryExprLeftAction_1_0_0() ||
				   context == grammarAccess.getTimesExprRule() ||
				   context == grammarAccess.getTimesExprAccess().getBinaryExprLeftAction_1_0_0()) {
					sequence_AtomicExpr(context, (BoolExpr) semanticObject); 
					return; 
				}
				else break;
			case JkindPackage.BOOL_TYPE:
				if(context == grammarAccess.getTopLevelTypeRule() ||
				   context == grammarAccess.getTypeRule()) {
					sequence_Type(context, (BoolType) semanticObject); 
					return; 
				}
				else break;
			case JkindPackage.CONSTANT:
				if(context == grammarAccess.getConstantRule() ||
				   context == grammarAccess.getIdRefRule()) {
					sequence_Constant(context, (Constant) semanticObject); 
					return; 
				}
				else break;
			case JkindPackage.EQUATION:
				if(context == grammarAccess.getEquationRule()) {
					sequence_Equation(context, (Equation) semanticObject); 
					return; 
				}
				else break;
			case JkindPackage.FILE:
				if(context == grammarAccess.getFileRule()) {
					sequence_File(context, (File) semanticObject); 
					return; 
				}
				else break;
			case JkindPackage.ID_EXPR:
				if(context == grammarAccess.getAndExprRule() ||
				   context == grammarAccess.getAndExprAccess().getBinaryExprLeftAction_1_0_0() ||
				   context == grammarAccess.getArrowExprRule() ||
				   context == grammarAccess.getArrowExprAccess().getBinaryExprLeftAction_1_0_0() ||
				   context == grammarAccess.getAtomicExprRule() ||
				   context == grammarAccess.getExprRule() ||
				   context == grammarAccess.getImpliesExprRule() ||
				   context == grammarAccess.getImpliesExprAccess().getBinaryExprLeftAction_1_0_0() ||
				   context == grammarAccess.getOrExprRule() ||
				   context == grammarAccess.getOrExprAccess().getBinaryExprLeftAction_1_0_0() ||
				   context == grammarAccess.getPlusExprRule() ||
				   context == grammarAccess.getPlusExprAccess().getBinaryExprLeftAction_1_0_0() ||
				   context == grammarAccess.getPrefixExprRule() ||
				   context == grammarAccess.getRelationalExprRule() ||
				   context == grammarAccess.getRelationalExprAccess().getBinaryExprLeftAction_1_0_0() ||
				   context == grammarAccess.getTimesExprRule() ||
				   context == grammarAccess.getTimesExprAccess().getBinaryExprLeftAction_1_0_0()) {
					sequence_AtomicExpr(context, (IdExpr) semanticObject); 
					return; 
				}
				else break;
			case JkindPackage.IF_THEN_ELSE_EXPR:
				if(context == grammarAccess.getAndExprRule() ||
				   context == grammarAccess.getAndExprAccess().getBinaryExprLeftAction_1_0_0() ||
				   context == grammarAccess.getArrowExprRule() ||
				   context == grammarAccess.getArrowExprAccess().getBinaryExprLeftAction_1_0_0() ||
				   context == grammarAccess.getAtomicExprRule() ||
				   context == grammarAccess.getExprRule() ||
				   context == grammarAccess.getImpliesExprRule() ||
				   context == grammarAccess.getImpliesExprAccess().getBinaryExprLeftAction_1_0_0() ||
				   context == grammarAccess.getOrExprRule() ||
				   context == grammarAccess.getOrExprAccess().getBinaryExprLeftAction_1_0_0() ||
				   context == grammarAccess.getPlusExprRule() ||
				   context == grammarAccess.getPlusExprAccess().getBinaryExprLeftAction_1_0_0() ||
				   context == grammarAccess.getPrefixExprRule() ||
				   context == grammarAccess.getRelationalExprRule() ||
				   context == grammarAccess.getRelationalExprAccess().getBinaryExprLeftAction_1_0_0() ||
				   context == grammarAccess.getTimesExprRule() ||
				   context == grammarAccess.getTimesExprAccess().getBinaryExprLeftAction_1_0_0()) {
					sequence_AtomicExpr(context, (IfThenElseExpr) semanticObject); 
					return; 
				}
				else break;
			case JkindPackage.INT_EXPR:
				if(context == grammarAccess.getAndExprRule() ||
				   context == grammarAccess.getAndExprAccess().getBinaryExprLeftAction_1_0_0() ||
				   context == grammarAccess.getArrowExprRule() ||
				   context == grammarAccess.getArrowExprAccess().getBinaryExprLeftAction_1_0_0() ||
				   context == grammarAccess.getAtomicExprRule() ||
				   context == grammarAccess.getExprRule() ||
				   context == grammarAccess.getImpliesExprRule() ||
				   context == grammarAccess.getImpliesExprAccess().getBinaryExprLeftAction_1_0_0() ||
				   context == grammarAccess.getOrExprRule() ||
				   context == grammarAccess.getOrExprAccess().getBinaryExprLeftAction_1_0_0() ||
				   context == grammarAccess.getPlusExprRule() ||
				   context == grammarAccess.getPlusExprAccess().getBinaryExprLeftAction_1_0_0() ||
				   context == grammarAccess.getPrefixExprRule() ||
				   context == grammarAccess.getRelationalExprRule() ||
				   context == grammarAccess.getRelationalExprAccess().getBinaryExprLeftAction_1_0_0() ||
				   context == grammarAccess.getTimesExprRule() ||
				   context == grammarAccess.getTimesExprAccess().getBinaryExprLeftAction_1_0_0()) {
					sequence_AtomicExpr(context, (IntExpr) semanticObject); 
					return; 
				}
				else break;
			case JkindPackage.INT_TYPE:
				if(context == grammarAccess.getTopLevelTypeRule() ||
				   context == grammarAccess.getTypeRule()) {
					sequence_Type(context, (IntType) semanticObject); 
					return; 
				}
				else break;
			case JkindPackage.NODE:
				if(context == grammarAccess.getNodeRule()) {
					sequence_Node(context, (Node) semanticObject); 
					return; 
				}
				else break;
			case JkindPackage.NODE_CALL_EXPR:
				if(context == grammarAccess.getAndExprRule() ||
				   context == grammarAccess.getAndExprAccess().getBinaryExprLeftAction_1_0_0() ||
				   context == grammarAccess.getArrowExprRule() ||
				   context == grammarAccess.getArrowExprAccess().getBinaryExprLeftAction_1_0_0() ||
				   context == grammarAccess.getAtomicExprRule() ||
				   context == grammarAccess.getExprRule() ||
				   context == grammarAccess.getImpliesExprRule() ||
				   context == grammarAccess.getImpliesExprAccess().getBinaryExprLeftAction_1_0_0() ||
				   context == grammarAccess.getOrExprRule() ||
				   context == grammarAccess.getOrExprAccess().getBinaryExprLeftAction_1_0_0() ||
				   context == grammarAccess.getPlusExprRule() ||
				   context == grammarAccess.getPlusExprAccess().getBinaryExprLeftAction_1_0_0() ||
				   context == grammarAccess.getPrefixExprRule() ||
				   context == grammarAccess.getRelationalExprRule() ||
				   context == grammarAccess.getRelationalExprAccess().getBinaryExprLeftAction_1_0_0() ||
				   context == grammarAccess.getTimesExprRule() ||
				   context == grammarAccess.getTimesExprAccess().getBinaryExprLeftAction_1_0_0()) {
					sequence_AtomicExpr(context, (NodeCallExpr) semanticObject); 
					return; 
				}
				else break;
			case JkindPackage.PROPERTY:
				if(context == grammarAccess.getPropertyRule()) {
					sequence_Property(context, (Property) semanticObject); 
					return; 
				}
				else break;
			case JkindPackage.REAL_EXPR:
				if(context == grammarAccess.getAndExprRule() ||
				   context == grammarAccess.getAndExprAccess().getBinaryExprLeftAction_1_0_0() ||
				   context == grammarAccess.getArrowExprRule() ||
				   context == grammarAccess.getArrowExprAccess().getBinaryExprLeftAction_1_0_0() ||
				   context == grammarAccess.getAtomicExprRule() ||
				   context == grammarAccess.getExprRule() ||
				   context == grammarAccess.getImpliesExprRule() ||
				   context == grammarAccess.getImpliesExprAccess().getBinaryExprLeftAction_1_0_0() ||
				   context == grammarAccess.getOrExprRule() ||
				   context == grammarAccess.getOrExprAccess().getBinaryExprLeftAction_1_0_0() ||
				   context == grammarAccess.getPlusExprRule() ||
				   context == grammarAccess.getPlusExprAccess().getBinaryExprLeftAction_1_0_0() ||
				   context == grammarAccess.getPrefixExprRule() ||
				   context == grammarAccess.getRelationalExprRule() ||
				   context == grammarAccess.getRelationalExprAccess().getBinaryExprLeftAction_1_0_0() ||
				   context == grammarAccess.getTimesExprRule() ||
				   context == grammarAccess.getTimesExprAccess().getBinaryExprLeftAction_1_0_0()) {
					sequence_AtomicExpr(context, (RealExpr) semanticObject); 
					return; 
				}
				else break;
			case JkindPackage.REAL_TYPE:
				if(context == grammarAccess.getTopLevelTypeRule() ||
				   context == grammarAccess.getTypeRule()) {
					sequence_Type(context, (RealType) semanticObject); 
					return; 
				}
				else break;
			case JkindPackage.RECORD_EXPR:
				if(context == grammarAccess.getAndExprRule() ||
				   context == grammarAccess.getAndExprAccess().getBinaryExprLeftAction_1_0_0() ||
				   context == grammarAccess.getArrowExprRule() ||
				   context == grammarAccess.getArrowExprAccess().getBinaryExprLeftAction_1_0_0() ||
				   context == grammarAccess.getAtomicExprRule() ||
				   context == grammarAccess.getExprRule() ||
				   context == grammarAccess.getImpliesExprRule() ||
				   context == grammarAccess.getImpliesExprAccess().getBinaryExprLeftAction_1_0_0() ||
				   context == grammarAccess.getOrExprRule() ||
				   context == grammarAccess.getOrExprAccess().getBinaryExprLeftAction_1_0_0() ||
				   context == grammarAccess.getPlusExprRule() ||
				   context == grammarAccess.getPlusExprAccess().getBinaryExprLeftAction_1_0_0() ||
				   context == grammarAccess.getPrefixExprRule() ||
				   context == grammarAccess.getRelationalExprRule() ||
				   context == grammarAccess.getRelationalExprAccess().getBinaryExprLeftAction_1_0_0() ||
				   context == grammarAccess.getTimesExprRule() ||
				   context == grammarAccess.getTimesExprAccess().getBinaryExprLeftAction_1_0_0()) {
					sequence_AtomicExpr(context, (RecordExpr) semanticObject); 
					return; 
				}
				else break;
			case JkindPackage.RECORD_TYPE:
				if(context == grammarAccess.getTopLevelTypeRule()) {
					sequence_TopLevelType(context, (RecordType) semanticObject); 
					return; 
				}
				else break;
			case JkindPackage.SUBRANGE_TYPE:
				if(context == grammarAccess.getTopLevelTypeRule() ||
				   context == grammarAccess.getTypeRule()) {
					sequence_Type(context, (SubrangeType) semanticObject); 
					return; 
				}
				else break;
			case JkindPackage.TYPEDEF:
				if(context == grammarAccess.getTypedefRule()) {
					sequence_Typedef(context, (Typedef) semanticObject); 
					return; 
				}
				else break;
			case JkindPackage.UNARY_EXPR:
				if(context == grammarAccess.getAndExprRule() ||
				   context == grammarAccess.getAndExprAccess().getBinaryExprLeftAction_1_0_0() ||
				   context == grammarAccess.getArrowExprRule() ||
				   context == grammarAccess.getArrowExprAccess().getBinaryExprLeftAction_1_0_0() ||
				   context == grammarAccess.getAtomicExprRule() ||
				   context == grammarAccess.getExprRule() ||
				   context == grammarAccess.getImpliesExprRule() ||
				   context == grammarAccess.getImpliesExprAccess().getBinaryExprLeftAction_1_0_0() ||
				   context == grammarAccess.getOrExprRule() ||
				   context == grammarAccess.getOrExprAccess().getBinaryExprLeftAction_1_0_0() ||
				   context == grammarAccess.getPlusExprRule() ||
				   context == grammarAccess.getPlusExprAccess().getBinaryExprLeftAction_1_0_0() ||
				   context == grammarAccess.getPrefixExprRule() ||
				   context == grammarAccess.getRelationalExprRule() ||
				   context == grammarAccess.getRelationalExprAccess().getBinaryExprLeftAction_1_0_0() ||
				   context == grammarAccess.getTimesExprRule() ||
				   context == grammarAccess.getTimesExprAccess().getBinaryExprLeftAction_1_0_0()) {
					sequence_PrefixExpr(context, (UnaryExpr) semanticObject); 
					return; 
				}
				else break;
			case JkindPackage.USER_TYPE:
				if(context == grammarAccess.getTopLevelTypeRule() ||
				   context == grammarAccess.getTypeRule()) {
					sequence_Type(context, (UserType) semanticObject); 
					return; 
				}
				else break;
			case JkindPackage.VAR:
				if(context == grammarAccess.getIdRefRule() ||
				   context == grammarAccess.getVarRule()) {
					sequence_Var(context, (Var) semanticObject); 
					return; 
				}
				else break;
			case JkindPackage.VAR_GROUP:
				if(context == grammarAccess.getVarGroupRule()) {
					sequence_VarGroup(context, (VarGroup) semanticObject); 
					return; 
				}
				else break;
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Constraint:
	 *     (
	 *         (left=PlusExpr_BinaryExpr_1_0_0 (op='+' | op='-') right=TimesExpr) | 
	 *         (left=TimesExpr_BinaryExpr_1_0_0 (op='*' | op='/' | op='div') right=PrefixExpr) | 
	 *         (
	 *             left=RelationalExpr_BinaryExpr_1_0_0 
	 *             (
	 *                 op='<' | 
	 *                 op='<=' | 
	 *                 op='>' | 
	 *                 op='>=' | 
	 *                 op='=' | 
	 *                 op='<>'
	 *             ) 
	 *             right=PlusExpr
	 *         ) | 
	 *         (left=AndExpr_BinaryExpr_1_0_0 op='and' right=RelationalExpr) | 
	 *         (left=OrExpr_BinaryExpr_1_0_0 (op='or' | op='xor') right=AndExpr) | 
	 *         (left=ImpliesExpr_BinaryExpr_1_0_0 op='=>' right=ImpliesExpr) | 
	 *         (left=ArrowExpr_BinaryExpr_1_0_0 op='->' right=ArrowExpr)
	 *     )
	 */
	protected void sequence_AndExpr_ArrowExpr_ImpliesExpr_OrExpr_PlusExpr_RelationalExpr_TimesExpr(EObject context, BinaryExpr semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     expr=Expr
	 */
	protected void sequence_Assertion(EObject context, Assertion semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, JkindPackage.Literals.ASSERTION__EXPR) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, JkindPackage.Literals.ASSERTION__EXPR));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getAssertionAccess().getExprExprParserRuleCall_1_0(), semanticObject.getExpr());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     val=BOOL
	 */
	protected void sequence_AtomicExpr(EObject context, BoolExpr semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, JkindPackage.Literals.BOOL_EXPR__VAL) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, JkindPackage.Literals.BOOL_EXPR__VAL));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getAtomicExprAccess().getValBOOLTerminalRuleCall_3_1_0(), semanticObject.getVal());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     id=[IdRef|ID]
	 */
	protected void sequence_AtomicExpr(EObject context, IdExpr semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, JkindPackage.Literals.ID_EXPR__ID) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, JkindPackage.Literals.ID_EXPR__ID));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getAtomicExprAccess().getIdIdRefIDTerminalRuleCall_0_1_0_1(), semanticObject.getId());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (cond=Expr then=Expr else=Expr)
	 */
	protected void sequence_AtomicExpr(EObject context, IfThenElseExpr semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, JkindPackage.Literals.IF_THEN_ELSE_EXPR__COND) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, JkindPackage.Literals.IF_THEN_ELSE_EXPR__COND));
			if(transientValues.isValueTransient(semanticObject, JkindPackage.Literals.IF_THEN_ELSE_EXPR__THEN) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, JkindPackage.Literals.IF_THEN_ELSE_EXPR__THEN));
			if(transientValues.isValueTransient(semanticObject, JkindPackage.Literals.IF_THEN_ELSE_EXPR__ELSE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, JkindPackage.Literals.IF_THEN_ELSE_EXPR__ELSE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getAtomicExprAccess().getCondExprParserRuleCall_4_2_0(), semanticObject.getCond());
		feeder.accept(grammarAccess.getAtomicExprAccess().getThenExprParserRuleCall_4_4_0(), semanticObject.getThen());
		feeder.accept(grammarAccess.getAtomicExprAccess().getElseExprParserRuleCall_4_6_0(), semanticObject.getElse());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     val=INT
	 */
	protected void sequence_AtomicExpr(EObject context, IntExpr semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, JkindPackage.Literals.INT_EXPR__VAL) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, JkindPackage.Literals.INT_EXPR__VAL));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getAtomicExprAccess().getValINTTerminalRuleCall_1_1_0(), semanticObject.getVal());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (node=[Node|ID] (args+=Expr args+=Expr*)?)
	 */
	protected void sequence_AtomicExpr(EObject context, NodeCallExpr semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     val=REAL
	 */
	protected void sequence_AtomicExpr(EObject context, RealExpr semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, JkindPackage.Literals.REAL_EXPR__VAL) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, JkindPackage.Literals.REAL_EXPR__VAL));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getAtomicExprAccess().getValREALParserRuleCall_2_1_0(), semanticObject.getVal());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (id=[Typedef|ID] fields+=ID exprs+=Expr (fields+=ID exprs+=Expr)*)
	 */
	protected void sequence_AtomicExpr(EObject context, RecordExpr semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID type=Type? expr=Expr)
	 */
	protected void sequence_Constant(EObject context, Constant semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (lhs+=[Var|ID] lhs+=[Var|ID]* rhs=Expr)
	 */
	protected void sequence_Equation(EObject context, Equation semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (typedefs+=Typedef | constants+=Constant | nodes+=Node)*
	 */
	protected void sequence_File(EObject context, File semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         name=ID 
	 *         (inputs+=VarGroup inputs+=VarGroup*)? 
	 *         (outputs+=VarGroup outputs+=VarGroup*)? 
	 *         locals+=VarGroup* 
	 *         (equations+=Equation | properties+=Property | assertions+=Assertion | main+=Main)*
	 *     )
	 */
	protected void sequence_Node(EObject context, Node semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     ((op='-' | op='not' | op='pre') expr=PrefixExpr)
	 */
	protected void sequence_PrefixExpr(EObject context, UnaryExpr semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     ref=[Var|ID]
	 */
	protected void sequence_Property(EObject context, Property semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, JkindPackage.Literals.PROPERTY__REF) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, JkindPackage.Literals.PROPERTY__REF));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getPropertyAccess().getRefVarIDTerminalRuleCall_1_0_1(), semanticObject.getRef());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (fields+=ID types+=[Type|ID] (fields+=ID types+=[Type|ID])*)
	 */
	protected void sequence_TopLevelType(EObject context, RecordType semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     {BoolType}
	 */
	protected void sequence_Type(EObject context, BoolType semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     {IntType}
	 */
	protected void sequence_Type(EObject context, IntType semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     {RealType}
	 */
	protected void sequence_Type(EObject context, RealType semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (low=Bound high=Bound)
	 */
	protected void sequence_Type(EObject context, SubrangeType semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, JkindPackage.Literals.SUBRANGE_TYPE__LOW) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, JkindPackage.Literals.SUBRANGE_TYPE__LOW));
			if(transientValues.isValueTransient(semanticObject, JkindPackage.Literals.SUBRANGE_TYPE__HIGH) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, JkindPackage.Literals.SUBRANGE_TYPE__HIGH));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getTypeAccess().getLowBoundParserRuleCall_3_3_0(), semanticObject.getLow());
		feeder.accept(grammarAccess.getTypeAccess().getHighBoundParserRuleCall_3_5_0(), semanticObject.getHigh());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     def=[Typedef|ID]
	 */
	protected void sequence_Type(EObject context, UserType semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, JkindPackage.Literals.USER_TYPE__DEF) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, JkindPackage.Literals.USER_TYPE__DEF));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getTypeAccess().getDefTypedefIDTerminalRuleCall_4_1_0_1(), semanticObject.getDef());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID type=TopLevelType)
	 */
	protected void sequence_Typedef(EObject context, Typedef semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, JkindPackage.Literals.TYPEDEF__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, JkindPackage.Literals.TYPEDEF__NAME));
			if(transientValues.isValueTransient(semanticObject, JkindPackage.Literals.TYPEDEF__TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, JkindPackage.Literals.TYPEDEF__TYPE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getTypedefAccess().getNameIDTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getTypedefAccess().getTypeTopLevelTypeParserRuleCall_3_0(), semanticObject.getType());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (vars+=Var vars+=Var* type=Type)
	 */
	protected void sequence_VarGroup(EObject context, VarGroup semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     name=ID
	 */
	protected void sequence_Var(EObject context, Var semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, JkindPackage.Literals.ID_REF__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, JkindPackage.Literals.ID_REF__NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getVarAccess().getNameIDTerminalRuleCall_0(), semanticObject.getName());
		feeder.finish();
	}
}
