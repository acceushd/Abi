public class SelectionSort {
    public void sort(int[] array) {
        int length = array.length;
        for (int i = 0; i < length - 1; i++) {
            int index = i;
            for (int j = i + 1; j < length; j++) {
                if (array[index] > array[j]) {
                    index = j;
                }
            }
            int tmp = array[i];
            array[i] = array[index];
            array[index] = tmp;
        }
    }
}
