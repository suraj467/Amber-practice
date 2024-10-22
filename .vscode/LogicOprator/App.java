import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Correc
        final Scanner initialization;
        System.out.println("Enter the grade of the student:");
        int grade = sc.nextInt();

        // Check if the grade is within the valid range (0 to 10)
        if (grade >= 0 && grade <= 10) {
            if (grade <= 3) {
                System.out.println("Failed");
            } else if (grade > 3 && grade <= 5) {
                System.out.println("Insufficient");
            } else if (grade > 5 && grade <= 8) {
                System.out.println("Good");
            } else if (grade == 10) { // Use == for comparison
                System.out.println("Excellent");
            }
        } else {
            System.out.println("Invalid grade. Please enter a grade between 0 and 10.");
        }

        sc.close(); // Close the scanner to avoid resource leaks
    }
}
