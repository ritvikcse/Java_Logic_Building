public class Arrayquestions {
   public static void main(String[] args) {
       int[] arr = {10,70,39,79,50};

       System.out.println("original Array: ");
       printArray(arr);

       System.out.println("reversed Array: ");
       printArray(arr);


    }
    public static void reverseArray(int[] arr) {
       int start = 0;
       int end = arr.length-1;

       while (start < end) {

           int temp = arr[start];
           arr[start] = arr[end];
           arr[end] = temp;


           start++;
           end--;
       }
    }

    public static void printArray(int[] arr) {
       for (int i : arr ) {
           System.out.println(i + " ");
       }

    }
}