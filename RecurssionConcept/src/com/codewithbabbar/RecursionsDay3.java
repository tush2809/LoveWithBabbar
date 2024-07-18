package com.codewithbabbar;

import java.util.Arrays;
import java.util.Scanner;

public class RecursionsDay3 {
    public static void main(String[] args) {

        int size = 6;
        int[] inputArray = new int[size];
        inputArray = new int[]{2, 4, 6, 9,11,13};
        // System.out.println(isSortedArray(inputArray,size));
        //System.out.println(sumOfArraysElement(inputArray,0));
        //System.out.println(isElementFoundInGivenArray(inputArray,6)?"Found": "Not Found");
        Scanner scanner = new Scanner(System.in);
        int target = scanner.nextInt();
        System.out.println(binarySearchAlgorithm(inputArray,0,inputArray.length-1,target));
    }

  static boolean isSortedArray(int[] inputArray,int size){
      if(size==0 || size==1){
          return true;
      }
        if(inputArray[0] >inputArray[1]){
            return false;
        }else {
            int[] newArray = Arrays.copyOfRange(inputArray, 1, inputArray.length);
            return isSortedArray(newArray, size - 1);
        }
     }

     static int sumOfArraysElement(int[] inputArray,int sum){
        if(inputArray.length==1){
            return sum +=inputArray[0];
        }
         sum += inputArray[0];
        int[] newArray = Arrays.copyOfRange(inputArray,1,inputArray.length-1);
         return sumOfArraysElement(newArray,sum);
     }


     //Linear Search Programme
     static boolean isElementFoundInGivenArray(int[] inputArray,int target){
           if(inputArray.length==0){
               return false;
           }
           if(inputArray[0] == target){
               return true;
           }
           return isElementFoundInGivenArray(Arrays.copyOfRange(inputArray,1,inputArray.length),target);
     }


      static int binarySearchAlgorithm(int[] inputArray,int start,int end, int target){
        if(inputArray.length==0){
            return -1;
        }
        if(start>end){
            return -1;
        }
       int mid = end - (end-start) / 2;
        if(inputArray[mid]<target){
            start=mid+1;
        }else if(inputArray[mid]==target){
            return mid;
        }else{
            end=mid-1;
        }
        return binarySearchAlgorithm(inputArray,start,end,target);
      }



}
