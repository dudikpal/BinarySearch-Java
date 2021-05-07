package easy.rotatelistleftbyk;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class RotateListLeftByKTest {

    @Test
    void testTrue() {
        int[] input = {1, 2, 3, 4, 5, 6};
        int rotator = 3;
        int[] expected = {4, 5, 6, 1, 2, 3};
        assertTrue(Arrays.equals(expected, new RotateListLeftByK().solve(input, rotator)));
    }

}