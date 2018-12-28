package Lvl_6;

public class Multiples_of_3_or_5 {
    public static int solution(int number) {
        int sum = 0;
        for (int i = 0; i < number; i++) {
            if(i % 3 == 0 || i % 5 == 0){
                sum = sum + i;
            }
        }
        return sum;
    }
}
