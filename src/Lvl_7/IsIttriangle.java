package Lvl_7;

public class IsIttriangle {
    public static boolean isTriangle(int a, int b, int c) {
        return a + b > c && a + c > b && c + b > a;
    }
}
