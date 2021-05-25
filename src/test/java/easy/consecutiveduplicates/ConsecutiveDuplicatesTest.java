package easy.consecutiveduplicates;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConsecutiveDuplicatesTest {

    @Test
    void test() {
        String input = "YYYXYXX";
        String expected = "YXYX";
        assertEquals(expected, new ConsecutiveDuplicates().solve(input));
    }

}