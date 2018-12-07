package Lvl_7;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class NthSeries {
    public static String seriesSum(int n) {

        double sum = 0;
        for (int i = 0; i < n; i++) {
            sum += 1.0 / (3 * i + 1);
        }
        return String.format("%.2f", sum);


//        BigDecimal sum = new BigDecimal(1);
//        BigDecimal fraction = new BigDecimal(0);
//
//        for (int i = 1; i < n; i++) {
//            fraction = BigDecimal.valueOf(1 / ((3 * (double)i) + 1));
//            sum = sum.add(fraction);
//        }
//        return sum.setScale(2, RoundingMode.HALF_UP).toString();
    }
}
