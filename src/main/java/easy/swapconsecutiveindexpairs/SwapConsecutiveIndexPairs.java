package easy.swapconsecutiveindexpairs;

public class SwapConsecutiveIndexPairs {

    public int[] solve(int[] nums) {

        if (nums.length < 3) {
            return nums;
        }

        if (nums.length < 4) {
            int temp = nums[2];
            nums[2] = nums[0];
            nums[0] = temp;
            return nums;
        }
        int index = 0;
        for (int i = 0; i < nums.length - 3; i += 4) {
            index += 4;
            int temp = nums[i + 2];
            nums[i + 2] = nums[i];
            nums[i] = temp;
            temp = nums[i + 3];
            nums[i + 3] = nums[i + 1];
            nums[i + 1] = temp;
        }

        if (nums.length - index > 2) {
            int temp = nums[index];
            nums[index] = nums[index + 2];
            nums[index + 2] = temp;
        }
        return nums;
    }
}
