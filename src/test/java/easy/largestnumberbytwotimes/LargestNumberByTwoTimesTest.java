package easy.largestnumberbytwotimes;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LargestNumberByTwoTimesTest {

    @Test
    void True() {
        int[] input = {3, 6, 15};
        assertTrue(new LargestNumberByTwoTimes().solve(input));
    }

    @Test
    void False() {
        int[] input = {3, 6, 12};
        assertFalse(new LargestNumberByTwoTimes().solve(input));
    }

}