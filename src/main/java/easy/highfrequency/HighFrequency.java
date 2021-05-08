package easy.highfrequency;

import java.util.*;

public class HighFrequency {

    public int solve(int[] nums) {

        if (nums.length == 0) {
            return 0;
        }
        Map<Integer, Integer> freqs = new HashMap<>();
        for (int number : nums) {
            freqs.merge(number, 1, (x, y) -> x + y);
        }

        return Collections.max(freqs.values());
    }
}
