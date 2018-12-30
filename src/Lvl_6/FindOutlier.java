package Lvl_6;

public class FindOutlier {
    static int find(int[] integers) {
        int oddcount = 0, odd = 0, evencount = 0, even = 0;
        for (int i : integers) {
            if (i % 2 == 0) {
                even = i;
                evencount++;
            } else {
                odd = i;
                oddcount++;
            }
            if (evencount > 0 && oddcount > 0) {
                if (evencount > 1) {
                    return odd;
                } else if (oddcount > 1) {
                    return even;
                }
            }
        }
        return evencount > 1 ? odd : even;


       /*
        int odd = 0;
        int even = 0;
        int out = 0;
        for (int i = 0; i < integers.length - 1; i++) {
            if (integers[i] % 2 != 0 || integers[i] == 0) {
                odd++;
            }
            else even++;
        }
        if (odd > even) {
            for (int i : integers) if (i % 2 == 0 || i == 0) out = i;
        } else {
            for (int i : integers) if (i % 2 != 0) out = i;
        }
        return out;
        */
    }
}
