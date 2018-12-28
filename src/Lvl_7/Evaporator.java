package Lvl_7;

public class Evaporator {
    public static int evaporator(double content, double evap_per_day, double threshold) {
        int days = 0;
        double finalProcentage = (content * (threshold * 0.01));
        while (content > finalProcentage) {
            content = content - (content * (evap_per_day * 0.01));
            days++;
        }
        return days;
    }
}
