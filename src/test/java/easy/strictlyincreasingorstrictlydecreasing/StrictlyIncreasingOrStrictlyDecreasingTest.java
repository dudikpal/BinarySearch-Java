package easy.strictlyincreasingorstrictlydecreasing;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StrictlyIncreasingOrStrictlyDecreasingTest {

    @Test
    void True() {
        int[] input = {1, 2, 3, 4, 5};
        assertTrue(new StrictlyIncreasingOrStrictlyDecreasing().solve(input));
    }

    @Test
    void False() {
        int[] input = {1, 2, 3 , 3, 4, 5};
        assertFalse(new StrictlyIncreasingOrStrictlyDecreasing().solve(input));
    }

}