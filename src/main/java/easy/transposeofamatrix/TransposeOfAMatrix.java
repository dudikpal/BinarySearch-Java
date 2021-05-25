package easy.transposeofamatrix;

public class TransposeOfAMatrix {

    public int[][] solve(int[][] matrix) {

        int[][] transpose = new int[matrix.length][matrix.length];
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix.length; col++) {
                transpose[row][col] = matrix[col][row];
            }
        }
        return transpose;
    }
}
