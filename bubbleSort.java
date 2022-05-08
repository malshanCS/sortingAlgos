public class bubbleSort {
    public void sort1(int[] array) {
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

    // Optimized Version of Bubblesort

    public void sortOptimized(int[] array) {
        int lengthOfArray = array.length;

        for (int j = 1; (j < lengthOfArray - 1); j++) {

            // To check whether no swapping has done through one iteration of above outer
            // loop
            int flag = 0;

            for (int i = 0; i < (lengthOfArray - j); i++) {

                if (array[i] > array[i + 1]) {

                    // Swap function
                    int temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;

                    // atleast Swap has done, Set flag = 1
                    flag = 1;
                }
            }
            // No swap has done, break the outer loop
            if (flag == 0) {
                break;
            }
        }

    }

}
