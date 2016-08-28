import expression.Expression;
import expression.Variable;
import utils.Parser;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.Set;

/**
 * Created by baba_beda on 8/24/16.
 */
public class Task2 {
    static void solve() {
        try (Scanner in = new Scanner(new File("task2.in"))) {
            Expression expression = Parser.getParsedExpression(in.nextLine());
            System.out.println(expression.toString());
            Set<Variable> freeVariables = expression.getFreeVariables();
            for (Variable v : freeVariables) {
                System.out.print(v.toString() + " ");
            }
            System.out.println();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
