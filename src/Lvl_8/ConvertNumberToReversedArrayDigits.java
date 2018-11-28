package Lvl_8;

import java.util.Arrays;

public class ConvertNumberToReversedArrayDigits {
    public static int[] digitize(long number) {
        if(number<0) number = number * -1;


        String[] nums = new StringBuilder(String.valueOf(number)).reverse().toString().split("");
        int[] results = new int[nums.length];
        for (int i = 0; i < results.length; i++) {
            results[i] = Integer.parseInt(nums[i]);
        }
        return results;

/*        return new StringBuilder().append(number)
                    .reverse()
                    .chars()
                    .map(Character::getNumericValue)
                    .toArray();*/
    }
}
