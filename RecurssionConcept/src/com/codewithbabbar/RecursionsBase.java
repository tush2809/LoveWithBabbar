package com.codewithbabbar;

public class RecursionsBase {

    public static void main(String[] args) {

      //  System.out.println(calculatePowerOfTwo(3));
     //   System.out.println(factorial(5));
     //   tailRecursion(5);
        headRecursion(5);




    }

    static int calculatePowerOfTwo(int n){
        //Base Condition
        if(n==0)
            return 1;

        //recursive relation
        int smallerProblem = calculatePowerOfTwo(n-1);
        int biggerProblem = 2 * smallerProblem;
         return biggerProblem;
    }

    static int factorial(int n){
        if(n==0)
            return 1;
        int smallerProblem=factorial(n-1);
        int biggerProblem=n* smallerProblem;
        return biggerProblem;
    }

    static void tailRecursion(int n){
        //Base case
          if(n==0)
              return;
          //Processing
        System.out.println(n);

        //Recursive relation
         tailRecursion(n-1);
    }

    static void headRecursion(int n){
        //Base case
        if(n==0)
            return;
        //Recursive relation
        headRecursion(n-1);
        //Processing
        System.out.println(n);
    }
















}
