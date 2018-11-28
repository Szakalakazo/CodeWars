package Lvl_7;

public class VowelCounter {
    public static int getCount(String str) {

        //[^aeiou] - replace any character except what is in brakets
        return str.replaceAll("[^aeiou]","").length();



       /*
        int vowleCounter = 0;
        char[] charArray = str.toCharArray();
        char[] vowlesArray = {'a', 'e', 'i', 'o', 'u'};
        for (char character : charArray) {
            for (int i = 0; i < vowlesArray.length; i++) {
                if (character == vowlesArray[i]) vowleCounter++;
            }
        }
        return vowleCounter;*/
    }

}
