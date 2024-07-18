package com.codewithbabbar;

import java.util.Arrays;
import java.util.Scanner;

import static java.util.Collections.emptyEnumeration;
import static java.util.Collections.swap;

public class RecursionsDay4 {
    public static void main(String[] args) {
       // Scanner scanner= new Scanner(System.in);
        //String input = scanner.nextLine();
        //char[] inputCharArray =input.toCharArray();
        //reverseString(inputCharArray,0,input.length()-1);
        //System.out.println(checkPalindrome(inputCharArray,0,input.length()-1)? "Is Palindrome Number": "Is Not Palindrome Number");
      //  int number=scanner.nextInt();
       // int power = scanner.nextInt();
        //System.out.println(calculateThePower(number,power,1));

        //System.out.println(calculateThePowerOptimization(number,power));

        int[] inputArray={4,8,3468,2468,7,1,78,2,465,75,452};

        System.out.println(Arrays.toString(bubbleSort(inputArray, 0, 1)));

        //System.out.println(Arrays.toString(bubbleSort2ndWay(inputArray, inputArray.length)));
    }

    static void reverseString(char[] input,int i, int j){
        if(i>j){
            return;
        }
       swap(input,i,j);
        i++;
        j--;
        reverseString(input,i,j);
    }

    static char[] swap(char[] input,int i,int j){
        char temp=input[j];
        input[j]=input[i];
        input[i]=temp;
        return input;
    }



    static boolean checkPalindrome(char[] input, int i, int j){
        if(i>j)
            return true;
        if(input[i]!=input[j]){
            return false;
        }
        i++;
        j--;
       return checkPalindrome(input,i,j);
    }


    static int calculateThePower(int a, int b,int power){
        if(b==0){
            return power;
        }
        power *= a;
        b--;
        return calculateThePower(a,b,power);
    }

    static int calculateThePowerOptimization(int a, int b){

        if (b==0) {
            return 1;
        }
        if(b==1){
            return a;
        }
        int ans = calculateThePowerOptimization(a,b/2);
        if(b%2==0){
            return ans * ans;
        }else {
            return a * ans * ans;
        }

    }

    static int[] bubbleSort(int[] inputArray,int i,int j){



        if(inputArray.length==0 || i==inputArray.length-1){
            return inputArray;
        }
        if(inputArray[j-1]>inputArray[j]){
           int temp=inputArray[j];
           inputArray[j]=inputArray[j-1];
           inputArray[j-1]=temp;
        }
        j++;
        if(j==inputArray.length-i){
            j=1;
            i++;
        }
     return  bubbleSort(inputArray,i,j);
    }
    static int[] swap(int[] input,int i,int j){
        int temp=input[j];
        input[j]=input[i];
        input[i]=temp;
        return input;
    }

    static int[] bubbleSort2ndWay(int[] inputArray,int size){
        if(size ==0 || size==1){
            return inputArray;
        }
        for (int i = 0; i < inputArray.length-1; i++) {
            if(inputArray[i]>inputArray[i+1]){
                swap(inputArray,i,i+1);
            }
        }
        return  bubbleSort2ndWay(inputArray,size-1);
    }




}
