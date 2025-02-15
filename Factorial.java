
import java.util.Scanner; // Import Scanner class for user input

public class Factorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Create Scanner object
        System.out.print("Enter a number: ");
        int num = scanner.nextInt(); // Read number from user
        long factorial = 1; // Variable to store factorial (long to handle large numbers)
        
        // Calculate factorial using loop
        for (int i = 1; i <= num; i++) {
            factorial *= i;
        }
        
        System.out.println("Factorial of " + num + " is " + factorial); // Print factorial
        scanner.close(); // Close the scanner
}
}
