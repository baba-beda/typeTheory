package pattern;

import expression.Application;
import expression.Expression;
import expression.LambdaExpression;
import expression.Variable;

import java.time.temporal.ValueRange;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by baba_beda on 8/28/16.
 */
public class Pred extends Pattern {

    public Pred(Expression expression) {
        variables = new HashSet<>();
        variables.addAll(expression.getBoundedVariables());
    }

    public Pred() {
        variables = new HashSet<>();
        variables.add(new Variable("m"));
        variables.add(new Variable("s"));
        variables.add(new Variable("z"));
        variables.add(new Variable("f"));
        variables.add(new Variable("g"));
    }





    @Override
    public String toString() {
        return "PRED";
    }

    public static boolean isPred(Expression expression) {
        if (expression instanceof LambdaExpression
                && ((LambdaExpression) expression).getInside() instanceof LambdaExpression
                && ((LambdaExpression) ((LambdaExpression) expression).getInside()).getInside() instanceof LambdaExpression) {
            Variable m = ((LambdaExpression) expression).getVar();
            Variable s = ((LambdaExpression) ((LambdaExpression) expression).getInside()).getVar();
            Variable z = ((LambdaExpression) ((LambdaExpression) ((LambdaExpression) expression).getInside()).getInside()).getVar();

            Expression appl = ((LambdaExpression) ((LambdaExpression) ((LambdaExpression) expression).getInside()).getInside()).getInside();
            if (appl instanceof Application
                    && ((Application) appl).getLeft() instanceof Application
                    && ((Application) ((Application) appl).getLeft()).getLeft() instanceof Application
                    && IdentityFunction.isIdentityFunction(((Application) appl).getRight())
                    && ((Application) ((Application) appl).getLeft()).getRight() instanceof LambdaExpression
                    && ((LambdaExpression) ((Application) ((Application) appl).getLeft()).getRight()).getInside().equals(z)) {
                Application appl1 = (Application) ((Application) ((Application) appl).getLeft()).getLeft();
                if (appl1.getLeft().equals(m)
                        && appl1.getRight() instanceof LambdaExpression
                        && ((LambdaExpression) appl1.getRight()).getInside() instanceof LambdaExpression
                        && ((LambdaExpression) ((LambdaExpression) appl1.getRight()).getInside()).getInside() instanceof Application
                        && ((Application) ((LambdaExpression) ((LambdaExpression) appl1.getRight()).getInside()).getInside()).getRight() instanceof Application) {
                    Variable f = ((LambdaExpression) appl1.getRight()).getVar();
                    Variable g = ((LambdaExpression) ((LambdaExpression) appl1.getRight()).getInside()).getVar();
                    Application appl2 = (Application) ((LambdaExpression) ((LambdaExpression) appl1.getRight()).getInside()).getInside();
                    return appl2.getLeft().equals(g) && appl2.getRight().equals(new Application(f, s));
                }
                else {
                    return false;
                }


            }
            else {
                return false;
            }
        }
        else {
            return false;
        }
    }

}
