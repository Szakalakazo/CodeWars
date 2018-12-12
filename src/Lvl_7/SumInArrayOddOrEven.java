package Lvl_7;

public class SumInArrayOddOrEven {
    public static String oddOrEven(int[] array) {
        if (array.length == 0) return "0";
        int sum = 0;
        for (int i : array) sum = sum + i;
        if (sum % 2 != 0) {
            return "Odd";
        } else return "Even";
    }
}

