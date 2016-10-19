package utils;

import expression.*;
import expression.db_expression.DBApplication;
import expression.db_expression.DBExpression;
import expression.db_expression.DBLambdaExpression;
import expression.db_expression.DBVariable;

/**
 * Created by baba_beda on 8/25/16.
 */
public class Substitutor {
    public static Expression substitute(Condition condition) {
        return substitute(condition.getMainExpression(), condition.getVar(), condition.getSubstituteExpression());
    }

    private static Expression substituteVar(Expression expression, Variable oldVar, Variable newVar) {
        if (expression instanceof Variable) {
            if (expression.equals(oldVar)) {
                return newVar;
            }
            else {
                return expression;
            }
        }
        if (expression instanceof Application) {
            return new Application(substituteVar(((Application) expression).getLeft(), oldVar, newVar), substituteVar(((Application) expression).getRight(), oldVar, newVar));
        }

        if (expression instanceof LambdaExpression) {
            Variable tmp = ((LambdaExpression) expression).getVar();
            if (((LambdaExpression) expression).getVar().equals(oldVar)) {
                tmp = newVar;
            }
            return new LambdaExpression(tmp, substituteVar(((LambdaExpression) expression).getInside(), oldVar, newVar));
        }
        return expression;
    }

    private static Expression substitute(Expression curExpr, Variable var, Expression substituteExpr) {
        if (curExpr instanceof Variable) {
            if (curExpr.equals(var)) {
                return substituteExpr;
            }
            else {
                return curExpr;
            }
        }
        if (curExpr instanceof Application) {
            return new Application(substitute(((Application) curExpr).getLeft(), var, substituteExpr), substitute(((Application) curExpr).getRight(), var, substituteExpr));
        }
        if (curExpr instanceof LambdaExpression) {
            if (((LambdaExpression) curExpr).getVar().equals(var)) {
                return curExpr;
            }
            if (!substituteExpr.getFreeVariables().contains(((LambdaExpression) curExpr).getVar()) || !((LambdaExpression) curExpr).getInside().getFreeVariables().contains(var)) {
                return new LambdaExpression(((LambdaExpression) curExpr).getVar(), substitute(((LambdaExpression) curExpr).getInside(), var, substituteExpr));
            }
            if (substituteExpr.getFreeVariables().contains(((LambdaExpression) curExpr).getVar()) && ((LambdaExpression) curExpr).getInside().getFreeVariables().contains(var)) {
                Variable newVar = getModifiedVariable(((LambdaExpression) curExpr).getVar());
                Expression inside = substitute(((LambdaExpression) curExpr).getInside(), ((LambdaExpression) curExpr).getVar(), newVar);
                inside = substitute(inside, var, substituteExpr);
                return new LambdaExpression(newVar, inside);
            }
        }
        return curExpr;
    }

    private static Variable getModifiedVariable(Variable old) {
        String oldStr = old.getValue();
        String[] values = oldStr.split("_");
        if (values.length >= 2) {
            String id = values[0];
            for (int i = 1; i < values.length - 1; i++) {
                id += "_" + values[i];
            }
            return new Variable(id + "_" + (Integer.parseInt(values[values.length - 1]) + 1));
        }
        else {
            return new Variable(values[0] + "_" + 1);
        }
    }

    private static Expression getNextSubstituteExpression(Expression expression) {
        String exprStr = expression.toString();
        for(Variable v : expression.getVariables()) {
            exprStr = exprStr.replace(v.toString(), getModifiedVariable(v).toString());
        }
        return Parser.getParsedExpression(exprStr);
    }

    static DBExpression substituteDB(DBExpression subs, DBVariable v, DBExpression source) {
        if (source instanceof DBApplication) {
            return new DBApplication(substituteDB(subs, v, ((DBApplication) source).getLeft()), substituteDB(subs, v, ((DBApplication) source).getRight()));
        }
        if (source instanceof DBLambdaExpression) {
            return new DBLambdaExpression(substituteDB(shift(1, 0, subs), new DBVariable(v.getIndex() + 1), ((DBLambdaExpression) source).getInside()));
        }
        if (source instanceof DBVariable && source.equals(v)) {
            return subs;
        }
        return source;
    }

    static DBExpression shift(int d, int c, DBExpression dbExpression) {
        if (dbExpression instanceof DBVariable) {
            if (((DBVariable) dbExpression).getIndex() < c) {
                return dbExpression;
            }
            else {
                return new DBVariable(((DBVariable) dbExpression).getIndex() + d);
            }
        }
        if (dbExpression instanceof DBLambdaExpression) {
            return new DBLambdaExpression(shift(d, c + 1, ((DBLambdaExpression) dbExpression).getInside()));
        }
        if (dbExpression instanceof DBApplication) {
            return new DBApplication(shift(d, c, ((DBApplication) dbExpression).getLeft()), shift(d, c, ((DBApplication) dbExpression).getRight()));
        }
        return dbExpression;
    }
}
