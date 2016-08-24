grammar Lambda;
@header {
    package parser;
    import expression.*;
}

expression returns [Expression value] : a1=application SPACE SLASH (SPACE |  ) v1=variable ((SPACE | ) | ) DOT ((SPACE | ) | ) e1=expression {$value = new Application($a1.value, new LambdaExpression($v1.value, $e1.value));}
            | SLASH (SPACE | ) v2=variable (SPACE | ) DOT (SPACE | ) e2=expression {$value = new LambdaExpression($v2.value, $e2.value);}
            | a2=application {$value = $a2.value;};

application returns [Expression value] : a1=application SPACE at1=atom {$value = new Application($a1.value, $at1.value);}
            | at2=atom {$value = $at2.value;};

atom returns [Expression value] : OB e=expression CB {$value = $e.value;}
     | v=variable {$value = $v.value;};

variable returns [Variable value] : VAR {$value = new Variable($VAR.text);};


SPACE: [ \t]+;
SLASH : '\\';
OB : '(';
CB : ')';
VAR : [a-z]([a-z]|[0-9]|'\'')*;
DOT : '.';
