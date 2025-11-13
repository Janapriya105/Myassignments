package week2.day3.assignments;

public class RemoveDuplicateWords {
    public static void main(String[] args) {
        String text = "We learn Java basics as part of java sessions in java week1";

        // Split the text into an array of words
        String[] words = text.split(" ");

        // Initialize count variable
        int count = 0;

        // Compare each word with every other word
        for (int i = 0; i < words.length; i++) {
            if (words[i].equals("")) continue; // Skip already cleared words
            for (int j = i + 1; j < words.length; j++) {

                // Case-insensitive comparison
                if (words[i].equalsIgnoreCase(words[j])) {
                    // Replace duplicate with empty string
                    words[j] = "";
                    count++;
                }
            }
        }

        // If duplicates were found, print the modified array
        if (count > 0) {
            System.out.println("Modified sentence after removing duplicates:");

            for (String word : words) {
                if (!word.equals("")) {
                    System.out.print(word + " ");
                }
            }
        } else {
            System.out.println("No duplicate words found.");
        }
    }
}

