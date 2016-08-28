package pattern;

import expression.Expression;
import expression.LambdaExpression;
import expression.Variable;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by baba_beda on 8/28/16.
 */
public class True extends Pattern {


    public True(Expression expression) {
        variables = new HashSet<>();
        variables.addAll(expression.getBoundedVariables());
    }

    public True() {
        variables = new HashSet<>();
        variables.add(new Variable("x"));
        variables.add(new Variable("y"));
    }

    public static boolean isTrue(Expression expression) {
        return expression instanceof LambdaExpression
                && ((LambdaExpression) expression).getInside() instanceof LambdaExpression
                && ((LambdaExpression) expression).getVar().equals(((LambdaExpression) ((LambdaExpression) expression).getInside()).getInside());
    }

    @Override
    public String toString() {
        return "TRUE";
    }

    public static Expression getTrue() {
        return new LambdaExpression(new Variable("x_1_2"), new LambdaExpression(new Variable("y_1_2"), new Variable("x_1_2")));
    }


}
