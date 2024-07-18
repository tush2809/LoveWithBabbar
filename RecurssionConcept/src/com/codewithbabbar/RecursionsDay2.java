package com.codewithbabbar;

public class RecursionsDay2 {

    final static String[] numberArray= {"Zero","One","Two","Three","Four","Five","Six","Seven","Eight","Nine","Ten"};

    public static void main(String[] args) {

        int src=1;
        int dest=10;
        //reachHome(src,dest);
        //System.out.println(fibonacciNumber(5));
        digitToStringConversion(548964);
    }

     static void reachHome(int src, int dest) {
         System.out.println("Source " + src + " Destination " + dest);
        // Base Condition
        if(src==dest) {
            System.out.println("Ghar Pahuch Gaya....");
            return;
        }
        // Processing - ek step aage badh jao....
        src++;
        //Recursive relation
        reachHome(src,dest);
    }

     static int fibonacciNumber(int n){
        if(n==0)
            return 0;
        if (n==1)
            return 1;
        return fibonacciNumber(n-1) + fibonacciNumber(n-2);
     }


     static void digitToStringConversion(int n){
        if(n<=0){
            return;
        }
         int mod = helperFunction(n);
         digitToStringConversion(n=n/10);
         System.out.print(numberArray[mod] + " ");
     }
      static int helperFunction(int n){
          return n%10;
     }





}
