package easy.threesixnine;

import java.util.stream.IntStream;

public class ThreeSixNine {

    public String[] solve(int n) {

        if (n == 0) {
            return new String[0];
        }
        StringBuilder sb = new StringBuilder();
        String separator = "";
        for (int i = 1; i <= n; i++) {
            String numberString = String.valueOf(i);
            sb.append(separator);
            if (i % 3 == 0 || numberString.matches(".*[369].*")) {
                sb.append("clap");
            } else {
                sb.append(i);
            }
            separator = ",";
        }
        System.out.println(sb.toString());
        String[] result = sb.toString().split(",");
        return result;
    }
}
