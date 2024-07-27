package src.com.lovewithbabbar;

import java.util.Arrays;

public class BinarySearchProblem {
    public static void main(String[] args) {

       //int[] inputArray={2,3,5,9,14,16,18};
      // int target=4;
      // System.out.println(ceilingOfNumber(inputArray,target));
      //  System.out.println(floorOfNumber(inputArray,target));

       /* char[] inputArray={'c','d','f','j'};
        char target='a';
        System.out.println(smallestLetterGreaterThanTarget(inputArray,target));*/

       /* int[] inputArray2={5,7,7, 8,8,10};
        int target=4;
        System.out.println(Arrays.toString(firstAndLastPosition(inputArray2,target)));*/

        /*int[] inputArray={3,5,7,9,10,11,56,90,100,130,160,160,170,200};
        int target=100;
        System.out.println(findRange(inputArray, target));*/

        /*int[] inputArray={1,2,3,5,6,4,3,2};
        System.out.println(findPeakElementFormAnArray(inputArray));*/

     /*   //int[] inputArray={1,2,3,5,6,4,3,2};
        int[] inputArray={1,2,4,5,3,1};
        //int[] inputArray={4,5,6,7,0,1,2};
        System.out.println(findInMountainArray(inputArray,3));*/

        int[] inputArray={3,4,5,6,7,8,9,11,0,1,2};
        int target =11;
        System.out.println(findInRotatedSortedArray(inputArray,target));
    }


    static int  ceilingOfNumber(int[] inputArray,int target){
        if(inputArray.length==0){
             return -1;
        }
        int start=0;
        int end=inputArray.length-1;
        while (start<=end){
            int mid = start+(end-start)/2;
        if(inputArray[mid]>target)   {
            end = mid-1;
        } else if (inputArray[mid]==target) {
            return mid;
        }else {
            start=mid+1;
        }
        }
        return start;
    }
    
    static int floorOfNumber(int[] inputArray,int target){
        if(inputArray.length==0){
            return -1;
        }
        int start=0;
        int end= inputArray.length-1;
        while (start<=end){
            int mid = start+(end-start)/2;
            if(inputArray[mid]>target){
                end = mid-1;
            } else if (inputArray[mid]==target) {
                return mid;
            }else {
                start=mid+1;
            }
        }
        return end;
    }

    static char smallestLetterGreaterThanTarget(char[] inputArray,char target){

        int start=0;
        int end=inputArray.length-1;
        if(start<=end){
            int mid = start + (end-start)/2;
            if(inputArray[mid]>target){
                end =mid-1;
            } else{
                start=mid+1;
            }
        }
        return inputArray[start % inputArray.length];
    }

    static int[] firstAndLastPosition(int[] inputArray, int target){
         int[] output={-1,-1};
         int start= searchIndex(inputArray,target,true);
         int end = searchIndex(inputArray,target,false);
        output[0]=start;
        output[1]=end;
        return output;
    }

    static int searchIndex(int[] input,int target, boolean findStartIndex){
        int start=0;
        int end=input.length-1;
        int ans=-1;
        while (start<=end){
            int mid = start+ (end-start)/2;
            if(input[mid] > target){
                end=mid-1;
            } else if (input[mid]<target) {
                start=mid+1;
            }else {
                ans= mid;
                if(findStartIndex){
                    end =mid-1;
                }else {
                    start=mid+1;
                }
            }
        }
        return ans;
    }

    static int findRange(int[] inputArray, int target){
        //In this problem we cant take end is array length because size of an array is infinite
        //Approach is start=0 &  end=1 if not found doubling the size start=2 & end=5

        int start=0;
        int end=1;
       while (target>inputArray[end]){
           int newStart=end+1;
            end=end + (end-start+1)*2;
            start=newStart;
       }
      return  findElementInInfiniteArray(inputArray,target,start,end);
    }

    static int findElementInInfiniteArray(int[] inputArray,int target,int start,int end){

        while (start<=end){
            int mid=start+ (end-start)/2;
            if(inputArray[mid]>target){
                end =mid-1;
            } else if (inputArray[mid]<target) {
                start=mid+1;
            }else {
                return mid;
            }
        }
        return -1;
    }


    static int findPeakElementFormAnArray(int[] inputArray){
        int start = 0;
        int end=inputArray.length-1;
        int mid=0;
        while (start<end){
             mid = start + (end-start)/2;
            if(inputArray[mid]>inputArray[mid+1]){
                end = mid;
            } else if (inputArray[mid]<inputArray[mid+1]) {
                start =mid+1;
            }
        }
        return inputArray[start];
    }


     static int findInMountainArray(int[] inputArray,int target) {
         int end = findEndIndex(inputArray);
         int isAsc = findElementUsingBinarySearch(inputArray, target, 0, end,true);
         if (isAsc == -1){
        isAsc = findElementUsingBinarySearch(inputArray, target, end, inputArray.length,false);
        }
         return isAsc;
    }

    private static int findElementUsingBinarySearch(int[] inputArray, int target, int start, int end,boolean isAsc) {
        while (start<=end){
            int mid=start+(end-start)/2;
            if(inputArray[mid]==target){
                return mid;
            }
            if(isAsc){
                if(inputArray[mid]<target){
                    start=mid+1;
                }else if(inputArray[mid]>target){
                    end=mid-1;
                }
            }else {
                if(inputArray[mid]>target){
                    start=mid+1;
                }else if(inputArray[mid]<target){
                    end=mid-1;
                }
            }
        }
        return -1;
    }

    private static int findEndIndex(int[] inputArray) {
          int start=0;
          int end=inputArray.length-1;
          while (start<end){
              int mid = start + (end-start)/2;
              if(inputArray[mid]>inputArray[mid+1]){
                  end=mid;
              }else if(inputArray[mid]< inputArray[mid+1]) {
                  start=mid+1;
              }
          }
          return start;
    }


        /* Ask In Amazon and google Interview */
      static int findInRotatedSortedArray(int[] inputArray,int target){
          int pivot = findPivot(inputArray);
          if(inputArray[pivot]==target){
                 return pivot;
          }
          int firstHalf =findTargetInRotatedSortedArray(inputArray,target,0,pivot);
        return firstHalf==-1?findTargetInRotatedSortedArray(inputArray,target,pivot+1,inputArray.length-1):firstHalf;
      }

    private static int findTargetInRotatedSortedArray(int[] inputArray, int target, int start,int end) {



          while (start<=end){
              int mid = start + (end-start)/2;
              if(inputArray[mid]>target){
                  end=mid-1;
              } else if (inputArray[mid]<target) {
                  start=mid+1;
              }else {
                  return mid;
              }
          }
          return -1;
    }

    static int findPivot(int[] arr){
            int start=0;
            int end = arr.length-1;

            while (start<=end){
                int mid = start + (end - start) /2;

                if( start < end && arr[mid]>arr[mid+1]){
                    return mid;
                }

                if(start<end && arr[mid]<arr[mid-1]){
                   return mid-1;
                }

                if(arr[start] >= arr[mid]){
                    end=mid-1;
                }else {
                    start=mid+1;
                }
            }
            return -1;
      }




}
