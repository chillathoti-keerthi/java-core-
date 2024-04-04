import java.util.*;

public class SpaceReplacer {
    public static void replaceSpaces(String input) {
        String rep = "%20";
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == ' ')
                input = input.replaceFirst(" ", rep);
        }
        System.out.println(input);
    }

    public static void main(String[] args) {
        String input = "Mr John Smith";
        replaceSpaces(input);
    }
}
