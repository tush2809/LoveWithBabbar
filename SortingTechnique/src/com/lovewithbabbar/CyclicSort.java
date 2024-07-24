package src.com.lovewithbabbar;

import java.lang.reflect.Array;
import java.util.Arrays;

public class CyclicSort {
    public static void main(String[] args) {
        int[] inputArray2 = {5,2,7,1,4,6,8,3};
       // int[] inputArray = {3,1,5,4,2};
        //1,2,3,4,5,6,7,8,9
        System.out.println(Arrays.toString(cyclicSort2(inputArray2)));
    }

    //In given problem where we see range 1 to N blindly follow this sorting algorithm
   /* This logic not working for this array (inputArray2) here i
    incrementing compulsory even the element is not in correct position*/
    static int[] cyclicSort(int[] inputArray) {
        for (int i = 0; i <=inputArray.length-1; i++) {
                  int index = inputArray[i] - 1;
                  int temp=inputArray[index];
                  inputArray[index]=inputArray[i];
                  inputArray[i]=temp;
        }
        return inputArray;
    }
   /*In this logic i tevach increment hoto jeva index position war valid element place ny krt*/
    static int[] cyclicSort2(int[] inputArray) {
        int i=0;
        while (i < inputArray.length) {
            int idx = inputArray[i]-1;
            if (inputArray[i] != inputArray[idx]) {
                int temp=inputArray[i];
                inputArray[i]=inputArray[idx];
                inputArray[idx]=temp;
            }else {
                i++;
            }
        }
       return inputArray;
    }
}
