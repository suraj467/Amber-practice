import java.util.Scanner;

public class Main3 {
    // Method that prints "Hello World" n times
    /**
     * @param n
     */
    public static void f(int n) {
        // Loop to print "Hello World" n times
        for (int i = 0; i < n; i++) {
            System.out.println("Hello World");
        }
    }

    @SuppressWarnings("resource")
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the number of times to print "Hello World"
        int n = scanner.nextInt();

        // Call the function f to print "Hello World" n times
        f(n);
    }
}
