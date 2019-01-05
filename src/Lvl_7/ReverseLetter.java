package Lvl_7;

public class ReverseLetter {
    public static String reverseLetter(String str) {

        StringBuilder sb = new StringBuilder(str.replaceAll("[^a-zA-Z]",""));
        return sb.reverse().toString();

    }
}
