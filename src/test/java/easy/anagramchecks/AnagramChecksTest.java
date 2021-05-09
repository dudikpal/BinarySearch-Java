package easy.anagramchecks;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AnagramChecksTest {

    @Test
    void testTrue() {
        String input1 = "listen";
        String input2 = "silent";
        assertTrue(new AnagramChecks().solve(input1, input2));
    }

    @Test
    void testFalse() {
        String input1 = "bedroom";
        String input2 = "bathroom";
        assertFalse(new AnagramChecks().solve(input1, input2));
    }

}