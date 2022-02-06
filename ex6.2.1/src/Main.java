import java.util.*;

/**
 * A program that reads integers and outputs them in reverse order through one.
 */
public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Deque<Integer> data = new LinkedList<>();
        String token;
        int idx = 1;

        while (scanner.hasNextInt()) {
            token = scanner.next();

            if (idx % 2 == 0)
                data.addFirst(Integer.parseInt(token));
            idx++;
        }
        data.forEach(elem -> System.out.print(elem + " "));
    }
}
