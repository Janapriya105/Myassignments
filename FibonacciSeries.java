package assignments;

import java.util.Scanner;

public class FibonacciSeries {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the range1,2,3: ");
        int range = sc.nextInt();

        int first = 0, second = 1;

        System.out.print("Fibonacci Series up to " + range + ": ");

        // Print the first two numbers
        System.out.print(first + ", " + second);

        int next = first + second;

        // Continue until the next number exceeds the given range
        while (next <= range) {
            System.out.print(", " + next);
            first = second;
            second = next;
            next = first + second;
        }

        sc.close();
    }
}
