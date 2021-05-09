package easy.pascalstriangle;

import java.util.Arrays;

public class PascalsTriangle {

    public int[] solve(int n) {

        int[] prev = {1};
        if (n == 0) {
            return prev;
        }
        prev = new int[]{1, 1};
        if (n == 1) {
            return prev;
        }
        for (int i = 2; i <= n; i++) {
            int[] actual = new int[i + 1];
            actual[0] = 1;
            actual[i] = 1;
            for (int j = 1; j < i; j++) {
                actual[j] = prev[j - 1] + prev[j];
            }
            prev = Arrays.copyOf(actual, actual.length);
        }
        return prev;
    }
}
