package Lvl_7;

import java.util.Arrays;

public class AnagramDetection {
    public static boolean isAnagram(String test, String original) {

        char[] testArr = test.toLowerCase().toCharArray();
        char[] originalArr = original.toLowerCase().toCharArray();

        Arrays.sort(testArr);
        Arrays.sort(originalArr);

        return Arrays.equals(testArr,originalArr);


    }
}
