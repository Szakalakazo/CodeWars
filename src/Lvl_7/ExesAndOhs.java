package Lvl_7;

public class ExesAndOhs {
    public static boolean getXO(String str) {
        int xCounter = 0, oCounter = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.toLowerCase().charAt(i) == 'x') xCounter++;
            if (str.toLowerCase().charAt(i) == 'o') oCounter++;
        }
        return xCounter == oCounter;
    }

}
