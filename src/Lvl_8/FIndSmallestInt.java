package Lvl_8;

import java.util.Arrays;

public class FIndSmallestInt {
    public static void main(String[] args) {
        int[] array = {1,2,6,5,7,8,-6,5};
        System.out.println(findSmallestInt(array));

    }
    public static int findSmallestInt(int[] args) {
        Arrays.sort(args);
        return args[0];
    }

}
