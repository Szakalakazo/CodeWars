package Lvl_7;

public class CompareStringsBySumOfChars {
    static boolean compare(String s1, String s2) {

        if(s1 == null || !s1.matches("[a-zA-Z]+")) s1 = "";
        if(s2 == null || !s2.matches("[a-zA-Z]+")) s2 = "";

        return s1.toUpperCase().chars().sum() == s2.toUpperCase().chars().sum();







    }
        /*String str1 = isEmpty(s1);
        String str2 = isEmpty(s2);
        return str1.equals(str2) || countChars(str1) == countChars(str2);
    }

    private static int countChars(String s) {
        int sum = 0;
        for (int i = 0; i < s.length(); i++) {
            sum += (int) s.toUpperCase().charAt(i);
        }
        return sum;
    }

    private static String isEmpty(String s) {
        if (s == null || s.isEmpty() || s.matches(".*[^a-zA-Z]+.*")) s = "";
        return s;
    }*/
}
