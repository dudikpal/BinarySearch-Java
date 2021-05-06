package easy.auniquestring;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AUniqueStringTest {

    @Test
    void testTrue() {
        String input = "abcdefghijkl";
        assertTrue(new AUniqueString().solve(input));
    }

    @Test
    void testFalse() {
        String input = "abcdefgghujkl";
        assertFalse(new AUniqueString().solve(input));
    }

}