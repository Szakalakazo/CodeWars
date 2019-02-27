package Lvl_6;


import java.util.*;

class CountTheDuplicate {
    static int duplicateCount(String text) {

        List<String> list = new ArrayList<>(Arrays.asList(text.toLowerCase().split("")));
        Set<String> set  = new TreeSet<>(list);
        int duplicatedValuesCounter = 0;

        for (String s : set) {
            int occurrence = Collections.frequency(list, s);
            if (occurrence > 1) duplicatedValuesCounter++;
        }
        return duplicatedValuesCounter;
    }
}
