package assignments;

public class FindMissingElement {

    public static void main(String[] args) {
        int[] arr = {1, 4, 3, 2, 8, 6, 7};

        
        java.util.Arrays.sort(arr);

        
        for (int i = arr[0]; i <= arr[arr.length - 1]; i++) {
            boolean found = false;

            
            for (int j = 0; j < arr.length; j++) {
                if (arr[j] == i) {
                    found = true;
                    break;
                }
            }

            
            if (!found) {
                System.out.println("Missing Number: " + i);
                break;
            }
        }
    }
}
	