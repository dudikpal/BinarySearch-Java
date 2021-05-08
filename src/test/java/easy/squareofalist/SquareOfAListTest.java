package easy.squareofalist;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class SquareOfAListTest {

    @Test
    void test() {
        int[] input = {-9, -2, 0, 2, 3};

        int[] expected = {0, 4, 4, 9, 81};

        assertTrue(Arrays.equals(expected, new SquareOfAList().solve(input)));
    }

}