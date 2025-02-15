
import java.util.Scanner;// Import Scanner class for user input

public class SumTwoNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);// Create Scanner object
        System.out.print("Enter first number: ");
        int num1 = scanner.nextInt();// Read first number from user
        System.out.print("Enter second number: ");
        int num2 = scanner.nextInt();// Read second number from user
        int sum = num1 + num2;//Calculate sum
        System.out.println("Sum: " + sum);//Print the sum
        scanner.close();//Close the scanner
}
}
