package topinterviewproblems.mergingtwosortedlist;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class MergingTwoSortedList {

    public int[] solve(int[] a, int[] b) {

       List<Integer> arrays = Arrays
               .stream(IntStream.concat(IntStream.of(a), IntStream.of(b)).toArray())
               .mapToObj(Integer::valueOf)
               .collect(Collectors.toList());
        Collections.sort(arrays);
        return arrays.stream().mapToInt(Integer::intValue).toArray();
    }
}
