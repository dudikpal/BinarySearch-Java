package easy.compressstring;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CompressStringTest {

    @Test
    void test1() {
        String input = "aaaaaabbbcccccdeeaaafffaa";
        String expected = "abcdeafa";
        assertEquals(expected, new CompressString().solve(input));
    }

}