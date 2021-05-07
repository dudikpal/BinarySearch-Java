package easy.undirectionalwordsearch;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UndirectionalWordSearchTest {

    @Test
    void testTrueHorizontal() {
        String[][] input = {
                {"h", "e", "l", "l", "o"},
                {"v", "j", "u", "h", "f"}
        };
        String target = "hello";
        assertTrue(new UndirectionalWordSearch().solve(input, target));
    }

    @Test
    void testTrueVertical() {
        String[][] input = {
                {"h", "y", "l", "l", "o"},
                {"h", "e", "l", "l", "o"},
                {"v", "j", "u", "h", "f"}
        };
        String target = "yej";
        assertTrue(new UndirectionalWordSearch().solve(input, target));
    }

}