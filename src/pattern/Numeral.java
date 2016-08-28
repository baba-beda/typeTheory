package pattern;

import com.sun.org.apache.xml.internal.dtm.ref.DTMDefaultBaseIterators;
import expression.Application;
import expression.Expression;
import expression.LambdaExpression;
import expression.Variable;
import utils.Parser;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by baba_beda on 8/28/16.
 */
public class Numeral extends Pattern {
    private int num;

    public Numeral(int num) {
        this.num = num;
        variables = new HashSet<>();
        variables.add(new Variable("f"));
        variables.add(new Variable("x"));
    }
    public Numeral(Expression expression) {
        variables = new HashSet<>();
        Variable fVar = ((LambdaExpression) expression).getVar();
        variables.add(fVar);
        variables.add(((LambdaExpression) ((LambdaExpression) expression).getInside()).getVar());
        String exprStr = ((LambdaExpression) expression).getInside().toString();
        num = 0;
        for (int i = 0; i < exprStr.length() - fVar.toString().length(); i++) {
            if (exprStr.substring(i, i + fVar.toString().length()).equals(fVar.toString())) {
                num++;
            }
        }
    }

    public int getNum() {
        return num;
    }

    public static boolean isNumeral(Expression expression) {
        boolean startCheck =  expression instanceof LambdaExpression
                && ((LambdaExpression) expression).getInside() instanceof LambdaExpression;
        if (!startCheck) {
            return false;
        }
        Variable s = ((LambdaExpression) expression).getVar();
        Variable z = ((LambdaExpression) (((LambdaExpression) expression).getInside())).getVar();
        Expression toCheck = ((LambdaExpression) ((LambdaExpression) expression).getInside()).getInside();

        while (toCheck instanceof Application && ((Application) toCheck).getLeft().equals(s)) {
            toCheck = ((Application) toCheck).getRight();
        }

        return toCheck.equals(z);
    }

    public static Expression getNumeral(int n) {
        Variable f = new Variable("f_2_1");
        Variable x = new Variable("x_2_1");
        String s = "\\f.\\x.";
        for (int i = 0; i < n; i++) {
            s += f + " (";
        }
        s += x;
        for (int i = 0; i < n; i++) {
            s += ")";
        }
        return Parser.getParsedExpression(s);
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Numeral numeral = (Numeral) o;

        return num == numeral.num;

    }

    @Override
    public int hashCode() {
        return num;
    }

    @Override
    public String toString() {
        return Integer.toString(num);
    }
}
