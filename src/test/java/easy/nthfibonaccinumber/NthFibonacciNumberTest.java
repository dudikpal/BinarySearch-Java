package easy.nthfibonaccinumber;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NthFibonacciNumberTest {

    @Test
    void test() {
        int input = 7;
        int expected = 13;
        assertEquals(expected, new NthFibonacciNumber().solve(input));
    }

}