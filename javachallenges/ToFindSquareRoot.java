package javachallenges;

public class ToFindSquareRoot {

	public static void main(String[] args) {
		int num = 4;
		int sqrt = 0;

		for (int i = 1; i <= num; i++) {
		    if (i * i > num) {
		        break;
		    }
		    sqrt = i;
		}
		System.out.println("The square root of given number is : " +sqrt);
	}

}
