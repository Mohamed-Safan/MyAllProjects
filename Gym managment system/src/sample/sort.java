package sample;

import java.util.Comparator;
import java.util.function.Function;

public class sort implements Comparator<T> {
    @Override

    public int compare(T o1, T o2) {
        return 0;
    }

    @Override
    public Comparator<T> reversed() {
        return null;
    }

    @Override
    public <U extends Comparable<? super U>> Comparator<T> thenComparing(Function<? super T, ? extends U> keyExtractor) {
        return null;
    }
}
