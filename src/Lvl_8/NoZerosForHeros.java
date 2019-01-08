package Lvl_8;

public class NoZerosForHeros {
    public static int noBoringZeros(int n) {
        if(n == 0) return 0;
        if (n % 10 != 0) return n;
        else return noBoringZeros(n / 10);




        /*
        if (n == 0) return n;
        int modulus = n % 10;
        while (modulus == 0) {
            n = n / 10;
            modulus = n % 10;
        }
        return n;
        */
    }
}
