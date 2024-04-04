import java.util.Scanner;

public class LastNVowelCounter {
    
    // Function to count vowels in a string
    public static int countVowels(String str) {
        int count = 0;
        str = str.toLowerCase(); // Convert to lowercase to handle both cases
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                count++;
            }
        }
        return count;
    }

    // Function to count last 'n' vowels in a string
    public static String lastNVowels(String str, int n) {
        int vowelsCount = countVowels(str);
        if (n > vowelsCount) {
            return "Mismatch in Vowel Count";
        }
        StringBuilder result = new StringBuilder();
        int vowelCounter = 0;
        for (int i = str.length() - 1; i >= 0; i--) {
            char ch = str.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                result.insert(0, ch); // Insert at the beginning to reverse the order
                vowelCounter++;
                if (vowelCounter == n) {
                    break;
                }
            }
        }
        return result.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string:");
        String input = scanner.nextLine();
        System.out.println("Enter the number of last vowels to count:");
        int n = scanner.nextInt();
        String result = lastNVowels(input, n);
        System.out.println("Output:");
        System.out.println(result);
        scanner.close();
    }
}