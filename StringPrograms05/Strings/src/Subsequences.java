import java.util.*;

public class Subsequences {
    public static void printSubsequence(String input, String output) {
        if (input.isEmpty()) {
            System.out.println(output);
            return;
        }
        // Include the first character
        printSubsequence(input.substring(1), output + input.charAt(0));
        // Exclude the first character
        printSubsequence(input.substring(1), output);
    }

    public static void main(String[] args) {
        String input = "abc";
        printSubsequence(input, "");
    }
}
