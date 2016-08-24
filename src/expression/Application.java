package expression;

/**
 * Created by baba_beda on 8/24/16.
 */
public class Application extends Expression {
    private Expression left, right;

    public Application(Expression left, Expression right) {
        this.left = left;
        this.right = right;
    }

    public Expression getLeft() {
        return left;
    }

    public Expression getRight() {
        return right;
    }

    @Override
    public String toString() {
        return "(" + left.toString() + " " + right.toString() + ")";
    }
}
