public class Combinations {

    // Print all combinations of size r in an array of size n
    static void printCombinations(int[] arr, int n, int r) {
        int[] data = new int[r];
        combinationUtil(arr, data, 0, n - 1, 0, r);
    }

    // Recursive function to generate combinations
    static void combinationUtil(int[] arr, int[] data, int start, int end, int index, int r) {
        if (index == r) {
            // Print the combination
            for (int j = 0; j < r; j++) {
                System.out.print(data[j] + " ");
            }
            System.out.println();
            return;
        }

        // Replace index with all possible elements
        for (int i = start; i <= end && end - i + 1 >= r - index; i++) {
            data[index] = arr[i];
            combinationUtil(arr, data, i + 1, end, index + 1, r);
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        int r = 2; // Length of combinations
        int n = arr.length;
        printCombinations(arr, n, r);
    }
}
