package expression;

/**
 * Created by baba_beda on 8/24/16.
 */
public class Variable extends Expression {
    private String value;
    public Variable(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return value;
    }
}
