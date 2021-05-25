package easy.collatzsequence;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CollatzSequenceTest {

    @Test
    void test() {
        int input = 11;
        int expected = 15;
        assertEquals(expected, new CollatzSequence().solve(input));
    }

}