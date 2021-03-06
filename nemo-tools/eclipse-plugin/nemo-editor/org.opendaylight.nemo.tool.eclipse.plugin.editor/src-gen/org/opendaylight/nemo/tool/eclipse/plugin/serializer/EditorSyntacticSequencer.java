/*
 * generated by Xtext
 */
package org.opendaylight.nemo.tool.eclipse.plugin.serializer;

import com.google.inject.Inject;
import java.util.List;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.IGrammarAccess;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AbstractElementAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AlternativeAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.GroupAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.TokenAlias;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynNavigable;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynTransition;
import org.eclipse.xtext.serializer.sequencer.AbstractSyntacticSequencer;
import org.opendaylight.nemo.tool.eclipse.plugin.services.EditorGrammarAccess;

@SuppressWarnings("all")
public class EditorSyntacticSequencer extends AbstractSyntacticSequencer {

	protected EditorGrammarAccess grammarAccess;
	protected AbstractElementAlias match_ConnectionUpdate_DELETEKeyword_0_1_or_UPDATEKeyword_0_0;
	protected AbstractElementAlias match_ConnectionUpdate_PropertyParserRuleCall_5_q;
	protected AbstractElementAlias match_ConnectionUpdate___TypeKeyword_3_0_NemoIdTerminalRuleCall_3_1__q;
	protected AbstractElementAlias match_Connection_PropertyParserRuleCall_6_q;
	protected AbstractElementAlias match_FlowUpdate_DELETEKeyword_0_1_or_UPDATEKeyword_0_0;
	protected AbstractElementAlias match_FlowUpdate_MatchesParserRuleCall_3_q;
	protected AbstractElementAlias match_Flow_MatchesParserRuleCall_3_q;
	protected AbstractElementAlias match_NodeModel_ModelPropertyParserRuleCall_2_q;
	protected AbstractElementAlias match_NodeOperating_DELETEKeyword_0_1_or_UPDATEKeyword_0_0;
	protected AbstractElementAlias match_NodeOperating_PropertyParserRuleCall_5_q;
	protected AbstractElementAlias match_NodeOperating___TypeKeyword_3_0_NemoIdTerminalRuleCall_3_1__q;
	protected AbstractElementAlias match_Node_PropertyParserRuleCall_5_q;
	protected AbstractElementAlias match_Operation_ConditionParserRuleCall_6_q;
	protected AbstractElementAlias match_Sentence_SenEnginesParserRuleCall_0_or_UserParserRuleCall_1;
	
	@Inject
	protected void init(IGrammarAccess access) {
		grammarAccess = (EditorGrammarAccess) access;
		match_ConnectionUpdate_DELETEKeyword_0_1_or_UPDATEKeyword_0_0 = new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getConnectionUpdateAccess().getDELETEKeyword_0_1()), new TokenAlias(false, false, grammarAccess.getConnectionUpdateAccess().getUPDATEKeyword_0_0()));
		match_ConnectionUpdate_PropertyParserRuleCall_5_q = new TokenAlias(false, true, grammarAccess.getConnectionUpdateAccess().getPropertyParserRuleCall_5());
		match_ConnectionUpdate___TypeKeyword_3_0_NemoIdTerminalRuleCall_3_1__q = new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getConnectionUpdateAccess().getTypeKeyword_3_0()), new TokenAlias(false, false, grammarAccess.getConnectionUpdateAccess().getNemoIdTerminalRuleCall_3_1()));
		match_Connection_PropertyParserRuleCall_6_q = new TokenAlias(false, true, grammarAccess.getConnectionAccess().getPropertyParserRuleCall_6());
		match_FlowUpdate_DELETEKeyword_0_1_or_UPDATEKeyword_0_0 = new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getFlowUpdateAccess().getDELETEKeyword_0_1()), new TokenAlias(false, false, grammarAccess.getFlowUpdateAccess().getUPDATEKeyword_0_0()));
		match_FlowUpdate_MatchesParserRuleCall_3_q = new TokenAlias(false, true, grammarAccess.getFlowUpdateAccess().getMatchesParserRuleCall_3());
		match_Flow_MatchesParserRuleCall_3_q = new TokenAlias(false, true, grammarAccess.getFlowAccess().getMatchesParserRuleCall_3());
		match_NodeModel_ModelPropertyParserRuleCall_2_q = new TokenAlias(false, true, grammarAccess.getNodeModelAccess().getModelPropertyParserRuleCall_2());
		match_NodeOperating_DELETEKeyword_0_1_or_UPDATEKeyword_0_0 = new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getNodeOperatingAccess().getDELETEKeyword_0_1()), new TokenAlias(false, false, grammarAccess.getNodeOperatingAccess().getUPDATEKeyword_0_0()));
		match_NodeOperating_PropertyParserRuleCall_5_q = new TokenAlias(false, true, grammarAccess.getNodeOperatingAccess().getPropertyParserRuleCall_5());
		match_NodeOperating___TypeKeyword_3_0_NemoIdTerminalRuleCall_3_1__q = new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getNodeOperatingAccess().getTypeKeyword_3_0()), new TokenAlias(false, false, grammarAccess.getNodeOperatingAccess().getNemoIdTerminalRuleCall_3_1()));
		match_Node_PropertyParserRuleCall_5_q = new TokenAlias(false, true, grammarAccess.getNodeAccess().getPropertyParserRuleCall_5());
		match_Operation_ConditionParserRuleCall_6_q = new TokenAlias(false, true, grammarAccess.getOperationAccess().getConditionParserRuleCall_6());
		match_Sentence_SenEnginesParserRuleCall_0_or_UserParserRuleCall_1 = new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getSentenceAccess().getSenEnginesParserRuleCall_0()), new TokenAlias(false, false, grammarAccess.getSentenceAccess().getUserParserRuleCall_1()));
	}
	
	@Override
	protected String getUnassignedRuleCallToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if(ruleCall.getRule() == grammarAccess.getConditionRule())
			return getConditionToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getMatchesRule())
			return getMatchesToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getModelPropertyRule())
			return getModelPropertyToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getNemoIdRule())
			return getNemoIdToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getNewObjRule())
			return getNewObjToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getPropertyRule())
			return getPropertyToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getSenEnginesRule())
			return getSenEnginesToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getUserRule())
			return getUserToken(semanticObject, ruleCall, node);
		return "";
	}
	
	/**
	 * Condition: 'Condition' STRING(','STRING)*;
	 */
	protected String getConditionToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "Condition\"\"";
	}
	
	/**
	 * Matches:   'Match'   Match (',' Match)*;
	 */
	protected String getMatchesToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "Match:\"\"";
	}
	
	/**
	 * ModelProperty: 'Property' OneModelProperty (',' OneModelProperty)*;
	 */
	protected String getModelPropertyToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "Property\"\":";
	}
	
	/**
	 * terminal NemoId: ('a'..'z'|'A'..'Z'|'$'|'_') ('a'..'z'|'A'..'Z'|'$'|'_'|'-'|'0'..'9')*;
	 */
	protected String getNemoIdToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "";
	}
	
	/**
	 * NewObj:'CREATE'|'IMPORT';
	 */
	protected String getNewObjToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "CREATE";
	}
	
	/**
	 * Property: 'Property ' OneProperty(',' OneProperty)*;
	 */
	protected String getPropertyToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "Property :\"\"";
	}
	
	/**
	 * SenEngines:
	 * 	'Engines:' Ipv4 (',' Ipv4)* ';';
	 */
	protected String getSenEnginesToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "Engines:...;";
	}
	
	/**
	 * User:'CREATE'  (STRING) (STRING) (STRING)   ';' ;
	 */
	protected String getUserToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "CREATE\"\";";
	}
	
	@Override
	protected void emitUnassignedTokens(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		if (transition.getAmbiguousSyntaxes().isEmpty()) return;
		List<INode> transitionNodes = collectNodes(fromNode, toNode);
		for (AbstractElementAlias syntax : transition.getAmbiguousSyntaxes()) {
			List<INode> syntaxNodes = getNodesFor(transitionNodes, syntax);
			if(match_ConnectionUpdate_DELETEKeyword_0_1_or_UPDATEKeyword_0_0.equals(syntax))
				emit_ConnectionUpdate_DELETEKeyword_0_1_or_UPDATEKeyword_0_0(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_ConnectionUpdate_PropertyParserRuleCall_5_q.equals(syntax))
				emit_ConnectionUpdate_PropertyParserRuleCall_5_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_ConnectionUpdate___TypeKeyword_3_0_NemoIdTerminalRuleCall_3_1__q.equals(syntax))
				emit_ConnectionUpdate___TypeKeyword_3_0_NemoIdTerminalRuleCall_3_1__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Connection_PropertyParserRuleCall_6_q.equals(syntax))
				emit_Connection_PropertyParserRuleCall_6_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_FlowUpdate_DELETEKeyword_0_1_or_UPDATEKeyword_0_0.equals(syntax))
				emit_FlowUpdate_DELETEKeyword_0_1_or_UPDATEKeyword_0_0(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_FlowUpdate_MatchesParserRuleCall_3_q.equals(syntax))
				emit_FlowUpdate_MatchesParserRuleCall_3_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Flow_MatchesParserRuleCall_3_q.equals(syntax))
				emit_Flow_MatchesParserRuleCall_3_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_NodeModel_ModelPropertyParserRuleCall_2_q.equals(syntax))
				emit_NodeModel_ModelPropertyParserRuleCall_2_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_NodeOperating_DELETEKeyword_0_1_or_UPDATEKeyword_0_0.equals(syntax))
				emit_NodeOperating_DELETEKeyword_0_1_or_UPDATEKeyword_0_0(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_NodeOperating_PropertyParserRuleCall_5_q.equals(syntax))
				emit_NodeOperating_PropertyParserRuleCall_5_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_NodeOperating___TypeKeyword_3_0_NemoIdTerminalRuleCall_3_1__q.equals(syntax))
				emit_NodeOperating___TypeKeyword_3_0_NemoIdTerminalRuleCall_3_1__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Node_PropertyParserRuleCall_5_q.equals(syntax))
				emit_Node_PropertyParserRuleCall_5_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Operation_ConditionParserRuleCall_6_q.equals(syntax))
				emit_Operation_ConditionParserRuleCall_6_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Sentence_SenEnginesParserRuleCall_0_or_UserParserRuleCall_1.equals(syntax))
				emit_Sentence_SenEnginesParserRuleCall_0_or_UserParserRuleCall_1(semanticObject, getLastNavigableState(), syntaxNodes);
			else acceptNodes(getLastNavigableState(), syntaxNodes);
		}
	}

	/**
	 * Ambiguous syntax:
	 *     'UPDATE' | 'DELETE'
	 *
	 * This ambiguous syntax occurs at:
	 *     (rule start) (ambiguity) 'Connection' connectionname+=[Connection|NemoId]
	 */
	protected void emit_ConnectionUpdate_DELETEKeyword_0_1_or_UPDATEKeyword_0_0(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     Property?
	 *
	 * This ambiguous syntax occurs at:
	 *     connectionname+=[Connection|NemoId] ('Type' NemoId)? (ambiguity) ';' (rule end)
	 *     endnode+=[Node|NemoId] (ambiguity) ';' (rule end)
	 */
	protected void emit_ConnectionUpdate_PropertyParserRuleCall_5_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     ('Type' NemoId)?
	 *
	 * This ambiguous syntax occurs at:
	 *     connectionname+=[Connection|NemoId] (ambiguity) 'Endnodes' endnode+=[Node|NemoId]
	 *     connectionname+=[Connection|NemoId] (ambiguity) Property? ';' (rule end)
	 */
	protected void emit_ConnectionUpdate___TypeKeyword_3_0_NemoIdTerminalRuleCall_3_1__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     Property?
	 *
	 * This ambiguous syntax occurs at:
	 *     endnode+=[Node|NemoId] (ambiguity) ';' (rule end)
	 */
	protected void emit_Connection_PropertyParserRuleCall_6_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     'UPDATE' | 'DELETE'
	 *
	 * This ambiguous syntax occurs at:
	 *     (rule start) (ambiguity) 'Flow' flowId+=[Flow|NemoId]
	 */
	protected void emit_FlowUpdate_DELETEKeyword_0_1_or_UPDATEKeyword_0_0(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     Matches?
	 *
	 * This ambiguous syntax occurs at:
	 *     flowId+=[Flow|NemoId] (ambiguity) ';' (rule end)
	 */
	protected void emit_FlowUpdate_MatchesParserRuleCall_3_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     Matches?
	 *
	 * This ambiguous syntax occurs at:
	 *     name=NemoId (ambiguity) ';' (rule end)
	 */
	protected void emit_Flow_MatchesParserRuleCall_3_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     ModelProperty?
	 *
	 * This ambiguous syntax occurs at:
	 *     name=NemoId (ambiguity) (rule end)
	 */
	protected void emit_NodeModel_ModelPropertyParserRuleCall_2_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     'UPDATE' | 'DELETE'
	 *
	 * This ambiguous syntax occurs at:
	 *     (rule start) (ambiguity) 'Node' nodename+=[Node|NemoId]
	 */
	protected void emit_NodeOperating_DELETEKeyword_0_1_or_UPDATEKeyword_0_0(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     Property?
	 *
	 * This ambiguous syntax occurs at:
	 *     nodename+=[Node|NemoId] ('Type' NemoId)? (ambiguity) ';' (rule end)
	 *     nodes+=[Node|NemoId] (ambiguity) ';' (rule end)
	 */
	protected void emit_NodeOperating_PropertyParserRuleCall_5_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     ('Type' NemoId)?
	 *
	 * This ambiguous syntax occurs at:
	 *     nodename+=[Node|NemoId] (ambiguity) 'Contain' nodes+=[Node|NemoId]
	 *     nodename+=[Node|NemoId] (ambiguity) Property? ';' (rule end)
	 */
	protected void emit_NodeOperating___TypeKeyword_3_0_NemoIdTerminalRuleCall_3_1__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     Property?
	 *
	 * This ambiguous syntax occurs at:
	 *     name=NemoId 'Type' NemoId (ambiguity) ';' (rule end)
	 *     nodes+=[Node|NemoId] (ambiguity) ';' (rule end)
	 */
	protected void emit_Node_PropertyParserRuleCall_5_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     Condition?
	 *
	 * This ambiguous syntax occurs at:
	 *     targetId=[Flow|NemoId] (ambiguity) 'Action' NemoId ':' targetNode=[Node|NemoId]
	 *     targetId=[Flow|NemoId] (ambiguity) 'Action' NemoId ';' (rule end)
	 */
	protected void emit_Operation_ConditionParserRuleCall_6_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     SenEngines | User
	 *
	 * This ambiguous syntax occurs at:
	 *     (rule start) (ambiguity) (rule start)
	 */
	protected void emit_Sentence_SenEnginesParserRuleCall_0_or_UserParserRuleCall_1(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
}
