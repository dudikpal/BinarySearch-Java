package easy.nthfibonaccinumber;

public class NthFibonacciNumber {

    public int solve(int n) {

        if (n < 3) {
            return 1;
        }
        int beforePrev = 1;
        int prev = 1;
        int fibonacci = 0;
        for (int i = 3; i <= n; i++) {
            fibonacci = beforePrev + prev;
            beforePrev = prev;
            prev = fibonacci;
        }
        return fibonacci;
    }
}
