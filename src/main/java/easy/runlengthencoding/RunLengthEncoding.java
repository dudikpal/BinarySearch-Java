package easy.runlengthencoding;

public class RunLengthEncoding {

    public String solve(String s) {

        if (s.isBlank()) {
            return "";
        }
        int counter = 1;
        char prev = s.charAt(0);
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i < s.length(); i++) {
            if (prev != s.charAt(i)) {
                sb.append(counter).append(prev);
                counter = 1;
                prev = s.charAt(i);
            } else {
                counter++;
            }
        }
        sb.append(counter).append(prev);
        return sb.toString();
    }
}
