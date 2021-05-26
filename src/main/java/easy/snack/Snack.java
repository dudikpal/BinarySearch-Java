package easy.snack;

import java.util.Scanner;

public class Snack {

    public String solution(String input) {

        Scanner sc = new Scanner(input);
        double[] prices = {4.00, 4.50, 5.00, 2.00, 1.50};
        int productId = sc.nextInt();
        int pcs = sc.nextInt();
        return (String.format("Total: R$ %.2f", pcs * prices[productId - 1]));
    }
}
