package easy.swapconsecutiveindexpairs;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SwapConsecutiveIndexPairsTest {

    @Test
    void test() {
        int[] input = {0, 1, 2, 3, 4, 5, 6, 7, 8};
        int[] expected = {2, 3, 0, 1, 6, 7, 4, 5, 8};
        assertArrayEquals(expected, new SwapConsecutiveIndexPairs().solve(input));
    }

    @Test
    void test2() {
        int[] input = {0, 1, 2, 3, 4, 5, 6};
        int[] expected = {2, 3, 0, 1, 6, 5, 4};
        assertArrayEquals(expected, new SwapConsecutiveIndexPairs().solve(input));
    }

}