import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main4 {
    // Function that repeats each element in the list n times
    public static List<Integer> repeatElements(int n, List<Integer> arr) {
        List<Integer> result = new ArrayList<>();
        
        // Loop through each element in the original list
        for (int elem : arr) {
            // Repeat the element n times and add to the result list
            for (int i = 0; i < n; i++) {
                result.add(elem);
            }
        }
        
        return result;
    }

    @SuppressWarnings("resource")
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input number of repetitions
        int n = scanner.nextInt();
        
        // Create a list to hold the input elements
        List<Integer> arr = new ArrayList<>();
        
        // Input the elements into the list
        while (scanner.hasNextInt()) {
            arr.add(scanner.nextInt());
        }
        
        // Get the result list by repeating elements
        List<Integer> result = repeatElements(n, arr);
        
        // Output each element in the result list on a new line
        for (int elem : result) {
            System.out.println(elem);
        }
    }
}
