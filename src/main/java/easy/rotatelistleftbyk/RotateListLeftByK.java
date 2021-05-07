package easy.rotatelistleftbyk;

import java.util.Arrays;
import java.util.stream.IntStream;

public class RotateListLeftByK {

    public int[] solve(int[] nums, int k) {

        if (nums.length == 0) {
            return nums;
        }
        k = k % nums.length;
        int[] firstHalf = Arrays.copyOfRange(nums, 0, k);
        int[] secondHalf = Arrays.copyOfRange(nums, k, nums.length);
        int[] result = IntStream.concat(IntStream.of(secondHalf), IntStream.of(firstHalf)).toArray();
        return result;
    }
}
