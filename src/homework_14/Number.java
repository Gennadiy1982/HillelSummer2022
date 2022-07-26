package homework_14;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Number {
    String[] lines;

    public Number(String[] lines) {
        this.lines = lines;
    }

    public static Number[] createDigits (String... lines) {
        int width = (lines[0].length() - 9) / 10;
        return IntStream
                .range(0, 10)
                .mapToObj(number ->
                        new Number(Stream
                                .of(lines)
                                .map(line -> line.substring(number * (width + 1), (number + 1) * (width + 1) - 1))
                                .toArray(String[]::new))
                ).toArray(Number[]::new);
    }
}
