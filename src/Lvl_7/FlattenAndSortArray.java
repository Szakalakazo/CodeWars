package Lvl_7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FlattenAndSortArray {
    public static int[] flattenAndSort(int[][] array) {

        List<Integer> list = new ArrayList<>();

        for (int[] ints : array) {
            for (int anInt : ints) {
                list.add(anInt);
            }
        }

        int[] results = new int[list.size()];
        for (int i = 0; i < results.length; i++) {
            results[i] = list.get(i);
        }
        Arrays.sort(results);
        return results;
    }
}
