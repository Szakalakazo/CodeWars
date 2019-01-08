package Lvl_8;

public class FindFirstNonConsecutiveNumber {
    static Integer find(final int[] array) {
        int output = 0;
        for (int i = 1; i < array.length - 1; i++) {
            if (array[i] == array[i - 1]+1) output = array[i - 1];
        }
        if (output == 0) return null;
        else return output;


    }
}
