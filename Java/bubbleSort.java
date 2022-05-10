public class bubbleSort {
    public void bubblesort(int[] array) {
        int lengthOfArray = array.length;

        for (int j = 1; (j < lengthOfArray - 1); j++) {

            for (int i = 0; i < (lengthOfArray - 1); i++) {

                if (array[i] > array[i + 1]) {

                    // Swap function
                    int temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                }
            }
        }

    }
}
