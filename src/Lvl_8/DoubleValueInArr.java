package Lvl_8;

import java.util.Arrays;

public class DoubleValueInArr {
    public static int[] map(int[] arr) {

        return Arrays.stream(arr).map(x -> x*2).toArray();
        /*
        int[] out = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            out[i] = arr[i] * 2;
        }
        return out;
        */
    }
}
