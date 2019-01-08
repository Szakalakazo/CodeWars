package Lvl_7;

public class StringEndsWith {
    public static boolean solution(String str, String ending) {

        return str.endsWith(ending);

        /*
        if (str == null || str.equals("")) return false;
        if (str.length() < ending.length()) return false;
        else return str.substring(str.length() - ending.length()).equals(ending);
        */

    }

}
