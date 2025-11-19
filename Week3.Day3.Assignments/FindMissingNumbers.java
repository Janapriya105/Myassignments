package week3.day3.assignments;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

   public class FindMissingNumbers {
	   public static void main(String[] args) {

	        // Declare the array
	        int[] arr = {1, 2, 3, 4, 10, 6, 8};

	        // Convert array to List
	        List<Integer> numbers = new ArrayList<>();
	        for (int num : arr) {
	            numbers.add(num);
	        }

	        // Step 1: Arrange in ascending order
	        Collections.sort(numbers);

	        System.out.println("Sorted List: " + numbers);
	        System.out.println("Missing Numbers:");

	        // Step 2: Loop and compare current + 1 with next element
	        for (int i = 0; i < numbers.size() - 1; i++) {

	            int current = numbers.get(i);
	            int next = numbers.get(i + 1);

	            // If the difference is more than 1, gap exists
	            if (current + 1 != next) {

	                // Print all numbers between current and next
	                for (int missing = current + 1; missing < next; missing++) {
	                    System.out.println(missing);
	                }
	            }
	        }
	    }
	}
   

	
