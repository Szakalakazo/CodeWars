package Lvl_8;

public class StringRepeat {
    public static void main(String[] args) {
        System.out.println(repeatString(-2, "ala "));

    }

    public static String repeatString(final int repeat, final String string) {
        StringBuilder output = new StringBuilder();
        if (repeat <= 0) {
        } else {
            for (int i = 0; i < repeat; i++) {
                output.append(string);
            }
        }
        return output.toString();
    }

}
