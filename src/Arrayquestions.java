public class Arrayquestions {
    public static void main(String[] args) {
        int[] arr = {868686, 6866969, 5858578, 7858758, 45986969};
        int max = arr[0]; // Pehle element ko max maan lo

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i]; // Naya max mil gaya
            }
        }
        System.out.println("Maximum element is: " + max);
    }
}