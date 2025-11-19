package week3.day3.assignments;

import java.util.Arrays;

public class SecondLargestNumber {

    public static void main(String[] args) {

        // Declare the array
        int[] arr = {3, 2, 11, 4, 6, 7};

        // Sort the array in ascending order
        Arrays.sort(arr);

        // Pick the 2nd element from the last
        int secondLargest = arr[arr.length - 2];

        // Print the result
        System.out.println("Second Largest Number: " + secondLargest);
    }
}

