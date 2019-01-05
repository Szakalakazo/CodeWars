package Lvl_7;

public class SumOfNumbersFrom0toN {
    public static String showSequence(int value) {
        int sum = 0;
        String result = "0";
        if (value == 0) return (value + "=0");
        if (value < 0) return (value + " <0");
        for (int i = 0; i <= value; i++) {
            sum += i;
            result += "+" + i;
        }
        return result;
    }

}
