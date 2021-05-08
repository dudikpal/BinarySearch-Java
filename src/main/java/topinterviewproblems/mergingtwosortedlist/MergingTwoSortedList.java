package topinterviewproblems.mergingtwosortedlist;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class MergingTwoSortedList {

    public int[] solve(int[] a, int[] b) {

        List<Integer> arrays = new ArrayList<>();
        int bigger = Math.max(a.length, b.length);
        for (int i = 0; i < bigger; i++) {
            if (i < a.length) {
                arrays.add(a[i]);
            }
            if ( i < b.length) {
                arrays.add(b[i]);
            }
        }
        Collections.sort(arrays);
        return arrays.stream().mapToInt(Integer::intValue).toArray();
    }
}
