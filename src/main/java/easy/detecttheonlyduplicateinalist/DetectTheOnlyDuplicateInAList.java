package easy.detecttheonlyduplicateinalist;

import java.util.Arrays;

public class DetectTheOnlyDuplicateInAList {

    public int solve(int[] nums) {

        Arrays.sort(nums);
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] - nums[i -1] == 0) {
                return nums[i];
            }
        }
        return 0;
    }
}
