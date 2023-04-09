package Datenstrukturen;

import java.util.ArrayList;
import java.util.List;

public class Queue<T> {
    List<T> list;
    int size;
    boolean isEmpty;

    Queue() {
        list = new ArrayList<>();
        size = 0;
        isEmpty = true;
    }

    public boolean isEmpty() {
        return isEmpty;
    }

    void enqueue(T data) {
        addItem(data);
    }

    T dequeue() {
        return removeItem();
    }

    T front() {
        return getFirst();
    }

    private void addItem(T data) {
        list.add(data);
        size++;
        isEmpty = false;
    }

    private T removeItem() {
        T data = list.get(list.size() - 1);
        list.remove(list.size() - 1);
        size--;
        if (size == 0) {
            isEmpty = true;
        }
        return data;
    }

    private T getFirst() {
        if (!isEmpty) {
            return list.get(0);
        } else {
            System.out.println("Queue is empty");
            return null;
        }
    }
}
