package easy.chackpalindrome;

import easy.palindromicinteger.PalindromicInteger;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CheckPalindromeTest {

    @Test
    void testTrue() {
        String input = "racecar";
        assertTrue(new CheckPalindrome().solve(input));
    }

    @Test
    void testFalse() {
        String input = "palinfrome";
        assertFalse(new CheckPalindrome().solve(input));
    }

    @Test
    void testTrue2() {
        String input = "stabbats";
        assertTrue(new CheckPalindrome().solve(input));
    }

}