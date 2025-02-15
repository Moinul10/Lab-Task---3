
import java.util.Scanner;// Import Scanner class for user input
public class LargestNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);// Create Scanner object
        //Read three numbers from the user
        System.out.print("Enter first number: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter second number: ");
        int num2 = scanner.nextInt();
        System.out.print("Enter third number: ");
        int num3 = scanner.nextInt();
        //Find the Largest number using Math.max
        int largest = Math.max(num1, Math.max(num2, num3));
        System.out.println("Largest number is: " + largest);//Print the largest number
        
        scanner.close();//close the scanner
    }
}