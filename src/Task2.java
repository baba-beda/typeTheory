import expression.Expression;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import parser.LambdaLexer;
import parser.LambdaParser;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Created by baba_beda on 8/24/16.
 */
public class Task2 {
    static void solve() {
        try (Scanner in = new Scanner(new File("task1.in"))) {
            System.out.println(getParsed(in.nextLine()).toString());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    static Expression getParsed(String input) {
        return (new LambdaParser(new CommonTokenStream(new LambdaLexer(new ANTLRInputStream(input))))).expression().value;
    }
}
