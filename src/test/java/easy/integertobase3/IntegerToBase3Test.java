package easy.integertobase3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IntegerToBase3Test {

    @Test
    void test() {
        int input = 7;
        String expected = "21";
        assertEquals(expected, new IntegerToBase3().solve(input));
    }

    @Test
    void test2() {
        int input = 0;
        String expected = "0";
        assertEquals(expected, new IntegerToBase3().solve(input));
    }

}