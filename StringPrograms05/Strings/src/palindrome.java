import java.util.Scanner;

public class palindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input string
        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();

        // Display length of the string
        int length = inputString.length();
        System.out.println("Length of the string: " + length);

        // Convert the string to uppercase
        String uppercaseString = inputString.toUpperCase();
        System.out.println("Uppercase string: " + uppercaseString);

        // Check if the string is a palindrome
        boolean isPalindrome = checkPalindrome(inputString);
        if (isPalindrome) {
            System.out.println("The string is a palindrome.");
        } else {
            System.out.println("The string is not a palindrome.");
        }
    }

    // Helper method to check if a string is a palindrome
    public static boolean checkPalindrome(String str) {
        int n = str.length();
        for (int i = 0; i < n / 2; i++) {
            if (str.charAt(i) != str.charAt(n - i - 1)) {
                return false;
            }
        }
        return true;
    }
}

