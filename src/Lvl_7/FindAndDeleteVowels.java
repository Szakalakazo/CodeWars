package Lvl_7;

public class FindAndDeleteVowels {
    public static String disemvowel(String str) {

        return str.replaceAll("[aeiouAEIOU]","");
    }
}
