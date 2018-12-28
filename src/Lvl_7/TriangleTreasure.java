package Lvl_7;

public class TriangleTreasure {
    public static int triangular(int n) {
        if(n<0)return 0;
        int sum = 0;
        for(int i = 0; i <= n; i++) sum += i;
        return sum;
    }
}
