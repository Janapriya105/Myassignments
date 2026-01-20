package week3.day4;

import java.util.LinkedHashSet;
import java.util.Set;

public class UniqueCharacters {
    public static void main(String[] args) {
        String companyName = "google";

        Set<Character> uniqueChars = new LinkedHashSet<>();

        for (char ch : companyName.toCharArray()) {
            uniqueChars.add(ch);
        }

        for (char ch : uniqueChars) {
            System.out.print(ch);
        }
    }
}

	
