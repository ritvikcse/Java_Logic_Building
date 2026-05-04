public class BinarySearch{
   public static void main(String[] args) {
       int[] arr = {-4,-2,0,2,4,6,9,12};
       int target = 2;
       int ans = binarysearch(arr , target);
       System.out.println(ans);


    }
    static int binarysearch(int[] arr , int target) {
       int start = 0;
       int end = arr.length -1;

       while (start <= end) {

           int mid = start + (end - start) / 2;

           if (target < arr[mid]) {
               end = start - 1;


           } else if (target > arr[mid]) {
               start = end + 1;

           } else {
               return mid;
           }
       }
       return -1;

    }
}