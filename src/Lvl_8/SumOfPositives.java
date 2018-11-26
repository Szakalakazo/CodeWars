package Lvl_8;

public class SumOfPositives {
    public static void main(String[] args) {
        int[] array = {1, -2, 3, 4, 5};
        System.out.println(sum(array));
    }

    public static int sum(int[] array) {

        int result = 0;
        for (int i : array) {
            if (array[i] > 0) {
                result = result + array[i];
                System.out.println(result);
            }
        }
        return result;
    }
}
