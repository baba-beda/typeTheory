package pattern;

import expression.Application;
import expression.Expression;
import expression.LambdaExpression;
import expression.Variable;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by baba_beda on 8/28/16.
 */
public class IsZero extends Pattern {
    public IsZero(Expression expression) {
        variables = new HashSet<>();
        variables.addAll(expression.getBoundedVariables());
    }

    public IsZero() {
        variables = new HashSet<>();
        variables.add(new Variable("m"));
        variables.add(new Variable("x"));
        variables.add(new Variable("y"));
    }


    @Override
    public String toString() {
        return "IS0";
    }



    public static boolean isIsZero(Expression expression) {
        return expression instanceof LambdaExpression
                && ((LambdaExpression) expression).getInside() instanceof Application
                && ((Application) ((LambdaExpression) expression).getInside()).getLeft() instanceof Application
                && ((LambdaExpression) expression).getVar().equals(((Application) ((Application) ((LambdaExpression) expression).getInside()).getLeft()).getLeft())
                && ((Application) ((Application) ((LambdaExpression) expression).getInside()).getLeft()).getRight() instanceof LambdaExpression
                && False.isFalse(((LambdaExpression) ((Application) ((Application) ((LambdaExpression) expression).getInside()).getLeft()).getRight()).getInside())
                && True.isTrue(((Application) ((LambdaExpression) expression).getInside()).getRight());
    }
}
