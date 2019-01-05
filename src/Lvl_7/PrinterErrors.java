package Lvl_7;

public class PrinterErrors {
    public static String printerError(String s) {
        return s.replaceAll("[^n-z]", "").length() + "/" + s.length();
    }
}
