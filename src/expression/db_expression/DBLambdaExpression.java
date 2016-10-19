package expression.db_expression;

import expression.Expression;

/**
 * Created by baba_beda on 10/17/16.
 */
public class DBLambdaExpression extends DBExpression {
    private DBExpression inside;
    private DBVariable index;
    public DBLambdaExpression(DBExpression inside) {
        //this.index = index;
        this.inside = inside;
    }

    public DBExpression getInside() {
        return inside;
    }

    @Override
    public String toString() {
        return "(" + "\\." + inside.toString() + ")";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        DBLambdaExpression that = (DBLambdaExpression) o;

        return inside != null ? inside.equals(that.inside) : that.inside == null;

    }

    @Override
    public int hashCode() {
        return inside != null ? inside.hashCode() : 0;
    }
}
