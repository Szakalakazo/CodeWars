package Lvl_8;

public class StringyStrings {
    public static String stringy(int size) {
        StringBuilder output = new StringBuilder();
        for (int i = 0; i < size; i++) {
            if (i % 2 != 0) output.append(0);
            else output.append(1);
        }
        return output.toString();
    }
}
