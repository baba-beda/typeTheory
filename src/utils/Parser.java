package utils;

import expression.Condition;
import expression.Expression;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import parser.LambdaLexer;
import parser.LambdaParser;

/**
 * Created by baba_beda on 8/27/16.
 */
public class Parser {
    public static Expression getParsedExpression(String input) {
        return (new LambdaParser(new CommonTokenStream(new LambdaLexer(new ANTLRInputStream(input))))).expression().value;
    }

    public static Condition getParsedCondition(String input) {
        return (new LambdaParser(new CommonTokenStream(new LambdaLexer(new ANTLRInputStream(input))))).condition().cond;
    }
}
