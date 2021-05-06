package easy.palindromicinteger;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class PalindromicInteger {

    public boolean solve(int num) {

        /*if (num < 10) {
            return true;
        }
        int maxPow = 0;
        for (int i = 0; i < 32; i++) {
            if (num / Math.pow(10, i) < 1.0) {
                maxPow = i - 1;
                break;
            }
        }
        if (maxPow < 2) {
            return num % 10 == num / 10;
        }
        if (maxPow < 3) {
            return num % 10 == num / 100;
        }
        int firstHalf, secondHalf;
        boolean oddDigits;
        if (maxPow % 2 == 0) {
            oddDigits = false;
            firstHalf = (int)(num / Math.pow(10, maxPow / 2 + 1));
            secondHalf = (int)(num % Math.pow(10, maxPow / 2));
        } else {
            oddDigits = true;
            firstHalf = (int)(num / Math.pow(10, maxPow / 2 + 1));
            secondHalf = (int)(num % Math.pow(10, maxPow / 2 + 1));
        }
        boolean missingNull = false;
        if ((oddDigits && secondHalf / Math.pow(10, maxPow / 2) < 1)
            || (!oddDigits && secondHalf / Math.pow(10, (maxPow / 2) - 1) < 1)) {
            missingNull = true;
        }
        int reversedSecondHalf = 0;
        System.out.println(firstHalf);
        System.out.println(secondHalf);
        while (secondHalf != 0) {
            int digit = secondHalf % 10;
            reversedSecondHalf = reversedSecondHalf * 10 + digit;
            secondHalf /= 10;
        }
        if (missingNull) {
            reversedSecondHalf *= 10;
        }

        return firstHalf == reversedSecondHalf;*/
        /*if (num < 10) {
            return true;
        }
        int maxPow = 0;
        for (int i = 0; i < 32; i++) {
            if (num / Math.pow(10, i) < 1.0) {
                maxPow = i;
                break;
            }
        }
        int[] firstHalf = new int[maxPow / 2];
        int[] secondHalf = new int[maxPow / 2];
        maxPow = firstHalf.length + secondHalf.length;
        for (int i = 0; i < maxPow; i++) {
            if (i < maxPow / 2) {
                secondHalf[i - maxPow / 2] = (int)(num % Math.pow(10, maxPow - i - 1));
            } else {
                firstHalf[i] = (int)(num / Math.pow(10, i));
            }
        }
        Arrays.toString(firstHalf);
        Arrays.toString(secondHalf);
        return true;*/

        String[] digits = String.valueOf(num).split("");
        List<String> digitsList = Arrays.stream(digits).collect(Collectors.toList());
        List<String> firstHalf, secondHalf;
        if (digitsList.size() % 2 != 0) {
            firstHalf = digitsList.subList(0, digitsList.size() / 2);
            secondHalf = new ArrayList<>(digitsList.subList(digitsList.size() / 2 + 1, digitsList.size()));
        } else {
        firstHalf = digitsList.subList(0, digitsList.size() / 2);
        secondHalf = new ArrayList<>(digitsList.subList(digitsList.size() / 2, digitsList.size()));
        }
        Collections.reverse(secondHalf);
        System.out.println(firstHalf);
        System.out.println(secondHalf);
        return firstHalf.equals(secondHalf);
    }
}
