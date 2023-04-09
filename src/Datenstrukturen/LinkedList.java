package Datenstrukturen;

public class LinkedList {
    Knoten wurzel;

    LinkedList() {
        wurzel = null;
    }

    void add(int data) {
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
    }

    void delete(int data) {
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
