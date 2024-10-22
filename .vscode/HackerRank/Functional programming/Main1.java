import java.util.Scanner;

public class Main1 {
    // Function to return the sum of two numbers
    public static int sumTwoNumbers(int a, int b) {
        return a + b;
    }

    @SuppressWarnings("resource")
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input two integers from the user
        int a = scanner.nextInt();  // First integer
        int b = scanner.nextInt();  // Second integer

        // Print the result of their sum
        System.out.println(sumTwoNumbers(a, b));
    }
}
