
import java.util.Scanner; // Import Scanner class for user input

public class PrimeCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Create Scanner object
        System.out.print("Enter a number: ");
        int num = scanner.nextInt(); // Read number from user
        boolean isPrime = true; // Assume number is prime initially

        // Check if number is less than or equal to 1
        if (num <= 1) {
            isPrime = false;
        } else {
            // Check divisibility from 2 to sqrt(num)
            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {
                    isPrime = false; // If divisible, it's not prime
                    break;
                }
            }
        }

        // Print result
        if (isPrime) {
            System.out.println(num + " is a Prime number.");
        } else {
            System.out.println(num + " is not a Prime number.");
        }
        
        scanner.close(); // Close the scanner
    }
}