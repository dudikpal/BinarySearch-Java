package easy.maxproductoftwonumbers;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class MaxProductOfTwoNumbers {

    public int solve(int[] nums) {

        if (nums.length == 0) {
            return 0;
        }
        if (nums.length == 1) {
            return nums[0];
        }
        List<Integer> numbers = Arrays.stream(nums)
                .mapToObj(Integer::valueOf)
                //.map(Math::abs)
                .collect(Collectors.toList());
        numbers.sort(Comparator.naturalOrder());
        int twoSmallest = numbers.get(0) * numbers.get(1);
        int twoLargest = numbers.get(numbers.size() - 2) * numbers.get(numbers.size() - 1);

        return Math.max(twoLargest, twoSmallest);
    }
}
