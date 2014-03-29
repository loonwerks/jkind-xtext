package jkind.xtext.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import jkind.xtext.services.JKindGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalJKindParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_WS", "RULE_SL_COMMENT", "RULE_ML_COMMENT", "RULE_ANY_OTHER", "'type'", "'='", "';'", "'struct'", "'{'", "':'", "'}'", "'int'", "'bool'", "'real'", "'subrange'", "'['", "','", "']'", "'of'", "'-'", "'const'", "'node'", "'('", "')'", "'returns'", "'var'", "'let'", "'tel'", "'--%PROPERTY'", "'--%MAIN'", "'assert'", "'->'", "'=>'", "'or'", "'xor'", "'and'", "'<'", "'<='", "'>'", "'>='", "'<>'", "'+'", "'*'", "'/'", "'div'", "'mod'", "'not'", "'pre'", "'.'", "'if'", "'then'", "'else'", "'floor'", "'condact'", "'true'", "'false'"
    };
    public static final int RULE_ID=4;
    public static final int T__29=29;
    public static final int T__28=28;
    public static final int T__27=27;
    public static final int T__26=26;
    public static final int T__25=25;
    public static final int T__24=24;
    public static final int T__23=23;
    public static final int T__22=22;
    public static final int RULE_ANY_OTHER=9;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int T__61=61;
    public static final int T__60=60;
    public static final int EOF=-1;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int T__19=19;
    public static final int T__57=57;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__16=16;
    public static final int T__52=52;
    public static final int T__15=15;
    public static final int T__53=53;
    public static final int T__18=18;
    public static final int T__54=54;
    public static final int T__17=17;
    public static final int T__12=12;
    public static final int T__11=11;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int T__59=59;
    public static final int T__10=10;
    public static final int RULE_INT=5;
    public static final int T__50=50;
    public static final int T__42=42;
    public static final int T__43=43;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int RULE_SL_COMMENT=7;
    public static final int RULE_ML_COMMENT=8;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int RULE_WS=6;

    // delegates
    // delegators


        public InternalJKindParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalJKindParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalJKindParser.tokenNames; }
    public String getGrammarFileName() { return "../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g"; }



     	private JKindGrammarAccess grammarAccess;
     	
        public InternalJKindParser(TokenStream input, JKindGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "File";	
       	}
       	
       	@Override
       	protected JKindGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleFile"
    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:67:1: entryRuleFile returns [EObject current=null] : iv_ruleFile= ruleFile EOF ;
    public final EObject entryRuleFile() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFile = null;


        try {
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:68:2: (iv_ruleFile= ruleFile EOF )
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:69:2: iv_ruleFile= ruleFile EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFileRule()); 
            }
            pushFollow(FOLLOW_ruleFile_in_entryRuleFile75);
            iv_ruleFile=ruleFile();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFile; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleFile85); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFile"


    // $ANTLR start "ruleFile"
    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:76:1: ruleFile returns [EObject current=null] : ( ( (lv_typedefs_0_0= ruleTypedef ) ) | ( (lv_constants_1_0= ruleConstant ) ) | ( (lv_nodes_2_0= ruleNode ) ) )* ;
    public final EObject ruleFile() throws RecognitionException {
        EObject current = null;

        EObject lv_typedefs_0_0 = null;

        EObject lv_constants_1_0 = null;

        EObject lv_nodes_2_0 = null;


         enterRule(); 
            
        try {
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:79:28: ( ( ( (lv_typedefs_0_0= ruleTypedef ) ) | ( (lv_constants_1_0= ruleConstant ) ) | ( (lv_nodes_2_0= ruleNode ) ) )* )
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:80:1: ( ( (lv_typedefs_0_0= ruleTypedef ) ) | ( (lv_constants_1_0= ruleConstant ) ) | ( (lv_nodes_2_0= ruleNode ) ) )*
            {
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:80:1: ( ( (lv_typedefs_0_0= ruleTypedef ) ) | ( (lv_constants_1_0= ruleConstant ) ) | ( (lv_nodes_2_0= ruleNode ) ) )*
            loop1:
            do {
                int alt1=4;
                switch ( input.LA(1) ) {
                case 10:
                    {
                    alt1=1;
                    }
                    break;
                case 26:
                    {
                    alt1=2;
                    }
                    break;
                case 27:
                    {
                    alt1=3;
                    }
                    break;

                }

                switch (alt1) {
            	case 1 :
            	    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:80:2: ( (lv_typedefs_0_0= ruleTypedef ) )
            	    {
            	    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:80:2: ( (lv_typedefs_0_0= ruleTypedef ) )
            	    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:81:1: (lv_typedefs_0_0= ruleTypedef )
            	    {
            	    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:81:1: (lv_typedefs_0_0= ruleTypedef )
            	    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:82:3: lv_typedefs_0_0= ruleTypedef
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getFileAccess().getTypedefsTypedefParserRuleCall_0_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleTypedef_in_ruleFile131);
            	    lv_typedefs_0_0=ruleTypedef();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getFileRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"typedefs",
            	              		lv_typedefs_0_0, 
            	              		"Typedef");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:99:6: ( (lv_constants_1_0= ruleConstant ) )
            	    {
            	    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:99:6: ( (lv_constants_1_0= ruleConstant ) )
            	    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:100:1: (lv_constants_1_0= ruleConstant )
            	    {
            	    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:100:1: (lv_constants_1_0= ruleConstant )
            	    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:101:3: lv_constants_1_0= ruleConstant
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getFileAccess().getConstantsConstantParserRuleCall_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleConstant_in_ruleFile158);
            	    lv_constants_1_0=ruleConstant();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getFileRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"constants",
            	              		lv_constants_1_0, 
            	              		"Constant");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:118:6: ( (lv_nodes_2_0= ruleNode ) )
            	    {
            	    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:118:6: ( (lv_nodes_2_0= ruleNode ) )
            	    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:119:1: (lv_nodes_2_0= ruleNode )
            	    {
            	    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:119:1: (lv_nodes_2_0= ruleNode )
            	    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:120:3: lv_nodes_2_0= ruleNode
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getFileAccess().getNodesNodeParserRuleCall_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleNode_in_ruleFile185);
            	    lv_nodes_2_0=ruleNode();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getFileRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"nodes",
            	              		lv_nodes_2_0, 
            	              		"Node");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFile"


    // $ANTLR start "entryRuleTypedef"
    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:144:1: entryRuleTypedef returns [EObject current=null] : iv_ruleTypedef= ruleTypedef EOF ;
    public final EObject entryRuleTypedef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypedef = null;


        try {
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:145:2: (iv_ruleTypedef= ruleTypedef EOF )
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:146:2: iv_ruleTypedef= ruleTypedef EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTypedefRule()); 
            }
            pushFollow(FOLLOW_ruleTypedef_in_entryRuleTypedef222);
            iv_ruleTypedef=ruleTypedef();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTypedef; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleTypedef232); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTypedef"


    // $ANTLR start "ruleTypedef"
    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:153:1: ruleTypedef returns [EObject current=null] : ( ( () otherlv_1= 'type' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '=' ( (lv_type_4_0= ruleType ) ) otherlv_5= ';' ) | ( () otherlv_7= 'type' ( (lv_name_8_0= RULE_ID ) ) otherlv_9= '=' otherlv_10= 'struct' otherlv_11= '{' ( (lv_fields_12_0= ruleField ) ) otherlv_13= ':' ( (lv_types_14_0= ruleType ) ) (otherlv_15= ';' ( (lv_fields_16_0= ruleField ) ) otherlv_17= ':' ( (lv_types_18_0= ruleType ) ) )* otherlv_19= '}' otherlv_20= ';' ) ) ;
    public final EObject ruleTypedef() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token lv_name_8_0=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_17=null;
        Token otherlv_19=null;
        Token otherlv_20=null;
        EObject lv_type_4_0 = null;

        EObject lv_fields_12_0 = null;

        EObject lv_types_14_0 = null;

        EObject lv_fields_16_0 = null;

        EObject lv_types_18_0 = null;


         enterRule(); 
            
        try {
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:156:28: ( ( ( () otherlv_1= 'type' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '=' ( (lv_type_4_0= ruleType ) ) otherlv_5= ';' ) | ( () otherlv_7= 'type' ( (lv_name_8_0= RULE_ID ) ) otherlv_9= '=' otherlv_10= 'struct' otherlv_11= '{' ( (lv_fields_12_0= ruleField ) ) otherlv_13= ':' ( (lv_types_14_0= ruleType ) ) (otherlv_15= ';' ( (lv_fields_16_0= ruleField ) ) otherlv_17= ':' ( (lv_types_18_0= ruleType ) ) )* otherlv_19= '}' otherlv_20= ';' ) ) )
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:157:1: ( ( () otherlv_1= 'type' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '=' ( (lv_type_4_0= ruleType ) ) otherlv_5= ';' ) | ( () otherlv_7= 'type' ( (lv_name_8_0= RULE_ID ) ) otherlv_9= '=' otherlv_10= 'struct' otherlv_11= '{' ( (lv_fields_12_0= ruleField ) ) otherlv_13= ':' ( (lv_types_14_0= ruleType ) ) (otherlv_15= ';' ( (lv_fields_16_0= ruleField ) ) otherlv_17= ':' ( (lv_types_18_0= ruleType ) ) )* otherlv_19= '}' otherlv_20= ';' ) )
            {
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:157:1: ( ( () otherlv_1= 'type' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '=' ( (lv_type_4_0= ruleType ) ) otherlv_5= ';' ) | ( () otherlv_7= 'type' ( (lv_name_8_0= RULE_ID ) ) otherlv_9= '=' otherlv_10= 'struct' otherlv_11= '{' ( (lv_fields_12_0= ruleField ) ) otherlv_13= ':' ( (lv_types_14_0= ruleType ) ) (otherlv_15= ';' ( (lv_fields_16_0= ruleField ) ) otherlv_17= ':' ( (lv_types_18_0= ruleType ) ) )* otherlv_19= '}' otherlv_20= ';' ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==10) ) {
                int LA3_1 = input.LA(2);

                if ( (LA3_1==RULE_ID) ) {
                    int LA3_2 = input.LA(3);

                    if ( (LA3_2==11) ) {
                        int LA3_3 = input.LA(4);

                        if ( (LA3_3==13) ) {
                            alt3=2;
                        }
                        else if ( (LA3_3==RULE_ID||(LA3_3>=17 && LA3_3<=20)) ) {
                            alt3=1;
                        }
                        else {
                            if (state.backtracking>0) {state.failed=true; return current;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 3, 3, input);

                            throw nvae;
                        }
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 3, 2, input);

                        throw nvae;
                    }
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 3, 1, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:157:2: ( () otherlv_1= 'type' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '=' ( (lv_type_4_0= ruleType ) ) otherlv_5= ';' )
                    {
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:157:2: ( () otherlv_1= 'type' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '=' ( (lv_type_4_0= ruleType ) ) otherlv_5= ';' )
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:157:3: () otherlv_1= 'type' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '=' ( (lv_type_4_0= ruleType ) ) otherlv_5= ';'
                    {
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:157:3: ()
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:158:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getTypedefAccess().getAbbreviationTypeAction_0_0(),
                                  current);
                          
                    }

                    }

                    otherlv_1=(Token)match(input,10,FOLLOW_10_in_ruleTypedef279); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getTypedefAccess().getTypeKeyword_0_1());
                          
                    }
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:167:1: ( (lv_name_2_0= RULE_ID ) )
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:168:1: (lv_name_2_0= RULE_ID )
                    {
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:168:1: (lv_name_2_0= RULE_ID )
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:169:3: lv_name_2_0= RULE_ID
                    {
                    lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleTypedef296); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_name_2_0, grammarAccess.getTypedefAccess().getNameIDTerminalRuleCall_0_2_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getTypedefRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"name",
                              		lv_name_2_0, 
                              		"ID");
                      	    
                    }

                    }


                    }

                    otherlv_3=(Token)match(input,11,FOLLOW_11_in_ruleTypedef313); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getTypedefAccess().getEqualsSignKeyword_0_3());
                          
                    }
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:189:1: ( (lv_type_4_0= ruleType ) )
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:190:1: (lv_type_4_0= ruleType )
                    {
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:190:1: (lv_type_4_0= ruleType )
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:191:3: lv_type_4_0= ruleType
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getTypedefAccess().getTypeTypeParserRuleCall_0_4_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleType_in_ruleTypedef334);
                    lv_type_4_0=ruleType();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getTypedefRule());
                      	        }
                             		set(
                             			current, 
                             			"type",
                              		lv_type_4_0, 
                              		"Type");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    otherlv_5=(Token)match(input,12,FOLLOW_12_in_ruleTypedef346); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_5, grammarAccess.getTypedefAccess().getSemicolonKeyword_0_5());
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:212:6: ( () otherlv_7= 'type' ( (lv_name_8_0= RULE_ID ) ) otherlv_9= '=' otherlv_10= 'struct' otherlv_11= '{' ( (lv_fields_12_0= ruleField ) ) otherlv_13= ':' ( (lv_types_14_0= ruleType ) ) (otherlv_15= ';' ( (lv_fields_16_0= ruleField ) ) otherlv_17= ':' ( (lv_types_18_0= ruleType ) ) )* otherlv_19= '}' otherlv_20= ';' )
                    {
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:212:6: ( () otherlv_7= 'type' ( (lv_name_8_0= RULE_ID ) ) otherlv_9= '=' otherlv_10= 'struct' otherlv_11= '{' ( (lv_fields_12_0= ruleField ) ) otherlv_13= ':' ( (lv_types_14_0= ruleType ) ) (otherlv_15= ';' ( (lv_fields_16_0= ruleField ) ) otherlv_17= ':' ( (lv_types_18_0= ruleType ) ) )* otherlv_19= '}' otherlv_20= ';' )
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:212:7: () otherlv_7= 'type' ( (lv_name_8_0= RULE_ID ) ) otherlv_9= '=' otherlv_10= 'struct' otherlv_11= '{' ( (lv_fields_12_0= ruleField ) ) otherlv_13= ':' ( (lv_types_14_0= ruleType ) ) (otherlv_15= ';' ( (lv_fields_16_0= ruleField ) ) otherlv_17= ':' ( (lv_types_18_0= ruleType ) ) )* otherlv_19= '}' otherlv_20= ';'
                    {
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:212:7: ()
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:213:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getTypedefAccess().getRecordTypeAction_1_0(),
                                  current);
                          
                    }

                    }

                    otherlv_7=(Token)match(input,10,FOLLOW_10_in_ruleTypedef375); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_7, grammarAccess.getTypedefAccess().getTypeKeyword_1_1());
                          
                    }
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:222:1: ( (lv_name_8_0= RULE_ID ) )
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:223:1: (lv_name_8_0= RULE_ID )
                    {
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:223:1: (lv_name_8_0= RULE_ID )
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:224:3: lv_name_8_0= RULE_ID
                    {
                    lv_name_8_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleTypedef392); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_name_8_0, grammarAccess.getTypedefAccess().getNameIDTerminalRuleCall_1_2_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getTypedefRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"name",
                              		lv_name_8_0, 
                              		"ID");
                      	    
                    }

                    }


                    }

                    otherlv_9=(Token)match(input,11,FOLLOW_11_in_ruleTypedef409); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_9, grammarAccess.getTypedefAccess().getEqualsSignKeyword_1_3());
                          
                    }
                    otherlv_10=(Token)match(input,13,FOLLOW_13_in_ruleTypedef421); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_10, grammarAccess.getTypedefAccess().getStructKeyword_1_4());
                          
                    }
                    otherlv_11=(Token)match(input,14,FOLLOW_14_in_ruleTypedef433); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_11, grammarAccess.getTypedefAccess().getLeftCurlyBracketKeyword_1_5());
                          
                    }
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:252:1: ( (lv_fields_12_0= ruleField ) )
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:253:1: (lv_fields_12_0= ruleField )
                    {
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:253:1: (lv_fields_12_0= ruleField )
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:254:3: lv_fields_12_0= ruleField
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getTypedefAccess().getFieldsFieldParserRuleCall_1_6_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleField_in_ruleTypedef454);
                    lv_fields_12_0=ruleField();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getTypedefRule());
                      	        }
                             		add(
                             			current, 
                             			"fields",
                              		lv_fields_12_0, 
                              		"Field");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    otherlv_13=(Token)match(input,15,FOLLOW_15_in_ruleTypedef466); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_13, grammarAccess.getTypedefAccess().getColonKeyword_1_7());
                          
                    }
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:274:1: ( (lv_types_14_0= ruleType ) )
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:275:1: (lv_types_14_0= ruleType )
                    {
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:275:1: (lv_types_14_0= ruleType )
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:276:3: lv_types_14_0= ruleType
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getTypedefAccess().getTypesTypeParserRuleCall_1_8_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleType_in_ruleTypedef487);
                    lv_types_14_0=ruleType();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getTypedefRule());
                      	        }
                             		add(
                             			current, 
                             			"types",
                              		lv_types_14_0, 
                              		"Type");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:292:2: (otherlv_15= ';' ( (lv_fields_16_0= ruleField ) ) otherlv_17= ':' ( (lv_types_18_0= ruleType ) ) )*
                    loop2:
                    do {
                        int alt2=2;
                        int LA2_0 = input.LA(1);

                        if ( (LA2_0==12) ) {
                            alt2=1;
                        }


                        switch (alt2) {
                    	case 1 :
                    	    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:292:4: otherlv_15= ';' ( (lv_fields_16_0= ruleField ) ) otherlv_17= ':' ( (lv_types_18_0= ruleType ) )
                    	    {
                    	    otherlv_15=(Token)match(input,12,FOLLOW_12_in_ruleTypedef500); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_15, grammarAccess.getTypedefAccess().getSemicolonKeyword_1_9_0());
                    	          
                    	    }
                    	    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:296:1: ( (lv_fields_16_0= ruleField ) )
                    	    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:297:1: (lv_fields_16_0= ruleField )
                    	    {
                    	    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:297:1: (lv_fields_16_0= ruleField )
                    	    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:298:3: lv_fields_16_0= ruleField
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getTypedefAccess().getFieldsFieldParserRuleCall_1_9_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleField_in_ruleTypedef521);
                    	    lv_fields_16_0=ruleField();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getTypedefRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"fields",
                    	              		lv_fields_16_0, 
                    	              		"Field");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }

                    	    otherlv_17=(Token)match(input,15,FOLLOW_15_in_ruleTypedef533); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_17, grammarAccess.getTypedefAccess().getColonKeyword_1_9_2());
                    	          
                    	    }
                    	    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:318:1: ( (lv_types_18_0= ruleType ) )
                    	    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:319:1: (lv_types_18_0= ruleType )
                    	    {
                    	    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:319:1: (lv_types_18_0= ruleType )
                    	    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:320:3: lv_types_18_0= ruleType
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getTypedefAccess().getTypesTypeParserRuleCall_1_9_3_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleType_in_ruleTypedef554);
                    	    lv_types_18_0=ruleType();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getTypedefRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"types",
                    	              		lv_types_18_0, 
                    	              		"Type");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop2;
                        }
                    } while (true);

                    otherlv_19=(Token)match(input,16,FOLLOW_16_in_ruleTypedef568); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_19, grammarAccess.getTypedefAccess().getRightCurlyBracketKeyword_1_10());
                          
                    }
                    otherlv_20=(Token)match(input,12,FOLLOW_12_in_ruleTypedef580); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_20, grammarAccess.getTypedefAccess().getSemicolonKeyword_1_11());
                          
                    }

                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTypedef"


    // $ANTLR start "entryRuleType"
    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:352:1: entryRuleType returns [EObject current=null] : iv_ruleType= ruleType EOF ;
    public final EObject entryRuleType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleType = null;


        try {
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:353:2: (iv_ruleType= ruleType EOF )
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:354:2: iv_ruleType= ruleType EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTypeRule()); 
            }
            pushFollow(FOLLOW_ruleType_in_entryRuleType617);
            iv_ruleType=ruleType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleType; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleType627); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleType"


    // $ANTLR start "ruleType"
    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:361:1: ruleType returns [EObject current=null] : ( ( () otherlv_1= 'int' ) | ( () otherlv_3= 'bool' ) | ( () otherlv_5= 'real' ) | ( () otherlv_7= 'subrange' otherlv_8= '[' ( (lv_low_9_0= ruleBound ) ) otherlv_10= ',' ( (lv_high_11_0= ruleBound ) ) otherlv_12= ']' otherlv_13= 'of' otherlv_14= 'int' ) | ( () ( (otherlv_16= RULE_ID ) ) ) ) ;
    public final EObject ruleType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token otherlv_16=null;
        AntlrDatatypeRuleToken lv_low_9_0 = null;

        AntlrDatatypeRuleToken lv_high_11_0 = null;


         enterRule(); 
            
        try {
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:364:28: ( ( ( () otherlv_1= 'int' ) | ( () otherlv_3= 'bool' ) | ( () otherlv_5= 'real' ) | ( () otherlv_7= 'subrange' otherlv_8= '[' ( (lv_low_9_0= ruleBound ) ) otherlv_10= ',' ( (lv_high_11_0= ruleBound ) ) otherlv_12= ']' otherlv_13= 'of' otherlv_14= 'int' ) | ( () ( (otherlv_16= RULE_ID ) ) ) ) )
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:365:1: ( ( () otherlv_1= 'int' ) | ( () otherlv_3= 'bool' ) | ( () otherlv_5= 'real' ) | ( () otherlv_7= 'subrange' otherlv_8= '[' ( (lv_low_9_0= ruleBound ) ) otherlv_10= ',' ( (lv_high_11_0= ruleBound ) ) otherlv_12= ']' otherlv_13= 'of' otherlv_14= 'int' ) | ( () ( (otherlv_16= RULE_ID ) ) ) )
            {
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:365:1: ( ( () otherlv_1= 'int' ) | ( () otherlv_3= 'bool' ) | ( () otherlv_5= 'real' ) | ( () otherlv_7= 'subrange' otherlv_8= '[' ( (lv_low_9_0= ruleBound ) ) otherlv_10= ',' ( (lv_high_11_0= ruleBound ) ) otherlv_12= ']' otherlv_13= 'of' otherlv_14= 'int' ) | ( () ( (otherlv_16= RULE_ID ) ) ) )
            int alt4=5;
            switch ( input.LA(1) ) {
            case 17:
                {
                alt4=1;
                }
                break;
            case 18:
                {
                alt4=2;
                }
                break;
            case 19:
                {
                alt4=3;
                }
                break;
            case 20:
                {
                alt4=4;
                }
                break;
            case RULE_ID:
                {
                alt4=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:365:2: ( () otherlv_1= 'int' )
                    {
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:365:2: ( () otherlv_1= 'int' )
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:365:3: () otherlv_1= 'int'
                    {
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:365:3: ()
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:366:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getTypeAccess().getIntTypeAction_0_0(),
                                  current);
                          
                    }

                    }

                    otherlv_1=(Token)match(input,17,FOLLOW_17_in_ruleType674); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getTypeAccess().getIntKeyword_0_1());
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:376:6: ( () otherlv_3= 'bool' )
                    {
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:376:6: ( () otherlv_3= 'bool' )
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:376:7: () otherlv_3= 'bool'
                    {
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:376:7: ()
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:377:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getTypeAccess().getBoolTypeAction_1_0(),
                                  current);
                          
                    }

                    }

                    otherlv_3=(Token)match(input,18,FOLLOW_18_in_ruleType703); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getTypeAccess().getBoolKeyword_1_1());
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:387:6: ( () otherlv_5= 'real' )
                    {
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:387:6: ( () otherlv_5= 'real' )
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:387:7: () otherlv_5= 'real'
                    {
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:387:7: ()
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:388:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getTypeAccess().getRealTypeAction_2_0(),
                                  current);
                          
                    }

                    }

                    otherlv_5=(Token)match(input,19,FOLLOW_19_in_ruleType732); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_5, grammarAccess.getTypeAccess().getRealKeyword_2_1());
                          
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:398:6: ( () otherlv_7= 'subrange' otherlv_8= '[' ( (lv_low_9_0= ruleBound ) ) otherlv_10= ',' ( (lv_high_11_0= ruleBound ) ) otherlv_12= ']' otherlv_13= 'of' otherlv_14= 'int' )
                    {
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:398:6: ( () otherlv_7= 'subrange' otherlv_8= '[' ( (lv_low_9_0= ruleBound ) ) otherlv_10= ',' ( (lv_high_11_0= ruleBound ) ) otherlv_12= ']' otherlv_13= 'of' otherlv_14= 'int' )
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:398:7: () otherlv_7= 'subrange' otherlv_8= '[' ( (lv_low_9_0= ruleBound ) ) otherlv_10= ',' ( (lv_high_11_0= ruleBound ) ) otherlv_12= ']' otherlv_13= 'of' otherlv_14= 'int'
                    {
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:398:7: ()
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:399:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getTypeAccess().getSubrangeTypeAction_3_0(),
                                  current);
                          
                    }

                    }

                    otherlv_7=(Token)match(input,20,FOLLOW_20_in_ruleType761); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_7, grammarAccess.getTypeAccess().getSubrangeKeyword_3_1());
                          
                    }
                    otherlv_8=(Token)match(input,21,FOLLOW_21_in_ruleType773); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_8, grammarAccess.getTypeAccess().getLeftSquareBracketKeyword_3_2());
                          
                    }
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:412:1: ( (lv_low_9_0= ruleBound ) )
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:413:1: (lv_low_9_0= ruleBound )
                    {
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:413:1: (lv_low_9_0= ruleBound )
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:414:3: lv_low_9_0= ruleBound
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getTypeAccess().getLowBoundParserRuleCall_3_3_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleBound_in_ruleType794);
                    lv_low_9_0=ruleBound();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getTypeRule());
                      	        }
                             		set(
                             			current, 
                             			"low",
                              		lv_low_9_0, 
                              		"Bound");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    otherlv_10=(Token)match(input,22,FOLLOW_22_in_ruleType806); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_10, grammarAccess.getTypeAccess().getCommaKeyword_3_4());
                          
                    }
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:434:1: ( (lv_high_11_0= ruleBound ) )
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:435:1: (lv_high_11_0= ruleBound )
                    {
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:435:1: (lv_high_11_0= ruleBound )
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:436:3: lv_high_11_0= ruleBound
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getTypeAccess().getHighBoundParserRuleCall_3_5_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleBound_in_ruleType827);
                    lv_high_11_0=ruleBound();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getTypeRule());
                      	        }
                             		set(
                             			current, 
                             			"high",
                              		lv_high_11_0, 
                              		"Bound");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    otherlv_12=(Token)match(input,23,FOLLOW_23_in_ruleType839); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_12, grammarAccess.getTypeAccess().getRightSquareBracketKeyword_3_6());
                          
                    }
                    otherlv_13=(Token)match(input,24,FOLLOW_24_in_ruleType851); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_13, grammarAccess.getTypeAccess().getOfKeyword_3_7());
                          
                    }
                    otherlv_14=(Token)match(input,17,FOLLOW_17_in_ruleType863); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_14, grammarAccess.getTypeAccess().getIntKeyword_3_8());
                          
                    }

                    }


                    }
                    break;
                case 5 :
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:465:6: ( () ( (otherlv_16= RULE_ID ) ) )
                    {
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:465:6: ( () ( (otherlv_16= RULE_ID ) ) )
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:465:7: () ( (otherlv_16= RULE_ID ) )
                    {
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:465:7: ()
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:466:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getTypeAccess().getUserTypeAction_4_0(),
                                  current);
                          
                    }

                    }

                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:471:2: ( (otherlv_16= RULE_ID ) )
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:472:1: (otherlv_16= RULE_ID )
                    {
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:472:1: (otherlv_16= RULE_ID )
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:473:3: otherlv_16= RULE_ID
                    {
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getTypeRule());
                      	        }
                              
                    }
                    otherlv_16=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleType900); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		newLeafNode(otherlv_16, grammarAccess.getTypeAccess().getDefTypedefCrossReference_4_1_0()); 
                      	
                    }

                    }


                    }


                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleType"


    // $ANTLR start "entryRuleField"
    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:492:1: entryRuleField returns [EObject current=null] : iv_ruleField= ruleField EOF ;
    public final EObject entryRuleField() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleField = null;


        try {
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:493:2: (iv_ruleField= ruleField EOF )
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:494:2: iv_ruleField= ruleField EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFieldRule()); 
            }
            pushFollow(FOLLOW_ruleField_in_entryRuleField937);
            iv_ruleField=ruleField();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleField; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleField947); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleField"


    // $ANTLR start "ruleField"
    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:501:1: ruleField returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleField() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;

         enterRule(); 
            
        try {
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:504:28: ( ( (lv_name_0_0= RULE_ID ) ) )
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:505:1: ( (lv_name_0_0= RULE_ID ) )
            {
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:505:1: ( (lv_name_0_0= RULE_ID ) )
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:506:1: (lv_name_0_0= RULE_ID )
            {
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:506:1: (lv_name_0_0= RULE_ID )
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:507:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleField988); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_0_0, grammarAccess.getFieldAccess().getNameIDTerminalRuleCall_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getFieldRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_0_0, 
                      		"ID");
              	    
            }

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleField"


    // $ANTLR start "entryRuleBound"
    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:531:1: entryRuleBound returns [String current=null] : iv_ruleBound= ruleBound EOF ;
    public final String entryRuleBound() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleBound = null;


        try {
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:532:2: (iv_ruleBound= ruleBound EOF )
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:533:2: iv_ruleBound= ruleBound EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBoundRule()); 
            }
            pushFollow(FOLLOW_ruleBound_in_entryRuleBound1029);
            iv_ruleBound=ruleBound();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBound.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleBound1040); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBound"


    // $ANTLR start "ruleBound"
    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:540:1: ruleBound returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? this_INT_1= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleBound() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;

         enterRule(); 
            
        try {
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:543:28: ( ( (kw= '-' )? this_INT_1= RULE_INT ) )
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:544:1: ( (kw= '-' )? this_INT_1= RULE_INT )
            {
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:544:1: ( (kw= '-' )? this_INT_1= RULE_INT )
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:544:2: (kw= '-' )? this_INT_1= RULE_INT
            {
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:544:2: (kw= '-' )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==25) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:545:2: kw= '-'
                    {
                    kw=(Token)match(input,25,FOLLOW_25_in_ruleBound1079); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getBoundAccess().getHyphenMinusKeyword_0()); 
                          
                    }

                    }
                    break;

            }

            this_INT_1=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleBound1096); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_INT_1);
                  
            }
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_INT_1, grammarAccess.getBoundAccess().getINTTerminalRuleCall_1()); 
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBound"


    // $ANTLR start "entryRuleConstant"
    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:565:1: entryRuleConstant returns [EObject current=null] : iv_ruleConstant= ruleConstant EOF ;
    public final EObject entryRuleConstant() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConstant = null;


        try {
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:566:2: (iv_ruleConstant= ruleConstant EOF )
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:567:2: iv_ruleConstant= ruleConstant EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getConstantRule()); 
            }
            pushFollow(FOLLOW_ruleConstant_in_entryRuleConstant1141);
            iv_ruleConstant=ruleConstant();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleConstant; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleConstant1151); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleConstant"


    // $ANTLR start "ruleConstant"
    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:574:1: ruleConstant returns [EObject current=null] : (otherlv_0= 'const' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= ':' ( (lv_type_3_0= ruleType ) ) )? otherlv_4= '=' ( (lv_expr_5_0= ruleExpr ) ) otherlv_6= ';' ) ;
    public final EObject ruleConstant() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_type_3_0 = null;

        EObject lv_expr_5_0 = null;


         enterRule(); 
            
        try {
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:577:28: ( (otherlv_0= 'const' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= ':' ( (lv_type_3_0= ruleType ) ) )? otherlv_4= '=' ( (lv_expr_5_0= ruleExpr ) ) otherlv_6= ';' ) )
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:578:1: (otherlv_0= 'const' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= ':' ( (lv_type_3_0= ruleType ) ) )? otherlv_4= '=' ( (lv_expr_5_0= ruleExpr ) ) otherlv_6= ';' )
            {
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:578:1: (otherlv_0= 'const' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= ':' ( (lv_type_3_0= ruleType ) ) )? otherlv_4= '=' ( (lv_expr_5_0= ruleExpr ) ) otherlv_6= ';' )
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:578:3: otherlv_0= 'const' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= ':' ( (lv_type_3_0= ruleType ) ) )? otherlv_4= '=' ( (lv_expr_5_0= ruleExpr ) ) otherlv_6= ';'
            {
            otherlv_0=(Token)match(input,26,FOLLOW_26_in_ruleConstant1188); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getConstantAccess().getConstKeyword_0());
                  
            }
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:582:1: ( (lv_name_1_0= RULE_ID ) )
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:583:1: (lv_name_1_0= RULE_ID )
            {
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:583:1: (lv_name_1_0= RULE_ID )
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:584:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleConstant1205); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_1_0, grammarAccess.getConstantAccess().getNameIDTerminalRuleCall_1_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getConstantRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_1_0, 
                      		"ID");
              	    
            }

            }


            }

            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:600:2: (otherlv_2= ':' ( (lv_type_3_0= ruleType ) ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==15) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:600:4: otherlv_2= ':' ( (lv_type_3_0= ruleType ) )
                    {
                    otherlv_2=(Token)match(input,15,FOLLOW_15_in_ruleConstant1223); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getConstantAccess().getColonKeyword_2_0());
                          
                    }
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:604:1: ( (lv_type_3_0= ruleType ) )
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:605:1: (lv_type_3_0= ruleType )
                    {
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:605:1: (lv_type_3_0= ruleType )
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:606:3: lv_type_3_0= ruleType
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getConstantAccess().getTypeTypeParserRuleCall_2_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleType_in_ruleConstant1244);
                    lv_type_3_0=ruleType();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getConstantRule());
                      	        }
                             		set(
                             			current, 
                             			"type",
                              		lv_type_3_0, 
                              		"Type");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,11,FOLLOW_11_in_ruleConstant1258); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getConstantAccess().getEqualsSignKeyword_3());
                  
            }
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:626:1: ( (lv_expr_5_0= ruleExpr ) )
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:627:1: (lv_expr_5_0= ruleExpr )
            {
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:627:1: (lv_expr_5_0= ruleExpr )
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:628:3: lv_expr_5_0= ruleExpr
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getConstantAccess().getExprExprParserRuleCall_4_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleExpr_in_ruleConstant1279);
            lv_expr_5_0=ruleExpr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getConstantRule());
              	        }
                     		set(
                     			current, 
                     			"expr",
                      		lv_expr_5_0, 
                      		"Expr");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_6=(Token)match(input,12,FOLLOW_12_in_ruleConstant1291); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_6, grammarAccess.getConstantAccess().getSemicolonKeyword_5());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleConstant"


    // $ANTLR start "entryRuleNode"
    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:656:1: entryRuleNode returns [EObject current=null] : iv_ruleNode= ruleNode EOF ;
    public final EObject entryRuleNode() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNode = null;


        try {
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:657:2: (iv_ruleNode= ruleNode EOF )
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:658:2: iv_ruleNode= ruleNode EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNodeRule()); 
            }
            pushFollow(FOLLOW_ruleNode_in_entryRuleNode1327);
            iv_ruleNode=ruleNode();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNode; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleNode1337); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleNode"


    // $ANTLR start "ruleNode"
    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:665:1: ruleNode returns [EObject current=null] : (otherlv_0= 'node' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( ( (lv_inputs_3_0= ruleVariableGroup ) ) (otherlv_4= ';' ( (lv_inputs_5_0= ruleVariableGroup ) ) )* )? otherlv_6= ')' otherlv_7= 'returns' otherlv_8= '(' ( ( (lv_outputs_9_0= ruleVariableGroup ) ) (otherlv_10= ';' ( (lv_outputs_11_0= ruleVariableGroup ) ) )* )? otherlv_12= ')' otherlv_13= ';' (otherlv_14= 'var' ( ( (lv_locals_15_0= ruleVariableGroup ) ) otherlv_16= ';' )* )? otherlv_17= 'let' ( ( (lv_equations_18_0= ruleEquation ) ) | ( (lv_assertions_19_0= ruleAssertion ) ) | ( (lv_properties_20_0= ruleProperty ) ) | ( (lv_main_21_0= ruleMain ) ) )* otherlv_22= 'tel' (otherlv_23= ';' )? ) ;
    public final EObject ruleNode() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        Token otherlv_22=null;
        Token otherlv_23=null;
        EObject lv_inputs_3_0 = null;

        EObject lv_inputs_5_0 = null;

        EObject lv_outputs_9_0 = null;

        EObject lv_outputs_11_0 = null;

        EObject lv_locals_15_0 = null;

        EObject lv_equations_18_0 = null;

        EObject lv_assertions_19_0 = null;

        EObject lv_properties_20_0 = null;

        AntlrDatatypeRuleToken lv_main_21_0 = null;


         enterRule(); 
            
        try {
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:668:28: ( (otherlv_0= 'node' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( ( (lv_inputs_3_0= ruleVariableGroup ) ) (otherlv_4= ';' ( (lv_inputs_5_0= ruleVariableGroup ) ) )* )? otherlv_6= ')' otherlv_7= 'returns' otherlv_8= '(' ( ( (lv_outputs_9_0= ruleVariableGroup ) ) (otherlv_10= ';' ( (lv_outputs_11_0= ruleVariableGroup ) ) )* )? otherlv_12= ')' otherlv_13= ';' (otherlv_14= 'var' ( ( (lv_locals_15_0= ruleVariableGroup ) ) otherlv_16= ';' )* )? otherlv_17= 'let' ( ( (lv_equations_18_0= ruleEquation ) ) | ( (lv_assertions_19_0= ruleAssertion ) ) | ( (lv_properties_20_0= ruleProperty ) ) | ( (lv_main_21_0= ruleMain ) ) )* otherlv_22= 'tel' (otherlv_23= ';' )? ) )
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:669:1: (otherlv_0= 'node' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( ( (lv_inputs_3_0= ruleVariableGroup ) ) (otherlv_4= ';' ( (lv_inputs_5_0= ruleVariableGroup ) ) )* )? otherlv_6= ')' otherlv_7= 'returns' otherlv_8= '(' ( ( (lv_outputs_9_0= ruleVariableGroup ) ) (otherlv_10= ';' ( (lv_outputs_11_0= ruleVariableGroup ) ) )* )? otherlv_12= ')' otherlv_13= ';' (otherlv_14= 'var' ( ( (lv_locals_15_0= ruleVariableGroup ) ) otherlv_16= ';' )* )? otherlv_17= 'let' ( ( (lv_equations_18_0= ruleEquation ) ) | ( (lv_assertions_19_0= ruleAssertion ) ) | ( (lv_properties_20_0= ruleProperty ) ) | ( (lv_main_21_0= ruleMain ) ) )* otherlv_22= 'tel' (otherlv_23= ';' )? )
            {
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:669:1: (otherlv_0= 'node' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( ( (lv_inputs_3_0= ruleVariableGroup ) ) (otherlv_4= ';' ( (lv_inputs_5_0= ruleVariableGroup ) ) )* )? otherlv_6= ')' otherlv_7= 'returns' otherlv_8= '(' ( ( (lv_outputs_9_0= ruleVariableGroup ) ) (otherlv_10= ';' ( (lv_outputs_11_0= ruleVariableGroup ) ) )* )? otherlv_12= ')' otherlv_13= ';' (otherlv_14= 'var' ( ( (lv_locals_15_0= ruleVariableGroup ) ) otherlv_16= ';' )* )? otherlv_17= 'let' ( ( (lv_equations_18_0= ruleEquation ) ) | ( (lv_assertions_19_0= ruleAssertion ) ) | ( (lv_properties_20_0= ruleProperty ) ) | ( (lv_main_21_0= ruleMain ) ) )* otherlv_22= 'tel' (otherlv_23= ';' )? )
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:669:3: otherlv_0= 'node' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( ( (lv_inputs_3_0= ruleVariableGroup ) ) (otherlv_4= ';' ( (lv_inputs_5_0= ruleVariableGroup ) ) )* )? otherlv_6= ')' otherlv_7= 'returns' otherlv_8= '(' ( ( (lv_outputs_9_0= ruleVariableGroup ) ) (otherlv_10= ';' ( (lv_outputs_11_0= ruleVariableGroup ) ) )* )? otherlv_12= ')' otherlv_13= ';' (otherlv_14= 'var' ( ( (lv_locals_15_0= ruleVariableGroup ) ) otherlv_16= ';' )* )? otherlv_17= 'let' ( ( (lv_equations_18_0= ruleEquation ) ) | ( (lv_assertions_19_0= ruleAssertion ) ) | ( (lv_properties_20_0= ruleProperty ) ) | ( (lv_main_21_0= ruleMain ) ) )* otherlv_22= 'tel' (otherlv_23= ';' )?
            {
            otherlv_0=(Token)match(input,27,FOLLOW_27_in_ruleNode1374); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getNodeAccess().getNodeKeyword_0());
                  
            }
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:673:1: ( (lv_name_1_0= RULE_ID ) )
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:674:1: (lv_name_1_0= RULE_ID )
            {
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:674:1: (lv_name_1_0= RULE_ID )
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:675:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleNode1391); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_1_0, grammarAccess.getNodeAccess().getNameIDTerminalRuleCall_1_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getNodeRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_1_0, 
                      		"ID");
              	    
            }

            }


            }

            otherlv_2=(Token)match(input,28,FOLLOW_28_in_ruleNode1408); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getNodeAccess().getLeftParenthesisKeyword_2());
                  
            }
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:695:1: ( ( (lv_inputs_3_0= ruleVariableGroup ) ) (otherlv_4= ';' ( (lv_inputs_5_0= ruleVariableGroup ) ) )* )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==RULE_ID) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:695:2: ( (lv_inputs_3_0= ruleVariableGroup ) ) (otherlv_4= ';' ( (lv_inputs_5_0= ruleVariableGroup ) ) )*
                    {
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:695:2: ( (lv_inputs_3_0= ruleVariableGroup ) )
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:696:1: (lv_inputs_3_0= ruleVariableGroup )
                    {
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:696:1: (lv_inputs_3_0= ruleVariableGroup )
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:697:3: lv_inputs_3_0= ruleVariableGroup
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getNodeAccess().getInputsVariableGroupParserRuleCall_3_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleVariableGroup_in_ruleNode1430);
                    lv_inputs_3_0=ruleVariableGroup();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getNodeRule());
                      	        }
                             		add(
                             			current, 
                             			"inputs",
                              		lv_inputs_3_0, 
                              		"VariableGroup");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:713:2: (otherlv_4= ';' ( (lv_inputs_5_0= ruleVariableGroup ) ) )*
                    loop7:
                    do {
                        int alt7=2;
                        int LA7_0 = input.LA(1);

                        if ( (LA7_0==12) ) {
                            alt7=1;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:713:4: otherlv_4= ';' ( (lv_inputs_5_0= ruleVariableGroup ) )
                    	    {
                    	    otherlv_4=(Token)match(input,12,FOLLOW_12_in_ruleNode1443); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_4, grammarAccess.getNodeAccess().getSemicolonKeyword_3_1_0());
                    	          
                    	    }
                    	    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:717:1: ( (lv_inputs_5_0= ruleVariableGroup ) )
                    	    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:718:1: (lv_inputs_5_0= ruleVariableGroup )
                    	    {
                    	    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:718:1: (lv_inputs_5_0= ruleVariableGroup )
                    	    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:719:3: lv_inputs_5_0= ruleVariableGroup
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getNodeAccess().getInputsVariableGroupParserRuleCall_3_1_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleVariableGroup_in_ruleNode1464);
                    	    lv_inputs_5_0=ruleVariableGroup();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getNodeRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"inputs",
                    	              		lv_inputs_5_0, 
                    	              		"VariableGroup");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop7;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_6=(Token)match(input,29,FOLLOW_29_in_ruleNode1480); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_6, grammarAccess.getNodeAccess().getRightParenthesisKeyword_4());
                  
            }
            otherlv_7=(Token)match(input,30,FOLLOW_30_in_ruleNode1492); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_7, grammarAccess.getNodeAccess().getReturnsKeyword_5());
                  
            }
            otherlv_8=(Token)match(input,28,FOLLOW_28_in_ruleNode1504); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_8, grammarAccess.getNodeAccess().getLeftParenthesisKeyword_6());
                  
            }
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:747:1: ( ( (lv_outputs_9_0= ruleVariableGroup ) ) (otherlv_10= ';' ( (lv_outputs_11_0= ruleVariableGroup ) ) )* )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==RULE_ID) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:747:2: ( (lv_outputs_9_0= ruleVariableGroup ) ) (otherlv_10= ';' ( (lv_outputs_11_0= ruleVariableGroup ) ) )*
                    {
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:747:2: ( (lv_outputs_9_0= ruleVariableGroup ) )
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:748:1: (lv_outputs_9_0= ruleVariableGroup )
                    {
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:748:1: (lv_outputs_9_0= ruleVariableGroup )
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:749:3: lv_outputs_9_0= ruleVariableGroup
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getNodeAccess().getOutputsVariableGroupParserRuleCall_7_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleVariableGroup_in_ruleNode1526);
                    lv_outputs_9_0=ruleVariableGroup();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getNodeRule());
                      	        }
                             		add(
                             			current, 
                             			"outputs",
                              		lv_outputs_9_0, 
                              		"VariableGroup");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:765:2: (otherlv_10= ';' ( (lv_outputs_11_0= ruleVariableGroup ) ) )*
                    loop9:
                    do {
                        int alt9=2;
                        int LA9_0 = input.LA(1);

                        if ( (LA9_0==12) ) {
                            alt9=1;
                        }


                        switch (alt9) {
                    	case 1 :
                    	    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:765:4: otherlv_10= ';' ( (lv_outputs_11_0= ruleVariableGroup ) )
                    	    {
                    	    otherlv_10=(Token)match(input,12,FOLLOW_12_in_ruleNode1539); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_10, grammarAccess.getNodeAccess().getSemicolonKeyword_7_1_0());
                    	          
                    	    }
                    	    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:769:1: ( (lv_outputs_11_0= ruleVariableGroup ) )
                    	    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:770:1: (lv_outputs_11_0= ruleVariableGroup )
                    	    {
                    	    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:770:1: (lv_outputs_11_0= ruleVariableGroup )
                    	    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:771:3: lv_outputs_11_0= ruleVariableGroup
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getNodeAccess().getOutputsVariableGroupParserRuleCall_7_1_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleVariableGroup_in_ruleNode1560);
                    	    lv_outputs_11_0=ruleVariableGroup();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getNodeRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"outputs",
                    	              		lv_outputs_11_0, 
                    	              		"VariableGroup");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop9;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_12=(Token)match(input,29,FOLLOW_29_in_ruleNode1576); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_12, grammarAccess.getNodeAccess().getRightParenthesisKeyword_8());
                  
            }
            otherlv_13=(Token)match(input,12,FOLLOW_12_in_ruleNode1588); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_13, grammarAccess.getNodeAccess().getSemicolonKeyword_9());
                  
            }
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:795:1: (otherlv_14= 'var' ( ( (lv_locals_15_0= ruleVariableGroup ) ) otherlv_16= ';' )* )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==31) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:795:3: otherlv_14= 'var' ( ( (lv_locals_15_0= ruleVariableGroup ) ) otherlv_16= ';' )*
                    {
                    otherlv_14=(Token)match(input,31,FOLLOW_31_in_ruleNode1601); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_14, grammarAccess.getNodeAccess().getVarKeyword_10_0());
                          
                    }
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:799:1: ( ( (lv_locals_15_0= ruleVariableGroup ) ) otherlv_16= ';' )*
                    loop11:
                    do {
                        int alt11=2;
                        int LA11_0 = input.LA(1);

                        if ( (LA11_0==RULE_ID) ) {
                            alt11=1;
                        }


                        switch (alt11) {
                    	case 1 :
                    	    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:799:2: ( (lv_locals_15_0= ruleVariableGroup ) ) otherlv_16= ';'
                    	    {
                    	    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:799:2: ( (lv_locals_15_0= ruleVariableGroup ) )
                    	    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:800:1: (lv_locals_15_0= ruleVariableGroup )
                    	    {
                    	    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:800:1: (lv_locals_15_0= ruleVariableGroup )
                    	    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:801:3: lv_locals_15_0= ruleVariableGroup
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getNodeAccess().getLocalsVariableGroupParserRuleCall_10_1_0_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleVariableGroup_in_ruleNode1623);
                    	    lv_locals_15_0=ruleVariableGroup();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getNodeRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"locals",
                    	              		lv_locals_15_0, 
                    	              		"VariableGroup");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }

                    	    otherlv_16=(Token)match(input,12,FOLLOW_12_in_ruleNode1635); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_16, grammarAccess.getNodeAccess().getSemicolonKeyword_10_1_1());
                    	          
                    	    }

                    	    }
                    	    break;

                    	default :
                    	    break loop11;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_17=(Token)match(input,32,FOLLOW_32_in_ruleNode1651); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_17, grammarAccess.getNodeAccess().getLetKeyword_11());
                  
            }
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:825:1: ( ( (lv_equations_18_0= ruleEquation ) ) | ( (lv_assertions_19_0= ruleAssertion ) ) | ( (lv_properties_20_0= ruleProperty ) ) | ( (lv_main_21_0= ruleMain ) ) )*
            loop13:
            do {
                int alt13=5;
                switch ( input.LA(1) ) {
                case RULE_ID:
                case RULE_INT:
                case 19:
                case 25:
                case 28:
                case 52:
                case 53:
                case 55:
                case 58:
                case 59:
                case 60:
                case 61:
                    {
                    alt13=1;
                    }
                    break;
                case 36:
                    {
                    alt13=2;
                    }
                    break;
                case 34:
                    {
                    alt13=3;
                    }
                    break;
                case 35:
                    {
                    alt13=4;
                    }
                    break;

                }

                switch (alt13) {
            	case 1 :
            	    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:825:2: ( (lv_equations_18_0= ruleEquation ) )
            	    {
            	    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:825:2: ( (lv_equations_18_0= ruleEquation ) )
            	    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:826:1: (lv_equations_18_0= ruleEquation )
            	    {
            	    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:826:1: (lv_equations_18_0= ruleEquation )
            	    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:827:3: lv_equations_18_0= ruleEquation
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getNodeAccess().getEquationsEquationParserRuleCall_12_0_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleEquation_in_ruleNode1673);
            	    lv_equations_18_0=ruleEquation();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getNodeRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"equations",
            	              		lv_equations_18_0, 
            	              		"Equation");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:844:6: ( (lv_assertions_19_0= ruleAssertion ) )
            	    {
            	    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:844:6: ( (lv_assertions_19_0= ruleAssertion ) )
            	    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:845:1: (lv_assertions_19_0= ruleAssertion )
            	    {
            	    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:845:1: (lv_assertions_19_0= ruleAssertion )
            	    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:846:3: lv_assertions_19_0= ruleAssertion
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getNodeAccess().getAssertionsAssertionParserRuleCall_12_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleAssertion_in_ruleNode1700);
            	    lv_assertions_19_0=ruleAssertion();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getNodeRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"assertions",
            	              		lv_assertions_19_0, 
            	              		"Assertion");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:863:6: ( (lv_properties_20_0= ruleProperty ) )
            	    {
            	    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:863:6: ( (lv_properties_20_0= ruleProperty ) )
            	    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:864:1: (lv_properties_20_0= ruleProperty )
            	    {
            	    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:864:1: (lv_properties_20_0= ruleProperty )
            	    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:865:3: lv_properties_20_0= ruleProperty
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getNodeAccess().getPropertiesPropertyParserRuleCall_12_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleProperty_in_ruleNode1727);
            	    lv_properties_20_0=ruleProperty();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getNodeRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"properties",
            	              		lv_properties_20_0, 
            	              		"Property");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;
            	case 4 :
            	    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:882:6: ( (lv_main_21_0= ruleMain ) )
            	    {
            	    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:882:6: ( (lv_main_21_0= ruleMain ) )
            	    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:883:1: (lv_main_21_0= ruleMain )
            	    {
            	    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:883:1: (lv_main_21_0= ruleMain )
            	    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:884:3: lv_main_21_0= ruleMain
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getNodeAccess().getMainMainParserRuleCall_12_3_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleMain_in_ruleNode1754);
            	    lv_main_21_0=ruleMain();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getNodeRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"main",
            	              		lv_main_21_0, 
            	              		"Main");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

            otherlv_22=(Token)match(input,33,FOLLOW_33_in_ruleNode1768); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_22, grammarAccess.getNodeAccess().getTelKeyword_13());
                  
            }
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:904:1: (otherlv_23= ';' )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==12) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:904:3: otherlv_23= ';'
                    {
                    otherlv_23=(Token)match(input,12,FOLLOW_12_in_ruleNode1781); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_23, grammarAccess.getNodeAccess().getSemicolonKeyword_14());
                          
                    }

                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNode"


    // $ANTLR start "entryRuleVariableGroup"
    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:916:1: entryRuleVariableGroup returns [EObject current=null] : iv_ruleVariableGroup= ruleVariableGroup EOF ;
    public final EObject entryRuleVariableGroup() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariableGroup = null;


        try {
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:917:2: (iv_ruleVariableGroup= ruleVariableGroup EOF )
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:918:2: iv_ruleVariableGroup= ruleVariableGroup EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getVariableGroupRule()); 
            }
            pushFollow(FOLLOW_ruleVariableGroup_in_entryRuleVariableGroup1819);
            iv_ruleVariableGroup=ruleVariableGroup();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleVariableGroup; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleVariableGroup1829); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleVariableGroup"


    // $ANTLR start "ruleVariableGroup"
    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:925:1: ruleVariableGroup returns [EObject current=null] : ( ( (lv_variables_0_0= ruleVariable ) ) (otherlv_1= ',' ( (lv_variables_2_0= ruleVariable ) ) )* otherlv_3= ':' ( (lv_type_4_0= ruleType ) ) ) ;
    public final EObject ruleVariableGroup() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_variables_0_0 = null;

        EObject lv_variables_2_0 = null;

        EObject lv_type_4_0 = null;


         enterRule(); 
            
        try {
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:928:28: ( ( ( (lv_variables_0_0= ruleVariable ) ) (otherlv_1= ',' ( (lv_variables_2_0= ruleVariable ) ) )* otherlv_3= ':' ( (lv_type_4_0= ruleType ) ) ) )
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:929:1: ( ( (lv_variables_0_0= ruleVariable ) ) (otherlv_1= ',' ( (lv_variables_2_0= ruleVariable ) ) )* otherlv_3= ':' ( (lv_type_4_0= ruleType ) ) )
            {
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:929:1: ( ( (lv_variables_0_0= ruleVariable ) ) (otherlv_1= ',' ( (lv_variables_2_0= ruleVariable ) ) )* otherlv_3= ':' ( (lv_type_4_0= ruleType ) ) )
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:929:2: ( (lv_variables_0_0= ruleVariable ) ) (otherlv_1= ',' ( (lv_variables_2_0= ruleVariable ) ) )* otherlv_3= ':' ( (lv_type_4_0= ruleType ) )
            {
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:929:2: ( (lv_variables_0_0= ruleVariable ) )
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:930:1: (lv_variables_0_0= ruleVariable )
            {
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:930:1: (lv_variables_0_0= ruleVariable )
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:931:3: lv_variables_0_0= ruleVariable
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getVariableGroupAccess().getVariablesVariableParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleVariable_in_ruleVariableGroup1875);
            lv_variables_0_0=ruleVariable();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getVariableGroupRule());
              	        }
                     		add(
                     			current, 
                     			"variables",
                      		lv_variables_0_0, 
                      		"Variable");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:947:2: (otherlv_1= ',' ( (lv_variables_2_0= ruleVariable ) ) )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==22) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:947:4: otherlv_1= ',' ( (lv_variables_2_0= ruleVariable ) )
            	    {
            	    otherlv_1=(Token)match(input,22,FOLLOW_22_in_ruleVariableGroup1888); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_1, grammarAccess.getVariableGroupAccess().getCommaKeyword_1_0());
            	          
            	    }
            	    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:951:1: ( (lv_variables_2_0= ruleVariable ) )
            	    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:952:1: (lv_variables_2_0= ruleVariable )
            	    {
            	    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:952:1: (lv_variables_2_0= ruleVariable )
            	    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:953:3: lv_variables_2_0= ruleVariable
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getVariableGroupAccess().getVariablesVariableParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleVariable_in_ruleVariableGroup1909);
            	    lv_variables_2_0=ruleVariable();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getVariableGroupRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"variables",
            	              		lv_variables_2_0, 
            	              		"Variable");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

            otherlv_3=(Token)match(input,15,FOLLOW_15_in_ruleVariableGroup1923); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getVariableGroupAccess().getColonKeyword_2());
                  
            }
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:973:1: ( (lv_type_4_0= ruleType ) )
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:974:1: (lv_type_4_0= ruleType )
            {
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:974:1: (lv_type_4_0= ruleType )
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:975:3: lv_type_4_0= ruleType
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getVariableGroupAccess().getTypeTypeParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleType_in_ruleVariableGroup1944);
            lv_type_4_0=ruleType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getVariableGroupRule());
              	        }
                     		set(
                     			current, 
                     			"type",
                      		lv_type_4_0, 
                      		"Type");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleVariableGroup"


    // $ANTLR start "entryRuleVariable"
    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:999:1: entryRuleVariable returns [EObject current=null] : iv_ruleVariable= ruleVariable EOF ;
    public final EObject entryRuleVariable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariable = null;


        try {
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1000:2: (iv_ruleVariable= ruleVariable EOF )
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1001:2: iv_ruleVariable= ruleVariable EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getVariableRule()); 
            }
            pushFollow(FOLLOW_ruleVariable_in_entryRuleVariable1980);
            iv_ruleVariable=ruleVariable();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleVariable; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleVariable1990); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleVariable"


    // $ANTLR start "ruleVariable"
    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1008:1: ruleVariable returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleVariable() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;

         enterRule(); 
            
        try {
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1011:28: ( ( (lv_name_0_0= RULE_ID ) ) )
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1012:1: ( (lv_name_0_0= RULE_ID ) )
            {
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1012:1: ( (lv_name_0_0= RULE_ID ) )
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1013:1: (lv_name_0_0= RULE_ID )
            {
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1013:1: (lv_name_0_0= RULE_ID )
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1014:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleVariable2031); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_0_0, grammarAccess.getVariableAccess().getNameIDTerminalRuleCall_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getVariableRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_0_0, 
                      		"ID");
              	    
            }

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleVariable"


    // $ANTLR start "entryRuleEquation"
    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1038:1: entryRuleEquation returns [EObject current=null] : iv_ruleEquation= ruleEquation EOF ;
    public final EObject entryRuleEquation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEquation = null;


        try {
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1039:2: (iv_ruleEquation= ruleEquation EOF )
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1040:2: iv_ruleEquation= ruleEquation EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEquationRule()); 
            }
            pushFollow(FOLLOW_ruleEquation_in_entryRuleEquation2071);
            iv_ruleEquation=ruleEquation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEquation; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleEquation2081); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEquation"


    // $ANTLR start "ruleEquation"
    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1047:1: ruleEquation returns [EObject current=null] : ( ( ( ( ( ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* '=' ) )=> ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= ',' ( (otherlv_2= RULE_ID ) ) )* otherlv_3= '=' ) ) ( (lv_rhs_4_0= ruleExpr ) ) otherlv_5= ';' ) | ( ( (lv_rhs_6_0= ruleExpr ) ) otherlv_7= ';' ) ) ;
    public final EObject ruleEquation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        EObject lv_rhs_4_0 = null;

        EObject lv_rhs_6_0 = null;


         enterRule(); 
            
        try {
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1050:28: ( ( ( ( ( ( ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* '=' ) )=> ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= ',' ( (otherlv_2= RULE_ID ) ) )* otherlv_3= '=' ) ) ( (lv_rhs_4_0= ruleExpr ) ) otherlv_5= ';' ) | ( ( (lv_rhs_6_0= ruleExpr ) ) otherlv_7= ';' ) ) )
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1051:1: ( ( ( ( ( ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* '=' ) )=> ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= ',' ( (otherlv_2= RULE_ID ) ) )* otherlv_3= '=' ) ) ( (lv_rhs_4_0= ruleExpr ) ) otherlv_5= ';' ) | ( ( (lv_rhs_6_0= ruleExpr ) ) otherlv_7= ';' ) )
            {
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1051:1: ( ( ( ( ( ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* '=' ) )=> ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= ',' ( (otherlv_2= RULE_ID ) ) )* otherlv_3= '=' ) ) ( (lv_rhs_4_0= ruleExpr ) ) otherlv_5= ';' ) | ( ( (lv_rhs_6_0= ruleExpr ) ) otherlv_7= ';' ) )
            int alt17=2;
            alt17 = dfa17.predict(input);
            switch (alt17) {
                case 1 :
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1051:2: ( ( ( ( ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* '=' ) )=> ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= ',' ( (otherlv_2= RULE_ID ) ) )* otherlv_3= '=' ) ) ( (lv_rhs_4_0= ruleExpr ) ) otherlv_5= ';' )
                    {
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1051:2: ( ( ( ( ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* '=' ) )=> ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= ',' ( (otherlv_2= RULE_ID ) ) )* otherlv_3= '=' ) ) ( (lv_rhs_4_0= ruleExpr ) ) otherlv_5= ';' )
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1051:3: ( ( ( ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* '=' ) )=> ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= ',' ( (otherlv_2= RULE_ID ) ) )* otherlv_3= '=' ) ) ( (lv_rhs_4_0= ruleExpr ) ) otherlv_5= ';'
                    {
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1051:3: ( ( ( ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* '=' ) )=> ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= ',' ( (otherlv_2= RULE_ID ) ) )* otherlv_3= '=' ) )
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1051:4: ( ( ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* '=' ) )=> ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= ',' ( (otherlv_2= RULE_ID ) ) )* otherlv_3= '=' )
                    {
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1063:5: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= ',' ( (otherlv_2= RULE_ID ) ) )* otherlv_3= '=' )
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1063:6: ( (otherlv_0= RULE_ID ) ) (otherlv_1= ',' ( (otherlv_2= RULE_ID ) ) )* otherlv_3= '='
                    {
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1063:6: ( (otherlv_0= RULE_ID ) )
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1064:1: (otherlv_0= RULE_ID )
                    {
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1064:1: (otherlv_0= RULE_ID )
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1065:3: otherlv_0= RULE_ID
                    {
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getEquationRule());
                      	        }
                              
                    }
                    otherlv_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEquation2167); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		newLeafNode(otherlv_0, grammarAccess.getEquationAccess().getLhsVariableCrossReference_0_0_0_0_0()); 
                      	
                    }

                    }


                    }

                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1076:2: (otherlv_1= ',' ( (otherlv_2= RULE_ID ) ) )*
                    loop16:
                    do {
                        int alt16=2;
                        int LA16_0 = input.LA(1);

                        if ( (LA16_0==22) ) {
                            alt16=1;
                        }


                        switch (alt16) {
                    	case 1 :
                    	    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1076:4: otherlv_1= ',' ( (otherlv_2= RULE_ID ) )
                    	    {
                    	    otherlv_1=(Token)match(input,22,FOLLOW_22_in_ruleEquation2180); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_1, grammarAccess.getEquationAccess().getCommaKeyword_0_0_0_1_0());
                    	          
                    	    }
                    	    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1080:1: ( (otherlv_2= RULE_ID ) )
                    	    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1081:1: (otherlv_2= RULE_ID )
                    	    {
                    	    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1081:1: (otherlv_2= RULE_ID )
                    	    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1082:3: otherlv_2= RULE_ID
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      			if (current==null) {
                    	      	            current = createModelElement(grammarAccess.getEquationRule());
                    	      	        }
                    	              
                    	    }
                    	    otherlv_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEquation2200); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      		newLeafNode(otherlv_2, grammarAccess.getEquationAccess().getLhsVariableCrossReference_0_0_0_1_1_0()); 
                    	      	
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop16;
                        }
                    } while (true);

                    otherlv_3=(Token)match(input,11,FOLLOW_11_in_ruleEquation2214); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getEquationAccess().getEqualsSignKeyword_0_0_0_2());
                          
                    }

                    }


                    }

                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1097:3: ( (lv_rhs_4_0= ruleExpr ) )
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1098:1: (lv_rhs_4_0= ruleExpr )
                    {
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1098:1: (lv_rhs_4_0= ruleExpr )
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1099:3: lv_rhs_4_0= ruleExpr
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getEquationAccess().getRhsExprParserRuleCall_0_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleExpr_in_ruleEquation2237);
                    lv_rhs_4_0=ruleExpr();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getEquationRule());
                      	        }
                             		set(
                             			current, 
                             			"rhs",
                              		lv_rhs_4_0, 
                              		"Expr");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    otherlv_5=(Token)match(input,12,FOLLOW_12_in_ruleEquation2249); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_5, grammarAccess.getEquationAccess().getSemicolonKeyword_0_2());
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1120:6: ( ( (lv_rhs_6_0= ruleExpr ) ) otherlv_7= ';' )
                    {
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1120:6: ( ( (lv_rhs_6_0= ruleExpr ) ) otherlv_7= ';' )
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1120:7: ( (lv_rhs_6_0= ruleExpr ) ) otherlv_7= ';'
                    {
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1120:7: ( (lv_rhs_6_0= ruleExpr ) )
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1121:1: (lv_rhs_6_0= ruleExpr )
                    {
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1121:1: (lv_rhs_6_0= ruleExpr )
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1122:3: lv_rhs_6_0= ruleExpr
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getEquationAccess().getRhsExprParserRuleCall_1_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleExpr_in_ruleEquation2278);
                    lv_rhs_6_0=ruleExpr();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getEquationRule());
                      	        }
                             		set(
                             			current, 
                             			"rhs",
                              		lv_rhs_6_0, 
                              		"Expr");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    otherlv_7=(Token)match(input,12,FOLLOW_12_in_ruleEquation2290); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_7, grammarAccess.getEquationAccess().getSemicolonKeyword_1_1());
                          
                    }

                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEquation"


    // $ANTLR start "entryRuleProperty"
    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1150:1: entryRuleProperty returns [EObject current=null] : iv_ruleProperty= ruleProperty EOF ;
    public final EObject entryRuleProperty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProperty = null;


        try {
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1151:2: (iv_ruleProperty= ruleProperty EOF )
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1152:2: iv_ruleProperty= ruleProperty EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPropertyRule()); 
            }
            pushFollow(FOLLOW_ruleProperty_in_entryRuleProperty2327);
            iv_ruleProperty=ruleProperty();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleProperty; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleProperty2337); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleProperty"


    // $ANTLR start "ruleProperty"
    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1159:1: ruleProperty returns [EObject current=null] : (otherlv_0= '--%PROPERTY' ( (otherlv_1= RULE_ID ) ) otherlv_2= ';' ) ;
    public final EObject ruleProperty() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;

         enterRule(); 
            
        try {
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1162:28: ( (otherlv_0= '--%PROPERTY' ( (otherlv_1= RULE_ID ) ) otherlv_2= ';' ) )
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1163:1: (otherlv_0= '--%PROPERTY' ( (otherlv_1= RULE_ID ) ) otherlv_2= ';' )
            {
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1163:1: (otherlv_0= '--%PROPERTY' ( (otherlv_1= RULE_ID ) ) otherlv_2= ';' )
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1163:3: otherlv_0= '--%PROPERTY' ( (otherlv_1= RULE_ID ) ) otherlv_2= ';'
            {
            otherlv_0=(Token)match(input,34,FOLLOW_34_in_ruleProperty2374); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getPropertyAccess().getPROPERTYKeyword_0());
                  
            }
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1167:1: ( (otherlv_1= RULE_ID ) )
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1168:1: (otherlv_1= RULE_ID )
            {
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1168:1: (otherlv_1= RULE_ID )
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1169:3: otherlv_1= RULE_ID
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getPropertyRule());
              	        }
                      
            }
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleProperty2394); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		newLeafNode(otherlv_1, grammarAccess.getPropertyAccess().getRefVariableCrossReference_1_0()); 
              	
            }

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_12_in_ruleProperty2406); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getPropertyAccess().getSemicolonKeyword_2());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleProperty"


    // $ANTLR start "entryRuleMain"
    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1192:1: entryRuleMain returns [String current=null] : iv_ruleMain= ruleMain EOF ;
    public final String entryRuleMain() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleMain = null;


        try {
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1193:2: (iv_ruleMain= ruleMain EOF )
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1194:2: iv_ruleMain= ruleMain EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMainRule()); 
            }
            pushFollow(FOLLOW_ruleMain_in_entryRuleMain2443);
            iv_ruleMain=ruleMain();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMain.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleMain2454); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMain"


    // $ANTLR start "ruleMain"
    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1201:1: ruleMain returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '--%MAIN' (kw= ';' )? ) ;
    public final AntlrDatatypeRuleToken ruleMain() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1204:28: ( (kw= '--%MAIN' (kw= ';' )? ) )
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1205:1: (kw= '--%MAIN' (kw= ';' )? )
            {
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1205:1: (kw= '--%MAIN' (kw= ';' )? )
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1206:2: kw= '--%MAIN' (kw= ';' )?
            {
            kw=(Token)match(input,35,FOLLOW_35_in_ruleMain2492); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current.merge(kw);
                      newLeafNode(kw, grammarAccess.getMainAccess().getMAINKeyword_0()); 
                  
            }
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1211:1: (kw= ';' )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==12) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1212:2: kw= ';'
                    {
                    kw=(Token)match(input,12,FOLLOW_12_in_ruleMain2506); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getMainAccess().getSemicolonKeyword_1()); 
                          
                    }

                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMain"


    // $ANTLR start "entryRuleAssertion"
    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1225:1: entryRuleAssertion returns [EObject current=null] : iv_ruleAssertion= ruleAssertion EOF ;
    public final EObject entryRuleAssertion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAssertion = null;


        try {
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1226:2: (iv_ruleAssertion= ruleAssertion EOF )
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1227:2: iv_ruleAssertion= ruleAssertion EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAssertionRule()); 
            }
            pushFollow(FOLLOW_ruleAssertion_in_entryRuleAssertion2548);
            iv_ruleAssertion=ruleAssertion();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAssertion; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAssertion2558); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAssertion"


    // $ANTLR start "ruleAssertion"
    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1234:1: ruleAssertion returns [EObject current=null] : (otherlv_0= 'assert' ( (lv_expr_1_0= ruleExpr ) ) otherlv_2= ';' ) ;
    public final EObject ruleAssertion() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_expr_1_0 = null;


         enterRule(); 
            
        try {
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1237:28: ( (otherlv_0= 'assert' ( (lv_expr_1_0= ruleExpr ) ) otherlv_2= ';' ) )
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1238:1: (otherlv_0= 'assert' ( (lv_expr_1_0= ruleExpr ) ) otherlv_2= ';' )
            {
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1238:1: (otherlv_0= 'assert' ( (lv_expr_1_0= ruleExpr ) ) otherlv_2= ';' )
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1238:3: otherlv_0= 'assert' ( (lv_expr_1_0= ruleExpr ) ) otherlv_2= ';'
            {
            otherlv_0=(Token)match(input,36,FOLLOW_36_in_ruleAssertion2595); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getAssertionAccess().getAssertKeyword_0());
                  
            }
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1242:1: ( (lv_expr_1_0= ruleExpr ) )
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1243:1: (lv_expr_1_0= ruleExpr )
            {
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1243:1: (lv_expr_1_0= ruleExpr )
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1244:3: lv_expr_1_0= ruleExpr
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getAssertionAccess().getExprExprParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleExpr_in_ruleAssertion2616);
            lv_expr_1_0=ruleExpr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getAssertionRule());
              	        }
                     		set(
                     			current, 
                     			"expr",
                      		lv_expr_1_0, 
                      		"Expr");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_12_in_ruleAssertion2628); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getAssertionAccess().getSemicolonKeyword_2());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAssertion"


    // $ANTLR start "entryRuleExpr"
    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1272:1: entryRuleExpr returns [EObject current=null] : iv_ruleExpr= ruleExpr EOF ;
    public final EObject entryRuleExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpr = null;


        try {
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1273:2: (iv_ruleExpr= ruleExpr EOF )
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1274:2: iv_ruleExpr= ruleExpr EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExprRule()); 
            }
            pushFollow(FOLLOW_ruleExpr_in_entryRuleExpr2664);
            iv_ruleExpr=ruleExpr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExpr; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleExpr2674); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExpr"


    // $ANTLR start "ruleExpr"
    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1281:1: ruleExpr returns [EObject current=null] : this_ArrowExpr_0= ruleArrowExpr ;
    public final EObject ruleExpr() throws RecognitionException {
        EObject current = null;

        EObject this_ArrowExpr_0 = null;


         enterRule(); 
            
        try {
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1284:28: (this_ArrowExpr_0= ruleArrowExpr )
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1286:5: this_ArrowExpr_0= ruleArrowExpr
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getExprAccess().getArrowExprParserRuleCall()); 
                  
            }
            pushFollow(FOLLOW_ruleArrowExpr_in_ruleExpr2720);
            this_ArrowExpr_0=ruleArrowExpr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_ArrowExpr_0; 
                      afterParserOrEnumRuleCall();
                  
            }

            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleExpr"


    // $ANTLR start "entryRuleArrowExpr"
    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1302:1: entryRuleArrowExpr returns [EObject current=null] : iv_ruleArrowExpr= ruleArrowExpr EOF ;
    public final EObject entryRuleArrowExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArrowExpr = null;


        try {
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1303:2: (iv_ruleArrowExpr= ruleArrowExpr EOF )
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1304:2: iv_ruleArrowExpr= ruleArrowExpr EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getArrowExprRule()); 
            }
            pushFollow(FOLLOW_ruleArrowExpr_in_entryRuleArrowExpr2754);
            iv_ruleArrowExpr=ruleArrowExpr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleArrowExpr; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleArrowExpr2764); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleArrowExpr"


    // $ANTLR start "ruleArrowExpr"
    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1311:1: ruleArrowExpr returns [EObject current=null] : (this_ImpliesExpr_0= ruleImpliesExpr ( ( ( ( () ( ( '->' ) ) ) )=> ( () ( (lv_op_2_0= '->' ) ) ) ) ( (lv_right_3_0= ruleArrowExpr ) ) )? ) ;
    public final EObject ruleArrowExpr() throws RecognitionException {
        EObject current = null;

        Token lv_op_2_0=null;
        EObject this_ImpliesExpr_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1314:28: ( (this_ImpliesExpr_0= ruleImpliesExpr ( ( ( ( () ( ( '->' ) ) ) )=> ( () ( (lv_op_2_0= '->' ) ) ) ) ( (lv_right_3_0= ruleArrowExpr ) ) )? ) )
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1315:1: (this_ImpliesExpr_0= ruleImpliesExpr ( ( ( ( () ( ( '->' ) ) ) )=> ( () ( (lv_op_2_0= '->' ) ) ) ) ( (lv_right_3_0= ruleArrowExpr ) ) )? )
            {
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1315:1: (this_ImpliesExpr_0= ruleImpliesExpr ( ( ( ( () ( ( '->' ) ) ) )=> ( () ( (lv_op_2_0= '->' ) ) ) ) ( (lv_right_3_0= ruleArrowExpr ) ) )? )
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1316:5: this_ImpliesExpr_0= ruleImpliesExpr ( ( ( ( () ( ( '->' ) ) ) )=> ( () ( (lv_op_2_0= '->' ) ) ) ) ( (lv_right_3_0= ruleArrowExpr ) ) )?
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getArrowExprAccess().getImpliesExprParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleImpliesExpr_in_ruleArrowExpr2811);
            this_ImpliesExpr_0=ruleImpliesExpr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_ImpliesExpr_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1324:1: ( ( ( ( () ( ( '->' ) ) ) )=> ( () ( (lv_op_2_0= '->' ) ) ) ) ( (lv_right_3_0= ruleArrowExpr ) ) )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==37) ) {
                int LA19_1 = input.LA(2);

                if ( (synpred2_InternalJKind()) ) {
                    alt19=1;
                }
            }
            switch (alt19) {
                case 1 :
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1324:2: ( ( ( () ( ( '->' ) ) ) )=> ( () ( (lv_op_2_0= '->' ) ) ) ) ( (lv_right_3_0= ruleArrowExpr ) )
                    {
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1324:2: ( ( ( () ( ( '->' ) ) ) )=> ( () ( (lv_op_2_0= '->' ) ) ) )
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1324:3: ( ( () ( ( '->' ) ) ) )=> ( () ( (lv_op_2_0= '->' ) ) )
                    {
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1331:6: ( () ( (lv_op_2_0= '->' ) ) )
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1331:7: () ( (lv_op_2_0= '->' ) )
                    {
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1331:7: ()
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1332:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElementAndSet(
                                  grammarAccess.getArrowExprAccess().getBinaryExprLeftAction_1_0_0_0(),
                                  current);
                          
                    }

                    }

                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1337:2: ( (lv_op_2_0= '->' ) )
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1338:1: (lv_op_2_0= '->' )
                    {
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1338:1: (lv_op_2_0= '->' )
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1339:3: lv_op_2_0= '->'
                    {
                    lv_op_2_0=(Token)match(input,37,FOLLOW_37_in_ruleArrowExpr2862); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_op_2_0, grammarAccess.getArrowExprAccess().getOpHyphenMinusGreaterThanSignKeyword_1_0_0_1_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getArrowExprRule());
                      	        }
                             		setWithLastConsumed(current, "op", lv_op_2_0, "->");
                      	    
                    }

                    }


                    }


                    }


                    }

                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1352:4: ( (lv_right_3_0= ruleArrowExpr ) )
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1353:1: (lv_right_3_0= ruleArrowExpr )
                    {
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1353:1: (lv_right_3_0= ruleArrowExpr )
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1354:3: lv_right_3_0= ruleArrowExpr
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getArrowExprAccess().getRightArrowExprParserRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleArrowExpr_in_ruleArrowExpr2898);
                    lv_right_3_0=ruleArrowExpr();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getArrowExprRule());
                      	        }
                             		set(
                             			current, 
                             			"right",
                              		lv_right_3_0, 
                              		"ArrowExpr");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleArrowExpr"


    // $ANTLR start "entryRuleImpliesExpr"
    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1378:1: entryRuleImpliesExpr returns [EObject current=null] : iv_ruleImpliesExpr= ruleImpliesExpr EOF ;
    public final EObject entryRuleImpliesExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImpliesExpr = null;


        try {
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1379:2: (iv_ruleImpliesExpr= ruleImpliesExpr EOF )
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1380:2: iv_ruleImpliesExpr= ruleImpliesExpr EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getImpliesExprRule()); 
            }
            pushFollow(FOLLOW_ruleImpliesExpr_in_entryRuleImpliesExpr2936);
            iv_ruleImpliesExpr=ruleImpliesExpr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleImpliesExpr; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleImpliesExpr2946); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleImpliesExpr"


    // $ANTLR start "ruleImpliesExpr"
    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1387:1: ruleImpliesExpr returns [EObject current=null] : (this_OrExpr_0= ruleOrExpr ( ( ( ( () ( ( '=>' ) ) ) )=> ( () ( (lv_op_2_0= '=>' ) ) ) ) ( (lv_right_3_0= ruleImpliesExpr ) ) )? ) ;
    public final EObject ruleImpliesExpr() throws RecognitionException {
        EObject current = null;

        Token lv_op_2_0=null;
        EObject this_OrExpr_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1390:28: ( (this_OrExpr_0= ruleOrExpr ( ( ( ( () ( ( '=>' ) ) ) )=> ( () ( (lv_op_2_0= '=>' ) ) ) ) ( (lv_right_3_0= ruleImpliesExpr ) ) )? ) )
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1391:1: (this_OrExpr_0= ruleOrExpr ( ( ( ( () ( ( '=>' ) ) ) )=> ( () ( (lv_op_2_0= '=>' ) ) ) ) ( (lv_right_3_0= ruleImpliesExpr ) ) )? )
            {
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1391:1: (this_OrExpr_0= ruleOrExpr ( ( ( ( () ( ( '=>' ) ) ) )=> ( () ( (lv_op_2_0= '=>' ) ) ) ) ( (lv_right_3_0= ruleImpliesExpr ) ) )? )
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1392:5: this_OrExpr_0= ruleOrExpr ( ( ( ( () ( ( '=>' ) ) ) )=> ( () ( (lv_op_2_0= '=>' ) ) ) ) ( (lv_right_3_0= ruleImpliesExpr ) ) )?
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getImpliesExprAccess().getOrExprParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleOrExpr_in_ruleImpliesExpr2993);
            this_OrExpr_0=ruleOrExpr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_OrExpr_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1400:1: ( ( ( ( () ( ( '=>' ) ) ) )=> ( () ( (lv_op_2_0= '=>' ) ) ) ) ( (lv_right_3_0= ruleImpliesExpr ) ) )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==38) ) {
                int LA20_1 = input.LA(2);

                if ( (synpred3_InternalJKind()) ) {
                    alt20=1;
                }
            }
            switch (alt20) {
                case 1 :
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1400:2: ( ( ( () ( ( '=>' ) ) ) )=> ( () ( (lv_op_2_0= '=>' ) ) ) ) ( (lv_right_3_0= ruleImpliesExpr ) )
                    {
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1400:2: ( ( ( () ( ( '=>' ) ) ) )=> ( () ( (lv_op_2_0= '=>' ) ) ) )
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1400:3: ( ( () ( ( '=>' ) ) ) )=> ( () ( (lv_op_2_0= '=>' ) ) )
                    {
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1407:6: ( () ( (lv_op_2_0= '=>' ) ) )
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1407:7: () ( (lv_op_2_0= '=>' ) )
                    {
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1407:7: ()
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1408:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElementAndSet(
                                  grammarAccess.getImpliesExprAccess().getBinaryExprLeftAction_1_0_0_0(),
                                  current);
                          
                    }

                    }

                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1413:2: ( (lv_op_2_0= '=>' ) )
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1414:1: (lv_op_2_0= '=>' )
                    {
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1414:1: (lv_op_2_0= '=>' )
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1415:3: lv_op_2_0= '=>'
                    {
                    lv_op_2_0=(Token)match(input,38,FOLLOW_38_in_ruleImpliesExpr3044); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_op_2_0, grammarAccess.getImpliesExprAccess().getOpEqualsSignGreaterThanSignKeyword_1_0_0_1_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getImpliesExprRule());
                      	        }
                             		setWithLastConsumed(current, "op", lv_op_2_0, "=>");
                      	    
                    }

                    }


                    }


                    }


                    }

                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1428:4: ( (lv_right_3_0= ruleImpliesExpr ) )
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1429:1: (lv_right_3_0= ruleImpliesExpr )
                    {
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1429:1: (lv_right_3_0= ruleImpliesExpr )
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1430:3: lv_right_3_0= ruleImpliesExpr
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getImpliesExprAccess().getRightImpliesExprParserRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleImpliesExpr_in_ruleImpliesExpr3080);
                    lv_right_3_0=ruleImpliesExpr();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getImpliesExprRule());
                      	        }
                             		set(
                             			current, 
                             			"right",
                              		lv_right_3_0, 
                              		"ImpliesExpr");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleImpliesExpr"


    // $ANTLR start "entryRuleOrExpr"
    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1454:1: entryRuleOrExpr returns [EObject current=null] : iv_ruleOrExpr= ruleOrExpr EOF ;
    public final EObject entryRuleOrExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOrExpr = null;


        try {
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1455:2: (iv_ruleOrExpr= ruleOrExpr EOF )
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1456:2: iv_ruleOrExpr= ruleOrExpr EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOrExprRule()); 
            }
            pushFollow(FOLLOW_ruleOrExpr_in_entryRuleOrExpr3118);
            iv_ruleOrExpr=ruleOrExpr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOrExpr; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOrExpr3128); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOrExpr"


    // $ANTLR start "ruleOrExpr"
    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1463:1: ruleOrExpr returns [EObject current=null] : (this_AndExpr_0= ruleAndExpr ( ( ( ( () ( ( ( 'or' | 'xor' ) ) ) ) )=> ( () ( ( (lv_op_2_1= 'or' | lv_op_2_2= 'xor' ) ) ) ) ) ( (lv_right_3_0= ruleAndExpr ) ) )* ) ;
    public final EObject ruleOrExpr() throws RecognitionException {
        EObject current = null;

        Token lv_op_2_1=null;
        Token lv_op_2_2=null;
        EObject this_AndExpr_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1466:28: ( (this_AndExpr_0= ruleAndExpr ( ( ( ( () ( ( ( 'or' | 'xor' ) ) ) ) )=> ( () ( ( (lv_op_2_1= 'or' | lv_op_2_2= 'xor' ) ) ) ) ) ( (lv_right_3_0= ruleAndExpr ) ) )* ) )
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1467:1: (this_AndExpr_0= ruleAndExpr ( ( ( ( () ( ( ( 'or' | 'xor' ) ) ) ) )=> ( () ( ( (lv_op_2_1= 'or' | lv_op_2_2= 'xor' ) ) ) ) ) ( (lv_right_3_0= ruleAndExpr ) ) )* )
            {
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1467:1: (this_AndExpr_0= ruleAndExpr ( ( ( ( () ( ( ( 'or' | 'xor' ) ) ) ) )=> ( () ( ( (lv_op_2_1= 'or' | lv_op_2_2= 'xor' ) ) ) ) ) ( (lv_right_3_0= ruleAndExpr ) ) )* )
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1468:5: this_AndExpr_0= ruleAndExpr ( ( ( ( () ( ( ( 'or' | 'xor' ) ) ) ) )=> ( () ( ( (lv_op_2_1= 'or' | lv_op_2_2= 'xor' ) ) ) ) ) ( (lv_right_3_0= ruleAndExpr ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getOrExprAccess().getAndExprParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleAndExpr_in_ruleOrExpr3175);
            this_AndExpr_0=ruleAndExpr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_AndExpr_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1476:1: ( ( ( ( () ( ( ( 'or' | 'xor' ) ) ) ) )=> ( () ( ( (lv_op_2_1= 'or' | lv_op_2_2= 'xor' ) ) ) ) ) ( (lv_right_3_0= ruleAndExpr ) ) )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==39) ) {
                    int LA22_2 = input.LA(2);

                    if ( (synpred4_InternalJKind()) ) {
                        alt22=1;
                    }


                }
                else if ( (LA22_0==40) ) {
                    int LA22_3 = input.LA(2);

                    if ( (synpred4_InternalJKind()) ) {
                        alt22=1;
                    }


                }


                switch (alt22) {
            	case 1 :
            	    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1476:2: ( ( ( () ( ( ( 'or' | 'xor' ) ) ) ) )=> ( () ( ( (lv_op_2_1= 'or' | lv_op_2_2= 'xor' ) ) ) ) ) ( (lv_right_3_0= ruleAndExpr ) )
            	    {
            	    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1476:2: ( ( ( () ( ( ( 'or' | 'xor' ) ) ) ) )=> ( () ( ( (lv_op_2_1= 'or' | lv_op_2_2= 'xor' ) ) ) ) )
            	    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1476:3: ( ( () ( ( ( 'or' | 'xor' ) ) ) ) )=> ( () ( ( (lv_op_2_1= 'or' | lv_op_2_2= 'xor' ) ) ) )
            	    {
            	    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1489:6: ( () ( ( (lv_op_2_1= 'or' | lv_op_2_2= 'xor' ) ) ) )
            	    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1489:7: () ( ( (lv_op_2_1= 'or' | lv_op_2_2= 'xor' ) ) )
            	    {
            	    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1489:7: ()
            	    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1490:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getOrExprAccess().getBinaryExprLeftAction_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1495:2: ( ( (lv_op_2_1= 'or' | lv_op_2_2= 'xor' ) ) )
            	    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1496:1: ( (lv_op_2_1= 'or' | lv_op_2_2= 'xor' ) )
            	    {
            	    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1496:1: ( (lv_op_2_1= 'or' | lv_op_2_2= 'xor' ) )
            	    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1497:1: (lv_op_2_1= 'or' | lv_op_2_2= 'xor' )
            	    {
            	    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1497:1: (lv_op_2_1= 'or' | lv_op_2_2= 'xor' )
            	    int alt21=2;
            	    int LA21_0 = input.LA(1);

            	    if ( (LA21_0==39) ) {
            	        alt21=1;
            	    }
            	    else if ( (LA21_0==40) ) {
            	        alt21=2;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 21, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt21) {
            	        case 1 :
            	            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1498:3: lv_op_2_1= 'or'
            	            {
            	            lv_op_2_1=(Token)match(input,39,FOLLOW_39_in_ruleOrExpr3247); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                      newLeafNode(lv_op_2_1, grammarAccess.getOrExprAccess().getOpOrKeyword_1_0_0_1_0_0());
            	                  
            	            }
            	            if ( state.backtracking==0 ) {

            	              	        if (current==null) {
            	              	            current = createModelElement(grammarAccess.getOrExprRule());
            	              	        }
            	                     		setWithLastConsumed(current, "op", lv_op_2_1, null);
            	              	    
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1510:8: lv_op_2_2= 'xor'
            	            {
            	            lv_op_2_2=(Token)match(input,40,FOLLOW_40_in_ruleOrExpr3276); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                      newLeafNode(lv_op_2_2, grammarAccess.getOrExprAccess().getOpXorKeyword_1_0_0_1_0_1());
            	                  
            	            }
            	            if ( state.backtracking==0 ) {

            	              	        if (current==null) {
            	              	            current = createModelElement(grammarAccess.getOrExprRule());
            	              	        }
            	                     		setWithLastConsumed(current, "op", lv_op_2_2, null);
            	              	    
            	            }

            	            }
            	            break;

            	    }


            	    }


            	    }


            	    }


            	    }

            	    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1525:4: ( (lv_right_3_0= ruleAndExpr ) )
            	    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1526:1: (lv_right_3_0= ruleAndExpr )
            	    {
            	    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1526:1: (lv_right_3_0= ruleAndExpr )
            	    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1527:3: lv_right_3_0= ruleAndExpr
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getOrExprAccess().getRightAndExprParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleAndExpr_in_ruleOrExpr3315);
            	    lv_right_3_0=ruleAndExpr();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getOrExprRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"right",
            	              		lv_right_3_0, 
            	              		"AndExpr");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOrExpr"


    // $ANTLR start "entryRuleAndExpr"
    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1551:1: entryRuleAndExpr returns [EObject current=null] : iv_ruleAndExpr= ruleAndExpr EOF ;
    public final EObject entryRuleAndExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAndExpr = null;


        try {
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1552:2: (iv_ruleAndExpr= ruleAndExpr EOF )
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1553:2: iv_ruleAndExpr= ruleAndExpr EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAndExprRule()); 
            }
            pushFollow(FOLLOW_ruleAndExpr_in_entryRuleAndExpr3353);
            iv_ruleAndExpr=ruleAndExpr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAndExpr; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAndExpr3363); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAndExpr"


    // $ANTLR start "ruleAndExpr"
    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1560:1: ruleAndExpr returns [EObject current=null] : (this_RelationalExpr_0= ruleRelationalExpr ( ( ( ( () ( ( 'and' ) ) ) )=> ( () ( (lv_op_2_0= 'and' ) ) ) ) ( (lv_right_3_0= ruleRelationalExpr ) ) )* ) ;
    public final EObject ruleAndExpr() throws RecognitionException {
        EObject current = null;

        Token lv_op_2_0=null;
        EObject this_RelationalExpr_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1563:28: ( (this_RelationalExpr_0= ruleRelationalExpr ( ( ( ( () ( ( 'and' ) ) ) )=> ( () ( (lv_op_2_0= 'and' ) ) ) ) ( (lv_right_3_0= ruleRelationalExpr ) ) )* ) )
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1564:1: (this_RelationalExpr_0= ruleRelationalExpr ( ( ( ( () ( ( 'and' ) ) ) )=> ( () ( (lv_op_2_0= 'and' ) ) ) ) ( (lv_right_3_0= ruleRelationalExpr ) ) )* )
            {
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1564:1: (this_RelationalExpr_0= ruleRelationalExpr ( ( ( ( () ( ( 'and' ) ) ) )=> ( () ( (lv_op_2_0= 'and' ) ) ) ) ( (lv_right_3_0= ruleRelationalExpr ) ) )* )
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1565:5: this_RelationalExpr_0= ruleRelationalExpr ( ( ( ( () ( ( 'and' ) ) ) )=> ( () ( (lv_op_2_0= 'and' ) ) ) ) ( (lv_right_3_0= ruleRelationalExpr ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getAndExprAccess().getRelationalExprParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleRelationalExpr_in_ruleAndExpr3410);
            this_RelationalExpr_0=ruleRelationalExpr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_RelationalExpr_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1573:1: ( ( ( ( () ( ( 'and' ) ) ) )=> ( () ( (lv_op_2_0= 'and' ) ) ) ) ( (lv_right_3_0= ruleRelationalExpr ) ) )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==41) ) {
                    int LA23_2 = input.LA(2);

                    if ( (synpred5_InternalJKind()) ) {
                        alt23=1;
                    }


                }


                switch (alt23) {
            	case 1 :
            	    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1573:2: ( ( ( () ( ( 'and' ) ) ) )=> ( () ( (lv_op_2_0= 'and' ) ) ) ) ( (lv_right_3_0= ruleRelationalExpr ) )
            	    {
            	    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1573:2: ( ( ( () ( ( 'and' ) ) ) )=> ( () ( (lv_op_2_0= 'and' ) ) ) )
            	    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1573:3: ( ( () ( ( 'and' ) ) ) )=> ( () ( (lv_op_2_0= 'and' ) ) )
            	    {
            	    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1580:6: ( () ( (lv_op_2_0= 'and' ) ) )
            	    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1580:7: () ( (lv_op_2_0= 'and' ) )
            	    {
            	    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1580:7: ()
            	    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1581:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getAndExprAccess().getBinaryExprLeftAction_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1586:2: ( (lv_op_2_0= 'and' ) )
            	    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1587:1: (lv_op_2_0= 'and' )
            	    {
            	    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1587:1: (lv_op_2_0= 'and' )
            	    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1588:3: lv_op_2_0= 'and'
            	    {
            	    lv_op_2_0=(Token)match(input,41,FOLLOW_41_in_ruleAndExpr3461); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	              newLeafNode(lv_op_2_0, grammarAccess.getAndExprAccess().getOpAndKeyword_1_0_0_1_0());
            	          
            	    }
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElement(grammarAccess.getAndExprRule());
            	      	        }
            	             		setWithLastConsumed(current, "op", lv_op_2_0, "and");
            	      	    
            	    }

            	    }


            	    }


            	    }


            	    }

            	    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1601:4: ( (lv_right_3_0= ruleRelationalExpr ) )
            	    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1602:1: (lv_right_3_0= ruleRelationalExpr )
            	    {
            	    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1602:1: (lv_right_3_0= ruleRelationalExpr )
            	    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1603:3: lv_right_3_0= ruleRelationalExpr
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getAndExprAccess().getRightRelationalExprParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleRelationalExpr_in_ruleAndExpr3497);
            	    lv_right_3_0=ruleRelationalExpr();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getAndExprRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"right",
            	              		lv_right_3_0, 
            	              		"RelationalExpr");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop23;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAndExpr"


    // $ANTLR start "entryRuleRelationalExpr"
    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1627:1: entryRuleRelationalExpr returns [EObject current=null] : iv_ruleRelationalExpr= ruleRelationalExpr EOF ;
    public final EObject entryRuleRelationalExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRelationalExpr = null;


        try {
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1628:2: (iv_ruleRelationalExpr= ruleRelationalExpr EOF )
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1629:2: iv_ruleRelationalExpr= ruleRelationalExpr EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getRelationalExprRule()); 
            }
            pushFollow(FOLLOW_ruleRelationalExpr_in_entryRuleRelationalExpr3535);
            iv_ruleRelationalExpr=ruleRelationalExpr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleRelationalExpr; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleRelationalExpr3545); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRelationalExpr"


    // $ANTLR start "ruleRelationalExpr"
    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1636:1: ruleRelationalExpr returns [EObject current=null] : (this_PlusExpr_0= rulePlusExpr ( ( ( ( () ( ( ( '<' | '<=' | '>' | '>=' | '=' | '<>' ) ) ) ) )=> ( () ( ( (lv_op_2_1= '<' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '>=' | lv_op_2_5= '=' | lv_op_2_6= '<>' ) ) ) ) ) ( (lv_right_3_0= rulePlusExpr ) ) )? ) ;
    public final EObject ruleRelationalExpr() throws RecognitionException {
        EObject current = null;

        Token lv_op_2_1=null;
        Token lv_op_2_2=null;
        Token lv_op_2_3=null;
        Token lv_op_2_4=null;
        Token lv_op_2_5=null;
        Token lv_op_2_6=null;
        EObject this_PlusExpr_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1639:28: ( (this_PlusExpr_0= rulePlusExpr ( ( ( ( () ( ( ( '<' | '<=' | '>' | '>=' | '=' | '<>' ) ) ) ) )=> ( () ( ( (lv_op_2_1= '<' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '>=' | lv_op_2_5= '=' | lv_op_2_6= '<>' ) ) ) ) ) ( (lv_right_3_0= rulePlusExpr ) ) )? ) )
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1640:1: (this_PlusExpr_0= rulePlusExpr ( ( ( ( () ( ( ( '<' | '<=' | '>' | '>=' | '=' | '<>' ) ) ) ) )=> ( () ( ( (lv_op_2_1= '<' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '>=' | lv_op_2_5= '=' | lv_op_2_6= '<>' ) ) ) ) ) ( (lv_right_3_0= rulePlusExpr ) ) )? )
            {
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1640:1: (this_PlusExpr_0= rulePlusExpr ( ( ( ( () ( ( ( '<' | '<=' | '>' | '>=' | '=' | '<>' ) ) ) ) )=> ( () ( ( (lv_op_2_1= '<' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '>=' | lv_op_2_5= '=' | lv_op_2_6= '<>' ) ) ) ) ) ( (lv_right_3_0= rulePlusExpr ) ) )? )
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1641:5: this_PlusExpr_0= rulePlusExpr ( ( ( ( () ( ( ( '<' | '<=' | '>' | '>=' | '=' | '<>' ) ) ) ) )=> ( () ( ( (lv_op_2_1= '<' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '>=' | lv_op_2_5= '=' | lv_op_2_6= '<>' ) ) ) ) ) ( (lv_right_3_0= rulePlusExpr ) ) )?
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getRelationalExprAccess().getPlusExprParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_rulePlusExpr_in_ruleRelationalExpr3592);
            this_PlusExpr_0=rulePlusExpr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_PlusExpr_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1649:1: ( ( ( ( () ( ( ( '<' | '<=' | '>' | '>=' | '=' | '<>' ) ) ) ) )=> ( () ( ( (lv_op_2_1= '<' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '>=' | lv_op_2_5= '=' | lv_op_2_6= '<>' ) ) ) ) ) ( (lv_right_3_0= rulePlusExpr ) ) )?
            int alt25=2;
            switch ( input.LA(1) ) {
                case 42:
                    {
                    int LA25_1 = input.LA(2);

                    if ( (synpred6_InternalJKind()) ) {
                        alt25=1;
                    }
                    }
                    break;
                case 43:
                    {
                    int LA25_2 = input.LA(2);

                    if ( (synpred6_InternalJKind()) ) {
                        alt25=1;
                    }
                    }
                    break;
                case 44:
                    {
                    int LA25_3 = input.LA(2);

                    if ( (synpred6_InternalJKind()) ) {
                        alt25=1;
                    }
                    }
                    break;
                case 45:
                    {
                    int LA25_4 = input.LA(2);

                    if ( (synpred6_InternalJKind()) ) {
                        alt25=1;
                    }
                    }
                    break;
                case 11:
                    {
                    int LA25_5 = input.LA(2);

                    if ( (synpred6_InternalJKind()) ) {
                        alt25=1;
                    }
                    }
                    break;
                case 46:
                    {
                    int LA25_6 = input.LA(2);

                    if ( (synpred6_InternalJKind()) ) {
                        alt25=1;
                    }
                    }
                    break;
            }

            switch (alt25) {
                case 1 :
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1649:2: ( ( ( () ( ( ( '<' | '<=' | '>' | '>=' | '=' | '<>' ) ) ) ) )=> ( () ( ( (lv_op_2_1= '<' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '>=' | lv_op_2_5= '=' | lv_op_2_6= '<>' ) ) ) ) ) ( (lv_right_3_0= rulePlusExpr ) )
                    {
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1649:2: ( ( ( () ( ( ( '<' | '<=' | '>' | '>=' | '=' | '<>' ) ) ) ) )=> ( () ( ( (lv_op_2_1= '<' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '>=' | lv_op_2_5= '=' | lv_op_2_6= '<>' ) ) ) ) )
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1649:3: ( ( () ( ( ( '<' | '<=' | '>' | '>=' | '=' | '<>' ) ) ) ) )=> ( () ( ( (lv_op_2_1= '<' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '>=' | lv_op_2_5= '=' | lv_op_2_6= '<>' ) ) ) )
                    {
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1674:6: ( () ( ( (lv_op_2_1= '<' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '>=' | lv_op_2_5= '=' | lv_op_2_6= '<>' ) ) ) )
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1674:7: () ( ( (lv_op_2_1= '<' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '>=' | lv_op_2_5= '=' | lv_op_2_6= '<>' ) ) )
                    {
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1674:7: ()
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1675:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElementAndSet(
                                  grammarAccess.getRelationalExprAccess().getBinaryExprLeftAction_1_0_0_0(),
                                  current);
                          
                    }

                    }

                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1680:2: ( ( (lv_op_2_1= '<' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '>=' | lv_op_2_5= '=' | lv_op_2_6= '<>' ) ) )
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1681:1: ( (lv_op_2_1= '<' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '>=' | lv_op_2_5= '=' | lv_op_2_6= '<>' ) )
                    {
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1681:1: ( (lv_op_2_1= '<' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '>=' | lv_op_2_5= '=' | lv_op_2_6= '<>' ) )
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1682:1: (lv_op_2_1= '<' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '>=' | lv_op_2_5= '=' | lv_op_2_6= '<>' )
                    {
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1682:1: (lv_op_2_1= '<' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '>=' | lv_op_2_5= '=' | lv_op_2_6= '<>' )
                    int alt24=6;
                    switch ( input.LA(1) ) {
                    case 42:
                        {
                        alt24=1;
                        }
                        break;
                    case 43:
                        {
                        alt24=2;
                        }
                        break;
                    case 44:
                        {
                        alt24=3;
                        }
                        break;
                    case 45:
                        {
                        alt24=4;
                        }
                        break;
                    case 11:
                        {
                        alt24=5;
                        }
                        break;
                    case 46:
                        {
                        alt24=6;
                        }
                        break;
                    default:
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 24, 0, input);

                        throw nvae;
                    }

                    switch (alt24) {
                        case 1 :
                            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1683:3: lv_op_2_1= '<'
                            {
                            lv_op_2_1=(Token)match(input,42,FOLLOW_42_in_ruleRelationalExpr3720); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                      newLeafNode(lv_op_2_1, grammarAccess.getRelationalExprAccess().getOpLessThanSignKeyword_1_0_0_1_0_0());
                                  
                            }
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElement(grammarAccess.getRelationalExprRule());
                              	        }
                                     		setWithLastConsumed(current, "op", lv_op_2_1, null);
                              	    
                            }

                            }
                            break;
                        case 2 :
                            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1695:8: lv_op_2_2= '<='
                            {
                            lv_op_2_2=(Token)match(input,43,FOLLOW_43_in_ruleRelationalExpr3749); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                      newLeafNode(lv_op_2_2, grammarAccess.getRelationalExprAccess().getOpLessThanSignEqualsSignKeyword_1_0_0_1_0_1());
                                  
                            }
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElement(grammarAccess.getRelationalExprRule());
                              	        }
                                     		setWithLastConsumed(current, "op", lv_op_2_2, null);
                              	    
                            }

                            }
                            break;
                        case 3 :
                            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1707:8: lv_op_2_3= '>'
                            {
                            lv_op_2_3=(Token)match(input,44,FOLLOW_44_in_ruleRelationalExpr3778); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                      newLeafNode(lv_op_2_3, grammarAccess.getRelationalExprAccess().getOpGreaterThanSignKeyword_1_0_0_1_0_2());
                                  
                            }
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElement(grammarAccess.getRelationalExprRule());
                              	        }
                                     		setWithLastConsumed(current, "op", lv_op_2_3, null);
                              	    
                            }

                            }
                            break;
                        case 4 :
                            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1719:8: lv_op_2_4= '>='
                            {
                            lv_op_2_4=(Token)match(input,45,FOLLOW_45_in_ruleRelationalExpr3807); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                      newLeafNode(lv_op_2_4, grammarAccess.getRelationalExprAccess().getOpGreaterThanSignEqualsSignKeyword_1_0_0_1_0_3());
                                  
                            }
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElement(grammarAccess.getRelationalExprRule());
                              	        }
                                     		setWithLastConsumed(current, "op", lv_op_2_4, null);
                              	    
                            }

                            }
                            break;
                        case 5 :
                            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1731:8: lv_op_2_5= '='
                            {
                            lv_op_2_5=(Token)match(input,11,FOLLOW_11_in_ruleRelationalExpr3836); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                      newLeafNode(lv_op_2_5, grammarAccess.getRelationalExprAccess().getOpEqualsSignKeyword_1_0_0_1_0_4());
                                  
                            }
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElement(grammarAccess.getRelationalExprRule());
                              	        }
                                     		setWithLastConsumed(current, "op", lv_op_2_5, null);
                              	    
                            }

                            }
                            break;
                        case 6 :
                            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1743:8: lv_op_2_6= '<>'
                            {
                            lv_op_2_6=(Token)match(input,46,FOLLOW_46_in_ruleRelationalExpr3865); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                      newLeafNode(lv_op_2_6, grammarAccess.getRelationalExprAccess().getOpLessThanSignGreaterThanSignKeyword_1_0_0_1_0_5());
                                  
                            }
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElement(grammarAccess.getRelationalExprRule());
                              	        }
                                     		setWithLastConsumed(current, "op", lv_op_2_6, null);
                              	    
                            }

                            }
                            break;

                    }


                    }


                    }


                    }


                    }

                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1758:4: ( (lv_right_3_0= rulePlusExpr ) )
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1759:1: (lv_right_3_0= rulePlusExpr )
                    {
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1759:1: (lv_right_3_0= rulePlusExpr )
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1760:3: lv_right_3_0= rulePlusExpr
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getRelationalExprAccess().getRightPlusExprParserRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_rulePlusExpr_in_ruleRelationalExpr3904);
                    lv_right_3_0=rulePlusExpr();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getRelationalExprRule());
                      	        }
                             		set(
                             			current, 
                             			"right",
                              		lv_right_3_0, 
                              		"PlusExpr");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRelationalExpr"


    // $ANTLR start "entryRulePlusExpr"
    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1784:1: entryRulePlusExpr returns [EObject current=null] : iv_rulePlusExpr= rulePlusExpr EOF ;
    public final EObject entryRulePlusExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePlusExpr = null;


        try {
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1785:2: (iv_rulePlusExpr= rulePlusExpr EOF )
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1786:2: iv_rulePlusExpr= rulePlusExpr EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPlusExprRule()); 
            }
            pushFollow(FOLLOW_rulePlusExpr_in_entryRulePlusExpr3942);
            iv_rulePlusExpr=rulePlusExpr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePlusExpr; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulePlusExpr3952); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePlusExpr"


    // $ANTLR start "rulePlusExpr"
    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1793:1: rulePlusExpr returns [EObject current=null] : (this_TimesExpr_0= ruleTimesExpr ( ( ( ( () ( ( ( '+' | '-' ) ) ) ) )=> ( () ( ( (lv_op_2_1= '+' | lv_op_2_2= '-' ) ) ) ) ) ( (lv_right_3_0= ruleTimesExpr ) ) )* ) ;
    public final EObject rulePlusExpr() throws RecognitionException {
        EObject current = null;

        Token lv_op_2_1=null;
        Token lv_op_2_2=null;
        EObject this_TimesExpr_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1796:28: ( (this_TimesExpr_0= ruleTimesExpr ( ( ( ( () ( ( ( '+' | '-' ) ) ) ) )=> ( () ( ( (lv_op_2_1= '+' | lv_op_2_2= '-' ) ) ) ) ) ( (lv_right_3_0= ruleTimesExpr ) ) )* ) )
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1797:1: (this_TimesExpr_0= ruleTimesExpr ( ( ( ( () ( ( ( '+' | '-' ) ) ) ) )=> ( () ( ( (lv_op_2_1= '+' | lv_op_2_2= '-' ) ) ) ) ) ( (lv_right_3_0= ruleTimesExpr ) ) )* )
            {
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1797:1: (this_TimesExpr_0= ruleTimesExpr ( ( ( ( () ( ( ( '+' | '-' ) ) ) ) )=> ( () ( ( (lv_op_2_1= '+' | lv_op_2_2= '-' ) ) ) ) ) ( (lv_right_3_0= ruleTimesExpr ) ) )* )
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1798:5: this_TimesExpr_0= ruleTimesExpr ( ( ( ( () ( ( ( '+' | '-' ) ) ) ) )=> ( () ( ( (lv_op_2_1= '+' | lv_op_2_2= '-' ) ) ) ) ) ( (lv_right_3_0= ruleTimesExpr ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getPlusExprAccess().getTimesExprParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleTimesExpr_in_rulePlusExpr3999);
            this_TimesExpr_0=ruleTimesExpr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_TimesExpr_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1806:1: ( ( ( ( () ( ( ( '+' | '-' ) ) ) ) )=> ( () ( ( (lv_op_2_1= '+' | lv_op_2_2= '-' ) ) ) ) ) ( (lv_right_3_0= ruleTimesExpr ) ) )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==47) ) {
                    int LA27_2 = input.LA(2);

                    if ( (synpred7_InternalJKind()) ) {
                        alt27=1;
                    }


                }
                else if ( (LA27_0==25) ) {
                    int LA27_3 = input.LA(2);

                    if ( (synpred7_InternalJKind()) ) {
                        alt27=1;
                    }


                }


                switch (alt27) {
            	case 1 :
            	    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1806:2: ( ( ( () ( ( ( '+' | '-' ) ) ) ) )=> ( () ( ( (lv_op_2_1= '+' | lv_op_2_2= '-' ) ) ) ) ) ( (lv_right_3_0= ruleTimesExpr ) )
            	    {
            	    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1806:2: ( ( ( () ( ( ( '+' | '-' ) ) ) ) )=> ( () ( ( (lv_op_2_1= '+' | lv_op_2_2= '-' ) ) ) ) )
            	    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1806:3: ( ( () ( ( ( '+' | '-' ) ) ) ) )=> ( () ( ( (lv_op_2_1= '+' | lv_op_2_2= '-' ) ) ) )
            	    {
            	    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1819:6: ( () ( ( (lv_op_2_1= '+' | lv_op_2_2= '-' ) ) ) )
            	    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1819:7: () ( ( (lv_op_2_1= '+' | lv_op_2_2= '-' ) ) )
            	    {
            	    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1819:7: ()
            	    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1820:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getPlusExprAccess().getBinaryExprLeftAction_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1825:2: ( ( (lv_op_2_1= '+' | lv_op_2_2= '-' ) ) )
            	    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1826:1: ( (lv_op_2_1= '+' | lv_op_2_2= '-' ) )
            	    {
            	    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1826:1: ( (lv_op_2_1= '+' | lv_op_2_2= '-' ) )
            	    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1827:1: (lv_op_2_1= '+' | lv_op_2_2= '-' )
            	    {
            	    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1827:1: (lv_op_2_1= '+' | lv_op_2_2= '-' )
            	    int alt26=2;
            	    int LA26_0 = input.LA(1);

            	    if ( (LA26_0==47) ) {
            	        alt26=1;
            	    }
            	    else if ( (LA26_0==25) ) {
            	        alt26=2;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 26, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt26) {
            	        case 1 :
            	            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1828:3: lv_op_2_1= '+'
            	            {
            	            lv_op_2_1=(Token)match(input,47,FOLLOW_47_in_rulePlusExpr4071); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                      newLeafNode(lv_op_2_1, grammarAccess.getPlusExprAccess().getOpPlusSignKeyword_1_0_0_1_0_0());
            	                  
            	            }
            	            if ( state.backtracking==0 ) {

            	              	        if (current==null) {
            	              	            current = createModelElement(grammarAccess.getPlusExprRule());
            	              	        }
            	                     		setWithLastConsumed(current, "op", lv_op_2_1, null);
            	              	    
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1840:8: lv_op_2_2= '-'
            	            {
            	            lv_op_2_2=(Token)match(input,25,FOLLOW_25_in_rulePlusExpr4100); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                      newLeafNode(lv_op_2_2, grammarAccess.getPlusExprAccess().getOpHyphenMinusKeyword_1_0_0_1_0_1());
            	                  
            	            }
            	            if ( state.backtracking==0 ) {

            	              	        if (current==null) {
            	              	            current = createModelElement(grammarAccess.getPlusExprRule());
            	              	        }
            	                     		setWithLastConsumed(current, "op", lv_op_2_2, null);
            	              	    
            	            }

            	            }
            	            break;

            	    }


            	    }


            	    }


            	    }


            	    }

            	    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1855:4: ( (lv_right_3_0= ruleTimesExpr ) )
            	    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1856:1: (lv_right_3_0= ruleTimesExpr )
            	    {
            	    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1856:1: (lv_right_3_0= ruleTimesExpr )
            	    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1857:3: lv_right_3_0= ruleTimesExpr
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getPlusExprAccess().getRightTimesExprParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleTimesExpr_in_rulePlusExpr4139);
            	    lv_right_3_0=ruleTimesExpr();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getPlusExprRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"right",
            	              		lv_right_3_0, 
            	              		"TimesExpr");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop27;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePlusExpr"


    // $ANTLR start "entryRuleTimesExpr"
    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1881:1: entryRuleTimesExpr returns [EObject current=null] : iv_ruleTimesExpr= ruleTimesExpr EOF ;
    public final EObject entryRuleTimesExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTimesExpr = null;


        try {
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1882:2: (iv_ruleTimesExpr= ruleTimesExpr EOF )
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1883:2: iv_ruleTimesExpr= ruleTimesExpr EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTimesExprRule()); 
            }
            pushFollow(FOLLOW_ruleTimesExpr_in_entryRuleTimesExpr4177);
            iv_ruleTimesExpr=ruleTimesExpr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTimesExpr; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleTimesExpr4187); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTimesExpr"


    // $ANTLR start "ruleTimesExpr"
    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1890:1: ruleTimesExpr returns [EObject current=null] : (this_PrefixExpr_0= rulePrefixExpr ( ( ( ( () ( ( ( '*' | '/' | 'div' | 'mod' ) ) ) ) )=> ( () ( ( (lv_op_2_1= '*' | lv_op_2_2= '/' | lv_op_2_3= 'div' | lv_op_2_4= 'mod' ) ) ) ) ) ( (lv_right_3_0= rulePrefixExpr ) ) )* ) ;
    public final EObject ruleTimesExpr() throws RecognitionException {
        EObject current = null;

        Token lv_op_2_1=null;
        Token lv_op_2_2=null;
        Token lv_op_2_3=null;
        Token lv_op_2_4=null;
        EObject this_PrefixExpr_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1893:28: ( (this_PrefixExpr_0= rulePrefixExpr ( ( ( ( () ( ( ( '*' | '/' | 'div' | 'mod' ) ) ) ) )=> ( () ( ( (lv_op_2_1= '*' | lv_op_2_2= '/' | lv_op_2_3= 'div' | lv_op_2_4= 'mod' ) ) ) ) ) ( (lv_right_3_0= rulePrefixExpr ) ) )* ) )
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1894:1: (this_PrefixExpr_0= rulePrefixExpr ( ( ( ( () ( ( ( '*' | '/' | 'div' | 'mod' ) ) ) ) )=> ( () ( ( (lv_op_2_1= '*' | lv_op_2_2= '/' | lv_op_2_3= 'div' | lv_op_2_4= 'mod' ) ) ) ) ) ( (lv_right_3_0= rulePrefixExpr ) ) )* )
            {
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1894:1: (this_PrefixExpr_0= rulePrefixExpr ( ( ( ( () ( ( ( '*' | '/' | 'div' | 'mod' ) ) ) ) )=> ( () ( ( (lv_op_2_1= '*' | lv_op_2_2= '/' | lv_op_2_3= 'div' | lv_op_2_4= 'mod' ) ) ) ) ) ( (lv_right_3_0= rulePrefixExpr ) ) )* )
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1895:5: this_PrefixExpr_0= rulePrefixExpr ( ( ( ( () ( ( ( '*' | '/' | 'div' | 'mod' ) ) ) ) )=> ( () ( ( (lv_op_2_1= '*' | lv_op_2_2= '/' | lv_op_2_3= 'div' | lv_op_2_4= 'mod' ) ) ) ) ) ( (lv_right_3_0= rulePrefixExpr ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getTimesExprAccess().getPrefixExprParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_rulePrefixExpr_in_ruleTimesExpr4234);
            this_PrefixExpr_0=rulePrefixExpr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_PrefixExpr_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1903:1: ( ( ( ( () ( ( ( '*' | '/' | 'div' | 'mod' ) ) ) ) )=> ( () ( ( (lv_op_2_1= '*' | lv_op_2_2= '/' | lv_op_2_3= 'div' | lv_op_2_4= 'mod' ) ) ) ) ) ( (lv_right_3_0= rulePrefixExpr ) ) )*
            loop29:
            do {
                int alt29=2;
                switch ( input.LA(1) ) {
                case 48:
                    {
                    int LA29_2 = input.LA(2);

                    if ( (synpred8_InternalJKind()) ) {
                        alt29=1;
                    }


                    }
                    break;
                case 49:
                    {
                    int LA29_3 = input.LA(2);

                    if ( (synpred8_InternalJKind()) ) {
                        alt29=1;
                    }


                    }
                    break;
                case 50:
                    {
                    int LA29_4 = input.LA(2);

                    if ( (synpred8_InternalJKind()) ) {
                        alt29=1;
                    }


                    }
                    break;
                case 51:
                    {
                    int LA29_5 = input.LA(2);

                    if ( (synpred8_InternalJKind()) ) {
                        alt29=1;
                    }


                    }
                    break;

                }

                switch (alt29) {
            	case 1 :
            	    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1903:2: ( ( ( () ( ( ( '*' | '/' | 'div' | 'mod' ) ) ) ) )=> ( () ( ( (lv_op_2_1= '*' | lv_op_2_2= '/' | lv_op_2_3= 'div' | lv_op_2_4= 'mod' ) ) ) ) ) ( (lv_right_3_0= rulePrefixExpr ) )
            	    {
            	    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1903:2: ( ( ( () ( ( ( '*' | '/' | 'div' | 'mod' ) ) ) ) )=> ( () ( ( (lv_op_2_1= '*' | lv_op_2_2= '/' | lv_op_2_3= 'div' | lv_op_2_4= 'mod' ) ) ) ) )
            	    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1903:3: ( ( () ( ( ( '*' | '/' | 'div' | 'mod' ) ) ) ) )=> ( () ( ( (lv_op_2_1= '*' | lv_op_2_2= '/' | lv_op_2_3= 'div' | lv_op_2_4= 'mod' ) ) ) )
            	    {
            	    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1922:6: ( () ( ( (lv_op_2_1= '*' | lv_op_2_2= '/' | lv_op_2_3= 'div' | lv_op_2_4= 'mod' ) ) ) )
            	    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1922:7: () ( ( (lv_op_2_1= '*' | lv_op_2_2= '/' | lv_op_2_3= 'div' | lv_op_2_4= 'mod' ) ) )
            	    {
            	    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1922:7: ()
            	    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1923:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getTimesExprAccess().getBinaryExprLeftAction_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1928:2: ( ( (lv_op_2_1= '*' | lv_op_2_2= '/' | lv_op_2_3= 'div' | lv_op_2_4= 'mod' ) ) )
            	    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1929:1: ( (lv_op_2_1= '*' | lv_op_2_2= '/' | lv_op_2_3= 'div' | lv_op_2_4= 'mod' ) )
            	    {
            	    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1929:1: ( (lv_op_2_1= '*' | lv_op_2_2= '/' | lv_op_2_3= 'div' | lv_op_2_4= 'mod' ) )
            	    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1930:1: (lv_op_2_1= '*' | lv_op_2_2= '/' | lv_op_2_3= 'div' | lv_op_2_4= 'mod' )
            	    {
            	    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1930:1: (lv_op_2_1= '*' | lv_op_2_2= '/' | lv_op_2_3= 'div' | lv_op_2_4= 'mod' )
            	    int alt28=4;
            	    switch ( input.LA(1) ) {
            	    case 48:
            	        {
            	        alt28=1;
            	        }
            	        break;
            	    case 49:
            	        {
            	        alt28=2;
            	        }
            	        break;
            	    case 50:
            	        {
            	        alt28=3;
            	        }
            	        break;
            	    case 51:
            	        {
            	        alt28=4;
            	        }
            	        break;
            	    default:
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 28, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt28) {
            	        case 1 :
            	            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1931:3: lv_op_2_1= '*'
            	            {
            	            lv_op_2_1=(Token)match(input,48,FOLLOW_48_in_ruleTimesExpr4334); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                      newLeafNode(lv_op_2_1, grammarAccess.getTimesExprAccess().getOpAsteriskKeyword_1_0_0_1_0_0());
            	                  
            	            }
            	            if ( state.backtracking==0 ) {

            	              	        if (current==null) {
            	              	            current = createModelElement(grammarAccess.getTimesExprRule());
            	              	        }
            	                     		setWithLastConsumed(current, "op", lv_op_2_1, null);
            	              	    
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1943:8: lv_op_2_2= '/'
            	            {
            	            lv_op_2_2=(Token)match(input,49,FOLLOW_49_in_ruleTimesExpr4363); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                      newLeafNode(lv_op_2_2, grammarAccess.getTimesExprAccess().getOpSolidusKeyword_1_0_0_1_0_1());
            	                  
            	            }
            	            if ( state.backtracking==0 ) {

            	              	        if (current==null) {
            	              	            current = createModelElement(grammarAccess.getTimesExprRule());
            	              	        }
            	                     		setWithLastConsumed(current, "op", lv_op_2_2, null);
            	              	    
            	            }

            	            }
            	            break;
            	        case 3 :
            	            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1955:8: lv_op_2_3= 'div'
            	            {
            	            lv_op_2_3=(Token)match(input,50,FOLLOW_50_in_ruleTimesExpr4392); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                      newLeafNode(lv_op_2_3, grammarAccess.getTimesExprAccess().getOpDivKeyword_1_0_0_1_0_2());
            	                  
            	            }
            	            if ( state.backtracking==0 ) {

            	              	        if (current==null) {
            	              	            current = createModelElement(grammarAccess.getTimesExprRule());
            	              	        }
            	                     		setWithLastConsumed(current, "op", lv_op_2_3, null);
            	              	    
            	            }

            	            }
            	            break;
            	        case 4 :
            	            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1967:8: lv_op_2_4= 'mod'
            	            {
            	            lv_op_2_4=(Token)match(input,51,FOLLOW_51_in_ruleTimesExpr4421); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                      newLeafNode(lv_op_2_4, grammarAccess.getTimesExprAccess().getOpModKeyword_1_0_0_1_0_3());
            	                  
            	            }
            	            if ( state.backtracking==0 ) {

            	              	        if (current==null) {
            	              	            current = createModelElement(grammarAccess.getTimesExprRule());
            	              	        }
            	                     		setWithLastConsumed(current, "op", lv_op_2_4, null);
            	              	    
            	            }

            	            }
            	            break;

            	    }


            	    }


            	    }


            	    }


            	    }

            	    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1982:4: ( (lv_right_3_0= rulePrefixExpr ) )
            	    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1983:1: (lv_right_3_0= rulePrefixExpr )
            	    {
            	    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1983:1: (lv_right_3_0= rulePrefixExpr )
            	    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1984:3: lv_right_3_0= rulePrefixExpr
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getTimesExprAccess().getRightPrefixExprParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_rulePrefixExpr_in_ruleTimesExpr4460);
            	    lv_right_3_0=rulePrefixExpr();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getTimesExprRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"right",
            	              		lv_right_3_0, 
            	              		"PrefixExpr");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop29;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTimesExpr"


    // $ANTLR start "entryRulePrefixExpr"
    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2008:1: entryRulePrefixExpr returns [EObject current=null] : iv_rulePrefixExpr= rulePrefixExpr EOF ;
    public final EObject entryRulePrefixExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrefixExpr = null;


        try {
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2009:2: (iv_rulePrefixExpr= rulePrefixExpr EOF )
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2010:2: iv_rulePrefixExpr= rulePrefixExpr EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPrefixExprRule()); 
            }
            pushFollow(FOLLOW_rulePrefixExpr_in_entryRulePrefixExpr4498);
            iv_rulePrefixExpr=rulePrefixExpr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePrefixExpr; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulePrefixExpr4508); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePrefixExpr"


    // $ANTLR start "rulePrefixExpr"
    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2017:1: rulePrefixExpr returns [EObject current=null] : ( ( () ( ( (lv_op_1_1= '-' | lv_op_1_2= 'not' | lv_op_1_3= 'pre' ) ) ) ( (lv_expr_2_0= rulePrefixExpr ) ) ) | this_ProjectionExpr_3= ruleProjectionExpr ) ;
    public final EObject rulePrefixExpr() throws RecognitionException {
        EObject current = null;

        Token lv_op_1_1=null;
        Token lv_op_1_2=null;
        Token lv_op_1_3=null;
        EObject lv_expr_2_0 = null;

        EObject this_ProjectionExpr_3 = null;


         enterRule(); 
            
        try {
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2020:28: ( ( ( () ( ( (lv_op_1_1= '-' | lv_op_1_2= 'not' | lv_op_1_3= 'pre' ) ) ) ( (lv_expr_2_0= rulePrefixExpr ) ) ) | this_ProjectionExpr_3= ruleProjectionExpr ) )
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2021:1: ( ( () ( ( (lv_op_1_1= '-' | lv_op_1_2= 'not' | lv_op_1_3= 'pre' ) ) ) ( (lv_expr_2_0= rulePrefixExpr ) ) ) | this_ProjectionExpr_3= ruleProjectionExpr )
            {
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2021:1: ( ( () ( ( (lv_op_1_1= '-' | lv_op_1_2= 'not' | lv_op_1_3= 'pre' ) ) ) ( (lv_expr_2_0= rulePrefixExpr ) ) ) | this_ProjectionExpr_3= ruleProjectionExpr )
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==25||(LA31_0>=52 && LA31_0<=53)) ) {
                alt31=1;
            }
            else if ( ((LA31_0>=RULE_ID && LA31_0<=RULE_INT)||LA31_0==19||LA31_0==28||LA31_0==55||(LA31_0>=58 && LA31_0<=61)) ) {
                alt31=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 31, 0, input);

                throw nvae;
            }
            switch (alt31) {
                case 1 :
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2021:2: ( () ( ( (lv_op_1_1= '-' | lv_op_1_2= 'not' | lv_op_1_3= 'pre' ) ) ) ( (lv_expr_2_0= rulePrefixExpr ) ) )
                    {
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2021:2: ( () ( ( (lv_op_1_1= '-' | lv_op_1_2= 'not' | lv_op_1_3= 'pre' ) ) ) ( (lv_expr_2_0= rulePrefixExpr ) ) )
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2021:3: () ( ( (lv_op_1_1= '-' | lv_op_1_2= 'not' | lv_op_1_3= 'pre' ) ) ) ( (lv_expr_2_0= rulePrefixExpr ) )
                    {
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2021:3: ()
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2022:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getPrefixExprAccess().getUnaryExprAction_0_0(),
                                  current);
                          
                    }

                    }

                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2027:2: ( ( (lv_op_1_1= '-' | lv_op_1_2= 'not' | lv_op_1_3= 'pre' ) ) )
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2028:1: ( (lv_op_1_1= '-' | lv_op_1_2= 'not' | lv_op_1_3= 'pre' ) )
                    {
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2028:1: ( (lv_op_1_1= '-' | lv_op_1_2= 'not' | lv_op_1_3= 'pre' ) )
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2029:1: (lv_op_1_1= '-' | lv_op_1_2= 'not' | lv_op_1_3= 'pre' )
                    {
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2029:1: (lv_op_1_1= '-' | lv_op_1_2= 'not' | lv_op_1_3= 'pre' )
                    int alt30=3;
                    switch ( input.LA(1) ) {
                    case 25:
                        {
                        alt30=1;
                        }
                        break;
                    case 52:
                        {
                        alt30=2;
                        }
                        break;
                    case 53:
                        {
                        alt30=3;
                        }
                        break;
                    default:
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 30, 0, input);

                        throw nvae;
                    }

                    switch (alt30) {
                        case 1 :
                            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2030:3: lv_op_1_1= '-'
                            {
                            lv_op_1_1=(Token)match(input,25,FOLLOW_25_in_rulePrefixExpr4563); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                      newLeafNode(lv_op_1_1, grammarAccess.getPrefixExprAccess().getOpHyphenMinusKeyword_0_1_0_0());
                                  
                            }
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElement(grammarAccess.getPrefixExprRule());
                              	        }
                                     		setWithLastConsumed(current, "op", lv_op_1_1, null);
                              	    
                            }

                            }
                            break;
                        case 2 :
                            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2042:8: lv_op_1_2= 'not'
                            {
                            lv_op_1_2=(Token)match(input,52,FOLLOW_52_in_rulePrefixExpr4592); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                      newLeafNode(lv_op_1_2, grammarAccess.getPrefixExprAccess().getOpNotKeyword_0_1_0_1());
                                  
                            }
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElement(grammarAccess.getPrefixExprRule());
                              	        }
                                     		setWithLastConsumed(current, "op", lv_op_1_2, null);
                              	    
                            }

                            }
                            break;
                        case 3 :
                            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2054:8: lv_op_1_3= 'pre'
                            {
                            lv_op_1_3=(Token)match(input,53,FOLLOW_53_in_rulePrefixExpr4621); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                      newLeafNode(lv_op_1_3, grammarAccess.getPrefixExprAccess().getOpPreKeyword_0_1_0_2());
                                  
                            }
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElement(grammarAccess.getPrefixExprRule());
                              	        }
                                     		setWithLastConsumed(current, "op", lv_op_1_3, null);
                              	    
                            }

                            }
                            break;

                    }


                    }


                    }

                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2069:2: ( (lv_expr_2_0= rulePrefixExpr ) )
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2070:1: (lv_expr_2_0= rulePrefixExpr )
                    {
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2070:1: (lv_expr_2_0= rulePrefixExpr )
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2071:3: lv_expr_2_0= rulePrefixExpr
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getPrefixExprAccess().getExprPrefixExprParserRuleCall_0_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_rulePrefixExpr_in_rulePrefixExpr4658);
                    lv_expr_2_0=rulePrefixExpr();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getPrefixExprRule());
                      	        }
                             		set(
                             			current, 
                             			"expr",
                              		lv_expr_2_0, 
                              		"PrefixExpr");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2089:5: this_ProjectionExpr_3= ruleProjectionExpr
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getPrefixExprAccess().getProjectionExprParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleProjectionExpr_in_rulePrefixExpr4687);
                    this_ProjectionExpr_3=ruleProjectionExpr();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_ProjectionExpr_3; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePrefixExpr"


    // $ANTLR start "entryRuleProjectionExpr"
    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2105:1: entryRuleProjectionExpr returns [EObject current=null] : iv_ruleProjectionExpr= ruleProjectionExpr EOF ;
    public final EObject entryRuleProjectionExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProjectionExpr = null;


        try {
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2106:2: (iv_ruleProjectionExpr= ruleProjectionExpr EOF )
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2107:2: iv_ruleProjectionExpr= ruleProjectionExpr EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getProjectionExprRule()); 
            }
            pushFollow(FOLLOW_ruleProjectionExpr_in_entryRuleProjectionExpr4722);
            iv_ruleProjectionExpr=ruleProjectionExpr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleProjectionExpr; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleProjectionExpr4732); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleProjectionExpr"


    // $ANTLR start "ruleProjectionExpr"
    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2114:1: ruleProjectionExpr returns [EObject current=null] : (this_AtomicExpr_0= ruleAtomicExpr ( ( ( ( () '.' ) )=> ( () otherlv_2= '.' ) ) ( (otherlv_3= RULE_ID ) ) )* ) ;
    public final EObject ruleProjectionExpr() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_3=null;
        EObject this_AtomicExpr_0 = null;


         enterRule(); 
            
        try {
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2117:28: ( (this_AtomicExpr_0= ruleAtomicExpr ( ( ( ( () '.' ) )=> ( () otherlv_2= '.' ) ) ( (otherlv_3= RULE_ID ) ) )* ) )
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2118:1: (this_AtomicExpr_0= ruleAtomicExpr ( ( ( ( () '.' ) )=> ( () otherlv_2= '.' ) ) ( (otherlv_3= RULE_ID ) ) )* )
            {
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2118:1: (this_AtomicExpr_0= ruleAtomicExpr ( ( ( ( () '.' ) )=> ( () otherlv_2= '.' ) ) ( (otherlv_3= RULE_ID ) ) )* )
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2119:5: this_AtomicExpr_0= ruleAtomicExpr ( ( ( ( () '.' ) )=> ( () otherlv_2= '.' ) ) ( (otherlv_3= RULE_ID ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getProjectionExprAccess().getAtomicExprParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleAtomicExpr_in_ruleProjectionExpr4779);
            this_AtomicExpr_0=ruleAtomicExpr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_AtomicExpr_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2127:1: ( ( ( ( () '.' ) )=> ( () otherlv_2= '.' ) ) ( (otherlv_3= RULE_ID ) ) )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( (LA32_0==54) ) {
                    int LA32_2 = input.LA(2);

                    if ( (synpred9_InternalJKind()) ) {
                        alt32=1;
                    }


                }


                switch (alt32) {
            	case 1 :
            	    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2127:2: ( ( ( () '.' ) )=> ( () otherlv_2= '.' ) ) ( (otherlv_3= RULE_ID ) )
            	    {
            	    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2127:2: ( ( ( () '.' ) )=> ( () otherlv_2= '.' ) )
            	    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2127:3: ( ( () '.' ) )=> ( () otherlv_2= '.' )
            	    {
            	    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2129:5: ( () otherlv_2= '.' )
            	    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2129:6: () otherlv_2= '.'
            	    {
            	    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2129:6: ()
            	    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2130:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getProjectionExprAccess().getProjectionExprExprAction_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    otherlv_2=(Token)match(input,54,FOLLOW_54_in_ruleProjectionExpr4814); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getProjectionExprAccess().getFullStopKeyword_1_0_0_1());
            	          
            	    }

            	    }


            	    }

            	    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2139:3: ( (otherlv_3= RULE_ID ) )
            	    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2140:1: (otherlv_3= RULE_ID )
            	    {
            	    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2140:1: (otherlv_3= RULE_ID )
            	    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2141:3: otherlv_3= RULE_ID
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getProjectionExprRule());
            	      	        }
            	              
            	    }
            	    otherlv_3=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleProjectionExpr4836); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		newLeafNode(otherlv_3, grammarAccess.getProjectionExprAccess().getFieldFieldCrossReference_1_1_0()); 
            	      	
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop32;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleProjectionExpr"


    // $ANTLR start "entryRuleAtomicExpr"
    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2160:1: entryRuleAtomicExpr returns [EObject current=null] : iv_ruleAtomicExpr= ruleAtomicExpr EOF ;
    public final EObject entryRuleAtomicExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAtomicExpr = null;


        try {
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2161:2: (iv_ruleAtomicExpr= ruleAtomicExpr EOF )
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2162:2: iv_ruleAtomicExpr= ruleAtomicExpr EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAtomicExprRule()); 
            }
            pushFollow(FOLLOW_ruleAtomicExpr_in_entryRuleAtomicExpr4874);
            iv_ruleAtomicExpr=ruleAtomicExpr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAtomicExpr; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAtomicExpr4884); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAtomicExpr"


    // $ANTLR start "ruleAtomicExpr"
    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2169:1: ruleAtomicExpr returns [EObject current=null] : ( ( () ( (otherlv_1= RULE_ID ) ) ) | ( () ( (lv_val_3_0= RULE_INT ) ) ) | ( () ( (lv_val_5_0= ruleREAL ) ) ) | ( () ( (lv_val_7_0= ruleBOOL ) ) ) | ( () otherlv_9= 'if' ( (lv_cond_10_0= ruleExpr ) ) otherlv_11= 'then' ( (lv_then_12_0= ruleExpr ) ) otherlv_13= 'else' ( (lv_else_14_0= ruleExpr ) ) ) | ( () ( ( (lv_op_16_1= 'real' | lv_op_16_2= 'floor' ) ) ) otherlv_17= '(' ( (lv_expr_18_0= ruleExpr ) ) otherlv_19= ')' ) | this_NodeCallExpr_20= ruleNodeCallExpr | ( () otherlv_22= 'condact' otherlv_23= '(' ( (lv_clock_24_0= ruleExpr ) ) otherlv_25= ',' ( (lv_call_26_0= ruleNodeCallExpr ) ) (otherlv_27= ',' ( (lv_args_28_0= ruleExpr ) ) )* otherlv_29= ')' ) | ( () ( (otherlv_31= RULE_ID ) ) otherlv_32= '{' ( (otherlv_33= RULE_ID ) ) otherlv_34= '=' ( (lv_exprs_35_0= ruleExpr ) ) (otherlv_36= ';' ( (otherlv_37= RULE_ID ) ) otherlv_38= '=' ( (lv_exprs_39_0= ruleExpr ) ) )* otherlv_40= '}' ) | (otherlv_41= '(' this_Expr_42= ruleExpr otherlv_43= ')' ) ) ;
    public final EObject ruleAtomicExpr() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_val_3_0=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token lv_op_16_1=null;
        Token lv_op_16_2=null;
        Token otherlv_17=null;
        Token otherlv_19=null;
        Token otherlv_22=null;
        Token otherlv_23=null;
        Token otherlv_25=null;
        Token otherlv_27=null;
        Token otherlv_29=null;
        Token otherlv_31=null;
        Token otherlv_32=null;
        Token otherlv_33=null;
        Token otherlv_34=null;
        Token otherlv_36=null;
        Token otherlv_37=null;
        Token otherlv_38=null;
        Token otherlv_40=null;
        Token otherlv_41=null;
        Token otherlv_43=null;
        AntlrDatatypeRuleToken lv_val_5_0 = null;

        AntlrDatatypeRuleToken lv_val_7_0 = null;

        EObject lv_cond_10_0 = null;

        EObject lv_then_12_0 = null;

        EObject lv_else_14_0 = null;

        EObject lv_expr_18_0 = null;

        EObject this_NodeCallExpr_20 = null;

        EObject lv_clock_24_0 = null;

        EObject lv_call_26_0 = null;

        EObject lv_args_28_0 = null;

        EObject lv_exprs_35_0 = null;

        EObject lv_exprs_39_0 = null;

        EObject this_Expr_42 = null;


         enterRule(); 
            
        try {
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2172:28: ( ( ( () ( (otherlv_1= RULE_ID ) ) ) | ( () ( (lv_val_3_0= RULE_INT ) ) ) | ( () ( (lv_val_5_0= ruleREAL ) ) ) | ( () ( (lv_val_7_0= ruleBOOL ) ) ) | ( () otherlv_9= 'if' ( (lv_cond_10_0= ruleExpr ) ) otherlv_11= 'then' ( (lv_then_12_0= ruleExpr ) ) otherlv_13= 'else' ( (lv_else_14_0= ruleExpr ) ) ) | ( () ( ( (lv_op_16_1= 'real' | lv_op_16_2= 'floor' ) ) ) otherlv_17= '(' ( (lv_expr_18_0= ruleExpr ) ) otherlv_19= ')' ) | this_NodeCallExpr_20= ruleNodeCallExpr | ( () otherlv_22= 'condact' otherlv_23= '(' ( (lv_clock_24_0= ruleExpr ) ) otherlv_25= ',' ( (lv_call_26_0= ruleNodeCallExpr ) ) (otherlv_27= ',' ( (lv_args_28_0= ruleExpr ) ) )* otherlv_29= ')' ) | ( () ( (otherlv_31= RULE_ID ) ) otherlv_32= '{' ( (otherlv_33= RULE_ID ) ) otherlv_34= '=' ( (lv_exprs_35_0= ruleExpr ) ) (otherlv_36= ';' ( (otherlv_37= RULE_ID ) ) otherlv_38= '=' ( (lv_exprs_39_0= ruleExpr ) ) )* otherlv_40= '}' ) | (otherlv_41= '(' this_Expr_42= ruleExpr otherlv_43= ')' ) ) )
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2173:1: ( ( () ( (otherlv_1= RULE_ID ) ) ) | ( () ( (lv_val_3_0= RULE_INT ) ) ) | ( () ( (lv_val_5_0= ruleREAL ) ) ) | ( () ( (lv_val_7_0= ruleBOOL ) ) ) | ( () otherlv_9= 'if' ( (lv_cond_10_0= ruleExpr ) ) otherlv_11= 'then' ( (lv_then_12_0= ruleExpr ) ) otherlv_13= 'else' ( (lv_else_14_0= ruleExpr ) ) ) | ( () ( ( (lv_op_16_1= 'real' | lv_op_16_2= 'floor' ) ) ) otherlv_17= '(' ( (lv_expr_18_0= ruleExpr ) ) otherlv_19= ')' ) | this_NodeCallExpr_20= ruleNodeCallExpr | ( () otherlv_22= 'condact' otherlv_23= '(' ( (lv_clock_24_0= ruleExpr ) ) otherlv_25= ',' ( (lv_call_26_0= ruleNodeCallExpr ) ) (otherlv_27= ',' ( (lv_args_28_0= ruleExpr ) ) )* otherlv_29= ')' ) | ( () ( (otherlv_31= RULE_ID ) ) otherlv_32= '{' ( (otherlv_33= RULE_ID ) ) otherlv_34= '=' ( (lv_exprs_35_0= ruleExpr ) ) (otherlv_36= ';' ( (otherlv_37= RULE_ID ) ) otherlv_38= '=' ( (lv_exprs_39_0= ruleExpr ) ) )* otherlv_40= '}' ) | (otherlv_41= '(' this_Expr_42= ruleExpr otherlv_43= ')' ) )
            {
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2173:1: ( ( () ( (otherlv_1= RULE_ID ) ) ) | ( () ( (lv_val_3_0= RULE_INT ) ) ) | ( () ( (lv_val_5_0= ruleREAL ) ) ) | ( () ( (lv_val_7_0= ruleBOOL ) ) ) | ( () otherlv_9= 'if' ( (lv_cond_10_0= ruleExpr ) ) otherlv_11= 'then' ( (lv_then_12_0= ruleExpr ) ) otherlv_13= 'else' ( (lv_else_14_0= ruleExpr ) ) ) | ( () ( ( (lv_op_16_1= 'real' | lv_op_16_2= 'floor' ) ) ) otherlv_17= '(' ( (lv_expr_18_0= ruleExpr ) ) otherlv_19= ')' ) | this_NodeCallExpr_20= ruleNodeCallExpr | ( () otherlv_22= 'condact' otherlv_23= '(' ( (lv_clock_24_0= ruleExpr ) ) otherlv_25= ',' ( (lv_call_26_0= ruleNodeCallExpr ) ) (otherlv_27= ',' ( (lv_args_28_0= ruleExpr ) ) )* otherlv_29= ')' ) | ( () ( (otherlv_31= RULE_ID ) ) otherlv_32= '{' ( (otherlv_33= RULE_ID ) ) otherlv_34= '=' ( (lv_exprs_35_0= ruleExpr ) ) (otherlv_36= ';' ( (otherlv_37= RULE_ID ) ) otherlv_38= '=' ( (lv_exprs_39_0= ruleExpr ) ) )* otherlv_40= '}' ) | (otherlv_41= '(' this_Expr_42= ruleExpr otherlv_43= ')' ) )
            int alt36=10;
            alt36 = dfa36.predict(input);
            switch (alt36) {
                case 1 :
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2173:2: ( () ( (otherlv_1= RULE_ID ) ) )
                    {
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2173:2: ( () ( (otherlv_1= RULE_ID ) ) )
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2173:3: () ( (otherlv_1= RULE_ID ) )
                    {
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2173:3: ()
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2174:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getAtomicExprAccess().getIdExprAction_0_0(),
                                  current);
                          
                    }

                    }

                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2179:2: ( (otherlv_1= RULE_ID ) )
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2180:1: (otherlv_1= RULE_ID )
                    {
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2180:1: (otherlv_1= RULE_ID )
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2181:3: otherlv_1= RULE_ID
                    {
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getAtomicExprRule());
                      	        }
                              
                    }
                    otherlv_1=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAtomicExpr4939); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		newLeafNode(otherlv_1, grammarAccess.getAtomicExprAccess().getIdIdRefCrossReference_0_1_0()); 
                      	
                    }

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2193:6: ( () ( (lv_val_3_0= RULE_INT ) ) )
                    {
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2193:6: ( () ( (lv_val_3_0= RULE_INT ) ) )
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2193:7: () ( (lv_val_3_0= RULE_INT ) )
                    {
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2193:7: ()
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2194:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getAtomicExprAccess().getIntExprAction_1_0(),
                                  current);
                          
                    }

                    }

                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2199:2: ( (lv_val_3_0= RULE_INT ) )
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2200:1: (lv_val_3_0= RULE_INT )
                    {
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2200:1: (lv_val_3_0= RULE_INT )
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2201:3: lv_val_3_0= RULE_INT
                    {
                    lv_val_3_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleAtomicExpr4973); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_val_3_0, grammarAccess.getAtomicExprAccess().getValINTTerminalRuleCall_1_1_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getAtomicExprRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"val",
                              		lv_val_3_0, 
                              		"INT");
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2218:6: ( () ( (lv_val_5_0= ruleREAL ) ) )
                    {
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2218:6: ( () ( (lv_val_5_0= ruleREAL ) ) )
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2218:7: () ( (lv_val_5_0= ruleREAL ) )
                    {
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2218:7: ()
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2219:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getAtomicExprAccess().getRealExprAction_2_0(),
                                  current);
                          
                    }

                    }

                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2224:2: ( (lv_val_5_0= ruleREAL ) )
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2225:1: (lv_val_5_0= ruleREAL )
                    {
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2225:1: (lv_val_5_0= ruleREAL )
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2226:3: lv_val_5_0= ruleREAL
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getAtomicExprAccess().getValREALParserRuleCall_2_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleREAL_in_ruleAtomicExpr5016);
                    lv_val_5_0=ruleREAL();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getAtomicExprRule());
                      	        }
                             		set(
                             			current, 
                             			"val",
                              		lv_val_5_0, 
                              		"REAL");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;
                case 4 :
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2243:6: ( () ( (lv_val_7_0= ruleBOOL ) ) )
                    {
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2243:6: ( () ( (lv_val_7_0= ruleBOOL ) ) )
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2243:7: () ( (lv_val_7_0= ruleBOOL ) )
                    {
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2243:7: ()
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2244:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getAtomicExprAccess().getBoolExprAction_3_0(),
                                  current);
                          
                    }

                    }

                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2249:2: ( (lv_val_7_0= ruleBOOL ) )
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2250:1: (lv_val_7_0= ruleBOOL )
                    {
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2250:1: (lv_val_7_0= ruleBOOL )
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2251:3: lv_val_7_0= ruleBOOL
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getAtomicExprAccess().getValBOOLParserRuleCall_3_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleBOOL_in_ruleAtomicExpr5054);
                    lv_val_7_0=ruleBOOL();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getAtomicExprRule());
                      	        }
                             		set(
                             			current, 
                             			"val",
                              		lv_val_7_0, 
                              		"BOOL");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;
                case 5 :
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2268:6: ( () otherlv_9= 'if' ( (lv_cond_10_0= ruleExpr ) ) otherlv_11= 'then' ( (lv_then_12_0= ruleExpr ) ) otherlv_13= 'else' ( (lv_else_14_0= ruleExpr ) ) )
                    {
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2268:6: ( () otherlv_9= 'if' ( (lv_cond_10_0= ruleExpr ) ) otherlv_11= 'then' ( (lv_then_12_0= ruleExpr ) ) otherlv_13= 'else' ( (lv_else_14_0= ruleExpr ) ) )
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2268:7: () otherlv_9= 'if' ( (lv_cond_10_0= ruleExpr ) ) otherlv_11= 'then' ( (lv_then_12_0= ruleExpr ) ) otherlv_13= 'else' ( (lv_else_14_0= ruleExpr ) )
                    {
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2268:7: ()
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2269:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getAtomicExprAccess().getIfThenElseExprAction_4_0(),
                                  current);
                          
                    }

                    }

                    otherlv_9=(Token)match(input,55,FOLLOW_55_in_ruleAtomicExpr5083); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_9, grammarAccess.getAtomicExprAccess().getIfKeyword_4_1());
                          
                    }
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2278:1: ( (lv_cond_10_0= ruleExpr ) )
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2279:1: (lv_cond_10_0= ruleExpr )
                    {
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2279:1: (lv_cond_10_0= ruleExpr )
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2280:3: lv_cond_10_0= ruleExpr
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getAtomicExprAccess().getCondExprParserRuleCall_4_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleExpr_in_ruleAtomicExpr5104);
                    lv_cond_10_0=ruleExpr();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getAtomicExprRule());
                      	        }
                             		set(
                             			current, 
                             			"cond",
                              		lv_cond_10_0, 
                              		"Expr");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    otherlv_11=(Token)match(input,56,FOLLOW_56_in_ruleAtomicExpr5116); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_11, grammarAccess.getAtomicExprAccess().getThenKeyword_4_3());
                          
                    }
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2300:1: ( (lv_then_12_0= ruleExpr ) )
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2301:1: (lv_then_12_0= ruleExpr )
                    {
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2301:1: (lv_then_12_0= ruleExpr )
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2302:3: lv_then_12_0= ruleExpr
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getAtomicExprAccess().getThenExprParserRuleCall_4_4_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleExpr_in_ruleAtomicExpr5137);
                    lv_then_12_0=ruleExpr();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getAtomicExprRule());
                      	        }
                             		set(
                             			current, 
                             			"then",
                              		lv_then_12_0, 
                              		"Expr");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    otherlv_13=(Token)match(input,57,FOLLOW_57_in_ruleAtomicExpr5149); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_13, grammarAccess.getAtomicExprAccess().getElseKeyword_4_5());
                          
                    }
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2322:1: ( (lv_else_14_0= ruleExpr ) )
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2323:1: (lv_else_14_0= ruleExpr )
                    {
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2323:1: (lv_else_14_0= ruleExpr )
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2324:3: lv_else_14_0= ruleExpr
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getAtomicExprAccess().getElseExprParserRuleCall_4_6_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleExpr_in_ruleAtomicExpr5170);
                    lv_else_14_0=ruleExpr();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getAtomicExprRule());
                      	        }
                             		set(
                             			current, 
                             			"else",
                              		lv_else_14_0, 
                              		"Expr");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;
                case 6 :
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2341:6: ( () ( ( (lv_op_16_1= 'real' | lv_op_16_2= 'floor' ) ) ) otherlv_17= '(' ( (lv_expr_18_0= ruleExpr ) ) otherlv_19= ')' )
                    {
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2341:6: ( () ( ( (lv_op_16_1= 'real' | lv_op_16_2= 'floor' ) ) ) otherlv_17= '(' ( (lv_expr_18_0= ruleExpr ) ) otherlv_19= ')' )
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2341:7: () ( ( (lv_op_16_1= 'real' | lv_op_16_2= 'floor' ) ) ) otherlv_17= '(' ( (lv_expr_18_0= ruleExpr ) ) otherlv_19= ')'
                    {
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2341:7: ()
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2342:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getAtomicExprAccess().getCastExprAction_5_0(),
                                  current);
                          
                    }

                    }

                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2347:2: ( ( (lv_op_16_1= 'real' | lv_op_16_2= 'floor' ) ) )
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2348:1: ( (lv_op_16_1= 'real' | lv_op_16_2= 'floor' ) )
                    {
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2348:1: ( (lv_op_16_1= 'real' | lv_op_16_2= 'floor' ) )
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2349:1: (lv_op_16_1= 'real' | lv_op_16_2= 'floor' )
                    {
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2349:1: (lv_op_16_1= 'real' | lv_op_16_2= 'floor' )
                    int alt33=2;
                    int LA33_0 = input.LA(1);

                    if ( (LA33_0==19) ) {
                        alt33=1;
                    }
                    else if ( (LA33_0==58) ) {
                        alt33=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 33, 0, input);

                        throw nvae;
                    }
                    switch (alt33) {
                        case 1 :
                            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2350:3: lv_op_16_1= 'real'
                            {
                            lv_op_16_1=(Token)match(input,19,FOLLOW_19_in_ruleAtomicExpr5207); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                      newLeafNode(lv_op_16_1, grammarAccess.getAtomicExprAccess().getOpRealKeyword_5_1_0_0());
                                  
                            }
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElement(grammarAccess.getAtomicExprRule());
                              	        }
                                     		setWithLastConsumed(current, "op", lv_op_16_1, null);
                              	    
                            }

                            }
                            break;
                        case 2 :
                            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2362:8: lv_op_16_2= 'floor'
                            {
                            lv_op_16_2=(Token)match(input,58,FOLLOW_58_in_ruleAtomicExpr5236); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                      newLeafNode(lv_op_16_2, grammarAccess.getAtomicExprAccess().getOpFloorKeyword_5_1_0_1());
                                  
                            }
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElement(grammarAccess.getAtomicExprRule());
                              	        }
                                     		setWithLastConsumed(current, "op", lv_op_16_2, null);
                              	    
                            }

                            }
                            break;

                    }


                    }


                    }

                    otherlv_17=(Token)match(input,28,FOLLOW_28_in_ruleAtomicExpr5264); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_17, grammarAccess.getAtomicExprAccess().getLeftParenthesisKeyword_5_2());
                          
                    }
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2381:1: ( (lv_expr_18_0= ruleExpr ) )
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2382:1: (lv_expr_18_0= ruleExpr )
                    {
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2382:1: (lv_expr_18_0= ruleExpr )
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2383:3: lv_expr_18_0= ruleExpr
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getAtomicExprAccess().getExprExprParserRuleCall_5_3_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleExpr_in_ruleAtomicExpr5285);
                    lv_expr_18_0=ruleExpr();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getAtomicExprRule());
                      	        }
                             		set(
                             			current, 
                             			"expr",
                              		lv_expr_18_0, 
                              		"Expr");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    otherlv_19=(Token)match(input,29,FOLLOW_29_in_ruleAtomicExpr5297); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_19, grammarAccess.getAtomicExprAccess().getRightParenthesisKeyword_5_4());
                          
                    }

                    }


                    }
                    break;
                case 7 :
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2405:5: this_NodeCallExpr_20= ruleNodeCallExpr
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getAtomicExprAccess().getNodeCallExprParserRuleCall_6()); 
                          
                    }
                    pushFollow(FOLLOW_ruleNodeCallExpr_in_ruleAtomicExpr5326);
                    this_NodeCallExpr_20=ruleNodeCallExpr();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_NodeCallExpr_20; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 8 :
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2414:6: ( () otherlv_22= 'condact' otherlv_23= '(' ( (lv_clock_24_0= ruleExpr ) ) otherlv_25= ',' ( (lv_call_26_0= ruleNodeCallExpr ) ) (otherlv_27= ',' ( (lv_args_28_0= ruleExpr ) ) )* otherlv_29= ')' )
                    {
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2414:6: ( () otherlv_22= 'condact' otherlv_23= '(' ( (lv_clock_24_0= ruleExpr ) ) otherlv_25= ',' ( (lv_call_26_0= ruleNodeCallExpr ) ) (otherlv_27= ',' ( (lv_args_28_0= ruleExpr ) ) )* otherlv_29= ')' )
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2414:7: () otherlv_22= 'condact' otherlv_23= '(' ( (lv_clock_24_0= ruleExpr ) ) otherlv_25= ',' ( (lv_call_26_0= ruleNodeCallExpr ) ) (otherlv_27= ',' ( (lv_args_28_0= ruleExpr ) ) )* otherlv_29= ')'
                    {
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2414:7: ()
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2415:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getAtomicExprAccess().getCondactExprAction_7_0(),
                                  current);
                          
                    }

                    }

                    otherlv_22=(Token)match(input,59,FOLLOW_59_in_ruleAtomicExpr5353); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_22, grammarAccess.getAtomicExprAccess().getCondactKeyword_7_1());
                          
                    }
                    otherlv_23=(Token)match(input,28,FOLLOW_28_in_ruleAtomicExpr5365); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_23, grammarAccess.getAtomicExprAccess().getLeftParenthesisKeyword_7_2());
                          
                    }
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2428:1: ( (lv_clock_24_0= ruleExpr ) )
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2429:1: (lv_clock_24_0= ruleExpr )
                    {
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2429:1: (lv_clock_24_0= ruleExpr )
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2430:3: lv_clock_24_0= ruleExpr
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getAtomicExprAccess().getClockExprParserRuleCall_7_3_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleExpr_in_ruleAtomicExpr5386);
                    lv_clock_24_0=ruleExpr();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getAtomicExprRule());
                      	        }
                             		set(
                             			current, 
                             			"clock",
                              		lv_clock_24_0, 
                              		"Expr");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    otherlv_25=(Token)match(input,22,FOLLOW_22_in_ruleAtomicExpr5398); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_25, grammarAccess.getAtomicExprAccess().getCommaKeyword_7_4());
                          
                    }
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2450:1: ( (lv_call_26_0= ruleNodeCallExpr ) )
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2451:1: (lv_call_26_0= ruleNodeCallExpr )
                    {
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2451:1: (lv_call_26_0= ruleNodeCallExpr )
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2452:3: lv_call_26_0= ruleNodeCallExpr
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getAtomicExprAccess().getCallNodeCallExprParserRuleCall_7_5_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleNodeCallExpr_in_ruleAtomicExpr5419);
                    lv_call_26_0=ruleNodeCallExpr();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getAtomicExprRule());
                      	        }
                             		set(
                             			current, 
                             			"call",
                              		lv_call_26_0, 
                              		"NodeCallExpr");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2468:2: (otherlv_27= ',' ( (lv_args_28_0= ruleExpr ) ) )*
                    loop34:
                    do {
                        int alt34=2;
                        int LA34_0 = input.LA(1);

                        if ( (LA34_0==22) ) {
                            alt34=1;
                        }


                        switch (alt34) {
                    	case 1 :
                    	    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2468:4: otherlv_27= ',' ( (lv_args_28_0= ruleExpr ) )
                    	    {
                    	    otherlv_27=(Token)match(input,22,FOLLOW_22_in_ruleAtomicExpr5432); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_27, grammarAccess.getAtomicExprAccess().getCommaKeyword_7_6_0());
                    	          
                    	    }
                    	    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2472:1: ( (lv_args_28_0= ruleExpr ) )
                    	    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2473:1: (lv_args_28_0= ruleExpr )
                    	    {
                    	    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2473:1: (lv_args_28_0= ruleExpr )
                    	    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2474:3: lv_args_28_0= ruleExpr
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getAtomicExprAccess().getArgsExprParserRuleCall_7_6_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleExpr_in_ruleAtomicExpr5453);
                    	    lv_args_28_0=ruleExpr();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getAtomicExprRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"args",
                    	              		lv_args_28_0, 
                    	              		"Expr");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop34;
                        }
                    } while (true);

                    otherlv_29=(Token)match(input,29,FOLLOW_29_in_ruleAtomicExpr5467); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_29, grammarAccess.getAtomicExprAccess().getRightParenthesisKeyword_7_7());
                          
                    }

                    }


                    }
                    break;
                case 9 :
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2495:6: ( () ( (otherlv_31= RULE_ID ) ) otherlv_32= '{' ( (otherlv_33= RULE_ID ) ) otherlv_34= '=' ( (lv_exprs_35_0= ruleExpr ) ) (otherlv_36= ';' ( (otherlv_37= RULE_ID ) ) otherlv_38= '=' ( (lv_exprs_39_0= ruleExpr ) ) )* otherlv_40= '}' )
                    {
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2495:6: ( () ( (otherlv_31= RULE_ID ) ) otherlv_32= '{' ( (otherlv_33= RULE_ID ) ) otherlv_34= '=' ( (lv_exprs_35_0= ruleExpr ) ) (otherlv_36= ';' ( (otherlv_37= RULE_ID ) ) otherlv_38= '=' ( (lv_exprs_39_0= ruleExpr ) ) )* otherlv_40= '}' )
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2495:7: () ( (otherlv_31= RULE_ID ) ) otherlv_32= '{' ( (otherlv_33= RULE_ID ) ) otherlv_34= '=' ( (lv_exprs_35_0= ruleExpr ) ) (otherlv_36= ';' ( (otherlv_37= RULE_ID ) ) otherlv_38= '=' ( (lv_exprs_39_0= ruleExpr ) ) )* otherlv_40= '}'
                    {
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2495:7: ()
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2496:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getAtomicExprAccess().getRecordExprAction_8_0(),
                                  current);
                          
                    }

                    }

                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2501:2: ( (otherlv_31= RULE_ID ) )
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2502:1: (otherlv_31= RULE_ID )
                    {
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2502:1: (otherlv_31= RULE_ID )
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2503:3: otherlv_31= RULE_ID
                    {
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getAtomicExprRule());
                      	        }
                              
                    }
                    otherlv_31=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAtomicExpr5504); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		newLeafNode(otherlv_31, grammarAccess.getAtomicExprAccess().getTypeRecordTypeCrossReference_8_1_0()); 
                      	
                    }

                    }


                    }

                    otherlv_32=(Token)match(input,14,FOLLOW_14_in_ruleAtomicExpr5516); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_32, grammarAccess.getAtomicExprAccess().getLeftCurlyBracketKeyword_8_2());
                          
                    }
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2518:1: ( (otherlv_33= RULE_ID ) )
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2519:1: (otherlv_33= RULE_ID )
                    {
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2519:1: (otherlv_33= RULE_ID )
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2520:3: otherlv_33= RULE_ID
                    {
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getAtomicExprRule());
                      	        }
                              
                    }
                    otherlv_33=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAtomicExpr5536); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		newLeafNode(otherlv_33, grammarAccess.getAtomicExprAccess().getFieldsFieldCrossReference_8_3_0()); 
                      	
                    }

                    }


                    }

                    otherlv_34=(Token)match(input,11,FOLLOW_11_in_ruleAtomicExpr5548); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_34, grammarAccess.getAtomicExprAccess().getEqualsSignKeyword_8_4());
                          
                    }
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2535:1: ( (lv_exprs_35_0= ruleExpr ) )
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2536:1: (lv_exprs_35_0= ruleExpr )
                    {
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2536:1: (lv_exprs_35_0= ruleExpr )
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2537:3: lv_exprs_35_0= ruleExpr
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getAtomicExprAccess().getExprsExprParserRuleCall_8_5_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleExpr_in_ruleAtomicExpr5569);
                    lv_exprs_35_0=ruleExpr();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getAtomicExprRule());
                      	        }
                             		add(
                             			current, 
                             			"exprs",
                              		lv_exprs_35_0, 
                              		"Expr");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2553:2: (otherlv_36= ';' ( (otherlv_37= RULE_ID ) ) otherlv_38= '=' ( (lv_exprs_39_0= ruleExpr ) ) )*
                    loop35:
                    do {
                        int alt35=2;
                        int LA35_0 = input.LA(1);

                        if ( (LA35_0==12) ) {
                            alt35=1;
                        }


                        switch (alt35) {
                    	case 1 :
                    	    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2553:4: otherlv_36= ';' ( (otherlv_37= RULE_ID ) ) otherlv_38= '=' ( (lv_exprs_39_0= ruleExpr ) )
                    	    {
                    	    otherlv_36=(Token)match(input,12,FOLLOW_12_in_ruleAtomicExpr5582); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_36, grammarAccess.getAtomicExprAccess().getSemicolonKeyword_8_6_0());
                    	          
                    	    }
                    	    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2557:1: ( (otherlv_37= RULE_ID ) )
                    	    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2558:1: (otherlv_37= RULE_ID )
                    	    {
                    	    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2558:1: (otherlv_37= RULE_ID )
                    	    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2559:3: otherlv_37= RULE_ID
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      			if (current==null) {
                    	      	            current = createModelElement(grammarAccess.getAtomicExprRule());
                    	      	        }
                    	              
                    	    }
                    	    otherlv_37=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAtomicExpr5602); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      		newLeafNode(otherlv_37, grammarAccess.getAtomicExprAccess().getFieldsFieldCrossReference_8_6_1_0()); 
                    	      	
                    	    }

                    	    }


                    	    }

                    	    otherlv_38=(Token)match(input,11,FOLLOW_11_in_ruleAtomicExpr5614); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_38, grammarAccess.getAtomicExprAccess().getEqualsSignKeyword_8_6_2());
                    	          
                    	    }
                    	    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2574:1: ( (lv_exprs_39_0= ruleExpr ) )
                    	    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2575:1: (lv_exprs_39_0= ruleExpr )
                    	    {
                    	    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2575:1: (lv_exprs_39_0= ruleExpr )
                    	    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2576:3: lv_exprs_39_0= ruleExpr
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getAtomicExprAccess().getExprsExprParserRuleCall_8_6_3_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleExpr_in_ruleAtomicExpr5635);
                    	    lv_exprs_39_0=ruleExpr();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getAtomicExprRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"exprs",
                    	              		lv_exprs_39_0, 
                    	              		"Expr");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop35;
                        }
                    } while (true);

                    otherlv_40=(Token)match(input,16,FOLLOW_16_in_ruleAtomicExpr5649); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_40, grammarAccess.getAtomicExprAccess().getRightCurlyBracketKeyword_8_7());
                          
                    }

                    }


                    }
                    break;
                case 10 :
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2597:6: (otherlv_41= '(' this_Expr_42= ruleExpr otherlv_43= ')' )
                    {
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2597:6: (otherlv_41= '(' this_Expr_42= ruleExpr otherlv_43= ')' )
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2597:8: otherlv_41= '(' this_Expr_42= ruleExpr otherlv_43= ')'
                    {
                    otherlv_41=(Token)match(input,28,FOLLOW_28_in_ruleAtomicExpr5669); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_41, grammarAccess.getAtomicExprAccess().getLeftParenthesisKeyword_9_0());
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getAtomicExprAccess().getExprParserRuleCall_9_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleExpr_in_ruleAtomicExpr5691);
                    this_Expr_42=ruleExpr();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_Expr_42; 
                              afterParserOrEnumRuleCall();
                          
                    }
                    otherlv_43=(Token)match(input,29,FOLLOW_29_in_ruleAtomicExpr5702); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_43, grammarAccess.getAtomicExprAccess().getRightParenthesisKeyword_9_2());
                          
                    }

                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAtomicExpr"


    // $ANTLR start "entryRuleNodeCallExpr"
    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2622:1: entryRuleNodeCallExpr returns [EObject current=null] : iv_ruleNodeCallExpr= ruleNodeCallExpr EOF ;
    public final EObject entryRuleNodeCallExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNodeCallExpr = null;


        try {
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2623:2: (iv_ruleNodeCallExpr= ruleNodeCallExpr EOF )
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2624:2: iv_ruleNodeCallExpr= ruleNodeCallExpr EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNodeCallExprRule()); 
            }
            pushFollow(FOLLOW_ruleNodeCallExpr_in_entryRuleNodeCallExpr5739);
            iv_ruleNodeCallExpr=ruleNodeCallExpr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNodeCallExpr; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleNodeCallExpr5749); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleNodeCallExpr"


    // $ANTLR start "ruleNodeCallExpr"
    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2631:1: ruleNodeCallExpr returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '(' ( ( (lv_args_2_0= ruleExpr ) ) (otherlv_3= ',' ( (lv_args_4_0= ruleExpr ) ) )* )? otherlv_5= ')' ) ;
    public final EObject ruleNodeCallExpr() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_args_2_0 = null;

        EObject lv_args_4_0 = null;


         enterRule(); 
            
        try {
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2634:28: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '(' ( ( (lv_args_2_0= ruleExpr ) ) (otherlv_3= ',' ( (lv_args_4_0= ruleExpr ) ) )* )? otherlv_5= ')' ) )
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2635:1: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '(' ( ( (lv_args_2_0= ruleExpr ) ) (otherlv_3= ',' ( (lv_args_4_0= ruleExpr ) ) )* )? otherlv_5= ')' )
            {
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2635:1: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '(' ( ( (lv_args_2_0= ruleExpr ) ) (otherlv_3= ',' ( (lv_args_4_0= ruleExpr ) ) )* )? otherlv_5= ')' )
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2635:2: ( (otherlv_0= RULE_ID ) ) otherlv_1= '(' ( ( (lv_args_2_0= ruleExpr ) ) (otherlv_3= ',' ( (lv_args_4_0= ruleExpr ) ) )* )? otherlv_5= ')'
            {
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2635:2: ( (otherlv_0= RULE_ID ) )
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2636:1: (otherlv_0= RULE_ID )
            {
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2636:1: (otherlv_0= RULE_ID )
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2637:3: otherlv_0= RULE_ID
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getNodeCallExprRule());
              	        }
                      
            }
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleNodeCallExpr5794); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		newLeafNode(otherlv_0, grammarAccess.getNodeCallExprAccess().getNodeNodeCrossReference_0_0()); 
              	
            }

            }


            }

            otherlv_1=(Token)match(input,28,FOLLOW_28_in_ruleNodeCallExpr5806); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getNodeCallExprAccess().getLeftParenthesisKeyword_1());
                  
            }
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2652:1: ( ( (lv_args_2_0= ruleExpr ) ) (otherlv_3= ',' ( (lv_args_4_0= ruleExpr ) ) )* )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( ((LA38_0>=RULE_ID && LA38_0<=RULE_INT)||LA38_0==19||LA38_0==25||LA38_0==28||(LA38_0>=52 && LA38_0<=53)||LA38_0==55||(LA38_0>=58 && LA38_0<=61)) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2652:2: ( (lv_args_2_0= ruleExpr ) ) (otherlv_3= ',' ( (lv_args_4_0= ruleExpr ) ) )*
                    {
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2652:2: ( (lv_args_2_0= ruleExpr ) )
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2653:1: (lv_args_2_0= ruleExpr )
                    {
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2653:1: (lv_args_2_0= ruleExpr )
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2654:3: lv_args_2_0= ruleExpr
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getNodeCallExprAccess().getArgsExprParserRuleCall_2_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleExpr_in_ruleNodeCallExpr5828);
                    lv_args_2_0=ruleExpr();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getNodeCallExprRule());
                      	        }
                             		add(
                             			current, 
                             			"args",
                              		lv_args_2_0, 
                              		"Expr");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2670:2: (otherlv_3= ',' ( (lv_args_4_0= ruleExpr ) ) )*
                    loop37:
                    do {
                        int alt37=2;
                        int LA37_0 = input.LA(1);

                        if ( (LA37_0==22) ) {
                            alt37=1;
                        }


                        switch (alt37) {
                    	case 1 :
                    	    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2670:4: otherlv_3= ',' ( (lv_args_4_0= ruleExpr ) )
                    	    {
                    	    otherlv_3=(Token)match(input,22,FOLLOW_22_in_ruleNodeCallExpr5841); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_3, grammarAccess.getNodeCallExprAccess().getCommaKeyword_2_1_0());
                    	          
                    	    }
                    	    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2674:1: ( (lv_args_4_0= ruleExpr ) )
                    	    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2675:1: (lv_args_4_0= ruleExpr )
                    	    {
                    	    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2675:1: (lv_args_4_0= ruleExpr )
                    	    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2676:3: lv_args_4_0= ruleExpr
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getNodeCallExprAccess().getArgsExprParserRuleCall_2_1_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleExpr_in_ruleNodeCallExpr5862);
                    	    lv_args_4_0=ruleExpr();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getNodeCallExprRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"args",
                    	              		lv_args_4_0, 
                    	              		"Expr");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop37;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_5=(Token)match(input,29,FOLLOW_29_in_ruleNodeCallExpr5878); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getNodeCallExprAccess().getRightParenthesisKeyword_3());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNodeCallExpr"


    // $ANTLR start "entryRuleREAL"
    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2706:1: entryRuleREAL returns [String current=null] : iv_ruleREAL= ruleREAL EOF ;
    public final String entryRuleREAL() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleREAL = null;


        try {
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2707:2: (iv_ruleREAL= ruleREAL EOF )
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2708:2: iv_ruleREAL= ruleREAL EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getREALRule()); 
            }
            pushFollow(FOLLOW_ruleREAL_in_entryRuleREAL5917);
            iv_ruleREAL=ruleREAL();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleREAL.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleREAL5928); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleREAL"


    // $ANTLR start "ruleREAL"
    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2715:1: ruleREAL returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_INT_0= RULE_INT kw= '.' this_INT_2= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleREAL() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;
        Token kw=null;
        Token this_INT_2=null;

         enterRule(); 
            
        try {
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2718:28: ( (this_INT_0= RULE_INT kw= '.' this_INT_2= RULE_INT ) )
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2719:1: (this_INT_0= RULE_INT kw= '.' this_INT_2= RULE_INT )
            {
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2719:1: (this_INT_0= RULE_INT kw= '.' this_INT_2= RULE_INT )
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2719:6: this_INT_0= RULE_INT kw= '.' this_INT_2= RULE_INT
            {
            this_INT_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleREAL5968); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_INT_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_INT_0, grammarAccess.getREALAccess().getINTTerminalRuleCall_0()); 
                  
            }
            kw=(Token)match(input,54,FOLLOW_54_in_ruleREAL5986); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current.merge(kw);
                      newLeafNode(kw, grammarAccess.getREALAccess().getFullStopKeyword_1()); 
                  
            }
            this_INT_2=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleREAL6001); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_INT_2);
                  
            }
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_INT_2, grammarAccess.getREALAccess().getINTTerminalRuleCall_2()); 
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleREAL"


    // $ANTLR start "entryRuleBOOL"
    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2747:1: entryRuleBOOL returns [String current=null] : iv_ruleBOOL= ruleBOOL EOF ;
    public final String entryRuleBOOL() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleBOOL = null;


        try {
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2748:2: (iv_ruleBOOL= ruleBOOL EOF )
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2749:2: iv_ruleBOOL= ruleBOOL EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBOOLRule()); 
            }
            pushFollow(FOLLOW_ruleBOOL_in_entryRuleBOOL6047);
            iv_ruleBOOL=ruleBOOL();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBOOL.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleBOOL6058); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBOOL"


    // $ANTLR start "ruleBOOL"
    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2756:1: ruleBOOL returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'true' | kw= 'false' ) ;
    public final AntlrDatatypeRuleToken ruleBOOL() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2759:28: ( (kw= 'true' | kw= 'false' ) )
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2760:1: (kw= 'true' | kw= 'false' )
            {
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2760:1: (kw= 'true' | kw= 'false' )
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==60) ) {
                alt39=1;
            }
            else if ( (LA39_0==61) ) {
                alt39=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 39, 0, input);

                throw nvae;
            }
            switch (alt39) {
                case 1 :
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2761:2: kw= 'true'
                    {
                    kw=(Token)match(input,60,FOLLOW_60_in_ruleBOOL6096); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getBOOLAccess().getTrueKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2768:2: kw= 'false'
                    {
                    kw=(Token)match(input,61,FOLLOW_61_in_ruleBOOL6115); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getBOOLAccess().getFalseKeyword_1()); 
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBOOL"

    // $ANTLR start synpred1_InternalJKind
    public final void synpred1_InternalJKind_fragment() throws RecognitionException {   
        // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1051:4: ( ( ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* '=' ) )
        // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1051:5: ( ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* '=' )
        {
        // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1051:5: ( ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* '=' )
        // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1051:6: ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* '='
        {
        // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1051:6: ( ( RULE_ID ) )
        // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1052:1: ( RULE_ID )
        {
        // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1052:1: ( RULE_ID )
        // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1053:2: RULE_ID
        {
        match(input,RULE_ID,FOLLOW_RULE_ID_in_synpred1_InternalJKind2124); if (state.failed) return ;

        }


        }

        // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1056:2: ( ',' ( ( RULE_ID ) ) )*
        loop40:
        do {
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==22) ) {
                alt40=1;
            }


            switch (alt40) {
        	case 1 :
        	    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1056:4: ',' ( ( RULE_ID ) )
        	    {
        	    match(input,22,FOLLOW_22_in_synpred1_InternalJKind2132); if (state.failed) return ;
        	    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1057:1: ( ( RULE_ID ) )
        	    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1058:1: ( RULE_ID )
        	    {
        	    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1058:1: ( RULE_ID )
        	    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1059:2: RULE_ID
        	    {
        	    match(input,RULE_ID,FOLLOW_RULE_ID_in_synpred1_InternalJKind2140); if (state.failed) return ;

        	    }


        	    }


        	    }
        	    break;

        	default :
        	    break loop40;
            }
        } while (true);

        match(input,11,FOLLOW_11_in_synpred1_InternalJKind2149); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred1_InternalJKind

    // $ANTLR start synpred2_InternalJKind
    public final void synpred2_InternalJKind_fragment() throws RecognitionException {   
        // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1324:3: ( ( () ( ( '->' ) ) ) )
        // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1324:4: ( () ( ( '->' ) ) )
        {
        // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1324:4: ( () ( ( '->' ) ) )
        // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1324:5: () ( ( '->' ) )
        {
        // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1324:5: ()
        // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1325:1: 
        {
        }

        // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1325:2: ( ( '->' ) )
        // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1326:1: ( '->' )
        {
        // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1326:1: ( '->' )
        // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1327:2: '->'
        {
        match(input,37,FOLLOW_37_in_synpred2_InternalJKind2831); if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred2_InternalJKind

    // $ANTLR start synpred3_InternalJKind
    public final void synpred3_InternalJKind_fragment() throws RecognitionException {   
        // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1400:3: ( ( () ( ( '=>' ) ) ) )
        // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1400:4: ( () ( ( '=>' ) ) )
        {
        // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1400:4: ( () ( ( '=>' ) ) )
        // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1400:5: () ( ( '=>' ) )
        {
        // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1400:5: ()
        // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1401:1: 
        {
        }

        // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1401:2: ( ( '=>' ) )
        // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1402:1: ( '=>' )
        {
        // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1402:1: ( '=>' )
        // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1403:2: '=>'
        {
        match(input,38,FOLLOW_38_in_synpred3_InternalJKind3013); if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred3_InternalJKind

    // $ANTLR start synpred4_InternalJKind
    public final void synpred4_InternalJKind_fragment() throws RecognitionException {   
        // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1476:3: ( ( () ( ( ( 'or' | 'xor' ) ) ) ) )
        // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1476:4: ( () ( ( ( 'or' | 'xor' ) ) ) )
        {
        // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1476:4: ( () ( ( ( 'or' | 'xor' ) ) ) )
        // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1476:5: () ( ( ( 'or' | 'xor' ) ) )
        {
        // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1476:5: ()
        // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1477:1: 
        {
        }

        // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1477:2: ( ( ( 'or' | 'xor' ) ) )
        // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1478:1: ( ( 'or' | 'xor' ) )
        {
        // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1478:1: ( ( 'or' | 'xor' ) )
        // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1479:1: ( 'or' | 'xor' )
        {
        if ( (input.LA(1)>=39 && input.LA(1)<=40) ) {
            input.consume();
            state.errorRecovery=false;state.failed=false;
        }
        else {
            if (state.backtracking>0) {state.failed=true; return ;}
            MismatchedSetException mse = new MismatchedSetException(null,input);
            throw mse;
        }


        }


        }


        }


        }
    }
    // $ANTLR end synpred4_InternalJKind

    // $ANTLR start synpred5_InternalJKind
    public final void synpred5_InternalJKind_fragment() throws RecognitionException {   
        // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1573:3: ( ( () ( ( 'and' ) ) ) )
        // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1573:4: ( () ( ( 'and' ) ) )
        {
        // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1573:4: ( () ( ( 'and' ) ) )
        // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1573:5: () ( ( 'and' ) )
        {
        // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1573:5: ()
        // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1574:1: 
        {
        }

        // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1574:2: ( ( 'and' ) )
        // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1575:1: ( 'and' )
        {
        // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1575:1: ( 'and' )
        // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1576:2: 'and'
        {
        match(input,41,FOLLOW_41_in_synpred5_InternalJKind3430); if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred5_InternalJKind

    // $ANTLR start synpred6_InternalJKind
    public final void synpred6_InternalJKind_fragment() throws RecognitionException {   
        // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1649:3: ( ( () ( ( ( '<' | '<=' | '>' | '>=' | '=' | '<>' ) ) ) ) )
        // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1649:4: ( () ( ( ( '<' | '<=' | '>' | '>=' | '=' | '<>' ) ) ) )
        {
        // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1649:4: ( () ( ( ( '<' | '<=' | '>' | '>=' | '=' | '<>' ) ) ) )
        // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1649:5: () ( ( ( '<' | '<=' | '>' | '>=' | '=' | '<>' ) ) )
        {
        // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1649:5: ()
        // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1650:1: 
        {
        }

        // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1650:2: ( ( ( '<' | '<=' | '>' | '>=' | '=' | '<>' ) ) )
        // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1651:1: ( ( '<' | '<=' | '>' | '>=' | '=' | '<>' ) )
        {
        // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1651:1: ( ( '<' | '<=' | '>' | '>=' | '=' | '<>' ) )
        // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1652:1: ( '<' | '<=' | '>' | '>=' | '=' | '<>' )
        {
        if ( input.LA(1)==11||(input.LA(1)>=42 && input.LA(1)<=46) ) {
            input.consume();
            state.errorRecovery=false;state.failed=false;
        }
        else {
            if (state.backtracking>0) {state.failed=true; return ;}
            MismatchedSetException mse = new MismatchedSetException(null,input);
            throw mse;
        }


        }


        }


        }


        }
    }
    // $ANTLR end synpred6_InternalJKind

    // $ANTLR start synpred7_InternalJKind
    public final void synpred7_InternalJKind_fragment() throws RecognitionException {   
        // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1806:3: ( ( () ( ( ( '+' | '-' ) ) ) ) )
        // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1806:4: ( () ( ( ( '+' | '-' ) ) ) )
        {
        // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1806:4: ( () ( ( ( '+' | '-' ) ) ) )
        // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1806:5: () ( ( ( '+' | '-' ) ) )
        {
        // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1806:5: ()
        // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1807:1: 
        {
        }

        // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1807:2: ( ( ( '+' | '-' ) ) )
        // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1808:1: ( ( '+' | '-' ) )
        {
        // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1808:1: ( ( '+' | '-' ) )
        // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1809:1: ( '+' | '-' )
        {
        if ( input.LA(1)==25||input.LA(1)==47 ) {
            input.consume();
            state.errorRecovery=false;state.failed=false;
        }
        else {
            if (state.backtracking>0) {state.failed=true; return ;}
            MismatchedSetException mse = new MismatchedSetException(null,input);
            throw mse;
        }


        }


        }


        }


        }
    }
    // $ANTLR end synpred7_InternalJKind

    // $ANTLR start synpred8_InternalJKind
    public final void synpred8_InternalJKind_fragment() throws RecognitionException {   
        // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1903:3: ( ( () ( ( ( '*' | '/' | 'div' | 'mod' ) ) ) ) )
        // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1903:4: ( () ( ( ( '*' | '/' | 'div' | 'mod' ) ) ) )
        {
        // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1903:4: ( () ( ( ( '*' | '/' | 'div' | 'mod' ) ) ) )
        // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1903:5: () ( ( ( '*' | '/' | 'div' | 'mod' ) ) )
        {
        // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1903:5: ()
        // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1904:1: 
        {
        }

        // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1904:2: ( ( ( '*' | '/' | 'div' | 'mod' ) ) )
        // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1905:1: ( ( '*' | '/' | 'div' | 'mod' ) )
        {
        // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1905:1: ( ( '*' | '/' | 'div' | 'mod' ) )
        // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1906:1: ( '*' | '/' | 'div' | 'mod' )
        {
        if ( (input.LA(1)>=48 && input.LA(1)<=51) ) {
            input.consume();
            state.errorRecovery=false;state.failed=false;
        }
        else {
            if (state.backtracking>0) {state.failed=true; return ;}
            MismatchedSetException mse = new MismatchedSetException(null,input);
            throw mse;
        }


        }


        }


        }


        }
    }
    // $ANTLR end synpred8_InternalJKind

    // $ANTLR start synpred9_InternalJKind
    public final void synpred9_InternalJKind_fragment() throws RecognitionException {   
        // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2127:3: ( ( () '.' ) )
        // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2127:4: ( () '.' )
        {
        // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2127:4: ( () '.' )
        // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2127:5: () '.'
        {
        // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2127:5: ()
        // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2128:1: 
        {
        }

        match(input,54,FOLLOW_54_in_synpred9_InternalJKind4795); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred9_InternalJKind

    // Delegated rules

    public final boolean synpred5_InternalJKind() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred5_InternalJKind_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred3_InternalJKind() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred3_InternalJKind_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred1_InternalJKind() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred1_InternalJKind_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred2_InternalJKind() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred2_InternalJKind_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred9_InternalJKind() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred9_InternalJKind_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred4_InternalJKind() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred4_InternalJKind_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred7_InternalJKind() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred7_InternalJKind_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred6_InternalJKind() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred6_InternalJKind_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred8_InternalJKind() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred8_InternalJKind_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


    protected DFA17 dfa17 = new DFA17(this);
    protected DFA36 dfa36 = new DFA36(this);
    static final String DFA17_eotS =
        "\16\uffff";
    static final String DFA17_eofS =
        "\16\uffff";
    static final String DFA17_minS =
        "\1\4\1\0\14\uffff";
    static final String DFA17_maxS =
        "\1\75\1\0\14\uffff";
    static final String DFA17_acceptS =
        "\2\uffff\1\2\12\uffff\1\1";
    static final String DFA17_specialS =
        "\1\uffff\1\0\14\uffff}>";
    static final String[] DFA17_transitionS = {
            "\1\1\1\2\15\uffff\1\2\5\uffff\1\2\2\uffff\1\2\27\uffff\2\2"+
            "\1\uffff\1\2\2\uffff\4\2",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA17_eot = DFA.unpackEncodedString(DFA17_eotS);
    static final short[] DFA17_eof = DFA.unpackEncodedString(DFA17_eofS);
    static final char[] DFA17_min = DFA.unpackEncodedStringToUnsignedChars(DFA17_minS);
    static final char[] DFA17_max = DFA.unpackEncodedStringToUnsignedChars(DFA17_maxS);
    static final short[] DFA17_accept = DFA.unpackEncodedString(DFA17_acceptS);
    static final short[] DFA17_special = DFA.unpackEncodedString(DFA17_specialS);
    static final short[][] DFA17_transition;

    static {
        int numStates = DFA17_transitionS.length;
        DFA17_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA17_transition[i] = DFA.unpackEncodedString(DFA17_transitionS[i]);
        }
    }

    class DFA17 extends DFA {

        public DFA17(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 17;
            this.eot = DFA17_eot;
            this.eof = DFA17_eof;
            this.min = DFA17_min;
            this.max = DFA17_max;
            this.accept = DFA17_accept;
            this.special = DFA17_special;
            this.transition = DFA17_transition;
        }
        public String getDescription() {
            return "1051:1: ( ( ( ( ( ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* '=' ) )=> ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= ',' ( (otherlv_2= RULE_ID ) ) )* otherlv_3= '=' ) ) ( (lv_rhs_4_0= ruleExpr ) ) otherlv_5= ';' ) | ( ( (lv_rhs_6_0= ruleExpr ) ) otherlv_7= ';' ) )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA17_1 = input.LA(1);

                         
                        int index17_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_InternalJKind()) ) {s = 13;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index17_1);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 17, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA36_eotS =
        "\16\uffff";
    static final String DFA36_eofS =
        "\1\uffff\1\11\1\14\13\uffff";
    static final String DFA36_minS =
        "\1\4\2\13\10\uffff\1\4\2\uffff";
    static final String DFA36_maxS =
        "\1\75\2\71\10\uffff\1\5\2\uffff";
    static final String DFA36_acceptS =
        "\3\uffff\1\4\1\5\1\6\1\10\1\12\1\7\1\1\1\11\1\uffff\1\2\1\3";
    static final String DFA36_specialS =
        "\16\uffff}>";
    static final String[] DFA36_transitionS = {
            "\1\1\1\2\15\uffff\1\5\10\uffff\1\7\32\uffff\1\4\2\uffff\1\5"+
            "\1\6\2\3",
            "\2\11\1\uffff\1\12\1\uffff\1\11\5\uffff\1\11\2\uffff\1\11"+
            "\2\uffff\1\10\1\11\7\uffff\17\11\2\uffff\1\11\1\uffff\2\11",
            "\2\14\3\uffff\1\14\5\uffff\1\14\2\uffff\1\14\3\uffff\1\14"+
            "\7\uffff\17\14\2\uffff\1\13\1\uffff\2\14",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\14\1\15",
            "",
            ""
    };

    static final short[] DFA36_eot = DFA.unpackEncodedString(DFA36_eotS);
    static final short[] DFA36_eof = DFA.unpackEncodedString(DFA36_eofS);
    static final char[] DFA36_min = DFA.unpackEncodedStringToUnsignedChars(DFA36_minS);
    static final char[] DFA36_max = DFA.unpackEncodedStringToUnsignedChars(DFA36_maxS);
    static final short[] DFA36_accept = DFA.unpackEncodedString(DFA36_acceptS);
    static final short[] DFA36_special = DFA.unpackEncodedString(DFA36_specialS);
    static final short[][] DFA36_transition;

    static {
        int numStates = DFA36_transitionS.length;
        DFA36_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA36_transition[i] = DFA.unpackEncodedString(DFA36_transitionS[i]);
        }
    }

    class DFA36 extends DFA {

        public DFA36(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 36;
            this.eot = DFA36_eot;
            this.eof = DFA36_eof;
            this.min = DFA36_min;
            this.max = DFA36_max;
            this.accept = DFA36_accept;
            this.special = DFA36_special;
            this.transition = DFA36_transition;
        }
        public String getDescription() {
            return "2173:1: ( ( () ( (otherlv_1= RULE_ID ) ) ) | ( () ( (lv_val_3_0= RULE_INT ) ) ) | ( () ( (lv_val_5_0= ruleREAL ) ) ) | ( () ( (lv_val_7_0= ruleBOOL ) ) ) | ( () otherlv_9= 'if' ( (lv_cond_10_0= ruleExpr ) ) otherlv_11= 'then' ( (lv_then_12_0= ruleExpr ) ) otherlv_13= 'else' ( (lv_else_14_0= ruleExpr ) ) ) | ( () ( ( (lv_op_16_1= 'real' | lv_op_16_2= 'floor' ) ) ) otherlv_17= '(' ( (lv_expr_18_0= ruleExpr ) ) otherlv_19= ')' ) | this_NodeCallExpr_20= ruleNodeCallExpr | ( () otherlv_22= 'condact' otherlv_23= '(' ( (lv_clock_24_0= ruleExpr ) ) otherlv_25= ',' ( (lv_call_26_0= ruleNodeCallExpr ) ) (otherlv_27= ',' ( (lv_args_28_0= ruleExpr ) ) )* otherlv_29= ')' ) | ( () ( (otherlv_31= RULE_ID ) ) otherlv_32= '{' ( (otherlv_33= RULE_ID ) ) otherlv_34= '=' ( (lv_exprs_35_0= ruleExpr ) ) (otherlv_36= ';' ( (otherlv_37= RULE_ID ) ) otherlv_38= '=' ( (lv_exprs_39_0= ruleExpr ) ) )* otherlv_40= '}' ) | (otherlv_41= '(' this_Expr_42= ruleExpr otherlv_43= ')' ) )";
        }
    }
 

    public static final BitSet FOLLOW_ruleFile_in_entryRuleFile75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFile85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypedef_in_ruleFile131 = new BitSet(new long[]{0x000000000C000402L});
    public static final BitSet FOLLOW_ruleConstant_in_ruleFile158 = new BitSet(new long[]{0x000000000C000402L});
    public static final BitSet FOLLOW_ruleNode_in_ruleFile185 = new BitSet(new long[]{0x000000000C000402L});
    public static final BitSet FOLLOW_ruleTypedef_in_entryRuleTypedef222 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTypedef232 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_10_in_ruleTypedef279 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleTypedef296 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_ruleTypedef313 = new BitSet(new long[]{0x00000000001E0010L});
    public static final BitSet FOLLOW_ruleType_in_ruleTypedef334 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleTypedef346 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_10_in_ruleTypedef375 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleTypedef392 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_ruleTypedef409 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleTypedef421 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleTypedef433 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleField_in_ruleTypedef454 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleTypedef466 = new BitSet(new long[]{0x00000000001E0010L});
    public static final BitSet FOLLOW_ruleType_in_ruleTypedef487 = new BitSet(new long[]{0x0000000000011000L});
    public static final BitSet FOLLOW_12_in_ruleTypedef500 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleField_in_ruleTypedef521 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleTypedef533 = new BitSet(new long[]{0x00000000001E0010L});
    public static final BitSet FOLLOW_ruleType_in_ruleTypedef554 = new BitSet(new long[]{0x0000000000011000L});
    public static final BitSet FOLLOW_16_in_ruleTypedef568 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleTypedef580 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_entryRuleType617 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleType627 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_ruleType674 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_ruleType703 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_ruleType732 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_ruleType761 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleType773 = new BitSet(new long[]{0x0000000002000020L});
    public static final BitSet FOLLOW_ruleBound_in_ruleType794 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_ruleType806 = new BitSet(new long[]{0x0000000002000020L});
    public static final BitSet FOLLOW_ruleBound_in_ruleType827 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_ruleType839 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleType851 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleType863 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleType900 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleField_in_entryRuleField937 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleField947 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleField988 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBound_in_entryRuleBound1029 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBound1040 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_ruleBound1079 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleBound1096 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConstant_in_entryRuleConstant1141 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConstant1151 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_ruleConstant1188 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleConstant1205 = new BitSet(new long[]{0x0000000000008800L});
    public static final BitSet FOLLOW_15_in_ruleConstant1223 = new BitSet(new long[]{0x00000000001E0010L});
    public static final BitSet FOLLOW_ruleType_in_ruleConstant1244 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_ruleConstant1258 = new BitSet(new long[]{0x3CB0000012080030L});
    public static final BitSet FOLLOW_ruleExpr_in_ruleConstant1279 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleConstant1291 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNode_in_entryRuleNode1327 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNode1337 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_ruleNode1374 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleNode1391 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_ruleNode1408 = new BitSet(new long[]{0x0000000020000010L});
    public static final BitSet FOLLOW_ruleVariableGroup_in_ruleNode1430 = new BitSet(new long[]{0x0000000020001000L});
    public static final BitSet FOLLOW_12_in_ruleNode1443 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleVariableGroup_in_ruleNode1464 = new BitSet(new long[]{0x0000000020001000L});
    public static final BitSet FOLLOW_29_in_ruleNode1480 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_ruleNode1492 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_ruleNode1504 = new BitSet(new long[]{0x0000000020000010L});
    public static final BitSet FOLLOW_ruleVariableGroup_in_ruleNode1526 = new BitSet(new long[]{0x0000000020001000L});
    public static final BitSet FOLLOW_12_in_ruleNode1539 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleVariableGroup_in_ruleNode1560 = new BitSet(new long[]{0x0000000020001000L});
    public static final BitSet FOLLOW_29_in_ruleNode1576 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleNode1588 = new BitSet(new long[]{0x0000000180000000L});
    public static final BitSet FOLLOW_31_in_ruleNode1601 = new BitSet(new long[]{0x0000000100000010L});
    public static final BitSet FOLLOW_ruleVariableGroup_in_ruleNode1623 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleNode1635 = new BitSet(new long[]{0x0000000100000010L});
    public static final BitSet FOLLOW_32_in_ruleNode1651 = new BitSet(new long[]{0x3CB0001E12080030L});
    public static final BitSet FOLLOW_ruleEquation_in_ruleNode1673 = new BitSet(new long[]{0x3CB0001E12080030L});
    public static final BitSet FOLLOW_ruleAssertion_in_ruleNode1700 = new BitSet(new long[]{0x3CB0001E12080030L});
    public static final BitSet FOLLOW_ruleProperty_in_ruleNode1727 = new BitSet(new long[]{0x3CB0001E12080030L});
    public static final BitSet FOLLOW_ruleMain_in_ruleNode1754 = new BitSet(new long[]{0x3CB0001E12080030L});
    public static final BitSet FOLLOW_33_in_ruleNode1768 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_12_in_ruleNode1781 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariableGroup_in_entryRuleVariableGroup1819 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVariableGroup1829 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariable_in_ruleVariableGroup1875 = new BitSet(new long[]{0x0000000000408000L});
    public static final BitSet FOLLOW_22_in_ruleVariableGroup1888 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleVariable_in_ruleVariableGroup1909 = new BitSet(new long[]{0x0000000000408000L});
    public static final BitSet FOLLOW_15_in_ruleVariableGroup1923 = new BitSet(new long[]{0x00000000001E0010L});
    public static final BitSet FOLLOW_ruleType_in_ruleVariableGroup1944 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariable_in_entryRuleVariable1980 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVariable1990 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleVariable2031 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEquation_in_entryRuleEquation2071 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEquation2081 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEquation2167 = new BitSet(new long[]{0x0000000000400800L});
    public static final BitSet FOLLOW_22_in_ruleEquation2180 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEquation2200 = new BitSet(new long[]{0x0000000000400800L});
    public static final BitSet FOLLOW_11_in_ruleEquation2214 = new BitSet(new long[]{0x3CB0000012080030L});
    public static final BitSet FOLLOW_ruleExpr_in_ruleEquation2237 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleEquation2249 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpr_in_ruleEquation2278 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleEquation2290 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProperty_in_entryRuleProperty2327 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleProperty2337 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_ruleProperty2374 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleProperty2394 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleProperty2406 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMain_in_entryRuleMain2443 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMain2454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_ruleMain2492 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_12_in_ruleMain2506 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAssertion_in_entryRuleAssertion2548 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAssertion2558 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_ruleAssertion2595 = new BitSet(new long[]{0x3CB0000012080030L});
    public static final BitSet FOLLOW_ruleExpr_in_ruleAssertion2616 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleAssertion2628 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpr_in_entryRuleExpr2664 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExpr2674 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleArrowExpr_in_ruleExpr2720 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleArrowExpr_in_entryRuleArrowExpr2754 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleArrowExpr2764 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImpliesExpr_in_ruleArrowExpr2811 = new BitSet(new long[]{0x0000002000000002L});
    public static final BitSet FOLLOW_37_in_ruleArrowExpr2862 = new BitSet(new long[]{0x3CB0000012080030L});
    public static final BitSet FOLLOW_ruleArrowExpr_in_ruleArrowExpr2898 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImpliesExpr_in_entryRuleImpliesExpr2936 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleImpliesExpr2946 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOrExpr_in_ruleImpliesExpr2993 = new BitSet(new long[]{0x0000004000000002L});
    public static final BitSet FOLLOW_38_in_ruleImpliesExpr3044 = new BitSet(new long[]{0x3CB0000012080030L});
    public static final BitSet FOLLOW_ruleImpliesExpr_in_ruleImpliesExpr3080 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOrExpr_in_entryRuleOrExpr3118 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOrExpr3128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAndExpr_in_ruleOrExpr3175 = new BitSet(new long[]{0x0000018000000002L});
    public static final BitSet FOLLOW_39_in_ruleOrExpr3247 = new BitSet(new long[]{0x3CB0000012080030L});
    public static final BitSet FOLLOW_40_in_ruleOrExpr3276 = new BitSet(new long[]{0x3CB0000012080030L});
    public static final BitSet FOLLOW_ruleAndExpr_in_ruleOrExpr3315 = new BitSet(new long[]{0x0000018000000002L});
    public static final BitSet FOLLOW_ruleAndExpr_in_entryRuleAndExpr3353 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAndExpr3363 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRelationalExpr_in_ruleAndExpr3410 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_41_in_ruleAndExpr3461 = new BitSet(new long[]{0x3CB0000012080030L});
    public static final BitSet FOLLOW_ruleRelationalExpr_in_ruleAndExpr3497 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_ruleRelationalExpr_in_entryRuleRelationalExpr3535 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRelationalExpr3545 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePlusExpr_in_ruleRelationalExpr3592 = new BitSet(new long[]{0x00007C0000000802L});
    public static final BitSet FOLLOW_42_in_ruleRelationalExpr3720 = new BitSet(new long[]{0x3CB0000012080030L});
    public static final BitSet FOLLOW_43_in_ruleRelationalExpr3749 = new BitSet(new long[]{0x3CB0000012080030L});
    public static final BitSet FOLLOW_44_in_ruleRelationalExpr3778 = new BitSet(new long[]{0x3CB0000012080030L});
    public static final BitSet FOLLOW_45_in_ruleRelationalExpr3807 = new BitSet(new long[]{0x3CB0000012080030L});
    public static final BitSet FOLLOW_11_in_ruleRelationalExpr3836 = new BitSet(new long[]{0x3CB0000012080030L});
    public static final BitSet FOLLOW_46_in_ruleRelationalExpr3865 = new BitSet(new long[]{0x3CB0000012080030L});
    public static final BitSet FOLLOW_rulePlusExpr_in_ruleRelationalExpr3904 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePlusExpr_in_entryRulePlusExpr3942 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePlusExpr3952 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTimesExpr_in_rulePlusExpr3999 = new BitSet(new long[]{0x0000800002000002L});
    public static final BitSet FOLLOW_47_in_rulePlusExpr4071 = new BitSet(new long[]{0x3CB0000012080030L});
    public static final BitSet FOLLOW_25_in_rulePlusExpr4100 = new BitSet(new long[]{0x3CB0000012080030L});
    public static final BitSet FOLLOW_ruleTimesExpr_in_rulePlusExpr4139 = new BitSet(new long[]{0x0000800002000002L});
    public static final BitSet FOLLOW_ruleTimesExpr_in_entryRuleTimesExpr4177 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTimesExpr4187 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrefixExpr_in_ruleTimesExpr4234 = new BitSet(new long[]{0x000F000000000002L});
    public static final BitSet FOLLOW_48_in_ruleTimesExpr4334 = new BitSet(new long[]{0x3CB0000012080030L});
    public static final BitSet FOLLOW_49_in_ruleTimesExpr4363 = new BitSet(new long[]{0x3CB0000012080030L});
    public static final BitSet FOLLOW_50_in_ruleTimesExpr4392 = new BitSet(new long[]{0x3CB0000012080030L});
    public static final BitSet FOLLOW_51_in_ruleTimesExpr4421 = new BitSet(new long[]{0x3CB0000012080030L});
    public static final BitSet FOLLOW_rulePrefixExpr_in_ruleTimesExpr4460 = new BitSet(new long[]{0x000F000000000002L});
    public static final BitSet FOLLOW_rulePrefixExpr_in_entryRulePrefixExpr4498 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePrefixExpr4508 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rulePrefixExpr4563 = new BitSet(new long[]{0x3CB0000012080030L});
    public static final BitSet FOLLOW_52_in_rulePrefixExpr4592 = new BitSet(new long[]{0x3CB0000012080030L});
    public static final BitSet FOLLOW_53_in_rulePrefixExpr4621 = new BitSet(new long[]{0x3CB0000012080030L});
    public static final BitSet FOLLOW_rulePrefixExpr_in_rulePrefixExpr4658 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProjectionExpr_in_rulePrefixExpr4687 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProjectionExpr_in_entryRuleProjectionExpr4722 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleProjectionExpr4732 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAtomicExpr_in_ruleProjectionExpr4779 = new BitSet(new long[]{0x0040000000000002L});
    public static final BitSet FOLLOW_54_in_ruleProjectionExpr4814 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleProjectionExpr4836 = new BitSet(new long[]{0x0040000000000002L});
    public static final BitSet FOLLOW_ruleAtomicExpr_in_entryRuleAtomicExpr4874 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAtomicExpr4884 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAtomicExpr4939 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleAtomicExpr4973 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleREAL_in_ruleAtomicExpr5016 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBOOL_in_ruleAtomicExpr5054 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_ruleAtomicExpr5083 = new BitSet(new long[]{0x3CB0000012080030L});
    public static final BitSet FOLLOW_ruleExpr_in_ruleAtomicExpr5104 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_56_in_ruleAtomicExpr5116 = new BitSet(new long[]{0x3CB0000012080030L});
    public static final BitSet FOLLOW_ruleExpr_in_ruleAtomicExpr5137 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_57_in_ruleAtomicExpr5149 = new BitSet(new long[]{0x3CB0000012080030L});
    public static final BitSet FOLLOW_ruleExpr_in_ruleAtomicExpr5170 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_ruleAtomicExpr5207 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_58_in_ruleAtomicExpr5236 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_ruleAtomicExpr5264 = new BitSet(new long[]{0x3CB0000012080030L});
    public static final BitSet FOLLOW_ruleExpr_in_ruleAtomicExpr5285 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_ruleAtomicExpr5297 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNodeCallExpr_in_ruleAtomicExpr5326 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_59_in_ruleAtomicExpr5353 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_ruleAtomicExpr5365 = new BitSet(new long[]{0x3CB0000012080030L});
    public static final BitSet FOLLOW_ruleExpr_in_ruleAtomicExpr5386 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_ruleAtomicExpr5398 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleNodeCallExpr_in_ruleAtomicExpr5419 = new BitSet(new long[]{0x0000000020400000L});
    public static final BitSet FOLLOW_22_in_ruleAtomicExpr5432 = new BitSet(new long[]{0x3CB0000012080030L});
    public static final BitSet FOLLOW_ruleExpr_in_ruleAtomicExpr5453 = new BitSet(new long[]{0x0000000020400000L});
    public static final BitSet FOLLOW_29_in_ruleAtomicExpr5467 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAtomicExpr5504 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleAtomicExpr5516 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAtomicExpr5536 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_ruleAtomicExpr5548 = new BitSet(new long[]{0x3CB0000012080030L});
    public static final BitSet FOLLOW_ruleExpr_in_ruleAtomicExpr5569 = new BitSet(new long[]{0x0000000000011000L});
    public static final BitSet FOLLOW_12_in_ruleAtomicExpr5582 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAtomicExpr5602 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_ruleAtomicExpr5614 = new BitSet(new long[]{0x3CB0000012080030L});
    public static final BitSet FOLLOW_ruleExpr_in_ruleAtomicExpr5635 = new BitSet(new long[]{0x0000000000011000L});
    public static final BitSet FOLLOW_16_in_ruleAtomicExpr5649 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_ruleAtomicExpr5669 = new BitSet(new long[]{0x3CB0000012080030L});
    public static final BitSet FOLLOW_ruleExpr_in_ruleAtomicExpr5691 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_ruleAtomicExpr5702 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNodeCallExpr_in_entryRuleNodeCallExpr5739 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNodeCallExpr5749 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleNodeCallExpr5794 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_ruleNodeCallExpr5806 = new BitSet(new long[]{0x3CB0000032080030L});
    public static final BitSet FOLLOW_ruleExpr_in_ruleNodeCallExpr5828 = new BitSet(new long[]{0x0000000020400000L});
    public static final BitSet FOLLOW_22_in_ruleNodeCallExpr5841 = new BitSet(new long[]{0x3CB0000012080030L});
    public static final BitSet FOLLOW_ruleExpr_in_ruleNodeCallExpr5862 = new BitSet(new long[]{0x0000000020400000L});
    public static final BitSet FOLLOW_29_in_ruleNodeCallExpr5878 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleREAL_in_entryRuleREAL5917 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleREAL5928 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleREAL5968 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_54_in_ruleREAL5986 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleREAL6001 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBOOL_in_entryRuleBOOL6047 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBOOL6058 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_60_in_ruleBOOL6096 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_61_in_ruleBOOL6115 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_synpred1_InternalJKind2124 = new BitSet(new long[]{0x0000000000400800L});
    public static final BitSet FOLLOW_22_in_synpred1_InternalJKind2132 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_synpred1_InternalJKind2140 = new BitSet(new long[]{0x0000000000400800L});
    public static final BitSet FOLLOW_11_in_synpred1_InternalJKind2149 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_synpred2_InternalJKind2831 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_synpred3_InternalJKind3013 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_synpred4_InternalJKind3194 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_synpred5_InternalJKind3430 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_synpred6_InternalJKind3611 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_synpred7_InternalJKind4018 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_synpred8_InternalJKind4253 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_54_in_synpred9_InternalJKind4795 = new BitSet(new long[]{0x0000000000000002L});

}