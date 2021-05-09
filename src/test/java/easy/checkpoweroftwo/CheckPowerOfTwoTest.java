package easy.checkpoweroftwo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CheckPowerOfTwoTest {

    @Test
    void testFalse() {
        int input = 0;
        assertFalse(new CheckPowerOfTwo().solve(input));
    }

    @Test
    void testTrue() {
        int input = 2;
        assertTrue(new CheckPowerOfTwo().solve(input));
    }

    @Test
    void testTrue32() {
        int input = 32;
        assertTrue(new CheckPowerOfTwo().solve(input));
    }

    @Test
    void testFalse511() {
        int input = 511;
        assertFalse(new CheckPowerOfTwo().solve(input));
    }

}