package easy.recurringcharacter;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RecurringCharacterTest {

    @Test
    void test() {
        String input = "abcda";

        int expected = 4;

        assertEquals(expected, new RecurringCharacter().solve(input));
    }

    @Test
    void test2() {
        String input = "abcde";

        int expected = -1;

        assertEquals(expected, new RecurringCharacter().solve(input));
    }

    @Test
    void test3() {
        String input = "bb";

        int expected = 1;

        assertEquals(expected, new RecurringCharacter().solve(input));
    }

    @Test
    void test4() {
        String input = "ba";

        int expected = -1;

        assertEquals(expected, new RecurringCharacter().solve(input));
    }

}