package Lvl_7;

public class Factorial {
    public static int factorial(int n) {
        if (n < 0 || n > 12) throw new IllegalArgumentException();
        return n <= 1 ? 1 : n * factorial(n - 1);
    }
}
