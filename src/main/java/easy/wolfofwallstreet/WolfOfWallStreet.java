package easy.wolfofwallstreet;

import java.util.*;
import java.util.stream.Collectors;

public class WolfOfWallStreet {

    public int solve(int[] prices) {

        if (prices.length < 2) {
            return 0;
        }
        Set<Integer> profits = new HashSet<>(List.of(0));
        /* time limit exceed
        for (int i = 0; i < prices.length; i++) {
            for (int j = i + 1; j < prices.length; j++) {
                profits.add(prices[j] - prices[i]);
            }
        }*/
        List<Integer> priceList = Arrays.stream(prices).mapToObj(Integer::valueOf).collect(Collectors.toCollection(LinkedList::new));
        while (priceList.size() != 0) {
            int max = priceList.stream().max(Comparator.naturalOrder()).get();
            int maxIndex = priceList.lastIndexOf(max);
            int min = priceList.stream().min(Comparator.naturalOrder()).get();
            int minIndex = priceList.indexOf(min);
            if (maxIndex < minIndex) {
                profits.add(max - priceList.subList(0, maxIndex + 1).stream().min(Comparator.naturalOrder()).get());
                profits.add(priceList.subList(minIndex, priceList.size()).stream().max(Comparator.naturalOrder()).get() - min);
                priceList = priceList.subList(maxIndex + 1, minIndex);
            } else {
                profits.add(max - min);
                priceList.clear();
            }
        }
        return profits.stream().max(Comparator.naturalOrder()).get();
    }
}
