public class
min {
   public static void main(String[] args) {
      int[] arr = {34,12,1,43,6,5,-4};
       System.out.println(minn(arr));


    }
    static int minn(int[] arr) {
       int ans = 0;
       for (int i = 1; i < arr.length; i++) {
           if(arr[i] < ans) {
               ans = arr[i];
       }

       }
       return ans;
    }
}
