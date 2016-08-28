package pattern;

import expression.Application;
import expression.Expression;
import expression.LambdaExpression;
import expression.Variable;

import java.util.HashSet;

/**
 * Created by baba_beda on 8/28/16.
 */
public class Mul extends Pattern {
    public Mul(Expression expression) {
        variables = new HashSet<>();
        variables.addAll(expression.getBoundedVariables());
    }
    public Mul() {
        variables = new HashSet<>();
        variables.add(new Variable("x"));
        variables.add(new Variable("y"));
        variables.add(new Variable("s"));
    }

    @Override
    public String toString() {
        return "MUL";
    }

    public static boolean isMul(Expression expression) {
        if (expression instanceof LambdaExpression
                && ((LambdaExpression) expression).getInside() instanceof LambdaExpression
                && ((LambdaExpression) ((LambdaExpression) expression).getInside()).getInside() instanceof LambdaExpression
                && ((LambdaExpression) ((LambdaExpression) ((LambdaExpression) expression).getInside()).getInside()).getInside() instanceof Application
                && ((Application) ((LambdaExpression) ((LambdaExpression) ((LambdaExpression) expression).getInside()).getInside()).getInside()).getRight() instanceof Application) {
            Variable x = ((LambdaExpression) expression).getVar();
            Variable y = ((LambdaExpression) ((LambdaExpression) expression).getInside()).getVar();
            Variable s = ((LambdaExpression) ((LambdaExpression) ((LambdaExpression) expression).getInside()).getInside()).getVar();
            Application ins = (Application) ((LambdaExpression) ((LambdaExpression) ((LambdaExpression) expression).getInside()).getInside()).getInside();
            return ins.equals(new Application(x, new Application(y, s)));
        }
        return false;
    }
}
