package easy.longestconsecutiveduplicatestring;

import java.util.*;

public class LongestConsecutiveDuplicateString {

    public int solve(String s) {

        if (s.length() == 0) {
            return 0;
        }
        if (s.length() == 1) {
            return 1;
        }
        List<Integer> repeats = new ArrayList<>();
        int counter = 1;
        for (int i = 0; i < s.length() - 1; i++) {
            if (s.charAt(i) == s.charAt(i + 1)) {
                counter++;
            } else {
                repeats.add(counter);
                counter = 1;
            }
            if (i == s.length() - 2) {
                repeats.add(counter);
            }
        }

        return repeats.stream().max(Comparator.naturalOrder()).get();
    }
}
