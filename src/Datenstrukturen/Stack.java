package Datenstrukturen;

import java.util.ArrayList;
import java.util.List;

public class Stack<T> {

    List<T> list;
    int size;
    boolean isEmpty;

    Stack() {
        list = new ArrayList<>();
        size = 0;
        isEmpty = true;
    }

    public boolean isEmpty() {
        return isEmpty;
    }

    T pop() {
        return getPop();
    }

    void push(T data) {
        pushItem(data);
    }

    T top() {
        return getTop();
    }

    private T getPop() {
        if (isEmpty) {
            System.out.println("Stack is empty");
            return null;
        }
        T data = list.get(list.size() - 1);
        list = list.subList(0, list.size() - 1);
        size--;
        if (size == 0) {
            isEmpty = true;
        }
        return data;
    }

    private void pushItem(T data) {
        list.add(data);
        isEmpty = false;
        size++;
    }

    private T getTop() {
        return list.get(list.size() - 1);
    }

}
