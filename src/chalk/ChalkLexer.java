// $ANTLR 3.2 Sep 23, 2009 12:02:23 /home/sivikt/!storage/_coding/_java/chalkc/grammar/Chalk.g 2011-02-19 15:33:12

	package chalk;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class ChalkLexer extends Lexer {
    public static final int LT=33;
    public static final int STAR=45;
    public static final int MOD=47;
    public static final int EXIT_TK=65;
    public static final int CONTINUE_TK=28;
    public static final int EOF=-1;
    public static final int LT_LT_EQ=16;
    public static final int T__93=93;
    public static final int LBRACKET=25;
    public static final int T__94=94;
    public static final int RPAREN=8;
    public static final int T__91=91;
    public static final int T__92=92;
    public static final int STRING_LITERAL=62;
    public static final int T__90=90;
    public static final int PLUS_PLUS=56;
    public static final int FLOATING_POINT_LITERAL=61;
    public static final int CARET=39;
    public static final int EQ=10;
    public static final int COMMENT=69;
    public static final int T__99=99;
    public static final int T__98=98;
    public static final int LT_LT=41;
    public static final int T__97=97;
    public static final int T__96=96;
    public static final int T__95=95;
    public static final int DEF_TK=5;
    public static final int SCREAMER_EQ=37;
    public static final int T__80=80;
    public static final int T__81=81;
    public static final int T__82=82;
    public static final int RBRACE=67;
    public static final int T__83=83;
    public static final int ELSE_TK=19;
    public static final int WHITESPACE=70;
    public static final int T__85=85;
    public static final int T__84=84;
    public static final int PLUS_EQ=13;
    public static final int MIN_TK=59;
    public static final int T__87=87;
    public static final int T__86=86;
    public static final int T__89=89;
    public static final int T__88=88;
    public static final int MINUS_EQ=14;
    public static final int READ_STRING=54;
    public static final int T__71=71;
    public static final int T__72=72;
    public static final int READ_FLOAT=53;
    public static final int GT=32;
    public static final int READ_BOOL=55;
    public static final int LT_EQ=34;
    public static final int READ_INT=52;
    public static final int ENTRY_TK=6;
    public static final int DO_TK=21;
    public static final int T__76=76;
    public static final int FALSE=64;
    public static final int T__75=75;
    public static final int STAR_STAR=51;
    public static final int T__74=74;
    public static final int T__73=73;
    public static final int DECIMAL_LITERAL=60;
    public static final int T__79=79;
    public static final int T__78=78;
    public static final int T__77=77;
    public static final int RSLASH=46;
    public static final int AMP_AMP=31;
    public static final int RETURN_TK=29;
    public static final int BAR_BAR=30;
    public static final int AMP=40;
    public static final int LBRACE=66;
    public static final int Exponent=68;
    public static final int ID=4;
    public static final int LPAREN=7;
    public static final int TILDE=49;
    public static final int MAX_TK=58;
    public static final int PLUS=43;
    public static final int GT_GT_EQ=15;
    public static final int RBRACKET=26;
    public static final int GT_EQ=35;
    public static final int UNTIL_TK=22;
    public static final int IF_TK=17;
    public static final int FOR_TK=23;
    public static final int END_TK=9;
    public static final int STAR_EQ=11;
    public static final int MINUS=44;
    public static final int TRUE=63;
    public static final int ELSIF_TK=18;
    public static final int BREAK_TK=27;
    public static final int RSLASH_EQ=12;
    public static final int WHILE_TK=20;
    public static final int IN_TK=24;
    public static final int SCREAMER=50;
    public static final int DIV=48;
    public static final int BAR=38;
    public static final int MINUS_MINUS=57;
    public static final int EQ_EQ=36;
    public static final int GT_GT=42;

    // delegates
    // delegators

    public ChalkLexer() {;} 
    public ChalkLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public ChalkLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "/home/sivikt/!storage/_coding/_java/chalkc/grammar/Chalk.g"; }

    // $ANTLR start "T__71"
    public final void mT__71() throws RecognitionException {
        try {
            int _type = T__71;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/sivikt/!storage/_coding/_java/chalkc/grammar/Chalk.g:7:7: ( ',' )
            // /home/sivikt/!storage/_coding/_java/chalkc/grammar/Chalk.g:7:9: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__71"

    // $ANTLR start "T__72"
    public final void mT__72() throws RecognitionException {
        try {
            int _type = T__72;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/sivikt/!storage/_coding/_java/chalkc/grammar/Chalk.g:8:7: ( ':' )
            // /home/sivikt/!storage/_coding/_java/chalkc/grammar/Chalk.g:8:9: ':'
            {
            match(':'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__72"

    // $ANTLR start "T__73"
    public final void mT__73() throws RecognitionException {
        try {
            int _type = T__73;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/sivikt/!storage/_coding/_java/chalkc/grammar/Chalk.g:9:7: ( 'print' )
            // /home/sivikt/!storage/_coding/_java/chalkc/grammar/Chalk.g:9:9: 'print'
            {
            match("print"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__73"

    // $ANTLR start "T__74"
    public final void mT__74() throws RecognitionException {
        try {
            int _type = T__74;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/sivikt/!storage/_coding/_java/chalkc/grammar/Chalk.g:10:7: ( 'println' )
            // /home/sivikt/!storage/_coding/_java/chalkc/grammar/Chalk.g:10:9: 'println'
            {
            match("println"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__74"

    // $ANTLR start "T__75"
    public final void mT__75() throws RecognitionException {
        try {
            int _type = T__75;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/sivikt/!storage/_coding/_java/chalkc/grammar/Chalk.g:11:7: ( 'CONST' )
            // /home/sivikt/!storage/_coding/_java/chalkc/grammar/Chalk.g:11:9: 'CONST'
            {
            match("CONST"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__75"

    // $ANTLR start "T__76"
    public final void mT__76() throws RecognitionException {
        try {
            int _type = T__76;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/sivikt/!storage/_coding/_java/chalkc/grammar/Chalk.g:12:7: ( '.' )
            // /home/sivikt/!storage/_coding/_java/chalkc/grammar/Chalk.g:12:9: '.'
            {
            match('.'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__76"

    // $ANTLR start "T__77"
    public final void mT__77() throws RecognitionException {
        try {
            int _type = T__77;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/sivikt/!storage/_coding/_java/chalkc/grammar/Chalk.g:13:7: ( 'pi' )
            // /home/sivikt/!storage/_coding/_java/chalkc/grammar/Chalk.g:13:9: 'pi'
            {
            match("pi"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__77"

    // $ANTLR start "T__78"
    public final void mT__78() throws RecognitionException {
        try {
            int _type = T__78;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/sivikt/!storage/_coding/_java/chalkc/grammar/Chalk.g:14:7: ( 'e' )
            // /home/sivikt/!storage/_coding/_java/chalkc/grammar/Chalk.g:14:9: 'e'
            {
            match('e'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__78"

    // $ANTLR start "T__79"
    public final void mT__79() throws RecognitionException {
        try {
            int _type = T__79;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/sivikt/!storage/_coding/_java/chalkc/grammar/Chalk.g:15:7: ( 'Float' )
            // /home/sivikt/!storage/_coding/_java/chalkc/grammar/Chalk.g:15:9: 'Float'
            {
            match("Float"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__79"

    // $ANTLR start "T__80"
    public final void mT__80() throws RecognitionException {
        try {
            int _type = T__80;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/sivikt/!storage/_coding/_java/chalkc/grammar/Chalk.g:16:7: ( 'MAX_VALUE' )
            // /home/sivikt/!storage/_coding/_java/chalkc/grammar/Chalk.g:16:9: 'MAX_VALUE'
            {
            match("MAX_VALUE"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__80"

    // $ANTLR start "T__81"
    public final void mT__81() throws RecognitionException {
        try {
            int _type = T__81;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/sivikt/!storage/_coding/_java/chalkc/grammar/Chalk.g:17:7: ( 'MIN_VALUE' )
            // /home/sivikt/!storage/_coding/_java/chalkc/grammar/Chalk.g:17:9: 'MIN_VALUE'
            {
            match("MIN_VALUE"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__81"

    // $ANTLR start "T__82"
    public final void mT__82() throws RecognitionException {
        try {
            int _type = T__82;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/sivikt/!storage/_coding/_java/chalkc/grammar/Chalk.g:18:7: ( 'NEGATIVE_INFINITY' )
            // /home/sivikt/!storage/_coding/_java/chalkc/grammar/Chalk.g:18:9: 'NEGATIVE_INFINITY'
            {
            match("NEGATIVE_INFINITY"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__82"

    // $ANTLR start "T__83"
    public final void mT__83() throws RecognitionException {
        try {
            int _type = T__83;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/sivikt/!storage/_coding/_java/chalkc/grammar/Chalk.g:19:7: ( 'POSITIVE_INFINITY' )
            // /home/sivikt/!storage/_coding/_java/chalkc/grammar/Chalk.g:19:9: 'POSITIVE_INFINITY'
            {
            match("POSITIVE_INFINITY"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__83"

    // $ANTLR start "T__84"
    public final void mT__84() throws RecognitionException {
        try {
            int _type = T__84;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/sivikt/!storage/_coding/_java/chalkc/grammar/Chalk.g:20:7: ( 'NaN' )
            // /home/sivikt/!storage/_coding/_java/chalkc/grammar/Chalk.g:20:9: 'NaN'
            {
            match("NaN"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__84"

    // $ANTLR start "T__85"
    public final void mT__85() throws RecognitionException {
        try {
            int _type = T__85;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/sivikt/!storage/_coding/_java/chalkc/grammar/Chalk.g:21:7: ( 'Int' )
            // /home/sivikt/!storage/_coding/_java/chalkc/grammar/Chalk.g:21:9: 'Int'
            {
            match("Int"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__85"

    // $ANTLR start "T__86"
    public final void mT__86() throws RecognitionException {
        try {
            int _type = T__86;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/sivikt/!storage/_coding/_java/chalkc/grammar/Chalk.g:22:7: ( 'sin' )
            // /home/sivikt/!storage/_coding/_java/chalkc/grammar/Chalk.g:22:9: 'sin'
            {
            match("sin"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__86"

    // $ANTLR start "T__87"
    public final void mT__87() throws RecognitionException {
        try {
            int _type = T__87;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/sivikt/!storage/_coding/_java/chalkc/grammar/Chalk.g:23:7: ( 'cos' )
            // /home/sivikt/!storage/_coding/_java/chalkc/grammar/Chalk.g:23:9: 'cos'
            {
            match("cos"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__87"

    // $ANTLR start "T__88"
    public final void mT__88() throws RecognitionException {
        try {
            int _type = T__88;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/sivikt/!storage/_coding/_java/chalkc/grammar/Chalk.g:24:7: ( 'tan' )
            // /home/sivikt/!storage/_coding/_java/chalkc/grammar/Chalk.g:24:9: 'tan'
            {
            match("tan"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__88"

    // $ANTLR start "T__89"
    public final void mT__89() throws RecognitionException {
        try {
            int _type = T__89;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/sivikt/!storage/_coding/_java/chalkc/grammar/Chalk.g:25:7: ( 'asin' )
            // /home/sivikt/!storage/_coding/_java/chalkc/grammar/Chalk.g:25:9: 'asin'
            {
            match("asin"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__89"

    // $ANTLR start "T__90"
    public final void mT__90() throws RecognitionException {
        try {
            int _type = T__90;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/sivikt/!storage/_coding/_java/chalkc/grammar/Chalk.g:26:7: ( 'acos' )
            // /home/sivikt/!storage/_coding/_java/chalkc/grammar/Chalk.g:26:9: 'acos'
            {
            match("acos"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__90"

    // $ANTLR start "T__91"
    public final void mT__91() throws RecognitionException {
        try {
            int _type = T__91;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/sivikt/!storage/_coding/_java/chalkc/grammar/Chalk.g:27:7: ( 'atan' )
            // /home/sivikt/!storage/_coding/_java/chalkc/grammar/Chalk.g:27:9: 'atan'
            {
            match("atan"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__91"

    // $ANTLR start "T__92"
    public final void mT__92() throws RecognitionException {
        try {
            int _type = T__92;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/sivikt/!storage/_coding/_java/chalkc/grammar/Chalk.g:28:7: ( 'lg' )
            // /home/sivikt/!storage/_coding/_java/chalkc/grammar/Chalk.g:28:9: 'lg'
            {
            match("lg"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__92"

    // $ANTLR start "T__93"
    public final void mT__93() throws RecognitionException {
        try {
            int _type = T__93;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/sivikt/!storage/_coding/_java/chalkc/grammar/Chalk.g:29:7: ( 'ln' )
            // /home/sivikt/!storage/_coding/_java/chalkc/grammar/Chalk.g:29:9: 'ln'
            {
            match("ln"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__93"

    // $ANTLR start "T__94"
    public final void mT__94() throws RecognitionException {
        try {
            int _type = T__94;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/sivikt/!storage/_coding/_java/chalkc/grammar/Chalk.g:30:7: ( 'sqrt' )
            // /home/sivikt/!storage/_coding/_java/chalkc/grammar/Chalk.g:30:9: 'sqrt'
            {
            match("sqrt"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__94"

    // $ANTLR start "T__95"
    public final void mT__95() throws RecognitionException {
        try {
            int _type = T__95;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/sivikt/!storage/_coding/_java/chalkc/grammar/Chalk.g:31:7: ( 'swaps' )
            // /home/sivikt/!storage/_coding/_java/chalkc/grammar/Chalk.g:31:9: 'swaps'
            {
            match("swaps"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__95"

    // $ANTLR start "T__96"
    public final void mT__96() throws RecognitionException {
        try {
            int _type = T__96;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/sivikt/!storage/_coding/_java/chalkc/grammar/Chalk.g:32:7: ( 'swapv' )
            // /home/sivikt/!storage/_coding/_java/chalkc/grammar/Chalk.g:32:9: 'swapv'
            {
            match("swapv"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__96"

    // $ANTLR start "T__97"
    public final void mT__97() throws RecognitionException {
        try {
            int _type = T__97;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/sivikt/!storage/_coding/_java/chalkc/grammar/Chalk.g:33:7: ( 'log' )
            // /home/sivikt/!storage/_coding/_java/chalkc/grammar/Chalk.g:33:9: 'log'
            {
            match("log"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__97"

    // $ANTLR start "T__98"
    public final void mT__98() throws RecognitionException {
        try {
            int _type = T__98;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/sivikt/!storage/_coding/_java/chalkc/grammar/Chalk.g:34:7: ( 'String' )
            // /home/sivikt/!storage/_coding/_java/chalkc/grammar/Chalk.g:34:9: 'String'
            {
            match("String"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__98"

    // $ANTLR start "T__99"
    public final void mT__99() throws RecognitionException {
        try {
            int _type = T__99;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/sivikt/!storage/_coding/_java/chalkc/grammar/Chalk.g:35:7: ( 'Bool' )
            // /home/sivikt/!storage/_coding/_java/chalkc/grammar/Chalk.g:35:9: 'Bool'
            {
            match("Bool"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__99"

    // $ANTLR start "FALSE"
    public final void mFALSE() throws RecognitionException {
        try {
            int _type = FALSE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/sivikt/!storage/_coding/_java/chalkc/grammar/Chalk.g:1286:2: ( 'false' )
            // /home/sivikt/!storage/_coding/_java/chalkc/grammar/Chalk.g:1286:4: 'false'
            {
            match("false"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "FALSE"

    // $ANTLR start "TRUE"
    public final void mTRUE() throws RecognitionException {
        try {
            int _type = TRUE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/sivikt/!storage/_coding/_java/chalkc/grammar/Chalk.g:1289:2: ( 'true' )
            // /home/sivikt/!storage/_coding/_java/chalkc/grammar/Chalk.g:1289:4: 'true'
            {
            match("true"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "TRUE"

    // $ANTLR start "DEF_TK"
    public final void mDEF_TK() throws RecognitionException {
        try {
            int _type = DEF_TK;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/sivikt/!storage/_coding/_java/chalkc/grammar/Chalk.g:1292:2: ( 'def' )
            // /home/sivikt/!storage/_coding/_java/chalkc/grammar/Chalk.g:1292:4: 'def'
            {
            match("def"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "DEF_TK"

    // $ANTLR start "ENTRY_TK"
    public final void mENTRY_TK() throws RecognitionException {
        try {
            int _type = ENTRY_TK;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/sivikt/!storage/_coding/_java/chalkc/grammar/Chalk.g:1295:2: ( 'entry' )
            // /home/sivikt/!storage/_coding/_java/chalkc/grammar/Chalk.g:1295:4: 'entry'
            {
            match("entry"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ENTRY_TK"

    // $ANTLR start "END_TK"
    public final void mEND_TK() throws RecognitionException {
        try {
            int _type = END_TK;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/sivikt/!storage/_coding/_java/chalkc/grammar/Chalk.g:1298:2: ( 'end' )
            // /home/sivikt/!storage/_coding/_java/chalkc/grammar/Chalk.g:1298:4: 'end'
            {
            match("end"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "END_TK"

    // $ANTLR start "IF_TK"
    public final void mIF_TK() throws RecognitionException {
        try {
            int _type = IF_TK;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/sivikt/!storage/_coding/_java/chalkc/grammar/Chalk.g:1301:2: ( 'if' )
            // /home/sivikt/!storage/_coding/_java/chalkc/grammar/Chalk.g:1301:4: 'if'
            {
            match("if"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "IF_TK"

    // $ANTLR start "ELSIF_TK"
    public final void mELSIF_TK() throws RecognitionException {
        try {
            int _type = ELSIF_TK;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/sivikt/!storage/_coding/_java/chalkc/grammar/Chalk.g:1304:2: ( 'elsif' )
            // /home/sivikt/!storage/_coding/_java/chalkc/grammar/Chalk.g:1304:4: 'elsif'
            {
            match("elsif"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ELSIF_TK"

    // $ANTLR start "ELSE_TK"
    public final void mELSE_TK() throws RecognitionException {
        try {
            int _type = ELSE_TK;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/sivikt/!storage/_coding/_java/chalkc/grammar/Chalk.g:1307:2: ( 'else' )
            // /home/sivikt/!storage/_coding/_java/chalkc/grammar/Chalk.g:1307:4: 'else'
            {
            match("else"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ELSE_TK"

    // $ANTLR start "WHILE_TK"
    public final void mWHILE_TK() throws RecognitionException {
        try {
            int _type = WHILE_TK;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/sivikt/!storage/_coding/_java/chalkc/grammar/Chalk.g:1310:2: ( 'while' )
            // /home/sivikt/!storage/_coding/_java/chalkc/grammar/Chalk.g:1310:4: 'while'
            {
            match("while"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "WHILE_TK"

    // $ANTLR start "DO_TK"
    public final void mDO_TK() throws RecognitionException {
        try {
            int _type = DO_TK;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/sivikt/!storage/_coding/_java/chalkc/grammar/Chalk.g:1313:2: ( 'do' )
            // /home/sivikt/!storage/_coding/_java/chalkc/grammar/Chalk.g:1313:4: 'do'
            {
            match("do"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "DO_TK"

    // $ANTLR start "UNTIL_TK"
    public final void mUNTIL_TK() throws RecognitionException {
        try {
            int _type = UNTIL_TK;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/sivikt/!storage/_coding/_java/chalkc/grammar/Chalk.g:1316:2: ( 'until' )
            // /home/sivikt/!storage/_coding/_java/chalkc/grammar/Chalk.g:1316:4: 'until'
            {
            match("until"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "UNTIL_TK"

    // $ANTLR start "FOR_TK"
    public final void mFOR_TK() throws RecognitionException {
        try {
            int _type = FOR_TK;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/sivikt/!storage/_coding/_java/chalkc/grammar/Chalk.g:1319:2: ( 'for' )
            // /home/sivikt/!storage/_coding/_java/chalkc/grammar/Chalk.g:1319:4: 'for'
            {
            match("for"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "FOR_TK"

    // $ANTLR start "IN_TK"
    public final void mIN_TK() throws RecognitionException {
        try {
            int _type = IN_TK;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/sivikt/!storage/_coding/_java/chalkc/grammar/Chalk.g:1322:2: ( 'in' )
            // /home/sivikt/!storage/_coding/_java/chalkc/grammar/Chalk.g:1322:4: 'in'
            {
            match("in"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "IN_TK"

    // $ANTLR start "BREAK_TK"
    public final void mBREAK_TK() throws RecognitionException {
        try {
            int _type = BREAK_TK;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/sivikt/!storage/_coding/_java/chalkc/grammar/Chalk.g:1325:2: ( 'break' )
            // /home/sivikt/!storage/_coding/_java/chalkc/grammar/Chalk.g:1325:4: 'break'
            {
            match("break"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "BREAK_TK"

    // $ANTLR start "CONTINUE_TK"
    public final void mCONTINUE_TK() throws RecognitionException {
        try {
            int _type = CONTINUE_TK;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/sivikt/!storage/_coding/_java/chalkc/grammar/Chalk.g:1328:2: ( 'continue' )
            // /home/sivikt/!storage/_coding/_java/chalkc/grammar/Chalk.g:1328:4: 'continue'
            {
            match("continue"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "CONTINUE_TK"

    // $ANTLR start "RETURN_TK"
    public final void mRETURN_TK() throws RecognitionException {
        try {
            int _type = RETURN_TK;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/sivikt/!storage/_coding/_java/chalkc/grammar/Chalk.g:1331:2: ( 'return' )
            // /home/sivikt/!storage/_coding/_java/chalkc/grammar/Chalk.g:1331:4: 'return'
            {
            match("return"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RETURN_TK"

    // $ANTLR start "EXIT_TK"
    public final void mEXIT_TK() throws RecognitionException {
        try {
            int _type = EXIT_TK;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/sivikt/!storage/_coding/_java/chalkc/grammar/Chalk.g:1334:2: ( 'exit' )
            // /home/sivikt/!storage/_coding/_java/chalkc/grammar/Chalk.g:1334:4: 'exit'
            {
            match("exit"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "EXIT_TK"

    // $ANTLR start "PLUS"
    public final void mPLUS() throws RecognitionException {
        try {
            int _type = PLUS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/sivikt/!storage/_coding/_java/chalkc/grammar/Chalk.g:1337:2: ( '+' )
            // /home/sivikt/!storage/_coding/_java/chalkc/grammar/Chalk.g:1337:4: '+'
            {
            match('+'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "PLUS"

    // $ANTLR start "PLUS_PLUS"
    public final void mPLUS_PLUS() throws RecognitionException {
        try {
            int _type = PLUS_PLUS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/sivikt/!storage/_coding/_java/chalkc/grammar/Chalk.g:1340:2: ( '++' )
            // /home/sivikt/!storage/_coding/_java/chalkc/grammar/Chalk.g:1340:4: '++'
            {
            match("++"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "PLUS_PLUS"

    // $ANTLR start "MINUS"
    public final void mMINUS() throws RecognitionException {
        try {
            int _type = MINUS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/sivikt/!storage/_coding/_java/chalkc/grammar/Chalk.g:1343:2: ( '-' )
            // /home/sivikt/!storage/_coding/_java/chalkc/grammar/Chalk.g:1343:4: '-'
            {
            match('-'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "MINUS"

    // $ANTLR start "MINUS_MINUS"
    public final void mMINUS_MINUS() throws RecognitionException {
        try {
            int _type = MINUS_MINUS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/sivikt/!storage/_coding/_java/chalkc/grammar/Chalk.g:1346:2: ( '--' )
            // /home/sivikt/!storage/_coding/_java/chalkc/grammar/Chalk.g:1346:4: '--'
            {
            match("--"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "MINUS_MINUS"

    // $ANTLR start "TILDE"
    public final void mTILDE() throws RecognitionException {
        try {
            int _type = TILDE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/sivikt/!storage/_coding/_java/chalkc/grammar/Chalk.g:1349:2: ( '~' )
            // /home/sivikt/!storage/_coding/_java/chalkc/grammar/Chalk.g:1349:4: '~'
            {
            match('~'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "TILDE"

    // $ANTLR start "SCREAMER"
    public final void mSCREAMER() throws RecognitionException {
        try {
            int _type = SCREAMER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/sivikt/!storage/_coding/_java/chalkc/grammar/Chalk.g:1352:2: ( '!' )
            // /home/sivikt/!storage/_coding/_java/chalkc/grammar/Chalk.g:1352:4: '!'
            {
            match('!'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "SCREAMER"

    // $ANTLR start "STAR"
    public final void mSTAR() throws RecognitionException {
        try {
            int _type = STAR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/sivikt/!storage/_coding/_java/chalkc/grammar/Chalk.g:1355:2: ( '*' )
            // /home/sivikt/!storage/_coding/_java/chalkc/grammar/Chalk.g:1355:4: '*'
            {
            match('*'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "STAR"

    // $ANTLR start "STAR_STAR"
    public final void mSTAR_STAR() throws RecognitionException {
        try {
            int _type = STAR_STAR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/sivikt/!storage/_coding/_java/chalkc/grammar/Chalk.g:1358:2: ( '**' )
            // /home/sivikt/!storage/_coding/_java/chalkc/grammar/Chalk.g:1358:4: '**'
            {
            match("**"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "STAR_STAR"

    // $ANTLR start "RSLASH"
    public final void mRSLASH() throws RecognitionException {
        try {
            int _type = RSLASH;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/sivikt/!storage/_coding/_java/chalkc/grammar/Chalk.g:1361:2: ( '/' )
            // /home/sivikt/!storage/_coding/_java/chalkc/grammar/Chalk.g:1361:4: '/'
            {
            match('/'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RSLASH"

    // $ANTLR start "DIV"
    public final void mDIV() throws RecognitionException {
        try {
            int _type = DIV;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/sivikt/!storage/_coding/_java/chalkc/grammar/Chalk.g:1364:2: ( 'div' )
            // /home/sivikt/!storage/_coding/_java/chalkc/grammar/Chalk.g:1364:4: 'div'
            {
            match("div"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "DIV"

    // $ANTLR start "MOD"
    public final void mMOD() throws RecognitionException {
        try {
            int _type = MOD;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/sivikt/!storage/_coding/_java/chalkc/grammar/Chalk.g:1367:2: ( 'mod' )
            // /home/sivikt/!storage/_coding/_java/chalkc/grammar/Chalk.g:1367:4: 'mod'
            {
            match("mod"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "MOD"

    // $ANTLR start "GT"
    public final void mGT() throws RecognitionException {
        try {
            int _type = GT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/sivikt/!storage/_coding/_java/chalkc/grammar/Chalk.g:1370:5: ( '>' )
            // /home/sivikt/!storage/_coding/_java/chalkc/grammar/Chalk.g:1370:9: '>'
            {
            match('>'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "GT"

    // $ANTLR start "GT_GT"
    public final void mGT_GT() throws RecognitionException {
        try {
            int _type = GT_GT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/sivikt/!storage/_coding/_java/chalkc/grammar/Chalk.g:1373:5: ( '>>' )
            // /home/sivikt/!storage/_coding/_java/chalkc/grammar/Chalk.g:1373:9: '>>'
            {
            match(">>"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "GT_GT"

    // $ANTLR start "GT_GT_EQ"
    public final void mGT_GT_EQ() throws RecognitionException {
        try {
            int _type = GT_GT_EQ;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/sivikt/!storage/_coding/_java/chalkc/grammar/Chalk.g:1376:5: ( '>>=' )
            // /home/sivikt/!storage/_coding/_java/chalkc/grammar/Chalk.g:1376:9: '>>='
            {
            match(">>="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "GT_GT_EQ"

    // $ANTLR start "LT"
    public final void mLT() throws RecognitionException {
        try {
            int _type = LT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/sivikt/!storage/_coding/_java/chalkc/grammar/Chalk.g:1379:5: ( '<' )
            // /home/sivikt/!storage/_coding/_java/chalkc/grammar/Chalk.g:1379:9: '<'
            {
            match('<'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "LT"

    // $ANTLR start "LT_LT"
    public final void mLT_LT() throws RecognitionException {
        try {
            int _type = LT_LT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/sivikt/!storage/_coding/_java/chalkc/grammar/Chalk.g:1382:5: ( '<<' )
            // /home/sivikt/!storage/_coding/_java/chalkc/grammar/Chalk.g:1382:9: '<<'
            {
            match("<<"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "LT_LT"

    // $ANTLR start "LT_LT_EQ"
    public final void mLT_LT_EQ() throws RecognitionException {
        try {
            int _type = LT_LT_EQ;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/sivikt/!storage/_coding/_java/chalkc/grammar/Chalk.g:1385:5: ( '<<=' )
            // /home/sivikt/!storage/_coding/_java/chalkc/grammar/Chalk.g:1385:9: '<<='
            {
            match("<<="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "LT_LT_EQ"

    // $ANTLR start "LT_EQ"
    public final void mLT_EQ() throws RecognitionException {
        try {
            int _type = LT_EQ;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/sivikt/!storage/_coding/_java/chalkc/grammar/Chalk.g:1388:5: ( '<=' )
            // /home/sivikt/!storage/_coding/_java/chalkc/grammar/Chalk.g:1388:9: '<='
            {
            match("<="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "LT_EQ"

    // $ANTLR start "GT_EQ"
    public final void mGT_EQ() throws RecognitionException {
        try {
            int _type = GT_EQ;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/sivikt/!storage/_coding/_java/chalkc/grammar/Chalk.g:1391:5: ( '>=' )
            // /home/sivikt/!storage/_coding/_java/chalkc/grammar/Chalk.g:1391:9: '>='
            {
            match(">="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "GT_EQ"

    // $ANTLR start "EQ"
    public final void mEQ() throws RecognitionException {
        try {
            int _type = EQ;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/sivikt/!storage/_coding/_java/chalkc/grammar/Chalk.g:1394:2: ( '=' )
            // /home/sivikt/!storage/_coding/_java/chalkc/grammar/Chalk.g:1394:4: '='
            {
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "EQ"

    // $ANTLR start "EQ_EQ"
    public final void mEQ_EQ() throws RecognitionException {
        try {
            int _type = EQ_EQ;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/sivikt/!storage/_coding/_java/chalkc/grammar/Chalk.g:1397:2: ( '==' )
            // /home/sivikt/!storage/_coding/_java/chalkc/grammar/Chalk.g:1397:4: '=='
            {
            match("=="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "EQ_EQ"

    // $ANTLR start "SCREAMER_EQ"
    public final void mSCREAMER_EQ() throws RecognitionException {
        try {
            int _type = SCREAMER_EQ;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/sivikt/!storage/_coding/_java/chalkc/grammar/Chalk.g:1400:2: ( '!=' )
            // /home/sivikt/!storage/_coding/_java/chalkc/grammar/Chalk.g:1400:4: '!='
            {
            match("!="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "SCREAMER_EQ"

    // $ANTLR start "PLUS_EQ"
    public final void mPLUS_EQ() throws RecognitionException {
        try {
            int _type = PLUS_EQ;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/sivikt/!storage/_coding/_java/chalkc/grammar/Chalk.g:1403:2: ( '+=' )
            // /home/sivikt/!storage/_coding/_java/chalkc/grammar/Chalk.g:1403:4: '+='
            {
            match("+="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "PLUS_EQ"

    // $ANTLR start "MINUS_EQ"
    public final void mMINUS_EQ() throws RecognitionException {
        try {
            int _type = MINUS_EQ;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/sivikt/!storage/_coding/_java/chalkc/grammar/Chalk.g:1406:2: ( '-=' )
            // /home/sivikt/!storage/_coding/_java/chalkc/grammar/Chalk.g:1406:4: '-='
            {
            match("-="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "MINUS_EQ"

    // $ANTLR start "STAR_EQ"
    public final void mSTAR_EQ() throws RecognitionException {
        try {
            int _type = STAR_EQ;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/sivikt/!storage/_coding/_java/chalkc/grammar/Chalk.g:1409:2: ( '*=' )
            // /home/sivikt/!storage/_coding/_java/chalkc/grammar/Chalk.g:1409:4: '*='
            {
            match("*="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "STAR_EQ"

    // $ANTLR start "RSLASH_EQ"
    public final void mRSLASH_EQ() throws RecognitionException {
        try {
            int _type = RSLASH_EQ;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/sivikt/!storage/_coding/_java/chalkc/grammar/Chalk.g:1412:2: ( '/=' )
            // /home/sivikt/!storage/_coding/_java/chalkc/grammar/Chalk.g:1412:4: '/='
            {
            match("/="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RSLASH_EQ"

    // $ANTLR start "BAR"
    public final void mBAR() throws RecognitionException {
        try {
            int _type = BAR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/sivikt/!storage/_coding/_java/chalkc/grammar/Chalk.g:1415:2: ( '|' )
            // /home/sivikt/!storage/_coding/_java/chalkc/grammar/Chalk.g:1415:4: '|'
            {
            match('|'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "BAR"

    // $ANTLR start "BAR_BAR"
    public final void mBAR_BAR() throws RecognitionException {
        try {
            int _type = BAR_BAR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/sivikt/!storage/_coding/_java/chalkc/grammar/Chalk.g:1418:2: ( '||' )
            // /home/sivikt/!storage/_coding/_java/chalkc/grammar/Chalk.g:1418:4: '||'
            {
            match("||"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "BAR_BAR"

    // $ANTLR start "AMP"
    public final void mAMP() throws RecognitionException {
        try {
            int _type = AMP;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/sivikt/!storage/_coding/_java/chalkc/grammar/Chalk.g:1421:2: ( '&' )
            // /home/sivikt/!storage/_coding/_java/chalkc/grammar/Chalk.g:1421:4: '&'
            {
            match('&'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "AMP"

    // $ANTLR start "AMP_AMP"
    public final void mAMP_AMP() throws RecognitionException {
        try {
            int _type = AMP_AMP;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/sivikt/!storage/_coding/_java/chalkc/grammar/Chalk.g:1424:2: ( '&&' )
            // /home/sivikt/!storage/_coding/_java/chalkc/grammar/Chalk.g:1424:4: '&&'
            {
            match("&&"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "AMP_AMP"

    // $ANTLR start "CARET"
    public final void mCARET() throws RecognitionException {
        try {
            int _type = CARET;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/sivikt/!storage/_coding/_java/chalkc/grammar/Chalk.g:1427:5: ( '^' )
            // /home/sivikt/!storage/_coding/_java/chalkc/grammar/Chalk.g:1427:9: '^'
            {
            match('^'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "CARET"

    // $ANTLR start "LPAREN"
    public final void mLPAREN() throws RecognitionException {
        try {
            int _type = LPAREN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/sivikt/!storage/_coding/_java/chalkc/grammar/Chalk.g:1430:5: ( '(' )
            // /home/sivikt/!storage/_coding/_java/chalkc/grammar/Chalk.g:1430:9: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "LPAREN"

    // $ANTLR start "RPAREN"
    public final void mRPAREN() throws RecognitionException {
        try {
            int _type = RPAREN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/sivikt/!storage/_coding/_java/chalkc/grammar/Chalk.g:1433:5: ( ')' )
            // /home/sivikt/!storage/_coding/_java/chalkc/grammar/Chalk.g:1433:9: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RPAREN"

    // $ANTLR start "LBRACE"
    public final void mLBRACE() throws RecognitionException {
        try {
            int _type = LBRACE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/sivikt/!storage/_coding/_java/chalkc/grammar/Chalk.g:1436:5: ( '{' )
            // /home/sivikt/!storage/_coding/_java/chalkc/grammar/Chalk.g:1436:9: '{'
            {
            match('{'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "LBRACE"

    // $ANTLR start "RBRACE"
    public final void mRBRACE() throws RecognitionException {
        try {
            int _type = RBRACE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/sivikt/!storage/_coding/_java/chalkc/grammar/Chalk.g:1439:5: ( '}' )
            // /home/sivikt/!storage/_coding/_java/chalkc/grammar/Chalk.g:1439:9: '}'
            {
            match('}'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RBRACE"

    // $ANTLR start "LBRACKET"
    public final void mLBRACKET() throws RecognitionException {
        try {
            int _type = LBRACKET;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/sivikt/!storage/_coding/_java/chalkc/grammar/Chalk.g:1442:5: ( '[' )
            // /home/sivikt/!storage/_coding/_java/chalkc/grammar/Chalk.g:1442:9: '['
            {
            match('['); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "LBRACKET"

    // $ANTLR start "RBRACKET"
    public final void mRBRACKET() throws RecognitionException {
        try {
            int _type = RBRACKET;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/sivikt/!storage/_coding/_java/chalkc/grammar/Chalk.g:1445:5: ( ']' )
            // /home/sivikt/!storage/_coding/_java/chalkc/grammar/Chalk.g:1445:9: ']'
            {
            match(']'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RBRACKET"

    // $ANTLR start "MAX_TK"
    public final void mMAX_TK() throws RecognitionException {
        try {
            int _type = MAX_TK;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/sivikt/!storage/_coding/_java/chalkc/grammar/Chalk.g:1448:2: ( 'max' )
            // /home/sivikt/!storage/_coding/_java/chalkc/grammar/Chalk.g:1448:4: 'max'
            {
            match("max"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "MAX_TK"

    // $ANTLR start "MIN_TK"
    public final void mMIN_TK() throws RecognitionException {
        try {
            int _type = MIN_TK;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/sivikt/!storage/_coding/_java/chalkc/grammar/Chalk.g:1451:2: ( 'min' )
            // /home/sivikt/!storage/_coding/_java/chalkc/grammar/Chalk.g:1451:4: 'min'
            {
            match("min"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "MIN_TK"

    // $ANTLR start "READ_INT"
    public final void mREAD_INT() throws RecognitionException {
        try {
            int _type = READ_INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/sivikt/!storage/_coding/_java/chalkc/grammar/Chalk.g:1454:2: ( 'readInt' )
            // /home/sivikt/!storage/_coding/_java/chalkc/grammar/Chalk.g:1454:4: 'readInt'
            {
            match("readInt"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "READ_INT"

    // $ANTLR start "READ_FLOAT"
    public final void mREAD_FLOAT() throws RecognitionException {
        try {
            int _type = READ_FLOAT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/sivikt/!storage/_coding/_java/chalkc/grammar/Chalk.g:1457:2: ( 'readFloat' )
            // /home/sivikt/!storage/_coding/_java/chalkc/grammar/Chalk.g:1457:4: 'readFloat'
            {
            match("readFloat"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "READ_FLOAT"

    // $ANTLR start "READ_STRING"
    public final void mREAD_STRING() throws RecognitionException {
        try {
            int _type = READ_STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/sivikt/!storage/_coding/_java/chalkc/grammar/Chalk.g:1460:2: ( 'readString' )
            // /home/sivikt/!storage/_coding/_java/chalkc/grammar/Chalk.g:1460:4: 'readString'
            {
            match("readString"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "READ_STRING"

    // $ANTLR start "READ_BOOL"
    public final void mREAD_BOOL() throws RecognitionException {
        try {
            int _type = READ_BOOL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/sivikt/!storage/_coding/_java/chalkc/grammar/Chalk.g:1463:2: ( 'readBool' )
            // /home/sivikt/!storage/_coding/_java/chalkc/grammar/Chalk.g:1463:4: 'readBool'
            {
            match("readBool"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "READ_BOOL"

    // $ANTLR start "ID"
    public final void mID() throws RecognitionException {
        try {
            int _type = ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/sivikt/!storage/_coding/_java/chalkc/grammar/Chalk.g:1466:2: ( ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )* )
            // /home/sivikt/!storage/_coding/_java/chalkc/grammar/Chalk.g:1466:5: ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )*
            {
            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // /home/sivikt/!storage/_coding/_java/chalkc/grammar/Chalk.g:1466:35: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>='0' && LA1_0<='9')||(LA1_0>='A' && LA1_0<='Z')||LA1_0=='_'||(LA1_0>='a' && LA1_0<='z')) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // /home/sivikt/!storage/_coding/_java/chalkc/grammar/Chalk.g:
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
    // $ANTLR end "ID"

    // $ANTLR start "STRING_LITERAL"
    public final void mSTRING_LITERAL() throws RecognitionException {
        try {
            int _type = STRING_LITERAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/sivikt/!storage/_coding/_java/chalkc/grammar/Chalk.g:1470:2: ( '\"' (~ ( '\"' | '\\n' | '\\r' ) )* '\"' )
            // /home/sivikt/!storage/_coding/_java/chalkc/grammar/Chalk.g:1470:4: '\"' (~ ( '\"' | '\\n' | '\\r' ) )* '\"'
            {
            match('\"'); 
            // /home/sivikt/!storage/_coding/_java/chalkc/grammar/Chalk.g:1470:8: (~ ( '\"' | '\\n' | '\\r' ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>='\u0000' && LA2_0<='\t')||(LA2_0>='\u000B' && LA2_0<='\f')||(LA2_0>='\u000E' && LA2_0<='!')||(LA2_0>='#' && LA2_0<='\uFFFF')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // /home/sivikt/!storage/_coding/_java/chalkc/grammar/Chalk.g:1470:10: ~ ( '\"' | '\\n' | '\\r' )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='!')||(input.LA(1)>='#' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            match('\"'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "STRING_LITERAL"

    // $ANTLR start "DECIMAL_LITERAL"
    public final void mDECIMAL_LITERAL() throws RecognitionException {
        try {
            int _type = DECIMAL_LITERAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/sivikt/!storage/_coding/_java/chalkc/grammar/Chalk.g:1474:2: ( '0' | '1' .. '9' ( '0' .. '9' )* )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0=='0') ) {
                alt4=1;
            }
            else if ( ((LA4_0>='1' && LA4_0<='9')) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // /home/sivikt/!storage/_coding/_java/chalkc/grammar/Chalk.g:1474:6: '0'
                    {
                    match('0'); 

                    }
                    break;
                case 2 :
                    // /home/sivikt/!storage/_coding/_java/chalkc/grammar/Chalk.g:1475:5: '1' .. '9' ( '0' .. '9' )*
                    {
                    matchRange('1','9'); 
                    // /home/sivikt/!storage/_coding/_java/chalkc/grammar/Chalk.g:1475:14: ( '0' .. '9' )*
                    loop3:
                    do {
                        int alt3=2;
                        int LA3_0 = input.LA(1);

                        if ( ((LA3_0>='0' && LA3_0<='9')) ) {
                            alt3=1;
                        }


                        switch (alt3) {
                    	case 1 :
                    	    // /home/sivikt/!storage/_coding/_java/chalkc/grammar/Chalk.g:1475:16: '0' .. '9'
                    	    {
                    	    matchRange('0','9'); 

                    	    }
                    	    break;

                    	default :
                    	    break loop3;
                        }
                    } while (true);


                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "DECIMAL_LITERAL"

    // $ANTLR start "FLOATING_POINT_LITERAL"
    public final void mFLOATING_POINT_LITERAL() throws RecognitionException {
        try {
            int _type = FLOATING_POINT_LITERAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/sivikt/!storage/_coding/_java/chalkc/grammar/Chalk.g:1479:2: ( ( '0' .. '9' )+ '.' ( '0' .. '9' )* ( Exponent )? | '.' ( '0' .. '9' )+ ( Exponent )? | ( '0' .. '9' )+ )
            int alt11=3;
            alt11 = dfa11.predict(input);
            switch (alt11) {
                case 1 :
                    // /home/sivikt/!storage/_coding/_java/chalkc/grammar/Chalk.g:1479:4: ( '0' .. '9' )+ '.' ( '0' .. '9' )* ( Exponent )?
                    {
                    // /home/sivikt/!storage/_coding/_java/chalkc/grammar/Chalk.g:1479:4: ( '0' .. '9' )+
                    int cnt5=0;
                    loop5:
                    do {
                        int alt5=2;
                        int LA5_0 = input.LA(1);

                        if ( ((LA5_0>='0' && LA5_0<='9')) ) {
                            alt5=1;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // /home/sivikt/!storage/_coding/_java/chalkc/grammar/Chalk.g:1479:5: '0' .. '9'
                    	    {
                    	    matchRange('0','9'); 

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt5 >= 1 ) break loop5;
                                EarlyExitException eee =
                                    new EarlyExitException(5, input);
                                throw eee;
                        }
                        cnt5++;
                    } while (true);

                    match('.'); 
                    // /home/sivikt/!storage/_coding/_java/chalkc/grammar/Chalk.g:1479:22: ( '0' .. '9' )*
                    loop6:
                    do {
                        int alt6=2;
                        int LA6_0 = input.LA(1);

                        if ( ((LA6_0>='0' && LA6_0<='9')) ) {
                            alt6=1;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // /home/sivikt/!storage/_coding/_java/chalkc/grammar/Chalk.g:1479:23: '0' .. '9'
                    	    {
                    	    matchRange('0','9'); 

                    	    }
                    	    break;

                    	default :
                    	    break loop6;
                        }
                    } while (true);

                    // /home/sivikt/!storage/_coding/_java/chalkc/grammar/Chalk.g:1479:36: ( Exponent )?
                    int alt7=2;
                    int LA7_0 = input.LA(1);

                    if ( (LA7_0=='E'||LA7_0=='e') ) {
                        alt7=1;
                    }
                    switch (alt7) {
                        case 1 :
                            // /home/sivikt/!storage/_coding/_java/chalkc/grammar/Chalk.g:1479:36: Exponent
                            {
                            mExponent(); 

                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // /home/sivikt/!storage/_coding/_java/chalkc/grammar/Chalk.g:1480:7: '.' ( '0' .. '9' )+ ( Exponent )?
                    {
                    match('.'); 
                    // /home/sivikt/!storage/_coding/_java/chalkc/grammar/Chalk.g:1480:11: ( '0' .. '9' )+
                    int cnt8=0;
                    loop8:
                    do {
                        int alt8=2;
                        int LA8_0 = input.LA(1);

                        if ( ((LA8_0>='0' && LA8_0<='9')) ) {
                            alt8=1;
                        }


                        switch (alt8) {
                    	case 1 :
                    	    // /home/sivikt/!storage/_coding/_java/chalkc/grammar/Chalk.g:1480:12: '0' .. '9'
                    	    {
                    	    matchRange('0','9'); 

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt8 >= 1 ) break loop8;
                                EarlyExitException eee =
                                    new EarlyExitException(8, input);
                                throw eee;
                        }
                        cnt8++;
                    } while (true);

                    // /home/sivikt/!storage/_coding/_java/chalkc/grammar/Chalk.g:1480:25: ( Exponent )?
                    int alt9=2;
                    int LA9_0 = input.LA(1);

                    if ( (LA9_0=='E'||LA9_0=='e') ) {
                        alt9=1;
                    }
                    switch (alt9) {
                        case 1 :
                            // /home/sivikt/!storage/_coding/_java/chalkc/grammar/Chalk.g:1480:25: Exponent
                            {
                            mExponent(); 

                            }
                            break;

                    }


                    }
                    break;
                case 3 :
                    // /home/sivikt/!storage/_coding/_java/chalkc/grammar/Chalk.g:1481:7: ( '0' .. '9' )+
                    {
                    // /home/sivikt/!storage/_coding/_java/chalkc/grammar/Chalk.g:1481:7: ( '0' .. '9' )+
                    int cnt10=0;
                    loop10:
                    do {
                        int alt10=2;
                        int LA10_0 = input.LA(1);

                        if ( ((LA10_0>='0' && LA10_0<='9')) ) {
                            alt10=1;
                        }


                        switch (alt10) {
                    	case 1 :
                    	    // /home/sivikt/!storage/_coding/_java/chalkc/grammar/Chalk.g:1481:8: '0' .. '9'
                    	    {
                    	    matchRange('0','9'); 

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt10 >= 1 ) break loop10;
                                EarlyExitException eee =
                                    new EarlyExitException(10, input);
                                throw eee;
                        }
                        cnt10++;
                    } while (true);


                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "FLOATING_POINT_LITERAL"

    // $ANTLR start "Exponent"
    public final void mExponent() throws RecognitionException {
        try {
            // /home/sivikt/!storage/_coding/_java/chalkc/grammar/Chalk.g:1486:2: ( ( 'e' | 'E' ) ( '+' | '-' )? ( '0' .. '9' )+ )
            // /home/sivikt/!storage/_coding/_java/chalkc/grammar/Chalk.g:1486:5: ( 'e' | 'E' ) ( '+' | '-' )? ( '0' .. '9' )+
            {
            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // /home/sivikt/!storage/_coding/_java/chalkc/grammar/Chalk.g:1486:19: ( '+' | '-' )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0=='+'||LA12_0=='-') ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // /home/sivikt/!storage/_coding/_java/chalkc/grammar/Chalk.g:
                    {
                    if ( input.LA(1)=='+'||input.LA(1)=='-' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}


                    }
                    break;

            }

            // /home/sivikt/!storage/_coding/_java/chalkc/grammar/Chalk.g:1486:34: ( '0' .. '9' )+
            int cnt13=0;
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( ((LA13_0>='0' && LA13_0<='9')) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // /home/sivikt/!storage/_coding/_java/chalkc/grammar/Chalk.g:1486:35: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt13 >= 1 ) break loop13;
                        EarlyExitException eee =
                            new EarlyExitException(13, input);
                        throw eee;
                }
                cnt13++;
            } while (true);


            }

        }
        finally {
        }
    }
    // $ANTLR end "Exponent"

    // $ANTLR start "COMMENT"
    public final void mCOMMENT() throws RecognitionException {
        try {
            int _type = COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/sivikt/!storage/_coding/_java/chalkc/grammar/Chalk.g:1490:2: ( '#' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n' | '#!' ( options {greedy=false; } : . )* '!#' )
            int alt17=2;
            alt17 = dfa17.predict(input);
            switch (alt17) {
                case 1 :
                    // /home/sivikt/!storage/_coding/_java/chalkc/grammar/Chalk.g:1490:4: '#' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n'
                    {
                    match('#'); 
                    // /home/sivikt/!storage/_coding/_java/chalkc/grammar/Chalk.g:1490:8: (~ ( '\\n' | '\\r' ) )*
                    loop14:
                    do {
                        int alt14=2;
                        int LA14_0 = input.LA(1);

                        if ( ((LA14_0>='\u0000' && LA14_0<='\t')||(LA14_0>='\u000B' && LA14_0<='\f')||(LA14_0>='\u000E' && LA14_0<='\uFFFF')) ) {
                            alt14=1;
                        }


                        switch (alt14) {
                    	case 1 :
                    	    // /home/sivikt/!storage/_coding/_java/chalkc/grammar/Chalk.g:1490:8: ~ ( '\\n' | '\\r' )
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
                    	    break loop14;
                        }
                    } while (true);

                    // /home/sivikt/!storage/_coding/_java/chalkc/grammar/Chalk.g:1490:26: ( '\\r' )?
                    int alt15=2;
                    int LA15_0 = input.LA(1);

                    if ( (LA15_0=='\r') ) {
                        alt15=1;
                    }
                    switch (alt15) {
                        case 1 :
                            // /home/sivikt/!storage/_coding/_java/chalkc/grammar/Chalk.g:1490:26: '\\r'
                            {
                            match('\r'); 

                            }
                            break;

                    }

                    match('\n'); 
                     _channel = HIDDEN; 

                    }
                    break;
                case 2 :
                    // /home/sivikt/!storage/_coding/_java/chalkc/grammar/Chalk.g:1491:5: '#!' ( options {greedy=false; } : . )* '!#'
                    {
                    match("#!"); 

                    // /home/sivikt/!storage/_coding/_java/chalkc/grammar/Chalk.g:1491:10: ( options {greedy=false; } : . )*
                    loop16:
                    do {
                        int alt16=2;
                        int LA16_0 = input.LA(1);

                        if ( (LA16_0=='!') ) {
                            int LA16_1 = input.LA(2);

                            if ( (LA16_1=='#') ) {
                                alt16=2;
                            }
                            else if ( ((LA16_1>='\u0000' && LA16_1<='\"')||(LA16_1>='$' && LA16_1<='\uFFFF')) ) {
                                alt16=1;
                            }


                        }
                        else if ( ((LA16_0>='\u0000' && LA16_0<=' ')||(LA16_0>='\"' && LA16_0<='\uFFFF')) ) {
                            alt16=1;
                        }


                        switch (alt16) {
                    	case 1 :
                    	    // /home/sivikt/!storage/_coding/_java/chalkc/grammar/Chalk.g:1491:42: .
                    	    {
                    	    matchAny(); 

                    	    }
                    	    break;

                    	default :
                    	    break loop16;
                        }
                    } while (true);

                    match("!#"); 

                     _channel = HIDDEN; 

                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "COMMENT"

    // $ANTLR start "WHITESPACE"
    public final void mWHITESPACE() throws RecognitionException {
        try {
            int _type = WHITESPACE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/sivikt/!storage/_coding/_java/chalkc/grammar/Chalk.g:1495:2: ( ( ' ' | '\\t' | '\\r' | '\\n' ) )
            // /home/sivikt/!storage/_coding/_java/chalkc/grammar/Chalk.g:1495:5: ( ' ' | '\\t' | '\\r' | '\\n' )
            {
            if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

             _channel = HIDDEN; 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "WHITESPACE"

    public void mTokens() throws RecognitionException {
        // /home/sivikt/!storage/_coding/_java/chalkc/grammar/Chalk.g:1:8: ( T__71 | T__72 | T__73 | T__74 | T__75 | T__76 | T__77 | T__78 | T__79 | T__80 | T__81 | T__82 | T__83 | T__84 | T__85 | T__86 | T__87 | T__88 | T__89 | T__90 | T__91 | T__92 | T__93 | T__94 | T__95 | T__96 | T__97 | T__98 | T__99 | FALSE | TRUE | DEF_TK | ENTRY_TK | END_TK | IF_TK | ELSIF_TK | ELSE_TK | WHILE_TK | DO_TK | UNTIL_TK | FOR_TK | IN_TK | BREAK_TK | CONTINUE_TK | RETURN_TK | EXIT_TK | PLUS | PLUS_PLUS | MINUS | MINUS_MINUS | TILDE | SCREAMER | STAR | STAR_STAR | RSLASH | DIV | MOD | GT | GT_GT | GT_GT_EQ | LT | LT_LT | LT_LT_EQ | LT_EQ | GT_EQ | EQ | EQ_EQ | SCREAMER_EQ | PLUS_EQ | MINUS_EQ | STAR_EQ | RSLASH_EQ | BAR | BAR_BAR | AMP | AMP_AMP | CARET | LPAREN | RPAREN | LBRACE | RBRACE | LBRACKET | RBRACKET | MAX_TK | MIN_TK | READ_INT | READ_FLOAT | READ_STRING | READ_BOOL | ID | STRING_LITERAL | DECIMAL_LITERAL | FLOATING_POINT_LITERAL | COMMENT | WHITESPACE )
        int alt18=95;
        alt18 = dfa18.predict(input);
        switch (alt18) {
            case 1 :
                // /home/sivikt/!storage/_coding/_java/chalkc/grammar/Chalk.g:1:10: T__71
                {
                mT__71(); 

                }
                break;
            case 2 :
                // /home/sivikt/!storage/_coding/_java/chalkc/grammar/Chalk.g:1:16: T__72
                {
                mT__72(); 

                }
                break;
            case 3 :
                // /home/sivikt/!storage/_coding/_java/chalkc/grammar/Chalk.g:1:22: T__73
                {
                mT__73(); 

                }
                break;
            case 4 :
                // /home/sivikt/!storage/_coding/_java/chalkc/grammar/Chalk.g:1:28: T__74
                {
                mT__74(); 

                }
                break;
            case 5 :
                // /home/sivikt/!storage/_coding/_java/chalkc/grammar/Chalk.g:1:34: T__75
                {
                mT__75(); 

                }
                break;
            case 6 :
                // /home/sivikt/!storage/_coding/_java/chalkc/grammar/Chalk.g:1:40: T__76
                {
                mT__76(); 

                }
                break;
            case 7 :
                // /home/sivikt/!storage/_coding/_java/chalkc/grammar/Chalk.g:1:46: T__77
                {
                mT__77(); 

                }
                break;
            case 8 :
                // /home/sivikt/!storage/_coding/_java/chalkc/grammar/Chalk.g:1:52: T__78
                {
                mT__78(); 

                }
                break;
            case 9 :
                // /home/sivikt/!storage/_coding/_java/chalkc/grammar/Chalk.g:1:58: T__79
                {
                mT__79(); 

                }
                break;
            case 10 :
                // /home/sivikt/!storage/_coding/_java/chalkc/grammar/Chalk.g:1:64: T__80
                {
                mT__80(); 

                }
                break;
            case 11 :
                // /home/sivikt/!storage/_coding/_java/chalkc/grammar/Chalk.g:1:70: T__81
                {
                mT__81(); 

                }
                break;
            case 12 :
                // /home/sivikt/!storage/_coding/_java/chalkc/grammar/Chalk.g:1:76: T__82
                {
                mT__82(); 

                }
                break;
            case 13 :
                // /home/sivikt/!storage/_coding/_java/chalkc/grammar/Chalk.g:1:82: T__83
                {
                mT__83(); 

                }
                break;
            case 14 :
                // /home/sivikt/!storage/_coding/_java/chalkc/grammar/Chalk.g:1:88: T__84
                {
                mT__84(); 

                }
                break;
            case 15 :
                // /home/sivikt/!storage/_coding/_java/chalkc/grammar/Chalk.g:1:94: T__85
                {
                mT__85(); 

                }
                break;
            case 16 :
                // /home/sivikt/!storage/_coding/_java/chalkc/grammar/Chalk.g:1:100: T__86
                {
                mT__86(); 

                }
                break;
            case 17 :
                // /home/sivikt/!storage/_coding/_java/chalkc/grammar/Chalk.g:1:106: T__87
                {
                mT__87(); 

                }
                break;
            case 18 :
                // /home/sivikt/!storage/_coding/_java/chalkc/grammar/Chalk.g:1:112: T__88
                {
                mT__88(); 

                }
                break;
            case 19 :
                // /home/sivikt/!storage/_coding/_java/chalkc/grammar/Chalk.g:1:118: T__89
                {
                mT__89(); 

                }
                break;
            case 20 :
                // /home/sivikt/!storage/_coding/_java/chalkc/grammar/Chalk.g:1:124: T__90
                {
                mT__90(); 

                }
                break;
            case 21 :
                // /home/sivikt/!storage/_coding/_java/chalkc/grammar/Chalk.g:1:130: T__91
                {
                mT__91(); 

                }
                break;
            case 22 :
                // /home/sivikt/!storage/_coding/_java/chalkc/grammar/Chalk.g:1:136: T__92
                {
                mT__92(); 

                }
                break;
            case 23 :
                // /home/sivikt/!storage/_coding/_java/chalkc/grammar/Chalk.g:1:142: T__93
                {
                mT__93(); 

                }
                break;
            case 24 :
                // /home/sivikt/!storage/_coding/_java/chalkc/grammar/Chalk.g:1:148: T__94
                {
                mT__94(); 

                }
                break;
            case 25 :
                // /home/sivikt/!storage/_coding/_java/chalkc/grammar/Chalk.g:1:154: T__95
                {
                mT__95(); 

                }
                break;
            case 26 :
                // /home/sivikt/!storage/_coding/_java/chalkc/grammar/Chalk.g:1:160: T__96
                {
                mT__96(); 

                }
                break;
            case 27 :
                // /home/sivikt/!storage/_coding/_java/chalkc/grammar/Chalk.g:1:166: T__97
                {
                mT__97(); 

                }
                break;
            case 28 :
                // /home/sivikt/!storage/_coding/_java/chalkc/grammar/Chalk.g:1:172: T__98
                {
                mT__98(); 

                }
                break;
            case 29 :
                // /home/sivikt/!storage/_coding/_java/chalkc/grammar/Chalk.g:1:178: T__99
                {
                mT__99(); 

                }
                break;
            case 30 :
                // /home/sivikt/!storage/_coding/_java/chalkc/grammar/Chalk.g:1:184: FALSE
                {
                mFALSE(); 

                }
                break;
            case 31 :
                // /home/sivikt/!storage/_coding/_java/chalkc/grammar/Chalk.g:1:190: TRUE
                {
                mTRUE(); 

                }
                break;
            case 32 :
                // /home/sivikt/!storage/_coding/_java/chalkc/grammar/Chalk.g:1:195: DEF_TK
                {
                mDEF_TK(); 

                }
                break;
            case 33 :
                // /home/sivikt/!storage/_coding/_java/chalkc/grammar/Chalk.g:1:202: ENTRY_TK
                {
                mENTRY_TK(); 

                }
                break;
            case 34 :
                // /home/sivikt/!storage/_coding/_java/chalkc/grammar/Chalk.g:1:211: END_TK
                {
                mEND_TK(); 

                }
                break;
            case 35 :
                // /home/sivikt/!storage/_coding/_java/chalkc/grammar/Chalk.g:1:218: IF_TK
                {
                mIF_TK(); 

                }
                break;
            case 36 :
                // /home/sivikt/!storage/_coding/_java/chalkc/grammar/Chalk.g:1:224: ELSIF_TK
                {
                mELSIF_TK(); 

                }
                break;
            case 37 :
                // /home/sivikt/!storage/_coding/_java/chalkc/grammar/Chalk.g:1:233: ELSE_TK
                {
                mELSE_TK(); 

                }
                break;
            case 38 :
                // /home/sivikt/!storage/_coding/_java/chalkc/grammar/Chalk.g:1:241: WHILE_TK
                {
                mWHILE_TK(); 

                }
                break;
            case 39 :
                // /home/sivikt/!storage/_coding/_java/chalkc/grammar/Chalk.g:1:250: DO_TK
                {
                mDO_TK(); 

                }
                break;
            case 40 :
                // /home/sivikt/!storage/_coding/_java/chalkc/grammar/Chalk.g:1:256: UNTIL_TK
                {
                mUNTIL_TK(); 

                }
                break;
            case 41 :
                // /home/sivikt/!storage/_coding/_java/chalkc/grammar/Chalk.g:1:265: FOR_TK
                {
                mFOR_TK(); 

                }
                break;
            case 42 :
                // /home/sivikt/!storage/_coding/_java/chalkc/grammar/Chalk.g:1:272: IN_TK
                {
                mIN_TK(); 

                }
                break;
            case 43 :
                // /home/sivikt/!storage/_coding/_java/chalkc/grammar/Chalk.g:1:278: BREAK_TK
                {
                mBREAK_TK(); 

                }
                break;
            case 44 :
                // /home/sivikt/!storage/_coding/_java/chalkc/grammar/Chalk.g:1:287: CONTINUE_TK
                {
                mCONTINUE_TK(); 

                }
                break;
            case 45 :
                // /home/sivikt/!storage/_coding/_java/chalkc/grammar/Chalk.g:1:299: RETURN_TK
                {
                mRETURN_TK(); 

                }
                break;
            case 46 :
                // /home/sivikt/!storage/_coding/_java/chalkc/grammar/Chalk.g:1:309: EXIT_TK
                {
                mEXIT_TK(); 

                }
                break;
            case 47 :
                // /home/sivikt/!storage/_coding/_java/chalkc/grammar/Chalk.g:1:317: PLUS
                {
                mPLUS(); 

                }
                break;
            case 48 :
                // /home/sivikt/!storage/_coding/_java/chalkc/grammar/Chalk.g:1:322: PLUS_PLUS
                {
                mPLUS_PLUS(); 

                }
                break;
            case 49 :
                // /home/sivikt/!storage/_coding/_java/chalkc/grammar/Chalk.g:1:332: MINUS
                {
                mMINUS(); 

                }
                break;
            case 50 :
                // /home/sivikt/!storage/_coding/_java/chalkc/grammar/Chalk.g:1:338: MINUS_MINUS
                {
                mMINUS_MINUS(); 

                }
                break;
            case 51 :
                // /home/sivikt/!storage/_coding/_java/chalkc/grammar/Chalk.g:1:350: TILDE
                {
                mTILDE(); 

                }
                break;
            case 52 :
                // /home/sivikt/!storage/_coding/_java/chalkc/grammar/Chalk.g:1:356: SCREAMER
                {
                mSCREAMER(); 

                }
                break;
            case 53 :
                // /home/sivikt/!storage/_coding/_java/chalkc/grammar/Chalk.g:1:365: STAR
                {
                mSTAR(); 

                }
                break;
            case 54 :
                // /home/sivikt/!storage/_coding/_java/chalkc/grammar/Chalk.g:1:370: STAR_STAR
                {
                mSTAR_STAR(); 

                }
                break;
            case 55 :
                // /home/sivikt/!storage/_coding/_java/chalkc/grammar/Chalk.g:1:380: RSLASH
                {
                mRSLASH(); 

                }
                break;
            case 56 :
                // /home/sivikt/!storage/_coding/_java/chalkc/grammar/Chalk.g:1:387: DIV
                {
                mDIV(); 

                }
                break;
            case 57 :
                // /home/sivikt/!storage/_coding/_java/chalkc/grammar/Chalk.g:1:391: MOD
                {
                mMOD(); 

                }
                break;
            case 58 :
                // /home/sivikt/!storage/_coding/_java/chalkc/grammar/Chalk.g:1:395: GT
                {
                mGT(); 

                }
                break;
            case 59 :
                // /home/sivikt/!storage/_coding/_java/chalkc/grammar/Chalk.g:1:398: GT_GT
                {
                mGT_GT(); 

                }
                break;
            case 60 :
                // /home/sivikt/!storage/_coding/_java/chalkc/grammar/Chalk.g:1:404: GT_GT_EQ
                {
                mGT_GT_EQ(); 

                }
                break;
            case 61 :
                // /home/sivikt/!storage/_coding/_java/chalkc/grammar/Chalk.g:1:413: LT
                {
                mLT(); 

                }
                break;
            case 62 :
                // /home/sivikt/!storage/_coding/_java/chalkc/grammar/Chalk.g:1:416: LT_LT
                {
                mLT_LT(); 

                }
                break;
            case 63 :
                // /home/sivikt/!storage/_coding/_java/chalkc/grammar/Chalk.g:1:422: LT_LT_EQ
                {
                mLT_LT_EQ(); 

                }
                break;
            case 64 :
                // /home/sivikt/!storage/_coding/_java/chalkc/grammar/Chalk.g:1:431: LT_EQ
                {
                mLT_EQ(); 

                }
                break;
            case 65 :
                // /home/sivikt/!storage/_coding/_java/chalkc/grammar/Chalk.g:1:437: GT_EQ
                {
                mGT_EQ(); 

                }
                break;
            case 66 :
                // /home/sivikt/!storage/_coding/_java/chalkc/grammar/Chalk.g:1:443: EQ
                {
                mEQ(); 

                }
                break;
            case 67 :
                // /home/sivikt/!storage/_coding/_java/chalkc/grammar/Chalk.g:1:446: EQ_EQ
                {
                mEQ_EQ(); 

                }
                break;
            case 68 :
                // /home/sivikt/!storage/_coding/_java/chalkc/grammar/Chalk.g:1:452: SCREAMER_EQ
                {
                mSCREAMER_EQ(); 

                }
                break;
            case 69 :
                // /home/sivikt/!storage/_coding/_java/chalkc/grammar/Chalk.g:1:464: PLUS_EQ
                {
                mPLUS_EQ(); 

                }
                break;
            case 70 :
                // /home/sivikt/!storage/_coding/_java/chalkc/grammar/Chalk.g:1:472: MINUS_EQ
                {
                mMINUS_EQ(); 

                }
                break;
            case 71 :
                // /home/sivikt/!storage/_coding/_java/chalkc/grammar/Chalk.g:1:481: STAR_EQ
                {
                mSTAR_EQ(); 

                }
                break;
            case 72 :
                // /home/sivikt/!storage/_coding/_java/chalkc/grammar/Chalk.g:1:489: RSLASH_EQ
                {
                mRSLASH_EQ(); 

                }
                break;
            case 73 :
                // /home/sivikt/!storage/_coding/_java/chalkc/grammar/Chalk.g:1:499: BAR
                {
                mBAR(); 

                }
                break;
            case 74 :
                // /home/sivikt/!storage/_coding/_java/chalkc/grammar/Chalk.g:1:503: BAR_BAR
                {
                mBAR_BAR(); 

                }
                break;
            case 75 :
                // /home/sivikt/!storage/_coding/_java/chalkc/grammar/Chalk.g:1:511: AMP
                {
                mAMP(); 

                }
                break;
            case 76 :
                // /home/sivikt/!storage/_coding/_java/chalkc/grammar/Chalk.g:1:515: AMP_AMP
                {
                mAMP_AMP(); 

                }
                break;
            case 77 :
                // /home/sivikt/!storage/_coding/_java/chalkc/grammar/Chalk.g:1:523: CARET
                {
                mCARET(); 

                }
                break;
            case 78 :
                // /home/sivikt/!storage/_coding/_java/chalkc/grammar/Chalk.g:1:529: LPAREN
                {
                mLPAREN(); 

                }
                break;
            case 79 :
                // /home/sivikt/!storage/_coding/_java/chalkc/grammar/Chalk.g:1:536: RPAREN
                {
                mRPAREN(); 

                }
                break;
            case 80 :
                // /home/sivikt/!storage/_coding/_java/chalkc/grammar/Chalk.g:1:543: LBRACE
                {
                mLBRACE(); 

                }
                break;
            case 81 :
                // /home/sivikt/!storage/_coding/_java/chalkc/grammar/Chalk.g:1:550: RBRACE
                {
                mRBRACE(); 

                }
                break;
            case 82 :
                // /home/sivikt/!storage/_coding/_java/chalkc/grammar/Chalk.g:1:557: LBRACKET
                {
                mLBRACKET(); 

                }
                break;
            case 83 :
                // /home/sivikt/!storage/_coding/_java/chalkc/grammar/Chalk.g:1:566: RBRACKET
                {
                mRBRACKET(); 

                }
                break;
            case 84 :
                // /home/sivikt/!storage/_coding/_java/chalkc/grammar/Chalk.g:1:575: MAX_TK
                {
                mMAX_TK(); 

                }
                break;
            case 85 :
                // /home/sivikt/!storage/_coding/_java/chalkc/grammar/Chalk.g:1:582: MIN_TK
                {
                mMIN_TK(); 

                }
                break;
            case 86 :
                // /home/sivikt/!storage/_coding/_java/chalkc/grammar/Chalk.g:1:589: READ_INT
                {
                mREAD_INT(); 

                }
                break;
            case 87 :
                // /home/sivikt/!storage/_coding/_java/chalkc/grammar/Chalk.g:1:598: READ_FLOAT
                {
                mREAD_FLOAT(); 

                }
                break;
            case 88 :
                // /home/sivikt/!storage/_coding/_java/chalkc/grammar/Chalk.g:1:609: READ_STRING
                {
                mREAD_STRING(); 

                }
                break;
            case 89 :
                // /home/sivikt/!storage/_coding/_java/chalkc/grammar/Chalk.g:1:621: READ_BOOL
                {
                mREAD_BOOL(); 

                }
                break;
            case 90 :
                // /home/sivikt/!storage/_coding/_java/chalkc/grammar/Chalk.g:1:631: ID
                {
                mID(); 

                }
                break;
            case 91 :
                // /home/sivikt/!storage/_coding/_java/chalkc/grammar/Chalk.g:1:634: STRING_LITERAL
                {
                mSTRING_LITERAL(); 

                }
                break;
            case 92 :
                // /home/sivikt/!storage/_coding/_java/chalkc/grammar/Chalk.g:1:649: DECIMAL_LITERAL
                {
                mDECIMAL_LITERAL(); 

                }
                break;
            case 93 :
                // /home/sivikt/!storage/_coding/_java/chalkc/grammar/Chalk.g:1:665: FLOATING_POINT_LITERAL
                {
                mFLOATING_POINT_LITERAL(); 

                }
                break;
            case 94 :
                // /home/sivikt/!storage/_coding/_java/chalkc/grammar/Chalk.g:1:688: COMMENT
                {
                mCOMMENT(); 

                }
                break;
            case 95 :
                // /home/sivikt/!storage/_coding/_java/chalkc/grammar/Chalk.g:1:696: WHITESPACE
                {
                mWHITESPACE(); 

                }
                break;

        }

    }


    protected DFA11 dfa11 = new DFA11(this);
    protected DFA17 dfa17 = new DFA17(this);
    protected DFA18 dfa18 = new DFA18(this);
    static final String DFA11_eotS =
        "\1\uffff\1\3\3\uffff";
    static final String DFA11_eofS =
        "\5\uffff";
    static final String DFA11_minS =
        "\2\56\3\uffff";
    static final String DFA11_maxS =
        "\2\71\3\uffff";
    static final String DFA11_acceptS =
        "\2\uffff\1\2\1\3\1\1";
    static final String DFA11_specialS =
        "\5\uffff}>";
    static final String[] DFA11_transitionS = {
            "\1\2\1\uffff\12\1",
            "\1\4\1\uffff\12\1",
            "",
            "",
            ""
    };

    static final short[] DFA11_eot = DFA.unpackEncodedString(DFA11_eotS);
    static final short[] DFA11_eof = DFA.unpackEncodedString(DFA11_eofS);
    static final char[] DFA11_min = DFA.unpackEncodedStringToUnsignedChars(DFA11_minS);
    static final char[] DFA11_max = DFA.unpackEncodedStringToUnsignedChars(DFA11_maxS);
    static final short[] DFA11_accept = DFA.unpackEncodedString(DFA11_acceptS);
    static final short[] DFA11_special = DFA.unpackEncodedString(DFA11_specialS);
    static final short[][] DFA11_transition;

    static {
        int numStates = DFA11_transitionS.length;
        DFA11_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA11_transition[i] = DFA.unpackEncodedString(DFA11_transitionS[i]);
        }
    }

    class DFA11 extends DFA {

        public DFA11(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 11;
            this.eot = DFA11_eot;
            this.eof = DFA11_eof;
            this.min = DFA11_min;
            this.max = DFA11_max;
            this.accept = DFA11_accept;
            this.special = DFA11_special;
            this.transition = DFA11_transition;
        }
        public String getDescription() {
            return "1478:1: FLOATING_POINT_LITERAL : ( ( '0' .. '9' )+ '.' ( '0' .. '9' )* ( Exponent )? | '.' ( '0' .. '9' )+ ( Exponent )? | ( '0' .. '9' )+ );";
        }
    }
    static final String DFA17_eotS =
        "\5\uffff\1\3\3\uffff\1\10";
    static final String DFA17_eofS =
        "\12\uffff";
    static final String DFA17_minS =
        "\1\43\2\0\1\uffff\4\0\1\uffff\1\0";
    static final String DFA17_maxS =
        "\1\43\2\uffff\1\uffff\4\uffff\1\uffff\1\uffff";
    static final String DFA17_acceptS =
        "\3\uffff\1\1\4\uffff\1\2\1\uffff";
    static final String DFA17_specialS =
        "\1\uffff\1\0\1\2\1\uffff\1\6\1\1\1\3\1\4\1\uffff\1\5}>";
    static final String[] DFA17_transitionS = {
            "\1\1",
            "\41\3\1\2\uffde\3",
            "\12\7\1\5\2\7\1\4\23\7\1\6\uffde\7",
            "",
            "\12\10\1\5\ufff5\10",
            "\0\10",
            "\12\7\1\5\2\7\1\4\23\7\1\6\1\7\1\11\uffdc\7",
            "\12\7\1\5\2\7\1\4\23\7\1\6\uffde\7",
            "",
            "\12\7\1\5\2\7\1\4\23\7\1\6\uffde\7"
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
            return "1489:1: COMMENT : ( '#' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n' | '#!' ( options {greedy=false; } : . )* '!#' );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA17_1 = input.LA(1);

                        s = -1;
                        if ( (LA17_1=='!') ) {s = 2;}

                        else if ( ((LA17_1>='\u0000' && LA17_1<=' ')||(LA17_1>='\"' && LA17_1<='\uFFFF')) ) {s = 3;}

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA17_5 = input.LA(1);

                        s = -1;
                        if ( ((LA17_5>='\u0000' && LA17_5<='\uFFFF')) ) {s = 8;}

                        else s = 3;

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA17_2 = input.LA(1);

                        s = -1;
                        if ( (LA17_2=='\r') ) {s = 4;}

                        else if ( (LA17_2=='\n') ) {s = 5;}

                        else if ( (LA17_2=='!') ) {s = 6;}

                        else if ( ((LA17_2>='\u0000' && LA17_2<='\t')||(LA17_2>='\u000B' && LA17_2<='\f')||(LA17_2>='\u000E' && LA17_2<=' ')||(LA17_2>='\"' && LA17_2<='\uFFFF')) ) {s = 7;}

                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA17_6 = input.LA(1);

                        s = -1;
                        if ( (LA17_6=='#') ) {s = 9;}

                        else if ( (LA17_6=='\r') ) {s = 4;}

                        else if ( (LA17_6=='\n') ) {s = 5;}

                        else if ( (LA17_6=='!') ) {s = 6;}

                        else if ( ((LA17_6>='\u0000' && LA17_6<='\t')||(LA17_6>='\u000B' && LA17_6<='\f')||(LA17_6>='\u000E' && LA17_6<=' ')||LA17_6=='\"'||(LA17_6>='$' && LA17_6<='\uFFFF')) ) {s = 7;}

                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA17_7 = input.LA(1);

                        s = -1;
                        if ( (LA17_7=='\r') ) {s = 4;}

                        else if ( (LA17_7=='\n') ) {s = 5;}

                        else if ( (LA17_7=='!') ) {s = 6;}

                        else if ( ((LA17_7>='\u0000' && LA17_7<='\t')||(LA17_7>='\u000B' && LA17_7<='\f')||(LA17_7>='\u000E' && LA17_7<=' ')||(LA17_7>='\"' && LA17_7<='\uFFFF')) ) {s = 7;}

                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA17_9 = input.LA(1);

                        s = -1;
                        if ( (LA17_9=='\r') ) {s = 4;}

                        else if ( (LA17_9=='\n') ) {s = 5;}

                        else if ( (LA17_9=='!') ) {s = 6;}

                        else if ( ((LA17_9>='\u0000' && LA17_9<='\t')||(LA17_9>='\u000B' && LA17_9<='\f')||(LA17_9>='\u000E' && LA17_9<=' ')||(LA17_9>='\"' && LA17_9<='\uFFFF')) ) {s = 7;}

                        else s = 8;

                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA17_4 = input.LA(1);

                        s = -1;
                        if ( (LA17_4=='\n') ) {s = 5;}

                        else if ( ((LA17_4>='\u0000' && LA17_4<='\t')||(LA17_4>='\u000B' && LA17_4<='\uFFFF')) ) {s = 8;}

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 17, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA18_eotS =
        "\3\uffff\2\55\1\66\1\73\23\55\1\136\1\141\1\uffff\1\143\1\146\1"+
        "\150\1\55\1\156\1\161\1\163\1\165\1\167\11\uffff\2\170\2\uffff\1"+
        "\55\1\173\1\55\2\uffff\3\55\1\uffff\20\55\1\u0092\1\u0093\6\55\1"+
        "\u009a\1\55\1\u009c\1\u009d\4\55\15\uffff\3\55\1\u00a7\2\uffff\1"+
        "\u00a9\11\uffff\1\170\1\55\1\uffff\2\55\1\u00ad\6\55\1\u00b5\1\55"+
        "\1\u00b7\1\u00b8\2\55\1\u00bb\1\55\1\u00bd\4\55\2\uffff\1\u00c2"+
        "\3\55\1\u00c6\1\u00c7\1\uffff\1\u00c8\2\uffff\5\55\1\u00ce\1\u00cf"+
        "\1\u00d0\4\uffff\3\55\1\uffff\1\55\1\u00d5\1\u00d6\4\55\1\uffff"+
        "\1\55\2\uffff\1\u00dc\1\55\1\uffff\1\55\1\uffff\1\u00e0\1\u00e1"+
        "\1\u00e2\1\u00e3\1\uffff\1\55\1\u00e5\1\55\3\uffff\5\55\3\uffff"+
        "\1\u00f0\1\u00f1\1\u00f2\1\u00f3\2\uffff\1\u00f4\4\55\1\uffff\1"+
        "\u00f9\1\u00fa\1\55\4\uffff\1\55\1\uffff\1\u00fd\1\u00fe\1\u00ff"+
        "\1\u0100\6\55\5\uffff\4\55\2\uffff\1\55\1\u010c\4\uffff\1\u010d"+
        "\4\55\1\u0112\5\55\2\uffff\1\u0118\3\55\1\uffff\4\55\1\u0120\1\uffff"+
        "\2\55\1\u0123\1\u0124\1\u0125\2\55\1\uffff\1\u0128\1\55\3\uffff"+
        "\2\55\1\uffff\1\u012c\2\55\1\uffff\12\55\1\u0139\1\u013a\2\uffff";
    static final String DFA18_eofS =
        "\u013b\uffff";
    static final String DFA18_minS =
        "\1\11\2\uffff\1\151\1\117\2\60\1\154\1\101\1\105\1\117\1\156\1\151"+
        "\1\157\1\141\1\143\1\147\1\164\1\157\1\141\1\145\1\146\1\150\1\156"+
        "\1\162\1\145\1\53\1\55\1\uffff\1\75\1\52\1\75\1\141\1\75\1\74\1"+
        "\75\1\174\1\46\11\uffff\2\56\2\uffff\1\151\1\60\1\116\2\uffff\1"+
        "\144\1\163\1\151\1\uffff\1\157\1\130\1\116\1\107\1\116\1\123\1\164"+
        "\1\156\1\162\1\141\2\156\1\165\1\151\1\157\1\141\2\60\1\147\1\162"+
        "\1\157\1\154\1\162\1\146\1\60\1\166\2\60\1\151\1\164\1\145\1\141"+
        "\15\uffff\1\144\1\170\1\156\1\75\2\uffff\1\75\11\uffff\1\56\1\156"+
        "\1\uffff\1\123\1\162\1\60\1\145\1\164\1\141\2\137\1\101\1\60\1\111"+
        "\2\60\1\164\1\160\1\60\1\164\1\60\1\145\1\156\1\163\1\156\2\uffff"+
        "\1\60\1\151\1\154\1\163\2\60\1\uffff\1\60\2\uffff\1\154\1\151\1"+
        "\141\1\165\1\144\3\60\4\uffff\1\164\1\124\1\171\1\uffff\1\146\2"+
        "\60\1\164\2\126\1\124\1\uffff\1\124\2\uffff\1\60\1\163\1\uffff\1"+
        "\151\1\uffff\4\60\1\uffff\1\156\1\60\1\145\3\uffff\1\145\1\154\1"+
        "\153\1\162\1\102\3\uffff\4\60\2\uffff\1\60\2\101\2\111\1\uffff\2"+
        "\60\1\156\4\uffff\1\147\1\uffff\4\60\2\156\1\154\1\164\1\157\1\156"+
        "\5\uffff\2\114\2\126\2\uffff\1\165\1\60\4\uffff\1\60\1\164\1\157"+
        "\1\162\1\157\1\60\2\125\2\105\1\145\2\uffff\1\60\1\141\1\151\1\154"+
        "\1\uffff\2\105\2\137\1\60\1\uffff\1\164\1\156\3\60\2\111\1\uffff"+
        "\1\60\1\147\3\uffff\2\116\1\uffff\1\60\2\106\1\uffff\2\111\2\116"+
        "\2\111\2\124\2\131\2\60\2\uffff";
    static final String DFA18_maxS =
        "\1\176\2\uffff\1\162\1\117\1\71\1\172\1\154\1\111\1\141\1\117\1"+
        "\156\1\167\1\157\1\162\1\164\1\157\1\164\3\157\1\156\1\150\1\156"+
        "\1\162\1\145\2\75\1\uffff\3\75\1\157\1\76\2\75\1\174\1\46\11\uffff"+
        "\2\71\2\uffff\1\151\1\172\1\116\2\uffff\1\164\1\163\1\151\1\uffff"+
        "\1\157\1\130\1\116\1\107\1\116\1\123\1\164\1\156\1\162\1\141\1\163"+
        "\1\156\1\165\1\151\1\157\1\141\2\172\1\147\1\162\1\157\1\154\1\162"+
        "\1\146\1\172\1\166\2\172\1\151\1\164\1\145\1\164\15\uffff\1\144"+
        "\1\170\1\156\1\75\2\uffff\1\75\11\uffff\1\71\1\156\1\uffff\1\123"+
        "\1\162\1\172\1\151\1\164\1\141\2\137\1\101\1\172\1\111\2\172\1\164"+
        "\1\160\1\172\1\164\1\172\1\145\1\156\1\163\1\156\2\uffff\1\172\1"+
        "\151\1\154\1\163\2\172\1\uffff\1\172\2\uffff\1\154\1\151\1\141\1"+
        "\165\1\144\3\172\4\uffff\1\164\1\124\1\171\1\uffff\1\146\2\172\1"+
        "\164\2\126\1\124\1\uffff\1\124\2\uffff\1\172\1\166\1\uffff\1\151"+
        "\1\uffff\4\172\1\uffff\1\156\1\172\1\145\3\uffff\1\145\1\154\1\153"+
        "\1\162\1\123\3\uffff\4\172\2\uffff\1\172\2\101\2\111\1\uffff\2\172"+
        "\1\156\4\uffff\1\147\1\uffff\4\172\2\156\1\154\1\164\1\157\1\156"+
        "\5\uffff\2\114\2\126\2\uffff\1\165\1\172\4\uffff\1\172\1\164\1\157"+
        "\1\162\1\157\1\172\2\125\2\105\1\145\2\uffff\1\172\1\141\1\151\1"+
        "\154\1\uffff\2\105\2\137\1\172\1\uffff\1\164\1\156\3\172\2\111\1"+
        "\uffff\1\172\1\147\3\uffff\2\116\1\uffff\1\172\2\106\1\uffff\2\111"+
        "\2\116\2\111\2\124\2\131\2\172\2\uffff";
    static final String DFA18_acceptS =
        "\1\uffff\1\1\1\2\31\uffff\1\63\11\uffff\1\115\1\116\1\117\1\120"+
        "\1\121\1\122\1\123\1\132\1\133\2\uffff\1\136\1\137\3\uffff\1\6\1"+
        "\135\3\uffff\1\10\40\uffff\1\60\1\105\1\57\1\62\1\106\1\61\1\104"+
        "\1\64\1\66\1\107\1\65\1\110\1\67\4\uffff\1\101\1\72\1\uffff\1\100"+
        "\1\75\1\103\1\102\1\112\1\111\1\114\1\113\1\134\2\uffff\1\7\26\uffff"+
        "\1\26\1\27\6\uffff\1\47\1\uffff\1\43\1\52\10\uffff\1\74\1\73\1\77"+
        "\1\76\3\uffff\1\42\7\uffff\1\16\1\uffff\1\17\1\20\2\uffff\1\21\1"+
        "\uffff\1\22\4\uffff\1\33\3\uffff\1\51\1\40\1\70\5\uffff\1\71\1\124"+
        "\1\125\4\uffff\1\45\1\56\5\uffff\1\30\3\uffff\1\37\1\23\1\24\1\25"+
        "\1\uffff\1\35\12\uffff\1\3\1\5\1\41\1\44\1\11\4\uffff\1\31\1\32"+
        "\2\uffff\1\36\1\46\1\50\1\53\13\uffff\1\34\1\55\4\uffff\1\4\5\uffff"+
        "\1\126\7\uffff\1\54\2\uffff\1\131\1\12\1\13\2\uffff\1\127\3\uffff"+
        "\1\130\14\uffff\1\14\1\15";
    static final String DFA18_specialS =
        "\u013b\uffff}>";
    static final String[] DFA18_transitionS = {
            "\2\62\2\uffff\1\62\22\uffff\1\62\1\35\1\56\1\61\2\uffff\1\45"+
            "\1\uffff\1\47\1\50\1\36\1\32\1\1\1\33\1\5\1\37\1\57\11\60\1"+
            "\2\1\uffff\1\42\1\43\1\41\2\uffff\1\55\1\22\1\4\2\55\1\7\2\55"+
            "\1\13\3\55\1\10\1\11\1\55\1\12\2\55\1\21\7\55\1\53\1\uffff\1"+
            "\54\1\46\1\55\1\uffff\1\17\1\30\1\15\1\24\1\6\1\23\2\55\1\25"+
            "\2\55\1\20\1\40\2\55\1\3\1\55\1\31\1\14\1\16\1\27\1\55\1\26"+
            "\3\55\1\51\1\44\1\52\1\34",
            "",
            "",
            "\1\64\10\uffff\1\63",
            "\1\65",
            "\12\67",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\13\55\1\71\1\55\1"+
            "\70\11\55\1\72\2\55",
            "\1\74",
            "\1\75\7\uffff\1\76",
            "\1\77\33\uffff\1\100",
            "\1\101",
            "\1\102",
            "\1\103\7\uffff\1\104\5\uffff\1\105",
            "\1\106",
            "\1\107\20\uffff\1\110",
            "\1\112\17\uffff\1\111\1\113",
            "\1\114\6\uffff\1\115\1\116",
            "\1\117",
            "\1\120",
            "\1\121\15\uffff\1\122",
            "\1\123\3\uffff\1\125\5\uffff\1\124",
            "\1\126\7\uffff\1\127",
            "\1\130",
            "\1\131",
            "\1\132",
            "\1\133",
            "\1\134\21\uffff\1\135",
            "\1\137\17\uffff\1\140",
            "",
            "\1\142",
            "\1\144\22\uffff\1\145",
            "\1\147",
            "\1\152\7\uffff\1\153\5\uffff\1\151",
            "\1\155\1\154",
            "\1\157\1\160",
            "\1\162",
            "\1\164",
            "\1\166",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\67\1\uffff\12\67",
            "\1\67\1\uffff\12\171",
            "",
            "",
            "\1\172",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "\1\174",
            "",
            "",
            "\1\176\17\uffff\1\175",
            "\1\177",
            "\1\u0080",
            "",
            "\1\u0081",
            "\1\u0082",
            "\1\u0083",
            "\1\u0084",
            "\1\u0085",
            "\1\u0086",
            "\1\u0087",
            "\1\u0088",
            "\1\u0089",
            "\1\u008a",
            "\1\u008c\4\uffff\1\u008b",
            "\1\u008d",
            "\1\u008e",
            "\1\u008f",
            "\1\u0090",
            "\1\u0091",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "\1\u0094",
            "\1\u0095",
            "\1\u0096",
            "\1\u0097",
            "\1\u0098",
            "\1\u0099",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "\1\u009b",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "\1\u009e",
            "\1\u009f",
            "\1\u00a0",
            "\1\u00a2\22\uffff\1\u00a1",
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
            "",
            "",
            "\1\u00a3",
            "\1\u00a4",
            "\1\u00a5",
            "\1\u00a6",
            "",
            "",
            "\1\u00a8",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\67\1\uffff\12\171",
            "\1\u00aa",
            "",
            "\1\u00ab",
            "\1\u00ac",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "\1\u00af\3\uffff\1\u00ae",
            "\1\u00b0",
            "\1\u00b1",
            "\1\u00b2",
            "\1\u00b3",
            "\1\u00b4",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "\1\u00b6",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "\1\u00b9",
            "\1\u00ba",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "\1\u00bc",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "\1\u00be",
            "\1\u00bf",
            "\1\u00c0",
            "\1\u00c1",
            "",
            "",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "\1\u00c3",
            "\1\u00c4",
            "\1\u00c5",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "",
            "",
            "\1\u00c9",
            "\1\u00ca",
            "\1\u00cb",
            "\1\u00cc",
            "\1\u00cd",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "",
            "",
            "",
            "",
            "\1\u00d1",
            "\1\u00d2",
            "\1\u00d3",
            "",
            "\1\u00d4",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "\1\u00d7",
            "\1\u00d8",
            "\1\u00d9",
            "\1\u00da",
            "",
            "\1\u00db",
            "",
            "",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "\1\u00dd\2\uffff\1\u00de",
            "",
            "\1\u00df",
            "",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "",
            "\1\u00e4",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "\1\u00e6",
            "",
            "",
            "",
            "\1\u00e7",
            "\1\u00e8",
            "\1\u00e9",
            "\1\u00ea",
            "\1\u00ee\3\uffff\1\u00ec\2\uffff\1\u00eb\11\uffff\1\u00ed",
            "",
            "",
            "",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\13\55\1\u00ef\16"+
            "\55",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "",
            "",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "\1\u00f5",
            "\1\u00f6",
            "\1\u00f7",
            "\1\u00f8",
            "",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "\1\u00fb",
            "",
            "",
            "",
            "",
            "\1\u00fc",
            "",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "\1\u0101",
            "\1\u0102",
            "\1\u0103",
            "\1\u0104",
            "\1\u0105",
            "\1\u0106",
            "",
            "",
            "",
            "",
            "",
            "\1\u0107",
            "\1\u0108",
            "\1\u0109",
            "\1\u010a",
            "",
            "",
            "\1\u010b",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "",
            "",
            "",
            "",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "\1\u010e",
            "\1\u010f",
            "\1\u0110",
            "\1\u0111",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "\1\u0113",
            "\1\u0114",
            "\1\u0115",
            "\1\u0116",
            "\1\u0117",
            "",
            "",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "\1\u0119",
            "\1\u011a",
            "\1\u011b",
            "",
            "\1\u011c",
            "\1\u011d",
            "\1\u011e",
            "\1\u011f",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "",
            "\1\u0121",
            "\1\u0122",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "\1\u0126",
            "\1\u0127",
            "",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "\1\u0129",
            "",
            "",
            "",
            "\1\u012a",
            "\1\u012b",
            "",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "\1\u012d",
            "\1\u012e",
            "",
            "\1\u012f",
            "\1\u0130",
            "\1\u0131",
            "\1\u0132",
            "\1\u0133",
            "\1\u0134",
            "\1\u0135",
            "\1\u0136",
            "\1\u0137",
            "\1\u0138",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "",
            ""
    };

    static final short[] DFA18_eot = DFA.unpackEncodedString(DFA18_eotS);
    static final short[] DFA18_eof = DFA.unpackEncodedString(DFA18_eofS);
    static final char[] DFA18_min = DFA.unpackEncodedStringToUnsignedChars(DFA18_minS);
    static final char[] DFA18_max = DFA.unpackEncodedStringToUnsignedChars(DFA18_maxS);
    static final short[] DFA18_accept = DFA.unpackEncodedString(DFA18_acceptS);
    static final short[] DFA18_special = DFA.unpackEncodedString(DFA18_specialS);
    static final short[][] DFA18_transition;

    static {
        int numStates = DFA18_transitionS.length;
        DFA18_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA18_transition[i] = DFA.unpackEncodedString(DFA18_transitionS[i]);
        }
    }

    class DFA18 extends DFA {

        public DFA18(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 18;
            this.eot = DFA18_eot;
            this.eof = DFA18_eof;
            this.min = DFA18_min;
            this.max = DFA18_max;
            this.accept = DFA18_accept;
            this.special = DFA18_special;
            this.transition = DFA18_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__71 | T__72 | T__73 | T__74 | T__75 | T__76 | T__77 | T__78 | T__79 | T__80 | T__81 | T__82 | T__83 | T__84 | T__85 | T__86 | T__87 | T__88 | T__89 | T__90 | T__91 | T__92 | T__93 | T__94 | T__95 | T__96 | T__97 | T__98 | T__99 | FALSE | TRUE | DEF_TK | ENTRY_TK | END_TK | IF_TK | ELSIF_TK | ELSE_TK | WHILE_TK | DO_TK | UNTIL_TK | FOR_TK | IN_TK | BREAK_TK | CONTINUE_TK | RETURN_TK | EXIT_TK | PLUS | PLUS_PLUS | MINUS | MINUS_MINUS | TILDE | SCREAMER | STAR | STAR_STAR | RSLASH | DIV | MOD | GT | GT_GT | GT_GT_EQ | LT | LT_LT | LT_LT_EQ | LT_EQ | GT_EQ | EQ | EQ_EQ | SCREAMER_EQ | PLUS_EQ | MINUS_EQ | STAR_EQ | RSLASH_EQ | BAR | BAR_BAR | AMP | AMP_AMP | CARET | LPAREN | RPAREN | LBRACE | RBRACE | LBRACKET | RBRACKET | MAX_TK | MIN_TK | READ_INT | READ_FLOAT | READ_STRING | READ_BOOL | ID | STRING_LITERAL | DECIMAL_LITERAL | FLOATING_POINT_LITERAL | COMMENT | WHITESPACE );";
        }
    }
 

}