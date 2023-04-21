package Search;

import Datenstrukturen.Binaerbaum;

public class DepthFirst {
    public int search(Binaerbaum tree, int search) {
        return getSearch(tree, search);
    }

    private int getSearch(Binaerbaum tree, int search) {
        if (tree == null) {
            return -1;
        }
        if (tree.getData() == search) {
            return tree.getData();
        }
        int left = getSearch(tree.getLeft(), search);
        if (left != -1) {
            return left;
        }
        return getSearch(tree.getRight(), search);
    }

}
