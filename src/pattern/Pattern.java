package pattern;

import expression.Expression;
import expression.Variable;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by baba_beda on 8/28/16.
 */
public class Pattern extends Expression {
    Set<Variable> variables;
    @Override
    public Set<Variable> getFreeVariables() {
        return new HashSet<>();
    }

    @Override
    public Set<Variable> getBoundedVariables() {
        return variables;
    }

    @Override
    public boolean equals(Object o) {
        return this.getClass() == o.getClass();
    }
}
