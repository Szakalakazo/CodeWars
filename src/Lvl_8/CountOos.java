package Lvl_8;

public class CountOos {
    public static int strCount(String str, char letter) {
        String c = Character.toString(letter);
        return str.length() - str.replace(String.valueOf(letter), "").length();



        /*
        int count = 0;
        char[] charArray = str.toCharArray();
        for (char c : charArray){
            if(c == letter) count ++;
        }
        return count;
        */

    }
}
