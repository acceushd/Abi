package Sort;

public class InsertionSort {
    void sort(int[] array) {
        int length = array.length;
        for (int i = 1; i < length; ++i) {
            int key = array[i];
            int j = i - 1;
            while (j >= 0 && array[j] > key) {
                array[j + 1] = array[j];
                j--;
            }
            array[j + 1] = key;
        }
    }
}
