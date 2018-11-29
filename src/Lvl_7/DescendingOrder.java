package Lvl_7;

import java.util.Arrays;
import java.util.Collections;

public class DescendingOrder {
    public static int sortDesc(int num) {

        String text = "";
        Integer length = text.valueOf(num).length();
        Integer[] array = new Integer[length];

        for (int i = 0; i < length; i++) {
            array[i] = num % 10;
            num = num / 10;
        }
        Arrays.sort(array, Collections.reverseOrder());
        StringBuilder strNum = new StringBuilder();
        for (int numInArray : array) {
            strNum.append(numInArray);
        }
        return Integer.parseInt(strNum.toString());

    }
}