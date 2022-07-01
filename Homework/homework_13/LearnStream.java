package homework_13;

import java.util.List;
import java.util.Locale;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class LearnStream {

    public static double averAge(List<Integer> list) {
        return list.stream().mapToInt(Integer::intValue).average().orElse(0.0);
    }

    public static List<String> sortWord(List<String> list) {
        int wordLength = 4;

        Predicate<String> prd = (word) -> word.length() == wordLength;
        Predicate<String> prd1 = (word) -> word.startsWith(word.toLowerCase(Locale.ROOT));

        list = list.stream()
                .filter(prd.and(prd1))
                .collect(Collectors.toList());

        return list;
    }
}





