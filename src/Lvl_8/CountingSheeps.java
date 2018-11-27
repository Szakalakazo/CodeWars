package Lvl_8;

public class CountingSheeps {
    static int countSheeps(Boolean[] arrayOfSheeps) {
        int counter = 0;
        for (Boolean i : arrayOfSheeps) if (i != null && i) counter++;
        return counter;
    }
}
