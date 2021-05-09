package easy.listminreplacement;

public class ListMinReplacement {

    public int[] solve(int[] nums) {

        if (nums.length == 1) {
            return new int[]{0};
        }
        int[] result = new int[nums.length];
        int min = nums[0];
        result[0] = 0;
        result[1] = nums[0];
        if (nums.length == 2) {
            return result;
        }
        for (int i = 2; i < nums.length; i++) {
            if (nums[i - 1] < min) {
                min = nums[i - 1];
            }
            result[i] = min;
        }
        return result;
    }
}
