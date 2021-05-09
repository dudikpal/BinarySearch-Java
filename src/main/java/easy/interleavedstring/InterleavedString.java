package easy.interleavedstring;

public class InterleavedString {

    public String solve(String s0, String s1) {

        int repeat = Math.min(s0.length(), s1.length());
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < repeat; i++) {
            sb.append(s0.charAt(i))
                    .append(s1.charAt(i));
        }
        if (s0.length() == repeat) {
            sb.append(s1.substring(repeat));
        } else {
            sb.append(s0.substring(repeat));
        }
        return sb.toString();
    }
}
