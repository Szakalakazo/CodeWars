package Lvl_8;

public class CounttheMonkeys {
    public static void monkeyCount(final int n) {
        int[] array = new int[n];
        for (int i = 1; i <= n; i++) {
            array[i-1] = i;
        }
        for (int i : array) System.out.println(i);
    }
}
