import java.util.*;

public class StringChain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input: ");
        int n = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        String[] strings = new String[n];
        for (int i = 0; i < n; i++) {
            strings[i] = scanner.next();
        }
        if (canFormCircle(strings)) {
            System.out.println("Output: Yes");
        } else {
            System.out.println("Output: No");
        }
    }

    public static boolean canFormCircle(String[] strings) {
        Map<Character, List<String>> map = new HashMap<>();
        for (String str : strings) {
            char firstChar = str.charAt(0);
            char lastChar = str.charAt(str.length() - 1);
            if (!map.containsKey(firstChar)) {
                map.put(firstChar, new ArrayList<>());
            }
            map.get(firstChar).add(str);
            if (firstChar != lastChar) {
                if (!map.containsKey(lastChar)) {
                    map.put(lastChar, new ArrayList<>());
                }
                map.get(lastChar).add(str);
            }
        }
        return dfs(map, strings[0].charAt(0), new HashSet<>(), strings.length);
    }

    private static boolean dfs(Map<Character, List<String>> map, char startChar, Set<String> visited, int remaining) {
        if (remaining == 0) {
            return true;
        }
        if (!map.containsKey(startChar)) {
            return false;
        }
        for (String str : map.get(startChar)) {
            if (!visited.contains(str)) {
                visited.add(str);
                char nextChar = str.charAt(str.length() - 1);
                if (dfs(map, nextChar, visited, remaining - 1)) {
                    return true;
                }
                visited.remove(str);
            }
        }
        return false;
    }
}