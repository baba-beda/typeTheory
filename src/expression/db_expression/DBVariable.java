package expression.db_expression;

/**
 * Created by baba_beda on 10/17/16.
 */
public class DBVariable extends DBExpression {
    private int index;
    public DBVariable(int index) {
        this.index = index;
    }

    public int getIndex() {
        return index;
    }

    @Override
    public String toString() {
        return Integer.toString(index);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        DBVariable that = (DBVariable) o;

        return index == that.index;

    }

    @Override
    public int hashCode() {
        return index;
    }
}
