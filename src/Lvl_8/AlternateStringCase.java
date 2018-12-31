package Lvl_8;

public class AlternateStringCase {
    public static String toAlternativeString(String string) {

        String result = "";
        for (char c : string.toCharArray()) {
            if (Character.isUpperCase(c)) {
                result += Character.toLowerCase(c);
            } else {
                result += Character.toUpperCase(c);
            }
        }
        return result;




/*
        StringBuilder sb = new StringBuilder();
        char[] charArray = string.toCharArray();

        for (int i = 0; i < string.length(); i++) {
            char c = charArray[i];
            if (Character.isLetter(c)) {
                if (Character.isUpperCase(c)) {
                    sb.append(Character.toLowerCase(c));
                } else if (Character.isLowerCase(c)) {
                    sb.append(Character.toUpperCase(c));
                }
            } else sb.append(c);
        }
        return sb.toString();
*/

    }
}
