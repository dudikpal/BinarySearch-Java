package easy.pascalstriangle;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class PascalsTriangleTest {

    @Test
    void test3() {
        int input = 3;
        int[] expected = {1, 3, 3, 1};
        assertTrue(Arrays.equals(expected, new PascalsTriangle().solve(input)));
    }

}