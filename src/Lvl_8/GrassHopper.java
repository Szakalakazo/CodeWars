package Lvl_8;

public class GrassHopper {
    public static void main(String[] args) {
        int i = 5;
        summation(i);
        int sum = summation2(i);
        System.out.println(sum);
    }

    public static int summation(int n) {
        int sum=0;
        int i;
        for (i = 0; i <= n; i++) {
            sum += i;
        }
        return sum;
    }



    //much much better way
    public static int summation2(int n) {
        return n*(n+1)/2;
    }
}
