grammar CoolIr;

tokens {
    CALL            = 'call'            ;
    LOAD            = 'load'            ;
    LOADB           = 'loadb'           ;
    STORE           = 'store'           ;
    STOREB          = 'storeb'          ;
    JUMP            = 'jump'            ;
    JUMPT           = 'jumpt'           ;
    JUMPF           = 'jumpf'           ;
    RETURN          = 'return'          ;
    NOT             = '~'             	;
    CODE            = '.code'           ;
    DATA            = '.data'           ;
    FUNCTION		= '.function'		;
    END				= '.end'			;
    DW              = 'DW'              ;
    DL              = 'DL'              ;
    DS              = 'DS'              ;
    DB              = 'DB'              ;
}

@header {
    package ro.pub.cpl.coolir;
    import java.util.List;
    import java.util.ArrayList;
}

@members {
}

@lexer::header {
    package ro.pub.cpl.coolir;
}

program returns [Program result]
    :   cs = codeSection ds = dataSection {
        $result = new Program($cs.result, $ds.result);
    }
    ;

codeSection returns [List<Method> result]
    @init {
        $result = new ArrayList<Method>();
    }
    :   CODE (md = method { $result.add($md.result); })*
    ;

method returns [Method result]
    :   FUNCTION fn = STRING ',' inCount = INTEGER ',' outCount = INTEGER il = instructionList END {
        $result = new Method($fn.getText().substring(1, $fn.getText().length()-1), 
        	Integer.parseInt($inCount.getText()), 
        	Integer.parseInt($outCount.getText()), 
        	$il.result);
    } 
    ;

instructionList returns [List<Instruction> result]
    @init {
        $result = new ArrayList<Instruction>();
    }
    :   (i = instruction { $result.add($i.result); })*
    ;

instruction returns [Instruction result]
    @init {
        List<String> labels = new ArrayList<String>();
    }
    @after {
        $result.setLabels(labels);
    }
    :   (   rl = LABEL COLON { labels.add($rl.getText()); })*
        (   cpi = copyInstruction { $result = $cpi.result; }
        |   ai = arithmeticalInstruction { $result = $ai.result; }
        |   li = logicalInstruction { $result = $li.result; }
        |   ci = callInstruction { $result = $ci.result; }
        |   ji = jumpInstruction { $result = $ji.result; }
		|   ri = returnInstruction { $result = $ri.result; }
        |   mi = memoryInstruction { $result = $mi.result; }
        )
    ;

copyInstruction returns [CopyInstruction result]
    :   rg = register ASSIGN op = operand {
        $result = new CopyInstruction($rg.result, $op.result);
    }
    |   rg = register ASSIGN irg = inRegister {
        $result = new CopyInstruction($rg.result, $irg.result);
    }
    |   rg = register ASSIGN rl = LABEL {
    	$result = new CopyInstruction($rg.result, $rl.getText());
    }
    ;

arithmeticalInstruction returns [ArithmeticalInstruction result]
    :   rg = register ASSIGN lop = operand ADD rop = operand {
        $result = new ArithmeticalInstruction(
                ArithmeticalInstruction.OPERATION.ADD, $rg.result,
                $lop.result, $rop.result);
    }
    |   rg = register ASSIGN lop = operand SUB rop = operand {
        $result = new ArithmeticalInstruction(
                ArithmeticalInstruction.OPERATION.SUB, $rg.result,
                $lop.result, $rop.result);
    }
    |   rg = register ASSIGN lop = operand MUL rop = operand {
        $result = new ArithmeticalInstruction(
                ArithmeticalInstruction.OPERATION.MUL, $rg.result,
                $lop.result, $rop.result);
    }
    |   rg = register ASSIGN lop = operand DIV rop = operand {
        $result = new ArithmeticalInstruction(
                ArithmeticalInstruction.OPERATION.DIV, $rg.result,
                $lop.result, $rop.result);
    }
    ;

logicalInstruction returns [LogicalInstruction result]
    :   rg = register ASSIGN NOT op = operand {
        $result = new LogicalInstruction(
                LogicalInstruction.OPERATION.NOT, $rg.result,
                $op.result, null);
    }
    |   rg = register ASSIGN lop = operand LT rop = operand {
        $result = new LogicalInstruction(
                LogicalInstruction.OPERATION.LT, $rg.result,
                $lop.result, $rop.result);
    }
    |   rg = register ASSIGN lop = operand LE rop = operand {
        $result = new LogicalInstruction(
                LogicalInstruction.OPERATION.LE, $rg.result,
                $lop.result, $rop.result);
    }
    |   rg = register ASSIGN lop = operand EQ rop = operand {
        $result = new LogicalInstruction(
                LogicalInstruction.OPERATION.EQ, $rg.result,
                $lop.result, $rop.result);
    }
    ;

callInstruction returns [CallInstruction result]
	@init {
		List<Register> params = null;
		List<Register> retvals = null;
	}
    :   (LPAREN ret=regList { retvals = $ret.result; } RPAREN ASSIGN)?
         CALL ml = LABEL
        (LPAREN p=regList { params = $p.result; } RPAREN)? {
        $result = new CallInstruction($ml.getText(), params, retvals);
    }
    |   (LPAREN ret=regList { retvals = $ret.result; } RPAREN ASSIGN)?
         CALL rg = register
        (LPAREN p=regList { params = $p.result; } RPAREN)? {
        $result = new CallInstruction($rg.result, params, retvals);
    }
    ;

regList returns [List<Register> result]
	@init {
		List<Register> vrList = new ArrayList<Register>();
	}
	@after {
		return vrList;
	}
    : (register { vrList.add($register.result); })+
    ;

returnInstruction returns [Instruction result]
	@init {
		List<Register> vrList = null;
	}
    :   RETURN (regList { vrList = $regList.result; })? {
        	$result = new ReturnInstruction(vrList);
    }
    ;

jumpInstruction returns [Instruction result]
    :   JUMP rl = LABEL {
        $result = new JumpInstruction(JumpInstruction.OPERATION.JUMP, null, $rl.getText());
    }
    |   JUMPT rg = register rl = LABEL {
        $result = new JumpInstruction(JumpInstruction.OPERATION.JUMPT, $rg.result, $rl.getText());
    }
    |   JUMPF rg = register rl = LABEL {
        $result = new JumpInstruction(JumpInstruction.OPERATION.JUMPF, $rg.result, $rl.getText());
    }
    ;

memoryInstruction returns [MemoryInstruction result]
    :   LOAD rg = register ml = memoryLocation {
        $result = new MemoryInstruction(MemoryInstruction.OPERATION.LOAD, $rg.result, $ml.result);
    }
    |   STORE rg = register ml = memoryLocation {
        $result = new MemoryInstruction(MemoryInstruction.OPERATION.STORE, $rg.result, $ml.result);
    }
    |   LOADB rg = register ml = memoryLocation {
        $result = new MemoryInstruction(MemoryInstruction.OPERATION.LOADB, $rg.result, $ml.result);
    }
    |   STOREB rg = register ml = memoryLocation {
        $result = new MemoryInstruction(MemoryInstruction.OPERATION.STOREB, $rg.result, $ml.result);
    }
    ;

dataDirective returns [DataDirective result]
    @init {
        List<String> labels = new ArrayList<String>();
    }
    @after {
        $result.setLabels(labels);
    }
    :   (   rl = LABEL COLON { labels.add($rl.getText()); })*
        (   DW i = INTEGER {
                $result = new DataDirective(DataDirective.DIRECTIVE.DW, Integer.parseInt($i.getText()));
            }
        |   DL l = LABEL {
                $result = new DataDirective(DataDirective.DIRECTIVE.DL, $l.getText());
            }
        |   DB s = STRING {
                $result = new DataDirective(DataDirective.DIRECTIVE.DB, $s.getText());
            }
        |   DB i = INTEGER {
                $result = new DataDirective(DataDirective.DIRECTIVE.DB, Integer.parseInt($i.getText()));
            }
        |   DS i = INTEGER {
        		$result = new DataDirective(DataDirective.DIRECTIVE.DS, Integer.parseInt($i.getText()));
        }
        )
    ;

register returns [Register result]
    :   VR {
        $result = new Register(Integer.parseInt($VR.getText().substring(2)));
    }
    ;

inRegister returns [InRegister result]
    :   VI {
        $result = new InRegister(Integer.parseInt($VI.getText().substring(2)));
    }
    ;

memoryLocation returns [MemoryLocation result]
    :   '[' rg = register ',' off = INTEGER ']' {
        $result = new MemoryLocation($rg.result, Integer.parseInt($off.getText()));
    }
    ;

operand returns [Operand result]
    :   INTEGER {
        $result = new IntConstant($INTEGER.getText());
    }
    |   rg = register {
        $result = $rg.result;
    }
    ;

dataSection returns [List<DataDirective> result]
    @init {
        $result = new ArrayList<DataDirective>();
    }
    :   DATA (dd = dataDirective { $result.add($dd.result); })*
    ;

ASSIGN      :       '<-'    ;
ADD         :       '+'     ;
SUB         :       '-'     ;
MUL         :       '*'     ;
DIV         :       '/'     ;
LT          :       '<'     ;
LE          :       '<='    ;
EQ          :       '='     ;

COLON       :       ':'     ;
UNDERSLASH  :       '_'     ;
DOT         :       '.'     ;

LPAREN      :       '('     ;
RPAREN      :       ')'     ;

fragment    LETTER                  :   ('a'..'z' | 'A'..'Z');
fragment    DIGIT                   :   ('0'..'9');
fragment    ALPHANUMERIC            :   (DIGIT | LETTER);
fragment    UNSIGNED_INTEGER        :   '0' | (('1'..'9') DIGIT*);

VR                      :   'VR' UNSIGNED_INTEGER;
VI                      :   'VI' UNSIGNED_INTEGER;
INTEGER                 :   '0' | (('-')? ('1'..'9') DIGIT*);
LABEL					: 	(LETTER | '_')(ALPHANUMERIC | '_' | '.')*;
STRING                  :   '"' ( '""' | ~('"'))* '"';

WS              :   (' ' | '\t') { skip(); };
NEWLINE         :   ('\r')? ('\n') { skip(); };
COMMENT         :   '#' (~('\n' | '\r'))* { skip(); };
