package expression.db_expression;

import expression.Application;
import expression.Expression;
import expression.LambdaExpression;
import expression.Variable;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * Created by baba_beda on 10/17/16.
 */
public class DBExpression {
    private static Map<Variable, Integer> freeVars;
    public static DBExpression toDBExpression(Expression expression) {
        freeVars = new HashMap<>();
        Set<Variable> freeVarsEx = expression.getFreeVariables();
        Map<Variable, Integer> context = new HashMap<>();
        for (Variable v : freeVarsEx) {
            context.put(v, context.size());
            freeVars.put(v, freeVars.size());
        }
        return toDBExpressionInternal(context, expression);
    }

    private static DBExpression toDBExpressionInternal(Map<Variable, Integer> context, Expression expression) {
        if (expression instanceof Application) {
            return new DBApplication(toDBExpressionInternal(context, ((Application) expression).getLeft()), toDBExpressionInternal(context, ((Application) expression).getRight()));
        }
        if (expression instanceof LambdaExpression) {
            Map<Variable, Integer> newContext = new HashMap<>();
            for (Map.Entry<Variable, Integer> entry : context.entrySet()) {
                newContext.put(entry.getKey(), entry.getValue() + 1);
            }
            context = newContext;
            context.put(((LambdaExpression) expression).getVar(), 0);

            Map<Variable, Integer> newFreeVars = new HashMap<>();
            for (Map.Entry<Variable, Integer> entry : freeVars.entrySet()) {
                newFreeVars.put(entry.getKey(), entry.getValue() + 1);
            }
            freeVars = newFreeVars;

            return new DBLambdaExpression(toDBExpressionInternal(context, ((LambdaExpression) expression).getInside()));
        }
        if (expression instanceof Variable) {
            if (context.containsKey(expression)) {
                return new DBVariable(context.get(expression));
            }
            else {
                return new DBVariable(freeVars.get(expression));
            }
        }
        return null;
    }

    /*public static Expression toExpression(DBExpression dbExpression) {
        if (dbExpression instanceof DBApplication) {
            return new Application(toExpression(((DBApplication) dbExpression).getLeft()), toExpression(((DBApplication) dbExpression).getRight()));
        }
        if (dbExpression instanceof DBLambdaExpression) {
            return new LambdaExpression(new Variable("x" + ((DBLambdaExpression) dbExpression).getIndex()), toExpression(((DBLambdaExpression) dbExpression).getInside()));
        }
        if (dbExpression instanceof DBVariable) {
            return new Variable("x" + ((DBVariable) dbExpression).getIndex());
        }
        return null;
    }*/
}
