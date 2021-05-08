package easy.wolfofwallstreet;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WolfOfWallStreetTest {

    @Test
    void test5() {
        int[] input = {9, 11, 8, 5, 7, 10};
        int expected = 5;
        assertEquals(expected, new WolfOfWallStreet().solve(input));
    }

    @Test
    void test0() {
        int[] input = {9, 8, 7, 6, 5, 4, 3, 2, 1};
        int expected = 0;
        assertEquals(expected, new WolfOfWallStreet().solve(input));
    }

    @Test
    void test1() {
        int[] input = {2, 1, 2};
        int expected = 1;
        assertEquals(expected, new WolfOfWallStreet().solve(input));
    }

    @Test
    void test100() {
        int[] input = {1, 0, 0};
        int expected = 0;
        assertEquals(expected, new WolfOfWallStreet().solve(input));
    }


    @Test
    void test201() {
        int[] input = {2, 0, 1};
        int expected = 1;
        assertEquals(expected, new WolfOfWallStreet().solve(input));
    }

    @Test
    void test3120() {
        int[] input = {3, 1, 2, 0};
        int expected = 1;
        assertEquals(expected, new WolfOfWallStreet().solve(input));
    }
}