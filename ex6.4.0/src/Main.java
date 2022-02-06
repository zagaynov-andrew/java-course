import java.math.BigInteger;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {

        // test
        pseudoRandomStream(13).limit(7).mapToObj(x -> " " + x).forEach(System.out::print);
    }

    public static IntStream pseudoRandomStream(int seed) {

        return IntStream.iterate(seed, n -> (( n * n) / 10) % 1000);
    }
}
