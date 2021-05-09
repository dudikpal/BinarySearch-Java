package easy.repeatedaddition;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RepeatedAdditionTest {

    @Test
    void test8835() {
        int input = 8835;
        int expected = 6;
        assertEquals(expected, new RepeatedAddition().solve(input));
    }

    @Test
    void test1502() {
        int input = 1502;
        int expected = 8;
        assertEquals(expected, new RepeatedAddition().solve(input));
    }

    @Test
    void test19() {
        int input = 19;
        int expected = 1;
        assertEquals(expected, new RepeatedAddition().solve(input));
    }

}