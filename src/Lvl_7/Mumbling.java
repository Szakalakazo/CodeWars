package Lvl_7;

import java.util.Arrays;

public class Mumbling {
    public static String accum(String s) {
        s = s.toLowerCase();
        StringBuilder builder = new StringBuilder();

        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            builder.append(Character.toUpperCase(ch));
            for(int j = 0; j < i; j++){
                builder.append(ch);
            }
            builder.append("-");
        }

        return builder.deleteCharAt(builder.lastIndexOf("-")).toString();


/*        String[] temp = s.split("");
        String[] output = new String[temp.length];

        for (int i = 0; i < temp.length; i++) {
            output[i] = temp[i].toUpperCase();
            for (int j = 0; j < i; j++) {
                output[i] = output[i] + temp[i].toLowerCase();
            }
            if(i<temp.length-1) {
                output[i] = output[i] +"-";
            }
        }
        StringBuilder builder = new StringBuilder();
        for(String x : output) {
            builder.append(x);
        }
        String str = builder.toString();
        return str;*/

    }
}
