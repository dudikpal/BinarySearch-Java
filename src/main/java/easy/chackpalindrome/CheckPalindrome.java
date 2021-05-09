package easy.chackpalindrome;

import java.util.Collections;

public class CheckPalindrome {

    public boolean solve(String s) {

        if (s == null || s.length() <2) {
            return true;
        }
        return s.substring(0, s.length() / 2)
                .equals(new StringBuilder(s.substring((s.length() % 2) + s.length() / 2)).reverse().toString());
    }
}
