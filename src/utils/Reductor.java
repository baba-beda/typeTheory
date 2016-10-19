package utils;

import expression.db_expression.*;

/**
 * Created by baba_beda on 8/27/16.
 */
public class Reductor {
    public static DBExpression reduce(DBExpression dbExpression) {
        if (dbExpression instanceof DBVariable) {
            return dbExpression;
        }
        if (dbExpression instanceof DBLambdaExpression) {
            return new DBLambdaExpression(reduce(((DBLambdaExpression) dbExpression).getInside()));
        }
        if (dbExpression instanceof DBApplication) {
            return apply(((DBApplication) dbExpression).getLeft(), ((DBApplication) dbExpression).getRight());
        }
        return dbExpression;
    }

    private static DBExpression apply(DBExpression e1, DBExpression e2) {
        if (e1 instanceof DBLambdaExpression) {
            return Substitutor.shift(-1, 0, Substitutor.substituteDB(Substitutor.shift(1, 0, e2), new DBVariable(0), ((DBLambdaExpression) e1).getInside()));
        }
        DBExpression leftRed = reduce(e1);
        if (e1.equals(leftRed)) {
            return new DBApplication(e1, reduce(e2));
        }
        else {
            return new DBApplication(leftRed, e2);
        }
    }
}
