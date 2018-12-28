package Lvl_7;

import java.lang.reflect.Array;
import java.util.Arrays;

public class MostDigit {
    public static int findLongest(int[] numbers) {
        int index = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (String.valueOf(Math.abs(numbers[i])).length() > String.valueOf(Math.abs(numbers[index])).length()) {
                index = i;
            }
        }
        return numbers[index];


        /*
        String[] strArr = Arrays.toString(numbers).split(", ");
        int output = 0;
        int initLen = 0;

        for (String item : strArr) {
            int valLength = item.replaceAll("[^\\d]", "").length();
            if (initLen < valLength) {
                initLen = valLength;
                output = Integer.parseInt(item.replaceAll("[^\\d-]", ""));
            }
        }
        return output;*/
    }
}
