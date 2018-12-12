package Lvl_7;

import java.util.Arrays;
import java.util.Comparator;

public class MaxLengthDiff {
    public static int mxdiflg(String[] a1, String[] a2) {
        if (a1.length == 0 || a2.length == 0) return -1;
        Arrays.sort(a1, Comparator.comparing(String::length));
        Arrays.sort(a2, Comparator.comparing(String::length));

        return (a1[a1.length - 1].length() - a2[0].length() > a2[a2.length - 1].length() - a1[0].length())
                ? a1[a1.length - 1].length() - a2[0].length()
                : a2[a2.length - 1].length() - a1[0].length();
    }
}
