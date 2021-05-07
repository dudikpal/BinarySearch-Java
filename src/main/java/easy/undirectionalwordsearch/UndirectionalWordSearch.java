package easy.undirectionalwordsearch;

import java.util.Arrays;

public class UndirectionalWordSearch {

    public boolean solve(String[][] board, String word) {


        if (board.length == 0) {
            return false;
        }
        // horizontal search
        for (int i = 0; i < board.length; i++) {
            String actual = String.join("", board[i]);
            if (actual.contains(word)) {
                return true;
            }
        }
        // vertical search
        for (int i = 0; i < board[0].length; i++) {
            StringBuilder sb = new StringBuilder();
            for (int j = 0; j < board.length; j++) {
                sb.append(board[j][i]);
            }
            if (sb.toString().contains(word)) {
                return true;
            }
        }
        return false;
    }
}
