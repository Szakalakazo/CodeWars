package Lvl_7;

import java.util.Arrays;

public class BrokenSequence {
    public static int findMissingNumber(String sequence) {
        if (sequence.length() == 0) return 0;
        String[] oriStr = sequence.split(" ");
        int[] oriNum = new int[oriStr.length];
        for (int i = 0; i < oriStr.length; i++) {
            if (!oriStr[i].matches("^-?\\d+$")) return 1;
            oriNum[i] = Integer.parseInt(oriStr[i]);
        }

        Arrays.sort(oriNum);
        for (int i = 1; i <= oriNum.length; i++) {
            if (oriNum[i - 1] != i) return i;
        }
        return 0;
    }
}
