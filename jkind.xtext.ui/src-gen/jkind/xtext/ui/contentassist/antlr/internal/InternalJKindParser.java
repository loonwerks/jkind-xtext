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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INT", "RULE_ID", "RULE_BOOL", "RULE_WS", "RULE_SL_COMMENT", "RULE_ANY_OTHER", "'or'", "'xor'", "'<'", "'<='", "'>'", "'>='", "'='", "'<>'", "'+'", "'-'", "'*'", "'/'", "'div'", "'not'", "'pre'", "'type'", "';'", "'struct'", "'{'", "':'", "'}'", "'int'", "'bool'", "'real'", "'subrange'", "'['", "','", "']'", "'of'", "'const'", "'node'", "'('", "')'", "'returns'", "'let'", "'tel'", "'var'", "'--%PROPERTY'", "'--%MAIN'", "'assert'", "'.'", "'if'", "'then'", "'else'", "'->'", "'=>'", "'and'"
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
    public static final int RULE_ANY_OTHER=9;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int RULE_BOOL=6;
    public static final int EOF=-1;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int T__19=19;
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
    public static final int T__10=10;
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
    public static final int RULE_SL_COMMENT=8;
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
    public static final int RULE_WS=7;

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

                if ( (LA1_0==25||(LA1_0>=39 && LA1_0<=40)) ) {
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


    // $ANTLR start "entryRuleField"
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:173:1: entryRuleField : ruleField EOF ;
    public final void entryRuleField() throws RecognitionException {
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:174:1: ( ruleField EOF )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:175:1: ruleField EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldRule()); 
            }
            pushFollow(FOLLOW_ruleField_in_entryRuleField308);
            ruleField();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFieldRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleField315); if (state.failed) return ;

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
    // $ANTLR end "entryRuleField"


    // $ANTLR start "ruleField"
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:182:1: ruleField : ( ( rule__Field__NameAssignment ) ) ;
    public final void ruleField() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:186:2: ( ( ( rule__Field__NameAssignment ) ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:187:1: ( ( rule__Field__NameAssignment ) )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:187:1: ( ( rule__Field__NameAssignment ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:188:1: ( rule__Field__NameAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldAccess().getNameAssignment()); 
            }
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:189:1: ( rule__Field__NameAssignment )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:189:2: rule__Field__NameAssignment
            {
            pushFollow(FOLLOW_rule__Field__NameAssignment_in_ruleField341);
            rule__Field__NameAssignment();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFieldAccess().getNameAssignment()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleField"


    // $ANTLR start "entryRuleBound"
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:201:1: entryRuleBound : ruleBound EOF ;
    public final void entryRuleBound() throws RecognitionException {
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:202:1: ( ruleBound EOF )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:203:1: ruleBound EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBoundRule()); 
            }
            pushFollow(FOLLOW_ruleBound_in_entryRuleBound368);
            ruleBound();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBoundRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleBound375); if (state.failed) return ;

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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:210:1: ruleBound : ( ( rule__Bound__Group__0 ) ) ;
    public final void ruleBound() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:214:2: ( ( ( rule__Bound__Group__0 ) ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:215:1: ( ( rule__Bound__Group__0 ) )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:215:1: ( ( rule__Bound__Group__0 ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:216:1: ( rule__Bound__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBoundAccess().getGroup()); 
            }
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:217:1: ( rule__Bound__Group__0 )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:217:2: rule__Bound__Group__0
            {
            pushFollow(FOLLOW_rule__Bound__Group__0_in_ruleBound401);
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:229:1: entryRuleConstant : ruleConstant EOF ;
    public final void entryRuleConstant() throws RecognitionException {
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:230:1: ( ruleConstant EOF )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:231:1: ruleConstant EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConstantRule()); 
            }
            pushFollow(FOLLOW_ruleConstant_in_entryRuleConstant428);
            ruleConstant();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getConstantRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleConstant435); if (state.failed) return ;

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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:238:1: ruleConstant : ( ( rule__Constant__Group__0 ) ) ;
    public final void ruleConstant() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:242:2: ( ( ( rule__Constant__Group__0 ) ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:243:1: ( ( rule__Constant__Group__0 ) )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:243:1: ( ( rule__Constant__Group__0 ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:244:1: ( rule__Constant__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConstantAccess().getGroup()); 
            }
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:245:1: ( rule__Constant__Group__0 )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:245:2: rule__Constant__Group__0
            {
            pushFollow(FOLLOW_rule__Constant__Group__0_in_ruleConstant461);
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:257:1: entryRuleNode : ruleNode EOF ;
    public final void entryRuleNode() throws RecognitionException {
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:258:1: ( ruleNode EOF )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:259:1: ruleNode EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNodeRule()); 
            }
            pushFollow(FOLLOW_ruleNode_in_entryRuleNode488);
            ruleNode();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getNodeRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleNode495); if (state.failed) return ;

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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:266:1: ruleNode : ( ( rule__Node__Group__0 ) ) ;
    public final void ruleNode() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:270:2: ( ( ( rule__Node__Group__0 ) ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:271:1: ( ( rule__Node__Group__0 ) )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:271:1: ( ( rule__Node__Group__0 ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:272:1: ( rule__Node__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNodeAccess().getGroup()); 
            }
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:273:1: ( rule__Node__Group__0 )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:273:2: rule__Node__Group__0
            {
            pushFollow(FOLLOW_rule__Node__Group__0_in_ruleNode521);
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:285:1: entryRuleVariableGroup : ruleVariableGroup EOF ;
    public final void entryRuleVariableGroup() throws RecognitionException {
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:286:1: ( ruleVariableGroup EOF )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:287:1: ruleVariableGroup EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariableGroupRule()); 
            }
            pushFollow(FOLLOW_ruleVariableGroup_in_entryRuleVariableGroup548);
            ruleVariableGroup();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getVariableGroupRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleVariableGroup555); if (state.failed) return ;

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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:294:1: ruleVariableGroup : ( ( rule__VariableGroup__Group__0 ) ) ;
    public final void ruleVariableGroup() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:298:2: ( ( ( rule__VariableGroup__Group__0 ) ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:299:1: ( ( rule__VariableGroup__Group__0 ) )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:299:1: ( ( rule__VariableGroup__Group__0 ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:300:1: ( rule__VariableGroup__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariableGroupAccess().getGroup()); 
            }
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:301:1: ( rule__VariableGroup__Group__0 )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:301:2: rule__VariableGroup__Group__0
            {
            pushFollow(FOLLOW_rule__VariableGroup__Group__0_in_ruleVariableGroup581);
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:313:1: entryRuleVariable : ruleVariable EOF ;
    public final void entryRuleVariable() throws RecognitionException {
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:314:1: ( ruleVariable EOF )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:315:1: ruleVariable EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariableRule()); 
            }
            pushFollow(FOLLOW_ruleVariable_in_entryRuleVariable608);
            ruleVariable();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getVariableRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleVariable615); if (state.failed) return ;

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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:322:1: ruleVariable : ( ( rule__Variable__NameAssignment ) ) ;
    public final void ruleVariable() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:326:2: ( ( ( rule__Variable__NameAssignment ) ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:327:1: ( ( rule__Variable__NameAssignment ) )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:327:1: ( ( rule__Variable__NameAssignment ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:328:1: ( rule__Variable__NameAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariableAccess().getNameAssignment()); 
            }
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:329:1: ( rule__Variable__NameAssignment )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:329:2: rule__Variable__NameAssignment
            {
            pushFollow(FOLLOW_rule__Variable__NameAssignment_in_ruleVariable641);
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:341:1: entryRuleEquation : ruleEquation EOF ;
    public final void entryRuleEquation() throws RecognitionException {
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:342:1: ( ruleEquation EOF )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:343:1: ruleEquation EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEquationRule()); 
            }
            pushFollow(FOLLOW_ruleEquation_in_entryRuleEquation668);
            ruleEquation();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEquationRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleEquation675); if (state.failed) return ;

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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:350:1: ruleEquation : ( ( rule__Equation__Group__0 ) ) ;
    public final void ruleEquation() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:354:2: ( ( ( rule__Equation__Group__0 ) ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:355:1: ( ( rule__Equation__Group__0 ) )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:355:1: ( ( rule__Equation__Group__0 ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:356:1: ( rule__Equation__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEquationAccess().getGroup()); 
            }
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:357:1: ( rule__Equation__Group__0 )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:357:2: rule__Equation__Group__0
            {
            pushFollow(FOLLOW_rule__Equation__Group__0_in_ruleEquation701);
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:369:1: entryRuleProperty : ruleProperty EOF ;
    public final void entryRuleProperty() throws RecognitionException {
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:370:1: ( ruleProperty EOF )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:371:1: ruleProperty EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPropertyRule()); 
            }
            pushFollow(FOLLOW_ruleProperty_in_entryRuleProperty728);
            ruleProperty();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPropertyRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleProperty735); if (state.failed) return ;

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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:378:1: ruleProperty : ( ( rule__Property__Group__0 ) ) ;
    public final void ruleProperty() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:382:2: ( ( ( rule__Property__Group__0 ) ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:383:1: ( ( rule__Property__Group__0 ) )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:383:1: ( ( rule__Property__Group__0 ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:384:1: ( rule__Property__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPropertyAccess().getGroup()); 
            }
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:385:1: ( rule__Property__Group__0 )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:385:2: rule__Property__Group__0
            {
            pushFollow(FOLLOW_rule__Property__Group__0_in_ruleProperty761);
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:397:1: entryRuleMain : ruleMain EOF ;
    public final void entryRuleMain() throws RecognitionException {
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:398:1: ( ruleMain EOF )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:399:1: ruleMain EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMainRule()); 
            }
            pushFollow(FOLLOW_ruleMain_in_entryRuleMain788);
            ruleMain();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMainRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleMain795); if (state.failed) return ;

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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:406:1: ruleMain : ( ( rule__Main__Group__0 ) ) ;
    public final void ruleMain() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:410:2: ( ( ( rule__Main__Group__0 ) ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:411:1: ( ( rule__Main__Group__0 ) )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:411:1: ( ( rule__Main__Group__0 ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:412:1: ( rule__Main__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMainAccess().getGroup()); 
            }
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:413:1: ( rule__Main__Group__0 )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:413:2: rule__Main__Group__0
            {
            pushFollow(FOLLOW_rule__Main__Group__0_in_ruleMain821);
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:425:1: entryRuleAssertion : ruleAssertion EOF ;
    public final void entryRuleAssertion() throws RecognitionException {
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:426:1: ( ruleAssertion EOF )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:427:1: ruleAssertion EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAssertionRule()); 
            }
            pushFollow(FOLLOW_ruleAssertion_in_entryRuleAssertion848);
            ruleAssertion();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAssertionRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAssertion855); if (state.failed) return ;

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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:434:1: ruleAssertion : ( ( rule__Assertion__Group__0 ) ) ;
    public final void ruleAssertion() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:438:2: ( ( ( rule__Assertion__Group__0 ) ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:439:1: ( ( rule__Assertion__Group__0 ) )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:439:1: ( ( rule__Assertion__Group__0 ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:440:1: ( rule__Assertion__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAssertionAccess().getGroup()); 
            }
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:441:1: ( rule__Assertion__Group__0 )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:441:2: rule__Assertion__Group__0
            {
            pushFollow(FOLLOW_rule__Assertion__Group__0_in_ruleAssertion881);
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:453:1: entryRuleExpr : ruleExpr EOF ;
    public final void entryRuleExpr() throws RecognitionException {
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:454:1: ( ruleExpr EOF )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:455:1: ruleExpr EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExprRule()); 
            }
            pushFollow(FOLLOW_ruleExpr_in_entryRuleExpr908);
            ruleExpr();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExprRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleExpr915); if (state.failed) return ;

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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:462:1: ruleExpr : ( ruleArrowExpr ) ;
    public final void ruleExpr() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:466:2: ( ( ruleArrowExpr ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:467:1: ( ruleArrowExpr )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:467:1: ( ruleArrowExpr )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:468:1: ruleArrowExpr
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExprAccess().getArrowExprParserRuleCall()); 
            }
            pushFollow(FOLLOW_ruleArrowExpr_in_ruleExpr941);
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:481:1: entryRuleArrowExpr : ruleArrowExpr EOF ;
    public final void entryRuleArrowExpr() throws RecognitionException {
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:482:1: ( ruleArrowExpr EOF )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:483:1: ruleArrowExpr EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getArrowExprRule()); 
            }
            pushFollow(FOLLOW_ruleArrowExpr_in_entryRuleArrowExpr967);
            ruleArrowExpr();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getArrowExprRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleArrowExpr974); if (state.failed) return ;

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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:490:1: ruleArrowExpr : ( ( rule__ArrowExpr__Group__0 ) ) ;
    public final void ruleArrowExpr() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:494:2: ( ( ( rule__ArrowExpr__Group__0 ) ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:495:1: ( ( rule__ArrowExpr__Group__0 ) )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:495:1: ( ( rule__ArrowExpr__Group__0 ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:496:1: ( rule__ArrowExpr__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getArrowExprAccess().getGroup()); 
            }
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:497:1: ( rule__ArrowExpr__Group__0 )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:497:2: rule__ArrowExpr__Group__0
            {
            pushFollow(FOLLOW_rule__ArrowExpr__Group__0_in_ruleArrowExpr1000);
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:509:1: entryRuleImpliesExpr : ruleImpliesExpr EOF ;
    public final void entryRuleImpliesExpr() throws RecognitionException {
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:510:1: ( ruleImpliesExpr EOF )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:511:1: ruleImpliesExpr EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getImpliesExprRule()); 
            }
            pushFollow(FOLLOW_ruleImpliesExpr_in_entryRuleImpliesExpr1027);
            ruleImpliesExpr();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getImpliesExprRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleImpliesExpr1034); if (state.failed) return ;

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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:518:1: ruleImpliesExpr : ( ( rule__ImpliesExpr__Group__0 ) ) ;
    public final void ruleImpliesExpr() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:522:2: ( ( ( rule__ImpliesExpr__Group__0 ) ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:523:1: ( ( rule__ImpliesExpr__Group__0 ) )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:523:1: ( ( rule__ImpliesExpr__Group__0 ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:524:1: ( rule__ImpliesExpr__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getImpliesExprAccess().getGroup()); 
            }
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:525:1: ( rule__ImpliesExpr__Group__0 )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:525:2: rule__ImpliesExpr__Group__0
            {
            pushFollow(FOLLOW_rule__ImpliesExpr__Group__0_in_ruleImpliesExpr1060);
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:537:1: entryRuleOrExpr : ruleOrExpr EOF ;
    public final void entryRuleOrExpr() throws RecognitionException {
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:538:1: ( ruleOrExpr EOF )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:539:1: ruleOrExpr EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOrExprRule()); 
            }
            pushFollow(FOLLOW_ruleOrExpr_in_entryRuleOrExpr1087);
            ruleOrExpr();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getOrExprRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOrExpr1094); if (state.failed) return ;

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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:546:1: ruleOrExpr : ( ( rule__OrExpr__Group__0 ) ) ;
    public final void ruleOrExpr() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:550:2: ( ( ( rule__OrExpr__Group__0 ) ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:551:1: ( ( rule__OrExpr__Group__0 ) )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:551:1: ( ( rule__OrExpr__Group__0 ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:552:1: ( rule__OrExpr__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOrExprAccess().getGroup()); 
            }
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:553:1: ( rule__OrExpr__Group__0 )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:553:2: rule__OrExpr__Group__0
            {
            pushFollow(FOLLOW_rule__OrExpr__Group__0_in_ruleOrExpr1120);
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:565:1: entryRuleAndExpr : ruleAndExpr EOF ;
    public final void entryRuleAndExpr() throws RecognitionException {
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:566:1: ( ruleAndExpr EOF )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:567:1: ruleAndExpr EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAndExprRule()); 
            }
            pushFollow(FOLLOW_ruleAndExpr_in_entryRuleAndExpr1147);
            ruleAndExpr();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAndExprRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAndExpr1154); if (state.failed) return ;

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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:574:1: ruleAndExpr : ( ( rule__AndExpr__Group__0 ) ) ;
    public final void ruleAndExpr() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:578:2: ( ( ( rule__AndExpr__Group__0 ) ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:579:1: ( ( rule__AndExpr__Group__0 ) )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:579:1: ( ( rule__AndExpr__Group__0 ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:580:1: ( rule__AndExpr__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAndExprAccess().getGroup()); 
            }
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:581:1: ( rule__AndExpr__Group__0 )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:581:2: rule__AndExpr__Group__0
            {
            pushFollow(FOLLOW_rule__AndExpr__Group__0_in_ruleAndExpr1180);
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:593:1: entryRuleRelationalExpr : ruleRelationalExpr EOF ;
    public final void entryRuleRelationalExpr() throws RecognitionException {
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:594:1: ( ruleRelationalExpr EOF )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:595:1: ruleRelationalExpr EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRelationalExprRule()); 
            }
            pushFollow(FOLLOW_ruleRelationalExpr_in_entryRuleRelationalExpr1207);
            ruleRelationalExpr();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRelationalExprRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleRelationalExpr1214); if (state.failed) return ;

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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:602:1: ruleRelationalExpr : ( ( rule__RelationalExpr__Group__0 ) ) ;
    public final void ruleRelationalExpr() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:606:2: ( ( ( rule__RelationalExpr__Group__0 ) ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:607:1: ( ( rule__RelationalExpr__Group__0 ) )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:607:1: ( ( rule__RelationalExpr__Group__0 ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:608:1: ( rule__RelationalExpr__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRelationalExprAccess().getGroup()); 
            }
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:609:1: ( rule__RelationalExpr__Group__0 )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:609:2: rule__RelationalExpr__Group__0
            {
            pushFollow(FOLLOW_rule__RelationalExpr__Group__0_in_ruleRelationalExpr1240);
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:621:1: entryRulePlusExpr : rulePlusExpr EOF ;
    public final void entryRulePlusExpr() throws RecognitionException {
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:622:1: ( rulePlusExpr EOF )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:623:1: rulePlusExpr EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPlusExprRule()); 
            }
            pushFollow(FOLLOW_rulePlusExpr_in_entryRulePlusExpr1267);
            rulePlusExpr();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPlusExprRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulePlusExpr1274); if (state.failed) return ;

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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:630:1: rulePlusExpr : ( ( rule__PlusExpr__Group__0 ) ) ;
    public final void rulePlusExpr() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:634:2: ( ( ( rule__PlusExpr__Group__0 ) ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:635:1: ( ( rule__PlusExpr__Group__0 ) )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:635:1: ( ( rule__PlusExpr__Group__0 ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:636:1: ( rule__PlusExpr__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPlusExprAccess().getGroup()); 
            }
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:637:1: ( rule__PlusExpr__Group__0 )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:637:2: rule__PlusExpr__Group__0
            {
            pushFollow(FOLLOW_rule__PlusExpr__Group__0_in_rulePlusExpr1300);
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:649:1: entryRuleTimesExpr : ruleTimesExpr EOF ;
    public final void entryRuleTimesExpr() throws RecognitionException {
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:650:1: ( ruleTimesExpr EOF )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:651:1: ruleTimesExpr EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTimesExprRule()); 
            }
            pushFollow(FOLLOW_ruleTimesExpr_in_entryRuleTimesExpr1327);
            ruleTimesExpr();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTimesExprRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleTimesExpr1334); if (state.failed) return ;

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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:658:1: ruleTimesExpr : ( ( rule__TimesExpr__Group__0 ) ) ;
    public final void ruleTimesExpr() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:662:2: ( ( ( rule__TimesExpr__Group__0 ) ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:663:1: ( ( rule__TimesExpr__Group__0 ) )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:663:1: ( ( rule__TimesExpr__Group__0 ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:664:1: ( rule__TimesExpr__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTimesExprAccess().getGroup()); 
            }
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:665:1: ( rule__TimesExpr__Group__0 )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:665:2: rule__TimesExpr__Group__0
            {
            pushFollow(FOLLOW_rule__TimesExpr__Group__0_in_ruleTimesExpr1360);
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:677:1: entryRulePrefixExpr : rulePrefixExpr EOF ;
    public final void entryRulePrefixExpr() throws RecognitionException {
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:678:1: ( rulePrefixExpr EOF )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:679:1: rulePrefixExpr EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPrefixExprRule()); 
            }
            pushFollow(FOLLOW_rulePrefixExpr_in_entryRulePrefixExpr1387);
            rulePrefixExpr();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPrefixExprRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulePrefixExpr1394); if (state.failed) return ;

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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:686:1: rulePrefixExpr : ( ( rule__PrefixExpr__Alternatives ) ) ;
    public final void rulePrefixExpr() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:690:2: ( ( ( rule__PrefixExpr__Alternatives ) ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:691:1: ( ( rule__PrefixExpr__Alternatives ) )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:691:1: ( ( rule__PrefixExpr__Alternatives ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:692:1: ( rule__PrefixExpr__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPrefixExprAccess().getAlternatives()); 
            }
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:693:1: ( rule__PrefixExpr__Alternatives )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:693:2: rule__PrefixExpr__Alternatives
            {
            pushFollow(FOLLOW_rule__PrefixExpr__Alternatives_in_rulePrefixExpr1420);
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:705:1: entryRuleProjectionExpr : ruleProjectionExpr EOF ;
    public final void entryRuleProjectionExpr() throws RecognitionException {
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:706:1: ( ruleProjectionExpr EOF )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:707:1: ruleProjectionExpr EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProjectionExprRule()); 
            }
            pushFollow(FOLLOW_ruleProjectionExpr_in_entryRuleProjectionExpr1447);
            ruleProjectionExpr();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getProjectionExprRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleProjectionExpr1454); if (state.failed) return ;

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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:714:1: ruleProjectionExpr : ( ( rule__ProjectionExpr__Group__0 ) ) ;
    public final void ruleProjectionExpr() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:718:2: ( ( ( rule__ProjectionExpr__Group__0 ) ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:719:1: ( ( rule__ProjectionExpr__Group__0 ) )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:719:1: ( ( rule__ProjectionExpr__Group__0 ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:720:1: ( rule__ProjectionExpr__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProjectionExprAccess().getGroup()); 
            }
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:721:1: ( rule__ProjectionExpr__Group__0 )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:721:2: rule__ProjectionExpr__Group__0
            {
            pushFollow(FOLLOW_rule__ProjectionExpr__Group__0_in_ruleProjectionExpr1480);
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:733:1: entryRuleAtomicExpr : ruleAtomicExpr EOF ;
    public final void entryRuleAtomicExpr() throws RecognitionException {
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:734:1: ( ruleAtomicExpr EOF )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:735:1: ruleAtomicExpr EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAtomicExprRule()); 
            }
            pushFollow(FOLLOW_ruleAtomicExpr_in_entryRuleAtomicExpr1507);
            ruleAtomicExpr();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAtomicExprRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAtomicExpr1514); if (state.failed) return ;

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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:742:1: ruleAtomicExpr : ( ( rule__AtomicExpr__Alternatives ) ) ;
    public final void ruleAtomicExpr() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:746:2: ( ( ( rule__AtomicExpr__Alternatives ) ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:747:1: ( ( rule__AtomicExpr__Alternatives ) )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:747:1: ( ( rule__AtomicExpr__Alternatives ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:748:1: ( rule__AtomicExpr__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAtomicExprAccess().getAlternatives()); 
            }
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:749:1: ( rule__AtomicExpr__Alternatives )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:749:2: rule__AtomicExpr__Alternatives
            {
            pushFollow(FOLLOW_rule__AtomicExpr__Alternatives_in_ruleAtomicExpr1540);
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:763:1: entryRuleREAL : ruleREAL EOF ;
    public final void entryRuleREAL() throws RecognitionException {
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:764:1: ( ruleREAL EOF )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:765:1: ruleREAL EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getREALRule()); 
            }
            pushFollow(FOLLOW_ruleREAL_in_entryRuleREAL1569);
            ruleREAL();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getREALRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleREAL1576); if (state.failed) return ;

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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:772:1: ruleREAL : ( ( rule__REAL__Group__0 ) ) ;
    public final void ruleREAL() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:776:2: ( ( ( rule__REAL__Group__0 ) ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:777:1: ( ( rule__REAL__Group__0 ) )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:777:1: ( ( rule__REAL__Group__0 ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:778:1: ( rule__REAL__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getREALAccess().getGroup()); 
            }
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:779:1: ( rule__REAL__Group__0 )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:779:2: rule__REAL__Group__0
            {
            pushFollow(FOLLOW_rule__REAL__Group__0_in_ruleREAL1602);
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:791:1: rule__File__Alternatives : ( ( ( rule__File__TypedefsAssignment_0 ) ) | ( ( rule__File__ConstantsAssignment_1 ) ) | ( ( rule__File__NodesAssignment_2 ) ) );
    public final void rule__File__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:795:1: ( ( ( rule__File__TypedefsAssignment_0 ) ) | ( ( rule__File__ConstantsAssignment_1 ) ) | ( ( rule__File__NodesAssignment_2 ) ) )
            int alt2=3;
            switch ( input.LA(1) ) {
            case 25:
                {
                alt2=1;
                }
                break;
            case 39:
                {
                alt2=2;
                }
                break;
            case 40:
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
                    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:796:1: ( ( rule__File__TypedefsAssignment_0 ) )
                    {
                    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:796:1: ( ( rule__File__TypedefsAssignment_0 ) )
                    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:797:1: ( rule__File__TypedefsAssignment_0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getFileAccess().getTypedefsAssignment_0()); 
                    }
                    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:798:1: ( rule__File__TypedefsAssignment_0 )
                    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:798:2: rule__File__TypedefsAssignment_0
                    {
                    pushFollow(FOLLOW_rule__File__TypedefsAssignment_0_in_rule__File__Alternatives1638);
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
                    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:802:6: ( ( rule__File__ConstantsAssignment_1 ) )
                    {
                    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:802:6: ( ( rule__File__ConstantsAssignment_1 ) )
                    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:803:1: ( rule__File__ConstantsAssignment_1 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getFileAccess().getConstantsAssignment_1()); 
                    }
                    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:804:1: ( rule__File__ConstantsAssignment_1 )
                    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:804:2: rule__File__ConstantsAssignment_1
                    {
                    pushFollow(FOLLOW_rule__File__ConstantsAssignment_1_in_rule__File__Alternatives1656);
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
                    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:808:6: ( ( rule__File__NodesAssignment_2 ) )
                    {
                    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:808:6: ( ( rule__File__NodesAssignment_2 ) )
                    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:809:1: ( rule__File__NodesAssignment_2 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getFileAccess().getNodesAssignment_2()); 
                    }
                    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:810:1: ( rule__File__NodesAssignment_2 )
                    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:810:2: rule__File__NodesAssignment_2
                    {
                    pushFollow(FOLLOW_rule__File__NodesAssignment_2_in_rule__File__Alternatives1674);
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:819:1: rule__TopLevelType__Alternatives : ( ( ( rule__TopLevelType__Group_0__0 ) ) | ( ruleType ) );
    public final void rule__TopLevelType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:823:1: ( ( ( rule__TopLevelType__Group_0__0 ) ) | ( ruleType ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==27) ) {
                alt3=1;
            }
            else if ( (LA3_0==RULE_ID||(LA3_0>=31 && LA3_0<=34)) ) {
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
                    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:824:1: ( ( rule__TopLevelType__Group_0__0 ) )
                    {
                    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:824:1: ( ( rule__TopLevelType__Group_0__0 ) )
                    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:825:1: ( rule__TopLevelType__Group_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getTopLevelTypeAccess().getGroup_0()); 
                    }
                    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:826:1: ( rule__TopLevelType__Group_0__0 )
                    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:826:2: rule__TopLevelType__Group_0__0
                    {
                    pushFollow(FOLLOW_rule__TopLevelType__Group_0__0_in_rule__TopLevelType__Alternatives1707);
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
                    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:830:6: ( ruleType )
                    {
                    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:830:6: ( ruleType )
                    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:831:1: ruleType
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getTopLevelTypeAccess().getTypeParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_ruleType_in_rule__TopLevelType__Alternatives1725);
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:841:1: rule__Type__Alternatives : ( ( ( rule__Type__Group_0__0 ) ) | ( ( rule__Type__Group_1__0 ) ) | ( ( rule__Type__Group_2__0 ) ) | ( ( rule__Type__Group_3__0 ) ) | ( ( rule__Type__Group_4__0 ) ) );
    public final void rule__Type__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:845:1: ( ( ( rule__Type__Group_0__0 ) ) | ( ( rule__Type__Group_1__0 ) ) | ( ( rule__Type__Group_2__0 ) ) | ( ( rule__Type__Group_3__0 ) ) | ( ( rule__Type__Group_4__0 ) ) )
            int alt4=5;
            switch ( input.LA(1) ) {
            case 31:
                {
                alt4=1;
                }
                break;
            case 32:
                {
                alt4=2;
                }
                break;
            case 33:
                {
                alt4=3;
                }
                break;
            case 34:
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
                    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:846:1: ( ( rule__Type__Group_0__0 ) )
                    {
                    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:846:1: ( ( rule__Type__Group_0__0 ) )
                    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:847:1: ( rule__Type__Group_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getTypeAccess().getGroup_0()); 
                    }
                    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:848:1: ( rule__Type__Group_0__0 )
                    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:848:2: rule__Type__Group_0__0
                    {
                    pushFollow(FOLLOW_rule__Type__Group_0__0_in_rule__Type__Alternatives1757);
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
                    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:852:6: ( ( rule__Type__Group_1__0 ) )
                    {
                    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:852:6: ( ( rule__Type__Group_1__0 ) )
                    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:853:1: ( rule__Type__Group_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getTypeAccess().getGroup_1()); 
                    }
                    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:854:1: ( rule__Type__Group_1__0 )
                    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:854:2: rule__Type__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__Type__Group_1__0_in_rule__Type__Alternatives1775);
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
                    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:858:6: ( ( rule__Type__Group_2__0 ) )
                    {
                    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:858:6: ( ( rule__Type__Group_2__0 ) )
                    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:859:1: ( rule__Type__Group_2__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getTypeAccess().getGroup_2()); 
                    }
                    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:860:1: ( rule__Type__Group_2__0 )
                    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:860:2: rule__Type__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__Type__Group_2__0_in_rule__Type__Alternatives1793);
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
                    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:864:6: ( ( rule__Type__Group_3__0 ) )
                    {
                    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:864:6: ( ( rule__Type__Group_3__0 ) )
                    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:865:1: ( rule__Type__Group_3__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getTypeAccess().getGroup_3()); 
                    }
                    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:866:1: ( rule__Type__Group_3__0 )
                    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:866:2: rule__Type__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__Type__Group_3__0_in_rule__Type__Alternatives1811);
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
                    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:870:6: ( ( rule__Type__Group_4__0 ) )
                    {
                    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:870:6: ( ( rule__Type__Group_4__0 ) )
                    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:871:1: ( rule__Type__Group_4__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getTypeAccess().getGroup_4()); 
                    }
                    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:872:1: ( rule__Type__Group_4__0 )
                    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:872:2: rule__Type__Group_4__0
                    {
                    pushFollow(FOLLOW_rule__Type__Group_4__0_in_rule__Type__Alternatives1829);
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:881:1: rule__Node__Alternatives_12 : ( ( ( rule__Node__EquationsAssignment_12_0 ) ) | ( ( rule__Node__PropertiesAssignment_12_1 ) ) | ( ( rule__Node__AssertionsAssignment_12_2 ) ) | ( ( rule__Node__MainAssignment_12_3 ) ) );
    public final void rule__Node__Alternatives_12() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:885:1: ( ( ( rule__Node__EquationsAssignment_12_0 ) ) | ( ( rule__Node__PropertiesAssignment_12_1 ) ) | ( ( rule__Node__AssertionsAssignment_12_2 ) ) | ( ( rule__Node__MainAssignment_12_3 ) ) )
            int alt5=4;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt5=1;
                }
                break;
            case 47:
                {
                alt5=2;
                }
                break;
            case 49:
                {
                alt5=3;
                }
                break;
            case 48:
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
                    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:886:1: ( ( rule__Node__EquationsAssignment_12_0 ) )
                    {
                    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:886:1: ( ( rule__Node__EquationsAssignment_12_0 ) )
                    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:887:1: ( rule__Node__EquationsAssignment_12_0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getNodeAccess().getEquationsAssignment_12_0()); 
                    }
                    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:888:1: ( rule__Node__EquationsAssignment_12_0 )
                    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:888:2: rule__Node__EquationsAssignment_12_0
                    {
                    pushFollow(FOLLOW_rule__Node__EquationsAssignment_12_0_in_rule__Node__Alternatives_121862);
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
                    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:892:6: ( ( rule__Node__PropertiesAssignment_12_1 ) )
                    {
                    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:892:6: ( ( rule__Node__PropertiesAssignment_12_1 ) )
                    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:893:1: ( rule__Node__PropertiesAssignment_12_1 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getNodeAccess().getPropertiesAssignment_12_1()); 
                    }
                    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:894:1: ( rule__Node__PropertiesAssignment_12_1 )
                    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:894:2: rule__Node__PropertiesAssignment_12_1
                    {
                    pushFollow(FOLLOW_rule__Node__PropertiesAssignment_12_1_in_rule__Node__Alternatives_121880);
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
                    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:898:6: ( ( rule__Node__AssertionsAssignment_12_2 ) )
                    {
                    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:898:6: ( ( rule__Node__AssertionsAssignment_12_2 ) )
                    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:899:1: ( rule__Node__AssertionsAssignment_12_2 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getNodeAccess().getAssertionsAssignment_12_2()); 
                    }
                    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:900:1: ( rule__Node__AssertionsAssignment_12_2 )
                    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:900:2: rule__Node__AssertionsAssignment_12_2
                    {
                    pushFollow(FOLLOW_rule__Node__AssertionsAssignment_12_2_in_rule__Node__Alternatives_121898);
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
                    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:904:6: ( ( rule__Node__MainAssignment_12_3 ) )
                    {
                    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:904:6: ( ( rule__Node__MainAssignment_12_3 ) )
                    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:905:1: ( rule__Node__MainAssignment_12_3 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getNodeAccess().getMainAssignment_12_3()); 
                    }
                    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:906:1: ( rule__Node__MainAssignment_12_3 )
                    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:906:2: rule__Node__MainAssignment_12_3
                    {
                    pushFollow(FOLLOW_rule__Node__MainAssignment_12_3_in_rule__Node__Alternatives_121916);
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:915:1: rule__OrExpr__OpAlternatives_1_0_1_0 : ( ( 'or' ) | ( 'xor' ) );
    public final void rule__OrExpr__OpAlternatives_1_0_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:919:1: ( ( 'or' ) | ( 'xor' ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==10) ) {
                alt6=1;
            }
            else if ( (LA6_0==11) ) {
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
                    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:920:1: ( 'or' )
                    {
                    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:920:1: ( 'or' )
                    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:921:1: 'or'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getOrExprAccess().getOpOrKeyword_1_0_1_0_0()); 
                    }
                    match(input,10,FOLLOW_10_in_rule__OrExpr__OpAlternatives_1_0_1_01950); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getOrExprAccess().getOpOrKeyword_1_0_1_0_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:928:6: ( 'xor' )
                    {
                    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:928:6: ( 'xor' )
                    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:929:1: 'xor'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getOrExprAccess().getOpXorKeyword_1_0_1_0_1()); 
                    }
                    match(input,11,FOLLOW_11_in_rule__OrExpr__OpAlternatives_1_0_1_01970); if (state.failed) return ;
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:941:1: rule__RelationalExpr__OpAlternatives_1_0_1_0 : ( ( '<' ) | ( '<=' ) | ( '>' ) | ( '>=' ) | ( '=' ) | ( '<>' ) );
    public final void rule__RelationalExpr__OpAlternatives_1_0_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:945:1: ( ( '<' ) | ( '<=' ) | ( '>' ) | ( '>=' ) | ( '=' ) | ( '<>' ) )
            int alt7=6;
            switch ( input.LA(1) ) {
            case 12:
                {
                alt7=1;
                }
                break;
            case 13:
                {
                alt7=2;
                }
                break;
            case 14:
                {
                alt7=3;
                }
                break;
            case 15:
                {
                alt7=4;
                }
                break;
            case 16:
                {
                alt7=5;
                }
                break;
            case 17:
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
                    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:946:1: ( '<' )
                    {
                    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:946:1: ( '<' )
                    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:947:1: '<'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getRelationalExprAccess().getOpLessThanSignKeyword_1_0_1_0_0()); 
                    }
                    match(input,12,FOLLOW_12_in_rule__RelationalExpr__OpAlternatives_1_0_1_02005); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getRelationalExprAccess().getOpLessThanSignKeyword_1_0_1_0_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:954:6: ( '<=' )
                    {
                    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:954:6: ( '<=' )
                    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:955:1: '<='
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getRelationalExprAccess().getOpLessThanSignEqualsSignKeyword_1_0_1_0_1()); 
                    }
                    match(input,13,FOLLOW_13_in_rule__RelationalExpr__OpAlternatives_1_0_1_02025); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getRelationalExprAccess().getOpLessThanSignEqualsSignKeyword_1_0_1_0_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:962:6: ( '>' )
                    {
                    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:962:6: ( '>' )
                    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:963:1: '>'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getRelationalExprAccess().getOpGreaterThanSignKeyword_1_0_1_0_2()); 
                    }
                    match(input,14,FOLLOW_14_in_rule__RelationalExpr__OpAlternatives_1_0_1_02045); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getRelationalExprAccess().getOpGreaterThanSignKeyword_1_0_1_0_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:970:6: ( '>=' )
                    {
                    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:970:6: ( '>=' )
                    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:971:1: '>='
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getRelationalExprAccess().getOpGreaterThanSignEqualsSignKeyword_1_0_1_0_3()); 
                    }
                    match(input,15,FOLLOW_15_in_rule__RelationalExpr__OpAlternatives_1_0_1_02065); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getRelationalExprAccess().getOpGreaterThanSignEqualsSignKeyword_1_0_1_0_3()); 
                    }

                    }


                    }
                    break;
                case 5 :
                    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:978:6: ( '=' )
                    {
                    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:978:6: ( '=' )
                    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:979:1: '='
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getRelationalExprAccess().getOpEqualsSignKeyword_1_0_1_0_4()); 
                    }
                    match(input,16,FOLLOW_16_in_rule__RelationalExpr__OpAlternatives_1_0_1_02085); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getRelationalExprAccess().getOpEqualsSignKeyword_1_0_1_0_4()); 
                    }

                    }


                    }
                    break;
                case 6 :
                    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:986:6: ( '<>' )
                    {
                    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:986:6: ( '<>' )
                    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:987:1: '<>'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getRelationalExprAccess().getOpLessThanSignGreaterThanSignKeyword_1_0_1_0_5()); 
                    }
                    match(input,17,FOLLOW_17_in_rule__RelationalExpr__OpAlternatives_1_0_1_02105); if (state.failed) return ;
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:999:1: rule__PlusExpr__OpAlternatives_1_0_1_0 : ( ( '+' ) | ( '-' ) );
    public final void rule__PlusExpr__OpAlternatives_1_0_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1003:1: ( ( '+' ) | ( '-' ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==18) ) {
                alt8=1;
            }
            else if ( (LA8_0==19) ) {
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
                    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1004:1: ( '+' )
                    {
                    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1004:1: ( '+' )
                    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1005:1: '+'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getPlusExprAccess().getOpPlusSignKeyword_1_0_1_0_0()); 
                    }
                    match(input,18,FOLLOW_18_in_rule__PlusExpr__OpAlternatives_1_0_1_02140); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getPlusExprAccess().getOpPlusSignKeyword_1_0_1_0_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1012:6: ( '-' )
                    {
                    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1012:6: ( '-' )
                    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1013:1: '-'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getPlusExprAccess().getOpHyphenMinusKeyword_1_0_1_0_1()); 
                    }
                    match(input,19,FOLLOW_19_in_rule__PlusExpr__OpAlternatives_1_0_1_02160); if (state.failed) return ;
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1025:1: rule__TimesExpr__OpAlternatives_1_0_1_0 : ( ( '*' ) | ( '/' ) | ( 'div' ) );
    public final void rule__TimesExpr__OpAlternatives_1_0_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1029:1: ( ( '*' ) | ( '/' ) | ( 'div' ) )
            int alt9=3;
            switch ( input.LA(1) ) {
            case 20:
                {
                alt9=1;
                }
                break;
            case 21:
                {
                alt9=2;
                }
                break;
            case 22:
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
                    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1030:1: ( '*' )
                    {
                    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1030:1: ( '*' )
                    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1031:1: '*'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getTimesExprAccess().getOpAsteriskKeyword_1_0_1_0_0()); 
                    }
                    match(input,20,FOLLOW_20_in_rule__TimesExpr__OpAlternatives_1_0_1_02195); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getTimesExprAccess().getOpAsteriskKeyword_1_0_1_0_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1038:6: ( '/' )
                    {
                    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1038:6: ( '/' )
                    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1039:1: '/'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getTimesExprAccess().getOpSolidusKeyword_1_0_1_0_1()); 
                    }
                    match(input,21,FOLLOW_21_in_rule__TimesExpr__OpAlternatives_1_0_1_02215); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getTimesExprAccess().getOpSolidusKeyword_1_0_1_0_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1046:6: ( 'div' )
                    {
                    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1046:6: ( 'div' )
                    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1047:1: 'div'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getTimesExprAccess().getOpDivKeyword_1_0_1_0_2()); 
                    }
                    match(input,22,FOLLOW_22_in_rule__TimesExpr__OpAlternatives_1_0_1_02235); if (state.failed) return ;
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1059:1: rule__PrefixExpr__Alternatives : ( ( ( rule__PrefixExpr__Group_0__0 ) ) | ( ruleProjectionExpr ) );
    public final void rule__PrefixExpr__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1063:1: ( ( ( rule__PrefixExpr__Group_0__0 ) ) | ( ruleProjectionExpr ) )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==19||(LA10_0>=23 && LA10_0<=24)) ) {
                alt10=1;
            }
            else if ( ((LA10_0>=RULE_INT && LA10_0<=RULE_BOOL)||LA10_0==41||LA10_0==51) ) {
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
                    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1064:1: ( ( rule__PrefixExpr__Group_0__0 ) )
                    {
                    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1064:1: ( ( rule__PrefixExpr__Group_0__0 ) )
                    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1065:1: ( rule__PrefixExpr__Group_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getPrefixExprAccess().getGroup_0()); 
                    }
                    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1066:1: ( rule__PrefixExpr__Group_0__0 )
                    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1066:2: rule__PrefixExpr__Group_0__0
                    {
                    pushFollow(FOLLOW_rule__PrefixExpr__Group_0__0_in_rule__PrefixExpr__Alternatives2269);
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
                    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1070:6: ( ruleProjectionExpr )
                    {
                    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1070:6: ( ruleProjectionExpr )
                    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1071:1: ruleProjectionExpr
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getPrefixExprAccess().getProjectionExprParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_ruleProjectionExpr_in_rule__PrefixExpr__Alternatives2287);
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1081:1: rule__PrefixExpr__OpAlternatives_0_1_0 : ( ( '-' ) | ( 'not' ) | ( 'pre' ) );
    public final void rule__PrefixExpr__OpAlternatives_0_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1085:1: ( ( '-' ) | ( 'not' ) | ( 'pre' ) )
            int alt11=3;
            switch ( input.LA(1) ) {
            case 19:
                {
                alt11=1;
                }
                break;
            case 23:
                {
                alt11=2;
                }
                break;
            case 24:
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
                    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1086:1: ( '-' )
                    {
                    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1086:1: ( '-' )
                    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1087:1: '-'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getPrefixExprAccess().getOpHyphenMinusKeyword_0_1_0_0()); 
                    }
                    match(input,19,FOLLOW_19_in_rule__PrefixExpr__OpAlternatives_0_1_02320); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getPrefixExprAccess().getOpHyphenMinusKeyword_0_1_0_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1094:6: ( 'not' )
                    {
                    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1094:6: ( 'not' )
                    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1095:1: 'not'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getPrefixExprAccess().getOpNotKeyword_0_1_0_1()); 
                    }
                    match(input,23,FOLLOW_23_in_rule__PrefixExpr__OpAlternatives_0_1_02340); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getPrefixExprAccess().getOpNotKeyword_0_1_0_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1102:6: ( 'pre' )
                    {
                    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1102:6: ( 'pre' )
                    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1103:1: 'pre'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getPrefixExprAccess().getOpPreKeyword_0_1_0_2()); 
                    }
                    match(input,24,FOLLOW_24_in_rule__PrefixExpr__OpAlternatives_0_1_02360); if (state.failed) return ;
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1115:1: rule__AtomicExpr__Alternatives : ( ( ( rule__AtomicExpr__Group_0__0 ) ) | ( ( rule__AtomicExpr__Group_1__0 ) ) | ( ( rule__AtomicExpr__Group_2__0 ) ) | ( ( rule__AtomicExpr__Group_3__0 ) ) | ( ( rule__AtomicExpr__Group_4__0 ) ) | ( ( rule__AtomicExpr__Group_5__0 ) ) | ( ( rule__AtomicExpr__Group_6__0 ) ) | ( ( rule__AtomicExpr__Group_7__0 ) ) );
    public final void rule__AtomicExpr__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1119:1: ( ( ( rule__AtomicExpr__Group_0__0 ) ) | ( ( rule__AtomicExpr__Group_1__0 ) ) | ( ( rule__AtomicExpr__Group_2__0 ) ) | ( ( rule__AtomicExpr__Group_3__0 ) ) | ( ( rule__AtomicExpr__Group_4__0 ) ) | ( ( rule__AtomicExpr__Group_5__0 ) ) | ( ( rule__AtomicExpr__Group_6__0 ) ) | ( ( rule__AtomicExpr__Group_7__0 ) ) )
            int alt12=8;
            alt12 = dfa12.predict(input);
            switch (alt12) {
                case 1 :
                    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1120:1: ( ( rule__AtomicExpr__Group_0__0 ) )
                    {
                    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1120:1: ( ( rule__AtomicExpr__Group_0__0 ) )
                    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1121:1: ( rule__AtomicExpr__Group_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAtomicExprAccess().getGroup_0()); 
                    }
                    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1122:1: ( rule__AtomicExpr__Group_0__0 )
                    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1122:2: rule__AtomicExpr__Group_0__0
                    {
                    pushFollow(FOLLOW_rule__AtomicExpr__Group_0__0_in_rule__AtomicExpr__Alternatives2394);
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
                    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1126:6: ( ( rule__AtomicExpr__Group_1__0 ) )
                    {
                    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1126:6: ( ( rule__AtomicExpr__Group_1__0 ) )
                    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1127:1: ( rule__AtomicExpr__Group_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAtomicExprAccess().getGroup_1()); 
                    }
                    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1128:1: ( rule__AtomicExpr__Group_1__0 )
                    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1128:2: rule__AtomicExpr__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__AtomicExpr__Group_1__0_in_rule__AtomicExpr__Alternatives2412);
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
                    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1132:6: ( ( rule__AtomicExpr__Group_2__0 ) )
                    {
                    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1132:6: ( ( rule__AtomicExpr__Group_2__0 ) )
                    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1133:1: ( rule__AtomicExpr__Group_2__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAtomicExprAccess().getGroup_2()); 
                    }
                    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1134:1: ( rule__AtomicExpr__Group_2__0 )
                    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1134:2: rule__AtomicExpr__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__AtomicExpr__Group_2__0_in_rule__AtomicExpr__Alternatives2430);
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
                    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1138:6: ( ( rule__AtomicExpr__Group_3__0 ) )
                    {
                    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1138:6: ( ( rule__AtomicExpr__Group_3__0 ) )
                    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1139:1: ( rule__AtomicExpr__Group_3__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAtomicExprAccess().getGroup_3()); 
                    }
                    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1140:1: ( rule__AtomicExpr__Group_3__0 )
                    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1140:2: rule__AtomicExpr__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__AtomicExpr__Group_3__0_in_rule__AtomicExpr__Alternatives2448);
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
                    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1144:6: ( ( rule__AtomicExpr__Group_4__0 ) )
                    {
                    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1144:6: ( ( rule__AtomicExpr__Group_4__0 ) )
                    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1145:1: ( rule__AtomicExpr__Group_4__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAtomicExprAccess().getGroup_4()); 
                    }
                    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1146:1: ( rule__AtomicExpr__Group_4__0 )
                    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1146:2: rule__AtomicExpr__Group_4__0
                    {
                    pushFollow(FOLLOW_rule__AtomicExpr__Group_4__0_in_rule__AtomicExpr__Alternatives2466);
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
                    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1150:6: ( ( rule__AtomicExpr__Group_5__0 ) )
                    {
                    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1150:6: ( ( rule__AtomicExpr__Group_5__0 ) )
                    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1151:1: ( rule__AtomicExpr__Group_5__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAtomicExprAccess().getGroup_5()); 
                    }
                    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1152:1: ( rule__AtomicExpr__Group_5__0 )
                    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1152:2: rule__AtomicExpr__Group_5__0
                    {
                    pushFollow(FOLLOW_rule__AtomicExpr__Group_5__0_in_rule__AtomicExpr__Alternatives2484);
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
                    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1156:6: ( ( rule__AtomicExpr__Group_6__0 ) )
                    {
                    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1156:6: ( ( rule__AtomicExpr__Group_6__0 ) )
                    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1157:1: ( rule__AtomicExpr__Group_6__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAtomicExprAccess().getGroup_6()); 
                    }
                    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1158:1: ( rule__AtomicExpr__Group_6__0 )
                    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1158:2: rule__AtomicExpr__Group_6__0
                    {
                    pushFollow(FOLLOW_rule__AtomicExpr__Group_6__0_in_rule__AtomicExpr__Alternatives2502);
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
                    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1162:6: ( ( rule__AtomicExpr__Group_7__0 ) )
                    {
                    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1162:6: ( ( rule__AtomicExpr__Group_7__0 ) )
                    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1163:1: ( rule__AtomicExpr__Group_7__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAtomicExprAccess().getGroup_7()); 
                    }
                    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1164:1: ( rule__AtomicExpr__Group_7__0 )
                    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1164:2: rule__AtomicExpr__Group_7__0
                    {
                    pushFollow(FOLLOW_rule__AtomicExpr__Group_7__0_in_rule__AtomicExpr__Alternatives2520);
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1176:1: rule__Typedef__Group__0 : rule__Typedef__Group__0__Impl rule__Typedef__Group__1 ;
    public final void rule__Typedef__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1180:1: ( rule__Typedef__Group__0__Impl rule__Typedef__Group__1 )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1181:2: rule__Typedef__Group__0__Impl rule__Typedef__Group__1
            {
            pushFollow(FOLLOW_rule__Typedef__Group__0__Impl_in_rule__Typedef__Group__02552);
            rule__Typedef__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Typedef__Group__1_in_rule__Typedef__Group__02555);
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1188:1: rule__Typedef__Group__0__Impl : ( 'type' ) ;
    public final void rule__Typedef__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1192:1: ( ( 'type' ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1193:1: ( 'type' )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1193:1: ( 'type' )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1194:1: 'type'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypedefAccess().getTypeKeyword_0()); 
            }
            match(input,25,FOLLOW_25_in_rule__Typedef__Group__0__Impl2583); if (state.failed) return ;
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1207:1: rule__Typedef__Group__1 : rule__Typedef__Group__1__Impl rule__Typedef__Group__2 ;
    public final void rule__Typedef__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1211:1: ( rule__Typedef__Group__1__Impl rule__Typedef__Group__2 )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1212:2: rule__Typedef__Group__1__Impl rule__Typedef__Group__2
            {
            pushFollow(FOLLOW_rule__Typedef__Group__1__Impl_in_rule__Typedef__Group__12614);
            rule__Typedef__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Typedef__Group__2_in_rule__Typedef__Group__12617);
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1219:1: rule__Typedef__Group__1__Impl : ( ( rule__Typedef__NameAssignment_1 ) ) ;
    public final void rule__Typedef__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1223:1: ( ( ( rule__Typedef__NameAssignment_1 ) ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1224:1: ( ( rule__Typedef__NameAssignment_1 ) )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1224:1: ( ( rule__Typedef__NameAssignment_1 ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1225:1: ( rule__Typedef__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypedefAccess().getNameAssignment_1()); 
            }
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1226:1: ( rule__Typedef__NameAssignment_1 )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1226:2: rule__Typedef__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Typedef__NameAssignment_1_in_rule__Typedef__Group__1__Impl2644);
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1236:1: rule__Typedef__Group__2 : rule__Typedef__Group__2__Impl rule__Typedef__Group__3 ;
    public final void rule__Typedef__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1240:1: ( rule__Typedef__Group__2__Impl rule__Typedef__Group__3 )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1241:2: rule__Typedef__Group__2__Impl rule__Typedef__Group__3
            {
            pushFollow(FOLLOW_rule__Typedef__Group__2__Impl_in_rule__Typedef__Group__22674);
            rule__Typedef__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Typedef__Group__3_in_rule__Typedef__Group__22677);
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1248:1: rule__Typedef__Group__2__Impl : ( '=' ) ;
    public final void rule__Typedef__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1252:1: ( ( '=' ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1253:1: ( '=' )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1253:1: ( '=' )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1254:1: '='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypedefAccess().getEqualsSignKeyword_2()); 
            }
            match(input,16,FOLLOW_16_in_rule__Typedef__Group__2__Impl2705); if (state.failed) return ;
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1267:1: rule__Typedef__Group__3 : rule__Typedef__Group__3__Impl rule__Typedef__Group__4 ;
    public final void rule__Typedef__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1271:1: ( rule__Typedef__Group__3__Impl rule__Typedef__Group__4 )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1272:2: rule__Typedef__Group__3__Impl rule__Typedef__Group__4
            {
            pushFollow(FOLLOW_rule__Typedef__Group__3__Impl_in_rule__Typedef__Group__32736);
            rule__Typedef__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Typedef__Group__4_in_rule__Typedef__Group__32739);
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1279:1: rule__Typedef__Group__3__Impl : ( ( rule__Typedef__TypeAssignment_3 ) ) ;
    public final void rule__Typedef__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1283:1: ( ( ( rule__Typedef__TypeAssignment_3 ) ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1284:1: ( ( rule__Typedef__TypeAssignment_3 ) )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1284:1: ( ( rule__Typedef__TypeAssignment_3 ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1285:1: ( rule__Typedef__TypeAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypedefAccess().getTypeAssignment_3()); 
            }
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1286:1: ( rule__Typedef__TypeAssignment_3 )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1286:2: rule__Typedef__TypeAssignment_3
            {
            pushFollow(FOLLOW_rule__Typedef__TypeAssignment_3_in_rule__Typedef__Group__3__Impl2766);
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1296:1: rule__Typedef__Group__4 : rule__Typedef__Group__4__Impl ;
    public final void rule__Typedef__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1300:1: ( rule__Typedef__Group__4__Impl )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1301:2: rule__Typedef__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__Typedef__Group__4__Impl_in_rule__Typedef__Group__42796);
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1307:1: rule__Typedef__Group__4__Impl : ( ';' ) ;
    public final void rule__Typedef__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1311:1: ( ( ';' ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1312:1: ( ';' )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1312:1: ( ';' )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1313:1: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypedefAccess().getSemicolonKeyword_4()); 
            }
            match(input,26,FOLLOW_26_in_rule__Typedef__Group__4__Impl2824); if (state.failed) return ;
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1336:1: rule__TopLevelType__Group_0__0 : rule__TopLevelType__Group_0__0__Impl rule__TopLevelType__Group_0__1 ;
    public final void rule__TopLevelType__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1340:1: ( rule__TopLevelType__Group_0__0__Impl rule__TopLevelType__Group_0__1 )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1341:2: rule__TopLevelType__Group_0__0__Impl rule__TopLevelType__Group_0__1
            {
            pushFollow(FOLLOW_rule__TopLevelType__Group_0__0__Impl_in_rule__TopLevelType__Group_0__02865);
            rule__TopLevelType__Group_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__TopLevelType__Group_0__1_in_rule__TopLevelType__Group_0__02868);
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1348:1: rule__TopLevelType__Group_0__0__Impl : ( () ) ;
    public final void rule__TopLevelType__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1352:1: ( ( () ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1353:1: ( () )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1353:1: ( () )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1354:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTopLevelTypeAccess().getRecordTypeAction_0_0()); 
            }
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1355:1: ()
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1357:1: 
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1367:1: rule__TopLevelType__Group_0__1 : rule__TopLevelType__Group_0__1__Impl rule__TopLevelType__Group_0__2 ;
    public final void rule__TopLevelType__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1371:1: ( rule__TopLevelType__Group_0__1__Impl rule__TopLevelType__Group_0__2 )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1372:2: rule__TopLevelType__Group_0__1__Impl rule__TopLevelType__Group_0__2
            {
            pushFollow(FOLLOW_rule__TopLevelType__Group_0__1__Impl_in_rule__TopLevelType__Group_0__12926);
            rule__TopLevelType__Group_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__TopLevelType__Group_0__2_in_rule__TopLevelType__Group_0__12929);
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1379:1: rule__TopLevelType__Group_0__1__Impl : ( 'struct' ) ;
    public final void rule__TopLevelType__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1383:1: ( ( 'struct' ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1384:1: ( 'struct' )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1384:1: ( 'struct' )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1385:1: 'struct'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTopLevelTypeAccess().getStructKeyword_0_1()); 
            }
            match(input,27,FOLLOW_27_in_rule__TopLevelType__Group_0__1__Impl2957); if (state.failed) return ;
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1398:1: rule__TopLevelType__Group_0__2 : rule__TopLevelType__Group_0__2__Impl rule__TopLevelType__Group_0__3 ;
    public final void rule__TopLevelType__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1402:1: ( rule__TopLevelType__Group_0__2__Impl rule__TopLevelType__Group_0__3 )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1403:2: rule__TopLevelType__Group_0__2__Impl rule__TopLevelType__Group_0__3
            {
            pushFollow(FOLLOW_rule__TopLevelType__Group_0__2__Impl_in_rule__TopLevelType__Group_0__22988);
            rule__TopLevelType__Group_0__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__TopLevelType__Group_0__3_in_rule__TopLevelType__Group_0__22991);
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1410:1: rule__TopLevelType__Group_0__2__Impl : ( '{' ) ;
    public final void rule__TopLevelType__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1414:1: ( ( '{' ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1415:1: ( '{' )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1415:1: ( '{' )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1416:1: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTopLevelTypeAccess().getLeftCurlyBracketKeyword_0_2()); 
            }
            match(input,28,FOLLOW_28_in_rule__TopLevelType__Group_0__2__Impl3019); if (state.failed) return ;
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1429:1: rule__TopLevelType__Group_0__3 : rule__TopLevelType__Group_0__3__Impl rule__TopLevelType__Group_0__4 ;
    public final void rule__TopLevelType__Group_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1433:1: ( rule__TopLevelType__Group_0__3__Impl rule__TopLevelType__Group_0__4 )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1434:2: rule__TopLevelType__Group_0__3__Impl rule__TopLevelType__Group_0__4
            {
            pushFollow(FOLLOW_rule__TopLevelType__Group_0__3__Impl_in_rule__TopLevelType__Group_0__33050);
            rule__TopLevelType__Group_0__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__TopLevelType__Group_0__4_in_rule__TopLevelType__Group_0__33053);
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1441:1: rule__TopLevelType__Group_0__3__Impl : ( ( rule__TopLevelType__FieldsAssignment_0_3 ) ) ;
    public final void rule__TopLevelType__Group_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1445:1: ( ( ( rule__TopLevelType__FieldsAssignment_0_3 ) ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1446:1: ( ( rule__TopLevelType__FieldsAssignment_0_3 ) )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1446:1: ( ( rule__TopLevelType__FieldsAssignment_0_3 ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1447:1: ( rule__TopLevelType__FieldsAssignment_0_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTopLevelTypeAccess().getFieldsAssignment_0_3()); 
            }
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1448:1: ( rule__TopLevelType__FieldsAssignment_0_3 )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1448:2: rule__TopLevelType__FieldsAssignment_0_3
            {
            pushFollow(FOLLOW_rule__TopLevelType__FieldsAssignment_0_3_in_rule__TopLevelType__Group_0__3__Impl3080);
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1458:1: rule__TopLevelType__Group_0__4 : rule__TopLevelType__Group_0__4__Impl rule__TopLevelType__Group_0__5 ;
    public final void rule__TopLevelType__Group_0__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1462:1: ( rule__TopLevelType__Group_0__4__Impl rule__TopLevelType__Group_0__5 )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1463:2: rule__TopLevelType__Group_0__4__Impl rule__TopLevelType__Group_0__5
            {
            pushFollow(FOLLOW_rule__TopLevelType__Group_0__4__Impl_in_rule__TopLevelType__Group_0__43110);
            rule__TopLevelType__Group_0__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__TopLevelType__Group_0__5_in_rule__TopLevelType__Group_0__43113);
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1470:1: rule__TopLevelType__Group_0__4__Impl : ( ':' ) ;
    public final void rule__TopLevelType__Group_0__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1474:1: ( ( ':' ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1475:1: ( ':' )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1475:1: ( ':' )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1476:1: ':'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTopLevelTypeAccess().getColonKeyword_0_4()); 
            }
            match(input,29,FOLLOW_29_in_rule__TopLevelType__Group_0__4__Impl3141); if (state.failed) return ;
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1489:1: rule__TopLevelType__Group_0__5 : rule__TopLevelType__Group_0__5__Impl rule__TopLevelType__Group_0__6 ;
    public final void rule__TopLevelType__Group_0__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1493:1: ( rule__TopLevelType__Group_0__5__Impl rule__TopLevelType__Group_0__6 )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1494:2: rule__TopLevelType__Group_0__5__Impl rule__TopLevelType__Group_0__6
            {
            pushFollow(FOLLOW_rule__TopLevelType__Group_0__5__Impl_in_rule__TopLevelType__Group_0__53172);
            rule__TopLevelType__Group_0__5__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__TopLevelType__Group_0__6_in_rule__TopLevelType__Group_0__53175);
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1501:1: rule__TopLevelType__Group_0__5__Impl : ( ( rule__TopLevelType__TypesAssignment_0_5 ) ) ;
    public final void rule__TopLevelType__Group_0__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1505:1: ( ( ( rule__TopLevelType__TypesAssignment_0_5 ) ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1506:1: ( ( rule__TopLevelType__TypesAssignment_0_5 ) )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1506:1: ( ( rule__TopLevelType__TypesAssignment_0_5 ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1507:1: ( rule__TopLevelType__TypesAssignment_0_5 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTopLevelTypeAccess().getTypesAssignment_0_5()); 
            }
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1508:1: ( rule__TopLevelType__TypesAssignment_0_5 )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1508:2: rule__TopLevelType__TypesAssignment_0_5
            {
            pushFollow(FOLLOW_rule__TopLevelType__TypesAssignment_0_5_in_rule__TopLevelType__Group_0__5__Impl3202);
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1518:1: rule__TopLevelType__Group_0__6 : rule__TopLevelType__Group_0__6__Impl rule__TopLevelType__Group_0__7 ;
    public final void rule__TopLevelType__Group_0__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1522:1: ( rule__TopLevelType__Group_0__6__Impl rule__TopLevelType__Group_0__7 )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1523:2: rule__TopLevelType__Group_0__6__Impl rule__TopLevelType__Group_0__7
            {
            pushFollow(FOLLOW_rule__TopLevelType__Group_0__6__Impl_in_rule__TopLevelType__Group_0__63232);
            rule__TopLevelType__Group_0__6__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__TopLevelType__Group_0__7_in_rule__TopLevelType__Group_0__63235);
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1530:1: rule__TopLevelType__Group_0__6__Impl : ( ( rule__TopLevelType__Group_0_6__0 )* ) ;
    public final void rule__TopLevelType__Group_0__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1534:1: ( ( ( rule__TopLevelType__Group_0_6__0 )* ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1535:1: ( ( rule__TopLevelType__Group_0_6__0 )* )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1535:1: ( ( rule__TopLevelType__Group_0_6__0 )* )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1536:1: ( rule__TopLevelType__Group_0_6__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTopLevelTypeAccess().getGroup_0_6()); 
            }
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1537:1: ( rule__TopLevelType__Group_0_6__0 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==26) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1537:2: rule__TopLevelType__Group_0_6__0
            	    {
            	    pushFollow(FOLLOW_rule__TopLevelType__Group_0_6__0_in_rule__TopLevelType__Group_0__6__Impl3262);
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1547:1: rule__TopLevelType__Group_0__7 : rule__TopLevelType__Group_0__7__Impl ;
    public final void rule__TopLevelType__Group_0__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1551:1: ( rule__TopLevelType__Group_0__7__Impl )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1552:2: rule__TopLevelType__Group_0__7__Impl
            {
            pushFollow(FOLLOW_rule__TopLevelType__Group_0__7__Impl_in_rule__TopLevelType__Group_0__73293);
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1558:1: rule__TopLevelType__Group_0__7__Impl : ( '}' ) ;
    public final void rule__TopLevelType__Group_0__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1562:1: ( ( '}' ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1563:1: ( '}' )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1563:1: ( '}' )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1564:1: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTopLevelTypeAccess().getRightCurlyBracketKeyword_0_7()); 
            }
            match(input,30,FOLLOW_30_in_rule__TopLevelType__Group_0__7__Impl3321); if (state.failed) return ;
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1593:1: rule__TopLevelType__Group_0_6__0 : rule__TopLevelType__Group_0_6__0__Impl rule__TopLevelType__Group_0_6__1 ;
    public final void rule__TopLevelType__Group_0_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1597:1: ( rule__TopLevelType__Group_0_6__0__Impl rule__TopLevelType__Group_0_6__1 )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1598:2: rule__TopLevelType__Group_0_6__0__Impl rule__TopLevelType__Group_0_6__1
            {
            pushFollow(FOLLOW_rule__TopLevelType__Group_0_6__0__Impl_in_rule__TopLevelType__Group_0_6__03368);
            rule__TopLevelType__Group_0_6__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__TopLevelType__Group_0_6__1_in_rule__TopLevelType__Group_0_6__03371);
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1605:1: rule__TopLevelType__Group_0_6__0__Impl : ( ';' ) ;
    public final void rule__TopLevelType__Group_0_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1609:1: ( ( ';' ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1610:1: ( ';' )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1610:1: ( ';' )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1611:1: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTopLevelTypeAccess().getSemicolonKeyword_0_6_0()); 
            }
            match(input,26,FOLLOW_26_in_rule__TopLevelType__Group_0_6__0__Impl3399); if (state.failed) return ;
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1624:1: rule__TopLevelType__Group_0_6__1 : rule__TopLevelType__Group_0_6__1__Impl rule__TopLevelType__Group_0_6__2 ;
    public final void rule__TopLevelType__Group_0_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1628:1: ( rule__TopLevelType__Group_0_6__1__Impl rule__TopLevelType__Group_0_6__2 )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1629:2: rule__TopLevelType__Group_0_6__1__Impl rule__TopLevelType__Group_0_6__2
            {
            pushFollow(FOLLOW_rule__TopLevelType__Group_0_6__1__Impl_in_rule__TopLevelType__Group_0_6__13430);
            rule__TopLevelType__Group_0_6__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__TopLevelType__Group_0_6__2_in_rule__TopLevelType__Group_0_6__13433);
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1636:1: rule__TopLevelType__Group_0_6__1__Impl : ( ( rule__TopLevelType__FieldsAssignment_0_6_1 ) ) ;
    public final void rule__TopLevelType__Group_0_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1640:1: ( ( ( rule__TopLevelType__FieldsAssignment_0_6_1 ) ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1641:1: ( ( rule__TopLevelType__FieldsAssignment_0_6_1 ) )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1641:1: ( ( rule__TopLevelType__FieldsAssignment_0_6_1 ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1642:1: ( rule__TopLevelType__FieldsAssignment_0_6_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTopLevelTypeAccess().getFieldsAssignment_0_6_1()); 
            }
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1643:1: ( rule__TopLevelType__FieldsAssignment_0_6_1 )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1643:2: rule__TopLevelType__FieldsAssignment_0_6_1
            {
            pushFollow(FOLLOW_rule__TopLevelType__FieldsAssignment_0_6_1_in_rule__TopLevelType__Group_0_6__1__Impl3460);
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1653:1: rule__TopLevelType__Group_0_6__2 : rule__TopLevelType__Group_0_6__2__Impl rule__TopLevelType__Group_0_6__3 ;
    public final void rule__TopLevelType__Group_0_6__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1657:1: ( rule__TopLevelType__Group_0_6__2__Impl rule__TopLevelType__Group_0_6__3 )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1658:2: rule__TopLevelType__Group_0_6__2__Impl rule__TopLevelType__Group_0_6__3
            {
            pushFollow(FOLLOW_rule__TopLevelType__Group_0_6__2__Impl_in_rule__TopLevelType__Group_0_6__23490);
            rule__TopLevelType__Group_0_6__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__TopLevelType__Group_0_6__3_in_rule__TopLevelType__Group_0_6__23493);
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1665:1: rule__TopLevelType__Group_0_6__2__Impl : ( ':' ) ;
    public final void rule__TopLevelType__Group_0_6__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1669:1: ( ( ':' ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1670:1: ( ':' )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1670:1: ( ':' )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1671:1: ':'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTopLevelTypeAccess().getColonKeyword_0_6_2()); 
            }
            match(input,29,FOLLOW_29_in_rule__TopLevelType__Group_0_6__2__Impl3521); if (state.failed) return ;
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1684:1: rule__TopLevelType__Group_0_6__3 : rule__TopLevelType__Group_0_6__3__Impl ;
    public final void rule__TopLevelType__Group_0_6__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1688:1: ( rule__TopLevelType__Group_0_6__3__Impl )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1689:2: rule__TopLevelType__Group_0_6__3__Impl
            {
            pushFollow(FOLLOW_rule__TopLevelType__Group_0_6__3__Impl_in_rule__TopLevelType__Group_0_6__33552);
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1695:1: rule__TopLevelType__Group_0_6__3__Impl : ( ( rule__TopLevelType__TypesAssignment_0_6_3 ) ) ;
    public final void rule__TopLevelType__Group_0_6__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1699:1: ( ( ( rule__TopLevelType__TypesAssignment_0_6_3 ) ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1700:1: ( ( rule__TopLevelType__TypesAssignment_0_6_3 ) )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1700:1: ( ( rule__TopLevelType__TypesAssignment_0_6_3 ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1701:1: ( rule__TopLevelType__TypesAssignment_0_6_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTopLevelTypeAccess().getTypesAssignment_0_6_3()); 
            }
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1702:1: ( rule__TopLevelType__TypesAssignment_0_6_3 )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1702:2: rule__TopLevelType__TypesAssignment_0_6_3
            {
            pushFollow(FOLLOW_rule__TopLevelType__TypesAssignment_0_6_3_in_rule__TopLevelType__Group_0_6__3__Impl3579);
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1720:1: rule__Type__Group_0__0 : rule__Type__Group_0__0__Impl rule__Type__Group_0__1 ;
    public final void rule__Type__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1724:1: ( rule__Type__Group_0__0__Impl rule__Type__Group_0__1 )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1725:2: rule__Type__Group_0__0__Impl rule__Type__Group_0__1
            {
            pushFollow(FOLLOW_rule__Type__Group_0__0__Impl_in_rule__Type__Group_0__03617);
            rule__Type__Group_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Type__Group_0__1_in_rule__Type__Group_0__03620);
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1732:1: rule__Type__Group_0__0__Impl : ( () ) ;
    public final void rule__Type__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1736:1: ( ( () ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1737:1: ( () )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1737:1: ( () )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1738:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypeAccess().getIntTypeAction_0_0()); 
            }
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1739:1: ()
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1741:1: 
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1751:1: rule__Type__Group_0__1 : rule__Type__Group_0__1__Impl ;
    public final void rule__Type__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1755:1: ( rule__Type__Group_0__1__Impl )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1756:2: rule__Type__Group_0__1__Impl
            {
            pushFollow(FOLLOW_rule__Type__Group_0__1__Impl_in_rule__Type__Group_0__13678);
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1762:1: rule__Type__Group_0__1__Impl : ( 'int' ) ;
    public final void rule__Type__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1766:1: ( ( 'int' ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1767:1: ( 'int' )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1767:1: ( 'int' )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1768:1: 'int'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypeAccess().getIntKeyword_0_1()); 
            }
            match(input,31,FOLLOW_31_in_rule__Type__Group_0__1__Impl3706); if (state.failed) return ;
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1785:1: rule__Type__Group_1__0 : rule__Type__Group_1__0__Impl rule__Type__Group_1__1 ;
    public final void rule__Type__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1789:1: ( rule__Type__Group_1__0__Impl rule__Type__Group_1__1 )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1790:2: rule__Type__Group_1__0__Impl rule__Type__Group_1__1
            {
            pushFollow(FOLLOW_rule__Type__Group_1__0__Impl_in_rule__Type__Group_1__03741);
            rule__Type__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Type__Group_1__1_in_rule__Type__Group_1__03744);
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1797:1: rule__Type__Group_1__0__Impl : ( () ) ;
    public final void rule__Type__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1801:1: ( ( () ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1802:1: ( () )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1802:1: ( () )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1803:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypeAccess().getBoolTypeAction_1_0()); 
            }
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1804:1: ()
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1806:1: 
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1816:1: rule__Type__Group_1__1 : rule__Type__Group_1__1__Impl ;
    public final void rule__Type__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1820:1: ( rule__Type__Group_1__1__Impl )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1821:2: rule__Type__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Type__Group_1__1__Impl_in_rule__Type__Group_1__13802);
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1827:1: rule__Type__Group_1__1__Impl : ( 'bool' ) ;
    public final void rule__Type__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1831:1: ( ( 'bool' ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1832:1: ( 'bool' )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1832:1: ( 'bool' )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1833:1: 'bool'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypeAccess().getBoolKeyword_1_1()); 
            }
            match(input,32,FOLLOW_32_in_rule__Type__Group_1__1__Impl3830); if (state.failed) return ;
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1850:1: rule__Type__Group_2__0 : rule__Type__Group_2__0__Impl rule__Type__Group_2__1 ;
    public final void rule__Type__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1854:1: ( rule__Type__Group_2__0__Impl rule__Type__Group_2__1 )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1855:2: rule__Type__Group_2__0__Impl rule__Type__Group_2__1
            {
            pushFollow(FOLLOW_rule__Type__Group_2__0__Impl_in_rule__Type__Group_2__03865);
            rule__Type__Group_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Type__Group_2__1_in_rule__Type__Group_2__03868);
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1862:1: rule__Type__Group_2__0__Impl : ( () ) ;
    public final void rule__Type__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1866:1: ( ( () ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1867:1: ( () )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1867:1: ( () )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1868:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypeAccess().getRealTypeAction_2_0()); 
            }
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1869:1: ()
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1871:1: 
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1881:1: rule__Type__Group_2__1 : rule__Type__Group_2__1__Impl ;
    public final void rule__Type__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1885:1: ( rule__Type__Group_2__1__Impl )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1886:2: rule__Type__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__Type__Group_2__1__Impl_in_rule__Type__Group_2__13926);
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1892:1: rule__Type__Group_2__1__Impl : ( 'real' ) ;
    public final void rule__Type__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1896:1: ( ( 'real' ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1897:1: ( 'real' )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1897:1: ( 'real' )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1898:1: 'real'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypeAccess().getRealKeyword_2_1()); 
            }
            match(input,33,FOLLOW_33_in_rule__Type__Group_2__1__Impl3954); if (state.failed) return ;
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1915:1: rule__Type__Group_3__0 : rule__Type__Group_3__0__Impl rule__Type__Group_3__1 ;
    public final void rule__Type__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1919:1: ( rule__Type__Group_3__0__Impl rule__Type__Group_3__1 )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1920:2: rule__Type__Group_3__0__Impl rule__Type__Group_3__1
            {
            pushFollow(FOLLOW_rule__Type__Group_3__0__Impl_in_rule__Type__Group_3__03989);
            rule__Type__Group_3__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Type__Group_3__1_in_rule__Type__Group_3__03992);
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1927:1: rule__Type__Group_3__0__Impl : ( () ) ;
    public final void rule__Type__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1931:1: ( ( () ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1932:1: ( () )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1932:1: ( () )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1933:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypeAccess().getSubrangeTypeAction_3_0()); 
            }
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1934:1: ()
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1936:1: 
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1946:1: rule__Type__Group_3__1 : rule__Type__Group_3__1__Impl rule__Type__Group_3__2 ;
    public final void rule__Type__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1950:1: ( rule__Type__Group_3__1__Impl rule__Type__Group_3__2 )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1951:2: rule__Type__Group_3__1__Impl rule__Type__Group_3__2
            {
            pushFollow(FOLLOW_rule__Type__Group_3__1__Impl_in_rule__Type__Group_3__14050);
            rule__Type__Group_3__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Type__Group_3__2_in_rule__Type__Group_3__14053);
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1958:1: rule__Type__Group_3__1__Impl : ( 'subrange' ) ;
    public final void rule__Type__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1962:1: ( ( 'subrange' ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1963:1: ( 'subrange' )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1963:1: ( 'subrange' )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1964:1: 'subrange'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypeAccess().getSubrangeKeyword_3_1()); 
            }
            match(input,34,FOLLOW_34_in_rule__Type__Group_3__1__Impl4081); if (state.failed) return ;
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1977:1: rule__Type__Group_3__2 : rule__Type__Group_3__2__Impl rule__Type__Group_3__3 ;
    public final void rule__Type__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1981:1: ( rule__Type__Group_3__2__Impl rule__Type__Group_3__3 )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1982:2: rule__Type__Group_3__2__Impl rule__Type__Group_3__3
            {
            pushFollow(FOLLOW_rule__Type__Group_3__2__Impl_in_rule__Type__Group_3__24112);
            rule__Type__Group_3__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Type__Group_3__3_in_rule__Type__Group_3__24115);
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1989:1: rule__Type__Group_3__2__Impl : ( '[' ) ;
    public final void rule__Type__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1993:1: ( ( '[' ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1994:1: ( '[' )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1994:1: ( '[' )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:1995:1: '['
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypeAccess().getLeftSquareBracketKeyword_3_2()); 
            }
            match(input,35,FOLLOW_35_in_rule__Type__Group_3__2__Impl4143); if (state.failed) return ;
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2008:1: rule__Type__Group_3__3 : rule__Type__Group_3__3__Impl rule__Type__Group_3__4 ;
    public final void rule__Type__Group_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2012:1: ( rule__Type__Group_3__3__Impl rule__Type__Group_3__4 )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2013:2: rule__Type__Group_3__3__Impl rule__Type__Group_3__4
            {
            pushFollow(FOLLOW_rule__Type__Group_3__3__Impl_in_rule__Type__Group_3__34174);
            rule__Type__Group_3__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Type__Group_3__4_in_rule__Type__Group_3__34177);
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2020:1: rule__Type__Group_3__3__Impl : ( ( rule__Type__LowAssignment_3_3 ) ) ;
    public final void rule__Type__Group_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2024:1: ( ( ( rule__Type__LowAssignment_3_3 ) ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2025:1: ( ( rule__Type__LowAssignment_3_3 ) )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2025:1: ( ( rule__Type__LowAssignment_3_3 ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2026:1: ( rule__Type__LowAssignment_3_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypeAccess().getLowAssignment_3_3()); 
            }
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2027:1: ( rule__Type__LowAssignment_3_3 )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2027:2: rule__Type__LowAssignment_3_3
            {
            pushFollow(FOLLOW_rule__Type__LowAssignment_3_3_in_rule__Type__Group_3__3__Impl4204);
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2037:1: rule__Type__Group_3__4 : rule__Type__Group_3__4__Impl rule__Type__Group_3__5 ;
    public final void rule__Type__Group_3__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2041:1: ( rule__Type__Group_3__4__Impl rule__Type__Group_3__5 )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2042:2: rule__Type__Group_3__4__Impl rule__Type__Group_3__5
            {
            pushFollow(FOLLOW_rule__Type__Group_3__4__Impl_in_rule__Type__Group_3__44234);
            rule__Type__Group_3__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Type__Group_3__5_in_rule__Type__Group_3__44237);
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2049:1: rule__Type__Group_3__4__Impl : ( ',' ) ;
    public final void rule__Type__Group_3__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2053:1: ( ( ',' ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2054:1: ( ',' )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2054:1: ( ',' )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2055:1: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypeAccess().getCommaKeyword_3_4()); 
            }
            match(input,36,FOLLOW_36_in_rule__Type__Group_3__4__Impl4265); if (state.failed) return ;
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2068:1: rule__Type__Group_3__5 : rule__Type__Group_3__5__Impl rule__Type__Group_3__6 ;
    public final void rule__Type__Group_3__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2072:1: ( rule__Type__Group_3__5__Impl rule__Type__Group_3__6 )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2073:2: rule__Type__Group_3__5__Impl rule__Type__Group_3__6
            {
            pushFollow(FOLLOW_rule__Type__Group_3__5__Impl_in_rule__Type__Group_3__54296);
            rule__Type__Group_3__5__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Type__Group_3__6_in_rule__Type__Group_3__54299);
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2080:1: rule__Type__Group_3__5__Impl : ( ( rule__Type__HighAssignment_3_5 ) ) ;
    public final void rule__Type__Group_3__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2084:1: ( ( ( rule__Type__HighAssignment_3_5 ) ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2085:1: ( ( rule__Type__HighAssignment_3_5 ) )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2085:1: ( ( rule__Type__HighAssignment_3_5 ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2086:1: ( rule__Type__HighAssignment_3_5 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypeAccess().getHighAssignment_3_5()); 
            }
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2087:1: ( rule__Type__HighAssignment_3_5 )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2087:2: rule__Type__HighAssignment_3_5
            {
            pushFollow(FOLLOW_rule__Type__HighAssignment_3_5_in_rule__Type__Group_3__5__Impl4326);
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2097:1: rule__Type__Group_3__6 : rule__Type__Group_3__6__Impl rule__Type__Group_3__7 ;
    public final void rule__Type__Group_3__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2101:1: ( rule__Type__Group_3__6__Impl rule__Type__Group_3__7 )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2102:2: rule__Type__Group_3__6__Impl rule__Type__Group_3__7
            {
            pushFollow(FOLLOW_rule__Type__Group_3__6__Impl_in_rule__Type__Group_3__64356);
            rule__Type__Group_3__6__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Type__Group_3__7_in_rule__Type__Group_3__64359);
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2109:1: rule__Type__Group_3__6__Impl : ( ']' ) ;
    public final void rule__Type__Group_3__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2113:1: ( ( ']' ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2114:1: ( ']' )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2114:1: ( ']' )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2115:1: ']'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypeAccess().getRightSquareBracketKeyword_3_6()); 
            }
            match(input,37,FOLLOW_37_in_rule__Type__Group_3__6__Impl4387); if (state.failed) return ;
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2128:1: rule__Type__Group_3__7 : rule__Type__Group_3__7__Impl rule__Type__Group_3__8 ;
    public final void rule__Type__Group_3__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2132:1: ( rule__Type__Group_3__7__Impl rule__Type__Group_3__8 )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2133:2: rule__Type__Group_3__7__Impl rule__Type__Group_3__8
            {
            pushFollow(FOLLOW_rule__Type__Group_3__7__Impl_in_rule__Type__Group_3__74418);
            rule__Type__Group_3__7__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Type__Group_3__8_in_rule__Type__Group_3__74421);
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2140:1: rule__Type__Group_3__7__Impl : ( 'of' ) ;
    public final void rule__Type__Group_3__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2144:1: ( ( 'of' ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2145:1: ( 'of' )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2145:1: ( 'of' )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2146:1: 'of'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypeAccess().getOfKeyword_3_7()); 
            }
            match(input,38,FOLLOW_38_in_rule__Type__Group_3__7__Impl4449); if (state.failed) return ;
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2159:1: rule__Type__Group_3__8 : rule__Type__Group_3__8__Impl ;
    public final void rule__Type__Group_3__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2163:1: ( rule__Type__Group_3__8__Impl )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2164:2: rule__Type__Group_3__8__Impl
            {
            pushFollow(FOLLOW_rule__Type__Group_3__8__Impl_in_rule__Type__Group_3__84480);
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2170:1: rule__Type__Group_3__8__Impl : ( 'int' ) ;
    public final void rule__Type__Group_3__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2174:1: ( ( 'int' ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2175:1: ( 'int' )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2175:1: ( 'int' )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2176:1: 'int'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypeAccess().getIntKeyword_3_8()); 
            }
            match(input,31,FOLLOW_31_in_rule__Type__Group_3__8__Impl4508); if (state.failed) return ;
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2207:1: rule__Type__Group_4__0 : rule__Type__Group_4__0__Impl rule__Type__Group_4__1 ;
    public final void rule__Type__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2211:1: ( rule__Type__Group_4__0__Impl rule__Type__Group_4__1 )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2212:2: rule__Type__Group_4__0__Impl rule__Type__Group_4__1
            {
            pushFollow(FOLLOW_rule__Type__Group_4__0__Impl_in_rule__Type__Group_4__04557);
            rule__Type__Group_4__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Type__Group_4__1_in_rule__Type__Group_4__04560);
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2219:1: rule__Type__Group_4__0__Impl : ( () ) ;
    public final void rule__Type__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2223:1: ( ( () ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2224:1: ( () )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2224:1: ( () )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2225:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypeAccess().getUserTypeAction_4_0()); 
            }
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2226:1: ()
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2228:1: 
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2238:1: rule__Type__Group_4__1 : rule__Type__Group_4__1__Impl ;
    public final void rule__Type__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2242:1: ( rule__Type__Group_4__1__Impl )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2243:2: rule__Type__Group_4__1__Impl
            {
            pushFollow(FOLLOW_rule__Type__Group_4__1__Impl_in_rule__Type__Group_4__14618);
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2249:1: rule__Type__Group_4__1__Impl : ( ( rule__Type__DefAssignment_4_1 ) ) ;
    public final void rule__Type__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2253:1: ( ( ( rule__Type__DefAssignment_4_1 ) ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2254:1: ( ( rule__Type__DefAssignment_4_1 ) )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2254:1: ( ( rule__Type__DefAssignment_4_1 ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2255:1: ( rule__Type__DefAssignment_4_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypeAccess().getDefAssignment_4_1()); 
            }
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2256:1: ( rule__Type__DefAssignment_4_1 )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2256:2: rule__Type__DefAssignment_4_1
            {
            pushFollow(FOLLOW_rule__Type__DefAssignment_4_1_in_rule__Type__Group_4__1__Impl4645);
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2270:1: rule__Bound__Group__0 : rule__Bound__Group__0__Impl rule__Bound__Group__1 ;
    public final void rule__Bound__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2274:1: ( rule__Bound__Group__0__Impl rule__Bound__Group__1 )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2275:2: rule__Bound__Group__0__Impl rule__Bound__Group__1
            {
            pushFollow(FOLLOW_rule__Bound__Group__0__Impl_in_rule__Bound__Group__04679);
            rule__Bound__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Bound__Group__1_in_rule__Bound__Group__04682);
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2282:1: rule__Bound__Group__0__Impl : ( ( '-' )? ) ;
    public final void rule__Bound__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2286:1: ( ( ( '-' )? ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2287:1: ( ( '-' )? )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2287:1: ( ( '-' )? )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2288:1: ( '-' )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBoundAccess().getHyphenMinusKeyword_0()); 
            }
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2289:1: ( '-' )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==19) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2290:2: '-'
                    {
                    match(input,19,FOLLOW_19_in_rule__Bound__Group__0__Impl4711); if (state.failed) return ;

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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2301:1: rule__Bound__Group__1 : rule__Bound__Group__1__Impl ;
    public final void rule__Bound__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2305:1: ( rule__Bound__Group__1__Impl )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2306:2: rule__Bound__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Bound__Group__1__Impl_in_rule__Bound__Group__14744);
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2312:1: rule__Bound__Group__1__Impl : ( RULE_INT ) ;
    public final void rule__Bound__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2316:1: ( ( RULE_INT ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2317:1: ( RULE_INT )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2317:1: ( RULE_INT )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2318:1: RULE_INT
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBoundAccess().getINTTerminalRuleCall_1()); 
            }
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__Bound__Group__1__Impl4771); if (state.failed) return ;
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2333:1: rule__Constant__Group__0 : rule__Constant__Group__0__Impl rule__Constant__Group__1 ;
    public final void rule__Constant__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2337:1: ( rule__Constant__Group__0__Impl rule__Constant__Group__1 )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2338:2: rule__Constant__Group__0__Impl rule__Constant__Group__1
            {
            pushFollow(FOLLOW_rule__Constant__Group__0__Impl_in_rule__Constant__Group__04804);
            rule__Constant__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Constant__Group__1_in_rule__Constant__Group__04807);
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2345:1: rule__Constant__Group__0__Impl : ( 'const' ) ;
    public final void rule__Constant__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2349:1: ( ( 'const' ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2350:1: ( 'const' )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2350:1: ( 'const' )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2351:1: 'const'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConstantAccess().getConstKeyword_0()); 
            }
            match(input,39,FOLLOW_39_in_rule__Constant__Group__0__Impl4835); if (state.failed) return ;
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2364:1: rule__Constant__Group__1 : rule__Constant__Group__1__Impl rule__Constant__Group__2 ;
    public final void rule__Constant__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2368:1: ( rule__Constant__Group__1__Impl rule__Constant__Group__2 )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2369:2: rule__Constant__Group__1__Impl rule__Constant__Group__2
            {
            pushFollow(FOLLOW_rule__Constant__Group__1__Impl_in_rule__Constant__Group__14866);
            rule__Constant__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Constant__Group__2_in_rule__Constant__Group__14869);
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2376:1: rule__Constant__Group__1__Impl : ( ( rule__Constant__NameAssignment_1 ) ) ;
    public final void rule__Constant__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2380:1: ( ( ( rule__Constant__NameAssignment_1 ) ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2381:1: ( ( rule__Constant__NameAssignment_1 ) )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2381:1: ( ( rule__Constant__NameAssignment_1 ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2382:1: ( rule__Constant__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConstantAccess().getNameAssignment_1()); 
            }
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2383:1: ( rule__Constant__NameAssignment_1 )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2383:2: rule__Constant__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Constant__NameAssignment_1_in_rule__Constant__Group__1__Impl4896);
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2393:1: rule__Constant__Group__2 : rule__Constant__Group__2__Impl rule__Constant__Group__3 ;
    public final void rule__Constant__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2397:1: ( rule__Constant__Group__2__Impl rule__Constant__Group__3 )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2398:2: rule__Constant__Group__2__Impl rule__Constant__Group__3
            {
            pushFollow(FOLLOW_rule__Constant__Group__2__Impl_in_rule__Constant__Group__24926);
            rule__Constant__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Constant__Group__3_in_rule__Constant__Group__24929);
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2405:1: rule__Constant__Group__2__Impl : ( ( rule__Constant__Group_2__0 )? ) ;
    public final void rule__Constant__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2409:1: ( ( ( rule__Constant__Group_2__0 )? ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2410:1: ( ( rule__Constant__Group_2__0 )? )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2410:1: ( ( rule__Constant__Group_2__0 )? )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2411:1: ( rule__Constant__Group_2__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConstantAccess().getGroup_2()); 
            }
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2412:1: ( rule__Constant__Group_2__0 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==29) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2412:2: rule__Constant__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__Constant__Group_2__0_in_rule__Constant__Group__2__Impl4956);
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2422:1: rule__Constant__Group__3 : rule__Constant__Group__3__Impl rule__Constant__Group__4 ;
    public final void rule__Constant__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2426:1: ( rule__Constant__Group__3__Impl rule__Constant__Group__4 )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2427:2: rule__Constant__Group__3__Impl rule__Constant__Group__4
            {
            pushFollow(FOLLOW_rule__Constant__Group__3__Impl_in_rule__Constant__Group__34987);
            rule__Constant__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Constant__Group__4_in_rule__Constant__Group__34990);
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2434:1: rule__Constant__Group__3__Impl : ( '=' ) ;
    public final void rule__Constant__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2438:1: ( ( '=' ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2439:1: ( '=' )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2439:1: ( '=' )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2440:1: '='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConstantAccess().getEqualsSignKeyword_3()); 
            }
            match(input,16,FOLLOW_16_in_rule__Constant__Group__3__Impl5018); if (state.failed) return ;
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2453:1: rule__Constant__Group__4 : rule__Constant__Group__4__Impl rule__Constant__Group__5 ;
    public final void rule__Constant__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2457:1: ( rule__Constant__Group__4__Impl rule__Constant__Group__5 )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2458:2: rule__Constant__Group__4__Impl rule__Constant__Group__5
            {
            pushFollow(FOLLOW_rule__Constant__Group__4__Impl_in_rule__Constant__Group__45049);
            rule__Constant__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Constant__Group__5_in_rule__Constant__Group__45052);
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2465:1: rule__Constant__Group__4__Impl : ( ( rule__Constant__ExprAssignment_4 ) ) ;
    public final void rule__Constant__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2469:1: ( ( ( rule__Constant__ExprAssignment_4 ) ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2470:1: ( ( rule__Constant__ExprAssignment_4 ) )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2470:1: ( ( rule__Constant__ExprAssignment_4 ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2471:1: ( rule__Constant__ExprAssignment_4 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConstantAccess().getExprAssignment_4()); 
            }
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2472:1: ( rule__Constant__ExprAssignment_4 )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2472:2: rule__Constant__ExprAssignment_4
            {
            pushFollow(FOLLOW_rule__Constant__ExprAssignment_4_in_rule__Constant__Group__4__Impl5079);
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2482:1: rule__Constant__Group__5 : rule__Constant__Group__5__Impl ;
    public final void rule__Constant__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2486:1: ( rule__Constant__Group__5__Impl )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2487:2: rule__Constant__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__Constant__Group__5__Impl_in_rule__Constant__Group__55109);
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2493:1: rule__Constant__Group__5__Impl : ( ';' ) ;
    public final void rule__Constant__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2497:1: ( ( ';' ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2498:1: ( ';' )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2498:1: ( ';' )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2499:1: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConstantAccess().getSemicolonKeyword_5()); 
            }
            match(input,26,FOLLOW_26_in_rule__Constant__Group__5__Impl5137); if (state.failed) return ;
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2524:1: rule__Constant__Group_2__0 : rule__Constant__Group_2__0__Impl rule__Constant__Group_2__1 ;
    public final void rule__Constant__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2528:1: ( rule__Constant__Group_2__0__Impl rule__Constant__Group_2__1 )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2529:2: rule__Constant__Group_2__0__Impl rule__Constant__Group_2__1
            {
            pushFollow(FOLLOW_rule__Constant__Group_2__0__Impl_in_rule__Constant__Group_2__05180);
            rule__Constant__Group_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Constant__Group_2__1_in_rule__Constant__Group_2__05183);
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2536:1: rule__Constant__Group_2__0__Impl : ( ':' ) ;
    public final void rule__Constant__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2540:1: ( ( ':' ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2541:1: ( ':' )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2541:1: ( ':' )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2542:1: ':'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConstantAccess().getColonKeyword_2_0()); 
            }
            match(input,29,FOLLOW_29_in_rule__Constant__Group_2__0__Impl5211); if (state.failed) return ;
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2555:1: rule__Constant__Group_2__1 : rule__Constant__Group_2__1__Impl ;
    public final void rule__Constant__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2559:1: ( rule__Constant__Group_2__1__Impl )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2560:2: rule__Constant__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__Constant__Group_2__1__Impl_in_rule__Constant__Group_2__15242);
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2566:1: rule__Constant__Group_2__1__Impl : ( ( rule__Constant__TypeAssignment_2_1 ) ) ;
    public final void rule__Constant__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2570:1: ( ( ( rule__Constant__TypeAssignment_2_1 ) ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2571:1: ( ( rule__Constant__TypeAssignment_2_1 ) )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2571:1: ( ( rule__Constant__TypeAssignment_2_1 ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2572:1: ( rule__Constant__TypeAssignment_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConstantAccess().getTypeAssignment_2_1()); 
            }
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2573:1: ( rule__Constant__TypeAssignment_2_1 )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2573:2: rule__Constant__TypeAssignment_2_1
            {
            pushFollow(FOLLOW_rule__Constant__TypeAssignment_2_1_in_rule__Constant__Group_2__1__Impl5269);
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2587:1: rule__Node__Group__0 : rule__Node__Group__0__Impl rule__Node__Group__1 ;
    public final void rule__Node__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2591:1: ( rule__Node__Group__0__Impl rule__Node__Group__1 )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2592:2: rule__Node__Group__0__Impl rule__Node__Group__1
            {
            pushFollow(FOLLOW_rule__Node__Group__0__Impl_in_rule__Node__Group__05303);
            rule__Node__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Node__Group__1_in_rule__Node__Group__05306);
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2599:1: rule__Node__Group__0__Impl : ( 'node' ) ;
    public final void rule__Node__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2603:1: ( ( 'node' ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2604:1: ( 'node' )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2604:1: ( 'node' )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2605:1: 'node'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNodeAccess().getNodeKeyword_0()); 
            }
            match(input,40,FOLLOW_40_in_rule__Node__Group__0__Impl5334); if (state.failed) return ;
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2618:1: rule__Node__Group__1 : rule__Node__Group__1__Impl rule__Node__Group__2 ;
    public final void rule__Node__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2622:1: ( rule__Node__Group__1__Impl rule__Node__Group__2 )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2623:2: rule__Node__Group__1__Impl rule__Node__Group__2
            {
            pushFollow(FOLLOW_rule__Node__Group__1__Impl_in_rule__Node__Group__15365);
            rule__Node__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Node__Group__2_in_rule__Node__Group__15368);
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2630:1: rule__Node__Group__1__Impl : ( ( rule__Node__NameAssignment_1 ) ) ;
    public final void rule__Node__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2634:1: ( ( ( rule__Node__NameAssignment_1 ) ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2635:1: ( ( rule__Node__NameAssignment_1 ) )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2635:1: ( ( rule__Node__NameAssignment_1 ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2636:1: ( rule__Node__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNodeAccess().getNameAssignment_1()); 
            }
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2637:1: ( rule__Node__NameAssignment_1 )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2637:2: rule__Node__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Node__NameAssignment_1_in_rule__Node__Group__1__Impl5395);
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2647:1: rule__Node__Group__2 : rule__Node__Group__2__Impl rule__Node__Group__3 ;
    public final void rule__Node__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2651:1: ( rule__Node__Group__2__Impl rule__Node__Group__3 )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2652:2: rule__Node__Group__2__Impl rule__Node__Group__3
            {
            pushFollow(FOLLOW_rule__Node__Group__2__Impl_in_rule__Node__Group__25425);
            rule__Node__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Node__Group__3_in_rule__Node__Group__25428);
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2659:1: rule__Node__Group__2__Impl : ( '(' ) ;
    public final void rule__Node__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2663:1: ( ( '(' ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2664:1: ( '(' )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2664:1: ( '(' )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2665:1: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNodeAccess().getLeftParenthesisKeyword_2()); 
            }
            match(input,41,FOLLOW_41_in_rule__Node__Group__2__Impl5456); if (state.failed) return ;
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2678:1: rule__Node__Group__3 : rule__Node__Group__3__Impl rule__Node__Group__4 ;
    public final void rule__Node__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2682:1: ( rule__Node__Group__3__Impl rule__Node__Group__4 )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2683:2: rule__Node__Group__3__Impl rule__Node__Group__4
            {
            pushFollow(FOLLOW_rule__Node__Group__3__Impl_in_rule__Node__Group__35487);
            rule__Node__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Node__Group__4_in_rule__Node__Group__35490);
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2690:1: rule__Node__Group__3__Impl : ( ( rule__Node__Group_3__0 )? ) ;
    public final void rule__Node__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2694:1: ( ( ( rule__Node__Group_3__0 )? ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2695:1: ( ( rule__Node__Group_3__0 )? )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2695:1: ( ( rule__Node__Group_3__0 )? )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2696:1: ( rule__Node__Group_3__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNodeAccess().getGroup_3()); 
            }
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2697:1: ( rule__Node__Group_3__0 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==RULE_ID) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2697:2: rule__Node__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__Node__Group_3__0_in_rule__Node__Group__3__Impl5517);
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2707:1: rule__Node__Group__4 : rule__Node__Group__4__Impl rule__Node__Group__5 ;
    public final void rule__Node__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2711:1: ( rule__Node__Group__4__Impl rule__Node__Group__5 )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2712:2: rule__Node__Group__4__Impl rule__Node__Group__5
            {
            pushFollow(FOLLOW_rule__Node__Group__4__Impl_in_rule__Node__Group__45548);
            rule__Node__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Node__Group__5_in_rule__Node__Group__45551);
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2719:1: rule__Node__Group__4__Impl : ( ')' ) ;
    public final void rule__Node__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2723:1: ( ( ')' ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2724:1: ( ')' )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2724:1: ( ')' )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2725:1: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNodeAccess().getRightParenthesisKeyword_4()); 
            }
            match(input,42,FOLLOW_42_in_rule__Node__Group__4__Impl5579); if (state.failed) return ;
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2738:1: rule__Node__Group__5 : rule__Node__Group__5__Impl rule__Node__Group__6 ;
    public final void rule__Node__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2742:1: ( rule__Node__Group__5__Impl rule__Node__Group__6 )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2743:2: rule__Node__Group__5__Impl rule__Node__Group__6
            {
            pushFollow(FOLLOW_rule__Node__Group__5__Impl_in_rule__Node__Group__55610);
            rule__Node__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Node__Group__6_in_rule__Node__Group__55613);
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2750:1: rule__Node__Group__5__Impl : ( 'returns' ) ;
    public final void rule__Node__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2754:1: ( ( 'returns' ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2755:1: ( 'returns' )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2755:1: ( 'returns' )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2756:1: 'returns'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNodeAccess().getReturnsKeyword_5()); 
            }
            match(input,43,FOLLOW_43_in_rule__Node__Group__5__Impl5641); if (state.failed) return ;
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2769:1: rule__Node__Group__6 : rule__Node__Group__6__Impl rule__Node__Group__7 ;
    public final void rule__Node__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2773:1: ( rule__Node__Group__6__Impl rule__Node__Group__7 )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2774:2: rule__Node__Group__6__Impl rule__Node__Group__7
            {
            pushFollow(FOLLOW_rule__Node__Group__6__Impl_in_rule__Node__Group__65672);
            rule__Node__Group__6__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Node__Group__7_in_rule__Node__Group__65675);
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2781:1: rule__Node__Group__6__Impl : ( '(' ) ;
    public final void rule__Node__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2785:1: ( ( '(' ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2786:1: ( '(' )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2786:1: ( '(' )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2787:1: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNodeAccess().getLeftParenthesisKeyword_6()); 
            }
            match(input,41,FOLLOW_41_in_rule__Node__Group__6__Impl5703); if (state.failed) return ;
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2800:1: rule__Node__Group__7 : rule__Node__Group__7__Impl rule__Node__Group__8 ;
    public final void rule__Node__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2804:1: ( rule__Node__Group__7__Impl rule__Node__Group__8 )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2805:2: rule__Node__Group__7__Impl rule__Node__Group__8
            {
            pushFollow(FOLLOW_rule__Node__Group__7__Impl_in_rule__Node__Group__75734);
            rule__Node__Group__7__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Node__Group__8_in_rule__Node__Group__75737);
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2812:1: rule__Node__Group__7__Impl : ( ( rule__Node__Group_7__0 )? ) ;
    public final void rule__Node__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2816:1: ( ( ( rule__Node__Group_7__0 )? ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2817:1: ( ( rule__Node__Group_7__0 )? )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2817:1: ( ( rule__Node__Group_7__0 )? )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2818:1: ( rule__Node__Group_7__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNodeAccess().getGroup_7()); 
            }
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2819:1: ( rule__Node__Group_7__0 )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==RULE_ID) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2819:2: rule__Node__Group_7__0
                    {
                    pushFollow(FOLLOW_rule__Node__Group_7__0_in_rule__Node__Group__7__Impl5764);
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2829:1: rule__Node__Group__8 : rule__Node__Group__8__Impl rule__Node__Group__9 ;
    public final void rule__Node__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2833:1: ( rule__Node__Group__8__Impl rule__Node__Group__9 )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2834:2: rule__Node__Group__8__Impl rule__Node__Group__9
            {
            pushFollow(FOLLOW_rule__Node__Group__8__Impl_in_rule__Node__Group__85795);
            rule__Node__Group__8__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Node__Group__9_in_rule__Node__Group__85798);
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2841:1: rule__Node__Group__8__Impl : ( ')' ) ;
    public final void rule__Node__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2845:1: ( ( ')' ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2846:1: ( ')' )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2846:1: ( ')' )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2847:1: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNodeAccess().getRightParenthesisKeyword_8()); 
            }
            match(input,42,FOLLOW_42_in_rule__Node__Group__8__Impl5826); if (state.failed) return ;
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2860:1: rule__Node__Group__9 : rule__Node__Group__9__Impl rule__Node__Group__10 ;
    public final void rule__Node__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2864:1: ( rule__Node__Group__9__Impl rule__Node__Group__10 )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2865:2: rule__Node__Group__9__Impl rule__Node__Group__10
            {
            pushFollow(FOLLOW_rule__Node__Group__9__Impl_in_rule__Node__Group__95857);
            rule__Node__Group__9__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Node__Group__10_in_rule__Node__Group__95860);
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2872:1: rule__Node__Group__9__Impl : ( ';' ) ;
    public final void rule__Node__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2876:1: ( ( ';' ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2877:1: ( ';' )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2877:1: ( ';' )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2878:1: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNodeAccess().getSemicolonKeyword_9()); 
            }
            match(input,26,FOLLOW_26_in_rule__Node__Group__9__Impl5888); if (state.failed) return ;
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2891:1: rule__Node__Group__10 : rule__Node__Group__10__Impl rule__Node__Group__11 ;
    public final void rule__Node__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2895:1: ( rule__Node__Group__10__Impl rule__Node__Group__11 )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2896:2: rule__Node__Group__10__Impl rule__Node__Group__11
            {
            pushFollow(FOLLOW_rule__Node__Group__10__Impl_in_rule__Node__Group__105919);
            rule__Node__Group__10__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Node__Group__11_in_rule__Node__Group__105922);
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2903:1: rule__Node__Group__10__Impl : ( ( rule__Node__Group_10__0 )? ) ;
    public final void rule__Node__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2907:1: ( ( ( rule__Node__Group_10__0 )? ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2908:1: ( ( rule__Node__Group_10__0 )? )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2908:1: ( ( rule__Node__Group_10__0 )? )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2909:1: ( rule__Node__Group_10__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNodeAccess().getGroup_10()); 
            }
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2910:1: ( rule__Node__Group_10__0 )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==46) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2910:2: rule__Node__Group_10__0
                    {
                    pushFollow(FOLLOW_rule__Node__Group_10__0_in_rule__Node__Group__10__Impl5949);
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2920:1: rule__Node__Group__11 : rule__Node__Group__11__Impl rule__Node__Group__12 ;
    public final void rule__Node__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2924:1: ( rule__Node__Group__11__Impl rule__Node__Group__12 )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2925:2: rule__Node__Group__11__Impl rule__Node__Group__12
            {
            pushFollow(FOLLOW_rule__Node__Group__11__Impl_in_rule__Node__Group__115980);
            rule__Node__Group__11__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Node__Group__12_in_rule__Node__Group__115983);
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2932:1: rule__Node__Group__11__Impl : ( 'let' ) ;
    public final void rule__Node__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2936:1: ( ( 'let' ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2937:1: ( 'let' )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2937:1: ( 'let' )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2938:1: 'let'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNodeAccess().getLetKeyword_11()); 
            }
            match(input,44,FOLLOW_44_in_rule__Node__Group__11__Impl6011); if (state.failed) return ;
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2951:1: rule__Node__Group__12 : rule__Node__Group__12__Impl rule__Node__Group__13 ;
    public final void rule__Node__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2955:1: ( rule__Node__Group__12__Impl rule__Node__Group__13 )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2956:2: rule__Node__Group__12__Impl rule__Node__Group__13
            {
            pushFollow(FOLLOW_rule__Node__Group__12__Impl_in_rule__Node__Group__126042);
            rule__Node__Group__12__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Node__Group__13_in_rule__Node__Group__126045);
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2963:1: rule__Node__Group__12__Impl : ( ( rule__Node__Alternatives_12 )* ) ;
    public final void rule__Node__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2967:1: ( ( ( rule__Node__Alternatives_12 )* ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2968:1: ( ( rule__Node__Alternatives_12 )* )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2968:1: ( ( rule__Node__Alternatives_12 )* )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2969:1: ( rule__Node__Alternatives_12 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNodeAccess().getAlternatives_12()); 
            }
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2970:1: ( rule__Node__Alternatives_12 )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==RULE_ID||(LA19_0>=47 && LA19_0<=49)) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2970:2: rule__Node__Alternatives_12
            	    {
            	    pushFollow(FOLLOW_rule__Node__Alternatives_12_in_rule__Node__Group__12__Impl6072);
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2980:1: rule__Node__Group__13 : rule__Node__Group__13__Impl rule__Node__Group__14 ;
    public final void rule__Node__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2984:1: ( rule__Node__Group__13__Impl rule__Node__Group__14 )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2985:2: rule__Node__Group__13__Impl rule__Node__Group__14
            {
            pushFollow(FOLLOW_rule__Node__Group__13__Impl_in_rule__Node__Group__136103);
            rule__Node__Group__13__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Node__Group__14_in_rule__Node__Group__136106);
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2992:1: rule__Node__Group__13__Impl : ( 'tel' ) ;
    public final void rule__Node__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2996:1: ( ( 'tel' ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2997:1: ( 'tel' )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2997:1: ( 'tel' )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:2998:1: 'tel'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNodeAccess().getTelKeyword_13()); 
            }
            match(input,45,FOLLOW_45_in_rule__Node__Group__13__Impl6134); if (state.failed) return ;
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3011:1: rule__Node__Group__14 : rule__Node__Group__14__Impl ;
    public final void rule__Node__Group__14() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3015:1: ( rule__Node__Group__14__Impl )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3016:2: rule__Node__Group__14__Impl
            {
            pushFollow(FOLLOW_rule__Node__Group__14__Impl_in_rule__Node__Group__146165);
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3022:1: rule__Node__Group__14__Impl : ( ( ';' )? ) ;
    public final void rule__Node__Group__14__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3026:1: ( ( ( ';' )? ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3027:1: ( ( ';' )? )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3027:1: ( ( ';' )? )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3028:1: ( ';' )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNodeAccess().getSemicolonKeyword_14()); 
            }
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3029:1: ( ';' )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==26) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3030:2: ';'
                    {
                    match(input,26,FOLLOW_26_in_rule__Node__Group__14__Impl6194); if (state.failed) return ;

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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3071:1: rule__Node__Group_3__0 : rule__Node__Group_3__0__Impl rule__Node__Group_3__1 ;
    public final void rule__Node__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3075:1: ( rule__Node__Group_3__0__Impl rule__Node__Group_3__1 )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3076:2: rule__Node__Group_3__0__Impl rule__Node__Group_3__1
            {
            pushFollow(FOLLOW_rule__Node__Group_3__0__Impl_in_rule__Node__Group_3__06257);
            rule__Node__Group_3__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Node__Group_3__1_in_rule__Node__Group_3__06260);
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3083:1: rule__Node__Group_3__0__Impl : ( ( rule__Node__InputsAssignment_3_0 ) ) ;
    public final void rule__Node__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3087:1: ( ( ( rule__Node__InputsAssignment_3_0 ) ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3088:1: ( ( rule__Node__InputsAssignment_3_0 ) )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3088:1: ( ( rule__Node__InputsAssignment_3_0 ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3089:1: ( rule__Node__InputsAssignment_3_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNodeAccess().getInputsAssignment_3_0()); 
            }
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3090:1: ( rule__Node__InputsAssignment_3_0 )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3090:2: rule__Node__InputsAssignment_3_0
            {
            pushFollow(FOLLOW_rule__Node__InputsAssignment_3_0_in_rule__Node__Group_3__0__Impl6287);
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3100:1: rule__Node__Group_3__1 : rule__Node__Group_3__1__Impl ;
    public final void rule__Node__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3104:1: ( rule__Node__Group_3__1__Impl )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3105:2: rule__Node__Group_3__1__Impl
            {
            pushFollow(FOLLOW_rule__Node__Group_3__1__Impl_in_rule__Node__Group_3__16317);
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3111:1: rule__Node__Group_3__1__Impl : ( ( rule__Node__Group_3_1__0 )* ) ;
    public final void rule__Node__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3115:1: ( ( ( rule__Node__Group_3_1__0 )* ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3116:1: ( ( rule__Node__Group_3_1__0 )* )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3116:1: ( ( rule__Node__Group_3_1__0 )* )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3117:1: ( rule__Node__Group_3_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNodeAccess().getGroup_3_1()); 
            }
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3118:1: ( rule__Node__Group_3_1__0 )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==26) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3118:2: rule__Node__Group_3_1__0
            	    {
            	    pushFollow(FOLLOW_rule__Node__Group_3_1__0_in_rule__Node__Group_3__1__Impl6344);
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3132:1: rule__Node__Group_3_1__0 : rule__Node__Group_3_1__0__Impl rule__Node__Group_3_1__1 ;
    public final void rule__Node__Group_3_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3136:1: ( rule__Node__Group_3_1__0__Impl rule__Node__Group_3_1__1 )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3137:2: rule__Node__Group_3_1__0__Impl rule__Node__Group_3_1__1
            {
            pushFollow(FOLLOW_rule__Node__Group_3_1__0__Impl_in_rule__Node__Group_3_1__06379);
            rule__Node__Group_3_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Node__Group_3_1__1_in_rule__Node__Group_3_1__06382);
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3144:1: rule__Node__Group_3_1__0__Impl : ( ';' ) ;
    public final void rule__Node__Group_3_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3148:1: ( ( ';' ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3149:1: ( ';' )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3149:1: ( ';' )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3150:1: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNodeAccess().getSemicolonKeyword_3_1_0()); 
            }
            match(input,26,FOLLOW_26_in_rule__Node__Group_3_1__0__Impl6410); if (state.failed) return ;
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3163:1: rule__Node__Group_3_1__1 : rule__Node__Group_3_1__1__Impl ;
    public final void rule__Node__Group_3_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3167:1: ( rule__Node__Group_3_1__1__Impl )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3168:2: rule__Node__Group_3_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Node__Group_3_1__1__Impl_in_rule__Node__Group_3_1__16441);
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3174:1: rule__Node__Group_3_1__1__Impl : ( ( rule__Node__InputsAssignment_3_1_1 ) ) ;
    public final void rule__Node__Group_3_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3178:1: ( ( ( rule__Node__InputsAssignment_3_1_1 ) ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3179:1: ( ( rule__Node__InputsAssignment_3_1_1 ) )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3179:1: ( ( rule__Node__InputsAssignment_3_1_1 ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3180:1: ( rule__Node__InputsAssignment_3_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNodeAccess().getInputsAssignment_3_1_1()); 
            }
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3181:1: ( rule__Node__InputsAssignment_3_1_1 )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3181:2: rule__Node__InputsAssignment_3_1_1
            {
            pushFollow(FOLLOW_rule__Node__InputsAssignment_3_1_1_in_rule__Node__Group_3_1__1__Impl6468);
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3195:1: rule__Node__Group_7__0 : rule__Node__Group_7__0__Impl rule__Node__Group_7__1 ;
    public final void rule__Node__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3199:1: ( rule__Node__Group_7__0__Impl rule__Node__Group_7__1 )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3200:2: rule__Node__Group_7__0__Impl rule__Node__Group_7__1
            {
            pushFollow(FOLLOW_rule__Node__Group_7__0__Impl_in_rule__Node__Group_7__06502);
            rule__Node__Group_7__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Node__Group_7__1_in_rule__Node__Group_7__06505);
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3207:1: rule__Node__Group_7__0__Impl : ( ( rule__Node__OutputsAssignment_7_0 ) ) ;
    public final void rule__Node__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3211:1: ( ( ( rule__Node__OutputsAssignment_7_0 ) ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3212:1: ( ( rule__Node__OutputsAssignment_7_0 ) )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3212:1: ( ( rule__Node__OutputsAssignment_7_0 ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3213:1: ( rule__Node__OutputsAssignment_7_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNodeAccess().getOutputsAssignment_7_0()); 
            }
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3214:1: ( rule__Node__OutputsAssignment_7_0 )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3214:2: rule__Node__OutputsAssignment_7_0
            {
            pushFollow(FOLLOW_rule__Node__OutputsAssignment_7_0_in_rule__Node__Group_7__0__Impl6532);
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3224:1: rule__Node__Group_7__1 : rule__Node__Group_7__1__Impl ;
    public final void rule__Node__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3228:1: ( rule__Node__Group_7__1__Impl )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3229:2: rule__Node__Group_7__1__Impl
            {
            pushFollow(FOLLOW_rule__Node__Group_7__1__Impl_in_rule__Node__Group_7__16562);
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3235:1: rule__Node__Group_7__1__Impl : ( ( rule__Node__Group_7_1__0 )* ) ;
    public final void rule__Node__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3239:1: ( ( ( rule__Node__Group_7_1__0 )* ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3240:1: ( ( rule__Node__Group_7_1__0 )* )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3240:1: ( ( rule__Node__Group_7_1__0 )* )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3241:1: ( rule__Node__Group_7_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNodeAccess().getGroup_7_1()); 
            }
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3242:1: ( rule__Node__Group_7_1__0 )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==26) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3242:2: rule__Node__Group_7_1__0
            	    {
            	    pushFollow(FOLLOW_rule__Node__Group_7_1__0_in_rule__Node__Group_7__1__Impl6589);
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3256:1: rule__Node__Group_7_1__0 : rule__Node__Group_7_1__0__Impl rule__Node__Group_7_1__1 ;
    public final void rule__Node__Group_7_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3260:1: ( rule__Node__Group_7_1__0__Impl rule__Node__Group_7_1__1 )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3261:2: rule__Node__Group_7_1__0__Impl rule__Node__Group_7_1__1
            {
            pushFollow(FOLLOW_rule__Node__Group_7_1__0__Impl_in_rule__Node__Group_7_1__06624);
            rule__Node__Group_7_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Node__Group_7_1__1_in_rule__Node__Group_7_1__06627);
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3268:1: rule__Node__Group_7_1__0__Impl : ( ';' ) ;
    public final void rule__Node__Group_7_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3272:1: ( ( ';' ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3273:1: ( ';' )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3273:1: ( ';' )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3274:1: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNodeAccess().getSemicolonKeyword_7_1_0()); 
            }
            match(input,26,FOLLOW_26_in_rule__Node__Group_7_1__0__Impl6655); if (state.failed) return ;
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3287:1: rule__Node__Group_7_1__1 : rule__Node__Group_7_1__1__Impl ;
    public final void rule__Node__Group_7_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3291:1: ( rule__Node__Group_7_1__1__Impl )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3292:2: rule__Node__Group_7_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Node__Group_7_1__1__Impl_in_rule__Node__Group_7_1__16686);
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3298:1: rule__Node__Group_7_1__1__Impl : ( ( rule__Node__OutputsAssignment_7_1_1 ) ) ;
    public final void rule__Node__Group_7_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3302:1: ( ( ( rule__Node__OutputsAssignment_7_1_1 ) ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3303:1: ( ( rule__Node__OutputsAssignment_7_1_1 ) )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3303:1: ( ( rule__Node__OutputsAssignment_7_1_1 ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3304:1: ( rule__Node__OutputsAssignment_7_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNodeAccess().getOutputsAssignment_7_1_1()); 
            }
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3305:1: ( rule__Node__OutputsAssignment_7_1_1 )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3305:2: rule__Node__OutputsAssignment_7_1_1
            {
            pushFollow(FOLLOW_rule__Node__OutputsAssignment_7_1_1_in_rule__Node__Group_7_1__1__Impl6713);
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3319:1: rule__Node__Group_10__0 : rule__Node__Group_10__0__Impl rule__Node__Group_10__1 ;
    public final void rule__Node__Group_10__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3323:1: ( rule__Node__Group_10__0__Impl rule__Node__Group_10__1 )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3324:2: rule__Node__Group_10__0__Impl rule__Node__Group_10__1
            {
            pushFollow(FOLLOW_rule__Node__Group_10__0__Impl_in_rule__Node__Group_10__06747);
            rule__Node__Group_10__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Node__Group_10__1_in_rule__Node__Group_10__06750);
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3331:1: rule__Node__Group_10__0__Impl : ( 'var' ) ;
    public final void rule__Node__Group_10__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3335:1: ( ( 'var' ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3336:1: ( 'var' )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3336:1: ( 'var' )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3337:1: 'var'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNodeAccess().getVarKeyword_10_0()); 
            }
            match(input,46,FOLLOW_46_in_rule__Node__Group_10__0__Impl6778); if (state.failed) return ;
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3350:1: rule__Node__Group_10__1 : rule__Node__Group_10__1__Impl ;
    public final void rule__Node__Group_10__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3354:1: ( rule__Node__Group_10__1__Impl )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3355:2: rule__Node__Group_10__1__Impl
            {
            pushFollow(FOLLOW_rule__Node__Group_10__1__Impl_in_rule__Node__Group_10__16809);
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3361:1: rule__Node__Group_10__1__Impl : ( ( rule__Node__Group_10_1__0 )* ) ;
    public final void rule__Node__Group_10__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3365:1: ( ( ( rule__Node__Group_10_1__0 )* ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3366:1: ( ( rule__Node__Group_10_1__0 )* )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3366:1: ( ( rule__Node__Group_10_1__0 )* )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3367:1: ( rule__Node__Group_10_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNodeAccess().getGroup_10_1()); 
            }
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3368:1: ( rule__Node__Group_10_1__0 )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==RULE_ID) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3368:2: rule__Node__Group_10_1__0
            	    {
            	    pushFollow(FOLLOW_rule__Node__Group_10_1__0_in_rule__Node__Group_10__1__Impl6836);
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3382:1: rule__Node__Group_10_1__0 : rule__Node__Group_10_1__0__Impl rule__Node__Group_10_1__1 ;
    public final void rule__Node__Group_10_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3386:1: ( rule__Node__Group_10_1__0__Impl rule__Node__Group_10_1__1 )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3387:2: rule__Node__Group_10_1__0__Impl rule__Node__Group_10_1__1
            {
            pushFollow(FOLLOW_rule__Node__Group_10_1__0__Impl_in_rule__Node__Group_10_1__06871);
            rule__Node__Group_10_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Node__Group_10_1__1_in_rule__Node__Group_10_1__06874);
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3394:1: rule__Node__Group_10_1__0__Impl : ( ( rule__Node__LocalsAssignment_10_1_0 ) ) ;
    public final void rule__Node__Group_10_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3398:1: ( ( ( rule__Node__LocalsAssignment_10_1_0 ) ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3399:1: ( ( rule__Node__LocalsAssignment_10_1_0 ) )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3399:1: ( ( rule__Node__LocalsAssignment_10_1_0 ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3400:1: ( rule__Node__LocalsAssignment_10_1_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNodeAccess().getLocalsAssignment_10_1_0()); 
            }
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3401:1: ( rule__Node__LocalsAssignment_10_1_0 )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3401:2: rule__Node__LocalsAssignment_10_1_0
            {
            pushFollow(FOLLOW_rule__Node__LocalsAssignment_10_1_0_in_rule__Node__Group_10_1__0__Impl6901);
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3411:1: rule__Node__Group_10_1__1 : rule__Node__Group_10_1__1__Impl ;
    public final void rule__Node__Group_10_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3415:1: ( rule__Node__Group_10_1__1__Impl )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3416:2: rule__Node__Group_10_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Node__Group_10_1__1__Impl_in_rule__Node__Group_10_1__16931);
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3422:1: rule__Node__Group_10_1__1__Impl : ( ';' ) ;
    public final void rule__Node__Group_10_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3426:1: ( ( ';' ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3427:1: ( ';' )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3427:1: ( ';' )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3428:1: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNodeAccess().getSemicolonKeyword_10_1_1()); 
            }
            match(input,26,FOLLOW_26_in_rule__Node__Group_10_1__1__Impl6959); if (state.failed) return ;
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3445:1: rule__VariableGroup__Group__0 : rule__VariableGroup__Group__0__Impl rule__VariableGroup__Group__1 ;
    public final void rule__VariableGroup__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3449:1: ( rule__VariableGroup__Group__0__Impl rule__VariableGroup__Group__1 )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3450:2: rule__VariableGroup__Group__0__Impl rule__VariableGroup__Group__1
            {
            pushFollow(FOLLOW_rule__VariableGroup__Group__0__Impl_in_rule__VariableGroup__Group__06994);
            rule__VariableGroup__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__VariableGroup__Group__1_in_rule__VariableGroup__Group__06997);
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3457:1: rule__VariableGroup__Group__0__Impl : ( ( rule__VariableGroup__VariablesAssignment_0 ) ) ;
    public final void rule__VariableGroup__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3461:1: ( ( ( rule__VariableGroup__VariablesAssignment_0 ) ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3462:1: ( ( rule__VariableGroup__VariablesAssignment_0 ) )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3462:1: ( ( rule__VariableGroup__VariablesAssignment_0 ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3463:1: ( rule__VariableGroup__VariablesAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariableGroupAccess().getVariablesAssignment_0()); 
            }
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3464:1: ( rule__VariableGroup__VariablesAssignment_0 )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3464:2: rule__VariableGroup__VariablesAssignment_0
            {
            pushFollow(FOLLOW_rule__VariableGroup__VariablesAssignment_0_in_rule__VariableGroup__Group__0__Impl7024);
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3474:1: rule__VariableGroup__Group__1 : rule__VariableGroup__Group__1__Impl rule__VariableGroup__Group__2 ;
    public final void rule__VariableGroup__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3478:1: ( rule__VariableGroup__Group__1__Impl rule__VariableGroup__Group__2 )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3479:2: rule__VariableGroup__Group__1__Impl rule__VariableGroup__Group__2
            {
            pushFollow(FOLLOW_rule__VariableGroup__Group__1__Impl_in_rule__VariableGroup__Group__17054);
            rule__VariableGroup__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__VariableGroup__Group__2_in_rule__VariableGroup__Group__17057);
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3486:1: rule__VariableGroup__Group__1__Impl : ( ( rule__VariableGroup__Group_1__0 )* ) ;
    public final void rule__VariableGroup__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3490:1: ( ( ( rule__VariableGroup__Group_1__0 )* ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3491:1: ( ( rule__VariableGroup__Group_1__0 )* )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3491:1: ( ( rule__VariableGroup__Group_1__0 )* )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3492:1: ( rule__VariableGroup__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariableGroupAccess().getGroup_1()); 
            }
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3493:1: ( rule__VariableGroup__Group_1__0 )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==36) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3493:2: rule__VariableGroup__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__VariableGroup__Group_1__0_in_rule__VariableGroup__Group__1__Impl7084);
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3503:1: rule__VariableGroup__Group__2 : rule__VariableGroup__Group__2__Impl rule__VariableGroup__Group__3 ;
    public final void rule__VariableGroup__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3507:1: ( rule__VariableGroup__Group__2__Impl rule__VariableGroup__Group__3 )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3508:2: rule__VariableGroup__Group__2__Impl rule__VariableGroup__Group__3
            {
            pushFollow(FOLLOW_rule__VariableGroup__Group__2__Impl_in_rule__VariableGroup__Group__27115);
            rule__VariableGroup__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__VariableGroup__Group__3_in_rule__VariableGroup__Group__27118);
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3515:1: rule__VariableGroup__Group__2__Impl : ( ':' ) ;
    public final void rule__VariableGroup__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3519:1: ( ( ':' ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3520:1: ( ':' )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3520:1: ( ':' )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3521:1: ':'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariableGroupAccess().getColonKeyword_2()); 
            }
            match(input,29,FOLLOW_29_in_rule__VariableGroup__Group__2__Impl7146); if (state.failed) return ;
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3534:1: rule__VariableGroup__Group__3 : rule__VariableGroup__Group__3__Impl ;
    public final void rule__VariableGroup__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3538:1: ( rule__VariableGroup__Group__3__Impl )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3539:2: rule__VariableGroup__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__VariableGroup__Group__3__Impl_in_rule__VariableGroup__Group__37177);
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3545:1: rule__VariableGroup__Group__3__Impl : ( ( rule__VariableGroup__TypeAssignment_3 ) ) ;
    public final void rule__VariableGroup__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3549:1: ( ( ( rule__VariableGroup__TypeAssignment_3 ) ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3550:1: ( ( rule__VariableGroup__TypeAssignment_3 ) )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3550:1: ( ( rule__VariableGroup__TypeAssignment_3 ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3551:1: ( rule__VariableGroup__TypeAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariableGroupAccess().getTypeAssignment_3()); 
            }
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3552:1: ( rule__VariableGroup__TypeAssignment_3 )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3552:2: rule__VariableGroup__TypeAssignment_3
            {
            pushFollow(FOLLOW_rule__VariableGroup__TypeAssignment_3_in_rule__VariableGroup__Group__3__Impl7204);
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3570:1: rule__VariableGroup__Group_1__0 : rule__VariableGroup__Group_1__0__Impl rule__VariableGroup__Group_1__1 ;
    public final void rule__VariableGroup__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3574:1: ( rule__VariableGroup__Group_1__0__Impl rule__VariableGroup__Group_1__1 )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3575:2: rule__VariableGroup__Group_1__0__Impl rule__VariableGroup__Group_1__1
            {
            pushFollow(FOLLOW_rule__VariableGroup__Group_1__0__Impl_in_rule__VariableGroup__Group_1__07242);
            rule__VariableGroup__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__VariableGroup__Group_1__1_in_rule__VariableGroup__Group_1__07245);
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3582:1: rule__VariableGroup__Group_1__0__Impl : ( ',' ) ;
    public final void rule__VariableGroup__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3586:1: ( ( ',' ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3587:1: ( ',' )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3587:1: ( ',' )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3588:1: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariableGroupAccess().getCommaKeyword_1_0()); 
            }
            match(input,36,FOLLOW_36_in_rule__VariableGroup__Group_1__0__Impl7273); if (state.failed) return ;
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3601:1: rule__VariableGroup__Group_1__1 : rule__VariableGroup__Group_1__1__Impl ;
    public final void rule__VariableGroup__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3605:1: ( rule__VariableGroup__Group_1__1__Impl )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3606:2: rule__VariableGroup__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__VariableGroup__Group_1__1__Impl_in_rule__VariableGroup__Group_1__17304);
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3612:1: rule__VariableGroup__Group_1__1__Impl : ( ( rule__VariableGroup__VariablesAssignment_1_1 ) ) ;
    public final void rule__VariableGroup__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3616:1: ( ( ( rule__VariableGroup__VariablesAssignment_1_1 ) ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3617:1: ( ( rule__VariableGroup__VariablesAssignment_1_1 ) )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3617:1: ( ( rule__VariableGroup__VariablesAssignment_1_1 ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3618:1: ( rule__VariableGroup__VariablesAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariableGroupAccess().getVariablesAssignment_1_1()); 
            }
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3619:1: ( rule__VariableGroup__VariablesAssignment_1_1 )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3619:2: rule__VariableGroup__VariablesAssignment_1_1
            {
            pushFollow(FOLLOW_rule__VariableGroup__VariablesAssignment_1_1_in_rule__VariableGroup__Group_1__1__Impl7331);
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3633:1: rule__Equation__Group__0 : rule__Equation__Group__0__Impl rule__Equation__Group__1 ;
    public final void rule__Equation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3637:1: ( rule__Equation__Group__0__Impl rule__Equation__Group__1 )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3638:2: rule__Equation__Group__0__Impl rule__Equation__Group__1
            {
            pushFollow(FOLLOW_rule__Equation__Group__0__Impl_in_rule__Equation__Group__07365);
            rule__Equation__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Equation__Group__1_in_rule__Equation__Group__07368);
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3645:1: rule__Equation__Group__0__Impl : ( ( rule__Equation__LhsAssignment_0 ) ) ;
    public final void rule__Equation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3649:1: ( ( ( rule__Equation__LhsAssignment_0 ) ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3650:1: ( ( rule__Equation__LhsAssignment_0 ) )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3650:1: ( ( rule__Equation__LhsAssignment_0 ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3651:1: ( rule__Equation__LhsAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEquationAccess().getLhsAssignment_0()); 
            }
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3652:1: ( rule__Equation__LhsAssignment_0 )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3652:2: rule__Equation__LhsAssignment_0
            {
            pushFollow(FOLLOW_rule__Equation__LhsAssignment_0_in_rule__Equation__Group__0__Impl7395);
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3662:1: rule__Equation__Group__1 : rule__Equation__Group__1__Impl rule__Equation__Group__2 ;
    public final void rule__Equation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3666:1: ( rule__Equation__Group__1__Impl rule__Equation__Group__2 )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3667:2: rule__Equation__Group__1__Impl rule__Equation__Group__2
            {
            pushFollow(FOLLOW_rule__Equation__Group__1__Impl_in_rule__Equation__Group__17425);
            rule__Equation__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Equation__Group__2_in_rule__Equation__Group__17428);
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3674:1: rule__Equation__Group__1__Impl : ( ( rule__Equation__Group_1__0 )* ) ;
    public final void rule__Equation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3678:1: ( ( ( rule__Equation__Group_1__0 )* ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3679:1: ( ( rule__Equation__Group_1__0 )* )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3679:1: ( ( rule__Equation__Group_1__0 )* )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3680:1: ( rule__Equation__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEquationAccess().getGroup_1()); 
            }
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3681:1: ( rule__Equation__Group_1__0 )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==36) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3681:2: rule__Equation__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__Equation__Group_1__0_in_rule__Equation__Group__1__Impl7455);
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3691:1: rule__Equation__Group__2 : rule__Equation__Group__2__Impl rule__Equation__Group__3 ;
    public final void rule__Equation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3695:1: ( rule__Equation__Group__2__Impl rule__Equation__Group__3 )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3696:2: rule__Equation__Group__2__Impl rule__Equation__Group__3
            {
            pushFollow(FOLLOW_rule__Equation__Group__2__Impl_in_rule__Equation__Group__27486);
            rule__Equation__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Equation__Group__3_in_rule__Equation__Group__27489);
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3703:1: rule__Equation__Group__2__Impl : ( '=' ) ;
    public final void rule__Equation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3707:1: ( ( '=' ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3708:1: ( '=' )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3708:1: ( '=' )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3709:1: '='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEquationAccess().getEqualsSignKeyword_2()); 
            }
            match(input,16,FOLLOW_16_in_rule__Equation__Group__2__Impl7517); if (state.failed) return ;
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3722:1: rule__Equation__Group__3 : rule__Equation__Group__3__Impl rule__Equation__Group__4 ;
    public final void rule__Equation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3726:1: ( rule__Equation__Group__3__Impl rule__Equation__Group__4 )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3727:2: rule__Equation__Group__3__Impl rule__Equation__Group__4
            {
            pushFollow(FOLLOW_rule__Equation__Group__3__Impl_in_rule__Equation__Group__37548);
            rule__Equation__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Equation__Group__4_in_rule__Equation__Group__37551);
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3734:1: rule__Equation__Group__3__Impl : ( ( rule__Equation__RhsAssignment_3 ) ) ;
    public final void rule__Equation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3738:1: ( ( ( rule__Equation__RhsAssignment_3 ) ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3739:1: ( ( rule__Equation__RhsAssignment_3 ) )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3739:1: ( ( rule__Equation__RhsAssignment_3 ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3740:1: ( rule__Equation__RhsAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEquationAccess().getRhsAssignment_3()); 
            }
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3741:1: ( rule__Equation__RhsAssignment_3 )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3741:2: rule__Equation__RhsAssignment_3
            {
            pushFollow(FOLLOW_rule__Equation__RhsAssignment_3_in_rule__Equation__Group__3__Impl7578);
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3751:1: rule__Equation__Group__4 : rule__Equation__Group__4__Impl ;
    public final void rule__Equation__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3755:1: ( rule__Equation__Group__4__Impl )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3756:2: rule__Equation__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__Equation__Group__4__Impl_in_rule__Equation__Group__47608);
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3762:1: rule__Equation__Group__4__Impl : ( ';' ) ;
    public final void rule__Equation__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3766:1: ( ( ';' ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3767:1: ( ';' )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3767:1: ( ';' )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3768:1: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEquationAccess().getSemicolonKeyword_4()); 
            }
            match(input,26,FOLLOW_26_in_rule__Equation__Group__4__Impl7636); if (state.failed) return ;
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3791:1: rule__Equation__Group_1__0 : rule__Equation__Group_1__0__Impl rule__Equation__Group_1__1 ;
    public final void rule__Equation__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3795:1: ( rule__Equation__Group_1__0__Impl rule__Equation__Group_1__1 )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3796:2: rule__Equation__Group_1__0__Impl rule__Equation__Group_1__1
            {
            pushFollow(FOLLOW_rule__Equation__Group_1__0__Impl_in_rule__Equation__Group_1__07677);
            rule__Equation__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Equation__Group_1__1_in_rule__Equation__Group_1__07680);
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3803:1: rule__Equation__Group_1__0__Impl : ( ',' ) ;
    public final void rule__Equation__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3807:1: ( ( ',' ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3808:1: ( ',' )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3808:1: ( ',' )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3809:1: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEquationAccess().getCommaKeyword_1_0()); 
            }
            match(input,36,FOLLOW_36_in_rule__Equation__Group_1__0__Impl7708); if (state.failed) return ;
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3822:1: rule__Equation__Group_1__1 : rule__Equation__Group_1__1__Impl ;
    public final void rule__Equation__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3826:1: ( rule__Equation__Group_1__1__Impl )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3827:2: rule__Equation__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Equation__Group_1__1__Impl_in_rule__Equation__Group_1__17739);
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3833:1: rule__Equation__Group_1__1__Impl : ( ( rule__Equation__LhsAssignment_1_1 ) ) ;
    public final void rule__Equation__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3837:1: ( ( ( rule__Equation__LhsAssignment_1_1 ) ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3838:1: ( ( rule__Equation__LhsAssignment_1_1 ) )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3838:1: ( ( rule__Equation__LhsAssignment_1_1 ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3839:1: ( rule__Equation__LhsAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEquationAccess().getLhsAssignment_1_1()); 
            }
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3840:1: ( rule__Equation__LhsAssignment_1_1 )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3840:2: rule__Equation__LhsAssignment_1_1
            {
            pushFollow(FOLLOW_rule__Equation__LhsAssignment_1_1_in_rule__Equation__Group_1__1__Impl7766);
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3854:1: rule__Property__Group__0 : rule__Property__Group__0__Impl rule__Property__Group__1 ;
    public final void rule__Property__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3858:1: ( rule__Property__Group__0__Impl rule__Property__Group__1 )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3859:2: rule__Property__Group__0__Impl rule__Property__Group__1
            {
            pushFollow(FOLLOW_rule__Property__Group__0__Impl_in_rule__Property__Group__07800);
            rule__Property__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Property__Group__1_in_rule__Property__Group__07803);
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3866:1: rule__Property__Group__0__Impl : ( '--%PROPERTY' ) ;
    public final void rule__Property__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3870:1: ( ( '--%PROPERTY' ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3871:1: ( '--%PROPERTY' )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3871:1: ( '--%PROPERTY' )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3872:1: '--%PROPERTY'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPropertyAccess().getPROPERTYKeyword_0()); 
            }
            match(input,47,FOLLOW_47_in_rule__Property__Group__0__Impl7831); if (state.failed) return ;
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3885:1: rule__Property__Group__1 : rule__Property__Group__1__Impl rule__Property__Group__2 ;
    public final void rule__Property__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3889:1: ( rule__Property__Group__1__Impl rule__Property__Group__2 )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3890:2: rule__Property__Group__1__Impl rule__Property__Group__2
            {
            pushFollow(FOLLOW_rule__Property__Group__1__Impl_in_rule__Property__Group__17862);
            rule__Property__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Property__Group__2_in_rule__Property__Group__17865);
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3897:1: rule__Property__Group__1__Impl : ( ( rule__Property__RefAssignment_1 ) ) ;
    public final void rule__Property__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3901:1: ( ( ( rule__Property__RefAssignment_1 ) ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3902:1: ( ( rule__Property__RefAssignment_1 ) )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3902:1: ( ( rule__Property__RefAssignment_1 ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3903:1: ( rule__Property__RefAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPropertyAccess().getRefAssignment_1()); 
            }
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3904:1: ( rule__Property__RefAssignment_1 )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3904:2: rule__Property__RefAssignment_1
            {
            pushFollow(FOLLOW_rule__Property__RefAssignment_1_in_rule__Property__Group__1__Impl7892);
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3914:1: rule__Property__Group__2 : rule__Property__Group__2__Impl ;
    public final void rule__Property__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3918:1: ( rule__Property__Group__2__Impl )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3919:2: rule__Property__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Property__Group__2__Impl_in_rule__Property__Group__27922);
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3925:1: rule__Property__Group__2__Impl : ( ';' ) ;
    public final void rule__Property__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3929:1: ( ( ';' ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3930:1: ( ';' )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3930:1: ( ';' )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3931:1: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPropertyAccess().getSemicolonKeyword_2()); 
            }
            match(input,26,FOLLOW_26_in_rule__Property__Group__2__Impl7950); if (state.failed) return ;
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3950:1: rule__Main__Group__0 : rule__Main__Group__0__Impl rule__Main__Group__1 ;
    public final void rule__Main__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3954:1: ( rule__Main__Group__0__Impl rule__Main__Group__1 )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3955:2: rule__Main__Group__0__Impl rule__Main__Group__1
            {
            pushFollow(FOLLOW_rule__Main__Group__0__Impl_in_rule__Main__Group__07987);
            rule__Main__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Main__Group__1_in_rule__Main__Group__07990);
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3962:1: rule__Main__Group__0__Impl : ( '--%MAIN' ) ;
    public final void rule__Main__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3966:1: ( ( '--%MAIN' ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3967:1: ( '--%MAIN' )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3967:1: ( '--%MAIN' )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3968:1: '--%MAIN'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMainAccess().getMAINKeyword_0()); 
            }
            match(input,48,FOLLOW_48_in_rule__Main__Group__0__Impl8018); if (state.failed) return ;
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3981:1: rule__Main__Group__1 : rule__Main__Group__1__Impl ;
    public final void rule__Main__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3985:1: ( rule__Main__Group__1__Impl )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3986:2: rule__Main__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Main__Group__1__Impl_in_rule__Main__Group__18049);
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3992:1: rule__Main__Group__1__Impl : ( ( ';' )? ) ;
    public final void rule__Main__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3996:1: ( ( ( ';' )? ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3997:1: ( ( ';' )? )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3997:1: ( ( ';' )? )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3998:1: ( ';' )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMainAccess().getSemicolonKeyword_1()); 
            }
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:3999:1: ( ';' )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==26) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4000:2: ';'
                    {
                    match(input,26,FOLLOW_26_in_rule__Main__Group__1__Impl8078); if (state.failed) return ;

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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4015:1: rule__Assertion__Group__0 : rule__Assertion__Group__0__Impl rule__Assertion__Group__1 ;
    public final void rule__Assertion__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4019:1: ( rule__Assertion__Group__0__Impl rule__Assertion__Group__1 )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4020:2: rule__Assertion__Group__0__Impl rule__Assertion__Group__1
            {
            pushFollow(FOLLOW_rule__Assertion__Group__0__Impl_in_rule__Assertion__Group__08115);
            rule__Assertion__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Assertion__Group__1_in_rule__Assertion__Group__08118);
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4027:1: rule__Assertion__Group__0__Impl : ( 'assert' ) ;
    public final void rule__Assertion__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4031:1: ( ( 'assert' ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4032:1: ( 'assert' )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4032:1: ( 'assert' )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4033:1: 'assert'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAssertionAccess().getAssertKeyword_0()); 
            }
            match(input,49,FOLLOW_49_in_rule__Assertion__Group__0__Impl8146); if (state.failed) return ;
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4046:1: rule__Assertion__Group__1 : rule__Assertion__Group__1__Impl rule__Assertion__Group__2 ;
    public final void rule__Assertion__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4050:1: ( rule__Assertion__Group__1__Impl rule__Assertion__Group__2 )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4051:2: rule__Assertion__Group__1__Impl rule__Assertion__Group__2
            {
            pushFollow(FOLLOW_rule__Assertion__Group__1__Impl_in_rule__Assertion__Group__18177);
            rule__Assertion__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Assertion__Group__2_in_rule__Assertion__Group__18180);
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4058:1: rule__Assertion__Group__1__Impl : ( ( rule__Assertion__ExprAssignment_1 ) ) ;
    public final void rule__Assertion__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4062:1: ( ( ( rule__Assertion__ExprAssignment_1 ) ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4063:1: ( ( rule__Assertion__ExprAssignment_1 ) )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4063:1: ( ( rule__Assertion__ExprAssignment_1 ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4064:1: ( rule__Assertion__ExprAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAssertionAccess().getExprAssignment_1()); 
            }
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4065:1: ( rule__Assertion__ExprAssignment_1 )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4065:2: rule__Assertion__ExprAssignment_1
            {
            pushFollow(FOLLOW_rule__Assertion__ExprAssignment_1_in_rule__Assertion__Group__1__Impl8207);
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4075:1: rule__Assertion__Group__2 : rule__Assertion__Group__2__Impl ;
    public final void rule__Assertion__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4079:1: ( rule__Assertion__Group__2__Impl )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4080:2: rule__Assertion__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Assertion__Group__2__Impl_in_rule__Assertion__Group__28237);
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4086:1: rule__Assertion__Group__2__Impl : ( ';' ) ;
    public final void rule__Assertion__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4090:1: ( ( ';' ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4091:1: ( ';' )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4091:1: ( ';' )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4092:1: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAssertionAccess().getSemicolonKeyword_2()); 
            }
            match(input,26,FOLLOW_26_in_rule__Assertion__Group__2__Impl8265); if (state.failed) return ;
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4111:1: rule__ArrowExpr__Group__0 : rule__ArrowExpr__Group__0__Impl rule__ArrowExpr__Group__1 ;
    public final void rule__ArrowExpr__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4115:1: ( rule__ArrowExpr__Group__0__Impl rule__ArrowExpr__Group__1 )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4116:2: rule__ArrowExpr__Group__0__Impl rule__ArrowExpr__Group__1
            {
            pushFollow(FOLLOW_rule__ArrowExpr__Group__0__Impl_in_rule__ArrowExpr__Group__08302);
            rule__ArrowExpr__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ArrowExpr__Group__1_in_rule__ArrowExpr__Group__08305);
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4123:1: rule__ArrowExpr__Group__0__Impl : ( ruleImpliesExpr ) ;
    public final void rule__ArrowExpr__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4127:1: ( ( ruleImpliesExpr ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4128:1: ( ruleImpliesExpr )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4128:1: ( ruleImpliesExpr )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4129:1: ruleImpliesExpr
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getArrowExprAccess().getImpliesExprParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_ruleImpliesExpr_in_rule__ArrowExpr__Group__0__Impl8332);
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4140:1: rule__ArrowExpr__Group__1 : rule__ArrowExpr__Group__1__Impl ;
    public final void rule__ArrowExpr__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4144:1: ( rule__ArrowExpr__Group__1__Impl )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4145:2: rule__ArrowExpr__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__ArrowExpr__Group__1__Impl_in_rule__ArrowExpr__Group__18361);
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4151:1: rule__ArrowExpr__Group__1__Impl : ( ( rule__ArrowExpr__Group_1__0 )? ) ;
    public final void rule__ArrowExpr__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4155:1: ( ( ( rule__ArrowExpr__Group_1__0 )? ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4156:1: ( ( rule__ArrowExpr__Group_1__0 )? )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4156:1: ( ( rule__ArrowExpr__Group_1__0 )? )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4157:1: ( rule__ArrowExpr__Group_1__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getArrowExprAccess().getGroup_1()); 
            }
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4158:1: ( rule__ArrowExpr__Group_1__0 )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==54) ) {
                int LA27_1 = input.LA(2);

                if ( (synpred45_InternalJKind()) ) {
                    alt27=1;
                }
            }
            switch (alt27) {
                case 1 :
                    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4158:2: rule__ArrowExpr__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__ArrowExpr__Group_1__0_in_rule__ArrowExpr__Group__1__Impl8388);
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4172:1: rule__ArrowExpr__Group_1__0 : rule__ArrowExpr__Group_1__0__Impl ;
    public final void rule__ArrowExpr__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4176:1: ( rule__ArrowExpr__Group_1__0__Impl )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4177:2: rule__ArrowExpr__Group_1__0__Impl
            {
            pushFollow(FOLLOW_rule__ArrowExpr__Group_1__0__Impl_in_rule__ArrowExpr__Group_1__08423);
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4183:1: rule__ArrowExpr__Group_1__0__Impl : ( ( rule__ArrowExpr__Group_1_0__0 ) ) ;
    public final void rule__ArrowExpr__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4187:1: ( ( ( rule__ArrowExpr__Group_1_0__0 ) ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4188:1: ( ( rule__ArrowExpr__Group_1_0__0 ) )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4188:1: ( ( rule__ArrowExpr__Group_1_0__0 ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4189:1: ( rule__ArrowExpr__Group_1_0__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getArrowExprAccess().getGroup_1_0()); 
            }
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4190:1: ( rule__ArrowExpr__Group_1_0__0 )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4190:2: rule__ArrowExpr__Group_1_0__0
            {
            pushFollow(FOLLOW_rule__ArrowExpr__Group_1_0__0_in_rule__ArrowExpr__Group_1__0__Impl8450);
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4202:1: rule__ArrowExpr__Group_1_0__0 : rule__ArrowExpr__Group_1_0__0__Impl rule__ArrowExpr__Group_1_0__1 ;
    public final void rule__ArrowExpr__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4206:1: ( rule__ArrowExpr__Group_1_0__0__Impl rule__ArrowExpr__Group_1_0__1 )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4207:2: rule__ArrowExpr__Group_1_0__0__Impl rule__ArrowExpr__Group_1_0__1
            {
            pushFollow(FOLLOW_rule__ArrowExpr__Group_1_0__0__Impl_in_rule__ArrowExpr__Group_1_0__08482);
            rule__ArrowExpr__Group_1_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ArrowExpr__Group_1_0__1_in_rule__ArrowExpr__Group_1_0__08485);
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4214:1: rule__ArrowExpr__Group_1_0__0__Impl : ( () ) ;
    public final void rule__ArrowExpr__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4218:1: ( ( () ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4219:1: ( () )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4219:1: ( () )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4220:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getArrowExprAccess().getBinaryExprLeftAction_1_0_0()); 
            }
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4221:1: ()
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4223:1: 
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4233:1: rule__ArrowExpr__Group_1_0__1 : rule__ArrowExpr__Group_1_0__1__Impl rule__ArrowExpr__Group_1_0__2 ;
    public final void rule__ArrowExpr__Group_1_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4237:1: ( rule__ArrowExpr__Group_1_0__1__Impl rule__ArrowExpr__Group_1_0__2 )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4238:2: rule__ArrowExpr__Group_1_0__1__Impl rule__ArrowExpr__Group_1_0__2
            {
            pushFollow(FOLLOW_rule__ArrowExpr__Group_1_0__1__Impl_in_rule__ArrowExpr__Group_1_0__18543);
            rule__ArrowExpr__Group_1_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ArrowExpr__Group_1_0__2_in_rule__ArrowExpr__Group_1_0__18546);
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4245:1: rule__ArrowExpr__Group_1_0__1__Impl : ( ( rule__ArrowExpr__OpAssignment_1_0_1 ) ) ;
    public final void rule__ArrowExpr__Group_1_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4249:1: ( ( ( rule__ArrowExpr__OpAssignment_1_0_1 ) ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4250:1: ( ( rule__ArrowExpr__OpAssignment_1_0_1 ) )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4250:1: ( ( rule__ArrowExpr__OpAssignment_1_0_1 ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4251:1: ( rule__ArrowExpr__OpAssignment_1_0_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getArrowExprAccess().getOpAssignment_1_0_1()); 
            }
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4252:1: ( rule__ArrowExpr__OpAssignment_1_0_1 )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4252:2: rule__ArrowExpr__OpAssignment_1_0_1
            {
            pushFollow(FOLLOW_rule__ArrowExpr__OpAssignment_1_0_1_in_rule__ArrowExpr__Group_1_0__1__Impl8573);
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4262:1: rule__ArrowExpr__Group_1_0__2 : rule__ArrowExpr__Group_1_0__2__Impl ;
    public final void rule__ArrowExpr__Group_1_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4266:1: ( rule__ArrowExpr__Group_1_0__2__Impl )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4267:2: rule__ArrowExpr__Group_1_0__2__Impl
            {
            pushFollow(FOLLOW_rule__ArrowExpr__Group_1_0__2__Impl_in_rule__ArrowExpr__Group_1_0__28603);
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4273:1: rule__ArrowExpr__Group_1_0__2__Impl : ( ( rule__ArrowExpr__RightAssignment_1_0_2 ) ) ;
    public final void rule__ArrowExpr__Group_1_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4277:1: ( ( ( rule__ArrowExpr__RightAssignment_1_0_2 ) ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4278:1: ( ( rule__ArrowExpr__RightAssignment_1_0_2 ) )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4278:1: ( ( rule__ArrowExpr__RightAssignment_1_0_2 ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4279:1: ( rule__ArrowExpr__RightAssignment_1_0_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getArrowExprAccess().getRightAssignment_1_0_2()); 
            }
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4280:1: ( rule__ArrowExpr__RightAssignment_1_0_2 )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4280:2: rule__ArrowExpr__RightAssignment_1_0_2
            {
            pushFollow(FOLLOW_rule__ArrowExpr__RightAssignment_1_0_2_in_rule__ArrowExpr__Group_1_0__2__Impl8630);
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4296:1: rule__ImpliesExpr__Group__0 : rule__ImpliesExpr__Group__0__Impl rule__ImpliesExpr__Group__1 ;
    public final void rule__ImpliesExpr__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4300:1: ( rule__ImpliesExpr__Group__0__Impl rule__ImpliesExpr__Group__1 )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4301:2: rule__ImpliesExpr__Group__0__Impl rule__ImpliesExpr__Group__1
            {
            pushFollow(FOLLOW_rule__ImpliesExpr__Group__0__Impl_in_rule__ImpliesExpr__Group__08666);
            rule__ImpliesExpr__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ImpliesExpr__Group__1_in_rule__ImpliesExpr__Group__08669);
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4308:1: rule__ImpliesExpr__Group__0__Impl : ( ruleOrExpr ) ;
    public final void rule__ImpliesExpr__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4312:1: ( ( ruleOrExpr ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4313:1: ( ruleOrExpr )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4313:1: ( ruleOrExpr )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4314:1: ruleOrExpr
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getImpliesExprAccess().getOrExprParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_ruleOrExpr_in_rule__ImpliesExpr__Group__0__Impl8696);
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4325:1: rule__ImpliesExpr__Group__1 : rule__ImpliesExpr__Group__1__Impl ;
    public final void rule__ImpliesExpr__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4329:1: ( rule__ImpliesExpr__Group__1__Impl )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4330:2: rule__ImpliesExpr__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__ImpliesExpr__Group__1__Impl_in_rule__ImpliesExpr__Group__18725);
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4336:1: rule__ImpliesExpr__Group__1__Impl : ( ( rule__ImpliesExpr__Group_1__0 )? ) ;
    public final void rule__ImpliesExpr__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4340:1: ( ( ( rule__ImpliesExpr__Group_1__0 )? ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4341:1: ( ( rule__ImpliesExpr__Group_1__0 )? )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4341:1: ( ( rule__ImpliesExpr__Group_1__0 )? )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4342:1: ( rule__ImpliesExpr__Group_1__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getImpliesExprAccess().getGroup_1()); 
            }
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4343:1: ( rule__ImpliesExpr__Group_1__0 )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==55) ) {
                int LA28_1 = input.LA(2);

                if ( (synpred46_InternalJKind()) ) {
                    alt28=1;
                }
            }
            switch (alt28) {
                case 1 :
                    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4343:2: rule__ImpliesExpr__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__ImpliesExpr__Group_1__0_in_rule__ImpliesExpr__Group__1__Impl8752);
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4357:1: rule__ImpliesExpr__Group_1__0 : rule__ImpliesExpr__Group_1__0__Impl ;
    public final void rule__ImpliesExpr__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4361:1: ( rule__ImpliesExpr__Group_1__0__Impl )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4362:2: rule__ImpliesExpr__Group_1__0__Impl
            {
            pushFollow(FOLLOW_rule__ImpliesExpr__Group_1__0__Impl_in_rule__ImpliesExpr__Group_1__08787);
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4368:1: rule__ImpliesExpr__Group_1__0__Impl : ( ( rule__ImpliesExpr__Group_1_0__0 ) ) ;
    public final void rule__ImpliesExpr__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4372:1: ( ( ( rule__ImpliesExpr__Group_1_0__0 ) ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4373:1: ( ( rule__ImpliesExpr__Group_1_0__0 ) )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4373:1: ( ( rule__ImpliesExpr__Group_1_0__0 ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4374:1: ( rule__ImpliesExpr__Group_1_0__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getImpliesExprAccess().getGroup_1_0()); 
            }
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4375:1: ( rule__ImpliesExpr__Group_1_0__0 )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4375:2: rule__ImpliesExpr__Group_1_0__0
            {
            pushFollow(FOLLOW_rule__ImpliesExpr__Group_1_0__0_in_rule__ImpliesExpr__Group_1__0__Impl8814);
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4387:1: rule__ImpliesExpr__Group_1_0__0 : rule__ImpliesExpr__Group_1_0__0__Impl rule__ImpliesExpr__Group_1_0__1 ;
    public final void rule__ImpliesExpr__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4391:1: ( rule__ImpliesExpr__Group_1_0__0__Impl rule__ImpliesExpr__Group_1_0__1 )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4392:2: rule__ImpliesExpr__Group_1_0__0__Impl rule__ImpliesExpr__Group_1_0__1
            {
            pushFollow(FOLLOW_rule__ImpliesExpr__Group_1_0__0__Impl_in_rule__ImpliesExpr__Group_1_0__08846);
            rule__ImpliesExpr__Group_1_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ImpliesExpr__Group_1_0__1_in_rule__ImpliesExpr__Group_1_0__08849);
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4399:1: rule__ImpliesExpr__Group_1_0__0__Impl : ( () ) ;
    public final void rule__ImpliesExpr__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4403:1: ( ( () ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4404:1: ( () )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4404:1: ( () )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4405:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getImpliesExprAccess().getBinaryExprLeftAction_1_0_0()); 
            }
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4406:1: ()
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4408:1: 
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4418:1: rule__ImpliesExpr__Group_1_0__1 : rule__ImpliesExpr__Group_1_0__1__Impl rule__ImpliesExpr__Group_1_0__2 ;
    public final void rule__ImpliesExpr__Group_1_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4422:1: ( rule__ImpliesExpr__Group_1_0__1__Impl rule__ImpliesExpr__Group_1_0__2 )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4423:2: rule__ImpliesExpr__Group_1_0__1__Impl rule__ImpliesExpr__Group_1_0__2
            {
            pushFollow(FOLLOW_rule__ImpliesExpr__Group_1_0__1__Impl_in_rule__ImpliesExpr__Group_1_0__18907);
            rule__ImpliesExpr__Group_1_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ImpliesExpr__Group_1_0__2_in_rule__ImpliesExpr__Group_1_0__18910);
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4430:1: rule__ImpliesExpr__Group_1_0__1__Impl : ( ( rule__ImpliesExpr__OpAssignment_1_0_1 ) ) ;
    public final void rule__ImpliesExpr__Group_1_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4434:1: ( ( ( rule__ImpliesExpr__OpAssignment_1_0_1 ) ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4435:1: ( ( rule__ImpliesExpr__OpAssignment_1_0_1 ) )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4435:1: ( ( rule__ImpliesExpr__OpAssignment_1_0_1 ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4436:1: ( rule__ImpliesExpr__OpAssignment_1_0_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getImpliesExprAccess().getOpAssignment_1_0_1()); 
            }
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4437:1: ( rule__ImpliesExpr__OpAssignment_1_0_1 )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4437:2: rule__ImpliesExpr__OpAssignment_1_0_1
            {
            pushFollow(FOLLOW_rule__ImpliesExpr__OpAssignment_1_0_1_in_rule__ImpliesExpr__Group_1_0__1__Impl8937);
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4447:1: rule__ImpliesExpr__Group_1_0__2 : rule__ImpliesExpr__Group_1_0__2__Impl ;
    public final void rule__ImpliesExpr__Group_1_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4451:1: ( rule__ImpliesExpr__Group_1_0__2__Impl )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4452:2: rule__ImpliesExpr__Group_1_0__2__Impl
            {
            pushFollow(FOLLOW_rule__ImpliesExpr__Group_1_0__2__Impl_in_rule__ImpliesExpr__Group_1_0__28967);
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4458:1: rule__ImpliesExpr__Group_1_0__2__Impl : ( ( rule__ImpliesExpr__RightAssignment_1_0_2 ) ) ;
    public final void rule__ImpliesExpr__Group_1_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4462:1: ( ( ( rule__ImpliesExpr__RightAssignment_1_0_2 ) ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4463:1: ( ( rule__ImpliesExpr__RightAssignment_1_0_2 ) )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4463:1: ( ( rule__ImpliesExpr__RightAssignment_1_0_2 ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4464:1: ( rule__ImpliesExpr__RightAssignment_1_0_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getImpliesExprAccess().getRightAssignment_1_0_2()); 
            }
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4465:1: ( rule__ImpliesExpr__RightAssignment_1_0_2 )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4465:2: rule__ImpliesExpr__RightAssignment_1_0_2
            {
            pushFollow(FOLLOW_rule__ImpliesExpr__RightAssignment_1_0_2_in_rule__ImpliesExpr__Group_1_0__2__Impl8994);
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4481:1: rule__OrExpr__Group__0 : rule__OrExpr__Group__0__Impl rule__OrExpr__Group__1 ;
    public final void rule__OrExpr__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4485:1: ( rule__OrExpr__Group__0__Impl rule__OrExpr__Group__1 )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4486:2: rule__OrExpr__Group__0__Impl rule__OrExpr__Group__1
            {
            pushFollow(FOLLOW_rule__OrExpr__Group__0__Impl_in_rule__OrExpr__Group__09030);
            rule__OrExpr__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__OrExpr__Group__1_in_rule__OrExpr__Group__09033);
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4493:1: rule__OrExpr__Group__0__Impl : ( ruleAndExpr ) ;
    public final void rule__OrExpr__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4497:1: ( ( ruleAndExpr ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4498:1: ( ruleAndExpr )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4498:1: ( ruleAndExpr )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4499:1: ruleAndExpr
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOrExprAccess().getAndExprParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_ruleAndExpr_in_rule__OrExpr__Group__0__Impl9060);
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4510:1: rule__OrExpr__Group__1 : rule__OrExpr__Group__1__Impl ;
    public final void rule__OrExpr__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4514:1: ( rule__OrExpr__Group__1__Impl )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4515:2: rule__OrExpr__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__OrExpr__Group__1__Impl_in_rule__OrExpr__Group__19089);
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4521:1: rule__OrExpr__Group__1__Impl : ( ( rule__OrExpr__Group_1__0 )* ) ;
    public final void rule__OrExpr__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4525:1: ( ( ( rule__OrExpr__Group_1__0 )* ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4526:1: ( ( rule__OrExpr__Group_1__0 )* )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4526:1: ( ( rule__OrExpr__Group_1__0 )* )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4527:1: ( rule__OrExpr__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOrExprAccess().getGroup_1()); 
            }
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4528:1: ( rule__OrExpr__Group_1__0 )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==10) ) {
                    int LA29_2 = input.LA(2);

                    if ( (synpred47_InternalJKind()) ) {
                        alt29=1;
                    }


                }
                else if ( (LA29_0==11) ) {
                    int LA29_3 = input.LA(2);

                    if ( (synpred47_InternalJKind()) ) {
                        alt29=1;
                    }


                }


                switch (alt29) {
            	case 1 :
            	    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4528:2: rule__OrExpr__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__OrExpr__Group_1__0_in_rule__OrExpr__Group__1__Impl9116);
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4542:1: rule__OrExpr__Group_1__0 : rule__OrExpr__Group_1__0__Impl ;
    public final void rule__OrExpr__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4546:1: ( rule__OrExpr__Group_1__0__Impl )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4547:2: rule__OrExpr__Group_1__0__Impl
            {
            pushFollow(FOLLOW_rule__OrExpr__Group_1__0__Impl_in_rule__OrExpr__Group_1__09151);
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4553:1: rule__OrExpr__Group_1__0__Impl : ( ( rule__OrExpr__Group_1_0__0 ) ) ;
    public final void rule__OrExpr__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4557:1: ( ( ( rule__OrExpr__Group_1_0__0 ) ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4558:1: ( ( rule__OrExpr__Group_1_0__0 ) )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4558:1: ( ( rule__OrExpr__Group_1_0__0 ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4559:1: ( rule__OrExpr__Group_1_0__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOrExprAccess().getGroup_1_0()); 
            }
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4560:1: ( rule__OrExpr__Group_1_0__0 )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4560:2: rule__OrExpr__Group_1_0__0
            {
            pushFollow(FOLLOW_rule__OrExpr__Group_1_0__0_in_rule__OrExpr__Group_1__0__Impl9178);
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4572:1: rule__OrExpr__Group_1_0__0 : rule__OrExpr__Group_1_0__0__Impl rule__OrExpr__Group_1_0__1 ;
    public final void rule__OrExpr__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4576:1: ( rule__OrExpr__Group_1_0__0__Impl rule__OrExpr__Group_1_0__1 )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4577:2: rule__OrExpr__Group_1_0__0__Impl rule__OrExpr__Group_1_0__1
            {
            pushFollow(FOLLOW_rule__OrExpr__Group_1_0__0__Impl_in_rule__OrExpr__Group_1_0__09210);
            rule__OrExpr__Group_1_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__OrExpr__Group_1_0__1_in_rule__OrExpr__Group_1_0__09213);
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4584:1: rule__OrExpr__Group_1_0__0__Impl : ( () ) ;
    public final void rule__OrExpr__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4588:1: ( ( () ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4589:1: ( () )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4589:1: ( () )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4590:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOrExprAccess().getBinaryExprLeftAction_1_0_0()); 
            }
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4591:1: ()
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4593:1: 
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4603:1: rule__OrExpr__Group_1_0__1 : rule__OrExpr__Group_1_0__1__Impl rule__OrExpr__Group_1_0__2 ;
    public final void rule__OrExpr__Group_1_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4607:1: ( rule__OrExpr__Group_1_0__1__Impl rule__OrExpr__Group_1_0__2 )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4608:2: rule__OrExpr__Group_1_0__1__Impl rule__OrExpr__Group_1_0__2
            {
            pushFollow(FOLLOW_rule__OrExpr__Group_1_0__1__Impl_in_rule__OrExpr__Group_1_0__19271);
            rule__OrExpr__Group_1_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__OrExpr__Group_1_0__2_in_rule__OrExpr__Group_1_0__19274);
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4615:1: rule__OrExpr__Group_1_0__1__Impl : ( ( rule__OrExpr__OpAssignment_1_0_1 ) ) ;
    public final void rule__OrExpr__Group_1_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4619:1: ( ( ( rule__OrExpr__OpAssignment_1_0_1 ) ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4620:1: ( ( rule__OrExpr__OpAssignment_1_0_1 ) )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4620:1: ( ( rule__OrExpr__OpAssignment_1_0_1 ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4621:1: ( rule__OrExpr__OpAssignment_1_0_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOrExprAccess().getOpAssignment_1_0_1()); 
            }
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4622:1: ( rule__OrExpr__OpAssignment_1_0_1 )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4622:2: rule__OrExpr__OpAssignment_1_0_1
            {
            pushFollow(FOLLOW_rule__OrExpr__OpAssignment_1_0_1_in_rule__OrExpr__Group_1_0__1__Impl9301);
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4632:1: rule__OrExpr__Group_1_0__2 : rule__OrExpr__Group_1_0__2__Impl ;
    public final void rule__OrExpr__Group_1_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4636:1: ( rule__OrExpr__Group_1_0__2__Impl )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4637:2: rule__OrExpr__Group_1_0__2__Impl
            {
            pushFollow(FOLLOW_rule__OrExpr__Group_1_0__2__Impl_in_rule__OrExpr__Group_1_0__29331);
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4643:1: rule__OrExpr__Group_1_0__2__Impl : ( ( rule__OrExpr__RightAssignment_1_0_2 ) ) ;
    public final void rule__OrExpr__Group_1_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4647:1: ( ( ( rule__OrExpr__RightAssignment_1_0_2 ) ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4648:1: ( ( rule__OrExpr__RightAssignment_1_0_2 ) )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4648:1: ( ( rule__OrExpr__RightAssignment_1_0_2 ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4649:1: ( rule__OrExpr__RightAssignment_1_0_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOrExprAccess().getRightAssignment_1_0_2()); 
            }
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4650:1: ( rule__OrExpr__RightAssignment_1_0_2 )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4650:2: rule__OrExpr__RightAssignment_1_0_2
            {
            pushFollow(FOLLOW_rule__OrExpr__RightAssignment_1_0_2_in_rule__OrExpr__Group_1_0__2__Impl9358);
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4666:1: rule__AndExpr__Group__0 : rule__AndExpr__Group__0__Impl rule__AndExpr__Group__1 ;
    public final void rule__AndExpr__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4670:1: ( rule__AndExpr__Group__0__Impl rule__AndExpr__Group__1 )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4671:2: rule__AndExpr__Group__0__Impl rule__AndExpr__Group__1
            {
            pushFollow(FOLLOW_rule__AndExpr__Group__0__Impl_in_rule__AndExpr__Group__09394);
            rule__AndExpr__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__AndExpr__Group__1_in_rule__AndExpr__Group__09397);
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4678:1: rule__AndExpr__Group__0__Impl : ( ruleRelationalExpr ) ;
    public final void rule__AndExpr__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4682:1: ( ( ruleRelationalExpr ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4683:1: ( ruleRelationalExpr )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4683:1: ( ruleRelationalExpr )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4684:1: ruleRelationalExpr
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAndExprAccess().getRelationalExprParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_ruleRelationalExpr_in_rule__AndExpr__Group__0__Impl9424);
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4695:1: rule__AndExpr__Group__1 : rule__AndExpr__Group__1__Impl ;
    public final void rule__AndExpr__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4699:1: ( rule__AndExpr__Group__1__Impl )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4700:2: rule__AndExpr__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__AndExpr__Group__1__Impl_in_rule__AndExpr__Group__19453);
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4706:1: rule__AndExpr__Group__1__Impl : ( ( rule__AndExpr__Group_1__0 )* ) ;
    public final void rule__AndExpr__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4710:1: ( ( ( rule__AndExpr__Group_1__0 )* ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4711:1: ( ( rule__AndExpr__Group_1__0 )* )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4711:1: ( ( rule__AndExpr__Group_1__0 )* )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4712:1: ( rule__AndExpr__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAndExprAccess().getGroup_1()); 
            }
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4713:1: ( rule__AndExpr__Group_1__0 )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==56) ) {
                    int LA30_2 = input.LA(2);

                    if ( (synpred48_InternalJKind()) ) {
                        alt30=1;
                    }


                }


                switch (alt30) {
            	case 1 :
            	    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4713:2: rule__AndExpr__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__AndExpr__Group_1__0_in_rule__AndExpr__Group__1__Impl9480);
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4727:1: rule__AndExpr__Group_1__0 : rule__AndExpr__Group_1__0__Impl ;
    public final void rule__AndExpr__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4731:1: ( rule__AndExpr__Group_1__0__Impl )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4732:2: rule__AndExpr__Group_1__0__Impl
            {
            pushFollow(FOLLOW_rule__AndExpr__Group_1__0__Impl_in_rule__AndExpr__Group_1__09515);
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4738:1: rule__AndExpr__Group_1__0__Impl : ( ( rule__AndExpr__Group_1_0__0 ) ) ;
    public final void rule__AndExpr__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4742:1: ( ( ( rule__AndExpr__Group_1_0__0 ) ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4743:1: ( ( rule__AndExpr__Group_1_0__0 ) )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4743:1: ( ( rule__AndExpr__Group_1_0__0 ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4744:1: ( rule__AndExpr__Group_1_0__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAndExprAccess().getGroup_1_0()); 
            }
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4745:1: ( rule__AndExpr__Group_1_0__0 )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4745:2: rule__AndExpr__Group_1_0__0
            {
            pushFollow(FOLLOW_rule__AndExpr__Group_1_0__0_in_rule__AndExpr__Group_1__0__Impl9542);
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4757:1: rule__AndExpr__Group_1_0__0 : rule__AndExpr__Group_1_0__0__Impl rule__AndExpr__Group_1_0__1 ;
    public final void rule__AndExpr__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4761:1: ( rule__AndExpr__Group_1_0__0__Impl rule__AndExpr__Group_1_0__1 )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4762:2: rule__AndExpr__Group_1_0__0__Impl rule__AndExpr__Group_1_0__1
            {
            pushFollow(FOLLOW_rule__AndExpr__Group_1_0__0__Impl_in_rule__AndExpr__Group_1_0__09574);
            rule__AndExpr__Group_1_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__AndExpr__Group_1_0__1_in_rule__AndExpr__Group_1_0__09577);
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4769:1: rule__AndExpr__Group_1_0__0__Impl : ( () ) ;
    public final void rule__AndExpr__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4773:1: ( ( () ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4774:1: ( () )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4774:1: ( () )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4775:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAndExprAccess().getBinaryExprLeftAction_1_0_0()); 
            }
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4776:1: ()
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4778:1: 
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4788:1: rule__AndExpr__Group_1_0__1 : rule__AndExpr__Group_1_0__1__Impl rule__AndExpr__Group_1_0__2 ;
    public final void rule__AndExpr__Group_1_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4792:1: ( rule__AndExpr__Group_1_0__1__Impl rule__AndExpr__Group_1_0__2 )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4793:2: rule__AndExpr__Group_1_0__1__Impl rule__AndExpr__Group_1_0__2
            {
            pushFollow(FOLLOW_rule__AndExpr__Group_1_0__1__Impl_in_rule__AndExpr__Group_1_0__19635);
            rule__AndExpr__Group_1_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__AndExpr__Group_1_0__2_in_rule__AndExpr__Group_1_0__19638);
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4800:1: rule__AndExpr__Group_1_0__1__Impl : ( ( rule__AndExpr__OpAssignment_1_0_1 ) ) ;
    public final void rule__AndExpr__Group_1_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4804:1: ( ( ( rule__AndExpr__OpAssignment_1_0_1 ) ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4805:1: ( ( rule__AndExpr__OpAssignment_1_0_1 ) )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4805:1: ( ( rule__AndExpr__OpAssignment_1_0_1 ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4806:1: ( rule__AndExpr__OpAssignment_1_0_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAndExprAccess().getOpAssignment_1_0_1()); 
            }
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4807:1: ( rule__AndExpr__OpAssignment_1_0_1 )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4807:2: rule__AndExpr__OpAssignment_1_0_1
            {
            pushFollow(FOLLOW_rule__AndExpr__OpAssignment_1_0_1_in_rule__AndExpr__Group_1_0__1__Impl9665);
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4817:1: rule__AndExpr__Group_1_0__2 : rule__AndExpr__Group_1_0__2__Impl ;
    public final void rule__AndExpr__Group_1_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4821:1: ( rule__AndExpr__Group_1_0__2__Impl )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4822:2: rule__AndExpr__Group_1_0__2__Impl
            {
            pushFollow(FOLLOW_rule__AndExpr__Group_1_0__2__Impl_in_rule__AndExpr__Group_1_0__29695);
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4828:1: rule__AndExpr__Group_1_0__2__Impl : ( ( rule__AndExpr__RightAssignment_1_0_2 ) ) ;
    public final void rule__AndExpr__Group_1_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4832:1: ( ( ( rule__AndExpr__RightAssignment_1_0_2 ) ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4833:1: ( ( rule__AndExpr__RightAssignment_1_0_2 ) )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4833:1: ( ( rule__AndExpr__RightAssignment_1_0_2 ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4834:1: ( rule__AndExpr__RightAssignment_1_0_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAndExprAccess().getRightAssignment_1_0_2()); 
            }
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4835:1: ( rule__AndExpr__RightAssignment_1_0_2 )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4835:2: rule__AndExpr__RightAssignment_1_0_2
            {
            pushFollow(FOLLOW_rule__AndExpr__RightAssignment_1_0_2_in_rule__AndExpr__Group_1_0__2__Impl9722);
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4851:1: rule__RelationalExpr__Group__0 : rule__RelationalExpr__Group__0__Impl rule__RelationalExpr__Group__1 ;
    public final void rule__RelationalExpr__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4855:1: ( rule__RelationalExpr__Group__0__Impl rule__RelationalExpr__Group__1 )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4856:2: rule__RelationalExpr__Group__0__Impl rule__RelationalExpr__Group__1
            {
            pushFollow(FOLLOW_rule__RelationalExpr__Group__0__Impl_in_rule__RelationalExpr__Group__09758);
            rule__RelationalExpr__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__RelationalExpr__Group__1_in_rule__RelationalExpr__Group__09761);
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4863:1: rule__RelationalExpr__Group__0__Impl : ( rulePlusExpr ) ;
    public final void rule__RelationalExpr__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4867:1: ( ( rulePlusExpr ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4868:1: ( rulePlusExpr )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4868:1: ( rulePlusExpr )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4869:1: rulePlusExpr
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRelationalExprAccess().getPlusExprParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_rulePlusExpr_in_rule__RelationalExpr__Group__0__Impl9788);
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4880:1: rule__RelationalExpr__Group__1 : rule__RelationalExpr__Group__1__Impl ;
    public final void rule__RelationalExpr__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4884:1: ( rule__RelationalExpr__Group__1__Impl )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4885:2: rule__RelationalExpr__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__RelationalExpr__Group__1__Impl_in_rule__RelationalExpr__Group__19817);
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4891:1: rule__RelationalExpr__Group__1__Impl : ( ( rule__RelationalExpr__Group_1__0 )? ) ;
    public final void rule__RelationalExpr__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4895:1: ( ( ( rule__RelationalExpr__Group_1__0 )? ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4896:1: ( ( rule__RelationalExpr__Group_1__0 )? )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4896:1: ( ( rule__RelationalExpr__Group_1__0 )? )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4897:1: ( rule__RelationalExpr__Group_1__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRelationalExprAccess().getGroup_1()); 
            }
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4898:1: ( rule__RelationalExpr__Group_1__0 )?
            int alt31=2;
            switch ( input.LA(1) ) {
                case 12:
                    {
                    int LA31_1 = input.LA(2);

                    if ( (synpred49_InternalJKind()) ) {
                        alt31=1;
                    }
                    }
                    break;
                case 13:
                    {
                    int LA31_2 = input.LA(2);

                    if ( (synpred49_InternalJKind()) ) {
                        alt31=1;
                    }
                    }
                    break;
                case 14:
                    {
                    int LA31_3 = input.LA(2);

                    if ( (synpred49_InternalJKind()) ) {
                        alt31=1;
                    }
                    }
                    break;
                case 15:
                    {
                    int LA31_4 = input.LA(2);

                    if ( (synpred49_InternalJKind()) ) {
                        alt31=1;
                    }
                    }
                    break;
                case 16:
                    {
                    int LA31_5 = input.LA(2);

                    if ( (synpred49_InternalJKind()) ) {
                        alt31=1;
                    }
                    }
                    break;
                case 17:
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
                    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4898:2: rule__RelationalExpr__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__RelationalExpr__Group_1__0_in_rule__RelationalExpr__Group__1__Impl9844);
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4912:1: rule__RelationalExpr__Group_1__0 : rule__RelationalExpr__Group_1__0__Impl ;
    public final void rule__RelationalExpr__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4916:1: ( rule__RelationalExpr__Group_1__0__Impl )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4917:2: rule__RelationalExpr__Group_1__0__Impl
            {
            pushFollow(FOLLOW_rule__RelationalExpr__Group_1__0__Impl_in_rule__RelationalExpr__Group_1__09879);
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4923:1: rule__RelationalExpr__Group_1__0__Impl : ( ( rule__RelationalExpr__Group_1_0__0 ) ) ;
    public final void rule__RelationalExpr__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4927:1: ( ( ( rule__RelationalExpr__Group_1_0__0 ) ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4928:1: ( ( rule__RelationalExpr__Group_1_0__0 ) )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4928:1: ( ( rule__RelationalExpr__Group_1_0__0 ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4929:1: ( rule__RelationalExpr__Group_1_0__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRelationalExprAccess().getGroup_1_0()); 
            }
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4930:1: ( rule__RelationalExpr__Group_1_0__0 )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4930:2: rule__RelationalExpr__Group_1_0__0
            {
            pushFollow(FOLLOW_rule__RelationalExpr__Group_1_0__0_in_rule__RelationalExpr__Group_1__0__Impl9906);
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4942:1: rule__RelationalExpr__Group_1_0__0 : rule__RelationalExpr__Group_1_0__0__Impl rule__RelationalExpr__Group_1_0__1 ;
    public final void rule__RelationalExpr__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4946:1: ( rule__RelationalExpr__Group_1_0__0__Impl rule__RelationalExpr__Group_1_0__1 )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4947:2: rule__RelationalExpr__Group_1_0__0__Impl rule__RelationalExpr__Group_1_0__1
            {
            pushFollow(FOLLOW_rule__RelationalExpr__Group_1_0__0__Impl_in_rule__RelationalExpr__Group_1_0__09938);
            rule__RelationalExpr__Group_1_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__RelationalExpr__Group_1_0__1_in_rule__RelationalExpr__Group_1_0__09941);
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4954:1: rule__RelationalExpr__Group_1_0__0__Impl : ( () ) ;
    public final void rule__RelationalExpr__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4958:1: ( ( () ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4959:1: ( () )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4959:1: ( () )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4960:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRelationalExprAccess().getBinaryExprLeftAction_1_0_0()); 
            }
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4961:1: ()
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4963:1: 
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4973:1: rule__RelationalExpr__Group_1_0__1 : rule__RelationalExpr__Group_1_0__1__Impl rule__RelationalExpr__Group_1_0__2 ;
    public final void rule__RelationalExpr__Group_1_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4977:1: ( rule__RelationalExpr__Group_1_0__1__Impl rule__RelationalExpr__Group_1_0__2 )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4978:2: rule__RelationalExpr__Group_1_0__1__Impl rule__RelationalExpr__Group_1_0__2
            {
            pushFollow(FOLLOW_rule__RelationalExpr__Group_1_0__1__Impl_in_rule__RelationalExpr__Group_1_0__19999);
            rule__RelationalExpr__Group_1_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__RelationalExpr__Group_1_0__2_in_rule__RelationalExpr__Group_1_0__110002);
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4985:1: rule__RelationalExpr__Group_1_0__1__Impl : ( ( rule__RelationalExpr__OpAssignment_1_0_1 ) ) ;
    public final void rule__RelationalExpr__Group_1_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4989:1: ( ( ( rule__RelationalExpr__OpAssignment_1_0_1 ) ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4990:1: ( ( rule__RelationalExpr__OpAssignment_1_0_1 ) )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4990:1: ( ( rule__RelationalExpr__OpAssignment_1_0_1 ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4991:1: ( rule__RelationalExpr__OpAssignment_1_0_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRelationalExprAccess().getOpAssignment_1_0_1()); 
            }
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4992:1: ( rule__RelationalExpr__OpAssignment_1_0_1 )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4992:2: rule__RelationalExpr__OpAssignment_1_0_1
            {
            pushFollow(FOLLOW_rule__RelationalExpr__OpAssignment_1_0_1_in_rule__RelationalExpr__Group_1_0__1__Impl10029);
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5002:1: rule__RelationalExpr__Group_1_0__2 : rule__RelationalExpr__Group_1_0__2__Impl ;
    public final void rule__RelationalExpr__Group_1_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5006:1: ( rule__RelationalExpr__Group_1_0__2__Impl )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5007:2: rule__RelationalExpr__Group_1_0__2__Impl
            {
            pushFollow(FOLLOW_rule__RelationalExpr__Group_1_0__2__Impl_in_rule__RelationalExpr__Group_1_0__210059);
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5013:1: rule__RelationalExpr__Group_1_0__2__Impl : ( ( rule__RelationalExpr__RightAssignment_1_0_2 ) ) ;
    public final void rule__RelationalExpr__Group_1_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5017:1: ( ( ( rule__RelationalExpr__RightAssignment_1_0_2 ) ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5018:1: ( ( rule__RelationalExpr__RightAssignment_1_0_2 ) )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5018:1: ( ( rule__RelationalExpr__RightAssignment_1_0_2 ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5019:1: ( rule__RelationalExpr__RightAssignment_1_0_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRelationalExprAccess().getRightAssignment_1_0_2()); 
            }
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5020:1: ( rule__RelationalExpr__RightAssignment_1_0_2 )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5020:2: rule__RelationalExpr__RightAssignment_1_0_2
            {
            pushFollow(FOLLOW_rule__RelationalExpr__RightAssignment_1_0_2_in_rule__RelationalExpr__Group_1_0__2__Impl10086);
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5036:1: rule__PlusExpr__Group__0 : rule__PlusExpr__Group__0__Impl rule__PlusExpr__Group__1 ;
    public final void rule__PlusExpr__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5040:1: ( rule__PlusExpr__Group__0__Impl rule__PlusExpr__Group__1 )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5041:2: rule__PlusExpr__Group__0__Impl rule__PlusExpr__Group__1
            {
            pushFollow(FOLLOW_rule__PlusExpr__Group__0__Impl_in_rule__PlusExpr__Group__010122);
            rule__PlusExpr__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__PlusExpr__Group__1_in_rule__PlusExpr__Group__010125);
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5048:1: rule__PlusExpr__Group__0__Impl : ( ruleTimesExpr ) ;
    public final void rule__PlusExpr__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5052:1: ( ( ruleTimesExpr ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5053:1: ( ruleTimesExpr )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5053:1: ( ruleTimesExpr )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5054:1: ruleTimesExpr
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPlusExprAccess().getTimesExprParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_ruleTimesExpr_in_rule__PlusExpr__Group__0__Impl10152);
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5065:1: rule__PlusExpr__Group__1 : rule__PlusExpr__Group__1__Impl ;
    public final void rule__PlusExpr__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5069:1: ( rule__PlusExpr__Group__1__Impl )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5070:2: rule__PlusExpr__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__PlusExpr__Group__1__Impl_in_rule__PlusExpr__Group__110181);
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5076:1: rule__PlusExpr__Group__1__Impl : ( ( rule__PlusExpr__Group_1__0 )* ) ;
    public final void rule__PlusExpr__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5080:1: ( ( ( rule__PlusExpr__Group_1__0 )* ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5081:1: ( ( rule__PlusExpr__Group_1__0 )* )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5081:1: ( ( rule__PlusExpr__Group_1__0 )* )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5082:1: ( rule__PlusExpr__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPlusExprAccess().getGroup_1()); 
            }
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5083:1: ( rule__PlusExpr__Group_1__0 )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( (LA32_0==18) ) {
                    int LA32_2 = input.LA(2);

                    if ( (synpred50_InternalJKind()) ) {
                        alt32=1;
                    }


                }
                else if ( (LA32_0==19) ) {
                    int LA32_3 = input.LA(2);

                    if ( (synpred50_InternalJKind()) ) {
                        alt32=1;
                    }


                }


                switch (alt32) {
            	case 1 :
            	    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5083:2: rule__PlusExpr__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__PlusExpr__Group_1__0_in_rule__PlusExpr__Group__1__Impl10208);
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5097:1: rule__PlusExpr__Group_1__0 : rule__PlusExpr__Group_1__0__Impl ;
    public final void rule__PlusExpr__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5101:1: ( rule__PlusExpr__Group_1__0__Impl )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5102:2: rule__PlusExpr__Group_1__0__Impl
            {
            pushFollow(FOLLOW_rule__PlusExpr__Group_1__0__Impl_in_rule__PlusExpr__Group_1__010243);
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5108:1: rule__PlusExpr__Group_1__0__Impl : ( ( rule__PlusExpr__Group_1_0__0 ) ) ;
    public final void rule__PlusExpr__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5112:1: ( ( ( rule__PlusExpr__Group_1_0__0 ) ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5113:1: ( ( rule__PlusExpr__Group_1_0__0 ) )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5113:1: ( ( rule__PlusExpr__Group_1_0__0 ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5114:1: ( rule__PlusExpr__Group_1_0__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPlusExprAccess().getGroup_1_0()); 
            }
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5115:1: ( rule__PlusExpr__Group_1_0__0 )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5115:2: rule__PlusExpr__Group_1_0__0
            {
            pushFollow(FOLLOW_rule__PlusExpr__Group_1_0__0_in_rule__PlusExpr__Group_1__0__Impl10270);
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5127:1: rule__PlusExpr__Group_1_0__0 : rule__PlusExpr__Group_1_0__0__Impl rule__PlusExpr__Group_1_0__1 ;
    public final void rule__PlusExpr__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5131:1: ( rule__PlusExpr__Group_1_0__0__Impl rule__PlusExpr__Group_1_0__1 )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5132:2: rule__PlusExpr__Group_1_0__0__Impl rule__PlusExpr__Group_1_0__1
            {
            pushFollow(FOLLOW_rule__PlusExpr__Group_1_0__0__Impl_in_rule__PlusExpr__Group_1_0__010302);
            rule__PlusExpr__Group_1_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__PlusExpr__Group_1_0__1_in_rule__PlusExpr__Group_1_0__010305);
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5139:1: rule__PlusExpr__Group_1_0__0__Impl : ( () ) ;
    public final void rule__PlusExpr__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5143:1: ( ( () ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5144:1: ( () )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5144:1: ( () )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5145:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPlusExprAccess().getBinaryExprLeftAction_1_0_0()); 
            }
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5146:1: ()
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5148:1: 
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5158:1: rule__PlusExpr__Group_1_0__1 : rule__PlusExpr__Group_1_0__1__Impl rule__PlusExpr__Group_1_0__2 ;
    public final void rule__PlusExpr__Group_1_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5162:1: ( rule__PlusExpr__Group_1_0__1__Impl rule__PlusExpr__Group_1_0__2 )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5163:2: rule__PlusExpr__Group_1_0__1__Impl rule__PlusExpr__Group_1_0__2
            {
            pushFollow(FOLLOW_rule__PlusExpr__Group_1_0__1__Impl_in_rule__PlusExpr__Group_1_0__110363);
            rule__PlusExpr__Group_1_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__PlusExpr__Group_1_0__2_in_rule__PlusExpr__Group_1_0__110366);
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5170:1: rule__PlusExpr__Group_1_0__1__Impl : ( ( rule__PlusExpr__OpAssignment_1_0_1 ) ) ;
    public final void rule__PlusExpr__Group_1_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5174:1: ( ( ( rule__PlusExpr__OpAssignment_1_0_1 ) ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5175:1: ( ( rule__PlusExpr__OpAssignment_1_0_1 ) )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5175:1: ( ( rule__PlusExpr__OpAssignment_1_0_1 ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5176:1: ( rule__PlusExpr__OpAssignment_1_0_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPlusExprAccess().getOpAssignment_1_0_1()); 
            }
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5177:1: ( rule__PlusExpr__OpAssignment_1_0_1 )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5177:2: rule__PlusExpr__OpAssignment_1_0_1
            {
            pushFollow(FOLLOW_rule__PlusExpr__OpAssignment_1_0_1_in_rule__PlusExpr__Group_1_0__1__Impl10393);
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5187:1: rule__PlusExpr__Group_1_0__2 : rule__PlusExpr__Group_1_0__2__Impl ;
    public final void rule__PlusExpr__Group_1_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5191:1: ( rule__PlusExpr__Group_1_0__2__Impl )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5192:2: rule__PlusExpr__Group_1_0__2__Impl
            {
            pushFollow(FOLLOW_rule__PlusExpr__Group_1_0__2__Impl_in_rule__PlusExpr__Group_1_0__210423);
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5198:1: rule__PlusExpr__Group_1_0__2__Impl : ( ( rule__PlusExpr__RightAssignment_1_0_2 ) ) ;
    public final void rule__PlusExpr__Group_1_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5202:1: ( ( ( rule__PlusExpr__RightAssignment_1_0_2 ) ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5203:1: ( ( rule__PlusExpr__RightAssignment_1_0_2 ) )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5203:1: ( ( rule__PlusExpr__RightAssignment_1_0_2 ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5204:1: ( rule__PlusExpr__RightAssignment_1_0_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPlusExprAccess().getRightAssignment_1_0_2()); 
            }
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5205:1: ( rule__PlusExpr__RightAssignment_1_0_2 )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5205:2: rule__PlusExpr__RightAssignment_1_0_2
            {
            pushFollow(FOLLOW_rule__PlusExpr__RightAssignment_1_0_2_in_rule__PlusExpr__Group_1_0__2__Impl10450);
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5221:1: rule__TimesExpr__Group__0 : rule__TimesExpr__Group__0__Impl rule__TimesExpr__Group__1 ;
    public final void rule__TimesExpr__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5225:1: ( rule__TimesExpr__Group__0__Impl rule__TimesExpr__Group__1 )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5226:2: rule__TimesExpr__Group__0__Impl rule__TimesExpr__Group__1
            {
            pushFollow(FOLLOW_rule__TimesExpr__Group__0__Impl_in_rule__TimesExpr__Group__010486);
            rule__TimesExpr__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__TimesExpr__Group__1_in_rule__TimesExpr__Group__010489);
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5233:1: rule__TimesExpr__Group__0__Impl : ( rulePrefixExpr ) ;
    public final void rule__TimesExpr__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5237:1: ( ( rulePrefixExpr ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5238:1: ( rulePrefixExpr )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5238:1: ( rulePrefixExpr )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5239:1: rulePrefixExpr
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTimesExprAccess().getPrefixExprParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_rulePrefixExpr_in_rule__TimesExpr__Group__0__Impl10516);
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5250:1: rule__TimesExpr__Group__1 : rule__TimesExpr__Group__1__Impl ;
    public final void rule__TimesExpr__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5254:1: ( rule__TimesExpr__Group__1__Impl )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5255:2: rule__TimesExpr__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__TimesExpr__Group__1__Impl_in_rule__TimesExpr__Group__110545);
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5261:1: rule__TimesExpr__Group__1__Impl : ( ( rule__TimesExpr__Group_1__0 )* ) ;
    public final void rule__TimesExpr__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5265:1: ( ( ( rule__TimesExpr__Group_1__0 )* ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5266:1: ( ( rule__TimesExpr__Group_1__0 )* )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5266:1: ( ( rule__TimesExpr__Group_1__0 )* )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5267:1: ( rule__TimesExpr__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTimesExprAccess().getGroup_1()); 
            }
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5268:1: ( rule__TimesExpr__Group_1__0 )*
            loop33:
            do {
                int alt33=2;
                switch ( input.LA(1) ) {
                case 20:
                    {
                    int LA33_2 = input.LA(2);

                    if ( (synpred51_InternalJKind()) ) {
                        alt33=1;
                    }


                    }
                    break;
                case 21:
                    {
                    int LA33_3 = input.LA(2);

                    if ( (synpred51_InternalJKind()) ) {
                        alt33=1;
                    }


                    }
                    break;
                case 22:
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
            	    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5268:2: rule__TimesExpr__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__TimesExpr__Group_1__0_in_rule__TimesExpr__Group__1__Impl10572);
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5282:1: rule__TimesExpr__Group_1__0 : rule__TimesExpr__Group_1__0__Impl ;
    public final void rule__TimesExpr__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5286:1: ( rule__TimesExpr__Group_1__0__Impl )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5287:2: rule__TimesExpr__Group_1__0__Impl
            {
            pushFollow(FOLLOW_rule__TimesExpr__Group_1__0__Impl_in_rule__TimesExpr__Group_1__010607);
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5293:1: rule__TimesExpr__Group_1__0__Impl : ( ( rule__TimesExpr__Group_1_0__0 ) ) ;
    public final void rule__TimesExpr__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5297:1: ( ( ( rule__TimesExpr__Group_1_0__0 ) ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5298:1: ( ( rule__TimesExpr__Group_1_0__0 ) )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5298:1: ( ( rule__TimesExpr__Group_1_0__0 ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5299:1: ( rule__TimesExpr__Group_1_0__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTimesExprAccess().getGroup_1_0()); 
            }
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5300:1: ( rule__TimesExpr__Group_1_0__0 )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5300:2: rule__TimesExpr__Group_1_0__0
            {
            pushFollow(FOLLOW_rule__TimesExpr__Group_1_0__0_in_rule__TimesExpr__Group_1__0__Impl10634);
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5312:1: rule__TimesExpr__Group_1_0__0 : rule__TimesExpr__Group_1_0__0__Impl rule__TimesExpr__Group_1_0__1 ;
    public final void rule__TimesExpr__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5316:1: ( rule__TimesExpr__Group_1_0__0__Impl rule__TimesExpr__Group_1_0__1 )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5317:2: rule__TimesExpr__Group_1_0__0__Impl rule__TimesExpr__Group_1_0__1
            {
            pushFollow(FOLLOW_rule__TimesExpr__Group_1_0__0__Impl_in_rule__TimesExpr__Group_1_0__010666);
            rule__TimesExpr__Group_1_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__TimesExpr__Group_1_0__1_in_rule__TimesExpr__Group_1_0__010669);
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5324:1: rule__TimesExpr__Group_1_0__0__Impl : ( () ) ;
    public final void rule__TimesExpr__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5328:1: ( ( () ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5329:1: ( () )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5329:1: ( () )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5330:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTimesExprAccess().getBinaryExprLeftAction_1_0_0()); 
            }
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5331:1: ()
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5333:1: 
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5343:1: rule__TimesExpr__Group_1_0__1 : rule__TimesExpr__Group_1_0__1__Impl rule__TimesExpr__Group_1_0__2 ;
    public final void rule__TimesExpr__Group_1_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5347:1: ( rule__TimesExpr__Group_1_0__1__Impl rule__TimesExpr__Group_1_0__2 )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5348:2: rule__TimesExpr__Group_1_0__1__Impl rule__TimesExpr__Group_1_0__2
            {
            pushFollow(FOLLOW_rule__TimesExpr__Group_1_0__1__Impl_in_rule__TimesExpr__Group_1_0__110727);
            rule__TimesExpr__Group_1_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__TimesExpr__Group_1_0__2_in_rule__TimesExpr__Group_1_0__110730);
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5355:1: rule__TimesExpr__Group_1_0__1__Impl : ( ( rule__TimesExpr__OpAssignment_1_0_1 ) ) ;
    public final void rule__TimesExpr__Group_1_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5359:1: ( ( ( rule__TimesExpr__OpAssignment_1_0_1 ) ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5360:1: ( ( rule__TimesExpr__OpAssignment_1_0_1 ) )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5360:1: ( ( rule__TimesExpr__OpAssignment_1_0_1 ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5361:1: ( rule__TimesExpr__OpAssignment_1_0_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTimesExprAccess().getOpAssignment_1_0_1()); 
            }
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5362:1: ( rule__TimesExpr__OpAssignment_1_0_1 )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5362:2: rule__TimesExpr__OpAssignment_1_0_1
            {
            pushFollow(FOLLOW_rule__TimesExpr__OpAssignment_1_0_1_in_rule__TimesExpr__Group_1_0__1__Impl10757);
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5372:1: rule__TimesExpr__Group_1_0__2 : rule__TimesExpr__Group_1_0__2__Impl ;
    public final void rule__TimesExpr__Group_1_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5376:1: ( rule__TimesExpr__Group_1_0__2__Impl )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5377:2: rule__TimesExpr__Group_1_0__2__Impl
            {
            pushFollow(FOLLOW_rule__TimesExpr__Group_1_0__2__Impl_in_rule__TimesExpr__Group_1_0__210787);
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5383:1: rule__TimesExpr__Group_1_0__2__Impl : ( ( rule__TimesExpr__RightAssignment_1_0_2 ) ) ;
    public final void rule__TimesExpr__Group_1_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5387:1: ( ( ( rule__TimesExpr__RightAssignment_1_0_2 ) ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5388:1: ( ( rule__TimesExpr__RightAssignment_1_0_2 ) )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5388:1: ( ( rule__TimesExpr__RightAssignment_1_0_2 ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5389:1: ( rule__TimesExpr__RightAssignment_1_0_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTimesExprAccess().getRightAssignment_1_0_2()); 
            }
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5390:1: ( rule__TimesExpr__RightAssignment_1_0_2 )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5390:2: rule__TimesExpr__RightAssignment_1_0_2
            {
            pushFollow(FOLLOW_rule__TimesExpr__RightAssignment_1_0_2_in_rule__TimesExpr__Group_1_0__2__Impl10814);
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5406:1: rule__PrefixExpr__Group_0__0 : rule__PrefixExpr__Group_0__0__Impl rule__PrefixExpr__Group_0__1 ;
    public final void rule__PrefixExpr__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5410:1: ( rule__PrefixExpr__Group_0__0__Impl rule__PrefixExpr__Group_0__1 )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5411:2: rule__PrefixExpr__Group_0__0__Impl rule__PrefixExpr__Group_0__1
            {
            pushFollow(FOLLOW_rule__PrefixExpr__Group_0__0__Impl_in_rule__PrefixExpr__Group_0__010850);
            rule__PrefixExpr__Group_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__PrefixExpr__Group_0__1_in_rule__PrefixExpr__Group_0__010853);
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5418:1: rule__PrefixExpr__Group_0__0__Impl : ( () ) ;
    public final void rule__PrefixExpr__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5422:1: ( ( () ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5423:1: ( () )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5423:1: ( () )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5424:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPrefixExprAccess().getUnaryExprAction_0_0()); 
            }
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5425:1: ()
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5427:1: 
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5437:1: rule__PrefixExpr__Group_0__1 : rule__PrefixExpr__Group_0__1__Impl rule__PrefixExpr__Group_0__2 ;
    public final void rule__PrefixExpr__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5441:1: ( rule__PrefixExpr__Group_0__1__Impl rule__PrefixExpr__Group_0__2 )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5442:2: rule__PrefixExpr__Group_0__1__Impl rule__PrefixExpr__Group_0__2
            {
            pushFollow(FOLLOW_rule__PrefixExpr__Group_0__1__Impl_in_rule__PrefixExpr__Group_0__110911);
            rule__PrefixExpr__Group_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__PrefixExpr__Group_0__2_in_rule__PrefixExpr__Group_0__110914);
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5449:1: rule__PrefixExpr__Group_0__1__Impl : ( ( rule__PrefixExpr__OpAssignment_0_1 ) ) ;
    public final void rule__PrefixExpr__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5453:1: ( ( ( rule__PrefixExpr__OpAssignment_0_1 ) ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5454:1: ( ( rule__PrefixExpr__OpAssignment_0_1 ) )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5454:1: ( ( rule__PrefixExpr__OpAssignment_0_1 ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5455:1: ( rule__PrefixExpr__OpAssignment_0_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPrefixExprAccess().getOpAssignment_0_1()); 
            }
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5456:1: ( rule__PrefixExpr__OpAssignment_0_1 )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5456:2: rule__PrefixExpr__OpAssignment_0_1
            {
            pushFollow(FOLLOW_rule__PrefixExpr__OpAssignment_0_1_in_rule__PrefixExpr__Group_0__1__Impl10941);
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5466:1: rule__PrefixExpr__Group_0__2 : rule__PrefixExpr__Group_0__2__Impl ;
    public final void rule__PrefixExpr__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5470:1: ( rule__PrefixExpr__Group_0__2__Impl )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5471:2: rule__PrefixExpr__Group_0__2__Impl
            {
            pushFollow(FOLLOW_rule__PrefixExpr__Group_0__2__Impl_in_rule__PrefixExpr__Group_0__210971);
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5477:1: rule__PrefixExpr__Group_0__2__Impl : ( ( rule__PrefixExpr__ExprAssignment_0_2 ) ) ;
    public final void rule__PrefixExpr__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5481:1: ( ( ( rule__PrefixExpr__ExprAssignment_0_2 ) ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5482:1: ( ( rule__PrefixExpr__ExprAssignment_0_2 ) )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5482:1: ( ( rule__PrefixExpr__ExprAssignment_0_2 ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5483:1: ( rule__PrefixExpr__ExprAssignment_0_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPrefixExprAccess().getExprAssignment_0_2()); 
            }
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5484:1: ( rule__PrefixExpr__ExprAssignment_0_2 )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5484:2: rule__PrefixExpr__ExprAssignment_0_2
            {
            pushFollow(FOLLOW_rule__PrefixExpr__ExprAssignment_0_2_in_rule__PrefixExpr__Group_0__2__Impl10998);
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5500:1: rule__ProjectionExpr__Group__0 : rule__ProjectionExpr__Group__0__Impl rule__ProjectionExpr__Group__1 ;
    public final void rule__ProjectionExpr__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5504:1: ( rule__ProjectionExpr__Group__0__Impl rule__ProjectionExpr__Group__1 )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5505:2: rule__ProjectionExpr__Group__0__Impl rule__ProjectionExpr__Group__1
            {
            pushFollow(FOLLOW_rule__ProjectionExpr__Group__0__Impl_in_rule__ProjectionExpr__Group__011034);
            rule__ProjectionExpr__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ProjectionExpr__Group__1_in_rule__ProjectionExpr__Group__011037);
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5512:1: rule__ProjectionExpr__Group__0__Impl : ( ruleAtomicExpr ) ;
    public final void rule__ProjectionExpr__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5516:1: ( ( ruleAtomicExpr ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5517:1: ( ruleAtomicExpr )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5517:1: ( ruleAtomicExpr )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5518:1: ruleAtomicExpr
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProjectionExprAccess().getAtomicExprParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_ruleAtomicExpr_in_rule__ProjectionExpr__Group__0__Impl11064);
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5529:1: rule__ProjectionExpr__Group__1 : rule__ProjectionExpr__Group__1__Impl ;
    public final void rule__ProjectionExpr__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5533:1: ( rule__ProjectionExpr__Group__1__Impl )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5534:2: rule__ProjectionExpr__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__ProjectionExpr__Group__1__Impl_in_rule__ProjectionExpr__Group__111093);
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5540:1: rule__ProjectionExpr__Group__1__Impl : ( ( rule__ProjectionExpr__Group_1__0 )* ) ;
    public final void rule__ProjectionExpr__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5544:1: ( ( ( rule__ProjectionExpr__Group_1__0 )* ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5545:1: ( ( rule__ProjectionExpr__Group_1__0 )* )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5545:1: ( ( rule__ProjectionExpr__Group_1__0 )* )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5546:1: ( rule__ProjectionExpr__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProjectionExprAccess().getGroup_1()); 
            }
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5547:1: ( rule__ProjectionExpr__Group_1__0 )*
            loop34:
            do {
                int alt34=2;
                int LA34_0 = input.LA(1);

                if ( (LA34_0==50) ) {
                    int LA34_2 = input.LA(2);

                    if ( (synpred52_InternalJKind()) ) {
                        alt34=1;
                    }


                }


                switch (alt34) {
            	case 1 :
            	    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5547:2: rule__ProjectionExpr__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__ProjectionExpr__Group_1__0_in_rule__ProjectionExpr__Group__1__Impl11120);
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5561:1: rule__ProjectionExpr__Group_1__0 : rule__ProjectionExpr__Group_1__0__Impl ;
    public final void rule__ProjectionExpr__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5565:1: ( rule__ProjectionExpr__Group_1__0__Impl )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5566:2: rule__ProjectionExpr__Group_1__0__Impl
            {
            pushFollow(FOLLOW_rule__ProjectionExpr__Group_1__0__Impl_in_rule__ProjectionExpr__Group_1__011155);
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5572:1: rule__ProjectionExpr__Group_1__0__Impl : ( ( rule__ProjectionExpr__Group_1_0__0 ) ) ;
    public final void rule__ProjectionExpr__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5576:1: ( ( ( rule__ProjectionExpr__Group_1_0__0 ) ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5577:1: ( ( rule__ProjectionExpr__Group_1_0__0 ) )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5577:1: ( ( rule__ProjectionExpr__Group_1_0__0 ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5578:1: ( rule__ProjectionExpr__Group_1_0__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProjectionExprAccess().getGroup_1_0()); 
            }
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5579:1: ( rule__ProjectionExpr__Group_1_0__0 )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5579:2: rule__ProjectionExpr__Group_1_0__0
            {
            pushFollow(FOLLOW_rule__ProjectionExpr__Group_1_0__0_in_rule__ProjectionExpr__Group_1__0__Impl11182);
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5591:1: rule__ProjectionExpr__Group_1_0__0 : rule__ProjectionExpr__Group_1_0__0__Impl rule__ProjectionExpr__Group_1_0__1 ;
    public final void rule__ProjectionExpr__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5595:1: ( rule__ProjectionExpr__Group_1_0__0__Impl rule__ProjectionExpr__Group_1_0__1 )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5596:2: rule__ProjectionExpr__Group_1_0__0__Impl rule__ProjectionExpr__Group_1_0__1
            {
            pushFollow(FOLLOW_rule__ProjectionExpr__Group_1_0__0__Impl_in_rule__ProjectionExpr__Group_1_0__011214);
            rule__ProjectionExpr__Group_1_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ProjectionExpr__Group_1_0__1_in_rule__ProjectionExpr__Group_1_0__011217);
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5603:1: rule__ProjectionExpr__Group_1_0__0__Impl : ( () ) ;
    public final void rule__ProjectionExpr__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5607:1: ( ( () ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5608:1: ( () )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5608:1: ( () )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5609:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProjectionExprAccess().getProjectionExprExprAction_1_0_0()); 
            }
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5610:1: ()
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5612:1: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getProjectionExprAccess().getProjectionExprExprAction_1_0_0()); 
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5622:1: rule__ProjectionExpr__Group_1_0__1 : rule__ProjectionExpr__Group_1_0__1__Impl rule__ProjectionExpr__Group_1_0__2 ;
    public final void rule__ProjectionExpr__Group_1_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5626:1: ( rule__ProjectionExpr__Group_1_0__1__Impl rule__ProjectionExpr__Group_1_0__2 )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5627:2: rule__ProjectionExpr__Group_1_0__1__Impl rule__ProjectionExpr__Group_1_0__2
            {
            pushFollow(FOLLOW_rule__ProjectionExpr__Group_1_0__1__Impl_in_rule__ProjectionExpr__Group_1_0__111275);
            rule__ProjectionExpr__Group_1_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ProjectionExpr__Group_1_0__2_in_rule__ProjectionExpr__Group_1_0__111278);
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5634:1: rule__ProjectionExpr__Group_1_0__1__Impl : ( '.' ) ;
    public final void rule__ProjectionExpr__Group_1_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5638:1: ( ( '.' ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5639:1: ( '.' )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5639:1: ( '.' )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5640:1: '.'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProjectionExprAccess().getFullStopKeyword_1_0_1()); 
            }
            match(input,50,FOLLOW_50_in_rule__ProjectionExpr__Group_1_0__1__Impl11306); if (state.failed) return ;
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5653:1: rule__ProjectionExpr__Group_1_0__2 : rule__ProjectionExpr__Group_1_0__2__Impl ;
    public final void rule__ProjectionExpr__Group_1_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5657:1: ( rule__ProjectionExpr__Group_1_0__2__Impl )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5658:2: rule__ProjectionExpr__Group_1_0__2__Impl
            {
            pushFollow(FOLLOW_rule__ProjectionExpr__Group_1_0__2__Impl_in_rule__ProjectionExpr__Group_1_0__211337);
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5664:1: rule__ProjectionExpr__Group_1_0__2__Impl : ( ( rule__ProjectionExpr__FieldAssignment_1_0_2 ) ) ;
    public final void rule__ProjectionExpr__Group_1_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5668:1: ( ( ( rule__ProjectionExpr__FieldAssignment_1_0_2 ) ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5669:1: ( ( rule__ProjectionExpr__FieldAssignment_1_0_2 ) )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5669:1: ( ( rule__ProjectionExpr__FieldAssignment_1_0_2 ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5670:1: ( rule__ProjectionExpr__FieldAssignment_1_0_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProjectionExprAccess().getFieldAssignment_1_0_2()); 
            }
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5671:1: ( rule__ProjectionExpr__FieldAssignment_1_0_2 )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5671:2: rule__ProjectionExpr__FieldAssignment_1_0_2
            {
            pushFollow(FOLLOW_rule__ProjectionExpr__FieldAssignment_1_0_2_in_rule__ProjectionExpr__Group_1_0__2__Impl11364);
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5687:1: rule__AtomicExpr__Group_0__0 : rule__AtomicExpr__Group_0__0__Impl rule__AtomicExpr__Group_0__1 ;
    public final void rule__AtomicExpr__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5691:1: ( rule__AtomicExpr__Group_0__0__Impl rule__AtomicExpr__Group_0__1 )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5692:2: rule__AtomicExpr__Group_0__0__Impl rule__AtomicExpr__Group_0__1
            {
            pushFollow(FOLLOW_rule__AtomicExpr__Group_0__0__Impl_in_rule__AtomicExpr__Group_0__011400);
            rule__AtomicExpr__Group_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__AtomicExpr__Group_0__1_in_rule__AtomicExpr__Group_0__011403);
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5699:1: rule__AtomicExpr__Group_0__0__Impl : ( () ) ;
    public final void rule__AtomicExpr__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5703:1: ( ( () ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5704:1: ( () )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5704:1: ( () )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5705:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAtomicExprAccess().getIdExprAction_0_0()); 
            }
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5706:1: ()
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5708:1: 
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5718:1: rule__AtomicExpr__Group_0__1 : rule__AtomicExpr__Group_0__1__Impl ;
    public final void rule__AtomicExpr__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5722:1: ( rule__AtomicExpr__Group_0__1__Impl )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5723:2: rule__AtomicExpr__Group_0__1__Impl
            {
            pushFollow(FOLLOW_rule__AtomicExpr__Group_0__1__Impl_in_rule__AtomicExpr__Group_0__111461);
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5729:1: rule__AtomicExpr__Group_0__1__Impl : ( ( rule__AtomicExpr__IdAssignment_0_1 ) ) ;
    public final void rule__AtomicExpr__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5733:1: ( ( ( rule__AtomicExpr__IdAssignment_0_1 ) ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5734:1: ( ( rule__AtomicExpr__IdAssignment_0_1 ) )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5734:1: ( ( rule__AtomicExpr__IdAssignment_0_1 ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5735:1: ( rule__AtomicExpr__IdAssignment_0_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAtomicExprAccess().getIdAssignment_0_1()); 
            }
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5736:1: ( rule__AtomicExpr__IdAssignment_0_1 )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5736:2: rule__AtomicExpr__IdAssignment_0_1
            {
            pushFollow(FOLLOW_rule__AtomicExpr__IdAssignment_0_1_in_rule__AtomicExpr__Group_0__1__Impl11488);
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5750:1: rule__AtomicExpr__Group_1__0 : rule__AtomicExpr__Group_1__0__Impl rule__AtomicExpr__Group_1__1 ;
    public final void rule__AtomicExpr__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5754:1: ( rule__AtomicExpr__Group_1__0__Impl rule__AtomicExpr__Group_1__1 )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5755:2: rule__AtomicExpr__Group_1__0__Impl rule__AtomicExpr__Group_1__1
            {
            pushFollow(FOLLOW_rule__AtomicExpr__Group_1__0__Impl_in_rule__AtomicExpr__Group_1__011522);
            rule__AtomicExpr__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__AtomicExpr__Group_1__1_in_rule__AtomicExpr__Group_1__011525);
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5762:1: rule__AtomicExpr__Group_1__0__Impl : ( () ) ;
    public final void rule__AtomicExpr__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5766:1: ( ( () ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5767:1: ( () )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5767:1: ( () )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5768:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAtomicExprAccess().getIntExprAction_1_0()); 
            }
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5769:1: ()
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5771:1: 
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5781:1: rule__AtomicExpr__Group_1__1 : rule__AtomicExpr__Group_1__1__Impl ;
    public final void rule__AtomicExpr__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5785:1: ( rule__AtomicExpr__Group_1__1__Impl )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5786:2: rule__AtomicExpr__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__AtomicExpr__Group_1__1__Impl_in_rule__AtomicExpr__Group_1__111583);
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5792:1: rule__AtomicExpr__Group_1__1__Impl : ( ( rule__AtomicExpr__ValAssignment_1_1 ) ) ;
    public final void rule__AtomicExpr__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5796:1: ( ( ( rule__AtomicExpr__ValAssignment_1_1 ) ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5797:1: ( ( rule__AtomicExpr__ValAssignment_1_1 ) )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5797:1: ( ( rule__AtomicExpr__ValAssignment_1_1 ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5798:1: ( rule__AtomicExpr__ValAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAtomicExprAccess().getValAssignment_1_1()); 
            }
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5799:1: ( rule__AtomicExpr__ValAssignment_1_1 )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5799:2: rule__AtomicExpr__ValAssignment_1_1
            {
            pushFollow(FOLLOW_rule__AtomicExpr__ValAssignment_1_1_in_rule__AtomicExpr__Group_1__1__Impl11610);
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5813:1: rule__AtomicExpr__Group_2__0 : rule__AtomicExpr__Group_2__0__Impl rule__AtomicExpr__Group_2__1 ;
    public final void rule__AtomicExpr__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5817:1: ( rule__AtomicExpr__Group_2__0__Impl rule__AtomicExpr__Group_2__1 )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5818:2: rule__AtomicExpr__Group_2__0__Impl rule__AtomicExpr__Group_2__1
            {
            pushFollow(FOLLOW_rule__AtomicExpr__Group_2__0__Impl_in_rule__AtomicExpr__Group_2__011644);
            rule__AtomicExpr__Group_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__AtomicExpr__Group_2__1_in_rule__AtomicExpr__Group_2__011647);
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5825:1: rule__AtomicExpr__Group_2__0__Impl : ( () ) ;
    public final void rule__AtomicExpr__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5829:1: ( ( () ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5830:1: ( () )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5830:1: ( () )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5831:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAtomicExprAccess().getRealExprAction_2_0()); 
            }
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5832:1: ()
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5834:1: 
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5844:1: rule__AtomicExpr__Group_2__1 : rule__AtomicExpr__Group_2__1__Impl ;
    public final void rule__AtomicExpr__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5848:1: ( rule__AtomicExpr__Group_2__1__Impl )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5849:2: rule__AtomicExpr__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__AtomicExpr__Group_2__1__Impl_in_rule__AtomicExpr__Group_2__111705);
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5855:1: rule__AtomicExpr__Group_2__1__Impl : ( ( rule__AtomicExpr__ValAssignment_2_1 ) ) ;
    public final void rule__AtomicExpr__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5859:1: ( ( ( rule__AtomicExpr__ValAssignment_2_1 ) ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5860:1: ( ( rule__AtomicExpr__ValAssignment_2_1 ) )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5860:1: ( ( rule__AtomicExpr__ValAssignment_2_1 ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5861:1: ( rule__AtomicExpr__ValAssignment_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAtomicExprAccess().getValAssignment_2_1()); 
            }
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5862:1: ( rule__AtomicExpr__ValAssignment_2_1 )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5862:2: rule__AtomicExpr__ValAssignment_2_1
            {
            pushFollow(FOLLOW_rule__AtomicExpr__ValAssignment_2_1_in_rule__AtomicExpr__Group_2__1__Impl11732);
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5876:1: rule__AtomicExpr__Group_3__0 : rule__AtomicExpr__Group_3__0__Impl rule__AtomicExpr__Group_3__1 ;
    public final void rule__AtomicExpr__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5880:1: ( rule__AtomicExpr__Group_3__0__Impl rule__AtomicExpr__Group_3__1 )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5881:2: rule__AtomicExpr__Group_3__0__Impl rule__AtomicExpr__Group_3__1
            {
            pushFollow(FOLLOW_rule__AtomicExpr__Group_3__0__Impl_in_rule__AtomicExpr__Group_3__011766);
            rule__AtomicExpr__Group_3__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__AtomicExpr__Group_3__1_in_rule__AtomicExpr__Group_3__011769);
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5888:1: rule__AtomicExpr__Group_3__0__Impl : ( () ) ;
    public final void rule__AtomicExpr__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5892:1: ( ( () ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5893:1: ( () )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5893:1: ( () )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5894:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAtomicExprAccess().getBoolExprAction_3_0()); 
            }
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5895:1: ()
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5897:1: 
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5907:1: rule__AtomicExpr__Group_3__1 : rule__AtomicExpr__Group_3__1__Impl ;
    public final void rule__AtomicExpr__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5911:1: ( rule__AtomicExpr__Group_3__1__Impl )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5912:2: rule__AtomicExpr__Group_3__1__Impl
            {
            pushFollow(FOLLOW_rule__AtomicExpr__Group_3__1__Impl_in_rule__AtomicExpr__Group_3__111827);
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5918:1: rule__AtomicExpr__Group_3__1__Impl : ( ( rule__AtomicExpr__ValAssignment_3_1 ) ) ;
    public final void rule__AtomicExpr__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5922:1: ( ( ( rule__AtomicExpr__ValAssignment_3_1 ) ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5923:1: ( ( rule__AtomicExpr__ValAssignment_3_1 ) )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5923:1: ( ( rule__AtomicExpr__ValAssignment_3_1 ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5924:1: ( rule__AtomicExpr__ValAssignment_3_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAtomicExprAccess().getValAssignment_3_1()); 
            }
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5925:1: ( rule__AtomicExpr__ValAssignment_3_1 )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5925:2: rule__AtomicExpr__ValAssignment_3_1
            {
            pushFollow(FOLLOW_rule__AtomicExpr__ValAssignment_3_1_in_rule__AtomicExpr__Group_3__1__Impl11854);
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5939:1: rule__AtomicExpr__Group_4__0 : rule__AtomicExpr__Group_4__0__Impl rule__AtomicExpr__Group_4__1 ;
    public final void rule__AtomicExpr__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5943:1: ( rule__AtomicExpr__Group_4__0__Impl rule__AtomicExpr__Group_4__1 )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5944:2: rule__AtomicExpr__Group_4__0__Impl rule__AtomicExpr__Group_4__1
            {
            pushFollow(FOLLOW_rule__AtomicExpr__Group_4__0__Impl_in_rule__AtomicExpr__Group_4__011888);
            rule__AtomicExpr__Group_4__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__AtomicExpr__Group_4__1_in_rule__AtomicExpr__Group_4__011891);
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5951:1: rule__AtomicExpr__Group_4__0__Impl : ( () ) ;
    public final void rule__AtomicExpr__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5955:1: ( ( () ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5956:1: ( () )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5956:1: ( () )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5957:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAtomicExprAccess().getIfThenElseExprAction_4_0()); 
            }
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5958:1: ()
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5960:1: 
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5970:1: rule__AtomicExpr__Group_4__1 : rule__AtomicExpr__Group_4__1__Impl rule__AtomicExpr__Group_4__2 ;
    public final void rule__AtomicExpr__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5974:1: ( rule__AtomicExpr__Group_4__1__Impl rule__AtomicExpr__Group_4__2 )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5975:2: rule__AtomicExpr__Group_4__1__Impl rule__AtomicExpr__Group_4__2
            {
            pushFollow(FOLLOW_rule__AtomicExpr__Group_4__1__Impl_in_rule__AtomicExpr__Group_4__111949);
            rule__AtomicExpr__Group_4__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__AtomicExpr__Group_4__2_in_rule__AtomicExpr__Group_4__111952);
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5982:1: rule__AtomicExpr__Group_4__1__Impl : ( 'if' ) ;
    public final void rule__AtomicExpr__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5986:1: ( ( 'if' ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5987:1: ( 'if' )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5987:1: ( 'if' )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5988:1: 'if'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAtomicExprAccess().getIfKeyword_4_1()); 
            }
            match(input,51,FOLLOW_51_in_rule__AtomicExpr__Group_4__1__Impl11980); if (state.failed) return ;
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6001:1: rule__AtomicExpr__Group_4__2 : rule__AtomicExpr__Group_4__2__Impl rule__AtomicExpr__Group_4__3 ;
    public final void rule__AtomicExpr__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6005:1: ( rule__AtomicExpr__Group_4__2__Impl rule__AtomicExpr__Group_4__3 )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6006:2: rule__AtomicExpr__Group_4__2__Impl rule__AtomicExpr__Group_4__3
            {
            pushFollow(FOLLOW_rule__AtomicExpr__Group_4__2__Impl_in_rule__AtomicExpr__Group_4__212011);
            rule__AtomicExpr__Group_4__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__AtomicExpr__Group_4__3_in_rule__AtomicExpr__Group_4__212014);
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6013:1: rule__AtomicExpr__Group_4__2__Impl : ( ( rule__AtomicExpr__CondAssignment_4_2 ) ) ;
    public final void rule__AtomicExpr__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6017:1: ( ( ( rule__AtomicExpr__CondAssignment_4_2 ) ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6018:1: ( ( rule__AtomicExpr__CondAssignment_4_2 ) )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6018:1: ( ( rule__AtomicExpr__CondAssignment_4_2 ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6019:1: ( rule__AtomicExpr__CondAssignment_4_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAtomicExprAccess().getCondAssignment_4_2()); 
            }
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6020:1: ( rule__AtomicExpr__CondAssignment_4_2 )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6020:2: rule__AtomicExpr__CondAssignment_4_2
            {
            pushFollow(FOLLOW_rule__AtomicExpr__CondAssignment_4_2_in_rule__AtomicExpr__Group_4__2__Impl12041);
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6030:1: rule__AtomicExpr__Group_4__3 : rule__AtomicExpr__Group_4__3__Impl rule__AtomicExpr__Group_4__4 ;
    public final void rule__AtomicExpr__Group_4__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6034:1: ( rule__AtomicExpr__Group_4__3__Impl rule__AtomicExpr__Group_4__4 )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6035:2: rule__AtomicExpr__Group_4__3__Impl rule__AtomicExpr__Group_4__4
            {
            pushFollow(FOLLOW_rule__AtomicExpr__Group_4__3__Impl_in_rule__AtomicExpr__Group_4__312071);
            rule__AtomicExpr__Group_4__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__AtomicExpr__Group_4__4_in_rule__AtomicExpr__Group_4__312074);
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6042:1: rule__AtomicExpr__Group_4__3__Impl : ( 'then' ) ;
    public final void rule__AtomicExpr__Group_4__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6046:1: ( ( 'then' ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6047:1: ( 'then' )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6047:1: ( 'then' )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6048:1: 'then'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAtomicExprAccess().getThenKeyword_4_3()); 
            }
            match(input,52,FOLLOW_52_in_rule__AtomicExpr__Group_4__3__Impl12102); if (state.failed) return ;
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6061:1: rule__AtomicExpr__Group_4__4 : rule__AtomicExpr__Group_4__4__Impl rule__AtomicExpr__Group_4__5 ;
    public final void rule__AtomicExpr__Group_4__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6065:1: ( rule__AtomicExpr__Group_4__4__Impl rule__AtomicExpr__Group_4__5 )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6066:2: rule__AtomicExpr__Group_4__4__Impl rule__AtomicExpr__Group_4__5
            {
            pushFollow(FOLLOW_rule__AtomicExpr__Group_4__4__Impl_in_rule__AtomicExpr__Group_4__412133);
            rule__AtomicExpr__Group_4__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__AtomicExpr__Group_4__5_in_rule__AtomicExpr__Group_4__412136);
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6073:1: rule__AtomicExpr__Group_4__4__Impl : ( ( rule__AtomicExpr__ThenAssignment_4_4 ) ) ;
    public final void rule__AtomicExpr__Group_4__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6077:1: ( ( ( rule__AtomicExpr__ThenAssignment_4_4 ) ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6078:1: ( ( rule__AtomicExpr__ThenAssignment_4_4 ) )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6078:1: ( ( rule__AtomicExpr__ThenAssignment_4_4 ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6079:1: ( rule__AtomicExpr__ThenAssignment_4_4 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAtomicExprAccess().getThenAssignment_4_4()); 
            }
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6080:1: ( rule__AtomicExpr__ThenAssignment_4_4 )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6080:2: rule__AtomicExpr__ThenAssignment_4_4
            {
            pushFollow(FOLLOW_rule__AtomicExpr__ThenAssignment_4_4_in_rule__AtomicExpr__Group_4__4__Impl12163);
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6090:1: rule__AtomicExpr__Group_4__5 : rule__AtomicExpr__Group_4__5__Impl rule__AtomicExpr__Group_4__6 ;
    public final void rule__AtomicExpr__Group_4__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6094:1: ( rule__AtomicExpr__Group_4__5__Impl rule__AtomicExpr__Group_4__6 )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6095:2: rule__AtomicExpr__Group_4__5__Impl rule__AtomicExpr__Group_4__6
            {
            pushFollow(FOLLOW_rule__AtomicExpr__Group_4__5__Impl_in_rule__AtomicExpr__Group_4__512193);
            rule__AtomicExpr__Group_4__5__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__AtomicExpr__Group_4__6_in_rule__AtomicExpr__Group_4__512196);
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6102:1: rule__AtomicExpr__Group_4__5__Impl : ( 'else' ) ;
    public final void rule__AtomicExpr__Group_4__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6106:1: ( ( 'else' ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6107:1: ( 'else' )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6107:1: ( 'else' )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6108:1: 'else'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAtomicExprAccess().getElseKeyword_4_5()); 
            }
            match(input,53,FOLLOW_53_in_rule__AtomicExpr__Group_4__5__Impl12224); if (state.failed) return ;
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6121:1: rule__AtomicExpr__Group_4__6 : rule__AtomicExpr__Group_4__6__Impl ;
    public final void rule__AtomicExpr__Group_4__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6125:1: ( rule__AtomicExpr__Group_4__6__Impl )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6126:2: rule__AtomicExpr__Group_4__6__Impl
            {
            pushFollow(FOLLOW_rule__AtomicExpr__Group_4__6__Impl_in_rule__AtomicExpr__Group_4__612255);
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6132:1: rule__AtomicExpr__Group_4__6__Impl : ( ( rule__AtomicExpr__ElseAssignment_4_6 ) ) ;
    public final void rule__AtomicExpr__Group_4__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6136:1: ( ( ( rule__AtomicExpr__ElseAssignment_4_6 ) ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6137:1: ( ( rule__AtomicExpr__ElseAssignment_4_6 ) )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6137:1: ( ( rule__AtomicExpr__ElseAssignment_4_6 ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6138:1: ( rule__AtomicExpr__ElseAssignment_4_6 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAtomicExprAccess().getElseAssignment_4_6()); 
            }
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6139:1: ( rule__AtomicExpr__ElseAssignment_4_6 )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6139:2: rule__AtomicExpr__ElseAssignment_4_6
            {
            pushFollow(FOLLOW_rule__AtomicExpr__ElseAssignment_4_6_in_rule__AtomicExpr__Group_4__6__Impl12282);
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6163:1: rule__AtomicExpr__Group_5__0 : rule__AtomicExpr__Group_5__0__Impl rule__AtomicExpr__Group_5__1 ;
    public final void rule__AtomicExpr__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6167:1: ( rule__AtomicExpr__Group_5__0__Impl rule__AtomicExpr__Group_5__1 )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6168:2: rule__AtomicExpr__Group_5__0__Impl rule__AtomicExpr__Group_5__1
            {
            pushFollow(FOLLOW_rule__AtomicExpr__Group_5__0__Impl_in_rule__AtomicExpr__Group_5__012326);
            rule__AtomicExpr__Group_5__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__AtomicExpr__Group_5__1_in_rule__AtomicExpr__Group_5__012329);
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6175:1: rule__AtomicExpr__Group_5__0__Impl : ( () ) ;
    public final void rule__AtomicExpr__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6179:1: ( ( () ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6180:1: ( () )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6180:1: ( () )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6181:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAtomicExprAccess().getNodeCallExprAction_5_0()); 
            }
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6182:1: ()
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6184:1: 
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6194:1: rule__AtomicExpr__Group_5__1 : rule__AtomicExpr__Group_5__1__Impl rule__AtomicExpr__Group_5__2 ;
    public final void rule__AtomicExpr__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6198:1: ( rule__AtomicExpr__Group_5__1__Impl rule__AtomicExpr__Group_5__2 )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6199:2: rule__AtomicExpr__Group_5__1__Impl rule__AtomicExpr__Group_5__2
            {
            pushFollow(FOLLOW_rule__AtomicExpr__Group_5__1__Impl_in_rule__AtomicExpr__Group_5__112387);
            rule__AtomicExpr__Group_5__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__AtomicExpr__Group_5__2_in_rule__AtomicExpr__Group_5__112390);
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6206:1: rule__AtomicExpr__Group_5__1__Impl : ( ( rule__AtomicExpr__NodeAssignment_5_1 ) ) ;
    public final void rule__AtomicExpr__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6210:1: ( ( ( rule__AtomicExpr__NodeAssignment_5_1 ) ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6211:1: ( ( rule__AtomicExpr__NodeAssignment_5_1 ) )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6211:1: ( ( rule__AtomicExpr__NodeAssignment_5_1 ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6212:1: ( rule__AtomicExpr__NodeAssignment_5_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAtomicExprAccess().getNodeAssignment_5_1()); 
            }
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6213:1: ( rule__AtomicExpr__NodeAssignment_5_1 )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6213:2: rule__AtomicExpr__NodeAssignment_5_1
            {
            pushFollow(FOLLOW_rule__AtomicExpr__NodeAssignment_5_1_in_rule__AtomicExpr__Group_5__1__Impl12417);
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6223:1: rule__AtomicExpr__Group_5__2 : rule__AtomicExpr__Group_5__2__Impl rule__AtomicExpr__Group_5__3 ;
    public final void rule__AtomicExpr__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6227:1: ( rule__AtomicExpr__Group_5__2__Impl rule__AtomicExpr__Group_5__3 )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6228:2: rule__AtomicExpr__Group_5__2__Impl rule__AtomicExpr__Group_5__3
            {
            pushFollow(FOLLOW_rule__AtomicExpr__Group_5__2__Impl_in_rule__AtomicExpr__Group_5__212447);
            rule__AtomicExpr__Group_5__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__AtomicExpr__Group_5__3_in_rule__AtomicExpr__Group_5__212450);
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6235:1: rule__AtomicExpr__Group_5__2__Impl : ( '(' ) ;
    public final void rule__AtomicExpr__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6239:1: ( ( '(' ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6240:1: ( '(' )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6240:1: ( '(' )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6241:1: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAtomicExprAccess().getLeftParenthesisKeyword_5_2()); 
            }
            match(input,41,FOLLOW_41_in_rule__AtomicExpr__Group_5__2__Impl12478); if (state.failed) return ;
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6254:1: rule__AtomicExpr__Group_5__3 : rule__AtomicExpr__Group_5__3__Impl rule__AtomicExpr__Group_5__4 ;
    public final void rule__AtomicExpr__Group_5__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6258:1: ( rule__AtomicExpr__Group_5__3__Impl rule__AtomicExpr__Group_5__4 )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6259:2: rule__AtomicExpr__Group_5__3__Impl rule__AtomicExpr__Group_5__4
            {
            pushFollow(FOLLOW_rule__AtomicExpr__Group_5__3__Impl_in_rule__AtomicExpr__Group_5__312509);
            rule__AtomicExpr__Group_5__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__AtomicExpr__Group_5__4_in_rule__AtomicExpr__Group_5__312512);
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6266:1: rule__AtomicExpr__Group_5__3__Impl : ( ( rule__AtomicExpr__Group_5_3__0 )? ) ;
    public final void rule__AtomicExpr__Group_5__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6270:1: ( ( ( rule__AtomicExpr__Group_5_3__0 )? ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6271:1: ( ( rule__AtomicExpr__Group_5_3__0 )? )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6271:1: ( ( rule__AtomicExpr__Group_5_3__0 )? )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6272:1: ( rule__AtomicExpr__Group_5_3__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAtomicExprAccess().getGroup_5_3()); 
            }
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6273:1: ( rule__AtomicExpr__Group_5_3__0 )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( ((LA35_0>=RULE_INT && LA35_0<=RULE_BOOL)||LA35_0==19||(LA35_0>=23 && LA35_0<=24)||LA35_0==41||LA35_0==51) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6273:2: rule__AtomicExpr__Group_5_3__0
                    {
                    pushFollow(FOLLOW_rule__AtomicExpr__Group_5_3__0_in_rule__AtomicExpr__Group_5__3__Impl12539);
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6283:1: rule__AtomicExpr__Group_5__4 : rule__AtomicExpr__Group_5__4__Impl ;
    public final void rule__AtomicExpr__Group_5__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6287:1: ( rule__AtomicExpr__Group_5__4__Impl )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6288:2: rule__AtomicExpr__Group_5__4__Impl
            {
            pushFollow(FOLLOW_rule__AtomicExpr__Group_5__4__Impl_in_rule__AtomicExpr__Group_5__412570);
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6294:1: rule__AtomicExpr__Group_5__4__Impl : ( ')' ) ;
    public final void rule__AtomicExpr__Group_5__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6298:1: ( ( ')' ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6299:1: ( ')' )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6299:1: ( ')' )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6300:1: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAtomicExprAccess().getRightParenthesisKeyword_5_4()); 
            }
            match(input,42,FOLLOW_42_in_rule__AtomicExpr__Group_5__4__Impl12598); if (state.failed) return ;
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6323:1: rule__AtomicExpr__Group_5_3__0 : rule__AtomicExpr__Group_5_3__0__Impl rule__AtomicExpr__Group_5_3__1 ;
    public final void rule__AtomicExpr__Group_5_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6327:1: ( rule__AtomicExpr__Group_5_3__0__Impl rule__AtomicExpr__Group_5_3__1 )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6328:2: rule__AtomicExpr__Group_5_3__0__Impl rule__AtomicExpr__Group_5_3__1
            {
            pushFollow(FOLLOW_rule__AtomicExpr__Group_5_3__0__Impl_in_rule__AtomicExpr__Group_5_3__012639);
            rule__AtomicExpr__Group_5_3__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__AtomicExpr__Group_5_3__1_in_rule__AtomicExpr__Group_5_3__012642);
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6335:1: rule__AtomicExpr__Group_5_3__0__Impl : ( ( rule__AtomicExpr__ArgsAssignment_5_3_0 ) ) ;
    public final void rule__AtomicExpr__Group_5_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6339:1: ( ( ( rule__AtomicExpr__ArgsAssignment_5_3_0 ) ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6340:1: ( ( rule__AtomicExpr__ArgsAssignment_5_3_0 ) )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6340:1: ( ( rule__AtomicExpr__ArgsAssignment_5_3_0 ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6341:1: ( rule__AtomicExpr__ArgsAssignment_5_3_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAtomicExprAccess().getArgsAssignment_5_3_0()); 
            }
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6342:1: ( rule__AtomicExpr__ArgsAssignment_5_3_0 )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6342:2: rule__AtomicExpr__ArgsAssignment_5_3_0
            {
            pushFollow(FOLLOW_rule__AtomicExpr__ArgsAssignment_5_3_0_in_rule__AtomicExpr__Group_5_3__0__Impl12669);
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6352:1: rule__AtomicExpr__Group_5_3__1 : rule__AtomicExpr__Group_5_3__1__Impl ;
    public final void rule__AtomicExpr__Group_5_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6356:1: ( rule__AtomicExpr__Group_5_3__1__Impl )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6357:2: rule__AtomicExpr__Group_5_3__1__Impl
            {
            pushFollow(FOLLOW_rule__AtomicExpr__Group_5_3__1__Impl_in_rule__AtomicExpr__Group_5_3__112699);
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6363:1: rule__AtomicExpr__Group_5_3__1__Impl : ( ( rule__AtomicExpr__Group_5_3_1__0 )* ) ;
    public final void rule__AtomicExpr__Group_5_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6367:1: ( ( ( rule__AtomicExpr__Group_5_3_1__0 )* ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6368:1: ( ( rule__AtomicExpr__Group_5_3_1__0 )* )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6368:1: ( ( rule__AtomicExpr__Group_5_3_1__0 )* )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6369:1: ( rule__AtomicExpr__Group_5_3_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAtomicExprAccess().getGroup_5_3_1()); 
            }
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6370:1: ( rule__AtomicExpr__Group_5_3_1__0 )*
            loop36:
            do {
                int alt36=2;
                int LA36_0 = input.LA(1);

                if ( (LA36_0==36) ) {
                    alt36=1;
                }


                switch (alt36) {
            	case 1 :
            	    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6370:2: rule__AtomicExpr__Group_5_3_1__0
            	    {
            	    pushFollow(FOLLOW_rule__AtomicExpr__Group_5_3_1__0_in_rule__AtomicExpr__Group_5_3__1__Impl12726);
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6384:1: rule__AtomicExpr__Group_5_3_1__0 : rule__AtomicExpr__Group_5_3_1__0__Impl rule__AtomicExpr__Group_5_3_1__1 ;
    public final void rule__AtomicExpr__Group_5_3_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6388:1: ( rule__AtomicExpr__Group_5_3_1__0__Impl rule__AtomicExpr__Group_5_3_1__1 )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6389:2: rule__AtomicExpr__Group_5_3_1__0__Impl rule__AtomicExpr__Group_5_3_1__1
            {
            pushFollow(FOLLOW_rule__AtomicExpr__Group_5_3_1__0__Impl_in_rule__AtomicExpr__Group_5_3_1__012761);
            rule__AtomicExpr__Group_5_3_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__AtomicExpr__Group_5_3_1__1_in_rule__AtomicExpr__Group_5_3_1__012764);
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6396:1: rule__AtomicExpr__Group_5_3_1__0__Impl : ( ',' ) ;
    public final void rule__AtomicExpr__Group_5_3_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6400:1: ( ( ',' ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6401:1: ( ',' )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6401:1: ( ',' )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6402:1: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAtomicExprAccess().getCommaKeyword_5_3_1_0()); 
            }
            match(input,36,FOLLOW_36_in_rule__AtomicExpr__Group_5_3_1__0__Impl12792); if (state.failed) return ;
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6415:1: rule__AtomicExpr__Group_5_3_1__1 : rule__AtomicExpr__Group_5_3_1__1__Impl ;
    public final void rule__AtomicExpr__Group_5_3_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6419:1: ( rule__AtomicExpr__Group_5_3_1__1__Impl )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6420:2: rule__AtomicExpr__Group_5_3_1__1__Impl
            {
            pushFollow(FOLLOW_rule__AtomicExpr__Group_5_3_1__1__Impl_in_rule__AtomicExpr__Group_5_3_1__112823);
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6426:1: rule__AtomicExpr__Group_5_3_1__1__Impl : ( ( rule__AtomicExpr__ArgsAssignment_5_3_1_1 ) ) ;
    public final void rule__AtomicExpr__Group_5_3_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6430:1: ( ( ( rule__AtomicExpr__ArgsAssignment_5_3_1_1 ) ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6431:1: ( ( rule__AtomicExpr__ArgsAssignment_5_3_1_1 ) )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6431:1: ( ( rule__AtomicExpr__ArgsAssignment_5_3_1_1 ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6432:1: ( rule__AtomicExpr__ArgsAssignment_5_3_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAtomicExprAccess().getArgsAssignment_5_3_1_1()); 
            }
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6433:1: ( rule__AtomicExpr__ArgsAssignment_5_3_1_1 )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6433:2: rule__AtomicExpr__ArgsAssignment_5_3_1_1
            {
            pushFollow(FOLLOW_rule__AtomicExpr__ArgsAssignment_5_3_1_1_in_rule__AtomicExpr__Group_5_3_1__1__Impl12850);
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6447:1: rule__AtomicExpr__Group_6__0 : rule__AtomicExpr__Group_6__0__Impl rule__AtomicExpr__Group_6__1 ;
    public final void rule__AtomicExpr__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6451:1: ( rule__AtomicExpr__Group_6__0__Impl rule__AtomicExpr__Group_6__1 )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6452:2: rule__AtomicExpr__Group_6__0__Impl rule__AtomicExpr__Group_6__1
            {
            pushFollow(FOLLOW_rule__AtomicExpr__Group_6__0__Impl_in_rule__AtomicExpr__Group_6__012884);
            rule__AtomicExpr__Group_6__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__AtomicExpr__Group_6__1_in_rule__AtomicExpr__Group_6__012887);
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6459:1: rule__AtomicExpr__Group_6__0__Impl : ( () ) ;
    public final void rule__AtomicExpr__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6463:1: ( ( () ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6464:1: ( () )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6464:1: ( () )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6465:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAtomicExprAccess().getRecordExprAction_6_0()); 
            }
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6466:1: ()
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6468:1: 
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6478:1: rule__AtomicExpr__Group_6__1 : rule__AtomicExpr__Group_6__1__Impl rule__AtomicExpr__Group_6__2 ;
    public final void rule__AtomicExpr__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6482:1: ( rule__AtomicExpr__Group_6__1__Impl rule__AtomicExpr__Group_6__2 )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6483:2: rule__AtomicExpr__Group_6__1__Impl rule__AtomicExpr__Group_6__2
            {
            pushFollow(FOLLOW_rule__AtomicExpr__Group_6__1__Impl_in_rule__AtomicExpr__Group_6__112945);
            rule__AtomicExpr__Group_6__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__AtomicExpr__Group_6__2_in_rule__AtomicExpr__Group_6__112948);
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6490:1: rule__AtomicExpr__Group_6__1__Impl : ( ( rule__AtomicExpr__DefAssignment_6_1 ) ) ;
    public final void rule__AtomicExpr__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6494:1: ( ( ( rule__AtomicExpr__DefAssignment_6_1 ) ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6495:1: ( ( rule__AtomicExpr__DefAssignment_6_1 ) )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6495:1: ( ( rule__AtomicExpr__DefAssignment_6_1 ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6496:1: ( rule__AtomicExpr__DefAssignment_6_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAtomicExprAccess().getDefAssignment_6_1()); 
            }
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6497:1: ( rule__AtomicExpr__DefAssignment_6_1 )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6497:2: rule__AtomicExpr__DefAssignment_6_1
            {
            pushFollow(FOLLOW_rule__AtomicExpr__DefAssignment_6_1_in_rule__AtomicExpr__Group_6__1__Impl12975);
            rule__AtomicExpr__DefAssignment_6_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAtomicExprAccess().getDefAssignment_6_1()); 
            }

            }


            }

        }
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6507:1: rule__AtomicExpr__Group_6__2 : rule__AtomicExpr__Group_6__2__Impl rule__AtomicExpr__Group_6__3 ;
    public final void rule__AtomicExpr__Group_6__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6511:1: ( rule__AtomicExpr__Group_6__2__Impl rule__AtomicExpr__Group_6__3 )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6512:2: rule__AtomicExpr__Group_6__2__Impl rule__AtomicExpr__Group_6__3
            {
            pushFollow(FOLLOW_rule__AtomicExpr__Group_6__2__Impl_in_rule__AtomicExpr__Group_6__213005);
            rule__AtomicExpr__Group_6__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__AtomicExpr__Group_6__3_in_rule__AtomicExpr__Group_6__213008);
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6519:1: rule__AtomicExpr__Group_6__2__Impl : ( '{' ) ;
    public final void rule__AtomicExpr__Group_6__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6523:1: ( ( '{' ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6524:1: ( '{' )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6524:1: ( '{' )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6525:1: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAtomicExprAccess().getLeftCurlyBracketKeyword_6_2()); 
            }
            match(input,28,FOLLOW_28_in_rule__AtomicExpr__Group_6__2__Impl13036); if (state.failed) return ;
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6538:1: rule__AtomicExpr__Group_6__3 : rule__AtomicExpr__Group_6__3__Impl rule__AtomicExpr__Group_6__4 ;
    public final void rule__AtomicExpr__Group_6__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6542:1: ( rule__AtomicExpr__Group_6__3__Impl rule__AtomicExpr__Group_6__4 )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6543:2: rule__AtomicExpr__Group_6__3__Impl rule__AtomicExpr__Group_6__4
            {
            pushFollow(FOLLOW_rule__AtomicExpr__Group_6__3__Impl_in_rule__AtomicExpr__Group_6__313067);
            rule__AtomicExpr__Group_6__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__AtomicExpr__Group_6__4_in_rule__AtomicExpr__Group_6__313070);
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6550:1: rule__AtomicExpr__Group_6__3__Impl : ( ( rule__AtomicExpr__FieldsAssignment_6_3 ) ) ;
    public final void rule__AtomicExpr__Group_6__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6554:1: ( ( ( rule__AtomicExpr__FieldsAssignment_6_3 ) ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6555:1: ( ( rule__AtomicExpr__FieldsAssignment_6_3 ) )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6555:1: ( ( rule__AtomicExpr__FieldsAssignment_6_3 ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6556:1: ( rule__AtomicExpr__FieldsAssignment_6_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAtomicExprAccess().getFieldsAssignment_6_3()); 
            }
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6557:1: ( rule__AtomicExpr__FieldsAssignment_6_3 )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6557:2: rule__AtomicExpr__FieldsAssignment_6_3
            {
            pushFollow(FOLLOW_rule__AtomicExpr__FieldsAssignment_6_3_in_rule__AtomicExpr__Group_6__3__Impl13097);
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6567:1: rule__AtomicExpr__Group_6__4 : rule__AtomicExpr__Group_6__4__Impl rule__AtomicExpr__Group_6__5 ;
    public final void rule__AtomicExpr__Group_6__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6571:1: ( rule__AtomicExpr__Group_6__4__Impl rule__AtomicExpr__Group_6__5 )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6572:2: rule__AtomicExpr__Group_6__4__Impl rule__AtomicExpr__Group_6__5
            {
            pushFollow(FOLLOW_rule__AtomicExpr__Group_6__4__Impl_in_rule__AtomicExpr__Group_6__413127);
            rule__AtomicExpr__Group_6__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__AtomicExpr__Group_6__5_in_rule__AtomicExpr__Group_6__413130);
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6579:1: rule__AtomicExpr__Group_6__4__Impl : ( '=' ) ;
    public final void rule__AtomicExpr__Group_6__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6583:1: ( ( '=' ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6584:1: ( '=' )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6584:1: ( '=' )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6585:1: '='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAtomicExprAccess().getEqualsSignKeyword_6_4()); 
            }
            match(input,16,FOLLOW_16_in_rule__AtomicExpr__Group_6__4__Impl13158); if (state.failed) return ;
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6598:1: rule__AtomicExpr__Group_6__5 : rule__AtomicExpr__Group_6__5__Impl rule__AtomicExpr__Group_6__6 ;
    public final void rule__AtomicExpr__Group_6__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6602:1: ( rule__AtomicExpr__Group_6__5__Impl rule__AtomicExpr__Group_6__6 )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6603:2: rule__AtomicExpr__Group_6__5__Impl rule__AtomicExpr__Group_6__6
            {
            pushFollow(FOLLOW_rule__AtomicExpr__Group_6__5__Impl_in_rule__AtomicExpr__Group_6__513189);
            rule__AtomicExpr__Group_6__5__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__AtomicExpr__Group_6__6_in_rule__AtomicExpr__Group_6__513192);
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6610:1: rule__AtomicExpr__Group_6__5__Impl : ( ( rule__AtomicExpr__ExprsAssignment_6_5 ) ) ;
    public final void rule__AtomicExpr__Group_6__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6614:1: ( ( ( rule__AtomicExpr__ExprsAssignment_6_5 ) ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6615:1: ( ( rule__AtomicExpr__ExprsAssignment_6_5 ) )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6615:1: ( ( rule__AtomicExpr__ExprsAssignment_6_5 ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6616:1: ( rule__AtomicExpr__ExprsAssignment_6_5 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAtomicExprAccess().getExprsAssignment_6_5()); 
            }
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6617:1: ( rule__AtomicExpr__ExprsAssignment_6_5 )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6617:2: rule__AtomicExpr__ExprsAssignment_6_5
            {
            pushFollow(FOLLOW_rule__AtomicExpr__ExprsAssignment_6_5_in_rule__AtomicExpr__Group_6__5__Impl13219);
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6627:1: rule__AtomicExpr__Group_6__6 : rule__AtomicExpr__Group_6__6__Impl rule__AtomicExpr__Group_6__7 ;
    public final void rule__AtomicExpr__Group_6__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6631:1: ( rule__AtomicExpr__Group_6__6__Impl rule__AtomicExpr__Group_6__7 )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6632:2: rule__AtomicExpr__Group_6__6__Impl rule__AtomicExpr__Group_6__7
            {
            pushFollow(FOLLOW_rule__AtomicExpr__Group_6__6__Impl_in_rule__AtomicExpr__Group_6__613249);
            rule__AtomicExpr__Group_6__6__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__AtomicExpr__Group_6__7_in_rule__AtomicExpr__Group_6__613252);
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6639:1: rule__AtomicExpr__Group_6__6__Impl : ( ( rule__AtomicExpr__Group_6_6__0 )* ) ;
    public final void rule__AtomicExpr__Group_6__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6643:1: ( ( ( rule__AtomicExpr__Group_6_6__0 )* ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6644:1: ( ( rule__AtomicExpr__Group_6_6__0 )* )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6644:1: ( ( rule__AtomicExpr__Group_6_6__0 )* )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6645:1: ( rule__AtomicExpr__Group_6_6__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAtomicExprAccess().getGroup_6_6()); 
            }
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6646:1: ( rule__AtomicExpr__Group_6_6__0 )*
            loop37:
            do {
                int alt37=2;
                int LA37_0 = input.LA(1);

                if ( (LA37_0==26) ) {
                    alt37=1;
                }


                switch (alt37) {
            	case 1 :
            	    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6646:2: rule__AtomicExpr__Group_6_6__0
            	    {
            	    pushFollow(FOLLOW_rule__AtomicExpr__Group_6_6__0_in_rule__AtomicExpr__Group_6__6__Impl13279);
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6656:1: rule__AtomicExpr__Group_6__7 : rule__AtomicExpr__Group_6__7__Impl ;
    public final void rule__AtomicExpr__Group_6__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6660:1: ( rule__AtomicExpr__Group_6__7__Impl )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6661:2: rule__AtomicExpr__Group_6__7__Impl
            {
            pushFollow(FOLLOW_rule__AtomicExpr__Group_6__7__Impl_in_rule__AtomicExpr__Group_6__713310);
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6667:1: rule__AtomicExpr__Group_6__7__Impl : ( '}' ) ;
    public final void rule__AtomicExpr__Group_6__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6671:1: ( ( '}' ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6672:1: ( '}' )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6672:1: ( '}' )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6673:1: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAtomicExprAccess().getRightCurlyBracketKeyword_6_7()); 
            }
            match(input,30,FOLLOW_30_in_rule__AtomicExpr__Group_6__7__Impl13338); if (state.failed) return ;
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6702:1: rule__AtomicExpr__Group_6_6__0 : rule__AtomicExpr__Group_6_6__0__Impl rule__AtomicExpr__Group_6_6__1 ;
    public final void rule__AtomicExpr__Group_6_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6706:1: ( rule__AtomicExpr__Group_6_6__0__Impl rule__AtomicExpr__Group_6_6__1 )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6707:2: rule__AtomicExpr__Group_6_6__0__Impl rule__AtomicExpr__Group_6_6__1
            {
            pushFollow(FOLLOW_rule__AtomicExpr__Group_6_6__0__Impl_in_rule__AtomicExpr__Group_6_6__013385);
            rule__AtomicExpr__Group_6_6__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__AtomicExpr__Group_6_6__1_in_rule__AtomicExpr__Group_6_6__013388);
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6714:1: rule__AtomicExpr__Group_6_6__0__Impl : ( ';' ) ;
    public final void rule__AtomicExpr__Group_6_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6718:1: ( ( ';' ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6719:1: ( ';' )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6719:1: ( ';' )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6720:1: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAtomicExprAccess().getSemicolonKeyword_6_6_0()); 
            }
            match(input,26,FOLLOW_26_in_rule__AtomicExpr__Group_6_6__0__Impl13416); if (state.failed) return ;
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6733:1: rule__AtomicExpr__Group_6_6__1 : rule__AtomicExpr__Group_6_6__1__Impl rule__AtomicExpr__Group_6_6__2 ;
    public final void rule__AtomicExpr__Group_6_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6737:1: ( rule__AtomicExpr__Group_6_6__1__Impl rule__AtomicExpr__Group_6_6__2 )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6738:2: rule__AtomicExpr__Group_6_6__1__Impl rule__AtomicExpr__Group_6_6__2
            {
            pushFollow(FOLLOW_rule__AtomicExpr__Group_6_6__1__Impl_in_rule__AtomicExpr__Group_6_6__113447);
            rule__AtomicExpr__Group_6_6__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__AtomicExpr__Group_6_6__2_in_rule__AtomicExpr__Group_6_6__113450);
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6745:1: rule__AtomicExpr__Group_6_6__1__Impl : ( ( rule__AtomicExpr__FieldsAssignment_6_6_1 ) ) ;
    public final void rule__AtomicExpr__Group_6_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6749:1: ( ( ( rule__AtomicExpr__FieldsAssignment_6_6_1 ) ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6750:1: ( ( rule__AtomicExpr__FieldsAssignment_6_6_1 ) )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6750:1: ( ( rule__AtomicExpr__FieldsAssignment_6_6_1 ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6751:1: ( rule__AtomicExpr__FieldsAssignment_6_6_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAtomicExprAccess().getFieldsAssignment_6_6_1()); 
            }
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6752:1: ( rule__AtomicExpr__FieldsAssignment_6_6_1 )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6752:2: rule__AtomicExpr__FieldsAssignment_6_6_1
            {
            pushFollow(FOLLOW_rule__AtomicExpr__FieldsAssignment_6_6_1_in_rule__AtomicExpr__Group_6_6__1__Impl13477);
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6762:1: rule__AtomicExpr__Group_6_6__2 : rule__AtomicExpr__Group_6_6__2__Impl rule__AtomicExpr__Group_6_6__3 ;
    public final void rule__AtomicExpr__Group_6_6__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6766:1: ( rule__AtomicExpr__Group_6_6__2__Impl rule__AtomicExpr__Group_6_6__3 )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6767:2: rule__AtomicExpr__Group_6_6__2__Impl rule__AtomicExpr__Group_6_6__3
            {
            pushFollow(FOLLOW_rule__AtomicExpr__Group_6_6__2__Impl_in_rule__AtomicExpr__Group_6_6__213507);
            rule__AtomicExpr__Group_6_6__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__AtomicExpr__Group_6_6__3_in_rule__AtomicExpr__Group_6_6__213510);
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6774:1: rule__AtomicExpr__Group_6_6__2__Impl : ( '=' ) ;
    public final void rule__AtomicExpr__Group_6_6__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6778:1: ( ( '=' ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6779:1: ( '=' )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6779:1: ( '=' )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6780:1: '='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAtomicExprAccess().getEqualsSignKeyword_6_6_2()); 
            }
            match(input,16,FOLLOW_16_in_rule__AtomicExpr__Group_6_6__2__Impl13538); if (state.failed) return ;
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6793:1: rule__AtomicExpr__Group_6_6__3 : rule__AtomicExpr__Group_6_6__3__Impl ;
    public final void rule__AtomicExpr__Group_6_6__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6797:1: ( rule__AtomicExpr__Group_6_6__3__Impl )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6798:2: rule__AtomicExpr__Group_6_6__3__Impl
            {
            pushFollow(FOLLOW_rule__AtomicExpr__Group_6_6__3__Impl_in_rule__AtomicExpr__Group_6_6__313569);
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6804:1: rule__AtomicExpr__Group_6_6__3__Impl : ( ( rule__AtomicExpr__ExprsAssignment_6_6_3 ) ) ;
    public final void rule__AtomicExpr__Group_6_6__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6808:1: ( ( ( rule__AtomicExpr__ExprsAssignment_6_6_3 ) ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6809:1: ( ( rule__AtomicExpr__ExprsAssignment_6_6_3 ) )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6809:1: ( ( rule__AtomicExpr__ExprsAssignment_6_6_3 ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6810:1: ( rule__AtomicExpr__ExprsAssignment_6_6_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAtomicExprAccess().getExprsAssignment_6_6_3()); 
            }
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6811:1: ( rule__AtomicExpr__ExprsAssignment_6_6_3 )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6811:2: rule__AtomicExpr__ExprsAssignment_6_6_3
            {
            pushFollow(FOLLOW_rule__AtomicExpr__ExprsAssignment_6_6_3_in_rule__AtomicExpr__Group_6_6__3__Impl13596);
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6829:1: rule__AtomicExpr__Group_7__0 : rule__AtomicExpr__Group_7__0__Impl rule__AtomicExpr__Group_7__1 ;
    public final void rule__AtomicExpr__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6833:1: ( rule__AtomicExpr__Group_7__0__Impl rule__AtomicExpr__Group_7__1 )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6834:2: rule__AtomicExpr__Group_7__0__Impl rule__AtomicExpr__Group_7__1
            {
            pushFollow(FOLLOW_rule__AtomicExpr__Group_7__0__Impl_in_rule__AtomicExpr__Group_7__013634);
            rule__AtomicExpr__Group_7__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__AtomicExpr__Group_7__1_in_rule__AtomicExpr__Group_7__013637);
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6841:1: rule__AtomicExpr__Group_7__0__Impl : ( '(' ) ;
    public final void rule__AtomicExpr__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6845:1: ( ( '(' ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6846:1: ( '(' )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6846:1: ( '(' )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6847:1: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAtomicExprAccess().getLeftParenthesisKeyword_7_0()); 
            }
            match(input,41,FOLLOW_41_in_rule__AtomicExpr__Group_7__0__Impl13665); if (state.failed) return ;
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6860:1: rule__AtomicExpr__Group_7__1 : rule__AtomicExpr__Group_7__1__Impl rule__AtomicExpr__Group_7__2 ;
    public final void rule__AtomicExpr__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6864:1: ( rule__AtomicExpr__Group_7__1__Impl rule__AtomicExpr__Group_7__2 )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6865:2: rule__AtomicExpr__Group_7__1__Impl rule__AtomicExpr__Group_7__2
            {
            pushFollow(FOLLOW_rule__AtomicExpr__Group_7__1__Impl_in_rule__AtomicExpr__Group_7__113696);
            rule__AtomicExpr__Group_7__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__AtomicExpr__Group_7__2_in_rule__AtomicExpr__Group_7__113699);
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6872:1: rule__AtomicExpr__Group_7__1__Impl : ( ruleExpr ) ;
    public final void rule__AtomicExpr__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6876:1: ( ( ruleExpr ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6877:1: ( ruleExpr )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6877:1: ( ruleExpr )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6878:1: ruleExpr
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAtomicExprAccess().getExprParserRuleCall_7_1()); 
            }
            pushFollow(FOLLOW_ruleExpr_in_rule__AtomicExpr__Group_7__1__Impl13726);
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6889:1: rule__AtomicExpr__Group_7__2 : rule__AtomicExpr__Group_7__2__Impl ;
    public final void rule__AtomicExpr__Group_7__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6893:1: ( rule__AtomicExpr__Group_7__2__Impl )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6894:2: rule__AtomicExpr__Group_7__2__Impl
            {
            pushFollow(FOLLOW_rule__AtomicExpr__Group_7__2__Impl_in_rule__AtomicExpr__Group_7__213755);
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6900:1: rule__AtomicExpr__Group_7__2__Impl : ( ')' ) ;
    public final void rule__AtomicExpr__Group_7__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6904:1: ( ( ')' ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6905:1: ( ')' )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6905:1: ( ')' )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6906:1: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAtomicExprAccess().getRightParenthesisKeyword_7_2()); 
            }
            match(input,42,FOLLOW_42_in_rule__AtomicExpr__Group_7__2__Impl13783); if (state.failed) return ;
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6925:1: rule__REAL__Group__0 : rule__REAL__Group__0__Impl rule__REAL__Group__1 ;
    public final void rule__REAL__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6929:1: ( rule__REAL__Group__0__Impl rule__REAL__Group__1 )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6930:2: rule__REAL__Group__0__Impl rule__REAL__Group__1
            {
            pushFollow(FOLLOW_rule__REAL__Group__0__Impl_in_rule__REAL__Group__013820);
            rule__REAL__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__REAL__Group__1_in_rule__REAL__Group__013823);
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6937:1: rule__REAL__Group__0__Impl : ( RULE_INT ) ;
    public final void rule__REAL__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6941:1: ( ( RULE_INT ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6942:1: ( RULE_INT )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6942:1: ( RULE_INT )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6943:1: RULE_INT
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getREALAccess().getINTTerminalRuleCall_0()); 
            }
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__REAL__Group__0__Impl13850); if (state.failed) return ;
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6954:1: rule__REAL__Group__1 : rule__REAL__Group__1__Impl rule__REAL__Group__2 ;
    public final void rule__REAL__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6958:1: ( rule__REAL__Group__1__Impl rule__REAL__Group__2 )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6959:2: rule__REAL__Group__1__Impl rule__REAL__Group__2
            {
            pushFollow(FOLLOW_rule__REAL__Group__1__Impl_in_rule__REAL__Group__113879);
            rule__REAL__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__REAL__Group__2_in_rule__REAL__Group__113882);
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6966:1: rule__REAL__Group__1__Impl : ( '.' ) ;
    public final void rule__REAL__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6970:1: ( ( '.' ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6971:1: ( '.' )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6971:1: ( '.' )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6972:1: '.'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getREALAccess().getFullStopKeyword_1()); 
            }
            match(input,50,FOLLOW_50_in_rule__REAL__Group__1__Impl13910); if (state.failed) return ;
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6985:1: rule__REAL__Group__2 : rule__REAL__Group__2__Impl ;
    public final void rule__REAL__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6989:1: ( rule__REAL__Group__2__Impl )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6990:2: rule__REAL__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__REAL__Group__2__Impl_in_rule__REAL__Group__213941);
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:6996:1: rule__REAL__Group__2__Impl : ( RULE_INT ) ;
    public final void rule__REAL__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7000:1: ( ( RULE_INT ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7001:1: ( RULE_INT )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7001:1: ( RULE_INT )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7002:1: RULE_INT
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getREALAccess().getINTTerminalRuleCall_2()); 
            }
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__REAL__Group__2__Impl13968); if (state.failed) return ;
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7020:1: rule__File__TypedefsAssignment_0 : ( ruleTypedef ) ;
    public final void rule__File__TypedefsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7024:1: ( ( ruleTypedef ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7025:1: ( ruleTypedef )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7025:1: ( ruleTypedef )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7026:1: ruleTypedef
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFileAccess().getTypedefsTypedefParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_ruleTypedef_in_rule__File__TypedefsAssignment_014008);
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7035:1: rule__File__ConstantsAssignment_1 : ( ruleConstant ) ;
    public final void rule__File__ConstantsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7039:1: ( ( ruleConstant ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7040:1: ( ruleConstant )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7040:1: ( ruleConstant )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7041:1: ruleConstant
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFileAccess().getConstantsConstantParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_ruleConstant_in_rule__File__ConstantsAssignment_114039);
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7050:1: rule__File__NodesAssignment_2 : ( ruleNode ) ;
    public final void rule__File__NodesAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7054:1: ( ( ruleNode ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7055:1: ( ruleNode )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7055:1: ( ruleNode )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7056:1: ruleNode
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFileAccess().getNodesNodeParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_ruleNode_in_rule__File__NodesAssignment_214070);
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7065:1: rule__Typedef__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Typedef__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7069:1: ( ( RULE_ID ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7070:1: ( RULE_ID )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7070:1: ( RULE_ID )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7071:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypedefAccess().getNameIDTerminalRuleCall_1_0()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Typedef__NameAssignment_114101); if (state.failed) return ;
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7080:1: rule__Typedef__TypeAssignment_3 : ( ruleTopLevelType ) ;
    public final void rule__Typedef__TypeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7084:1: ( ( ruleTopLevelType ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7085:1: ( ruleTopLevelType )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7085:1: ( ruleTopLevelType )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7086:1: ruleTopLevelType
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypedefAccess().getTypeTopLevelTypeParserRuleCall_3_0()); 
            }
            pushFollow(FOLLOW_ruleTopLevelType_in_rule__Typedef__TypeAssignment_314132);
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7095:1: rule__TopLevelType__FieldsAssignment_0_3 : ( ruleField ) ;
    public final void rule__TopLevelType__FieldsAssignment_0_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7099:1: ( ( ruleField ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7100:1: ( ruleField )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7100:1: ( ruleField )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7101:1: ruleField
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTopLevelTypeAccess().getFieldsFieldParserRuleCall_0_3_0()); 
            }
            pushFollow(FOLLOW_ruleField_in_rule__TopLevelType__FieldsAssignment_0_314163);
            ruleField();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTopLevelTypeAccess().getFieldsFieldParserRuleCall_0_3_0()); 
            }

            }


            }

        }
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7110:1: rule__TopLevelType__TypesAssignment_0_5 : ( ruleType ) ;
    public final void rule__TopLevelType__TypesAssignment_0_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7114:1: ( ( ruleType ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7115:1: ( ruleType )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7115:1: ( ruleType )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7116:1: ruleType
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTopLevelTypeAccess().getTypesTypeParserRuleCall_0_5_0()); 
            }
            pushFollow(FOLLOW_ruleType_in_rule__TopLevelType__TypesAssignment_0_514194);
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7125:1: rule__TopLevelType__FieldsAssignment_0_6_1 : ( ruleField ) ;
    public final void rule__TopLevelType__FieldsAssignment_0_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7129:1: ( ( ruleField ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7130:1: ( ruleField )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7130:1: ( ruleField )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7131:1: ruleField
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTopLevelTypeAccess().getFieldsFieldParserRuleCall_0_6_1_0()); 
            }
            pushFollow(FOLLOW_ruleField_in_rule__TopLevelType__FieldsAssignment_0_6_114225);
            ruleField();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTopLevelTypeAccess().getFieldsFieldParserRuleCall_0_6_1_0()); 
            }

            }


            }

        }
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7140:1: rule__TopLevelType__TypesAssignment_0_6_3 : ( ruleType ) ;
    public final void rule__TopLevelType__TypesAssignment_0_6_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7144:1: ( ( ruleType ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7145:1: ( ruleType )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7145:1: ( ruleType )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7146:1: ruleType
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTopLevelTypeAccess().getTypesTypeParserRuleCall_0_6_3_0()); 
            }
            pushFollow(FOLLOW_ruleType_in_rule__TopLevelType__TypesAssignment_0_6_314256);
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7155:1: rule__Type__LowAssignment_3_3 : ( ruleBound ) ;
    public final void rule__Type__LowAssignment_3_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7159:1: ( ( ruleBound ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7160:1: ( ruleBound )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7160:1: ( ruleBound )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7161:1: ruleBound
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypeAccess().getLowBoundParserRuleCall_3_3_0()); 
            }
            pushFollow(FOLLOW_ruleBound_in_rule__Type__LowAssignment_3_314287);
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7170:1: rule__Type__HighAssignment_3_5 : ( ruleBound ) ;
    public final void rule__Type__HighAssignment_3_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7174:1: ( ( ruleBound ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7175:1: ( ruleBound )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7175:1: ( ruleBound )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7176:1: ruleBound
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypeAccess().getHighBoundParserRuleCall_3_5_0()); 
            }
            pushFollow(FOLLOW_ruleBound_in_rule__Type__HighAssignment_3_514318);
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7185:1: rule__Type__DefAssignment_4_1 : ( ( RULE_ID ) ) ;
    public final void rule__Type__DefAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7189:1: ( ( ( RULE_ID ) ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7190:1: ( ( RULE_ID ) )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7190:1: ( ( RULE_ID ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7191:1: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypeAccess().getDefTypedefCrossReference_4_1_0()); 
            }
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7192:1: ( RULE_ID )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7193:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypeAccess().getDefTypedefIDTerminalRuleCall_4_1_0_1()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Type__DefAssignment_4_114353); if (state.failed) return ;
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


    // $ANTLR start "rule__Field__NameAssignment"
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7204:1: rule__Field__NameAssignment : ( RULE_ID ) ;
    public final void rule__Field__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7208:1: ( ( RULE_ID ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7209:1: ( RULE_ID )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7209:1: ( RULE_ID )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7210:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldAccess().getNameIDTerminalRuleCall_0()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Field__NameAssignment14388); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFieldAccess().getNameIDTerminalRuleCall_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Field__NameAssignment"


    // $ANTLR start "rule__Constant__NameAssignment_1"
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7219:1: rule__Constant__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Constant__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7223:1: ( ( RULE_ID ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7224:1: ( RULE_ID )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7224:1: ( RULE_ID )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7225:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConstantAccess().getNameIDTerminalRuleCall_1_0()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Constant__NameAssignment_114419); if (state.failed) return ;
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7234:1: rule__Constant__TypeAssignment_2_1 : ( ruleType ) ;
    public final void rule__Constant__TypeAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7238:1: ( ( ruleType ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7239:1: ( ruleType )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7239:1: ( ruleType )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7240:1: ruleType
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConstantAccess().getTypeTypeParserRuleCall_2_1_0()); 
            }
            pushFollow(FOLLOW_ruleType_in_rule__Constant__TypeAssignment_2_114450);
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7249:1: rule__Constant__ExprAssignment_4 : ( ruleExpr ) ;
    public final void rule__Constant__ExprAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7253:1: ( ( ruleExpr ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7254:1: ( ruleExpr )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7254:1: ( ruleExpr )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7255:1: ruleExpr
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConstantAccess().getExprExprParserRuleCall_4_0()); 
            }
            pushFollow(FOLLOW_ruleExpr_in_rule__Constant__ExprAssignment_414481);
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7264:1: rule__Node__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Node__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7268:1: ( ( RULE_ID ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7269:1: ( RULE_ID )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7269:1: ( RULE_ID )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7270:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNodeAccess().getNameIDTerminalRuleCall_1_0()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Node__NameAssignment_114512); if (state.failed) return ;
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7279:1: rule__Node__InputsAssignment_3_0 : ( ruleVariableGroup ) ;
    public final void rule__Node__InputsAssignment_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7283:1: ( ( ruleVariableGroup ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7284:1: ( ruleVariableGroup )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7284:1: ( ruleVariableGroup )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7285:1: ruleVariableGroup
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNodeAccess().getInputsVariableGroupParserRuleCall_3_0_0()); 
            }
            pushFollow(FOLLOW_ruleVariableGroup_in_rule__Node__InputsAssignment_3_014543);
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7294:1: rule__Node__InputsAssignment_3_1_1 : ( ruleVariableGroup ) ;
    public final void rule__Node__InputsAssignment_3_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7298:1: ( ( ruleVariableGroup ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7299:1: ( ruleVariableGroup )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7299:1: ( ruleVariableGroup )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7300:1: ruleVariableGroup
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNodeAccess().getInputsVariableGroupParserRuleCall_3_1_1_0()); 
            }
            pushFollow(FOLLOW_ruleVariableGroup_in_rule__Node__InputsAssignment_3_1_114574);
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7309:1: rule__Node__OutputsAssignment_7_0 : ( ruleVariableGroup ) ;
    public final void rule__Node__OutputsAssignment_7_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7313:1: ( ( ruleVariableGroup ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7314:1: ( ruleVariableGroup )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7314:1: ( ruleVariableGroup )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7315:1: ruleVariableGroup
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNodeAccess().getOutputsVariableGroupParserRuleCall_7_0_0()); 
            }
            pushFollow(FOLLOW_ruleVariableGroup_in_rule__Node__OutputsAssignment_7_014605);
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7324:1: rule__Node__OutputsAssignment_7_1_1 : ( ruleVariableGroup ) ;
    public final void rule__Node__OutputsAssignment_7_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7328:1: ( ( ruleVariableGroup ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7329:1: ( ruleVariableGroup )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7329:1: ( ruleVariableGroup )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7330:1: ruleVariableGroup
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNodeAccess().getOutputsVariableGroupParserRuleCall_7_1_1_0()); 
            }
            pushFollow(FOLLOW_ruleVariableGroup_in_rule__Node__OutputsAssignment_7_1_114636);
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7339:1: rule__Node__LocalsAssignment_10_1_0 : ( ruleVariableGroup ) ;
    public final void rule__Node__LocalsAssignment_10_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7343:1: ( ( ruleVariableGroup ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7344:1: ( ruleVariableGroup )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7344:1: ( ruleVariableGroup )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7345:1: ruleVariableGroup
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNodeAccess().getLocalsVariableGroupParserRuleCall_10_1_0_0()); 
            }
            pushFollow(FOLLOW_ruleVariableGroup_in_rule__Node__LocalsAssignment_10_1_014667);
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7354:1: rule__Node__EquationsAssignment_12_0 : ( ruleEquation ) ;
    public final void rule__Node__EquationsAssignment_12_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7358:1: ( ( ruleEquation ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7359:1: ( ruleEquation )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7359:1: ( ruleEquation )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7360:1: ruleEquation
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNodeAccess().getEquationsEquationParserRuleCall_12_0_0()); 
            }
            pushFollow(FOLLOW_ruleEquation_in_rule__Node__EquationsAssignment_12_014698);
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7369:1: rule__Node__PropertiesAssignment_12_1 : ( ruleProperty ) ;
    public final void rule__Node__PropertiesAssignment_12_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7373:1: ( ( ruleProperty ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7374:1: ( ruleProperty )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7374:1: ( ruleProperty )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7375:1: ruleProperty
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNodeAccess().getPropertiesPropertyParserRuleCall_12_1_0()); 
            }
            pushFollow(FOLLOW_ruleProperty_in_rule__Node__PropertiesAssignment_12_114729);
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7384:1: rule__Node__AssertionsAssignment_12_2 : ( ruleAssertion ) ;
    public final void rule__Node__AssertionsAssignment_12_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7388:1: ( ( ruleAssertion ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7389:1: ( ruleAssertion )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7389:1: ( ruleAssertion )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7390:1: ruleAssertion
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNodeAccess().getAssertionsAssertionParserRuleCall_12_2_0()); 
            }
            pushFollow(FOLLOW_ruleAssertion_in_rule__Node__AssertionsAssignment_12_214760);
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7399:1: rule__Node__MainAssignment_12_3 : ( ruleMain ) ;
    public final void rule__Node__MainAssignment_12_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7403:1: ( ( ruleMain ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7404:1: ( ruleMain )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7404:1: ( ruleMain )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7405:1: ruleMain
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNodeAccess().getMainMainParserRuleCall_12_3_0()); 
            }
            pushFollow(FOLLOW_ruleMain_in_rule__Node__MainAssignment_12_314791);
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7414:1: rule__VariableGroup__VariablesAssignment_0 : ( ruleVariable ) ;
    public final void rule__VariableGroup__VariablesAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7418:1: ( ( ruleVariable ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7419:1: ( ruleVariable )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7419:1: ( ruleVariable )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7420:1: ruleVariable
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariableGroupAccess().getVariablesVariableParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_ruleVariable_in_rule__VariableGroup__VariablesAssignment_014822);
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7429:1: rule__VariableGroup__VariablesAssignment_1_1 : ( ruleVariable ) ;
    public final void rule__VariableGroup__VariablesAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7433:1: ( ( ruleVariable ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7434:1: ( ruleVariable )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7434:1: ( ruleVariable )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7435:1: ruleVariable
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariableGroupAccess().getVariablesVariableParserRuleCall_1_1_0()); 
            }
            pushFollow(FOLLOW_ruleVariable_in_rule__VariableGroup__VariablesAssignment_1_114853);
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7444:1: rule__VariableGroup__TypeAssignment_3 : ( ruleType ) ;
    public final void rule__VariableGroup__TypeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7448:1: ( ( ruleType ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7449:1: ( ruleType )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7449:1: ( ruleType )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7450:1: ruleType
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariableGroupAccess().getTypeTypeParserRuleCall_3_0()); 
            }
            pushFollow(FOLLOW_ruleType_in_rule__VariableGroup__TypeAssignment_314884);
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7459:1: rule__Variable__NameAssignment : ( RULE_ID ) ;
    public final void rule__Variable__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7463:1: ( ( RULE_ID ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7464:1: ( RULE_ID )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7464:1: ( RULE_ID )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7465:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariableAccess().getNameIDTerminalRuleCall_0()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Variable__NameAssignment14915); if (state.failed) return ;
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7474:1: rule__Equation__LhsAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__Equation__LhsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7478:1: ( ( ( RULE_ID ) ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7479:1: ( ( RULE_ID ) )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7479:1: ( ( RULE_ID ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7480:1: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEquationAccess().getLhsVariableCrossReference_0_0()); 
            }
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7481:1: ( RULE_ID )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7482:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEquationAccess().getLhsVariableIDTerminalRuleCall_0_0_1()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Equation__LhsAssignment_014950); if (state.failed) return ;
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7493:1: rule__Equation__LhsAssignment_1_1 : ( ( RULE_ID ) ) ;
    public final void rule__Equation__LhsAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7497:1: ( ( ( RULE_ID ) ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7498:1: ( ( RULE_ID ) )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7498:1: ( ( RULE_ID ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7499:1: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEquationAccess().getLhsVariableCrossReference_1_1_0()); 
            }
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7500:1: ( RULE_ID )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7501:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEquationAccess().getLhsVariableIDTerminalRuleCall_1_1_0_1()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Equation__LhsAssignment_1_114989); if (state.failed) return ;
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7512:1: rule__Equation__RhsAssignment_3 : ( ruleExpr ) ;
    public final void rule__Equation__RhsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7516:1: ( ( ruleExpr ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7517:1: ( ruleExpr )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7517:1: ( ruleExpr )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7518:1: ruleExpr
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEquationAccess().getRhsExprParserRuleCall_3_0()); 
            }
            pushFollow(FOLLOW_ruleExpr_in_rule__Equation__RhsAssignment_315024);
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7527:1: rule__Property__RefAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__Property__RefAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7531:1: ( ( ( RULE_ID ) ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7532:1: ( ( RULE_ID ) )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7532:1: ( ( RULE_ID ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7533:1: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPropertyAccess().getRefVariableCrossReference_1_0()); 
            }
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7534:1: ( RULE_ID )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7535:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPropertyAccess().getRefVariableIDTerminalRuleCall_1_0_1()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Property__RefAssignment_115059); if (state.failed) return ;
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7546:1: rule__Assertion__ExprAssignment_1 : ( ruleExpr ) ;
    public final void rule__Assertion__ExprAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7550:1: ( ( ruleExpr ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7551:1: ( ruleExpr )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7551:1: ( ruleExpr )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7552:1: ruleExpr
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAssertionAccess().getExprExprParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_ruleExpr_in_rule__Assertion__ExprAssignment_115094);
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7561:1: rule__ArrowExpr__OpAssignment_1_0_1 : ( ( '->' ) ) ;
    public final void rule__ArrowExpr__OpAssignment_1_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7565:1: ( ( ( '->' ) ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7566:1: ( ( '->' ) )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7566:1: ( ( '->' ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7567:1: ( '->' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getArrowExprAccess().getOpHyphenMinusGreaterThanSignKeyword_1_0_1_0()); 
            }
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7568:1: ( '->' )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7569:1: '->'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getArrowExprAccess().getOpHyphenMinusGreaterThanSignKeyword_1_0_1_0()); 
            }
            match(input,54,FOLLOW_54_in_rule__ArrowExpr__OpAssignment_1_0_115130); if (state.failed) return ;
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7584:1: rule__ArrowExpr__RightAssignment_1_0_2 : ( ruleArrowExpr ) ;
    public final void rule__ArrowExpr__RightAssignment_1_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7588:1: ( ( ruleArrowExpr ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7589:1: ( ruleArrowExpr )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7589:1: ( ruleArrowExpr )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7590:1: ruleArrowExpr
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getArrowExprAccess().getRightArrowExprParserRuleCall_1_0_2_0()); 
            }
            pushFollow(FOLLOW_ruleArrowExpr_in_rule__ArrowExpr__RightAssignment_1_0_215169);
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7599:1: rule__ImpliesExpr__OpAssignment_1_0_1 : ( ( '=>' ) ) ;
    public final void rule__ImpliesExpr__OpAssignment_1_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7603:1: ( ( ( '=>' ) ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7604:1: ( ( '=>' ) )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7604:1: ( ( '=>' ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7605:1: ( '=>' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getImpliesExprAccess().getOpEqualsSignGreaterThanSignKeyword_1_0_1_0()); 
            }
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7606:1: ( '=>' )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7607:1: '=>'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getImpliesExprAccess().getOpEqualsSignGreaterThanSignKeyword_1_0_1_0()); 
            }
            match(input,55,FOLLOW_55_in_rule__ImpliesExpr__OpAssignment_1_0_115205); if (state.failed) return ;
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7622:1: rule__ImpliesExpr__RightAssignment_1_0_2 : ( ruleImpliesExpr ) ;
    public final void rule__ImpliesExpr__RightAssignment_1_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7626:1: ( ( ruleImpliesExpr ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7627:1: ( ruleImpliesExpr )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7627:1: ( ruleImpliesExpr )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7628:1: ruleImpliesExpr
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getImpliesExprAccess().getRightImpliesExprParserRuleCall_1_0_2_0()); 
            }
            pushFollow(FOLLOW_ruleImpliesExpr_in_rule__ImpliesExpr__RightAssignment_1_0_215244);
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7637:1: rule__OrExpr__OpAssignment_1_0_1 : ( ( rule__OrExpr__OpAlternatives_1_0_1_0 ) ) ;
    public final void rule__OrExpr__OpAssignment_1_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7641:1: ( ( ( rule__OrExpr__OpAlternatives_1_0_1_0 ) ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7642:1: ( ( rule__OrExpr__OpAlternatives_1_0_1_0 ) )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7642:1: ( ( rule__OrExpr__OpAlternatives_1_0_1_0 ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7643:1: ( rule__OrExpr__OpAlternatives_1_0_1_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOrExprAccess().getOpAlternatives_1_0_1_0()); 
            }
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7644:1: ( rule__OrExpr__OpAlternatives_1_0_1_0 )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7644:2: rule__OrExpr__OpAlternatives_1_0_1_0
            {
            pushFollow(FOLLOW_rule__OrExpr__OpAlternatives_1_0_1_0_in_rule__OrExpr__OpAssignment_1_0_115275);
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7653:1: rule__OrExpr__RightAssignment_1_0_2 : ( ruleAndExpr ) ;
    public final void rule__OrExpr__RightAssignment_1_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7657:1: ( ( ruleAndExpr ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7658:1: ( ruleAndExpr )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7658:1: ( ruleAndExpr )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7659:1: ruleAndExpr
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOrExprAccess().getRightAndExprParserRuleCall_1_0_2_0()); 
            }
            pushFollow(FOLLOW_ruleAndExpr_in_rule__OrExpr__RightAssignment_1_0_215308);
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7668:1: rule__AndExpr__OpAssignment_1_0_1 : ( ( 'and' ) ) ;
    public final void rule__AndExpr__OpAssignment_1_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7672:1: ( ( ( 'and' ) ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7673:1: ( ( 'and' ) )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7673:1: ( ( 'and' ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7674:1: ( 'and' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAndExprAccess().getOpAndKeyword_1_0_1_0()); 
            }
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7675:1: ( 'and' )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7676:1: 'and'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAndExprAccess().getOpAndKeyword_1_0_1_0()); 
            }
            match(input,56,FOLLOW_56_in_rule__AndExpr__OpAssignment_1_0_115344); if (state.failed) return ;
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7691:1: rule__AndExpr__RightAssignment_1_0_2 : ( ruleRelationalExpr ) ;
    public final void rule__AndExpr__RightAssignment_1_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7695:1: ( ( ruleRelationalExpr ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7696:1: ( ruleRelationalExpr )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7696:1: ( ruleRelationalExpr )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7697:1: ruleRelationalExpr
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAndExprAccess().getRightRelationalExprParserRuleCall_1_0_2_0()); 
            }
            pushFollow(FOLLOW_ruleRelationalExpr_in_rule__AndExpr__RightAssignment_1_0_215383);
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7706:1: rule__RelationalExpr__OpAssignment_1_0_1 : ( ( rule__RelationalExpr__OpAlternatives_1_0_1_0 ) ) ;
    public final void rule__RelationalExpr__OpAssignment_1_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7710:1: ( ( ( rule__RelationalExpr__OpAlternatives_1_0_1_0 ) ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7711:1: ( ( rule__RelationalExpr__OpAlternatives_1_0_1_0 ) )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7711:1: ( ( rule__RelationalExpr__OpAlternatives_1_0_1_0 ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7712:1: ( rule__RelationalExpr__OpAlternatives_1_0_1_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRelationalExprAccess().getOpAlternatives_1_0_1_0()); 
            }
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7713:1: ( rule__RelationalExpr__OpAlternatives_1_0_1_0 )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7713:2: rule__RelationalExpr__OpAlternatives_1_0_1_0
            {
            pushFollow(FOLLOW_rule__RelationalExpr__OpAlternatives_1_0_1_0_in_rule__RelationalExpr__OpAssignment_1_0_115414);
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7722:1: rule__RelationalExpr__RightAssignment_1_0_2 : ( rulePlusExpr ) ;
    public final void rule__RelationalExpr__RightAssignment_1_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7726:1: ( ( rulePlusExpr ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7727:1: ( rulePlusExpr )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7727:1: ( rulePlusExpr )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7728:1: rulePlusExpr
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRelationalExprAccess().getRightPlusExprParserRuleCall_1_0_2_0()); 
            }
            pushFollow(FOLLOW_rulePlusExpr_in_rule__RelationalExpr__RightAssignment_1_0_215447);
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7737:1: rule__PlusExpr__OpAssignment_1_0_1 : ( ( rule__PlusExpr__OpAlternatives_1_0_1_0 ) ) ;
    public final void rule__PlusExpr__OpAssignment_1_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7741:1: ( ( ( rule__PlusExpr__OpAlternatives_1_0_1_0 ) ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7742:1: ( ( rule__PlusExpr__OpAlternatives_1_0_1_0 ) )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7742:1: ( ( rule__PlusExpr__OpAlternatives_1_0_1_0 ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7743:1: ( rule__PlusExpr__OpAlternatives_1_0_1_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPlusExprAccess().getOpAlternatives_1_0_1_0()); 
            }
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7744:1: ( rule__PlusExpr__OpAlternatives_1_0_1_0 )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7744:2: rule__PlusExpr__OpAlternatives_1_0_1_0
            {
            pushFollow(FOLLOW_rule__PlusExpr__OpAlternatives_1_0_1_0_in_rule__PlusExpr__OpAssignment_1_0_115478);
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7753:1: rule__PlusExpr__RightAssignment_1_0_2 : ( ruleTimesExpr ) ;
    public final void rule__PlusExpr__RightAssignment_1_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7757:1: ( ( ruleTimesExpr ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7758:1: ( ruleTimesExpr )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7758:1: ( ruleTimesExpr )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7759:1: ruleTimesExpr
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPlusExprAccess().getRightTimesExprParserRuleCall_1_0_2_0()); 
            }
            pushFollow(FOLLOW_ruleTimesExpr_in_rule__PlusExpr__RightAssignment_1_0_215511);
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7768:1: rule__TimesExpr__OpAssignment_1_0_1 : ( ( rule__TimesExpr__OpAlternatives_1_0_1_0 ) ) ;
    public final void rule__TimesExpr__OpAssignment_1_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7772:1: ( ( ( rule__TimesExpr__OpAlternatives_1_0_1_0 ) ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7773:1: ( ( rule__TimesExpr__OpAlternatives_1_0_1_0 ) )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7773:1: ( ( rule__TimesExpr__OpAlternatives_1_0_1_0 ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7774:1: ( rule__TimesExpr__OpAlternatives_1_0_1_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTimesExprAccess().getOpAlternatives_1_0_1_0()); 
            }
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7775:1: ( rule__TimesExpr__OpAlternatives_1_0_1_0 )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7775:2: rule__TimesExpr__OpAlternatives_1_0_1_0
            {
            pushFollow(FOLLOW_rule__TimesExpr__OpAlternatives_1_0_1_0_in_rule__TimesExpr__OpAssignment_1_0_115542);
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7784:1: rule__TimesExpr__RightAssignment_1_0_2 : ( rulePrefixExpr ) ;
    public final void rule__TimesExpr__RightAssignment_1_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7788:1: ( ( rulePrefixExpr ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7789:1: ( rulePrefixExpr )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7789:1: ( rulePrefixExpr )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7790:1: rulePrefixExpr
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTimesExprAccess().getRightPrefixExprParserRuleCall_1_0_2_0()); 
            }
            pushFollow(FOLLOW_rulePrefixExpr_in_rule__TimesExpr__RightAssignment_1_0_215575);
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7799:1: rule__PrefixExpr__OpAssignment_0_1 : ( ( rule__PrefixExpr__OpAlternatives_0_1_0 ) ) ;
    public final void rule__PrefixExpr__OpAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7803:1: ( ( ( rule__PrefixExpr__OpAlternatives_0_1_0 ) ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7804:1: ( ( rule__PrefixExpr__OpAlternatives_0_1_0 ) )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7804:1: ( ( rule__PrefixExpr__OpAlternatives_0_1_0 ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7805:1: ( rule__PrefixExpr__OpAlternatives_0_1_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPrefixExprAccess().getOpAlternatives_0_1_0()); 
            }
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7806:1: ( rule__PrefixExpr__OpAlternatives_0_1_0 )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7806:2: rule__PrefixExpr__OpAlternatives_0_1_0
            {
            pushFollow(FOLLOW_rule__PrefixExpr__OpAlternatives_0_1_0_in_rule__PrefixExpr__OpAssignment_0_115606);
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7815:1: rule__PrefixExpr__ExprAssignment_0_2 : ( rulePrefixExpr ) ;
    public final void rule__PrefixExpr__ExprAssignment_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7819:1: ( ( rulePrefixExpr ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7820:1: ( rulePrefixExpr )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7820:1: ( rulePrefixExpr )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7821:1: rulePrefixExpr
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPrefixExprAccess().getExprPrefixExprParserRuleCall_0_2_0()); 
            }
            pushFollow(FOLLOW_rulePrefixExpr_in_rule__PrefixExpr__ExprAssignment_0_215639);
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7830:1: rule__ProjectionExpr__FieldAssignment_1_0_2 : ( RULE_ID ) ;
    public final void rule__ProjectionExpr__FieldAssignment_1_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7834:1: ( ( RULE_ID ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7835:1: ( RULE_ID )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7835:1: ( RULE_ID )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7836:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProjectionExprAccess().getFieldIDTerminalRuleCall_1_0_2_0()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__ProjectionExpr__FieldAssignment_1_0_215670); if (state.failed) return ;
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7845:1: rule__AtomicExpr__IdAssignment_0_1 : ( ( RULE_ID ) ) ;
    public final void rule__AtomicExpr__IdAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7849:1: ( ( ( RULE_ID ) ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7850:1: ( ( RULE_ID ) )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7850:1: ( ( RULE_ID ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7851:1: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAtomicExprAccess().getIdIdRefCrossReference_0_1_0()); 
            }
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7852:1: ( RULE_ID )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7853:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAtomicExprAccess().getIdIdRefIDTerminalRuleCall_0_1_0_1()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__AtomicExpr__IdAssignment_0_115705); if (state.failed) return ;
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7864:1: rule__AtomicExpr__ValAssignment_1_1 : ( RULE_INT ) ;
    public final void rule__AtomicExpr__ValAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7868:1: ( ( RULE_INT ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7869:1: ( RULE_INT )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7869:1: ( RULE_INT )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7870:1: RULE_INT
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAtomicExprAccess().getValINTTerminalRuleCall_1_1_0()); 
            }
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__AtomicExpr__ValAssignment_1_115740); if (state.failed) return ;
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7879:1: rule__AtomicExpr__ValAssignment_2_1 : ( ruleREAL ) ;
    public final void rule__AtomicExpr__ValAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7883:1: ( ( ruleREAL ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7884:1: ( ruleREAL )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7884:1: ( ruleREAL )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7885:1: ruleREAL
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAtomicExprAccess().getValREALParserRuleCall_2_1_0()); 
            }
            pushFollow(FOLLOW_ruleREAL_in_rule__AtomicExpr__ValAssignment_2_115771);
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7894:1: rule__AtomicExpr__ValAssignment_3_1 : ( RULE_BOOL ) ;
    public final void rule__AtomicExpr__ValAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7898:1: ( ( RULE_BOOL ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7899:1: ( RULE_BOOL )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7899:1: ( RULE_BOOL )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7900:1: RULE_BOOL
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAtomicExprAccess().getValBOOLTerminalRuleCall_3_1_0()); 
            }
            match(input,RULE_BOOL,FOLLOW_RULE_BOOL_in_rule__AtomicExpr__ValAssignment_3_115802); if (state.failed) return ;
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7909:1: rule__AtomicExpr__CondAssignment_4_2 : ( ruleExpr ) ;
    public final void rule__AtomicExpr__CondAssignment_4_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7913:1: ( ( ruleExpr ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7914:1: ( ruleExpr )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7914:1: ( ruleExpr )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7915:1: ruleExpr
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAtomicExprAccess().getCondExprParserRuleCall_4_2_0()); 
            }
            pushFollow(FOLLOW_ruleExpr_in_rule__AtomicExpr__CondAssignment_4_215833);
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7924:1: rule__AtomicExpr__ThenAssignment_4_4 : ( ruleExpr ) ;
    public final void rule__AtomicExpr__ThenAssignment_4_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7928:1: ( ( ruleExpr ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7929:1: ( ruleExpr )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7929:1: ( ruleExpr )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7930:1: ruleExpr
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAtomicExprAccess().getThenExprParserRuleCall_4_4_0()); 
            }
            pushFollow(FOLLOW_ruleExpr_in_rule__AtomicExpr__ThenAssignment_4_415864);
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7939:1: rule__AtomicExpr__ElseAssignment_4_6 : ( ruleExpr ) ;
    public final void rule__AtomicExpr__ElseAssignment_4_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7943:1: ( ( ruleExpr ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7944:1: ( ruleExpr )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7944:1: ( ruleExpr )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7945:1: ruleExpr
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAtomicExprAccess().getElseExprParserRuleCall_4_6_0()); 
            }
            pushFollow(FOLLOW_ruleExpr_in_rule__AtomicExpr__ElseAssignment_4_615895);
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7954:1: rule__AtomicExpr__NodeAssignment_5_1 : ( ( RULE_ID ) ) ;
    public final void rule__AtomicExpr__NodeAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7958:1: ( ( ( RULE_ID ) ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7959:1: ( ( RULE_ID ) )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7959:1: ( ( RULE_ID ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7960:1: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAtomicExprAccess().getNodeNodeCrossReference_5_1_0()); 
            }
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7961:1: ( RULE_ID )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7962:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAtomicExprAccess().getNodeNodeIDTerminalRuleCall_5_1_0_1()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__AtomicExpr__NodeAssignment_5_115930); if (state.failed) return ;
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7973:1: rule__AtomicExpr__ArgsAssignment_5_3_0 : ( ruleExpr ) ;
    public final void rule__AtomicExpr__ArgsAssignment_5_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7977:1: ( ( ruleExpr ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7978:1: ( ruleExpr )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7978:1: ( ruleExpr )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7979:1: ruleExpr
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAtomicExprAccess().getArgsExprParserRuleCall_5_3_0_0()); 
            }
            pushFollow(FOLLOW_ruleExpr_in_rule__AtomicExpr__ArgsAssignment_5_3_015965);
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7988:1: rule__AtomicExpr__ArgsAssignment_5_3_1_1 : ( ruleExpr ) ;
    public final void rule__AtomicExpr__ArgsAssignment_5_3_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7992:1: ( ( ruleExpr ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7993:1: ( ruleExpr )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7993:1: ( ruleExpr )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:7994:1: ruleExpr
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAtomicExprAccess().getArgsExprParserRuleCall_5_3_1_1_0()); 
            }
            pushFollow(FOLLOW_ruleExpr_in_rule__AtomicExpr__ArgsAssignment_5_3_1_115996);
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


    // $ANTLR start "rule__AtomicExpr__DefAssignment_6_1"
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:8003:1: rule__AtomicExpr__DefAssignment_6_1 : ( ( RULE_ID ) ) ;
    public final void rule__AtomicExpr__DefAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:8007:1: ( ( ( RULE_ID ) ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:8008:1: ( ( RULE_ID ) )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:8008:1: ( ( RULE_ID ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:8009:1: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAtomicExprAccess().getDefTypedefCrossReference_6_1_0()); 
            }
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:8010:1: ( RULE_ID )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:8011:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAtomicExprAccess().getDefTypedefIDTerminalRuleCall_6_1_0_1()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__AtomicExpr__DefAssignment_6_116031); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAtomicExprAccess().getDefTypedefIDTerminalRuleCall_6_1_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAtomicExprAccess().getDefTypedefCrossReference_6_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AtomicExpr__DefAssignment_6_1"


    // $ANTLR start "rule__AtomicExpr__FieldsAssignment_6_3"
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:8022:1: rule__AtomicExpr__FieldsAssignment_6_3 : ( ( RULE_ID ) ) ;
    public final void rule__AtomicExpr__FieldsAssignment_6_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:8026:1: ( ( ( RULE_ID ) ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:8027:1: ( ( RULE_ID ) )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:8027:1: ( ( RULE_ID ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:8028:1: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAtomicExprAccess().getFieldsFieldCrossReference_6_3_0()); 
            }
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:8029:1: ( RULE_ID )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:8030:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAtomicExprAccess().getFieldsFieldIDTerminalRuleCall_6_3_0_1()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__AtomicExpr__FieldsAssignment_6_316070); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAtomicExprAccess().getFieldsFieldIDTerminalRuleCall_6_3_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAtomicExprAccess().getFieldsFieldCrossReference_6_3_0()); 
            }

            }


            }

        }
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:8041:1: rule__AtomicExpr__ExprsAssignment_6_5 : ( ruleExpr ) ;
    public final void rule__AtomicExpr__ExprsAssignment_6_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:8045:1: ( ( ruleExpr ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:8046:1: ( ruleExpr )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:8046:1: ( ruleExpr )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:8047:1: ruleExpr
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAtomicExprAccess().getExprsExprParserRuleCall_6_5_0()); 
            }
            pushFollow(FOLLOW_ruleExpr_in_rule__AtomicExpr__ExprsAssignment_6_516105);
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:8056:1: rule__AtomicExpr__FieldsAssignment_6_6_1 : ( ( RULE_ID ) ) ;
    public final void rule__AtomicExpr__FieldsAssignment_6_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:8060:1: ( ( ( RULE_ID ) ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:8061:1: ( ( RULE_ID ) )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:8061:1: ( ( RULE_ID ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:8062:1: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAtomicExprAccess().getFieldsFieldCrossReference_6_6_1_0()); 
            }
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:8063:1: ( RULE_ID )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:8064:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAtomicExprAccess().getFieldsFieldIDTerminalRuleCall_6_6_1_0_1()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__AtomicExpr__FieldsAssignment_6_6_116140); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAtomicExprAccess().getFieldsFieldIDTerminalRuleCall_6_6_1_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAtomicExprAccess().getFieldsFieldCrossReference_6_6_1_0()); 
            }

            }


            }

        }
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
    // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:8075:1: rule__AtomicExpr__ExprsAssignment_6_6_3 : ( ruleExpr ) ;
    public final void rule__AtomicExpr__ExprsAssignment_6_6_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:8079:1: ( ( ruleExpr ) )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:8080:1: ( ruleExpr )
            {
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:8080:1: ( ruleExpr )
            // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:8081:1: ruleExpr
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAtomicExprAccess().getExprsExprParserRuleCall_6_6_3_0()); 
            }
            pushFollow(FOLLOW_ruleExpr_in_rule__AtomicExpr__ExprsAssignment_6_6_316175);
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
        // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4158:2: ( rule__ArrowExpr__Group_1__0 )
        // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4158:2: rule__ArrowExpr__Group_1__0
        {
        pushFollow(FOLLOW_rule__ArrowExpr__Group_1__0_in_synpred45_InternalJKind8388);
        rule__ArrowExpr__Group_1__0();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred45_InternalJKind

    // $ANTLR start synpred46_InternalJKind
    public final void synpred46_InternalJKind_fragment() throws RecognitionException {   
        // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4343:2: ( rule__ImpliesExpr__Group_1__0 )
        // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4343:2: rule__ImpliesExpr__Group_1__0
        {
        pushFollow(FOLLOW_rule__ImpliesExpr__Group_1__0_in_synpred46_InternalJKind8752);
        rule__ImpliesExpr__Group_1__0();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred46_InternalJKind

    // $ANTLR start synpred47_InternalJKind
    public final void synpred47_InternalJKind_fragment() throws RecognitionException {   
        // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4528:2: ( rule__OrExpr__Group_1__0 )
        // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4528:2: rule__OrExpr__Group_1__0
        {
        pushFollow(FOLLOW_rule__OrExpr__Group_1__0_in_synpred47_InternalJKind9116);
        rule__OrExpr__Group_1__0();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred47_InternalJKind

    // $ANTLR start synpred48_InternalJKind
    public final void synpred48_InternalJKind_fragment() throws RecognitionException {   
        // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4713:2: ( rule__AndExpr__Group_1__0 )
        // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4713:2: rule__AndExpr__Group_1__0
        {
        pushFollow(FOLLOW_rule__AndExpr__Group_1__0_in_synpred48_InternalJKind9480);
        rule__AndExpr__Group_1__0();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred48_InternalJKind

    // $ANTLR start synpred49_InternalJKind
    public final void synpred49_InternalJKind_fragment() throws RecognitionException {   
        // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4898:2: ( rule__RelationalExpr__Group_1__0 )
        // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:4898:2: rule__RelationalExpr__Group_1__0
        {
        pushFollow(FOLLOW_rule__RelationalExpr__Group_1__0_in_synpred49_InternalJKind9844);
        rule__RelationalExpr__Group_1__0();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred49_InternalJKind

    // $ANTLR start synpred50_InternalJKind
    public final void synpred50_InternalJKind_fragment() throws RecognitionException {   
        // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5083:2: ( rule__PlusExpr__Group_1__0 )
        // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5083:2: rule__PlusExpr__Group_1__0
        {
        pushFollow(FOLLOW_rule__PlusExpr__Group_1__0_in_synpred50_InternalJKind10208);
        rule__PlusExpr__Group_1__0();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred50_InternalJKind

    // $ANTLR start synpred51_InternalJKind
    public final void synpred51_InternalJKind_fragment() throws RecognitionException {   
        // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5268:2: ( rule__TimesExpr__Group_1__0 )
        // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5268:2: rule__TimesExpr__Group_1__0
        {
        pushFollow(FOLLOW_rule__TimesExpr__Group_1__0_in_synpred51_InternalJKind10572);
        rule__TimesExpr__Group_1__0();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred51_InternalJKind

    // $ANTLR start synpred52_InternalJKind
    public final void synpred52_InternalJKind_fragment() throws RecognitionException {   
        // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5547:2: ( rule__ProjectionExpr__Group_1__0 )
        // ../jkind.xtext.ui/src-gen/jkind/xtext/ui/contentassist/antlr/internal/InternalJKind.g:5547:2: rule__ProjectionExpr__Group_1__0
        {
        pushFollow(FOLLOW_rule__ProjectionExpr__Group_1__0_in_synpred52_InternalJKind11120);
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
        "\1\uffff\1\7\1\11\11\uffff";
    static final String DFA12_minS =
        "\1\4\2\12\7\uffff\1\4\1\uffff";
    static final String DFA12_maxS =
        "\1\63\2\70\7\uffff\1\5\1\uffff";
    static final String DFA12_acceptS =
        "\3\uffff\1\4\1\5\1\10\1\7\1\1\1\6\1\2\1\uffff\1\3";
    static final String DFA12_specialS =
        "\14\uffff}>";
    static final String[] DFA12_transitionS = {
            "\1\2\1\1\1\3\42\uffff\1\5\11\uffff\1\4",
            "\15\7\3\uffff\1\7\1\uffff\1\6\1\uffff\1\7\5\uffff\1\7\4\uffff"+
            "\1\10\1\7\7\uffff\1\7\1\uffff\5\7",
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
            return "1115:1: rule__AtomicExpr__Alternatives : ( ( ( rule__AtomicExpr__Group_0__0 ) ) | ( ( rule__AtomicExpr__Group_1__0 ) ) | ( ( rule__AtomicExpr__Group_2__0 ) ) | ( ( rule__AtomicExpr__Group_3__0 ) ) | ( ( rule__AtomicExpr__Group_4__0 ) ) | ( ( rule__AtomicExpr__Group_5__0 ) ) | ( ( rule__AtomicExpr__Group_6__0 ) ) | ( ( rule__AtomicExpr__Group_7__0 ) ) );";
        }
    }
 

    public static final BitSet FOLLOW_ruleFile_in_entryRuleFile67 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFile74 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__File__Alternatives_in_ruleFile100 = new BitSet(new long[]{0x0000018002000002L});
    public static final BitSet FOLLOW_ruleTypedef_in_entryRuleTypedef128 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTypedef135 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Typedef__Group__0_in_ruleTypedef161 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTopLevelType_in_entryRuleTopLevelType188 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTopLevelType195 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TopLevelType__Alternatives_in_ruleTopLevelType221 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_entryRuleType248 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleType255 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Type__Alternatives_in_ruleType281 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleField_in_entryRuleField308 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleField315 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Field__NameAssignment_in_ruleField341 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBound_in_entryRuleBound368 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBound375 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Bound__Group__0_in_ruleBound401 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConstant_in_entryRuleConstant428 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConstant435 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Constant__Group__0_in_ruleConstant461 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNode_in_entryRuleNode488 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNode495 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Node__Group__0_in_ruleNode521 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariableGroup_in_entryRuleVariableGroup548 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVariableGroup555 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VariableGroup__Group__0_in_ruleVariableGroup581 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariable_in_entryRuleVariable608 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVariable615 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Variable__NameAssignment_in_ruleVariable641 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEquation_in_entryRuleEquation668 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEquation675 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Equation__Group__0_in_ruleEquation701 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProperty_in_entryRuleProperty728 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleProperty735 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Property__Group__0_in_ruleProperty761 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMain_in_entryRuleMain788 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMain795 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Main__Group__0_in_ruleMain821 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAssertion_in_entryRuleAssertion848 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAssertion855 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Assertion__Group__0_in_ruleAssertion881 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpr_in_entryRuleExpr908 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExpr915 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleArrowExpr_in_ruleExpr941 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleArrowExpr_in_entryRuleArrowExpr967 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleArrowExpr974 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ArrowExpr__Group__0_in_ruleArrowExpr1000 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImpliesExpr_in_entryRuleImpliesExpr1027 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleImpliesExpr1034 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ImpliesExpr__Group__0_in_ruleImpliesExpr1060 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOrExpr_in_entryRuleOrExpr1087 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOrExpr1094 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OrExpr__Group__0_in_ruleOrExpr1120 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAndExpr_in_entryRuleAndExpr1147 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAndExpr1154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AndExpr__Group__0_in_ruleAndExpr1180 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRelationalExpr_in_entryRuleRelationalExpr1207 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRelationalExpr1214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RelationalExpr__Group__0_in_ruleRelationalExpr1240 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePlusExpr_in_entryRulePlusExpr1267 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePlusExpr1274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PlusExpr__Group__0_in_rulePlusExpr1300 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTimesExpr_in_entryRuleTimesExpr1327 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTimesExpr1334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TimesExpr__Group__0_in_ruleTimesExpr1360 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrefixExpr_in_entryRulePrefixExpr1387 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePrefixExpr1394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PrefixExpr__Alternatives_in_rulePrefixExpr1420 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProjectionExpr_in_entryRuleProjectionExpr1447 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleProjectionExpr1454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ProjectionExpr__Group__0_in_ruleProjectionExpr1480 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAtomicExpr_in_entryRuleAtomicExpr1507 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAtomicExpr1514 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AtomicExpr__Alternatives_in_ruleAtomicExpr1540 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleREAL_in_entryRuleREAL1569 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleREAL1576 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__REAL__Group__0_in_ruleREAL1602 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__File__TypedefsAssignment_0_in_rule__File__Alternatives1638 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__File__ConstantsAssignment_1_in_rule__File__Alternatives1656 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__File__NodesAssignment_2_in_rule__File__Alternatives1674 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TopLevelType__Group_0__0_in_rule__TopLevelType__Alternatives1707 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_rule__TopLevelType__Alternatives1725 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Type__Group_0__0_in_rule__Type__Alternatives1757 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Type__Group_1__0_in_rule__Type__Alternatives1775 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Type__Group_2__0_in_rule__Type__Alternatives1793 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Type__Group_3__0_in_rule__Type__Alternatives1811 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Type__Group_4__0_in_rule__Type__Alternatives1829 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Node__EquationsAssignment_12_0_in_rule__Node__Alternatives_121862 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Node__PropertiesAssignment_12_1_in_rule__Node__Alternatives_121880 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Node__AssertionsAssignment_12_2_in_rule__Node__Alternatives_121898 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Node__MainAssignment_12_3_in_rule__Node__Alternatives_121916 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_10_in_rule__OrExpr__OpAlternatives_1_0_1_01950 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rule__OrExpr__OpAlternatives_1_0_1_01970 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__RelationalExpr__OpAlternatives_1_0_1_02005 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__RelationalExpr__OpAlternatives_1_0_1_02025 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__RelationalExpr__OpAlternatives_1_0_1_02045 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__RelationalExpr__OpAlternatives_1_0_1_02065 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__RelationalExpr__OpAlternatives_1_0_1_02085 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__RelationalExpr__OpAlternatives_1_0_1_02105 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__PlusExpr__OpAlternatives_1_0_1_02140 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__PlusExpr__OpAlternatives_1_0_1_02160 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__TimesExpr__OpAlternatives_1_0_1_02195 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__TimesExpr__OpAlternatives_1_0_1_02215 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__TimesExpr__OpAlternatives_1_0_1_02235 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PrefixExpr__Group_0__0_in_rule__PrefixExpr__Alternatives2269 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProjectionExpr_in_rule__PrefixExpr__Alternatives2287 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__PrefixExpr__OpAlternatives_0_1_02320 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__PrefixExpr__OpAlternatives_0_1_02340 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__PrefixExpr__OpAlternatives_0_1_02360 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AtomicExpr__Group_0__0_in_rule__AtomicExpr__Alternatives2394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AtomicExpr__Group_1__0_in_rule__AtomicExpr__Alternatives2412 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AtomicExpr__Group_2__0_in_rule__AtomicExpr__Alternatives2430 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AtomicExpr__Group_3__0_in_rule__AtomicExpr__Alternatives2448 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AtomicExpr__Group_4__0_in_rule__AtomicExpr__Alternatives2466 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AtomicExpr__Group_5__0_in_rule__AtomicExpr__Alternatives2484 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AtomicExpr__Group_6__0_in_rule__AtomicExpr__Alternatives2502 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AtomicExpr__Group_7__0_in_rule__AtomicExpr__Alternatives2520 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Typedef__Group__0__Impl_in_rule__Typedef__Group__02552 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Typedef__Group__1_in_rule__Typedef__Group__02555 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__Typedef__Group__0__Impl2583 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Typedef__Group__1__Impl_in_rule__Typedef__Group__12614 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_rule__Typedef__Group__2_in_rule__Typedef__Group__12617 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Typedef__NameAssignment_1_in_rule__Typedef__Group__1__Impl2644 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Typedef__Group__2__Impl_in_rule__Typedef__Group__22674 = new BitSet(new long[]{0x0000000788000020L});
    public static final BitSet FOLLOW_rule__Typedef__Group__3_in_rule__Typedef__Group__22677 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__Typedef__Group__2__Impl2705 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Typedef__Group__3__Impl_in_rule__Typedef__Group__32736 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_rule__Typedef__Group__4_in_rule__Typedef__Group__32739 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Typedef__TypeAssignment_3_in_rule__Typedef__Group__3__Impl2766 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Typedef__Group__4__Impl_in_rule__Typedef__Group__42796 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__Typedef__Group__4__Impl2824 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TopLevelType__Group_0__0__Impl_in_rule__TopLevelType__Group_0__02865 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_rule__TopLevelType__Group_0__1_in_rule__TopLevelType__Group_0__02868 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TopLevelType__Group_0__1__Impl_in_rule__TopLevelType__Group_0__12926 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_rule__TopLevelType__Group_0__2_in_rule__TopLevelType__Group_0__12929 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__TopLevelType__Group_0__1__Impl2957 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TopLevelType__Group_0__2__Impl_in_rule__TopLevelType__Group_0__22988 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__TopLevelType__Group_0__3_in_rule__TopLevelType__Group_0__22991 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__TopLevelType__Group_0__2__Impl3019 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TopLevelType__Group_0__3__Impl_in_rule__TopLevelType__Group_0__33050 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_rule__TopLevelType__Group_0__4_in_rule__TopLevelType__Group_0__33053 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TopLevelType__FieldsAssignment_0_3_in_rule__TopLevelType__Group_0__3__Impl3080 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TopLevelType__Group_0__4__Impl_in_rule__TopLevelType__Group_0__43110 = new BitSet(new long[]{0x0000000788000020L});
    public static final BitSet FOLLOW_rule__TopLevelType__Group_0__5_in_rule__TopLevelType__Group_0__43113 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__TopLevelType__Group_0__4__Impl3141 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TopLevelType__Group_0__5__Impl_in_rule__TopLevelType__Group_0__53172 = new BitSet(new long[]{0x0000000044000000L});
    public static final BitSet FOLLOW_rule__TopLevelType__Group_0__6_in_rule__TopLevelType__Group_0__53175 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TopLevelType__TypesAssignment_0_5_in_rule__TopLevelType__Group_0__5__Impl3202 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TopLevelType__Group_0__6__Impl_in_rule__TopLevelType__Group_0__63232 = new BitSet(new long[]{0x0000000044000000L});
    public static final BitSet FOLLOW_rule__TopLevelType__Group_0__7_in_rule__TopLevelType__Group_0__63235 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TopLevelType__Group_0_6__0_in_rule__TopLevelType__Group_0__6__Impl3262 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_rule__TopLevelType__Group_0__7__Impl_in_rule__TopLevelType__Group_0__73293 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__TopLevelType__Group_0__7__Impl3321 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TopLevelType__Group_0_6__0__Impl_in_rule__TopLevelType__Group_0_6__03368 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__TopLevelType__Group_0_6__1_in_rule__TopLevelType__Group_0_6__03371 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__TopLevelType__Group_0_6__0__Impl3399 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TopLevelType__Group_0_6__1__Impl_in_rule__TopLevelType__Group_0_6__13430 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_rule__TopLevelType__Group_0_6__2_in_rule__TopLevelType__Group_0_6__13433 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TopLevelType__FieldsAssignment_0_6_1_in_rule__TopLevelType__Group_0_6__1__Impl3460 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TopLevelType__Group_0_6__2__Impl_in_rule__TopLevelType__Group_0_6__23490 = new BitSet(new long[]{0x0000000788000020L});
    public static final BitSet FOLLOW_rule__TopLevelType__Group_0_6__3_in_rule__TopLevelType__Group_0_6__23493 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__TopLevelType__Group_0_6__2__Impl3521 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TopLevelType__Group_0_6__3__Impl_in_rule__TopLevelType__Group_0_6__33552 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TopLevelType__TypesAssignment_0_6_3_in_rule__TopLevelType__Group_0_6__3__Impl3579 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Type__Group_0__0__Impl_in_rule__Type__Group_0__03617 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_rule__Type__Group_0__1_in_rule__Type__Group_0__03620 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Type__Group_0__1__Impl_in_rule__Type__Group_0__13678 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__Type__Group_0__1__Impl3706 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Type__Group_1__0__Impl_in_rule__Type__Group_1__03741 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_rule__Type__Group_1__1_in_rule__Type__Group_1__03744 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Type__Group_1__1__Impl_in_rule__Type__Group_1__13802 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__Type__Group_1__1__Impl3830 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Type__Group_2__0__Impl_in_rule__Type__Group_2__03865 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_rule__Type__Group_2__1_in_rule__Type__Group_2__03868 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Type__Group_2__1__Impl_in_rule__Type__Group_2__13926 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__Type__Group_2__1__Impl3954 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Type__Group_3__0__Impl_in_rule__Type__Group_3__03989 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_rule__Type__Group_3__1_in_rule__Type__Group_3__03992 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Type__Group_3__1__Impl_in_rule__Type__Group_3__14050 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_rule__Type__Group_3__2_in_rule__Type__Group_3__14053 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rule__Type__Group_3__1__Impl4081 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Type__Group_3__2__Impl_in_rule__Type__Group_3__24112 = new BitSet(new long[]{0x0000000000080010L});
    public static final BitSet FOLLOW_rule__Type__Group_3__3_in_rule__Type__Group_3__24115 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rule__Type__Group_3__2__Impl4143 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Type__Group_3__3__Impl_in_rule__Type__Group_3__34174 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_rule__Type__Group_3__4_in_rule__Type__Group_3__34177 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Type__LowAssignment_3_3_in_rule__Type__Group_3__3__Impl4204 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Type__Group_3__4__Impl_in_rule__Type__Group_3__44234 = new BitSet(new long[]{0x0000000000080010L});
    public static final BitSet FOLLOW_rule__Type__Group_3__5_in_rule__Type__Group_3__44237 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_rule__Type__Group_3__4__Impl4265 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Type__Group_3__5__Impl_in_rule__Type__Group_3__54296 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_rule__Type__Group_3__6_in_rule__Type__Group_3__54299 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Type__HighAssignment_3_5_in_rule__Type__Group_3__5__Impl4326 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Type__Group_3__6__Impl_in_rule__Type__Group_3__64356 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_rule__Type__Group_3__7_in_rule__Type__Group_3__64359 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_rule__Type__Group_3__6__Impl4387 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Type__Group_3__7__Impl_in_rule__Type__Group_3__74418 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_rule__Type__Group_3__8_in_rule__Type__Group_3__74421 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_rule__Type__Group_3__7__Impl4449 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Type__Group_3__8__Impl_in_rule__Type__Group_3__84480 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__Type__Group_3__8__Impl4508 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Type__Group_4__0__Impl_in_rule__Type__Group_4__04557 = new BitSet(new long[]{0x0000000788000020L});
    public static final BitSet FOLLOW_rule__Type__Group_4__1_in_rule__Type__Group_4__04560 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Type__Group_4__1__Impl_in_rule__Type__Group_4__14618 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Type__DefAssignment_4_1_in_rule__Type__Group_4__1__Impl4645 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Bound__Group__0__Impl_in_rule__Bound__Group__04679 = new BitSet(new long[]{0x0000000000080010L});
    public static final BitSet FOLLOW_rule__Bound__Group__1_in_rule__Bound__Group__04682 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__Bound__Group__0__Impl4711 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Bound__Group__1__Impl_in_rule__Bound__Group__14744 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__Bound__Group__1__Impl4771 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Constant__Group__0__Impl_in_rule__Constant__Group__04804 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Constant__Group__1_in_rule__Constant__Group__04807 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_rule__Constant__Group__0__Impl4835 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Constant__Group__1__Impl_in_rule__Constant__Group__14866 = new BitSet(new long[]{0x0000000020010000L});
    public static final BitSet FOLLOW_rule__Constant__Group__2_in_rule__Constant__Group__14869 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Constant__NameAssignment_1_in_rule__Constant__Group__1__Impl4896 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Constant__Group__2__Impl_in_rule__Constant__Group__24926 = new BitSet(new long[]{0x0000000020010000L});
    public static final BitSet FOLLOW_rule__Constant__Group__3_in_rule__Constant__Group__24929 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Constant__Group_2__0_in_rule__Constant__Group__2__Impl4956 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Constant__Group__3__Impl_in_rule__Constant__Group__34987 = new BitSet(new long[]{0x0008020001880070L});
    public static final BitSet FOLLOW_rule__Constant__Group__4_in_rule__Constant__Group__34990 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__Constant__Group__3__Impl5018 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Constant__Group__4__Impl_in_rule__Constant__Group__45049 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_rule__Constant__Group__5_in_rule__Constant__Group__45052 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Constant__ExprAssignment_4_in_rule__Constant__Group__4__Impl5079 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Constant__Group__5__Impl_in_rule__Constant__Group__55109 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__Constant__Group__5__Impl5137 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Constant__Group_2__0__Impl_in_rule__Constant__Group_2__05180 = new BitSet(new long[]{0x0000000788000020L});
    public static final BitSet FOLLOW_rule__Constant__Group_2__1_in_rule__Constant__Group_2__05183 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__Constant__Group_2__0__Impl5211 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Constant__Group_2__1__Impl_in_rule__Constant__Group_2__15242 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Constant__TypeAssignment_2_1_in_rule__Constant__Group_2__1__Impl5269 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Node__Group__0__Impl_in_rule__Node__Group__05303 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Node__Group__1_in_rule__Node__Group__05306 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_rule__Node__Group__0__Impl5334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Node__Group__1__Impl_in_rule__Node__Group__15365 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_rule__Node__Group__2_in_rule__Node__Group__15368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Node__NameAssignment_1_in_rule__Node__Group__1__Impl5395 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Node__Group__2__Impl_in_rule__Node__Group__25425 = new BitSet(new long[]{0x0000040000000020L});
    public static final BitSet FOLLOW_rule__Node__Group__3_in_rule__Node__Group__25428 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_rule__Node__Group__2__Impl5456 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Node__Group__3__Impl_in_rule__Node__Group__35487 = new BitSet(new long[]{0x0000040000000020L});
    public static final BitSet FOLLOW_rule__Node__Group__4_in_rule__Node__Group__35490 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Node__Group_3__0_in_rule__Node__Group__3__Impl5517 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Node__Group__4__Impl_in_rule__Node__Group__45548 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_rule__Node__Group__5_in_rule__Node__Group__45551 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_rule__Node__Group__4__Impl5579 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Node__Group__5__Impl_in_rule__Node__Group__55610 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_rule__Node__Group__6_in_rule__Node__Group__55613 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_rule__Node__Group__5__Impl5641 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Node__Group__6__Impl_in_rule__Node__Group__65672 = new BitSet(new long[]{0x0000040000000020L});
    public static final BitSet FOLLOW_rule__Node__Group__7_in_rule__Node__Group__65675 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_rule__Node__Group__6__Impl5703 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Node__Group__7__Impl_in_rule__Node__Group__75734 = new BitSet(new long[]{0x0000040000000020L});
    public static final BitSet FOLLOW_rule__Node__Group__8_in_rule__Node__Group__75737 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Node__Group_7__0_in_rule__Node__Group__7__Impl5764 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Node__Group__8__Impl_in_rule__Node__Group__85795 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_rule__Node__Group__9_in_rule__Node__Group__85798 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_rule__Node__Group__8__Impl5826 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Node__Group__9__Impl_in_rule__Node__Group__95857 = new BitSet(new long[]{0x0000500000000000L});
    public static final BitSet FOLLOW_rule__Node__Group__10_in_rule__Node__Group__95860 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__Node__Group__9__Impl5888 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Node__Group__10__Impl_in_rule__Node__Group__105919 = new BitSet(new long[]{0x0000500000000000L});
    public static final BitSet FOLLOW_rule__Node__Group__11_in_rule__Node__Group__105922 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Node__Group_10__0_in_rule__Node__Group__10__Impl5949 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Node__Group__11__Impl_in_rule__Node__Group__115980 = new BitSet(new long[]{0x0003A00000000020L});
    public static final BitSet FOLLOW_rule__Node__Group__12_in_rule__Node__Group__115983 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_rule__Node__Group__11__Impl6011 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Node__Group__12__Impl_in_rule__Node__Group__126042 = new BitSet(new long[]{0x0003A00000000020L});
    public static final BitSet FOLLOW_rule__Node__Group__13_in_rule__Node__Group__126045 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Node__Alternatives_12_in_rule__Node__Group__12__Impl6072 = new BitSet(new long[]{0x0003800000000022L});
    public static final BitSet FOLLOW_rule__Node__Group__13__Impl_in_rule__Node__Group__136103 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_rule__Node__Group__14_in_rule__Node__Group__136106 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_rule__Node__Group__13__Impl6134 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Node__Group__14__Impl_in_rule__Node__Group__146165 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__Node__Group__14__Impl6194 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Node__Group_3__0__Impl_in_rule__Node__Group_3__06257 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_rule__Node__Group_3__1_in_rule__Node__Group_3__06260 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Node__InputsAssignment_3_0_in_rule__Node__Group_3__0__Impl6287 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Node__Group_3__1__Impl_in_rule__Node__Group_3__16317 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Node__Group_3_1__0_in_rule__Node__Group_3__1__Impl6344 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_rule__Node__Group_3_1__0__Impl_in_rule__Node__Group_3_1__06379 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Node__Group_3_1__1_in_rule__Node__Group_3_1__06382 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__Node__Group_3_1__0__Impl6410 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Node__Group_3_1__1__Impl_in_rule__Node__Group_3_1__16441 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Node__InputsAssignment_3_1_1_in_rule__Node__Group_3_1__1__Impl6468 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Node__Group_7__0__Impl_in_rule__Node__Group_7__06502 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_rule__Node__Group_7__1_in_rule__Node__Group_7__06505 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Node__OutputsAssignment_7_0_in_rule__Node__Group_7__0__Impl6532 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Node__Group_7__1__Impl_in_rule__Node__Group_7__16562 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Node__Group_7_1__0_in_rule__Node__Group_7__1__Impl6589 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_rule__Node__Group_7_1__0__Impl_in_rule__Node__Group_7_1__06624 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Node__Group_7_1__1_in_rule__Node__Group_7_1__06627 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__Node__Group_7_1__0__Impl6655 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Node__Group_7_1__1__Impl_in_rule__Node__Group_7_1__16686 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Node__OutputsAssignment_7_1_1_in_rule__Node__Group_7_1__1__Impl6713 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Node__Group_10__0__Impl_in_rule__Node__Group_10__06747 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Node__Group_10__1_in_rule__Node__Group_10__06750 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_rule__Node__Group_10__0__Impl6778 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Node__Group_10__1__Impl_in_rule__Node__Group_10__16809 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Node__Group_10_1__0_in_rule__Node__Group_10__1__Impl6836 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_rule__Node__Group_10_1__0__Impl_in_rule__Node__Group_10_1__06871 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_rule__Node__Group_10_1__1_in_rule__Node__Group_10_1__06874 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Node__LocalsAssignment_10_1_0_in_rule__Node__Group_10_1__0__Impl6901 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Node__Group_10_1__1__Impl_in_rule__Node__Group_10_1__16931 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__Node__Group_10_1__1__Impl6959 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VariableGroup__Group__0__Impl_in_rule__VariableGroup__Group__06994 = new BitSet(new long[]{0x0000001020000000L});
    public static final BitSet FOLLOW_rule__VariableGroup__Group__1_in_rule__VariableGroup__Group__06997 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VariableGroup__VariablesAssignment_0_in_rule__VariableGroup__Group__0__Impl7024 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VariableGroup__Group__1__Impl_in_rule__VariableGroup__Group__17054 = new BitSet(new long[]{0x0000001020000000L});
    public static final BitSet FOLLOW_rule__VariableGroup__Group__2_in_rule__VariableGroup__Group__17057 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VariableGroup__Group_1__0_in_rule__VariableGroup__Group__1__Impl7084 = new BitSet(new long[]{0x0000001000000002L});
    public static final BitSet FOLLOW_rule__VariableGroup__Group__2__Impl_in_rule__VariableGroup__Group__27115 = new BitSet(new long[]{0x0000000788000020L});
    public static final BitSet FOLLOW_rule__VariableGroup__Group__3_in_rule__VariableGroup__Group__27118 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__VariableGroup__Group__2__Impl7146 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VariableGroup__Group__3__Impl_in_rule__VariableGroup__Group__37177 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VariableGroup__TypeAssignment_3_in_rule__VariableGroup__Group__3__Impl7204 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VariableGroup__Group_1__0__Impl_in_rule__VariableGroup__Group_1__07242 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__VariableGroup__Group_1__1_in_rule__VariableGroup__Group_1__07245 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_rule__VariableGroup__Group_1__0__Impl7273 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VariableGroup__Group_1__1__Impl_in_rule__VariableGroup__Group_1__17304 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VariableGroup__VariablesAssignment_1_1_in_rule__VariableGroup__Group_1__1__Impl7331 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Equation__Group__0__Impl_in_rule__Equation__Group__07365 = new BitSet(new long[]{0x0000001000010000L});
    public static final BitSet FOLLOW_rule__Equation__Group__1_in_rule__Equation__Group__07368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Equation__LhsAssignment_0_in_rule__Equation__Group__0__Impl7395 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Equation__Group__1__Impl_in_rule__Equation__Group__17425 = new BitSet(new long[]{0x0000001000010000L});
    public static final BitSet FOLLOW_rule__Equation__Group__2_in_rule__Equation__Group__17428 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Equation__Group_1__0_in_rule__Equation__Group__1__Impl7455 = new BitSet(new long[]{0x0000001000000002L});
    public static final BitSet FOLLOW_rule__Equation__Group__2__Impl_in_rule__Equation__Group__27486 = new BitSet(new long[]{0x0008020001880070L});
    public static final BitSet FOLLOW_rule__Equation__Group__3_in_rule__Equation__Group__27489 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__Equation__Group__2__Impl7517 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Equation__Group__3__Impl_in_rule__Equation__Group__37548 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_rule__Equation__Group__4_in_rule__Equation__Group__37551 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Equation__RhsAssignment_3_in_rule__Equation__Group__3__Impl7578 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Equation__Group__4__Impl_in_rule__Equation__Group__47608 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__Equation__Group__4__Impl7636 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Equation__Group_1__0__Impl_in_rule__Equation__Group_1__07677 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Equation__Group_1__1_in_rule__Equation__Group_1__07680 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_rule__Equation__Group_1__0__Impl7708 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Equation__Group_1__1__Impl_in_rule__Equation__Group_1__17739 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Equation__LhsAssignment_1_1_in_rule__Equation__Group_1__1__Impl7766 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Property__Group__0__Impl_in_rule__Property__Group__07800 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Property__Group__1_in_rule__Property__Group__07803 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_rule__Property__Group__0__Impl7831 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Property__Group__1__Impl_in_rule__Property__Group__17862 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_rule__Property__Group__2_in_rule__Property__Group__17865 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Property__RefAssignment_1_in_rule__Property__Group__1__Impl7892 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Property__Group__2__Impl_in_rule__Property__Group__27922 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__Property__Group__2__Impl7950 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Main__Group__0__Impl_in_rule__Main__Group__07987 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_rule__Main__Group__1_in_rule__Main__Group__07990 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_rule__Main__Group__0__Impl8018 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Main__Group__1__Impl_in_rule__Main__Group__18049 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__Main__Group__1__Impl8078 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Assertion__Group__0__Impl_in_rule__Assertion__Group__08115 = new BitSet(new long[]{0x0008020001880070L});
    public static final BitSet FOLLOW_rule__Assertion__Group__1_in_rule__Assertion__Group__08118 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_rule__Assertion__Group__0__Impl8146 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Assertion__Group__1__Impl_in_rule__Assertion__Group__18177 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_rule__Assertion__Group__2_in_rule__Assertion__Group__18180 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Assertion__ExprAssignment_1_in_rule__Assertion__Group__1__Impl8207 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Assertion__Group__2__Impl_in_rule__Assertion__Group__28237 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__Assertion__Group__2__Impl8265 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ArrowExpr__Group__0__Impl_in_rule__ArrowExpr__Group__08302 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_rule__ArrowExpr__Group__1_in_rule__ArrowExpr__Group__08305 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImpliesExpr_in_rule__ArrowExpr__Group__0__Impl8332 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ArrowExpr__Group__1__Impl_in_rule__ArrowExpr__Group__18361 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ArrowExpr__Group_1__0_in_rule__ArrowExpr__Group__1__Impl8388 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ArrowExpr__Group_1__0__Impl_in_rule__ArrowExpr__Group_1__08423 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ArrowExpr__Group_1_0__0_in_rule__ArrowExpr__Group_1__0__Impl8450 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ArrowExpr__Group_1_0__0__Impl_in_rule__ArrowExpr__Group_1_0__08482 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_rule__ArrowExpr__Group_1_0__1_in_rule__ArrowExpr__Group_1_0__08485 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ArrowExpr__Group_1_0__1__Impl_in_rule__ArrowExpr__Group_1_0__18543 = new BitSet(new long[]{0x0008020001880070L});
    public static final BitSet FOLLOW_rule__ArrowExpr__Group_1_0__2_in_rule__ArrowExpr__Group_1_0__18546 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ArrowExpr__OpAssignment_1_0_1_in_rule__ArrowExpr__Group_1_0__1__Impl8573 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ArrowExpr__Group_1_0__2__Impl_in_rule__ArrowExpr__Group_1_0__28603 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ArrowExpr__RightAssignment_1_0_2_in_rule__ArrowExpr__Group_1_0__2__Impl8630 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ImpliesExpr__Group__0__Impl_in_rule__ImpliesExpr__Group__08666 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_rule__ImpliesExpr__Group__1_in_rule__ImpliesExpr__Group__08669 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOrExpr_in_rule__ImpliesExpr__Group__0__Impl8696 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ImpliesExpr__Group__1__Impl_in_rule__ImpliesExpr__Group__18725 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ImpliesExpr__Group_1__0_in_rule__ImpliesExpr__Group__1__Impl8752 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ImpliesExpr__Group_1__0__Impl_in_rule__ImpliesExpr__Group_1__08787 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ImpliesExpr__Group_1_0__0_in_rule__ImpliesExpr__Group_1__0__Impl8814 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ImpliesExpr__Group_1_0__0__Impl_in_rule__ImpliesExpr__Group_1_0__08846 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_rule__ImpliesExpr__Group_1_0__1_in_rule__ImpliesExpr__Group_1_0__08849 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ImpliesExpr__Group_1_0__1__Impl_in_rule__ImpliesExpr__Group_1_0__18907 = new BitSet(new long[]{0x0008020001880070L});
    public static final BitSet FOLLOW_rule__ImpliesExpr__Group_1_0__2_in_rule__ImpliesExpr__Group_1_0__18910 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ImpliesExpr__OpAssignment_1_0_1_in_rule__ImpliesExpr__Group_1_0__1__Impl8937 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ImpliesExpr__Group_1_0__2__Impl_in_rule__ImpliesExpr__Group_1_0__28967 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ImpliesExpr__RightAssignment_1_0_2_in_rule__ImpliesExpr__Group_1_0__2__Impl8994 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OrExpr__Group__0__Impl_in_rule__OrExpr__Group__09030 = new BitSet(new long[]{0x0000000000000C00L});
    public static final BitSet FOLLOW_rule__OrExpr__Group__1_in_rule__OrExpr__Group__09033 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAndExpr_in_rule__OrExpr__Group__0__Impl9060 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OrExpr__Group__1__Impl_in_rule__OrExpr__Group__19089 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OrExpr__Group_1__0_in_rule__OrExpr__Group__1__Impl9116 = new BitSet(new long[]{0x0000000000000C02L});
    public static final BitSet FOLLOW_rule__OrExpr__Group_1__0__Impl_in_rule__OrExpr__Group_1__09151 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OrExpr__Group_1_0__0_in_rule__OrExpr__Group_1__0__Impl9178 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OrExpr__Group_1_0__0__Impl_in_rule__OrExpr__Group_1_0__09210 = new BitSet(new long[]{0x0000000000000C00L});
    public static final BitSet FOLLOW_rule__OrExpr__Group_1_0__1_in_rule__OrExpr__Group_1_0__09213 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OrExpr__Group_1_0__1__Impl_in_rule__OrExpr__Group_1_0__19271 = new BitSet(new long[]{0x0008020001880070L});
    public static final BitSet FOLLOW_rule__OrExpr__Group_1_0__2_in_rule__OrExpr__Group_1_0__19274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OrExpr__OpAssignment_1_0_1_in_rule__OrExpr__Group_1_0__1__Impl9301 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OrExpr__Group_1_0__2__Impl_in_rule__OrExpr__Group_1_0__29331 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OrExpr__RightAssignment_1_0_2_in_rule__OrExpr__Group_1_0__2__Impl9358 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AndExpr__Group__0__Impl_in_rule__AndExpr__Group__09394 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_rule__AndExpr__Group__1_in_rule__AndExpr__Group__09397 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRelationalExpr_in_rule__AndExpr__Group__0__Impl9424 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AndExpr__Group__1__Impl_in_rule__AndExpr__Group__19453 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AndExpr__Group_1__0_in_rule__AndExpr__Group__1__Impl9480 = new BitSet(new long[]{0x0100000000000002L});
    public static final BitSet FOLLOW_rule__AndExpr__Group_1__0__Impl_in_rule__AndExpr__Group_1__09515 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AndExpr__Group_1_0__0_in_rule__AndExpr__Group_1__0__Impl9542 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AndExpr__Group_1_0__0__Impl_in_rule__AndExpr__Group_1_0__09574 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_rule__AndExpr__Group_1_0__1_in_rule__AndExpr__Group_1_0__09577 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AndExpr__Group_1_0__1__Impl_in_rule__AndExpr__Group_1_0__19635 = new BitSet(new long[]{0x0008020001880070L});
    public static final BitSet FOLLOW_rule__AndExpr__Group_1_0__2_in_rule__AndExpr__Group_1_0__19638 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AndExpr__OpAssignment_1_0_1_in_rule__AndExpr__Group_1_0__1__Impl9665 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AndExpr__Group_1_0__2__Impl_in_rule__AndExpr__Group_1_0__29695 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AndExpr__RightAssignment_1_0_2_in_rule__AndExpr__Group_1_0__2__Impl9722 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RelationalExpr__Group__0__Impl_in_rule__RelationalExpr__Group__09758 = new BitSet(new long[]{0x000000000003F000L});
    public static final BitSet FOLLOW_rule__RelationalExpr__Group__1_in_rule__RelationalExpr__Group__09761 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePlusExpr_in_rule__RelationalExpr__Group__0__Impl9788 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RelationalExpr__Group__1__Impl_in_rule__RelationalExpr__Group__19817 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RelationalExpr__Group_1__0_in_rule__RelationalExpr__Group__1__Impl9844 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RelationalExpr__Group_1__0__Impl_in_rule__RelationalExpr__Group_1__09879 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RelationalExpr__Group_1_0__0_in_rule__RelationalExpr__Group_1__0__Impl9906 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RelationalExpr__Group_1_0__0__Impl_in_rule__RelationalExpr__Group_1_0__09938 = new BitSet(new long[]{0x000000000003F000L});
    public static final BitSet FOLLOW_rule__RelationalExpr__Group_1_0__1_in_rule__RelationalExpr__Group_1_0__09941 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RelationalExpr__Group_1_0__1__Impl_in_rule__RelationalExpr__Group_1_0__19999 = new BitSet(new long[]{0x0008020001880070L});
    public static final BitSet FOLLOW_rule__RelationalExpr__Group_1_0__2_in_rule__RelationalExpr__Group_1_0__110002 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RelationalExpr__OpAssignment_1_0_1_in_rule__RelationalExpr__Group_1_0__1__Impl10029 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RelationalExpr__Group_1_0__2__Impl_in_rule__RelationalExpr__Group_1_0__210059 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RelationalExpr__RightAssignment_1_0_2_in_rule__RelationalExpr__Group_1_0__2__Impl10086 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PlusExpr__Group__0__Impl_in_rule__PlusExpr__Group__010122 = new BitSet(new long[]{0x00000000000C0000L});
    public static final BitSet FOLLOW_rule__PlusExpr__Group__1_in_rule__PlusExpr__Group__010125 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTimesExpr_in_rule__PlusExpr__Group__0__Impl10152 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PlusExpr__Group__1__Impl_in_rule__PlusExpr__Group__110181 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PlusExpr__Group_1__0_in_rule__PlusExpr__Group__1__Impl10208 = new BitSet(new long[]{0x00000000000C0002L});
    public static final BitSet FOLLOW_rule__PlusExpr__Group_1__0__Impl_in_rule__PlusExpr__Group_1__010243 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PlusExpr__Group_1_0__0_in_rule__PlusExpr__Group_1__0__Impl10270 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PlusExpr__Group_1_0__0__Impl_in_rule__PlusExpr__Group_1_0__010302 = new BitSet(new long[]{0x00000000000C0000L});
    public static final BitSet FOLLOW_rule__PlusExpr__Group_1_0__1_in_rule__PlusExpr__Group_1_0__010305 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PlusExpr__Group_1_0__1__Impl_in_rule__PlusExpr__Group_1_0__110363 = new BitSet(new long[]{0x0008020001880070L});
    public static final BitSet FOLLOW_rule__PlusExpr__Group_1_0__2_in_rule__PlusExpr__Group_1_0__110366 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PlusExpr__OpAssignment_1_0_1_in_rule__PlusExpr__Group_1_0__1__Impl10393 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PlusExpr__Group_1_0__2__Impl_in_rule__PlusExpr__Group_1_0__210423 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PlusExpr__RightAssignment_1_0_2_in_rule__PlusExpr__Group_1_0__2__Impl10450 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TimesExpr__Group__0__Impl_in_rule__TimesExpr__Group__010486 = new BitSet(new long[]{0x0000000000700000L});
    public static final BitSet FOLLOW_rule__TimesExpr__Group__1_in_rule__TimesExpr__Group__010489 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrefixExpr_in_rule__TimesExpr__Group__0__Impl10516 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TimesExpr__Group__1__Impl_in_rule__TimesExpr__Group__110545 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TimesExpr__Group_1__0_in_rule__TimesExpr__Group__1__Impl10572 = new BitSet(new long[]{0x0000000000700002L});
    public static final BitSet FOLLOW_rule__TimesExpr__Group_1__0__Impl_in_rule__TimesExpr__Group_1__010607 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TimesExpr__Group_1_0__0_in_rule__TimesExpr__Group_1__0__Impl10634 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TimesExpr__Group_1_0__0__Impl_in_rule__TimesExpr__Group_1_0__010666 = new BitSet(new long[]{0x0000000000700000L});
    public static final BitSet FOLLOW_rule__TimesExpr__Group_1_0__1_in_rule__TimesExpr__Group_1_0__010669 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TimesExpr__Group_1_0__1__Impl_in_rule__TimesExpr__Group_1_0__110727 = new BitSet(new long[]{0x0008020001880070L});
    public static final BitSet FOLLOW_rule__TimesExpr__Group_1_0__2_in_rule__TimesExpr__Group_1_0__110730 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TimesExpr__OpAssignment_1_0_1_in_rule__TimesExpr__Group_1_0__1__Impl10757 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TimesExpr__Group_1_0__2__Impl_in_rule__TimesExpr__Group_1_0__210787 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TimesExpr__RightAssignment_1_0_2_in_rule__TimesExpr__Group_1_0__2__Impl10814 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PrefixExpr__Group_0__0__Impl_in_rule__PrefixExpr__Group_0__010850 = new BitSet(new long[]{0x0000000001880000L});
    public static final BitSet FOLLOW_rule__PrefixExpr__Group_0__1_in_rule__PrefixExpr__Group_0__010853 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PrefixExpr__Group_0__1__Impl_in_rule__PrefixExpr__Group_0__110911 = new BitSet(new long[]{0x0008020001880070L});
    public static final BitSet FOLLOW_rule__PrefixExpr__Group_0__2_in_rule__PrefixExpr__Group_0__110914 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PrefixExpr__OpAssignment_0_1_in_rule__PrefixExpr__Group_0__1__Impl10941 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PrefixExpr__Group_0__2__Impl_in_rule__PrefixExpr__Group_0__210971 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PrefixExpr__ExprAssignment_0_2_in_rule__PrefixExpr__Group_0__2__Impl10998 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ProjectionExpr__Group__0__Impl_in_rule__ProjectionExpr__Group__011034 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_rule__ProjectionExpr__Group__1_in_rule__ProjectionExpr__Group__011037 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAtomicExpr_in_rule__ProjectionExpr__Group__0__Impl11064 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ProjectionExpr__Group__1__Impl_in_rule__ProjectionExpr__Group__111093 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ProjectionExpr__Group_1__0_in_rule__ProjectionExpr__Group__1__Impl11120 = new BitSet(new long[]{0x0004000000000002L});
    public static final BitSet FOLLOW_rule__ProjectionExpr__Group_1__0__Impl_in_rule__ProjectionExpr__Group_1__011155 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ProjectionExpr__Group_1_0__0_in_rule__ProjectionExpr__Group_1__0__Impl11182 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ProjectionExpr__Group_1_0__0__Impl_in_rule__ProjectionExpr__Group_1_0__011214 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_rule__ProjectionExpr__Group_1_0__1_in_rule__ProjectionExpr__Group_1_0__011217 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ProjectionExpr__Group_1_0__1__Impl_in_rule__ProjectionExpr__Group_1_0__111275 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__ProjectionExpr__Group_1_0__2_in_rule__ProjectionExpr__Group_1_0__111278 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_rule__ProjectionExpr__Group_1_0__1__Impl11306 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ProjectionExpr__Group_1_0__2__Impl_in_rule__ProjectionExpr__Group_1_0__211337 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ProjectionExpr__FieldAssignment_1_0_2_in_rule__ProjectionExpr__Group_1_0__2__Impl11364 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AtomicExpr__Group_0__0__Impl_in_rule__AtomicExpr__Group_0__011400 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__AtomicExpr__Group_0__1_in_rule__AtomicExpr__Group_0__011403 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AtomicExpr__Group_0__1__Impl_in_rule__AtomicExpr__Group_0__111461 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AtomicExpr__IdAssignment_0_1_in_rule__AtomicExpr__Group_0__1__Impl11488 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AtomicExpr__Group_1__0__Impl_in_rule__AtomicExpr__Group_1__011522 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__AtomicExpr__Group_1__1_in_rule__AtomicExpr__Group_1__011525 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AtomicExpr__Group_1__1__Impl_in_rule__AtomicExpr__Group_1__111583 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AtomicExpr__ValAssignment_1_1_in_rule__AtomicExpr__Group_1__1__Impl11610 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AtomicExpr__Group_2__0__Impl_in_rule__AtomicExpr__Group_2__011644 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__AtomicExpr__Group_2__1_in_rule__AtomicExpr__Group_2__011647 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AtomicExpr__Group_2__1__Impl_in_rule__AtomicExpr__Group_2__111705 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AtomicExpr__ValAssignment_2_1_in_rule__AtomicExpr__Group_2__1__Impl11732 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AtomicExpr__Group_3__0__Impl_in_rule__AtomicExpr__Group_3__011766 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__AtomicExpr__Group_3__1_in_rule__AtomicExpr__Group_3__011769 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AtomicExpr__Group_3__1__Impl_in_rule__AtomicExpr__Group_3__111827 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AtomicExpr__ValAssignment_3_1_in_rule__AtomicExpr__Group_3__1__Impl11854 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AtomicExpr__Group_4__0__Impl_in_rule__AtomicExpr__Group_4__011888 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_rule__AtomicExpr__Group_4__1_in_rule__AtomicExpr__Group_4__011891 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AtomicExpr__Group_4__1__Impl_in_rule__AtomicExpr__Group_4__111949 = new BitSet(new long[]{0x0008020001880070L});
    public static final BitSet FOLLOW_rule__AtomicExpr__Group_4__2_in_rule__AtomicExpr__Group_4__111952 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_rule__AtomicExpr__Group_4__1__Impl11980 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AtomicExpr__Group_4__2__Impl_in_rule__AtomicExpr__Group_4__212011 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_rule__AtomicExpr__Group_4__3_in_rule__AtomicExpr__Group_4__212014 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AtomicExpr__CondAssignment_4_2_in_rule__AtomicExpr__Group_4__2__Impl12041 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AtomicExpr__Group_4__3__Impl_in_rule__AtomicExpr__Group_4__312071 = new BitSet(new long[]{0x0008020001880070L});
    public static final BitSet FOLLOW_rule__AtomicExpr__Group_4__4_in_rule__AtomicExpr__Group_4__312074 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_rule__AtomicExpr__Group_4__3__Impl12102 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AtomicExpr__Group_4__4__Impl_in_rule__AtomicExpr__Group_4__412133 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_rule__AtomicExpr__Group_4__5_in_rule__AtomicExpr__Group_4__412136 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AtomicExpr__ThenAssignment_4_4_in_rule__AtomicExpr__Group_4__4__Impl12163 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AtomicExpr__Group_4__5__Impl_in_rule__AtomicExpr__Group_4__512193 = new BitSet(new long[]{0x0008020001880070L});
    public static final BitSet FOLLOW_rule__AtomicExpr__Group_4__6_in_rule__AtomicExpr__Group_4__512196 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_rule__AtomicExpr__Group_4__5__Impl12224 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AtomicExpr__Group_4__6__Impl_in_rule__AtomicExpr__Group_4__612255 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AtomicExpr__ElseAssignment_4_6_in_rule__AtomicExpr__Group_4__6__Impl12282 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AtomicExpr__Group_5__0__Impl_in_rule__AtomicExpr__Group_5__012326 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__AtomicExpr__Group_5__1_in_rule__AtomicExpr__Group_5__012329 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AtomicExpr__Group_5__1__Impl_in_rule__AtomicExpr__Group_5__112387 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_rule__AtomicExpr__Group_5__2_in_rule__AtomicExpr__Group_5__112390 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AtomicExpr__NodeAssignment_5_1_in_rule__AtomicExpr__Group_5__1__Impl12417 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AtomicExpr__Group_5__2__Impl_in_rule__AtomicExpr__Group_5__212447 = new BitSet(new long[]{0x0008060001880070L});
    public static final BitSet FOLLOW_rule__AtomicExpr__Group_5__3_in_rule__AtomicExpr__Group_5__212450 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_rule__AtomicExpr__Group_5__2__Impl12478 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AtomicExpr__Group_5__3__Impl_in_rule__AtomicExpr__Group_5__312509 = new BitSet(new long[]{0x0008060001880070L});
    public static final BitSet FOLLOW_rule__AtomicExpr__Group_5__4_in_rule__AtomicExpr__Group_5__312512 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AtomicExpr__Group_5_3__0_in_rule__AtomicExpr__Group_5__3__Impl12539 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AtomicExpr__Group_5__4__Impl_in_rule__AtomicExpr__Group_5__412570 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_rule__AtomicExpr__Group_5__4__Impl12598 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AtomicExpr__Group_5_3__0__Impl_in_rule__AtomicExpr__Group_5_3__012639 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_rule__AtomicExpr__Group_5_3__1_in_rule__AtomicExpr__Group_5_3__012642 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AtomicExpr__ArgsAssignment_5_3_0_in_rule__AtomicExpr__Group_5_3__0__Impl12669 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AtomicExpr__Group_5_3__1__Impl_in_rule__AtomicExpr__Group_5_3__112699 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AtomicExpr__Group_5_3_1__0_in_rule__AtomicExpr__Group_5_3__1__Impl12726 = new BitSet(new long[]{0x0000001000000002L});
    public static final BitSet FOLLOW_rule__AtomicExpr__Group_5_3_1__0__Impl_in_rule__AtomicExpr__Group_5_3_1__012761 = new BitSet(new long[]{0x0008020001880070L});
    public static final BitSet FOLLOW_rule__AtomicExpr__Group_5_3_1__1_in_rule__AtomicExpr__Group_5_3_1__012764 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_rule__AtomicExpr__Group_5_3_1__0__Impl12792 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AtomicExpr__Group_5_3_1__1__Impl_in_rule__AtomicExpr__Group_5_3_1__112823 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AtomicExpr__ArgsAssignment_5_3_1_1_in_rule__AtomicExpr__Group_5_3_1__1__Impl12850 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AtomicExpr__Group_6__0__Impl_in_rule__AtomicExpr__Group_6__012884 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__AtomicExpr__Group_6__1_in_rule__AtomicExpr__Group_6__012887 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AtomicExpr__Group_6__1__Impl_in_rule__AtomicExpr__Group_6__112945 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_rule__AtomicExpr__Group_6__2_in_rule__AtomicExpr__Group_6__112948 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AtomicExpr__DefAssignment_6_1_in_rule__AtomicExpr__Group_6__1__Impl12975 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AtomicExpr__Group_6__2__Impl_in_rule__AtomicExpr__Group_6__213005 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__AtomicExpr__Group_6__3_in_rule__AtomicExpr__Group_6__213008 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__AtomicExpr__Group_6__2__Impl13036 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AtomicExpr__Group_6__3__Impl_in_rule__AtomicExpr__Group_6__313067 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_rule__AtomicExpr__Group_6__4_in_rule__AtomicExpr__Group_6__313070 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AtomicExpr__FieldsAssignment_6_3_in_rule__AtomicExpr__Group_6__3__Impl13097 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AtomicExpr__Group_6__4__Impl_in_rule__AtomicExpr__Group_6__413127 = new BitSet(new long[]{0x0008020001880070L});
    public static final BitSet FOLLOW_rule__AtomicExpr__Group_6__5_in_rule__AtomicExpr__Group_6__413130 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__AtomicExpr__Group_6__4__Impl13158 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AtomicExpr__Group_6__5__Impl_in_rule__AtomicExpr__Group_6__513189 = new BitSet(new long[]{0x0000000044000000L});
    public static final BitSet FOLLOW_rule__AtomicExpr__Group_6__6_in_rule__AtomicExpr__Group_6__513192 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AtomicExpr__ExprsAssignment_6_5_in_rule__AtomicExpr__Group_6__5__Impl13219 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AtomicExpr__Group_6__6__Impl_in_rule__AtomicExpr__Group_6__613249 = new BitSet(new long[]{0x0000000044000000L});
    public static final BitSet FOLLOW_rule__AtomicExpr__Group_6__7_in_rule__AtomicExpr__Group_6__613252 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AtomicExpr__Group_6_6__0_in_rule__AtomicExpr__Group_6__6__Impl13279 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_rule__AtomicExpr__Group_6__7__Impl_in_rule__AtomicExpr__Group_6__713310 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__AtomicExpr__Group_6__7__Impl13338 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AtomicExpr__Group_6_6__0__Impl_in_rule__AtomicExpr__Group_6_6__013385 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__AtomicExpr__Group_6_6__1_in_rule__AtomicExpr__Group_6_6__013388 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__AtomicExpr__Group_6_6__0__Impl13416 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AtomicExpr__Group_6_6__1__Impl_in_rule__AtomicExpr__Group_6_6__113447 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_rule__AtomicExpr__Group_6_6__2_in_rule__AtomicExpr__Group_6_6__113450 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AtomicExpr__FieldsAssignment_6_6_1_in_rule__AtomicExpr__Group_6_6__1__Impl13477 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AtomicExpr__Group_6_6__2__Impl_in_rule__AtomicExpr__Group_6_6__213507 = new BitSet(new long[]{0x0008020001880070L});
    public static final BitSet FOLLOW_rule__AtomicExpr__Group_6_6__3_in_rule__AtomicExpr__Group_6_6__213510 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__AtomicExpr__Group_6_6__2__Impl13538 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AtomicExpr__Group_6_6__3__Impl_in_rule__AtomicExpr__Group_6_6__313569 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AtomicExpr__ExprsAssignment_6_6_3_in_rule__AtomicExpr__Group_6_6__3__Impl13596 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AtomicExpr__Group_7__0__Impl_in_rule__AtomicExpr__Group_7__013634 = new BitSet(new long[]{0x0008020001880070L});
    public static final BitSet FOLLOW_rule__AtomicExpr__Group_7__1_in_rule__AtomicExpr__Group_7__013637 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_rule__AtomicExpr__Group_7__0__Impl13665 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AtomicExpr__Group_7__1__Impl_in_rule__AtomicExpr__Group_7__113696 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_rule__AtomicExpr__Group_7__2_in_rule__AtomicExpr__Group_7__113699 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpr_in_rule__AtomicExpr__Group_7__1__Impl13726 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AtomicExpr__Group_7__2__Impl_in_rule__AtomicExpr__Group_7__213755 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_rule__AtomicExpr__Group_7__2__Impl13783 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__REAL__Group__0__Impl_in_rule__REAL__Group__013820 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_rule__REAL__Group__1_in_rule__REAL__Group__013823 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__REAL__Group__0__Impl13850 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__REAL__Group__1__Impl_in_rule__REAL__Group__113879 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__REAL__Group__2_in_rule__REAL__Group__113882 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_rule__REAL__Group__1__Impl13910 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__REAL__Group__2__Impl_in_rule__REAL__Group__213941 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__REAL__Group__2__Impl13968 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypedef_in_rule__File__TypedefsAssignment_014008 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConstant_in_rule__File__ConstantsAssignment_114039 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNode_in_rule__File__NodesAssignment_214070 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Typedef__NameAssignment_114101 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTopLevelType_in_rule__Typedef__TypeAssignment_314132 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleField_in_rule__TopLevelType__FieldsAssignment_0_314163 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_rule__TopLevelType__TypesAssignment_0_514194 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleField_in_rule__TopLevelType__FieldsAssignment_0_6_114225 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_rule__TopLevelType__TypesAssignment_0_6_314256 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBound_in_rule__Type__LowAssignment_3_314287 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBound_in_rule__Type__HighAssignment_3_514318 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Type__DefAssignment_4_114353 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Field__NameAssignment14388 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Constant__NameAssignment_114419 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_rule__Constant__TypeAssignment_2_114450 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpr_in_rule__Constant__ExprAssignment_414481 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Node__NameAssignment_114512 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariableGroup_in_rule__Node__InputsAssignment_3_014543 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariableGroup_in_rule__Node__InputsAssignment_3_1_114574 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariableGroup_in_rule__Node__OutputsAssignment_7_014605 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariableGroup_in_rule__Node__OutputsAssignment_7_1_114636 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariableGroup_in_rule__Node__LocalsAssignment_10_1_014667 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEquation_in_rule__Node__EquationsAssignment_12_014698 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProperty_in_rule__Node__PropertiesAssignment_12_114729 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAssertion_in_rule__Node__AssertionsAssignment_12_214760 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMain_in_rule__Node__MainAssignment_12_314791 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariable_in_rule__VariableGroup__VariablesAssignment_014822 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariable_in_rule__VariableGroup__VariablesAssignment_1_114853 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_rule__VariableGroup__TypeAssignment_314884 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Variable__NameAssignment14915 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Equation__LhsAssignment_014950 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Equation__LhsAssignment_1_114989 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpr_in_rule__Equation__RhsAssignment_315024 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Property__RefAssignment_115059 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpr_in_rule__Assertion__ExprAssignment_115094 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_54_in_rule__ArrowExpr__OpAssignment_1_0_115130 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleArrowExpr_in_rule__ArrowExpr__RightAssignment_1_0_215169 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_rule__ImpliesExpr__OpAssignment_1_0_115205 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImpliesExpr_in_rule__ImpliesExpr__RightAssignment_1_0_215244 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OrExpr__OpAlternatives_1_0_1_0_in_rule__OrExpr__OpAssignment_1_0_115275 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAndExpr_in_rule__OrExpr__RightAssignment_1_0_215308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_56_in_rule__AndExpr__OpAssignment_1_0_115344 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRelationalExpr_in_rule__AndExpr__RightAssignment_1_0_215383 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RelationalExpr__OpAlternatives_1_0_1_0_in_rule__RelationalExpr__OpAssignment_1_0_115414 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePlusExpr_in_rule__RelationalExpr__RightAssignment_1_0_215447 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PlusExpr__OpAlternatives_1_0_1_0_in_rule__PlusExpr__OpAssignment_1_0_115478 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTimesExpr_in_rule__PlusExpr__RightAssignment_1_0_215511 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TimesExpr__OpAlternatives_1_0_1_0_in_rule__TimesExpr__OpAssignment_1_0_115542 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrefixExpr_in_rule__TimesExpr__RightAssignment_1_0_215575 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PrefixExpr__OpAlternatives_0_1_0_in_rule__PrefixExpr__OpAssignment_0_115606 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrefixExpr_in_rule__PrefixExpr__ExprAssignment_0_215639 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__ProjectionExpr__FieldAssignment_1_0_215670 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__AtomicExpr__IdAssignment_0_115705 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__AtomicExpr__ValAssignment_1_115740 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleREAL_in_rule__AtomicExpr__ValAssignment_2_115771 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_BOOL_in_rule__AtomicExpr__ValAssignment_3_115802 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpr_in_rule__AtomicExpr__CondAssignment_4_215833 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpr_in_rule__AtomicExpr__ThenAssignment_4_415864 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpr_in_rule__AtomicExpr__ElseAssignment_4_615895 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__AtomicExpr__NodeAssignment_5_115930 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpr_in_rule__AtomicExpr__ArgsAssignment_5_3_015965 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpr_in_rule__AtomicExpr__ArgsAssignment_5_3_1_115996 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__AtomicExpr__DefAssignment_6_116031 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__AtomicExpr__FieldsAssignment_6_316070 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpr_in_rule__AtomicExpr__ExprsAssignment_6_516105 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__AtomicExpr__FieldsAssignment_6_6_116140 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpr_in_rule__AtomicExpr__ExprsAssignment_6_6_316175 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ArrowExpr__Group_1__0_in_synpred45_InternalJKind8388 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ImpliesExpr__Group_1__0_in_synpred46_InternalJKind8752 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OrExpr__Group_1__0_in_synpred47_InternalJKind9116 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AndExpr__Group_1__0_in_synpred48_InternalJKind9480 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RelationalExpr__Group_1__0_in_synpred49_InternalJKind9844 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PlusExpr__Group_1__0_in_synpred50_InternalJKind10208 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TimesExpr__Group_1__0_in_synpred51_InternalJKind10572 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ProjectionExpr__Group_1__0_in_synpred52_InternalJKind11120 = new BitSet(new long[]{0x0000000000000002L});

}