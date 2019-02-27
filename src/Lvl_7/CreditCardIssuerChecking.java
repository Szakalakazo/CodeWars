package Lvl_7;

public class CreditCardIssuerChecking {
    public static String getIssuer(String cardNumber) {

        if (cardNumber.matches("4+(\\d{15}|\\d{12})")) return "VISA";
        else if (cardNumber.matches("(34|37)+(\\d){13}")) return "AMEX";
        else if (cardNumber.matches("(6011)+(\\d){12}")) return "Discover";
        else if (cardNumber.matches("5[1-5]+(\\d){14,14}")) return "Mastercard";
        else return "Unknown";
    }
}
