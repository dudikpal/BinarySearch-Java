package easy.consecutiveduplicates;

public class ConsecutiveDuplicates {

    public String solve(String s) {

        if (s.length() < 2) {
            return s;
        }
        StringBuilder sb = new StringBuilder(s.substring(0, 1));
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != sb.charAt(sb.length() - 1)) {
                sb.append(s.charAt(i));
            }
        }
        return sb.toString();
    }
}
