import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        int[] num = {78, 34, 32, 78, 65, 89, 0};
        Scanner in = new Scanner(System.in);
        System.out.println("kiska linear search: ");
        int target = in.nextInt();
        int ans = LinearSearchh(num, target);
        System.out.println(ans);


    }

    static int LinearSearchh(int[] arr, int target) {
        if (arr.length == 0) {
            return -1;

        }
        for (int i = 0; i < arr.length; i++) {
            int element = arr[i];
            if (element == target) {
                return i;
            }
        }
        return -1;
    }
}





