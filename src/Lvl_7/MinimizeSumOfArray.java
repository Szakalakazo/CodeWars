package Lvl_7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public class MinimizeSumOfArray {
    public static int minSum(int[] passed) {

        int result = 0;
        Arrays.sort(passed);
        for (int i = 0; i < passed.length / 2; i++) {
            result += passed[i] * passed[passed.length - 1 - i];
        }
        return result;


    }
}
