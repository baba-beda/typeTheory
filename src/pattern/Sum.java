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
public class Sum extends Pattern {

    public Sum(Expression expression) {
        variables = new HashSet<>();
        variables.addAll(expression.getBoundedVariables());
    }


    public static boolean isSum(Expression expression) {
        return expression instanceof Application
                && IdentityFunction.isIdentityFunction(((Application) expression).getLeft())
                && Succ.isSucc(((Application) expression).getRight());
    }

    @Override
    public String toString() {
        return "SUM";
    }

    public Sum() {
        variables = new HashSet<>();
        variables.add(new Variable("m"));
        variables.add(new Variable("s"));
        variables.add(new Variable("z"));
    }

    public static Expression getSum() {
        return new LambdaExpression(new Variable("m_1_2"), new Application(new Variable("m_1_2"), Succ.getSucc()));
    }
}
