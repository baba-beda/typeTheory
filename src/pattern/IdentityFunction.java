package pattern;

import expression.Expression;
import expression.LambdaExpression;
import expression.Variable;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by baba_beda on 8/28/16.
 */
public class IdentityFunction extends Pattern {
    public IdentityFunction(Expression expression) {
        variables = new HashSet<>();
        variables.add(((LambdaExpression) expression).getVar());
    }


    public IdentityFunction() {
        variables = new HashSet<>();
        variables.add(new Variable("x"));
    }

    public static boolean isIdentityFunction(Expression expression) {
        return expression instanceof LambdaExpression
                && ((LambdaExpression) expression).getVar().equals(((LambdaExpression) expression).getInside());
    }

    @Override
    public String toString() {
        return "ID";
    }

    public static Expression getID() {
        return new LambdaExpression(new Variable("b_1_1"), new Variable("b_1_1"));
    }
}
