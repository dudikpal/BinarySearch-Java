package easy.generateprimes;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class GeneratePrimesTest {

    @Test
    void test20() {
        int input = 20;
        int[] expected = {2, 3, 5, 7, 11, 13, 17, 19};

        assertTrue(Arrays.equals(expected, new GeneratePrimes().solve(input)));
    }

}