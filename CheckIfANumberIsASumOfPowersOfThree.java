package leetcode;

public class CheckIfANumberIsASumOfPowersOfThree {
	public static void main(String[] args) {
		System.out.println(checkPowersOfThree(91));
		System.out.println(checkPowersOfThree(12));
		System.out.println(checkPowersOfThree(21));
	}

	public static boolean checkPowersOfThree(int n) {
		
		while (n != 0) {
			if (n % 3 == 2) {
				return false;
			}
			n /= 3;
		}
		
		return true;
	}
}
