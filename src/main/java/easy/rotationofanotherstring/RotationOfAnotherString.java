package easy.rotationofanotherstring;

import org.w3c.dom.Node;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.stream.Collectors;

public class RotationOfAnotherString {

    public boolean solve(String s0, String s1) {

        if (s0.length() != s1.length()) {
            return false;
        }
        if (s0.length() < 3 || s0.equals(s1)) {
            return true;
        }
        Map<Character, Integer> originalString = new HashMap<>();
        Map<Character, Integer> rotatedString = new HashMap<>();
        for (int i = 0; i < s0.length(); i++) {
            originalString.merge(s0.charAt(i), 1, (prev, actual) -> prev + actual);
            rotatedString.merge(s1.charAt(i), 1, (prev, actual) -> prev + actual);
        }
        if (!originalString.equals(rotatedString)) {
            return false;
        }

        LinkedList<Character> original = s0.chars()
                .mapToObj(x -> (char)x)
                .collect(Collectors.toCollection(LinkedList::new));
        LinkedList<Character> rotated = s1.chars()
                .mapToObj(x -> (char)x)
                .collect(Collectors.toCollection(LinkedList::new));

        for (int i = 0; i < original.size(); i++) {
            if (original.equals(rotated)) {
                return true;
            }
            Character letter = rotated.removeLast();
            rotated.addFirst(letter);
        }
        return false;
    }
}
