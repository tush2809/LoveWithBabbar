package src.com.lovewithbabbar;
public class BinarySearch {
    public static void main(String[] args) {
        int[] inputArray= {2,4,6,7,8,10,11,12,15,18,96};
        int target=18;
        System.out.println(binarySearchAlgorithm(inputArray,target));
    }

    static int binarySearchAlgorithm(int[] inputArray,int target){
        if(inputArray.length==0) {
            return -1;
        }
        int start=0;
        int end=inputArray.length-1;
        while (start<end){
             int mid=start+(end-start)/2;
          if(inputArray[mid]>target){
              end=mid-1;
          }else if (inputArray[mid]<target){
              start=mid+1;
          }else {
              return mid;
          }
        }
        return -1;
    }
}