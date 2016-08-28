import expression.Expression;
import pattern.IsZero;
import pattern.Numeral;
import pattern.Pred;
import pattern.Succ;
import utils.Parser;
import utils.PatternFinder;
import utils.Reductor;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * Created by baba_beda on 8/25/16.
 */
public class Task4 {
    static void solve() {
        try (Scanner in = new Scanner(new File("task4.in"));
             PrintWriter out = new PrintWriter("task4.out")) {
            Expression toNormalize = Parser.getParsedExpression(in.nextLine());
            System.out.println("Input expression: " + toNormalize);
            /*Expression preparedToReduce = PatternFinder.findPatterns(toNormalize);
            System.out.println("Some patterns found: " + preparedToReduce);*/
            long start = System.currentTimeMillis();
            Expression prevReduct = toNormalize;
            Expression reduct = Reductor.reduce(toNormalize);
            int step = 1;
            out.println("0) " + toNormalize);
            while (!reduct.equals(prevReduct)) {
                out.println(step++ + ") " + reduct);
                prevReduct = reduct;
                reduct = Reductor.reduce(reduct);
            }
            System.out.println("Result: " + reduct.toString());
            out.close();
            System.err.println(System.currentTimeMillis() - start);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
