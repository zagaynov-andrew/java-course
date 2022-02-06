import org.w3c.dom.stylesheets.LinkStyle;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.function.BiConsumer;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

    /**
     * Finds the minimum and maximum elements in the stream in accordance
     * with the order specified by the Comparator.
     * The found minimum and maximum elements are passed to minMaxConsumer.
     */
    public static <T> void findMinMax(
            Stream<? extends T> stream,
            Comparator<? super T> order,
            BiConsumer<? super T, ? super T> minMaxConsumer) {

        List<T> list = stream.sorted(order).collect(Collectors.toList());

        if (list.size() == 0) {
            minMaxConsumer.accept(null, null);
        } else {
            T min = list.get(0);
            T max = list.get(list.size() - 1);
            minMaxConsumer.accept(min, max);
        }
    }
}
