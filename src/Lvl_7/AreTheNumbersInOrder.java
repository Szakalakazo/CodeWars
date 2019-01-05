package Lvl_7;

import java.util.Arrays;

public class AreTheNumbersInOrder {
    public static boolean isAscOrder(int[] arr) {
        int[] arr2 = arr.clone();
        System.out.println("\nFirst array: ");
        for(int n : arr) System.out.println(n);


        Arrays.sort(arr2);
        System.out.println("\nSorted array: ");
        for(int n : arr2) System.out.println(n);
        return Arrays.equals(arr2, arr);
    }
}
