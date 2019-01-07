package Lvl_8;

public class AbbreviateTwoWordName {
    public static String abbrevName(String name) {
        return name.toUpperCase().substring(0, 1) +
                "." +
                name.toUpperCase().substring((name.indexOf(" ") + 1),(name.indexOf(" ") + 2));
    }
}
