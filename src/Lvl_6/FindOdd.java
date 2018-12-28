package Lvl_6;

import java.sql.Array;
import java.util.*;

public class FindOdd {
    public static int findIt(int[] a) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        for(int i : a) arrayList.add(i);

        int output = 0;
        for(int i : arrayList) {
            if(Collections.frequency(arrayList, i) % 2 != 0) output = i;
        }
        return output;
    }
}
