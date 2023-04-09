package Inhertance;

public class Rechenarten {
    static int addition(int num1, int numb2) {
        return getAddition(num1, numb2);
    }

    static int subtraction(int num1, int num2) {
        return getSubtraction(num1, num2);
    }

    static int multiplication(int num1, int num2) {
        return getMultiplication(num1, num2);
    }

    static int division(int num1, int num2) {
        return getDivision(num1, num2);
    }

    private static int getAddition(int num1, int num2) {
        return num1 + num2;
    }

    private static int getSubtraction(int num1, int num2) {
        return num1 - num2;
    }

    private static int getMultiplication(int num1, int num2) {
        return num1 * num2;
    }

    private static int getDivision(int num1, int num2) {
        return num1 / num2;
    }
}
