package Lvl_8;

public class HowGoodAreYouReally {
    public static boolean betterThanAverage(int[] classPoints, int yourPoints) {
        int average = 0;
        for (int point : classPoints) average += point;
        return average / classPoints.length < yourPoints;

    }
}
