package Lvl_7;

import java.util.ArrayList;
import java.util.Arrays;

public class HightestAndLowestinString {
    public static String HighAndLow(String numbers) {

        String[] strs = numbers.split(" ");
        Integer[] ints = new Integer[strs.length];

        for (int i = 0; i < strs.length; i++) {
            ints[i] = Integer.parseInt(strs[i]);
        }
        Arrays.sort(ints);
        return ints[ints.length - 1].toString() + " " + ints[0].toString();
    }
}
