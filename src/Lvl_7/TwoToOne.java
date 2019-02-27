package Lvl_7;

import java.util.Arrays;
import java.util.Collections;
import java.util.TreeSet;

public class TwoToOne {

    public static String longest() {
        String one = "xyaabbbccccdefww";
        String two = "xxxxyyyyabklmopq";

        String added= one + two;

        TreeSet<String> treeSet = new TreeSet<String>();
        Collections.addAll(treeSet, added.split(""));

        return String.join("", treeSet);

    }

}
