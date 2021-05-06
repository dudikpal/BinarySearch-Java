package easy.compressstring;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CompressString {

    public String solve(String s) {

        /*String[] compressed = s.split("(?<=(.))(?!\\1)");
        StringBuilder sb = new StringBuilder();
        for (String letter : compressed) {
            sb.append(letter.charAt(0));
        }*/
        StringBuilder sb = new StringBuilder();
        Pattern p = Pattern.compile("(.)\\1*");
        Matcher m = p.matcher(s);
        while (m.find()) {
            sb.append(m.group().charAt(0));
        }
        return sb.toString();
    }
}
