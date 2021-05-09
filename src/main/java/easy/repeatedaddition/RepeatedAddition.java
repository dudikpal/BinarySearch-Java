package easy.repeatedaddition;

public class RepeatedAddition {

    public int solve(int n) {

        while (n > 9) {
            int repeat = (int)Math.log10(n);
            int sum = 0;
            for (int i = 0; i <= repeat; i++) {
                sum += n % 10;
                n /= 10;
            }

            System.out.println(sum);
            n = sum;
        }
        return n;
    }
}
