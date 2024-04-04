import java.util.Scanner;

public class Marks {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter percentage marks:");
        double percentage = scan.nextDouble();

        if (percentage >= 60) {
            System.out.println("A Grade");
        } else if (percentage >= 45) {
            System.out.println("B Grade");
        } else if (percentage >=35) {
            System.out.println("C Grade");
        } else {
            System.out.println("Failed!");
        }
    }
}
