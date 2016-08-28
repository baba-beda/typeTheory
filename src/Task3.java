import com.sun.org.apache.xpath.internal.SourceTree;
import expression.Condition;
import expression.Expression;
import expression.LambdaExpression;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import parser.LambdaLexer;
import parser.LambdaParser;
import utils.Substitutor;
import utils.Parser;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Created by baba_beda on 8/25/16.
 */
public class Task3 {
    static void solve() {
        try (Scanner in = new Scanner(new File("task3.in"))) {
            Condition condition = Parser.getParsedCondition(in.nextLine());
            System.out.println(condition.toString());
            Expression result = Substitutor.substitute(condition);
            if (result.equals(condition.getMainExpression())) {
                System.out.println("Variable " + "\"" + condition.getVar() + "\"" + " is not free for substitution in expression " + condition.getMainExpression());
            }
            else {
                System.out.println("Substituted: " + result.toString());
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }


}
