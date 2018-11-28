package Lvl_8;

public class ReturnNegative {
    public static void main(String[] args) {
        System.out.println(makeNegative(-1));
    }

    public static int makeNegative(int x) {

        return (x > 0) ? -x : x;
    }
}
