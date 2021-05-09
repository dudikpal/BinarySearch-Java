package easy.checkpoweroftwo;

public class CheckPowerOfTwo {

    public boolean solve(int n) {

        if (n == 0) {
            return false;
        }
        return Math.pow(2, (int)(Math.log(n)/Math.log(2)+1e-10)) == n;
    }
}
