package Lvl_8;

import java.util.Arrays;

public class SortAndStar {
    public static String twoSort(String[] s) {
        Arrays.sort(s);
        return String.join("***",s[0].split(""));


        /*
        char[] charArray = s[0].toCharArray();
        String out = "";
        for (char c : charArray) out += c + "***";
        return out.substring(0,out.length()-3);
        */

    }
}