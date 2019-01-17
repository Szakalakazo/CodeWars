package Lvl_6;

public class ReverseWords {
    public static String spinWords(String sentence) {


        String[] words = sentence.split(" ");
        for (int i = 0; i < words.length; i++) {
            if(words[i].length() >= 5) {
                words[i] = new StringBuilder(words[i]).reverse().toString();
            }
        }
        return String.join(" ", words);

        /*
        String[] words = sentence.split(" ");
        String[] out = new String[words.length];

        for (int i = 0; i < words.length; i++) {
            if (words[i].length() >= 5) {
                StringBuilder sb = new StringBuilder(words[i]);
                sb.reverse();
                out[i] = sb.toString();
            } else {
                out[i] = words[i];
            }
        }
        return String.join(" ", out);
        */
    }
}
