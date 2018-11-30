package Lvl_7;

public class RegexValidatePIN {
    public static boolean validatePin(String pin) {
        return pin.matches("\\d{4}|\\d{6}");

/*
        if (pin == null || (pin.length() != 4 && pin.length() != 6)) {
            return false;
        }

        for (int i = 0; i < pin.length(); i++) {
            if (!Character.isDigit(pin.charAt(i))) {
                return false;
            }
        }
        return true;
*/

    }
}
