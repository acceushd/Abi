package Datenstrukturen;

public class Array {
    public static void main(String[] args) {
        int[][] array = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        for (int[] ins : array) {
            for (int in : ins) {
                System.out.print(in + " ");
            }
            System.out.println();
        }
        System.out.println("  " + 0);
    }
}
