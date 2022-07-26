package test;

import com.hillel.service.GameOption;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class GameOptionTest {

    @Test
    void valueOf() {
        Assertions.assertEquals(GameOption.valueOf(1), GameOption.ROCK);
        Assertions.assertEquals(GameOption.valueOf(2), GameOption.PAPER);
        Assertions.assertEquals(GameOption.valueOf(3), GameOption.SCISSORS);
    }

    @Test
    void isWinBy() {
        Assertions.assertTrue(GameOption.ROCK.isWinBy(GameOption.PAPER));
        Assertions.assertTrue(GameOption.PAPER.isWinBy(GameOption.SCISSORS));
        Assertions.assertTrue(GameOption.SCISSORS.isWinBy(GameOption.ROCK));

        Assertions.assertFalse(GameOption.ROCK.isWinBy(GameOption.SCISSORS));
        Assertions.assertFalse(GameOption.SCISSORS.isWinBy(GameOption.PAPER));
    }
}