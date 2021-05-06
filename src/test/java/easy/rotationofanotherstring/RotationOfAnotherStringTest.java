package easy.rotationofanotherstring;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RotationOfAnotherStringTest {

    @Test
    void testTrue1() {
        String input1 = "Cattywampus";
        String input2 = "sCattywampu";
        assertTrue(new RotationOfAnotherString().solve(input1, input2));
    }

    @Test
    void testFalse() {
        String input1 = "andokuba";
        String input2 = "kubaadno";
        assertFalse(new RotationOfAnotherString().solve(input1, input2));
    }

}