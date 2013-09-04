package jkind.xtext.ui.contentassist.antlr.internal; 

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.DFA;
import jkind.xtext.services.JKindGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalJKindParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INT", "RULE_ID", "RULE_BOOL", "RULE_SL_COMMENT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'or'", "'xor'", "'<'", "'<='", "'>'", "'>='", "'='", "'<>'", "'+'", "'-'", "'*'", "'/'", "'div'", "'not'", "'pre'", "'type'", "';'", "'struct'", "'{'", "':'", "'}'", "'int'", "'bool'", "'real'", "'subrange'", "'['", "','", "']'", "'of'", "'const'", "'node'", "'('", "')'", "'returns'", "'let'", "'tel'", "'var'", "'--%PROPERTY'", "'--%MAIN'", "'assert'", "'if'", "'then'", "'else'", "'.'", "'->'", "'=>'", "'and'"
    };
    public static final int RULE_ID=5;
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
    public static final int RULE_INT=4;
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
    public String getGrammarFileName() { return "../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g"; }


     
     	private JKindGrammarAccess grammarAccess;
     	
        public void setGrammarAccess(JKindGrammarAccess grammarAccess) {
        	this.grammarAccess = grammarAccess;
        }
        
        @Override
        protected Grammar getGrammar() {
        	return grammarAccess.getGrammar();
        }
        
        @Override
        protected String getValueForTokenName(String tokenName) {
        	return tokenName;
        }




    // $ANTLR start "entryRuleFile"
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:61:1: entryRuleFile : ruleFile EOF ;
    public final void entryRuleFile() throws RecognitionException {
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:62:1: ( ruleFile EOF )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:63:1: ruleFile EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFileRule()); 
            }
            pushFollow(FOLLOW_ruleFile_in_entryRuleFile67);
            ruleFile();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFileRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleFile74); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleFile"


    // $ANTLR start "ruleFile"
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:70:1: ruleFile : ( ( rule__File__Alternatives )* ) ;
    public final void ruleFile() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:74:2: ( ( ( rule__File__Alternatives )* ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:75:1: ( ( rule__File__Alternatives )* )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:75:1: ( ( rule__File__Alternatives )* )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:76:1: ( rule__File__Alternatives )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFileAccess().getAlternatives()); 
            }
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:77:1: ( rule__File__Alternatives )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==27||(LA1_0>=41 && LA1_0<=42)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:77:2: rule__File__Alternatives
            	    {
            	    pushFollow(FOLLOW_rule__File__Alternatives_in_ruleFile100);
            	    rule__File__Alternatives();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFileAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFile"


    // $ANTLR start "entryRuleTypedef"
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:89:1: entryRuleTypedef : ruleTypedef EOF ;
    public final void entryRuleTypedef() throws RecognitionException {
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:90:1: ( ruleTypedef EOF )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:91:1: ruleTypedef EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypedefRule()); 
            }
            pushFollow(FOLLOW_ruleTypedef_in_entryRuleTypedef128);
            ruleTypedef();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTypedefRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleTypedef135); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleTypedef"


    // $ANTLR start "ruleTypedef"
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:98:1: ruleTypedef : ( ( rule__Typedef__Group__0 ) ) ;
    public final void ruleTypedef() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:102:2: ( ( ( rule__Typedef__Group__0 ) ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:103:1: ( ( rule__Typedef__Group__0 ) )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:103:1: ( ( rule__Typedef__Group__0 ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:104:1: ( rule__Typedef__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypedefAccess().getGroup()); 
            }
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:105:1: ( rule__Typedef__Group__0 )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:105:2: rule__Typedef__Group__0
            {
            pushFollow(FOLLOW_rule__Typedef__Group__0_in_ruleTypedef161);
            rule__Typedef__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTypedefAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTypedef"


    // $ANTLR start "entryRuleTopLevelType"
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:117:1: entryRuleTopLevelType : ruleTopLevelType EOF ;
    public final void entryRuleTopLevelType() throws RecognitionException {
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:118:1: ( ruleTopLevelType EOF )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:119:1: ruleTopLevelType EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTopLevelTypeRule()); 
            }
            pushFollow(FOLLOW_ruleTopLevelType_in_entryRuleTopLevelType188);
            ruleTopLevelType();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTopLevelTypeRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleTopLevelType195); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleTopLevelType"


    // $ANTLR start "ruleTopLevelType"
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:126:1: ruleTopLevelType : ( ( rule__TopLevelType__Alternatives ) ) ;
    public final void ruleTopLevelType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:130:2: ( ( ( rule__TopLevelType__Alternatives ) ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:131:1: ( ( rule__TopLevelType__Alternatives ) )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:131:1: ( ( rule__TopLevelType__Alternatives ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:132:1: ( rule__TopLevelType__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTopLevelTypeAccess().getAlternatives()); 
            }
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:133:1: ( rule__TopLevelType__Alternatives )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:133:2: rule__TopLevelType__Alternatives
            {
            pushFollow(FOLLOW_rule__TopLevelType__Alternatives_in_ruleTopLevelType221);
            rule__TopLevelType__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTopLevelTypeAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTopLevelType"


    // $ANTLR start "entryRuleType"
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:145:1: entryRuleType : ruleType EOF ;
    public final void entryRuleType() throws RecognitionException {
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:146:1: ( ruleType EOF )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:147:1: ruleType EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypeRule()); 
            }
            pushFollow(FOLLOW_ruleType_in_entryRuleType248);
            ruleType();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTypeRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleType255); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleType"


    // $ANTLR start "ruleType"
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:154:1: ruleType : ( ( rule__Type__Alternatives ) ) ;
    public final void ruleType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:158:2: ( ( ( rule__Type__Alternatives ) ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:159:1: ( ( rule__Type__Alternatives ) )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:159:1: ( ( rule__Type__Alternatives ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:160:1: ( rule__Type__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypeAccess().getAlternatives()); 
            }
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:161:1: ( rule__Type__Alternatives )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:161:2: rule__Type__Alternatives
            {
            pushFollow(FOLLOW_rule__Type__Alternatives_in_ruleType281);
            rule__Type__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTypeAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleType"


    // $ANTLR start "entryRuleBound"
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:173:1: entryRuleBound : ruleBound EOF ;
    public final void entryRuleBound() throws RecognitionException {
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:174:1: ( ruleBound EOF )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:175:1: ruleBound EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBoundRule()); 
            }
            pushFollow(FOLLOW_ruleBound_in_entryRuleBound308);
            ruleBound();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBoundRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleBound315); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleBound"


    // $ANTLR start "ruleBound"
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:182:1: ruleBound : ( ( rule__Bound__Group__0 ) ) ;
    public final void ruleBound() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:186:2: ( ( ( rule__Bound__Group__0 ) ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:187:1: ( ( rule__Bound__Group__0 ) )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:187:1: ( ( rule__Bound__Group__0 ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:188:1: ( rule__Bound__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBoundAccess().getGroup()); 
            }
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:189:1: ( rule__Bound__Group__0 )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:189:2: rule__Bound__Group__0
            {
            pushFollow(FOLLOW_rule__Bound__Group__0_in_ruleBound341);
            rule__Bound__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBoundAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBound"


    // $ANTLR start "entryRuleConstant"
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:201:1: entryRuleConstant : ruleConstant EOF ;
    public final void entryRuleConstant() throws RecognitionException {
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:202:1: ( ruleConstant EOF )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:203:1: ruleConstant EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConstantRule()); 
            }
            pushFollow(FOLLOW_ruleConstant_in_entryRuleConstant368);
            ruleConstant();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getConstantRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleConstant375); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleConstant"


    // $ANTLR start "ruleConstant"
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:210:1: ruleConstant : ( ( rule__Constant__Group__0 ) ) ;
    public final void ruleConstant() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:214:2: ( ( ( rule__Constant__Group__0 ) ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:215:1: ( ( rule__Constant__Group__0 ) )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:215:1: ( ( rule__Constant__Group__0 ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:216:1: ( rule__Constant__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConstantAccess().getGroup()); 
            }
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:217:1: ( rule__Constant__Group__0 )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:217:2: rule__Constant__Group__0
            {
            pushFollow(FOLLOW_rule__Constant__Group__0_in_ruleConstant401);
            rule__Constant__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getConstantAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleConstant"


    // $ANTLR start "entryRuleNode"
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:231:1: entryRuleNode : ruleNode EOF ;
    public final void entryRuleNode() throws RecognitionException {
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:232:1: ( ruleNode EOF )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:233:1: ruleNode EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNodeRule()); 
            }
            pushFollow(FOLLOW_ruleNode_in_entryRuleNode430);
            ruleNode();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getNodeRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleNode437); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleNode"


    // $ANTLR start "ruleNode"
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:240:1: ruleNode : ( ( rule__Node__Group__0 ) ) ;
    public final void ruleNode() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:244:2: ( ( ( rule__Node__Group__0 ) ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:245:1: ( ( rule__Node__Group__0 ) )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:245:1: ( ( rule__Node__Group__0 ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:246:1: ( rule__Node__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNodeAccess().getGroup()); 
            }
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:247:1: ( rule__Node__Group__0 )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:247:2: rule__Node__Group__0
            {
            pushFollow(FOLLOW_rule__Node__Group__0_in_ruleNode463);
            rule__Node__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getNodeAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleNode"


    // $ANTLR start "entryRuleVarGroup"
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:259:1: entryRuleVarGroup : ruleVarGroup EOF ;
    public final void entryRuleVarGroup() throws RecognitionException {
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:260:1: ( ruleVarGroup EOF )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:261:1: ruleVarGroup EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVarGroupRule()); 
            }
            pushFollow(FOLLOW_ruleVarGroup_in_entryRuleVarGroup490);
            ruleVarGroup();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getVarGroupRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleVarGroup497); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleVarGroup"


    // $ANTLR start "ruleVarGroup"
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:268:1: ruleVarGroup : ( ( rule__VarGroup__Group__0 ) ) ;
    public final void ruleVarGroup() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:272:2: ( ( ( rule__VarGroup__Group__0 ) ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:273:1: ( ( rule__VarGroup__Group__0 ) )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:273:1: ( ( rule__VarGroup__Group__0 ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:274:1: ( rule__VarGroup__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVarGroupAccess().getGroup()); 
            }
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:275:1: ( rule__VarGroup__Group__0 )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:275:2: rule__VarGroup__Group__0
            {
            pushFollow(FOLLOW_rule__VarGroup__Group__0_in_ruleVarGroup523);
            rule__VarGroup__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getVarGroupAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleVarGroup"


    // $ANTLR start "entryRuleVar"
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:287:1: entryRuleVar : ruleVar EOF ;
    public final void entryRuleVar() throws RecognitionException {
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:288:1: ( ruleVar EOF )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:289:1: ruleVar EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVarRule()); 
            }
            pushFollow(FOLLOW_ruleVar_in_entryRuleVar550);
            ruleVar();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getVarRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleVar557); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleVar"


    // $ANTLR start "ruleVar"
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:296:1: ruleVar : ( ( rule__Var__NameAssignment ) ) ;
    public final void ruleVar() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:300:2: ( ( ( rule__Var__NameAssignment ) ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:301:1: ( ( rule__Var__NameAssignment ) )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:301:1: ( ( rule__Var__NameAssignment ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:302:1: ( rule__Var__NameAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVarAccess().getNameAssignment()); 
            }
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:303:1: ( rule__Var__NameAssignment )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:303:2: rule__Var__NameAssignment
            {
            pushFollow(FOLLOW_rule__Var__NameAssignment_in_ruleVar583);
            rule__Var__NameAssignment();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getVarAccess().getNameAssignment()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleVar"


    // $ANTLR start "entryRuleEquation"
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:315:1: entryRuleEquation : ruleEquation EOF ;
    public final void entryRuleEquation() throws RecognitionException {
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:316:1: ( ruleEquation EOF )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:317:1: ruleEquation EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEquationRule()); 
            }
            pushFollow(FOLLOW_ruleEquation_in_entryRuleEquation610);
            ruleEquation();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEquationRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleEquation617); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEquation"


    // $ANTLR start "ruleEquation"
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:324:1: ruleEquation : ( ( rule__Equation__Group__0 ) ) ;
    public final void ruleEquation() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:328:2: ( ( ( rule__Equation__Group__0 ) ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:329:1: ( ( rule__Equation__Group__0 ) )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:329:1: ( ( rule__Equation__Group__0 ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:330:1: ( rule__Equation__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEquationAccess().getGroup()); 
            }
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:331:1: ( rule__Equation__Group__0 )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:331:2: rule__Equation__Group__0
            {
            pushFollow(FOLLOW_rule__Equation__Group__0_in_ruleEquation643);
            rule__Equation__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEquationAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEquation"


    // $ANTLR start "entryRuleProperty"
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:343:1: entryRuleProperty : ruleProperty EOF ;
    public final void entryRuleProperty() throws RecognitionException {
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:344:1: ( ruleProperty EOF )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:345:1: ruleProperty EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPropertyRule()); 
            }
            pushFollow(FOLLOW_ruleProperty_in_entryRuleProperty670);
            ruleProperty();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPropertyRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleProperty677); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleProperty"


    // $ANTLR start "ruleProperty"
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:352:1: ruleProperty : ( ( rule__Property__Group__0 ) ) ;
    public final void ruleProperty() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:356:2: ( ( ( rule__Property__Group__0 ) ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:357:1: ( ( rule__Property__Group__0 ) )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:357:1: ( ( rule__Property__Group__0 ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:358:1: ( rule__Property__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPropertyAccess().getGroup()); 
            }
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:359:1: ( rule__Property__Group__0 )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:359:2: rule__Property__Group__0
            {
            pushFollow(FOLLOW_rule__Property__Group__0_in_ruleProperty703);
            rule__Property__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPropertyAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleProperty"


    // $ANTLR start "entryRuleMain"
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:371:1: entryRuleMain : ruleMain EOF ;
    public final void entryRuleMain() throws RecognitionException {
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:372:1: ( ruleMain EOF )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:373:1: ruleMain EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMainRule()); 
            }
            pushFollow(FOLLOW_ruleMain_in_entryRuleMain730);
            ruleMain();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMainRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleMain737); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleMain"


    // $ANTLR start "ruleMain"
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:380:1: ruleMain : ( ( rule__Main__Group__0 ) ) ;
    public final void ruleMain() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:384:2: ( ( ( rule__Main__Group__0 ) ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:385:1: ( ( rule__Main__Group__0 ) )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:385:1: ( ( rule__Main__Group__0 ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:386:1: ( rule__Main__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMainAccess().getGroup()); 
            }
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:387:1: ( rule__Main__Group__0 )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:387:2: rule__Main__Group__0
            {
            pushFollow(FOLLOW_rule__Main__Group__0_in_ruleMain763);
            rule__Main__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMainAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMain"


    // $ANTLR start "entryRuleAssertion"
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:399:1: entryRuleAssertion : ruleAssertion EOF ;
    public final void entryRuleAssertion() throws RecognitionException {
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:400:1: ( ruleAssertion EOF )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:401:1: ruleAssertion EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAssertionRule()); 
            }
            pushFollow(FOLLOW_ruleAssertion_in_entryRuleAssertion790);
            ruleAssertion();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAssertionRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAssertion797); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAssertion"


    // $ANTLR start "ruleAssertion"
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:408:1: ruleAssertion : ( ( rule__Assertion__Group__0 ) ) ;
    public final void ruleAssertion() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:412:2: ( ( ( rule__Assertion__Group__0 ) ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:413:1: ( ( rule__Assertion__Group__0 ) )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:413:1: ( ( rule__Assertion__Group__0 ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:414:1: ( rule__Assertion__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAssertionAccess().getGroup()); 
            }
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:415:1: ( rule__Assertion__Group__0 )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:415:2: rule__Assertion__Group__0
            {
            pushFollow(FOLLOW_rule__Assertion__Group__0_in_ruleAssertion823);
            rule__Assertion__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAssertionAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAssertion"


    // $ANTLR start "entryRuleExpr"
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:427:1: entryRuleExpr : ruleExpr EOF ;
    public final void entryRuleExpr() throws RecognitionException {
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:428:1: ( ruleExpr EOF )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:429:1: ruleExpr EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExprRule()); 
            }
            pushFollow(FOLLOW_ruleExpr_in_entryRuleExpr850);
            ruleExpr();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExprRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleExpr857); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleExpr"


    // $ANTLR start "ruleExpr"
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:436:1: ruleExpr : ( ruleArrowExpr ) ;
    public final void ruleExpr() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:440:2: ( ( ruleArrowExpr ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:441:1: ( ruleArrowExpr )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:441:1: ( ruleArrowExpr )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:442:1: ruleArrowExpr
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExprAccess().getArrowExprParserRuleCall()); 
            }
            pushFollow(FOLLOW_ruleArrowExpr_in_ruleExpr883);
            ruleArrowExpr();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExprAccess().getArrowExprParserRuleCall()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleExpr"


    // $ANTLR start "entryRuleArrowExpr"
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:455:1: entryRuleArrowExpr : ruleArrowExpr EOF ;
    public final void entryRuleArrowExpr() throws RecognitionException {
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:456:1: ( ruleArrowExpr EOF )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:457:1: ruleArrowExpr EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getArrowExprRule()); 
            }
            pushFollow(FOLLOW_ruleArrowExpr_in_entryRuleArrowExpr909);
            ruleArrowExpr();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getArrowExprRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleArrowExpr916); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleArrowExpr"


    // $ANTLR start "ruleArrowExpr"
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:464:1: ruleArrowExpr : ( ( rule__ArrowExpr__Group__0 ) ) ;
    public final void ruleArrowExpr() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:468:2: ( ( ( rule__ArrowExpr__Group__0 ) ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:469:1: ( ( rule__ArrowExpr__Group__0 ) )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:469:1: ( ( rule__ArrowExpr__Group__0 ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:470:1: ( rule__ArrowExpr__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getArrowExprAccess().getGroup()); 
            }
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:471:1: ( rule__ArrowExpr__Group__0 )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:471:2: rule__ArrowExpr__Group__0
            {
            pushFollow(FOLLOW_rule__ArrowExpr__Group__0_in_ruleArrowExpr942);
            rule__ArrowExpr__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getArrowExprAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleArrowExpr"


    // $ANTLR start "entryRuleImpliesExpr"
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:483:1: entryRuleImpliesExpr : ruleImpliesExpr EOF ;
    public final void entryRuleImpliesExpr() throws RecognitionException {
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:484:1: ( ruleImpliesExpr EOF )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:485:1: ruleImpliesExpr EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getImpliesExprRule()); 
            }
            pushFollow(FOLLOW_ruleImpliesExpr_in_entryRuleImpliesExpr969);
            ruleImpliesExpr();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getImpliesExprRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleImpliesExpr976); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleImpliesExpr"


    // $ANTLR start "ruleImpliesExpr"
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:492:1: ruleImpliesExpr : ( ( rule__ImpliesExpr__Group__0 ) ) ;
    public final void ruleImpliesExpr() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:496:2: ( ( ( rule__ImpliesExpr__Group__0 ) ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:497:1: ( ( rule__ImpliesExpr__Group__0 ) )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:497:1: ( ( rule__ImpliesExpr__Group__0 ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:498:1: ( rule__ImpliesExpr__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getImpliesExprAccess().getGroup()); 
            }
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:499:1: ( rule__ImpliesExpr__Group__0 )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:499:2: rule__ImpliesExpr__Group__0
            {
            pushFollow(FOLLOW_rule__ImpliesExpr__Group__0_in_ruleImpliesExpr1002);
            rule__ImpliesExpr__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getImpliesExprAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleImpliesExpr"


    // $ANTLR start "entryRuleOrExpr"
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:511:1: entryRuleOrExpr : ruleOrExpr EOF ;
    public final void entryRuleOrExpr() throws RecognitionException {
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:512:1: ( ruleOrExpr EOF )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:513:1: ruleOrExpr EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOrExprRule()); 
            }
            pushFollow(FOLLOW_ruleOrExpr_in_entryRuleOrExpr1029);
            ruleOrExpr();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getOrExprRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOrExpr1036); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleOrExpr"


    // $ANTLR start "ruleOrExpr"
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:520:1: ruleOrExpr : ( ( rule__OrExpr__Group__0 ) ) ;
    public final void ruleOrExpr() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:524:2: ( ( ( rule__OrExpr__Group__0 ) ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:525:1: ( ( rule__OrExpr__Group__0 ) )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:525:1: ( ( rule__OrExpr__Group__0 ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:526:1: ( rule__OrExpr__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOrExprAccess().getGroup()); 
            }
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:527:1: ( rule__OrExpr__Group__0 )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:527:2: rule__OrExpr__Group__0
            {
            pushFollow(FOLLOW_rule__OrExpr__Group__0_in_ruleOrExpr1062);
            rule__OrExpr__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getOrExprAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleOrExpr"


    // $ANTLR start "entryRuleAndExpr"
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:539:1: entryRuleAndExpr : ruleAndExpr EOF ;
    public final void entryRuleAndExpr() throws RecognitionException {
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:540:1: ( ruleAndExpr EOF )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:541:1: ruleAndExpr EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAndExprRule()); 
            }
            pushFollow(FOLLOW_ruleAndExpr_in_entryRuleAndExpr1089);
            ruleAndExpr();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAndExprRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAndExpr1096); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAndExpr"


    // $ANTLR start "ruleAndExpr"
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:548:1: ruleAndExpr : ( ( rule__AndExpr__Group__0 ) ) ;
    public final void ruleAndExpr() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:552:2: ( ( ( rule__AndExpr__Group__0 ) ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:553:1: ( ( rule__AndExpr__Group__0 ) )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:553:1: ( ( rule__AndExpr__Group__0 ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:554:1: ( rule__AndExpr__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAndExprAccess().getGroup()); 
            }
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:555:1: ( rule__AndExpr__Group__0 )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:555:2: rule__AndExpr__Group__0
            {
            pushFollow(FOLLOW_rule__AndExpr__Group__0_in_ruleAndExpr1122);
            rule__AndExpr__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAndExprAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAndExpr"


    // $ANTLR start "entryRuleRelationalExpr"
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:567:1: entryRuleRelationalExpr : ruleRelationalExpr EOF ;
    public final void entryRuleRelationalExpr() throws RecognitionException {
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:568:1: ( ruleRelationalExpr EOF )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:569:1: ruleRelationalExpr EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRelationalExprRule()); 
            }
            pushFollow(FOLLOW_ruleRelationalExpr_in_entryRuleRelationalExpr1149);
            ruleRelationalExpr();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRelationalExprRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleRelationalExpr1156); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleRelationalExpr"


    // $ANTLR start "ruleRelationalExpr"
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:576:1: ruleRelationalExpr : ( ( rule__RelationalExpr__Group__0 ) ) ;
    public final void ruleRelationalExpr() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:580:2: ( ( ( rule__RelationalExpr__Group__0 ) ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:581:1: ( ( rule__RelationalExpr__Group__0 ) )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:581:1: ( ( rule__RelationalExpr__Group__0 ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:582:1: ( rule__RelationalExpr__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRelationalExprAccess().getGroup()); 
            }
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:583:1: ( rule__RelationalExpr__Group__0 )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:583:2: rule__RelationalExpr__Group__0
            {
            pushFollow(FOLLOW_rule__RelationalExpr__Group__0_in_ruleRelationalExpr1182);
            rule__RelationalExpr__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRelationalExprAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRelationalExpr"


    // $ANTLR start "entryRulePlusExpr"
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:595:1: entryRulePlusExpr : rulePlusExpr EOF ;
    public final void entryRulePlusExpr() throws RecognitionException {
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:596:1: ( rulePlusExpr EOF )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:597:1: rulePlusExpr EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPlusExprRule()); 
            }
            pushFollow(FOLLOW_rulePlusExpr_in_entryRulePlusExpr1209);
            rulePlusExpr();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPlusExprRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulePlusExpr1216); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePlusExpr"


    // $ANTLR start "rulePlusExpr"
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:604:1: rulePlusExpr : ( ( rule__PlusExpr__Group__0 ) ) ;
    public final void rulePlusExpr() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:608:2: ( ( ( rule__PlusExpr__Group__0 ) ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:609:1: ( ( rule__PlusExpr__Group__0 ) )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:609:1: ( ( rule__PlusExpr__Group__0 ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:610:1: ( rule__PlusExpr__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPlusExprAccess().getGroup()); 
            }
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:611:1: ( rule__PlusExpr__Group__0 )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:611:2: rule__PlusExpr__Group__0
            {
            pushFollow(FOLLOW_rule__PlusExpr__Group__0_in_rulePlusExpr1242);
            rule__PlusExpr__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPlusExprAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePlusExpr"


    // $ANTLR start "entryRuleTimesExpr"
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:623:1: entryRuleTimesExpr : ruleTimesExpr EOF ;
    public final void entryRuleTimesExpr() throws RecognitionException {
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:624:1: ( ruleTimesExpr EOF )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:625:1: ruleTimesExpr EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTimesExprRule()); 
            }
            pushFollow(FOLLOW_ruleTimesExpr_in_entryRuleTimesExpr1269);
            ruleTimesExpr();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTimesExprRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleTimesExpr1276); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleTimesExpr"


    // $ANTLR start "ruleTimesExpr"
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:632:1: ruleTimesExpr : ( ( rule__TimesExpr__Group__0 ) ) ;
    public final void ruleTimesExpr() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:636:2: ( ( ( rule__TimesExpr__Group__0 ) ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:637:1: ( ( rule__TimesExpr__Group__0 ) )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:637:1: ( ( rule__TimesExpr__Group__0 ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:638:1: ( rule__TimesExpr__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTimesExprAccess().getGroup()); 
            }
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:639:1: ( rule__TimesExpr__Group__0 )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:639:2: rule__TimesExpr__Group__0
            {
            pushFollow(FOLLOW_rule__TimesExpr__Group__0_in_ruleTimesExpr1302);
            rule__TimesExpr__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTimesExprAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTimesExpr"


    // $ANTLR start "entryRulePrefixExpr"
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:651:1: entryRulePrefixExpr : rulePrefixExpr EOF ;
    public final void entryRulePrefixExpr() throws RecognitionException {
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:652:1: ( rulePrefixExpr EOF )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:653:1: rulePrefixExpr EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPrefixExprRule()); 
            }
            pushFollow(FOLLOW_rulePrefixExpr_in_entryRulePrefixExpr1329);
            rulePrefixExpr();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPrefixExprRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulePrefixExpr1336); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePrefixExpr"


    // $ANTLR start "rulePrefixExpr"
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:660:1: rulePrefixExpr : ( ( rule__PrefixExpr__Alternatives ) ) ;
    public final void rulePrefixExpr() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:664:2: ( ( ( rule__PrefixExpr__Alternatives ) ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:665:1: ( ( rule__PrefixExpr__Alternatives ) )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:665:1: ( ( rule__PrefixExpr__Alternatives ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:666:1: ( rule__PrefixExpr__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPrefixExprAccess().getAlternatives()); 
            }
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:667:1: ( rule__PrefixExpr__Alternatives )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:667:2: rule__PrefixExpr__Alternatives
            {
            pushFollow(FOLLOW_rule__PrefixExpr__Alternatives_in_rulePrefixExpr1362);
            rule__PrefixExpr__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPrefixExprAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePrefixExpr"


    // $ANTLR start "entryRuleAtomicExpr"
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:679:1: entryRuleAtomicExpr : ruleAtomicExpr EOF ;
    public final void entryRuleAtomicExpr() throws RecognitionException {
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:680:1: ( ruleAtomicExpr EOF )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:681:1: ruleAtomicExpr EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAtomicExprRule()); 
            }
            pushFollow(FOLLOW_ruleAtomicExpr_in_entryRuleAtomicExpr1389);
            ruleAtomicExpr();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAtomicExprRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAtomicExpr1396); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAtomicExpr"


    // $ANTLR start "ruleAtomicExpr"
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:688:1: ruleAtomicExpr : ( ( rule__AtomicExpr__Alternatives ) ) ;
    public final void ruleAtomicExpr() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:692:2: ( ( ( rule__AtomicExpr__Alternatives ) ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:693:1: ( ( rule__AtomicExpr__Alternatives ) )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:693:1: ( ( rule__AtomicExpr__Alternatives ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:694:1: ( rule__AtomicExpr__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAtomicExprAccess().getAlternatives()); 
            }
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:695:1: ( rule__AtomicExpr__Alternatives )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:695:2: rule__AtomicExpr__Alternatives
            {
            pushFollow(FOLLOW_rule__AtomicExpr__Alternatives_in_ruleAtomicExpr1422);
            rule__AtomicExpr__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAtomicExprAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAtomicExpr"


    // $ANTLR start "entryRuleREAL"
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:707:1: entryRuleREAL : ruleREAL EOF ;
    public final void entryRuleREAL() throws RecognitionException {
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:708:1: ( ruleREAL EOF )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:709:1: ruleREAL EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getREALRule()); 
            }
            pushFollow(FOLLOW_ruleREAL_in_entryRuleREAL1449);
            ruleREAL();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getREALRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleREAL1456); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleREAL"


    // $ANTLR start "ruleREAL"
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:716:1: ruleREAL : ( ( rule__REAL__Group__0 ) ) ;
    public final void ruleREAL() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:720:2: ( ( ( rule__REAL__Group__0 ) ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:721:1: ( ( rule__REAL__Group__0 ) )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:721:1: ( ( rule__REAL__Group__0 ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:722:1: ( rule__REAL__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getREALAccess().getGroup()); 
            }
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:723:1: ( rule__REAL__Group__0 )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:723:2: rule__REAL__Group__0
            {
            pushFollow(FOLLOW_rule__REAL__Group__0_in_ruleREAL1482);
            rule__REAL__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getREALAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleREAL"


    // $ANTLR start "rule__File__Alternatives"
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:735:1: rule__File__Alternatives : ( ( ( rule__File__TypedefsAssignment_0 ) ) | ( ( rule__File__ConstantsAssignment_1 ) ) | ( ( rule__File__NodesAssignment_2 ) ) );
    public final void rule__File__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:739:1: ( ( ( rule__File__TypedefsAssignment_0 ) ) | ( ( rule__File__ConstantsAssignment_1 ) ) | ( ( rule__File__NodesAssignment_2 ) ) )
            int alt2=3;
            switch ( input.LA(1) ) {
            case 27:
                {
                alt2=1;
                }
                break;
            case 41:
                {
                alt2=2;
                }
                break;
            case 42:
                {
                alt2=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:740:1: ( ( rule__File__TypedefsAssignment_0 ) )
                    {
                    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:740:1: ( ( rule__File__TypedefsAssignment_0 ) )
                    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:741:1: ( rule__File__TypedefsAssignment_0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getFileAccess().getTypedefsAssignment_0()); 
                    }
                    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:742:1: ( rule__File__TypedefsAssignment_0 )
                    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:742:2: rule__File__TypedefsAssignment_0
                    {
                    pushFollow(FOLLOW_rule__File__TypedefsAssignment_0_in_rule__File__Alternatives1518);
                    rule__File__TypedefsAssignment_0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getFileAccess().getTypedefsAssignment_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:746:6: ( ( rule__File__ConstantsAssignment_1 ) )
                    {
                    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:746:6: ( ( rule__File__ConstantsAssignment_1 ) )
                    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:747:1: ( rule__File__ConstantsAssignment_1 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getFileAccess().getConstantsAssignment_1()); 
                    }
                    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:748:1: ( rule__File__ConstantsAssignment_1 )
                    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:748:2: rule__File__ConstantsAssignment_1
                    {
                    pushFollow(FOLLOW_rule__File__ConstantsAssignment_1_in_rule__File__Alternatives1536);
                    rule__File__ConstantsAssignment_1();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getFileAccess().getConstantsAssignment_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:752:6: ( ( rule__File__NodesAssignment_2 ) )
                    {
                    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:752:6: ( ( rule__File__NodesAssignment_2 ) )
                    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:753:1: ( rule__File__NodesAssignment_2 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getFileAccess().getNodesAssignment_2()); 
                    }
                    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:754:1: ( rule__File__NodesAssignment_2 )
                    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:754:2: rule__File__NodesAssignment_2
                    {
                    pushFollow(FOLLOW_rule__File__NodesAssignment_2_in_rule__File__Alternatives1554);
                    rule__File__NodesAssignment_2();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getFileAccess().getNodesAssignment_2()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__File__Alternatives"


    // $ANTLR start "rule__TopLevelType__Alternatives"
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:763:1: rule__TopLevelType__Alternatives : ( ( ( rule__TopLevelType__Group_0__0 ) ) | ( ruleType ) );
    public final void rule__TopLevelType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:767:1: ( ( ( rule__TopLevelType__Group_0__0 ) ) | ( ruleType ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==29) ) {
                alt3=1;
            }
            else if ( (LA3_0==RULE_ID||(LA3_0>=33 && LA3_0<=36)) ) {
                alt3=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:768:1: ( ( rule__TopLevelType__Group_0__0 ) )
                    {
                    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:768:1: ( ( rule__TopLevelType__Group_0__0 ) )
                    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:769:1: ( rule__TopLevelType__Group_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getTopLevelTypeAccess().getGroup_0()); 
                    }
                    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:770:1: ( rule__TopLevelType__Group_0__0 )
                    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:770:2: rule__TopLevelType__Group_0__0
                    {
                    pushFollow(FOLLOW_rule__TopLevelType__Group_0__0_in_rule__TopLevelType__Alternatives1587);
                    rule__TopLevelType__Group_0__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getTopLevelTypeAccess().getGroup_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:774:6: ( ruleType )
                    {
                    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:774:6: ( ruleType )
                    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:775:1: ruleType
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getTopLevelTypeAccess().getTypeParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_ruleType_in_rule__TopLevelType__Alternatives1605);
                    ruleType();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getTopLevelTypeAccess().getTypeParserRuleCall_1()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TopLevelType__Alternatives"


    // $ANTLR start "rule__Type__Alternatives"
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:785:1: rule__Type__Alternatives : ( ( ( rule__Type__Group_0__0 ) ) | ( ( rule__Type__Group_1__0 ) ) | ( ( rule__Type__Group_2__0 ) ) | ( ( rule__Type__Group_3__0 ) ) | ( ( rule__Type__Group_4__0 ) ) );
    public final void rule__Type__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:789:1: ( ( ( rule__Type__Group_0__0 ) ) | ( ( rule__Type__Group_1__0 ) ) | ( ( rule__Type__Group_2__0 ) ) | ( ( rule__Type__Group_3__0 ) ) | ( ( rule__Type__Group_4__0 ) ) )
            int alt4=5;
            switch ( input.LA(1) ) {
            case 33:
                {
                alt4=1;
                }
                break;
            case 34:
                {
                alt4=2;
                }
                break;
            case 35:
                {
                alt4=3;
                }
                break;
            case 36:
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
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:790:1: ( ( rule__Type__Group_0__0 ) )
                    {
                    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:790:1: ( ( rule__Type__Group_0__0 ) )
                    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:791:1: ( rule__Type__Group_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getTypeAccess().getGroup_0()); 
                    }
                    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:792:1: ( rule__Type__Group_0__0 )
                    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:792:2: rule__Type__Group_0__0
                    {
                    pushFollow(FOLLOW_rule__Type__Group_0__0_in_rule__Type__Alternatives1637);
                    rule__Type__Group_0__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getTypeAccess().getGroup_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:796:6: ( ( rule__Type__Group_1__0 ) )
                    {
                    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:796:6: ( ( rule__Type__Group_1__0 ) )
                    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:797:1: ( rule__Type__Group_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getTypeAccess().getGroup_1()); 
                    }
                    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:798:1: ( rule__Type__Group_1__0 )
                    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:798:2: rule__Type__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__Type__Group_1__0_in_rule__Type__Alternatives1655);
                    rule__Type__Group_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getTypeAccess().getGroup_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:802:6: ( ( rule__Type__Group_2__0 ) )
                    {
                    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:802:6: ( ( rule__Type__Group_2__0 ) )
                    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:803:1: ( rule__Type__Group_2__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getTypeAccess().getGroup_2()); 
                    }
                    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:804:1: ( rule__Type__Group_2__0 )
                    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:804:2: rule__Type__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__Type__Group_2__0_in_rule__Type__Alternatives1673);
                    rule__Type__Group_2__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getTypeAccess().getGroup_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:808:6: ( ( rule__Type__Group_3__0 ) )
                    {
                    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:808:6: ( ( rule__Type__Group_3__0 ) )
                    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:809:1: ( rule__Type__Group_3__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getTypeAccess().getGroup_3()); 
                    }
                    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:810:1: ( rule__Type__Group_3__0 )
                    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:810:2: rule__Type__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__Type__Group_3__0_in_rule__Type__Alternatives1691);
                    rule__Type__Group_3__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getTypeAccess().getGroup_3()); 
                    }

                    }


                    }
                    break;
                case 5 :
                    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:814:6: ( ( rule__Type__Group_4__0 ) )
                    {
                    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:814:6: ( ( rule__Type__Group_4__0 ) )
                    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:815:1: ( rule__Type__Group_4__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getTypeAccess().getGroup_4()); 
                    }
                    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:816:1: ( rule__Type__Group_4__0 )
                    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:816:2: rule__Type__Group_4__0
                    {
                    pushFollow(FOLLOW_rule__Type__Group_4__0_in_rule__Type__Alternatives1709);
                    rule__Type__Group_4__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getTypeAccess().getGroup_4()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Alternatives"


    // $ANTLR start "rule__Node__Alternatives_12"
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:826:1: rule__Node__Alternatives_12 : ( ( ( rule__Node__EquationsAssignment_12_0 ) ) | ( ( rule__Node__PropertiesAssignment_12_1 ) ) | ( ( rule__Node__AssertionsAssignment_12_2 ) ) | ( ( rule__Node__MainAssignment_12_3 ) ) );
    public final void rule__Node__Alternatives_12() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:830:1: ( ( ( rule__Node__EquationsAssignment_12_0 ) ) | ( ( rule__Node__PropertiesAssignment_12_1 ) ) | ( ( rule__Node__AssertionsAssignment_12_2 ) ) | ( ( rule__Node__MainAssignment_12_3 ) ) )
            int alt5=4;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt5=1;
                }
                break;
            case 49:
                {
                alt5=2;
                }
                break;
            case 51:
                {
                alt5=3;
                }
                break;
            case 50:
                {
                alt5=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:831:1: ( ( rule__Node__EquationsAssignment_12_0 ) )
                    {
                    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:831:1: ( ( rule__Node__EquationsAssignment_12_0 ) )
                    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:832:1: ( rule__Node__EquationsAssignment_12_0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getNodeAccess().getEquationsAssignment_12_0()); 
                    }
                    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:833:1: ( rule__Node__EquationsAssignment_12_0 )
                    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:833:2: rule__Node__EquationsAssignment_12_0
                    {
                    pushFollow(FOLLOW_rule__Node__EquationsAssignment_12_0_in_rule__Node__Alternatives_121743);
                    rule__Node__EquationsAssignment_12_0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getNodeAccess().getEquationsAssignment_12_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:837:6: ( ( rule__Node__PropertiesAssignment_12_1 ) )
                    {
                    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:837:6: ( ( rule__Node__PropertiesAssignment_12_1 ) )
                    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:838:1: ( rule__Node__PropertiesAssignment_12_1 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getNodeAccess().getPropertiesAssignment_12_1()); 
                    }
                    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:839:1: ( rule__Node__PropertiesAssignment_12_1 )
                    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:839:2: rule__Node__PropertiesAssignment_12_1
                    {
                    pushFollow(FOLLOW_rule__Node__PropertiesAssignment_12_1_in_rule__Node__Alternatives_121761);
                    rule__Node__PropertiesAssignment_12_1();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getNodeAccess().getPropertiesAssignment_12_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:843:6: ( ( rule__Node__AssertionsAssignment_12_2 ) )
                    {
                    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:843:6: ( ( rule__Node__AssertionsAssignment_12_2 ) )
                    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:844:1: ( rule__Node__AssertionsAssignment_12_2 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getNodeAccess().getAssertionsAssignment_12_2()); 
                    }
                    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:845:1: ( rule__Node__AssertionsAssignment_12_2 )
                    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:845:2: rule__Node__AssertionsAssignment_12_2
                    {
                    pushFollow(FOLLOW_rule__Node__AssertionsAssignment_12_2_in_rule__Node__Alternatives_121779);
                    rule__Node__AssertionsAssignment_12_2();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getNodeAccess().getAssertionsAssignment_12_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:849:6: ( ( rule__Node__MainAssignment_12_3 ) )
                    {
                    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:849:6: ( ( rule__Node__MainAssignment_12_3 ) )
                    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:850:1: ( rule__Node__MainAssignment_12_3 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getNodeAccess().getMainAssignment_12_3()); 
                    }
                    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:851:1: ( rule__Node__MainAssignment_12_3 )
                    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:851:2: rule__Node__MainAssignment_12_3
                    {
                    pushFollow(FOLLOW_rule__Node__MainAssignment_12_3_in_rule__Node__Alternatives_121797);
                    rule__Node__MainAssignment_12_3();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getNodeAccess().getMainAssignment_12_3()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Node__Alternatives_12"


    // $ANTLR start "rule__OrExpr__OpAlternatives_1_0_1_0"
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:860:1: rule__OrExpr__OpAlternatives_1_0_1_0 : ( ( 'or' ) | ( 'xor' ) );
    public final void rule__OrExpr__OpAlternatives_1_0_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:864:1: ( ( 'or' ) | ( 'xor' ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==12) ) {
                alt6=1;
            }
            else if ( (LA6_0==13) ) {
                alt6=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:865:1: ( 'or' )
                    {
                    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:865:1: ( 'or' )
                    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:866:1: 'or'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getOrExprAccess().getOpOrKeyword_1_0_1_0_0()); 
                    }
                    match(input,12,FOLLOW_12_in_rule__OrExpr__OpAlternatives_1_0_1_01831); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getOrExprAccess().getOpOrKeyword_1_0_1_0_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:873:6: ( 'xor' )
                    {
                    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:873:6: ( 'xor' )
                    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:874:1: 'xor'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getOrExprAccess().getOpXorKeyword_1_0_1_0_1()); 
                    }
                    match(input,13,FOLLOW_13_in_rule__OrExpr__OpAlternatives_1_0_1_01851); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getOrExprAccess().getOpXorKeyword_1_0_1_0_1()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrExpr__OpAlternatives_1_0_1_0"


    // $ANTLR start "rule__RelationalExpr__OpAlternatives_1_0_1_0"
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:886:1: rule__RelationalExpr__OpAlternatives_1_0_1_0 : ( ( '<' ) | ( '<=' ) | ( '>' ) | ( '>=' ) | ( '=' ) | ( '<>' ) );
    public final void rule__RelationalExpr__OpAlternatives_1_0_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:890:1: ( ( '<' ) | ( '<=' ) | ( '>' ) | ( '>=' ) | ( '=' ) | ( '<>' ) )
            int alt7=6;
            switch ( input.LA(1) ) {
            case 14:
                {
                alt7=1;
                }
                break;
            case 15:
                {
                alt7=2;
                }
                break;
            case 16:
                {
                alt7=3;
                }
                break;
            case 17:
                {
                alt7=4;
                }
                break;
            case 18:
                {
                alt7=5;
                }
                break;
            case 19:
                {
                alt7=6;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:891:1: ( '<' )
                    {
                    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:891:1: ( '<' )
                    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:892:1: '<'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getRelationalExprAccess().getOpLessThanSignKeyword_1_0_1_0_0()); 
                    }
                    match(input,14,FOLLOW_14_in_rule__RelationalExpr__OpAlternatives_1_0_1_01886); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getRelationalExprAccess().getOpLessThanSignKeyword_1_0_1_0_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:899:6: ( '<=' )
                    {
                    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:899:6: ( '<=' )
                    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:900:1: '<='
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getRelationalExprAccess().getOpLessThanSignEqualsSignKeyword_1_0_1_0_1()); 
                    }
                    match(input,15,FOLLOW_15_in_rule__RelationalExpr__OpAlternatives_1_0_1_01906); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getRelationalExprAccess().getOpLessThanSignEqualsSignKeyword_1_0_1_0_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:907:6: ( '>' )
                    {
                    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:907:6: ( '>' )
                    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:908:1: '>'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getRelationalExprAccess().getOpGreaterThanSignKeyword_1_0_1_0_2()); 
                    }
                    match(input,16,FOLLOW_16_in_rule__RelationalExpr__OpAlternatives_1_0_1_01926); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getRelationalExprAccess().getOpGreaterThanSignKeyword_1_0_1_0_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:915:6: ( '>=' )
                    {
                    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:915:6: ( '>=' )
                    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:916:1: '>='
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getRelationalExprAccess().getOpGreaterThanSignEqualsSignKeyword_1_0_1_0_3()); 
                    }
                    match(input,17,FOLLOW_17_in_rule__RelationalExpr__OpAlternatives_1_0_1_01946); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getRelationalExprAccess().getOpGreaterThanSignEqualsSignKeyword_1_0_1_0_3()); 
                    }

                    }


                    }
                    break;
                case 5 :
                    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:923:6: ( '=' )
                    {
                    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:923:6: ( '=' )
                    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:924:1: '='
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getRelationalExprAccess().getOpEqualsSignKeyword_1_0_1_0_4()); 
                    }
                    match(input,18,FOLLOW_18_in_rule__RelationalExpr__OpAlternatives_1_0_1_01966); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getRelationalExprAccess().getOpEqualsSignKeyword_1_0_1_0_4()); 
                    }

                    }


                    }
                    break;
                case 6 :
                    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:931:6: ( '<>' )
                    {
                    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:931:6: ( '<>' )
                    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:932:1: '<>'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getRelationalExprAccess().getOpLessThanSignGreaterThanSignKeyword_1_0_1_0_5()); 
                    }
                    match(input,19,FOLLOW_19_in_rule__RelationalExpr__OpAlternatives_1_0_1_01986); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getRelationalExprAccess().getOpLessThanSignGreaterThanSignKeyword_1_0_1_0_5()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RelationalExpr__OpAlternatives_1_0_1_0"


    // $ANTLR start "rule__PlusExpr__OpAlternatives_1_0_1_0"
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:944:1: rule__PlusExpr__OpAlternatives_1_0_1_0 : ( ( '+' ) | ( '-' ) );
    public final void rule__PlusExpr__OpAlternatives_1_0_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:948:1: ( ( '+' ) | ( '-' ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==20) ) {
                alt8=1;
            }
            else if ( (LA8_0==21) ) {
                alt8=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:949:1: ( '+' )
                    {
                    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:949:1: ( '+' )
                    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:950:1: '+'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getPlusExprAccess().getOpPlusSignKeyword_1_0_1_0_0()); 
                    }
                    match(input,20,FOLLOW_20_in_rule__PlusExpr__OpAlternatives_1_0_1_02021); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getPlusExprAccess().getOpPlusSignKeyword_1_0_1_0_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:957:6: ( '-' )
                    {
                    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:957:6: ( '-' )
                    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:958:1: '-'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getPlusExprAccess().getOpHyphenMinusKeyword_1_0_1_0_1()); 
                    }
                    match(input,21,FOLLOW_21_in_rule__PlusExpr__OpAlternatives_1_0_1_02041); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getPlusExprAccess().getOpHyphenMinusKeyword_1_0_1_0_1()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PlusExpr__OpAlternatives_1_0_1_0"


    // $ANTLR start "rule__TimesExpr__OpAlternatives_1_0_1_0"
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:970:1: rule__TimesExpr__OpAlternatives_1_0_1_0 : ( ( '*' ) | ( '/' ) | ( 'div' ) );
    public final void rule__TimesExpr__OpAlternatives_1_0_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:974:1: ( ( '*' ) | ( '/' ) | ( 'div' ) )
            int alt9=3;
            switch ( input.LA(1) ) {
            case 22:
                {
                alt9=1;
                }
                break;
            case 23:
                {
                alt9=2;
                }
                break;
            case 24:
                {
                alt9=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:975:1: ( '*' )
                    {
                    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:975:1: ( '*' )
                    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:976:1: '*'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getTimesExprAccess().getOpAsteriskKeyword_1_0_1_0_0()); 
                    }
                    match(input,22,FOLLOW_22_in_rule__TimesExpr__OpAlternatives_1_0_1_02076); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getTimesExprAccess().getOpAsteriskKeyword_1_0_1_0_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:983:6: ( '/' )
                    {
                    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:983:6: ( '/' )
                    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:984:1: '/'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getTimesExprAccess().getOpSolidusKeyword_1_0_1_0_1()); 
                    }
                    match(input,23,FOLLOW_23_in_rule__TimesExpr__OpAlternatives_1_0_1_02096); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getTimesExprAccess().getOpSolidusKeyword_1_0_1_0_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:991:6: ( 'div' )
                    {
                    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:991:6: ( 'div' )
                    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:992:1: 'div'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getTimesExprAccess().getOpDivKeyword_1_0_1_0_2()); 
                    }
                    match(input,24,FOLLOW_24_in_rule__TimesExpr__OpAlternatives_1_0_1_02116); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getTimesExprAccess().getOpDivKeyword_1_0_1_0_2()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TimesExpr__OpAlternatives_1_0_1_0"


    // $ANTLR start "rule__PrefixExpr__Alternatives"
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1004:1: rule__PrefixExpr__Alternatives : ( ( ( rule__PrefixExpr__Group_0__0 ) ) | ( ruleAtomicExpr ) );
    public final void rule__PrefixExpr__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1008:1: ( ( ( rule__PrefixExpr__Group_0__0 ) ) | ( ruleAtomicExpr ) )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==21||(LA10_0>=25 && LA10_0<=26)) ) {
                alt10=1;
            }
            else if ( ((LA10_0>=RULE_INT && LA10_0<=RULE_BOOL)||LA10_0==43||LA10_0==52) ) {
                alt10=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1009:1: ( ( rule__PrefixExpr__Group_0__0 ) )
                    {
                    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1009:1: ( ( rule__PrefixExpr__Group_0__0 ) )
                    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1010:1: ( rule__PrefixExpr__Group_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getPrefixExprAccess().getGroup_0()); 
                    }
                    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1011:1: ( rule__PrefixExpr__Group_0__0 )
                    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1011:2: rule__PrefixExpr__Group_0__0
                    {
                    pushFollow(FOLLOW_rule__PrefixExpr__Group_0__0_in_rule__PrefixExpr__Alternatives2150);
                    rule__PrefixExpr__Group_0__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getPrefixExprAccess().getGroup_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1015:6: ( ruleAtomicExpr )
                    {
                    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1015:6: ( ruleAtomicExpr )
                    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1016:1: ruleAtomicExpr
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getPrefixExprAccess().getAtomicExprParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_ruleAtomicExpr_in_rule__PrefixExpr__Alternatives2168);
                    ruleAtomicExpr();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getPrefixExprAccess().getAtomicExprParserRuleCall_1()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrefixExpr__Alternatives"


    // $ANTLR start "rule__PrefixExpr__OpAlternatives_0_1_0"
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1026:1: rule__PrefixExpr__OpAlternatives_0_1_0 : ( ( '-' ) | ( 'not' ) | ( 'pre' ) );
    public final void rule__PrefixExpr__OpAlternatives_0_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1030:1: ( ( '-' ) | ( 'not' ) | ( 'pre' ) )
            int alt11=3;
            switch ( input.LA(1) ) {
            case 21:
                {
                alt11=1;
                }
                break;
            case 25:
                {
                alt11=2;
                }
                break;
            case 26:
                {
                alt11=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }

            switch (alt11) {
                case 1 :
                    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1031:1: ( '-' )
                    {
                    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1031:1: ( '-' )
                    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1032:1: '-'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getPrefixExprAccess().getOpHyphenMinusKeyword_0_1_0_0()); 
                    }
                    match(input,21,FOLLOW_21_in_rule__PrefixExpr__OpAlternatives_0_1_02201); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getPrefixExprAccess().getOpHyphenMinusKeyword_0_1_0_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1039:6: ( 'not' )
                    {
                    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1039:6: ( 'not' )
                    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1040:1: 'not'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getPrefixExprAccess().getOpNotKeyword_0_1_0_1()); 
                    }
                    match(input,25,FOLLOW_25_in_rule__PrefixExpr__OpAlternatives_0_1_02221); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getPrefixExprAccess().getOpNotKeyword_0_1_0_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1047:6: ( 'pre' )
                    {
                    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1047:6: ( 'pre' )
                    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1048:1: 'pre'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getPrefixExprAccess().getOpPreKeyword_0_1_0_2()); 
                    }
                    match(input,26,FOLLOW_26_in_rule__PrefixExpr__OpAlternatives_0_1_02241); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getPrefixExprAccess().getOpPreKeyword_0_1_0_2()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrefixExpr__OpAlternatives_0_1_0"


    // $ANTLR start "rule__AtomicExpr__Alternatives"
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1060:1: rule__AtomicExpr__Alternatives : ( ( ( rule__AtomicExpr__Group_0__0 ) ) | ( ( rule__AtomicExpr__Group_1__0 ) ) | ( ( rule__AtomicExpr__Group_2__0 ) ) | ( ( rule__AtomicExpr__Group_3__0 ) ) | ( ( rule__AtomicExpr__Group_4__0 ) ) | ( ( rule__AtomicExpr__Group_5__0 ) ) | ( ( rule__AtomicExpr__Group_6__0 ) ) | ( ( rule__AtomicExpr__Group_7__0 ) ) );
    public final void rule__AtomicExpr__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1064:1: ( ( ( rule__AtomicExpr__Group_0__0 ) ) | ( ( rule__AtomicExpr__Group_1__0 ) ) | ( ( rule__AtomicExpr__Group_2__0 ) ) | ( ( rule__AtomicExpr__Group_3__0 ) ) | ( ( rule__AtomicExpr__Group_4__0 ) ) | ( ( rule__AtomicExpr__Group_5__0 ) ) | ( ( rule__AtomicExpr__Group_6__0 ) ) | ( ( rule__AtomicExpr__Group_7__0 ) ) )
            int alt12=8;
            alt12 = dfa12.predict(input);
            switch (alt12) {
                case 1 :
                    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1065:1: ( ( rule__AtomicExpr__Group_0__0 ) )
                    {
                    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1065:1: ( ( rule__AtomicExpr__Group_0__0 ) )
                    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1066:1: ( rule__AtomicExpr__Group_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAtomicExprAccess().getGroup_0()); 
                    }
                    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1067:1: ( rule__AtomicExpr__Group_0__0 )
                    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1067:2: rule__AtomicExpr__Group_0__0
                    {
                    pushFollow(FOLLOW_rule__AtomicExpr__Group_0__0_in_rule__AtomicExpr__Alternatives2275);
                    rule__AtomicExpr__Group_0__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getAtomicExprAccess().getGroup_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1071:6: ( ( rule__AtomicExpr__Group_1__0 ) )
                    {
                    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1071:6: ( ( rule__AtomicExpr__Group_1__0 ) )
                    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1072:1: ( rule__AtomicExpr__Group_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAtomicExprAccess().getGroup_1()); 
                    }
                    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1073:1: ( rule__AtomicExpr__Group_1__0 )
                    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1073:2: rule__AtomicExpr__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__AtomicExpr__Group_1__0_in_rule__AtomicExpr__Alternatives2293);
                    rule__AtomicExpr__Group_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getAtomicExprAccess().getGroup_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1077:6: ( ( rule__AtomicExpr__Group_2__0 ) )
                    {
                    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1077:6: ( ( rule__AtomicExpr__Group_2__0 ) )
                    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1078:1: ( rule__AtomicExpr__Group_2__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAtomicExprAccess().getGroup_2()); 
                    }
                    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1079:1: ( rule__AtomicExpr__Group_2__0 )
                    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1079:2: rule__AtomicExpr__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__AtomicExpr__Group_2__0_in_rule__AtomicExpr__Alternatives2311);
                    rule__AtomicExpr__Group_2__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getAtomicExprAccess().getGroup_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1083:6: ( ( rule__AtomicExpr__Group_3__0 ) )
                    {
                    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1083:6: ( ( rule__AtomicExpr__Group_3__0 ) )
                    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1084:1: ( rule__AtomicExpr__Group_3__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAtomicExprAccess().getGroup_3()); 
                    }
                    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1085:1: ( rule__AtomicExpr__Group_3__0 )
                    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1085:2: rule__AtomicExpr__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__AtomicExpr__Group_3__0_in_rule__AtomicExpr__Alternatives2329);
                    rule__AtomicExpr__Group_3__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getAtomicExprAccess().getGroup_3()); 
                    }

                    }


                    }
                    break;
                case 5 :
                    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1089:6: ( ( rule__AtomicExpr__Group_4__0 ) )
                    {
                    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1089:6: ( ( rule__AtomicExpr__Group_4__0 ) )
                    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1090:1: ( rule__AtomicExpr__Group_4__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAtomicExprAccess().getGroup_4()); 
                    }
                    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1091:1: ( rule__AtomicExpr__Group_4__0 )
                    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1091:2: rule__AtomicExpr__Group_4__0
                    {
                    pushFollow(FOLLOW_rule__AtomicExpr__Group_4__0_in_rule__AtomicExpr__Alternatives2347);
                    rule__AtomicExpr__Group_4__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getAtomicExprAccess().getGroup_4()); 
                    }

                    }


                    }
                    break;
                case 6 :
                    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1095:6: ( ( rule__AtomicExpr__Group_5__0 ) )
                    {
                    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1095:6: ( ( rule__AtomicExpr__Group_5__0 ) )
                    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1096:1: ( rule__AtomicExpr__Group_5__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAtomicExprAccess().getGroup_5()); 
                    }
                    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1097:1: ( rule__AtomicExpr__Group_5__0 )
                    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1097:2: rule__AtomicExpr__Group_5__0
                    {
                    pushFollow(FOLLOW_rule__AtomicExpr__Group_5__0_in_rule__AtomicExpr__Alternatives2365);
                    rule__AtomicExpr__Group_5__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getAtomicExprAccess().getGroup_5()); 
                    }

                    }


                    }
                    break;
                case 7 :
                    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1101:6: ( ( rule__AtomicExpr__Group_6__0 ) )
                    {
                    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1101:6: ( ( rule__AtomicExpr__Group_6__0 ) )
                    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1102:1: ( rule__AtomicExpr__Group_6__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAtomicExprAccess().getGroup_6()); 
                    }
                    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1103:1: ( rule__AtomicExpr__Group_6__0 )
                    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1103:2: rule__AtomicExpr__Group_6__0
                    {
                    pushFollow(FOLLOW_rule__AtomicExpr__Group_6__0_in_rule__AtomicExpr__Alternatives2383);
                    rule__AtomicExpr__Group_6__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getAtomicExprAccess().getGroup_6()); 
                    }

                    }


                    }
                    break;
                case 8 :
                    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1107:6: ( ( rule__AtomicExpr__Group_7__0 ) )
                    {
                    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1107:6: ( ( rule__AtomicExpr__Group_7__0 ) )
                    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1108:1: ( rule__AtomicExpr__Group_7__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAtomicExprAccess().getGroup_7()); 
                    }
                    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1109:1: ( rule__AtomicExpr__Group_7__0 )
                    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1109:2: rule__AtomicExpr__Group_7__0
                    {
                    pushFollow(FOLLOW_rule__AtomicExpr__Group_7__0_in_rule__AtomicExpr__Alternatives2401);
                    rule__AtomicExpr__Group_7__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getAtomicExprAccess().getGroup_7()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AtomicExpr__Alternatives"


    // $ANTLR start "rule__Typedef__Group__0"
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1120:1: rule__Typedef__Group__0 : rule__Typedef__Group__0__Impl rule__Typedef__Group__1 ;
    public final void rule__Typedef__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1124:1: ( rule__Typedef__Group__0__Impl rule__Typedef__Group__1 )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1125:2: rule__Typedef__Group__0__Impl rule__Typedef__Group__1
            {
            pushFollow(FOLLOW_rule__Typedef__Group__0__Impl_in_rule__Typedef__Group__02432);
            rule__Typedef__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Typedef__Group__1_in_rule__Typedef__Group__02435);
            rule__Typedef__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Typedef__Group__0"


    // $ANTLR start "rule__Typedef__Group__0__Impl"
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1132:1: rule__Typedef__Group__0__Impl : ( 'type' ) ;
    public final void rule__Typedef__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1136:1: ( ( 'type' ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1137:1: ( 'type' )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1137:1: ( 'type' )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1138:1: 'type'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypedefAccess().getTypeKeyword_0()); 
            }
            match(input,27,FOLLOW_27_in_rule__Typedef__Group__0__Impl2463); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTypedefAccess().getTypeKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Typedef__Group__0__Impl"


    // $ANTLR start "rule__Typedef__Group__1"
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1151:1: rule__Typedef__Group__1 : rule__Typedef__Group__1__Impl rule__Typedef__Group__2 ;
    public final void rule__Typedef__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1155:1: ( rule__Typedef__Group__1__Impl rule__Typedef__Group__2 )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1156:2: rule__Typedef__Group__1__Impl rule__Typedef__Group__2
            {
            pushFollow(FOLLOW_rule__Typedef__Group__1__Impl_in_rule__Typedef__Group__12494);
            rule__Typedef__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Typedef__Group__2_in_rule__Typedef__Group__12497);
            rule__Typedef__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Typedef__Group__1"


    // $ANTLR start "rule__Typedef__Group__1__Impl"
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1163:1: rule__Typedef__Group__1__Impl : ( ( rule__Typedef__NameAssignment_1 ) ) ;
    public final void rule__Typedef__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1167:1: ( ( ( rule__Typedef__NameAssignment_1 ) ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1168:1: ( ( rule__Typedef__NameAssignment_1 ) )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1168:1: ( ( rule__Typedef__NameAssignment_1 ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1169:1: ( rule__Typedef__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypedefAccess().getNameAssignment_1()); 
            }
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1170:1: ( rule__Typedef__NameAssignment_1 )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1170:2: rule__Typedef__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Typedef__NameAssignment_1_in_rule__Typedef__Group__1__Impl2524);
            rule__Typedef__NameAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTypedefAccess().getNameAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Typedef__Group__1__Impl"


    // $ANTLR start "rule__Typedef__Group__2"
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1180:1: rule__Typedef__Group__2 : rule__Typedef__Group__2__Impl rule__Typedef__Group__3 ;
    public final void rule__Typedef__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1184:1: ( rule__Typedef__Group__2__Impl rule__Typedef__Group__3 )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1185:2: rule__Typedef__Group__2__Impl rule__Typedef__Group__3
            {
            pushFollow(FOLLOW_rule__Typedef__Group__2__Impl_in_rule__Typedef__Group__22554);
            rule__Typedef__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Typedef__Group__3_in_rule__Typedef__Group__22557);
            rule__Typedef__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Typedef__Group__2"


    // $ANTLR start "rule__Typedef__Group__2__Impl"
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1192:1: rule__Typedef__Group__2__Impl : ( '=' ) ;
    public final void rule__Typedef__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1196:1: ( ( '=' ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1197:1: ( '=' )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1197:1: ( '=' )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1198:1: '='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypedefAccess().getEqualsSignKeyword_2()); 
            }
            match(input,18,FOLLOW_18_in_rule__Typedef__Group__2__Impl2585); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTypedefAccess().getEqualsSignKeyword_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Typedef__Group__2__Impl"


    // $ANTLR start "rule__Typedef__Group__3"
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1211:1: rule__Typedef__Group__3 : rule__Typedef__Group__3__Impl rule__Typedef__Group__4 ;
    public final void rule__Typedef__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1215:1: ( rule__Typedef__Group__3__Impl rule__Typedef__Group__4 )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1216:2: rule__Typedef__Group__3__Impl rule__Typedef__Group__4
            {
            pushFollow(FOLLOW_rule__Typedef__Group__3__Impl_in_rule__Typedef__Group__32616);
            rule__Typedef__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Typedef__Group__4_in_rule__Typedef__Group__32619);
            rule__Typedef__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Typedef__Group__3"


    // $ANTLR start "rule__Typedef__Group__3__Impl"
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1223:1: rule__Typedef__Group__3__Impl : ( ( rule__Typedef__TypeAssignment_3 ) ) ;
    public final void rule__Typedef__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1227:1: ( ( ( rule__Typedef__TypeAssignment_3 ) ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1228:1: ( ( rule__Typedef__TypeAssignment_3 ) )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1228:1: ( ( rule__Typedef__TypeAssignment_3 ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1229:1: ( rule__Typedef__TypeAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypedefAccess().getTypeAssignment_3()); 
            }
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1230:1: ( rule__Typedef__TypeAssignment_3 )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1230:2: rule__Typedef__TypeAssignment_3
            {
            pushFollow(FOLLOW_rule__Typedef__TypeAssignment_3_in_rule__Typedef__Group__3__Impl2646);
            rule__Typedef__TypeAssignment_3();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTypedefAccess().getTypeAssignment_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Typedef__Group__3__Impl"


    // $ANTLR start "rule__Typedef__Group__4"
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1240:1: rule__Typedef__Group__4 : rule__Typedef__Group__4__Impl ;
    public final void rule__Typedef__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1244:1: ( rule__Typedef__Group__4__Impl )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1245:2: rule__Typedef__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__Typedef__Group__4__Impl_in_rule__Typedef__Group__42676);
            rule__Typedef__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Typedef__Group__4"


    // $ANTLR start "rule__Typedef__Group__4__Impl"
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1251:1: rule__Typedef__Group__4__Impl : ( ';' ) ;
    public final void rule__Typedef__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1255:1: ( ( ';' ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1256:1: ( ';' )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1256:1: ( ';' )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1257:1: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypedefAccess().getSemicolonKeyword_4()); 
            }
            match(input,28,FOLLOW_28_in_rule__Typedef__Group__4__Impl2704); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTypedefAccess().getSemicolonKeyword_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Typedef__Group__4__Impl"


    // $ANTLR start "rule__TopLevelType__Group_0__0"
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1280:1: rule__TopLevelType__Group_0__0 : rule__TopLevelType__Group_0__0__Impl rule__TopLevelType__Group_0__1 ;
    public final void rule__TopLevelType__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1284:1: ( rule__TopLevelType__Group_0__0__Impl rule__TopLevelType__Group_0__1 )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1285:2: rule__TopLevelType__Group_0__0__Impl rule__TopLevelType__Group_0__1
            {
            pushFollow(FOLLOW_rule__TopLevelType__Group_0__0__Impl_in_rule__TopLevelType__Group_0__02745);
            rule__TopLevelType__Group_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__TopLevelType__Group_0__1_in_rule__TopLevelType__Group_0__02748);
            rule__TopLevelType__Group_0__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TopLevelType__Group_0__0"


    // $ANTLR start "rule__TopLevelType__Group_0__0__Impl"
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1292:1: rule__TopLevelType__Group_0__0__Impl : ( () ) ;
    public final void rule__TopLevelType__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1296:1: ( ( () ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1297:1: ( () )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1297:1: ( () )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1298:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTopLevelTypeAccess().getRecordTypeAction_0_0()); 
            }
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1299:1: ()
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1301:1: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTopLevelTypeAccess().getRecordTypeAction_0_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TopLevelType__Group_0__0__Impl"


    // $ANTLR start "rule__TopLevelType__Group_0__1"
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1311:1: rule__TopLevelType__Group_0__1 : rule__TopLevelType__Group_0__1__Impl rule__TopLevelType__Group_0__2 ;
    public final void rule__TopLevelType__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1315:1: ( rule__TopLevelType__Group_0__1__Impl rule__TopLevelType__Group_0__2 )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1316:2: rule__TopLevelType__Group_0__1__Impl rule__TopLevelType__Group_0__2
            {
            pushFollow(FOLLOW_rule__TopLevelType__Group_0__1__Impl_in_rule__TopLevelType__Group_0__12806);
            rule__TopLevelType__Group_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__TopLevelType__Group_0__2_in_rule__TopLevelType__Group_0__12809);
            rule__TopLevelType__Group_0__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TopLevelType__Group_0__1"


    // $ANTLR start "rule__TopLevelType__Group_0__1__Impl"
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1323:1: rule__TopLevelType__Group_0__1__Impl : ( 'struct' ) ;
    public final void rule__TopLevelType__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1327:1: ( ( 'struct' ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1328:1: ( 'struct' )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1328:1: ( 'struct' )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1329:1: 'struct'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTopLevelTypeAccess().getStructKeyword_0_1()); 
            }
            match(input,29,FOLLOW_29_in_rule__TopLevelType__Group_0__1__Impl2837); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTopLevelTypeAccess().getStructKeyword_0_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TopLevelType__Group_0__1__Impl"


    // $ANTLR start "rule__TopLevelType__Group_0__2"
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1342:1: rule__TopLevelType__Group_0__2 : rule__TopLevelType__Group_0__2__Impl rule__TopLevelType__Group_0__3 ;
    public final void rule__TopLevelType__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1346:1: ( rule__TopLevelType__Group_0__2__Impl rule__TopLevelType__Group_0__3 )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1347:2: rule__TopLevelType__Group_0__2__Impl rule__TopLevelType__Group_0__3
            {
            pushFollow(FOLLOW_rule__TopLevelType__Group_0__2__Impl_in_rule__TopLevelType__Group_0__22868);
            rule__TopLevelType__Group_0__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__TopLevelType__Group_0__3_in_rule__TopLevelType__Group_0__22871);
            rule__TopLevelType__Group_0__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TopLevelType__Group_0__2"


    // $ANTLR start "rule__TopLevelType__Group_0__2__Impl"
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1354:1: rule__TopLevelType__Group_0__2__Impl : ( '{' ) ;
    public final void rule__TopLevelType__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1358:1: ( ( '{' ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1359:1: ( '{' )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1359:1: ( '{' )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1360:1: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTopLevelTypeAccess().getLeftCurlyBracketKeyword_0_2()); 
            }
            match(input,30,FOLLOW_30_in_rule__TopLevelType__Group_0__2__Impl2899); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTopLevelTypeAccess().getLeftCurlyBracketKeyword_0_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TopLevelType__Group_0__2__Impl"


    // $ANTLR start "rule__TopLevelType__Group_0__3"
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1373:1: rule__TopLevelType__Group_0__3 : rule__TopLevelType__Group_0__3__Impl rule__TopLevelType__Group_0__4 ;
    public final void rule__TopLevelType__Group_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1377:1: ( rule__TopLevelType__Group_0__3__Impl rule__TopLevelType__Group_0__4 )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1378:2: rule__TopLevelType__Group_0__3__Impl rule__TopLevelType__Group_0__4
            {
            pushFollow(FOLLOW_rule__TopLevelType__Group_0__3__Impl_in_rule__TopLevelType__Group_0__32930);
            rule__TopLevelType__Group_0__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__TopLevelType__Group_0__4_in_rule__TopLevelType__Group_0__32933);
            rule__TopLevelType__Group_0__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TopLevelType__Group_0__3"


    // $ANTLR start "rule__TopLevelType__Group_0__3__Impl"
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1385:1: rule__TopLevelType__Group_0__3__Impl : ( ( rule__TopLevelType__FieldsAssignment_0_3 ) ) ;
    public final void rule__TopLevelType__Group_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1389:1: ( ( ( rule__TopLevelType__FieldsAssignment_0_3 ) ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1390:1: ( ( rule__TopLevelType__FieldsAssignment_0_3 ) )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1390:1: ( ( rule__TopLevelType__FieldsAssignment_0_3 ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1391:1: ( rule__TopLevelType__FieldsAssignment_0_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTopLevelTypeAccess().getFieldsAssignment_0_3()); 
            }
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1392:1: ( rule__TopLevelType__FieldsAssignment_0_3 )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1392:2: rule__TopLevelType__FieldsAssignment_0_3
            {
            pushFollow(FOLLOW_rule__TopLevelType__FieldsAssignment_0_3_in_rule__TopLevelType__Group_0__3__Impl2960);
            rule__TopLevelType__FieldsAssignment_0_3();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTopLevelTypeAccess().getFieldsAssignment_0_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TopLevelType__Group_0__3__Impl"


    // $ANTLR start "rule__TopLevelType__Group_0__4"
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1402:1: rule__TopLevelType__Group_0__4 : rule__TopLevelType__Group_0__4__Impl rule__TopLevelType__Group_0__5 ;
    public final void rule__TopLevelType__Group_0__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1406:1: ( rule__TopLevelType__Group_0__4__Impl rule__TopLevelType__Group_0__5 )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1407:2: rule__TopLevelType__Group_0__4__Impl rule__TopLevelType__Group_0__5
            {
            pushFollow(FOLLOW_rule__TopLevelType__Group_0__4__Impl_in_rule__TopLevelType__Group_0__42990);
            rule__TopLevelType__Group_0__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__TopLevelType__Group_0__5_in_rule__TopLevelType__Group_0__42993);
            rule__TopLevelType__Group_0__5();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TopLevelType__Group_0__4"


    // $ANTLR start "rule__TopLevelType__Group_0__4__Impl"
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1414:1: rule__TopLevelType__Group_0__4__Impl : ( ':' ) ;
    public final void rule__TopLevelType__Group_0__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1418:1: ( ( ':' ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1419:1: ( ':' )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1419:1: ( ':' )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1420:1: ':'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTopLevelTypeAccess().getColonKeyword_0_4()); 
            }
            match(input,31,FOLLOW_31_in_rule__TopLevelType__Group_0__4__Impl3021); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTopLevelTypeAccess().getColonKeyword_0_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TopLevelType__Group_0__4__Impl"


    // $ANTLR start "rule__TopLevelType__Group_0__5"
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1433:1: rule__TopLevelType__Group_0__5 : rule__TopLevelType__Group_0__5__Impl rule__TopLevelType__Group_0__6 ;
    public final void rule__TopLevelType__Group_0__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1437:1: ( rule__TopLevelType__Group_0__5__Impl rule__TopLevelType__Group_0__6 )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1438:2: rule__TopLevelType__Group_0__5__Impl rule__TopLevelType__Group_0__6
            {
            pushFollow(FOLLOW_rule__TopLevelType__Group_0__5__Impl_in_rule__TopLevelType__Group_0__53052);
            rule__TopLevelType__Group_0__5__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__TopLevelType__Group_0__6_in_rule__TopLevelType__Group_0__53055);
            rule__TopLevelType__Group_0__6();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TopLevelType__Group_0__5"


    // $ANTLR start "rule__TopLevelType__Group_0__5__Impl"
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1445:1: rule__TopLevelType__Group_0__5__Impl : ( ( rule__TopLevelType__TypesAssignment_0_5 ) ) ;
    public final void rule__TopLevelType__Group_0__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1449:1: ( ( ( rule__TopLevelType__TypesAssignment_0_5 ) ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1450:1: ( ( rule__TopLevelType__TypesAssignment_0_5 ) )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1450:1: ( ( rule__TopLevelType__TypesAssignment_0_5 ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1451:1: ( rule__TopLevelType__TypesAssignment_0_5 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTopLevelTypeAccess().getTypesAssignment_0_5()); 
            }
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1452:1: ( rule__TopLevelType__TypesAssignment_0_5 )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1452:2: rule__TopLevelType__TypesAssignment_0_5
            {
            pushFollow(FOLLOW_rule__TopLevelType__TypesAssignment_0_5_in_rule__TopLevelType__Group_0__5__Impl3082);
            rule__TopLevelType__TypesAssignment_0_5();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTopLevelTypeAccess().getTypesAssignment_0_5()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TopLevelType__Group_0__5__Impl"


    // $ANTLR start "rule__TopLevelType__Group_0__6"
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1462:1: rule__TopLevelType__Group_0__6 : rule__TopLevelType__Group_0__6__Impl rule__TopLevelType__Group_0__7 ;
    public final void rule__TopLevelType__Group_0__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1466:1: ( rule__TopLevelType__Group_0__6__Impl rule__TopLevelType__Group_0__7 )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1467:2: rule__TopLevelType__Group_0__6__Impl rule__TopLevelType__Group_0__7
            {
            pushFollow(FOLLOW_rule__TopLevelType__Group_0__6__Impl_in_rule__TopLevelType__Group_0__63112);
            rule__TopLevelType__Group_0__6__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__TopLevelType__Group_0__7_in_rule__TopLevelType__Group_0__63115);
            rule__TopLevelType__Group_0__7();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TopLevelType__Group_0__6"


    // $ANTLR start "rule__TopLevelType__Group_0__6__Impl"
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1474:1: rule__TopLevelType__Group_0__6__Impl : ( ( rule__TopLevelType__Group_0_6__0 )* ) ;
    public final void rule__TopLevelType__Group_0__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1478:1: ( ( ( rule__TopLevelType__Group_0_6__0 )* ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1479:1: ( ( rule__TopLevelType__Group_0_6__0 )* )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1479:1: ( ( rule__TopLevelType__Group_0_6__0 )* )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1480:1: ( rule__TopLevelType__Group_0_6__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTopLevelTypeAccess().getGroup_0_6()); 
            }
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1481:1: ( rule__TopLevelType__Group_0_6__0 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==28) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1481:2: rule__TopLevelType__Group_0_6__0
            	    {
            	    pushFollow(FOLLOW_rule__TopLevelType__Group_0_6__0_in_rule__TopLevelType__Group_0__6__Impl3142);
            	    rule__TopLevelType__Group_0_6__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTopLevelTypeAccess().getGroup_0_6()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TopLevelType__Group_0__6__Impl"


    // $ANTLR start "rule__TopLevelType__Group_0__7"
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1491:1: rule__TopLevelType__Group_0__7 : rule__TopLevelType__Group_0__7__Impl ;
    public final void rule__TopLevelType__Group_0__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1495:1: ( rule__TopLevelType__Group_0__7__Impl )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1496:2: rule__TopLevelType__Group_0__7__Impl
            {
            pushFollow(FOLLOW_rule__TopLevelType__Group_0__7__Impl_in_rule__TopLevelType__Group_0__73173);
            rule__TopLevelType__Group_0__7__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TopLevelType__Group_0__7"


    // $ANTLR start "rule__TopLevelType__Group_0__7__Impl"
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1502:1: rule__TopLevelType__Group_0__7__Impl : ( '}' ) ;
    public final void rule__TopLevelType__Group_0__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1506:1: ( ( '}' ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1507:1: ( '}' )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1507:1: ( '}' )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1508:1: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTopLevelTypeAccess().getRightCurlyBracketKeyword_0_7()); 
            }
            match(input,32,FOLLOW_32_in_rule__TopLevelType__Group_0__7__Impl3201); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTopLevelTypeAccess().getRightCurlyBracketKeyword_0_7()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TopLevelType__Group_0__7__Impl"


    // $ANTLR start "rule__TopLevelType__Group_0_6__0"
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1537:1: rule__TopLevelType__Group_0_6__0 : rule__TopLevelType__Group_0_6__0__Impl rule__TopLevelType__Group_0_6__1 ;
    public final void rule__TopLevelType__Group_0_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1541:1: ( rule__TopLevelType__Group_0_6__0__Impl rule__TopLevelType__Group_0_6__1 )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1542:2: rule__TopLevelType__Group_0_6__0__Impl rule__TopLevelType__Group_0_6__1
            {
            pushFollow(FOLLOW_rule__TopLevelType__Group_0_6__0__Impl_in_rule__TopLevelType__Group_0_6__03248);
            rule__TopLevelType__Group_0_6__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__TopLevelType__Group_0_6__1_in_rule__TopLevelType__Group_0_6__03251);
            rule__TopLevelType__Group_0_6__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TopLevelType__Group_0_6__0"


    // $ANTLR start "rule__TopLevelType__Group_0_6__0__Impl"
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1549:1: rule__TopLevelType__Group_0_6__0__Impl : ( ';' ) ;
    public final void rule__TopLevelType__Group_0_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1553:1: ( ( ';' ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1554:1: ( ';' )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1554:1: ( ';' )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1555:1: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTopLevelTypeAccess().getSemicolonKeyword_0_6_0()); 
            }
            match(input,28,FOLLOW_28_in_rule__TopLevelType__Group_0_6__0__Impl3279); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTopLevelTypeAccess().getSemicolonKeyword_0_6_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TopLevelType__Group_0_6__0__Impl"


    // $ANTLR start "rule__TopLevelType__Group_0_6__1"
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1568:1: rule__TopLevelType__Group_0_6__1 : rule__TopLevelType__Group_0_6__1__Impl rule__TopLevelType__Group_0_6__2 ;
    public final void rule__TopLevelType__Group_0_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1572:1: ( rule__TopLevelType__Group_0_6__1__Impl rule__TopLevelType__Group_0_6__2 )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1573:2: rule__TopLevelType__Group_0_6__1__Impl rule__TopLevelType__Group_0_6__2
            {
            pushFollow(FOLLOW_rule__TopLevelType__Group_0_6__1__Impl_in_rule__TopLevelType__Group_0_6__13310);
            rule__TopLevelType__Group_0_6__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__TopLevelType__Group_0_6__2_in_rule__TopLevelType__Group_0_6__13313);
            rule__TopLevelType__Group_0_6__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TopLevelType__Group_0_6__1"


    // $ANTLR start "rule__TopLevelType__Group_0_6__1__Impl"
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1580:1: rule__TopLevelType__Group_0_6__1__Impl : ( ( rule__TopLevelType__FieldsAssignment_0_6_1 ) ) ;
    public final void rule__TopLevelType__Group_0_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1584:1: ( ( ( rule__TopLevelType__FieldsAssignment_0_6_1 ) ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1585:1: ( ( rule__TopLevelType__FieldsAssignment_0_6_1 ) )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1585:1: ( ( rule__TopLevelType__FieldsAssignment_0_6_1 ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1586:1: ( rule__TopLevelType__FieldsAssignment_0_6_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTopLevelTypeAccess().getFieldsAssignment_0_6_1()); 
            }
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1587:1: ( rule__TopLevelType__FieldsAssignment_0_6_1 )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1587:2: rule__TopLevelType__FieldsAssignment_0_6_1
            {
            pushFollow(FOLLOW_rule__TopLevelType__FieldsAssignment_0_6_1_in_rule__TopLevelType__Group_0_6__1__Impl3340);
            rule__TopLevelType__FieldsAssignment_0_6_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTopLevelTypeAccess().getFieldsAssignment_0_6_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TopLevelType__Group_0_6__1__Impl"


    // $ANTLR start "rule__TopLevelType__Group_0_6__2"
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1597:1: rule__TopLevelType__Group_0_6__2 : rule__TopLevelType__Group_0_6__2__Impl rule__TopLevelType__Group_0_6__3 ;
    public final void rule__TopLevelType__Group_0_6__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1601:1: ( rule__TopLevelType__Group_0_6__2__Impl rule__TopLevelType__Group_0_6__3 )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1602:2: rule__TopLevelType__Group_0_6__2__Impl rule__TopLevelType__Group_0_6__3
            {
            pushFollow(FOLLOW_rule__TopLevelType__Group_0_6__2__Impl_in_rule__TopLevelType__Group_0_6__23370);
            rule__TopLevelType__Group_0_6__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__TopLevelType__Group_0_6__3_in_rule__TopLevelType__Group_0_6__23373);
            rule__TopLevelType__Group_0_6__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TopLevelType__Group_0_6__2"


    // $ANTLR start "rule__TopLevelType__Group_0_6__2__Impl"
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1609:1: rule__TopLevelType__Group_0_6__2__Impl : ( ':' ) ;
    public final void rule__TopLevelType__Group_0_6__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1613:1: ( ( ':' ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1614:1: ( ':' )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1614:1: ( ':' )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1615:1: ':'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTopLevelTypeAccess().getColonKeyword_0_6_2()); 
            }
            match(input,31,FOLLOW_31_in_rule__TopLevelType__Group_0_6__2__Impl3401); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTopLevelTypeAccess().getColonKeyword_0_6_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TopLevelType__Group_0_6__2__Impl"


    // $ANTLR start "rule__TopLevelType__Group_0_6__3"
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1628:1: rule__TopLevelType__Group_0_6__3 : rule__TopLevelType__Group_0_6__3__Impl ;
    public final void rule__TopLevelType__Group_0_6__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1632:1: ( rule__TopLevelType__Group_0_6__3__Impl )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1633:2: rule__TopLevelType__Group_0_6__3__Impl
            {
            pushFollow(FOLLOW_rule__TopLevelType__Group_0_6__3__Impl_in_rule__TopLevelType__Group_0_6__33432);
            rule__TopLevelType__Group_0_6__3__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TopLevelType__Group_0_6__3"


    // $ANTLR start "rule__TopLevelType__Group_0_6__3__Impl"
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1639:1: rule__TopLevelType__Group_0_6__3__Impl : ( ( rule__TopLevelType__TypesAssignment_0_6_3 ) ) ;
    public final void rule__TopLevelType__Group_0_6__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1643:1: ( ( ( rule__TopLevelType__TypesAssignment_0_6_3 ) ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1644:1: ( ( rule__TopLevelType__TypesAssignment_0_6_3 ) )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1644:1: ( ( rule__TopLevelType__TypesAssignment_0_6_3 ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1645:1: ( rule__TopLevelType__TypesAssignment_0_6_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTopLevelTypeAccess().getTypesAssignment_0_6_3()); 
            }
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1646:1: ( rule__TopLevelType__TypesAssignment_0_6_3 )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1646:2: rule__TopLevelType__TypesAssignment_0_6_3
            {
            pushFollow(FOLLOW_rule__TopLevelType__TypesAssignment_0_6_3_in_rule__TopLevelType__Group_0_6__3__Impl3459);
            rule__TopLevelType__TypesAssignment_0_6_3();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTopLevelTypeAccess().getTypesAssignment_0_6_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TopLevelType__Group_0_6__3__Impl"


    // $ANTLR start "rule__Type__Group_0__0"
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1664:1: rule__Type__Group_0__0 : rule__Type__Group_0__0__Impl rule__Type__Group_0__1 ;
    public final void rule__Type__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1668:1: ( rule__Type__Group_0__0__Impl rule__Type__Group_0__1 )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1669:2: rule__Type__Group_0__0__Impl rule__Type__Group_0__1
            {
            pushFollow(FOLLOW_rule__Type__Group_0__0__Impl_in_rule__Type__Group_0__03497);
            rule__Type__Group_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Type__Group_0__1_in_rule__Type__Group_0__03500);
            rule__Type__Group_0__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Group_0__0"


    // $ANTLR start "rule__Type__Group_0__0__Impl"
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1676:1: rule__Type__Group_0__0__Impl : ( () ) ;
    public final void rule__Type__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1680:1: ( ( () ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1681:1: ( () )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1681:1: ( () )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1682:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypeAccess().getIntTypeAction_0_0()); 
            }
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1683:1: ()
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1685:1: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTypeAccess().getIntTypeAction_0_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Group_0__0__Impl"


    // $ANTLR start "rule__Type__Group_0__1"
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1695:1: rule__Type__Group_0__1 : rule__Type__Group_0__1__Impl ;
    public final void rule__Type__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1699:1: ( rule__Type__Group_0__1__Impl )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1700:2: rule__Type__Group_0__1__Impl
            {
            pushFollow(FOLLOW_rule__Type__Group_0__1__Impl_in_rule__Type__Group_0__13558);
            rule__Type__Group_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Group_0__1"


    // $ANTLR start "rule__Type__Group_0__1__Impl"
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1706:1: rule__Type__Group_0__1__Impl : ( 'int' ) ;
    public final void rule__Type__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1710:1: ( ( 'int' ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1711:1: ( 'int' )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1711:1: ( 'int' )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1712:1: 'int'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypeAccess().getIntKeyword_0_1()); 
            }
            match(input,33,FOLLOW_33_in_rule__Type__Group_0__1__Impl3586); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTypeAccess().getIntKeyword_0_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Group_0__1__Impl"


    // $ANTLR start "rule__Type__Group_1__0"
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1729:1: rule__Type__Group_1__0 : rule__Type__Group_1__0__Impl rule__Type__Group_1__1 ;
    public final void rule__Type__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1733:1: ( rule__Type__Group_1__0__Impl rule__Type__Group_1__1 )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1734:2: rule__Type__Group_1__0__Impl rule__Type__Group_1__1
            {
            pushFollow(FOLLOW_rule__Type__Group_1__0__Impl_in_rule__Type__Group_1__03621);
            rule__Type__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Type__Group_1__1_in_rule__Type__Group_1__03624);
            rule__Type__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Group_1__0"


    // $ANTLR start "rule__Type__Group_1__0__Impl"
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1741:1: rule__Type__Group_1__0__Impl : ( () ) ;
    public final void rule__Type__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1745:1: ( ( () ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1746:1: ( () )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1746:1: ( () )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1747:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypeAccess().getBoolTypeAction_1_0()); 
            }
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1748:1: ()
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1750:1: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTypeAccess().getBoolTypeAction_1_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Group_1__0__Impl"


    // $ANTLR start "rule__Type__Group_1__1"
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1760:1: rule__Type__Group_1__1 : rule__Type__Group_1__1__Impl ;
    public final void rule__Type__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1764:1: ( rule__Type__Group_1__1__Impl )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1765:2: rule__Type__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Type__Group_1__1__Impl_in_rule__Type__Group_1__13682);
            rule__Type__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Group_1__1"


    // $ANTLR start "rule__Type__Group_1__1__Impl"
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1771:1: rule__Type__Group_1__1__Impl : ( 'bool' ) ;
    public final void rule__Type__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1775:1: ( ( 'bool' ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1776:1: ( 'bool' )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1776:1: ( 'bool' )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1777:1: 'bool'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypeAccess().getBoolKeyword_1_1()); 
            }
            match(input,34,FOLLOW_34_in_rule__Type__Group_1__1__Impl3710); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTypeAccess().getBoolKeyword_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Group_1__1__Impl"


    // $ANTLR start "rule__Type__Group_2__0"
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1794:1: rule__Type__Group_2__0 : rule__Type__Group_2__0__Impl rule__Type__Group_2__1 ;
    public final void rule__Type__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1798:1: ( rule__Type__Group_2__0__Impl rule__Type__Group_2__1 )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1799:2: rule__Type__Group_2__0__Impl rule__Type__Group_2__1
            {
            pushFollow(FOLLOW_rule__Type__Group_2__0__Impl_in_rule__Type__Group_2__03745);
            rule__Type__Group_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Type__Group_2__1_in_rule__Type__Group_2__03748);
            rule__Type__Group_2__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Group_2__0"


    // $ANTLR start "rule__Type__Group_2__0__Impl"
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1806:1: rule__Type__Group_2__0__Impl : ( () ) ;
    public final void rule__Type__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1810:1: ( ( () ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1811:1: ( () )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1811:1: ( () )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1812:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypeAccess().getRealTypeAction_2_0()); 
            }
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1813:1: ()
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1815:1: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTypeAccess().getRealTypeAction_2_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Group_2__0__Impl"


    // $ANTLR start "rule__Type__Group_2__1"
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1825:1: rule__Type__Group_2__1 : rule__Type__Group_2__1__Impl ;
    public final void rule__Type__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1829:1: ( rule__Type__Group_2__1__Impl )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1830:2: rule__Type__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__Type__Group_2__1__Impl_in_rule__Type__Group_2__13806);
            rule__Type__Group_2__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Group_2__1"


    // $ANTLR start "rule__Type__Group_2__1__Impl"
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1836:1: rule__Type__Group_2__1__Impl : ( 'real' ) ;
    public final void rule__Type__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1840:1: ( ( 'real' ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1841:1: ( 'real' )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1841:1: ( 'real' )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1842:1: 'real'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypeAccess().getRealKeyword_2_1()); 
            }
            match(input,35,FOLLOW_35_in_rule__Type__Group_2__1__Impl3834); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTypeAccess().getRealKeyword_2_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Group_2__1__Impl"


    // $ANTLR start "rule__Type__Group_3__0"
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1859:1: rule__Type__Group_3__0 : rule__Type__Group_3__0__Impl rule__Type__Group_3__1 ;
    public final void rule__Type__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1863:1: ( rule__Type__Group_3__0__Impl rule__Type__Group_3__1 )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1864:2: rule__Type__Group_3__0__Impl rule__Type__Group_3__1
            {
            pushFollow(FOLLOW_rule__Type__Group_3__0__Impl_in_rule__Type__Group_3__03869);
            rule__Type__Group_3__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Type__Group_3__1_in_rule__Type__Group_3__03872);
            rule__Type__Group_3__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Group_3__0"


    // $ANTLR start "rule__Type__Group_3__0__Impl"
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1871:1: rule__Type__Group_3__0__Impl : ( () ) ;
    public final void rule__Type__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1875:1: ( ( () ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1876:1: ( () )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1876:1: ( () )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1877:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypeAccess().getSubrangeTypeAction_3_0()); 
            }
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1878:1: ()
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1880:1: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTypeAccess().getSubrangeTypeAction_3_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Group_3__0__Impl"


    // $ANTLR start "rule__Type__Group_3__1"
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1890:1: rule__Type__Group_3__1 : rule__Type__Group_3__1__Impl rule__Type__Group_3__2 ;
    public final void rule__Type__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1894:1: ( rule__Type__Group_3__1__Impl rule__Type__Group_3__2 )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1895:2: rule__Type__Group_3__1__Impl rule__Type__Group_3__2
            {
            pushFollow(FOLLOW_rule__Type__Group_3__1__Impl_in_rule__Type__Group_3__13930);
            rule__Type__Group_3__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Type__Group_3__2_in_rule__Type__Group_3__13933);
            rule__Type__Group_3__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Group_3__1"


    // $ANTLR start "rule__Type__Group_3__1__Impl"
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1902:1: rule__Type__Group_3__1__Impl : ( 'subrange' ) ;
    public final void rule__Type__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1906:1: ( ( 'subrange' ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1907:1: ( 'subrange' )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1907:1: ( 'subrange' )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1908:1: 'subrange'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypeAccess().getSubrangeKeyword_3_1()); 
            }
            match(input,36,FOLLOW_36_in_rule__Type__Group_3__1__Impl3961); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTypeAccess().getSubrangeKeyword_3_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Group_3__1__Impl"


    // $ANTLR start "rule__Type__Group_3__2"
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1921:1: rule__Type__Group_3__2 : rule__Type__Group_3__2__Impl rule__Type__Group_3__3 ;
    public final void rule__Type__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1925:1: ( rule__Type__Group_3__2__Impl rule__Type__Group_3__3 )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1926:2: rule__Type__Group_3__2__Impl rule__Type__Group_3__3
            {
            pushFollow(FOLLOW_rule__Type__Group_3__2__Impl_in_rule__Type__Group_3__23992);
            rule__Type__Group_3__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Type__Group_3__3_in_rule__Type__Group_3__23995);
            rule__Type__Group_3__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Group_3__2"


    // $ANTLR start "rule__Type__Group_3__2__Impl"
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1933:1: rule__Type__Group_3__2__Impl : ( '[' ) ;
    public final void rule__Type__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1937:1: ( ( '[' ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1938:1: ( '[' )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1938:1: ( '[' )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1939:1: '['
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypeAccess().getLeftSquareBracketKeyword_3_2()); 
            }
            match(input,37,FOLLOW_37_in_rule__Type__Group_3__2__Impl4023); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTypeAccess().getLeftSquareBracketKeyword_3_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Group_3__2__Impl"


    // $ANTLR start "rule__Type__Group_3__3"
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1952:1: rule__Type__Group_3__3 : rule__Type__Group_3__3__Impl rule__Type__Group_3__4 ;
    public final void rule__Type__Group_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1956:1: ( rule__Type__Group_3__3__Impl rule__Type__Group_3__4 )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1957:2: rule__Type__Group_3__3__Impl rule__Type__Group_3__4
            {
            pushFollow(FOLLOW_rule__Type__Group_3__3__Impl_in_rule__Type__Group_3__34054);
            rule__Type__Group_3__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Type__Group_3__4_in_rule__Type__Group_3__34057);
            rule__Type__Group_3__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Group_3__3"


    // $ANTLR start "rule__Type__Group_3__3__Impl"
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1964:1: rule__Type__Group_3__3__Impl : ( ( rule__Type__LowAssignment_3_3 ) ) ;
    public final void rule__Type__Group_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1968:1: ( ( ( rule__Type__LowAssignment_3_3 ) ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1969:1: ( ( rule__Type__LowAssignment_3_3 ) )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1969:1: ( ( rule__Type__LowAssignment_3_3 ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1970:1: ( rule__Type__LowAssignment_3_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypeAccess().getLowAssignment_3_3()); 
            }
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1971:1: ( rule__Type__LowAssignment_3_3 )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1971:2: rule__Type__LowAssignment_3_3
            {
            pushFollow(FOLLOW_rule__Type__LowAssignment_3_3_in_rule__Type__Group_3__3__Impl4084);
            rule__Type__LowAssignment_3_3();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTypeAccess().getLowAssignment_3_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Group_3__3__Impl"


    // $ANTLR start "rule__Type__Group_3__4"
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1981:1: rule__Type__Group_3__4 : rule__Type__Group_3__4__Impl rule__Type__Group_3__5 ;
    public final void rule__Type__Group_3__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1985:1: ( rule__Type__Group_3__4__Impl rule__Type__Group_3__5 )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1986:2: rule__Type__Group_3__4__Impl rule__Type__Group_3__5
            {
            pushFollow(FOLLOW_rule__Type__Group_3__4__Impl_in_rule__Type__Group_3__44114);
            rule__Type__Group_3__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Type__Group_3__5_in_rule__Type__Group_3__44117);
            rule__Type__Group_3__5();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Group_3__4"


    // $ANTLR start "rule__Type__Group_3__4__Impl"
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1993:1: rule__Type__Group_3__4__Impl : ( ',' ) ;
    public final void rule__Type__Group_3__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1997:1: ( ( ',' ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1998:1: ( ',' )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1998:1: ( ',' )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1999:1: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypeAccess().getCommaKeyword_3_4()); 
            }
            match(input,38,FOLLOW_38_in_rule__Type__Group_3__4__Impl4145); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTypeAccess().getCommaKeyword_3_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Group_3__4__Impl"


    // $ANTLR start "rule__Type__Group_3__5"
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2012:1: rule__Type__Group_3__5 : rule__Type__Group_3__5__Impl rule__Type__Group_3__6 ;
    public final void rule__Type__Group_3__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2016:1: ( rule__Type__Group_3__5__Impl rule__Type__Group_3__6 )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2017:2: rule__Type__Group_3__5__Impl rule__Type__Group_3__6
            {
            pushFollow(FOLLOW_rule__Type__Group_3__5__Impl_in_rule__Type__Group_3__54176);
            rule__Type__Group_3__5__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Type__Group_3__6_in_rule__Type__Group_3__54179);
            rule__Type__Group_3__6();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Group_3__5"


    // $ANTLR start "rule__Type__Group_3__5__Impl"
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2024:1: rule__Type__Group_3__5__Impl : ( ( rule__Type__HighAssignment_3_5 ) ) ;
    public final void rule__Type__Group_3__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2028:1: ( ( ( rule__Type__HighAssignment_3_5 ) ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2029:1: ( ( rule__Type__HighAssignment_3_5 ) )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2029:1: ( ( rule__Type__HighAssignment_3_5 ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2030:1: ( rule__Type__HighAssignment_3_5 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypeAccess().getHighAssignment_3_5()); 
            }
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2031:1: ( rule__Type__HighAssignment_3_5 )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2031:2: rule__Type__HighAssignment_3_5
            {
            pushFollow(FOLLOW_rule__Type__HighAssignment_3_5_in_rule__Type__Group_3__5__Impl4206);
            rule__Type__HighAssignment_3_5();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTypeAccess().getHighAssignment_3_5()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Group_3__5__Impl"


    // $ANTLR start "rule__Type__Group_3__6"
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2041:1: rule__Type__Group_3__6 : rule__Type__Group_3__6__Impl rule__Type__Group_3__7 ;
    public final void rule__Type__Group_3__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2045:1: ( rule__Type__Group_3__6__Impl rule__Type__Group_3__7 )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2046:2: rule__Type__Group_3__6__Impl rule__Type__Group_3__7
            {
            pushFollow(FOLLOW_rule__Type__Group_3__6__Impl_in_rule__Type__Group_3__64236);
            rule__Type__Group_3__6__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Type__Group_3__7_in_rule__Type__Group_3__64239);
            rule__Type__Group_3__7();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Group_3__6"


    // $ANTLR start "rule__Type__Group_3__6__Impl"
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2053:1: rule__Type__Group_3__6__Impl : ( ']' ) ;
    public final void rule__Type__Group_3__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2057:1: ( ( ']' ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2058:1: ( ']' )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2058:1: ( ']' )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2059:1: ']'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypeAccess().getRightSquareBracketKeyword_3_6()); 
            }
            match(input,39,FOLLOW_39_in_rule__Type__Group_3__6__Impl4267); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTypeAccess().getRightSquareBracketKeyword_3_6()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Group_3__6__Impl"


    // $ANTLR start "rule__Type__Group_3__7"
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2072:1: rule__Type__Group_3__7 : rule__Type__Group_3__7__Impl rule__Type__Group_3__8 ;
    public final void rule__Type__Group_3__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2076:1: ( rule__Type__Group_3__7__Impl rule__Type__Group_3__8 )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2077:2: rule__Type__Group_3__7__Impl rule__Type__Group_3__8
            {
            pushFollow(FOLLOW_rule__Type__Group_3__7__Impl_in_rule__Type__Group_3__74298);
            rule__Type__Group_3__7__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Type__Group_3__8_in_rule__Type__Group_3__74301);
            rule__Type__Group_3__8();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Group_3__7"


    // $ANTLR start "rule__Type__Group_3__7__Impl"
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2084:1: rule__Type__Group_3__7__Impl : ( 'of' ) ;
    public final void rule__Type__Group_3__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2088:1: ( ( 'of' ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2089:1: ( 'of' )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2089:1: ( 'of' )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2090:1: 'of'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypeAccess().getOfKeyword_3_7()); 
            }
            match(input,40,FOLLOW_40_in_rule__Type__Group_3__7__Impl4329); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTypeAccess().getOfKeyword_3_7()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Group_3__7__Impl"


    // $ANTLR start "rule__Type__Group_3__8"
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2103:1: rule__Type__Group_3__8 : rule__Type__Group_3__8__Impl ;
    public final void rule__Type__Group_3__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2107:1: ( rule__Type__Group_3__8__Impl )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2108:2: rule__Type__Group_3__8__Impl
            {
            pushFollow(FOLLOW_rule__Type__Group_3__8__Impl_in_rule__Type__Group_3__84360);
            rule__Type__Group_3__8__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Group_3__8"


    // $ANTLR start "rule__Type__Group_3__8__Impl"
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2114:1: rule__Type__Group_3__8__Impl : ( 'int' ) ;
    public final void rule__Type__Group_3__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2118:1: ( ( 'int' ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2119:1: ( 'int' )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2119:1: ( 'int' )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2120:1: 'int'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypeAccess().getIntKeyword_3_8()); 
            }
            match(input,33,FOLLOW_33_in_rule__Type__Group_3__8__Impl4388); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTypeAccess().getIntKeyword_3_8()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Group_3__8__Impl"


    // $ANTLR start "rule__Type__Group_4__0"
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2151:1: rule__Type__Group_4__0 : rule__Type__Group_4__0__Impl rule__Type__Group_4__1 ;
    public final void rule__Type__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2155:1: ( rule__Type__Group_4__0__Impl rule__Type__Group_4__1 )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2156:2: rule__Type__Group_4__0__Impl rule__Type__Group_4__1
            {
            pushFollow(FOLLOW_rule__Type__Group_4__0__Impl_in_rule__Type__Group_4__04437);
            rule__Type__Group_4__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Type__Group_4__1_in_rule__Type__Group_4__04440);
            rule__Type__Group_4__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Group_4__0"


    // $ANTLR start "rule__Type__Group_4__0__Impl"
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2163:1: rule__Type__Group_4__0__Impl : ( () ) ;
    public final void rule__Type__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2167:1: ( ( () ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2168:1: ( () )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2168:1: ( () )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2169:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypeAccess().getUserTypeAction_4_0()); 
            }
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2170:1: ()
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2172:1: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTypeAccess().getUserTypeAction_4_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Group_4__0__Impl"


    // $ANTLR start "rule__Type__Group_4__1"
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2182:1: rule__Type__Group_4__1 : rule__Type__Group_4__1__Impl ;
    public final void rule__Type__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2186:1: ( rule__Type__Group_4__1__Impl )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2187:2: rule__Type__Group_4__1__Impl
            {
            pushFollow(FOLLOW_rule__Type__Group_4__1__Impl_in_rule__Type__Group_4__14498);
            rule__Type__Group_4__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Group_4__1"


    // $ANTLR start "rule__Type__Group_4__1__Impl"
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2193:1: rule__Type__Group_4__1__Impl : ( ( rule__Type__DefAssignment_4_1 ) ) ;
    public final void rule__Type__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2197:1: ( ( ( rule__Type__DefAssignment_4_1 ) ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2198:1: ( ( rule__Type__DefAssignment_4_1 ) )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2198:1: ( ( rule__Type__DefAssignment_4_1 ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2199:1: ( rule__Type__DefAssignment_4_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypeAccess().getDefAssignment_4_1()); 
            }
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2200:1: ( rule__Type__DefAssignment_4_1 )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2200:2: rule__Type__DefAssignment_4_1
            {
            pushFollow(FOLLOW_rule__Type__DefAssignment_4_1_in_rule__Type__Group_4__1__Impl4525);
            rule__Type__DefAssignment_4_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTypeAccess().getDefAssignment_4_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Group_4__1__Impl"


    // $ANTLR start "rule__Bound__Group__0"
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2214:1: rule__Bound__Group__0 : rule__Bound__Group__0__Impl rule__Bound__Group__1 ;
    public final void rule__Bound__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2218:1: ( rule__Bound__Group__0__Impl rule__Bound__Group__1 )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2219:2: rule__Bound__Group__0__Impl rule__Bound__Group__1
            {
            pushFollow(FOLLOW_rule__Bound__Group__0__Impl_in_rule__Bound__Group__04559);
            rule__Bound__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Bound__Group__1_in_rule__Bound__Group__04562);
            rule__Bound__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Bound__Group__0"


    // $ANTLR start "rule__Bound__Group__0__Impl"
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2226:1: rule__Bound__Group__0__Impl : ( '-' ) ;
    public final void rule__Bound__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2230:1: ( ( '-' ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2231:1: ( '-' )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2231:1: ( '-' )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2232:1: '-'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBoundAccess().getHyphenMinusKeyword_0()); 
            }
            match(input,21,FOLLOW_21_in_rule__Bound__Group__0__Impl4590); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBoundAccess().getHyphenMinusKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Bound__Group__0__Impl"


    // $ANTLR start "rule__Bound__Group__1"
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2245:1: rule__Bound__Group__1 : rule__Bound__Group__1__Impl ;
    public final void rule__Bound__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2249:1: ( rule__Bound__Group__1__Impl )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2250:2: rule__Bound__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Bound__Group__1__Impl_in_rule__Bound__Group__14621);
            rule__Bound__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Bound__Group__1"


    // $ANTLR start "rule__Bound__Group__1__Impl"
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2256:1: rule__Bound__Group__1__Impl : ( RULE_INT ) ;
    public final void rule__Bound__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2260:1: ( ( RULE_INT ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2261:1: ( RULE_INT )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2261:1: ( RULE_INT )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2262:1: RULE_INT
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBoundAccess().getINTTerminalRuleCall_1()); 
            }
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__Bound__Group__1__Impl4648); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBoundAccess().getINTTerminalRuleCall_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Bound__Group__1__Impl"


    // $ANTLR start "rule__Constant__Group__0"
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2277:1: rule__Constant__Group__0 : rule__Constant__Group__0__Impl rule__Constant__Group__1 ;
    public final void rule__Constant__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2281:1: ( rule__Constant__Group__0__Impl rule__Constant__Group__1 )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2282:2: rule__Constant__Group__0__Impl rule__Constant__Group__1
            {
            pushFollow(FOLLOW_rule__Constant__Group__0__Impl_in_rule__Constant__Group__04681);
            rule__Constant__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Constant__Group__1_in_rule__Constant__Group__04684);
            rule__Constant__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constant__Group__0"


    // $ANTLR start "rule__Constant__Group__0__Impl"
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2289:1: rule__Constant__Group__0__Impl : ( 'const' ) ;
    public final void rule__Constant__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2293:1: ( ( 'const' ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2294:1: ( 'const' )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2294:1: ( 'const' )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2295:1: 'const'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConstantAccess().getConstKeyword_0()); 
            }
            match(input,41,FOLLOW_41_in_rule__Constant__Group__0__Impl4712); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getConstantAccess().getConstKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constant__Group__0__Impl"


    // $ANTLR start "rule__Constant__Group__1"
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2308:1: rule__Constant__Group__1 : rule__Constant__Group__1__Impl rule__Constant__Group__2 ;
    public final void rule__Constant__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2312:1: ( rule__Constant__Group__1__Impl rule__Constant__Group__2 )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2313:2: rule__Constant__Group__1__Impl rule__Constant__Group__2
            {
            pushFollow(FOLLOW_rule__Constant__Group__1__Impl_in_rule__Constant__Group__14743);
            rule__Constant__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Constant__Group__2_in_rule__Constant__Group__14746);
            rule__Constant__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constant__Group__1"


    // $ANTLR start "rule__Constant__Group__1__Impl"
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2320:1: rule__Constant__Group__1__Impl : ( ( rule__Constant__NameAssignment_1 ) ) ;
    public final void rule__Constant__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2324:1: ( ( ( rule__Constant__NameAssignment_1 ) ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2325:1: ( ( rule__Constant__NameAssignment_1 ) )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2325:1: ( ( rule__Constant__NameAssignment_1 ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2326:1: ( rule__Constant__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConstantAccess().getNameAssignment_1()); 
            }
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2327:1: ( rule__Constant__NameAssignment_1 )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2327:2: rule__Constant__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Constant__NameAssignment_1_in_rule__Constant__Group__1__Impl4773);
            rule__Constant__NameAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getConstantAccess().getNameAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constant__Group__1__Impl"


    // $ANTLR start "rule__Constant__Group__2"
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2337:1: rule__Constant__Group__2 : rule__Constant__Group__2__Impl rule__Constant__Group__3 ;
    public final void rule__Constant__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2341:1: ( rule__Constant__Group__2__Impl rule__Constant__Group__3 )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2342:2: rule__Constant__Group__2__Impl rule__Constant__Group__3
            {
            pushFollow(FOLLOW_rule__Constant__Group__2__Impl_in_rule__Constant__Group__24803);
            rule__Constant__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Constant__Group__3_in_rule__Constant__Group__24806);
            rule__Constant__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constant__Group__2"


    // $ANTLR start "rule__Constant__Group__2__Impl"
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2349:1: rule__Constant__Group__2__Impl : ( ( rule__Constant__Group_2__0 )? ) ;
    public final void rule__Constant__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2353:1: ( ( ( rule__Constant__Group_2__0 )? ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2354:1: ( ( rule__Constant__Group_2__0 )? )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2354:1: ( ( rule__Constant__Group_2__0 )? )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2355:1: ( rule__Constant__Group_2__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConstantAccess().getGroup_2()); 
            }
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2356:1: ( rule__Constant__Group_2__0 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==31) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2356:2: rule__Constant__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__Constant__Group_2__0_in_rule__Constant__Group__2__Impl4833);
                    rule__Constant__Group_2__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getConstantAccess().getGroup_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constant__Group__2__Impl"


    // $ANTLR start "rule__Constant__Group__3"
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2366:1: rule__Constant__Group__3 : rule__Constant__Group__3__Impl rule__Constant__Group__4 ;
    public final void rule__Constant__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2370:1: ( rule__Constant__Group__3__Impl rule__Constant__Group__4 )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2371:2: rule__Constant__Group__3__Impl rule__Constant__Group__4
            {
            pushFollow(FOLLOW_rule__Constant__Group__3__Impl_in_rule__Constant__Group__34864);
            rule__Constant__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Constant__Group__4_in_rule__Constant__Group__34867);
            rule__Constant__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constant__Group__3"


    // $ANTLR start "rule__Constant__Group__3__Impl"
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2378:1: rule__Constant__Group__3__Impl : ( '=' ) ;
    public final void rule__Constant__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2382:1: ( ( '=' ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2383:1: ( '=' )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2383:1: ( '=' )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2384:1: '='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConstantAccess().getEqualsSignKeyword_3()); 
            }
            match(input,18,FOLLOW_18_in_rule__Constant__Group__3__Impl4895); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getConstantAccess().getEqualsSignKeyword_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constant__Group__3__Impl"


    // $ANTLR start "rule__Constant__Group__4"
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2397:1: rule__Constant__Group__4 : rule__Constant__Group__4__Impl rule__Constant__Group__5 ;
    public final void rule__Constant__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2401:1: ( rule__Constant__Group__4__Impl rule__Constant__Group__5 )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2402:2: rule__Constant__Group__4__Impl rule__Constant__Group__5
            {
            pushFollow(FOLLOW_rule__Constant__Group__4__Impl_in_rule__Constant__Group__44926);
            rule__Constant__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Constant__Group__5_in_rule__Constant__Group__44929);
            rule__Constant__Group__5();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constant__Group__4"


    // $ANTLR start "rule__Constant__Group__4__Impl"
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2409:1: rule__Constant__Group__4__Impl : ( ( rule__Constant__ExprAssignment_4 ) ) ;
    public final void rule__Constant__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2413:1: ( ( ( rule__Constant__ExprAssignment_4 ) ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2414:1: ( ( rule__Constant__ExprAssignment_4 ) )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2414:1: ( ( rule__Constant__ExprAssignment_4 ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2415:1: ( rule__Constant__ExprAssignment_4 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConstantAccess().getExprAssignment_4()); 
            }
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2416:1: ( rule__Constant__ExprAssignment_4 )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2416:2: rule__Constant__ExprAssignment_4
            {
            pushFollow(FOLLOW_rule__Constant__ExprAssignment_4_in_rule__Constant__Group__4__Impl4956);
            rule__Constant__ExprAssignment_4();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getConstantAccess().getExprAssignment_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constant__Group__4__Impl"


    // $ANTLR start "rule__Constant__Group__5"
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2426:1: rule__Constant__Group__5 : rule__Constant__Group__5__Impl ;
    public final void rule__Constant__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2430:1: ( rule__Constant__Group__5__Impl )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2431:2: rule__Constant__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__Constant__Group__5__Impl_in_rule__Constant__Group__54986);
            rule__Constant__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constant__Group__5"


    // $ANTLR start "rule__Constant__Group__5__Impl"
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2437:1: rule__Constant__Group__5__Impl : ( ';' ) ;
    public final void rule__Constant__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2441:1: ( ( ';' ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2442:1: ( ';' )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2442:1: ( ';' )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2443:1: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConstantAccess().getSemicolonKeyword_5()); 
            }
            match(input,28,FOLLOW_28_in_rule__Constant__Group__5__Impl5014); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getConstantAccess().getSemicolonKeyword_5()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constant__Group__5__Impl"


    // $ANTLR start "rule__Constant__Group_2__0"
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2468:1: rule__Constant__Group_2__0 : rule__Constant__Group_2__0__Impl rule__Constant__Group_2__1 ;
    public final void rule__Constant__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2472:1: ( rule__Constant__Group_2__0__Impl rule__Constant__Group_2__1 )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2473:2: rule__Constant__Group_2__0__Impl rule__Constant__Group_2__1
            {
            pushFollow(FOLLOW_rule__Constant__Group_2__0__Impl_in_rule__Constant__Group_2__05057);
            rule__Constant__Group_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Constant__Group_2__1_in_rule__Constant__Group_2__05060);
            rule__Constant__Group_2__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constant__Group_2__0"


    // $ANTLR start "rule__Constant__Group_2__0__Impl"
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2480:1: rule__Constant__Group_2__0__Impl : ( ':' ) ;
    public final void rule__Constant__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2484:1: ( ( ':' ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2485:1: ( ':' )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2485:1: ( ':' )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2486:1: ':'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConstantAccess().getColonKeyword_2_0()); 
            }
            match(input,31,FOLLOW_31_in_rule__Constant__Group_2__0__Impl5088); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getConstantAccess().getColonKeyword_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constant__Group_2__0__Impl"


    // $ANTLR start "rule__Constant__Group_2__1"
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2499:1: rule__Constant__Group_2__1 : rule__Constant__Group_2__1__Impl ;
    public final void rule__Constant__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2503:1: ( rule__Constant__Group_2__1__Impl )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2504:2: rule__Constant__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__Constant__Group_2__1__Impl_in_rule__Constant__Group_2__15119);
            rule__Constant__Group_2__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constant__Group_2__1"


    // $ANTLR start "rule__Constant__Group_2__1__Impl"
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2510:1: rule__Constant__Group_2__1__Impl : ( ( rule__Constant__TypeAssignment_2_1 ) ) ;
    public final void rule__Constant__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2514:1: ( ( ( rule__Constant__TypeAssignment_2_1 ) ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2515:1: ( ( rule__Constant__TypeAssignment_2_1 ) )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2515:1: ( ( rule__Constant__TypeAssignment_2_1 ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2516:1: ( rule__Constant__TypeAssignment_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConstantAccess().getTypeAssignment_2_1()); 
            }
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2517:1: ( rule__Constant__TypeAssignment_2_1 )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2517:2: rule__Constant__TypeAssignment_2_1
            {
            pushFollow(FOLLOW_rule__Constant__TypeAssignment_2_1_in_rule__Constant__Group_2__1__Impl5146);
            rule__Constant__TypeAssignment_2_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getConstantAccess().getTypeAssignment_2_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constant__Group_2__1__Impl"


    // $ANTLR start "rule__Node__Group__0"
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2531:1: rule__Node__Group__0 : rule__Node__Group__0__Impl rule__Node__Group__1 ;
    public final void rule__Node__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2535:1: ( rule__Node__Group__0__Impl rule__Node__Group__1 )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2536:2: rule__Node__Group__0__Impl rule__Node__Group__1
            {
            pushFollow(FOLLOW_rule__Node__Group__0__Impl_in_rule__Node__Group__05180);
            rule__Node__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Node__Group__1_in_rule__Node__Group__05183);
            rule__Node__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Node__Group__0"


    // $ANTLR start "rule__Node__Group__0__Impl"
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2543:1: rule__Node__Group__0__Impl : ( 'node' ) ;
    public final void rule__Node__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2547:1: ( ( 'node' ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2548:1: ( 'node' )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2548:1: ( 'node' )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2549:1: 'node'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNodeAccess().getNodeKeyword_0()); 
            }
            match(input,42,FOLLOW_42_in_rule__Node__Group__0__Impl5211); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getNodeAccess().getNodeKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Node__Group__0__Impl"


    // $ANTLR start "rule__Node__Group__1"
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2562:1: rule__Node__Group__1 : rule__Node__Group__1__Impl rule__Node__Group__2 ;
    public final void rule__Node__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2566:1: ( rule__Node__Group__1__Impl rule__Node__Group__2 )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2567:2: rule__Node__Group__1__Impl rule__Node__Group__2
            {
            pushFollow(FOLLOW_rule__Node__Group__1__Impl_in_rule__Node__Group__15242);
            rule__Node__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Node__Group__2_in_rule__Node__Group__15245);
            rule__Node__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Node__Group__1"


    // $ANTLR start "rule__Node__Group__1__Impl"
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2574:1: rule__Node__Group__1__Impl : ( ( rule__Node__NameAssignment_1 ) ) ;
    public final void rule__Node__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2578:1: ( ( ( rule__Node__NameAssignment_1 ) ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2579:1: ( ( rule__Node__NameAssignment_1 ) )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2579:1: ( ( rule__Node__NameAssignment_1 ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2580:1: ( rule__Node__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNodeAccess().getNameAssignment_1()); 
            }
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2581:1: ( rule__Node__NameAssignment_1 )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2581:2: rule__Node__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Node__NameAssignment_1_in_rule__Node__Group__1__Impl5272);
            rule__Node__NameAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getNodeAccess().getNameAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Node__Group__1__Impl"


    // $ANTLR start "rule__Node__Group__2"
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2591:1: rule__Node__Group__2 : rule__Node__Group__2__Impl rule__Node__Group__3 ;
    public final void rule__Node__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2595:1: ( rule__Node__Group__2__Impl rule__Node__Group__3 )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2596:2: rule__Node__Group__2__Impl rule__Node__Group__3
            {
            pushFollow(FOLLOW_rule__Node__Group__2__Impl_in_rule__Node__Group__25302);
            rule__Node__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Node__Group__3_in_rule__Node__Group__25305);
            rule__Node__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Node__Group__2"


    // $ANTLR start "rule__Node__Group__2__Impl"
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2603:1: rule__Node__Group__2__Impl : ( '(' ) ;
    public final void rule__Node__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2607:1: ( ( '(' ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2608:1: ( '(' )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2608:1: ( '(' )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2609:1: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNodeAccess().getLeftParenthesisKeyword_2()); 
            }
            match(input,43,FOLLOW_43_in_rule__Node__Group__2__Impl5333); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getNodeAccess().getLeftParenthesisKeyword_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Node__Group__2__Impl"


    // $ANTLR start "rule__Node__Group__3"
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2622:1: rule__Node__Group__3 : rule__Node__Group__3__Impl rule__Node__Group__4 ;
    public final void rule__Node__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2626:1: ( rule__Node__Group__3__Impl rule__Node__Group__4 )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2627:2: rule__Node__Group__3__Impl rule__Node__Group__4
            {
            pushFollow(FOLLOW_rule__Node__Group__3__Impl_in_rule__Node__Group__35364);
            rule__Node__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Node__Group__4_in_rule__Node__Group__35367);
            rule__Node__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Node__Group__3"


    // $ANTLR start "rule__Node__Group__3__Impl"
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2634:1: rule__Node__Group__3__Impl : ( ( rule__Node__Group_3__0 )? ) ;
    public final void rule__Node__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2638:1: ( ( ( rule__Node__Group_3__0 )? ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2639:1: ( ( rule__Node__Group_3__0 )? )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2639:1: ( ( rule__Node__Group_3__0 )? )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2640:1: ( rule__Node__Group_3__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNodeAccess().getGroup_3()); 
            }
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2641:1: ( rule__Node__Group_3__0 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==RULE_ID) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2641:2: rule__Node__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__Node__Group_3__0_in_rule__Node__Group__3__Impl5394);
                    rule__Node__Group_3__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getNodeAccess().getGroup_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Node__Group__3__Impl"


    // $ANTLR start "rule__Node__Group__4"
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2651:1: rule__Node__Group__4 : rule__Node__Group__4__Impl rule__Node__Group__5 ;
    public final void rule__Node__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2655:1: ( rule__Node__Group__4__Impl rule__Node__Group__5 )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2656:2: rule__Node__Group__4__Impl rule__Node__Group__5
            {
            pushFollow(FOLLOW_rule__Node__Group__4__Impl_in_rule__Node__Group__45425);
            rule__Node__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Node__Group__5_in_rule__Node__Group__45428);
            rule__Node__Group__5();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Node__Group__4"


    // $ANTLR start "rule__Node__Group__4__Impl"
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2663:1: rule__Node__Group__4__Impl : ( ')' ) ;
    public final void rule__Node__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2667:1: ( ( ')' ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2668:1: ( ')' )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2668:1: ( ')' )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2669:1: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNodeAccess().getRightParenthesisKeyword_4()); 
            }
            match(input,44,FOLLOW_44_in_rule__Node__Group__4__Impl5456); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getNodeAccess().getRightParenthesisKeyword_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Node__Group__4__Impl"


    // $ANTLR start "rule__Node__Group__5"
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2682:1: rule__Node__Group__5 : rule__Node__Group__5__Impl rule__Node__Group__6 ;
    public final void rule__Node__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2686:1: ( rule__Node__Group__5__Impl rule__Node__Group__6 )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2687:2: rule__Node__Group__5__Impl rule__Node__Group__6
            {
            pushFollow(FOLLOW_rule__Node__Group__5__Impl_in_rule__Node__Group__55487);
            rule__Node__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Node__Group__6_in_rule__Node__Group__55490);
            rule__Node__Group__6();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Node__Group__5"


    // $ANTLR start "rule__Node__Group__5__Impl"
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2694:1: rule__Node__Group__5__Impl : ( 'returns' ) ;
    public final void rule__Node__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2698:1: ( ( 'returns' ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2699:1: ( 'returns' )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2699:1: ( 'returns' )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2700:1: 'returns'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNodeAccess().getReturnsKeyword_5()); 
            }
            match(input,45,FOLLOW_45_in_rule__Node__Group__5__Impl5518); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getNodeAccess().getReturnsKeyword_5()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Node__Group__5__Impl"


    // $ANTLR start "rule__Node__Group__6"
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2713:1: rule__Node__Group__6 : rule__Node__Group__6__Impl rule__Node__Group__7 ;
    public final void rule__Node__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2717:1: ( rule__Node__Group__6__Impl rule__Node__Group__7 )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2718:2: rule__Node__Group__6__Impl rule__Node__Group__7
            {
            pushFollow(FOLLOW_rule__Node__Group__6__Impl_in_rule__Node__Group__65549);
            rule__Node__Group__6__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Node__Group__7_in_rule__Node__Group__65552);
            rule__Node__Group__7();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Node__Group__6"


    // $ANTLR start "rule__Node__Group__6__Impl"
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2725:1: rule__Node__Group__6__Impl : ( '(' ) ;
    public final void rule__Node__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2729:1: ( ( '(' ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2730:1: ( '(' )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2730:1: ( '(' )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2731:1: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNodeAccess().getLeftParenthesisKeyword_6()); 
            }
            match(input,43,FOLLOW_43_in_rule__Node__Group__6__Impl5580); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getNodeAccess().getLeftParenthesisKeyword_6()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Node__Group__6__Impl"


    // $ANTLR start "rule__Node__Group__7"
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2744:1: rule__Node__Group__7 : rule__Node__Group__7__Impl rule__Node__Group__8 ;
    public final void rule__Node__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2748:1: ( rule__Node__Group__7__Impl rule__Node__Group__8 )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2749:2: rule__Node__Group__7__Impl rule__Node__Group__8
            {
            pushFollow(FOLLOW_rule__Node__Group__7__Impl_in_rule__Node__Group__75611);
            rule__Node__Group__7__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Node__Group__8_in_rule__Node__Group__75614);
            rule__Node__Group__8();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Node__Group__7"


    // $ANTLR start "rule__Node__Group__7__Impl"
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2756:1: rule__Node__Group__7__Impl : ( ( rule__Node__Group_7__0 )? ) ;
    public final void rule__Node__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2760:1: ( ( ( rule__Node__Group_7__0 )? ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2761:1: ( ( rule__Node__Group_7__0 )? )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2761:1: ( ( rule__Node__Group_7__0 )? )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2762:1: ( rule__Node__Group_7__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNodeAccess().getGroup_7()); 
            }
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2763:1: ( rule__Node__Group_7__0 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==RULE_ID) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2763:2: rule__Node__Group_7__0
                    {
                    pushFollow(FOLLOW_rule__Node__Group_7__0_in_rule__Node__Group__7__Impl5641);
                    rule__Node__Group_7__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getNodeAccess().getGroup_7()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Node__Group__7__Impl"


    // $ANTLR start "rule__Node__Group__8"
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2773:1: rule__Node__Group__8 : rule__Node__Group__8__Impl rule__Node__Group__9 ;
    public final void rule__Node__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2777:1: ( rule__Node__Group__8__Impl rule__Node__Group__9 )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2778:2: rule__Node__Group__8__Impl rule__Node__Group__9
            {
            pushFollow(FOLLOW_rule__Node__Group__8__Impl_in_rule__Node__Group__85672);
            rule__Node__Group__8__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Node__Group__9_in_rule__Node__Group__85675);
            rule__Node__Group__9();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Node__Group__8"


    // $ANTLR start "rule__Node__Group__8__Impl"
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2785:1: rule__Node__Group__8__Impl : ( ')' ) ;
    public final void rule__Node__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2789:1: ( ( ')' ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2790:1: ( ')' )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2790:1: ( ')' )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2791:1: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNodeAccess().getRightParenthesisKeyword_8()); 
            }
            match(input,44,FOLLOW_44_in_rule__Node__Group__8__Impl5703); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getNodeAccess().getRightParenthesisKeyword_8()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Node__Group__8__Impl"


    // $ANTLR start "rule__Node__Group__9"
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2804:1: rule__Node__Group__9 : rule__Node__Group__9__Impl rule__Node__Group__10 ;
    public final void rule__Node__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2808:1: ( rule__Node__Group__9__Impl rule__Node__Group__10 )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2809:2: rule__Node__Group__9__Impl rule__Node__Group__10
            {
            pushFollow(FOLLOW_rule__Node__Group__9__Impl_in_rule__Node__Group__95734);
            rule__Node__Group__9__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Node__Group__10_in_rule__Node__Group__95737);
            rule__Node__Group__10();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Node__Group__9"


    // $ANTLR start "rule__Node__Group__9__Impl"
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2816:1: rule__Node__Group__9__Impl : ( ';' ) ;
    public final void rule__Node__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2820:1: ( ( ';' ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2821:1: ( ';' )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2821:1: ( ';' )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2822:1: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNodeAccess().getSemicolonKeyword_9()); 
            }
            match(input,28,FOLLOW_28_in_rule__Node__Group__9__Impl5765); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getNodeAccess().getSemicolonKeyword_9()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Node__Group__9__Impl"


    // $ANTLR start "rule__Node__Group__10"
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2835:1: rule__Node__Group__10 : rule__Node__Group__10__Impl rule__Node__Group__11 ;
    public final void rule__Node__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2839:1: ( rule__Node__Group__10__Impl rule__Node__Group__11 )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2840:2: rule__Node__Group__10__Impl rule__Node__Group__11
            {
            pushFollow(FOLLOW_rule__Node__Group__10__Impl_in_rule__Node__Group__105796);
            rule__Node__Group__10__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Node__Group__11_in_rule__Node__Group__105799);
            rule__Node__Group__11();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Node__Group__10"


    // $ANTLR start "rule__Node__Group__10__Impl"
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2847:1: rule__Node__Group__10__Impl : ( ( rule__Node__Group_10__0 )? ) ;
    public final void rule__Node__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2851:1: ( ( ( rule__Node__Group_10__0 )? ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2852:1: ( ( rule__Node__Group_10__0 )? )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2852:1: ( ( rule__Node__Group_10__0 )? )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2853:1: ( rule__Node__Group_10__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNodeAccess().getGroup_10()); 
            }
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2854:1: ( rule__Node__Group_10__0 )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==48) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2854:2: rule__Node__Group_10__0
                    {
                    pushFollow(FOLLOW_rule__Node__Group_10__0_in_rule__Node__Group__10__Impl5826);
                    rule__Node__Group_10__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getNodeAccess().getGroup_10()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Node__Group__10__Impl"


    // $ANTLR start "rule__Node__Group__11"
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2864:1: rule__Node__Group__11 : rule__Node__Group__11__Impl rule__Node__Group__12 ;
    public final void rule__Node__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2868:1: ( rule__Node__Group__11__Impl rule__Node__Group__12 )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2869:2: rule__Node__Group__11__Impl rule__Node__Group__12
            {
            pushFollow(FOLLOW_rule__Node__Group__11__Impl_in_rule__Node__Group__115857);
            rule__Node__Group__11__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Node__Group__12_in_rule__Node__Group__115860);
            rule__Node__Group__12();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Node__Group__11"


    // $ANTLR start "rule__Node__Group__11__Impl"
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2876:1: rule__Node__Group__11__Impl : ( 'let' ) ;
    public final void rule__Node__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2880:1: ( ( 'let' ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2881:1: ( 'let' )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2881:1: ( 'let' )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2882:1: 'let'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNodeAccess().getLetKeyword_11()); 
            }
            match(input,46,FOLLOW_46_in_rule__Node__Group__11__Impl5888); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getNodeAccess().getLetKeyword_11()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Node__Group__11__Impl"


    // $ANTLR start "rule__Node__Group__12"
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2895:1: rule__Node__Group__12 : rule__Node__Group__12__Impl rule__Node__Group__13 ;
    public final void rule__Node__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2899:1: ( rule__Node__Group__12__Impl rule__Node__Group__13 )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2900:2: rule__Node__Group__12__Impl rule__Node__Group__13
            {
            pushFollow(FOLLOW_rule__Node__Group__12__Impl_in_rule__Node__Group__125919);
            rule__Node__Group__12__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Node__Group__13_in_rule__Node__Group__125922);
            rule__Node__Group__13();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Node__Group__12"


    // $ANTLR start "rule__Node__Group__12__Impl"
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2907:1: rule__Node__Group__12__Impl : ( ( rule__Node__Alternatives_12 )* ) ;
    public final void rule__Node__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2911:1: ( ( ( rule__Node__Alternatives_12 )* ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2912:1: ( ( rule__Node__Alternatives_12 )* )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2912:1: ( ( rule__Node__Alternatives_12 )* )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2913:1: ( rule__Node__Alternatives_12 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNodeAccess().getAlternatives_12()); 
            }
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2914:1: ( rule__Node__Alternatives_12 )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==RULE_ID||(LA18_0>=49 && LA18_0<=51)) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2914:2: rule__Node__Alternatives_12
            	    {
            	    pushFollow(FOLLOW_rule__Node__Alternatives_12_in_rule__Node__Group__12__Impl5949);
            	    rule__Node__Alternatives_12();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getNodeAccess().getAlternatives_12()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Node__Group__12__Impl"


    // $ANTLR start "rule__Node__Group__13"
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2924:1: rule__Node__Group__13 : rule__Node__Group__13__Impl rule__Node__Group__14 ;
    public final void rule__Node__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2928:1: ( rule__Node__Group__13__Impl rule__Node__Group__14 )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2929:2: rule__Node__Group__13__Impl rule__Node__Group__14
            {
            pushFollow(FOLLOW_rule__Node__Group__13__Impl_in_rule__Node__Group__135980);
            rule__Node__Group__13__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Node__Group__14_in_rule__Node__Group__135983);
            rule__Node__Group__14();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Node__Group__13"


    // $ANTLR start "rule__Node__Group__13__Impl"
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2936:1: rule__Node__Group__13__Impl : ( 'tel' ) ;
    public final void rule__Node__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2940:1: ( ( 'tel' ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2941:1: ( 'tel' )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2941:1: ( 'tel' )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2942:1: 'tel'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNodeAccess().getTelKeyword_13()); 
            }
            match(input,47,FOLLOW_47_in_rule__Node__Group__13__Impl6011); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getNodeAccess().getTelKeyword_13()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Node__Group__13__Impl"


    // $ANTLR start "rule__Node__Group__14"
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2955:1: rule__Node__Group__14 : rule__Node__Group__14__Impl ;
    public final void rule__Node__Group__14() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2959:1: ( rule__Node__Group__14__Impl )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2960:2: rule__Node__Group__14__Impl
            {
            pushFollow(FOLLOW_rule__Node__Group__14__Impl_in_rule__Node__Group__146042);
            rule__Node__Group__14__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Node__Group__14"


    // $ANTLR start "rule__Node__Group__14__Impl"
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2966:1: rule__Node__Group__14__Impl : ( ( ';' )? ) ;
    public final void rule__Node__Group__14__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2970:1: ( ( ( ';' )? ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2971:1: ( ( ';' )? )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2971:1: ( ( ';' )? )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2972:1: ( ';' )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNodeAccess().getSemicolonKeyword_14()); 
            }
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2973:1: ( ';' )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==28) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2974:2: ';'
                    {
                    match(input,28,FOLLOW_28_in_rule__Node__Group__14__Impl6071); if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getNodeAccess().getSemicolonKeyword_14()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Node__Group__14__Impl"


    // $ANTLR start "rule__Node__Group_3__0"
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3015:1: rule__Node__Group_3__0 : rule__Node__Group_3__0__Impl rule__Node__Group_3__1 ;
    public final void rule__Node__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3019:1: ( rule__Node__Group_3__0__Impl rule__Node__Group_3__1 )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3020:2: rule__Node__Group_3__0__Impl rule__Node__Group_3__1
            {
            pushFollow(FOLLOW_rule__Node__Group_3__0__Impl_in_rule__Node__Group_3__06134);
            rule__Node__Group_3__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Node__Group_3__1_in_rule__Node__Group_3__06137);
            rule__Node__Group_3__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Node__Group_3__0"


    // $ANTLR start "rule__Node__Group_3__0__Impl"
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3027:1: rule__Node__Group_3__0__Impl : ( ( rule__Node__InputsAssignment_3_0 ) ) ;
    public final void rule__Node__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3031:1: ( ( ( rule__Node__InputsAssignment_3_0 ) ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3032:1: ( ( rule__Node__InputsAssignment_3_0 ) )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3032:1: ( ( rule__Node__InputsAssignment_3_0 ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3033:1: ( rule__Node__InputsAssignment_3_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNodeAccess().getInputsAssignment_3_0()); 
            }
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3034:1: ( rule__Node__InputsAssignment_3_0 )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3034:2: rule__Node__InputsAssignment_3_0
            {
            pushFollow(FOLLOW_rule__Node__InputsAssignment_3_0_in_rule__Node__Group_3__0__Impl6164);
            rule__Node__InputsAssignment_3_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getNodeAccess().getInputsAssignment_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Node__Group_3__0__Impl"


    // $ANTLR start "rule__Node__Group_3__1"
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3044:1: rule__Node__Group_3__1 : rule__Node__Group_3__1__Impl ;
    public final void rule__Node__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3048:1: ( rule__Node__Group_3__1__Impl )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3049:2: rule__Node__Group_3__1__Impl
            {
            pushFollow(FOLLOW_rule__Node__Group_3__1__Impl_in_rule__Node__Group_3__16194);
            rule__Node__Group_3__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Node__Group_3__1"


    // $ANTLR start "rule__Node__Group_3__1__Impl"
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3055:1: rule__Node__Group_3__1__Impl : ( ( rule__Node__Group_3_1__0 )* ) ;
    public final void rule__Node__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3059:1: ( ( ( rule__Node__Group_3_1__0 )* ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3060:1: ( ( rule__Node__Group_3_1__0 )* )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3060:1: ( ( rule__Node__Group_3_1__0 )* )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3061:1: ( rule__Node__Group_3_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNodeAccess().getGroup_3_1()); 
            }
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3062:1: ( rule__Node__Group_3_1__0 )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==28) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3062:2: rule__Node__Group_3_1__0
            	    {
            	    pushFollow(FOLLOW_rule__Node__Group_3_1__0_in_rule__Node__Group_3__1__Impl6221);
            	    rule__Node__Group_3_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getNodeAccess().getGroup_3_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Node__Group_3__1__Impl"


    // $ANTLR start "rule__Node__Group_3_1__0"
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3076:1: rule__Node__Group_3_1__0 : rule__Node__Group_3_1__0__Impl rule__Node__Group_3_1__1 ;
    public final void rule__Node__Group_3_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3080:1: ( rule__Node__Group_3_1__0__Impl rule__Node__Group_3_1__1 )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3081:2: rule__Node__Group_3_1__0__Impl rule__Node__Group_3_1__1
            {
            pushFollow(FOLLOW_rule__Node__Group_3_1__0__Impl_in_rule__Node__Group_3_1__06256);
            rule__Node__Group_3_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Node__Group_3_1__1_in_rule__Node__Group_3_1__06259);
            rule__Node__Group_3_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Node__Group_3_1__0"


    // $ANTLR start "rule__Node__Group_3_1__0__Impl"
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3088:1: rule__Node__Group_3_1__0__Impl : ( ';' ) ;
    public final void rule__Node__Group_3_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3092:1: ( ( ';' ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3093:1: ( ';' )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3093:1: ( ';' )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3094:1: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNodeAccess().getSemicolonKeyword_3_1_0()); 
            }
            match(input,28,FOLLOW_28_in_rule__Node__Group_3_1__0__Impl6287); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getNodeAccess().getSemicolonKeyword_3_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Node__Group_3_1__0__Impl"


    // $ANTLR start "rule__Node__Group_3_1__1"
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3107:1: rule__Node__Group_3_1__1 : rule__Node__Group_3_1__1__Impl ;
    public final void rule__Node__Group_3_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3111:1: ( rule__Node__Group_3_1__1__Impl )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3112:2: rule__Node__Group_3_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Node__Group_3_1__1__Impl_in_rule__Node__Group_3_1__16318);
            rule__Node__Group_3_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Node__Group_3_1__1"


    // $ANTLR start "rule__Node__Group_3_1__1__Impl"
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3118:1: rule__Node__Group_3_1__1__Impl : ( ( rule__Node__InputsAssignment_3_1_1 ) ) ;
    public final void rule__Node__Group_3_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3122:1: ( ( ( rule__Node__InputsAssignment_3_1_1 ) ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3123:1: ( ( rule__Node__InputsAssignment_3_1_1 ) )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3123:1: ( ( rule__Node__InputsAssignment_3_1_1 ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3124:1: ( rule__Node__InputsAssignment_3_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNodeAccess().getInputsAssignment_3_1_1()); 
            }
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3125:1: ( rule__Node__InputsAssignment_3_1_1 )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3125:2: rule__Node__InputsAssignment_3_1_1
            {
            pushFollow(FOLLOW_rule__Node__InputsAssignment_3_1_1_in_rule__Node__Group_3_1__1__Impl6345);
            rule__Node__InputsAssignment_3_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getNodeAccess().getInputsAssignment_3_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Node__Group_3_1__1__Impl"


    // $ANTLR start "rule__Node__Group_7__0"
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3139:1: rule__Node__Group_7__0 : rule__Node__Group_7__0__Impl rule__Node__Group_7__1 ;
    public final void rule__Node__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3143:1: ( rule__Node__Group_7__0__Impl rule__Node__Group_7__1 )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3144:2: rule__Node__Group_7__0__Impl rule__Node__Group_7__1
            {
            pushFollow(FOLLOW_rule__Node__Group_7__0__Impl_in_rule__Node__Group_7__06379);
            rule__Node__Group_7__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Node__Group_7__1_in_rule__Node__Group_7__06382);
            rule__Node__Group_7__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Node__Group_7__0"


    // $ANTLR start "rule__Node__Group_7__0__Impl"
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3151:1: rule__Node__Group_7__0__Impl : ( ( rule__Node__OutputsAssignment_7_0 ) ) ;
    public final void rule__Node__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3155:1: ( ( ( rule__Node__OutputsAssignment_7_0 ) ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3156:1: ( ( rule__Node__OutputsAssignment_7_0 ) )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3156:1: ( ( rule__Node__OutputsAssignment_7_0 ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3157:1: ( rule__Node__OutputsAssignment_7_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNodeAccess().getOutputsAssignment_7_0()); 
            }
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3158:1: ( rule__Node__OutputsAssignment_7_0 )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3158:2: rule__Node__OutputsAssignment_7_0
            {
            pushFollow(FOLLOW_rule__Node__OutputsAssignment_7_0_in_rule__Node__Group_7__0__Impl6409);
            rule__Node__OutputsAssignment_7_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getNodeAccess().getOutputsAssignment_7_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Node__Group_7__0__Impl"


    // $ANTLR start "rule__Node__Group_7__1"
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3168:1: rule__Node__Group_7__1 : rule__Node__Group_7__1__Impl ;
    public final void rule__Node__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3172:1: ( rule__Node__Group_7__1__Impl )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3173:2: rule__Node__Group_7__1__Impl
            {
            pushFollow(FOLLOW_rule__Node__Group_7__1__Impl_in_rule__Node__Group_7__16439);
            rule__Node__Group_7__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Node__Group_7__1"


    // $ANTLR start "rule__Node__Group_7__1__Impl"
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3179:1: rule__Node__Group_7__1__Impl : ( ( rule__Node__Group_7_1__0 )* ) ;
    public final void rule__Node__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3183:1: ( ( ( rule__Node__Group_7_1__0 )* ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3184:1: ( ( rule__Node__Group_7_1__0 )* )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3184:1: ( ( rule__Node__Group_7_1__0 )* )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3185:1: ( rule__Node__Group_7_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNodeAccess().getGroup_7_1()); 
            }
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3186:1: ( rule__Node__Group_7_1__0 )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==28) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3186:2: rule__Node__Group_7_1__0
            	    {
            	    pushFollow(FOLLOW_rule__Node__Group_7_1__0_in_rule__Node__Group_7__1__Impl6466);
            	    rule__Node__Group_7_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getNodeAccess().getGroup_7_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Node__Group_7__1__Impl"


    // $ANTLR start "rule__Node__Group_7_1__0"
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3200:1: rule__Node__Group_7_1__0 : rule__Node__Group_7_1__0__Impl rule__Node__Group_7_1__1 ;
    public final void rule__Node__Group_7_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3204:1: ( rule__Node__Group_7_1__0__Impl rule__Node__Group_7_1__1 )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3205:2: rule__Node__Group_7_1__0__Impl rule__Node__Group_7_1__1
            {
            pushFollow(FOLLOW_rule__Node__Group_7_1__0__Impl_in_rule__Node__Group_7_1__06501);
            rule__Node__Group_7_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Node__Group_7_1__1_in_rule__Node__Group_7_1__06504);
            rule__Node__Group_7_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Node__Group_7_1__0"


    // $ANTLR start "rule__Node__Group_7_1__0__Impl"
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3212:1: rule__Node__Group_7_1__0__Impl : ( ';' ) ;
    public final void rule__Node__Group_7_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3216:1: ( ( ';' ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3217:1: ( ';' )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3217:1: ( ';' )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3218:1: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNodeAccess().getSemicolonKeyword_7_1_0()); 
            }
            match(input,28,FOLLOW_28_in_rule__Node__Group_7_1__0__Impl6532); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getNodeAccess().getSemicolonKeyword_7_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Node__Group_7_1__0__Impl"


    // $ANTLR start "rule__Node__Group_7_1__1"
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3231:1: rule__Node__Group_7_1__1 : rule__Node__Group_7_1__1__Impl ;
    public final void rule__Node__Group_7_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3235:1: ( rule__Node__Group_7_1__1__Impl )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3236:2: rule__Node__Group_7_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Node__Group_7_1__1__Impl_in_rule__Node__Group_7_1__16563);
            rule__Node__Group_7_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Node__Group_7_1__1"


    // $ANTLR start "rule__Node__Group_7_1__1__Impl"
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3242:1: rule__Node__Group_7_1__1__Impl : ( ( rule__Node__OutputsAssignment_7_1_1 ) ) ;
    public final void rule__Node__Group_7_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3246:1: ( ( ( rule__Node__OutputsAssignment_7_1_1 ) ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3247:1: ( ( rule__Node__OutputsAssignment_7_1_1 ) )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3247:1: ( ( rule__Node__OutputsAssignment_7_1_1 ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3248:1: ( rule__Node__OutputsAssignment_7_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNodeAccess().getOutputsAssignment_7_1_1()); 
            }
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3249:1: ( rule__Node__OutputsAssignment_7_1_1 )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3249:2: rule__Node__OutputsAssignment_7_1_1
            {
            pushFollow(FOLLOW_rule__Node__OutputsAssignment_7_1_1_in_rule__Node__Group_7_1__1__Impl6590);
            rule__Node__OutputsAssignment_7_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getNodeAccess().getOutputsAssignment_7_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Node__Group_7_1__1__Impl"


    // $ANTLR start "rule__Node__Group_10__0"
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3263:1: rule__Node__Group_10__0 : rule__Node__Group_10__0__Impl rule__Node__Group_10__1 ;
    public final void rule__Node__Group_10__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3267:1: ( rule__Node__Group_10__0__Impl rule__Node__Group_10__1 )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3268:2: rule__Node__Group_10__0__Impl rule__Node__Group_10__1
            {
            pushFollow(FOLLOW_rule__Node__Group_10__0__Impl_in_rule__Node__Group_10__06624);
            rule__Node__Group_10__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Node__Group_10__1_in_rule__Node__Group_10__06627);
            rule__Node__Group_10__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Node__Group_10__0"


    // $ANTLR start "rule__Node__Group_10__0__Impl"
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3275:1: rule__Node__Group_10__0__Impl : ( 'var' ) ;
    public final void rule__Node__Group_10__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3279:1: ( ( 'var' ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3280:1: ( 'var' )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3280:1: ( 'var' )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3281:1: 'var'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNodeAccess().getVarKeyword_10_0()); 
            }
            match(input,48,FOLLOW_48_in_rule__Node__Group_10__0__Impl6655); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getNodeAccess().getVarKeyword_10_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Node__Group_10__0__Impl"


    // $ANTLR start "rule__Node__Group_10__1"
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3294:1: rule__Node__Group_10__1 : rule__Node__Group_10__1__Impl ;
    public final void rule__Node__Group_10__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3298:1: ( rule__Node__Group_10__1__Impl )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3299:2: rule__Node__Group_10__1__Impl
            {
            pushFollow(FOLLOW_rule__Node__Group_10__1__Impl_in_rule__Node__Group_10__16686);
            rule__Node__Group_10__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Node__Group_10__1"


    // $ANTLR start "rule__Node__Group_10__1__Impl"
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3305:1: rule__Node__Group_10__1__Impl : ( ( rule__Node__Group_10_1__0 )* ) ;
    public final void rule__Node__Group_10__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3309:1: ( ( ( rule__Node__Group_10_1__0 )* ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3310:1: ( ( rule__Node__Group_10_1__0 )* )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3310:1: ( ( rule__Node__Group_10_1__0 )* )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3311:1: ( rule__Node__Group_10_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNodeAccess().getGroup_10_1()); 
            }
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3312:1: ( rule__Node__Group_10_1__0 )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==RULE_ID) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3312:2: rule__Node__Group_10_1__0
            	    {
            	    pushFollow(FOLLOW_rule__Node__Group_10_1__0_in_rule__Node__Group_10__1__Impl6713);
            	    rule__Node__Group_10_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getNodeAccess().getGroup_10_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Node__Group_10__1__Impl"


    // $ANTLR start "rule__Node__Group_10_1__0"
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3326:1: rule__Node__Group_10_1__0 : rule__Node__Group_10_1__0__Impl rule__Node__Group_10_1__1 ;
    public final void rule__Node__Group_10_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3330:1: ( rule__Node__Group_10_1__0__Impl rule__Node__Group_10_1__1 )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3331:2: rule__Node__Group_10_1__0__Impl rule__Node__Group_10_1__1
            {
            pushFollow(FOLLOW_rule__Node__Group_10_1__0__Impl_in_rule__Node__Group_10_1__06748);
            rule__Node__Group_10_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Node__Group_10_1__1_in_rule__Node__Group_10_1__06751);
            rule__Node__Group_10_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Node__Group_10_1__0"


    // $ANTLR start "rule__Node__Group_10_1__0__Impl"
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3338:1: rule__Node__Group_10_1__0__Impl : ( ( rule__Node__LocalsAssignment_10_1_0 ) ) ;
    public final void rule__Node__Group_10_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3342:1: ( ( ( rule__Node__LocalsAssignment_10_1_0 ) ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3343:1: ( ( rule__Node__LocalsAssignment_10_1_0 ) )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3343:1: ( ( rule__Node__LocalsAssignment_10_1_0 ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3344:1: ( rule__Node__LocalsAssignment_10_1_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNodeAccess().getLocalsAssignment_10_1_0()); 
            }
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3345:1: ( rule__Node__LocalsAssignment_10_1_0 )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3345:2: rule__Node__LocalsAssignment_10_1_0
            {
            pushFollow(FOLLOW_rule__Node__LocalsAssignment_10_1_0_in_rule__Node__Group_10_1__0__Impl6778);
            rule__Node__LocalsAssignment_10_1_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getNodeAccess().getLocalsAssignment_10_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Node__Group_10_1__0__Impl"


    // $ANTLR start "rule__Node__Group_10_1__1"
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3355:1: rule__Node__Group_10_1__1 : rule__Node__Group_10_1__1__Impl ;
    public final void rule__Node__Group_10_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3359:1: ( rule__Node__Group_10_1__1__Impl )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3360:2: rule__Node__Group_10_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Node__Group_10_1__1__Impl_in_rule__Node__Group_10_1__16808);
            rule__Node__Group_10_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Node__Group_10_1__1"


    // $ANTLR start "rule__Node__Group_10_1__1__Impl"
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3366:1: rule__Node__Group_10_1__1__Impl : ( ';' ) ;
    public final void rule__Node__Group_10_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3370:1: ( ( ';' ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3371:1: ( ';' )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3371:1: ( ';' )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3372:1: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNodeAccess().getSemicolonKeyword_10_1_1()); 
            }
            match(input,28,FOLLOW_28_in_rule__Node__Group_10_1__1__Impl6836); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getNodeAccess().getSemicolonKeyword_10_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Node__Group_10_1__1__Impl"


    // $ANTLR start "rule__VarGroup__Group__0"
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3389:1: rule__VarGroup__Group__0 : rule__VarGroup__Group__0__Impl rule__VarGroup__Group__1 ;
    public final void rule__VarGroup__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3393:1: ( rule__VarGroup__Group__0__Impl rule__VarGroup__Group__1 )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3394:2: rule__VarGroup__Group__0__Impl rule__VarGroup__Group__1
            {
            pushFollow(FOLLOW_rule__VarGroup__Group__0__Impl_in_rule__VarGroup__Group__06871);
            rule__VarGroup__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__VarGroup__Group__1_in_rule__VarGroup__Group__06874);
            rule__VarGroup__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VarGroup__Group__0"


    // $ANTLR start "rule__VarGroup__Group__0__Impl"
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3401:1: rule__VarGroup__Group__0__Impl : ( ( rule__VarGroup__VarsAssignment_0 ) ) ;
    public final void rule__VarGroup__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3405:1: ( ( ( rule__VarGroup__VarsAssignment_0 ) ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3406:1: ( ( rule__VarGroup__VarsAssignment_0 ) )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3406:1: ( ( rule__VarGroup__VarsAssignment_0 ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3407:1: ( rule__VarGroup__VarsAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVarGroupAccess().getVarsAssignment_0()); 
            }
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3408:1: ( rule__VarGroup__VarsAssignment_0 )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3408:2: rule__VarGroup__VarsAssignment_0
            {
            pushFollow(FOLLOW_rule__VarGroup__VarsAssignment_0_in_rule__VarGroup__Group__0__Impl6901);
            rule__VarGroup__VarsAssignment_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getVarGroupAccess().getVarsAssignment_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VarGroup__Group__0__Impl"


    // $ANTLR start "rule__VarGroup__Group__1"
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3418:1: rule__VarGroup__Group__1 : rule__VarGroup__Group__1__Impl rule__VarGroup__Group__2 ;
    public final void rule__VarGroup__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3422:1: ( rule__VarGroup__Group__1__Impl rule__VarGroup__Group__2 )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3423:2: rule__VarGroup__Group__1__Impl rule__VarGroup__Group__2
            {
            pushFollow(FOLLOW_rule__VarGroup__Group__1__Impl_in_rule__VarGroup__Group__16931);
            rule__VarGroup__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__VarGroup__Group__2_in_rule__VarGroup__Group__16934);
            rule__VarGroup__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VarGroup__Group__1"


    // $ANTLR start "rule__VarGroup__Group__1__Impl"
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3430:1: rule__VarGroup__Group__1__Impl : ( ( rule__VarGroup__Group_1__0 )* ) ;
    public final void rule__VarGroup__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3434:1: ( ( ( rule__VarGroup__Group_1__0 )* ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3435:1: ( ( rule__VarGroup__Group_1__0 )* )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3435:1: ( ( rule__VarGroup__Group_1__0 )* )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3436:1: ( rule__VarGroup__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVarGroupAccess().getGroup_1()); 
            }
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3437:1: ( rule__VarGroup__Group_1__0 )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==38) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3437:2: rule__VarGroup__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__VarGroup__Group_1__0_in_rule__VarGroup__Group__1__Impl6961);
            	    rule__VarGroup__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop23;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getVarGroupAccess().getGroup_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VarGroup__Group__1__Impl"


    // $ANTLR start "rule__VarGroup__Group__2"
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3447:1: rule__VarGroup__Group__2 : rule__VarGroup__Group__2__Impl rule__VarGroup__Group__3 ;
    public final void rule__VarGroup__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3451:1: ( rule__VarGroup__Group__2__Impl rule__VarGroup__Group__3 )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3452:2: rule__VarGroup__Group__2__Impl rule__VarGroup__Group__3
            {
            pushFollow(FOLLOW_rule__VarGroup__Group__2__Impl_in_rule__VarGroup__Group__26992);
            rule__VarGroup__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__VarGroup__Group__3_in_rule__VarGroup__Group__26995);
            rule__VarGroup__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VarGroup__Group__2"


    // $ANTLR start "rule__VarGroup__Group__2__Impl"
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3459:1: rule__VarGroup__Group__2__Impl : ( ':' ) ;
    public final void rule__VarGroup__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3463:1: ( ( ':' ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3464:1: ( ':' )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3464:1: ( ':' )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3465:1: ':'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVarGroupAccess().getColonKeyword_2()); 
            }
            match(input,31,FOLLOW_31_in_rule__VarGroup__Group__2__Impl7023); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getVarGroupAccess().getColonKeyword_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VarGroup__Group__2__Impl"


    // $ANTLR start "rule__VarGroup__Group__3"
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3478:1: rule__VarGroup__Group__3 : rule__VarGroup__Group__3__Impl ;
    public final void rule__VarGroup__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3482:1: ( rule__VarGroup__Group__3__Impl )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3483:2: rule__VarGroup__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__VarGroup__Group__3__Impl_in_rule__VarGroup__Group__37054);
            rule__VarGroup__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VarGroup__Group__3"


    // $ANTLR start "rule__VarGroup__Group__3__Impl"
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3489:1: rule__VarGroup__Group__3__Impl : ( ( rule__VarGroup__TypeAssignment_3 ) ) ;
    public final void rule__VarGroup__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3493:1: ( ( ( rule__VarGroup__TypeAssignment_3 ) ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3494:1: ( ( rule__VarGroup__TypeAssignment_3 ) )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3494:1: ( ( rule__VarGroup__TypeAssignment_3 ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3495:1: ( rule__VarGroup__TypeAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVarGroupAccess().getTypeAssignment_3()); 
            }
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3496:1: ( rule__VarGroup__TypeAssignment_3 )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3496:2: rule__VarGroup__TypeAssignment_3
            {
            pushFollow(FOLLOW_rule__VarGroup__TypeAssignment_3_in_rule__VarGroup__Group__3__Impl7081);
            rule__VarGroup__TypeAssignment_3();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getVarGroupAccess().getTypeAssignment_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VarGroup__Group__3__Impl"


    // $ANTLR start "rule__VarGroup__Group_1__0"
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3514:1: rule__VarGroup__Group_1__0 : rule__VarGroup__Group_1__0__Impl rule__VarGroup__Group_1__1 ;
    public final void rule__VarGroup__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3518:1: ( rule__VarGroup__Group_1__0__Impl rule__VarGroup__Group_1__1 )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3519:2: rule__VarGroup__Group_1__0__Impl rule__VarGroup__Group_1__1
            {
            pushFollow(FOLLOW_rule__VarGroup__Group_1__0__Impl_in_rule__VarGroup__Group_1__07119);
            rule__VarGroup__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__VarGroup__Group_1__1_in_rule__VarGroup__Group_1__07122);
            rule__VarGroup__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VarGroup__Group_1__0"


    // $ANTLR start "rule__VarGroup__Group_1__0__Impl"
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3526:1: rule__VarGroup__Group_1__0__Impl : ( ',' ) ;
    public final void rule__VarGroup__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3530:1: ( ( ',' ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3531:1: ( ',' )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3531:1: ( ',' )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3532:1: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVarGroupAccess().getCommaKeyword_1_0()); 
            }
            match(input,38,FOLLOW_38_in_rule__VarGroup__Group_1__0__Impl7150); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getVarGroupAccess().getCommaKeyword_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VarGroup__Group_1__0__Impl"


    // $ANTLR start "rule__VarGroup__Group_1__1"
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3545:1: rule__VarGroup__Group_1__1 : rule__VarGroup__Group_1__1__Impl ;
    public final void rule__VarGroup__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3549:1: ( rule__VarGroup__Group_1__1__Impl )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3550:2: rule__VarGroup__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__VarGroup__Group_1__1__Impl_in_rule__VarGroup__Group_1__17181);
            rule__VarGroup__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VarGroup__Group_1__1"


    // $ANTLR start "rule__VarGroup__Group_1__1__Impl"
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3556:1: rule__VarGroup__Group_1__1__Impl : ( ( rule__VarGroup__VarsAssignment_1_1 ) ) ;
    public final void rule__VarGroup__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3560:1: ( ( ( rule__VarGroup__VarsAssignment_1_1 ) ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3561:1: ( ( rule__VarGroup__VarsAssignment_1_1 ) )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3561:1: ( ( rule__VarGroup__VarsAssignment_1_1 ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3562:1: ( rule__VarGroup__VarsAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVarGroupAccess().getVarsAssignment_1_1()); 
            }
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3563:1: ( rule__VarGroup__VarsAssignment_1_1 )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3563:2: rule__VarGroup__VarsAssignment_1_1
            {
            pushFollow(FOLLOW_rule__VarGroup__VarsAssignment_1_1_in_rule__VarGroup__Group_1__1__Impl7208);
            rule__VarGroup__VarsAssignment_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getVarGroupAccess().getVarsAssignment_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VarGroup__Group_1__1__Impl"


    // $ANTLR start "rule__Equation__Group__0"
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3577:1: rule__Equation__Group__0 : rule__Equation__Group__0__Impl rule__Equation__Group__1 ;
    public final void rule__Equation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3581:1: ( rule__Equation__Group__0__Impl rule__Equation__Group__1 )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3582:2: rule__Equation__Group__0__Impl rule__Equation__Group__1
            {
            pushFollow(FOLLOW_rule__Equation__Group__0__Impl_in_rule__Equation__Group__07242);
            rule__Equation__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Equation__Group__1_in_rule__Equation__Group__07245);
            rule__Equation__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Equation__Group__0"


    // $ANTLR start "rule__Equation__Group__0__Impl"
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3589:1: rule__Equation__Group__0__Impl : ( ( rule__Equation__LhsAssignment_0 ) ) ;
    public final void rule__Equation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3593:1: ( ( ( rule__Equation__LhsAssignment_0 ) ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3594:1: ( ( rule__Equation__LhsAssignment_0 ) )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3594:1: ( ( rule__Equation__LhsAssignment_0 ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3595:1: ( rule__Equation__LhsAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEquationAccess().getLhsAssignment_0()); 
            }
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3596:1: ( rule__Equation__LhsAssignment_0 )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3596:2: rule__Equation__LhsAssignment_0
            {
            pushFollow(FOLLOW_rule__Equation__LhsAssignment_0_in_rule__Equation__Group__0__Impl7272);
            rule__Equation__LhsAssignment_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEquationAccess().getLhsAssignment_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Equation__Group__0__Impl"


    // $ANTLR start "rule__Equation__Group__1"
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3606:1: rule__Equation__Group__1 : rule__Equation__Group__1__Impl rule__Equation__Group__2 ;
    public final void rule__Equation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3610:1: ( rule__Equation__Group__1__Impl rule__Equation__Group__2 )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3611:2: rule__Equation__Group__1__Impl rule__Equation__Group__2
            {
            pushFollow(FOLLOW_rule__Equation__Group__1__Impl_in_rule__Equation__Group__17302);
            rule__Equation__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Equation__Group__2_in_rule__Equation__Group__17305);
            rule__Equation__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Equation__Group__1"


    // $ANTLR start "rule__Equation__Group__1__Impl"
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3618:1: rule__Equation__Group__1__Impl : ( ( rule__Equation__Group_1__0 )* ) ;
    public final void rule__Equation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3622:1: ( ( ( rule__Equation__Group_1__0 )* ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3623:1: ( ( rule__Equation__Group_1__0 )* )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3623:1: ( ( rule__Equation__Group_1__0 )* )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3624:1: ( rule__Equation__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEquationAccess().getGroup_1()); 
            }
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3625:1: ( rule__Equation__Group_1__0 )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==38) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3625:2: rule__Equation__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__Equation__Group_1__0_in_rule__Equation__Group__1__Impl7332);
            	    rule__Equation__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop24;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEquationAccess().getGroup_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Equation__Group__1__Impl"


    // $ANTLR start "rule__Equation__Group__2"
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3635:1: rule__Equation__Group__2 : rule__Equation__Group__2__Impl rule__Equation__Group__3 ;
    public final void rule__Equation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3639:1: ( rule__Equation__Group__2__Impl rule__Equation__Group__3 )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3640:2: rule__Equation__Group__2__Impl rule__Equation__Group__3
            {
            pushFollow(FOLLOW_rule__Equation__Group__2__Impl_in_rule__Equation__Group__27363);
            rule__Equation__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Equation__Group__3_in_rule__Equation__Group__27366);
            rule__Equation__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Equation__Group__2"


    // $ANTLR start "rule__Equation__Group__2__Impl"
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3647:1: rule__Equation__Group__2__Impl : ( '=' ) ;
    public final void rule__Equation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3651:1: ( ( '=' ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3652:1: ( '=' )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3652:1: ( '=' )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3653:1: '='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEquationAccess().getEqualsSignKeyword_2()); 
            }
            match(input,18,FOLLOW_18_in_rule__Equation__Group__2__Impl7394); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEquationAccess().getEqualsSignKeyword_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Equation__Group__2__Impl"


    // $ANTLR start "rule__Equation__Group__3"
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3666:1: rule__Equation__Group__3 : rule__Equation__Group__3__Impl rule__Equation__Group__4 ;
    public final void rule__Equation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3670:1: ( rule__Equation__Group__3__Impl rule__Equation__Group__4 )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3671:2: rule__Equation__Group__3__Impl rule__Equation__Group__4
            {
            pushFollow(FOLLOW_rule__Equation__Group__3__Impl_in_rule__Equation__Group__37425);
            rule__Equation__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Equation__Group__4_in_rule__Equation__Group__37428);
            rule__Equation__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Equation__Group__3"


    // $ANTLR start "rule__Equation__Group__3__Impl"
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3678:1: rule__Equation__Group__3__Impl : ( ( rule__Equation__RhsAssignment_3 ) ) ;
    public final void rule__Equation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3682:1: ( ( ( rule__Equation__RhsAssignment_3 ) ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3683:1: ( ( rule__Equation__RhsAssignment_3 ) )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3683:1: ( ( rule__Equation__RhsAssignment_3 ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3684:1: ( rule__Equation__RhsAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEquationAccess().getRhsAssignment_3()); 
            }
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3685:1: ( rule__Equation__RhsAssignment_3 )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3685:2: rule__Equation__RhsAssignment_3
            {
            pushFollow(FOLLOW_rule__Equation__RhsAssignment_3_in_rule__Equation__Group__3__Impl7455);
            rule__Equation__RhsAssignment_3();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEquationAccess().getRhsAssignment_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Equation__Group__3__Impl"


    // $ANTLR start "rule__Equation__Group__4"
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3695:1: rule__Equation__Group__4 : rule__Equation__Group__4__Impl ;
    public final void rule__Equation__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3699:1: ( rule__Equation__Group__4__Impl )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3700:2: rule__Equation__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__Equation__Group__4__Impl_in_rule__Equation__Group__47485);
            rule__Equation__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Equation__Group__4"


    // $ANTLR start "rule__Equation__Group__4__Impl"
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3706:1: rule__Equation__Group__4__Impl : ( ';' ) ;
    public final void rule__Equation__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3710:1: ( ( ';' ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3711:1: ( ';' )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3711:1: ( ';' )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3712:1: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEquationAccess().getSemicolonKeyword_4()); 
            }
            match(input,28,FOLLOW_28_in_rule__Equation__Group__4__Impl7513); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEquationAccess().getSemicolonKeyword_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Equation__Group__4__Impl"


    // $ANTLR start "rule__Equation__Group_1__0"
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3735:1: rule__Equation__Group_1__0 : rule__Equation__Group_1__0__Impl rule__Equation__Group_1__1 ;
    public final void rule__Equation__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3739:1: ( rule__Equation__Group_1__0__Impl rule__Equation__Group_1__1 )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3740:2: rule__Equation__Group_1__0__Impl rule__Equation__Group_1__1
            {
            pushFollow(FOLLOW_rule__Equation__Group_1__0__Impl_in_rule__Equation__Group_1__07554);
            rule__Equation__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Equation__Group_1__1_in_rule__Equation__Group_1__07557);
            rule__Equation__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Equation__Group_1__0"


    // $ANTLR start "rule__Equation__Group_1__0__Impl"
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3747:1: rule__Equation__Group_1__0__Impl : ( ',' ) ;
    public final void rule__Equation__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3751:1: ( ( ',' ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3752:1: ( ',' )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3752:1: ( ',' )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3753:1: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEquationAccess().getCommaKeyword_1_0()); 
            }
            match(input,38,FOLLOW_38_in_rule__Equation__Group_1__0__Impl7585); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEquationAccess().getCommaKeyword_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Equation__Group_1__0__Impl"


    // $ANTLR start "rule__Equation__Group_1__1"
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3766:1: rule__Equation__Group_1__1 : rule__Equation__Group_1__1__Impl ;
    public final void rule__Equation__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3770:1: ( rule__Equation__Group_1__1__Impl )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3771:2: rule__Equation__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Equation__Group_1__1__Impl_in_rule__Equation__Group_1__17616);
            rule__Equation__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Equation__Group_1__1"


    // $ANTLR start "rule__Equation__Group_1__1__Impl"
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3777:1: rule__Equation__Group_1__1__Impl : ( ( rule__Equation__LhsAssignment_1_1 ) ) ;
    public final void rule__Equation__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3781:1: ( ( ( rule__Equation__LhsAssignment_1_1 ) ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3782:1: ( ( rule__Equation__LhsAssignment_1_1 ) )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3782:1: ( ( rule__Equation__LhsAssignment_1_1 ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3783:1: ( rule__Equation__LhsAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEquationAccess().getLhsAssignment_1_1()); 
            }
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3784:1: ( rule__Equation__LhsAssignment_1_1 )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3784:2: rule__Equation__LhsAssignment_1_1
            {
            pushFollow(FOLLOW_rule__Equation__LhsAssignment_1_1_in_rule__Equation__Group_1__1__Impl7643);
            rule__Equation__LhsAssignment_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEquationAccess().getLhsAssignment_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Equation__Group_1__1__Impl"


    // $ANTLR start "rule__Property__Group__0"
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3798:1: rule__Property__Group__0 : rule__Property__Group__0__Impl rule__Property__Group__1 ;
    public final void rule__Property__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3802:1: ( rule__Property__Group__0__Impl rule__Property__Group__1 )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3803:2: rule__Property__Group__0__Impl rule__Property__Group__1
            {
            pushFollow(FOLLOW_rule__Property__Group__0__Impl_in_rule__Property__Group__07677);
            rule__Property__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Property__Group__1_in_rule__Property__Group__07680);
            rule__Property__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Property__Group__0"


    // $ANTLR start "rule__Property__Group__0__Impl"
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3810:1: rule__Property__Group__0__Impl : ( '--%PROPERTY' ) ;
    public final void rule__Property__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3814:1: ( ( '--%PROPERTY' ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3815:1: ( '--%PROPERTY' )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3815:1: ( '--%PROPERTY' )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3816:1: '--%PROPERTY'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPropertyAccess().getPROPERTYKeyword_0()); 
            }
            match(input,49,FOLLOW_49_in_rule__Property__Group__0__Impl7708); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPropertyAccess().getPROPERTYKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Property__Group__0__Impl"


    // $ANTLR start "rule__Property__Group__1"
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3829:1: rule__Property__Group__1 : rule__Property__Group__1__Impl rule__Property__Group__2 ;
    public final void rule__Property__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3833:1: ( rule__Property__Group__1__Impl rule__Property__Group__2 )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3834:2: rule__Property__Group__1__Impl rule__Property__Group__2
            {
            pushFollow(FOLLOW_rule__Property__Group__1__Impl_in_rule__Property__Group__17739);
            rule__Property__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Property__Group__2_in_rule__Property__Group__17742);
            rule__Property__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Property__Group__1"


    // $ANTLR start "rule__Property__Group__1__Impl"
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3841:1: rule__Property__Group__1__Impl : ( ( rule__Property__RefAssignment_1 ) ) ;
    public final void rule__Property__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3845:1: ( ( ( rule__Property__RefAssignment_1 ) ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3846:1: ( ( rule__Property__RefAssignment_1 ) )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3846:1: ( ( rule__Property__RefAssignment_1 ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3847:1: ( rule__Property__RefAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPropertyAccess().getRefAssignment_1()); 
            }
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3848:1: ( rule__Property__RefAssignment_1 )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3848:2: rule__Property__RefAssignment_1
            {
            pushFollow(FOLLOW_rule__Property__RefAssignment_1_in_rule__Property__Group__1__Impl7769);
            rule__Property__RefAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPropertyAccess().getRefAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Property__Group__1__Impl"


    // $ANTLR start "rule__Property__Group__2"
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3858:1: rule__Property__Group__2 : rule__Property__Group__2__Impl ;
    public final void rule__Property__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3862:1: ( rule__Property__Group__2__Impl )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3863:2: rule__Property__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Property__Group__2__Impl_in_rule__Property__Group__27799);
            rule__Property__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Property__Group__2"


    // $ANTLR start "rule__Property__Group__2__Impl"
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3869:1: rule__Property__Group__2__Impl : ( ';' ) ;
    public final void rule__Property__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3873:1: ( ( ';' ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3874:1: ( ';' )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3874:1: ( ';' )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3875:1: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPropertyAccess().getSemicolonKeyword_2()); 
            }
            match(input,28,FOLLOW_28_in_rule__Property__Group__2__Impl7827); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPropertyAccess().getSemicolonKeyword_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Property__Group__2__Impl"


    // $ANTLR start "rule__Main__Group__0"
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3894:1: rule__Main__Group__0 : rule__Main__Group__0__Impl rule__Main__Group__1 ;
    public final void rule__Main__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3898:1: ( rule__Main__Group__0__Impl rule__Main__Group__1 )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3899:2: rule__Main__Group__0__Impl rule__Main__Group__1
            {
            pushFollow(FOLLOW_rule__Main__Group__0__Impl_in_rule__Main__Group__07864);
            rule__Main__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Main__Group__1_in_rule__Main__Group__07867);
            rule__Main__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Main__Group__0"


    // $ANTLR start "rule__Main__Group__0__Impl"
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3906:1: rule__Main__Group__0__Impl : ( '--%MAIN' ) ;
    public final void rule__Main__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3910:1: ( ( '--%MAIN' ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3911:1: ( '--%MAIN' )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3911:1: ( '--%MAIN' )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3912:1: '--%MAIN'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMainAccess().getMAINKeyword_0()); 
            }
            match(input,50,FOLLOW_50_in_rule__Main__Group__0__Impl7895); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMainAccess().getMAINKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Main__Group__0__Impl"


    // $ANTLR start "rule__Main__Group__1"
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3925:1: rule__Main__Group__1 : rule__Main__Group__1__Impl ;
    public final void rule__Main__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3929:1: ( rule__Main__Group__1__Impl )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3930:2: rule__Main__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Main__Group__1__Impl_in_rule__Main__Group__17926);
            rule__Main__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Main__Group__1"


    // $ANTLR start "rule__Main__Group__1__Impl"
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3936:1: rule__Main__Group__1__Impl : ( ( ';' )? ) ;
    public final void rule__Main__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3940:1: ( ( ( ';' )? ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3941:1: ( ( ';' )? )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3941:1: ( ( ';' )? )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3942:1: ( ';' )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMainAccess().getSemicolonKeyword_1()); 
            }
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3943:1: ( ';' )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==28) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3944:2: ';'
                    {
                    match(input,28,FOLLOW_28_in_rule__Main__Group__1__Impl7955); if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMainAccess().getSemicolonKeyword_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Main__Group__1__Impl"


    // $ANTLR start "rule__Assertion__Group__0"
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3959:1: rule__Assertion__Group__0 : rule__Assertion__Group__0__Impl rule__Assertion__Group__1 ;
    public final void rule__Assertion__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3963:1: ( rule__Assertion__Group__0__Impl rule__Assertion__Group__1 )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3964:2: rule__Assertion__Group__0__Impl rule__Assertion__Group__1
            {
            pushFollow(FOLLOW_rule__Assertion__Group__0__Impl_in_rule__Assertion__Group__07992);
            rule__Assertion__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Assertion__Group__1_in_rule__Assertion__Group__07995);
            rule__Assertion__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Assertion__Group__0"


    // $ANTLR start "rule__Assertion__Group__0__Impl"
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3971:1: rule__Assertion__Group__0__Impl : ( 'assert' ) ;
    public final void rule__Assertion__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3975:1: ( ( 'assert' ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3976:1: ( 'assert' )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3976:1: ( 'assert' )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3977:1: 'assert'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAssertionAccess().getAssertKeyword_0()); 
            }
            match(input,51,FOLLOW_51_in_rule__Assertion__Group__0__Impl8023); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAssertionAccess().getAssertKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Assertion__Group__0__Impl"


    // $ANTLR start "rule__Assertion__Group__1"
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3990:1: rule__Assertion__Group__1 : rule__Assertion__Group__1__Impl rule__Assertion__Group__2 ;
    public final void rule__Assertion__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3994:1: ( rule__Assertion__Group__1__Impl rule__Assertion__Group__2 )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3995:2: rule__Assertion__Group__1__Impl rule__Assertion__Group__2
            {
            pushFollow(FOLLOW_rule__Assertion__Group__1__Impl_in_rule__Assertion__Group__18054);
            rule__Assertion__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Assertion__Group__2_in_rule__Assertion__Group__18057);
            rule__Assertion__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Assertion__Group__1"


    // $ANTLR start "rule__Assertion__Group__1__Impl"
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4002:1: rule__Assertion__Group__1__Impl : ( ( rule__Assertion__ExprAssignment_1 ) ) ;
    public final void rule__Assertion__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4006:1: ( ( ( rule__Assertion__ExprAssignment_1 ) ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4007:1: ( ( rule__Assertion__ExprAssignment_1 ) )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4007:1: ( ( rule__Assertion__ExprAssignment_1 ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4008:1: ( rule__Assertion__ExprAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAssertionAccess().getExprAssignment_1()); 
            }
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4009:1: ( rule__Assertion__ExprAssignment_1 )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4009:2: rule__Assertion__ExprAssignment_1
            {
            pushFollow(FOLLOW_rule__Assertion__ExprAssignment_1_in_rule__Assertion__Group__1__Impl8084);
            rule__Assertion__ExprAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAssertionAccess().getExprAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Assertion__Group__1__Impl"


    // $ANTLR start "rule__Assertion__Group__2"
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4019:1: rule__Assertion__Group__2 : rule__Assertion__Group__2__Impl ;
    public final void rule__Assertion__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4023:1: ( rule__Assertion__Group__2__Impl )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4024:2: rule__Assertion__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Assertion__Group__2__Impl_in_rule__Assertion__Group__28114);
            rule__Assertion__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Assertion__Group__2"


    // $ANTLR start "rule__Assertion__Group__2__Impl"
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4030:1: rule__Assertion__Group__2__Impl : ( ';' ) ;
    public final void rule__Assertion__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4034:1: ( ( ';' ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4035:1: ( ';' )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4035:1: ( ';' )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4036:1: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAssertionAccess().getSemicolonKeyword_2()); 
            }
            match(input,28,FOLLOW_28_in_rule__Assertion__Group__2__Impl8142); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAssertionAccess().getSemicolonKeyword_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Assertion__Group__2__Impl"


    // $ANTLR start "rule__ArrowExpr__Group__0"
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4055:1: rule__ArrowExpr__Group__0 : rule__ArrowExpr__Group__0__Impl rule__ArrowExpr__Group__1 ;
    public final void rule__ArrowExpr__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4059:1: ( rule__ArrowExpr__Group__0__Impl rule__ArrowExpr__Group__1 )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4060:2: rule__ArrowExpr__Group__0__Impl rule__ArrowExpr__Group__1
            {
            pushFollow(FOLLOW_rule__ArrowExpr__Group__0__Impl_in_rule__ArrowExpr__Group__08179);
            rule__ArrowExpr__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ArrowExpr__Group__1_in_rule__ArrowExpr__Group__08182);
            rule__ArrowExpr__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArrowExpr__Group__0"


    // $ANTLR start "rule__ArrowExpr__Group__0__Impl"
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4067:1: rule__ArrowExpr__Group__0__Impl : ( ruleImpliesExpr ) ;
    public final void rule__ArrowExpr__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4071:1: ( ( ruleImpliesExpr ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4072:1: ( ruleImpliesExpr )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4072:1: ( ruleImpliesExpr )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4073:1: ruleImpliesExpr
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getArrowExprAccess().getImpliesExprParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_ruleImpliesExpr_in_rule__ArrowExpr__Group__0__Impl8209);
            ruleImpliesExpr();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getArrowExprAccess().getImpliesExprParserRuleCall_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArrowExpr__Group__0__Impl"


    // $ANTLR start "rule__ArrowExpr__Group__1"
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4084:1: rule__ArrowExpr__Group__1 : rule__ArrowExpr__Group__1__Impl ;
    public final void rule__ArrowExpr__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4088:1: ( rule__ArrowExpr__Group__1__Impl )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4089:2: rule__ArrowExpr__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__ArrowExpr__Group__1__Impl_in_rule__ArrowExpr__Group__18238);
            rule__ArrowExpr__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArrowExpr__Group__1"


    // $ANTLR start "rule__ArrowExpr__Group__1__Impl"
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4095:1: rule__ArrowExpr__Group__1__Impl : ( ( rule__ArrowExpr__Group_1__0 )? ) ;
    public final void rule__ArrowExpr__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4099:1: ( ( ( rule__ArrowExpr__Group_1__0 )? ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4100:1: ( ( rule__ArrowExpr__Group_1__0 )? )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4100:1: ( ( rule__ArrowExpr__Group_1__0 )? )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4101:1: ( rule__ArrowExpr__Group_1__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getArrowExprAccess().getGroup_1()); 
            }
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4102:1: ( rule__ArrowExpr__Group_1__0 )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==56) ) {
                int LA26_1 = input.LA(2);

                if ( (synpred44_InternalJKind()) ) {
                    alt26=1;
                }
            }
            switch (alt26) {
                case 1 :
                    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4102:2: rule__ArrowExpr__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__ArrowExpr__Group_1__0_in_rule__ArrowExpr__Group__1__Impl8265);
                    rule__ArrowExpr__Group_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getArrowExprAccess().getGroup_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArrowExpr__Group__1__Impl"


    // $ANTLR start "rule__ArrowExpr__Group_1__0"
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4116:1: rule__ArrowExpr__Group_1__0 : rule__ArrowExpr__Group_1__0__Impl ;
    public final void rule__ArrowExpr__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4120:1: ( rule__ArrowExpr__Group_1__0__Impl )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4121:2: rule__ArrowExpr__Group_1__0__Impl
            {
            pushFollow(FOLLOW_rule__ArrowExpr__Group_1__0__Impl_in_rule__ArrowExpr__Group_1__08300);
            rule__ArrowExpr__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArrowExpr__Group_1__0"


    // $ANTLR start "rule__ArrowExpr__Group_1__0__Impl"
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4127:1: rule__ArrowExpr__Group_1__0__Impl : ( ( rule__ArrowExpr__Group_1_0__0 ) ) ;
    public final void rule__ArrowExpr__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4131:1: ( ( ( rule__ArrowExpr__Group_1_0__0 ) ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4132:1: ( ( rule__ArrowExpr__Group_1_0__0 ) )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4132:1: ( ( rule__ArrowExpr__Group_1_0__0 ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4133:1: ( rule__ArrowExpr__Group_1_0__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getArrowExprAccess().getGroup_1_0()); 
            }
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4134:1: ( rule__ArrowExpr__Group_1_0__0 )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4134:2: rule__ArrowExpr__Group_1_0__0
            {
            pushFollow(FOLLOW_rule__ArrowExpr__Group_1_0__0_in_rule__ArrowExpr__Group_1__0__Impl8327);
            rule__ArrowExpr__Group_1_0__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getArrowExprAccess().getGroup_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArrowExpr__Group_1__0__Impl"


    // $ANTLR start "rule__ArrowExpr__Group_1_0__0"
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4146:1: rule__ArrowExpr__Group_1_0__0 : rule__ArrowExpr__Group_1_0__0__Impl rule__ArrowExpr__Group_1_0__1 ;
    public final void rule__ArrowExpr__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4150:1: ( rule__ArrowExpr__Group_1_0__0__Impl rule__ArrowExpr__Group_1_0__1 )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4151:2: rule__ArrowExpr__Group_1_0__0__Impl rule__ArrowExpr__Group_1_0__1
            {
            pushFollow(FOLLOW_rule__ArrowExpr__Group_1_0__0__Impl_in_rule__ArrowExpr__Group_1_0__08359);
            rule__ArrowExpr__Group_1_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ArrowExpr__Group_1_0__1_in_rule__ArrowExpr__Group_1_0__08362);
            rule__ArrowExpr__Group_1_0__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArrowExpr__Group_1_0__0"


    // $ANTLR start "rule__ArrowExpr__Group_1_0__0__Impl"
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4158:1: rule__ArrowExpr__Group_1_0__0__Impl : ( () ) ;
    public final void rule__ArrowExpr__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4162:1: ( ( () ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4163:1: ( () )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4163:1: ( () )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4164:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getArrowExprAccess().getBinaryExprLeftAction_1_0_0()); 
            }
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4165:1: ()
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4167:1: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getArrowExprAccess().getBinaryExprLeftAction_1_0_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArrowExpr__Group_1_0__0__Impl"


    // $ANTLR start "rule__ArrowExpr__Group_1_0__1"
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4177:1: rule__ArrowExpr__Group_1_0__1 : rule__ArrowExpr__Group_1_0__1__Impl rule__ArrowExpr__Group_1_0__2 ;
    public final void rule__ArrowExpr__Group_1_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4181:1: ( rule__ArrowExpr__Group_1_0__1__Impl rule__ArrowExpr__Group_1_0__2 )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4182:2: rule__ArrowExpr__Group_1_0__1__Impl rule__ArrowExpr__Group_1_0__2
            {
            pushFollow(FOLLOW_rule__ArrowExpr__Group_1_0__1__Impl_in_rule__ArrowExpr__Group_1_0__18420);
            rule__ArrowExpr__Group_1_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ArrowExpr__Group_1_0__2_in_rule__ArrowExpr__Group_1_0__18423);
            rule__ArrowExpr__Group_1_0__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArrowExpr__Group_1_0__1"


    // $ANTLR start "rule__ArrowExpr__Group_1_0__1__Impl"
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4189:1: rule__ArrowExpr__Group_1_0__1__Impl : ( ( rule__ArrowExpr__OpAssignment_1_0_1 ) ) ;
    public final void rule__ArrowExpr__Group_1_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4193:1: ( ( ( rule__ArrowExpr__OpAssignment_1_0_1 ) ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4194:1: ( ( rule__ArrowExpr__OpAssignment_1_0_1 ) )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4194:1: ( ( rule__ArrowExpr__OpAssignment_1_0_1 ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4195:1: ( rule__ArrowExpr__OpAssignment_1_0_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getArrowExprAccess().getOpAssignment_1_0_1()); 
            }
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4196:1: ( rule__ArrowExpr__OpAssignment_1_0_1 )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4196:2: rule__ArrowExpr__OpAssignment_1_0_1
            {
            pushFollow(FOLLOW_rule__ArrowExpr__OpAssignment_1_0_1_in_rule__ArrowExpr__Group_1_0__1__Impl8450);
            rule__ArrowExpr__OpAssignment_1_0_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getArrowExprAccess().getOpAssignment_1_0_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArrowExpr__Group_1_0__1__Impl"


    // $ANTLR start "rule__ArrowExpr__Group_1_0__2"
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4206:1: rule__ArrowExpr__Group_1_0__2 : rule__ArrowExpr__Group_1_0__2__Impl ;
    public final void rule__ArrowExpr__Group_1_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4210:1: ( rule__ArrowExpr__Group_1_0__2__Impl )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4211:2: rule__ArrowExpr__Group_1_0__2__Impl
            {
            pushFollow(FOLLOW_rule__ArrowExpr__Group_1_0__2__Impl_in_rule__ArrowExpr__Group_1_0__28480);
            rule__ArrowExpr__Group_1_0__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArrowExpr__Group_1_0__2"


    // $ANTLR start "rule__ArrowExpr__Group_1_0__2__Impl"
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4217:1: rule__ArrowExpr__Group_1_0__2__Impl : ( ( rule__ArrowExpr__RightAssignment_1_0_2 ) ) ;
    public final void rule__ArrowExpr__Group_1_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4221:1: ( ( ( rule__ArrowExpr__RightAssignment_1_0_2 ) ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4222:1: ( ( rule__ArrowExpr__RightAssignment_1_0_2 ) )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4222:1: ( ( rule__ArrowExpr__RightAssignment_1_0_2 ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4223:1: ( rule__ArrowExpr__RightAssignment_1_0_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getArrowExprAccess().getRightAssignment_1_0_2()); 
            }
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4224:1: ( rule__ArrowExpr__RightAssignment_1_0_2 )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4224:2: rule__ArrowExpr__RightAssignment_1_0_2
            {
            pushFollow(FOLLOW_rule__ArrowExpr__RightAssignment_1_0_2_in_rule__ArrowExpr__Group_1_0__2__Impl8507);
            rule__ArrowExpr__RightAssignment_1_0_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getArrowExprAccess().getRightAssignment_1_0_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArrowExpr__Group_1_0__2__Impl"


    // $ANTLR start "rule__ImpliesExpr__Group__0"
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4240:1: rule__ImpliesExpr__Group__0 : rule__ImpliesExpr__Group__0__Impl rule__ImpliesExpr__Group__1 ;
    public final void rule__ImpliesExpr__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4244:1: ( rule__ImpliesExpr__Group__0__Impl rule__ImpliesExpr__Group__1 )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4245:2: rule__ImpliesExpr__Group__0__Impl rule__ImpliesExpr__Group__1
            {
            pushFollow(FOLLOW_rule__ImpliesExpr__Group__0__Impl_in_rule__ImpliesExpr__Group__08543);
            rule__ImpliesExpr__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ImpliesExpr__Group__1_in_rule__ImpliesExpr__Group__08546);
            rule__ImpliesExpr__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ImpliesExpr__Group__0"


    // $ANTLR start "rule__ImpliesExpr__Group__0__Impl"
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4252:1: rule__ImpliesExpr__Group__0__Impl : ( ruleOrExpr ) ;
    public final void rule__ImpliesExpr__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4256:1: ( ( ruleOrExpr ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4257:1: ( ruleOrExpr )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4257:1: ( ruleOrExpr )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4258:1: ruleOrExpr
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getImpliesExprAccess().getOrExprParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_ruleOrExpr_in_rule__ImpliesExpr__Group__0__Impl8573);
            ruleOrExpr();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getImpliesExprAccess().getOrExprParserRuleCall_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ImpliesExpr__Group__0__Impl"


    // $ANTLR start "rule__ImpliesExpr__Group__1"
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4269:1: rule__ImpliesExpr__Group__1 : rule__ImpliesExpr__Group__1__Impl ;
    public final void rule__ImpliesExpr__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4273:1: ( rule__ImpliesExpr__Group__1__Impl )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4274:2: rule__ImpliesExpr__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__ImpliesExpr__Group__1__Impl_in_rule__ImpliesExpr__Group__18602);
            rule__ImpliesExpr__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ImpliesExpr__Group__1"


    // $ANTLR start "rule__ImpliesExpr__Group__1__Impl"
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4280:1: rule__ImpliesExpr__Group__1__Impl : ( ( rule__ImpliesExpr__Group_1__0 )? ) ;
    public final void rule__ImpliesExpr__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4284:1: ( ( ( rule__ImpliesExpr__Group_1__0 )? ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4285:1: ( ( rule__ImpliesExpr__Group_1__0 )? )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4285:1: ( ( rule__ImpliesExpr__Group_1__0 )? )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4286:1: ( rule__ImpliesExpr__Group_1__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getImpliesExprAccess().getGroup_1()); 
            }
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4287:1: ( rule__ImpliesExpr__Group_1__0 )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==57) ) {
                int LA27_1 = input.LA(2);

                if ( (synpred45_InternalJKind()) ) {
                    alt27=1;
                }
            }
            switch (alt27) {
                case 1 :
                    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4287:2: rule__ImpliesExpr__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__ImpliesExpr__Group_1__0_in_rule__ImpliesExpr__Group__1__Impl8629);
                    rule__ImpliesExpr__Group_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getImpliesExprAccess().getGroup_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ImpliesExpr__Group__1__Impl"


    // $ANTLR start "rule__ImpliesExpr__Group_1__0"
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4301:1: rule__ImpliesExpr__Group_1__0 : rule__ImpliesExpr__Group_1__0__Impl ;
    public final void rule__ImpliesExpr__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4305:1: ( rule__ImpliesExpr__Group_1__0__Impl )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4306:2: rule__ImpliesExpr__Group_1__0__Impl
            {
            pushFollow(FOLLOW_rule__ImpliesExpr__Group_1__0__Impl_in_rule__ImpliesExpr__Group_1__08664);
            rule__ImpliesExpr__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ImpliesExpr__Group_1__0"


    // $ANTLR start "rule__ImpliesExpr__Group_1__0__Impl"
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4312:1: rule__ImpliesExpr__Group_1__0__Impl : ( ( rule__ImpliesExpr__Group_1_0__0 ) ) ;
    public final void rule__ImpliesExpr__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4316:1: ( ( ( rule__ImpliesExpr__Group_1_0__0 ) ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4317:1: ( ( rule__ImpliesExpr__Group_1_0__0 ) )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4317:1: ( ( rule__ImpliesExpr__Group_1_0__0 ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4318:1: ( rule__ImpliesExpr__Group_1_0__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getImpliesExprAccess().getGroup_1_0()); 
            }
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4319:1: ( rule__ImpliesExpr__Group_1_0__0 )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4319:2: rule__ImpliesExpr__Group_1_0__0
            {
            pushFollow(FOLLOW_rule__ImpliesExpr__Group_1_0__0_in_rule__ImpliesExpr__Group_1__0__Impl8691);
            rule__ImpliesExpr__Group_1_0__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getImpliesExprAccess().getGroup_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ImpliesExpr__Group_1__0__Impl"


    // $ANTLR start "rule__ImpliesExpr__Group_1_0__0"
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4331:1: rule__ImpliesExpr__Group_1_0__0 : rule__ImpliesExpr__Group_1_0__0__Impl rule__ImpliesExpr__Group_1_0__1 ;
    public final void rule__ImpliesExpr__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4335:1: ( rule__ImpliesExpr__Group_1_0__0__Impl rule__ImpliesExpr__Group_1_0__1 )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4336:2: rule__ImpliesExpr__Group_1_0__0__Impl rule__ImpliesExpr__Group_1_0__1
            {
            pushFollow(FOLLOW_rule__ImpliesExpr__Group_1_0__0__Impl_in_rule__ImpliesExpr__Group_1_0__08723);
            rule__ImpliesExpr__Group_1_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ImpliesExpr__Group_1_0__1_in_rule__ImpliesExpr__Group_1_0__08726);
            rule__ImpliesExpr__Group_1_0__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ImpliesExpr__Group_1_0__0"


    // $ANTLR start "rule__ImpliesExpr__Group_1_0__0__Impl"
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4343:1: rule__ImpliesExpr__Group_1_0__0__Impl : ( () ) ;
    public final void rule__ImpliesExpr__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4347:1: ( ( () ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4348:1: ( () )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4348:1: ( () )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4349:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getImpliesExprAccess().getBinaryExprLeftAction_1_0_0()); 
            }
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4350:1: ()
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4352:1: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getImpliesExprAccess().getBinaryExprLeftAction_1_0_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ImpliesExpr__Group_1_0__0__Impl"


    // $ANTLR start "rule__ImpliesExpr__Group_1_0__1"
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4362:1: rule__ImpliesExpr__Group_1_0__1 : rule__ImpliesExpr__Group_1_0__1__Impl rule__ImpliesExpr__Group_1_0__2 ;
    public final void rule__ImpliesExpr__Group_1_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4366:1: ( rule__ImpliesExpr__Group_1_0__1__Impl rule__ImpliesExpr__Group_1_0__2 )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4367:2: rule__ImpliesExpr__Group_1_0__1__Impl rule__ImpliesExpr__Group_1_0__2
            {
            pushFollow(FOLLOW_rule__ImpliesExpr__Group_1_0__1__Impl_in_rule__ImpliesExpr__Group_1_0__18784);
            rule__ImpliesExpr__Group_1_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ImpliesExpr__Group_1_0__2_in_rule__ImpliesExpr__Group_1_0__18787);
            rule__ImpliesExpr__Group_1_0__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ImpliesExpr__Group_1_0__1"


    // $ANTLR start "rule__ImpliesExpr__Group_1_0__1__Impl"
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4374:1: rule__ImpliesExpr__Group_1_0__1__Impl : ( ( rule__ImpliesExpr__OpAssignment_1_0_1 ) ) ;
    public final void rule__ImpliesExpr__Group_1_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4378:1: ( ( ( rule__ImpliesExpr__OpAssignment_1_0_1 ) ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4379:1: ( ( rule__ImpliesExpr__OpAssignment_1_0_1 ) )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4379:1: ( ( rule__ImpliesExpr__OpAssignment_1_0_1 ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4380:1: ( rule__ImpliesExpr__OpAssignment_1_0_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getImpliesExprAccess().getOpAssignment_1_0_1()); 
            }
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4381:1: ( rule__ImpliesExpr__OpAssignment_1_0_1 )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4381:2: rule__ImpliesExpr__OpAssignment_1_0_1
            {
            pushFollow(FOLLOW_rule__ImpliesExpr__OpAssignment_1_0_1_in_rule__ImpliesExpr__Group_1_0__1__Impl8814);
            rule__ImpliesExpr__OpAssignment_1_0_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getImpliesExprAccess().getOpAssignment_1_0_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ImpliesExpr__Group_1_0__1__Impl"


    // $ANTLR start "rule__ImpliesExpr__Group_1_0__2"
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4391:1: rule__ImpliesExpr__Group_1_0__2 : rule__ImpliesExpr__Group_1_0__2__Impl ;
    public final void rule__ImpliesExpr__Group_1_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4395:1: ( rule__ImpliesExpr__Group_1_0__2__Impl )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4396:2: rule__ImpliesExpr__Group_1_0__2__Impl
            {
            pushFollow(FOLLOW_rule__ImpliesExpr__Group_1_0__2__Impl_in_rule__ImpliesExpr__Group_1_0__28844);
            rule__ImpliesExpr__Group_1_0__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ImpliesExpr__Group_1_0__2"


    // $ANTLR start "rule__ImpliesExpr__Group_1_0__2__Impl"
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4402:1: rule__ImpliesExpr__Group_1_0__2__Impl : ( ( rule__ImpliesExpr__RightAssignment_1_0_2 ) ) ;
    public final void rule__ImpliesExpr__Group_1_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4406:1: ( ( ( rule__ImpliesExpr__RightAssignment_1_0_2 ) ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4407:1: ( ( rule__ImpliesExpr__RightAssignment_1_0_2 ) )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4407:1: ( ( rule__ImpliesExpr__RightAssignment_1_0_2 ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4408:1: ( rule__ImpliesExpr__RightAssignment_1_0_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getImpliesExprAccess().getRightAssignment_1_0_2()); 
            }
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4409:1: ( rule__ImpliesExpr__RightAssignment_1_0_2 )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4409:2: rule__ImpliesExpr__RightAssignment_1_0_2
            {
            pushFollow(FOLLOW_rule__ImpliesExpr__RightAssignment_1_0_2_in_rule__ImpliesExpr__Group_1_0__2__Impl8871);
            rule__ImpliesExpr__RightAssignment_1_0_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getImpliesExprAccess().getRightAssignment_1_0_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ImpliesExpr__Group_1_0__2__Impl"


    // $ANTLR start "rule__OrExpr__Group__0"
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4425:1: rule__OrExpr__Group__0 : rule__OrExpr__Group__0__Impl rule__OrExpr__Group__1 ;
    public final void rule__OrExpr__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4429:1: ( rule__OrExpr__Group__0__Impl rule__OrExpr__Group__1 )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4430:2: rule__OrExpr__Group__0__Impl rule__OrExpr__Group__1
            {
            pushFollow(FOLLOW_rule__OrExpr__Group__0__Impl_in_rule__OrExpr__Group__08907);
            rule__OrExpr__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__OrExpr__Group__1_in_rule__OrExpr__Group__08910);
            rule__OrExpr__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrExpr__Group__0"


    // $ANTLR start "rule__OrExpr__Group__0__Impl"
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4437:1: rule__OrExpr__Group__0__Impl : ( ruleAndExpr ) ;
    public final void rule__OrExpr__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4441:1: ( ( ruleAndExpr ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4442:1: ( ruleAndExpr )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4442:1: ( ruleAndExpr )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4443:1: ruleAndExpr
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOrExprAccess().getAndExprParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_ruleAndExpr_in_rule__OrExpr__Group__0__Impl8937);
            ruleAndExpr();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getOrExprAccess().getAndExprParserRuleCall_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrExpr__Group__0__Impl"


    // $ANTLR start "rule__OrExpr__Group__1"
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4454:1: rule__OrExpr__Group__1 : rule__OrExpr__Group__1__Impl ;
    public final void rule__OrExpr__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4458:1: ( rule__OrExpr__Group__1__Impl )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4459:2: rule__OrExpr__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__OrExpr__Group__1__Impl_in_rule__OrExpr__Group__18966);
            rule__OrExpr__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrExpr__Group__1"


    // $ANTLR start "rule__OrExpr__Group__1__Impl"
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4465:1: rule__OrExpr__Group__1__Impl : ( ( rule__OrExpr__Group_1__0 )* ) ;
    public final void rule__OrExpr__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4469:1: ( ( ( rule__OrExpr__Group_1__0 )* ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4470:1: ( ( rule__OrExpr__Group_1__0 )* )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4470:1: ( ( rule__OrExpr__Group_1__0 )* )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4471:1: ( rule__OrExpr__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOrExprAccess().getGroup_1()); 
            }
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4472:1: ( rule__OrExpr__Group_1__0 )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==12) ) {
                    int LA28_2 = input.LA(2);

                    if ( (synpred46_InternalJKind()) ) {
                        alt28=1;
                    }


                }
                else if ( (LA28_0==13) ) {
                    int LA28_3 = input.LA(2);

                    if ( (synpred46_InternalJKind()) ) {
                        alt28=1;
                    }


                }


                switch (alt28) {
            	case 1 :
            	    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4472:2: rule__OrExpr__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__OrExpr__Group_1__0_in_rule__OrExpr__Group__1__Impl8993);
            	    rule__OrExpr__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop28;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getOrExprAccess().getGroup_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrExpr__Group__1__Impl"


    // $ANTLR start "rule__OrExpr__Group_1__0"
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4486:1: rule__OrExpr__Group_1__0 : rule__OrExpr__Group_1__0__Impl ;
    public final void rule__OrExpr__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4490:1: ( rule__OrExpr__Group_1__0__Impl )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4491:2: rule__OrExpr__Group_1__0__Impl
            {
            pushFollow(FOLLOW_rule__OrExpr__Group_1__0__Impl_in_rule__OrExpr__Group_1__09028);
            rule__OrExpr__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrExpr__Group_1__0"


    // $ANTLR start "rule__OrExpr__Group_1__0__Impl"
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4497:1: rule__OrExpr__Group_1__0__Impl : ( ( rule__OrExpr__Group_1_0__0 ) ) ;
    public final void rule__OrExpr__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4501:1: ( ( ( rule__OrExpr__Group_1_0__0 ) ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4502:1: ( ( rule__OrExpr__Group_1_0__0 ) )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4502:1: ( ( rule__OrExpr__Group_1_0__0 ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4503:1: ( rule__OrExpr__Group_1_0__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOrExprAccess().getGroup_1_0()); 
            }
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4504:1: ( rule__OrExpr__Group_1_0__0 )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4504:2: rule__OrExpr__Group_1_0__0
            {
            pushFollow(FOLLOW_rule__OrExpr__Group_1_0__0_in_rule__OrExpr__Group_1__0__Impl9055);
            rule__OrExpr__Group_1_0__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getOrExprAccess().getGroup_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrExpr__Group_1__0__Impl"


    // $ANTLR start "rule__OrExpr__Group_1_0__0"
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4516:1: rule__OrExpr__Group_1_0__0 : rule__OrExpr__Group_1_0__0__Impl rule__OrExpr__Group_1_0__1 ;
    public final void rule__OrExpr__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4520:1: ( rule__OrExpr__Group_1_0__0__Impl rule__OrExpr__Group_1_0__1 )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4521:2: rule__OrExpr__Group_1_0__0__Impl rule__OrExpr__Group_1_0__1
            {
            pushFollow(FOLLOW_rule__OrExpr__Group_1_0__0__Impl_in_rule__OrExpr__Group_1_0__09087);
            rule__OrExpr__Group_1_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__OrExpr__Group_1_0__1_in_rule__OrExpr__Group_1_0__09090);
            rule__OrExpr__Group_1_0__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrExpr__Group_1_0__0"


    // $ANTLR start "rule__OrExpr__Group_1_0__0__Impl"
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4528:1: rule__OrExpr__Group_1_0__0__Impl : ( () ) ;
    public final void rule__OrExpr__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4532:1: ( ( () ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4533:1: ( () )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4533:1: ( () )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4534:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOrExprAccess().getBinaryExprLeftAction_1_0_0()); 
            }
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4535:1: ()
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4537:1: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getOrExprAccess().getBinaryExprLeftAction_1_0_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrExpr__Group_1_0__0__Impl"


    // $ANTLR start "rule__OrExpr__Group_1_0__1"
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4547:1: rule__OrExpr__Group_1_0__1 : rule__OrExpr__Group_1_0__1__Impl rule__OrExpr__Group_1_0__2 ;
    public final void rule__OrExpr__Group_1_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4551:1: ( rule__OrExpr__Group_1_0__1__Impl rule__OrExpr__Group_1_0__2 )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4552:2: rule__OrExpr__Group_1_0__1__Impl rule__OrExpr__Group_1_0__2
            {
            pushFollow(FOLLOW_rule__OrExpr__Group_1_0__1__Impl_in_rule__OrExpr__Group_1_0__19148);
            rule__OrExpr__Group_1_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__OrExpr__Group_1_0__2_in_rule__OrExpr__Group_1_0__19151);
            rule__OrExpr__Group_1_0__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrExpr__Group_1_0__1"


    // $ANTLR start "rule__OrExpr__Group_1_0__1__Impl"
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4559:1: rule__OrExpr__Group_1_0__1__Impl : ( ( rule__OrExpr__OpAssignment_1_0_1 ) ) ;
    public final void rule__OrExpr__Group_1_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4563:1: ( ( ( rule__OrExpr__OpAssignment_1_0_1 ) ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4564:1: ( ( rule__OrExpr__OpAssignment_1_0_1 ) )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4564:1: ( ( rule__OrExpr__OpAssignment_1_0_1 ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4565:1: ( rule__OrExpr__OpAssignment_1_0_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOrExprAccess().getOpAssignment_1_0_1()); 
            }
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4566:1: ( rule__OrExpr__OpAssignment_1_0_1 )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4566:2: rule__OrExpr__OpAssignment_1_0_1
            {
            pushFollow(FOLLOW_rule__OrExpr__OpAssignment_1_0_1_in_rule__OrExpr__Group_1_0__1__Impl9178);
            rule__OrExpr__OpAssignment_1_0_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getOrExprAccess().getOpAssignment_1_0_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrExpr__Group_1_0__1__Impl"


    // $ANTLR start "rule__OrExpr__Group_1_0__2"
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4576:1: rule__OrExpr__Group_1_0__2 : rule__OrExpr__Group_1_0__2__Impl ;
    public final void rule__OrExpr__Group_1_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4580:1: ( rule__OrExpr__Group_1_0__2__Impl )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4581:2: rule__OrExpr__Group_1_0__2__Impl
            {
            pushFollow(FOLLOW_rule__OrExpr__Group_1_0__2__Impl_in_rule__OrExpr__Group_1_0__29208);
            rule__OrExpr__Group_1_0__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrExpr__Group_1_0__2"


    // $ANTLR start "rule__OrExpr__Group_1_0__2__Impl"
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4587:1: rule__OrExpr__Group_1_0__2__Impl : ( ( rule__OrExpr__RightAssignment_1_0_2 ) ) ;
    public final void rule__OrExpr__Group_1_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4591:1: ( ( ( rule__OrExpr__RightAssignment_1_0_2 ) ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4592:1: ( ( rule__OrExpr__RightAssignment_1_0_2 ) )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4592:1: ( ( rule__OrExpr__RightAssignment_1_0_2 ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4593:1: ( rule__OrExpr__RightAssignment_1_0_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOrExprAccess().getRightAssignment_1_0_2()); 
            }
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4594:1: ( rule__OrExpr__RightAssignment_1_0_2 )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4594:2: rule__OrExpr__RightAssignment_1_0_2
            {
            pushFollow(FOLLOW_rule__OrExpr__RightAssignment_1_0_2_in_rule__OrExpr__Group_1_0__2__Impl9235);
            rule__OrExpr__RightAssignment_1_0_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getOrExprAccess().getRightAssignment_1_0_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrExpr__Group_1_0__2__Impl"


    // $ANTLR start "rule__AndExpr__Group__0"
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4610:1: rule__AndExpr__Group__0 : rule__AndExpr__Group__0__Impl rule__AndExpr__Group__1 ;
    public final void rule__AndExpr__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4614:1: ( rule__AndExpr__Group__0__Impl rule__AndExpr__Group__1 )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4615:2: rule__AndExpr__Group__0__Impl rule__AndExpr__Group__1
            {
            pushFollow(FOLLOW_rule__AndExpr__Group__0__Impl_in_rule__AndExpr__Group__09271);
            rule__AndExpr__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__AndExpr__Group__1_in_rule__AndExpr__Group__09274);
            rule__AndExpr__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AndExpr__Group__0"


    // $ANTLR start "rule__AndExpr__Group__0__Impl"
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4622:1: rule__AndExpr__Group__0__Impl : ( ruleRelationalExpr ) ;
    public final void rule__AndExpr__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4626:1: ( ( ruleRelationalExpr ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4627:1: ( ruleRelationalExpr )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4627:1: ( ruleRelationalExpr )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4628:1: ruleRelationalExpr
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAndExprAccess().getRelationalExprParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_ruleRelationalExpr_in_rule__AndExpr__Group__0__Impl9301);
            ruleRelationalExpr();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAndExprAccess().getRelationalExprParserRuleCall_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AndExpr__Group__0__Impl"


    // $ANTLR start "rule__AndExpr__Group__1"
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4639:1: rule__AndExpr__Group__1 : rule__AndExpr__Group__1__Impl ;
    public final void rule__AndExpr__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4643:1: ( rule__AndExpr__Group__1__Impl )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4644:2: rule__AndExpr__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__AndExpr__Group__1__Impl_in_rule__AndExpr__Group__19330);
            rule__AndExpr__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AndExpr__Group__1"


    // $ANTLR start "rule__AndExpr__Group__1__Impl"
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4650:1: rule__AndExpr__Group__1__Impl : ( ( rule__AndExpr__Group_1__0 )* ) ;
    public final void rule__AndExpr__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4654:1: ( ( ( rule__AndExpr__Group_1__0 )* ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4655:1: ( ( rule__AndExpr__Group_1__0 )* )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4655:1: ( ( rule__AndExpr__Group_1__0 )* )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4656:1: ( rule__AndExpr__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAndExprAccess().getGroup_1()); 
            }
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4657:1: ( rule__AndExpr__Group_1__0 )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==58) ) {
                    int LA29_2 = input.LA(2);

                    if ( (synpred47_InternalJKind()) ) {
                        alt29=1;
                    }


                }


                switch (alt29) {
            	case 1 :
            	    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4657:2: rule__AndExpr__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__AndExpr__Group_1__0_in_rule__AndExpr__Group__1__Impl9357);
            	    rule__AndExpr__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop29;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAndExprAccess().getGroup_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AndExpr__Group__1__Impl"


    // $ANTLR start "rule__AndExpr__Group_1__0"
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4671:1: rule__AndExpr__Group_1__0 : rule__AndExpr__Group_1__0__Impl ;
    public final void rule__AndExpr__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4675:1: ( rule__AndExpr__Group_1__0__Impl )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4676:2: rule__AndExpr__Group_1__0__Impl
            {
            pushFollow(FOLLOW_rule__AndExpr__Group_1__0__Impl_in_rule__AndExpr__Group_1__09392);
            rule__AndExpr__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AndExpr__Group_1__0"


    // $ANTLR start "rule__AndExpr__Group_1__0__Impl"
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4682:1: rule__AndExpr__Group_1__0__Impl : ( ( rule__AndExpr__Group_1_0__0 ) ) ;
    public final void rule__AndExpr__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4686:1: ( ( ( rule__AndExpr__Group_1_0__0 ) ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4687:1: ( ( rule__AndExpr__Group_1_0__0 ) )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4687:1: ( ( rule__AndExpr__Group_1_0__0 ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4688:1: ( rule__AndExpr__Group_1_0__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAndExprAccess().getGroup_1_0()); 
            }
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4689:1: ( rule__AndExpr__Group_1_0__0 )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4689:2: rule__AndExpr__Group_1_0__0
            {
            pushFollow(FOLLOW_rule__AndExpr__Group_1_0__0_in_rule__AndExpr__Group_1__0__Impl9419);
            rule__AndExpr__Group_1_0__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAndExprAccess().getGroup_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AndExpr__Group_1__0__Impl"


    // $ANTLR start "rule__AndExpr__Group_1_0__0"
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4701:1: rule__AndExpr__Group_1_0__0 : rule__AndExpr__Group_1_0__0__Impl rule__AndExpr__Group_1_0__1 ;
    public final void rule__AndExpr__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4705:1: ( rule__AndExpr__Group_1_0__0__Impl rule__AndExpr__Group_1_0__1 )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4706:2: rule__AndExpr__Group_1_0__0__Impl rule__AndExpr__Group_1_0__1
            {
            pushFollow(FOLLOW_rule__AndExpr__Group_1_0__0__Impl_in_rule__AndExpr__Group_1_0__09451);
            rule__AndExpr__Group_1_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__AndExpr__Group_1_0__1_in_rule__AndExpr__Group_1_0__09454);
            rule__AndExpr__Group_1_0__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AndExpr__Group_1_0__0"


    // $ANTLR start "rule__AndExpr__Group_1_0__0__Impl"
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4713:1: rule__AndExpr__Group_1_0__0__Impl : ( () ) ;
    public final void rule__AndExpr__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4717:1: ( ( () ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4718:1: ( () )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4718:1: ( () )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4719:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAndExprAccess().getBinaryExprLeftAction_1_0_0()); 
            }
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4720:1: ()
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4722:1: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAndExprAccess().getBinaryExprLeftAction_1_0_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AndExpr__Group_1_0__0__Impl"


    // $ANTLR start "rule__AndExpr__Group_1_0__1"
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4732:1: rule__AndExpr__Group_1_0__1 : rule__AndExpr__Group_1_0__1__Impl rule__AndExpr__Group_1_0__2 ;
    public final void rule__AndExpr__Group_1_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4736:1: ( rule__AndExpr__Group_1_0__1__Impl rule__AndExpr__Group_1_0__2 )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4737:2: rule__AndExpr__Group_1_0__1__Impl rule__AndExpr__Group_1_0__2
            {
            pushFollow(FOLLOW_rule__AndExpr__Group_1_0__1__Impl_in_rule__AndExpr__Group_1_0__19512);
            rule__AndExpr__Group_1_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__AndExpr__Group_1_0__2_in_rule__AndExpr__Group_1_0__19515);
            rule__AndExpr__Group_1_0__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AndExpr__Group_1_0__1"


    // $ANTLR start "rule__AndExpr__Group_1_0__1__Impl"
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4744:1: rule__AndExpr__Group_1_0__1__Impl : ( ( rule__AndExpr__OpAssignment_1_0_1 ) ) ;
    public final void rule__AndExpr__Group_1_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4748:1: ( ( ( rule__AndExpr__OpAssignment_1_0_1 ) ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4749:1: ( ( rule__AndExpr__OpAssignment_1_0_1 ) )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4749:1: ( ( rule__AndExpr__OpAssignment_1_0_1 ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4750:1: ( rule__AndExpr__OpAssignment_1_0_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAndExprAccess().getOpAssignment_1_0_1()); 
            }
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4751:1: ( rule__AndExpr__OpAssignment_1_0_1 )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4751:2: rule__AndExpr__OpAssignment_1_0_1
            {
            pushFollow(FOLLOW_rule__AndExpr__OpAssignment_1_0_1_in_rule__AndExpr__Group_1_0__1__Impl9542);
            rule__AndExpr__OpAssignment_1_0_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAndExprAccess().getOpAssignment_1_0_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AndExpr__Group_1_0__1__Impl"


    // $ANTLR start "rule__AndExpr__Group_1_0__2"
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4761:1: rule__AndExpr__Group_1_0__2 : rule__AndExpr__Group_1_0__2__Impl ;
    public final void rule__AndExpr__Group_1_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4765:1: ( rule__AndExpr__Group_1_0__2__Impl )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4766:2: rule__AndExpr__Group_1_0__2__Impl
            {
            pushFollow(FOLLOW_rule__AndExpr__Group_1_0__2__Impl_in_rule__AndExpr__Group_1_0__29572);
            rule__AndExpr__Group_1_0__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AndExpr__Group_1_0__2"


    // $ANTLR start "rule__AndExpr__Group_1_0__2__Impl"
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4772:1: rule__AndExpr__Group_1_0__2__Impl : ( ( rule__AndExpr__RightAssignment_1_0_2 ) ) ;
    public final void rule__AndExpr__Group_1_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4776:1: ( ( ( rule__AndExpr__RightAssignment_1_0_2 ) ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4777:1: ( ( rule__AndExpr__RightAssignment_1_0_2 ) )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4777:1: ( ( rule__AndExpr__RightAssignment_1_0_2 ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4778:1: ( rule__AndExpr__RightAssignment_1_0_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAndExprAccess().getRightAssignment_1_0_2()); 
            }
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4779:1: ( rule__AndExpr__RightAssignment_1_0_2 )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4779:2: rule__AndExpr__RightAssignment_1_0_2
            {
            pushFollow(FOLLOW_rule__AndExpr__RightAssignment_1_0_2_in_rule__AndExpr__Group_1_0__2__Impl9599);
            rule__AndExpr__RightAssignment_1_0_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAndExprAccess().getRightAssignment_1_0_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AndExpr__Group_1_0__2__Impl"


    // $ANTLR start "rule__RelationalExpr__Group__0"
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4795:1: rule__RelationalExpr__Group__0 : rule__RelationalExpr__Group__0__Impl rule__RelationalExpr__Group__1 ;
    public final void rule__RelationalExpr__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4799:1: ( rule__RelationalExpr__Group__0__Impl rule__RelationalExpr__Group__1 )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4800:2: rule__RelationalExpr__Group__0__Impl rule__RelationalExpr__Group__1
            {
            pushFollow(FOLLOW_rule__RelationalExpr__Group__0__Impl_in_rule__RelationalExpr__Group__09635);
            rule__RelationalExpr__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__RelationalExpr__Group__1_in_rule__RelationalExpr__Group__09638);
            rule__RelationalExpr__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RelationalExpr__Group__0"


    // $ANTLR start "rule__RelationalExpr__Group__0__Impl"
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4807:1: rule__RelationalExpr__Group__0__Impl : ( rulePlusExpr ) ;
    public final void rule__RelationalExpr__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4811:1: ( ( rulePlusExpr ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4812:1: ( rulePlusExpr )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4812:1: ( rulePlusExpr )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4813:1: rulePlusExpr
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRelationalExprAccess().getPlusExprParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_rulePlusExpr_in_rule__RelationalExpr__Group__0__Impl9665);
            rulePlusExpr();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRelationalExprAccess().getPlusExprParserRuleCall_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RelationalExpr__Group__0__Impl"


    // $ANTLR start "rule__RelationalExpr__Group__1"
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4824:1: rule__RelationalExpr__Group__1 : rule__RelationalExpr__Group__1__Impl ;
    public final void rule__RelationalExpr__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4828:1: ( rule__RelationalExpr__Group__1__Impl )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4829:2: rule__RelationalExpr__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__RelationalExpr__Group__1__Impl_in_rule__RelationalExpr__Group__19694);
            rule__RelationalExpr__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RelationalExpr__Group__1"


    // $ANTLR start "rule__RelationalExpr__Group__1__Impl"
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4835:1: rule__RelationalExpr__Group__1__Impl : ( ( rule__RelationalExpr__Group_1__0 )? ) ;
    public final void rule__RelationalExpr__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4839:1: ( ( ( rule__RelationalExpr__Group_1__0 )? ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4840:1: ( ( rule__RelationalExpr__Group_1__0 )? )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4840:1: ( ( rule__RelationalExpr__Group_1__0 )? )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4841:1: ( rule__RelationalExpr__Group_1__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRelationalExprAccess().getGroup_1()); 
            }
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4842:1: ( rule__RelationalExpr__Group_1__0 )?
            int alt30=2;
            switch ( input.LA(1) ) {
                case 14:
                    {
                    int LA30_1 = input.LA(2);

                    if ( (synpred48_InternalJKind()) ) {
                        alt30=1;
                    }
                    }
                    break;
                case 15:
                    {
                    int LA30_2 = input.LA(2);

                    if ( (synpred48_InternalJKind()) ) {
                        alt30=1;
                    }
                    }
                    break;
                case 16:
                    {
                    int LA30_3 = input.LA(2);

                    if ( (synpred48_InternalJKind()) ) {
                        alt30=1;
                    }
                    }
                    break;
                case 17:
                    {
                    int LA30_4 = input.LA(2);

                    if ( (synpred48_InternalJKind()) ) {
                        alt30=1;
                    }
                    }
                    break;
                case 18:
                    {
                    int LA30_5 = input.LA(2);

                    if ( (synpred48_InternalJKind()) ) {
                        alt30=1;
                    }
                    }
                    break;
                case 19:
                    {
                    int LA30_6 = input.LA(2);

                    if ( (synpred48_InternalJKind()) ) {
                        alt30=1;
                    }
                    }
                    break;
            }

            switch (alt30) {
                case 1 :
                    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4842:2: rule__RelationalExpr__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__RelationalExpr__Group_1__0_in_rule__RelationalExpr__Group__1__Impl9721);
                    rule__RelationalExpr__Group_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRelationalExprAccess().getGroup_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RelationalExpr__Group__1__Impl"


    // $ANTLR start "rule__RelationalExpr__Group_1__0"
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4856:1: rule__RelationalExpr__Group_1__0 : rule__RelationalExpr__Group_1__0__Impl ;
    public final void rule__RelationalExpr__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4860:1: ( rule__RelationalExpr__Group_1__0__Impl )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4861:2: rule__RelationalExpr__Group_1__0__Impl
            {
            pushFollow(FOLLOW_rule__RelationalExpr__Group_1__0__Impl_in_rule__RelationalExpr__Group_1__09756);
            rule__RelationalExpr__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RelationalExpr__Group_1__0"


    // $ANTLR start "rule__RelationalExpr__Group_1__0__Impl"
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4867:1: rule__RelationalExpr__Group_1__0__Impl : ( ( rule__RelationalExpr__Group_1_0__0 ) ) ;
    public final void rule__RelationalExpr__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4871:1: ( ( ( rule__RelationalExpr__Group_1_0__0 ) ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4872:1: ( ( rule__RelationalExpr__Group_1_0__0 ) )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4872:1: ( ( rule__RelationalExpr__Group_1_0__0 ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4873:1: ( rule__RelationalExpr__Group_1_0__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRelationalExprAccess().getGroup_1_0()); 
            }
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4874:1: ( rule__RelationalExpr__Group_1_0__0 )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4874:2: rule__RelationalExpr__Group_1_0__0
            {
            pushFollow(FOLLOW_rule__RelationalExpr__Group_1_0__0_in_rule__RelationalExpr__Group_1__0__Impl9783);
            rule__RelationalExpr__Group_1_0__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRelationalExprAccess().getGroup_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RelationalExpr__Group_1__0__Impl"


    // $ANTLR start "rule__RelationalExpr__Group_1_0__0"
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4886:1: rule__RelationalExpr__Group_1_0__0 : rule__RelationalExpr__Group_1_0__0__Impl rule__RelationalExpr__Group_1_0__1 ;
    public final void rule__RelationalExpr__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4890:1: ( rule__RelationalExpr__Group_1_0__0__Impl rule__RelationalExpr__Group_1_0__1 )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4891:2: rule__RelationalExpr__Group_1_0__0__Impl rule__RelationalExpr__Group_1_0__1
            {
            pushFollow(FOLLOW_rule__RelationalExpr__Group_1_0__0__Impl_in_rule__RelationalExpr__Group_1_0__09815);
            rule__RelationalExpr__Group_1_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__RelationalExpr__Group_1_0__1_in_rule__RelationalExpr__Group_1_0__09818);
            rule__RelationalExpr__Group_1_0__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RelationalExpr__Group_1_0__0"


    // $ANTLR start "rule__RelationalExpr__Group_1_0__0__Impl"
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4898:1: rule__RelationalExpr__Group_1_0__0__Impl : ( () ) ;
    public final void rule__RelationalExpr__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4902:1: ( ( () ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4903:1: ( () )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4903:1: ( () )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4904:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRelationalExprAccess().getBinaryExprLeftAction_1_0_0()); 
            }
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4905:1: ()
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4907:1: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRelationalExprAccess().getBinaryExprLeftAction_1_0_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RelationalExpr__Group_1_0__0__Impl"


    // $ANTLR start "rule__RelationalExpr__Group_1_0__1"
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4917:1: rule__RelationalExpr__Group_1_0__1 : rule__RelationalExpr__Group_1_0__1__Impl rule__RelationalExpr__Group_1_0__2 ;
    public final void rule__RelationalExpr__Group_1_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4921:1: ( rule__RelationalExpr__Group_1_0__1__Impl rule__RelationalExpr__Group_1_0__2 )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4922:2: rule__RelationalExpr__Group_1_0__1__Impl rule__RelationalExpr__Group_1_0__2
            {
            pushFollow(FOLLOW_rule__RelationalExpr__Group_1_0__1__Impl_in_rule__RelationalExpr__Group_1_0__19876);
            rule__RelationalExpr__Group_1_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__RelationalExpr__Group_1_0__2_in_rule__RelationalExpr__Group_1_0__19879);
            rule__RelationalExpr__Group_1_0__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RelationalExpr__Group_1_0__1"


    // $ANTLR start "rule__RelationalExpr__Group_1_0__1__Impl"
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4929:1: rule__RelationalExpr__Group_1_0__1__Impl : ( ( rule__RelationalExpr__OpAssignment_1_0_1 ) ) ;
    public final void rule__RelationalExpr__Group_1_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4933:1: ( ( ( rule__RelationalExpr__OpAssignment_1_0_1 ) ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4934:1: ( ( rule__RelationalExpr__OpAssignment_1_0_1 ) )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4934:1: ( ( rule__RelationalExpr__OpAssignment_1_0_1 ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4935:1: ( rule__RelationalExpr__OpAssignment_1_0_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRelationalExprAccess().getOpAssignment_1_0_1()); 
            }
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4936:1: ( rule__RelationalExpr__OpAssignment_1_0_1 )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4936:2: rule__RelationalExpr__OpAssignment_1_0_1
            {
            pushFollow(FOLLOW_rule__RelationalExpr__OpAssignment_1_0_1_in_rule__RelationalExpr__Group_1_0__1__Impl9906);
            rule__RelationalExpr__OpAssignment_1_0_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRelationalExprAccess().getOpAssignment_1_0_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RelationalExpr__Group_1_0__1__Impl"


    // $ANTLR start "rule__RelationalExpr__Group_1_0__2"
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4946:1: rule__RelationalExpr__Group_1_0__2 : rule__RelationalExpr__Group_1_0__2__Impl ;
    public final void rule__RelationalExpr__Group_1_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4950:1: ( rule__RelationalExpr__Group_1_0__2__Impl )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4951:2: rule__RelationalExpr__Group_1_0__2__Impl
            {
            pushFollow(FOLLOW_rule__RelationalExpr__Group_1_0__2__Impl_in_rule__RelationalExpr__Group_1_0__29936);
            rule__RelationalExpr__Group_1_0__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RelationalExpr__Group_1_0__2"


    // $ANTLR start "rule__RelationalExpr__Group_1_0__2__Impl"
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4957:1: rule__RelationalExpr__Group_1_0__2__Impl : ( ( rule__RelationalExpr__RightAssignment_1_0_2 ) ) ;
    public final void rule__RelationalExpr__Group_1_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4961:1: ( ( ( rule__RelationalExpr__RightAssignment_1_0_2 ) ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4962:1: ( ( rule__RelationalExpr__RightAssignment_1_0_2 ) )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4962:1: ( ( rule__RelationalExpr__RightAssignment_1_0_2 ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4963:1: ( rule__RelationalExpr__RightAssignment_1_0_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRelationalExprAccess().getRightAssignment_1_0_2()); 
            }
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4964:1: ( rule__RelationalExpr__RightAssignment_1_0_2 )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4964:2: rule__RelationalExpr__RightAssignment_1_0_2
            {
            pushFollow(FOLLOW_rule__RelationalExpr__RightAssignment_1_0_2_in_rule__RelationalExpr__Group_1_0__2__Impl9963);
            rule__RelationalExpr__RightAssignment_1_0_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRelationalExprAccess().getRightAssignment_1_0_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RelationalExpr__Group_1_0__2__Impl"


    // $ANTLR start "rule__PlusExpr__Group__0"
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4980:1: rule__PlusExpr__Group__0 : rule__PlusExpr__Group__0__Impl rule__PlusExpr__Group__1 ;
    public final void rule__PlusExpr__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4984:1: ( rule__PlusExpr__Group__0__Impl rule__PlusExpr__Group__1 )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4985:2: rule__PlusExpr__Group__0__Impl rule__PlusExpr__Group__1
            {
            pushFollow(FOLLOW_rule__PlusExpr__Group__0__Impl_in_rule__PlusExpr__Group__09999);
            rule__PlusExpr__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__PlusExpr__Group__1_in_rule__PlusExpr__Group__010002);
            rule__PlusExpr__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PlusExpr__Group__0"


    // $ANTLR start "rule__PlusExpr__Group__0__Impl"
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4992:1: rule__PlusExpr__Group__0__Impl : ( ruleTimesExpr ) ;
    public final void rule__PlusExpr__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4996:1: ( ( ruleTimesExpr ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4997:1: ( ruleTimesExpr )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4997:1: ( ruleTimesExpr )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4998:1: ruleTimesExpr
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPlusExprAccess().getTimesExprParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_ruleTimesExpr_in_rule__PlusExpr__Group__0__Impl10029);
            ruleTimesExpr();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPlusExprAccess().getTimesExprParserRuleCall_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PlusExpr__Group__0__Impl"


    // $ANTLR start "rule__PlusExpr__Group__1"
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5009:1: rule__PlusExpr__Group__1 : rule__PlusExpr__Group__1__Impl ;
    public final void rule__PlusExpr__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5013:1: ( rule__PlusExpr__Group__1__Impl )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5014:2: rule__PlusExpr__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__PlusExpr__Group__1__Impl_in_rule__PlusExpr__Group__110058);
            rule__PlusExpr__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PlusExpr__Group__1"


    // $ANTLR start "rule__PlusExpr__Group__1__Impl"
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5020:1: rule__PlusExpr__Group__1__Impl : ( ( rule__PlusExpr__Group_1__0 )* ) ;
    public final void rule__PlusExpr__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5024:1: ( ( ( rule__PlusExpr__Group_1__0 )* ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5025:1: ( ( rule__PlusExpr__Group_1__0 )* )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5025:1: ( ( rule__PlusExpr__Group_1__0 )* )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5026:1: ( rule__PlusExpr__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPlusExprAccess().getGroup_1()); 
            }
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5027:1: ( rule__PlusExpr__Group_1__0 )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( (LA31_0==20) ) {
                    int LA31_2 = input.LA(2);

                    if ( (synpred49_InternalJKind()) ) {
                        alt31=1;
                    }


                }
                else if ( (LA31_0==21) ) {
                    int LA31_3 = input.LA(2);

                    if ( (synpred49_InternalJKind()) ) {
                        alt31=1;
                    }


                }


                switch (alt31) {
            	case 1 :
            	    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5027:2: rule__PlusExpr__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__PlusExpr__Group_1__0_in_rule__PlusExpr__Group__1__Impl10085);
            	    rule__PlusExpr__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop31;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPlusExprAccess().getGroup_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PlusExpr__Group__1__Impl"


    // $ANTLR start "rule__PlusExpr__Group_1__0"
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5041:1: rule__PlusExpr__Group_1__0 : rule__PlusExpr__Group_1__0__Impl ;
    public final void rule__PlusExpr__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5045:1: ( rule__PlusExpr__Group_1__0__Impl )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5046:2: rule__PlusExpr__Group_1__0__Impl
            {
            pushFollow(FOLLOW_rule__PlusExpr__Group_1__0__Impl_in_rule__PlusExpr__Group_1__010120);
            rule__PlusExpr__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PlusExpr__Group_1__0"


    // $ANTLR start "rule__PlusExpr__Group_1__0__Impl"
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5052:1: rule__PlusExpr__Group_1__0__Impl : ( ( rule__PlusExpr__Group_1_0__0 ) ) ;
    public final void rule__PlusExpr__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5056:1: ( ( ( rule__PlusExpr__Group_1_0__0 ) ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5057:1: ( ( rule__PlusExpr__Group_1_0__0 ) )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5057:1: ( ( rule__PlusExpr__Group_1_0__0 ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5058:1: ( rule__PlusExpr__Group_1_0__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPlusExprAccess().getGroup_1_0()); 
            }
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5059:1: ( rule__PlusExpr__Group_1_0__0 )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5059:2: rule__PlusExpr__Group_1_0__0
            {
            pushFollow(FOLLOW_rule__PlusExpr__Group_1_0__0_in_rule__PlusExpr__Group_1__0__Impl10147);
            rule__PlusExpr__Group_1_0__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPlusExprAccess().getGroup_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PlusExpr__Group_1__0__Impl"


    // $ANTLR start "rule__PlusExpr__Group_1_0__0"
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5071:1: rule__PlusExpr__Group_1_0__0 : rule__PlusExpr__Group_1_0__0__Impl rule__PlusExpr__Group_1_0__1 ;
    public final void rule__PlusExpr__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5075:1: ( rule__PlusExpr__Group_1_0__0__Impl rule__PlusExpr__Group_1_0__1 )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5076:2: rule__PlusExpr__Group_1_0__0__Impl rule__PlusExpr__Group_1_0__1
            {
            pushFollow(FOLLOW_rule__PlusExpr__Group_1_0__0__Impl_in_rule__PlusExpr__Group_1_0__010179);
            rule__PlusExpr__Group_1_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__PlusExpr__Group_1_0__1_in_rule__PlusExpr__Group_1_0__010182);
            rule__PlusExpr__Group_1_0__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PlusExpr__Group_1_0__0"


    // $ANTLR start "rule__PlusExpr__Group_1_0__0__Impl"
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5083:1: rule__PlusExpr__Group_1_0__0__Impl : ( () ) ;
    public final void rule__PlusExpr__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5087:1: ( ( () ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5088:1: ( () )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5088:1: ( () )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5089:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPlusExprAccess().getBinaryExprLeftAction_1_0_0()); 
            }
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5090:1: ()
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5092:1: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPlusExprAccess().getBinaryExprLeftAction_1_0_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PlusExpr__Group_1_0__0__Impl"


    // $ANTLR start "rule__PlusExpr__Group_1_0__1"
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5102:1: rule__PlusExpr__Group_1_0__1 : rule__PlusExpr__Group_1_0__1__Impl rule__PlusExpr__Group_1_0__2 ;
    public final void rule__PlusExpr__Group_1_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5106:1: ( rule__PlusExpr__Group_1_0__1__Impl rule__PlusExpr__Group_1_0__2 )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5107:2: rule__PlusExpr__Group_1_0__1__Impl rule__PlusExpr__Group_1_0__2
            {
            pushFollow(FOLLOW_rule__PlusExpr__Group_1_0__1__Impl_in_rule__PlusExpr__Group_1_0__110240);
            rule__PlusExpr__Group_1_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__PlusExpr__Group_1_0__2_in_rule__PlusExpr__Group_1_0__110243);
            rule__PlusExpr__Group_1_0__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PlusExpr__Group_1_0__1"


    // $ANTLR start "rule__PlusExpr__Group_1_0__1__Impl"
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5114:1: rule__PlusExpr__Group_1_0__1__Impl : ( ( rule__PlusExpr__OpAssignment_1_0_1 ) ) ;
    public final void rule__PlusExpr__Group_1_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5118:1: ( ( ( rule__PlusExpr__OpAssignment_1_0_1 ) ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5119:1: ( ( rule__PlusExpr__OpAssignment_1_0_1 ) )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5119:1: ( ( rule__PlusExpr__OpAssignment_1_0_1 ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5120:1: ( rule__PlusExpr__OpAssignment_1_0_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPlusExprAccess().getOpAssignment_1_0_1()); 
            }
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5121:1: ( rule__PlusExpr__OpAssignment_1_0_1 )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5121:2: rule__PlusExpr__OpAssignment_1_0_1
            {
            pushFollow(FOLLOW_rule__PlusExpr__OpAssignment_1_0_1_in_rule__PlusExpr__Group_1_0__1__Impl10270);
            rule__PlusExpr__OpAssignment_1_0_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPlusExprAccess().getOpAssignment_1_0_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PlusExpr__Group_1_0__1__Impl"


    // $ANTLR start "rule__PlusExpr__Group_1_0__2"
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5131:1: rule__PlusExpr__Group_1_0__2 : rule__PlusExpr__Group_1_0__2__Impl ;
    public final void rule__PlusExpr__Group_1_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5135:1: ( rule__PlusExpr__Group_1_0__2__Impl )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5136:2: rule__PlusExpr__Group_1_0__2__Impl
            {
            pushFollow(FOLLOW_rule__PlusExpr__Group_1_0__2__Impl_in_rule__PlusExpr__Group_1_0__210300);
            rule__PlusExpr__Group_1_0__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PlusExpr__Group_1_0__2"


    // $ANTLR start "rule__PlusExpr__Group_1_0__2__Impl"
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5142:1: rule__PlusExpr__Group_1_0__2__Impl : ( ( rule__PlusExpr__RightAssignment_1_0_2 ) ) ;
    public final void rule__PlusExpr__Group_1_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5146:1: ( ( ( rule__PlusExpr__RightAssignment_1_0_2 ) ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5147:1: ( ( rule__PlusExpr__RightAssignment_1_0_2 ) )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5147:1: ( ( rule__PlusExpr__RightAssignment_1_0_2 ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5148:1: ( rule__PlusExpr__RightAssignment_1_0_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPlusExprAccess().getRightAssignment_1_0_2()); 
            }
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5149:1: ( rule__PlusExpr__RightAssignment_1_0_2 )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5149:2: rule__PlusExpr__RightAssignment_1_0_2
            {
            pushFollow(FOLLOW_rule__PlusExpr__RightAssignment_1_0_2_in_rule__PlusExpr__Group_1_0__2__Impl10327);
            rule__PlusExpr__RightAssignment_1_0_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPlusExprAccess().getRightAssignment_1_0_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PlusExpr__Group_1_0__2__Impl"


    // $ANTLR start "rule__TimesExpr__Group__0"
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5165:1: rule__TimesExpr__Group__0 : rule__TimesExpr__Group__0__Impl rule__TimesExpr__Group__1 ;
    public final void rule__TimesExpr__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5169:1: ( rule__TimesExpr__Group__0__Impl rule__TimesExpr__Group__1 )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5170:2: rule__TimesExpr__Group__0__Impl rule__TimesExpr__Group__1
            {
            pushFollow(FOLLOW_rule__TimesExpr__Group__0__Impl_in_rule__TimesExpr__Group__010363);
            rule__TimesExpr__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__TimesExpr__Group__1_in_rule__TimesExpr__Group__010366);
            rule__TimesExpr__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TimesExpr__Group__0"


    // $ANTLR start "rule__TimesExpr__Group__0__Impl"
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5177:1: rule__TimesExpr__Group__0__Impl : ( rulePrefixExpr ) ;
    public final void rule__TimesExpr__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5181:1: ( ( rulePrefixExpr ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5182:1: ( rulePrefixExpr )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5182:1: ( rulePrefixExpr )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5183:1: rulePrefixExpr
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTimesExprAccess().getPrefixExprParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_rulePrefixExpr_in_rule__TimesExpr__Group__0__Impl10393);
            rulePrefixExpr();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTimesExprAccess().getPrefixExprParserRuleCall_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TimesExpr__Group__0__Impl"


    // $ANTLR start "rule__TimesExpr__Group__1"
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5194:1: rule__TimesExpr__Group__1 : rule__TimesExpr__Group__1__Impl ;
    public final void rule__TimesExpr__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5198:1: ( rule__TimesExpr__Group__1__Impl )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5199:2: rule__TimesExpr__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__TimesExpr__Group__1__Impl_in_rule__TimesExpr__Group__110422);
            rule__TimesExpr__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TimesExpr__Group__1"


    // $ANTLR start "rule__TimesExpr__Group__1__Impl"
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5205:1: rule__TimesExpr__Group__1__Impl : ( ( rule__TimesExpr__Group_1__0 )* ) ;
    public final void rule__TimesExpr__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5209:1: ( ( ( rule__TimesExpr__Group_1__0 )* ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5210:1: ( ( rule__TimesExpr__Group_1__0 )* )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5210:1: ( ( rule__TimesExpr__Group_1__0 )* )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5211:1: ( rule__TimesExpr__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTimesExprAccess().getGroup_1()); 
            }
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5212:1: ( rule__TimesExpr__Group_1__0 )*
            loop32:
            do {
                int alt32=2;
                switch ( input.LA(1) ) {
                case 22:
                    {
                    int LA32_2 = input.LA(2);

                    if ( (synpred50_InternalJKind()) ) {
                        alt32=1;
                    }


                    }
                    break;
                case 23:
                    {
                    int LA32_3 = input.LA(2);

                    if ( (synpred50_InternalJKind()) ) {
                        alt32=1;
                    }


                    }
                    break;
                case 24:
                    {
                    int LA32_4 = input.LA(2);

                    if ( (synpred50_InternalJKind()) ) {
                        alt32=1;
                    }


                    }
                    break;

                }

                switch (alt32) {
            	case 1 :
            	    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5212:2: rule__TimesExpr__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__TimesExpr__Group_1__0_in_rule__TimesExpr__Group__1__Impl10449);
            	    rule__TimesExpr__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop32;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTimesExprAccess().getGroup_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TimesExpr__Group__1__Impl"


    // $ANTLR start "rule__TimesExpr__Group_1__0"
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5226:1: rule__TimesExpr__Group_1__0 : rule__TimesExpr__Group_1__0__Impl ;
    public final void rule__TimesExpr__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5230:1: ( rule__TimesExpr__Group_1__0__Impl )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5231:2: rule__TimesExpr__Group_1__0__Impl
            {
            pushFollow(FOLLOW_rule__TimesExpr__Group_1__0__Impl_in_rule__TimesExpr__Group_1__010484);
            rule__TimesExpr__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TimesExpr__Group_1__0"


    // $ANTLR start "rule__TimesExpr__Group_1__0__Impl"
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5237:1: rule__TimesExpr__Group_1__0__Impl : ( ( rule__TimesExpr__Group_1_0__0 ) ) ;
    public final void rule__TimesExpr__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5241:1: ( ( ( rule__TimesExpr__Group_1_0__0 ) ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5242:1: ( ( rule__TimesExpr__Group_1_0__0 ) )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5242:1: ( ( rule__TimesExpr__Group_1_0__0 ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5243:1: ( rule__TimesExpr__Group_1_0__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTimesExprAccess().getGroup_1_0()); 
            }
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5244:1: ( rule__TimesExpr__Group_1_0__0 )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5244:2: rule__TimesExpr__Group_1_0__0
            {
            pushFollow(FOLLOW_rule__TimesExpr__Group_1_0__0_in_rule__TimesExpr__Group_1__0__Impl10511);
            rule__TimesExpr__Group_1_0__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTimesExprAccess().getGroup_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TimesExpr__Group_1__0__Impl"


    // $ANTLR start "rule__TimesExpr__Group_1_0__0"
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5256:1: rule__TimesExpr__Group_1_0__0 : rule__TimesExpr__Group_1_0__0__Impl rule__TimesExpr__Group_1_0__1 ;
    public final void rule__TimesExpr__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5260:1: ( rule__TimesExpr__Group_1_0__0__Impl rule__TimesExpr__Group_1_0__1 )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5261:2: rule__TimesExpr__Group_1_0__0__Impl rule__TimesExpr__Group_1_0__1
            {
            pushFollow(FOLLOW_rule__TimesExpr__Group_1_0__0__Impl_in_rule__TimesExpr__Group_1_0__010543);
            rule__TimesExpr__Group_1_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__TimesExpr__Group_1_0__1_in_rule__TimesExpr__Group_1_0__010546);
            rule__TimesExpr__Group_1_0__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TimesExpr__Group_1_0__0"


    // $ANTLR start "rule__TimesExpr__Group_1_0__0__Impl"
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5268:1: rule__TimesExpr__Group_1_0__0__Impl : ( () ) ;
    public final void rule__TimesExpr__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5272:1: ( ( () ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5273:1: ( () )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5273:1: ( () )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5274:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTimesExprAccess().getBinaryExprLeftAction_1_0_0()); 
            }
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5275:1: ()
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5277:1: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTimesExprAccess().getBinaryExprLeftAction_1_0_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TimesExpr__Group_1_0__0__Impl"


    // $ANTLR start "rule__TimesExpr__Group_1_0__1"
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5287:1: rule__TimesExpr__Group_1_0__1 : rule__TimesExpr__Group_1_0__1__Impl rule__TimesExpr__Group_1_0__2 ;
    public final void rule__TimesExpr__Group_1_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5291:1: ( rule__TimesExpr__Group_1_0__1__Impl rule__TimesExpr__Group_1_0__2 )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5292:2: rule__TimesExpr__Group_1_0__1__Impl rule__TimesExpr__Group_1_0__2
            {
            pushFollow(FOLLOW_rule__TimesExpr__Group_1_0__1__Impl_in_rule__TimesExpr__Group_1_0__110604);
            rule__TimesExpr__Group_1_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__TimesExpr__Group_1_0__2_in_rule__TimesExpr__Group_1_0__110607);
            rule__TimesExpr__Group_1_0__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TimesExpr__Group_1_0__1"


    // $ANTLR start "rule__TimesExpr__Group_1_0__1__Impl"
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5299:1: rule__TimesExpr__Group_1_0__1__Impl : ( ( rule__TimesExpr__OpAssignment_1_0_1 ) ) ;
    public final void rule__TimesExpr__Group_1_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5303:1: ( ( ( rule__TimesExpr__OpAssignment_1_0_1 ) ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5304:1: ( ( rule__TimesExpr__OpAssignment_1_0_1 ) )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5304:1: ( ( rule__TimesExpr__OpAssignment_1_0_1 ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5305:1: ( rule__TimesExpr__OpAssignment_1_0_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTimesExprAccess().getOpAssignment_1_0_1()); 
            }
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5306:1: ( rule__TimesExpr__OpAssignment_1_0_1 )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5306:2: rule__TimesExpr__OpAssignment_1_0_1
            {
            pushFollow(FOLLOW_rule__TimesExpr__OpAssignment_1_0_1_in_rule__TimesExpr__Group_1_0__1__Impl10634);
            rule__TimesExpr__OpAssignment_1_0_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTimesExprAccess().getOpAssignment_1_0_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TimesExpr__Group_1_0__1__Impl"


    // $ANTLR start "rule__TimesExpr__Group_1_0__2"
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5316:1: rule__TimesExpr__Group_1_0__2 : rule__TimesExpr__Group_1_0__2__Impl ;
    public final void rule__TimesExpr__Group_1_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5320:1: ( rule__TimesExpr__Group_1_0__2__Impl )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5321:2: rule__TimesExpr__Group_1_0__2__Impl
            {
            pushFollow(FOLLOW_rule__TimesExpr__Group_1_0__2__Impl_in_rule__TimesExpr__Group_1_0__210664);
            rule__TimesExpr__Group_1_0__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TimesExpr__Group_1_0__2"


    // $ANTLR start "rule__TimesExpr__Group_1_0__2__Impl"
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5327:1: rule__TimesExpr__Group_1_0__2__Impl : ( ( rule__TimesExpr__RightAssignment_1_0_2 ) ) ;
    public final void rule__TimesExpr__Group_1_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5331:1: ( ( ( rule__TimesExpr__RightAssignment_1_0_2 ) ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5332:1: ( ( rule__TimesExpr__RightAssignment_1_0_2 ) )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5332:1: ( ( rule__TimesExpr__RightAssignment_1_0_2 ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5333:1: ( rule__TimesExpr__RightAssignment_1_0_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTimesExprAccess().getRightAssignment_1_0_2()); 
            }
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5334:1: ( rule__TimesExpr__RightAssignment_1_0_2 )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5334:2: rule__TimesExpr__RightAssignment_1_0_2
            {
            pushFollow(FOLLOW_rule__TimesExpr__RightAssignment_1_0_2_in_rule__TimesExpr__Group_1_0__2__Impl10691);
            rule__TimesExpr__RightAssignment_1_0_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTimesExprAccess().getRightAssignment_1_0_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TimesExpr__Group_1_0__2__Impl"


    // $ANTLR start "rule__PrefixExpr__Group_0__0"
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5350:1: rule__PrefixExpr__Group_0__0 : rule__PrefixExpr__Group_0__0__Impl rule__PrefixExpr__Group_0__1 ;
    public final void rule__PrefixExpr__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5354:1: ( rule__PrefixExpr__Group_0__0__Impl rule__PrefixExpr__Group_0__1 )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5355:2: rule__PrefixExpr__Group_0__0__Impl rule__PrefixExpr__Group_0__1
            {
            pushFollow(FOLLOW_rule__PrefixExpr__Group_0__0__Impl_in_rule__PrefixExpr__Group_0__010727);
            rule__PrefixExpr__Group_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__PrefixExpr__Group_0__1_in_rule__PrefixExpr__Group_0__010730);
            rule__PrefixExpr__Group_0__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrefixExpr__Group_0__0"


    // $ANTLR start "rule__PrefixExpr__Group_0__0__Impl"
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5362:1: rule__PrefixExpr__Group_0__0__Impl : ( () ) ;
    public final void rule__PrefixExpr__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5366:1: ( ( () ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5367:1: ( () )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5367:1: ( () )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5368:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPrefixExprAccess().getUnaryExprAction_0_0()); 
            }
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5369:1: ()
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5371:1: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPrefixExprAccess().getUnaryExprAction_0_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrefixExpr__Group_0__0__Impl"


    // $ANTLR start "rule__PrefixExpr__Group_0__1"
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5381:1: rule__PrefixExpr__Group_0__1 : rule__PrefixExpr__Group_0__1__Impl rule__PrefixExpr__Group_0__2 ;
    public final void rule__PrefixExpr__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5385:1: ( rule__PrefixExpr__Group_0__1__Impl rule__PrefixExpr__Group_0__2 )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5386:2: rule__PrefixExpr__Group_0__1__Impl rule__PrefixExpr__Group_0__2
            {
            pushFollow(FOLLOW_rule__PrefixExpr__Group_0__1__Impl_in_rule__PrefixExpr__Group_0__110788);
            rule__PrefixExpr__Group_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__PrefixExpr__Group_0__2_in_rule__PrefixExpr__Group_0__110791);
            rule__PrefixExpr__Group_0__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrefixExpr__Group_0__1"


    // $ANTLR start "rule__PrefixExpr__Group_0__1__Impl"
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5393:1: rule__PrefixExpr__Group_0__1__Impl : ( ( rule__PrefixExpr__OpAssignment_0_1 ) ) ;
    public final void rule__PrefixExpr__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5397:1: ( ( ( rule__PrefixExpr__OpAssignment_0_1 ) ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5398:1: ( ( rule__PrefixExpr__OpAssignment_0_1 ) )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5398:1: ( ( rule__PrefixExpr__OpAssignment_0_1 ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5399:1: ( rule__PrefixExpr__OpAssignment_0_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPrefixExprAccess().getOpAssignment_0_1()); 
            }
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5400:1: ( rule__PrefixExpr__OpAssignment_0_1 )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5400:2: rule__PrefixExpr__OpAssignment_0_1
            {
            pushFollow(FOLLOW_rule__PrefixExpr__OpAssignment_0_1_in_rule__PrefixExpr__Group_0__1__Impl10818);
            rule__PrefixExpr__OpAssignment_0_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPrefixExprAccess().getOpAssignment_0_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrefixExpr__Group_0__1__Impl"


    // $ANTLR start "rule__PrefixExpr__Group_0__2"
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5410:1: rule__PrefixExpr__Group_0__2 : rule__PrefixExpr__Group_0__2__Impl ;
    public final void rule__PrefixExpr__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5414:1: ( rule__PrefixExpr__Group_0__2__Impl )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5415:2: rule__PrefixExpr__Group_0__2__Impl
            {
            pushFollow(FOLLOW_rule__PrefixExpr__Group_0__2__Impl_in_rule__PrefixExpr__Group_0__210848);
            rule__PrefixExpr__Group_0__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrefixExpr__Group_0__2"


    // $ANTLR start "rule__PrefixExpr__Group_0__2__Impl"
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5421:1: rule__PrefixExpr__Group_0__2__Impl : ( ( rule__PrefixExpr__ExprAssignment_0_2 ) ) ;
    public final void rule__PrefixExpr__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5425:1: ( ( ( rule__PrefixExpr__ExprAssignment_0_2 ) ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5426:1: ( ( rule__PrefixExpr__ExprAssignment_0_2 ) )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5426:1: ( ( rule__PrefixExpr__ExprAssignment_0_2 ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5427:1: ( rule__PrefixExpr__ExprAssignment_0_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPrefixExprAccess().getExprAssignment_0_2()); 
            }
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5428:1: ( rule__PrefixExpr__ExprAssignment_0_2 )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5428:2: rule__PrefixExpr__ExprAssignment_0_2
            {
            pushFollow(FOLLOW_rule__PrefixExpr__ExprAssignment_0_2_in_rule__PrefixExpr__Group_0__2__Impl10875);
            rule__PrefixExpr__ExprAssignment_0_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPrefixExprAccess().getExprAssignment_0_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrefixExpr__Group_0__2__Impl"


    // $ANTLR start "rule__AtomicExpr__Group_0__0"
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5444:1: rule__AtomicExpr__Group_0__0 : rule__AtomicExpr__Group_0__0__Impl rule__AtomicExpr__Group_0__1 ;
    public final void rule__AtomicExpr__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5448:1: ( rule__AtomicExpr__Group_0__0__Impl rule__AtomicExpr__Group_0__1 )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5449:2: rule__AtomicExpr__Group_0__0__Impl rule__AtomicExpr__Group_0__1
            {
            pushFollow(FOLLOW_rule__AtomicExpr__Group_0__0__Impl_in_rule__AtomicExpr__Group_0__010911);
            rule__AtomicExpr__Group_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__AtomicExpr__Group_0__1_in_rule__AtomicExpr__Group_0__010914);
            rule__AtomicExpr__Group_0__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AtomicExpr__Group_0__0"


    // $ANTLR start "rule__AtomicExpr__Group_0__0__Impl"
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5456:1: rule__AtomicExpr__Group_0__0__Impl : ( () ) ;
    public final void rule__AtomicExpr__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5460:1: ( ( () ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5461:1: ( () )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5461:1: ( () )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5462:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAtomicExprAccess().getIdExprAction_0_0()); 
            }
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5463:1: ()
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5465:1: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAtomicExprAccess().getIdExprAction_0_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AtomicExpr__Group_0__0__Impl"


    // $ANTLR start "rule__AtomicExpr__Group_0__1"
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5475:1: rule__AtomicExpr__Group_0__1 : rule__AtomicExpr__Group_0__1__Impl ;
    public final void rule__AtomicExpr__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5479:1: ( rule__AtomicExpr__Group_0__1__Impl )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5480:2: rule__AtomicExpr__Group_0__1__Impl
            {
            pushFollow(FOLLOW_rule__AtomicExpr__Group_0__1__Impl_in_rule__AtomicExpr__Group_0__110972);
            rule__AtomicExpr__Group_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AtomicExpr__Group_0__1"


    // $ANTLR start "rule__AtomicExpr__Group_0__1__Impl"
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5486:1: rule__AtomicExpr__Group_0__1__Impl : ( ( rule__AtomicExpr__IdAssignment_0_1 ) ) ;
    public final void rule__AtomicExpr__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5490:1: ( ( ( rule__AtomicExpr__IdAssignment_0_1 ) ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5491:1: ( ( rule__AtomicExpr__IdAssignment_0_1 ) )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5491:1: ( ( rule__AtomicExpr__IdAssignment_0_1 ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5492:1: ( rule__AtomicExpr__IdAssignment_0_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAtomicExprAccess().getIdAssignment_0_1()); 
            }
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5493:1: ( rule__AtomicExpr__IdAssignment_0_1 )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5493:2: rule__AtomicExpr__IdAssignment_0_1
            {
            pushFollow(FOLLOW_rule__AtomicExpr__IdAssignment_0_1_in_rule__AtomicExpr__Group_0__1__Impl10999);
            rule__AtomicExpr__IdAssignment_0_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAtomicExprAccess().getIdAssignment_0_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AtomicExpr__Group_0__1__Impl"


    // $ANTLR start "rule__AtomicExpr__Group_1__0"
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5507:1: rule__AtomicExpr__Group_1__0 : rule__AtomicExpr__Group_1__0__Impl rule__AtomicExpr__Group_1__1 ;
    public final void rule__AtomicExpr__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5511:1: ( rule__AtomicExpr__Group_1__0__Impl rule__AtomicExpr__Group_1__1 )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5512:2: rule__AtomicExpr__Group_1__0__Impl rule__AtomicExpr__Group_1__1
            {
            pushFollow(FOLLOW_rule__AtomicExpr__Group_1__0__Impl_in_rule__AtomicExpr__Group_1__011033);
            rule__AtomicExpr__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__AtomicExpr__Group_1__1_in_rule__AtomicExpr__Group_1__011036);
            rule__AtomicExpr__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AtomicExpr__Group_1__0"


    // $ANTLR start "rule__AtomicExpr__Group_1__0__Impl"
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5519:1: rule__AtomicExpr__Group_1__0__Impl : ( () ) ;
    public final void rule__AtomicExpr__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5523:1: ( ( () ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5524:1: ( () )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5524:1: ( () )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5525:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAtomicExprAccess().getIntExprAction_1_0()); 
            }
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5526:1: ()
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5528:1: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAtomicExprAccess().getIntExprAction_1_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AtomicExpr__Group_1__0__Impl"


    // $ANTLR start "rule__AtomicExpr__Group_1__1"
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5538:1: rule__AtomicExpr__Group_1__1 : rule__AtomicExpr__Group_1__1__Impl ;
    public final void rule__AtomicExpr__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5542:1: ( rule__AtomicExpr__Group_1__1__Impl )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5543:2: rule__AtomicExpr__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__AtomicExpr__Group_1__1__Impl_in_rule__AtomicExpr__Group_1__111094);
            rule__AtomicExpr__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AtomicExpr__Group_1__1"


    // $ANTLR start "rule__AtomicExpr__Group_1__1__Impl"
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5549:1: rule__AtomicExpr__Group_1__1__Impl : ( ( rule__AtomicExpr__ValAssignment_1_1 ) ) ;
    public final void rule__AtomicExpr__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5553:1: ( ( ( rule__AtomicExpr__ValAssignment_1_1 ) ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5554:1: ( ( rule__AtomicExpr__ValAssignment_1_1 ) )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5554:1: ( ( rule__AtomicExpr__ValAssignment_1_1 ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5555:1: ( rule__AtomicExpr__ValAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAtomicExprAccess().getValAssignment_1_1()); 
            }
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5556:1: ( rule__AtomicExpr__ValAssignment_1_1 )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5556:2: rule__AtomicExpr__ValAssignment_1_1
            {
            pushFollow(FOLLOW_rule__AtomicExpr__ValAssignment_1_1_in_rule__AtomicExpr__Group_1__1__Impl11121);
            rule__AtomicExpr__ValAssignment_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAtomicExprAccess().getValAssignment_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AtomicExpr__Group_1__1__Impl"


    // $ANTLR start "rule__AtomicExpr__Group_2__0"
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5570:1: rule__AtomicExpr__Group_2__0 : rule__AtomicExpr__Group_2__0__Impl rule__AtomicExpr__Group_2__1 ;
    public final void rule__AtomicExpr__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5574:1: ( rule__AtomicExpr__Group_2__0__Impl rule__AtomicExpr__Group_2__1 )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5575:2: rule__AtomicExpr__Group_2__0__Impl rule__AtomicExpr__Group_2__1
            {
            pushFollow(FOLLOW_rule__AtomicExpr__Group_2__0__Impl_in_rule__AtomicExpr__Group_2__011155);
            rule__AtomicExpr__Group_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__AtomicExpr__Group_2__1_in_rule__AtomicExpr__Group_2__011158);
            rule__AtomicExpr__Group_2__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AtomicExpr__Group_2__0"


    // $ANTLR start "rule__AtomicExpr__Group_2__0__Impl"
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5582:1: rule__AtomicExpr__Group_2__0__Impl : ( () ) ;
    public final void rule__AtomicExpr__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5586:1: ( ( () ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5587:1: ( () )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5587:1: ( () )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5588:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAtomicExprAccess().getRealExprAction_2_0()); 
            }
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5589:1: ()
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5591:1: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAtomicExprAccess().getRealExprAction_2_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AtomicExpr__Group_2__0__Impl"


    // $ANTLR start "rule__AtomicExpr__Group_2__1"
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5601:1: rule__AtomicExpr__Group_2__1 : rule__AtomicExpr__Group_2__1__Impl ;
    public final void rule__AtomicExpr__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5605:1: ( rule__AtomicExpr__Group_2__1__Impl )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5606:2: rule__AtomicExpr__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__AtomicExpr__Group_2__1__Impl_in_rule__AtomicExpr__Group_2__111216);
            rule__AtomicExpr__Group_2__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AtomicExpr__Group_2__1"


    // $ANTLR start "rule__AtomicExpr__Group_2__1__Impl"
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5612:1: rule__AtomicExpr__Group_2__1__Impl : ( ( rule__AtomicExpr__ValAssignment_2_1 ) ) ;
    public final void rule__AtomicExpr__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5616:1: ( ( ( rule__AtomicExpr__ValAssignment_2_1 ) ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5617:1: ( ( rule__AtomicExpr__ValAssignment_2_1 ) )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5617:1: ( ( rule__AtomicExpr__ValAssignment_2_1 ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5618:1: ( rule__AtomicExpr__ValAssignment_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAtomicExprAccess().getValAssignment_2_1()); 
            }
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5619:1: ( rule__AtomicExpr__ValAssignment_2_1 )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5619:2: rule__AtomicExpr__ValAssignment_2_1
            {
            pushFollow(FOLLOW_rule__AtomicExpr__ValAssignment_2_1_in_rule__AtomicExpr__Group_2__1__Impl11243);
            rule__AtomicExpr__ValAssignment_2_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAtomicExprAccess().getValAssignment_2_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AtomicExpr__Group_2__1__Impl"


    // $ANTLR start "rule__AtomicExpr__Group_3__0"
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5633:1: rule__AtomicExpr__Group_3__0 : rule__AtomicExpr__Group_3__0__Impl rule__AtomicExpr__Group_3__1 ;
    public final void rule__AtomicExpr__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5637:1: ( rule__AtomicExpr__Group_3__0__Impl rule__AtomicExpr__Group_3__1 )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5638:2: rule__AtomicExpr__Group_3__0__Impl rule__AtomicExpr__Group_3__1
            {
            pushFollow(FOLLOW_rule__AtomicExpr__Group_3__0__Impl_in_rule__AtomicExpr__Group_3__011277);
            rule__AtomicExpr__Group_3__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__AtomicExpr__Group_3__1_in_rule__AtomicExpr__Group_3__011280);
            rule__AtomicExpr__Group_3__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AtomicExpr__Group_3__0"


    // $ANTLR start "rule__AtomicExpr__Group_3__0__Impl"
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5645:1: rule__AtomicExpr__Group_3__0__Impl : ( () ) ;
    public final void rule__AtomicExpr__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5649:1: ( ( () ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5650:1: ( () )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5650:1: ( () )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5651:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAtomicExprAccess().getBoolExprAction_3_0()); 
            }
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5652:1: ()
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5654:1: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAtomicExprAccess().getBoolExprAction_3_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AtomicExpr__Group_3__0__Impl"


    // $ANTLR start "rule__AtomicExpr__Group_3__1"
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5664:1: rule__AtomicExpr__Group_3__1 : rule__AtomicExpr__Group_3__1__Impl ;
    public final void rule__AtomicExpr__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5668:1: ( rule__AtomicExpr__Group_3__1__Impl )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5669:2: rule__AtomicExpr__Group_3__1__Impl
            {
            pushFollow(FOLLOW_rule__AtomicExpr__Group_3__1__Impl_in_rule__AtomicExpr__Group_3__111338);
            rule__AtomicExpr__Group_3__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AtomicExpr__Group_3__1"


    // $ANTLR start "rule__AtomicExpr__Group_3__1__Impl"
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5675:1: rule__AtomicExpr__Group_3__1__Impl : ( ( rule__AtomicExpr__ValAssignment_3_1 ) ) ;
    public final void rule__AtomicExpr__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5679:1: ( ( ( rule__AtomicExpr__ValAssignment_3_1 ) ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5680:1: ( ( rule__AtomicExpr__ValAssignment_3_1 ) )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5680:1: ( ( rule__AtomicExpr__ValAssignment_3_1 ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5681:1: ( rule__AtomicExpr__ValAssignment_3_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAtomicExprAccess().getValAssignment_3_1()); 
            }
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5682:1: ( rule__AtomicExpr__ValAssignment_3_1 )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5682:2: rule__AtomicExpr__ValAssignment_3_1
            {
            pushFollow(FOLLOW_rule__AtomicExpr__ValAssignment_3_1_in_rule__AtomicExpr__Group_3__1__Impl11365);
            rule__AtomicExpr__ValAssignment_3_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAtomicExprAccess().getValAssignment_3_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AtomicExpr__Group_3__1__Impl"


    // $ANTLR start "rule__AtomicExpr__Group_4__0"
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5696:1: rule__AtomicExpr__Group_4__0 : rule__AtomicExpr__Group_4__0__Impl rule__AtomicExpr__Group_4__1 ;
    public final void rule__AtomicExpr__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5700:1: ( rule__AtomicExpr__Group_4__0__Impl rule__AtomicExpr__Group_4__1 )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5701:2: rule__AtomicExpr__Group_4__0__Impl rule__AtomicExpr__Group_4__1
            {
            pushFollow(FOLLOW_rule__AtomicExpr__Group_4__0__Impl_in_rule__AtomicExpr__Group_4__011399);
            rule__AtomicExpr__Group_4__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__AtomicExpr__Group_4__1_in_rule__AtomicExpr__Group_4__011402);
            rule__AtomicExpr__Group_4__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AtomicExpr__Group_4__0"


    // $ANTLR start "rule__AtomicExpr__Group_4__0__Impl"
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5708:1: rule__AtomicExpr__Group_4__0__Impl : ( () ) ;
    public final void rule__AtomicExpr__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5712:1: ( ( () ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5713:1: ( () )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5713:1: ( () )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5714:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAtomicExprAccess().getIfThenElseExprAction_4_0()); 
            }
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5715:1: ()
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5717:1: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAtomicExprAccess().getIfThenElseExprAction_4_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AtomicExpr__Group_4__0__Impl"


    // $ANTLR start "rule__AtomicExpr__Group_4__1"
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5727:1: rule__AtomicExpr__Group_4__1 : rule__AtomicExpr__Group_4__1__Impl rule__AtomicExpr__Group_4__2 ;
    public final void rule__AtomicExpr__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5731:1: ( rule__AtomicExpr__Group_4__1__Impl rule__AtomicExpr__Group_4__2 )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5732:2: rule__AtomicExpr__Group_4__1__Impl rule__AtomicExpr__Group_4__2
            {
            pushFollow(FOLLOW_rule__AtomicExpr__Group_4__1__Impl_in_rule__AtomicExpr__Group_4__111460);
            rule__AtomicExpr__Group_4__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__AtomicExpr__Group_4__2_in_rule__AtomicExpr__Group_4__111463);
            rule__AtomicExpr__Group_4__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AtomicExpr__Group_4__1"


    // $ANTLR start "rule__AtomicExpr__Group_4__1__Impl"
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5739:1: rule__AtomicExpr__Group_4__1__Impl : ( 'if' ) ;
    public final void rule__AtomicExpr__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5743:1: ( ( 'if' ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5744:1: ( 'if' )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5744:1: ( 'if' )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5745:1: 'if'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAtomicExprAccess().getIfKeyword_4_1()); 
            }
            match(input,52,FOLLOW_52_in_rule__AtomicExpr__Group_4__1__Impl11491); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAtomicExprAccess().getIfKeyword_4_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AtomicExpr__Group_4__1__Impl"


    // $ANTLR start "rule__AtomicExpr__Group_4__2"
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5758:1: rule__AtomicExpr__Group_4__2 : rule__AtomicExpr__Group_4__2__Impl rule__AtomicExpr__Group_4__3 ;
    public final void rule__AtomicExpr__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5762:1: ( rule__AtomicExpr__Group_4__2__Impl rule__AtomicExpr__Group_4__3 )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5763:2: rule__AtomicExpr__Group_4__2__Impl rule__AtomicExpr__Group_4__3
            {
            pushFollow(FOLLOW_rule__AtomicExpr__Group_4__2__Impl_in_rule__AtomicExpr__Group_4__211522);
            rule__AtomicExpr__Group_4__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__AtomicExpr__Group_4__3_in_rule__AtomicExpr__Group_4__211525);
            rule__AtomicExpr__Group_4__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AtomicExpr__Group_4__2"


    // $ANTLR start "rule__AtomicExpr__Group_4__2__Impl"
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5770:1: rule__AtomicExpr__Group_4__2__Impl : ( ( rule__AtomicExpr__CondAssignment_4_2 ) ) ;
    public final void rule__AtomicExpr__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5774:1: ( ( ( rule__AtomicExpr__CondAssignment_4_2 ) ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5775:1: ( ( rule__AtomicExpr__CondAssignment_4_2 ) )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5775:1: ( ( rule__AtomicExpr__CondAssignment_4_2 ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5776:1: ( rule__AtomicExpr__CondAssignment_4_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAtomicExprAccess().getCondAssignment_4_2()); 
            }
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5777:1: ( rule__AtomicExpr__CondAssignment_4_2 )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5777:2: rule__AtomicExpr__CondAssignment_4_2
            {
            pushFollow(FOLLOW_rule__AtomicExpr__CondAssignment_4_2_in_rule__AtomicExpr__Group_4__2__Impl11552);
            rule__AtomicExpr__CondAssignment_4_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAtomicExprAccess().getCondAssignment_4_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AtomicExpr__Group_4__2__Impl"


    // $ANTLR start "rule__AtomicExpr__Group_4__3"
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5787:1: rule__AtomicExpr__Group_4__3 : rule__AtomicExpr__Group_4__3__Impl rule__AtomicExpr__Group_4__4 ;
    public final void rule__AtomicExpr__Group_4__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5791:1: ( rule__AtomicExpr__Group_4__3__Impl rule__AtomicExpr__Group_4__4 )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5792:2: rule__AtomicExpr__Group_4__3__Impl rule__AtomicExpr__Group_4__4
            {
            pushFollow(FOLLOW_rule__AtomicExpr__Group_4__3__Impl_in_rule__AtomicExpr__Group_4__311582);
            rule__AtomicExpr__Group_4__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__AtomicExpr__Group_4__4_in_rule__AtomicExpr__Group_4__311585);
            rule__AtomicExpr__Group_4__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AtomicExpr__Group_4__3"


    // $ANTLR start "rule__AtomicExpr__Group_4__3__Impl"
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5799:1: rule__AtomicExpr__Group_4__3__Impl : ( 'then' ) ;
    public final void rule__AtomicExpr__Group_4__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5803:1: ( ( 'then' ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5804:1: ( 'then' )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5804:1: ( 'then' )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5805:1: 'then'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAtomicExprAccess().getThenKeyword_4_3()); 
            }
            match(input,53,FOLLOW_53_in_rule__AtomicExpr__Group_4__3__Impl11613); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAtomicExprAccess().getThenKeyword_4_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AtomicExpr__Group_4__3__Impl"


    // $ANTLR start "rule__AtomicExpr__Group_4__4"
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5818:1: rule__AtomicExpr__Group_4__4 : rule__AtomicExpr__Group_4__4__Impl rule__AtomicExpr__Group_4__5 ;
    public final void rule__AtomicExpr__Group_4__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5822:1: ( rule__AtomicExpr__Group_4__4__Impl rule__AtomicExpr__Group_4__5 )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5823:2: rule__AtomicExpr__Group_4__4__Impl rule__AtomicExpr__Group_4__5
            {
            pushFollow(FOLLOW_rule__AtomicExpr__Group_4__4__Impl_in_rule__AtomicExpr__Group_4__411644);
            rule__AtomicExpr__Group_4__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__AtomicExpr__Group_4__5_in_rule__AtomicExpr__Group_4__411647);
            rule__AtomicExpr__Group_4__5();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AtomicExpr__Group_4__4"


    // $ANTLR start "rule__AtomicExpr__Group_4__4__Impl"
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5830:1: rule__AtomicExpr__Group_4__4__Impl : ( ( rule__AtomicExpr__ThenAssignment_4_4 ) ) ;
    public final void rule__AtomicExpr__Group_4__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5834:1: ( ( ( rule__AtomicExpr__ThenAssignment_4_4 ) ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5835:1: ( ( rule__AtomicExpr__ThenAssignment_4_4 ) )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5835:1: ( ( rule__AtomicExpr__ThenAssignment_4_4 ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5836:1: ( rule__AtomicExpr__ThenAssignment_4_4 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAtomicExprAccess().getThenAssignment_4_4()); 
            }
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5837:1: ( rule__AtomicExpr__ThenAssignment_4_4 )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5837:2: rule__AtomicExpr__ThenAssignment_4_4
            {
            pushFollow(FOLLOW_rule__AtomicExpr__ThenAssignment_4_4_in_rule__AtomicExpr__Group_4__4__Impl11674);
            rule__AtomicExpr__ThenAssignment_4_4();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAtomicExprAccess().getThenAssignment_4_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AtomicExpr__Group_4__4__Impl"


    // $ANTLR start "rule__AtomicExpr__Group_4__5"
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5847:1: rule__AtomicExpr__Group_4__5 : rule__AtomicExpr__Group_4__5__Impl rule__AtomicExpr__Group_4__6 ;
    public final void rule__AtomicExpr__Group_4__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5851:1: ( rule__AtomicExpr__Group_4__5__Impl rule__AtomicExpr__Group_4__6 )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5852:2: rule__AtomicExpr__Group_4__5__Impl rule__AtomicExpr__Group_4__6
            {
            pushFollow(FOLLOW_rule__AtomicExpr__Group_4__5__Impl_in_rule__AtomicExpr__Group_4__511704);
            rule__AtomicExpr__Group_4__5__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__AtomicExpr__Group_4__6_in_rule__AtomicExpr__Group_4__511707);
            rule__AtomicExpr__Group_4__6();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AtomicExpr__Group_4__5"


    // $ANTLR start "rule__AtomicExpr__Group_4__5__Impl"
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5859:1: rule__AtomicExpr__Group_4__5__Impl : ( 'else' ) ;
    public final void rule__AtomicExpr__Group_4__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5863:1: ( ( 'else' ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5864:1: ( 'else' )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5864:1: ( 'else' )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5865:1: 'else'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAtomicExprAccess().getElseKeyword_4_5()); 
            }
            match(input,54,FOLLOW_54_in_rule__AtomicExpr__Group_4__5__Impl11735); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAtomicExprAccess().getElseKeyword_4_5()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AtomicExpr__Group_4__5__Impl"


    // $ANTLR start "rule__AtomicExpr__Group_4__6"
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5878:1: rule__AtomicExpr__Group_4__6 : rule__AtomicExpr__Group_4__6__Impl ;
    public final void rule__AtomicExpr__Group_4__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5882:1: ( rule__AtomicExpr__Group_4__6__Impl )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5883:2: rule__AtomicExpr__Group_4__6__Impl
            {
            pushFollow(FOLLOW_rule__AtomicExpr__Group_4__6__Impl_in_rule__AtomicExpr__Group_4__611766);
            rule__AtomicExpr__Group_4__6__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AtomicExpr__Group_4__6"


    // $ANTLR start "rule__AtomicExpr__Group_4__6__Impl"
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5889:1: rule__AtomicExpr__Group_4__6__Impl : ( ( rule__AtomicExpr__ElseAssignment_4_6 ) ) ;
    public final void rule__AtomicExpr__Group_4__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5893:1: ( ( ( rule__AtomicExpr__ElseAssignment_4_6 ) ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5894:1: ( ( rule__AtomicExpr__ElseAssignment_4_6 ) )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5894:1: ( ( rule__AtomicExpr__ElseAssignment_4_6 ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5895:1: ( rule__AtomicExpr__ElseAssignment_4_6 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAtomicExprAccess().getElseAssignment_4_6()); 
            }
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5896:1: ( rule__AtomicExpr__ElseAssignment_4_6 )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5896:2: rule__AtomicExpr__ElseAssignment_4_6
            {
            pushFollow(FOLLOW_rule__AtomicExpr__ElseAssignment_4_6_in_rule__AtomicExpr__Group_4__6__Impl11793);
            rule__AtomicExpr__ElseAssignment_4_6();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAtomicExprAccess().getElseAssignment_4_6()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AtomicExpr__Group_4__6__Impl"


    // $ANTLR start "rule__AtomicExpr__Group_5__0"
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5920:1: rule__AtomicExpr__Group_5__0 : rule__AtomicExpr__Group_5__0__Impl rule__AtomicExpr__Group_5__1 ;
    public final void rule__AtomicExpr__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5924:1: ( rule__AtomicExpr__Group_5__0__Impl rule__AtomicExpr__Group_5__1 )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5925:2: rule__AtomicExpr__Group_5__0__Impl rule__AtomicExpr__Group_5__1
            {
            pushFollow(FOLLOW_rule__AtomicExpr__Group_5__0__Impl_in_rule__AtomicExpr__Group_5__011837);
            rule__AtomicExpr__Group_5__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__AtomicExpr__Group_5__1_in_rule__AtomicExpr__Group_5__011840);
            rule__AtomicExpr__Group_5__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AtomicExpr__Group_5__0"


    // $ANTLR start "rule__AtomicExpr__Group_5__0__Impl"
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5932:1: rule__AtomicExpr__Group_5__0__Impl : ( () ) ;
    public final void rule__AtomicExpr__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5936:1: ( ( () ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5937:1: ( () )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5937:1: ( () )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5938:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAtomicExprAccess().getNodeCallExprAction_5_0()); 
            }
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5939:1: ()
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5941:1: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAtomicExprAccess().getNodeCallExprAction_5_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AtomicExpr__Group_5__0__Impl"


    // $ANTLR start "rule__AtomicExpr__Group_5__1"
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5951:1: rule__AtomicExpr__Group_5__1 : rule__AtomicExpr__Group_5__1__Impl rule__AtomicExpr__Group_5__2 ;
    public final void rule__AtomicExpr__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5955:1: ( rule__AtomicExpr__Group_5__1__Impl rule__AtomicExpr__Group_5__2 )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5956:2: rule__AtomicExpr__Group_5__1__Impl rule__AtomicExpr__Group_5__2
            {
            pushFollow(FOLLOW_rule__AtomicExpr__Group_5__1__Impl_in_rule__AtomicExpr__Group_5__111898);
            rule__AtomicExpr__Group_5__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__AtomicExpr__Group_5__2_in_rule__AtomicExpr__Group_5__111901);
            rule__AtomicExpr__Group_5__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AtomicExpr__Group_5__1"


    // $ANTLR start "rule__AtomicExpr__Group_5__1__Impl"
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5963:1: rule__AtomicExpr__Group_5__1__Impl : ( ( rule__AtomicExpr__NodeAssignment_5_1 ) ) ;
    public final void rule__AtomicExpr__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5967:1: ( ( ( rule__AtomicExpr__NodeAssignment_5_1 ) ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5968:1: ( ( rule__AtomicExpr__NodeAssignment_5_1 ) )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5968:1: ( ( rule__AtomicExpr__NodeAssignment_5_1 ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5969:1: ( rule__AtomicExpr__NodeAssignment_5_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAtomicExprAccess().getNodeAssignment_5_1()); 
            }
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5970:1: ( rule__AtomicExpr__NodeAssignment_5_1 )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5970:2: rule__AtomicExpr__NodeAssignment_5_1
            {
            pushFollow(FOLLOW_rule__AtomicExpr__NodeAssignment_5_1_in_rule__AtomicExpr__Group_5__1__Impl11928);
            rule__AtomicExpr__NodeAssignment_5_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAtomicExprAccess().getNodeAssignment_5_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AtomicExpr__Group_5__1__Impl"


    // $ANTLR start "rule__AtomicExpr__Group_5__2"
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5980:1: rule__AtomicExpr__Group_5__2 : rule__AtomicExpr__Group_5__2__Impl rule__AtomicExpr__Group_5__3 ;
    public final void rule__AtomicExpr__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5984:1: ( rule__AtomicExpr__Group_5__2__Impl rule__AtomicExpr__Group_5__3 )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5985:2: rule__AtomicExpr__Group_5__2__Impl rule__AtomicExpr__Group_5__3
            {
            pushFollow(FOLLOW_rule__AtomicExpr__Group_5__2__Impl_in_rule__AtomicExpr__Group_5__211958);
            rule__AtomicExpr__Group_5__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__AtomicExpr__Group_5__3_in_rule__AtomicExpr__Group_5__211961);
            rule__AtomicExpr__Group_5__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AtomicExpr__Group_5__2"


    // $ANTLR start "rule__AtomicExpr__Group_5__2__Impl"
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5992:1: rule__AtomicExpr__Group_5__2__Impl : ( '(' ) ;
    public final void rule__AtomicExpr__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5996:1: ( ( '(' ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5997:1: ( '(' )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5997:1: ( '(' )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5998:1: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAtomicExprAccess().getLeftParenthesisKeyword_5_2()); 
            }
            match(input,43,FOLLOW_43_in_rule__AtomicExpr__Group_5__2__Impl11989); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAtomicExprAccess().getLeftParenthesisKeyword_5_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AtomicExpr__Group_5__2__Impl"


    // $ANTLR start "rule__AtomicExpr__Group_5__3"
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6011:1: rule__AtomicExpr__Group_5__3 : rule__AtomicExpr__Group_5__3__Impl rule__AtomicExpr__Group_5__4 ;
    public final void rule__AtomicExpr__Group_5__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6015:1: ( rule__AtomicExpr__Group_5__3__Impl rule__AtomicExpr__Group_5__4 )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6016:2: rule__AtomicExpr__Group_5__3__Impl rule__AtomicExpr__Group_5__4
            {
            pushFollow(FOLLOW_rule__AtomicExpr__Group_5__3__Impl_in_rule__AtomicExpr__Group_5__312020);
            rule__AtomicExpr__Group_5__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__AtomicExpr__Group_5__4_in_rule__AtomicExpr__Group_5__312023);
            rule__AtomicExpr__Group_5__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AtomicExpr__Group_5__3"


    // $ANTLR start "rule__AtomicExpr__Group_5__3__Impl"
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6023:1: rule__AtomicExpr__Group_5__3__Impl : ( ( rule__AtomicExpr__Group_5_3__0 )? ) ;
    public final void rule__AtomicExpr__Group_5__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6027:1: ( ( ( rule__AtomicExpr__Group_5_3__0 )? ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6028:1: ( ( rule__AtomicExpr__Group_5_3__0 )? )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6028:1: ( ( rule__AtomicExpr__Group_5_3__0 )? )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6029:1: ( rule__AtomicExpr__Group_5_3__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAtomicExprAccess().getGroup_5_3()); 
            }
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6030:1: ( rule__AtomicExpr__Group_5_3__0 )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( ((LA33_0>=RULE_INT && LA33_0<=RULE_BOOL)||LA33_0==21||(LA33_0>=25 && LA33_0<=26)||LA33_0==43||LA33_0==52) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6030:2: rule__AtomicExpr__Group_5_3__0
                    {
                    pushFollow(FOLLOW_rule__AtomicExpr__Group_5_3__0_in_rule__AtomicExpr__Group_5__3__Impl12050);
                    rule__AtomicExpr__Group_5_3__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAtomicExprAccess().getGroup_5_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AtomicExpr__Group_5__3__Impl"


    // $ANTLR start "rule__AtomicExpr__Group_5__4"
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6040:1: rule__AtomicExpr__Group_5__4 : rule__AtomicExpr__Group_5__4__Impl ;
    public final void rule__AtomicExpr__Group_5__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6044:1: ( rule__AtomicExpr__Group_5__4__Impl )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6045:2: rule__AtomicExpr__Group_5__4__Impl
            {
            pushFollow(FOLLOW_rule__AtomicExpr__Group_5__4__Impl_in_rule__AtomicExpr__Group_5__412081);
            rule__AtomicExpr__Group_5__4__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AtomicExpr__Group_5__4"


    // $ANTLR start "rule__AtomicExpr__Group_5__4__Impl"
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6051:1: rule__AtomicExpr__Group_5__4__Impl : ( ')' ) ;
    public final void rule__AtomicExpr__Group_5__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6055:1: ( ( ')' ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6056:1: ( ')' )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6056:1: ( ')' )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6057:1: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAtomicExprAccess().getRightParenthesisKeyword_5_4()); 
            }
            match(input,44,FOLLOW_44_in_rule__AtomicExpr__Group_5__4__Impl12109); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAtomicExprAccess().getRightParenthesisKeyword_5_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AtomicExpr__Group_5__4__Impl"


    // $ANTLR start "rule__AtomicExpr__Group_5_3__0"
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6080:1: rule__AtomicExpr__Group_5_3__0 : rule__AtomicExpr__Group_5_3__0__Impl rule__AtomicExpr__Group_5_3__1 ;
    public final void rule__AtomicExpr__Group_5_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6084:1: ( rule__AtomicExpr__Group_5_3__0__Impl rule__AtomicExpr__Group_5_3__1 )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6085:2: rule__AtomicExpr__Group_5_3__0__Impl rule__AtomicExpr__Group_5_3__1
            {
            pushFollow(FOLLOW_rule__AtomicExpr__Group_5_3__0__Impl_in_rule__AtomicExpr__Group_5_3__012150);
            rule__AtomicExpr__Group_5_3__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__AtomicExpr__Group_5_3__1_in_rule__AtomicExpr__Group_5_3__012153);
            rule__AtomicExpr__Group_5_3__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AtomicExpr__Group_5_3__0"


    // $ANTLR start "rule__AtomicExpr__Group_5_3__0__Impl"
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6092:1: rule__AtomicExpr__Group_5_3__0__Impl : ( ( rule__AtomicExpr__ArgsAssignment_5_3_0 ) ) ;
    public final void rule__AtomicExpr__Group_5_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6096:1: ( ( ( rule__AtomicExpr__ArgsAssignment_5_3_0 ) ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6097:1: ( ( rule__AtomicExpr__ArgsAssignment_5_3_0 ) )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6097:1: ( ( rule__AtomicExpr__ArgsAssignment_5_3_0 ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6098:1: ( rule__AtomicExpr__ArgsAssignment_5_3_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAtomicExprAccess().getArgsAssignment_5_3_0()); 
            }
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6099:1: ( rule__AtomicExpr__ArgsAssignment_5_3_0 )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6099:2: rule__AtomicExpr__ArgsAssignment_5_3_0
            {
            pushFollow(FOLLOW_rule__AtomicExpr__ArgsAssignment_5_3_0_in_rule__AtomicExpr__Group_5_3__0__Impl12180);
            rule__AtomicExpr__ArgsAssignment_5_3_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAtomicExprAccess().getArgsAssignment_5_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AtomicExpr__Group_5_3__0__Impl"


    // $ANTLR start "rule__AtomicExpr__Group_5_3__1"
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6109:1: rule__AtomicExpr__Group_5_3__1 : rule__AtomicExpr__Group_5_3__1__Impl ;
    public final void rule__AtomicExpr__Group_5_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6113:1: ( rule__AtomicExpr__Group_5_3__1__Impl )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6114:2: rule__AtomicExpr__Group_5_3__1__Impl
            {
            pushFollow(FOLLOW_rule__AtomicExpr__Group_5_3__1__Impl_in_rule__AtomicExpr__Group_5_3__112210);
            rule__AtomicExpr__Group_5_3__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AtomicExpr__Group_5_3__1"


    // $ANTLR start "rule__AtomicExpr__Group_5_3__1__Impl"
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6120:1: rule__AtomicExpr__Group_5_3__1__Impl : ( ( rule__AtomicExpr__Group_5_3_1__0 )* ) ;
    public final void rule__AtomicExpr__Group_5_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6124:1: ( ( ( rule__AtomicExpr__Group_5_3_1__0 )* ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6125:1: ( ( rule__AtomicExpr__Group_5_3_1__0 )* )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6125:1: ( ( rule__AtomicExpr__Group_5_3_1__0 )* )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6126:1: ( rule__AtomicExpr__Group_5_3_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAtomicExprAccess().getGroup_5_3_1()); 
            }
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6127:1: ( rule__AtomicExpr__Group_5_3_1__0 )*
            loop34:
            do {
                int alt34=2;
                int LA34_0 = input.LA(1);

                if ( (LA34_0==38) ) {
                    alt34=1;
                }


                switch (alt34) {
            	case 1 :
            	    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6127:2: rule__AtomicExpr__Group_5_3_1__0
            	    {
            	    pushFollow(FOLLOW_rule__AtomicExpr__Group_5_3_1__0_in_rule__AtomicExpr__Group_5_3__1__Impl12237);
            	    rule__AtomicExpr__Group_5_3_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop34;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAtomicExprAccess().getGroup_5_3_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AtomicExpr__Group_5_3__1__Impl"


    // $ANTLR start "rule__AtomicExpr__Group_5_3_1__0"
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6141:1: rule__AtomicExpr__Group_5_3_1__0 : rule__AtomicExpr__Group_5_3_1__0__Impl rule__AtomicExpr__Group_5_3_1__1 ;
    public final void rule__AtomicExpr__Group_5_3_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6145:1: ( rule__AtomicExpr__Group_5_3_1__0__Impl rule__AtomicExpr__Group_5_3_1__1 )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6146:2: rule__AtomicExpr__Group_5_3_1__0__Impl rule__AtomicExpr__Group_5_3_1__1
            {
            pushFollow(FOLLOW_rule__AtomicExpr__Group_5_3_1__0__Impl_in_rule__AtomicExpr__Group_5_3_1__012272);
            rule__AtomicExpr__Group_5_3_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__AtomicExpr__Group_5_3_1__1_in_rule__AtomicExpr__Group_5_3_1__012275);
            rule__AtomicExpr__Group_5_3_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AtomicExpr__Group_5_3_1__0"


    // $ANTLR start "rule__AtomicExpr__Group_5_3_1__0__Impl"
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6153:1: rule__AtomicExpr__Group_5_3_1__0__Impl : ( ',' ) ;
    public final void rule__AtomicExpr__Group_5_3_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6157:1: ( ( ',' ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6158:1: ( ',' )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6158:1: ( ',' )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6159:1: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAtomicExprAccess().getCommaKeyword_5_3_1_0()); 
            }
            match(input,38,FOLLOW_38_in_rule__AtomicExpr__Group_5_3_1__0__Impl12303); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAtomicExprAccess().getCommaKeyword_5_3_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AtomicExpr__Group_5_3_1__0__Impl"


    // $ANTLR start "rule__AtomicExpr__Group_5_3_1__1"
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6172:1: rule__AtomicExpr__Group_5_3_1__1 : rule__AtomicExpr__Group_5_3_1__1__Impl ;
    public final void rule__AtomicExpr__Group_5_3_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6176:1: ( rule__AtomicExpr__Group_5_3_1__1__Impl )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6177:2: rule__AtomicExpr__Group_5_3_1__1__Impl
            {
            pushFollow(FOLLOW_rule__AtomicExpr__Group_5_3_1__1__Impl_in_rule__AtomicExpr__Group_5_3_1__112334);
            rule__AtomicExpr__Group_5_3_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AtomicExpr__Group_5_3_1__1"


    // $ANTLR start "rule__AtomicExpr__Group_5_3_1__1__Impl"
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6183:1: rule__AtomicExpr__Group_5_3_1__1__Impl : ( ( rule__AtomicExpr__ArgsAssignment_5_3_1_1 ) ) ;
    public final void rule__AtomicExpr__Group_5_3_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6187:1: ( ( ( rule__AtomicExpr__ArgsAssignment_5_3_1_1 ) ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6188:1: ( ( rule__AtomicExpr__ArgsAssignment_5_3_1_1 ) )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6188:1: ( ( rule__AtomicExpr__ArgsAssignment_5_3_1_1 ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6189:1: ( rule__AtomicExpr__ArgsAssignment_5_3_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAtomicExprAccess().getArgsAssignment_5_3_1_1()); 
            }
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6190:1: ( rule__AtomicExpr__ArgsAssignment_5_3_1_1 )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6190:2: rule__AtomicExpr__ArgsAssignment_5_3_1_1
            {
            pushFollow(FOLLOW_rule__AtomicExpr__ArgsAssignment_5_3_1_1_in_rule__AtomicExpr__Group_5_3_1__1__Impl12361);
            rule__AtomicExpr__ArgsAssignment_5_3_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAtomicExprAccess().getArgsAssignment_5_3_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AtomicExpr__Group_5_3_1__1__Impl"


    // $ANTLR start "rule__AtomicExpr__Group_6__0"
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6204:1: rule__AtomicExpr__Group_6__0 : rule__AtomicExpr__Group_6__0__Impl rule__AtomicExpr__Group_6__1 ;
    public final void rule__AtomicExpr__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6208:1: ( rule__AtomicExpr__Group_6__0__Impl rule__AtomicExpr__Group_6__1 )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6209:2: rule__AtomicExpr__Group_6__0__Impl rule__AtomicExpr__Group_6__1
            {
            pushFollow(FOLLOW_rule__AtomicExpr__Group_6__0__Impl_in_rule__AtomicExpr__Group_6__012395);
            rule__AtomicExpr__Group_6__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__AtomicExpr__Group_6__1_in_rule__AtomicExpr__Group_6__012398);
            rule__AtomicExpr__Group_6__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AtomicExpr__Group_6__0"


    // $ANTLR start "rule__AtomicExpr__Group_6__0__Impl"
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6216:1: rule__AtomicExpr__Group_6__0__Impl : ( () ) ;
    public final void rule__AtomicExpr__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6220:1: ( ( () ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6221:1: ( () )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6221:1: ( () )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6222:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAtomicExprAccess().getRecordExprAction_6_0()); 
            }
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6223:1: ()
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6225:1: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAtomicExprAccess().getRecordExprAction_6_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AtomicExpr__Group_6__0__Impl"


    // $ANTLR start "rule__AtomicExpr__Group_6__1"
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6235:1: rule__AtomicExpr__Group_6__1 : rule__AtomicExpr__Group_6__1__Impl rule__AtomicExpr__Group_6__2 ;
    public final void rule__AtomicExpr__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6239:1: ( rule__AtomicExpr__Group_6__1__Impl rule__AtomicExpr__Group_6__2 )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6240:2: rule__AtomicExpr__Group_6__1__Impl rule__AtomicExpr__Group_6__2
            {
            pushFollow(FOLLOW_rule__AtomicExpr__Group_6__1__Impl_in_rule__AtomicExpr__Group_6__112456);
            rule__AtomicExpr__Group_6__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__AtomicExpr__Group_6__2_in_rule__AtomicExpr__Group_6__112459);
            rule__AtomicExpr__Group_6__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AtomicExpr__Group_6__1"


    // $ANTLR start "rule__AtomicExpr__Group_6__1__Impl"
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6247:1: rule__AtomicExpr__Group_6__1__Impl : ( ( rule__AtomicExpr__IdAssignment_6_1 ) ) ;
    public final void rule__AtomicExpr__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6251:1: ( ( ( rule__AtomicExpr__IdAssignment_6_1 ) ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6252:1: ( ( rule__AtomicExpr__IdAssignment_6_1 ) )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6252:1: ( ( rule__AtomicExpr__IdAssignment_6_1 ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6253:1: ( rule__AtomicExpr__IdAssignment_6_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAtomicExprAccess().getIdAssignment_6_1()); 
            }
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6254:1: ( rule__AtomicExpr__IdAssignment_6_1 )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6254:2: rule__AtomicExpr__IdAssignment_6_1
            {
            pushFollow(FOLLOW_rule__AtomicExpr__IdAssignment_6_1_in_rule__AtomicExpr__Group_6__1__Impl12486);
            rule__AtomicExpr__IdAssignment_6_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAtomicExprAccess().getIdAssignment_6_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AtomicExpr__Group_6__1__Impl"


    // $ANTLR start "rule__AtomicExpr__Group_6__2"
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6264:1: rule__AtomicExpr__Group_6__2 : rule__AtomicExpr__Group_6__2__Impl rule__AtomicExpr__Group_6__3 ;
    public final void rule__AtomicExpr__Group_6__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6268:1: ( rule__AtomicExpr__Group_6__2__Impl rule__AtomicExpr__Group_6__3 )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6269:2: rule__AtomicExpr__Group_6__2__Impl rule__AtomicExpr__Group_6__3
            {
            pushFollow(FOLLOW_rule__AtomicExpr__Group_6__2__Impl_in_rule__AtomicExpr__Group_6__212516);
            rule__AtomicExpr__Group_6__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__AtomicExpr__Group_6__3_in_rule__AtomicExpr__Group_6__212519);
            rule__AtomicExpr__Group_6__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AtomicExpr__Group_6__2"


    // $ANTLR start "rule__AtomicExpr__Group_6__2__Impl"
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6276:1: rule__AtomicExpr__Group_6__2__Impl : ( '{' ) ;
    public final void rule__AtomicExpr__Group_6__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6280:1: ( ( '{' ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6281:1: ( '{' )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6281:1: ( '{' )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6282:1: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAtomicExprAccess().getLeftCurlyBracketKeyword_6_2()); 
            }
            match(input,30,FOLLOW_30_in_rule__AtomicExpr__Group_6__2__Impl12547); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAtomicExprAccess().getLeftCurlyBracketKeyword_6_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AtomicExpr__Group_6__2__Impl"


    // $ANTLR start "rule__AtomicExpr__Group_6__3"
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6295:1: rule__AtomicExpr__Group_6__3 : rule__AtomicExpr__Group_6__3__Impl rule__AtomicExpr__Group_6__4 ;
    public final void rule__AtomicExpr__Group_6__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6299:1: ( rule__AtomicExpr__Group_6__3__Impl rule__AtomicExpr__Group_6__4 )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6300:2: rule__AtomicExpr__Group_6__3__Impl rule__AtomicExpr__Group_6__4
            {
            pushFollow(FOLLOW_rule__AtomicExpr__Group_6__3__Impl_in_rule__AtomicExpr__Group_6__312578);
            rule__AtomicExpr__Group_6__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__AtomicExpr__Group_6__4_in_rule__AtomicExpr__Group_6__312581);
            rule__AtomicExpr__Group_6__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AtomicExpr__Group_6__3"


    // $ANTLR start "rule__AtomicExpr__Group_6__3__Impl"
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6307:1: rule__AtomicExpr__Group_6__3__Impl : ( ( rule__AtomicExpr__FieldsAssignment_6_3 ) ) ;
    public final void rule__AtomicExpr__Group_6__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6311:1: ( ( ( rule__AtomicExpr__FieldsAssignment_6_3 ) ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6312:1: ( ( rule__AtomicExpr__FieldsAssignment_6_3 ) )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6312:1: ( ( rule__AtomicExpr__FieldsAssignment_6_3 ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6313:1: ( rule__AtomicExpr__FieldsAssignment_6_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAtomicExprAccess().getFieldsAssignment_6_3()); 
            }
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6314:1: ( rule__AtomicExpr__FieldsAssignment_6_3 )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6314:2: rule__AtomicExpr__FieldsAssignment_6_3
            {
            pushFollow(FOLLOW_rule__AtomicExpr__FieldsAssignment_6_3_in_rule__AtomicExpr__Group_6__3__Impl12608);
            rule__AtomicExpr__FieldsAssignment_6_3();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAtomicExprAccess().getFieldsAssignment_6_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AtomicExpr__Group_6__3__Impl"


    // $ANTLR start "rule__AtomicExpr__Group_6__4"
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6324:1: rule__AtomicExpr__Group_6__4 : rule__AtomicExpr__Group_6__4__Impl rule__AtomicExpr__Group_6__5 ;
    public final void rule__AtomicExpr__Group_6__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6328:1: ( rule__AtomicExpr__Group_6__4__Impl rule__AtomicExpr__Group_6__5 )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6329:2: rule__AtomicExpr__Group_6__4__Impl rule__AtomicExpr__Group_6__5
            {
            pushFollow(FOLLOW_rule__AtomicExpr__Group_6__4__Impl_in_rule__AtomicExpr__Group_6__412638);
            rule__AtomicExpr__Group_6__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__AtomicExpr__Group_6__5_in_rule__AtomicExpr__Group_6__412641);
            rule__AtomicExpr__Group_6__5();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AtomicExpr__Group_6__4"


    // $ANTLR start "rule__AtomicExpr__Group_6__4__Impl"
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6336:1: rule__AtomicExpr__Group_6__4__Impl : ( '=' ) ;
    public final void rule__AtomicExpr__Group_6__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6340:1: ( ( '=' ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6341:1: ( '=' )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6341:1: ( '=' )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6342:1: '='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAtomicExprAccess().getEqualsSignKeyword_6_4()); 
            }
            match(input,18,FOLLOW_18_in_rule__AtomicExpr__Group_6__4__Impl12669); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAtomicExprAccess().getEqualsSignKeyword_6_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AtomicExpr__Group_6__4__Impl"


    // $ANTLR start "rule__AtomicExpr__Group_6__5"
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6355:1: rule__AtomicExpr__Group_6__5 : rule__AtomicExpr__Group_6__5__Impl rule__AtomicExpr__Group_6__6 ;
    public final void rule__AtomicExpr__Group_6__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6359:1: ( rule__AtomicExpr__Group_6__5__Impl rule__AtomicExpr__Group_6__6 )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6360:2: rule__AtomicExpr__Group_6__5__Impl rule__AtomicExpr__Group_6__6
            {
            pushFollow(FOLLOW_rule__AtomicExpr__Group_6__5__Impl_in_rule__AtomicExpr__Group_6__512700);
            rule__AtomicExpr__Group_6__5__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__AtomicExpr__Group_6__6_in_rule__AtomicExpr__Group_6__512703);
            rule__AtomicExpr__Group_6__6();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AtomicExpr__Group_6__5"


    // $ANTLR start "rule__AtomicExpr__Group_6__5__Impl"
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6367:1: rule__AtomicExpr__Group_6__5__Impl : ( ( rule__AtomicExpr__ExprsAssignment_6_5 ) ) ;
    public final void rule__AtomicExpr__Group_6__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6371:1: ( ( ( rule__AtomicExpr__ExprsAssignment_6_5 ) ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6372:1: ( ( rule__AtomicExpr__ExprsAssignment_6_5 ) )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6372:1: ( ( rule__AtomicExpr__ExprsAssignment_6_5 ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6373:1: ( rule__AtomicExpr__ExprsAssignment_6_5 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAtomicExprAccess().getExprsAssignment_6_5()); 
            }
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6374:1: ( rule__AtomicExpr__ExprsAssignment_6_5 )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6374:2: rule__AtomicExpr__ExprsAssignment_6_5
            {
            pushFollow(FOLLOW_rule__AtomicExpr__ExprsAssignment_6_5_in_rule__AtomicExpr__Group_6__5__Impl12730);
            rule__AtomicExpr__ExprsAssignment_6_5();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAtomicExprAccess().getExprsAssignment_6_5()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AtomicExpr__Group_6__5__Impl"


    // $ANTLR start "rule__AtomicExpr__Group_6__6"
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6384:1: rule__AtomicExpr__Group_6__6 : rule__AtomicExpr__Group_6__6__Impl rule__AtomicExpr__Group_6__7 ;
    public final void rule__AtomicExpr__Group_6__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6388:1: ( rule__AtomicExpr__Group_6__6__Impl rule__AtomicExpr__Group_6__7 )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6389:2: rule__AtomicExpr__Group_6__6__Impl rule__AtomicExpr__Group_6__7
            {
            pushFollow(FOLLOW_rule__AtomicExpr__Group_6__6__Impl_in_rule__AtomicExpr__Group_6__612760);
            rule__AtomicExpr__Group_6__6__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__AtomicExpr__Group_6__7_in_rule__AtomicExpr__Group_6__612763);
            rule__AtomicExpr__Group_6__7();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AtomicExpr__Group_6__6"


    // $ANTLR start "rule__AtomicExpr__Group_6__6__Impl"
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6396:1: rule__AtomicExpr__Group_6__6__Impl : ( ( rule__AtomicExpr__Group_6_6__0 )* ) ;
    public final void rule__AtomicExpr__Group_6__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6400:1: ( ( ( rule__AtomicExpr__Group_6_6__0 )* ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6401:1: ( ( rule__AtomicExpr__Group_6_6__0 )* )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6401:1: ( ( rule__AtomicExpr__Group_6_6__0 )* )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6402:1: ( rule__AtomicExpr__Group_6_6__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAtomicExprAccess().getGroup_6_6()); 
            }
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6403:1: ( rule__AtomicExpr__Group_6_6__0 )*
            loop35:
            do {
                int alt35=2;
                int LA35_0 = input.LA(1);

                if ( (LA35_0==28) ) {
                    alt35=1;
                }


                switch (alt35) {
            	case 1 :
            	    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6403:2: rule__AtomicExpr__Group_6_6__0
            	    {
            	    pushFollow(FOLLOW_rule__AtomicExpr__Group_6_6__0_in_rule__AtomicExpr__Group_6__6__Impl12790);
            	    rule__AtomicExpr__Group_6_6__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop35;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAtomicExprAccess().getGroup_6_6()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AtomicExpr__Group_6__6__Impl"


    // $ANTLR start "rule__AtomicExpr__Group_6__7"
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6413:1: rule__AtomicExpr__Group_6__7 : rule__AtomicExpr__Group_6__7__Impl ;
    public final void rule__AtomicExpr__Group_6__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6417:1: ( rule__AtomicExpr__Group_6__7__Impl )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6418:2: rule__AtomicExpr__Group_6__7__Impl
            {
            pushFollow(FOLLOW_rule__AtomicExpr__Group_6__7__Impl_in_rule__AtomicExpr__Group_6__712821);
            rule__AtomicExpr__Group_6__7__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AtomicExpr__Group_6__7"


    // $ANTLR start "rule__AtomicExpr__Group_6__7__Impl"
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6424:1: rule__AtomicExpr__Group_6__7__Impl : ( '}' ) ;
    public final void rule__AtomicExpr__Group_6__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6428:1: ( ( '}' ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6429:1: ( '}' )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6429:1: ( '}' )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6430:1: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAtomicExprAccess().getRightCurlyBracketKeyword_6_7()); 
            }
            match(input,32,FOLLOW_32_in_rule__AtomicExpr__Group_6__7__Impl12849); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAtomicExprAccess().getRightCurlyBracketKeyword_6_7()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AtomicExpr__Group_6__7__Impl"


    // $ANTLR start "rule__AtomicExpr__Group_6_6__0"
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6459:1: rule__AtomicExpr__Group_6_6__0 : rule__AtomicExpr__Group_6_6__0__Impl rule__AtomicExpr__Group_6_6__1 ;
    public final void rule__AtomicExpr__Group_6_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6463:1: ( rule__AtomicExpr__Group_6_6__0__Impl rule__AtomicExpr__Group_6_6__1 )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6464:2: rule__AtomicExpr__Group_6_6__0__Impl rule__AtomicExpr__Group_6_6__1
            {
            pushFollow(FOLLOW_rule__AtomicExpr__Group_6_6__0__Impl_in_rule__AtomicExpr__Group_6_6__012896);
            rule__AtomicExpr__Group_6_6__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__AtomicExpr__Group_6_6__1_in_rule__AtomicExpr__Group_6_6__012899);
            rule__AtomicExpr__Group_6_6__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AtomicExpr__Group_6_6__0"


    // $ANTLR start "rule__AtomicExpr__Group_6_6__0__Impl"
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6471:1: rule__AtomicExpr__Group_6_6__0__Impl : ( ';' ) ;
    public final void rule__AtomicExpr__Group_6_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6475:1: ( ( ';' ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6476:1: ( ';' )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6476:1: ( ';' )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6477:1: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAtomicExprAccess().getSemicolonKeyword_6_6_0()); 
            }
            match(input,28,FOLLOW_28_in_rule__AtomicExpr__Group_6_6__0__Impl12927); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAtomicExprAccess().getSemicolonKeyword_6_6_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AtomicExpr__Group_6_6__0__Impl"


    // $ANTLR start "rule__AtomicExpr__Group_6_6__1"
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6490:1: rule__AtomicExpr__Group_6_6__1 : rule__AtomicExpr__Group_6_6__1__Impl rule__AtomicExpr__Group_6_6__2 ;
    public final void rule__AtomicExpr__Group_6_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6494:1: ( rule__AtomicExpr__Group_6_6__1__Impl rule__AtomicExpr__Group_6_6__2 )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6495:2: rule__AtomicExpr__Group_6_6__1__Impl rule__AtomicExpr__Group_6_6__2
            {
            pushFollow(FOLLOW_rule__AtomicExpr__Group_6_6__1__Impl_in_rule__AtomicExpr__Group_6_6__112958);
            rule__AtomicExpr__Group_6_6__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__AtomicExpr__Group_6_6__2_in_rule__AtomicExpr__Group_6_6__112961);
            rule__AtomicExpr__Group_6_6__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AtomicExpr__Group_6_6__1"


    // $ANTLR start "rule__AtomicExpr__Group_6_6__1__Impl"
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6502:1: rule__AtomicExpr__Group_6_6__1__Impl : ( ( rule__AtomicExpr__FieldsAssignment_6_6_1 ) ) ;
    public final void rule__AtomicExpr__Group_6_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6506:1: ( ( ( rule__AtomicExpr__FieldsAssignment_6_6_1 ) ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6507:1: ( ( rule__AtomicExpr__FieldsAssignment_6_6_1 ) )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6507:1: ( ( rule__AtomicExpr__FieldsAssignment_6_6_1 ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6508:1: ( rule__AtomicExpr__FieldsAssignment_6_6_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAtomicExprAccess().getFieldsAssignment_6_6_1()); 
            }
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6509:1: ( rule__AtomicExpr__FieldsAssignment_6_6_1 )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6509:2: rule__AtomicExpr__FieldsAssignment_6_6_1
            {
            pushFollow(FOLLOW_rule__AtomicExpr__FieldsAssignment_6_6_1_in_rule__AtomicExpr__Group_6_6__1__Impl12988);
            rule__AtomicExpr__FieldsAssignment_6_6_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAtomicExprAccess().getFieldsAssignment_6_6_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AtomicExpr__Group_6_6__1__Impl"


    // $ANTLR start "rule__AtomicExpr__Group_6_6__2"
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6519:1: rule__AtomicExpr__Group_6_6__2 : rule__AtomicExpr__Group_6_6__2__Impl rule__AtomicExpr__Group_6_6__3 ;
    public final void rule__AtomicExpr__Group_6_6__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6523:1: ( rule__AtomicExpr__Group_6_6__2__Impl rule__AtomicExpr__Group_6_6__3 )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6524:2: rule__AtomicExpr__Group_6_6__2__Impl rule__AtomicExpr__Group_6_6__3
            {
            pushFollow(FOLLOW_rule__AtomicExpr__Group_6_6__2__Impl_in_rule__AtomicExpr__Group_6_6__213018);
            rule__AtomicExpr__Group_6_6__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__AtomicExpr__Group_6_6__3_in_rule__AtomicExpr__Group_6_6__213021);
            rule__AtomicExpr__Group_6_6__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AtomicExpr__Group_6_6__2"


    // $ANTLR start "rule__AtomicExpr__Group_6_6__2__Impl"
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6531:1: rule__AtomicExpr__Group_6_6__2__Impl : ( '=' ) ;
    public final void rule__AtomicExpr__Group_6_6__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6535:1: ( ( '=' ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6536:1: ( '=' )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6536:1: ( '=' )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6537:1: '='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAtomicExprAccess().getEqualsSignKeyword_6_6_2()); 
            }
            match(input,18,FOLLOW_18_in_rule__AtomicExpr__Group_6_6__2__Impl13049); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAtomicExprAccess().getEqualsSignKeyword_6_6_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AtomicExpr__Group_6_6__2__Impl"


    // $ANTLR start "rule__AtomicExpr__Group_6_6__3"
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6550:1: rule__AtomicExpr__Group_6_6__3 : rule__AtomicExpr__Group_6_6__3__Impl ;
    public final void rule__AtomicExpr__Group_6_6__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6554:1: ( rule__AtomicExpr__Group_6_6__3__Impl )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6555:2: rule__AtomicExpr__Group_6_6__3__Impl
            {
            pushFollow(FOLLOW_rule__AtomicExpr__Group_6_6__3__Impl_in_rule__AtomicExpr__Group_6_6__313080);
            rule__AtomicExpr__Group_6_6__3__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AtomicExpr__Group_6_6__3"


    // $ANTLR start "rule__AtomicExpr__Group_6_6__3__Impl"
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6561:1: rule__AtomicExpr__Group_6_6__3__Impl : ( ( rule__AtomicExpr__ExprsAssignment_6_6_3 ) ) ;
    public final void rule__AtomicExpr__Group_6_6__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6565:1: ( ( ( rule__AtomicExpr__ExprsAssignment_6_6_3 ) ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6566:1: ( ( rule__AtomicExpr__ExprsAssignment_6_6_3 ) )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6566:1: ( ( rule__AtomicExpr__ExprsAssignment_6_6_3 ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6567:1: ( rule__AtomicExpr__ExprsAssignment_6_6_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAtomicExprAccess().getExprsAssignment_6_6_3()); 
            }
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6568:1: ( rule__AtomicExpr__ExprsAssignment_6_6_3 )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6568:2: rule__AtomicExpr__ExprsAssignment_6_6_3
            {
            pushFollow(FOLLOW_rule__AtomicExpr__ExprsAssignment_6_6_3_in_rule__AtomicExpr__Group_6_6__3__Impl13107);
            rule__AtomicExpr__ExprsAssignment_6_6_3();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAtomicExprAccess().getExprsAssignment_6_6_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AtomicExpr__Group_6_6__3__Impl"


    // $ANTLR start "rule__AtomicExpr__Group_7__0"
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6586:1: rule__AtomicExpr__Group_7__0 : rule__AtomicExpr__Group_7__0__Impl rule__AtomicExpr__Group_7__1 ;
    public final void rule__AtomicExpr__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6590:1: ( rule__AtomicExpr__Group_7__0__Impl rule__AtomicExpr__Group_7__1 )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6591:2: rule__AtomicExpr__Group_7__0__Impl rule__AtomicExpr__Group_7__1
            {
            pushFollow(FOLLOW_rule__AtomicExpr__Group_7__0__Impl_in_rule__AtomicExpr__Group_7__013145);
            rule__AtomicExpr__Group_7__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__AtomicExpr__Group_7__1_in_rule__AtomicExpr__Group_7__013148);
            rule__AtomicExpr__Group_7__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AtomicExpr__Group_7__0"


    // $ANTLR start "rule__AtomicExpr__Group_7__0__Impl"
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6598:1: rule__AtomicExpr__Group_7__0__Impl : ( '(' ) ;
    public final void rule__AtomicExpr__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6602:1: ( ( '(' ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6603:1: ( '(' )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6603:1: ( '(' )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6604:1: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAtomicExprAccess().getLeftParenthesisKeyword_7_0()); 
            }
            match(input,43,FOLLOW_43_in_rule__AtomicExpr__Group_7__0__Impl13176); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAtomicExprAccess().getLeftParenthesisKeyword_7_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AtomicExpr__Group_7__0__Impl"


    // $ANTLR start "rule__AtomicExpr__Group_7__1"
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6617:1: rule__AtomicExpr__Group_7__1 : rule__AtomicExpr__Group_7__1__Impl rule__AtomicExpr__Group_7__2 ;
    public final void rule__AtomicExpr__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6621:1: ( rule__AtomicExpr__Group_7__1__Impl rule__AtomicExpr__Group_7__2 )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6622:2: rule__AtomicExpr__Group_7__1__Impl rule__AtomicExpr__Group_7__2
            {
            pushFollow(FOLLOW_rule__AtomicExpr__Group_7__1__Impl_in_rule__AtomicExpr__Group_7__113207);
            rule__AtomicExpr__Group_7__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__AtomicExpr__Group_7__2_in_rule__AtomicExpr__Group_7__113210);
            rule__AtomicExpr__Group_7__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AtomicExpr__Group_7__1"


    // $ANTLR start "rule__AtomicExpr__Group_7__1__Impl"
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6629:1: rule__AtomicExpr__Group_7__1__Impl : ( ruleExpr ) ;
    public final void rule__AtomicExpr__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6633:1: ( ( ruleExpr ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6634:1: ( ruleExpr )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6634:1: ( ruleExpr )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6635:1: ruleExpr
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAtomicExprAccess().getExprParserRuleCall_7_1()); 
            }
            pushFollow(FOLLOW_ruleExpr_in_rule__AtomicExpr__Group_7__1__Impl13237);
            ruleExpr();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAtomicExprAccess().getExprParserRuleCall_7_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AtomicExpr__Group_7__1__Impl"


    // $ANTLR start "rule__AtomicExpr__Group_7__2"
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6646:1: rule__AtomicExpr__Group_7__2 : rule__AtomicExpr__Group_7__2__Impl ;
    public final void rule__AtomicExpr__Group_7__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6650:1: ( rule__AtomicExpr__Group_7__2__Impl )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6651:2: rule__AtomicExpr__Group_7__2__Impl
            {
            pushFollow(FOLLOW_rule__AtomicExpr__Group_7__2__Impl_in_rule__AtomicExpr__Group_7__213266);
            rule__AtomicExpr__Group_7__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AtomicExpr__Group_7__2"


    // $ANTLR start "rule__AtomicExpr__Group_7__2__Impl"
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6657:1: rule__AtomicExpr__Group_7__2__Impl : ( ')' ) ;
    public final void rule__AtomicExpr__Group_7__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6661:1: ( ( ')' ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6662:1: ( ')' )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6662:1: ( ')' )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6663:1: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAtomicExprAccess().getRightParenthesisKeyword_7_2()); 
            }
            match(input,44,FOLLOW_44_in_rule__AtomicExpr__Group_7__2__Impl13294); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAtomicExprAccess().getRightParenthesisKeyword_7_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AtomicExpr__Group_7__2__Impl"


    // $ANTLR start "rule__REAL__Group__0"
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6682:1: rule__REAL__Group__0 : rule__REAL__Group__0__Impl rule__REAL__Group__1 ;
    public final void rule__REAL__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6686:1: ( rule__REAL__Group__0__Impl rule__REAL__Group__1 )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6687:2: rule__REAL__Group__0__Impl rule__REAL__Group__1
            {
            pushFollow(FOLLOW_rule__REAL__Group__0__Impl_in_rule__REAL__Group__013331);
            rule__REAL__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__REAL__Group__1_in_rule__REAL__Group__013334);
            rule__REAL__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__REAL__Group__0"


    // $ANTLR start "rule__REAL__Group__0__Impl"
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6694:1: rule__REAL__Group__0__Impl : ( RULE_INT ) ;
    public final void rule__REAL__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6698:1: ( ( RULE_INT ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6699:1: ( RULE_INT )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6699:1: ( RULE_INT )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6700:1: RULE_INT
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getREALAccess().getINTTerminalRuleCall_0()); 
            }
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__REAL__Group__0__Impl13361); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getREALAccess().getINTTerminalRuleCall_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__REAL__Group__0__Impl"


    // $ANTLR start "rule__REAL__Group__1"
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6711:1: rule__REAL__Group__1 : rule__REAL__Group__1__Impl rule__REAL__Group__2 ;
    public final void rule__REAL__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6715:1: ( rule__REAL__Group__1__Impl rule__REAL__Group__2 )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6716:2: rule__REAL__Group__1__Impl rule__REAL__Group__2
            {
            pushFollow(FOLLOW_rule__REAL__Group__1__Impl_in_rule__REAL__Group__113390);
            rule__REAL__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__REAL__Group__2_in_rule__REAL__Group__113393);
            rule__REAL__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__REAL__Group__1"


    // $ANTLR start "rule__REAL__Group__1__Impl"
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6723:1: rule__REAL__Group__1__Impl : ( '.' ) ;
    public final void rule__REAL__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6727:1: ( ( '.' ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6728:1: ( '.' )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6728:1: ( '.' )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6729:1: '.'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getREALAccess().getFullStopKeyword_1()); 
            }
            match(input,55,FOLLOW_55_in_rule__REAL__Group__1__Impl13421); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getREALAccess().getFullStopKeyword_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__REAL__Group__1__Impl"


    // $ANTLR start "rule__REAL__Group__2"
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6742:1: rule__REAL__Group__2 : rule__REAL__Group__2__Impl ;
    public final void rule__REAL__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6746:1: ( rule__REAL__Group__2__Impl )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6747:2: rule__REAL__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__REAL__Group__2__Impl_in_rule__REAL__Group__213452);
            rule__REAL__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__REAL__Group__2"


    // $ANTLR start "rule__REAL__Group__2__Impl"
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6753:1: rule__REAL__Group__2__Impl : ( RULE_INT ) ;
    public final void rule__REAL__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6757:1: ( ( RULE_INT ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6758:1: ( RULE_INT )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6758:1: ( RULE_INT )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6759:1: RULE_INT
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getREALAccess().getINTTerminalRuleCall_2()); 
            }
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__REAL__Group__2__Impl13479); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getREALAccess().getINTTerminalRuleCall_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__REAL__Group__2__Impl"


    // $ANTLR start "rule__File__TypedefsAssignment_0"
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6777:1: rule__File__TypedefsAssignment_0 : ( ruleTypedef ) ;
    public final void rule__File__TypedefsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6781:1: ( ( ruleTypedef ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6782:1: ( ruleTypedef )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6782:1: ( ruleTypedef )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6783:1: ruleTypedef
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFileAccess().getTypedefsTypedefParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_ruleTypedef_in_rule__File__TypedefsAssignment_013519);
            ruleTypedef();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFileAccess().getTypedefsTypedefParserRuleCall_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__File__TypedefsAssignment_0"


    // $ANTLR start "rule__File__ConstantsAssignment_1"
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6792:1: rule__File__ConstantsAssignment_1 : ( ruleConstant ) ;
    public final void rule__File__ConstantsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6796:1: ( ( ruleConstant ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6797:1: ( ruleConstant )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6797:1: ( ruleConstant )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6798:1: ruleConstant
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFileAccess().getConstantsConstantParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_ruleConstant_in_rule__File__ConstantsAssignment_113550);
            ruleConstant();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFileAccess().getConstantsConstantParserRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__File__ConstantsAssignment_1"


    // $ANTLR start "rule__File__NodesAssignment_2"
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6807:1: rule__File__NodesAssignment_2 : ( ruleNode ) ;
    public final void rule__File__NodesAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6811:1: ( ( ruleNode ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6812:1: ( ruleNode )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6812:1: ( ruleNode )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6813:1: ruleNode
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFileAccess().getNodesNodeParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_ruleNode_in_rule__File__NodesAssignment_213581);
            ruleNode();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFileAccess().getNodesNodeParserRuleCall_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__File__NodesAssignment_2"


    // $ANTLR start "rule__Typedef__NameAssignment_1"
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6822:1: rule__Typedef__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Typedef__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6826:1: ( ( RULE_ID ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6827:1: ( RULE_ID )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6827:1: ( RULE_ID )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6828:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypedefAccess().getNameIDTerminalRuleCall_1_0()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Typedef__NameAssignment_113612); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTypedefAccess().getNameIDTerminalRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Typedef__NameAssignment_1"


    // $ANTLR start "rule__Typedef__TypeAssignment_3"
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6837:1: rule__Typedef__TypeAssignment_3 : ( ruleTopLevelType ) ;
    public final void rule__Typedef__TypeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6841:1: ( ( ruleTopLevelType ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6842:1: ( ruleTopLevelType )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6842:1: ( ruleTopLevelType )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6843:1: ruleTopLevelType
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypedefAccess().getTypeTopLevelTypeParserRuleCall_3_0()); 
            }
            pushFollow(FOLLOW_ruleTopLevelType_in_rule__Typedef__TypeAssignment_313643);
            ruleTopLevelType();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTypedefAccess().getTypeTopLevelTypeParserRuleCall_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Typedef__TypeAssignment_3"


    // $ANTLR start "rule__TopLevelType__FieldsAssignment_0_3"
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6852:1: rule__TopLevelType__FieldsAssignment_0_3 : ( RULE_ID ) ;
    public final void rule__TopLevelType__FieldsAssignment_0_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6856:1: ( ( RULE_ID ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6857:1: ( RULE_ID )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6857:1: ( RULE_ID )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6858:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTopLevelTypeAccess().getFieldsIDTerminalRuleCall_0_3_0()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__TopLevelType__FieldsAssignment_0_313674); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTopLevelTypeAccess().getFieldsIDTerminalRuleCall_0_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TopLevelType__FieldsAssignment_0_3"


    // $ANTLR start "rule__TopLevelType__TypesAssignment_0_5"
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6867:1: rule__TopLevelType__TypesAssignment_0_5 : ( ( RULE_ID ) ) ;
    public final void rule__TopLevelType__TypesAssignment_0_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6871:1: ( ( ( RULE_ID ) ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6872:1: ( ( RULE_ID ) )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6872:1: ( ( RULE_ID ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6873:1: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTopLevelTypeAccess().getTypesTypeCrossReference_0_5_0()); 
            }
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6874:1: ( RULE_ID )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6875:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTopLevelTypeAccess().getTypesTypeIDTerminalRuleCall_0_5_0_1()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__TopLevelType__TypesAssignment_0_513709); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTopLevelTypeAccess().getTypesTypeIDTerminalRuleCall_0_5_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTopLevelTypeAccess().getTypesTypeCrossReference_0_5_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TopLevelType__TypesAssignment_0_5"


    // $ANTLR start "rule__TopLevelType__FieldsAssignment_0_6_1"
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6886:1: rule__TopLevelType__FieldsAssignment_0_6_1 : ( RULE_ID ) ;
    public final void rule__TopLevelType__FieldsAssignment_0_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6890:1: ( ( RULE_ID ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6891:1: ( RULE_ID )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6891:1: ( RULE_ID )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6892:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTopLevelTypeAccess().getFieldsIDTerminalRuleCall_0_6_1_0()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__TopLevelType__FieldsAssignment_0_6_113744); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTopLevelTypeAccess().getFieldsIDTerminalRuleCall_0_6_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TopLevelType__FieldsAssignment_0_6_1"


    // $ANTLR start "rule__TopLevelType__TypesAssignment_0_6_3"
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6901:1: rule__TopLevelType__TypesAssignment_0_6_3 : ( ( RULE_ID ) ) ;
    public final void rule__TopLevelType__TypesAssignment_0_6_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6905:1: ( ( ( RULE_ID ) ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6906:1: ( ( RULE_ID ) )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6906:1: ( ( RULE_ID ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6907:1: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTopLevelTypeAccess().getTypesTypeCrossReference_0_6_3_0()); 
            }
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6908:1: ( RULE_ID )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6909:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTopLevelTypeAccess().getTypesTypeIDTerminalRuleCall_0_6_3_0_1()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__TopLevelType__TypesAssignment_0_6_313779); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTopLevelTypeAccess().getTypesTypeIDTerminalRuleCall_0_6_3_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTopLevelTypeAccess().getTypesTypeCrossReference_0_6_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TopLevelType__TypesAssignment_0_6_3"


    // $ANTLR start "rule__Type__LowAssignment_3_3"
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6920:1: rule__Type__LowAssignment_3_3 : ( ruleBound ) ;
    public final void rule__Type__LowAssignment_3_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6924:1: ( ( ruleBound ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6925:1: ( ruleBound )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6925:1: ( ruleBound )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6926:1: ruleBound
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypeAccess().getLowBoundParserRuleCall_3_3_0()); 
            }
            pushFollow(FOLLOW_ruleBound_in_rule__Type__LowAssignment_3_313814);
            ruleBound();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTypeAccess().getLowBoundParserRuleCall_3_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__LowAssignment_3_3"


    // $ANTLR start "rule__Type__HighAssignment_3_5"
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6935:1: rule__Type__HighAssignment_3_5 : ( ruleBound ) ;
    public final void rule__Type__HighAssignment_3_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6939:1: ( ( ruleBound ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6940:1: ( ruleBound )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6940:1: ( ruleBound )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6941:1: ruleBound
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypeAccess().getHighBoundParserRuleCall_3_5_0()); 
            }
            pushFollow(FOLLOW_ruleBound_in_rule__Type__HighAssignment_3_513845);
            ruleBound();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTypeAccess().getHighBoundParserRuleCall_3_5_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__HighAssignment_3_5"


    // $ANTLR start "rule__Type__DefAssignment_4_1"
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6950:1: rule__Type__DefAssignment_4_1 : ( ( RULE_ID ) ) ;
    public final void rule__Type__DefAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6954:1: ( ( ( RULE_ID ) ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6955:1: ( ( RULE_ID ) )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6955:1: ( ( RULE_ID ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6956:1: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypeAccess().getDefTypedefCrossReference_4_1_0()); 
            }
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6957:1: ( RULE_ID )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6958:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypeAccess().getDefTypedefIDTerminalRuleCall_4_1_0_1()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Type__DefAssignment_4_113880); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTypeAccess().getDefTypedefIDTerminalRuleCall_4_1_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTypeAccess().getDefTypedefCrossReference_4_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__DefAssignment_4_1"


    // $ANTLR start "rule__Constant__NameAssignment_1"
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6969:1: rule__Constant__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Constant__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6973:1: ( ( RULE_ID ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6974:1: ( RULE_ID )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6974:1: ( RULE_ID )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6975:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConstantAccess().getNameIDTerminalRuleCall_1_0()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Constant__NameAssignment_113915); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getConstantAccess().getNameIDTerminalRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constant__NameAssignment_1"


    // $ANTLR start "rule__Constant__TypeAssignment_2_1"
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6984:1: rule__Constant__TypeAssignment_2_1 : ( ruleType ) ;
    public final void rule__Constant__TypeAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6988:1: ( ( ruleType ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6989:1: ( ruleType )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6989:1: ( ruleType )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6990:1: ruleType
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConstantAccess().getTypeTypeParserRuleCall_2_1_0()); 
            }
            pushFollow(FOLLOW_ruleType_in_rule__Constant__TypeAssignment_2_113946);
            ruleType();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getConstantAccess().getTypeTypeParserRuleCall_2_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constant__TypeAssignment_2_1"


    // $ANTLR start "rule__Constant__ExprAssignment_4"
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6999:1: rule__Constant__ExprAssignment_4 : ( ruleExpr ) ;
    public final void rule__Constant__ExprAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7003:1: ( ( ruleExpr ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7004:1: ( ruleExpr )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7004:1: ( ruleExpr )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7005:1: ruleExpr
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConstantAccess().getExprExprParserRuleCall_4_0()); 
            }
            pushFollow(FOLLOW_ruleExpr_in_rule__Constant__ExprAssignment_413977);
            ruleExpr();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getConstantAccess().getExprExprParserRuleCall_4_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constant__ExprAssignment_4"


    // $ANTLR start "rule__Node__NameAssignment_1"
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7014:1: rule__Node__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Node__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7018:1: ( ( RULE_ID ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7019:1: ( RULE_ID )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7019:1: ( RULE_ID )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7020:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNodeAccess().getNameIDTerminalRuleCall_1_0()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Node__NameAssignment_114008); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getNodeAccess().getNameIDTerminalRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Node__NameAssignment_1"


    // $ANTLR start "rule__Node__InputsAssignment_3_0"
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7029:1: rule__Node__InputsAssignment_3_0 : ( ruleVarGroup ) ;
    public final void rule__Node__InputsAssignment_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7033:1: ( ( ruleVarGroup ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7034:1: ( ruleVarGroup )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7034:1: ( ruleVarGroup )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7035:1: ruleVarGroup
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNodeAccess().getInputsVarGroupParserRuleCall_3_0_0()); 
            }
            pushFollow(FOLLOW_ruleVarGroup_in_rule__Node__InputsAssignment_3_014039);
            ruleVarGroup();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getNodeAccess().getInputsVarGroupParserRuleCall_3_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Node__InputsAssignment_3_0"


    // $ANTLR start "rule__Node__InputsAssignment_3_1_1"
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7044:1: rule__Node__InputsAssignment_3_1_1 : ( ruleVarGroup ) ;
    public final void rule__Node__InputsAssignment_3_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7048:1: ( ( ruleVarGroup ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7049:1: ( ruleVarGroup )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7049:1: ( ruleVarGroup )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7050:1: ruleVarGroup
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNodeAccess().getInputsVarGroupParserRuleCall_3_1_1_0()); 
            }
            pushFollow(FOLLOW_ruleVarGroup_in_rule__Node__InputsAssignment_3_1_114070);
            ruleVarGroup();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getNodeAccess().getInputsVarGroupParserRuleCall_3_1_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Node__InputsAssignment_3_1_1"


    // $ANTLR start "rule__Node__OutputsAssignment_7_0"
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7059:1: rule__Node__OutputsAssignment_7_0 : ( ruleVarGroup ) ;
    public final void rule__Node__OutputsAssignment_7_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7063:1: ( ( ruleVarGroup ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7064:1: ( ruleVarGroup )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7064:1: ( ruleVarGroup )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7065:1: ruleVarGroup
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNodeAccess().getOutputsVarGroupParserRuleCall_7_0_0()); 
            }
            pushFollow(FOLLOW_ruleVarGroup_in_rule__Node__OutputsAssignment_7_014101);
            ruleVarGroup();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getNodeAccess().getOutputsVarGroupParserRuleCall_7_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Node__OutputsAssignment_7_0"


    // $ANTLR start "rule__Node__OutputsAssignment_7_1_1"
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7074:1: rule__Node__OutputsAssignment_7_1_1 : ( ruleVarGroup ) ;
    public final void rule__Node__OutputsAssignment_7_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7078:1: ( ( ruleVarGroup ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7079:1: ( ruleVarGroup )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7079:1: ( ruleVarGroup )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7080:1: ruleVarGroup
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNodeAccess().getOutputsVarGroupParserRuleCall_7_1_1_0()); 
            }
            pushFollow(FOLLOW_ruleVarGroup_in_rule__Node__OutputsAssignment_7_1_114132);
            ruleVarGroup();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getNodeAccess().getOutputsVarGroupParserRuleCall_7_1_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Node__OutputsAssignment_7_1_1"


    // $ANTLR start "rule__Node__LocalsAssignment_10_1_0"
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7089:1: rule__Node__LocalsAssignment_10_1_0 : ( ruleVarGroup ) ;
    public final void rule__Node__LocalsAssignment_10_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7093:1: ( ( ruleVarGroup ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7094:1: ( ruleVarGroup )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7094:1: ( ruleVarGroup )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7095:1: ruleVarGroup
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNodeAccess().getLocalsVarGroupParserRuleCall_10_1_0_0()); 
            }
            pushFollow(FOLLOW_ruleVarGroup_in_rule__Node__LocalsAssignment_10_1_014163);
            ruleVarGroup();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getNodeAccess().getLocalsVarGroupParserRuleCall_10_1_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Node__LocalsAssignment_10_1_0"


    // $ANTLR start "rule__Node__EquationsAssignment_12_0"
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7104:1: rule__Node__EquationsAssignment_12_0 : ( ruleEquation ) ;
    public final void rule__Node__EquationsAssignment_12_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7108:1: ( ( ruleEquation ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7109:1: ( ruleEquation )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7109:1: ( ruleEquation )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7110:1: ruleEquation
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNodeAccess().getEquationsEquationParserRuleCall_12_0_0()); 
            }
            pushFollow(FOLLOW_ruleEquation_in_rule__Node__EquationsAssignment_12_014194);
            ruleEquation();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getNodeAccess().getEquationsEquationParserRuleCall_12_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Node__EquationsAssignment_12_0"


    // $ANTLR start "rule__Node__PropertiesAssignment_12_1"
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7119:1: rule__Node__PropertiesAssignment_12_1 : ( ruleProperty ) ;
    public final void rule__Node__PropertiesAssignment_12_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7123:1: ( ( ruleProperty ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7124:1: ( ruleProperty )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7124:1: ( ruleProperty )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7125:1: ruleProperty
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNodeAccess().getPropertiesPropertyParserRuleCall_12_1_0()); 
            }
            pushFollow(FOLLOW_ruleProperty_in_rule__Node__PropertiesAssignment_12_114225);
            ruleProperty();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getNodeAccess().getPropertiesPropertyParserRuleCall_12_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Node__PropertiesAssignment_12_1"


    // $ANTLR start "rule__Node__AssertionsAssignment_12_2"
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7134:1: rule__Node__AssertionsAssignment_12_2 : ( ruleAssertion ) ;
    public final void rule__Node__AssertionsAssignment_12_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7138:1: ( ( ruleAssertion ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7139:1: ( ruleAssertion )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7139:1: ( ruleAssertion )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7140:1: ruleAssertion
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNodeAccess().getAssertionsAssertionParserRuleCall_12_2_0()); 
            }
            pushFollow(FOLLOW_ruleAssertion_in_rule__Node__AssertionsAssignment_12_214256);
            ruleAssertion();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getNodeAccess().getAssertionsAssertionParserRuleCall_12_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Node__AssertionsAssignment_12_2"


    // $ANTLR start "rule__Node__MainAssignment_12_3"
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7149:1: rule__Node__MainAssignment_12_3 : ( ruleMain ) ;
    public final void rule__Node__MainAssignment_12_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7153:1: ( ( ruleMain ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7154:1: ( ruleMain )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7154:1: ( ruleMain )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7155:1: ruleMain
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNodeAccess().getMainMainParserRuleCall_12_3_0()); 
            }
            pushFollow(FOLLOW_ruleMain_in_rule__Node__MainAssignment_12_314287);
            ruleMain();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getNodeAccess().getMainMainParserRuleCall_12_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Node__MainAssignment_12_3"


    // $ANTLR start "rule__VarGroup__VarsAssignment_0"
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7164:1: rule__VarGroup__VarsAssignment_0 : ( ruleVar ) ;
    public final void rule__VarGroup__VarsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7168:1: ( ( ruleVar ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7169:1: ( ruleVar )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7169:1: ( ruleVar )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7170:1: ruleVar
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVarGroupAccess().getVarsVarParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_ruleVar_in_rule__VarGroup__VarsAssignment_014318);
            ruleVar();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getVarGroupAccess().getVarsVarParserRuleCall_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VarGroup__VarsAssignment_0"


    // $ANTLR start "rule__VarGroup__VarsAssignment_1_1"
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7179:1: rule__VarGroup__VarsAssignment_1_1 : ( ruleVar ) ;
    public final void rule__VarGroup__VarsAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7183:1: ( ( ruleVar ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7184:1: ( ruleVar )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7184:1: ( ruleVar )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7185:1: ruleVar
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVarGroupAccess().getVarsVarParserRuleCall_1_1_0()); 
            }
            pushFollow(FOLLOW_ruleVar_in_rule__VarGroup__VarsAssignment_1_114349);
            ruleVar();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getVarGroupAccess().getVarsVarParserRuleCall_1_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VarGroup__VarsAssignment_1_1"


    // $ANTLR start "rule__VarGroup__TypeAssignment_3"
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7194:1: rule__VarGroup__TypeAssignment_3 : ( ruleType ) ;
    public final void rule__VarGroup__TypeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7198:1: ( ( ruleType ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7199:1: ( ruleType )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7199:1: ( ruleType )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7200:1: ruleType
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVarGroupAccess().getTypeTypeParserRuleCall_3_0()); 
            }
            pushFollow(FOLLOW_ruleType_in_rule__VarGroup__TypeAssignment_314380);
            ruleType();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getVarGroupAccess().getTypeTypeParserRuleCall_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VarGroup__TypeAssignment_3"


    // $ANTLR start "rule__Var__NameAssignment"
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7209:1: rule__Var__NameAssignment : ( RULE_ID ) ;
    public final void rule__Var__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7213:1: ( ( RULE_ID ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7214:1: ( RULE_ID )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7214:1: ( RULE_ID )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7215:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVarAccess().getNameIDTerminalRuleCall_0()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Var__NameAssignment14411); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getVarAccess().getNameIDTerminalRuleCall_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Var__NameAssignment"


    // $ANTLR start "rule__Equation__LhsAssignment_0"
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7224:1: rule__Equation__LhsAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__Equation__LhsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7228:1: ( ( ( RULE_ID ) ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7229:1: ( ( RULE_ID ) )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7229:1: ( ( RULE_ID ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7230:1: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEquationAccess().getLhsVarCrossReference_0_0()); 
            }
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7231:1: ( RULE_ID )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7232:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEquationAccess().getLhsVarIDTerminalRuleCall_0_0_1()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Equation__LhsAssignment_014446); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEquationAccess().getLhsVarIDTerminalRuleCall_0_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEquationAccess().getLhsVarCrossReference_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Equation__LhsAssignment_0"


    // $ANTLR start "rule__Equation__LhsAssignment_1_1"
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7243:1: rule__Equation__LhsAssignment_1_1 : ( ( RULE_ID ) ) ;
    public final void rule__Equation__LhsAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7247:1: ( ( ( RULE_ID ) ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7248:1: ( ( RULE_ID ) )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7248:1: ( ( RULE_ID ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7249:1: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEquationAccess().getLhsVarCrossReference_1_1_0()); 
            }
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7250:1: ( RULE_ID )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7251:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEquationAccess().getLhsVarIDTerminalRuleCall_1_1_0_1()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Equation__LhsAssignment_1_114485); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEquationAccess().getLhsVarIDTerminalRuleCall_1_1_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEquationAccess().getLhsVarCrossReference_1_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Equation__LhsAssignment_1_1"


    // $ANTLR start "rule__Equation__RhsAssignment_3"
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7262:1: rule__Equation__RhsAssignment_3 : ( ruleExpr ) ;
    public final void rule__Equation__RhsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7266:1: ( ( ruleExpr ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7267:1: ( ruleExpr )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7267:1: ( ruleExpr )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7268:1: ruleExpr
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEquationAccess().getRhsExprParserRuleCall_3_0()); 
            }
            pushFollow(FOLLOW_ruleExpr_in_rule__Equation__RhsAssignment_314520);
            ruleExpr();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEquationAccess().getRhsExprParserRuleCall_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Equation__RhsAssignment_3"


    // $ANTLR start "rule__Property__RefAssignment_1"
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7277:1: rule__Property__RefAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__Property__RefAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7281:1: ( ( ( RULE_ID ) ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7282:1: ( ( RULE_ID ) )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7282:1: ( ( RULE_ID ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7283:1: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPropertyAccess().getRefVarCrossReference_1_0()); 
            }
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7284:1: ( RULE_ID )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7285:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPropertyAccess().getRefVarIDTerminalRuleCall_1_0_1()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Property__RefAssignment_114555); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPropertyAccess().getRefVarIDTerminalRuleCall_1_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPropertyAccess().getRefVarCrossReference_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Property__RefAssignment_1"


    // $ANTLR start "rule__Assertion__ExprAssignment_1"
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7296:1: rule__Assertion__ExprAssignment_1 : ( ruleExpr ) ;
    public final void rule__Assertion__ExprAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7300:1: ( ( ruleExpr ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7301:1: ( ruleExpr )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7301:1: ( ruleExpr )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7302:1: ruleExpr
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAssertionAccess().getExprExprParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_ruleExpr_in_rule__Assertion__ExprAssignment_114590);
            ruleExpr();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAssertionAccess().getExprExprParserRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Assertion__ExprAssignment_1"


    // $ANTLR start "rule__ArrowExpr__OpAssignment_1_0_1"
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7311:1: rule__ArrowExpr__OpAssignment_1_0_1 : ( ( '->' ) ) ;
    public final void rule__ArrowExpr__OpAssignment_1_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7315:1: ( ( ( '->' ) ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7316:1: ( ( '->' ) )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7316:1: ( ( '->' ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7317:1: ( '->' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getArrowExprAccess().getOpHyphenMinusGreaterThanSignKeyword_1_0_1_0()); 
            }
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7318:1: ( '->' )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7319:1: '->'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getArrowExprAccess().getOpHyphenMinusGreaterThanSignKeyword_1_0_1_0()); 
            }
            match(input,56,FOLLOW_56_in_rule__ArrowExpr__OpAssignment_1_0_114626); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getArrowExprAccess().getOpHyphenMinusGreaterThanSignKeyword_1_0_1_0()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getArrowExprAccess().getOpHyphenMinusGreaterThanSignKeyword_1_0_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArrowExpr__OpAssignment_1_0_1"


    // $ANTLR start "rule__ArrowExpr__RightAssignment_1_0_2"
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7334:1: rule__ArrowExpr__RightAssignment_1_0_2 : ( ruleArrowExpr ) ;
    public final void rule__ArrowExpr__RightAssignment_1_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7338:1: ( ( ruleArrowExpr ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7339:1: ( ruleArrowExpr )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7339:1: ( ruleArrowExpr )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7340:1: ruleArrowExpr
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getArrowExprAccess().getRightArrowExprParserRuleCall_1_0_2_0()); 
            }
            pushFollow(FOLLOW_ruleArrowExpr_in_rule__ArrowExpr__RightAssignment_1_0_214665);
            ruleArrowExpr();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getArrowExprAccess().getRightArrowExprParserRuleCall_1_0_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArrowExpr__RightAssignment_1_0_2"


    // $ANTLR start "rule__ImpliesExpr__OpAssignment_1_0_1"
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7349:1: rule__ImpliesExpr__OpAssignment_1_0_1 : ( ( '=>' ) ) ;
    public final void rule__ImpliesExpr__OpAssignment_1_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7353:1: ( ( ( '=>' ) ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7354:1: ( ( '=>' ) )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7354:1: ( ( '=>' ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7355:1: ( '=>' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getImpliesExprAccess().getOpEqualsSignGreaterThanSignKeyword_1_0_1_0()); 
            }
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7356:1: ( '=>' )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7357:1: '=>'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getImpliesExprAccess().getOpEqualsSignGreaterThanSignKeyword_1_0_1_0()); 
            }
            match(input,57,FOLLOW_57_in_rule__ImpliesExpr__OpAssignment_1_0_114701); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getImpliesExprAccess().getOpEqualsSignGreaterThanSignKeyword_1_0_1_0()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getImpliesExprAccess().getOpEqualsSignGreaterThanSignKeyword_1_0_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ImpliesExpr__OpAssignment_1_0_1"


    // $ANTLR start "rule__ImpliesExpr__RightAssignment_1_0_2"
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7372:1: rule__ImpliesExpr__RightAssignment_1_0_2 : ( ruleImpliesExpr ) ;
    public final void rule__ImpliesExpr__RightAssignment_1_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7376:1: ( ( ruleImpliesExpr ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7377:1: ( ruleImpliesExpr )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7377:1: ( ruleImpliesExpr )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7378:1: ruleImpliesExpr
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getImpliesExprAccess().getRightImpliesExprParserRuleCall_1_0_2_0()); 
            }
            pushFollow(FOLLOW_ruleImpliesExpr_in_rule__ImpliesExpr__RightAssignment_1_0_214740);
            ruleImpliesExpr();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getImpliesExprAccess().getRightImpliesExprParserRuleCall_1_0_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ImpliesExpr__RightAssignment_1_0_2"


    // $ANTLR start "rule__OrExpr__OpAssignment_1_0_1"
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7387:1: rule__OrExpr__OpAssignment_1_0_1 : ( ( rule__OrExpr__OpAlternatives_1_0_1_0 ) ) ;
    public final void rule__OrExpr__OpAssignment_1_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7391:1: ( ( ( rule__OrExpr__OpAlternatives_1_0_1_0 ) ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7392:1: ( ( rule__OrExpr__OpAlternatives_1_0_1_0 ) )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7392:1: ( ( rule__OrExpr__OpAlternatives_1_0_1_0 ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7393:1: ( rule__OrExpr__OpAlternatives_1_0_1_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOrExprAccess().getOpAlternatives_1_0_1_0()); 
            }
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7394:1: ( rule__OrExpr__OpAlternatives_1_0_1_0 )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7394:2: rule__OrExpr__OpAlternatives_1_0_1_0
            {
            pushFollow(FOLLOW_rule__OrExpr__OpAlternatives_1_0_1_0_in_rule__OrExpr__OpAssignment_1_0_114771);
            rule__OrExpr__OpAlternatives_1_0_1_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getOrExprAccess().getOpAlternatives_1_0_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrExpr__OpAssignment_1_0_1"


    // $ANTLR start "rule__OrExpr__RightAssignment_1_0_2"
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7403:1: rule__OrExpr__RightAssignment_1_0_2 : ( ruleAndExpr ) ;
    public final void rule__OrExpr__RightAssignment_1_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7407:1: ( ( ruleAndExpr ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7408:1: ( ruleAndExpr )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7408:1: ( ruleAndExpr )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7409:1: ruleAndExpr
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOrExprAccess().getRightAndExprParserRuleCall_1_0_2_0()); 
            }
            pushFollow(FOLLOW_ruleAndExpr_in_rule__OrExpr__RightAssignment_1_0_214804);
            ruleAndExpr();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getOrExprAccess().getRightAndExprParserRuleCall_1_0_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrExpr__RightAssignment_1_0_2"


    // $ANTLR start "rule__AndExpr__OpAssignment_1_0_1"
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7418:1: rule__AndExpr__OpAssignment_1_0_1 : ( ( 'and' ) ) ;
    public final void rule__AndExpr__OpAssignment_1_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7422:1: ( ( ( 'and' ) ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7423:1: ( ( 'and' ) )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7423:1: ( ( 'and' ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7424:1: ( 'and' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAndExprAccess().getOpAndKeyword_1_0_1_0()); 
            }
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7425:1: ( 'and' )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7426:1: 'and'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAndExprAccess().getOpAndKeyword_1_0_1_0()); 
            }
            match(input,58,FOLLOW_58_in_rule__AndExpr__OpAssignment_1_0_114840); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAndExprAccess().getOpAndKeyword_1_0_1_0()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAndExprAccess().getOpAndKeyword_1_0_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AndExpr__OpAssignment_1_0_1"


    // $ANTLR start "rule__AndExpr__RightAssignment_1_0_2"
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7441:1: rule__AndExpr__RightAssignment_1_0_2 : ( ruleRelationalExpr ) ;
    public final void rule__AndExpr__RightAssignment_1_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7445:1: ( ( ruleRelationalExpr ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7446:1: ( ruleRelationalExpr )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7446:1: ( ruleRelationalExpr )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7447:1: ruleRelationalExpr
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAndExprAccess().getRightRelationalExprParserRuleCall_1_0_2_0()); 
            }
            pushFollow(FOLLOW_ruleRelationalExpr_in_rule__AndExpr__RightAssignment_1_0_214879);
            ruleRelationalExpr();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAndExprAccess().getRightRelationalExprParserRuleCall_1_0_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AndExpr__RightAssignment_1_0_2"


    // $ANTLR start "rule__RelationalExpr__OpAssignment_1_0_1"
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7456:1: rule__RelationalExpr__OpAssignment_1_0_1 : ( ( rule__RelationalExpr__OpAlternatives_1_0_1_0 ) ) ;
    public final void rule__RelationalExpr__OpAssignment_1_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7460:1: ( ( ( rule__RelationalExpr__OpAlternatives_1_0_1_0 ) ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7461:1: ( ( rule__RelationalExpr__OpAlternatives_1_0_1_0 ) )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7461:1: ( ( rule__RelationalExpr__OpAlternatives_1_0_1_0 ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7462:1: ( rule__RelationalExpr__OpAlternatives_1_0_1_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRelationalExprAccess().getOpAlternatives_1_0_1_0()); 
            }
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7463:1: ( rule__RelationalExpr__OpAlternatives_1_0_1_0 )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7463:2: rule__RelationalExpr__OpAlternatives_1_0_1_0
            {
            pushFollow(FOLLOW_rule__RelationalExpr__OpAlternatives_1_0_1_0_in_rule__RelationalExpr__OpAssignment_1_0_114910);
            rule__RelationalExpr__OpAlternatives_1_0_1_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRelationalExprAccess().getOpAlternatives_1_0_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RelationalExpr__OpAssignment_1_0_1"


    // $ANTLR start "rule__RelationalExpr__RightAssignment_1_0_2"
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7472:1: rule__RelationalExpr__RightAssignment_1_0_2 : ( rulePlusExpr ) ;
    public final void rule__RelationalExpr__RightAssignment_1_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7476:1: ( ( rulePlusExpr ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7477:1: ( rulePlusExpr )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7477:1: ( rulePlusExpr )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7478:1: rulePlusExpr
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRelationalExprAccess().getRightPlusExprParserRuleCall_1_0_2_0()); 
            }
            pushFollow(FOLLOW_rulePlusExpr_in_rule__RelationalExpr__RightAssignment_1_0_214943);
            rulePlusExpr();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRelationalExprAccess().getRightPlusExprParserRuleCall_1_0_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RelationalExpr__RightAssignment_1_0_2"


    // $ANTLR start "rule__PlusExpr__OpAssignment_1_0_1"
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7487:1: rule__PlusExpr__OpAssignment_1_0_1 : ( ( rule__PlusExpr__OpAlternatives_1_0_1_0 ) ) ;
    public final void rule__PlusExpr__OpAssignment_1_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7491:1: ( ( ( rule__PlusExpr__OpAlternatives_1_0_1_0 ) ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7492:1: ( ( rule__PlusExpr__OpAlternatives_1_0_1_0 ) )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7492:1: ( ( rule__PlusExpr__OpAlternatives_1_0_1_0 ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7493:1: ( rule__PlusExpr__OpAlternatives_1_0_1_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPlusExprAccess().getOpAlternatives_1_0_1_0()); 
            }
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7494:1: ( rule__PlusExpr__OpAlternatives_1_0_1_0 )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7494:2: rule__PlusExpr__OpAlternatives_1_0_1_0
            {
            pushFollow(FOLLOW_rule__PlusExpr__OpAlternatives_1_0_1_0_in_rule__PlusExpr__OpAssignment_1_0_114974);
            rule__PlusExpr__OpAlternatives_1_0_1_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPlusExprAccess().getOpAlternatives_1_0_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PlusExpr__OpAssignment_1_0_1"


    // $ANTLR start "rule__PlusExpr__RightAssignment_1_0_2"
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7503:1: rule__PlusExpr__RightAssignment_1_0_2 : ( ruleTimesExpr ) ;
    public final void rule__PlusExpr__RightAssignment_1_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7507:1: ( ( ruleTimesExpr ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7508:1: ( ruleTimesExpr )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7508:1: ( ruleTimesExpr )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7509:1: ruleTimesExpr
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPlusExprAccess().getRightTimesExprParserRuleCall_1_0_2_0()); 
            }
            pushFollow(FOLLOW_ruleTimesExpr_in_rule__PlusExpr__RightAssignment_1_0_215007);
            ruleTimesExpr();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPlusExprAccess().getRightTimesExprParserRuleCall_1_0_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PlusExpr__RightAssignment_1_0_2"


    // $ANTLR start "rule__TimesExpr__OpAssignment_1_0_1"
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7518:1: rule__TimesExpr__OpAssignment_1_0_1 : ( ( rule__TimesExpr__OpAlternatives_1_0_1_0 ) ) ;
    public final void rule__TimesExpr__OpAssignment_1_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7522:1: ( ( ( rule__TimesExpr__OpAlternatives_1_0_1_0 ) ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7523:1: ( ( rule__TimesExpr__OpAlternatives_1_0_1_0 ) )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7523:1: ( ( rule__TimesExpr__OpAlternatives_1_0_1_0 ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7524:1: ( rule__TimesExpr__OpAlternatives_1_0_1_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTimesExprAccess().getOpAlternatives_1_0_1_0()); 
            }
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7525:1: ( rule__TimesExpr__OpAlternatives_1_0_1_0 )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7525:2: rule__TimesExpr__OpAlternatives_1_0_1_0
            {
            pushFollow(FOLLOW_rule__TimesExpr__OpAlternatives_1_0_1_0_in_rule__TimesExpr__OpAssignment_1_0_115038);
            rule__TimesExpr__OpAlternatives_1_0_1_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTimesExprAccess().getOpAlternatives_1_0_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TimesExpr__OpAssignment_1_0_1"


    // $ANTLR start "rule__TimesExpr__RightAssignment_1_0_2"
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7534:1: rule__TimesExpr__RightAssignment_1_0_2 : ( rulePrefixExpr ) ;
    public final void rule__TimesExpr__RightAssignment_1_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7538:1: ( ( rulePrefixExpr ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7539:1: ( rulePrefixExpr )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7539:1: ( rulePrefixExpr )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7540:1: rulePrefixExpr
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTimesExprAccess().getRightPrefixExprParserRuleCall_1_0_2_0()); 
            }
            pushFollow(FOLLOW_rulePrefixExpr_in_rule__TimesExpr__RightAssignment_1_0_215071);
            rulePrefixExpr();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTimesExprAccess().getRightPrefixExprParserRuleCall_1_0_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TimesExpr__RightAssignment_1_0_2"


    // $ANTLR start "rule__PrefixExpr__OpAssignment_0_1"
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7549:1: rule__PrefixExpr__OpAssignment_0_1 : ( ( rule__PrefixExpr__OpAlternatives_0_1_0 ) ) ;
    public final void rule__PrefixExpr__OpAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7553:1: ( ( ( rule__PrefixExpr__OpAlternatives_0_1_0 ) ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7554:1: ( ( rule__PrefixExpr__OpAlternatives_0_1_0 ) )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7554:1: ( ( rule__PrefixExpr__OpAlternatives_0_1_0 ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7555:1: ( rule__PrefixExpr__OpAlternatives_0_1_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPrefixExprAccess().getOpAlternatives_0_1_0()); 
            }
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7556:1: ( rule__PrefixExpr__OpAlternatives_0_1_0 )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7556:2: rule__PrefixExpr__OpAlternatives_0_1_0
            {
            pushFollow(FOLLOW_rule__PrefixExpr__OpAlternatives_0_1_0_in_rule__PrefixExpr__OpAssignment_0_115102);
            rule__PrefixExpr__OpAlternatives_0_1_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPrefixExprAccess().getOpAlternatives_0_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrefixExpr__OpAssignment_0_1"


    // $ANTLR start "rule__PrefixExpr__ExprAssignment_0_2"
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7565:1: rule__PrefixExpr__ExprAssignment_0_2 : ( rulePrefixExpr ) ;
    public final void rule__PrefixExpr__ExprAssignment_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7569:1: ( ( rulePrefixExpr ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7570:1: ( rulePrefixExpr )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7570:1: ( rulePrefixExpr )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7571:1: rulePrefixExpr
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPrefixExprAccess().getExprPrefixExprParserRuleCall_0_2_0()); 
            }
            pushFollow(FOLLOW_rulePrefixExpr_in_rule__PrefixExpr__ExprAssignment_0_215135);
            rulePrefixExpr();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPrefixExprAccess().getExprPrefixExprParserRuleCall_0_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrefixExpr__ExprAssignment_0_2"


    // $ANTLR start "rule__AtomicExpr__IdAssignment_0_1"
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7580:1: rule__AtomicExpr__IdAssignment_0_1 : ( ( RULE_ID ) ) ;
    public final void rule__AtomicExpr__IdAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7584:1: ( ( ( RULE_ID ) ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7585:1: ( ( RULE_ID ) )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7585:1: ( ( RULE_ID ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7586:1: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAtomicExprAccess().getIdIdRefCrossReference_0_1_0()); 
            }
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7587:1: ( RULE_ID )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7588:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAtomicExprAccess().getIdIdRefIDTerminalRuleCall_0_1_0_1()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__AtomicExpr__IdAssignment_0_115170); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAtomicExprAccess().getIdIdRefIDTerminalRuleCall_0_1_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAtomicExprAccess().getIdIdRefCrossReference_0_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AtomicExpr__IdAssignment_0_1"


    // $ANTLR start "rule__AtomicExpr__ValAssignment_1_1"
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7599:1: rule__AtomicExpr__ValAssignment_1_1 : ( RULE_INT ) ;
    public final void rule__AtomicExpr__ValAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7603:1: ( ( RULE_INT ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7604:1: ( RULE_INT )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7604:1: ( RULE_INT )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7605:1: RULE_INT
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAtomicExprAccess().getValINTTerminalRuleCall_1_1_0()); 
            }
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__AtomicExpr__ValAssignment_1_115205); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAtomicExprAccess().getValINTTerminalRuleCall_1_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AtomicExpr__ValAssignment_1_1"


    // $ANTLR start "rule__AtomicExpr__ValAssignment_2_1"
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7614:1: rule__AtomicExpr__ValAssignment_2_1 : ( ruleREAL ) ;
    public final void rule__AtomicExpr__ValAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7618:1: ( ( ruleREAL ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7619:1: ( ruleREAL )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7619:1: ( ruleREAL )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7620:1: ruleREAL
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAtomicExprAccess().getValREALParserRuleCall_2_1_0()); 
            }
            pushFollow(FOLLOW_ruleREAL_in_rule__AtomicExpr__ValAssignment_2_115236);
            ruleREAL();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAtomicExprAccess().getValREALParserRuleCall_2_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AtomicExpr__ValAssignment_2_1"


    // $ANTLR start "rule__AtomicExpr__ValAssignment_3_1"
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7629:1: rule__AtomicExpr__ValAssignment_3_1 : ( RULE_BOOL ) ;
    public final void rule__AtomicExpr__ValAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7633:1: ( ( RULE_BOOL ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7634:1: ( RULE_BOOL )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7634:1: ( RULE_BOOL )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7635:1: RULE_BOOL
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAtomicExprAccess().getValBOOLTerminalRuleCall_3_1_0()); 
            }
            match(input,RULE_BOOL,FOLLOW_RULE_BOOL_in_rule__AtomicExpr__ValAssignment_3_115267); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAtomicExprAccess().getValBOOLTerminalRuleCall_3_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AtomicExpr__ValAssignment_3_1"


    // $ANTLR start "rule__AtomicExpr__CondAssignment_4_2"
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7644:1: rule__AtomicExpr__CondAssignment_4_2 : ( ruleExpr ) ;
    public final void rule__AtomicExpr__CondAssignment_4_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7648:1: ( ( ruleExpr ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7649:1: ( ruleExpr )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7649:1: ( ruleExpr )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7650:1: ruleExpr
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAtomicExprAccess().getCondExprParserRuleCall_4_2_0()); 
            }
            pushFollow(FOLLOW_ruleExpr_in_rule__AtomicExpr__CondAssignment_4_215298);
            ruleExpr();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAtomicExprAccess().getCondExprParserRuleCall_4_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AtomicExpr__CondAssignment_4_2"


    // $ANTLR start "rule__AtomicExpr__ThenAssignment_4_4"
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7659:1: rule__AtomicExpr__ThenAssignment_4_4 : ( ruleExpr ) ;
    public final void rule__AtomicExpr__ThenAssignment_4_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7663:1: ( ( ruleExpr ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7664:1: ( ruleExpr )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7664:1: ( ruleExpr )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7665:1: ruleExpr
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAtomicExprAccess().getThenExprParserRuleCall_4_4_0()); 
            }
            pushFollow(FOLLOW_ruleExpr_in_rule__AtomicExpr__ThenAssignment_4_415329);
            ruleExpr();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAtomicExprAccess().getThenExprParserRuleCall_4_4_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AtomicExpr__ThenAssignment_4_4"


    // $ANTLR start "rule__AtomicExpr__ElseAssignment_4_6"
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7674:1: rule__AtomicExpr__ElseAssignment_4_6 : ( ruleExpr ) ;
    public final void rule__AtomicExpr__ElseAssignment_4_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7678:1: ( ( ruleExpr ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7679:1: ( ruleExpr )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7679:1: ( ruleExpr )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7680:1: ruleExpr
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAtomicExprAccess().getElseExprParserRuleCall_4_6_0()); 
            }
            pushFollow(FOLLOW_ruleExpr_in_rule__AtomicExpr__ElseAssignment_4_615360);
            ruleExpr();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAtomicExprAccess().getElseExprParserRuleCall_4_6_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AtomicExpr__ElseAssignment_4_6"


    // $ANTLR start "rule__AtomicExpr__NodeAssignment_5_1"
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7689:1: rule__AtomicExpr__NodeAssignment_5_1 : ( ( RULE_ID ) ) ;
    public final void rule__AtomicExpr__NodeAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7693:1: ( ( ( RULE_ID ) ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7694:1: ( ( RULE_ID ) )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7694:1: ( ( RULE_ID ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7695:1: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAtomicExprAccess().getNodeNodeCrossReference_5_1_0()); 
            }
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7696:1: ( RULE_ID )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7697:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAtomicExprAccess().getNodeNodeIDTerminalRuleCall_5_1_0_1()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__AtomicExpr__NodeAssignment_5_115395); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAtomicExprAccess().getNodeNodeIDTerminalRuleCall_5_1_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAtomicExprAccess().getNodeNodeCrossReference_5_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AtomicExpr__NodeAssignment_5_1"


    // $ANTLR start "rule__AtomicExpr__ArgsAssignment_5_3_0"
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7708:1: rule__AtomicExpr__ArgsAssignment_5_3_0 : ( ruleExpr ) ;
    public final void rule__AtomicExpr__ArgsAssignment_5_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7712:1: ( ( ruleExpr ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7713:1: ( ruleExpr )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7713:1: ( ruleExpr )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7714:1: ruleExpr
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAtomicExprAccess().getArgsExprParserRuleCall_5_3_0_0()); 
            }
            pushFollow(FOLLOW_ruleExpr_in_rule__AtomicExpr__ArgsAssignment_5_3_015430);
            ruleExpr();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAtomicExprAccess().getArgsExprParserRuleCall_5_3_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AtomicExpr__ArgsAssignment_5_3_0"


    // $ANTLR start "rule__AtomicExpr__ArgsAssignment_5_3_1_1"
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7723:1: rule__AtomicExpr__ArgsAssignment_5_3_1_1 : ( ruleExpr ) ;
    public final void rule__AtomicExpr__ArgsAssignment_5_3_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7727:1: ( ( ruleExpr ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7728:1: ( ruleExpr )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7728:1: ( ruleExpr )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7729:1: ruleExpr
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAtomicExprAccess().getArgsExprParserRuleCall_5_3_1_1_0()); 
            }
            pushFollow(FOLLOW_ruleExpr_in_rule__AtomicExpr__ArgsAssignment_5_3_1_115461);
            ruleExpr();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAtomicExprAccess().getArgsExprParserRuleCall_5_3_1_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AtomicExpr__ArgsAssignment_5_3_1_1"


    // $ANTLR start "rule__AtomicExpr__IdAssignment_6_1"
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7738:1: rule__AtomicExpr__IdAssignment_6_1 : ( ( RULE_ID ) ) ;
    public final void rule__AtomicExpr__IdAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7742:1: ( ( ( RULE_ID ) ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7743:1: ( ( RULE_ID ) )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7743:1: ( ( RULE_ID ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7744:1: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAtomicExprAccess().getIdTypedefCrossReference_6_1_0()); 
            }
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7745:1: ( RULE_ID )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7746:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAtomicExprAccess().getIdTypedefIDTerminalRuleCall_6_1_0_1()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__AtomicExpr__IdAssignment_6_115496); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAtomicExprAccess().getIdTypedefIDTerminalRuleCall_6_1_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAtomicExprAccess().getIdTypedefCrossReference_6_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AtomicExpr__IdAssignment_6_1"


    // $ANTLR start "rule__AtomicExpr__FieldsAssignment_6_3"
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7757:1: rule__AtomicExpr__FieldsAssignment_6_3 : ( RULE_ID ) ;
    public final void rule__AtomicExpr__FieldsAssignment_6_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7761:1: ( ( RULE_ID ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7762:1: ( RULE_ID )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7762:1: ( RULE_ID )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7763:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAtomicExprAccess().getFieldsIDTerminalRuleCall_6_3_0()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__AtomicExpr__FieldsAssignment_6_315531); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAtomicExprAccess().getFieldsIDTerminalRuleCall_6_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AtomicExpr__FieldsAssignment_6_3"


    // $ANTLR start "rule__AtomicExpr__ExprsAssignment_6_5"
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7772:1: rule__AtomicExpr__ExprsAssignment_6_5 : ( ruleExpr ) ;
    public final void rule__AtomicExpr__ExprsAssignment_6_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7776:1: ( ( ruleExpr ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7777:1: ( ruleExpr )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7777:1: ( ruleExpr )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7778:1: ruleExpr
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAtomicExprAccess().getExprsExprParserRuleCall_6_5_0()); 
            }
            pushFollow(FOLLOW_ruleExpr_in_rule__AtomicExpr__ExprsAssignment_6_515562);
            ruleExpr();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAtomicExprAccess().getExprsExprParserRuleCall_6_5_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AtomicExpr__ExprsAssignment_6_5"


    // $ANTLR start "rule__AtomicExpr__FieldsAssignment_6_6_1"
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7787:1: rule__AtomicExpr__FieldsAssignment_6_6_1 : ( RULE_ID ) ;
    public final void rule__AtomicExpr__FieldsAssignment_6_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7791:1: ( ( RULE_ID ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7792:1: ( RULE_ID )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7792:1: ( RULE_ID )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7793:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAtomicExprAccess().getFieldsIDTerminalRuleCall_6_6_1_0()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__AtomicExpr__FieldsAssignment_6_6_115593); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAtomicExprAccess().getFieldsIDTerminalRuleCall_6_6_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AtomicExpr__FieldsAssignment_6_6_1"


    // $ANTLR start "rule__AtomicExpr__ExprsAssignment_6_6_3"
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7802:1: rule__AtomicExpr__ExprsAssignment_6_6_3 : ( ruleExpr ) ;
    public final void rule__AtomicExpr__ExprsAssignment_6_6_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7806:1: ( ( ruleExpr ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7807:1: ( ruleExpr )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7807:1: ( ruleExpr )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7808:1: ruleExpr
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAtomicExprAccess().getExprsExprParserRuleCall_6_6_3_0()); 
            }
            pushFollow(FOLLOW_ruleExpr_in_rule__AtomicExpr__ExprsAssignment_6_6_315624);
            ruleExpr();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAtomicExprAccess().getExprsExprParserRuleCall_6_6_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AtomicExpr__ExprsAssignment_6_6_3"

    // $ANTLR start synpred44_InternalJKind
    public final void synpred44_InternalJKind_fragment() throws RecognitionException {   
        // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4102:2: ( rule__ArrowExpr__Group_1__0 )
        // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4102:2: rule__ArrowExpr__Group_1__0
        {
        pushFollow(FOLLOW_rule__ArrowExpr__Group_1__0_in_synpred44_InternalJKind8265);
        rule__ArrowExpr__Group_1__0();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred44_InternalJKind

    // $ANTLR start synpred45_InternalJKind
    public final void synpred45_InternalJKind_fragment() throws RecognitionException {   
        // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4287:2: ( rule__ImpliesExpr__Group_1__0 )
        // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4287:2: rule__ImpliesExpr__Group_1__0
        {
        pushFollow(FOLLOW_rule__ImpliesExpr__Group_1__0_in_synpred45_InternalJKind8629);
        rule__ImpliesExpr__Group_1__0();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred45_InternalJKind

    // $ANTLR start synpred46_InternalJKind
    public final void synpred46_InternalJKind_fragment() throws RecognitionException {   
        // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4472:2: ( rule__OrExpr__Group_1__0 )
        // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4472:2: rule__OrExpr__Group_1__0
        {
        pushFollow(FOLLOW_rule__OrExpr__Group_1__0_in_synpred46_InternalJKind8993);
        rule__OrExpr__Group_1__0();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred46_InternalJKind

    // $ANTLR start synpred47_InternalJKind
    public final void synpred47_InternalJKind_fragment() throws RecognitionException {   
        // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4657:2: ( rule__AndExpr__Group_1__0 )
        // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4657:2: rule__AndExpr__Group_1__0
        {
        pushFollow(FOLLOW_rule__AndExpr__Group_1__0_in_synpred47_InternalJKind9357);
        rule__AndExpr__Group_1__0();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred47_InternalJKind

    // $ANTLR start synpred48_InternalJKind
    public final void synpred48_InternalJKind_fragment() throws RecognitionException {   
        // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4842:2: ( rule__RelationalExpr__Group_1__0 )
        // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4842:2: rule__RelationalExpr__Group_1__0
        {
        pushFollow(FOLLOW_rule__RelationalExpr__Group_1__0_in_synpred48_InternalJKind9721);
        rule__RelationalExpr__Group_1__0();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred48_InternalJKind

    // $ANTLR start synpred49_InternalJKind
    public final void synpred49_InternalJKind_fragment() throws RecognitionException {   
        // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5027:2: ( rule__PlusExpr__Group_1__0 )
        // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5027:2: rule__PlusExpr__Group_1__0
        {
        pushFollow(FOLLOW_rule__PlusExpr__Group_1__0_in_synpred49_InternalJKind10085);
        rule__PlusExpr__Group_1__0();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred49_InternalJKind

    // $ANTLR start synpred50_InternalJKind
    public final void synpred50_InternalJKind_fragment() throws RecognitionException {   
        // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5212:2: ( rule__TimesExpr__Group_1__0 )
        // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5212:2: rule__TimesExpr__Group_1__0
        {
        pushFollow(FOLLOW_rule__TimesExpr__Group_1__0_in_synpred50_InternalJKind10449);
        rule__TimesExpr__Group_1__0();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred50_InternalJKind

    // Delegated rules

    public final boolean synpred50_InternalJKind() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred50_InternalJKind_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred49_InternalJKind() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred49_InternalJKind_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred47_InternalJKind() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred47_InternalJKind_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred45_InternalJKind() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred45_InternalJKind_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred46_InternalJKind() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred46_InternalJKind_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred44_InternalJKind() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred44_InternalJKind_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred48_InternalJKind() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred48_InternalJKind_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


    protected DFA12 dfa12 = new DFA12(this);
    static final String DFA12_eotS =
        "\13\uffff";
    static final String DFA12_eofS =
        "\1\uffff\1\7\1\12\10\uffff";
    static final String DFA12_minS =
        "\1\4\2\14\10\uffff";
    static final String DFA12_maxS =
        "\1\64\2\72\10\uffff";
    static final String DFA12_acceptS =
        "\3\uffff\1\4\1\5\1\10\1\7\1\1\1\6\1\3\1\2";
    static final String DFA12_specialS =
        "\13\uffff}>";
    static final String[] DFA12_transitionS = {
            "\1\2\1\1\1\3\44\uffff\1\5\10\uffff\1\4",
            "\15\7\3\uffff\1\7\1\uffff\1\6\1\uffff\1\7\5\uffff\1\7\4\uffff"+
            "\1\10\1\7\10\uffff\2\7\1\uffff\3\7",
            "\15\12\3\uffff\1\12\3\uffff\1\12\5\uffff\1\12\5\uffff\1\12"+
            "\10\uffff\2\12\1\11\3\12",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA12_eot = DFA.unpackEncodedString(DFA12_eotS);
    static final short[] DFA12_eof = DFA.unpackEncodedString(DFA12_eofS);
    static final char[] DFA12_min = DFA.unpackEncodedStringToUnsignedChars(DFA12_minS);
    static final char[] DFA12_max = DFA.unpackEncodedStringToUnsignedChars(DFA12_maxS);
    static final short[] DFA12_accept = DFA.unpackEncodedString(DFA12_acceptS);
    static final short[] DFA12_special = DFA.unpackEncodedString(DFA12_specialS);
    static final short[][] DFA12_transition;

    static {
        int numStates = DFA12_transitionS.length;
        DFA12_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA12_transition[i] = DFA.unpackEncodedString(DFA12_transitionS[i]);
        }
    }

    class DFA12 extends DFA {

        public DFA12(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 12;
            this.eot = DFA12_eot;
            this.eof = DFA12_eof;
            this.min = DFA12_min;
            this.max = DFA12_max;
            this.accept = DFA12_accept;
            this.special = DFA12_special;
            this.transition = DFA12_transition;
        }
        public String getDescription() {
            return "1060:1: rule__AtomicExpr__Alternatives : ( ( ( rule__AtomicExpr__Group_0__0 ) ) | ( ( rule__AtomicExpr__Group_1__0 ) ) | ( ( rule__AtomicExpr__Group_2__0 ) ) | ( ( rule__AtomicExpr__Group_3__0 ) ) | ( ( rule__AtomicExpr__Group_4__0 ) ) | ( ( rule__AtomicExpr__Group_5__0 ) ) | ( ( rule__AtomicExpr__Group_6__0 ) ) | ( ( rule__AtomicExpr__Group_7__0 ) ) );";
        }
    }
 

    public static final BitSet FOLLOW_ruleFile_in_entryRuleFile67 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFile74 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__File__Alternatives_in_ruleFile100 = new BitSet(new long[]{0x0000060008000002L});
    public static final BitSet FOLLOW_ruleTypedef_in_entryRuleTypedef128 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTypedef135 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Typedef__Group__0_in_ruleTypedef161 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTopLevelType_in_entryRuleTopLevelType188 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTopLevelType195 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TopLevelType__Alternatives_in_ruleTopLevelType221 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_entryRuleType248 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleType255 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Type__Alternatives_in_ruleType281 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBound_in_entryRuleBound308 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBound315 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Bound__Group__0_in_ruleBound341 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConstant_in_entryRuleConstant368 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConstant375 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Constant__Group__0_in_ruleConstant401 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNode_in_entryRuleNode430 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNode437 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Node__Group__0_in_ruleNode463 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVarGroup_in_entryRuleVarGroup490 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVarGroup497 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VarGroup__Group__0_in_ruleVarGroup523 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVar_in_entryRuleVar550 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVar557 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Var__NameAssignment_in_ruleVar583 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEquation_in_entryRuleEquation610 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEquation617 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Equation__Group__0_in_ruleEquation643 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProperty_in_entryRuleProperty670 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleProperty677 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Property__Group__0_in_ruleProperty703 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMain_in_entryRuleMain730 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMain737 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Main__Group__0_in_ruleMain763 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAssertion_in_entryRuleAssertion790 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAssertion797 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Assertion__Group__0_in_ruleAssertion823 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpr_in_entryRuleExpr850 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExpr857 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleArrowExpr_in_ruleExpr883 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleArrowExpr_in_entryRuleArrowExpr909 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleArrowExpr916 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ArrowExpr__Group__0_in_ruleArrowExpr942 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImpliesExpr_in_entryRuleImpliesExpr969 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleImpliesExpr976 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ImpliesExpr__Group__0_in_ruleImpliesExpr1002 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOrExpr_in_entryRuleOrExpr1029 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOrExpr1036 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OrExpr__Group__0_in_ruleOrExpr1062 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAndExpr_in_entryRuleAndExpr1089 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAndExpr1096 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AndExpr__Group__0_in_ruleAndExpr1122 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRelationalExpr_in_entryRuleRelationalExpr1149 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRelationalExpr1156 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RelationalExpr__Group__0_in_ruleRelationalExpr1182 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePlusExpr_in_entryRulePlusExpr1209 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePlusExpr1216 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PlusExpr__Group__0_in_rulePlusExpr1242 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTimesExpr_in_entryRuleTimesExpr1269 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTimesExpr1276 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TimesExpr__Group__0_in_ruleTimesExpr1302 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrefixExpr_in_entryRulePrefixExpr1329 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePrefixExpr1336 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PrefixExpr__Alternatives_in_rulePrefixExpr1362 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAtomicExpr_in_entryRuleAtomicExpr1389 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAtomicExpr1396 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AtomicExpr__Alternatives_in_ruleAtomicExpr1422 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleREAL_in_entryRuleREAL1449 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleREAL1456 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__REAL__Group__0_in_ruleREAL1482 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__File__TypedefsAssignment_0_in_rule__File__Alternatives1518 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__File__ConstantsAssignment_1_in_rule__File__Alternatives1536 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__File__NodesAssignment_2_in_rule__File__Alternatives1554 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TopLevelType__Group_0__0_in_rule__TopLevelType__Alternatives1587 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_rule__TopLevelType__Alternatives1605 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Type__Group_0__0_in_rule__Type__Alternatives1637 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Type__Group_1__0_in_rule__Type__Alternatives1655 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Type__Group_2__0_in_rule__Type__Alternatives1673 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Type__Group_3__0_in_rule__Type__Alternatives1691 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Type__Group_4__0_in_rule__Type__Alternatives1709 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Node__EquationsAssignment_12_0_in_rule__Node__Alternatives_121743 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Node__PropertiesAssignment_12_1_in_rule__Node__Alternatives_121761 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Node__AssertionsAssignment_12_2_in_rule__Node__Alternatives_121779 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Node__MainAssignment_12_3_in_rule__Node__Alternatives_121797 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__OrExpr__OpAlternatives_1_0_1_01831 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__OrExpr__OpAlternatives_1_0_1_01851 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__RelationalExpr__OpAlternatives_1_0_1_01886 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__RelationalExpr__OpAlternatives_1_0_1_01906 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__RelationalExpr__OpAlternatives_1_0_1_01926 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__RelationalExpr__OpAlternatives_1_0_1_01946 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__RelationalExpr__OpAlternatives_1_0_1_01966 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__RelationalExpr__OpAlternatives_1_0_1_01986 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__PlusExpr__OpAlternatives_1_0_1_02021 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__PlusExpr__OpAlternatives_1_0_1_02041 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__TimesExpr__OpAlternatives_1_0_1_02076 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__TimesExpr__OpAlternatives_1_0_1_02096 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__TimesExpr__OpAlternatives_1_0_1_02116 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PrefixExpr__Group_0__0_in_rule__PrefixExpr__Alternatives2150 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAtomicExpr_in_rule__PrefixExpr__Alternatives2168 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__PrefixExpr__OpAlternatives_0_1_02201 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__PrefixExpr__OpAlternatives_0_1_02221 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__PrefixExpr__OpAlternatives_0_1_02241 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AtomicExpr__Group_0__0_in_rule__AtomicExpr__Alternatives2275 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AtomicExpr__Group_1__0_in_rule__AtomicExpr__Alternatives2293 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AtomicExpr__Group_2__0_in_rule__AtomicExpr__Alternatives2311 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AtomicExpr__Group_3__0_in_rule__AtomicExpr__Alternatives2329 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AtomicExpr__Group_4__0_in_rule__AtomicExpr__Alternatives2347 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AtomicExpr__Group_5__0_in_rule__AtomicExpr__Alternatives2365 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AtomicExpr__Group_6__0_in_rule__AtomicExpr__Alternatives2383 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AtomicExpr__Group_7__0_in_rule__AtomicExpr__Alternatives2401 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Typedef__Group__0__Impl_in_rule__Typedef__Group__02432 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Typedef__Group__1_in_rule__Typedef__Group__02435 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__Typedef__Group__0__Impl2463 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Typedef__Group__1__Impl_in_rule__Typedef__Group__12494 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_rule__Typedef__Group__2_in_rule__Typedef__Group__12497 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Typedef__NameAssignment_1_in_rule__Typedef__Group__1__Impl2524 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Typedef__Group__2__Impl_in_rule__Typedef__Group__22554 = new BitSet(new long[]{0x0000001E20000020L});
    public static final BitSet FOLLOW_rule__Typedef__Group__3_in_rule__Typedef__Group__22557 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__Typedef__Group__2__Impl2585 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Typedef__Group__3__Impl_in_rule__Typedef__Group__32616 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_rule__Typedef__Group__4_in_rule__Typedef__Group__32619 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Typedef__TypeAssignment_3_in_rule__Typedef__Group__3__Impl2646 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Typedef__Group__4__Impl_in_rule__Typedef__Group__42676 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__Typedef__Group__4__Impl2704 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TopLevelType__Group_0__0__Impl_in_rule__TopLevelType__Group_0__02745 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_rule__TopLevelType__Group_0__1_in_rule__TopLevelType__Group_0__02748 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TopLevelType__Group_0__1__Impl_in_rule__TopLevelType__Group_0__12806 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_rule__TopLevelType__Group_0__2_in_rule__TopLevelType__Group_0__12809 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__TopLevelType__Group_0__1__Impl2837 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TopLevelType__Group_0__2__Impl_in_rule__TopLevelType__Group_0__22868 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__TopLevelType__Group_0__3_in_rule__TopLevelType__Group_0__22871 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__TopLevelType__Group_0__2__Impl2899 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TopLevelType__Group_0__3__Impl_in_rule__TopLevelType__Group_0__32930 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_rule__TopLevelType__Group_0__4_in_rule__TopLevelType__Group_0__32933 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TopLevelType__FieldsAssignment_0_3_in_rule__TopLevelType__Group_0__3__Impl2960 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TopLevelType__Group_0__4__Impl_in_rule__TopLevelType__Group_0__42990 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__TopLevelType__Group_0__5_in_rule__TopLevelType__Group_0__42993 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__TopLevelType__Group_0__4__Impl3021 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TopLevelType__Group_0__5__Impl_in_rule__TopLevelType__Group_0__53052 = new BitSet(new long[]{0x0000000110000000L});
    public static final BitSet FOLLOW_rule__TopLevelType__Group_0__6_in_rule__TopLevelType__Group_0__53055 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TopLevelType__TypesAssignment_0_5_in_rule__TopLevelType__Group_0__5__Impl3082 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TopLevelType__Group_0__6__Impl_in_rule__TopLevelType__Group_0__63112 = new BitSet(new long[]{0x0000000110000000L});
    public static final BitSet FOLLOW_rule__TopLevelType__Group_0__7_in_rule__TopLevelType__Group_0__63115 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TopLevelType__Group_0_6__0_in_rule__TopLevelType__Group_0__6__Impl3142 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_rule__TopLevelType__Group_0__7__Impl_in_rule__TopLevelType__Group_0__73173 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__TopLevelType__Group_0__7__Impl3201 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TopLevelType__Group_0_6__0__Impl_in_rule__TopLevelType__Group_0_6__03248 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__TopLevelType__Group_0_6__1_in_rule__TopLevelType__Group_0_6__03251 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__TopLevelType__Group_0_6__0__Impl3279 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TopLevelType__Group_0_6__1__Impl_in_rule__TopLevelType__Group_0_6__13310 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_rule__TopLevelType__Group_0_6__2_in_rule__TopLevelType__Group_0_6__13313 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TopLevelType__FieldsAssignment_0_6_1_in_rule__TopLevelType__Group_0_6__1__Impl3340 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TopLevelType__Group_0_6__2__Impl_in_rule__TopLevelType__Group_0_6__23370 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__TopLevelType__Group_0_6__3_in_rule__TopLevelType__Group_0_6__23373 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__TopLevelType__Group_0_6__2__Impl3401 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TopLevelType__Group_0_6__3__Impl_in_rule__TopLevelType__Group_0_6__33432 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TopLevelType__TypesAssignment_0_6_3_in_rule__TopLevelType__Group_0_6__3__Impl3459 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Type__Group_0__0__Impl_in_rule__Type__Group_0__03497 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_rule__Type__Group_0__1_in_rule__Type__Group_0__03500 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Type__Group_0__1__Impl_in_rule__Type__Group_0__13558 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__Type__Group_0__1__Impl3586 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Type__Group_1__0__Impl_in_rule__Type__Group_1__03621 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_rule__Type__Group_1__1_in_rule__Type__Group_1__03624 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Type__Group_1__1__Impl_in_rule__Type__Group_1__13682 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rule__Type__Group_1__1__Impl3710 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Type__Group_2__0__Impl_in_rule__Type__Group_2__03745 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_rule__Type__Group_2__1_in_rule__Type__Group_2__03748 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Type__Group_2__1__Impl_in_rule__Type__Group_2__13806 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rule__Type__Group_2__1__Impl3834 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Type__Group_3__0__Impl_in_rule__Type__Group_3__03869 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_rule__Type__Group_3__1_in_rule__Type__Group_3__03872 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Type__Group_3__1__Impl_in_rule__Type__Group_3__13930 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_rule__Type__Group_3__2_in_rule__Type__Group_3__13933 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_rule__Type__Group_3__1__Impl3961 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Type__Group_3__2__Impl_in_rule__Type__Group_3__23992 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_rule__Type__Group_3__3_in_rule__Type__Group_3__23995 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_rule__Type__Group_3__2__Impl4023 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Type__Group_3__3__Impl_in_rule__Type__Group_3__34054 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_rule__Type__Group_3__4_in_rule__Type__Group_3__34057 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Type__LowAssignment_3_3_in_rule__Type__Group_3__3__Impl4084 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Type__Group_3__4__Impl_in_rule__Type__Group_3__44114 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_rule__Type__Group_3__5_in_rule__Type__Group_3__44117 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_rule__Type__Group_3__4__Impl4145 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Type__Group_3__5__Impl_in_rule__Type__Group_3__54176 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_rule__Type__Group_3__6_in_rule__Type__Group_3__54179 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Type__HighAssignment_3_5_in_rule__Type__Group_3__5__Impl4206 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Type__Group_3__6__Impl_in_rule__Type__Group_3__64236 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_rule__Type__Group_3__7_in_rule__Type__Group_3__64239 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_rule__Type__Group_3__6__Impl4267 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Type__Group_3__7__Impl_in_rule__Type__Group_3__74298 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_rule__Type__Group_3__8_in_rule__Type__Group_3__74301 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_rule__Type__Group_3__7__Impl4329 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Type__Group_3__8__Impl_in_rule__Type__Group_3__84360 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__Type__Group_3__8__Impl4388 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Type__Group_4__0__Impl_in_rule__Type__Group_4__04437 = new BitSet(new long[]{0x0000001E20000020L});
    public static final BitSet FOLLOW_rule__Type__Group_4__1_in_rule__Type__Group_4__04440 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Type__Group_4__1__Impl_in_rule__Type__Group_4__14498 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Type__DefAssignment_4_1_in_rule__Type__Group_4__1__Impl4525 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Bound__Group__0__Impl_in_rule__Bound__Group__04559 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Bound__Group__1_in_rule__Bound__Group__04562 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__Bound__Group__0__Impl4590 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Bound__Group__1__Impl_in_rule__Bound__Group__14621 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__Bound__Group__1__Impl4648 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Constant__Group__0__Impl_in_rule__Constant__Group__04681 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Constant__Group__1_in_rule__Constant__Group__04684 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_rule__Constant__Group__0__Impl4712 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Constant__Group__1__Impl_in_rule__Constant__Group__14743 = new BitSet(new long[]{0x0000000080040000L});
    public static final BitSet FOLLOW_rule__Constant__Group__2_in_rule__Constant__Group__14746 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Constant__NameAssignment_1_in_rule__Constant__Group__1__Impl4773 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Constant__Group__2__Impl_in_rule__Constant__Group__24803 = new BitSet(new long[]{0x0000000080040000L});
    public static final BitSet FOLLOW_rule__Constant__Group__3_in_rule__Constant__Group__24806 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Constant__Group_2__0_in_rule__Constant__Group__2__Impl4833 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Constant__Group__3__Impl_in_rule__Constant__Group__34864 = new BitSet(new long[]{0x0010080006200070L});
    public static final BitSet FOLLOW_rule__Constant__Group__4_in_rule__Constant__Group__34867 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__Constant__Group__3__Impl4895 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Constant__Group__4__Impl_in_rule__Constant__Group__44926 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_rule__Constant__Group__5_in_rule__Constant__Group__44929 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Constant__ExprAssignment_4_in_rule__Constant__Group__4__Impl4956 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Constant__Group__5__Impl_in_rule__Constant__Group__54986 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__Constant__Group__5__Impl5014 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Constant__Group_2__0__Impl_in_rule__Constant__Group_2__05057 = new BitSet(new long[]{0x0000001E20000020L});
    public static final BitSet FOLLOW_rule__Constant__Group_2__1_in_rule__Constant__Group_2__05060 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__Constant__Group_2__0__Impl5088 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Constant__Group_2__1__Impl_in_rule__Constant__Group_2__15119 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Constant__TypeAssignment_2_1_in_rule__Constant__Group_2__1__Impl5146 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Node__Group__0__Impl_in_rule__Node__Group__05180 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Node__Group__1_in_rule__Node__Group__05183 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_rule__Node__Group__0__Impl5211 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Node__Group__1__Impl_in_rule__Node__Group__15242 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_rule__Node__Group__2_in_rule__Node__Group__15245 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Node__NameAssignment_1_in_rule__Node__Group__1__Impl5272 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Node__Group__2__Impl_in_rule__Node__Group__25302 = new BitSet(new long[]{0x0000100000000020L});
    public static final BitSet FOLLOW_rule__Node__Group__3_in_rule__Node__Group__25305 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_rule__Node__Group__2__Impl5333 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Node__Group__3__Impl_in_rule__Node__Group__35364 = new BitSet(new long[]{0x0000100000000020L});
    public static final BitSet FOLLOW_rule__Node__Group__4_in_rule__Node__Group__35367 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Node__Group_3__0_in_rule__Node__Group__3__Impl5394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Node__Group__4__Impl_in_rule__Node__Group__45425 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_rule__Node__Group__5_in_rule__Node__Group__45428 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_rule__Node__Group__4__Impl5456 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Node__Group__5__Impl_in_rule__Node__Group__55487 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_rule__Node__Group__6_in_rule__Node__Group__55490 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_rule__Node__Group__5__Impl5518 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Node__Group__6__Impl_in_rule__Node__Group__65549 = new BitSet(new long[]{0x0000100000000020L});
    public static final BitSet FOLLOW_rule__Node__Group__7_in_rule__Node__Group__65552 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_rule__Node__Group__6__Impl5580 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Node__Group__7__Impl_in_rule__Node__Group__75611 = new BitSet(new long[]{0x0000100000000020L});
    public static final BitSet FOLLOW_rule__Node__Group__8_in_rule__Node__Group__75614 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Node__Group_7__0_in_rule__Node__Group__7__Impl5641 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Node__Group__8__Impl_in_rule__Node__Group__85672 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_rule__Node__Group__9_in_rule__Node__Group__85675 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_rule__Node__Group__8__Impl5703 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Node__Group__9__Impl_in_rule__Node__Group__95734 = new BitSet(new long[]{0x0001400000000000L});
    public static final BitSet FOLLOW_rule__Node__Group__10_in_rule__Node__Group__95737 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__Node__Group__9__Impl5765 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Node__Group__10__Impl_in_rule__Node__Group__105796 = new BitSet(new long[]{0x0001400000000000L});
    public static final BitSet FOLLOW_rule__Node__Group__11_in_rule__Node__Group__105799 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Node__Group_10__0_in_rule__Node__Group__10__Impl5826 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Node__Group__11__Impl_in_rule__Node__Group__115857 = new BitSet(new long[]{0x000E800000000020L});
    public static final BitSet FOLLOW_rule__Node__Group__12_in_rule__Node__Group__115860 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_rule__Node__Group__11__Impl5888 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Node__Group__12__Impl_in_rule__Node__Group__125919 = new BitSet(new long[]{0x000E800000000020L});
    public static final BitSet FOLLOW_rule__Node__Group__13_in_rule__Node__Group__125922 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Node__Alternatives_12_in_rule__Node__Group__12__Impl5949 = new BitSet(new long[]{0x000E000000000022L});
    public static final BitSet FOLLOW_rule__Node__Group__13__Impl_in_rule__Node__Group__135980 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_rule__Node__Group__14_in_rule__Node__Group__135983 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_rule__Node__Group__13__Impl6011 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Node__Group__14__Impl_in_rule__Node__Group__146042 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__Node__Group__14__Impl6071 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Node__Group_3__0__Impl_in_rule__Node__Group_3__06134 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_rule__Node__Group_3__1_in_rule__Node__Group_3__06137 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Node__InputsAssignment_3_0_in_rule__Node__Group_3__0__Impl6164 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Node__Group_3__1__Impl_in_rule__Node__Group_3__16194 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Node__Group_3_1__0_in_rule__Node__Group_3__1__Impl6221 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_rule__Node__Group_3_1__0__Impl_in_rule__Node__Group_3_1__06256 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Node__Group_3_1__1_in_rule__Node__Group_3_1__06259 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__Node__Group_3_1__0__Impl6287 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Node__Group_3_1__1__Impl_in_rule__Node__Group_3_1__16318 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Node__InputsAssignment_3_1_1_in_rule__Node__Group_3_1__1__Impl6345 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Node__Group_7__0__Impl_in_rule__Node__Group_7__06379 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_rule__Node__Group_7__1_in_rule__Node__Group_7__06382 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Node__OutputsAssignment_7_0_in_rule__Node__Group_7__0__Impl6409 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Node__Group_7__1__Impl_in_rule__Node__Group_7__16439 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Node__Group_7_1__0_in_rule__Node__Group_7__1__Impl6466 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_rule__Node__Group_7_1__0__Impl_in_rule__Node__Group_7_1__06501 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Node__Group_7_1__1_in_rule__Node__Group_7_1__06504 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__Node__Group_7_1__0__Impl6532 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Node__Group_7_1__1__Impl_in_rule__Node__Group_7_1__16563 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Node__OutputsAssignment_7_1_1_in_rule__Node__Group_7_1__1__Impl6590 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Node__Group_10__0__Impl_in_rule__Node__Group_10__06624 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Node__Group_10__1_in_rule__Node__Group_10__06627 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_rule__Node__Group_10__0__Impl6655 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Node__Group_10__1__Impl_in_rule__Node__Group_10__16686 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Node__Group_10_1__0_in_rule__Node__Group_10__1__Impl6713 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_rule__Node__Group_10_1__0__Impl_in_rule__Node__Group_10_1__06748 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_rule__Node__Group_10_1__1_in_rule__Node__Group_10_1__06751 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Node__LocalsAssignment_10_1_0_in_rule__Node__Group_10_1__0__Impl6778 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Node__Group_10_1__1__Impl_in_rule__Node__Group_10_1__16808 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__Node__Group_10_1__1__Impl6836 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VarGroup__Group__0__Impl_in_rule__VarGroup__Group__06871 = new BitSet(new long[]{0x0000004080000000L});
    public static final BitSet FOLLOW_rule__VarGroup__Group__1_in_rule__VarGroup__Group__06874 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VarGroup__VarsAssignment_0_in_rule__VarGroup__Group__0__Impl6901 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VarGroup__Group__1__Impl_in_rule__VarGroup__Group__16931 = new BitSet(new long[]{0x0000004080000000L});
    public static final BitSet FOLLOW_rule__VarGroup__Group__2_in_rule__VarGroup__Group__16934 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VarGroup__Group_1__0_in_rule__VarGroup__Group__1__Impl6961 = new BitSet(new long[]{0x0000004000000002L});
    public static final BitSet FOLLOW_rule__VarGroup__Group__2__Impl_in_rule__VarGroup__Group__26992 = new BitSet(new long[]{0x0000001E20000020L});
    public static final BitSet FOLLOW_rule__VarGroup__Group__3_in_rule__VarGroup__Group__26995 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__VarGroup__Group__2__Impl7023 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VarGroup__Group__3__Impl_in_rule__VarGroup__Group__37054 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VarGroup__TypeAssignment_3_in_rule__VarGroup__Group__3__Impl7081 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VarGroup__Group_1__0__Impl_in_rule__VarGroup__Group_1__07119 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__VarGroup__Group_1__1_in_rule__VarGroup__Group_1__07122 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_rule__VarGroup__Group_1__0__Impl7150 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VarGroup__Group_1__1__Impl_in_rule__VarGroup__Group_1__17181 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VarGroup__VarsAssignment_1_1_in_rule__VarGroup__Group_1__1__Impl7208 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Equation__Group__0__Impl_in_rule__Equation__Group__07242 = new BitSet(new long[]{0x0000004000040000L});
    public static final BitSet FOLLOW_rule__Equation__Group__1_in_rule__Equation__Group__07245 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Equation__LhsAssignment_0_in_rule__Equation__Group__0__Impl7272 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Equation__Group__1__Impl_in_rule__Equation__Group__17302 = new BitSet(new long[]{0x0000004000040000L});
    public static final BitSet FOLLOW_rule__Equation__Group__2_in_rule__Equation__Group__17305 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Equation__Group_1__0_in_rule__Equation__Group__1__Impl7332 = new BitSet(new long[]{0x0000004000000002L});
    public static final BitSet FOLLOW_rule__Equation__Group__2__Impl_in_rule__Equation__Group__27363 = new BitSet(new long[]{0x0010080006200070L});
    public static final BitSet FOLLOW_rule__Equation__Group__3_in_rule__Equation__Group__27366 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__Equation__Group__2__Impl7394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Equation__Group__3__Impl_in_rule__Equation__Group__37425 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_rule__Equation__Group__4_in_rule__Equation__Group__37428 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Equation__RhsAssignment_3_in_rule__Equation__Group__3__Impl7455 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Equation__Group__4__Impl_in_rule__Equation__Group__47485 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__Equation__Group__4__Impl7513 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Equation__Group_1__0__Impl_in_rule__Equation__Group_1__07554 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Equation__Group_1__1_in_rule__Equation__Group_1__07557 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_rule__Equation__Group_1__0__Impl7585 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Equation__Group_1__1__Impl_in_rule__Equation__Group_1__17616 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Equation__LhsAssignment_1_1_in_rule__Equation__Group_1__1__Impl7643 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Property__Group__0__Impl_in_rule__Property__Group__07677 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Property__Group__1_in_rule__Property__Group__07680 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_rule__Property__Group__0__Impl7708 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Property__Group__1__Impl_in_rule__Property__Group__17739 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_rule__Property__Group__2_in_rule__Property__Group__17742 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Property__RefAssignment_1_in_rule__Property__Group__1__Impl7769 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Property__Group__2__Impl_in_rule__Property__Group__27799 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__Property__Group__2__Impl7827 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Main__Group__0__Impl_in_rule__Main__Group__07864 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_rule__Main__Group__1_in_rule__Main__Group__07867 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_rule__Main__Group__0__Impl7895 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Main__Group__1__Impl_in_rule__Main__Group__17926 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__Main__Group__1__Impl7955 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Assertion__Group__0__Impl_in_rule__Assertion__Group__07992 = new BitSet(new long[]{0x0010080006200070L});
    public static final BitSet FOLLOW_rule__Assertion__Group__1_in_rule__Assertion__Group__07995 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_rule__Assertion__Group__0__Impl8023 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Assertion__Group__1__Impl_in_rule__Assertion__Group__18054 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_rule__Assertion__Group__2_in_rule__Assertion__Group__18057 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Assertion__ExprAssignment_1_in_rule__Assertion__Group__1__Impl8084 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Assertion__Group__2__Impl_in_rule__Assertion__Group__28114 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__Assertion__Group__2__Impl8142 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ArrowExpr__Group__0__Impl_in_rule__ArrowExpr__Group__08179 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_rule__ArrowExpr__Group__1_in_rule__ArrowExpr__Group__08182 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImpliesExpr_in_rule__ArrowExpr__Group__0__Impl8209 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ArrowExpr__Group__1__Impl_in_rule__ArrowExpr__Group__18238 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ArrowExpr__Group_1__0_in_rule__ArrowExpr__Group__1__Impl8265 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ArrowExpr__Group_1__0__Impl_in_rule__ArrowExpr__Group_1__08300 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ArrowExpr__Group_1_0__0_in_rule__ArrowExpr__Group_1__0__Impl8327 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ArrowExpr__Group_1_0__0__Impl_in_rule__ArrowExpr__Group_1_0__08359 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_rule__ArrowExpr__Group_1_0__1_in_rule__ArrowExpr__Group_1_0__08362 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ArrowExpr__Group_1_0__1__Impl_in_rule__ArrowExpr__Group_1_0__18420 = new BitSet(new long[]{0x0010080006200070L});
    public static final BitSet FOLLOW_rule__ArrowExpr__Group_1_0__2_in_rule__ArrowExpr__Group_1_0__18423 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ArrowExpr__OpAssignment_1_0_1_in_rule__ArrowExpr__Group_1_0__1__Impl8450 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ArrowExpr__Group_1_0__2__Impl_in_rule__ArrowExpr__Group_1_0__28480 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ArrowExpr__RightAssignment_1_0_2_in_rule__ArrowExpr__Group_1_0__2__Impl8507 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ImpliesExpr__Group__0__Impl_in_rule__ImpliesExpr__Group__08543 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_rule__ImpliesExpr__Group__1_in_rule__ImpliesExpr__Group__08546 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOrExpr_in_rule__ImpliesExpr__Group__0__Impl8573 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ImpliesExpr__Group__1__Impl_in_rule__ImpliesExpr__Group__18602 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ImpliesExpr__Group_1__0_in_rule__ImpliesExpr__Group__1__Impl8629 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ImpliesExpr__Group_1__0__Impl_in_rule__ImpliesExpr__Group_1__08664 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ImpliesExpr__Group_1_0__0_in_rule__ImpliesExpr__Group_1__0__Impl8691 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ImpliesExpr__Group_1_0__0__Impl_in_rule__ImpliesExpr__Group_1_0__08723 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_rule__ImpliesExpr__Group_1_0__1_in_rule__ImpliesExpr__Group_1_0__08726 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ImpliesExpr__Group_1_0__1__Impl_in_rule__ImpliesExpr__Group_1_0__18784 = new BitSet(new long[]{0x0010080006200070L});
    public static final BitSet FOLLOW_rule__ImpliesExpr__Group_1_0__2_in_rule__ImpliesExpr__Group_1_0__18787 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ImpliesExpr__OpAssignment_1_0_1_in_rule__ImpliesExpr__Group_1_0__1__Impl8814 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ImpliesExpr__Group_1_0__2__Impl_in_rule__ImpliesExpr__Group_1_0__28844 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ImpliesExpr__RightAssignment_1_0_2_in_rule__ImpliesExpr__Group_1_0__2__Impl8871 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OrExpr__Group__0__Impl_in_rule__OrExpr__Group__08907 = new BitSet(new long[]{0x0000000000003000L});
    public static final BitSet FOLLOW_rule__OrExpr__Group__1_in_rule__OrExpr__Group__08910 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAndExpr_in_rule__OrExpr__Group__0__Impl8937 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OrExpr__Group__1__Impl_in_rule__OrExpr__Group__18966 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OrExpr__Group_1__0_in_rule__OrExpr__Group__1__Impl8993 = new BitSet(new long[]{0x0000000000003002L});
    public static final BitSet FOLLOW_rule__OrExpr__Group_1__0__Impl_in_rule__OrExpr__Group_1__09028 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OrExpr__Group_1_0__0_in_rule__OrExpr__Group_1__0__Impl9055 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OrExpr__Group_1_0__0__Impl_in_rule__OrExpr__Group_1_0__09087 = new BitSet(new long[]{0x0000000000003000L});
    public static final BitSet FOLLOW_rule__OrExpr__Group_1_0__1_in_rule__OrExpr__Group_1_0__09090 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OrExpr__Group_1_0__1__Impl_in_rule__OrExpr__Group_1_0__19148 = new BitSet(new long[]{0x0010080006200070L});
    public static final BitSet FOLLOW_rule__OrExpr__Group_1_0__2_in_rule__OrExpr__Group_1_0__19151 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OrExpr__OpAssignment_1_0_1_in_rule__OrExpr__Group_1_0__1__Impl9178 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OrExpr__Group_1_0__2__Impl_in_rule__OrExpr__Group_1_0__29208 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OrExpr__RightAssignment_1_0_2_in_rule__OrExpr__Group_1_0__2__Impl9235 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AndExpr__Group__0__Impl_in_rule__AndExpr__Group__09271 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_rule__AndExpr__Group__1_in_rule__AndExpr__Group__09274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRelationalExpr_in_rule__AndExpr__Group__0__Impl9301 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AndExpr__Group__1__Impl_in_rule__AndExpr__Group__19330 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AndExpr__Group_1__0_in_rule__AndExpr__Group__1__Impl9357 = new BitSet(new long[]{0x0400000000000002L});
    public static final BitSet FOLLOW_rule__AndExpr__Group_1__0__Impl_in_rule__AndExpr__Group_1__09392 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AndExpr__Group_1_0__0_in_rule__AndExpr__Group_1__0__Impl9419 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AndExpr__Group_1_0__0__Impl_in_rule__AndExpr__Group_1_0__09451 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_rule__AndExpr__Group_1_0__1_in_rule__AndExpr__Group_1_0__09454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AndExpr__Group_1_0__1__Impl_in_rule__AndExpr__Group_1_0__19512 = new BitSet(new long[]{0x0010080006200070L});
    public static final BitSet FOLLOW_rule__AndExpr__Group_1_0__2_in_rule__AndExpr__Group_1_0__19515 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AndExpr__OpAssignment_1_0_1_in_rule__AndExpr__Group_1_0__1__Impl9542 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AndExpr__Group_1_0__2__Impl_in_rule__AndExpr__Group_1_0__29572 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AndExpr__RightAssignment_1_0_2_in_rule__AndExpr__Group_1_0__2__Impl9599 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RelationalExpr__Group__0__Impl_in_rule__RelationalExpr__Group__09635 = new BitSet(new long[]{0x00000000000FC000L});
    public static final BitSet FOLLOW_rule__RelationalExpr__Group__1_in_rule__RelationalExpr__Group__09638 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePlusExpr_in_rule__RelationalExpr__Group__0__Impl9665 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RelationalExpr__Group__1__Impl_in_rule__RelationalExpr__Group__19694 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RelationalExpr__Group_1__0_in_rule__RelationalExpr__Group__1__Impl9721 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RelationalExpr__Group_1__0__Impl_in_rule__RelationalExpr__Group_1__09756 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RelationalExpr__Group_1_0__0_in_rule__RelationalExpr__Group_1__0__Impl9783 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RelationalExpr__Group_1_0__0__Impl_in_rule__RelationalExpr__Group_1_0__09815 = new BitSet(new long[]{0x00000000000FC000L});
    public static final BitSet FOLLOW_rule__RelationalExpr__Group_1_0__1_in_rule__RelationalExpr__Group_1_0__09818 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RelationalExpr__Group_1_0__1__Impl_in_rule__RelationalExpr__Group_1_0__19876 = new BitSet(new long[]{0x0010080006200070L});
    public static final BitSet FOLLOW_rule__RelationalExpr__Group_1_0__2_in_rule__RelationalExpr__Group_1_0__19879 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RelationalExpr__OpAssignment_1_0_1_in_rule__RelationalExpr__Group_1_0__1__Impl9906 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RelationalExpr__Group_1_0__2__Impl_in_rule__RelationalExpr__Group_1_0__29936 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RelationalExpr__RightAssignment_1_0_2_in_rule__RelationalExpr__Group_1_0__2__Impl9963 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PlusExpr__Group__0__Impl_in_rule__PlusExpr__Group__09999 = new BitSet(new long[]{0x0000000000300000L});
    public static final BitSet FOLLOW_rule__PlusExpr__Group__1_in_rule__PlusExpr__Group__010002 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTimesExpr_in_rule__PlusExpr__Group__0__Impl10029 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PlusExpr__Group__1__Impl_in_rule__PlusExpr__Group__110058 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PlusExpr__Group_1__0_in_rule__PlusExpr__Group__1__Impl10085 = new BitSet(new long[]{0x0000000000300002L});
    public static final BitSet FOLLOW_rule__PlusExpr__Group_1__0__Impl_in_rule__PlusExpr__Group_1__010120 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PlusExpr__Group_1_0__0_in_rule__PlusExpr__Group_1__0__Impl10147 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PlusExpr__Group_1_0__0__Impl_in_rule__PlusExpr__Group_1_0__010179 = new BitSet(new long[]{0x0000000000300000L});
    public static final BitSet FOLLOW_rule__PlusExpr__Group_1_0__1_in_rule__PlusExpr__Group_1_0__010182 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PlusExpr__Group_1_0__1__Impl_in_rule__PlusExpr__Group_1_0__110240 = new BitSet(new long[]{0x0010080006200070L});
    public static final BitSet FOLLOW_rule__PlusExpr__Group_1_0__2_in_rule__PlusExpr__Group_1_0__110243 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PlusExpr__OpAssignment_1_0_1_in_rule__PlusExpr__Group_1_0__1__Impl10270 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PlusExpr__Group_1_0__2__Impl_in_rule__PlusExpr__Group_1_0__210300 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PlusExpr__RightAssignment_1_0_2_in_rule__PlusExpr__Group_1_0__2__Impl10327 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TimesExpr__Group__0__Impl_in_rule__TimesExpr__Group__010363 = new BitSet(new long[]{0x0000000001C00000L});
    public static final BitSet FOLLOW_rule__TimesExpr__Group__1_in_rule__TimesExpr__Group__010366 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrefixExpr_in_rule__TimesExpr__Group__0__Impl10393 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TimesExpr__Group__1__Impl_in_rule__TimesExpr__Group__110422 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TimesExpr__Group_1__0_in_rule__TimesExpr__Group__1__Impl10449 = new BitSet(new long[]{0x0000000001C00002L});
    public static final BitSet FOLLOW_rule__TimesExpr__Group_1__0__Impl_in_rule__TimesExpr__Group_1__010484 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TimesExpr__Group_1_0__0_in_rule__TimesExpr__Group_1__0__Impl10511 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TimesExpr__Group_1_0__0__Impl_in_rule__TimesExpr__Group_1_0__010543 = new BitSet(new long[]{0x0000000001C00000L});
    public static final BitSet FOLLOW_rule__TimesExpr__Group_1_0__1_in_rule__TimesExpr__Group_1_0__010546 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TimesExpr__Group_1_0__1__Impl_in_rule__TimesExpr__Group_1_0__110604 = new BitSet(new long[]{0x0010080006200070L});
    public static final BitSet FOLLOW_rule__TimesExpr__Group_1_0__2_in_rule__TimesExpr__Group_1_0__110607 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TimesExpr__OpAssignment_1_0_1_in_rule__TimesExpr__Group_1_0__1__Impl10634 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TimesExpr__Group_1_0__2__Impl_in_rule__TimesExpr__Group_1_0__210664 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TimesExpr__RightAssignment_1_0_2_in_rule__TimesExpr__Group_1_0__2__Impl10691 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PrefixExpr__Group_0__0__Impl_in_rule__PrefixExpr__Group_0__010727 = new BitSet(new long[]{0x0000000006200000L});
    public static final BitSet FOLLOW_rule__PrefixExpr__Group_0__1_in_rule__PrefixExpr__Group_0__010730 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PrefixExpr__Group_0__1__Impl_in_rule__PrefixExpr__Group_0__110788 = new BitSet(new long[]{0x0010080006200070L});
    public static final BitSet FOLLOW_rule__PrefixExpr__Group_0__2_in_rule__PrefixExpr__Group_0__110791 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PrefixExpr__OpAssignment_0_1_in_rule__PrefixExpr__Group_0__1__Impl10818 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PrefixExpr__Group_0__2__Impl_in_rule__PrefixExpr__Group_0__210848 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PrefixExpr__ExprAssignment_0_2_in_rule__PrefixExpr__Group_0__2__Impl10875 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AtomicExpr__Group_0__0__Impl_in_rule__AtomicExpr__Group_0__010911 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__AtomicExpr__Group_0__1_in_rule__AtomicExpr__Group_0__010914 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AtomicExpr__Group_0__1__Impl_in_rule__AtomicExpr__Group_0__110972 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AtomicExpr__IdAssignment_0_1_in_rule__AtomicExpr__Group_0__1__Impl10999 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AtomicExpr__Group_1__0__Impl_in_rule__AtomicExpr__Group_1__011033 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__AtomicExpr__Group_1__1_in_rule__AtomicExpr__Group_1__011036 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AtomicExpr__Group_1__1__Impl_in_rule__AtomicExpr__Group_1__111094 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AtomicExpr__ValAssignment_1_1_in_rule__AtomicExpr__Group_1__1__Impl11121 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AtomicExpr__Group_2__0__Impl_in_rule__AtomicExpr__Group_2__011155 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__AtomicExpr__Group_2__1_in_rule__AtomicExpr__Group_2__011158 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AtomicExpr__Group_2__1__Impl_in_rule__AtomicExpr__Group_2__111216 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AtomicExpr__ValAssignment_2_1_in_rule__AtomicExpr__Group_2__1__Impl11243 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AtomicExpr__Group_3__0__Impl_in_rule__AtomicExpr__Group_3__011277 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__AtomicExpr__Group_3__1_in_rule__AtomicExpr__Group_3__011280 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AtomicExpr__Group_3__1__Impl_in_rule__AtomicExpr__Group_3__111338 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AtomicExpr__ValAssignment_3_1_in_rule__AtomicExpr__Group_3__1__Impl11365 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AtomicExpr__Group_4__0__Impl_in_rule__AtomicExpr__Group_4__011399 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_rule__AtomicExpr__Group_4__1_in_rule__AtomicExpr__Group_4__011402 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AtomicExpr__Group_4__1__Impl_in_rule__AtomicExpr__Group_4__111460 = new BitSet(new long[]{0x0010080006200070L});
    public static final BitSet FOLLOW_rule__AtomicExpr__Group_4__2_in_rule__AtomicExpr__Group_4__111463 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_rule__AtomicExpr__Group_4__1__Impl11491 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AtomicExpr__Group_4__2__Impl_in_rule__AtomicExpr__Group_4__211522 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_rule__AtomicExpr__Group_4__3_in_rule__AtomicExpr__Group_4__211525 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AtomicExpr__CondAssignment_4_2_in_rule__AtomicExpr__Group_4__2__Impl11552 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AtomicExpr__Group_4__3__Impl_in_rule__AtomicExpr__Group_4__311582 = new BitSet(new long[]{0x0010080006200070L});
    public static final BitSet FOLLOW_rule__AtomicExpr__Group_4__4_in_rule__AtomicExpr__Group_4__311585 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_rule__AtomicExpr__Group_4__3__Impl11613 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AtomicExpr__Group_4__4__Impl_in_rule__AtomicExpr__Group_4__411644 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_rule__AtomicExpr__Group_4__5_in_rule__AtomicExpr__Group_4__411647 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AtomicExpr__ThenAssignment_4_4_in_rule__AtomicExpr__Group_4__4__Impl11674 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AtomicExpr__Group_4__5__Impl_in_rule__AtomicExpr__Group_4__511704 = new BitSet(new long[]{0x0010080006200070L});
    public static final BitSet FOLLOW_rule__AtomicExpr__Group_4__6_in_rule__AtomicExpr__Group_4__511707 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_54_in_rule__AtomicExpr__Group_4__5__Impl11735 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AtomicExpr__Group_4__6__Impl_in_rule__AtomicExpr__Group_4__611766 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AtomicExpr__ElseAssignment_4_6_in_rule__AtomicExpr__Group_4__6__Impl11793 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AtomicExpr__Group_5__0__Impl_in_rule__AtomicExpr__Group_5__011837 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__AtomicExpr__Group_5__1_in_rule__AtomicExpr__Group_5__011840 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AtomicExpr__Group_5__1__Impl_in_rule__AtomicExpr__Group_5__111898 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_rule__AtomicExpr__Group_5__2_in_rule__AtomicExpr__Group_5__111901 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AtomicExpr__NodeAssignment_5_1_in_rule__AtomicExpr__Group_5__1__Impl11928 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AtomicExpr__Group_5__2__Impl_in_rule__AtomicExpr__Group_5__211958 = new BitSet(new long[]{0x0010180006200070L});
    public static final BitSet FOLLOW_rule__AtomicExpr__Group_5__3_in_rule__AtomicExpr__Group_5__211961 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_rule__AtomicExpr__Group_5__2__Impl11989 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AtomicExpr__Group_5__3__Impl_in_rule__AtomicExpr__Group_5__312020 = new BitSet(new long[]{0x0010180006200070L});
    public static final BitSet FOLLOW_rule__AtomicExpr__Group_5__4_in_rule__AtomicExpr__Group_5__312023 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AtomicExpr__Group_5_3__0_in_rule__AtomicExpr__Group_5__3__Impl12050 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AtomicExpr__Group_5__4__Impl_in_rule__AtomicExpr__Group_5__412081 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_rule__AtomicExpr__Group_5__4__Impl12109 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AtomicExpr__Group_5_3__0__Impl_in_rule__AtomicExpr__Group_5_3__012150 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_rule__AtomicExpr__Group_5_3__1_in_rule__AtomicExpr__Group_5_3__012153 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AtomicExpr__ArgsAssignment_5_3_0_in_rule__AtomicExpr__Group_5_3__0__Impl12180 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AtomicExpr__Group_5_3__1__Impl_in_rule__AtomicExpr__Group_5_3__112210 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AtomicExpr__Group_5_3_1__0_in_rule__AtomicExpr__Group_5_3__1__Impl12237 = new BitSet(new long[]{0x0000004000000002L});
    public static final BitSet FOLLOW_rule__AtomicExpr__Group_5_3_1__0__Impl_in_rule__AtomicExpr__Group_5_3_1__012272 = new BitSet(new long[]{0x0010080006200070L});
    public static final BitSet FOLLOW_rule__AtomicExpr__Group_5_3_1__1_in_rule__AtomicExpr__Group_5_3_1__012275 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_rule__AtomicExpr__Group_5_3_1__0__Impl12303 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AtomicExpr__Group_5_3_1__1__Impl_in_rule__AtomicExpr__Group_5_3_1__112334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AtomicExpr__ArgsAssignment_5_3_1_1_in_rule__AtomicExpr__Group_5_3_1__1__Impl12361 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AtomicExpr__Group_6__0__Impl_in_rule__AtomicExpr__Group_6__012395 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__AtomicExpr__Group_6__1_in_rule__AtomicExpr__Group_6__012398 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AtomicExpr__Group_6__1__Impl_in_rule__AtomicExpr__Group_6__112456 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_rule__AtomicExpr__Group_6__2_in_rule__AtomicExpr__Group_6__112459 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AtomicExpr__IdAssignment_6_1_in_rule__AtomicExpr__Group_6__1__Impl12486 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AtomicExpr__Group_6__2__Impl_in_rule__AtomicExpr__Group_6__212516 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__AtomicExpr__Group_6__3_in_rule__AtomicExpr__Group_6__212519 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__AtomicExpr__Group_6__2__Impl12547 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AtomicExpr__Group_6__3__Impl_in_rule__AtomicExpr__Group_6__312578 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_rule__AtomicExpr__Group_6__4_in_rule__AtomicExpr__Group_6__312581 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AtomicExpr__FieldsAssignment_6_3_in_rule__AtomicExpr__Group_6__3__Impl12608 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AtomicExpr__Group_6__4__Impl_in_rule__AtomicExpr__Group_6__412638 = new BitSet(new long[]{0x0010080006200070L});
    public static final BitSet FOLLOW_rule__AtomicExpr__Group_6__5_in_rule__AtomicExpr__Group_6__412641 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__AtomicExpr__Group_6__4__Impl12669 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AtomicExpr__Group_6__5__Impl_in_rule__AtomicExpr__Group_6__512700 = new BitSet(new long[]{0x0000000110000000L});
    public static final BitSet FOLLOW_rule__AtomicExpr__Group_6__6_in_rule__AtomicExpr__Group_6__512703 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AtomicExpr__ExprsAssignment_6_5_in_rule__AtomicExpr__Group_6__5__Impl12730 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AtomicExpr__Group_6__6__Impl_in_rule__AtomicExpr__Group_6__612760 = new BitSet(new long[]{0x0000000110000000L});
    public static final BitSet FOLLOW_rule__AtomicExpr__Group_6__7_in_rule__AtomicExpr__Group_6__612763 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AtomicExpr__Group_6_6__0_in_rule__AtomicExpr__Group_6__6__Impl12790 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_rule__AtomicExpr__Group_6__7__Impl_in_rule__AtomicExpr__Group_6__712821 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__AtomicExpr__Group_6__7__Impl12849 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AtomicExpr__Group_6_6__0__Impl_in_rule__AtomicExpr__Group_6_6__012896 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__AtomicExpr__Group_6_6__1_in_rule__AtomicExpr__Group_6_6__012899 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__AtomicExpr__Group_6_6__0__Impl12927 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AtomicExpr__Group_6_6__1__Impl_in_rule__AtomicExpr__Group_6_6__112958 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_rule__AtomicExpr__Group_6_6__2_in_rule__AtomicExpr__Group_6_6__112961 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AtomicExpr__FieldsAssignment_6_6_1_in_rule__AtomicExpr__Group_6_6__1__Impl12988 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AtomicExpr__Group_6_6__2__Impl_in_rule__AtomicExpr__Group_6_6__213018 = new BitSet(new long[]{0x0010080006200070L});
    public static final BitSet FOLLOW_rule__AtomicExpr__Group_6_6__3_in_rule__AtomicExpr__Group_6_6__213021 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__AtomicExpr__Group_6_6__2__Impl13049 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AtomicExpr__Group_6_6__3__Impl_in_rule__AtomicExpr__Group_6_6__313080 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AtomicExpr__ExprsAssignment_6_6_3_in_rule__AtomicExpr__Group_6_6__3__Impl13107 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AtomicExpr__Group_7__0__Impl_in_rule__AtomicExpr__Group_7__013145 = new BitSet(new long[]{0x0010080006200070L});
    public static final BitSet FOLLOW_rule__AtomicExpr__Group_7__1_in_rule__AtomicExpr__Group_7__013148 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_rule__AtomicExpr__Group_7__0__Impl13176 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AtomicExpr__Group_7__1__Impl_in_rule__AtomicExpr__Group_7__113207 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_rule__AtomicExpr__Group_7__2_in_rule__AtomicExpr__Group_7__113210 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpr_in_rule__AtomicExpr__Group_7__1__Impl13237 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AtomicExpr__Group_7__2__Impl_in_rule__AtomicExpr__Group_7__213266 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_rule__AtomicExpr__Group_7__2__Impl13294 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__REAL__Group__0__Impl_in_rule__REAL__Group__013331 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_rule__REAL__Group__1_in_rule__REAL__Group__013334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__REAL__Group__0__Impl13361 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__REAL__Group__1__Impl_in_rule__REAL__Group__113390 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__REAL__Group__2_in_rule__REAL__Group__113393 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_rule__REAL__Group__1__Impl13421 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__REAL__Group__2__Impl_in_rule__REAL__Group__213452 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__REAL__Group__2__Impl13479 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypedef_in_rule__File__TypedefsAssignment_013519 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConstant_in_rule__File__ConstantsAssignment_113550 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNode_in_rule__File__NodesAssignment_213581 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Typedef__NameAssignment_113612 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTopLevelType_in_rule__Typedef__TypeAssignment_313643 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__TopLevelType__FieldsAssignment_0_313674 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__TopLevelType__TypesAssignment_0_513709 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__TopLevelType__FieldsAssignment_0_6_113744 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__TopLevelType__TypesAssignment_0_6_313779 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBound_in_rule__Type__LowAssignment_3_313814 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBound_in_rule__Type__HighAssignment_3_513845 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Type__DefAssignment_4_113880 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Constant__NameAssignment_113915 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_rule__Constant__TypeAssignment_2_113946 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpr_in_rule__Constant__ExprAssignment_413977 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Node__NameAssignment_114008 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVarGroup_in_rule__Node__InputsAssignment_3_014039 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVarGroup_in_rule__Node__InputsAssignment_3_1_114070 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVarGroup_in_rule__Node__OutputsAssignment_7_014101 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVarGroup_in_rule__Node__OutputsAssignment_7_1_114132 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVarGroup_in_rule__Node__LocalsAssignment_10_1_014163 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEquation_in_rule__Node__EquationsAssignment_12_014194 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProperty_in_rule__Node__PropertiesAssignment_12_114225 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAssertion_in_rule__Node__AssertionsAssignment_12_214256 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMain_in_rule__Node__MainAssignment_12_314287 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVar_in_rule__VarGroup__VarsAssignment_014318 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVar_in_rule__VarGroup__VarsAssignment_1_114349 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_rule__VarGroup__TypeAssignment_314380 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Var__NameAssignment14411 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Equation__LhsAssignment_014446 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Equation__LhsAssignment_1_114485 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpr_in_rule__Equation__RhsAssignment_314520 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Property__RefAssignment_114555 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpr_in_rule__Assertion__ExprAssignment_114590 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_56_in_rule__ArrowExpr__OpAssignment_1_0_114626 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleArrowExpr_in_rule__ArrowExpr__RightAssignment_1_0_214665 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_57_in_rule__ImpliesExpr__OpAssignment_1_0_114701 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImpliesExpr_in_rule__ImpliesExpr__RightAssignment_1_0_214740 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OrExpr__OpAlternatives_1_0_1_0_in_rule__OrExpr__OpAssignment_1_0_114771 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAndExpr_in_rule__OrExpr__RightAssignment_1_0_214804 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_58_in_rule__AndExpr__OpAssignment_1_0_114840 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRelationalExpr_in_rule__AndExpr__RightAssignment_1_0_214879 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RelationalExpr__OpAlternatives_1_0_1_0_in_rule__RelationalExpr__OpAssignment_1_0_114910 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePlusExpr_in_rule__RelationalExpr__RightAssignment_1_0_214943 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PlusExpr__OpAlternatives_1_0_1_0_in_rule__PlusExpr__OpAssignment_1_0_114974 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTimesExpr_in_rule__PlusExpr__RightAssignment_1_0_215007 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TimesExpr__OpAlternatives_1_0_1_0_in_rule__TimesExpr__OpAssignment_1_0_115038 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrefixExpr_in_rule__TimesExpr__RightAssignment_1_0_215071 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PrefixExpr__OpAlternatives_0_1_0_in_rule__PrefixExpr__OpAssignment_0_115102 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrefixExpr_in_rule__PrefixExpr__ExprAssignment_0_215135 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__AtomicExpr__IdAssignment_0_115170 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__AtomicExpr__ValAssignment_1_115205 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleREAL_in_rule__AtomicExpr__ValAssignment_2_115236 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_BOOL_in_rule__AtomicExpr__ValAssignment_3_115267 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpr_in_rule__AtomicExpr__CondAssignment_4_215298 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpr_in_rule__AtomicExpr__ThenAssignment_4_415329 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpr_in_rule__AtomicExpr__ElseAssignment_4_615360 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__AtomicExpr__NodeAssignment_5_115395 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpr_in_rule__AtomicExpr__ArgsAssignment_5_3_015430 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpr_in_rule__AtomicExpr__ArgsAssignment_5_3_1_115461 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__AtomicExpr__IdAssignment_6_115496 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__AtomicExpr__FieldsAssignment_6_315531 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpr_in_rule__AtomicExpr__ExprsAssignment_6_515562 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__AtomicExpr__FieldsAssignment_6_6_115593 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpr_in_rule__AtomicExpr__ExprsAssignment_6_6_315624 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ArrowExpr__Group_1__0_in_synpred44_InternalJKind8265 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ImpliesExpr__Group_1__0_in_synpred45_InternalJKind8629 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OrExpr__Group_1__0_in_synpred46_InternalJKind8993 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AndExpr__Group_1__0_in_synpred47_InternalJKind9357 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RelationalExpr__Group_1__0_in_synpred48_InternalJKind9721 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PlusExpr__Group_1__0_in_synpred49_InternalJKind10085 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TimesExpr__Group_1__0_in_synpred50_InternalJKind10449 = new BitSet(new long[]{0x0000000000000002L});

}