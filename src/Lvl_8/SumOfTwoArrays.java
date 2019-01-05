package Lvl_8;

public class SumOfTwoArrays {
    public static int arrayPlusArray(int[] arr1, int[] arr2) {
        int sumArr = 0;
        for (int num : arr1) sumArr += num;
        for (int num : arr2) sumArr += num;
        return sumArr;


    }
}
