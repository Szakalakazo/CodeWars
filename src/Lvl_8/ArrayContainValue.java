package Lvl_8;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayContainValue {
    public static boolean check(Object[] a, Object x) {
        return Arrays.asList(a).contains(x);


        /*
        boolean answer = false;
        for (Object o : a) if (o.equals(x)) answer = true;
        return answer;
        */
    }
}
