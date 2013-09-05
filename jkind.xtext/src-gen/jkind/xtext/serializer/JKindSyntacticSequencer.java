package jkind.xtext.serializer;

import com.google.inject.Inject;
import java.util.List;
import jkind.xtext.services.JKindGrammarAccess;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.IGrammarAccess;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AbstractElementAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.TokenAlias;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynNavigable;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynTransition;
import org.eclipse.xtext.serializer.sequencer.AbstractSyntacticSequencer;

@SuppressWarnings("all")
public class JKindSyntacticSequencer extends AbstractSyntacticSequencer {

	protected JKindGrammarAccess grammarAccess;
	protected AbstractElementAlias match_AtomicExpr_LeftParenthesisKeyword_7_0_a;
	protected AbstractElementAlias match_AtomicExpr_LeftParenthesisKeyword_7_0_p;
	protected AbstractElementAlias match_Node_SemicolonKeyword_14_q;
	protected AbstractElementAlias match_Node_VarKeyword_10_0_q;
	
	@Inject
	protected void init(IGrammarAccess access) {
		grammarAccess = (JKindGrammarAccess) access;
		match_AtomicExpr_LeftParenthesisKeyword_7_0_a = new TokenAlias(true, true, grammarAccess.getAtomicExprAccess().getLeftParenthesisKeyword_7_0());
		match_AtomicExpr_LeftParenthesisKeyword_7_0_p = new TokenAlias(true, false, grammarAccess.getAtomicExprAccess().getLeftParenthesisKeyword_7_0());
		match_Node_SemicolonKeyword_14_q = new TokenAlias(false, true, grammarAccess.getNodeAccess().getSemicolonKeyword_14());
		match_Node_VarKeyword_10_0_q = new TokenAlias(false, true, grammarAccess.getNodeAccess().getVarKeyword_10_0());
	}
	
	@Override
	protected String getUnassignedRuleCallToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		return "";
	}
	
	
	@Override
	protected void emitUnassignedTokens(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		if (transition.getAmbiguousSyntaxes().isEmpty()) return;
		List<INode> transitionNodes = collectNodes(fromNode, toNode);
		for (AbstractElementAlias syntax : transition.getAmbiguousSyntaxes()) {
			List<INode> syntaxNodes = getNodesFor(transitionNodes, syntax);
			if(match_AtomicExpr_LeftParenthesisKeyword_7_0_a.equals(syntax))
				emit_AtomicExpr_LeftParenthesisKeyword_7_0_a(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_AtomicExpr_LeftParenthesisKeyword_7_0_p.equals(syntax))
				emit_AtomicExpr_LeftParenthesisKeyword_7_0_p(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Node_SemicolonKeyword_14_q.equals(syntax))
				emit_Node_SemicolonKeyword_14_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Node_VarKeyword_10_0_q.equals(syntax))
				emit_Node_VarKeyword_10_0_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else acceptNodes(getLastNavigableState(), syntaxNodes);
		}
	}

	/**
	 * Syntax:
	 *     '('*
	 */
	protected void emit_AtomicExpr_LeftParenthesisKeyword_7_0_a(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     '('+
	 */
	protected void emit_AtomicExpr_LeftParenthesisKeyword_7_0_p(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ';'?
	 */
	protected void emit_Node_SemicolonKeyword_14_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     'var'?
	 */
	protected void emit_Node_VarKeyword_10_0_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
}
