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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_BOOL", "RULE_SL_COMMENT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'type'", "'='", "';'", "'struct'", "'{'", "':'", "'}'", "'int'", "'bool'", "'real'", "'subrange'", "'['", "','", "']'", "'of'", "'-'", "'const'", "'node'", "'('", "')'", "'returns'", "'var'", "'let'", "'tel'", "'--%PROPERTY'", "'--%MAIN'", "'assert'", "'->'", "'=>'", "'or'", "'xor'", "'and'", "'<'", "'<='", "'>'", "'>='", "'<>'", "'+'", "'*'", "'/'", "'div'", "'not'", "'pre'", "'.'", "'if'", "'then'", "'else'"
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
    public static final int RULE_ANY_OTHER=11;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int RULE_BOOL=6;
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
    public static final int T__14=14;
    public static final int T__13=13;
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
    public static final int RULE_ML_COMMENT=9;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int RULE_STRING=8;
    public static final int T__32=32;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int RULE_WS=10;

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
                case 12:
                    {
                    alt1=1;
                    }
                    break;
                case 28:
                    {
                    alt1=2;
                    }
                    break;
                case 29:
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
    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:153:1: ruleTypedef returns [EObject current=null] : (otherlv_0= 'type' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_type_3_0= ruleTopLevelType ) ) otherlv_4= ';' ) ;
    public final EObject ruleTypedef() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_type_3_0 = null;


         enterRule(); 
            
        try {
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:156:28: ( (otherlv_0= 'type' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_type_3_0= ruleTopLevelType ) ) otherlv_4= ';' ) )
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:157:1: (otherlv_0= 'type' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_type_3_0= ruleTopLevelType ) ) otherlv_4= ';' )
            {
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:157:1: (otherlv_0= 'type' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_type_3_0= ruleTopLevelType ) ) otherlv_4= ';' )
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:157:3: otherlv_0= 'type' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_type_3_0= ruleTopLevelType ) ) otherlv_4= ';'
            {
            otherlv_0=(Token)match(input,12,FOLLOW_12_in_ruleTypedef269); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getTypedefAccess().getTypeKeyword_0());
                  
            }
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:161:1: ( (lv_name_1_0= RULE_ID ) )
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:162:1: (lv_name_1_0= RULE_ID )
            {
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:162:1: (lv_name_1_0= RULE_ID )
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:163:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleTypedef286); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_1_0, grammarAccess.getTypedefAccess().getNameIDTerminalRuleCall_1_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getTypedefRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_1_0, 
                      		"ID");
              	    
            }

            }


            }

            otherlv_2=(Token)match(input,13,FOLLOW_13_in_ruleTypedef303); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getTypedefAccess().getEqualsSignKeyword_2());
                  
            }
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:183:1: ( (lv_type_3_0= ruleTopLevelType ) )
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:184:1: (lv_type_3_0= ruleTopLevelType )
            {
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:184:1: (lv_type_3_0= ruleTopLevelType )
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:185:3: lv_type_3_0= ruleTopLevelType
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getTypedefAccess().getTypeTopLevelTypeParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleTopLevelType_in_ruleTypedef324);
            lv_type_3_0=ruleTopLevelType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getTypedefRule());
              	        }
                     		set(
                     			current, 
                     			"type",
                      		lv_type_3_0, 
                      		"TopLevelType");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_4=(Token)match(input,14,FOLLOW_14_in_ruleTypedef336); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getTypedefAccess().getSemicolonKeyword_4());
                  
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
    // $ANTLR end "ruleTypedef"


    // $ANTLR start "entryRuleTopLevelType"
    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:213:1: entryRuleTopLevelType returns [EObject current=null] : iv_ruleTopLevelType= ruleTopLevelType EOF ;
    public final EObject entryRuleTopLevelType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTopLevelType = null;


        try {
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:214:2: (iv_ruleTopLevelType= ruleTopLevelType EOF )
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:215:2: iv_ruleTopLevelType= ruleTopLevelType EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTopLevelTypeRule()); 
            }
            pushFollow(FOLLOW_ruleTopLevelType_in_entryRuleTopLevelType372);
            iv_ruleTopLevelType=ruleTopLevelType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTopLevelType; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleTopLevelType382); if (state.failed) return current;

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
    // $ANTLR end "entryRuleTopLevelType"


    // $ANTLR start "ruleTopLevelType"
    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:222:1: ruleTopLevelType returns [EObject current=null] : ( ( () otherlv_1= 'struct' otherlv_2= '{' ( (lv_fields_3_0= RULE_ID ) ) otherlv_4= ':' ( (lv_types_5_0= ruleType ) ) (otherlv_6= ';' ( (lv_fields_7_0= RULE_ID ) ) otherlv_8= ':' ( (lv_types_9_0= ruleType ) ) )* otherlv_10= '}' ) | this_Type_11= ruleType ) ;
    public final EObject ruleTopLevelType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_fields_3_0=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token lv_fields_7_0=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        EObject lv_types_5_0 = null;

        EObject lv_types_9_0 = null;

        EObject this_Type_11 = null;


         enterRule(); 
            
        try {
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:225:28: ( ( ( () otherlv_1= 'struct' otherlv_2= '{' ( (lv_fields_3_0= RULE_ID ) ) otherlv_4= ':' ( (lv_types_5_0= ruleType ) ) (otherlv_6= ';' ( (lv_fields_7_0= RULE_ID ) ) otherlv_8= ':' ( (lv_types_9_0= ruleType ) ) )* otherlv_10= '}' ) | this_Type_11= ruleType ) )
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:226:1: ( ( () otherlv_1= 'struct' otherlv_2= '{' ( (lv_fields_3_0= RULE_ID ) ) otherlv_4= ':' ( (lv_types_5_0= ruleType ) ) (otherlv_6= ';' ( (lv_fields_7_0= RULE_ID ) ) otherlv_8= ':' ( (lv_types_9_0= ruleType ) ) )* otherlv_10= '}' ) | this_Type_11= ruleType )
            {
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:226:1: ( ( () otherlv_1= 'struct' otherlv_2= '{' ( (lv_fields_3_0= RULE_ID ) ) otherlv_4= ':' ( (lv_types_5_0= ruleType ) ) (otherlv_6= ';' ( (lv_fields_7_0= RULE_ID ) ) otherlv_8= ':' ( (lv_types_9_0= ruleType ) ) )* otherlv_10= '}' ) | this_Type_11= ruleType )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==15) ) {
                alt3=1;
            }
            else if ( (LA3_0==RULE_ID||(LA3_0>=19 && LA3_0<=22)) ) {
                alt3=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:226:2: ( () otherlv_1= 'struct' otherlv_2= '{' ( (lv_fields_3_0= RULE_ID ) ) otherlv_4= ':' ( (lv_types_5_0= ruleType ) ) (otherlv_6= ';' ( (lv_fields_7_0= RULE_ID ) ) otherlv_8= ':' ( (lv_types_9_0= ruleType ) ) )* otherlv_10= '}' )
                    {
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:226:2: ( () otherlv_1= 'struct' otherlv_2= '{' ( (lv_fields_3_0= RULE_ID ) ) otherlv_4= ':' ( (lv_types_5_0= ruleType ) ) (otherlv_6= ';' ( (lv_fields_7_0= RULE_ID ) ) otherlv_8= ':' ( (lv_types_9_0= ruleType ) ) )* otherlv_10= '}' )
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:226:3: () otherlv_1= 'struct' otherlv_2= '{' ( (lv_fields_3_0= RULE_ID ) ) otherlv_4= ':' ( (lv_types_5_0= ruleType ) ) (otherlv_6= ';' ( (lv_fields_7_0= RULE_ID ) ) otherlv_8= ':' ( (lv_types_9_0= ruleType ) ) )* otherlv_10= '}'
                    {
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:226:3: ()
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:227:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getTopLevelTypeAccess().getRecordTypeAction_0_0(),
                                  current);
                          
                    }

                    }

                    otherlv_1=(Token)match(input,15,FOLLOW_15_in_ruleTopLevelType429); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getTopLevelTypeAccess().getStructKeyword_0_1());
                          
                    }
                    otherlv_2=(Token)match(input,16,FOLLOW_16_in_ruleTopLevelType441); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getTopLevelTypeAccess().getLeftCurlyBracketKeyword_0_2());
                          
                    }
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:240:1: ( (lv_fields_3_0= RULE_ID ) )
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:241:1: (lv_fields_3_0= RULE_ID )
                    {
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:241:1: (lv_fields_3_0= RULE_ID )
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:242:3: lv_fields_3_0= RULE_ID
                    {
                    lv_fields_3_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleTopLevelType458); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_fields_3_0, grammarAccess.getTopLevelTypeAccess().getFieldsIDTerminalRuleCall_0_3_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getTopLevelTypeRule());
                      	        }
                             		addWithLastConsumed(
                             			current, 
                             			"fields",
                              		lv_fields_3_0, 
                              		"ID");
                      	    
                    }

                    }


                    }

                    otherlv_4=(Token)match(input,17,FOLLOW_17_in_ruleTopLevelType475); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getTopLevelTypeAccess().getColonKeyword_0_4());
                          
                    }
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:262:1: ( (lv_types_5_0= ruleType ) )
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:263:1: (lv_types_5_0= ruleType )
                    {
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:263:1: (lv_types_5_0= ruleType )
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:264:3: lv_types_5_0= ruleType
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getTopLevelTypeAccess().getTypesTypeParserRuleCall_0_5_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleType_in_ruleTopLevelType496);
                    lv_types_5_0=ruleType();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getTopLevelTypeRule());
                      	        }
                             		add(
                             			current, 
                             			"types",
                              		lv_types_5_0, 
                              		"Type");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:280:2: (otherlv_6= ';' ( (lv_fields_7_0= RULE_ID ) ) otherlv_8= ':' ( (lv_types_9_0= ruleType ) ) )*
                    loop2:
                    do {
                        int alt2=2;
                        int LA2_0 = input.LA(1);

                        if ( (LA2_0==14) ) {
                            alt2=1;
                        }


                        switch (alt2) {
                    	case 1 :
                    	    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:280:4: otherlv_6= ';' ( (lv_fields_7_0= RULE_ID ) ) otherlv_8= ':' ( (lv_types_9_0= ruleType ) )
                    	    {
                    	    otherlv_6=(Token)match(input,14,FOLLOW_14_in_ruleTopLevelType509); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_6, grammarAccess.getTopLevelTypeAccess().getSemicolonKeyword_0_6_0());
                    	          
                    	    }
                    	    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:284:1: ( (lv_fields_7_0= RULE_ID ) )
                    	    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:285:1: (lv_fields_7_0= RULE_ID )
                    	    {
                    	    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:285:1: (lv_fields_7_0= RULE_ID )
                    	    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:286:3: lv_fields_7_0= RULE_ID
                    	    {
                    	    lv_fields_7_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleTopLevelType526); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      			newLeafNode(lv_fields_7_0, grammarAccess.getTopLevelTypeAccess().getFieldsIDTerminalRuleCall_0_6_1_0()); 
                    	      		
                    	    }
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElement(grammarAccess.getTopLevelTypeRule());
                    	      	        }
                    	             		addWithLastConsumed(
                    	             			current, 
                    	             			"fields",
                    	              		lv_fields_7_0, 
                    	              		"ID");
                    	      	    
                    	    }

                    	    }


                    	    }

                    	    otherlv_8=(Token)match(input,17,FOLLOW_17_in_ruleTopLevelType543); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_8, grammarAccess.getTopLevelTypeAccess().getColonKeyword_0_6_2());
                    	          
                    	    }
                    	    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:306:1: ( (lv_types_9_0= ruleType ) )
                    	    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:307:1: (lv_types_9_0= ruleType )
                    	    {
                    	    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:307:1: (lv_types_9_0= ruleType )
                    	    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:308:3: lv_types_9_0= ruleType
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getTopLevelTypeAccess().getTypesTypeParserRuleCall_0_6_3_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleType_in_ruleTopLevelType564);
                    	    lv_types_9_0=ruleType();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getTopLevelTypeRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"types",
                    	              		lv_types_9_0, 
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

                    otherlv_10=(Token)match(input,18,FOLLOW_18_in_ruleTopLevelType578); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_10, grammarAccess.getTopLevelTypeAccess().getRightCurlyBracketKeyword_0_7());
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:330:5: this_Type_11= ruleType
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getTopLevelTypeAccess().getTypeParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleType_in_ruleTopLevelType607);
                    this_Type_11=ruleType();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_Type_11; 
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
    // $ANTLR end "ruleTopLevelType"


    // $ANTLR start "entryRuleType"
    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:346:1: entryRuleType returns [EObject current=null] : iv_ruleType= ruleType EOF ;
    public final EObject entryRuleType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleType = null;


        try {
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:347:2: (iv_ruleType= ruleType EOF )
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:348:2: iv_ruleType= ruleType EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTypeRule()); 
            }
            pushFollow(FOLLOW_ruleType_in_entryRuleType642);
            iv_ruleType=ruleType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleType; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleType652); if (state.failed) return current;

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
    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:355:1: ruleType returns [EObject current=null] : ( ( () otherlv_1= 'int' ) | ( () otherlv_3= 'bool' ) | ( () otherlv_5= 'real' ) | ( () otherlv_7= 'subrange' otherlv_8= '[' ( (lv_low_9_0= ruleBound ) ) otherlv_10= ',' ( (lv_high_11_0= ruleBound ) ) otherlv_12= ']' otherlv_13= 'of' otherlv_14= 'int' ) | ( () ( (otherlv_16= RULE_ID ) ) ) ) ;
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
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:358:28: ( ( ( () otherlv_1= 'int' ) | ( () otherlv_3= 'bool' ) | ( () otherlv_5= 'real' ) | ( () otherlv_7= 'subrange' otherlv_8= '[' ( (lv_low_9_0= ruleBound ) ) otherlv_10= ',' ( (lv_high_11_0= ruleBound ) ) otherlv_12= ']' otherlv_13= 'of' otherlv_14= 'int' ) | ( () ( (otherlv_16= RULE_ID ) ) ) ) )
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:359:1: ( ( () otherlv_1= 'int' ) | ( () otherlv_3= 'bool' ) | ( () otherlv_5= 'real' ) | ( () otherlv_7= 'subrange' otherlv_8= '[' ( (lv_low_9_0= ruleBound ) ) otherlv_10= ',' ( (lv_high_11_0= ruleBound ) ) otherlv_12= ']' otherlv_13= 'of' otherlv_14= 'int' ) | ( () ( (otherlv_16= RULE_ID ) ) ) )
            {
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:359:1: ( ( () otherlv_1= 'int' ) | ( () otherlv_3= 'bool' ) | ( () otherlv_5= 'real' ) | ( () otherlv_7= 'subrange' otherlv_8= '[' ( (lv_low_9_0= ruleBound ) ) otherlv_10= ',' ( (lv_high_11_0= ruleBound ) ) otherlv_12= ']' otherlv_13= 'of' otherlv_14= 'int' ) | ( () ( (otherlv_16= RULE_ID ) ) ) )
            int alt4=5;
            switch ( input.LA(1) ) {
            case 19:
                {
                alt4=1;
                }
                break;
            case 20:
                {
                alt4=2;
                }
                break;
            case 21:
                {
                alt4=3;
                }
                break;
            case 22:
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
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:359:2: ( () otherlv_1= 'int' )
                    {
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:359:2: ( () otherlv_1= 'int' )
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:359:3: () otherlv_1= 'int'
                    {
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:359:3: ()
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:360:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getTypeAccess().getIntTypeAction_0_0(),
                                  current);
                          
                    }

                    }

                    otherlv_1=(Token)match(input,19,FOLLOW_19_in_ruleType699); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getTypeAccess().getIntKeyword_0_1());
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:370:6: ( () otherlv_3= 'bool' )
                    {
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:370:6: ( () otherlv_3= 'bool' )
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:370:7: () otherlv_3= 'bool'
                    {
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:370:7: ()
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:371:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getTypeAccess().getBoolTypeAction_1_0(),
                                  current);
                          
                    }

                    }

                    otherlv_3=(Token)match(input,20,FOLLOW_20_in_ruleType728); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getTypeAccess().getBoolKeyword_1_1());
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:381:6: ( () otherlv_5= 'real' )
                    {
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:381:6: ( () otherlv_5= 'real' )
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:381:7: () otherlv_5= 'real'
                    {
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:381:7: ()
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:382:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getTypeAccess().getRealTypeAction_2_0(),
                                  current);
                          
                    }

                    }

                    otherlv_5=(Token)match(input,21,FOLLOW_21_in_ruleType757); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_5, grammarAccess.getTypeAccess().getRealKeyword_2_1());
                          
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:392:6: ( () otherlv_7= 'subrange' otherlv_8= '[' ( (lv_low_9_0= ruleBound ) ) otherlv_10= ',' ( (lv_high_11_0= ruleBound ) ) otherlv_12= ']' otherlv_13= 'of' otherlv_14= 'int' )
                    {
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:392:6: ( () otherlv_7= 'subrange' otherlv_8= '[' ( (lv_low_9_0= ruleBound ) ) otherlv_10= ',' ( (lv_high_11_0= ruleBound ) ) otherlv_12= ']' otherlv_13= 'of' otherlv_14= 'int' )
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:392:7: () otherlv_7= 'subrange' otherlv_8= '[' ( (lv_low_9_0= ruleBound ) ) otherlv_10= ',' ( (lv_high_11_0= ruleBound ) ) otherlv_12= ']' otherlv_13= 'of' otherlv_14= 'int'
                    {
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:392:7: ()
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:393:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getTypeAccess().getSubrangeTypeAction_3_0(),
                                  current);
                          
                    }

                    }

                    otherlv_7=(Token)match(input,22,FOLLOW_22_in_ruleType786); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_7, grammarAccess.getTypeAccess().getSubrangeKeyword_3_1());
                          
                    }
                    otherlv_8=(Token)match(input,23,FOLLOW_23_in_ruleType798); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_8, grammarAccess.getTypeAccess().getLeftSquareBracketKeyword_3_2());
                          
                    }
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:406:1: ( (lv_low_9_0= ruleBound ) )
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:407:1: (lv_low_9_0= ruleBound )
                    {
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:407:1: (lv_low_9_0= ruleBound )
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:408:3: lv_low_9_0= ruleBound
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getTypeAccess().getLowBoundParserRuleCall_3_3_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleBound_in_ruleType819);
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

                    otherlv_10=(Token)match(input,24,FOLLOW_24_in_ruleType831); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_10, grammarAccess.getTypeAccess().getCommaKeyword_3_4());
                          
                    }
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:428:1: ( (lv_high_11_0= ruleBound ) )
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:429:1: (lv_high_11_0= ruleBound )
                    {
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:429:1: (lv_high_11_0= ruleBound )
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:430:3: lv_high_11_0= ruleBound
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getTypeAccess().getHighBoundParserRuleCall_3_5_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleBound_in_ruleType852);
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

                    otherlv_12=(Token)match(input,25,FOLLOW_25_in_ruleType864); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_12, grammarAccess.getTypeAccess().getRightSquareBracketKeyword_3_6());
                          
                    }
                    otherlv_13=(Token)match(input,26,FOLLOW_26_in_ruleType876); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_13, grammarAccess.getTypeAccess().getOfKeyword_3_7());
                          
                    }
                    otherlv_14=(Token)match(input,19,FOLLOW_19_in_ruleType888); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_14, grammarAccess.getTypeAccess().getIntKeyword_3_8());
                          
                    }

                    }


                    }
                    break;
                case 5 :
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:459:6: ( () ( (otherlv_16= RULE_ID ) ) )
                    {
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:459:6: ( () ( (otherlv_16= RULE_ID ) ) )
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:459:7: () ( (otherlv_16= RULE_ID ) )
                    {
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:459:7: ()
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:460:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getTypeAccess().getUserTypeAction_4_0(),
                                  current);
                          
                    }

                    }

                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:465:2: ( (otherlv_16= RULE_ID ) )
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:466:1: (otherlv_16= RULE_ID )
                    {
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:466:1: (otherlv_16= RULE_ID )
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:467:3: otherlv_16= RULE_ID
                    {
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getTypeRule());
                      	        }
                              
                    }
                    otherlv_16=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleType925); if (state.failed) return current;
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


    // $ANTLR start "entryRuleBound"
    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:486:1: entryRuleBound returns [String current=null] : iv_ruleBound= ruleBound EOF ;
    public final String entryRuleBound() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleBound = null;


        try {
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:487:2: (iv_ruleBound= ruleBound EOF )
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:488:2: iv_ruleBound= ruleBound EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBoundRule()); 
            }
            pushFollow(FOLLOW_ruleBound_in_entryRuleBound963);
            iv_ruleBound=ruleBound();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBound.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleBound974); if (state.failed) return current;

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
    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:495:1: ruleBound returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? this_INT_1= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleBound() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;

         enterRule(); 
            
        try {
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:498:28: ( ( (kw= '-' )? this_INT_1= RULE_INT ) )
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:499:1: ( (kw= '-' )? this_INT_1= RULE_INT )
            {
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:499:1: ( (kw= '-' )? this_INT_1= RULE_INT )
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:499:2: (kw= '-' )? this_INT_1= RULE_INT
            {
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:499:2: (kw= '-' )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==27) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:500:2: kw= '-'
                    {
                    kw=(Token)match(input,27,FOLLOW_27_in_ruleBound1013); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getBoundAccess().getHyphenMinusKeyword_0()); 
                          
                    }

                    }
                    break;

            }

            this_INT_1=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleBound1030); if (state.failed) return current;
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
    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:520:1: entryRuleConstant returns [EObject current=null] : iv_ruleConstant= ruleConstant EOF ;
    public final EObject entryRuleConstant() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConstant = null;


        try {
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:521:2: (iv_ruleConstant= ruleConstant EOF )
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:522:2: iv_ruleConstant= ruleConstant EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getConstantRule()); 
            }
            pushFollow(FOLLOW_ruleConstant_in_entryRuleConstant1075);
            iv_ruleConstant=ruleConstant();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleConstant; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleConstant1085); if (state.failed) return current;

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
    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:529:1: ruleConstant returns [EObject current=null] : (otherlv_0= 'const' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= ':' ( (lv_type_3_0= ruleType ) ) )? otherlv_4= '=' ( (lv_expr_5_0= ruleExpr ) ) otherlv_6= ';' ) ;
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
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:532:28: ( (otherlv_0= 'const' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= ':' ( (lv_type_3_0= ruleType ) ) )? otherlv_4= '=' ( (lv_expr_5_0= ruleExpr ) ) otherlv_6= ';' ) )
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:533:1: (otherlv_0= 'const' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= ':' ( (lv_type_3_0= ruleType ) ) )? otherlv_4= '=' ( (lv_expr_5_0= ruleExpr ) ) otherlv_6= ';' )
            {
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:533:1: (otherlv_0= 'const' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= ':' ( (lv_type_3_0= ruleType ) ) )? otherlv_4= '=' ( (lv_expr_5_0= ruleExpr ) ) otherlv_6= ';' )
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:533:3: otherlv_0= 'const' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= ':' ( (lv_type_3_0= ruleType ) ) )? otherlv_4= '=' ( (lv_expr_5_0= ruleExpr ) ) otherlv_6= ';'
            {
            otherlv_0=(Token)match(input,28,FOLLOW_28_in_ruleConstant1122); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getConstantAccess().getConstKeyword_0());
                  
            }
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:537:1: ( (lv_name_1_0= RULE_ID ) )
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:538:1: (lv_name_1_0= RULE_ID )
            {
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:538:1: (lv_name_1_0= RULE_ID )
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:539:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleConstant1139); if (state.failed) return current;
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

            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:555:2: (otherlv_2= ':' ( (lv_type_3_0= ruleType ) ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==17) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:555:4: otherlv_2= ':' ( (lv_type_3_0= ruleType ) )
                    {
                    otherlv_2=(Token)match(input,17,FOLLOW_17_in_ruleConstant1157); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getConstantAccess().getColonKeyword_2_0());
                          
                    }
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:559:1: ( (lv_type_3_0= ruleType ) )
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:560:1: (lv_type_3_0= ruleType )
                    {
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:560:1: (lv_type_3_0= ruleType )
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:561:3: lv_type_3_0= ruleType
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getConstantAccess().getTypeTypeParserRuleCall_2_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleType_in_ruleConstant1178);
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

            otherlv_4=(Token)match(input,13,FOLLOW_13_in_ruleConstant1192); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getConstantAccess().getEqualsSignKeyword_3());
                  
            }
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:581:1: ( (lv_expr_5_0= ruleExpr ) )
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:582:1: (lv_expr_5_0= ruleExpr )
            {
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:582:1: (lv_expr_5_0= ruleExpr )
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:583:3: lv_expr_5_0= ruleExpr
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getConstantAccess().getExprExprParserRuleCall_4_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleExpr_in_ruleConstant1213);
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

            otherlv_6=(Token)match(input,14,FOLLOW_14_in_ruleConstant1225); if (state.failed) return current;
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
    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:611:1: entryRuleNode returns [EObject current=null] : iv_ruleNode= ruleNode EOF ;
    public final EObject entryRuleNode() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNode = null;


        try {
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:612:2: (iv_ruleNode= ruleNode EOF )
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:613:2: iv_ruleNode= ruleNode EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNodeRule()); 
            }
            pushFollow(FOLLOW_ruleNode_in_entryRuleNode1261);
            iv_ruleNode=ruleNode();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNode; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleNode1271); if (state.failed) return current;

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
    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:620:1: ruleNode returns [EObject current=null] : (otherlv_0= 'node' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( ( (lv_inputs_3_0= ruleVariableGroup ) ) (otherlv_4= ';' ( (lv_inputs_5_0= ruleVariableGroup ) ) )* )? otherlv_6= ')' otherlv_7= 'returns' otherlv_8= '(' ( ( (lv_outputs_9_0= ruleVariableGroup ) ) (otherlv_10= ';' ( (lv_outputs_11_0= ruleVariableGroup ) ) )* )? otherlv_12= ')' otherlv_13= ';' (otherlv_14= 'var' ( ( (lv_locals_15_0= ruleVariableGroup ) ) otherlv_16= ';' )* )? otherlv_17= 'let' ( ( (lv_equations_18_0= ruleEquation ) ) | ( (lv_properties_19_0= ruleProperty ) ) | ( (lv_assertions_20_0= ruleAssertion ) ) | ( (lv_main_21_0= ruleMain ) ) )* otherlv_22= 'tel' (otherlv_23= ';' )? ) ;
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

        EObject lv_properties_19_0 = null;

        EObject lv_assertions_20_0 = null;

        AntlrDatatypeRuleToken lv_main_21_0 = null;


         enterRule(); 
            
        try {
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:623:28: ( (otherlv_0= 'node' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( ( (lv_inputs_3_0= ruleVariableGroup ) ) (otherlv_4= ';' ( (lv_inputs_5_0= ruleVariableGroup ) ) )* )? otherlv_6= ')' otherlv_7= 'returns' otherlv_8= '(' ( ( (lv_outputs_9_0= ruleVariableGroup ) ) (otherlv_10= ';' ( (lv_outputs_11_0= ruleVariableGroup ) ) )* )? otherlv_12= ')' otherlv_13= ';' (otherlv_14= 'var' ( ( (lv_locals_15_0= ruleVariableGroup ) ) otherlv_16= ';' )* )? otherlv_17= 'let' ( ( (lv_equations_18_0= ruleEquation ) ) | ( (lv_properties_19_0= ruleProperty ) ) | ( (lv_assertions_20_0= ruleAssertion ) ) | ( (lv_main_21_0= ruleMain ) ) )* otherlv_22= 'tel' (otherlv_23= ';' )? ) )
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:624:1: (otherlv_0= 'node' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( ( (lv_inputs_3_0= ruleVariableGroup ) ) (otherlv_4= ';' ( (lv_inputs_5_0= ruleVariableGroup ) ) )* )? otherlv_6= ')' otherlv_7= 'returns' otherlv_8= '(' ( ( (lv_outputs_9_0= ruleVariableGroup ) ) (otherlv_10= ';' ( (lv_outputs_11_0= ruleVariableGroup ) ) )* )? otherlv_12= ')' otherlv_13= ';' (otherlv_14= 'var' ( ( (lv_locals_15_0= ruleVariableGroup ) ) otherlv_16= ';' )* )? otherlv_17= 'let' ( ( (lv_equations_18_0= ruleEquation ) ) | ( (lv_properties_19_0= ruleProperty ) ) | ( (lv_assertions_20_0= ruleAssertion ) ) | ( (lv_main_21_0= ruleMain ) ) )* otherlv_22= 'tel' (otherlv_23= ';' )? )
            {
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:624:1: (otherlv_0= 'node' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( ( (lv_inputs_3_0= ruleVariableGroup ) ) (otherlv_4= ';' ( (lv_inputs_5_0= ruleVariableGroup ) ) )* )? otherlv_6= ')' otherlv_7= 'returns' otherlv_8= '(' ( ( (lv_outputs_9_0= ruleVariableGroup ) ) (otherlv_10= ';' ( (lv_outputs_11_0= ruleVariableGroup ) ) )* )? otherlv_12= ')' otherlv_13= ';' (otherlv_14= 'var' ( ( (lv_locals_15_0= ruleVariableGroup ) ) otherlv_16= ';' )* )? otherlv_17= 'let' ( ( (lv_equations_18_0= ruleEquation ) ) | ( (lv_properties_19_0= ruleProperty ) ) | ( (lv_assertions_20_0= ruleAssertion ) ) | ( (lv_main_21_0= ruleMain ) ) )* otherlv_22= 'tel' (otherlv_23= ';' )? )
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:624:3: otherlv_0= 'node' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( ( (lv_inputs_3_0= ruleVariableGroup ) ) (otherlv_4= ';' ( (lv_inputs_5_0= ruleVariableGroup ) ) )* )? otherlv_6= ')' otherlv_7= 'returns' otherlv_8= '(' ( ( (lv_outputs_9_0= ruleVariableGroup ) ) (otherlv_10= ';' ( (lv_outputs_11_0= ruleVariableGroup ) ) )* )? otherlv_12= ')' otherlv_13= ';' (otherlv_14= 'var' ( ( (lv_locals_15_0= ruleVariableGroup ) ) otherlv_16= ';' )* )? otherlv_17= 'let' ( ( (lv_equations_18_0= ruleEquation ) ) | ( (lv_properties_19_0= ruleProperty ) ) | ( (lv_assertions_20_0= ruleAssertion ) ) | ( (lv_main_21_0= ruleMain ) ) )* otherlv_22= 'tel' (otherlv_23= ';' )?
            {
            otherlv_0=(Token)match(input,29,FOLLOW_29_in_ruleNode1308); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getNodeAccess().getNodeKeyword_0());
                  
            }
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:628:1: ( (lv_name_1_0= RULE_ID ) )
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:629:1: (lv_name_1_0= RULE_ID )
            {
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:629:1: (lv_name_1_0= RULE_ID )
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:630:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleNode1325); if (state.failed) return current;
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

            otherlv_2=(Token)match(input,30,FOLLOW_30_in_ruleNode1342); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getNodeAccess().getLeftParenthesisKeyword_2());
                  
            }
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:650:1: ( ( (lv_inputs_3_0= ruleVariableGroup ) ) (otherlv_4= ';' ( (lv_inputs_5_0= ruleVariableGroup ) ) )* )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==RULE_ID) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:650:2: ( (lv_inputs_3_0= ruleVariableGroup ) ) (otherlv_4= ';' ( (lv_inputs_5_0= ruleVariableGroup ) ) )*
                    {
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:650:2: ( (lv_inputs_3_0= ruleVariableGroup ) )
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:651:1: (lv_inputs_3_0= ruleVariableGroup )
                    {
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:651:1: (lv_inputs_3_0= ruleVariableGroup )
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:652:3: lv_inputs_3_0= ruleVariableGroup
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getNodeAccess().getInputsVariableGroupParserRuleCall_3_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleVariableGroup_in_ruleNode1364);
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

                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:668:2: (otherlv_4= ';' ( (lv_inputs_5_0= ruleVariableGroup ) ) )*
                    loop7:
                    do {
                        int alt7=2;
                        int LA7_0 = input.LA(1);

                        if ( (LA7_0==14) ) {
                            alt7=1;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:668:4: otherlv_4= ';' ( (lv_inputs_5_0= ruleVariableGroup ) )
                    	    {
                    	    otherlv_4=(Token)match(input,14,FOLLOW_14_in_ruleNode1377); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_4, grammarAccess.getNodeAccess().getSemicolonKeyword_3_1_0());
                    	          
                    	    }
                    	    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:672:1: ( (lv_inputs_5_0= ruleVariableGroup ) )
                    	    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:673:1: (lv_inputs_5_0= ruleVariableGroup )
                    	    {
                    	    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:673:1: (lv_inputs_5_0= ruleVariableGroup )
                    	    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:674:3: lv_inputs_5_0= ruleVariableGroup
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getNodeAccess().getInputsVariableGroupParserRuleCall_3_1_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleVariableGroup_in_ruleNode1398);
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

            otherlv_6=(Token)match(input,31,FOLLOW_31_in_ruleNode1414); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_6, grammarAccess.getNodeAccess().getRightParenthesisKeyword_4());
                  
            }
            otherlv_7=(Token)match(input,32,FOLLOW_32_in_ruleNode1426); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_7, grammarAccess.getNodeAccess().getReturnsKeyword_5());
                  
            }
            otherlv_8=(Token)match(input,30,FOLLOW_30_in_ruleNode1438); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_8, grammarAccess.getNodeAccess().getLeftParenthesisKeyword_6());
                  
            }
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:702:1: ( ( (lv_outputs_9_0= ruleVariableGroup ) ) (otherlv_10= ';' ( (lv_outputs_11_0= ruleVariableGroup ) ) )* )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==RULE_ID) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:702:2: ( (lv_outputs_9_0= ruleVariableGroup ) ) (otherlv_10= ';' ( (lv_outputs_11_0= ruleVariableGroup ) ) )*
                    {
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:702:2: ( (lv_outputs_9_0= ruleVariableGroup ) )
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:703:1: (lv_outputs_9_0= ruleVariableGroup )
                    {
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:703:1: (lv_outputs_9_0= ruleVariableGroup )
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:704:3: lv_outputs_9_0= ruleVariableGroup
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getNodeAccess().getOutputsVariableGroupParserRuleCall_7_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleVariableGroup_in_ruleNode1460);
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

                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:720:2: (otherlv_10= ';' ( (lv_outputs_11_0= ruleVariableGroup ) ) )*
                    loop9:
                    do {
                        int alt9=2;
                        int LA9_0 = input.LA(1);

                        if ( (LA9_0==14) ) {
                            alt9=1;
                        }


                        switch (alt9) {
                    	case 1 :
                    	    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:720:4: otherlv_10= ';' ( (lv_outputs_11_0= ruleVariableGroup ) )
                    	    {
                    	    otherlv_10=(Token)match(input,14,FOLLOW_14_in_ruleNode1473); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_10, grammarAccess.getNodeAccess().getSemicolonKeyword_7_1_0());
                    	          
                    	    }
                    	    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:724:1: ( (lv_outputs_11_0= ruleVariableGroup ) )
                    	    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:725:1: (lv_outputs_11_0= ruleVariableGroup )
                    	    {
                    	    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:725:1: (lv_outputs_11_0= ruleVariableGroup )
                    	    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:726:3: lv_outputs_11_0= ruleVariableGroup
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getNodeAccess().getOutputsVariableGroupParserRuleCall_7_1_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleVariableGroup_in_ruleNode1494);
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

            otherlv_12=(Token)match(input,31,FOLLOW_31_in_ruleNode1510); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_12, grammarAccess.getNodeAccess().getRightParenthesisKeyword_8());
                  
            }
            otherlv_13=(Token)match(input,14,FOLLOW_14_in_ruleNode1522); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_13, grammarAccess.getNodeAccess().getSemicolonKeyword_9());
                  
            }
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:750:1: (otherlv_14= 'var' ( ( (lv_locals_15_0= ruleVariableGroup ) ) otherlv_16= ';' )* )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==33) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:750:3: otherlv_14= 'var' ( ( (lv_locals_15_0= ruleVariableGroup ) ) otherlv_16= ';' )*
                    {
                    otherlv_14=(Token)match(input,33,FOLLOW_33_in_ruleNode1535); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_14, grammarAccess.getNodeAccess().getVarKeyword_10_0());
                          
                    }
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:754:1: ( ( (lv_locals_15_0= ruleVariableGroup ) ) otherlv_16= ';' )*
                    loop11:
                    do {
                        int alt11=2;
                        int LA11_0 = input.LA(1);

                        if ( (LA11_0==RULE_ID) ) {
                            alt11=1;
                        }


                        switch (alt11) {
                    	case 1 :
                    	    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:754:2: ( (lv_locals_15_0= ruleVariableGroup ) ) otherlv_16= ';'
                    	    {
                    	    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:754:2: ( (lv_locals_15_0= ruleVariableGroup ) )
                    	    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:755:1: (lv_locals_15_0= ruleVariableGroup )
                    	    {
                    	    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:755:1: (lv_locals_15_0= ruleVariableGroup )
                    	    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:756:3: lv_locals_15_0= ruleVariableGroup
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getNodeAccess().getLocalsVariableGroupParserRuleCall_10_1_0_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleVariableGroup_in_ruleNode1557);
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

                    	    otherlv_16=(Token)match(input,14,FOLLOW_14_in_ruleNode1569); if (state.failed) return current;
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

            otherlv_17=(Token)match(input,34,FOLLOW_34_in_ruleNode1585); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_17, grammarAccess.getNodeAccess().getLetKeyword_11());
                  
            }
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:780:1: ( ( (lv_equations_18_0= ruleEquation ) ) | ( (lv_properties_19_0= ruleProperty ) ) | ( (lv_assertions_20_0= ruleAssertion ) ) | ( (lv_main_21_0= ruleMain ) ) )*
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
                case 38:
                    {
                    alt13=3;
                    }
                    break;
                case 37:
                    {
                    alt13=4;
                    }
                    break;

                }

                switch (alt13) {
            	case 1 :
            	    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:780:2: ( (lv_equations_18_0= ruleEquation ) )
            	    {
            	    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:780:2: ( (lv_equations_18_0= ruleEquation ) )
            	    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:781:1: (lv_equations_18_0= ruleEquation )
            	    {
            	    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:781:1: (lv_equations_18_0= ruleEquation )
            	    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:782:3: lv_equations_18_0= ruleEquation
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getNodeAccess().getEquationsEquationParserRuleCall_12_0_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleEquation_in_ruleNode1607);
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
            	    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:799:6: ( (lv_properties_19_0= ruleProperty ) )
            	    {
            	    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:799:6: ( (lv_properties_19_0= ruleProperty ) )
            	    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:800:1: (lv_properties_19_0= ruleProperty )
            	    {
            	    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:800:1: (lv_properties_19_0= ruleProperty )
            	    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:801:3: lv_properties_19_0= ruleProperty
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getNodeAccess().getPropertiesPropertyParserRuleCall_12_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleProperty_in_ruleNode1634);
            	    lv_properties_19_0=ruleProperty();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getNodeRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"properties",
            	              		lv_properties_19_0, 
            	              		"Property");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:818:6: ( (lv_assertions_20_0= ruleAssertion ) )
            	    {
            	    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:818:6: ( (lv_assertions_20_0= ruleAssertion ) )
            	    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:819:1: (lv_assertions_20_0= ruleAssertion )
            	    {
            	    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:819:1: (lv_assertions_20_0= ruleAssertion )
            	    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:820:3: lv_assertions_20_0= ruleAssertion
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getNodeAccess().getAssertionsAssertionParserRuleCall_12_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleAssertion_in_ruleNode1661);
            	    lv_assertions_20_0=ruleAssertion();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getNodeRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"assertions",
            	              		lv_assertions_20_0, 
            	              		"Assertion");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;
            	case 4 :
            	    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:837:6: ( (lv_main_21_0= ruleMain ) )
            	    {
            	    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:837:6: ( (lv_main_21_0= ruleMain ) )
            	    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:838:1: (lv_main_21_0= ruleMain )
            	    {
            	    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:838:1: (lv_main_21_0= ruleMain )
            	    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:839:3: lv_main_21_0= ruleMain
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getNodeAccess().getMainMainParserRuleCall_12_3_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleMain_in_ruleNode1688);
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

            otherlv_22=(Token)match(input,35,FOLLOW_35_in_ruleNode1702); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_22, grammarAccess.getNodeAccess().getTelKeyword_13());
                  
            }
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:859:1: (otherlv_23= ';' )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==14) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:859:3: otherlv_23= ';'
                    {
                    otherlv_23=(Token)match(input,14,FOLLOW_14_in_ruleNode1715); if (state.failed) return current;
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
    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:871:1: entryRuleVariableGroup returns [EObject current=null] : iv_ruleVariableGroup= ruleVariableGroup EOF ;
    public final EObject entryRuleVariableGroup() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariableGroup = null;


        try {
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:872:2: (iv_ruleVariableGroup= ruleVariableGroup EOF )
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:873:2: iv_ruleVariableGroup= ruleVariableGroup EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getVariableGroupRule()); 
            }
            pushFollow(FOLLOW_ruleVariableGroup_in_entryRuleVariableGroup1753);
            iv_ruleVariableGroup=ruleVariableGroup();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleVariableGroup; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleVariableGroup1763); if (state.failed) return current;

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
    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:880:1: ruleVariableGroup returns [EObject current=null] : ( ( (lv_variables_0_0= ruleVariable ) ) (otherlv_1= ',' ( (lv_variables_2_0= ruleVariable ) ) )* otherlv_3= ':' ( (lv_type_4_0= ruleType ) ) ) ;
    public final EObject ruleVariableGroup() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_variables_0_0 = null;

        EObject lv_variables_2_0 = null;

        EObject lv_type_4_0 = null;


         enterRule(); 
            
        try {
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:883:28: ( ( ( (lv_variables_0_0= ruleVariable ) ) (otherlv_1= ',' ( (lv_variables_2_0= ruleVariable ) ) )* otherlv_3= ':' ( (lv_type_4_0= ruleType ) ) ) )
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:884:1: ( ( (lv_variables_0_0= ruleVariable ) ) (otherlv_1= ',' ( (lv_variables_2_0= ruleVariable ) ) )* otherlv_3= ':' ( (lv_type_4_0= ruleType ) ) )
            {
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:884:1: ( ( (lv_variables_0_0= ruleVariable ) ) (otherlv_1= ',' ( (lv_variables_2_0= ruleVariable ) ) )* otherlv_3= ':' ( (lv_type_4_0= ruleType ) ) )
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:884:2: ( (lv_variables_0_0= ruleVariable ) ) (otherlv_1= ',' ( (lv_variables_2_0= ruleVariable ) ) )* otherlv_3= ':' ( (lv_type_4_0= ruleType ) )
            {
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:884:2: ( (lv_variables_0_0= ruleVariable ) )
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:885:1: (lv_variables_0_0= ruleVariable )
            {
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:885:1: (lv_variables_0_0= ruleVariable )
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:886:3: lv_variables_0_0= ruleVariable
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getVariableGroupAccess().getVariablesVariableParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleVariable_in_ruleVariableGroup1809);
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

            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:902:2: (otherlv_1= ',' ( (lv_variables_2_0= ruleVariable ) ) )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==24) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:902:4: otherlv_1= ',' ( (lv_variables_2_0= ruleVariable ) )
            	    {
            	    otherlv_1=(Token)match(input,24,FOLLOW_24_in_ruleVariableGroup1822); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_1, grammarAccess.getVariableGroupAccess().getCommaKeyword_1_0());
            	          
            	    }
            	    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:906:1: ( (lv_variables_2_0= ruleVariable ) )
            	    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:907:1: (lv_variables_2_0= ruleVariable )
            	    {
            	    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:907:1: (lv_variables_2_0= ruleVariable )
            	    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:908:3: lv_variables_2_0= ruleVariable
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getVariableGroupAccess().getVariablesVariableParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleVariable_in_ruleVariableGroup1843);
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

            otherlv_3=(Token)match(input,17,FOLLOW_17_in_ruleVariableGroup1857); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getVariableGroupAccess().getColonKeyword_2());
                  
            }
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:928:1: ( (lv_type_4_0= ruleType ) )
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:929:1: (lv_type_4_0= ruleType )
            {
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:929:1: (lv_type_4_0= ruleType )
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:930:3: lv_type_4_0= ruleType
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getVariableGroupAccess().getTypeTypeParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleType_in_ruleVariableGroup1878);
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
    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:954:1: entryRuleVariable returns [EObject current=null] : iv_ruleVariable= ruleVariable EOF ;
    public final EObject entryRuleVariable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariable = null;


        try {
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:955:2: (iv_ruleVariable= ruleVariable EOF )
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:956:2: iv_ruleVariable= ruleVariable EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getVariableRule()); 
            }
            pushFollow(FOLLOW_ruleVariable_in_entryRuleVariable1914);
            iv_ruleVariable=ruleVariable();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleVariable; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleVariable1924); if (state.failed) return current;

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
    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:963:1: ruleVariable returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleVariable() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;

         enterRule(); 
            
        try {
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:966:28: ( ( (lv_name_0_0= RULE_ID ) ) )
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:967:1: ( (lv_name_0_0= RULE_ID ) )
            {
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:967:1: ( (lv_name_0_0= RULE_ID ) )
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:968:1: (lv_name_0_0= RULE_ID )
            {
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:968:1: (lv_name_0_0= RULE_ID )
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:969:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleVariable1965); if (state.failed) return current;
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
    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:993:1: entryRuleEquation returns [EObject current=null] : iv_ruleEquation= ruleEquation EOF ;
    public final EObject entryRuleEquation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEquation = null;


        try {
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:994:2: (iv_ruleEquation= ruleEquation EOF )
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:995:2: iv_ruleEquation= ruleEquation EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEquationRule()); 
            }
            pushFollow(FOLLOW_ruleEquation_in_entryRuleEquation2005);
            iv_ruleEquation=ruleEquation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEquation; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleEquation2015); if (state.failed) return current;

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
    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1002:1: ruleEquation returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= ',' ( (otherlv_2= RULE_ID ) ) )* otherlv_3= '=' ( (lv_rhs_4_0= ruleExpr ) ) otherlv_5= ';' ) ;
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
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1005:28: ( ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= ',' ( (otherlv_2= RULE_ID ) ) )* otherlv_3= '=' ( (lv_rhs_4_0= ruleExpr ) ) otherlv_5= ';' ) )
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1006:1: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= ',' ( (otherlv_2= RULE_ID ) ) )* otherlv_3= '=' ( (lv_rhs_4_0= ruleExpr ) ) otherlv_5= ';' )
            {
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1006:1: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= ',' ( (otherlv_2= RULE_ID ) ) )* otherlv_3= '=' ( (lv_rhs_4_0= ruleExpr ) ) otherlv_5= ';' )
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1006:2: ( (otherlv_0= RULE_ID ) ) (otherlv_1= ',' ( (otherlv_2= RULE_ID ) ) )* otherlv_3= '=' ( (lv_rhs_4_0= ruleExpr ) ) otherlv_5= ';'
            {
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1006:2: ( (otherlv_0= RULE_ID ) )
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1007:1: (otherlv_0= RULE_ID )
            {
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1007:1: (otherlv_0= RULE_ID )
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1008:3: otherlv_0= RULE_ID
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getEquationRule());
              	        }
                      
            }
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEquation2060); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		newLeafNode(otherlv_0, grammarAccess.getEquationAccess().getLhsVariableCrossReference_0_0()); 
              	
            }

            }


            }

            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1019:2: (otherlv_1= ',' ( (otherlv_2= RULE_ID ) ) )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==24) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1019:4: otherlv_1= ',' ( (otherlv_2= RULE_ID ) )
            	    {
            	    otherlv_1=(Token)match(input,24,FOLLOW_24_in_ruleEquation2073); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_1, grammarAccess.getEquationAccess().getCommaKeyword_1_0());
            	          
            	    }
            	    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1023:1: ( (otherlv_2= RULE_ID ) )
            	    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1024:1: (otherlv_2= RULE_ID )
            	    {
            	    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1024:1: (otherlv_2= RULE_ID )
            	    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1025:3: otherlv_2= RULE_ID
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getEquationRule());
            	      	        }
            	              
            	    }
            	    otherlv_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEquation2093); if (state.failed) return current;
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

            otherlv_3=(Token)match(input,13,FOLLOW_13_in_ruleEquation2107); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getEquationAccess().getEqualsSignKeyword_2());
                  
            }
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1040:1: ( (lv_rhs_4_0= ruleExpr ) )
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1041:1: (lv_rhs_4_0= ruleExpr )
            {
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1041:1: (lv_rhs_4_0= ruleExpr )
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1042:3: lv_rhs_4_0= ruleExpr
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getEquationAccess().getRhsExprParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleExpr_in_ruleEquation2128);
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

            otherlv_5=(Token)match(input,14,FOLLOW_14_in_ruleEquation2140); if (state.failed) return current;
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
    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1070:1: entryRuleProperty returns [EObject current=null] : iv_ruleProperty= ruleProperty EOF ;
    public final EObject entryRuleProperty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProperty = null;


        try {
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1071:2: (iv_ruleProperty= ruleProperty EOF )
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1072:2: iv_ruleProperty= ruleProperty EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPropertyRule()); 
            }
            pushFollow(FOLLOW_ruleProperty_in_entryRuleProperty2176);
            iv_ruleProperty=ruleProperty();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleProperty; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleProperty2186); if (state.failed) return current;

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
    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1079:1: ruleProperty returns [EObject current=null] : (otherlv_0= '--%PROPERTY' ( (otherlv_1= RULE_ID ) ) otherlv_2= ';' ) ;
    public final EObject ruleProperty() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;

         enterRule(); 
            
        try {
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1082:28: ( (otherlv_0= '--%PROPERTY' ( (otherlv_1= RULE_ID ) ) otherlv_2= ';' ) )
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1083:1: (otherlv_0= '--%PROPERTY' ( (otherlv_1= RULE_ID ) ) otherlv_2= ';' )
            {
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1083:1: (otherlv_0= '--%PROPERTY' ( (otherlv_1= RULE_ID ) ) otherlv_2= ';' )
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1083:3: otherlv_0= '--%PROPERTY' ( (otherlv_1= RULE_ID ) ) otherlv_2= ';'
            {
            otherlv_0=(Token)match(input,36,FOLLOW_36_in_ruleProperty2223); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getPropertyAccess().getPROPERTYKeyword_0());
                  
            }
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1087:1: ( (otherlv_1= RULE_ID ) )
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1088:1: (otherlv_1= RULE_ID )
            {
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1088:1: (otherlv_1= RULE_ID )
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1089:3: otherlv_1= RULE_ID
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getPropertyRule());
              	        }
                      
            }
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleProperty2243); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		newLeafNode(otherlv_1, grammarAccess.getPropertyAccess().getRefVariableCrossReference_1_0()); 
              	
            }

            }


            }

            otherlv_2=(Token)match(input,14,FOLLOW_14_in_ruleProperty2255); if (state.failed) return current;
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
    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1112:1: entryRuleMain returns [String current=null] : iv_ruleMain= ruleMain EOF ;
    public final String entryRuleMain() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleMain = null;


        try {
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1113:2: (iv_ruleMain= ruleMain EOF )
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1114:2: iv_ruleMain= ruleMain EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMainRule()); 
            }
            pushFollow(FOLLOW_ruleMain_in_entryRuleMain2292);
            iv_ruleMain=ruleMain();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMain.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleMain2303); if (state.failed) return current;

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
    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1121:1: ruleMain returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '--%MAIN' (kw= ';' )? ) ;
    public final AntlrDatatypeRuleToken ruleMain() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1124:28: ( (kw= '--%MAIN' (kw= ';' )? ) )
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1125:1: (kw= '--%MAIN' (kw= ';' )? )
            {
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1125:1: (kw= '--%MAIN' (kw= ';' )? )
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1126:2: kw= '--%MAIN' (kw= ';' )?
            {
            kw=(Token)match(input,37,FOLLOW_37_in_ruleMain2341); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current.merge(kw);
                      newLeafNode(kw, grammarAccess.getMainAccess().getMAINKeyword_0()); 
                  
            }
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1131:1: (kw= ';' )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==14) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1132:2: kw= ';'
                    {
                    kw=(Token)match(input,14,FOLLOW_14_in_ruleMain2355); if (state.failed) return current;
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
    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1145:1: entryRuleAssertion returns [EObject current=null] : iv_ruleAssertion= ruleAssertion EOF ;
    public final EObject entryRuleAssertion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAssertion = null;


        try {
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1146:2: (iv_ruleAssertion= ruleAssertion EOF )
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1147:2: iv_ruleAssertion= ruleAssertion EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAssertionRule()); 
            }
            pushFollow(FOLLOW_ruleAssertion_in_entryRuleAssertion2397);
            iv_ruleAssertion=ruleAssertion();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAssertion; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAssertion2407); if (state.failed) return current;

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
    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1154:1: ruleAssertion returns [EObject current=null] : (otherlv_0= 'assert' ( (lv_expr_1_0= ruleExpr ) ) otherlv_2= ';' ) ;
    public final EObject ruleAssertion() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_expr_1_0 = null;


         enterRule(); 
            
        try {
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1157:28: ( (otherlv_0= 'assert' ( (lv_expr_1_0= ruleExpr ) ) otherlv_2= ';' ) )
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1158:1: (otherlv_0= 'assert' ( (lv_expr_1_0= ruleExpr ) ) otherlv_2= ';' )
            {
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1158:1: (otherlv_0= 'assert' ( (lv_expr_1_0= ruleExpr ) ) otherlv_2= ';' )
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1158:3: otherlv_0= 'assert' ( (lv_expr_1_0= ruleExpr ) ) otherlv_2= ';'
            {
            otherlv_0=(Token)match(input,38,FOLLOW_38_in_ruleAssertion2444); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getAssertionAccess().getAssertKeyword_0());
                  
            }
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1162:1: ( (lv_expr_1_0= ruleExpr ) )
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1163:1: (lv_expr_1_0= ruleExpr )
            {
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1163:1: (lv_expr_1_0= ruleExpr )
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1164:3: lv_expr_1_0= ruleExpr
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getAssertionAccess().getExprExprParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleExpr_in_ruleAssertion2465);
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

            otherlv_2=(Token)match(input,14,FOLLOW_14_in_ruleAssertion2477); if (state.failed) return current;
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
    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1192:1: entryRuleExpr returns [EObject current=null] : iv_ruleExpr= ruleExpr EOF ;
    public final EObject entryRuleExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpr = null;


        try {
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1193:2: (iv_ruleExpr= ruleExpr EOF )
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1194:2: iv_ruleExpr= ruleExpr EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExprRule()); 
            }
            pushFollow(FOLLOW_ruleExpr_in_entryRuleExpr2513);
            iv_ruleExpr=ruleExpr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExpr; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleExpr2523); if (state.failed) return current;

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
    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1201:1: ruleExpr returns [EObject current=null] : this_ArrowExpr_0= ruleArrowExpr ;
    public final EObject ruleExpr() throws RecognitionException {
        EObject current = null;

        EObject this_ArrowExpr_0 = null;


         enterRule(); 
            
        try {
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1204:28: (this_ArrowExpr_0= ruleArrowExpr )
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1206:5: this_ArrowExpr_0= ruleArrowExpr
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getExprAccess().getArrowExprParserRuleCall()); 
                  
            }
            pushFollow(FOLLOW_ruleArrowExpr_in_ruleExpr2569);
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
    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1222:1: entryRuleArrowExpr returns [EObject current=null] : iv_ruleArrowExpr= ruleArrowExpr EOF ;
    public final EObject entryRuleArrowExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArrowExpr = null;


        try {
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1223:2: (iv_ruleArrowExpr= ruleArrowExpr EOF )
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1224:2: iv_ruleArrowExpr= ruleArrowExpr EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getArrowExprRule()); 
            }
            pushFollow(FOLLOW_ruleArrowExpr_in_entryRuleArrowExpr2603);
            iv_ruleArrowExpr=ruleArrowExpr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleArrowExpr; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleArrowExpr2613); if (state.failed) return current;

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
    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1231:1: ruleArrowExpr returns [EObject current=null] : (this_ImpliesExpr_0= ruleImpliesExpr ( ( ( () ( ( '->' ) ) ( ( ruleArrowExpr ) ) ) )=> ( () ( (lv_op_2_0= '->' ) ) ( (lv_right_3_0= ruleArrowExpr ) ) ) )? ) ;
    public final EObject ruleArrowExpr() throws RecognitionException {
        EObject current = null;

        Token lv_op_2_0=null;
        EObject this_ImpliesExpr_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1234:28: ( (this_ImpliesExpr_0= ruleImpliesExpr ( ( ( () ( ( '->' ) ) ( ( ruleArrowExpr ) ) ) )=> ( () ( (lv_op_2_0= '->' ) ) ( (lv_right_3_0= ruleArrowExpr ) ) ) )? ) )
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1235:1: (this_ImpliesExpr_0= ruleImpliesExpr ( ( ( () ( ( '->' ) ) ( ( ruleArrowExpr ) ) ) )=> ( () ( (lv_op_2_0= '->' ) ) ( (lv_right_3_0= ruleArrowExpr ) ) ) )? )
            {
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1235:1: (this_ImpliesExpr_0= ruleImpliesExpr ( ( ( () ( ( '->' ) ) ( ( ruleArrowExpr ) ) ) )=> ( () ( (lv_op_2_0= '->' ) ) ( (lv_right_3_0= ruleArrowExpr ) ) ) )? )
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1236:5: this_ImpliesExpr_0= ruleImpliesExpr ( ( ( () ( ( '->' ) ) ( ( ruleArrowExpr ) ) ) )=> ( () ( (lv_op_2_0= '->' ) ) ( (lv_right_3_0= ruleArrowExpr ) ) ) )?
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getArrowExprAccess().getImpliesExprParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleImpliesExpr_in_ruleArrowExpr2660);
            this_ImpliesExpr_0=ruleImpliesExpr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_ImpliesExpr_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1244:1: ( ( ( () ( ( '->' ) ) ( ( ruleArrowExpr ) ) ) )=> ( () ( (lv_op_2_0= '->' ) ) ( (lv_right_3_0= ruleArrowExpr ) ) ) )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==39) ) {
                int LA18_1 = input.LA(2);

                if ( (synpred1_InternalJKind()) ) {
                    alt18=1;
                }
            }
            switch (alt18) {
                case 1 :
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1244:2: ( ( () ( ( '->' ) ) ( ( ruleArrowExpr ) ) ) )=> ( () ( (lv_op_2_0= '->' ) ) ( (lv_right_3_0= ruleArrowExpr ) ) )
                    {
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1255:6: ( () ( (lv_op_2_0= '->' ) ) ( (lv_right_3_0= ruleArrowExpr ) ) )
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1255:7: () ( (lv_op_2_0= '->' ) ) ( (lv_right_3_0= ruleArrowExpr ) )
                    {
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1255:7: ()
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1256:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElementAndSet(
                                  grammarAccess.getArrowExprAccess().getBinaryExprLeftAction_1_0_0(),
                                  current);
                          
                    }

                    }

                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1261:2: ( (lv_op_2_0= '->' ) )
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1262:1: (lv_op_2_0= '->' )
                    {
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1262:1: (lv_op_2_0= '->' )
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1263:3: lv_op_2_0= '->'
                    {
                    lv_op_2_0=(Token)match(input,39,FOLLOW_39_in_ruleArrowExpr2719); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_op_2_0, grammarAccess.getArrowExprAccess().getOpHyphenMinusGreaterThanSignKeyword_1_0_1_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getArrowExprRule());
                      	        }
                             		setWithLastConsumed(current, "op", lv_op_2_0, "->");
                      	    
                    }

                    }


                    }

                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1276:2: ( (lv_right_3_0= ruleArrowExpr ) )
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1277:1: (lv_right_3_0= ruleArrowExpr )
                    {
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1277:1: (lv_right_3_0= ruleArrowExpr )
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1278:3: lv_right_3_0= ruleArrowExpr
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getArrowExprAccess().getRightArrowExprParserRuleCall_1_0_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleArrowExpr_in_ruleArrowExpr2753);
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
    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1302:1: entryRuleImpliesExpr returns [EObject current=null] : iv_ruleImpliesExpr= ruleImpliesExpr EOF ;
    public final EObject entryRuleImpliesExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImpliesExpr = null;


        try {
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1303:2: (iv_ruleImpliesExpr= ruleImpliesExpr EOF )
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1304:2: iv_ruleImpliesExpr= ruleImpliesExpr EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getImpliesExprRule()); 
            }
            pushFollow(FOLLOW_ruleImpliesExpr_in_entryRuleImpliesExpr2792);
            iv_ruleImpliesExpr=ruleImpliesExpr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleImpliesExpr; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleImpliesExpr2802); if (state.failed) return current;

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
    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1311:1: ruleImpliesExpr returns [EObject current=null] : (this_OrExpr_0= ruleOrExpr ( ( ( () ( ( '=>' ) ) ( ( ruleImpliesExpr ) ) ) )=> ( () ( (lv_op_2_0= '=>' ) ) ( (lv_right_3_0= ruleImpliesExpr ) ) ) )? ) ;
    public final EObject ruleImpliesExpr() throws RecognitionException {
        EObject current = null;

        Token lv_op_2_0=null;
        EObject this_OrExpr_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1314:28: ( (this_OrExpr_0= ruleOrExpr ( ( ( () ( ( '=>' ) ) ( ( ruleImpliesExpr ) ) ) )=> ( () ( (lv_op_2_0= '=>' ) ) ( (lv_right_3_0= ruleImpliesExpr ) ) ) )? ) )
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1315:1: (this_OrExpr_0= ruleOrExpr ( ( ( () ( ( '=>' ) ) ( ( ruleImpliesExpr ) ) ) )=> ( () ( (lv_op_2_0= '=>' ) ) ( (lv_right_3_0= ruleImpliesExpr ) ) ) )? )
            {
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1315:1: (this_OrExpr_0= ruleOrExpr ( ( ( () ( ( '=>' ) ) ( ( ruleImpliesExpr ) ) ) )=> ( () ( (lv_op_2_0= '=>' ) ) ( (lv_right_3_0= ruleImpliesExpr ) ) ) )? )
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1316:5: this_OrExpr_0= ruleOrExpr ( ( ( () ( ( '=>' ) ) ( ( ruleImpliesExpr ) ) ) )=> ( () ( (lv_op_2_0= '=>' ) ) ( (lv_right_3_0= ruleImpliesExpr ) ) ) )?
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getImpliesExprAccess().getOrExprParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleOrExpr_in_ruleImpliesExpr2849);
            this_OrExpr_0=ruleOrExpr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_OrExpr_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1324:1: ( ( ( () ( ( '=>' ) ) ( ( ruleImpliesExpr ) ) ) )=> ( () ( (lv_op_2_0= '=>' ) ) ( (lv_right_3_0= ruleImpliesExpr ) ) ) )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==40) ) {
                int LA19_1 = input.LA(2);

                if ( (synpred2_InternalJKind()) ) {
                    alt19=1;
                }
            }
            switch (alt19) {
                case 1 :
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1324:2: ( ( () ( ( '=>' ) ) ( ( ruleImpliesExpr ) ) ) )=> ( () ( (lv_op_2_0= '=>' ) ) ( (lv_right_3_0= ruleImpliesExpr ) ) )
                    {
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1335:6: ( () ( (lv_op_2_0= '=>' ) ) ( (lv_right_3_0= ruleImpliesExpr ) ) )
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1335:7: () ( (lv_op_2_0= '=>' ) ) ( (lv_right_3_0= ruleImpliesExpr ) )
                    {
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1335:7: ()
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1336:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElementAndSet(
                                  grammarAccess.getImpliesExprAccess().getBinaryExprLeftAction_1_0_0(),
                                  current);
                          
                    }

                    }

                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1341:2: ( (lv_op_2_0= '=>' ) )
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1342:1: (lv_op_2_0= '=>' )
                    {
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1342:1: (lv_op_2_0= '=>' )
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1343:3: lv_op_2_0= '=>'
                    {
                    lv_op_2_0=(Token)match(input,40,FOLLOW_40_in_ruleImpliesExpr2908); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_op_2_0, grammarAccess.getImpliesExprAccess().getOpEqualsSignGreaterThanSignKeyword_1_0_1_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getImpliesExprRule());
                      	        }
                             		setWithLastConsumed(current, "op", lv_op_2_0, "=>");
                      	    
                    }

                    }


                    }

                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1356:2: ( (lv_right_3_0= ruleImpliesExpr ) )
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1357:1: (lv_right_3_0= ruleImpliesExpr )
                    {
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1357:1: (lv_right_3_0= ruleImpliesExpr )
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1358:3: lv_right_3_0= ruleImpliesExpr
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getImpliesExprAccess().getRightImpliesExprParserRuleCall_1_0_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleImpliesExpr_in_ruleImpliesExpr2942);
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
    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1382:1: entryRuleOrExpr returns [EObject current=null] : iv_ruleOrExpr= ruleOrExpr EOF ;
    public final EObject entryRuleOrExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOrExpr = null;


        try {
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1383:2: (iv_ruleOrExpr= ruleOrExpr EOF )
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1384:2: iv_ruleOrExpr= ruleOrExpr EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOrExprRule()); 
            }
            pushFollow(FOLLOW_ruleOrExpr_in_entryRuleOrExpr2981);
            iv_ruleOrExpr=ruleOrExpr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOrExpr; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOrExpr2991); if (state.failed) return current;

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
    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1391:1: ruleOrExpr returns [EObject current=null] : (this_AndExpr_0= ruleAndExpr ( ( ( () ( ( ( 'or' | 'xor' ) ) ) ( ( ruleAndExpr ) ) ) )=> ( () ( ( (lv_op_2_1= 'or' | lv_op_2_2= 'xor' ) ) ) ( (lv_right_3_0= ruleAndExpr ) ) ) )* ) ;
    public final EObject ruleOrExpr() throws RecognitionException {
        EObject current = null;

        Token lv_op_2_1=null;
        Token lv_op_2_2=null;
        EObject this_AndExpr_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1394:28: ( (this_AndExpr_0= ruleAndExpr ( ( ( () ( ( ( 'or' | 'xor' ) ) ) ( ( ruleAndExpr ) ) ) )=> ( () ( ( (lv_op_2_1= 'or' | lv_op_2_2= 'xor' ) ) ) ( (lv_right_3_0= ruleAndExpr ) ) ) )* ) )
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1395:1: (this_AndExpr_0= ruleAndExpr ( ( ( () ( ( ( 'or' | 'xor' ) ) ) ( ( ruleAndExpr ) ) ) )=> ( () ( ( (lv_op_2_1= 'or' | lv_op_2_2= 'xor' ) ) ) ( (lv_right_3_0= ruleAndExpr ) ) ) )* )
            {
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1395:1: (this_AndExpr_0= ruleAndExpr ( ( ( () ( ( ( 'or' | 'xor' ) ) ) ( ( ruleAndExpr ) ) ) )=> ( () ( ( (lv_op_2_1= 'or' | lv_op_2_2= 'xor' ) ) ) ( (lv_right_3_0= ruleAndExpr ) ) ) )* )
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1396:5: this_AndExpr_0= ruleAndExpr ( ( ( () ( ( ( 'or' | 'xor' ) ) ) ( ( ruleAndExpr ) ) ) )=> ( () ( ( (lv_op_2_1= 'or' | lv_op_2_2= 'xor' ) ) ) ( (lv_right_3_0= ruleAndExpr ) ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getOrExprAccess().getAndExprParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleAndExpr_in_ruleOrExpr3038);
            this_AndExpr_0=ruleAndExpr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_AndExpr_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1404:1: ( ( ( () ( ( ( 'or' | 'xor' ) ) ) ( ( ruleAndExpr ) ) ) )=> ( () ( ( (lv_op_2_1= 'or' | lv_op_2_2= 'xor' ) ) ) ( (lv_right_3_0= ruleAndExpr ) ) ) )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==41) ) {
                    int LA21_2 = input.LA(2);

                    if ( (synpred3_InternalJKind()) ) {
                        alt21=1;
                    }


                }
                else if ( (LA21_0==42) ) {
                    int LA21_3 = input.LA(2);

                    if ( (synpred3_InternalJKind()) ) {
                        alt21=1;
                    }


                }


                switch (alt21) {
            	case 1 :
            	    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1404:2: ( ( () ( ( ( 'or' | 'xor' ) ) ) ( ( ruleAndExpr ) ) ) )=> ( () ( ( (lv_op_2_1= 'or' | lv_op_2_2= 'xor' ) ) ) ( (lv_right_3_0= ruleAndExpr ) ) )
            	    {
            	    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1421:6: ( () ( ( (lv_op_2_1= 'or' | lv_op_2_2= 'xor' ) ) ) ( (lv_right_3_0= ruleAndExpr ) ) )
            	    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1421:7: () ( ( (lv_op_2_1= 'or' | lv_op_2_2= 'xor' ) ) ) ( (lv_right_3_0= ruleAndExpr ) )
            	    {
            	    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1421:7: ()
            	    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1422:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getOrExprAccess().getBinaryExprLeftAction_1_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1427:2: ( ( (lv_op_2_1= 'or' | lv_op_2_2= 'xor' ) ) )
            	    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1428:1: ( (lv_op_2_1= 'or' | lv_op_2_2= 'xor' ) )
            	    {
            	    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1428:1: ( (lv_op_2_1= 'or' | lv_op_2_2= 'xor' ) )
            	    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1429:1: (lv_op_2_1= 'or' | lv_op_2_2= 'xor' )
            	    {
            	    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1429:1: (lv_op_2_1= 'or' | lv_op_2_2= 'xor' )
            	    int alt20=2;
            	    int LA20_0 = input.LA(1);

            	    if ( (LA20_0==41) ) {
            	        alt20=1;
            	    }
            	    else if ( (LA20_0==42) ) {
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
            	            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1430:3: lv_op_2_1= 'or'
            	            {
            	            lv_op_2_1=(Token)match(input,41,FOLLOW_41_in_ruleOrExpr3118); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                      newLeafNode(lv_op_2_1, grammarAccess.getOrExprAccess().getOpOrKeyword_1_0_1_0_0());
            	                  
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
            	            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1442:8: lv_op_2_2= 'xor'
            	            {
            	            lv_op_2_2=(Token)match(input,42,FOLLOW_42_in_ruleOrExpr3147); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                      newLeafNode(lv_op_2_2, grammarAccess.getOrExprAccess().getOpXorKeyword_1_0_1_0_1());
            	                  
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

            	    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1457:2: ( (lv_right_3_0= ruleAndExpr ) )
            	    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1458:1: (lv_right_3_0= ruleAndExpr )
            	    {
            	    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1458:1: (lv_right_3_0= ruleAndExpr )
            	    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1459:3: lv_right_3_0= ruleAndExpr
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getOrExprAccess().getRightAndExprParserRuleCall_1_0_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleAndExpr_in_ruleOrExpr3184);
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
    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1483:1: entryRuleAndExpr returns [EObject current=null] : iv_ruleAndExpr= ruleAndExpr EOF ;
    public final EObject entryRuleAndExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAndExpr = null;


        try {
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1484:2: (iv_ruleAndExpr= ruleAndExpr EOF )
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1485:2: iv_ruleAndExpr= ruleAndExpr EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAndExprRule()); 
            }
            pushFollow(FOLLOW_ruleAndExpr_in_entryRuleAndExpr3223);
            iv_ruleAndExpr=ruleAndExpr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAndExpr; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAndExpr3233); if (state.failed) return current;

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
    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1492:1: ruleAndExpr returns [EObject current=null] : (this_RelationalExpr_0= ruleRelationalExpr ( ( ( () ( ( 'and' ) ) ( ( ruleRelationalExpr ) ) ) )=> ( () ( (lv_op_2_0= 'and' ) ) ( (lv_right_3_0= ruleRelationalExpr ) ) ) )* ) ;
    public final EObject ruleAndExpr() throws RecognitionException {
        EObject current = null;

        Token lv_op_2_0=null;
        EObject this_RelationalExpr_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1495:28: ( (this_RelationalExpr_0= ruleRelationalExpr ( ( ( () ( ( 'and' ) ) ( ( ruleRelationalExpr ) ) ) )=> ( () ( (lv_op_2_0= 'and' ) ) ( (lv_right_3_0= ruleRelationalExpr ) ) ) )* ) )
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1496:1: (this_RelationalExpr_0= ruleRelationalExpr ( ( ( () ( ( 'and' ) ) ( ( ruleRelationalExpr ) ) ) )=> ( () ( (lv_op_2_0= 'and' ) ) ( (lv_right_3_0= ruleRelationalExpr ) ) ) )* )
            {
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1496:1: (this_RelationalExpr_0= ruleRelationalExpr ( ( ( () ( ( 'and' ) ) ( ( ruleRelationalExpr ) ) ) )=> ( () ( (lv_op_2_0= 'and' ) ) ( (lv_right_3_0= ruleRelationalExpr ) ) ) )* )
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1497:5: this_RelationalExpr_0= ruleRelationalExpr ( ( ( () ( ( 'and' ) ) ( ( ruleRelationalExpr ) ) ) )=> ( () ( (lv_op_2_0= 'and' ) ) ( (lv_right_3_0= ruleRelationalExpr ) ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getAndExprAccess().getRelationalExprParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleRelationalExpr_in_ruleAndExpr3280);
            this_RelationalExpr_0=ruleRelationalExpr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_RelationalExpr_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1505:1: ( ( ( () ( ( 'and' ) ) ( ( ruleRelationalExpr ) ) ) )=> ( () ( (lv_op_2_0= 'and' ) ) ( (lv_right_3_0= ruleRelationalExpr ) ) ) )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==43) ) {
                    int LA22_2 = input.LA(2);

                    if ( (synpred4_InternalJKind()) ) {
                        alt22=1;
                    }


                }


                switch (alt22) {
            	case 1 :
            	    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1505:2: ( ( () ( ( 'and' ) ) ( ( ruleRelationalExpr ) ) ) )=> ( () ( (lv_op_2_0= 'and' ) ) ( (lv_right_3_0= ruleRelationalExpr ) ) )
            	    {
            	    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1516:6: ( () ( (lv_op_2_0= 'and' ) ) ( (lv_right_3_0= ruleRelationalExpr ) ) )
            	    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1516:7: () ( (lv_op_2_0= 'and' ) ) ( (lv_right_3_0= ruleRelationalExpr ) )
            	    {
            	    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1516:7: ()
            	    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1517:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getAndExprAccess().getBinaryExprLeftAction_1_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1522:2: ( (lv_op_2_0= 'and' ) )
            	    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1523:1: (lv_op_2_0= 'and' )
            	    {
            	    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1523:1: (lv_op_2_0= 'and' )
            	    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1524:3: lv_op_2_0= 'and'
            	    {
            	    lv_op_2_0=(Token)match(input,43,FOLLOW_43_in_ruleAndExpr3339); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	              newLeafNode(lv_op_2_0, grammarAccess.getAndExprAccess().getOpAndKeyword_1_0_1_0());
            	          
            	    }
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElement(grammarAccess.getAndExprRule());
            	      	        }
            	             		setWithLastConsumed(current, "op", lv_op_2_0, "and");
            	      	    
            	    }

            	    }


            	    }

            	    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1537:2: ( (lv_right_3_0= ruleRelationalExpr ) )
            	    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1538:1: (lv_right_3_0= ruleRelationalExpr )
            	    {
            	    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1538:1: (lv_right_3_0= ruleRelationalExpr )
            	    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1539:3: lv_right_3_0= ruleRelationalExpr
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getAndExprAccess().getRightRelationalExprParserRuleCall_1_0_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleRelationalExpr_in_ruleAndExpr3373);
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
    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1563:1: entryRuleRelationalExpr returns [EObject current=null] : iv_ruleRelationalExpr= ruleRelationalExpr EOF ;
    public final EObject entryRuleRelationalExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRelationalExpr = null;


        try {
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1564:2: (iv_ruleRelationalExpr= ruleRelationalExpr EOF )
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1565:2: iv_ruleRelationalExpr= ruleRelationalExpr EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getRelationalExprRule()); 
            }
            pushFollow(FOLLOW_ruleRelationalExpr_in_entryRuleRelationalExpr3412);
            iv_ruleRelationalExpr=ruleRelationalExpr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleRelationalExpr; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleRelationalExpr3422); if (state.failed) return current;

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
    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1572:1: ruleRelationalExpr returns [EObject current=null] : (this_PlusExpr_0= rulePlusExpr ( ( ( () ( ( ( '<' | '<=' | '>' | '>=' | '=' | '<>' ) ) ) ( ( rulePlusExpr ) ) ) )=> ( () ( ( (lv_op_2_1= '<' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '>=' | lv_op_2_5= '=' | lv_op_2_6= '<>' ) ) ) ( (lv_right_3_0= rulePlusExpr ) ) ) )? ) ;
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
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1575:28: ( (this_PlusExpr_0= rulePlusExpr ( ( ( () ( ( ( '<' | '<=' | '>' | '>=' | '=' | '<>' ) ) ) ( ( rulePlusExpr ) ) ) )=> ( () ( ( (lv_op_2_1= '<' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '>=' | lv_op_2_5= '=' | lv_op_2_6= '<>' ) ) ) ( (lv_right_3_0= rulePlusExpr ) ) ) )? ) )
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1576:1: (this_PlusExpr_0= rulePlusExpr ( ( ( () ( ( ( '<' | '<=' | '>' | '>=' | '=' | '<>' ) ) ) ( ( rulePlusExpr ) ) ) )=> ( () ( ( (lv_op_2_1= '<' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '>=' | lv_op_2_5= '=' | lv_op_2_6= '<>' ) ) ) ( (lv_right_3_0= rulePlusExpr ) ) ) )? )
            {
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1576:1: (this_PlusExpr_0= rulePlusExpr ( ( ( () ( ( ( '<' | '<=' | '>' | '>=' | '=' | '<>' ) ) ) ( ( rulePlusExpr ) ) ) )=> ( () ( ( (lv_op_2_1= '<' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '>=' | lv_op_2_5= '=' | lv_op_2_6= '<>' ) ) ) ( (lv_right_3_0= rulePlusExpr ) ) ) )? )
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1577:5: this_PlusExpr_0= rulePlusExpr ( ( ( () ( ( ( '<' | '<=' | '>' | '>=' | '=' | '<>' ) ) ) ( ( rulePlusExpr ) ) ) )=> ( () ( ( (lv_op_2_1= '<' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '>=' | lv_op_2_5= '=' | lv_op_2_6= '<>' ) ) ) ( (lv_right_3_0= rulePlusExpr ) ) ) )?
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getRelationalExprAccess().getPlusExprParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_rulePlusExpr_in_ruleRelationalExpr3469);
            this_PlusExpr_0=rulePlusExpr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_PlusExpr_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1585:1: ( ( ( () ( ( ( '<' | '<=' | '>' | '>=' | '=' | '<>' ) ) ) ( ( rulePlusExpr ) ) ) )=> ( () ( ( (lv_op_2_1= '<' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '>=' | lv_op_2_5= '=' | lv_op_2_6= '<>' ) ) ) ( (lv_right_3_0= rulePlusExpr ) ) ) )?
            int alt24=2;
            switch ( input.LA(1) ) {
                case 44:
                    {
                    int LA24_1 = input.LA(2);

                    if ( (synpred5_InternalJKind()) ) {
                        alt24=1;
                    }
                    }
                    break;
                case 45:
                    {
                    int LA24_2 = input.LA(2);

                    if ( (synpred5_InternalJKind()) ) {
                        alt24=1;
                    }
                    }
                    break;
                case 46:
                    {
                    int LA24_3 = input.LA(2);

                    if ( (synpred5_InternalJKind()) ) {
                        alt24=1;
                    }
                    }
                    break;
                case 47:
                    {
                    int LA24_4 = input.LA(2);

                    if ( (synpred5_InternalJKind()) ) {
                        alt24=1;
                    }
                    }
                    break;
                case 13:
                    {
                    int LA24_5 = input.LA(2);

                    if ( (synpred5_InternalJKind()) ) {
                        alt24=1;
                    }
                    }
                    break;
                case 48:
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
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1585:2: ( ( () ( ( ( '<' | '<=' | '>' | '>=' | '=' | '<>' ) ) ) ( ( rulePlusExpr ) ) ) )=> ( () ( ( (lv_op_2_1= '<' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '>=' | lv_op_2_5= '=' | lv_op_2_6= '<>' ) ) ) ( (lv_right_3_0= rulePlusExpr ) ) )
                    {
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1614:6: ( () ( ( (lv_op_2_1= '<' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '>=' | lv_op_2_5= '=' | lv_op_2_6= '<>' ) ) ) ( (lv_right_3_0= rulePlusExpr ) ) )
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1614:7: () ( ( (lv_op_2_1= '<' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '>=' | lv_op_2_5= '=' | lv_op_2_6= '<>' ) ) ) ( (lv_right_3_0= rulePlusExpr ) )
                    {
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1614:7: ()
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1615:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElementAndSet(
                                  grammarAccess.getRelationalExprAccess().getBinaryExprLeftAction_1_0_0(),
                                  current);
                          
                    }

                    }

                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1620:2: ( ( (lv_op_2_1= '<' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '>=' | lv_op_2_5= '=' | lv_op_2_6= '<>' ) ) )
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1621:1: ( (lv_op_2_1= '<' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '>=' | lv_op_2_5= '=' | lv_op_2_6= '<>' ) )
                    {
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1621:1: ( (lv_op_2_1= '<' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '>=' | lv_op_2_5= '=' | lv_op_2_6= '<>' ) )
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1622:1: (lv_op_2_1= '<' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '>=' | lv_op_2_5= '=' | lv_op_2_6= '<>' )
                    {
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1622:1: (lv_op_2_1= '<' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '>=' | lv_op_2_5= '=' | lv_op_2_6= '<>' )
                    int alt23=6;
                    switch ( input.LA(1) ) {
                    case 44:
                        {
                        alt23=1;
                        }
                        break;
                    case 45:
                        {
                        alt23=2;
                        }
                        break;
                    case 46:
                        {
                        alt23=3;
                        }
                        break;
                    case 47:
                        {
                        alt23=4;
                        }
                        break;
                    case 13:
                        {
                        alt23=5;
                        }
                        break;
                    case 48:
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
                            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1623:3: lv_op_2_1= '<'
                            {
                            lv_op_2_1=(Token)match(input,44,FOLLOW_44_in_ruleRelationalExpr3605); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                      newLeafNode(lv_op_2_1, grammarAccess.getRelationalExprAccess().getOpLessThanSignKeyword_1_0_1_0_0());
                                  
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
                            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1635:8: lv_op_2_2= '<='
                            {
                            lv_op_2_2=(Token)match(input,45,FOLLOW_45_in_ruleRelationalExpr3634); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                      newLeafNode(lv_op_2_2, grammarAccess.getRelationalExprAccess().getOpLessThanSignEqualsSignKeyword_1_0_1_0_1());
                                  
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
                            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1647:8: lv_op_2_3= '>'
                            {
                            lv_op_2_3=(Token)match(input,46,FOLLOW_46_in_ruleRelationalExpr3663); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                      newLeafNode(lv_op_2_3, grammarAccess.getRelationalExprAccess().getOpGreaterThanSignKeyword_1_0_1_0_2());
                                  
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
                            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1659:8: lv_op_2_4= '>='
                            {
                            lv_op_2_4=(Token)match(input,47,FOLLOW_47_in_ruleRelationalExpr3692); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                      newLeafNode(lv_op_2_4, grammarAccess.getRelationalExprAccess().getOpGreaterThanSignEqualsSignKeyword_1_0_1_0_3());
                                  
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
                            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1671:8: lv_op_2_5= '='
                            {
                            lv_op_2_5=(Token)match(input,13,FOLLOW_13_in_ruleRelationalExpr3721); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                      newLeafNode(lv_op_2_5, grammarAccess.getRelationalExprAccess().getOpEqualsSignKeyword_1_0_1_0_4());
                                  
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
                            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1683:8: lv_op_2_6= '<>'
                            {
                            lv_op_2_6=(Token)match(input,48,FOLLOW_48_in_ruleRelationalExpr3750); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                      newLeafNode(lv_op_2_6, grammarAccess.getRelationalExprAccess().getOpLessThanSignGreaterThanSignKeyword_1_0_1_0_5());
                                  
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

                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1698:2: ( (lv_right_3_0= rulePlusExpr ) )
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1699:1: (lv_right_3_0= rulePlusExpr )
                    {
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1699:1: (lv_right_3_0= rulePlusExpr )
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1700:3: lv_right_3_0= rulePlusExpr
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getRelationalExprAccess().getRightPlusExprParserRuleCall_1_0_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_rulePlusExpr_in_ruleRelationalExpr3787);
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
    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1724:1: entryRulePlusExpr returns [EObject current=null] : iv_rulePlusExpr= rulePlusExpr EOF ;
    public final EObject entryRulePlusExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePlusExpr = null;


        try {
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1725:2: (iv_rulePlusExpr= rulePlusExpr EOF )
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1726:2: iv_rulePlusExpr= rulePlusExpr EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPlusExprRule()); 
            }
            pushFollow(FOLLOW_rulePlusExpr_in_entryRulePlusExpr3826);
            iv_rulePlusExpr=rulePlusExpr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePlusExpr; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulePlusExpr3836); if (state.failed) return current;

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
    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1733:1: rulePlusExpr returns [EObject current=null] : (this_TimesExpr_0= ruleTimesExpr ( ( ( () ( ( ( '+' | '-' ) ) ) ( ( ruleTimesExpr ) ) ) )=> ( () ( ( (lv_op_2_1= '+' | lv_op_2_2= '-' ) ) ) ( (lv_right_3_0= ruleTimesExpr ) ) ) )* ) ;
    public final EObject rulePlusExpr() throws RecognitionException {
        EObject current = null;

        Token lv_op_2_1=null;
        Token lv_op_2_2=null;
        EObject this_TimesExpr_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1736:28: ( (this_TimesExpr_0= ruleTimesExpr ( ( ( () ( ( ( '+' | '-' ) ) ) ( ( ruleTimesExpr ) ) ) )=> ( () ( ( (lv_op_2_1= '+' | lv_op_2_2= '-' ) ) ) ( (lv_right_3_0= ruleTimesExpr ) ) ) )* ) )
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1737:1: (this_TimesExpr_0= ruleTimesExpr ( ( ( () ( ( ( '+' | '-' ) ) ) ( ( ruleTimesExpr ) ) ) )=> ( () ( ( (lv_op_2_1= '+' | lv_op_2_2= '-' ) ) ) ( (lv_right_3_0= ruleTimesExpr ) ) ) )* )
            {
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1737:1: (this_TimesExpr_0= ruleTimesExpr ( ( ( () ( ( ( '+' | '-' ) ) ) ( ( ruleTimesExpr ) ) ) )=> ( () ( ( (lv_op_2_1= '+' | lv_op_2_2= '-' ) ) ) ( (lv_right_3_0= ruleTimesExpr ) ) ) )* )
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1738:5: this_TimesExpr_0= ruleTimesExpr ( ( ( () ( ( ( '+' | '-' ) ) ) ( ( ruleTimesExpr ) ) ) )=> ( () ( ( (lv_op_2_1= '+' | lv_op_2_2= '-' ) ) ) ( (lv_right_3_0= ruleTimesExpr ) ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getPlusExprAccess().getTimesExprParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleTimesExpr_in_rulePlusExpr3883);
            this_TimesExpr_0=ruleTimesExpr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_TimesExpr_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1746:1: ( ( ( () ( ( ( '+' | '-' ) ) ) ( ( ruleTimesExpr ) ) ) )=> ( () ( ( (lv_op_2_1= '+' | lv_op_2_2= '-' ) ) ) ( (lv_right_3_0= ruleTimesExpr ) ) ) )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==49) ) {
                    int LA26_2 = input.LA(2);

                    if ( (synpred6_InternalJKind()) ) {
                        alt26=1;
                    }


                }
                else if ( (LA26_0==27) ) {
                    int LA26_3 = input.LA(2);

                    if ( (synpred6_InternalJKind()) ) {
                        alt26=1;
                    }


                }


                switch (alt26) {
            	case 1 :
            	    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1746:2: ( ( () ( ( ( '+' | '-' ) ) ) ( ( ruleTimesExpr ) ) ) )=> ( () ( ( (lv_op_2_1= '+' | lv_op_2_2= '-' ) ) ) ( (lv_right_3_0= ruleTimesExpr ) ) )
            	    {
            	    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1763:6: ( () ( ( (lv_op_2_1= '+' | lv_op_2_2= '-' ) ) ) ( (lv_right_3_0= ruleTimesExpr ) ) )
            	    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1763:7: () ( ( (lv_op_2_1= '+' | lv_op_2_2= '-' ) ) ) ( (lv_right_3_0= ruleTimesExpr ) )
            	    {
            	    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1763:7: ()
            	    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1764:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getPlusExprAccess().getBinaryExprLeftAction_1_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1769:2: ( ( (lv_op_2_1= '+' | lv_op_2_2= '-' ) ) )
            	    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1770:1: ( (lv_op_2_1= '+' | lv_op_2_2= '-' ) )
            	    {
            	    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1770:1: ( (lv_op_2_1= '+' | lv_op_2_2= '-' ) )
            	    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1771:1: (lv_op_2_1= '+' | lv_op_2_2= '-' )
            	    {
            	    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1771:1: (lv_op_2_1= '+' | lv_op_2_2= '-' )
            	    int alt25=2;
            	    int LA25_0 = input.LA(1);

            	    if ( (LA25_0==49) ) {
            	        alt25=1;
            	    }
            	    else if ( (LA25_0==27) ) {
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
            	            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1772:3: lv_op_2_1= '+'
            	            {
            	            lv_op_2_1=(Token)match(input,49,FOLLOW_49_in_rulePlusExpr3963); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                      newLeafNode(lv_op_2_1, grammarAccess.getPlusExprAccess().getOpPlusSignKeyword_1_0_1_0_0());
            	                  
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
            	            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1784:8: lv_op_2_2= '-'
            	            {
            	            lv_op_2_2=(Token)match(input,27,FOLLOW_27_in_rulePlusExpr3992); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                      newLeafNode(lv_op_2_2, grammarAccess.getPlusExprAccess().getOpHyphenMinusKeyword_1_0_1_0_1());
            	                  
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

            	    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1799:2: ( (lv_right_3_0= ruleTimesExpr ) )
            	    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1800:1: (lv_right_3_0= ruleTimesExpr )
            	    {
            	    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1800:1: (lv_right_3_0= ruleTimesExpr )
            	    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1801:3: lv_right_3_0= ruleTimesExpr
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getPlusExprAccess().getRightTimesExprParserRuleCall_1_0_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleTimesExpr_in_rulePlusExpr4029);
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
    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1825:1: entryRuleTimesExpr returns [EObject current=null] : iv_ruleTimesExpr= ruleTimesExpr EOF ;
    public final EObject entryRuleTimesExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTimesExpr = null;


        try {
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1826:2: (iv_ruleTimesExpr= ruleTimesExpr EOF )
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1827:2: iv_ruleTimesExpr= ruleTimesExpr EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTimesExprRule()); 
            }
            pushFollow(FOLLOW_ruleTimesExpr_in_entryRuleTimesExpr4068);
            iv_ruleTimesExpr=ruleTimesExpr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTimesExpr; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleTimesExpr4078); if (state.failed) return current;

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
    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1834:1: ruleTimesExpr returns [EObject current=null] : (this_PrefixExpr_0= rulePrefixExpr ( ( ( () ( ( ( '*' | '/' | 'div' ) ) ) ( ( rulePrefixExpr ) ) ) )=> ( () ( ( (lv_op_2_1= '*' | lv_op_2_2= '/' | lv_op_2_3= 'div' ) ) ) ( (lv_right_3_0= rulePrefixExpr ) ) ) )* ) ;
    public final EObject ruleTimesExpr() throws RecognitionException {
        EObject current = null;

        Token lv_op_2_1=null;
        Token lv_op_2_2=null;
        Token lv_op_2_3=null;
        EObject this_PrefixExpr_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1837:28: ( (this_PrefixExpr_0= rulePrefixExpr ( ( ( () ( ( ( '*' | '/' | 'div' ) ) ) ( ( rulePrefixExpr ) ) ) )=> ( () ( ( (lv_op_2_1= '*' | lv_op_2_2= '/' | lv_op_2_3= 'div' ) ) ) ( (lv_right_3_0= rulePrefixExpr ) ) ) )* ) )
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1838:1: (this_PrefixExpr_0= rulePrefixExpr ( ( ( () ( ( ( '*' | '/' | 'div' ) ) ) ( ( rulePrefixExpr ) ) ) )=> ( () ( ( (lv_op_2_1= '*' | lv_op_2_2= '/' | lv_op_2_3= 'div' ) ) ) ( (lv_right_3_0= rulePrefixExpr ) ) ) )* )
            {
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1838:1: (this_PrefixExpr_0= rulePrefixExpr ( ( ( () ( ( ( '*' | '/' | 'div' ) ) ) ( ( rulePrefixExpr ) ) ) )=> ( () ( ( (lv_op_2_1= '*' | lv_op_2_2= '/' | lv_op_2_3= 'div' ) ) ) ( (lv_right_3_0= rulePrefixExpr ) ) ) )* )
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1839:5: this_PrefixExpr_0= rulePrefixExpr ( ( ( () ( ( ( '*' | '/' | 'div' ) ) ) ( ( rulePrefixExpr ) ) ) )=> ( () ( ( (lv_op_2_1= '*' | lv_op_2_2= '/' | lv_op_2_3= 'div' ) ) ) ( (lv_right_3_0= rulePrefixExpr ) ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getTimesExprAccess().getPrefixExprParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_rulePrefixExpr_in_ruleTimesExpr4125);
            this_PrefixExpr_0=rulePrefixExpr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_PrefixExpr_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1847:1: ( ( ( () ( ( ( '*' | '/' | 'div' ) ) ) ( ( rulePrefixExpr ) ) ) )=> ( () ( ( (lv_op_2_1= '*' | lv_op_2_2= '/' | lv_op_2_3= 'div' ) ) ) ( (lv_right_3_0= rulePrefixExpr ) ) ) )*
            loop28:
            do {
                int alt28=2;
                switch ( input.LA(1) ) {
                case 50:
                    {
                    int LA28_2 = input.LA(2);

                    if ( (synpred7_InternalJKind()) ) {
                        alt28=1;
                    }


                    }
                    break;
                case 51:
                    {
                    int LA28_3 = input.LA(2);

                    if ( (synpred7_InternalJKind()) ) {
                        alt28=1;
                    }


                    }
                    break;
                case 52:
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
            	    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1847:2: ( ( () ( ( ( '*' | '/' | 'div' ) ) ) ( ( rulePrefixExpr ) ) ) )=> ( () ( ( (lv_op_2_1= '*' | lv_op_2_2= '/' | lv_op_2_3= 'div' ) ) ) ( (lv_right_3_0= rulePrefixExpr ) ) )
            	    {
            	    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1867:6: ( () ( ( (lv_op_2_1= '*' | lv_op_2_2= '/' | lv_op_2_3= 'div' ) ) ) ( (lv_right_3_0= rulePrefixExpr ) ) )
            	    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1867:7: () ( ( (lv_op_2_1= '*' | lv_op_2_2= '/' | lv_op_2_3= 'div' ) ) ) ( (lv_right_3_0= rulePrefixExpr ) )
            	    {
            	    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1867:7: ()
            	    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1868:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getTimesExprAccess().getBinaryExprLeftAction_1_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1873:2: ( ( (lv_op_2_1= '*' | lv_op_2_2= '/' | lv_op_2_3= 'div' ) ) )
            	    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1874:1: ( (lv_op_2_1= '*' | lv_op_2_2= '/' | lv_op_2_3= 'div' ) )
            	    {
            	    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1874:1: ( (lv_op_2_1= '*' | lv_op_2_2= '/' | lv_op_2_3= 'div' ) )
            	    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1875:1: (lv_op_2_1= '*' | lv_op_2_2= '/' | lv_op_2_3= 'div' )
            	    {
            	    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1875:1: (lv_op_2_1= '*' | lv_op_2_2= '/' | lv_op_2_3= 'div' )
            	    int alt27=3;
            	    switch ( input.LA(1) ) {
            	    case 50:
            	        {
            	        alt27=1;
            	        }
            	        break;
            	    case 51:
            	        {
            	        alt27=2;
            	        }
            	        break;
            	    case 52:
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
            	            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1876:3: lv_op_2_1= '*'
            	            {
            	            lv_op_2_1=(Token)match(input,50,FOLLOW_50_in_ruleTimesExpr4219); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                      newLeafNode(lv_op_2_1, grammarAccess.getTimesExprAccess().getOpAsteriskKeyword_1_0_1_0_0());
            	                  
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
            	            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1888:8: lv_op_2_2= '/'
            	            {
            	            lv_op_2_2=(Token)match(input,51,FOLLOW_51_in_ruleTimesExpr4248); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                      newLeafNode(lv_op_2_2, grammarAccess.getTimesExprAccess().getOpSolidusKeyword_1_0_1_0_1());
            	                  
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
            	            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1900:8: lv_op_2_3= 'div'
            	            {
            	            lv_op_2_3=(Token)match(input,52,FOLLOW_52_in_ruleTimesExpr4277); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                      newLeafNode(lv_op_2_3, grammarAccess.getTimesExprAccess().getOpDivKeyword_1_0_1_0_2());
            	                  
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

            	    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1915:2: ( (lv_right_3_0= rulePrefixExpr ) )
            	    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1916:1: (lv_right_3_0= rulePrefixExpr )
            	    {
            	    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1916:1: (lv_right_3_0= rulePrefixExpr )
            	    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1917:3: lv_right_3_0= rulePrefixExpr
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getTimesExprAccess().getRightPrefixExprParserRuleCall_1_0_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_rulePrefixExpr_in_ruleTimesExpr4314);
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
    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1941:1: entryRulePrefixExpr returns [EObject current=null] : iv_rulePrefixExpr= rulePrefixExpr EOF ;
    public final EObject entryRulePrefixExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrefixExpr = null;


        try {
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1942:2: (iv_rulePrefixExpr= rulePrefixExpr EOF )
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1943:2: iv_rulePrefixExpr= rulePrefixExpr EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPrefixExprRule()); 
            }
            pushFollow(FOLLOW_rulePrefixExpr_in_entryRulePrefixExpr4353);
            iv_rulePrefixExpr=rulePrefixExpr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePrefixExpr; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulePrefixExpr4363); if (state.failed) return current;

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
    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1950:1: rulePrefixExpr returns [EObject current=null] : ( ( () ( ( (lv_op_1_1= '-' | lv_op_1_2= 'not' | lv_op_1_3= 'pre' ) ) ) ( (lv_expr_2_0= rulePrefixExpr ) ) ) | this_ProjectionExpr_3= ruleProjectionExpr ) ;
    public final EObject rulePrefixExpr() throws RecognitionException {
        EObject current = null;

        Token lv_op_1_1=null;
        Token lv_op_1_2=null;
        Token lv_op_1_3=null;
        EObject lv_expr_2_0 = null;

        EObject this_ProjectionExpr_3 = null;


         enterRule(); 
            
        try {
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1953:28: ( ( ( () ( ( (lv_op_1_1= '-' | lv_op_1_2= 'not' | lv_op_1_3= 'pre' ) ) ) ( (lv_expr_2_0= rulePrefixExpr ) ) ) | this_ProjectionExpr_3= ruleProjectionExpr ) )
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1954:1: ( ( () ( ( (lv_op_1_1= '-' | lv_op_1_2= 'not' | lv_op_1_3= 'pre' ) ) ) ( (lv_expr_2_0= rulePrefixExpr ) ) ) | this_ProjectionExpr_3= ruleProjectionExpr )
            {
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1954:1: ( ( () ( ( (lv_op_1_1= '-' | lv_op_1_2= 'not' | lv_op_1_3= 'pre' ) ) ) ( (lv_expr_2_0= rulePrefixExpr ) ) ) | this_ProjectionExpr_3= ruleProjectionExpr )
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==27||(LA30_0>=53 && LA30_0<=54)) ) {
                alt30=1;
            }
            else if ( ((LA30_0>=RULE_ID && LA30_0<=RULE_BOOL)||LA30_0==30||LA30_0==56) ) {
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
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1954:2: ( () ( ( (lv_op_1_1= '-' | lv_op_1_2= 'not' | lv_op_1_3= 'pre' ) ) ) ( (lv_expr_2_0= rulePrefixExpr ) ) )
                    {
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1954:2: ( () ( ( (lv_op_1_1= '-' | lv_op_1_2= 'not' | lv_op_1_3= 'pre' ) ) ) ( (lv_expr_2_0= rulePrefixExpr ) ) )
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1954:3: () ( ( (lv_op_1_1= '-' | lv_op_1_2= 'not' | lv_op_1_3= 'pre' ) ) ) ( (lv_expr_2_0= rulePrefixExpr ) )
                    {
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1954:3: ()
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1955:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getPrefixExprAccess().getUnaryExprAction_0_0(),
                                  current);
                          
                    }

                    }

                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1960:2: ( ( (lv_op_1_1= '-' | lv_op_1_2= 'not' | lv_op_1_3= 'pre' ) ) )
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1961:1: ( (lv_op_1_1= '-' | lv_op_1_2= 'not' | lv_op_1_3= 'pre' ) )
                    {
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1961:1: ( (lv_op_1_1= '-' | lv_op_1_2= 'not' | lv_op_1_3= 'pre' ) )
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1962:1: (lv_op_1_1= '-' | lv_op_1_2= 'not' | lv_op_1_3= 'pre' )
                    {
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1962:1: (lv_op_1_1= '-' | lv_op_1_2= 'not' | lv_op_1_3= 'pre' )
                    int alt29=3;
                    switch ( input.LA(1) ) {
                    case 27:
                        {
                        alt29=1;
                        }
                        break;
                    case 53:
                        {
                        alt29=2;
                        }
                        break;
                    case 54:
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
                            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1963:3: lv_op_1_1= '-'
                            {
                            lv_op_1_1=(Token)match(input,27,FOLLOW_27_in_rulePrefixExpr4418); if (state.failed) return current;
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
                            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1975:8: lv_op_1_2= 'not'
                            {
                            lv_op_1_2=(Token)match(input,53,FOLLOW_53_in_rulePrefixExpr4447); if (state.failed) return current;
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
                            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1987:8: lv_op_1_3= 'pre'
                            {
                            lv_op_1_3=(Token)match(input,54,FOLLOW_54_in_rulePrefixExpr4476); if (state.failed) return current;
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

                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2002:2: ( (lv_expr_2_0= rulePrefixExpr ) )
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2003:1: (lv_expr_2_0= rulePrefixExpr )
                    {
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2003:1: (lv_expr_2_0= rulePrefixExpr )
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2004:3: lv_expr_2_0= rulePrefixExpr
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getPrefixExprAccess().getExprPrefixExprParserRuleCall_0_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_rulePrefixExpr_in_rulePrefixExpr4513);
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
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2022:5: this_ProjectionExpr_3= ruleProjectionExpr
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getPrefixExprAccess().getProjectionExprParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleProjectionExpr_in_rulePrefixExpr4542);
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
    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2038:1: entryRuleProjectionExpr returns [EObject current=null] : iv_ruleProjectionExpr= ruleProjectionExpr EOF ;
    public final EObject entryRuleProjectionExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProjectionExpr = null;


        try {
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2039:2: (iv_ruleProjectionExpr= ruleProjectionExpr EOF )
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2040:2: iv_ruleProjectionExpr= ruleProjectionExpr EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getProjectionExprRule()); 
            }
            pushFollow(FOLLOW_ruleProjectionExpr_in_entryRuleProjectionExpr4577);
            iv_ruleProjectionExpr=ruleProjectionExpr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleProjectionExpr; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleProjectionExpr4587); if (state.failed) return current;

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
    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2047:1: ruleProjectionExpr returns [EObject current=null] : (this_AtomicExpr_0= ruleAtomicExpr ( ( ( () '.' ( ( RULE_ID ) ) ) )=> ( () otherlv_2= '.' ( (lv_field_3_0= RULE_ID ) ) ) )* ) ;
    public final EObject ruleProjectionExpr() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token lv_field_3_0=null;
        EObject this_AtomicExpr_0 = null;


         enterRule(); 
            
        try {
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2050:28: ( (this_AtomicExpr_0= ruleAtomicExpr ( ( ( () '.' ( ( RULE_ID ) ) ) )=> ( () otherlv_2= '.' ( (lv_field_3_0= RULE_ID ) ) ) )* ) )
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2051:1: (this_AtomicExpr_0= ruleAtomicExpr ( ( ( () '.' ( ( RULE_ID ) ) ) )=> ( () otherlv_2= '.' ( (lv_field_3_0= RULE_ID ) ) ) )* )
            {
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2051:1: (this_AtomicExpr_0= ruleAtomicExpr ( ( ( () '.' ( ( RULE_ID ) ) ) )=> ( () otherlv_2= '.' ( (lv_field_3_0= RULE_ID ) ) ) )* )
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2052:5: this_AtomicExpr_0= ruleAtomicExpr ( ( ( () '.' ( ( RULE_ID ) ) ) )=> ( () otherlv_2= '.' ( (lv_field_3_0= RULE_ID ) ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getProjectionExprAccess().getAtomicExprParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleAtomicExpr_in_ruleProjectionExpr4634);
            this_AtomicExpr_0=ruleAtomicExpr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_AtomicExpr_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2060:1: ( ( ( () '.' ( ( RULE_ID ) ) ) )=> ( () otherlv_2= '.' ( (lv_field_3_0= RULE_ID ) ) ) )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( (LA31_0==55) ) {
                    int LA31_2 = input.LA(2);

                    if ( (synpred8_InternalJKind()) ) {
                        alt31=1;
                    }


                }


                switch (alt31) {
            	case 1 :
            	    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2060:2: ( ( () '.' ( ( RULE_ID ) ) ) )=> ( () otherlv_2= '.' ( (lv_field_3_0= RULE_ID ) ) )
            	    {
            	    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2067:6: ( () otherlv_2= '.' ( (lv_field_3_0= RULE_ID ) ) )
            	    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2067:7: () otherlv_2= '.' ( (lv_field_3_0= RULE_ID ) )
            	    {
            	    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2067:7: ()
            	    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2068:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getProjectionExprAccess().getProjectExprExprAction_1_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    otherlv_2=(Token)match(input,55,FOLLOW_55_in_ruleProjectionExpr4678); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getProjectionExprAccess().getFullStopKeyword_1_0_1());
            	          
            	    }
            	    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2077:1: ( (lv_field_3_0= RULE_ID ) )
            	    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2078:1: (lv_field_3_0= RULE_ID )
            	    {
            	    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2078:1: (lv_field_3_0= RULE_ID )
            	    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2079:3: lv_field_3_0= RULE_ID
            	    {
            	    lv_field_3_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleProjectionExpr4695); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      			newLeafNode(lv_field_3_0, grammarAccess.getProjectionExprAccess().getFieldIDTerminalRuleCall_1_0_2_0()); 
            	      		
            	    }
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElement(grammarAccess.getProjectionExprRule());
            	      	        }
            	             		setWithLastConsumed(
            	             			current, 
            	             			"field",
            	              		lv_field_3_0, 
            	              		"ID");
            	      	    
            	    }

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
    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2103:1: entryRuleAtomicExpr returns [EObject current=null] : iv_ruleAtomicExpr= ruleAtomicExpr EOF ;
    public final EObject entryRuleAtomicExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAtomicExpr = null;


        try {
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2104:2: (iv_ruleAtomicExpr= ruleAtomicExpr EOF )
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2105:2: iv_ruleAtomicExpr= ruleAtomicExpr EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAtomicExprRule()); 
            }
            pushFollow(FOLLOW_ruleAtomicExpr_in_entryRuleAtomicExpr4739);
            iv_ruleAtomicExpr=ruleAtomicExpr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAtomicExpr; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAtomicExpr4749); if (state.failed) return current;

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
    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2112:1: ruleAtomicExpr returns [EObject current=null] : ( ( () ( (otherlv_1= RULE_ID ) ) ) | ( () ( (lv_val_3_0= RULE_INT ) ) ) | ( () ( (lv_val_5_0= ruleREAL ) ) ) | ( () ( (lv_val_7_0= RULE_BOOL ) ) ) | ( () otherlv_9= 'if' ( (lv_cond_10_0= ruleExpr ) ) otherlv_11= 'then' ( (lv_then_12_0= ruleExpr ) ) otherlv_13= 'else' ( (lv_else_14_0= ruleExpr ) ) ) | ( () ( (otherlv_16= RULE_ID ) ) otherlv_17= '(' ( ( (lv_args_18_0= ruleExpr ) ) (otherlv_19= ',' ( (lv_args_20_0= ruleExpr ) ) )* )? otherlv_21= ')' ) | ( () ( (otherlv_23= RULE_ID ) ) otherlv_24= '{' ( (lv_fields_25_0= RULE_ID ) ) otherlv_26= '=' ( (lv_exprs_27_0= ruleExpr ) ) (otherlv_28= ';' ( (lv_fields_29_0= RULE_ID ) ) otherlv_30= '=' ( (lv_exprs_31_0= ruleExpr ) ) )* otherlv_32= '}' ) | (otherlv_33= '(' this_Expr_34= ruleExpr otherlv_35= ')' ) ) ;
    public final EObject ruleAtomicExpr() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_val_3_0=null;
        Token lv_val_7_0=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        Token otherlv_19=null;
        Token otherlv_21=null;
        Token otherlv_23=null;
        Token otherlv_24=null;
        Token lv_fields_25_0=null;
        Token otherlv_26=null;
        Token otherlv_28=null;
        Token lv_fields_29_0=null;
        Token otherlv_30=null;
        Token otherlv_32=null;
        Token otherlv_33=null;
        Token otherlv_35=null;
        AntlrDatatypeRuleToken lv_val_5_0 = null;

        EObject lv_cond_10_0 = null;

        EObject lv_then_12_0 = null;

        EObject lv_else_14_0 = null;

        EObject lv_args_18_0 = null;

        EObject lv_args_20_0 = null;

        EObject lv_exprs_27_0 = null;

        EObject lv_exprs_31_0 = null;

        EObject this_Expr_34 = null;


         enterRule(); 
            
        try {
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2115:28: ( ( ( () ( (otherlv_1= RULE_ID ) ) ) | ( () ( (lv_val_3_0= RULE_INT ) ) ) | ( () ( (lv_val_5_0= ruleREAL ) ) ) | ( () ( (lv_val_7_0= RULE_BOOL ) ) ) | ( () otherlv_9= 'if' ( (lv_cond_10_0= ruleExpr ) ) otherlv_11= 'then' ( (lv_then_12_0= ruleExpr ) ) otherlv_13= 'else' ( (lv_else_14_0= ruleExpr ) ) ) | ( () ( (otherlv_16= RULE_ID ) ) otherlv_17= '(' ( ( (lv_args_18_0= ruleExpr ) ) (otherlv_19= ',' ( (lv_args_20_0= ruleExpr ) ) )* )? otherlv_21= ')' ) | ( () ( (otherlv_23= RULE_ID ) ) otherlv_24= '{' ( (lv_fields_25_0= RULE_ID ) ) otherlv_26= '=' ( (lv_exprs_27_0= ruleExpr ) ) (otherlv_28= ';' ( (lv_fields_29_0= RULE_ID ) ) otherlv_30= '=' ( (lv_exprs_31_0= ruleExpr ) ) )* otherlv_32= '}' ) | (otherlv_33= '(' this_Expr_34= ruleExpr otherlv_35= ')' ) ) )
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2116:1: ( ( () ( (otherlv_1= RULE_ID ) ) ) | ( () ( (lv_val_3_0= RULE_INT ) ) ) | ( () ( (lv_val_5_0= ruleREAL ) ) ) | ( () ( (lv_val_7_0= RULE_BOOL ) ) ) | ( () otherlv_9= 'if' ( (lv_cond_10_0= ruleExpr ) ) otherlv_11= 'then' ( (lv_then_12_0= ruleExpr ) ) otherlv_13= 'else' ( (lv_else_14_0= ruleExpr ) ) ) | ( () ( (otherlv_16= RULE_ID ) ) otherlv_17= '(' ( ( (lv_args_18_0= ruleExpr ) ) (otherlv_19= ',' ( (lv_args_20_0= ruleExpr ) ) )* )? otherlv_21= ')' ) | ( () ( (otherlv_23= RULE_ID ) ) otherlv_24= '{' ( (lv_fields_25_0= RULE_ID ) ) otherlv_26= '=' ( (lv_exprs_27_0= ruleExpr ) ) (otherlv_28= ';' ( (lv_fields_29_0= RULE_ID ) ) otherlv_30= '=' ( (lv_exprs_31_0= ruleExpr ) ) )* otherlv_32= '}' ) | (otherlv_33= '(' this_Expr_34= ruleExpr otherlv_35= ')' ) )
            {
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2116:1: ( ( () ( (otherlv_1= RULE_ID ) ) ) | ( () ( (lv_val_3_0= RULE_INT ) ) ) | ( () ( (lv_val_5_0= ruleREAL ) ) ) | ( () ( (lv_val_7_0= RULE_BOOL ) ) ) | ( () otherlv_9= 'if' ( (lv_cond_10_0= ruleExpr ) ) otherlv_11= 'then' ( (lv_then_12_0= ruleExpr ) ) otherlv_13= 'else' ( (lv_else_14_0= ruleExpr ) ) ) | ( () ( (otherlv_16= RULE_ID ) ) otherlv_17= '(' ( ( (lv_args_18_0= ruleExpr ) ) (otherlv_19= ',' ( (lv_args_20_0= ruleExpr ) ) )* )? otherlv_21= ')' ) | ( () ( (otherlv_23= RULE_ID ) ) otherlv_24= '{' ( (lv_fields_25_0= RULE_ID ) ) otherlv_26= '=' ( (lv_exprs_27_0= ruleExpr ) ) (otherlv_28= ';' ( (lv_fields_29_0= RULE_ID ) ) otherlv_30= '=' ( (lv_exprs_31_0= ruleExpr ) ) )* otherlv_32= '}' ) | (otherlv_33= '(' this_Expr_34= ruleExpr otherlv_35= ')' ) )
            int alt35=8;
            alt35 = dfa35.predict(input);
            switch (alt35) {
                case 1 :
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2116:2: ( () ( (otherlv_1= RULE_ID ) ) )
                    {
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2116:2: ( () ( (otherlv_1= RULE_ID ) ) )
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2116:3: () ( (otherlv_1= RULE_ID ) )
                    {
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2116:3: ()
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2117:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getAtomicExprAccess().getIdExprAction_0_0(),
                                  current);
                          
                    }

                    }

                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2122:2: ( (otherlv_1= RULE_ID ) )
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2123:1: (otherlv_1= RULE_ID )
                    {
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2123:1: (otherlv_1= RULE_ID )
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2124:3: otherlv_1= RULE_ID
                    {
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getAtomicExprRule());
                      	        }
                              
                    }
                    otherlv_1=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAtomicExpr4804); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		newLeafNode(otherlv_1, grammarAccess.getAtomicExprAccess().getIdIdRefCrossReference_0_1_0()); 
                      	
                    }

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2136:6: ( () ( (lv_val_3_0= RULE_INT ) ) )
                    {
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2136:6: ( () ( (lv_val_3_0= RULE_INT ) ) )
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2136:7: () ( (lv_val_3_0= RULE_INT ) )
                    {
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2136:7: ()
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2137:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getAtomicExprAccess().getIntExprAction_1_0(),
                                  current);
                          
                    }

                    }

                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2142:2: ( (lv_val_3_0= RULE_INT ) )
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2143:1: (lv_val_3_0= RULE_INT )
                    {
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2143:1: (lv_val_3_0= RULE_INT )
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2144:3: lv_val_3_0= RULE_INT
                    {
                    lv_val_3_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleAtomicExpr4838); if (state.failed) return current;
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
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2161:6: ( () ( (lv_val_5_0= ruleREAL ) ) )
                    {
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2161:6: ( () ( (lv_val_5_0= ruleREAL ) ) )
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2161:7: () ( (lv_val_5_0= ruleREAL ) )
                    {
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2161:7: ()
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2162:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getAtomicExprAccess().getRealExprAction_2_0(),
                                  current);
                          
                    }

                    }

                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2167:2: ( (lv_val_5_0= ruleREAL ) )
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2168:1: (lv_val_5_0= ruleREAL )
                    {
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2168:1: (lv_val_5_0= ruleREAL )
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2169:3: lv_val_5_0= ruleREAL
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getAtomicExprAccess().getValREALParserRuleCall_2_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleREAL_in_ruleAtomicExpr4881);
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
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2186:6: ( () ( (lv_val_7_0= RULE_BOOL ) ) )
                    {
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2186:6: ( () ( (lv_val_7_0= RULE_BOOL ) ) )
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2186:7: () ( (lv_val_7_0= RULE_BOOL ) )
                    {
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2186:7: ()
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2187:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getAtomicExprAccess().getBoolExprAction_3_0(),
                                  current);
                          
                    }

                    }

                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2192:2: ( (lv_val_7_0= RULE_BOOL ) )
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2193:1: (lv_val_7_0= RULE_BOOL )
                    {
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2193:1: (lv_val_7_0= RULE_BOOL )
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2194:3: lv_val_7_0= RULE_BOOL
                    {
                    lv_val_7_0=(Token)match(input,RULE_BOOL,FOLLOW_RULE_BOOL_in_ruleAtomicExpr4915); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_val_7_0, grammarAccess.getAtomicExprAccess().getValBOOLTerminalRuleCall_3_1_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getAtomicExprRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"val",
                              		lv_val_7_0, 
                              		"BOOL");
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;
                case 5 :
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2211:6: ( () otherlv_9= 'if' ( (lv_cond_10_0= ruleExpr ) ) otherlv_11= 'then' ( (lv_then_12_0= ruleExpr ) ) otherlv_13= 'else' ( (lv_else_14_0= ruleExpr ) ) )
                    {
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2211:6: ( () otherlv_9= 'if' ( (lv_cond_10_0= ruleExpr ) ) otherlv_11= 'then' ( (lv_then_12_0= ruleExpr ) ) otherlv_13= 'else' ( (lv_else_14_0= ruleExpr ) ) )
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2211:7: () otherlv_9= 'if' ( (lv_cond_10_0= ruleExpr ) ) otherlv_11= 'then' ( (lv_then_12_0= ruleExpr ) ) otherlv_13= 'else' ( (lv_else_14_0= ruleExpr ) )
                    {
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2211:7: ()
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2212:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getAtomicExprAccess().getIfThenElseExprAction_4_0(),
                                  current);
                          
                    }

                    }

                    otherlv_9=(Token)match(input,56,FOLLOW_56_in_ruleAtomicExpr4949); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_9, grammarAccess.getAtomicExprAccess().getIfKeyword_4_1());
                          
                    }
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2221:1: ( (lv_cond_10_0= ruleExpr ) )
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2222:1: (lv_cond_10_0= ruleExpr )
                    {
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2222:1: (lv_cond_10_0= ruleExpr )
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2223:3: lv_cond_10_0= ruleExpr
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getAtomicExprAccess().getCondExprParserRuleCall_4_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleExpr_in_ruleAtomicExpr4970);
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

                    otherlv_11=(Token)match(input,57,FOLLOW_57_in_ruleAtomicExpr4982); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_11, grammarAccess.getAtomicExprAccess().getThenKeyword_4_3());
                          
                    }
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2243:1: ( (lv_then_12_0= ruleExpr ) )
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2244:1: (lv_then_12_0= ruleExpr )
                    {
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2244:1: (lv_then_12_0= ruleExpr )
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2245:3: lv_then_12_0= ruleExpr
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getAtomicExprAccess().getThenExprParserRuleCall_4_4_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleExpr_in_ruleAtomicExpr5003);
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

                    otherlv_13=(Token)match(input,58,FOLLOW_58_in_ruleAtomicExpr5015); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_13, grammarAccess.getAtomicExprAccess().getElseKeyword_4_5());
                          
                    }
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2265:1: ( (lv_else_14_0= ruleExpr ) )
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2266:1: (lv_else_14_0= ruleExpr )
                    {
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2266:1: (lv_else_14_0= ruleExpr )
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2267:3: lv_else_14_0= ruleExpr
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getAtomicExprAccess().getElseExprParserRuleCall_4_6_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleExpr_in_ruleAtomicExpr5036);
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
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2284:6: ( () ( (otherlv_16= RULE_ID ) ) otherlv_17= '(' ( ( (lv_args_18_0= ruleExpr ) ) (otherlv_19= ',' ( (lv_args_20_0= ruleExpr ) ) )* )? otherlv_21= ')' )
                    {
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2284:6: ( () ( (otherlv_16= RULE_ID ) ) otherlv_17= '(' ( ( (lv_args_18_0= ruleExpr ) ) (otherlv_19= ',' ( (lv_args_20_0= ruleExpr ) ) )* )? otherlv_21= ')' )
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2284:7: () ( (otherlv_16= RULE_ID ) ) otherlv_17= '(' ( ( (lv_args_18_0= ruleExpr ) ) (otherlv_19= ',' ( (lv_args_20_0= ruleExpr ) ) )* )? otherlv_21= ')'
                    {
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2284:7: ()
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2285:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getAtomicExprAccess().getNodeCallExprAction_5_0(),
                                  current);
                          
                    }

                    }

                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2290:2: ( (otherlv_16= RULE_ID ) )
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2291:1: (otherlv_16= RULE_ID )
                    {
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2291:1: (otherlv_16= RULE_ID )
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2292:3: otherlv_16= RULE_ID
                    {
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getAtomicExprRule());
                      	        }
                              
                    }
                    otherlv_16=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAtomicExpr5073); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		newLeafNode(otherlv_16, grammarAccess.getAtomicExprAccess().getNodeNodeCrossReference_5_1_0()); 
                      	
                    }

                    }


                    }

                    otherlv_17=(Token)match(input,30,FOLLOW_30_in_ruleAtomicExpr5085); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_17, grammarAccess.getAtomicExprAccess().getLeftParenthesisKeyword_5_2());
                          
                    }
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2307:1: ( ( (lv_args_18_0= ruleExpr ) ) (otherlv_19= ',' ( (lv_args_20_0= ruleExpr ) ) )* )?
                    int alt33=2;
                    int LA33_0 = input.LA(1);

                    if ( ((LA33_0>=RULE_ID && LA33_0<=RULE_BOOL)||LA33_0==27||LA33_0==30||(LA33_0>=53 && LA33_0<=54)||LA33_0==56) ) {
                        alt33=1;
                    }
                    switch (alt33) {
                        case 1 :
                            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2307:2: ( (lv_args_18_0= ruleExpr ) ) (otherlv_19= ',' ( (lv_args_20_0= ruleExpr ) ) )*
                            {
                            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2307:2: ( (lv_args_18_0= ruleExpr ) )
                            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2308:1: (lv_args_18_0= ruleExpr )
                            {
                            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2308:1: (lv_args_18_0= ruleExpr )
                            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2309:3: lv_args_18_0= ruleExpr
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getAtomicExprAccess().getArgsExprParserRuleCall_5_3_0_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleExpr_in_ruleAtomicExpr5107);
                            lv_args_18_0=ruleExpr();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getAtomicExprRule());
                              	        }
                                     		add(
                                     			current, 
                                     			"args",
                                      		lv_args_18_0, 
                                      		"Expr");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }

                            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2325:2: (otherlv_19= ',' ( (lv_args_20_0= ruleExpr ) ) )*
                            loop32:
                            do {
                                int alt32=2;
                                int LA32_0 = input.LA(1);

                                if ( (LA32_0==24) ) {
                                    alt32=1;
                                }


                                switch (alt32) {
                            	case 1 :
                            	    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2325:4: otherlv_19= ',' ( (lv_args_20_0= ruleExpr ) )
                            	    {
                            	    otherlv_19=(Token)match(input,24,FOLLOW_24_in_ruleAtomicExpr5120); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	          	newLeafNode(otherlv_19, grammarAccess.getAtomicExprAccess().getCommaKeyword_5_3_1_0());
                            	          
                            	    }
                            	    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2329:1: ( (lv_args_20_0= ruleExpr ) )
                            	    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2330:1: (lv_args_20_0= ruleExpr )
                            	    {
                            	    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2330:1: (lv_args_20_0= ruleExpr )
                            	    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2331:3: lv_args_20_0= ruleExpr
                            	    {
                            	    if ( state.backtracking==0 ) {
                            	       
                            	      	        newCompositeNode(grammarAccess.getAtomicExprAccess().getArgsExprParserRuleCall_5_3_1_1_0()); 
                            	      	    
                            	    }
                            	    pushFollow(FOLLOW_ruleExpr_in_ruleAtomicExpr5141);
                            	    lv_args_20_0=ruleExpr();

                            	    state._fsp--;
                            	    if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	      	        if (current==null) {
                            	      	            current = createModelElementForParent(grammarAccess.getAtomicExprRule());
                            	      	        }
                            	             		add(
                            	             			current, 
                            	             			"args",
                            	              		lv_args_20_0, 
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


                            }
                            break;

                    }

                    otherlv_21=(Token)match(input,31,FOLLOW_31_in_ruleAtomicExpr5157); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_21, grammarAccess.getAtomicExprAccess().getRightParenthesisKeyword_5_4());
                          
                    }

                    }


                    }
                    break;
                case 7 :
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2352:6: ( () ( (otherlv_23= RULE_ID ) ) otherlv_24= '{' ( (lv_fields_25_0= RULE_ID ) ) otherlv_26= '=' ( (lv_exprs_27_0= ruleExpr ) ) (otherlv_28= ';' ( (lv_fields_29_0= RULE_ID ) ) otherlv_30= '=' ( (lv_exprs_31_0= ruleExpr ) ) )* otherlv_32= '}' )
                    {
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2352:6: ( () ( (otherlv_23= RULE_ID ) ) otherlv_24= '{' ( (lv_fields_25_0= RULE_ID ) ) otherlv_26= '=' ( (lv_exprs_27_0= ruleExpr ) ) (otherlv_28= ';' ( (lv_fields_29_0= RULE_ID ) ) otherlv_30= '=' ( (lv_exprs_31_0= ruleExpr ) ) )* otherlv_32= '}' )
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2352:7: () ( (otherlv_23= RULE_ID ) ) otherlv_24= '{' ( (lv_fields_25_0= RULE_ID ) ) otherlv_26= '=' ( (lv_exprs_27_0= ruleExpr ) ) (otherlv_28= ';' ( (lv_fields_29_0= RULE_ID ) ) otherlv_30= '=' ( (lv_exprs_31_0= ruleExpr ) ) )* otherlv_32= '}'
                    {
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2352:7: ()
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2353:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getAtomicExprAccess().getRecordExprAction_6_0(),
                                  current);
                          
                    }

                    }

                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2358:2: ( (otherlv_23= RULE_ID ) )
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2359:1: (otherlv_23= RULE_ID )
                    {
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2359:1: (otherlv_23= RULE_ID )
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2360:3: otherlv_23= RULE_ID
                    {
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getAtomicExprRule());
                      	        }
                              
                    }
                    otherlv_23=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAtomicExpr5194); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		newLeafNode(otherlv_23, grammarAccess.getAtomicExprAccess().getIdTypedefCrossReference_6_1_0()); 
                      	
                    }

                    }


                    }

                    otherlv_24=(Token)match(input,16,FOLLOW_16_in_ruleAtomicExpr5206); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_24, grammarAccess.getAtomicExprAccess().getLeftCurlyBracketKeyword_6_2());
                          
                    }
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2375:1: ( (lv_fields_25_0= RULE_ID ) )
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2376:1: (lv_fields_25_0= RULE_ID )
                    {
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2376:1: (lv_fields_25_0= RULE_ID )
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2377:3: lv_fields_25_0= RULE_ID
                    {
                    lv_fields_25_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAtomicExpr5223); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_fields_25_0, grammarAccess.getAtomicExprAccess().getFieldsIDTerminalRuleCall_6_3_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getAtomicExprRule());
                      	        }
                             		addWithLastConsumed(
                             			current, 
                             			"fields",
                              		lv_fields_25_0, 
                              		"ID");
                      	    
                    }

                    }


                    }

                    otherlv_26=(Token)match(input,13,FOLLOW_13_in_ruleAtomicExpr5240); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_26, grammarAccess.getAtomicExprAccess().getEqualsSignKeyword_6_4());
                          
                    }
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2397:1: ( (lv_exprs_27_0= ruleExpr ) )
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2398:1: (lv_exprs_27_0= ruleExpr )
                    {
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2398:1: (lv_exprs_27_0= ruleExpr )
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2399:3: lv_exprs_27_0= ruleExpr
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getAtomicExprAccess().getExprsExprParserRuleCall_6_5_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleExpr_in_ruleAtomicExpr5261);
                    lv_exprs_27_0=ruleExpr();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getAtomicExprRule());
                      	        }
                             		add(
                             			current, 
                             			"exprs",
                              		lv_exprs_27_0, 
                              		"Expr");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2415:2: (otherlv_28= ';' ( (lv_fields_29_0= RULE_ID ) ) otherlv_30= '=' ( (lv_exprs_31_0= ruleExpr ) ) )*
                    loop34:
                    do {
                        int alt34=2;
                        int LA34_0 = input.LA(1);

                        if ( (LA34_0==14) ) {
                            alt34=1;
                        }


                        switch (alt34) {
                    	case 1 :
                    	    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2415:4: otherlv_28= ';' ( (lv_fields_29_0= RULE_ID ) ) otherlv_30= '=' ( (lv_exprs_31_0= ruleExpr ) )
                    	    {
                    	    otherlv_28=(Token)match(input,14,FOLLOW_14_in_ruleAtomicExpr5274); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_28, grammarAccess.getAtomicExprAccess().getSemicolonKeyword_6_6_0());
                    	          
                    	    }
                    	    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2419:1: ( (lv_fields_29_0= RULE_ID ) )
                    	    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2420:1: (lv_fields_29_0= RULE_ID )
                    	    {
                    	    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2420:1: (lv_fields_29_0= RULE_ID )
                    	    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2421:3: lv_fields_29_0= RULE_ID
                    	    {
                    	    lv_fields_29_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAtomicExpr5291); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      			newLeafNode(lv_fields_29_0, grammarAccess.getAtomicExprAccess().getFieldsIDTerminalRuleCall_6_6_1_0()); 
                    	      		
                    	    }
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElement(grammarAccess.getAtomicExprRule());
                    	      	        }
                    	             		addWithLastConsumed(
                    	             			current, 
                    	             			"fields",
                    	              		lv_fields_29_0, 
                    	              		"ID");
                    	      	    
                    	    }

                    	    }


                    	    }

                    	    otherlv_30=(Token)match(input,13,FOLLOW_13_in_ruleAtomicExpr5308); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_30, grammarAccess.getAtomicExprAccess().getEqualsSignKeyword_6_6_2());
                    	          
                    	    }
                    	    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2441:1: ( (lv_exprs_31_0= ruleExpr ) )
                    	    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2442:1: (lv_exprs_31_0= ruleExpr )
                    	    {
                    	    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2442:1: (lv_exprs_31_0= ruleExpr )
                    	    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2443:3: lv_exprs_31_0= ruleExpr
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getAtomicExprAccess().getExprsExprParserRuleCall_6_6_3_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleExpr_in_ruleAtomicExpr5329);
                    	    lv_exprs_31_0=ruleExpr();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getAtomicExprRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"exprs",
                    	              		lv_exprs_31_0, 
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

                    otherlv_32=(Token)match(input,18,FOLLOW_18_in_ruleAtomicExpr5343); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_32, grammarAccess.getAtomicExprAccess().getRightCurlyBracketKeyword_6_7());
                          
                    }

                    }


                    }
                    break;
                case 8 :
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2464:6: (otherlv_33= '(' this_Expr_34= ruleExpr otherlv_35= ')' )
                    {
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2464:6: (otherlv_33= '(' this_Expr_34= ruleExpr otherlv_35= ')' )
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2464:8: otherlv_33= '(' this_Expr_34= ruleExpr otherlv_35= ')'
                    {
                    otherlv_33=(Token)match(input,30,FOLLOW_30_in_ruleAtomicExpr5363); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_33, grammarAccess.getAtomicExprAccess().getLeftParenthesisKeyword_7_0());
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getAtomicExprAccess().getExprParserRuleCall_7_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleExpr_in_ruleAtomicExpr5385);
                    this_Expr_34=ruleExpr();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_Expr_34; 
                              afterParserOrEnumRuleCall();
                          
                    }
                    otherlv_35=(Token)match(input,31,FOLLOW_31_in_ruleAtomicExpr5396); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_35, grammarAccess.getAtomicExprAccess().getRightParenthesisKeyword_7_2());
                          
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


    // $ANTLR start "entryRuleREAL"
    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2491:1: entryRuleREAL returns [String current=null] : iv_ruleREAL= ruleREAL EOF ;
    public final String entryRuleREAL() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleREAL = null;


        try {
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2492:2: (iv_ruleREAL= ruleREAL EOF )
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2493:2: iv_ruleREAL= ruleREAL EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getREALRule()); 
            }
            pushFollow(FOLLOW_ruleREAL_in_entryRuleREAL5436);
            iv_ruleREAL=ruleREAL();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleREAL.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleREAL5447); if (state.failed) return current;

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
    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2500:1: ruleREAL returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_INT_0= RULE_INT kw= '.' this_INT_2= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleREAL() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;
        Token kw=null;
        Token this_INT_2=null;

         enterRule(); 
            
        try {
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2503:28: ( (this_INT_0= RULE_INT kw= '.' this_INT_2= RULE_INT ) )
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2504:1: (this_INT_0= RULE_INT kw= '.' this_INT_2= RULE_INT )
            {
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2504:1: (this_INT_0= RULE_INT kw= '.' this_INT_2= RULE_INT )
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2504:6: this_INT_0= RULE_INT kw= '.' this_INT_2= RULE_INT
            {
            this_INT_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleREAL5487); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_INT_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_INT_0, grammarAccess.getREALAccess().getINTTerminalRuleCall_0()); 
                  
            }
            kw=(Token)match(input,55,FOLLOW_55_in_ruleREAL5505); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current.merge(kw);
                      newLeafNode(kw, grammarAccess.getREALAccess().getFullStopKeyword_1()); 
                  
            }
            this_INT_2=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleREAL5520); if (state.failed) return current;
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

    // $ANTLR start synpred1_InternalJKind
    public final void synpred1_InternalJKind_fragment() throws RecognitionException {   
        // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1244:2: ( ( () ( ( '->' ) ) ( ( ruleArrowExpr ) ) ) )
        // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1244:3: ( () ( ( '->' ) ) ( ( ruleArrowExpr ) ) )
        {
        // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1244:3: ( () ( ( '->' ) ) ( ( ruleArrowExpr ) ) )
        // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1244:4: () ( ( '->' ) ) ( ( ruleArrowExpr ) )
        {
        // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1244:4: ()
        // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1245:1: 
        {
        }

        // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1245:2: ( ( '->' ) )
        // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1246:1: ( '->' )
        {
        // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1246:1: ( '->' )
        // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1247:2: '->'
        {
        match(input,39,FOLLOW_39_in_synpred1_InternalJKind2679); if (state.failed) return ;

        }


        }

        // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1251:2: ( ( ruleArrowExpr ) )
        // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1252:1: ( ruleArrowExpr )
        {
        // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1252:1: ( ruleArrowExpr )
        // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1253:1: ruleArrowExpr
        {
        pushFollow(FOLLOW_ruleArrowExpr_in_synpred1_InternalJKind2692);
        ruleArrowExpr();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred1_InternalJKind

    // $ANTLR start synpred2_InternalJKind
    public final void synpred2_InternalJKind_fragment() throws RecognitionException {   
        // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1324:2: ( ( () ( ( '=>' ) ) ( ( ruleImpliesExpr ) ) ) )
        // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1324:3: ( () ( ( '=>' ) ) ( ( ruleImpliesExpr ) ) )
        {
        // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1324:3: ( () ( ( '=>' ) ) ( ( ruleImpliesExpr ) ) )
        // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1324:4: () ( ( '=>' ) ) ( ( ruleImpliesExpr ) )
        {
        // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1324:4: ()
        // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1325:1: 
        {
        }

        // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1325:2: ( ( '=>' ) )
        // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1326:1: ( '=>' )
        {
        // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1326:1: ( '=>' )
        // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1327:2: '=>'
        {
        match(input,40,FOLLOW_40_in_synpred2_InternalJKind2868); if (state.failed) return ;

        }


        }

        // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1331:2: ( ( ruleImpliesExpr ) )
        // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1332:1: ( ruleImpliesExpr )
        {
        // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1332:1: ( ruleImpliesExpr )
        // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1333:1: ruleImpliesExpr
        {
        pushFollow(FOLLOW_ruleImpliesExpr_in_synpred2_InternalJKind2881);
        ruleImpliesExpr();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred2_InternalJKind

    // $ANTLR start synpred3_InternalJKind
    public final void synpred3_InternalJKind_fragment() throws RecognitionException {   
        // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1404:2: ( ( () ( ( ( 'or' | 'xor' ) ) ) ( ( ruleAndExpr ) ) ) )
        // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1404:3: ( () ( ( ( 'or' | 'xor' ) ) ) ( ( ruleAndExpr ) ) )
        {
        // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1404:3: ( () ( ( ( 'or' | 'xor' ) ) ) ( ( ruleAndExpr ) ) )
        // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1404:4: () ( ( ( 'or' | 'xor' ) ) ) ( ( ruleAndExpr ) )
        {
        // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1404:4: ()
        // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1405:1: 
        {
        }

        // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1405:2: ( ( ( 'or' | 'xor' ) ) )
        // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1406:1: ( ( 'or' | 'xor' ) )
        {
        // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1406:1: ( ( 'or' | 'xor' ) )
        // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1407:1: ( 'or' | 'xor' )
        {
        if ( (input.LA(1)>=41 && input.LA(1)<=42) ) {
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

        // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1417:2: ( ( ruleAndExpr ) )
        // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1418:1: ( ruleAndExpr )
        {
        // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1418:1: ( ruleAndExpr )
        // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1419:1: ruleAndExpr
        {
        pushFollow(FOLLOW_ruleAndExpr_in_synpred3_InternalJKind3089);
        ruleAndExpr();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred3_InternalJKind

    // $ANTLR start synpred4_InternalJKind
    public final void synpred4_InternalJKind_fragment() throws RecognitionException {   
        // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1505:2: ( ( () ( ( 'and' ) ) ( ( ruleRelationalExpr ) ) ) )
        // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1505:3: ( () ( ( 'and' ) ) ( ( ruleRelationalExpr ) ) )
        {
        // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1505:3: ( () ( ( 'and' ) ) ( ( ruleRelationalExpr ) ) )
        // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1505:4: () ( ( 'and' ) ) ( ( ruleRelationalExpr ) )
        {
        // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1505:4: ()
        // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1506:1: 
        {
        }

        // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1506:2: ( ( 'and' ) )
        // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1507:1: ( 'and' )
        {
        // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1507:1: ( 'and' )
        // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1508:2: 'and'
        {
        match(input,43,FOLLOW_43_in_synpred4_InternalJKind3299); if (state.failed) return ;

        }


        }

        // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1512:2: ( ( ruleRelationalExpr ) )
        // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1513:1: ( ruleRelationalExpr )
        {
        // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1513:1: ( ruleRelationalExpr )
        // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1514:1: ruleRelationalExpr
        {
        pushFollow(FOLLOW_ruleRelationalExpr_in_synpred4_InternalJKind3312);
        ruleRelationalExpr();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred4_InternalJKind

    // $ANTLR start synpred5_InternalJKind
    public final void synpred5_InternalJKind_fragment() throws RecognitionException {   
        // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1585:2: ( ( () ( ( ( '<' | '<=' | '>' | '>=' | '=' | '<>' ) ) ) ( ( rulePlusExpr ) ) ) )
        // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1585:3: ( () ( ( ( '<' | '<=' | '>' | '>=' | '=' | '<>' ) ) ) ( ( rulePlusExpr ) ) )
        {
        // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1585:3: ( () ( ( ( '<' | '<=' | '>' | '>=' | '=' | '<>' ) ) ) ( ( rulePlusExpr ) ) )
        // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1585:4: () ( ( ( '<' | '<=' | '>' | '>=' | '=' | '<>' ) ) ) ( ( rulePlusExpr ) )
        {
        // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1585:4: ()
        // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1586:1: 
        {
        }

        // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1586:2: ( ( ( '<' | '<=' | '>' | '>=' | '=' | '<>' ) ) )
        // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1587:1: ( ( '<' | '<=' | '>' | '>=' | '=' | '<>' ) )
        {
        // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1587:1: ( ( '<' | '<=' | '>' | '>=' | '=' | '<>' ) )
        // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1588:1: ( '<' | '<=' | '>' | '>=' | '=' | '<>' )
        {
        if ( input.LA(1)==13||(input.LA(1)>=44 && input.LA(1)<=48) ) {
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

        // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1610:2: ( ( rulePlusExpr ) )
        // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1611:1: ( rulePlusExpr )
        {
        // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1611:1: ( rulePlusExpr )
        // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1612:1: rulePlusExpr
        {
        pushFollow(FOLLOW_rulePlusExpr_in_synpred5_InternalJKind3576);
        rulePlusExpr();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred5_InternalJKind

    // $ANTLR start synpred6_InternalJKind
    public final void synpred6_InternalJKind_fragment() throws RecognitionException {   
        // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1746:2: ( ( () ( ( ( '+' | '-' ) ) ) ( ( ruleTimesExpr ) ) ) )
        // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1746:3: ( () ( ( ( '+' | '-' ) ) ) ( ( ruleTimesExpr ) ) )
        {
        // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1746:3: ( () ( ( ( '+' | '-' ) ) ) ( ( ruleTimesExpr ) ) )
        // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1746:4: () ( ( ( '+' | '-' ) ) ) ( ( ruleTimesExpr ) )
        {
        // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1746:4: ()
        // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1747:1: 
        {
        }

        // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1747:2: ( ( ( '+' | '-' ) ) )
        // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1748:1: ( ( '+' | '-' ) )
        {
        // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1748:1: ( ( '+' | '-' ) )
        // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1749:1: ( '+' | '-' )
        {
        if ( input.LA(1)==27||input.LA(1)==49 ) {
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

        // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1759:2: ( ( ruleTimesExpr ) )
        // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1760:1: ( ruleTimesExpr )
        {
        // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1760:1: ( ruleTimesExpr )
        // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1761:1: ruleTimesExpr
        {
        pushFollow(FOLLOW_ruleTimesExpr_in_synpred6_InternalJKind3934);
        ruleTimesExpr();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred6_InternalJKind

    // $ANTLR start synpred7_InternalJKind
    public final void synpred7_InternalJKind_fragment() throws RecognitionException {   
        // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1847:2: ( ( () ( ( ( '*' | '/' | 'div' ) ) ) ( ( rulePrefixExpr ) ) ) )
        // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1847:3: ( () ( ( ( '*' | '/' | 'div' ) ) ) ( ( rulePrefixExpr ) ) )
        {
        // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1847:3: ( () ( ( ( '*' | '/' | 'div' ) ) ) ( ( rulePrefixExpr ) ) )
        // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1847:4: () ( ( ( '*' | '/' | 'div' ) ) ) ( ( rulePrefixExpr ) )
        {
        // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1847:4: ()
        // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1848:1: 
        {
        }

        // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1848:2: ( ( ( '*' | '/' | 'div' ) ) )
        // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1849:1: ( ( '*' | '/' | 'div' ) )
        {
        // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1849:1: ( ( '*' | '/' | 'div' ) )
        // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1850:1: ( '*' | '/' | 'div' )
        {
        if ( (input.LA(1)>=50 && input.LA(1)<=52) ) {
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

        // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1863:2: ( ( rulePrefixExpr ) )
        // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1864:1: ( rulePrefixExpr )
        {
        // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1864:1: ( rulePrefixExpr )
        // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1865:1: rulePrefixExpr
        {
        pushFollow(FOLLOW_rulePrefixExpr_in_synpred7_InternalJKind4190);
        rulePrefixExpr();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred7_InternalJKind

    // $ANTLR start synpred8_InternalJKind
    public final void synpred8_InternalJKind_fragment() throws RecognitionException {   
        // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2060:2: ( ( () '.' ( ( RULE_ID ) ) ) )
        // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2060:3: ( () '.' ( ( RULE_ID ) ) )
        {
        // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2060:3: ( () '.' ( ( RULE_ID ) ) )
        // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2060:4: () '.' ( ( RULE_ID ) )
        {
        // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2060:4: ()
        // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2061:1: 
        {
        }

        match(input,55,FOLLOW_55_in_synpred8_InternalJKind4649); if (state.failed) return ;
        // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2062:1: ( ( RULE_ID ) )
        // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2063:1: ( RULE_ID )
        {
        // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2063:1: ( RULE_ID )
        // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2064:1: RULE_ID
        {
        match(input,RULE_ID,FOLLOW_RULE_ID_in_synpred8_InternalJKind4656); if (state.failed) return ;

        }


        }


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


    protected DFA35 dfa35 = new DFA35(this);
    static final String DFA35_eotS =
        "\14\uffff";
    static final String DFA35_eofS =
        "\1\uffff\1\10\1\12\11\uffff";
    static final String DFA35_minS =
        "\1\4\2\15\6\uffff\1\4\2\uffff";
    static final String DFA35_maxS =
        "\1\70\2\72\6\uffff\1\5\2\uffff";
    static final String DFA35_acceptS =
        "\3\uffff\1\4\1\5\1\10\1\7\1\6\1\1\1\uffff\1\2\1\3";
    static final String DFA35_specialS =
        "\14\uffff}>";
    static final String[] DFA35_transitionS = {
            "\1\1\1\2\1\3\27\uffff\1\5\31\uffff\1\4",
            "\2\10\1\uffff\1\6\1\uffff\1\10\5\uffff\1\10\2\uffff\1\10\2"+
            "\uffff\1\7\1\10\7\uffff\16\10\2\uffff\1\10\1\uffff\2\10",
            "\2\12\3\uffff\1\12\5\uffff\1\12\2\uffff\1\12\3\uffff\1\12"+
            "\7\uffff\16\12\2\uffff\1\11\1\uffff\2\12",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\12\1\13",
            "",
            ""
    };

    static final short[] DFA35_eot = DFA.unpackEncodedString(DFA35_eotS);
    static final short[] DFA35_eof = DFA.unpackEncodedString(DFA35_eofS);
    static final char[] DFA35_min = DFA.unpackEncodedStringToUnsignedChars(DFA35_minS);
    static final char[] DFA35_max = DFA.unpackEncodedStringToUnsignedChars(DFA35_maxS);
    static final short[] DFA35_accept = DFA.unpackEncodedString(DFA35_acceptS);
    static final short[] DFA35_special = DFA.unpackEncodedString(DFA35_specialS);
    static final short[][] DFA35_transition;

    static {
        int numStates = DFA35_transitionS.length;
        DFA35_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA35_transition[i] = DFA.unpackEncodedString(DFA35_transitionS[i]);
        }
    }

    class DFA35 extends DFA {

        public DFA35(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 35;
            this.eot = DFA35_eot;
            this.eof = DFA35_eof;
            this.min = DFA35_min;
            this.max = DFA35_max;
            this.accept = DFA35_accept;
            this.special = DFA35_special;
            this.transition = DFA35_transition;
        }
        public String getDescription() {
            return "2116:1: ( ( () ( (otherlv_1= RULE_ID ) ) ) | ( () ( (lv_val_3_0= RULE_INT ) ) ) | ( () ( (lv_val_5_0= ruleREAL ) ) ) | ( () ( (lv_val_7_0= RULE_BOOL ) ) ) | ( () otherlv_9= 'if' ( (lv_cond_10_0= ruleExpr ) ) otherlv_11= 'then' ( (lv_then_12_0= ruleExpr ) ) otherlv_13= 'else' ( (lv_else_14_0= ruleExpr ) ) ) | ( () ( (otherlv_16= RULE_ID ) ) otherlv_17= '(' ( ( (lv_args_18_0= ruleExpr ) ) (otherlv_19= ',' ( (lv_args_20_0= ruleExpr ) ) )* )? otherlv_21= ')' ) | ( () ( (otherlv_23= RULE_ID ) ) otherlv_24= '{' ( (lv_fields_25_0= RULE_ID ) ) otherlv_26= '=' ( (lv_exprs_27_0= ruleExpr ) ) (otherlv_28= ';' ( (lv_fields_29_0= RULE_ID ) ) otherlv_30= '=' ( (lv_exprs_31_0= ruleExpr ) ) )* otherlv_32= '}' ) | (otherlv_33= '(' this_Expr_34= ruleExpr otherlv_35= ')' ) )";
        }
    }
 

    public static final BitSet FOLLOW_ruleFile_in_entryRuleFile75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFile85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypedef_in_ruleFile131 = new BitSet(new long[]{0x0000000030001002L});
    public static final BitSet FOLLOW_ruleConstant_in_ruleFile158 = new BitSet(new long[]{0x0000000030001002L});
    public static final BitSet FOLLOW_ruleNode_in_ruleFile185 = new BitSet(new long[]{0x0000000030001002L});
    public static final BitSet FOLLOW_ruleTypedef_in_entryRuleTypedef222 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTypedef232 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_ruleTypedef269 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleTypedef286 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleTypedef303 = new BitSet(new long[]{0x0000000000788010L});
    public static final BitSet FOLLOW_ruleTopLevelType_in_ruleTypedef324 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleTypedef336 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTopLevelType_in_entryRuleTopLevelType372 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTopLevelType382 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_ruleTopLevelType429 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleTopLevelType441 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleTopLevelType458 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleTopLevelType475 = new BitSet(new long[]{0x0000000000788010L});
    public static final BitSet FOLLOW_ruleType_in_ruleTopLevelType496 = new BitSet(new long[]{0x0000000000044000L});
    public static final BitSet FOLLOW_14_in_ruleTopLevelType509 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleTopLevelType526 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleTopLevelType543 = new BitSet(new long[]{0x0000000000788010L});
    public static final BitSet FOLLOW_ruleType_in_ruleTopLevelType564 = new BitSet(new long[]{0x0000000000044000L});
    public static final BitSet FOLLOW_18_in_ruleTopLevelType578 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_ruleTopLevelType607 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_entryRuleType642 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleType652 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_ruleType699 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_ruleType728 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_ruleType757 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_ruleType786 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_ruleType798 = new BitSet(new long[]{0x0000000008000020L});
    public static final BitSet FOLLOW_ruleBound_in_ruleType819 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleType831 = new BitSet(new long[]{0x0000000008000020L});
    public static final BitSet FOLLOW_ruleBound_in_ruleType852 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_ruleType864 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_ruleType876 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleType888 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleType925 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBound_in_entryRuleBound963 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBound974 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_ruleBound1013 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleBound1030 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConstant_in_entryRuleConstant1075 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConstant1085 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_ruleConstant1122 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleConstant1139 = new BitSet(new long[]{0x0000000000022000L});
    public static final BitSet FOLLOW_17_in_ruleConstant1157 = new BitSet(new long[]{0x0000000000788010L});
    public static final BitSet FOLLOW_ruleType_in_ruleConstant1178 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleConstant1192 = new BitSet(new long[]{0x0160000048000070L});
    public static final BitSet FOLLOW_ruleExpr_in_ruleConstant1213 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleConstant1225 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNode_in_entryRuleNode1261 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNode1271 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_ruleNode1308 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleNode1325 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_ruleNode1342 = new BitSet(new long[]{0x0000000080000010L});
    public static final BitSet FOLLOW_ruleVariableGroup_in_ruleNode1364 = new BitSet(new long[]{0x0000000080004000L});
    public static final BitSet FOLLOW_14_in_ruleNode1377 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleVariableGroup_in_ruleNode1398 = new BitSet(new long[]{0x0000000080004000L});
    public static final BitSet FOLLOW_31_in_ruleNode1414 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_ruleNode1426 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_ruleNode1438 = new BitSet(new long[]{0x0000000080000010L});
    public static final BitSet FOLLOW_ruleVariableGroup_in_ruleNode1460 = new BitSet(new long[]{0x0000000080004000L});
    public static final BitSet FOLLOW_14_in_ruleNode1473 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleVariableGroup_in_ruleNode1494 = new BitSet(new long[]{0x0000000080004000L});
    public static final BitSet FOLLOW_31_in_ruleNode1510 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleNode1522 = new BitSet(new long[]{0x0000000600000000L});
    public static final BitSet FOLLOW_33_in_ruleNode1535 = new BitSet(new long[]{0x0000000400000010L});
    public static final BitSet FOLLOW_ruleVariableGroup_in_ruleNode1557 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleNode1569 = new BitSet(new long[]{0x0000000400000010L});
    public static final BitSet FOLLOW_34_in_ruleNode1585 = new BitSet(new long[]{0x0000007800000010L});
    public static final BitSet FOLLOW_ruleEquation_in_ruleNode1607 = new BitSet(new long[]{0x0000007800000010L});
    public static final BitSet FOLLOW_ruleProperty_in_ruleNode1634 = new BitSet(new long[]{0x0000007800000010L});
    public static final BitSet FOLLOW_ruleAssertion_in_ruleNode1661 = new BitSet(new long[]{0x0000007800000010L});
    public static final BitSet FOLLOW_ruleMain_in_ruleNode1688 = new BitSet(new long[]{0x0000007800000010L});
    public static final BitSet FOLLOW_35_in_ruleNode1702 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_14_in_ruleNode1715 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariableGroup_in_entryRuleVariableGroup1753 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVariableGroup1763 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariable_in_ruleVariableGroup1809 = new BitSet(new long[]{0x0000000001020000L});
    public static final BitSet FOLLOW_24_in_ruleVariableGroup1822 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleVariable_in_ruleVariableGroup1843 = new BitSet(new long[]{0x0000000001020000L});
    public static final BitSet FOLLOW_17_in_ruleVariableGroup1857 = new BitSet(new long[]{0x0000000000788010L});
    public static final BitSet FOLLOW_ruleType_in_ruleVariableGroup1878 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariable_in_entryRuleVariable1914 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVariable1924 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleVariable1965 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEquation_in_entryRuleEquation2005 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEquation2015 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEquation2060 = new BitSet(new long[]{0x0000000001002000L});
    public static final BitSet FOLLOW_24_in_ruleEquation2073 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEquation2093 = new BitSet(new long[]{0x0000000001002000L});
    public static final BitSet FOLLOW_13_in_ruleEquation2107 = new BitSet(new long[]{0x0160000048000070L});
    public static final BitSet FOLLOW_ruleExpr_in_ruleEquation2128 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleEquation2140 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProperty_in_entryRuleProperty2176 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleProperty2186 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_ruleProperty2223 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleProperty2243 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleProperty2255 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMain_in_entryRuleMain2292 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMain2303 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_ruleMain2341 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_14_in_ruleMain2355 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAssertion_in_entryRuleAssertion2397 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAssertion2407 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_ruleAssertion2444 = new BitSet(new long[]{0x0160000048000070L});
    public static final BitSet FOLLOW_ruleExpr_in_ruleAssertion2465 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleAssertion2477 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpr_in_entryRuleExpr2513 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExpr2523 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleArrowExpr_in_ruleExpr2569 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleArrowExpr_in_entryRuleArrowExpr2603 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleArrowExpr2613 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImpliesExpr_in_ruleArrowExpr2660 = new BitSet(new long[]{0x0000008000000002L});
    public static final BitSet FOLLOW_39_in_ruleArrowExpr2719 = new BitSet(new long[]{0x0160000048000070L});
    public static final BitSet FOLLOW_ruleArrowExpr_in_ruleArrowExpr2753 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImpliesExpr_in_entryRuleImpliesExpr2792 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleImpliesExpr2802 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOrExpr_in_ruleImpliesExpr2849 = new BitSet(new long[]{0x0000010000000002L});
    public static final BitSet FOLLOW_40_in_ruleImpliesExpr2908 = new BitSet(new long[]{0x0160000048000070L});
    public static final BitSet FOLLOW_ruleImpliesExpr_in_ruleImpliesExpr2942 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOrExpr_in_entryRuleOrExpr2981 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOrExpr2991 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAndExpr_in_ruleOrExpr3038 = new BitSet(new long[]{0x0000060000000002L});
    public static final BitSet FOLLOW_41_in_ruleOrExpr3118 = new BitSet(new long[]{0x0160000048000070L});
    public static final BitSet FOLLOW_42_in_ruleOrExpr3147 = new BitSet(new long[]{0x0160000048000070L});
    public static final BitSet FOLLOW_ruleAndExpr_in_ruleOrExpr3184 = new BitSet(new long[]{0x0000060000000002L});
    public static final BitSet FOLLOW_ruleAndExpr_in_entryRuleAndExpr3223 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAndExpr3233 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRelationalExpr_in_ruleAndExpr3280 = new BitSet(new long[]{0x0000080000000002L});
    public static final BitSet FOLLOW_43_in_ruleAndExpr3339 = new BitSet(new long[]{0x0160000048000070L});
    public static final BitSet FOLLOW_ruleRelationalExpr_in_ruleAndExpr3373 = new BitSet(new long[]{0x0000080000000002L});
    public static final BitSet FOLLOW_ruleRelationalExpr_in_entryRuleRelationalExpr3412 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRelationalExpr3422 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePlusExpr_in_ruleRelationalExpr3469 = new BitSet(new long[]{0x0001F00000002002L});
    public static final BitSet FOLLOW_44_in_ruleRelationalExpr3605 = new BitSet(new long[]{0x0160000048000070L});
    public static final BitSet FOLLOW_45_in_ruleRelationalExpr3634 = new BitSet(new long[]{0x0160000048000070L});
    public static final BitSet FOLLOW_46_in_ruleRelationalExpr3663 = new BitSet(new long[]{0x0160000048000070L});
    public static final BitSet FOLLOW_47_in_ruleRelationalExpr3692 = new BitSet(new long[]{0x0160000048000070L});
    public static final BitSet FOLLOW_13_in_ruleRelationalExpr3721 = new BitSet(new long[]{0x0160000048000070L});
    public static final BitSet FOLLOW_48_in_ruleRelationalExpr3750 = new BitSet(new long[]{0x0160000048000070L});
    public static final BitSet FOLLOW_rulePlusExpr_in_ruleRelationalExpr3787 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePlusExpr_in_entryRulePlusExpr3826 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePlusExpr3836 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTimesExpr_in_rulePlusExpr3883 = new BitSet(new long[]{0x0002000008000002L});
    public static final BitSet FOLLOW_49_in_rulePlusExpr3963 = new BitSet(new long[]{0x0160000048000070L});
    public static final BitSet FOLLOW_27_in_rulePlusExpr3992 = new BitSet(new long[]{0x0160000048000070L});
    public static final BitSet FOLLOW_ruleTimesExpr_in_rulePlusExpr4029 = new BitSet(new long[]{0x0002000008000002L});
    public static final BitSet FOLLOW_ruleTimesExpr_in_entryRuleTimesExpr4068 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTimesExpr4078 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrefixExpr_in_ruleTimesExpr4125 = new BitSet(new long[]{0x001C000000000002L});
    public static final BitSet FOLLOW_50_in_ruleTimesExpr4219 = new BitSet(new long[]{0x0160000048000070L});
    public static final BitSet FOLLOW_51_in_ruleTimesExpr4248 = new BitSet(new long[]{0x0160000048000070L});
    public static final BitSet FOLLOW_52_in_ruleTimesExpr4277 = new BitSet(new long[]{0x0160000048000070L});
    public static final BitSet FOLLOW_rulePrefixExpr_in_ruleTimesExpr4314 = new BitSet(new long[]{0x001C000000000002L});
    public static final BitSet FOLLOW_rulePrefixExpr_in_entryRulePrefixExpr4353 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePrefixExpr4363 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rulePrefixExpr4418 = new BitSet(new long[]{0x0160000048000070L});
    public static final BitSet FOLLOW_53_in_rulePrefixExpr4447 = new BitSet(new long[]{0x0160000048000070L});
    public static final BitSet FOLLOW_54_in_rulePrefixExpr4476 = new BitSet(new long[]{0x0160000048000070L});
    public static final BitSet FOLLOW_rulePrefixExpr_in_rulePrefixExpr4513 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProjectionExpr_in_rulePrefixExpr4542 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProjectionExpr_in_entryRuleProjectionExpr4577 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleProjectionExpr4587 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAtomicExpr_in_ruleProjectionExpr4634 = new BitSet(new long[]{0x0080000000000002L});
    public static final BitSet FOLLOW_55_in_ruleProjectionExpr4678 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleProjectionExpr4695 = new BitSet(new long[]{0x0080000000000002L});
    public static final BitSet FOLLOW_ruleAtomicExpr_in_entryRuleAtomicExpr4739 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAtomicExpr4749 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAtomicExpr4804 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleAtomicExpr4838 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleREAL_in_ruleAtomicExpr4881 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_BOOL_in_ruleAtomicExpr4915 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_56_in_ruleAtomicExpr4949 = new BitSet(new long[]{0x0160000048000070L});
    public static final BitSet FOLLOW_ruleExpr_in_ruleAtomicExpr4970 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_57_in_ruleAtomicExpr4982 = new BitSet(new long[]{0x0160000048000070L});
    public static final BitSet FOLLOW_ruleExpr_in_ruleAtomicExpr5003 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_58_in_ruleAtomicExpr5015 = new BitSet(new long[]{0x0160000048000070L});
    public static final BitSet FOLLOW_ruleExpr_in_ruleAtomicExpr5036 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAtomicExpr5073 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_ruleAtomicExpr5085 = new BitSet(new long[]{0x01600000C8000070L});
    public static final BitSet FOLLOW_ruleExpr_in_ruleAtomicExpr5107 = new BitSet(new long[]{0x0000000081000000L});
    public static final BitSet FOLLOW_24_in_ruleAtomicExpr5120 = new BitSet(new long[]{0x0160000048000070L});
    public static final BitSet FOLLOW_ruleExpr_in_ruleAtomicExpr5141 = new BitSet(new long[]{0x0000000081000000L});
    public static final BitSet FOLLOW_31_in_ruleAtomicExpr5157 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAtomicExpr5194 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleAtomicExpr5206 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAtomicExpr5223 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleAtomicExpr5240 = new BitSet(new long[]{0x0160000048000070L});
    public static final BitSet FOLLOW_ruleExpr_in_ruleAtomicExpr5261 = new BitSet(new long[]{0x0000000000044000L});
    public static final BitSet FOLLOW_14_in_ruleAtomicExpr5274 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAtomicExpr5291 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleAtomicExpr5308 = new BitSet(new long[]{0x0160000048000070L});
    public static final BitSet FOLLOW_ruleExpr_in_ruleAtomicExpr5329 = new BitSet(new long[]{0x0000000000044000L});
    public static final BitSet FOLLOW_18_in_ruleAtomicExpr5343 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_ruleAtomicExpr5363 = new BitSet(new long[]{0x0160000048000070L});
    public static final BitSet FOLLOW_ruleExpr_in_ruleAtomicExpr5385 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_ruleAtomicExpr5396 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleREAL_in_entryRuleREAL5436 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleREAL5447 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleREAL5487 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_55_in_ruleREAL5505 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleREAL5520 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_synpred1_InternalJKind2679 = new BitSet(new long[]{0x0160000048000070L});
    public static final BitSet FOLLOW_ruleArrowExpr_in_synpred1_InternalJKind2692 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_synpred2_InternalJKind2868 = new BitSet(new long[]{0x0160000048000070L});
    public static final BitSet FOLLOW_ruleImpliesExpr_in_synpred2_InternalJKind2881 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_synpred3_InternalJKind3056 = new BitSet(new long[]{0x0160000048000070L});
    public static final BitSet FOLLOW_ruleAndExpr_in_synpred3_InternalJKind3089 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_synpred4_InternalJKind3299 = new BitSet(new long[]{0x0160000048000070L});
    public static final BitSet FOLLOW_ruleRelationalExpr_in_synpred4_InternalJKind3312 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_synpred5_InternalJKind3487 = new BitSet(new long[]{0x0160000048000070L});
    public static final BitSet FOLLOW_rulePlusExpr_in_synpred5_InternalJKind3576 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_synpred6_InternalJKind3901 = new BitSet(new long[]{0x0160000048000070L});
    public static final BitSet FOLLOW_ruleTimesExpr_in_synpred6_InternalJKind3934 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_synpred7_InternalJKind4143 = new BitSet(new long[]{0x0160000048000070L});
    public static final BitSet FOLLOW_rulePrefixExpr_in_synpred7_InternalJKind4190 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_synpred8_InternalJKind4649 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_synpred8_InternalJKind4656 = new BitSet(new long[]{0x0000000000000002L});

}