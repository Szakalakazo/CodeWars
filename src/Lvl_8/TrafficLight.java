package Lvl_8;

public class TrafficLight {
    public static String updateLight(String current) {
        if (current.toLowerCase() == "green") return "yellow";
        else if (current.toLowerCase() == "yellow") return "red";
        return "green";
    }
}
