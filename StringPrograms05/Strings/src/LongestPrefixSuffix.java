public class LongestPrefixSuffix {
    public static int largestPrefixSuffix(String str) {
        int n = str.length();
        if (n < 2) {
            return 0;
        }
        int len = 0;
        int i = 0;
        while (i < n / 2) {
            int j1 = 0, j2 = (n - 1) - i;
            int isPrefixSuffix = 1;
            while (j1 <= i) {
                if (str.charAt(j1) != str.charAt(j2)) {
                    isPrefixSuffix = 0;
                }
                j1++;
                j2++;
            }
            if (isPrefixSuffix == 1) {
                len = i + 1;
            }
            i++;
        }
        return len;
    }

    public static void main(String[] args) {
        String s = "aabcdaabc";
        System.out.println(largestPrefixSuffix(s)); // Output: 3
    }
}
