package easy.auniquestring;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class AUniqueString {

    public boolean solve(String s) {

        /*Set<Character> uniques = s.chars()
                .mapToObj(x -> (char)x)
                .collect(Collectors.toSet());*/

        Set<Character> uniques = new HashSet<>();
        for (char letter : s.toCharArray()) {
            uniques.add(letter);
        }
        return s.length() == uniques.size();
    }
}
