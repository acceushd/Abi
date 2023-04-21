package Datenstrukturen;

public class Binaerbaum {
    int data;
    Binaerbaum left;
    Binaerbaum right;

    Binaerbaum(int data) {
        this.data = data;
        left = null;
        right = null;
    }

    public int getData() {
        return data;
    }

    public Binaerbaum getLeft() {
        return left;
    }

    public Binaerbaum getRight() {
        return right;
    }
}
