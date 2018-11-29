package Lvl_7;

public class ASquareOfSquares {
    public static boolean isSquare(int n) {
        return (n > 0) ? (Math.sqrt(n) % 1 == 0) : false;

    }
}
