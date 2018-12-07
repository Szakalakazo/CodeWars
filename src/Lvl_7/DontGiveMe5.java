package Lvl_7;

import org.omg.CORBA.INTERNAL;

import java.util.Arrays;

public class DontGiveMe5 {
    public static int dontGiveMeFive(int start, int end) {
        StringBuilder sb = new StringBuilder();
        for (int i = start; i <= end; i++) {
            sb.append(i).append(",");
        }
        String str = sb.toString().replaceAll("\\d*5\\d*,*", "").replaceAll("[^,]","");
        return str.length();
    }
}


