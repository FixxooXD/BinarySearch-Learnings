import java.util.Scanner;

public class BinaryAlgo {
    public static void main(String[] args) {
        int[] arr = {12, 23, 32, 45, 58, 69, 71, 83, 92};
        int[] inveArr = {75,66,52,41,33,26,15};
//        Scanner in = new Scanner(System.in);
        int n = 26;
        System.out.println(binarySearch(arr, n));
        System.out.println(invbinarySearch(inveArr, n));

    }

    static int invbinarySearch(int[] arr,int n){
        int  start= 0;
        int end = arr.length-1;

        while (start<=end){
            int mid = start+(end-start)/2;
            if (n <arr[mid]){
                start = mid+1;
            }else if (n>arr[mid]){
                end = mid-1;
            }
            else if (n == arr[mid]){
                return mid;
            }
        }return -1;
    }

    // return the index
    // return -1 if it does not exist
    static int binarySearch(int[]arr,int n) {
        int start = 0;
        int end = arr.length - 1;
      while (start<=end){

                 // find the middle element
          int   mid= start+ (end-start)/2;// might be possible that (start + end) exceeds the range of int in java

          if (n < arr[mid]){
              end = mid-1;
          }
          else if(n > arr[mid]){
              start = mid +1;
          }else if (n ==  arr[mid]){
              return mid;
          }
      }return -1;
    }


}
