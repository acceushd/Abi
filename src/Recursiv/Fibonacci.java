package Recursiv;

public class Fibonacci {
    int fibonacci(int stelle) {
        return rechnen(stelle);
    }

    private int rechnen(int zahl) {
        if (zahl <= 0) {
            return 0;
        } else if (zahl == 1) {
            return 1;
        } else {
            return rechnen(zahl - 1) + rechnen(zahl - 2);
        }
    }
}
