package Lvl_7;

import java.util.Arrays;

public class DescendingOrder {
    public static void sortDesc(int num) {

        int reverse = 0;

        while(num != 0){
            reverse = reverse * 10;
            reverse = reverse + num % 10;
            num = num/10;
        }
        System.out.println(reverse);
    }
}
