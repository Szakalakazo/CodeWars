package Lvl_8;

public class CalculateAverage {
    public static double find_average(int[] array) {
        double sum = 0;
        for(int number : array) sum+=number;
        return sum/array.length;
    }
}
