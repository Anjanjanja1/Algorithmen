package UE15_Sorting;

import java.util.Arrays;

public class Array {
    public static void main(String[] args) {
        bubbleSort();
    }

    public static void bubbleSort(){
        int[] array = {32, 10, 1, 94, 25, 65};

        //Looping through array
        for (int i = 0; i < array.length-1; i++) {
            //Comparison:
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    //Swap array[j] and array[j + 1]
                    int helper = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = helper;
                }
            }
            // Print array after each outer loop iteration
            System.out.println("Array after iteration " + (i + 1) + ": " + Arrays.toString(array));
        }
    }
}
