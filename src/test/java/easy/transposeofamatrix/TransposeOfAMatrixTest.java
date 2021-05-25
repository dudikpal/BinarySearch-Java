package easy.transposeofamatrix;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TransposeOfAMatrixTest {

    @Test
    void test() {
        int[][] input = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        int[][] expected = {
                {1, 4, 7},
                {2, 5, 8},
                {3, 6, 9}
        };
        assertArrayEquals(expected, new TransposeOfAMatrix().solve(input));
    }

}