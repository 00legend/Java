import java.util.Arrays;

public class SimpleArraySort {
    public static void main(String[] args) {
        int[] arr = {5, 3, 8, 1, 2};

        // Printing the original array
        System.out.println("Original Array: " + Arrays.toString(arr));

        // Sorting the array
        Arrays.sort(arr);

        // Printing the sorted array
        System.out.println("Sorted Array: " + Arrays.toString(arr));
    }
}

