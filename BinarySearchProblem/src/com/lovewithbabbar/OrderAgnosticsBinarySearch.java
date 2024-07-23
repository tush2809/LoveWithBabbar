package src.com.lovewithbabbar;

public class OrderAgnosticsBinarySearch {

    public static void main(String[] args) {
        //int[] inputArray= {2,4,6,7,8,10,11,12,15,18,96};
        int[] inputArray= {96,18,15,12,11,10,8,7,6,4,2};

        int target=96;
        System.out.println(orderAgnosticsBinarySearchProblem(inputArray,target));
    }

    static int orderAgnosticsBinarySearchProblem(int[] inputArray,int target){

        if (inputArray.length==0){
            return -1;
        }

        int start=0;
        int end=inputArray.length-1;
      boolean  isAsc=inputArray[start] < inputArray[end];

        while (start<=end){
            int mid=start+(end-start)/2;
            if (inputArray[mid]==target){
                return mid;
            }
            if(isAsc){
                if (inputArray[mid]>target){
                   end=mid-1;
                } else {
                    start=mid+1;
                }
            }else {
                if (inputArray[mid]>target){
                    start=mid+1;
                } else {
                    end=mid-1;
                }
            }
        }
        return -1;
    }
}
