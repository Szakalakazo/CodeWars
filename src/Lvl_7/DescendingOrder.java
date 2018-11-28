package Lvl_7;

import java.util.Arrays;

public class DescendingOrder {
    public static int sortDesc(final int num) {

        String intString = "";
        intString.valueOf(num);
        String[] strArray = intString.split("");
        int[] intArray = new int[strArray.length];

        for(int i = 0; i < intArray.length-1; i++){
            intArray[i] = Integer.parseInt(strArray[i]);
        }
        Arrays.sort(intArray);
        return intArray.toString()



    }
}
