/**
 * Created by baba_beda on 8/24/16.
 */
public class Main {
    public static void main(String[] args) {
        for (String arg : args) {
            int n = Integer.parseInt(arg);
            switch (n) {
                case 1:
                    Task1.solve();
                    break;
                case 2:
                    Task2.solve();
                    break;
                case 3:
                    Task3.solve();
                    break;
                case 4:
                    Task4.solve();
                    break;
            }
        }
    }
}
