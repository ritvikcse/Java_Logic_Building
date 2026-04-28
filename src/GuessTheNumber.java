import java.util.Scanner;
import java.util.Random;
import java.util.InputMismatchException;

public class GuessTheNumber {
    public static void main(String[] args) {
        // Objects for Logic
        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        int numberToGuess = random.nextInt(100) + 1;
        int numberOfAttempts = 0;
        boolean hasGuessedCorrectly = false;

        System.out.println("========================================");
        System.out.println("   WELCOME TO THE PRO GUESSING GAME     ");
        System.out.println("========================================");
        System.out.println("Maine 1 se 100 ke beech ek number socha hai.");

        while (!hasGuessedCorrectly) {
            System.out.print("\nApna guess dalo: ");

            try {
                int userGuess = sc.nextInt();
                numberOfAttempts++;

                if (userGuess < 1 || userGuess > 100) {
                    System.out.println("Bhai, limit mein raho! 1 se 100 tak hi.");
                } else if (userGuess < numberToGuess) {
                    System.out.println("THODA BADA! (Hint: Too Low)");
                } else if (userGuess > numberToGuess) {
                    System.out.println("THODA CHOTA! (Hint: Too High)");
                } else {
                    hasGuessedCorrectly = true;
                    System.out.println("\n*** SHABAASH! ***");
                    System.out.println("Tune " + numberOfAttempts + " attempts mein phod diya!");
                    System.out.println("Sahi number " + numberToGuess + " hi tha.");
                }
            } catch (InputMismatchException e) {
                // Agar user number ki jagah alphabet daal de toh ye handle karega
                System.out.println("ERROR: Bhai sirf numbers (1-100) dalo, ABC nahi!");
                sc.next(); // Galat input ko clear karne ke liye
            }
        }

        System.out.println("========================================");
        sc.close();
    }
}