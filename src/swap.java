import java.util.Arrays;

public class swap {
    static void main(String[] args) {
        int[] arr = {3,334,332,2,2,155};
        swap(arr,0,5);

        System.out.println(Arrays.toString(arr));


    }

    static void swap(int[] arr,int index1, int index2) {
     //   System.out.println();
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;


    }
}
