// $ANTLR 3.1.1 src/ro/pub/cpl/coolir/CoolIr.g 2012-01-10 13:36:09

    package ro.pub.cpl.coolir;
    import java.util.List;
    import java.util.ArrayList;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class CoolIrParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "CALL", "LOAD", "LOADB", "STORE", "STOREB", "JUMP", "JUMPT", "JUMPF", "RETURN", "NOT", "CODE", "DATA", "FUNCTION", "END", "DW", "DL", "DS", "DB", "STRING", "INTEGER", "LABEL", "COLON", "ASSIGN", "ADD", "SUB", "MUL", "DIV", "LT", "LE", "EQ", "LPAREN", "RPAREN", "VR", "VI", "UNDERSLASH", "DOT", "LETTER", "DIGIT", "ALPHANUMERIC", "UNSIGNED_INTEGER", "WS", "NEWLINE", "COMMENT", "','", "'['", "']'"
    };
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
    public static final int NOT=13;
    public static final int DS=20;
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
    public static final int DATA=15;
    public static final int LE=32;
    public static final int STRING=22;

    // delegates
    // delegators


        public CoolIrParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public CoolIrParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return CoolIrParser.tokenNames; }
    public String getGrammarFileName() { return "src/ro/pub/cpl/coolir/CoolIr.g"; }





    // $ANTLR start "program"
    // src/ro/pub/cpl/coolir/CoolIr.g:37:1: program returns [Program result] : cs= codeSection ds= dataSection ;
    public final Program program() throws RecognitionException {
        Program result = null;

        List<Method> cs = null;

        List<DataDirective> ds = null;


        try {
            // src/ro/pub/cpl/coolir/CoolIr.g:38:5: (cs= codeSection ds= dataSection )
            // src/ro/pub/cpl/coolir/CoolIr.g:38:9: cs= codeSection ds= dataSection
            {
            pushFollow(FOLLOW_codeSection_in_program626);
            cs=codeSection();

            state._fsp--;

            pushFollow(FOLLOW_dataSection_in_program632);
            ds=dataSection();

            state._fsp--;


                    result = new Program(cs, ds);
                

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return result;
    }
    // $ANTLR end "program"


    // $ANTLR start "codeSection"
    // src/ro/pub/cpl/coolir/CoolIr.g:43:1: codeSection returns [List<Method> result] : CODE (md= method )* ;
    public final List<Method> codeSection() throws RecognitionException {
        List<Method> result = null;

        Method md = null;



                result = new ArrayList<Method>();
            
        try {
            // src/ro/pub/cpl/coolir/CoolIr.g:47:5: ( CODE (md= method )* )
            // src/ro/pub/cpl/coolir/CoolIr.g:47:9: CODE (md= method )*
            {
            match(input,CODE,FOLLOW_CODE_in_codeSection666); 
            // src/ro/pub/cpl/coolir/CoolIr.g:47:14: (md= method )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==FUNCTION) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // src/ro/pub/cpl/coolir/CoolIr.g:47:15: md= method
            	    {
            	    pushFollow(FOLLOW_method_in_codeSection673);
            	    md=method();

            	    state._fsp--;

            	     result.add(md); 

            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return result;
    }
    // $ANTLR end "codeSection"


    // $ANTLR start "method"
    // src/ro/pub/cpl/coolir/CoolIr.g:50:1: method returns [Method result] : FUNCTION fn= STRING ',' inCount= INTEGER ',' outCount= INTEGER il= instructionList END ;
    public final Method method() throws RecognitionException {
        Method result = null;

        Token fn=null;
        Token inCount=null;
        Token outCount=null;
        List<Instruction> il = null;


        try {
            // src/ro/pub/cpl/coolir/CoolIr.g:51:5: ( FUNCTION fn= STRING ',' inCount= INTEGER ',' outCount= INTEGER il= instructionList END )
            // src/ro/pub/cpl/coolir/CoolIr.g:51:9: FUNCTION fn= STRING ',' inCount= INTEGER ',' outCount= INTEGER il= instructionList END
            {
            match(input,FUNCTION,FOLLOW_FUNCTION_in_method700); 
            fn=(Token)match(input,STRING,FOLLOW_STRING_in_method706); 
            match(input,47,FOLLOW_47_in_method708); 
            inCount=(Token)match(input,INTEGER,FOLLOW_INTEGER_in_method714); 
            match(input,47,FOLLOW_47_in_method716); 
            outCount=(Token)match(input,INTEGER,FOLLOW_INTEGER_in_method722); 
            pushFollow(FOLLOW_instructionList_in_method728);
            il=instructionList();

            state._fsp--;

            match(input,END,FOLLOW_END_in_method730); 

                    result = new Method(fn.getText().substring(1, fn.getText().length()-1), 
                    	Integer.parseInt(inCount.getText()), 
                    	Integer.parseInt(outCount.getText()), 
                    	il);
                

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return result;
    }
    // $ANTLR end "method"


    // $ANTLR start "instructionList"
    // src/ro/pub/cpl/coolir/CoolIr.g:59:1: instructionList returns [List<Instruction> result] : (i= instruction )* ;
    public final List<Instruction> instructionList() throws RecognitionException {
        List<Instruction> result = null;

        Instruction i = null;



                result = new ArrayList<Instruction>();
            
        try {
            // src/ro/pub/cpl/coolir/CoolIr.g:63:5: ( (i= instruction )* )
            // src/ro/pub/cpl/coolir/CoolIr.g:63:9: (i= instruction )*
            {
            // src/ro/pub/cpl/coolir/CoolIr.g:63:9: (i= instruction )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>=CALL && LA2_0<=RETURN)||LA2_0==LABEL||LA2_0==LPAREN||LA2_0==VR) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // src/ro/pub/cpl/coolir/CoolIr.g:63:10: i= instruction
            	    {
            	    pushFollow(FOLLOW_instruction_in_instructionList770);
            	    i=instruction();

            	    state._fsp--;

            	     result.add(i); 

            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return result;
    }
    // $ANTLR end "instructionList"


    // $ANTLR start "instruction"
    // src/ro/pub/cpl/coolir/CoolIr.g:66:1: instruction returns [Instruction result] : (rl= LABEL COLON )* (cpi= copyInstruction | ai= arithmeticalInstruction | li= logicalInstruction | ci= callInstruction | ji= jumpInstruction | ri= returnInstruction | mi= memoryInstruction ) ;
    public final Instruction instruction() throws RecognitionException {
        Instruction result = null;

        Token rl=null;
        CopyInstruction cpi = null;

        ArithmeticalInstruction ai = null;

        LogicalInstruction li = null;

        CallInstruction ci = null;

        Instruction ji = null;

        Instruction ri = null;

        MemoryInstruction mi = null;



                List<String> labels = new ArrayList<String>();
            
        try {
            // src/ro/pub/cpl/coolir/CoolIr.g:73:5: ( (rl= LABEL COLON )* (cpi= copyInstruction | ai= arithmeticalInstruction | li= logicalInstruction | ci= callInstruction | ji= jumpInstruction | ri= returnInstruction | mi= memoryInstruction ) )
            // src/ro/pub/cpl/coolir/CoolIr.g:73:9: (rl= LABEL COLON )* (cpi= copyInstruction | ai= arithmeticalInstruction | li= logicalInstruction | ci= callInstruction | ji= jumpInstruction | ri= returnInstruction | mi= memoryInstruction )
            {
            // src/ro/pub/cpl/coolir/CoolIr.g:73:9: (rl= LABEL COLON )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==LABEL) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // src/ro/pub/cpl/coolir/CoolIr.g:73:13: rl= LABEL COLON
            	    {
            	    rl=(Token)match(input,LABEL,FOLLOW_LABEL_in_instruction823); 
            	    match(input,COLON,FOLLOW_COLON_in_instruction825); 
            	     labels.add(rl.getText()); 

            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            // src/ro/pub/cpl/coolir/CoolIr.g:74:9: (cpi= copyInstruction | ai= arithmeticalInstruction | li= logicalInstruction | ci= callInstruction | ji= jumpInstruction | ri= returnInstruction | mi= memoryInstruction )
            int alt4=7;
            alt4 = dfa4.predict(input);
            switch (alt4) {
                case 1 :
                    // src/ro/pub/cpl/coolir/CoolIr.g:74:13: cpi= copyInstruction
                    {
                    pushFollow(FOLLOW_copyInstruction_in_instruction847);
                    cpi=copyInstruction();

                    state._fsp--;

                     result = cpi; 

                    }
                    break;
                case 2 :
                    // src/ro/pub/cpl/coolir/CoolIr.g:75:13: ai= arithmeticalInstruction
                    {
                    pushFollow(FOLLOW_arithmeticalInstruction_in_instruction867);
                    ai=arithmeticalInstruction();

                    state._fsp--;

                     result = ai; 

                    }
                    break;
                case 3 :
                    // src/ro/pub/cpl/coolir/CoolIr.g:76:13: li= logicalInstruction
                    {
                    pushFollow(FOLLOW_logicalInstruction_in_instruction887);
                    li=logicalInstruction();

                    state._fsp--;

                     result = li; 

                    }
                    break;
                case 4 :
                    // src/ro/pub/cpl/coolir/CoolIr.g:77:13: ci= callInstruction
                    {
                    pushFollow(FOLLOW_callInstruction_in_instruction907);
                    ci=callInstruction();

                    state._fsp--;

                     result = ci; 

                    }
                    break;
                case 5 :
                    // src/ro/pub/cpl/coolir/CoolIr.g:78:13: ji= jumpInstruction
                    {
                    pushFollow(FOLLOW_jumpInstruction_in_instruction927);
                    ji=jumpInstruction();

                    state._fsp--;

                     result = ji; 

                    }
                    break;
                case 6 :
                    // src/ro/pub/cpl/coolir/CoolIr.g:79:7: ri= returnInstruction
                    {
                    pushFollow(FOLLOW_returnInstruction_in_instruction941);
                    ri=returnInstruction();

                    state._fsp--;

                     result = ri; 

                    }
                    break;
                case 7 :
                    // src/ro/pub/cpl/coolir/CoolIr.g:80:13: mi= memoryInstruction
                    {
                    pushFollow(FOLLOW_memoryInstruction_in_instruction961);
                    mi=memoryInstruction();

                    state._fsp--;

                     result = mi; 

                    }
                    break;

            }


            }


                    result.setLabels(labels);
                
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return result;
    }
    // $ANTLR end "instruction"


    // $ANTLR start "copyInstruction"
    // src/ro/pub/cpl/coolir/CoolIr.g:84:1: copyInstruction returns [CopyInstruction result] : (rg= register ASSIGN op= operand | rg= register ASSIGN irg= inRegister | rg= register ASSIGN rl= LABEL );
    public final CopyInstruction copyInstruction() throws RecognitionException {
        CopyInstruction result = null;

        Token rl=null;
        Register rg = null;

        Operand op = null;

        InRegister irg = null;


        try {
            // src/ro/pub/cpl/coolir/CoolIr.g:85:5: (rg= register ASSIGN op= operand | rg= register ASSIGN irg= inRegister | rg= register ASSIGN rl= LABEL )
            int alt5=3;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==VR) ) {
                int LA5_1 = input.LA(2);

                if ( (LA5_1==ASSIGN) ) {
                    switch ( input.LA(3) ) {
                    case LABEL:
                        {
                        alt5=3;
                        }
                        break;
                    case VI:
                        {
                        alt5=2;
                        }
                        break;
                    case INTEGER:
                    case VR:
                        {
                        alt5=1;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 5, 2, input);

                        throw nvae;
                    }

                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 5, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // src/ro/pub/cpl/coolir/CoolIr.g:85:9: rg= register ASSIGN op= operand
                    {
                    pushFollow(FOLLOW_register_in_copyInstruction1000);
                    rg=register();

                    state._fsp--;

                    match(input,ASSIGN,FOLLOW_ASSIGN_in_copyInstruction1002); 
                    pushFollow(FOLLOW_operand_in_copyInstruction1008);
                    op=operand();

                    state._fsp--;


                            result = new CopyInstruction(rg, op);
                        

                    }
                    break;
                case 2 :
                    // src/ro/pub/cpl/coolir/CoolIr.g:88:9: rg= register ASSIGN irg= inRegister
                    {
                    pushFollow(FOLLOW_register_in_copyInstruction1024);
                    rg=register();

                    state._fsp--;

                    match(input,ASSIGN,FOLLOW_ASSIGN_in_copyInstruction1026); 
                    pushFollow(FOLLOW_inRegister_in_copyInstruction1032);
                    irg=inRegister();

                    state._fsp--;


                            result = new CopyInstruction(rg, irg);
                        

                    }
                    break;
                case 3 :
                    // src/ro/pub/cpl/coolir/CoolIr.g:91:9: rg= register ASSIGN rl= LABEL
                    {
                    pushFollow(FOLLOW_register_in_copyInstruction1048);
                    rg=register();

                    state._fsp--;

                    match(input,ASSIGN,FOLLOW_ASSIGN_in_copyInstruction1050); 
                    rl=(Token)match(input,LABEL,FOLLOW_LABEL_in_copyInstruction1056); 

                        	result = new CopyInstruction(rg, rl.getText());
                        

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return result;
    }
    // $ANTLR end "copyInstruction"


    // $ANTLR start "arithmeticalInstruction"
    // src/ro/pub/cpl/coolir/CoolIr.g:96:1: arithmeticalInstruction returns [ArithmeticalInstruction result] : (rg= register ASSIGN lop= operand ADD rop= operand | rg= register ASSIGN lop= operand SUB rop= operand | rg= register ASSIGN lop= operand MUL rop= operand | rg= register ASSIGN lop= operand DIV rop= operand );
    public final ArithmeticalInstruction arithmeticalInstruction() throws RecognitionException {
        ArithmeticalInstruction result = null;

        Register rg = null;

        Operand lop = null;

        Operand rop = null;


        try {
            // src/ro/pub/cpl/coolir/CoolIr.g:97:5: (rg= register ASSIGN lop= operand ADD rop= operand | rg= register ASSIGN lop= operand SUB rop= operand | rg= register ASSIGN lop= operand MUL rop= operand | rg= register ASSIGN lop= operand DIV rop= operand )
            int alt6=4;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==VR) ) {
                int LA6_1 = input.LA(2);

                if ( (LA6_1==ASSIGN) ) {
                    int LA6_2 = input.LA(3);

                    if ( (LA6_2==INTEGER) ) {
                        switch ( input.LA(4) ) {
                        case ADD:
                            {
                            alt6=1;
                            }
                            break;
                        case SUB:
                            {
                            alt6=2;
                            }
                            break;
                        case MUL:
                            {
                            alt6=3;
                            }
                            break;
                        case DIV:
                            {
                            alt6=4;
                            }
                            break;
                        default:
                            NoViableAltException nvae =
                                new NoViableAltException("", 6, 3, input);

                            throw nvae;
                        }

                    }
                    else if ( (LA6_2==VR) ) {
                        switch ( input.LA(4) ) {
                        case ADD:
                            {
                            alt6=1;
                            }
                            break;
                        case SUB:
                            {
                            alt6=2;
                            }
                            break;
                        case MUL:
                            {
                            alt6=3;
                            }
                            break;
                        case DIV:
                            {
                            alt6=4;
                            }
                            break;
                        default:
                            NoViableAltException nvae =
                                new NoViableAltException("", 6, 4, input);

                            throw nvae;
                        }

                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 6, 2, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 6, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // src/ro/pub/cpl/coolir/CoolIr.g:97:9: rg= register ASSIGN lop= operand ADD rop= operand
                    {
                    pushFollow(FOLLOW_register_in_arithmeticalInstruction1085);
                    rg=register();

                    state._fsp--;

                    match(input,ASSIGN,FOLLOW_ASSIGN_in_arithmeticalInstruction1087); 
                    pushFollow(FOLLOW_operand_in_arithmeticalInstruction1093);
                    lop=operand();

                    state._fsp--;

                    match(input,ADD,FOLLOW_ADD_in_arithmeticalInstruction1095); 
                    pushFollow(FOLLOW_operand_in_arithmeticalInstruction1101);
                    rop=operand();

                    state._fsp--;


                            result = new ArithmeticalInstruction(
                                    ArithmeticalInstruction.OPERATION.ADD, rg,
                                    lop, rop);
                        

                    }
                    break;
                case 2 :
                    // src/ro/pub/cpl/coolir/CoolIr.g:102:9: rg= register ASSIGN lop= operand SUB rop= operand
                    {
                    pushFollow(FOLLOW_register_in_arithmeticalInstruction1117);
                    rg=register();

                    state._fsp--;

                    match(input,ASSIGN,FOLLOW_ASSIGN_in_arithmeticalInstruction1119); 
                    pushFollow(FOLLOW_operand_in_arithmeticalInstruction1125);
                    lop=operand();

                    state._fsp--;

                    match(input,SUB,FOLLOW_SUB_in_arithmeticalInstruction1127); 
                    pushFollow(FOLLOW_operand_in_arithmeticalInstruction1133);
                    rop=operand();

                    state._fsp--;


                            result = new ArithmeticalInstruction(
                                    ArithmeticalInstruction.OPERATION.SUB, rg,
                                    lop, rop);
                        

                    }
                    break;
                case 3 :
                    // src/ro/pub/cpl/coolir/CoolIr.g:107:9: rg= register ASSIGN lop= operand MUL rop= operand
                    {
                    pushFollow(FOLLOW_register_in_arithmeticalInstruction1149);
                    rg=register();

                    state._fsp--;

                    match(input,ASSIGN,FOLLOW_ASSIGN_in_arithmeticalInstruction1151); 
                    pushFollow(FOLLOW_operand_in_arithmeticalInstruction1157);
                    lop=operand();

                    state._fsp--;

                    match(input,MUL,FOLLOW_MUL_in_arithmeticalInstruction1159); 
                    pushFollow(FOLLOW_operand_in_arithmeticalInstruction1165);
                    rop=operand();

                    state._fsp--;


                            result = new ArithmeticalInstruction(
                                    ArithmeticalInstruction.OPERATION.MUL, rg,
                                    lop, rop);
                        

                    }
                    break;
                case 4 :
                    // src/ro/pub/cpl/coolir/CoolIr.g:112:9: rg= register ASSIGN lop= operand DIV rop= operand
                    {
                    pushFollow(FOLLOW_register_in_arithmeticalInstruction1181);
                    rg=register();

                    state._fsp--;

                    match(input,ASSIGN,FOLLOW_ASSIGN_in_arithmeticalInstruction1183); 
                    pushFollow(FOLLOW_operand_in_arithmeticalInstruction1189);
                    lop=operand();

                    state._fsp--;

                    match(input,DIV,FOLLOW_DIV_in_arithmeticalInstruction1191); 
                    pushFollow(FOLLOW_operand_in_arithmeticalInstruction1197);
                    rop=operand();

                    state._fsp--;


                            result = new ArithmeticalInstruction(
                                    ArithmeticalInstruction.OPERATION.DIV, rg,
                                    lop, rop);
                        

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return result;
    }
    // $ANTLR end "arithmeticalInstruction"


    // $ANTLR start "logicalInstruction"
    // src/ro/pub/cpl/coolir/CoolIr.g:119:1: logicalInstruction returns [LogicalInstruction result] : (rg= register ASSIGN NOT op= operand | rg= register ASSIGN lop= operand LT rop= operand | rg= register ASSIGN lop= operand LE rop= operand | rg= register ASSIGN lop= operand EQ rop= operand );
    public final LogicalInstruction logicalInstruction() throws RecognitionException {
        LogicalInstruction result = null;

        Register rg = null;

        Operand op = null;

        Operand lop = null;

        Operand rop = null;


        try {
            // src/ro/pub/cpl/coolir/CoolIr.g:120:5: (rg= register ASSIGN NOT op= operand | rg= register ASSIGN lop= operand LT rop= operand | rg= register ASSIGN lop= operand LE rop= operand | rg= register ASSIGN lop= operand EQ rop= operand )
            int alt7=4;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==VR) ) {
                int LA7_1 = input.LA(2);

                if ( (LA7_1==ASSIGN) ) {
                    switch ( input.LA(3) ) {
                    case NOT:
                        {
                        alt7=1;
                        }
                        break;
                    case INTEGER:
                        {
                        switch ( input.LA(4) ) {
                        case LT:
                            {
                            alt7=2;
                            }
                            break;
                        case EQ:
                            {
                            alt7=4;
                            }
                            break;
                        case LE:
                            {
                            alt7=3;
                            }
                            break;
                        default:
                            NoViableAltException nvae =
                                new NoViableAltException("", 7, 4, input);

                            throw nvae;
                        }

                        }
                        break;
                    case VR:
                        {
                        switch ( input.LA(4) ) {
                        case LT:
                            {
                            alt7=2;
                            }
                            break;
                        case EQ:
                            {
                            alt7=4;
                            }
                            break;
                        case LE:
                            {
                            alt7=3;
                            }
                            break;
                        default:
                            NoViableAltException nvae =
                                new NoViableAltException("", 7, 5, input);

                            throw nvae;
                        }

                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 7, 2, input);

                        throw nvae;
                    }

                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 7, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // src/ro/pub/cpl/coolir/CoolIr.g:120:9: rg= register ASSIGN NOT op= operand
                    {
                    pushFollow(FOLLOW_register_in_logicalInstruction1226);
                    rg=register();

                    state._fsp--;

                    match(input,ASSIGN,FOLLOW_ASSIGN_in_logicalInstruction1228); 
                    match(input,NOT,FOLLOW_NOT_in_logicalInstruction1230); 
                    pushFollow(FOLLOW_operand_in_logicalInstruction1236);
                    op=operand();

                    state._fsp--;


                            result = new LogicalInstruction(
                                    LogicalInstruction.OPERATION.NOT, rg,
                                    op, null);
                        

                    }
                    break;
                case 2 :
                    // src/ro/pub/cpl/coolir/CoolIr.g:125:9: rg= register ASSIGN lop= operand LT rop= operand
                    {
                    pushFollow(FOLLOW_register_in_logicalInstruction1252);
                    rg=register();

                    state._fsp--;

                    match(input,ASSIGN,FOLLOW_ASSIGN_in_logicalInstruction1254); 
                    pushFollow(FOLLOW_operand_in_logicalInstruction1260);
                    lop=operand();

                    state._fsp--;

                    match(input,LT,FOLLOW_LT_in_logicalInstruction1262); 
                    pushFollow(FOLLOW_operand_in_logicalInstruction1268);
                    rop=operand();

                    state._fsp--;


                            result = new LogicalInstruction(
                                    LogicalInstruction.OPERATION.LT, rg,
                                    lop, rop);
                        

                    }
                    break;
                case 3 :
                    // src/ro/pub/cpl/coolir/CoolIr.g:130:9: rg= register ASSIGN lop= operand LE rop= operand
                    {
                    pushFollow(FOLLOW_register_in_logicalInstruction1284);
                    rg=register();

                    state._fsp--;

                    match(input,ASSIGN,FOLLOW_ASSIGN_in_logicalInstruction1286); 
                    pushFollow(FOLLOW_operand_in_logicalInstruction1292);
                    lop=operand();

                    state._fsp--;

                    match(input,LE,FOLLOW_LE_in_logicalInstruction1294); 
                    pushFollow(FOLLOW_operand_in_logicalInstruction1300);
                    rop=operand();

                    state._fsp--;


                            result = new LogicalInstruction(
                                    LogicalInstruction.OPERATION.LE, rg,
                                    lop, rop);
                        

                    }
                    break;
                case 4 :
                    // src/ro/pub/cpl/coolir/CoolIr.g:135:9: rg= register ASSIGN lop= operand EQ rop= operand
                    {
                    pushFollow(FOLLOW_register_in_logicalInstruction1316);
                    rg=register();

                    state._fsp--;

                    match(input,ASSIGN,FOLLOW_ASSIGN_in_logicalInstruction1318); 
                    pushFollow(FOLLOW_operand_in_logicalInstruction1324);
                    lop=operand();

                    state._fsp--;

                    match(input,EQ,FOLLOW_EQ_in_logicalInstruction1326); 
                    pushFollow(FOLLOW_operand_in_logicalInstruction1332);
                    rop=operand();

                    state._fsp--;


                            result = new LogicalInstruction(
                                    LogicalInstruction.OPERATION.EQ, rg,
                                    lop, rop);
                        

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return result;
    }
    // $ANTLR end "logicalInstruction"


    // $ANTLR start "callInstruction"
    // src/ro/pub/cpl/coolir/CoolIr.g:142:1: callInstruction returns [CallInstruction result] : ( ( LPAREN ret= regList RPAREN ASSIGN )? CALL ml= LABEL ( LPAREN p= regList RPAREN )? | ( LPAREN ret= regList RPAREN ASSIGN )? CALL rg= register ( LPAREN p= regList RPAREN )? );
    public final CallInstruction callInstruction() throws RecognitionException {
        CallInstruction result = null;

        Token ml=null;
        List<Register> ret = null;

        List<Register> p = null;

        Register rg = null;



        		List<Register> params = null;
        		List<Register> retvals = null;
        	
        try {
            // src/ro/pub/cpl/coolir/CoolIr.g:147:5: ( ( LPAREN ret= regList RPAREN ASSIGN )? CALL ml= LABEL ( LPAREN p= regList RPAREN )? | ( LPAREN ret= regList RPAREN ASSIGN )? CALL rg= register ( LPAREN p= regList RPAREN )? )
            int alt12=2;
            alt12 = dfa12.predict(input);
            switch (alt12) {
                case 1 :
                    // src/ro/pub/cpl/coolir/CoolIr.g:147:9: ( LPAREN ret= regList RPAREN ASSIGN )? CALL ml= LABEL ( LPAREN p= regList RPAREN )?
                    {
                    // src/ro/pub/cpl/coolir/CoolIr.g:147:9: ( LPAREN ret= regList RPAREN ASSIGN )?
                    int alt8=2;
                    int LA8_0 = input.LA(1);

                    if ( (LA8_0==LPAREN) ) {
                        alt8=1;
                    }
                    switch (alt8) {
                        case 1 :
                            // src/ro/pub/cpl/coolir/CoolIr.g:147:10: LPAREN ret= regList RPAREN ASSIGN
                            {
                            match(input,LPAREN,FOLLOW_LPAREN_in_callInstruction1364); 
                            pushFollow(FOLLOW_regList_in_callInstruction1368);
                            ret=regList();

                            state._fsp--;

                             retvals = ret; 
                            match(input,RPAREN,FOLLOW_RPAREN_in_callInstruction1372); 
                            match(input,ASSIGN,FOLLOW_ASSIGN_in_callInstruction1374); 

                            }
                            break;

                    }

                    match(input,CALL,FOLLOW_CALL_in_callInstruction1387); 
                    ml=(Token)match(input,LABEL,FOLLOW_LABEL_in_callInstruction1393); 
                    // src/ro/pub/cpl/coolir/CoolIr.g:149:9: ( LPAREN p= regList RPAREN )?
                    int alt9=2;
                    alt9 = dfa9.predict(input);
                    switch (alt9) {
                        case 1 :
                            // src/ro/pub/cpl/coolir/CoolIr.g:149:10: LPAREN p= regList RPAREN
                            {
                            match(input,LPAREN,FOLLOW_LPAREN_in_callInstruction1404); 
                            pushFollow(FOLLOW_regList_in_callInstruction1408);
                            p=regList();

                            state._fsp--;

                             params = p; 
                            match(input,RPAREN,FOLLOW_RPAREN_in_callInstruction1412); 

                            }
                            break;

                    }


                            result = new CallInstruction(ml.getText(), params, retvals);
                        

                    }
                    break;
                case 2 :
                    // src/ro/pub/cpl/coolir/CoolIr.g:152:9: ( LPAREN ret= regList RPAREN ASSIGN )? CALL rg= register ( LPAREN p= regList RPAREN )?
                    {
                    // src/ro/pub/cpl/coolir/CoolIr.g:152:9: ( LPAREN ret= regList RPAREN ASSIGN )?
                    int alt10=2;
                    int LA10_0 = input.LA(1);

                    if ( (LA10_0==LPAREN) ) {
                        alt10=1;
                    }
                    switch (alt10) {
                        case 1 :
                            // src/ro/pub/cpl/coolir/CoolIr.g:152:10: LPAREN ret= regList RPAREN ASSIGN
                            {
                            match(input,LPAREN,FOLLOW_LPAREN_in_callInstruction1427); 
                            pushFollow(FOLLOW_regList_in_callInstruction1431);
                            ret=regList();

                            state._fsp--;

                             retvals = ret; 
                            match(input,RPAREN,FOLLOW_RPAREN_in_callInstruction1435); 
                            match(input,ASSIGN,FOLLOW_ASSIGN_in_callInstruction1437); 

                            }
                            break;

                    }

                    match(input,CALL,FOLLOW_CALL_in_callInstruction1450); 
                    pushFollow(FOLLOW_register_in_callInstruction1456);
                    rg=register();

                    state._fsp--;

                    // src/ro/pub/cpl/coolir/CoolIr.g:154:9: ( LPAREN p= regList RPAREN )?
                    int alt11=2;
                    alt11 = dfa11.predict(input);
                    switch (alt11) {
                        case 1 :
                            // src/ro/pub/cpl/coolir/CoolIr.g:154:10: LPAREN p= regList RPAREN
                            {
                            match(input,LPAREN,FOLLOW_LPAREN_in_callInstruction1467); 
                            pushFollow(FOLLOW_regList_in_callInstruction1471);
                            p=regList();

                            state._fsp--;

                             params = p; 
                            match(input,RPAREN,FOLLOW_RPAREN_in_callInstruction1475); 

                            }
                            break;

                    }


                            result = new CallInstruction(rg, params, retvals);
                        

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return result;
    }
    // $ANTLR end "callInstruction"


    // $ANTLR start "regList"
    // src/ro/pub/cpl/coolir/CoolIr.g:159:1: regList returns [List<Register> result] : ( register )+ ;
    public final List<Register> regList() throws RecognitionException {
        List<Register> result = null;

        Register register1 = null;



        		List<Register> vrList = new ArrayList<Register>();
        	
        try {
            // src/ro/pub/cpl/coolir/CoolIr.g:166:5: ( ( register )+ )
            // src/ro/pub/cpl/coolir/CoolIr.g:166:7: ( register )+
            {
            // src/ro/pub/cpl/coolir/CoolIr.g:166:7: ( register )+
            int cnt13=0;
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==VR) ) {
                    int LA13_2 = input.LA(2);

                    if ( ((LA13_2>=CALL && LA13_2<=RETURN)||LA13_2==END||LA13_2==LABEL||(LA13_2>=LPAREN && LA13_2<=VR)) ) {
                        alt13=1;
                    }


                }


                switch (alt13) {
            	case 1 :
            	    // src/ro/pub/cpl/coolir/CoolIr.g:166:8: register
            	    {
            	    pushFollow(FOLLOW_register_in_regList1513);
            	    register1=register();

            	    state._fsp--;

            	     vrList.add(register1); 

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


            		return vrList;
            	
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return result;
    }
    // $ANTLR end "regList"


    // $ANTLR start "returnInstruction"
    // src/ro/pub/cpl/coolir/CoolIr.g:169:1: returnInstruction returns [Instruction result] : RETURN ( regList )? ;
    public final Instruction returnInstruction() throws RecognitionException {
        Instruction result = null;

        List<Register> regList2 = null;



        		List<Register> vrList = null;
        	
        try {
            // src/ro/pub/cpl/coolir/CoolIr.g:173:5: ( RETURN ( regList )? )
            // src/ro/pub/cpl/coolir/CoolIr.g:173:9: RETURN ( regList )?
            {
            match(input,RETURN,FOLLOW_RETURN_in_returnInstruction1546); 
            // src/ro/pub/cpl/coolir/CoolIr.g:173:16: ( regList )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==VR) ) {
                int LA14_1 = input.LA(2);

                if ( ((LA14_1>=CALL && LA14_1<=RETURN)||LA14_1==END||LA14_1==LABEL||LA14_1==LPAREN||LA14_1==VR) ) {
                    alt14=1;
                }
            }
            switch (alt14) {
                case 1 :
                    // src/ro/pub/cpl/coolir/CoolIr.g:173:17: regList
                    {
                    pushFollow(FOLLOW_regList_in_returnInstruction1549);
                    regList2=regList();

                    state._fsp--;

                     vrList = regList2; 

                    }
                    break;

            }


                    	result = new ReturnInstruction(vrList);
                

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return result;
    }
    // $ANTLR end "returnInstruction"


    // $ANTLR start "jumpInstruction"
    // src/ro/pub/cpl/coolir/CoolIr.g:178:1: jumpInstruction returns [Instruction result] : ( JUMP rl= LABEL | JUMPT rg= register rl= LABEL | JUMPF rg= register rl= LABEL );
    public final Instruction jumpInstruction() throws RecognitionException {
        Instruction result = null;

        Token rl=null;
        Register rg = null;


        try {
            // src/ro/pub/cpl/coolir/CoolIr.g:179:5: ( JUMP rl= LABEL | JUMPT rg= register rl= LABEL | JUMPF rg= register rl= LABEL )
            int alt15=3;
            switch ( input.LA(1) ) {
            case JUMP:
                {
                alt15=1;
                }
                break;
            case JUMPT:
                {
                alt15=2;
                }
                break;
            case JUMPF:
                {
                alt15=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }

            switch (alt15) {
                case 1 :
                    // src/ro/pub/cpl/coolir/CoolIr.g:179:9: JUMP rl= LABEL
                    {
                    match(input,JUMP,FOLLOW_JUMP_in_jumpInstruction1578); 
                    rl=(Token)match(input,LABEL,FOLLOW_LABEL_in_jumpInstruction1584); 

                            result = new JumpInstruction(JumpInstruction.OPERATION.JUMP, null, rl.getText());
                        

                    }
                    break;
                case 2 :
                    // src/ro/pub/cpl/coolir/CoolIr.g:182:9: JUMPT rg= register rl= LABEL
                    {
                    match(input,JUMPT,FOLLOW_JUMPT_in_jumpInstruction1596); 
                    pushFollow(FOLLOW_register_in_jumpInstruction1602);
                    rg=register();

                    state._fsp--;

                    rl=(Token)match(input,LABEL,FOLLOW_LABEL_in_jumpInstruction1608); 

                            result = new JumpInstruction(JumpInstruction.OPERATION.JUMPT, rg, rl.getText());
                        

                    }
                    break;
                case 3 :
                    // src/ro/pub/cpl/coolir/CoolIr.g:185:9: JUMPF rg= register rl= LABEL
                    {
                    match(input,JUMPF,FOLLOW_JUMPF_in_jumpInstruction1620); 
                    pushFollow(FOLLOW_register_in_jumpInstruction1626);
                    rg=register();

                    state._fsp--;

                    rl=(Token)match(input,LABEL,FOLLOW_LABEL_in_jumpInstruction1632); 

                            result = new JumpInstruction(JumpInstruction.OPERATION.JUMPF, rg, rl.getText());
                        

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return result;
    }
    // $ANTLR end "jumpInstruction"


    // $ANTLR start "memoryInstruction"
    // src/ro/pub/cpl/coolir/CoolIr.g:190:1: memoryInstruction returns [MemoryInstruction result] : ( LOAD rg= register ml= memoryLocation | STORE rg= register ml= memoryLocation | LOADB rg= register ml= memoryLocation | STOREB rg= register ml= memoryLocation );
    public final MemoryInstruction memoryInstruction() throws RecognitionException {
        MemoryInstruction result = null;

        Register rg = null;

        MemoryLocation ml = null;


        try {
            // src/ro/pub/cpl/coolir/CoolIr.g:191:5: ( LOAD rg= register ml= memoryLocation | STORE rg= register ml= memoryLocation | LOADB rg= register ml= memoryLocation | STOREB rg= register ml= memoryLocation )
            int alt16=4;
            switch ( input.LA(1) ) {
            case LOAD:
                {
                alt16=1;
                }
                break;
            case STORE:
                {
                alt16=2;
                }
                break;
            case LOADB:
                {
                alt16=3;
                }
                break;
            case STOREB:
                {
                alt16=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }

            switch (alt16) {
                case 1 :
                    // src/ro/pub/cpl/coolir/CoolIr.g:191:9: LOAD rg= register ml= memoryLocation
                    {
                    match(input,LOAD,FOLLOW_LOAD_in_memoryInstruction1657); 
                    pushFollow(FOLLOW_register_in_memoryInstruction1663);
                    rg=register();

                    state._fsp--;

                    pushFollow(FOLLOW_memoryLocation_in_memoryInstruction1669);
                    ml=memoryLocation();

                    state._fsp--;


                            result = new MemoryInstruction(MemoryInstruction.OPERATION.LOAD, rg, ml);
                        

                    }
                    break;
                case 2 :
                    // src/ro/pub/cpl/coolir/CoolIr.g:194:9: STORE rg= register ml= memoryLocation
                    {
                    match(input,STORE,FOLLOW_STORE_in_memoryInstruction1681); 
                    pushFollow(FOLLOW_register_in_memoryInstruction1687);
                    rg=register();

                    state._fsp--;

                    pushFollow(FOLLOW_memoryLocation_in_memoryInstruction1693);
                    ml=memoryLocation();

                    state._fsp--;


                            result = new MemoryInstruction(MemoryInstruction.OPERATION.STORE, rg, ml);
                        

                    }
                    break;
                case 3 :
                    // src/ro/pub/cpl/coolir/CoolIr.g:197:9: LOADB rg= register ml= memoryLocation
                    {
                    match(input,LOADB,FOLLOW_LOADB_in_memoryInstruction1705); 
                    pushFollow(FOLLOW_register_in_memoryInstruction1711);
                    rg=register();

                    state._fsp--;

                    pushFollow(FOLLOW_memoryLocation_in_memoryInstruction1717);
                    ml=memoryLocation();

                    state._fsp--;


                            result = new MemoryInstruction(MemoryInstruction.OPERATION.LOADB, rg, ml);
                        

                    }
                    break;
                case 4 :
                    // src/ro/pub/cpl/coolir/CoolIr.g:200:9: STOREB rg= register ml= memoryLocation
                    {
                    match(input,STOREB,FOLLOW_STOREB_in_memoryInstruction1729); 
                    pushFollow(FOLLOW_register_in_memoryInstruction1735);
                    rg=register();

                    state._fsp--;

                    pushFollow(FOLLOW_memoryLocation_in_memoryInstruction1741);
                    ml=memoryLocation();

                    state._fsp--;


                            result = new MemoryInstruction(MemoryInstruction.OPERATION.STOREB, rg, ml);
                        

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return result;
    }
    // $ANTLR end "memoryInstruction"


    // $ANTLR start "dataDirective"
    // src/ro/pub/cpl/coolir/CoolIr.g:205:1: dataDirective returns [DataDirective result] : (rl= LABEL COLON )* ( DW i= INTEGER | DL l= LABEL | DB s= STRING | DB i= INTEGER | DS i= INTEGER ) ;
    public final DataDirective dataDirective() throws RecognitionException {
        DataDirective result = null;

        Token rl=null;
        Token i=null;
        Token l=null;
        Token s=null;


                List<String> labels = new ArrayList<String>();
            
        try {
            // src/ro/pub/cpl/coolir/CoolIr.g:212:5: ( (rl= LABEL COLON )* ( DW i= INTEGER | DL l= LABEL | DB s= STRING | DB i= INTEGER | DS i= INTEGER ) )
            // src/ro/pub/cpl/coolir/CoolIr.g:212:9: (rl= LABEL COLON )* ( DW i= INTEGER | DL l= LABEL | DB s= STRING | DB i= INTEGER | DS i= INTEGER )
            {
            // src/ro/pub/cpl/coolir/CoolIr.g:212:9: (rl= LABEL COLON )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==LABEL) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // src/ro/pub/cpl/coolir/CoolIr.g:212:13: rl= LABEL COLON
            	    {
            	    rl=(Token)match(input,LABEL,FOLLOW_LABEL_in_dataDirective1792); 
            	    match(input,COLON,FOLLOW_COLON_in_dataDirective1794); 
            	     labels.add(rl.getText()); 

            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);

            // src/ro/pub/cpl/coolir/CoolIr.g:213:9: ( DW i= INTEGER | DL l= LABEL | DB s= STRING | DB i= INTEGER | DS i= INTEGER )
            int alt18=5;
            switch ( input.LA(1) ) {
            case DW:
                {
                alt18=1;
                }
                break;
            case DL:
                {
                alt18=2;
                }
                break;
            case DB:
                {
                int LA18_3 = input.LA(2);

                if ( (LA18_3==STRING) ) {
                    alt18=3;
                }
                else if ( (LA18_3==INTEGER) ) {
                    alt18=4;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 18, 3, input);

                    throw nvae;
                }
                }
                break;
            case DS:
                {
                alt18=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }

            switch (alt18) {
                case 1 :
                    // src/ro/pub/cpl/coolir/CoolIr.g:213:13: DW i= INTEGER
                    {
                    match(input,DW,FOLLOW_DW_in_dataDirective1812); 
                    i=(Token)match(input,INTEGER,FOLLOW_INTEGER_in_dataDirective1818); 

                                    result = new DataDirective(DataDirective.DIRECTIVE.DW, Integer.parseInt(i.getText()));
                                

                    }
                    break;
                case 2 :
                    // src/ro/pub/cpl/coolir/CoolIr.g:216:13: DL l= LABEL
                    {
                    match(input,DL,FOLLOW_DL_in_dataDirective1834); 
                    l=(Token)match(input,LABEL,FOLLOW_LABEL_in_dataDirective1840); 

                                    result = new DataDirective(DataDirective.DIRECTIVE.DL, l.getText());
                                

                    }
                    break;
                case 3 :
                    // src/ro/pub/cpl/coolir/CoolIr.g:219:13: DB s= STRING
                    {
                    match(input,DB,FOLLOW_DB_in_dataDirective1856); 
                    s=(Token)match(input,STRING,FOLLOW_STRING_in_dataDirective1862); 

                                    result = new DataDirective(DataDirective.DIRECTIVE.DB, s.getText());
                                

                    }
                    break;
                case 4 :
                    // src/ro/pub/cpl/coolir/CoolIr.g:222:13: DB i= INTEGER
                    {
                    match(input,DB,FOLLOW_DB_in_dataDirective1878); 
                    i=(Token)match(input,INTEGER,FOLLOW_INTEGER_in_dataDirective1884); 

                                    result = new DataDirective(DataDirective.DIRECTIVE.DB, Integer.parseInt(i.getText()));
                                

                    }
                    break;
                case 5 :
                    // src/ro/pub/cpl/coolir/CoolIr.g:225:13: DS i= INTEGER
                    {
                    match(input,DS,FOLLOW_DS_in_dataDirective1900); 
                    i=(Token)match(input,INTEGER,FOLLOW_INTEGER_in_dataDirective1906); 

                            		result = new DataDirective(DataDirective.DIRECTIVE.DS, Integer.parseInt(i.getText()));
                            

                    }
                    break;

            }


            }


                    result.setLabels(labels);
                
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return result;
    }
    // $ANTLR end "dataDirective"


    // $ANTLR start "register"
    // src/ro/pub/cpl/coolir/CoolIr.g:231:1: register returns [Register result] : VR ;
    public final Register register() throws RecognitionException {
        Register result = null;

        Token VR3=null;

        try {
            // src/ro/pub/cpl/coolir/CoolIr.g:232:5: ( VR )
            // src/ro/pub/cpl/coolir/CoolIr.g:232:9: VR
            {
            VR3=(Token)match(input,VR,FOLLOW_VR_in_register1941); 

                    result = new Register(Integer.parseInt(VR3.getText().substring(2)));
                

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return result;
    }
    // $ANTLR end "register"


    // $ANTLR start "inRegister"
    // src/ro/pub/cpl/coolir/CoolIr.g:237:1: inRegister returns [InRegister result] : VI ;
    public final InRegister inRegister() throws RecognitionException {
        InRegister result = null;

        Token VI4=null;

        try {
            // src/ro/pub/cpl/coolir/CoolIr.g:238:5: ( VI )
            // src/ro/pub/cpl/coolir/CoolIr.g:238:9: VI
            {
            VI4=(Token)match(input,VI,FOLLOW_VI_in_inRegister1966); 

                    result = new InRegister(Integer.parseInt(VI4.getText().substring(2)));
                

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return result;
    }
    // $ANTLR end "inRegister"


    // $ANTLR start "memoryLocation"
    // src/ro/pub/cpl/coolir/CoolIr.g:243:1: memoryLocation returns [MemoryLocation result] : '[' rg= register ',' off= INTEGER ']' ;
    public final MemoryLocation memoryLocation() throws RecognitionException {
        MemoryLocation result = null;

        Token off=null;
        Register rg = null;


        try {
            // src/ro/pub/cpl/coolir/CoolIr.g:244:5: ( '[' rg= register ',' off= INTEGER ']' )
            // src/ro/pub/cpl/coolir/CoolIr.g:244:9: '[' rg= register ',' off= INTEGER ']'
            {
            match(input,48,FOLLOW_48_in_memoryLocation1991); 
            pushFollow(FOLLOW_register_in_memoryLocation1997);
            rg=register();

            state._fsp--;

            match(input,47,FOLLOW_47_in_memoryLocation1999); 
            off=(Token)match(input,INTEGER,FOLLOW_INTEGER_in_memoryLocation2005); 
            match(input,49,FOLLOW_49_in_memoryLocation2007); 

                    result = new MemoryLocation(rg, Integer.parseInt(off.getText()));
                

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return result;
    }
    // $ANTLR end "memoryLocation"


    // $ANTLR start "operand"
    // src/ro/pub/cpl/coolir/CoolIr.g:249:1: operand returns [Operand result] : ( INTEGER | rg= register );
    public final Operand operand() throws RecognitionException {
        Operand result = null;

        Token INTEGER5=null;
        Register rg = null;


        try {
            // src/ro/pub/cpl/coolir/CoolIr.g:250:5: ( INTEGER | rg= register )
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==INTEGER) ) {
                alt19=1;
            }
            else if ( (LA19_0==VR) ) {
                alt19=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }
            switch (alt19) {
                case 1 :
                    // src/ro/pub/cpl/coolir/CoolIr.g:250:9: INTEGER
                    {
                    INTEGER5=(Token)match(input,INTEGER,FOLLOW_INTEGER_in_operand2032); 

                            result = new IntConstant(INTEGER5.getText());
                        

                    }
                    break;
                case 2 :
                    // src/ro/pub/cpl/coolir/CoolIr.g:253:9: rg= register
                    {
                    pushFollow(FOLLOW_register_in_operand2048);
                    rg=register();

                    state._fsp--;


                            result = rg;
                        

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return result;
    }
    // $ANTLR end "operand"


    // $ANTLR start "dataSection"
    // src/ro/pub/cpl/coolir/CoolIr.g:258:1: dataSection returns [List<DataDirective> result] : DATA (dd= dataDirective )* ;
    public final List<DataDirective> dataSection() throws RecognitionException {
        List<DataDirective> result = null;

        DataDirective dd = null;



                result = new ArrayList<DataDirective>();
            
        try {
            // src/ro/pub/cpl/coolir/CoolIr.g:262:5: ( DATA (dd= dataDirective )* )
            // src/ro/pub/cpl/coolir/CoolIr.g:262:9: DATA (dd= dataDirective )*
            {
            match(input,DATA,FOLLOW_DATA_in_dataSection2082); 
            // src/ro/pub/cpl/coolir/CoolIr.g:262:14: (dd= dataDirective )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( ((LA20_0>=DW && LA20_0<=DB)||LA20_0==LABEL) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // src/ro/pub/cpl/coolir/CoolIr.g:262:15: dd= dataDirective
            	    {
            	    pushFollow(FOLLOW_dataDirective_in_dataSection2089);
            	    dd=dataDirective();

            	    state._fsp--;

            	     result.add(dd); 

            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return result;
    }
    // $ANTLR end "dataSection"

    // Delegated rules


    protected DFA4 dfa4 = new DFA4(this);
    protected DFA12 dfa12 = new DFA12(this);
    protected DFA9 dfa9 = new DFA9(this);
    protected DFA11 dfa11 = new DFA11(this);
    static final String DFA4_eotS =
        "\14\uffff";
    static final String DFA4_eofS =
        "\14\uffff";
    static final String DFA4_minS =
        "\1\4\1\32\4\uffff\1\15\2\uffff\2\4\1\uffff";
    static final String DFA4_maxS =
        "\1\44\1\32\4\uffff\1\45\2\uffff\2\44\1\uffff";
    static final String DFA4_acceptS =
        "\2\uffff\1\4\1\5\1\6\1\7\1\uffff\1\3\1\1\2\uffff\1\2";
    static final String DFA4_specialS =
        "\14\uffff}>";
    static final String[] DFA4_transitionS = {
            "\1\2\4\5\3\3\1\4\25\uffff\1\2\1\uffff\1\1",
            "\1\6",
            "",
            "",
            "",
            "",
            "\1\7\11\uffff\1\11\1\10\13\uffff\1\12\1\10",
            "",
            "",
            "\11\10\4\uffff\1\10\6\uffff\1\10\2\uffff\4\13\3\7\1\10\1\uffff"+
            "\1\10",
            "\11\10\4\uffff\1\10\6\uffff\1\10\2\uffff\4\13\3\7\1\10\1\uffff"+
            "\1\10",
            ""
    };

    static final short[] DFA4_eot = DFA.unpackEncodedString(DFA4_eotS);
    static final short[] DFA4_eof = DFA.unpackEncodedString(DFA4_eofS);
    static final char[] DFA4_min = DFA.unpackEncodedStringToUnsignedChars(DFA4_minS);
    static final char[] DFA4_max = DFA.unpackEncodedStringToUnsignedChars(DFA4_maxS);
    static final short[] DFA4_accept = DFA.unpackEncodedString(DFA4_acceptS);
    static final short[] DFA4_special = DFA.unpackEncodedString(DFA4_specialS);
    static final short[][] DFA4_transition;

    static {
        int numStates = DFA4_transitionS.length;
        DFA4_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA4_transition[i] = DFA.unpackEncodedString(DFA4_transitionS[i]);
        }
    }

    class DFA4 extends DFA {

        public DFA4(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 4;
            this.eot = DFA4_eot;
            this.eof = DFA4_eof;
            this.min = DFA4_min;
            this.max = DFA4_max;
            this.accept = DFA4_accept;
            this.special = DFA4_special;
            this.transition = DFA4_transition;
        }
        public String getDescription() {
            return "74:9: (cpi= copyInstruction | ai= arithmeticalInstruction | li= logicalInstruction | ci= callInstruction | ji= jumpInstruction | ri= returnInstruction | mi= memoryInstruction )";
        }
    }
    static final String DFA12_eotS =
        "\10\uffff";
    static final String DFA12_eofS =
        "\10\uffff";
    static final String DFA12_minS =
        "\1\4\1\44\1\30\1\43\2\uffff\1\32\1\4";
    static final String DFA12_maxS =
        "\1\42\3\44\2\uffff\1\32\1\4";
    static final String DFA12_acceptS =
        "\4\uffff\1\1\1\2\2\uffff";
    static final String DFA12_specialS =
        "\10\uffff}>";
    static final String[] DFA12_transitionS = {
            "\1\2\35\uffff\1\1",
            "\1\3",
            "\1\4\13\uffff\1\5",
            "\1\6\1\3",
            "",
            "",
            "\1\7",
            "\1\2"
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
            return "142:1: callInstruction returns [CallInstruction result] : ( ( LPAREN ret= regList RPAREN ASSIGN )? CALL ml= LABEL ( LPAREN p= regList RPAREN )? | ( LPAREN ret= regList RPAREN ASSIGN )? CALL rg= register ( LPAREN p= regList RPAREN )? );";
        }
    }
    static final String DFA9_eotS =
        "\6\uffff";
    static final String DFA9_eofS =
        "\6\uffff";
    static final String DFA9_minS =
        "\1\4\1\44\1\uffff\1\43\1\4\1\uffff";
    static final String DFA9_maxS =
        "\2\44\1\uffff\2\44\1\uffff";
    static final String DFA9_acceptS =
        "\2\uffff\1\2\2\uffff\1\1";
    static final String DFA9_specialS =
        "\6\uffff}>";
    static final String[] DFA9_transitionS = {
            "\11\2\4\uffff\1\2\6\uffff\1\2\11\uffff\1\1\1\uffff\1\2",
            "\1\3",
            "",
            "\1\4\1\3",
            "\11\5\4\uffff\1\5\6\uffff\1\5\1\uffff\1\2\7\uffff\1\5\1\uffff"+
            "\1\5",
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
            return "149:9: ( LPAREN p= regList RPAREN )?";
        }
    }
    static final String DFA11_eotS =
        "\6\uffff";
    static final String DFA11_eofS =
        "\6\uffff";
    static final String DFA11_minS =
        "\1\4\1\44\1\uffff\1\43\1\4\1\uffff";
    static final String DFA11_maxS =
        "\2\44\1\uffff\2\44\1\uffff";
    static final String DFA11_acceptS =
        "\2\uffff\1\2\2\uffff\1\1";
    static final String DFA11_specialS =
        "\6\uffff}>";
    static final String[] DFA11_transitionS = {
            "\11\2\4\uffff\1\2\6\uffff\1\2\11\uffff\1\1\1\uffff\1\2",
            "\1\3",
            "",
            "\1\4\1\3",
            "\11\5\4\uffff\1\5\6\uffff\1\5\1\uffff\1\2\7\uffff\1\5\1\uffff"+
            "\1\5",
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
            return "154:9: ( LPAREN p= regList RPAREN )?";
        }
    }
 

    public static final BitSet FOLLOW_codeSection_in_program626 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_dataSection_in_program632 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CODE_in_codeSection666 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_method_in_codeSection673 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_FUNCTION_in_method700 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_STRING_in_method706 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_47_in_method708 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_INTEGER_in_method714 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_47_in_method716 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_INTEGER_in_method722 = new BitSet(new long[]{0x0000001401021FF0L});
    public static final BitSet FOLLOW_instructionList_in_method728 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_END_in_method730 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_instruction_in_instructionList770 = new BitSet(new long[]{0x0000001401001FF2L});
    public static final BitSet FOLLOW_LABEL_in_instruction823 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_COLON_in_instruction825 = new BitSet(new long[]{0x0000001401001FF0L});
    public static final BitSet FOLLOW_copyInstruction_in_instruction847 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_arithmeticalInstruction_in_instruction867 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_logicalInstruction_in_instruction887 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_callInstruction_in_instruction907 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_jumpInstruction_in_instruction927 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_returnInstruction_in_instruction941 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_memoryInstruction_in_instruction961 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_register_in_copyInstruction1000 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_ASSIGN_in_copyInstruction1002 = new BitSet(new long[]{0x0000001000800000L});
    public static final BitSet FOLLOW_operand_in_copyInstruction1008 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_register_in_copyInstruction1024 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_ASSIGN_in_copyInstruction1026 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_inRegister_in_copyInstruction1032 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_register_in_copyInstruction1048 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_ASSIGN_in_copyInstruction1050 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_LABEL_in_copyInstruction1056 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_register_in_arithmeticalInstruction1085 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_ASSIGN_in_arithmeticalInstruction1087 = new BitSet(new long[]{0x0000001000800000L});
    public static final BitSet FOLLOW_operand_in_arithmeticalInstruction1093 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_ADD_in_arithmeticalInstruction1095 = new BitSet(new long[]{0x0000001000800000L});
    public static final BitSet FOLLOW_operand_in_arithmeticalInstruction1101 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_register_in_arithmeticalInstruction1117 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_ASSIGN_in_arithmeticalInstruction1119 = new BitSet(new long[]{0x0000001000800000L});
    public static final BitSet FOLLOW_operand_in_arithmeticalInstruction1125 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_SUB_in_arithmeticalInstruction1127 = new BitSet(new long[]{0x0000001000800000L});
    public static final BitSet FOLLOW_operand_in_arithmeticalInstruction1133 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_register_in_arithmeticalInstruction1149 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_ASSIGN_in_arithmeticalInstruction1151 = new BitSet(new long[]{0x0000001000800000L});
    public static final BitSet FOLLOW_operand_in_arithmeticalInstruction1157 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_MUL_in_arithmeticalInstruction1159 = new BitSet(new long[]{0x0000001000800000L});
    public static final BitSet FOLLOW_operand_in_arithmeticalInstruction1165 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_register_in_arithmeticalInstruction1181 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_ASSIGN_in_arithmeticalInstruction1183 = new BitSet(new long[]{0x0000001000800000L});
    public static final BitSet FOLLOW_operand_in_arithmeticalInstruction1189 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_DIV_in_arithmeticalInstruction1191 = new BitSet(new long[]{0x0000001000800000L});
    public static final BitSet FOLLOW_operand_in_arithmeticalInstruction1197 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_register_in_logicalInstruction1226 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_ASSIGN_in_logicalInstruction1228 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_NOT_in_logicalInstruction1230 = new BitSet(new long[]{0x0000001000800000L});
    public static final BitSet FOLLOW_operand_in_logicalInstruction1236 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_register_in_logicalInstruction1252 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_ASSIGN_in_logicalInstruction1254 = new BitSet(new long[]{0x0000001000800000L});
    public static final BitSet FOLLOW_operand_in_logicalInstruction1260 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_LT_in_logicalInstruction1262 = new BitSet(new long[]{0x0000001000800000L});
    public static final BitSet FOLLOW_operand_in_logicalInstruction1268 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_register_in_logicalInstruction1284 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_ASSIGN_in_logicalInstruction1286 = new BitSet(new long[]{0x0000001000800000L});
    public static final BitSet FOLLOW_operand_in_logicalInstruction1292 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_LE_in_logicalInstruction1294 = new BitSet(new long[]{0x0000001000800000L});
    public static final BitSet FOLLOW_operand_in_logicalInstruction1300 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_register_in_logicalInstruction1316 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_ASSIGN_in_logicalInstruction1318 = new BitSet(new long[]{0x0000001000800000L});
    public static final BitSet FOLLOW_operand_in_logicalInstruction1324 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_EQ_in_logicalInstruction1326 = new BitSet(new long[]{0x0000001000800000L});
    public static final BitSet FOLLOW_operand_in_logicalInstruction1332 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPAREN_in_callInstruction1364 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_regList_in_callInstruction1368 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_RPAREN_in_callInstruction1372 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_ASSIGN_in_callInstruction1374 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_CALL_in_callInstruction1387 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_LABEL_in_callInstruction1393 = new BitSet(new long[]{0x0000000400000002L});
    public static final BitSet FOLLOW_LPAREN_in_callInstruction1404 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_regList_in_callInstruction1408 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_RPAREN_in_callInstruction1412 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPAREN_in_callInstruction1427 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_regList_in_callInstruction1431 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_RPAREN_in_callInstruction1435 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_ASSIGN_in_callInstruction1437 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_CALL_in_callInstruction1450 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_register_in_callInstruction1456 = new BitSet(new long[]{0x0000000400000002L});
    public static final BitSet FOLLOW_LPAREN_in_callInstruction1467 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_regList_in_callInstruction1471 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_RPAREN_in_callInstruction1475 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_register_in_regList1513 = new BitSet(new long[]{0x0000001000000002L});
    public static final BitSet FOLLOW_RETURN_in_returnInstruction1546 = new BitSet(new long[]{0x0000001000000002L});
    public static final BitSet FOLLOW_regList_in_returnInstruction1549 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_JUMP_in_jumpInstruction1578 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_LABEL_in_jumpInstruction1584 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_JUMPT_in_jumpInstruction1596 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_register_in_jumpInstruction1602 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_LABEL_in_jumpInstruction1608 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_JUMPF_in_jumpInstruction1620 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_register_in_jumpInstruction1626 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_LABEL_in_jumpInstruction1632 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LOAD_in_memoryInstruction1657 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_register_in_memoryInstruction1663 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_memoryLocation_in_memoryInstruction1669 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STORE_in_memoryInstruction1681 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_register_in_memoryInstruction1687 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_memoryLocation_in_memoryInstruction1693 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LOADB_in_memoryInstruction1705 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_register_in_memoryInstruction1711 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_memoryLocation_in_memoryInstruction1717 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STOREB_in_memoryInstruction1729 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_register_in_memoryInstruction1735 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_memoryLocation_in_memoryInstruction1741 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LABEL_in_dataDirective1792 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_COLON_in_dataDirective1794 = new BitSet(new long[]{0x00000000013C0000L});
    public static final BitSet FOLLOW_DW_in_dataDirective1812 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_INTEGER_in_dataDirective1818 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DL_in_dataDirective1834 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_LABEL_in_dataDirective1840 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DB_in_dataDirective1856 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_STRING_in_dataDirective1862 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DB_in_dataDirective1878 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_INTEGER_in_dataDirective1884 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DS_in_dataDirective1900 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_INTEGER_in_dataDirective1906 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VR_in_register1941 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VI_in_inRegister1966 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_memoryLocation1991 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_register_in_memoryLocation1997 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_47_in_memoryLocation1999 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_INTEGER_in_memoryLocation2005 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_49_in_memoryLocation2007 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INTEGER_in_operand2032 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_register_in_operand2048 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DATA_in_dataSection2082 = new BitSet(new long[]{0x00000000013C0002L});
    public static final BitSet FOLLOW_dataDirective_in_dataSection2089 = new BitSet(new long[]{0x00000000013C0002L});

}