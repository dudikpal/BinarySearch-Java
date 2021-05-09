package easy.listminreplacement;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class ListMinReplacementTest {

    @Test
    void test() {
        int[] input = {10, 5, 7, 9};
        int[] expected = {0, 10, 5, 5};
        assertTrue(Arrays.equals(expected, new ListMinReplacement().solve(input)));
    }

}