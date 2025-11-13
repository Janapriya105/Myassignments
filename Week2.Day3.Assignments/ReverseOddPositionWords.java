package week2.day3.assignments;

public class ReverseOddPositionWords {
    public static void main(String[] args) {
        String test = "I am a software tester";

        // Split the sentence into words
        String[] words = test.split(" ");

        // Traverse through each word
        for (int i = 0; i < words.length; i++) {

            // If the index is odd, reverse the word
            if (i % 2 != 0) {
                // Convert the word to a character array
                char[] chars = words[i].toCharArray();

                // Print the reversed word
                for (int j = chars.length - 1; j >= 0; j--) {
                    System.out.print(chars[j]);
                }
                System.out.print(" "); // Add space after each word
            } else {
                // Even index → print the word as it is
                System.out.print(words[i] + " ");
            }
        }
    }
}

