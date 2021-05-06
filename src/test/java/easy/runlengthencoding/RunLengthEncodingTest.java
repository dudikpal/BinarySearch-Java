package easy.runlengthencoding;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RunLengthEncodingTest {

    @Test
    void solve() {
        String input = "aaaabbbccdaa";
        String expected = "4a3b2c1d2a";

        assertEquals(expected, new RunLengthEncoding().solve(input));
    }
}