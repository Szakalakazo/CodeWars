package Lvl_7;

public class BumpsInRoad {
    public static String bumps(final String road) {
        return road.replaceAll("_","").length() > 15 ? "Car Dead": "Woohoo!";
    }
}
