package Lvl_8;

public class SumOfPositives {
    public static void main(String[] args) {
        int[] array = {1,-2,3,4,5};
        System.out.println(sum(array));

    }

    public static int sum(int[] array) {

        int result = 0;
        for(int i : array) {
            if(i > 0) {
                result += i;
            }
        }
        return result;


       /* int sum = 0;
        for (int i = 0; i < array.length; i++) {
            if(array[i] > 0) {
                sum = sum + array[i];
            }
        }
        return sum;*/
    }
}
