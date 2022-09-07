import java.util.Scanner;

class OrderAgnosticBinarySearch{
    public static void main(String[] args) {
       // int[] arr = {78, 63, 52, 44, 36, 25, 10, 9};
        int[] arr = {12, 23, 32, 45, 58, 69, 71, 83, 92,100};
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        System.out.println(OrderAgonstic(arr, n));

    }

    static int OrderAgonstic(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

     //   boolean Asc = arr[start] < arr[end];

        while (start <= end) {
            int mid = start + (end - start) / 2;

          if(arr[start] < arr[end]){
            if (target < arr[mid]) {
                end = mid - 1;
            }
            else if (target > arr[mid]) {
                start = mid + 1;
            }
          }
          else if(target == arr[mid]){
              return mid;
          }


        else if (arr[start] > arr[end]) {
              if (target < arr[mid]) {
                  start = mid + 1;
              } else if (target > arr[mid]) {
             end = mid - 1;
           }
     }
        }return -1;
    }
}
