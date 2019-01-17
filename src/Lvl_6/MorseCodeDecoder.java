package Lvl_6;

import java.util.HashMap;

class MorseMap {

    private HashMap<String, String> hashMap = new HashMap<>();

    MorseMap() {
        hashMap.put(".-", "A");
        hashMap.put("-...", "B");
        hashMap.put("-.-.", "C");
        hashMap.put("-..", "D");
        hashMap.put(".", "E");
        hashMap.put("..-.", "F");
        hashMap.put("--.", "G");
        hashMap.put("....", "H");
        hashMap.put("..", "I");
        hashMap.put(".---", "J");
        hashMap.put("-.-", "K");
        hashMap.put(".-..", "L");
        hashMap.put("--", "M");
        hashMap.put("-.", "N");
        hashMap.put("---", "O");
        hashMap.put(".--.", "P");
        hashMap.put("--.-", "Q");
        hashMap.put(".-.", "R");
        hashMap.put("...", "S");
        hashMap.put("-", "T");
        hashMap.put("..-", "U");
        hashMap.put("...-", "V");
        hashMap.put(".--", "W");
        hashMap.put("-..-", "X");
        hashMap.put("-.--", "Y");
        hashMap.put("--..", "Z");
        hashMap.put("-----", "0");
        hashMap.put(".----", "1");
        hashMap.put("..---", "2");
        hashMap.put("...--", "3");
        hashMap.put("....-", "4");
        hashMap.put(".....", "5");
        hashMap.put("-....", "6");
        hashMap.put("--...", "7");
        hashMap.put("---..", "8");
        hashMap.put("----.", "9");
        hashMap.put(".-.-.-", ".");
        hashMap.put("--..--", ",");
        hashMap.put("..--..", "?");
        hashMap.put("", "");
    }

    String getValue(String key) {
        for (String s : hashMap.keySet()) {
            return hashMap.get(key);
        }
        return null;
    }
}

public class MorseCodeDecoder {
    public static String decode(String morseCode) {
        MorseMap mp = new MorseMap();

        String result = "";
        for (String word : morseCode.trim().split("   ")) {
            for (String letter : word.split("\\s+")) {
                result += mp.getValue(letter);
            }
            result += " ";
        }
        return result.trim();




        /*
        MorseMap mp = new MorseMap();
        String[] words = morseCode.split(" ");
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < words.length; i++) {
            sb.append(mp.getValue(words[i].toUpperCase()));
        }
        return sb.toString();
        */
    }
}
