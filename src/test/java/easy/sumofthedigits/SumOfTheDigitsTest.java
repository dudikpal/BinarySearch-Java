package easy.sumofthedigits;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SumOfTheDigitsTest {

    @Test
    void test() {
        int input = 123;
        int expected = 6;
        assertEquals(expected, new SumOfTheDigits().solve(input));
    }

    @Test
    void test2() {
        int input = 50;
        int expected = 5;
        assertEquals(expected, new SumOfTheDigits().solve(input));
    }

    @Test
    void test3() {
        int input = 100000;
        int expected = 1;
        assertEquals(expected, new SumOfTheDigits().solve(input));
    }

}