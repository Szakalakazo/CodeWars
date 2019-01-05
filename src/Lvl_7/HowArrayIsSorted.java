/*
package Lvl_7;

import com.sun.deploy.util.ArrayUtil;
import sun.plugin.javascript.navig.Array;

import java.util.*;

public class HowArrayIsSorted {
    public static void isSortedAndHow(int[] array) {

        List<Integer> arrayList = new ArrayList<Integer>(Arrays.asList(array));
        List<Integer> ascending = new ArrayList<>();
        List<Integer> descending = new ArrayList<>();

//        for (int i : array) arrayList.add(i);
        for (int i : array) ascending.add(i);
//        System.out.println("ascending before sorting: " + ascending);

        for (int i : array) descending.add(i);
//        System.out.println("descending before sorting: " + descending);

        Collections.sort(ascending);
//        System.out.println("ascending after sorting: " + ascending);

        Collections.sort(descending);
        Collections.reverse(descending);
        System.out.println("descending after sorting: " + descending);

        System.out.println(arrayList.equals(ascending));





    }
}
*/
