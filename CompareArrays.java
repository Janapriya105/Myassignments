package assignments;

public class CompareArrays {

    public static void main(String[] args) {
        // Step 1: Declare two arrays
        int[] a = {3, 2, 11, 4, 6, 7};
        int[] b = {1, 2, 8, 4, 9, 7};

        // Step 2: Use nested loops to compare elements
        for (int i = 0; i < a.length; i++) {            // Outer loop for first array
            for (int j = 0; j < b.length; j++) {        // Inner loop for second array
                // Step 3: Compare elements
                if (a[i] == b[j]) {
                    // Step 4: Print matching element
                    System.out.println("Matching element: " + a[i]);
                }
            }
        }
    }
}

