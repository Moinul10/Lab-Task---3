import java.util.Scanner;// Import Scanner class for user input


public class EvenOddCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);// Create Scanner object
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();//Read number from user
        //Check if the number is even or odd
        if (num % 2 == 0) {
            System.out.println(num + " is a Even number.");//print if Even
        } else {
            System.out.println(num + " is a Odd number.");//print of Odd
        }
        scanner.close();//Close the scanner
}
}
