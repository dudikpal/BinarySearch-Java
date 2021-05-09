package easy.numberofbits;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NumberOfBitsTest {

    @Test
    void test0() {
        int input = 0;
        int expected = 0;
        assertEquals(expected, new NumberOfBits().solve(input));
    }

    @Test
    void test1() {
        int input = 1;
        int expected = 1;
        assertEquals(expected, new NumberOfBits().solve(input));
    }

    @Test
    void test2() {
        int input = 2;
        int expected = 1;
        assertEquals(expected, new NumberOfBits().solve(input));
    }

    @Test
    void test3() {
        int input = 3;
        int expected = 2;
        assertEquals(expected, new NumberOfBits().solve(input));
    }

    @Test
    void test4() {
        int input = 4;
        int expected = 1;
        assertEquals(expected, new NumberOfBits().solve(input));
    }

}