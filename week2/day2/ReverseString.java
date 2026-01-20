package week2.day2;

public class ReverseString {
	public static void main(String[] args) {
        // Input string
        String companyName = "TestLeaf";
        
        // Convert string to character array
        char[] charArray = companyName.toCharArray();
        
        // Loop through characters from end to start
        System.out.print("Reversed String: ");
        for (int i = charArray.length - 1; i >= 0; i--) {
            System.out.print(charArray[i]);
        }
    }
}
	

	