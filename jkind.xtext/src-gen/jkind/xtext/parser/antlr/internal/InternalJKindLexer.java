package jkind.xtext.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalJKindLexer extends Lexer {
    public static final int RULE_ID=4;
    public static final int T__29=29;
    public static final int T__28=28;
    public static final int T__27=27;
    public static final int T__26=26;
    public static final int T__25=25;
    public static final int T__24=24;
    public static final int T__23=23;
    public static final int T__22=22;
    public static final int T__21=21;
    public static final int RULE_ANY_OTHER=9;
    public static final int T__20=20;
    public static final int EOF=-1;
    public static final int T__55=55;
    public static final int T__19=19;
    public static final int T__56=56;
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

    public InternalJKindLexer() {;} 
    public InternalJKindLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalJKindLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g"; }

    // $ANTLR start "T__10"
    public final void mT__10() throws RecognitionException {
        try {
            int _type = T__10;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:11:7: ( 'type' )
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:11:9: 'type'
            {
            match("type"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__10"

    // $ANTLR start "T__11"
    public final void mT__11() throws RecognitionException {
        try {
            int _type = T__11;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:12:7: ( '=' )
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:12:9: '='
            {
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__11"

    // $ANTLR start "T__12"
    public final void mT__12() throws RecognitionException {
        try {
            int _type = T__12;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:13:7: ( ';' )
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:13:9: ';'
            {
            match(';'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__12"

    // $ANTLR start "T__13"
    public final void mT__13() throws RecognitionException {
        try {
            int _type = T__13;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:14:7: ( 'struct' )
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:14:9: 'struct'
            {
            match("struct"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__13"

    // $ANTLR start "T__14"
    public final void mT__14() throws RecognitionException {
        try {
            int _type = T__14;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:15:7: ( '{' )
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:15:9: '{'
            {
            match('{'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__14"

    // $ANTLR start "T__15"
    public final void mT__15() throws RecognitionException {
        try {
            int _type = T__15;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:16:7: ( ':' )
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:16:9: ':'
            {
            match(':'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__15"

    // $ANTLR start "T__16"
    public final void mT__16() throws RecognitionException {
        try {
            int _type = T__16;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:17:7: ( '}' )
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:17:9: '}'
            {
            match('}'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__16"

    // $ANTLR start "T__17"
    public final void mT__17() throws RecognitionException {
        try {
            int _type = T__17;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:18:7: ( 'int' )
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:18:9: 'int'
            {
            match("int"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__17"

    // $ANTLR start "T__18"
    public final void mT__18() throws RecognitionException {
        try {
            int _type = T__18;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:19:7: ( 'bool' )
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:19:9: 'bool'
            {
            match("bool"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__18"

    // $ANTLR start "T__19"
    public final void mT__19() throws RecognitionException {
        try {
            int _type = T__19;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:20:7: ( 'real' )
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:20:9: 'real'
            {
            match("real"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__19"

    // $ANTLR start "T__20"
    public final void mT__20() throws RecognitionException {
        try {
            int _type = T__20;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:21:7: ( 'subrange' )
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:21:9: 'subrange'
            {
            match("subrange"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__20"

    // $ANTLR start "T__21"
    public final void mT__21() throws RecognitionException {
        try {
            int _type = T__21;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:22:7: ( '[' )
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:22:9: '['
            {
            match('['); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__21"

    // $ANTLR start "T__22"
    public final void mT__22() throws RecognitionException {
        try {
            int _type = T__22;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:23:7: ( ',' )
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:23:9: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__22"

    // $ANTLR start "T__23"
    public final void mT__23() throws RecognitionException {
        try {
            int _type = T__23;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:24:7: ( ']' )
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:24:9: ']'
            {
            match(']'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__23"

    // $ANTLR start "T__24"
    public final void mT__24() throws RecognitionException {
        try {
            int _type = T__24;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:25:7: ( 'of' )
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:25:9: 'of'
            {
            match("of"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__24"

    // $ANTLR start "T__25"
    public final void mT__25() throws RecognitionException {
        try {
            int _type = T__25;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:26:7: ( '-' )
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:26:9: '-'
            {
            match('-'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__25"

    // $ANTLR start "T__26"
    public final void mT__26() throws RecognitionException {
        try {
            int _type = T__26;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:27:7: ( 'const' )
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:27:9: 'const'
            {
            match("const"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__26"

    // $ANTLR start "T__27"
    public final void mT__27() throws RecognitionException {
        try {
            int _type = T__27;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:28:7: ( 'node' )
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:28:9: 'node'
            {
            match("node"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__27"

    // $ANTLR start "T__28"
    public final void mT__28() throws RecognitionException {
        try {
            int _type = T__28;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:29:7: ( '(' )
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:29:9: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__28"

    // $ANTLR start "T__29"
    public final void mT__29() throws RecognitionException {
        try {
            int _type = T__29;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:30:7: ( ')' )
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:30:9: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__29"

    // $ANTLR start "T__30"
    public final void mT__30() throws RecognitionException {
        try {
            int _type = T__30;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:31:7: ( 'returns' )
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:31:9: 'returns'
            {
            match("returns"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__30"

    // $ANTLR start "T__31"
    public final void mT__31() throws RecognitionException {
        try {
            int _type = T__31;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:32:7: ( 'var' )
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:32:9: 'var'
            {
            match("var"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__31"

    // $ANTLR start "T__32"
    public final void mT__32() throws RecognitionException {
        try {
            int _type = T__32;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:33:7: ( 'let' )
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:33:9: 'let'
            {
            match("let"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__32"

    // $ANTLR start "T__33"
    public final void mT__33() throws RecognitionException {
        try {
            int _type = T__33;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:34:7: ( 'tel' )
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:34:9: 'tel'
            {
            match("tel"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__33"

    // $ANTLR start "T__34"
    public final void mT__34() throws RecognitionException {
        try {
            int _type = T__34;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:35:7: ( '--%PROPERTY' )
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:35:9: '--%PROPERTY'
            {
            match("--%PROPERTY"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__34"

    // $ANTLR start "T__35"
    public final void mT__35() throws RecognitionException {
        try {
            int _type = T__35;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:36:7: ( '--%MAIN' )
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:36:9: '--%MAIN'
            {
            match("--%MAIN"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__35"

    // $ANTLR start "T__36"
    public final void mT__36() throws RecognitionException {
        try {
            int _type = T__36;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:37:7: ( 'assert' )
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:37:9: 'assert'
            {
            match("assert"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__36"

    // $ANTLR start "T__37"
    public final void mT__37() throws RecognitionException {
        try {
            int _type = T__37;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:38:7: ( '->' )
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:38:9: '->'
            {
            match("->"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__37"

    // $ANTLR start "T__38"
    public final void mT__38() throws RecognitionException {
        try {
            int _type = T__38;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:39:7: ( '=>' )
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:39:9: '=>'
            {
            match("=>"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__38"

    // $ANTLR start "T__39"
    public final void mT__39() throws RecognitionException {
        try {
            int _type = T__39;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:40:7: ( 'or' )
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:40:9: 'or'
            {
            match("or"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__39"

    // $ANTLR start "T__40"
    public final void mT__40() throws RecognitionException {
        try {
            int _type = T__40;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:41:7: ( 'xor' )
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:41:9: 'xor'
            {
            match("xor"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__40"

    // $ANTLR start "T__41"
    public final void mT__41() throws RecognitionException {
        try {
            int _type = T__41;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:42:7: ( 'and' )
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:42:9: 'and'
            {
            match("and"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__41"

    // $ANTLR start "T__42"
    public final void mT__42() throws RecognitionException {
        try {
            int _type = T__42;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:43:7: ( '<' )
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:43:9: '<'
            {
            match('<'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__42"

    // $ANTLR start "T__43"
    public final void mT__43() throws RecognitionException {
        try {
            int _type = T__43;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:44:7: ( '<=' )
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:44:9: '<='
            {
            match("<="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__43"

    // $ANTLR start "T__44"
    public final void mT__44() throws RecognitionException {
        try {
            int _type = T__44;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:45:7: ( '>' )
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:45:9: '>'
            {
            match('>'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__44"

    // $ANTLR start "T__45"
    public final void mT__45() throws RecognitionException {
        try {
            int _type = T__45;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:46:7: ( '>=' )
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:46:9: '>='
            {
            match(">="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__45"

    // $ANTLR start "T__46"
    public final void mT__46() throws RecognitionException {
        try {
            int _type = T__46;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:47:7: ( '<>' )
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:47:9: '<>'
            {
            match("<>"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__46"

    // $ANTLR start "T__47"
    public final void mT__47() throws RecognitionException {
        try {
            int _type = T__47;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:48:7: ( '+' )
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:48:9: '+'
            {
            match('+'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__47"

    // $ANTLR start "T__48"
    public final void mT__48() throws RecognitionException {
        try {
            int _type = T__48;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:49:7: ( '*' )
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:49:9: '*'
            {
            match('*'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__48"

    // $ANTLR start "T__49"
    public final void mT__49() throws RecognitionException {
        try {
            int _type = T__49;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:50:7: ( '/' )
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:50:9: '/'
            {
            match('/'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__49"

    // $ANTLR start "T__50"
    public final void mT__50() throws RecognitionException {
        try {
            int _type = T__50;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:51:7: ( 'div' )
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:51:9: 'div'
            {
            match("div"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__50"

    // $ANTLR start "T__51"
    public final void mT__51() throws RecognitionException {
        try {
            int _type = T__51;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:52:7: ( 'not' )
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:52:9: 'not'
            {
            match("not"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__51"

    // $ANTLR start "T__52"
    public final void mT__52() throws RecognitionException {
        try {
            int _type = T__52;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:53:7: ( 'pre' )
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:53:9: 'pre'
            {
            match("pre"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__52"

    // $ANTLR start "T__53"
    public final void mT__53() throws RecognitionException {
        try {
            int _type = T__53;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:54:7: ( '.' )
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:54:9: '.'
            {
            match('.'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__53"

    // $ANTLR start "T__54"
    public final void mT__54() throws RecognitionException {
        try {
            int _type = T__54;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:55:7: ( 'if' )
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:55:9: 'if'
            {
            match("if"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__54"

    // $ANTLR start "T__55"
    public final void mT__55() throws RecognitionException {
        try {
            int _type = T__55;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:56:7: ( 'then' )
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:56:9: 'then'
            {
            match("then"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__55"

    // $ANTLR start "T__56"
    public final void mT__56() throws RecognitionException {
        try {
            int _type = T__56;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:57:7: ( 'else' )
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:57:9: 'else'
            {
            match("else"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__56"

    // $ANTLR start "T__57"
    public final void mT__57() throws RecognitionException {
        try {
            int _type = T__57;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:58:7: ( 'true' )
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:58:9: 'true'
            {
            match("true"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__57"

    // $ANTLR start "T__58"
    public final void mT__58() throws RecognitionException {
        try {
            int _type = T__58;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:59:7: ( 'false' )
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:59:9: 'false'
            {
            match("false"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__58"

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2595:9: ( ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2595:11: ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2595:35: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>='0' && LA1_0<='9')||(LA1_0>='A' && LA1_0<='Z')||LA1_0=='_'||(LA1_0>='a' && LA1_0<='z')) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ID"

    // $ANTLR start "RULE_INT"
    public final void mRULE_INT() throws RecognitionException {
        try {
            int _type = RULE_INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2597:10: ( ( '0' .. '9' )+ )
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2597:12: ( '0' .. '9' )+
            {
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2597:12: ( '0' .. '9' )+
            int cnt2=0;
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>='0' && LA2_0<='9')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2597:13: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt2 >= 1 ) break loop2;
                        EarlyExitException eee =
                            new EarlyExitException(2, input);
                        throw eee;
                }
                cnt2++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_INT"

    // $ANTLR start "RULE_WS"
    public final void mRULE_WS() throws RecognitionException {
        try {
            int _type = RULE_WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2599:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2599:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2599:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt3=0;
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>='\t' && LA3_0<='\n')||LA3_0=='\r'||LA3_0==' ') ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:
            	    {
            	    if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt3 >= 1 ) break loop3;
                        EarlyExitException eee =
                            new EarlyExitException(3, input);
                        throw eee;
                }
                cnt3++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_WS"

    // $ANTLR start "RULE_SL_COMMENT"
    public final void mRULE_SL_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_SL_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2601:17: ( '--' (~ ( ( '%' | '\\r' | '\\n' ) ) (~ ( ( '\\r' | '\\n' ) ) )* )? ( ( '\\r' )? '\\n' )? )
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2601:19: '--' (~ ( ( '%' | '\\r' | '\\n' ) ) (~ ( ( '\\r' | '\\n' ) ) )* )? ( ( '\\r' )? '\\n' )?
            {
            match("--"); 

            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2601:24: (~ ( ( '%' | '\\r' | '\\n' ) ) (~ ( ( '\\r' | '\\n' ) ) )* )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( ((LA5_0>='\u0000' && LA5_0<='\t')||(LA5_0>='\u000B' && LA5_0<='\f')||(LA5_0>='\u000E' && LA5_0<='$')||(LA5_0>='&' && LA5_0<='\uFFFF')) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2601:25: ~ ( ( '%' | '\\r' | '\\n' ) ) (~ ( ( '\\r' | '\\n' ) ) )*
                    {
                    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='$')||(input.LA(1)>='&' && input.LA(1)<='\uFFFF') ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}

                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2601:44: (~ ( ( '\\r' | '\\n' ) ) )*
                    loop4:
                    do {
                        int alt4=2;
                        int LA4_0 = input.LA(1);

                        if ( ((LA4_0>='\u0000' && LA4_0<='\t')||(LA4_0>='\u000B' && LA4_0<='\f')||(LA4_0>='\u000E' && LA4_0<='\uFFFF')) ) {
                            alt4=1;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2601:44: ~ ( ( '\\r' | '\\n' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop4;
                        }
                    } while (true);


                    }
                    break;

            }

            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2601:62: ( ( '\\r' )? '\\n' )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0=='\n'||LA7_0=='\r') ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2601:63: ( '\\r' )? '\\n'
                    {
                    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2601:63: ( '\\r' )?
                    int alt6=2;
                    int LA6_0 = input.LA(1);

                    if ( (LA6_0=='\r') ) {
                        alt6=1;
                    }
                    switch (alt6) {
                        case 1 :
                            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2601:63: '\\r'
                            {
                            match('\r'); 

                            }
                            break;

                    }

                    match('\n'); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SL_COMMENT"

    // $ANTLR start "RULE_ML_COMMENT"
    public final void mRULE_ML_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_ML_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2603:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2603:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2603:24: ( options {greedy=false; } : . )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0=='*') ) {
                    int LA8_1 = input.LA(2);

                    if ( (LA8_1=='/') ) {
                        alt8=2;
                    }
                    else if ( ((LA8_1>='\u0000' && LA8_1<='.')||(LA8_1>='0' && LA8_1<='\uFFFF')) ) {
                        alt8=1;
                    }


                }
                else if ( ((LA8_0>='\u0000' && LA8_0<=')')||(LA8_0>='+' && LA8_0<='\uFFFF')) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2603:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            match("*/"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ML_COMMENT"

    // $ANTLR start "RULE_ANY_OTHER"
    public final void mRULE_ANY_OTHER() throws RecognitionException {
        try {
            int _type = RULE_ANY_OTHER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2605:16: ( . )
            // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:2605:18: .
            {
            matchAny(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ANY_OTHER"

    public void mTokens() throws RecognitionException {
        // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1:8: ( T__10 | T__11 | T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | RULE_ID | RULE_INT | RULE_WS | RULE_SL_COMMENT | RULE_ML_COMMENT | RULE_ANY_OTHER )
        int alt9=55;
        alt9 = dfa9.predict(input);
        switch (alt9) {
            case 1 :
                // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1:10: T__10
                {
                mT__10(); 

                }
                break;
            case 2 :
                // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1:16: T__11
                {
                mT__11(); 

                }
                break;
            case 3 :
                // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1:22: T__12
                {
                mT__12(); 

                }
                break;
            case 4 :
                // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1:28: T__13
                {
                mT__13(); 

                }
                break;
            case 5 :
                // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1:34: T__14
                {
                mT__14(); 

                }
                break;
            case 6 :
                // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1:40: T__15
                {
                mT__15(); 

                }
                break;
            case 7 :
                // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1:46: T__16
                {
                mT__16(); 

                }
                break;
            case 8 :
                // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1:52: T__17
                {
                mT__17(); 

                }
                break;
            case 9 :
                // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1:58: T__18
                {
                mT__18(); 

                }
                break;
            case 10 :
                // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1:64: T__19
                {
                mT__19(); 

                }
                break;
            case 11 :
                // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1:70: T__20
                {
                mT__20(); 

                }
                break;
            case 12 :
                // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1:76: T__21
                {
                mT__21(); 

                }
                break;
            case 13 :
                // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1:82: T__22
                {
                mT__22(); 

                }
                break;
            case 14 :
                // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1:88: T__23
                {
                mT__23(); 

                }
                break;
            case 15 :
                // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1:94: T__24
                {
                mT__24(); 

                }
                break;
            case 16 :
                // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1:100: T__25
                {
                mT__25(); 

                }
                break;
            case 17 :
                // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1:106: T__26
                {
                mT__26(); 

                }
                break;
            case 18 :
                // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1:112: T__27
                {
                mT__27(); 

                }
                break;
            case 19 :
                // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1:118: T__28
                {
                mT__28(); 

                }
                break;
            case 20 :
                // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1:124: T__29
                {
                mT__29(); 

                }
                break;
            case 21 :
                // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1:130: T__30
                {
                mT__30(); 

                }
                break;
            case 22 :
                // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1:136: T__31
                {
                mT__31(); 

                }
                break;
            case 23 :
                // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1:142: T__32
                {
                mT__32(); 

                }
                break;
            case 24 :
                // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1:148: T__33
                {
                mT__33(); 

                }
                break;
            case 25 :
                // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1:154: T__34
                {
                mT__34(); 

                }
                break;
            case 26 :
                // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1:160: T__35
                {
                mT__35(); 

                }
                break;
            case 27 :
                // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1:166: T__36
                {
                mT__36(); 

                }
                break;
            case 28 :
                // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1:172: T__37
                {
                mT__37(); 

                }
                break;
            case 29 :
                // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1:178: T__38
                {
                mT__38(); 

                }
                break;
            case 30 :
                // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1:184: T__39
                {
                mT__39(); 

                }
                break;
            case 31 :
                // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1:190: T__40
                {
                mT__40(); 

                }
                break;
            case 32 :
                // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1:196: T__41
                {
                mT__41(); 

                }
                break;
            case 33 :
                // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1:202: T__42
                {
                mT__42(); 

                }
                break;
            case 34 :
                // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1:208: T__43
                {
                mT__43(); 

                }
                break;
            case 35 :
                // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1:214: T__44
                {
                mT__44(); 

                }
                break;
            case 36 :
                // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1:220: T__45
                {
                mT__45(); 

                }
                break;
            case 37 :
                // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1:226: T__46
                {
                mT__46(); 

                }
                break;
            case 38 :
                // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1:232: T__47
                {
                mT__47(); 

                }
                break;
            case 39 :
                // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1:238: T__48
                {
                mT__48(); 

                }
                break;
            case 40 :
                // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1:244: T__49
                {
                mT__49(); 

                }
                break;
            case 41 :
                // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1:250: T__50
                {
                mT__50(); 

                }
                break;
            case 42 :
                // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1:256: T__51
                {
                mT__51(); 

                }
                break;
            case 43 :
                // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1:262: T__52
                {
                mT__52(); 

                }
                break;
            case 44 :
                // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1:268: T__53
                {
                mT__53(); 

                }
                break;
            case 45 :
                // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1:274: T__54
                {
                mT__54(); 

                }
                break;
            case 46 :
                // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1:280: T__55
                {
                mT__55(); 

                }
                break;
            case 47 :
                // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1:286: T__56
                {
                mT__56(); 

                }
                break;
            case 48 :
                // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1:292: T__57
                {
                mT__57(); 

                }
                break;
            case 49 :
                // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1:298: T__58
                {
                mT__58(); 

                }
                break;
            case 50 :
                // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1:304: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 51 :
                // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1:312: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 52 :
                // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1:321: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 53 :
                // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1:329: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 54 :
                // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1:345: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 55 :
                // ../jkind.xtext/src-gen/jkind/xtext/parser/antlr/internal/InternalJKind.g:1:361: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA9 dfa9 = new DFA9(this);
    static final String DFA9_eotS =
        "\1\uffff\1\52\1\54\1\uffff\1\52\3\uffff\3\52\3\uffff\1\52\1\76"+
        "\2\52\2\uffff\4\52\1\112\1\114\2\uffff\1\120\2\52\1\uffff\2\52\4"+
        "\uffff\4\52\4\uffff\2\52\3\uffff\1\52\1\137\2\52\3\uffff\1\143\1"+
        "\144\1\146\2\uffff\2\52\2\uffff\5\52\11\uffff\2\52\1\uffff\2\52"+
        "\2\uffff\1\52\1\164\4\52\1\171\1\uffff\3\52\4\uffff\2\52\1\u0081"+
        "\1\u0082\1\u0083\1\52\1\u0085\1\u0086\1\u0087\1\u0088\2\52\1\u008b"+
        "\1\uffff\1\u008c\1\u008d\2\52\1\uffff\1\u0090\1\u0091\1\52\2\uffff"+
        "\1\52\1\u0094\3\uffff\1\52\4\uffff\1\u0096\1\52\3\uffff\2\52\2\uffff"+
        "\1\52\1\u009b\1\uffff\1\52\1\uffff\1\u009d\1\u009e\2\52\1\uffff"+
        "\1\u00a1\2\uffff\1\52\1\u00a3\1\uffff\1\u00a4\2\uffff";
    static final String DFA9_eofS =
        "\u00a5\uffff";
    static final String DFA9_minS =
        "\1\0\1\145\1\76\1\uffff\1\164\3\uffff\1\146\1\157\1\145\3\uffff"+
        "\1\146\1\55\2\157\2\uffff\1\141\1\145\1\156\1\157\2\75\2\uffff\1"+
        "\52\1\151\1\162\1\uffff\1\154\1\141\4\uffff\1\160\1\154\1\145\1"+
        "\165\4\uffff\1\162\1\142\3\uffff\1\164\1\60\1\157\1\141\3\uffff"+
        "\2\60\1\45\2\uffff\1\156\1\144\2\uffff\1\162\1\164\1\163\1\144\1"+
        "\162\11\uffff\1\166\1\145\1\uffff\1\163\1\154\2\uffff\1\145\1\60"+
        "\1\156\1\145\1\165\1\162\1\60\1\uffff\2\154\1\165\2\uffff\1\115"+
        "\1\uffff\1\163\1\145\3\60\1\145\4\60\1\145\1\163\1\60\1\uffff\2"+
        "\60\1\143\1\141\1\uffff\2\60\1\162\2\uffff\1\164\1\60\3\uffff\1"+
        "\162\4\uffff\1\60\1\145\3\uffff\1\164\1\156\2\uffff\1\156\1\60\1"+
        "\uffff\1\164\1\uffff\2\60\1\147\1\163\1\uffff\1\60\2\uffff\1\145"+
        "\1\60\1\uffff\1\60\2\uffff";
    static final String DFA9_maxS =
        "\1\uffff\1\171\1\76\1\uffff\1\165\3\uffff\1\156\1\157\1\145\3\uffff"+
        "\1\162\1\76\2\157\2\uffff\1\141\1\145\1\163\1\157\1\76\1\75\2\uffff"+
        "\1\52\1\151\1\162\1\uffff\1\154\1\141\4\uffff\1\160\1\154\1\145"+
        "\1\165\4\uffff\1\162\1\142\3\uffff\1\164\1\172\1\157\1\164\3\uffff"+
        "\2\172\1\45\2\uffff\1\156\1\164\2\uffff\1\162\1\164\1\163\1\144"+
        "\1\162\11\uffff\1\166\1\145\1\uffff\1\163\1\154\2\uffff\1\145\1"+
        "\172\1\156\1\145\1\165\1\162\1\172\1\uffff\2\154\1\165\2\uffff\1"+
        "\120\1\uffff\1\163\1\145\3\172\1\145\4\172\1\145\1\163\1\172\1\uffff"+
        "\2\172\1\143\1\141\1\uffff\2\172\1\162\2\uffff\1\164\1\172\3\uffff"+
        "\1\162\4\uffff\1\172\1\145\3\uffff\1\164\1\156\2\uffff\1\156\1\172"+
        "\1\uffff\1\164\1\uffff\2\172\1\147\1\163\1\uffff\1\172\2\uffff\1"+
        "\145\1\172\1\uffff\1\172\2\uffff";
    static final String DFA9_acceptS =
        "\3\uffff\1\3\1\uffff\1\5\1\6\1\7\3\uffff\1\14\1\15\1\16\4\uffff"+
        "\1\23\1\24\6\uffff\1\46\1\47\3\uffff\1\54\2\uffff\1\62\1\63\1\64"+
        "\1\67\4\uffff\1\62\1\35\1\2\1\3\2\uffff\1\5\1\6\1\7\4\uffff\1\14"+
        "\1\15\1\16\3\uffff\1\34\1\20\2\uffff\1\23\1\24\5\uffff\1\42\1\45"+
        "\1\41\1\44\1\43\1\46\1\47\1\66\1\50\2\uffff\1\54\2\uffff\1\63\1"+
        "\64\7\uffff\1\55\3\uffff\1\17\1\36\1\uffff\1\65\15\uffff\1\30\4"+
        "\uffff\1\10\3\uffff\1\31\1\32\2\uffff\1\52\1\26\1\27\1\uffff\1\40"+
        "\1\37\1\51\1\53\2\uffff\1\1\1\56\1\60\2\uffff\1\11\1\12\2\uffff"+
        "\1\22\1\uffff\1\57\4\uffff\1\21\1\uffff\1\61\1\4\2\uffff\1\33\1"+
        "\uffff\1\25\1\13";
    static final String DFA9_specialS =
        "\1\0\u00a4\uffff}>";
    static final String[] DFA9_transitionS = {
            "\11\45\2\44\2\45\1\44\22\45\1\44\7\45\1\22\1\23\1\33\1\32\1"+
            "\14\1\17\1\37\1\34\12\43\1\6\1\3\1\30\1\2\1\31\2\45\32\42\1"+
            "\13\1\45\1\15\1\45\1\42\1\45\1\26\1\11\1\20\1\35\1\40\1\41\2"+
            "\42\1\10\2\42\1\25\1\42\1\21\1\16\1\36\1\42\1\12\1\4\1\1\1\42"+
            "\1\24\1\42\1\27\2\42\1\5\1\45\1\7\uff82\45",
            "\1\47\2\uffff\1\50\11\uffff\1\51\6\uffff\1\46",
            "\1\53",
            "",
            "\1\56\1\57",
            "",
            "",
            "",
            "\1\64\7\uffff\1\63",
            "\1\65",
            "\1\66",
            "",
            "",
            "",
            "\1\72\13\uffff\1\73",
            "\1\74\20\uffff\1\75",
            "\1\77",
            "\1\100",
            "",
            "",
            "\1\103",
            "\1\104",
            "\1\106\4\uffff\1\105",
            "\1\107",
            "\1\110\1\111",
            "\1\113",
            "",
            "",
            "\1\117",
            "\1\121",
            "\1\122",
            "",
            "\1\124",
            "\1\125",
            "",
            "",
            "",
            "",
            "\1\130",
            "\1\131",
            "\1\132",
            "\1\133",
            "",
            "",
            "",
            "",
            "\1\134",
            "\1\135",
            "",
            "",
            "",
            "\1\136",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\140",
            "\1\141\22\uffff\1\142",
            "",
            "",
            "",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\145",
            "",
            "",
            "\1\147",
            "\1\150\17\uffff\1\151",
            "",
            "",
            "\1\152",
            "\1\153",
            "\1\154",
            "\1\155",
            "\1\156",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\157",
            "\1\160",
            "",
            "\1\161",
            "\1\162",
            "",
            "",
            "\1\163",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\165",
            "\1\166",
            "\1\167",
            "\1\170",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "",
            "\1\172",
            "\1\173",
            "\1\174",
            "",
            "",
            "\1\176\2\uffff\1\175",
            "",
            "\1\177",
            "\1\u0080",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\u0084",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\u0089",
            "\1\u008a",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\u008e",
            "\1\u008f",
            "",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\u0092",
            "",
            "",
            "\1\u0093",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "",
            "",
            "",
            "\1\u0095",
            "",
            "",
            "",
            "",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\u0097",
            "",
            "",
            "",
            "\1\u0098",
            "\1\u0099",
            "",
            "",
            "\1\u009a",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "",
            "\1\u009c",
            "",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\u009f",
            "\1\u00a0",
            "",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "",
            "",
            "\1\u00a2",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "",
            ""
    };

    static final short[] DFA9_eot = DFA.unpackEncodedString(DFA9_eotS);
    static final short[] DFA9_eof = DFA.unpackEncodedString(DFA9_eofS);
    static final char[] DFA9_min = DFA.unpackEncodedStringToUnsignedChars(DFA9_minS);
    static final char[] DFA9_max = DFA.unpackEncodedStringToUnsignedChars(DFA9_maxS);
    static final short[] DFA9_accept = DFA.unpackEncodedString(DFA9_acceptS);
    static final short[] DFA9_special = DFA.unpackEncodedString(DFA9_specialS);
    static final short[][] DFA9_transition;

    static {
        int numStates = DFA9_transitionS.length;
        DFA9_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA9_transition[i] = DFA.unpackEncodedString(DFA9_transitionS[i]);
        }
    }

    class DFA9 extends DFA {

        public DFA9(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 9;
            this.eot = DFA9_eot;
            this.eof = DFA9_eof;
            this.min = DFA9_min;
            this.max = DFA9_max;
            this.accept = DFA9_accept;
            this.special = DFA9_special;
            this.transition = DFA9_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__10 | T__11 | T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | RULE_ID | RULE_INT | RULE_WS | RULE_SL_COMMENT | RULE_ML_COMMENT | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA9_0 = input.LA(1);

                        s = -1;
                        if ( (LA9_0=='t') ) {s = 1;}

                        else if ( (LA9_0=='=') ) {s = 2;}

                        else if ( (LA9_0==';') ) {s = 3;}

                        else if ( (LA9_0=='s') ) {s = 4;}

                        else if ( (LA9_0=='{') ) {s = 5;}

                        else if ( (LA9_0==':') ) {s = 6;}

                        else if ( (LA9_0=='}') ) {s = 7;}

                        else if ( (LA9_0=='i') ) {s = 8;}

                        else if ( (LA9_0=='b') ) {s = 9;}

                        else if ( (LA9_0=='r') ) {s = 10;}

                        else if ( (LA9_0=='[') ) {s = 11;}

                        else if ( (LA9_0==',') ) {s = 12;}

                        else if ( (LA9_0==']') ) {s = 13;}

                        else if ( (LA9_0=='o') ) {s = 14;}

                        else if ( (LA9_0=='-') ) {s = 15;}

                        else if ( (LA9_0=='c') ) {s = 16;}

                        else if ( (LA9_0=='n') ) {s = 17;}

                        else if ( (LA9_0=='(') ) {s = 18;}

                        else if ( (LA9_0==')') ) {s = 19;}

                        else if ( (LA9_0=='v') ) {s = 20;}

                        else if ( (LA9_0=='l') ) {s = 21;}

                        else if ( (LA9_0=='a') ) {s = 22;}

                        else if ( (LA9_0=='x') ) {s = 23;}

                        else if ( (LA9_0=='<') ) {s = 24;}

                        else if ( (LA9_0=='>') ) {s = 25;}

                        else if ( (LA9_0=='+') ) {s = 26;}

                        else if ( (LA9_0=='*') ) {s = 27;}

                        else if ( (LA9_0=='/') ) {s = 28;}

                        else if ( (LA9_0=='d') ) {s = 29;}

                        else if ( (LA9_0=='p') ) {s = 30;}

                        else if ( (LA9_0=='.') ) {s = 31;}

                        else if ( (LA9_0=='e') ) {s = 32;}

                        else if ( (LA9_0=='f') ) {s = 33;}

                        else if ( ((LA9_0>='A' && LA9_0<='Z')||LA9_0=='_'||(LA9_0>='g' && LA9_0<='h')||(LA9_0>='j' && LA9_0<='k')||LA9_0=='m'||LA9_0=='q'||LA9_0=='u'||LA9_0=='w'||(LA9_0>='y' && LA9_0<='z')) ) {s = 34;}

                        else if ( ((LA9_0>='0' && LA9_0<='9')) ) {s = 35;}

                        else if ( ((LA9_0>='\t' && LA9_0<='\n')||LA9_0=='\r'||LA9_0==' ') ) {s = 36;}

                        else if ( ((LA9_0>='\u0000' && LA9_0<='\b')||(LA9_0>='\u000B' && LA9_0<='\f')||(LA9_0>='\u000E' && LA9_0<='\u001F')||(LA9_0>='!' && LA9_0<='\'')||(LA9_0>='?' && LA9_0<='@')||LA9_0=='\\'||LA9_0=='^'||LA9_0=='`'||LA9_0=='|'||(LA9_0>='~' && LA9_0<='\uFFFF')) ) {s = 37;}

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 9, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}