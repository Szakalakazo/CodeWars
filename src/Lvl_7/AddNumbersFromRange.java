package Lvl_7;

public class AddNumbersFromRange {
    public static int GetSum(int a, int b) {
        int sum = 0;

        if(a < b)
            while(a <= b) { sum += a; a++; }
        else if(a > b)
            while(b <= a) { sum += b; b++; }
        else
            return a;

        return sum;



        //return (a + b) * (Math.abs(a - b) + 1) / 2;

/*
        int sum = 0;
        if (a == b) return a;
        if (a < b) {
            for (int i = a; i <= b; i++)
                sum = sum + i;
        } else {
            for (int i = b; i <= a; i++)
                sum = sum + i;
        }
        return sum;
*/


    }
}
