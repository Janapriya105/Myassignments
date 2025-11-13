package week2.day3.assignments;

public class ChangeOddIndex {
    public static void main(String[] args) {
        String test = "changeme";

        // Convert the String into a character array
        char[] charArray = test.toCharArray();

        // Loop through the array from end to start
        for (int i = charArray.length - 1; i >= 0; i--) {

            // Check if the index is odd
            if (i % 2 != 0) {
                // Convert to uppercase if index is odd
                charArray[i] = Character.toUpperCase(charArray[i]);
            }
        }

        // Print the modified characters
        for (char c : charArray) {
            System.out.print(c);
        }
    }
}
