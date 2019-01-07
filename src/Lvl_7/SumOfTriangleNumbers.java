package Lvl_7;

public class SumOfTriangleNumbers {
    public static int sumTriangularNumbers(int n) {


        return n < 0 ? 0 : n * (n + 1) * (n + 2) / 6;

    }
}
