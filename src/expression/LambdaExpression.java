package expression;

/**
 * Created by baba_beda on 8/24/16.
 */
public class LambdaExpression extends Expression {
    private Variable var;
    private Expression inside;

    public LambdaExpression(Variable var, Expression inside) {
        this.var = var;
        this.inside = inside;
    }

    public Variable getVar() {
        return var;
    }

    public Expression getInside() {
        return inside;
    }

    @Override
    public String toString() {
        return "(\\" + var.toString() + "." + inside.toString() + ")";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        LambdaExpression that = (LambdaExpression) o;

        return var.equals(that.var) && inside.equals(that.inside);

    }

    @Override
    public int hashCode() {
        int result = var.hashCode();
        result = 31 * result + inside.hashCode();
        return result;
    }
}
