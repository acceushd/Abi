package Datenstrukturen;

import java.util.LinkedList;

public class Tree {

    int data;
    LinkedList<Tree> neighbours = new java.util.LinkedList<>();

    Tree(int data) {
        this.data = data;
    }

    public int getData() {
        return data;
    }

    public void addNeighbor(Tree newNeighbor) {
        neighbours.add(newNeighbor);
    }

    public LinkedList<Tree> getNeighbours() {
        return neighbours;
    }
}
