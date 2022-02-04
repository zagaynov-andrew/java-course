import java.util.Scanner;

/**
 * The program reads the text and sums up all the real numbers encountered.
 */
public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String  token;
        double  sum = 0;

        while (scanner.hasNext()) {
            token = scanner.next();
            try {
                sum += Double.parseDouble(token);
            }
            catch (RuntimeException ex) {}
        }
        System.out.printf("%.6f", sum);
    }
}
