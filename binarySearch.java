import java.util.Scanner;

public class binarySearch {
    public static void main(String[] args) {
        int[] arr = {12, 23, 32, 45, 58, 69, 71, 83, 92,100};
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        System.out.println(BinarySearch(arr, n));

    }

    static int BinarySearch(int[] arr, int n) {
        int start = 0;
        int end = 0;
        int middle = arr.length / 2;   //MIDDLE INDEX = MIDDLE-1
       int middlElement = arr[middle];//5   //middle ELEMENT
        //Best Case
          if (n == middlElement){
             return middle-1;
          }
        if (n < middlElement) {  //n=2 < length =5
            start = 0;
            end = middle; //length =5
        }
         else {
            start = middle;
            end = arr.length;
        }
        for (int i = start; i < end; i++) {
            if (arr[i] == n) {
                return i;
            }
        }return -1;

}
     }