grammar Lambda;
@header {
    package parser;
    import expression.*;
    import pattern.*;
}

condition returns [Condition cond] : e1=expression (SPACE | ) SQOB (SPACE | ) v=variable (SPACE | ) ASSIGN (SPACE | ) e2=expression SQCB {$cond = new Condition($e1.value, $v.value, $e2.value);};
expression returns [Expression value] : a1=application SPACE SLASH (SPACE |  ) v1=variable ((SPACE | ) | ) DOT ((SPACE | ) | ) e1=expression {$value = new Application($a1.value, new LambdaExpression($v1.value, $e1.value));}
            | SLASH (SPACE | ) v2=variable (SPACE | ) DOT (SPACE | ) e2=expression {$value = new LambdaExpression($v2.value, $e2.value);}
            | a2=application {$value = $a2.value;};

application returns [Expression value] : a1=application SPACE at1=atom {$value = new Application($a1.value, $at1.value);}
            | at2=atom {$value = $at2.value;};

atom returns [Expression value] : OB e=expression CB {$value = $e.value;}
     | f=function {$value = $f.value;}
     | v=variable {$value = $v.value;}
     | n=numeral {$value = $n.value;};

numeral returns [Numeral value] : NUMERAL {$value = new Numeral(Integer.parseInt($NUMERAL.text));};

function returns [Pattern value] : PRED {$value = new Pred();}
                                | SUCC {$value = new Succ();}
                                | TRUE {$value = new True();}
                                | FALSE {$value = new False();}
                                | SUM {$value = new Sum();}
                                | MUL {$value = new Mul();}
                                | ID {$value = new IdentityFunction();}
                                | ISZERO {$value = new IsZero();};


variable returns [Variable value] : VAR {$value = new Variable($VAR.text);};


SPACE: [ \t\n\r]+;
SLASH : '\\';
OB : '(';
CB : ')';
VAR : [a-z]([a-z]|[0-9]|'\''|'_')*;
DOT : '.';
SQOB : '[';
SQCB : ']';
ASSIGN : ':=';

PRED: 'PRED';
SUCC: 'SUCC';
NUMERAL : ('-'|) [1-9]([0-9])* | '0' ;
TRUE : 'TRUE';
FALSE : 'FALSE';
SUM : 'SUM';
MUL : 'MUL';
ID : 'ID';
ISZERO : 'IS0';
