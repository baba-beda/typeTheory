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
public class Succ extends Pattern {

    public Succ(LambdaExpression expression) {
        variables = new HashSet<>();
        variables.addAll(expression.getBoundedVariables());
    }
    public static boolean isSucc(Expression expression) {
        boolean startCheck = expression instanceof LambdaExpression
                && ((LambdaExpression) expression).getInside() instanceof LambdaExpression
                && ((LambdaExpression) ((LambdaExpression) expression).getInside()).getInside() instanceof LambdaExpression;
        if (!startCheck) {
            return false;
        }
        Expression inside = ((LambdaExpression) ((LambdaExpression) ((LambdaExpression) expression).getInside()).getInside()).getInside();
        Variable m = ((LambdaExpression) expression).getVar();
        Variable s = ((LambdaExpression) ((LambdaExpression) expression).getInside()).getVar();
        Variable z = ((LambdaExpression) ((LambdaExpression) ((LambdaExpression) expression).getInside()).getInside()).getVar();
        return inside.equals(new Application(new Application(m, s), new Application(s, z)));
    }


    public Succ() {
        variables = new HashSet<>();
        variables.add(new Variable("m"));
        variables.add(new Variable("s"));
        variables.add(new Variable("z"));
    }
    @Override
    public String toString() {
        return "SUCC";
    }

    public static Expression getSucc() {
        Variable m = new Variable("m_1_1");
        Variable s = new Variable("s_1_1");
        Variable z = new Variable("z_1_1");
        return new LambdaExpression(m, new LambdaExpression(s, new LambdaExpression(z, new Application(new Application(m ,s), new Application(s, z)))));
    }


}
