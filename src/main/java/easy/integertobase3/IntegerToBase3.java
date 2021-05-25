package easy.integertobase3;

public class IntegerToBase3 {

    public String solve(int n) {

        if (n < 3) {
            return String.valueOf(n);
        }
        StringBuilder sb = new StringBuilder();
        while (n != 0) {
            sb.append(n % 3);
            n /= 3;
        }
        return sb.reverse().toString();
    }
}
