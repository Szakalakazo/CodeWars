package Lvl_8;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ReverseSentence {
    public static String reverseWords(String str) {
        List Words = Arrays.asList(str.split(" "));
        Collections.reverse(Words);
        return String.join(" ", Words);


        /*
        String[] sentence = str.split(" ");
        StringBuilder sb = new StringBuilder();
        for (int i = sentence.length - 1; i >= 0 ; i--) {
            sb.append(sentence[i]).append(" ");
        }
        return sb.toString().trim();
        */
    }
}
