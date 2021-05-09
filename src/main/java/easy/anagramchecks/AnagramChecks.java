package easy.anagramchecks;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;


public class AnagramChecks {

    public boolean solve(String s0, String s1) {

        List<Character> aList = s0.chars()
                .mapToObj(x -> (char)x)
                .collect(Collectors.toList());
        List<Character> bList = s1.chars()
                .mapToObj(x -> (char)x)
                .collect(Collectors.toList());
        Collections.sort(aList);
        Collections.sort(bList);

        return aList.equals(bList);
    }
}
