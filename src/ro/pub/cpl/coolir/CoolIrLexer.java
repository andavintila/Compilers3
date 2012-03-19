// $ANTLR 3.1.1 src/ro/pub/cpl/coolir/CoolIr.g 2012-01-10 13:36:10

    package ro.pub.cpl.coolir;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class CoolIrLexer extends Lexer {
    public static final int FUNCTION=16;
    public static final int VR=36;
    public static final int LT=31;
    public static final int UNDERSLASH=38;
    public static final int STOREB=8;
    public static final int LETTER=40;
    public static final int DW=18;
    public static final int VI=37;
    public static final int DL=19;
    public static final int SUB=28;
    public static final int DS=20;
    public static final int NOT=13;
    public static final int JUMPT=10;
    public static final int EOF=-1;
    public static final int LPAREN=34;
    public static final int CODE=14;
    public static final int RPAREN=35;
    public static final int UNSIGNED_INTEGER=43;
    public static final int JUMPF=11;
    public static final int ALPHANUMERIC=42;
    public static final int RETURN=12;
    public static final int DIGIT=41;
    public static final int EQ=33;
    public static final int COMMENT=46;
    public static final int DOT=39;
    public static final int STORE=7;
    public static final int JUMP=9;
    public static final int ADD=27;
    public static final int INTEGER=23;
    public static final int T__47=47;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int LOAD=5;
    public static final int MUL=29;
    public static final int COLON=25;
    public static final int WS=44;
    public static final int NEWLINE=45;
    public static final int LABEL=24;
    public static final int DB=21;
    public static final int ASSIGN=26;
    public static final int CALL=4;
    public static final int DIV=30;
    public static final int END=17;
    public static final int LOADB=6;
    public static final int LE=32;
    public static final int DATA=15;
    public static final int STRING=22;

    // delegates
    // delegators

    public CoolIrLexer() {;} 
    public CoolIrLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public CoolIrLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "src/ro/pub/cpl/coolir/CoolIr.g"; }

    // $ANTLR start "CALL"
    public final void mCALL() throws RecognitionException {
        try {
            int _type = CALL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/ro/pub/cpl/coolir/CoolIr.g:7:6: ( 'call' )
            // src/ro/pub/cpl/coolir/CoolIr.g:7:8: 'call'
            {
            match("call"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "CALL"

    // $ANTLR start "LOAD"
    public final void mLOAD() throws RecognitionException {
        try {
            int _type = LOAD;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/ro/pub/cpl/coolir/CoolIr.g:8:6: ( 'load' )
            // src/ro/pub/cpl/coolir/CoolIr.g:8:8: 'load'
            {
            match("load"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "LOAD"

    // $ANTLR start "LOADB"
    public final void mLOADB() throws RecognitionException {
        try {
            int _type = LOADB;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/ro/pub/cpl/coolir/CoolIr.g:9:7: ( 'loadb' )
            // src/ro/pub/cpl/coolir/CoolIr.g:9:9: 'loadb'
            {
            match("loadb"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "LOADB"

    // $ANTLR start "STORE"
    public final void mSTORE() throws RecognitionException {
        try {
            int _type = STORE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/ro/pub/cpl/coolir/CoolIr.g:10:7: ( 'store' )
            // src/ro/pub/cpl/coolir/CoolIr.g:10:9: 'store'
            {
            match("store"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "STORE"

    // $ANTLR start "STOREB"
    public final void mSTOREB() throws RecognitionException {
        try {
            int _type = STOREB;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/ro/pub/cpl/coolir/CoolIr.g:11:8: ( 'storeb' )
            // src/ro/pub/cpl/coolir/CoolIr.g:11:10: 'storeb'
            {
            match("storeb"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "STOREB"

    // $ANTLR start "JUMP"
    public final void mJUMP() throws RecognitionException {
        try {
            int _type = JUMP;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/ro/pub/cpl/coolir/CoolIr.g:12:6: ( 'jump' )
            // src/ro/pub/cpl/coolir/CoolIr.g:12:8: 'jump'
            {
            match("jump"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "JUMP"

    // $ANTLR start "JUMPT"
    public final void mJUMPT() throws RecognitionException {
        try {
            int _type = JUMPT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/ro/pub/cpl/coolir/CoolIr.g:13:7: ( 'jumpt' )
            // src/ro/pub/cpl/coolir/CoolIr.g:13:9: 'jumpt'
            {
            match("jumpt"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "JUMPT"

    // $ANTLR start "JUMPF"
    public final void mJUMPF() throws RecognitionException {
        try {
            int _type = JUMPF;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/ro/pub/cpl/coolir/CoolIr.g:14:7: ( 'jumpf' )
            // src/ro/pub/cpl/coolir/CoolIr.g:14:9: 'jumpf'
            {
            match("jumpf"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "JUMPF"

    // $ANTLR start "RETURN"
    public final void mRETURN() throws RecognitionException {
        try {
            int _type = RETURN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/ro/pub/cpl/coolir/CoolIr.g:15:8: ( 'return' )
            // src/ro/pub/cpl/coolir/CoolIr.g:15:10: 'return'
            {
            match("return"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RETURN"

    // $ANTLR start "NOT"
    public final void mNOT() throws RecognitionException {
        try {
            int _type = NOT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/ro/pub/cpl/coolir/CoolIr.g:16:5: ( '~' )
            // src/ro/pub/cpl/coolir/CoolIr.g:16:7: '~'
            {
            match('~'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "NOT"

    // $ANTLR start "CODE"
    public final void mCODE() throws RecognitionException {
        try {
            int _type = CODE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/ro/pub/cpl/coolir/CoolIr.g:17:6: ( '.code' )
            // src/ro/pub/cpl/coolir/CoolIr.g:17:8: '.code'
            {
            match(".code"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "CODE"

    // $ANTLR start "DATA"
    public final void mDATA() throws RecognitionException {
        try {
            int _type = DATA;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/ro/pub/cpl/coolir/CoolIr.g:18:6: ( '.data' )
            // src/ro/pub/cpl/coolir/CoolIr.g:18:8: '.data'
            {
            match(".data"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "DATA"

    // $ANTLR start "FUNCTION"
    public final void mFUNCTION() throws RecognitionException {
        try {
            int _type = FUNCTION;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/ro/pub/cpl/coolir/CoolIr.g:19:10: ( '.function' )
            // src/ro/pub/cpl/coolir/CoolIr.g:19:12: '.function'
            {
            match(".function"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "FUNCTION"

    // $ANTLR start "END"
    public final void mEND() throws RecognitionException {
        try {
            int _type = END;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/ro/pub/cpl/coolir/CoolIr.g:20:5: ( '.end' )
            // src/ro/pub/cpl/coolir/CoolIr.g:20:7: '.end'
            {
            match(".end"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "END"

    // $ANTLR start "DW"
    public final void mDW() throws RecognitionException {
        try {
            int _type = DW;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/ro/pub/cpl/coolir/CoolIr.g:21:4: ( 'DW' )
            // src/ro/pub/cpl/coolir/CoolIr.g:21:6: 'DW'
            {
            match("DW"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "DW"

    // $ANTLR start "DL"
    public final void mDL() throws RecognitionException {
        try {
            int _type = DL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/ro/pub/cpl/coolir/CoolIr.g:22:4: ( 'DL' )
            // src/ro/pub/cpl/coolir/CoolIr.g:22:6: 'DL'
            {
            match("DL"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "DL"

    // $ANTLR start "DS"
    public final void mDS() throws RecognitionException {
        try {
            int _type = DS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/ro/pub/cpl/coolir/CoolIr.g:23:4: ( 'DS' )
            // src/ro/pub/cpl/coolir/CoolIr.g:23:6: 'DS'
            {
            match("DS"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "DS"

    // $ANTLR start "DB"
    public final void mDB() throws RecognitionException {
        try {
            int _type = DB;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/ro/pub/cpl/coolir/CoolIr.g:24:4: ( 'DB' )
            // src/ro/pub/cpl/coolir/CoolIr.g:24:6: 'DB'
            {
            match("DB"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "DB"

    // $ANTLR start "T__47"
    public final void mT__47() throws RecognitionException {
        try {
            int _type = T__47;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/ro/pub/cpl/coolir/CoolIr.g:25:7: ( ',' )
            // src/ro/pub/cpl/coolir/CoolIr.g:25:9: ','
            {
            match(','); 

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
            // src/ro/pub/cpl/coolir/CoolIr.g:26:7: ( '[' )
            // src/ro/pub/cpl/coolir/CoolIr.g:26:9: '['
            {
            match('['); 

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
            // src/ro/pub/cpl/coolir/CoolIr.g:27:7: ( ']' )
            // src/ro/pub/cpl/coolir/CoolIr.g:27:9: ']'
            {
            match(']'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__49"

    // $ANTLR start "ASSIGN"
    public final void mASSIGN() throws RecognitionException {
        try {
            int _type = ASSIGN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/ro/pub/cpl/coolir/CoolIr.g:265:13: ( '<-' )
            // src/ro/pub/cpl/coolir/CoolIr.g:265:21: '<-'
            {
            match("<-"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ASSIGN"

    // $ANTLR start "ADD"
    public final void mADD() throws RecognitionException {
        try {
            int _type = ADD;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/ro/pub/cpl/coolir/CoolIr.g:266:13: ( '+' )
            // src/ro/pub/cpl/coolir/CoolIr.g:266:21: '+'
            {
            match('+'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ADD"

    // $ANTLR start "SUB"
    public final void mSUB() throws RecognitionException {
        try {
            int _type = SUB;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/ro/pub/cpl/coolir/CoolIr.g:267:13: ( '-' )
            // src/ro/pub/cpl/coolir/CoolIr.g:267:21: '-'
            {
            match('-'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "SUB"

    // $ANTLR start "MUL"
    public final void mMUL() throws RecognitionException {
        try {
            int _type = MUL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/ro/pub/cpl/coolir/CoolIr.g:268:13: ( '*' )
            // src/ro/pub/cpl/coolir/CoolIr.g:268:21: '*'
            {
            match('*'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "MUL"

    // $ANTLR start "DIV"
    public final void mDIV() throws RecognitionException {
        try {
            int _type = DIV;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/ro/pub/cpl/coolir/CoolIr.g:269:13: ( '/' )
            // src/ro/pub/cpl/coolir/CoolIr.g:269:21: '/'
            {
            match('/'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "DIV"

    // $ANTLR start "LT"
    public final void mLT() throws RecognitionException {
        try {
            int _type = LT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/ro/pub/cpl/coolir/CoolIr.g:270:13: ( '<' )
            // src/ro/pub/cpl/coolir/CoolIr.g:270:21: '<'
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

    // $ANTLR start "LE"
    public final void mLE() throws RecognitionException {
        try {
            int _type = LE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/ro/pub/cpl/coolir/CoolIr.g:271:13: ( '<=' )
            // src/ro/pub/cpl/coolir/CoolIr.g:271:21: '<='
            {
            match("<="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "LE"

    // $ANTLR start "EQ"
    public final void mEQ() throws RecognitionException {
        try {
            int _type = EQ;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/ro/pub/cpl/coolir/CoolIr.g:272:13: ( '=' )
            // src/ro/pub/cpl/coolir/CoolIr.g:272:21: '='
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

    // $ANTLR start "COLON"
    public final void mCOLON() throws RecognitionException {
        try {
            int _type = COLON;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/ro/pub/cpl/coolir/CoolIr.g:274:13: ( ':' )
            // src/ro/pub/cpl/coolir/CoolIr.g:274:21: ':'
            {
            match(':'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "COLON"

    // $ANTLR start "UNDERSLASH"
    public final void mUNDERSLASH() throws RecognitionException {
        try {
            int _type = UNDERSLASH;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/ro/pub/cpl/coolir/CoolIr.g:275:13: ( '_' )
            // src/ro/pub/cpl/coolir/CoolIr.g:275:21: '_'
            {
            match('_'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "UNDERSLASH"

    // $ANTLR start "DOT"
    public final void mDOT() throws RecognitionException {
        try {
            int _type = DOT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/ro/pub/cpl/coolir/CoolIr.g:276:13: ( '.' )
            // src/ro/pub/cpl/coolir/CoolIr.g:276:21: '.'
            {
            match('.'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "DOT"

    // $ANTLR start "LPAREN"
    public final void mLPAREN() throws RecognitionException {
        try {
            int _type = LPAREN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/ro/pub/cpl/coolir/CoolIr.g:278:13: ( '(' )
            // src/ro/pub/cpl/coolir/CoolIr.g:278:21: '('
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
            // src/ro/pub/cpl/coolir/CoolIr.g:279:13: ( ')' )
            // src/ro/pub/cpl/coolir/CoolIr.g:279:21: ')'
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

    // $ANTLR start "LETTER"
    public final void mLETTER() throws RecognitionException {
        try {
            // src/ro/pub/cpl/coolir/CoolIr.g:281:37: ( ( 'a' .. 'z' | 'A' .. 'Z' ) )
            // src/ro/pub/cpl/coolir/CoolIr.g:281:41: ( 'a' .. 'z' | 'A' .. 'Z' )
            {
            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "LETTER"

    // $ANTLR start "DIGIT"
    public final void mDIGIT() throws RecognitionException {
        try {
            // src/ro/pub/cpl/coolir/CoolIr.g:282:37: ( ( '0' .. '9' ) )
            // src/ro/pub/cpl/coolir/CoolIr.g:282:41: ( '0' .. '9' )
            {
            // src/ro/pub/cpl/coolir/CoolIr.g:282:41: ( '0' .. '9' )
            // src/ro/pub/cpl/coolir/CoolIr.g:282:42: '0' .. '9'
            {
            matchRange('0','9'); 

            }


            }

        }
        finally {
        }
    }
    // $ANTLR end "DIGIT"

    // $ANTLR start "ALPHANUMERIC"
    public final void mALPHANUMERIC() throws RecognitionException {
        try {
            // src/ro/pub/cpl/coolir/CoolIr.g:283:37: ( ( DIGIT | LETTER ) )
            // src/ro/pub/cpl/coolir/CoolIr.g:283:41: ( DIGIT | LETTER )
            {
            // src/ro/pub/cpl/coolir/CoolIr.g:283:41: ( DIGIT | LETTER )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( ((LA1_0>='0' && LA1_0<='9')) ) {
                alt1=1;
            }
            else if ( ((LA1_0>='A' && LA1_0<='Z')||(LA1_0>='a' && LA1_0<='z')) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // src/ro/pub/cpl/coolir/CoolIr.g:283:42: DIGIT
                    {
                    mDIGIT(); 

                    }
                    break;
                case 2 :
                    // src/ro/pub/cpl/coolir/CoolIr.g:283:50: LETTER
                    {
                    mLETTER(); 

                    }
                    break;

            }


            }

        }
        finally {
        }
    }
    // $ANTLR end "ALPHANUMERIC"

    // $ANTLR start "UNSIGNED_INTEGER"
    public final void mUNSIGNED_INTEGER() throws RecognitionException {
        try {
            // src/ro/pub/cpl/coolir/CoolIr.g:284:37: ( '0' | ( ( '1' .. '9' ) ( DIGIT )* ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0=='0') ) {
                alt3=1;
            }
            else if ( ((LA3_0>='1' && LA3_0<='9')) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // src/ro/pub/cpl/coolir/CoolIr.g:284:41: '0'
                    {
                    match('0'); 

                    }
                    break;
                case 2 :
                    // src/ro/pub/cpl/coolir/CoolIr.g:284:47: ( ( '1' .. '9' ) ( DIGIT )* )
                    {
                    // src/ro/pub/cpl/coolir/CoolIr.g:284:47: ( ( '1' .. '9' ) ( DIGIT )* )
                    // src/ro/pub/cpl/coolir/CoolIr.g:284:48: ( '1' .. '9' ) ( DIGIT )*
                    {
                    // src/ro/pub/cpl/coolir/CoolIr.g:284:48: ( '1' .. '9' )
                    // src/ro/pub/cpl/coolir/CoolIr.g:284:49: '1' .. '9'
                    {
                    matchRange('1','9'); 

                    }

                    // src/ro/pub/cpl/coolir/CoolIr.g:284:59: ( DIGIT )*
                    loop2:
                    do {
                        int alt2=2;
                        int LA2_0 = input.LA(1);

                        if ( ((LA2_0>='0' && LA2_0<='9')) ) {
                            alt2=1;
                        }


                        switch (alt2) {
                    	case 1 :
                    	    // src/ro/pub/cpl/coolir/CoolIr.g:284:59: DIGIT
                    	    {
                    	    mDIGIT(); 

                    	    }
                    	    break;

                    	default :
                    	    break loop2;
                        }
                    } while (true);


                    }


                    }
                    break;

            }
        }
        finally {
        }
    }
    // $ANTLR end "UNSIGNED_INTEGER"

    // $ANTLR start "VR"
    public final void mVR() throws RecognitionException {
        try {
            int _type = VR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/ro/pub/cpl/coolir/CoolIr.g:286:25: ( 'VR' UNSIGNED_INTEGER )
            // src/ro/pub/cpl/coolir/CoolIr.g:286:29: 'VR' UNSIGNED_INTEGER
            {
            match("VR"); 

            mUNSIGNED_INTEGER(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "VR"

    // $ANTLR start "VI"
    public final void mVI() throws RecognitionException {
        try {
            int _type = VI;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/ro/pub/cpl/coolir/CoolIr.g:287:25: ( 'VI' UNSIGNED_INTEGER )
            // src/ro/pub/cpl/coolir/CoolIr.g:287:29: 'VI' UNSIGNED_INTEGER
            {
            match("VI"); 

            mUNSIGNED_INTEGER(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "VI"

    // $ANTLR start "INTEGER"
    public final void mINTEGER() throws RecognitionException {
        try {
            int _type = INTEGER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/ro/pub/cpl/coolir/CoolIr.g:288:25: ( '0' | ( ( '-' )? ( '1' .. '9' ) ( DIGIT )* ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0=='0') ) {
                alt6=1;
            }
            else if ( (LA6_0=='-'||(LA6_0>='1' && LA6_0<='9')) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // src/ro/pub/cpl/coolir/CoolIr.g:288:29: '0'
                    {
                    match('0'); 

                    }
                    break;
                case 2 :
                    // src/ro/pub/cpl/coolir/CoolIr.g:288:35: ( ( '-' )? ( '1' .. '9' ) ( DIGIT )* )
                    {
                    // src/ro/pub/cpl/coolir/CoolIr.g:288:35: ( ( '-' )? ( '1' .. '9' ) ( DIGIT )* )
                    // src/ro/pub/cpl/coolir/CoolIr.g:288:36: ( '-' )? ( '1' .. '9' ) ( DIGIT )*
                    {
                    // src/ro/pub/cpl/coolir/CoolIr.g:288:36: ( '-' )?
                    int alt4=2;
                    int LA4_0 = input.LA(1);

                    if ( (LA4_0=='-') ) {
                        alt4=1;
                    }
                    switch (alt4) {
                        case 1 :
                            // src/ro/pub/cpl/coolir/CoolIr.g:288:37: '-'
                            {
                            match('-'); 

                            }
                            break;

                    }

                    // src/ro/pub/cpl/coolir/CoolIr.g:288:43: ( '1' .. '9' )
                    // src/ro/pub/cpl/coolir/CoolIr.g:288:44: '1' .. '9'
                    {
                    matchRange('1','9'); 

                    }

                    // src/ro/pub/cpl/coolir/CoolIr.g:288:54: ( DIGIT )*
                    loop5:
                    do {
                        int alt5=2;
                        int LA5_0 = input.LA(1);

                        if ( ((LA5_0>='0' && LA5_0<='9')) ) {
                            alt5=1;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // src/ro/pub/cpl/coolir/CoolIr.g:288:54: DIGIT
                    	    {
                    	    mDIGIT(); 

                    	    }
                    	    break;

                    	default :
                    	    break loop5;
                        }
                    } while (true);


                    }


                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "INTEGER"

    // $ANTLR start "LABEL"
    public final void mLABEL() throws RecognitionException {
        try {
            int _type = LABEL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/ro/pub/cpl/coolir/CoolIr.g:289:11: ( ( LETTER | '_' ) ( ALPHANUMERIC | '_' | '.' )* )
            // src/ro/pub/cpl/coolir/CoolIr.g:289:14: ( LETTER | '_' ) ( ALPHANUMERIC | '_' | '.' )*
            {
            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // src/ro/pub/cpl/coolir/CoolIr.g:289:28: ( ALPHANUMERIC | '_' | '.' )*
            loop7:
            do {
                int alt7=4;
                switch ( input.LA(1) ) {
                case '0':
                case '1':
                case '2':
                case '3':
                case '4':
                case '5':
                case '6':
                case '7':
                case '8':
                case '9':
                case 'A':
                case 'B':
                case 'C':
                case 'D':
                case 'E':
                case 'F':
                case 'G':
                case 'H':
                case 'I':
                case 'J':
                case 'K':
                case 'L':
                case 'M':
                case 'N':
                case 'O':
                case 'P':
                case 'Q':
                case 'R':
                case 'S':
                case 'T':
                case 'U':
                case 'V':
                case 'W':
                case 'X':
                case 'Y':
                case 'Z':
                case 'a':
                case 'b':
                case 'c':
                case 'd':
                case 'e':
                case 'f':
                case 'g':
                case 'h':
                case 'i':
                case 'j':
                case 'k':
                case 'l':
                case 'm':
                case 'n':
                case 'o':
                case 'p':
                case 'q':
                case 'r':
                case 's':
                case 't':
                case 'u':
                case 'v':
                case 'w':
                case 'x':
                case 'y':
                case 'z':
                    {
                    alt7=1;
                    }
                    break;
                case '_':
                    {
                    alt7=2;
                    }
                    break;
                case '.':
                    {
                    alt7=3;
                    }
                    break;

                }

                switch (alt7) {
            	case 1 :
            	    // src/ro/pub/cpl/coolir/CoolIr.g:289:29: ALPHANUMERIC
            	    {
            	    mALPHANUMERIC(); 

            	    }
            	    break;
            	case 2 :
            	    // src/ro/pub/cpl/coolir/CoolIr.g:289:44: '_'
            	    {
            	    match('_'); 

            	    }
            	    break;
            	case 3 :
            	    // src/ro/pub/cpl/coolir/CoolIr.g:289:50: '.'
            	    {
            	    match('.'); 

            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "LABEL"

    // $ANTLR start "STRING"
    public final void mSTRING() throws RecognitionException {
        try {
            int _type = STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/ro/pub/cpl/coolir/CoolIr.g:290:25: ( '\"' ( '\"\"' | ~ ( '\"' ) )* '\"' )
            // src/ro/pub/cpl/coolir/CoolIr.g:290:29: '\"' ( '\"\"' | ~ ( '\"' ) )* '\"'
            {
            match('\"'); 
            // src/ro/pub/cpl/coolir/CoolIr.g:290:33: ( '\"\"' | ~ ( '\"' ) )*
            loop8:
            do {
                int alt8=3;
                int LA8_0 = input.LA(1);

                if ( (LA8_0=='\"') ) {
                    int LA8_1 = input.LA(2);

                    if ( (LA8_1=='\"') ) {
                        alt8=1;
                    }


                }
                else if ( ((LA8_0>='\u0000' && LA8_0<='!')||(LA8_0>='#' && LA8_0<='\uFFFF')) ) {
                    alt8=2;
                }


                switch (alt8) {
            	case 1 :
            	    // src/ro/pub/cpl/coolir/CoolIr.g:290:35: '\"\"'
            	    {
            	    match("\"\""); 


            	    }
            	    break;
            	case 2 :
            	    // src/ro/pub/cpl/coolir/CoolIr.g:290:42: ~ ( '\"' )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='!')||(input.LA(1)>='#' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop8;
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
    // $ANTLR end "STRING"

    // $ANTLR start "WS"
    public final void mWS() throws RecognitionException {
        try {
            int _type = WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/ro/pub/cpl/coolir/CoolIr.g:292:17: ( ( ' ' | '\\t' ) )
            // src/ro/pub/cpl/coolir/CoolIr.g:292:21: ( ' ' | '\\t' )
            {
            if ( input.LA(1)=='\t'||input.LA(1)==' ' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

             skip(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "WS"

    // $ANTLR start "NEWLINE"
    public final void mNEWLINE() throws RecognitionException {
        try {
            int _type = NEWLINE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/ro/pub/cpl/coolir/CoolIr.g:293:17: ( ( '\\r' )? ( '\\n' ) )
            // src/ro/pub/cpl/coolir/CoolIr.g:293:21: ( '\\r' )? ( '\\n' )
            {
            // src/ro/pub/cpl/coolir/CoolIr.g:293:21: ( '\\r' )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0=='\r') ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // src/ro/pub/cpl/coolir/CoolIr.g:293:22: '\\r'
                    {
                    match('\r'); 

                    }
                    break;

            }

            // src/ro/pub/cpl/coolir/CoolIr.g:293:29: ( '\\n' )
            // src/ro/pub/cpl/coolir/CoolIr.g:293:30: '\\n'
            {
            match('\n'); 

            }

             skip(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "NEWLINE"

    // $ANTLR start "COMMENT"
    public final void mCOMMENT() throws RecognitionException {
        try {
            int _type = COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/ro/pub/cpl/coolir/CoolIr.g:294:17: ( '#' (~ ( '\\n' | '\\r' ) )* )
            // src/ro/pub/cpl/coolir/CoolIr.g:294:21: '#' (~ ( '\\n' | '\\r' ) )*
            {
            match('#'); 
            // src/ro/pub/cpl/coolir/CoolIr.g:294:25: (~ ( '\\n' | '\\r' ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( ((LA10_0>='\u0000' && LA10_0<='\t')||(LA10_0>='\u000B' && LA10_0<='\f')||(LA10_0>='\u000E' && LA10_0<='\uFFFF')) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // src/ro/pub/cpl/coolir/CoolIr.g:294:26: ~ ( '\\n' | '\\r' )
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
            	    break loop10;
                }
            } while (true);

             skip(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "COMMENT"

    public void mTokens() throws RecognitionException {
        // src/ro/pub/cpl/coolir/CoolIr.g:1:8: ( CALL | LOAD | LOADB | STORE | STOREB | JUMP | JUMPT | JUMPF | RETURN | NOT | CODE | DATA | FUNCTION | END | DW | DL | DS | DB | T__47 | T__48 | T__49 | ASSIGN | ADD | SUB | MUL | DIV | LT | LE | EQ | COLON | UNDERSLASH | DOT | LPAREN | RPAREN | VR | VI | INTEGER | LABEL | STRING | WS | NEWLINE | COMMENT )
        int alt11=42;
        alt11 = dfa11.predict(input);
        switch (alt11) {
            case 1 :
                // src/ro/pub/cpl/coolir/CoolIr.g:1:10: CALL
                {
                mCALL(); 

                }
                break;
            case 2 :
                // src/ro/pub/cpl/coolir/CoolIr.g:1:15: LOAD
                {
                mLOAD(); 

                }
                break;
            case 3 :
                // src/ro/pub/cpl/coolir/CoolIr.g:1:20: LOADB
                {
                mLOADB(); 

                }
                break;
            case 4 :
                // src/ro/pub/cpl/coolir/CoolIr.g:1:26: STORE
                {
                mSTORE(); 

                }
                break;
            case 5 :
                // src/ro/pub/cpl/coolir/CoolIr.g:1:32: STOREB
                {
                mSTOREB(); 

                }
                break;
            case 6 :
                // src/ro/pub/cpl/coolir/CoolIr.g:1:39: JUMP
                {
                mJUMP(); 

                }
                break;
            case 7 :
                // src/ro/pub/cpl/coolir/CoolIr.g:1:44: JUMPT
                {
                mJUMPT(); 

                }
                break;
            case 8 :
                // src/ro/pub/cpl/coolir/CoolIr.g:1:50: JUMPF
                {
                mJUMPF(); 

                }
                break;
            case 9 :
                // src/ro/pub/cpl/coolir/CoolIr.g:1:56: RETURN
                {
                mRETURN(); 

                }
                break;
            case 10 :
                // src/ro/pub/cpl/coolir/CoolIr.g:1:63: NOT
                {
                mNOT(); 

                }
                break;
            case 11 :
                // src/ro/pub/cpl/coolir/CoolIr.g:1:67: CODE
                {
                mCODE(); 

                }
                break;
            case 12 :
                // src/ro/pub/cpl/coolir/CoolIr.g:1:72: DATA
                {
                mDATA(); 

                }
                break;
            case 13 :
                // src/ro/pub/cpl/coolir/CoolIr.g:1:77: FUNCTION
                {
                mFUNCTION(); 

                }
                break;
            case 14 :
                // src/ro/pub/cpl/coolir/CoolIr.g:1:86: END
                {
                mEND(); 

                }
                break;
            case 15 :
                // src/ro/pub/cpl/coolir/CoolIr.g:1:90: DW
                {
                mDW(); 

                }
                break;
            case 16 :
                // src/ro/pub/cpl/coolir/CoolIr.g:1:93: DL
                {
                mDL(); 

                }
                break;
            case 17 :
                // src/ro/pub/cpl/coolir/CoolIr.g:1:96: DS
                {
                mDS(); 

                }
                break;
            case 18 :
                // src/ro/pub/cpl/coolir/CoolIr.g:1:99: DB
                {
                mDB(); 

                }
                break;
            case 19 :
                // src/ro/pub/cpl/coolir/CoolIr.g:1:102: T__47
                {
                mT__47(); 

                }
                break;
            case 20 :
                // src/ro/pub/cpl/coolir/CoolIr.g:1:108: T__48
                {
                mT__48(); 

                }
                break;
            case 21 :
                // src/ro/pub/cpl/coolir/CoolIr.g:1:114: T__49
                {
                mT__49(); 

                }
                break;
            case 22 :
                // src/ro/pub/cpl/coolir/CoolIr.g:1:120: ASSIGN
                {
                mASSIGN(); 

                }
                break;
            case 23 :
                // src/ro/pub/cpl/coolir/CoolIr.g:1:127: ADD
                {
                mADD(); 

                }
                break;
            case 24 :
                // src/ro/pub/cpl/coolir/CoolIr.g:1:131: SUB
                {
                mSUB(); 

                }
                break;
            case 25 :
                // src/ro/pub/cpl/coolir/CoolIr.g:1:135: MUL
                {
                mMUL(); 

                }
                break;
            case 26 :
                // src/ro/pub/cpl/coolir/CoolIr.g:1:139: DIV
                {
                mDIV(); 

                }
                break;
            case 27 :
                // src/ro/pub/cpl/coolir/CoolIr.g:1:143: LT
                {
                mLT(); 

                }
                break;
            case 28 :
                // src/ro/pub/cpl/coolir/CoolIr.g:1:146: LE
                {
                mLE(); 

                }
                break;
            case 29 :
                // src/ro/pub/cpl/coolir/CoolIr.g:1:149: EQ
                {
                mEQ(); 

                }
                break;
            case 30 :
                // src/ro/pub/cpl/coolir/CoolIr.g:1:152: COLON
                {
                mCOLON(); 

                }
                break;
            case 31 :
                // src/ro/pub/cpl/coolir/CoolIr.g:1:158: UNDERSLASH
                {
                mUNDERSLASH(); 

                }
                break;
            case 32 :
                // src/ro/pub/cpl/coolir/CoolIr.g:1:169: DOT
                {
                mDOT(); 

                }
                break;
            case 33 :
                // src/ro/pub/cpl/coolir/CoolIr.g:1:173: LPAREN
                {
                mLPAREN(); 

                }
                break;
            case 34 :
                // src/ro/pub/cpl/coolir/CoolIr.g:1:180: RPAREN
                {
                mRPAREN(); 

                }
                break;
            case 35 :
                // src/ro/pub/cpl/coolir/CoolIr.g:1:187: VR
                {
                mVR(); 

                }
                break;
            case 36 :
                // src/ro/pub/cpl/coolir/CoolIr.g:1:190: VI
                {
                mVI(); 

                }
                break;
            case 37 :
                // src/ro/pub/cpl/coolir/CoolIr.g:1:193: INTEGER
                {
                mINTEGER(); 

                }
                break;
            case 38 :
                // src/ro/pub/cpl/coolir/CoolIr.g:1:201: LABEL
                {
                mLABEL(); 

                }
                break;
            case 39 :
                // src/ro/pub/cpl/coolir/CoolIr.g:1:207: STRING
                {
                mSTRING(); 

                }
                break;
            case 40 :
                // src/ro/pub/cpl/coolir/CoolIr.g:1:214: WS
                {
                mWS(); 

                }
                break;
            case 41 :
                // src/ro/pub/cpl/coolir/CoolIr.g:1:217: NEWLINE
                {
                mNEWLINE(); 

                }
                break;
            case 42 :
                // src/ro/pub/cpl/coolir/CoolIr.g:1:225: COMMENT
                {
                mCOMMENT(); 

                }
                break;

        }

    }


    protected DFA11 dfa11 = new DFA11(this);
    static final String DFA11_eotS =
        "\1\uffff\5\30\1\uffff\1\46\1\30\3\uffff\1\55\1\uffff\1\56\4\uffff"+
        "\1\57\2\uffff\1\30\6\uffff\5\30\5\uffff\1\67\1\70\1\71\1\72\5\uffff"+
        "\7\30\4\uffff\2\104\2\106\1\110\1\112\1\30\1\116\1\30\1\uffff\1"+
        "\104\1\uffff\1\106\1\uffff\1\120\1\uffff\1\122\1\123\1\124\1\uffff"+
        "\1\30\1\uffff\1\126\3\uffff\1\127\2\uffff";
    static final String DFA11_eofS =
        "\130\uffff";
    static final String DFA11_minS =
        "\1\11\1\141\1\157\1\164\1\165\1\145\1\uffff\1\143\1\102\3\uffff"+
        "\1\55\1\uffff\1\61\4\uffff\1\56\2\uffff\1\111\6\uffff\1\154\1\141"+
        "\1\157\1\155\1\164\5\uffff\4\56\5\uffff\2\60\1\154\1\144\1\162\1"+
        "\160\1\165\4\uffff\6\56\1\145\1\56\1\162\1\uffff\1\56\1\uffff\1"+
        "\56\1\uffff\1\56\1\uffff\3\56\1\uffff\1\156\1\uffff\1\56\3\uffff"+
        "\1\56\2\uffff";
    static final String DFA11_maxS =
        "\1\176\1\141\1\157\1\164\1\165\1\145\1\uffff\1\146\1\127\3\uffff"+
        "\1\75\1\uffff\1\71\4\uffff\1\172\2\uffff\1\122\6\uffff\1\154\1\141"+
        "\1\157\1\155\1\164\5\uffff\4\172\5\uffff\2\71\1\154\1\144\1\162"+
        "\1\160\1\165\4\uffff\6\172\1\145\1\172\1\162\1\uffff\1\172\1\uffff"+
        "\1\172\1\uffff\1\172\1\uffff\3\172\1\uffff\1\156\1\uffff\1\172\3"+
        "\uffff\1\172\2\uffff";
    static final String DFA11_acceptS =
        "\6\uffff\1\12\2\uffff\1\23\1\24\1\25\1\uffff\1\27\1\uffff\1\31\1"+
        "\32\1\35\1\36\1\uffff\1\41\1\42\1\uffff\1\45\1\46\1\47\1\50\1\51"+
        "\1\52\5\uffff\1\13\1\14\1\15\1\16\1\40\4\uffff\1\26\1\34\1\33\1"+
        "\30\1\37\7\uffff\1\17\1\20\1\21\1\22\11\uffff\1\43\1\uffff\1\44"+
        "\1\uffff\1\1\1\uffff\1\2\3\uffff\1\6\1\uffff\1\3\1\uffff\1\4\1\7"+
        "\1\10\1\uffff\1\5\1\11";
    static final String DFA11_specialS =
        "\130\uffff}>";
    static final String[] DFA11_transitionS = {
            "\1\32\1\33\2\uffff\1\33\22\uffff\1\32\1\uffff\1\31\1\34\4\uffff"+
            "\1\24\1\25\1\17\1\15\1\11\1\16\1\7\1\20\12\27\1\22\1\uffff\1"+
            "\14\1\21\3\uffff\3\30\1\10\21\30\1\26\4\30\1\12\1\uffff\1\13"+
            "\1\uffff\1\23\1\uffff\2\30\1\1\6\30\1\4\1\30\1\2\5\30\1\5\1"+
            "\3\7\30\3\uffff\1\6",
            "\1\35",
            "\1\36",
            "\1\37",
            "\1\40",
            "\1\41",
            "",
            "\1\42\1\43\1\45\1\44",
            "\1\52\11\uffff\1\50\6\uffff\1\51\3\uffff\1\47",
            "",
            "",
            "",
            "\1\53\17\uffff\1\54",
            "",
            "\11\27",
            "",
            "",
            "",
            "",
            "\1\30\1\uffff\12\30\7\uffff\32\30\4\uffff\1\30\1\uffff\32\30",
            "",
            "",
            "\1\61\10\uffff\1\60",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\62",
            "\1\63",
            "\1\64",
            "\1\65",
            "\1\66",
            "",
            "",
            "",
            "",
            "",
            "\1\30\1\uffff\12\30\7\uffff\32\30\4\uffff\1\30\1\uffff\32\30",
            "\1\30\1\uffff\12\30\7\uffff\32\30\4\uffff\1\30\1\uffff\32\30",
            "\1\30\1\uffff\12\30\7\uffff\32\30\4\uffff\1\30\1\uffff\32\30",
            "\1\30\1\uffff\12\30\7\uffff\32\30\4\uffff\1\30\1\uffff\32\30",
            "",
            "",
            "",
            "",
            "",
            "\1\73\11\74",
            "\1\75\11\76",
            "\1\77",
            "\1\100",
            "\1\101",
            "\1\102",
            "\1\103",
            "",
            "",
            "",
            "",
            "\1\30\1\uffff\12\30\7\uffff\32\30\4\uffff\1\30\1\uffff\32\30",
            "\1\30\1\uffff\12\105\7\uffff\32\30\4\uffff\1\30\1\uffff\32"+
            "\30",
            "\1\30\1\uffff\12\30\7\uffff\32\30\4\uffff\1\30\1\uffff\32\30",
            "\1\30\1\uffff\12\107\7\uffff\32\30\4\uffff\1\30\1\uffff\32"+
            "\30",
            "\1\30\1\uffff\12\30\7\uffff\32\30\4\uffff\1\30\1\uffff\32\30",
            "\1\30\1\uffff\12\30\7\uffff\32\30\4\uffff\1\30\1\uffff\1\30"+
            "\1\111\30\30",
            "\1\113",
            "\1\30\1\uffff\12\30\7\uffff\32\30\4\uffff\1\30\1\uffff\5\30"+
            "\1\115\15\30\1\114\6\30",
            "\1\117",
            "",
            "\1\30\1\uffff\12\105\7\uffff\32\30\4\uffff\1\30\1\uffff\32"+
            "\30",
            "",
            "\1\30\1\uffff\12\107\7\uffff\32\30\4\uffff\1\30\1\uffff\32"+
            "\30",
            "",
            "\1\30\1\uffff\12\30\7\uffff\32\30\4\uffff\1\30\1\uffff\32\30",
            "",
            "\1\30\1\uffff\12\30\7\uffff\32\30\4\uffff\1\30\1\uffff\1\30"+
            "\1\121\30\30",
            "\1\30\1\uffff\12\30\7\uffff\32\30\4\uffff\1\30\1\uffff\32\30",
            "\1\30\1\uffff\12\30\7\uffff\32\30\4\uffff\1\30\1\uffff\32\30",
            "",
            "\1\125",
            "",
            "\1\30\1\uffff\12\30\7\uffff\32\30\4\uffff\1\30\1\uffff\32\30",
            "",
            "",
            "",
            "\1\30\1\uffff\12\30\7\uffff\32\30\4\uffff\1\30\1\uffff\32\30",
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
            return "1:1: Tokens : ( CALL | LOAD | LOADB | STORE | STOREB | JUMP | JUMPT | JUMPF | RETURN | NOT | CODE | DATA | FUNCTION | END | DW | DL | DS | DB | T__47 | T__48 | T__49 | ASSIGN | ADD | SUB | MUL | DIV | LT | LE | EQ | COLON | UNDERSLASH | DOT | LPAREN | RPAREN | VR | VI | INTEGER | LABEL | STRING | WS | NEWLINE | COMMENT );";
        }
    }
 

}