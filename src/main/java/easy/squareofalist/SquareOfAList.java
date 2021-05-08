package easy.squareofalist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SquareOfAList {

    public int[] solve(int[] nums) {

        List<Integer> squares = new ArrayList<>();
        for (int number : nums) {
            squares.add(number * number);
        }
        Collections.sort(squares);
        return squares.stream().mapToInt(Integer::intValue).toArray();
    }
}
