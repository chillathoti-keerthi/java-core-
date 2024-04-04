import java.util.*;

public class StringSplitter {

    // Function to check if the string can be split into four distinct strings
    public static boolean canSplit(String s) {
        if (s.length() >= 10) {
            // If the length is 10 or more, we can always split into four parts
            return true;
        }

        // Brute force approach for strings with length less than 10
        for (int i = 1; i < s.length(); i++) {
            for (int j = i + 1; j < s.length(); j++) {
                for (int k = j + 1; k < s.length(); k++) {
                    String s1 = s.substring(0, i);
                    String s2 = s.substring(i, j);
                    String s3 = s.substring(j, k);
                    String s4 = s.substring(k);

                    // Check if all substrings are distinct
                    if (!s1.equals(s2) && !s1.equals(s3) && !s1.equals(s4)
                            && !s2.equals(s3) && !s2.equals(s4) && !s3.equals(s4)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        String input = "Hello World"; // Replace with your input string
        if (canSplit(input)) {
            System.out.println("Yes, the string can be split into four distinct strings.");
        } else {
            System.out.println("No, the string cannot be split into four distinct strings.");
        }
    }
}
