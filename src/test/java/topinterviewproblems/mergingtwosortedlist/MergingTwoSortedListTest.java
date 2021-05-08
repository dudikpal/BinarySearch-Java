package topinterviewproblems.mergingtwosortedlist;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class MergingTwoSortedListTest {

    @Test
    void test() {
        int[] a = {5, 10, 15};
        int[] b = {3, 8, 9};
        int[] expected = {3, 5, 8, 9, 10, 15};

        assertTrue(Arrays.equals(expected, new MergingTwoSortedList().solve(a, b)));
    }

}