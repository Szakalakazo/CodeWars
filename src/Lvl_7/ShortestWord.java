package Lvl_7;

public class ShortestWord {
    public static int findShort(String s) {

        String[] strs = s.split(" ");
        String shortest = strs[0];

        for (int i = 0; i < strs.length; i++) {
            if (strs[i].length() < shortest.length())
                shortest = strs[i];
        }
        return shortest.length();
    }
}
