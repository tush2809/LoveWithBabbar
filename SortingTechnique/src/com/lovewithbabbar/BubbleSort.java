package com.lovewithbabbar;

import java.util.Arrays;

public class BubbleSort {
        public static void main(String[] args) {

            //int[] inputArray={6,8,9,7,56,83,27,4,14,687,54};
            int[] inputArray={0,1,2,3,4,5,6,7,8,9};

            System.out.println(Arrays.toString(bubbleSortAlgorithm(inputArray)));
        }

    static int[] bubbleSortAlgorithm(int[] inputArray){

         boolean swapped;
        for (int i = 0; i < inputArray.length; i++) {
            swapped=false;
            for (int j = 1; j < inputArray.length; j++) {
                if (inputArray[j-1]>inputArray[j]){
                    int temp = inputArray[j];
                    inputArray[j]=inputArray[j-1];
                    inputArray[j-1]= temp;
                    swapped=true;
                }
            }
            if(!swapped){
                break;
            }
        }

        return inputArray;
    }
}
