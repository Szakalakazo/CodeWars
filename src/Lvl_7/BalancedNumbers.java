package Lvl_7;

public class BalancedNumbers {
    public static String balancedNum(long number) {

        String s = "" + number;
        int sum = 0, len = s.length(), mid1 = len / 2 - (len % 2 == 0 ? 1 : 0), mid2 = mid1 + (len % 2 == 0 ? 2 : 1);
        for (char c : s.substring(0, mid1).toCharArray()) sum += c - '0'; // left
        for (char c : s.substring(mid2).toCharArray()) sum -= c - '0'; // right
        return sum == 0 ? "Balanced" : "Not Balanced";


        /*
        String s = String.valueOf(number);
        String left = "";
        String right = "";
        String out = "";
        int middleChar = 0;

        if (s.length() == 1) out = "Balanced";
        else if (s.length() % 2 != 0) {
            middleChar = (s.length() / 2);
            char c = s.charAt(middleChar);
            left = s.substring(0, middleChar);
            right = s.substring(middleChar + 1);
        } else {
            middleChar = s.length() / 2;
            char c = s.charAt(middleChar);
            left = s.substring(0, middleChar - 1);
            right = s.substring(middleChar + 1);
        }

        int sumLeft = 0;
        int sumRight = 0;
        for (char c : left.toCharArray()) sumLeft += Character.getNumericValue(c);
        for (char c : right.toCharArray()) sumRight += Character.getNumericValue(c);

        out = sumLeft == sumRight ? "Balanced" : "Not Balanced";
        return out;
        */

    }
}
