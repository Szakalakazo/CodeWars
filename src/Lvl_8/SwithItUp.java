package Lvl_8;

import java.util.HashMap;
import java.util.Map;

public class SwithItUp {
    public static String switchItUp(int number) {
        switch (number)
        {
            case 0: return "Zero";
            case 1: return "One";
            case 2: return "Two";
            case 3: return "Three";
            case 4: return "Four";
            case 5: return "Five";
            case 6: return "Six";
            case 7: return "Seven";
            case 8: return "Eight";
        }
        return "Nine";

        /*
        Map<Integer, String> map = new HashMap<>();
        map.put(1,"One");
        map.put(2,"Two");
        map.put(3,"Three");
        map.put(4,"Four");
        map.put(5,"Five");
        map.put(6,"Six");
        map.put(7,"Seven");
        map.put(8,"Eight");
        map.put(9,"Nine");
        map.put(0,"Zero");

        return map.get(number).toString();
        */
    }
}
