package Lvl_6;

import java.util.Arrays;

public class YourOrder {
    public static String order(String words) {

        if(words.isEmpty()) return "";
        String[] out = words.split(" ");
        for (String word : words.split(" ")) {
            Integer num = Integer.parseInt(word.replaceAll("[^1-9]", ""));
            out[num - 1] = word;
        }
        return String.join(" ", out);
    }
}
