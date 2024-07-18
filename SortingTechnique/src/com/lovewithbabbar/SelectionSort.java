package src.com.lovewithbabbar;

import java.util.Arrays;

public class SelectionSort {

    public static void main(String[] args) {
        int[] inputArray = {64, 25, 12, 22, 11};
        System.out.println(Arrays.toString(selectionSort(inputArray)));
    }


    static int[] selectionSort(int[] inputArray) {
        int j;
        for (int i = 0; i < inputArray.length; i++) {
            int minIndex = i;
            for (j = i + 1; j <= inputArray.length - 1; j++) {
                if (inputArray[minIndex] > inputArray[j]) {
                    minIndex = j;
                }
            }
            int temp = inputArray[minIndex];
            inputArray[minIndex] = inputArray[i];
            inputArray[i] = temp;
        }
        return inputArray;
    }
}
