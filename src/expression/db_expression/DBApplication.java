package expression.db_expression;

import expression.Expression;

/**
 * Created by baba_beda on 10/17/16.
 */
public class DBApplication extends DBExpression {
    private DBExpression left;
    private DBExpression right;
    public DBApplication(DBExpression left, DBExpression right) {
        this.left = left;
        this.right = right;

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        DBApplication that = (DBApplication) o;

        if (left != null ? !left.equals(that.left) : that.left != null) return false;
        return right != null ? right.equals(that.right) : that.right == null;

    }

    @Override
    public int hashCode() {
        int result = left != null ? left.hashCode() : 0;
        result = 31 * result + (right != null ? right.hashCode() : 0);
        return result;
    }

    public DBExpression getLeft() {
        return left;
    }

    public DBExpression getRight() {
        return right;
    }

    @Override
    public String toString() {
        return "(" + left.toString() + " " + right.toString() + ")";
    }
}
