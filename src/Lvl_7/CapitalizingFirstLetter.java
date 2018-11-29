package Lvl_7;

public class CapitalizingFirstLetter {
    public static String toJadenCase(String phrase) {

        StringBuilder result = new StringBuilder();

        if (phrase == null || phrase.isEmpty()) return null;

        String[] words = phrase.split(" ");
        for (int i = 0; i < words.length; i++) {
            result.append((words[i]).substring(0, 1)
                    .toUpperCase() + words[i]
                    .substring(1))
                    .append(" ");
        }
        return result.toString().substring(0, result.length() - 1);
    }
}
