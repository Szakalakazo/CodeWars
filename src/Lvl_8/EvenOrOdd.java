package Lvl_8;

public class EvenOrOdd {
    public static void main(String[] args) {
        String answer = checkTheNumber(12345);
        System.out.println(answer);
    }

    public static String checkTheNumber(int number) {
        return (number % 2 == 0) ? "Even" : "Odd";
    }
}
