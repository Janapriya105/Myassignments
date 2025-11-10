package assignments;

public class Palindrome {

    public static void main(String[] args) {

        int input = 121;  // You can change this value to test other numbers
        int output = 0;   // To store the reversed number
        int rem;          // To store the remainder
        int temp = input; // Preserve original input value for comparison

        // Reverse the number using a for loop
        for (int i = input; i > 0; i = i / 10) {
            rem = i % 10;              // Get the last digit
            output = (output * 10) + rem;  // Build the reversed number
        }

        // Check if the original and reversed numbers are the same
        if (temp == output) {
            System.out.println(input + " is a Palindrome.");
        } else {
            System.out.println(input + " is NOT a Palindrome.");
        }
    }
}

