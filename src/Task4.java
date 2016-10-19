import expression.Expression;
import expression.db_expression.DBApplication;
import expression.db_expression.DBExpression;
import expression.db_expression.DBLambdaExpression;
import expression.db_expression.DBVariable;
import utils.*;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Scanner;

/**
 * Created by baba_beda on 8/25/16.
 */
public class Task4 {
    static void solve() {
        try (Scanner in = new Scanner(new File("task4.in"));
             PrintWriter out = new PrintWriter("task4.out")) {
            Expression toNormalize = Parser.getParsedExpression(in.nextLine());
            System.out.println("Input expression: " + DBExpression.toDBExpression(toNormalize));
            //System.out.println(DBExpression.toDBExpression(toNormalize));
            //System.out.println(DBExpression.toExpression(DBExpression.toDBExpression(toNormalize)));
            //long start = System.currentTimeMillis();
            DBExpression toNormalizeDB = DBExpression.toDBExpression(toNormalize);
            DBExpression prevReduct = toNormalizeDB;
            DBExpression reduct = Reductor.reduce(toNormalizeDB);
            int step = 1;
            out.println("0) " + toNormalize);
            while (!reduct.equals(prevReduct)) {
                System.out.println(step++ + ") " + reduct);
                prevReduct = reduct;
                reduct = Reductor.reduce(reduct);
            }
            System.out.println("Result: " + reduct.toString());
            out.close();
            //System.err.println(System.currentTimeMillis() - start);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
