package Lvl_8;

public class MeanOfArray {
    public static int getAverage(int[] marks) {
        double sum = 0;
        for (int number : marks) sum += number;
        return (int) (sum / marks.length);
    }
}
