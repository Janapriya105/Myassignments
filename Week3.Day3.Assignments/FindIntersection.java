package week3.day3.assignments;

import java.util.ArrayList;
import java.util.List;

public class FindIntersection {

    public static void main(String[] args) {

        // Declare the arrays
        int[] arr1 = {3, 2, 11, 4, 6, 7};
        int[] arr2 = {1, 2, 8, 4, 9, 7};

        // Create Lists
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();

        // Add array elements to List 1
        for (int num : arr1) {
            list1.add(num);
        }

        // Add array elements to List 2
        for (int num : arr2) {
            list2.add(num);
        }

        System.out.println("Intersecting Numbers:");

        // Compare the values
        for (int i = 0; i < list1.size(); i++) {

            // Check if list2 contains the current element of list1
            if (list2.contains(list1.get(i))) {
                System.out.println(list1.get(i));
            }
        }
    }
}

