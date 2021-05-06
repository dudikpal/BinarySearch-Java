package easy.strictlyincreasingorstrictlydecreasing;

public class StrictlyIncreasingOrStrictlyDecreasing {

    public boolean solve(int[] nums) {

        if (nums.length == 0) {
            return false;
        }
        if (nums.length == 1) {
            return true;
        }
        boolean increasing;
        if (nums[0] < nums[1]) {
            increasing = true;
        } else {
            increasing = false;
        }
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == nums[i + 1]
                || (nums[i] < nums[i + 1] && !increasing)
                || (nums[i] > nums[i + 1] && increasing)) {
                return false;
            }
        }
        return true;
    }
}
