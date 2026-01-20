package week2.day2;

import java.util.Arrays;

public class FindDups {

    public static void main(String[] args) {
        int[] num = {2, 5, 7, 7, 5, 9, 2, 3};

        // Sort the array
        Arrays.sort(num);

        System.out.println("Duplicate values in the array are:");

        for (int i = 0; i < num.length - 1; i++) {
            if (num[i] == num[i + 1]) {
                System.out.println(num[i]);
                // Skip over duplicates to avoid printing the same number multiple times
                while (i < num.length - 1 && num[i] == num[i + 1]) {
                    i++;
                }
            }
        }
    }
}
