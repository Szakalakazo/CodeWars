import java.util.ArrayList;
import java.util.Arrays;

public class SortTheOdd {
    public static void main(String[] args) {
        int[] inputArray = {5, 3, 2, 8, 1, 4};
        sortArray(inputArray);
        int[] inputArray2 = {1, 3, 5, 8, 0};
        sortArray(inputArray2);
        int[] inputArray3 = {};
        sortArray(inputArray3);


    }

    public static int[] sortArray(int[] array) {

        int oddArrayCounter = 0;
        int[] oddArray = new int[array.length];

        for (int i = 0; i < array.length; i++) {
            if ((array[i] % 2 == 0) || (array[i] == 0))
                continue;
            else {
                oddArray[oddArrayCounter] = array[i];
                oddArrayCounter++;
            }
        }

        Arrays.sort(oddArray);
        int[] sortedOddArray = new int[oddArrayCounter];
        int index = 0;

        for (int i = 0; i < oddArray.length; i++) {
            if (oddArray[i] == 0) continue;
            else sortedOddArray[index] = oddArray[i];
            index++;
        }

        int counter = 0;
        for(int i = 0; i<array.length; i++) {
            if (array[i] % 2 != 0) {
                array[i]=sortedOddArray[counter];
                counter++;
            }
        }
        System.out.println(Arrays.toString(array));
        return oddArray;
    }
}
