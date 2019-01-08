package Lvl_7;

import java.util.*;

public class DoubleSort {
    public static Object[] dbSort(Object[] a) {
        ArrayList<Integer> numbers = new ArrayList<>();
        ArrayList<String> str = new ArrayList<>();

        for (Object o : a) {
            if (o instanceof String) {
                str.add((String) o);
            } else {
                numbers.add((Integer) o);
            }
        }
        Collections.sort(numbers);
        Collections.sort(str);
        List<Object> objects = new LinkedList<>(numbers);
        objects.addAll(str);
        return objects.toArray();
    }
}
