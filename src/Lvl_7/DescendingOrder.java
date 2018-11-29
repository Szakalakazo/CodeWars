package Lvl_7;

import java.util.Arrays;
import java.util.Collections;

public class DescendingOrder {
    public static int sortDesc(int num) {

        //=========The coolest solution
        /*String[] array = String.valueOf(num).split("");
        Arrays.sort(array, Collections.reverseOrder());
        return Integer.valueOf(String.join("",array));*/


        //=========Another cool solution
        String[] numbers = (Integer.toString(Integer.valueOf(num))).split("");
        Arrays.sort(numbers);
        String result = "";
        for(String s : numbers) {
            result = s + result;
        }
        return Integer.parseInt(result);

        //=========My terible solution (but at least it works...)
/*        String text = "";
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
        return Integer.parseInt(strNum.toString());*/

    }
}