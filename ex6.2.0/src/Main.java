import java.util.HashSet;
import java.util.Set;

public class Main {

    public static void main(String[] args) {

    }

    public static <T> Set<T> symmetricDifference(Set<? extends T> set1, Set<? extends T> set2) {

        Set<T> result = new HashSet<T>();

        for (T value1 : set1) {
            if (!set2.contains(value1))
                result.add(value1);
        }
        for (T value2 : set2) {
            if (!set1.contains(value2))
                result.add(value2);
        }
        return result;
    }
}
