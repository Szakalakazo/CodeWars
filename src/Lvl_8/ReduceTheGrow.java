package Lvl_8;

public class ReduceTheGrow {
    public static int grow(int[] x) {
        int sum = 1;
        for (int i : x) sum = sum * i;
        return sum;

    }

}
