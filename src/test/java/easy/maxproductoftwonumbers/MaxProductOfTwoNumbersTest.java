package easy.maxproductoftwonumbers;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MaxProductOfTwoNumbersTest {

    @Test
    void test35() {
        int[] input = {5, 7, 1};
        int expected = 35;
        assertEquals(expected, new MaxProductOfTwoNumbers().solve(input));
    }

    @Test
    void test49() {
        int[] input = {7, 1, 7};
        int expected = 49;
        assertEquals(expected, new MaxProductOfTwoNumbers().solve(input));
    }

    @Test
    void test1() {
        int[] input = {-1, -1, 0};
        int expected = 1;
        assertEquals(expected, new MaxProductOfTwoNumbers().solve(input));
    }

    @Test
    void testminus6() {
        int[] input = {2, -3};
        int expected = -6;
        assertEquals(expected, new MaxProductOfTwoNumbers().solve(input));
    }

}