package easy.collatzsequence;

public class CollatzSequence {

    public int solve(int n) {

        int counter = 0;
        while (n != 1) {
            if (n % 2 == 0) {
                n /= 2;
            } else {
                n = n * 3 + 1;
            }
            counter++;
        }
        return counter + 1;
    }
}
