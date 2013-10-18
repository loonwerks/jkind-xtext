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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_WS", "RULE_SL_COMMENT", "RULE_ML_COMMENT", "RULE_ANY_OTHER", "'type'", "'='", "';'", "'struct'", "'{'", "':'", "'}'", "'int'", "'bool'", "'real'", "'subrange'", "'['", "','", "']'", "'of'", "'-'", "'const'", "'node'", "'('", "')'", "'returns'", "'var'", "'let'", "'tel'", "'--%PROPERTY'", "'--%MAIN'", "'assert'", "'->'", "'=>'", "'or'", "'xor'", "'and'", "'<'", "'<='", "'>'", "'>='", "'<>'", "'+'", "'*'", "'/'", "'div'", "'not'", "'pre'", "'.'", "'if'", "'then'", "'else'", "'condact'", "'true'", "'false'"
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

                        if ( (LA3_3==RULE_ID||(LA3_3>=17 && LA3_3<=20)) ) {
                            alt3=1;
                        }
                        else if ( (LA3_3==13) ) {
                            alt3=2;
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
    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1047:1: ruleEquation returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= ',' ( (otherlv_2= RULE_ID ) ) )* otherlv_3= '=' ( (lv_rhs_4_0= ruleExpr ) ) otherlv_5= ';' ) ;
    public final EObject ruleEquation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_rhs_4_0 = null;


         enterRule(); 
            
        try {
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1050:28: ( ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= ',' ( (otherlv_2= RULE_ID ) ) )* otherlv_3= '=' ( (lv_rhs_4_0= ruleExpr ) ) otherlv_5= ';' ) )
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1051:1: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= ',' ( (otherlv_2= RULE_ID ) ) )* otherlv_3= '=' ( (lv_rhs_4_0= ruleExpr ) ) otherlv_5= ';' )
            {
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1051:1: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= ',' ( (otherlv_2= RULE_ID ) ) )* otherlv_3= '=' ( (lv_rhs_4_0= ruleExpr ) ) otherlv_5= ';' )
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1051:2: ( (otherlv_0= RULE_ID ) ) (otherlv_1= ',' ( (otherlv_2= RULE_ID ) ) )* otherlv_3= '=' ( (lv_rhs_4_0= ruleExpr ) ) otherlv_5= ';'
            {
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1051:2: ( (otherlv_0= RULE_ID ) )
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1052:1: (otherlv_0= RULE_ID )
            {
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1052:1: (otherlv_0= RULE_ID )
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1053:3: otherlv_0= RULE_ID
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getEquationRule());
              	        }
                      
            }
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEquation2126); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		newLeafNode(otherlv_0, grammarAccess.getEquationAccess().getLhsVariableCrossReference_0_0()); 
              	
            }

            }


            }

            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1064:2: (otherlv_1= ',' ( (otherlv_2= RULE_ID ) ) )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==22) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1064:4: otherlv_1= ',' ( (otherlv_2= RULE_ID ) )
            	    {
            	    otherlv_1=(Token)match(input,22,FOLLOW_22_in_ruleEquation2139); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_1, grammarAccess.getEquationAccess().getCommaKeyword_1_0());
            	          
            	    }
            	    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1068:1: ( (otherlv_2= RULE_ID ) )
            	    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1069:1: (otherlv_2= RULE_ID )
            	    {
            	    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1069:1: (otherlv_2= RULE_ID )
            	    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1070:3: otherlv_2= RULE_ID
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getEquationRule());
            	      	        }
            	              
            	    }
            	    otherlv_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEquation2159); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		newLeafNode(otherlv_2, grammarAccess.getEquationAccess().getLhsVariableCrossReference_1_1_0()); 
            	      	
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

            otherlv_3=(Token)match(input,11,FOLLOW_11_in_ruleEquation2173); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getEquationAccess().getEqualsSignKeyword_2());
                  
            }
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1085:1: ( (lv_rhs_4_0= ruleExpr ) )
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1086:1: (lv_rhs_4_0= ruleExpr )
            {
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1086:1: (lv_rhs_4_0= ruleExpr )
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1087:3: lv_rhs_4_0= ruleExpr
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getEquationAccess().getRhsExprParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleExpr_in_ruleEquation2194);
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

            otherlv_5=(Token)match(input,12,FOLLOW_12_in_ruleEquation2206); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getEquationAccess().getSemicolonKeyword_4());
                  
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
    // $ANTLR end "ruleEquation"


    // $ANTLR start "entryRuleProperty"
    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1115:1: entryRuleProperty returns [EObject current=null] : iv_ruleProperty= ruleProperty EOF ;
    public final EObject entryRuleProperty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProperty = null;


        try {
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1116:2: (iv_ruleProperty= ruleProperty EOF )
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1117:2: iv_ruleProperty= ruleProperty EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPropertyRule()); 
            }
            pushFollow(FOLLOW_ruleProperty_in_entryRuleProperty2242);
            iv_ruleProperty=ruleProperty();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleProperty; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleProperty2252); if (state.failed) return current;

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
    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1124:1: ruleProperty returns [EObject current=null] : (otherlv_0= '--%PROPERTY' ( (otherlv_1= RULE_ID ) ) otherlv_2= ';' ) ;
    public final EObject ruleProperty() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;

         enterRule(); 
            
        try {
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1127:28: ( (otherlv_0= '--%PROPERTY' ( (otherlv_1= RULE_ID ) ) otherlv_2= ';' ) )
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1128:1: (otherlv_0= '--%PROPERTY' ( (otherlv_1= RULE_ID ) ) otherlv_2= ';' )
            {
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1128:1: (otherlv_0= '--%PROPERTY' ( (otherlv_1= RULE_ID ) ) otherlv_2= ';' )
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1128:3: otherlv_0= '--%PROPERTY' ( (otherlv_1= RULE_ID ) ) otherlv_2= ';'
            {
            otherlv_0=(Token)match(input,34,FOLLOW_34_in_ruleProperty2289); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getPropertyAccess().getPROPERTYKeyword_0());
                  
            }
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1132:1: ( (otherlv_1= RULE_ID ) )
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1133:1: (otherlv_1= RULE_ID )
            {
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1133:1: (otherlv_1= RULE_ID )
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1134:3: otherlv_1= RULE_ID
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getPropertyRule());
              	        }
                      
            }
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleProperty2309); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		newLeafNode(otherlv_1, grammarAccess.getPropertyAccess().getRefVariableCrossReference_1_0()); 
              	
            }

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_12_in_ruleProperty2321); if (state.failed) return current;
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
    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1157:1: entryRuleMain returns [String current=null] : iv_ruleMain= ruleMain EOF ;
    public final String entryRuleMain() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleMain = null;


        try {
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1158:2: (iv_ruleMain= ruleMain EOF )
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1159:2: iv_ruleMain= ruleMain EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMainRule()); 
            }
            pushFollow(FOLLOW_ruleMain_in_entryRuleMain2358);
            iv_ruleMain=ruleMain();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMain.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleMain2369); if (state.failed) return current;

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
    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1166:1: ruleMain returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '--%MAIN' (kw= ';' )? ) ;
    public final AntlrDatatypeRuleToken ruleMain() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1169:28: ( (kw= '--%MAIN' (kw= ';' )? ) )
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1170:1: (kw= '--%MAIN' (kw= ';' )? )
            {
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1170:1: (kw= '--%MAIN' (kw= ';' )? )
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1171:2: kw= '--%MAIN' (kw= ';' )?
            {
            kw=(Token)match(input,35,FOLLOW_35_in_ruleMain2407); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current.merge(kw);
                      newLeafNode(kw, grammarAccess.getMainAccess().getMAINKeyword_0()); 
                  
            }
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1176:1: (kw= ';' )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==12) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1177:2: kw= ';'
                    {
                    kw=(Token)match(input,12,FOLLOW_12_in_ruleMain2421); if (state.failed) return current;
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
    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1190:1: entryRuleAssertion returns [EObject current=null] : iv_ruleAssertion= ruleAssertion EOF ;
    public final EObject entryRuleAssertion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAssertion = null;


        try {
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1191:2: (iv_ruleAssertion= ruleAssertion EOF )
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1192:2: iv_ruleAssertion= ruleAssertion EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAssertionRule()); 
            }
            pushFollow(FOLLOW_ruleAssertion_in_entryRuleAssertion2463);
            iv_ruleAssertion=ruleAssertion();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAssertion; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAssertion2473); if (state.failed) return current;

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
    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1199:1: ruleAssertion returns [EObject current=null] : (otherlv_0= 'assert' ( (lv_expr_1_0= ruleExpr ) ) otherlv_2= ';' ) ;
    public final EObject ruleAssertion() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_expr_1_0 = null;


         enterRule(); 
            
        try {
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1202:28: ( (otherlv_0= 'assert' ( (lv_expr_1_0= ruleExpr ) ) otherlv_2= ';' ) )
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1203:1: (otherlv_0= 'assert' ( (lv_expr_1_0= ruleExpr ) ) otherlv_2= ';' )
            {
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1203:1: (otherlv_0= 'assert' ( (lv_expr_1_0= ruleExpr ) ) otherlv_2= ';' )
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1203:3: otherlv_0= 'assert' ( (lv_expr_1_0= ruleExpr ) ) otherlv_2= ';'
            {
            otherlv_0=(Token)match(input,36,FOLLOW_36_in_ruleAssertion2510); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getAssertionAccess().getAssertKeyword_0());
                  
            }
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1207:1: ( (lv_expr_1_0= ruleExpr ) )
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1208:1: (lv_expr_1_0= ruleExpr )
            {
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1208:1: (lv_expr_1_0= ruleExpr )
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1209:3: lv_expr_1_0= ruleExpr
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getAssertionAccess().getExprExprParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleExpr_in_ruleAssertion2531);
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

            otherlv_2=(Token)match(input,12,FOLLOW_12_in_ruleAssertion2543); if (state.failed) return current;
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
    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1237:1: entryRuleExpr returns [EObject current=null] : iv_ruleExpr= ruleExpr EOF ;
    public final EObject entryRuleExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpr = null;


        try {
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1238:2: (iv_ruleExpr= ruleExpr EOF )
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1239:2: iv_ruleExpr= ruleExpr EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExprRule()); 
            }
            pushFollow(FOLLOW_ruleExpr_in_entryRuleExpr2579);
            iv_ruleExpr=ruleExpr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExpr; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleExpr2589); if (state.failed) return current;

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
    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1246:1: ruleExpr returns [EObject current=null] : this_ArrowExpr_0= ruleArrowExpr ;
    public final EObject ruleExpr() throws RecognitionException {
        EObject current = null;

        EObject this_ArrowExpr_0 = null;


         enterRule(); 
            
        try {
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1249:28: (this_ArrowExpr_0= ruleArrowExpr )
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1251:5: this_ArrowExpr_0= ruleArrowExpr
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getExprAccess().getArrowExprParserRuleCall()); 
                  
            }
            pushFollow(FOLLOW_ruleArrowExpr_in_ruleExpr2635);
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
    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1267:1: entryRuleArrowExpr returns [EObject current=null] : iv_ruleArrowExpr= ruleArrowExpr EOF ;
    public final EObject entryRuleArrowExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArrowExpr = null;


        try {
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1268:2: (iv_ruleArrowExpr= ruleArrowExpr EOF )
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1269:2: iv_ruleArrowExpr= ruleArrowExpr EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getArrowExprRule()); 
            }
            pushFollow(FOLLOW_ruleArrowExpr_in_entryRuleArrowExpr2669);
            iv_ruleArrowExpr=ruleArrowExpr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleArrowExpr; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleArrowExpr2679); if (state.failed) return current;

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
    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1276:1: ruleArrowExpr returns [EObject current=null] : (this_ImpliesExpr_0= ruleImpliesExpr ( ( ( ( () ( ( '->' ) ) ) )=> ( () ( (lv_op_2_0= '->' ) ) ) ) ( (lv_right_3_0= ruleArrowExpr ) ) )? ) ;
    public final EObject ruleArrowExpr() throws RecognitionException {
        EObject current = null;

        Token lv_op_2_0=null;
        EObject this_ImpliesExpr_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1279:28: ( (this_ImpliesExpr_0= ruleImpliesExpr ( ( ( ( () ( ( '->' ) ) ) )=> ( () ( (lv_op_2_0= '->' ) ) ) ) ( (lv_right_3_0= ruleArrowExpr ) ) )? ) )
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1280:1: (this_ImpliesExpr_0= ruleImpliesExpr ( ( ( ( () ( ( '->' ) ) ) )=> ( () ( (lv_op_2_0= '->' ) ) ) ) ( (lv_right_3_0= ruleArrowExpr ) ) )? )
            {
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1280:1: (this_ImpliesExpr_0= ruleImpliesExpr ( ( ( ( () ( ( '->' ) ) ) )=> ( () ( (lv_op_2_0= '->' ) ) ) ) ( (lv_right_3_0= ruleArrowExpr ) ) )? )
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1281:5: this_ImpliesExpr_0= ruleImpliesExpr ( ( ( ( () ( ( '->' ) ) ) )=> ( () ( (lv_op_2_0= '->' ) ) ) ) ( (lv_right_3_0= ruleArrowExpr ) ) )?
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getArrowExprAccess().getImpliesExprParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleImpliesExpr_in_ruleArrowExpr2726);
            this_ImpliesExpr_0=ruleImpliesExpr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_ImpliesExpr_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1289:1: ( ( ( ( () ( ( '->' ) ) ) )=> ( () ( (lv_op_2_0= '->' ) ) ) ) ( (lv_right_3_0= ruleArrowExpr ) ) )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==37) ) {
                int LA18_1 = input.LA(2);

                if ( (synpred1_InternalJKind()) ) {
                    alt18=1;
                }
            }
            switch (alt18) {
                case 1 :
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1289:2: ( ( ( () ( ( '->' ) ) ) )=> ( () ( (lv_op_2_0= '->' ) ) ) ) ( (lv_right_3_0= ruleArrowExpr ) )
                    {
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1289:2: ( ( ( () ( ( '->' ) ) ) )=> ( () ( (lv_op_2_0= '->' ) ) ) )
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1289:3: ( ( () ( ( '->' ) ) ) )=> ( () ( (lv_op_2_0= '->' ) ) )
                    {
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1296:6: ( () ( (lv_op_2_0= '->' ) ) )
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1296:7: () ( (lv_op_2_0= '->' ) )
                    {
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1296:7: ()
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1297:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElementAndSet(
                                  grammarAccess.getArrowExprAccess().getBinaryExprLeftAction_1_0_0_0(),
                                  current);
                          
                    }

                    }

                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1302:2: ( (lv_op_2_0= '->' ) )
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1303:1: (lv_op_2_0= '->' )
                    {
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1303:1: (lv_op_2_0= '->' )
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1304:3: lv_op_2_0= '->'
                    {
                    lv_op_2_0=(Token)match(input,37,FOLLOW_37_in_ruleArrowExpr2777); if (state.failed) return current;
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

                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1317:4: ( (lv_right_3_0= ruleArrowExpr ) )
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1318:1: (lv_right_3_0= ruleArrowExpr )
                    {
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1318:1: (lv_right_3_0= ruleArrowExpr )
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1319:3: lv_right_3_0= ruleArrowExpr
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getArrowExprAccess().getRightArrowExprParserRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleArrowExpr_in_ruleArrowExpr2813);
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
    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1343:1: entryRuleImpliesExpr returns [EObject current=null] : iv_ruleImpliesExpr= ruleImpliesExpr EOF ;
    public final EObject entryRuleImpliesExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImpliesExpr = null;


        try {
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1344:2: (iv_ruleImpliesExpr= ruleImpliesExpr EOF )
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1345:2: iv_ruleImpliesExpr= ruleImpliesExpr EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getImpliesExprRule()); 
            }
            pushFollow(FOLLOW_ruleImpliesExpr_in_entryRuleImpliesExpr2851);
            iv_ruleImpliesExpr=ruleImpliesExpr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleImpliesExpr; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleImpliesExpr2861); if (state.failed) return current;

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
    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1352:1: ruleImpliesExpr returns [EObject current=null] : (this_OrExpr_0= ruleOrExpr ( ( ( ( () ( ( '=>' ) ) ) )=> ( () ( (lv_op_2_0= '=>' ) ) ) ) ( (lv_right_3_0= ruleImpliesExpr ) ) )? ) ;
    public final EObject ruleImpliesExpr() throws RecognitionException {
        EObject current = null;

        Token lv_op_2_0=null;
        EObject this_OrExpr_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1355:28: ( (this_OrExpr_0= ruleOrExpr ( ( ( ( () ( ( '=>' ) ) ) )=> ( () ( (lv_op_2_0= '=>' ) ) ) ) ( (lv_right_3_0= ruleImpliesExpr ) ) )? ) )
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1356:1: (this_OrExpr_0= ruleOrExpr ( ( ( ( () ( ( '=>' ) ) ) )=> ( () ( (lv_op_2_0= '=>' ) ) ) ) ( (lv_right_3_0= ruleImpliesExpr ) ) )? )
            {
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1356:1: (this_OrExpr_0= ruleOrExpr ( ( ( ( () ( ( '=>' ) ) ) )=> ( () ( (lv_op_2_0= '=>' ) ) ) ) ( (lv_right_3_0= ruleImpliesExpr ) ) )? )
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1357:5: this_OrExpr_0= ruleOrExpr ( ( ( ( () ( ( '=>' ) ) ) )=> ( () ( (lv_op_2_0= '=>' ) ) ) ) ( (lv_right_3_0= ruleImpliesExpr ) ) )?
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getImpliesExprAccess().getOrExprParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleOrExpr_in_ruleImpliesExpr2908);
            this_OrExpr_0=ruleOrExpr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_OrExpr_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1365:1: ( ( ( ( () ( ( '=>' ) ) ) )=> ( () ( (lv_op_2_0= '=>' ) ) ) ) ( (lv_right_3_0= ruleImpliesExpr ) ) )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==38) ) {
                int LA19_1 = input.LA(2);

                if ( (synpred2_InternalJKind()) ) {
                    alt19=1;
                }
            }
            switch (alt19) {
                case 1 :
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1365:2: ( ( ( () ( ( '=>' ) ) ) )=> ( () ( (lv_op_2_0= '=>' ) ) ) ) ( (lv_right_3_0= ruleImpliesExpr ) )
                    {
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1365:2: ( ( ( () ( ( '=>' ) ) ) )=> ( () ( (lv_op_2_0= '=>' ) ) ) )
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1365:3: ( ( () ( ( '=>' ) ) ) )=> ( () ( (lv_op_2_0= '=>' ) ) )
                    {
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1372:6: ( () ( (lv_op_2_0= '=>' ) ) )
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1372:7: () ( (lv_op_2_0= '=>' ) )
                    {
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1372:7: ()
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1373:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElementAndSet(
                                  grammarAccess.getImpliesExprAccess().getBinaryExprLeftAction_1_0_0_0(),
                                  current);
                          
                    }

                    }

                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1378:2: ( (lv_op_2_0= '=>' ) )
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1379:1: (lv_op_2_0= '=>' )
                    {
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1379:1: (lv_op_2_0= '=>' )
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1380:3: lv_op_2_0= '=>'
                    {
                    lv_op_2_0=(Token)match(input,38,FOLLOW_38_in_ruleImpliesExpr2959); if (state.failed) return current;
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

                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1393:4: ( (lv_right_3_0= ruleImpliesExpr ) )
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1394:1: (lv_right_3_0= ruleImpliesExpr )
                    {
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1394:1: (lv_right_3_0= ruleImpliesExpr )
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1395:3: lv_right_3_0= ruleImpliesExpr
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getImpliesExprAccess().getRightImpliesExprParserRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleImpliesExpr_in_ruleImpliesExpr2995);
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
    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1419:1: entryRuleOrExpr returns [EObject current=null] : iv_ruleOrExpr= ruleOrExpr EOF ;
    public final EObject entryRuleOrExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOrExpr = null;


        try {
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1420:2: (iv_ruleOrExpr= ruleOrExpr EOF )
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1421:2: iv_ruleOrExpr= ruleOrExpr EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOrExprRule()); 
            }
            pushFollow(FOLLOW_ruleOrExpr_in_entryRuleOrExpr3033);
            iv_ruleOrExpr=ruleOrExpr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOrExpr; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOrExpr3043); if (state.failed) return current;

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
    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1428:1: ruleOrExpr returns [EObject current=null] : (this_AndExpr_0= ruleAndExpr ( ( ( ( () ( ( ( 'or' | 'xor' ) ) ) ) )=> ( () ( ( (lv_op_2_1= 'or' | lv_op_2_2= 'xor' ) ) ) ) ) ( (lv_right_3_0= ruleAndExpr ) ) )* ) ;
    public final EObject ruleOrExpr() throws RecognitionException {
        EObject current = null;

        Token lv_op_2_1=null;
        Token lv_op_2_2=null;
        EObject this_AndExpr_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1431:28: ( (this_AndExpr_0= ruleAndExpr ( ( ( ( () ( ( ( 'or' | 'xor' ) ) ) ) )=> ( () ( ( (lv_op_2_1= 'or' | lv_op_2_2= 'xor' ) ) ) ) ) ( (lv_right_3_0= ruleAndExpr ) ) )* ) )
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1432:1: (this_AndExpr_0= ruleAndExpr ( ( ( ( () ( ( ( 'or' | 'xor' ) ) ) ) )=> ( () ( ( (lv_op_2_1= 'or' | lv_op_2_2= 'xor' ) ) ) ) ) ( (lv_right_3_0= ruleAndExpr ) ) )* )
            {
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1432:1: (this_AndExpr_0= ruleAndExpr ( ( ( ( () ( ( ( 'or' | 'xor' ) ) ) ) )=> ( () ( ( (lv_op_2_1= 'or' | lv_op_2_2= 'xor' ) ) ) ) ) ( (lv_right_3_0= ruleAndExpr ) ) )* )
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1433:5: this_AndExpr_0= ruleAndExpr ( ( ( ( () ( ( ( 'or' | 'xor' ) ) ) ) )=> ( () ( ( (lv_op_2_1= 'or' | lv_op_2_2= 'xor' ) ) ) ) ) ( (lv_right_3_0= ruleAndExpr ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getOrExprAccess().getAndExprParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleAndExpr_in_ruleOrExpr3090);
            this_AndExpr_0=ruleAndExpr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_AndExpr_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1441:1: ( ( ( ( () ( ( ( 'or' | 'xor' ) ) ) ) )=> ( () ( ( (lv_op_2_1= 'or' | lv_op_2_2= 'xor' ) ) ) ) ) ( (lv_right_3_0= ruleAndExpr ) ) )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==39) ) {
                    int LA21_2 = input.LA(2);

                    if ( (synpred3_InternalJKind()) ) {
                        alt21=1;
                    }


                }
                else if ( (LA21_0==40) ) {
                    int LA21_3 = input.LA(2);

                    if ( (synpred3_InternalJKind()) ) {
                        alt21=1;
                    }


                }


                switch (alt21) {
            	case 1 :
            	    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1441:2: ( ( ( () ( ( ( 'or' | 'xor' ) ) ) ) )=> ( () ( ( (lv_op_2_1= 'or' | lv_op_2_2= 'xor' ) ) ) ) ) ( (lv_right_3_0= ruleAndExpr ) )
            	    {
            	    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1441:2: ( ( ( () ( ( ( 'or' | 'xor' ) ) ) ) )=> ( () ( ( (lv_op_2_1= 'or' | lv_op_2_2= 'xor' ) ) ) ) )
            	    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1441:3: ( ( () ( ( ( 'or' | 'xor' ) ) ) ) )=> ( () ( ( (lv_op_2_1= 'or' | lv_op_2_2= 'xor' ) ) ) )
            	    {
            	    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1454:6: ( () ( ( (lv_op_2_1= 'or' | lv_op_2_2= 'xor' ) ) ) )
            	    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1454:7: () ( ( (lv_op_2_1= 'or' | lv_op_2_2= 'xor' ) ) )
            	    {
            	    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1454:7: ()
            	    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1455:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getOrExprAccess().getBinaryExprLeftAction_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1460:2: ( ( (lv_op_2_1= 'or' | lv_op_2_2= 'xor' ) ) )
            	    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1461:1: ( (lv_op_2_1= 'or' | lv_op_2_2= 'xor' ) )
            	    {
            	    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1461:1: ( (lv_op_2_1= 'or' | lv_op_2_2= 'xor' ) )
            	    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1462:1: (lv_op_2_1= 'or' | lv_op_2_2= 'xor' )
            	    {
            	    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1462:1: (lv_op_2_1= 'or' | lv_op_2_2= 'xor' )
            	    int alt20=2;
            	    int LA20_0 = input.LA(1);

            	    if ( (LA20_0==39) ) {
            	        alt20=1;
            	    }
            	    else if ( (LA20_0==40) ) {
            	        alt20=2;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 20, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt20) {
            	        case 1 :
            	            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1463:3: lv_op_2_1= 'or'
            	            {
            	            lv_op_2_1=(Token)match(input,39,FOLLOW_39_in_ruleOrExpr3162); if (state.failed) return current;
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
            	            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1475:8: lv_op_2_2= 'xor'
            	            {
            	            lv_op_2_2=(Token)match(input,40,FOLLOW_40_in_ruleOrExpr3191); if (state.failed) return current;
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

            	    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1490:4: ( (lv_right_3_0= ruleAndExpr ) )
            	    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1491:1: (lv_right_3_0= ruleAndExpr )
            	    {
            	    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1491:1: (lv_right_3_0= ruleAndExpr )
            	    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1492:3: lv_right_3_0= ruleAndExpr
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getOrExprAccess().getRightAndExprParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleAndExpr_in_ruleOrExpr3230);
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
            	    break loop21;
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
    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1516:1: entryRuleAndExpr returns [EObject current=null] : iv_ruleAndExpr= ruleAndExpr EOF ;
    public final EObject entryRuleAndExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAndExpr = null;


        try {
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1517:2: (iv_ruleAndExpr= ruleAndExpr EOF )
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1518:2: iv_ruleAndExpr= ruleAndExpr EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAndExprRule()); 
            }
            pushFollow(FOLLOW_ruleAndExpr_in_entryRuleAndExpr3268);
            iv_ruleAndExpr=ruleAndExpr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAndExpr; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAndExpr3278); if (state.failed) return current;

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
    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1525:1: ruleAndExpr returns [EObject current=null] : (this_RelationalExpr_0= ruleRelationalExpr ( ( ( ( () ( ( 'and' ) ) ) )=> ( () ( (lv_op_2_0= 'and' ) ) ) ) ( (lv_right_3_0= ruleRelationalExpr ) ) )* ) ;
    public final EObject ruleAndExpr() throws RecognitionException {
        EObject current = null;

        Token lv_op_2_0=null;
        EObject this_RelationalExpr_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1528:28: ( (this_RelationalExpr_0= ruleRelationalExpr ( ( ( ( () ( ( 'and' ) ) ) )=> ( () ( (lv_op_2_0= 'and' ) ) ) ) ( (lv_right_3_0= ruleRelationalExpr ) ) )* ) )
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1529:1: (this_RelationalExpr_0= ruleRelationalExpr ( ( ( ( () ( ( 'and' ) ) ) )=> ( () ( (lv_op_2_0= 'and' ) ) ) ) ( (lv_right_3_0= ruleRelationalExpr ) ) )* )
            {
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1529:1: (this_RelationalExpr_0= ruleRelationalExpr ( ( ( ( () ( ( 'and' ) ) ) )=> ( () ( (lv_op_2_0= 'and' ) ) ) ) ( (lv_right_3_0= ruleRelationalExpr ) ) )* )
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1530:5: this_RelationalExpr_0= ruleRelationalExpr ( ( ( ( () ( ( 'and' ) ) ) )=> ( () ( (lv_op_2_0= 'and' ) ) ) ) ( (lv_right_3_0= ruleRelationalExpr ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getAndExprAccess().getRelationalExprParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleRelationalExpr_in_ruleAndExpr3325);
            this_RelationalExpr_0=ruleRelationalExpr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_RelationalExpr_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1538:1: ( ( ( ( () ( ( 'and' ) ) ) )=> ( () ( (lv_op_2_0= 'and' ) ) ) ) ( (lv_right_3_0= ruleRelationalExpr ) ) )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==41) ) {
                    int LA22_2 = input.LA(2);

                    if ( (synpred4_InternalJKind()) ) {
                        alt22=1;
                    }


                }


                switch (alt22) {
            	case 1 :
            	    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1538:2: ( ( ( () ( ( 'and' ) ) ) )=> ( () ( (lv_op_2_0= 'and' ) ) ) ) ( (lv_right_3_0= ruleRelationalExpr ) )
            	    {
            	    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1538:2: ( ( ( () ( ( 'and' ) ) ) )=> ( () ( (lv_op_2_0= 'and' ) ) ) )
            	    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1538:3: ( ( () ( ( 'and' ) ) ) )=> ( () ( (lv_op_2_0= 'and' ) ) )
            	    {
            	    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1545:6: ( () ( (lv_op_2_0= 'and' ) ) )
            	    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1545:7: () ( (lv_op_2_0= 'and' ) )
            	    {
            	    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1545:7: ()
            	    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1546:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getAndExprAccess().getBinaryExprLeftAction_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1551:2: ( (lv_op_2_0= 'and' ) )
            	    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1552:1: (lv_op_2_0= 'and' )
            	    {
            	    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1552:1: (lv_op_2_0= 'and' )
            	    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1553:3: lv_op_2_0= 'and'
            	    {
            	    lv_op_2_0=(Token)match(input,41,FOLLOW_41_in_ruleAndExpr3376); if (state.failed) return current;
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

            	    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1566:4: ( (lv_right_3_0= ruleRelationalExpr ) )
            	    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1567:1: (lv_right_3_0= ruleRelationalExpr )
            	    {
            	    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1567:1: (lv_right_3_0= ruleRelationalExpr )
            	    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1568:3: lv_right_3_0= ruleRelationalExpr
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getAndExprAccess().getRightRelationalExprParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleRelationalExpr_in_ruleAndExpr3412);
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
    // $ANTLR end "ruleAndExpr"


    // $ANTLR start "entryRuleRelationalExpr"
    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1592:1: entryRuleRelationalExpr returns [EObject current=null] : iv_ruleRelationalExpr= ruleRelationalExpr EOF ;
    public final EObject entryRuleRelationalExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRelationalExpr = null;


        try {
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1593:2: (iv_ruleRelationalExpr= ruleRelationalExpr EOF )
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1594:2: iv_ruleRelationalExpr= ruleRelationalExpr EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getRelationalExprRule()); 
            }
            pushFollow(FOLLOW_ruleRelationalExpr_in_entryRuleRelationalExpr3450);
            iv_ruleRelationalExpr=ruleRelationalExpr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleRelationalExpr; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleRelationalExpr3460); if (state.failed) return current;

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
    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1601:1: ruleRelationalExpr returns [EObject current=null] : (this_PlusExpr_0= rulePlusExpr ( ( ( ( () ( ( ( '<' | '<=' | '>' | '>=' | '=' | '<>' ) ) ) ) )=> ( () ( ( (lv_op_2_1= '<' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '>=' | lv_op_2_5= '=' | lv_op_2_6= '<>' ) ) ) ) ) ( (lv_right_3_0= rulePlusExpr ) ) )? ) ;
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
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1604:28: ( (this_PlusExpr_0= rulePlusExpr ( ( ( ( () ( ( ( '<' | '<=' | '>' | '>=' | '=' | '<>' ) ) ) ) )=> ( () ( ( (lv_op_2_1= '<' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '>=' | lv_op_2_5= '=' | lv_op_2_6= '<>' ) ) ) ) ) ( (lv_right_3_0= rulePlusExpr ) ) )? ) )
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1605:1: (this_PlusExpr_0= rulePlusExpr ( ( ( ( () ( ( ( '<' | '<=' | '>' | '>=' | '=' | '<>' ) ) ) ) )=> ( () ( ( (lv_op_2_1= '<' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '>=' | lv_op_2_5= '=' | lv_op_2_6= '<>' ) ) ) ) ) ( (lv_right_3_0= rulePlusExpr ) ) )? )
            {
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1605:1: (this_PlusExpr_0= rulePlusExpr ( ( ( ( () ( ( ( '<' | '<=' | '>' | '>=' | '=' | '<>' ) ) ) ) )=> ( () ( ( (lv_op_2_1= '<' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '>=' | lv_op_2_5= '=' | lv_op_2_6= '<>' ) ) ) ) ) ( (lv_right_3_0= rulePlusExpr ) ) )? )
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1606:5: this_PlusExpr_0= rulePlusExpr ( ( ( ( () ( ( ( '<' | '<=' | '>' | '>=' | '=' | '<>' ) ) ) ) )=> ( () ( ( (lv_op_2_1= '<' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '>=' | lv_op_2_5= '=' | lv_op_2_6= '<>' ) ) ) ) ) ( (lv_right_3_0= rulePlusExpr ) ) )?
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getRelationalExprAccess().getPlusExprParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_rulePlusExpr_in_ruleRelationalExpr3507);
            this_PlusExpr_0=rulePlusExpr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_PlusExpr_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1614:1: ( ( ( ( () ( ( ( '<' | '<=' | '>' | '>=' | '=' | '<>' ) ) ) ) )=> ( () ( ( (lv_op_2_1= '<' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '>=' | lv_op_2_5= '=' | lv_op_2_6= '<>' ) ) ) ) ) ( (lv_right_3_0= rulePlusExpr ) ) )?
            int alt24=2;
            switch ( input.LA(1) ) {
                case 42:
                    {
                    int LA24_1 = input.LA(2);

                    if ( (synpred5_InternalJKind()) ) {
                        alt24=1;
                    }
                    }
                    break;
                case 43:
                    {
                    int LA24_2 = input.LA(2);

                    if ( (synpred5_InternalJKind()) ) {
                        alt24=1;
                    }
                    }
                    break;
                case 44:
                    {
                    int LA24_3 = input.LA(2);

                    if ( (synpred5_InternalJKind()) ) {
                        alt24=1;
                    }
                    }
                    break;
                case 45:
                    {
                    int LA24_4 = input.LA(2);

                    if ( (synpred5_InternalJKind()) ) {
                        alt24=1;
                    }
                    }
                    break;
                case 11:
                    {
                    int LA24_5 = input.LA(2);

                    if ( (synpred5_InternalJKind()) ) {
                        alt24=1;
                    }
                    }
                    break;
                case 46:
                    {
                    int LA24_6 = input.LA(2);

                    if ( (synpred5_InternalJKind()) ) {
                        alt24=1;
                    }
                    }
                    break;
            }

            switch (alt24) {
                case 1 :
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1614:2: ( ( ( () ( ( ( '<' | '<=' | '>' | '>=' | '=' | '<>' ) ) ) ) )=> ( () ( ( (lv_op_2_1= '<' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '>=' | lv_op_2_5= '=' | lv_op_2_6= '<>' ) ) ) ) ) ( (lv_right_3_0= rulePlusExpr ) )
                    {
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1614:2: ( ( ( () ( ( ( '<' | '<=' | '>' | '>=' | '=' | '<>' ) ) ) ) )=> ( () ( ( (lv_op_2_1= '<' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '>=' | lv_op_2_5= '=' | lv_op_2_6= '<>' ) ) ) ) )
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1614:3: ( ( () ( ( ( '<' | '<=' | '>' | '>=' | '=' | '<>' ) ) ) ) )=> ( () ( ( (lv_op_2_1= '<' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '>=' | lv_op_2_5= '=' | lv_op_2_6= '<>' ) ) ) )
                    {
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1639:6: ( () ( ( (lv_op_2_1= '<' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '>=' | lv_op_2_5= '=' | lv_op_2_6= '<>' ) ) ) )
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1639:7: () ( ( (lv_op_2_1= '<' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '>=' | lv_op_2_5= '=' | lv_op_2_6= '<>' ) ) )
                    {
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1639:7: ()
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1640:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElementAndSet(
                                  grammarAccess.getRelationalExprAccess().getBinaryExprLeftAction_1_0_0_0(),
                                  current);
                          
                    }

                    }

                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1645:2: ( ( (lv_op_2_1= '<' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '>=' | lv_op_2_5= '=' | lv_op_2_6= '<>' ) ) )
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1646:1: ( (lv_op_2_1= '<' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '>=' | lv_op_2_5= '=' | lv_op_2_6= '<>' ) )
                    {
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1646:1: ( (lv_op_2_1= '<' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '>=' | lv_op_2_5= '=' | lv_op_2_6= '<>' ) )
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1647:1: (lv_op_2_1= '<' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '>=' | lv_op_2_5= '=' | lv_op_2_6= '<>' )
                    {
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1647:1: (lv_op_2_1= '<' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '>=' | lv_op_2_5= '=' | lv_op_2_6= '<>' )
                    int alt23=6;
                    switch ( input.LA(1) ) {
                    case 42:
                        {
                        alt23=1;
                        }
                        break;
                    case 43:
                        {
                        alt23=2;
                        }
                        break;
                    case 44:
                        {
                        alt23=3;
                        }
                        break;
                    case 45:
                        {
                        alt23=4;
                        }
                        break;
                    case 11:
                        {
                        alt23=5;
                        }
                        break;
                    case 46:
                        {
                        alt23=6;
                        }
                        break;
                    default:
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 23, 0, input);

                        throw nvae;
                    }

                    switch (alt23) {
                        case 1 :
                            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1648:3: lv_op_2_1= '<'
                            {
                            lv_op_2_1=(Token)match(input,42,FOLLOW_42_in_ruleRelationalExpr3635); if (state.failed) return current;
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
                            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1660:8: lv_op_2_2= '<='
                            {
                            lv_op_2_2=(Token)match(input,43,FOLLOW_43_in_ruleRelationalExpr3664); if (state.failed) return current;
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
                            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1672:8: lv_op_2_3= '>'
                            {
                            lv_op_2_3=(Token)match(input,44,FOLLOW_44_in_ruleRelationalExpr3693); if (state.failed) return current;
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
                            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1684:8: lv_op_2_4= '>='
                            {
                            lv_op_2_4=(Token)match(input,45,FOLLOW_45_in_ruleRelationalExpr3722); if (state.failed) return current;
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
                            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1696:8: lv_op_2_5= '='
                            {
                            lv_op_2_5=(Token)match(input,11,FOLLOW_11_in_ruleRelationalExpr3751); if (state.failed) return current;
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
                            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1708:8: lv_op_2_6= '<>'
                            {
                            lv_op_2_6=(Token)match(input,46,FOLLOW_46_in_ruleRelationalExpr3780); if (state.failed) return current;
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

                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1723:4: ( (lv_right_3_0= rulePlusExpr ) )
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1724:1: (lv_right_3_0= rulePlusExpr )
                    {
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1724:1: (lv_right_3_0= rulePlusExpr )
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1725:3: lv_right_3_0= rulePlusExpr
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getRelationalExprAccess().getRightPlusExprParserRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_rulePlusExpr_in_ruleRelationalExpr3819);
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
    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1749:1: entryRulePlusExpr returns [EObject current=null] : iv_rulePlusExpr= rulePlusExpr EOF ;
    public final EObject entryRulePlusExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePlusExpr = null;


        try {
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1750:2: (iv_rulePlusExpr= rulePlusExpr EOF )
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1751:2: iv_rulePlusExpr= rulePlusExpr EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPlusExprRule()); 
            }
            pushFollow(FOLLOW_rulePlusExpr_in_entryRulePlusExpr3857);
            iv_rulePlusExpr=rulePlusExpr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePlusExpr; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulePlusExpr3867); if (state.failed) return current;

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
    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1758:1: rulePlusExpr returns [EObject current=null] : (this_TimesExpr_0= ruleTimesExpr ( ( ( ( () ( ( ( '+' | '-' ) ) ) ) )=> ( () ( ( (lv_op_2_1= '+' | lv_op_2_2= '-' ) ) ) ) ) ( (lv_right_3_0= ruleTimesExpr ) ) )* ) ;
    public final EObject rulePlusExpr() throws RecognitionException {
        EObject current = null;

        Token lv_op_2_1=null;
        Token lv_op_2_2=null;
        EObject this_TimesExpr_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1761:28: ( (this_TimesExpr_0= ruleTimesExpr ( ( ( ( () ( ( ( '+' | '-' ) ) ) ) )=> ( () ( ( (lv_op_2_1= '+' | lv_op_2_2= '-' ) ) ) ) ) ( (lv_right_3_0= ruleTimesExpr ) ) )* ) )
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1762:1: (this_TimesExpr_0= ruleTimesExpr ( ( ( ( () ( ( ( '+' | '-' ) ) ) ) )=> ( () ( ( (lv_op_2_1= '+' | lv_op_2_2= '-' ) ) ) ) ) ( (lv_right_3_0= ruleTimesExpr ) ) )* )
            {
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1762:1: (this_TimesExpr_0= ruleTimesExpr ( ( ( ( () ( ( ( '+' | '-' ) ) ) ) )=> ( () ( ( (lv_op_2_1= '+' | lv_op_2_2= '-' ) ) ) ) ) ( (lv_right_3_0= ruleTimesExpr ) ) )* )
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1763:5: this_TimesExpr_0= ruleTimesExpr ( ( ( ( () ( ( ( '+' | '-' ) ) ) ) )=> ( () ( ( (lv_op_2_1= '+' | lv_op_2_2= '-' ) ) ) ) ) ( (lv_right_3_0= ruleTimesExpr ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getPlusExprAccess().getTimesExprParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleTimesExpr_in_rulePlusExpr3914);
            this_TimesExpr_0=ruleTimesExpr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_TimesExpr_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1771:1: ( ( ( ( () ( ( ( '+' | '-' ) ) ) ) )=> ( () ( ( (lv_op_2_1= '+' | lv_op_2_2= '-' ) ) ) ) ) ( (lv_right_3_0= ruleTimesExpr ) ) )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==47) ) {
                    int LA26_2 = input.LA(2);

                    if ( (synpred6_InternalJKind()) ) {
                        alt26=1;
                    }


                }
                else if ( (LA26_0==25) ) {
                    int LA26_3 = input.LA(2);

                    if ( (synpred6_InternalJKind()) ) {
                        alt26=1;
                    }


                }


                switch (alt26) {
            	case 1 :
            	    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1771:2: ( ( ( () ( ( ( '+' | '-' ) ) ) ) )=> ( () ( ( (lv_op_2_1= '+' | lv_op_2_2= '-' ) ) ) ) ) ( (lv_right_3_0= ruleTimesExpr ) )
            	    {
            	    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1771:2: ( ( ( () ( ( ( '+' | '-' ) ) ) ) )=> ( () ( ( (lv_op_2_1= '+' | lv_op_2_2= '-' ) ) ) ) )
            	    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1771:3: ( ( () ( ( ( '+' | '-' ) ) ) ) )=> ( () ( ( (lv_op_2_1= '+' | lv_op_2_2= '-' ) ) ) )
            	    {
            	    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1784:6: ( () ( ( (lv_op_2_1= '+' | lv_op_2_2= '-' ) ) ) )
            	    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1784:7: () ( ( (lv_op_2_1= '+' | lv_op_2_2= '-' ) ) )
            	    {
            	    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1784:7: ()
            	    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1785:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getPlusExprAccess().getBinaryExprLeftAction_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1790:2: ( ( (lv_op_2_1= '+' | lv_op_2_2= '-' ) ) )
            	    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1791:1: ( (lv_op_2_1= '+' | lv_op_2_2= '-' ) )
            	    {
            	    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1791:1: ( (lv_op_2_1= '+' | lv_op_2_2= '-' ) )
            	    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1792:1: (lv_op_2_1= '+' | lv_op_2_2= '-' )
            	    {
            	    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1792:1: (lv_op_2_1= '+' | lv_op_2_2= '-' )
            	    int alt25=2;
            	    int LA25_0 = input.LA(1);

            	    if ( (LA25_0==47) ) {
            	        alt25=1;
            	    }
            	    else if ( (LA25_0==25) ) {
            	        alt25=2;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 25, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt25) {
            	        case 1 :
            	            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1793:3: lv_op_2_1= '+'
            	            {
            	            lv_op_2_1=(Token)match(input,47,FOLLOW_47_in_rulePlusExpr3986); if (state.failed) return current;
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
            	            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1805:8: lv_op_2_2= '-'
            	            {
            	            lv_op_2_2=(Token)match(input,25,FOLLOW_25_in_rulePlusExpr4015); if (state.failed) return current;
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

            	    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1820:4: ( (lv_right_3_0= ruleTimesExpr ) )
            	    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1821:1: (lv_right_3_0= ruleTimesExpr )
            	    {
            	    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1821:1: (lv_right_3_0= ruleTimesExpr )
            	    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1822:3: lv_right_3_0= ruleTimesExpr
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getPlusExprAccess().getRightTimesExprParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleTimesExpr_in_rulePlusExpr4054);
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
            	    break loop26;
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
    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1846:1: entryRuleTimesExpr returns [EObject current=null] : iv_ruleTimesExpr= ruleTimesExpr EOF ;
    public final EObject entryRuleTimesExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTimesExpr = null;


        try {
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1847:2: (iv_ruleTimesExpr= ruleTimesExpr EOF )
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1848:2: iv_ruleTimesExpr= ruleTimesExpr EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTimesExprRule()); 
            }
            pushFollow(FOLLOW_ruleTimesExpr_in_entryRuleTimesExpr4092);
            iv_ruleTimesExpr=ruleTimesExpr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTimesExpr; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleTimesExpr4102); if (state.failed) return current;

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
    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1855:1: ruleTimesExpr returns [EObject current=null] : (this_PrefixExpr_0= rulePrefixExpr ( ( ( ( () ( ( ( '*' | '/' | 'div' ) ) ) ) )=> ( () ( ( (lv_op_2_1= '*' | lv_op_2_2= '/' | lv_op_2_3= 'div' ) ) ) ) ) ( (lv_right_3_0= rulePrefixExpr ) ) )* ) ;
    public final EObject ruleTimesExpr() throws RecognitionException {
        EObject current = null;

        Token lv_op_2_1=null;
        Token lv_op_2_2=null;
        Token lv_op_2_3=null;
        EObject this_PrefixExpr_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1858:28: ( (this_PrefixExpr_0= rulePrefixExpr ( ( ( ( () ( ( ( '*' | '/' | 'div' ) ) ) ) )=> ( () ( ( (lv_op_2_1= '*' | lv_op_2_2= '/' | lv_op_2_3= 'div' ) ) ) ) ) ( (lv_right_3_0= rulePrefixExpr ) ) )* ) )
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1859:1: (this_PrefixExpr_0= rulePrefixExpr ( ( ( ( () ( ( ( '*' | '/' | 'div' ) ) ) ) )=> ( () ( ( (lv_op_2_1= '*' | lv_op_2_2= '/' | lv_op_2_3= 'div' ) ) ) ) ) ( (lv_right_3_0= rulePrefixExpr ) ) )* )
            {
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1859:1: (this_PrefixExpr_0= rulePrefixExpr ( ( ( ( () ( ( ( '*' | '/' | 'div' ) ) ) ) )=> ( () ( ( (lv_op_2_1= '*' | lv_op_2_2= '/' | lv_op_2_3= 'div' ) ) ) ) ) ( (lv_right_3_0= rulePrefixExpr ) ) )* )
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1860:5: this_PrefixExpr_0= rulePrefixExpr ( ( ( ( () ( ( ( '*' | '/' | 'div' ) ) ) ) )=> ( () ( ( (lv_op_2_1= '*' | lv_op_2_2= '/' | lv_op_2_3= 'div' ) ) ) ) ) ( (lv_right_3_0= rulePrefixExpr ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getTimesExprAccess().getPrefixExprParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_rulePrefixExpr_in_ruleTimesExpr4149);
            this_PrefixExpr_0=rulePrefixExpr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_PrefixExpr_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1868:1: ( ( ( ( () ( ( ( '*' | '/' | 'div' ) ) ) ) )=> ( () ( ( (lv_op_2_1= '*' | lv_op_2_2= '/' | lv_op_2_3= 'div' ) ) ) ) ) ( (lv_right_3_0= rulePrefixExpr ) ) )*
            loop28:
            do {
                int alt28=2;
                switch ( input.LA(1) ) {
                case 48:
                    {
                    int LA28_2 = input.LA(2);

                    if ( (synpred7_InternalJKind()) ) {
                        alt28=1;
                    }


                    }
                    break;
                case 49:
                    {
                    int LA28_3 = input.LA(2);

                    if ( (synpred7_InternalJKind()) ) {
                        alt28=1;
                    }


                    }
                    break;
                case 50:
                    {
                    int LA28_4 = input.LA(2);

                    if ( (synpred7_InternalJKind()) ) {
                        alt28=1;
                    }


                    }
                    break;

                }

                switch (alt28) {
            	case 1 :
            	    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1868:2: ( ( ( () ( ( ( '*' | '/' | 'div' ) ) ) ) )=> ( () ( ( (lv_op_2_1= '*' | lv_op_2_2= '/' | lv_op_2_3= 'div' ) ) ) ) ) ( (lv_right_3_0= rulePrefixExpr ) )
            	    {
            	    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1868:2: ( ( ( () ( ( ( '*' | '/' | 'div' ) ) ) ) )=> ( () ( ( (lv_op_2_1= '*' | lv_op_2_2= '/' | lv_op_2_3= 'div' ) ) ) ) )
            	    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1868:3: ( ( () ( ( ( '*' | '/' | 'div' ) ) ) ) )=> ( () ( ( (lv_op_2_1= '*' | lv_op_2_2= '/' | lv_op_2_3= 'div' ) ) ) )
            	    {
            	    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1884:6: ( () ( ( (lv_op_2_1= '*' | lv_op_2_2= '/' | lv_op_2_3= 'div' ) ) ) )
            	    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1884:7: () ( ( (lv_op_2_1= '*' | lv_op_2_2= '/' | lv_op_2_3= 'div' ) ) )
            	    {
            	    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1884:7: ()
            	    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1885:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getTimesExprAccess().getBinaryExprLeftAction_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1890:2: ( ( (lv_op_2_1= '*' | lv_op_2_2= '/' | lv_op_2_3= 'div' ) ) )
            	    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1891:1: ( (lv_op_2_1= '*' | lv_op_2_2= '/' | lv_op_2_3= 'div' ) )
            	    {
            	    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1891:1: ( (lv_op_2_1= '*' | lv_op_2_2= '/' | lv_op_2_3= 'div' ) )
            	    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1892:1: (lv_op_2_1= '*' | lv_op_2_2= '/' | lv_op_2_3= 'div' )
            	    {
            	    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1892:1: (lv_op_2_1= '*' | lv_op_2_2= '/' | lv_op_2_3= 'div' )
            	    int alt27=3;
            	    switch ( input.LA(1) ) {
            	    case 48:
            	        {
            	        alt27=1;
            	        }
            	        break;
            	    case 49:
            	        {
            	        alt27=2;
            	        }
            	        break;
            	    case 50:
            	        {
            	        alt27=3;
            	        }
            	        break;
            	    default:
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 27, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt27) {
            	        case 1 :
            	            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1893:3: lv_op_2_1= '*'
            	            {
            	            lv_op_2_1=(Token)match(input,48,FOLLOW_48_in_ruleTimesExpr4235); if (state.failed) return current;
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
            	            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1905:8: lv_op_2_2= '/'
            	            {
            	            lv_op_2_2=(Token)match(input,49,FOLLOW_49_in_ruleTimesExpr4264); if (state.failed) return current;
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
            	            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1917:8: lv_op_2_3= 'div'
            	            {
            	            lv_op_2_3=(Token)match(input,50,FOLLOW_50_in_ruleTimesExpr4293); if (state.failed) return current;
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

            	    }


            	    }


            	    }


            	    }


            	    }

            	    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1932:4: ( (lv_right_3_0= rulePrefixExpr ) )
            	    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1933:1: (lv_right_3_0= rulePrefixExpr )
            	    {
            	    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1933:1: (lv_right_3_0= rulePrefixExpr )
            	    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1934:3: lv_right_3_0= rulePrefixExpr
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getTimesExprAccess().getRightPrefixExprParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_rulePrefixExpr_in_ruleTimesExpr4332);
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
            	    break loop28;
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
    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1958:1: entryRulePrefixExpr returns [EObject current=null] : iv_rulePrefixExpr= rulePrefixExpr EOF ;
    public final EObject entryRulePrefixExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrefixExpr = null;


        try {
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1959:2: (iv_rulePrefixExpr= rulePrefixExpr EOF )
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1960:2: iv_rulePrefixExpr= rulePrefixExpr EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPrefixExprRule()); 
            }
            pushFollow(FOLLOW_rulePrefixExpr_in_entryRulePrefixExpr4370);
            iv_rulePrefixExpr=rulePrefixExpr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePrefixExpr; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulePrefixExpr4380); if (state.failed) return current;

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
    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1967:1: rulePrefixExpr returns [EObject current=null] : ( ( () ( ( (lv_op_1_1= '-' | lv_op_1_2= 'not' | lv_op_1_3= 'pre' ) ) ) ( (lv_expr_2_0= rulePrefixExpr ) ) ) | this_ProjectionExpr_3= ruleProjectionExpr ) ;
    public final EObject rulePrefixExpr() throws RecognitionException {
        EObject current = null;

        Token lv_op_1_1=null;
        Token lv_op_1_2=null;
        Token lv_op_1_3=null;
        EObject lv_expr_2_0 = null;

        EObject this_ProjectionExpr_3 = null;


         enterRule(); 
            
        try {
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1970:28: ( ( ( () ( ( (lv_op_1_1= '-' | lv_op_1_2= 'not' | lv_op_1_3= 'pre' ) ) ) ( (lv_expr_2_0= rulePrefixExpr ) ) ) | this_ProjectionExpr_3= ruleProjectionExpr ) )
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1971:1: ( ( () ( ( (lv_op_1_1= '-' | lv_op_1_2= 'not' | lv_op_1_3= 'pre' ) ) ) ( (lv_expr_2_0= rulePrefixExpr ) ) ) | this_ProjectionExpr_3= ruleProjectionExpr )
            {
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1971:1: ( ( () ( ( (lv_op_1_1= '-' | lv_op_1_2= 'not' | lv_op_1_3= 'pre' ) ) ) ( (lv_expr_2_0= rulePrefixExpr ) ) ) | this_ProjectionExpr_3= ruleProjectionExpr )
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==25||(LA30_0>=51 && LA30_0<=52)) ) {
                alt30=1;
            }
            else if ( ((LA30_0>=RULE_ID && LA30_0<=RULE_INT)||LA30_0==28||LA30_0==54||(LA30_0>=57 && LA30_0<=59)) ) {
                alt30=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 30, 0, input);

                throw nvae;
            }
            switch (alt30) {
                case 1 :
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1971:2: ( () ( ( (lv_op_1_1= '-' | lv_op_1_2= 'not' | lv_op_1_3= 'pre' ) ) ) ( (lv_expr_2_0= rulePrefixExpr ) ) )
                    {
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1971:2: ( () ( ( (lv_op_1_1= '-' | lv_op_1_2= 'not' | lv_op_1_3= 'pre' ) ) ) ( (lv_expr_2_0= rulePrefixExpr ) ) )
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1971:3: () ( ( (lv_op_1_1= '-' | lv_op_1_2= 'not' | lv_op_1_3= 'pre' ) ) ) ( (lv_expr_2_0= rulePrefixExpr ) )
                    {
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1971:3: ()
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1972:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getPrefixExprAccess().getUnaryExprAction_0_0(),
                                  current);
                          
                    }

                    }

                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1977:2: ( ( (lv_op_1_1= '-' | lv_op_1_2= 'not' | lv_op_1_3= 'pre' ) ) )
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1978:1: ( (lv_op_1_1= '-' | lv_op_1_2= 'not' | lv_op_1_3= 'pre' ) )
                    {
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1978:1: ( (lv_op_1_1= '-' | lv_op_1_2= 'not' | lv_op_1_3= 'pre' ) )
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1979:1: (lv_op_1_1= '-' | lv_op_1_2= 'not' | lv_op_1_3= 'pre' )
                    {
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1979:1: (lv_op_1_1= '-' | lv_op_1_2= 'not' | lv_op_1_3= 'pre' )
                    int alt29=3;
                    switch ( input.LA(1) ) {
                    case 25:
                        {
                        alt29=1;
                        }
                        break;
                    case 51:
                        {
                        alt29=2;
                        }
                        break;
                    case 52:
                        {
                        alt29=3;
                        }
                        break;
                    default:
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 29, 0, input);

                        throw nvae;
                    }

                    switch (alt29) {
                        case 1 :
                            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1980:3: lv_op_1_1= '-'
                            {
                            lv_op_1_1=(Token)match(input,25,FOLLOW_25_in_rulePrefixExpr4435); if (state.failed) return current;
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
                            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1992:8: lv_op_1_2= 'not'
                            {
                            lv_op_1_2=(Token)match(input,51,FOLLOW_51_in_rulePrefixExpr4464); if (state.failed) return current;
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
                            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2004:8: lv_op_1_3= 'pre'
                            {
                            lv_op_1_3=(Token)match(input,52,FOLLOW_52_in_rulePrefixExpr4493); if (state.failed) return current;
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

                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2019:2: ( (lv_expr_2_0= rulePrefixExpr ) )
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2020:1: (lv_expr_2_0= rulePrefixExpr )
                    {
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2020:1: (lv_expr_2_0= rulePrefixExpr )
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2021:3: lv_expr_2_0= rulePrefixExpr
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getPrefixExprAccess().getExprPrefixExprParserRuleCall_0_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_rulePrefixExpr_in_rulePrefixExpr4530);
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
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2039:5: this_ProjectionExpr_3= ruleProjectionExpr
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getPrefixExprAccess().getProjectionExprParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleProjectionExpr_in_rulePrefixExpr4559);
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
    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2055:1: entryRuleProjectionExpr returns [EObject current=null] : iv_ruleProjectionExpr= ruleProjectionExpr EOF ;
    public final EObject entryRuleProjectionExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProjectionExpr = null;


        try {
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2056:2: (iv_ruleProjectionExpr= ruleProjectionExpr EOF )
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2057:2: iv_ruleProjectionExpr= ruleProjectionExpr EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getProjectionExprRule()); 
            }
            pushFollow(FOLLOW_ruleProjectionExpr_in_entryRuleProjectionExpr4594);
            iv_ruleProjectionExpr=ruleProjectionExpr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleProjectionExpr; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleProjectionExpr4604); if (state.failed) return current;

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
    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2064:1: ruleProjectionExpr returns [EObject current=null] : (this_AtomicExpr_0= ruleAtomicExpr ( ( ( ( () '.' ) )=> ( () otherlv_2= '.' ) ) ( (otherlv_3= RULE_ID ) ) )* ) ;
    public final EObject ruleProjectionExpr() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_3=null;
        EObject this_AtomicExpr_0 = null;


         enterRule(); 
            
        try {
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2067:28: ( (this_AtomicExpr_0= ruleAtomicExpr ( ( ( ( () '.' ) )=> ( () otherlv_2= '.' ) ) ( (otherlv_3= RULE_ID ) ) )* ) )
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2068:1: (this_AtomicExpr_0= ruleAtomicExpr ( ( ( ( () '.' ) )=> ( () otherlv_2= '.' ) ) ( (otherlv_3= RULE_ID ) ) )* )
            {
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2068:1: (this_AtomicExpr_0= ruleAtomicExpr ( ( ( ( () '.' ) )=> ( () otherlv_2= '.' ) ) ( (otherlv_3= RULE_ID ) ) )* )
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2069:5: this_AtomicExpr_0= ruleAtomicExpr ( ( ( ( () '.' ) )=> ( () otherlv_2= '.' ) ) ( (otherlv_3= RULE_ID ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getProjectionExprAccess().getAtomicExprParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleAtomicExpr_in_ruleProjectionExpr4651);
            this_AtomicExpr_0=ruleAtomicExpr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_AtomicExpr_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2077:1: ( ( ( ( () '.' ) )=> ( () otherlv_2= '.' ) ) ( (otherlv_3= RULE_ID ) ) )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( (LA31_0==53) ) {
                    int LA31_2 = input.LA(2);

                    if ( (synpred8_InternalJKind()) ) {
                        alt31=1;
                    }


                }


                switch (alt31) {
            	case 1 :
            	    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2077:2: ( ( ( () '.' ) )=> ( () otherlv_2= '.' ) ) ( (otherlv_3= RULE_ID ) )
            	    {
            	    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2077:2: ( ( ( () '.' ) )=> ( () otherlv_2= '.' ) )
            	    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2077:3: ( ( () '.' ) )=> ( () otherlv_2= '.' )
            	    {
            	    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2079:5: ( () otherlv_2= '.' )
            	    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2079:6: () otherlv_2= '.'
            	    {
            	    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2079:6: ()
            	    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2080:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getProjectionExprAccess().getProjectionExprExprAction_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    otherlv_2=(Token)match(input,53,FOLLOW_53_in_ruleProjectionExpr4686); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getProjectionExprAccess().getFullStopKeyword_1_0_0_1());
            	          
            	    }

            	    }


            	    }

            	    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2089:3: ( (otherlv_3= RULE_ID ) )
            	    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2090:1: (otherlv_3= RULE_ID )
            	    {
            	    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2090:1: (otherlv_3= RULE_ID )
            	    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2091:3: otherlv_3= RULE_ID
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getProjectionExprRule());
            	      	        }
            	              
            	    }
            	    otherlv_3=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleProjectionExpr4708); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		newLeafNode(otherlv_3, grammarAccess.getProjectionExprAccess().getFieldFieldCrossReference_1_1_0()); 
            	      	
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop31;
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
    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2110:1: entryRuleAtomicExpr returns [EObject current=null] : iv_ruleAtomicExpr= ruleAtomicExpr EOF ;
    public final EObject entryRuleAtomicExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAtomicExpr = null;


        try {
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2111:2: (iv_ruleAtomicExpr= ruleAtomicExpr EOF )
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2112:2: iv_ruleAtomicExpr= ruleAtomicExpr EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAtomicExprRule()); 
            }
            pushFollow(FOLLOW_ruleAtomicExpr_in_entryRuleAtomicExpr4746);
            iv_ruleAtomicExpr=ruleAtomicExpr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAtomicExpr; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAtomicExpr4756); if (state.failed) return current;

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
    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2119:1: ruleAtomicExpr returns [EObject current=null] : ( ( () ( (otherlv_1= RULE_ID ) ) ) | ( () ( (lv_val_3_0= RULE_INT ) ) ) | ( () ( (lv_val_5_0= ruleREAL ) ) ) | ( () ( (lv_val_7_0= ruleBOOL ) ) ) | ( () otherlv_9= 'if' ( (lv_cond_10_0= ruleExpr ) ) otherlv_11= 'then' ( (lv_then_12_0= ruleExpr ) ) otherlv_13= 'else' ( (lv_else_14_0= ruleExpr ) ) ) | this_NodeCallExpr_15= ruleNodeCallExpr | ( () otherlv_17= 'condact' otherlv_18= '(' ( (lv_clock_19_0= ruleExpr ) ) otherlv_20= ',' ( (lv_call_21_0= ruleNodeCallExpr ) ) (otherlv_22= ',' ( (lv_args_23_0= ruleExpr ) ) )* otherlv_24= ')' ) | ( () ( (otherlv_26= RULE_ID ) ) otherlv_27= '{' ( (otherlv_28= RULE_ID ) ) otherlv_29= '=' ( (lv_exprs_30_0= ruleExpr ) ) (otherlv_31= ';' ( (otherlv_32= RULE_ID ) ) otherlv_33= '=' ( (lv_exprs_34_0= ruleExpr ) ) )* otherlv_35= '}' ) | (otherlv_36= '(' this_Expr_37= ruleExpr otherlv_38= ')' ) ) ;
    public final EObject ruleAtomicExpr() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_val_3_0=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_17=null;
        Token otherlv_18=null;
        Token otherlv_20=null;
        Token otherlv_22=null;
        Token otherlv_24=null;
        Token otherlv_26=null;
        Token otherlv_27=null;
        Token otherlv_28=null;
        Token otherlv_29=null;
        Token otherlv_31=null;
        Token otherlv_32=null;
        Token otherlv_33=null;
        Token otherlv_35=null;
        Token otherlv_36=null;
        Token otherlv_38=null;
        AntlrDatatypeRuleToken lv_val_5_0 = null;

        AntlrDatatypeRuleToken lv_val_7_0 = null;

        EObject lv_cond_10_0 = null;

        EObject lv_then_12_0 = null;

        EObject lv_else_14_0 = null;

        EObject this_NodeCallExpr_15 = null;

        EObject lv_clock_19_0 = null;

        EObject lv_call_21_0 = null;

        EObject lv_args_23_0 = null;

        EObject lv_exprs_30_0 = null;

        EObject lv_exprs_34_0 = null;

        EObject this_Expr_37 = null;


         enterRule(); 
            
        try {
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2122:28: ( ( ( () ( (otherlv_1= RULE_ID ) ) ) | ( () ( (lv_val_3_0= RULE_INT ) ) ) | ( () ( (lv_val_5_0= ruleREAL ) ) ) | ( () ( (lv_val_7_0= ruleBOOL ) ) ) | ( () otherlv_9= 'if' ( (lv_cond_10_0= ruleExpr ) ) otherlv_11= 'then' ( (lv_then_12_0= ruleExpr ) ) otherlv_13= 'else' ( (lv_else_14_0= ruleExpr ) ) ) | this_NodeCallExpr_15= ruleNodeCallExpr | ( () otherlv_17= 'condact' otherlv_18= '(' ( (lv_clock_19_0= ruleExpr ) ) otherlv_20= ',' ( (lv_call_21_0= ruleNodeCallExpr ) ) (otherlv_22= ',' ( (lv_args_23_0= ruleExpr ) ) )* otherlv_24= ')' ) | ( () ( (otherlv_26= RULE_ID ) ) otherlv_27= '{' ( (otherlv_28= RULE_ID ) ) otherlv_29= '=' ( (lv_exprs_30_0= ruleExpr ) ) (otherlv_31= ';' ( (otherlv_32= RULE_ID ) ) otherlv_33= '=' ( (lv_exprs_34_0= ruleExpr ) ) )* otherlv_35= '}' ) | (otherlv_36= '(' this_Expr_37= ruleExpr otherlv_38= ')' ) ) )
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2123:1: ( ( () ( (otherlv_1= RULE_ID ) ) ) | ( () ( (lv_val_3_0= RULE_INT ) ) ) | ( () ( (lv_val_5_0= ruleREAL ) ) ) | ( () ( (lv_val_7_0= ruleBOOL ) ) ) | ( () otherlv_9= 'if' ( (lv_cond_10_0= ruleExpr ) ) otherlv_11= 'then' ( (lv_then_12_0= ruleExpr ) ) otherlv_13= 'else' ( (lv_else_14_0= ruleExpr ) ) ) | this_NodeCallExpr_15= ruleNodeCallExpr | ( () otherlv_17= 'condact' otherlv_18= '(' ( (lv_clock_19_0= ruleExpr ) ) otherlv_20= ',' ( (lv_call_21_0= ruleNodeCallExpr ) ) (otherlv_22= ',' ( (lv_args_23_0= ruleExpr ) ) )* otherlv_24= ')' ) | ( () ( (otherlv_26= RULE_ID ) ) otherlv_27= '{' ( (otherlv_28= RULE_ID ) ) otherlv_29= '=' ( (lv_exprs_30_0= ruleExpr ) ) (otherlv_31= ';' ( (otherlv_32= RULE_ID ) ) otherlv_33= '=' ( (lv_exprs_34_0= ruleExpr ) ) )* otherlv_35= '}' ) | (otherlv_36= '(' this_Expr_37= ruleExpr otherlv_38= ')' ) )
            {
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2123:1: ( ( () ( (otherlv_1= RULE_ID ) ) ) | ( () ( (lv_val_3_0= RULE_INT ) ) ) | ( () ( (lv_val_5_0= ruleREAL ) ) ) | ( () ( (lv_val_7_0= ruleBOOL ) ) ) | ( () otherlv_9= 'if' ( (lv_cond_10_0= ruleExpr ) ) otherlv_11= 'then' ( (lv_then_12_0= ruleExpr ) ) otherlv_13= 'else' ( (lv_else_14_0= ruleExpr ) ) ) | this_NodeCallExpr_15= ruleNodeCallExpr | ( () otherlv_17= 'condact' otherlv_18= '(' ( (lv_clock_19_0= ruleExpr ) ) otherlv_20= ',' ( (lv_call_21_0= ruleNodeCallExpr ) ) (otherlv_22= ',' ( (lv_args_23_0= ruleExpr ) ) )* otherlv_24= ')' ) | ( () ( (otherlv_26= RULE_ID ) ) otherlv_27= '{' ( (otherlv_28= RULE_ID ) ) otherlv_29= '=' ( (lv_exprs_30_0= ruleExpr ) ) (otherlv_31= ';' ( (otherlv_32= RULE_ID ) ) otherlv_33= '=' ( (lv_exprs_34_0= ruleExpr ) ) )* otherlv_35= '}' ) | (otherlv_36= '(' this_Expr_37= ruleExpr otherlv_38= ')' ) )
            int alt34=9;
            alt34 = dfa34.predict(input);
            switch (alt34) {
                case 1 :
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2123:2: ( () ( (otherlv_1= RULE_ID ) ) )
                    {
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2123:2: ( () ( (otherlv_1= RULE_ID ) ) )
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2123:3: () ( (otherlv_1= RULE_ID ) )
                    {
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2123:3: ()
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2124:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getAtomicExprAccess().getIdExprAction_0_0(),
                                  current);
                          
                    }

                    }

                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2129:2: ( (otherlv_1= RULE_ID ) )
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2130:1: (otherlv_1= RULE_ID )
                    {
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2130:1: (otherlv_1= RULE_ID )
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2131:3: otherlv_1= RULE_ID
                    {
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getAtomicExprRule());
                      	        }
                              
                    }
                    otherlv_1=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAtomicExpr4811); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		newLeafNode(otherlv_1, grammarAccess.getAtomicExprAccess().getIdIdRefCrossReference_0_1_0()); 
                      	
                    }

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2143:6: ( () ( (lv_val_3_0= RULE_INT ) ) )
                    {
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2143:6: ( () ( (lv_val_3_0= RULE_INT ) ) )
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2143:7: () ( (lv_val_3_0= RULE_INT ) )
                    {
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2143:7: ()
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2144:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getAtomicExprAccess().getIntExprAction_1_0(),
                                  current);
                          
                    }

                    }

                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2149:2: ( (lv_val_3_0= RULE_INT ) )
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2150:1: (lv_val_3_0= RULE_INT )
                    {
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2150:1: (lv_val_3_0= RULE_INT )
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2151:3: lv_val_3_0= RULE_INT
                    {
                    lv_val_3_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleAtomicExpr4845); if (state.failed) return current;
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
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2168:6: ( () ( (lv_val_5_0= ruleREAL ) ) )
                    {
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2168:6: ( () ( (lv_val_5_0= ruleREAL ) ) )
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2168:7: () ( (lv_val_5_0= ruleREAL ) )
                    {
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2168:7: ()
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2169:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getAtomicExprAccess().getRealExprAction_2_0(),
                                  current);
                          
                    }

                    }

                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2174:2: ( (lv_val_5_0= ruleREAL ) )
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2175:1: (lv_val_5_0= ruleREAL )
                    {
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2175:1: (lv_val_5_0= ruleREAL )
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2176:3: lv_val_5_0= ruleREAL
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getAtomicExprAccess().getValREALParserRuleCall_2_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleREAL_in_ruleAtomicExpr4888);
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
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2193:6: ( () ( (lv_val_7_0= ruleBOOL ) ) )
                    {
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2193:6: ( () ( (lv_val_7_0= ruleBOOL ) ) )
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2193:7: () ( (lv_val_7_0= ruleBOOL ) )
                    {
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2193:7: ()
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2194:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getAtomicExprAccess().getBoolExprAction_3_0(),
                                  current);
                          
                    }

                    }

                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2199:2: ( (lv_val_7_0= ruleBOOL ) )
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2200:1: (lv_val_7_0= ruleBOOL )
                    {
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2200:1: (lv_val_7_0= ruleBOOL )
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2201:3: lv_val_7_0= ruleBOOL
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getAtomicExprAccess().getValBOOLParserRuleCall_3_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleBOOL_in_ruleAtomicExpr4926);
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
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2218:6: ( () otherlv_9= 'if' ( (lv_cond_10_0= ruleExpr ) ) otherlv_11= 'then' ( (lv_then_12_0= ruleExpr ) ) otherlv_13= 'else' ( (lv_else_14_0= ruleExpr ) ) )
                    {
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2218:6: ( () otherlv_9= 'if' ( (lv_cond_10_0= ruleExpr ) ) otherlv_11= 'then' ( (lv_then_12_0= ruleExpr ) ) otherlv_13= 'else' ( (lv_else_14_0= ruleExpr ) ) )
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2218:7: () otherlv_9= 'if' ( (lv_cond_10_0= ruleExpr ) ) otherlv_11= 'then' ( (lv_then_12_0= ruleExpr ) ) otherlv_13= 'else' ( (lv_else_14_0= ruleExpr ) )
                    {
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2218:7: ()
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2219:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getAtomicExprAccess().getIfThenElseExprAction_4_0(),
                                  current);
                          
                    }

                    }

                    otherlv_9=(Token)match(input,54,FOLLOW_54_in_ruleAtomicExpr4955); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_9, grammarAccess.getAtomicExprAccess().getIfKeyword_4_1());
                          
                    }
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2228:1: ( (lv_cond_10_0= ruleExpr ) )
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2229:1: (lv_cond_10_0= ruleExpr )
                    {
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2229:1: (lv_cond_10_0= ruleExpr )
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2230:3: lv_cond_10_0= ruleExpr
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getAtomicExprAccess().getCondExprParserRuleCall_4_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleExpr_in_ruleAtomicExpr4976);
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

                    otherlv_11=(Token)match(input,55,FOLLOW_55_in_ruleAtomicExpr4988); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_11, grammarAccess.getAtomicExprAccess().getThenKeyword_4_3());
                          
                    }
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2250:1: ( (lv_then_12_0= ruleExpr ) )
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2251:1: (lv_then_12_0= ruleExpr )
                    {
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2251:1: (lv_then_12_0= ruleExpr )
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2252:3: lv_then_12_0= ruleExpr
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getAtomicExprAccess().getThenExprParserRuleCall_4_4_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleExpr_in_ruleAtomicExpr5009);
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

                    otherlv_13=(Token)match(input,56,FOLLOW_56_in_ruleAtomicExpr5021); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_13, grammarAccess.getAtomicExprAccess().getElseKeyword_4_5());
                          
                    }
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2272:1: ( (lv_else_14_0= ruleExpr ) )
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2273:1: (lv_else_14_0= ruleExpr )
                    {
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2273:1: (lv_else_14_0= ruleExpr )
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2274:3: lv_else_14_0= ruleExpr
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getAtomicExprAccess().getElseExprParserRuleCall_4_6_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleExpr_in_ruleAtomicExpr5042);
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
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2292:5: this_NodeCallExpr_15= ruleNodeCallExpr
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getAtomicExprAccess().getNodeCallExprParserRuleCall_5()); 
                          
                    }
                    pushFollow(FOLLOW_ruleNodeCallExpr_in_ruleAtomicExpr5071);
                    this_NodeCallExpr_15=ruleNodeCallExpr();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_NodeCallExpr_15; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 7 :
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2301:6: ( () otherlv_17= 'condact' otherlv_18= '(' ( (lv_clock_19_0= ruleExpr ) ) otherlv_20= ',' ( (lv_call_21_0= ruleNodeCallExpr ) ) (otherlv_22= ',' ( (lv_args_23_0= ruleExpr ) ) )* otherlv_24= ')' )
                    {
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2301:6: ( () otherlv_17= 'condact' otherlv_18= '(' ( (lv_clock_19_0= ruleExpr ) ) otherlv_20= ',' ( (lv_call_21_0= ruleNodeCallExpr ) ) (otherlv_22= ',' ( (lv_args_23_0= ruleExpr ) ) )* otherlv_24= ')' )
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2301:7: () otherlv_17= 'condact' otherlv_18= '(' ( (lv_clock_19_0= ruleExpr ) ) otherlv_20= ',' ( (lv_call_21_0= ruleNodeCallExpr ) ) (otherlv_22= ',' ( (lv_args_23_0= ruleExpr ) ) )* otherlv_24= ')'
                    {
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2301:7: ()
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2302:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getAtomicExprAccess().getCondactExprAction_6_0(),
                                  current);
                          
                    }

                    }

                    otherlv_17=(Token)match(input,57,FOLLOW_57_in_ruleAtomicExpr5098); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_17, grammarAccess.getAtomicExprAccess().getCondactKeyword_6_1());
                          
                    }
                    otherlv_18=(Token)match(input,28,FOLLOW_28_in_ruleAtomicExpr5110); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_18, grammarAccess.getAtomicExprAccess().getLeftParenthesisKeyword_6_2());
                          
                    }
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2315:1: ( (lv_clock_19_0= ruleExpr ) )
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2316:1: (lv_clock_19_0= ruleExpr )
                    {
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2316:1: (lv_clock_19_0= ruleExpr )
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2317:3: lv_clock_19_0= ruleExpr
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getAtomicExprAccess().getClockExprParserRuleCall_6_3_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleExpr_in_ruleAtomicExpr5131);
                    lv_clock_19_0=ruleExpr();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getAtomicExprRule());
                      	        }
                             		set(
                             			current, 
                             			"clock",
                              		lv_clock_19_0, 
                              		"Expr");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    otherlv_20=(Token)match(input,22,FOLLOW_22_in_ruleAtomicExpr5143); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_20, grammarAccess.getAtomicExprAccess().getCommaKeyword_6_4());
                          
                    }
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2337:1: ( (lv_call_21_0= ruleNodeCallExpr ) )
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2338:1: (lv_call_21_0= ruleNodeCallExpr )
                    {
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2338:1: (lv_call_21_0= ruleNodeCallExpr )
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2339:3: lv_call_21_0= ruleNodeCallExpr
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getAtomicExprAccess().getCallNodeCallExprParserRuleCall_6_5_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleNodeCallExpr_in_ruleAtomicExpr5164);
                    lv_call_21_0=ruleNodeCallExpr();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getAtomicExprRule());
                      	        }
                             		set(
                             			current, 
                             			"call",
                              		lv_call_21_0, 
                              		"NodeCallExpr");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2355:2: (otherlv_22= ',' ( (lv_args_23_0= ruleExpr ) ) )*
                    loop32:
                    do {
                        int alt32=2;
                        int LA32_0 = input.LA(1);

                        if ( (LA32_0==22) ) {
                            alt32=1;
                        }


                        switch (alt32) {
                    	case 1 :
                    	    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2355:4: otherlv_22= ',' ( (lv_args_23_0= ruleExpr ) )
                    	    {
                    	    otherlv_22=(Token)match(input,22,FOLLOW_22_in_ruleAtomicExpr5177); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_22, grammarAccess.getAtomicExprAccess().getCommaKeyword_6_6_0());
                    	          
                    	    }
                    	    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2359:1: ( (lv_args_23_0= ruleExpr ) )
                    	    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2360:1: (lv_args_23_0= ruleExpr )
                    	    {
                    	    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2360:1: (lv_args_23_0= ruleExpr )
                    	    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2361:3: lv_args_23_0= ruleExpr
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getAtomicExprAccess().getArgsExprParserRuleCall_6_6_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleExpr_in_ruleAtomicExpr5198);
                    	    lv_args_23_0=ruleExpr();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getAtomicExprRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"args",
                    	              		lv_args_23_0, 
                    	              		"Expr");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop32;
                        }
                    } while (true);

                    otherlv_24=(Token)match(input,29,FOLLOW_29_in_ruleAtomicExpr5212); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_24, grammarAccess.getAtomicExprAccess().getRightParenthesisKeyword_6_7());
                          
                    }

                    }


                    }
                    break;
                case 8 :
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2382:6: ( () ( (otherlv_26= RULE_ID ) ) otherlv_27= '{' ( (otherlv_28= RULE_ID ) ) otherlv_29= '=' ( (lv_exprs_30_0= ruleExpr ) ) (otherlv_31= ';' ( (otherlv_32= RULE_ID ) ) otherlv_33= '=' ( (lv_exprs_34_0= ruleExpr ) ) )* otherlv_35= '}' )
                    {
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2382:6: ( () ( (otherlv_26= RULE_ID ) ) otherlv_27= '{' ( (otherlv_28= RULE_ID ) ) otherlv_29= '=' ( (lv_exprs_30_0= ruleExpr ) ) (otherlv_31= ';' ( (otherlv_32= RULE_ID ) ) otherlv_33= '=' ( (lv_exprs_34_0= ruleExpr ) ) )* otherlv_35= '}' )
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2382:7: () ( (otherlv_26= RULE_ID ) ) otherlv_27= '{' ( (otherlv_28= RULE_ID ) ) otherlv_29= '=' ( (lv_exprs_30_0= ruleExpr ) ) (otherlv_31= ';' ( (otherlv_32= RULE_ID ) ) otherlv_33= '=' ( (lv_exprs_34_0= ruleExpr ) ) )* otherlv_35= '}'
                    {
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2382:7: ()
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2383:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getAtomicExprAccess().getRecordExprAction_7_0(),
                                  current);
                          
                    }

                    }

                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2388:2: ( (otherlv_26= RULE_ID ) )
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2389:1: (otherlv_26= RULE_ID )
                    {
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2389:1: (otherlv_26= RULE_ID )
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2390:3: otherlv_26= RULE_ID
                    {
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getAtomicExprRule());
                      	        }
                              
                    }
                    otherlv_26=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAtomicExpr5249); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		newLeafNode(otherlv_26, grammarAccess.getAtomicExprAccess().getTypeRecordTypeCrossReference_7_1_0()); 
                      	
                    }

                    }


                    }

                    otherlv_27=(Token)match(input,14,FOLLOW_14_in_ruleAtomicExpr5261); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_27, grammarAccess.getAtomicExprAccess().getLeftCurlyBracketKeyword_7_2());
                          
                    }
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2405:1: ( (otherlv_28= RULE_ID ) )
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2406:1: (otherlv_28= RULE_ID )
                    {
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2406:1: (otherlv_28= RULE_ID )
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2407:3: otherlv_28= RULE_ID
                    {
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getAtomicExprRule());
                      	        }
                              
                    }
                    otherlv_28=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAtomicExpr5281); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		newLeafNode(otherlv_28, grammarAccess.getAtomicExprAccess().getFieldsFieldCrossReference_7_3_0()); 
                      	
                    }

                    }


                    }

                    otherlv_29=(Token)match(input,11,FOLLOW_11_in_ruleAtomicExpr5293); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_29, grammarAccess.getAtomicExprAccess().getEqualsSignKeyword_7_4());
                          
                    }
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2422:1: ( (lv_exprs_30_0= ruleExpr ) )
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2423:1: (lv_exprs_30_0= ruleExpr )
                    {
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2423:1: (lv_exprs_30_0= ruleExpr )
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2424:3: lv_exprs_30_0= ruleExpr
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getAtomicExprAccess().getExprsExprParserRuleCall_7_5_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleExpr_in_ruleAtomicExpr5314);
                    lv_exprs_30_0=ruleExpr();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getAtomicExprRule());
                      	        }
                             		add(
                             			current, 
                             			"exprs",
                              		lv_exprs_30_0, 
                              		"Expr");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2440:2: (otherlv_31= ';' ( (otherlv_32= RULE_ID ) ) otherlv_33= '=' ( (lv_exprs_34_0= ruleExpr ) ) )*
                    loop33:
                    do {
                        int alt33=2;
                        int LA33_0 = input.LA(1);

                        if ( (LA33_0==12) ) {
                            alt33=1;
                        }


                        switch (alt33) {
                    	case 1 :
                    	    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2440:4: otherlv_31= ';' ( (otherlv_32= RULE_ID ) ) otherlv_33= '=' ( (lv_exprs_34_0= ruleExpr ) )
                    	    {
                    	    otherlv_31=(Token)match(input,12,FOLLOW_12_in_ruleAtomicExpr5327); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_31, grammarAccess.getAtomicExprAccess().getSemicolonKeyword_7_6_0());
                    	          
                    	    }
                    	    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2444:1: ( (otherlv_32= RULE_ID ) )
                    	    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2445:1: (otherlv_32= RULE_ID )
                    	    {
                    	    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2445:1: (otherlv_32= RULE_ID )
                    	    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2446:3: otherlv_32= RULE_ID
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      			if (current==null) {
                    	      	            current = createModelElement(grammarAccess.getAtomicExprRule());
                    	      	        }
                    	              
                    	    }
                    	    otherlv_32=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAtomicExpr5347); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      		newLeafNode(otherlv_32, grammarAccess.getAtomicExprAccess().getFieldsFieldCrossReference_7_6_1_0()); 
                    	      	
                    	    }

                    	    }


                    	    }

                    	    otherlv_33=(Token)match(input,11,FOLLOW_11_in_ruleAtomicExpr5359); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_33, grammarAccess.getAtomicExprAccess().getEqualsSignKeyword_7_6_2());
                    	          
                    	    }
                    	    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2461:1: ( (lv_exprs_34_0= ruleExpr ) )
                    	    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2462:1: (lv_exprs_34_0= ruleExpr )
                    	    {
                    	    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2462:1: (lv_exprs_34_0= ruleExpr )
                    	    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2463:3: lv_exprs_34_0= ruleExpr
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getAtomicExprAccess().getExprsExprParserRuleCall_7_6_3_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleExpr_in_ruleAtomicExpr5380);
                    	    lv_exprs_34_0=ruleExpr();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getAtomicExprRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"exprs",
                    	              		lv_exprs_34_0, 
                    	              		"Expr");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop33;
                        }
                    } while (true);

                    otherlv_35=(Token)match(input,16,FOLLOW_16_in_ruleAtomicExpr5394); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_35, grammarAccess.getAtomicExprAccess().getRightCurlyBracketKeyword_7_7());
                          
                    }

                    }


                    }
                    break;
                case 9 :
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2484:6: (otherlv_36= '(' this_Expr_37= ruleExpr otherlv_38= ')' )
                    {
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2484:6: (otherlv_36= '(' this_Expr_37= ruleExpr otherlv_38= ')' )
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2484:8: otherlv_36= '(' this_Expr_37= ruleExpr otherlv_38= ')'
                    {
                    otherlv_36=(Token)match(input,28,FOLLOW_28_in_ruleAtomicExpr5414); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_36, grammarAccess.getAtomicExprAccess().getLeftParenthesisKeyword_8_0());
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getAtomicExprAccess().getExprParserRuleCall_8_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleExpr_in_ruleAtomicExpr5436);
                    this_Expr_37=ruleExpr();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_Expr_37; 
                              afterParserOrEnumRuleCall();
                          
                    }
                    otherlv_38=(Token)match(input,29,FOLLOW_29_in_ruleAtomicExpr5447); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_38, grammarAccess.getAtomicExprAccess().getRightParenthesisKeyword_8_2());
                          
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
    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2509:1: entryRuleNodeCallExpr returns [EObject current=null] : iv_ruleNodeCallExpr= ruleNodeCallExpr EOF ;
    public final EObject entryRuleNodeCallExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNodeCallExpr = null;


        try {
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2510:2: (iv_ruleNodeCallExpr= ruleNodeCallExpr EOF )
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2511:2: iv_ruleNodeCallExpr= ruleNodeCallExpr EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNodeCallExprRule()); 
            }
            pushFollow(FOLLOW_ruleNodeCallExpr_in_entryRuleNodeCallExpr5484);
            iv_ruleNodeCallExpr=ruleNodeCallExpr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNodeCallExpr; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleNodeCallExpr5494); if (state.failed) return current;

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
    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2518:1: ruleNodeCallExpr returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '(' ( ( (lv_args_2_0= ruleExpr ) ) (otherlv_3= ',' ( (lv_args_4_0= ruleExpr ) ) )* )? otherlv_5= ')' ) ;
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
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2521:28: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '(' ( ( (lv_args_2_0= ruleExpr ) ) (otherlv_3= ',' ( (lv_args_4_0= ruleExpr ) ) )* )? otherlv_5= ')' ) )
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2522:1: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '(' ( ( (lv_args_2_0= ruleExpr ) ) (otherlv_3= ',' ( (lv_args_4_0= ruleExpr ) ) )* )? otherlv_5= ')' )
            {
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2522:1: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '(' ( ( (lv_args_2_0= ruleExpr ) ) (otherlv_3= ',' ( (lv_args_4_0= ruleExpr ) ) )* )? otherlv_5= ')' )
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2522:2: ( (otherlv_0= RULE_ID ) ) otherlv_1= '(' ( ( (lv_args_2_0= ruleExpr ) ) (otherlv_3= ',' ( (lv_args_4_0= ruleExpr ) ) )* )? otherlv_5= ')'
            {
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2522:2: ( (otherlv_0= RULE_ID ) )
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2523:1: (otherlv_0= RULE_ID )
            {
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2523:1: (otherlv_0= RULE_ID )
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2524:3: otherlv_0= RULE_ID
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getNodeCallExprRule());
              	        }
                      
            }
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleNodeCallExpr5539); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		newLeafNode(otherlv_0, grammarAccess.getNodeCallExprAccess().getNodeNodeCrossReference_0_0()); 
              	
            }

            }


            }

            otherlv_1=(Token)match(input,28,FOLLOW_28_in_ruleNodeCallExpr5551); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getNodeCallExprAccess().getLeftParenthesisKeyword_1());
                  
            }
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2539:1: ( ( (lv_args_2_0= ruleExpr ) ) (otherlv_3= ',' ( (lv_args_4_0= ruleExpr ) ) )* )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( ((LA36_0>=RULE_ID && LA36_0<=RULE_INT)||LA36_0==25||LA36_0==28||(LA36_0>=51 && LA36_0<=52)||LA36_0==54||(LA36_0>=57 && LA36_0<=59)) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2539:2: ( (lv_args_2_0= ruleExpr ) ) (otherlv_3= ',' ( (lv_args_4_0= ruleExpr ) ) )*
                    {
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2539:2: ( (lv_args_2_0= ruleExpr ) )
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2540:1: (lv_args_2_0= ruleExpr )
                    {
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2540:1: (lv_args_2_0= ruleExpr )
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2541:3: lv_args_2_0= ruleExpr
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getNodeCallExprAccess().getArgsExprParserRuleCall_2_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleExpr_in_ruleNodeCallExpr5573);
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

                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2557:2: (otherlv_3= ',' ( (lv_args_4_0= ruleExpr ) ) )*
                    loop35:
                    do {
                        int alt35=2;
                        int LA35_0 = input.LA(1);

                        if ( (LA35_0==22) ) {
                            alt35=1;
                        }


                        switch (alt35) {
                    	case 1 :
                    	    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2557:4: otherlv_3= ',' ( (lv_args_4_0= ruleExpr ) )
                    	    {
                    	    otherlv_3=(Token)match(input,22,FOLLOW_22_in_ruleNodeCallExpr5586); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_3, grammarAccess.getNodeCallExprAccess().getCommaKeyword_2_1_0());
                    	          
                    	    }
                    	    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2561:1: ( (lv_args_4_0= ruleExpr ) )
                    	    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2562:1: (lv_args_4_0= ruleExpr )
                    	    {
                    	    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2562:1: (lv_args_4_0= ruleExpr )
                    	    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2563:3: lv_args_4_0= ruleExpr
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getNodeCallExprAccess().getArgsExprParserRuleCall_2_1_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleExpr_in_ruleNodeCallExpr5607);
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
                    	    break loop35;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_5=(Token)match(input,29,FOLLOW_29_in_ruleNodeCallExpr5623); if (state.failed) return current;
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
    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2593:1: entryRuleREAL returns [String current=null] : iv_ruleREAL= ruleREAL EOF ;
    public final String entryRuleREAL() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleREAL = null;


        try {
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2594:2: (iv_ruleREAL= ruleREAL EOF )
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2595:2: iv_ruleREAL= ruleREAL EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getREALRule()); 
            }
            pushFollow(FOLLOW_ruleREAL_in_entryRuleREAL5662);
            iv_ruleREAL=ruleREAL();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleREAL.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleREAL5673); if (state.failed) return current;

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
    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2602:1: ruleREAL returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_INT_0= RULE_INT kw= '.' this_INT_2= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleREAL() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;
        Token kw=null;
        Token this_INT_2=null;

         enterRule(); 
            
        try {
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2605:28: ( (this_INT_0= RULE_INT kw= '.' this_INT_2= RULE_INT ) )
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2606:1: (this_INT_0= RULE_INT kw= '.' this_INT_2= RULE_INT )
            {
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2606:1: (this_INT_0= RULE_INT kw= '.' this_INT_2= RULE_INT )
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2606:6: this_INT_0= RULE_INT kw= '.' this_INT_2= RULE_INT
            {
            this_INT_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleREAL5713); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_INT_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_INT_0, grammarAccess.getREALAccess().getINTTerminalRuleCall_0()); 
                  
            }
            kw=(Token)match(input,53,FOLLOW_53_in_ruleREAL5731); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current.merge(kw);
                      newLeafNode(kw, grammarAccess.getREALAccess().getFullStopKeyword_1()); 
                  
            }
            this_INT_2=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleREAL5746); if (state.failed) return current;
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
    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2634:1: entryRuleBOOL returns [String current=null] : iv_ruleBOOL= ruleBOOL EOF ;
    public final String entryRuleBOOL() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleBOOL = null;


        try {
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2635:2: (iv_ruleBOOL= ruleBOOL EOF )
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2636:2: iv_ruleBOOL= ruleBOOL EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBOOLRule()); 
            }
            pushFollow(FOLLOW_ruleBOOL_in_entryRuleBOOL5792);
            iv_ruleBOOL=ruleBOOL();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBOOL.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleBOOL5803); if (state.failed) return current;

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
    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2643:1: ruleBOOL returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'true' | kw= 'false' ) ;
    public final AntlrDatatypeRuleToken ruleBOOL() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2646:28: ( (kw= 'true' | kw= 'false' ) )
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2647:1: (kw= 'true' | kw= 'false' )
            {
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2647:1: (kw= 'true' | kw= 'false' )
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==58) ) {
                alt37=1;
            }
            else if ( (LA37_0==59) ) {
                alt37=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 37, 0, input);

                throw nvae;
            }
            switch (alt37) {
                case 1 :
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2648:2: kw= 'true'
                    {
                    kw=(Token)match(input,58,FOLLOW_58_in_ruleBOOL5841); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getBOOLAccess().getTrueKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2655:2: kw= 'false'
                    {
                    kw=(Token)match(input,59,FOLLOW_59_in_ruleBOOL5860); if (state.failed) return current;
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
        // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1289:3: ( ( () ( ( '->' ) ) ) )
        // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1289:4: ( () ( ( '->' ) ) )
        {
        // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1289:4: ( () ( ( '->' ) ) )
        // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1289:5: () ( ( '->' ) )
        {
        // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1289:5: ()
        // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1290:1: 
        {
        }

        // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1290:2: ( ( '->' ) )
        // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1291:1: ( '->' )
        {
        // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1291:1: ( '->' )
        // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1292:2: '->'
        {
        match(input,37,FOLLOW_37_in_synpred1_InternalJKind2746); if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred1_InternalJKind

    // $ANTLR start synpred2_InternalJKind
    public final void synpred2_InternalJKind_fragment() throws RecognitionException {   
        // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1365:3: ( ( () ( ( '=>' ) ) ) )
        // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1365:4: ( () ( ( '=>' ) ) )
        {
        // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1365:4: ( () ( ( '=>' ) ) )
        // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1365:5: () ( ( '=>' ) )
        {
        // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1365:5: ()
        // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1366:1: 
        {
        }

        // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1366:2: ( ( '=>' ) )
        // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1367:1: ( '=>' )
        {
        // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1367:1: ( '=>' )
        // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1368:2: '=>'
        {
        match(input,38,FOLLOW_38_in_synpred2_InternalJKind2928); if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred2_InternalJKind

    // $ANTLR start synpred3_InternalJKind
    public final void synpred3_InternalJKind_fragment() throws RecognitionException {   
        // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1441:3: ( ( () ( ( ( 'or' | 'xor' ) ) ) ) )
        // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1441:4: ( () ( ( ( 'or' | 'xor' ) ) ) )
        {
        // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1441:4: ( () ( ( ( 'or' | 'xor' ) ) ) )
        // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1441:5: () ( ( ( 'or' | 'xor' ) ) )
        {
        // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1441:5: ()
        // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1442:1: 
        {
        }

        // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1442:2: ( ( ( 'or' | 'xor' ) ) )
        // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1443:1: ( ( 'or' | 'xor' ) )
        {
        // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1443:1: ( ( 'or' | 'xor' ) )
        // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1444:1: ( 'or' | 'xor' )
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
    // $ANTLR end synpred3_InternalJKind

    // $ANTLR start synpred4_InternalJKind
    public final void synpred4_InternalJKind_fragment() throws RecognitionException {   
        // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1538:3: ( ( () ( ( 'and' ) ) ) )
        // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1538:4: ( () ( ( 'and' ) ) )
        {
        // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1538:4: ( () ( ( 'and' ) ) )
        // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1538:5: () ( ( 'and' ) )
        {
        // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1538:5: ()
        // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1539:1: 
        {
        }

        // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1539:2: ( ( 'and' ) )
        // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1540:1: ( 'and' )
        {
        // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1540:1: ( 'and' )
        // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1541:2: 'and'
        {
        match(input,41,FOLLOW_41_in_synpred4_InternalJKind3345); if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred4_InternalJKind

    // $ANTLR start synpred5_InternalJKind
    public final void synpred5_InternalJKind_fragment() throws RecognitionException {   
        // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1614:3: ( ( () ( ( ( '<' | '<=' | '>' | '>=' | '=' | '<>' ) ) ) ) )
        // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1614:4: ( () ( ( ( '<' | '<=' | '>' | '>=' | '=' | '<>' ) ) ) )
        {
        // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1614:4: ( () ( ( ( '<' | '<=' | '>' | '>=' | '=' | '<>' ) ) ) )
        // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1614:5: () ( ( ( '<' | '<=' | '>' | '>=' | '=' | '<>' ) ) )
        {
        // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1614:5: ()
        // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1615:1: 
        {
        }

        // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1615:2: ( ( ( '<' | '<=' | '>' | '>=' | '=' | '<>' ) ) )
        // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1616:1: ( ( '<' | '<=' | '>' | '>=' | '=' | '<>' ) )
        {
        // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1616:1: ( ( '<' | '<=' | '>' | '>=' | '=' | '<>' ) )
        // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1617:1: ( '<' | '<=' | '>' | '>=' | '=' | '<>' )
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
    // $ANTLR end synpred5_InternalJKind

    // $ANTLR start synpred6_InternalJKind
    public final void synpred6_InternalJKind_fragment() throws RecognitionException {   
        // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1771:3: ( ( () ( ( ( '+' | '-' ) ) ) ) )
        // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1771:4: ( () ( ( ( '+' | '-' ) ) ) )
        {
        // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1771:4: ( () ( ( ( '+' | '-' ) ) ) )
        // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1771:5: () ( ( ( '+' | '-' ) ) )
        {
        // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1771:5: ()
        // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1772:1: 
        {
        }

        // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1772:2: ( ( ( '+' | '-' ) ) )
        // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1773:1: ( ( '+' | '-' ) )
        {
        // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1773:1: ( ( '+' | '-' ) )
        // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1774:1: ( '+' | '-' )
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
    // $ANTLR end synpred6_InternalJKind

    // $ANTLR start synpred7_InternalJKind
    public final void synpred7_InternalJKind_fragment() throws RecognitionException {   
        // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1868:3: ( ( () ( ( ( '*' | '/' | 'div' ) ) ) ) )
        // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1868:4: ( () ( ( ( '*' | '/' | 'div' ) ) ) )
        {
        // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1868:4: ( () ( ( ( '*' | '/' | 'div' ) ) ) )
        // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1868:5: () ( ( ( '*' | '/' | 'div' ) ) )
        {
        // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1868:5: ()
        // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1869:1: 
        {
        }

        // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1869:2: ( ( ( '*' | '/' | 'div' ) ) )
        // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1870:1: ( ( '*' | '/' | 'div' ) )
        {
        // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1870:1: ( ( '*' | '/' | 'div' ) )
        // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1871:1: ( '*' | '/' | 'div' )
        {
        if ( (input.LA(1)>=48 && input.LA(1)<=50) ) {
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
        // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2077:3: ( ( () '.' ) )
        // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2077:4: ( () '.' )
        {
        // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2077:4: ( () '.' )
        // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2077:5: () '.'
        {
        // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2077:5: ()
        // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2078:1: 
        {
        }

        match(input,53,FOLLOW_53_in_synpred8_InternalJKind4667); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred8_InternalJKind

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


    protected DFA34 dfa34 = new DFA34(this);
    static final String DFA34_eotS =
        "\15\uffff";
    static final String DFA34_eofS =
        "\1\uffff\1\7\1\13\12\uffff";
    static final String DFA34_minS =
        "\1\4\2\13\7\uffff\1\4\2\uffff";
    static final String DFA34_maxS =
        "\1\73\2\70\7\uffff\1\5\2\uffff";
    static final String DFA34_acceptS =
        "\3\uffff\1\4\1\5\1\7\1\11\1\1\1\10\1\6\1\uffff\1\2\1\3";
    static final String DFA34_specialS =
        "\15\uffff}>";
    static final String[] DFA34_transitionS = {
            "\1\1\1\2\26\uffff\1\6\31\uffff\1\4\2\uffff\1\5\2\3",
            "\2\7\1\uffff\1\10\1\uffff\1\7\5\uffff\1\7\2\uffff\1\7\2\uffff"+
            "\1\11\1\7\7\uffff\16\7\2\uffff\1\7\1\uffff\2\7",
            "\2\13\3\uffff\1\13\5\uffff\1\13\2\uffff\1\13\3\uffff\1\13"+
            "\7\uffff\16\13\2\uffff\1\12\1\uffff\2\13",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\13\1\14",
            "",
            ""
    };

    static final short[] DFA34_eot = DFA.unpackEncodedString(DFA34_eotS);
    static final short[] DFA34_eof = DFA.unpackEncodedString(DFA34_eofS);
    static final char[] DFA34_min = DFA.unpackEncodedStringToUnsignedChars(DFA34_minS);
    static final char[] DFA34_max = DFA.unpackEncodedStringToUnsignedChars(DFA34_maxS);
    static final short[] DFA34_accept = DFA.unpackEncodedString(DFA34_acceptS);
    static final short[] DFA34_special = DFA.unpackEncodedString(DFA34_specialS);
    static final short[][] DFA34_transition;

    static {
        int numStates = DFA34_transitionS.length;
        DFA34_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA34_transition[i] = DFA.unpackEncodedString(DFA34_transitionS[i]);
        }
    }

    class DFA34 extends DFA {

        public DFA34(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 34;
            this.eot = DFA34_eot;
            this.eof = DFA34_eof;
            this.min = DFA34_min;
            this.max = DFA34_max;
            this.accept = DFA34_accept;
            this.special = DFA34_special;
            this.transition = DFA34_transition;
        }
        public String getDescription() {
            return "2123:1: ( ( () ( (otherlv_1= RULE_ID ) ) ) | ( () ( (lv_val_3_0= RULE_INT ) ) ) | ( () ( (lv_val_5_0= ruleREAL ) ) ) | ( () ( (lv_val_7_0= ruleBOOL ) ) ) | ( () otherlv_9= 'if' ( (lv_cond_10_0= ruleExpr ) ) otherlv_11= 'then' ( (lv_then_12_0= ruleExpr ) ) otherlv_13= 'else' ( (lv_else_14_0= ruleExpr ) ) ) | this_NodeCallExpr_15= ruleNodeCallExpr | ( () otherlv_17= 'condact' otherlv_18= '(' ( (lv_clock_19_0= ruleExpr ) ) otherlv_20= ',' ( (lv_call_21_0= ruleNodeCallExpr ) ) (otherlv_22= ',' ( (lv_args_23_0= ruleExpr ) ) )* otherlv_24= ')' ) | ( () ( (otherlv_26= RULE_ID ) ) otherlv_27= '{' ( (otherlv_28= RULE_ID ) ) otherlv_29= '=' ( (lv_exprs_30_0= ruleExpr ) ) (otherlv_31= ';' ( (otherlv_32= RULE_ID ) ) otherlv_33= '=' ( (lv_exprs_34_0= ruleExpr ) ) )* otherlv_35= '}' ) | (otherlv_36= '(' this_Expr_37= ruleExpr otherlv_38= ')' ) )";
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
    public static final BitSet FOLLOW_11_in_ruleConstant1258 = new BitSet(new long[]{0x0E58000012000030L});
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
    public static final BitSet FOLLOW_32_in_ruleNode1651 = new BitSet(new long[]{0x0000001E00000010L});
    public static final BitSet FOLLOW_ruleEquation_in_ruleNode1673 = new BitSet(new long[]{0x0000001E00000010L});
    public static final BitSet FOLLOW_ruleAssertion_in_ruleNode1700 = new BitSet(new long[]{0x0000001E00000010L});
    public static final BitSet FOLLOW_ruleProperty_in_ruleNode1727 = new BitSet(new long[]{0x0000001E00000010L});
    public static final BitSet FOLLOW_ruleMain_in_ruleNode1754 = new BitSet(new long[]{0x0000001E00000010L});
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
    public static final BitSet FOLLOW_RULE_ID_in_ruleEquation2126 = new BitSet(new long[]{0x0000000000400800L});
    public static final BitSet FOLLOW_22_in_ruleEquation2139 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEquation2159 = new BitSet(new long[]{0x0000000000400800L});
    public static final BitSet FOLLOW_11_in_ruleEquation2173 = new BitSet(new long[]{0x0E58000012000030L});
    public static final BitSet FOLLOW_ruleExpr_in_ruleEquation2194 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleEquation2206 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProperty_in_entryRuleProperty2242 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleProperty2252 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_ruleProperty2289 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleProperty2309 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleProperty2321 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMain_in_entryRuleMain2358 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMain2369 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_ruleMain2407 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_12_in_ruleMain2421 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAssertion_in_entryRuleAssertion2463 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAssertion2473 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_ruleAssertion2510 = new BitSet(new long[]{0x0E58000012000030L});
    public static final BitSet FOLLOW_ruleExpr_in_ruleAssertion2531 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleAssertion2543 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpr_in_entryRuleExpr2579 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExpr2589 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleArrowExpr_in_ruleExpr2635 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleArrowExpr_in_entryRuleArrowExpr2669 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleArrowExpr2679 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImpliesExpr_in_ruleArrowExpr2726 = new BitSet(new long[]{0x0000002000000002L});
    public static final BitSet FOLLOW_37_in_ruleArrowExpr2777 = new BitSet(new long[]{0x0E58000012000030L});
    public static final BitSet FOLLOW_ruleArrowExpr_in_ruleArrowExpr2813 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImpliesExpr_in_entryRuleImpliesExpr2851 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleImpliesExpr2861 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOrExpr_in_ruleImpliesExpr2908 = new BitSet(new long[]{0x0000004000000002L});
    public static final BitSet FOLLOW_38_in_ruleImpliesExpr2959 = new BitSet(new long[]{0x0E58000012000030L});
    public static final BitSet FOLLOW_ruleImpliesExpr_in_ruleImpliesExpr2995 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOrExpr_in_entryRuleOrExpr3033 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOrExpr3043 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAndExpr_in_ruleOrExpr3090 = new BitSet(new long[]{0x0000018000000002L});
    public static final BitSet FOLLOW_39_in_ruleOrExpr3162 = new BitSet(new long[]{0x0E58000012000030L});
    public static final BitSet FOLLOW_40_in_ruleOrExpr3191 = new BitSet(new long[]{0x0E58000012000030L});
    public static final BitSet FOLLOW_ruleAndExpr_in_ruleOrExpr3230 = new BitSet(new long[]{0x0000018000000002L});
    public static final BitSet FOLLOW_ruleAndExpr_in_entryRuleAndExpr3268 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAndExpr3278 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRelationalExpr_in_ruleAndExpr3325 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_41_in_ruleAndExpr3376 = new BitSet(new long[]{0x0E58000012000030L});
    public static final BitSet FOLLOW_ruleRelationalExpr_in_ruleAndExpr3412 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_ruleRelationalExpr_in_entryRuleRelationalExpr3450 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRelationalExpr3460 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePlusExpr_in_ruleRelationalExpr3507 = new BitSet(new long[]{0x00007C0000000802L});
    public static final BitSet FOLLOW_42_in_ruleRelationalExpr3635 = new BitSet(new long[]{0x0E58000012000030L});
    public static final BitSet FOLLOW_43_in_ruleRelationalExpr3664 = new BitSet(new long[]{0x0E58000012000030L});
    public static final BitSet FOLLOW_44_in_ruleRelationalExpr3693 = new BitSet(new long[]{0x0E58000012000030L});
    public static final BitSet FOLLOW_45_in_ruleRelationalExpr3722 = new BitSet(new long[]{0x0E58000012000030L});
    public static final BitSet FOLLOW_11_in_ruleRelationalExpr3751 = new BitSet(new long[]{0x0E58000012000030L});
    public static final BitSet FOLLOW_46_in_ruleRelationalExpr3780 = new BitSet(new long[]{0x0E58000012000030L});
    public static final BitSet FOLLOW_rulePlusExpr_in_ruleRelationalExpr3819 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePlusExpr_in_entryRulePlusExpr3857 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePlusExpr3867 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTimesExpr_in_rulePlusExpr3914 = new BitSet(new long[]{0x0000800002000002L});
    public static final BitSet FOLLOW_47_in_rulePlusExpr3986 = new BitSet(new long[]{0x0E58000012000030L});
    public static final BitSet FOLLOW_25_in_rulePlusExpr4015 = new BitSet(new long[]{0x0E58000012000030L});
    public static final BitSet FOLLOW_ruleTimesExpr_in_rulePlusExpr4054 = new BitSet(new long[]{0x0000800002000002L});
    public static final BitSet FOLLOW_ruleTimesExpr_in_entryRuleTimesExpr4092 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTimesExpr4102 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrefixExpr_in_ruleTimesExpr4149 = new BitSet(new long[]{0x0007000000000002L});
    public static final BitSet FOLLOW_48_in_ruleTimesExpr4235 = new BitSet(new long[]{0x0E58000012000030L});
    public static final BitSet FOLLOW_49_in_ruleTimesExpr4264 = new BitSet(new long[]{0x0E58000012000030L});
    public static final BitSet FOLLOW_50_in_ruleTimesExpr4293 = new BitSet(new long[]{0x0E58000012000030L});
    public static final BitSet FOLLOW_rulePrefixExpr_in_ruleTimesExpr4332 = new BitSet(new long[]{0x0007000000000002L});
    public static final BitSet FOLLOW_rulePrefixExpr_in_entryRulePrefixExpr4370 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePrefixExpr4380 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rulePrefixExpr4435 = new BitSet(new long[]{0x0E58000012000030L});
    public static final BitSet FOLLOW_51_in_rulePrefixExpr4464 = new BitSet(new long[]{0x0E58000012000030L});
    public static final BitSet FOLLOW_52_in_rulePrefixExpr4493 = new BitSet(new long[]{0x0E58000012000030L});
    public static final BitSet FOLLOW_rulePrefixExpr_in_rulePrefixExpr4530 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProjectionExpr_in_rulePrefixExpr4559 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProjectionExpr_in_entryRuleProjectionExpr4594 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleProjectionExpr4604 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAtomicExpr_in_ruleProjectionExpr4651 = new BitSet(new long[]{0x0020000000000002L});
    public static final BitSet FOLLOW_53_in_ruleProjectionExpr4686 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleProjectionExpr4708 = new BitSet(new long[]{0x0020000000000002L});
    public static final BitSet FOLLOW_ruleAtomicExpr_in_entryRuleAtomicExpr4746 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAtomicExpr4756 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAtomicExpr4811 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleAtomicExpr4845 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleREAL_in_ruleAtomicExpr4888 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBOOL_in_ruleAtomicExpr4926 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_54_in_ruleAtomicExpr4955 = new BitSet(new long[]{0x0E58000012000030L});
    public static final BitSet FOLLOW_ruleExpr_in_ruleAtomicExpr4976 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_55_in_ruleAtomicExpr4988 = new BitSet(new long[]{0x0E58000012000030L});
    public static final BitSet FOLLOW_ruleExpr_in_ruleAtomicExpr5009 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_56_in_ruleAtomicExpr5021 = new BitSet(new long[]{0x0E58000012000030L});
    public static final BitSet FOLLOW_ruleExpr_in_ruleAtomicExpr5042 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNodeCallExpr_in_ruleAtomicExpr5071 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_57_in_ruleAtomicExpr5098 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_ruleAtomicExpr5110 = new BitSet(new long[]{0x0E58000012000030L});
    public static final BitSet FOLLOW_ruleExpr_in_ruleAtomicExpr5131 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_ruleAtomicExpr5143 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleNodeCallExpr_in_ruleAtomicExpr5164 = new BitSet(new long[]{0x0000000020400000L});
    public static final BitSet FOLLOW_22_in_ruleAtomicExpr5177 = new BitSet(new long[]{0x0E58000012000030L});
    public static final BitSet FOLLOW_ruleExpr_in_ruleAtomicExpr5198 = new BitSet(new long[]{0x0000000020400000L});
    public static final BitSet FOLLOW_29_in_ruleAtomicExpr5212 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAtomicExpr5249 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleAtomicExpr5261 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAtomicExpr5281 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_ruleAtomicExpr5293 = new BitSet(new long[]{0x0E58000012000030L});
    public static final BitSet FOLLOW_ruleExpr_in_ruleAtomicExpr5314 = new BitSet(new long[]{0x0000000000011000L});
    public static final BitSet FOLLOW_12_in_ruleAtomicExpr5327 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAtomicExpr5347 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_ruleAtomicExpr5359 = new BitSet(new long[]{0x0E58000012000030L});
    public static final BitSet FOLLOW_ruleExpr_in_ruleAtomicExpr5380 = new BitSet(new long[]{0x0000000000011000L});
    public static final BitSet FOLLOW_16_in_ruleAtomicExpr5394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_ruleAtomicExpr5414 = new BitSet(new long[]{0x0E58000012000030L});
    public static final BitSet FOLLOW_ruleExpr_in_ruleAtomicExpr5436 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_ruleAtomicExpr5447 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNodeCallExpr_in_entryRuleNodeCallExpr5484 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNodeCallExpr5494 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleNodeCallExpr5539 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_ruleNodeCallExpr5551 = new BitSet(new long[]{0x0E58000032000030L});
    public static final BitSet FOLLOW_ruleExpr_in_ruleNodeCallExpr5573 = new BitSet(new long[]{0x0000000020400000L});
    public static final BitSet FOLLOW_22_in_ruleNodeCallExpr5586 = new BitSet(new long[]{0x0E58000012000030L});
    public static final BitSet FOLLOW_ruleExpr_in_ruleNodeCallExpr5607 = new BitSet(new long[]{0x0000000020400000L});
    public static final BitSet FOLLOW_29_in_ruleNodeCallExpr5623 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleREAL_in_entryRuleREAL5662 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleREAL5673 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleREAL5713 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_53_in_ruleREAL5731 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleREAL5746 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBOOL_in_entryRuleBOOL5792 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBOOL5803 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_58_in_ruleBOOL5841 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_59_in_ruleBOOL5860 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_synpred1_InternalJKind2746 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_synpred2_InternalJKind2928 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_synpred3_InternalJKind3109 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_synpred4_InternalJKind3345 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_synpred5_InternalJKind3526 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_synpred6_InternalJKind3933 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_synpred7_InternalJKind4168 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_synpred8_InternalJKind4667 = new BitSet(new long[]{0x0000000000000002L});

}