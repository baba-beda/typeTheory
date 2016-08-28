package expression;

/**
 * Created by baba_beda on 8/25/16.
 */
public class Condition {
    private Expression mainExpression;
    private Variable var;
    private Expression substituteExpression;

    public Condition(Expression mainExpression, Variable var, Expression substituteExpression) {
        this.mainExpression = mainExpression;
        this.var = var;
        this.substituteExpression = substituteExpression;
    }

    public Expression getMainExpression() {
        return mainExpression;
    }

    public Variable getVar() {
        return var;
    }

    public Expression getSubstituteExpression() {
        return substituteExpression;
    }

    @Override
    public String toString() {
        return mainExpression.toString() + "["  + var.toString() + " := " + substituteExpression.toString() + "]";
    }

}
