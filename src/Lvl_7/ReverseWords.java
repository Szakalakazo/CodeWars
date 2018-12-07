package Lvl_7;

public class ReverseWords {
    public static String reverseWords(String original) {
        String[] words = original.split(" ");
        if (words.length==0) return original;

        for (int i = 0; i < words.length; i++) {
            words[i] = new StringBuilder(words[i]).reverse().toString();
        }
        return String.join(" ",words);
    }
}
