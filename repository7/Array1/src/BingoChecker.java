import java.util.Scanner;

public class BingoChecker {
    public static void main(String[] args) {
        // Create an array with five integer elements
        int[] array = {3,5,8,17,9}; // Example values; you can modify these

        // Get input from the user
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first number (1-40): ");
        int num1 = scanner.nextInt();
        System.out.print("Enter the second number (1-40): ");
        int num2 = scanner.nextInt();

        // Check if both numbers exist in the array
        boolean foundNum1 = false;
        boolean foundNum2 = false;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == num1) {
                foundNum1 = true;
            }
            if (array[i] == num2) {
                foundNum2 = true;
            }
        }

        // Display the result
        if (foundNum1 && foundNum2) {
            System.out.println("Bingo! Both numbers are in the array.");
        } else {
            System.out.println("Numbers not found in the array.");
        }
    }
}
