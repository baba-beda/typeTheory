package expression;

import sun.applet.AppletListener;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by baba_beda on 8/24/16.
 */
public class Expression {
    private Set<Variable> freeVariables;
    private Set<Variable> boundedVariables;


    public Set<Variable> getFreeVariables() {
        if (freeVariables == null) {
            this.freeVariables = new HashSet<>();
            if (this instanceof Variable) {
                this.freeVariables.add((Variable) this);
            }
            if (this instanceof Application) {
                this.freeVariables.addAll(((Application) this).getLeft().getFreeVariables());
                this.freeVariables.addAll(((Application) this).getRight().getFreeVariables());

            }
            if (this instanceof LambdaExpression) {
                this.freeVariables.addAll(((LambdaExpression) this).getInside().getFreeVariables());
                this.freeVariables.remove(((LambdaExpression) this).getVar());
            }
        }
        return freeVariables;
    }

    public Set<Variable> getBoundedVariables() {
        this.boundedVariables = new HashSet<>();
        if (this instanceof Application) {
            this.boundedVariables.addAll(((Application) this).getLeft().getBoundedVariables());
            this.boundedVariables.addAll(((Application) this).getRight().getBoundedVariables());
        }
        if (this instanceof LambdaExpression) {
            this.boundedVariables.add(((LambdaExpression) this).getVar());
            this.boundedVariables.addAll(((LambdaExpression) this).getInside().getBoundedVariables());
        }

        return boundedVariables;
    }

    public Set<Variable> getVariables() {
        Set<Variable> variables = new HashSet<>();
        variables.addAll(getBoundedVariables());
        variables.addAll(getFreeVariables());
        return variables;
    }
}
