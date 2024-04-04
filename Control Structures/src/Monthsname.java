import java.util.Scanner;

public class Monthsname {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number between 1 and 12:");
        int n = sc.nextInt();

        // Array of month names
        String[] s = new String[] {
            "January", "February", "March", "April", "May", "June",
            "July", "August", "September", "October", "November", "December", "InvalidNumber"
        };

        // Check if the input is valid
        if (n >= 1 && n <= 12) {
            System.out.println("Month: " + s[n - 1]);
        } else {
            System.out.println("Invalid input. Please enter a number between 1 and 12.");
        }
    }
}
