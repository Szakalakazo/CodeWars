package Lvl_7;

public class InspiringStrings {
    public static String longestWord(String wordString) {

        String[] array = wordString.split(" ");
        int longest = 0;
        String out = "";
        for (String s : array) {
            if (s.length() >= longest) {
                longest = s.length();
                out = s;
            }
        }
        return out;
    }

}
