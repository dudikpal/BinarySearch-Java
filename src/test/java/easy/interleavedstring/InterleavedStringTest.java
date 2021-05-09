package easy.interleavedstring;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class InterleavedStringTest {

    @Test
    void test() {
        String input1 = "abc";
        String input2 = "xyz";

        String expected = "axbycz";

        assertEquals(expected, new InterleavedString().solve(input1, input2));
    }

    @Test
    void test2() {
        String input1 = "abc";
        String input2 = "x";

        String expected = "axbc";

        assertEquals(expected, new InterleavedString().solve(input1, input2));
    }

}