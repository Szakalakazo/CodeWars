package Lvl_7;

import org.omg.CORBA.INTERNAL;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class FormTheMinimum {
    public static int minValue(int[] values) {

        TreeSet<Integer> set = new TreeSet<>();
        for (int i : values) set.add(i);
        return new Integer(set.toString().replaceAll("[^\\d]", ""));

        /*
        StringBuilder sb = new StringBuilder();
        for (Integer value : set) sb.append(value);
        return Integer.parseInt(sb.toString());
        */
    }
}
