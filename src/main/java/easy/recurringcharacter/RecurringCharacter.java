package easy.recurringcharacter;

import java.util.ArrayList;
import java.util.List;

public class RecurringCharacter {

    public int solve(String s) {

        if (s == null || s.isBlank()) {
            return -1;
        }
        List<Character> list = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            if (list.contains(s.charAt(i))) {
                return i;
            }
            list.add(s.charAt(i));
        }
        return -1;
    }
}
