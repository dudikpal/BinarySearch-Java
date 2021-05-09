package easy.longestconsecutiveduplicatestring;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LongestConsecutiveDuplicateStringTest {

    @Test
    void test4() {
        String input = "abbbba";
        int expected = 4;
        assertEquals(expected, new LongestConsecutiveDuplicateString().solve(input));
    }

    @Test
    void test3() {
        String input = "aaabbb";
        int expected = 3;
        assertEquals(expected, new LongestConsecutiveDuplicateString().solve(input));
    }

    @Test
    void test1() {
        String input = "bcb";
        int expected = 1;
        assertEquals(expected, new LongestConsecutiveDuplicateString().solve(input));
    }

    @Test
    void test2() {
        String input = "aa";
        int expected = 2;
        assertEquals(expected, new LongestConsecutiveDuplicateString().solve(input));
    }

}