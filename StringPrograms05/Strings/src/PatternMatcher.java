import java.util.*;

public class PatternMatcher {
    public static String encodeString(String pattern) {
        Map<Character, Integer> map = new HashMap<>();
        StringBuilder res = new StringBuilder();

        for (char ch : pattern.toCharArray()) {
            if (!map.containsKey(ch)) {
                map.put(ch, map.size());
            }
            res.append(map.get(ch));
        }

        return res.toString();
    }

    public static List<String> findMatchingWords(String[] dictionary, String pattern) {
        List<String> result = new ArrayList<>();
        String hashPattern = encodeString(pattern);

        for (String word : dictionary) {
            if (word.length() == pattern.length()) {
                String hashWord = encodeString(word);
                if (hashWord.equals(hashPattern)) {
                    result.add(word);
                }
            }
        }

        return result;
    }

    public static void main(String[] args) {
        String[] dictionary = { "abb", "abc", "xyz", "xyy" };
        String pattern = "foo";

        List<String> matchingWords = findMatchingWords(dictionary, pattern);
        System.out.println("Words matching the pattern: " + matchingWords);
    }
}
