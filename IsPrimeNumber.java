package assignments;

public class IsPrimeNumber {

    public static void main(String[] args) {
        int n = 29; // You can change this number to test others
        boolean isPrime = true;

        // Prime numbers are greater than 1
        if (n <= 1) {
            isPrime = false;
        } else {
            // Check divisibility from 2 to n-1
            for (int i = 2; i < n; i++) {
                if (n % i == 0) {
                    isPrime = false;
                    break; // Exit loop once a divisor is found
                }
            }
        }

        // Print result
        if (isPrime) {
            System.out.println(n + " is a Prime number.");
        } else {
            System.out.println(n + " is NOT a Prime number.");
        }
    }
}

