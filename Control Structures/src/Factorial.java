import java.util.Scanner;

public class Factorial{
    public static void main(String[] args) {
        // Declare and initialize variables
        int fact = 1;
        int i = 1;

        // Create an object of Scanner class
        Scanner sc = new Scanner(System.in);

        // Accept a number from the user
        System.out.println("Enter a number whose factorial is to be found: ");
        int num = sc.nextInt();

        // Calculate the factorial using a while loop
        while (i <= num) {
            fact *= i; // Multiply fact by i
            i++; // Increment i by 1
        }

        // Print the result
        System.out.println("\nFactorial of " + num + " is: " + fact);
    }
}
