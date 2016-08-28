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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Variable variable = (Variable) o;

        return value.equals(variable.value);

    }

    @Override
    public int hashCode() {
        return value.hashCode();
    }
}
