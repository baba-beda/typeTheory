package utils;

import expression.Application;
import expression.Expression;
import expression.LambdaExpression;
import expression.Variable;
import pattern.*;

/**
 * Created by baba_beda on 8/28/16.
 */
public class PatternFinder {
    public static Expression findPatterns(Expression expression) {
        Expression patternQuery = isPattern(expression);
        if (patternQuery instanceof Pattern) {
            return patternQuery;
        }

        if (expression instanceof LambdaExpression) {
            return new LambdaExpression(((LambdaExpression) expression).getVar(), findPatterns(((LambdaExpression) expression).getInside()));
        }

        if (expression instanceof Application) {
            return new Application(findPatterns(((Application) expression).getLeft()), findPatterns(((Application) expression).getRight()));
        }

        if (expression instanceof Variable) {
            return expression;
        }
        return expression;
    }

    private static Expression isPattern(Expression expression) {
        if (False.isFalse(expression)) {
            return new False(expression);
        }
        if (IdentityFunction.isIdentityFunction(expression)) {
            return new IdentityFunction(expression);
        }
        if (IsZero.isIsZero(expression)) {
            return new IsZero(expression);
        }
        if (Numeral.isNumeral(expression)) {
            return new Numeral(expression);
        }
        if (Pred.isPred(expression)) {
            return new Pred(expression);
        }
        if (Succ.isSucc(expression)) {
            return new Succ((LambdaExpression) expression);
        }
        if (Sum.isSum(expression)) {
            return new Sum(expression);
        }
        if (True.isTrue(expression)) {
            return new True(expression);
        }
        if (Mul.isMul(expression)) {
            return new Mul(expression);
        }
        return expression;
    }
}
