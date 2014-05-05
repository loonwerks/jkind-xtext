package jkind.xtext.serializer;

import com.google.inject.Inject;
import com.google.inject.Provider;
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
import jkind.xtext.jkind.Field;
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
import jkind.xtext.jkind.RecordAccessExpr;
import jkind.xtext.jkind.RecordExpr;
import jkind.xtext.jkind.RecordType;
import jkind.xtext.jkind.RecordUpdateExpr;
import jkind.xtext.jkind.SubrangeType;
import jkind.xtext.jkind.TupleExpr;
import jkind.xtext.jkind.UnaryExpr;
import jkind.xtext.jkind.UserType;
import jkind.xtext.jkind.Variable;
import jkind.xtext.jkind.VariableGroup;
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
			case JkindPackage.ABBREVIATION_TYPE:
				if(context == grammarAccess.getTypeDefRule()) {
					sequence_TypeDef(context, (AbbreviationType) semanticObject); 
					return; 
				}
				else break;
			case JkindPackage.ARRAY_ACCESS_EXPR:
				if(context == grammarAccess.getAccessExprRule() ||
				   context == grammarAccess.getAccessExprAccess().getArrayAccessExprArrayAction_1_2_0_0_0() ||
				   context == grammarAccess.getAccessExprAccess().getArrayUpdateExprAccessAction_1_2_2_0_0_0() ||
				   context == grammarAccess.getAccessExprAccess().getRecordAccessExprRecordAction_1_0_0_0_0() ||
				   context == grammarAccess.getAccessExprAccess().getRecordUpdateExprRecordAction_1_1_0_0_0() ||
				   context == grammarAccess.getAndExprRule() ||
				   context == grammarAccess.getAndExprAccess().getBinaryExprLeftAction_1_0_0_0() ||
				   context == grammarAccess.getArrowExprRule() ||
				   context == grammarAccess.getArrowExprAccess().getBinaryExprLeftAction_1_0_0_0() ||
				   context == grammarAccess.getAtomicExprRule() ||
				   context == grammarAccess.getAtomicExprAccess().getTupleExprExprsAction_10_2_0() ||
				   context == grammarAccess.getExprRule() ||
				   context == grammarAccess.getImpliesExprRule() ||
				   context == grammarAccess.getImpliesExprAccess().getBinaryExprLeftAction_1_0_0_0() ||
				   context == grammarAccess.getOrExprRule() ||
				   context == grammarAccess.getOrExprAccess().getBinaryExprLeftAction_1_0_0_0() ||
				   context == grammarAccess.getPlusExprRule() ||
				   context == grammarAccess.getPlusExprAccess().getBinaryExprLeftAction_1_0_0_0() ||
				   context == grammarAccess.getPrefixExprRule() ||
				   context == grammarAccess.getRelationalExprRule() ||
				   context == grammarAccess.getRelationalExprAccess().getBinaryExprLeftAction_1_0_0_0() ||
				   context == grammarAccess.getTimesExprRule() ||
				   context == grammarAccess.getTimesExprAccess().getBinaryExprLeftAction_1_0_0_0()) {
					sequence_AccessExpr(context, (ArrayAccessExpr) semanticObject); 
					return; 
				}
				else break;
			case JkindPackage.ARRAY_EXPR:
				if(context == grammarAccess.getAccessExprRule() ||
				   context == grammarAccess.getAccessExprAccess().getArrayAccessExprArrayAction_1_2_0_0_0() ||
				   context == grammarAccess.getAccessExprAccess().getRecordAccessExprRecordAction_1_0_0_0_0() ||
				   context == grammarAccess.getAccessExprAccess().getRecordUpdateExprRecordAction_1_1_0_0_0() ||
				   context == grammarAccess.getAndExprRule() ||
				   context == grammarAccess.getAndExprAccess().getBinaryExprLeftAction_1_0_0_0() ||
				   context == grammarAccess.getArrowExprRule() ||
				   context == grammarAccess.getArrowExprAccess().getBinaryExprLeftAction_1_0_0_0() ||
				   context == grammarAccess.getAtomicExprRule() ||
				   context == grammarAccess.getAtomicExprAccess().getTupleExprExprsAction_10_2_0() ||
				   context == grammarAccess.getExprRule() ||
				   context == grammarAccess.getImpliesExprRule() ||
				   context == grammarAccess.getImpliesExprAccess().getBinaryExprLeftAction_1_0_0_0() ||
				   context == grammarAccess.getOrExprRule() ||
				   context == grammarAccess.getOrExprAccess().getBinaryExprLeftAction_1_0_0_0() ||
				   context == grammarAccess.getPlusExprRule() ||
				   context == grammarAccess.getPlusExprAccess().getBinaryExprLeftAction_1_0_0_0() ||
				   context == grammarAccess.getPrefixExprRule() ||
				   context == grammarAccess.getRelationalExprRule() ||
				   context == grammarAccess.getRelationalExprAccess().getBinaryExprLeftAction_1_0_0_0() ||
				   context == grammarAccess.getTimesExprRule() ||
				   context == grammarAccess.getTimesExprAccess().getBinaryExprLeftAction_1_0_0_0()) {
					sequence_AtomicExpr(context, (ArrayExpr) semanticObject); 
					return; 
				}
				else break;
			case JkindPackage.ARRAY_TYPE:
				if(context == grammarAccess.getArrayTypeRule() ||
				   context == grammarAccess.getArrayTypeAccess().getArrayTypeBaseAction_1_0() ||
				   context == grammarAccess.getTypeRule()) {
					sequence_ArrayType(context, (ArrayType) semanticObject); 
					return; 
				}
				else break;
			case JkindPackage.ARRAY_UPDATE_EXPR:
				if(context == grammarAccess.getAccessExprRule() ||
				   context == grammarAccess.getAccessExprAccess().getArrayAccessExprArrayAction_1_2_0_0_0() ||
				   context == grammarAccess.getAccessExprAccess().getRecordAccessExprRecordAction_1_0_0_0_0() ||
				   context == grammarAccess.getAccessExprAccess().getRecordUpdateExprRecordAction_1_1_0_0_0() ||
				   context == grammarAccess.getAndExprRule() ||
				   context == grammarAccess.getAndExprAccess().getBinaryExprLeftAction_1_0_0_0() ||
				   context == grammarAccess.getArrowExprRule() ||
				   context == grammarAccess.getArrowExprAccess().getBinaryExprLeftAction_1_0_0_0() ||
				   context == grammarAccess.getAtomicExprRule() ||
				   context == grammarAccess.getAtomicExprAccess().getTupleExprExprsAction_10_2_0() ||
				   context == grammarAccess.getExprRule() ||
				   context == grammarAccess.getImpliesExprRule() ||
				   context == grammarAccess.getImpliesExprAccess().getBinaryExprLeftAction_1_0_0_0() ||
				   context == grammarAccess.getOrExprRule() ||
				   context == grammarAccess.getOrExprAccess().getBinaryExprLeftAction_1_0_0_0() ||
				   context == grammarAccess.getPlusExprRule() ||
				   context == grammarAccess.getPlusExprAccess().getBinaryExprLeftAction_1_0_0_0() ||
				   context == grammarAccess.getPrefixExprRule() ||
				   context == grammarAccess.getRelationalExprRule() ||
				   context == grammarAccess.getRelationalExprAccess().getBinaryExprLeftAction_1_0_0_0() ||
				   context == grammarAccess.getTimesExprRule() ||
				   context == grammarAccess.getTimesExprAccess().getBinaryExprLeftAction_1_0_0_0()) {
					sequence_AccessExpr(context, (ArrayUpdateExpr) semanticObject); 
					return; 
				}
				else break;
			case JkindPackage.ASSERTION:
				if(context == grammarAccess.getAssertionRule()) {
					sequence_Assertion(context, (Assertion) semanticObject); 
					return; 
				}
				else break;
			case JkindPackage.BINARY_EXPR:
				if(context == grammarAccess.getAccessExprRule() ||
				   context == grammarAccess.getAccessExprAccess().getArrayAccessExprArrayAction_1_2_0_0_0() ||
				   context == grammarAccess.getAccessExprAccess().getRecordAccessExprRecordAction_1_0_0_0_0() ||
				   context == grammarAccess.getAccessExprAccess().getRecordUpdateExprRecordAction_1_1_0_0_0() ||
				   context == grammarAccess.getAndExprRule() ||
				   context == grammarAccess.getAndExprAccess().getBinaryExprLeftAction_1_0_0_0() ||
				   context == grammarAccess.getArrowExprRule() ||
				   context == grammarAccess.getArrowExprAccess().getBinaryExprLeftAction_1_0_0_0() ||
				   context == grammarAccess.getAtomicExprRule() ||
				   context == grammarAccess.getAtomicExprAccess().getTupleExprExprsAction_10_2_0() ||
				   context == grammarAccess.getExprRule() ||
				   context == grammarAccess.getImpliesExprRule() ||
				   context == grammarAccess.getImpliesExprAccess().getBinaryExprLeftAction_1_0_0_0() ||
				   context == grammarAccess.getOrExprRule() ||
				   context == grammarAccess.getOrExprAccess().getBinaryExprLeftAction_1_0_0_0() ||
				   context == grammarAccess.getPlusExprRule() ||
				   context == grammarAccess.getPlusExprAccess().getBinaryExprLeftAction_1_0_0_0() ||
				   context == grammarAccess.getPrefixExprRule() ||
				   context == grammarAccess.getRelationalExprRule() ||
				   context == grammarAccess.getRelationalExprAccess().getBinaryExprLeftAction_1_0_0_0() ||
				   context == grammarAccess.getTimesExprRule() ||
				   context == grammarAccess.getTimesExprAccess().getBinaryExprLeftAction_1_0_0_0()) {
					sequence_AndExpr_ArrowExpr_ImpliesExpr_OrExpr_PlusExpr_RelationalExpr_TimesExpr(context, (BinaryExpr) semanticObject); 
					return; 
				}
				else break;
			case JkindPackage.BOOL_EXPR:
				if(context == grammarAccess.getAccessExprRule() ||
				   context == grammarAccess.getAccessExprAccess().getArrayAccessExprArrayAction_1_2_0_0_0() ||
				   context == grammarAccess.getAccessExprAccess().getRecordAccessExprRecordAction_1_0_0_0_0() ||
				   context == grammarAccess.getAccessExprAccess().getRecordUpdateExprRecordAction_1_1_0_0_0() ||
				   context == grammarAccess.getAndExprRule() ||
				   context == grammarAccess.getAndExprAccess().getBinaryExprLeftAction_1_0_0_0() ||
				   context == grammarAccess.getArrowExprRule() ||
				   context == grammarAccess.getArrowExprAccess().getBinaryExprLeftAction_1_0_0_0() ||
				   context == grammarAccess.getAtomicExprRule() ||
				   context == grammarAccess.getAtomicExprAccess().getTupleExprExprsAction_10_2_0() ||
				   context == grammarAccess.getExprRule() ||
				   context == grammarAccess.getImpliesExprRule() ||
				   context == grammarAccess.getImpliesExprAccess().getBinaryExprLeftAction_1_0_0_0() ||
				   context == grammarAccess.getOrExprRule() ||
				   context == grammarAccess.getOrExprAccess().getBinaryExprLeftAction_1_0_0_0() ||
				   context == grammarAccess.getPlusExprRule() ||
				   context == grammarAccess.getPlusExprAccess().getBinaryExprLeftAction_1_0_0_0() ||
				   context == grammarAccess.getPrefixExprRule() ||
				   context == grammarAccess.getRelationalExprRule() ||
				   context == grammarAccess.getRelationalExprAccess().getBinaryExprLeftAction_1_0_0_0() ||
				   context == grammarAccess.getTimesExprRule() ||
				   context == grammarAccess.getTimesExprAccess().getBinaryExprLeftAction_1_0_0_0()) {
					sequence_AtomicExpr(context, (BoolExpr) semanticObject); 
					return; 
				}
				else break;
			case JkindPackage.BOOL_TYPE:
				if(context == grammarAccess.getArrayTypeRule() ||
				   context == grammarAccess.getArrayTypeAccess().getArrayTypeBaseAction_1_0() ||
				   context == grammarAccess.getAtomicTypeRule() ||
				   context == grammarAccess.getTypeRule()) {
					sequence_AtomicType(context, (BoolType) semanticObject); 
					return; 
				}
				else break;
			case JkindPackage.CAST_EXPR:
				if(context == grammarAccess.getAccessExprRule() ||
				   context == grammarAccess.getAccessExprAccess().getArrayAccessExprArrayAction_1_2_0_0_0() ||
				   context == grammarAccess.getAccessExprAccess().getRecordAccessExprRecordAction_1_0_0_0_0() ||
				   context == grammarAccess.getAccessExprAccess().getRecordUpdateExprRecordAction_1_1_0_0_0() ||
				   context == grammarAccess.getAndExprRule() ||
				   context == grammarAccess.getAndExprAccess().getBinaryExprLeftAction_1_0_0_0() ||
				   context == grammarAccess.getArrowExprRule() ||
				   context == grammarAccess.getArrowExprAccess().getBinaryExprLeftAction_1_0_0_0() ||
				   context == grammarAccess.getAtomicExprRule() ||
				   context == grammarAccess.getAtomicExprAccess().getTupleExprExprsAction_10_2_0() ||
				   context == grammarAccess.getExprRule() ||
				   context == grammarAccess.getImpliesExprRule() ||
				   context == grammarAccess.getImpliesExprAccess().getBinaryExprLeftAction_1_0_0_0() ||
				   context == grammarAccess.getOrExprRule() ||
				   context == grammarAccess.getOrExprAccess().getBinaryExprLeftAction_1_0_0_0() ||
				   context == grammarAccess.getPlusExprRule() ||
				   context == grammarAccess.getPlusExprAccess().getBinaryExprLeftAction_1_0_0_0() ||
				   context == grammarAccess.getPrefixExprRule() ||
				   context == grammarAccess.getRelationalExprRule() ||
				   context == grammarAccess.getRelationalExprAccess().getBinaryExprLeftAction_1_0_0_0() ||
				   context == grammarAccess.getTimesExprRule() ||
				   context == grammarAccess.getTimesExprAccess().getBinaryExprLeftAction_1_0_0_0()) {
					sequence_AtomicExpr(context, (CastExpr) semanticObject); 
					return; 
				}
				else break;
			case JkindPackage.CONDACT_EXPR:
				if(context == grammarAccess.getAccessExprRule() ||
				   context == grammarAccess.getAccessExprAccess().getArrayAccessExprArrayAction_1_2_0_0_0() ||
				   context == grammarAccess.getAccessExprAccess().getRecordAccessExprRecordAction_1_0_0_0_0() ||
				   context == grammarAccess.getAccessExprAccess().getRecordUpdateExprRecordAction_1_1_0_0_0() ||
				   context == grammarAccess.getAndExprRule() ||
				   context == grammarAccess.getAndExprAccess().getBinaryExprLeftAction_1_0_0_0() ||
				   context == grammarAccess.getArrowExprRule() ||
				   context == grammarAccess.getArrowExprAccess().getBinaryExprLeftAction_1_0_0_0() ||
				   context == grammarAccess.getAtomicExprRule() ||
				   context == grammarAccess.getAtomicExprAccess().getTupleExprExprsAction_10_2_0() ||
				   context == grammarAccess.getExprRule() ||
				   context == grammarAccess.getImpliesExprRule() ||
				   context == grammarAccess.getImpliesExprAccess().getBinaryExprLeftAction_1_0_0_0() ||
				   context == grammarAccess.getOrExprRule() ||
				   context == grammarAccess.getOrExprAccess().getBinaryExprLeftAction_1_0_0_0() ||
				   context == grammarAccess.getPlusExprRule() ||
				   context == grammarAccess.getPlusExprAccess().getBinaryExprLeftAction_1_0_0_0() ||
				   context == grammarAccess.getPrefixExprRule() ||
				   context == grammarAccess.getRelationalExprRule() ||
				   context == grammarAccess.getRelationalExprAccess().getBinaryExprLeftAction_1_0_0_0() ||
				   context == grammarAccess.getTimesExprRule() ||
				   context == grammarAccess.getTimesExprAccess().getBinaryExprLeftAction_1_0_0_0()) {
					sequence_AtomicExpr(context, (CondactExpr) semanticObject); 
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
			case JkindPackage.ENUM_TYPE:
				if(context == grammarAccess.getTypeDefRule()) {
					sequence_TypeDef(context, (EnumType) semanticObject); 
					return; 
				}
				else break;
			case JkindPackage.ENUM_VALUE:
				if(context == grammarAccess.getEnumValueRule() ||
				   context == grammarAccess.getIdRefRule()) {
					sequence_EnumValue(context, (EnumValue) semanticObject); 
					return; 
				}
				else break;
			case JkindPackage.EQUATION:
				if(context == grammarAccess.getEquationRule()) {
					sequence_Equation(context, (Equation) semanticObject); 
					return; 
				}
				else break;
			case JkindPackage.FIELD:
				if(context == grammarAccess.getFieldRule()) {
					sequence_Field(context, (Field) semanticObject); 
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
				if(context == grammarAccess.getAccessExprRule() ||
				   context == grammarAccess.getAccessExprAccess().getArrayAccessExprArrayAction_1_2_0_0_0() ||
				   context == grammarAccess.getAccessExprAccess().getRecordAccessExprRecordAction_1_0_0_0_0() ||
				   context == grammarAccess.getAccessExprAccess().getRecordUpdateExprRecordAction_1_1_0_0_0() ||
				   context == grammarAccess.getAndExprRule() ||
				   context == grammarAccess.getAndExprAccess().getBinaryExprLeftAction_1_0_0_0() ||
				   context == grammarAccess.getArrowExprRule() ||
				   context == grammarAccess.getArrowExprAccess().getBinaryExprLeftAction_1_0_0_0() ||
				   context == grammarAccess.getAtomicExprRule() ||
				   context == grammarAccess.getAtomicExprAccess().getTupleExprExprsAction_10_2_0() ||
				   context == grammarAccess.getExprRule() ||
				   context == grammarAccess.getImpliesExprRule() ||
				   context == grammarAccess.getImpliesExprAccess().getBinaryExprLeftAction_1_0_0_0() ||
				   context == grammarAccess.getOrExprRule() ||
				   context == grammarAccess.getOrExprAccess().getBinaryExprLeftAction_1_0_0_0() ||
				   context == grammarAccess.getPlusExprRule() ||
				   context == grammarAccess.getPlusExprAccess().getBinaryExprLeftAction_1_0_0_0() ||
				   context == grammarAccess.getPrefixExprRule() ||
				   context == grammarAccess.getRelationalExprRule() ||
				   context == grammarAccess.getRelationalExprAccess().getBinaryExprLeftAction_1_0_0_0() ||
				   context == grammarAccess.getTimesExprRule() ||
				   context == grammarAccess.getTimesExprAccess().getBinaryExprLeftAction_1_0_0_0()) {
					sequence_AtomicExpr(context, (IdExpr) semanticObject); 
					return; 
				}
				else break;
			case JkindPackage.IF_THEN_ELSE_EXPR:
				if(context == grammarAccess.getAccessExprRule() ||
				   context == grammarAccess.getAccessExprAccess().getArrayAccessExprArrayAction_1_2_0_0_0() ||
				   context == grammarAccess.getAccessExprAccess().getRecordAccessExprRecordAction_1_0_0_0_0() ||
				   context == grammarAccess.getAccessExprAccess().getRecordUpdateExprRecordAction_1_1_0_0_0() ||
				   context == grammarAccess.getAndExprRule() ||
				   context == grammarAccess.getAndExprAccess().getBinaryExprLeftAction_1_0_0_0() ||
				   context == grammarAccess.getArrowExprRule() ||
				   context == grammarAccess.getArrowExprAccess().getBinaryExprLeftAction_1_0_0_0() ||
				   context == grammarAccess.getAtomicExprRule() ||
				   context == grammarAccess.getAtomicExprAccess().getTupleExprExprsAction_10_2_0() ||
				   context == grammarAccess.getExprRule() ||
				   context == grammarAccess.getImpliesExprRule() ||
				   context == grammarAccess.getImpliesExprAccess().getBinaryExprLeftAction_1_0_0_0() ||
				   context == grammarAccess.getOrExprRule() ||
				   context == grammarAccess.getOrExprAccess().getBinaryExprLeftAction_1_0_0_0() ||
				   context == grammarAccess.getPlusExprRule() ||
				   context == grammarAccess.getPlusExprAccess().getBinaryExprLeftAction_1_0_0_0() ||
				   context == grammarAccess.getPrefixExprRule() ||
				   context == grammarAccess.getRelationalExprRule() ||
				   context == grammarAccess.getRelationalExprAccess().getBinaryExprLeftAction_1_0_0_0() ||
				   context == grammarAccess.getTimesExprRule() ||
				   context == grammarAccess.getTimesExprAccess().getBinaryExprLeftAction_1_0_0_0()) {
					sequence_AtomicExpr(context, (IfThenElseExpr) semanticObject); 
					return; 
				}
				else break;
			case JkindPackage.INT_EXPR:
				if(context == grammarAccess.getAccessExprRule() ||
				   context == grammarAccess.getAccessExprAccess().getArrayAccessExprArrayAction_1_2_0_0_0() ||
				   context == grammarAccess.getAccessExprAccess().getRecordAccessExprRecordAction_1_0_0_0_0() ||
				   context == grammarAccess.getAccessExprAccess().getRecordUpdateExprRecordAction_1_1_0_0_0() ||
				   context == grammarAccess.getAndExprRule() ||
				   context == grammarAccess.getAndExprAccess().getBinaryExprLeftAction_1_0_0_0() ||
				   context == grammarAccess.getArrowExprRule() ||
				   context == grammarAccess.getArrowExprAccess().getBinaryExprLeftAction_1_0_0_0() ||
				   context == grammarAccess.getAtomicExprRule() ||
				   context == grammarAccess.getAtomicExprAccess().getTupleExprExprsAction_10_2_0() ||
				   context == grammarAccess.getExprRule() ||
				   context == grammarAccess.getImpliesExprRule() ||
				   context == grammarAccess.getImpliesExprAccess().getBinaryExprLeftAction_1_0_0_0() ||
				   context == grammarAccess.getOrExprRule() ||
				   context == grammarAccess.getOrExprAccess().getBinaryExprLeftAction_1_0_0_0() ||
				   context == grammarAccess.getPlusExprRule() ||
				   context == grammarAccess.getPlusExprAccess().getBinaryExprLeftAction_1_0_0_0() ||
				   context == grammarAccess.getPrefixExprRule() ||
				   context == grammarAccess.getRelationalExprRule() ||
				   context == grammarAccess.getRelationalExprAccess().getBinaryExprLeftAction_1_0_0_0() ||
				   context == grammarAccess.getTimesExprRule() ||
				   context == grammarAccess.getTimesExprAccess().getBinaryExprLeftAction_1_0_0_0()) {
					sequence_AtomicExpr(context, (IntExpr) semanticObject); 
					return; 
				}
				else break;
			case JkindPackage.INT_TYPE:
				if(context == grammarAccess.getArrayTypeRule() ||
				   context == grammarAccess.getArrayTypeAccess().getArrayTypeBaseAction_1_0() ||
				   context == grammarAccess.getAtomicTypeRule() ||
				   context == grammarAccess.getTypeRule()) {
					sequence_AtomicType(context, (IntType) semanticObject); 
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
				if(context == grammarAccess.getAccessExprRule() ||
				   context == grammarAccess.getAccessExprAccess().getArrayAccessExprArrayAction_1_2_0_0_0() ||
				   context == grammarAccess.getAccessExprAccess().getRecordAccessExprRecordAction_1_0_0_0_0() ||
				   context == grammarAccess.getAccessExprAccess().getRecordUpdateExprRecordAction_1_1_0_0_0() ||
				   context == grammarAccess.getAndExprRule() ||
				   context == grammarAccess.getAndExprAccess().getBinaryExprLeftAction_1_0_0_0() ||
				   context == grammarAccess.getArrowExprRule() ||
				   context == grammarAccess.getArrowExprAccess().getBinaryExprLeftAction_1_0_0_0() ||
				   context == grammarAccess.getAtomicExprRule() ||
				   context == grammarAccess.getAtomicExprAccess().getTupleExprExprsAction_10_2_0() ||
				   context == grammarAccess.getExprRule() ||
				   context == grammarAccess.getImpliesExprRule() ||
				   context == grammarAccess.getImpliesExprAccess().getBinaryExprLeftAction_1_0_0_0() ||
				   context == grammarAccess.getNodeCallExprRule() ||
				   context == grammarAccess.getOrExprRule() ||
				   context == grammarAccess.getOrExprAccess().getBinaryExprLeftAction_1_0_0_0() ||
				   context == grammarAccess.getPlusExprRule() ||
				   context == grammarAccess.getPlusExprAccess().getBinaryExprLeftAction_1_0_0_0() ||
				   context == grammarAccess.getPrefixExprRule() ||
				   context == grammarAccess.getRelationalExprRule() ||
				   context == grammarAccess.getRelationalExprAccess().getBinaryExprLeftAction_1_0_0_0() ||
				   context == grammarAccess.getTimesExprRule() ||
				   context == grammarAccess.getTimesExprAccess().getBinaryExprLeftAction_1_0_0_0()) {
					sequence_NodeCallExpr(context, (NodeCallExpr) semanticObject); 
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
				if(context == grammarAccess.getAccessExprRule() ||
				   context == grammarAccess.getAccessExprAccess().getArrayAccessExprArrayAction_1_2_0_0_0() ||
				   context == grammarAccess.getAccessExprAccess().getRecordAccessExprRecordAction_1_0_0_0_0() ||
				   context == grammarAccess.getAccessExprAccess().getRecordUpdateExprRecordAction_1_1_0_0_0() ||
				   context == grammarAccess.getAndExprRule() ||
				   context == grammarAccess.getAndExprAccess().getBinaryExprLeftAction_1_0_0_0() ||
				   context == grammarAccess.getArrowExprRule() ||
				   context == grammarAccess.getArrowExprAccess().getBinaryExprLeftAction_1_0_0_0() ||
				   context == grammarAccess.getAtomicExprRule() ||
				   context == grammarAccess.getAtomicExprAccess().getTupleExprExprsAction_10_2_0() ||
				   context == grammarAccess.getExprRule() ||
				   context == grammarAccess.getImpliesExprRule() ||
				   context == grammarAccess.getImpliesExprAccess().getBinaryExprLeftAction_1_0_0_0() ||
				   context == grammarAccess.getOrExprRule() ||
				   context == grammarAccess.getOrExprAccess().getBinaryExprLeftAction_1_0_0_0() ||
				   context == grammarAccess.getPlusExprRule() ||
				   context == grammarAccess.getPlusExprAccess().getBinaryExprLeftAction_1_0_0_0() ||
				   context == grammarAccess.getPrefixExprRule() ||
				   context == grammarAccess.getRelationalExprRule() ||
				   context == grammarAccess.getRelationalExprAccess().getBinaryExprLeftAction_1_0_0_0() ||
				   context == grammarAccess.getTimesExprRule() ||
				   context == grammarAccess.getTimesExprAccess().getBinaryExprLeftAction_1_0_0_0()) {
					sequence_AtomicExpr(context, (RealExpr) semanticObject); 
					return; 
				}
				else break;
			case JkindPackage.REAL_TYPE:
				if(context == grammarAccess.getArrayTypeRule() ||
				   context == grammarAccess.getArrayTypeAccess().getArrayTypeBaseAction_1_0() ||
				   context == grammarAccess.getAtomicTypeRule() ||
				   context == grammarAccess.getTypeRule()) {
					sequence_AtomicType(context, (RealType) semanticObject); 
					return; 
				}
				else break;
			case JkindPackage.RECORD_ACCESS_EXPR:
				if(context == grammarAccess.getAccessExprRule() ||
				   context == grammarAccess.getAccessExprAccess().getArrayAccessExprArrayAction_1_2_0_0_0() ||
				   context == grammarAccess.getAccessExprAccess().getRecordAccessExprRecordAction_1_0_0_0_0() ||
				   context == grammarAccess.getAccessExprAccess().getRecordUpdateExprRecordAction_1_1_0_0_0() ||
				   context == grammarAccess.getAndExprRule() ||
				   context == grammarAccess.getAndExprAccess().getBinaryExprLeftAction_1_0_0_0() ||
				   context == grammarAccess.getArrowExprRule() ||
				   context == grammarAccess.getArrowExprAccess().getBinaryExprLeftAction_1_0_0_0() ||
				   context == grammarAccess.getAtomicExprRule() ||
				   context == grammarAccess.getAtomicExprAccess().getTupleExprExprsAction_10_2_0() ||
				   context == grammarAccess.getExprRule() ||
				   context == grammarAccess.getImpliesExprRule() ||
				   context == grammarAccess.getImpliesExprAccess().getBinaryExprLeftAction_1_0_0_0() ||
				   context == grammarAccess.getOrExprRule() ||
				   context == grammarAccess.getOrExprAccess().getBinaryExprLeftAction_1_0_0_0() ||
				   context == grammarAccess.getPlusExprRule() ||
				   context == grammarAccess.getPlusExprAccess().getBinaryExprLeftAction_1_0_0_0() ||
				   context == grammarAccess.getPrefixExprRule() ||
				   context == grammarAccess.getRelationalExprRule() ||
				   context == grammarAccess.getRelationalExprAccess().getBinaryExprLeftAction_1_0_0_0() ||
				   context == grammarAccess.getTimesExprRule() ||
				   context == grammarAccess.getTimesExprAccess().getBinaryExprLeftAction_1_0_0_0()) {
					sequence_AccessExpr(context, (RecordAccessExpr) semanticObject); 
					return; 
				}
				else break;
			case JkindPackage.RECORD_EXPR:
				if(context == grammarAccess.getAccessExprRule() ||
				   context == grammarAccess.getAccessExprAccess().getArrayAccessExprArrayAction_1_2_0_0_0() ||
				   context == grammarAccess.getAccessExprAccess().getRecordAccessExprRecordAction_1_0_0_0_0() ||
				   context == grammarAccess.getAccessExprAccess().getRecordUpdateExprRecordAction_1_1_0_0_0() ||
				   context == grammarAccess.getAndExprRule() ||
				   context == grammarAccess.getAndExprAccess().getBinaryExprLeftAction_1_0_0_0() ||
				   context == grammarAccess.getArrowExprRule() ||
				   context == grammarAccess.getArrowExprAccess().getBinaryExprLeftAction_1_0_0_0() ||
				   context == grammarAccess.getAtomicExprRule() ||
				   context == grammarAccess.getAtomicExprAccess().getTupleExprExprsAction_10_2_0() ||
				   context == grammarAccess.getExprRule() ||
				   context == grammarAccess.getImpliesExprRule() ||
				   context == grammarAccess.getImpliesExprAccess().getBinaryExprLeftAction_1_0_0_0() ||
				   context == grammarAccess.getOrExprRule() ||
				   context == grammarAccess.getOrExprAccess().getBinaryExprLeftAction_1_0_0_0() ||
				   context == grammarAccess.getPlusExprRule() ||
				   context == grammarAccess.getPlusExprAccess().getBinaryExprLeftAction_1_0_0_0() ||
				   context == grammarAccess.getPrefixExprRule() ||
				   context == grammarAccess.getRelationalExprRule() ||
				   context == grammarAccess.getRelationalExprAccess().getBinaryExprLeftAction_1_0_0_0() ||
				   context == grammarAccess.getTimesExprRule() ||
				   context == grammarAccess.getTimesExprAccess().getBinaryExprLeftAction_1_0_0_0()) {
					sequence_AtomicExpr(context, (RecordExpr) semanticObject); 
					return; 
				}
				else break;
			case JkindPackage.RECORD_TYPE:
				if(context == grammarAccess.getTypeDefRule()) {
					sequence_TypeDef(context, (RecordType) semanticObject); 
					return; 
				}
				else break;
			case JkindPackage.RECORD_UPDATE_EXPR:
				if(context == grammarAccess.getAccessExprRule() ||
				   context == grammarAccess.getAccessExprAccess().getArrayAccessExprArrayAction_1_2_0_0_0() ||
				   context == grammarAccess.getAccessExprAccess().getRecordAccessExprRecordAction_1_0_0_0_0() ||
				   context == grammarAccess.getAccessExprAccess().getRecordUpdateExprRecordAction_1_1_0_0_0() ||
				   context == grammarAccess.getAndExprRule() ||
				   context == grammarAccess.getAndExprAccess().getBinaryExprLeftAction_1_0_0_0() ||
				   context == grammarAccess.getArrowExprRule() ||
				   context == grammarAccess.getArrowExprAccess().getBinaryExprLeftAction_1_0_0_0() ||
				   context == grammarAccess.getAtomicExprRule() ||
				   context == grammarAccess.getAtomicExprAccess().getTupleExprExprsAction_10_2_0() ||
				   context == grammarAccess.getExprRule() ||
				   context == grammarAccess.getImpliesExprRule() ||
				   context == grammarAccess.getImpliesExprAccess().getBinaryExprLeftAction_1_0_0_0() ||
				   context == grammarAccess.getOrExprRule() ||
				   context == grammarAccess.getOrExprAccess().getBinaryExprLeftAction_1_0_0_0() ||
				   context == grammarAccess.getPlusExprRule() ||
				   context == grammarAccess.getPlusExprAccess().getBinaryExprLeftAction_1_0_0_0() ||
				   context == grammarAccess.getPrefixExprRule() ||
				   context == grammarAccess.getRelationalExprRule() ||
				   context == grammarAccess.getRelationalExprAccess().getBinaryExprLeftAction_1_0_0_0() ||
				   context == grammarAccess.getTimesExprRule() ||
				   context == grammarAccess.getTimesExprAccess().getBinaryExprLeftAction_1_0_0_0()) {
					sequence_AccessExpr(context, (RecordUpdateExpr) semanticObject); 
					return; 
				}
				else break;
			case JkindPackage.SUBRANGE_TYPE:
				if(context == grammarAccess.getArrayTypeRule() ||
				   context == grammarAccess.getArrayTypeAccess().getArrayTypeBaseAction_1_0() ||
				   context == grammarAccess.getAtomicTypeRule() ||
				   context == grammarAccess.getTypeRule()) {
					sequence_AtomicType(context, (SubrangeType) semanticObject); 
					return; 
				}
				else break;
			case JkindPackage.TUPLE_EXPR:
				if(context == grammarAccess.getAccessExprRule() ||
				   context == grammarAccess.getAccessExprAccess().getArrayAccessExprArrayAction_1_2_0_0_0() ||
				   context == grammarAccess.getAccessExprAccess().getRecordAccessExprRecordAction_1_0_0_0_0() ||
				   context == grammarAccess.getAccessExprAccess().getRecordUpdateExprRecordAction_1_1_0_0_0() ||
				   context == grammarAccess.getAndExprRule() ||
				   context == grammarAccess.getAndExprAccess().getBinaryExprLeftAction_1_0_0_0() ||
				   context == grammarAccess.getArrowExprRule() ||
				   context == grammarAccess.getArrowExprAccess().getBinaryExprLeftAction_1_0_0_0() ||
				   context == grammarAccess.getAtomicExprRule() ||
				   context == grammarAccess.getAtomicExprAccess().getTupleExprExprsAction_10_2_0() ||
				   context == grammarAccess.getExprRule() ||
				   context == grammarAccess.getImpliesExprRule() ||
				   context == grammarAccess.getImpliesExprAccess().getBinaryExprLeftAction_1_0_0_0() ||
				   context == grammarAccess.getOrExprRule() ||
				   context == grammarAccess.getOrExprAccess().getBinaryExprLeftAction_1_0_0_0() ||
				   context == grammarAccess.getPlusExprRule() ||
				   context == grammarAccess.getPlusExprAccess().getBinaryExprLeftAction_1_0_0_0() ||
				   context == grammarAccess.getPrefixExprRule() ||
				   context == grammarAccess.getRelationalExprRule() ||
				   context == grammarAccess.getRelationalExprAccess().getBinaryExprLeftAction_1_0_0_0() ||
				   context == grammarAccess.getTimesExprRule() ||
				   context == grammarAccess.getTimesExprAccess().getBinaryExprLeftAction_1_0_0_0()) {
					sequence_AtomicExpr(context, (TupleExpr) semanticObject); 
					return; 
				}
				else break;
			case JkindPackage.UNARY_EXPR:
				if(context == grammarAccess.getAccessExprRule() ||
				   context == grammarAccess.getAccessExprAccess().getArrayAccessExprArrayAction_1_2_0_0_0() ||
				   context == grammarAccess.getAccessExprAccess().getRecordAccessExprRecordAction_1_0_0_0_0() ||
				   context == grammarAccess.getAccessExprAccess().getRecordUpdateExprRecordAction_1_1_0_0_0() ||
				   context == grammarAccess.getAndExprRule() ||
				   context == grammarAccess.getAndExprAccess().getBinaryExprLeftAction_1_0_0_0() ||
				   context == grammarAccess.getArrowExprRule() ||
				   context == grammarAccess.getArrowExprAccess().getBinaryExprLeftAction_1_0_0_0() ||
				   context == grammarAccess.getAtomicExprRule() ||
				   context == grammarAccess.getAtomicExprAccess().getTupleExprExprsAction_10_2_0() ||
				   context == grammarAccess.getExprRule() ||
				   context == grammarAccess.getImpliesExprRule() ||
				   context == grammarAccess.getImpliesExprAccess().getBinaryExprLeftAction_1_0_0_0() ||
				   context == grammarAccess.getOrExprRule() ||
				   context == grammarAccess.getOrExprAccess().getBinaryExprLeftAction_1_0_0_0() ||
				   context == grammarAccess.getPlusExprRule() ||
				   context == grammarAccess.getPlusExprAccess().getBinaryExprLeftAction_1_0_0_0() ||
				   context == grammarAccess.getPrefixExprRule() ||
				   context == grammarAccess.getRelationalExprRule() ||
				   context == grammarAccess.getRelationalExprAccess().getBinaryExprLeftAction_1_0_0_0() ||
				   context == grammarAccess.getTimesExprRule() ||
				   context == grammarAccess.getTimesExprAccess().getBinaryExprLeftAction_1_0_0_0()) {
					sequence_PrefixExpr(context, (UnaryExpr) semanticObject); 
					return; 
				}
				else break;
			case JkindPackage.USER_TYPE:
				if(context == grammarAccess.getArrayTypeRule() ||
				   context == grammarAccess.getArrayTypeAccess().getArrayTypeBaseAction_1_0() ||
				   context == grammarAccess.getAtomicTypeRule() ||
				   context == grammarAccess.getTypeRule()) {
					sequence_AtomicType(context, (UserType) semanticObject); 
					return; 
				}
				else break;
			case JkindPackage.VARIABLE:
				if(context == grammarAccess.getIdRefRule() ||
				   context == grammarAccess.getVariableRule()) {
					sequence_Variable(context, (Variable) semanticObject); 
					return; 
				}
				else break;
			case JkindPackage.VARIABLE_GROUP:
				if(context == grammarAccess.getVariableGroupRule()) {
					sequence_VariableGroup(context, (VariableGroup) semanticObject); 
					return; 
				}
				else break;
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Constraint:
	 *     (array=AccessExpr_ArrayAccessExpr_1_2_0_0_0 index=Expr)
	 */
	protected void sequence_AccessExpr(EObject context, ArrayAccessExpr semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, JkindPackage.Literals.ARRAY_ACCESS_EXPR__ARRAY) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, JkindPackage.Literals.ARRAY_ACCESS_EXPR__ARRAY));
			if(transientValues.isValueTransient(semanticObject, JkindPackage.Literals.ARRAY_ACCESS_EXPR__INDEX) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, JkindPackage.Literals.ARRAY_ACCESS_EXPR__INDEX));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getAccessExprAccess().getArrayAccessExprArrayAction_1_2_0_0_0(), semanticObject.getArray());
		feeder.accept(grammarAccess.getAccessExprAccess().getIndexExprParserRuleCall_1_2_1_0(), semanticObject.getIndex());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (access=AccessExpr_ArrayUpdateExpr_1_2_2_0_0_0 value=Expr)
	 */
	protected void sequence_AccessExpr(EObject context, ArrayUpdateExpr semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, JkindPackage.Literals.ARRAY_UPDATE_EXPR__ACCESS) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, JkindPackage.Literals.ARRAY_UPDATE_EXPR__ACCESS));
			if(transientValues.isValueTransient(semanticObject, JkindPackage.Literals.ARRAY_UPDATE_EXPR__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, JkindPackage.Literals.ARRAY_UPDATE_EXPR__VALUE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getAccessExprAccess().getArrayUpdateExprAccessAction_1_2_2_0_0_0(), semanticObject.getAccess());
		feeder.accept(grammarAccess.getAccessExprAccess().getValueExprParserRuleCall_1_2_2_1_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (record=AccessExpr_RecordAccessExpr_1_0_0_0_0 field=[Field|ID])
	 */
	protected void sequence_AccessExpr(EObject context, RecordAccessExpr semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, JkindPackage.Literals.RECORD_ACCESS_EXPR__RECORD) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, JkindPackage.Literals.RECORD_ACCESS_EXPR__RECORD));
			if(transientValues.isValueTransient(semanticObject, JkindPackage.Literals.RECORD_ACCESS_EXPR__FIELD) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, JkindPackage.Literals.RECORD_ACCESS_EXPR__FIELD));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getAccessExprAccess().getRecordAccessExprRecordAction_1_0_0_0_0(), semanticObject.getRecord());
		feeder.accept(grammarAccess.getAccessExprAccess().getFieldFieldIDTerminalRuleCall_1_0_1_0_1(), semanticObject.getField());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (record=AccessExpr_RecordUpdateExpr_1_1_0_0_0 field=[Field|ID] value=Expr)
	 */
	protected void sequence_AccessExpr(EObject context, RecordUpdateExpr semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, JkindPackage.Literals.RECORD_UPDATE_EXPR__RECORD) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, JkindPackage.Literals.RECORD_UPDATE_EXPR__RECORD));
			if(transientValues.isValueTransient(semanticObject, JkindPackage.Literals.RECORD_UPDATE_EXPR__FIELD) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, JkindPackage.Literals.RECORD_UPDATE_EXPR__FIELD));
			if(transientValues.isValueTransient(semanticObject, JkindPackage.Literals.RECORD_UPDATE_EXPR__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, JkindPackage.Literals.RECORD_UPDATE_EXPR__VALUE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getAccessExprAccess().getRecordUpdateExprRecordAction_1_1_0_0_0(), semanticObject.getRecord());
		feeder.accept(grammarAccess.getAccessExprAccess().getFieldFieldIDTerminalRuleCall_1_1_0_0_2_0_1(), semanticObject.getField());
		feeder.accept(grammarAccess.getAccessExprAccess().getValueExprParserRuleCall_1_1_1_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         (left=PlusExpr_BinaryExpr_1_0_0_0 (op='+' | op='-') right=TimesExpr) | 
	 *         (left=TimesExpr_BinaryExpr_1_0_0_0 (op='*' | op='/' | op='div' | op='mod') right=PrefixExpr) | 
	 *         (
	 *             left=RelationalExpr_BinaryExpr_1_0_0_0 
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
	 *         (left=AndExpr_BinaryExpr_1_0_0_0 op='and' right=RelationalExpr) | 
	 *         (left=OrExpr_BinaryExpr_1_0_0_0 (op='or' | op='xor') right=AndExpr) | 
	 *         (left=ImpliesExpr_BinaryExpr_1_0_0_0 op='=>' right=ImpliesExpr) | 
	 *         (left=ArrowExpr_BinaryExpr_1_0_0_0 op='->' right=ArrowExpr)
	 *     )
	 */
	protected void sequence_AndExpr_ArrowExpr_ImpliesExpr_OrExpr_PlusExpr_RelationalExpr_TimesExpr(EObject context, BinaryExpr semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (base=ArrayType_ArrayType_1_0 size=INT)
	 */
	protected void sequence_ArrayType(EObject context, ArrayType semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, JkindPackage.Literals.ARRAY_TYPE__BASE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, JkindPackage.Literals.ARRAY_TYPE__BASE));
			if(transientValues.isValueTransient(semanticObject, JkindPackage.Literals.ARRAY_TYPE__SIZE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, JkindPackage.Literals.ARRAY_TYPE__SIZE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getArrayTypeAccess().getArrayTypeBaseAction_1_0(), semanticObject.getBase());
		feeder.accept(grammarAccess.getArrayTypeAccess().getSizeINTTerminalRuleCall_1_2_0(), semanticObject.getSize());
		feeder.finish();
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
	 *     (exprs+=Expr exprs+=Expr*)
	 */
	protected void sequence_AtomicExpr(EObject context, ArrayExpr semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
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
		feeder.accept(grammarAccess.getAtomicExprAccess().getValBOOLParserRuleCall_3_1_0(), semanticObject.getVal());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     ((op='real' | op='floor') expr=Expr)
	 */
	protected void sequence_AtomicExpr(EObject context, CastExpr semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (clock=Expr call=NodeCallExpr args+=Expr*)
	 */
	protected void sequence_AtomicExpr(EObject context, CondactExpr semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
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
	 *     (type=[RecordType|ID] fields+=[Field|ID] exprs+=Expr (fields+=[Field|ID] exprs+=Expr)*)
	 */
	protected void sequence_AtomicExpr(EObject context, RecordExpr semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (exprs+=AtomicExpr_TupleExpr_10_2_0 exprs+=Expr+)
	 */
	protected void sequence_AtomicExpr(EObject context, TupleExpr semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     {BoolType}
	 */
	protected void sequence_AtomicType(EObject context, BoolType semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     {IntType}
	 */
	protected void sequence_AtomicType(EObject context, IntType semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     {RealType}
	 */
	protected void sequence_AtomicType(EObject context, RealType semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (low=Bound high=Bound)
	 */
	protected void sequence_AtomicType(EObject context, SubrangeType semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, JkindPackage.Literals.SUBRANGE_TYPE__LOW) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, JkindPackage.Literals.SUBRANGE_TYPE__LOW));
			if(transientValues.isValueTransient(semanticObject, JkindPackage.Literals.SUBRANGE_TYPE__HIGH) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, JkindPackage.Literals.SUBRANGE_TYPE__HIGH));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getAtomicTypeAccess().getLowBoundParserRuleCall_3_3_0(), semanticObject.getLow());
		feeder.accept(grammarAccess.getAtomicTypeAccess().getHighBoundParserRuleCall_3_5_0(), semanticObject.getHigh());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     def=[TypeDef|ID]
	 */
	protected void sequence_AtomicType(EObject context, UserType semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, JkindPackage.Literals.USER_TYPE__DEF) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, JkindPackage.Literals.USER_TYPE__DEF));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getAtomicTypeAccess().getDefTypeDefIDTerminalRuleCall_4_1_0_1(), semanticObject.getDef());
		feeder.finish();
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
	 *     name=ID
	 */
	protected void sequence_EnumValue(EObject context, EnumValue semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, JkindPackage.Literals.ID_REF__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, JkindPackage.Literals.ID_REF__NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getEnumValueAccess().getNameIDTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     ((lhs+=[Variable|ID] lhs+=[Variable|ID]* rhs=Expr) | ((lhs+=[Variable|ID] lhs+=[Variable|ID]*)? rhs=Expr))
	 */
	protected void sequence_Equation(EObject context, Equation semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     name=ID
	 */
	protected void sequence_Field(EObject context, Field semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, JkindPackage.Literals.FIELD__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, JkindPackage.Literals.FIELD__NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getFieldAccess().getNameIDTerminalRuleCall_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (typedefs+=TypeDef | constants+=Constant | nodes+=Node)*
	 */
	protected void sequence_File(EObject context, File semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (node=[Node|ID] (args+=Expr args+=Expr*)?)
	 */
	protected void sequence_NodeCallExpr(EObject context, NodeCallExpr semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         name=ID 
	 *         (inputs+=VariableGroup inputs+=VariableGroup*)? 
	 *         (outputs+=VariableGroup outputs+=VariableGroup*)? 
	 *         locals+=VariableGroup* 
	 *         (equations+=Equation | assertions+=Assertion | properties+=Property | main+=Main)*
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
	 *     ref=[Variable|ID]
	 */
	protected void sequence_Property(EObject context, Property semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, JkindPackage.Literals.PROPERTY__REF) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, JkindPackage.Literals.PROPERTY__REF));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getPropertyAccess().getRefVariableIDTerminalRuleCall_1_0_1(), semanticObject.getRef());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID type=Type)
	 */
	protected void sequence_TypeDef(EObject context, AbbreviationType semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, JkindPackage.Literals.TYPE_DEF__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, JkindPackage.Literals.TYPE_DEF__NAME));
			if(transientValues.isValueTransient(semanticObject, JkindPackage.Literals.ABBREVIATION_TYPE__TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, JkindPackage.Literals.ABBREVIATION_TYPE__TYPE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getTypeDefAccess().getNameIDTerminalRuleCall_0_2_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getTypeDefAccess().getTypeTypeParserRuleCall_0_4_0(), semanticObject.getType());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID values+=EnumValue values+=EnumValue*)
	 */
	protected void sequence_TypeDef(EObject context, EnumType semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID fields+=Field types+=Type (fields+=Field types+=Type)*)
	 */
	protected void sequence_TypeDef(EObject context, RecordType semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (variables+=Variable variables+=Variable* type=Type)
	 */
	protected void sequence_VariableGroup(EObject context, VariableGroup semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     name=ID
	 */
	protected void sequence_Variable(EObject context, Variable semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, JkindPackage.Literals.ID_REF__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, JkindPackage.Literals.ID_REF__NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getVariableAccess().getNameIDTerminalRuleCall_0(), semanticObject.getName());
		feeder.finish();
	}
}
