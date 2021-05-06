package easy.threesixnine;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class ThreeSixNineTest {

    @Test
    void solve() {
        int input = 16;
        String[] expected = {"1", "2", "clap", "4", "5", "clap", "7", "8", "clap", "10", "11", "clap", "clap", "14", "clap", "clap"};
        assertTrue(Arrays.toString(new ThreeSixNine().solve(input)).equals(Arrays.toString(expected)));
    }
}