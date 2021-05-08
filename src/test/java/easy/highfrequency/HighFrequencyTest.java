package easy.highfrequency;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HighFrequencyTest {

    @Test
    void test() {
        int[] input = {1, 4, 1, 7, 1, 7, 1, 1};

        int expected = 5;

        assertEquals(expected, new HighFrequency().solve(input));
    }

}