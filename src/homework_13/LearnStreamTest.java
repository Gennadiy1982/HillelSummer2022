package homework_13;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class LearnStreamTest {

    @Test
    void averAge() {
        List<Integer> list = List.of(2,2,5);
        double res = LearnStream.averAge(list);
        assertEquals(3,res);
    }

    @Test
    void sortWord() {
        List<String> list = List.of("hell");
        List<String> list1 = LearnStream.sortWord(list);
        assertEquals(list,list1);
    }
}