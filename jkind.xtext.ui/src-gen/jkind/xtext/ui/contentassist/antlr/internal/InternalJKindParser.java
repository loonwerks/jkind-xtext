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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INT", "RULE_ID", "RULE_BOOL", "RULE_SL_COMMENT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'or'", "'xor'", "'<'", "'<='", "'>'", "'>='", "'='", "'<>'", "'+'", "'-'", "'*'", "'/'", "'div'", "'not'", "'pre'", "'type'", "';'", "'struct'", "'{'", "':'", "'}'", "'int'", "'bool'", "'real'", "'subrange'", "'['", "','", "']'", "'of'", "'const'", "'node'", "'('", "')'", "'returns'", "'let'", "'tel'", "'var'", "'--%PROPERTY'", "'--%MAIN'", "'assert'", "'.'", "'if'", "'then'", "'else'", "'->'", "'=>'", "'and'"
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:229:1: entryRuleNode : ruleNode EOF ;
    public final void entryRuleNode() throws RecognitionException {
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:230:1: ( ruleNode EOF )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:231:1: ruleNode EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNodeRule()); 
            }
            pushFollow(FOLLOW_ruleNode_in_entryRuleNode428);
            ruleNode();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getNodeRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleNode435); if (state.failed) return ;

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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:238:1: ruleNode : ( ( rule__Node__Group__0 ) ) ;
    public final void ruleNode() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:242:2: ( ( ( rule__Node__Group__0 ) ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:243:1: ( ( rule__Node__Group__0 ) )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:243:1: ( ( rule__Node__Group__0 ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:244:1: ( rule__Node__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNodeAccess().getGroup()); 
            }
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:245:1: ( rule__Node__Group__0 )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:245:2: rule__Node__Group__0
            {
            pushFollow(FOLLOW_rule__Node__Group__0_in_ruleNode461);
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


    // $ANTLR start "entryRuleVariableGroup"
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:257:1: entryRuleVariableGroup : ruleVariableGroup EOF ;
    public final void entryRuleVariableGroup() throws RecognitionException {
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:258:1: ( ruleVariableGroup EOF )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:259:1: ruleVariableGroup EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariableGroupRule()); 
            }
            pushFollow(FOLLOW_ruleVariableGroup_in_entryRuleVariableGroup488);
            ruleVariableGroup();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getVariableGroupRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleVariableGroup495); if (state.failed) return ;

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
    // $ANTLR end "entryRuleVariableGroup"


    // $ANTLR start "ruleVariableGroup"
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:266:1: ruleVariableGroup : ( ( rule__VariableGroup__Group__0 ) ) ;
    public final void ruleVariableGroup() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:270:2: ( ( ( rule__VariableGroup__Group__0 ) ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:271:1: ( ( rule__VariableGroup__Group__0 ) )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:271:1: ( ( rule__VariableGroup__Group__0 ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:272:1: ( rule__VariableGroup__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariableGroupAccess().getGroup()); 
            }
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:273:1: ( rule__VariableGroup__Group__0 )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:273:2: rule__VariableGroup__Group__0
            {
            pushFollow(FOLLOW_rule__VariableGroup__Group__0_in_ruleVariableGroup521);
            rule__VariableGroup__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getVariableGroupAccess().getGroup()); 
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
    // $ANTLR end "ruleVariableGroup"


    // $ANTLR start "entryRuleVariable"
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:285:1: entryRuleVariable : ruleVariable EOF ;
    public final void entryRuleVariable() throws RecognitionException {
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:286:1: ( ruleVariable EOF )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:287:1: ruleVariable EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariableRule()); 
            }
            pushFollow(FOLLOW_ruleVariable_in_entryRuleVariable548);
            ruleVariable();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getVariableRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleVariable555); if (state.failed) return ;

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
    // $ANTLR end "entryRuleVariable"


    // $ANTLR start "ruleVariable"
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:294:1: ruleVariable : ( ( rule__Variable__NameAssignment ) ) ;
    public final void ruleVariable() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:298:2: ( ( ( rule__Variable__NameAssignment ) ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:299:1: ( ( rule__Variable__NameAssignment ) )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:299:1: ( ( rule__Variable__NameAssignment ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:300:1: ( rule__Variable__NameAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariableAccess().getNameAssignment()); 
            }
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:301:1: ( rule__Variable__NameAssignment )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:301:2: rule__Variable__NameAssignment
            {
            pushFollow(FOLLOW_rule__Variable__NameAssignment_in_ruleVariable581);
            rule__Variable__NameAssignment();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getVariableAccess().getNameAssignment()); 
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
    // $ANTLR end "ruleVariable"


    // $ANTLR start "entryRuleEquation"
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:313:1: entryRuleEquation : ruleEquation EOF ;
    public final void entryRuleEquation() throws RecognitionException {
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:314:1: ( ruleEquation EOF )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:315:1: ruleEquation EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEquationRule()); 
            }
            pushFollow(FOLLOW_ruleEquation_in_entryRuleEquation608);
            ruleEquation();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEquationRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleEquation615); if (state.failed) return ;

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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:322:1: ruleEquation : ( ( rule__Equation__Group__0 ) ) ;
    public final void ruleEquation() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:326:2: ( ( ( rule__Equation__Group__0 ) ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:327:1: ( ( rule__Equation__Group__0 ) )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:327:1: ( ( rule__Equation__Group__0 ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:328:1: ( rule__Equation__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEquationAccess().getGroup()); 
            }
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:329:1: ( rule__Equation__Group__0 )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:329:2: rule__Equation__Group__0
            {
            pushFollow(FOLLOW_rule__Equation__Group__0_in_ruleEquation641);
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:341:1: entryRuleProperty : ruleProperty EOF ;
    public final void entryRuleProperty() throws RecognitionException {
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:342:1: ( ruleProperty EOF )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:343:1: ruleProperty EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPropertyRule()); 
            }
            pushFollow(FOLLOW_ruleProperty_in_entryRuleProperty668);
            ruleProperty();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPropertyRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleProperty675); if (state.failed) return ;

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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:350:1: ruleProperty : ( ( rule__Property__Group__0 ) ) ;
    public final void ruleProperty() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:354:2: ( ( ( rule__Property__Group__0 ) ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:355:1: ( ( rule__Property__Group__0 ) )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:355:1: ( ( rule__Property__Group__0 ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:356:1: ( rule__Property__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPropertyAccess().getGroup()); 
            }
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:357:1: ( rule__Property__Group__0 )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:357:2: rule__Property__Group__0
            {
            pushFollow(FOLLOW_rule__Property__Group__0_in_ruleProperty701);
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:369:1: entryRuleMain : ruleMain EOF ;
    public final void entryRuleMain() throws RecognitionException {
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:370:1: ( ruleMain EOF )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:371:1: ruleMain EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMainRule()); 
            }
            pushFollow(FOLLOW_ruleMain_in_entryRuleMain728);
            ruleMain();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMainRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleMain735); if (state.failed) return ;

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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:378:1: ruleMain : ( ( rule__Main__Group__0 ) ) ;
    public final void ruleMain() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:382:2: ( ( ( rule__Main__Group__0 ) ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:383:1: ( ( rule__Main__Group__0 ) )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:383:1: ( ( rule__Main__Group__0 ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:384:1: ( rule__Main__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMainAccess().getGroup()); 
            }
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:385:1: ( rule__Main__Group__0 )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:385:2: rule__Main__Group__0
            {
            pushFollow(FOLLOW_rule__Main__Group__0_in_ruleMain761);
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:397:1: entryRuleAssertion : ruleAssertion EOF ;
    public final void entryRuleAssertion() throws RecognitionException {
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:398:1: ( ruleAssertion EOF )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:399:1: ruleAssertion EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAssertionRule()); 
            }
            pushFollow(FOLLOW_ruleAssertion_in_entryRuleAssertion788);
            ruleAssertion();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAssertionRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAssertion795); if (state.failed) return ;

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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:406:1: ruleAssertion : ( ( rule__Assertion__Group__0 ) ) ;
    public final void ruleAssertion() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:410:2: ( ( ( rule__Assertion__Group__0 ) ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:411:1: ( ( rule__Assertion__Group__0 ) )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:411:1: ( ( rule__Assertion__Group__0 ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:412:1: ( rule__Assertion__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAssertionAccess().getGroup()); 
            }
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:413:1: ( rule__Assertion__Group__0 )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:413:2: rule__Assertion__Group__0
            {
            pushFollow(FOLLOW_rule__Assertion__Group__0_in_ruleAssertion821);
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:425:1: entryRuleExpr : ruleExpr EOF ;
    public final void entryRuleExpr() throws RecognitionException {
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:426:1: ( ruleExpr EOF )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:427:1: ruleExpr EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExprRule()); 
            }
            pushFollow(FOLLOW_ruleExpr_in_entryRuleExpr848);
            ruleExpr();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExprRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleExpr855); if (state.failed) return ;

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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:434:1: ruleExpr : ( ruleArrowExpr ) ;
    public final void ruleExpr() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:438:2: ( ( ruleArrowExpr ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:439:1: ( ruleArrowExpr )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:439:1: ( ruleArrowExpr )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:440:1: ruleArrowExpr
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExprAccess().getArrowExprParserRuleCall()); 
            }
            pushFollow(FOLLOW_ruleArrowExpr_in_ruleExpr881);
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:453:1: entryRuleArrowExpr : ruleArrowExpr EOF ;
    public final void entryRuleArrowExpr() throws RecognitionException {
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:454:1: ( ruleArrowExpr EOF )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:455:1: ruleArrowExpr EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getArrowExprRule()); 
            }
            pushFollow(FOLLOW_ruleArrowExpr_in_entryRuleArrowExpr907);
            ruleArrowExpr();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getArrowExprRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleArrowExpr914); if (state.failed) return ;

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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:462:1: ruleArrowExpr : ( ( rule__ArrowExpr__Group__0 ) ) ;
    public final void ruleArrowExpr() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:466:2: ( ( ( rule__ArrowExpr__Group__0 ) ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:467:1: ( ( rule__ArrowExpr__Group__0 ) )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:467:1: ( ( rule__ArrowExpr__Group__0 ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:468:1: ( rule__ArrowExpr__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getArrowExprAccess().getGroup()); 
            }
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:469:1: ( rule__ArrowExpr__Group__0 )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:469:2: rule__ArrowExpr__Group__0
            {
            pushFollow(FOLLOW_rule__ArrowExpr__Group__0_in_ruleArrowExpr940);
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:481:1: entryRuleImpliesExpr : ruleImpliesExpr EOF ;
    public final void entryRuleImpliesExpr() throws RecognitionException {
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:482:1: ( ruleImpliesExpr EOF )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:483:1: ruleImpliesExpr EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getImpliesExprRule()); 
            }
            pushFollow(FOLLOW_ruleImpliesExpr_in_entryRuleImpliesExpr967);
            ruleImpliesExpr();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getImpliesExprRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleImpliesExpr974); if (state.failed) return ;

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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:490:1: ruleImpliesExpr : ( ( rule__ImpliesExpr__Group__0 ) ) ;
    public final void ruleImpliesExpr() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:494:2: ( ( ( rule__ImpliesExpr__Group__0 ) ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:495:1: ( ( rule__ImpliesExpr__Group__0 ) )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:495:1: ( ( rule__ImpliesExpr__Group__0 ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:496:1: ( rule__ImpliesExpr__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getImpliesExprAccess().getGroup()); 
            }
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:497:1: ( rule__ImpliesExpr__Group__0 )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:497:2: rule__ImpliesExpr__Group__0
            {
            pushFollow(FOLLOW_rule__ImpliesExpr__Group__0_in_ruleImpliesExpr1000);
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:509:1: entryRuleOrExpr : ruleOrExpr EOF ;
    public final void entryRuleOrExpr() throws RecognitionException {
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:510:1: ( ruleOrExpr EOF )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:511:1: ruleOrExpr EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOrExprRule()); 
            }
            pushFollow(FOLLOW_ruleOrExpr_in_entryRuleOrExpr1027);
            ruleOrExpr();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getOrExprRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOrExpr1034); if (state.failed) return ;

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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:518:1: ruleOrExpr : ( ( rule__OrExpr__Group__0 ) ) ;
    public final void ruleOrExpr() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:522:2: ( ( ( rule__OrExpr__Group__0 ) ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:523:1: ( ( rule__OrExpr__Group__0 ) )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:523:1: ( ( rule__OrExpr__Group__0 ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:524:1: ( rule__OrExpr__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOrExprAccess().getGroup()); 
            }
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:525:1: ( rule__OrExpr__Group__0 )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:525:2: rule__OrExpr__Group__0
            {
            pushFollow(FOLLOW_rule__OrExpr__Group__0_in_ruleOrExpr1060);
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:537:1: entryRuleAndExpr : ruleAndExpr EOF ;
    public final void entryRuleAndExpr() throws RecognitionException {
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:538:1: ( ruleAndExpr EOF )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:539:1: ruleAndExpr EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAndExprRule()); 
            }
            pushFollow(FOLLOW_ruleAndExpr_in_entryRuleAndExpr1087);
            ruleAndExpr();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAndExprRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAndExpr1094); if (state.failed) return ;

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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:546:1: ruleAndExpr : ( ( rule__AndExpr__Group__0 ) ) ;
    public final void ruleAndExpr() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:550:2: ( ( ( rule__AndExpr__Group__0 ) ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:551:1: ( ( rule__AndExpr__Group__0 ) )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:551:1: ( ( rule__AndExpr__Group__0 ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:552:1: ( rule__AndExpr__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAndExprAccess().getGroup()); 
            }
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:553:1: ( rule__AndExpr__Group__0 )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:553:2: rule__AndExpr__Group__0
            {
            pushFollow(FOLLOW_rule__AndExpr__Group__0_in_ruleAndExpr1120);
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:565:1: entryRuleRelationalExpr : ruleRelationalExpr EOF ;
    public final void entryRuleRelationalExpr() throws RecognitionException {
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:566:1: ( ruleRelationalExpr EOF )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:567:1: ruleRelationalExpr EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRelationalExprRule()); 
            }
            pushFollow(FOLLOW_ruleRelationalExpr_in_entryRuleRelationalExpr1147);
            ruleRelationalExpr();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRelationalExprRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleRelationalExpr1154); if (state.failed) return ;

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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:574:1: ruleRelationalExpr : ( ( rule__RelationalExpr__Group__0 ) ) ;
    public final void ruleRelationalExpr() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:578:2: ( ( ( rule__RelationalExpr__Group__0 ) ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:579:1: ( ( rule__RelationalExpr__Group__0 ) )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:579:1: ( ( rule__RelationalExpr__Group__0 ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:580:1: ( rule__RelationalExpr__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRelationalExprAccess().getGroup()); 
            }
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:581:1: ( rule__RelationalExpr__Group__0 )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:581:2: rule__RelationalExpr__Group__0
            {
            pushFollow(FOLLOW_rule__RelationalExpr__Group__0_in_ruleRelationalExpr1180);
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:593:1: entryRulePlusExpr : rulePlusExpr EOF ;
    public final void entryRulePlusExpr() throws RecognitionException {
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:594:1: ( rulePlusExpr EOF )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:595:1: rulePlusExpr EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPlusExprRule()); 
            }
            pushFollow(FOLLOW_rulePlusExpr_in_entryRulePlusExpr1207);
            rulePlusExpr();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPlusExprRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulePlusExpr1214); if (state.failed) return ;

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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:602:1: rulePlusExpr : ( ( rule__PlusExpr__Group__0 ) ) ;
    public final void rulePlusExpr() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:606:2: ( ( ( rule__PlusExpr__Group__0 ) ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:607:1: ( ( rule__PlusExpr__Group__0 ) )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:607:1: ( ( rule__PlusExpr__Group__0 ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:608:1: ( rule__PlusExpr__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPlusExprAccess().getGroup()); 
            }
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:609:1: ( rule__PlusExpr__Group__0 )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:609:2: rule__PlusExpr__Group__0
            {
            pushFollow(FOLLOW_rule__PlusExpr__Group__0_in_rulePlusExpr1240);
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:621:1: entryRuleTimesExpr : ruleTimesExpr EOF ;
    public final void entryRuleTimesExpr() throws RecognitionException {
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:622:1: ( ruleTimesExpr EOF )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:623:1: ruleTimesExpr EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTimesExprRule()); 
            }
            pushFollow(FOLLOW_ruleTimesExpr_in_entryRuleTimesExpr1267);
            ruleTimesExpr();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTimesExprRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleTimesExpr1274); if (state.failed) return ;

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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:630:1: ruleTimesExpr : ( ( rule__TimesExpr__Group__0 ) ) ;
    public final void ruleTimesExpr() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:634:2: ( ( ( rule__TimesExpr__Group__0 ) ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:635:1: ( ( rule__TimesExpr__Group__0 ) )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:635:1: ( ( rule__TimesExpr__Group__0 ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:636:1: ( rule__TimesExpr__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTimesExprAccess().getGroup()); 
            }
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:637:1: ( rule__TimesExpr__Group__0 )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:637:2: rule__TimesExpr__Group__0
            {
            pushFollow(FOLLOW_rule__TimesExpr__Group__0_in_ruleTimesExpr1300);
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:649:1: entryRulePrefixExpr : rulePrefixExpr EOF ;
    public final void entryRulePrefixExpr() throws RecognitionException {
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:650:1: ( rulePrefixExpr EOF )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:651:1: rulePrefixExpr EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPrefixExprRule()); 
            }
            pushFollow(FOLLOW_rulePrefixExpr_in_entryRulePrefixExpr1327);
            rulePrefixExpr();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPrefixExprRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulePrefixExpr1334); if (state.failed) return ;

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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:658:1: rulePrefixExpr : ( ( rule__PrefixExpr__Alternatives ) ) ;
    public final void rulePrefixExpr() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:662:2: ( ( ( rule__PrefixExpr__Alternatives ) ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:663:1: ( ( rule__PrefixExpr__Alternatives ) )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:663:1: ( ( rule__PrefixExpr__Alternatives ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:664:1: ( rule__PrefixExpr__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPrefixExprAccess().getAlternatives()); 
            }
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:665:1: ( rule__PrefixExpr__Alternatives )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:665:2: rule__PrefixExpr__Alternatives
            {
            pushFollow(FOLLOW_rule__PrefixExpr__Alternatives_in_rulePrefixExpr1360);
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


    // $ANTLR start "entryRuleProjectionExpr"
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:677:1: entryRuleProjectionExpr : ruleProjectionExpr EOF ;
    public final void entryRuleProjectionExpr() throws RecognitionException {
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:678:1: ( ruleProjectionExpr EOF )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:679:1: ruleProjectionExpr EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProjectionExprRule()); 
            }
            pushFollow(FOLLOW_ruleProjectionExpr_in_entryRuleProjectionExpr1387);
            ruleProjectionExpr();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getProjectionExprRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleProjectionExpr1394); if (state.failed) return ;

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
    // $ANTLR end "entryRuleProjectionExpr"


    // $ANTLR start "ruleProjectionExpr"
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:686:1: ruleProjectionExpr : ( ( rule__ProjectionExpr__Group__0 ) ) ;
    public final void ruleProjectionExpr() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:690:2: ( ( ( rule__ProjectionExpr__Group__0 ) ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:691:1: ( ( rule__ProjectionExpr__Group__0 ) )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:691:1: ( ( rule__ProjectionExpr__Group__0 ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:692:1: ( rule__ProjectionExpr__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProjectionExprAccess().getGroup()); 
            }
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:693:1: ( rule__ProjectionExpr__Group__0 )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:693:2: rule__ProjectionExpr__Group__0
            {
            pushFollow(FOLLOW_rule__ProjectionExpr__Group__0_in_ruleProjectionExpr1420);
            rule__ProjectionExpr__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getProjectionExprAccess().getGroup()); 
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
    // $ANTLR end "ruleProjectionExpr"


    // $ANTLR start "entryRuleAtomicExpr"
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:705:1: entryRuleAtomicExpr : ruleAtomicExpr EOF ;
    public final void entryRuleAtomicExpr() throws RecognitionException {
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:706:1: ( ruleAtomicExpr EOF )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:707:1: ruleAtomicExpr EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAtomicExprRule()); 
            }
            pushFollow(FOLLOW_ruleAtomicExpr_in_entryRuleAtomicExpr1447);
            ruleAtomicExpr();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAtomicExprRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAtomicExpr1454); if (state.failed) return ;

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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:714:1: ruleAtomicExpr : ( ( rule__AtomicExpr__Alternatives ) ) ;
    public final void ruleAtomicExpr() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:718:2: ( ( ( rule__AtomicExpr__Alternatives ) ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:719:1: ( ( rule__AtomicExpr__Alternatives ) )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:719:1: ( ( rule__AtomicExpr__Alternatives ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:720:1: ( rule__AtomicExpr__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAtomicExprAccess().getAlternatives()); 
            }
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:721:1: ( rule__AtomicExpr__Alternatives )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:721:2: rule__AtomicExpr__Alternatives
            {
            pushFollow(FOLLOW_rule__AtomicExpr__Alternatives_in_ruleAtomicExpr1480);
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:735:1: entryRuleREAL : ruleREAL EOF ;
    public final void entryRuleREAL() throws RecognitionException {
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:736:1: ( ruleREAL EOF )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:737:1: ruleREAL EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getREALRule()); 
            }
            pushFollow(FOLLOW_ruleREAL_in_entryRuleREAL1509);
            ruleREAL();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getREALRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleREAL1516); if (state.failed) return ;

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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:744:1: ruleREAL : ( ( rule__REAL__Group__0 ) ) ;
    public final void ruleREAL() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:748:2: ( ( ( rule__REAL__Group__0 ) ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:749:1: ( ( rule__REAL__Group__0 ) )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:749:1: ( ( rule__REAL__Group__0 ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:750:1: ( rule__REAL__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getREALAccess().getGroup()); 
            }
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:751:1: ( rule__REAL__Group__0 )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:751:2: rule__REAL__Group__0
            {
            pushFollow(FOLLOW_rule__REAL__Group__0_in_ruleREAL1542);
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:763:1: rule__File__Alternatives : ( ( ( rule__File__TypedefsAssignment_0 ) ) | ( ( rule__File__ConstantsAssignment_1 ) ) | ( ( rule__File__NodesAssignment_2 ) ) );
    public final void rule__File__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:767:1: ( ( ( rule__File__TypedefsAssignment_0 ) ) | ( ( rule__File__ConstantsAssignment_1 ) ) | ( ( rule__File__NodesAssignment_2 ) ) )
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
                    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:768:1: ( ( rule__File__TypedefsAssignment_0 ) )
                    {
                    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:768:1: ( ( rule__File__TypedefsAssignment_0 ) )
                    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:769:1: ( rule__File__TypedefsAssignment_0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getFileAccess().getTypedefsAssignment_0()); 
                    }
                    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:770:1: ( rule__File__TypedefsAssignment_0 )
                    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:770:2: rule__File__TypedefsAssignment_0
                    {
                    pushFollow(FOLLOW_rule__File__TypedefsAssignment_0_in_rule__File__Alternatives1578);
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
                    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:774:6: ( ( rule__File__ConstantsAssignment_1 ) )
                    {
                    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:774:6: ( ( rule__File__ConstantsAssignment_1 ) )
                    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:775:1: ( rule__File__ConstantsAssignment_1 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getFileAccess().getConstantsAssignment_1()); 
                    }
                    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:776:1: ( rule__File__ConstantsAssignment_1 )
                    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:776:2: rule__File__ConstantsAssignment_1
                    {
                    pushFollow(FOLLOW_rule__File__ConstantsAssignment_1_in_rule__File__Alternatives1596);
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
                    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:780:6: ( ( rule__File__NodesAssignment_2 ) )
                    {
                    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:780:6: ( ( rule__File__NodesAssignment_2 ) )
                    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:781:1: ( rule__File__NodesAssignment_2 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getFileAccess().getNodesAssignment_2()); 
                    }
                    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:782:1: ( rule__File__NodesAssignment_2 )
                    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:782:2: rule__File__NodesAssignment_2
                    {
                    pushFollow(FOLLOW_rule__File__NodesAssignment_2_in_rule__File__Alternatives1614);
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:791:1: rule__TopLevelType__Alternatives : ( ( ( rule__TopLevelType__Group_0__0 ) ) | ( ruleType ) );
    public final void rule__TopLevelType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:795:1: ( ( ( rule__TopLevelType__Group_0__0 ) ) | ( ruleType ) )
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
                    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:796:1: ( ( rule__TopLevelType__Group_0__0 ) )
                    {
                    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:796:1: ( ( rule__TopLevelType__Group_0__0 ) )
                    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:797:1: ( rule__TopLevelType__Group_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getTopLevelTypeAccess().getGroup_0()); 
                    }
                    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:798:1: ( rule__TopLevelType__Group_0__0 )
                    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:798:2: rule__TopLevelType__Group_0__0
                    {
                    pushFollow(FOLLOW_rule__TopLevelType__Group_0__0_in_rule__TopLevelType__Alternatives1647);
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
                    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:802:6: ( ruleType )
                    {
                    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:802:6: ( ruleType )
                    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:803:1: ruleType
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getTopLevelTypeAccess().getTypeParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_ruleType_in_rule__TopLevelType__Alternatives1665);
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:813:1: rule__Type__Alternatives : ( ( ( rule__Type__Group_0__0 ) ) | ( ( rule__Type__Group_1__0 ) ) | ( ( rule__Type__Group_2__0 ) ) | ( ( rule__Type__Group_3__0 ) ) | ( ( rule__Type__Group_4__0 ) ) );
    public final void rule__Type__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:817:1: ( ( ( rule__Type__Group_0__0 ) ) | ( ( rule__Type__Group_1__0 ) ) | ( ( rule__Type__Group_2__0 ) ) | ( ( rule__Type__Group_3__0 ) ) | ( ( rule__Type__Group_4__0 ) ) )
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
                    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:818:1: ( ( rule__Type__Group_0__0 ) )
                    {
                    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:818:1: ( ( rule__Type__Group_0__0 ) )
                    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:819:1: ( rule__Type__Group_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getTypeAccess().getGroup_0()); 
                    }
                    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:820:1: ( rule__Type__Group_0__0 )
                    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:820:2: rule__Type__Group_0__0
                    {
                    pushFollow(FOLLOW_rule__Type__Group_0__0_in_rule__Type__Alternatives1697);
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
                    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:824:6: ( ( rule__Type__Group_1__0 ) )
                    {
                    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:824:6: ( ( rule__Type__Group_1__0 ) )
                    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:825:1: ( rule__Type__Group_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getTypeAccess().getGroup_1()); 
                    }
                    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:826:1: ( rule__Type__Group_1__0 )
                    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:826:2: rule__Type__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__Type__Group_1__0_in_rule__Type__Alternatives1715);
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
                    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:830:6: ( ( rule__Type__Group_2__0 ) )
                    {
                    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:830:6: ( ( rule__Type__Group_2__0 ) )
                    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:831:1: ( rule__Type__Group_2__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getTypeAccess().getGroup_2()); 
                    }
                    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:832:1: ( rule__Type__Group_2__0 )
                    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:832:2: rule__Type__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__Type__Group_2__0_in_rule__Type__Alternatives1733);
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
                    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:836:6: ( ( rule__Type__Group_3__0 ) )
                    {
                    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:836:6: ( ( rule__Type__Group_3__0 ) )
                    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:837:1: ( rule__Type__Group_3__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getTypeAccess().getGroup_3()); 
                    }
                    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:838:1: ( rule__Type__Group_3__0 )
                    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:838:2: rule__Type__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__Type__Group_3__0_in_rule__Type__Alternatives1751);
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
                    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:842:6: ( ( rule__Type__Group_4__0 ) )
                    {
                    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:842:6: ( ( rule__Type__Group_4__0 ) )
                    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:843:1: ( rule__Type__Group_4__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getTypeAccess().getGroup_4()); 
                    }
                    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:844:1: ( rule__Type__Group_4__0 )
                    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:844:2: rule__Type__Group_4__0
                    {
                    pushFollow(FOLLOW_rule__Type__Group_4__0_in_rule__Type__Alternatives1769);
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:853:1: rule__Node__Alternatives_12 : ( ( ( rule__Node__EquationsAssignment_12_0 ) ) | ( ( rule__Node__PropertiesAssignment_12_1 ) ) | ( ( rule__Node__AssertionsAssignment_12_2 ) ) | ( ( rule__Node__MainAssignment_12_3 ) ) );
    public final void rule__Node__Alternatives_12() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:857:1: ( ( ( rule__Node__EquationsAssignment_12_0 ) ) | ( ( rule__Node__PropertiesAssignment_12_1 ) ) | ( ( rule__Node__AssertionsAssignment_12_2 ) ) | ( ( rule__Node__MainAssignment_12_3 ) ) )
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
                    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:858:1: ( ( rule__Node__EquationsAssignment_12_0 ) )
                    {
                    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:858:1: ( ( rule__Node__EquationsAssignment_12_0 ) )
                    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:859:1: ( rule__Node__EquationsAssignment_12_0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getNodeAccess().getEquationsAssignment_12_0()); 
                    }
                    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:860:1: ( rule__Node__EquationsAssignment_12_0 )
                    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:860:2: rule__Node__EquationsAssignment_12_0
                    {
                    pushFollow(FOLLOW_rule__Node__EquationsAssignment_12_0_in_rule__Node__Alternatives_121802);
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
                    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:864:6: ( ( rule__Node__PropertiesAssignment_12_1 ) )
                    {
                    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:864:6: ( ( rule__Node__PropertiesAssignment_12_1 ) )
                    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:865:1: ( rule__Node__PropertiesAssignment_12_1 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getNodeAccess().getPropertiesAssignment_12_1()); 
                    }
                    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:866:1: ( rule__Node__PropertiesAssignment_12_1 )
                    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:866:2: rule__Node__PropertiesAssignment_12_1
                    {
                    pushFollow(FOLLOW_rule__Node__PropertiesAssignment_12_1_in_rule__Node__Alternatives_121820);
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
                    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:870:6: ( ( rule__Node__AssertionsAssignment_12_2 ) )
                    {
                    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:870:6: ( ( rule__Node__AssertionsAssignment_12_2 ) )
                    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:871:1: ( rule__Node__AssertionsAssignment_12_2 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getNodeAccess().getAssertionsAssignment_12_2()); 
                    }
                    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:872:1: ( rule__Node__AssertionsAssignment_12_2 )
                    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:872:2: rule__Node__AssertionsAssignment_12_2
                    {
                    pushFollow(FOLLOW_rule__Node__AssertionsAssignment_12_2_in_rule__Node__Alternatives_121838);
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
                    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:876:6: ( ( rule__Node__MainAssignment_12_3 ) )
                    {
                    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:876:6: ( ( rule__Node__MainAssignment_12_3 ) )
                    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:877:1: ( rule__Node__MainAssignment_12_3 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getNodeAccess().getMainAssignment_12_3()); 
                    }
                    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:878:1: ( rule__Node__MainAssignment_12_3 )
                    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:878:2: rule__Node__MainAssignment_12_3
                    {
                    pushFollow(FOLLOW_rule__Node__MainAssignment_12_3_in_rule__Node__Alternatives_121856);
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:887:1: rule__OrExpr__OpAlternatives_1_0_1_0 : ( ( 'or' ) | ( 'xor' ) );
    public final void rule__OrExpr__OpAlternatives_1_0_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:891:1: ( ( 'or' ) | ( 'xor' ) )
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
                    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:892:1: ( 'or' )
                    {
                    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:892:1: ( 'or' )
                    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:893:1: 'or'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getOrExprAccess().getOpOrKeyword_1_0_1_0_0()); 
                    }
                    match(input,12,FOLLOW_12_in_rule__OrExpr__OpAlternatives_1_0_1_01890); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getOrExprAccess().getOpOrKeyword_1_0_1_0_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:900:6: ( 'xor' )
                    {
                    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:900:6: ( 'xor' )
                    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:901:1: 'xor'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getOrExprAccess().getOpXorKeyword_1_0_1_0_1()); 
                    }
                    match(input,13,FOLLOW_13_in_rule__OrExpr__OpAlternatives_1_0_1_01910); if (state.failed) return ;
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:913:1: rule__RelationalExpr__OpAlternatives_1_0_1_0 : ( ( '<' ) | ( '<=' ) | ( '>' ) | ( '>=' ) | ( '=' ) | ( '<>' ) );
    public final void rule__RelationalExpr__OpAlternatives_1_0_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:917:1: ( ( '<' ) | ( '<=' ) | ( '>' ) | ( '>=' ) | ( '=' ) | ( '<>' ) )
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
                    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:918:1: ( '<' )
                    {
                    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:918:1: ( '<' )
                    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:919:1: '<'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getRelationalExprAccess().getOpLessThanSignKeyword_1_0_1_0_0()); 
                    }
                    match(input,14,FOLLOW_14_in_rule__RelationalExpr__OpAlternatives_1_0_1_01945); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getRelationalExprAccess().getOpLessThanSignKeyword_1_0_1_0_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:926:6: ( '<=' )
                    {
                    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:926:6: ( '<=' )
                    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:927:1: '<='
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getRelationalExprAccess().getOpLessThanSignEqualsSignKeyword_1_0_1_0_1()); 
                    }
                    match(input,15,FOLLOW_15_in_rule__RelationalExpr__OpAlternatives_1_0_1_01965); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getRelationalExprAccess().getOpLessThanSignEqualsSignKeyword_1_0_1_0_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:934:6: ( '>' )
                    {
                    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:934:6: ( '>' )
                    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:935:1: '>'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getRelationalExprAccess().getOpGreaterThanSignKeyword_1_0_1_0_2()); 
                    }
                    match(input,16,FOLLOW_16_in_rule__RelationalExpr__OpAlternatives_1_0_1_01985); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getRelationalExprAccess().getOpGreaterThanSignKeyword_1_0_1_0_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:942:6: ( '>=' )
                    {
                    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:942:6: ( '>=' )
                    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:943:1: '>='
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getRelationalExprAccess().getOpGreaterThanSignEqualsSignKeyword_1_0_1_0_3()); 
                    }
                    match(input,17,FOLLOW_17_in_rule__RelationalExpr__OpAlternatives_1_0_1_02005); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getRelationalExprAccess().getOpGreaterThanSignEqualsSignKeyword_1_0_1_0_3()); 
                    }

                    }


                    }
                    break;
                case 5 :
                    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:950:6: ( '=' )
                    {
                    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:950:6: ( '=' )
                    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:951:1: '='
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getRelationalExprAccess().getOpEqualsSignKeyword_1_0_1_0_4()); 
                    }
                    match(input,18,FOLLOW_18_in_rule__RelationalExpr__OpAlternatives_1_0_1_02025); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getRelationalExprAccess().getOpEqualsSignKeyword_1_0_1_0_4()); 
                    }

                    }


                    }
                    break;
                case 6 :
                    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:958:6: ( '<>' )
                    {
                    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:958:6: ( '<>' )
                    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:959:1: '<>'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getRelationalExprAccess().getOpLessThanSignGreaterThanSignKeyword_1_0_1_0_5()); 
                    }
                    match(input,19,FOLLOW_19_in_rule__RelationalExpr__OpAlternatives_1_0_1_02045); if (state.failed) return ;
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:971:1: rule__PlusExpr__OpAlternatives_1_0_1_0 : ( ( '+' ) | ( '-' ) );
    public final void rule__PlusExpr__OpAlternatives_1_0_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:975:1: ( ( '+' ) | ( '-' ) )
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
                    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:976:1: ( '+' )
                    {
                    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:976:1: ( '+' )
                    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:977:1: '+'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getPlusExprAccess().getOpPlusSignKeyword_1_0_1_0_0()); 
                    }
                    match(input,20,FOLLOW_20_in_rule__PlusExpr__OpAlternatives_1_0_1_02080); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getPlusExprAccess().getOpPlusSignKeyword_1_0_1_0_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:984:6: ( '-' )
                    {
                    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:984:6: ( '-' )
                    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:985:1: '-'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getPlusExprAccess().getOpHyphenMinusKeyword_1_0_1_0_1()); 
                    }
                    match(input,21,FOLLOW_21_in_rule__PlusExpr__OpAlternatives_1_0_1_02100); if (state.failed) return ;
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:997:1: rule__TimesExpr__OpAlternatives_1_0_1_0 : ( ( '*' ) | ( '/' ) | ( 'div' ) );
    public final void rule__TimesExpr__OpAlternatives_1_0_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1001:1: ( ( '*' ) | ( '/' ) | ( 'div' ) )
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
                    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1002:1: ( '*' )
                    {
                    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1002:1: ( '*' )
                    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1003:1: '*'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getTimesExprAccess().getOpAsteriskKeyword_1_0_1_0_0()); 
                    }
                    match(input,22,FOLLOW_22_in_rule__TimesExpr__OpAlternatives_1_0_1_02135); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getTimesExprAccess().getOpAsteriskKeyword_1_0_1_0_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1010:6: ( '/' )
                    {
                    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1010:6: ( '/' )
                    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1011:1: '/'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getTimesExprAccess().getOpSolidusKeyword_1_0_1_0_1()); 
                    }
                    match(input,23,FOLLOW_23_in_rule__TimesExpr__OpAlternatives_1_0_1_02155); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getTimesExprAccess().getOpSolidusKeyword_1_0_1_0_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1018:6: ( 'div' )
                    {
                    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1018:6: ( 'div' )
                    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1019:1: 'div'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getTimesExprAccess().getOpDivKeyword_1_0_1_0_2()); 
                    }
                    match(input,24,FOLLOW_24_in_rule__TimesExpr__OpAlternatives_1_0_1_02175); if (state.failed) return ;
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1031:1: rule__PrefixExpr__Alternatives : ( ( ( rule__PrefixExpr__Group_0__0 ) ) | ( ruleProjectionExpr ) );
    public final void rule__PrefixExpr__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1035:1: ( ( ( rule__PrefixExpr__Group_0__0 ) ) | ( ruleProjectionExpr ) )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==21||(LA10_0>=25 && LA10_0<=26)) ) {
                alt10=1;
            }
            else if ( ((LA10_0>=RULE_INT && LA10_0<=RULE_BOOL)||LA10_0==43||LA10_0==53) ) {
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
                    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1036:1: ( ( rule__PrefixExpr__Group_0__0 ) )
                    {
                    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1036:1: ( ( rule__PrefixExpr__Group_0__0 ) )
                    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1037:1: ( rule__PrefixExpr__Group_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getPrefixExprAccess().getGroup_0()); 
                    }
                    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1038:1: ( rule__PrefixExpr__Group_0__0 )
                    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1038:2: rule__PrefixExpr__Group_0__0
                    {
                    pushFollow(FOLLOW_rule__PrefixExpr__Group_0__0_in_rule__PrefixExpr__Alternatives2209);
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
                    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1042:6: ( ruleProjectionExpr )
                    {
                    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1042:6: ( ruleProjectionExpr )
                    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1043:1: ruleProjectionExpr
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getPrefixExprAccess().getProjectionExprParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_ruleProjectionExpr_in_rule__PrefixExpr__Alternatives2227);
                    ruleProjectionExpr();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getPrefixExprAccess().getProjectionExprParserRuleCall_1()); 
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1053:1: rule__PrefixExpr__OpAlternatives_0_1_0 : ( ( '-' ) | ( 'not' ) | ( 'pre' ) );
    public final void rule__PrefixExpr__OpAlternatives_0_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1057:1: ( ( '-' ) | ( 'not' ) | ( 'pre' ) )
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
                    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1058:1: ( '-' )
                    {
                    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1058:1: ( '-' )
                    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1059:1: '-'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getPrefixExprAccess().getOpHyphenMinusKeyword_0_1_0_0()); 
                    }
                    match(input,21,FOLLOW_21_in_rule__PrefixExpr__OpAlternatives_0_1_02260); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getPrefixExprAccess().getOpHyphenMinusKeyword_0_1_0_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1066:6: ( 'not' )
                    {
                    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1066:6: ( 'not' )
                    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1067:1: 'not'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getPrefixExprAccess().getOpNotKeyword_0_1_0_1()); 
                    }
                    match(input,25,FOLLOW_25_in_rule__PrefixExpr__OpAlternatives_0_1_02280); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getPrefixExprAccess().getOpNotKeyword_0_1_0_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1074:6: ( 'pre' )
                    {
                    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1074:6: ( 'pre' )
                    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1075:1: 'pre'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getPrefixExprAccess().getOpPreKeyword_0_1_0_2()); 
                    }
                    match(input,26,FOLLOW_26_in_rule__PrefixExpr__OpAlternatives_0_1_02300); if (state.failed) return ;
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1087:1: rule__AtomicExpr__Alternatives : ( ( ( rule__AtomicExpr__Group_0__0 ) ) | ( ( rule__AtomicExpr__Group_1__0 ) ) | ( ( rule__AtomicExpr__Group_2__0 ) ) | ( ( rule__AtomicExpr__Group_3__0 ) ) | ( ( rule__AtomicExpr__Group_4__0 ) ) | ( ( rule__AtomicExpr__Group_5__0 ) ) | ( ( rule__AtomicExpr__Group_6__0 ) ) | ( ( rule__AtomicExpr__Group_7__0 ) ) );
    public final void rule__AtomicExpr__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1091:1: ( ( ( rule__AtomicExpr__Group_0__0 ) ) | ( ( rule__AtomicExpr__Group_1__0 ) ) | ( ( rule__AtomicExpr__Group_2__0 ) ) | ( ( rule__AtomicExpr__Group_3__0 ) ) | ( ( rule__AtomicExpr__Group_4__0 ) ) | ( ( rule__AtomicExpr__Group_5__0 ) ) | ( ( rule__AtomicExpr__Group_6__0 ) ) | ( ( rule__AtomicExpr__Group_7__0 ) ) )
            int alt12=8;
            alt12 = dfa12.predict(input);
            switch (alt12) {
                case 1 :
                    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1092:1: ( ( rule__AtomicExpr__Group_0__0 ) )
                    {
                    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1092:1: ( ( rule__AtomicExpr__Group_0__0 ) )
                    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1093:1: ( rule__AtomicExpr__Group_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAtomicExprAccess().getGroup_0()); 
                    }
                    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1094:1: ( rule__AtomicExpr__Group_0__0 )
                    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1094:2: rule__AtomicExpr__Group_0__0
                    {
                    pushFollow(FOLLOW_rule__AtomicExpr__Group_0__0_in_rule__AtomicExpr__Alternatives2334);
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
                    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1098:6: ( ( rule__AtomicExpr__Group_1__0 ) )
                    {
                    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1098:6: ( ( rule__AtomicExpr__Group_1__0 ) )
                    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1099:1: ( rule__AtomicExpr__Group_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAtomicExprAccess().getGroup_1()); 
                    }
                    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1100:1: ( rule__AtomicExpr__Group_1__0 )
                    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1100:2: rule__AtomicExpr__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__AtomicExpr__Group_1__0_in_rule__AtomicExpr__Alternatives2352);
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
                    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1104:6: ( ( rule__AtomicExpr__Group_2__0 ) )
                    {
                    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1104:6: ( ( rule__AtomicExpr__Group_2__0 ) )
                    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1105:1: ( rule__AtomicExpr__Group_2__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAtomicExprAccess().getGroup_2()); 
                    }
                    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1106:1: ( rule__AtomicExpr__Group_2__0 )
                    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1106:2: rule__AtomicExpr__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__AtomicExpr__Group_2__0_in_rule__AtomicExpr__Alternatives2370);
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
                    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1110:6: ( ( rule__AtomicExpr__Group_3__0 ) )
                    {
                    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1110:6: ( ( rule__AtomicExpr__Group_3__0 ) )
                    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1111:1: ( rule__AtomicExpr__Group_3__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAtomicExprAccess().getGroup_3()); 
                    }
                    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1112:1: ( rule__AtomicExpr__Group_3__0 )
                    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1112:2: rule__AtomicExpr__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__AtomicExpr__Group_3__0_in_rule__AtomicExpr__Alternatives2388);
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
                    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1116:6: ( ( rule__AtomicExpr__Group_4__0 ) )
                    {
                    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1116:6: ( ( rule__AtomicExpr__Group_4__0 ) )
                    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1117:1: ( rule__AtomicExpr__Group_4__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAtomicExprAccess().getGroup_4()); 
                    }
                    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1118:1: ( rule__AtomicExpr__Group_4__0 )
                    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1118:2: rule__AtomicExpr__Group_4__0
                    {
                    pushFollow(FOLLOW_rule__AtomicExpr__Group_4__0_in_rule__AtomicExpr__Alternatives2406);
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
                    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1122:6: ( ( rule__AtomicExpr__Group_5__0 ) )
                    {
                    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1122:6: ( ( rule__AtomicExpr__Group_5__0 ) )
                    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1123:1: ( rule__AtomicExpr__Group_5__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAtomicExprAccess().getGroup_5()); 
                    }
                    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1124:1: ( rule__AtomicExpr__Group_5__0 )
                    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1124:2: rule__AtomicExpr__Group_5__0
                    {
                    pushFollow(FOLLOW_rule__AtomicExpr__Group_5__0_in_rule__AtomicExpr__Alternatives2424);
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
                    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1128:6: ( ( rule__AtomicExpr__Group_6__0 ) )
                    {
                    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1128:6: ( ( rule__AtomicExpr__Group_6__0 ) )
                    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1129:1: ( rule__AtomicExpr__Group_6__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAtomicExprAccess().getGroup_6()); 
                    }
                    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1130:1: ( rule__AtomicExpr__Group_6__0 )
                    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1130:2: rule__AtomicExpr__Group_6__0
                    {
                    pushFollow(FOLLOW_rule__AtomicExpr__Group_6__0_in_rule__AtomicExpr__Alternatives2442);
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
                    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1134:6: ( ( rule__AtomicExpr__Group_7__0 ) )
                    {
                    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1134:6: ( ( rule__AtomicExpr__Group_7__0 ) )
                    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1135:1: ( rule__AtomicExpr__Group_7__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAtomicExprAccess().getGroup_7()); 
                    }
                    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1136:1: ( rule__AtomicExpr__Group_7__0 )
                    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1136:2: rule__AtomicExpr__Group_7__0
                    {
                    pushFollow(FOLLOW_rule__AtomicExpr__Group_7__0_in_rule__AtomicExpr__Alternatives2460);
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1148:1: rule__Typedef__Group__0 : rule__Typedef__Group__0__Impl rule__Typedef__Group__1 ;
    public final void rule__Typedef__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1152:1: ( rule__Typedef__Group__0__Impl rule__Typedef__Group__1 )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1153:2: rule__Typedef__Group__0__Impl rule__Typedef__Group__1
            {
            pushFollow(FOLLOW_rule__Typedef__Group__0__Impl_in_rule__Typedef__Group__02492);
            rule__Typedef__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Typedef__Group__1_in_rule__Typedef__Group__02495);
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1160:1: rule__Typedef__Group__0__Impl : ( 'type' ) ;
    public final void rule__Typedef__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1164:1: ( ( 'type' ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1165:1: ( 'type' )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1165:1: ( 'type' )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1166:1: 'type'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypedefAccess().getTypeKeyword_0()); 
            }
            match(input,27,FOLLOW_27_in_rule__Typedef__Group__0__Impl2523); if (state.failed) return ;
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1179:1: rule__Typedef__Group__1 : rule__Typedef__Group__1__Impl rule__Typedef__Group__2 ;
    public final void rule__Typedef__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1183:1: ( rule__Typedef__Group__1__Impl rule__Typedef__Group__2 )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1184:2: rule__Typedef__Group__1__Impl rule__Typedef__Group__2
            {
            pushFollow(FOLLOW_rule__Typedef__Group__1__Impl_in_rule__Typedef__Group__12554);
            rule__Typedef__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Typedef__Group__2_in_rule__Typedef__Group__12557);
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1191:1: rule__Typedef__Group__1__Impl : ( ( rule__Typedef__NameAssignment_1 ) ) ;
    public final void rule__Typedef__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1195:1: ( ( ( rule__Typedef__NameAssignment_1 ) ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1196:1: ( ( rule__Typedef__NameAssignment_1 ) )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1196:1: ( ( rule__Typedef__NameAssignment_1 ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1197:1: ( rule__Typedef__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypedefAccess().getNameAssignment_1()); 
            }
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1198:1: ( rule__Typedef__NameAssignment_1 )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1198:2: rule__Typedef__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Typedef__NameAssignment_1_in_rule__Typedef__Group__1__Impl2584);
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1208:1: rule__Typedef__Group__2 : rule__Typedef__Group__2__Impl rule__Typedef__Group__3 ;
    public final void rule__Typedef__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1212:1: ( rule__Typedef__Group__2__Impl rule__Typedef__Group__3 )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1213:2: rule__Typedef__Group__2__Impl rule__Typedef__Group__3
            {
            pushFollow(FOLLOW_rule__Typedef__Group__2__Impl_in_rule__Typedef__Group__22614);
            rule__Typedef__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Typedef__Group__3_in_rule__Typedef__Group__22617);
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1220:1: rule__Typedef__Group__2__Impl : ( '=' ) ;
    public final void rule__Typedef__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1224:1: ( ( '=' ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1225:1: ( '=' )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1225:1: ( '=' )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1226:1: '='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypedefAccess().getEqualsSignKeyword_2()); 
            }
            match(input,18,FOLLOW_18_in_rule__Typedef__Group__2__Impl2645); if (state.failed) return ;
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1239:1: rule__Typedef__Group__3 : rule__Typedef__Group__3__Impl rule__Typedef__Group__4 ;
    public final void rule__Typedef__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1243:1: ( rule__Typedef__Group__3__Impl rule__Typedef__Group__4 )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1244:2: rule__Typedef__Group__3__Impl rule__Typedef__Group__4
            {
            pushFollow(FOLLOW_rule__Typedef__Group__3__Impl_in_rule__Typedef__Group__32676);
            rule__Typedef__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Typedef__Group__4_in_rule__Typedef__Group__32679);
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1251:1: rule__Typedef__Group__3__Impl : ( ( rule__Typedef__TypeAssignment_3 ) ) ;
    public final void rule__Typedef__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1255:1: ( ( ( rule__Typedef__TypeAssignment_3 ) ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1256:1: ( ( rule__Typedef__TypeAssignment_3 ) )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1256:1: ( ( rule__Typedef__TypeAssignment_3 ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1257:1: ( rule__Typedef__TypeAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypedefAccess().getTypeAssignment_3()); 
            }
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1258:1: ( rule__Typedef__TypeAssignment_3 )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1258:2: rule__Typedef__TypeAssignment_3
            {
            pushFollow(FOLLOW_rule__Typedef__TypeAssignment_3_in_rule__Typedef__Group__3__Impl2706);
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1268:1: rule__Typedef__Group__4 : rule__Typedef__Group__4__Impl ;
    public final void rule__Typedef__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1272:1: ( rule__Typedef__Group__4__Impl )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1273:2: rule__Typedef__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__Typedef__Group__4__Impl_in_rule__Typedef__Group__42736);
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1279:1: rule__Typedef__Group__4__Impl : ( ';' ) ;
    public final void rule__Typedef__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1283:1: ( ( ';' ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1284:1: ( ';' )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1284:1: ( ';' )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1285:1: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypedefAccess().getSemicolonKeyword_4()); 
            }
            match(input,28,FOLLOW_28_in_rule__Typedef__Group__4__Impl2764); if (state.failed) return ;
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1308:1: rule__TopLevelType__Group_0__0 : rule__TopLevelType__Group_0__0__Impl rule__TopLevelType__Group_0__1 ;
    public final void rule__TopLevelType__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1312:1: ( rule__TopLevelType__Group_0__0__Impl rule__TopLevelType__Group_0__1 )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1313:2: rule__TopLevelType__Group_0__0__Impl rule__TopLevelType__Group_0__1
            {
            pushFollow(FOLLOW_rule__TopLevelType__Group_0__0__Impl_in_rule__TopLevelType__Group_0__02805);
            rule__TopLevelType__Group_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__TopLevelType__Group_0__1_in_rule__TopLevelType__Group_0__02808);
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1320:1: rule__TopLevelType__Group_0__0__Impl : ( () ) ;
    public final void rule__TopLevelType__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1324:1: ( ( () ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1325:1: ( () )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1325:1: ( () )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1326:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTopLevelTypeAccess().getRecordTypeAction_0_0()); 
            }
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1327:1: ()
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1329:1: 
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1339:1: rule__TopLevelType__Group_0__1 : rule__TopLevelType__Group_0__1__Impl rule__TopLevelType__Group_0__2 ;
    public final void rule__TopLevelType__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1343:1: ( rule__TopLevelType__Group_0__1__Impl rule__TopLevelType__Group_0__2 )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1344:2: rule__TopLevelType__Group_0__1__Impl rule__TopLevelType__Group_0__2
            {
            pushFollow(FOLLOW_rule__TopLevelType__Group_0__1__Impl_in_rule__TopLevelType__Group_0__12866);
            rule__TopLevelType__Group_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__TopLevelType__Group_0__2_in_rule__TopLevelType__Group_0__12869);
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1351:1: rule__TopLevelType__Group_0__1__Impl : ( 'struct' ) ;
    public final void rule__TopLevelType__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1355:1: ( ( 'struct' ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1356:1: ( 'struct' )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1356:1: ( 'struct' )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1357:1: 'struct'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTopLevelTypeAccess().getStructKeyword_0_1()); 
            }
            match(input,29,FOLLOW_29_in_rule__TopLevelType__Group_0__1__Impl2897); if (state.failed) return ;
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1370:1: rule__TopLevelType__Group_0__2 : rule__TopLevelType__Group_0__2__Impl rule__TopLevelType__Group_0__3 ;
    public final void rule__TopLevelType__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1374:1: ( rule__TopLevelType__Group_0__2__Impl rule__TopLevelType__Group_0__3 )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1375:2: rule__TopLevelType__Group_0__2__Impl rule__TopLevelType__Group_0__3
            {
            pushFollow(FOLLOW_rule__TopLevelType__Group_0__2__Impl_in_rule__TopLevelType__Group_0__22928);
            rule__TopLevelType__Group_0__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__TopLevelType__Group_0__3_in_rule__TopLevelType__Group_0__22931);
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1382:1: rule__TopLevelType__Group_0__2__Impl : ( '{' ) ;
    public final void rule__TopLevelType__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1386:1: ( ( '{' ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1387:1: ( '{' )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1387:1: ( '{' )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1388:1: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTopLevelTypeAccess().getLeftCurlyBracketKeyword_0_2()); 
            }
            match(input,30,FOLLOW_30_in_rule__TopLevelType__Group_0__2__Impl2959); if (state.failed) return ;
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1401:1: rule__TopLevelType__Group_0__3 : rule__TopLevelType__Group_0__3__Impl rule__TopLevelType__Group_0__4 ;
    public final void rule__TopLevelType__Group_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1405:1: ( rule__TopLevelType__Group_0__3__Impl rule__TopLevelType__Group_0__4 )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1406:2: rule__TopLevelType__Group_0__3__Impl rule__TopLevelType__Group_0__4
            {
            pushFollow(FOLLOW_rule__TopLevelType__Group_0__3__Impl_in_rule__TopLevelType__Group_0__32990);
            rule__TopLevelType__Group_0__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__TopLevelType__Group_0__4_in_rule__TopLevelType__Group_0__32993);
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1413:1: rule__TopLevelType__Group_0__3__Impl : ( ( rule__TopLevelType__FieldsAssignment_0_3 ) ) ;
    public final void rule__TopLevelType__Group_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1417:1: ( ( ( rule__TopLevelType__FieldsAssignment_0_3 ) ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1418:1: ( ( rule__TopLevelType__FieldsAssignment_0_3 ) )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1418:1: ( ( rule__TopLevelType__FieldsAssignment_0_3 ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1419:1: ( rule__TopLevelType__FieldsAssignment_0_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTopLevelTypeAccess().getFieldsAssignment_0_3()); 
            }
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1420:1: ( rule__TopLevelType__FieldsAssignment_0_3 )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1420:2: rule__TopLevelType__FieldsAssignment_0_3
            {
            pushFollow(FOLLOW_rule__TopLevelType__FieldsAssignment_0_3_in_rule__TopLevelType__Group_0__3__Impl3020);
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1430:1: rule__TopLevelType__Group_0__4 : rule__TopLevelType__Group_0__4__Impl rule__TopLevelType__Group_0__5 ;
    public final void rule__TopLevelType__Group_0__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1434:1: ( rule__TopLevelType__Group_0__4__Impl rule__TopLevelType__Group_0__5 )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1435:2: rule__TopLevelType__Group_0__4__Impl rule__TopLevelType__Group_0__5
            {
            pushFollow(FOLLOW_rule__TopLevelType__Group_0__4__Impl_in_rule__TopLevelType__Group_0__43050);
            rule__TopLevelType__Group_0__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__TopLevelType__Group_0__5_in_rule__TopLevelType__Group_0__43053);
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1442:1: rule__TopLevelType__Group_0__4__Impl : ( ':' ) ;
    public final void rule__TopLevelType__Group_0__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1446:1: ( ( ':' ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1447:1: ( ':' )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1447:1: ( ':' )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1448:1: ':'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTopLevelTypeAccess().getColonKeyword_0_4()); 
            }
            match(input,31,FOLLOW_31_in_rule__TopLevelType__Group_0__4__Impl3081); if (state.failed) return ;
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1461:1: rule__TopLevelType__Group_0__5 : rule__TopLevelType__Group_0__5__Impl rule__TopLevelType__Group_0__6 ;
    public final void rule__TopLevelType__Group_0__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1465:1: ( rule__TopLevelType__Group_0__5__Impl rule__TopLevelType__Group_0__6 )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1466:2: rule__TopLevelType__Group_0__5__Impl rule__TopLevelType__Group_0__6
            {
            pushFollow(FOLLOW_rule__TopLevelType__Group_0__5__Impl_in_rule__TopLevelType__Group_0__53112);
            rule__TopLevelType__Group_0__5__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__TopLevelType__Group_0__6_in_rule__TopLevelType__Group_0__53115);
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1473:1: rule__TopLevelType__Group_0__5__Impl : ( ( rule__TopLevelType__TypesAssignment_0_5 ) ) ;
    public final void rule__TopLevelType__Group_0__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1477:1: ( ( ( rule__TopLevelType__TypesAssignment_0_5 ) ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1478:1: ( ( rule__TopLevelType__TypesAssignment_0_5 ) )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1478:1: ( ( rule__TopLevelType__TypesAssignment_0_5 ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1479:1: ( rule__TopLevelType__TypesAssignment_0_5 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTopLevelTypeAccess().getTypesAssignment_0_5()); 
            }
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1480:1: ( rule__TopLevelType__TypesAssignment_0_5 )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1480:2: rule__TopLevelType__TypesAssignment_0_5
            {
            pushFollow(FOLLOW_rule__TopLevelType__TypesAssignment_0_5_in_rule__TopLevelType__Group_0__5__Impl3142);
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1490:1: rule__TopLevelType__Group_0__6 : rule__TopLevelType__Group_0__6__Impl rule__TopLevelType__Group_0__7 ;
    public final void rule__TopLevelType__Group_0__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1494:1: ( rule__TopLevelType__Group_0__6__Impl rule__TopLevelType__Group_0__7 )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1495:2: rule__TopLevelType__Group_0__6__Impl rule__TopLevelType__Group_0__7
            {
            pushFollow(FOLLOW_rule__TopLevelType__Group_0__6__Impl_in_rule__TopLevelType__Group_0__63172);
            rule__TopLevelType__Group_0__6__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__TopLevelType__Group_0__7_in_rule__TopLevelType__Group_0__63175);
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1502:1: rule__TopLevelType__Group_0__6__Impl : ( ( rule__TopLevelType__Group_0_6__0 )* ) ;
    public final void rule__TopLevelType__Group_0__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1506:1: ( ( ( rule__TopLevelType__Group_0_6__0 )* ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1507:1: ( ( rule__TopLevelType__Group_0_6__0 )* )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1507:1: ( ( rule__TopLevelType__Group_0_6__0 )* )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1508:1: ( rule__TopLevelType__Group_0_6__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTopLevelTypeAccess().getGroup_0_6()); 
            }
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1509:1: ( rule__TopLevelType__Group_0_6__0 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==28) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1509:2: rule__TopLevelType__Group_0_6__0
            	    {
            	    pushFollow(FOLLOW_rule__TopLevelType__Group_0_6__0_in_rule__TopLevelType__Group_0__6__Impl3202);
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1519:1: rule__TopLevelType__Group_0__7 : rule__TopLevelType__Group_0__7__Impl ;
    public final void rule__TopLevelType__Group_0__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1523:1: ( rule__TopLevelType__Group_0__7__Impl )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1524:2: rule__TopLevelType__Group_0__7__Impl
            {
            pushFollow(FOLLOW_rule__TopLevelType__Group_0__7__Impl_in_rule__TopLevelType__Group_0__73233);
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1530:1: rule__TopLevelType__Group_0__7__Impl : ( '}' ) ;
    public final void rule__TopLevelType__Group_0__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1534:1: ( ( '}' ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1535:1: ( '}' )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1535:1: ( '}' )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1536:1: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTopLevelTypeAccess().getRightCurlyBracketKeyword_0_7()); 
            }
            match(input,32,FOLLOW_32_in_rule__TopLevelType__Group_0__7__Impl3261); if (state.failed) return ;
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1565:1: rule__TopLevelType__Group_0_6__0 : rule__TopLevelType__Group_0_6__0__Impl rule__TopLevelType__Group_0_6__1 ;
    public final void rule__TopLevelType__Group_0_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1569:1: ( rule__TopLevelType__Group_0_6__0__Impl rule__TopLevelType__Group_0_6__1 )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1570:2: rule__TopLevelType__Group_0_6__0__Impl rule__TopLevelType__Group_0_6__1
            {
            pushFollow(FOLLOW_rule__TopLevelType__Group_0_6__0__Impl_in_rule__TopLevelType__Group_0_6__03308);
            rule__TopLevelType__Group_0_6__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__TopLevelType__Group_0_6__1_in_rule__TopLevelType__Group_0_6__03311);
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1577:1: rule__TopLevelType__Group_0_6__0__Impl : ( ';' ) ;
    public final void rule__TopLevelType__Group_0_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1581:1: ( ( ';' ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1582:1: ( ';' )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1582:1: ( ';' )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1583:1: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTopLevelTypeAccess().getSemicolonKeyword_0_6_0()); 
            }
            match(input,28,FOLLOW_28_in_rule__TopLevelType__Group_0_6__0__Impl3339); if (state.failed) return ;
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1596:1: rule__TopLevelType__Group_0_6__1 : rule__TopLevelType__Group_0_6__1__Impl rule__TopLevelType__Group_0_6__2 ;
    public final void rule__TopLevelType__Group_0_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1600:1: ( rule__TopLevelType__Group_0_6__1__Impl rule__TopLevelType__Group_0_6__2 )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1601:2: rule__TopLevelType__Group_0_6__1__Impl rule__TopLevelType__Group_0_6__2
            {
            pushFollow(FOLLOW_rule__TopLevelType__Group_0_6__1__Impl_in_rule__TopLevelType__Group_0_6__13370);
            rule__TopLevelType__Group_0_6__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__TopLevelType__Group_0_6__2_in_rule__TopLevelType__Group_0_6__13373);
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1608:1: rule__TopLevelType__Group_0_6__1__Impl : ( ( rule__TopLevelType__FieldsAssignment_0_6_1 ) ) ;
    public final void rule__TopLevelType__Group_0_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1612:1: ( ( ( rule__TopLevelType__FieldsAssignment_0_6_1 ) ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1613:1: ( ( rule__TopLevelType__FieldsAssignment_0_6_1 ) )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1613:1: ( ( rule__TopLevelType__FieldsAssignment_0_6_1 ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1614:1: ( rule__TopLevelType__FieldsAssignment_0_6_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTopLevelTypeAccess().getFieldsAssignment_0_6_1()); 
            }
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1615:1: ( rule__TopLevelType__FieldsAssignment_0_6_1 )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1615:2: rule__TopLevelType__FieldsAssignment_0_6_1
            {
            pushFollow(FOLLOW_rule__TopLevelType__FieldsAssignment_0_6_1_in_rule__TopLevelType__Group_0_6__1__Impl3400);
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1625:1: rule__TopLevelType__Group_0_6__2 : rule__TopLevelType__Group_0_6__2__Impl rule__TopLevelType__Group_0_6__3 ;
    public final void rule__TopLevelType__Group_0_6__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1629:1: ( rule__TopLevelType__Group_0_6__2__Impl rule__TopLevelType__Group_0_6__3 )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1630:2: rule__TopLevelType__Group_0_6__2__Impl rule__TopLevelType__Group_0_6__3
            {
            pushFollow(FOLLOW_rule__TopLevelType__Group_0_6__2__Impl_in_rule__TopLevelType__Group_0_6__23430);
            rule__TopLevelType__Group_0_6__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__TopLevelType__Group_0_6__3_in_rule__TopLevelType__Group_0_6__23433);
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1637:1: rule__TopLevelType__Group_0_6__2__Impl : ( ':' ) ;
    public final void rule__TopLevelType__Group_0_6__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1641:1: ( ( ':' ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1642:1: ( ':' )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1642:1: ( ':' )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1643:1: ':'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTopLevelTypeAccess().getColonKeyword_0_6_2()); 
            }
            match(input,31,FOLLOW_31_in_rule__TopLevelType__Group_0_6__2__Impl3461); if (state.failed) return ;
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1656:1: rule__TopLevelType__Group_0_6__3 : rule__TopLevelType__Group_0_6__3__Impl ;
    public final void rule__TopLevelType__Group_0_6__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1660:1: ( rule__TopLevelType__Group_0_6__3__Impl )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1661:2: rule__TopLevelType__Group_0_6__3__Impl
            {
            pushFollow(FOLLOW_rule__TopLevelType__Group_0_6__3__Impl_in_rule__TopLevelType__Group_0_6__33492);
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1667:1: rule__TopLevelType__Group_0_6__3__Impl : ( ( rule__TopLevelType__TypesAssignment_0_6_3 ) ) ;
    public final void rule__TopLevelType__Group_0_6__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1671:1: ( ( ( rule__TopLevelType__TypesAssignment_0_6_3 ) ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1672:1: ( ( rule__TopLevelType__TypesAssignment_0_6_3 ) )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1672:1: ( ( rule__TopLevelType__TypesAssignment_0_6_3 ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1673:1: ( rule__TopLevelType__TypesAssignment_0_6_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTopLevelTypeAccess().getTypesAssignment_0_6_3()); 
            }
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1674:1: ( rule__TopLevelType__TypesAssignment_0_6_3 )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1674:2: rule__TopLevelType__TypesAssignment_0_6_3
            {
            pushFollow(FOLLOW_rule__TopLevelType__TypesAssignment_0_6_3_in_rule__TopLevelType__Group_0_6__3__Impl3519);
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1692:1: rule__Type__Group_0__0 : rule__Type__Group_0__0__Impl rule__Type__Group_0__1 ;
    public final void rule__Type__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1696:1: ( rule__Type__Group_0__0__Impl rule__Type__Group_0__1 )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1697:2: rule__Type__Group_0__0__Impl rule__Type__Group_0__1
            {
            pushFollow(FOLLOW_rule__Type__Group_0__0__Impl_in_rule__Type__Group_0__03557);
            rule__Type__Group_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Type__Group_0__1_in_rule__Type__Group_0__03560);
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1704:1: rule__Type__Group_0__0__Impl : ( () ) ;
    public final void rule__Type__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1708:1: ( ( () ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1709:1: ( () )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1709:1: ( () )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1710:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypeAccess().getIntTypeAction_0_0()); 
            }
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1711:1: ()
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1713:1: 
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1723:1: rule__Type__Group_0__1 : rule__Type__Group_0__1__Impl ;
    public final void rule__Type__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1727:1: ( rule__Type__Group_0__1__Impl )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1728:2: rule__Type__Group_0__1__Impl
            {
            pushFollow(FOLLOW_rule__Type__Group_0__1__Impl_in_rule__Type__Group_0__13618);
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1734:1: rule__Type__Group_0__1__Impl : ( 'int' ) ;
    public final void rule__Type__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1738:1: ( ( 'int' ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1739:1: ( 'int' )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1739:1: ( 'int' )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1740:1: 'int'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypeAccess().getIntKeyword_0_1()); 
            }
            match(input,33,FOLLOW_33_in_rule__Type__Group_0__1__Impl3646); if (state.failed) return ;
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1757:1: rule__Type__Group_1__0 : rule__Type__Group_1__0__Impl rule__Type__Group_1__1 ;
    public final void rule__Type__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1761:1: ( rule__Type__Group_1__0__Impl rule__Type__Group_1__1 )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1762:2: rule__Type__Group_1__0__Impl rule__Type__Group_1__1
            {
            pushFollow(FOLLOW_rule__Type__Group_1__0__Impl_in_rule__Type__Group_1__03681);
            rule__Type__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Type__Group_1__1_in_rule__Type__Group_1__03684);
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1769:1: rule__Type__Group_1__0__Impl : ( () ) ;
    public final void rule__Type__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1773:1: ( ( () ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1774:1: ( () )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1774:1: ( () )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1775:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypeAccess().getBoolTypeAction_1_0()); 
            }
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1776:1: ()
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1778:1: 
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1788:1: rule__Type__Group_1__1 : rule__Type__Group_1__1__Impl ;
    public final void rule__Type__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1792:1: ( rule__Type__Group_1__1__Impl )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1793:2: rule__Type__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Type__Group_1__1__Impl_in_rule__Type__Group_1__13742);
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1799:1: rule__Type__Group_1__1__Impl : ( 'bool' ) ;
    public final void rule__Type__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1803:1: ( ( 'bool' ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1804:1: ( 'bool' )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1804:1: ( 'bool' )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1805:1: 'bool'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypeAccess().getBoolKeyword_1_1()); 
            }
            match(input,34,FOLLOW_34_in_rule__Type__Group_1__1__Impl3770); if (state.failed) return ;
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1822:1: rule__Type__Group_2__0 : rule__Type__Group_2__0__Impl rule__Type__Group_2__1 ;
    public final void rule__Type__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1826:1: ( rule__Type__Group_2__0__Impl rule__Type__Group_2__1 )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1827:2: rule__Type__Group_2__0__Impl rule__Type__Group_2__1
            {
            pushFollow(FOLLOW_rule__Type__Group_2__0__Impl_in_rule__Type__Group_2__03805);
            rule__Type__Group_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Type__Group_2__1_in_rule__Type__Group_2__03808);
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1834:1: rule__Type__Group_2__0__Impl : ( () ) ;
    public final void rule__Type__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1838:1: ( ( () ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1839:1: ( () )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1839:1: ( () )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1840:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypeAccess().getRealTypeAction_2_0()); 
            }
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1841:1: ()
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1843:1: 
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1853:1: rule__Type__Group_2__1 : rule__Type__Group_2__1__Impl ;
    public final void rule__Type__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1857:1: ( rule__Type__Group_2__1__Impl )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1858:2: rule__Type__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__Type__Group_2__1__Impl_in_rule__Type__Group_2__13866);
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1864:1: rule__Type__Group_2__1__Impl : ( 'real' ) ;
    public final void rule__Type__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1868:1: ( ( 'real' ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1869:1: ( 'real' )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1869:1: ( 'real' )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1870:1: 'real'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypeAccess().getRealKeyword_2_1()); 
            }
            match(input,35,FOLLOW_35_in_rule__Type__Group_2__1__Impl3894); if (state.failed) return ;
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1887:1: rule__Type__Group_3__0 : rule__Type__Group_3__0__Impl rule__Type__Group_3__1 ;
    public final void rule__Type__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1891:1: ( rule__Type__Group_3__0__Impl rule__Type__Group_3__1 )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1892:2: rule__Type__Group_3__0__Impl rule__Type__Group_3__1
            {
            pushFollow(FOLLOW_rule__Type__Group_3__0__Impl_in_rule__Type__Group_3__03929);
            rule__Type__Group_3__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Type__Group_3__1_in_rule__Type__Group_3__03932);
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1899:1: rule__Type__Group_3__0__Impl : ( () ) ;
    public final void rule__Type__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1903:1: ( ( () ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1904:1: ( () )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1904:1: ( () )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1905:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypeAccess().getSubrangeTypeAction_3_0()); 
            }
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1906:1: ()
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1908:1: 
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1918:1: rule__Type__Group_3__1 : rule__Type__Group_3__1__Impl rule__Type__Group_3__2 ;
    public final void rule__Type__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1922:1: ( rule__Type__Group_3__1__Impl rule__Type__Group_3__2 )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1923:2: rule__Type__Group_3__1__Impl rule__Type__Group_3__2
            {
            pushFollow(FOLLOW_rule__Type__Group_3__1__Impl_in_rule__Type__Group_3__13990);
            rule__Type__Group_3__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Type__Group_3__2_in_rule__Type__Group_3__13993);
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1930:1: rule__Type__Group_3__1__Impl : ( 'subrange' ) ;
    public final void rule__Type__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1934:1: ( ( 'subrange' ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1935:1: ( 'subrange' )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1935:1: ( 'subrange' )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1936:1: 'subrange'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypeAccess().getSubrangeKeyword_3_1()); 
            }
            match(input,36,FOLLOW_36_in_rule__Type__Group_3__1__Impl4021); if (state.failed) return ;
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1949:1: rule__Type__Group_3__2 : rule__Type__Group_3__2__Impl rule__Type__Group_3__3 ;
    public final void rule__Type__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1953:1: ( rule__Type__Group_3__2__Impl rule__Type__Group_3__3 )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1954:2: rule__Type__Group_3__2__Impl rule__Type__Group_3__3
            {
            pushFollow(FOLLOW_rule__Type__Group_3__2__Impl_in_rule__Type__Group_3__24052);
            rule__Type__Group_3__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Type__Group_3__3_in_rule__Type__Group_3__24055);
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1961:1: rule__Type__Group_3__2__Impl : ( '[' ) ;
    public final void rule__Type__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1965:1: ( ( '[' ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1966:1: ( '[' )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1966:1: ( '[' )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1967:1: '['
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypeAccess().getLeftSquareBracketKeyword_3_2()); 
            }
            match(input,37,FOLLOW_37_in_rule__Type__Group_3__2__Impl4083); if (state.failed) return ;
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1980:1: rule__Type__Group_3__3 : rule__Type__Group_3__3__Impl rule__Type__Group_3__4 ;
    public final void rule__Type__Group_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1984:1: ( rule__Type__Group_3__3__Impl rule__Type__Group_3__4 )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1985:2: rule__Type__Group_3__3__Impl rule__Type__Group_3__4
            {
            pushFollow(FOLLOW_rule__Type__Group_3__3__Impl_in_rule__Type__Group_3__34114);
            rule__Type__Group_3__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Type__Group_3__4_in_rule__Type__Group_3__34117);
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1992:1: rule__Type__Group_3__3__Impl : ( ( rule__Type__LowAssignment_3_3 ) ) ;
    public final void rule__Type__Group_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1996:1: ( ( ( rule__Type__LowAssignment_3_3 ) ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1997:1: ( ( rule__Type__LowAssignment_3_3 ) )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1997:1: ( ( rule__Type__LowAssignment_3_3 ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1998:1: ( rule__Type__LowAssignment_3_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypeAccess().getLowAssignment_3_3()); 
            }
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1999:1: ( rule__Type__LowAssignment_3_3 )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1999:2: rule__Type__LowAssignment_3_3
            {
            pushFollow(FOLLOW_rule__Type__LowAssignment_3_3_in_rule__Type__Group_3__3__Impl4144);
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2009:1: rule__Type__Group_3__4 : rule__Type__Group_3__4__Impl rule__Type__Group_3__5 ;
    public final void rule__Type__Group_3__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2013:1: ( rule__Type__Group_3__4__Impl rule__Type__Group_3__5 )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2014:2: rule__Type__Group_3__4__Impl rule__Type__Group_3__5
            {
            pushFollow(FOLLOW_rule__Type__Group_3__4__Impl_in_rule__Type__Group_3__44174);
            rule__Type__Group_3__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Type__Group_3__5_in_rule__Type__Group_3__44177);
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2021:1: rule__Type__Group_3__4__Impl : ( ',' ) ;
    public final void rule__Type__Group_3__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2025:1: ( ( ',' ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2026:1: ( ',' )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2026:1: ( ',' )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2027:1: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypeAccess().getCommaKeyword_3_4()); 
            }
            match(input,38,FOLLOW_38_in_rule__Type__Group_3__4__Impl4205); if (state.failed) return ;
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2040:1: rule__Type__Group_3__5 : rule__Type__Group_3__5__Impl rule__Type__Group_3__6 ;
    public final void rule__Type__Group_3__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2044:1: ( rule__Type__Group_3__5__Impl rule__Type__Group_3__6 )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2045:2: rule__Type__Group_3__5__Impl rule__Type__Group_3__6
            {
            pushFollow(FOLLOW_rule__Type__Group_3__5__Impl_in_rule__Type__Group_3__54236);
            rule__Type__Group_3__5__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Type__Group_3__6_in_rule__Type__Group_3__54239);
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2052:1: rule__Type__Group_3__5__Impl : ( ( rule__Type__HighAssignment_3_5 ) ) ;
    public final void rule__Type__Group_3__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2056:1: ( ( ( rule__Type__HighAssignment_3_5 ) ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2057:1: ( ( rule__Type__HighAssignment_3_5 ) )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2057:1: ( ( rule__Type__HighAssignment_3_5 ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2058:1: ( rule__Type__HighAssignment_3_5 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypeAccess().getHighAssignment_3_5()); 
            }
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2059:1: ( rule__Type__HighAssignment_3_5 )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2059:2: rule__Type__HighAssignment_3_5
            {
            pushFollow(FOLLOW_rule__Type__HighAssignment_3_5_in_rule__Type__Group_3__5__Impl4266);
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2069:1: rule__Type__Group_3__6 : rule__Type__Group_3__6__Impl rule__Type__Group_3__7 ;
    public final void rule__Type__Group_3__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2073:1: ( rule__Type__Group_3__6__Impl rule__Type__Group_3__7 )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2074:2: rule__Type__Group_3__6__Impl rule__Type__Group_3__7
            {
            pushFollow(FOLLOW_rule__Type__Group_3__6__Impl_in_rule__Type__Group_3__64296);
            rule__Type__Group_3__6__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Type__Group_3__7_in_rule__Type__Group_3__64299);
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2081:1: rule__Type__Group_3__6__Impl : ( ']' ) ;
    public final void rule__Type__Group_3__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2085:1: ( ( ']' ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2086:1: ( ']' )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2086:1: ( ']' )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2087:1: ']'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypeAccess().getRightSquareBracketKeyword_3_6()); 
            }
            match(input,39,FOLLOW_39_in_rule__Type__Group_3__6__Impl4327); if (state.failed) return ;
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2100:1: rule__Type__Group_3__7 : rule__Type__Group_3__7__Impl rule__Type__Group_3__8 ;
    public final void rule__Type__Group_3__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2104:1: ( rule__Type__Group_3__7__Impl rule__Type__Group_3__8 )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2105:2: rule__Type__Group_3__7__Impl rule__Type__Group_3__8
            {
            pushFollow(FOLLOW_rule__Type__Group_3__7__Impl_in_rule__Type__Group_3__74358);
            rule__Type__Group_3__7__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Type__Group_3__8_in_rule__Type__Group_3__74361);
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2112:1: rule__Type__Group_3__7__Impl : ( 'of' ) ;
    public final void rule__Type__Group_3__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2116:1: ( ( 'of' ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2117:1: ( 'of' )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2117:1: ( 'of' )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2118:1: 'of'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypeAccess().getOfKeyword_3_7()); 
            }
            match(input,40,FOLLOW_40_in_rule__Type__Group_3__7__Impl4389); if (state.failed) return ;
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2131:1: rule__Type__Group_3__8 : rule__Type__Group_3__8__Impl ;
    public final void rule__Type__Group_3__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2135:1: ( rule__Type__Group_3__8__Impl )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2136:2: rule__Type__Group_3__8__Impl
            {
            pushFollow(FOLLOW_rule__Type__Group_3__8__Impl_in_rule__Type__Group_3__84420);
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2142:1: rule__Type__Group_3__8__Impl : ( 'int' ) ;
    public final void rule__Type__Group_3__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2146:1: ( ( 'int' ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2147:1: ( 'int' )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2147:1: ( 'int' )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2148:1: 'int'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypeAccess().getIntKeyword_3_8()); 
            }
            match(input,33,FOLLOW_33_in_rule__Type__Group_3__8__Impl4448); if (state.failed) return ;
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2179:1: rule__Type__Group_4__0 : rule__Type__Group_4__0__Impl rule__Type__Group_4__1 ;
    public final void rule__Type__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2183:1: ( rule__Type__Group_4__0__Impl rule__Type__Group_4__1 )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2184:2: rule__Type__Group_4__0__Impl rule__Type__Group_4__1
            {
            pushFollow(FOLLOW_rule__Type__Group_4__0__Impl_in_rule__Type__Group_4__04497);
            rule__Type__Group_4__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Type__Group_4__1_in_rule__Type__Group_4__04500);
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2191:1: rule__Type__Group_4__0__Impl : ( () ) ;
    public final void rule__Type__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2195:1: ( ( () ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2196:1: ( () )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2196:1: ( () )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2197:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypeAccess().getUserTypeAction_4_0()); 
            }
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2198:1: ()
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2200:1: 
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2210:1: rule__Type__Group_4__1 : rule__Type__Group_4__1__Impl ;
    public final void rule__Type__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2214:1: ( rule__Type__Group_4__1__Impl )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2215:2: rule__Type__Group_4__1__Impl
            {
            pushFollow(FOLLOW_rule__Type__Group_4__1__Impl_in_rule__Type__Group_4__14558);
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2221:1: rule__Type__Group_4__1__Impl : ( ( rule__Type__DefAssignment_4_1 ) ) ;
    public final void rule__Type__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2225:1: ( ( ( rule__Type__DefAssignment_4_1 ) ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2226:1: ( ( rule__Type__DefAssignment_4_1 ) )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2226:1: ( ( rule__Type__DefAssignment_4_1 ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2227:1: ( rule__Type__DefAssignment_4_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypeAccess().getDefAssignment_4_1()); 
            }
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2228:1: ( rule__Type__DefAssignment_4_1 )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2228:2: rule__Type__DefAssignment_4_1
            {
            pushFollow(FOLLOW_rule__Type__DefAssignment_4_1_in_rule__Type__Group_4__1__Impl4585);
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2242:1: rule__Bound__Group__0 : rule__Bound__Group__0__Impl rule__Bound__Group__1 ;
    public final void rule__Bound__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2246:1: ( rule__Bound__Group__0__Impl rule__Bound__Group__1 )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2247:2: rule__Bound__Group__0__Impl rule__Bound__Group__1
            {
            pushFollow(FOLLOW_rule__Bound__Group__0__Impl_in_rule__Bound__Group__04619);
            rule__Bound__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Bound__Group__1_in_rule__Bound__Group__04622);
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2254:1: rule__Bound__Group__0__Impl : ( ( '-' )? ) ;
    public final void rule__Bound__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2258:1: ( ( ( '-' )? ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2259:1: ( ( '-' )? )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2259:1: ( ( '-' )? )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2260:1: ( '-' )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBoundAccess().getHyphenMinusKeyword_0()); 
            }
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2261:1: ( '-' )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==21) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2262:2: '-'
                    {
                    match(input,21,FOLLOW_21_in_rule__Bound__Group__0__Impl4651); if (state.failed) return ;

                    }
                    break;

            }

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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2273:1: rule__Bound__Group__1 : rule__Bound__Group__1__Impl ;
    public final void rule__Bound__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2277:1: ( rule__Bound__Group__1__Impl )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2278:2: rule__Bound__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Bound__Group__1__Impl_in_rule__Bound__Group__14684);
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2284:1: rule__Bound__Group__1__Impl : ( RULE_INT ) ;
    public final void rule__Bound__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2288:1: ( ( RULE_INT ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2289:1: ( RULE_INT )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2289:1: ( RULE_INT )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2290:1: RULE_INT
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBoundAccess().getINTTerminalRuleCall_1()); 
            }
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__Bound__Group__1__Impl4711); if (state.failed) return ;
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2305:1: rule__Constant__Group__0 : rule__Constant__Group__0__Impl rule__Constant__Group__1 ;
    public final void rule__Constant__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2309:1: ( rule__Constant__Group__0__Impl rule__Constant__Group__1 )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2310:2: rule__Constant__Group__0__Impl rule__Constant__Group__1
            {
            pushFollow(FOLLOW_rule__Constant__Group__0__Impl_in_rule__Constant__Group__04744);
            rule__Constant__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Constant__Group__1_in_rule__Constant__Group__04747);
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2317:1: rule__Constant__Group__0__Impl : ( 'const' ) ;
    public final void rule__Constant__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2321:1: ( ( 'const' ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2322:1: ( 'const' )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2322:1: ( 'const' )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2323:1: 'const'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConstantAccess().getConstKeyword_0()); 
            }
            match(input,41,FOLLOW_41_in_rule__Constant__Group__0__Impl4775); if (state.failed) return ;
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2336:1: rule__Constant__Group__1 : rule__Constant__Group__1__Impl rule__Constant__Group__2 ;
    public final void rule__Constant__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2340:1: ( rule__Constant__Group__1__Impl rule__Constant__Group__2 )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2341:2: rule__Constant__Group__1__Impl rule__Constant__Group__2
            {
            pushFollow(FOLLOW_rule__Constant__Group__1__Impl_in_rule__Constant__Group__14806);
            rule__Constant__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Constant__Group__2_in_rule__Constant__Group__14809);
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2348:1: rule__Constant__Group__1__Impl : ( ( rule__Constant__NameAssignment_1 ) ) ;
    public final void rule__Constant__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2352:1: ( ( ( rule__Constant__NameAssignment_1 ) ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2353:1: ( ( rule__Constant__NameAssignment_1 ) )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2353:1: ( ( rule__Constant__NameAssignment_1 ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2354:1: ( rule__Constant__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConstantAccess().getNameAssignment_1()); 
            }
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2355:1: ( rule__Constant__NameAssignment_1 )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2355:2: rule__Constant__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Constant__NameAssignment_1_in_rule__Constant__Group__1__Impl4836);
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2365:1: rule__Constant__Group__2 : rule__Constant__Group__2__Impl rule__Constant__Group__3 ;
    public final void rule__Constant__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2369:1: ( rule__Constant__Group__2__Impl rule__Constant__Group__3 )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2370:2: rule__Constant__Group__2__Impl rule__Constant__Group__3
            {
            pushFollow(FOLLOW_rule__Constant__Group__2__Impl_in_rule__Constant__Group__24866);
            rule__Constant__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Constant__Group__3_in_rule__Constant__Group__24869);
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2377:1: rule__Constant__Group__2__Impl : ( ( rule__Constant__Group_2__0 )? ) ;
    public final void rule__Constant__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2381:1: ( ( ( rule__Constant__Group_2__0 )? ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2382:1: ( ( rule__Constant__Group_2__0 )? )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2382:1: ( ( rule__Constant__Group_2__0 )? )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2383:1: ( rule__Constant__Group_2__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConstantAccess().getGroup_2()); 
            }
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2384:1: ( rule__Constant__Group_2__0 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==31) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2384:2: rule__Constant__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__Constant__Group_2__0_in_rule__Constant__Group__2__Impl4896);
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2394:1: rule__Constant__Group__3 : rule__Constant__Group__3__Impl rule__Constant__Group__4 ;
    public final void rule__Constant__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2398:1: ( rule__Constant__Group__3__Impl rule__Constant__Group__4 )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2399:2: rule__Constant__Group__3__Impl rule__Constant__Group__4
            {
            pushFollow(FOLLOW_rule__Constant__Group__3__Impl_in_rule__Constant__Group__34927);
            rule__Constant__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Constant__Group__4_in_rule__Constant__Group__34930);
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2406:1: rule__Constant__Group__3__Impl : ( '=' ) ;
    public final void rule__Constant__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2410:1: ( ( '=' ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2411:1: ( '=' )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2411:1: ( '=' )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2412:1: '='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConstantAccess().getEqualsSignKeyword_3()); 
            }
            match(input,18,FOLLOW_18_in_rule__Constant__Group__3__Impl4958); if (state.failed) return ;
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2425:1: rule__Constant__Group__4 : rule__Constant__Group__4__Impl rule__Constant__Group__5 ;
    public final void rule__Constant__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2429:1: ( rule__Constant__Group__4__Impl rule__Constant__Group__5 )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2430:2: rule__Constant__Group__4__Impl rule__Constant__Group__5
            {
            pushFollow(FOLLOW_rule__Constant__Group__4__Impl_in_rule__Constant__Group__44989);
            rule__Constant__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Constant__Group__5_in_rule__Constant__Group__44992);
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2437:1: rule__Constant__Group__4__Impl : ( ( rule__Constant__ExprAssignment_4 ) ) ;
    public final void rule__Constant__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2441:1: ( ( ( rule__Constant__ExprAssignment_4 ) ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2442:1: ( ( rule__Constant__ExprAssignment_4 ) )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2442:1: ( ( rule__Constant__ExprAssignment_4 ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2443:1: ( rule__Constant__ExprAssignment_4 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConstantAccess().getExprAssignment_4()); 
            }
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2444:1: ( rule__Constant__ExprAssignment_4 )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2444:2: rule__Constant__ExprAssignment_4
            {
            pushFollow(FOLLOW_rule__Constant__ExprAssignment_4_in_rule__Constant__Group__4__Impl5019);
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2454:1: rule__Constant__Group__5 : rule__Constant__Group__5__Impl ;
    public final void rule__Constant__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2458:1: ( rule__Constant__Group__5__Impl )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2459:2: rule__Constant__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__Constant__Group__5__Impl_in_rule__Constant__Group__55049);
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2465:1: rule__Constant__Group__5__Impl : ( ';' ) ;
    public final void rule__Constant__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2469:1: ( ( ';' ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2470:1: ( ';' )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2470:1: ( ';' )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2471:1: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConstantAccess().getSemicolonKeyword_5()); 
            }
            match(input,28,FOLLOW_28_in_rule__Constant__Group__5__Impl5077); if (state.failed) return ;
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2496:1: rule__Constant__Group_2__0 : rule__Constant__Group_2__0__Impl rule__Constant__Group_2__1 ;
    public final void rule__Constant__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2500:1: ( rule__Constant__Group_2__0__Impl rule__Constant__Group_2__1 )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2501:2: rule__Constant__Group_2__0__Impl rule__Constant__Group_2__1
            {
            pushFollow(FOLLOW_rule__Constant__Group_2__0__Impl_in_rule__Constant__Group_2__05120);
            rule__Constant__Group_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Constant__Group_2__1_in_rule__Constant__Group_2__05123);
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2508:1: rule__Constant__Group_2__0__Impl : ( ':' ) ;
    public final void rule__Constant__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2512:1: ( ( ':' ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2513:1: ( ':' )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2513:1: ( ':' )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2514:1: ':'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConstantAccess().getColonKeyword_2_0()); 
            }
            match(input,31,FOLLOW_31_in_rule__Constant__Group_2__0__Impl5151); if (state.failed) return ;
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2527:1: rule__Constant__Group_2__1 : rule__Constant__Group_2__1__Impl ;
    public final void rule__Constant__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2531:1: ( rule__Constant__Group_2__1__Impl )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2532:2: rule__Constant__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__Constant__Group_2__1__Impl_in_rule__Constant__Group_2__15182);
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2538:1: rule__Constant__Group_2__1__Impl : ( ( rule__Constant__TypeAssignment_2_1 ) ) ;
    public final void rule__Constant__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2542:1: ( ( ( rule__Constant__TypeAssignment_2_1 ) ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2543:1: ( ( rule__Constant__TypeAssignment_2_1 ) )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2543:1: ( ( rule__Constant__TypeAssignment_2_1 ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2544:1: ( rule__Constant__TypeAssignment_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConstantAccess().getTypeAssignment_2_1()); 
            }
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2545:1: ( rule__Constant__TypeAssignment_2_1 )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2545:2: rule__Constant__TypeAssignment_2_1
            {
            pushFollow(FOLLOW_rule__Constant__TypeAssignment_2_1_in_rule__Constant__Group_2__1__Impl5209);
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2559:1: rule__Node__Group__0 : rule__Node__Group__0__Impl rule__Node__Group__1 ;
    public final void rule__Node__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2563:1: ( rule__Node__Group__0__Impl rule__Node__Group__1 )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2564:2: rule__Node__Group__0__Impl rule__Node__Group__1
            {
            pushFollow(FOLLOW_rule__Node__Group__0__Impl_in_rule__Node__Group__05243);
            rule__Node__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Node__Group__1_in_rule__Node__Group__05246);
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2571:1: rule__Node__Group__0__Impl : ( 'node' ) ;
    public final void rule__Node__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2575:1: ( ( 'node' ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2576:1: ( 'node' )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2576:1: ( 'node' )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2577:1: 'node'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNodeAccess().getNodeKeyword_0()); 
            }
            match(input,42,FOLLOW_42_in_rule__Node__Group__0__Impl5274); if (state.failed) return ;
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2590:1: rule__Node__Group__1 : rule__Node__Group__1__Impl rule__Node__Group__2 ;
    public final void rule__Node__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2594:1: ( rule__Node__Group__1__Impl rule__Node__Group__2 )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2595:2: rule__Node__Group__1__Impl rule__Node__Group__2
            {
            pushFollow(FOLLOW_rule__Node__Group__1__Impl_in_rule__Node__Group__15305);
            rule__Node__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Node__Group__2_in_rule__Node__Group__15308);
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2602:1: rule__Node__Group__1__Impl : ( ( rule__Node__NameAssignment_1 ) ) ;
    public final void rule__Node__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2606:1: ( ( ( rule__Node__NameAssignment_1 ) ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2607:1: ( ( rule__Node__NameAssignment_1 ) )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2607:1: ( ( rule__Node__NameAssignment_1 ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2608:1: ( rule__Node__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNodeAccess().getNameAssignment_1()); 
            }
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2609:1: ( rule__Node__NameAssignment_1 )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2609:2: rule__Node__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Node__NameAssignment_1_in_rule__Node__Group__1__Impl5335);
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2619:1: rule__Node__Group__2 : rule__Node__Group__2__Impl rule__Node__Group__3 ;
    public final void rule__Node__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2623:1: ( rule__Node__Group__2__Impl rule__Node__Group__3 )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2624:2: rule__Node__Group__2__Impl rule__Node__Group__3
            {
            pushFollow(FOLLOW_rule__Node__Group__2__Impl_in_rule__Node__Group__25365);
            rule__Node__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Node__Group__3_in_rule__Node__Group__25368);
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2631:1: rule__Node__Group__2__Impl : ( '(' ) ;
    public final void rule__Node__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2635:1: ( ( '(' ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2636:1: ( '(' )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2636:1: ( '(' )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2637:1: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNodeAccess().getLeftParenthesisKeyword_2()); 
            }
            match(input,43,FOLLOW_43_in_rule__Node__Group__2__Impl5396); if (state.failed) return ;
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2650:1: rule__Node__Group__3 : rule__Node__Group__3__Impl rule__Node__Group__4 ;
    public final void rule__Node__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2654:1: ( rule__Node__Group__3__Impl rule__Node__Group__4 )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2655:2: rule__Node__Group__3__Impl rule__Node__Group__4
            {
            pushFollow(FOLLOW_rule__Node__Group__3__Impl_in_rule__Node__Group__35427);
            rule__Node__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Node__Group__4_in_rule__Node__Group__35430);
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2662:1: rule__Node__Group__3__Impl : ( ( rule__Node__Group_3__0 )? ) ;
    public final void rule__Node__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2666:1: ( ( ( rule__Node__Group_3__0 )? ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2667:1: ( ( rule__Node__Group_3__0 )? )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2667:1: ( ( rule__Node__Group_3__0 )? )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2668:1: ( rule__Node__Group_3__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNodeAccess().getGroup_3()); 
            }
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2669:1: ( rule__Node__Group_3__0 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==RULE_ID) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2669:2: rule__Node__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__Node__Group_3__0_in_rule__Node__Group__3__Impl5457);
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2679:1: rule__Node__Group__4 : rule__Node__Group__4__Impl rule__Node__Group__5 ;
    public final void rule__Node__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2683:1: ( rule__Node__Group__4__Impl rule__Node__Group__5 )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2684:2: rule__Node__Group__4__Impl rule__Node__Group__5
            {
            pushFollow(FOLLOW_rule__Node__Group__4__Impl_in_rule__Node__Group__45488);
            rule__Node__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Node__Group__5_in_rule__Node__Group__45491);
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2691:1: rule__Node__Group__4__Impl : ( ')' ) ;
    public final void rule__Node__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2695:1: ( ( ')' ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2696:1: ( ')' )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2696:1: ( ')' )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2697:1: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNodeAccess().getRightParenthesisKeyword_4()); 
            }
            match(input,44,FOLLOW_44_in_rule__Node__Group__4__Impl5519); if (state.failed) return ;
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2710:1: rule__Node__Group__5 : rule__Node__Group__5__Impl rule__Node__Group__6 ;
    public final void rule__Node__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2714:1: ( rule__Node__Group__5__Impl rule__Node__Group__6 )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2715:2: rule__Node__Group__5__Impl rule__Node__Group__6
            {
            pushFollow(FOLLOW_rule__Node__Group__5__Impl_in_rule__Node__Group__55550);
            rule__Node__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Node__Group__6_in_rule__Node__Group__55553);
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2722:1: rule__Node__Group__5__Impl : ( 'returns' ) ;
    public final void rule__Node__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2726:1: ( ( 'returns' ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2727:1: ( 'returns' )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2727:1: ( 'returns' )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2728:1: 'returns'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNodeAccess().getReturnsKeyword_5()); 
            }
            match(input,45,FOLLOW_45_in_rule__Node__Group__5__Impl5581); if (state.failed) return ;
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2741:1: rule__Node__Group__6 : rule__Node__Group__6__Impl rule__Node__Group__7 ;
    public final void rule__Node__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2745:1: ( rule__Node__Group__6__Impl rule__Node__Group__7 )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2746:2: rule__Node__Group__6__Impl rule__Node__Group__7
            {
            pushFollow(FOLLOW_rule__Node__Group__6__Impl_in_rule__Node__Group__65612);
            rule__Node__Group__6__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Node__Group__7_in_rule__Node__Group__65615);
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2753:1: rule__Node__Group__6__Impl : ( '(' ) ;
    public final void rule__Node__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2757:1: ( ( '(' ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2758:1: ( '(' )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2758:1: ( '(' )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2759:1: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNodeAccess().getLeftParenthesisKeyword_6()); 
            }
            match(input,43,FOLLOW_43_in_rule__Node__Group__6__Impl5643); if (state.failed) return ;
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2772:1: rule__Node__Group__7 : rule__Node__Group__7__Impl rule__Node__Group__8 ;
    public final void rule__Node__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2776:1: ( rule__Node__Group__7__Impl rule__Node__Group__8 )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2777:2: rule__Node__Group__7__Impl rule__Node__Group__8
            {
            pushFollow(FOLLOW_rule__Node__Group__7__Impl_in_rule__Node__Group__75674);
            rule__Node__Group__7__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Node__Group__8_in_rule__Node__Group__75677);
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2784:1: rule__Node__Group__7__Impl : ( ( rule__Node__Group_7__0 )? ) ;
    public final void rule__Node__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2788:1: ( ( ( rule__Node__Group_7__0 )? ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2789:1: ( ( rule__Node__Group_7__0 )? )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2789:1: ( ( rule__Node__Group_7__0 )? )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2790:1: ( rule__Node__Group_7__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNodeAccess().getGroup_7()); 
            }
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2791:1: ( rule__Node__Group_7__0 )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==RULE_ID) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2791:2: rule__Node__Group_7__0
                    {
                    pushFollow(FOLLOW_rule__Node__Group_7__0_in_rule__Node__Group__7__Impl5704);
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2801:1: rule__Node__Group__8 : rule__Node__Group__8__Impl rule__Node__Group__9 ;
    public final void rule__Node__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2805:1: ( rule__Node__Group__8__Impl rule__Node__Group__9 )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2806:2: rule__Node__Group__8__Impl rule__Node__Group__9
            {
            pushFollow(FOLLOW_rule__Node__Group__8__Impl_in_rule__Node__Group__85735);
            rule__Node__Group__8__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Node__Group__9_in_rule__Node__Group__85738);
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2813:1: rule__Node__Group__8__Impl : ( ')' ) ;
    public final void rule__Node__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2817:1: ( ( ')' ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2818:1: ( ')' )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2818:1: ( ')' )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2819:1: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNodeAccess().getRightParenthesisKeyword_8()); 
            }
            match(input,44,FOLLOW_44_in_rule__Node__Group__8__Impl5766); if (state.failed) return ;
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2832:1: rule__Node__Group__9 : rule__Node__Group__9__Impl rule__Node__Group__10 ;
    public final void rule__Node__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2836:1: ( rule__Node__Group__9__Impl rule__Node__Group__10 )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2837:2: rule__Node__Group__9__Impl rule__Node__Group__10
            {
            pushFollow(FOLLOW_rule__Node__Group__9__Impl_in_rule__Node__Group__95797);
            rule__Node__Group__9__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Node__Group__10_in_rule__Node__Group__95800);
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2844:1: rule__Node__Group__9__Impl : ( ';' ) ;
    public final void rule__Node__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2848:1: ( ( ';' ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2849:1: ( ';' )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2849:1: ( ';' )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2850:1: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNodeAccess().getSemicolonKeyword_9()); 
            }
            match(input,28,FOLLOW_28_in_rule__Node__Group__9__Impl5828); if (state.failed) return ;
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2863:1: rule__Node__Group__10 : rule__Node__Group__10__Impl rule__Node__Group__11 ;
    public final void rule__Node__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2867:1: ( rule__Node__Group__10__Impl rule__Node__Group__11 )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2868:2: rule__Node__Group__10__Impl rule__Node__Group__11
            {
            pushFollow(FOLLOW_rule__Node__Group__10__Impl_in_rule__Node__Group__105859);
            rule__Node__Group__10__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Node__Group__11_in_rule__Node__Group__105862);
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2875:1: rule__Node__Group__10__Impl : ( ( rule__Node__Group_10__0 )? ) ;
    public final void rule__Node__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2879:1: ( ( ( rule__Node__Group_10__0 )? ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2880:1: ( ( rule__Node__Group_10__0 )? )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2880:1: ( ( rule__Node__Group_10__0 )? )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2881:1: ( rule__Node__Group_10__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNodeAccess().getGroup_10()); 
            }
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2882:1: ( rule__Node__Group_10__0 )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==48) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2882:2: rule__Node__Group_10__0
                    {
                    pushFollow(FOLLOW_rule__Node__Group_10__0_in_rule__Node__Group__10__Impl5889);
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2892:1: rule__Node__Group__11 : rule__Node__Group__11__Impl rule__Node__Group__12 ;
    public final void rule__Node__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2896:1: ( rule__Node__Group__11__Impl rule__Node__Group__12 )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2897:2: rule__Node__Group__11__Impl rule__Node__Group__12
            {
            pushFollow(FOLLOW_rule__Node__Group__11__Impl_in_rule__Node__Group__115920);
            rule__Node__Group__11__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Node__Group__12_in_rule__Node__Group__115923);
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2904:1: rule__Node__Group__11__Impl : ( 'let' ) ;
    public final void rule__Node__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2908:1: ( ( 'let' ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2909:1: ( 'let' )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2909:1: ( 'let' )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2910:1: 'let'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNodeAccess().getLetKeyword_11()); 
            }
            match(input,46,FOLLOW_46_in_rule__Node__Group__11__Impl5951); if (state.failed) return ;
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2923:1: rule__Node__Group__12 : rule__Node__Group__12__Impl rule__Node__Group__13 ;
    public final void rule__Node__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2927:1: ( rule__Node__Group__12__Impl rule__Node__Group__13 )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2928:2: rule__Node__Group__12__Impl rule__Node__Group__13
            {
            pushFollow(FOLLOW_rule__Node__Group__12__Impl_in_rule__Node__Group__125982);
            rule__Node__Group__12__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Node__Group__13_in_rule__Node__Group__125985);
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2935:1: rule__Node__Group__12__Impl : ( ( rule__Node__Alternatives_12 )* ) ;
    public final void rule__Node__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2939:1: ( ( ( rule__Node__Alternatives_12 )* ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2940:1: ( ( rule__Node__Alternatives_12 )* )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2940:1: ( ( rule__Node__Alternatives_12 )* )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2941:1: ( rule__Node__Alternatives_12 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNodeAccess().getAlternatives_12()); 
            }
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2942:1: ( rule__Node__Alternatives_12 )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==RULE_ID||(LA19_0>=49 && LA19_0<=51)) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2942:2: rule__Node__Alternatives_12
            	    {
            	    pushFollow(FOLLOW_rule__Node__Alternatives_12_in_rule__Node__Group__12__Impl6012);
            	    rule__Node__Alternatives_12();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop19;
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2952:1: rule__Node__Group__13 : rule__Node__Group__13__Impl rule__Node__Group__14 ;
    public final void rule__Node__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2956:1: ( rule__Node__Group__13__Impl rule__Node__Group__14 )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2957:2: rule__Node__Group__13__Impl rule__Node__Group__14
            {
            pushFollow(FOLLOW_rule__Node__Group__13__Impl_in_rule__Node__Group__136043);
            rule__Node__Group__13__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Node__Group__14_in_rule__Node__Group__136046);
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2964:1: rule__Node__Group__13__Impl : ( 'tel' ) ;
    public final void rule__Node__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2968:1: ( ( 'tel' ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2969:1: ( 'tel' )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2969:1: ( 'tel' )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2970:1: 'tel'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNodeAccess().getTelKeyword_13()); 
            }
            match(input,47,FOLLOW_47_in_rule__Node__Group__13__Impl6074); if (state.failed) return ;
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2983:1: rule__Node__Group__14 : rule__Node__Group__14__Impl ;
    public final void rule__Node__Group__14() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2987:1: ( rule__Node__Group__14__Impl )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2988:2: rule__Node__Group__14__Impl
            {
            pushFollow(FOLLOW_rule__Node__Group__14__Impl_in_rule__Node__Group__146105);
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2994:1: rule__Node__Group__14__Impl : ( ( ';' )? ) ;
    public final void rule__Node__Group__14__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2998:1: ( ( ( ';' )? ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2999:1: ( ( ';' )? )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2999:1: ( ( ';' )? )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3000:1: ( ';' )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNodeAccess().getSemicolonKeyword_14()); 
            }
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3001:1: ( ';' )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==28) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3002:2: ';'
                    {
                    match(input,28,FOLLOW_28_in_rule__Node__Group__14__Impl6134); if (state.failed) return ;

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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3043:1: rule__Node__Group_3__0 : rule__Node__Group_3__0__Impl rule__Node__Group_3__1 ;
    public final void rule__Node__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3047:1: ( rule__Node__Group_3__0__Impl rule__Node__Group_3__1 )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3048:2: rule__Node__Group_3__0__Impl rule__Node__Group_3__1
            {
            pushFollow(FOLLOW_rule__Node__Group_3__0__Impl_in_rule__Node__Group_3__06197);
            rule__Node__Group_3__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Node__Group_3__1_in_rule__Node__Group_3__06200);
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3055:1: rule__Node__Group_3__0__Impl : ( ( rule__Node__InputsAssignment_3_0 ) ) ;
    public final void rule__Node__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3059:1: ( ( ( rule__Node__InputsAssignment_3_0 ) ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3060:1: ( ( rule__Node__InputsAssignment_3_0 ) )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3060:1: ( ( rule__Node__InputsAssignment_3_0 ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3061:1: ( rule__Node__InputsAssignment_3_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNodeAccess().getInputsAssignment_3_0()); 
            }
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3062:1: ( rule__Node__InputsAssignment_3_0 )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3062:2: rule__Node__InputsAssignment_3_0
            {
            pushFollow(FOLLOW_rule__Node__InputsAssignment_3_0_in_rule__Node__Group_3__0__Impl6227);
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3072:1: rule__Node__Group_3__1 : rule__Node__Group_3__1__Impl ;
    public final void rule__Node__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3076:1: ( rule__Node__Group_3__1__Impl )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3077:2: rule__Node__Group_3__1__Impl
            {
            pushFollow(FOLLOW_rule__Node__Group_3__1__Impl_in_rule__Node__Group_3__16257);
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3083:1: rule__Node__Group_3__1__Impl : ( ( rule__Node__Group_3_1__0 )* ) ;
    public final void rule__Node__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3087:1: ( ( ( rule__Node__Group_3_1__0 )* ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3088:1: ( ( rule__Node__Group_3_1__0 )* )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3088:1: ( ( rule__Node__Group_3_1__0 )* )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3089:1: ( rule__Node__Group_3_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNodeAccess().getGroup_3_1()); 
            }
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3090:1: ( rule__Node__Group_3_1__0 )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==28) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3090:2: rule__Node__Group_3_1__0
            	    {
            	    pushFollow(FOLLOW_rule__Node__Group_3_1__0_in_rule__Node__Group_3__1__Impl6284);
            	    rule__Node__Group_3_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop21;
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3104:1: rule__Node__Group_3_1__0 : rule__Node__Group_3_1__0__Impl rule__Node__Group_3_1__1 ;
    public final void rule__Node__Group_3_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3108:1: ( rule__Node__Group_3_1__0__Impl rule__Node__Group_3_1__1 )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3109:2: rule__Node__Group_3_1__0__Impl rule__Node__Group_3_1__1
            {
            pushFollow(FOLLOW_rule__Node__Group_3_1__0__Impl_in_rule__Node__Group_3_1__06319);
            rule__Node__Group_3_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Node__Group_3_1__1_in_rule__Node__Group_3_1__06322);
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3116:1: rule__Node__Group_3_1__0__Impl : ( ';' ) ;
    public final void rule__Node__Group_3_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3120:1: ( ( ';' ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3121:1: ( ';' )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3121:1: ( ';' )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3122:1: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNodeAccess().getSemicolonKeyword_3_1_0()); 
            }
            match(input,28,FOLLOW_28_in_rule__Node__Group_3_1__0__Impl6350); if (state.failed) return ;
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3135:1: rule__Node__Group_3_1__1 : rule__Node__Group_3_1__1__Impl ;
    public final void rule__Node__Group_3_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3139:1: ( rule__Node__Group_3_1__1__Impl )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3140:2: rule__Node__Group_3_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Node__Group_3_1__1__Impl_in_rule__Node__Group_3_1__16381);
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3146:1: rule__Node__Group_3_1__1__Impl : ( ( rule__Node__InputsAssignment_3_1_1 ) ) ;
    public final void rule__Node__Group_3_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3150:1: ( ( ( rule__Node__InputsAssignment_3_1_1 ) ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3151:1: ( ( rule__Node__InputsAssignment_3_1_1 ) )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3151:1: ( ( rule__Node__InputsAssignment_3_1_1 ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3152:1: ( rule__Node__InputsAssignment_3_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNodeAccess().getInputsAssignment_3_1_1()); 
            }
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3153:1: ( rule__Node__InputsAssignment_3_1_1 )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3153:2: rule__Node__InputsAssignment_3_1_1
            {
            pushFollow(FOLLOW_rule__Node__InputsAssignment_3_1_1_in_rule__Node__Group_3_1__1__Impl6408);
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3167:1: rule__Node__Group_7__0 : rule__Node__Group_7__0__Impl rule__Node__Group_7__1 ;
    public final void rule__Node__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3171:1: ( rule__Node__Group_7__0__Impl rule__Node__Group_7__1 )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3172:2: rule__Node__Group_7__0__Impl rule__Node__Group_7__1
            {
            pushFollow(FOLLOW_rule__Node__Group_7__0__Impl_in_rule__Node__Group_7__06442);
            rule__Node__Group_7__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Node__Group_7__1_in_rule__Node__Group_7__06445);
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3179:1: rule__Node__Group_7__0__Impl : ( ( rule__Node__OutputsAssignment_7_0 ) ) ;
    public final void rule__Node__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3183:1: ( ( ( rule__Node__OutputsAssignment_7_0 ) ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3184:1: ( ( rule__Node__OutputsAssignment_7_0 ) )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3184:1: ( ( rule__Node__OutputsAssignment_7_0 ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3185:1: ( rule__Node__OutputsAssignment_7_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNodeAccess().getOutputsAssignment_7_0()); 
            }
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3186:1: ( rule__Node__OutputsAssignment_7_0 )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3186:2: rule__Node__OutputsAssignment_7_0
            {
            pushFollow(FOLLOW_rule__Node__OutputsAssignment_7_0_in_rule__Node__Group_7__0__Impl6472);
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3196:1: rule__Node__Group_7__1 : rule__Node__Group_7__1__Impl ;
    public final void rule__Node__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3200:1: ( rule__Node__Group_7__1__Impl )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3201:2: rule__Node__Group_7__1__Impl
            {
            pushFollow(FOLLOW_rule__Node__Group_7__1__Impl_in_rule__Node__Group_7__16502);
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3207:1: rule__Node__Group_7__1__Impl : ( ( rule__Node__Group_7_1__0 )* ) ;
    public final void rule__Node__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3211:1: ( ( ( rule__Node__Group_7_1__0 )* ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3212:1: ( ( rule__Node__Group_7_1__0 )* )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3212:1: ( ( rule__Node__Group_7_1__0 )* )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3213:1: ( rule__Node__Group_7_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNodeAccess().getGroup_7_1()); 
            }
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3214:1: ( rule__Node__Group_7_1__0 )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==28) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3214:2: rule__Node__Group_7_1__0
            	    {
            	    pushFollow(FOLLOW_rule__Node__Group_7_1__0_in_rule__Node__Group_7__1__Impl6529);
            	    rule__Node__Group_7_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop22;
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3228:1: rule__Node__Group_7_1__0 : rule__Node__Group_7_1__0__Impl rule__Node__Group_7_1__1 ;
    public final void rule__Node__Group_7_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3232:1: ( rule__Node__Group_7_1__0__Impl rule__Node__Group_7_1__1 )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3233:2: rule__Node__Group_7_1__0__Impl rule__Node__Group_7_1__1
            {
            pushFollow(FOLLOW_rule__Node__Group_7_1__0__Impl_in_rule__Node__Group_7_1__06564);
            rule__Node__Group_7_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Node__Group_7_1__1_in_rule__Node__Group_7_1__06567);
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3240:1: rule__Node__Group_7_1__0__Impl : ( ';' ) ;
    public final void rule__Node__Group_7_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3244:1: ( ( ';' ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3245:1: ( ';' )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3245:1: ( ';' )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3246:1: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNodeAccess().getSemicolonKeyword_7_1_0()); 
            }
            match(input,28,FOLLOW_28_in_rule__Node__Group_7_1__0__Impl6595); if (state.failed) return ;
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3259:1: rule__Node__Group_7_1__1 : rule__Node__Group_7_1__1__Impl ;
    public final void rule__Node__Group_7_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3263:1: ( rule__Node__Group_7_1__1__Impl )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3264:2: rule__Node__Group_7_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Node__Group_7_1__1__Impl_in_rule__Node__Group_7_1__16626);
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3270:1: rule__Node__Group_7_1__1__Impl : ( ( rule__Node__OutputsAssignment_7_1_1 ) ) ;
    public final void rule__Node__Group_7_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3274:1: ( ( ( rule__Node__OutputsAssignment_7_1_1 ) ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3275:1: ( ( rule__Node__OutputsAssignment_7_1_1 ) )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3275:1: ( ( rule__Node__OutputsAssignment_7_1_1 ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3276:1: ( rule__Node__OutputsAssignment_7_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNodeAccess().getOutputsAssignment_7_1_1()); 
            }
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3277:1: ( rule__Node__OutputsAssignment_7_1_1 )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3277:2: rule__Node__OutputsAssignment_7_1_1
            {
            pushFollow(FOLLOW_rule__Node__OutputsAssignment_7_1_1_in_rule__Node__Group_7_1__1__Impl6653);
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3291:1: rule__Node__Group_10__0 : rule__Node__Group_10__0__Impl rule__Node__Group_10__1 ;
    public final void rule__Node__Group_10__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3295:1: ( rule__Node__Group_10__0__Impl rule__Node__Group_10__1 )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3296:2: rule__Node__Group_10__0__Impl rule__Node__Group_10__1
            {
            pushFollow(FOLLOW_rule__Node__Group_10__0__Impl_in_rule__Node__Group_10__06687);
            rule__Node__Group_10__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Node__Group_10__1_in_rule__Node__Group_10__06690);
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3303:1: rule__Node__Group_10__0__Impl : ( 'var' ) ;
    public final void rule__Node__Group_10__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3307:1: ( ( 'var' ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3308:1: ( 'var' )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3308:1: ( 'var' )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3309:1: 'var'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNodeAccess().getVarKeyword_10_0()); 
            }
            match(input,48,FOLLOW_48_in_rule__Node__Group_10__0__Impl6718); if (state.failed) return ;
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3322:1: rule__Node__Group_10__1 : rule__Node__Group_10__1__Impl ;
    public final void rule__Node__Group_10__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3326:1: ( rule__Node__Group_10__1__Impl )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3327:2: rule__Node__Group_10__1__Impl
            {
            pushFollow(FOLLOW_rule__Node__Group_10__1__Impl_in_rule__Node__Group_10__16749);
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3333:1: rule__Node__Group_10__1__Impl : ( ( rule__Node__Group_10_1__0 )* ) ;
    public final void rule__Node__Group_10__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3337:1: ( ( ( rule__Node__Group_10_1__0 )* ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3338:1: ( ( rule__Node__Group_10_1__0 )* )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3338:1: ( ( rule__Node__Group_10_1__0 )* )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3339:1: ( rule__Node__Group_10_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNodeAccess().getGroup_10_1()); 
            }
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3340:1: ( rule__Node__Group_10_1__0 )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==RULE_ID) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3340:2: rule__Node__Group_10_1__0
            	    {
            	    pushFollow(FOLLOW_rule__Node__Group_10_1__0_in_rule__Node__Group_10__1__Impl6776);
            	    rule__Node__Group_10_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop23;
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3354:1: rule__Node__Group_10_1__0 : rule__Node__Group_10_1__0__Impl rule__Node__Group_10_1__1 ;
    public final void rule__Node__Group_10_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3358:1: ( rule__Node__Group_10_1__0__Impl rule__Node__Group_10_1__1 )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3359:2: rule__Node__Group_10_1__0__Impl rule__Node__Group_10_1__1
            {
            pushFollow(FOLLOW_rule__Node__Group_10_1__0__Impl_in_rule__Node__Group_10_1__06811);
            rule__Node__Group_10_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Node__Group_10_1__1_in_rule__Node__Group_10_1__06814);
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3366:1: rule__Node__Group_10_1__0__Impl : ( ( rule__Node__LocalsAssignment_10_1_0 ) ) ;
    public final void rule__Node__Group_10_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3370:1: ( ( ( rule__Node__LocalsAssignment_10_1_0 ) ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3371:1: ( ( rule__Node__LocalsAssignment_10_1_0 ) )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3371:1: ( ( rule__Node__LocalsAssignment_10_1_0 ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3372:1: ( rule__Node__LocalsAssignment_10_1_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNodeAccess().getLocalsAssignment_10_1_0()); 
            }
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3373:1: ( rule__Node__LocalsAssignment_10_1_0 )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3373:2: rule__Node__LocalsAssignment_10_1_0
            {
            pushFollow(FOLLOW_rule__Node__LocalsAssignment_10_1_0_in_rule__Node__Group_10_1__0__Impl6841);
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3383:1: rule__Node__Group_10_1__1 : rule__Node__Group_10_1__1__Impl ;
    public final void rule__Node__Group_10_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3387:1: ( rule__Node__Group_10_1__1__Impl )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3388:2: rule__Node__Group_10_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Node__Group_10_1__1__Impl_in_rule__Node__Group_10_1__16871);
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3394:1: rule__Node__Group_10_1__1__Impl : ( ';' ) ;
    public final void rule__Node__Group_10_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3398:1: ( ( ';' ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3399:1: ( ';' )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3399:1: ( ';' )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3400:1: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNodeAccess().getSemicolonKeyword_10_1_1()); 
            }
            match(input,28,FOLLOW_28_in_rule__Node__Group_10_1__1__Impl6899); if (state.failed) return ;
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


    // $ANTLR start "rule__VariableGroup__Group__0"
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3417:1: rule__VariableGroup__Group__0 : rule__VariableGroup__Group__0__Impl rule__VariableGroup__Group__1 ;
    public final void rule__VariableGroup__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3421:1: ( rule__VariableGroup__Group__0__Impl rule__VariableGroup__Group__1 )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3422:2: rule__VariableGroup__Group__0__Impl rule__VariableGroup__Group__1
            {
            pushFollow(FOLLOW_rule__VariableGroup__Group__0__Impl_in_rule__VariableGroup__Group__06934);
            rule__VariableGroup__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__VariableGroup__Group__1_in_rule__VariableGroup__Group__06937);
            rule__VariableGroup__Group__1();

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
    // $ANTLR end "rule__VariableGroup__Group__0"


    // $ANTLR start "rule__VariableGroup__Group__0__Impl"
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3429:1: rule__VariableGroup__Group__0__Impl : ( ( rule__VariableGroup__VariablesAssignment_0 ) ) ;
    public final void rule__VariableGroup__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3433:1: ( ( ( rule__VariableGroup__VariablesAssignment_0 ) ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3434:1: ( ( rule__VariableGroup__VariablesAssignment_0 ) )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3434:1: ( ( rule__VariableGroup__VariablesAssignment_0 ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3435:1: ( rule__VariableGroup__VariablesAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariableGroupAccess().getVariablesAssignment_0()); 
            }
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3436:1: ( rule__VariableGroup__VariablesAssignment_0 )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3436:2: rule__VariableGroup__VariablesAssignment_0
            {
            pushFollow(FOLLOW_rule__VariableGroup__VariablesAssignment_0_in_rule__VariableGroup__Group__0__Impl6964);
            rule__VariableGroup__VariablesAssignment_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getVariableGroupAccess().getVariablesAssignment_0()); 
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
    // $ANTLR end "rule__VariableGroup__Group__0__Impl"


    // $ANTLR start "rule__VariableGroup__Group__1"
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3446:1: rule__VariableGroup__Group__1 : rule__VariableGroup__Group__1__Impl rule__VariableGroup__Group__2 ;
    public final void rule__VariableGroup__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3450:1: ( rule__VariableGroup__Group__1__Impl rule__VariableGroup__Group__2 )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3451:2: rule__VariableGroup__Group__1__Impl rule__VariableGroup__Group__2
            {
            pushFollow(FOLLOW_rule__VariableGroup__Group__1__Impl_in_rule__VariableGroup__Group__16994);
            rule__VariableGroup__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__VariableGroup__Group__2_in_rule__VariableGroup__Group__16997);
            rule__VariableGroup__Group__2();

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
    // $ANTLR end "rule__VariableGroup__Group__1"


    // $ANTLR start "rule__VariableGroup__Group__1__Impl"
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3458:1: rule__VariableGroup__Group__1__Impl : ( ( rule__VariableGroup__Group_1__0 )* ) ;
    public final void rule__VariableGroup__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3462:1: ( ( ( rule__VariableGroup__Group_1__0 )* ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3463:1: ( ( rule__VariableGroup__Group_1__0 )* )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3463:1: ( ( rule__VariableGroup__Group_1__0 )* )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3464:1: ( rule__VariableGroup__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariableGroupAccess().getGroup_1()); 
            }
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3465:1: ( rule__VariableGroup__Group_1__0 )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==38) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3465:2: rule__VariableGroup__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__VariableGroup__Group_1__0_in_rule__VariableGroup__Group__1__Impl7024);
            	    rule__VariableGroup__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop24;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getVariableGroupAccess().getGroup_1()); 
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
    // $ANTLR end "rule__VariableGroup__Group__1__Impl"


    // $ANTLR start "rule__VariableGroup__Group__2"
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3475:1: rule__VariableGroup__Group__2 : rule__VariableGroup__Group__2__Impl rule__VariableGroup__Group__3 ;
    public final void rule__VariableGroup__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3479:1: ( rule__VariableGroup__Group__2__Impl rule__VariableGroup__Group__3 )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3480:2: rule__VariableGroup__Group__2__Impl rule__VariableGroup__Group__3
            {
            pushFollow(FOLLOW_rule__VariableGroup__Group__2__Impl_in_rule__VariableGroup__Group__27055);
            rule__VariableGroup__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__VariableGroup__Group__3_in_rule__VariableGroup__Group__27058);
            rule__VariableGroup__Group__3();

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
    // $ANTLR end "rule__VariableGroup__Group__2"


    // $ANTLR start "rule__VariableGroup__Group__2__Impl"
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3487:1: rule__VariableGroup__Group__2__Impl : ( ':' ) ;
    public final void rule__VariableGroup__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3491:1: ( ( ':' ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3492:1: ( ':' )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3492:1: ( ':' )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3493:1: ':'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariableGroupAccess().getColonKeyword_2()); 
            }
            match(input,31,FOLLOW_31_in_rule__VariableGroup__Group__2__Impl7086); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getVariableGroupAccess().getColonKeyword_2()); 
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
    // $ANTLR end "rule__VariableGroup__Group__2__Impl"


    // $ANTLR start "rule__VariableGroup__Group__3"
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3506:1: rule__VariableGroup__Group__3 : rule__VariableGroup__Group__3__Impl ;
    public final void rule__VariableGroup__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3510:1: ( rule__VariableGroup__Group__3__Impl )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3511:2: rule__VariableGroup__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__VariableGroup__Group__3__Impl_in_rule__VariableGroup__Group__37117);
            rule__VariableGroup__Group__3__Impl();

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
    // $ANTLR end "rule__VariableGroup__Group__3"


    // $ANTLR start "rule__VariableGroup__Group__3__Impl"
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3517:1: rule__VariableGroup__Group__3__Impl : ( ( rule__VariableGroup__TypeAssignment_3 ) ) ;
    public final void rule__VariableGroup__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3521:1: ( ( ( rule__VariableGroup__TypeAssignment_3 ) ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3522:1: ( ( rule__VariableGroup__TypeAssignment_3 ) )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3522:1: ( ( rule__VariableGroup__TypeAssignment_3 ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3523:1: ( rule__VariableGroup__TypeAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariableGroupAccess().getTypeAssignment_3()); 
            }
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3524:1: ( rule__VariableGroup__TypeAssignment_3 )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3524:2: rule__VariableGroup__TypeAssignment_3
            {
            pushFollow(FOLLOW_rule__VariableGroup__TypeAssignment_3_in_rule__VariableGroup__Group__3__Impl7144);
            rule__VariableGroup__TypeAssignment_3();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getVariableGroupAccess().getTypeAssignment_3()); 
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
    // $ANTLR end "rule__VariableGroup__Group__3__Impl"


    // $ANTLR start "rule__VariableGroup__Group_1__0"
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3542:1: rule__VariableGroup__Group_1__0 : rule__VariableGroup__Group_1__0__Impl rule__VariableGroup__Group_1__1 ;
    public final void rule__VariableGroup__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3546:1: ( rule__VariableGroup__Group_1__0__Impl rule__VariableGroup__Group_1__1 )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3547:2: rule__VariableGroup__Group_1__0__Impl rule__VariableGroup__Group_1__1
            {
            pushFollow(FOLLOW_rule__VariableGroup__Group_1__0__Impl_in_rule__VariableGroup__Group_1__07182);
            rule__VariableGroup__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__VariableGroup__Group_1__1_in_rule__VariableGroup__Group_1__07185);
            rule__VariableGroup__Group_1__1();

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
    // $ANTLR end "rule__VariableGroup__Group_1__0"


    // $ANTLR start "rule__VariableGroup__Group_1__0__Impl"
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3554:1: rule__VariableGroup__Group_1__0__Impl : ( ',' ) ;
    public final void rule__VariableGroup__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3558:1: ( ( ',' ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3559:1: ( ',' )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3559:1: ( ',' )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3560:1: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariableGroupAccess().getCommaKeyword_1_0()); 
            }
            match(input,38,FOLLOW_38_in_rule__VariableGroup__Group_1__0__Impl7213); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getVariableGroupAccess().getCommaKeyword_1_0()); 
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
    // $ANTLR end "rule__VariableGroup__Group_1__0__Impl"


    // $ANTLR start "rule__VariableGroup__Group_1__1"
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3573:1: rule__VariableGroup__Group_1__1 : rule__VariableGroup__Group_1__1__Impl ;
    public final void rule__VariableGroup__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3577:1: ( rule__VariableGroup__Group_1__1__Impl )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3578:2: rule__VariableGroup__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__VariableGroup__Group_1__1__Impl_in_rule__VariableGroup__Group_1__17244);
            rule__VariableGroup__Group_1__1__Impl();

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
    // $ANTLR end "rule__VariableGroup__Group_1__1"


    // $ANTLR start "rule__VariableGroup__Group_1__1__Impl"
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3584:1: rule__VariableGroup__Group_1__1__Impl : ( ( rule__VariableGroup__VariablesAssignment_1_1 ) ) ;
    public final void rule__VariableGroup__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3588:1: ( ( ( rule__VariableGroup__VariablesAssignment_1_1 ) ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3589:1: ( ( rule__VariableGroup__VariablesAssignment_1_1 ) )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3589:1: ( ( rule__VariableGroup__VariablesAssignment_1_1 ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3590:1: ( rule__VariableGroup__VariablesAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariableGroupAccess().getVariablesAssignment_1_1()); 
            }
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3591:1: ( rule__VariableGroup__VariablesAssignment_1_1 )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3591:2: rule__VariableGroup__VariablesAssignment_1_1
            {
            pushFollow(FOLLOW_rule__VariableGroup__VariablesAssignment_1_1_in_rule__VariableGroup__Group_1__1__Impl7271);
            rule__VariableGroup__VariablesAssignment_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getVariableGroupAccess().getVariablesAssignment_1_1()); 
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
    // $ANTLR end "rule__VariableGroup__Group_1__1__Impl"


    // $ANTLR start "rule__Equation__Group__0"
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3605:1: rule__Equation__Group__0 : rule__Equation__Group__0__Impl rule__Equation__Group__1 ;
    public final void rule__Equation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3609:1: ( rule__Equation__Group__0__Impl rule__Equation__Group__1 )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3610:2: rule__Equation__Group__0__Impl rule__Equation__Group__1
            {
            pushFollow(FOLLOW_rule__Equation__Group__0__Impl_in_rule__Equation__Group__07305);
            rule__Equation__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Equation__Group__1_in_rule__Equation__Group__07308);
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3617:1: rule__Equation__Group__0__Impl : ( ( rule__Equation__LhsAssignment_0 ) ) ;
    public final void rule__Equation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3621:1: ( ( ( rule__Equation__LhsAssignment_0 ) ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3622:1: ( ( rule__Equation__LhsAssignment_0 ) )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3622:1: ( ( rule__Equation__LhsAssignment_0 ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3623:1: ( rule__Equation__LhsAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEquationAccess().getLhsAssignment_0()); 
            }
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3624:1: ( rule__Equation__LhsAssignment_0 )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3624:2: rule__Equation__LhsAssignment_0
            {
            pushFollow(FOLLOW_rule__Equation__LhsAssignment_0_in_rule__Equation__Group__0__Impl7335);
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3634:1: rule__Equation__Group__1 : rule__Equation__Group__1__Impl rule__Equation__Group__2 ;
    public final void rule__Equation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3638:1: ( rule__Equation__Group__1__Impl rule__Equation__Group__2 )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3639:2: rule__Equation__Group__1__Impl rule__Equation__Group__2
            {
            pushFollow(FOLLOW_rule__Equation__Group__1__Impl_in_rule__Equation__Group__17365);
            rule__Equation__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Equation__Group__2_in_rule__Equation__Group__17368);
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3646:1: rule__Equation__Group__1__Impl : ( ( rule__Equation__Group_1__0 )* ) ;
    public final void rule__Equation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3650:1: ( ( ( rule__Equation__Group_1__0 )* ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3651:1: ( ( rule__Equation__Group_1__0 )* )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3651:1: ( ( rule__Equation__Group_1__0 )* )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3652:1: ( rule__Equation__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEquationAccess().getGroup_1()); 
            }
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3653:1: ( rule__Equation__Group_1__0 )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==38) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3653:2: rule__Equation__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__Equation__Group_1__0_in_rule__Equation__Group__1__Impl7395);
            	    rule__Equation__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop25;
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3663:1: rule__Equation__Group__2 : rule__Equation__Group__2__Impl rule__Equation__Group__3 ;
    public final void rule__Equation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3667:1: ( rule__Equation__Group__2__Impl rule__Equation__Group__3 )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3668:2: rule__Equation__Group__2__Impl rule__Equation__Group__3
            {
            pushFollow(FOLLOW_rule__Equation__Group__2__Impl_in_rule__Equation__Group__27426);
            rule__Equation__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Equation__Group__3_in_rule__Equation__Group__27429);
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3675:1: rule__Equation__Group__2__Impl : ( '=' ) ;
    public final void rule__Equation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3679:1: ( ( '=' ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3680:1: ( '=' )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3680:1: ( '=' )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3681:1: '='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEquationAccess().getEqualsSignKeyword_2()); 
            }
            match(input,18,FOLLOW_18_in_rule__Equation__Group__2__Impl7457); if (state.failed) return ;
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3694:1: rule__Equation__Group__3 : rule__Equation__Group__3__Impl rule__Equation__Group__4 ;
    public final void rule__Equation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3698:1: ( rule__Equation__Group__3__Impl rule__Equation__Group__4 )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3699:2: rule__Equation__Group__3__Impl rule__Equation__Group__4
            {
            pushFollow(FOLLOW_rule__Equation__Group__3__Impl_in_rule__Equation__Group__37488);
            rule__Equation__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Equation__Group__4_in_rule__Equation__Group__37491);
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3706:1: rule__Equation__Group__3__Impl : ( ( rule__Equation__RhsAssignment_3 ) ) ;
    public final void rule__Equation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3710:1: ( ( ( rule__Equation__RhsAssignment_3 ) ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3711:1: ( ( rule__Equation__RhsAssignment_3 ) )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3711:1: ( ( rule__Equation__RhsAssignment_3 ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3712:1: ( rule__Equation__RhsAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEquationAccess().getRhsAssignment_3()); 
            }
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3713:1: ( rule__Equation__RhsAssignment_3 )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3713:2: rule__Equation__RhsAssignment_3
            {
            pushFollow(FOLLOW_rule__Equation__RhsAssignment_3_in_rule__Equation__Group__3__Impl7518);
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3723:1: rule__Equation__Group__4 : rule__Equation__Group__4__Impl ;
    public final void rule__Equation__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3727:1: ( rule__Equation__Group__4__Impl )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3728:2: rule__Equation__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__Equation__Group__4__Impl_in_rule__Equation__Group__47548);
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3734:1: rule__Equation__Group__4__Impl : ( ';' ) ;
    public final void rule__Equation__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3738:1: ( ( ';' ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3739:1: ( ';' )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3739:1: ( ';' )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3740:1: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEquationAccess().getSemicolonKeyword_4()); 
            }
            match(input,28,FOLLOW_28_in_rule__Equation__Group__4__Impl7576); if (state.failed) return ;
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3763:1: rule__Equation__Group_1__0 : rule__Equation__Group_1__0__Impl rule__Equation__Group_1__1 ;
    public final void rule__Equation__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3767:1: ( rule__Equation__Group_1__0__Impl rule__Equation__Group_1__1 )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3768:2: rule__Equation__Group_1__0__Impl rule__Equation__Group_1__1
            {
            pushFollow(FOLLOW_rule__Equation__Group_1__0__Impl_in_rule__Equation__Group_1__07617);
            rule__Equation__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Equation__Group_1__1_in_rule__Equation__Group_1__07620);
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3775:1: rule__Equation__Group_1__0__Impl : ( ',' ) ;
    public final void rule__Equation__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3779:1: ( ( ',' ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3780:1: ( ',' )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3780:1: ( ',' )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3781:1: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEquationAccess().getCommaKeyword_1_0()); 
            }
            match(input,38,FOLLOW_38_in_rule__Equation__Group_1__0__Impl7648); if (state.failed) return ;
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3794:1: rule__Equation__Group_1__1 : rule__Equation__Group_1__1__Impl ;
    public final void rule__Equation__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3798:1: ( rule__Equation__Group_1__1__Impl )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3799:2: rule__Equation__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Equation__Group_1__1__Impl_in_rule__Equation__Group_1__17679);
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3805:1: rule__Equation__Group_1__1__Impl : ( ( rule__Equation__LhsAssignment_1_1 ) ) ;
    public final void rule__Equation__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3809:1: ( ( ( rule__Equation__LhsAssignment_1_1 ) ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3810:1: ( ( rule__Equation__LhsAssignment_1_1 ) )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3810:1: ( ( rule__Equation__LhsAssignment_1_1 ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3811:1: ( rule__Equation__LhsAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEquationAccess().getLhsAssignment_1_1()); 
            }
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3812:1: ( rule__Equation__LhsAssignment_1_1 )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3812:2: rule__Equation__LhsAssignment_1_1
            {
            pushFollow(FOLLOW_rule__Equation__LhsAssignment_1_1_in_rule__Equation__Group_1__1__Impl7706);
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3826:1: rule__Property__Group__0 : rule__Property__Group__0__Impl rule__Property__Group__1 ;
    public final void rule__Property__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3830:1: ( rule__Property__Group__0__Impl rule__Property__Group__1 )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3831:2: rule__Property__Group__0__Impl rule__Property__Group__1
            {
            pushFollow(FOLLOW_rule__Property__Group__0__Impl_in_rule__Property__Group__07740);
            rule__Property__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Property__Group__1_in_rule__Property__Group__07743);
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3838:1: rule__Property__Group__0__Impl : ( '--%PROPERTY' ) ;
    public final void rule__Property__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3842:1: ( ( '--%PROPERTY' ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3843:1: ( '--%PROPERTY' )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3843:1: ( '--%PROPERTY' )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3844:1: '--%PROPERTY'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPropertyAccess().getPROPERTYKeyword_0()); 
            }
            match(input,49,FOLLOW_49_in_rule__Property__Group__0__Impl7771); if (state.failed) return ;
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3857:1: rule__Property__Group__1 : rule__Property__Group__1__Impl rule__Property__Group__2 ;
    public final void rule__Property__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3861:1: ( rule__Property__Group__1__Impl rule__Property__Group__2 )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3862:2: rule__Property__Group__1__Impl rule__Property__Group__2
            {
            pushFollow(FOLLOW_rule__Property__Group__1__Impl_in_rule__Property__Group__17802);
            rule__Property__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Property__Group__2_in_rule__Property__Group__17805);
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3869:1: rule__Property__Group__1__Impl : ( ( rule__Property__RefAssignment_1 ) ) ;
    public final void rule__Property__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3873:1: ( ( ( rule__Property__RefAssignment_1 ) ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3874:1: ( ( rule__Property__RefAssignment_1 ) )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3874:1: ( ( rule__Property__RefAssignment_1 ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3875:1: ( rule__Property__RefAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPropertyAccess().getRefAssignment_1()); 
            }
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3876:1: ( rule__Property__RefAssignment_1 )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3876:2: rule__Property__RefAssignment_1
            {
            pushFollow(FOLLOW_rule__Property__RefAssignment_1_in_rule__Property__Group__1__Impl7832);
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3886:1: rule__Property__Group__2 : rule__Property__Group__2__Impl ;
    public final void rule__Property__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3890:1: ( rule__Property__Group__2__Impl )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3891:2: rule__Property__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Property__Group__2__Impl_in_rule__Property__Group__27862);
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3897:1: rule__Property__Group__2__Impl : ( ';' ) ;
    public final void rule__Property__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3901:1: ( ( ';' ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3902:1: ( ';' )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3902:1: ( ';' )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3903:1: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPropertyAccess().getSemicolonKeyword_2()); 
            }
            match(input,28,FOLLOW_28_in_rule__Property__Group__2__Impl7890); if (state.failed) return ;
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3922:1: rule__Main__Group__0 : rule__Main__Group__0__Impl rule__Main__Group__1 ;
    public final void rule__Main__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3926:1: ( rule__Main__Group__0__Impl rule__Main__Group__1 )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3927:2: rule__Main__Group__0__Impl rule__Main__Group__1
            {
            pushFollow(FOLLOW_rule__Main__Group__0__Impl_in_rule__Main__Group__07927);
            rule__Main__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Main__Group__1_in_rule__Main__Group__07930);
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3934:1: rule__Main__Group__0__Impl : ( '--%MAIN' ) ;
    public final void rule__Main__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3938:1: ( ( '--%MAIN' ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3939:1: ( '--%MAIN' )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3939:1: ( '--%MAIN' )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3940:1: '--%MAIN'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMainAccess().getMAINKeyword_0()); 
            }
            match(input,50,FOLLOW_50_in_rule__Main__Group__0__Impl7958); if (state.failed) return ;
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3953:1: rule__Main__Group__1 : rule__Main__Group__1__Impl ;
    public final void rule__Main__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3957:1: ( rule__Main__Group__1__Impl )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3958:2: rule__Main__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Main__Group__1__Impl_in_rule__Main__Group__17989);
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3964:1: rule__Main__Group__1__Impl : ( ( ';' )? ) ;
    public final void rule__Main__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3968:1: ( ( ( ';' )? ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3969:1: ( ( ';' )? )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3969:1: ( ( ';' )? )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3970:1: ( ';' )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMainAccess().getSemicolonKeyword_1()); 
            }
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3971:1: ( ';' )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==28) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3972:2: ';'
                    {
                    match(input,28,FOLLOW_28_in_rule__Main__Group__1__Impl8018); if (state.failed) return ;

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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3987:1: rule__Assertion__Group__0 : rule__Assertion__Group__0__Impl rule__Assertion__Group__1 ;
    public final void rule__Assertion__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3991:1: ( rule__Assertion__Group__0__Impl rule__Assertion__Group__1 )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3992:2: rule__Assertion__Group__0__Impl rule__Assertion__Group__1
            {
            pushFollow(FOLLOW_rule__Assertion__Group__0__Impl_in_rule__Assertion__Group__08055);
            rule__Assertion__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Assertion__Group__1_in_rule__Assertion__Group__08058);
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3999:1: rule__Assertion__Group__0__Impl : ( 'assert' ) ;
    public final void rule__Assertion__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4003:1: ( ( 'assert' ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4004:1: ( 'assert' )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4004:1: ( 'assert' )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4005:1: 'assert'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAssertionAccess().getAssertKeyword_0()); 
            }
            match(input,51,FOLLOW_51_in_rule__Assertion__Group__0__Impl8086); if (state.failed) return ;
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4018:1: rule__Assertion__Group__1 : rule__Assertion__Group__1__Impl rule__Assertion__Group__2 ;
    public final void rule__Assertion__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4022:1: ( rule__Assertion__Group__1__Impl rule__Assertion__Group__2 )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4023:2: rule__Assertion__Group__1__Impl rule__Assertion__Group__2
            {
            pushFollow(FOLLOW_rule__Assertion__Group__1__Impl_in_rule__Assertion__Group__18117);
            rule__Assertion__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Assertion__Group__2_in_rule__Assertion__Group__18120);
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4030:1: rule__Assertion__Group__1__Impl : ( ( rule__Assertion__ExprAssignment_1 ) ) ;
    public final void rule__Assertion__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4034:1: ( ( ( rule__Assertion__ExprAssignment_1 ) ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4035:1: ( ( rule__Assertion__ExprAssignment_1 ) )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4035:1: ( ( rule__Assertion__ExprAssignment_1 ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4036:1: ( rule__Assertion__ExprAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAssertionAccess().getExprAssignment_1()); 
            }
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4037:1: ( rule__Assertion__ExprAssignment_1 )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4037:2: rule__Assertion__ExprAssignment_1
            {
            pushFollow(FOLLOW_rule__Assertion__ExprAssignment_1_in_rule__Assertion__Group__1__Impl8147);
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4047:1: rule__Assertion__Group__2 : rule__Assertion__Group__2__Impl ;
    public final void rule__Assertion__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4051:1: ( rule__Assertion__Group__2__Impl )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4052:2: rule__Assertion__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Assertion__Group__2__Impl_in_rule__Assertion__Group__28177);
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4058:1: rule__Assertion__Group__2__Impl : ( ';' ) ;
    public final void rule__Assertion__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4062:1: ( ( ';' ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4063:1: ( ';' )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4063:1: ( ';' )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4064:1: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAssertionAccess().getSemicolonKeyword_2()); 
            }
            match(input,28,FOLLOW_28_in_rule__Assertion__Group__2__Impl8205); if (state.failed) return ;
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4083:1: rule__ArrowExpr__Group__0 : rule__ArrowExpr__Group__0__Impl rule__ArrowExpr__Group__1 ;
    public final void rule__ArrowExpr__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4087:1: ( rule__ArrowExpr__Group__0__Impl rule__ArrowExpr__Group__1 )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4088:2: rule__ArrowExpr__Group__0__Impl rule__ArrowExpr__Group__1
            {
            pushFollow(FOLLOW_rule__ArrowExpr__Group__0__Impl_in_rule__ArrowExpr__Group__08242);
            rule__ArrowExpr__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ArrowExpr__Group__1_in_rule__ArrowExpr__Group__08245);
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4095:1: rule__ArrowExpr__Group__0__Impl : ( ruleImpliesExpr ) ;
    public final void rule__ArrowExpr__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4099:1: ( ( ruleImpliesExpr ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4100:1: ( ruleImpliesExpr )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4100:1: ( ruleImpliesExpr )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4101:1: ruleImpliesExpr
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getArrowExprAccess().getImpliesExprParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_ruleImpliesExpr_in_rule__ArrowExpr__Group__0__Impl8272);
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4112:1: rule__ArrowExpr__Group__1 : rule__ArrowExpr__Group__1__Impl ;
    public final void rule__ArrowExpr__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4116:1: ( rule__ArrowExpr__Group__1__Impl )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4117:2: rule__ArrowExpr__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__ArrowExpr__Group__1__Impl_in_rule__ArrowExpr__Group__18301);
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4123:1: rule__ArrowExpr__Group__1__Impl : ( ( rule__ArrowExpr__Group_1__0 )? ) ;
    public final void rule__ArrowExpr__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4127:1: ( ( ( rule__ArrowExpr__Group_1__0 )? ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4128:1: ( ( rule__ArrowExpr__Group_1__0 )? )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4128:1: ( ( rule__ArrowExpr__Group_1__0 )? )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4129:1: ( rule__ArrowExpr__Group_1__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getArrowExprAccess().getGroup_1()); 
            }
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4130:1: ( rule__ArrowExpr__Group_1__0 )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==56) ) {
                int LA27_1 = input.LA(2);

                if ( (synpred45_InternalJKind()) ) {
                    alt27=1;
                }
            }
            switch (alt27) {
                case 1 :
                    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4130:2: rule__ArrowExpr__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__ArrowExpr__Group_1__0_in_rule__ArrowExpr__Group__1__Impl8328);
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4144:1: rule__ArrowExpr__Group_1__0 : rule__ArrowExpr__Group_1__0__Impl ;
    public final void rule__ArrowExpr__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4148:1: ( rule__ArrowExpr__Group_1__0__Impl )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4149:2: rule__ArrowExpr__Group_1__0__Impl
            {
            pushFollow(FOLLOW_rule__ArrowExpr__Group_1__0__Impl_in_rule__ArrowExpr__Group_1__08363);
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4155:1: rule__ArrowExpr__Group_1__0__Impl : ( ( rule__ArrowExpr__Group_1_0__0 ) ) ;
    public final void rule__ArrowExpr__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4159:1: ( ( ( rule__ArrowExpr__Group_1_0__0 ) ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4160:1: ( ( rule__ArrowExpr__Group_1_0__0 ) )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4160:1: ( ( rule__ArrowExpr__Group_1_0__0 ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4161:1: ( rule__ArrowExpr__Group_1_0__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getArrowExprAccess().getGroup_1_0()); 
            }
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4162:1: ( rule__ArrowExpr__Group_1_0__0 )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4162:2: rule__ArrowExpr__Group_1_0__0
            {
            pushFollow(FOLLOW_rule__ArrowExpr__Group_1_0__0_in_rule__ArrowExpr__Group_1__0__Impl8390);
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4174:1: rule__ArrowExpr__Group_1_0__0 : rule__ArrowExpr__Group_1_0__0__Impl rule__ArrowExpr__Group_1_0__1 ;
    public final void rule__ArrowExpr__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4178:1: ( rule__ArrowExpr__Group_1_0__0__Impl rule__ArrowExpr__Group_1_0__1 )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4179:2: rule__ArrowExpr__Group_1_0__0__Impl rule__ArrowExpr__Group_1_0__1
            {
            pushFollow(FOLLOW_rule__ArrowExpr__Group_1_0__0__Impl_in_rule__ArrowExpr__Group_1_0__08422);
            rule__ArrowExpr__Group_1_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ArrowExpr__Group_1_0__1_in_rule__ArrowExpr__Group_1_0__08425);
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4186:1: rule__ArrowExpr__Group_1_0__0__Impl : ( () ) ;
    public final void rule__ArrowExpr__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4190:1: ( ( () ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4191:1: ( () )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4191:1: ( () )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4192:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getArrowExprAccess().getBinaryExprLeftAction_1_0_0()); 
            }
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4193:1: ()
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4195:1: 
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4205:1: rule__ArrowExpr__Group_1_0__1 : rule__ArrowExpr__Group_1_0__1__Impl rule__ArrowExpr__Group_1_0__2 ;
    public final void rule__ArrowExpr__Group_1_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4209:1: ( rule__ArrowExpr__Group_1_0__1__Impl rule__ArrowExpr__Group_1_0__2 )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4210:2: rule__ArrowExpr__Group_1_0__1__Impl rule__ArrowExpr__Group_1_0__2
            {
            pushFollow(FOLLOW_rule__ArrowExpr__Group_1_0__1__Impl_in_rule__ArrowExpr__Group_1_0__18483);
            rule__ArrowExpr__Group_1_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ArrowExpr__Group_1_0__2_in_rule__ArrowExpr__Group_1_0__18486);
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4217:1: rule__ArrowExpr__Group_1_0__1__Impl : ( ( rule__ArrowExpr__OpAssignment_1_0_1 ) ) ;
    public final void rule__ArrowExpr__Group_1_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4221:1: ( ( ( rule__ArrowExpr__OpAssignment_1_0_1 ) ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4222:1: ( ( rule__ArrowExpr__OpAssignment_1_0_1 ) )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4222:1: ( ( rule__ArrowExpr__OpAssignment_1_0_1 ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4223:1: ( rule__ArrowExpr__OpAssignment_1_0_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getArrowExprAccess().getOpAssignment_1_0_1()); 
            }
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4224:1: ( rule__ArrowExpr__OpAssignment_1_0_1 )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4224:2: rule__ArrowExpr__OpAssignment_1_0_1
            {
            pushFollow(FOLLOW_rule__ArrowExpr__OpAssignment_1_0_1_in_rule__ArrowExpr__Group_1_0__1__Impl8513);
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4234:1: rule__ArrowExpr__Group_1_0__2 : rule__ArrowExpr__Group_1_0__2__Impl ;
    public final void rule__ArrowExpr__Group_1_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4238:1: ( rule__ArrowExpr__Group_1_0__2__Impl )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4239:2: rule__ArrowExpr__Group_1_0__2__Impl
            {
            pushFollow(FOLLOW_rule__ArrowExpr__Group_1_0__2__Impl_in_rule__ArrowExpr__Group_1_0__28543);
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4245:1: rule__ArrowExpr__Group_1_0__2__Impl : ( ( rule__ArrowExpr__RightAssignment_1_0_2 ) ) ;
    public final void rule__ArrowExpr__Group_1_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4249:1: ( ( ( rule__ArrowExpr__RightAssignment_1_0_2 ) ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4250:1: ( ( rule__ArrowExpr__RightAssignment_1_0_2 ) )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4250:1: ( ( rule__ArrowExpr__RightAssignment_1_0_2 ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4251:1: ( rule__ArrowExpr__RightAssignment_1_0_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getArrowExprAccess().getRightAssignment_1_0_2()); 
            }
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4252:1: ( rule__ArrowExpr__RightAssignment_1_0_2 )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4252:2: rule__ArrowExpr__RightAssignment_1_0_2
            {
            pushFollow(FOLLOW_rule__ArrowExpr__RightAssignment_1_0_2_in_rule__ArrowExpr__Group_1_0__2__Impl8570);
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4268:1: rule__ImpliesExpr__Group__0 : rule__ImpliesExpr__Group__0__Impl rule__ImpliesExpr__Group__1 ;
    public final void rule__ImpliesExpr__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4272:1: ( rule__ImpliesExpr__Group__0__Impl rule__ImpliesExpr__Group__1 )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4273:2: rule__ImpliesExpr__Group__0__Impl rule__ImpliesExpr__Group__1
            {
            pushFollow(FOLLOW_rule__ImpliesExpr__Group__0__Impl_in_rule__ImpliesExpr__Group__08606);
            rule__ImpliesExpr__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ImpliesExpr__Group__1_in_rule__ImpliesExpr__Group__08609);
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4280:1: rule__ImpliesExpr__Group__0__Impl : ( ruleOrExpr ) ;
    public final void rule__ImpliesExpr__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4284:1: ( ( ruleOrExpr ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4285:1: ( ruleOrExpr )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4285:1: ( ruleOrExpr )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4286:1: ruleOrExpr
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getImpliesExprAccess().getOrExprParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_ruleOrExpr_in_rule__ImpliesExpr__Group__0__Impl8636);
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4297:1: rule__ImpliesExpr__Group__1 : rule__ImpliesExpr__Group__1__Impl ;
    public final void rule__ImpliesExpr__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4301:1: ( rule__ImpliesExpr__Group__1__Impl )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4302:2: rule__ImpliesExpr__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__ImpliesExpr__Group__1__Impl_in_rule__ImpliesExpr__Group__18665);
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4308:1: rule__ImpliesExpr__Group__1__Impl : ( ( rule__ImpliesExpr__Group_1__0 )? ) ;
    public final void rule__ImpliesExpr__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4312:1: ( ( ( rule__ImpliesExpr__Group_1__0 )? ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4313:1: ( ( rule__ImpliesExpr__Group_1__0 )? )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4313:1: ( ( rule__ImpliesExpr__Group_1__0 )? )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4314:1: ( rule__ImpliesExpr__Group_1__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getImpliesExprAccess().getGroup_1()); 
            }
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4315:1: ( rule__ImpliesExpr__Group_1__0 )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==57) ) {
                int LA28_1 = input.LA(2);

                if ( (synpred46_InternalJKind()) ) {
                    alt28=1;
                }
            }
            switch (alt28) {
                case 1 :
                    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4315:2: rule__ImpliesExpr__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__ImpliesExpr__Group_1__0_in_rule__ImpliesExpr__Group__1__Impl8692);
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4329:1: rule__ImpliesExpr__Group_1__0 : rule__ImpliesExpr__Group_1__0__Impl ;
    public final void rule__ImpliesExpr__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4333:1: ( rule__ImpliesExpr__Group_1__0__Impl )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4334:2: rule__ImpliesExpr__Group_1__0__Impl
            {
            pushFollow(FOLLOW_rule__ImpliesExpr__Group_1__0__Impl_in_rule__ImpliesExpr__Group_1__08727);
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4340:1: rule__ImpliesExpr__Group_1__0__Impl : ( ( rule__ImpliesExpr__Group_1_0__0 ) ) ;
    public final void rule__ImpliesExpr__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4344:1: ( ( ( rule__ImpliesExpr__Group_1_0__0 ) ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4345:1: ( ( rule__ImpliesExpr__Group_1_0__0 ) )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4345:1: ( ( rule__ImpliesExpr__Group_1_0__0 ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4346:1: ( rule__ImpliesExpr__Group_1_0__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getImpliesExprAccess().getGroup_1_0()); 
            }
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4347:1: ( rule__ImpliesExpr__Group_1_0__0 )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4347:2: rule__ImpliesExpr__Group_1_0__0
            {
            pushFollow(FOLLOW_rule__ImpliesExpr__Group_1_0__0_in_rule__ImpliesExpr__Group_1__0__Impl8754);
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4359:1: rule__ImpliesExpr__Group_1_0__0 : rule__ImpliesExpr__Group_1_0__0__Impl rule__ImpliesExpr__Group_1_0__1 ;
    public final void rule__ImpliesExpr__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4363:1: ( rule__ImpliesExpr__Group_1_0__0__Impl rule__ImpliesExpr__Group_1_0__1 )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4364:2: rule__ImpliesExpr__Group_1_0__0__Impl rule__ImpliesExpr__Group_1_0__1
            {
            pushFollow(FOLLOW_rule__ImpliesExpr__Group_1_0__0__Impl_in_rule__ImpliesExpr__Group_1_0__08786);
            rule__ImpliesExpr__Group_1_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ImpliesExpr__Group_1_0__1_in_rule__ImpliesExpr__Group_1_0__08789);
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4371:1: rule__ImpliesExpr__Group_1_0__0__Impl : ( () ) ;
    public final void rule__ImpliesExpr__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4375:1: ( ( () ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4376:1: ( () )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4376:1: ( () )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4377:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getImpliesExprAccess().getBinaryExprLeftAction_1_0_0()); 
            }
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4378:1: ()
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4380:1: 
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4390:1: rule__ImpliesExpr__Group_1_0__1 : rule__ImpliesExpr__Group_1_0__1__Impl rule__ImpliesExpr__Group_1_0__2 ;
    public final void rule__ImpliesExpr__Group_1_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4394:1: ( rule__ImpliesExpr__Group_1_0__1__Impl rule__ImpliesExpr__Group_1_0__2 )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4395:2: rule__ImpliesExpr__Group_1_0__1__Impl rule__ImpliesExpr__Group_1_0__2
            {
            pushFollow(FOLLOW_rule__ImpliesExpr__Group_1_0__1__Impl_in_rule__ImpliesExpr__Group_1_0__18847);
            rule__ImpliesExpr__Group_1_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ImpliesExpr__Group_1_0__2_in_rule__ImpliesExpr__Group_1_0__18850);
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4402:1: rule__ImpliesExpr__Group_1_0__1__Impl : ( ( rule__ImpliesExpr__OpAssignment_1_0_1 ) ) ;
    public final void rule__ImpliesExpr__Group_1_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4406:1: ( ( ( rule__ImpliesExpr__OpAssignment_1_0_1 ) ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4407:1: ( ( rule__ImpliesExpr__OpAssignment_1_0_1 ) )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4407:1: ( ( rule__ImpliesExpr__OpAssignment_1_0_1 ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4408:1: ( rule__ImpliesExpr__OpAssignment_1_0_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getImpliesExprAccess().getOpAssignment_1_0_1()); 
            }
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4409:1: ( rule__ImpliesExpr__OpAssignment_1_0_1 )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4409:2: rule__ImpliesExpr__OpAssignment_1_0_1
            {
            pushFollow(FOLLOW_rule__ImpliesExpr__OpAssignment_1_0_1_in_rule__ImpliesExpr__Group_1_0__1__Impl8877);
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4419:1: rule__ImpliesExpr__Group_1_0__2 : rule__ImpliesExpr__Group_1_0__2__Impl ;
    public final void rule__ImpliesExpr__Group_1_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4423:1: ( rule__ImpliesExpr__Group_1_0__2__Impl )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4424:2: rule__ImpliesExpr__Group_1_0__2__Impl
            {
            pushFollow(FOLLOW_rule__ImpliesExpr__Group_1_0__2__Impl_in_rule__ImpliesExpr__Group_1_0__28907);
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4430:1: rule__ImpliesExpr__Group_1_0__2__Impl : ( ( rule__ImpliesExpr__RightAssignment_1_0_2 ) ) ;
    public final void rule__ImpliesExpr__Group_1_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4434:1: ( ( ( rule__ImpliesExpr__RightAssignment_1_0_2 ) ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4435:1: ( ( rule__ImpliesExpr__RightAssignment_1_0_2 ) )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4435:1: ( ( rule__ImpliesExpr__RightAssignment_1_0_2 ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4436:1: ( rule__ImpliesExpr__RightAssignment_1_0_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getImpliesExprAccess().getRightAssignment_1_0_2()); 
            }
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4437:1: ( rule__ImpliesExpr__RightAssignment_1_0_2 )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4437:2: rule__ImpliesExpr__RightAssignment_1_0_2
            {
            pushFollow(FOLLOW_rule__ImpliesExpr__RightAssignment_1_0_2_in_rule__ImpliesExpr__Group_1_0__2__Impl8934);
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4453:1: rule__OrExpr__Group__0 : rule__OrExpr__Group__0__Impl rule__OrExpr__Group__1 ;
    public final void rule__OrExpr__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4457:1: ( rule__OrExpr__Group__0__Impl rule__OrExpr__Group__1 )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4458:2: rule__OrExpr__Group__0__Impl rule__OrExpr__Group__1
            {
            pushFollow(FOLLOW_rule__OrExpr__Group__0__Impl_in_rule__OrExpr__Group__08970);
            rule__OrExpr__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__OrExpr__Group__1_in_rule__OrExpr__Group__08973);
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4465:1: rule__OrExpr__Group__0__Impl : ( ruleAndExpr ) ;
    public final void rule__OrExpr__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4469:1: ( ( ruleAndExpr ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4470:1: ( ruleAndExpr )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4470:1: ( ruleAndExpr )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4471:1: ruleAndExpr
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOrExprAccess().getAndExprParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_ruleAndExpr_in_rule__OrExpr__Group__0__Impl9000);
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4482:1: rule__OrExpr__Group__1 : rule__OrExpr__Group__1__Impl ;
    public final void rule__OrExpr__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4486:1: ( rule__OrExpr__Group__1__Impl )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4487:2: rule__OrExpr__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__OrExpr__Group__1__Impl_in_rule__OrExpr__Group__19029);
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4493:1: rule__OrExpr__Group__1__Impl : ( ( rule__OrExpr__Group_1__0 )* ) ;
    public final void rule__OrExpr__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4497:1: ( ( ( rule__OrExpr__Group_1__0 )* ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4498:1: ( ( rule__OrExpr__Group_1__0 )* )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4498:1: ( ( rule__OrExpr__Group_1__0 )* )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4499:1: ( rule__OrExpr__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOrExprAccess().getGroup_1()); 
            }
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4500:1: ( rule__OrExpr__Group_1__0 )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==12) ) {
                    int LA29_2 = input.LA(2);

                    if ( (synpred47_InternalJKind()) ) {
                        alt29=1;
                    }


                }
                else if ( (LA29_0==13) ) {
                    int LA29_3 = input.LA(2);

                    if ( (synpred47_InternalJKind()) ) {
                        alt29=1;
                    }


                }


                switch (alt29) {
            	case 1 :
            	    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4500:2: rule__OrExpr__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__OrExpr__Group_1__0_in_rule__OrExpr__Group__1__Impl9056);
            	    rule__OrExpr__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop29;
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4514:1: rule__OrExpr__Group_1__0 : rule__OrExpr__Group_1__0__Impl ;
    public final void rule__OrExpr__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4518:1: ( rule__OrExpr__Group_1__0__Impl )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4519:2: rule__OrExpr__Group_1__0__Impl
            {
            pushFollow(FOLLOW_rule__OrExpr__Group_1__0__Impl_in_rule__OrExpr__Group_1__09091);
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4525:1: rule__OrExpr__Group_1__0__Impl : ( ( rule__OrExpr__Group_1_0__0 ) ) ;
    public final void rule__OrExpr__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4529:1: ( ( ( rule__OrExpr__Group_1_0__0 ) ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4530:1: ( ( rule__OrExpr__Group_1_0__0 ) )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4530:1: ( ( rule__OrExpr__Group_1_0__0 ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4531:1: ( rule__OrExpr__Group_1_0__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOrExprAccess().getGroup_1_0()); 
            }
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4532:1: ( rule__OrExpr__Group_1_0__0 )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4532:2: rule__OrExpr__Group_1_0__0
            {
            pushFollow(FOLLOW_rule__OrExpr__Group_1_0__0_in_rule__OrExpr__Group_1__0__Impl9118);
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4544:1: rule__OrExpr__Group_1_0__0 : rule__OrExpr__Group_1_0__0__Impl rule__OrExpr__Group_1_0__1 ;
    public final void rule__OrExpr__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4548:1: ( rule__OrExpr__Group_1_0__0__Impl rule__OrExpr__Group_1_0__1 )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4549:2: rule__OrExpr__Group_1_0__0__Impl rule__OrExpr__Group_1_0__1
            {
            pushFollow(FOLLOW_rule__OrExpr__Group_1_0__0__Impl_in_rule__OrExpr__Group_1_0__09150);
            rule__OrExpr__Group_1_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__OrExpr__Group_1_0__1_in_rule__OrExpr__Group_1_0__09153);
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4556:1: rule__OrExpr__Group_1_0__0__Impl : ( () ) ;
    public final void rule__OrExpr__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4560:1: ( ( () ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4561:1: ( () )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4561:1: ( () )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4562:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOrExprAccess().getBinaryExprLeftAction_1_0_0()); 
            }
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4563:1: ()
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4565:1: 
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4575:1: rule__OrExpr__Group_1_0__1 : rule__OrExpr__Group_1_0__1__Impl rule__OrExpr__Group_1_0__2 ;
    public final void rule__OrExpr__Group_1_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4579:1: ( rule__OrExpr__Group_1_0__1__Impl rule__OrExpr__Group_1_0__2 )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4580:2: rule__OrExpr__Group_1_0__1__Impl rule__OrExpr__Group_1_0__2
            {
            pushFollow(FOLLOW_rule__OrExpr__Group_1_0__1__Impl_in_rule__OrExpr__Group_1_0__19211);
            rule__OrExpr__Group_1_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__OrExpr__Group_1_0__2_in_rule__OrExpr__Group_1_0__19214);
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4587:1: rule__OrExpr__Group_1_0__1__Impl : ( ( rule__OrExpr__OpAssignment_1_0_1 ) ) ;
    public final void rule__OrExpr__Group_1_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4591:1: ( ( ( rule__OrExpr__OpAssignment_1_0_1 ) ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4592:1: ( ( rule__OrExpr__OpAssignment_1_0_1 ) )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4592:1: ( ( rule__OrExpr__OpAssignment_1_0_1 ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4593:1: ( rule__OrExpr__OpAssignment_1_0_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOrExprAccess().getOpAssignment_1_0_1()); 
            }
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4594:1: ( rule__OrExpr__OpAssignment_1_0_1 )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4594:2: rule__OrExpr__OpAssignment_1_0_1
            {
            pushFollow(FOLLOW_rule__OrExpr__OpAssignment_1_0_1_in_rule__OrExpr__Group_1_0__1__Impl9241);
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4604:1: rule__OrExpr__Group_1_0__2 : rule__OrExpr__Group_1_0__2__Impl ;
    public final void rule__OrExpr__Group_1_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4608:1: ( rule__OrExpr__Group_1_0__2__Impl )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4609:2: rule__OrExpr__Group_1_0__2__Impl
            {
            pushFollow(FOLLOW_rule__OrExpr__Group_1_0__2__Impl_in_rule__OrExpr__Group_1_0__29271);
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4615:1: rule__OrExpr__Group_1_0__2__Impl : ( ( rule__OrExpr__RightAssignment_1_0_2 ) ) ;
    public final void rule__OrExpr__Group_1_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4619:1: ( ( ( rule__OrExpr__RightAssignment_1_0_2 ) ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4620:1: ( ( rule__OrExpr__RightAssignment_1_0_2 ) )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4620:1: ( ( rule__OrExpr__RightAssignment_1_0_2 ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4621:1: ( rule__OrExpr__RightAssignment_1_0_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOrExprAccess().getRightAssignment_1_0_2()); 
            }
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4622:1: ( rule__OrExpr__RightAssignment_1_0_2 )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4622:2: rule__OrExpr__RightAssignment_1_0_2
            {
            pushFollow(FOLLOW_rule__OrExpr__RightAssignment_1_0_2_in_rule__OrExpr__Group_1_0__2__Impl9298);
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4638:1: rule__AndExpr__Group__0 : rule__AndExpr__Group__0__Impl rule__AndExpr__Group__1 ;
    public final void rule__AndExpr__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4642:1: ( rule__AndExpr__Group__0__Impl rule__AndExpr__Group__1 )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4643:2: rule__AndExpr__Group__0__Impl rule__AndExpr__Group__1
            {
            pushFollow(FOLLOW_rule__AndExpr__Group__0__Impl_in_rule__AndExpr__Group__09334);
            rule__AndExpr__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__AndExpr__Group__1_in_rule__AndExpr__Group__09337);
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4650:1: rule__AndExpr__Group__0__Impl : ( ruleRelationalExpr ) ;
    public final void rule__AndExpr__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4654:1: ( ( ruleRelationalExpr ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4655:1: ( ruleRelationalExpr )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4655:1: ( ruleRelationalExpr )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4656:1: ruleRelationalExpr
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAndExprAccess().getRelationalExprParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_ruleRelationalExpr_in_rule__AndExpr__Group__0__Impl9364);
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4667:1: rule__AndExpr__Group__1 : rule__AndExpr__Group__1__Impl ;
    public final void rule__AndExpr__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4671:1: ( rule__AndExpr__Group__1__Impl )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4672:2: rule__AndExpr__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__AndExpr__Group__1__Impl_in_rule__AndExpr__Group__19393);
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4678:1: rule__AndExpr__Group__1__Impl : ( ( rule__AndExpr__Group_1__0 )* ) ;
    public final void rule__AndExpr__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4682:1: ( ( ( rule__AndExpr__Group_1__0 )* ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4683:1: ( ( rule__AndExpr__Group_1__0 )* )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4683:1: ( ( rule__AndExpr__Group_1__0 )* )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4684:1: ( rule__AndExpr__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAndExprAccess().getGroup_1()); 
            }
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4685:1: ( rule__AndExpr__Group_1__0 )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==58) ) {
                    int LA30_2 = input.LA(2);

                    if ( (synpred48_InternalJKind()) ) {
                        alt30=1;
                    }


                }


                switch (alt30) {
            	case 1 :
            	    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4685:2: rule__AndExpr__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__AndExpr__Group_1__0_in_rule__AndExpr__Group__1__Impl9420);
            	    rule__AndExpr__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop30;
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4699:1: rule__AndExpr__Group_1__0 : rule__AndExpr__Group_1__0__Impl ;
    public final void rule__AndExpr__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4703:1: ( rule__AndExpr__Group_1__0__Impl )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4704:2: rule__AndExpr__Group_1__0__Impl
            {
            pushFollow(FOLLOW_rule__AndExpr__Group_1__0__Impl_in_rule__AndExpr__Group_1__09455);
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4710:1: rule__AndExpr__Group_1__0__Impl : ( ( rule__AndExpr__Group_1_0__0 ) ) ;
    public final void rule__AndExpr__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4714:1: ( ( ( rule__AndExpr__Group_1_0__0 ) ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4715:1: ( ( rule__AndExpr__Group_1_0__0 ) )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4715:1: ( ( rule__AndExpr__Group_1_0__0 ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4716:1: ( rule__AndExpr__Group_1_0__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAndExprAccess().getGroup_1_0()); 
            }
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4717:1: ( rule__AndExpr__Group_1_0__0 )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4717:2: rule__AndExpr__Group_1_0__0
            {
            pushFollow(FOLLOW_rule__AndExpr__Group_1_0__0_in_rule__AndExpr__Group_1__0__Impl9482);
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4729:1: rule__AndExpr__Group_1_0__0 : rule__AndExpr__Group_1_0__0__Impl rule__AndExpr__Group_1_0__1 ;
    public final void rule__AndExpr__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4733:1: ( rule__AndExpr__Group_1_0__0__Impl rule__AndExpr__Group_1_0__1 )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4734:2: rule__AndExpr__Group_1_0__0__Impl rule__AndExpr__Group_1_0__1
            {
            pushFollow(FOLLOW_rule__AndExpr__Group_1_0__0__Impl_in_rule__AndExpr__Group_1_0__09514);
            rule__AndExpr__Group_1_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__AndExpr__Group_1_0__1_in_rule__AndExpr__Group_1_0__09517);
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4741:1: rule__AndExpr__Group_1_0__0__Impl : ( () ) ;
    public final void rule__AndExpr__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4745:1: ( ( () ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4746:1: ( () )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4746:1: ( () )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4747:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAndExprAccess().getBinaryExprLeftAction_1_0_0()); 
            }
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4748:1: ()
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4750:1: 
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4760:1: rule__AndExpr__Group_1_0__1 : rule__AndExpr__Group_1_0__1__Impl rule__AndExpr__Group_1_0__2 ;
    public final void rule__AndExpr__Group_1_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4764:1: ( rule__AndExpr__Group_1_0__1__Impl rule__AndExpr__Group_1_0__2 )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4765:2: rule__AndExpr__Group_1_0__1__Impl rule__AndExpr__Group_1_0__2
            {
            pushFollow(FOLLOW_rule__AndExpr__Group_1_0__1__Impl_in_rule__AndExpr__Group_1_0__19575);
            rule__AndExpr__Group_1_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__AndExpr__Group_1_0__2_in_rule__AndExpr__Group_1_0__19578);
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4772:1: rule__AndExpr__Group_1_0__1__Impl : ( ( rule__AndExpr__OpAssignment_1_0_1 ) ) ;
    public final void rule__AndExpr__Group_1_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4776:1: ( ( ( rule__AndExpr__OpAssignment_1_0_1 ) ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4777:1: ( ( rule__AndExpr__OpAssignment_1_0_1 ) )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4777:1: ( ( rule__AndExpr__OpAssignment_1_0_1 ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4778:1: ( rule__AndExpr__OpAssignment_1_0_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAndExprAccess().getOpAssignment_1_0_1()); 
            }
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4779:1: ( rule__AndExpr__OpAssignment_1_0_1 )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4779:2: rule__AndExpr__OpAssignment_1_0_1
            {
            pushFollow(FOLLOW_rule__AndExpr__OpAssignment_1_0_1_in_rule__AndExpr__Group_1_0__1__Impl9605);
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4789:1: rule__AndExpr__Group_1_0__2 : rule__AndExpr__Group_1_0__2__Impl ;
    public final void rule__AndExpr__Group_1_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4793:1: ( rule__AndExpr__Group_1_0__2__Impl )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4794:2: rule__AndExpr__Group_1_0__2__Impl
            {
            pushFollow(FOLLOW_rule__AndExpr__Group_1_0__2__Impl_in_rule__AndExpr__Group_1_0__29635);
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4800:1: rule__AndExpr__Group_1_0__2__Impl : ( ( rule__AndExpr__RightAssignment_1_0_2 ) ) ;
    public final void rule__AndExpr__Group_1_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4804:1: ( ( ( rule__AndExpr__RightAssignment_1_0_2 ) ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4805:1: ( ( rule__AndExpr__RightAssignment_1_0_2 ) )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4805:1: ( ( rule__AndExpr__RightAssignment_1_0_2 ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4806:1: ( rule__AndExpr__RightAssignment_1_0_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAndExprAccess().getRightAssignment_1_0_2()); 
            }
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4807:1: ( rule__AndExpr__RightAssignment_1_0_2 )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4807:2: rule__AndExpr__RightAssignment_1_0_2
            {
            pushFollow(FOLLOW_rule__AndExpr__RightAssignment_1_0_2_in_rule__AndExpr__Group_1_0__2__Impl9662);
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4823:1: rule__RelationalExpr__Group__0 : rule__RelationalExpr__Group__0__Impl rule__RelationalExpr__Group__1 ;
    public final void rule__RelationalExpr__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4827:1: ( rule__RelationalExpr__Group__0__Impl rule__RelationalExpr__Group__1 )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4828:2: rule__RelationalExpr__Group__0__Impl rule__RelationalExpr__Group__1
            {
            pushFollow(FOLLOW_rule__RelationalExpr__Group__0__Impl_in_rule__RelationalExpr__Group__09698);
            rule__RelationalExpr__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__RelationalExpr__Group__1_in_rule__RelationalExpr__Group__09701);
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4835:1: rule__RelationalExpr__Group__0__Impl : ( rulePlusExpr ) ;
    public final void rule__RelationalExpr__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4839:1: ( ( rulePlusExpr ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4840:1: ( rulePlusExpr )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4840:1: ( rulePlusExpr )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4841:1: rulePlusExpr
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRelationalExprAccess().getPlusExprParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_rulePlusExpr_in_rule__RelationalExpr__Group__0__Impl9728);
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4852:1: rule__RelationalExpr__Group__1 : rule__RelationalExpr__Group__1__Impl ;
    public final void rule__RelationalExpr__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4856:1: ( rule__RelationalExpr__Group__1__Impl )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4857:2: rule__RelationalExpr__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__RelationalExpr__Group__1__Impl_in_rule__RelationalExpr__Group__19757);
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4863:1: rule__RelationalExpr__Group__1__Impl : ( ( rule__RelationalExpr__Group_1__0 )? ) ;
    public final void rule__RelationalExpr__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4867:1: ( ( ( rule__RelationalExpr__Group_1__0 )? ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4868:1: ( ( rule__RelationalExpr__Group_1__0 )? )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4868:1: ( ( rule__RelationalExpr__Group_1__0 )? )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4869:1: ( rule__RelationalExpr__Group_1__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRelationalExprAccess().getGroup_1()); 
            }
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4870:1: ( rule__RelationalExpr__Group_1__0 )?
            int alt31=2;
            switch ( input.LA(1) ) {
                case 14:
                    {
                    int LA31_1 = input.LA(2);

                    if ( (synpred49_InternalJKind()) ) {
                        alt31=1;
                    }
                    }
                    break;
                case 15:
                    {
                    int LA31_2 = input.LA(2);

                    if ( (synpred49_InternalJKind()) ) {
                        alt31=1;
                    }
                    }
                    break;
                case 16:
                    {
                    int LA31_3 = input.LA(2);

                    if ( (synpred49_InternalJKind()) ) {
                        alt31=1;
                    }
                    }
                    break;
                case 17:
                    {
                    int LA31_4 = input.LA(2);

                    if ( (synpred49_InternalJKind()) ) {
                        alt31=1;
                    }
                    }
                    break;
                case 18:
                    {
                    int LA31_5 = input.LA(2);

                    if ( (synpred49_InternalJKind()) ) {
                        alt31=1;
                    }
                    }
                    break;
                case 19:
                    {
                    int LA31_6 = input.LA(2);

                    if ( (synpred49_InternalJKind()) ) {
                        alt31=1;
                    }
                    }
                    break;
            }

            switch (alt31) {
                case 1 :
                    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4870:2: rule__RelationalExpr__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__RelationalExpr__Group_1__0_in_rule__RelationalExpr__Group__1__Impl9784);
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4884:1: rule__RelationalExpr__Group_1__0 : rule__RelationalExpr__Group_1__0__Impl ;
    public final void rule__RelationalExpr__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4888:1: ( rule__RelationalExpr__Group_1__0__Impl )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4889:2: rule__RelationalExpr__Group_1__0__Impl
            {
            pushFollow(FOLLOW_rule__RelationalExpr__Group_1__0__Impl_in_rule__RelationalExpr__Group_1__09819);
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4895:1: rule__RelationalExpr__Group_1__0__Impl : ( ( rule__RelationalExpr__Group_1_0__0 ) ) ;
    public final void rule__RelationalExpr__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4899:1: ( ( ( rule__RelationalExpr__Group_1_0__0 ) ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4900:1: ( ( rule__RelationalExpr__Group_1_0__0 ) )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4900:1: ( ( rule__RelationalExpr__Group_1_0__0 ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4901:1: ( rule__RelationalExpr__Group_1_0__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRelationalExprAccess().getGroup_1_0()); 
            }
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4902:1: ( rule__RelationalExpr__Group_1_0__0 )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4902:2: rule__RelationalExpr__Group_1_0__0
            {
            pushFollow(FOLLOW_rule__RelationalExpr__Group_1_0__0_in_rule__RelationalExpr__Group_1__0__Impl9846);
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4914:1: rule__RelationalExpr__Group_1_0__0 : rule__RelationalExpr__Group_1_0__0__Impl rule__RelationalExpr__Group_1_0__1 ;
    public final void rule__RelationalExpr__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4918:1: ( rule__RelationalExpr__Group_1_0__0__Impl rule__RelationalExpr__Group_1_0__1 )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4919:2: rule__RelationalExpr__Group_1_0__0__Impl rule__RelationalExpr__Group_1_0__1
            {
            pushFollow(FOLLOW_rule__RelationalExpr__Group_1_0__0__Impl_in_rule__RelationalExpr__Group_1_0__09878);
            rule__RelationalExpr__Group_1_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__RelationalExpr__Group_1_0__1_in_rule__RelationalExpr__Group_1_0__09881);
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4926:1: rule__RelationalExpr__Group_1_0__0__Impl : ( () ) ;
    public final void rule__RelationalExpr__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4930:1: ( ( () ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4931:1: ( () )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4931:1: ( () )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4932:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRelationalExprAccess().getBinaryExprLeftAction_1_0_0()); 
            }
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4933:1: ()
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4935:1: 
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4945:1: rule__RelationalExpr__Group_1_0__1 : rule__RelationalExpr__Group_1_0__1__Impl rule__RelationalExpr__Group_1_0__2 ;
    public final void rule__RelationalExpr__Group_1_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4949:1: ( rule__RelationalExpr__Group_1_0__1__Impl rule__RelationalExpr__Group_1_0__2 )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4950:2: rule__RelationalExpr__Group_1_0__1__Impl rule__RelationalExpr__Group_1_0__2
            {
            pushFollow(FOLLOW_rule__RelationalExpr__Group_1_0__1__Impl_in_rule__RelationalExpr__Group_1_0__19939);
            rule__RelationalExpr__Group_1_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__RelationalExpr__Group_1_0__2_in_rule__RelationalExpr__Group_1_0__19942);
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4957:1: rule__RelationalExpr__Group_1_0__1__Impl : ( ( rule__RelationalExpr__OpAssignment_1_0_1 ) ) ;
    public final void rule__RelationalExpr__Group_1_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4961:1: ( ( ( rule__RelationalExpr__OpAssignment_1_0_1 ) ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4962:1: ( ( rule__RelationalExpr__OpAssignment_1_0_1 ) )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4962:1: ( ( rule__RelationalExpr__OpAssignment_1_0_1 ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4963:1: ( rule__RelationalExpr__OpAssignment_1_0_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRelationalExprAccess().getOpAssignment_1_0_1()); 
            }
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4964:1: ( rule__RelationalExpr__OpAssignment_1_0_1 )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4964:2: rule__RelationalExpr__OpAssignment_1_0_1
            {
            pushFollow(FOLLOW_rule__RelationalExpr__OpAssignment_1_0_1_in_rule__RelationalExpr__Group_1_0__1__Impl9969);
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4974:1: rule__RelationalExpr__Group_1_0__2 : rule__RelationalExpr__Group_1_0__2__Impl ;
    public final void rule__RelationalExpr__Group_1_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4978:1: ( rule__RelationalExpr__Group_1_0__2__Impl )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4979:2: rule__RelationalExpr__Group_1_0__2__Impl
            {
            pushFollow(FOLLOW_rule__RelationalExpr__Group_1_0__2__Impl_in_rule__RelationalExpr__Group_1_0__29999);
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4985:1: rule__RelationalExpr__Group_1_0__2__Impl : ( ( rule__RelationalExpr__RightAssignment_1_0_2 ) ) ;
    public final void rule__RelationalExpr__Group_1_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4989:1: ( ( ( rule__RelationalExpr__RightAssignment_1_0_2 ) ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4990:1: ( ( rule__RelationalExpr__RightAssignment_1_0_2 ) )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4990:1: ( ( rule__RelationalExpr__RightAssignment_1_0_2 ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4991:1: ( rule__RelationalExpr__RightAssignment_1_0_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRelationalExprAccess().getRightAssignment_1_0_2()); 
            }
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4992:1: ( rule__RelationalExpr__RightAssignment_1_0_2 )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4992:2: rule__RelationalExpr__RightAssignment_1_0_2
            {
            pushFollow(FOLLOW_rule__RelationalExpr__RightAssignment_1_0_2_in_rule__RelationalExpr__Group_1_0__2__Impl10026);
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5008:1: rule__PlusExpr__Group__0 : rule__PlusExpr__Group__0__Impl rule__PlusExpr__Group__1 ;
    public final void rule__PlusExpr__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5012:1: ( rule__PlusExpr__Group__0__Impl rule__PlusExpr__Group__1 )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5013:2: rule__PlusExpr__Group__0__Impl rule__PlusExpr__Group__1
            {
            pushFollow(FOLLOW_rule__PlusExpr__Group__0__Impl_in_rule__PlusExpr__Group__010062);
            rule__PlusExpr__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__PlusExpr__Group__1_in_rule__PlusExpr__Group__010065);
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5020:1: rule__PlusExpr__Group__0__Impl : ( ruleTimesExpr ) ;
    public final void rule__PlusExpr__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5024:1: ( ( ruleTimesExpr ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5025:1: ( ruleTimesExpr )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5025:1: ( ruleTimesExpr )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5026:1: ruleTimesExpr
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPlusExprAccess().getTimesExprParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_ruleTimesExpr_in_rule__PlusExpr__Group__0__Impl10092);
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5037:1: rule__PlusExpr__Group__1 : rule__PlusExpr__Group__1__Impl ;
    public final void rule__PlusExpr__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5041:1: ( rule__PlusExpr__Group__1__Impl )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5042:2: rule__PlusExpr__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__PlusExpr__Group__1__Impl_in_rule__PlusExpr__Group__110121);
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5048:1: rule__PlusExpr__Group__1__Impl : ( ( rule__PlusExpr__Group_1__0 )* ) ;
    public final void rule__PlusExpr__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5052:1: ( ( ( rule__PlusExpr__Group_1__0 )* ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5053:1: ( ( rule__PlusExpr__Group_1__0 )* )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5053:1: ( ( rule__PlusExpr__Group_1__0 )* )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5054:1: ( rule__PlusExpr__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPlusExprAccess().getGroup_1()); 
            }
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5055:1: ( rule__PlusExpr__Group_1__0 )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( (LA32_0==20) ) {
                    int LA32_2 = input.LA(2);

                    if ( (synpred50_InternalJKind()) ) {
                        alt32=1;
                    }


                }
                else if ( (LA32_0==21) ) {
                    int LA32_3 = input.LA(2);

                    if ( (synpred50_InternalJKind()) ) {
                        alt32=1;
                    }


                }


                switch (alt32) {
            	case 1 :
            	    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5055:2: rule__PlusExpr__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__PlusExpr__Group_1__0_in_rule__PlusExpr__Group__1__Impl10148);
            	    rule__PlusExpr__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop32;
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5069:1: rule__PlusExpr__Group_1__0 : rule__PlusExpr__Group_1__0__Impl ;
    public final void rule__PlusExpr__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5073:1: ( rule__PlusExpr__Group_1__0__Impl )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5074:2: rule__PlusExpr__Group_1__0__Impl
            {
            pushFollow(FOLLOW_rule__PlusExpr__Group_1__0__Impl_in_rule__PlusExpr__Group_1__010183);
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5080:1: rule__PlusExpr__Group_1__0__Impl : ( ( rule__PlusExpr__Group_1_0__0 ) ) ;
    public final void rule__PlusExpr__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5084:1: ( ( ( rule__PlusExpr__Group_1_0__0 ) ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5085:1: ( ( rule__PlusExpr__Group_1_0__0 ) )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5085:1: ( ( rule__PlusExpr__Group_1_0__0 ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5086:1: ( rule__PlusExpr__Group_1_0__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPlusExprAccess().getGroup_1_0()); 
            }
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5087:1: ( rule__PlusExpr__Group_1_0__0 )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5087:2: rule__PlusExpr__Group_1_0__0
            {
            pushFollow(FOLLOW_rule__PlusExpr__Group_1_0__0_in_rule__PlusExpr__Group_1__0__Impl10210);
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5099:1: rule__PlusExpr__Group_1_0__0 : rule__PlusExpr__Group_1_0__0__Impl rule__PlusExpr__Group_1_0__1 ;
    public final void rule__PlusExpr__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5103:1: ( rule__PlusExpr__Group_1_0__0__Impl rule__PlusExpr__Group_1_0__1 )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5104:2: rule__PlusExpr__Group_1_0__0__Impl rule__PlusExpr__Group_1_0__1
            {
            pushFollow(FOLLOW_rule__PlusExpr__Group_1_0__0__Impl_in_rule__PlusExpr__Group_1_0__010242);
            rule__PlusExpr__Group_1_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__PlusExpr__Group_1_0__1_in_rule__PlusExpr__Group_1_0__010245);
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5111:1: rule__PlusExpr__Group_1_0__0__Impl : ( () ) ;
    public final void rule__PlusExpr__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5115:1: ( ( () ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5116:1: ( () )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5116:1: ( () )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5117:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPlusExprAccess().getBinaryExprLeftAction_1_0_0()); 
            }
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5118:1: ()
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5120:1: 
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5130:1: rule__PlusExpr__Group_1_0__1 : rule__PlusExpr__Group_1_0__1__Impl rule__PlusExpr__Group_1_0__2 ;
    public final void rule__PlusExpr__Group_1_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5134:1: ( rule__PlusExpr__Group_1_0__1__Impl rule__PlusExpr__Group_1_0__2 )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5135:2: rule__PlusExpr__Group_1_0__1__Impl rule__PlusExpr__Group_1_0__2
            {
            pushFollow(FOLLOW_rule__PlusExpr__Group_1_0__1__Impl_in_rule__PlusExpr__Group_1_0__110303);
            rule__PlusExpr__Group_1_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__PlusExpr__Group_1_0__2_in_rule__PlusExpr__Group_1_0__110306);
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5142:1: rule__PlusExpr__Group_1_0__1__Impl : ( ( rule__PlusExpr__OpAssignment_1_0_1 ) ) ;
    public final void rule__PlusExpr__Group_1_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5146:1: ( ( ( rule__PlusExpr__OpAssignment_1_0_1 ) ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5147:1: ( ( rule__PlusExpr__OpAssignment_1_0_1 ) )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5147:1: ( ( rule__PlusExpr__OpAssignment_1_0_1 ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5148:1: ( rule__PlusExpr__OpAssignment_1_0_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPlusExprAccess().getOpAssignment_1_0_1()); 
            }
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5149:1: ( rule__PlusExpr__OpAssignment_1_0_1 )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5149:2: rule__PlusExpr__OpAssignment_1_0_1
            {
            pushFollow(FOLLOW_rule__PlusExpr__OpAssignment_1_0_1_in_rule__PlusExpr__Group_1_0__1__Impl10333);
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5159:1: rule__PlusExpr__Group_1_0__2 : rule__PlusExpr__Group_1_0__2__Impl ;
    public final void rule__PlusExpr__Group_1_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5163:1: ( rule__PlusExpr__Group_1_0__2__Impl )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5164:2: rule__PlusExpr__Group_1_0__2__Impl
            {
            pushFollow(FOLLOW_rule__PlusExpr__Group_1_0__2__Impl_in_rule__PlusExpr__Group_1_0__210363);
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5170:1: rule__PlusExpr__Group_1_0__2__Impl : ( ( rule__PlusExpr__RightAssignment_1_0_2 ) ) ;
    public final void rule__PlusExpr__Group_1_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5174:1: ( ( ( rule__PlusExpr__RightAssignment_1_0_2 ) ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5175:1: ( ( rule__PlusExpr__RightAssignment_1_0_2 ) )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5175:1: ( ( rule__PlusExpr__RightAssignment_1_0_2 ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5176:1: ( rule__PlusExpr__RightAssignment_1_0_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPlusExprAccess().getRightAssignment_1_0_2()); 
            }
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5177:1: ( rule__PlusExpr__RightAssignment_1_0_2 )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5177:2: rule__PlusExpr__RightAssignment_1_0_2
            {
            pushFollow(FOLLOW_rule__PlusExpr__RightAssignment_1_0_2_in_rule__PlusExpr__Group_1_0__2__Impl10390);
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5193:1: rule__TimesExpr__Group__0 : rule__TimesExpr__Group__0__Impl rule__TimesExpr__Group__1 ;
    public final void rule__TimesExpr__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5197:1: ( rule__TimesExpr__Group__0__Impl rule__TimesExpr__Group__1 )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5198:2: rule__TimesExpr__Group__0__Impl rule__TimesExpr__Group__1
            {
            pushFollow(FOLLOW_rule__TimesExpr__Group__0__Impl_in_rule__TimesExpr__Group__010426);
            rule__TimesExpr__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__TimesExpr__Group__1_in_rule__TimesExpr__Group__010429);
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5205:1: rule__TimesExpr__Group__0__Impl : ( rulePrefixExpr ) ;
    public final void rule__TimesExpr__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5209:1: ( ( rulePrefixExpr ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5210:1: ( rulePrefixExpr )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5210:1: ( rulePrefixExpr )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5211:1: rulePrefixExpr
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTimesExprAccess().getPrefixExprParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_rulePrefixExpr_in_rule__TimesExpr__Group__0__Impl10456);
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5222:1: rule__TimesExpr__Group__1 : rule__TimesExpr__Group__1__Impl ;
    public final void rule__TimesExpr__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5226:1: ( rule__TimesExpr__Group__1__Impl )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5227:2: rule__TimesExpr__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__TimesExpr__Group__1__Impl_in_rule__TimesExpr__Group__110485);
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5233:1: rule__TimesExpr__Group__1__Impl : ( ( rule__TimesExpr__Group_1__0 )* ) ;
    public final void rule__TimesExpr__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5237:1: ( ( ( rule__TimesExpr__Group_1__0 )* ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5238:1: ( ( rule__TimesExpr__Group_1__0 )* )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5238:1: ( ( rule__TimesExpr__Group_1__0 )* )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5239:1: ( rule__TimesExpr__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTimesExprAccess().getGroup_1()); 
            }
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5240:1: ( rule__TimesExpr__Group_1__0 )*
            loop33:
            do {
                int alt33=2;
                switch ( input.LA(1) ) {
                case 22:
                    {
                    int LA33_2 = input.LA(2);

                    if ( (synpred51_InternalJKind()) ) {
                        alt33=1;
                    }


                    }
                    break;
                case 23:
                    {
                    int LA33_3 = input.LA(2);

                    if ( (synpred51_InternalJKind()) ) {
                        alt33=1;
                    }


                    }
                    break;
                case 24:
                    {
                    int LA33_4 = input.LA(2);

                    if ( (synpred51_InternalJKind()) ) {
                        alt33=1;
                    }


                    }
                    break;

                }

                switch (alt33) {
            	case 1 :
            	    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5240:2: rule__TimesExpr__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__TimesExpr__Group_1__0_in_rule__TimesExpr__Group__1__Impl10512);
            	    rule__TimesExpr__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop33;
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5254:1: rule__TimesExpr__Group_1__0 : rule__TimesExpr__Group_1__0__Impl ;
    public final void rule__TimesExpr__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5258:1: ( rule__TimesExpr__Group_1__0__Impl )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5259:2: rule__TimesExpr__Group_1__0__Impl
            {
            pushFollow(FOLLOW_rule__TimesExpr__Group_1__0__Impl_in_rule__TimesExpr__Group_1__010547);
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5265:1: rule__TimesExpr__Group_1__0__Impl : ( ( rule__TimesExpr__Group_1_0__0 ) ) ;
    public final void rule__TimesExpr__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5269:1: ( ( ( rule__TimesExpr__Group_1_0__0 ) ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5270:1: ( ( rule__TimesExpr__Group_1_0__0 ) )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5270:1: ( ( rule__TimesExpr__Group_1_0__0 ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5271:1: ( rule__TimesExpr__Group_1_0__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTimesExprAccess().getGroup_1_0()); 
            }
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5272:1: ( rule__TimesExpr__Group_1_0__0 )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5272:2: rule__TimesExpr__Group_1_0__0
            {
            pushFollow(FOLLOW_rule__TimesExpr__Group_1_0__0_in_rule__TimesExpr__Group_1__0__Impl10574);
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5284:1: rule__TimesExpr__Group_1_0__0 : rule__TimesExpr__Group_1_0__0__Impl rule__TimesExpr__Group_1_0__1 ;
    public final void rule__TimesExpr__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5288:1: ( rule__TimesExpr__Group_1_0__0__Impl rule__TimesExpr__Group_1_0__1 )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5289:2: rule__TimesExpr__Group_1_0__0__Impl rule__TimesExpr__Group_1_0__1
            {
            pushFollow(FOLLOW_rule__TimesExpr__Group_1_0__0__Impl_in_rule__TimesExpr__Group_1_0__010606);
            rule__TimesExpr__Group_1_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__TimesExpr__Group_1_0__1_in_rule__TimesExpr__Group_1_0__010609);
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5296:1: rule__TimesExpr__Group_1_0__0__Impl : ( () ) ;
    public final void rule__TimesExpr__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5300:1: ( ( () ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5301:1: ( () )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5301:1: ( () )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5302:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTimesExprAccess().getBinaryExprLeftAction_1_0_0()); 
            }
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5303:1: ()
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5305:1: 
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5315:1: rule__TimesExpr__Group_1_0__1 : rule__TimesExpr__Group_1_0__1__Impl rule__TimesExpr__Group_1_0__2 ;
    public final void rule__TimesExpr__Group_1_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5319:1: ( rule__TimesExpr__Group_1_0__1__Impl rule__TimesExpr__Group_1_0__2 )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5320:2: rule__TimesExpr__Group_1_0__1__Impl rule__TimesExpr__Group_1_0__2
            {
            pushFollow(FOLLOW_rule__TimesExpr__Group_1_0__1__Impl_in_rule__TimesExpr__Group_1_0__110667);
            rule__TimesExpr__Group_1_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__TimesExpr__Group_1_0__2_in_rule__TimesExpr__Group_1_0__110670);
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5327:1: rule__TimesExpr__Group_1_0__1__Impl : ( ( rule__TimesExpr__OpAssignment_1_0_1 ) ) ;
    public final void rule__TimesExpr__Group_1_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5331:1: ( ( ( rule__TimesExpr__OpAssignment_1_0_1 ) ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5332:1: ( ( rule__TimesExpr__OpAssignment_1_0_1 ) )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5332:1: ( ( rule__TimesExpr__OpAssignment_1_0_1 ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5333:1: ( rule__TimesExpr__OpAssignment_1_0_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTimesExprAccess().getOpAssignment_1_0_1()); 
            }
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5334:1: ( rule__TimesExpr__OpAssignment_1_0_1 )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5334:2: rule__TimesExpr__OpAssignment_1_0_1
            {
            pushFollow(FOLLOW_rule__TimesExpr__OpAssignment_1_0_1_in_rule__TimesExpr__Group_1_0__1__Impl10697);
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5344:1: rule__TimesExpr__Group_1_0__2 : rule__TimesExpr__Group_1_0__2__Impl ;
    public final void rule__TimesExpr__Group_1_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5348:1: ( rule__TimesExpr__Group_1_0__2__Impl )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5349:2: rule__TimesExpr__Group_1_0__2__Impl
            {
            pushFollow(FOLLOW_rule__TimesExpr__Group_1_0__2__Impl_in_rule__TimesExpr__Group_1_0__210727);
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5355:1: rule__TimesExpr__Group_1_0__2__Impl : ( ( rule__TimesExpr__RightAssignment_1_0_2 ) ) ;
    public final void rule__TimesExpr__Group_1_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5359:1: ( ( ( rule__TimesExpr__RightAssignment_1_0_2 ) ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5360:1: ( ( rule__TimesExpr__RightAssignment_1_0_2 ) )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5360:1: ( ( rule__TimesExpr__RightAssignment_1_0_2 ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5361:1: ( rule__TimesExpr__RightAssignment_1_0_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTimesExprAccess().getRightAssignment_1_0_2()); 
            }
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5362:1: ( rule__TimesExpr__RightAssignment_1_0_2 )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5362:2: rule__TimesExpr__RightAssignment_1_0_2
            {
            pushFollow(FOLLOW_rule__TimesExpr__RightAssignment_1_0_2_in_rule__TimesExpr__Group_1_0__2__Impl10754);
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5378:1: rule__PrefixExpr__Group_0__0 : rule__PrefixExpr__Group_0__0__Impl rule__PrefixExpr__Group_0__1 ;
    public final void rule__PrefixExpr__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5382:1: ( rule__PrefixExpr__Group_0__0__Impl rule__PrefixExpr__Group_0__1 )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5383:2: rule__PrefixExpr__Group_0__0__Impl rule__PrefixExpr__Group_0__1
            {
            pushFollow(FOLLOW_rule__PrefixExpr__Group_0__0__Impl_in_rule__PrefixExpr__Group_0__010790);
            rule__PrefixExpr__Group_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__PrefixExpr__Group_0__1_in_rule__PrefixExpr__Group_0__010793);
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5390:1: rule__PrefixExpr__Group_0__0__Impl : ( () ) ;
    public final void rule__PrefixExpr__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5394:1: ( ( () ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5395:1: ( () )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5395:1: ( () )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5396:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPrefixExprAccess().getUnaryExprAction_0_0()); 
            }
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5397:1: ()
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5399:1: 
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5409:1: rule__PrefixExpr__Group_0__1 : rule__PrefixExpr__Group_0__1__Impl rule__PrefixExpr__Group_0__2 ;
    public final void rule__PrefixExpr__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5413:1: ( rule__PrefixExpr__Group_0__1__Impl rule__PrefixExpr__Group_0__2 )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5414:2: rule__PrefixExpr__Group_0__1__Impl rule__PrefixExpr__Group_0__2
            {
            pushFollow(FOLLOW_rule__PrefixExpr__Group_0__1__Impl_in_rule__PrefixExpr__Group_0__110851);
            rule__PrefixExpr__Group_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__PrefixExpr__Group_0__2_in_rule__PrefixExpr__Group_0__110854);
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5421:1: rule__PrefixExpr__Group_0__1__Impl : ( ( rule__PrefixExpr__OpAssignment_0_1 ) ) ;
    public final void rule__PrefixExpr__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5425:1: ( ( ( rule__PrefixExpr__OpAssignment_0_1 ) ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5426:1: ( ( rule__PrefixExpr__OpAssignment_0_1 ) )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5426:1: ( ( rule__PrefixExpr__OpAssignment_0_1 ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5427:1: ( rule__PrefixExpr__OpAssignment_0_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPrefixExprAccess().getOpAssignment_0_1()); 
            }
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5428:1: ( rule__PrefixExpr__OpAssignment_0_1 )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5428:2: rule__PrefixExpr__OpAssignment_0_1
            {
            pushFollow(FOLLOW_rule__PrefixExpr__OpAssignment_0_1_in_rule__PrefixExpr__Group_0__1__Impl10881);
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5438:1: rule__PrefixExpr__Group_0__2 : rule__PrefixExpr__Group_0__2__Impl ;
    public final void rule__PrefixExpr__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5442:1: ( rule__PrefixExpr__Group_0__2__Impl )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5443:2: rule__PrefixExpr__Group_0__2__Impl
            {
            pushFollow(FOLLOW_rule__PrefixExpr__Group_0__2__Impl_in_rule__PrefixExpr__Group_0__210911);
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5449:1: rule__PrefixExpr__Group_0__2__Impl : ( ( rule__PrefixExpr__ExprAssignment_0_2 ) ) ;
    public final void rule__PrefixExpr__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5453:1: ( ( ( rule__PrefixExpr__ExprAssignment_0_2 ) ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5454:1: ( ( rule__PrefixExpr__ExprAssignment_0_2 ) )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5454:1: ( ( rule__PrefixExpr__ExprAssignment_0_2 ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5455:1: ( rule__PrefixExpr__ExprAssignment_0_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPrefixExprAccess().getExprAssignment_0_2()); 
            }
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5456:1: ( rule__PrefixExpr__ExprAssignment_0_2 )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5456:2: rule__PrefixExpr__ExprAssignment_0_2
            {
            pushFollow(FOLLOW_rule__PrefixExpr__ExprAssignment_0_2_in_rule__PrefixExpr__Group_0__2__Impl10938);
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


    // $ANTLR start "rule__ProjectionExpr__Group__0"
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5472:1: rule__ProjectionExpr__Group__0 : rule__ProjectionExpr__Group__0__Impl rule__ProjectionExpr__Group__1 ;
    public final void rule__ProjectionExpr__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5476:1: ( rule__ProjectionExpr__Group__0__Impl rule__ProjectionExpr__Group__1 )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5477:2: rule__ProjectionExpr__Group__0__Impl rule__ProjectionExpr__Group__1
            {
            pushFollow(FOLLOW_rule__ProjectionExpr__Group__0__Impl_in_rule__ProjectionExpr__Group__010974);
            rule__ProjectionExpr__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ProjectionExpr__Group__1_in_rule__ProjectionExpr__Group__010977);
            rule__ProjectionExpr__Group__1();

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
    // $ANTLR end "rule__ProjectionExpr__Group__0"


    // $ANTLR start "rule__ProjectionExpr__Group__0__Impl"
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5484:1: rule__ProjectionExpr__Group__0__Impl : ( ruleAtomicExpr ) ;
    public final void rule__ProjectionExpr__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5488:1: ( ( ruleAtomicExpr ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5489:1: ( ruleAtomicExpr )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5489:1: ( ruleAtomicExpr )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5490:1: ruleAtomicExpr
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProjectionExprAccess().getAtomicExprParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_ruleAtomicExpr_in_rule__ProjectionExpr__Group__0__Impl11004);
            ruleAtomicExpr();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getProjectionExprAccess().getAtomicExprParserRuleCall_0()); 
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
    // $ANTLR end "rule__ProjectionExpr__Group__0__Impl"


    // $ANTLR start "rule__ProjectionExpr__Group__1"
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5501:1: rule__ProjectionExpr__Group__1 : rule__ProjectionExpr__Group__1__Impl ;
    public final void rule__ProjectionExpr__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5505:1: ( rule__ProjectionExpr__Group__1__Impl )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5506:2: rule__ProjectionExpr__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__ProjectionExpr__Group__1__Impl_in_rule__ProjectionExpr__Group__111033);
            rule__ProjectionExpr__Group__1__Impl();

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
    // $ANTLR end "rule__ProjectionExpr__Group__1"


    // $ANTLR start "rule__ProjectionExpr__Group__1__Impl"
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5512:1: rule__ProjectionExpr__Group__1__Impl : ( ( rule__ProjectionExpr__Group_1__0 )* ) ;
    public final void rule__ProjectionExpr__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5516:1: ( ( ( rule__ProjectionExpr__Group_1__0 )* ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5517:1: ( ( rule__ProjectionExpr__Group_1__0 )* )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5517:1: ( ( rule__ProjectionExpr__Group_1__0 )* )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5518:1: ( rule__ProjectionExpr__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProjectionExprAccess().getGroup_1()); 
            }
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5519:1: ( rule__ProjectionExpr__Group_1__0 )*
            loop34:
            do {
                int alt34=2;
                int LA34_0 = input.LA(1);

                if ( (LA34_0==52) ) {
                    int LA34_2 = input.LA(2);

                    if ( (synpred52_InternalJKind()) ) {
                        alt34=1;
                    }


                }


                switch (alt34) {
            	case 1 :
            	    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5519:2: rule__ProjectionExpr__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__ProjectionExpr__Group_1__0_in_rule__ProjectionExpr__Group__1__Impl11060);
            	    rule__ProjectionExpr__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop34;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getProjectionExprAccess().getGroup_1()); 
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
    // $ANTLR end "rule__ProjectionExpr__Group__1__Impl"


    // $ANTLR start "rule__ProjectionExpr__Group_1__0"
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5533:1: rule__ProjectionExpr__Group_1__0 : rule__ProjectionExpr__Group_1__0__Impl ;
    public final void rule__ProjectionExpr__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5537:1: ( rule__ProjectionExpr__Group_1__0__Impl )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5538:2: rule__ProjectionExpr__Group_1__0__Impl
            {
            pushFollow(FOLLOW_rule__ProjectionExpr__Group_1__0__Impl_in_rule__ProjectionExpr__Group_1__011095);
            rule__ProjectionExpr__Group_1__0__Impl();

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
    // $ANTLR end "rule__ProjectionExpr__Group_1__0"


    // $ANTLR start "rule__ProjectionExpr__Group_1__0__Impl"
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5544:1: rule__ProjectionExpr__Group_1__0__Impl : ( ( rule__ProjectionExpr__Group_1_0__0 ) ) ;
    public final void rule__ProjectionExpr__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5548:1: ( ( ( rule__ProjectionExpr__Group_1_0__0 ) ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5549:1: ( ( rule__ProjectionExpr__Group_1_0__0 ) )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5549:1: ( ( rule__ProjectionExpr__Group_1_0__0 ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5550:1: ( rule__ProjectionExpr__Group_1_0__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProjectionExprAccess().getGroup_1_0()); 
            }
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5551:1: ( rule__ProjectionExpr__Group_1_0__0 )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5551:2: rule__ProjectionExpr__Group_1_0__0
            {
            pushFollow(FOLLOW_rule__ProjectionExpr__Group_1_0__0_in_rule__ProjectionExpr__Group_1__0__Impl11122);
            rule__ProjectionExpr__Group_1_0__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getProjectionExprAccess().getGroup_1_0()); 
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
    // $ANTLR end "rule__ProjectionExpr__Group_1__0__Impl"


    // $ANTLR start "rule__ProjectionExpr__Group_1_0__0"
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5563:1: rule__ProjectionExpr__Group_1_0__0 : rule__ProjectionExpr__Group_1_0__0__Impl rule__ProjectionExpr__Group_1_0__1 ;
    public final void rule__ProjectionExpr__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5567:1: ( rule__ProjectionExpr__Group_1_0__0__Impl rule__ProjectionExpr__Group_1_0__1 )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5568:2: rule__ProjectionExpr__Group_1_0__0__Impl rule__ProjectionExpr__Group_1_0__1
            {
            pushFollow(FOLLOW_rule__ProjectionExpr__Group_1_0__0__Impl_in_rule__ProjectionExpr__Group_1_0__011154);
            rule__ProjectionExpr__Group_1_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ProjectionExpr__Group_1_0__1_in_rule__ProjectionExpr__Group_1_0__011157);
            rule__ProjectionExpr__Group_1_0__1();

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
    // $ANTLR end "rule__ProjectionExpr__Group_1_0__0"


    // $ANTLR start "rule__ProjectionExpr__Group_1_0__0__Impl"
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5575:1: rule__ProjectionExpr__Group_1_0__0__Impl : ( () ) ;
    public final void rule__ProjectionExpr__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5579:1: ( ( () ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5580:1: ( () )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5580:1: ( () )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5581:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProjectionExprAccess().getProjectExprExprAction_1_0_0()); 
            }
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5582:1: ()
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5584:1: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getProjectionExprAccess().getProjectExprExprAction_1_0_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProjectionExpr__Group_1_0__0__Impl"


    // $ANTLR start "rule__ProjectionExpr__Group_1_0__1"
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5594:1: rule__ProjectionExpr__Group_1_0__1 : rule__ProjectionExpr__Group_1_0__1__Impl rule__ProjectionExpr__Group_1_0__2 ;
    public final void rule__ProjectionExpr__Group_1_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5598:1: ( rule__ProjectionExpr__Group_1_0__1__Impl rule__ProjectionExpr__Group_1_0__2 )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5599:2: rule__ProjectionExpr__Group_1_0__1__Impl rule__ProjectionExpr__Group_1_0__2
            {
            pushFollow(FOLLOW_rule__ProjectionExpr__Group_1_0__1__Impl_in_rule__ProjectionExpr__Group_1_0__111215);
            rule__ProjectionExpr__Group_1_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ProjectionExpr__Group_1_0__2_in_rule__ProjectionExpr__Group_1_0__111218);
            rule__ProjectionExpr__Group_1_0__2();

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
    // $ANTLR end "rule__ProjectionExpr__Group_1_0__1"


    // $ANTLR start "rule__ProjectionExpr__Group_1_0__1__Impl"
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5606:1: rule__ProjectionExpr__Group_1_0__1__Impl : ( '.' ) ;
    public final void rule__ProjectionExpr__Group_1_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5610:1: ( ( '.' ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5611:1: ( '.' )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5611:1: ( '.' )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5612:1: '.'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProjectionExprAccess().getFullStopKeyword_1_0_1()); 
            }
            match(input,52,FOLLOW_52_in_rule__ProjectionExpr__Group_1_0__1__Impl11246); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getProjectionExprAccess().getFullStopKeyword_1_0_1()); 
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
    // $ANTLR end "rule__ProjectionExpr__Group_1_0__1__Impl"


    // $ANTLR start "rule__ProjectionExpr__Group_1_0__2"
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5625:1: rule__ProjectionExpr__Group_1_0__2 : rule__ProjectionExpr__Group_1_0__2__Impl ;
    public final void rule__ProjectionExpr__Group_1_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5629:1: ( rule__ProjectionExpr__Group_1_0__2__Impl )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5630:2: rule__ProjectionExpr__Group_1_0__2__Impl
            {
            pushFollow(FOLLOW_rule__ProjectionExpr__Group_1_0__2__Impl_in_rule__ProjectionExpr__Group_1_0__211277);
            rule__ProjectionExpr__Group_1_0__2__Impl();

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
    // $ANTLR end "rule__ProjectionExpr__Group_1_0__2"


    // $ANTLR start "rule__ProjectionExpr__Group_1_0__2__Impl"
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5636:1: rule__ProjectionExpr__Group_1_0__2__Impl : ( ( rule__ProjectionExpr__FieldAssignment_1_0_2 ) ) ;
    public final void rule__ProjectionExpr__Group_1_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5640:1: ( ( ( rule__ProjectionExpr__FieldAssignment_1_0_2 ) ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5641:1: ( ( rule__ProjectionExpr__FieldAssignment_1_0_2 ) )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5641:1: ( ( rule__ProjectionExpr__FieldAssignment_1_0_2 ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5642:1: ( rule__ProjectionExpr__FieldAssignment_1_0_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProjectionExprAccess().getFieldAssignment_1_0_2()); 
            }
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5643:1: ( rule__ProjectionExpr__FieldAssignment_1_0_2 )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5643:2: rule__ProjectionExpr__FieldAssignment_1_0_2
            {
            pushFollow(FOLLOW_rule__ProjectionExpr__FieldAssignment_1_0_2_in_rule__ProjectionExpr__Group_1_0__2__Impl11304);
            rule__ProjectionExpr__FieldAssignment_1_0_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getProjectionExprAccess().getFieldAssignment_1_0_2()); 
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
    // $ANTLR end "rule__ProjectionExpr__Group_1_0__2__Impl"


    // $ANTLR start "rule__AtomicExpr__Group_0__0"
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5659:1: rule__AtomicExpr__Group_0__0 : rule__AtomicExpr__Group_0__0__Impl rule__AtomicExpr__Group_0__1 ;
    public final void rule__AtomicExpr__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5663:1: ( rule__AtomicExpr__Group_0__0__Impl rule__AtomicExpr__Group_0__1 )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5664:2: rule__AtomicExpr__Group_0__0__Impl rule__AtomicExpr__Group_0__1
            {
            pushFollow(FOLLOW_rule__AtomicExpr__Group_0__0__Impl_in_rule__AtomicExpr__Group_0__011340);
            rule__AtomicExpr__Group_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__AtomicExpr__Group_0__1_in_rule__AtomicExpr__Group_0__011343);
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5671:1: rule__AtomicExpr__Group_0__0__Impl : ( () ) ;
    public final void rule__AtomicExpr__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5675:1: ( ( () ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5676:1: ( () )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5676:1: ( () )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5677:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAtomicExprAccess().getIdExprAction_0_0()); 
            }
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5678:1: ()
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5680:1: 
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5690:1: rule__AtomicExpr__Group_0__1 : rule__AtomicExpr__Group_0__1__Impl ;
    public final void rule__AtomicExpr__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5694:1: ( rule__AtomicExpr__Group_0__1__Impl )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5695:2: rule__AtomicExpr__Group_0__1__Impl
            {
            pushFollow(FOLLOW_rule__AtomicExpr__Group_0__1__Impl_in_rule__AtomicExpr__Group_0__111401);
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5701:1: rule__AtomicExpr__Group_0__1__Impl : ( ( rule__AtomicExpr__IdAssignment_0_1 ) ) ;
    public final void rule__AtomicExpr__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5705:1: ( ( ( rule__AtomicExpr__IdAssignment_0_1 ) ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5706:1: ( ( rule__AtomicExpr__IdAssignment_0_1 ) )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5706:1: ( ( rule__AtomicExpr__IdAssignment_0_1 ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5707:1: ( rule__AtomicExpr__IdAssignment_0_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAtomicExprAccess().getIdAssignment_0_1()); 
            }
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5708:1: ( rule__AtomicExpr__IdAssignment_0_1 )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5708:2: rule__AtomicExpr__IdAssignment_0_1
            {
            pushFollow(FOLLOW_rule__AtomicExpr__IdAssignment_0_1_in_rule__AtomicExpr__Group_0__1__Impl11428);
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5722:1: rule__AtomicExpr__Group_1__0 : rule__AtomicExpr__Group_1__0__Impl rule__AtomicExpr__Group_1__1 ;
    public final void rule__AtomicExpr__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5726:1: ( rule__AtomicExpr__Group_1__0__Impl rule__AtomicExpr__Group_1__1 )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5727:2: rule__AtomicExpr__Group_1__0__Impl rule__AtomicExpr__Group_1__1
            {
            pushFollow(FOLLOW_rule__AtomicExpr__Group_1__0__Impl_in_rule__AtomicExpr__Group_1__011462);
            rule__AtomicExpr__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__AtomicExpr__Group_1__1_in_rule__AtomicExpr__Group_1__011465);
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5734:1: rule__AtomicExpr__Group_1__0__Impl : ( () ) ;
    public final void rule__AtomicExpr__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5738:1: ( ( () ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5739:1: ( () )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5739:1: ( () )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5740:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAtomicExprAccess().getIntExprAction_1_0()); 
            }
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5741:1: ()
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5743:1: 
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5753:1: rule__AtomicExpr__Group_1__1 : rule__AtomicExpr__Group_1__1__Impl ;
    public final void rule__AtomicExpr__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5757:1: ( rule__AtomicExpr__Group_1__1__Impl )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5758:2: rule__AtomicExpr__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__AtomicExpr__Group_1__1__Impl_in_rule__AtomicExpr__Group_1__111523);
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5764:1: rule__AtomicExpr__Group_1__1__Impl : ( ( rule__AtomicExpr__ValAssignment_1_1 ) ) ;
    public final void rule__AtomicExpr__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5768:1: ( ( ( rule__AtomicExpr__ValAssignment_1_1 ) ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5769:1: ( ( rule__AtomicExpr__ValAssignment_1_1 ) )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5769:1: ( ( rule__AtomicExpr__ValAssignment_1_1 ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5770:1: ( rule__AtomicExpr__ValAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAtomicExprAccess().getValAssignment_1_1()); 
            }
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5771:1: ( rule__AtomicExpr__ValAssignment_1_1 )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5771:2: rule__AtomicExpr__ValAssignment_1_1
            {
            pushFollow(FOLLOW_rule__AtomicExpr__ValAssignment_1_1_in_rule__AtomicExpr__Group_1__1__Impl11550);
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5785:1: rule__AtomicExpr__Group_2__0 : rule__AtomicExpr__Group_2__0__Impl rule__AtomicExpr__Group_2__1 ;
    public final void rule__AtomicExpr__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5789:1: ( rule__AtomicExpr__Group_2__0__Impl rule__AtomicExpr__Group_2__1 )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5790:2: rule__AtomicExpr__Group_2__0__Impl rule__AtomicExpr__Group_2__1
            {
            pushFollow(FOLLOW_rule__AtomicExpr__Group_2__0__Impl_in_rule__AtomicExpr__Group_2__011584);
            rule__AtomicExpr__Group_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__AtomicExpr__Group_2__1_in_rule__AtomicExpr__Group_2__011587);
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5797:1: rule__AtomicExpr__Group_2__0__Impl : ( () ) ;
    public final void rule__AtomicExpr__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5801:1: ( ( () ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5802:1: ( () )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5802:1: ( () )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5803:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAtomicExprAccess().getRealExprAction_2_0()); 
            }
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5804:1: ()
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5806:1: 
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5816:1: rule__AtomicExpr__Group_2__1 : rule__AtomicExpr__Group_2__1__Impl ;
    public final void rule__AtomicExpr__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5820:1: ( rule__AtomicExpr__Group_2__1__Impl )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5821:2: rule__AtomicExpr__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__AtomicExpr__Group_2__1__Impl_in_rule__AtomicExpr__Group_2__111645);
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5827:1: rule__AtomicExpr__Group_2__1__Impl : ( ( rule__AtomicExpr__ValAssignment_2_1 ) ) ;
    public final void rule__AtomicExpr__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5831:1: ( ( ( rule__AtomicExpr__ValAssignment_2_1 ) ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5832:1: ( ( rule__AtomicExpr__ValAssignment_2_1 ) )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5832:1: ( ( rule__AtomicExpr__ValAssignment_2_1 ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5833:1: ( rule__AtomicExpr__ValAssignment_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAtomicExprAccess().getValAssignment_2_1()); 
            }
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5834:1: ( rule__AtomicExpr__ValAssignment_2_1 )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5834:2: rule__AtomicExpr__ValAssignment_2_1
            {
            pushFollow(FOLLOW_rule__AtomicExpr__ValAssignment_2_1_in_rule__AtomicExpr__Group_2__1__Impl11672);
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5848:1: rule__AtomicExpr__Group_3__0 : rule__AtomicExpr__Group_3__0__Impl rule__AtomicExpr__Group_3__1 ;
    public final void rule__AtomicExpr__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5852:1: ( rule__AtomicExpr__Group_3__0__Impl rule__AtomicExpr__Group_3__1 )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5853:2: rule__AtomicExpr__Group_3__0__Impl rule__AtomicExpr__Group_3__1
            {
            pushFollow(FOLLOW_rule__AtomicExpr__Group_3__0__Impl_in_rule__AtomicExpr__Group_3__011706);
            rule__AtomicExpr__Group_3__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__AtomicExpr__Group_3__1_in_rule__AtomicExpr__Group_3__011709);
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5860:1: rule__AtomicExpr__Group_3__0__Impl : ( () ) ;
    public final void rule__AtomicExpr__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5864:1: ( ( () ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5865:1: ( () )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5865:1: ( () )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5866:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAtomicExprAccess().getBoolExprAction_3_0()); 
            }
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5867:1: ()
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5869:1: 
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5879:1: rule__AtomicExpr__Group_3__1 : rule__AtomicExpr__Group_3__1__Impl ;
    public final void rule__AtomicExpr__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5883:1: ( rule__AtomicExpr__Group_3__1__Impl )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5884:2: rule__AtomicExpr__Group_3__1__Impl
            {
            pushFollow(FOLLOW_rule__AtomicExpr__Group_3__1__Impl_in_rule__AtomicExpr__Group_3__111767);
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5890:1: rule__AtomicExpr__Group_3__1__Impl : ( ( rule__AtomicExpr__ValAssignment_3_1 ) ) ;
    public final void rule__AtomicExpr__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5894:1: ( ( ( rule__AtomicExpr__ValAssignment_3_1 ) ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5895:1: ( ( rule__AtomicExpr__ValAssignment_3_1 ) )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5895:1: ( ( rule__AtomicExpr__ValAssignment_3_1 ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5896:1: ( rule__AtomicExpr__ValAssignment_3_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAtomicExprAccess().getValAssignment_3_1()); 
            }
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5897:1: ( rule__AtomicExpr__ValAssignment_3_1 )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5897:2: rule__AtomicExpr__ValAssignment_3_1
            {
            pushFollow(FOLLOW_rule__AtomicExpr__ValAssignment_3_1_in_rule__AtomicExpr__Group_3__1__Impl11794);
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5911:1: rule__AtomicExpr__Group_4__0 : rule__AtomicExpr__Group_4__0__Impl rule__AtomicExpr__Group_4__1 ;
    public final void rule__AtomicExpr__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5915:1: ( rule__AtomicExpr__Group_4__0__Impl rule__AtomicExpr__Group_4__1 )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5916:2: rule__AtomicExpr__Group_4__0__Impl rule__AtomicExpr__Group_4__1
            {
            pushFollow(FOLLOW_rule__AtomicExpr__Group_4__0__Impl_in_rule__AtomicExpr__Group_4__011828);
            rule__AtomicExpr__Group_4__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__AtomicExpr__Group_4__1_in_rule__AtomicExpr__Group_4__011831);
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5923:1: rule__AtomicExpr__Group_4__0__Impl : ( () ) ;
    public final void rule__AtomicExpr__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5927:1: ( ( () ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5928:1: ( () )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5928:1: ( () )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5929:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAtomicExprAccess().getIfThenElseExprAction_4_0()); 
            }
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5930:1: ()
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5932:1: 
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5942:1: rule__AtomicExpr__Group_4__1 : rule__AtomicExpr__Group_4__1__Impl rule__AtomicExpr__Group_4__2 ;
    public final void rule__AtomicExpr__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5946:1: ( rule__AtomicExpr__Group_4__1__Impl rule__AtomicExpr__Group_4__2 )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5947:2: rule__AtomicExpr__Group_4__1__Impl rule__AtomicExpr__Group_4__2
            {
            pushFollow(FOLLOW_rule__AtomicExpr__Group_4__1__Impl_in_rule__AtomicExpr__Group_4__111889);
            rule__AtomicExpr__Group_4__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__AtomicExpr__Group_4__2_in_rule__AtomicExpr__Group_4__111892);
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5954:1: rule__AtomicExpr__Group_4__1__Impl : ( 'if' ) ;
    public final void rule__AtomicExpr__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5958:1: ( ( 'if' ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5959:1: ( 'if' )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5959:1: ( 'if' )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5960:1: 'if'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAtomicExprAccess().getIfKeyword_4_1()); 
            }
            match(input,53,FOLLOW_53_in_rule__AtomicExpr__Group_4__1__Impl11920); if (state.failed) return ;
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5973:1: rule__AtomicExpr__Group_4__2 : rule__AtomicExpr__Group_4__2__Impl rule__AtomicExpr__Group_4__3 ;
    public final void rule__AtomicExpr__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5977:1: ( rule__AtomicExpr__Group_4__2__Impl rule__AtomicExpr__Group_4__3 )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5978:2: rule__AtomicExpr__Group_4__2__Impl rule__AtomicExpr__Group_4__3
            {
            pushFollow(FOLLOW_rule__AtomicExpr__Group_4__2__Impl_in_rule__AtomicExpr__Group_4__211951);
            rule__AtomicExpr__Group_4__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__AtomicExpr__Group_4__3_in_rule__AtomicExpr__Group_4__211954);
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5985:1: rule__AtomicExpr__Group_4__2__Impl : ( ( rule__AtomicExpr__CondAssignment_4_2 ) ) ;
    public final void rule__AtomicExpr__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5989:1: ( ( ( rule__AtomicExpr__CondAssignment_4_2 ) ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5990:1: ( ( rule__AtomicExpr__CondAssignment_4_2 ) )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5990:1: ( ( rule__AtomicExpr__CondAssignment_4_2 ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5991:1: ( rule__AtomicExpr__CondAssignment_4_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAtomicExprAccess().getCondAssignment_4_2()); 
            }
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5992:1: ( rule__AtomicExpr__CondAssignment_4_2 )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5992:2: rule__AtomicExpr__CondAssignment_4_2
            {
            pushFollow(FOLLOW_rule__AtomicExpr__CondAssignment_4_2_in_rule__AtomicExpr__Group_4__2__Impl11981);
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6002:1: rule__AtomicExpr__Group_4__3 : rule__AtomicExpr__Group_4__3__Impl rule__AtomicExpr__Group_4__4 ;
    public final void rule__AtomicExpr__Group_4__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6006:1: ( rule__AtomicExpr__Group_4__3__Impl rule__AtomicExpr__Group_4__4 )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6007:2: rule__AtomicExpr__Group_4__3__Impl rule__AtomicExpr__Group_4__4
            {
            pushFollow(FOLLOW_rule__AtomicExpr__Group_4__3__Impl_in_rule__AtomicExpr__Group_4__312011);
            rule__AtomicExpr__Group_4__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__AtomicExpr__Group_4__4_in_rule__AtomicExpr__Group_4__312014);
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6014:1: rule__AtomicExpr__Group_4__3__Impl : ( 'then' ) ;
    public final void rule__AtomicExpr__Group_4__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6018:1: ( ( 'then' ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6019:1: ( 'then' )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6019:1: ( 'then' )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6020:1: 'then'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAtomicExprAccess().getThenKeyword_4_3()); 
            }
            match(input,54,FOLLOW_54_in_rule__AtomicExpr__Group_4__3__Impl12042); if (state.failed) return ;
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6033:1: rule__AtomicExpr__Group_4__4 : rule__AtomicExpr__Group_4__4__Impl rule__AtomicExpr__Group_4__5 ;
    public final void rule__AtomicExpr__Group_4__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6037:1: ( rule__AtomicExpr__Group_4__4__Impl rule__AtomicExpr__Group_4__5 )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6038:2: rule__AtomicExpr__Group_4__4__Impl rule__AtomicExpr__Group_4__5
            {
            pushFollow(FOLLOW_rule__AtomicExpr__Group_4__4__Impl_in_rule__AtomicExpr__Group_4__412073);
            rule__AtomicExpr__Group_4__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__AtomicExpr__Group_4__5_in_rule__AtomicExpr__Group_4__412076);
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6045:1: rule__AtomicExpr__Group_4__4__Impl : ( ( rule__AtomicExpr__ThenAssignment_4_4 ) ) ;
    public final void rule__AtomicExpr__Group_4__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6049:1: ( ( ( rule__AtomicExpr__ThenAssignment_4_4 ) ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6050:1: ( ( rule__AtomicExpr__ThenAssignment_4_4 ) )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6050:1: ( ( rule__AtomicExpr__ThenAssignment_4_4 ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6051:1: ( rule__AtomicExpr__ThenAssignment_4_4 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAtomicExprAccess().getThenAssignment_4_4()); 
            }
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6052:1: ( rule__AtomicExpr__ThenAssignment_4_4 )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6052:2: rule__AtomicExpr__ThenAssignment_4_4
            {
            pushFollow(FOLLOW_rule__AtomicExpr__ThenAssignment_4_4_in_rule__AtomicExpr__Group_4__4__Impl12103);
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6062:1: rule__AtomicExpr__Group_4__5 : rule__AtomicExpr__Group_4__5__Impl rule__AtomicExpr__Group_4__6 ;
    public final void rule__AtomicExpr__Group_4__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6066:1: ( rule__AtomicExpr__Group_4__5__Impl rule__AtomicExpr__Group_4__6 )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6067:2: rule__AtomicExpr__Group_4__5__Impl rule__AtomicExpr__Group_4__6
            {
            pushFollow(FOLLOW_rule__AtomicExpr__Group_4__5__Impl_in_rule__AtomicExpr__Group_4__512133);
            rule__AtomicExpr__Group_4__5__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__AtomicExpr__Group_4__6_in_rule__AtomicExpr__Group_4__512136);
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6074:1: rule__AtomicExpr__Group_4__5__Impl : ( 'else' ) ;
    public final void rule__AtomicExpr__Group_4__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6078:1: ( ( 'else' ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6079:1: ( 'else' )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6079:1: ( 'else' )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6080:1: 'else'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAtomicExprAccess().getElseKeyword_4_5()); 
            }
            match(input,55,FOLLOW_55_in_rule__AtomicExpr__Group_4__5__Impl12164); if (state.failed) return ;
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6093:1: rule__AtomicExpr__Group_4__6 : rule__AtomicExpr__Group_4__6__Impl ;
    public final void rule__AtomicExpr__Group_4__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6097:1: ( rule__AtomicExpr__Group_4__6__Impl )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6098:2: rule__AtomicExpr__Group_4__6__Impl
            {
            pushFollow(FOLLOW_rule__AtomicExpr__Group_4__6__Impl_in_rule__AtomicExpr__Group_4__612195);
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6104:1: rule__AtomicExpr__Group_4__6__Impl : ( ( rule__AtomicExpr__ElseAssignment_4_6 ) ) ;
    public final void rule__AtomicExpr__Group_4__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6108:1: ( ( ( rule__AtomicExpr__ElseAssignment_4_6 ) ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6109:1: ( ( rule__AtomicExpr__ElseAssignment_4_6 ) )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6109:1: ( ( rule__AtomicExpr__ElseAssignment_4_6 ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6110:1: ( rule__AtomicExpr__ElseAssignment_4_6 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAtomicExprAccess().getElseAssignment_4_6()); 
            }
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6111:1: ( rule__AtomicExpr__ElseAssignment_4_6 )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6111:2: rule__AtomicExpr__ElseAssignment_4_6
            {
            pushFollow(FOLLOW_rule__AtomicExpr__ElseAssignment_4_6_in_rule__AtomicExpr__Group_4__6__Impl12222);
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6135:1: rule__AtomicExpr__Group_5__0 : rule__AtomicExpr__Group_5__0__Impl rule__AtomicExpr__Group_5__1 ;
    public final void rule__AtomicExpr__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6139:1: ( rule__AtomicExpr__Group_5__0__Impl rule__AtomicExpr__Group_5__1 )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6140:2: rule__AtomicExpr__Group_5__0__Impl rule__AtomicExpr__Group_5__1
            {
            pushFollow(FOLLOW_rule__AtomicExpr__Group_5__0__Impl_in_rule__AtomicExpr__Group_5__012266);
            rule__AtomicExpr__Group_5__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__AtomicExpr__Group_5__1_in_rule__AtomicExpr__Group_5__012269);
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6147:1: rule__AtomicExpr__Group_5__0__Impl : ( () ) ;
    public final void rule__AtomicExpr__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6151:1: ( ( () ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6152:1: ( () )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6152:1: ( () )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6153:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAtomicExprAccess().getNodeCallExprAction_5_0()); 
            }
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6154:1: ()
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6156:1: 
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6166:1: rule__AtomicExpr__Group_5__1 : rule__AtomicExpr__Group_5__1__Impl rule__AtomicExpr__Group_5__2 ;
    public final void rule__AtomicExpr__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6170:1: ( rule__AtomicExpr__Group_5__1__Impl rule__AtomicExpr__Group_5__2 )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6171:2: rule__AtomicExpr__Group_5__1__Impl rule__AtomicExpr__Group_5__2
            {
            pushFollow(FOLLOW_rule__AtomicExpr__Group_5__1__Impl_in_rule__AtomicExpr__Group_5__112327);
            rule__AtomicExpr__Group_5__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__AtomicExpr__Group_5__2_in_rule__AtomicExpr__Group_5__112330);
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6178:1: rule__AtomicExpr__Group_5__1__Impl : ( ( rule__AtomicExpr__NodeAssignment_5_1 ) ) ;
    public final void rule__AtomicExpr__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6182:1: ( ( ( rule__AtomicExpr__NodeAssignment_5_1 ) ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6183:1: ( ( rule__AtomicExpr__NodeAssignment_5_1 ) )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6183:1: ( ( rule__AtomicExpr__NodeAssignment_5_1 ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6184:1: ( rule__AtomicExpr__NodeAssignment_5_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAtomicExprAccess().getNodeAssignment_5_1()); 
            }
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6185:1: ( rule__AtomicExpr__NodeAssignment_5_1 )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6185:2: rule__AtomicExpr__NodeAssignment_5_1
            {
            pushFollow(FOLLOW_rule__AtomicExpr__NodeAssignment_5_1_in_rule__AtomicExpr__Group_5__1__Impl12357);
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6195:1: rule__AtomicExpr__Group_5__2 : rule__AtomicExpr__Group_5__2__Impl rule__AtomicExpr__Group_5__3 ;
    public final void rule__AtomicExpr__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6199:1: ( rule__AtomicExpr__Group_5__2__Impl rule__AtomicExpr__Group_5__3 )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6200:2: rule__AtomicExpr__Group_5__2__Impl rule__AtomicExpr__Group_5__3
            {
            pushFollow(FOLLOW_rule__AtomicExpr__Group_5__2__Impl_in_rule__AtomicExpr__Group_5__212387);
            rule__AtomicExpr__Group_5__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__AtomicExpr__Group_5__3_in_rule__AtomicExpr__Group_5__212390);
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6207:1: rule__AtomicExpr__Group_5__2__Impl : ( '(' ) ;
    public final void rule__AtomicExpr__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6211:1: ( ( '(' ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6212:1: ( '(' )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6212:1: ( '(' )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6213:1: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAtomicExprAccess().getLeftParenthesisKeyword_5_2()); 
            }
            match(input,43,FOLLOW_43_in_rule__AtomicExpr__Group_5__2__Impl12418); if (state.failed) return ;
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6226:1: rule__AtomicExpr__Group_5__3 : rule__AtomicExpr__Group_5__3__Impl rule__AtomicExpr__Group_5__4 ;
    public final void rule__AtomicExpr__Group_5__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6230:1: ( rule__AtomicExpr__Group_5__3__Impl rule__AtomicExpr__Group_5__4 )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6231:2: rule__AtomicExpr__Group_5__3__Impl rule__AtomicExpr__Group_5__4
            {
            pushFollow(FOLLOW_rule__AtomicExpr__Group_5__3__Impl_in_rule__AtomicExpr__Group_5__312449);
            rule__AtomicExpr__Group_5__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__AtomicExpr__Group_5__4_in_rule__AtomicExpr__Group_5__312452);
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6238:1: rule__AtomicExpr__Group_5__3__Impl : ( ( rule__AtomicExpr__Group_5_3__0 )? ) ;
    public final void rule__AtomicExpr__Group_5__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6242:1: ( ( ( rule__AtomicExpr__Group_5_3__0 )? ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6243:1: ( ( rule__AtomicExpr__Group_5_3__0 )? )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6243:1: ( ( rule__AtomicExpr__Group_5_3__0 )? )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6244:1: ( rule__AtomicExpr__Group_5_3__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAtomicExprAccess().getGroup_5_3()); 
            }
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6245:1: ( rule__AtomicExpr__Group_5_3__0 )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( ((LA35_0>=RULE_INT && LA35_0<=RULE_BOOL)||LA35_0==21||(LA35_0>=25 && LA35_0<=26)||LA35_0==43||LA35_0==53) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6245:2: rule__AtomicExpr__Group_5_3__0
                    {
                    pushFollow(FOLLOW_rule__AtomicExpr__Group_5_3__0_in_rule__AtomicExpr__Group_5__3__Impl12479);
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6255:1: rule__AtomicExpr__Group_5__4 : rule__AtomicExpr__Group_5__4__Impl ;
    public final void rule__AtomicExpr__Group_5__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6259:1: ( rule__AtomicExpr__Group_5__4__Impl )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6260:2: rule__AtomicExpr__Group_5__4__Impl
            {
            pushFollow(FOLLOW_rule__AtomicExpr__Group_5__4__Impl_in_rule__AtomicExpr__Group_5__412510);
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6266:1: rule__AtomicExpr__Group_5__4__Impl : ( ')' ) ;
    public final void rule__AtomicExpr__Group_5__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6270:1: ( ( ')' ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6271:1: ( ')' )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6271:1: ( ')' )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6272:1: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAtomicExprAccess().getRightParenthesisKeyword_5_4()); 
            }
            match(input,44,FOLLOW_44_in_rule__AtomicExpr__Group_5__4__Impl12538); if (state.failed) return ;
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6295:1: rule__AtomicExpr__Group_5_3__0 : rule__AtomicExpr__Group_5_3__0__Impl rule__AtomicExpr__Group_5_3__1 ;
    public final void rule__AtomicExpr__Group_5_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6299:1: ( rule__AtomicExpr__Group_5_3__0__Impl rule__AtomicExpr__Group_5_3__1 )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6300:2: rule__AtomicExpr__Group_5_3__0__Impl rule__AtomicExpr__Group_5_3__1
            {
            pushFollow(FOLLOW_rule__AtomicExpr__Group_5_3__0__Impl_in_rule__AtomicExpr__Group_5_3__012579);
            rule__AtomicExpr__Group_5_3__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__AtomicExpr__Group_5_3__1_in_rule__AtomicExpr__Group_5_3__012582);
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6307:1: rule__AtomicExpr__Group_5_3__0__Impl : ( ( rule__AtomicExpr__ArgsAssignment_5_3_0 ) ) ;
    public final void rule__AtomicExpr__Group_5_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6311:1: ( ( ( rule__AtomicExpr__ArgsAssignment_5_3_0 ) ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6312:1: ( ( rule__AtomicExpr__ArgsAssignment_5_3_0 ) )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6312:1: ( ( rule__AtomicExpr__ArgsAssignment_5_3_0 ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6313:1: ( rule__AtomicExpr__ArgsAssignment_5_3_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAtomicExprAccess().getArgsAssignment_5_3_0()); 
            }
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6314:1: ( rule__AtomicExpr__ArgsAssignment_5_3_0 )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6314:2: rule__AtomicExpr__ArgsAssignment_5_3_0
            {
            pushFollow(FOLLOW_rule__AtomicExpr__ArgsAssignment_5_3_0_in_rule__AtomicExpr__Group_5_3__0__Impl12609);
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6324:1: rule__AtomicExpr__Group_5_3__1 : rule__AtomicExpr__Group_5_3__1__Impl ;
    public final void rule__AtomicExpr__Group_5_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6328:1: ( rule__AtomicExpr__Group_5_3__1__Impl )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6329:2: rule__AtomicExpr__Group_5_3__1__Impl
            {
            pushFollow(FOLLOW_rule__AtomicExpr__Group_5_3__1__Impl_in_rule__AtomicExpr__Group_5_3__112639);
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6335:1: rule__AtomicExpr__Group_5_3__1__Impl : ( ( rule__AtomicExpr__Group_5_3_1__0 )* ) ;
    public final void rule__AtomicExpr__Group_5_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6339:1: ( ( ( rule__AtomicExpr__Group_5_3_1__0 )* ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6340:1: ( ( rule__AtomicExpr__Group_5_3_1__0 )* )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6340:1: ( ( rule__AtomicExpr__Group_5_3_1__0 )* )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6341:1: ( rule__AtomicExpr__Group_5_3_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAtomicExprAccess().getGroup_5_3_1()); 
            }
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6342:1: ( rule__AtomicExpr__Group_5_3_1__0 )*
            loop36:
            do {
                int alt36=2;
                int LA36_0 = input.LA(1);

                if ( (LA36_0==38) ) {
                    alt36=1;
                }


                switch (alt36) {
            	case 1 :
            	    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6342:2: rule__AtomicExpr__Group_5_3_1__0
            	    {
            	    pushFollow(FOLLOW_rule__AtomicExpr__Group_5_3_1__0_in_rule__AtomicExpr__Group_5_3__1__Impl12666);
            	    rule__AtomicExpr__Group_5_3_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop36;
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6356:1: rule__AtomicExpr__Group_5_3_1__0 : rule__AtomicExpr__Group_5_3_1__0__Impl rule__AtomicExpr__Group_5_3_1__1 ;
    public final void rule__AtomicExpr__Group_5_3_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6360:1: ( rule__AtomicExpr__Group_5_3_1__0__Impl rule__AtomicExpr__Group_5_3_1__1 )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6361:2: rule__AtomicExpr__Group_5_3_1__0__Impl rule__AtomicExpr__Group_5_3_1__1
            {
            pushFollow(FOLLOW_rule__AtomicExpr__Group_5_3_1__0__Impl_in_rule__AtomicExpr__Group_5_3_1__012701);
            rule__AtomicExpr__Group_5_3_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__AtomicExpr__Group_5_3_1__1_in_rule__AtomicExpr__Group_5_3_1__012704);
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6368:1: rule__AtomicExpr__Group_5_3_1__0__Impl : ( ',' ) ;
    public final void rule__AtomicExpr__Group_5_3_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6372:1: ( ( ',' ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6373:1: ( ',' )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6373:1: ( ',' )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6374:1: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAtomicExprAccess().getCommaKeyword_5_3_1_0()); 
            }
            match(input,38,FOLLOW_38_in_rule__AtomicExpr__Group_5_3_1__0__Impl12732); if (state.failed) return ;
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6387:1: rule__AtomicExpr__Group_5_3_1__1 : rule__AtomicExpr__Group_5_3_1__1__Impl ;
    public final void rule__AtomicExpr__Group_5_3_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6391:1: ( rule__AtomicExpr__Group_5_3_1__1__Impl )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6392:2: rule__AtomicExpr__Group_5_3_1__1__Impl
            {
            pushFollow(FOLLOW_rule__AtomicExpr__Group_5_3_1__1__Impl_in_rule__AtomicExpr__Group_5_3_1__112763);
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6398:1: rule__AtomicExpr__Group_5_3_1__1__Impl : ( ( rule__AtomicExpr__ArgsAssignment_5_3_1_1 ) ) ;
    public final void rule__AtomicExpr__Group_5_3_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6402:1: ( ( ( rule__AtomicExpr__ArgsAssignment_5_3_1_1 ) ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6403:1: ( ( rule__AtomicExpr__ArgsAssignment_5_3_1_1 ) )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6403:1: ( ( rule__AtomicExpr__ArgsAssignment_5_3_1_1 ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6404:1: ( rule__AtomicExpr__ArgsAssignment_5_3_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAtomicExprAccess().getArgsAssignment_5_3_1_1()); 
            }
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6405:1: ( rule__AtomicExpr__ArgsAssignment_5_3_1_1 )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6405:2: rule__AtomicExpr__ArgsAssignment_5_3_1_1
            {
            pushFollow(FOLLOW_rule__AtomicExpr__ArgsAssignment_5_3_1_1_in_rule__AtomicExpr__Group_5_3_1__1__Impl12790);
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6419:1: rule__AtomicExpr__Group_6__0 : rule__AtomicExpr__Group_6__0__Impl rule__AtomicExpr__Group_6__1 ;
    public final void rule__AtomicExpr__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6423:1: ( rule__AtomicExpr__Group_6__0__Impl rule__AtomicExpr__Group_6__1 )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6424:2: rule__AtomicExpr__Group_6__0__Impl rule__AtomicExpr__Group_6__1
            {
            pushFollow(FOLLOW_rule__AtomicExpr__Group_6__0__Impl_in_rule__AtomicExpr__Group_6__012824);
            rule__AtomicExpr__Group_6__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__AtomicExpr__Group_6__1_in_rule__AtomicExpr__Group_6__012827);
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6431:1: rule__AtomicExpr__Group_6__0__Impl : ( () ) ;
    public final void rule__AtomicExpr__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6435:1: ( ( () ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6436:1: ( () )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6436:1: ( () )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6437:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAtomicExprAccess().getRecordExprAction_6_0()); 
            }
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6438:1: ()
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6440:1: 
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6450:1: rule__AtomicExpr__Group_6__1 : rule__AtomicExpr__Group_6__1__Impl rule__AtomicExpr__Group_6__2 ;
    public final void rule__AtomicExpr__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6454:1: ( rule__AtomicExpr__Group_6__1__Impl rule__AtomicExpr__Group_6__2 )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6455:2: rule__AtomicExpr__Group_6__1__Impl rule__AtomicExpr__Group_6__2
            {
            pushFollow(FOLLOW_rule__AtomicExpr__Group_6__1__Impl_in_rule__AtomicExpr__Group_6__112885);
            rule__AtomicExpr__Group_6__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__AtomicExpr__Group_6__2_in_rule__AtomicExpr__Group_6__112888);
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6462:1: rule__AtomicExpr__Group_6__1__Impl : ( ( rule__AtomicExpr__IdAssignment_6_1 ) ) ;
    public final void rule__AtomicExpr__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6466:1: ( ( ( rule__AtomicExpr__IdAssignment_6_1 ) ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6467:1: ( ( rule__AtomicExpr__IdAssignment_6_1 ) )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6467:1: ( ( rule__AtomicExpr__IdAssignment_6_1 ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6468:1: ( rule__AtomicExpr__IdAssignment_6_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAtomicExprAccess().getIdAssignment_6_1()); 
            }
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6469:1: ( rule__AtomicExpr__IdAssignment_6_1 )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6469:2: rule__AtomicExpr__IdAssignment_6_1
            {
            pushFollow(FOLLOW_rule__AtomicExpr__IdAssignment_6_1_in_rule__AtomicExpr__Group_6__1__Impl12915);
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6479:1: rule__AtomicExpr__Group_6__2 : rule__AtomicExpr__Group_6__2__Impl rule__AtomicExpr__Group_6__3 ;
    public final void rule__AtomicExpr__Group_6__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6483:1: ( rule__AtomicExpr__Group_6__2__Impl rule__AtomicExpr__Group_6__3 )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6484:2: rule__AtomicExpr__Group_6__2__Impl rule__AtomicExpr__Group_6__3
            {
            pushFollow(FOLLOW_rule__AtomicExpr__Group_6__2__Impl_in_rule__AtomicExpr__Group_6__212945);
            rule__AtomicExpr__Group_6__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__AtomicExpr__Group_6__3_in_rule__AtomicExpr__Group_6__212948);
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6491:1: rule__AtomicExpr__Group_6__2__Impl : ( '{' ) ;
    public final void rule__AtomicExpr__Group_6__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6495:1: ( ( '{' ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6496:1: ( '{' )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6496:1: ( '{' )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6497:1: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAtomicExprAccess().getLeftCurlyBracketKeyword_6_2()); 
            }
            match(input,30,FOLLOW_30_in_rule__AtomicExpr__Group_6__2__Impl12976); if (state.failed) return ;
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6510:1: rule__AtomicExpr__Group_6__3 : rule__AtomicExpr__Group_6__3__Impl rule__AtomicExpr__Group_6__4 ;
    public final void rule__AtomicExpr__Group_6__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6514:1: ( rule__AtomicExpr__Group_6__3__Impl rule__AtomicExpr__Group_6__4 )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6515:2: rule__AtomicExpr__Group_6__3__Impl rule__AtomicExpr__Group_6__4
            {
            pushFollow(FOLLOW_rule__AtomicExpr__Group_6__3__Impl_in_rule__AtomicExpr__Group_6__313007);
            rule__AtomicExpr__Group_6__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__AtomicExpr__Group_6__4_in_rule__AtomicExpr__Group_6__313010);
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6522:1: rule__AtomicExpr__Group_6__3__Impl : ( ( rule__AtomicExpr__FieldsAssignment_6_3 ) ) ;
    public final void rule__AtomicExpr__Group_6__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6526:1: ( ( ( rule__AtomicExpr__FieldsAssignment_6_3 ) ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6527:1: ( ( rule__AtomicExpr__FieldsAssignment_6_3 ) )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6527:1: ( ( rule__AtomicExpr__FieldsAssignment_6_3 ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6528:1: ( rule__AtomicExpr__FieldsAssignment_6_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAtomicExprAccess().getFieldsAssignment_6_3()); 
            }
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6529:1: ( rule__AtomicExpr__FieldsAssignment_6_3 )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6529:2: rule__AtomicExpr__FieldsAssignment_6_3
            {
            pushFollow(FOLLOW_rule__AtomicExpr__FieldsAssignment_6_3_in_rule__AtomicExpr__Group_6__3__Impl13037);
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6539:1: rule__AtomicExpr__Group_6__4 : rule__AtomicExpr__Group_6__4__Impl rule__AtomicExpr__Group_6__5 ;
    public final void rule__AtomicExpr__Group_6__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6543:1: ( rule__AtomicExpr__Group_6__4__Impl rule__AtomicExpr__Group_6__5 )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6544:2: rule__AtomicExpr__Group_6__4__Impl rule__AtomicExpr__Group_6__5
            {
            pushFollow(FOLLOW_rule__AtomicExpr__Group_6__4__Impl_in_rule__AtomicExpr__Group_6__413067);
            rule__AtomicExpr__Group_6__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__AtomicExpr__Group_6__5_in_rule__AtomicExpr__Group_6__413070);
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6551:1: rule__AtomicExpr__Group_6__4__Impl : ( '=' ) ;
    public final void rule__AtomicExpr__Group_6__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6555:1: ( ( '=' ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6556:1: ( '=' )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6556:1: ( '=' )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6557:1: '='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAtomicExprAccess().getEqualsSignKeyword_6_4()); 
            }
            match(input,18,FOLLOW_18_in_rule__AtomicExpr__Group_6__4__Impl13098); if (state.failed) return ;
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6570:1: rule__AtomicExpr__Group_6__5 : rule__AtomicExpr__Group_6__5__Impl rule__AtomicExpr__Group_6__6 ;
    public final void rule__AtomicExpr__Group_6__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6574:1: ( rule__AtomicExpr__Group_6__5__Impl rule__AtomicExpr__Group_6__6 )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6575:2: rule__AtomicExpr__Group_6__5__Impl rule__AtomicExpr__Group_6__6
            {
            pushFollow(FOLLOW_rule__AtomicExpr__Group_6__5__Impl_in_rule__AtomicExpr__Group_6__513129);
            rule__AtomicExpr__Group_6__5__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__AtomicExpr__Group_6__6_in_rule__AtomicExpr__Group_6__513132);
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6582:1: rule__AtomicExpr__Group_6__5__Impl : ( ( rule__AtomicExpr__ExprsAssignment_6_5 ) ) ;
    public final void rule__AtomicExpr__Group_6__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6586:1: ( ( ( rule__AtomicExpr__ExprsAssignment_6_5 ) ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6587:1: ( ( rule__AtomicExpr__ExprsAssignment_6_5 ) )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6587:1: ( ( rule__AtomicExpr__ExprsAssignment_6_5 ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6588:1: ( rule__AtomicExpr__ExprsAssignment_6_5 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAtomicExprAccess().getExprsAssignment_6_5()); 
            }
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6589:1: ( rule__AtomicExpr__ExprsAssignment_6_5 )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6589:2: rule__AtomicExpr__ExprsAssignment_6_5
            {
            pushFollow(FOLLOW_rule__AtomicExpr__ExprsAssignment_6_5_in_rule__AtomicExpr__Group_6__5__Impl13159);
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6599:1: rule__AtomicExpr__Group_6__6 : rule__AtomicExpr__Group_6__6__Impl rule__AtomicExpr__Group_6__7 ;
    public final void rule__AtomicExpr__Group_6__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6603:1: ( rule__AtomicExpr__Group_6__6__Impl rule__AtomicExpr__Group_6__7 )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6604:2: rule__AtomicExpr__Group_6__6__Impl rule__AtomicExpr__Group_6__7
            {
            pushFollow(FOLLOW_rule__AtomicExpr__Group_6__6__Impl_in_rule__AtomicExpr__Group_6__613189);
            rule__AtomicExpr__Group_6__6__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__AtomicExpr__Group_6__7_in_rule__AtomicExpr__Group_6__613192);
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6611:1: rule__AtomicExpr__Group_6__6__Impl : ( ( rule__AtomicExpr__Group_6_6__0 )* ) ;
    public final void rule__AtomicExpr__Group_6__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6615:1: ( ( ( rule__AtomicExpr__Group_6_6__0 )* ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6616:1: ( ( rule__AtomicExpr__Group_6_6__0 )* )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6616:1: ( ( rule__AtomicExpr__Group_6_6__0 )* )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6617:1: ( rule__AtomicExpr__Group_6_6__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAtomicExprAccess().getGroup_6_6()); 
            }
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6618:1: ( rule__AtomicExpr__Group_6_6__0 )*
            loop37:
            do {
                int alt37=2;
                int LA37_0 = input.LA(1);

                if ( (LA37_0==28) ) {
                    alt37=1;
                }


                switch (alt37) {
            	case 1 :
            	    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6618:2: rule__AtomicExpr__Group_6_6__0
            	    {
            	    pushFollow(FOLLOW_rule__AtomicExpr__Group_6_6__0_in_rule__AtomicExpr__Group_6__6__Impl13219);
            	    rule__AtomicExpr__Group_6_6__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop37;
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6628:1: rule__AtomicExpr__Group_6__7 : rule__AtomicExpr__Group_6__7__Impl ;
    public final void rule__AtomicExpr__Group_6__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6632:1: ( rule__AtomicExpr__Group_6__7__Impl )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6633:2: rule__AtomicExpr__Group_6__7__Impl
            {
            pushFollow(FOLLOW_rule__AtomicExpr__Group_6__7__Impl_in_rule__AtomicExpr__Group_6__713250);
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6639:1: rule__AtomicExpr__Group_6__7__Impl : ( '}' ) ;
    public final void rule__AtomicExpr__Group_6__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6643:1: ( ( '}' ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6644:1: ( '}' )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6644:1: ( '}' )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6645:1: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAtomicExprAccess().getRightCurlyBracketKeyword_6_7()); 
            }
            match(input,32,FOLLOW_32_in_rule__AtomicExpr__Group_6__7__Impl13278); if (state.failed) return ;
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6674:1: rule__AtomicExpr__Group_6_6__0 : rule__AtomicExpr__Group_6_6__0__Impl rule__AtomicExpr__Group_6_6__1 ;
    public final void rule__AtomicExpr__Group_6_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6678:1: ( rule__AtomicExpr__Group_6_6__0__Impl rule__AtomicExpr__Group_6_6__1 )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6679:2: rule__AtomicExpr__Group_6_6__0__Impl rule__AtomicExpr__Group_6_6__1
            {
            pushFollow(FOLLOW_rule__AtomicExpr__Group_6_6__0__Impl_in_rule__AtomicExpr__Group_6_6__013325);
            rule__AtomicExpr__Group_6_6__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__AtomicExpr__Group_6_6__1_in_rule__AtomicExpr__Group_6_6__013328);
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6686:1: rule__AtomicExpr__Group_6_6__0__Impl : ( ';' ) ;
    public final void rule__AtomicExpr__Group_6_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6690:1: ( ( ';' ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6691:1: ( ';' )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6691:1: ( ';' )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6692:1: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAtomicExprAccess().getSemicolonKeyword_6_6_0()); 
            }
            match(input,28,FOLLOW_28_in_rule__AtomicExpr__Group_6_6__0__Impl13356); if (state.failed) return ;
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6705:1: rule__AtomicExpr__Group_6_6__1 : rule__AtomicExpr__Group_6_6__1__Impl rule__AtomicExpr__Group_6_6__2 ;
    public final void rule__AtomicExpr__Group_6_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6709:1: ( rule__AtomicExpr__Group_6_6__1__Impl rule__AtomicExpr__Group_6_6__2 )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6710:2: rule__AtomicExpr__Group_6_6__1__Impl rule__AtomicExpr__Group_6_6__2
            {
            pushFollow(FOLLOW_rule__AtomicExpr__Group_6_6__1__Impl_in_rule__AtomicExpr__Group_6_6__113387);
            rule__AtomicExpr__Group_6_6__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__AtomicExpr__Group_6_6__2_in_rule__AtomicExpr__Group_6_6__113390);
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6717:1: rule__AtomicExpr__Group_6_6__1__Impl : ( ( rule__AtomicExpr__FieldsAssignment_6_6_1 ) ) ;
    public final void rule__AtomicExpr__Group_6_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6721:1: ( ( ( rule__AtomicExpr__FieldsAssignment_6_6_1 ) ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6722:1: ( ( rule__AtomicExpr__FieldsAssignment_6_6_1 ) )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6722:1: ( ( rule__AtomicExpr__FieldsAssignment_6_6_1 ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6723:1: ( rule__AtomicExpr__FieldsAssignment_6_6_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAtomicExprAccess().getFieldsAssignment_6_6_1()); 
            }
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6724:1: ( rule__AtomicExpr__FieldsAssignment_6_6_1 )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6724:2: rule__AtomicExpr__FieldsAssignment_6_6_1
            {
            pushFollow(FOLLOW_rule__AtomicExpr__FieldsAssignment_6_6_1_in_rule__AtomicExpr__Group_6_6__1__Impl13417);
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6734:1: rule__AtomicExpr__Group_6_6__2 : rule__AtomicExpr__Group_6_6__2__Impl rule__AtomicExpr__Group_6_6__3 ;
    public final void rule__AtomicExpr__Group_6_6__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6738:1: ( rule__AtomicExpr__Group_6_6__2__Impl rule__AtomicExpr__Group_6_6__3 )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6739:2: rule__AtomicExpr__Group_6_6__2__Impl rule__AtomicExpr__Group_6_6__3
            {
            pushFollow(FOLLOW_rule__AtomicExpr__Group_6_6__2__Impl_in_rule__AtomicExpr__Group_6_6__213447);
            rule__AtomicExpr__Group_6_6__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__AtomicExpr__Group_6_6__3_in_rule__AtomicExpr__Group_6_6__213450);
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6746:1: rule__AtomicExpr__Group_6_6__2__Impl : ( '=' ) ;
    public final void rule__AtomicExpr__Group_6_6__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6750:1: ( ( '=' ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6751:1: ( '=' )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6751:1: ( '=' )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6752:1: '='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAtomicExprAccess().getEqualsSignKeyword_6_6_2()); 
            }
            match(input,18,FOLLOW_18_in_rule__AtomicExpr__Group_6_6__2__Impl13478); if (state.failed) return ;
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6765:1: rule__AtomicExpr__Group_6_6__3 : rule__AtomicExpr__Group_6_6__3__Impl ;
    public final void rule__AtomicExpr__Group_6_6__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6769:1: ( rule__AtomicExpr__Group_6_6__3__Impl )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6770:2: rule__AtomicExpr__Group_6_6__3__Impl
            {
            pushFollow(FOLLOW_rule__AtomicExpr__Group_6_6__3__Impl_in_rule__AtomicExpr__Group_6_6__313509);
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6776:1: rule__AtomicExpr__Group_6_6__3__Impl : ( ( rule__AtomicExpr__ExprsAssignment_6_6_3 ) ) ;
    public final void rule__AtomicExpr__Group_6_6__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6780:1: ( ( ( rule__AtomicExpr__ExprsAssignment_6_6_3 ) ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6781:1: ( ( rule__AtomicExpr__ExprsAssignment_6_6_3 ) )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6781:1: ( ( rule__AtomicExpr__ExprsAssignment_6_6_3 ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6782:1: ( rule__AtomicExpr__ExprsAssignment_6_6_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAtomicExprAccess().getExprsAssignment_6_6_3()); 
            }
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6783:1: ( rule__AtomicExpr__ExprsAssignment_6_6_3 )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6783:2: rule__AtomicExpr__ExprsAssignment_6_6_3
            {
            pushFollow(FOLLOW_rule__AtomicExpr__ExprsAssignment_6_6_3_in_rule__AtomicExpr__Group_6_6__3__Impl13536);
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6801:1: rule__AtomicExpr__Group_7__0 : rule__AtomicExpr__Group_7__0__Impl rule__AtomicExpr__Group_7__1 ;
    public final void rule__AtomicExpr__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6805:1: ( rule__AtomicExpr__Group_7__0__Impl rule__AtomicExpr__Group_7__1 )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6806:2: rule__AtomicExpr__Group_7__0__Impl rule__AtomicExpr__Group_7__1
            {
            pushFollow(FOLLOW_rule__AtomicExpr__Group_7__0__Impl_in_rule__AtomicExpr__Group_7__013574);
            rule__AtomicExpr__Group_7__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__AtomicExpr__Group_7__1_in_rule__AtomicExpr__Group_7__013577);
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6813:1: rule__AtomicExpr__Group_7__0__Impl : ( '(' ) ;
    public final void rule__AtomicExpr__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6817:1: ( ( '(' ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6818:1: ( '(' )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6818:1: ( '(' )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6819:1: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAtomicExprAccess().getLeftParenthesisKeyword_7_0()); 
            }
            match(input,43,FOLLOW_43_in_rule__AtomicExpr__Group_7__0__Impl13605); if (state.failed) return ;
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6832:1: rule__AtomicExpr__Group_7__1 : rule__AtomicExpr__Group_7__1__Impl rule__AtomicExpr__Group_7__2 ;
    public final void rule__AtomicExpr__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6836:1: ( rule__AtomicExpr__Group_7__1__Impl rule__AtomicExpr__Group_7__2 )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6837:2: rule__AtomicExpr__Group_7__1__Impl rule__AtomicExpr__Group_7__2
            {
            pushFollow(FOLLOW_rule__AtomicExpr__Group_7__1__Impl_in_rule__AtomicExpr__Group_7__113636);
            rule__AtomicExpr__Group_7__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__AtomicExpr__Group_7__2_in_rule__AtomicExpr__Group_7__113639);
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6844:1: rule__AtomicExpr__Group_7__1__Impl : ( ruleExpr ) ;
    public final void rule__AtomicExpr__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6848:1: ( ( ruleExpr ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6849:1: ( ruleExpr )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6849:1: ( ruleExpr )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6850:1: ruleExpr
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAtomicExprAccess().getExprParserRuleCall_7_1()); 
            }
            pushFollow(FOLLOW_ruleExpr_in_rule__AtomicExpr__Group_7__1__Impl13666);
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6861:1: rule__AtomicExpr__Group_7__2 : rule__AtomicExpr__Group_7__2__Impl ;
    public final void rule__AtomicExpr__Group_7__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6865:1: ( rule__AtomicExpr__Group_7__2__Impl )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6866:2: rule__AtomicExpr__Group_7__2__Impl
            {
            pushFollow(FOLLOW_rule__AtomicExpr__Group_7__2__Impl_in_rule__AtomicExpr__Group_7__213695);
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6872:1: rule__AtomicExpr__Group_7__2__Impl : ( ')' ) ;
    public final void rule__AtomicExpr__Group_7__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6876:1: ( ( ')' ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6877:1: ( ')' )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6877:1: ( ')' )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6878:1: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAtomicExprAccess().getRightParenthesisKeyword_7_2()); 
            }
            match(input,44,FOLLOW_44_in_rule__AtomicExpr__Group_7__2__Impl13723); if (state.failed) return ;
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6897:1: rule__REAL__Group__0 : rule__REAL__Group__0__Impl rule__REAL__Group__1 ;
    public final void rule__REAL__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6901:1: ( rule__REAL__Group__0__Impl rule__REAL__Group__1 )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6902:2: rule__REAL__Group__0__Impl rule__REAL__Group__1
            {
            pushFollow(FOLLOW_rule__REAL__Group__0__Impl_in_rule__REAL__Group__013760);
            rule__REAL__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__REAL__Group__1_in_rule__REAL__Group__013763);
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6909:1: rule__REAL__Group__0__Impl : ( RULE_INT ) ;
    public final void rule__REAL__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6913:1: ( ( RULE_INT ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6914:1: ( RULE_INT )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6914:1: ( RULE_INT )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6915:1: RULE_INT
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getREALAccess().getINTTerminalRuleCall_0()); 
            }
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__REAL__Group__0__Impl13790); if (state.failed) return ;
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6926:1: rule__REAL__Group__1 : rule__REAL__Group__1__Impl rule__REAL__Group__2 ;
    public final void rule__REAL__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6930:1: ( rule__REAL__Group__1__Impl rule__REAL__Group__2 )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6931:2: rule__REAL__Group__1__Impl rule__REAL__Group__2
            {
            pushFollow(FOLLOW_rule__REAL__Group__1__Impl_in_rule__REAL__Group__113819);
            rule__REAL__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__REAL__Group__2_in_rule__REAL__Group__113822);
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6938:1: rule__REAL__Group__1__Impl : ( '.' ) ;
    public final void rule__REAL__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6942:1: ( ( '.' ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6943:1: ( '.' )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6943:1: ( '.' )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6944:1: '.'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getREALAccess().getFullStopKeyword_1()); 
            }
            match(input,52,FOLLOW_52_in_rule__REAL__Group__1__Impl13850); if (state.failed) return ;
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6957:1: rule__REAL__Group__2 : rule__REAL__Group__2__Impl ;
    public final void rule__REAL__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6961:1: ( rule__REAL__Group__2__Impl )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6962:2: rule__REAL__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__REAL__Group__2__Impl_in_rule__REAL__Group__213881);
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6968:1: rule__REAL__Group__2__Impl : ( RULE_INT ) ;
    public final void rule__REAL__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6972:1: ( ( RULE_INT ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6973:1: ( RULE_INT )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6973:1: ( RULE_INT )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6974:1: RULE_INT
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getREALAccess().getINTTerminalRuleCall_2()); 
            }
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__REAL__Group__2__Impl13908); if (state.failed) return ;
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6992:1: rule__File__TypedefsAssignment_0 : ( ruleTypedef ) ;
    public final void rule__File__TypedefsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6996:1: ( ( ruleTypedef ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6997:1: ( ruleTypedef )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6997:1: ( ruleTypedef )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6998:1: ruleTypedef
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFileAccess().getTypedefsTypedefParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_ruleTypedef_in_rule__File__TypedefsAssignment_013948);
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7007:1: rule__File__ConstantsAssignment_1 : ( ruleConstant ) ;
    public final void rule__File__ConstantsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7011:1: ( ( ruleConstant ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7012:1: ( ruleConstant )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7012:1: ( ruleConstant )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7013:1: ruleConstant
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFileAccess().getConstantsConstantParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_ruleConstant_in_rule__File__ConstantsAssignment_113979);
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7022:1: rule__File__NodesAssignment_2 : ( ruleNode ) ;
    public final void rule__File__NodesAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7026:1: ( ( ruleNode ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7027:1: ( ruleNode )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7027:1: ( ruleNode )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7028:1: ruleNode
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFileAccess().getNodesNodeParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_ruleNode_in_rule__File__NodesAssignment_214010);
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7037:1: rule__Typedef__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Typedef__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7041:1: ( ( RULE_ID ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7042:1: ( RULE_ID )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7042:1: ( RULE_ID )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7043:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypedefAccess().getNameIDTerminalRuleCall_1_0()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Typedef__NameAssignment_114041); if (state.failed) return ;
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7052:1: rule__Typedef__TypeAssignment_3 : ( ruleTopLevelType ) ;
    public final void rule__Typedef__TypeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7056:1: ( ( ruleTopLevelType ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7057:1: ( ruleTopLevelType )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7057:1: ( ruleTopLevelType )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7058:1: ruleTopLevelType
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypedefAccess().getTypeTopLevelTypeParserRuleCall_3_0()); 
            }
            pushFollow(FOLLOW_ruleTopLevelType_in_rule__Typedef__TypeAssignment_314072);
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7067:1: rule__TopLevelType__FieldsAssignment_0_3 : ( RULE_ID ) ;
    public final void rule__TopLevelType__FieldsAssignment_0_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7071:1: ( ( RULE_ID ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7072:1: ( RULE_ID )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7072:1: ( RULE_ID )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7073:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTopLevelTypeAccess().getFieldsIDTerminalRuleCall_0_3_0()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__TopLevelType__FieldsAssignment_0_314103); if (state.failed) return ;
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7082:1: rule__TopLevelType__TypesAssignment_0_5 : ( ruleType ) ;
    public final void rule__TopLevelType__TypesAssignment_0_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7086:1: ( ( ruleType ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7087:1: ( ruleType )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7087:1: ( ruleType )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7088:1: ruleType
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTopLevelTypeAccess().getTypesTypeParserRuleCall_0_5_0()); 
            }
            pushFollow(FOLLOW_ruleType_in_rule__TopLevelType__TypesAssignment_0_514134);
            ruleType();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTopLevelTypeAccess().getTypesTypeParserRuleCall_0_5_0()); 
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7097:1: rule__TopLevelType__FieldsAssignment_0_6_1 : ( RULE_ID ) ;
    public final void rule__TopLevelType__FieldsAssignment_0_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7101:1: ( ( RULE_ID ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7102:1: ( RULE_ID )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7102:1: ( RULE_ID )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7103:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTopLevelTypeAccess().getFieldsIDTerminalRuleCall_0_6_1_0()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__TopLevelType__FieldsAssignment_0_6_114165); if (state.failed) return ;
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7112:1: rule__TopLevelType__TypesAssignment_0_6_3 : ( ruleType ) ;
    public final void rule__TopLevelType__TypesAssignment_0_6_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7116:1: ( ( ruleType ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7117:1: ( ruleType )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7117:1: ( ruleType )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7118:1: ruleType
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTopLevelTypeAccess().getTypesTypeParserRuleCall_0_6_3_0()); 
            }
            pushFollow(FOLLOW_ruleType_in_rule__TopLevelType__TypesAssignment_0_6_314196);
            ruleType();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTopLevelTypeAccess().getTypesTypeParserRuleCall_0_6_3_0()); 
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7127:1: rule__Type__LowAssignment_3_3 : ( ruleBound ) ;
    public final void rule__Type__LowAssignment_3_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7131:1: ( ( ruleBound ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7132:1: ( ruleBound )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7132:1: ( ruleBound )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7133:1: ruleBound
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypeAccess().getLowBoundParserRuleCall_3_3_0()); 
            }
            pushFollow(FOLLOW_ruleBound_in_rule__Type__LowAssignment_3_314227);
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7142:1: rule__Type__HighAssignment_3_5 : ( ruleBound ) ;
    public final void rule__Type__HighAssignment_3_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7146:1: ( ( ruleBound ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7147:1: ( ruleBound )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7147:1: ( ruleBound )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7148:1: ruleBound
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypeAccess().getHighBoundParserRuleCall_3_5_0()); 
            }
            pushFollow(FOLLOW_ruleBound_in_rule__Type__HighAssignment_3_514258);
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7157:1: rule__Type__DefAssignment_4_1 : ( ( RULE_ID ) ) ;
    public final void rule__Type__DefAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7161:1: ( ( ( RULE_ID ) ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7162:1: ( ( RULE_ID ) )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7162:1: ( ( RULE_ID ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7163:1: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypeAccess().getDefTypedefCrossReference_4_1_0()); 
            }
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7164:1: ( RULE_ID )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7165:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypeAccess().getDefTypedefIDTerminalRuleCall_4_1_0_1()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Type__DefAssignment_4_114293); if (state.failed) return ;
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7176:1: rule__Constant__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Constant__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7180:1: ( ( RULE_ID ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7181:1: ( RULE_ID )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7181:1: ( RULE_ID )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7182:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConstantAccess().getNameIDTerminalRuleCall_1_0()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Constant__NameAssignment_114328); if (state.failed) return ;
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7191:1: rule__Constant__TypeAssignment_2_1 : ( ruleType ) ;
    public final void rule__Constant__TypeAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7195:1: ( ( ruleType ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7196:1: ( ruleType )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7196:1: ( ruleType )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7197:1: ruleType
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConstantAccess().getTypeTypeParserRuleCall_2_1_0()); 
            }
            pushFollow(FOLLOW_ruleType_in_rule__Constant__TypeAssignment_2_114359);
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7206:1: rule__Constant__ExprAssignment_4 : ( ruleExpr ) ;
    public final void rule__Constant__ExprAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7210:1: ( ( ruleExpr ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7211:1: ( ruleExpr )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7211:1: ( ruleExpr )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7212:1: ruleExpr
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConstantAccess().getExprExprParserRuleCall_4_0()); 
            }
            pushFollow(FOLLOW_ruleExpr_in_rule__Constant__ExprAssignment_414390);
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7221:1: rule__Node__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Node__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7225:1: ( ( RULE_ID ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7226:1: ( RULE_ID )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7226:1: ( RULE_ID )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7227:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNodeAccess().getNameIDTerminalRuleCall_1_0()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Node__NameAssignment_114421); if (state.failed) return ;
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7236:1: rule__Node__InputsAssignment_3_0 : ( ruleVariableGroup ) ;
    public final void rule__Node__InputsAssignment_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7240:1: ( ( ruleVariableGroup ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7241:1: ( ruleVariableGroup )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7241:1: ( ruleVariableGroup )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7242:1: ruleVariableGroup
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNodeAccess().getInputsVariableGroupParserRuleCall_3_0_0()); 
            }
            pushFollow(FOLLOW_ruleVariableGroup_in_rule__Node__InputsAssignment_3_014452);
            ruleVariableGroup();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getNodeAccess().getInputsVariableGroupParserRuleCall_3_0_0()); 
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7251:1: rule__Node__InputsAssignment_3_1_1 : ( ruleVariableGroup ) ;
    public final void rule__Node__InputsAssignment_3_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7255:1: ( ( ruleVariableGroup ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7256:1: ( ruleVariableGroup )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7256:1: ( ruleVariableGroup )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7257:1: ruleVariableGroup
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNodeAccess().getInputsVariableGroupParserRuleCall_3_1_1_0()); 
            }
            pushFollow(FOLLOW_ruleVariableGroup_in_rule__Node__InputsAssignment_3_1_114483);
            ruleVariableGroup();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getNodeAccess().getInputsVariableGroupParserRuleCall_3_1_1_0()); 
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7266:1: rule__Node__OutputsAssignment_7_0 : ( ruleVariableGroup ) ;
    public final void rule__Node__OutputsAssignment_7_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7270:1: ( ( ruleVariableGroup ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7271:1: ( ruleVariableGroup )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7271:1: ( ruleVariableGroup )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7272:1: ruleVariableGroup
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNodeAccess().getOutputsVariableGroupParserRuleCall_7_0_0()); 
            }
            pushFollow(FOLLOW_ruleVariableGroup_in_rule__Node__OutputsAssignment_7_014514);
            ruleVariableGroup();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getNodeAccess().getOutputsVariableGroupParserRuleCall_7_0_0()); 
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7281:1: rule__Node__OutputsAssignment_7_1_1 : ( ruleVariableGroup ) ;
    public final void rule__Node__OutputsAssignment_7_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7285:1: ( ( ruleVariableGroup ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7286:1: ( ruleVariableGroup )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7286:1: ( ruleVariableGroup )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7287:1: ruleVariableGroup
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNodeAccess().getOutputsVariableGroupParserRuleCall_7_1_1_0()); 
            }
            pushFollow(FOLLOW_ruleVariableGroup_in_rule__Node__OutputsAssignment_7_1_114545);
            ruleVariableGroup();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getNodeAccess().getOutputsVariableGroupParserRuleCall_7_1_1_0()); 
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7296:1: rule__Node__LocalsAssignment_10_1_0 : ( ruleVariableGroup ) ;
    public final void rule__Node__LocalsAssignment_10_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7300:1: ( ( ruleVariableGroup ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7301:1: ( ruleVariableGroup )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7301:1: ( ruleVariableGroup )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7302:1: ruleVariableGroup
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNodeAccess().getLocalsVariableGroupParserRuleCall_10_1_0_0()); 
            }
            pushFollow(FOLLOW_ruleVariableGroup_in_rule__Node__LocalsAssignment_10_1_014576);
            ruleVariableGroup();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getNodeAccess().getLocalsVariableGroupParserRuleCall_10_1_0_0()); 
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7311:1: rule__Node__EquationsAssignment_12_0 : ( ruleEquation ) ;
    public final void rule__Node__EquationsAssignment_12_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7315:1: ( ( ruleEquation ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7316:1: ( ruleEquation )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7316:1: ( ruleEquation )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7317:1: ruleEquation
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNodeAccess().getEquationsEquationParserRuleCall_12_0_0()); 
            }
            pushFollow(FOLLOW_ruleEquation_in_rule__Node__EquationsAssignment_12_014607);
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7326:1: rule__Node__PropertiesAssignment_12_1 : ( ruleProperty ) ;
    public final void rule__Node__PropertiesAssignment_12_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7330:1: ( ( ruleProperty ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7331:1: ( ruleProperty )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7331:1: ( ruleProperty )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7332:1: ruleProperty
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNodeAccess().getPropertiesPropertyParserRuleCall_12_1_0()); 
            }
            pushFollow(FOLLOW_ruleProperty_in_rule__Node__PropertiesAssignment_12_114638);
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7341:1: rule__Node__AssertionsAssignment_12_2 : ( ruleAssertion ) ;
    public final void rule__Node__AssertionsAssignment_12_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7345:1: ( ( ruleAssertion ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7346:1: ( ruleAssertion )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7346:1: ( ruleAssertion )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7347:1: ruleAssertion
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNodeAccess().getAssertionsAssertionParserRuleCall_12_2_0()); 
            }
            pushFollow(FOLLOW_ruleAssertion_in_rule__Node__AssertionsAssignment_12_214669);
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7356:1: rule__Node__MainAssignment_12_3 : ( ruleMain ) ;
    public final void rule__Node__MainAssignment_12_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7360:1: ( ( ruleMain ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7361:1: ( ruleMain )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7361:1: ( ruleMain )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7362:1: ruleMain
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNodeAccess().getMainMainParserRuleCall_12_3_0()); 
            }
            pushFollow(FOLLOW_ruleMain_in_rule__Node__MainAssignment_12_314700);
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


    // $ANTLR start "rule__VariableGroup__VariablesAssignment_0"
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7371:1: rule__VariableGroup__VariablesAssignment_0 : ( ruleVariable ) ;
    public final void rule__VariableGroup__VariablesAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7375:1: ( ( ruleVariable ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7376:1: ( ruleVariable )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7376:1: ( ruleVariable )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7377:1: ruleVariable
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariableGroupAccess().getVariablesVariableParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_ruleVariable_in_rule__VariableGroup__VariablesAssignment_014731);
            ruleVariable();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getVariableGroupAccess().getVariablesVariableParserRuleCall_0_0()); 
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
    // $ANTLR end "rule__VariableGroup__VariablesAssignment_0"


    // $ANTLR start "rule__VariableGroup__VariablesAssignment_1_1"
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7386:1: rule__VariableGroup__VariablesAssignment_1_1 : ( ruleVariable ) ;
    public final void rule__VariableGroup__VariablesAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7390:1: ( ( ruleVariable ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7391:1: ( ruleVariable )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7391:1: ( ruleVariable )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7392:1: ruleVariable
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariableGroupAccess().getVariablesVariableParserRuleCall_1_1_0()); 
            }
            pushFollow(FOLLOW_ruleVariable_in_rule__VariableGroup__VariablesAssignment_1_114762);
            ruleVariable();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getVariableGroupAccess().getVariablesVariableParserRuleCall_1_1_0()); 
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
    // $ANTLR end "rule__VariableGroup__VariablesAssignment_1_1"


    // $ANTLR start "rule__VariableGroup__TypeAssignment_3"
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7401:1: rule__VariableGroup__TypeAssignment_3 : ( ruleType ) ;
    public final void rule__VariableGroup__TypeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7405:1: ( ( ruleType ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7406:1: ( ruleType )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7406:1: ( ruleType )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7407:1: ruleType
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariableGroupAccess().getTypeTypeParserRuleCall_3_0()); 
            }
            pushFollow(FOLLOW_ruleType_in_rule__VariableGroup__TypeAssignment_314793);
            ruleType();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getVariableGroupAccess().getTypeTypeParserRuleCall_3_0()); 
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
    // $ANTLR end "rule__VariableGroup__TypeAssignment_3"


    // $ANTLR start "rule__Variable__NameAssignment"
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7416:1: rule__Variable__NameAssignment : ( RULE_ID ) ;
    public final void rule__Variable__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7420:1: ( ( RULE_ID ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7421:1: ( RULE_ID )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7421:1: ( RULE_ID )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7422:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariableAccess().getNameIDTerminalRuleCall_0()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Variable__NameAssignment14824); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getVariableAccess().getNameIDTerminalRuleCall_0()); 
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
    // $ANTLR end "rule__Variable__NameAssignment"


    // $ANTLR start "rule__Equation__LhsAssignment_0"
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7431:1: rule__Equation__LhsAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__Equation__LhsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7435:1: ( ( ( RULE_ID ) ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7436:1: ( ( RULE_ID ) )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7436:1: ( ( RULE_ID ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7437:1: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEquationAccess().getLhsVariableCrossReference_0_0()); 
            }
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7438:1: ( RULE_ID )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7439:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEquationAccess().getLhsVariableIDTerminalRuleCall_0_0_1()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Equation__LhsAssignment_014859); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEquationAccess().getLhsVariableIDTerminalRuleCall_0_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEquationAccess().getLhsVariableCrossReference_0_0()); 
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7450:1: rule__Equation__LhsAssignment_1_1 : ( ( RULE_ID ) ) ;
    public final void rule__Equation__LhsAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7454:1: ( ( ( RULE_ID ) ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7455:1: ( ( RULE_ID ) )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7455:1: ( ( RULE_ID ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7456:1: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEquationAccess().getLhsVariableCrossReference_1_1_0()); 
            }
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7457:1: ( RULE_ID )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7458:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEquationAccess().getLhsVariableIDTerminalRuleCall_1_1_0_1()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Equation__LhsAssignment_1_114898); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEquationAccess().getLhsVariableIDTerminalRuleCall_1_1_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEquationAccess().getLhsVariableCrossReference_1_1_0()); 
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7469:1: rule__Equation__RhsAssignment_3 : ( ruleExpr ) ;
    public final void rule__Equation__RhsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7473:1: ( ( ruleExpr ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7474:1: ( ruleExpr )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7474:1: ( ruleExpr )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7475:1: ruleExpr
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEquationAccess().getRhsExprParserRuleCall_3_0()); 
            }
            pushFollow(FOLLOW_ruleExpr_in_rule__Equation__RhsAssignment_314933);
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7484:1: rule__Property__RefAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__Property__RefAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7488:1: ( ( ( RULE_ID ) ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7489:1: ( ( RULE_ID ) )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7489:1: ( ( RULE_ID ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7490:1: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPropertyAccess().getRefVariableCrossReference_1_0()); 
            }
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7491:1: ( RULE_ID )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7492:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPropertyAccess().getRefVariableIDTerminalRuleCall_1_0_1()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Property__RefAssignment_114968); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPropertyAccess().getRefVariableIDTerminalRuleCall_1_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPropertyAccess().getRefVariableCrossReference_1_0()); 
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7503:1: rule__Assertion__ExprAssignment_1 : ( ruleExpr ) ;
    public final void rule__Assertion__ExprAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7507:1: ( ( ruleExpr ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7508:1: ( ruleExpr )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7508:1: ( ruleExpr )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7509:1: ruleExpr
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAssertionAccess().getExprExprParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_ruleExpr_in_rule__Assertion__ExprAssignment_115003);
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7518:1: rule__ArrowExpr__OpAssignment_1_0_1 : ( ( '->' ) ) ;
    public final void rule__ArrowExpr__OpAssignment_1_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7522:1: ( ( ( '->' ) ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7523:1: ( ( '->' ) )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7523:1: ( ( '->' ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7524:1: ( '->' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getArrowExprAccess().getOpHyphenMinusGreaterThanSignKeyword_1_0_1_0()); 
            }
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7525:1: ( '->' )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7526:1: '->'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getArrowExprAccess().getOpHyphenMinusGreaterThanSignKeyword_1_0_1_0()); 
            }
            match(input,56,FOLLOW_56_in_rule__ArrowExpr__OpAssignment_1_0_115039); if (state.failed) return ;
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7541:1: rule__ArrowExpr__RightAssignment_1_0_2 : ( ruleArrowExpr ) ;
    public final void rule__ArrowExpr__RightAssignment_1_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7545:1: ( ( ruleArrowExpr ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7546:1: ( ruleArrowExpr )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7546:1: ( ruleArrowExpr )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7547:1: ruleArrowExpr
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getArrowExprAccess().getRightArrowExprParserRuleCall_1_0_2_0()); 
            }
            pushFollow(FOLLOW_ruleArrowExpr_in_rule__ArrowExpr__RightAssignment_1_0_215078);
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7556:1: rule__ImpliesExpr__OpAssignment_1_0_1 : ( ( '=>' ) ) ;
    public final void rule__ImpliesExpr__OpAssignment_1_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7560:1: ( ( ( '=>' ) ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7561:1: ( ( '=>' ) )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7561:1: ( ( '=>' ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7562:1: ( '=>' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getImpliesExprAccess().getOpEqualsSignGreaterThanSignKeyword_1_0_1_0()); 
            }
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7563:1: ( '=>' )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7564:1: '=>'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getImpliesExprAccess().getOpEqualsSignGreaterThanSignKeyword_1_0_1_0()); 
            }
            match(input,57,FOLLOW_57_in_rule__ImpliesExpr__OpAssignment_1_0_115114); if (state.failed) return ;
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7579:1: rule__ImpliesExpr__RightAssignment_1_0_2 : ( ruleImpliesExpr ) ;
    public final void rule__ImpliesExpr__RightAssignment_1_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7583:1: ( ( ruleImpliesExpr ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7584:1: ( ruleImpliesExpr )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7584:1: ( ruleImpliesExpr )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7585:1: ruleImpliesExpr
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getImpliesExprAccess().getRightImpliesExprParserRuleCall_1_0_2_0()); 
            }
            pushFollow(FOLLOW_ruleImpliesExpr_in_rule__ImpliesExpr__RightAssignment_1_0_215153);
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7594:1: rule__OrExpr__OpAssignment_1_0_1 : ( ( rule__OrExpr__OpAlternatives_1_0_1_0 ) ) ;
    public final void rule__OrExpr__OpAssignment_1_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7598:1: ( ( ( rule__OrExpr__OpAlternatives_1_0_1_0 ) ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7599:1: ( ( rule__OrExpr__OpAlternatives_1_0_1_0 ) )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7599:1: ( ( rule__OrExpr__OpAlternatives_1_0_1_0 ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7600:1: ( rule__OrExpr__OpAlternatives_1_0_1_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOrExprAccess().getOpAlternatives_1_0_1_0()); 
            }
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7601:1: ( rule__OrExpr__OpAlternatives_1_0_1_0 )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7601:2: rule__OrExpr__OpAlternatives_1_0_1_0
            {
            pushFollow(FOLLOW_rule__OrExpr__OpAlternatives_1_0_1_0_in_rule__OrExpr__OpAssignment_1_0_115184);
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7610:1: rule__OrExpr__RightAssignment_1_0_2 : ( ruleAndExpr ) ;
    public final void rule__OrExpr__RightAssignment_1_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7614:1: ( ( ruleAndExpr ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7615:1: ( ruleAndExpr )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7615:1: ( ruleAndExpr )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7616:1: ruleAndExpr
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOrExprAccess().getRightAndExprParserRuleCall_1_0_2_0()); 
            }
            pushFollow(FOLLOW_ruleAndExpr_in_rule__OrExpr__RightAssignment_1_0_215217);
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7625:1: rule__AndExpr__OpAssignment_1_0_1 : ( ( 'and' ) ) ;
    public final void rule__AndExpr__OpAssignment_1_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7629:1: ( ( ( 'and' ) ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7630:1: ( ( 'and' ) )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7630:1: ( ( 'and' ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7631:1: ( 'and' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAndExprAccess().getOpAndKeyword_1_0_1_0()); 
            }
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7632:1: ( 'and' )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7633:1: 'and'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAndExprAccess().getOpAndKeyword_1_0_1_0()); 
            }
            match(input,58,FOLLOW_58_in_rule__AndExpr__OpAssignment_1_0_115253); if (state.failed) return ;
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7648:1: rule__AndExpr__RightAssignment_1_0_2 : ( ruleRelationalExpr ) ;
    public final void rule__AndExpr__RightAssignment_1_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7652:1: ( ( ruleRelationalExpr ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7653:1: ( ruleRelationalExpr )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7653:1: ( ruleRelationalExpr )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7654:1: ruleRelationalExpr
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAndExprAccess().getRightRelationalExprParserRuleCall_1_0_2_0()); 
            }
            pushFollow(FOLLOW_ruleRelationalExpr_in_rule__AndExpr__RightAssignment_1_0_215292);
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7663:1: rule__RelationalExpr__OpAssignment_1_0_1 : ( ( rule__RelationalExpr__OpAlternatives_1_0_1_0 ) ) ;
    public final void rule__RelationalExpr__OpAssignment_1_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7667:1: ( ( ( rule__RelationalExpr__OpAlternatives_1_0_1_0 ) ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7668:1: ( ( rule__RelationalExpr__OpAlternatives_1_0_1_0 ) )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7668:1: ( ( rule__RelationalExpr__OpAlternatives_1_0_1_0 ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7669:1: ( rule__RelationalExpr__OpAlternatives_1_0_1_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRelationalExprAccess().getOpAlternatives_1_0_1_0()); 
            }
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7670:1: ( rule__RelationalExpr__OpAlternatives_1_0_1_0 )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7670:2: rule__RelationalExpr__OpAlternatives_1_0_1_0
            {
            pushFollow(FOLLOW_rule__RelationalExpr__OpAlternatives_1_0_1_0_in_rule__RelationalExpr__OpAssignment_1_0_115323);
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7679:1: rule__RelationalExpr__RightAssignment_1_0_2 : ( rulePlusExpr ) ;
    public final void rule__RelationalExpr__RightAssignment_1_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7683:1: ( ( rulePlusExpr ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7684:1: ( rulePlusExpr )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7684:1: ( rulePlusExpr )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7685:1: rulePlusExpr
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRelationalExprAccess().getRightPlusExprParserRuleCall_1_0_2_0()); 
            }
            pushFollow(FOLLOW_rulePlusExpr_in_rule__RelationalExpr__RightAssignment_1_0_215356);
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7694:1: rule__PlusExpr__OpAssignment_1_0_1 : ( ( rule__PlusExpr__OpAlternatives_1_0_1_0 ) ) ;
    public final void rule__PlusExpr__OpAssignment_1_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7698:1: ( ( ( rule__PlusExpr__OpAlternatives_1_0_1_0 ) ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7699:1: ( ( rule__PlusExpr__OpAlternatives_1_0_1_0 ) )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7699:1: ( ( rule__PlusExpr__OpAlternatives_1_0_1_0 ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7700:1: ( rule__PlusExpr__OpAlternatives_1_0_1_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPlusExprAccess().getOpAlternatives_1_0_1_0()); 
            }
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7701:1: ( rule__PlusExpr__OpAlternatives_1_0_1_0 )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7701:2: rule__PlusExpr__OpAlternatives_1_0_1_0
            {
            pushFollow(FOLLOW_rule__PlusExpr__OpAlternatives_1_0_1_0_in_rule__PlusExpr__OpAssignment_1_0_115387);
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7710:1: rule__PlusExpr__RightAssignment_1_0_2 : ( ruleTimesExpr ) ;
    public final void rule__PlusExpr__RightAssignment_1_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7714:1: ( ( ruleTimesExpr ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7715:1: ( ruleTimesExpr )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7715:1: ( ruleTimesExpr )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7716:1: ruleTimesExpr
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPlusExprAccess().getRightTimesExprParserRuleCall_1_0_2_0()); 
            }
            pushFollow(FOLLOW_ruleTimesExpr_in_rule__PlusExpr__RightAssignment_1_0_215420);
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7725:1: rule__TimesExpr__OpAssignment_1_0_1 : ( ( rule__TimesExpr__OpAlternatives_1_0_1_0 ) ) ;
    public final void rule__TimesExpr__OpAssignment_1_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7729:1: ( ( ( rule__TimesExpr__OpAlternatives_1_0_1_0 ) ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7730:1: ( ( rule__TimesExpr__OpAlternatives_1_0_1_0 ) )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7730:1: ( ( rule__TimesExpr__OpAlternatives_1_0_1_0 ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7731:1: ( rule__TimesExpr__OpAlternatives_1_0_1_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTimesExprAccess().getOpAlternatives_1_0_1_0()); 
            }
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7732:1: ( rule__TimesExpr__OpAlternatives_1_0_1_0 )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7732:2: rule__TimesExpr__OpAlternatives_1_0_1_0
            {
            pushFollow(FOLLOW_rule__TimesExpr__OpAlternatives_1_0_1_0_in_rule__TimesExpr__OpAssignment_1_0_115451);
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7741:1: rule__TimesExpr__RightAssignment_1_0_2 : ( rulePrefixExpr ) ;
    public final void rule__TimesExpr__RightAssignment_1_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7745:1: ( ( rulePrefixExpr ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7746:1: ( rulePrefixExpr )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7746:1: ( rulePrefixExpr )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7747:1: rulePrefixExpr
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTimesExprAccess().getRightPrefixExprParserRuleCall_1_0_2_0()); 
            }
            pushFollow(FOLLOW_rulePrefixExpr_in_rule__TimesExpr__RightAssignment_1_0_215484);
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7756:1: rule__PrefixExpr__OpAssignment_0_1 : ( ( rule__PrefixExpr__OpAlternatives_0_1_0 ) ) ;
    public final void rule__PrefixExpr__OpAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7760:1: ( ( ( rule__PrefixExpr__OpAlternatives_0_1_0 ) ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7761:1: ( ( rule__PrefixExpr__OpAlternatives_0_1_0 ) )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7761:1: ( ( rule__PrefixExpr__OpAlternatives_0_1_0 ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7762:1: ( rule__PrefixExpr__OpAlternatives_0_1_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPrefixExprAccess().getOpAlternatives_0_1_0()); 
            }
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7763:1: ( rule__PrefixExpr__OpAlternatives_0_1_0 )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7763:2: rule__PrefixExpr__OpAlternatives_0_1_0
            {
            pushFollow(FOLLOW_rule__PrefixExpr__OpAlternatives_0_1_0_in_rule__PrefixExpr__OpAssignment_0_115515);
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7772:1: rule__PrefixExpr__ExprAssignment_0_2 : ( rulePrefixExpr ) ;
    public final void rule__PrefixExpr__ExprAssignment_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7776:1: ( ( rulePrefixExpr ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7777:1: ( rulePrefixExpr )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7777:1: ( rulePrefixExpr )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7778:1: rulePrefixExpr
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPrefixExprAccess().getExprPrefixExprParserRuleCall_0_2_0()); 
            }
            pushFollow(FOLLOW_rulePrefixExpr_in_rule__PrefixExpr__ExprAssignment_0_215548);
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


    // $ANTLR start "rule__ProjectionExpr__FieldAssignment_1_0_2"
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7787:1: rule__ProjectionExpr__FieldAssignment_1_0_2 : ( RULE_ID ) ;
    public final void rule__ProjectionExpr__FieldAssignment_1_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7791:1: ( ( RULE_ID ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7792:1: ( RULE_ID )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7792:1: ( RULE_ID )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7793:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProjectionExprAccess().getFieldIDTerminalRuleCall_1_0_2_0()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__ProjectionExpr__FieldAssignment_1_0_215579); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getProjectionExprAccess().getFieldIDTerminalRuleCall_1_0_2_0()); 
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
    // $ANTLR end "rule__ProjectionExpr__FieldAssignment_1_0_2"


    // $ANTLR start "rule__AtomicExpr__IdAssignment_0_1"
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7802:1: rule__AtomicExpr__IdAssignment_0_1 : ( ( RULE_ID ) ) ;
    public final void rule__AtomicExpr__IdAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7806:1: ( ( ( RULE_ID ) ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7807:1: ( ( RULE_ID ) )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7807:1: ( ( RULE_ID ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7808:1: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAtomicExprAccess().getIdIdRefCrossReference_0_1_0()); 
            }
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7809:1: ( RULE_ID )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7810:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAtomicExprAccess().getIdIdRefIDTerminalRuleCall_0_1_0_1()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__AtomicExpr__IdAssignment_0_115614); if (state.failed) return ;
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7821:1: rule__AtomicExpr__ValAssignment_1_1 : ( RULE_INT ) ;
    public final void rule__AtomicExpr__ValAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7825:1: ( ( RULE_INT ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7826:1: ( RULE_INT )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7826:1: ( RULE_INT )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7827:1: RULE_INT
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAtomicExprAccess().getValINTTerminalRuleCall_1_1_0()); 
            }
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__AtomicExpr__ValAssignment_1_115649); if (state.failed) return ;
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7836:1: rule__AtomicExpr__ValAssignment_2_1 : ( ruleREAL ) ;
    public final void rule__AtomicExpr__ValAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7840:1: ( ( ruleREAL ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7841:1: ( ruleREAL )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7841:1: ( ruleREAL )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7842:1: ruleREAL
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAtomicExprAccess().getValREALParserRuleCall_2_1_0()); 
            }
            pushFollow(FOLLOW_ruleREAL_in_rule__AtomicExpr__ValAssignment_2_115680);
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7851:1: rule__AtomicExpr__ValAssignment_3_1 : ( RULE_BOOL ) ;
    public final void rule__AtomicExpr__ValAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7855:1: ( ( RULE_BOOL ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7856:1: ( RULE_BOOL )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7856:1: ( RULE_BOOL )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7857:1: RULE_BOOL
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAtomicExprAccess().getValBOOLTerminalRuleCall_3_1_0()); 
            }
            match(input,RULE_BOOL,FOLLOW_RULE_BOOL_in_rule__AtomicExpr__ValAssignment_3_115711); if (state.failed) return ;
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7866:1: rule__AtomicExpr__CondAssignment_4_2 : ( ruleExpr ) ;
    public final void rule__AtomicExpr__CondAssignment_4_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7870:1: ( ( ruleExpr ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7871:1: ( ruleExpr )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7871:1: ( ruleExpr )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7872:1: ruleExpr
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAtomicExprAccess().getCondExprParserRuleCall_4_2_0()); 
            }
            pushFollow(FOLLOW_ruleExpr_in_rule__AtomicExpr__CondAssignment_4_215742);
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7881:1: rule__AtomicExpr__ThenAssignment_4_4 : ( ruleExpr ) ;
    public final void rule__AtomicExpr__ThenAssignment_4_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7885:1: ( ( ruleExpr ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7886:1: ( ruleExpr )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7886:1: ( ruleExpr )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7887:1: ruleExpr
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAtomicExprAccess().getThenExprParserRuleCall_4_4_0()); 
            }
            pushFollow(FOLLOW_ruleExpr_in_rule__AtomicExpr__ThenAssignment_4_415773);
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7896:1: rule__AtomicExpr__ElseAssignment_4_6 : ( ruleExpr ) ;
    public final void rule__AtomicExpr__ElseAssignment_4_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7900:1: ( ( ruleExpr ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7901:1: ( ruleExpr )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7901:1: ( ruleExpr )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7902:1: ruleExpr
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAtomicExprAccess().getElseExprParserRuleCall_4_6_0()); 
            }
            pushFollow(FOLLOW_ruleExpr_in_rule__AtomicExpr__ElseAssignment_4_615804);
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7911:1: rule__AtomicExpr__NodeAssignment_5_1 : ( ( RULE_ID ) ) ;
    public final void rule__AtomicExpr__NodeAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7915:1: ( ( ( RULE_ID ) ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7916:1: ( ( RULE_ID ) )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7916:1: ( ( RULE_ID ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7917:1: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAtomicExprAccess().getNodeNodeCrossReference_5_1_0()); 
            }
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7918:1: ( RULE_ID )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7919:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAtomicExprAccess().getNodeNodeIDTerminalRuleCall_5_1_0_1()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__AtomicExpr__NodeAssignment_5_115839); if (state.failed) return ;
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7930:1: rule__AtomicExpr__ArgsAssignment_5_3_0 : ( ruleExpr ) ;
    public final void rule__AtomicExpr__ArgsAssignment_5_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7934:1: ( ( ruleExpr ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7935:1: ( ruleExpr )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7935:1: ( ruleExpr )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7936:1: ruleExpr
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAtomicExprAccess().getArgsExprParserRuleCall_5_3_0_0()); 
            }
            pushFollow(FOLLOW_ruleExpr_in_rule__AtomicExpr__ArgsAssignment_5_3_015874);
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7945:1: rule__AtomicExpr__ArgsAssignment_5_3_1_1 : ( ruleExpr ) ;
    public final void rule__AtomicExpr__ArgsAssignment_5_3_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7949:1: ( ( ruleExpr ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7950:1: ( ruleExpr )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7950:1: ( ruleExpr )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7951:1: ruleExpr
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAtomicExprAccess().getArgsExprParserRuleCall_5_3_1_1_0()); 
            }
            pushFollow(FOLLOW_ruleExpr_in_rule__AtomicExpr__ArgsAssignment_5_3_1_115905);
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7960:1: rule__AtomicExpr__IdAssignment_6_1 : ( ( RULE_ID ) ) ;
    public final void rule__AtomicExpr__IdAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7964:1: ( ( ( RULE_ID ) ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7965:1: ( ( RULE_ID ) )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7965:1: ( ( RULE_ID ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7966:1: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAtomicExprAccess().getIdTypedefCrossReference_6_1_0()); 
            }
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7967:1: ( RULE_ID )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7968:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAtomicExprAccess().getIdTypedefIDTerminalRuleCall_6_1_0_1()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__AtomicExpr__IdAssignment_6_115940); if (state.failed) return ;
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7979:1: rule__AtomicExpr__FieldsAssignment_6_3 : ( RULE_ID ) ;
    public final void rule__AtomicExpr__FieldsAssignment_6_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7983:1: ( ( RULE_ID ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7984:1: ( RULE_ID )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7984:1: ( RULE_ID )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7985:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAtomicExprAccess().getFieldsIDTerminalRuleCall_6_3_0()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__AtomicExpr__FieldsAssignment_6_315975); if (state.failed) return ;
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7994:1: rule__AtomicExpr__ExprsAssignment_6_5 : ( ruleExpr ) ;
    public final void rule__AtomicExpr__ExprsAssignment_6_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7998:1: ( ( ruleExpr ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7999:1: ( ruleExpr )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7999:1: ( ruleExpr )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:8000:1: ruleExpr
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAtomicExprAccess().getExprsExprParserRuleCall_6_5_0()); 
            }
            pushFollow(FOLLOW_ruleExpr_in_rule__AtomicExpr__ExprsAssignment_6_516006);
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:8009:1: rule__AtomicExpr__FieldsAssignment_6_6_1 : ( RULE_ID ) ;
    public final void rule__AtomicExpr__FieldsAssignment_6_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:8013:1: ( ( RULE_ID ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:8014:1: ( RULE_ID )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:8014:1: ( RULE_ID )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:8015:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAtomicExprAccess().getFieldsIDTerminalRuleCall_6_6_1_0()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__AtomicExpr__FieldsAssignment_6_6_116037); if (state.failed) return ;
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:8024:1: rule__AtomicExpr__ExprsAssignment_6_6_3 : ( ruleExpr ) ;
    public final void rule__AtomicExpr__ExprsAssignment_6_6_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:8028:1: ( ( ruleExpr ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:8029:1: ( ruleExpr )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:8029:1: ( ruleExpr )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:8030:1: ruleExpr
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAtomicExprAccess().getExprsExprParserRuleCall_6_6_3_0()); 
            }
            pushFollow(FOLLOW_ruleExpr_in_rule__AtomicExpr__ExprsAssignment_6_6_316068);
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

    // $ANTLR start synpred45_InternalJKind
    public final void synpred45_InternalJKind_fragment() throws RecognitionException {   
        // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4130:2: ( rule__ArrowExpr__Group_1__0 )
        // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4130:2: rule__ArrowExpr__Group_1__0
        {
        pushFollow(FOLLOW_rule__ArrowExpr__Group_1__0_in_synpred45_InternalJKind8328);
        rule__ArrowExpr__Group_1__0();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred45_InternalJKind

    // $ANTLR start synpred46_InternalJKind
    public final void synpred46_InternalJKind_fragment() throws RecognitionException {   
        // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4315:2: ( rule__ImpliesExpr__Group_1__0 )
        // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4315:2: rule__ImpliesExpr__Group_1__0
        {
        pushFollow(FOLLOW_rule__ImpliesExpr__Group_1__0_in_synpred46_InternalJKind8692);
        rule__ImpliesExpr__Group_1__0();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred46_InternalJKind

    // $ANTLR start synpred47_InternalJKind
    public final void synpred47_InternalJKind_fragment() throws RecognitionException {   
        // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4500:2: ( rule__OrExpr__Group_1__0 )
        // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4500:2: rule__OrExpr__Group_1__0
        {
        pushFollow(FOLLOW_rule__OrExpr__Group_1__0_in_synpred47_InternalJKind9056);
        rule__OrExpr__Group_1__0();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred47_InternalJKind

    // $ANTLR start synpred48_InternalJKind
    public final void synpred48_InternalJKind_fragment() throws RecognitionException {   
        // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4685:2: ( rule__AndExpr__Group_1__0 )
        // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4685:2: rule__AndExpr__Group_1__0
        {
        pushFollow(FOLLOW_rule__AndExpr__Group_1__0_in_synpred48_InternalJKind9420);
        rule__AndExpr__Group_1__0();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred48_InternalJKind

    // $ANTLR start synpred49_InternalJKind
    public final void synpred49_InternalJKind_fragment() throws RecognitionException {   
        // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4870:2: ( rule__RelationalExpr__Group_1__0 )
        // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4870:2: rule__RelationalExpr__Group_1__0
        {
        pushFollow(FOLLOW_rule__RelationalExpr__Group_1__0_in_synpred49_InternalJKind9784);
        rule__RelationalExpr__Group_1__0();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred49_InternalJKind

    // $ANTLR start synpred50_InternalJKind
    public final void synpred50_InternalJKind_fragment() throws RecognitionException {   
        // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5055:2: ( rule__PlusExpr__Group_1__0 )
        // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5055:2: rule__PlusExpr__Group_1__0
        {
        pushFollow(FOLLOW_rule__PlusExpr__Group_1__0_in_synpred50_InternalJKind10148);
        rule__PlusExpr__Group_1__0();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred50_InternalJKind

    // $ANTLR start synpred51_InternalJKind
    public final void synpred51_InternalJKind_fragment() throws RecognitionException {   
        // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5240:2: ( rule__TimesExpr__Group_1__0 )
        // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5240:2: rule__TimesExpr__Group_1__0
        {
        pushFollow(FOLLOW_rule__TimesExpr__Group_1__0_in_synpred51_InternalJKind10512);
        rule__TimesExpr__Group_1__0();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred51_InternalJKind

    // $ANTLR start synpred52_InternalJKind
    public final void synpred52_InternalJKind_fragment() throws RecognitionException {   
        // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5519:2: ( rule__ProjectionExpr__Group_1__0 )
        // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5519:2: rule__ProjectionExpr__Group_1__0
        {
        pushFollow(FOLLOW_rule__ProjectionExpr__Group_1__0_in_synpred52_InternalJKind11060);
        rule__ProjectionExpr__Group_1__0();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred52_InternalJKind

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
    public final boolean synpred51_InternalJKind() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred51_InternalJKind_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred52_InternalJKind() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred52_InternalJKind_fragment(); // can never throw exception
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
        "\14\uffff";
    static final String DFA12_eofS =
        "\1\uffff\1\10\1\11\11\uffff";
    static final String DFA12_minS =
        "\1\4\2\14\7\uffff\1\4\1\uffff";
    static final String DFA12_maxS =
        "\1\65\2\72\7\uffff\1\5\1\uffff";
    static final String DFA12_acceptS =
        "\3\uffff\1\4\1\5\1\10\1\6\1\7\1\1\1\2\1\uffff\1\3";
    static final String DFA12_specialS =
        "\14\uffff}>";
    static final String[] DFA12_transitionS = {
            "\1\2\1\1\1\3\44\uffff\1\5\11\uffff\1\4",
            "\15\10\3\uffff\1\10\1\uffff\1\7\1\uffff\1\10\5\uffff\1\10"+
            "\4\uffff\1\6\1\10\7\uffff\1\10\1\uffff\5\10",
            "\15\11\3\uffff\1\11\3\uffff\1\11\5\uffff\1\11\5\uffff\1\11"+
            "\7\uffff\1\12\1\uffff\5\11",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\13\1\11",
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
            return "1087:1: rule__AtomicExpr__Alternatives : ( ( ( rule__AtomicExpr__Group_0__0 ) ) | ( ( rule__AtomicExpr__Group_1__0 ) ) | ( ( rule__AtomicExpr__Group_2__0 ) ) | ( ( rule__AtomicExpr__Group_3__0 ) ) | ( ( rule__AtomicExpr__Group_4__0 ) ) | ( ( rule__AtomicExpr__Group_5__0 ) ) | ( ( rule__AtomicExpr__Group_6__0 ) ) | ( ( rule__AtomicExpr__Group_7__0 ) ) );";
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
    public static final BitSet FOLLOW_ruleNode_in_entryRuleNode428 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNode435 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Node__Group__0_in_ruleNode461 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariableGroup_in_entryRuleVariableGroup488 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVariableGroup495 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VariableGroup__Group__0_in_ruleVariableGroup521 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariable_in_entryRuleVariable548 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVariable555 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Variable__NameAssignment_in_ruleVariable581 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEquation_in_entryRuleEquation608 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEquation615 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Equation__Group__0_in_ruleEquation641 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProperty_in_entryRuleProperty668 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleProperty675 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Property__Group__0_in_ruleProperty701 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMain_in_entryRuleMain728 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMain735 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Main__Group__0_in_ruleMain761 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAssertion_in_entryRuleAssertion788 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAssertion795 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Assertion__Group__0_in_ruleAssertion821 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpr_in_entryRuleExpr848 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExpr855 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleArrowExpr_in_ruleExpr881 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleArrowExpr_in_entryRuleArrowExpr907 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleArrowExpr914 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ArrowExpr__Group__0_in_ruleArrowExpr940 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImpliesExpr_in_entryRuleImpliesExpr967 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleImpliesExpr974 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ImpliesExpr__Group__0_in_ruleImpliesExpr1000 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOrExpr_in_entryRuleOrExpr1027 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOrExpr1034 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OrExpr__Group__0_in_ruleOrExpr1060 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAndExpr_in_entryRuleAndExpr1087 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAndExpr1094 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AndExpr__Group__0_in_ruleAndExpr1120 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRelationalExpr_in_entryRuleRelationalExpr1147 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRelationalExpr1154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RelationalExpr__Group__0_in_ruleRelationalExpr1180 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePlusExpr_in_entryRulePlusExpr1207 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePlusExpr1214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PlusExpr__Group__0_in_rulePlusExpr1240 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTimesExpr_in_entryRuleTimesExpr1267 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTimesExpr1274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TimesExpr__Group__0_in_ruleTimesExpr1300 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrefixExpr_in_entryRulePrefixExpr1327 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePrefixExpr1334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PrefixExpr__Alternatives_in_rulePrefixExpr1360 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProjectionExpr_in_entryRuleProjectionExpr1387 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleProjectionExpr1394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ProjectionExpr__Group__0_in_ruleProjectionExpr1420 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAtomicExpr_in_entryRuleAtomicExpr1447 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAtomicExpr1454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AtomicExpr__Alternatives_in_ruleAtomicExpr1480 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleREAL_in_entryRuleREAL1509 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleREAL1516 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__REAL__Group__0_in_ruleREAL1542 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__File__TypedefsAssignment_0_in_rule__File__Alternatives1578 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__File__ConstantsAssignment_1_in_rule__File__Alternatives1596 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__File__NodesAssignment_2_in_rule__File__Alternatives1614 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TopLevelType__Group_0__0_in_rule__TopLevelType__Alternatives1647 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_rule__TopLevelType__Alternatives1665 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Type__Group_0__0_in_rule__Type__Alternatives1697 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Type__Group_1__0_in_rule__Type__Alternatives1715 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Type__Group_2__0_in_rule__Type__Alternatives1733 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Type__Group_3__0_in_rule__Type__Alternatives1751 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Type__Group_4__0_in_rule__Type__Alternatives1769 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Node__EquationsAssignment_12_0_in_rule__Node__Alternatives_121802 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Node__PropertiesAssignment_12_1_in_rule__Node__Alternatives_121820 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Node__AssertionsAssignment_12_2_in_rule__Node__Alternatives_121838 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Node__MainAssignment_12_3_in_rule__Node__Alternatives_121856 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__OrExpr__OpAlternatives_1_0_1_01890 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__OrExpr__OpAlternatives_1_0_1_01910 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__RelationalExpr__OpAlternatives_1_0_1_01945 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__RelationalExpr__OpAlternatives_1_0_1_01965 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__RelationalExpr__OpAlternatives_1_0_1_01985 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__RelationalExpr__OpAlternatives_1_0_1_02005 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__RelationalExpr__OpAlternatives_1_0_1_02025 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__RelationalExpr__OpAlternatives_1_0_1_02045 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__PlusExpr__OpAlternatives_1_0_1_02080 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__PlusExpr__OpAlternatives_1_0_1_02100 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__TimesExpr__OpAlternatives_1_0_1_02135 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__TimesExpr__OpAlternatives_1_0_1_02155 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__TimesExpr__OpAlternatives_1_0_1_02175 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PrefixExpr__Group_0__0_in_rule__PrefixExpr__Alternatives2209 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProjectionExpr_in_rule__PrefixExpr__Alternatives2227 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__PrefixExpr__OpAlternatives_0_1_02260 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__PrefixExpr__OpAlternatives_0_1_02280 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__PrefixExpr__OpAlternatives_0_1_02300 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AtomicExpr__Group_0__0_in_rule__AtomicExpr__Alternatives2334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AtomicExpr__Group_1__0_in_rule__AtomicExpr__Alternatives2352 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AtomicExpr__Group_2__0_in_rule__AtomicExpr__Alternatives2370 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AtomicExpr__Group_3__0_in_rule__AtomicExpr__Alternatives2388 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AtomicExpr__Group_4__0_in_rule__AtomicExpr__Alternatives2406 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AtomicExpr__Group_5__0_in_rule__AtomicExpr__Alternatives2424 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AtomicExpr__Group_6__0_in_rule__AtomicExpr__Alternatives2442 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AtomicExpr__Group_7__0_in_rule__AtomicExpr__Alternatives2460 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Typedef__Group__0__Impl_in_rule__Typedef__Group__02492 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Typedef__Group__1_in_rule__Typedef__Group__02495 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__Typedef__Group__0__Impl2523 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Typedef__Group__1__Impl_in_rule__Typedef__Group__12554 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_rule__Typedef__Group__2_in_rule__Typedef__Group__12557 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Typedef__NameAssignment_1_in_rule__Typedef__Group__1__Impl2584 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Typedef__Group__2__Impl_in_rule__Typedef__Group__22614 = new BitSet(new long[]{0x0000001E20000020L});
    public static final BitSet FOLLOW_rule__Typedef__Group__3_in_rule__Typedef__Group__22617 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__Typedef__Group__2__Impl2645 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Typedef__Group__3__Impl_in_rule__Typedef__Group__32676 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_rule__Typedef__Group__4_in_rule__Typedef__Group__32679 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Typedef__TypeAssignment_3_in_rule__Typedef__Group__3__Impl2706 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Typedef__Group__4__Impl_in_rule__Typedef__Group__42736 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__Typedef__Group__4__Impl2764 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TopLevelType__Group_0__0__Impl_in_rule__TopLevelType__Group_0__02805 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_rule__TopLevelType__Group_0__1_in_rule__TopLevelType__Group_0__02808 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TopLevelType__Group_0__1__Impl_in_rule__TopLevelType__Group_0__12866 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_rule__TopLevelType__Group_0__2_in_rule__TopLevelType__Group_0__12869 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__TopLevelType__Group_0__1__Impl2897 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TopLevelType__Group_0__2__Impl_in_rule__TopLevelType__Group_0__22928 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__TopLevelType__Group_0__3_in_rule__TopLevelType__Group_0__22931 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__TopLevelType__Group_0__2__Impl2959 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TopLevelType__Group_0__3__Impl_in_rule__TopLevelType__Group_0__32990 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_rule__TopLevelType__Group_0__4_in_rule__TopLevelType__Group_0__32993 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TopLevelType__FieldsAssignment_0_3_in_rule__TopLevelType__Group_0__3__Impl3020 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TopLevelType__Group_0__4__Impl_in_rule__TopLevelType__Group_0__43050 = new BitSet(new long[]{0x0000001E20000020L});
    public static final BitSet FOLLOW_rule__TopLevelType__Group_0__5_in_rule__TopLevelType__Group_0__43053 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__TopLevelType__Group_0__4__Impl3081 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TopLevelType__Group_0__5__Impl_in_rule__TopLevelType__Group_0__53112 = new BitSet(new long[]{0x0000000110000000L});
    public static final BitSet FOLLOW_rule__TopLevelType__Group_0__6_in_rule__TopLevelType__Group_0__53115 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TopLevelType__TypesAssignment_0_5_in_rule__TopLevelType__Group_0__5__Impl3142 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TopLevelType__Group_0__6__Impl_in_rule__TopLevelType__Group_0__63172 = new BitSet(new long[]{0x0000000110000000L});
    public static final BitSet FOLLOW_rule__TopLevelType__Group_0__7_in_rule__TopLevelType__Group_0__63175 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TopLevelType__Group_0_6__0_in_rule__TopLevelType__Group_0__6__Impl3202 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_rule__TopLevelType__Group_0__7__Impl_in_rule__TopLevelType__Group_0__73233 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__TopLevelType__Group_0__7__Impl3261 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TopLevelType__Group_0_6__0__Impl_in_rule__TopLevelType__Group_0_6__03308 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__TopLevelType__Group_0_6__1_in_rule__TopLevelType__Group_0_6__03311 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__TopLevelType__Group_0_6__0__Impl3339 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TopLevelType__Group_0_6__1__Impl_in_rule__TopLevelType__Group_0_6__13370 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_rule__TopLevelType__Group_0_6__2_in_rule__TopLevelType__Group_0_6__13373 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TopLevelType__FieldsAssignment_0_6_1_in_rule__TopLevelType__Group_0_6__1__Impl3400 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TopLevelType__Group_0_6__2__Impl_in_rule__TopLevelType__Group_0_6__23430 = new BitSet(new long[]{0x0000001E20000020L});
    public static final BitSet FOLLOW_rule__TopLevelType__Group_0_6__3_in_rule__TopLevelType__Group_0_6__23433 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__TopLevelType__Group_0_6__2__Impl3461 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TopLevelType__Group_0_6__3__Impl_in_rule__TopLevelType__Group_0_6__33492 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TopLevelType__TypesAssignment_0_6_3_in_rule__TopLevelType__Group_0_6__3__Impl3519 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Type__Group_0__0__Impl_in_rule__Type__Group_0__03557 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_rule__Type__Group_0__1_in_rule__Type__Group_0__03560 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Type__Group_0__1__Impl_in_rule__Type__Group_0__13618 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__Type__Group_0__1__Impl3646 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Type__Group_1__0__Impl_in_rule__Type__Group_1__03681 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_rule__Type__Group_1__1_in_rule__Type__Group_1__03684 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Type__Group_1__1__Impl_in_rule__Type__Group_1__13742 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rule__Type__Group_1__1__Impl3770 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Type__Group_2__0__Impl_in_rule__Type__Group_2__03805 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_rule__Type__Group_2__1_in_rule__Type__Group_2__03808 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Type__Group_2__1__Impl_in_rule__Type__Group_2__13866 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rule__Type__Group_2__1__Impl3894 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Type__Group_3__0__Impl_in_rule__Type__Group_3__03929 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_rule__Type__Group_3__1_in_rule__Type__Group_3__03932 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Type__Group_3__1__Impl_in_rule__Type__Group_3__13990 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_rule__Type__Group_3__2_in_rule__Type__Group_3__13993 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_rule__Type__Group_3__1__Impl4021 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Type__Group_3__2__Impl_in_rule__Type__Group_3__24052 = new BitSet(new long[]{0x0000000000200010L});
    public static final BitSet FOLLOW_rule__Type__Group_3__3_in_rule__Type__Group_3__24055 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_rule__Type__Group_3__2__Impl4083 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Type__Group_3__3__Impl_in_rule__Type__Group_3__34114 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_rule__Type__Group_3__4_in_rule__Type__Group_3__34117 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Type__LowAssignment_3_3_in_rule__Type__Group_3__3__Impl4144 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Type__Group_3__4__Impl_in_rule__Type__Group_3__44174 = new BitSet(new long[]{0x0000000000200010L});
    public static final BitSet FOLLOW_rule__Type__Group_3__5_in_rule__Type__Group_3__44177 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_rule__Type__Group_3__4__Impl4205 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Type__Group_3__5__Impl_in_rule__Type__Group_3__54236 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_rule__Type__Group_3__6_in_rule__Type__Group_3__54239 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Type__HighAssignment_3_5_in_rule__Type__Group_3__5__Impl4266 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Type__Group_3__6__Impl_in_rule__Type__Group_3__64296 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_rule__Type__Group_3__7_in_rule__Type__Group_3__64299 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_rule__Type__Group_3__6__Impl4327 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Type__Group_3__7__Impl_in_rule__Type__Group_3__74358 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_rule__Type__Group_3__8_in_rule__Type__Group_3__74361 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_rule__Type__Group_3__7__Impl4389 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Type__Group_3__8__Impl_in_rule__Type__Group_3__84420 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__Type__Group_3__8__Impl4448 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Type__Group_4__0__Impl_in_rule__Type__Group_4__04497 = new BitSet(new long[]{0x0000001E20000020L});
    public static final BitSet FOLLOW_rule__Type__Group_4__1_in_rule__Type__Group_4__04500 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Type__Group_4__1__Impl_in_rule__Type__Group_4__14558 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Type__DefAssignment_4_1_in_rule__Type__Group_4__1__Impl4585 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Bound__Group__0__Impl_in_rule__Bound__Group__04619 = new BitSet(new long[]{0x0000000000200010L});
    public static final BitSet FOLLOW_rule__Bound__Group__1_in_rule__Bound__Group__04622 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__Bound__Group__0__Impl4651 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Bound__Group__1__Impl_in_rule__Bound__Group__14684 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__Bound__Group__1__Impl4711 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Constant__Group__0__Impl_in_rule__Constant__Group__04744 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Constant__Group__1_in_rule__Constant__Group__04747 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_rule__Constant__Group__0__Impl4775 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Constant__Group__1__Impl_in_rule__Constant__Group__14806 = new BitSet(new long[]{0x0000000080040000L});
    public static final BitSet FOLLOW_rule__Constant__Group__2_in_rule__Constant__Group__14809 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Constant__NameAssignment_1_in_rule__Constant__Group__1__Impl4836 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Constant__Group__2__Impl_in_rule__Constant__Group__24866 = new BitSet(new long[]{0x0000000080040000L});
    public static final BitSet FOLLOW_rule__Constant__Group__3_in_rule__Constant__Group__24869 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Constant__Group_2__0_in_rule__Constant__Group__2__Impl4896 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Constant__Group__3__Impl_in_rule__Constant__Group__34927 = new BitSet(new long[]{0x0020080006200070L});
    public static final BitSet FOLLOW_rule__Constant__Group__4_in_rule__Constant__Group__34930 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__Constant__Group__3__Impl4958 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Constant__Group__4__Impl_in_rule__Constant__Group__44989 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_rule__Constant__Group__5_in_rule__Constant__Group__44992 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Constant__ExprAssignment_4_in_rule__Constant__Group__4__Impl5019 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Constant__Group__5__Impl_in_rule__Constant__Group__55049 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__Constant__Group__5__Impl5077 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Constant__Group_2__0__Impl_in_rule__Constant__Group_2__05120 = new BitSet(new long[]{0x0000001E20000020L});
    public static final BitSet FOLLOW_rule__Constant__Group_2__1_in_rule__Constant__Group_2__05123 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__Constant__Group_2__0__Impl5151 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Constant__Group_2__1__Impl_in_rule__Constant__Group_2__15182 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Constant__TypeAssignment_2_1_in_rule__Constant__Group_2__1__Impl5209 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Node__Group__0__Impl_in_rule__Node__Group__05243 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Node__Group__1_in_rule__Node__Group__05246 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_rule__Node__Group__0__Impl5274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Node__Group__1__Impl_in_rule__Node__Group__15305 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_rule__Node__Group__2_in_rule__Node__Group__15308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Node__NameAssignment_1_in_rule__Node__Group__1__Impl5335 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Node__Group__2__Impl_in_rule__Node__Group__25365 = new BitSet(new long[]{0x0000100000000020L});
    public static final BitSet FOLLOW_rule__Node__Group__3_in_rule__Node__Group__25368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_rule__Node__Group__2__Impl5396 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Node__Group__3__Impl_in_rule__Node__Group__35427 = new BitSet(new long[]{0x0000100000000020L});
    public static final BitSet FOLLOW_rule__Node__Group__4_in_rule__Node__Group__35430 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Node__Group_3__0_in_rule__Node__Group__3__Impl5457 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Node__Group__4__Impl_in_rule__Node__Group__45488 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_rule__Node__Group__5_in_rule__Node__Group__45491 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_rule__Node__Group__4__Impl5519 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Node__Group__5__Impl_in_rule__Node__Group__55550 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_rule__Node__Group__6_in_rule__Node__Group__55553 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_rule__Node__Group__5__Impl5581 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Node__Group__6__Impl_in_rule__Node__Group__65612 = new BitSet(new long[]{0x0000100000000020L});
    public static final BitSet FOLLOW_rule__Node__Group__7_in_rule__Node__Group__65615 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_rule__Node__Group__6__Impl5643 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Node__Group__7__Impl_in_rule__Node__Group__75674 = new BitSet(new long[]{0x0000100000000020L});
    public static final BitSet FOLLOW_rule__Node__Group__8_in_rule__Node__Group__75677 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Node__Group_7__0_in_rule__Node__Group__7__Impl5704 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Node__Group__8__Impl_in_rule__Node__Group__85735 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_rule__Node__Group__9_in_rule__Node__Group__85738 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_rule__Node__Group__8__Impl5766 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Node__Group__9__Impl_in_rule__Node__Group__95797 = new BitSet(new long[]{0x0001400000000000L});
    public static final BitSet FOLLOW_rule__Node__Group__10_in_rule__Node__Group__95800 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__Node__Group__9__Impl5828 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Node__Group__10__Impl_in_rule__Node__Group__105859 = new BitSet(new long[]{0x0001400000000000L});
    public static final BitSet FOLLOW_rule__Node__Group__11_in_rule__Node__Group__105862 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Node__Group_10__0_in_rule__Node__Group__10__Impl5889 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Node__Group__11__Impl_in_rule__Node__Group__115920 = new BitSet(new long[]{0x000E800000000020L});
    public static final BitSet FOLLOW_rule__Node__Group__12_in_rule__Node__Group__115923 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_rule__Node__Group__11__Impl5951 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Node__Group__12__Impl_in_rule__Node__Group__125982 = new BitSet(new long[]{0x000E800000000020L});
    public static final BitSet FOLLOW_rule__Node__Group__13_in_rule__Node__Group__125985 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Node__Alternatives_12_in_rule__Node__Group__12__Impl6012 = new BitSet(new long[]{0x000E000000000022L});
    public static final BitSet FOLLOW_rule__Node__Group__13__Impl_in_rule__Node__Group__136043 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_rule__Node__Group__14_in_rule__Node__Group__136046 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_rule__Node__Group__13__Impl6074 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Node__Group__14__Impl_in_rule__Node__Group__146105 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__Node__Group__14__Impl6134 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Node__Group_3__0__Impl_in_rule__Node__Group_3__06197 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_rule__Node__Group_3__1_in_rule__Node__Group_3__06200 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Node__InputsAssignment_3_0_in_rule__Node__Group_3__0__Impl6227 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Node__Group_3__1__Impl_in_rule__Node__Group_3__16257 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Node__Group_3_1__0_in_rule__Node__Group_3__1__Impl6284 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_rule__Node__Group_3_1__0__Impl_in_rule__Node__Group_3_1__06319 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Node__Group_3_1__1_in_rule__Node__Group_3_1__06322 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__Node__Group_3_1__0__Impl6350 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Node__Group_3_1__1__Impl_in_rule__Node__Group_3_1__16381 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Node__InputsAssignment_3_1_1_in_rule__Node__Group_3_1__1__Impl6408 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Node__Group_7__0__Impl_in_rule__Node__Group_7__06442 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_rule__Node__Group_7__1_in_rule__Node__Group_7__06445 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Node__OutputsAssignment_7_0_in_rule__Node__Group_7__0__Impl6472 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Node__Group_7__1__Impl_in_rule__Node__Group_7__16502 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Node__Group_7_1__0_in_rule__Node__Group_7__1__Impl6529 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_rule__Node__Group_7_1__0__Impl_in_rule__Node__Group_7_1__06564 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Node__Group_7_1__1_in_rule__Node__Group_7_1__06567 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__Node__Group_7_1__0__Impl6595 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Node__Group_7_1__1__Impl_in_rule__Node__Group_7_1__16626 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Node__OutputsAssignment_7_1_1_in_rule__Node__Group_7_1__1__Impl6653 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Node__Group_10__0__Impl_in_rule__Node__Group_10__06687 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Node__Group_10__1_in_rule__Node__Group_10__06690 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_rule__Node__Group_10__0__Impl6718 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Node__Group_10__1__Impl_in_rule__Node__Group_10__16749 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Node__Group_10_1__0_in_rule__Node__Group_10__1__Impl6776 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_rule__Node__Group_10_1__0__Impl_in_rule__Node__Group_10_1__06811 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_rule__Node__Group_10_1__1_in_rule__Node__Group_10_1__06814 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Node__LocalsAssignment_10_1_0_in_rule__Node__Group_10_1__0__Impl6841 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Node__Group_10_1__1__Impl_in_rule__Node__Group_10_1__16871 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__Node__Group_10_1__1__Impl6899 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VariableGroup__Group__0__Impl_in_rule__VariableGroup__Group__06934 = new BitSet(new long[]{0x0000004080000000L});
    public static final BitSet FOLLOW_rule__VariableGroup__Group__1_in_rule__VariableGroup__Group__06937 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VariableGroup__VariablesAssignment_0_in_rule__VariableGroup__Group__0__Impl6964 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VariableGroup__Group__1__Impl_in_rule__VariableGroup__Group__16994 = new BitSet(new long[]{0x0000004080000000L});
    public static final BitSet FOLLOW_rule__VariableGroup__Group__2_in_rule__VariableGroup__Group__16997 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VariableGroup__Group_1__0_in_rule__VariableGroup__Group__1__Impl7024 = new BitSet(new long[]{0x0000004000000002L});
    public static final BitSet FOLLOW_rule__VariableGroup__Group__2__Impl_in_rule__VariableGroup__Group__27055 = new BitSet(new long[]{0x0000001E20000020L});
    public static final BitSet FOLLOW_rule__VariableGroup__Group__3_in_rule__VariableGroup__Group__27058 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__VariableGroup__Group__2__Impl7086 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VariableGroup__Group__3__Impl_in_rule__VariableGroup__Group__37117 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VariableGroup__TypeAssignment_3_in_rule__VariableGroup__Group__3__Impl7144 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VariableGroup__Group_1__0__Impl_in_rule__VariableGroup__Group_1__07182 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__VariableGroup__Group_1__1_in_rule__VariableGroup__Group_1__07185 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_rule__VariableGroup__Group_1__0__Impl7213 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VariableGroup__Group_1__1__Impl_in_rule__VariableGroup__Group_1__17244 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VariableGroup__VariablesAssignment_1_1_in_rule__VariableGroup__Group_1__1__Impl7271 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Equation__Group__0__Impl_in_rule__Equation__Group__07305 = new BitSet(new long[]{0x0000004000040000L});
    public static final BitSet FOLLOW_rule__Equation__Group__1_in_rule__Equation__Group__07308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Equation__LhsAssignment_0_in_rule__Equation__Group__0__Impl7335 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Equation__Group__1__Impl_in_rule__Equation__Group__17365 = new BitSet(new long[]{0x0000004000040000L});
    public static final BitSet FOLLOW_rule__Equation__Group__2_in_rule__Equation__Group__17368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Equation__Group_1__0_in_rule__Equation__Group__1__Impl7395 = new BitSet(new long[]{0x0000004000000002L});
    public static final BitSet FOLLOW_rule__Equation__Group__2__Impl_in_rule__Equation__Group__27426 = new BitSet(new long[]{0x0020080006200070L});
    public static final BitSet FOLLOW_rule__Equation__Group__3_in_rule__Equation__Group__27429 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__Equation__Group__2__Impl7457 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Equation__Group__3__Impl_in_rule__Equation__Group__37488 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_rule__Equation__Group__4_in_rule__Equation__Group__37491 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Equation__RhsAssignment_3_in_rule__Equation__Group__3__Impl7518 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Equation__Group__4__Impl_in_rule__Equation__Group__47548 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__Equation__Group__4__Impl7576 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Equation__Group_1__0__Impl_in_rule__Equation__Group_1__07617 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Equation__Group_1__1_in_rule__Equation__Group_1__07620 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_rule__Equation__Group_1__0__Impl7648 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Equation__Group_1__1__Impl_in_rule__Equation__Group_1__17679 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Equation__LhsAssignment_1_1_in_rule__Equation__Group_1__1__Impl7706 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Property__Group__0__Impl_in_rule__Property__Group__07740 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Property__Group__1_in_rule__Property__Group__07743 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_rule__Property__Group__0__Impl7771 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Property__Group__1__Impl_in_rule__Property__Group__17802 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_rule__Property__Group__2_in_rule__Property__Group__17805 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Property__RefAssignment_1_in_rule__Property__Group__1__Impl7832 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Property__Group__2__Impl_in_rule__Property__Group__27862 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__Property__Group__2__Impl7890 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Main__Group__0__Impl_in_rule__Main__Group__07927 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_rule__Main__Group__1_in_rule__Main__Group__07930 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_rule__Main__Group__0__Impl7958 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Main__Group__1__Impl_in_rule__Main__Group__17989 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__Main__Group__1__Impl8018 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Assertion__Group__0__Impl_in_rule__Assertion__Group__08055 = new BitSet(new long[]{0x0020080006200070L});
    public static final BitSet FOLLOW_rule__Assertion__Group__1_in_rule__Assertion__Group__08058 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_rule__Assertion__Group__0__Impl8086 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Assertion__Group__1__Impl_in_rule__Assertion__Group__18117 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_rule__Assertion__Group__2_in_rule__Assertion__Group__18120 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Assertion__ExprAssignment_1_in_rule__Assertion__Group__1__Impl8147 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Assertion__Group__2__Impl_in_rule__Assertion__Group__28177 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__Assertion__Group__2__Impl8205 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ArrowExpr__Group__0__Impl_in_rule__ArrowExpr__Group__08242 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_rule__ArrowExpr__Group__1_in_rule__ArrowExpr__Group__08245 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImpliesExpr_in_rule__ArrowExpr__Group__0__Impl8272 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ArrowExpr__Group__1__Impl_in_rule__ArrowExpr__Group__18301 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ArrowExpr__Group_1__0_in_rule__ArrowExpr__Group__1__Impl8328 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ArrowExpr__Group_1__0__Impl_in_rule__ArrowExpr__Group_1__08363 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ArrowExpr__Group_1_0__0_in_rule__ArrowExpr__Group_1__0__Impl8390 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ArrowExpr__Group_1_0__0__Impl_in_rule__ArrowExpr__Group_1_0__08422 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_rule__ArrowExpr__Group_1_0__1_in_rule__ArrowExpr__Group_1_0__08425 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ArrowExpr__Group_1_0__1__Impl_in_rule__ArrowExpr__Group_1_0__18483 = new BitSet(new long[]{0x0020080006200070L});
    public static final BitSet FOLLOW_rule__ArrowExpr__Group_1_0__2_in_rule__ArrowExpr__Group_1_0__18486 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ArrowExpr__OpAssignment_1_0_1_in_rule__ArrowExpr__Group_1_0__1__Impl8513 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ArrowExpr__Group_1_0__2__Impl_in_rule__ArrowExpr__Group_1_0__28543 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ArrowExpr__RightAssignment_1_0_2_in_rule__ArrowExpr__Group_1_0__2__Impl8570 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ImpliesExpr__Group__0__Impl_in_rule__ImpliesExpr__Group__08606 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_rule__ImpliesExpr__Group__1_in_rule__ImpliesExpr__Group__08609 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOrExpr_in_rule__ImpliesExpr__Group__0__Impl8636 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ImpliesExpr__Group__1__Impl_in_rule__ImpliesExpr__Group__18665 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ImpliesExpr__Group_1__0_in_rule__ImpliesExpr__Group__1__Impl8692 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ImpliesExpr__Group_1__0__Impl_in_rule__ImpliesExpr__Group_1__08727 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ImpliesExpr__Group_1_0__0_in_rule__ImpliesExpr__Group_1__0__Impl8754 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ImpliesExpr__Group_1_0__0__Impl_in_rule__ImpliesExpr__Group_1_0__08786 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_rule__ImpliesExpr__Group_1_0__1_in_rule__ImpliesExpr__Group_1_0__08789 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ImpliesExpr__Group_1_0__1__Impl_in_rule__ImpliesExpr__Group_1_0__18847 = new BitSet(new long[]{0x0020080006200070L});
    public static final BitSet FOLLOW_rule__ImpliesExpr__Group_1_0__2_in_rule__ImpliesExpr__Group_1_0__18850 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ImpliesExpr__OpAssignment_1_0_1_in_rule__ImpliesExpr__Group_1_0__1__Impl8877 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ImpliesExpr__Group_1_0__2__Impl_in_rule__ImpliesExpr__Group_1_0__28907 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ImpliesExpr__RightAssignment_1_0_2_in_rule__ImpliesExpr__Group_1_0__2__Impl8934 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OrExpr__Group__0__Impl_in_rule__OrExpr__Group__08970 = new BitSet(new long[]{0x0000000000003000L});
    public static final BitSet FOLLOW_rule__OrExpr__Group__1_in_rule__OrExpr__Group__08973 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAndExpr_in_rule__OrExpr__Group__0__Impl9000 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OrExpr__Group__1__Impl_in_rule__OrExpr__Group__19029 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OrExpr__Group_1__0_in_rule__OrExpr__Group__1__Impl9056 = new BitSet(new long[]{0x0000000000003002L});
    public static final BitSet FOLLOW_rule__OrExpr__Group_1__0__Impl_in_rule__OrExpr__Group_1__09091 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OrExpr__Group_1_0__0_in_rule__OrExpr__Group_1__0__Impl9118 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OrExpr__Group_1_0__0__Impl_in_rule__OrExpr__Group_1_0__09150 = new BitSet(new long[]{0x0000000000003000L});
    public static final BitSet FOLLOW_rule__OrExpr__Group_1_0__1_in_rule__OrExpr__Group_1_0__09153 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OrExpr__Group_1_0__1__Impl_in_rule__OrExpr__Group_1_0__19211 = new BitSet(new long[]{0x0020080006200070L});
    public static final BitSet FOLLOW_rule__OrExpr__Group_1_0__2_in_rule__OrExpr__Group_1_0__19214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OrExpr__OpAssignment_1_0_1_in_rule__OrExpr__Group_1_0__1__Impl9241 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OrExpr__Group_1_0__2__Impl_in_rule__OrExpr__Group_1_0__29271 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OrExpr__RightAssignment_1_0_2_in_rule__OrExpr__Group_1_0__2__Impl9298 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AndExpr__Group__0__Impl_in_rule__AndExpr__Group__09334 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_rule__AndExpr__Group__1_in_rule__AndExpr__Group__09337 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRelationalExpr_in_rule__AndExpr__Group__0__Impl9364 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AndExpr__Group__1__Impl_in_rule__AndExpr__Group__19393 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AndExpr__Group_1__0_in_rule__AndExpr__Group__1__Impl9420 = new BitSet(new long[]{0x0400000000000002L});
    public static final BitSet FOLLOW_rule__AndExpr__Group_1__0__Impl_in_rule__AndExpr__Group_1__09455 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AndExpr__Group_1_0__0_in_rule__AndExpr__Group_1__0__Impl9482 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AndExpr__Group_1_0__0__Impl_in_rule__AndExpr__Group_1_0__09514 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_rule__AndExpr__Group_1_0__1_in_rule__AndExpr__Group_1_0__09517 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AndExpr__Group_1_0__1__Impl_in_rule__AndExpr__Group_1_0__19575 = new BitSet(new long[]{0x0020080006200070L});
    public static final BitSet FOLLOW_rule__AndExpr__Group_1_0__2_in_rule__AndExpr__Group_1_0__19578 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AndExpr__OpAssignment_1_0_1_in_rule__AndExpr__Group_1_0__1__Impl9605 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AndExpr__Group_1_0__2__Impl_in_rule__AndExpr__Group_1_0__29635 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AndExpr__RightAssignment_1_0_2_in_rule__AndExpr__Group_1_0__2__Impl9662 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RelationalExpr__Group__0__Impl_in_rule__RelationalExpr__Group__09698 = new BitSet(new long[]{0x00000000000FC000L});
    public static final BitSet FOLLOW_rule__RelationalExpr__Group__1_in_rule__RelationalExpr__Group__09701 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePlusExpr_in_rule__RelationalExpr__Group__0__Impl9728 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RelationalExpr__Group__1__Impl_in_rule__RelationalExpr__Group__19757 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RelationalExpr__Group_1__0_in_rule__RelationalExpr__Group__1__Impl9784 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RelationalExpr__Group_1__0__Impl_in_rule__RelationalExpr__Group_1__09819 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RelationalExpr__Group_1_0__0_in_rule__RelationalExpr__Group_1__0__Impl9846 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RelationalExpr__Group_1_0__0__Impl_in_rule__RelationalExpr__Group_1_0__09878 = new BitSet(new long[]{0x00000000000FC000L});
    public static final BitSet FOLLOW_rule__RelationalExpr__Group_1_0__1_in_rule__RelationalExpr__Group_1_0__09881 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RelationalExpr__Group_1_0__1__Impl_in_rule__RelationalExpr__Group_1_0__19939 = new BitSet(new long[]{0x0020080006200070L});
    public static final BitSet FOLLOW_rule__RelationalExpr__Group_1_0__2_in_rule__RelationalExpr__Group_1_0__19942 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RelationalExpr__OpAssignment_1_0_1_in_rule__RelationalExpr__Group_1_0__1__Impl9969 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RelationalExpr__Group_1_0__2__Impl_in_rule__RelationalExpr__Group_1_0__29999 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RelationalExpr__RightAssignment_1_0_2_in_rule__RelationalExpr__Group_1_0__2__Impl10026 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PlusExpr__Group__0__Impl_in_rule__PlusExpr__Group__010062 = new BitSet(new long[]{0x0000000000300000L});
    public static final BitSet FOLLOW_rule__PlusExpr__Group__1_in_rule__PlusExpr__Group__010065 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTimesExpr_in_rule__PlusExpr__Group__0__Impl10092 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PlusExpr__Group__1__Impl_in_rule__PlusExpr__Group__110121 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PlusExpr__Group_1__0_in_rule__PlusExpr__Group__1__Impl10148 = new BitSet(new long[]{0x0000000000300002L});
    public static final BitSet FOLLOW_rule__PlusExpr__Group_1__0__Impl_in_rule__PlusExpr__Group_1__010183 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PlusExpr__Group_1_0__0_in_rule__PlusExpr__Group_1__0__Impl10210 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PlusExpr__Group_1_0__0__Impl_in_rule__PlusExpr__Group_1_0__010242 = new BitSet(new long[]{0x0000000000300000L});
    public static final BitSet FOLLOW_rule__PlusExpr__Group_1_0__1_in_rule__PlusExpr__Group_1_0__010245 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PlusExpr__Group_1_0__1__Impl_in_rule__PlusExpr__Group_1_0__110303 = new BitSet(new long[]{0x0020080006200070L});
    public static final BitSet FOLLOW_rule__PlusExpr__Group_1_0__2_in_rule__PlusExpr__Group_1_0__110306 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PlusExpr__OpAssignment_1_0_1_in_rule__PlusExpr__Group_1_0__1__Impl10333 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PlusExpr__Group_1_0__2__Impl_in_rule__PlusExpr__Group_1_0__210363 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PlusExpr__RightAssignment_1_0_2_in_rule__PlusExpr__Group_1_0__2__Impl10390 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TimesExpr__Group__0__Impl_in_rule__TimesExpr__Group__010426 = new BitSet(new long[]{0x0000000001C00000L});
    public static final BitSet FOLLOW_rule__TimesExpr__Group__1_in_rule__TimesExpr__Group__010429 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrefixExpr_in_rule__TimesExpr__Group__0__Impl10456 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TimesExpr__Group__1__Impl_in_rule__TimesExpr__Group__110485 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TimesExpr__Group_1__0_in_rule__TimesExpr__Group__1__Impl10512 = new BitSet(new long[]{0x0000000001C00002L});
    public static final BitSet FOLLOW_rule__TimesExpr__Group_1__0__Impl_in_rule__TimesExpr__Group_1__010547 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TimesExpr__Group_1_0__0_in_rule__TimesExpr__Group_1__0__Impl10574 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TimesExpr__Group_1_0__0__Impl_in_rule__TimesExpr__Group_1_0__010606 = new BitSet(new long[]{0x0000000001C00000L});
    public static final BitSet FOLLOW_rule__TimesExpr__Group_1_0__1_in_rule__TimesExpr__Group_1_0__010609 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TimesExpr__Group_1_0__1__Impl_in_rule__TimesExpr__Group_1_0__110667 = new BitSet(new long[]{0x0020080006200070L});
    public static final BitSet FOLLOW_rule__TimesExpr__Group_1_0__2_in_rule__TimesExpr__Group_1_0__110670 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TimesExpr__OpAssignment_1_0_1_in_rule__TimesExpr__Group_1_0__1__Impl10697 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TimesExpr__Group_1_0__2__Impl_in_rule__TimesExpr__Group_1_0__210727 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TimesExpr__RightAssignment_1_0_2_in_rule__TimesExpr__Group_1_0__2__Impl10754 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PrefixExpr__Group_0__0__Impl_in_rule__PrefixExpr__Group_0__010790 = new BitSet(new long[]{0x0000000006200000L});
    public static final BitSet FOLLOW_rule__PrefixExpr__Group_0__1_in_rule__PrefixExpr__Group_0__010793 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PrefixExpr__Group_0__1__Impl_in_rule__PrefixExpr__Group_0__110851 = new BitSet(new long[]{0x0020080006200070L});
    public static final BitSet FOLLOW_rule__PrefixExpr__Group_0__2_in_rule__PrefixExpr__Group_0__110854 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PrefixExpr__OpAssignment_0_1_in_rule__PrefixExpr__Group_0__1__Impl10881 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PrefixExpr__Group_0__2__Impl_in_rule__PrefixExpr__Group_0__210911 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PrefixExpr__ExprAssignment_0_2_in_rule__PrefixExpr__Group_0__2__Impl10938 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ProjectionExpr__Group__0__Impl_in_rule__ProjectionExpr__Group__010974 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_rule__ProjectionExpr__Group__1_in_rule__ProjectionExpr__Group__010977 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAtomicExpr_in_rule__ProjectionExpr__Group__0__Impl11004 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ProjectionExpr__Group__1__Impl_in_rule__ProjectionExpr__Group__111033 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ProjectionExpr__Group_1__0_in_rule__ProjectionExpr__Group__1__Impl11060 = new BitSet(new long[]{0x0010000000000002L});
    public static final BitSet FOLLOW_rule__ProjectionExpr__Group_1__0__Impl_in_rule__ProjectionExpr__Group_1__011095 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ProjectionExpr__Group_1_0__0_in_rule__ProjectionExpr__Group_1__0__Impl11122 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ProjectionExpr__Group_1_0__0__Impl_in_rule__ProjectionExpr__Group_1_0__011154 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_rule__ProjectionExpr__Group_1_0__1_in_rule__ProjectionExpr__Group_1_0__011157 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ProjectionExpr__Group_1_0__1__Impl_in_rule__ProjectionExpr__Group_1_0__111215 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__ProjectionExpr__Group_1_0__2_in_rule__ProjectionExpr__Group_1_0__111218 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_rule__ProjectionExpr__Group_1_0__1__Impl11246 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ProjectionExpr__Group_1_0__2__Impl_in_rule__ProjectionExpr__Group_1_0__211277 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ProjectionExpr__FieldAssignment_1_0_2_in_rule__ProjectionExpr__Group_1_0__2__Impl11304 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AtomicExpr__Group_0__0__Impl_in_rule__AtomicExpr__Group_0__011340 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__AtomicExpr__Group_0__1_in_rule__AtomicExpr__Group_0__011343 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AtomicExpr__Group_0__1__Impl_in_rule__AtomicExpr__Group_0__111401 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AtomicExpr__IdAssignment_0_1_in_rule__AtomicExpr__Group_0__1__Impl11428 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AtomicExpr__Group_1__0__Impl_in_rule__AtomicExpr__Group_1__011462 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__AtomicExpr__Group_1__1_in_rule__AtomicExpr__Group_1__011465 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AtomicExpr__Group_1__1__Impl_in_rule__AtomicExpr__Group_1__111523 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AtomicExpr__ValAssignment_1_1_in_rule__AtomicExpr__Group_1__1__Impl11550 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AtomicExpr__Group_2__0__Impl_in_rule__AtomicExpr__Group_2__011584 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__AtomicExpr__Group_2__1_in_rule__AtomicExpr__Group_2__011587 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AtomicExpr__Group_2__1__Impl_in_rule__AtomicExpr__Group_2__111645 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AtomicExpr__ValAssignment_2_1_in_rule__AtomicExpr__Group_2__1__Impl11672 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AtomicExpr__Group_3__0__Impl_in_rule__AtomicExpr__Group_3__011706 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__AtomicExpr__Group_3__1_in_rule__AtomicExpr__Group_3__011709 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AtomicExpr__Group_3__1__Impl_in_rule__AtomicExpr__Group_3__111767 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AtomicExpr__ValAssignment_3_1_in_rule__AtomicExpr__Group_3__1__Impl11794 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AtomicExpr__Group_4__0__Impl_in_rule__AtomicExpr__Group_4__011828 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_rule__AtomicExpr__Group_4__1_in_rule__AtomicExpr__Group_4__011831 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AtomicExpr__Group_4__1__Impl_in_rule__AtomicExpr__Group_4__111889 = new BitSet(new long[]{0x0020080006200070L});
    public static final BitSet FOLLOW_rule__AtomicExpr__Group_4__2_in_rule__AtomicExpr__Group_4__111892 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_rule__AtomicExpr__Group_4__1__Impl11920 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AtomicExpr__Group_4__2__Impl_in_rule__AtomicExpr__Group_4__211951 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_rule__AtomicExpr__Group_4__3_in_rule__AtomicExpr__Group_4__211954 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AtomicExpr__CondAssignment_4_2_in_rule__AtomicExpr__Group_4__2__Impl11981 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AtomicExpr__Group_4__3__Impl_in_rule__AtomicExpr__Group_4__312011 = new BitSet(new long[]{0x0020080006200070L});
    public static final BitSet FOLLOW_rule__AtomicExpr__Group_4__4_in_rule__AtomicExpr__Group_4__312014 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_54_in_rule__AtomicExpr__Group_4__3__Impl12042 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AtomicExpr__Group_4__4__Impl_in_rule__AtomicExpr__Group_4__412073 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_rule__AtomicExpr__Group_4__5_in_rule__AtomicExpr__Group_4__412076 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AtomicExpr__ThenAssignment_4_4_in_rule__AtomicExpr__Group_4__4__Impl12103 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AtomicExpr__Group_4__5__Impl_in_rule__AtomicExpr__Group_4__512133 = new BitSet(new long[]{0x0020080006200070L});
    public static final BitSet FOLLOW_rule__AtomicExpr__Group_4__6_in_rule__AtomicExpr__Group_4__512136 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_rule__AtomicExpr__Group_4__5__Impl12164 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AtomicExpr__Group_4__6__Impl_in_rule__AtomicExpr__Group_4__612195 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AtomicExpr__ElseAssignment_4_6_in_rule__AtomicExpr__Group_4__6__Impl12222 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AtomicExpr__Group_5__0__Impl_in_rule__AtomicExpr__Group_5__012266 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__AtomicExpr__Group_5__1_in_rule__AtomicExpr__Group_5__012269 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AtomicExpr__Group_5__1__Impl_in_rule__AtomicExpr__Group_5__112327 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_rule__AtomicExpr__Group_5__2_in_rule__AtomicExpr__Group_5__112330 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AtomicExpr__NodeAssignment_5_1_in_rule__AtomicExpr__Group_5__1__Impl12357 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AtomicExpr__Group_5__2__Impl_in_rule__AtomicExpr__Group_5__212387 = new BitSet(new long[]{0x0020180006200070L});
    public static final BitSet FOLLOW_rule__AtomicExpr__Group_5__3_in_rule__AtomicExpr__Group_5__212390 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_rule__AtomicExpr__Group_5__2__Impl12418 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AtomicExpr__Group_5__3__Impl_in_rule__AtomicExpr__Group_5__312449 = new BitSet(new long[]{0x0020180006200070L});
    public static final BitSet FOLLOW_rule__AtomicExpr__Group_5__4_in_rule__AtomicExpr__Group_5__312452 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AtomicExpr__Group_5_3__0_in_rule__AtomicExpr__Group_5__3__Impl12479 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AtomicExpr__Group_5__4__Impl_in_rule__AtomicExpr__Group_5__412510 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_rule__AtomicExpr__Group_5__4__Impl12538 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AtomicExpr__Group_5_3__0__Impl_in_rule__AtomicExpr__Group_5_3__012579 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_rule__AtomicExpr__Group_5_3__1_in_rule__AtomicExpr__Group_5_3__012582 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AtomicExpr__ArgsAssignment_5_3_0_in_rule__AtomicExpr__Group_5_3__0__Impl12609 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AtomicExpr__Group_5_3__1__Impl_in_rule__AtomicExpr__Group_5_3__112639 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AtomicExpr__Group_5_3_1__0_in_rule__AtomicExpr__Group_5_3__1__Impl12666 = new BitSet(new long[]{0x0000004000000002L});
    public static final BitSet FOLLOW_rule__AtomicExpr__Group_5_3_1__0__Impl_in_rule__AtomicExpr__Group_5_3_1__012701 = new BitSet(new long[]{0x0020080006200070L});
    public static final BitSet FOLLOW_rule__AtomicExpr__Group_5_3_1__1_in_rule__AtomicExpr__Group_5_3_1__012704 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_rule__AtomicExpr__Group_5_3_1__0__Impl12732 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AtomicExpr__Group_5_3_1__1__Impl_in_rule__AtomicExpr__Group_5_3_1__112763 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AtomicExpr__ArgsAssignment_5_3_1_1_in_rule__AtomicExpr__Group_5_3_1__1__Impl12790 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AtomicExpr__Group_6__0__Impl_in_rule__AtomicExpr__Group_6__012824 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__AtomicExpr__Group_6__1_in_rule__AtomicExpr__Group_6__012827 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AtomicExpr__Group_6__1__Impl_in_rule__AtomicExpr__Group_6__112885 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_rule__AtomicExpr__Group_6__2_in_rule__AtomicExpr__Group_6__112888 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AtomicExpr__IdAssignment_6_1_in_rule__AtomicExpr__Group_6__1__Impl12915 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AtomicExpr__Group_6__2__Impl_in_rule__AtomicExpr__Group_6__212945 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__AtomicExpr__Group_6__3_in_rule__AtomicExpr__Group_6__212948 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__AtomicExpr__Group_6__2__Impl12976 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AtomicExpr__Group_6__3__Impl_in_rule__AtomicExpr__Group_6__313007 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_rule__AtomicExpr__Group_6__4_in_rule__AtomicExpr__Group_6__313010 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AtomicExpr__FieldsAssignment_6_3_in_rule__AtomicExpr__Group_6__3__Impl13037 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AtomicExpr__Group_6__4__Impl_in_rule__AtomicExpr__Group_6__413067 = new BitSet(new long[]{0x0020080006200070L});
    public static final BitSet FOLLOW_rule__AtomicExpr__Group_6__5_in_rule__AtomicExpr__Group_6__413070 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__AtomicExpr__Group_6__4__Impl13098 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AtomicExpr__Group_6__5__Impl_in_rule__AtomicExpr__Group_6__513129 = new BitSet(new long[]{0x0000000110000000L});
    public static final BitSet FOLLOW_rule__AtomicExpr__Group_6__6_in_rule__AtomicExpr__Group_6__513132 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AtomicExpr__ExprsAssignment_6_5_in_rule__AtomicExpr__Group_6__5__Impl13159 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AtomicExpr__Group_6__6__Impl_in_rule__AtomicExpr__Group_6__613189 = new BitSet(new long[]{0x0000000110000000L});
    public static final BitSet FOLLOW_rule__AtomicExpr__Group_6__7_in_rule__AtomicExpr__Group_6__613192 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AtomicExpr__Group_6_6__0_in_rule__AtomicExpr__Group_6__6__Impl13219 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_rule__AtomicExpr__Group_6__7__Impl_in_rule__AtomicExpr__Group_6__713250 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__AtomicExpr__Group_6__7__Impl13278 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AtomicExpr__Group_6_6__0__Impl_in_rule__AtomicExpr__Group_6_6__013325 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__AtomicExpr__Group_6_6__1_in_rule__AtomicExpr__Group_6_6__013328 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__AtomicExpr__Group_6_6__0__Impl13356 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AtomicExpr__Group_6_6__1__Impl_in_rule__AtomicExpr__Group_6_6__113387 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_rule__AtomicExpr__Group_6_6__2_in_rule__AtomicExpr__Group_6_6__113390 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AtomicExpr__FieldsAssignment_6_6_1_in_rule__AtomicExpr__Group_6_6__1__Impl13417 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AtomicExpr__Group_6_6__2__Impl_in_rule__AtomicExpr__Group_6_6__213447 = new BitSet(new long[]{0x0020080006200070L});
    public static final BitSet FOLLOW_rule__AtomicExpr__Group_6_6__3_in_rule__AtomicExpr__Group_6_6__213450 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__AtomicExpr__Group_6_6__2__Impl13478 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AtomicExpr__Group_6_6__3__Impl_in_rule__AtomicExpr__Group_6_6__313509 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AtomicExpr__ExprsAssignment_6_6_3_in_rule__AtomicExpr__Group_6_6__3__Impl13536 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AtomicExpr__Group_7__0__Impl_in_rule__AtomicExpr__Group_7__013574 = new BitSet(new long[]{0x0020080006200070L});
    public static final BitSet FOLLOW_rule__AtomicExpr__Group_7__1_in_rule__AtomicExpr__Group_7__013577 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_rule__AtomicExpr__Group_7__0__Impl13605 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AtomicExpr__Group_7__1__Impl_in_rule__AtomicExpr__Group_7__113636 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_rule__AtomicExpr__Group_7__2_in_rule__AtomicExpr__Group_7__113639 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpr_in_rule__AtomicExpr__Group_7__1__Impl13666 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AtomicExpr__Group_7__2__Impl_in_rule__AtomicExpr__Group_7__213695 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_rule__AtomicExpr__Group_7__2__Impl13723 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__REAL__Group__0__Impl_in_rule__REAL__Group__013760 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_rule__REAL__Group__1_in_rule__REAL__Group__013763 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__REAL__Group__0__Impl13790 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__REAL__Group__1__Impl_in_rule__REAL__Group__113819 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__REAL__Group__2_in_rule__REAL__Group__113822 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_rule__REAL__Group__1__Impl13850 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__REAL__Group__2__Impl_in_rule__REAL__Group__213881 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__REAL__Group__2__Impl13908 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypedef_in_rule__File__TypedefsAssignment_013948 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConstant_in_rule__File__ConstantsAssignment_113979 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNode_in_rule__File__NodesAssignment_214010 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Typedef__NameAssignment_114041 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTopLevelType_in_rule__Typedef__TypeAssignment_314072 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__TopLevelType__FieldsAssignment_0_314103 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_rule__TopLevelType__TypesAssignment_0_514134 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__TopLevelType__FieldsAssignment_0_6_114165 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_rule__TopLevelType__TypesAssignment_0_6_314196 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBound_in_rule__Type__LowAssignment_3_314227 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBound_in_rule__Type__HighAssignment_3_514258 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Type__DefAssignment_4_114293 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Constant__NameAssignment_114328 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_rule__Constant__TypeAssignment_2_114359 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpr_in_rule__Constant__ExprAssignment_414390 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Node__NameAssignment_114421 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariableGroup_in_rule__Node__InputsAssignment_3_014452 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariableGroup_in_rule__Node__InputsAssignment_3_1_114483 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariableGroup_in_rule__Node__OutputsAssignment_7_014514 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariableGroup_in_rule__Node__OutputsAssignment_7_1_114545 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariableGroup_in_rule__Node__LocalsAssignment_10_1_014576 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEquation_in_rule__Node__EquationsAssignment_12_014607 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProperty_in_rule__Node__PropertiesAssignment_12_114638 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAssertion_in_rule__Node__AssertionsAssignment_12_214669 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMain_in_rule__Node__MainAssignment_12_314700 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariable_in_rule__VariableGroup__VariablesAssignment_014731 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariable_in_rule__VariableGroup__VariablesAssignment_1_114762 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_rule__VariableGroup__TypeAssignment_314793 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Variable__NameAssignment14824 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Equation__LhsAssignment_014859 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Equation__LhsAssignment_1_114898 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpr_in_rule__Equation__RhsAssignment_314933 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Property__RefAssignment_114968 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpr_in_rule__Assertion__ExprAssignment_115003 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_56_in_rule__ArrowExpr__OpAssignment_1_0_115039 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleArrowExpr_in_rule__ArrowExpr__RightAssignment_1_0_215078 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_57_in_rule__ImpliesExpr__OpAssignment_1_0_115114 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImpliesExpr_in_rule__ImpliesExpr__RightAssignment_1_0_215153 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OrExpr__OpAlternatives_1_0_1_0_in_rule__OrExpr__OpAssignment_1_0_115184 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAndExpr_in_rule__OrExpr__RightAssignment_1_0_215217 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_58_in_rule__AndExpr__OpAssignment_1_0_115253 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRelationalExpr_in_rule__AndExpr__RightAssignment_1_0_215292 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RelationalExpr__OpAlternatives_1_0_1_0_in_rule__RelationalExpr__OpAssignment_1_0_115323 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePlusExpr_in_rule__RelationalExpr__RightAssignment_1_0_215356 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PlusExpr__OpAlternatives_1_0_1_0_in_rule__PlusExpr__OpAssignment_1_0_115387 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTimesExpr_in_rule__PlusExpr__RightAssignment_1_0_215420 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TimesExpr__OpAlternatives_1_0_1_0_in_rule__TimesExpr__OpAssignment_1_0_115451 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrefixExpr_in_rule__TimesExpr__RightAssignment_1_0_215484 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PrefixExpr__OpAlternatives_0_1_0_in_rule__PrefixExpr__OpAssignment_0_115515 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrefixExpr_in_rule__PrefixExpr__ExprAssignment_0_215548 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__ProjectionExpr__FieldAssignment_1_0_215579 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__AtomicExpr__IdAssignment_0_115614 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__AtomicExpr__ValAssignment_1_115649 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleREAL_in_rule__AtomicExpr__ValAssignment_2_115680 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_BOOL_in_rule__AtomicExpr__ValAssignment_3_115711 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpr_in_rule__AtomicExpr__CondAssignment_4_215742 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpr_in_rule__AtomicExpr__ThenAssignment_4_415773 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpr_in_rule__AtomicExpr__ElseAssignment_4_615804 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__AtomicExpr__NodeAssignment_5_115839 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpr_in_rule__AtomicExpr__ArgsAssignment_5_3_015874 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpr_in_rule__AtomicExpr__ArgsAssignment_5_3_1_115905 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__AtomicExpr__IdAssignment_6_115940 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__AtomicExpr__FieldsAssignment_6_315975 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpr_in_rule__AtomicExpr__ExprsAssignment_6_516006 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__AtomicExpr__FieldsAssignment_6_6_116037 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpr_in_rule__AtomicExpr__ExprsAssignment_6_6_316068 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ArrowExpr__Group_1__0_in_synpred45_InternalJKind8328 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ImpliesExpr__Group_1__0_in_synpred46_InternalJKind8692 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OrExpr__Group_1__0_in_synpred47_InternalJKind9056 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AndExpr__Group_1__0_in_synpred48_InternalJKind9420 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RelationalExpr__Group_1__0_in_synpred49_InternalJKind9784 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PlusExpr__Group_1__0_in_synpred50_InternalJKind10148 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TimesExpr__Group_1__0_in_synpred51_InternalJKind10512 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ProjectionExpr__Group_1__0_in_synpred52_InternalJKind11060 = new BitSet(new long[]{0x0000000000000002L});

}