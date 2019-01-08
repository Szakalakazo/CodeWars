package Lvl_8;

public class WelcomeToCity {
    public static String sayHello(String[] name, String city, String state) {
        String nameSurname = String.join(" ", name);
        return String.format("Hello, %s! Welcome to %s, %s!", nameSurname,city,state);


    }
}
