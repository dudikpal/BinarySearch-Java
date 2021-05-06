package easy.largestnumberbytwotimes;

import java.util.Arrays;

public class LargestNumberByTwoTimes {

    public boolean solve(int[] nums) {

        Arrays.sort(nums);
        return nums[nums.length - 2] * 2 < nums[nums.length - 1];
    }
}
