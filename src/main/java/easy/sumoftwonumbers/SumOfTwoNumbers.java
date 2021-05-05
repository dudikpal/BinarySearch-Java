package easy.sumoftwonumbers;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SumOfTwoNumbers {

    public boolean solve(int[] nums, int k) {

        if (nums.length < 2 ) {
            return false;
        }
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.merge(nums[i], 1, (x, y) -> x + y);
        }
        List<Integer> distinctList = new ArrayList<>();
        for (Map.Entry<Integer, Integer> entry: map.entrySet()) {
            distinctList.add(entry.getKey());
            if (entry.getValue() > 1) {
                distinctList.add(entry.getKey());
            }
        }

        for (int i = 0; i < distinctList.size(); i++) {
            for (int j = 0; j < distinctList.size(); j++) {
                if (i != j) {
                    if (distinctList.get(i) + distinctList.get(j) == k) {
                        return true;
                    }
                }
            }
        }
        return  false;

    }
}
