import java.util.Scanner;

public class CareerCouncelling {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("===== Career Counseling System =====");
        System.out.println("Answer the following questions honestly.\n");

        System.out.println("1. What do you like the most?");
        System.out.println("a) Technology / Coding");
        System.out.println("b) Business / Management");
        System.out.println("c) Creativity / Design");
        System.out.println("d) Helping People / Social Work");
        System.out.print("Enter your choice (a/b/c/d): ");
        char choice1 = sc.next().charAt(0);

        System.out.println("\n2. What type of work do you prefer?");
        System.out.println("a) Analytical / Problem Solving");
        System.out.println("b) Leadership / Managing People");
        System.out.println("c) Artistic / Creative Work");
        System.out.println("d) Service / Healthcare");
        System.out.print("Enter your choice (a/b/c/d): ");
        char choice2 = sc.next().charAt(0);

        System.out.println("\n===== Your Career Suggestion =====");

        if (choice1 == 'a' && choice2 == 'a') {
            System.out.println("You should consider a career in:");
            System.out.println("-> Software Engineering");
            System.out.println("-> Data Science");
            System.out.println("-> Cyber Security");
        }
        else if (choice1 == 'b' && choice2 == 'b') {
            System.out.println("You should consider a career in:");
            System.out.println("-> Business Management");
            System.out.println("-> MBA");
            System.out.println("-> Entrepreneurship");
        }
        else if (choice1 == 'c' && choice2 == 'c') {
            System.out.println("You should consider a career in:");
            System.out.println("-> Graphic Designing");
            System.out.println("-> Fashion Designing");
            System.out.println("-> Animation / UI-UX");
        }
        else if (choice1 == 'd' && choice2 == 'd') {
            System.out.println("You should consider a career in:");
            System.out.println("-> Doctor / Nursing");
            System.out.println("-> Social Worker");
            System.out.println("-> Psychologist");
        }
        else {
            System.out.println("You have mixed interests!");
            System.out.println("You can explore:");
            System.out.println("-> Digital Marketing");
            System.out.println("-> Business Analytics");
            System.out.println("-> Content Creation");
        }

        System.out.println("\nThank you for using Career Counseling System!");
        sc.close();
    }
}