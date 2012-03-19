lexer grammar CoolIr;

@header {
    package ro.pub.cpl.coolir;
}

CALL : 'call' ;
LOAD : 'load' ;
LOADB : 'loadb' ;
STORE : 'store' ;
STOREB : 'storeb' ;
JUMP : 'jump' ;
JUMPT : 'jumpt' ;
JUMPF : 'jumpf' ;
RETURN : 'return' ;
NOT : '~' ;
CODE : '.code' ;
DATA : '.data' ;
FUNCTION : '.function' ;
END : '.end' ;
DW : 'DW' ;
DL : 'DL' ;
DS : 'DS' ;
DB : 'DB' ;
T__47 : ',' ;
T__48 : '[' ;
T__49 : ']' ;

// $ANTLR src "src/ro/pub/cpl/coolir/CoolIr.g" 265
ASSIGN      :       '<-'    ;
// $ANTLR src "src/ro/pub/cpl/coolir/CoolIr.g" 266
ADD         :       '+'     ;
// $ANTLR src "src/ro/pub/cpl/coolir/CoolIr.g" 267
SUB         :       '-'     ;
// $ANTLR src "src/ro/pub/cpl/coolir/CoolIr.g" 268
MUL         :       '*'     ;
// $ANTLR src "src/ro/pub/cpl/coolir/CoolIr.g" 269
DIV         :       '/'     ;
// $ANTLR src "src/ro/pub/cpl/coolir/CoolIr.g" 270
LT          :       '<'     ;
// $ANTLR src "src/ro/pub/cpl/coolir/CoolIr.g" 271
LE          :       '<='    ;
// $ANTLR src "src/ro/pub/cpl/coolir/CoolIr.g" 272
EQ          :       '='     ;

// $ANTLR src "src/ro/pub/cpl/coolir/CoolIr.g" 274
COLON       :       ':'     ;
// $ANTLR src "src/ro/pub/cpl/coolir/CoolIr.g" 275
UNDERSLASH  :       '_'     ;
// $ANTLR src "src/ro/pub/cpl/coolir/CoolIr.g" 276
DOT         :       '.'     ;

// $ANTLR src "src/ro/pub/cpl/coolir/CoolIr.g" 278
LPAREN      :       '('     ;
// $ANTLR src "src/ro/pub/cpl/coolir/CoolIr.g" 279
RPAREN      :       ')'     ;

// $ANTLR src "src/ro/pub/cpl/coolir/CoolIr.g" 281
fragment    LETTER                  :   ('a'..'z' | 'A'..'Z');
// $ANTLR src "src/ro/pub/cpl/coolir/CoolIr.g" 282
fragment    DIGIT                   :   ('0'..'9');
// $ANTLR src "src/ro/pub/cpl/coolir/CoolIr.g" 283
fragment    ALPHANUMERIC            :   (DIGIT | LETTER);
// $ANTLR src "src/ro/pub/cpl/coolir/CoolIr.g" 284
fragment    UNSIGNED_INTEGER        :   '0' | (('1'..'9') DIGIT*);

// $ANTLR src "src/ro/pub/cpl/coolir/CoolIr.g" 286
VR                      :   'VR' UNSIGNED_INTEGER;
// $ANTLR src "src/ro/pub/cpl/coolir/CoolIr.g" 287
VI                      :   'VI' UNSIGNED_INTEGER;
// $ANTLR src "src/ro/pub/cpl/coolir/CoolIr.g" 288
INTEGER                 :   '0' | (('-')? ('1'..'9') DIGIT*);
// $ANTLR src "src/ro/pub/cpl/coolir/CoolIr.g" 289
LABEL					: 	(LETTER | '_')(ALPHANUMERIC | '_' | '.')*;
// $ANTLR src "src/ro/pub/cpl/coolir/CoolIr.g" 290
STRING                  :   '"' ( '""' | ~('"'))* '"';

// $ANTLR src "src/ro/pub/cpl/coolir/CoolIr.g" 292
WS              :   (' ' | '\t') { skip(); };
// $ANTLR src "src/ro/pub/cpl/coolir/CoolIr.g" 293
NEWLINE         :   ('\r')? ('\n') { skip(); };
// $ANTLR src "src/ro/pub/cpl/coolir/CoolIr.g" 294
COMMENT         :   '#' (~('\n' | '\r'))* { skip(); };
