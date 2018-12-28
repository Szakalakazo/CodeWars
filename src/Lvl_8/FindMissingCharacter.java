package Lvl_8;

public class FindMissingCharacter {
    public static void main(String[] args) {
        char[] inputArray = {'a', 'b', 'c', 'd', 'f'};
        findMissingLetter(inputArray);
    }

    public static char findMissingLetter(char[] array) {
        char missingChar = ' ';
        for (int i = 1; i < array.length; i++) {
            if (array[i] - array[i - 1] != 1) {
                missingChar = (char) (array[i] - 1);
            }
        }
        System.out.println("Missing character is: " + missingChar);
        return missingChar;
    }
}
