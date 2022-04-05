import java.util.Scanner;

public class Calculate {
    public static int calc(int a, int b, char operation) {
        int res = 0;
        if (operation == '+') {
            res = a + b;
            return res;
        }
        if (operation == '-') {
            res = a - b;
            return res;
        }
        if (operation == '*') {
            res = a * b;
            return res;
        }
        if (operation == '/') {
            res = a / b;
            return res;
        } else {
            System.err.println("Не допустимое арифметическое выражение");
        }
        return res;
    }
}