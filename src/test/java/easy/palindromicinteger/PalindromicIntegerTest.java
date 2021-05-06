package easy.palindromicinteger;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PalindromicIntegerTest {

    @Test
    void testTrue() {

        int input = 20200202;
        boolean expected = true;
        assertTrue(new PalindromicInteger().solve(input));
    }

    @Test
    void testFalse() {

        int input = 43;
        boolean expected = false;
        assertFalse(new PalindromicInteger().solve(input));
    }

    @Test
    void testTrue121() {

        int input = 121;
        boolean expected = true;
        assertTrue(new PalindromicInteger().solve(input));
    }

    @Test
    void testTrue4774() {

        int input = 4774;
        boolean expected = true;
        assertTrue(new PalindromicInteger().solve(input));
    }

    @Test
    void testFalse5151() {

        int input = 5151;
        boolean expected = false;
        assertFalse(new PalindromicInteger().solve(input));
    }

    @Test
    void testFalse6060() {

        int input = 6060;
        boolean expected = false;
        assertFalse(new PalindromicInteger().solve(input));
    }

    @Test
    void testTrue99099() {

        int input = 99099;
        boolean expected = true;
        assertTrue(new PalindromicInteger().solve(input));
    }

    @Test
    void testTrue800008() {

        int input = 800008;
        boolean expected = true;
        assertTrue(new PalindromicInteger().solve(input));
    }
}