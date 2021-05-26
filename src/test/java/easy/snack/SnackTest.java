package easy.snack;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SnackTest {

    @Test
    void test() {
        String input = "2 3";
        String expected = "Total: R$ 13,50";
        assertEquals(expected, new Snack().solution(input));
    }

}