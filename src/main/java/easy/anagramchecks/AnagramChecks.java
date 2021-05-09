package easy.anagramchecks;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;


public class AnagramChecks {

    public boolean solve(String s0, String s1) {

        /*List<Character> aList = s0.chars()
                .mapToObj(x -> (char)x)
                .collect(Collectors.toList());
        List<Character> bList = s1.chars()
                .mapToObj(x -> (char)x)
                .collect(Collectors.toList());
        Collections.sort(aList);
        Collections.sort(bList);

        return aList.equals(bList);*/
        Map<Character, Integer> s0Map = new HashMap<>();
        Map<Character, Integer> s1Map = new HashMap<>();
        for (char letter : s0.toCharArray()) {
            s0Map.merge(letter, 1 ,(x, y) -> x + y);
        }
        for (char letter : s1.toCharArray()) {
            s1Map.merge(letter, 1 ,(x, y) -> x + y);
        }
        return s0Map.equals(s1Map);

    }
}
