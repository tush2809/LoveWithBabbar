package com.codewithbabbar;

import java.util.Scanner;

public class RecurssionProblem {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input=scanner.nextInt();
         //System.out.println(sumOfDigit(input,0));
        //System.out.println(sumOfDigit2ndWay(input));
        //preincrementAndPostIncrementConcept(input);
        //reverseGivenNumber(input);
        System.out.println(countNumberOfZeros(input,0));
    }

     static int sumOfDigit(int input,int sum) {
        if(input<=0){
            return  sum;
        }
        sum += input%10;
        input=input/10;
        return sumOfDigit(input,sum);
    }

    static int sumOfDigit2ndWay(int input) {
        if(input<=0){
            return 0;
        }
        return (input%10) + sumOfDigit2ndWay(input/10);
    }

    static void preincrementAndPostIncrementConcept(int n){
        if(n==0){
            return;
        }
        System.out.println(n);
       // preincrementAndPostIncrementConcept(n--);
        preincrementAndPostIncrementConcept(--n);
    }

    static void reverseGivenNumber(int input){
        if(input<=0){
            return;
        }
        int mod =input%10;
        System.out.print(mod);
        reverseGivenNumber(input/10);
    }

    static  int countNumberOfZeros(int input,int num){
        if(input<=0) {
            return num;
        }
        return countNumberOfZeros(input/10,input%10==0?num+1:num);
    }



}
