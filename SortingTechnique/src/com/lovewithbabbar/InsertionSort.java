package src.com.lovewithbabbar;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] inputArray = {64, 25, 12, 22, 11};
        System.out.println(Arrays.toString(insertionSort2ndWay(inputArray)));
    }


    static int[] insertionSort(int[] inputArray){
        for (int i = 0; i < inputArray.length-1; i++) {
            for (int j = i+1; j>0; j--) {
                  if(inputArray[j]<inputArray[j-1]){
                      int temp=inputArray[j-1];
                      inputArray[j-1]=inputArray[j];
                      inputArray[j]=temp;
                  }else {
                      break;
                  }
            }
        }
        return inputArray;
    }

    static int[] insertionSort2ndWay(int[] inputArray){
        // {64, 25, 12, 22, 11}
        //25 64 12 22 11
        for (int i = 1; i < inputArray.length; i++) {
            int j=i-1;                     //0 //2-1=1
            int temp=inputArray[i];        //25 //12
            while(0<=j){
             if(inputArray[j]>temp){    // j=0 & i=1-> 64>25   j=1&i=2-> 64>12  j=0&i==2->25>64
                 inputArray[j+1]=inputArray[j];  // 64 64 12 22 11   25 64 64 22 11
                 j--;
                }else{
                    break;
                }
            }
            inputArray[j+1]=temp;//25 64 12 22 11  //25 12 64 22

        }
        return inputArray;
    }
}
