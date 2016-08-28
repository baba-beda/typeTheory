package utils;

import expression.*;
import pattern.*;

/**
 * Created by baba_beda on 8/27/16.
 */
public class Reductor {
    public static Expression reduce(Expression expression) {
        if (expression instanceof Variable) {
            return expression;
        }
        if (expression instanceof LambdaExpression) {
            return new LambdaExpression(((LambdaExpression) expression).getVar(), reduce(((LambdaExpression) expression).getInside()));
        }
        if (expression instanceof Application) {
            return apply(((Application) expression).getLeft(), ((Application) expression).getRight());
        }
        return expression;
    }

    private static Expression apply(Expression e1, Expression e2) {
        if (e1 instanceof LambdaExpression) {
            return Substitutor.substitute(new Condition(((LambdaExpression) e1).getInside(), ((LambdaExpression) e1).getVar(), e2));
        }
        return new Application(reduce(e1), reduce(e2));
    }
}
