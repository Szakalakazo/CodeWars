package Lvl_8;

public class InvertValues {
    public static int[] invert(int[] array) {
        int[] inverterArr = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            inverterArr[i] = -array[i];
        }
        return inverterArr;
    }
}
