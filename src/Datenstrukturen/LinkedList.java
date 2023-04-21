package Datenstrukturen;

public class LinkedList {
    Knoten wurzel;

    LinkedList() {
        wurzel = null;
        size = 0;
    }

    int size;

    public void add(int data) {
        Knoten neuerKnoten = new Knoten(data);

        if (wurzel == null) {
            wurzel = neuerKnoten;
        } else {
            Knoten current = wurzel;
            while (current.next != null) {
                current = current.next;
            }
            current.next = neuerKnoten;
        }
        size++;
    }

    public int get(int index) {
        return getAt(index);
    }

    private int getAt(int index) {
        Knoten tmp = wurzel;
        int currentIndex = 0;
        while (tmp.next != null) {
            if (currentIndex == index) {
                return wurzel.data;
            }
            tmp = tmp.next;
            currentIndex++;
        }
        return -1;
    }

    public int getSize() {
        return size;
    }

    public void delete(int data) {
        if (wurzel == null) {
            System.out.println("Liste ist leer");
            return;
        }
        if (wurzel.data == data) {
            wurzel = wurzel.next;
        } else {
            Knoten current = wurzel.next;
            Knoten vorher = wurzel;
            while (current.next != null) {
                if (current.data == data) {
                    vorher.next = current.next;
                    return;
                } else {
                    current = current.next;
                }
            }
            current = null;
        }
    }
}
