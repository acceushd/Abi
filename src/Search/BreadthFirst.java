package Search;

import Datenstrukturen.Tree;

import java.util.LinkedList;

public class BreadthFirst {

    public int search(Tree tree, int search) {
        return getSearch(tree, search);
    }

    private int getSearch(Tree tree, int search) {
        if (tree == null) {
            return -1;
        }

        if (tree.getData() == search) {
            return tree.getData();
        }

        LinkedList<Tree> neighbors = tree.getNeighbours();

        for (int i = 0; i < neighbors.size(); i++) {
            if (neighbors.get(0).getData() == search) {

            }
        }
        return -1;
    }
}
