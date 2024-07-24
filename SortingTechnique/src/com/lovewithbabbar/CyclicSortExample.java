package src.com.lovewithbabbar;

import java.util.Arrays;

public class CyclicSortExample {
    public static void main(String[] args) {

         int[] inputArray={3,0,1};
        System.out.println(Arrays.toString(missingNumber(inputArray)));
    }

    static int[] missingNumber(int[] inputArray){
         int i=0;  //3 0 1 //1 0 3
          while (i<inputArray.length){
              int index= inputArray[i]-1;
              if(index>=0){
                  if(inputArray[i]!=inputArray[index]){
                      int temp=inputArray[i];
                      inputArray[i]=inputArray[index];
                      inputArray[index]=temp;
                  }else {
                      i++;
                  }
              }else {
                  int temp=inputArray[0];
                  inputArray[0]=0;
                  inputArray[1]=temp;
                  i++;
              }
          }
      return inputArray;
    }





}
