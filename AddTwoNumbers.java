import java.util.Scanner; // Import the Scanner class to read user input

public class AddTwoNumbers {
    public static void main(String[] args) {
        // Declare variables to store the two numbers and their sum
        int num1, num2, sum;

        // Create a Scanner object to read input from the console
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the first number
        System.out.print("Enter the first number: ");
        // Read the first integer from the user
        num1 = scanner.nextInt();

        // Prompt the user to enter the second number
        System.out.print("Enter the second number: ");
        // Read the second integer from the user
        num2 = scanner.nextInt();

        // Close the scanner to release system resources
        scanner.close();

        // Calculate the sum of the two numbers
        sum = num1 + num2;

        // Print the result to the console
        System.out.println("The sum of " + num1 + " and " + num2 + " is: " + sum);
    }
}