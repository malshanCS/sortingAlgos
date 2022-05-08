public class insertionSort {

    public void sort(int[] array) {
        for (int i = 1; i < (array.length); i++) {
            int value = array[i];
            int hole = i;

            while ((hole > 0) && (array[hole - 1] > value)) {
                array[hole] = array[hole - 1];
                hole = (hole - 1);
            }

            array[hole] = value;

        }
    }

    public void Sort2(int array[]) {
        int n = array.length;
        for (int j = 1; j < n; j++) {
            int key = array[j];
            int i = j - 1;
            while ((i > -1) && (array[i] > key)) {
                array[i + 1] = array[i];
                i--;
            }
            array[i + 1] = key;
        }
    }

}