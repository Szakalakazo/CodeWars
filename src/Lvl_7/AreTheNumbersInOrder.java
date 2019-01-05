package Lvl_7;

import java.util.Arrays;

public class AreTheNumbersInOrder {
    public static boolean isAscOrder(int[] arr) {
        int[] arr2 = arr.clone();
        Arrays.sort(arr2);
        return Arrays.equals(arr2, arr);
    }
}
