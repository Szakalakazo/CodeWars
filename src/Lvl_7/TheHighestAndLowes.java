package Lvl_7;

import java.util.Arrays;

public class TheHighestAndLowes {
    public static int[] minMax(int[] arr) {
        Arrays.sort(arr);
        return new int[] {arr[0], arr[arr.length-1]};



//        if (arr.length == 0) {
//            return arr;
//        } else {
//            int[] out = new int[2];
//            Arrays.sort(arr);
//            out[0] = arr[0];
//            out[1] = arr[(arr.length) - 1];
//            return out;
//        }
    }
}
