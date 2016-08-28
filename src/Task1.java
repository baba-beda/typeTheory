import expression.Expression;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import parser.LambdaLexer;
import parser.LambdaParser;
import utils.*;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Created by baba_beda on 8/24/16.
 */
public class Task1 {
    static void solve() {
        try (Scanner in = new Scanner(new File("task1.in"))) {
            System.out.println(Parser.getParsedExpression(in.nextLine()).toString());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

}
