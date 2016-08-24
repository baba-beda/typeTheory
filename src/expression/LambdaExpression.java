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
}
