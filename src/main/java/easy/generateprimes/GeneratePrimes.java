package easy.generateprimes;

import java.util.ArrayList;
import java.util.List;

public class GeneratePrimes {

    public int[] solve(int n) {

        if (n < 2) {
            return new int[0];
        }
        List<Integer> primes = new ArrayList<>();
        boolean haveDivider = false;
        for (int i = 2; i <= n; i++) {
            for (int j = 2; j <= i; j++) {
                if (!haveDivider && i == j) {
                    primes.add(i);
                    break;
                }
                if (i % j == 0) {
                    haveDivider = true;
                }
            }
            haveDivider = false;
        }
        System.out.println(primes);
        return primes.stream().mapToInt(Integer::intValue).toArray();
    }
}
