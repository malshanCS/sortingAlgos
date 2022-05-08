import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        
        //Example array
        int[] numbers1 = { 7, 4, 43, 1, 2, 3, 4, 31, 22, 121, 43 };
        int[] numbers2 = { 7, 4, 43, 1, 2, 3, 4, 31, 22, 121, 43 };
        int[] numbers3 = { 7, 4, 43, 1, 2, 3, 4, 31, 22, 121, 43 };
        int[] numbers4 = { 7, 4, 43, 1, 2, 3, 4, 31, 22, 121, 43 };

        //insertion sort - type 1
        insertionSort sorter1 = new insertionSort();
        sorter1.sort(numbers1);
        
        //insertion sort - type 2
        insertionSort sorter2 = new insertionSort();
        sorter2.Sort2(numbers2);
        
        //Bubble sort
        bubbleSort sorter3 = new bubbleSort();
        sorter3.sort1(numbers3);
        
        //Bubble Sort - Optimized
        bubbleSort sorter4 = new bubbleSort();
        sorter4.sortOptimized(numbers4);

        System.out.println(Arrays.toString(numbers1));
        System.out.println("+++++++++++++++++++++++++++++++++++");

        System.out.println(Arrays.toString(numbers2));
        System.out.println("+++++++++++++++++++++++++++++++++++");

        System.out.println(Arrays.toString(numbers3));
        System.out.println("+++++++++++++++++++++++++++++++++++");

        System.out.println(Arrays.toString(numbers4));
        System.out.println("+++++++++++++++++++++++++++++++++++");
    }
}
