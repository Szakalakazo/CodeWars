package Lvl_7;

public class SquareEveryDigit {
    public static void main(String[] args) {
        System.out.println(squareDigits(123654789));

    }

    public static int squareDigits(int number) {
        String result = "";
        while(number != 0){
            int digit = number % 10;
            result = digit*digit+result;
            number = number / 10;
        }
        return Integer.parseInt(result);

    }
}
