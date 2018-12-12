package Lvl_7;

import java.util.Arrays;

public class SumInArrayOddOrEven {
    public static String oddOrEven(int[] array) {
        if (array.length == 0) return "0";
        int sum = 0;
        for (int i : array) sum += i;
        return (sum % 2 == 0) ? "Odd" : "Even";

    }
}

