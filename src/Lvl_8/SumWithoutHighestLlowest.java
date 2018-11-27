package Lvl_8;

import java.util.Arrays;

public class SumWithoutHighestLlowest {
    public static int sum(int[] numbers) {

        if (numbers == null || numbers.length == 0 || numbers.length == 1) return 0;
        int sum = 0;
        Arrays.sort(numbers);
        for (int i = 1; i < numbers.length - 1; i++)
            sum = sum + numbers[i];
        return sum;
    }
}
