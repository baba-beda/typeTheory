package pattern;

import expression.Expression;
import expression.LambdaExpression;
import expression.Variable;
import utils.Parser;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by baba_beda on 8/28/16.
 */
public class False extends Pattern {
    public False(Expression expression) {
        variables = new HashSet<>();
        variables.addAll(expression.getBoundedVariables());
    }

    public False() {
        variables = new HashSet<>();
        variables.add(new Variable("x"));
        variables.add(new Variable("y"));
    }
    public static boolean isFalse(Expression expression) {
        return expression instanceof LambdaExpression
                && IdentityFunction.isIdentityFunction(((LambdaExpression) expression).getInside());
    }

    @Override
    public String toString() {
        return "FALSE";
    }

    public static Expression getFalse() {
        return new LambdaExpression(new Variable("x_1_1"), IdentityFunction.getID());
    }

}
