package Lvl_7;

import java.util.Arrays;

public class Isogram {
    public static boolean isIsogram(String str) {

        int len = str.length();
        char[] arr = str.toLowerCase().toCharArray();
        Arrays.sort(arr);

        for (int i = 0; i < len - 1; i++) {
            if (arr[i] == arr[i + 1])
                return false;
        }
        return true;
    }
}
