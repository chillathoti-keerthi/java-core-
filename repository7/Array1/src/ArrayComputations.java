public class ArrayComputations {
    public static void main(String[] args) {
        int[] A = {3, 2, 4, 5, 6, 4, 5, 7, 3, 2, 3, 4, 7, 1, 2, 0, 0, 0};

        // a. Compute the sum of elements from index 0 to 14 and store it at element 15.
        int sum = 0;
        for (int i = 0; i < 15; i++) {
            sum += A[i];
        }
        A[15] = sum;

        // b. Compute the average of all numbers and store it at element 16.
        A[16] = sum / 15;

        // c. Identify the smallest value from the array and store it at element 17.
        int smallest = A[0];
        for (int i = 1; i < 15; i++) {
            if (A[i] < smallest) {
                smallest = A[i];
            }
        }
        A[17] = smallest;

        // Output the modified array
        for (int value : A) {
            System.out.print(value + " ");
        }
    }
}