package Lvl_7;

public class ASquareOfSquares {
    public static long isSquare(long sq) {
        long root = (long) Math.sqrt(sq);
        return root * root == sq ? (root + 1) * (root +1) : -1;





        /*boolean isSquared = (Math.sqrt(sq) % 1 == 0);
        if (isSquared) {
            while (Math.sqrt(sq + 1) % 1 != 0)
                sq++;
        } else return -1;
        return sq + 1;*/
    }
}
