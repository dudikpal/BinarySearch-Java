package easy.sumoftwonumbers;


import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class SumOfTwoNumbersTest {

    @Test
    void solveTrue() {
        int[] input = {35, 8, 18, 3, 22};
        assertTrue(new SumOfTwoNumbers().solve(input, 11));
    }

    @Test
    void solveFalse() {
        int[] input = {35, 8, 18, 3, 22};
        assertFalse(new SumOfTwoNumbers().solve(input, 4));
    }

    @Test
    void testTrue() {
        int[] input = {22, 1, 4, -2, 22};
        int expected = 44;
        assertTrue(new SumOfTwoNumbers().solve(input, expected));
    }
}