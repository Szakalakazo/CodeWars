package Lvl_7;

public class CreditCardMask {
    public static String maskify(String str) {
        if(str.length()<4)  return str;
        else return str.substring(0,str.length()-4).replaceAll(".","x") + str.substring(str.length()-4);

    }
}
