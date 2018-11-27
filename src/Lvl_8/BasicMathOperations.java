package Lvl_8;

public class BasicMathOperations {
    public static Integer basicMath(String operator, int v1, int v2) {

        switch (operator) {
            case "+": return v1 + v2;
            case "-": return v1 - v2;
            case "*": return v1 * v2;
            case "/": if (v2 != 0) return v1 / v2;
        }
        return 0;
    }
}
