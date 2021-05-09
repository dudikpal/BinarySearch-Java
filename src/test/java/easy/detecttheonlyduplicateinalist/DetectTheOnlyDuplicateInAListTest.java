package easy.detecttheonlyduplicateinalist;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DetectTheOnlyDuplicateInAListTest {

    @Test
    void test1() {
        int[] input = {1, 2, 3, 1};
        int expected = 1;
        assertEquals(expected, new DetectTheOnlyDuplicateInAList().solve(input));
    }

    @Test
    void test2() {
        int[] input = {4, 2, 1, 3, 2};
        int expected = 2;
        assertEquals(expected, new DetectTheOnlyDuplicateInAList().solve(input));
    }


}