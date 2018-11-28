package Lvl_7;

public class GetMiddleChar {
    public static String getMiddle(String word) {

        int length = word.length();
        return (length % 2 == 0) ? word.substring(length/2-1, length/2+1) : String.valueOf(word.charAt(length/2));

        /*
        StringBuilder text = new StringBuilder(word);
        String out = "";

        if(text.length() % 2 == 0) out = text.substring(   (text.length()/2-1),     (text.length()/2+1));
        if(text.length() % 2 != 0) out = text.substring(   (text.length()/2),     (text.length()/2+1));
        return out;*/
    }

}
