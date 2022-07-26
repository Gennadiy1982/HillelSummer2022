package homework_10.hw_08_iterator;

import java.util.function.Consumer;

public interface Iterator {

    boolean hasNext();

    void forEachRemaining(Consumer<String> action);

    String next();

    void remove();
}
